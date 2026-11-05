package augustus.recovered.modules.movement;
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
import net.C_45n;
import net.C_473U;
import net.C_474i;
import net.C_475e;
import net.C_475y;
import net.C_478Q;
import net.C_479J;
import net.C_47AI;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47EB;
import net.C_47EN;
import net.C_47EX;
import net.C_47Em;
import net.C_47Ep;
import net.C_47JC;
import net.C_47JO;
import net.C_47JX;
import net.C_47Jf;
import net.C_47Ji;
import net.C_47Jn;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47UZ;
import net.C_47Xe;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import client.ClientGlobals;
import net.C_47sk;
import client.module.Category;
import net.C_47xZ;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class VClip_47Qi extends client.module.Module implements net.C_47xz,net.C_47iC {
    public final client.setting.NumberSetting settingDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSmartDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMaxSmartDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDistanceToHeadBlock = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingIntave = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private boolean method_48$0dd78e0064(long var1) {
      int var17;
      var1 = a ^ var1;
      long var3 = var1 ^ 133463467948429L;
      EntityPlayerSP var6 = recovery$indy$1(field_43, -2319071592315274396L, var1);
      int var10000 = (int) ((recovery$indy$2(-2315082967072616147L, var1)) ? 1 : 0);
      int var7 = -1;
      byte var5 = (byte)var10000;

      while (true) {
         var10000 = var7;

         label207:
         while (true) {
            if (var10000 > 1) {
               var17 = 0;
               break;
            }

            var17 = -1;
            if (var5 == 0) {
               break;
            }

            int var8 = -1;

            label204:
            while (true) {
               var10000 = var8;

               while (true) {
                  int var9;
                  if (var10000 <= 1) {
                     var10000 = -1;
                     if (var5 == 0) {
                        continue label207;
                     }

                     var9 = -1;
                  } else {
                     var7++;
                     var10000 = var5;
                     if (var1 > 0L) {
                        if (var5 != 0) {
                           return false;
                        }

                        return false;
                     }

                     if (var5 == 0) {
                        continue label207;
                     }

                     var9 = var5;
                  }

                  label200:
                  while (true) {
                     label197: {
                        if (var9 <= 1) {
                           var10000 = C_47sk.method_47$b4643774d1(var6.field_48Q + var7);
                        } else {
                           var8++;
                           var10000 = var5;
                           if (var1 > 0L) {
                              break label197;
                           }
                        }

                        do {
                           int var10 = var10000;
                           int var11 = C_47sk.method_47$b4643774d1(var6.field_48j + var8);
                           int var12 = C_47sk.method_47$b4643774d1(var6.field_42o + var9);
                           C_47UZ var13 = recovery$indy$3(field_43, -2319183677029034903L, var1).method_49$0bfd666c6c(var10, var11, var12);
                           C_475y var14 = var13.method_48$e084f7739d();
                           var10000 = (int) ((var14 instanceof C_47Ji) ? 1 : 0);
                           if (var5 == 0) {
                              break;
                           }

                           if (var1 <= 0L) {
                              if (var5 == 0) {
                                 continue label207;
                              }

                              var9 = var10000;
                              continue label200;
                           }

                           if (var5 == 0) {
                              return var10000 != 0;
                           }

                           if (var10000 != 0) {
                              return true;
                           }

                           byte var19 = (byte) ((var14 instanceof C_47EN) ? 1 : 0);
                           if (var5 == 0) {
                              return var19 != 0;
                           }

                           if (var19 != 0) {
                              return true;
                           }

                           var19 = (byte) ((var14 instanceof C_47JO) ? 1 : 0);
                           if (var5 == 0) {
                              return var19 != 0;
                           }

                           if (var19 != 0) {
                              return true;
                           }

                           var19 = (byte) ((var14 instanceof C_47EB) ? 1 : 0);
                           if (var5 == 0) {
                              return var19 != 0;
                           }

                           if (var19 != 0) {
                              return true;
                           }

                           var19 = (byte) ((var14 instanceof C_47EX) ? 1 : 0);
                           if (var5 == 0) {
                              return var19 != 0;
                           }

                           if (var19 != 0) {
                              return true;
                           }

                           var19 = (byte) ((var14 instanceof C_47JX) ? 1 : 0);
                           if (var5 == 0) {
                              return var19 != 0;
                           }

                           if (var19 != 0) {
                              return true;
                           }

                           var19 = (byte) ((var14 instanceof C_47Jf) ? 1 : 0);
                           if (var5 == 0) {
                              return var19 != 0;
                           }

                           if (var19 != 0) {
                              return true;
                           }

                           var19 = (byte) ((var14 instanceof C_47Ep) ? 1 : 0);
                           if (var5 == 0) {
                              return var19 != 0;
                           }

                           if (var19 != 0) {
                              return true;
                           }

                           var19 = (byte) ((var14 instanceof C_47JC) ? 1 : 0);
                           if (var5 == 0) {
                              return var19 != 0;
                           }

                           if (var19 != 0) {
                              return true;
                           }

                           var19 = (byte) ((var14 instanceof C_47Em) ? 1 : 0);
                           if (var5 == 0) {
                              return var19 != 0;
                           }

                           if (var19 != 0) {
                              return true;
                           }

                           var19 = (byte) ((recovery$indy$4(this, var13, var3, -2318811926775123865L, var1)) ? 1 : 0);
                           if (var5 == 0) {
                              return var19 != 0;
                           }

                           if (var19 != 0 || var14.method_49$a32a680f8b() == C_47Xe.field_47G) {
                              return true;
                           }

                           var9++;
                           if (var5 != 0) {
                              continue label200;
                           }

                           var8++;
                           var10000 = var5;
                        } while (var1 <= 0L);
                     }

                     if (var10000 != 0) {
                        continue label204;
                     }

                     var7++;
                     var10000 = var5;
                     if (var1 > 0L) {
                        if (var5 != 0) {
                           return false;
                        }

                        return false;
                     }

                     if (var5 == 0) {
                        continue label207;
                     }

                     var9 = var5;
                  }
               }
            }
         }

         return var17 != 0;
      }
   }




   private void method_49$e45a9973e5(long var1) {
      VClip_47Qi var9;
      label42: {
         var1 = a ^ var1;
         long var3 = var1 ^ 62363102399844L;
         long var5 = var1 ^ 106606120776073L;
         boolean var7 = recovery$indy$5(-5317340037979096889L, var1);
         boolean var10000 = this.field_43a;
         if (var7) {
            if (this.field_43a) {
               return;
            }

            var9 = this;
            if (!var7) {
               break label42;
            }

            var10000 = recovery$indy$6(this, var5, -5317067640813208424L, var1);
         }

         label32: {
            if (var10000) {
               this.field_43a = true;
               this.field_43y = 0;
               if (var1 <= 0L) {
                  break label32;
               }

               if (var7) {
                  return;
               }
            }

            recovery$indy$8(var3, recovery$indy$7(3689, 9034533562323332507L ^ var1), -5315544928292023090L, var1);
         }

         var9 = this;
      }

      recovery$indy$9(var9, -5315668022872900630L, var1);
   }



   private static boolean method_45$aae029aa0a() {
      long var0 = a ^ 47026233426263L;
      long var10000 = -7407503577260943423L;
      boolean var2 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = -7407848199342096042L;
      BooleanSetting var3 = ClientGlobals.field_48.field_44l.settingSmartDistance;
      boolean var4 = var3.method_49$aae029aa0a();
      if (var2) {
         var4 = !var4;
      }

      return var4;
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      augustus.recovered.modules.movement.VClip_47Qi var19;
      long var4;
      boolean var6;
      C_473U var16;
      label61: {
         var4 = var1 ^ 50498101010005L;
         long var10000 = 2667732390449600218L;
         var6 = Fly_47kE.method_49t$aae029aa0a();
         boolean var15 = this.field_43a;
         if (!var6) {
            if (!this.field_43a) {
               return;
            }

            long var10001 = 2667466274098797527L;
            C_47ob var8 = var3;
            var16 = var8.method_46$96fcbedb66();
            if (var6) {
               break label61;
            }

            var15 = var16 instanceof C_47xZ;
         }

         if (!var15) {
            return;
         }

         long var20 = 2667466274098797527L;
         C_47ob var9 = var3;
         var16 = var9.method_46$96fcbedb66();
      }

      boolean var23;
      label46: {
         label63: {
            C_47xZ var7 = (C_47xZ)var16;
            double var17 = var7.method_48$fedcb3e4d3();
            long var10002 = 2669010459508195775L;
            Minecraft var10 = field_43;
            double var25;
            int var18 = (var25 = var17 - (var10.field_42P.field_48j + 0.5)) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
            if (!var6) {
               if (var18 > 0) {
                  String var21 = recovery$indy$10(21562, 4683220760619164924L ^ var1) + this.field_42;
                  var10002 = 2669070358153906175L;
                  String var11 = var21;
                  long var12 = var4;
                  C_475e.method_46$d07b98bfef(var12, var11);
                  long var22 = 2669474926100900059L;
                  VClip_47Qi var14 = this;
                  var14.method_43W$da8c82d5d4();
               }

               var19 = this;
               var23 = var6;
               if (var1 < 0L) {
                  break label46;
               }

               if (var6) {
                  break label63;
               }

               var18 = (int) ((this.field_43P) ? 1 : 0);
            }

            if (var18 != 0) {
               var3.cancel();
               return;
            }

            var19 = this;
         }

         var23 = true;
      }

      var19.field_43P = var23;
   }




   private void method_43$d46ce762b5(long var1, byte var3) {
      double var67;
      long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
      long var6 = var4 ^ 22542738376107L;
      long var8 = var4 ^ 23660470904444L;
      long var10 = var4 ^ 138486284009023L;
      long var12 = var4 ^ 80665200920851L;
      long var10000 = -4220358681489290340L;
      byte var14 = (byte) ((Fly_47kE.method_48$aae029aa0a()) ? 1 : 0);
      Minecraft var66 = field_43;
      if (var14 != 0) {
         long var10001 = -4223830170651275560L;
         Minecraft var23 = field_43;
         if (var23.field_44Q == null) {
            return;
         }

         var66 = field_43;
      }

      long var74 = -4224259071494774315L;
      Minecraft var24 = var66;
      if (var24.field_42P != null) {
         var74 = -4220139129527608053L;
         BooleanSetting var25 = this.settingSmartDistance;
         if (!var25.method_49$aae029aa0a()) {
            var74 = -4224259071494774315L;
            Minecraft var26 = field_43;
            EntityPlayerSP var73 = var26.field_42P;
            long var88 = -4224259071494774315L;
            Minecraft var27 = field_43;
            double var81 = var27.field_42P.field_48Q;
            long var95 = -4224259071494774315L;
            Minecraft var28 = field_43;
            long var100 = -4219971269778436926L;
            long var29 = var12;
            NumberSetting var31 = this.settingDistance;
            double var89 = var28.field_42P.field_48j + var31.method_44$474dfaa627(var29);
            long var98 = -4224259071494774315L;
            Minecraft var32 = field_43;
            var73.method_46$a59262c0f0(var81, var89, var32.field_42P.field_42o);
         } else {
            double var15 = 0.0;
            int var17 = 1;

            while (true) {
               label115:
               if (var17 < 10) {
                  long var10003 = -4224259071494774315L;
                  Minecraft var33 = field_43;
                  long var10004 = -4224259071494774315L;
                  Minecraft var34 = field_43;
                  double var90 = var34.field_42P.field_48j - var17;
                  long var10005 = -4224259071494774315L;
                  Minecraft var35 = field_43;
                  C_478Q var18 = new C_478Q(var33.field_42P.field_48Q, var90, var35.field_42P.field_42o);
                  long var10002 = -4220041665262995454L;
                  C_478Q var36 = var18;
                  long var37 = var6;
                  if (C_474i.method_42$133d77006a(var37, var36)) {
                     var74 = -4223830170651275560L;
                     Minecraft var39 = field_43;
                     C_475y var19 = var39.field_44Q.method_46$efbf73d2b1(var18).method_48$e084f7739d();
                     double var20 = var19.method_49$fedcb3e4d3() + var18.method_43$8abf5c6871();
                     var74 = -4224259071494774315L;
                     Minecraft var40 = field_43;
                     var67 = Math.abs(var40.field_42P.field_48j - var20);
                     if (var3 <= 0) {
                        break;
                     }

                     var15 = var67;
                     if (var14 != 0) {
                        break label115;
                     }
                  }

                  var17++;
                  if (var14 != 0) {
                     continue;
                  }
               }

               long var82 = -4219971269778436926L;
               long var41 = var12;
               NumberSetting var43 = this.settingMaxSmartDistance;
               var67 = var43.method_44$474dfaa627(var41);
               break;
            }

            double var63 = var67;
            int var64 = (int)(-1.0 - var15);

            while (true) {
               if (var64 >= Math.min(var63, -1.0)) {
                  long var91 = -4224259071494774315L;
                  Minecraft var44 = field_43;
                  long var96 = -4224259071494774315L;
                  Minecraft var45 = field_43;
                  double var92 = var45.field_42P.field_48j + var64;
                  long var99 = -4224259071494774315L;
                  Minecraft var46 = field_43;
                  C_478Q var65 = new C_478Q(var44.field_42P.field_48Q, var92, var46.field_42P.field_42o);
                  byte var68 = var14;
                  if (var3 > 0) {
                     if (var14 == 0) {
                        break;
                     }

                     var68 = var14;
                  }

                  if (var1 >= 0L) {
                     if (var68 != 0) {
                        label129: {
                           long var83 = -4224068591992548751L;
                           long var47 = var8;
                           C_478Q var49 = var65;
                           int var69 = (int) ((C_474i.method_48$2488324e9f(var49, var47)) ? 1 : 0);
                           if (var1 >= 0L) {
                              if (var69 != 0) {
                                 break label129;
                              }

                              C_478Q var70 = var65.method_40$5730377d31();
                              var83 = -4224068591992548751L;
                              long var50 = var8;
                              C_478Q var52 = var70;
                              var69 = (int) ((C_474i.method_48$2488324e9f(var52, var50)) ? 1 : 0);
                           }

                           if (var14 != 0) {
                              if (var69 != 0) {
                                 break label129;
                              }

                              var69 = var64;
                           }

                           double var71 = var69 + 0.2 - var15 % 1.0;
                           var91 = -4219971269778436926L;
                           long var53 = var12;
                           NumberSetting var55 = this.settingDistanceToHeadBlock;
                           double var21 = var71 - Math.max(var55.method_44$474dfaa627(var53), 0.0);
                           byte var72 = var14;
                           if (var1 >= 0L) {
                              if (var14 == 0) {
                                 return;
                              }

                              double var101;
                              var72 = (byte)((var101 = var21 - Math.min(var63, -1.0)) == 0.0 ? 0 : (var101 < 0.0 ? -1 : 1));
                           }

                           if (var72 >= 0) {
                              var74 = -4224259071494774315L;
                              Minecraft var56 = field_43;
                              var83 = -4224259071494774315L;
                              Minecraft var57 = field_43;
                              var91 = -4224259071494774315L;
                              Minecraft var58 = field_43;
                              double var86 = var58.field_42P.field_48j + var21;
                              var96 = -4224259071494774315L;
                              Minecraft var59 = field_43;
                              var56.field_42P.method_46$a59262c0f0(var57.field_42P.field_48Q, var86, var59.field_42P.field_42o);
                              return;
                           }
                        }

                        var64--;
                     }

                     var68 = var14;
                  }

                  if (var68 != 0) {
                     continue;
                  }
               }

               if (var1 >= 0L) {
                  String var79 = recovery$indy$11(12772, 6630708623584993609L ^ var4);
                  long var87 = -4224339860928518251L;
                  String var60 = var79;
                  long var61 = var10;
                  C_475e.method_46$d07b98bfef(var61, var60);
               }
               break;
            }
         }
      }
   }






    private boolean method_43$3a7c445ff6(net.C_47UZ blockState, long eventKey) {
        long decodedKey = a ^ eventKey;
        boolean inspectProperties = recovery$indy$flow$176(-130293231041220413L, decodedKey);
        boolean matchingBlock = recovery$indy$flow$178(recovery$indy$flow$177(blockState));
        if (inspectProperties) {
            if (!matchingBlock) {
                return false;
            }
            Boolean open = (Boolean) recovery$indy$flow$180(blockState, recovery$indy$flow$179());
            if (open.booleanValue()) {
                return false;
            }
        } else if (matchingBlock) {
            return false;
        }
        return recovery$indy$flow$184(blockState, recovery$indy$flow$183()) == recovery$indy$flow$185();
    }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$13(this, 40, var3, -7099310616062479367L, var1);
      recovery$indy$14(this, 26, var3, -7099310616062479367L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_43a = false;
      this.field_43P = false;
      this.field_43y = 0;
      this.field_42 = 0;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      VClip_47Qi var22;
      label27: {
         long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
         long var6 = (var4 ^ 66052018026726L) >>> 8;
         int var8 = (int)((var4 ^ 66052018026726L) << 56 >>> 56);
         long var9 = var4 ^ 133424169962429L;
         long var10000 = 2732158468494022197L;
         boolean var11 = Fly_47kE.method_49t$aae029aa0a();
         boolean var21 = this.field_43a;
         if (!var11) {
            if (this.field_43a) {
               return;
            }

            var22 = this;
            if (var11) {
               break label27;
            }

            long var10001 = 2732134744719310222L;
            BooleanSetting var12 = this.settingIntave;
            var21 = var12.method_49$aae029aa0a();
         }

         if (var21) {
            long var24 = 2730370502378600429L;
            long var13 = var9;
            VClip_47Qi var15 = this;
            var15.method_49$e45a9973e5(var13);
            return;
         }

         byte var10002 = (byte)var8;
         long var10003 = 2731977410009419458L;
         byte var16 = var10002;
         long var17 = var6;
         VClip_47Qi var19 = this;
         var19.method_43$d46ce762b5(var17, var16);
         var22 = this;
      }

      long var23 = 2730521206870140980L;
      VClip_47Qi var20 = var22;
      var20.method_43W$da8c82d5d4();
   }



   public void method_487$da8c82d5d4() {
      augustus.recovered.modules.movement.VClip_47Qi var24;
      long var1 = a ^ 73796606696503L;
      long var3 = var1 ^ 18371206823682L;
      long var10000 = -4300219519423236211L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      int var22 = (int) ((this.field_43a) ? 1 : 0);
      if (!var5) {
         if (!this.field_43a) {
            return;
         }

         this.field_42++;
         var22 = this.field_42;
      }

      label110: {
         short var10001 = 1;
         if (!var5) {
            if (var22 == 1) {
               long var10002 = -4297194899807721816L;
               String var9 = "Started clipping";
               long var10 = var3;
               C_475e.method_46$d07b98bfef(var10, var9);
            }

            var22 = this.field_42;
            if (var5) {
               break label110;
            }

            var10001 = 130;
         }

         if (var22 >= var10001) {
            long var30 = -4297194899807721816L;
            String var12 = "Stop clipping";
            long var13 = var3;
            C_475e.method_46$d07b98bfef(var13, var12);
            long var25 = -4297317958930101876L;
            VClip_47Qi var15 = this;
            var15.method_43W$da8c82d5d4();
            return;
         }

         var22 = 0;
      }

      int var6 = var22;

      while (var6 < 9) {
         label95: {
            label113: {
               this.field_43y++;
               int var23 = this.field_43y;
               byte var26 = 1;
               if (!var5) {
                  if (this.field_43y == 1) {
                     long var27 = -4297270189468737304L;
                     Minecraft var16 = field_43;
                     EntityPlayerSP var7 = var16.field_42P;
                     int var8 = 0;

                     while (var8 < 9) {
                        long var28 = -4297270189468737304L;
                        Minecraft var17 = field_43;
                        var17.field_42P.field_49m.method_45$631790539f(new C_479J(var7.field_48Q, var7.field_48j + var8 + 15.0, var7.field_42o, true));
                        var8++;
                        if (var5) {
                           break label95;
                        }

                        if (var5) {
                           break;
                        }
                     }

                     if (!var5) {
                        break label113;
                     }
                  }

                  var23 = this.field_43y;
                  var26 = 2;
               }

               label116: {
                  if (!var5) {
                     if (var23 == var26) {
                        long var29 = -4297270189468737304L;
                        Minecraft var18 = field_43;
                        long var10004 = -4297270189468737304L;
                        Minecraft var19 = field_43;
                        long var10005 = -4297270189468737304L;
                        Minecraft var20 = field_43;
                        double var31 = var20.field_42P.field_48j + 15.0;
                        long var10006 = -4297270189468737304L;
                        Minecraft var21 = field_43;
                        var18.field_42P.field_49m.method_45$631790539f(new C_479J(var19.field_42P.field_48Q, var31, var21.field_42P.field_42o, true));
                        if (!var5) {
                           break label113;
                        }
                     }

                     var24 = this;
                     if (var5) {
                        break label116;
                     }

                     var23 = this.field_43y;
                     var26 = 3;
                  }

                  if (var23 < var26) {
                     break label113;
                  }

                  var24 = this;
               }

               var24.field_43y = 0;
            }

            var6++;
         }

         if (var5) {
            break;
         }
      }
   }




    public VClip_47Qi(long a0) {
        super((java.lang.String) ("VClip"),(java.lang.String) ("VKlammer"),(long) (((augustus.recovered.modules.movement.VClip_47Qi.a ^ a0) ^ 17428310301114L)),(java.awt.Color) (new java.awt.Color((int) (63),(int) (255),(int) (0),(int) (255))),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.movement.VClip_47Qi.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.movement.VClip_47Qi.a ^ a0) ^ 139626628531617L);
        long constructorKey4 = ((augustus.recovered.modules.movement.VClip_47Qi.a ^ a0) ^ 91969892416038L);
        client.setting.NumberSetting initialized5 = new client.setting.NumberSetting(this, "Distance", Double.longBitsToDouble(-4604930618986332160L), constructorKey4, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(4621819117588971520L), 2);
        java.lang.Object initialValue6 = recovery$indy$flow$256();
        java.lang.Object initialValue7 = initialValue6;
        client.setting.NumberSetting initialValue8 = initialized5;
        java.lang.Object initialValue9 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue8))))));
        java.lang.Object initialValue10 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue7))))));
        java.lang.Object initialValue11 = recovery$indy$flow$259(initialValue9, initialValue10);
        recovery$indy$flow$260(this, initialValue11);
        client.setting.BooleanSetting initialized12 = new client.setting.BooleanSetting(this, constructorKey3, "SmartDistance", true);
        recovery$indy$flow$263(this, initialized12);
        client.setting.NumberSetting initialized13 = new client.setting.NumberSetting(this, "MaxSmartDistance", Double.longBitsToDouble(-4601609214261146419L), constructorKey4, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble(-4616189618054758400L), 2);
        java.lang.Object initialValue14 = ((java.lang.Object)(((augustus.recovered.modules.movement.VClip_47Qi) (((java.lang.Object)(this)))).settingSmartDistance));
        java.lang.Object initialValue15 = recovery$indy$flow$267(initialValue14);
        java.lang.Object initialValue16 = recovery$indy$flow$268(initialValue14);
        java.lang.Object initialValue17 = initialValue16;
        client.setting.NumberSetting initialValue18 = initialized13;
        java.lang.Object initialValue19 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue20 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue21 = recovery$indy$flow$271(initialValue19, initialValue20);
        recovery$indy$flow$272(this, initialValue21);
        client.setting.NumberSetting initialized22 = new client.setting.NumberSetting(this, "DistanceToHeadBlock", Double.longBitsToDouble(4591870180066957722L), constructorKey4, 0.0D, 1.0D, 2);
        java.lang.Object initialValue23 = ((java.lang.Object)(((augustus.recovered.modules.movement.VClip_47Qi) (((java.lang.Object)(this)))).settingSmartDistance));
        java.lang.Object initialValue24 = recovery$indy$flow$276(initialValue23);
        java.lang.Object initialValue25 = recovery$indy$flow$277(initialValue23);
        java.lang.Object initialValue26 = initialValue25;
        client.setting.NumberSetting initialValue27 = initialized22;
        java.lang.Object initialValue28 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue27))))));
        java.lang.Object initialValue29 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue30 = recovery$indy$flow$280(initialValue28, initialValue29);
        recovery$indy$flow$281(this, initialValue30);
        client.setting.BooleanSetting initialized31 = new client.setting.BooleanSetting(this, constructorKey3, "Intave", false);
        recovery$indy$flow$284(this, initialized31);
        recovery$indy$flow$285(this, false);
        recovery$indy$flow$286(this, 0);
        recovery$indy$flow$287(this, 0);
        recovery$indy$flow$288(this, false);
    }




    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native boolean recovery$indy$flow$176(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$177(java.lang.Object a0);
    private static boolean recovery$indy$flow$178(java.lang.Object a0) {
        return (a0 instanceof net.C_47Jn);
    }
    private static java.lang.Object recovery$indy$flow$179() {
        return net.C_47Jn.field_47;
    }
    private static native java.lang.Object recovery$indy$flow$180(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$183() {
        return net.C_47Jn.field_42;
    }
    private static native java.lang.Object recovery$indy$flow$184(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$185() {
        return net.C_47AI.BOTTOM;
    }
    private static native java.lang.Object recovery$indy$flow$256();


    private static native java.lang.Object recovery$indy$flow$259(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$260(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$263(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$267(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$268(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$271(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$272(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$276(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$277(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$280(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$281(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$284(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$285(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.VClip_47Qi) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$286(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.VClip_47Qi) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$287(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.VClip_47Qi) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$288(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.VClip_47Qi) (a0)).field_43P = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native EntityPlayerSP recovery$indy$1(Object var0, long var1, long var3);
   private static native boolean recovery$indy$2(long var0, long var2);
   private static native WorldClient recovery$indy$3(Object var0, long var1, long var3);
   private static native boolean recovery$indy$4(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$5(long var0, long var2);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$7(int var0, long var1);
   private static native void recovery$indy$8(long var0, Object var2, long var3, long var5);
   private static native void recovery$indy$9(Object var0, long var1, long var3);
   private static native String recovery$indy$10(int var0, long var1);
   private static native String recovery$indy$11(int var0, long var1);
   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$14(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$18();
}
