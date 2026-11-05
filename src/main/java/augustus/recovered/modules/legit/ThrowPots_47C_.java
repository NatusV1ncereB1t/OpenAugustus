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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_42a;
import net.C_43z;
import net.C_475c;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47MU;
import client.module.Module;
import net.C_47TY;
import client.setting.RangeSetting;
import net.C_47UH;
import net.C_47dF;
import net.C_47hg;
import net.C_47i;
import net.minecraft.client.Minecraft;
import net.C_47rf;
import client.module.Category;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ThrowPots_47C_ extends client.module.Module implements net.C_48T,net.C_47UH,net.C_47dF {
    private final client.setting.RangeSetting settingDelayBetweenSwitchAndClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDelayToSwitchToOriginalSlot = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

   private void method_46$da8c82d5d4() {
      this.field_42 = 0;
      this.field_43y = 0;
      this.field_43a = false;
   }



    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

    public void method_41$fae8de1664(C_475c c_475c) {
        block8: {
            block7: {
                long l = a ^ 0x6056938B9573L;
                long l2 = l ^ 0x4BACD17B0B92L;
                ++this.field_43y;
                ++this.field_42;
                boolean bl = AimBot_47O_.method_45g$aae029aa0a();
                ArrayList arrayList = this.field_43W;
                if (bl) {
                    arrayList.clear();
                    ThrowPots_47C_ throwPots_47C_ = this;
                    throwPots_47C_.method_46$da8c82d5d4();
                    return;
                }
                if (arrayList.isEmpty()) break block7;
                ThrowPots_47C_ throwPots_47C_ = this;
                long l3 = l2;
                if (throwPots_47C_.method_48$0dd78e0064(l3)) break block8;
            }
            this.field_43W.clear();
            ThrowPots_47C_ throwPots_47C_ = this;
            throwPots_47C_.method_46$da8c82d5d4();
            return;
        }
        C_42a c_42a = (C_42a)this.field_43W.get(0);
        RangeSetting c_47Ts = this.settingDelayBetweenSwitchAndClick;
        if (this.field_43y > c_47Ts.method_44$8abf5c6871()) {
            Minecraft c_47nT = field_43;
            C_42a c_42a2 = c_42a;
            if (c_47nT.field_42P.field_42X.field_42 == (Integer)c_42a2.method_45$0502b11602()) {
                if (!this.field_43a) {
                    int n = 1;
                    C_475c c_475c2 = c_475c;
                    c_475c2.method_48$d00df7729d(n);
                    this.field_43a = true;
                    this.field_42 = 0;
                    RangeSetting c_47Ts2 = this.settingDelayBetweenSwitchAndClick;
                    c_47Ts2.method_43$fedcb3e4d3();
                    RangeSetting c_47Ts3 = this.settingDelayToSwitchToOriginalSlot;
                    c_47Ts3.method_43$fedcb3e4d3();
                }
            }
        }
        if (!this.field_43a) return;
        RangeSetting c_47Ts4 = this.settingDelayToSwitchToOriginalSlot;
        if (this.field_42 < c_47Ts4.method_44$8abf5c6871()) return;
        this.field_43W.remove(0);
        ThrowPots_47C_ throwPots_47C_ = this;
        throwPots_47C_.method_46$da8c82d5d4();
    }




   public void method_40$db44232a44(long var1, C_47MU var3) {
      java.lang.Object var14;
      long var4 = var1 ^ 122349010656652L;
      int var6 = (int)((var1 ^ 29336012942693L) >>> 32);
      long var7 = (var1 ^ 29336012942693L) << 32 >>> 32;
      int var10 = recovery$indy$1(var3, 4822624252841308468L, var1);
      boolean var10000 = recovery$indy$2(4822811321034058705L, var1);
      Iterator var11 = this.field_43h.iterator();
      boolean var9 = var10000;

      while (true) {
         if (!var11.hasNext()) {
            return;
         }

         C_42a var12 = (C_42a)var11.next();
         var14 = var12;
         if (var1 > 0L) {
            if (var9) {
               break;
            }

            var14 = recovery$indy$3(var12, 4822888321905477300L, var1);
         }

         if (recovery$indy$4((C_47TY)var14, var6, var7, 4822751487851586834L, var1) == var10) {
            var14 = recovery$indy$6(this, var4, (Integer)recovery$indy$5(var12, 4819710834994374736L, var1), 4819813772788968966L, var1);
            break;
         }
      }

      Object var13 = var14;
      if (var13 != null) {
         this.field_43W.add(var13);
      }
   }



   private boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      return recovery$indy$7(field_43, -6996564033240312719L, var1);
   }



   private C_42a method_45$dca3e44f9e(long var1, int var3) {
      net.C_47rf var12;
      var1 = a ^ var1;
      boolean var4 = recovery$indy$8(-1542537340343550198L, var1);
      int var5 = 0;

      while (var5 < 9) {
         boolean var14;
         label79: {
            C_47rf var6 = recovery$indy$9(field_43, -1542757986564230295L, var1).field_429.method_46$4c10532da1(var5 + 36).method_48$ac4db64966();
            label78:
            if (var4) {
               label87: {
                  C_47rf var10000 = var6;
                  if (var1 > 0L) {
                     if (var6 == null) {
                        break label87;
                     }

                     var10000 = var6;
                  }

                  label88: {
                     var14 = var10000.method_48$dbd570a038() instanceof C_43z;
                     if (var4) {
                        if (!var14) {
                           break label87;
                        }

                        var12 = var6;
                        if (!var4) {
                           break label88;
                        }

                        var14 = C_43z.method_40$9a6ad9dfe5(var6.method_40$8abf5c6871());
                     }

                     if (!var14) {
                        break label87;
                     }

                     var12 = var6;
                  }

                  C_43z var7 = (C_43z)var12.method_48$dbd570a038();
                  List var8 = var7.method_48$e4caa49b8d(var6);
                  Object var13 = var8;
                  if (var4) {
                     if (var8.isEmpty()) {
                        break label87;
                     }

                     var13 = var8.get(0);
                  }

                  C_47hg var9 = (C_47hg)var13;
                  var14 = var4;
                  if (var1 <= 0L) {
                     break label79;
                  }

                  if (!var4) {
                     break label78;
                  }

                  if (var9.method_49$8abf5c6871() == var3) {
                     return new C_42a(var6, var5);
                  }
               }

               var5++;
            }

            var14 = var4;
         }

         if (!var14) {
            break;
         }
      }

      return null;
   }



   public void method_40G$e45a9973e5(long var1) {
      int var5;
      int var6;
      int var7;
      byte var8;
      Object var24;
      label54: {
         long var3 = var1 ^ 66642262910645L;
         long var10001 = var1 ^ 6407505185672L;
         var5 = (int)((var1 ^ 6407505185672L) >>> 32);
         var6 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
         var7 = (int)(var10001 << 48 >>> 48);
         long var10000 = -3628595769368520647L;
         var8 = (byte) ((AimBot_47O_.method_45i$aae029aa0a()) ? 1 : 0);
         boolean var23 = this.field_43W.isEmpty();
         if (var8 != 0) {
            if (var23) {
               return;
            }

            var24 = this;
            if (var8 == 0) {
               break label54;
            }

            long var10002 = -3628025805223043383L;
            long var10 = var3;
            ThrowPots_47C_ var12 = this;
            var23 = var12.method_48$0dd78e0064(var10);
         }

         if (!var23) {
            return;
         }

         var24 = this.field_43W.get(0);
      }

      C_42a var9 = (C_42a)var24;
      int var25 = var8;
      if (var1 > 0L) {
         if (var8 == 0) {
            return;
         }

         long var26 = -3628660081069452198L;
         Minecraft var13 = field_43;
         var25 = var13.field_42P.field_42X.field_42;
      }

      if (var1 > 0L) {
         long var28 = -3626682031079004392L;
         C_42a var14 = var9;
         if (var25 != (Integer)var14.method_45$0502b11602()) {
            long var27 = -3628539095330161057L;
            ThrowPots_47C_ var15 = this;
            var15.method_46$da8c82d5d4();
         }

         var25 = var5;
      }

      long var10004 = -3626682031079004392L;
      C_42a var16 = var9;
      int var10003 = (Integer)var16.method_45$0502b11602();
      char var10005 = (char)var6;
      char var10006 = (char)var7;
      long var33 = -3626526544747619505L;
      int var17 = var10003;
      char var18 = var10006;
      char var19 = var10005;
      byte var20 = 0;
      ThrowPots_47C_ var21 = this;
      int var22 = var25;
      C_47i.method_43$95cbd1eb82(var22, var21, var20, var19, var18, var17);
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$10(this, 7, var3, -7099379695031818149L, var1);
      recovery$indy$11(this, 34, var3, -7099379695031818149L, var1);
      recovery$indy$12(this, 14, var3, -7099379695031818149L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      recovery$indy$13(this, 2732474647456814608L, var4);
   }



    public ThrowPots_47C_(byte a0,int a1,int a2) {
        super((java.lang.String) ("ThrowPots"),(java.lang.String) ("Schmei\u00dfeTr\u00e4nke"),(long) (((((((long) (a0) << 56) | (((long) (a1) << 32) >>> 8)) | (((long) (a2) << 40) >>> 40)) ^ augustus.recovered.modules.legit.ThrowPots_47C_.a) ^ 726371610137L)),(java.awt.Color) (new java.awt.Color((int) (70),(int) (139),(int) (166))),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = (((((long) (a0) << 56) | (((long) (a1) << 32) >>> 8)) | (((long) (a2) << 40) >>> 40)) ^ augustus.recovered.modules.legit.ThrowPots_47C_.a);
        int constructorPart2 = (int) ((((((((long) (a0) << 56) | (((long) (a1) << 32) >>> 8)) | (((long) (a2) << 40) >>> 40)) ^ augustus.recovered.modules.legit.ThrowPots_47C_.a) ^ 113137810576001L) >>> 32));
        int constructorPart3 = (int) (((((((((long) (a0) << 56) | (((long) (a1) << 32) >>> 8)) | (((long) (a2) << 40) >>> 40)) ^ augustus.recovered.modules.legit.ThrowPots_47C_.a) ^ 113137810576001L) << 32) >>> 48));
        int constructorPart4 = (int) (((((((((long) (a0) << 56) | (((long) (a1) << 32) >>> 8)) | (((long) (a2) << 40) >>> 40)) ^ augustus.recovered.modules.legit.ThrowPots_47C_.a) ^ 113137810576001L) << 48) >>> 48));
        long constructorKey5 = ((((((long) (a0) << 56) | (((long) (a1) << 32) >>> 8)) | (((long) (a2) << 40) >>> 40)) ^ augustus.recovered.modules.legit.ThrowPots_47C_.a) ^ 81228442683364L);
        long constructorKey6 = ((((((long) (a0) << 56) | (((long) (a1) << 32) >>> 8)) | (((long) (a2) << 40) >>> 40)) ^ augustus.recovered.modules.legit.ThrowPots_47C_.a) ^ 5233812479742L);
        short converted7 = (short) (constructorPart3);
        short converted8 = (short) (constructorPart4);
        client.setting.RangeSetting initialized9 = new client.setting.RangeSetting(constructorPart2, this, "DelayBetweenSwitchAndClick", 1.0D, Double.longBitsToDouble(4611686018427387904L), converted7, 0.0D, Double.longBitsToDouble(4617315517961601024L), 0, converted8);
        long initialValue10 = constructorKey5;
        client.setting.RangeSetting initialValue11 = initialized9;
        java.lang.Object initialValue12 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue11))))));
        java.lang.Object initialValue13 = recovery$indy$flow$125(initialValue12, initialValue10);
        recovery$indy$flow$126(this, initialValue13);
        short converted14 = (short) (constructorPart3);
        short converted15 = (short) (constructorPart4);
        client.setting.RangeSetting initialized16 = new client.setting.RangeSetting(constructorPart2, this, "DelayToSwitchToOriginalSlot", 1.0D, Double.longBitsToDouble(4611686018427387904L), converted14, 0.0D, Double.longBitsToDouble(4617315517961601024L), 0, converted15);
        long initialValue17 = constructorKey5;
        client.setting.RangeSetting initialValue18 = initialized16;
        java.lang.Object initialValue19 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue20 = recovery$indy$flow$130(initialValue19, initialValue17);
        recovery$indy$flow$131(this, initialValue20);
        java.util.ArrayList initialized21 = new java.util.ArrayList();
        recovery$indy$flow$134(this, initialized21);
        java.util.ArrayList initialized22 = new java.util.ArrayList();
        recovery$indy$flow$137(this, initialized22);
        recovery$indy$flow$138(this, 0);
        recovery$indy$flow$139(this, 0);
        recovery$indy$flow$140(this, false);
        java.lang.Object initialValue23 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized24 = new net.C_47TY(this, constructorKey6, "RegenerationPotionKey");
        java.lang.Object initialValue25 = recovery$indy$flow$145(10);
        net.C_42a initialized26 = new net.C_42a(initialized24, initialValue25);
        boolean initialValue27 = recovery$indy$flow$147(initialValue23, initialized26);
        java.lang.Object initialValue28 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized29 = new net.C_47TY(this, constructorKey6, "SpeedPotionKey");
        java.lang.Object initialValue30 = recovery$indy$flow$152(1);
        net.C_42a initialized31 = new net.C_42a(initialized29, initialValue30);
        boolean initialValue32 = recovery$indy$flow$154(initialValue28, initialized31);
        java.lang.Object initialValue33 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized34 = new net.C_47TY(this, constructorKey6, "PoisonPotionKey");
        java.lang.Object initialValue35 = recovery$indy$flow$159(19);
        net.C_42a initialized36 = new net.C_42a(initialized34, initialValue35);
        boolean initialValue37 = recovery$indy$flow$161(initialValue33, initialized36);
        java.lang.Object initialValue38 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized39 = new net.C_47TY(this, constructorKey6, "FireResistancePotionKey");
        java.lang.Object initialValue40 = recovery$indy$flow$166(12);
        net.C_42a initialized41 = new net.C_42a(initialized39, initialValue40);
        boolean initialValue42 = recovery$indy$flow$168(initialValue38, initialized41);
        java.lang.Object initialValue43 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized44 = new net.C_47TY(this, constructorKey6, "InstantHealthPotionKey");
        java.lang.Object initialValue45 = recovery$indy$flow$173(6);
        net.C_42a initialized46 = new net.C_42a(initialized44, initialValue45);
        boolean initialValue47 = recovery$indy$flow$175(initialValue43, initialized46);
        java.lang.Object initialValue48 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized49 = new net.C_47TY(this, constructorKey6, "NightVisionPotionKey");
        java.lang.Object initialValue50 = recovery$indy$flow$180(16);
        net.C_42a initialized51 = new net.C_42a(initialized49, initialValue50);
        boolean initialValue52 = recovery$indy$flow$182(initialValue48, initialized51);
        java.lang.Object initialValue53 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized54 = new net.C_47TY(this, constructorKey6, "WeaknessPotionKey");
        java.lang.Object initialValue55 = recovery$indy$flow$187(18);
        net.C_42a initialized56 = new net.C_42a(initialized54, initialValue55);
        boolean initialValue57 = recovery$indy$flow$189(initialValue53, initialized56);
        java.lang.Object initialValue58 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized59 = new net.C_47TY(this, constructorKey6, "StrengthPotionKey");
        java.lang.Object initialValue60 = recovery$indy$flow$194(5);
        net.C_42a initialized61 = new net.C_42a(initialized59, initialValue60);
        boolean initialValue62 = recovery$indy$flow$196(initialValue58, initialized61);
        java.lang.Object initialValue63 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized64 = new net.C_47TY(this, constructorKey6, "SlownessPotionKey");
        java.lang.Object initialValue65 = recovery$indy$flow$201(2);
        net.C_42a initialized66 = new net.C_42a(initialized64, initialValue65);
        boolean initialValue67 = recovery$indy$flow$203(initialValue63, initialized66);
        java.lang.Object initialValue68 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized69 = new net.C_47TY(this, constructorKey6, "JumpBoostPotionKey");
        java.lang.Object initialValue70 = recovery$indy$flow$208(8);
        net.C_42a initialized71 = new net.C_42a(initialized69, initialValue70);
        boolean initialValue72 = recovery$indy$flow$210(initialValue68, initialized71);
        java.lang.Object initialValue73 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized74 = new net.C_47TY(this, constructorKey6, "InstantDamagePotionKey");
        java.lang.Object initialValue75 = recovery$indy$flow$215(7);
        net.C_42a initialized76 = new net.C_42a(initialized74, initialValue75);
        boolean initialValue77 = recovery$indy$flow$217(initialValue73, initialized76);
        java.lang.Object initialValue78 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized79 = new net.C_47TY(this, constructorKey6, "WaterBreathingPotionKey");
        java.lang.Object initialValue80 = recovery$indy$flow$222(13);
        net.C_42a initialized81 = new net.C_42a(initialized79, initialValue80);
        boolean initialValue82 = recovery$indy$flow$224(initialValue78, initialized81);
        java.lang.Object initialValue83 = ((java.lang.Object)(((augustus.recovered.modules.legit.ThrowPots_47C_) (((java.lang.Object)(this)))).field_43h));
        net.C_47TY initialized84 = new net.C_47TY(this, constructorKey6, "InvisibilityPotionKey");
        java.lang.Object initialValue85 = recovery$indy$flow$229(14);
        net.C_42a initialized86 = new net.C_42a(initialized84, initialValue85);
        boolean initialValue87 = recovery$indy$flow$231(initialValue83, initialized86);
        return;
    }





    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object recovery$indy$flow$125(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$126(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$130(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$131(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$134(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$137(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$138(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.ThrowPots_47C_) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$139(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.ThrowPots_47C_) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$140(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.ThrowPots_47C_) (a0)).field_43a = a1;
        return;
    }

    private static java.lang.Object recovery$indy$flow$145(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$147(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$152(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$154(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$159(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$161(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$166(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$168(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$173(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$175(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$180(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$182(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$187(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$189(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$194(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$196(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$201(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$203(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$208(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$210(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$215(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$217(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$222(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$224(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$229(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$231(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }
   private static native MethodHandle recovery$constant$0();
   private static native int recovery$indy$1(Object var0, long var1, long var3);
   private static native boolean recovery$indy$2(long var0, long var2);
   private static native Object recovery$indy$3(Object var0, long var1, long var3);
   private static native int recovery$indy$4(Object var0, int var1, long var2, long var4, long var6);
   private static native Object recovery$indy$5(Object var0, long var1, long var3);
   private static native C_42a recovery$indy$6(Object var0, long var1, int var3, long var4, long var6);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3);
   private static native boolean recovery$indy$8(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native void recovery$indy$10(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$11(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$12(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$13(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$14();
}
