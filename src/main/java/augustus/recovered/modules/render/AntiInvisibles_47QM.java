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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.module.Category;
import net.C_47u_;
import net.C_4f;

public class AntiInvisibles_47QM extends Module {
   public final MultiSelectSetting settingEntities;
   private static final long a = C_4f.a(-7923795455253313409L, 5545957690656990845L, MethodHandles.lookup().lookupClass()).a(237481831863000L);
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

   public boolean method_43$5909fdf9ee(long var1, Entity var3) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 133148183590396L;
      int var4 = (int)((var1 ^ 133148183590396L) >>> 48);
      int var5 = (int)((var1 ^ 133148183590396L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      int[] var7 = recovery$indy$1(9195535422494170458L, var1);
      boolean var10000 = var3 instanceof EntityPlayerSP;
      if (var7 == null) {
         if (var10000) {
            return false;
         }

         var10000 = recovery$indy$7(
            var3,
            recovery$indy$2(C_47u_.PLAYER, 9195654282415385654L, var1),
            recovery$indy$3(C_47u_.MOB, 9195654282415385654L, var1),
            (short)var4,
            recovery$indy$4(C_47u_.ANIMAL, 9195654282415385654L, var1),
            recovery$indy$5(C_47u_.VILLAGER, 9195654282415385654L, var1),
            recovery$indy$6(C_47u_.ARMOR_STAND, 9195654282415385654L, var1),
            true,
            false,
            false,
            var5,
            true,
            (char)var6,
            9195596255629576580L,
            var1
         );
      }

      return var7 != null ? var10000 : var10000;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public AntiInvisibles_47QM(long var1) {
      super("AntiInvisibles", "GegenUnsichtbare", ((a ^ var1) ^ 31504250106660L), new Color(87, 247, 196), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 49868846497490L;
      long var5 = var1 ^ 31504250106660L;
      // Super arguments moved to the required Java constructor position.
      long var10005 = -388269674301504644L;
      this.settingEntities = new MultiSelectSetting(this, "Entities", var3, C_47u_.values());
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native boolean recovery$indy$4(Object var0, long var1, long var3);

   private static native boolean recovery$indy$5(Object var0, long var1, long var3);

   private static native boolean recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(
      Object var0,
      boolean var1,
      boolean var2,
      short var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      int var10,
      boolean var11,
      char var12,
      long var13,
      long var15
   );

   private static native MethodHandle recovery$constant$8();
}
