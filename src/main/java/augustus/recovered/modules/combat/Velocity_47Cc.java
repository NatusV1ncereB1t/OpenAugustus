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
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_46s;
import net.C_472n;
import net.C_473U;
import net.C_477Q;
import net.C_477x;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47G6;
import net.C_47G7;
import net.C_47GA;
import net.C_47GC;
import net.C_47GH;
import net.C_47GN;
import net.C_47GO;
import net.C_47GQ;
import net.C_47GT;
import net.C_47GW;
import net.C_47GX;
import net.C_47G_;
import net.C_47Gk;
import net.C_47Gl;
import net.C_47Gm;
import net.C_47Gn;
import net.C_47Gz;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47Th;
import client.setting.ModeSetting;
import net.C_47cu;
import net.C_47hi;
import net.C_47iC;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import client.ClientGlobals;
import client.module.Category;
import net.C_47xZ;
import net.C_47xz;
import net.C_47zh;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Velocity_47Cc extends client.module.Module implements net.C_47hi,net.C_47iC,net.C_47xz,net.C_47mz {
    public final net.C_47Th settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingNotWhileSPressed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingNotWhileLongJump = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLag = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingIgnoreFire = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCancelDamageSoundsFromOtherPlayers = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingPacketCancelingGroup = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingPacketToCancel = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    public boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

   public void method_46$e535f8442d(net.C_47zh var1, long var2, short var4) {
      long var5 = var2 << 16 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 93446394500336L;
      long var9 = var5 ^ 97606001903268L;
      long var11 = var5 ^ 13538434133415L;
      long var13 = var5 ^ 1376067170629L;
      int[] var15 = (int[])recovery$indy$flow$0(1767376576350667106L, var5);
      if (recovery$indy$flow$1(this, var13, 1772575902140056023L, var5)) {
         label71: {
            net.C_473U var16 = (net.C_473U)recovery$indy$flow$2(var1, 1767457497352946305L, var5);
            double var18;
            int var10000 = (var18 = recovery$indy$flow$4(this.settingLag, var7, 1772271585723326618L, var5) - 0.0) == 0.0 ? 0 : (var18 < 0.0 ? -1 : 1);
            int[] var10001 = var15;
            if (var4 > 0) {
               if (var15 == null) {
                  if (var10000 <= 0) {
                     break label71;
                  }

                  var10000 = ((int) (var16 instanceof C_46s ? 1 : 0));
               }

               var10001 = var15;
            }

            if (var10001 == null) {
               if (var10000 == 0) {
                  break label71;
               }

               var10000 = ((C_46s)var16).method_45$8abf5c6871();
            }

            if (var10000 == ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$9(field_43, 1773634548444457386L, var5)).method_49$8abf5c6871()) {
               recovery$indy$flow$12(this.field_48, 1772747409379418529L, var5);
            }
         }

         if (!recovery$indy$flow$16(this.field_48, recovery$indy$flow$15(this.settingLag, var7, 1772271585723326618L, var5), var9, 1766649860797129061L, var5)) {
            net.minecraft.client.entity.EntityPlayerSP var17 = (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$18(field_43, 1773634548444457386L, var5);
            if (var15 != null) {
               recovery$indy$flow$22(var1, var11, (((var17.field_48y) & 1) != 0), 1767592830974341926L, var5);
            } else {
               recovery$indy$flow$22(
                  var1,
                  var11,
                  var17 != null && ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$20(field_43, 1773634548444457386L, var5)).field_48y > 20,
                  1767592830974341926L,
                  var5
               );
            }
         } else {
            recovery$indy$flow$22(var1, var11, false, 1767592830974341926L, var5);
         }
      }
   }




    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private static boolean method_41$53565cee7d(C_477x var0) {
      long var1 = a ^ 65996216731449L;
      long var3 = var1 ^ 71955905044967L;
      long var10000 = 2603030317579927035L;
      int[] var5 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = 2595333728898209485L;
      C_477x var6 = var0;
      ModeSetting var10 = C_477x.method_43$313be96845(var6);
      long var10002 = 2594675609484020096L;
      long var7 = var3;
      ModeSetting var9 = var10;
      boolean var11 = var9.method_46$5f9dc63072(var7).equals("None");
      if (var5 == null) {
         var11 = !var11;
      }

      return var11;
   }



   public void method_49$9035875d26(long var1, C_47ob var3) {
      long var6;
      int[] var8;
      C_473U var9;
      label151: {
         var1 = a ^ var1;
         long var4 = var1 ^ 26045763068488L;
         var6 = var1 ^ 63266136008902L;
         var8 = recovery$indy$12(-1279381917306144806L, var1);
         var9 = recovery$indy$13(var3, -1287804953320031212L, var1);
         int var10000 = (int) ((var9 instanceof C_46s) ? 1 : 0);
         if (var8 == null) {
            if ((var10000) != 0) {
               label155: {
                  C_46s var10 = (C_46s)var9;
                  var10000 = var10.method_45$8abf5c6871();
                  int[] var10001 = var8;
                  if (var1 >= 0L) {
                     if (var8 == null) {
                        if (var10000 != recovery$indy$14(field_43, -1286494073049932014L, var1).method_49$8abf5c6871()) {
                           break label155;
                        }

                        var10000 = var10.method_49$8abf5c6871();
                     }

                     var10001 = var8;
                  }

                  if (var10001 == null) {
                     if (var10000 == 0) {
                        break label155;
                     }

                     var10000 = var10.method_47$8abf5c6871();
                  }

                  if (var10000 != 0) {
                     C_477x[] var11 = recovery$indy$15(-1285000492245670959L, var1);
                     int var12 = var11.length;
                     int var13 = 0;

                     while (var13 < var12) {
                        C_477x var14 = var11[var13];
                        int[] var25 = var8;
                        if (var1 > 0L) {
                           if (var8 == null) {
                              if (var1 > 0L && recovery$indy$16(this, var6, var14, -1286841721743339318L, var1)) {
                                 recovery$indy$19(
                                    var14,
                                    (int)recovery$indy$18(recovery$indy$17(var14, -1287188486813731486L, var1), var4, -1287997799121791454L, var1),
                                    -1279867314955551707L,
                                    var1
                                 );
                              }

                              var13++;
                           }

                           var25 = var8;
                        }

                        if (var25 != null) {
                           break;
                        }
                     }

                     return;
                  }
               }

               if (var8 == null) {
                  break label151;
               }
            }

            var10000 = (int) ((var9 instanceof C_47xZ) ? 1 : 0);
         }

         if ((var10000) != 0) {
            for (C_477x var22 : recovery$indy$20(-1285000492245670959L, var1)) {
               recovery$indy$21(var22, 0, -1279867314955551707L, var1);
               if (var8 != null) {
                  break;
               }
            }

            return;
         }
      }

      C_477x[] var17 = recovery$indy$22(-1285000492245670959L, var1);
      int var19 = var17.length;
      int var21 = 0;

      while (var21 < var19) {
         C_477x var23 = var17[var21];
         int var26 = (int) ((var9.getClass().equals(recovery$indy$23(var23, -1280027010825750353L, var1))) ? 1 : 0);
         int[] var27 = var8;
         if (var1 > 0L) {
            if (var8 == null) {
               if (var26 == 0) {
                  var21++;
                  if (var8 == null) {
                     continue;
                  }
                  break;
               }

               var26 = (int) ((recovery$indy$24(this, var6, var23, -1286841721743339318L, var1)) ? 1 : 0);
            }

            var27 = var8;
         }

         if (var1 >= 0L) {
            if (var27 == null) {
               if (var26 == 0) {
                  return;
               }

               var26 = recovery$indy$25(var23, -1279470541509100410L, var1);
            }

            var27 = var8;
         }

         if (var27 == null && var26 > 0) {
            var3.cancel();
            recovery$indy$26(var23, -1286122440247948160L, var1);
         }

         return;
      }
   }




   private boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 113953903379642L;
      int[] var5 = recovery$indy$27(-8437050631588359411L, var1);
      if (recovery$indy$28(field_43, -8434573879427531835L, var1) == null) {
         return false;
      }

      boolean var10000;
      int[] var10001;
      label79: {
         var10000 = recovery$indy$29(this.settingNotWhileSPressed, -8433835096008475260L, var1);
         label78:
         if (var5 == null) {
            if (var10000) {
               var10000 = this.field_43a;
               var10001 = var5;
               if (var1 <= 0L) {
                  break label79;
               }

               if (var5 != null) {
                  break label78;
               }

               if (this.field_43a) {
                  return false;
               }
            }

            var10000 = recovery$indy$30(field_43, -8434573879427531835L, var1).method_45$aae029aa0a();
         }

         var10001 = var5;
      }

      label68: {
         label67:
         if (var10001 == null) {
            if (var10000) {
               var10000 = recovery$indy$31(this.settingIgnoreFire, -8433835096008475260L, var1);
               var10001 = var5;
               if (var1 <= 0L) {
                  break label68;
               }

               if (var5 != null) {
                  break label67;
               }

               if (var10000) {
                  return false;
               }
            }

            var10000 = recovery$indy$32(ClientGlobals.field_48.field_461, var3, -8431524758920096801L, var1);
         }

         var10001 = var5;
      }

      if (var10001 != null) {
         return var10000;
      }

      if (!var10000) {
         return true;
      }

      var10000 = recovery$indy$33(this.settingNotWhileLongJump, -8433835096008475260L, var1);
      return var5 != null ? var10000 : !var10000;
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 113473543071771L;
      long var6 = var1 ^ 84654893927628L;
      int[] var8 = recovery$indy$34(2670553352519384299L, var1);
      if (recovery$indy$35(field_43, 2671895201969820707L, var1) != null && recovery$indy$36(this, var6, 2670698187956091998L, var1)) {
         C_473U var9;
         int var11;
         int[] var10001;
         label70: {
            label69: {
               label76: {
                  var9 = recovery$indy$37(var3, 2671130203712075557L, var1);
                  EntityPlayerSP var10000 = recovery$indy$38(field_43, 2671895201969820707L, var1);
                  if (var8 == null) {
                     if (var10000 == null) {
                        break label76;
                     }

                     var10000 = recovery$indy$39(field_43, 2671895201969820707L, var1);
                  }

                  var11 = var10000.field_48y;
                  var10001 = var8;
                  if (var1 < 0L) {
                     break label70;
                  }

                  if (var8 != null) {
                     break label69;
                  }

                  if (var10000.field_48y > 20) {
                     recovery$indy$40(this, var4, var3, 2672171842017535975L, var1);
                  }
               }

               var11 = (int) ((var9 instanceof C_477Q) ? 1 : 0);
            }

            var10001 = var8;
         }

         if (var10001 == null) {
            if (var11 == 0) {
               return;
            }

            var11 = (int) ((recovery$indy$41(this.settingCancelDamageSoundsFromOtherPlayers, 2671437854728819298L, var1)) ? 1 : 0);
         }

         if (var11 != 0) {
            label49: {
               C_477Q var10 = (C_477Q)var9;
               boolean var12 = var10.method_42$0e30dfc966().equalsIgnoreCase(recovery$indy$42(11439, 6317474511026558647L ^ var1));
               if (var8 == null) {
                  if (var12) {
                     break label49;
                  }

                  var12 = var10.method_42$0e30dfc966().equalsIgnoreCase(recovery$indy$43(32275, 4004715048388183053L ^ var1));
               }

               if (!var12) {
                  return;
               }
            }

            var3.cancel();
         }
      }
   }



    public void method_47$05bd94f678(net.C_472n event, long eventKey) {
        Object flowGuard = recovery$indy$flow$96(6398162824951955758L, eventKey);
        float verticalMotion = recovery$indy$flow$97(event, 6399819241740585726L, eventKey);
        this.field_43a = flowGuard != null ? verticalMotion != 0.0F : verticalMotion < 0.0F;
    }



   private boolean method_43$3802b2702f(long var1, C_477x var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 135894640631850L;
      long var10000 = -1886189512790590410L;
      int[] var6 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = -1888701316128578674L;
      C_477x var7 = var3;
      boolean var23 = var7.method_43$aae029aa0a();
      if (var6 == null) {
         if (!var23) {
            return false;
         }

         var10001 = -1888907446237161728L;
         C_477x var8 = var3;
         ModeSetting var24 = C_477x.method_43$313be96845(var8);
         long var10002 = -1887261879415699379L;
         long var9 = var4;
         ModeSetting var11 = var24;
         var23 = var11.method_46$5f9dc63072(var9).equals("Always");
      }

      if (var6 != null) {
         return var23;
      }

      if (var23) {
         return true;
      }

      var10001 = -1888907446237161728L;
      C_477x var12 = var3;
      ModeSetting var25 = C_477x.method_43$313be96845(var12);
      long var33 = -1887261879415699379L;
      long var13 = var4;
      ModeSetting var15 = var25;
      boolean var35 = var15.method_46$5f9dc63072(var13).equals("OnlyInAir");
      int[] var29 = var6;
      if (var1 >= 0L) {
         if (var6 == null) {
            if (var35) {
               var10001 = -1888938737382812418L;
               Minecraft var16 = field_43;
               if (var6 != null) {
                  return var16.field_42P.field_48M;
               }

               if (!var16.field_42P.field_48M) {
                  return true;
               }
            }

            var10001 = -1888907446237161728L;
            C_477x var17 = var3;
            ModeSetting var26 = C_477x.method_43$313be96845(var17);
            var33 = -1887261879415699379L;
            long var18 = var4;
            ModeSetting var20 = var26;
            var35 = var20.method_46$5f9dc63072(var18).equals("OnlyOnGround");
         }

         var29 = var6;
      }

      if (var1 > 0L) {
         if (var29 == null) {
            if (!var35) {
               return false;
            }

            var10001 = -1888938737382812418L;
            Minecraft var21 = field_43;
            var35 = var21.field_42P.field_48M;
         }

         var29 = var6;
      }

      return var29 != null ? var35 : var35;
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$46(this, 21, var3, -7104307215187235346L, var1);
      recovery$indy$47(this, 26, var3, -7104307215187235346L, var1);
      recovery$indy$48(this, 40, var3, -7104307215187235346L, var1);
      recovery$indy$49(this, 25, var3, -7104307215187235346L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 72498010691029L;
      long var8 = var4 ^ 99593642957744L;
      recovery$indy$51(this, var6, recovery$indy$50(this.settingMode, var8, 2185715169516549079L, var4), 2182480726451709464L, var4);
      this.field_42 = 0;
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public Velocity_47Cc(int a0,long a1) {
        super((java.lang.String) ("Velocity"),(java.lang.String) ("R\u00fccksto\u00df"),(long) ((((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 74166748032167L)),(java.awt.Color) (new java.awt.Color((int) (83),(int) (102),(int) (109),(int) (255))),(client.module.Category) (client.module.Category.COMBAT));
        long constructorKey1 = ((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a);
        long constructorKey2 = (((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 8426242596894L);
        int constructorPart3 = (int) (((((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 2563837784832L) >>> 32));
        int constructorPart4 = (int) ((((((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 2563837784832L) << 32) >>> 48));
        int constructorPart5 = (int) ((((((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 2563837784832L) << 48) >>> 48));
        long constructorKey6 = (((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 87439373884161L);
        long constructorKey7 = (((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 63737433559753L);
        long constructorKey8 = (((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 55322551873724L);
        long constructorKey9 = (((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 74076903158977L);
        long constructorKey10 = (((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 93151194248707L);
        long constructorKey11 = (((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 75796321085750L);
        long constructorKey12 = (((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 23596696981286L);
        int constructorPart13 = (int) (((((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 40284826153233L) >>> 32));
        int constructorPart14 = (int) ((((((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 40284826153233L) << 32) >>> 48));
        int constructorPart15 = (int) ((((((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 40284826153233L) << 48) >>> 48));
        long constructorKey16 = (((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 34123419832123L);
        int constructorPart17 = (int) (((((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 137660593399866L) >>> 32));
        int constructorPart18 = (int) ((((((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 137660593399866L) << 32) >>> 48));
        int constructorPart19 = (int) ((((((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 137660593399866L) << 48) >>> 48));
        long constructorKey20 = (((((long) (a0) << 32) | ((a1 << 32) >>> 32)) ^ augustus.recovered.modules.combat.Velocity_47Cc.a) ^ 6075658146829L);
        short converted21 = (short) (constructorPart18);
        short converted22 = (short) (constructorPart19);
        java.lang.Object initialValue23 = recovery$indy$flow$135(17);
        java.lang.Object initialValue24 = recovery$indy$flow$136();
        ((java.lang.Object[]) initialValue23)[0] = initialValue24;
        java.lang.Object initialValue25 = recovery$indy$flow$137();
        ((java.lang.Object[]) initialValue23)[1] = initialValue25;
        java.lang.Object initialValue26 = recovery$indy$flow$138();
        ((java.lang.Object[]) initialValue23)[2] = initialValue26;
        java.lang.Object initialValue27 = recovery$indy$flow$139();
        ((java.lang.Object[]) initialValue23)[3] = initialValue27;
        java.lang.Object initialValue28 = recovery$indy$flow$140();
        ((java.lang.Object[]) initialValue23)[4] = initialValue28;
        java.lang.Object initialValue29 = recovery$indy$flow$141();
        ((java.lang.Object[]) initialValue23)[5] = initialValue29;
        java.lang.Object initialValue30 = recovery$indy$flow$142();
        ((java.lang.Object[]) initialValue23)[6] = initialValue30;
        java.lang.Object initialValue31 = recovery$indy$flow$143();
        ((java.lang.Object[]) initialValue23)[7] = initialValue31;
        java.lang.Object initialValue32 = recovery$indy$flow$144();
        ((java.lang.Object[]) initialValue23)[8] = initialValue32;
        java.lang.Object initialValue33 = recovery$indy$flow$145();
        ((java.lang.Object[]) initialValue23)[9] = initialValue33;
        java.lang.Object initialValue34 = recovery$indy$flow$146();
        ((java.lang.Object[]) initialValue23)[10] = initialValue34;
        java.lang.Object initialValue35 = recovery$indy$flow$147();
        ((java.lang.Object[]) initialValue23)[11] = initialValue35;
        java.lang.Object initialValue36 = recovery$indy$flow$148();
        ((java.lang.Object[]) initialValue23)[12] = initialValue36;
        java.lang.Object initialValue37 = recovery$indy$flow$149();
        ((java.lang.Object[]) initialValue23)[13] = initialValue37;
        java.lang.Object initialValue38 = recovery$indy$flow$150();
        ((java.lang.Object[]) initialValue23)[14] = initialValue38;
        java.lang.Object initialValue39 = recovery$indy$flow$151();
        ((java.lang.Object[]) initialValue23)[15] = initialValue39;
        java.lang.Object initialValue40 = recovery$indy$flow$152();
        ((java.lang.Object[]) initialValue23)[16] = initialValue40;
        net.C_47Th initialized41 = new net.C_47Th(constructorPart17, converted21, converted22, this, "Mode", "Basic", (java.util.function.BiFunction[]) (initialValue23));
        recovery$indy$flow$154(this, initialized41);
        client.setting.BooleanSetting initialized42 = new client.setting.BooleanSetting(this, constructorKey8, "NotWhileSPressed", false);
        recovery$indy$flow$157(this, initialized42);
        client.setting.BooleanSetting initialized43 = new client.setting.BooleanSetting(this, constructorKey8, "NotWhileLongJump", false);
        recovery$indy$flow$160(this, initialized43);
        client.setting.NumberSetting initialized44 = new client.setting.NumberSetting(this, "Lag", 0.0D, constructorKey16, 0.0D, Double.longBitsToDouble(4645744490609377280L), 0);
        recovery$indy$flow$163(this, initialized44);
        client.setting.BooleanSetting initialized45 = new client.setting.BooleanSetting(this, constructorKey8, "IgnoreFire", true);
        recovery$indy$flow$166(this, initialized45);
        client.setting.BooleanSetting initialized46 = new client.setting.BooleanSetting(this, constructorKey8, "CancelDamageSoundsFromOtherPlayers", false);
        recovery$indy$flow$169(this, initialized46);
        client.setting.SettingGroup initialized47 = new client.setting.SettingGroup(this, "PacketCancelingGroup", true, constructorKey11);
        long initialValue48 = constructorKey7;
        java.lang.String initialValue49 = "PacketCanceling";
        client.setting.SettingGroup initialValue50 = initialized47;
        java.lang.Object initialValue51 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue50))))));
        java.lang.Object initialValue52 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue53 = recovery$indy$flow$174(initialValue51, initialValue52, initialValue48);
        java.lang.Object initialValue54 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue53))))));
        recovery$indy$flow$176(this, initialValue54);
        java.lang.Object initialValue55 = recovery$indy$flow$178();
        java.lang.Object initialValue56 = ((java.lang.Object)(((augustus.recovered.modules.combat.Velocity_47Cc) (((java.lang.Object)(this)))).settingPacketCancelingGroup));
        client.setting.MultiSelectSetting initialized57 = new client.setting.MultiSelectSetting(this, "PacketToCancel", constructorKey12, (net.C_47OZ[]) (initialValue55), (client.setting.SettingGroup) (initialValue56));
        long initialValue58 = constructorKey6;
        java.lang.String initialValue59 = "PacketsToCancel";
        client.setting.MultiSelectSetting initialValue60 = initialized57;
        java.lang.Object initialValue61 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue62 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue59))))));
        java.lang.Object initialValue63 = recovery$indy$flow$183(initialValue61, initialValue62, initialValue58);
        recovery$indy$flow$184(this, initialValue63);
        java.lang.Object initialValue64 = recovery$indy$flow$185();
        net.C_47cu initialized65 = new net.C_47cu();
        recovery$indy$flow$188(this, initialized65);
        recovery$indy$flow$189(this, 0);
        recovery$indy$flow$190(this, false);
        java.lang.Object initialValue66 = recovery$indy$flow$191();
        java.lang.Object initialValue67 = initialValue66;
        int length68 = java.lang.reflect.Array.getLength(initialValue67);
        int initialValue69 = length68;
        java.lang.Object initialValue70 = initialValue64;
        int initialValue71 = 0;
        Velocity_47Cc loopLocal72 = this;
        long loopLocal73 = constructorKey1;
        long loopLocal74 = constructorKey2;
        int loopLocal75 = constructorPart3;
        int loopLocal76 = constructorPart4;
        int loopLocal77 = constructorPart5;
        long loopLocal78 = constructorKey9;
        long loopLocal79 = constructorKey10;
        int loopLocal80 = constructorPart13;
        int loopLocal81 = constructorPart14;
        int loopLocal82 = constructorPart15;
        long loopLocal83 = constructorKey20;
        java.lang.Object loopLocal84 = initialValue67;
        int loopLocal85 = initialValue69;
        java.lang.Object loopLocal86 = initialValue70;
        int loopLocal87 = initialValue71;
        loop88: while (true) {
            if (loopLocal87 >= loopLocal85) {
                break loop88;
            } else {
                java.lang.Object arrayValue89 = ((java.lang.Object[]) loopLocal84)[loopLocal87];
                java.lang.Object initialValue90 = arrayValue89;
                java.lang.Object initialValue91 = initialValue90;
                java.lang.Object initialValue92 = ((java.lang.Object)(((net.C_477x) (((java.lang.Object)(initialValue91))))));
                java.lang.Object initialValue93 = recovery$indy$flow$194(initialValue92);
                java.lang.Object initialValue94 = ((java.lang.Object)(((augustus.recovered.modules.combat.Velocity_47Cc) (((java.lang.Object)(loopLocal72)))).settingPacketCancelingGroup));
                client.setting.SettingGroup initialized95 = new client.setting.SettingGroup(loopLocal78, (client.module.Module) (loopLocal72), (java.lang.String) (initialValue93), (client.setting.SettingGroup) (initialValue94));
                java.lang.Object initialValue96 = recovery$indy$flow$197(initialValue90);
                java.lang.Object initialValue97 = recovery$indy$flow$198(initialValue90);
                char converted98 = (char) (loopLocal81);
                java.lang.Object initialValue99 = initialValue97;
                int initialValue100 = loopLocal82;
                int initialValue101 = (int) (converted98);
                int initialValue102 = loopLocal80;
                client.setting.SettingGroup initialValue103 = initialized95;
                java.lang.Object initialValue104 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue103))))));
                java.lang.Object initialValue105 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue99))))));
                java.lang.Object initialValue106 = recovery$indy$flow$201(initialValue104, initialValue102, (char) (initialValue101), initialValue100, initialValue105);
                java.lang.Object initialValue107 = initialValue106;
                java.lang.StringBuilder initialized108 = new java.lang.StringBuilder();
                java.lang.Object initialValue109 = initialValue90;
                java.lang.Object initialValue110 = ((java.lang.Object)(((net.C_477x) (((java.lang.Object)(initialValue109))))));
                java.lang.Object initialValue111 = recovery$indy$flow$206(initialValue110);
                java.lang.Object initialValue112 = recovery$indy$flow$207(initialized108, initialValue111);
                java.lang.Object initialValue113 = recovery$indy$flow$208(initialValue112, "CancelType");
                java.lang.Object initialValue114 = recovery$indy$flow$209(initialValue113);
                java.lang.Object initialValue115 = recovery$indy$flow$210(4);
                ((java.lang.Object[]) initialValue115)[0] = "None";
                ((java.lang.Object[]) initialValue115)[1] = "OnlyOnGround";
                ((java.lang.Object[]) initialValue115)[2] = "OnlyInAir";
                ((java.lang.Object[]) initialValue115)[3] = "Always";
                client.setting.ModeSetting initialized116 = new client.setting.ModeSetting((client.module.Module) (loopLocal72), (java.lang.String) (initialValue114), "None", (java.lang.String[]) (initialValue115), (client.setting.SettingGroup) (initialValue107), loopLocal79);
                java.lang.String initialValue117 = "CancelType";
                long initialValue118 = loopLocal74;
                client.setting.ModeSetting initialValue119 = initialized116;
                java.lang.Object initialValue120 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue119))))));
                java.lang.Object initialValue121 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue117))))));
                java.lang.Object initialValue122 = recovery$indy$flow$214(initialValue120, initialValue118, initialValue121);
                java.lang.Object initialValue123 = initialValue122;
                java.lang.Object initialValue124 = initialValue90;
                java.lang.Object initialValue125 = ((java.lang.Object)(((net.C_477x) (((java.lang.Object)(initialValue124))))));
                java.lang.Object initialValue126 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue123))))));
                java.lang.Object initialValue127 = recovery$indy$flow$217(initialValue125, initialValue126);
                java.lang.StringBuilder initialized128 = new java.lang.StringBuilder();
                java.lang.Object initialValue129 = initialValue90;
                java.lang.Object initialValue130 = ((java.lang.Object)(((net.C_477x) (((java.lang.Object)(initialValue129))))));
                java.lang.Object initialValue131 = recovery$indy$flow$222(initialValue130);
                java.lang.Object initialValue132 = recovery$indy$flow$223(initialized128, initialValue131);
                java.lang.Object initialValue133 = recovery$indy$flow$224(initialValue132, "PacketCount");
                java.lang.Object initialValue134 = recovery$indy$flow$225(initialValue133);
                client.setting.NumberSetting initialized135 = new client.setting.NumberSetting((client.module.Module) (loopLocal72), (java.lang.String) (initialValue134), Double.longBitsToDouble(4618441417868443648L), 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue107), loopLocal83);
                short converted136 = (short) (loopLocal77);
                int initialValue137 = (int) (converted136);
                int initialValue138 = loopLocal76;
                java.lang.String initialValue139 = "PacketCount";
                int initialValue140 = loopLocal75;
                client.setting.NumberSetting initialValue141 = initialized135;
                java.lang.Object initialValue142 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue141))))));
                java.lang.Object initialValue143 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue139))))));
                java.lang.Object initialValue144 = recovery$indy$flow$229(initialValue142, initialValue140, initialValue143, initialValue138, (short) (initialValue137));
                java.lang.Object initialValue145 = recovery$indy$flow$230(initialValue90);
                java.lang.Object initialValue146 = initialValue145;
                java.lang.Object initialValue147 = initialValue144;
                java.lang.Object initialValue148 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue147))))));
                java.lang.Object initialValue149 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue146))))));
                java.lang.Object initialValue150 = recovery$indy$flow$233(initialValue148, initialValue149);
                java.lang.Object initialValue151 = initialValue150;
                java.lang.Object initialValue152 = initialValue90;
                java.lang.Object initialValue153 = ((java.lang.Object)(((net.C_477x) (((java.lang.Object)(initialValue152))))));
                java.lang.Object initialValue154 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue151))))));
                java.lang.Object initialValue155 = recovery$indy$flow$236(initialValue153, initialValue154);
                int incremented156 = loopLocal87 + (1);
                if (loopLocal86 == null) {
                    Velocity_47Cc loopNext157 = loopLocal72;
                    long loopNext158 = loopLocal73;
                    long loopNext159 = loopLocal74;
                    int loopNext160 = loopLocal75;
                    int loopNext161 = loopLocal76;
                    int loopNext162 = loopLocal77;
                    long loopNext163 = loopLocal78;
                    long loopNext164 = loopLocal79;
                    int loopNext165 = loopLocal80;
                    int loopNext166 = loopLocal81;
                    int loopNext167 = loopLocal82;
                    long loopNext168 = loopLocal83;
                    java.lang.Object loopNext169 = loopLocal84;
                    int loopNext170 = loopLocal85;
                    java.lang.Object loopNext171 = loopLocal86;
                    int loopNext172 = incremented156;
                    loopLocal72 = loopNext157;
                    loopLocal73 = loopNext158;
                    loopLocal74 = loopNext159;
                    loopLocal75 = loopNext160;
                    loopLocal76 = loopNext161;
                    loopLocal77 = loopNext162;
                    loopLocal78 = loopNext163;
                    loopLocal79 = loopNext164;
                    loopLocal80 = loopNext165;
                    loopLocal81 = loopNext166;
                    loopLocal82 = loopNext167;
                    loopLocal83 = loopNext168;
                    loopLocal84 = loopNext169;
                    loopLocal85 = loopNext170;
                    loopLocal86 = loopNext171;
                    loopLocal87 = loopNext172;
                    continue loop88;
                } else {
                    break loop88;
                }
            }
        }
        return;
    }







    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$0(long a0,long a1);
    private static native boolean recovery$indy$flow$1(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$2(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$4(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$9(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$12(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$15(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$16(java.lang.Object a0,double a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$18(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$20(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$22(java.lang.Object a0,long a1,boolean a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$96(long a0,long a1);
    private static native float recovery$indy$flow$97(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$135(int a0);
    private static native java.lang.Object recovery$indy$flow$136();
    private static native java.lang.Object recovery$indy$flow$137();
    private static native java.lang.Object recovery$indy$flow$138();
    private static native java.lang.Object recovery$indy$flow$139();
    private static native java.lang.Object recovery$indy$flow$140();
    private static native java.lang.Object recovery$indy$flow$141();
    private static native java.lang.Object recovery$indy$flow$142();
    private static native java.lang.Object recovery$indy$flow$143();
    private static native java.lang.Object recovery$indy$flow$144();
    private static native java.lang.Object recovery$indy$flow$145();
    private static native java.lang.Object recovery$indy$flow$146();
    private static native java.lang.Object recovery$indy$flow$147();
    private static native java.lang.Object recovery$indy$flow$148();
    private static native java.lang.Object recovery$indy$flow$149();
    private static native java.lang.Object recovery$indy$flow$150();
    private static native java.lang.Object recovery$indy$flow$151();
    private static native java.lang.Object recovery$indy$flow$152();
    private static native void recovery$indy$flow$154(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$157(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$160(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$163(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$166(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$169(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$174(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$176(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$178();



    private static native java.lang.Object recovery$indy$flow$183(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$184(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$185();
    private static native void recovery$indy$flow$188(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$189(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.Velocity_47Cc) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$190(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.Velocity_47Cc) (a0)).field_43a = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$191();

    private static native java.lang.Object recovery$indy$flow$194(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$197(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$198(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$201(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);

    private static native java.lang.Object recovery$indy$flow$206(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$207(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$208(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$209(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native java.lang.Object recovery$indy$flow$210(int a0);


    private static native java.lang.Object recovery$indy$flow$214(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$217(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$222(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$223(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$224(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$225(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$229(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$230(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$233(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$236(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$12(long var0, long var2);
   private static native C_473U recovery$indy$13(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);
   private static native C_477x[] recovery$indy$15(long var0, long var2);
   private static native boolean recovery$indy$16(Object var0, long var1, Object var3, long var4, long var6);
   private static native NumberSetting recovery$indy$17(Object var0, long var1, long var3);
   private static native double recovery$indy$18(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$19(Object var0, int var1, long var2, long var4);
   private static native C_477x[] recovery$indy$20(long var0, long var2);
   private static native int recovery$indy$21(Object var0, int var1, long var2, long var4);
   private static native C_477x[] recovery$indy$22(long var0, long var2);
   private static native Class recovery$indy$23(Object var0, long var1, long var3);
   private static native boolean recovery$indy$24(Object var0, long var1, Object var3, long var4, long var6);
   private static native int recovery$indy$25(Object var0, long var1, long var3);
   private static native int recovery$indy$26(Object var0, long var1, long var3);
   private static native int[] recovery$indy$27(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);
   private static native boolean recovery$indy$29(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$30(Object var0, long var1, long var3);
   private static native boolean recovery$indy$31(Object var0, long var1, long var3);
   private static native boolean recovery$indy$32(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$33(Object var0, long var1, long var3);
   private static native int[] recovery$indy$34(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$35(Object var0, long var1, long var3);
   private static native boolean recovery$indy$36(Object var0, long var1, long var3, long var5);
   private static native C_473U recovery$indy$37(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$38(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$39(Object var0, long var1, long var3);
   private static native void recovery$indy$40(Object var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$41(Object var0, long var1, long var3);
   private static native String recovery$indy$42(int var0, long var1);
   private static native String recovery$indy$43(int var0, long var1);
   private static native void recovery$indy$46(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$47(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$48(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$49(Object var0, int var1, long var2, long var4, long var6);
   private static native String recovery$indy$50(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$51(Object var0, long var1, Object var3, long var4, long var6);
   private static native MethodHandle recovery$constant$54();
}
