package augustus.recovered.modules.movement;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_407;
import net.C_40X;
import net.C_41Q;
import net.C_45n;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.C_47K7;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47cu;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.world.World;
import net.C_47mK;
import net.C_47mz;
import net.C_47oO;
import client.module.Category;
import net.C_47zh;
import net.C_4f;

public class Timer_47Q1 extends Module implements C_41Q, C_47oO, C_47mK, C_47mz {
   public final NumberSetting settingTime;
   public final BooleanSetting settingTimerAfterVelocity;
   public final NumberSetting settingTimerAfterVelocityVal;
   public final BooleanSetting settingTimerAfterFallDamage;
   public final NumberSetting settingTimerAfterFallDamageVal;
   public final BooleanSetting settingTimerAtBlink;
   public final NumberSetting settingTimerAtBlinkVal;
   private final C_47cu field_44;
   private boolean field_43P;
   private boolean field_43a;
   private static final long a = C_4f.a(-696016342361925480L, 8785344976650682674L, MethodHandles.lookup().lookupClass()).a(92775159715018L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[43];
   private static final String[] f = new String[43];

   private static native void b();

   private static native String b(byte[] var0);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle b(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

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
            var23 = f(1565253866672784L, 0L);
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
            var23 = f(1565253866672784L, 0L);
         }
      }
   }

   @Override
   public void method_46$e535f8442d(C_47zh var1, long var2, short var4) {
      long var5 = var2 << 16 | (long)var4 << 48 >>> 48;
      if (recovery$indy$1(var1, 1766166015446538728L, var5)) {
         this.field_43a = true;
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
            var10000 = 57;
            break;
         case 1:
            var10000 = 56;
            break;
         case 2:
            var10000 = 16;
            break;
         case 3:
            var10000 = 31;
            break;
         case 4:
            var10000 = 21;
            break;
         case 5:
            var10000 = 30;
            break;
         case 6:
            var10000 = 2;
            break;
         case 7:
            var10000 = 36;
            break;
         case 8:
            var10000 = 0;
            break;
         case 9:
            var10000 = 14;
            break;
         case 10:
            var10000 = 28;
            break;
         case 11:
            var10000 = 33;
            break;
         case 12:
            var10000 = 53;
            break;
         case 13:
            var10000 = 43;
            break;
         case 14:
            var10000 = 20;
            break;
         case 15:
            var10000 = 46;
            break;
         case 16:
            var10000 = 47;
            break;
         case 17:
            var10000 = 35;
            break;
         case 18:
            var10000 = 44;
            break;
         case 19:
            var10000 = 11;
            break;
         case 20:
            var10000 = 58;
            break;
         case 21:
            var10000 = 4;
            break;
         case 22:
            var10000 = 62;
            break;
         case 23:
            var10000 = 22;
            break;
         case 24:
            var10000 = 23;
            break;
         case 25:
            var10000 = 55;
            break;
         case 26:
            var10000 = 15;
            break;
         case 27:
            var10000 = 10;
            break;
         case 28:
            var10000 = 24;
            break;
         case 29:
            var10000 = 13;
            break;
         case 30:
            var10000 = 48;
            break;
         case 31:
            var10000 = 39;
            break;
         case 32:
            var10000 = 49;
            break;
         case 33:
            var10000 = 37;
            break;
         case 34:
            var10000 = 18;
            break;
         case 35:
            var10000 = 42;
            break;
         case 36:
            var10000 = 19;
            break;
         case 37:
            var10000 = 60;
            break;
         case 38:
            var10000 = 17;
            break;
         case 39:
            var10000 = 45;
            break;
         case 40:
            var10000 = 51;
            break;
         case 41:
            var10000 = 26;
            break;
         case 42:
            var10000 = 1;
            break;
         case 43:
            var10000 = 34;
            break;
         case 44:
            var10000 = 38;
            break;
         case 45:
            var10000 = 12;
            break;
         case 46:
            var10000 = 54;
            break;
         case 47:
            var10000 = 7;
            break;
         case 48:
            var10000 = 3;
            break;
         case 49:
            var10000 = 63;
            break;
         case 50:
            var10000 = 61;
            break;
         case 51:
            var10000 = 40;
            break;
         case 52:
            var10000 = 27;
            break;
         case 53:
            var10000 = 5;
            break;
         case 54:
            var10000 = 8;
            break;
         case 55:
            var10000 = 41;
            break;
         case 56:
            var10000 = 32;
            break;
         case 57:
            var10000 = 25;
            break;
         case 58:
            var10000 = 9;
            break;
         case 59:
            var10000 = 50;
            break;
         case 60:
            var10000 = 52;
            break;
         case 61:
            var10000 = 29;
            break;
         case 62:
            var10000 = 6;
            break;
         default:
            var10000 = 59;
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

   private static native Field d(Class var0, String var1, Class var2);

   private static native CallSite d(Lookup var0, String var1, MethodType var2);

   private static native Method d(Class var0, String var1, Class var2, int var3, Class[] var4);

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
            var12 = f(1565253866672784L, 0L);
         }
      }
   }

   @Override
   public void method_40$e781d6169a(C_47zh var1, long var2) {
      if (recovery$indy$3(var1, 8496247165867832450L, var2)) {
         this.field_43a = true;
      }
   }

   @Override
   public void method_44$c3e139a72f(C_407 var1, long var2) {
      long var10001 = var2 ^ 20482839053444L;
      int var4 = (int)((var2 ^ 20482839053444L) >>> 48);
      int var5 = (int)((var2 ^ 20482839053444L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 50668263188801L;
      boolean var9 = recovery$indy$4(-5858710422788806778L, var2);
      boolean var10000 = recovery$indy$7(
         this,
         recovery$indy$5(var1, -5854854625862799474L, var2),
         recovery$indy$6(field_43, -5855117831425026426L, var2).field_48Q,
         0.01,
         (char)var4,
         var5,
         (char)var6,
         -5854954329401841859L,
         var2
      );
      if (var9) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$10(
            this,
            recovery$indy$8(var1, -5859162384442383871L, var2),
            recovery$indy$9(field_43, -5855117831425026426L, var2).field_48j,
            0.01,
            (char)var4,
            var5,
            (char)var6,
            -5854954329401841859L,
            var2
         );
      }

      boolean var10 = var9;
      if (var2 > 0L) {
         if (var9) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$13(
               this,
               recovery$indy$11(var1, -5858913412059808082L, var2),
               recovery$indy$12(field_43, -5855117831425026426L, var2).field_42o,
               0.01,
               (char)var4,
               var5,
               (char)var6,
               -5854954329401841859L,
               var2
            );
         }

         var10 = var9;
      }

      if (var2 >= 0L) {
         if (var10) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$14(var1, -5855318557539861962L, var2).equals(recovery$indy$15(20683, 6095265990736852427L ^ var2));
         }

         var10 = var9;
      }

      label68: {
         label67: {
            label91: {
               if (var2 >= 0L) {
                  if (var10) {
                     if (var10000) {
                        break label91;
                     }

                     var10000 = recovery$indy$16(var1, -5855318557539861962L, var2).equals(recovery$indy$17(8182, 4876646338491939583L ^ var2));
                  }

                  var10 = var9;
               }

               if (!var10) {
                  break label68;
               }

               if (!var10000) {
                  break label67;
               }
            }

            recovery$indy$18(this.field_44, -5855080063682553347L, var2);
         }

         var10000 = recovery$indy$19(var1, -5855318557539861962L, var2).equals(recovery$indy$20(32401, 1356414854436952978L ^ var2));
      }

      if (var10000) {
         boolean var11 = recovery$indy$21(this.field_44, 100L, var7, -5855430845979072407L, var2);
         if (var9) {
            var11 = !var11;
         }

         this.field_43P = var11;
      }
   }

   @Override
   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      int var13;
      boolean var16, var18, var19;
      long var5 = (long)var1 << 32 | var3 << 32 >>> 32;
      long var7 = var5 ^ 125384268368392L;
      long var9 = var5 ^ 93560678845923L;
      boolean var11 = recovery$indy$22(4728615218182783978L, var5);
      recovery$indy$24(this, var7, String.valueOf(recovery$indy$23(field_43, 4724373851093360809L, var5).field_43), 4724460358377181228L, var5);
      Object var10000 = field_43;
      if (!var11) {
         label170: {
            long var10001 = 4724785900013711715L;
            long var10002 = var5;
            if (var1 >= 0) {
               if (recovery$indy$25(field_43, 4724785900013711715L, var5) == null) {
                  break label170;
               }

               var10000 = field_43;
               var10001 = 4724333543558805928L;
               var10002 = var5;
            }

            EntityPlayerSP var12 = recovery$indy$26(var10000, var10001, var10002);
            if (!var11) {
               if (var12 == null) {
                  break label170;
               }

               var12 = recovery$indy$28(field_43, 4724333543558805928L, var5);
            }

            label140: {
               var13 = var12.field_432;
               label139:
               if (!var11) {
                  label137: {
                     if (var12.field_432 > 0) {
                        var13 = (int) ((recovery$indy$29(this.settingTimerAfterVelocity, 4727844305729495876L, var5)) ? 1 : 0);
                        if (var11) {
                           break label139;
                        }

                        if (var13 != 0) {
                           var13 = (int) ((this.field_43P) ? 1 : 0);
                           var16 = var11;
                           if (var3 < 0L) {
                              break label140;
                           }

                           if (var11) {
                              break label139;
                           }

                           if (!this.field_43P) {
                              var10000 = field_43;
                              var10001 = 4724373851093360809L;
                              var10002 = var5;
                              if (var1 < 0) {
                                 break label137;
                              }

                              recovery$indy$30(field_43, 4724373851093360809L, var5).field_43 = (float)Math.max(
                                 0.1, recovery$indy$31(this.settingTimerAfterVelocityVal, var9, 4728531743526158270L, var5)
                              );
                              if (!var11) {
                                 return;
                              }
                           }
                        }
                     }

                     var10000 = field_43;
                     var10001 = 4724333543558805928L;
                     var10002 = var5;
                  }

                  var13 = recovery$indy$32(var10000, var10001, var10002).field_432;
               }

               var16 = var11;
            }

            label119: {
               label118:
               if (!var16) {
                  if (var13 > 0) {
                     var13 = (int) ((recovery$indy$33(this.settingTimerAfterFallDamage, 4727844305729495876L, var5)) ? 1 : 0);
                     if (var11) {
                        break label118;
                     }

                     if (var13 != 0) {
                        var13 = (int) ((this.field_43P) ? 1 : 0);
                        var18 = var11;
                        if (var3 < 0L) {
                           break label119;
                        }

                        if (var11) {
                           break label118;
                        }

                        if (this.field_43P) {
                           recovery$indy$34(field_43, 4724373851093360809L, var5).field_43 = (float)Math.max(
                              0.1, recovery$indy$35(this.settingTimerAfterFallDamageVal, var9, 4728531743526158270L, var5)
                           );
                           if (!var11) {
                              return;
                           }
                        }
                     }
                  }

                  var13 = (int) ((this.field_43a) ? 1 : 0);
               }

               var18 = var11;
            }

            label102: {
               label101: {
                  label163: {
                     if (!var18) {
                        if (var13 == 0) {
                           break label102;
                        }

                        var10000 = this;
                        var19 = var11;
                        if (var3 <= 0L) {
                           break label101;
                        }

                        if (var11) {
                           break label163;
                        }

                        var13 = (int) ((recovery$indy$36(this.settingTimerAtBlink, 4727844305729495876L, var5)) ? 1 : 0);
                     }

                     if (var13 == 0) {
                        break label102;
                     }

                     recovery$indy$37(field_43, 4724373851093360809L, var5).field_43 = (float)Math.max(
                        0.1, recovery$indy$38(this.settingTimerAtBlinkVal, var9, 4728531743526158270L, var5)
                     );
                     var10000 = this;
                  }

                  var19 = false;
               }

               ((Timer_47Q1)var10000).field_43a = var19;
               if (!var11) {
                  return;
               }
            }

            recovery$indy$39(field_43, 4724373851093360809L, var5).field_43 = (float)Math.max(
               0.1, recovery$indy$40(this.settingTime, var9, 4728531743526158270L, var5)
            );
            return;
         }

         var10000 = field_43;
      }

      recovery$indy$27(var10000, 4724373851093360809L, var5).field_43 = 1.0F;
   }

   @Override
   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      if (recovery$indy$41(var4, 3261683661197109807L, var5) == null) {
         recovery$indy$42(field_43, 3264353277890989172L, var5).field_43 = 1.0F;
      }
   }

   private boolean method_43$8920d8bb25(double var1, double var3, double var5, char var7, int var8, char var9) {
      long var10 = ((long)var7 << 48 | (long)var8 << 32 >>> 16 | (long)var9 << 48 >>> 48) ^ a;
      boolean var12 = recovery$indy$43(7345272748741799128L, var10);
      double var13 = Math.abs(var1 - var3);
      double var15;
      int var10000 = (var15 = var13 - var5) == 0.0 ? 0 : (var15 < 0.0 ? -1 : 1);
      if (var12) {
         var10000 = var10000 <= 0 ? 1 : 0;
      }

      return var10000 != 0;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$44(this, 18, -4, var3, -7099296627098286281L, var1);
      recovery$indy$45(this, 17, var5, -7098911655641995271L, var1);
      recovery$indy$46(this, 35, var5, -7098911655641995271L, var1);
      recovery$indy$47(this, 25, var5, -7098911655641995271L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$48(field_43, -7740805813618821718L, var1).field_43 = 1.0F;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Timer_47Q1(int var1, int var2, int var3) {
      super("Timer", "Zeitschaltuhr", ((((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a) ^ 113003976388289L), new Color(180, 176, 119), Category.MOVEMENT);
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 26260679439066L;
      long var8 = var4 ^ 64572570733917L;
      long var10 = var4 ^ 113003976388289L;
      // Pure super-constructor arguments are evaluated in the first statement above.
      this.settingTime = new NumberSetting(this, "Time", 1.0, var8, 0.1, 10.0, 2);
      this.settingTimerAfterVelocity = new BooleanSetting(this, var6, "TimerAfterVelocity", false);
      NumberSetting var10001 = new NumberSetting(this, "TimerAfterVelocityVal", 1.0, var8, 0.1, 10.0, 2);
      BooleanSetting var10002 = this.settingTimerAfterVelocity;
      this.settingTimerAfterVelocity.getClass();
      C_45n var20 = recovery$indy$49(var10002);
      long var10003 = -1769628705078464341L;
      C_45n var12 = var20;
      NumberSetting var13 = var10001;
      this.settingTimerAfterVelocityVal = var13.method_43$9db6d416f4(var12);
      this.settingTimerAfterFallDamage = new BooleanSetting(this, var6, "TimerAfterFallDamage", false);
      var10001 = new NumberSetting(this, "TimerAfterFallDamageVal", 1.0, var8, 0.1, 10.0, 2);
      var10002 = this.settingTimerAfterFallDamage;
      this.settingTimerAfterFallDamage.getClass();
      C_45n var22 = recovery$indy$50(var10002);
      var10003 = -1769628705078464341L;
      C_45n var14 = var22;
      NumberSetting var15 = var10001;
      this.settingTimerAfterFallDamageVal = var15.method_43$9db6d416f4(var14);
      this.settingTimerAtBlink = new BooleanSetting(this, var6, "TimerAtBlink", false);
      var10001 = new NumberSetting(this, "TimerAtBlinkVal", 1.0, var8, 0.1, 10.0, 2);
      var10002 = this.settingTimerAtBlink;
      this.settingTimerAtBlink.getClass();
      C_45n var24 = recovery$indy$51(var10002);
      var10003 = -1769628705078464341L;
      C_45n var16 = var24;
      NumberSetting var17 = var10001;
      this.settingTimerAtBlinkVal = var17.method_43$9db6d416f4(var16);
      this.field_44 = new C_47cu();
      this.field_43P = false;
      this.field_43a = false;
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native Method c(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field c(Class var0, String var1, Class var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$2();

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native boolean recovery$indy$4(long var0, long var2);

   private static native double recovery$indy$5(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(Object var0, double var1, double var3, double var5, char var7, int var8, char var9, long var10, long var12);

   private static native double recovery$indy$8(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native boolean recovery$indy$10(Object var0, double var1, double var3, double var5, char var7, int var8, char var9, long var10, long var12);

   private static native double recovery$indy$11(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);

   private static native boolean recovery$indy$13(Object var0, double var1, double var3, double var5, char var7, int var8, char var9, long var10, long var12);

   private static native String recovery$indy$14(Object var0, long var1, long var3);

   private static native String recovery$indy$15(int var0, long var1);

   private static native String recovery$indy$16(Object var0, long var1, long var3);

   private static native String recovery$indy$17(int var0, long var1);

   private static native void recovery$indy$18(Object var0, long var1, long var3);

   private static native String recovery$indy$19(Object var0, long var1, long var3);

   private static native String recovery$indy$20(int var0, long var1);

   private static native boolean recovery$indy$21(Object var0, long var1, long var3, long var5, long var7);

   private static native boolean recovery$indy$22(long var0, long var2);

   private static native C_40X recovery$indy$23(Object var0, long var1, long var3);

   private static native void recovery$indy$24(Object var0, long var1, Object var3, long var4, long var6);

   private static native WorldClient recovery$indy$25(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$27(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);

   private static native boolean recovery$indy$29(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$30(Object var0, long var1, long var3);

   private static native double recovery$indy$31(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);

   private static native boolean recovery$indy$33(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$34(Object var0, long var1, long var3);

   private static native double recovery$indy$35(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$36(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$37(Object var0, long var1, long var3);

   private static native double recovery$indy$38(Object var0, long var1, long var3, long var5);

   private static native C_40X recovery$indy$39(Object var0, long var1, long var3);

   private static native double recovery$indy$40(Object var0, long var1, long var3, long var5);

   private static native World recovery$indy$41(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$42(Object var0, long var1, long var3);

   private static native boolean recovery$indy$43(long var0, long var2);

   private static native void recovery$indy$44(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native void recovery$indy$45(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$46(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$47(Object var0, int var1, long var2, long var4, long var6);

   private static native C_40X recovery$indy$48(Object var0, long var1, long var3);

   private static native C_45n recovery$indy$49(BooleanSetting var0);

   private static native C_45n recovery$indy$50(BooleanSetting var0);

   private static native C_45n recovery$indy$51(BooleanSetting var0);
}
