package augustus.recovered.modules.legit;
import augustus.recovered.modules.combat.KillAura_47CY;
import augustus.recovered.modules.misc.Fixes_47ks;
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
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40g;
import net.C_45V;
import net.C_45n;
import net.C_473U;
import net.C_4749;
import net.C_475c;
import net.C_477r;
import net.C_477z;
import net.C_479E;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Ij;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47S6;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47oo;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47sc;
import net.C_47si;
import client.module.Category;
import net.C_47zh;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoBlock_47CW extends client.module.Module implements net.C_47UH,net.C_47mz,net.C_47si {
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingStartBlockingAdditionalRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaximumPlayerHurtTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaximumHurtTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingTicksToTryHitAfterUnblock = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMaximumLagDuration = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyOnRightClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingIgnoreDeadTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingForceHit = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInteractAutoBlock = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.atomic.AtomicBoolean field_445 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.atomic.AtomicBoolean field_447 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$426c33b229(C_477z var1, long var2) {
      boolean var4 = recovery$indy$1(8140626666222233804L, var2);
      Entity var10000 = recovery$indy$2(var1, 8133997123572006166L, var2);
      if (var4) {
         if (!(var10000 instanceof EntityLivingBase)) {
            return;
         }

         var10000 = recovery$indy$3(var1, 8133997123572006166L, var2);
      }

      EntityLivingBase var5 = (EntityLivingBase)var10000;
      this.field_48 = var5;
      recovery$indy$4(this.field_45, 8140496758761564567L, var2);
   }



   public void method_41$fae8de1664(net.C_475c var1) {
      long var2 = a ^ 20576467221574L;
      long var4 = var2 ^ 44465248595198L;
      long var10001 = var2 ^ 29989140225279L;
      int var6 = (int)((var2 ^ 29989140225279L) >>> 32);
      int var7 = (int)((var2 ^ 29989140225279L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 83893251425765L;
      long var11 = var2 ^ 22084335986032L;
      var10001 = var2 ^ 102957100415343L;
      int var13 = (int)((var2 ^ 102957100415343L) >>> 32);
      int var14 = (int)((var2 ^ 102957100415343L) << 32 >>> 56);
      int var15 = (int)(var10001 << 40 >>> 40);
      long var16 = var2 ^ 59960687082224L;
      long var18 = var2 ^ 122648571822682L;
      long var20 = var2 ^ 87315801219379L;
      long var10002 = -6875775646589117696L;
      long var25 = var18;
      AutoBlock_47CW var27 = this;
      var27.method_45$e45a9973e5(var25);
      long var10000 = -6874935288314431326L;
      boolean var121 = AimBot_47O_.method_45i$aae029aa0a();
      long var10004 = -6874814933500482507L;
      long var28 = var20;
      AutoBlock_47CW var30 = this;
      this.field_445.set(var30.method_446$0dd78e0064(var28));
      boolean var22 = var121;
      if (!var22) {
         this.field_42--;
      } else {
         if (this.field_445.get()) {
            var10002 = -6876771047168184628L;
            long var31 = var11;
            client.setting.ModeSetting var33 = this.settingMode;
            switch (var33.method_46$5f9dc63072(var31)) {
               case "Default":
                  var10004 = -6877746393259020460L;
                  int var34 = var8;
                  int var35 = var7;
                  int var36 = var6;
                  AutoBlock_47CW var37 = this;
                  if (!var37.method_44i$ca7981a620(var36, var35, var34)) {
                     var10002 = -6877480464366981727L;
                     boolean var38 = false;
                     net.C_475c var39 = var1;
                     var39.method_45$f633c984d8(var38);
                  } else {
                     var10002 = -6878826139504690540L;
                     long var40 = var9;
                     AutoBlock_47CW var42 = this;
                     if (!var42.method_48$0dd78e0064(var40)) {
                        var10001 = -6875143027125765712L;
                        net.minecraft.client.Minecraft var43 = field_43;
                        if (!var43.field_42P.method_436$aae029aa0a()) {
                           byte var157 = (byte)var14;
                           long var163 = -6878911024993720826L;
                           int var44 = var15;
                           byte var45 = var157;
                           net.C_475c var46 = var1;
                           int var47 = var13;
                           AutoBlock_47CW var48 = this;
                           var48.method_47$9a86c78c61(var47, var46, var45, var44);
                        } else {
                           var10002 = -6877480464366981727L;
                           boolean var49 = true;
                           net.C_475c var50 = var1;
                           var50.method_45$f633c984d8(var49);
                        }
                     } else {
                        long var158 = -6877522456455673557L;
                        long var51 = var4;
                        client.setting.NumberSetting var53 = this.settingTicksToTryHitAfterUnblock;
                        this.field_42 = (int)var53.method_44$474dfaa627(var51);
                        var10002 = -6877480464366981727L;
                        boolean var54 = false;
                        net.C_475c var55 = var1;
                        var55.method_45$f633c984d8(var54);
                        var10001 = -6877594587810701287L;
                        client.setting.BooleanSetting var56 = this.settingForceHit;
                        if (var56.method_49$aae029aa0a()) {
                           var10002 = -6875850134103112354L;
                           long var57 = var16;
                           AutoBlock_47CW var59 = this;
                           if (var59.method_44q$0dd78e0064(var57)) {
                              var10001 = -6878621617100103620L;
                              net.C_475c var60 = var1;
                              if (var60.method_48$8abf5c6871() <= 0) {
                                 var10001 = -6879186249376262085L;
                                 net.minecraft.client.Minecraft var61 = field_43;
                                 if (var61.field_44r.field_44l.method_49$8abf5c6871() <= 0) {
                                    var10001 = -6875143027125765712L;
                                    net.minecraft.client.Minecraft var62 = field_43;
                                    if (!var62.field_42P.method_436$aae029aa0a()) {
                                       var10002 = -6875175432873767788L;
                                       byte var63 = 1;
                                       net.C_475c var64 = var1;
                                       var64.method_44$d00df7729d(var63);
                                       var10002 = -6878340078237809204L;
                                       boolean var65 = true;
                                       net.C_475c var66 = var1;
                                       var66.method_46$f633c984d8(var65);
                                    }
                                 }
                              }
                           }
                        }

                        var10001 = -6878621617100103620L;
                        net.C_475c var67 = var1;
                        if (var67.method_48$8abf5c6871() <= 0) {
                           var10001 = -6879186249376262085L;
                           net.minecraft.client.Minecraft var68 = field_43;
                           if (var68.field_44r.field_44l.method_49$8abf5c6871() <= 0) {
                              break;
                           }
                        }

                        var10002 = -6875850134103112354L;
                        long var69 = var16;
                        AutoBlock_47CW var71 = this;
                        if (var71.method_44q$0dd78e0064(var69)) {
                           var10001 = -6875143027125765712L;
                           net.minecraft.client.Minecraft var72 = field_43;
                           if (!var72.field_42P.method_436$aae029aa0a()) {
                              byte var159 = (byte)var14;
                              long var164 = -6878911024993720826L;
                              int var73 = var15;
                              byte var74 = var159;
                              net.C_475c var75 = var1;
                              int var76 = var13;
                              AutoBlock_47CW var77 = this;
                              var77.method_47$9a86c78c61(var76, var75, var74, var73);
                              this.field_43y = 6;
                           }
                        }
                     }
                  }
                  break;
               case "Lag":
                  var10004 = -6877746393259020460L;
                  int var78 = var8;
                  int var79 = var7;
                  int var80 = var6;
                  AutoBlock_47CW var81 = this;
                  if (!var81.method_44i$ca7981a620(var80, var79, var78)) {
                     var10002 = -6877480464366981727L;
                     boolean var82 = false;
                     net.C_475c var83 = var1;
                     var83.method_45$f633c984d8(var82);
                     this.field_447.set(false);
                     this.field_43a = false;
                  } else {
                     var10002 = -6878826139504690540L;
                     long var84 = var9;
                     AutoBlock_47CW var86 = this;
                     if (!var86.method_48$0dd78e0064(var84)) {
                        if (!this.field_447.get()) {
                           byte var10003 = (byte)var14;
                           long var10005 = -6878911024993720826L;
                           int var87 = var15;
                           byte var88 = var10003;
                           net.C_475c var89 = var1;
                           int var90 = var13;
                           AutoBlock_47CW var91 = this;
                           var91.method_47$9a86c78c61(var90, var89, var88, var87);
                           this.field_447.set(true);
                           this.field_43a = false;
                        } else {
                           var10002 = -6877480464366981727L;
                           boolean var92 = false;
                           net.C_475c var93 = var1;
                           var93.method_45$f633c984d8(var92);
                        }
                     } else {
                        label196: {
                           long var155 = -6877522456455673557L;
                           long var94 = var4;
                           client.setting.NumberSetting var96 = this.settingTicksToTryHitAfterUnblock;
                           this.field_42 = (int)var96.method_44$474dfaa627(var94);
                           var10002 = -6877480464366981727L;
                           boolean var97 = false;
                           net.C_475c var98 = var1;
                           var98.method_45$f633c984d8(var97);
                           var10001 = -6877594587810701287L;
                           client.setting.BooleanSetting var99 = this.settingForceHit;
                           if (var99.method_49$aae029aa0a()) {
                              var10002 = -6875850134103112354L;
                              long var100 = var16;
                              AutoBlock_47CW var102 = this;
                              if (var102.method_44q$0dd78e0064(var100)) {
                                 var10001 = -6878621617100103620L;
                                 net.C_475c var103 = var1;
                                 if (var103.method_48$8abf5c6871() <= 0) {
                                    var10001 = -6879186249376262085L;
                                    net.minecraft.client.Minecraft var104 = field_43;
                                    if (var104.field_44r.field_44l.method_49$8abf5c6871() <= 0) {
                                       var10001 = -6875143027125765712L;
                                       net.minecraft.client.Minecraft var105 = field_43;
                                       if (!var105.field_42P.method_436$aae029aa0a()) {
                                          var10002 = -6875175432873767788L;
                                          byte var106 = 1;
                                          net.C_475c var107 = var1;
                                          var107.method_44$d00df7729d(var106);
                                          var10002 = -6878340078237809204L;
                                          boolean var108 = true;
                                          net.C_475c var109 = var1;
                                          var109.method_46$f633c984d8(var108);
                                       }
                                    }
                                 }
                              }
                           }

                           var10001 = -6878621617100103620L;
                           net.C_475c var110 = var1;
                           if (var110.method_48$8abf5c6871() <= 0) {
                              var10001 = -6879186249376262085L;
                              net.minecraft.client.Minecraft var111 = field_43;
                              if (var111.field_44r.field_44l.method_49$8abf5c6871() <= 0) {
                                 break label196;
                              }
                           }

                           var10002 = -6875850134103112354L;
                           long var112 = var16;
                           AutoBlock_47CW var114 = this;
                           if (var114.method_44q$0dd78e0064(var112)) {
                              var10001 = -6875143027125765712L;
                              net.minecraft.client.Minecraft var115 = field_43;
                              if (!var115.field_42P.method_436$aae029aa0a()) {
                                 byte var156 = (byte)var14;
                                 long var162 = -6878911024993720826L;
                                 int var116 = var15;
                                 byte var117 = var156;
                                 net.C_475c var118 = var1;
                                 int var119 = var13;
                                 AutoBlock_47CW var120 = this;
                                 var120.method_47$9a86c78c61(var119, var118, var117, var116);
                                 this.field_447.set(true);
                                 this.field_43a = false;
                                 this.field_43y = 6;
                              }
                           }
                        }
                     }
                  }
            }
         }

         this.field_43y--;
         this.field_42--;
      }
   }










   private static void method_40$da8c82d5d4() {
      long var0 = a ^ 89642715197014L;
      long var2 = var0 ^ 73142576048361L;
      long var10000 = 8252584594617838258L;
      boolean var4 = AimBot_47O_.method_45i$aae029aa0a();
      Minecraft var17 = field_43;
      if (var4) {
         long var10001 = 8257635754661327224L;
         Minecraft var6 = field_43;
         if (var6.field_44K.method_47$aae029aa0a()) {
            long var10002 = 8252175108592147761L;
            long var7 = var2;
            Fixes_47ks var9 = ClientGlobals.field_48.field_44Z;
            if (!var9.method_48$0dd78e0064(var7)) {
               return;
            }
         }

         long var22 = 8258405247444845459L;
         byte var10 = 4;
         Minecraft var11 = field_43;
         var11.field_44H = var10;
         var17 = field_43;
      }

      long var19 = 8252519652934871968L;
      Minecraft var12 = var17;
      C_47rf var5 = var12.field_42P.field_42X.method_46$ac4db64966();
      if (var5 != null) {
         Minecraft var18 = field_43;
         if (var4) {
            var19 = 8257635754661327224L;
            Minecraft var13 = field_43;
            long var23 = 8252519652934871968L;
            Minecraft var14 = field_43;
            long var10003 = 8252364323532133535L;
            Minecraft var15 = field_43;
            if (!var13.field_44K.method_44$70851ff417(var14.field_42P, var15.field_44Q, var5)) {
               return;
            }

            var18 = field_43;
         }

         var19 = 8259459310254471545L;
         Minecraft var16 = var18;
         var16.field_44a.field_45I.method_49$da8c82d5d4();
      }
   }




   public void method_40$e781d6169a(C_47zh var1, long var2) {
      augustus.recovered.modules.legit.AutoBlock_47CW var11;
      long var4 = var2 ^ 140312153485846L;
      long var6 = var2 ^ 27738005618893L;
      boolean var8 = recovery$indy$5(8499201931043974598L, var2);
      boolean var10000 = this.field_445.get();
      if (var8) {
         if (!var10000) {
            return;
         }

         var10000 = this.field_447.get();
      }

      if (var8) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$6(this, 8499412243488773755L, var2);
      }

      if (var10000) {
         C_473U var9;
         boolean var10001;
         label80: {
            var9 = recovery$indy$7(var1, 8496751367151720517L, var2);
            var10000 = recovery$indy$9(this.field_47, recovery$indy$8(this.settingMaximumLagDuration, 8496833673336652177L, var2), var4, 8497347489862078187L, var2);
            label79:
            if (var8) {
               if (var10000) {
                  var10000 = this.field_43a;
                  var10001 = var8;
                  if (var2 < 0L) {
                     break label80;
                  }

                  if (!var8) {
                     break label79;
                  }

                  if (this.field_43a) {
                     this.field_43a = false;
                     this.field_447.set(false);
                  }
               }

               var10000 = this.field_43a;
            }

            var10001 = var8;
         }

         if (var2 >= 0L) {
            if (var10001) {
               if (var10000) {
                  recovery$indy$10(var1, var6, true, 8497188262234215220L, var2);
               }

               var10000 = var9 instanceof C_479E;
            }

            var10001 = var8;
         }

         label97: {
            if (var10001) {
               if (!var10000) {
                  return;
               }

               var11 = this;
               if (!var8) {
                  break label97;
               }

               var10000 = this.field_43a;
            }

            if (var10000) {
               return;
            }

            this.field_43a = true;
            recovery$indy$11(this.field_47, 8499050465533406365L, var2);
            var11 = this;
         }

         recovery$indy$12(var11.settingMaximumLagDuration, 8497950534896132482L, var2);
      }
   }




   private boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 129931912541657L;
      long var5 = var1 ^ 78890972188201L;
      long var7 = var1 ^ 115261106627543L;
      boolean var9 = recovery$indy$13(-5067219871614369621L, var1);
      double var11;
      int var10000 = (var11 = this.field_48.field_43h - recovery$indy$14(this.settingMaximumHurtTime, var3, -5068379583576469492L, var1)) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
      if (!var9) {
         if (var10000 > 0) {
            return false;
         }

         var10000 = this.field_43y;
      }

      boolean var10001 = var9;
      if (var1 > 0L) {
         if (!var9) {
            if (var10000 > 0) {
               return false;
            }

            var10000 = (int) ((recovery$indy$15(this, var7, -5065620599132169095L, var1)) ? 1 : 0);
         }

         var10001 = var9;
      }

      if (var10001) {
         return var10000 != 0;
      } else if (var10000 != 0) {
         return true;
      } else {
         byte var12 = (byte) ((recovery$indy$16(this, var5, 1, -5065873841532797466L, var1)) ? 1 : 0);
         if (var9) {
            return var12 != 0;
         } else if (var12 != 0) {
            return true;
         } else {
            return (boolean)(var9 ? this.field_42 : this.field_42 > 0);
         }
      }
   }



   private boolean method_49$05d3808578(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 97015979019876L;
      boolean var6 = recovery$indy$17(7730089629372240448L, var1);
      C_47Ij var7 = C_47sc.method_46$1325436483(
         var3, recovery$indy$18(ClientGlobals.field_46, 7735396796542727024L, var1), recovery$indy$19(this, var4, 7736234055041235478L, var1)
      );
      C_47Ij var10000 = var7;
      if (!var6) {
         if (var7 == null) {
            return false;
         }

         var10000 = var7;
      }

      if (!var6) {
         if (var10000.field_49 != C_47Az.ENTITY) {
            return false;
         }

         var10000 = var7;
      }

      return var6 ? var10000.field_47 instanceof EntityLivingBase : var10000.field_47 instanceof EntityLivingBase;
   }



   private double method_45$474dfaa627(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 55017400154033L;
      boolean var5 = recovery$indy$20(-5052896241759289114L, var1);
      boolean var10000 = recovery$indy$21(ClientGlobals.field_48.field_41L, var3, -5045701403186812673L, var1);
      if (!var5) {
         if (var10000) {
            return recovery$indy$22(ClientGlobals.field_48.field_41L, -5052487807828519294L, var1);
         }

         var10000 = recovery$indy$23(field_43, -5052192818867668478L, var1).method_40$aae029aa0a();
      }

      return var10000 ? 4.5 : 3.0;
   }



   private boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$24(-6743773571892151716L, var1);
      boolean var10000 = recovery$indy$25(this.settingOnlyOnRightClick, -6740763547775540505L, var1);
      if (var3) {
         if (var10000) {
            var10000 = recovery$indy$26(field_43, -6740155946709411131L, var1).field_45w.method_43$aae029aa0a();
            if (!var3) {
               return var10000;
            }

            if (!var10000) {
               var10000 = recovery$indy$27(field_43, -6740155946709411131L, var1).field_45w.method_42$aae029aa0a();
               if (!var3) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }



   private void method_45$e45a9973e5(long var1) {
      boolean var38;
      net.minecraft.entity.EntityLivingBase var40;
      var1 = a ^ var1;
      long var3 = var1 ^ 125339175554352L;
      long var5 = var1 ^ 94474558567014L;
      long var7 = var1 ^ 118640649189866L;
      long var9 = var1 ^ 50770003319600L;
      long var10000 = -4751527009872484806L;
      boolean var11 = AimBot_47O_.method_45i$aae029aa0a();
      AutoBlock_47CW var36 = this;
      if (var11) {
         long var10003 = -4751102998693182185L;
         long var13 = var7;
         long var15 = 600L;
         C_47cu var17 = this.field_45;
         if (var17.method_42$b0e346e6e3(var15, var13)) {
            this.field_48 = null;
         }

         var36 = this;
      }

      label109: {
         label113: {
            label114: {
               boolean var10001 = var11;
               if (var1 >= 0L) {
                  if (var11) {
                     label102:
                     if (var36.field_48 == null) {
                        long var46 = -4750444001558651040L;
                        C_47S6 var18 = ClientGlobals.field_46;
                        C_477r var10002 = var18.method_44$4f8050086d();
                        long var10005 = -4750849378767815746L;
                        double var19 = 1.0;
                        double var21 = 6.0;
                        C_477r var23 = var10002;
                        float var24 = 1.0F;
                        long var25 = var3;
                        C_47Ij var12 = C_4749.method_46$1717e11ba9(var25, var24, var23, var21, var19);
                        C_47Ij var37 = var12;
                        var10001 = var11;
                        if (var1 >= 0L) {
                           if (var11) {
                              if (var12 == null) {
                                 break label102;
                              }

                              var37 = var12;
                           }

                           var10001 = var11;
                        }

                        if (var10001) {
                           if (var37.field_49 != C_47Az.ENTITY) {
                              break label102;
                           }

                           var37 = var12;
                        }

                        var38 = var37.field_47 instanceof EntityLivingBase;
                        if (!var11) {
                           break label114;
                        }

                        if (var38) {
                           this.field_48 = (EntityLivingBase)var12.field_47;
                        }
                     }

                     var36 = this;
                  }

                  var10001 = var11;
               }

               if (!var10001) {
                  break label113;
               }

               long var43 = -4749716830845862271L;
               BooleanSetting var27 = var36.settingIgnoreDeadTargets;
               var38 = var27.method_49$aae029aa0a();
            }

            if (var38) {
               var40 = this.field_48;
               if (!var11) {
                  break label109;
               }

               if (this.field_48 != null) {
                  var40 = this.field_48;
                  if (!var11) {
                     break label109;
                  }

                  if (this.field_48.field_427) {
                     this.field_48 = null;
                  }
               }
            }

            var36 = this;
         }

         var40 = var36.field_48;
      }

      if (var40 != null) {
         long var44 = -4751605145761863896L;
         Minecraft var28 = field_43;
         double var41 = var28.field_42P.method_40$ee256e8a75(this.field_48);
         long var47 = -4753292177256747198L;
         long var29 = var9;
         AutoBlock_47CW var31 = this;
         double var45 = var31.method_45$474dfaa627(var29);
         long var10004 = -4749507189798332493L;
         long var32 = var5;
         NumberSetting var34 = this.settingStartBlockingAdditionalRange;
         if (var41 > var45 + var34.method_44$474dfaa627(var32)) {
            this.field_48 = null;
         }
      }
   }




   private void method_47$9a86c78c61(int var1, C_475c var2, byte var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ a;
      boolean var7 = recovery$indy$28(4988331922293497103L, var5);
      C_475c var10000 = var2;
      if (var7) {
         recovery$indy$29(var2, 1, 4981814961363384866L, var5);
         if (recovery$indy$30(this.settingInteractAutoBlock, 4981174267326956980L, var5)) {
            return;
         }

         var10000 = var2;
      }

      recovery$indy$32(var10000, recovery$indy$31(), 4981241639994700891L, var5);
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$33(this, 7, 90000, var3, -7102875103110798754L, var1);
      recovery$indy$34(this, 25, var5, -7101296289122501821L, var1);
      recovery$indy$35(this, 1, var5, -7101296289122501821L, var1);
   }



   private boolean method_44V$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 26398430732729L;
      long var5 = var1 ^ 140456168843794L;
      boolean var7 = recovery$indy$36(3452197853874198254L, var1);
      boolean var10000 = recovery$indy$37(ClientGlobals.field_48.field_48Q, var3, 3454889033797058295L, var1);
      if (!var7) {
         label33:
         if (var10000) {
            KillAura_47CY var9 = ClientGlobals.field_48.field_48Q;
            if (!var7) {
               if (ClientGlobals.field_48.field_48Q.field_45z == null) {
                  break label33;
               }

               var9 = ClientGlobals.field_48.field_48Q;
            }

            var10000 = recovery$indy$38(var9.field_492, var5, 3455006940262162862L, var1).equals(recovery$indy$39(10451, 6880127372326791303L ^ var1));
            if (var7) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   private boolean method_44q$0dd78e0064(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$40(-4132766932579770736L, var1);
      C_47Ij var10000 = recovery$indy$41(field_43, -4132420460369259652L, var1);
      if (var3) {
         if (var10000 == null) {
            return false;
         }

         var10000 = recovery$indy$42(field_43, -4132420460369259652L, var1);
      }

      if (var3) {
         if (var10000.field_49 != C_47Az.ENTITY) {
            return false;
         }

         var10000 = recovery$indy$43(field_43, -4132420460369259652L, var1);
      }

      return !var3 ? var10000.field_47 instanceof EntityLivingBase : var10000.field_47 instanceof EntityLivingBase;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   private boolean method_446$0dd78e0064(long var1) {
      long var3;
      boolean var10;
      AutoBlock_47CW var12;
      boolean var10001;
      label55: {
         label60: {
            var1 = a ^ var1;
            var3 = var1 ^ 40418366205521L;
            long var5 = var1 ^ 87982083908557L;
            long var7 = (var1 ^ 107318318748758L) >>> 16;
            int var9 = (int)((var1 ^ 107318318748758L) << 48 >>> 48);
            var10 = recovery$indy$44(6736150818757796989L, var1);
            boolean var10000 = recovery$indy$45(this, var5, 6728797656082000988L, var1);
            if (!var10) {
               if (!var10000) {
                  return false;
               }

               var12 = this;
               var10001 = var10;
               if (var1 <= 0L) {
                  break label55;
               }

               if (var10) {
                  break label60;
               }

               var10000 = recovery$indy$46(this, var7, (char)var9, 6735662592147407766L, var1);
            }

            if (!var10000) {
               return false;
            }

            var12 = this;
         }

         var10001 = var10;
      }

      if (!var10001) {
         if (var12.field_48 == null) {
            return false;
         }

         var12 = this;
      }

      boolean var13 = recovery$indy$47(var12, var3, 6729514619662985065L, var1);
      return var10 ? var13 : var13;
   }



   private boolean method_44R$5eec879a9c(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      boolean var6 = recovery$indy$48(6193149002702949831L, var4);
      C_47rf var10000 = recovery$indy$49(field_43, 6193499680106532053L, var4).method_41$ac4db64966();
      if (var6) {
         if (var10000 == null) {
            return false;
         }

         var10000 = recovery$indy$50(field_43, 6193499680106532053L, var4).method_41$ac4db64966();
      }

      boolean var7 = var10000.method_48$dbd570a038() instanceof C_45V;
      return !var6 ? var7 : var7;
   }



   private boolean method_44i$ca7981a620(int var1, int var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 36450011868355L;
      boolean var8 = recovery$indy$51(2353794437062260895L, var4);
      double var9;
      int var10000 = (
               var9 = recovery$indy$52(field_43, 2354147311207102861L, var4).field_432 - recovery$indy$53(this.settingMaximumPlayerHurtTime, var6, 2356271653839341846L, var4)
            )
            == 0.0
         ? 0
         : (var9 < 0.0 ? -1 : 1);
      if (var8) {
         var10000 = var10000 <= 0 ? 1 : 0;
      }

      return var10000 != 0;
   }



   private boolean method_44y$aae029aa0a() {
      long var1 = a ^ 21413853938626L;
      long var3 = var1 ^ 24030093302516L;
      long var10002 = 2239640202051440968L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Lag");
   }



    public AutoBlock_47CW(long a0) {
        super((java.lang.String) ("AutoBlock"),(java.lang.String) ("AutomatisiertesBlockieren"),(long) (((augustus.recovered.modules.legit.AutoBlock_47CW.a ^ a0) ^ 34698294547829L)),(java.awt.Color) (java.awt.Color.green),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.legit.AutoBlock_47CW.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.legit.AutoBlock_47CW.a ^ a0) ^ 133875197602285L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.legit.AutoBlock_47CW.a ^ a0) ^ 133875197602285L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.legit.AutoBlock_47CW.a ^ a0) ^ 133875197602285L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.legit.AutoBlock_47CW.a ^ a0) ^ 92611355190712L);
        long constructorKey7 = ((augustus.recovered.modules.legit.AutoBlock_47CW.a ^ a0) ^ 95415733238920L);
        long constructorKey8 = ((augustus.recovered.modules.legit.AutoBlock_47CW.a ^ a0) ^ 121677768001902L);
        long constructorKey9 = ((augustus.recovered.modules.legit.AutoBlock_47CW.a ^ a0) ^ 74708330460905L);
        int constructorPart10 = (int) ((((augustus.recovered.modules.legit.AutoBlock_47CW.a ^ a0) ^ 139496264470472L) >>> 32));
        long constructorKey11 = ((((augustus.recovered.modules.legit.AutoBlock_47CW.a ^ a0) ^ 139496264470472L) << 32) >>> 32);
        java.lang.Object initialValue12 = recovery$indy$flow$354(2);
        ((java.lang.Object[]) initialValue12)[0] = "Default";
        ((java.lang.Object[]) initialValue12)[1] = "Lag";
        client.setting.ModeSetting initialized13 = new client.setting.ModeSetting(this, "Mode", constructorKey6, "Default", (java.lang.String[]) (initialValue12));
        recovery$indy$flow$356(this, initialized13);
        client.setting.NumberSetting initialized14 = new client.setting.NumberSetting(this, "StartBlockingAdditionalRange", Double.longBitsToDouble(4602678819172646912L), constructorKey9, 0.0D, Double.longBitsToDouble(4611686018427387904L), 2);
        recovery$indy$flow$359(this, initialized14);
        client.setting.NumberSetting initialized15 = new client.setting.NumberSetting(this, "MaximumPlayerHurtTime", Double.longBitsToDouble(4616189618054758400L), constructorKey9, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4621819117588971520L), 0);
        recovery$indy$flow$362(this, initialized15);
        client.setting.NumberSetting initialized16 = new client.setting.NumberSetting(this, "MaximumHurtTime", 1.0D, constructorKey9, Double.longBitsToDouble(4616189618054758400L), 0.0D, 0);
        recovery$indy$flow$365(this, initialized16);
        client.setting.NumberSetting initialized17 = new client.setting.NumberSetting(this, "TicksToTryHitAfterUnblock", Double.longBitsToDouble(4611686018427387904L), constructorKey9, 0.0D, Double.longBitsToDouble(4616189618054758400L), 0);
        recovery$indy$flow$368(this, initialized17);
        short converted18 = (short) (constructorPart4);
        short converted19 = (short) (constructorPart5);
        client.setting.RangeSetting initialized20 = new client.setting.RangeSetting(constructorPart3, this, "MaximumLagDuration", Double.longBitsToDouble(4643000109586448384L), Double.longBitsToDouble(4644864881307156480L), converted18, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, converted19);
        long initialValue21 = constructorKey7;
        client.setting.RangeSetting initialValue22 = initialized20;
        java.lang.Object initialValue23 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue22))))));
        java.lang.Object initialValue24 = recovery$indy$flow$372(initialValue23, initialValue21);
        java.lang.Object initialValue25 = recovery$indy$flow$373(this);
        long initialValue26 = constructorKey11;
        java.lang.Object initialValue27 = initialValue25;
        int initialValue28 = constructorPart10;
        java.lang.Object initialValue29 = initialValue24;
        java.lang.Object initialValue30 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue29))))));
        java.lang.Object initialValue31 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue27))))));
        java.lang.Object initialValue32 = recovery$indy$flow$376(initialValue30, initialValue28, initialValue31, initialValue26);
        recovery$indy$flow$377(this, initialValue32);
        client.setting.BooleanSetting initialized33 = new client.setting.BooleanSetting(this, constructorKey8, "OnlyOnRightClick", true);
        recovery$indy$flow$380(this, initialized33);
        client.setting.BooleanSetting initialized34 = new client.setting.BooleanSetting(this, constructorKey8, "IgnoreDeadTargets", true);
        recovery$indy$flow$383(this, initialized34);
        client.setting.BooleanSetting initialized35 = new client.setting.BooleanSetting(this, constructorKey8, "ForceHit", true);
        recovery$indy$flow$386(this, initialized35);
        client.setting.BooleanSetting initialized36 = new client.setting.BooleanSetting(this, constructorKey8, "InteractAutoBlock", true);
        recovery$indy$flow$389(this, initialized36);
        java.util.concurrent.atomic.AtomicBoolean initialized37 = new java.util.concurrent.atomic.AtomicBoolean(false);
        recovery$indy$flow$392(this, initialized37);
        net.C_47cu initialized38 = new net.C_47cu();
        recovery$indy$flow$395(this, initialized38);
        net.C_47cu initialized39 = new net.C_47cu();
        recovery$indy$flow$398(this, initialized39);
        recovery$indy$flow$399(this, 0);
        recovery$indy$flow$400(this, 0);
        java.util.concurrent.atomic.AtomicBoolean initialized40 = new java.util.concurrent.atomic.AtomicBoolean(false);
        recovery$indy$flow$403(this, initialized40);
        recovery$indy$flow$404(this, false);
    }





    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$354(int a0);
    private static native void recovery$indy$flow$356(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$359(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$362(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$365(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$368(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$372(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$373(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$376(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$377(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$380(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$383(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$386(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$389(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$392(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$395(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$398(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$399(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoBlock_47CW) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$400(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoBlock_47CW) (a0)).field_42 = a1;
        return;
    }
    private static native void recovery$indy$flow$403(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$404(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoBlock_47CW) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native Entity recovery$indy$2(Object var0, long var1, long var3);
   private static native Entity recovery$indy$3(Object var0, long var1, long var3);
   private static native void recovery$indy$4(Object var0, long var1, long var3);
   private static native boolean recovery$indy$5(long var0, long var2);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native C_473U recovery$indy$7(Object var0, long var1, long var3);
   private static native int recovery$indy$8(Object var0, long var1, long var3);
   private static native boolean recovery$indy$9(Object var0, long var1, long var3, long var5, long var7);
   private static native void recovery$indy$10(Object var0, long var1, boolean var3, long var4, long var6);
   private static native void recovery$indy$11(Object var0, long var1, long var3);
   private static native double recovery$indy$12(Object var0, long var1, long var3);
   private static native boolean recovery$indy$13(long var0, long var2);
   private static native double recovery$indy$14(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$16(Object var0, long var1, int var3, long var4, long var6);
   private static native boolean recovery$indy$17(long var0, long var2);
   private static native C_477r recovery$indy$18(Object var0, long var1, long var3);
   private static native double recovery$indy$19(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$20(long var0, long var2);
   private static native boolean recovery$indy$21(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$22(Object var0, long var1, long var3);
   private static native C_40g recovery$indy$23(Object var0, long var1, long var3);
   private static native boolean recovery$indy$24(long var0, long var2);
   private static native boolean recovery$indy$25(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$26(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$27(Object var0, long var1, long var3);
   private static native boolean recovery$indy$28(long var0, long var2);
   private static native void recovery$indy$29(Object var0, int var1, long var2, long var4);
   private static native boolean recovery$indy$30(Object var0, long var1, long var3);
   private static native Runnable recovery$indy$31();
   private static native void recovery$indy$32(Object var0, Object var1, long var2, long var4);
   private static native void recovery$indy$33(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$34(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$35(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$36(long var0, long var2);
   private static native boolean recovery$indy$37(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$38(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$39(int var0, long var1);
   private static native boolean recovery$indy$40(long var0, long var2);
   private static native C_47Ij recovery$indy$41(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$42(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$43(Object var0, long var1, long var3);
   private static native boolean recovery$indy$44(long var0, long var2);
   private static native boolean recovery$indy$45(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$46(Object var0, long var1, char var3, long var4, long var6);
   private static native boolean recovery$indy$47(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$48(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$49(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$50(Object var0, long var1, long var3);
   private static native boolean recovery$indy$51(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$52(Object var0, long var1, long var3);
   private static native double recovery$indy$53(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$55();
}
