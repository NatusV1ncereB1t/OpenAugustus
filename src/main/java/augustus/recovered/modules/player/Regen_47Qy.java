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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_473U;
import net.C_477r;
import net.C_479E;
import net.C_479m;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import net.C_47S6;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47Vc;
import net.C_47cu;
import net.C_47gg;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import client.ClientGlobals;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Regen_47Qy extends client.module.Module implements net.C_47Vc,net.C_47iC,net.C_47xz {
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingHealth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMinHunger = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingPackets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingGroundCheck = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingStopSendPacketsIfHpReached = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMinDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileKillAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileScaffold = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

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

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$9035875d26(long var1, C_47ob var3) {
      boolean var38;
      boolean var46;
      net.minecraft.client.entity.EntityPlayerSP var39;
      long var4 = var1 ^ 48552975978563L;
      long var6 = var1 ^ 17925729311181L;
      int var8 = (int)((var1 ^ 12918494853216L) >>> 48);
      long var9 = (var1 ^ 12918494853216L) << 16 >>> 16;
      long var10000 = -7191484830107267441L;
      boolean var11 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10001 = -7188083345824620899L;
      C_47ob var14 = var3;
      C_473U var12 = var14.method_46$96fcbedb66();
      Minecraft var35 = field_43;
      if (!var11) {
         var10001 = -7191998907655447537L;
         Minecraft var15 = field_43;
         if (var15.field_42P == null) {
            return;
         }

         var35 = field_43;
      }

      var10001 = -7192124102788943447L;
      Minecraft var16 = var35;
      if (var16.field_44Q != null) {
         long var10002 = -7191473743158143739L;
         long var17 = var6;
         ModeSetting var19 = this.settingMode;
         byte var36 = (byte) ((var19.method_46$5f9dc63072(var17).equals(recovery$indy$1(3424, 2326698729895646980L ^ var1))) ? 1 : 0);
         boolean var42 = var11;
         if (var1 > 0L) {
            if (!var11) {
               if (var36 == 0) {
                  return;
               }

               short var43 = (short)var8;
               long var10003 = -7191795946599960490L;
               long var20 = var9;
               short var22 = var43;
               Regen_47Qy var23 = this;
               var36 = (byte) ((var23.method_42u$f19a3ced8f(var22, var20)) ? 1 : 0);
            }

            var42 = var11;
         }

         if (var1 > 0L) {
            if (!var42) {
               if (var36 == 0) {
                  return;
               }

               var36 = (byte) ((var12 instanceof C_479m) ? 1 : 0);
            }

            var42 = var11;
         }

         if (!var42) {
            if (var36 == 0) {
               return;
            }

            var36 = 0;
         }

         int var13 = var36;

         do {
            double var37 = var13;
            long var50 = -7188185715831714673L;
            long var24 = var4;
            NumberSetting var26 = this.settingPackets;
            if (!(var37 < var26.method_44$474dfaa627(var24))) {
               break;
            }

            label88: {
               short var44 = (short)var8;
               var50 = -7191795946599960490L;
               long var27 = var9;
               short var29 = var44;
               Regen_47Qy var30 = this;
               var38 = var30.method_42u$f19a3ced8f(var29, var27);
               label87:
               if (!var11) {
                  if (!var38) {
                     var10001 = -7188277815886304974L;
                     BooleanSetting var31 = this.settingStopSendPacketsIfHpReached;
                     var38 = var31.method_49$aae029aa0a();
                     var46 = var11;
                     if (var1 <= 0L) {
                        break label88;
                     }

                     if (var11) {
                        break label87;
                     }

                     if (var38) {
                        break;
                     }
                  }

                  var10001 = -7188277815886304974L;
                  BooleanSetting var32 = this.settingGroundCheck;
                  var38 = var32.method_49$aae029aa0a();
               }

               var46 = var11;
            }

            label77: {
               label76: {
                  label75: {
                     if (!var46) {
                        if (!var38) {
                           break label75;
                        }

                        var10001 = -7191998907655447537L;
                        Minecraft var33 = field_43;
                        var39 = var33.field_42P;
                        if (var11) {
                           break label76;
                        }

                        var38 = var33.field_42P.field_48M;
                     }

                     if (!var38) {
                        break label77;
                     }
                  }

                  var10001 = -7191998907655447537L;
                  Minecraft var34 = field_43;
                  var39 = var34.field_42P;
               }

               var39.field_49m.method_43$631790539f(var12);
            }

            var13++;
         } while (!var11);
      }
   }




   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 35127550037835L;
      long var3 = var1 ^ 138219946065218L;
      long var10002 = -523071474371530358L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("/heal");
   }



   private int method_45$facb258953(int var1, int var2, short var3) {
      byte var8;
      int var17;
      byte var10001;
      label72: {
         long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
         long var6 = var4 ^ 107254002224061L;
         long var10002 = -3584107215292938379L;
         long var11 = var6;
         ModeSetting var13 = this.settingMode;
         String var9 = var13.method_46$5f9dc63072(var11);
         long var10000 = -3583419708763100265L;
         byte var16 = (byte) ((AirStuck_47Q4.method_45$aae029aa0a()) ? 1 : 0);
         byte var10 = -1;
         var8 = var16;
         var17 = var9.hashCode();
         label71:
         if (var8 != 0) {
            label75: {
               switch (var17) {
                  case -1085510111:
                     var17 = (int) ((var9.equals("Default")) ? 1 : 0);
                     if (var8 == 0) {
                        break label71;
                     }

                     if (var17 == 0) {
                        break label75;
                     }

                     var10 = 0;
                     var17 = var8;
                     if (var1 <= 0) {
                        break;
                     }

                     if (var8 != 0) {
                        break label75;
                     }
                  case 73298841:
                     var17 = (int) ((var9.equals("Legit")) ? 1 : 0);
                     break;
                  default:
                     break label75;
               }

               var10001 = var8;
               if (var1 < 0) {
                  break label72;
               }

               if (var8 == 0) {
                  break label71;
               }

               if (var17 != 0) {
                  var10 = 1;
               }
            }

            var17 = var10;
         }

         var10001 = var8;
      }

      if (var10001 != 0) {
         label48: {
            EntityPlayerSP var18;
            switch (var17) {
               case 0:
                  long var19 = -3584703844824822145L;
                  Minecraft var14 = field_43;
                  var18 = var14.field_42P;
                  if (var2 <= 0) {
                     break;
                  }

                  var14.field_42P.field_49m.method_43$631790539f(new C_479E(true));
                  if (var8 != 0) {
                     break label48;
                  }
               case 1:
                  long var20 = -3584703844824822145L;
                  Minecraft var15 = field_43;
                  var18 = var15.field_42P;
                  break;
               default:
                  break label48;
            }

            var18.method_434$f633c984d8(false);
         }

         var17 = 0;
      }

      return var17;
   }




   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 38563804281041L;
      long var3 = var1 ^ 71836653554392L;
      long var10000 = 5703782257447493018L;
      boolean var5 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10002 = 5703687586129593872L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("/heal");
      if (!var5) {
         var9 = !var9;
      }

      return var9;
   }



    public void method_45p$a6cfe74df2(short s, long l) {
        long l2;
        long l3 = l2 = (long)s << 48 | l << 16 >>> 16;
        long l4 = l3 ^ 0x73ACE940DAE2L;
        long l5 = l3 ^ 0x54B26E811D09L;
        long l6 = l3 ^ 0x7FAF66D228C7L;
        int n = (int)(l6 >>> 32);
        int n2 = (int)(l6 << 32 >>> 48);
        int n3 = (int)(l6 << 48 >>> 48);
        long l7 = l3 ^ 0x68D758D99487L;
        long l8 = l3 ^ 0x73252228352AL;
        int n4 = (int)(l8 >>> 48);
        long l9 = l8 << 16 >>> 16;
        boolean bl = AirStuck_47Q4.method_45$aae029aa0a();
        long l10 = l7;
        ModeSetting c_47Tj = this.settingMode;
        String string = c_47Tj.method_46$5f9dc63072(l10);
        long l11 = l4;
        Regen_47Qy regen_47Qy = this;
        ((Module)regen_47Qy).method_47$d07b98bfef(l11, string);
        long l12 = l9;
        short s2 = (short)n4;
        Regen_47Qy regen_47Qy2 = this;
        int n5 = ((int) (regen_47Qy2.method_42u$f19a3ced8f(s2, l12) ? 1 : 0));
        if (bl) {
            if (n5 == 0) {
                return;
            }
        } else {
            int n6 = n5;
            NumberSetting c_47TS = this.settingPackets;
            long l13 = l5;
            if ((double)n6 < c_47TS.method_44$474dfaa627(l13)) {
                long l14 = l9;
                short s3 = (short)n4;
                Regen_47Qy regen_47Qy3 = this;
                int n7 = ((int) (regen_47Qy3.method_42u$f19a3ced8f(s3, l14) ? 1 : 0));
                if (bl) {
                    if (n7 != 0) {
                        Minecraft c_47nT = field_43;
                        n7 = c_47nT.field_42P.field_48M ? 1 : 0;
                    } else {
                        short s4 = (short)n3;
                        int n8 = n2;
                        int n9 = n;
                        Regen_47Qy regen_47Qy4 = this;
                        n7 = n6 + regen_47Qy4.method_45$facb258953(n9, n8, s4);
                    }
                }
                n6 = n7;
                ++n6;
                while (l < 0L) {
                }
                return;
            }
            while (l < 0L) {
            }
            return;
        }
        int n10 = 0;
        while (true) {
            block16: {
                int n11;
                block14: {
                    block15: {
                        block10: {
                            boolean bl2;
                            block12: {
                                block13: {
                                    block11: {
                                        long l15;
                                        NumberSetting c_47TS;
                                        if (!((double)n10 < (c_47TS = this.settingPackets).method_44$474dfaa627(l15 = l5))) break block10;
                                        long l16 = l9;
                                        short s5 = (short)n4;
                                        Regen_47Qy regen_47Qy5 = this;
                                        if (regen_47Qy5.method_42u$f19a3ced8f(s5, l16)) break block11;
                                        BooleanSetting c_47TV = this.settingStopSendPacketsIfHpReached;
                                        n11 = ((int) (c_47TV.method_49$aae029aa0a() ? 1 : 0));
                                        bl2 = bl;
                                        if (l <= 0L) break block12;
                                        if (!bl2) break block13;
                                        if (n11 != 0) break block10;
                                    }
                                    BooleanSetting c_47TV = this.settingGroundCheck;
                                    n11 = ((int) (c_47TV.method_49$aae029aa0a() ? 1 : 0));
                                }
                                bl2 = bl;
                            }
                            if (!bl2) break block14;
                            if (n11 == 0) break block15;
                            Minecraft c_47nT = field_43;
                            if (!c_47nT.field_42P.field_48M) break block16;
                            break block15;
                        }
                        if (l < 0L) continue;
                        return;
                    }
                    short s6 = (short)n3;
                    int n12 = n2;
                    int n13 = n;
                    Regen_47Qy regen_47Qy6 = this;
                    n11 = n10 + regen_47Qy6.method_45$facb258953(n13, n12, s6);
                }
                n10 = n11;
            }
            ++n10;
        }
    }





   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$2(this, 43, var5, -7099143044936675438L, var1);
      recovery$indy$3(this, 26, var5, -7099143044936675438L, var1);
      recovery$indy$4(this, 40, 10000, var3, -7100755082300642182L, var1);
   }



   private boolean method_42C$aae029aa0a() {
      long var1 = a ^ 73954122216830L;
      long var3 = var1 ^ 36309028718455L;
      long var10000 = -9038897851161319587L;
      boolean var5 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10002 = -9040710221705868353L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("/heal");
      if (var5) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_42u$f19a3ced8f(short var1, long var2) {
      client.module.ModuleManager var11;
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
      long var6 = var4 ^ 11796619779579L;
      long var8 = var4 ^ 89487624806366L;
      boolean var10 = recovery$indy$5(-3195253044569655686L, var4);
      double var13;
      int var10000 = (
               var13 = recovery$indy$6(field_43, -3193722482409909358L, var4).method_44$c1e132d4d1().method_44$8abf5c6871()
                  - recovery$indy$7(this.settingMinHunger, var8, -3196691076968348910L, var4)
            )
            == 0.0
         ? 0
         : (var13 < 0.0 ? -1 : 1);
      if (var10) {
         if (var10000 <= 0) {
            return false;
         }

         double var14;
         var10000 = (
                  var14 = recovery$indy$8(field_43, -3193722482409909358L, var4).method_43$bc607678b6()
                     - recovery$indy$9(this.settingHealth, var8, -3196691076968348910L, var4)
               )
               == 0.0
            ? 0
            : (var14 < 0.0 ? -1 : 1);
      }

      boolean var10001 = var10;
      if (var2 >= 0L) {
         if (var10) {
            if (var10000 >= 0) {
               return false;
            }

            var10000 = (int) ((recovery$indy$10(ClientGlobals.field_48.field_48Q, var6, -3193274913672070142L, var4)) ? 1 : 0);
         }

         var10001 = var10;
      }

      label81: {
         label80:
         if (var10001) {
            label78: {
               if (var10000 != 0) {
                  var11 = ClientGlobals.field_48;
                  if (!var10) {
                     break label78;
                  }

                  if (ClientGlobals.field_48.field_48Q.field_45z != null) {
                     var10000 = (int) ((recovery$indy$11(this.settingNotWhileKillAura, -3196599011239598417L, var4)) ? 1 : 0);
                     var10001 = var10;
                     if (var2 < 0L) {
                        break label81;
                     }

                     if (!var10) {
                        break label80;
                     }

                     if (var10000 != 0) {
                        return false;
                     }
                  }
               }

               var11 = ClientGlobals.field_48;
            }

            var10000 = (int) ((recovery$indy$12(var11.field_46q, var6, -3193274913672070142L, var4)) ? 1 : 0);
         }

         var10001 = var10;
      }

      if (!var10001) {
         return var10000 != 0;
      }

      if (var10000 == 0) {
         return true;
      }

      boolean var15 = recovery$indy$13(this.settingNotWhileScaffold, -3196599011239598417L, var4);
      return !var10 ? var15 : !var15;
   }




   private boolean method_429$aae029aa0a() {
      long var1 = a ^ 112837994290576L;
      long var3 = var1 ^ 5391114858393L;
      long var10000 = -6168064464225650469L;
      boolean var5 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10002 = -6168009469884849327L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("/heal");
      if (!var5) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_42a$aae029aa0a() {
      long var1 = a ^ 27940634452882L;
      long var3 = var1 ^ 135439587086747L;
      long var10000 = -3142606126738787919L;
      boolean var5 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10002 = -3142197694265369261L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("/heal");
      if (var5) {
         var9 = !var9;
      }

      return var9;
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   public void method_487$da8c82d5d4() {
      net.C_47S6 var43;
      float var47;
      float var53;
      long var1 = a ^ 134388613542825L;
      long var3 = var1 ^ 35475769234067L;
      long var5 = var1 ^ 37789586739297L;
      long var7 = var1 ^ 26933110702496L;
      int var9 = (int)((var1 ^ 3902524006413L) >>> 48);
      long var10 = (var1 ^ 3902524006413L) << 16 >>> 16;
      long var10001 = var1 ^ 138410340241604L;
      int var12 = (int)((var1 ^ 138410340241604L) >>> 48);
      int var13 = (int)((var1 ^ 138410340241604L) << 16 >>> 32);
      int var14 = (int)(var10001 << 48 >>> 48);
      long var10000 = -4296505970732968222L;
      boolean var15 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10002 = -4296495028797715096L;
      long var16 = var7;
      ModeSetting var18 = this.settingMode;
      boolean var42 = var18.method_46$5f9dc63072(var16).equals("Grim-1.17");
      if (!var15) {
         if (!var42) {
            return;
         }

         short var45 = (short)var9;
         long var10003 = -4297397750161086405L;
         long var19 = var10;
         short var21 = var45;
         Regen_47Qy var22 = this;
         var42 = var22.method_42u$f19a3ced8f(var21, var19);
      }

      label56: {
         if (!var15) {
            if (!var42) {
               return;
            }

            var43 = ClientGlobals.field_46;
            if (var15) {
               break label56;
            }

            var10001 = -4297498147439792627L;
            C_47S6 var23 = ClientGlobals.field_46;
            C_477r var44 = var23.method_44$4f8050086d();
            var10002 = -4297344648581726095L;
            C_47S6 var24 = ClientGlobals.field_46;
            C_477r var50 = var24.method_47$4f8050086d();
            long var54 = -4298622756760937804L;
            C_477r var25 = var50;
            long var26 = var5;
            C_477r var28 = var44;
            var42 = var28.method_49$49ecd853ff(var26, var25);
         }

         if (!var42) {
            return;
         }

         var43 = ClientGlobals.field_46;
      }

      label34: {
         var10002 = -4297498147439792627L;
         C_47S6 var29 = ClientGlobals.field_46;
         var47 = var29.method_44$4f8050086d().field_44;
         long var55 = -4297498147439792627L;
         C_47S6 var30 = ClientGlobals.field_46;
         float var52 = var30.method_44$4f8050086d().field_41;
         float var56 = 0.0F;
         if (!var15) {
            if (var52 > 0.0F) {
               var55 = -4297498147439792627L;
               C_47S6 var31 = ClientGlobals.field_46;
               var53 = var31.method_44$4f8050086d().field_41 + 0.2F;
               break label34;
            }

            var55 = -4297498147439792627L;
            C_47S6 var32 = ClientGlobals.field_46;
            var52 = var32.method_44$4f8050086d().field_41;
            var56 = 0.2F;
         }

         var53 = var52 - var56;
      }

      long var10004 = -4297498147439792627L;
      C_47S6 var33 = ClientGlobals.field_46;
      long var10006 = -4297498147439792627L;
      C_47S6 var34 = ClientGlobals.field_46;
      var10006 = -4296770671168688557L;
      C_477r var48 = C_47gg.method_45$5c9cee6350(var47, var53, var3, var33.method_44$4f8050086d().field_41, var34.method_44$4f8050086d().field_41);
      char var59 = (char)var12;
      long var10007 = -4297276639871525833L;
      Regen_47Qy var35 = this;
      int var36 = var14;
      int var37 = var13;
      char var38 = var59;
      byte var39 = 1;
      C_477r var40 = var48;
      C_47S6 var41 = var43;
      var41.method_45$c163d5afc8(var40, var39, var38, var37, var36, var35);
   }





   public void method_488$e45a9973e5(long var1) {
      client.module.ModuleManager var12;
      augustus.recovered.modules.player.Regen_47Qy var13;
      long var3 = var1 ^ 37441251358680L;
      long var5 = var1 ^ 133953910404605L;
      long var7 = var1 ^ 129656859322281L;
      long var9 = var1 ^ 76629286485107L;
      boolean var11 = recovery$indy$14(-5076432703729652943L, var1);
      if (recovery$indy$15(field_43, -5075918634766878287L, var1) != null) {
         byte var10000 = (byte) ((recovery$indy$16(this.settingMode, var9, -5076518545590931269L, var1).equals(recovery$indy$17(18098, 7503857438106335614L ^ var1))) ? 1 : 0);
         boolean var10001 = var11;
         if (var1 >= 0L) {
            if (!var11) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = (byte) ((recovery$indy$19(this.field_45, recovery$indy$18(this.settingMinDelay, var5, -5079995709922711247L, var1), var7, -5079637451990835182L, var1)) ? 1 : 0);
            }

            var10001 = var11;
         }

         if (var1 >= 0L) {
            if (!var10001) {
               if (var10000 == 0) {
                  return;
               }

               double var15;
               var10000 = (byte)((
                        var15 = recovery$indy$20(field_43, -5075918634766878287L, var1).method_43$bc607678b6()
                           - recovery$indy$21(this.settingHealth, var5, -5079995709922711247L, var1)
                     )
                     == 0.0
                  ? 0
                  : (var15 < 0.0 ? -1 : 1));
            }

            var10001 = var11;
         }

         if (var1 > 0L) {
            if (!var10001) {
               if (var10000 >= 0) {
                  return;
               }

               var10000 = (byte) ((recovery$indy$22(ClientGlobals.field_48.field_48Q, var3, -5076649876717005279L, var1)) ? 1 : 0);
            }

            var10001 = var11;
         }

         label103: {
            label102:
            if (!var10001) {
               label100: {
                  if (var10000 != 0) {
                     var12 = ClientGlobals.field_48;
                     if (var11) {
                        break label100;
                     }

                     if (ClientGlobals.field_48.field_48Q.field_45z != null) {
                        var10000 = (byte) ((recovery$indy$23(this.settingNotWhileKillAura, -5079973976464520052L, var1)) ? 1 : 0);
                        var10001 = var11;
                        if (var1 < 0L) {
                           break label103;
                        }

                        if (var11) {
                           break label102;
                        }

                        if (var10000 != 0) {
                           return;
                        }
                     }
                  }

                  var12 = ClientGlobals.field_48;
               }

               var10000 = (byte) ((recovery$indy$24(var12.field_46q, var3, -5076649876717005279L, var1)) ? 1 : 0);
            }

            var10001 = var11;
         }

         label87: {
            label86: {
               if (!var10001) {
                  if (var10000 == 0) {
                     break label86;
                  }

                  var13 = this;
                  if (var11) {
                     break label87;
                  }

                  var10000 = (byte) ((recovery$indy$25(this.settingNotWhileScaffold, -5079973976464520052L, var1)) ? 1 : 0);
               }

               if (var10000 != 0) {
                  return;
               }
            }

            recovery$indy$26(field_43, -5075918634766878287L, var1).method_49$a7421bf54c(recovery$indy$27(18098, 7503857438106335614L ^ var1));
            var13 = this;
         }

         recovery$indy$28(var13.field_45, -5076336397180618737L, var1);
      }
   }




    public Regen_47Qy(long a0) {
        super((java.lang.String) ("Regen"),(java.lang.String) ("Regeneration"),(long) (((augustus.recovered.modules.player.Regen_47Qy.a ^ a0) ^ 13040282724542L)),(java.awt.Color) (new java.awt.Color((int) (224),(int) (111),(int) (49))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.player.Regen_47Qy.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.player.Regen_47Qy.a ^ a0) ^ 126620771197336L);
        long constructorKey4 = ((augustus.recovered.modules.player.Regen_47Qy.a ^ a0) ^ 70816427645043L);
        long constructorKey5 = ((augustus.recovered.modules.player.Regen_47Qy.a ^ a0) ^ 135208503194789L);
        long constructorKey6 = ((augustus.recovered.modules.player.Regen_47Qy.a ^ a0) ^ 96347349945122L);
        java.lang.Object initialValue7 = recovery$indy$flow$223(4);
        ((java.lang.Object[]) initialValue7)[0] = "Default";
        ((java.lang.Object[]) initialValue7)[1] = "Legit";
        ((java.lang.Object[]) initialValue7)[2] = "Grim-1.17";
        ((java.lang.Object[]) initialValue7)[3] = "/heal";
        client.setting.ModeSetting initialized8 = new client.setting.ModeSetting(this, "Mode", constructorKey4, "Default", (java.lang.String[]) (initialValue7));
        recovery$indy$flow$225(this, initialized8);
        client.setting.NumberSetting initialized9 = new client.setting.NumberSetting(this, "Health", Double.longBitsToDouble(4626322717216342016L), constructorKey6, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0);
        recovery$indy$flow$228(this, initialized9);
        client.setting.NumberSetting initialized10 = new client.setting.NumberSetting(this, "MinHunger", Double.longBitsToDouble(4617315517961601024L), constructorKey6, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0);
        java.lang.Object initialValue11 = recovery$indy$flow$231(this);
        java.lang.Object initialValue12 = initialValue11;
        client.setting.NumberSetting initialValue13 = initialized10;
        java.lang.Object initialValue14 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue13))))));
        java.lang.Object initialValue15 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue12))))));
        java.lang.Object initialValue16 = recovery$indy$flow$234(initialValue14, initialValue15);
        recovery$indy$flow$235(this, initialValue16);
        client.setting.NumberSetting initialized17 = new client.setting.NumberSetting(this, "Packets", Double.longBitsToDouble(4636737291354636288L), constructorKey6, 0.0D, Double.longBitsToDouble(4641240890982006784L), 0);
        java.lang.Object initialValue18 = recovery$indy$flow$238(this);
        java.lang.Object initialValue19 = initialValue18;
        client.setting.NumberSetting initialValue20 = initialized17;
        java.lang.Object initialValue21 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue20))))));
        java.lang.Object initialValue22 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue23 = recovery$indy$flow$241(initialValue21, initialValue22);
        recovery$indy$flow$242(this, initialValue23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey5, "GroundCheck", false);
        java.lang.Object initialValue25 = recovery$indy$flow$245(this);
        java.lang.Object initialValue26 = initialValue25;
        long initialValue27 = constructorKey3;
        client.setting.BooleanSetting initialValue28 = initialized24;
        java.lang.Object initialValue29 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue28))))));
        java.lang.Object initialValue30 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue31 = recovery$indy$flow$248(initialValue29, initialValue27, initialValue30);
        java.lang.Object initialValue32 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue31))))));
        recovery$indy$flow$250(this, initialValue32);
        client.setting.BooleanSetting initialized33 = new client.setting.BooleanSetting(this, constructorKey5, "StopSendPacketsIfHpReached", false);
        java.lang.Object initialValue34 = recovery$indy$flow$253(this);
        java.lang.Object initialValue35 = initialValue34;
        long initialValue36 = constructorKey3;
        client.setting.BooleanSetting initialValue37 = initialized33;
        java.lang.Object initialValue38 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue39 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue35))))));
        java.lang.Object initialValue40 = recovery$indy$flow$256(initialValue38, initialValue36, initialValue39);
        java.lang.Object initialValue41 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue40))))));
        recovery$indy$flow$258(this, initialValue41);
        client.setting.NumberSetting initialized42 = new client.setting.NumberSetting(this, "MinDelay", Double.longBitsToDouble(4673975551164153856L), constructorKey6, 0.0D, Double.longBitsToDouble(4678479150791524352L), 0);
        java.lang.Object initialValue43 = recovery$indy$flow$261(this);
        java.lang.Object initialValue44 = initialValue43;
        client.setting.NumberSetting initialValue45 = initialized42;
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue47 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue44))))));
        java.lang.Object initialValue48 = recovery$indy$flow$264(initialValue46, initialValue47);
        recovery$indy$flow$265(this, initialValue48);
        client.setting.BooleanSetting initialized49 = new client.setting.BooleanSetting(this, constructorKey5, "NotWhileKillAura", false);
        recovery$indy$flow$268(this, initialized49);
        client.setting.BooleanSetting initialized50 = new client.setting.BooleanSetting(this, constructorKey5, "NotWhileScaffold", true);
        recovery$indy$flow$271(this, initialized50);
        net.C_47cu initialized51 = new net.C_47cu();
        recovery$indy$flow$274(this, initialized51);
        return;
    }




    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$223(int a0);
    private static native void recovery$indy$flow$225(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$228(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$231(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$234(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$235(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$238(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$241(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$242(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$245(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$248(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$250(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$253(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$256(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$258(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$261(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$264(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$265(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$268(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$271(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$274(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(int var0, long var1);
   private static native void recovery$indy$2(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$3(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$4(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native boolean recovery$indy$5(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native double recovery$indy$9(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$11(Object var0, long var1, long var3);
   private static native boolean recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$13(Object var0, long var1, long var3);
   private static native boolean recovery$indy$14(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);
   private static native String recovery$indy$16(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$17(int var0, long var1);
   private static native double recovery$indy$18(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$19(Object var0, double var1, long var3, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);
   private static native double recovery$indy$21(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$22(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$23(Object var0, long var1, long var3);
   private static native boolean recovery$indy$24(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$25(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native String recovery$indy$27(int var0, long var1);
   private static native void recovery$indy$28(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$34();
}
