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
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40X;
import net.C_41Q;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47K7;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47Th;
import net.C_47Vc;
import client.module.Category;
import net.C_47tu;
import net.C_4f;

public class FastLadder_47k5 extends Module implements C_47Vc, C_41Q {
   public final C_47Th settingModes;
   public final NumberSetting settingTimer;
   public final BooleanSetting settingStopOnEnd;
   private boolean field_43a;
   private boolean field_43P;
   private static final long a = C_4f.a(3400869504432971723L, 8935898126316150635L, MethodHandles.lookup().lookupClass()).a(223338170144668L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[31];
   private static final String[] f = new String[31];

   private static native void b();

   private static native String b(byte[] var0);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

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
            var23 = f(1358034129453821L, 0L);
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
            var23 = f(1358034129453821L, 0L);
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
            var10000 = 8;
            break;
         case 1:
            var10000 = 63;
            break;
         case 2:
            var10000 = 46;
            break;
         case 3:
            var10000 = 58;
            break;
         case 4:
            var10000 = 17;
            break;
         case 5:
            var10000 = 50;
            break;
         case 6:
            var10000 = 28;
            break;
         case 7:
            var10000 = 10;
            break;
         case 8:
            var10000 = 31;
            break;
         case 9:
            var10000 = 9;
            break;
         case 10:
            var10000 = 13;
            break;
         case 11:
            var10000 = 43;
            break;
         case 12:
            var10000 = 57;
            break;
         case 13:
            var10000 = 60;
            break;
         case 14:
            var10000 = 42;
            break;
         case 15:
            var10000 = 19;
            break;
         case 16:
            var10000 = 33;
            break;
         case 17:
            var10000 = 14;
            break;
         case 18:
            var10000 = 12;
            break;
         case 19:
            var10000 = 26;
            break;
         case 20:
            var10000 = 32;
            break;
         case 21:
            var10000 = 45;
            break;
         case 22:
            var10000 = 61;
            break;
         case 23:
            var10000 = 4;
            break;
         case 24:
            var10000 = 55;
            break;
         case 25:
            var10000 = 36;
            break;
         case 26:
            var10000 = 15;
            break;
         case 27:
            var10000 = 16;
            break;
         case 28:
            var10000 = 11;
            break;
         case 29:
            var10000 = 30;
            break;
         case 30:
            var10000 = 56;
            break;
         case 31:
            var10000 = 38;
            break;
         case 32:
            var10000 = 6;
            break;
         case 33:
            var10000 = 24;
            break;
         case 34:
            var10000 = 62;
            break;
         case 35:
            var10000 = 39;
            break;
         case 36:
            var10000 = 20;
            break;
         case 37:
            var10000 = 21;
            break;
         case 38:
            var10000 = 5;
            break;
         case 39:
            var10000 = 40;
            break;
         case 40:
            var10000 = 52;
            break;
         case 41:
            var10000 = 47;
            break;
         case 42:
            var10000 = 3;
            break;
         case 43:
            var10000 = 44;
            break;
         case 44:
            var10000 = 0;
            break;
         case 45:
            var10000 = 48;
            break;
         case 46:
            var10000 = 29;
            break;
         case 47:
            var10000 = 37;
            break;
         case 48:
            var10000 = 27;
            break;
         case 49:
            var10000 = 51;
            break;
         case 50:
            var10000 = 23;
            break;
         case 51:
            var10000 = 25;
            break;
         case 52:
            var10000 = 22;
            break;
         case 53:
            var10000 = 49;
            break;
         case 54:
            var10000 = 54;
            break;
         case 55:
            var10000 = 1;
            break;
         case 56:
            var10000 = 41;
            break;
         case 57:
            var10000 = 35;
            break;
         case 58:
            var10000 = 59;
            break;
         case 59:
            var10000 = 34;
            break;
         case 60:
            var10000 = 2;
            break;
         case 61:
            var10000 = 53;
            break;
         case 62:
            var10000 = 18;
            break;
         default:
            var10000 = 7;
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

   private static native Method d(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite d(Lookup var0, String var1, MethodType var2);

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
            var12 = f(1358034129453821L, 0L);
         }
      }
   }

   @Override
   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      FastLadder_47k5 var13;
      boolean var14;
      label45: {
         label48: {
            long var5 = (long)var1 << 32 | var3 << 32 >>> 32;
            long var7 = var5 ^ 93560678845923L;
            long var10001 = var5 ^ 125777403290110L;
            int var9 = (int)((var5 ^ 125777403290110L) >>> 48);
            int var10 = (int)((var5 ^ 125777403290110L) << 16 >>> 48);
            int var11 = (int)(var10001 << 32 >>> 32);
            boolean var12 = recovery$indy$2(4727713057670258181L, var5);
            boolean var10000 = recovery$indy$3(this, (char)var9, (short)var10, var11, 4728681299235702912L, var5);
            if (!var12) {
               label41: {
                  if (var10000) {
                     var13 = this;
                     var14 = true;
                     if (var3 <= 0L) {
                        break label41;
                     }

                     this.field_43P = true;
                     recovery$indy$4(field_43, 4728591081539263231L, var5).field_43 = (float)Math.max(
                        0.1, recovery$indy$5(this.settingTimer, var7, 4727915084821876479L, var5)
                     );
                     if (!var12) {
                        return;
                     }
                  }

                  var13 = this;
                  var14 = var12;
               }

               if (var3 < 0L) {
                  break label45;
               }

               if (var14) {
                  break label48;
               }

               var10000 = var13.field_43P;
            }

            if (!var10000) {
               return;
            }

            recovery$indy$6(field_43, 4728591081539263231L, var5).field_43 = 1.0F;
            var13 = this;
         }

         var14 = false;
      }

      var13.field_43P = var14;
   }

   public boolean method_45$5805b0149c(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      boolean var6 = recovery$indy$7(8386327984108366843L, var4);
      boolean var10000 = recovery$indy$8(field_43, 8386209705517609358L, var4).method_49W$aae029aa0a();
      if (!var6) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$9(field_43, 8386209705517609358L, var4).field_48d;
      }

      return var6 ? var10000 : var10000;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$10(this, 43, var3, -7099036907300528836L, var1);
      recovery$indy$11(this, 18, var3, -7099036907300528836L, var1);
   }

   @Override
   public void method_45q$e45a9973e5(long var1) {
      FastLadder_47k5 var10000;
      boolean var10001;
      label49: {
         long var3 = var1 ^ 46911700055250L;
         long var5 = var1 ^ 54777118390967L;
         boolean var7 = recovery$indy$12(4559576022868175900L, var1);
         recovery$indy$14(this, var3, recovery$indy$13(this.settingModes, var5, 4558948981665324768L, var1), 4558850853588453416L, var1);
         var10000 = this;
         label48:
         if (var7) {
            label51: {
               boolean var8 = recovery$indy$15(this.settingStopOnEnd, 4559352819630724891L, var1);
               if (var1 >= 0L) {
                  if (!var8) {
                     break label51;
                  }

                  var8 = recovery$indy$16(field_43, 4559218203722857130L, var1).method_49W$aae029aa0a();
               }

               if (var7) {
                  if (var8) {
                     break label51;
                  }

                  var10000 = this;
                  var10001 = var7;
                  if (var1 <= 0L) {
                     break label49;
                  }

                  if (!var7) {
                     break label48;
                  }

                  var8 = this.field_43a;
               }

               if (var8) {
                  recovery$indy$17(field_43, 4559218203722857130L, var1).field_42 = 0.2F;
               }
            }

            var10000 = this;
         }

         var10001 = recovery$indy$18(field_43, 4559218203722857130L, var1).method_49W$aae029aa0a();
      }

      var10000.field_43a = var10001;
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43a = false;
      this.field_43P = false;
   }

   public FastLadder_47k5(short var1, char var2, int var3) {
      super("FastLadder", "Schnellleiter", ((((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a) ^ 74697866552841L), new Color(166, 168, 50), Category.MOVEMENT);
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 55849345874450L;
      long var8 = var4 ^ 100951910103442L;
      long var10 = var4 ^ 34717348382101L;
      long var12 = var4 ^ 74697866552841L;
      long var10001 = var4 ^ 138161105822356L;
      int var14 = (int)((var4 ^ 138161105822356L) >>> 32);
      int var15 = (int)((var4 ^ 138161105822356L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      // Super arguments moved to the required Java constructor position.
      C_47Th var21 = new C_47Th(
         var14,
         (short)var15,
         (short)var16,
         this,
         "Modes",
         "Motion",
         new BiFunction[]{recovery$indy$19(), recovery$indy$20(), recovery$indy$21(), recovery$indy$22()}
      );
      C_47tu var10003 = recovery$indy$23();
      long var10004 = 3437393683115557244L;
      C_47tu var17 = var10003;
      long var18 = var8;
      C_47Th var20 = var21;
      this.settingModes = var20.method_41$f9a7f5dbb6(var18, var17);
      this.settingTimer = new NumberSetting(this, "Timer", 1.0, var10, 0.1, 2.0, 2);
      this.settingStopOnEnd = new BooleanSetting(this, var6, "StopOnEnd", true);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Method c(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field c(Class var0, String var1, Class var2);

   private static native MethodHandle recovery$constant$0();

   private static native MethodHandle recovery$constant$1();

   private static native boolean recovery$indy$2(long var0, long var2);

   private static native boolean recovery$indy$3(Object var0, char var1, short var2, int var3, long var4, long var6);

   private static native C_40X recovery$indy$4(Object var0, long var1, long var3);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native C_40X recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native void recovery$indy$10(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$11(Object var0, int var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$12(long var0, long var2);

   private static native String recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$14(Object var0, long var1, Object var3, long var4, long var6);

   private static native boolean recovery$indy$15(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$16(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$17(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);

   private static native BiFunction recovery$indy$19();

   private static native BiFunction recovery$indy$20();

   private static native BiFunction recovery$indy$21();

   private static native BiFunction recovery$indy$22();

   private static native C_47tu recovery$indy$23();
}
