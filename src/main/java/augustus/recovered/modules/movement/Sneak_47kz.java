package augustus.recovered.modules.movement;
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
import net.C_40y;
import net.C_41Q;
import net.C_45W;
import net.C_45n;
import net.C_472n;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47FN;
import net.C_47K7;
import net.C_47Ld;
import client.gui.ClickGuiScreen;
import net.minecraft.client.gui.GuiScreen;
import net.C_47MS;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47hi;
import client.ClientGlobals;
import client.module.Category;
import net.C_47tj;
import net.C_47vk;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Sneak_47kz extends client.module.Module implements net.C_47MS,net.C_47hi,net.C_41Q,net.C_47FN,net.C_47xz {
    public final client.setting.ModeSetting settingSneakTiming = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingSneakForward = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingSneakStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingRemoveSneakStop = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSneakInInv = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSpoofEyeHeight = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native void b();

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method h(long a0,long a1);

   public void method_46$486e3ab5ea(C_47tj var1, long var2) {
      long var4 = (var2 ^ 44712324519395L) >>> 16;
      int var6 = (int)((var2 ^ 44712324519395L) << 48 >>> 48);
      boolean var7 = recovery$indy$1(-2728700418773082093L, var2);
      boolean var10000 = recovery$indy$2(this.settingRemoveSneakStop, -2728794119932524894L, var2);
      if (!var7) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$3(this, var4, this.field_43a, (char)var6, -2728909980197530272L, var2);
      }

      if (var10000) {
         recovery$indy$4(var1, true, -2725310124216275721L, var2);
      }
   }



    private static native int e(long a0,long a1);

   public void method_42$81a716381c(C_47vk var1, long var2) {
      long var10001 = var2 ^ 29159167936933L;
      int var4 = (int)((var2 ^ 29159167936933L) >>> 48);
      int var5 = (int)((var2 ^ 29159167936933L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      if (recovery$indy$5(this.settingSpoofEyeHeight, -3665583850254020190L, var2)) {
         recovery$indy$7(var1, recovery$indy$6(this, (short)var4, (char)var5, var6, -3661502891032990942L, var2), -3661939195908625893L, var2);
      }
   }



    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   private boolean method_44$860b9c5006(long var1, boolean var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 100000339797936L;
      long var6 = var1 ^ 84960936054588L;
      long var8 = var1 ^ 72113501450500L;
      boolean var10 = recovery$indy$9(-2142897624942765968L, var1);
      boolean var10000 = recovery$indy$10(this.settingSneakTiming, var4, -2139275040489083545L, var1).equals(recovery$indy$11(29654, 8729714055651736643L ^ var1));
      if (!var10) {
         label52:
         if (!var10000) {
            boolean var10001;
            label70: {
               var10000 = recovery$indy$12(this.settingSneakTiming, var4, -2139275040489083545L, var1).equals(recovery$indy$13(29146, 4879655701992881749L ^ var1));
               label69:
               if (!var10) {
                  if (var10000) {
                     var10000 = recovery$indy$14(var8, -2139772168234934916L, var1);
                     var10001 = var10;
                     if (var1 <= 0L) {
                        break label70;
                     }

                     if (var10) {
                        break label69;
                     }

                     if (!var10000) {
                        var10000 = recovery$indy$15(var6, -2140288021440492757L, var1);
                        if (var10) {
                           return var10000;
                        }

                        if (!var10000) {
                           break label52;
                        }
                     }
                  }

                  var10000 = recovery$indy$16(this.settingSneakTiming, var4, -2139275040489083545L, var1).equals(recovery$indy$17(2426, 473967704137418465L ^ var1));
               }

               var10001 = var10;
            }

            if (var1 >= 0L) {
               if (!var10001) {
                  if (!var10000) {
                     return false;
                  }

                  var10000 = var3;
               }

               var10001 = var10;
            }

            if (var10001) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }



   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      net.minecraft.client.entity.EntityPlayerSP var14;
      long var5;
      long var10;
      boolean var12;
      boolean var10000;
      boolean var10001;
      label127: {
         var5 = (long)var1 << 32 | var3 << 32 >>> 32;
         long var7 = (var5 ^ 83219891146333L) >>> 16;
         int var9 = (int)((var5 ^ 83219891146333L) << 48 >>> 48);
         var10 = var5 ^ 115942598083693L;
         var12 = recovery$indy$18(4728223007979803676L, var5);
         boolean var13 = recovery$indy$19(this, var7, this.field_43a, (char)var9, 4728381373272444638L, var5);
         var10000 = var13;
         label126:
         if (var12) {
            if (!var13) {
               var10000 = recovery$indy$20(field_43, 4724431958502215469L, var5).method_47V$aae029aa0a();
               if (!var12) {
                  break label126;
               }

               if (var10000) {
                  var10000 = this.field_43a;
                  if (!var12) {
                     break label126;
                  }

                  label120:
                  if (!this.field_43a) {
                     label130: {
                        var10000 = recovery$indy$21(this.settingMode, var10, 4725110738273521338L, var5)
                           .equals(recovery$indy$22(4195, 4129188632277318711L ^ var5));
                        var10001 = var12;
                        if (var1 > 0) {
                           if (var12) {
                              if (var10000) {
                                 break label130;
                              }

                              var10000 = recovery$indy$23(this.settingMode, var10, 4725110738273521338L, var5)
                                 .equals(recovery$indy$24(14797, 2842434031614416264L ^ var5));
                           }

                           var10001 = var12;
                        }

                        if (var1 < 0) {
                           break label127;
                        }

                        if (!var10001) {
                           break label126;
                        }

                        if (!var10000) {
                           break label120;
                        }
                     }

                     recovery$indy$25(field_43, 4724431958502215469L, var5)
                        .field_49m
                        .method_45$631790539f(new C_45W(recovery$indy$26(field_43, 4724431958502215469L, var5), C_40y.STOP_SNEAKING));
                  }
               }
            }

            var10000 = var13;
         }

         var10001 = var12;
      }

      if (var1 > 0) {
         if (var10001) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$27(this.settingMode, var10, 4725110738273521338L, var5).equals(recovery$indy$28(4195, 4129188632277318711L ^ var5));
         }

         var10001 = var12;
      }

      label99: {
         label98:
         if (var10001) {
            if (var10000) {
               var10000 = recovery$indy$29(field_43, 4724431958502215469L, var5).method_47V$aae029aa0a();
               var10001 = var12;
               if (var1 <= 0) {
                  break label99;
               }

               if (!var12) {
                  break label98;
               }

               if (var10000) {
                  recovery$indy$30(field_43, 4724431958502215469L, var5)
                     .field_49m
                     .method_45$631790539f(new C_45W(recovery$indy$31(field_43, 4724431958502215469L, var5), C_40y.STOP_SNEAKING));
               }
            }

            var10000 = recovery$indy$32(this.settingMode, var10, 4725110738273521338L, var5).equals(recovery$indy$33(14797, 2842434031614416264L ^ var5));
         }

         var10001 = var12;
      }

      label132: {
         if (var10001) {
            if (!var10000) {
               return;
            }

            var14 = recovery$indy$34(field_43, 4724431958502215469L, var5);
            if (!var12) {
               break label132;
            }

            var10000 = var14.method_47V$aae029aa0a();
         }

         if (!var10000) {
            return;
         }

         recovery$indy$35(field_43, 4724431958502215469L, var5)
            .field_49m
            .method_45$631790539f(new C_45W(recovery$indy$36(field_43, 4724431958502215469L, var5), C_40y.START_SNEAKING));
         var14 = recovery$indy$37(field_43, 4724431958502215469L, var5);
      }

      var14.field_49m.method_45$631790539f(new C_45W(recovery$indy$38(field_43, 4724431958502215469L, var5), C_40y.STOP_SNEAKING));
   }





   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 16506922460172L;
      long var3 = var1 ^ 23282983861647L;
      long var10002 = -5156468257912670376L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Basic");
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 68381933621911L;
      long var3 = var1 ^ 39714557545236L;
      long var10002 = -8148214304971521597L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Basic");
   }



   private float method_47$277cc0d6d9(short var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      float var6 = 1.62F;
      if (recovery$indy$39(field_43, 6412175935376791105L, var4).method_49q$aae029aa0a()) {
         var6 = 0.2F;
      }

      return var6;
   }



   public void method_47$05bd94f678(net.C_472n var1, long var2) {
      long var4 = (var2 ^ 113024845797122L) >>> 16;
      int var6 = (int)((var2 ^ 113024845797122L) << 48 >>> 48);
      long var7 = var2 ^ 39263005660825L;
      long var9 = var2 ^ 132406506099900L;
      long var11 = var2 ^ 74807535967538L;
      boolean var13 = recovery$indy$flow$105(6395387503773393650L, var2);
      this.field_43a = recovery$indy$flow$106(var1, 6398576503958805151L, var2);
      boolean var10000 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$109(field_43, 6399510266006148722L, var2)).method_49W$aae029aa0a();
      if (!var13) {
         if (!var10000) {
            Sneak_47kz var21 = this;
            if (var2 > 0L) {
               if (!var13) {
                  if (!recovery$indy$flow$112(this, var4, this.field_43a, (char)var6, 6395596033736202113L, var2)) {
                     return;
                  }

                  var21 = this;
               }

               String var17 = (String)recovery$indy$flow$114(var21.settingMode, var11, 6399010704286373861L, var2);
               byte var20 = -1;
               switch (var17.hashCode()) {
                  case 63955982:
                     if (var17.equals((String)recovery$indy$flow$116(6315, 6069055656033152437L ^ var2))) {
                        var20 = 0;
                        long var25;
                        int var23 = (var25 = var2 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
                        if (var13 && var17.equals((String)recovery$indy$flow$118(7140, 293681701680901887L ^ var2))) {
                           var20 = 1;
                        }
                     }
                     break;
                  case 73298841:
                     if (var17.equals((String)recovery$indy$flow$118(7140, 293681701680901887L ^ var2))) {
                        var20 = 1;
                     }
               }

               switch (var20) {
                  case 0:
                     recovery$indy$flow$122(
                        var1, recovery$indy$flow$121(this.settingSneakForward, var9, 6395275501022832147L, var2), 6395199831264377172L, var2
                     );
                     recovery$indy$flow$125(var1, recovery$indy$flow$124(this.settingSneakStrafe, var9, 6395275501022832147L, var2), 6399593283185404141L, var2);
                     recovery$indy$flow$126(var1, true, 6399306566208333371L, var2);
                     long var26;
                     int var24 = (var26 = var2 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
                     if (var13 && !recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                        recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                     }
                     break;
                  case 1:
                     if (!recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                        recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                     }
               }
            } else if (recovery$indy$flow$112(this, var4, var13, (char)var6, 6395596033736202113L, var2)) {
               String var16 = (String)recovery$indy$flow$114(this.settingMode, var11, 6399010704286373861L, var2);
               byte var18 = -1;
               switch (var16.hashCode()) {
                  case 63955982:
                     if (var16.equals((String)recovery$indy$flow$116(6315, 6069055656033152437L ^ var2))) {
                        var18 = 0;
                        if (var2 >= 0L) {
                           if (var13 && var16.equals((String)recovery$indy$flow$118(7140, 293681701680901887L ^ var2))) {
                              var18 = 1;
                           }

                           switch (var18) {
                              case 0:
                                 recovery$indy$flow$122(
                                    var1, recovery$indy$flow$121(this.settingSneakForward, var9, 6395275501022832147L, var2), 6395199831264377172L, var2
                                 );
                                 recovery$indy$flow$125(
                                    var1, recovery$indy$flow$124(this.settingSneakStrafe, var9, 6395275501022832147L, var2), 6399593283185404141L, var2
                                 );
                                 recovery$indy$flow$126(var1, true, 6399306566208333371L, var2);
                                 long var27;
                                 int var22 = (var27 = var2 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
                                 if (var13 && !recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                                    recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                                 }
                                 break;
                              case 1:
                                 if (!recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                                    recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                                 }
                           }

                           return;
                        }

                        if (var13) {
                           var18 = 1;
                        }

                        switch (var18) {
                           case 0:
                              recovery$indy$flow$122(
                                 var1, recovery$indy$flow$121(this.settingSneakForward, var9, 6395275501022832147L, var2), 6395199831264377172L, var2
                              );
                              recovery$indy$flow$125(
                                 var1, recovery$indy$flow$124(this.settingSneakStrafe, var9, 6395275501022832147L, var2), 6399593283185404141L, var2
                              );
                              recovery$indy$flow$126(var1, true, 6399306566208333371L, var2);
                              long var28;
                              int var10001 = (var28 = var2 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
                              if (!var13) {
                                 recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                              }
                              break;
                           case 1:
                              if (!recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                                 recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                              }
                        }

                        return;
                     } else {
                        switch (var18) {
                           case 0:
                              recovery$indy$flow$122(
                                 var1, recovery$indy$flow$121(this.settingSneakForward, var9, 6395275501022832147L, var2), 6395199831264377172L, var2
                              );
                              recovery$indy$flow$125(
                                 var1, recovery$indy$flow$124(this.settingSneakStrafe, var9, 6395275501022832147L, var2), 6399593283185404141L, var2
                              );
                              recovery$indy$flow$126(var1, true, 6399306566208333371L, var2);
                              if (var2 >= 0L) {
                                 if (var13 && !recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                                    recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                                 }

                                 return;
                              }

                              if (!var13) {
                                 recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                              }

                              return;
                           case 1:
                              if (!recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                                 recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                              }

                              return;
                           default:
                              return;
                        }
                     }
                  case 73298841:
                     if (var16.equals((String)recovery$indy$flow$118(7140, 293681701680901887L ^ var2))) {
                        var18 = 1;
                     }

                     switch (var18) {
                        case 0:
                           recovery$indy$flow$122(
                              var1, recovery$indy$flow$121(this.settingSneakForward, var9, 6395275501022832147L, var2), 6395199831264377172L, var2
                           );
                           recovery$indy$flow$125(
                              var1, recovery$indy$flow$124(this.settingSneakStrafe, var9, 6395275501022832147L, var2), 6399593283185404141L, var2
                           );
                           recovery$indy$flow$126(var1, true, 6399306566208333371L, var2);
                           if (var2 >= 0L) {
                              if (var13 && !recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                                 recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                              }

                              return;
                           }

                           if (!var13) {
                              recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                           }

                           return;
                        case 1:
                           if (!recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                              recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                           }

                           return;
                        default:
                           return;
                     }
                  default:
                     switch (var18) {
                        case 0:
                           recovery$indy$flow$122(
                              var1, recovery$indy$flow$121(this.settingSneakForward, var9, 6395275501022832147L, var2), 6395199831264377172L, var2
                           );
                           recovery$indy$flow$125(
                              var1, recovery$indy$flow$124(this.settingSneakStrafe, var9, 6395275501022832147L, var2), 6399593283185404141L, var2
                           );
                           recovery$indy$flow$126(var1, true, 6399306566208333371L, var2);
                           if (var2 >= 0L) {
                              if (var13 && !recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                                 recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                              }

                              return;
                           }

                           if (!var13) {
                              recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                           }

                           return;
                        case 1:
                           if (!recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                              recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                           }

                           return;
                     }
               }
            }
         }
      } else if (var10000) {
         String var14 = (String)recovery$indy$flow$114(this.settingMode, var11, 6399010704286373861L, var2);
         byte var15 = -1;
         switch (var14.hashCode()) {
            case 0:
               recovery$indy$flow$122(var1, recovery$indy$flow$121(this.settingSneakForward, var9, 6395275501022832147L, var2), 6395199831264377172L, var2);
               recovery$indy$flow$125(var1, recovery$indy$flow$124(this.settingSneakStrafe, var9, 6395275501022832147L, var2), 6399593283185404141L, var2);
               recovery$indy$flow$126(var1, true, 6399306566208333371L, var2);
               if (var2 >= 0L) {
                  if (var13 && !recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                     recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
                  }

                  return;
               }

               if (!var13) {
                  recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
               }

               return;
            case 1:
               if (!recovery$indy$flow$129(client.ClientGlobals.field_48.field_41p, var7, 6398815228993071943L, var2)) {
                  recovery$indy$flow$130(var1, true, 6399306566208333371L, var2);
               }

               return;
         }
      }
   }




   private boolean method_43$295da04a13(long var1, boolean var3, char var4) {
      long var5 = (var1 << 16 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 132156108598656L;
      boolean var9 = recovery$indy$54(-3191482738461103737L, var5);
      boolean var10000 = recovery$indy$55(this, var7, var3, -3191871386121820567L, var5);
      if (!var9) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$56(field_43, -3190184030354880575L, var5);
      }

      if (var9) {
         return var10000;
      }

      if (var10000) {
         return true;
      }

      var10000 = recovery$indy$57(field_43, -3189919592131289331L, var5) instanceof C_47Ld;
      if (var9) {
         return var10000;
      }

      if (var10000) {
         return true;
      }

      var10000 = recovery$indy$58(field_43, -3189919592131289331L, var5) instanceof ClickGuiScreen;
      if (var9) {
         return var10000;
      }

      if (var10000) {
         return true;
      }

      var10000 = recovery$indy$59(this.settingSneakInInv, -3191567785250435274L, var5);
      return var9 ? var10000 : var10000;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$60(this, 24, var3, -7099134447740905457L, var1);
      recovery$indy$61(this, 21, var3, -7099134447740905457L, var1);
      recovery$indy$62(this, 18, var3, -7099134447740905457L, var1);
      recovery$indy$63(this, 33, var3, -7099134447740905457L, var1);
      recovery$indy$64(this, 40, var3, -7099134447740905457L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 72498010691029L;
      long var8 = var4 ^ 99593642957744L;
      recovery$indy$66(this, var6, recovery$indy$65(this.settingMode, var8, 2184180707734524263L, var4), 2183944111361028949L, var4);
   }



   public void method_44g$e45a9973e5(long var1) {
      net.minecraft.client.entity.EntityPlayerSP var9;
      long var3 = (var1 ^ 7494877644381L) >>> 16;
      int var5 = (int)((var1 ^ 7494877644381L) << 48 >>> 48);
      long var6 = var1 ^ 39667526683757L;
      boolean var8 = recovery$indy$67(-8530300760401978340L, var1);
      boolean var10000 = recovery$indy$68(this, var3, this.field_43a, (char)var5, -8530142394942519586L, var1);
      if (var8) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$69(this.settingMode, var6, -8533553492585576774L, var1).equals(recovery$indy$70(4195, 4129130491900179511L ^ var1));
      }

      boolean var10001;
      label62: {
         label61:
         if (var8) {
            if (var10000) {
               var10000 = recovery$indy$71(field_43, -8534109410756212947L, var1).method_47V$aae029aa0a();
               var10001 = var8;
               if (var1 <= 0L) {
                  break label62;
               }

               if (!var8) {
                  break label61;
               }

               if (!var10000) {
                  recovery$indy$72(field_43, -8534109410756212947L, var1)
                     .field_49m
                     .method_45$631790539f(new C_45W(recovery$indy$73(field_43, -8534109410756212947L, var1), C_40y.START_SNEAKING));
               }
            }

            var10000 = recovery$indy$74(this.settingMode, var6, -8533553492585576774L, var1).equals(recovery$indy$75(14797, 2842360497789083016L ^ var1));
         }

         var10001 = var8;
      }

      label67: {
         if (var10001) {
            if (!var10000) {
               return;
            }

            var9 = recovery$indy$76(field_43, -8534109410756212947L, var1);
            if (!var8) {
               break label67;
            }

            var10000 = var9.method_47V$aae029aa0a();
         }

         if (var10000) {
            return;
         }

         recovery$indy$77(field_43, -8534109410756212947L, var1)
            .field_49m
            .method_45$631790539f(new C_45W(recovery$indy$78(field_43, -8534109410756212947L, var1), C_40y.STOP_SNEAKING));
         var9 = recovery$indy$79(field_43, -8534109410756212947L, var1);
      }

      var9.field_49m.method_45$631790539f(new C_45W(recovery$indy$80(field_43, -8534109410756212947L, var1), C_40y.START_SNEAKING));
   }




   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 21639693029742L;
      boolean var5 = recovery$indy$81(-7738120205166022994L, var1);
      if (!this.field_43a) {
         EntityPlayerSP var10000 = recovery$indy$82(field_43, -7740571715093145042L, var1);
         if (!var5) {
            if (var10000 == null) {
               return;
            }

            var10000 = recovery$indy$83(field_43, -7740571715093145042L, var1);
         }

         boolean var6 = var10000.method_47V$aae029aa0a();
         boolean var10001 = var5;
         if (var1 >= 0L) {
            if (!var5) {
               if (!var6) {
                  return;
               }

               var6 = recovery$indy$84(this.settingMode, var3, -7741250213544354887L, var1).equals(recovery$indy$85(4195, 4129143297095543092L ^ var1));
            }

            var10001 = var5;
         }

         label35: {
            if (!var10001) {
               if (var6) {
                  break label35;
               }

               var6 = recovery$indy$86(this.settingMode, var3, -7741250213544354887L, var1).equals(recovery$indy$87(14797, 2842369969506943115L ^ var1));
            }

            if (!var6) {
               return;
            }
         }

         recovery$indy$88(field_43, -7740571715093145042L, var1)
            .field_49m
            .method_45$631790539f(new C_45W(recovery$indy$89(field_43, -7740571715093145042L, var1), C_40y.STOP_SNEAKING));
      }
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public Sneak_47kz(int a0,int a1,byte a2) {
        super((java.lang.String) ("Sneak"),(java.lang.String) ("Schleichen"),(long) (((((((long) (a0) << 32) | (((long) (a1) << 40) >>> 32)) | (((long) (a2) << 56) >>> 56)) ^ augustus.recovered.modules.movement.Sneak_47kz.a) ^ 101688614815019L)),(java.awt.Color) (new java.awt.Color((int) (245),(int) (114),(int) (66))),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = (((((long) (a0) << 32) | (((long) (a1) << 40) >>> 32)) | (((long) (a2) << 56) >>> 56)) ^ augustus.recovered.modules.movement.Sneak_47kz.a);
        long constructorKey2 = ((((((long) (a0) << 32) | (((long) (a1) << 40) >>> 32)) | (((long) (a2) << 56) >>> 56)) ^ augustus.recovered.modules.movement.Sneak_47kz.a) ^ 26148443223526L);
        long constructorKey3 = ((((((long) (a0) << 32) | (((long) (a1) << 40) >>> 32)) | (((long) (a2) << 56) >>> 56)) ^ augustus.recovered.modules.movement.Sneak_47kz.a) ^ 49859107576112L);
        long constructorKey4 = ((((((long) (a0) << 32) | (((long) (a1) << 40) >>> 32)) | (((long) (a2) << 56) >>> 56)) ^ augustus.recovered.modules.movement.Sneak_47kz.a) ^ 2302240439L);
        java.lang.Object initialValue5 = recovery$indy$flow$221(3);
        ((java.lang.Object[]) initialValue5)[0] = "OnlyWhileSneakKeyPressed";
        ((java.lang.Object[]) initialValue5)[1] = "OnlyWhileStandingStill";
        ((java.lang.Object[]) initialValue5)[2] = "Always";
        client.setting.ModeSetting initialized6 = new client.setting.ModeSetting(this, "SneakTiming", constructorKey2, "OnlyWhileSneakKeyPressed", (java.lang.String[]) (initialValue5));
        recovery$indy$flow$223(this, initialized6);
        java.lang.Object initialValue7 = recovery$indy$flow$225(4);
        ((java.lang.Object[]) initialValue7)[0] = "Legit";
        ((java.lang.Object[]) initialValue7)[1] = "Basic";
        ((java.lang.Object[]) initialValue7)[2] = "PrePostSpam";
        ((java.lang.Object[]) initialValue7)[3] = "PrePostSpamOld";
        client.setting.ModeSetting initialized8 = new client.setting.ModeSetting(this, "Mode", constructorKey2, "Legit", (java.lang.String[]) (initialValue7));
        recovery$indy$flow$227(this, initialized8);
        client.setting.NumberSetting initialized9 = new client.setting.NumberSetting(this, "SneakForward", 1.0D, constructorKey4, Double.longBitsToDouble(4599075939470750515L), 1.0D, 2);
        java.lang.Object initialValue10 = recovery$indy$flow$230(this);
        java.lang.Object initialValue11 = initialValue10;
        client.setting.NumberSetting initialValue12 = initialized9;
        java.lang.Object initialValue13 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue12))))));
        java.lang.Object initialValue14 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue11))))));
        java.lang.Object initialValue15 = recovery$indy$flow$233(initialValue13, initialValue14);
        recovery$indy$flow$234(this, initialValue15);
        client.setting.NumberSetting initialized16 = new client.setting.NumberSetting(this, "SneakStrafe", 1.0D, constructorKey4, Double.longBitsToDouble(4599075939470750515L), 1.0D, 2);
        java.lang.Object initialValue17 = recovery$indy$flow$237(this);
        java.lang.Object initialValue18 = initialValue17;
        client.setting.NumberSetting initialValue19 = initialized16;
        java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue21 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue22 = recovery$indy$flow$240(initialValue20, initialValue21);
        recovery$indy$flow$241(this, initialValue22);
        client.setting.BooleanSetting initialized23 = new client.setting.BooleanSetting(this, constructorKey3, "RemoveSneakStop", true);
        recovery$indy$flow$244(this, initialized23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey3, "SneakInInv", true);
        recovery$indy$flow$247(this, initialized24);
        client.setting.BooleanSetting initialized25 = new client.setting.BooleanSetting(this, constructorKey3, "SpoofEyeHeight", true);
        recovery$indy$flow$250(this, initialized25);
        recovery$indy$flow$251(this, false);
    }




    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);
    private static native boolean recovery$indy$flow$105(long a0,long a1);
    private static native boolean recovery$indy$flow$106(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$109(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$112(java.lang.Object a0,long a1,boolean a2,char a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$114(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$116(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$118(int a0,long a1);
    private static native double recovery$indy$flow$121(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$122(java.lang.Object a0,double a1,long a2,long a3);
    private static native double recovery$indy$flow$124(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$125(java.lang.Object a0,double a1,long a2,long a3);
    private static native void recovery$indy$flow$126(java.lang.Object a0,boolean a1,long a2,long a3);
    private static native boolean recovery$indy$flow$129(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$130(java.lang.Object a0,boolean a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$221(int a0);
    private static native void recovery$indy$flow$223(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$225(int a0);
    private static native void recovery$indy$flow$227(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$230(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$233(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$234(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$237(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$240(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$241(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$244(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$247(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$250(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$251(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.Sneak_47kz) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3);
   private static native boolean recovery$indy$3(Object var0, long var1, boolean var3, char var4, long var5, long var7);
   private static native void recovery$indy$4(Object var0, boolean var1, long var2, long var4);
   private static native boolean recovery$indy$5(Object var0, long var1, long var3);
   private static native float recovery$indy$6(Object var0, short var1, char var2, int var3, long var4, long var6);
   private static native void recovery$indy$7(Object var0, float var1, long var2, long var4);
   private static native MethodHandle recovery$constant$8();
   private static native boolean recovery$indy$9(long var0, long var2);
   private static native String recovery$indy$10(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$11(int var0, long var1);
   private static native String recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$13(int var0, long var1);
   private static native boolean recovery$indy$14(long var0, long var2, long var4);
   private static native boolean recovery$indy$15(long var0, long var2, long var4);
   private static native String recovery$indy$16(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$17(int var0, long var1);
   private static native boolean recovery$indy$18(long var0, long var2);
   private static native boolean recovery$indy$19(Object var0, long var1, boolean var3, char var4, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);
   private static native String recovery$indy$21(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$22(int var0, long var1);
   private static native String recovery$indy$23(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$24(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$25(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native String recovery$indy$27(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$28(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$29(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$30(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);
   private static native String recovery$indy$32(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$33(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$34(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$35(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$37(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$38(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$39(Object var0, long var1, long var3);
   private static native boolean recovery$indy$54(long var0, long var2);
   private static native boolean recovery$indy$55(Object var0, long var1, boolean var3, long var4, long var6);
   private static native boolean recovery$indy$56(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$57(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$58(Object var0, long var1, long var3);
   private static native boolean recovery$indy$59(Object var0, long var1, long var3);
   private static native void recovery$indy$60(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$61(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$62(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$63(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$64(Object var0, int var1, long var2, long var4, long var6);
   private static native String recovery$indy$65(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$66(Object var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$67(long var0, long var2);
   private static native boolean recovery$indy$68(Object var0, long var1, boolean var3, char var4, long var5, long var7);
   private static native String recovery$indy$69(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$70(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$71(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$72(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$73(Object var0, long var1, long var3);
   private static native String recovery$indy$74(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$75(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$76(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$77(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$78(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$79(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$80(Object var0, long var1, long var3);
   private static native boolean recovery$indy$81(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$82(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$83(Object var0, long var1, long var3);
   private static native String recovery$indy$84(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$85(int var0, long var1);
   private static native String recovery$indy$86(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$87(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$88(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$89(Object var0, long var1, long var3);
}
