package augustus.recovered.modules.player;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
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
import net.C_42a;
import net.C_435;
import net.C_43B;
import net.C_43F;
import net.C_43J;
import net.C_43N;
import net.C_43R;
import net.C_43S;
import net.C_43r;
import net.C_43u;
import net.C_45S;
import net.C_45U;
import net.C_45V;
import net.C_45Y;
import net.C_45n;
import net.C_45o;
import net.C_462;
import net.C_470d;
import net.C_471Q;
import client.render.RenderPass;
import net.C_473X;
import net.C_474k;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Fw;
import net.C_47KL;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import net.C_47Oh;
import client.module.ModuleManager;
import client.setting.ShaderOptions;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.Setting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.setting.RangeSetting;
import net.C_47Tx;
import client.event.RenderListener;
import net.C_47cu;
import net.C_47gG;
import net.minecraft.client.Minecraft;
import net.C_47ph;
import client.ClientGlobals;
import net.C_47rf;
import client.render.RenderUtils;
import net.C_47sT;
import client.module.Category;
import net.C_47uI;
import net.C_47v_;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ChestStealer_47Qs extends client.module.Module implements net.C_47xz,client.event.RenderListener {
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingStartDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInstant = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaxMouseMoveSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMouseMoveRandom = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCPSRecalculate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDoubleClickRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingFailRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMissClickRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCPSNew = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCPSRecalculateNew = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDoubleClickRateNew = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSideStopTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingEmptySlotFailRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRemoveEmptyRows = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingClickWindow = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingIntelligent = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingItemBlackList = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAutoSort = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAutoClose = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAutoCloseIfInvFull = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCloseDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingChestOpenTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingVisualize = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingWhereToSteal = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSequence = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingClickMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingToggleStorageESP = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingToggleChestAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47Tx settingChestStorage = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSilent = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingStealIndicator = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingBackGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingBackGroundColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_41j = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_41I = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_41T = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_41l = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_41O = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_415 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_41A = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_41y = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_41d = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_41i = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_41H = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.ArrayList field_413; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.ArrayList field_41q; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_471Q field_41_ = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private boolean method_49A$aae029aa0a() {
      long var1 = a ^ 80796011167204L;
      long var10000 = 5080845777551813983L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 5095264189266638140L;
      BooleanSetting var4 = this.settingInstant;
      boolean var6 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (var6) {
            return false;
         }

         var10001 = 5080454198936197799L;
         ChestStealer_47Qs var5 = this;
         var6 = var5.method_49f$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_49Y$aae029aa0a() {
      long var1 = a ^ 57787956316224L;
      long var10000 = -925850751017395973L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = -931543369215049576L;
      BooleanSetting var4 = this.settingInstant;
      boolean var6 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (var6) {
            return false;
         }

         var10001 = -926303532919066877L;
         ChestStealer_47Qs var5 = this;
         var6 = var5.method_49f$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private void method_46$e9010d0a3b(int var1, net.C_47ph var2, int var3, long var4) {
        int var27;
      long var6 = ((long)var3 << 32 | var4 << 32 >>> 32) ^ a;
      long var8 = var6 ^ 135112458793781L;
      long var10 = var6 ^ 64272587834001L;
      net.C_47sT var13 = var2.field_46M.method_46$4c10532da1(var1);
      long var10000 = -8699144727510874833L;
      byte var26 = ((byte) (AirStuck_47Q4.method_45$aae029aa0a() ? 1 : 0));
      long var10005 = -8685159871467311572L;
      int var16 = var1;
      net.C_47gG var17 = var2.field_46M;
      long var18 = var8;
      ChestStealer_47Qs var20 = this;
      var20.method_41$4c1b05eebb(var18, var17, var16);
      byte var12 = var26;

      try {
         long var10002 = -8687168677260488350L;
         long var21 = var10;
         client.setting.ModeSetting var23 = this.settingClickMode;
         String var14 = var23.method_46$5f9dc63072(var21);
         byte var15 = -1;
         var27 = var14.hashCode();
         label60:
         if (var12 != 0) {
            label92: {
               label81: {
                  label93: {
                     switch (var27) {
                        case 63955982:
                           short var10001 = 901;
                           var10002 = 3217695416525522738L ^ var6;
                           var27 = ((var14.equals("Basic")) ? 1 : 0);
                           if (var12 == 0) {
                              break label60;
                           }

                           if (var27 == 0) {
                              break label92;
                           }

                           var15 = 0;
                           var27 = var12;
                           if (var3 <= 0) {
                              break;
                           }

                           if (var12 != 0) {
                              break label92;
                           }
                        case 76517104:
                           short var30 = 10477;
                           var10002 = 4114032503813745773L ^ var6;
                           var27 = ((var14.equals("Other")) ? 1 : 0);
                           break;
                        case 355504491:
                           break label93;
                        default:
                           break label92;
                     }

                     if (var12 == 0) {
                        break label60;
                     }

                     if (var27 == 0) {
                        break label92;
                     }

                     var15 = 1;
                     var27 = var12;
                     if (var3 <= 0) {
                        break label81;
                     }

                     if (var12 != 0) {
                        break label92;
                     }
                  }

                  short var31 = 21770;
                  var10002 = 3545081160022053273L ^ var6;
                  var27 = ((var14.equals("Exploit")) ? 1 : 0);
               }

               if (var12 == 0) {
                  break label60;
               }

               if (var27 != 0) {
                  var15 = 2;
               }
            }

            var27 = var15;
         }

         switch (var27) {
            case 0:
               var2.field_42 = true;
               var2.method_47$23922dd444(var13.field_40 + 2 + var2.field_46c, var13.field_46 + 2 + var2.field_433, 0);
               if (var3 <= 0) {
                  return;
               }

               if (var12 != 0) {
                  break;
               }
            case 1:
               var10000 = -8685845168050784834L;
               client.Client.method_44$fbc0c0be91().getClass();
               if (var4 <= 0L) {
                  return;
               }

               if (var12 != 0) {
                  break;
               }
            case 2:
               var10000 = -8685845168050784834L;
               client.Client.method_44$fbc0c0be91().getClass();
         }

         long var32 = -8685515847950886765L;
         ChestStealer_47Qs var24 = this;
         var24.method_43$da8c82d5d4();
      } catch (java.io.IOException var25) {
      }
   }




   private void method_46$45e3c2cbfe(
      ArrayList var1,
      ArrayList var2,
      C_474k var3,
      RangeSetting var4,
      int var5,
      short var6,
      RangeSetting var7,
      RangeSetting var8,
      C_47gG var9,
      C_47ph var10,
      int var11,
      boolean var12,
      int var13,
      int var14
   ) {
      boolean var38;
      byte var44;
      java.lang.Object var40;
      augustus.recovered.modules.player.ChestStealer_47Qs var41;
      long var15 = ((long)var5 << 32 | (long)var6 << 48 >>> 32 | (long)var11 << 48 >>> 48) ^ a;
      long var17 = var15 ^ 46193393277626L;
      long var19 = var15 ^ 45707552545565L;
      long var21 = var15 ^ 24391406985441L;
      long var23 = var15 ^ 85605252083535L;
      long var10001 = var15 ^ 17182869807474L;
      int var25 = (int)((var15 ^ 17182869807474L) >>> 32);
      int var26 = (int)((var15 ^ 17182869807474L) << 32 >>> 48);
      int var27 = (int)(var10001 << 48 >>> 48);
      var10001 = var15 ^ 75303742989250L;
      int var28 = (int)((var15 ^ 75303742989250L) >>> 48);
      int var29 = (int)((var15 ^ 75303742989250L) << 16 >>> 32);
      int var30 = (int)(var10001 << 48 >>> 48);
      long var31 = var15 ^ 14203026228129L;
      byte var33 = (byte) ((recovery$indy$1(-1929868073530732822L, var15)) ? 1 : 0);
      int var10000 = (int) ((var12) ? 1 : 0);
      if (var33 == 0) {
         if ((var12 ? 1 : 0) != 0) {
            var1.forEach(recovery$indy$2());
            return;
         }

         var10000 = (int) ((var2.isEmpty()) ? 1 : 0);
      }

      byte var43 = var33;
      if (var5 > 0) {
         if (var33 == 0) {
            if (var10000 == 0) {
               int var10002;
               label164: {
                  var10002 = var2.size();
                  byte var10003 = var33;
                  if (var6 >= 0) {
                     if (var33 != 0) {
                        break label164;
                     }

                     var10003 = 1;
                  }

                  var10002 = var10002 > var10003 ? 1 : 0;
               }

               this.field_437 = (Integer)var2.get(var10002);
            }

            var10000 = (int) ((recovery$indy$3(this, this.field_41O, var7, var31, -1930420138254047511L, var15)) ? 1 : 0);
         }

         var43 = var33;
      }

      if (var43 == 0) {
         if (var10000 != 0) {
            return;
         }

         var10000 = recovery$indy$4(var3, var13, var23, -1942523347248907036L, var15);
      }

      int var34 = var10000;
      boolean var35 = false;

      label155:
      while (true) {
         var10000 = var34;

         label152: {
            while (true) {
               if (var10000 > 0) {
                  var38 = var1.isEmpty();
                  var44 = var33;
                  if (var6 >= 0) {
                     if (var33 != 0) {
                        break;
                     }

                     var44 = var33;
                  }

                  if (var6 < 0) {
                     break label152;
                  }

                  if (var44 != 0) {
                     break;
                  }

                  label145:
                  if (!var38) {
                     label179: {
                        var10000 = (int) ((recovery$indy$5(this, var8, var9, var10, var19, -1942644512149641195L, var15)) ? 1 : 0);
                        if (var33 == 0) {
                           if (var10000 != 0) {
                              var34--;
                              var10000 = var33;
                              if (var11 < 0) {
                                 continue;
                              }

                              if (var33 == 0) {
                                 continue label155;
                              }
                           }

                           var40 = this;
                           int var45 = var33;
                           if (var5 >= 0) {
                              if (var33 != 0) {
                                 break label179;
                              }

                              var45 = var14;
                           }

                           var34 = recovery$indy$6(this, var25, var26, var45, var9, (short)var27, (Integer)var2.get(0), var34, -1930786271511396777L, var15);
                           var10000 = var34;
                        }

                        if (var10000 <= 0) {
                           break label145;
                        }

                        var40 = var1.get(0);
                     }

                     Runnable var36 = (Runnable)var40;
                     var36.run();
                     var35 = true;
                     if (var11 >= 0) {
                        if (var33 == 0) {
                           if (recovery$indy$7(this, this.field_41l, var4, var31, -1930420138254047511L, var15)) {
                              var36.run();
                           }

                           var1.remove(0);
                           var2.remove(0);
                        }

                        var34--;
                     }

                     if (var33 == 0) {
                        continue label155;
                     }
                  }
               }

               if (var11 < 0) {
                  return;
               }

               var38 = var35;
               break;
            }

            var44 = var33;
         }

         label181: {
            if (var44 == 0) {
               if (!var38) {
                  break;
               }

               var41 = this;
               if (var33 != 0) {
                  break label181;
               }

               var38 = recovery$indy$8(this.settingSequence, var21, -1945319439027178734L, var15).equals(recovery$indy$9(28952, 1887428786046506985L ^ var15));
            }

            if (!var38) {
               break;
            }

            var41 = this;
         }

         var41.field_41q = recovery$indy$13(
            var9,
            (short)var28,
            var29,
            (short)var30,
            recovery$indy$10(this, var10, var17, -1943716423173168059L, var15),
            recovery$indy$11(this.settingSequence, var21, -1945319439027178734L, var15),
            recovery$indy$12(this, var9, -1943341250537723586L, var15),
            -1942385314153235032L,
            var15
         );
         break;
      }
   }





    private java.util.ArrayList method_46$47a5431f46(int sourceSlot, long callerKey, net.C_47gG container) {
        long key = recovery$indy$flow$79() ^ callerKey;
        long mergeKey = key ^ 8043510064832L;
        boolean guard = recovery$indy$flow$80(-977133646034740819L, key);
        Object sourceStack = recovery$indy$flow$82(recovery$indy$flow$81(container, sourceSlot));
        if (!guard && sourceStack == null) return new java.util.ArrayList();

        int remainingItems = recovery$indy$flow$85(sourceStack);
        java.util.ArrayList destinations = new java.util.ArrayList();
        int maximumStackSize = recovery$indy$flow$88(sourceStack);
        int inventorySlot;
        if (guard) {
            inventorySlot = maximumStackSize - 1;
        } else {
            if (maximumStackSize > 1) {
                java.util.ArrayList mergeTargets = (java.util.ArrayList) recovery$indy$flow$89(this, sourceStack, container, mergeKey, -977233397869722969L, key);
                java.util.Iterator iterator = mergeTargets.iterator();
                while (iterator.hasNext()) {
                    Object target = ((java.lang.Object)(((net.C_42a) (((java.lang.Object)(iterator.next()))))));
                    remainingItems -= ((Integer) recovery$indy$flow$94(target, -987784784304559770L, key)).intValue();
                    if (key >= 0L) destinations.add(recovery$indy$flow$97(target, -981855620853164238L, key));
                    if (remainingItems <= 0) return destinations;
                }
            }
            int slotCount = recovery$indy$flow$100(((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(container)))).field_46)));
            inventorySlot = key > 0L ? slotCount - 1 : slotCount;
        }

        while (inventorySlot >= recovery$indy$flow$102(((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(container)))).field_46))) - 36) {
            Object inventoryStack = recovery$indy$flow$104(recovery$indy$flow$103(container, inventorySlot));
            if (key >= 0L && !guard) {
                if (inventoryStack != null) {
                    inventorySlot--;
                    continue;
                }
                destinations.add(Integer.valueOf(inventorySlot));
            }
            if (key > 0L || guard) return destinations;
        }
        return destinations;
    }




    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   private ArrayList method_42$db464fedce(C_47rf var1, C_47gG var2, long var3) {
      var3 = a ^ var3;
      boolean var5 = recovery$indy$18(-5767631825630220900L, var3);
      if (var1.method_44$8abf5c6871() <= 1) {
         return new ArrayList();
      }

      ArrayList var6 = new ArrayList();
      int var7 = var2.field_46.size() - 36;

      while (var7 < var2.field_46.size()) {
         C_47rf var8 = var2.method_46$4c10532da1(var7).method_48$ac4db64966();
         boolean var10000 = var5;
         if (var3 >= 0L) {
            if (var5) {
               label71: {
                  C_47rf var11 = var8;
                  if (var3 > 0L) {
                     if (var8 == null) {
                        break label71;
                     }

                     var11 = var8;
                  }

                  if (var5) {
                     if (var11.field_47 >= var8.method_44$8abf5c6871()) {
                        break label71;
                     }

                     var11 = var8;
                  }

                  C_43r var9 = var11.method_48$dbd570a038();
                  if (var5 && var9.equals(var1.method_48$dbd570a038())) {
                     var6.add(new C_42a(var7, var8.method_44$8abf5c6871() - var8.field_47));
                  }
               }

               var7++;
            }

            var10000 = var5;
         }

         if (!var10000) {
            break;
         }
      }

      return var6;
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_41$4c1b05eebb(long var1, C_47gG var3, int var4) {
      var1 = a ^ var1;
      ScaledResolution var5 = new ScaledResolution(field_43);
      int var6 = (var5.method_46$8abf5c6871() - 176) / 2;
      int var7 = (var5.method_48$8abf5c6871() - recovery$indy$19(this, var3, -3528938278662847681L, var1)) / 2;
      C_47sT var8 = var3.method_46$4c10532da1(var4);
      recovery$indy$20(new double[]{var8.field_40 + 2 + var6, var8.field_46 + 2 + var7}, -3523213262725008813L, var1);
      recovery$indy$21(var4, -3526689121607265448L, var1);
   }



   private void method_41$b98603d5ac(int var1, int var2, long var3, net.C_47ph var5) {
      var3 = a ^ var3;
      long var6 = var3 ^ 45280280248058L;
      long var8 = var3 ^ 116240368324446L;
      long var10000 = 759206427428915424L;
      boolean var10 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = 759492548746052736L;
      net.minecraft.client.Minecraft var14 = field_43;
      net.C_47rf var11 = var14.field_42P.field_429.method_46$4c10532da1(var1 + 36).method_48$ac4db64966();
      int var138 = ((int) (var10 ? 1 : 0));
      if (!(var138 != 0)) {
         long var206 = 774524378844339373L;
         long var142 = var8;
         client.setting.ModeSetting var143 = this.settingClickMode;
         String var140 = var143.method_46$5f9dc63072(var142);
         byte var141 = -1;
         int var172 = var140.hashCode();
         var138 = var172;
         switch (var138) {
            case 0:
               var10000 = 773209674363353201L;
               client.Client.method_44$fbc0c0be91().getClass();
               long var209;
               var138 = (var209 = var3 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
               if (var138 > 0) {
                  var10001 = 772474835569347589L;
                  net.minecraft.client.Minecraft var145 = field_43;
                  long var208 = 759492548746052736L;
                  net.minecraft.client.Minecraft var147 = field_43;
                  var145.field_44K.method_42$f0ddb617a2(var5.field_46M.field_43, var2, var1, 2, var147.field_42P);
                  var10001 = 772801189376169308L;
                  ChestStealer_47Qs var152 = this;
                  var152.method_43$da8c82d5d4();
               }
               break;
            case 1:
            case 2:
               var10001 = 772474835569347589L;
               net.minecraft.client.Minecraft var144 = field_43;
               long var207 = 759492548746052736L;
               net.minecraft.client.Minecraft var146 = field_43;
               var144.field_44K.method_42$f0ddb617a2(var5.field_46M.field_43, var2, var1, 2, var146.field_42P);
               var10001 = 772801189376169308L;
               ChestStealer_47Qs var151 = this;
               var151.method_43$da8c82d5d4();
               break;
            default:
               var10001 = 772801189376169308L;
               ChestStealer_47Qs var150 = this;
               var150.method_43$da8c82d5d4();
         }
      } else {
         label157: {
            long var210;
            var138 = (var210 = var3 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
            net.C_47rf var32 = var11;
            if (var138 > 0) {
               var32 = var32;
               var32 = var32;
               var32 = var32;
               net.C_47rf var177 = var32;
               if (var177 == null) {
                  break label157;
               }

               var32 = var11;
            }

            var32.method_48$d00df7729d(var2);
         }

         long var10004 = 772172516690895843L;
         int var15 = var2;
         net.C_47gG var16 = var5.field_46M;
         long var17 = var6;
         ChestStealer_47Qs var19 = this;
         var19.method_41$4c1b05eebb(var17, var16, var15);
         long var10002 = 774524378844339373L;
         long var20 = var8;
         client.setting.ModeSetting var22 = this.settingClickMode;
         String var12 = var22.method_46$5f9dc63072(var20);
         byte var13 = -1;
         int var26 = var12.hashCode();
         var138 = var26;
         switch (var138) {
            case 63955982:
               boolean var165 = var12.equals("Basic");
               var165 = var165;
               int var187 = ((int) (var165 ? 1 : 0));
               label149:
               if ((var187) != 0) {
                  var13 = 1;
                  long var213;
                  var187 = (var213 = var3 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                  var165 = var10;
                  if (var187 >= 0) {
                     var165 = var165;
                     var165 = var165;
                     boolean var189 = var165;
                     if (var189) {
                        break label149;
                     }

                     var165 = var12.equals("Other");
                  }

                  var165 = var165;
                  boolean var190 = var165;
                  if (var190) {
                     var13 = 2;
                  }
               }
               break;
            case 76517104:
               boolean var163 = var12.equals("Other");
               var163 = var163;
               boolean var186 = var163;
               if (var186) {
                  var13 = 2;
               }
               break;
            case 355504491:
               boolean var153 = var12.equals("Exploit");
               var153 = var153;
               int var179 = ((int) (var153 ? 1 : 0));
               label143:
               if ((var179) != 0) {
                  var13 = 0;
                  long var211;
                  var179 = (var211 = var3 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                  var153 = var10;
                  if (var179 > 0) {
                     var153 = var153;
                     var153 = var153;
                     boolean var181 = var153;
                     if (var181) {
                        break label143;
                     }

                     var153 = var12.equals("Basic");
                  }

                  var153 = var153;
                  int var182 = ((int) (var153 ? 1 : 0));
                  label137:
                  if ((var182) != 0) {
                     var13 = 1;
                     long var212;
                     var182 = (var212 = var3 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                     var153 = var10;
                     if (var182 >= 0) {
                        var153 = var153;
                        var153 = var153;
                        boolean var184 = var153;
                        if (var184) {
                           break label137;
                        }

                        var153 = var12.equals("Other");
                     }

                     var153 = var153;
                     boolean var185 = var153;
                     if (var185) {
                        var13 = 2;
                     }
                  }
               }
         }

         byte var171 = var13;
         int var191 = var171;
         switch (var191) {
            case 0:
               var10000 = 773209674363353201L;
               client.Client.method_44$fbc0c0be91().getClass();
               long var214;
               var191 = (var214 = var3 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
               if (var191 > 0) {
                  var10001 = 772801189376169308L;
                  ChestStealer_47Qs var149 = this;
                  var149.method_43$da8c82d5d4();
               }
               break;
            case 1:
            case 2:
               var10001 = 772474835569347589L;
               net.minecraft.client.Minecraft var23 = field_43;
               long var10006 = 759492548746052736L;
               net.minecraft.client.Minecraft var24 = field_43;
               var23.field_44K.method_42$f0ddb617a2(var5.field_46M.field_43, var2, var1, 2, var24.field_42P);
               var10001 = 772801189376169308L;
               ChestStealer_47Qs var148 = this;
               var148.method_43$da8c82d5d4();
               break;
            default:
               var10001 = 772801189376169308L;
               ChestStealer_47Qs var25 = this;
               var25.method_43$da8c82d5d4();
         }
      }
   }




   private boolean method_41$214fd8f084(C_43r var1, long var2) {
      var2 = a ^ var2;
      boolean var4 = recovery$indy$22(-8378503858127560604L, var2);
      boolean var10000 = var1 instanceof C_45V;
      if (!var4) {
         if (!var10000) {
            var10000 = var1 instanceof C_43u;
            if (var4) {
               return var10000;
            }

            if (!var10000) {
               var10000 = var1 instanceof C_43S;
               if (var4) {
                  return var10000;
               }

               if (!var10000) {
                  var10000 = var1 instanceof C_45S;
                  if (var4) {
                     return var10000;
                  }

                  if (!var10000) {
                     var10000 = var1 instanceof C_45Y;
                     if (var4) {
                        return var10000;
                     }

                     if (!var10000) {
                        var10000 = var1 instanceof C_45U;
                        if (var4) {
                           return var10000;
                        }

                        if (!var10000) {
                           var10000 = var1 instanceof C_435;
                           if (var4) {
                              return var10000;
                           }

                           if (!var10000) {
                              return false;
                           }
                        }
                     }
                  }
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }



   private void method_41$e45a9973e5(long var1) {
      var1 = a ^ var1;
      recovery$indy$23(this.settingCPS, 2080631015561553368L, var1);
      recovery$indy$24(this.settingCPSRecalculate, 2080631015561553368L, var1);
      recovery$indy$25(this.settingMissClickRate, 2080631015561553368L, var1);
      recovery$indy$26(this.settingDoubleClickRate, 2080631015561553368L, var1);
      recovery$indy$27(this.settingFailRate, 2080631015561553368L, var1);
      recovery$indy$28(this.settingStartDelay, 2080631015561553368L, var1);
      recovery$indy$29(this.settingCloseDelay, 2080631015561553368L, var1);
      recovery$indy$30(this.settingChestOpenTime, 2080631015561553368L, var1);
      recovery$indy$31(this.settingCPSNew, 2080631015561553368L, var1);
      recovery$indy$32(this.settingCPSRecalculateNew, 2080631015561553368L, var1);
      recovery$indy$33(this.settingEmptySlotFailRate, 2080631015561553368L, var1);
      recovery$indy$34(this.settingSideStopTicks, 2080631015561553368L, var1);
      recovery$indy$35(this.settingDoubleClickRateNew, 2080631015561553368L, var1);
      this.field_437 = -1;
      this.field_438 = 0;
      this.field_43a = false;
      this.field_43P = false;
      this.field_43h.clear();
      this.field_43W.clear();
      recovery$indy$36(this, 2077994982427722547L, var1);
   }



   private void method_40$02c5939e23(int var1, C_47ph var2) {
      long var3 = a ^ 22739295517418L;
      long var10001 = var3 ^ 35091935439455L;
      int var5 = (int)((var3 ^ 35091935439455L) >>> 32);
      int var6 = (int)((var3 ^ 35091935439455L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      char var10005 = (char)var7;
      long var10006 = -9100288607907534111L;
      char var8 = var10005;
      int var9 = var6;
      C_47ph var10 = var2;
      int var11 = var5;
      int var12 = var1;
      ChestStealer_47Qs var13 = this;
      var13.method_43$2f0d40f3a9(var12, var11, var10, var9, var8);
   }



    private void method_40$458abe43d5(long callerKey, net.C_47ph screen) {
        long key = recovery$indy$flow$226() ^ callerKey;
        long readyKey = key ^ 25249127191681L;
        long finishKey = key ^ 29574395142155L;
        long slotsKey = key ^ 28753222959971L;
        long timerKey = key ^ 26151855095764L;
        long orderKey = key ^ 92146072830276L;
        long countKey = key ^ 9558105560325L;
        long actionKey = key ^ 80814298495467L;
        Object inventory = ((java.lang.Object)(((net.C_47ph) (((java.lang.Object)(screen)))).field_46M));
        boolean guard = recovery$indy$flow$228(6880935479601919136L, key);
        Object availableSlots = recovery$indy$flow$230(orderKey, recovery$indy$flow$229(this, screen, slotsKey, 6863613573512462274L, key), 6868344454224324380L, key);
        recovery$indy$flow$231(availableSlots);
        java.util.ArrayList actions = new java.util.ArrayList();
        java.util.ArrayList slotIndexes = new java.util.ArrayList();
        Object iterator = recovery$indy$flow$236(availableSlots);
        int slot = 0;
        int remaining = 0;
        boolean syntheticSlot = false;
        while (true) {
            if (!syntheticSlot) {
                if (recovery$indy$flow$237(iterator)) {
                    slot = recovery$indy$flow$240(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$238(iterator))))))));
                } else {
                    boolean ready = recovery$indy$flow$245(this, actions, readyKey, 6867654784797159021L, key);
                    if (key > 0L) {
                        if (guard) {
                            remaining = ready ? 1 : 0;
                        } else {
                            if (ready) return;
                            recovery$indy$flow$246(this, true);
                            Object rate = ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).field_49));
                            int interval = recovery$indy$flow$249(((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingCPSNew)), 6865836503297040119L, key);
                            remaining = recovery$indy$flow$250(rate, interval, countKey, 6863626725604705966L, key);
                        }
                        break;
                    }
                    slot = ready ? 1 : 0;
                    syntheticSlot = true;
                }
            }
            recovery$indy$flow$242(actions, recovery$indy$flow$241(this, slot, screen));
            recovery$indy$flow$244(slotIndexes, recovery$indy$flow$243(slot));
            if (guard && key >= 0L) {
                Object rate = ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).field_49));
                int interval = recovery$indy$flow$249(((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingCPSNew)), 6865836503297040119L, key);
                remaining = recovery$indy$flow$250(rate, interval, countKey, 6863626725604705966L, key);
                break;
            }
            if (guard) {
                slot = recovery$indy$flow$245(this, actions, readyKey, 6867654784797159021L, key) ? 1 : 0;
                syntheticSlot = true;
            } else {
                syntheticSlot = false;
            }
        }
        boolean batch = recovery$indy$flow$252(((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingInstant)), 6866080425606425795L, key);
        if (guard) {
            if (batch) {
                int guardedSlot = recovery$indy$flow$256(actions) ? 1 : 0;
                recovery$indy$flow$309(recovery$indy$flow$308(inventory, guardedSlot));
            }
            recovery$indy$flow$315(this, finishKey, 6867917699540993566L, key);
            return;
        }
        if (batch) {
            recovery$indy$flow$254(actions, recovery$indy$flow$253());
            recovery$indy$flow$255(this, finishKey, 6867917699540993566L, key);
            return;
        }
        while (remaining > 0 && !recovery$indy$flow$256(actions)) {
            int firstSlot = recovery$indy$flow$259(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$257(slotIndexes, 0))))))));
            int row = (int) ((double) firstSlot / 9.0D);
            if (row != recovery$indy$flow$260(this)) {
                Object timer = ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).field_41i));
                int interval = recovery$indy$flow$263(((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingSideStopTicks)), 6865836503297040119L, key);
                boolean elapsed = recovery$indy$flow$264(timer, timerKey, interval, 6864770140321584531L, key);
                if (!elapsed) {
                    if (recovery$indy$flow$266(((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingClickWindow)), 6866080425606425795L, key)) {
                        if (recovery$indy$flow$269(this, ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).field_47)), ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingDoubleClickRateNew)), actionKey, 6881360001513020579L, key)) {
                            Object controller = recovery$indy$flow$271(recovery$indy$flow$270(), 6867245305053075952L, key);
                            int window = recovery$indy$flow$273(((java.lang.Object)(((net.C_47ph) (((java.lang.Object)(screen)))).field_46M)));
                            Object player = recovery$indy$flow$275(recovery$indy$flow$274(), 6881351312642068853L, key);
                            recovery$indy$flow$276(controller, window, -999, 0, 4, player);
                        }
                    }
                    if (recovery$indy$flow$278(((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingClickWindow)), 6866080425606425795L, key)) {
                        Object controller = recovery$indy$flow$280(recovery$indy$flow$279(), 6867245305053075952L, key);
                        int window = recovery$indy$flow$282(((java.lang.Object)(((net.C_47ph) (((java.lang.Object)(screen)))).field_46M)));
                        Object player = recovery$indy$flow$284(recovery$indy$flow$283(), 6881351312642068853L, key);
                        recovery$indy$flow$285(controller, window, -999, 0, 4, player);
                    }
                    remaining--;
                    continue;
                }
                recovery$indy$flow$287(((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingSideStopTicks)), 6865130582061655618L, key);
            }
            recovery$indy$flow$288(this, row);
            recovery$indy$flow$290(((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).field_41i)), 6868451660100884883L, key);
            if (recovery$indy$flow$293(((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).field_43W)), recovery$indy$flow$292(firstSlot))) {
                recovery$indy$flow$294(actions, 0);
                recovery$indy$flow$295(slotIndexes, 0);
                recovery$indy$flow$298(((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).field_43h)), recovery$indy$flow$297(firstSlot));
                recovery$indy$flow$315(this, finishKey, 6867917699540993566L, key);
                return;
            }
            recovery$indy$flow$301(((java.lang.Object)(((java.lang.Runnable) (((java.lang.Object)(recovery$indy$flow$299(actions, 0))))))));
            if (recovery$indy$flow$304(this, ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).field_47)), ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingDoubleClickRateNew)), actionKey, 6881360001513020579L, key)) {
                recovery$indy$flow$307(((java.lang.Object)(((java.lang.Runnable) (((java.lang.Object)(recovery$indy$flow$305(actions, 0))))))));
            }
            Object stack = recovery$indy$flow$309(recovery$indy$flow$308(inventory, firstSlot));
            if (stack == null) recovery$indy$flow$312(((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).field_43h)), recovery$indy$flow$311(firstSlot));
            remaining--;
            recovery$indy$flow$313(actions, 0);
            recovery$indy$flow$314(slotIndexes, 0);
        }
        recovery$indy$flow$315(this, finishKey, 6867917699540993566L, key);
    }






   private boolean method_49C$aae029aa0a() {
      long var1 = a ^ 31375748698439L;
      long var10000 = 3035537450431883337L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = 3036046134975641092L;
      ChestStealer_47Qs var4 = this;
      boolean var5 = var4.method_49f$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_49Z$aae029aa0a() {
      long var1 = a ^ 41095306763233L;
      long var10000 = 6955710991743503194L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 6968036001317098297L;
      BooleanSetting var4 = this.settingInstant;
      boolean var6 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (var6) {
            return false;
         }

         var10001 = 6954694954960157858L;
         ChestStealer_47Qs var5 = this;
         var6 = var5.method_49f$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_497$aae029aa0a() {
      long var1 = a ^ 20156124460588L;
      long var10000 = 5569423866237609623L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 5569049493255737711L;
      ChestStealer_47Qs var4 = this;
      boolean var5 = var4.method_49f$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_49b$aae029aa0a() {
      long var1 = a ^ 36106083012223L;
      long var10000 = -5397465859629729935L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -5391536194355312985L;
      BooleanSetting var4 = this.settingInstant;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3) {
         if (var6) {
            return false;
         }

         var10001 = -5396984159359981252L;
         ChestStealer_47Qs var5 = this;
         var6 = var5.method_49f$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   private boolean method_44$fddaaabe4c(RangeSetting var1, C_47gG var2, C_47ph var3, long var4) {
      var4 = a ^ var4;
      int var6 = (int)((var4 ^ 6363791800685L) >>> 32);
      long var7 = (var4 ^ 6363791800685L) << 32 >>> 32;
      long var9 = var4 ^ 35158561760248L;
      boolean var11 = recovery$indy$60(391622666204874502L, var4);
      int var10000 = recovery$indy$61(384399995515163651L, var4);
      if (var11) {
         label104:
         if (var10000 > 0) {
            C_47sT var12 = var2.method_46$4c10532da1(recovery$indy$62(384399995515163651L, var4));
            int var13 = var12.field_40;
            int var14 = var12.field_46;
            double var15 = Double.MAX_VALUE;
            int var17 = -1;
            int var18 = 5;

            while (var18 < var2.field_46.size()) {
               C_47rf var19 = var2.method_46$4c10532da1(var18).method_48$ac4db64966();
               int var26 = (int) ((var11) ? 1 : 0);
               if (var4 > 0L) {
                  if (!var11) {
                     break label104;
                  }

                  var26 = (int) ((var11) ? 1 : 0);
               }

               label98: {
                  label97:
                  if ((var26) != 0) {
                     label95:
                     if (var19 == null) {
                        var26 = var18;
                        int var10001 = recovery$indy$63(384399995515163651L, var4);
                        if (var11) {
                           if (var18 == var10001) {
                              break label95;
                           }

                           var26 = var18;
                           var10001 = var17;
                        }

                        label89:
                        if (var26 != var10001) {
                           C_47sT var20 = var2.method_46$4c10532da1(var18);
                           int var21 = var13 - var20.field_40;
                           int var22 = var14 - var20.field_46;
                           double var23 = Math.sqrt(var21 * var21 + var22 * var22);
                           var26 = (int) ((var11) ? 1 : 0);
                           if (var4 <= 0L) {
                              break label98;
                           }

                           if (!var11) {
                              break label97;
                           }

                           double var30;
                           var26 = (var30 = var23 - var15) == 0.0 ? 0 : (var30 < 0.0 ? -1 : 1);
                           if (var4 > 0L) {
                              if (var26 >= 0) {
                                 break label89;
                              }

                              var15 = var23;
                              var26 = var18;
                           }

                           var17 = var26;
                        }
                     }

                     var18++;
                  }

                  var26 = (int) ((var11) ? 1 : 0);
               }

               if (!(var26 != 0)) {
                  break;
               }
            }

            double var31;
            var10000 = (var31 = var15 - 36.0) == 0.0 ? 0 : (var31 < 0.0 ? -1 : 1);
            if (var4 < 0L || !var11) {
               return var10000 != 0;
            }

            if (var10000 < 0) {
               boolean var33 = recovery$indy$64(this, this.field_48, var1, var9, 390922630470534832L, var4);
               if (!var11) {
                  return var33;
               }

               if (var33) {
                  recovery$indy$65(this, var17, var3, var6, var7, 385306663203864656L, var4);
                  return true;
               }
            }
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }




   private void method_44$5604195cc8(String var1, ScaledResolution var2, RenderPass var3) {
      int var10;
      int var11;
      int var12;
      int var15;
      int var16;
      label32: {
         long var4 = a ^ 48055280955859L;
         long var6 = var4 ^ 89472254699728L;
         long var8 = var4 ^ 11566924097264L;
         long var10001 = var4 ^ 102434483730437L;
         var10 = (int)((var4 ^ 102434483730437L) >>> 32);
         var11 = (int)((var4 ^ 102434483730437L) << 32 >>> 48);
         var12 = (int)(var10001 << 48 >>> 48);
         var10001 = 5369796684427210769L;
         Minecraft var18 = field_43;
         int var14 = var18.field_42N.method_48$2f485d5ba3(var1);
         long var10000 = 5383017648572025053L;
         boolean var41 = AirStuck_47Q4.method_45$aae029aa0a();
         var15 = var2.method_46$8abf5c6871() / 2 - var14 / 2;
         boolean var13 = var41;
         var16 = var2.method_48$8abf5c6871() / 2 - 4;
         var10001 = 5368678916489328907L;
         BooleanSetting var19 = this.settingBackGround;
         int var42 = (int) ((var19.method_49$aae029aa0a()) ? 1 : 0);
         if (var13) {
            if (var42 == 0) {
               break label32;
            }

            short var10002 = (short)var11;
            char var10003 = (char)var12;
            long var10005 = 5371462657301672821L;
            byte var20 = 0;
            char var21 = var10003;
            short var22 = var10002;
            int var23 = var10;
            ColorSetting var24 = this.settingBackGroundColor;
            var42 = var24.method_47$24af287d8f(var23, var22, var21, var20);
         }

         int var17 = var42;
         int var43 = var15 - 2;
         int var46 = var16 - 2;
         int var49 = var15 + var14 + 1;
         int var50 = var16 + 9;
         ShaderOptions var10004 = this.field_45;
         long var10009 = 5383711830251419679L;
         long var25 = var6;
         int var27 = var17;
         RenderPass var28 = var3;
         int var10007 = C_47TX.method_40$6b468acafc(var28, var27, var25);
         long var10008 = 5372257668985708769L;
         int var29 = var10007;
         long var30 = var8;
         RenderPass var32 = var3;
         ShaderOptions var33 = var10004;
         RenderUtils.method_40$0f4d4a7a6c(var43, var46, var49, var50, var33.method_40$d68b376f5b(var32, var30, var29));
      }

      if (var3 != RenderPass.NONE) {
         long var47 = 5368678916489328907L;
         BooleanSetting var34 = this.settingBackGround;
         if (var34.method_49$aae029aa0a() || var3 != RenderPass.SHADOW) {
            return;
         }
      }

      long var48 = 5369796684427210769L;
      Minecraft var35 = field_43;
      short var10006 = (short)var11;
      char var51 = (char)var12;
      long var52 = 5371462657301672821L;
      byte var36 = 0;
      char var37 = var51;
      short var38 = var10006;
      int var39 = var10;
      ColorSetting var40 = this.settingColor;
      var35.field_42N.method_43$7961e3f788(var1, var15, var16, var40.method_47$24af287d8f(var39, var38, var37, var36));
   }




   private void method_44$02c5939e23(int var1, C_47ph var2) {
      long var3 = a ^ 49122793858078L;
      int var5 = (int)((var3 ^ 2657565221755L) >>> 32);
      long var6 = (var3 ^ 2657565221755L) << 32 >>> 32;
      long var10005 = -6967378698548012474L;
      long var8 = var6;
      int var10 = var5;
      C_47ph var11 = var2;
      int var12 = var1;
      ChestStealer_47Qs var13 = this;
      var13.method_46$e9010d0a3b(var12, var11, var10, var8);
   }



   private ArrayList method_44$426cc34567(C_47ph var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 107174726285394L;
      long var6 = var2 ^ 49409434452828L;
      long var8 = var2 ^ 90100622714701L;
      long var10 = var2 ^ 4894791911872L;
      long var12 = var2 ^ 140641407578667L;
      C_47gG var15 = var1.field_46M;
      byte var10000 = (byte) ((recovery$indy$66(7447510103630531719L, var2)) ? 1 : 0);
      ArrayList var16 = recovery$indy$67(var12, 0, var15.field_46.size() - 36, 7450809681604882491L, var2);
      var16.removeAll(this.field_43h);
      byte var14 = var10000;
      boolean var28 = recovery$indy$68(this.settingRemoveEmptyRows, 7452920149386106084L, var2);
      if (var14 == 0) {
         if (var28) {
            ArrayList var17 = new ArrayList();
            ArrayList var18 = new ArrayList();
            Iterator var19 = var16.iterator();

            label151:
            while (true) {
               Object var29;
               if (var19.hasNext()) {
                  var29 = var19.next();
               } else {
                  var29 = var16;
                  if (var2 > 0L) {
                     var16.removeAll(var17);
                     break;
                  }
               }

               do {
                  int var20 = (Integer)var29;
                  int var30 = var20 % 9;
                  byte var10001 = var14;
                  if (var2 >= 0L) {
                     if (var14 != 0) {
                        break label151;
                     }

                     var10001 = var14;
                  }

                  label160: {
                     if (var2 > 0L) {
                        if (var10001 == 0) {
                           if (var30 != 0) {
                              break label160;
                           }

                           if (var14 != 0) {
                              var18.clear();
                              break label160;
                           }

                           var30 = var18.size();
                           var10001 = 9;
                        } else {
                           var10001 = 9;
                        }
                     }

                     if (var30 == var10001) {
                        var17.addAll(var18);
                     }

                     var18.clear();
                  }

                  C_47rf var21 = var1.field_46M.method_46$4c10532da1(var20).method_48$ac4db64966();
                  if (var21 == null) {
                     var18.add(var20);
                  }

                  if (var14 == 0) {
                     continue label151;
                  }

                  var29 = var16;
               } while (var2 <= 0L);

               var16.removeAll(var17);
               break;
            }
         }

         var28 = recovery$indy$69(this.settingIntelligent, 7452920149386106084L, var2);
      }

      if (!var28) {
         return var16;
      }

      ArrayList var23 = new ArrayList();
      ArrayList var24 = recovery$indy$70(var15, 0, var8, 7453317334489466279L, var2);
      Iterator var25 = var16.iterator();

      label117:
      while (true) {
         Object var31;
         if (var25.hasNext()) {
            var31 = var25.next();
         } else {
            var31 = var23;
            if (var2 > 0L) {
               return var23;
            }
         }

         do {
            label163: {
               int var26 = (Integer)var31;
               C_47rf var27 = var15.method_46$4c10532da1(var26).method_48$ac4db64966();
               if (var27 != null) {
                  boolean var32 = recovery$indy$71(this, var27, var4, var15, 7450382244136200841L, var2);
                  byte var34 = var14;
                  if (var2 > 0L) {
                     if (var14 == 0) {
                        if (!var32) {
                           break label163;
                        }

                        var32 = recovery$indy$72(this, var10, var27, 7452000878600816984L, var2);
                        var34 = var14;
                     } else {
                        var34 = var14;
                     }
                  }

                  if (var2 >= 0L) {
                     if (var34 == 0) {
                        if (!var32) {
                           break label163;
                        }

                        var32 = recovery$indy$73(this.field_41_, var6, var27.method_48$dbd570a038(), 7452637773778879409L, var2);
                        var34 = var14;
                     } else {
                        var34 = var14;
                     }
                  }

                  if (var34 != 0) {
                     break label163;
                  }

                  if (var32) {
                     var32 = var24.contains(var26);
                     if (var14 != 0) {
                        break label163;
                     }

                     if (!var32) {
                        break label163;
                     }
                  }
               }

               var23.add(var26);
            }

            if (var14 == 0) {
               continue label117;
            }

            var31 = var23;
         } while (var2 <= 0L);

         return var23;
      }
   }





   public boolean method_44$4a93ae285b(C_47ph var1, int var2, int var3) {
      boolean var32;
      long var4 = ((long)var2 << 32 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = (var4 ^ 38043579253851L) >>> 16;
      int var8 = (int)((var4 ^ 38043579253851L) << 48 >>> 48);
      long var9 = var4 ^ 23485233130431L;
      long var10000 = -5878965230988884556L;
      boolean var11 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10002 = -5882029635868084148L;
      long var17 = var9;
      ModeSetting var19 = this.settingWhereToSteal;
      String var29 = var19.method_46$5f9dc63072(var17);
      if (!var11) {
         boolean var30 = var29.equals("Always");
         if (var3 < 0) {
            return var30;
         }

         if (var30) {
            return true;
         }

         var29 = var1.field_40.method_41$0e30dfc966();
      }

      String var12 = var29;
      boolean var13 = false;
      boolean var31 = var1.field_40 instanceof C_462;
      short var10001 = (short) ((var11) ? 1 : 0);
      if (var2 > 0) {
         if (!var11) {
            if (var31) {
               C_462 var14 = (C_462)var1.field_40;

               try {
                  JsonObject var15 = C_47v_.method_42$e403cd225e(var14.method_45$8b128fd962());
                  var10001 = 13558;
                  var10002 = 1919133740858972523L ^ var4;
                  String var16 = var15.get("translate").getAsString();
                  var10001 = 16038;
                  var10002 = 8521430454357037857L ^ var4;
                  var32 = var16.equals("container.enderchest");
                  label123:
                  if (!var11) {
                     if (!var32) {
                        var10001 = 20647;
                        var10002 = 400388023186849057L ^ var4;
                        var32 = var16.equals("container.chestDouble");
                        if (var11) {
                           break label123;
                        }

                        if (!var32) {
                           var10001 = 30679;
                           var10002 = 7157351804240517755L ^ var4;
                           var32 = var16.equals("container.chest");
                           if (var11) {
                              break label123;
                           }

                           if (!var32) {
                              var32 = false;
                              break label123;
                           }
                        }
                     }

                     var32 = true;
                  }

                  var13 = var32;
               } catch (Exception var28) {
               }
            }

            var31 = var12.equals(new C_470d("container.enderchest", new Object[0]).method_48$0e30dfc966());
         }

         var10001 = (short) ((var11) ? 1 : 0);
      }

      if (!(var10001 != 0)) {
         if (!var31) {
            boolean var43 = var12.equals(new C_470d("container.chestDouble", new Object[0]).method_48$0e30dfc966());
            if (var11) {
               return var43;
            }

            if (!var43) {
               boolean var44 = var12.equals(new C_470d("container.chest", new Object[0]).method_48$0e30dfc966());
               if (var11) {
                  return var44;
               }

               if (!var44) {
                  if (var11) {
                     return var13;
                  }

                  if (!var13) {
                     var10002 = -5882029635868084148L;
                     long var20 = var9;
                     ModeSetting var22 = this.settingWhereToSteal;
                     boolean var45 = var22.method_46$5f9dc63072(var20).equals("CustomChest");
                     boolean var37 = var11;
                     if (var3 > 0) {
                        if (!var11) {
                           if (!var45) {
                              return false;
                           }

                           char var10003 = (char)var8;
                           long var10004 = -5881926903390600894L;
                           char var23 = var10003;
                           String var24 = var12;
                           long var25 = var6;
                           C_47Tx var27 = this.settingChestStorage;
                           var45 = var27.method_45$8e001bad11(var25, var24, var23);
                        }

                        var37 = var11;
                     }

                     if (var37) {
                        return var45;
                     }

                     if (!var45) {
                        return false;
                     }
                  }
               }
            }
         }

         var31 = true;
      }

      return var31;
   }





   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 62665625052564L;
      long var10 = var6 ^ 132989861136316L;
      long var12 = var6 ^ 91924420980846L;
      long var14 = var6 ^ 58032606781533L;
      long var10000 = 1623505036316425562L;
      boolean var16 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 1635669381448459577L;
      BooleanSetting var18 = this.settingSilent;
      boolean var31 = var18.method_49$aae029aa0a();
      if (!var16) {
         if (!var31) {
            return;
         }

         var10001 = 1635669381448459577L;
         BooleanSetting var19 = this.settingStealIndicator;
         var31 = var19.method_49$aae029aa0a();
      }

      if (!var16) {
         if (!var31) {
            return;
         }

         var10001 = 1638980573925690378L;
         Minecraft var20 = field_43;
         var31 = var20.field_44m instanceof C_47ph;
      }

      if (var31) {
         String var17 = recovery$indy$74(15820, 8499822601233541357L ^ var6) + this.field_43p + "/" + this.field_42 + ")";
         long var10002 = 1636310737602900567L;
         long var21 = var8;
         ShaderOptions var23 = this.field_45;
         boolean var32 = var23.method_49$0dd78e0064(var21);
         long var10003 = 1637543525297873149L;
         long var24 = var12;
         ShaderOptions var26 = this.field_45;
         boolean var35 = var26.method_47$0dd78e0064(var24);
         var10003 = 1635812367848352245L;
         C_47uI.method_40$9bd74f13d3(var32, var35, var10);
         C_47Fw var36 = recovery$indy$75(this, var17, var5);
         var10003 = 1623116868463404290L;
         C_47Fw var27 = var36;
         long var28 = var14;
         boolean var30 = false;
         C_47uI.method_42$300c7fd546(var30, var28, var27);
      }

      RenderUtils.method_41$da8c82d5d4();
   }




   private void method_44$e45a9973e5(long var1) {
      net.minecraft.client.Minecraft var72;
      byte var74;
      byte var77;
      augustus.recovered.modules.player.ChestStealer_47Qs var78;
      boolean var92;
      var1 = a ^ var1;
      int var3 = (int)((var1 ^ 40101823490901L) >>> 32);
      int var4 = (int)((var1 ^ 40101823490901L) << 32 >>> 32);
      long var5 = var1 ^ 118855212937221L;
      long var7 = var1 ^ 47529150828613L;
      long var9 = var1 ^ 20164881306010L;
      long var11 = var1 ^ 108168868092481L;
      long var13 = var1 ^ 92240207319030L;
      long var15 = var1 ^ 10769475156396L;
      long var10000 = 4501531156815451557L;
      byte var17 = (byte) ((AirStuck_47Q4.method_419$aae029aa0a()) ? 1 : 0);
      long var10002 = 4489122293757979839L;
      long var24 = var13;
      ChestStealer_47Qs var26 = this;
      var26.method_48$e45a9973e5(var24);
      long var10001 = 4486055423786312949L;
      Minecraft var27 = field_43;
      GuiScreen var69 = var27.field_44m;
      if (var17 == 0) {
         if (!(var27.field_44m instanceof C_47ph)) {
            var10001 = 4489666048164431171L;
            C_47cu var28 = this.field_41T;
            var28.method_46$da8c82d5d4();
            var10001 = 4489666048164431171L;
            C_47cu var29 = this.field_41j;
            var29.method_46$da8c82d5d4();
            var10001 = 4489666048164431171L;
            C_47cu var30 = this.field_41I;
            var30.method_46$da8c82d5d4();
            this.field_437 = -1;
            var10001 = 4488374191522652588L;
            ChestStealer_47Qs var31 = this;
            var31.method_43$da8c82d5d4();
            this.field_43a = false;
            this.field_413.clear();
            return;
         }

         var10001 = 4486055423786312949L;
         Minecraft var32 = field_43;
         var69 = var32.field_44m;
      }

      C_47ph var18 = (C_47ph)var69;
      long var10004 = 4501437710008095289L;
      int var33 = var4;
      int var34 = var3;
      C_47ph var35 = var18;
      ChestStealer_47Qs var36 = this;
      boolean var70 = var36.method_44$4a93ae285b(var35, var34, var33);
      byte var80 = var17;
      if (var1 >= 0L) {
         if (var17 == 0) {
            if (!var70) {
               return;
            }

            C_47cu var71 = this.field_41j;
            var10002 = 4489245555879673842L;
            RangeSetting var37 = this.settingStartDelay;
            var10001 = var37.method_44$8abf5c6871();
            long var10003 = 4486513692957662463L;
            long var38 = var15;
            long var40 = var10001;
            C_47cu var42 = var71;
            var70 = var42.method_42$b0e346e6e3(var40, var38);
         }

         var80 = var17;
      }

      label243: {
         if (var80 == 0) {
            if (!var70) {
               return;
            }

            var72 = field_43;
            if (var17 != 0) {
               break label243;
            }

            var10001 = 4486055423786312949L;
            Minecraft var43 = field_43;
            var70 = var43.field_44m.method_49$aae029aa0a();
         }

         if (var70) {
            return;
         }

         var72 = field_43;
      }

      var10001 = 4501946440098623600L;
      Minecraft var44 = var72;
      if (var44.field_42P.field_42X.method_41$ac4db64966() == null) {
         label245: {
            var10001 = 4489085132695915974L;
            BooleanSetting var45 = this.settingIntelligent;
            boolean var73 = var45.method_49$aae029aa0a();
            if (var17 == 0) {
               label214: {
                  label213:
                  if (var73) {
                     ArrayList var19 = ((java.util.ArrayList) (new ArrayList()));
                     Iterator var20 = var18.field_46M.field_46.iterator();

                     while (true) {
                        if (var20.hasNext()) {
                           C_47sT var21 = (C_47sT)var20.next();
                           C_47rf var22 = var21.method_48$ac4db64966();
                           var74 = var17;
                           if (var1 < 0L) {
                              break;
                           }

                           if (var17 != 0) {
                              break label213;
                           }

                           C_47rf var75 = var22;
                           if (var17 == 0) {
                              if (var22 == null) {
                                 continue;
                              }

                              var75 = var22;
                           }

                           C_43r var23 = var75.method_48$dbd570a038();
                           if (var17 == 0 && var23 instanceof C_43S) {
                              var19.add(var22);
                           }

                           var74 = var17;
                           if (var1 <= 0L) {
                              break;
                           }

                           if (var17 == 0) {
                              continue;
                           }
                        }

                        var74 = 0;
                        break;
                     }

                     int var66 = var74;

                     while (var66 < 9) {
                        var10001 = 4501946440098623600L;
                        Minecraft var46 = field_43;
                        C_47rf var67 = var46.field_42P.field_429.method_46$4c10532da1(var66).method_48$ac4db64966();
                        if (var17 != 0) {
                           break label213;
                        }

                        label183: {
                           label182: {
                              label250: {
                                 C_47rf var76 = var67;
                                 if (var17 == 0) {
                                    if (var67 == null) {
                                       break label250;
                                    }

                                    var76 = var67;
                                 }

                                 C_43r var68 = var76.method_48$dbd570a038();
                                 var77 = var17;
                                 if (var1 <= 0L) {
                                    break label183;
                                 }

                                 if (var17 != 0) {
                                    break label182;
                                 }

                                 if (var1 >= 0L && var68 instanceof C_43S) {
                                    var19.add(var67);
                                 }
                              }

                              var66++;
                           }

                           var77 = var17;
                        }

                        if (var77 != 0) {
                           break;
                        }
                     }

                     var78 = this;
                     if (var1 < 0L) {
                        break label214;
                     }

                     label157: {
                        label251: {
                           var10004 = 4501570020020715266L;
                           long var47 = var5;
                           InvManager_47QL var49 = ClientGlobals.field_48.field_44f;
                           var92 = var49.method_46$0dd78e0064(var47);
                           byte var93 = var17;
                           if (var1 >= 0L) {
                              if (var17 == 0) {
                                 if (!var92) {
                                    break label251;
                                 }

                                 long var94 = 4491386635261430237L;
                                 C_47Oh var50 = C_47Oh.PUT_ON_ARMOR;
                                 var92 = var50.method_43$aae029aa0a();
                              }

                              var93 = var17;
                           }

                           if (var1 > 0L) {
                              if (var93 == 0) {
                                 if (!var92) {
                                    break label251;
                                 }

                                 long var95 = 4489085132695915974L;
                                 BooleanSetting var51 = ClientGlobals.field_48.field_44f.settingIgnoreDurability;
                                 var92 = var51.method_49$aae029aa0a();
                              }

                              var93 = var17;
                           }

                           if (var93 != 0) {
                              break label157;
                           }

                           if (var92) {
                              var92 = true;
                              break label157;
                           }
                        }

                        var92 = false;
                     }

                     var10004 = 4485899218488227238L;
                     boolean var52 = var92;
                     long var53 = var9;
                     ArrayList var55 = var19;
                     this.field_413 = C_47KL.method_42$b7ca61e73c(var55, var53, var52);
                  }

                  var78 = this;
               }

               if (var17 != 0) {
                  break label245;
               }

               var10001 = 4502204077268640349L;
               ChestStealer_47Qs var56 = var78;
               var73 = var56.method_49f$aae029aa0a();
            }

            if (var73) {
               long var96 = 4489830922029386798L;
               long var57 = var7;
               C_47ph var59 = var18;
               ChestStealer_47Qs var60 = this;
               var60.method_49$0c1b967a05(var59, var57);
               if (var17 == 0) {
                  return;
               }
            }

            var78 = this;
         }

         long var97 = 4491317696724052351L;
         C_47ph var61 = var18;
         long var62 = var11;
         ChestStealer_47Qs var64 = var78;
         var64.method_40$458abe43d5(var62, var61);
      }
   }







   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 42655570608981L;
      long var10000 = 8661090005895772763L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = 8660432655471535126L;
      ChestStealer_47Qs var4 = this;
      boolean var5 = var4.method_49f$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private void method_48$a19f828fbe(boolean var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 18794211115057L;
      boolean var6 = recovery$indy$76(1431676172889100727L, var2);
      boolean var10000 = recovery$indy$77(this.settingToggleStorageESP, 1435354038081216609L, var2);
      if (var6) {
         if (var10000) {
            recovery$indy$78(ClientGlobals.field_48.field_44v, var4, var1, 1433545347210893465L, var2);
         }

         var10000 = recovery$indy$79(this.settingToggleChestAura, 1435354038081216609L, var2);
      }

      if (var10000) {
         recovery$indy$80(ClientGlobals.field_48.field_41_, var4, var1, 1433545347210893465L, var2);
      }
   }



   private void method_48$e45a9973e5(long var1) {
      augustus.recovered.modules.player.ChestStealer_47Qs var30;
      boolean var35;
      var1 = a ^ var1;
      long var3 = var1 ^ 92391319533489L;
      long var5 = var1 ^ 131964307909724L;
      long var10000 = -8445709616134610665L;
      boolean var7 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = -8434183518990643129L;
      Minecraft var13 = field_43;
      boolean var8 = var13.field_44m instanceof C_47ph;
      if (!var7) {
         label72: {
            label76: {
               if (var8) {
                  var30 = this;
                  if (var7) {
                     break label76;
                  }

                  if (!this.field_43v) {
                     var10001 = -8434425845974862859L;
                     RangeSetting var14 = this.settingStartDelay;
                     var14.method_43$fedcb3e4d3();
                     var10001 = -8434425845974862859L;
                     RangeSetting var15 = this.settingCloseDelay;
                     var15.method_43$fedcb3e4d3();
                     var10001 = -8434425845974862859L;
                     RangeSetting var16 = this.settingChestOpenTime;
                     var16.method_43$fedcb3e4d3();
                     this.field_43h.clear();
                     var30 = this;
                     var35 = var7;
                     if (var1 <= 0L) {
                        break label72;
                     }

                     if (var7) {
                        break label76;
                     }

                     var10001 = -8446110068141910289L;
                     ChestStealer_47Qs var17 = this;
                     if (!var17.method_49f$aae029aa0a()) {
                        var10001 = -8434183518990643129L;
                        Minecraft var18 = field_43;
                        C_47ph var9 = (C_47ph)var18.field_44m;
                        C_47gG var31 = var9.field_46M;
                        int var10002 = var9.field_46M.field_46.size();
                        long var10004 = -8432088910323609765L;
                        long var19 = var3;
                        int var21 = var10002;
                        byte var22 = 0;
                        C_47gG var23 = var31;
                        ArrayList var10 = C_47KL.method_42$a78f52b95a(var23, var22, var21, var19);
                        this.field_43W.clear();

                        for (Object recovered$element$73091 : var10) {
         int var12 = (int) recovered$element$73091;
                           var30 = this;
                           if (var7) {
                              break label76;
                           }

                           var10004 = -8446305443831346924L;
                           long var24 = var5;
                           RangeSetting var26 = this.settingEmptySlotFailRate;
                           C_474k var27 = this.field_41H;
                           ChestStealer_47Qs var28 = this;
                           if (!var7 && var28.method_47$25381e7dd6(var27, var26, var24)) {
                              this.field_43W.add(var12);
                           }

                           if (var7) {
                              break;
                           }
                        }
                     }
                  }
               }

               if (var1 < 0L) {
                  return;
               }

               var30 = this;
            }

            var35 = var8;
         }

         var30.field_43v = var35;
      }
   }




   public boolean method_48$c8e73c711c(long var1, C_47rf var3) {
      byte var21;
      byte var22;
      int var23;
      byte var24;
      byte var25;
      byte var26;
      var1 = a ^ var1;
      long var4 = (var1 ^ 64570663268255L) >>> 16;
      int var6 = (int)((var1 ^ 64570663268255L) << 48 >>> 48);
      long var10001 = var1 ^ 66113664081697L;
      int var7 = (int)((var1 ^ 66113664081697L) >>> 32);
      int var8 = (int)((var1 ^ 66113664081697L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var1 ^ 61091453731389L;
      byte var12 = (byte) ((recovery$indy$81(1576007607071217590L, var1)) ? 1 : 0);
      int var10000 = (int) ((recovery$indy$82(this, var10, var3, 1581063955007834497L, var1)) ? 1 : 0);
      if (var12 != 0) {
         if (var10000 == 0) {
            return true;
         }

         var10000 = 0;
      }

      for (int var13 = var10000; var13 < recovery$indy$83(field_43, 1575247057726446550L, var1).field_429.field_46.size(); var13++) {
         C_47rf var14 = recovery$indy$84(field_43, 1575247057726446550L, var1).field_429.method_46$4c10532da1(var13).method_48$ac4db64966();
         C_47rf var18 = var14;
         if (var12 != 0) {
            if (var14 == null) {
               break;
            }

            var18 = var14;
         }

         C_43r var15;
         C_43r var16;
         label310: {
            var15 = var18.method_48$dbd570a038();
            var16 = var3.method_48$dbd570a038();
            var10000 = (int) ((var16 instanceof C_45V) ? 1 : 0);
            label309:
            if (var12 != 0) {
               if (var10000 != 0) {
                  var10000 = (int) ((var15 instanceof C_45V) ? 1 : 0);
                  if (var12 == 0) {
                     break label309;
                  }

                  if (var10000 != 0) {
                     double var27;
                     var10000 = (
                              var27 = recovery$indy$85(var3, var7, (short)var8, (short)var9, 1579687115016191347L, var1)
                                 - recovery$indy$86(var14, var7, (short)var8, (short)var9, 1579687115016191347L, var1)
                           )
                           == 0.0
                        ? 0
                        : (var27 < 0.0 ? -1 : 1);
                     var21 = var12;
                     if (var1 <= 0L) {
                        break label310;
                     }

                     if (var12 == 0) {
                        break label309;
                     }

                     if (var10000 <= 0) {
                        return false;
                     }
                  }
               }

               var10000 = (int) ((var16 instanceof C_43u) ? 1 : 0);
            }

            var21 = var12;
         }

         label296: {
            label295:
            if (var21 != 0) {
               if (var10000 != 0) {
                  var10000 = (int) ((var15 instanceof C_43u) ? 1 : 0);
                  if (var12 == 0) {
                     break label295;
                  }

                  if (var10000 != 0) {
                     double var28;
                     var10000 = (
                              var28 = recovery$indy$87(var3, var7, (short)var8, (short)var9, 1579687115016191347L, var1)
                                 - recovery$indy$88(var14, var7, (short)var8, (short)var9, 1579687115016191347L, var1)
                           )
                           == 0.0
                        ? 0
                        : (var28 < 0.0 ? -1 : 1);
                     var22 = var12;
                     if (var1 < 0L) {
                        break label296;
                     }

                     if (var12 == 0) {
                        break label295;
                     }

                     if (var10000 <= 0) {
                        return false;
                     }
                  }
               }

               var10000 = (int) ((var16 instanceof C_43S) ? 1 : 0);
            }

            var22 = var12;
         }

         label282: {
            label281:
            if (var22 != 0) {
               if (var10000 != 0) {
                  var10000 = (int) ((var15 instanceof C_43S) ? 1 : 0);
                  if (var12 == 0) {
                     break label281;
                  }

                  label277:
                  if (var10000 != 0) {
                     boolean var20 = this.field_413.contains(var3);
                     if (var12 == 0) {
                        return var20;
                     }

                     if (!var20) {
                        return false;
                     }

                     var10000 = ((C_43S)var16).field_41;
                     var23 = var12;
                     if (var1 > 0L) {
                        if (var12 == 0) {
                           break label281;
                        }

                        var23 = ((C_43S)var15).field_41;
                     }

                     if (var1 >= 0L) {
                        if (((C_43S)var16).field_41 != var23) {
                           break label277;
                        }

                        double var29;
                        var10000 = (
                                 var29 = recovery$indy$89(var14, var7, (short)var8, (short)var9, 1579687115016191347L, var1)
                                    - recovery$indy$90(var3, var7, (short)var8, (short)var9, 1579687115016191347L, var1)
                              )
                              == 0.0
                           ? 0
                           : (var29 < 0.0 ? -1 : 1);
                        var23 = var12;
                     }

                     if (var1 < 0L) {
                        break label282;
                     }

                     if (var23 == 0) {
                        break label281;
                     }

                     if (var10000 == 0) {
                        return false;
                     }
                  }
               }

               var10000 = (int) ((var16 instanceof C_435) ? 1 : 0);
            }

            var23 = var12;
         }

         label249: {
            label248:
            if (var23 != 0) {
               if (var10000 != 0) {
                  var10000 = (int) ((var15 instanceof C_435) ? 1 : 0);
                  if (var12 == 0) {
                     break label248;
                  }

                  if (var10000 != 0) {
                     double var30;
                     var10000 = (
                              var30 = recovery$indy$91(var3, var7, (short)var8, (short)var9, 1579687115016191347L, var1)
                                 - recovery$indy$92(var14, var7, (short)var8, (short)var9, 1579687115016191347L, var1)
                           )
                           == 0.0
                        ? 0
                        : (var30 < 0.0 ? -1 : 1);
                     var24 = var12;
                     if (var1 < 0L) {
                        break label249;
                     }

                     if (var12 == 0) {
                        break label248;
                     }

                     if (var10000 <= 0) {
                        return false;
                     }
                  }
               }

               var10000 = (int) ((var16 instanceof C_45S) ? 1 : 0);
            }

            var24 = var12;
         }

         label235: {
            label234:
            if (var24 != 0) {
               if (var10000 != 0) {
                  var10000 = (int) ((var15 instanceof C_45S) ? 1 : 0);
                  if (var12 == 0) {
                     break label234;
                  }

                  if (var10000 != 0) {
                     double var31;
                     var10000 = (
                              var31 = recovery$indy$93(var4, (short)var6, var3, true, 1581847229679689539L, var1)
                                 - recovery$indy$94(var4, (short)var6, var14, true, 1581847229679689539L, var1)
                           )
                           == 0.0
                        ? 0
                        : (var31 < 0.0 ? -1 : 1);
                     var25 = var12;
                     if (var1 < 0L) {
                        break label235;
                     }

                     if (var12 == 0) {
                        break label234;
                     }

                     if (var10000 < 0) {
                        return false;
                     }
                  }
               }

               var10000 = (int) ((var16 instanceof C_45Y) ? 1 : 0);
            }

            var25 = var12;
         }

         label221: {
            label220:
            if (var25 != 0) {
               if (var10000 != 0) {
                  var10000 = (int) ((var15 instanceof C_45Y) ? 1 : 0);
                  if (var12 == 0) {
                     break label220;
                  }

                  if (var10000 != 0) {
                     double var32;
                     var10000 = (
                              var32 = recovery$indy$95(var4, (short)var6, var3, true, 1581847229679689539L, var1)
                                 - recovery$indy$96(var4, (short)var6, var14, true, 1581847229679689539L, var1)
                           )
                           == 0.0
                        ? 0
                        : (var32 < 0.0 ? -1 : 1);
                     var26 = var12;
                     if (var1 <= 0L) {
                        break label221;
                     }

                     if (var12 == 0) {
                        break label220;
                     }

                     if (var10000 < 0) {
                        return false;
                     }
                  }
               }

               var10000 = (int) ((var16 instanceof C_45U) ? 1 : 0);
            }

            var26 = var12;
         }

         if (var1 > 0L) {
            if (var26 != 0) {
               if (var10000 == 0) {
                  break;
               }

               var10000 = (int) ((var15 instanceof C_45U) ? 1 : 0);
            }

            var26 = var12;
         }

         if (var1 > 0L) {
            if (var26 != 0) {
               if (var10000 == 0) {
                  break;
               }

               double var33;
               var10000 = (
                        var33 = recovery$indy$97(var4, (short)var6, var3, true, 1581847229679689539L, var1)
                           - recovery$indy$98(var4, (short)var6, var14, true, 1581847229679689539L, var1)
                     )
                     == 0.0
                  ? 0
                  : (var33 < 0.0 ? -1 : 1);
            }

            var26 = var12;
         }

         if (var26 == 0) {
            return var10000 != 0;
         }

         if (var10000 < 0) {
            return false;
         }
         break;
      }

      return true;
   }






   private void method_48$ac5ad548b6(int var1, int var2, C_47ph var3) {
      long var4 = a ^ 118907114892236L;
      long var6 = var4 ^ 18890353942886L;
      long var10005 = 1194072970837448898L;
      C_47ph var8 = var3;
      long var9 = var6;
      int var11 = var2;
      int var12 = var1;
      ChestStealer_47Qs var13 = this;
      var13.method_41$b98603d5ac(var12, var11, var9, var8);
   }



   public int method_49$8abf5c6871() {
      return this.field_437;
   }



   private void method_49$0c1b967a05(C_47ph var1, long var2) {
      boolean var97;
      boolean var99;
      boolean var103;
      int var6;
      int var7;
      int var8;
      long var9;
      long var11;
      long var18;
      long var20;
      boolean var22;
      C_47gG var23;
      ArrayList var24;
      label173: {
         ArrayList var96;
         label172: {
            long var4;
            long var13;
            int var15;
            int var16;
            int var17;
            label171: {
               var2 = a ^ var2;
               var4 = var2 ^ 42000112364276L;
               long var10001 = var2 ^ 60133042621194L;
               var6 = (int)((var2 ^ 60133042621194L) >>> 32);
               var7 = (int)((var2 ^ 60133042621194L) << 32 >>> 48);
               var8 = (int)(var10001 << 48 >>> 48);
               var9 = var2 ^ 105200888209029L;
               var11 = var2 ^ 92079460100623L;
               var13 = var2 ^ 28719442628783L;
               var10001 = var2 ^ 79494774969228L;
               var15 = (int)((var2 ^ 79494774969228L) >>> 48);
               var16 = (int)((var2 ^ 79494774969228L) << 16 >>> 32);
               var17 = (int)(var10001 << 48 >>> 48);
               var18 = var2 ^ 6792170706147L;
               var20 = var2 ^ 100740000675885L;
               this.field_43y++;
               long var10000 = -3064216828325757276L;
               boolean var94 = AirStuck_47Q4.method_419$aae029aa0a();
               var23 = var1.field_46M;
               var22 = var94;
               long var10002 = -3076281289954540708L;
               long var35 = var13;
               ModeSetting var37 = this.settingSequence;
               boolean var95 = var37.method_46$5f9dc63072(var35).equals("Random");
               if (!var22) {
                  if (!var95) {
                     break label171;
                  }

                  var96 = this.field_41q;
                  if (var22) {
                     break label172;
                  }

                  var95 = this.field_41q.isEmpty();
               }

               if (!var95) {
                  var24 = this.field_41q;
                  if (!var22) {
                     break label173;
                  }
               }
            }

            long var10004 = -3078065176325352437L;
            long var38 = var4;
            C_47ph var40 = var1;
            ChestStealer_47Qs var41 = this;
            ArrayList var106 = var41.method_47$426cc34567(var40, var38);
            short var10003 = (short)var15;
            short var115 = (short)var17;
            long var10007 = -3076281289954540708L;
            long var42 = var13;
            ModeSetting var44 = this.settingSequence;
            String var10005 = var44.method_46$5f9dc63072(var42);
            long var10008 = -3077698676838180496L;
            C_47gG var45 = var23;
            ChestStealer_47Qs var46 = this;
            int var10006 = var46.method_43$771f52aa35(var45);
            var10007 = -3078968008643785242L;
            int var47 = var10006;
            String var48 = var10005;
            ArrayList var49 = var106;
            short var50 = var115;
            int var51 = var16;
            short var52 = var10003;
            C_47gG var53 = var23;
            var96 = C_47KL.method_45$e4654bf71d(var53, var52, var51, var50, var49, var48, var47);
         }

         var24 = var96;
      }

      ArrayList var25 = ((java.util.ArrayList) (new ArrayList()));
      ArrayList var26 = ((java.util.ArrayList) (new ArrayList()));
      Iterator var27 = var24.iterator();

      ChestStealer_47Qs var104;
      label158: {
         ArrayList var112;
         label177: {
            while (true) {
               if (var27.hasNext()) {
                  int var28 = (Integer)var27.next();
                  long var108 = -3076663745177770297L;
                  BooleanSetting var54 = this.settingIntelligent;
                  var97 = var54.method_49$aae029aa0a();
                  boolean var109 = var22;
                  if (var2 > 0L) {
                     if (var22) {
                        break;
                     }

                     var109 = var22;
                  }

                  label147: {
                     label146:
                     if (!var109) {
                        label144: {
                           if (var97) {
                              long var110 = -3076663745177770297L;
                              BooleanSetting var55 = this.settingAutoSort;
                              boolean var98 = var55.method_49$aae029aa0a();
                              if (var22) {
                                 break label146;
                              }

                              if (var98) {
                                 C_47rf var29 = var23.method_46$4c10532da1(var28).method_48$ac4db64966();
                                 long var116 = -3063939382271642792L;
                                 C_47rf var56 = var29;
                                 long var57 = var18;
                                 ChestStealer_47Qs var59 = this;
                                 String var30 = var59.method_47$2133c7f76a(var57, var56);
                                 var116 = -3074205837095264998L;
                                 String var60 = var30;
                                 long var61 = var20;
                                 InvManager_47QL var63 = ClientGlobals.field_48.field_44f;
                                 ArrayList var31 = var63.method_40$0939088f00(var61, var60);
                                 var99 = var31.isEmpty();
                                 if (var2 < 0L) {
                                    break label147;
                                 }

                                 if (var22) {
                                    break label146;
                                 }

                                 if (!var99) {
                                    label137: {
                                       int var32 = (Integer)var31.get(0);
                                       boolean var100 = var30.equals("Sword");
                                       label136:
                                       if (!var22) {
                                          label134: {
                                             if (!var100) {
                                                boolean var101 = var30.equals("Bow");
                                                if (var22) {
                                                   break label136;
                                                }

                                                if (!var101) {
                                                   boolean var102 = var30.equals("Rod");
                                                   if (var22) {
                                                      break label136;
                                                   }

                                                   if (!var102) {
                                                      long var111 = -3063800333074343055L;
                                                      Minecraft var64 = field_43;
                                                      C_47rf var33 = var64.field_42P.field_429.method_46$4c10532da1(var32 + 36).method_48$ac4db64966();
                                                      var116 = -3063939382271642792L;
                                                      C_47rf var65 = var33;
                                                      long var66 = var18;
                                                      ChestStealer_47Qs var68 = this;
                                                      String var34 = var68.method_47$2133c7f76a(var66, var65);
                                                      var103 = var34.equals(var30);
                                                      if (var2 <= 0L) {
                                                         break label137;
                                                      }

                                                      if (var22) {
                                                         break label136;
                                                      }

                                                      if (var103) {
                                                         var25.add(recovery$indy$99(this, var28, var1));
                                                         var26.add(var28);
                                                         if (var2 < 0L) {
                                                            break label134;
                                                         }

                                                         if (!var22) {
                                                            continue;
                                                         }
                                                      }
                                                   }
                                                }
                                             }

                                             var25.add(recovery$indy$100(this, var32, var28, var1));
                                          }

                                          var26.add(var28);
                                       }

                                       var103 = var22;
                                    }

                                    if (var2 < 0L) {
                                       break label144;
                                    }

                                    if (!var103) {
                                       continue;
                                    }
                                 }
                              }
                           }

                           var25.add(recovery$indy$101(this, var28, var1));
                        }

                        var26.add(var28);
                     }

                     var99 = var22;
                  }

                  if (!var99) {
                     continue;
                  }
               }

               var104 = this;
               if (var2 < 0L) {
                  break label158;
               }

               var112 = var25;
               if (var2 <= 0L || var22) {
                  break label177;
               }

               long var119 = -3077498992036469655L;
               long var69 = var9;
               ArrayList var71 = var25;
               ChestStealer_47Qs var72 = this;
               var97 = var72.method_45$1b4e7afd48(var71, var69);
               break;
            }

            if (var97) {
               return;
            }

            this.field_43a = true;
            var104 = this;
            var112 = var25;
         }

         C_474k var120 = this.field_415;
         RangeSetting var121 = this.settingDoubleClickRate;
         short var125 = (short)var7;
         RangeSetting var124 = this.settingFailRate;
         RangeSetting var126 = this.settingMissClickRate;
         long var10012 = -3076663745177770297L;
         BooleanSetting var73 = this.settingInstant;
         boolean var127 = var73.method_49$aae029aa0a();
         long var10014 = -3077066065352747789L;
         RangeSetting var74 = this.settingCPS;
         int var10013 = var74.method_44$8abf5c6871();
         long var10015 = -3074055666867662111L;
         int var75 = this.field_43y;
         int var76 = var10013;
         boolean var77 = var127;
         int var78 = var8;
         C_47ph var79 = var1;
         C_47gG var80 = var23;
         RangeSetting var81 = var126;
         RangeSetting var82 = var124;
         short var83 = var125;
         int var84 = var6;
         RangeSetting var85 = var121;
         C_474k var86 = var120;
         ArrayList var87 = var26;
         ArrayList var88 = var112;
         ChestStealer_47Qs var89 = var104;
         var89.method_46$45e3c2cbfe(var88, var87, var86, var85, var84, var83, var82, var81, var80, var79, var78, var77, var76, var75);
         var104 = this;
      }

      long var114 = -3077093680871257062L;
      long var90 = var11;
      ChestStealer_47Qs var92 = var104;
      var92.method_47$e45a9973e5(var90);
   }







   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 8597195828409L;
      long var10000 = -7503132241531094014L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = -7499815667944168351L;
      BooleanSetting var4 = this.settingInstant;
      boolean var6 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (var6) {
            return false;
         }

         var10001 = -7504078317604238342L;
         ChestStealer_47Qs var5 = this;
         var6 = var5.method_49f$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_45$1b4e7afd48(ArrayList var1, long var2) {
      long var4;
      boolean var6;
      boolean var10000;
      boolean var10001;
      label135: {
         var2 = a ^ var2;
         var4 = var2 ^ 137837127743340L;
         var6 = recovery$indy$102(-5712585043434398875L, var2);
         boolean var7 = var1.isEmpty();
         var10000 = recovery$indy$103(this.settingAutoClose, -5725170570154786042L, var2);
         label134:
         if (!var6) {
            if (var10000) {
               var10000 = recovery$indy$104(this.settingAutoCloseIfInvFull, -5725170570154786042L, var2);
               if (var6) {
                  break label134;
               }

               label130:
               if (var10000) {
                  boolean var8 = true;
                  int var9 = 9;

                  while (true) {
                     label125:
                     if (var9 < recovery$indy$105(field_43, -5712159750748291408L, var2).field_429.field_46.size()) {
                        C_47rf var10 = recovery$indy$106(field_43, -5712159750748291408L, var2).field_429.method_46$4c10532da1(var9).method_48$ac4db64966();
                        var10000 = var6;
                        if (var2 > 0L) {
                           if (var6) {
                              break label130;
                           }

                           var10000 = var6;
                        }

                        if (var2 > 0L) {
                           if (!var10000) {
                              if (var10 == null) {
                                 var8 = false;
                                 var10000 = var6;
                                 if (var2 <= 0L) {
                                    break;
                                 }

                                 if (!var6) {
                                    break label125;
                                 }
                              }

                              var9++;
                           }

                           var10000 = var6;
                        }

                        if (!var10000) {
                           continue;
                        }
                     }

                     var10000 = var7;
                     break;
                  }

                  var10001 = var6;
                  if (var2 < 0L || var2 < 0L) {
                     break label135;
                  }

                  if (var6) {
                     break label134;
                  }

                  if (!var10000) {
                     var7 = var8;
                  }
               }
            }

            var10000 = var7;
         }

         var10001 = var6;
      }

      if (!var10001) {
         if (var10000) {
            var10000 = recovery$indy$107(this.settingAutoClose, -5725170570154786042L, var2);
            if (var6) {
               return var10000;
            }

            if (var10000) {
               if (var6) {
                  return this.field_43a;
               }

               if (this.field_43a) {
                  var10000 = recovery$indy$109(
                     this.field_41I, recovery$indy$108(this.settingCloseDelay, -5724790240455823054L, var2), var4, -5727671658330828225L, var2
                  );
                  if (!var6) {
                     if (var10000) {
                        var10000 = recovery$indy$111(
                           this.field_41T, recovery$indy$110(this.settingChestOpenTime, -5724790240455823054L, var2), var4, -5727671658330828225L, var2
                        );
                        if (var6) {
                           return var10000;
                        }

                        if (var10000) {
                           recovery$indy$112(field_43, -5712159750748291408L, var2).method_47a$da8c82d5d4();
                        }
                     }

                     var10000 = true;
                  }

                  return var10000;
               }
            }
         }

         recovery$indy$113(this.field_41I, -5724624967911502973L, var2);
         var10000 = false;
      }

      return var10000;
   }




   private void method_45$02c5939e23(int var1, C_47ph var2) {
      long var3 = a ^ 136428241949652L;
      int var5 = (int)((var3 ^ 91066819712177L) >>> 32);
      long var6 = (var3 ^ 91066819712177L) << 32 >>> 32;
      long var10005 = 2919657766117682572L;
      long var8 = var6;
      int var10 = var5;
      C_47ph var11 = var2;
      int var12 = var1;
      ChestStealer_47Qs var13 = this;
      var13.method_46$e9010d0a3b(var12, var11, var10, var8);
   }



   private void method_47$e45a9973e5(long var1) {
      C_473X var7;
      label36: {
         var1 = a ^ var1;
         long var3 = var1 ^ 61212460541083L;
         byte var5 = (byte) ((recovery$indy$114(4914311889376593498L, var1)) ? 1 : 0);
         boolean var10000 = recovery$indy$116(this.field_41A, var3, recovery$indy$115(this.settingCPSRecalculate, 4902020347090503096L, var1), 4903206642732797660L, var1);
         if (var5 != 0) {
            if (var10000) {
               recovery$indy$117(this.settingCPS, 4903003277341998349L, var1);
               recovery$indy$118(this.settingCPSRecalculate, 4903003277341998349L, var1);
               recovery$indy$119(this.field_41A, 4908505780417610460L, var1);
            }

            var7 = this.field_41y;
            int var10001 = var5;
            if (var1 > 0L) {
               if (var5 == 0) {
                  break label36;
               }

               var10001 = recovery$indy$120(this.settingCPSRecalculateNew, 4902020347090503096L, var1);
            }

            var10000 = recovery$indy$121(this.field_41y, var3, var10001, 4903206642732797660L, var1);
         }

         if (!var10000) {
            return;
         }

         recovery$indy$122(this.settingCPSNew, 4903003277341998349L, var1);
         recovery$indy$123(this.settingCPSRecalculateNew, 4903003277341998349L, var1);
         var7 = this.field_41y;
      }

      recovery$indy$124(var7, 4908505780417610460L, var1);
   }



   public boolean method_47$0e43417138(C_47rf var1, long var2, C_47gG var4) {
      boolean var21;
      boolean var22;
      boolean var23;
      boolean var24;
      boolean var25;
      boolean var26;
      var2 = a ^ var2;
      long var5 = (var2 ^ 105210061659661L) >>> 16;
      int var7 = (int)((var2 ^ 105210061659661L) << 48 >>> 48);
      long var10001 = var2 ^ 98043070131891L;
      int var8 = (int)((var2 ^ 98043070131891L) >>> 32);
      int var9 = (int)((var2 ^ 98043070131891L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var2 ^ 90734695707567L;
      boolean var13 = recovery$indy$125(7227573283546424868L, var2);
      int var10000 = (int) ((recovery$indy$126(this, var11, var1, 7233753246496651283L, var2)) ? 1 : 0);
      if (var13) {
         if (var10000 == 0) {
            return true;
         }

         var10000 = 0;
      }

      int var14 = var10000;

      while (var14 < var4.field_46.size() - 36) {
         label287: {
            C_47rf var15 = var4.method_46$4c10532da1(var14).method_48$ac4db64966();
            C_47rf var19 = var15;
            if (var13) {
               if (var15 == null) {
                  break label287;
               }

               var19 = var1;
            }

            C_43r var16;
            C_43r var17;
            label272: {
               var16 = var19.method_48$dbd570a038();
               var17 = var15.method_48$dbd570a038();
               var10000 = (int) ((var16 instanceof C_45V) ? 1 : 0);
               label271:
               if (var13) {
                  if (var10000 != 0) {
                     var10000 = (int) ((var17 instanceof C_45V) ? 1 : 0);
                     if (!var13) {
                        break label271;
                     }

                     if (var10000 != 0) {
                        double var27;
                        var10000 = (
                                 var27 = recovery$indy$127(var1, var8, (short)var9, (short)var10, 7241304441027382497L, var2)
                                    - recovery$indy$128(var15, var8, (short)var9, (short)var10, 7241304441027382497L, var2)
                              )
                              == 0.0
                           ? 0
                           : (var27 < 0.0 ? -1 : 1);
                        var21 = var13;
                        if (var2 < 0L) {
                           break label272;
                        }

                        if (!var13) {
                           break label271;
                        }

                        if (var10000 < 0) {
                           return false;
                        }
                     }
                  }

                  var10000 = (int) ((var16 instanceof C_43u) ? 1 : 0);
               }

               var21 = var13;
            }

            label258: {
               label257:
               if (var21) {
                  if (var10000 != 0) {
                     var10000 = (int) ((var17 instanceof C_43u) ? 1 : 0);
                     if (!var13) {
                        break label257;
                     }

                     if (var10000 != 0) {
                        double var28;
                        var10000 = (
                                 var28 = recovery$indy$129(var1, var8, (short)var9, (short)var10, 7241304441027382497L, var2)
                                    - recovery$indy$130(var15, var8, (short)var9, (short)var10, 7241304441027382497L, var2)
                              )
                              == 0.0
                           ? 0
                           : (var28 < 0.0 ? -1 : 1);
                        var22 = var13;
                        if (var2 < 0L) {
                           break label258;
                        }

                        if (!var13) {
                           break label257;
                        }

                        if (var10000 < 0) {
                           return false;
                        }
                     }
                  }

                  var10000 = (int) ((var16 instanceof C_43S) ? 1 : 0);
               }

               var22 = var13;
            }

            label244: {
               label243:
               if (var22) {
                  if (var10000 != 0) {
                     var10000 = (int) ((var17 instanceof C_43S) ? 1 : 0);
                     if (!var13) {
                        break label243;
                     }

                     if (var10000 != 0) {
                        var10000 = (int) ((this.field_413.contains(var1)) ? 1 : 0);
                        var23 = var13;
                        if (var2 <= 0L) {
                           break label244;
                        }

                        if (!var13) {
                           break label243;
                        }

                        if (var10000 == 0) {
                           return false;
                        }
                     }
                  }

                  var10000 = (int) ((var16 instanceof C_435) ? 1 : 0);
               }

               var23 = var13;
            }

            label230: {
               label229:
               if (var23) {
                  if (var10000 != 0) {
                     var10000 = (int) ((var17 instanceof C_435) ? 1 : 0);
                     if (!var13) {
                        break label229;
                     }

                     if (var10000 != 0) {
                        double var29;
                        var10000 = (
                                 var29 = recovery$indy$131(var1, var8, (short)var9, (short)var10, 7241304441027382497L, var2)
                                    - recovery$indy$132(var15, var8, (short)var9, (short)var10, 7241304441027382497L, var2)
                              )
                              == 0.0
                           ? 0
                           : (var29 < 0.0 ? -1 : 1);
                        var24 = var13;
                        if (var2 <= 0L) {
                           break label230;
                        }

                        if (!var13) {
                           break label229;
                        }

                        if (var10000 < 0) {
                           return false;
                        }
                     }
                  }

                  var10000 = (int) ((var16 instanceof C_45S) ? 1 : 0);
               }

               var24 = var13;
            }

            label216: {
               label215:
               if (var24) {
                  if (var10000 != 0) {
                     var10000 = (int) ((var17 instanceof C_45S) ? 1 : 0);
                     if (!var13) {
                        break label215;
                     }

                     if (var10000 != 0) {
                        double var30;
                        var10000 = (
                                 var30 = recovery$indy$133(var5, (short)var7, var1, true, 7233269899879395025L, var2)
                                    - recovery$indy$134(var5, (short)var7, var15, true, 7233269899879395025L, var2)
                              )
                              == 0.0
                           ? 0
                           : (var30 < 0.0 ? -1 : 1);
                        var25 = var13;
                        if (var2 <= 0L) {
                           break label216;
                        }

                        if (!var13) {
                           break label215;
                        }

                        if (var10000 < 0) {
                           return false;
                        }
                     }
                  }

                  var10000 = (int) ((var16 instanceof C_45Y) ? 1 : 0);
               }

               var25 = var13;
            }

            label202: {
               label201:
               if (var25) {
                  if (var10000 != 0) {
                     var10000 = (int) ((var17 instanceof C_45Y) ? 1 : 0);
                     if (!var13) {
                        break label201;
                     }

                     if (var10000 != 0) {
                        double var31;
                        var10000 = (
                                 var31 = recovery$indy$135(var5, (short)var7, var1, true, 7233269899879395025L, var2)
                                    - recovery$indy$136(var5, (short)var7, var15, true, 7233269899879395025L, var2)
                              )
                              == 0.0
                           ? 0
                           : (var31 < 0.0 ? -1 : 1);
                        var26 = var13;
                        if (var2 <= 0L) {
                           break label202;
                        }

                        if (!var13) {
                           break label201;
                        }

                        if (var10000 < 0) {
                           return false;
                        }
                     }
                  }

                  var10000 = (int) ((var16 instanceof C_45U) ? 1 : 0);
               }

               var26 = var13;
            }

            if (var2 >= 0L) {
               if (var26) {
                  if (var10000 == 0) {
                     break label287;
                  }

                  var10000 = (int) ((var17 instanceof C_45U) ? 1 : 0);
               }

               var26 = var13;
            }

            if (var2 >= 0L) {
               if (var26) {
                  if (var10000 == 0) {
                     break label287;
                  }

                  double var32;
                  var10000 = (
                           var32 = recovery$indy$137(var5, (short)var7, var1, true, 7233269899879395025L, var2)
                              - recovery$indy$138(var5, (short)var7, var15, true, 7233269899879395025L, var2)
                        )
                        == 0.0
                     ? 0
                     : (var32 < 0.0 ? -1 : 1);
               }

               var26 = var13;
            }

            if (!var26) {
               return var10000 != 0;
            }

            if (var10000 < 0) {
               return false;
            }
         }

         var14++;
         if (!var13) {
            break;
         }
      }

      return true;
   }






    private int method_47$69e46e6a8d(int n, int n2, double d, C_47gG c_47gG, short s, int n3, int n4) {
        int n5;
        long l;
        long l2 = l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x38B22559A5D9L;
        long l4 = l2 ^ 0x5419EFB7B2D0L;
        C_47sT c_47sT = c_47gG.method_46$4c10532da1(n3);
        ScaledResolution c_477t = new ScaledResolution(field_43);
        int n6 = (c_477t.method_46$8abf5c6871() - 176) / 2;
        int n7 = (c_477t.method_48$8abf5c6871() - ChestStealer_47Qs.recovery$indy$140((Object)this, c_47gG, 4553676113429279496L, l)) / 2;
        boolean bl = ChestStealer_47Qs.recovery$indy$139(4540066132872303836L, l);
        double d2 = Math.abs((double)(c_47sT.field_40 + 2 + n6) - ChestStealer_47Qs.recovery$indy$141(4554410660266602478L, l)[0]);
        double d3 = Math.abs((double)(c_47sT.field_46 + 2 + n7) - ChestStealer_47Qs.recovery$indy$142(4554410660266602478L, l)[1]);
        double d4 = Math.sqrt(d2 * d2 + d3 * d3);
        int n8 = ((int) (ChestStealer_47Qs.recovery$indy$143(1, l4, 4556255167784236773L, l) ? 1 : 0));
        double d5 = ChestStealer_47Qs.recovery$indy$144(this.settingMaxMouseMoveSpeed, true, l3, 4553934232582448335L, l);
        int n9 = n8;
        if (!bl) {
            n9 = n9 != 0 ? 40 : 0;
        }
        int n10 = n5 = (int)(d4 / (d5 + (double)n9));
        boolean bl2 = bl;
        if (n >= 0) {
            if (!bl2) {
                double d6;
                if (n10 > 0) {
                    n5 += ChestStealer_47Qs.recovery$indy$145(this.settingMouseMoveRandom, 4554310920720973451L, l);
                }
                n10 = (d6 = d - (double)n5) == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
            }
            bl2 = bl;
        }
        if (!bl2) {
            if (n10 > 0) {
                double d7 = d4 - 19.0;
                double d8 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                if (!bl) {
                    if (d8 > 0) {
                        ChestStealer_47Qs.recovery$indy$146(this.settingMouseMoveRandom, 4555856869915870782L, l);
                    }
                    d8 = n4;
                }
                return (int)d8;
            }
            n10 = 0;
        }
        return n10;
    }




   private boolean method_47$25381e7dd6(C_474k var1, RangeSetting var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 47258043883824L;
      boolean var7 = recovery$indy$147(-7074436631286106609L, var3);
      if (var2 == null) {
         return false;
      }

      boolean var8 = recovery$indy$149(var1, recovery$indy$148(var2, -7068633891551191976L, var3), var5, -7069094762827402413L, var3);
      boolean var10000 = var8;
      if (!var7) {
         if (var8) {
            recovery$indy$150(var2, -7067655360704191251L, var3);
         }

         var10000 = var8;
      }

      return var10000;
   }



   private ArrayList method_47$426cc34567(C_47ph var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 22226452454337L;
      long var6 = var2 ^ 98678878150863L;
      long var8 = var2 ^ 40395764188382L;
      long var10 = var2 ^ 89096777139624L;
      long var12 = var2 ^ 124506150922835L;
      C_47gG var15 = var1.field_46M;
      long var10000 = -4266690380281975020L;
      boolean var46 = AirStuck_47Q4.method_419$aae029aa0a();
      int var10004 = var15.field_46.size() - 36;
      long var10005 = -4253754470968000227L;
      int var22 = var10004;
      byte var23 = 0;
      long var24 = var10;
      C_47gG var26 = var15;
      ArrayList var16 = C_47KL.method_46$e201398920(var26, var24, var23, var22);
      boolean var14 = var46;
      long var10001 = -4252134531861956745L;
      BooleanSetting var27 = this.settingIntelligent;
      if (!var27.method_49$aae029aa0a()) {
         return var16;
      }

      ArrayList var17 = new ArrayList();
      long var10003 = -4252253540624292300L;
      long var28 = var8;
      byte var30 = 0;
      C_47gG var31 = var15;
      ArrayList var18 = C_47KL.method_45e$1bb508394f(var31, var30, var28);
      Iterator var19 = var16.iterator();

      label80:
      while (true) {
         Object var47;
         if (var19.hasNext()) {
            var47 = var19.next();
         } else {
            var47 = var17;
            if (var2 >= 0L) {
               return var17;
            }
         }

         do {
            label83: {
               int var20 = (Integer)var47;
               C_47rf var21 = var15.method_46$4c10532da1(var20).method_48$ac4db64966();
               long var54 = -4254100226137323238L;
               C_47gG var32 = var15;
               long var33 = var4;
               C_47rf var35 = var21;
               ChestStealer_47Qs var36 = this;
               boolean var48 = var36.method_47$0e43417138(var35, var33, var32);
               boolean var51 = var14;
               if (var2 > 0L) {
                  if (!var14) {
                     if (!var48) {
                        if (!var14) {
                           continue label80;
                        }
                        break label83;
                     }

                     var10003 = -4253185723645678901L;
                     C_47rf var37 = var21;
                     long var38 = var12;
                     ChestStealer_47Qs var40 = this;
                     var48 = var40.method_48$c8e73c711c(var38, var37);
                     var51 = var14;
                  } else {
                     var51 = var14;
                  }
               }

               if (var2 >= 0L) {
                  if (!var51) {
                     if (!var48) {
                        if (!var14) {
                           continue label80;
                        }
                        break label83;
                     }

                     C_471Q var49 = this.field_41_;
                     C_43r var10002 = var21.method_48$dbd570a038();
                     var10003 = -4251851189952503774L;
                     C_43r var41 = var10002;
                     long var42 = var6;
                     C_471Q var44 = var49;
                     var48 = var44.method_41$f942ff83f3(var42, var41);
                     var51 = var14;
                  } else {
                     var51 = var14;
                  }
               }

               if (!var51) {
                  if (var48) {
                     var48 = var18.contains(var20);
                     if (!var14) {
                        if (var48) {
                           var17.add(var20);
                        }
                     }
                  } else {
                     var17.add(var20);
                  }
               }

               if (!var14) {
                  continue label80;
               }
            }

            var47 = var17;
         } while (var2 < 0L);

         return var17;
      }
   }




   private String method_47$2133c7f76a(long var1, C_47rf var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 118914280391136L;
      boolean var6 = recovery$indy$151(-369452176962225994L, var1);
      C_47rf var10000 = var3;
      if (var6) {
         if (var3 == null) {
            return "";
         }

         var10000 = var3;
      }

      C_43r var7 = var10000.method_48$dbd570a038();
      boolean var9 = var7 instanceof C_45V;
      boolean var10001 = var6;
      if (var1 > 0L) {
         if (var6) {
            if (var9) {
               return recovery$indy$152(26740, 6552294181917233518L ^ var1);
            }

            var9 = var7 instanceof C_43u;
         }

         var10001 = var6;
      }

      if (var1 > 0L) {
         if (var10001) {
            if (var9) {
               return recovery$indy$153(12705, 3148821977139890389L ^ var1);
            }

            var9 = var7 instanceof C_435;
         }

         var10001 = var6;
      }

      if (var1 > 0L) {
         if (var10001) {
            if (var9) {
               return recovery$indy$154(12322, 7363268171649894691L ^ var1);
            }

            var9 = var7 instanceof C_45o;
         }

         var10001 = var6;
      }

      if (var1 > 0L) {
         if (var10001) {
            if (var9) {
               return recovery$indy$155(3771, 8996439446921901974L ^ var1);
            }

            var9 = var7 instanceof C_43R;
         }

         var10001 = var6;
      }

      if (var1 >= 0L) {
         if (var10001) {
            if (var9) {
               return recovery$indy$155(3771, 8996439446921901974L ^ var1);
            }

            var9 = var7 instanceof C_43N;
         }

         var10001 = var6;
      }

      if (var1 >= 0L) {
         if (var10001) {
            if (var9) {
               return recovery$indy$156(24856, 8442700087277426692L ^ var1);
            }

            var9 = var7 instanceof C_43B;
         }

         var10001 = var6;
      }

      if (var1 >= 0L) {
         if (var10001) {
            if (var9) {
               return recovery$indy$157(21918, 264140504483704041L ^ var1);
            }

            var9 = var7 instanceof C_43J;
         }

         var10001 = var6;
      }

      if (var1 >= 0L) {
         if (var10001) {
            if (var9) {
               return recovery$indy$158(4080, 972677189046367989L ^ var1);
            }

            var9 = var7 instanceof C_43F;
         }

         var10001 = var6;
      }

      if (var10001) {
         if (!var9) {
            return "";
         }

         var9 = recovery$indy$159(var3, var4, true, -370280701155327060L, var1);
      }

      return var9 ? recovery$indy$160(7843, 2618885067834877844L ^ var1) : "";
   }




   private Boolean method_47$4c6e2210e1(C_43r var1) {
      long var2 = a ^ 111662290832503L;
      long var4 = var2 ^ 86886141822956L;
      long var10000 = 3968206343556406476L;
      boolean var6 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10003 = 3976273408743702411L;
      long var7 = var4;
      C_43r var9 = var1;
      ChestStealer_47Qs var10 = this;
      boolean var12 = var10.method_41$214fd8f084(var9, var7);
      if (!var6) {
         if (var12) {
            return false;
         }

         long var10001 = 3973345485879316748L;
         C_43r var11 = var1;
         var12 = C_47KL.method_47$d654fe8697(var11);
      }

      if (var6) {
         return var12;
      } else {
         return var12 ? true : false;
      }
   }



   private void method_43$2f0d40f3a9(int var1, int var2, C_47ph var3, int var4, char var5) {
      long var6 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      long var8 = var6 ^ 104873545950437L;
      C_47sT var10 = var3.field_46M.method_46$4c10532da1(var1);
      recovery$indy$161(this, var8, var3.field_46M, var1, 1200271558255917564L, var6);

      try {
         var3.field_42 = true;
         var3.method_47$23922dd444(var10.field_40 + 2 + var3.field_46c, var10.field_46 + 2 + var3.field_433, 0);
         recovery$indy$162(this, 1199924360546291523L, var6);
      } catch (IOException var12) {
      }
   }



   public void method_43$da8c82d5d4() {
      this.field_43y = 0;
   }



   private int method_43$771f52aa35(C_47gG var1) {
      return 114 + (var1.field_46.size() - 36) / 9 * 18;
   }



   private boolean method_43$c8e73c711c(long var1, C_47rf var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 75486408186970L;
      return recovery$indy$163(this, var3.method_48$dbd570a038(), var4, 3213463724491465789L, var1);
   }



   private boolean method_49f$aae029aa0a() {
      long var1 = a ^ 108228380290266L;
      long var3 = var1 ^ 83961490805354L;
      long var10002 = 6308289863295484313L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Default");
   }



   private boolean method_49S$aae029aa0a() {
      long var1 = a ^ 77985210615083L;
      long var3 = var1 ^ 16920713687088L;
      long var10000 = -122653416618001371L;
      boolean var5 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -110043116562805261L;
      BooleanSetting var6 = this.settingIntelligent;
      if (var6.method_49$aae029aa0a()) {
         var10000 = -108086953484464972L;
         Client var15 = Client.method_44$fbc0c0be91();
         var10001 = -112328422096502255L;
         Client var7 = var15;
         ModuleManager var16 = var7.method_45$4a5eee04b7();
         if (var5) {
            if (var16 == null) {
               return false;
            }

            var10000 = -108086953484464972L;
            Client var18 = Client.method_44$fbc0c0be91();
            var10001 = -112328422096502255L;
            Client var8 = var18;
            var16 = var8.method_45$4a5eee04b7();
         }

         InvManager_47QL var19 = var16.field_44f;
         if (var5) {
            if (var16.field_44f == null) {
               return false;
            }

            var10000 = -108086953484464972L;
            Client var21 = Client.method_44$fbc0c0be91();
            var10001 = -112328422096502255L;
            Client var9 = var21;
            var19 = var9.method_45$4a5eee04b7().field_44f;
         }

         long var10002 = -122255317483503817L;
         long var10 = var3;
         InvManager_47QL var12 = var19;
         boolean var22 = var12.method_46$0dd78e0064(var10);
         if (var5) {
            if (!var22) {
               return false;
            }

            var10001 = -116531586791503384L;
            C_47Oh var13 = C_47Oh.SORT;
            var22 = var13.method_43$aae029aa0a();
         }

         if (!var5) {
            return var22;
         }

         if (var22) {
            return true;
         }
      }

      return false;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      recovery$indy$164(this, 40, 10, var3, -7106430854070551183L, var1);
      recovery$indy$165(this, 32, -2, var3, -7106430854070551183L, var1);
   }



   private boolean method_49P$aae029aa0a() {
      long var1 = a ^ 50009783964033L;
      long var10000 = -6132120622092736369L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -6132774399338072382L;
      ChestStealer_47Qs var4 = this;
      boolean var5 = var4.method_49f$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_49k$aae029aa0a() {
      long var1 = a ^ 134583041110144L;
      long var10000 = -8365713572249761394L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -8371575070206625704L;
      BooleanSetting var4 = this.settingSilent;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = -8371575070206625704L;
         BooleanSetting var5 = this.settingStealIndicator;
         var6 = var5.method_49$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 47600219700259L;
      recovery$indy$166(this, false, var3, -7745493365607802589L, var1);
      this.field_437 = -1;
      this.field_413.clear();
   }



   private boolean method_49r$aae029aa0a() {
      long var1 = a ^ 77081405320842L;
      long var10000 = 6191540404417461809L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 6185708012045510226L;
      BooleanSetting var4 = this.settingSilent;
      boolean var6 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 6185708012045510226L;
         BooleanSetting var5 = this.settingStealIndicator;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   private boolean method_49T$aae029aa0a() {
      long var1 = a ^ 91426696277587L;
      long var10000 = 1527892996127266653L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = 1513519081277089419L;
      BooleanSetting var4 = this.settingSilent;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_49L$aae029aa0a() {
      long var1 = a ^ 28117874049491L;
      long var10000 = 4230457547765223784L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 4230629116666554000L;
      ChestStealer_47Qs var4 = this;
      boolean var5 = var4.method_49f$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 99210059121261L;
      long var8 = var4 ^ 68297670069589L;
      recovery$indy$167(this, true, var8, 2734933491895494741L, var4);
      recovery$indy$168(this, var6, 2733724637929170871L, var4);
   }



   private boolean method_49M$aae029aa0a() {
      long var1 = a ^ 48852909828151L;
      long var10000 = 1392086470929004684L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 1397636360820285679L;
      BooleanSetting var4 = this.settingInstant;
      boolean var6 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (var6) {
            return false;
         }

         var10001 = 1392178776227876724L;
         ChestStealer_47Qs var5 = this;
         var6 = var5.method_49f$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 59704181260048L;
      long var3 = var1 ^ 45467068318026L;
      long var5 = var1 ^ 87804297839895L;
      long var10002 = -4304842108138048067L;
      long var10 = var3;
      ChestStealer_47Qs var12 = this;
      var12.method_44$e45a9973e5(var10);
      long var10000 = -4289872160698415586L;
      boolean var25 = AirStuck_47Q4.method_45$aae029aa0a();
      var10002 = -4302592929309688177L;
      C_473X var13 = this.field_41A;
      var13.method_41$da8c82d5d4();
      boolean var7 = var25;
      long var10001 = -4302592929309688177L;
      C_473X var14 = this.field_41y;
      var14.method_41$da8c82d5d4();
      var10001 = -4302592929309688177L;
      C_473X var15 = this.field_41d;
      var15.method_41$da8c82d5d4();
      var10001 = -4302592929309688177L;
      C_473X var16 = this.field_41i;
      var16.method_41$da8c82d5d4();
      if (var7) {
         var10001 = -4301016289609670917L;
         Minecraft var17 = field_43;
         if (var17.field_44m instanceof C_47ph) {
            var10001 = -4301016289609670917L;
            Minecraft var18 = field_43;
            C_47ph var8 = (C_47ph)var18.field_44m;
            C_47gG var26 = var8.field_46M;
            int var10003 = var8.field_46M.field_46.size() - 36;
            long var10004 = -4302980487787183710L;
            int var19 = var10003;
            byte var20 = 0;
            long var21 = var5;
            C_47gG var23 = var26;
            ArrayList var9 = C_47KL.method_46$e201398920(var23, var21, var20, var19);
            ChestStealer_47Qs var27 = this;
            if (var7) {
               if (!this.field_43P) {
                  this.field_42 = var9.size();
               }

               var27 = this;
            }

            var27.field_43p = Math.max(this.field_42 - var9.size(), 0);
         }

         var10002 = -4301016289609670917L;
         Minecraft var24 = field_43;
         this.field_43P = var24.field_44m instanceof C_47ph;
      }
   }




   private boolean method_49D$aae029aa0a() {
      long var1 = a ^ 126225091024263L;
      long var10000 = 7989933185850524988L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 7990051613119541956L;
      ChestStealer_47Qs var4 = this;
      boolean var5 = var4.method_49f$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_49_$aae029aa0a() {
      long var1 = a ^ 66626827292438L;
      long var10000 = -5444494421055261160L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -5457106917990774834L;
      BooleanSetting var4 = this.settingInstant;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3) {
         if (var6) {
            return false;
         }

         var10001 = -5443985748054300587L;
         ChestStealer_47Qs var5 = this;
         var6 = var5.method_49f$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   private boolean method_49Q$aae029aa0a() {
      long var1 = a ^ 99810787842747L;
      long var10000 = -2171339835631842816L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = -2168183654981365149L;
      BooleanSetting var4 = this.settingSilent;
      boolean var7 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (!var7) {
            return false;
         }

         var10001 = -2168183654981365149L;
         BooleanSetting var5 = this.settingStealIndicator;
         var7 = var5.method_49$aae029aa0a();
      }

      if (!var3) {
         if (!var7) {
            return false;
         }

         var10001 = -2168183654981365149L;
         BooleanSetting var6 = this.settingBackGround;
         var7 = var6.method_49$aae029aa0a();
      }

      return var3 ? var7 : var7;
   }



   private boolean method_492$aae029aa0a() {
      long var1 = a ^ 61805915348366L;
      long var10000 = 2803844282913989760L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = 2800238984950437206L;
      BooleanSetting var4 = this.settingSilent;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = 2800238984950437206L;
         BooleanSetting var5 = this.settingStealIndicator;
         var6 = var5.method_49$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



    public ChestStealer_47Qs(long a0) {
        super((java.lang.String) ("ChestStealer"),(java.lang.String) ("TruhenAusbeutung"),(long) (((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 72717838492994L)),(java.awt.Color) (new java.awt.Color((int) (196),(int) (184),(int) (249),(int) (255))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 25171700284789L);
        long constructorKey4 = ((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 64699111795812L);
        long constructorKey5 = ((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 98944917064187L);
        long constructorKey6 = ((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 12556731763903L);
        long constructorKey7 = ((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 99016750197842L);
        long constructorKey8 = ((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 56102796949849L);
        int constructorPart9 = (int) ((((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 38977400831999L) >>> 32));
        long constructorKey10 = ((((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 38977400831999L) << 32) >>> 32);
        long constructorKey11 = ((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 96302375287164L);
        int constructorPart12 = (int) ((((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 40055350696410L) >>> 32));
        int constructorPart13 = (int) (((((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 40055350696410L) << 32) >>> 48));
        int constructorPart14 = (int) (((((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 40055350696410L) << 48) >>> 48));
        long constructorKey15 = ((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 10543633421711L);
        int constructorPart16 = (int) ((((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 41735011285236L) >>> 32));
        int constructorPart17 = (int) (((((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 41735011285236L) << 32) >>> 48));
        int constructorPart18 = (int) (((((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 41735011285236L) << 48) >>> 48));
        int constructorPart19 = (int) ((((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 91984829841463L) >>> 32));
        long constructorKey20 = ((((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 91984829841463L) << 32) >>> 32);
        long constructorKey21 = ((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 42567343930038L);
        long constructorKey22 = ((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 72774593301997L);
        long constructorKey23 = ((augustus.recovered.modules.player.ChestStealer_47Qs.a ^ a0) ^ 33390150829790L);
        java.lang.Object initialValue24 = recovery$indy$flow$1192(2);
        ((java.lang.Object[]) initialValue24)[0] = "Default";
        ((java.lang.Object[]) initialValue24)[1] = "Experimental";
        client.setting.ModeSetting initialized25 = new client.setting.ModeSetting(this, "Mode", constructorKey15, "Default", (java.lang.String[]) (initialValue24));
        recovery$indy$flow$1194(this, initialized25);
        short converted26 = (short) (constructorPart13);
        short converted27 = (short) (constructorPart14);
        client.setting.RangeSetting initialized28 = new client.setting.RangeSetting(constructorPart12, this, "StartDelay", Double.longBitsToDouble(4638496509959077888L), Double.longBitsToDouble(4640361281679785984L), converted26, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, converted27);
        long initialValue29 = constructorKey6;
        client.setting.RangeSetting initialValue30 = initialized28;
        java.lang.Object initialValue31 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue32 = recovery$indy$flow$1198(initialValue31, initialValue29);
        recovery$indy$flow$1199(this, initialValue32);
        client.setting.BooleanSetting initialized33 = new client.setting.BooleanSetting(this, constructorKey8, "Instant", false);
        recovery$indy$flow$1202(this, initialized33);
        boolean initialValue34 = recovery$indy$flow$1203();
        client.setting.NumberSetting initialized35 = new client.setting.NumberSetting(this, "MaxMouseMoveSpeed", Double.longBitsToDouble(4626041242239631360L), constructorKey23, 0.0D, Double.longBitsToDouble(4641240890982006784L), 0);
        java.lang.Object initialValue36 = recovery$indy$flow$1206(this);
        java.lang.Object initialValue37 = initialValue36;
        client.setting.NumberSetting initialValue38 = initialized35;
        java.lang.Object initialValue39 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue40 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue41 = recovery$indy$flow$1209(initialValue39, initialValue40);
        recovery$indy$flow$1210(this, initialValue41);
        short converted42 = (short) (constructorPart13);
        short converted43 = (short) (constructorPart14);
        client.setting.RangeSetting initialized44 = new client.setting.RangeSetting(constructorPart12, this, "MouseMoveRandom", 0.0D, 0.0D, converted42, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(4611686018427387904L), 0, converted43);
        java.lang.Object initialValue45 = recovery$indy$flow$1213(this);
        long initialValue46 = constructorKey10;
        java.lang.Object initialValue47 = initialValue45;
        int initialValue48 = constructorPart9;
        client.setting.RangeSetting initialValue49 = initialized44;
        java.lang.Object initialValue50 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue51 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue47))))));
        java.lang.Object initialValue52 = recovery$indy$flow$1216(initialValue50, initialValue48, initialValue51, initialValue46);
        recovery$indy$flow$1217(this, initialValue52);
        short converted53 = (short) (constructorPart13);
        short converted54 = (short) (constructorPart14);
        client.setting.RangeSetting initialized55 = new client.setting.RangeSetting(constructorPart12, this, "CPS", Double.longBitsToDouble(4625478292286210048L), Double.longBitsToDouble(4626322717216342016L), converted53, 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, converted54);
        java.lang.Object initialValue56 = recovery$indy$flow$1220(this);
        long initialValue57 = constructorKey10;
        java.lang.Object initialValue58 = initialValue56;
        int initialValue59 = constructorPart9;
        client.setting.RangeSetting initialValue60 = initialized55;
        java.lang.Object initialValue61 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue62 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue58))))));
        java.lang.Object initialValue63 = recovery$indy$flow$1223(initialValue61, initialValue59, initialValue62, initialValue57);
        recovery$indy$flow$1224(this, initialValue63);
        short converted64 = (short) (constructorPart13);
        short converted65 = (short) (constructorPart14);
        client.setting.RangeSetting initialized66 = new client.setting.RangeSetting(constructorPart12, this, "CPSRecalculate", Double.longBitsToDouble(4618441417868443648L), Double.longBitsToDouble(4620693217682128896L), converted64, 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, converted65);
        long initialValue67 = constructorKey6;
        client.setting.RangeSetting initialValue68 = initialized66;
        java.lang.Object initialValue69 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue68))))));
        java.lang.Object initialValue70 = recovery$indy$flow$1228(initialValue69, initialValue67);
        java.lang.Object initialValue71 = recovery$indy$flow$1229(this);
        long initialValue72 = constructorKey10;
        java.lang.Object initialValue73 = initialValue71;
        int initialValue74 = constructorPart9;
        java.lang.Object initialValue75 = initialValue70;
        java.lang.Object initialValue76 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue75))))));
        java.lang.Object initialValue77 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue73))))));
        java.lang.Object initialValue78 = recovery$indy$flow$1232(initialValue76, initialValue74, initialValue77, initialValue72);
        recovery$indy$flow$1233(this, initialValue78);
        short converted79 = (short) (constructorPart13);
        short converted80 = (short) (constructorPart14);
        client.setting.RangeSetting initialized81 = new client.setting.RangeSetting(constructorPart12, this, "DoubleClickRate", Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4621819117588971520L), converted79, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, converted80);
        long initialValue82 = constructorKey6;
        client.setting.RangeSetting initialValue83 = initialized81;
        java.lang.Object initialValue84 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue83))))));
        java.lang.Object initialValue85 = recovery$indy$flow$1237(initialValue84, initialValue82);
        java.lang.Object initialValue86 = recovery$indy$flow$1238(this);
        long initialValue87 = constructorKey10;
        java.lang.Object initialValue88 = initialValue86;
        int initialValue89 = constructorPart9;
        java.lang.Object initialValue90 = initialValue85;
        java.lang.Object initialValue91 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue90))))));
        java.lang.Object initialValue92 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue88))))));
        java.lang.Object initialValue93 = recovery$indy$flow$1241(initialValue91, initialValue89, initialValue92, initialValue87);
        recovery$indy$flow$1242(this, initialValue93);
        short converted94 = (short) (constructorPart13);
        short converted95 = (short) (constructorPart14);
        client.setting.RangeSetting initialized96 = new client.setting.RangeSetting(constructorPart12, this, "FailRate", Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4621819117588971520L), converted94, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, converted95);
        long initialValue97 = constructorKey6;
        client.setting.RangeSetting initialValue98 = initialized96;
        java.lang.Object initialValue99 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue98))))));
        java.lang.Object initialValue100 = recovery$indy$flow$1246(initialValue99, initialValue97);
        java.lang.Object initialValue101 = recovery$indy$flow$1247(this);
        long initialValue102 = constructorKey10;
        java.lang.Object initialValue103 = initialValue101;
        int initialValue104 = constructorPart9;
        java.lang.Object initialValue105 = initialValue100;
        java.lang.Object initialValue106 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue105))))));
        java.lang.Object initialValue107 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue103))))));
        java.lang.Object initialValue108 = recovery$indy$flow$1250(initialValue106, initialValue104, initialValue107, initialValue102);
        recovery$indy$flow$1251(this, initialValue108);
        short converted109 = (short) (constructorPart13);
        short converted110 = (short) (constructorPart14);
        client.setting.RangeSetting initialized111 = new client.setting.RangeSetting(constructorPart12, this, "MissClickRate", 0.0D, 0.0D, converted109, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, converted110);
        long initialValue112 = constructorKey6;
        client.setting.RangeSetting initialValue113 = initialized111;
        java.lang.Object initialValue114 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue113))))));
        java.lang.Object initialValue115 = recovery$indy$flow$1255(initialValue114, initialValue112);
        java.lang.Object initialValue116 = recovery$indy$flow$1256(this);
        long initialValue117 = constructorKey10;
        java.lang.Object initialValue118 = initialValue116;
        int initialValue119 = constructorPart9;
        java.lang.Object initialValue120 = initialValue115;
        java.lang.Object initialValue121 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue120))))));
        java.lang.Object initialValue122 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue118))))));
        java.lang.Object initialValue123 = recovery$indy$flow$1259(initialValue121, initialValue119, initialValue122, initialValue117);
        recovery$indy$flow$1260(this, initialValue123);
        int initialValue124 = (int) ((initialValue34 ? 1 : 0));
        short converted125 = (short) (constructorPart13);
        short converted126 = (short) (constructorPart14);
        client.setting.RangeSetting initialized127 = new client.setting.RangeSetting(constructorPart12, this, "CPSNew", Double.longBitsToDouble(4624633867356078080L), Double.longBitsToDouble(4626322717216342016L), converted125, 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, converted126);
        long initialValue128 = constructorKey6;
        client.setting.RangeSetting initialValue129 = initialized127;
        java.lang.Object initialValue130 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue129))))));
        java.lang.Object initialValue131 = recovery$indy$flow$1264(initialValue130, initialValue128);
        java.lang.String initialValue132 = "CPS";
        long initialValue133 = constructorKey3;
        java.lang.Object initialValue134 = initialValue131;
        java.lang.Object initialValue135 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue134))))));
        java.lang.Object initialValue136 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue132))))));
        java.lang.Object initialValue137 = recovery$indy$flow$1267(initialValue135, initialValue133, initialValue136);
        java.lang.Object initialValue138 = recovery$indy$flow$1268(this);
        long initialValue139 = constructorKey10;
        java.lang.Object initialValue140 = initialValue138;
        int initialValue141 = constructorPart9;
        java.lang.Object initialValue142 = initialValue137;
        java.lang.Object initialValue143 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue142))))));
        java.lang.Object initialValue144 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue140))))));
        java.lang.Object initialValue145 = recovery$indy$flow$1271(initialValue143, initialValue141, initialValue144, initialValue139);
        recovery$indy$flow$1272(this, initialValue145);
        short converted146 = (short) (constructorPart13);
        short converted147 = (short) (constructorPart14);
        client.setting.RangeSetting initialized148 = new client.setting.RangeSetting(constructorPart12, this, "CPSRecalculateNew", Double.longBitsToDouble(4618441417868443648L), Double.longBitsToDouble(4620693217682128896L), converted146, 0.0D, Double.longBitsToDouble(4633641066610819072L), 0, converted147);
        java.lang.String initialValue149 = "CPSRecalculate";
        long initialValue150 = constructorKey3;
        client.setting.RangeSetting initialValue151 = initialized148;
        java.lang.Object initialValue152 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue151))))));
        java.lang.Object initialValue153 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue149))))));
        java.lang.Object initialValue154 = recovery$indy$flow$1277(initialValue152, initialValue150, initialValue153);
        long initialValue155 = constructorKey6;
        java.lang.Object initialValue156 = initialValue154;
        java.lang.Object initialValue157 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue156))))));
        java.lang.Object initialValue158 = recovery$indy$flow$1279(initialValue157, initialValue155);
        java.lang.Object initialValue159 = recovery$indy$flow$1280(this);
        long initialValue160 = constructorKey10;
        java.lang.Object initialValue161 = initialValue159;
        int initialValue162 = constructorPart9;
        java.lang.Object initialValue163 = initialValue158;
        java.lang.Object initialValue164 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue163))))));
        java.lang.Object initialValue165 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue161))))));
        java.lang.Object initialValue166 = recovery$indy$flow$1283(initialValue164, initialValue162, initialValue165, initialValue160);
        recovery$indy$flow$1284(this, initialValue166);
        short converted167 = (short) (constructorPart13);
        short converted168 = (short) (constructorPart14);
        client.setting.RangeSetting initialized169 = new client.setting.RangeSetting(constructorPart12, this, "DoubleClickRateNew", Double.longBitsToDouble(4618441417868443648L), Double.longBitsToDouble(4622945017495814144L), converted167, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, converted168);
        long initialValue170 = constructorKey6;
        client.setting.RangeSetting initialValue171 = initialized169;
        java.lang.Object initialValue172 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue171))))));
        java.lang.Object initialValue173 = recovery$indy$flow$1288(initialValue172, initialValue170);
        java.lang.String initialValue174 = "DoubleClickRate";
        long initialValue175 = constructorKey3;
        java.lang.Object initialValue176 = initialValue173;
        java.lang.Object initialValue177 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue176))))));
        java.lang.Object initialValue178 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue174))))));
        java.lang.Object initialValue179 = recovery$indy$flow$1291(initialValue177, initialValue175, initialValue178);
        java.lang.Object initialValue180 = recovery$indy$flow$1292(this);
        long initialValue181 = constructorKey10;
        java.lang.Object initialValue182 = initialValue180;
        int initialValue183 = constructorPart9;
        java.lang.Object initialValue184 = initialValue179;
        java.lang.Object initialValue185 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue184))))));
        java.lang.Object initialValue186 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue182))))));
        java.lang.Object initialValue187 = recovery$indy$flow$1295(initialValue185, initialValue183, initialValue186, initialValue181);
        recovery$indy$flow$1296(this, initialValue187);
        short converted188 = (short) (constructorPart13);
        short converted189 = (short) (constructorPart14);
        client.setting.RangeSetting initialized190 = new client.setting.RangeSetting(constructorPart12, this, "SideStopTicks", Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4618441417868443648L), converted188, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted189);
        long initialValue191 = constructorKey6;
        client.setting.RangeSetting initialValue192 = initialized190;
        java.lang.Object initialValue193 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue192))))));
        java.lang.Object initialValue194 = recovery$indy$flow$1300(initialValue193, initialValue191);
        java.lang.Object initialValue195 = recovery$indy$flow$1301(this);
        long initialValue196 = constructorKey10;
        java.lang.Object initialValue197 = initialValue195;
        int initialValue198 = constructorPart9;
        java.lang.Object initialValue199 = initialValue194;
        java.lang.Object initialValue200 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue199))))));
        java.lang.Object initialValue201 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue197))))));
        java.lang.Object initialValue202 = recovery$indy$flow$1304(initialValue200, initialValue198, initialValue201, initialValue196);
        recovery$indy$flow$1305(this, initialValue202);
        short converted203 = (short) (constructorPart13);
        short converted204 = (short) (constructorPart14);
        client.setting.RangeSetting initialized205 = new client.setting.RangeSetting(constructorPart12, this, "EmptySlotFailRate", Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4621819117588971520L), converted203, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, converted204);
        long initialValue206 = constructorKey6;
        client.setting.RangeSetting initialValue207 = initialized205;
        java.lang.Object initialValue208 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue207))))));
        java.lang.Object initialValue209 = recovery$indy$flow$1309(initialValue208, initialValue206);
        java.lang.Object initialValue210 = recovery$indy$flow$1310(this);
        long initialValue211 = constructorKey10;
        java.lang.Object initialValue212 = initialValue210;
        int initialValue213 = constructorPart9;
        java.lang.Object initialValue214 = initialValue209;
        java.lang.Object initialValue215 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue214))))));
        java.lang.Object initialValue216 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue212))))));
        java.lang.Object initialValue217 = recovery$indy$flow$1313(initialValue215, initialValue213, initialValue216, initialValue211);
        recovery$indy$flow$1314(this, initialValue217);
        client.setting.BooleanSetting initialized218 = new client.setting.BooleanSetting(this, constructorKey8, "RemoveEmptyRows", true);
        java.lang.Object initialValue219 = recovery$indy$flow$1317(this);
        java.lang.Object initialValue220 = initialValue219;
        long initialValue221 = constructorKey4;
        client.setting.BooleanSetting initialValue222 = initialized218;
        java.lang.Object initialValue223 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue222))))));
        java.lang.Object initialValue224 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue220))))));
        java.lang.Object initialValue225 = recovery$indy$flow$1320(initialValue223, initialValue221, initialValue224);
        java.lang.Object initialValue226 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue225))))));
        recovery$indy$flow$1322(this, initialValue226);
        client.setting.BooleanSetting initialized227 = new client.setting.BooleanSetting(this, constructorKey8, "ClickWindow", true);
        recovery$indy$flow$1325(this, initialized227);
        client.setting.BooleanSetting initialized228 = new client.setting.BooleanSetting(this, constructorKey8, "Intelligent", true);
        recovery$indy$flow$1328(this, initialized228);
        client.setting.SettingGroup initialized229 = new client.setting.SettingGroup(this, "ItemBlackList", constructorKey7);
        java.lang.Object initialValue230 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingIntelligent));
        java.lang.Object initialValue231 = recovery$indy$flow$1332(initialValue230);
        java.lang.Object initialValue232 = recovery$indy$flow$1333(initialValue230);
        char converted233 = (char) (constructorPart17);
        java.lang.Object initialValue234 = initialValue232;
        int initialValue235 = constructorPart18;
        int initialValue236 = (int) (converted233);
        int initialValue237 = constructorPart16;
        client.setting.SettingGroup initialValue238 = initialized229;
        java.lang.Object initialValue239 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue238))))));
        java.lang.Object initialValue240 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue234))))));
        java.lang.Object initialValue241 = recovery$indy$flow$1336(initialValue239, initialValue237, (char) (initialValue236), initialValue235, initialValue240);
        recovery$indy$flow$1337(this, initialValue241);
        client.setting.BooleanSetting initialized242 = new client.setting.BooleanSetting(this, constructorKey8, "AutoSort", true);
        java.lang.Object initialValue243 = recovery$indy$flow$1340(this);
        java.lang.Object initialValue244 = initialValue243;
        long initialValue245 = constructorKey4;
        client.setting.BooleanSetting initialValue246 = initialized242;
        java.lang.Object initialValue247 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue246))))));
        java.lang.Object initialValue248 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue244))))));
        java.lang.Object initialValue249 = recovery$indy$flow$1343(initialValue247, initialValue245, initialValue248);
        java.lang.Object initialValue250 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue249))))));
        recovery$indy$flow$1345(this, initialValue250);
        client.setting.BooleanSetting initialized251 = new client.setting.BooleanSetting(this, constructorKey8, "AutoClose", true);
        recovery$indy$flow$1348(this, initialized251);
        client.setting.BooleanSetting initialized252 = new client.setting.BooleanSetting(this, constructorKey8, "AutoCloseIfInvFull", false);
        java.lang.Object initialValue253 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingAutoClose));
        java.lang.Object initialValue254 = recovery$indy$flow$1352(initialValue253);
        java.lang.Object initialValue255 = recovery$indy$flow$1353(initialValue253);
        java.lang.Object initialValue256 = initialValue255;
        long initialValue257 = constructorKey4;
        client.setting.BooleanSetting initialValue258 = initialized252;
        java.lang.Object initialValue259 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue258))))));
        java.lang.Object initialValue260 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue256))))));
        java.lang.Object initialValue261 = recovery$indy$flow$1356(initialValue259, initialValue257, initialValue260);
        java.lang.Object initialValue262 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue261))))));
        recovery$indy$flow$1358(this, initialValue262);
        short converted263 = (short) (constructorPart13);
        short converted264 = (short) (constructorPart14);
        client.setting.RangeSetting initialized265 = new client.setting.RangeSetting(constructorPart12, this, "CloseDelay", Double.longBitsToDouble(4632233691727265792L), Double.longBitsToDouble(4632233691727265792L), converted263, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, converted264);
        long initialValue266 = constructorKey6;
        client.setting.RangeSetting initialValue267 = initialized265;
        java.lang.Object initialValue268 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue267))))));
        java.lang.Object initialValue269 = recovery$indy$flow$1362(initialValue268, initialValue266);
        java.lang.Object initialValue270 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingAutoClose));
        java.lang.Object initialValue271 = recovery$indy$flow$1364(initialValue270);
        java.lang.Object initialValue272 = recovery$indy$flow$1365(initialValue270);
        long initialValue273 = constructorKey10;
        java.lang.Object initialValue274 = initialValue272;
        int initialValue275 = constructorPart9;
        java.lang.Object initialValue276 = initialValue269;
        java.lang.Object initialValue277 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue276))))));
        java.lang.Object initialValue278 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue274))))));
        java.lang.Object initialValue279 = recovery$indy$flow$1368(initialValue277, initialValue275, initialValue278, initialValue273);
        recovery$indy$flow$1369(this, initialValue279);
        short converted280 = (short) (constructorPart13);
        short converted281 = (short) (constructorPart14);
        client.setting.RangeSetting initialized282 = new client.setting.RangeSetting(constructorPart12, this, "ChestOpenTime", Double.longBitsToDouble(4639833516098453504L), Double.longBitsToDouble(4643281584563159040L), converted280, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, converted281);
        long initialValue283 = constructorKey6;
        client.setting.RangeSetting initialValue284 = initialized282;
        java.lang.Object initialValue285 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue284))))));
        java.lang.Object initialValue286 = recovery$indy$flow$1373(initialValue285, initialValue283);
        java.lang.Object initialValue287 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingAutoClose));
        java.lang.Object initialValue288 = recovery$indy$flow$1375(initialValue287);
        java.lang.Object initialValue289 = recovery$indy$flow$1376(initialValue287);
        long initialValue290 = constructorKey10;
        java.lang.Object initialValue291 = initialValue289;
        int initialValue292 = constructorPart9;
        java.lang.Object initialValue293 = initialValue286;
        java.lang.Object initialValue294 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue293))))));
        java.lang.Object initialValue295 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue291))))));
        java.lang.Object initialValue296 = recovery$indy$flow$1379(initialValue294, initialValue292, initialValue295, initialValue290);
        recovery$indy$flow$1380(this, initialValue296);
        client.setting.BooleanSetting initialized297 = new client.setting.BooleanSetting(this, constructorKey8, "Visualize", true);
        java.lang.Object initialValue298 = recovery$indy$flow$1383(this);
        java.lang.Object initialValue299 = initialValue298;
        long initialValue300 = constructorKey4;
        client.setting.BooleanSetting initialValue301 = initialized297;
        java.lang.Object initialValue302 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue301))))));
        java.lang.Object initialValue303 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue299))))));
        java.lang.Object initialValue304 = recovery$indy$flow$1386(initialValue302, initialValue300, initialValue303);
        java.lang.Object initialValue305 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue304))))));
        recovery$indy$flow$1388(this, initialValue305);
        java.lang.Object initialValue306 = recovery$indy$flow$1390(3);
        ((java.lang.Object[]) initialValue306)[0] = "Always";
        ((java.lang.Object[]) initialValue306)[1] = "ChestsOnly";
        ((java.lang.Object[]) initialValue306)[2] = "CustomChest";
        client.setting.ModeSetting initialized307 = new client.setting.ModeSetting(this, "WhereToSteal", constructorKey15, "ChestsOnly", (java.lang.String[]) (initialValue306));
        recovery$indy$flow$1392(this, initialized307);
        java.lang.Object initialValue308 = recovery$indy$flow$1394(3);
        ((java.lang.Object[]) initialValue308)[0] = "Basic";
        ((java.lang.Object[]) initialValue308)[1] = "Nearest";
        ((java.lang.Object[]) initialValue308)[2] = "Random";
        client.setting.ModeSetting initialized309 = new client.setting.ModeSetting(this, "Sequence", constructorKey15, "Nearest", (java.lang.String[]) (initialValue308));
        java.lang.Object initialValue310 = recovery$indy$flow$1396(this);
        java.lang.Object initialValue311 = initialValue310;
        client.setting.ModeSetting initialValue312 = initialized309;
        java.lang.Object initialValue313 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue312))))));
        java.lang.Object initialValue314 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue311))))));
        java.lang.Object initialValue315 = recovery$indy$flow$1399(initialValue313, initialValue314);
        recovery$indy$flow$1400(this, initialValue315);
        java.lang.Object initialValue316 = recovery$indy$flow$1402();
        java.lang.Object initialValue317 = recovery$indy$flow$1403(initialValue316);
        java.lang.Object initialValue318 = recovery$indy$flow$1404(1);
        ((java.lang.Object[]) initialValue318)[0] = "Basic";
        client.setting.ModeSetting initialized319 = new client.setting.ModeSetting(this, "ClickMode", constructorKey15, "Basic", (java.lang.String[]) (initialValue318));
        java.lang.Object initialValue320 = recovery$indy$flow$1406(this);
        java.lang.Object initialValue321 = initialValue320;
        client.setting.ModeSetting initialValue322 = initialized319;
        java.lang.Object initialValue323 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue322))))));
        java.lang.Object initialValue324 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue321))))));
        java.lang.Object initialValue325 = recovery$indy$flow$1409(initialValue323, initialValue324);
        recovery$indy$flow$1410(this, initialValue325);
        client.setting.BooleanSetting initialized326 = new client.setting.BooleanSetting(this, constructorKey8, "ToggleStorageESP", false);
        recovery$indy$flow$1413(this, initialized326);
        client.setting.BooleanSetting initialized327 = new client.setting.BooleanSetting(this, constructorKey8, "ToggleChestAura", false);
        recovery$indy$flow$1416(this, initialized327);
        java.util.ArrayList initialized328 = new java.util.ArrayList();
        net.C_47Tx initialized329 = new net.C_47Tx(this, constructorPart19, "ChestStorage", (java.util.List) (initialized328), constructorKey20);
        recovery$indy$flow$1421(this, initialized329);
        client.setting.BooleanSetting initialized330 = new client.setting.BooleanSetting(this, constructorKey8, "Silent", false);
        recovery$indy$flow$1424(this, initialized330);
        client.setting.BooleanSetting initialized331 = new client.setting.BooleanSetting(this, constructorKey8, "StealIndicator", true);
        java.lang.Object initialValue332 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingSilent));
        java.lang.Object initialValue333 = recovery$indy$flow$1428(initialValue332);
        java.lang.Object initialValue334 = recovery$indy$flow$1429(initialValue332);
        java.lang.Object initialValue335 = initialValue334;
        long initialValue336 = constructorKey4;
        client.setting.BooleanSetting initialValue337 = initialized331;
        java.lang.Object initialValue338 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue337))))));
        java.lang.Object initialValue339 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue335))))));
        java.lang.Object initialValue340 = recovery$indy$flow$1432(initialValue338, initialValue336, initialValue339);
        java.lang.Object initialValue341 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue340))))));
        recovery$indy$flow$1434(this, initialValue341);
        java.lang.Object initialValue342 = recovery$indy$flow$1436();
        client.setting.ColorSetting initialized343 = new client.setting.ColorSetting(constructorKey11, this, "Color", (java.awt.Color) (initialValue342));
        java.lang.Object initialValue344 = recovery$indy$flow$1438(this);
        java.lang.Object initialValue345 = initialValue344;
        long initialValue346 = constructorKey4;
        client.setting.ColorSetting initialValue347 = initialized343;
        java.lang.Object initialValue348 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue347))))));
        java.lang.Object initialValue349 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue345))))));
        java.lang.Object initialValue350 = recovery$indy$flow$1441(initialValue348, initialValue346, initialValue349);
        java.lang.Object initialValue351 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue350))))));
        recovery$indy$flow$1443(this, initialValue351);
        client.setting.BooleanSetting initialized352 = new client.setting.BooleanSetting(this, constructorKey8, "BackGround", true);
        java.lang.Object initialValue353 = recovery$indy$flow$1446(this);
        java.lang.Object initialValue354 = initialValue353;
        long initialValue355 = constructorKey4;
        client.setting.BooleanSetting initialValue356 = initialized352;
        java.lang.Object initialValue357 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue356))))));
        java.lang.Object initialValue358 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue354))))));
        java.lang.Object initialValue359 = recovery$indy$flow$1449(initialValue357, initialValue355, initialValue358);
        java.lang.Object initialValue360 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue359))))));
        recovery$indy$flow$1451(this, initialValue360);
        java.awt.Color initialized361 = new java.awt.Color(0, 0, 0, 100);
        client.setting.ColorSetting initialized362 = new client.setting.ColorSetting(constructorKey11, this, "BackGroundColor", initialized361);
        java.lang.Object initialValue363 = recovery$indy$flow$1456(this);
        java.lang.Object initialValue364 = initialValue363;
        long initialValue365 = constructorKey4;
        client.setting.ColorSetting initialValue366 = initialized362;
        java.lang.Object initialValue367 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue366))))));
        java.lang.Object initialValue368 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue364))))));
        java.lang.Object initialValue369 = recovery$indy$flow$1459(initialValue367, initialValue365, initialValue368);
        java.lang.Object initialValue370 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue369))))));
        recovery$indy$flow$1461(this, initialValue370);
        client.setting.ShaderOptions initialized371 = new client.setting.ShaderOptions(this, constructorKey5);
        java.lang.Object initialValue372 = recovery$indy$flow$1464();
        java.lang.Object initialValue373 = initialValue372;
        long initialValue374 = constructorKey21;
        client.setting.ShaderOptions initialValue375 = initialized371;
        java.lang.Object initialValue376 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue375))))));
        java.lang.Object initialValue377 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue373))))));
        java.lang.Object initialValue378 = recovery$indy$flow$1467(initialValue376, initialValue374, initialValue377);
        java.lang.Object initialValue379 = recovery$indy$flow$1468(this);
        java.lang.Object initialValue380 = initialValue379;
        long initialValue381 = constructorKey4;
        java.lang.Object initialValue382 = initialValue378;
        java.lang.Object initialValue383 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue382))))));
        java.lang.Object initialValue384 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue380))))));
        java.lang.Object initialValue385 = recovery$indy$flow$1471(initialValue383, initialValue381, initialValue384);
        java.lang.Object initialValue386 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue385))))));
        recovery$indy$flow$1473(this, initialValue386);
        recovery$indy$flow$1474(this, false);
        recovery$indy$flow$1475(this, -1);
        recovery$indy$flow$1476(this, 0);
        net.C_47cu initialized387 = new net.C_47cu();
        recovery$indy$flow$1479(this, initialized387);
        net.C_47cu initialized388 = new net.C_47cu();
        recovery$indy$flow$1482(this, initialized388);
        net.C_47cu initialized389 = new net.C_47cu();
        recovery$indy$flow$1485(this, initialized389);
        net.C_474k initialized390 = new net.C_474k(100, 0.0D);
        recovery$indy$flow$1488(this, initialized390);
        net.C_474k initialized391 = new net.C_474k(100, 0.0D);
        recovery$indy$flow$1491(this, initialized391);
        net.C_474k initialized392 = new net.C_474k(100, 0.0D);
        recovery$indy$flow$1494(this, initialized392);
        net.C_474k initialized393 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$1497(this, initialized393);
        net.C_473X initialized394 = new net.C_473X();
        recovery$indy$flow$1500(this, initialized394);
        net.C_473X initialized395 = new net.C_473X();
        recovery$indy$flow$1503(this, initialized395);
        net.C_473X initialized396 = new net.C_473X();
        recovery$indy$flow$1506(this, initialized396);
        net.C_473X initialized397 = new net.C_473X();
        recovery$indy$flow$1509(this, initialized397);
        net.C_474k initialized398 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$1512(this, initialized398);
        net.C_474k initialized399 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$1515(this, initialized399);
        net.C_474k initialized400 = new net.C_474k(100, 0.0D);
        recovery$indy$flow$1518(this, initialized400);
        java.util.ArrayList initialized401 = new java.util.ArrayList();
        recovery$indy$flow$1521(this, initialized401);
        java.util.ArrayList initialized402 = new java.util.ArrayList();
        recovery$indy$flow$1524(this, initialized402);
        java.util.ArrayList initialized403 = new java.util.ArrayList();
        recovery$indy$flow$1527(this, initialized403);
        java.util.ArrayList initialized404 = new java.util.ArrayList();
        recovery$indy$flow$1530(this, initialized404);
        java.lang.Object initialValue405 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingItemBlackList));
        java.lang.Object initialValue406 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestStealer_47Qs) (((java.lang.Object)(this)))).settingIntelligent));
        java.lang.Object initialValue407 = recovery$indy$flow$1534(initialValue406);
        java.lang.Object initialValue408 = recovery$indy$flow$1535(initialValue406);
        java.lang.Object initialValue409 = recovery$indy$flow$1536(this);
        net.C_471Q initialized410 = new net.C_471Q(this, constructorKey22, "Items", (client.setting.SettingGroup) (initialValue405), (net.C_45n) (initialValue408), (java.util.function.Function) (initialValue409));
        recovery$indy$flow$1538(this, initialized410);
        recovery$indy$flow$1539(this, 0);
        recovery$indy$flow$1540(this, 0);
        recovery$indy$flow$1541(this, 0);
        recovery$indy$flow$1542(this, false);
        recovery$indy$flow$1543(this, false);
        java.lang.Object initialValue411 = recovery$indy$flow$1544();
        if (initialValue411 == null) {
            return;
        } else {
            int comparison412 = (constructorKey2 > 0L ? 1 : constructorKey2 == 0L ? 0 : -1);
            if (comparison412 < 0) {
                recovery$indy$flow$1545((initialValue124 != 0));
                return;
            } else {
                if (initialValue124 == 0) {
                    recovery$indy$flow$1545(true);
                    return;
                } else {
                    recovery$indy$flow$1545(false);
                    return;
                }
            }
        }
    }














    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static long recovery$indy$flow$79() {
        return augustus.recovered.modules.player.ChestStealer_47Qs.a;
    }
    private static native boolean recovery$indy$flow$80(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$81(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$82(java.lang.Object a0);
    private static int recovery$indy$flow$85(java.lang.Object a0) {
        return ((net.C_47rf) (a0)).field_47;
    }
    private static native int recovery$indy$flow$88(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$89(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,long a4,long a5);

    private static native java.lang.Object recovery$indy$flow$94(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$97(java.lang.Object a0,long a1,long a2);

    private static int recovery$indy$flow$100(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }

    private static int recovery$indy$flow$102(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static native java.lang.Object recovery$indy$flow$103(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$104(java.lang.Object a0);
    private static long recovery$indy$flow$226() {
        return augustus.recovered.modules.player.ChestStealer_47Qs.a;
    }

    private static native boolean recovery$indy$flow$228(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$229(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$230(long a0,java.lang.Object a1,long a2,long a3);
    private static void recovery$indy$flow$231(java.lang.Object a0) {
        java.util.Collections.reverse(((java.util.List) (a0)));
        return;
    }
    private static java.lang.Object recovery$indy$flow$236(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$237(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$238(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static int recovery$indy$flow$240(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static native java.lang.Object recovery$indy$flow$241(java.lang.Object a0,int a1,java.lang.Object a2);
    private static boolean recovery$indy$flow$242(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }
    private static java.lang.Object recovery$indy$flow$243(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$244(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }
    private static native boolean recovery$indy$flow$245(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static void recovery$indy$flow$246(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_43a = a1;
        return;
    }


    private static native int recovery$indy$flow$249(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$250(java.lang.Object a0,int a1,long a2,long a3,long a4);

    private static native boolean recovery$indy$flow$252(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$253();
    private static void recovery$indy$flow$254(java.lang.Object a0,java.lang.Object a1) {
        ((java.util.ArrayList) (a0)).forEach(((java.util.function.Consumer) (a1)));
        return;
    }
    private static native void recovery$indy$flow$255(java.lang.Object a0,long a1,long a2,long a3);
    private static boolean recovery$indy$flow$256(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }
    private static java.lang.Object recovery$indy$flow$257(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static int recovery$indy$flow$259(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static int recovery$indy$flow$260(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_438;
    }


    private static native int recovery$indy$flow$263(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$264(java.lang.Object a0,long a1,int a2,long a3,long a4);

    private static native boolean recovery$indy$flow$266(java.lang.Object a0,long a1,long a2);


    private static native boolean recovery$indy$flow$269(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,long a4,long a5);
    private static java.lang.Object recovery$indy$flow$270() {
        return augustus.recovered.modules.player.ChestStealer_47Qs.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$271(java.lang.Object a0,long a1,long a2);

    private static int recovery$indy$flow$273(java.lang.Object a0) {
        return ((net.C_47gG) (a0)).field_43;
    }
    private static java.lang.Object recovery$indy$flow$274() {
        return augustus.recovered.modules.player.ChestStealer_47Qs.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$275(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$276(java.lang.Object a0,int a1,int a2,int a3,int a4,java.lang.Object a5);

    private static native boolean recovery$indy$flow$278(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$279() {
        return augustus.recovered.modules.player.ChestStealer_47Qs.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$280(java.lang.Object a0,long a1,long a2);

    private static int recovery$indy$flow$282(java.lang.Object a0) {
        return ((net.C_47gG) (a0)).field_43;
    }
    private static java.lang.Object recovery$indy$flow$283() {
        return augustus.recovered.modules.player.ChestStealer_47Qs.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$284(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$285(java.lang.Object a0,int a1,int a2,int a3,int a4,java.lang.Object a5);

    private static native double recovery$indy$flow$287(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$288(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_438 = a1;
        return;
    }

    private static native void recovery$indy$flow$290(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$292(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$293(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).contains(a1);
    }
    private static java.lang.Object recovery$indy$flow$294(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }
    private static java.lang.Object recovery$indy$flow$295(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }

    private static java.lang.Object recovery$indy$flow$297(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$298(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }
    private static java.lang.Object recovery$indy$flow$299(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static void recovery$indy$flow$301(java.lang.Object a0) {
        ((java.lang.Runnable) (a0)).run();
        return;
    }


    private static native boolean recovery$indy$flow$304(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,long a4,long a5);
    private static java.lang.Object recovery$indy$flow$305(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static void recovery$indy$flow$307(java.lang.Object a0) {
        ((java.lang.Runnable) (a0)).run();
        return;
    }
    private static native java.lang.Object recovery$indy$flow$308(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$309(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$311(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$312(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }
    private static java.lang.Object recovery$indy$flow$313(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }
    private static java.lang.Object recovery$indy$flow$314(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }
    private static native void recovery$indy$flow$315(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$1192(int a0);
    private static native void recovery$indy$flow$1194(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1198(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$1199(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1202(java.lang.Object a0,java.lang.Object a1);
    private static native boolean recovery$indy$flow$1203();
    private static native java.lang.Object recovery$indy$flow$1206(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1209(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1210(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1213(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1216(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1217(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1220(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1223(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1224(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1228(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1229(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1232(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1233(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1237(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1238(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1241(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1242(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1246(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1247(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1250(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1251(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1255(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1256(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1259(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1260(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1264(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$1267(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1268(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1271(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1272(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1277(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$1279(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1280(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1283(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1284(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1288(java.lang.Object a0,long a1);


    private static native java.lang.Object recovery$indy$flow$1291(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1292(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1295(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1296(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1300(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1301(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1304(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1305(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1309(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1310(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1313(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1314(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1317(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1320(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1322(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1325(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1328(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$1332(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1333(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1336(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$1337(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1340(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1343(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1345(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1348(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$1352(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1353(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1356(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1358(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1362(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$1364(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1365(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1368(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1369(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1373(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$1375(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1376(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1379(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1380(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1383(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1386(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1388(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1390(int a0);
    private static native void recovery$indy$flow$1392(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1394(int a0);
    private static native java.lang.Object recovery$indy$flow$1396(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1399(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1400(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1402();
    private static java.lang.Object recovery$indy$flow$1403(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1404(int a0);
    private static native java.lang.Object recovery$indy$flow$1406(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1409(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1410(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1413(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1416(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1421(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1424(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$1428(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1429(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1432(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1434(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$1436() {
        return java.awt.Color.WHITE;
    }
    private static native java.lang.Object recovery$indy$flow$1438(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1441(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1443(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1446(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1449(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1451(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1456(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1459(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1461(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$1464() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$1467(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1468(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1471(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1473(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1474(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$1475(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$1476(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_43y = a1;
        return;
    }
    private static native void recovery$indy$flow$1479(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1482(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1485(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1488(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1491(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1494(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1497(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1500(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1503(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1506(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1509(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1512(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1515(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1518(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1521(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1524(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1527(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_413 = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$1530(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_41q = ((java.util.ArrayList) (a1));
        return;
    }


    private static java.lang.Object recovery$indy$flow$1534(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1535(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$1536(java.lang.Object a0);
    private static native void recovery$indy$flow$1538(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1539(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$1540(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$1541(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$1542(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$1543(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.ChestStealer_47Qs) (a0)).field_43a = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$1544();
    private static native void recovery$indy$flow$1545(boolean a0);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native Consumer recovery$indy$2();
   private static native boolean recovery$indy$3(Object var0, Object var1, Object var2, long var3, long var5, long var7);
   private static native int recovery$indy$4(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$5(Object var0, Object var1, Object var2, Object var3, long var4, long var6, long var8);
   private static native int recovery$indy$6(Object var0, int var1, int var2, double var3, Object var5, short var6, int var7, int var8, long var9, long var11);
   private static native boolean recovery$indy$7(Object var0, Object var1, Object var2, long var3, long var5, long var7);
   private static native String recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$9(int var0, long var1);
   private static native ArrayList recovery$indy$10(Object var0, Object var1, long var2, long var4, long var6);
   private static native String recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$12(Object var0, Object var1, long var2, long var4);
   private static native ArrayList recovery$indy$13(Object var0, short var1, int var2, short var3, Object var4, Object var5, int var6, long var7, long var9);
   private static native boolean recovery$indy$18(long var0, long var2);
   private static native int recovery$indy$19(Object var0, Object var1, long var2, long var4);
   private static native void recovery$indy$20(Object var0, long var1, long var3);
   private static native void recovery$indy$21(int var0, long var1, long var3);
   private static native boolean recovery$indy$22(long var0, long var2);
   private static native double recovery$indy$23(Object var0, long var1, long var3);
   private static native double recovery$indy$24(Object var0, long var1, long var3);
   private static native double recovery$indy$25(Object var0, long var1, long var3);
   private static native double recovery$indy$26(Object var0, long var1, long var3);
   private static native double recovery$indy$27(Object var0, long var1, long var3);
   private static native double recovery$indy$28(Object var0, long var1, long var3);
   private static native double recovery$indy$29(Object var0, long var1, long var3);
   private static native double recovery$indy$30(Object var0, long var1, long var3);
   private static native double recovery$indy$31(Object var0, long var1, long var3);
   private static native double recovery$indy$32(Object var0, long var1, long var3);
   private static native double recovery$indy$33(Object var0, long var1, long var3);
   private static native double recovery$indy$34(Object var0, long var1, long var3);
   private static native double recovery$indy$35(Object var0, long var1, long var3);
   private static native void recovery$indy$36(Object var0, long var1, long var3);
   private static native boolean recovery$indy$60(long var0, long var2);
   private static native int recovery$indy$61(long var0, long var2);
   private static native int recovery$indy$62(long var0, long var2);
   private static native int recovery$indy$63(long var0, long var2);
   private static native boolean recovery$indy$64(Object var0, Object var1, Object var2, long var3, long var5, long var7);
   private static native void recovery$indy$65(Object var0, int var1, Object var2, int var3, long var4, long var6, long var8);
   private static native boolean recovery$indy$66(long var0, long var2);
   private static native ArrayList recovery$indy$67(long var0, int var2, int var3, long var4, long var6);
   private static native boolean recovery$indy$68(Object var0, long var1, long var3);
   private static native boolean recovery$indy$69(Object var0, long var1, long var3);
   private static native ArrayList recovery$indy$70(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$71(Object var0, Object var1, long var2, Object var4, long var5, long var7);
   private static native boolean recovery$indy$72(Object var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$73(Object var0, long var1, Object var3, long var4, long var6);
   private static native String recovery$indy$74(int var0, long var1);
   private static native C_47Fw recovery$indy$75(ChestStealer_47Qs var0, String var1, ScaledResolution var2);
   private static native boolean recovery$indy$76(long var0, long var2);
   private static native boolean recovery$indy$77(Object var0, long var1, long var3);
   private static native void recovery$indy$78(Object var0, long var1, boolean var3, long var4, long var6);
   private static native boolean recovery$indy$79(Object var0, long var1, long var3);
   private static native void recovery$indy$80(Object var0, long var1, boolean var3, long var4, long var6);
   private static native boolean recovery$indy$81(long var0, long var2);
   private static native boolean recovery$indy$82(Object var0, long var1, Object var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$83(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$84(Object var0, long var1, long var3);
   private static native double recovery$indy$85(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$86(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$87(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$88(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$89(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$90(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$91(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$92(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$93(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native double recovery$indy$94(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native double recovery$indy$95(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native double recovery$indy$96(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native double recovery$indy$97(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native double recovery$indy$98(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native Runnable recovery$indy$99(ChestStealer_47Qs var0, int var1, C_47ph var2);
   private static native Runnable recovery$indy$100(ChestStealer_47Qs var0, int var1, int var2, C_47ph var3);
   private static native Runnable recovery$indy$101(ChestStealer_47Qs var0, int var1, C_47ph var2);
   private static native boolean recovery$indy$102(long var0, long var2);
   private static native boolean recovery$indy$103(Object var0, long var1, long var3);
   private static native boolean recovery$indy$104(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$105(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$106(Object var0, long var1, long var3);
   private static native boolean recovery$indy$107(Object var0, long var1, long var3);
   private static native int recovery$indy$108(Object var0, long var1, long var3);
   private static native boolean recovery$indy$109(Object var0, long var1, long var3, long var5, long var7);
   private static native int recovery$indy$110(Object var0, long var1, long var3);
   private static native boolean recovery$indy$111(Object var0, long var1, long var3, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$112(Object var0, long var1, long var3);
   private static native void recovery$indy$113(Object var0, long var1, long var3);
   private static native boolean recovery$indy$114(long var0, long var2);
   private static native int recovery$indy$115(Object var0, long var1, long var3);
   private static native boolean recovery$indy$116(Object var0, long var1, int var3, long var4, long var6);
   private static native double recovery$indy$117(Object var0, long var1, long var3);
   private static native double recovery$indy$118(Object var0, long var1, long var3);
   private static native void recovery$indy$119(Object var0, long var1, long var3);
   private static native int recovery$indy$120(Object var0, long var1, long var3);
   private static native boolean recovery$indy$121(Object var0, long var1, int var3, long var4, long var6);
   private static native double recovery$indy$122(Object var0, long var1, long var3);
   private static native double recovery$indy$123(Object var0, long var1, long var3);
   private static native void recovery$indy$124(Object var0, long var1, long var3);
   private static native boolean recovery$indy$125(long var0, long var2);
   private static native boolean recovery$indy$126(Object var0, long var1, Object var3, long var4, long var6);
   private static native double recovery$indy$127(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$128(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$129(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$130(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$131(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$132(Object var0, int var1, short var2, short var3, long var4, long var6);
   private static native double recovery$indy$133(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native double recovery$indy$134(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native double recovery$indy$135(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native double recovery$indy$136(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native double recovery$indy$137(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native double recovery$indy$138(long var0, short var2, Object var3, boolean var4, long var5, long var7);
   private static native boolean recovery$indy$139(long var0, long var2);
   private static native int recovery$indy$140(Object var0, Object var1, long var2, long var4);
   private static native double[] recovery$indy$141(long var0, long var2);
   private static native double[] recovery$indy$142(long var0, long var2);
   private static native boolean recovery$indy$143(int var0, long var1, long var3, long var5);
   private static native double recovery$indy$144(Object var0, boolean var1, long var2, long var4, long var6);
   private static native int recovery$indy$145(Object var0, long var1, long var3);
   private static native double recovery$indy$146(Object var0, long var1, long var3);
   private static native boolean recovery$indy$147(long var0, long var2);
   private static native int recovery$indy$148(Object var0, long var1, long var3);
   private static native boolean recovery$indy$149(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$150(Object var0, long var1, long var3);
   private static native boolean recovery$indy$151(long var0, long var2);
   private static native String recovery$indy$152(int var0, long var1);
   private static native String recovery$indy$153(int var0, long var1);
   private static native String recovery$indy$154(int var0, long var1);
   private static native String recovery$indy$155(int var0, long var1);
   private static native String recovery$indy$156(int var0, long var1);
   private static native String recovery$indy$157(int var0, long var1);
   private static native String recovery$indy$158(int var0, long var1);
   private static native boolean recovery$indy$159(Object var0, long var1, boolean var3, long var4, long var6);
   private static native String recovery$indy$160(int var0, long var1);
   private static native void recovery$indy$161(Object var0, long var1, Object var3, int var4, long var5, long var7);
   private static native void recovery$indy$162(Object var0, long var1, long var3);
   private static native boolean recovery$indy$163(Object var0, Object var1, long var2, long var4, long var6);
   private static native void recovery$indy$164(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$165(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$166(Object var0, boolean var1, long var2, long var4, long var6);
   private static native void recovery$indy$167(Object var0, boolean var1, long var2, long var4, long var6);
   private static native void recovery$indy$168(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$197();
}
