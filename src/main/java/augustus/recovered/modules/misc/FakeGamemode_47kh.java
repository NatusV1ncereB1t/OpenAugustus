package augustus.recovered.modules.misc;

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
import net.C_40g;
import net.C_47IT;
import client.module.Module;
import client.setting.ModeSetting;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class FakeGamemode_47kh extends Module implements C_47xz {
   private C_47IT field_42;
   private ModeSetting settingGamemode;
   private static final long a = C_4f.a(2820245714181606786L, 6691991304009774154L, MethodHandles.lookup().lookupClass()).a(204321497095682L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[15];
   private static final String[] f = new String[15];

   private static native Field b(Class var0, String var1, Class var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Class b(long var0, long var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$1(this, 40, var3, -7097804970734049479L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4;
      int[] var8;
      int var12;
      var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 99593642957744L;
      String var10 = recovery$indy$2(this.settingGamemode, var6, 2181756820290158638L, var4);
      int[] var10000 = recovery$indy$3(2181841339010758731L, var4);
      byte var11 = -1;
      var8 = var10000;
      var12 = var10.hashCode();
      label123:
      if (var8 == null) {
         label126: {
            label120: {
               label127: {
                  label118: {
                     label128: {
                        switch (var12) {
                           case -1535938722:
                              var12 = (int) ((var10.equals(recovery$indy$4(26026, 6330886701617166730L ^ var4))) ? 1 : 0);
                              if (var8 != null) {
                                 break label123;
                              }

                              if (var12 == 0) {
                                 break label126;
                              }

                              var12 = 0;
                              if (var3 <= 0) {
                                 break;
                              }

                              var11 = 0;
                              if (var8 == null) {
                                 break label126;
                              }
                           case 1885066191:
                              var12 = (int) ((var10.equals(recovery$indy$5(19912, 9166379229210841577L ^ var4))) ? 1 : 0);
                              break;
                           case 319374543:
                              break label127;
                           case 1309873904:
                              break label128;
                           default:
                              break label126;
                        }

                        if (var8 != null) {
                           break label123;
                        }

                        if (var12 == 0) {
                           break label126;
                        }

                        var12 = 1;
                        if (var3 <= 0) {
                           break label118;
                        }

                        var11 = 1;
                        if (var8 == null) {
                           break label126;
                        }
                     }

                     var12 = (int) ((var10.equals(recovery$indy$6(26924, 226039702839080203L ^ var4))) ? 1 : 0);
                  }

                  if (var8 != null) {
                     break label123;
                  }

                  if (var12 == 0) {
                     break label126;
                  }

                  var12 = 2;
                  if (var2 < 0) {
                     break label120;
                  }

                  var11 = 2;
                  if (var8 == null) {
                     break label126;
                  }
               }

               var12 = (int) ((var10.equals(recovery$indy$7(26764, 4232898441660970158L ^ var4))) ? 1 : 0);
            }

            if (var8 != null) {
               break label123;
            }

            if (var12 != 0) {
               var11 = 3;
            }
         }

         var12 = var11;
      }

      C_47IT var9;
      switch (var12) {
         case 0:
            var9 = C_47IT.SURVIVAL;
            if (var2 <= 0) {
               return;
            }

            if (var8 == null) {
               break;
            }
         case 1:
            var9 = C_47IT.CREATIVE;
            if (var1 <= 0) {
               return;
            }

            if (var8 == null) {
               break;
            }
         case 2:
            var9 = C_47IT.ADVENTURE;
            if (var1 <= 0) {
               return;
            }

            if (var8 == null) {
               break;
            }
         case 3:
            var9 = C_47IT.SPECTATOR;
            if (var2 <= 0) {
               return;
            }

            if (var8 == null) {
               break;
            }
         default:
            var9 = recovery$indy$8(field_43, 2181969854486073720L, var4).method_46$73d174f422();
      }

      recovery$indy$9(field_43, 2181969854486073720L, var4).method_45$1e47fea583(var9);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$10(field_43, -7738974990615028826L, var1).method_45$1e47fea583(this.field_42);
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      if (recovery$indy$11(field_43, 2733604059695082192L, var4) != null) {
         this.field_42 = recovery$indy$12(field_43, 2733604059695082192L, var4).method_46$73d174f422();
      }
   }

   public FakeGamemode_47kh(long var1) {
      super("FakeGamemode", "UnechterSpielmodus", ((a ^ var1) ^ 19583286408815L), new Color(243, 245, 152), Category.MISC);
      var1 = a ^ var1;
      long var3 = var1 ^ 99486604756642L;
      long var5 = var1 ^ 19583286408815L;
      // Super arguments moved to the required Java constructor position.
      this.field_42 = C_47IT.SURVIVAL;
      this.settingGamemode = new ModeSetting(this, "Gamemode", var3, "Creative", new String[]{"Survival", "Creative", "Adventure", "Spectator"});
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, int var1, long var2, long var4, long var6);

   private static native String recovery$indy$2(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$3(long var0, long var2);

   private static native String recovery$indy$4(int var0, long var1);

   private static native String recovery$indy$5(int var0, long var1);

   private static native String recovery$indy$6(int var0, long var1);

   private static native String recovery$indy$7(int var0, long var1);

   private static native C_40g recovery$indy$8(Object var0, long var1, long var3);

   private static native C_40g recovery$indy$9(Object var0, long var1, long var3);

   private static native C_40g recovery$indy$10(Object var0, long var1, long var3);

   private static native C_40g recovery$indy$11(Object var0, long var1, long var3);

   private static native C_40g recovery$indy$12(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$13();
}
