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
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47Vc;
import client.ClientGlobals;
import client.module.Category;
import net.C_4f;

public class NoJumpDelay_47kO extends Module implements C_47Vc {
   private final BooleanSetting settingWhileScaffold;
   private final NumberSetting settingChance;
   private static final long a = C_4f.a(6902536792109545901L, 2590561685506223652L, MethodHandles.lookup().lookupClass()).a(21633988023037L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[18];
   private static final String[] f = new String[18];

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
      recovery$indy$1(this, 43, var3, -7098071520603744726L, var1);
   }

   @Override
   public void method_45q$e45a9973e5(long var1) {
      byte var10000;
      long var3 = var1 ^ 95026549109020L;
      long var5 = var1 ^ 15070989284153L;
      boolean var7 = recovery$indy$2(4557727553088195548L, var1);
      var10000 = (byte) ((recovery$indy$3(ClientGlobals.field_48.field_46q, var3, 4559713019610472974L, var1)) ? 1 : 0);
      label28:
      if (!var7) {
         if (var10000 != 0) {
            var10000 = (byte) ((recovery$indy$4(this.settingWhileScaffold, 4557706863004178424L, var1)) ? 1 : 0);
            if (var7) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         }

         double var8;
         var10000 = (byte)((var8 = Math.random() - recovery$indy$5(this.settingChance, var5, 4557811451641680503L, var1) / 100.0) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1));
      }

      if (var10000 <= 0) {
         recovery$indy$6(field_43, 4559658178831375361L, var1).method_48$d00df7729d(0);
      }
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public NoJumpDelay_47kO(long var1) {
      super("NoJumpDelay", "KeineSprungVerzögerung", ((a ^ var1) ^ 6946751741053L), new Color(235, 64, 52), Category.MOVEMENT);
      var1 = a ^ var1;
      long var3 = var1 ^ 131348304863334L;
      long var5 = var1 ^ 99152982810593L;
      long var7 = var1 ^ 6946751741053L;
      // Pure super-constructor arguments are evaluated in the first statement above.
      this.settingWhileScaffold = new BooleanSetting(this, var3, "WhileScaffold", true);
      this.settingChance = new NumberSetting(this, "Chance", 100.0, var5, 0.0, 100.0, 0);
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, int var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$2(long var0, long var2);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$4(Object var0, long var1, long var3);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$7();
}
