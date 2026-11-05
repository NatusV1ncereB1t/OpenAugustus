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
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40g;
import net.C_41Z;
import net.C_45n;
import net.C_474i;
import net.C_475c;
import net.C_476q;
import net.C_477r;
import net.C_47Az;
import net.C_47B5;
import net.C_47Ij;
import net.C_47MO;
import net.minecraft.entity.Entity;
import net.C_47OA;
import net.C_47S6;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47UH;
import net.C_47WF;
import net.C_47cu;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class AntiFireBall_47Oz extends C_47OA implements C_47UH, C_47xz {
   public final BooleanSetting settingNoRotate;
   public final NumberSetting settingPreAimRange;
   public final NumberSetting settingDelay;
   public final NumberSetting settingRange;
   public final BooleanSetting settingSlowDown;
   public final NumberSetting settingTicksExisted;
   public final BooleanSetting settingNotWhileDigging;
   private final C_47cu field_48;
   private Object[] field_49;
   private Entity field_47;
   private static final long b = C_4f.a(5512770058577107520L, -7393997817904413201L, MethodHandles.lookup().lookupClass()).a(89847792764794L);
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);
   private static final Object[] l = new Object[48];
   private static final String[] m = new String[48];

   private static native MethodHandle b(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native void b();

   private static Method h(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = l[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      }

      String var6 = m[var4];
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
            l[var4] = var26;
            return var26;
         }

         if (var23.getName().equals("java.lang.Object")) {
            break;
         }

         if ((var23 = var23.getSuperclass()) == null) {
            var23 = f(1930444305465613L, 0L);
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
                  l[var4] = var19;
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
            var23 = f(1930444305465613L, 0L);
         }
      }
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(recovery$constant$0().asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("net/47Oz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (m[var4] != null) {
         return var4;
      }

      Object var5 = l[var4];
      if (!(var5 instanceof String)) {
         return var4;
      }

      byte var6 = 0;
      byte var10000;
      switch ((int)(var0 >>> 42 & 63L)) {
         case 0:
            var10000 = 11;
            break;
         case 1:
            var10000 = 28;
            break;
         case 2:
            var10000 = 12;
            break;
         case 3:
            var10000 = 52;
            break;
         case 4:
            var10000 = 0;
            break;
         case 5:
            var10000 = 50;
            break;
         case 6:
            var10000 = 16;
            break;
         case 7:
            var10000 = 45;
            break;
         case 8:
            var10000 = 20;
            break;
         case 9:
            var10000 = 47;
            break;
         case 10:
            var10000 = 60;
            break;
         case 11:
            var10000 = 8;
            break;
         case 12:
            var10000 = 59;
            break;
         case 13:
            var10000 = 55;
            break;
         case 14:
            var10000 = 22;
            break;
         case 15:
            var10000 = 33;
            break;
         case 16:
            var10000 = 61;
            break;
         case 17:
            var10000 = 3;
            break;
         case 18:
            var10000 = 25;
            break;
         case 19:
            var10000 = 29;
            break;
         case 20:
            var10000 = 21;
            break;
         case 21:
            var10000 = 46;
            break;
         case 22:
            var10000 = 6;
            break;
         case 23:
            var10000 = 30;
            break;
         case 24:
            var10000 = 31;
            break;
         case 25:
            var10000 = 15;
            break;
         case 26:
            var10000 = 34;
            break;
         case 27:
            var10000 = 23;
            break;
         case 28:
            var10000 = 14;
            break;
         case 29:
            var10000 = 17;
            break;
         case 30:
            var10000 = 43;
            break;
         case 31:
            var10000 = 57;
            break;
         case 32:
            var10000 = 1;
            break;
         case 33:
            var10000 = 2;
            break;
         case 34:
            var10000 = 18;
            break;
         case 35:
            var10000 = 19;
            break;
         case 36:
            var10000 = 51;
            break;
         case 37:
            var10000 = 49;
            break;
         case 38:
            var10000 = 5;
            break;
         case 39:
            var10000 = 54;
            break;
         case 40:
            var10000 = 32;
            break;
         case 41:
            var10000 = 4;
            break;
         case 42:
            var10000 = 7;
            break;
         case 43:
            var10000 = 26;
            break;
         case 44:
            var10000 = 10;
            break;
         case 45:
            var10000 = 40;
            break;
         case 46:
            var10000 = 41;
            break;
         case 47:
            var10000 = 36;
            break;
         case 48:
            var10000 = 39;
            break;
         case 49:
            var10000 = 63;
            break;
         case 50:
            var10000 = 42;
            break;
         case 51:
            var10000 = 27;
            break;
         case 52:
            var10000 = 13;
            break;
         case 53:
            var10000 = 48;
            break;
         case 54:
            var10000 = 37;
            break;
         case 55:
            var10000 = 24;
            break;
         case 56:
            var10000 = 58;
            break;
         case 57:
            var10000 = 38;
            break;
         case 58:
            var10000 = 35;
            break;
         case 59:
            var10000 = 9;
            break;
         case 60:
            var10000 = 56;
            break;
         case 61:
            var10000 = 44;
            break;
         case 62:
            var10000 = 62;
            break;
         default:
            var10000 = 53;
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

      m[var4] = new String(var13);
      return var4;
   }

   private static native Field d(Class var0, String var1, Class var2);

   private static native Method d(Class var0, String var1, Class var2, int var3, Class[] var4);

   @Override
   public void method_41$fae8de1664(C_475c var1) {
      net.C_47cu var57;
      long var64;
      long var4;
      long var6;
      long var8;
      long var13;
      int[] var15;
      boolean var59;
      label106: {
         label109: {
            long var2 = b ^ 63114840956650L;
            var4 = var2 ^ 44465248595198L;
            var6 = var2 ^ 24719148984178L;
            var8 = var2 ^ 70926470126615L;
            long var10001 = var2 ^ 84726979948789L;
            int var10 = (int)((var2 ^ 84726979948789L) >>> 48);
            int var11 = (int)((var2 ^ 84726979948789L) << 16 >>> 32);
            int var12 = (int)(var10001 << 48 >>> 48);
            var13 = var2 ^ 103350302456714L;
            long var10000 = -6878101040473840721L;
            var15 = AntiBot_47CG.method_40$d4d28024c9();
            long var10003 = -6877753303593715493L;
            long var16 = var13;
            AntiFireBall_47Oz var18 = this;
            var59 = var18.method_48F$0dd78e0064(var16);
            if (var15 == null) {
               if (!var59) {
                  break label109;
               }

               long var10002 = -6880594192431969529L;
               BooleanSetting var19 = this.settingNoRotate;
               var59 = var19.method_49$aae029aa0a();
            }

            if (var15 == null) {
               if (var59) {
                  break label109;
               }

               char var68 = (char)var10;
               char var10005 = (char)var12;
               long var10006 = -6880423122239436792L;
               char var20 = var10005;
               AntiFireBall_47Oz var21 = this;
               int var22 = var11;
               char var23 = var68;
               C_47S6 var24 = ClientGlobals.field_46;
               var59 = var24.method_49$dc3f815dad(var23, var22, var21, var20);
            }

            if (var15 != null) {
               break label106;
            }

            if (var59) {
               var59 = true;
               break label106;
            }
         }

         var59 = false;
      }

      this.field_43a = var59;
      long var69 = -6877753303593715493L;
      long var25 = var13;
      AntiFireBall_47Oz var27 = this;
      boolean var55 = var27.method_48F$0dd78e0064(var25);
      if (var15 == null) {
         if (!var55) {
            return;
         }

         long var60 = -6880594192431969529L;
         BooleanSetting var28 = this.settingNoRotate;
         var55 = var28.method_49$aae029aa0a();
      }

      if (!var55) {
         long var61 = -6877937643721729145L;
         Minecraft var29 = field_43;
         C_47Ij var56 = var29.field_42Y;
         if (var15 == null) {
            if (var29.field_42Y == null) {
               return;
            }

            long var62 = -6877937643721729145L;
            Minecraft var30 = field_43;
            var56 = var30.field_42Y;
         }

         if (var56.field_49 == C_47Az.ENTITY) {
            label77: {
               var57 = this.field_48;
               long var74 = -6880563775207975086L;
               long var31 = var4;
               NumberSetting var33 = this.settingDelay;
               double var63 = var33.method_44$474dfaa627(var31);
               double var70 = 0.0;
               if (var15 == null) {
                  if (var63 == 0.0) {
                     var64 = 0L;
                     break label77;
                  }

                  var74 = -6880563775207975086L;
                  long var34 = var4;
                  NumberSetting var36 = this.settingDelay;
                  var63 = var36.method_44$474dfaa627(var34);
                  long var77 = -6877896722823352523L;
                  long var37 = var8;
                  byte var39 = 60;
                  byte var40 = 0;
                  C_47MO var41 = C_476q.field_48;
                  var70 = var41.method_43$75dd719903(var40, var39, var37);
               }

               var64 = (long)(var63 + var70);
            }

            long var76 = -6877195384616542223L;
            long var42 = var6;
            long var44 = var64;
            C_47cu var46 = var57;
            var55 = var46.method_42$b0e346e6e3(var44, var42);
            if (var15 == null) {
               if (!var55) {
                  return;
               }

               long var65 = -6880594192431969529L;
               BooleanSetting var47 = this.settingSlowDown;
               var55 = var47.method_49$aae029aa0a();
            }

            label66: {
               if (var55) {
                  var69 = -6877533771887538740L;
                  byte var48 = 1;
                  C_475c var49 = var1;
                  var49.method_44$d00df7729d(var48);
                  if (var15 == null) {
                     break label66;
                  }
               }

               var69 = -6877533771887538740L;
               byte var50 = 1;
               C_475c var51 = var1;
               var51.method_44$d00df7729d(var50);
               Runnable var66 = recovery$indy$1();
               var69 = -6877096469145673679L;
               Runnable var52 = var66;
               C_475c var53 = var1;
               var53.method_43$f98697054d(var52);
            }

            long var67 = -6877364648713810408L;
            C_47cu var54 = this.field_48;
            var54.method_46$da8c82d5d4();
         }
      }
   }

   private static Class f(long var0, long var2) {
      Class var5 = null;
      int var4 = e(var0, var2);
      Object var6 = l[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(m[var4]);
            l[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      return (Class)var6;
   }

   private static Field g(long var0, long var2) {
      int var4 = e(var0, var2);
      Object var5 = l[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      }

      String var6 = m[var4];
      int var7 = var6.indexOf(8);
      Class var8 = f(Long.parseLong(var6.substring(0, var7), 36), 0L);
      int var9 = var6.indexOf(8, ++var7);
      String var10 = var6.substring(var7, var9);
      Class var11 = f(Long.parseLong(var6.substring(++var9), 36), 0L);
      Class var12 = var8;

      while (true) {
         Field var13 = c(var12, var10, var11);
         if (var13 != null) {
            l[var4] = var13;
            return var13;
         }

         Class[] var14 = var12.getInterfaces();
         if (var14 != null) {
            for (int var15 = 0; var15 < var14.length; var15++) {
               var13 = d(var14[var15], var10, var11);
               if (var13 != null) {
                  l[var4] = var13;
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
            var12 = f(1930444305465613L, 0L);
         }
      }
   }

   private static double method_44$83ff7736af(Entity var0) {
      long var1 = b ^ 35722861793547L;
      long var10001 = -5805293796652047396L;
      Minecraft var3 = field_43;
      return var3.field_42P.method_44$ee256e8a75(var0);
   }

   private static void method_48$da8c82d5d4() {
      long var0 = b ^ 20174990707452L;
      long var10000 = -821281628045920327L;
      int[] var2 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = -821829792191088597L;
      Minecraft var3 = field_43;
      var3.field_42P.method_46i$da8c82d5d4();
      Minecraft var7 = field_43;
      if (var2 == null) {
         var10001 = -821199837903548527L;
         Minecraft var4 = field_43;
         if (var4.field_42Y.field_47 == null) {
            return;
         }

         var7 = field_43;
      }

      var10001 = -821829792191088597L;
      Minecraft var5 = var7;
      long var10004 = -821199837903548527L;
      Minecraft var6 = field_43;
      var5.field_42P.field_49m.method_45$631790539f(new C_47WF(var6.field_42Y.field_47, C_41Z.ATTACK));
   }

   private boolean method_43$7c2c45e4ce(Entity var1) {
      long var2 = b ^ 114531456012225L;
      long var4 = var2 ^ 133305587760597L;
      long var10000 = 3577901850866971268L;
      int[] var6 = AntiBot_47CG.method_40$d4d28024c9();
      byte var16 = (byte) ((var1 instanceof C_47B5) ? 1 : 0);
      if (var6 == null) {
         if (var16 == 0) {
            return false;
         }

         double var17 = var1.field_48y;
         long var10003 = 3578113198104135289L;
         long var7 = var4;
         NumberSetting var9 = this.settingTicksExisted;
         double var22;
         var16 = (byte)((var22 = var17 - var9.method_44$474dfaa627(var7)) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1));
      }

      if (var6 == null) {
         if (var16 <= 0) {
            return false;
         }

         long var10001 = 3577331843633659158L;
         Minecraft var10 = field_43;
         double var18 = var10.field_42P.method_44$ee256e8a75(var1);
         long var21 = 3578113198104135289L;
         long var11 = var4;
         NumberSetting var13 = this.settingPreAimRange;
         double var23;
         var16 = (byte)((var23 = var18 - var13.method_44$474dfaa627(var11)) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1));
      }

      if (var6 == null) {
         if (var16 >= 0) {
            return false;
         }

         long var20 = 3577331843633659158L;
         Minecraft var14 = field_43;
         double var19 = var14.field_42P.method_44$ee256e8a75(var1);
         long var10002 = 3577331843633659158L;
         Minecraft var15 = field_43;
         double var24;
         var16 = (byte)((var24 = var19 - var15.field_42P.method_49$4b58f7ab41(var1.field_48a, var1.field_48G, var1.field_48q)) == 0.0
            ? 0
            : (var24 < 0.0 ? -1 : 1));
      }

      return (boolean)(var6 != null ? var16 : var16 <= 0);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 49072313886417L;
      super.method_43_$e45a9973e5(var3);
      recovery$indy$2(this, 7, var5, -7099143794811254749L, var1);
      recovery$indy$3(this, 40, var5, -7099143794811254749L, var1);
   }

   private boolean method_48F$0dd78e0064(long var1) {
      var1 = b ^ var1;
      long var3 = var1 ^ 66357834068505L;
      int[] var5 = recovery$indy$4(7307222016537470539L, var1);
      if (this.field_47 != null && ClientGlobals.field_48.field_48Q.field_45z == null) {
         boolean var10000 = recovery$indy$5(var3, 7307859679364081495L, var1);
         int[] var10001 = var5;
         if (var1 > 0L) {
            if (var5 == null) {
               if (var10000) {
                  return false;
               }

               var10000 = recovery$indy$6(field_43, 7307159196600992862L, var1);
            }

            var10001 = var5;
         }

         if (var1 >= 0L) {
            if (var10001 == null) {
               if (!var10000) {
                  return false;
               }

               var10000 = recovery$indy$7(field_43, 7308114433161735235L, var1).field_42;
            }

            var10001 = var5;
         }

         if (var10001 != null) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }

         var10000 = recovery$indy$8(this.settingNotWhileDigging, 7306910314871967459L, var1);
         if (var5 != null) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      }

      return false;
   }

   private static boolean method_48P$aae029aa0a() {
      long var0 = b ^ 98708106542555L;
      long var10001 = 266372807090677814L;
      BooleanSetting var2 = ClientGlobals.field_48.field_41Y.settingNoRotate;
      return var2.method_49$aae029aa0a();
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 0L;
      super.method_43y$e45a9973e5(var3);
      this.field_47 = null;
      this.field_49 = null;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 0L;
      int var6 = (int)((var4 ^ 0L) >>> 48);
      int var7 = (int)((var4 ^ 0L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      super.method_43x$c973149af1((short)var6, var7, (char)var8);
   }

   @Override
   public void method_487$da8c82d5d4() {
      boolean var73;
      net.C_47cu var75;
      long var5;
      long var7;
      long var9;
      int[] var18;
      AntiFireBall_47Oz var71;
      label115: {
         long var1 = b ^ 58326240180794L;
         long var3 = var1 ^ 92427154166573L;
         var5 = var1 ^ 39702344730670L;
         var7 = var1 ^ 28657421075362L;
         var9 = var1 ^ 84571805841607L;
         long var11 = var1 ^ 33052265380092L;
         long var13 = var1 ^ 89696859316058L;
         long var10001 = var1 ^ 138410340241604L;
         int var15 = (int)((var1 ^ 138410340241604L) >>> 48);
         int var16 = (int)((var1 ^ 138410340241604L) << 16 >>> 32);
         int var17 = (int)(var10001 << 48 >>> 48);
         this.field_49 = null;
         long var10000 = -4297524895032506497L;
         int[] var69 = AntiBot_47CG.method_40$d4d28024c9();
         this.field_47 = null;
         var18 = var69;
         long var10002 = -4297054973203097395L;
         Minecraft var21 = field_43;
         this.field_49 = var21.field_44Q.field_44Q.stream().filter(recovery$indy$9(this)).sorted(Comparator.comparingDouble(recovery$indy$10())).toArray();
         int var70 = this.field_49.length;
         if (var18 == null) {
            if (var70 > 0) {
               this.field_47 = (Entity)this.field_49[0];
            }

            var71 = this;
            if (var18 != null) {
               break label115;
            }

            var10001 = -4300035622505713705L;
            BooleanSetting var22 = this.settingNoRotate;
            var70 = (int) ((var22.method_49$aae029aa0a()) ? 1 : 0);
         }

         if (var70 == 0) {
            var10002 = -4297204096211248117L;
            long var23 = var13;
            AntiFireBall_47Oz var25 = this;
            boolean var72 = var25.method_48F$0dd78e0064(var23);
            if (var18 == null) {
               if (!var72) {
                  return;
               }

               var10001 = -4296763910407272861L;
               var72 = C_474i.method_45$0dd78e0064(var3);
            }

            if (var72 || ClientGlobals.field_48.field_48Q.field_45z != null) {
               return;
            }

            long var10003 = -4297211832987466005L;
            long var26 = var11;
            Entity var28 = this.field_47;
            AntiFireBall_47Oz var29 = this;
            C_477r var19 = var29.method_46$80c8327c2b(var28, var26);
            char var92 = (char)var15;
            long var10007 = -4297134700596746841L;
            AntiFireBall_47Oz var30 = this;
            int var31 = var17;
            int var32 = var16;
            char var33 = var92;
            byte var34 = -1;
            C_477r var35 = var19;
            C_47S6 var36 = ClientGlobals.field_46;
            var36.method_45$c163d5afc8(var35, var34, var33, var32, var31, var30);
            if (var18 == null) {
               return;
            }
         }

         var71 = this;
      }

      if (var71.field_47 != null) {
         long var78 = -4296492255779025545L;
         Minecraft var37 = field_43;
         var73 = var37.field_44K.field_42;
         label92:
         if (var18 == null) {
            if (var37.field_44K.field_42) {
               var78 = -4300035622505713705L;
               BooleanSetting var38 = this.settingNotWhileDigging;
               var73 = var38.method_49$aae029aa0a();
               if (var18 != null) {
                  break label92;
               }

               if (var73) {
                  return;
               }
            }

            var78 = -4297464531817323158L;
            Minecraft var39 = field_43;
            var73 = var39.method_44$aae029aa0a();
         }

         if (var18 == null) {
            if (!var73) {
               return;
            }

            var78 = -4296889800748054291L;
            Minecraft var40 = field_43;
            var73 = var40.field_42P.method_48$7c2c45e4ce(this.field_47);
         }

         double var74;
         if (var73) {
            long var89 = -4299987834817629310L;
            long var41 = var5;
            NumberSetting var43 = this.settingRange;
            var74 = var43.method_44$474dfaa627(var41);
         } else {
            long var93 = -4299987834817629310L;
            long var44 = var5;
            NumberSetting var46 = this.settingRange;
            var74 = Math.min(3.0, var46.method_44$474dfaa627(var44));
         }

         double var68 = var74;
         var78 = -4296889800748054291L;
         Minecraft var47 = field_43;
         if (var47.field_42P.method_44$ee256e8a75(this.field_47) < var68) {
            label76: {
               var75 = this.field_48;
               long var94 = -4299987834817629310L;
               long var48 = var5;
               NumberSetting var50 = this.settingDelay;
               double var83 = var50.method_44$474dfaa627(var48);
               double var90 = 0.0;
               if (var18 == null) {
                  if (var83 == 0.0) {
                     var78 = 0L;
                     break label76;
                  }

                  var94 = -4299987834817629310L;
                  long var51 = var5;
                  NumberSetting var53 = this.settingDelay;
                  var83 = var53.method_44$474dfaa627(var51);
                  long var10006 = -4297347514376057883L;
                  long var54 = var9;
                  byte var56 = 60;
                  byte var57 = 0;
                  C_47MO var58 = C_476q.field_48;
                  var90 = var58.method_43$75dd719903(var57, var56, var54);
               }

               var78 = (long)(var83 + var90);
            }

            long var96 = -4296637079904388319L;
            long var59 = var7;
            long var61 = var78;
            C_47cu var63 = var75;
            if (var63.method_42$b0e346e6e3(var61, var59)) {
               var78 = -4296889800748054291L;
               Minecraft var64 = field_43;
               var64.field_42P.method_46i$da8c82d5d4();
               var78 = -4296492255779025545L;
               Minecraft var65 = field_43;
               long var91 = -4296889800748054291L;
               Minecraft var66 = field_43;
               var65.field_44K.method_43$8cfdf5ae53(var66.field_42P, this.field_47);
               var78 = -4296789045001131320L;
               C_47cu var67 = this.field_48;
               var67.method_46$da8c82d5d4();
            }
         }
      }
   }

   private static boolean method_488$aae029aa0a() {
      long var0 = b ^ 46858986582472L;
      long var10000 = -8093530988466090867L;
      int[] var2 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = -8097142343885839323L;
      BooleanSetting var3 = ClientGlobals.field_48.field_41Y.settingNoRotate;
      boolean var4 = var3.method_49$aae029aa0a();
      if (var2 == null) {
         var4 = !var4;
      }

      return var4;
   }

   public AntiFireBall_47Oz(long var1) {
      super("AntiFireBall", ((b ^ var1) ^ 62068919999457L), "GegenFeuerbälle", new Color(232, 147, 0), Category.COMBAT);
      var1 = b ^ var1;
      long var3 = var1 ^ 62068919999457L;
      long var5 = var1 ^ 33404288227731L;
      long var7 = var1 ^ 56323025135124L;
      // Super arguments moved to the required Java constructor position.
      this.settingNoRotate = new BooleanSetting(this, var5, "NoRotate", true);
      NumberSetting var10001 = new NumberSetting(this, "PreAimRange", 4.0, var7, 0.0, 15.0, 1);
      C_45n var10002 = recovery$indy$11();
      long var10003 = 880738646498252356L;
      C_45n var9 = var10002;
      NumberSetting var10 = var10001;
      this.settingPreAimRange = var10.method_43$9db6d416f4(var9);
      this.settingDelay = new NumberSetting(this, "Delay", 60.0, var7, 0.0, 400.0, 0);
      var10001 = new NumberSetting(this, "Range", 4.0, var7, 0.0, 6.0, 2);
      var10002 = recovery$indy$12();
      var10003 = 880738646498252356L;
      C_45n var11 = var10002;
      NumberSetting var12 = var10001;
      this.settingRange = var12.method_43$9db6d416f4(var11);
      this.settingSlowDown = new BooleanSetting(this, var5, "SlowDown", true);
      this.settingTicksExisted = new NumberSetting(this, "TicksExisted", 10.0, var7, 0.0, 20.0, 0);
      this.settingNotWhileDigging = new BooleanSetting(this, var5, "NotWhileDigging", false);
      this.field_48 = new C_47cu();
   }

   // Retained obfuscator initialization is restored after javac.
   static { f = null; g = null; }

   private static native String c(int var0, long var1);

   private static native String c(byte[] var0);

   private static native Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Method c(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field c(Class var0, String var1, Class var2);

   private static native MethodHandle recovery$constant$0();

   private static native Runnable recovery$indy$1();

   private static native void recovery$indy$2(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$3(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$4(long var0, long var2);

   private static native boolean recovery$indy$5(long var0, long var2, long var4);

   private static native boolean recovery$indy$6(Object var0, long var1, long var3);

   private static native C_40g recovery$indy$7(Object var0, long var1, long var3);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3);

   private static native Predicate recovery$indy$9(AntiFireBall_47Oz var0);

   private static native ToDoubleFunction recovery$indy$10();

   private static native C_45n recovery$indy$11();

   private static native C_45n recovery$indy$12();

   private static native MethodHandle recovery$constant$13();
}
