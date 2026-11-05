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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40g;
import net.C_40x;
import net.C_45J;
import net.C_45n;
import net.C_45z;
import net.C_472n;
import net.C_475y;
import net.C_478Q;
import net.C_478i;
import net.C_479J;
import net.C_47Aa;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47EB;
import net.C_47Fr;
import net.C_47IT;
import net.C_47Ij;
import client.module.Module;
import net.C_47Rw;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47UZ;
import net.C_47WM;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.minecraft.client.Minecraft;
import net.C_47od;
import net.C_47qu;
import client.module.Category;
import net.C_47vj;
import net.C_47xz;
import net.C_48g;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Phase_47Q3 extends client.module.Module implements net.C_48g,net.C_47hi,net.C_47od,net.C_47xz,net.C_47qu,net.C_47vj {
    private final client.setting.SettingGroup settingHorizontal = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCustomizeHorizontalMovespeedInBlocks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingUseSneakMotionInBlocks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMovespeedInBlocks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingVertical = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFallIfNoBlockIsUnderPlayer = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingUpAndDown = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingUpAndDownSteps = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingUpAndDownTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingClipDownByBreaking = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingPacketCount = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] k; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] l; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(int a0,long a1);

    private static native int i(long a0,long a1);

    private static native java.lang.reflect.Field e(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method e(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method l(long a0,long a1);

   private boolean method_41$0c5a3668f8(C_478i var1, long var2) {
      var2 = c ^ var2;
      List var5 = recovery$indy$2(field_43, 6028291422074297600L, var2)
         .method_40$d4a3a06218(
            recovery$indy$3(field_43, 6028223309388273219L, var2), recovery$indy$4(field_43, 6028223309388273219L, var2).method_45$6684d3c618()
         );
      boolean var10000 = recovery$indy$5(6028851594666002605L, var2);
      Iterator var6 = var5.iterator();
      boolean var4 = var10000;

      while (true) {
         if (var6.hasNext()) {
            C_478i var7 = (C_478i)var6.next();
            var10000 = var7.method_49$53fc7ac166(var1);
            boolean var10001 = var4;
            if (var2 > 0L) {
               if (!var4) {
                  break;
               }

               var10001 = var4;
            }

            if (!var10001) {
               return var10000;
            }

            if (var10000) {
               return true;
            }

            if (var4) {
               continue;
            }
         }

         var10000 = false;
         break;
      }

      return var10000;
   }



    private static native java.lang.reflect.Method f(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field f(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   public void method_40$cddd54024f(C_47Aa var1, long var2) {
      boolean var4 = recovery$indy$6(-1689351446814792503L, var2);
      if (recovery$indy$7(var1, -1689921179892155855L, var2) == C_47WM.PRE) {
         Minecraft var10000 = field_43;
         boolean var10001 = var4;
         if (var2 > 0L) {
            if (!var4) {
               if (!recovery$indy$8(field_43, -1689763524548039321L, var2).field_45.field_43) {
                  return;
               }

               var10000 = field_43;
            }

            var10001 = var4;
         }

         if (!var10001) {
            if (recovery$indy$9(var10000, -1689320583389662061L, var2).method_46$73d174f422() != C_47IT.ADVENTURE) {
               return;
            }

            var10000 = field_43;
         }

         C_47UZ var5 = recovery$indy$10(var10000, -1689827102000257500L, var2)
            .method_46$efbf73d2b1(recovery$indy$11(field_43, -1689440206471054518L, var2).method_49$5730377d31());
         C_475y var6 = var5.method_48$e084f7739d();
         var10001 = var4;
         if (var2 > 0L) {
            if (!var4) {
               if (var6 == C_45z.field_41c) {
                  return;
               }

               var6 = var5.method_48$e084f7739d();
            }

            var10001 = var4;
         }

         label49: {
            if (!var10001) {
               if (!(var6 instanceof C_47EB)) {
                  break label49;
               }

               var6 = var5.method_48$e084f7739d();
            }

            if (var6 != C_45z.field_46A) {
               return;
            }
         }

         var1.setCancelled(true);
      }
   }



    private static native java.lang.reflect.Field k(long a0,long a1);

    private static native java.lang.Class j(long a0,long a1);

   private boolean method_48$aae029aa0a() {
      long var1 = c ^ 75534648302061L;
      long var10000 = 657361659133363544L;
      boolean var3 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = 653796175464787429L;
      BooleanSetting var4 = this.settingCustomizeHorizontalMovespeedInBlocks;
      boolean var6 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 653796175464787429L;
         BooleanSetting var5 = this.settingUseSneakMotionInBlocks;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : !var6;
   }



    private boolean method_45$0dd78e0064(long l) {
        int n;
        block5: {
            int n2;
            l = c ^ l;
            net.C_478i c_478i = Phase_47Q3.recovery$indy$12(field_43, 1281737871237256226L, l).method_45$6684d3c618();
            c_478i = new net.C_478i(c_478i.field_48, c_478i.field_46 - 0.078, c_478i.field_44, c_478i.field_42, c_478i.field_47, c_478i.field_40);
            java.util.List list = Phase_47Q3.recovery$indy$14(field_43, 1281806254793531233L, l).method_40$d4a3a06218((net.minecraft.entity.Entity)Phase_47Q3.recovery$indy$15(field_43, 1281737871237256226L, l), c_478i);
            java.util.Iterator iterator = list.iterator();
            boolean bl = Phase_47Q3.recovery$indy$13(1282209796592377228L, l);
            while ((n2 = ((int) (iterator.hasNext() ? 1 : 0))) != 0) {
                block8: {
                    block9: {
                        boolean bl2;
                        block6: {
                            block7: {
                                long l2;
                                net.C_478i c_478i2 = (net.C_478i)iterator.next();
                                long l3 = l - 0L;
                                n2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                                bl2 = bl;
                                double d = c_478i2.field_47 - Phase_47Q3.recovery$indy$16((Object)Phase_47Q3.field_43, (long)1281737871237256226L, (long)l).field_48j;
                                n = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                                if (n2 >= 0) {
                                    n2 = bl2 ? 1 : 0;
                                    if (n2 != 0) break block5;
                                    bl2 = bl;
                                }
                                if ((n2 = (int)((l2 = l - 0L) == 0L ? 0 : (l2 < 0L ? -1 : 1))) <= 0) break block6;
                                n2 = bl2 ? 1 : 0;
                                if (n2 != 0) break block7;
                                n2 = n;
                                if (n2 > 0) break block8;
                                n = c_478i2.method_49$53fc7ac166(c_478i) ? 1 : 0;
                            }
                            bl2 = bl;
                        }
                        if ((n2 = (int)(bl2 ? 1 : 0)) != 0) break block9;
                        n2 = n;
                        if (n2 == 0) break block8;
                        n = 1;
                    }
                    return n != 0;
                }
                if ((n2 = (int)(bl ? 1 : 0)) == 0) continue;
            }
            n = 0;
        }
        return n != 0;
    }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      net.C_472n var7;
      boolean var6;
      int var10000;
      boolean var10001;
      label173: {
         long var4 = var2 ^ 132406506099900L;
         var6 = recovery$indy$17(6399003281907270602L, var2);
         this.field_43y++;
         var10000 = (int) ((this.field_43P) ? 1 : 0);
         label172:
         if (var6) {
            if (this.field_43P) {
               var10000 = (int) ((recovery$indy$18(this.settingUpAndDown, 6395333827552361527L, var2)) ? 1 : 0);
               if (!var6) {
                  break label172;
               }

               if (var10000 != 0) {
                  double var10;
                  var10000 = (var10 = this.field_43y - recovery$indy$19(this.settingUpAndDownTickDelay, var4, 6395255861939526949L, var2)) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
                  if (!var6) {
                     break label172;
                  }

                  label166:
                  if (var10000 >= 0) {
                     label164: {
                        label163: {
                           label177: {
                              var10000 = (int) ((recovery$indy$20(var1, 6399113346857733579L, var2)) ? 1 : 0);
                              var10001 = var6;
                              if (var2 >= 0L) {
                                 if (var6) {
                                    if (var10000 != 0) {
                                       recovery$indy$21(field_43, 6399498697010863396L, var2).field_42 = recovery$indy$22(
                                          this.settingUpAndDownSteps, var4, 6395255861939526949L, var2
                                       );
                                       if (var6) {
                                          break label177;
                                       }
                                    }

                                    var10000 = (int) ((recovery$indy$23(var1, 6398581569686375408L, var2)) ? 1 : 0);
                                 }

                                 var10001 = var6;
                              }

                              if (var2 < 0L) {
                                 break label164;
                              }

                              if (!var10001) {
                                 break label163;
                              }

                              if (var10000 != 0) {
                                 recovery$indy$24(field_43, 6399498697010863396L, var2).field_42 = -recovery$indy$25(
                                    this.settingUpAndDownSteps, var4, 6395255861939526949L, var2
                                 );
                              }
                           }

                           var10000 = (int) ((recovery$indy$26(var1, 6398581569686375408L, var2)) ? 1 : 0);
                        }

                        var10001 = var6;
                     }

                     label178: {
                        if (var2 >= 0L) {
                           if (var10001) {
                              if (var10000 != 0) {
                                 break label178;
                              }

                              var10000 = (int) ((recovery$indy$27(var1, 6399113346857733579L, var2)) ? 1 : 0);
                           }

                           var10001 = var6;
                        }

                        if (var2 < 0L) {
                           break label173;
                        }

                        if (!var10001) {
                           break label172;
                        }

                        if (var10000 == 0) {
                           break label166;
                        }
                     }

                     this.field_43y = 0;
                  }
               }
            }

            var10000 = (int) ((this.field_43P) ? 1 : 0);
         }

         var10001 = var6;
      }

      if (var2 >= 0L) {
         if (var10001) {
            if (var10000 == 0) {
               return;
            }

            var10000 = (int) ((recovery$indy$28(var1, 6398581569686375408L, var2)) ? 1 : 0);
         }

         var10001 = var6;
      }

      label121: {
         label120:
         if (var10001) {
            if (var10000 != 0) {
               var10000 = (int) ((recovery$indy$29(this.settingUpAndDown, 6395333827552361527L, var2)) ? 1 : 0);
               var10001 = var6;
               if (var2 <= 0L) {
                  break label121;
               }

               if (!var6) {
                  break label120;
               }

               if (var10000 != 0) {
                  recovery$indy$30(var1, false, 6395564202729509474L, var2);
               }
            }

            var10000 = (int) ((recovery$indy$31(this.settingUseSneakMotionInBlocks, 6395333827552361527L, var2)) ? 1 : 0);
         }

         var10001 = var6;
      }

      label110: {
         label181: {
            if (var10001) {
               if (var10000 != 0) {
                  recovery$indy$32(var1, true, 6395564202729509474L, var2);
               }

               var7 = var1;
               var10001 = var6;
               if (var2 <= 0L) {
                  break label110;
               }

               if (!var6) {
                  break label181;
               }

               var10000 = (int) ((recovery$indy$33(var1, 6399113346857733579L, var2)) ? 1 : 0);
            }

            if (var10000 == 0) {
               return;
            }

            var7 = var1;
         }

         var10001 = false;
      }

      recovery$indy$34(var7, var10001, 6395448002916243394L, var2);
   }




   public void method_47$2fe7f6c171(C_47Rw var1, long var2) {
      augustus.recovered.modules.player.Phase_47Q3 var10;
      long var4 = var2 ^ 110944363308965L;
      long var10001 = var2 ^ 107168304734856L;
      int var6 = (int)((var2 ^ 107168304734856L) >>> 32);
      int var7 = (int)((var2 ^ 107168304734856L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      boolean var9 = recovery$indy$35(3158286035169781651L, var2);
      boolean var10000 = recovery$indy$36(field_43, 3158864624996462141L, var2).field_48Y;
      if (!var9) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$37(this.settingCustomizeHorizontalMovespeedInBlocks, 3159792665094147886L, var2);
      }

      label41: {
         if (!var9) {
            if (!var10000) {
               return;
            }

            var10 = this;
            if (var9) {
               break label41;
            }

            var10000 = recovery$indy$38(this.settingUseSneakMotionInBlocks, 3159792665094147886L, var2);
         }

         if (var10000) {
            return;
         }

         var10 = this;
      }

      recovery$indy$41(
         recovery$indy$39(var10.settingMovespeedInBlocks, var4, 3159732371679194684L, var2),
         0.0,
         var6,
         (short)var7,
         var8,
         recovery$indy$40(field_43, 3158864624996462141L, var2).field_48h,
         false,
         3159074423811088672L,
         var2
      );
      recovery$indy$43(var1, recovery$indy$42(field_43, 3158864624996462141L, var2).field_48s, 3158751368704657666L, var2);
      recovery$indy$45(var1, recovery$indy$44(field_43, 3158864624996462141L, var2).field_487, 3159206327460989464L, var2);
   }



   public void method_43$a80d0de415(long var1, C_47Fr var3) {
      if (this.field_43a || recovery$indy$46(field_43, -7722147655814559544L, var1).method_46$73d174f422() == C_47IT.ADVENTURE) {
         var3.setCancelled(true);
      }
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$47(this, 27, var3, -7099227964802412267L, var1);
      recovery$indy$48(this, 21, var3, -7099227964802412267L, var1);
      recovery$indy$49(this, 20, var3, -7099227964802412267L, var1);
      recovery$indy$50(this, 40, var3, -7099227964802412267L, var1);
      recovery$indy$51(this, 59, var3, -7099227964802412267L, var1);
      recovery$indy$52(this, 60, var3, -7099227964802412267L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      boolean var3 = recovery$indy$53(-7741345510645196586L, var1);
      Minecraft var10000 = field_43;
      if (!var3) {
         if (recovery$indy$54(field_43, -7741314576201824116L, var1).method_46$73d174f422() != C_47IT.ADVENTURE) {
            return;
         }

         var10000 = field_43;
      }

      recovery$indy$55(var10000, -7740630511621205640L, var1).field_45.field_43 = false;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   public void method_487$da8c82d5d4() {
      long var3;
      boolean var5;
      Minecraft var22;
      label73: {
         long var1 = c ^ 20711546524845L;
         var3 = var1 ^ 39702344730670L;
         long var10000 = -4296557312350298280L;
         var5 = AirStuck_47Q4.method_45$aae029aa0a();
         this.field_43a = false;
         long var10001 = -4300209437439123291L;
         BooleanSetting var10 = this.settingClipDownByBreaking;
         boolean var21 = var10.method_49$aae029aa0a();
         if (var5) {
            if (!var21) {
               return;
            }

            var10001 = -4297055959919050314L;
            Minecraft var11 = field_43;
            var11.field_42P.field_45.field_43 = true;
            var22 = field_43;
            if (!var5) {
               break label73;
            }

            var10001 = -4296617968858064830L;
            Minecraft var12 = field_43;
            var21 = var12.field_44K.field_42;
         }

         if (!var21) {
            return;
         }

         var22 = field_43;
      }

      long var29 = -4297300130338596965L;
      Minecraft var13 = var22;
      C_47Ij var6 = var13.field_42Y;
      C_478Q var7 = var6.method_49$5730377d31();
      if (var6.field_49 == C_47Az.BLOCK) {
         label76: {
            double var23 = var7.method_43$8abf5c6871();
            long var10002 = -4297055959919050314L;
            Minecraft var14 = field_43;
            double var33;
            int var24 = (var33 = Math.abs(var23 - var14.field_42P.field_48j) - 2.0) == 0.0 ? 0 : (var33 < 0.0 ? -1 : 1);
            if (var5) {
               if (var24 >= 0) {
                  return;
               }

               var22 = field_43;
               if (!var5) {
                  break label76;
               }

               var29 = -4297124066162619659L;
               Minecraft var15 = field_43;
               var24 = ((int) (var15.field_44Q
                  .method_49$0bfd666c6c(var7.method_40$8abf5c6871(), var7.method_43$8abf5c6871() + 1, var7.method_47$8abf5c6871())
                  .method_48$e084f7739d()
                  .method_42M$aae029aa0a() ? 1 : 0));
            }

            if (var24 != 0) {
               return;
            }

            var22 = field_43;
         }

         var29 = -4297055959919050314L;
         Minecraft var16 = var22;
         EntityPlayerSP var8 = var16.field_42P;
         var8.field_49m.method_45$631790539f(new C_45J(C_40x.STOP_DESTROY_BLOCK, var6.method_49$5730377d31(), var6.field_40));
         int var9 = 0;

         label46: {
            do {
               double var26 = var9;
               long var10003 = -4300129343972621897L;
               long var17 = var3;
               NumberSetting var19 = this.settingPacketCount;
               if (!(var26 < var19.method_44$474dfaa627(var17))) {
                  break;
               }

               var8.field_49m.method_45$631790539f(new C_479J(var8.field_48Q, var8.field_48j, var8.field_42o, true));
               var9++;
               if (!var5) {
                  break label46;
               }
            } while (var5);

            this.field_43a = true;
         }

         var29 = -4296617968858064830L;
         Minecraft var20 = field_43;
         var20.field_44K.method_46$24a796ab4c(1.0E-4F);
      }
   }




   public void method_48v$e45a9973e5(long var1) {
      long var3 = var1 ^ 5432507686715L;
      long var5 = var1 ^ 48466057403738L;
      boolean var7 = recovery$indy$56(-2564693284085903313L, var1);
      this.field_43P = recovery$indy$58(this, recovery$indy$57(field_43, -2564070176893707903L, var1).method_45$6684d3c618(), var3, -2565680901892920979L, var1);
      boolean var10000 = this.field_43P;
      if (!var7) {
         if (!this.field_43P) {
            return;
         }

         var10000 = recovery$indy$59(this.settingFallIfNoBlockIsUnderPlayer, -2565420311864952686L, var1);
      }

      label26: {
         if (!var7) {
            if (!var10000) {
               break label26;
            }

            var10000 = recovery$indy$60(this, var5, -2564288688411667451L, var1);
         }

         if (!var10000) {
            return;
         }
      }

      recovery$indy$61(field_43, -2564070176893707903L, var1).field_48Y = true;
      recovery$indy$62(field_43, -2564070176893707903L, var1).field_42 = 0.0;
      recovery$indy$63(field_43, -2564070176893707903L, var1).field_48M = true;
   }



    public Phase_47Q3(long a0) {
        super((java.lang.String) ("Phase"),(java.lang.String) ("DurchW\u00e4ndeGehen"),(long) (((augustus.recovered.modules.player.Phase_47Q3.c ^ a0) ^ 69878779291863L)),(java.awt.Color) (new java.awt.Color((int) (45),(int) (196),(int) (148))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.player.Phase_47Q3.c ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.player.Phase_47Q3.c ^ a0) ^ 62142570023485L) >>> 48));
        int constructorPart4 = (int) (((((augustus.recovered.modules.player.Phase_47Q3.c ^ a0) ^ 62142570023485L) << 16) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.player.Phase_47Q3.c ^ a0) ^ 62142570023485L) << 32) >>> 32));
        long constructorKey6 = ((augustus.recovered.modules.player.Phase_47Q3.c ^ a0) ^ 78584826618353L);
        long constructorKey7 = ((augustus.recovered.modules.player.Phase_47Q3.c ^ a0) ^ 43573400003015L);
        long constructorKey8 = ((augustus.recovered.modules.player.Phase_47Q3.c ^ a0) ^ 133587307892861L);
        client.setting.SettingGroup initialized9 = new client.setting.SettingGroup(this, "Horizontal", constructorKey7);
        recovery$indy$flow$233(this, initialized9);
        short converted10 = (short) (constructorPart3);
        char converted11 = (char) (constructorPart4);
        java.lang.Object initialValue12 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingHorizontal));
        client.setting.BooleanSetting initialized13 = new client.setting.BooleanSetting(this, "Customize horizontal Movespeed in blocks", converted10, converted11, constructorPart5, false, (client.setting.SettingGroup) (initialValue12));
        recovery$indy$flow$237(this, initialized13);
        short converted14 = (short) (constructorPart3);
        char converted15 = (char) (constructorPart4);
        java.lang.Object initialValue16 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingHorizontal));
        client.setting.BooleanSetting initialized17 = new client.setting.BooleanSetting(this, "Use sneak motion in blocks", converted14, converted15, constructorPart5, false, (client.setting.SettingGroup) (initialValue16));
        java.lang.Object initialValue18 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingCustomizeHorizontalMovespeedInBlocks));
        java.lang.Object initialValue19 = recovery$indy$flow$242(initialValue18);
        java.lang.Object initialValue20 = recovery$indy$flow$243(initialValue18);
        java.lang.Object initialValue21 = initialValue20;
        long initialValue22 = constructorKey6;
        client.setting.BooleanSetting initialValue23 = initialized17;
        java.lang.Object initialValue24 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue25 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue21))))));
        java.lang.Object initialValue26 = recovery$indy$flow$246(initialValue24, initialValue22, initialValue25);
        java.lang.Object initialValue27 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue26))))));
        recovery$indy$flow$248(this, initialValue27);
        java.lang.Object initialValue28 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingHorizontal));
        client.setting.NumberSetting initialized29 = new client.setting.NumberSetting(this, "Movespeed in blocks", Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4547007122018943789L), 1.0D, 4, (client.setting.SettingGroup) (initialValue28), constructorKey8);
        java.lang.Object initialValue30 = recovery$indy$flow$252(this);
        java.lang.Object initialValue31 = initialValue30;
        client.setting.NumberSetting initialValue32 = initialized29;
        java.lang.Object initialValue33 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue32))))));
        java.lang.Object initialValue34 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue35 = recovery$indy$flow$255(initialValue33, initialValue34);
        recovery$indy$flow$256(this, initialValue35);
        client.setting.SettingGroup initialized36 = new client.setting.SettingGroup(this, "Vertical", constructorKey7);
        recovery$indy$flow$259(this, initialized36);
        short converted37 = (short) (constructorPart3);
        char converted38 = (char) (constructorPart4);
        java.lang.Object initialValue39 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingVertical));
        client.setting.BooleanSetting initialized40 = new client.setting.BooleanSetting(this, "Fall if no block is under player", converted37, converted38, constructorPart5, false, (client.setting.SettingGroup) (initialValue39));
        recovery$indy$flow$263(this, initialized40);
        short converted41 = (short) (constructorPart3);
        char converted42 = (char) (constructorPart4);
        java.lang.Object initialValue43 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingVertical));
        client.setting.BooleanSetting initialized44 = new client.setting.BooleanSetting(this, "UpAndDown", converted41, converted42, constructorPart5, true, (client.setting.SettingGroup) (initialValue43));
        recovery$indy$flow$267(this, initialized44);
        java.lang.Object initialValue45 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingVertical));
        client.setting.NumberSetting initialized46 = new client.setting.NumberSetting(this, "UpAndDownSteps", 1.0D, 0.0D, Double.longBitsToDouble(4611686018427387904L), 2, (client.setting.SettingGroup) (initialValue45), constructorKey8);
        java.lang.Object initialValue47 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingUpAndDown));
        java.lang.Object initialValue48 = recovery$indy$flow$272(initialValue47);
        java.lang.Object initialValue49 = recovery$indy$flow$273(initialValue47);
        java.lang.Object initialValue50 = initialValue49;
        client.setting.NumberSetting initialValue51 = initialized46;
        java.lang.Object initialValue52 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue51))))));
        java.lang.Object initialValue53 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue50))))));
        java.lang.Object initialValue54 = recovery$indy$flow$276(initialValue52, initialValue53);
        recovery$indy$flow$277(this, initialValue54);
        java.lang.Object initialValue55 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingVertical));
        client.setting.NumberSetting initialized56 = new client.setting.NumberSetting(this, "UpAndDownTickDelay", Double.longBitsToDouble(4617315517961601024L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue55), constructorKey8);
        java.lang.Object initialValue57 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingUpAndDown));
        java.lang.Object initialValue58 = recovery$indy$flow$282(initialValue57);
        java.lang.Object initialValue59 = recovery$indy$flow$283(initialValue57);
        java.lang.Object initialValue60 = initialValue59;
        client.setting.NumberSetting initialValue61 = initialized56;
        java.lang.Object initialValue62 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue61))))));
        java.lang.Object initialValue63 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue64 = recovery$indy$flow$286(initialValue62, initialValue63);
        recovery$indy$flow$287(this, initialValue64);
        short converted65 = (short) (constructorPart3);
        char converted66 = (char) (constructorPart4);
        java.lang.Object initialValue67 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingVertical));
        client.setting.BooleanSetting initialized68 = new client.setting.BooleanSetting(this, "Clip down by breaking", converted65, converted66, constructorPart5, false, (client.setting.SettingGroup) (initialValue67));
        recovery$indy$flow$291(this, initialized68);
        java.lang.Object initialValue69 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingVertical));
        client.setting.NumberSetting initialized70 = new client.setting.NumberSetting(this, "Packet count", 1.0D, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue69), constructorKey8);
        java.lang.Object initialValue71 = ((java.lang.Object)(((augustus.recovered.modules.player.Phase_47Q3) (((java.lang.Object)(this)))).settingClipDownByBreaking));
        java.lang.Object initialValue72 = recovery$indy$flow$296(initialValue71);
        java.lang.Object initialValue73 = recovery$indy$flow$297(initialValue71);
        java.lang.Object initialValue74 = initialValue73;
        client.setting.NumberSetting initialValue75 = initialized70;
        java.lang.Object initialValue76 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue75))))));
        java.lang.Object initialValue77 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue78 = recovery$indy$flow$300(initialValue76, initialValue77);
        recovery$indy$flow$301(this, initialValue78);
        recovery$indy$flow$302(this, 0);
        recovery$indy$flow$303(this, 0.0F);
        recovery$indy$flow$304(this, false);
        return;
    }





    private static native void c();

    private static native java.lang.Object c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);
    private static native void recovery$indy$flow$233(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$237(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$242(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$243(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$246(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$248(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$252(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$255(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$256(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$259(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$263(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$267(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$272(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$273(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$276(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$277(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$282(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$283(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$286(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$287(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$291(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$296(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$297(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$300(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$301(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$302(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.Phase_47Q3) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$303(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.player.Phase_47Q3) (a0)).field_49 = a1;
        return;
    }
    private static void recovery$indy$flow$304(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.Phase_47Q3) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native MethodHandle recovery$constant$1();
   private static native WorldClient recovery$indy$2(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native boolean recovery$indy$5(long var0, long var2);
   private static native boolean recovery$indy$6(long var0, long var2);
   private static native C_47WM recovery$indy$7(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native C_40g recovery$indy$9(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$10(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$11(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);
   private static native boolean recovery$indy$13(long var0, long var2);
   private static native WorldClient recovery$indy$14(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$16(Object var0, long var1, long var3);
   private static native boolean recovery$indy$17(long var0, long var2);
   private static native boolean recovery$indy$18(Object var0, long var1, long var3);
   private static native double recovery$indy$19(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$20(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);
   private static native double recovery$indy$22(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$23(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$24(Object var0, long var1, long var3);
   private static native double recovery$indy$25(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$26(Object var0, long var1, long var3);
   private static native boolean recovery$indy$27(Object var0, long var1, long var3);
   private static native boolean recovery$indy$28(Object var0, long var1, long var3);
   private static native boolean recovery$indy$29(Object var0, long var1, long var3);
   private static native void recovery$indy$30(Object var0, boolean var1, long var2, long var4);
   private static native boolean recovery$indy$31(Object var0, long var1, long var3);
   private static native void recovery$indy$32(Object var0, boolean var1, long var2, long var4);
   private static native boolean recovery$indy$33(Object var0, long var1, long var3);
   private static native void recovery$indy$34(Object var0, boolean var1, long var2, long var4);
   private static native boolean recovery$indy$35(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);
   private static native boolean recovery$indy$37(Object var0, long var1, long var3);
   private static native boolean recovery$indy$38(Object var0, long var1, long var3);
   private static native double recovery$indy$39(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$40(Object var0, long var1, long var3);
   private static native void recovery$indy$41(double var0, double var2, int var4, short var5, int var6, float var7, boolean var8, long var9, long var11);
   private static native EntityPlayerSP recovery$indy$42(Object var0, long var1, long var3);
   private static native void recovery$indy$43(Object var0, double var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$44(Object var0, long var1, long var3);
   private static native void recovery$indy$45(Object var0, double var1, long var3, long var5);
   private static native C_40g recovery$indy$46(Object var0, long var1, long var3);
   private static native void recovery$indy$47(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$48(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$49(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$50(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$51(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$52(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$53(long var0, long var2);
   private static native C_40g recovery$indy$54(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$55(Object var0, long var1, long var3);
   private static native boolean recovery$indy$56(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$57(Object var0, long var1, long var3);
   private static native boolean recovery$indy$58(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$59(Object var0, long var1, long var3);
   private static native boolean recovery$indy$60(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$61(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$62(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$63(Object var0, long var1, long var3);
}
