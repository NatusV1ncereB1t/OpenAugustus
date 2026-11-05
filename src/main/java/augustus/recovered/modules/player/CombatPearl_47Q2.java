package augustus.recovered.modules.player;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
import net.C_42R;
import net.C_43r;
import net.C_475c;
import net.C_477r;
import net.C_477z;
import net.C_478i;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Bn;
import net.C_47F9;
import net.C_47Ij;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47S6;
import client.setting.NumberSetting;
import net.C_47UH;
import net.minecraft.entity.EntityLivingBase;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47si;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47xz;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class CombatPearl_47Q2 extends client.module.Module implements net.C_47xz,net.C_47si,net.C_47oO,net.C_48T,net.C_47UH {
    private final client.setting.NumberSetting settingMinDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_41; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_477r field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47Bn field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private static boolean method_46$7c2c45e4ce(Entity var0) {
      long var1 = a ^ 24545641887930L;
      long var10000 = 6740824814714268928L;
      boolean var3 = AirStuck_47Q4.method_45$aae029aa0a();
      int var4 = (int) ((var0 instanceof C_47Bn) ? 1 : 0);
      if (var3) {
         if (var4 == 0) {
            return false;
         }

         var4 = var0.field_48y;
      }

      return (boolean)(!var3 ? var4 : var4 == 0);
   }



    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

   private C_47Bn method_42$67b10bbfa4(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$1(-862863272331443062L, var1);
      Object var10000 = this.field_41;
      if (var3) {
         if (this.field_41 == null) {
            return null;
         }

         var10000 = recovery$indy$2(field_43, -863311727189137870L, var1)
            .field_44Q
            .stream()
            .filter(recovery$indy$3())
            .min(Comparator.comparingDouble(recovery$indy$4(this)))
            .orElse(null);
      }

      return (C_47Bn)var10000;
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$fae8de1664(C_475c var1) {
      long var2 = a ^ 16976101049789L;
      long var10000 = -6878367351921422329L;
      boolean var4 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10001 = -6878982434594574583L;
      Minecraft var5 = field_43;
      if (var5.method_44$aae029aa0a()) {
         CombatPearl_47Q2 var9 = this;
         if (var4) {
            if (this.field_44 == null) {
               return;
            }

            var9 = this;
         }

         if (var4) {
            if (var9.field_42 <= 2) {
               return;
            }

            long var10002 = -6877509629807202816L;
            byte var6 = 1;
            C_475c var7 = var1;
            var7.method_48$d00df7729d(var6);
            var9 = this;
         }

         var10001 = -6877468650365192809L;
         CombatPearl_47Q2 var8 = var9;
         var8.method_49$da8c82d5d4();
      }
   }



   public void method_41$426c33b229(C_477z var1, long var2) {
      Entity var4 = recovery$indy$5(var1, 8133698222490266222L, var2);
      if (var4 instanceof EntityLivingBase) {
         this.field_41 = (EntityLivingBase)var4;
      }
   }



    private net.C_477r method_44$2841a7d4cb(final net.C_47tf c_47tf, long n) {
        final long n2;
        n = (n2 = (CombatPearl_47Q2.a ^ n));
        final long n3 = n2 ^ 0x5810CEF4B069L;
        final long n4 = n2 ^ 0x4C8689F65DC5L;
        final int n5 = (int)(n4 >>> 48);
        final long n6 = n4 << 16 >>> 16;
        final long n7 = n2 ^ 0x4470DD5742E1L;
        final long n8 = n2 ^ 0x7F016844B1A2L;
        float n9 = 0.0f;
        final boolean recovery$indy$flow$34 = recovery$indy$flow$34(1221543314070231971L, n);
        float n10 = 0.0f;
        final boolean b = recovery$indy$flow$34;
        final double[] array = (double[])recovery$indy$flow$37(recovery$indy$flow$36(CombatPearl_47Q2.field_43, 1220652185034234354L, n), n7, 0, 1222420384610228448L, n);
        final double x = c_47tf.field_40 - array[0];
        final double n11 = c_47tf.field_41 - (array[1] + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$41(CombatPearl_47Q2.field_43, 1220652185034234354L, n)).method_41$bc607678b6());
        final double y = c_47tf.field_47 - array[2];
        final float n12 = (float)Math.toDegrees(Math.atan2(y, x)) - 90.0f;
        final float n13 = (float)(-(net.C_47sk.method_49$eb37070982(n11, net.C_47sk.method_42$44b37c2d95(x * x + y * y)) * 180.0 / 3.141592653589793));
        final float recovery$indy$flow$35 = recovery$indy$flow$51(((net.C_477r)recovery$indy$flow$49(client.ClientGlobals.field_46, 1220977468475125770L, n)).field_44, n12, 180.0f, n3, 1221827947226852418L, n);
        float n14 = 0.0f;
        if (n14 >= 60.0f) {
            return new net.C_477r(n9, n10);
        }
        int n15 = 0;
        int n16 = -1;
        float n17 = recovery$indy$flow$55(((net.C_477r)recovery$indy$flow$53(client.ClientGlobals.field_46, 1220977468475125770L, n)).field_41, n13 + n14 * n16, 180.0f, n3, 1221827947226852418L, n);
        final net.C_47Kr c_47Kr = new net.C_47Kr();
        recovery$indy$flow$63(c_47Kr, (char)n5, recovery$indy$flow$59(CombatPearl_47Q2.field_43, 1220652185034234354L, n), new net.C_47rf(net.C_42R.field_47k), recovery$indy$flow$35, n17, n6, array[0], array[1], array[2], 1222265751256825854L, n);
        int n18;
        final int i = n18 = recovery$indy$flow$73(c_47Kr, 200, this.field_41, new net.C_478i(c_47tf.field_40 - 0.5, c_47tf.field_41 - 1.0, c_47tf.field_47 - 0.5, c_47tf.field_40 + 0.5, c_47tf.field_41 + 1.0, c_47tf.field_47 + 0.5), n8, 1220556012923990158L, n);
        if (n < 0L) {
            while (i == 0) {
                if (n14 >= 60.0f) {
                    return new net.C_477r(n9, n10);
                }
                final float recovery$indy$flow$36 = recovery$indy$flow$55(((net.C_477r)recovery$indy$flow$53(client.ClientGlobals.field_46, 1220977468475125770L, n)).field_41, n13 + n14 * -1, 180.0f, n3, 1221827947226852418L, n);
                final net.C_47Kr c_47Kr2 = new net.C_47Kr();
                recovery$indy$flow$63(c_47Kr2, (char)n5, recovery$indy$flow$59(CombatPearl_47Q2.field_43, 1220652185034234354L, n), new net.C_47rf(net.C_42R.field_47k), recovery$indy$flow$35, recovery$indy$flow$36, n6, array[0], array[1], array[2], 1222265751256825854L, n);
                recovery$indy$flow$73(c_47Kr2, 200, this.field_41, new net.C_478i(c_47tf.field_40 - 0.5, c_47tf.field_41 - 1.0, c_47tf.field_47 - 0.5, c_47tf.field_40 + 0.5, c_47tf.field_41 + 1.0, c_47tf.field_47 + 0.5), n8, 1220556012923990158L, n);
            }
            return new net.C_477r(n9, n10);
        }
        if (!b) {
            while (true) {
                if (n18 != Integer.MAX_VALUE) {
                    n15 = 1;
                    n9 = recovery$indy$flow$35;
                    n10 = n17;
                    if (!b) {
                        break;
                    }
                }
                n16 += 2;
                if (n16 >= 2) {
                    break;
                }
                n17 = recovery$indy$flow$55(((net.C_477r)recovery$indy$flow$53(client.ClientGlobals.field_46, 1220977468475125770L, n)).field_41, n13 + n14 * n16, 180.0f, n3, 1221827947226852418L, n);
                final net.C_47Kr c_47Kr3 = new net.C_47Kr();
                recovery$indy$flow$63(c_47Kr3, (char)n5, recovery$indy$flow$59(CombatPearl_47Q2.field_43, 1220652185034234354L, n), new net.C_47rf(net.C_42R.field_47k), recovery$indy$flow$35, n17, n6, array[0], array[1], array[2], 1222265751256825854L, n);
                n18 = recovery$indy$flow$73(c_47Kr3, 200, this.field_41, new net.C_478i(c_47tf.field_40 - 0.5, c_47tf.field_41 - 1.0, c_47tf.field_47 - 0.5, c_47tf.field_40 + 0.5, c_47tf.field_41 + 1.0, c_47tf.field_47 + 0.5), n8, 1220556012923990158L, n);
            }
            int k;
            int j = k = n15;
            if (n > 0L) {
                while (j == 0) {
                    n14 += 0.2f;
                    if (!b) {
                        if (n14 < 60.0f) {
                            int n19 = 0;
                            for (int l = -1; l < 2; l += 2) {
                                final float recovery$indy$flow$37 = recovery$indy$flow$55(((net.C_477r)recovery$indy$flow$53(client.ClientGlobals.field_46, 1220977468475125770L, n)).field_41, n13 + n14 * l, 180.0f, n3, 1221827947226852418L, n);
                                final net.C_47Kr c_47Kr4 = new net.C_47Kr();
                                recovery$indy$flow$63(c_47Kr4, (char)n5, recovery$indy$flow$59(CombatPearl_47Q2.field_43, 1220652185034234354L, n), new net.C_47rf(net.C_42R.field_47k), recovery$indy$flow$35, recovery$indy$flow$37, n6, array[0], array[1], array[2], 1222265751256825854L, n);
                                if (recovery$indy$flow$73(c_47Kr4, 200, this.field_41, new net.C_478i(c_47tf.field_40 - 0.5, c_47tf.field_41 - 1.0, c_47tf.field_47 - 0.5, c_47tf.field_40 + 0.5, c_47tf.field_41 + 1.0, c_47tf.field_47 + 0.5), n8, 1220556012923990158L, n) != Integer.MAX_VALUE) {
                                    n19 = 1;
                                    n9 = recovery$indy$flow$35;
                                    n10 = recovery$indy$flow$37;
                                    if (!b) {
                                        break;
                                    }
                                }
                            }
                            j = n19;
                            continue;
                        }
                    }
                    return new net.C_477r(n9, n10);
                }
                return new net.C_477r(n9, n10);
            }
            while (k == 0) {
                if (n14 >= 60.0f) {
                    return new net.C_477r(n9, n10);
                }
                int n20 = 0;
                for (int n21 = -1; n21 < 2; n21 += 2) {
                    final float recovery$indy$flow$38 = recovery$indy$flow$55(((net.C_477r)recovery$indy$flow$53(client.ClientGlobals.field_46, 1220977468475125770L, n)).field_41, n13 + n14 * n21, 180.0f, n3, 1221827947226852418L, n);
                    final net.C_47Kr c_47Kr5 = new net.C_47Kr();
                    recovery$indy$flow$63(c_47Kr5, (char)n5, recovery$indy$flow$59(CombatPearl_47Q2.field_43, 1220652185034234354L, n), new net.C_47rf(net.C_42R.field_47k), recovery$indy$flow$35, recovery$indy$flow$38, n6, array[0], array[1], array[2], 1222265751256825854L, n);
                    if (recovery$indy$flow$73(c_47Kr5, 200, this.field_41, new net.C_478i(c_47tf.field_40 - 0.5, c_47tf.field_41 - 1.0, c_47tf.field_47 - 0.5, c_47tf.field_40 + 0.5, c_47tf.field_41 + 1.0, c_47tf.field_47 + 0.5), n8, 1220556012923990158L, n) != Integer.MAX_VALUE) {
                        n20 = 1;
                        n9 = recovery$indy$flow$35;
                        n10 = recovery$indy$flow$38;
                        if (!b) {
                            break;
                        }
                    }
                }
                k = n20;
            }
            return new net.C_477r(n9, n10);
        }
        else {
            final int n22 = i;
            float n23 = recovery$indy$flow$35;
            float n24 = n17;
            if (b) {}
            int n26;
            int n25 = n26 = n22;
            if (n > 0L) {
                while (n25 == 0) {
                    n14 += 0.2f;
                    if (!b) {
                        if (n14 < 60.0f) {
                            final float recovery$indy$flow$39 = recovery$indy$flow$55(((net.C_477r)recovery$indy$flow$53(client.ClientGlobals.field_46, 1220977468475125770L, n)).field_41, n13 + n14 * -1, 180.0f, n3, 1221827947226852418L, n);
                            final net.C_47Kr c_47Kr6 = new net.C_47Kr();
                            recovery$indy$flow$63(c_47Kr6, (char)n5, recovery$indy$flow$59(CombatPearl_47Q2.field_43, 1220652185034234354L, n), new net.C_47rf(net.C_42R.field_47k), recovery$indy$flow$35, recovery$indy$flow$39, n6, array[0], array[1], array[2], 1222265751256825854L, n);
                            final int recovery$indy$flow$40 = recovery$indy$flow$73(c_47Kr6, 200, this.field_41, new net.C_478i(c_47tf.field_40 - 0.5, c_47tf.field_41 - 1.0, c_47tf.field_47 - 0.5, c_47tf.field_40 + 0.5, c_47tf.field_41 + 1.0, c_47tf.field_47 + 0.5), n8, 1220556012923990158L, n);
                            n23 = recovery$indy$flow$35;
                            n24 = recovery$indy$flow$39;
                            if (b) {}
                            n25 = recovery$indy$flow$40;
                            continue;
                        }
                    }
                    return new net.C_477r(n23, n24);
                }
                return new net.C_477r(n23, n24);
            }
            while (n26 == 0) {
                if (n14 >= 60.0f) {
                    return new net.C_477r(n23, n24);
                }
                final float recovery$indy$flow$41 = recovery$indy$flow$55(((net.C_477r)recovery$indy$flow$53(client.ClientGlobals.field_46, 1220977468475125770L, n)).field_41, n13 + n14 * -1, 180.0f, n3, 1221827947226852418L, n);
                final net.C_47Kr c_47Kr7 = new net.C_47Kr();
                recovery$indy$flow$63(c_47Kr7, (char)n5, recovery$indy$flow$59(CombatPearl_47Q2.field_43, 1220652185034234354L, n), new net.C_47rf(net.C_42R.field_47k), recovery$indy$flow$35, recovery$indy$flow$41, n6, array[0], array[1], array[2], 1222265751256825854L, n);
                final int recovery$indy$flow$42 = recovery$indy$flow$73(c_47Kr7, 200, this.field_41, new net.C_478i(c_47tf.field_40 - 0.5, c_47tf.field_41 - 1.0, c_47tf.field_47 - 0.5, c_47tf.field_40 + 0.5, c_47tf.field_41 + 1.0, c_47tf.field_47 + 0.5), n8, 1220556012923990158L, n);
                n23 = recovery$indy$flow$35;
                n24 = recovery$indy$flow$41;
                if (b) {}
                n26 = recovery$indy$flow$42;
            }
            return new net.C_477r(n23, n24);
        }
    }





   private double method_44$83ff7736af(Entity var1) {
      return this.field_41.method_40$ee256e8a75(var1);
   }



   private int method_49$aaa48d6f8b(int var1, char var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 127181650971601L;
      boolean var8 = recovery$indy$17(-8105775789937164530L, var4);
      ArrayList var9 = recovery$indy$19(
         recovery$indy$18(field_43, -8106320585610000766L, var4).field_429, var6, 36, new C_43r[]{C_42R.field_47k}, -8105454855648379099L, var4
      );
      int var10000 = (int) ((var9.isEmpty()) ? 1 : 0);
      if (var8) {
         if (var10000 != 0) {
            return -1;
         }

         var10000 = (Integer)var9.get(0) - 36;
      }

      return var10000;
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_41 = null;
   }



   private void method_49$da8c82d5d4() {
      this.field_44 = null;
      this.field_42 = 0;
      this.field_49 = null;
   }



   public void method_40G$e45a9973e5(long var1) {
      long var10001 = var1 ^ 6407505185672L;
      int var3 = (int)((var1 ^ 6407505185672L) >>> 32);
      int var4 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      byte var9 = (byte) ((recovery$indy$20(-3626010923716049155L, var1)) ? 1 : 0);
      if (recovery$indy$21(field_43, -3625530892928826834L, var1)) {
         CombatPearl_47Q2 var10000 = this;
         byte var10 = var9;
         if (var1 > 0L) {
            if (var9 == 0) {
               if (this.field_44 == null) {
                  return;
               }

               var10000 = this;
            }

            var10 = 0;
         }

         int var6 = this.field_43y;
         byte var7 = var10;
         CombatPearl_47Q2 var8 = var10000;
         recovery$indy$22(var3, var8, var7, (char)var4, (char)var5, var6, -3625549975946169970L, var1);
      }
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$23(this, 40, var3, -7101865769573630914L, var1);
      recovery$indy$24(this, 17, var3, -7101865769573630914L, var1);
      recovery$indy$25(this, 1, var3, -7101865769573630914L, var1);
      recovery$indy$26(this, 34, var3, -7101865769573630914L, var1);
      recovery$indy$27(this, 7, var3, -7101865769573630914L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_41 = null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      recovery$indy$28(this, 2730941004677738751L, var4);
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 3417670312301L;
      long var3 = var1 ^ 101738073068900L;
      long var10001 = var1 ^ 102490076212960L;
      int var5 = (int)((var1 ^ 102490076212960L) >>> 32);
      int var6 = (int)((var1 ^ 102490076212960L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 28885600225230L;
      long var10 = var1 ^ 7461715777555L;
      long var12 = var1 ^ 39702344730670L;
      long var14 = var1 ^ 17270656638515L;
      var10001 = var1 ^ 138410340241604L;
      int var16 = (int)((var1 ^ 138410340241604L) >>> 48);
      int var17 = (int)((var1 ^ 138410340241604L) << 16 >>> 32);
      int var18 = (int)(var10001 << 48 >>> 48);
      long var19 = var1 ^ 120840458301840L;
      boolean var21 = AirStuck_47Q4.method_419$aae029aa0a();
      char var10003 = (char)var6;
      char var27 = (char)var7;
      char var28 = var10003;
      int var29 = var5;
      CombatPearl_47Q2 var30 = this;
      this.field_43y = var30.method_49$aaa48d6f8b(var29, var28, var27);
      if (var21) {
         if (this.field_43y != 0) {
            long var72 = var3;
            CombatPearl_47Q2 var73 = this;
            net.C_47Bn var68 = var73.method_42$67b10bbfa4(var72);
            if (var68.field_48y == 3) {
               net.C_47Kr var70 = new net.C_47Kr();
               recovery$indy$flow$149(var70, var8, this.field_49, -4296501224278747723L, var1);
               java.util.ArrayList var75 = (java.util.ArrayList)recovery$indy$flow$150(var70, 300, var10, -4297058647510902459L, var1);
               net.C_47Ij var76 = (net.C_47Ij)recovery$indy$flow$151(var70, -4298029820293677965L, var1);
            } else {
               this.field_42++;
            }
         }
      } else if (this.field_43y < 0) {
         CombatPearl_47Q2 var31 = this;
         var31.method_49$da8c82d5d4();
      } else {
         net.minecraft.client.Minecraft var32 = field_43;
         if (var32.method_44$aae029aa0a()) {
            if (this.field_44 != null) {
               var10003 = (char)var16;
               CombatPearl_47Q2 var33 = this;
               int var34 = var18;
               int var35 = var17;
               char var36 = var10003;
               byte var37 = 0;
               net.C_477r var38 = this.field_44;
               net.C_47S6 var39 = client.ClientGlobals.field_46;
               var39.method_45$c163d5afc8(var38, var37, var36, var35, var34, var33);
               this.field_42++;
            } else {
               long var40 = var3;
               CombatPearl_47Q2 var42 = this;
               net.C_47Bn var22 = var42.method_42$67b10bbfa4(var40);
               if (var22 != null && this.field_49 == null) {
                  this.field_49 = var22;
               }

               if (this.field_49 != null) {
                  if (this.field_49.field_48y == 0) {
                     net.minecraft.client.Minecraft var43 = field_43;
                     double var23 = var43.field_42P.method_40$ee256e8a75(this.field_49);
                     double var25 = this.field_41.method_40$ee256e8a75(this.field_49);
                     if (var23 < var25) {
                        CombatPearl_47Q2 var44 = this;
                        var44.method_49$da8c82d5d4();
                        return;
                     }
                  }

                  if (this.field_49.field_48y == 3) {
                     net.C_47Kr var69 = new net.C_47Kr();
                     recovery$indy$flow$149(var69, var8, this.field_49, -4296501224278747723L, var1);
                     java.util.ArrayList var10000 = (java.util.ArrayList)recovery$indy$flow$150(var69, 300, var10, -4297058647510902459L, var1);
                     net.C_47Ij var24 = (net.C_47Ij)recovery$indy$flow$151(var69, -4298029820293677965L, var1);
                     if (var24 == null || var24.field_45 == null) {
                        CombatPearl_47Q2 var45 = this;
                        var45.method_49$da8c82d5d4();
                        return;
                     }

                     net.C_47tf var71 = var24.field_45;
                     net.minecraft.client.Minecraft var46 = field_43;
                     double var74 = var46.field_42P.method_49$4b58f7ab41(var71.field_40, var71.field_41, var71.field_47);
                     long var47 = var12;
                     client.setting.NumberSetting var49 = this.settingMinDistance;
                     if (var74 < var49.method_44$474dfaa627(var47)) {
                        CombatPearl_47Q2 var50 = this;
                        var50.method_49$da8c82d5d4();
                        return;
                     }

                     long var51 = var19;
                     net.C_47tf var53 = var24.field_45;
                     CombatPearl_47Q2 var54 = this;
                     net.C_477r var26 = var54.method_44$2841a7d4cb(var53, var51);
                     if (var26.field_44 == 0.0F && var26.field_41 == 0.0F) {
                        CombatPearl_47Q2 var55 = this;
                        var55.method_49$da8c82d5d4();
                        return;
                     }

                     net.C_47S6 var56 = client.ClientGlobals.field_46;
                     net.C_477r var57 = var56.method_44$4f8050086d();
                     net.C_477r var58 = var26;
                     long var59 = var14;
                     this.field_44 = net.C_47gg.method_49$c311864491(var59, var58, var57);
                  }

                  if (this.field_44 != null) {
                     var10003 = (char)var16;
                     CombatPearl_47Q2 var61 = this;
                     int var62 = var18;
                     int var63 = var17;
                     char var64 = var10003;
                     byte var65 = 0;
                     net.C_477r var66 = this.field_44;
                     net.C_47S6 var67 = client.ClientGlobals.field_46;
                     var67.method_45$c163d5afc8(var66, var65, var64, var63, var62, var61);
                     this.field_42++;
                  }
               }
            }
         }
      }
   }







    public CombatPearl_47Q2(long a0) {
        super((java.lang.String) ("CombatPearl"),(java.lang.String) ("CombatPearl"),(long) (((augustus.recovered.modules.player.CombatPearl_47Q2.a ^ a0) ^ 17271678404525L)),(java.awt.Color) (new java.awt.Color((int) (238),(int) (255),(int) (194))),(client.module.Category) (client.module.Category.PLAYER));
        long settingKey = (augustus.recovered.modules.player.CombatPearl_47Q2.a ^ a0) ^ 92126255473713L;
        client.setting.NumberSetting setting = new client.setting.NumberSetting(this, "MinDistance", 10.0D, settingKey, 0.0D, 20.0D, 0);
        recovery$indy$flow$194(this, setting);
        recovery$indy$flow$195(this, null);
        recovery$indy$flow$196(this, 0);
        recovery$indy$flow$197(this, null);
    }



    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native boolean recovery$indy$flow$34(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$36(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$37(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$41(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$49(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$51(float a0,float a1,float a2,long a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$53(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$55(float a0,float a1,float a2,long a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$59(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$63(java.lang.Object a0,char a1,java.lang.Object a2,java.lang.Object a3,float a4,float a5,long a6,double a7,double a8,double a9,long a10,long a11);
    private static native int recovery$indy$flow$73(java.lang.Object a0,int a1,java.lang.Object a2,java.lang.Object a3,long a4,long a5,long a6);
    private static native void recovery$indy$flow$149(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$150(java.lang.Object a0,int a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$151(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$194(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$195(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.CombatPearl_47Q2) (a0)).field_44 = ((net.C_477r) (a1));
        return;
    }
    private static void recovery$indy$flow$196(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.CombatPearl_47Q2) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$197(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.CombatPearl_47Q2) (a0)).field_49 = ((net.C_47Bn) (a1));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native WorldClient recovery$indy$2(Object var0, long var1, long var3);
   private static native Predicate recovery$indy$3();
   private static native ToDoubleFunction recovery$indy$4(CombatPearl_47Q2 var0);
   private static native Entity recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$17(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native ArrayList recovery$indy$19(Object var0, long var1, int var3, Object var4, long var5, long var7);
   private static native boolean recovery$indy$20(long var0, long var2);
   private static native boolean recovery$indy$21(Object var0, long var1, long var3);
   private static native void recovery$indy$22(int var0, Object var1, int var2, char var3, char var4, int var5, long var6, long var8);
   private static native void recovery$indy$23(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$24(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$25(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$26(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$27(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$28(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$32();
}
