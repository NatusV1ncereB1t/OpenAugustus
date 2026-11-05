package augustus.recovered.modules.render;

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
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_42a;
import net.C_45n;
import net.C_473P;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47H;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47bs;
import net.C_47cu;
import client.module.Category;
import net.C_48q;
import net.C_4f;

public class Particle_47Hq extends Module implements C_48q {
   private final Map field_49;
   private final BooleanSetting settingOnlyWhileMoving;
   private static final long a = C_4f.a(-7354935704431493265L, 2349124141907141914L, MethodHandles.lookup().lookupClass()).a(191557384552960L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[33];
   private static final String[] f = new String[33];

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(byte[] var0);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @Override
   public void method_46$2c4d5d53cf(long var1, C_47H var3) {
      net.C_47cu var19;
      long var4;
      long var6;
      int[] var10;
      Particle_47Hq var17;
      label75: {
         label74: {
            var4 = var1 ^ 131872998763776L;
            var6 = var1 ^ 136101457772372L;
            long var8 = var1 ^ 88992703820346L;
            var10 = recovery$indy$1(7025542492472446556L, var1);
            boolean var10000 = recovery$indy$2(var8, 7024908063250113645L, var1);
            if (var10 == null) {
               if (var10000) {
                  break label74;
               }

               var17 = this;
               if (var10 != null) {
                  break label75;
               }

               var10000 = recovery$indy$3(this.settingOnlyWhileMoving, 7025387400630382804L, var1);
            }

            if (var10000) {
               return;
            }
         }

         var17 = this;
      }

      for (Object recovered$element$3060 : var17.field_49.entrySet()) {
         Entry var12 = (Entry) recovered$element$3060;
         label61: {
            label60: {
               boolean var18 = recovery$indy$5((BooleanSetting)recovery$indy$4((C_42a)var12.getValue(), 7024542575142556535L, var1), 7025387400630382804L, var1);
               if (var10 == null) {
                  if (!var18) {
                     continue;
                  }

                  try {
                     var19 = (C_47cu)recovery$indy$7((C_42a)recovery$indy$6((C_42a)var12.getValue(), 7024934951569340932L, var1), 7024934951569340932L, var1);
                     Object var10001 = var10;
                     if (var1 >= 0L) {
                        if (var10 != null) {
                           break label60;
                        }

                        var10001 = recovery$indy$9((C_42a)recovery$indy$8((C_42a)var12.getValue(), 7024934951569340932L, var1), 7024542575142556535L, var1);
                     }

                     var18 = recovery$indy$11(var19, recovery$indy$10((NumberSetting)var10001, var4, 7025546582292593433L, var1), var6, 7025463488039568522L, var1);
                  } catch (Exception var16) {
                     break label61;
                  }
               }

               try {
                  if (!var18) {
                     break label61;
                  }

                  var19 = (C_47cu)recovery$indy$13((C_42a)recovery$indy$12((C_42a)var12.getValue(), 7024934951569340932L, var1), 7024934951569340932L, var1);
               } catch (Exception var15) {
                  break label61;
               }
            }

            try {
               recovery$indy$14(var19, 7024793055692250117L, var1);
               recovery$indy$15(field_43, 7024649779260915217L, var1)
                  .method_43$0db20251fe(
                     recovery$indy$16(field_43, 7024998293355208122L, var1),
                     (C_473P)var12.getKey(),
                     recovery$indy$17(field_43, 7024998293355208122L, var1).field_48 / -2.0F + 0.1F
                  );
            } catch (Exception var14) {
            }
         }

         if (var10 != null) {
            break;
         }
      }
   }

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   private String method_49$e168718026(long var1, String var3) {
      var1 = a ^ var1;
      var3 = var3.replace("_", " ");
      int[] var10000 = recovery$indy$18(-3938741302975256971L, var1);
      StringBuilder var5 = new StringBuilder();
      char[] var6 = var3.toCharArray();
      int[] var4 = var10000;
      int var7 = 0;

      while (var7 < var6.length) {
         label54: {
            label53: {
               char var8;
               label62: {
                  var8 = var6[var7];
                  var10000 = var4;
                  if (var1 > 0L) {
                     if (var4 == null) {
                        label47: {
                           int var12 = var7;
                           if (var1 >= 0L) {
                              if (var7 == 0) {
                                 break label47;
                              }

                              var12 = var6[var7 - 1];
                           }

                           if (var12 != 32) {
                              break label62;
                           }
                        }

                        var5.append(var8);
                     }

                     var10000 = var4;
                  }

                  if (var1 < 0L) {
                     break label54;
                  }

                  if (var10000 == null) {
                     break label53;
                  }
               }

               var5.append(String.valueOf(var8).toLowerCase());
            }

            var7++;
            var10000 = var4;
         }

         if (var10000 != null) {
            break;
         }
      }

      return var5.toString();
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$19(this, 16, var3, -7098994700982110677L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Particle_47Hq(int var1, short var2, char var3) {
      super("Particle", "PartkelBeimLaufenUnterEinem", ((((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a) ^ 110174074963442L), new Color(247, 186, 106), Category.RENDER);
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 23190226917865L;
      long var8 = var4 ^ 33998428780055L;
      long var10 = var4 ^ 61913402762862L;
      long var12 = var4 ^ 110174074963442L;
      // Super arguments moved to the required Java constructor position.
      this.field_49 = new HashMap();
      long var10000 = 886606627501761390L;
      int[] var31 = AntiStrike_47Qa.method_42$d4d28024c9();
      this.settingOnlyWhileMoving = new BooleanSetting(this, var6, "OnlyWhileMoving", true);
      C_473P[] var15 = C_473P.values();
      int var16 = var15.length;
      int[] var14 = var31;
      int var17 = 0;

      while (var17 < var16) {
         C_473P var18;
         label24: {
            var18 = var15[var17];
            int var32 = var18.method_43$8abf5c6871();
            byte var10001 = 36;
            if (var14 == null) {
               if (var32 < 36) {
                  break label24;
               }

               var32 = var18.method_43$8abf5c6871();
               var10001 = 38;
            }

            if (var32 <= var10001) {
               return;
            }
         }

         StringBuilder var10003 = new StringBuilder().append("Use ");
         String var10006 = var18.name();
         long var10007 = 886818892278767562L;
         String var21 = var10006;
         long var22 = var8;
         Particle_47Hq var24 = this;
         BooleanSetting var19 = new BooleanSetting(this, var6, var10003.append(var24.method_49$e168718026(var22, var21)).toString(), false);
         var10003 = new StringBuilder();
         var10006 = var18.name();
         var10007 = 886818892278767562L;
         String var25 = var10006;
         long var26 = var8;
         Particle_47Hq var28 = this;
         NumberSetting var33 = new NumberSetting(this, var10003.append(var28.method_49$e168718026(var26, var25)).append("Delay ").toString(), 250.0, var10, 1.0, 1000.0, 0);
         var19.getClass();
         C_45n var34 = recovery$indy$20(var19);
         long var10002 = 882755175708597954L;
         C_45n var29 = var34;
         NumberSetting var30 = var33;
         NumberSetting var20 = var30.method_43$9db6d416f4(var29);
         this.field_49.put(var18, new C_42a(var19, new C_42a(var20, new C_47cu())));
         var17++;
         if (var14 != null) {
            break;
         }
      }
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(long var0, long var2, long var4);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native Object recovery$indy$4(Object var0, long var1, long var3);

   private static native boolean recovery$indy$5(Object var0, long var1, long var3);

   private static native Object recovery$indy$6(Object var0, long var1, long var3);

   private static native Object recovery$indy$7(Object var0, long var1, long var3);

   private static native Object recovery$indy$8(Object var0, long var1, long var3);

   private static native Object recovery$indy$9(Object var0, long var1, long var3);

   private static native double recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$11(Object var0, double var1, long var3, long var5, long var7);

   private static native Object recovery$indy$12(Object var0, long var1, long var3);

   private static native Object recovery$indy$13(Object var0, long var1, long var3);

   private static native void recovery$indy$14(Object var0, long var1, long var3);

   private static native C_47bs recovery$indy$15(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$16(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$17(Object var0, long var1, long var3);

   private static native int[] recovery$indy$18(long var0, long var2);

   private static native void recovery$indy$19(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$20(BooleanSetting var0);

   private static native MethodHandle recovery$constant$21();
}
