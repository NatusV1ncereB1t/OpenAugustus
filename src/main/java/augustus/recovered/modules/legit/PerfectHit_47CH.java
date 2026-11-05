package augustus.recovered.modules.legit;
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
import net.C_473X;
import net.C_474k;
import net.C_475c;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Ij;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.minecraft.entity.EntityLivingBase;
import net.C_47ak;
import net.C_47cu;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import client.module.Category;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class PerfectHit_47CH extends client.module.Module implements net.C_47UH {
    private final client.setting.NumberSetting settingMaxDelaySinceLastHit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCPSRecalculateDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDCPSRecalculateDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingReduceCPSIfYouCanNotHitATarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingForcePerfectHitClicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

    public void method_41$fae8de1664(C_475c c_475c) {
        PerfectHit_47CH perfectHit_47CH;
        block18: {
            block19: {
                int n;
                block25: {
                    int n2;
                    block24: {
                        int n3;
                        boolean bl;
                        long l;
                        long l2;
                        int n4;
                        int n5;
                        int n6;
                        long l3;
                        block22: {
                            block23: {
                                int n7;
                                block20: {
                                    block21: {
                                        int n8;
                                        block15: {
                                            long l4;
                                            block14: {
                                                block17: {
                                                    block16: {
                                                        EntityPlayerSP c_47B2;
                                                        block13: {
                                                            long l5;
                                                            long l6 = l5 = a ^ 0x699933BB6A78L;
                                                            l3 = l6 ^ 0x5098E1F6800FL;
                                                            l4 = l6 ^ 0x754CF7C4F48L;
                                                            long l7 = l6 ^ 0x1D3EA0E1364DL;
                                                            n6 = (int)(l7 >>> 48);
                                                            n5 = (int)(l7 << 16 >>> 48);
                                                            n4 = (int)(l7 << 32 >>> 32);
                                                            l2 = l6 ^ 0x4FE17E826ADEL;
                                                            l = l6 ^ 0x3BF88589AD80L;
                                                            bl = AimBot_47O_.method_45g$aae029aa0a();
                                                            Minecraft c_47nT = field_43;
                                                            c_47B2 = c_47nT.field_42P;
                                                            if (bl) break block13;
                                                            if (c_47B2 == null) break block14;
                                                            Minecraft c_47nT2 = field_43;
                                                            c_47B2 = c_47nT2.field_42P;
                                                        }
                                                        n8 = ((int) (c_47B2.method_436$aae029aa0a() ? 1 : 0));
                                                        if (bl) break block15;
                                                        if (n8 != 0) break block14;
                                                        Minecraft c_47nT = field_43;
                                                        n8 = c_47nT.field_44r.field_44l.method_49$8abf5c6871();
                                                        if (bl) break block16;
                                                        if (n8 > 0) break block17;
                                                        C_475c c_475c2 = c_475c;
                                                        n8 = c_475c2.method_48$8abf5c6871();
                                                    }
                                                    if (bl) break block15;
                                                    if (n8 <= 0) break block14;
                                                }
                                                C_47cu c_47cu = this.field_47;
                                                c_47cu.method_46$da8c82d5d4();
                                            }
                                            perfectHit_47CH = this;
                                            if (bl) break block18;
                                            long l8 = l4;
                                            PerfectHit_47CH perfectHit_47CH2 = perfectHit_47CH;
                                            n8 = ((int) (perfectHit_47CH2.method_48$0dd78e0064(l8) ? 1 : 0));
                                        }
                                        if (n8 == 0) break block19;
                                        C_475c c_475c3 = c_475c;
                                        n7 = c_475c3.method_48$8abf5c6871();
                                        if (bl) break block20;
                                        if (n7 > 0) break block21;
                                        Minecraft c_47nT = field_43;
                                        n3 = c_47nT.field_44r.field_44l.method_49$8abf5c6871();
                                        if (bl) break block22;
                                        if (n3 <= 0) break block23;
                                        C_475c c_475c4 = c_475c;
                                        n3 = c_475c4.method_45$aae029aa0a() ? 1 : 0;
                                        if (bl) break block22;
                                        if (n3 != 0) break block23;
                                    }
                                    perfectHit_47CH = this;
                                    if (bl) break block18;
                                    BooleanSetting c_47TV = perfectHit_47CH.settingForcePerfectHitClicks;
                                    n7 = c_47TV.method_49$aae029aa0a() ? 1 : 0;
                                }
                                if (n7 == 0) break block19;
                            }
                            BooleanSetting c_47TV = this.settingForcePerfectHitClicks;
                            n3 = ((int) (c_47TV.method_49$aae029aa0a() ? 1 : 0));
                        }
                        if (!bl) {
                            if (n3 != 0) {
                                Minecraft c_47nT;
                                C_475c c_475c5 = c_475c;
                                c_475c5.method_48$da8c82d5d4();
                                do {
                                    c_47nT = field_43;
                                } while (c_47nT.field_44r.field_44l.method_43$aae029aa0a());
                            }
                            RangeSetting c_47Ts = this.settingCPSRecalculateDelay;
                            int n9 = c_47Ts.method_44$8abf5c6871();
                            long l9 = l3;
                            C_473X c_473X = this.field_46;
                            n3 = c_473X.method_48$05d3808578(l9, n9) ? 1 : 0;
                        }
                        if (!bl) {
                            if (n3 != 0) {
                                C_473X c_473X = this.field_46;
                                c_473X.method_47$da8c82d5d4();
                                int n10 = n4;
                                char c = (char)n5;
                                short s = (short)n6;
                                RangeSetting c_47Ts = this.settingCPSRecalculateDelay;
                                c_47Ts.method_40$6160e88c05(s, c, n10);
                                int n11 = n4;
                                char c2 = (char)n5;
                                short s2 = (short)n6;
                                RangeSetting c_47Ts2 = this.settingCPS;
                                c_47Ts2.method_40$6160e88c05(s2, c2, n11);
                            }
                            RangeSetting c_47Ts = this.settingDCPSRecalculateDelay;
                            int n12 = c_47Ts.method_44$8abf5c6871();
                            long l10 = l3;
                            C_473X c_473X = this.field_40;
                            n3 = c_473X.method_48$05d3808578(l10, n12) ? 1 : 0;
                        }
                        if (!bl) {
                            if (n3 != 0) {
                                C_473X c_473X = this.field_40;
                                c_473X.method_47$da8c82d5d4();
                                int n13 = n4;
                                char c = (char)n5;
                                short s = (short)n6;
                                RangeSetting c_47Ts = this.settingDCPSRecalculateDelay;
                                c_47Ts.method_40$6160e88c05(s, c, n13);
                                int n14 = n4;
                                char c3 = (char)n5;
                                short s3 = (short)n6;
                                RangeSetting c_47Ts3 = this.settingDCPS;
                                c_47Ts3.method_40$6160e88c05(s3, c3, n14);
                            }
                            RangeSetting c_47Ts = this.settingCPS;
                            long l11 = l;
                            int n15 = c_47Ts.method_44$8abf5c6871();
                            PerfectHit_47CH perfectHit_47CH3 = this;
                            long l12 = l2;
                            int n16 = perfectHit_47CH3.method_45$7ee0e11626(n15, l11);
                            C_474k c_474k = this.field_44;
                            n3 = c_474k.method_44$7ee0e11626(n16, l12);
                        }
                        n2 = n = n3;
                        if (bl) break block24;
                        if (n2 <= 0) break block25;
                        RangeSetting c_47Ts = this.settingDCPS;
                        long l13 = l;
                        int n17 = c_47Ts.method_44$8abf5c6871();
                        PerfectHit_47CH perfectHit_47CH4 = this;
                        long l14 = l2;
                        int n18 = perfectHit_47CH4.method_45$7ee0e11626(n17, l13);
                        C_474k c_474k = this.field_48;
                        n2 = n + c_474k.method_44$7ee0e11626(n18, l14);
                    }
                    n = n2;
                }
                int n19 = n;
                C_475c c_475c6 = c_475c;
                c_475c6.method_44$d00df7729d(n19);
            }
            C_473X c_473X = this.field_46;
            c_473X.method_41$da8c82d5d4();
            perfectHit_47CH = this;
        }
        C_473X c_473X = perfectHit_47CH.field_40;
        c_473X.method_41$da8c82d5d4();
    }







   public boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 32719204461423L;
      long var5 = var1 ^ 77085599951178L;
      long var7 = var1 ^ 81515928714014L;
      byte var9 = (byte) ((recovery$indy$1(2683234149291008835L, var1)) ? 1 : 0);
      int var10000 = (int) ((recovery$indy$2(ClientGlobals.field_48.field_44g, var3, 2683205970770381918L, var1)) ? 1 : 0);
      if (var9 != 0) {
         if (!(var10000 != 0)) {
            return false;
         }

         var10000 = (int) ((recovery$indy$3(field_43, 2682561649675632055L, var1)) ? 1 : 0);
      }

      if (var9 != 0) {
         if (!(var10000 != 0)) {
            return false;
         }

         var10000 = (int) ((recovery$indy$5(this.field_47, recovery$indy$4(this.settingMaxDelaySinceLastHit, var5, 2681525678378426492L, var1), var7, 2682255557046347215L, var1)) ? 1 : 0);
      }

      if (!(var10000 != 0)) {
         C_47Ij var11 = recovery$indy$6(field_43, 2682496907851341721L, var1);
         byte var10001 = var9;
         if (var1 > 0L) {
            if (var9 != 0) {
               if (var11 == null) {
                  return false;
               }

               var11 = recovery$indy$7(field_43, 2682496907851341721L, var1);
            }

            var10001 = var9;
         }

         if (var10001 != 0) {
            if (var11.field_49 != C_47Az.ENTITY) {
               return false;
            }

            var11 = recovery$indy$8(field_43, 2682496907851341721L, var1);
         }

         var10000 = (int) ((var11.field_47 instanceof EntityLivingBase) ? 1 : 0);
         var10001 = var9;
         if (var1 >= 0L) {
            if (var9 != 0) {
               if (var10000 == 0) {
                  return false;
               }

               var10000 = ((EntityLivingBase)recovery$indy$9(field_43, 2682496907851341721L, var1).field_47).field_432;
            }

            var10001 = var9;
         }

         if (var1 > 0L) {
            if (var10001 == 0) {
               return var10000 != 0;
            }

            var10001 = 1;
         }

         if (var10000 <= var10001) {
            return true;
         }
      }

      return false;
   }




   private boolean method_45$da71426d05(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
      boolean var6 = recovery$indy$10(7718542508822785378L, var4);
      int var10000 = (int) ((recovery$indy$11(this.settingReduceCPSIfYouCanNotHitATarget, 7716479985730229266L, var4)) ? 1 : 0);
      if (var6) {
         label78:
         if ((var10000) != 0) {
            C_47Ij var8 = recovery$indy$12(field_43, 7717799786132427192L, var4);
            if (var6) {
               if (var8 == null) {
                  break label78;
               }

               var8 = recovery$indy$13(field_43, 7717799786132427192L, var4);
            }

            Entity var9 = var8.field_47;
            if (var6) {
               if (!(var8.field_47 instanceof C_47ak)) {
                  break label78;
               }

               var9 = recovery$indy$14(field_43, 7717799786132427192L, var4).field_47;
            }

            EntityLivingBase var7 = (EntityLivingBase)var9;
            var10000 = var7.field_432;
            boolean var10001 = var6;
            if (var1 >= 0) {
               if (var6) {
                  if (var7.field_432 != 0) {
                     return false;
                  }

                  long var11;
                  var10000 = (var11 = System.currentTimeMillis() - var7.field_48i - 75L) == 0L ? 0 : (var11 < 0L ? -1 : 1);
               }

               var10001 = var6;
            }

            if (var1 >= 0) {
               if (var10001) {
                  if (var10000 <= 0) {
                     return false;
                  }

                  long var12;
                  var10000 = (var12 = System.currentTimeMillis() - var7.field_48i - 225L) == 0L ? 0 : (var12 < 0L ? -1 : 1);
               }

               var10001 = var6;
            }

            if (!var10001) {
               return var10000 != 0;
            }

            if (var10000 < 0) {
               return true;
            }

            return false;
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }



   private int method_45$7ee0e11626(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 36757445462439L;
      int var6 = (int)((var2 ^ 91439091312149L) >>> 56);
      long var7 = (var2 ^ 91439091312149L) << 8 >>> 8;
      long var9 = var2 ^ 85869891337390L;
      boolean var11 = recovery$indy$15(-4039172521544939543L, var2);
      int var10000 = (int) ((recovery$indy$16(this, (byte)var6, var7, -4035784082543199743L, var2)) ? 1 : 0);
      if (!var11) {
         if (var10000 != 0) {
            BooleanSetting var13 = ClientGlobals.field_48.field_412.field_43B;
            if (!var11) {
               if (ClientGlobals.field_48.field_412.field_43B == null) {
                  return 0;
               }

               var13 = ClientGlobals.field_48.field_412.field_43B;
            }

            byte var14 = (byte) ((recovery$indy$17(var13, -4035423453351036677L, var2)) ? 1 : 0);
            if (var11) {
               return var14;
            }

            if (var14 != 0) {
               var14 = (byte) ((recovery$indy$18(ClientGlobals.field_48.field_412, var4, -4038438926278709610L, var2)) ? 1 : 0);
               if (var11) {
                  return var14;
               }

               if (var14 != 0) {
                  recovery$indy$20(var9, recovery$indy$19(17727, 1250438337990670607L ^ var2), -4039460302776668142L, var2);
               }
            }

            return 0;
         }

         var10000 = var1;
      }

      return var10000;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      recovery$indy$21(this, 7, 99999, var3, -7099925012615232604L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public PerfectHit_47CH(long a0) {
        super((java.lang.String) ("PerfectHit"),(java.lang.String) ("PerfekterSchlag"),(long) (((augustus.recovered.modules.legit.PerfectHit_47CH.a ^ a0) ^ 131248761452745L)),(java.awt.Color) (new java.awt.Color((int) (240),(int) (115),(int) (186))),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.legit.PerfectHit_47CH.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.legit.PerfectHit_47CH.a ^ a0) ^ 18770480333905L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.legit.PerfectHit_47CH.a ^ a0) ^ 18770480333905L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.legit.PerfectHit_47CH.a ^ a0) ^ 18770480333905L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.legit.PerfectHit_47CH.a ^ a0) ^ 68272207319348L);
        long constructorKey7 = ((augustus.recovered.modules.legit.PerfectHit_47CH.a ^ a0) ^ 7122002339026L);
        long constructorKey8 = ((augustus.recovered.modules.legit.PerfectHit_47CH.a ^ a0) ^ 47425217059669L);
        client.setting.NumberSetting initialized9 = new client.setting.NumberSetting(this, "MaxDelaySinceLastHit", Double.longBitsToDouble(4643985272004935680L), constructorKey8, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0);
        recovery$indy$flow$160(this, initialized9);
        short converted10 = (short) (constructorPart4);
        short converted11 = (short) (constructorPart5);
        client.setting.RangeSetting initialized12 = new client.setting.RangeSetting(constructorPart3, this, "CPS", Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble(4626322717216342016L), converted10, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted11);
        recovery$indy$flow$163(this, initialized12);
        short converted13 = (short) (constructorPart4);
        short converted14 = (short) (constructorPart5);
        client.setting.RangeSetting initialized15 = new client.setting.RangeSetting(constructorPart3, this, "CPSRecalculateDelay", Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), converted13, 0.0D, Double.longBitsToDouble(4633641066610819072L), 0, converted14);
        long initialValue16 = constructorKey6;
        client.setting.RangeSetting initialValue17 = initialized15;
        java.lang.Object initialValue18 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue19 = recovery$indy$flow$167(initialValue18, initialValue16);
        recovery$indy$flow$168(this, initialValue19);
        short converted20 = (short) (constructorPart4);
        short converted21 = (short) (constructorPart5);
        client.setting.RangeSetting initialized22 = new client.setting.RangeSetting(constructorPart3, this, "DCPS", 0.0D, 0.0D, converted20, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted21);
        recovery$indy$flow$171(this, initialized22);
        short converted23 = (short) (constructorPart4);
        short converted24 = (short) (constructorPart5);
        client.setting.RangeSetting initialized25 = new client.setting.RangeSetting(constructorPart3, this, "DCPSRecalculateDelay", Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4620693217682128896L), converted23, 0.0D, Double.longBitsToDouble(4633641066610819072L), 0, converted24);
        long initialValue26 = constructorKey6;
        client.setting.RangeSetting initialValue27 = initialized25;
        java.lang.Object initialValue28 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue27))))));
        java.lang.Object initialValue29 = recovery$indy$flow$175(initialValue28, initialValue26);
        recovery$indy$flow$176(this, initialValue29);
        client.setting.BooleanSetting initialized30 = new client.setting.BooleanSetting(this, constructorKey7, "ReduceCPSIfYouCanNotHitATarget", true);
        recovery$indy$flow$179(this, initialized30);
        client.setting.BooleanSetting initialized31 = new client.setting.BooleanSetting(this, constructorKey7, "ForcePerfectHitClicks", false);
        recovery$indy$flow$182(this, initialized31);
        net.C_47cu initialized32 = new net.C_47cu();
        recovery$indy$flow$185(this, initialized32);
        net.C_474k initialized33 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$188(this, initialized33);
        net.C_474k initialized34 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$191(this, initialized34);
        net.C_473X initialized35 = new net.C_473X();
        recovery$indy$flow$194(this, initialized35);
        net.C_473X initialized36 = new net.C_473X();
        recovery$indy$flow$197(this, initialized36);
        return;
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$160(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$163(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$167(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$168(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$171(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$175(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$176(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$179(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$182(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$185(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$188(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$191(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$194(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$197(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$3(Object var0, long var1, long var3);
   private static native double recovery$indy$4(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$5(Object var0, double var1, long var3, long var5, long var7);
   private static native C_47Ij recovery$indy$6(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$7(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$8(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$9(Object var0, long var1, long var3);
   private static native boolean recovery$indy$10(long var0, long var2);
   private static native boolean recovery$indy$11(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$12(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$13(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$14(Object var0, long var1, long var3);
   private static native boolean recovery$indy$15(long var0, long var2);
   private static native boolean recovery$indy$16(Object var0, byte var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$17(Object var0, long var1, long var3);
   private static native boolean recovery$indy$18(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$19(int var0, long var1);
   private static native void recovery$indy$20(long var0, Object var2, long var3, long var5);
   private static native void recovery$indy$21(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native MethodHandle recovery$constant$22();
}
