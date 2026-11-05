package augustus.recovered.modules.latency;

import augustus.recovered.modules.misc.Debug_47kF;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_41Q;
import net.C_472n;
import net.C_473U;
import net.C_476q;
import net.C_478W;
import net.C_478i;
import net.C_479m;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Bs;
import net.C_47K7;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47Sy;
import client.setting.NumberSetting;
import net.C_47TU;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47WF;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47iC;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import net.C_47oo;
import client.ClientGlobals;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47zh;
import net.C_4f;

public class TimerRange_47CE extends Module implements C_47mz, C_47hi, C_41Q, C_47iC, C_47Sy {
   public long field_40;
   public long field_47;
   public final C_47cu field_40a;
   public final C_47cu field_40D;
   public final C_47cu field_46;
   private WorldClient field_48;
   public final NumberSetting settingDelay;
   public final NumberSetting settingTimerTicksForward;
   public final NumberSetting settingTolerance;
   public final BooleanSetting settingBalanceCheck;
   public final C_47TU settingAdditionalStop;
   public final BooleanSetting settingOnlyOnGround;
   public final BooleanSetting settingDynamic;
   public final BooleanSetting settingOnlyKillAura;
   public final BooleanSetting settingClickCheck;
   public final BooleanSetting settingForbiddenSneak;
   public final ModeSetting settingFixMode;
   public int field_43y;
   private long field_44;
   private boolean field_43a;
   private int field_43p;
   private int field_438;
   private int field_437;
   private final ArrayList field_43h;
   private static final long a = C_4f.a(6535820740569915285L, 4428980939135668237L, MethodHandles.lookup().lookupClass()).a(48978872316595L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[64];
   private static final String[] f = new String[64];

   private static native void b();

   private static native String b(byte[] var0);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle b(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static Method h(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      }

      String var6 = f[var4];
      int var7 = var6.indexOf(8);
      Class var8 = f(Long.parseLong(var6.substring(0, var7), 36), 0L);
      int var9 = var6.indexOf(8, ++var7);
      String var10 = var6.substring(var7, var9);
      int var11 = -1;
      int var12 = var9;

      do {
         var11++;
         var12++;
      } while ((var12 = var6.indexOf(8, var12)) > -1);

      int var13;
      Class[] var14 = new Class[var13 = var11 - 1];
      Class var15 = null;
      var12 = var9 + 1;

      for (int var16 = 0; var16 < var11; var16++) {
         int var17 = var6.indexOf(8, var12);
         var15 = f(Long.parseLong(var6.substring(var12, var17), 36), 0L);
         if (var16 < var13) {
            var14[var16] = var15;
         }

         var12 = var17 + 1;
      }

      Class var23 = var8;

      while (true) {
         Method var26 = c(var23, var10, var15, var13, var14);
         if (var26 != null) {
            e[var4] = var26;
            return var26;
         }

         if (var23.getName().equals("java.lang.Object")) {
            break;
         }

         if ((var23 = var23.getSuperclass()) == null) {
            var23 = f(2537963062487571L, 0L);
            break;
         }
      }

      var23 = var8;

      while (true) {
         Class[] var27;
         if ((var27 = var23.getInterfaces()) != null) {
            for (int var18 = 0; var18 < var27.length; var18++) {
               Method var19 = d(var27[var18], var10, var15, var13, var14);
               if (var19 != null) {
                  e[var4] = var19;
                  return var19;
               }
            }
         }

         if (var23.getName().equals("java.lang.Object")) {
            StringBuffer var28 = new StringBuffer();
            var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
            int var29 = 0;

            while (var29 < var13) {
               var28.append(var14[var29].getName());
               if (++var29 < var13) {
                  var28.append(", ");
               }
            }

            var28.append(')');
            throw new RuntimeException(var28.toString());
         }

         if ((var23 = var23.getSuperclass()) == null) {
            var23 = f(2537963062487571L, 0L);
         }
      }
   }

   @Override
   public void method_46$e535f8442d(C_47zh var1, long var2, short var4) {
      long var5 = var2 << 16 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 115002472062334L;
      long var9 = var5 ^ 13538434133415L;
      String var11 = recovery$indy$1(1765900896088571495L, var5);
      if (!recovery$indy$2(this.settingFixMode, var7, 1766981370101746080L, var5).equals(recovery$indy$3(27249, 5806901652386315765L ^ var5))) {
         EntityPlayerSP var10000 = recovery$indy$4(field_43, 1766761487193914184L, var5);
         if (var11 == null) {
            if (var10000 == null) {
               return;
            }

            var10000 = recovery$indy$5(field_43, 1766761487193914184L, var5);
         }

         if (var10000.field_48y > 10) {
            recovery$indy$6(var1, var9, this.field_43a, 1765909289179757888L, var5);
         }
      }
   }

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (f[var4] != null) {
         return var4;
      }

      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return var4;
      }

      byte var6 = 0;
      byte var10000;
      switch ((int)(var0 >>> 42 & 63L)) {
         case 0:
            var10000 = 33;
            break;
         case 1:
            var10000 = 6;
            break;
         case 2:
            var10000 = 63;
            break;
         case 3:
            var10000 = 31;
            break;
         case 4:
            var10000 = 3;
            break;
         case 5:
            var10000 = 53;
            break;
         case 6:
            var10000 = 20;
            break;
         case 7:
            var10000 = 40;
            break;
         case 8:
            var10000 = 13;
            break;
         case 9:
            var10000 = 10;
            break;
         case 10:
            var10000 = 44;
            break;
         case 11:
            var10000 = 45;
            break;
         case 12:
            var10000 = 61;
            break;
         case 13:
            var10000 = 37;
            break;
         case 14:
            var10000 = 54;
            break;
         case 15:
            var10000 = 43;
            break;
         case 16:
            var10000 = 32;
            break;
         case 17:
            var10000 = 7;
            break;
         case 18:
            var10000 = 51;
            break;
         case 19:
            var10000 = 18;
            break;
         case 20:
            var10000 = 25;
            break;
         case 21:
            var10000 = 62;
            break;
         case 22:
            var10000 = 58;
            break;
         case 23:
            var10000 = 1;
            break;
         case 24:
            var10000 = 41;
            break;
         case 25:
            var10000 = 5;
            break;
         case 26:
            var10000 = 50;
            break;
         case 27:
            var10000 = 56;
            break;
         case 28:
            var10000 = 49;
            break;
         case 29:
            var10000 = 12;
            break;
         case 30:
            var10000 = 57;
            break;
         case 31:
            var10000 = 0;
            break;
         case 32:
            var10000 = 27;
            break;
         case 33:
            var10000 = 26;
            break;
         case 34:
            var10000 = 28;
            break;
         case 35:
            var10000 = 4;
            break;
         case 36:
            var10000 = 36;
            break;
         case 37:
            var10000 = 48;
            break;
         case 38:
            var10000 = 17;
            break;
         case 39:
            var10000 = 35;
            break;
         case 40:
            var10000 = 30;
            break;
         case 41:
            var10000 = 55;
            break;
         case 42:
            var10000 = 59;
            break;
         case 43:
            var10000 = 29;
            break;
         case 44:
            var10000 = 39;
            break;
         case 45:
            var10000 = 8;
            break;
         case 46:
            var10000 = 16;
            break;
         case 47:
            var10000 = 11;
            break;
         case 48:
            var10000 = 46;
            break;
         case 49:
            var10000 = 23;
            break;
         case 50:
            var10000 = 14;
            break;
         case 51:
            var10000 = 38;
            break;
         case 52:
            var10000 = 21;
            break;
         case 53:
            var10000 = 9;
            break;
         case 54:
            var10000 = 22;
            break;
         case 55:
            var10000 = 52;
            break;
         case 56:
            var10000 = 24;
            break;
         case 57:
            var10000 = 42;
            break;
         case 58:
            var10000 = 2;
            break;
         case 59:
            var10000 = 34;
            break;
         case 60:
            var10000 = 60;
            break;
         case 61:
            var10000 = 47;
            break;
         case 62:
            var10000 = 19;
            break;
         default:
            var10000 = 15;
      }

      var6 = var10000;
      int[] var7 = new int[6];

      for (int var8 = 0; var8 < 6; var8++) {
         int var9 = 7 * (5 - var8);
         int var10 = (int)(var0 >>> var9 & 127L);
         var10 -= var6;
         if (var10 < 0) {
            var10 += 128;
         }

         var7[var8] = var10;
      }

      char[] var13 = ((String)var5).toCharArray();

      for (int var14 = 0; var14 < var13.length; var14++) {
         int var16 = var7[var14 % var7.length];
         if (var16 == 0) {
            break;
         }

         var13[var14] = (char)(var13[var14] ^ var16);
      }

      f[var4] = new String(var13);
      return var4;
   }

   private static native CallSite d(Lookup var0, String var1, MethodType var2);

   private static native Method d(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field d(Class var0, String var1, Class var2);

   @Override
   public void method_41$9035875d26(long var1, C_47ob var3) {
      augustus.recovered.modules.latency.TimerRange_47CE var10;
      String var4 = recovery$indy$8(-7191468673442006316L, var1);
      C_473U var5 = recovery$indy$9(var3, -7191364365813215784L, var1);
      int var10000 = (int) ((var5 instanceof C_479m) ? 1 : 0);
      if (var4 == null) {
         if ((var10000) != 0) {
            this.field_44 = System.currentTimeMillis();
         }

         var10000 = (int) ((var5 instanceof C_47WF) ? 1 : 0);
      }

      if ((var10000) != 0) {
         label73: {
            long var6 = System.currentTimeMillis() - this.field_44;
            long var11;
            var10000 = (var11 = var6 - 23L) == 0L ? 0 : (var11 < 0L ? -1 : 1);
            label66:
            if (var4 == null) {
               if (var10000 < 0) {
                  long var12;
                  var10000 = (var12 = var6 - 0L) == 0L ? 0 : (var12 < 0L ? -1 : 1);
                  if (var4 != null) {
                     break label66;
                  }

                  if (var10000 > 0) {
                     this.field_43y++;
                     if (var1 >= 0L) {
                        TimerRange_47CE var9 = this;
                        if (var4 == null) {
                           if (this.field_43y <= 10) {
                              return;
                           }

                           var9 = this;
                        }

                        var9.field_43y = 10;
                     }

                     if (var4 == null) {
                        return;
                     }
                  }
               }

               var10 = this;
               if (var4 != null) {
                  break label73;
               }

               var10000 = this.field_43y;
            }

            if (var10000 <= 0) {
               return;
            }

            var10 = this;
         }

         var10.field_43y--;
      }
   }

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = e[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(f[var4]);
            e[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      return (Class)var6;
   }

   private static Field g(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = e[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      }

      String var6 = f[var4];
      int var7 = var6.indexOf(8);
      Class var8 = f(Long.parseLong(var6.substring(0, var7), 36), 0L);
      int var9 = var6.indexOf(8, ++var7);
      String var10 = var6.substring(var7, var9);
      Class var11 = f(Long.parseLong(var6.substring(++var9), 36), 0L);
      Class var12 = var8;

      while (true) {
         Field var13 = c(var12, var10, var11);
         if (var13 != null) {
            e[var4] = var13;
            return var13;
         }

         Class[] var14 = var12.getInterfaces();
         if (var14 != null) {
            for (int var15 = 0; var15 < var14.length; var15++) {
               var13 = d(var14[var15], var10, var11);
               if (var13 != null) {
                  e[var4] = var13;
                  return var13;
               }
            }
         }

         if (var12.getName().equals("java.lang.Object")) {
            StringBuffer var19 = new StringBuffer();
            var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
            throw new RuntimeException(var19.toString());
         }

         var12 = var12.getSuperclass();
         if (var12 == null) {
            var12 = f(2537963062487571L, 0L);
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void method_40$78e9da5ba7(byte var1, C_478W var2, int var3, int var4) {
      client.module.ModuleManager var85;
      net.minecraft.entity.Entity var87;
      java.lang.String var88;
      int var104;
      client.module.ModuleManager var93;
      augustus.recovered.modules.combat.KillAura_47CY var94;
      augustus.recovered.modules.legit.Range_47CT var96;
      double var95;
      augustus.recovered.modules.latency.TimerRange_47CE var100;
      long var5;
      long var29;
      String var33;
      String var102;
      int var10000;
      label723: {
         label726: {
            long var7;
            long var9;
            long var11;
            int var13;
            int var14;
            int var15;
            long var16;
            long var18;
            int var20;
            long var23;
            long var25;
            long var27;
            long var31;
            label721: {
               var5 = (long)var1 << 56 | (long)var3 << 32 >>> 8 | (long)var4 << 40 >>> 40;
               var7 = var5 ^ 103307540902973L;
               var9 = var5 ^ 23021172477775L;
               var11 = var5 ^ 120158757772112L;
               long var10001 = var5 ^ 61023263174396L;
               var13 = (int)((var5 ^ 61023263174396L) >>> 48);
               var14 = (int)((var5 ^ 61023263174396L) << 16 >>> 48);
               var15 = (int)(var10001 << 32 >>> 32);
               var16 = var5 ^ 138846775302586L;
               var18 = (var5 ^ 63198749799289L) >>> 8;
               var20 = (int)((var5 ^ 63198749799289L) << 56 >>> 56);
               long var21 = var5 ^ 69534716925545L;
               var23 = var5 ^ 87041329892714L;
               var25 = var5 ^ 19261085197998L;
               var27 = var5 ^ 126773842150628L;
               var29 = var5 ^ 124392399718118L;
               var31 = var5 ^ 124739750847928L;
               var33 = recovery$indy$10(-4531845709316626435L, var5);
               this.field_43a = false;
               var10000 = (int) ((recovery$indy$11(ClientGlobals.field_48.field_48Q, var9, -4530902470115306123L, var5)) ? 1 : 0);
               label720:
               if (var33 == null) {
                  if (var10000 != 0) {
                     var10000 = ((int) (recovery$indy$12(ClientGlobals.field_48.field_48Q.field_473, var27, -4530744484437225414L, var5)
                        .equals(recovery$indy$13(29231, 8380715145564699700L ^ var5)) ? 1 : 0));
                     var102 = var33;
                     if (var3 <= 0) {
                        break label721;
                     }

                     if (var33 != null) {
                        break label720;
                     }

                     if (var10000 != 0) {
                        var10000 = (int) ((ClientGlobals.field_48.field_48Q.field_43v) ? 1 : 0);
                        if (var33 != null) {
                           var102 = var33;
                           break label723;
                        }

                        if (ClientGlobals.field_48.field_48Q.field_43v) {
                           var10000 = (int) ((recovery$indy$68(this.settingBalanceCheck, -4532575296364172959L, var5)) ? 1 : 0);
                           break label726;
                        }
                     }
                  }

                  var10000 = (int) ((recovery$indy$14(var21, -4531914903155028370L, var5)) ? 1 : 0);
               }

               var102 = var33;
            }

            label411:
            if (var102 == null) {
               if (var10000 == 0) {
                  var10000 = (int) ((recovery$indy$15(field_43, -4531246286705187143L, var5)) ? 1 : 0);
                  if (var33 != null) {
                     break label411;
                  }

                  label707:
                  if (var10000 != 0) {
                     Minecraft var84 = field_43;
                     if (var33 == null) {
                        if (recovery$indy$16(field_43, -4531064539208809556L, var5) == null) {
                           break label707;
                        }

                        var84 = field_43;
                     }

                     if (recovery$indy$17(var84, -4530946805338053934L, var5) != null) {
                        var10000 = (int) ((recovery$indy$18(ClientGlobals.field_48.field_48i, var9, -4530902470115306123L, var5)) ? 1 : 0);
                        if (var33 != null) {
                           break label411;
                        }

                        label699:
                        if (var10000 == 0) {
                           var10000 = (int) ((ClientGlobals.field_48.field_46O.field_41L) ? 1 : 0);
                           var102 = var33;
                           if (var3 >= 0) {
                              if (var33 == null) {
                                 if (ClientGlobals.field_48.field_46O.field_41L) {
                                    var10000 = (int) ((recovery$indy$19(ClientGlobals.field_48.field_46O, var9, -4530902470115306123L, var5)) ? 1 : 0);
                                    if (var33 != null) {
                                       break label411;
                                    }

                                    if (var10000 != 0) {
                                       break label699;
                                    }
                                 }

                                 var10000 = (int) ((recovery$indy$20(this.settingForbiddenSneak, -4532575296364172959L, var5)) ? 1 : 0);
                              }

                              var102 = var33;
                           }

                           if (var3 > 0) {
                              if (var102 == null) {
                                 if (var10000 != 0) {
                                    var10000 = (int) ((recovery$indy$21(field_43, -4530946805338053934L, var5).method_48g$aae029aa0a()) ? 1 : 0);
                                    if (var33 != null) {
                                       break label411;
                                    }

                                    if (var10000 != 0) {
                                       break label699;
                                    }
                                 }

                                 var10000 = (int) ((recovery$indy$22(this.settingClickCheck, -4532575296364172959L, var5)) ? 1 : 0);
                              }

                              var102 = var33;
                           }

                           if (var1 >= 0) {
                              if (var102 == null) {
                                 if (var10000 != 0) {
                                    var10000 = (int) ((recovery$indy$23(field_43, -4532136974438014319L, var5).field_44l.method_42$aae029aa0a()) ? 1 : 0);
                                    if (var33 != null) {
                                       break label411;
                                    }

                                    if (var10000 == 0) {
                                       break label699;
                                    }
                                 }

                                 var10000 = (int) ((recovery$indy$24(this.settingOnlyOnGround, -4532575296364172959L, var5)) ? 1 : 0);
                              }

                              var102 = var33;
                           }

                           if (var4 > 0) {
                              if (var102 == null) {
                                 if (var10000 != 0) {
                                    var10000 = (int) ((recovery$indy$25(field_43, -4530946805338053934L, var5).field_48M) ? 1 : 0);
                                    if (var33 != null) {
                                       break label411;
                                    }

                                    if (var10000 == 0) {
                                       break label699;
                                    }
                                 }

                                 var10000 = ((int) (recovery$indy$27(
                                    this.field_40D,
                                    (long)recovery$indy$26(this.settingDelay, var23, -4532357604547756261L, var5),
                                    var29,
                                    -4531706052201749357L,
                                    var5
                                 ) ? 1 : 0));
                              }

                              var102 = var33;
                           }

                           if (var102 != null) {
                              break label411;
                           }

                           label661:
                           if (var10000 != 0) {
                              label730: {
                                 var10000 = (int) ((recovery$indy$28(ClientGlobals.field_48.field_48Q, var9, -4530902470115306123L, var5)) ? 1 : 0);
                                 var102 = var33;
                                 if (var1 >= 0) {
                                    if (var33 == null) {
                                       label654: {
                                          if (var10000 != 0) {
                                             var85 = ClientGlobals.field_48;
                                             if (var33 != null) {
                                                break label654;
                                             }

                                             if (ClientGlobals.field_48.field_48Q.field_45z != null) {
                                                break label730;
                                             }
                                          }

                                          var85 = ClientGlobals.field_48;
                                       }

                                       var10000 = (int) ((recovery$indy$29(var85.field_46e, var9, -4530902470115306123L, var5)) ? 1 : 0);
                                    }

                                    var102 = var33;
                                 }

                                 if (var3 > 0) {
                                    if (var102 == null) {
                                       if (var10000 != 0 && ClientGlobals.field_48.field_46e.field_43c != null) {
                                          break label730;
                                       }

                                       var10000 = (int) ((recovery$indy$30(this.settingOnlyKillAura, -4532575296364172959L, var5)) ? 1 : 0);
                                    }

                                    var102 = var33;
                                 }

                                 if (var1 < 0) {
                                    break label723;
                                 }

                                 if (var102 != null) {
                                    break label411;
                                 }

                                 if (var10000 != 0) {
                                    break label661;
                                 }
                              }

                              int var34 = (int)recovery$indy$31(this.settingTimerTicksForward, var23, -4532357604547756261L, var5);

                              label633:
                              do {
                                 var10000 = var34;

                                 label629:
                                 while (true) {
                                    if (var10000 < 1) {
                                       break label633;
                                    }

                                    Iterator var35 = recovery$indy$32(field_43, -4531064539208809556L, var5).field_44Q.iterator();

                                    while (true) {
                                       label625:
                                       while (true) {
                                          int var86 = (int) ((var35.hasNext()) ? 1 : 0);

                                          label622:
                                          while (true) {
                                             if (var86 == 0) {
                                                break label629;
                                             }

                                             Entity var36 = (Entity)var35.next();
                                             var10000 = (int) ((var36 instanceof EntityLivingBase) ? 1 : 0);
                                             var102 = var33;
                                             if (var3 <= 0) {
                                                break label723;
                                             }

                                             if (var33 != null) {
                                                continue label629;
                                             }

                                             var102 = var33;
                                             if (var1 < 0) {
                                                break label723;
                                             }

                                             if (var1 >= 0) {
                                                if (var33 == null) {
                                                   if (var10000 == 0) {
                                                      continue label625;
                                                   }

                                                   var10000 = (int) ((recovery$indy$33(this.settingOnlyKillAura, -4532575296364172959L, var5)) ? 1 : 0);
                                                }

                                                var102 = var33;
                                             }

                                             label737: {
                                                if (var102 == null) {
                                                   if (var10000 != 0) {
                                                      var36 = recovery$indy$34((EntityLivingBase)var36, var31, -4531663365258508802L, var5);
                                                   }

                                                   var87 = var36;
                                                   if (var33 != null) {
                                                      break label737;
                                                   }

                                                   var10000 = (int) ((var36 instanceof C_47Bs) ? 1 : 0);
                                                }

                                                if (var10000 == 0) {
                                                   break;
                                                }

                                                var87 = var36;
                                             }

                                             C_47Bs var37 = (C_47Bs)var87;
                                             float var38 = var37.field_48w / 2.0F;
                                             float var39 = var37.field_48;
                                             int var40 = var37.field_40;
                                             double var41 = var37.field_48Q + (var37.field_43s - var37.field_48Q) / Math.max(1, var40);
                                             double var43 = var37.field_48j + (var37.field_438 - var37.field_48j) / Math.max(1, var40);
                                             double var45 = var37.field_42o + (var37.field_45 - var37.field_42o) / Math.max(1, var40);
                                             var40--;
                                             int var47 = 0;

                                             while (var47 < var34) {
                                                var41 = var37.field_48Q + (var37.field_43s - var37.field_48Q) / Math.max(1, var40);
                                                var43 = var37.field_48j + (var37.field_438 - var37.field_48j) / Math.max(1, var40);
                                                var45 = var37.field_42o + (var37.field_45 - var37.field_42o) / Math.max(1, var40);
                                                var40--;
                                                var47++;
                                                var88 = var33;
                                                if (var1 < 0) {
                                                   break label625;
                                                }

                                                if (var33 != null) {
                                                   break label622;
                                                }

                                                if (var33 != null) {
                                                   break;
                                                }
                                             }

                                             float var81 = var36.method_42$bc607678b6();
                                             C_478i var48 = new C_478i(var41 - var38, var43, var45 - var38, var41 + var38, var43 + var39, var45 + var38);
                                             var48 = var48.method_42$800791f322(var81, var81, var81);
                                             float var49 = recovery$indy$35(field_43, -4530946805338053934L, var5).field_49w.field_45;
                                             float[] var50 = new float[var34];
                                             float[] var51 = new float[var34];
                                             var86 = 0;
                                             if (var4 > 0) {
                                                int var52 = 0;

                                                while (true) {
                                                   if (var52 < var34) {
                                                      var50[var52] = var49;
                                                      var52++;
                                                      String var89 = var33;
                                                      if (var4 >= 0) {
                                                         if (var33 != null) {
                                                            break;
                                                         }

                                                         var89 = var33;
                                                      }

                                                      if (var89 == null) {
                                                         continue;
                                                      }
                                                   }

                                                   var86 = -1337;
                                                   if (var1 < 0) {
                                                      continue label622;
                                                   }

                                                   var52 = -1337;
                                                   break;
                                                }

                                                double var53 = 0.0;
                                                double var55 = 0.0;
                                                double var57 = 0.0;
                                                int var59 = 0;

                                                label583: {
                                                   while (true) {
                                                      if (var59 >= this.field_43h.size()) {
                                                         if (var1 < 0) {
                                                            break label622;
                                                         }

                                                         var86 = var52;
                                                         break;
                                                      }

                                                      var86 = 0;
                                                      if (var33 != null) {
                                                         break;
                                                      }

                                                      int var60 = 0;

                                                      label579: {
                                                         label578:
                                                         while (true) {
                                                            if (var60 < var34) {
                                                               var86 = var60;
                                                               if (var4 <= 0) {
                                                                  break label579;
                                                               }

                                                               var104 = ((float[])this.field_43h.get(var59)).length;
                                                               if (var33 != null) {
                                                                  break;
                                                               }
                                                            } else {
                                                               var86 = 0;
                                                               var104 = var34;
                                                               if (var3 > 0) {
                                                                  var104 = var34 - 1;
                                                                  break;
                                                               }

                                                               if (var33 != null) {
                                                                  break;
                                                               }
                                                            }

                                                            while (true) {
                                                               if (var86 >= var104) {
                                                                  var51[var60] = recovery$indy$36(field_43, -4530946805338053934L, var5).field_49w.field_40;
                                                                  if (var4 >= 0) {
                                                                     if (var33 != null) {
                                                                        var51[var60] = recovery$indy$37(field_43, -4530946805338053934L, var5).field_49w.field_40
                                                                           * ((float[])this.field_43h.get(var59))[var60];
                                                                        var60++;
                                                                        if (var33 == null) {
                                                                           break;
                                                                        }
                                                                     } else {
                                                                        var60++;
                                                                        if (var33 == null) {
                                                                           break;
                                                                        }
                                                                     }
                                                                  } else if (var33 == null) {
                                                                     break;
                                                                  }
                                                               } else {
                                                                  var51[var60] = recovery$indy$37(field_43, -4530946805338053934L, var5).field_49w.field_40
                                                                     * ((float[])this.field_43h.get(var59))[var60];
                                                                  var60++;
                                                                  if (var33 == null) {
                                                                     break;
                                                                  }
                                                               }

                                                               var86 = 0;
                                                               var104 = var34;
                                                               if (var3 > 0) {
                                                                  var104 = var34 - 1;
                                                                  break label578;
                                                               }

                                                               if (var33 != null) {
                                                                  break label578;
                                                               }
                                                            }
                                                         }

                                                         var86 = Math.max(var86, var104);
                                                      }

                                                      double var61;
                                                      double var63;
                                                      double var65;
                                                      C_47tf var67;
                                                      C_47tf var68;
                                                      C_47tf var70;
                                                      C_47tf var71;
                                                      C_47tf var72;
                                                      label538: {
                                                         label537: {
                                                            label746: {
                                                               double[] var83 = recovery$indy$39(
                                                                  var86,
                                                                  var11,
                                                                  recovery$indy$38(field_43, -4530946805338053934L, var5),
                                                                  var51,
                                                                  var50,
                                                                  -4531428693824666040L,
                                                                  var5
                                                               );
                                                               var61 = recovery$indy$40(field_43, -4530946805338053934L, var5).method_47$b2124a4855().field_40
                                                                  + (
                                                                        var83[0]
                                                                           - recovery$indy$41(field_43, -4530946805338053934L, var5).method_47$b2124a4855().field_40
                                                                     )
                                                                     / 3.0;
                                                               var63 = recovery$indy$42(field_43, -4530946805338053934L, var5).method_47$b2124a4855().field_41
                                                                  + (
                                                                        var83[1]
                                                                           - recovery$indy$43(field_43, -4530946805338053934L, var5).method_47$b2124a4855().field_41
                                                                     )
                                                                     / 3.0;
                                                               var65 = recovery$indy$44(field_43, -4530946805338053934L, var5).method_47$b2124a4855().field_47
                                                                  + (
                                                                        var83[2]
                                                                           - recovery$indy$45(field_43, -4530946805338053934L, var5).method_47$b2124a4855().field_47
                                                                     )
                                                                     / 3.0;
                                                               var67 = new C_47tf(
                                                                  var83[3],
                                                                  var83[4] + recovery$indy$46(field_43, -4530946805338053934L, var5).method_41$bc607678b6(),
                                                                  var83[5]
                                                               );
                                                               var68 = new C_47tf(
                                                                  C_47sk.method_45$4b58f7ab41(var67.field_40, var48.field_48, var48.field_42),
                                                                  C_47sk.method_45$4b58f7ab41(var67.field_41, var48.field_46, var48.field_47),
                                                                  C_47sk.method_45$4b58f7ab41(var67.field_47, var48.field_44, var48.field_40)
                                                               );
                                                               C_478i var69 = var37.method_45$6684d3c618().method_42$800791f322(var81, var81, var81);
                                                               var70 = recovery$indy$47(field_43, -4530946805338053934L, var5).method_49$41b79b67a0(1.0F);
                                                               var71 = new C_47tf(
                                                                  C_47sk.method_45$4b58f7ab41(var70.field_40, var69.field_48, var69.field_42),
                                                                  C_47sk.method_45$4b58f7ab41(var70.field_41, var69.field_46, var69.field_47),
                                                                  C_47sk.method_45$4b58f7ab41(var70.field_47, var69.field_44, var69.field_40)
                                                               );
                                                               var72 = new C_47tf(
                                                                  var37.field_43s, var37.field_438 + var37.method_41$bc607678b6(), var37.field_45
                                                               );
                                                               boolean var92 = recovery$indy$48(ClientGlobals.field_48.field_48Q, var9, -4530902470115306123L, var5);
                                                               if (var33 == null) {
                                                                  label533: {
                                                                     if (var92) {
                                                                        var93 = ClientGlobals.field_48;
                                                                        if (var33 != null) {
                                                                           break label533;
                                                                        }

                                                                        var94 = ClientGlobals.field_48.field_48Q;
                                                                        if (var1 < 0) {
                                                                           break label537;
                                                                        }

                                                                        if (ClientGlobals.field_48.field_48Q.field_45z != null) {
                                                                           var94 = ClientGlobals.field_48.field_48Q;
                                                                           break label537;
                                                                        }
                                                                     }

                                                                     var93 = ClientGlobals.field_48;
                                                                  }

                                                                  var96 = var93.field_41L;
                                                                  if (var33 != null) {
                                                                     break label746;
                                                                  }

                                                                  var92 = recovery$indy$49(
                                                                     var93.field_41L, (char)var13, (short)var14, var15, -4530627837006101676L, var5
                                                                  );
                                                               }

                                                               if (!var92) {
                                                                  var95 = 3.0;
                                                                  break label538;
                                                               }

                                                               var96 = ClientGlobals.field_48.field_41L;
                                                            }

                                                            var95 = recovery$indy$50(var96, -4531341458239789558L, var5);
                                                            break label538;
                                                         }

                                                         var95 = var94.field_42J;
                                                      }

                                                      label517: {
                                                         double var73 = var95;
                                                         C_478i var75 = new C_478i(
                                                               var61 - var38, var63, var65 - var38, var61 + var38, var63 + var39, var65 + var38
                                                            )
                                                            .method_42$800791f322(var81, var81, var81);
                                                         C_47tf var76 = new C_47tf(
                                                            C_47sk.method_45$4b58f7ab41(var72.field_40, var75.field_48, var75.field_42),
                                                            C_47sk.method_45$4b58f7ab41(var72.field_41, var75.field_46, var75.field_47),
                                                            C_47sk.method_45$4b58f7ab41(var72.field_47, var75.field_44, var75.field_40)
                                                         );
                                                         byte var77 = 0;
                                                         double var110;
                                                         var86 = (var110 = var67.method_43$3d77d36e13(var68) - var73) == 0.0 ? 0 : (var110 < 0.0 ? -1 : 1);
                                                         label516:
                                                         if (var33 == null) {
                                                            if (var86 < 0) {
                                                               double var111;
                                                               var86 = (
                                                                        var111 = var72.method_43$3d77d36e13(var76)
                                                                           - (3.0 - recovery$indy$51(this.settingTolerance, var23, -4532357604547756261L, var5))
                                                                     )
                                                                     == 0.0
                                                                  ? 0
                                                                  : (var111 < 0.0 ? -1 : 1);
                                                               if (var33 != null) {
                                                                  break label516;
                                                               }

                                                               if (var86 > 0) {
                                                                  double var112;
                                                                  var86 = (var112 = var70.method_43$3d77d36e13(var71) - 3.0) == 0.0
                                                                     ? 0
                                                                     : (var112 < 0.0 ? -1 : 1);
                                                                  if (var33 != null) {
                                                                     break label516;
                                                                  }

                                                                  if (var86 > 0) {
                                                                     var86 = var59;
                                                                     var102 = var33;
                                                                     if (var1 >= 0) {
                                                                        if (var33 == null) {
                                                                           if (var59 == 0) {
                                                                              var77 = 1;
                                                                           }

                                                                           var86 = recovery$indy$52(var2, -4532038786658803442L, var5);
                                                                        }

                                                                        var102 = var33;
                                                                     }

                                                                     if (var102 != null) {
                                                                        break label516;
                                                                     }

                                                                     if (var86 == 1) {
                                                                        double var78 = var72.method_43$3d77d36e13(var76);
                                                                        double var113;
                                                                        var86 = (var113 = var78 - var53) == 0.0 ? 0 : (var113 < 0.0 ? -1 : 1);
                                                                        var102 = var33;
                                                                        if (var3 < 0) {
                                                                           break label517;
                                                                        }

                                                                        if (var33 != null) {
                                                                           break label516;
                                                                        }

                                                                        if (var86 > 0) {
                                                                           var53 = var78;
                                                                           var52 = var59;
                                                                           var55 = var72.method_43$3d77d36e13(var76);
                                                                           var57 = var67.method_43$3d77d36e13(var68);
                                                                        }
                                                                     }
                                                                  }
                                                               }
                                                            }

                                                            var86 = var77;
                                                         }

                                                         var102 = var33;
                                                      }

                                                      if (var1 < 0) {
                                                         break label583;
                                                      }

                                                      if (var102 != null) {
                                                         break;
                                                      }

                                                      if (var86 != 0 && var34 > 2) {
                                                         var59++;
                                                         if (var33 == null) {
                                                            continue;
                                                         }
                                                      }

                                                      if (var1 < 0) {
                                                         break label622;
                                                      }

                                                      var86 = var52;
                                                      break;
                                                   }

                                                   var102 = var33;
                                                }

                                                if (var1 >= 0) {
                                                   if (var102 == null) {
                                                      if (var86 >= 0) {
                                                         this.field_43p = var52;
                                                         recovery$indy$53(var2, var34, -4530765095460203874L, var5);
                                                         TimerRange_47CE var97 = this;
                                                         int var107 = recovery$indy$56(
                                                            C_476q.field_48,
                                                            var25,
                                                            recovery$indy$54(this.settingAdditionalStop, var16, -4531557876285066292L, var5),
                                                            recovery$indy$55(this.settingAdditionalStop, var7, -4532009966614099799L, var5),
                                                            -4530985944454560794L,
                                                            var5
                                                         );
                                                         if (var3 > 0) {
                                                            this.field_437 = var107;
                                                            if (var33 == null) {
                                                               label754: {
                                                                  Debug_47kF var98 = ClientGlobals.field_48.field_412;
                                                                  if (var4 >= 0) {
                                                                     if (!recovery$indy$57(ClientGlobals.field_48.field_412, var9, -4530902470115306123L, var5)) {
                                                                        break label754;
                                                                     }

                                                                     var98 = ClientGlobals.field_48.field_412;
                                                                  }

                                                                  var102 = var33;
                                                                  if (var4 > 0) {
                                                                     if (var33 == null) {
                                                                        if (!recovery$indy$58(var98.settingTimerRangeDebug, -4532575296364172959L, var5)) {
                                                                           break label754;
                                                                        }

                                                                        var98 = ClientGlobals.field_48.field_412;
                                                                     }

                                                                     var102 = recovery$indy$59(28639, 6439435771291673045L ^ var5)
                                                                        + var55
                                                                        + recovery$indy$60(8289, 616157612348206696L ^ var5)
                                                                        + var57;
                                                                  }

                                                                  recovery$indy$61(var98, var18, (byte)var20, var102, -4532424761690466980L, var5);
                                                               }

                                                               this.field_43a = recovery$indy$62(this.settingFixMode, var27, -4530744484437225414L, var5)
                                                                  .equals(recovery$indy$63(20967, 1412975969183080435L ^ var5));
                                                               recovery$indy$64(this.field_40a, -4531116380104737693L, var5);
                                                               recovery$indy$65(this.field_40D, -4531116380104737693L, var5);
                                                            }

                                                            var97 = this;
                                                            var107 = 0;
                                                         }

                                                         var97.field_438 = var107;
                                                      }

                                                      var86 = (int) ((recovery$indy$66(this.settingDynamic, -4532575296364172959L, var5)) ? 1 : 0);
                                                   }

                                                   var102 = var33;
                                                }

                                                if (var102 == null) {
                                                   if (var86 == 0) {
                                                      break label629;
                                                   }

                                                   var86 = (int) ((recovery$indy$67(this.settingOnlyKillAura, -4532575296364172959L, var5)) ? 1 : 0);
                                                }

                                                if (var86 != 0) {
                                                   Entity var99 = var36;
                                                   EntityLivingBase var109 = ClientGlobals.field_48.field_48Q.field_45z;
                                                   if (var33 == null) {
                                                      if (var36 == ClientGlobals.field_48.field_48Q.field_45z) {
                                                         break label629;
                                                      }

                                                      var99 = var36;
                                                      var109 = ClientGlobals.field_48.field_46e.field_43c;
                                                   }

                                                   if (var99 == var109) {
                                                      break label629;
                                                   }
                                                }
                                                break;
                                             }
                                          }

                                          var88 = var33;
                                          break;
                                       }

                                       if (var4 < 0) {
                                          continue label633;
                                       }

                                       if (var88 != null) {
                                          break label629;
                                       }
                                    }
                                 }

                                 var34--;
                                 var88 = var33;
                              } while (var88 == null);
                           }
                        }
                     }
                  }
               }

               var10000 = (int) ((recovery$indy$68(this.settingBalanceCheck, -4532575296364172959L, var5)) ? 1 : 0);
            }
         }

         var102 = var33;
      }

      if (var1 >= 0) {
         if (var102 == null) {
            if (var10000 == 0) {
               return;
            }

            long var114;
            var10000 = (var114 = this.field_40 - 0L) == 0L ? 0 : (var114 < 0L ? -1 : 1);
         }

         var102 = var33;
      }

      label756: {
         if (var102 == null) {
            if (var10000 <= 0) {
               return;
            }

            var100 = this;
            if (var33 != null) {
               break label756;
            }

            var10000 = (int) ((recovery$indy$69(this.field_40a, this.field_40 + this.field_437, var29, -4531706052201749357L, var5)) ? 1 : 0);
         }

         if (var10000 != 0) {
            return;
         }

         recovery$indy$70(var2, 0.0F, -4530765095460203874L, var5);
         var100 = this;
      }

      var100.field_43a = true;
   }

   @Override
   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      long var5;
      long var7;
      String var9;
      TimerRange_47CE var12;
      label39: {
         label38: {
            var5 = (long)var1 << 32 | var3 << 32 >>> 32;
            var7 = var5 ^ 117769954117231L;
            var9 = recovery$indy$71(4725046116742489972L, var5);
            var12 = this;
            if (var9 == null) {
               if (this.field_48 != null) {
                  var12 = this;
                  if (var9 != null) {
                     break label39;
                  }

                  if (this.field_48 == recovery$indy$72(field_43, 4726377110579217189L, var5)) {
                     break label38;
                  }
               }

               var12 = this;
            }

            recovery$indy$73(var12.field_46, 4726289861687688426L, var5);
         }

         var12 = this;
      }

      C_47cu var13 = var12.field_46;
      if (var9 == null) {
         if (!recovery$indy$74(var12.field_46, 500L, var7, 4725753087766914074L, var5)) {
            this.field_40 = -1L;
            this.field_47 = System.currentTimeMillis();
         }

         var13 = this.field_40a;
      }

      recovery$indy$75(var13, 4726289861687688426L, var5);
      long var10 = System.currentTimeMillis() - this.field_47;
      this.field_40 += (var10 - 50L) * -1L;
      this.field_47 = System.currentTimeMillis();
      this.field_40 = Math.max(-100L, this.field_40);
      this.field_48 = recovery$indy$76(field_43, 4726377110579217189L, var5);
   }

   @Override
   public void method_47$05bd94f678(C_472n var1, long var2) {
      String var4 = recovery$indy$77(6398930156991446571L, var2);
      if (var2 > 0L) {
         TimerRange_47CE var10000 = this;
         if (var4 == null) {
            if (this.field_438 < 2) {
               recovery$indy$79(
                  var1,
                  ((float[])this.field_43h.get(this.field_43p))[this.field_438] * recovery$indy$78(var1, 6398374802252861864L, var2),
                  6398493265532426164L,
                  var2
               );
            }

            var10000 = this;
         }

         var10000.field_438++;
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$80(this, 25, var3, -7101646771445799626L, var1);
      recovery$indy$81(this, 21, var3, -7101646771445799626L, var1);
      recovery$indy$82(this, 18, var3, -7101646771445799626L, var1);
      recovery$indy$83(this, 26, var3, -7101646771445799626L, var1);
      recovery$indy$84(this, 42, var3, -7101646771445799626L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      this.field_48 = null;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_40 = -1L;
      this.field_47 = System.currentTimeMillis();
   }

   public TimerRange_47CE(long var1) {
      super("TimerRange", "ZeitDistanz", ((a ^ var1) ^ 65665267266623L), new Color(23, 233, 123), Category.LATENCY);
      var1 = a ^ var1;
      long var3 = var1 ^ 123200927499506L;
      long var5 = var1 ^ 87913838395057L;
      long var7 = var1 ^ 82035507669028L;
      long var9 = var1 ^ 114092888496035L;
      long var11 = var1 ^ 65665267266623L;
      // Super arguments moved to the required Java constructor position.
      this.field_40 = 0L;
      this.field_40a = new C_47cu();
      this.field_40D = new C_47cu();
      this.field_46 = new C_47cu();
      this.field_48 = null;
      this.settingDelay = new NumberSetting(this, "Delay", 0.0, var9, 0.0, 20000.0, 0);
      this.settingTimerTicksForward = new NumberSetting(this, "TimerTicksForward", 5.0, var9, 1.0, 10.0, 0);
      this.settingTolerance = new NumberSetting(this, "Tolerance", 0.0, var9, -1.0, 1.0, 2);
      this.settingBalanceCheck = new BooleanSetting(this, var7, "BalanceCheck", true);
      this.settingAdditionalStop = new C_47TU(var5, this, "AdditionalStop", 1.0, 0.0, 0.0, 300.0, 0);
      this.settingOnlyOnGround = new BooleanSetting(this, var7, "OnlyOnGround", false);
      this.settingDynamic = new BooleanSetting(this, var7, "Dynamic", true);
      this.settingOnlyKillAura = new BooleanSetting(this, var7, "OnlyKillAura", true);
      this.settingClickCheck = new BooleanSetting(this, var7, "ClickCheck", false);
      this.settingForbiddenSneak = new BooleanSetting(this, var7, "ForbiddenSneak", true);
      this.settingFixMode = new ModeSetting(this, "FixMode", var3, "None", new String[]{"None", "Fix1", "Fix2"});
      this.field_43y = 0;
      this.field_44 = System.currentTimeMillis();
      this.field_43a = false;
      this.field_43p = 0;
      this.field_438 = 0;
      this.field_437 = 0;
      this.field_43h = new ArrayList();
      this.field_43h.add(new float[]{1.0F, 1.0F});
      this.field_43h.add(new float[]{0.0F, 1.0F});
      this.field_43h.add(new float[]{0.0F, 0.0F});
      this.field_43h.add(new float[]{-1.0F, 0.0F});
      this.field_43h.add(new float[]{-1.0F, -1.0F});
      this.field_43h.add(new float[]{-1.0F, 1.0F});
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Method c(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field c(Class var0, String var1, Class var2);

   private static native MethodHandle recovery$constant$0();

   private static native String recovery$indy$1(long var0, long var2);

   private static native String recovery$indy$2(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$3(int var0, long var1);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);

   private static native void recovery$indy$6(Object var0, long var1, boolean var3, long var4, long var6);

   private static native MethodHandle recovery$constant$7();

   private static native String recovery$indy$8(long var0, long var2);

   private static native C_473U recovery$indy$9(Object var0, long var1, long var3);

   private static native String recovery$indy$10(long var0, long var2);

   private static native boolean recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$12(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$13(int var0, long var1);

   private static native boolean recovery$indy$14(long var0, long var2, long var4);

   private static native boolean recovery$indy$15(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$16(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$17(Object var0, long var1, long var3);

   private static native boolean recovery$indy$18(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$19(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$20(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);

   private static native boolean recovery$indy$22(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$23(Object var0, long var1, long var3);

   private static native boolean recovery$indy$24(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$25(Object var0, long var1, long var3);

   private static native double recovery$indy$26(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$27(Object var0, long var1, long var3, long var5, long var7);

   private static native boolean recovery$indy$28(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$29(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$30(Object var0, long var1, long var3);

   private static native double recovery$indy$31(Object var0, long var1, long var3, long var5);

   private static native WorldClient recovery$indy$32(Object var0, long var1, long var3);

   private static native boolean recovery$indy$33(Object var0, long var1, long var3);

   private static native EntityLivingBase recovery$indy$34(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$35(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$37(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$38(Object var0, long var1, long var3);

   private static native double[] recovery$indy$39(int var0, long var1, Object var3, Object var4, Object var5, long var6, long var8);

   private static native EntityPlayerSP recovery$indy$40(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$41(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$42(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$43(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$44(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$45(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$46(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$47(Object var0, long var1, long var3);

   private static native boolean recovery$indy$48(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$49(Object var0, char var1, short var2, int var3, long var4, long var6);

   private static native double recovery$indy$50(Object var0, long var1, long var3);

   private static native double recovery$indy$51(Object var0, long var1, long var3, long var5);

   private static native int recovery$indy$52(Object var0, long var1, long var3);

   private static native void recovery$indy$53(Object var0, float var1, long var2, long var4);

   private static native double recovery$indy$54(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$55(Object var0, long var1, long var3, long var5);

   private static native int recovery$indy$56(Object var0, long var1, double var3, double var5, long var7, long var9);

   private static native boolean recovery$indy$57(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$58(Object var0, long var1, long var3);

   private static native String recovery$indy$59(int var0, long var1);

   private static native String recovery$indy$60(int var0, long var1);

   private static native void recovery$indy$61(Object var0, long var1, byte var3, Object var4, long var5, long var7);

   private static native String recovery$indy$62(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$63(int var0, long var1);

   private static native void recovery$indy$64(Object var0, long var1, long var3);

   private static native void recovery$indy$65(Object var0, long var1, long var3);

   private static native boolean recovery$indy$66(Object var0, long var1, long var3);

   private static native boolean recovery$indy$67(Object var0, long var1, long var3);

   private static native boolean recovery$indy$68(Object var0, long var1, long var3);

   private static native boolean recovery$indy$69(Object var0, long var1, long var3, long var5, long var7);

   private static native void recovery$indy$70(Object var0, float var1, long var2, long var4);

   private static native String recovery$indy$71(long var0, long var2);

   private static native WorldClient recovery$indy$72(Object var0, long var1, long var3);

   private static native void recovery$indy$73(Object var0, long var1, long var3);

   private static native boolean recovery$indy$74(Object var0, long var1, long var3, long var5, long var7);

   private static native void recovery$indy$75(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$76(Object var0, long var1, long var3);

   private static native String recovery$indy$77(long var0, long var2);

   private static native float recovery$indy$78(Object var0, long var1, long var3);

   private static native void recovery$indy$79(Object var0, float var1, long var2, long var4);

   private static native void recovery$indy$80(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$81(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$82(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$83(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$84(Object var0, int var1, long var2, long var4, long var6);
}
