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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_43r;
import net.C_45n;
import net.C_473X;
import net.C_474k;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.RangeSetting;
import net.C_47UV;
import net.C_47pL;
import net.C_47pS;
import net.C_47rf;
import net.C_47sT;
import client.module.Category;
import net.C_47xz;
import net.C_48r;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class InventoryClicker_47CO extends client.module.Module implements net.C_47xz,net.C_48r {
    private final client.setting.RangeSetting settingCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCPSRecalculateDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDCPSRecalculateDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_41 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRightClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingForceClickOnItem = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyOnShiftClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyOnLeftClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

   public void method_46$da8c82d5d4() {
   }



    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_40$da8c82d5d4() {
   }



   private boolean method_44$dff6d1d5b7(long var1, C_47pS var3, C_47sT var4) {
      var1 = a ^ var1;
      byte var5 = (byte) ((recovery$indy$1(3731774071480976584L, var1)) ? 1 : 0);
      int var10000 = (int) ((var3 instanceof C_47pL) ? 1 : 0);
      if (var5 == 0) {
         if ((var10000 != 0) && var4 != null) {
            var10000 = (int) ((recovery$indy$2(this.settingRightClick, 3731977958859358517L, var1)) ? 1 : 0);
            if (var5 != 0) {
               return (var10000 != 0);
            }

            if (!(var10000 != 0)) {
               C_47rf var6 = var4.method_48$ac4db64966();
               if (var6 == null) {
                  return false;
               }

               int var7 = 36;

               label140: {
                  while (true) {
                     if (var7 < recovery$indy$3(field_43, 3730714693815754335L, var1).field_429.field_46.size()) {
                        C_47sT var8 = recovery$indy$4(field_43, 3730714693815754335L, var1).field_429.method_46$4c10532da1(var7);
                        var10000 = var5;
                        if (var1 > 0L) {
                           if (var5 == 0) {
                              var10000 = (int) ((var4.equals(var8)) ? 1 : 0);
                              if (var5 != 0) {
                                 break;
                              }

                              if (var10000 != 0) {
                                 return false;
                              }

                              var7++;
                           }

                           var10000 = var5;
                        }

                        if (var10000 == 0) {
                           continue;
                        }
                     }

                     if (var1 < 0L) {
                        break label140;
                     }

                     var10000 = (byte)36;
                     break;
                  }

                  var7 = var10000;
               }

               while (var7 < recovery$indy$5(field_43, 3730714693815754335L, var1).field_429.field_46.size()) {
                  C_47sT var12 = recovery$indy$6(field_43, 3730714693815754335L, var1).field_429.method_46$4c10532da1(var7);
                  C_47rf var9 = var12.method_48$ac4db64966();
                  C_47rf var15 = var9;
                  if (var5 == 0) {
                     if (var9 == null) {
                        return false;
                     }

                     var15 = var9;
                  }

                  C_43r var10 = var15.method_48$dbd570a038();
                  var10000 = var5;
                  if (var1 >= 0L) {
                     if (var5 == 0) {
                        label157: {
                           var10000 = (int) ((var10.getClass().equals(var6.method_48$dbd570a038().getClass())) ? 1 : 0);
                           if (var1 > 0L) {
                              if (var10000 == 0) {
                                 break label157;
                              }

                              var10000 = (int) ((var6.method_47$aae029aa0a()) ? 1 : 0);
                           }

                           int var10001 = var5;
                           if (var1 > 0L) {
                              if (var5 == 0) {
                                 if (var10000 == 0) {
                                    break label157;
                                 }

                                 var10000 = var9.field_47;
                              }

                              var10001 = var5;
                           }

                           if (var1 > 0L) {
                              if (var10001 != 0) {
                                 return var10000 != 0;
                              }

                              var10001 = var9.method_44$8abf5c6871();
                           }

                           if (var10000 < var10001) {
                              return false;
                           }
                        }

                        var7++;
                     }

                     var10000 = var5;
                  }

                  if (var10000 != 0) {
                     break;
                  }
               }

               return true;
            }
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }




    public void method_49$54482ee18e(long key, net.C_47UV event) {
        long slotKey = key ^ 113791335136992L;
        long timerKey = key ^ 105415764910866L;
        long buttonKey = key ^ 78260114529232L;
        long keyboardKey = key ^ 82315591646938L;
        long countKey = key ^ 71028462864835L;
        long hitKey = key ^ 95954280950485L;
        boolean guard = recovery$indy$flow$34(-8962233771960453986L, key);
        boolean screenAllowed = recovery$indy$flow$37(recovery$indy$flow$36(recovery$indy$flow$35(), -8962181121507955046L, key));
        boolean cancelEvent;
        if (guard) {
            cancelEvent = screenAllowed;
        } else {
            if (!screenAllowed) return;
            boolean setting;
            boolean readInitialSetting = true;
            if (recovery$indy$flow$39(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingOnlyOnShiftClick)), -8963019438596230813L, key)) {
                if (!recovery$indy$flow$40(42, keyboardKey, -8965668060737762037L, key)) {
                    boolean alternateKey = recovery$indy$flow$41(54, keyboardKey, -8965668060737762037L, key);
                    if (key > 0L && !alternateKey) return;
                    if (key <= 0L) {
                        screenAllowed = alternateKey;
                        readInitialSetting = false;
                    }
                }
            }
            setting = readInitialSetting ? recovery$indy$flow$43(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingOnlyOnShiftClick)), -8963019438596230813L, key) : screenAllowed;
            boolean readCancellationSetting = true;
            if (setting && recovery$indy$flow$45(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingOnlyOnLeftClick)), -8963019438596230813L, key)) {
                boolean buttonDown = recovery$indy$flow$46(0, buttonKey, -8966501600563239320L, key);
                if (key > 0L) {
                    if (!buttonDown) return;
                } else {
                    setting = buttonDown;
                    readCancellationSetting = false;
                }
            }
            if (readCancellationSetting) setting = recovery$indy$flow$48(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingOnlyOnShiftClick)), -8963019438596230813L, key);
            cancelEvent = setting && recovery$indy$flow$50(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingOnlyOnLeftClick)), -8963019438596230813L, key);
        }
        if (cancelEvent) recovery$indy$flow$51(event, true, -8962520932943165207L, key);
        Object screen = ((java.lang.Object)(((net.C_47pS) (((java.lang.Object)(recovery$indy$flow$53(recovery$indy$flow$52(), -8962181121507955046L, key)))))));
        Object firstTimer = ((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).field_41));
        int firstInterval = recovery$indy$flow$57(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingCPSRecalculateDelay)), -8962483591822359856L, key);
        boolean elapsed = recovery$indy$flow$58(firstTimer, timerKey, firstInterval, -8962672625895510232L, key);
        int mouseX;
        if (guard) {
            mouseX = elapsed ? 1 : 0;
        } else {
            if (key > 0L) {
                if (elapsed) {
                    recovery$indy$flow$60(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).field_41)), -8966292107436259259L, key);
                    recovery$indy$flow$62(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingCPSRecalculateDelay)), -8962336475387234799L, key);
                    recovery$indy$flow$64(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingCPS)), -8962336475387234799L, key);
                }
                Object secondTimer = ((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).field_47));
                int secondInterval = recovery$indy$flow$67(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingDCPSRecalculateDelay)), -8962483591822359856L, key);
                elapsed = recovery$indy$flow$68(secondTimer, timerKey, secondInterval, -8962672625895510232L, key);
            }
            if (elapsed) {
                recovery$indy$flow$70(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).field_47)), -8966292107436259259L, key);
                recovery$indy$flow$72(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingDCPSRecalculateDelay)), -8962336475387234799L, key);
                recovery$indy$flow$74(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingDCPS)), -8962336475387234799L, key);
            }
            mouseX = recovery$indy$flow$75();
        }
        int mouseY = recovery$indy$flow$76();
        Object slot = recovery$indy$flow$77(this, slotKey, screen, mouseX, mouseY, -8962585818476917234L, key);
        boolean blocked = recovery$indy$flow$78(this, hitKey, screen, slot, -8965800826474903192L, key);
        if (guard) {
            if (key >= 0L) return;
            while (true) recovery$indy$flow$96(event, -8966182086031290027L, key);
        }
        if ((key >= 0L && blocked) || (key > 0L && recovery$indy$flow$79(this))) {
            recovery$indy$flow$80(this, blocked);
            return;
        }
        recovery$indy$flow$81(this, false);
        Object rate = ((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).field_45));
        int interval = recovery$indy$flow$84(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingCPS)), -8962483591822359856L, key);
        int clickCount = recovery$indy$flow$85(rate, interval, countKey, -8966128104562843565L, key);
        if (key >= 0L && clickCount > 0) {
            Object extraRate = ((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).field_48));
            int extraInterval = recovery$indy$flow$88(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingDCPS)), -8962483591822359856L, key);
            clickCount += recovery$indy$flow$89(extraRate, extraInterval, countKey, -8966128104562843565L, key);
        }
        if (clickCount == 0 && recovery$indy$flow$91(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingForceClickOnItem)), -8963019438596230813L, key) && slot != null && recovery$indy$flow$92(slot)) clickCount++;
        int clicks = 0;
        while (true) {
            if (clicks >= clickCount) {
                if (key > 0L) return;
                recovery$indy$flow$96(event, -8966182086031290027L, key);
                clicks++;
                continue;
            }
            boolean primary = recovery$indy$flow$94(((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingRightClick)), -8963019438596230813L, key);
            if (key < 0L) {
                if (!primary) continue;
                recovery$indy$flow$96(event, -8966182086031290027L, key);
                clicks++;
            } else if (primary) {
                recovery$indy$flow$95(event, -8965746440284171425L, key);
                if (key > 0L) clicks++;
            } else {
                recovery$indy$flow$96(event, -8966182086031290027L, key);
                clicks++;
            }
        }
    }






   private C_47sT method_47$2a975f26e6(long var1, C_47pS var3, int var4, int var5) {
      var1 = a ^ var1;
      ScaledResolution var7 = new ScaledResolution(field_43);
      boolean var10000 = recovery$indy$39(7493106339739881725L, var1);
      int var8 = 0;
      boolean var6 = var10000;

      while (var8 < var3.field_46M.field_46.size()) {
         C_47sT var9 = var3.field_46M.method_46$4c10532da1(var8);
         int var10 = var7.method_46$8abf5c6871();
         int var11 = var7.method_48$8abf5c6871();
         int var12 = var4 * var10 / field_43.field_44f;
         int var13 = var11 - var5 * var11 / field_43.field_44g - 1;
         var10000 = var6;
         if (var1 > 0L) {
            if (!var6) {
               if (var3.method_49$37a42ef72d(var9, var12, var13)) {
                  return var9;
               }

               var8++;
            }

            var10000 = var6;
         }

         if (var10000) {
            break;
         }
      }

      return null;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$40(this, 40, var3, -7098953951799609326L, var1);
      recovery$indy$41(this, 51, var3, -7098953951799609326L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_489$e45a9973e5(long var1) {
      recovery$indy$42(this.field_41, 4174123117150214866L, var1);
      recovery$indy$43(this.field_47, 4174123117150214866L, var1);
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public InventoryClicker_47CO(long a0) {
        super((java.lang.String) ("InventoryClicker"),(java.lang.String) ("AutomatischesInventarClicken"),(long) (((augustus.recovered.modules.legit.InventoryClicker_47CO.a ^ a0) ^ 137471525731930L)),(java.awt.Color) (new java.awt.Color((int) (119),(int) (234),(int) (247))),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.legit.InventoryClicker_47CO.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.legit.InventoryClicker_47CO.a ^ a0) ^ 30010973389506L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.legit.InventoryClicker_47CO.a ^ a0) ^ 30010973389506L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.legit.InventoryClicker_47CO.a ^ a0) ^ 30010973389506L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.legit.InventoryClicker_47CO.a ^ a0) ^ 6539256067964L);
        long constructorKey7 = ((augustus.recovered.modules.legit.InventoryClicker_47CO.a ^ a0) ^ 57513673414567L);
        long constructorKey8 = ((augustus.recovered.modules.legit.InventoryClicker_47CO.a ^ a0) ^ 13344846373441L);
        short converted9 = (short) (constructorPart4);
        short converted10 = (short) (constructorPart5);
        client.setting.RangeSetting initialized11 = new client.setting.RangeSetting(constructorPart3, this, " CPS", Double.longBitsToDouble(4625196817309499392L), Double.longBitsToDouble(4625478292286210048L), converted9, 0.0D, Double.longBitsToDouble(4630826316843712512L), 0, converted10);
        recovery$indy$flow$122(this, initialized11);
        short converted12 = (short) (constructorPart4);
        short converted13 = (short) (constructorPart5);
        client.setting.RangeSetting initialized14 = new client.setting.RangeSetting(constructorPart3, this, " CPS recalculate delay", Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), converted12, 0.0D, Double.longBitsToDouble(4629137466983448576L), 0, converted13);
        long initialValue15 = constructorKey7;
        client.setting.RangeSetting initialValue16 = initialized14;
        java.lang.Object initialValue17 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue16))))));
        java.lang.Object initialValue18 = recovery$indy$flow$126(initialValue17, initialValue15);
        recovery$indy$flow$127(this, initialValue18);
        short converted19 = (short) (constructorPart4);
        short converted20 = (short) (constructorPart5);
        client.setting.RangeSetting initialized21 = new client.setting.RangeSetting(constructorPart3, this, " DCPS", Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4617315517961601024L), converted19, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted20);
        recovery$indy$flow$130(this, initialized21);
        short converted22 = (short) (constructorPart4);
        short converted23 = (short) (constructorPart5);
        client.setting.RangeSetting initialized24 = new client.setting.RangeSetting(constructorPart3, this, " DCPS recalculate delay", Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), converted22, 0.0D, Double.longBitsToDouble(4629137466983448576L), 0, converted23);
        long initialValue25 = constructorKey7;
        client.setting.RangeSetting initialValue26 = initialized24;
        java.lang.Object initialValue27 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue28 = recovery$indy$flow$134(initialValue27, initialValue25);
        recovery$indy$flow$135(this, initialValue28);
        net.C_474k initialized29 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$138(this, initialized29);
        net.C_474k initialized30 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$141(this, initialized30);
        net.C_473X initialized31 = new net.C_473X();
        recovery$indy$flow$144(this, initialized31);
        net.C_473X initialized32 = new net.C_473X();
        recovery$indy$flow$147(this, initialized32);
        client.setting.BooleanSetting initialized33 = new client.setting.BooleanSetting(this, constructorKey8, "RightClick", false);
        recovery$indy$flow$150(this, initialized33);
        client.setting.BooleanSetting initialized34 = new client.setting.BooleanSetting(this, constructorKey8, "ForceClickOnItem", false);
        recovery$indy$flow$153(this, initialized34);
        client.setting.BooleanSetting initialized35 = new client.setting.BooleanSetting(this, constructorKey8, "OnlyOnShiftClick", true);
        recovery$indy$flow$156(this, initialized35);
        client.setting.BooleanSetting initialized36 = new client.setting.BooleanSetting(this, constructorKey8, "OnlyOnLeftClick", true);
        java.lang.Object initialValue37 = ((java.lang.Object)(((augustus.recovered.modules.legit.InventoryClicker_47CO) (((java.lang.Object)(this)))).settingOnlyOnShiftClick));
        java.lang.Object initialValue38 = recovery$indy$flow$160(initialValue37);
        java.lang.Object initialValue39 = recovery$indy$flow$161(initialValue37);
        java.lang.Object initialValue40 = initialValue39;
        long initialValue41 = constructorKey6;
        client.setting.BooleanSetting initialValue42 = initialized36;
        java.lang.Object initialValue43 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue42))))));
        java.lang.Object initialValue44 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue45 = recovery$indy$flow$164(initialValue43, initialValue41, initialValue44);
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue45))))));
        recovery$indy$flow$166(this, initialValue46);
        recovery$indy$flow$167(this, false);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native boolean recovery$indy$flow$34(long a0,long a1);
    private static java.lang.Object recovery$indy$flow$35() {
        return augustus.recovered.modules.legit.InventoryClicker_47CO.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$36(java.lang.Object a0,long a1,long a2);
    private static boolean recovery$indy$flow$37(java.lang.Object a0) {
        return (a0 instanceof net.C_47pS);
    }

    private static native boolean recovery$indy$flow$39(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$40(int a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$41(int a0,long a1,long a2,long a3);

    private static native boolean recovery$indy$flow$43(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$45(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$46(int a0,long a1,long a2,long a3);

    private static native boolean recovery$indy$flow$48(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$50(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$51(java.lang.Object a0,boolean a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$52() {
        return augustus.recovered.modules.legit.InventoryClicker_47CO.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$53(java.lang.Object a0,long a1,long a2);



    private static native int recovery$indy$flow$57(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$58(java.lang.Object a0,long a1,int a2,long a3,long a4);

    private static native void recovery$indy$flow$60(java.lang.Object a0,long a1,long a2);

    private static native double recovery$indy$flow$62(java.lang.Object a0,long a1,long a2);

    private static native double recovery$indy$flow$64(java.lang.Object a0,long a1,long a2);


    private static native int recovery$indy$flow$67(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$68(java.lang.Object a0,long a1,int a2,long a3,long a4);

    private static native void recovery$indy$flow$70(java.lang.Object a0,long a1,long a2);

    private static native double recovery$indy$flow$72(java.lang.Object a0,long a1,long a2);

    private static native double recovery$indy$flow$74(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$75();
    private static native int recovery$indy$flow$76();
    private static native java.lang.Object recovery$indy$flow$77(java.lang.Object a0,long a1,java.lang.Object a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$78(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,long a4,long a5);
    private static boolean recovery$indy$flow$79(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.InventoryClicker_47CO) (a0)).field_43a;
    }
    private static void recovery$indy$flow$80(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.InventoryClicker_47CO) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$81(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.InventoryClicker_47CO) (a0)).field_43a = a1;
        return;
    }


    private static native int recovery$indy$flow$84(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$85(java.lang.Object a0,int a1,long a2,long a3,long a4);


    private static native int recovery$indy$flow$88(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$89(java.lang.Object a0,int a1,long a2,long a3,long a4);

    private static native boolean recovery$indy$flow$91(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$92(java.lang.Object a0);

    private static native boolean recovery$indy$flow$94(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$95(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$96(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$122(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$126(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$127(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$130(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$134(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$135(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$138(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$141(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$144(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$147(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$150(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$153(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$156(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$160(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$161(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$164(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$166(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$167(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.InventoryClicker_47CO) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$39(long var0, long var2);
   private static native void recovery$indy$40(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$41(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$42(Object var0, long var1, long var3);
   private static native void recovery$indy$43(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$45();
}
