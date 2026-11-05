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
import net.C_46I;
import net.C_47MS;
import client.module.Module;
import client.setting.NumberSetting;
import net.C_47oo;
import client.module.Category;
import net.C_47tf;
import net.C_47vk;
import net.C_47xz;
import net.C_4f;

public class CustomCamera_47Hb extends Module implements C_47MS, C_47xz {
   public final NumberSetting settingCustomHeight;
   public final NumberSetting settingCustomHeightF5;
   public final NumberSetting settingCustomX;
   public final NumberSetting settingCustomXF5;
   public final NumberSetting settingCustomZ;
   public final NumberSetting settingCustomZF5;
   public final NumberSetting settingCustomThirdPersonDistance;
   private static final long a = C_4f.a(-8158028403386345034L, 6499508551616378514L, MethodHandles.lookup().lookupClass()).a(36329586860662L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[24];
   private static final String[] f = new String[24];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   @Override
   public void method_42$81a716381c(C_47vk var1, long var2) {
      long var4 = var2 ^ 119648766886237L;
      int[] var6 = recovery$indy$1(-3665033446864588766L, var2);
      int var10000 = recovery$indy$2(field_43, -3664859816977647866L, var2).field_44S;
      if (var6 == null) {
         if (var10000 == 1) {
            recovery$indy$5(
               var1,
               (float)(recovery$indy$3(var1, -3665193144532969971L, var2) + recovery$indy$4(this.settingCustomHeightF5, var4, -3664653821258576917L, var2)),
               -3664925918783541094L,
               var2
            );
            recovery$indy$8(
               var1,
               new C_47tf(
                  recovery$indy$6(this.settingCustomXF5, var4, -3664653821258576917L, var2), 0.0, recovery$indy$7(this.settingCustomZF5, var4, -3664653821258576917L, var2)
               ),
               -3665354029662096098L,
               var2
            );
            if (var6 == null) {
               return;
            }
         }

         var10000 = recovery$indy$9(field_43, -3664859816977647866L, var2).field_44S;
      }

      if (var10000 == 0) {
         recovery$indy$12(
            var1,
            (float)(recovery$indy$10(var1, -3665193144532969971L, var2) + recovery$indy$11(this.settingCustomHeight, var4, -3664653821258576917L, var2)),
            -3664925918783541094L,
            var2
         );
         recovery$indy$15(
            var1,
            new C_47tf(
               recovery$indy$13(this.settingCustomX, var4, -3664653821258576917L, var2), 0.0, recovery$indy$14(this.settingCustomZ, var4, -3664653821258576917L, var2)
            ),
            -3665354029662096098L,
            var2
         );
      }
   }

   private static native Method d(long var0, long var2);

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$16(this, 24, 11, var3, -7099825413397689531L, var1);
      recovery$indy$17(this, 40, var5, -7099537260238887862L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 113186446332478L;
      recovery$indy$18(field_43, 2180238314528188500L, var4).field_45U = (float)recovery$indy$19(this.settingCustomThirdPersonDistance, var6, 2181856463013025928L, var4);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      int[] var3 = recovery$indy$20(-7737627927656420961L, var1);
      C_46I var10000 = recovery$indy$21(field_43, -7737313867723398518L, var1);
      if (var3 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = recovery$indy$22(field_43, -7737313867723398518L, var1);
      }

      var10000.field_45U = 4.0F;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public CustomCamera_47Hb(long var1) {
      super("CustomCamera", "EinstellbareKamera", ((a ^ var1) ^ 29180946046132L), new Color(105, 66, 245), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 78024642314024L;
      long var5 = var1 ^ 29180946046132L;
      // Super arguments moved to the required Java constructor position.
      this.settingCustomHeight = new NumberSetting(this, "CustomHeight", 0.0, var3, -5.0, 10.0, 2);
      this.settingCustomHeightF5 = new NumberSetting(this, "CustomHeightF5", 0.0, var3, -5.0, 10.0, 2);
      this.settingCustomX = new NumberSetting(this, "CustomX", 0.0, var3, -5.0, 5.0, 2);
      this.settingCustomXF5 = new NumberSetting(this, "CustomXF5", 0.0, var3, -5.0, 5.0, 2);
      this.settingCustomZ = new NumberSetting(this, "CustomZ", 0.0, var3, -5.0, 5.0, 2);
      this.settingCustomZF5 = new NumberSetting(this, "CustomZF5", 0.0, var3, -5.0, 5.0, 2);
      this.settingCustomThirdPersonDistance = new NumberSetting(this, "CustomThirdPersonDistance", 4.0, var3, 0.0, 30.0, 1);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native C_47oo recovery$indy$2(Object var0, long var1, long var3);

   private static native float recovery$indy$3(Object var0, long var1, long var3);

   private static native double recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$5(Object var0, float var1, long var2, long var4);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$8(Object var0, Object var1, long var2, long var4);

   private static native C_47oo recovery$indy$9(Object var0, long var1, long var3);

   private static native float recovery$indy$10(Object var0, long var1, long var3);

   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$12(Object var0, float var1, long var2, long var4);

   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$14(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$15(Object var0, Object var1, long var2, long var4);

   private static native void recovery$indy$16(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);

   private static native C_46I recovery$indy$18(Object var0, long var1, long var3);

   private static native double recovery$indy$19(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$20(long var0, long var2);

   private static native C_46I recovery$indy$21(Object var0, long var1, long var3);

   private static native C_46I recovery$indy$22(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$23();
}
