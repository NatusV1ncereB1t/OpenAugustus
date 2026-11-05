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
import net.C_45n;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47D3;
import net.C_47D9;
import net.C_47DP;
import net.C_47Dp;
import net.C_47Du;
import net.C_47Dy;
import net.C_47K7;
import client.module.Module;
import client.setting.BooleanSetting;
import net.C_47Th;
import client.module.Category;
import net.C_47tu;
import net.C_4f;

public class LongJump_47k6 extends Module implements C_41Q {
   private final C_47Th settingModes;
   private final BooleanSetting settingAutoDisable;
   private int field_42;
   public boolean field_43a;
   private static int field_47;
   private static final long a = C_4f.a(-1650673852137515974L, 7860675431827150207L, MethodHandles.lookup().lookupClass()).a(228522790098135L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[43];
   private static final String[] f = new String[43];

   private static native void b();

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle b(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

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
            var23 = f(1735009176569339L, 0L);
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
            var23 = f(1735009176569339L, 0L);
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
            var10000 = 58;
            break;
         case 1:
            var10000 = 49;
            break;
         case 2:
            var10000 = 15;
            break;
         case 3:
            var10000 = 62;
            break;
         case 4:
            var10000 = 41;
            break;
         case 5:
            var10000 = 26;
            break;
         case 6:
            var10000 = 38;
            break;
         case 7:
            var10000 = 57;
            break;
         case 8:
            var10000 = 5;
            break;
         case 9:
            var10000 = 56;
            break;
         case 10:
            var10000 = 55;
            break;
         case 11:
            var10000 = 30;
            break;
         case 12:
            var10000 = 29;
            break;
         case 13:
            var10000 = 60;
            break;
         case 14:
            var10000 = 33;
            break;
         case 15:
            var10000 = 50;
            break;
         case 16:
            var10000 = 35;
            break;
         case 17:
            var10000 = 44;
            break;
         case 18:
            var10000 = 9;
            break;
         case 19:
            var10000 = 16;
            break;
         case 20:
            var10000 = 45;
            break;
         case 21:
            var10000 = 14;
            break;
         case 22:
            var10000 = 54;
            break;
         case 23:
            var10000 = 48;
            break;
         case 24:
            var10000 = 43;
            break;
         case 25:
            var10000 = 21;
            break;
         case 26:
            var10000 = 53;
            break;
         case 27:
            var10000 = 24;
            break;
         case 28:
            var10000 = 40;
            break;
         case 29:
            var10000 = 23;
            break;
         case 30:
            var10000 = 25;
            break;
         case 31:
            var10000 = 6;
            break;
         case 32:
            var10000 = 17;
            break;
         case 33:
            var10000 = 0;
            break;
         case 34:
            var10000 = 59;
            break;
         case 35:
            var10000 = 4;
            break;
         case 36:
            var10000 = 34;
            break;
         case 37:
            var10000 = 61;
            break;
         case 38:
            var10000 = 19;
            break;
         case 39:
            var10000 = 31;
            break;
         case 40:
            var10000 = 51;
            break;
         case 41:
            var10000 = 20;
            break;
         case 42:
            var10000 = 63;
            break;
         case 43:
            var10000 = 47;
            break;
         case 44:
            var10000 = 27;
            break;
         case 45:
            var10000 = 42;
            break;
         case 46:
            var10000 = 12;
            break;
         case 47:
            var10000 = 11;
            break;
         case 48:
            var10000 = 13;
            break;
         case 49:
            var10000 = 7;
            break;
         case 50:
            var10000 = 39;
            break;
         case 51:
            var10000 = 52;
            break;
         case 52:
            var10000 = 2;
            break;
         case 53:
            var10000 = 18;
            break;
         case 54:
            var10000 = 46;
            break;
         case 55:
            var10000 = 28;
            break;
         case 56:
            var10000 = 32;
            break;
         case 57:
            var10000 = 8;
            break;
         case 58:
            var10000 = 1;
            break;
         case 59:
            var10000 = 36;
            break;
         case 60:
            var10000 = 37;
            break;
         case 61:
            var10000 = 10;
            break;
         case 62:
            var10000 = 3;
            break;
         default:
            var10000 = 22;
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
            var12 = f(1735009176569339L, 0L);
         }
      }
   }

   @Override
   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      augustus.recovered.modules.movement.LongJump_47k6 var14;
      long var5 = (long)var1 << 32 | var3 << 32 >>> 32;
      long var7 = var5 ^ 125384268368392L;
      long var9 = var5 ^ 134142812377685L;
      long var11 = var5 ^ 115942598083693L;
      boolean var13 = recovery$indy$2(4728656615237650505L, var5);
      recovery$indy$4(this, var7, recovery$indy$3(this.settingModes, var11, 4724429074852490952L, var5), 4724493129584078017L, var5);
      int var10000 = (int) ((recovery$indy$5(this.settingModes, var11, 4724429074852490952L, var5).equals(recovery$indy$6(16360, 5698067155247758505L ^ var5))) ? 1 : 0);
      if (!var13) {
         if (var10000 != 0) {
            return;
         }

         var10000 = (int) ((recovery$indy$7(field_43, 4724600992948912139L, var5).field_48M) ? 1 : 0);
      }

      boolean var10001 = var13;
      if (var3 >= 0L) {
         if (!var13) {
            if (var10000 == 0) {
               return;
            }

            var10000 = this.field_42;
         }

         var10001 = var13;
      }

      label56: {
         label72: {
            label54:
            if (!var10001) {
               if (var10000 > 0) {
                  var10000 = (int) ((recovery$indy$8(this.settingAutoDisable, 4728728761903686595L, var5)) ? 1 : 0);
                  if (var13) {
                     break label54;
                  }

                  if (var10000 != 0) {
                     recovery$indy$9(this, var9, false, 4725353261233372984L, var5);
                     return;
                  }
               }

               this.field_42++;
               var14 = this;
               var10001 = var13;
               if (var1 <= 0) {
                  break label56;
               }

               if (var13) {
                  break label72;
               }

               var10000 = this.field_42 % 2;
            }

            if (var10000 != 0) {
               return;
            }

            var14 = this;
         }

         var10001 = true;
      }

      var14.field_43a = var10001;
   }

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 71080775316854L;
      long var3 = var1 ^ 32522122523398L;
      long var10000 = -5263272365344845858L;
      boolean var5 = Fly_47kE.method_48$aae029aa0a();
      long var10002 = -5261330467649693277L;
      long var6 = var3;
      C_47Th var8 = this.settingModes;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("IntaveBoat");
      if (var5) {
         var9 = !var9;
      }

      return var9;
   }

   public static int method_49$8abf5c6871() {
      return field_47;
   }

   public static int method_45$8abf5c6871() {
      int var0 = method_49$8abf5c6871();
      return var0 == 0 ? 118 : 0;
   }

   public static void method_43$d00df7729d(int var0) {
      field_47 = var0;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$10(this, 18, var3, -7099312802822757555L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$11(field_43, -7737752106426191461L, var1).field_43 = 1.0F;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_42 = 0;
      this.field_43a = true;
   }

   public LongJump_47k6(char var1, int var2, int var3) {
      super("LongJump", "Weitsprung", ((((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a) ^ 57946292706657L), new Color(243, 45, 134), Category.MOVEMENT);
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 83866539562055L;
      long var8 = var4 ^ 76515640836474L;
      long var10 = var4 ^ 48983787553530L;
      long var12 = var4 ^ 57946292706657L;
      long var10001 = var4 ^ 12045174839804L;
      int var14 = (int)((var4 ^ 12045174839804L) >>> 32);
      int var15 = (int)((var4 ^ 12045174839804L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      // Super arguments moved to the required Java constructor position.
      short var10004 = (short)var15;
      short var10005 = (short)var16;
      BiFunction[] var10009 = new BiFunction[5];
      long var10012 = 6111685694717056637L;
      var10009[0] = C_47D3.method_42$0e52b9896c();
      var10012 = 6111969093364204112L;
      var10009[1] = C_47Dy.method_48$0e52b9896c();
      var10012 = 6115076693806571522L;
      var10009[2] = C_47DP.method_44$0e52b9896c();
      var10012 = 6115030359856363922L;
      var10009[3] = C_47Du.method_46$0e52b9896c();
      var10012 = 6111797599171513465L;
      var10009[4] = C_47D9.method_45$0e52b9896c();
      C_47Th var25 = new C_47Th(var14, var10004, var10005, this, "Modes", "NCP", var10009);
      long var10002 = 6112067539394713706L;
      C_47tu var10003 = C_47Dp.method_40$44f3037ffa();
      long var28 = 6112474924597953053L;
      C_47tu var17 = var10003;
      long var18 = var10;
      C_47Th var20 = var25;
      this.settingModes = var20.method_41$f9a7f5dbb6(var18, var17);
      BooleanSetting var26 = new BooleanSetting(this, var8, "AutoDisable", true);
      C_45n var27 = recovery$indy$12(this);
      long var29 = 6112333227284850664L;
      C_45n var21 = var27;
      long var22 = var6;
      BooleanSetting var24 = var26;
      this.settingAutoDisable = (BooleanSetting)var24.method_43$780fd62a21(var22, var21);
      this.field_42 = 0;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Method c(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field c(Class var0, String var1, Class var2);

   private static native MethodHandle recovery$constant$0();

   private static native MethodHandle recovery$constant$1();

   private static native boolean recovery$indy$2(long var0, long var2);

   private static native String recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$4(Object var0, long var1, Object var3, long var4, long var6);

   private static native String recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$6(int var0, long var1);

   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3);

   private static native void recovery$indy$9(Object var0, long var1, boolean var3, long var4, long var6);

   private static native void recovery$indy$10(Object var0, int var1, long var2, long var4, long var6);

   private static native C_40X recovery$indy$11(Object var0, long var1, long var3);

   private static native C_45n recovery$indy$12(LongJump_47k6 var0);
}
