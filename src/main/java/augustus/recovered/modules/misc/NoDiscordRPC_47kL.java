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
import client.Client;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Ld;
import client.gui.ClickGuiScreen;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import client.module.Category;
import net.C_47uT;
import net.C_4f;

public class NoDiscordRPC_47kL extends Module {
   private static final long a = C_4f.a(-9028352675732176611L, -8695610683603662852L, MethodHandles.lookup().lookupClass()).a(70553151498897L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[23];
   private static final String[] f = new String[23];

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native void a();

   private static native int a(long var0, long var2);

   private static native Method d(long var0, long var2);

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      net.minecraft.client.Minecraft var10000;
      long var3;
      int[] var7;
      WorldClient var8;
      int[] var10;
      label93: {
         label92: {
            var3 = var1 ^ 25396320000430L;
            long var5 = var1 ^ 34971597367979L;
            var7 = recovery$indy$1(-7737604528088906752L, var1);
            var10000 = field_43;
            label91:
            if (var7 == null) {
               if (!recovery$indy$2(field_43, -7737372838419085965L, var1)) {
                  var10000 = field_43;
                  if (var7 != null) {
                     break label91;
                  }

                  label87:
                  if (!(recovery$indy$3(field_43, -7737638180489784559L, var1) instanceof C_47Ld)) {
                     var10000 = field_43;
                     if (var7 != null) {
                        break label91;
                     }

                     long var10001 = -7737737070064621823L;
                     long var10002 = var1;
                     if (var1 >= 0L) {
                        if (recovery$indy$4(field_43, -7737737070064621823L, var1) != null) {
                           break label87;
                        }

                        var10000 = field_43;
                        var10001 = -7738898762256518939L;
                        var10002 = var1;
                     }

                     var8 = recovery$indy$5(var10000, var10001, var10002);
                     var10 = var7;
                     if (var1 <= 0L) {
                        break label93;
                     }

                     if (var7 != null) {
                        break label92;
                     }

                     if (var8 == null) {
                        var10000 = field_43;
                        if (var7 != null) {
                           break label91;
                        }

                        if (!(recovery$indy$6(field_43, -7737638180489784559L, var1) instanceof ClickGuiScreen)) {
                           return;
                        }
                     }
                  }
               }

               recovery$indy$9(recovery$indy$8(recovery$indy$7(-7737480203852917918L, var1), -7738995819693459758L, var1), var5, -7739054249424620704L, var1);
               var10000 = field_43;
            }

            var8 = recovery$indy$10(var10000, -7738898762256518939L, var1);
         }

         var10 = var7;
      }

      if (var10 == null) {
         if (var8 == null) {
            return;
         }

         var8 = recovery$indy$11(field_43, -7738898762256518939L, var1);
      }

      C_47uT var9;
      String var11;
      long var12;
      String var10003;
      long var10004;
      long var10005;
      label64: {
         if (var8.field_446) {
            var9 = recovery$indy$13(recovery$indy$12(-7737480203852917918L, var1), -7738995819693459758L, var1);
            var11 = recovery$indy$14(27168, 1973327809639846775L ^ var1);
            var12 = var3;
            var10003 = recovery$indy$15(29969, 978484048867560516L ^ var1);
            var10004 = -7737442880055042462L;
            var10005 = var1;
            if (var1 <= 0L) {
               break label64;
            }

            recovery$indy$16(var9, var11, var3, var10003, -7737442880055042462L, var1);
            if (var7 == null) {
               return;
            }
         }

         var9 = recovery$indy$18(recovery$indy$17(-7737480203852917918L, var1), -7738995819693459758L, var1);
         var11 = recovery$indy$19(20627, 7051371203084331457L ^ var1);
         var12 = var3;
         var10003 = recovery$indy$20(26810, 523829956900229609L ^ var1);
         var10004 = -7737442880055042462L;
         var10005 = var1;
      }

      recovery$indy$21(var9, var11, var12, var10003, var10004, var10005);
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4;
      long var6;
      long var8;
      label70: {
         int[] var10;
         Minecraft var11;
         int[] var10001;
         label66: {
            label71: {
               var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
               var6 = var4 ^ 14238317690554L;
               var8 = var4 ^ 11654222961629L;
               var10 = recovery$indy$22(2731596977119442294L, var4);
               boolean var10000 = recovery$indy$23(field_43, 2731786335591658501L, var4);
               if (var10 == null) {
                  if (var10000) {
                     break label70;
                  }

                  var11 = field_43;
                  var10001 = var10;
                  if (var3 < 0) {
                     break label66;
                  }

                  if (var10 != null) {
                     break label71;
                  }

                  var10000 = recovery$indy$24(field_43, 2731563213045539431L, var4) instanceof C_47Ld;
               }

               if (var10000) {
                  break label70;
               }

               var11 = field_43;
            }

            var10001 = var10;
         }

         if (var1 >= 0) {
            if (var10001 == null) {
               if (recovery$indy$25(var11, 2731464469499582071L, var4) != null) {
                  break label70;
               }

               var11 = field_43;
            }

            var10001 = var10;
         }

         if (var10001 == null) {
            if (recovery$indy$26(var11, 2733682512840606099L, var4) != null) {
               break label70;
            }

            var11 = field_43;
         }

         if (!(recovery$indy$27(var11, 2731563213045539431L, var4) instanceof ClickGuiScreen)) {
            return;
         }
      }

      recovery$indy$30(recovery$indy$29(recovery$indy$28(2731688161389863444L, var4), 2733549841534846884L, var4), var6, 2731866796457218081L, var4);
      recovery$indy$33(recovery$indy$32(recovery$indy$31(2731688161389863444L, var4), 2733549841534846884L, var4), var8, 2733489805498499606L, var4);
   }

   public NoDiscordRPC_47kL(long var1) {
      super("NoDiscordRPC", "KeinDiscord", ((a ^ var1) ^ 32231099643581L), new Color(180, 246, 250), Category.MISC);
      var1 = a ^ var1;
      long var3 = var1 ^ 32231099643581L;
      // Pure super-constructor arguments are evaluated in the first statement above.
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$5(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$6(Object var0, long var1, long var3);

   private static native Client recovery$indy$7(long var0, long var2);

   private static native C_47uT recovery$indy$8(Object var0, long var1, long var3);

   private static native void recovery$indy$9(Object var0, long var1, long var3, long var5);

   private static native WorldClient recovery$indy$10(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$11(Object var0, long var1, long var3);

   private static native Client recovery$indy$12(long var0, long var2);

   private static native C_47uT recovery$indy$13(Object var0, long var1, long var3);

   private static native String recovery$indy$14(int var0, long var1);

   private static native String recovery$indy$15(int var0, long var1);

   private static native void recovery$indy$16(Object var0, Object var1, long var2, Object var4, long var5, long var7);

   private static native Client recovery$indy$17(long var0, long var2);

   private static native C_47uT recovery$indy$18(Object var0, long var1, long var3);

   private static native String recovery$indy$19(int var0, long var1);

   private static native String recovery$indy$20(int var0, long var1);

   private static native void recovery$indy$21(Object var0, Object var1, long var2, Object var4, long var5, long var7);

   private static native int[] recovery$indy$22(long var0, long var2);

   private static native boolean recovery$indy$23(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$24(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$25(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$26(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$27(Object var0, long var1, long var3);

   private static native Client recovery$indy$28(long var0, long var2);

   private static native C_47uT recovery$indy$29(Object var0, long var1, long var3);

   private static native void recovery$indy$30(Object var0, long var1, long var3, long var5);

   private static native Client recovery$indy$31(long var0, long var2);

   private static native C_47uT recovery$indy$32(Object var0, long var1, long var3);

   private static native void recovery$indy$33(Object var0, long var1, long var3, long var5);

   private static native MethodHandle recovery$constant$34();
}
