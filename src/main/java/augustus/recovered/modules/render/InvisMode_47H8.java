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
import client.Client;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.module.Category;
import net.C_4f;
import org.lwjgl.opengl.Display;

public class InvisMode_47H8 extends Module {
   private BooleanSetting settingDisableCustomEscapeMenu;
   private BooleanSetting settingDisableCustomMainMenu;
   private static Setting[] field_44;
   private static final long a = C_4f.a(-9012971265732731070L, 1833589960864296044L, MethodHandles.lookup().lookupClass()).a(91278375834410L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[17];
   private static final String[] f = new String[17];

   private static native String b(byte[] var0);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Class b(long var0, long var2);

   private static native String b(int var0, long var1);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field b(Class var0, String var1, Class var2);

   public static Setting[] method_46$19d51fe81e() {
      return field_44;
   }

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native void a();

   private static native int a(long var0, long var2);

   private static native Method d(long var0, long var2);

   public boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      return recovery$indy$1(this.settingDisableCustomEscapeMenu, -773219491615305122L, var1);
   }

   public boolean method_45$e9830c5930(short var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      return recovery$indy$2(this.settingDisableCustomMainMenu, -8222173694692693250L, var4);
   }

   public static void method_47$5994d1a418(Setting[] var0) {
      field_44 = var0;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      long var3 = (var1 ^ 5914475407468L) >>> 8;
      int var5 = (int)((var1 ^ 5914475407468L) << 56 >>> 56);
      long var6 = var1 ^ 49971492214880L;
      Display.setTitle(
         recovery$indy$4(recovery$indy$3(-7739036243078217189L, var1), var3, (byte)var5, -7739144813807441872L, var1)
            + " "
            + recovery$indy$6(recovery$indy$5(-7739036243078217189L, var1), var6, -7738926856081575820L, var1)
      );
      recovery$indy$7(field_43, false, -7738951387167991436L, var1);
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      Display.setTitle(recovery$indy$8(27379, 5799371203555652614L ^ var4));
      recovery$indy$9(field_43, true, 2733594677791385602L, var4);
   }

   public InvisMode_47H8(long var1) {
      super("InvisMode", "UnsichtbarMode", ((a ^ var1) ^ 45810756148622L), new Color(3, 252, 227), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 97369701876117L;
      long var5 = var1 ^ 45810756148622L;
      // Super arguments moved to the required Java constructor position.
      this.settingDisableCustomEscapeMenu = new BooleanSetting(this, var3, "Disable custom escape menu", true);
      this.settingDisableCustomMainMenu = new BooleanSetting(this, var3, "Disable custom main menu", false);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(Object var0, long var1, long var3);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native Client recovery$indy$3(long var0, long var2);

   private static native String recovery$indy$4(Object var0, long var1, byte var3, long var4, long var6);

   private static native Client recovery$indy$5(long var0, long var2);

   private static native String recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$7(Object var0, boolean var1, long var2, long var4);

   private static native String recovery$indy$8(int var0, long var1);

   private static native void recovery$indy$9(Object var0, boolean var1, long var2, long var4);

   private static native MethodHandle recovery$constant$10();
}
