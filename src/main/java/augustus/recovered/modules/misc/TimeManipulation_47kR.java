package augustus.recovered.modules.misc;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_471S;
import net.C_476v;
import net.minecraft.client.gui.ScaledResolution;
import net.C_478i;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Bs;
import net.C_47F9;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import net.C_47oo;
import client.ClientGlobals;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class TimeManipulation_47kR extends client.module.Module implements client.event.RenderListener,net.C_47oO,net.C_471S {
    private final net.C_47cu field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47cu field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMinTicksAvailable = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMaxChargingTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCorrect = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingAutoCharge = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSneakCharge = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingUpdateEntityPositions = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingResetAtWorldChange = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingTimerRangeBool = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.SettingGroup settingTimerRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTimerTicksForward = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTolerance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyOnGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDynamic = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyKillAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingClickCheck = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingForbiddenSneak = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] field_40; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   public boolean method_42$7785f50f96(char var1, int var2, short var3, int var4) {
      long var5;
      long var7;
      long var9;
      int var11;
      int[] var17;
      byte var10000;
      label59: {
         var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
         var7 = var5 ^ 77133213201009L;
         var9 = (var5 ^ 118388257132103L) >>> 8;
         var11 = (int)((var5 ^ 118388257132103L) << 56 >>> 56);
         long var10001 = var5 ^ 26431463575961L;
         int var12 = (int)((var5 ^ 26431463575961L) >>> 32);
         int var13 = (int)((var5 ^ 26431463575961L) << 32 >>> 48);
         int var14 = (int)(var10001 << 48 >>> 48);
         long var15 = var5 ^ 63937699079892L;
         var17 = recovery$indy$1(-277969011711580898L, var5);
         label58:
         if (recovery$indy$2(field_43, -278998076462039972L, var5) != null) {
            var10000 = (byte) ((recovery$indy$3(this, var12, (char)var13, (short)var14, -270668800257047461L, var5)) ? 1 : 0);
            int[] var20 = var17;
            if (var1 >= 0) {
               if (var17 == null) {
                  if (var10000 == 0) {
                     break label58;
                  }

                  double var21;
                  var10000 = (byte)((var21 = var4 - recovery$indy$4(this.settingMaxChargingTicks, true, var15, -278473430329898562L, var5)) == 0.0
                     ? 0
                     : (var21 < 0.0 ? -1 : 1));
               }

               var20 = var17;
            }

            if (var20 != null) {
               break label59;
            }

            if (var10000 < 0) {
               var10000 = 1;
               break label59;
            }
         }

         var10000 = 0;
      }

      byte var18 = var10000;
      if (recovery$indy$5(field_43, -278998076462039972L, var5) != null) {
         boolean var19 = recovery$indy$6(ClientGlobals.field_48.field_412, var7, -278803774717376442L, var5);
         if (var17 != null) {
            return var19;
         }

         if (var19) {
            var19 = recovery$indy$7(ClientGlobals.field_48.field_412.settingTimeManipulation, -277052315741970846L, var5);
            if (var17 != null) {
               return var19;
            }

            if (var19) {
               recovery$indy$9(
                  ClientGlobals.field_48.field_412, var9, (byte)var11, recovery$indy$8(19269, 8472154986848155776L ^ var5) + var4, -278049165126533172L, var5
               );
            }
         }
      }

      return var18 != 0;
   }




    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$e45a9973e5(long var1) {
      var1 = a ^ var1;
      int[] var3 = recovery$indy$10(-1779143173462786443L, var1);
      if (recovery$indy$11(field_43, -1780113903148913665L, var1) != null) {
         int var4 = 0;

         while (var4 < recovery$indy$12(field_43, -1780113903148913665L, var1).field_44Q.size()) {
            Entity var5 = (Entity)recovery$indy$13(field_43, -1780113903148913665L, var1).field_44Q.get(var4);
            int[] var10000 = var3;
            if (var1 > 0L) {
               if (var3 == null) {
                  if (!(var5 instanceof EntityPlayerSP)) {
                     recovery$indy$14(field_43, -1780113903148913665L, var1).method_43$758fc8f1b9(var5);
                  }

                  var4++;
               }

               var10000 = var3;
            }

            if (var10000 != null) {
               break;
            }
         }
      }
   }



   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      int var8 = (int)(field_43.field_42A - field_43.field_446);
      recovery$indy$15(field_43, 1632984891424410388L, var6)
         .method_43$7961e3f788(
            "" + var8,
            var5.method_46$8abf5c6871() - recovery$indy$16(field_43, 1632984891424410388L, var6).method_48$2f485d5ba3("" + var8),
            var5.method_48$8abf5c6871() - 30,
            -1
         );
      RenderUtils.method_41$da8c82d5d4();
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      if (recovery$indy$17(this.settingResetAtWorldChange, 3264536289617366792L, var5)) {
         field_43.field_446 = 0L;
         field_43.field_42A = 0L;
      }
   }



   public static void method_45$05a886777b(String[] var0) {
      field_40 = var0;
   }



   public void method_45$6c53b83f97(C_476v var1, long var2) {
   }



   public static String[] method_45$44c5829186() {
      return field_40;
   }



    private boolean method_45$72571b8176(int upperKey, char middleKey, short lowerKey) {
        long key = (((long) upperKey << 32) | (((long) middleKey << 48) >>> 32) | (((long) lowerKey << 48) >>> 48)) ^ recovery$indy$flow$73();
        long inputKey = key ^ 33201146238888L;
        long intervalKey = key ^ 70492761524247L;
        long keyboardKey = key ^ 21728026555042L;
        long contextKey = key ^ 97957299018913L;
        Object guard = recovery$indy$flow$74(1147036095277995729L, key);
        boolean allowed = recovery$indy$flow$76(((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingSneakCharge)), 1146400899447778733L, key);
        if (guard == null && allowed) {
            Object settings = ((java.lang.Object)(((net.C_47oo) (((java.lang.Object)(recovery$indy$flow$78(recovery$indy$flow$77(), 1147156612859825558L, key))))).field_44q));
            int inputCode = recovery$indy$flow$80(settings);
            allowed = recovery$indy$flow$81(inputCode, keyboardKey, 1148781431066910170L, key);
            if (lowerKey < 0 && allowed) allowed = recovery$indy$flow$83(recovery$indy$flow$82(), 1148224149835952648L, key);
        }
        boolean timerEnabled = recovery$indy$flow$85(((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingAutoCharge)), 1146400899447778733L, key);
        if (guard != null) return timerEnabled;
        if (timerEnabled) {
            boolean resetTimer = true;
            evaluateTimer: {
                Object game = recovery$indy$flow$86();
                if (middleKey > 0) {
                    if (recovery$indy$flow$87(game, 1147496293772209226L, key) != null) break evaluateTimer;
                    game = recovery$indy$flow$88();
                }
                if (recovery$indy$flow$89(game, 1148329196904484755L, key) == null) break evaluateTimer;
                if (recovery$indy$flow$91(recovery$indy$flow$90(), 1148385073070588763L, key) == null) break evaluateTimer;
                boolean blocked = recovery$indy$flow$92(contextKey, 1146759750255116662L, key);
                if (upperKey < 0 || blocked) break evaluateTimer;
                Object player = recovery$indy$flow$94(recovery$indy$flow$93(), 1148329196904484755L, key);
                if (recovery$indy$flow$95(player) <= 20) break evaluateTimer;
                if (recovery$indy$flow$96(0, inputKey, 1146941025543917467L, key)) break evaluateTimer;
                if (lowerKey <= 0 && recovery$indy$flow$97(1, inputKey, 1146941025543917467L, key)) break evaluateTimer;
                boolean directTimerCall = false;
                boolean timerReady = false;
                for (int inputCode = 0; inputCode < 223; inputCode++) {
                    if (!recovery$indy$flow$98(inputCode, keyboardKey, 1148781431066910170L, key)) continue;
                    Object timer = ((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).field_44));
                    if (lowerKey > 0) {
                        timerReady = recovery$indy$flow$102(timer, 1147954016651018128L, key, 1147579890979927518L, key);
                        directTimerCall = true;
                    } else {
                        recovery$indy$flow$100(timer, 1147954016651018128L, key);
                    }
                    break;
                }
                if (!directTimerCall) timerReady = recovery$indy$flow$102(((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).field_44)), 100L, intervalKey, 1147579890979927518L, key);
                if (upperKey <= 0) return timerReady || allowed;
                if (timerReady) allowed = true;
                resetTimer = false;
            }
            if (resetTimer) recovery$indy$flow$104(((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).field_44)), 1147954016651018128L, key);
        }
        return recovery$indy$flow$106(((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingTimerRangeBool)), 1146400899447778733L, key) || allowed;
    }





   public void method_47$4ff7ee0874(char var1, C_476v var2, int var3, short var4) {
      net.minecraft.client.Minecraft var61;
      int[] var74;
      int[] var76;
      int[] var77;
      int[] var78;
      int[] var79;
      client.module.ModuleManager var63;
      net.minecraft.entity.Entity var65;
      int[] var66;
      client.module.ModuleManager var67;
      augustus.recovered.modules.combat.KillAura_47CY var68;
      augustus.recovered.modules.legit.Range_47CT var70;
      double var69;
      int[] var81;
      long var5 = (long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 30240856810840L;
      long var10001 = var5 ^ 62607245788395L;
      int var9 = (int)((var5 ^ 62607245788395L) >>> 48);
      int var10 = (int)((var5 ^ 62607245788395L) << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      long var12 = (var5 ^ 59418393827694L) >>> 8;
      int var14 = (int)((var5 ^ 59418393827694L) << 56 >>> 56);
      long var15 = var5 ^ 53107930430590L;
      long var17 = var5 ^ 70751344748413L;
      long var19 = var5 ^ 138893530082545L;
      long var21 = var5 ^ 138554768363439L;
      long var23 = var5 ^ 105472760025927L;
      int[] var25 = recovery$indy$36(3102180858704933431L, var5);
      int var10000 = (int) ((recovery$indy$37(this.settingTimerRangeBool, 3102676424750975307L, var5)) ? 1 : 0);
      if (var25 == null) {
         if (!(var10000 != 0)) {
            return;
         }

         var10000 = (int) ((recovery$indy$38(var15, 3101968268422089673L, var5)) ? 1 : 0);
      }

      label501: {
         label507: {
            if (var25 == null) {
               if ((var10000) != 0) {
                  return;
               }

               var61 = field_43;
               var74 = var25;
               if (var4 <= 0) {
                  break label501;
               }

               if (var25 != null) {
                  break label507;
               }

               var10000 = (int) ((recovery$indy$39(field_43, 3101134654178596590L, var5)) ? 1 : 0);
            }

            if (!(var10000 != 0)) {
               return;
            }

            var61 = field_43;
         }

         var74 = var25;
      }

      if (var74 == null) {
         if (recovery$indy$40(var61, 3101252183194920893L, var5) == null) {
            return;
         }

         var61 = field_43;
      }

      if (recovery$indy$41(var61, 3101169368960379765L, var5) != null) {
         var10000 = (int) ((recovery$indy$42(ClientGlobals.field_48.field_48i, var7, 3100764454114828143L, var5)) ? 1 : 0);
         int[] var75 = var25;
         if (var3 >= 0) {
            if (var25 == null) {
               if (var10000 != 0) {
                  return;
               }

               var10000 = (int) ((ClientGlobals.field_48.field_46O.field_41L) ? 1 : 0);
            }

            var75 = var25;
         }

         label473: {
            label472:
            if (var75 == null) {
               if (var10000 != 0) {
                  var10000 = (int) ((recovery$indy$43(ClientGlobals.field_48.field_46O, var7, 3100764454114828143L, var5)) ? 1 : 0);
                  var76 = var25;
                  if (var3 <= 0) {
                     break label473;
                  }

                  if (var25 != null) {
                     break label472;
                  }

                  if (var10000 != 0) {
                     return;
                  }
               }

               var10000 = (int) ((recovery$indy$44(this.settingForbiddenSneak, 3102676424750975307L, var5)) ? 1 : 0);
            }

            var76 = var25;
         }

         label460: {
            label459:
            if (var76 == null) {
               if (var10000 != 0) {
                  var10000 = (int) ((recovery$indy$45(field_43, 3101169368960379765L, var5).method_48g$aae029aa0a()) ? 1 : 0);
                  var77 = var25;
                  if (var4 < 0) {
                     break label460;
                  }

                  if (var25 != null) {
                     break label459;
                  }

                  if (var10000 != 0) {
                     return;
                  }
               }

               var10000 = (int) ((recovery$indy$46(this.settingClickCheck, 3102676424750975307L, var5)) ? 1 : 0);
            }

            var77 = var25;
         }

         label447: {
            label446:
            if (var77 == null) {
               if (var10000 != 0) {
                  var10000 = (int) ((recovery$indy$47(field_43, 3102340857790409072L, var5).field_44l.method_42$aae029aa0a()) ? 1 : 0);
                  var78 = var25;
                  if (var4 < 0) {
                     break label447;
                  }

                  if (var25 != null) {
                     break label446;
                  }

                  if (var10000 == 0) {
                     return;
                  }
               }

               var10000 = (int) ((recovery$indy$48(this.settingOnlyOnGround, 3102676424750975307L, var5)) ? 1 : 0);
            }

            var78 = var25;
         }

         label434: {
            label433:
            if (var78 == null) {
               if (var10000 != 0) {
                  var10000 = (int) ((recovery$indy$49(field_43, 3101169368960379765L, var5).field_48M) ? 1 : 0);
                  var79 = var25;
                  if (var4 < 0) {
                     break label434;
                  }

                  if (var25 != null) {
                     break label433;
                  }

                  if (var10000 == 0) {
                     return;
                  }
               }

               var10000 = ((int) (recovery$indy$51(
                  this.field_42, (long)recovery$indy$50(this.settingDelay, var17, 3102575117390244128L, var5), var19, 3101638304789582136L, var5
               ) ? 1 : 0));
            }

            var79 = var25;
         }

         if (var1 >= 0) {
            if (var79 == null) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = (int) ((recovery$indy$52(ClientGlobals.field_48.field_48Q, var7, 3100764454114828143L, var5)) ? 1 : 0);
            }

            var79 = var25;
         }

         label414: {
            label514: {
               if (var4 >= 0) {
                  if (var79 == null) {
                     label408: {
                        if (var10000 != 0) {
                           var63 = ClientGlobals.field_48;
                           if (var25 != null) {
                              break label408;
                           }

                           if (ClientGlobals.field_48.field_48Q.field_45z != null) {
                              break label514;
                           }
                        }

                        var63 = ClientGlobals.field_48;
                     }

                     var10000 = (int) ((recovery$indy$53(var63.field_46e, var7, 3100764454114828143L, var5)) ? 1 : 0);
                  }

                  var79 = var25;
               }

               if (var1 >= 0) {
                  if (var79 == null) {
                     if (var10000 != 0 && ClientGlobals.field_48.field_46e.field_43c != null) {
                        break label514;
                     }

                     var10000 = (int) ((recovery$indy$54(this.settingOnlyKillAura, 3102676424750975307L, var5)) ? 1 : 0);
                  }

                  var79 = var25;
               }

               if (var79 != null) {
                  break label414;
               }

               if (var10000 != 0) {
                  return;
               }
            }

            var10000 = (int)recovery$indy$55(this.settingTimerTicksForward, var17, 3102575117390244128L, var5);
         }

         int var26 = var10000;

         label385:
         do {
            var10000 = var26;

            label381:
            while (true) {
               if (var10000 < 1) {
                  return;
               }

               Iterator var27 = recovery$indy$56(field_43, 3101252183194920893L, var5).field_44Q.iterator();

               while (true) {
                  label377:
                  while (true) {
                     if (!var27.hasNext()) {
                        break label381;
                     }

                     Entity var28 = (Entity)var27.next();
                     var10000 = (int) ((var28 instanceof EntityLivingBase) ? 1 : 0);
                     if (var3 < 0) {
                        continue label381;
                     }

                     int[] var80 = var25;

                     label374:
                     while (true) {
                        if (var80 != null) {
                           continue label381;
                        }

                        var80 = var25;
                        if (var4 >= 0) {
                           if (var4 > 0) {
                              if (var25 == null) {
                                 if (var10000 == 0) {
                                    continue label377;
                                 }

                                 var10000 = (int) ((recovery$indy$57(this.settingOnlyKillAura, 3102676424750975307L, var5)) ? 1 : 0);
                              }

                              var80 = var25;
                           }

                           label521: {
                              if (var80 == null) {
                                 if (var10000 != 0) {
                                    var28 = recovery$indy$58((EntityLivingBase)var28, var21, 3101709891608989592L, var5);
                                 }

                                 var65 = var28;
                                 if (var25 != null) {
                                    break label521;
                                 }

                                 var10000 = (int) ((var28 instanceof C_47Bs) ? 1 : 0);
                              }

                              if (var10000 == 0) {
                                 break;
                              }

                              var65 = var28;
                           }

                           C_47Bs var29 = (C_47Bs)var65;
                           float var30 = var29.field_48w / 2.0F;
                           float var31 = var29.field_48;
                           int var32 = var29.field_40;
                           double var33 = var29.field_48Q + (var29.field_43s - var29.field_48Q) / Math.max(1, var32);
                           double var35 = var29.field_48j + (var29.field_438 - var29.field_48j) / Math.max(1, var32);
                           double var37 = var29.field_42o + (var29.field_45 - var29.field_42o) / Math.max(1, var32);
                           var32--;
                           int var39 = 0;

                           while (var39 < var26) {
                              var33 = var29.field_48Q + (var29.field_43s - var29.field_48Q) / Math.max(1, var32);
                              var35 = var29.field_48j + (var29.field_438 - var29.field_48j) / Math.max(1, var32);
                              var37 = var29.field_42o + (var29.field_45 - var29.field_42o) / Math.max(1, var32);
                              var32--;
                              var39++;
                              var66 = var25;
                              if (var4 <= 0) {
                                 break label377;
                              }

                              if (var25 != null) {
                                 break label374;
                              }

                              if (var25 != null) {
                                 break;
                              }
                           }

                           float var59 = var28.method_42$bc607678b6();
                           C_478i var40 = new C_478i(var33 - var30, var35, var37 - var30, var33 + var30, var35 + var31, var37 + var30);
                           var40 = var40.method_42$800791f322(var59, var59, var59);
                           double[] var41 = recovery$indy$60(var26, var23, recovery$indy$59(field_43, 3101169368960379765L, var5), 3101346708618790956L, var5);
                           double var42 = recovery$indy$61(field_43, 3101169368960379765L, var5).method_47$b2124a4855().field_40
                              + (var41[0] - recovery$indy$62(field_43, 3101169368960379765L, var5).method_47$b2124a4855().field_40) / 3.0;
                           double var44 = recovery$indy$63(field_43, 3101169368960379765L, var5).method_47$b2124a4855().field_41
                              + (var41[1] - recovery$indy$64(field_43, 3101169368960379765L, var5).method_47$b2124a4855().field_41) / 3.0;
                           double var46 = recovery$indy$65(field_43, 3101169368960379765L, var5).method_47$b2124a4855().field_47
                              + (var41[2] - recovery$indy$66(field_43, 3101169368960379765L, var5).method_47$b2124a4855().field_47) / 3.0;
                           C_47tf var48 = new C_47tf(
                              var41[3], var41[4] + recovery$indy$67(field_43, 3101169368960379765L, var5).method_41$bc607678b6(), var41[5]
                           );
                           C_47tf var49 = new C_47tf(
                              C_47sk.method_45$4b58f7ab41(var48.field_40, var40.field_48, var40.field_42),
                              C_47sk.method_45$4b58f7ab41(var48.field_41, var40.field_46, var40.field_47),
                              C_47sk.method_45$4b58f7ab41(var48.field_47, var40.field_44, var40.field_40)
                           );
                           C_478i var50 = var29.method_45$6684d3c618().method_42$800791f322(var59, var59, var59);
                           C_47tf var51 = recovery$indy$68(field_43, 3101169368960379765L, var5).method_49$41b79b67a0(1.0F);
                           C_47tf var52 = new C_47tf(
                              C_47sk.method_45$4b58f7ab41(var51.field_40, var50.field_48, var50.field_42),
                              C_47sk.method_45$4b58f7ab41(var51.field_41, var50.field_46, var50.field_47),
                              C_47sk.method_45$4b58f7ab41(var51.field_47, var50.field_44, var50.field_40)
                           );
                           C_47tf var53 = new C_47tf(var29.field_43s, var29.field_438 + var29.method_41$bc607678b6(), var29.field_45);
                           var10000 = (int) ((recovery$indy$69(ClientGlobals.field_48.field_48Q, var7, 3100764454114828143L, var5)) ? 1 : 0);
                           var80 = var25;
                           if (var3 > 0) {
                              label344: {
                                 label343: {
                                    label524: {
                                       if (var25 == null) {
                                          label339: {
                                             if (var10000 != 0) {
                                                var67 = ClientGlobals.field_48;
                                                if (var25 != null) {
                                                   break label339;
                                                }

                                                var68 = ClientGlobals.field_48.field_48Q;
                                                if (var4 < 0) {
                                                   break label343;
                                                }

                                                if (ClientGlobals.field_48.field_48Q.field_45z != null) {
                                                   var68 = ClientGlobals.field_48.field_48Q;
                                                   break label343;
                                                }
                                             }

                                             var67 = ClientGlobals.field_48;
                                          }

                                          var70 = var67.field_41L;
                                          if (var25 != null) {
                                             break label524;
                                          }

                                          var10000 = (int) ((recovery$indy$70(var67.field_41L, (char)var9, (short)var10, var11, 3100944384147238961L, var5)) ? 1 : 0);
                                       }

                                       if (var10000 == 0) {
                                          var69 = 3.0;
                                          break label344;
                                       }

                                       var70 = ClientGlobals.field_48.field_41L;
                                    }

                                    var69 = recovery$indy$71(var70, 3101511467267308007L, var5);
                                    break label344;
                                 }

                                 var69 = var68.field_42J;
                              }

                              label323: {
                                 double var54 = var69;
                                 C_478i var56 = new C_478i(var42 - var30, var44, var46 - var30, var42 + var30, var44 + var31, var46 + var30)
                                    .method_42$800791f322(var59, var59, var59);
                                 C_47tf var57 = new C_47tf(
                                    C_47sk.method_45$4b58f7ab41(var53.field_40, var56.field_48, var56.field_42),
                                    C_47sk.method_45$4b58f7ab41(var53.field_41, var56.field_46, var56.field_47),
                                    C_47sk.method_45$4b58f7ab41(var53.field_47, var56.field_44, var56.field_40)
                                 );
                                 double var83;
                                 var10000 = (var83 = var48.method_43$3d77d36e13(var49) - var54) == 0.0 ? 0 : (var83 < 0.0 ? -1 : 1);
                                 label322:
                                 if (var25 == null) {
                                    if (var10000 < 0) {
                                       double var84;
                                       var10000 = (
                                                var84 = var53.method_43$3d77d36e13(var57)
                                                   - (3.0 - recovery$indy$72(this.settingTolerance, var17, 3102575117390244128L, var5))
                                             )
                                             == 0.0
                                          ? 0
                                          : (var84 < 0.0 ? -1 : 1);
                                       if (var25 != null) {
                                          break label322;
                                       }

                                       if (var10000 > 0) {
                                          double var85;
                                          var10000 = (var85 = var51.method_43$3d77d36e13(var52) - 3.0) == 0.0 ? 0 : (var85 < 0.0 ? -1 : 1);
                                          var81 = var25;
                                          if (var1 < 0) {
                                             break label323;
                                          }

                                          if (var25 != null) {
                                             break label322;
                                          }

                                          if (var10000 > 0) {
                                             recovery$indy$73(var2, var26, 3101997035001112577L, var5);
                                             var66 = var25;
                                             if (var1 >= 0) {
                                                if (var25 == null) {
                                                   label530: {
                                                      Debug_47kF var72 = ClientGlobals.field_48.field_412;
                                                      if (var4 >= 0) {
                                                         if (!recovery$indy$74(ClientGlobals.field_48.field_412, var7, 3100764454114828143L, var5)) {
                                                            break label530;
                                                         }

                                                         var72 = ClientGlobals.field_48.field_412;
                                                      }

                                                      if (var25 == null) {
                                                         if (!recovery$indy$75(var72.settingTimerRangeDebug, 3102676424750975307L, var5)) {
                                                            break label530;
                                                         }

                                                         var72 = ClientGlobals.field_48.field_412;
                                                      }

                                                      recovery$indy$78(
                                                         var72,
                                                         var12,
                                                         (byte)var14,
                                                         recovery$indy$76(2686, 3126853862120550026L ^ var5)
                                                            + var53.method_43$3d77d36e13(var57)
                                                            + recovery$indy$77(14232, 4866343419244401514L ^ var5)
                                                            + var48.method_43$3d77d36e13(var49),
                                                         3102265907054586085L,
                                                         var5
                                                      );
                                                   }

                                                   recovery$indy$79(this.field_42, 3100838667723234166L, var5);
                                                }

                                                var66 = var25;
                                             }

                                             if (var3 < 0) {
                                                continue label385;
                                             }

                                             if (var66 == null) {
                                                break label381;
                                             }
                                          }
                                       }
                                    }

                                    var10000 = (int) ((recovery$indy$80(this.settingDynamic, 3102676424750975307L, var5)) ? 1 : 0);
                                 }

                                 var81 = var25;
                              }

                              if (var81 == null) {
                                 if (var10000 == 0) {
                                    break label381;
                                 }

                                 var10000 = (int) ((recovery$indy$81(this.settingOnlyKillAura, 3102676424750975307L, var5)) ? 1 : 0);
                              }

                              if (var10000 != 0) {
                                 Entity var73 = var28;
                                 EntityLivingBase var82 = ClientGlobals.field_48.field_48Q.field_45z;
                                 if (var25 == null) {
                                    if (var28 == ClientGlobals.field_48.field_48Q.field_45z) {
                                       break label381;
                                    }

                                    var73 = var28;
                                    var82 = ClientGlobals.field_48.field_46e.field_43c;
                                 }

                                 if (var73 == var82) {
                                    break label381;
                                 }
                              }
                              break;
                           }
                        }
                     }

                     var66 = var25;
                     break;
                  }

                  if (var3 < 0) {
                     continue label385;
                  }

                  if (var66 != null) {
                     break label381;
                  }
               }
            }

            var26--;
            var66 = var25;
         } while (var66 == null);
      }
   }











   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$82(this, 32, var3, -7102095435309083437L, var1);
      recovery$indy$83(this, 17, var3, -7102095435309083437L, var1);
      recovery$indy$84(this, 41, var3, -7102095435309083437L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      field_43.field_446 = 0L;
      field_43.field_42A = 0L;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public TimeManipulation_47kR(int a0,int a1) {
        super((java.lang.String) ("TimeManipulation"),(java.lang.String) ("ZeitManipulation"),(long) ((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 103088865470497L)),(java.awt.Color) (new java.awt.Color((int) (50),(int) (168),(int) (82))),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = ((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a);
        int constructorPart2 = (int) (((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 99829622115019L) >>> 48));
        int constructorPart3 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 99829622115019L) << 16) >>> 48));
        int constructorPart4 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 99829622115019L) << 32) >>> 32));
        int constructorPart5 = (int) (((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 63866153203095L) >>> 32));
        int constructorPart6 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 63866153203095L) << 32) >>> 48));
        int constructorPart7 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 63866153203095L) << 48) >>> 48));
        long constructorKey8 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 43217882535503L);
        long constructorKey9 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 76892495585585L);
        long constructorKey10 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 49369517798458L);
        long constructorKey11 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 1917968059325L);
        long constructorKey12 = (((((long) (a0) << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.misc.TimeManipulation_47kR.a) ^ 29896947355787L);
        net.C_47cu initialized13 = new net.C_47cu();
        recovery$indy$flow$358(this, initialized13);
        net.C_47cu initialized14 = new net.C_47cu();
        recovery$indy$flow$361(this, initialized14);
        client.setting.NumberSetting initialized15 = new client.setting.NumberSetting(this, "MinTicksAvailable", 0.0D, constructorKey11, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 0);
        recovery$indy$flow$364(this, initialized15);
        client.setting.NumberSetting initialized16 = new client.setting.NumberSetting(this, "MaxChargingTicks", Double.longBitsToDouble(4620693217682128896L), constructorKey11, 1.0D, Double.longBitsToDouble(4636737291354636288L), 0);
        recovery$indy$flow$367(this, initialized16);
        client.setting.BooleanSetting initialized17 = new client.setting.BooleanSetting(this, constructorKey10, "Correct", true);
        recovery$indy$flow$370(this, initialized17);
        client.setting.BooleanSetting initialized18 = new client.setting.BooleanSetting(this, constructorKey10, "AutoCharge", false);
        recovery$indy$flow$373(this, initialized18);
        client.setting.BooleanSetting initialized19 = new client.setting.BooleanSetting(this, constructorKey10, "SneakCharge", true);
        recovery$indy$flow$376(this, initialized19);
        client.setting.BooleanSetting initialized20 = new client.setting.BooleanSetting(this, constructorKey10, "UpdateEntityPositions", false);
        recovery$indy$flow$379(this, initialized20);
        client.setting.BooleanSetting initialized21 = new client.setting.BooleanSetting(this, constructorKey10, "ResetAtWorldChange", true);
        recovery$indy$flow$382(this, initialized21);
        client.setting.BooleanSetting initialized22 = new client.setting.BooleanSetting(this, constructorKey10, "TimerRangeBool", false);
        long initialValue23 = constructorKey8;
        java.lang.String initialValue24 = "TimerRange";
        client.setting.BooleanSetting initialValue25 = initialized22;
        java.lang.Object initialValue26 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue28 = recovery$indy$flow$387(initialValue26, initialValue27, initialValue23);
        java.lang.Object initialValue29 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue28))))));
        recovery$indy$flow$389(this, initialValue29);
        client.setting.SettingGroup initialized30 = new client.setting.SettingGroup(this, "TimerRange", constructorKey9);
        java.lang.Object initialValue31 = ((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingTimerRangeBool));
        java.lang.Object initialValue32 = recovery$indy$flow$393(initialValue31);
        java.lang.Object initialValue33 = recovery$indy$flow$394(initialValue31);
        char converted34 = (char) (constructorPart6);
        java.lang.Object initialValue35 = initialValue33;
        int initialValue36 = constructorPart7;
        int initialValue37 = (int) (converted34);
        int initialValue38 = constructorPart5;
        client.setting.SettingGroup initialValue39 = initialized30;
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue39))))));
        java.lang.Object initialValue41 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue35))))));
        java.lang.Object initialValue42 = recovery$indy$flow$397(initialValue40, initialValue38, (char) (initialValue37), initialValue36, initialValue41);
        recovery$indy$flow$398(this, initialValue42);
        java.lang.Object initialValue43 = ((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingTimerRange));
        client.setting.NumberSetting initialized44 = new client.setting.NumberSetting(this, "Delay", 0.0D, 0.0D, Double.longBitsToDouble(4671226772094713856L), 0, (client.setting.SettingGroup) (initialValue43), constructorKey12);
        recovery$indy$flow$402(this, initialized44);
        java.lang.Object initialValue45 = ((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingTimerRange));
        client.setting.NumberSetting initialized46 = new client.setting.NumberSetting(this, "TimerTicksForward", Double.longBitsToDouble(4613937818241073152L), 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue45), constructorKey12);
        recovery$indy$flow$406(this, initialized46);
        java.lang.Object initialValue47 = ((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingTimerRange));
        client.setting.NumberSetting initialized48 = new client.setting.NumberSetting(this, "Tolerance", 0.0D, Double.longBitsToDouble(-4616189618054758400L), 1.0D, 2, (client.setting.SettingGroup) (initialValue47), constructorKey12);
        recovery$indy$flow$410(this, initialized48);
        short converted49 = (short) (constructorPart2);
        char converted50 = (char) (constructorPart3);
        java.lang.Object initialValue51 = ((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingTimerRange));
        client.setting.BooleanSetting initialized52 = new client.setting.BooleanSetting(this, "OnlyOnGround", converted49, converted50, constructorPart4, false, (client.setting.SettingGroup) (initialValue51));
        recovery$indy$flow$414(this, initialized52);
        short converted53 = (short) (constructorPart2);
        char converted54 = (char) (constructorPart3);
        java.lang.Object initialValue55 = ((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingTimerRange));
        client.setting.BooleanSetting initialized56 = new client.setting.BooleanSetting(this, "Dynamic", converted53, converted54, constructorPart4, true, (client.setting.SettingGroup) (initialValue55));
        recovery$indy$flow$418(this, initialized56);
        short converted57 = (short) (constructorPart2);
        char converted58 = (char) (constructorPart3);
        java.lang.Object initialValue59 = ((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingTimerRange));
        client.setting.BooleanSetting initialized60 = new client.setting.BooleanSetting(this, "OnlyKillAura", converted57, converted58, constructorPart4, true, (client.setting.SettingGroup) (initialValue59));
        recovery$indy$flow$422(this, initialized60);
        short converted61 = (short) (constructorPart2);
        char converted62 = (char) (constructorPart3);
        java.lang.Object initialValue63 = ((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingTimerRange));
        client.setting.BooleanSetting initialized64 = new client.setting.BooleanSetting(this, "ClickCheck", converted61, converted62, constructorPart4, false, (client.setting.SettingGroup) (initialValue63));
        recovery$indy$flow$426(this, initialized64);
        short converted65 = (short) (constructorPart2);
        char converted66 = (char) (constructorPart3);
        java.lang.Object initialValue67 = ((java.lang.Object)(((augustus.recovered.modules.misc.TimeManipulation_47kR) (((java.lang.Object)(this)))).settingTimerRange));
        client.setting.BooleanSetting initialized68 = new client.setting.BooleanSetting(this, "ForbiddenSneak", converted65, converted66, constructorPart4, true, (client.setting.SettingGroup) (initialValue67));
        recovery$indy$flow$430(this, initialized68);
    }





    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static long recovery$indy$flow$73() {
        return augustus.recovered.modules.misc.TimeManipulation_47kR.a;
    }
    private static native java.lang.Object recovery$indy$flow$74(long a0,long a1);

    private static native boolean recovery$indy$flow$76(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$77() {
        return augustus.recovered.modules.misc.TimeManipulation_47kR.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$78(java.lang.Object a0,long a1,long a2);

    private static native int recovery$indy$flow$80(java.lang.Object a0);
    private static native boolean recovery$indy$flow$81(int a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$82() {
        return augustus.recovered.modules.misc.TimeManipulation_47kR.field_43;
    }
    private static native boolean recovery$indy$flow$83(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$85(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$86() {
        return augustus.recovered.modules.misc.TimeManipulation_47kR.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$87(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$88() {
        return augustus.recovered.modules.misc.TimeManipulation_47kR.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$89(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$90() {
        return augustus.recovered.modules.misc.TimeManipulation_47kR.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$91(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$92(long a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$93() {
        return augustus.recovered.modules.misc.TimeManipulation_47kR.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$94(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$95(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static native boolean recovery$indy$flow$96(int a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$97(int a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$98(int a0,long a1,long a2,long a3);

    private static native void recovery$indy$flow$100(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$102(java.lang.Object a0,long a1,long a2,long a3,long a4);

    private static native void recovery$indy$flow$104(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$106(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$358(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$361(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$364(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$367(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$370(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$373(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$376(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$379(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$382(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$387(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$389(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$393(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$394(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$397(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$398(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$402(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$406(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$410(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$414(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$418(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$422(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$426(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$430(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);
   private static native boolean recovery$indy$3(Object var0, int var1, char var2, short var3, long var4, long var6);
   private static native double recovery$indy$4(Object var0, boolean var1, long var2, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3);
   private static native String recovery$indy$8(int var0, long var1);
   private static native void recovery$indy$9(Object var0, long var1, byte var3, Object var4, long var5, long var7);
   private static native int[] recovery$indy$10(long var0, long var2);
   private static native WorldClient recovery$indy$11(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$12(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$13(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$14(Object var0, long var1, long var3);
   private static native FontRenderer recovery$indy$15(Object var0, long var1, long var3);
   private static native FontRenderer recovery$indy$16(Object var0, long var1, long var3);
   private static native boolean recovery$indy$17(Object var0, long var1, long var3);
   private static native int[] recovery$indy$36(long var0, long var2);
   private static native boolean recovery$indy$37(Object var0, long var1, long var3);
   private static native boolean recovery$indy$38(long var0, long var2, long var4);
   private static native boolean recovery$indy$39(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$40(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$41(Object var0, long var1, long var3);
   private static native boolean recovery$indy$42(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$43(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$44(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$45(Object var0, long var1, long var3);
   private static native boolean recovery$indy$46(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$47(Object var0, long var1, long var3);
   private static native boolean recovery$indy$48(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$49(Object var0, long var1, long var3);
   private static native double recovery$indy$50(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$51(Object var0, long var1, long var3, long var5, long var7);
   private static native boolean recovery$indy$52(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$53(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$54(Object var0, long var1, long var3);
   private static native double recovery$indy$55(Object var0, long var1, long var3, long var5);
   private static native WorldClient recovery$indy$56(Object var0, long var1, long var3);
   private static native boolean recovery$indy$57(Object var0, long var1, long var3);
   private static native EntityLivingBase recovery$indy$58(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$59(Object var0, long var1, long var3);
   private static native double[] recovery$indy$60(int var0, long var1, Object var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$61(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$62(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$63(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$64(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$65(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$66(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$67(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$68(Object var0, long var1, long var3);
   private static native boolean recovery$indy$69(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$70(Object var0, char var1, short var2, int var3, long var4, long var6);
   private static native double recovery$indy$71(Object var0, long var1, long var3);
   private static native double recovery$indy$72(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$73(Object var0, int var1, long var2, long var4);
   private static native boolean recovery$indy$74(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$75(Object var0, long var1, long var3);
   private static native String recovery$indy$76(int var0, long var1);
   private static native String recovery$indy$77(int var0, long var1);
   private static native void recovery$indy$78(Object var0, long var1, byte var3, Object var4, long var5, long var7);
   private static native void recovery$indy$79(Object var0, long var1, long var3);
   private static native boolean recovery$indy$80(Object var0, long var1, long var3);
   private static native boolean recovery$indy$81(Object var0, long var1, long var3);
   private static native void recovery$indy$82(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$83(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$84(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$86();
}
