package augustus.recovered.modules.combat;

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
import net.C_40X;
import net.C_45n;
import net.C_477Y;
import net.C_477z;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47H;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.minecraft.client.Minecraft;
import net.C_47si;
import client.module.Category;
import net.C_47xz;
import net.C_48q;
import net.C_4f;

public class SilentMurder_47Cj extends Module implements C_47si, C_48q, C_47xz {
   private final NumberSetting settingTickDelay;
   private final BooleanSetting settingTimer;
   private final BooleanSetting settingBypassBalanceChecks;
   private int field_42;
   private int field_43y;
   private boolean field_43a;
   private boolean field_43P;
   private static final long a = C_4f.a(6279732949576559702L, 6845530356035869871L, MethodHandles.lookup().lookupClass()).a(127504015568817L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final Object[] f = new Object[30];
   private static final String[] g = new String[30];

   private static native String b(byte[] var0);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Class b(long var0, long var2);

   private static native String b(int var0, long var1);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field b(Class var0, String var1, Class var2);

   @Override
   public void method_46$2c4d5d53cf(long var1, C_47H var3) {
      C_47H var5;
      label30: {
         int[] var4 = recovery$indy$1(7024854010373532154L, var1);
         int var10000 = (int) ((this.field_43a) ? 1 : 0);
         if (var4 == null) {
            if (!this.field_43a) {
               return;
            }

            var5 = var3;
            if (var4 != null) {
               break label30;
            }

            var10000 = recovery$indy$2(var3, 7024635774716248730L, var1);
         }

         if (var10000 <= 0) {
            return;
         }

         recovery$indy$4(var3, recovery$indy$3(var3, 7024635774716248730L, var1) - 1, 7024703223532624548L, var1);
         var5 = var3;
      }

      recovery$indy$5(var5, 0.0F, 7024506552246108067L, var1);
      this.field_43a = false;
   }

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native void a();

   private static native int a(long var0, long var2);

   private static native Method d(long var0, long var2);

   @Override
   public void method_41$426c33b229(C_477z var1, long var2) {
      int[] var12;
      net.C_40X var11;
      long var4 = var2 ^ 46613554740368L;
      long var6 = var2 ^ 81468512745979L;
      this.field_43y = -1;
      int[] var10000 = recovery$indy$6(8137184384603846762L, var2);
      int var9 = recovery$indy$7(var6, 8137274601016017957L, var2);
      int[] var8 = var10000;
      int var10 = var9;
      int var10001 = -1;
      if (var8 == null) {
         if (var9 == -1) {
            return;
         }

         var10 = var9;
         var10001 = recovery$indy$8(field_43, 8137980069463810647L, var2).field_42X.field_42;
      }

      label70: {
         label79: {
            if (var8 == null) {
               if (var10 == var10001) {
                  return;
               }

               var10 = this.field_42;
               if (var8 != null) {
                  break label79;
               }

               var10001 = recovery$indy$9(field_43, 8137980069463810647L, var2).field_48y;
            }

            if (var10 <= var10001) {
               double var13;
               var10 = (
                        var13 = Math.abs(recovery$indy$10(field_43, 8137980069463810647L, var2).field_48y - this.field_42)
                           - recovery$indy$11(this.settingTickDelay, var4, 8137764470154726273L, var2)
                     )
                     == 0.0
                  ? 0
                  : (var13 < 0.0 ? -1 : 1);
               var12 = var8;
               if (var2 <= 0L) {
                  break label70;
               }

               if (var8 != null) {
                  break label79;
               }

               if (var10 <= 0) {
                  return;
               }
            }

            this.field_42 = recovery$indy$12(field_43, 8137980069463810647L, var2).field_48y;
            this.field_43y = recovery$indy$13(field_43, 8137980069463810647L, var2).field_42X.field_42;
            recovery$indy$14(field_43, 8137980069463810647L, var2).field_49m.method_45$631790539f(new C_477Y(var9));
            var10 = (int) ((recovery$indy$15(this.settingTimer, 8137708497157924985L, var2)) ? 1 : 0);
         }

         var12 = var8;
      }

      label82: {
         if (var12 == null) {
            if (var10 == 0) {
               return;
            }

            var11 = recovery$indy$16(field_43, 8137812926890454861L, var2);
            if (var8 != null) {
               break label82;
            }

            var10 = var11.field_48;
         }

         if (var10 != 1) {
            return;
         }

         var11 = recovery$indy$17(field_43, 8137812926890454861L, var2);
      }

      var11.field_48 = 2;
      this.field_43P = true;
   }

   @Override
   public void method_44$3cd1f0717e(byte var1, long var2) {
      augustus.recovered.modules.combat.SilentMurder_47Cj var11;
      long var4 = (long)var1 << 56 | var2 << 8 >>> 8;
      long var6 = var4 ^ 138840323479182L;
      int[] var8 = recovery$indy$18(2276607320806954783L, var4);
      int var10000 = (int) ((recovery$indy$19(this.settingTimer, 2277632415640635148L, var4)) ? 1 : 0);
      if (var8 == null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = recovery$indy$20(var6, 2276671303118498640L, var4);
      }

      label34: {
         label33: {
            int var9 = var10000;
            var10000 = var9;
            byte var10001 = -1;
            if (var8 == null) {
               if (var9 == -1) {
                  break label33;
               }

               var11 = this;
               if (var8 != null) {
                  break label34;
               }

               var10000 = this.field_43y;
               var10001 = -1;
            }

            if (var10000 != var10001) {
               recovery$indy$21(field_43, 2277376238847986978L, var4).field_49m.method_45$631790539f(new C_477Y(this.field_43y));
            }
         }

         var11 = this;
      }

      var11.field_43y = -1;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$22(this, 1, var3, -7099705853992338505L, var1);
      recovery$indy$23(this, 16, var3, -7099705853992338505L, var1);
      recovery$indy$24(this, 40, var3, -7099705853992338505L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   @Override
   public void method_487$da8c82d5d4() {
      augustus.recovered.modules.combat.SilentMurder_47Cj var9;
      long var1 = a ^ 29618394576894L;
      long var10000 = -4300066370557424428L;
      int[] var3 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = -4300401359995152663L;
      Minecraft var4 = field_43;
      if (var4.field_42P != null) {
         int var8 = this.field_43y;
         if (var3 == null) {
            if (this.field_43y == -1) {
               return;
            }

            var10001 = -4300659752259674937L;
            BooleanSetting var5 = this.settingTimer;
            var8 = (int) ((var5.method_49$aae029aa0a()) ? 1 : 0);
         }

         if (var3 == null) {
            if (var8 == 0) {
               return;
            }

            var10001 = -4300401359995152663L;
            Minecraft var6 = field_43;
            var6.field_42P.field_49m.method_45$631790539f(new C_477Y(this.field_43y));
            this.field_43y = -1;
            var8 = (int) ((this.field_43P) ? 1 : 0);
         }

         label58: {
            if (var3 == null) {
               if (var8 == 0) {
                  return;
               }

               var9 = this;
               if (var3 != null) {
                  break label58;
               }

               var10001 = -4300659752259674937L;
               BooleanSetting var7 = this.settingBypassBalanceChecks;
               var8 = (int) ((var7.method_49$aae029aa0a()) ? 1 : 0);
            }

            if (var8 != 0) {
               this.field_43a = true;
            }

            var9 = this;
         }

         var9.field_43P = false;
      }
   }

   public SilentMurder_47Cj(char var1, int var2, int var3) {
      super("SilentMurder", "LautloserMord", ((((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a) ^ 137221833329434L), new Color(209, 140, 171), Category.COMBAT);
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 4640407831100L;
      long var8 = var4 ^ 15298422331137L;
      long var10 = var4 ^ 35947842070662L;
      long var12 = var4 ^ 137221833329434L;
      // Super arguments moved to the required Java constructor position.
      this.settingTickDelay = new NumberSetting(this, "TickDelay", 10.0, var10, 0.0, 20.0, 0);
      this.settingTimer = new BooleanSetting(this, var8, "Timer", false);
      BooleanSetting var10001 = new BooleanSetting(this, var8, "Bypass balance checks", true);
      BooleanSetting var10002 = this.settingTimer;
      this.settingTimer.getClass();
      C_45n var10003 = recovery$indy$25(var10002);
      long var10004 = -9032520421920012643L;
      C_45n var14 = var10003;
      long var15 = var6;
      BooleanSetting var17 = var10001;
      this.settingBypassBalanceChecks = (BooleanSetting)var17.method_43$780fd62a21(var15, var14);
      this.field_42 = 0;
      this.field_43y = -1;
      this.field_43a = false;
      this.field_43P = false;
   }

   // Retained obfuscator initialization is restored after javac.
   static { c = null; d = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native int recovery$indy$2(Object var0, long var1, long var3);

   private static native int recovery$indy$3(Object var0, long var1, long var3);

   private static native void recovery$indy$4(Object var0, int var1, long var2, long var4);

   private static native void recovery$indy$5(Object var0, float var1, long var2, long var4);

   private static native int[] recovery$indy$6(long var0, long var2);

   private static native int recovery$indy$7(long var0, long var2, long var4);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);

   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);

   private static native boolean recovery$indy$15(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$16(Object var0, long var1, long var3);

   private static native C_40X recovery$indy$17(Object var0, long var1, long var3);

   private static native int[] recovery$indy$18(long var0, long var2);

   private static native boolean recovery$indy$19(Object var0, long var1, long var3);

   private static native int recovery$indy$20(long var0, long var2, long var4);

   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);

   private static native void recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$23(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$24(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$25(BooleanSetting var0);

   private static native MethodHandle recovery$constant$26();
}
