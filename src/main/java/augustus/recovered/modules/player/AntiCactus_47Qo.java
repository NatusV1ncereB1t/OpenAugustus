package augustus.recovered.modules.player;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.module.Module;
import client.setting.BooleanSetting;
import client.module.Category;
import net.C_4f;

public class AntiCactus_47Qo extends Module {
   public final BooleanSetting settingOnlySide;
   private static final long a = C_4f.a(3407738384397717544L, -6457047886361048684L, MethodHandles.lookup().lookupClass()).a(199211316261481L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(byte[] var0);

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public AntiCactus_47Qo(long var1) {
      super("AntiCactus", "Gegenkaktus", ((a ^ var1) ^ 122963208148322L), new Color(222, 129, 71), Category.PLAYER);
      var1 = a ^ var1;
      long var3 = var1 ^ 34020871195001L;
      long var5 = var1 ^ 122963208148322L;
      // Pure super-constructor arguments are evaluated in the first statement above.
      this.settingOnlySide = new BooleanSetting(this, var3, "OnlySide", true);
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native MethodHandle recovery$constant$0();
}
