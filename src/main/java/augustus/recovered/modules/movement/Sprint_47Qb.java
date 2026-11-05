package augustus.recovered.modules.movement;

import augustus.recovered.modules.world.Scaffold_47Te;
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
import net.C_45n;
import net.C_472n;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47JT;
import client.module.Module;
import net.C_47S6;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47gg;
import net.C_47hi;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import client.module.Category;
import net.C_47tU;
import net.C_47tz;
import net.C_47uo;
import net.C_47xz;
import net.C_4f;

public class Sprint_47Qb extends Module implements C_47JT, C_47hi, C_47xz {
   public final ModeSetting settingMode;
   public final BooleanSetting settingIgnoreCollisions;
   public final BooleanSetting settingHungerSprint;
   public final BooleanSetting settingHungerSprintOnlyOnGround;
   public final BooleanSetting settingJumpSprint;
   private static final long a = C_4f.a(6818966705201953938L, 3674030256433963519L, MethodHandles.lookup().lookupClass()).a(100852907069177L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[58];
   private static final String[] f = new String[58];

   private static native String b(byte[] var0);

   private static native Field b(Class var0, String var1, Class var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Class b(long var0, long var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   @Override
   public void method_46$908df054f5(long var1, C_47tz var3) {
      boolean var6;
      byte var10000;
      boolean var10001;
      label59: {
         long var4 = var1 ^ 51845225735838L;
         var6 = recovery$indy$1(5471779342460018397L, var1);
         var10000 = (byte) ((recovery$indy$2(this.settingJumpSprint, 5467585936513388543L, var1)) ? 1 : 0);
         label58:
         if (var6) {
            if (var10000 != 0) {
               var10000 = (byte) ((recovery$indy$3(var4, 5470934161600575295L, var1)) ? 1 : 0);
               var10001 = var6;
               if (var1 <= 0L) {
                  break label59;
               }

               if (!var6) {
                  break label58;
               }

               if (var10000 != 0) {
                  recovery$indy$4(var3, true, 5469703030762145128L, var1);
               }
            }

            var10000 = (byte) ((recovery$indy$5(this.settingHungerSprint, 5467585936513388543L, var1)) ? 1 : 0);
         }

         var10001 = var6;
      }

      if (var1 > 0L) {
         if (var10001) {
            if (var10000 == 0) {
               return;
            }

            float var7;
            var10000 = (byte)((var7 = recovery$indy$6(field_43, 5470370125138240510L, var1).method_44$c1e132d4d1().method_44$8abf5c6871() - 6.0F) == 0.0F
               ? 0
               : (var7 < 0.0F ? -1 : 1));
         }

         var10001 = var6;
      }

      if (var10001) {
         if (var10000 > 0) {
            return;
         }

         var10000 = (byte) ((recovery$indy$7(this.settingHungerSprintOnlyOnGround, 5467585936513388543L, var1)) ? 1 : 0);
      }

      if (var10000 != 0) {
         recovery$indy$8(var3, false, 5471616966553141737L, var1);
      }
   }

   private static native int a(long var0, long var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   private boolean method_48$0dd78e0064(long var1) {
      client.module.ModuleManager var13;
      var1 = a ^ var1;
      long var3 = var1 ^ 83559703967536L;
      long var5 = var1 ^ 57162673049098L;
      long var7 = var1 ^ 48668948446363L;
      long var9 = var1 ^ 77332189397510L;
      boolean var11 = recovery$indy$9(-475483252915311532L, var1);
      int var10000 = (int) ((recovery$indy$10(field_43, -476053465063346913L, var1)) ? 1 : 0);
      if (var11) {
         if (var10000 == 0) {
            return false;
         }

         var10000 = (int) ((recovery$indy$11(this.settingMode, var7, -476561097903721996L, var1).equals(recovery$indy$12(13842, 622848066761443986L ^ var1))) ? 1 : 0);
      }

      boolean var10001 = var11;
      if (var1 > 0L) {
         if (var11) {
            if (var10000 == 0) {
               return false;
            }

            var10000 = (int) ((recovery$indy$13(ClientGlobals.field_48.field_46q, var3, -476617224948745213L, var1)) ? 1 : 0);
         }

         var10001 = var11;
      }

      if (var1 >= 0L) {
         if (var10001) {
            if (var10000 != 0) {
               return false;
            }

            var10000 = recovery$indy$14(var9, -477090929671919204L, var1);
         }

         var10001 = var11;
      }

      label107: {
         label106:
         if (var10001) {
            if (var10000 == 0) {
               var10000 = recovery$indy$15(var5, -476813147404900953L, var1);
               var10001 = var11;
               if (var1 < 0L) {
                  break label107;
               }

               if (!var11) {
                  break label106;
               }

               if (var10000 == 0) {
                  return false;
               }
            }

            var10000 = (int) ((recovery$indy$16(ClientGlobals.field_48.field_480, var3, -476617224948745213L, var1)) ? 1 : 0);
         }

         var10001 = var11;
      }

      if (var1 >= 0L) {
         if (var10001) {
            label92: {
               if (var10000 != 0) {
                  var13 = ClientGlobals.field_48;
                  if (!var11) {
                     break label92;
                  }

                  if (ClientGlobals.field_48.field_46e.field_43c != null) {
                     return false;
                  }
               }

               var13 = ClientGlobals.field_48;
            }

            var10000 = (int) ((recovery$indy$17(var13.field_462, var3, -476617224948745213L, var1)) ? 1 : 0);
         }

         var10001 = var11;
      }

      return !var10001 ? var10000 != 0 : var10000 == 0 || ClientGlobals.field_48.field_462.field_456 == null;
   }

   @Override
   public void method_45$ca1f9e88a9(C_47tz var1, long var2) {
      long var4 = var2 ^ 106952049089935L;
      if (recovery$indy$18(this.settingMode, var4, 1762780141583028448L, var2).equals(recovery$indy$19(17720, 12607962660133029L ^ var2))) {
         recovery$indy$20(var1, true, 1761961172534754191L, var2);
      }
   }

   public static void method_45$da8c82d5d4() {
   }

   @Override
   public void method_47$05bd94f678(C_472n var1, long var2) {
      C_472n var36;
      int var10;
      int var11;
      int var12;
      boolean var13;
      byte var35;
      boolean var38;
      label88: {
         long var4 = var2 ^ 39263005660825L;
         long var6 = var2 ^ 74807535967538L;
         long var8 = var2 ^ 48204270205120L;
         long var10001 = var2 ^ 31970059946167L;
         var10 = (int)((var2 ^ 31970059946167L) >>> 48);
         var11 = (int)((var2 ^ 31970059946167L) << 16 >>> 32);
         var12 = (int)(var10001 << 48 >>> 48);
         long var10000 = 6399343767773575972L;
         var13 = Fly_47kE.method_49t$aae029aa0a();
         long var37 = 6398159582057476318L;
         Minecraft var14 = field_43;
         var35 = (byte) ((var14.field_42P.method_488$aae029aa0a()) ? 1 : 0);
         label87:
         if (!var13) {
            if (var35 != 0) {
               long var10002 = 6398453309201538474L;
               long var15 = var4;
               Scaffold_47Te var17 = ClientGlobals.field_48.field_46q;
               var35 = (byte) ((var17.method_46$0dd78e0064(var15)) ? 1 : 0);
               if (var13) {
                  break label87;
               }

               if (var35 != 0) {
                  var10002 = 6398351174198890589L;
                  long var18 = var6;
                  ModeSetting var20 = ClientGlobals.field_48.field_46q.settingMode;
                  var35 = (byte) ((var20.method_46$5f9dc63072(var18).equals(recovery$indy$21(7243, 4050008765744333167L ^ var2))) ? 1 : 0);
                  var38 = var13;
                  if (var2 <= 0L) {
                     break label88;
                  }

                  if (var13) {
                     break label87;
                  }

                  if (var35 != 0) {
                     var10002 = 6395662234001094859L;
                     float var21 = 0.0F;
                     C_472n var22 = var1;
                     var22.method_45$24a796ab4c(var21);
                  }
               }
            }

            long var44 = 6398842591430598289L;
            long var23 = var8;
            Sprint_47Qb var25 = this;
            var35 = (byte) ((var25.method_48$0dd78e0064(var23)) ? 1 : 0);
         }

         var38 = var13;
      }

      if (var2 >= 0L) {
         if (!var38) {
            if (var35 == 0) {
               return;
            }

            char recovery$keyHigh = (char)var10;
            char var10004 = (char)var12;
            long var10005 = 6399528160706440119L;
            char var26 = var10004;
            Sprint_47Qb var27 = this;
            int var28 = var11;
            char var29 = recovery$keyHigh;
            C_47S6 var30 = ClientGlobals.field_46;
            var35 = (byte) ((var30.method_49$dc3f815dad(var29, var28, var27, var26)) ? 1 : 0);
         }

         var38 = var13;
      }

      label93: {
         if (!var38) {
            if (var35 == 0) {
               return;
            }

            var36 = var1;
            if (var13) {
               break label93;
            }

            long var40 = 6397950160467069737L;
            C_472n var31 = var1;
            float var46;
            var35 = (byte)((var46 = var31.method_45$bc607678b6() - 0.0F) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1));
         }

         if (var35 > 0) {
            var36 = var1;
            if (var13) {
               break label93;
            }

            long var41 = 6399075659635228434L;
            C_472n var32 = var1;
            if (var32.method_43$bc607678b6() == 0.0F) {
               return;
            }
         }

         var36 = var1;
      }

      long var45 = 6395503643696389792L;
      C_47tU var33 = C_47tU.DEFAULT;
      C_472n var34 = var36;
      var34.method_41$1aa94c3a4e(var33);
   }

   @Override
   public void method_43$ca1f9e88a9(C_47tz var1, long var2) {
      long var4 = var2 ^ 82388104913255L;
      long var6 = var2 ^ 9985179174339L;
      boolean var8 = recovery$indy$22(-1974257070980905103L, var2);
      recovery$indy$23(var1, true, -1974819178315544155L, var2);
      boolean var10000 = recovery$indy$24(this.settingMode, var4, -1972984997120463864L, var2).equals(recovery$indy$25(115, 7105359923108798720L ^ var2));
      if (!var8) {
         if (var10000) {
            recovery$indy$26(var1, var6, true, -1972755678444740525L, var2);
         }

         var10000 = recovery$indy$27(this.settingMode, var4, -1972984997120463864L, var2).equals(recovery$indy$28(18871, 3238985128741775561L ^ var2));
      }

      label39:
      if (!var8) {
         if (var10000) {
            var10000 = recovery$indy$29(this.settingIgnoreCollisions, -1975472685388996470L, var2);
            if (var8) {
               break label39;
            }

            if (var10000) {
               recovery$indy$30(var1, true, -1974500091461313577L, var2);
            }
         }

         var10000 = recovery$indy$31(this.settingHungerSprint, -1975472685388996470L, var2);
      }

      if (var10000) {
         recovery$indy$32(var1, true, -1975904301538216960L, var2);
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$33(this, 36, -4, var3, -7100330995463285554L, var1);
      recovery$indy$34(this, 21, 10, var3, -7100330995463285554L, var1);
      recovery$indy$35(this, 40, var5, -7100075673808974370L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   @Override
   public void method_487$da8c82d5d4() {
      int var36;
      long var1 = a ^ 87207141612861L;
      long var10001 = var1 ^ 114202032622090L;
      int var3 = (int)((var1 ^ 114202032622090L) >>> 48);
      int var4 = (int)((var1 ^ 114202032622090L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      long var6 = var1 ^ 81635458793337L;
      long var8 = var1 ^ 8523325862705L;
      long var10 = var1 ^ 63917104063680L;
      long var12 = var1 ^ 97684060648582L;
      long var14 = var1 ^ 131532442461266L;
      long var16 = var1 ^ 125791147982653L;
      long var10000 = -4297184771254753354L;
      boolean var18 = Fly_47kE.method_49t$aae029aa0a();
      long var10002 = -4296683528068218365L;
      long var23 = var14;
      Sprint_47Qb var25 = this;
      int var35 = (int) ((var25.method_48$0dd78e0064(var23)) ? 1 : 0);
      if (!var18) {
         if (var35 == 0) {
            return;
         }

         var10001 = -4298056448974973785L;
         var35 = C_47uo.method_45$95d88932bd(var16);
      }

      int var20;
      int var19 = var35;
      var10001 = -4298350722091788132L;
      var20 = C_47uo.method_49$95d88932bd(var8);
      var36 = var19;
      label30:
      if (!var18) {
         if (var19 > 0) {
            var36 = var20;
            if (var18) {
               break label30;
            }

            if (var20 == 0) {
               return;
            }
         }

         var36 = var19;
      }

      float var37 = var36;
      short var44 = (short)var3;
      short var10003 = (short)var4;
      float var10004 = var20;
      long var10006 = -4298535992544416692L;
      Minecraft var26 = field_43;
      double var21 = recovery$indy$36(var44, var10003, var37, var5, var10004, var26.field_42P.field_48h, -4297351285093560429L, var1);
      C_47S6 var38 = ClientGlobals.field_46;
      var10002 = -4296729881945440287L;
      C_47S6 var27 = ClientGlobals.field_46;
      float var41 = var27.method_44$4f8050086d().field_44;
      float var46 = (float)Math.toDegrees(var21);
      long var10005 = -4297515186786906551L;
      float var42 = C_47gg.method_47$72a48262dd(var41, var46, 180.0F, var10);
      long var47 = -4296729881945440287L;
      C_47S6 var28 = ClientGlobals.field_46;
      long var48 = -4299850321323420305L;
      float var43 = C_47gg.method_42$d819a8fdf1(var42, var28.method_44$4f8050086d().field_44, var12);
      var10005 = -4298316873796412558L;
      long var29 = var6;
      Sprint_47Qb var31 = this;
      byte var32 = 11;
      float var33 = var43;
      C_47S6 var34 = var38;
      var34.method_47$508900092b(var33, var32, var31, var29);
   }

   public Sprint_47Qb(long var1) {
      super("Sprint", "Sprinten", ((a ^ var1) ^ 137033318111180L), new Color(170, 181, 182, 255), Category.MOVEMENT);
      var1 = a ^ var1;
      long var3 = var1 ^ 4761260809962L;
      long var5 = var1 ^ 60566007146241L;
      long var7 = var1 ^ 14865109961687L;
      long var9 = var1 ^ 137033318111180L;
      // Pure super-constructor arguments are evaluated in the first statement above.
      this.settingMode = new ModeSetting(this, "Mode", var5, "Legit", new String[]{"Legit", "LegitRotationAllDirection", "AllDirection", "AllDirectionMotion"});
      this.settingIgnoreCollisions = new BooleanSetting(this, var7, "IgnoreCollisions", true);
      this.settingHungerSprint = new BooleanSetting(this, var7, "HungerSprint", true);
      BooleanSetting var10001 = new BooleanSetting(this, var7, "HungerSprintOnlyOnGround", true);
      BooleanSetting var10002 = this.settingHungerSprint;
      this.settingHungerSprint.getClass();
      C_45n var10003 = recovery$indy$37(var10002);
      long var10004 = -7027067658931744940L;
      C_45n var11 = var10003;
      long var12 = var3;
      BooleanSetting var14 = var10001;
      this.settingHungerSprintOnlyOnGround = (BooleanSetting)var14.method_43$780fd62a21(var12, var11);
      this.settingJumpSprint = new BooleanSetting(this, var7, "JumpSprint", false);
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(long var0, long var2, long var4);

   private static native void recovery$indy$4(Object var0, boolean var1, long var2, long var4);

   private static native boolean recovery$indy$5(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native void recovery$indy$8(Object var0, boolean var1, long var2, long var4);

   private static native boolean recovery$indy$9(long var0, long var2);

   private static native boolean recovery$indy$10(Object var0, long var1, long var3);

   private static native String recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$12(int var0, long var1);

   private static native boolean recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native int recovery$indy$14(long var0, long var2, long var4);

   private static native int recovery$indy$15(long var0, long var2, long var4);

   private static native boolean recovery$indy$16(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$17(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$18(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$19(int var0, long var1);

   private static native void recovery$indy$20(Object var0, boolean var1, long var2, long var4);

   private static native String recovery$indy$21(int var0, long var1);

   private static native boolean recovery$indy$22(long var0, long var2);

   private static native void recovery$indy$23(Object var0, boolean var1, long var2, long var4);

   private static native String recovery$indy$24(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$25(int var0, long var1);

   private static native void recovery$indy$26(Object var0, long var1, boolean var3, long var4, long var6);

   private static native String recovery$indy$27(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$28(int var0, long var1);

   private static native boolean recovery$indy$29(Object var0, long var1, long var3);

   private static native void recovery$indy$30(Object var0, boolean var1, long var2, long var4);

   private static native boolean recovery$indy$31(Object var0, long var1, long var3);

   private static native void recovery$indy$32(Object var0, boolean var1, long var2, long var4);

   private static native void recovery$indy$33(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native void recovery$indy$34(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native void recovery$indy$35(Object var0, int var1, long var2, long var4, long var6);

   private static native double recovery$indy$36(short var0, short var1, float var2, int var3, float var4, float var5, long var6, long var8);

   private static native C_45n recovery$indy$37(BooleanSetting var0);

   private static native MethodHandle recovery$constant$38();
}
