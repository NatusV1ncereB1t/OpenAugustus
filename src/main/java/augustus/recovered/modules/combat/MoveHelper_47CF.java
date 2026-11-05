package augustus.recovered.modules.combat;
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
import net.C_407;
import net.C_45n;
import net.C_472n;
import net.C_473X;
import net.C_477z;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.C_47Ij;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import net.C_47Wq;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.C_47hi;
import net.C_47mK;
import net.C_47oO;
import net.C_47si;
import client.module.Category;
import net.C_47tf;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class MoveHelper_47CF extends client.module.Module implements net.C_47oO,net.C_47hi,net.C_47si,net.C_47xz,net.C_47mK {
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingModes = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingCombos = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_41 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

   private void method_42$6724e66524(long var1, C_472n var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 116979027295026L;
      int[] var6 = recovery$indy$1(8593289904641022238L, var1);
      double var8;
      int var10000 = (var8 = this.field_42 - recovery$indy$2(this.settingCombos, var4, 8593145309146494657L, var1)) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
      if (var6 == null) {
         if (var10000 <= 0) {
            return;
         }

         var10000 = recovery$indy$3(field_43, 8594662188840327825L, var1).field_432;
      }

      if (var6 == null) {
         if (var10000 != 9) {
            return;
         }

         var10000 = (int) ((recovery$indy$4(field_43, 8594662188840327825L, var1).field_48M) ? 1 : 0);
      }

      if (var10000 != 0) {
         recovery$indy$5(var3, true, 8593858894390168797L, var1);
         this.field_42 = 0;
      }
   }



   private EntityLivingBase method_42$f2b0beb8fc(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 61704345212754L;
      int[] var5 = recovery$indy$6(-868328847075140180L, var1);
      Object var6 = null;
      C_47Ij var10000 = recovery$indy$7(field_43, -867186098465209900L, var1);
      if (var5 == null) {
         if (var10000 == null) {
            return recovery$indy$11(var6, var3, -869151349411531972L, var1);
         }

         var10000 = recovery$indy$8(field_43, -867186098465209900L, var1);
      }

      if (var5 == null) {
         if (var10000.field_49 != C_47Az.ENTITY) {
            return recovery$indy$11(var6, var3, -869151349411531972L, var1);
         }

         var10000 = recovery$indy$9(field_43, -867186098465209900L, var1);
      }

      Entity var8 = var10000.field_47;
      if (var5 == null) {
         if (!(var10000.field_47 instanceof EntityLivingBase)) {
            return recovery$indy$11(var6, var3, -869151349411531972L, var1);
         }

         var8 = recovery$indy$10(field_43, -867186098465209900L, var1).field_47;
      }

      var6 = (EntityLivingBase)var8;
      return recovery$indy$11(var6, var3, -869151349411531972L, var1);
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$426c33b229(C_477z var1, long var2) {
      if (recovery$indy$12(var1, 8134592189740962134L, var2) instanceof EntityLivingBase) {
         this.field_45 = (EntityLivingBase)recovery$indy$13(var1, 8134592189740962134L, var2);
      }
   }



    private void method_40$e45a9973e5(long callerKey) {
        long key = recovery$indy$flow$35() ^ callerKey;
        long pointKey = key ^ 63763721343431L;
        char pointUpper = (char) (pointKey >>> 48);
        short pointMiddle = (short) ((pointKey << 16) >>> 48);
        int pointLower = (int) ((pointKey << 32) >>> 32);
        long predictionKey = key ^ 28208175809572L;
        int predictionUpper = (int) (predictionKey >>> 32);
        char predictionMiddle = (char) ((predictionKey << 32) >>> 48);
        int predictionLower = (int) ((predictionKey << 48) >>> 48);
        long targetKey = key ^ 109648359290035L;
        long playerKey = key ^ 71418942943287L;
        Object guard = recovery$indy$flow$36(5223694561700947489L, key);
        if (guard != null) {
            recovery$indy$flow$48(this, false);
            return;
        }
        boolean ready = ((java.lang.Object)(((augustus.recovered.modules.combat.MoveHelper_47CF) (((java.lang.Object)(this)))).field_48)) != null;
        if (ready) ready = recovery$indy$flow$39(recovery$indy$flow$38(), 5222322469700380078L, key) != null;
        if (ready) ready = recovery$indy$flow$42(recovery$indy$flow$41(recovery$indy$flow$40(), 5222322469700380078L, key)) != null;
        if (ready) ready = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.combat.MoveHelper_47CF) (((java.lang.Object)(this)))).field_48)))))).field_47N)) != null;
        if (ready) ready = recovery$indy$flow$47(recovery$indy$flow$46(recovery$indy$flow$45(), 5222322469700380078L, key)) >= 10;
        if (!ready) {
            recovery$indy$flow$48(this, false);
            return;
        }
        Object targetPoint = recovery$indy$flow$50(((java.lang.Object)(((augustus.recovered.modules.combat.MoveHelper_47CF) (((java.lang.Object)(this)))).field_48)), pointUpper, pointMiddle, pointLower, 5223332776182278607L, key);
        Object playerPoint = recovery$indy$flow$53(recovery$indy$flow$52(recovery$indy$flow$51(), 5222322469700380078L, key), 1.0F);
        double currentDistance = recovery$indy$flow$54(playerPoint, targetPoint);
        Object player = recovery$indy$flow$56(recovery$indy$flow$55(), 5222322469700380078L, key);
        double[] playerPosition = (double[]) recovery$indy$flow$57(0, playerKey, player, 5223043201170884842L, key);
        double[] targetPosition = (double[]) recovery$indy$flow$59(targetKey, ((java.lang.Object)(((augustus.recovered.modules.combat.MoveHelper_47CF) (((java.lang.Object)(this)))).field_48)), 5223076581694236817L, key);
        net.C_47tf raisedPosition = new net.C_47tf(playerPosition[0], playerPosition[1] + (double) recovery$indy$flow$62(((java.lang.Object)(((augustus.recovered.modules.combat.MoveHelper_47CF) (((java.lang.Object)(this)))).field_48))), playerPosition[2]);
        Object predictionTarget = ((java.lang.Object)(((augustus.recovered.modules.combat.MoveHelper_47CF) (((java.lang.Object)(this)))).field_48));
        Object predictedPoint = recovery$indy$flow$65(predictionUpper, raisedPosition, predictionTarget, predictionMiddle, targetPosition[0], targetPosition[1], targetPosition[2], predictionLower, 5222051109191255376L, key);
        double predictedDistance = recovery$indy$flow$66(raisedPosition, predictedPoint);
        Object currentPlayerPoint = recovery$indy$flow$69(recovery$indy$flow$68(recovery$indy$flow$67(), 5222322469700380078L, key), 1.0F);
        Object nextPredictionTarget = ((java.lang.Object)(((augustus.recovered.modules.combat.MoveHelper_47CF) (((java.lang.Object)(this)))).field_48));
        Object nextPredictedPoint = recovery$indy$flow$71(predictionUpper, currentPlayerPoint, nextPredictionTarget, predictionMiddle, targetPosition[0], targetPosition[1], targetPosition[2], predictionLower, 5222051109191255376L, key);
        Object comparisonPlayerPoint = recovery$indy$flow$74(recovery$indy$flow$73(recovery$indy$flow$72(), 5222322469700380078L, key), 1.0F);
        double predictionMovement = recovery$indy$flow$75(nextPredictedPoint, comparisonPlayerPoint);
        Object latestPlayerPoint = recovery$indy$flow$78(recovery$indy$flow$77(recovery$indy$flow$76(), 5222322469700380078L, key), 1.0F);
        double targetMovement = recovery$indy$flow$79(latestPlayerPoint, targetPoint);
        int targetState = recovery$indy$flow$81(((java.lang.Object)(((augustus.recovered.modules.combat.MoveHelper_47CF) (((java.lang.Object)(this)))).field_48)));
        int previousTargetState = recovery$indy$flow$83(((java.lang.Object)(((augustus.recovered.modules.combat.MoveHelper_47CF) (((java.lang.Object)(this)))).field_48)));
        boolean countStable;
        if (key > 0L) {
            countStable = false;
            if (targetState == previousTargetState) {
                int playerState = recovery$indy$flow$86(recovery$indy$flow$85(recovery$indy$flow$84(), 5222322469700380078L, key));
                int previousPlayerState = recovery$indy$flow$89(recovery$indy$flow$88(recovery$indy$flow$87(), 5222322469700380078L, key));
                countStable = playerState == previousPlayerState;
                if (!countStable && predictedDistance < 2.9D && currentDistance < 3.0D) {
                    countStable = recovery$indy$flow$92(recovery$indy$flow$91(recovery$indy$flow$90(), 5222322469700380078L, key)) > 8;
                }
            }
        } else {
            countStable = targetState == previousTargetState;
            if (!countStable && predictedDistance < 2.9D) countStable = recovery$indy$flow$92(recovery$indy$flow$91(recovery$indy$flow$90(), 5222322469700380078L, key)) > 8;
        }
        recovery$indy$flow$94(this, countStable ? recovery$indy$flow$93(this) + 1 : 0);
        recovery$indy$flow$96(this, recovery$indy$flow$95(this));
        boolean active = false;
        if (key > 0L && targetMovement > predictionMovement && predictedDistance < 2.9D && currentDistance > 2.0D) active = recovery$indy$flow$97(this) > 3;
        recovery$indy$flow$98(this, active);
    }






   public void method_44$c3e139a72f(C_407 var1, long var2) {
      augustus.recovered.modules.combat.MoveHelper_47CF var10;
      augustus.recovered.modules.combat.MoveHelper_47CF var12;
      int var4;
      int var5;
      int var6;
      long var7;
      int[] var9;
      label214: {
         long var10001 = var2 ^ 78704420995556L;
         var4 = (int)((var2 ^ 78704420995556L) >>> 48);
         var5 = (int)((var2 ^ 78704420995556L) << 16 >>> 32);
         var6 = (int)(var10001 << 48 >>> 48);
         var7 = var2 ^ 50668263188801L;
         var9 = recovery$indy$31(-5855236033957936927L, var2);
         boolean var10000 = recovery$indy$34(
            (short)var4,
            var5,
            recovery$indy$32(var1, -5855066178676277397L, var2),
            (char)var6,
            recovery$indy$33(field_43, -5856608318696078482L, var2).field_48Q,
            0.01,
            -5855947822119941572L,
            var2
         );
         if (var9 == null) {
            if (!var10000) {
               break label214;
            }

            var10000 = recovery$indy$37(
               (short)var4,
               var5,
               recovery$indy$35(var1, -5855120925025211875L, var2),
               (char)var6,
               recovery$indy$36(field_43, -5856608318696078482L, var2).field_48j,
               0.01,
               -5855947822119941572L,
               var2
            );
         }

         int[] var13 = var9;
         if (var2 > 0L) {
            if (var9 == null) {
               if (!var10000) {
                  break label214;
               }

               var10000 = recovery$indy$40(
                  (short)var4,
                  var5,
                  recovery$indy$38(var1, -5856150131703792448L, var2),
                  (char)var6,
                  recovery$indy$39(field_43, -5856608318696078482L, var2).field_42o,
                  0.01,
                  -5855947822119941572L,
                  var2
               );
            }

            var13 = var9;
         }

         if (var2 > 0L) {
            if (var13 == null) {
               if (!var10000) {
                  break label214;
               }

               var10000 = recovery$indy$41(var1, -5856850713202189689L, var2).equals(recovery$indy$42(1831, 2186460174243581173L ^ var2));
            }

            var13 = var9;
         }

         label191: {
            label190: {
               label189: {
                  label215: {
                     if (var2 >= 0L) {
                        if (var13 == null) {
                           if (var10000) {
                              break label215;
                           }

                           var10000 = recovery$indy$43(var1, -5856850713202189689L, var2).equals(recovery$indy$44(27308, 8867844129934942583L ^ var2));
                        }

                        var13 = var9;
                     }

                     if (var2 < 0L) {
                        break label191;
                     }

                     if (var13 != null) {
                        break label190;
                     }

                     if (!var10000) {
                        break label189;
                     }
                  }

                  recovery$indy$45(this.field_49, -5856578759495442043L, var2);
               }

               var10000 = recovery$indy$46(var1, -5856850713202189689L, var2).equals(recovery$indy$47(16584, 2169237916727741207L ^ var2));
            }

            var13 = var9;
         }

         label216: {
            if (var13 == null) {
               if (!var10000) {
                  return;
               }

               var10 = this;
               if (var9 != null) {
                  break label216;
               }

               var10000 = recovery$indy$48(this.field_49, 100L, var7, -5855285495215564469L, var2);
            }

            if (!var10000) {
               return;
            }

            var10 = this;
         }

         var10.field_42++;
         if (var9 == null) {
            return;
         }
      }

      if (this.field_48 != null) {
         boolean var11 = recovery$indy$50(
            (short)var4, var5, recovery$indy$49(var1, -5855066178676277397L, var2), (char)var6, this.field_48.field_43S, 0.7, -5855947822119941572L, var2
         );
         int[] var14 = var9;
         if (var2 >= 0L) {
            if (var9 == null) {
               if (!var11) {
                  return;
               }

               var11 = recovery$indy$52(
                  (short)var4, var5, recovery$indy$51(var1, -5855120925025211875L, var2), (char)var6, this.field_48.field_47B, 2.0, -5855947822119941572L, var2
               );
            }

            var14 = var9;
         }

         if (var2 >= 0L) {
            if (var14 == null) {
               if (!var11) {
                  return;
               }

               var11 = recovery$indy$54(
                  (short)var4, var5, recovery$indy$53(var1, -5856150131703792448L, var2), (char)var6, this.field_48.field_43E, 0.7, -5855947822119941572L, var2
               );
            }

            var14 = var9;
         }

         if (var2 > 0L) {
            if (var14 == null) {
               if (!var11) {
                  return;
               }

               var11 = recovery$indy$55(var1, -5856850713202189689L, var2).equals(recovery$indy$56(8486, 8258520521296571135L ^ var2));
            }

            var14 = var9;
         }

         label138: {
            label137: {
               label136: {
                  label219: {
                     if (var2 >= 0L) {
                        if (var14 == null) {
                           if (var11) {
                              break label219;
                           }

                           var11 = recovery$indy$57(var1, -5856850713202189689L, var2).equals(recovery$indy$58(8086, 5524262060148085832L ^ var2));
                        }

                        var14 = var9;
                     }

                     if (var2 <= 0L) {
                        break label138;
                     }

                     if (var14 != null) {
                        break label137;
                     }

                     if (!var11) {
                        break label136;
                     }
                  }

                  recovery$indy$59(this.field_41, -5856578759495442043L, var2);
               }

               var11 = recovery$indy$60(var1, -5856850713202189689L, var2).equals(recovery$indy$61(19624, 8978308244179617653L ^ var2));
            }

            var14 = var9;
         }

         label220: {
            if (var14 == null) {
               if (!var11) {
                  return;
               }

               var12 = this;
               if (var9 != null) {
                  break label220;
               }

               var11 = recovery$indy$62(this.field_41, 100L, var7, -5855285495215564469L, var2);
            }

            if (!var11) {
               return;
            }

            var12 = this;
         }

         var12.field_42 = 0;
      }
   }






   private static boolean method_48$aae029aa0a() {
      long var0 = a ^ 99556782200560L;
      long var10001 = 8661849972493394624L;
      C_47Wq var2 = C_47Wq.COMBO_BREAKER;
      return C_47Wq.method_45$d42e98969d(var2);
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_45 = null;
      this.field_48 = null;
   }



   public boolean method_45$aae029aa0a() {
      return this.field_43a;
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var4 = var2 ^ 91701734736199L;
      if (recovery$indy$63(C_47Wq.COMBO_BREAKER, 6398898117753746405L, var2)) {
         recovery$indy$64(this, var4, var1, 6397525216957529533L, var2);
      }
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$65(this, 21, 1000, var3, -7102135221101388899L, var1);
      recovery$indy$66(this, 40, var5, -7100238771517441718L, var1);
      recovery$indy$67(this, 35, var5, -7100238771517441718L, var1);
      recovery$indy$68(this, 17, var5, -7100238771517441718L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_45 = null;
      this.field_48 = null;
      this.field_43y = 0;
      this.field_42 = 0;
   }



   public void method_489$e45a9973e5(long var1) {
      recovery$indy$69(this.field_44, 4172844651368651843L, var1);
   }



   public boolean method_43B$aae029aa0a() {
      return this.field_43P;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   public void method_487$da8c82d5d4() {
      long var5;
      int[] var7;
      MoveHelper_47CF var17;
      label42: {
         long var1 = a ^ 85362708048541L;
         long var3 = var1 ^ 109063790598503L;
         var5 = var1 ^ 64002678891242L;
         long var10000 = -4297223647481976318L;
         var7 = AntiBot_47CG.method_40$d4d28024c9();
         long var10002 = -4298405277202585197L;
         long var9 = var3;
         MoveHelper_47CF var11 = this;
         EntityLivingBase var8 = var11.method_42$f2b0beb8fc(var9);
         EntityLivingBase var16 = var8;
         if (var7 == null) {
            if (var8 != null) {
               this.field_48 = var8;
            }

            var17 = this;
            if (var7 != null) {
               break label42;
            }

            var16 = this.field_45;
         }

         if (var16 != this.field_48) {
            this.field_42 = 0;
         }

         var17 = this;
      }

      if (var7 == null) {
         var17.field_45 = this.field_48;
         long var10001 = -4296663186246717577L;
         C_47Wq var12 = C_47Wq.HIT_SELECTION;
         if (!var12.method_43$aae029aa0a()) {
            return;
         }

         var17 = this;
      }

      long var18 = -4297340225091895807L;
      long var13 = var5;
      MoveHelper_47CF var15 = var17;
      var15.method_40$e45a9973e5(var13);
   }



    public MoveHelper_47CF(long a0) {
        super((java.lang.String) ("MoveHelper"),(java.lang.String) ("BewegungsHelfer"),(long) (((augustus.recovered.modules.combat.MoveHelper_47CF.a ^ a0) ^ 62055647074832L)),(java.awt.Color) (new java.awt.Color((int) (50),(int) (168),(int) (82))),(client.module.Category) (client.module.Category.COMBAT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.combat.MoveHelper_47CF.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.combat.MoveHelper_47CF.a ^ a0) ^ 10504106891238L);
        long constructorKey4 = ((augustus.recovered.modules.combat.MoveHelper_47CF.a ^ a0) ^ 110005994273164L);
        recovery$indy$flow$193(this, false);
        java.lang.Object initialValue5 = recovery$indy$flow$195();
        client.setting.MultiSelectSetting initialized6 = new client.setting.MultiSelectSetting(this, "Modes", constructorKey3, (net.C_47OZ[]) (initialValue5));
        recovery$indy$flow$197(this, initialized6);
        client.setting.NumberSetting initialized7 = new client.setting.NumberSetting(this, "Combos", 1.0D, constructorKey4, 0.0D, Double.longBitsToDouble(4616189618054758400L), 0);
        java.lang.Object initialValue8 = recovery$indy$flow$200();
        java.lang.Object initialValue9 = initialValue8;
        client.setting.NumberSetting initialValue10 = initialized7;
        java.lang.Object initialValue11 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue10))))));
        java.lang.Object initialValue12 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue9))))));
        java.lang.Object initialValue13 = recovery$indy$flow$203(initialValue11, initialValue12);
        recovery$indy$flow$204(this, initialValue13);
        recovery$indy$flow$205(this, 0);
        recovery$indy$flow$206(this, 0);
        net.C_473X initialized14 = new net.C_473X();
        recovery$indy$flow$209(this, initialized14);
        recovery$indy$flow$210(this, null);
        recovery$indy$flow$211(this, null);
        net.C_47cu initialized15 = new net.C_47cu();
        recovery$indy$flow$214(this, initialized15);
        net.C_47cu initialized16 = new net.C_47cu();
        recovery$indy$flow$217(this, initialized16);
        recovery$indy$flow$218(this, false);
    }



    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static long recovery$indy$flow$35() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.a;
    }
    private static native java.lang.Object recovery$indy$flow$36(long a0,long a1);

    private static java.lang.Object recovery$indy$flow$38() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$39(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$40() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$41(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$42(java.lang.Object a0);


    private static java.lang.Object recovery$indy$flow$45() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$46(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$47(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static void recovery$indy$flow$48(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_43a = a1;
        return;
    }

    private static native java.lang.Object recovery$indy$flow$50(java.lang.Object a0,char a1,short a2,int a3,long a4,long a5);
    private static java.lang.Object recovery$indy$flow$51() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$52(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$53(java.lang.Object a0,float a1);
    private static native double recovery$indy$flow$54(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$55() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$56(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$57(int a0,long a1,java.lang.Object a2,long a3,long a4);

    private static native java.lang.Object recovery$indy$flow$59(long a0,java.lang.Object a1,long a2,long a3);

    private static native float recovery$indy$flow$62(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$65(int a0,java.lang.Object a1,java.lang.Object a2,char a3,double a4,double a5,double a6,int a7,long a8,long a9);
    private static native double recovery$indy$flow$66(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$67() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$68(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$69(java.lang.Object a0,float a1);

    private static native java.lang.Object recovery$indy$flow$71(int a0,java.lang.Object a1,java.lang.Object a2,char a3,double a4,double a5,double a6,int a7,long a8,long a9);
    private static java.lang.Object recovery$indy$flow$72() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$73(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$74(java.lang.Object a0,float a1);
    private static native double recovery$indy$flow$75(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$76() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$77(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$78(java.lang.Object a0,float a1);
    private static native double recovery$indy$flow$79(java.lang.Object a0,java.lang.Object a1);

    private static int recovery$indy$flow$81(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_432;
    }

    private static int recovery$indy$flow$83(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_43p;
    }
    private static java.lang.Object recovery$indy$flow$84() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$85(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$86(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_432;
    }
    private static java.lang.Object recovery$indy$flow$87() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$88(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$89(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_43p;
    }
    private static java.lang.Object recovery$indy$flow$90() {
        return augustus.recovered.modules.combat.MoveHelper_47CF.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$91(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$92(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_432;
    }
    private static int recovery$indy$flow$93(java.lang.Object a0) {
        return ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_43y;
    }
    private static void recovery$indy$flow$94(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_43y = a1;
        return;
    }
    private static boolean recovery$indy$flow$95(java.lang.Object a0) {
        return ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_43a;
    }
    private static void recovery$indy$flow$96(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_43P = a1;
        return;
    }
    private static int recovery$indy$flow$97(java.lang.Object a0) {
        return ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_43y;
    }
    private static void recovery$indy$flow$98(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$193(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_43a = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$195();
    private static native void recovery$indy$flow$197(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$200();


    private static native java.lang.Object recovery$indy$flow$203(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$204(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$205(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$206(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_43y = a1;
        return;
    }
    private static native void recovery$indy$flow$209(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$210(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_48 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$211(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_45 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static native void recovery$indy$flow$214(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$217(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$218(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.MoveHelper_47CF) (a0)).field_43P = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native double recovery$indy$2(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native void recovery$indy$5(Object var0, boolean var1, long var2, long var4);
   private static native int[] recovery$indy$6(long var0, long var2);
   private static native C_47Ij recovery$indy$7(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$8(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$9(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$10(Object var0, long var1, long var3);
   private static native EntityLivingBase recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native Entity recovery$indy$12(Object var0, long var1, long var3);
   private static native Entity recovery$indy$13(Object var0, long var1, long var3);
   private static native int[] recovery$indy$31(long var0, long var2);
   private static native double recovery$indy$32(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$33(Object var0, long var1, long var3);
   private static native boolean recovery$indy$34(short var0, int var1, double var2, char var4, double var5, double var7, long var9, long var11);
   private static native double recovery$indy$35(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);
   private static native boolean recovery$indy$37(short var0, int var1, double var2, char var4, double var5, double var7, long var9, long var11);
   private static native double recovery$indy$38(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$39(Object var0, long var1, long var3);
   private static native boolean recovery$indy$40(short var0, int var1, double var2, char var4, double var5, double var7, long var9, long var11);
   private static native String recovery$indy$41(Object var0, long var1, long var3);
   private static native String recovery$indy$42(int var0, long var1);
   private static native String recovery$indy$43(Object var0, long var1, long var3);
   private static native String recovery$indy$44(int var0, long var1);
   private static native void recovery$indy$45(Object var0, long var1, long var3);
   private static native String recovery$indy$46(Object var0, long var1, long var3);
   private static native String recovery$indy$47(int var0, long var1);
   private static native boolean recovery$indy$48(Object var0, long var1, long var3, long var5, long var7);
   private static native double recovery$indy$49(Object var0, long var1, long var3);
   private static native boolean recovery$indy$50(short var0, int var1, double var2, char var4, double var5, double var7, long var9, long var11);
   private static native double recovery$indy$51(Object var0, long var1, long var3);
   private static native boolean recovery$indy$52(short var0, int var1, double var2, char var4, double var5, double var7, long var9, long var11);
   private static native double recovery$indy$53(Object var0, long var1, long var3);
   private static native boolean recovery$indy$54(short var0, int var1, double var2, char var4, double var5, double var7, long var9, long var11);
   private static native String recovery$indy$55(Object var0, long var1, long var3);
   private static native String recovery$indy$56(int var0, long var1);
   private static native String recovery$indy$57(Object var0, long var1, long var3);
   private static native String recovery$indy$58(int var0, long var1);
   private static native void recovery$indy$59(Object var0, long var1, long var3);
   private static native String recovery$indy$60(Object var0, long var1, long var3);
   private static native String recovery$indy$61(int var0, long var1);
   private static native boolean recovery$indy$62(Object var0, long var1, long var3, long var5, long var7);
   private static native boolean recovery$indy$63(Object var0, long var1, long var3);
   private static native void recovery$indy$64(Object var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$65(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$66(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$67(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$68(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$69(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$71();
}
