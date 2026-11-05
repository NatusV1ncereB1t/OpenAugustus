package augustus.recovered.modules.legit;

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
import net.C_478i;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.Setting;
import net.minecraft.entity.EntityLivingBase;
import client.ClientGlobals;
import client.module.Category;
import net.C_47tf;
import net.C_4f;

public class HitBox_47CX extends Module {
   public final NumberSetting settingExpandXZ;
   public final NumberSetting settingExpandY;
   public final BooleanSetting settingServerHitBox;
   public final BooleanSetting setting18Hitbox;
   private static Setting[] field_47;
   private static final long a = C_4f.a(-5729041388742376855L, -8749436234376184710L, MethodHandles.lookup().lookupClass()).a(49922294656507L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[14];
   private static final String[] f = new String[14];

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

   private static native void a();

   private static native int a(long var0, long var2);

   private static native Method d(long var0, long var2);

   public C_478i method_48$2f4f75ad84(Entity var1, long var2, float var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 60630681278142L;
      C_478i var8 = var1.method_45$6684d3c618();
      float var9 = (float)(var4 + recovery$indy$1(ClientGlobals.field_48.field_46m.settingExpandXZ, var5, 1929477734766283180L, var2));
      boolean var10000 = recovery$indy$2(1929554913764679476L, var2);
      float var10 = (float)(var4 + recovery$indy$3(ClientGlobals.field_48.field_46m.settingExpandY, var5, 1929477734766283180L, var2));
      boolean var7 = var10000;
      var10000 = recovery$indy$4(ClientGlobals.field_48.field_46m.settingServerHitBox, 1929421186412947353L, var2);
      if (var7) {
         if (!var10000) {
            return var8.method_42$800791f322(var9, var10, var9);
         }

         var10000 = var1 instanceof EntityLivingBase;
      }

      if (var10000) {
         C_47tf var11 = new C_47tf(var1.field_48J / 32.0, var1.field_48o / 32.0, var1.field_48A / 32.0);
         float var12 = var1.field_48w / 2.0F;
         var8 = var8.method_44$cf3537e63f(
            new C_478i(
                  var11.field_40 - var12,
                  var11.field_41,
                  var11.field_47 - var12,
                  var11.field_40 + var12,
                  var11.field_41 + var1.field_48,
                  var11.field_47 + var12
               )
               .method_42$800791f322(var4, var4, var4)
         );
      }

      return var8.method_42$800791f322(var9, var10, var9);
   }

   public static void method_49$5994d1a418(Setting[] var0) {
      field_47 = var0;
   }

   public static Setting[] method_45$19d51fe81e() {
      return field_47;
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

   public HitBox_47CX(long var1) {
      super("HitBox", "SchlagBox", ((a ^ var1) ^ 104103110798842L), new Color(180, 207, 130), Category.LEGIT);
      var1 = a ^ var1;
      long var3 = var1 ^ 52273633210849L;
      long var5 = var1 ^ 3104523849318L;
      long var7 = var1 ^ 104103110798842L;
      // Super arguments moved to the required Java constructor position.
      this.settingExpandXZ = new NumberSetting(this, "ExpandXZ", 0.0, var5, 0.0, 1.0, 2);
      this.settingExpandY = new NumberSetting(this, "ExpandY", 0.0, var5, 0.0, 1.0, 2);
      this.settingServerHitBox = new BooleanSetting(this, var3, "ServerHitBox", false);
      this.setting18Hitbox = new BooleanSetting(this, var3, "1.8Hitbox", true);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native double recovery$indy$1(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$2(long var0, long var2);

   private static native double recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$4(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$5();
}
