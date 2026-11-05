package augustus.recovered.modules.movement;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
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
import net.C_472n;
import net.C_475P;
import net.C_475y;
import net.C_478Q;
import net.C_478i;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47FN;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import client.module.Category;
import net.C_47tj;
import net.C_4f;

public class SafeWalk_47kH extends Module implements C_47FN, C_47hi {
   public final ModeSetting settingMode;
   public final BooleanSetting settingInAir;
   public final BooleanSetting settingEdgeCheck;
   private static final long a = C_4f.a(8128748899688522171L, 3025055272931596416L, MethodHandles.lookup().lookupClass()).a(203026033878917L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[30];
   private static final String[] f = new String[30];

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(byte[] var0);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Class b(long var0, long var2);

   private static native String b(int var0, long var1);

   @Override
   public void method_46$486e3ab5ea(C_47tj var1, long var2) {
      long var4 = var2 ^ 11445004345299L;
      C_475y var7 = recovery$indy$1(field_43, -2728558176465919686L, var2)
         .method_46$efbf73d2b1(
            new C_478Q(
               recovery$indy$2(field_43, -2728896875394167764L, var2).field_48Q,
               recovery$indy$3(field_43, -2728896875394167764L, var2).field_48j - 1.0,
               recovery$indy$4(field_43, -2728896875394167764L, var2).field_42o
            )
         )
         .method_48$e084f7739d();
      boolean var10000 = recovery$indy$5(-2728539689085959461L, var2);
      C_475y var8 = recovery$indy$6(field_43, -2728558176465919686L, var2)
         .method_46$efbf73d2b1(
            new C_478Q(
               recovery$indy$7(field_43, -2728896875394167764L, var2).field_48Q,
               recovery$indy$8(field_43, -2728896875394167764L, var2).field_48j - 2.0,
               recovery$indy$9(field_43, -2728896875394167764L, var2).field_42o
            )
         )
         .method_48$e084f7739d();
      boolean var6 = var10000;
      var10000 = recovery$indy$10(field_43, -2728896875394167764L, var2).field_48M;
      if (!var6) {
         if (var10000) {
            var10000 = recovery$indy$11(this.settingMode, var4, -2729068240701554363L, var2).equals(recovery$indy$12(2902, 5304919454044431482L ^ var2));
            if (var2 > 0L) {
               if (!var10000) {
                  return;
               }

               recovery$indy$13(var1, true, -2728772263812874601L, var2);
               var10000 = var6;
            }

            if (!var10000) {
               return;
            }
         }

         var10000 = recovery$indy$14(this.settingInAir, -2728081504194758071L, var2);
      }

      boolean var10001 = var6;
      if (var2 > 0L) {
         if (!var6) {
            if (!var10000) {
               return;
            }

            var10000 = var7 instanceof C_475P;
         }

         var10001 = var6;
      }

      label51: {
         label50:
         if (!var10001) {
            if (var10000) {
               var10000 = var8 instanceof C_475P;
               if (var6) {
                  break label50;
               }

               if (var10000) {
                  break label51;
               }
            }

            var10000 = recovery$indy$15(this.settingEdgeCheck, -2728081504194758071L, var2);
         }

         if (var10000) {
            return;
         }
      }

      recovery$indy$16(var1, true, -2728772263812874601L, var2);
   }

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   @Override
   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var4 = var2 ^ 74807535967538L;
      long var6 = var2 ^ 114177752653958L;
      boolean var8 = recovery$indy$17(6396129421236000501L, var2);
      if (recovery$indy$18(this.settingMode, var4, 6395437498392085412L, var2).equals(recovery$indy$19(16837, 5495615166237731852L ^ var2))) {
         C_478i var13;
         boolean var14;
         boolean var10000;
         boolean var10001;
         label95: {
            label94: {
               label93: {
                  label92: {
                     label99: {
                        label90: {
                           C_475y var9 = recovery$indy$20(field_43, 6396088568496939995L, var2)
                              .method_45$4093413a27(
                                 recovery$indy$21(field_43, 6395195728637300429L, var2).field_48Q,
                                 recovery$indy$22(field_43, 6395195728637300429L, var2).field_48j - 1.0,
                                 recovery$indy$23(field_43, 6395195728637300429L, var2).field_42o
                              )
                              .method_48$e084f7739d();
                           C_475y var10 = recovery$indy$24(field_43, 6396088568496939995L, var2)
                              .method_45$4093413a27(
                                 recovery$indy$25(field_43, 6395195728637300429L, var2).field_48Q,
                                 recovery$indy$26(field_43, 6395195728637300429L, var2).field_48j - 2.0,
                                 recovery$indy$27(field_43, 6395195728637300429L, var2).field_42o
                              )
                              .method_48$e084f7739d();
                           double[] var11 = recovery$indy$29(0, var6, recovery$indy$28(field_43, 6395195728637300429L, var2), 6395253688328522393L, var2);
                           float var12 = recovery$indy$30(field_43, 6395195728637300429L, var2).field_48w / 2.0F;
                           var13 = new C_478i(
                              var11[0] - var12,
                              var11[1],
                              var11[2] - var12,
                              var11[0] + var12,
                              var11[1] + recovery$indy$31(field_43, 6395195728637300429L, var2).field_48,
                              var11[2] + var12
                           );
                           var14 = false;
                           var10000 = recovery$indy$32(field_43, 6395195728637300429L, var2).field_48M;
                           label89:
                           if (var8) {
                              if (!var10000) {
                                 var10000 = var9 instanceof C_475P;
                                 var10001 = var8;
                                 if (var2 <= 0L) {
                                    break label90;
                                 }

                                 if (!var8) {
                                    break label89;
                                 }

                                 if (var10000) {
                                    var10000 = var10 instanceof C_475P;
                                    if (!var8) {
                                       break label92;
                                    }

                                    if (var10000) {
                                       break label99;
                                    }
                                 }
                              }

                              var10000 = recovery$indy$33(this.settingEdgeCheck, 6395857157515442344L, var2);
                           }

                           var10001 = var8;
                        }

                        if (var2 < 0L) {
                           break label95;
                        }

                        if (!var10001) {
                           break label94;
                        }

                        if (var10000) {
                           break label93;
                        }
                     }

                     var13.method_47$800791f322(
                        0.0,
                        recovery$indy$34(field_43, 6395195728637300429L, var2).field_438
                           - recovery$indy$35(field_43, 6395195728637300429L, var2).method_45$6684d3c618().field_46,
                        0.0
                     );
                     var10000 = true;
                  }

                  var14 = var10000;
               }

               var10000 = recovery$indy$36(field_43, 6395195728637300429L, var2).field_48M;
            }

            var10001 = var8;
         }

         if (var2 >= 0L) {
            if (var10001) {
               if (var10000) {
                  var14 = true;
               }

               var10000 = var14;
            }

            var10001 = var8;
         }

         if (var10001) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$37(field_43, 6396088568496939995L, var2)
               .method_48$d4a3a06218(
                  recovery$indy$38(field_43, 6395195728637300429L, var2), var13.method_47$800791f322(0.0, -0.51, 0.0).method_42$800791f322(-0.22, 0.0, -0.22)
               )
               .isEmpty();
         }

         if (var10000) {
            recovery$indy$39(var1, true, 6395469116949353985L, var2);
         }
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$40(this, 33, var3, -7099690135541263438L, var1);
      recovery$indy$41(this, 21, var3, -7099690135541263438L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public SafeWalk_47kH(long var1) {
      super("SafeWalk", "SichererWeg", ((a ^ var1) ^ 46066899659442L), new Color(115, 135, 26), Category.MOVEMENT);
      var1 = a ^ var1;
      long var3 = var1 ^ 89132756722580L;
      long var5 = var1 ^ 108103661542015L;
      long var7 = var1 ^ 97587203307177L;
      long var9 = var1 ^ 46066899659442L;
      // Super arguments moved to the required Java constructor position.
      this.settingMode = new ModeSetting(this, "Mode", var5, "Basic", new String[]{"Basic", "Sneak"});
      this.settingInAir = new BooleanSetting(this, var7, "InAir", true);
      BooleanSetting var10001 = new BooleanSetting(this, var7, "EdgeCheck", true);
      BooleanSetting var10002 = this.settingInAir;
      this.settingInAir.getClass();
      C_45n var10003 = recovery$indy$42(var10002);
      long var10004 = -6697184649554430984L;
      C_45n var11 = var10003;
      long var12 = var3;
      BooleanSetting var14 = var10001;
      this.settingEdgeCheck = (BooleanSetting)var14.method_43$780fd62a21(var12, var11);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native WorldClient recovery$indy$1(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native boolean recovery$indy$5(long var0, long var2);

   private static native WorldClient recovery$indy$6(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);

   private static native String recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$12(int var0, long var1);

   private static native void recovery$indy$13(Object var0, boolean var1, long var2, long var4);

   private static native boolean recovery$indy$14(Object var0, long var1, long var3);

   private static native boolean recovery$indy$15(Object var0, long var1, long var3);

   private static native void recovery$indy$16(Object var0, boolean var1, long var2, long var4);

   private static native boolean recovery$indy$17(long var0, long var2);

   private static native String recovery$indy$18(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$19(int var0, long var1);

   private static native WorldClient recovery$indy$20(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$22(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$24(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$25(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$27(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);

   private static native double[] recovery$indy$29(int var0, long var1, Object var3, long var4, long var6);

   private static native EntityPlayerSP recovery$indy$30(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);

   private static native boolean recovery$indy$33(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$34(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$35(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$37(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$38(Object var0, long var1, long var3);

   private static native void recovery$indy$39(Object var0, boolean var1, long var2, long var4);

   private static native void recovery$indy$40(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$41(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$42(BooleanSetting var0);

   private static native MethodHandle recovery$constant$43();
}
