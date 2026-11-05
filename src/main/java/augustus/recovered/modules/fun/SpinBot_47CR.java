package augustus.recovered.modules.fun;

import augustus.recovered.modules.combat.KillAura_47CY;
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
import client.Client;
import net.C_41Q;
import net.C_45n;
import net.C_472n;
import net.C_475c;
import net.C_475y;
import net.C_477r;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47ES;
import net.C_47Fp;
import net.C_47Ij;
import net.C_47K7;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.BooleanSetting;
import client.setting.RangeSetting;
import net.C_47U0;
import net.C_47UH;
import net.C_47VO;
import net.C_47cu;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47oo;
import client.ClientGlobals;
import client.module.Category;
import net.C_47tU;
import net.C_47xz;
import net.C_47y6;
import net.C_4f;

public class SpinBot_47CR extends Module implements C_47U0, C_47UH, C_47xz, C_47hi, C_41Q {
   private final RangeSetting settingYawSpeed;
   private final RangeSetting settingPitchValue;
   private final BooleanSetting settingServerside;
   public final BooleanSetting settingMoveFix;
   private final MultiSelectSetting settingStopSpinningOn;
   private final C_47cu field_49;
   private final C_47cu field_47;
   private C_477r field_42;
   private C_477r field_48;
   private boolean field_43a;
   private static final long a = C_4f.a(6014676673123054566L, -1826985632938197899L, MethodHandles.lookup().lookupClass()).a(193289265546601L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[68];
   private static final String[] f = new String[68];

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native void b();

   private static native MethodHandle b(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native String b(byte[] var0);

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
            var23 = f(2478359617262409L, 0L);
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
            var23 = f(2478359617262409L, 0L);
         }
      }
   }

   private void method_46$3df107b78d(C_47K7 var1, long var2) {
      var2 = a ^ var2;
      if (recovery$indy$1(this.settingServerside, 2560615737608534693L, var2)) {
         recovery$indy$2(var1, this.field_42.field_44, 2561539338676895921L, var2);
         recovery$indy$3(var1, this.field_42.field_41, 2561871817958435707L, var2);
      }

      recovery$indy$4(field_43, 2562541235822703929L, var2).field_43m = this.field_42.field_44;
      recovery$indy$5(field_43, 2562541235822703929L, var2).field_47J = this.field_42.field_41;
      recovery$indy$6(field_43, 2562541235822703929L, var2).field_43_ = this.field_42.field_44;
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
            var10000 = 43;
            break;
         case 1:
            var10000 = 24;
            break;
         case 2:
            var10000 = 20;
            break;
         case 3:
            var10000 = 39;
            break;
         case 4:
            var10000 = 35;
            break;
         case 5:
            var10000 = 19;
            break;
         case 6:
            var10000 = 23;
            break;
         case 7:
            var10000 = 54;
            break;
         case 8:
            var10000 = 27;
            break;
         case 9:
            var10000 = 46;
            break;
         case 10:
            var10000 = 62;
            break;
         case 11:
            var10000 = 60;
            break;
         case 12:
            var10000 = 50;
            break;
         case 13:
            var10000 = 36;
            break;
         case 14:
            var10000 = 8;
            break;
         case 15:
            var10000 = 2;
            break;
         case 16:
            var10000 = 41;
            break;
         case 17:
            var10000 = 3;
            break;
         case 18:
            var10000 = 44;
            break;
         case 19:
            var10000 = 40;
            break;
         case 20:
            var10000 = 61;
            break;
         case 21:
            var10000 = 55;
            break;
         case 22:
            var10000 = 56;
            break;
         case 23:
            var10000 = 49;
            break;
         case 24:
            var10000 = 33;
            break;
         case 25:
            var10000 = 42;
            break;
         case 26:
            var10000 = 53;
            break;
         case 27:
            var10000 = 52;
            break;
         case 28:
            var10000 = 7;
            break;
         case 29:
            var10000 = 4;
            break;
         case 30:
            var10000 = 5;
            break;
         case 31:
            var10000 = 0;
            break;
         case 32:
            var10000 = 13;
            break;
         case 33:
            var10000 = 57;
            break;
         case 34:
            var10000 = 51;
            break;
         case 35:
            var10000 = 14;
            break;
         case 36:
            var10000 = 48;
            break;
         case 37:
            var10000 = 17;
            break;
         case 38:
            var10000 = 30;
            break;
         case 39:
            var10000 = 12;
            break;
         case 40:
            var10000 = 38;
            break;
         case 41:
            var10000 = 58;
            break;
         case 42:
            var10000 = 45;
            break;
         case 43:
            var10000 = 22;
            break;
         case 44:
            var10000 = 32;
            break;
         case 45:
            var10000 = 18;
            break;
         case 46:
            var10000 = 28;
            break;
         case 47:
            var10000 = 1;
            break;
         case 48:
            var10000 = 10;
            break;
         case 49:
            var10000 = 34;
            break;
         case 50:
            var10000 = 9;
            break;
         case 51:
            var10000 = 21;
            break;
         case 52:
            var10000 = 26;
            break;
         case 53:
            var10000 = 29;
            break;
         case 54:
            var10000 = 47;
            break;
         case 55:
            var10000 = 37;
            break;
         case 56:
            var10000 = 31;
            break;
         case 57:
            var10000 = 15;
            break;
         case 58:
            var10000 = 63;
            break;
         case 59:
            var10000 = 25;
            break;
         case 60:
            var10000 = 59;
            break;
         case 61:
            var10000 = 11;
            break;
         case 62:
            var10000 = 16;
            break;
         default:
            var10000 = 6;
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

   private void method_42$537c8d9634(int var1, short var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 89135578384093L;
      long var8 = var4 ^ 113839174430454L;
      long var10 = var4 ^ 125534641091431L;
      long var10001 = var4 ^ 24044166373377L;
      int var12 = (int)((var4 ^ 24044166373377L) >>> 48);
      int var13 = (int)((var4 ^ 24044166373377L) << 16 >>> 32);
      int var14 = (int)(var10001 << 48 >>> 48);
      String[] var15 = recovery$indy$7(-828206848391753972L, var4);
      boolean var10000 = recovery$indy$8(this.field_47, 1000L, var10, -820675587115436562L, var4);
      if (var15 != null) {
         if (!var10000) {
            return;
         }

         this.field_42 = recovery$indy$9(var8, this.field_42, this.field_48, -820301620188904958L, var4);
         var10000 = recovery$indy$10(this, var6, -820095324954230061L, var4);
      }

      if (var10000) {
         recovery$indy$11(ClientGlobals.field_46, this.field_42, 8, (char)var12, var13, var14, this, -819744303684886685L, var4);
      }
   }

   @Override
   public void method_42$0db73fbf69(long var1, C_47VO var3) {
      long var4 = var1 ^ 99491139476458L;
      String[] var6 = recovery$indy$12(-6217618204271177157L, var1);
      boolean var10000 = this.field_43a;
      if (var6 != null) {
         if (!this.field_43a) {
            return;
         }

         var10000 = recovery$indy$13(this, var4, -6221330598831628316L, var1);
      }

      if (!var10000) {
         recovery$indy$16(
            var3, recovery$indy$15(recovery$indy$14(-6221022301050064326L, var1), -6221496577081437783L, var1).field_43, -6219595303507649684L, var1
         );
      }
   }

   private static native Field d(Class var0, String var1, Class var2);

   private static native Method d(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite d(Lookup var0, String var1, MethodType var2);

   @Override
   public void method_41$fae8de1664(C_475c var1) {
   }

   @Override
   public void method_41$0db73fbf69(long var1, C_47VO var3) {
      long var4 = var1 ^ 131625597848516L;
      String[] var6 = recovery$indy$18(-5073101684693269995L, var1);
      boolean var10000 = this.field_43a;
      if (var6 != null) {
         if (!this.field_43a) {
            return;
         }

         var10000 = recovery$indy$19(this, var4, -5078009779124088886L, var1);
      }

      if (!var10000) {
         recovery$indy$22(
            var3, recovery$indy$21(recovery$indy$20(-5078845524129963500L, var1), -5078125129271705209L, var1).field_43, -5079599904004043966L, var1
         );
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
            var12 = f(2478359617262409L, 0L);
         }
      }
   }

   @Override
   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      long var5;
      long var7;
      SpinBot_47CR var10;
      label28: {
         var5 = (long)var1 << 32 | var3 << 32 >>> 32;
         var7 = var5 ^ 59427785492437L;
         String[] var9 = recovery$indy$23(4722454609361631748L, var5);
         boolean var10000 = recovery$indy$24(this.settingMoveFix, 4724385963675687100L, var5);
         if (var9 != null) {
            if (var10000) {
               return;
            }

            var10 = this;
            if (var9 == null) {
               break label28;
            }

            var10000 = this.field_43a;
         }

         if (!var10000) {
            return;
         }

         var10 = this;
      }

      recovery$indy$25(var10, var2, var7, 4725362831345144654L, var5);
   }

   private boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 87947553220198L;
      long var5 = var1 ^ 110162597642048L;
      long var7 = var1 ^ 127545096548464L;
      String[] var9 = recovery$indy$26(2894062216159007652L, var1);
      boolean var10000 = recovery$indy$27(this.settingServerside, 2895855457217638684L, var1);
      if (var9 != null) {
         if (var10000) {
            C_47Ij var10;
            label242: {
               var10 = recovery$indy$28(field_43, 2897783704350604928L, var1)
                  .method_46$f1643728ee(
                     4.5,
                     1.0F,
                     recovery$indy$30(recovery$indy$29(2897272798017958821L, var1), 2897959417249206326L, var1).field_43,
                     recovery$indy$32(recovery$indy$31(2897272798017958821L, var1), 2897959417249206326L, var1).field_48
                  );
               var10000 = recovery$indy$33(C_47Fp.CLICK, 2896732561571347006L, var1);
               String[] var10001 = var9;
               if (var1 > 0L) {
                  if (var9 != null) {
                     if (!var10000) {
                        break label242;
                     }

                     var10000 = recovery$indy$34(field_43, 2896532974925769862L, var1).field_45w.method_42$aae029aa0a();
                  }

                  var10001 = var9;
               }

               if (var10001 == null) {
                  return var10000;
               }

               if (!var10000) {
                  var10000 = recovery$indy$35(field_43, 2896532974925769862L, var1).field_44l.method_42$aae029aa0a();
                  if (var9 == null) {
                     return var10000;
                  }

                  if (!var10000) {
                     var10000 = recovery$indy$36(0, var7, 2896499518956772957L, var1);
                     if (var9 == null) {
                        return var10000;
                     }

                     if (!var10000) {
                        var10000 = recovery$indy$37(1, var7, 2896499518956772957L, var1);
                        if (var9 == null) {
                           return var10000;
                        }

                        if (!var10000) {
                           break label242;
                        }
                     }
                  }
               }

               return false;
            }

            String[] var18;
            label193: {
               label192: {
                  label191: {
                     C_47Ij var13 = var10;
                     if (var9 != null) {
                        if (var10 == null) {
                           break label191;
                        }

                        var13 = var10;
                     }

                     if (var13.field_49 == C_47Az.BLOCK) {
                        label184: {
                           var10000 = recovery$indy$38(C_47Fp.CHEST, 2896732561571347006L, var1);
                           label183:
                           if (var9 != null) {
                              if (var10000) {
                                 var10000 = recovery$indy$39(field_43, 2897630507370792822L, var1)
                                    .method_46$efbf73d2b1(var10.method_49$5730377d31())
                                    .method_48$e084f7739d() instanceof C_47ES;
                                 var18 = var9;
                                 if (var1 < 0L) {
                                    break label184;
                                 }

                                 if (var9 == null) {
                                    break label183;
                                 }

                                 if (var10000) {
                                    return false;
                                 }
                              }

                              var10000 = recovery$indy$40(C_47Fp.CRAFTER, 2896732561571347006L, var1);
                           }

                           var18 = var9;
                        }

                        label173: {
                           label172:
                           if (var18 != null) {
                              if (var10000) {
                                 var10000 = recovery$indy$41(field_43, 2897630507370792822L, var1)
                                    .method_46$efbf73d2b1(var10.method_49$5730377d31())
                                    .method_48$e084f7739d()
                                    .equals(C_475y.method_49$c1e739f280(58));
                                 var18 = var9;
                                 if (var1 <= 0L) {
                                    break label173;
                                 }

                                 if (var9 == null) {
                                    break label172;
                                 }

                                 if (var10000) {
                                    return false;
                                 }
                              }

                              var10000 = recovery$indy$42(C_47Fp.FURNACE, 2896732561571347006L, var1);
                           }

                           var18 = var9;
                        }

                        if (var18 == null) {
                           break label192;
                        }

                        if (var10000) {
                           var10000 = recovery$indy$43(field_43, 2897630507370792822L, var1)
                              .method_46$efbf73d2b1(var10.method_49$5730377d31())
                              .method_48$e084f7739d()
                              .equals(C_475y.method_49$c1e739f280(61));
                           var18 = var9;
                           if (var1 < 0L) {
                              break label193;
                           }

                           if (var9 == null) {
                              break label192;
                           }

                           if (var10000) {
                              return false;
                           }
                        }
                     }
                  }

                  var10000 = recovery$indy$44(ClientGlobals.field_48.field_48Q, var3, 2894026929019785823L, var1);
               }

               var18 = var9;
            }

            label151: {
               label150:
               if (var18 != null) {
                  label148:
                  if (var10000) {
                     KillAura_47CY var15 = ClientGlobals.field_48.field_48Q;
                     if (var9 != null) {
                        if (ClientGlobals.field_48.field_48Q.field_45z == null) {
                           break label148;
                        }

                        var15 = ClientGlobals.field_48.field_48Q;
                     }

                     var10000 = recovery$indy$45(var15.field_453, 2895855457217638684L, var1);
                     var18 = var9;
                     if (var1 < 0L) {
                        break label151;
                     }

                     if (var9 == null) {
                        break label150;
                     }

                     if (!var10000) {
                        return false;
                     }
                  }

                  var10000 = recovery$indy$46(var5, 2896626877926448206L, var1);
               }

               var18 = var9;
            }

            if (var1 > 0L) {
               if (var18 != null) {
                  if (var10000) {
                     return false;
                  }

                  var10000 = recovery$indy$47(ClientGlobals.field_48.field_41V, var3, 2894026929019785823L, var1);
               }

               var18 = var9;
            }

            if (var18 == null) {
               return var10000;
            }

            if (!var10000) {
               return true;
            }

            return false;
         }

         var10000 = true;
      }

      return var10000;
   }

   private boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      String[] var3 = recovery$indy$48(6309753278338100253L, var1);
      boolean var10000 = recovery$indy$49(this.settingMoveFix, 6307674318615482021L, var1);
      if (var3 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$50(this.settingServerside, 6307674318615482021L, var1);
      }

      return var3 == null ? var10000 : var10000;
   }

   private void method_47$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 38140317526531L;
      String[] var5 = recovery$indy$51(7918962973126940264L, var1);
      SpinBot_47CR var10000 = this;
      if (var5 != null) {
         if (!recovery$indy$52(this.field_47, 1000L, var3, 7924100563728706698L, var1)) {
            return;
         }

         this.field_42.field_44 = this.field_42.field_44 + (float)recovery$indy$53(this.settingYawSpeed, 7924967241142580401L, var1);
         var10000 = this;
      }

      var10000.field_42.field_41 = (float)recovery$indy$54(this.settingPitchValue, 7924967241142580401L, var1);
   }

   @Override
   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var4 = var2 ^ 111440514984586L;
      String[] var6 = recovery$indy$55(6401490879527510875L, var2);
      boolean var10000 = this.field_43a;
      if (var6 != null) {
         if (!this.field_43a) {
            return;
         }

         var10000 = recovery$indy$56(this, var4, 6397745823820983940L, var2);
      }

      if (var10000) {
         recovery$indy$57(var1, C_47tU.DEFAULT, 6399375428301883244L, var2);
      }
   }

   private void method_43$e45a9973e5(long var1) {
      SpinBot_47CR var7;
      label52: {
         var1 = a ^ var1;
         long var3 = var1 ^ 85515987627579L;
         String[] var5 = recovery$indy$58(-6638591757342271405L, var1);
         this.field_43a = false;
         boolean var10000 = recovery$indy$59(this, var3, -6645952282588035789L, var1);
         if (var5 != null) {
            label46: {
               if (var10000) {
                  this.field_43a = true;
                  if (var1 <= 0L) {
                     break label46;
                  }

                  if (var5 != null) {
                     return;
                  }
               }

               recovery$indy$60(this.field_47, -6638823926010056530L, var1);
            }

            var7 = this;
            if (var5 == null) {
               break label52;
            }

            var10000 = this.field_43a;
         }

         if (var10000) {
            var7 = this;
            if (var5 == null) {
               break label52;
            }

            if (recovery$indy$61(this.settingServerside, -6645315741113648405L, var1)) {
               this.field_42 = new C_477r(recovery$indy$62(ClientGlobals.field_46, -6647197459044672525L, var1));
            }
         }

         var7 = this;
      }

      var7.field_43a = false;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$63(this, 28, var3, -7101995078171109831L, var1);
      recovery$indy$64(this, 7, var3, -7101995078171109831L, var1);
      recovery$indy$65(this, 40, var3, -7101995078171109831L, var1);
      recovery$indy$66(this, 21, var3, -7101995078171109831L, var1);
      recovery$indy$67(this, 18, var3, -7101995078171109831L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      if (recovery$indy$68(field_43, 2730254859659883349L, var4) != null) {
         this.field_42 = new C_477r(
            recovery$indy$69(field_43, 2730254859659883349L, var4).field_48h, recovery$indy$70(field_43, 2730254859659883349L, var4).field_48z
         );
         this.field_48 = new C_477r(
            recovery$indy$71(field_43, 2730254859659883349L, var4).field_48p, recovery$indy$72(field_43, 2730254859659883349L, var4).field_44
         );
      }
   }

   @Override
   public void method_487$da8c82d5d4() {
      long var1 = a ^ 137112333836696L;
      long var3 = var1 ^ 138505646654038L;
      long var10001 = var1 ^ 26672217265417L;
      int var5 = (int)((var1 ^ 26672217265417L) >>> 32);
      int var6 = (int)((var1 ^ 26672217265417L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 80120193387629L;
      long var10000 = -4304044320857030711L;
      String[] var10 = MLG_47CP.method_46$44c5829186();
      long var10002 = -4297137618793795841L;
      long var11 = var3;
      SpinBot_47CR var13 = this;
      var13.method_43$e45a9973e5(var11);
      SpinBot_47CR var21 = this;
      if (var10 != null) {
         if (!this.field_43a) {
            return;
         }

         var10002 = -4298304203406038289L;
         long var14 = var8;
         SpinBot_47CR var16 = this;
         var16.method_47$e45a9973e5(var14);
         var21 = this;
      }

      short var23 = (short)var6;
      char var10003 = (char)var7;
      long var10004 = -4296710424482591454L;
      char var17 = var10003;
      short var18 = var23;
      int var19 = var5;
      SpinBot_47CR var20 = var21;
      var20.method_42$537c8d9634(var19, var18, var17);
   }

   public SpinBot_47CR(long var1) {
      super("SpinBot", "Drehen", ((a ^ var1) ^ 54696648585467L), new Color(50, 168, 82), Category.FUN);
      var1 = a ^ var1;
      long var10001 = var1 ^ 96704985730147L;
      int var3 = (int)((var1 ^ 96704985730147L) >>> 32);
      int var4 = (int)((var1 ^ 96704985730147L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 287075777805L;
      long var8 = var1 ^ 80582464960989L;
      long var10 = var1 ^ 132999721572614L;
      long var12 = var1 ^ 71036845026528L;
      long var14 = var1 ^ 54696648585467L;
      // Super arguments moved to the required Java constructor position.
      RangeSetting var29 = new RangeSetting(var3, this, "YawSpeed", 90.0, 90.0, (short)var4, 0.0, 180.0, 1, (short)var5);
      long var10003 = 4130141631930297465L;
      long var16 = var10;
      RangeSetting var18 = var29;
      this.settingYawSpeed = var18.method_41$1efb8cc0e2(var16);
      RangeSetting var30 = new RangeSetting(var3, this, "PitchValue", 90.0, 90.0, (short)var4, -90.0, 90.0, 1, (short)var5);
      var10003 = 4130141631930297465L;
      long var19 = var10;
      RangeSetting var21 = var30;
      this.settingPitchValue = var21.method_41$1efb8cc0e2(var19);
      this.settingServerside = new BooleanSetting(this, var12, "Serverside", true);
      BooleanSetting var31 = new BooleanSetting(this, var12, "MoveFix", false);
      BooleanSetting var10002 = this.settingServerside;
      this.settingServerside.getClass();
      C_45n var36 = recovery$indy$73(var10002);
      long var10004 = 4129477517542598707L;
      C_45n var22 = var36;
      long var23 = var8;
      BooleanSetting var25 = var31;
      this.settingMoveFix = (BooleanSetting)var25.method_43$780fd62a21(var23, var22);
      long var10005 = 4128526030005203759L;
      MultiSelectSetting var32 = new MultiSelectSetting(this, "StopSpinningOn", var6, C_47Fp.values());
      var10002 = this.settingServerside;
      this.settingServerside.getClass();
      C_45n var34 = recovery$indy$74(var10002);
      var10003 = 4129185986511738756L;
      C_45n var26 = var34;
      MultiSelectSetting var27 = var32;
      this.settingStopSpinningOn = var27.method_40$1f2e7f1148(var26);
      this.field_49 = new C_47cu();
      this.field_47 = new C_47cu();
      this.field_42 = new C_477r();
      this.field_48 = new C_477r();
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Method c(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field c(Class var0, String var1, Class var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(Object var0, long var1, long var3);

   private static native void recovery$indy$2(Object var0, float var1, long var2, long var4);

   private static native void recovery$indy$3(Object var0, float var1, long var2, long var4);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);

   private static native String[] recovery$indy$7(long var0, long var2);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3, long var5, long var7);

   private static native C_477r recovery$indy$9(long var0, Object var2, Object var3, long var4, long var6);

   private static native boolean recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$11(Object var0, Object var1, int var2, char var3, int var4, int var5, Object var6, long var7, long var9);

   private static native String[] recovery$indy$12(long var0, long var2);

   private static native boolean recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native Client recovery$indy$14(long var0, long var2);

   private static native C_47y6 recovery$indy$15(Object var0, long var1, long var3);

   private static native void recovery$indy$16(Object var0, float var1, long var2, long var4);

   private static native MethodHandle recovery$constant$17();

   private static native String[] recovery$indy$18(long var0, long var2);

   private static native boolean recovery$indy$19(Object var0, long var1, long var3, long var5);

   private static native Client recovery$indy$20(long var0, long var2);

   private static native C_47y6 recovery$indy$21(Object var0, long var1, long var3);

   private static native void recovery$indy$22(Object var0, float var1, long var2, long var4);

   private static native String[] recovery$indy$23(long var0, long var2);

   private static native boolean recovery$indy$24(Object var0, long var1, long var3);

   private static native void recovery$indy$25(Object var0, Object var1, long var2, long var4, long var6);

   private static native String[] recovery$indy$26(long var0, long var2);

   private static native boolean recovery$indy$27(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);

   private static native Client recovery$indy$29(long var0, long var2);

   private static native C_47y6 recovery$indy$30(Object var0, long var1, long var3);

   private static native Client recovery$indy$31(long var0, long var2);

   private static native C_47y6 recovery$indy$32(Object var0, long var1, long var3);

   private static native boolean recovery$indy$33(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$34(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$35(Object var0, long var1, long var3);

   private static native boolean recovery$indy$36(int var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$37(int var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$38(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$39(Object var0, long var1, long var3);

   private static native boolean recovery$indy$40(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$41(Object var0, long var1, long var3);

   private static native boolean recovery$indy$42(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$43(Object var0, long var1, long var3);

   private static native boolean recovery$indy$44(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$45(Object var0, long var1, long var3);

   private static native boolean recovery$indy$46(long var0, long var2, long var4);

   private static native boolean recovery$indy$47(Object var0, long var1, long var3, long var5);

   private static native String[] recovery$indy$48(long var0, long var2);

   private static native boolean recovery$indy$49(Object var0, long var1, long var3);

   private static native boolean recovery$indy$50(Object var0, long var1, long var3);

   private static native String[] recovery$indy$51(long var0, long var2);

   private static native boolean recovery$indy$52(Object var0, long var1, long var3, long var5, long var7);

   private static native double recovery$indy$53(Object var0, long var1, long var3);

   private static native double recovery$indy$54(Object var0, long var1, long var3);

   private static native String[] recovery$indy$55(long var0, long var2);

   private static native boolean recovery$indy$56(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$57(Object var0, Object var1, long var2, long var4);

   private static native String[] recovery$indy$58(long var0, long var2);

   private static native boolean recovery$indy$59(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$60(Object var0, long var1, long var3);

   private static native boolean recovery$indy$61(Object var0, long var1, long var3);

   private static native C_477r recovery$indy$62(Object var0, long var1, long var3);

   private static native void recovery$indy$63(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$64(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$65(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$66(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$67(Object var0, int var1, long var2, long var4, long var6);

   private static native EntityPlayerSP recovery$indy$68(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$69(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$70(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$71(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$72(Object var0, long var1, long var3);

   private static native C_45n recovery$indy$73(BooleanSetting var0);

   private static native C_45n recovery$indy$74(BooleanSetting var0);
}
