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
import net.C_42L;
import net.C_46s;
import net.C_473U;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47cu;
import net.C_47iC;
import net.C_47ob;
import client.module.Category;
import net.C_4f;

public class ExplosionModifier_47kZ extends Module implements C_47iC {
   private final NumberSetting settingXZMultiplierExplosion;
   private final NumberSetting settingYMultiplierExplosion;
   private final BooleanSetting settingModifyVelocityAfterExplosion;
   private final NumberSetting settingXZMultiplierVelocity;
   private final NumberSetting settingYMultiplierVelocity;
   private final C_47cu field_46;
   private static final long a = C_4f.a(-3625037922376870638L, -4412481133814809376L, MethodHandles.lookup().lookupClass()).a(269356782332360L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[23];
   private static final String[] f = new String[23];

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
   public void method_47$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 27775758592377L;
      long var6 = var1 ^ 43193202221813L;
      byte var8 = (byte) ((recovery$indy$1(2668225712177863114L, var1)) ? 1 : 0);
      C_473U var9 = recovery$indy$2(var3, 2667903585830019804L, var1);
      byte var10000 = (byte) ((var9 instanceof C_42L) ? 1 : 0);
      if (var8 != 0) {
         if ((var10000) != 0) {
            C_42L var10;
            label65: {
               var10 = (C_42L)var9;
               var10000 = var8;
               if (var1 > 0L) {
                  if (var8 == 0) {
                     break label65;
                  }

                  double var13;
                  var10000 = (byte)((
                           var13 = recovery$indy$3(field_43, 2667839012144718071L, var1)
                                 .method_49$4b58f7ab41(var10.method_49$fedcb3e4d3(), var10.method_45$fedcb3e4d3(), var10.method_44$fedcb3e4d3())
                              - 5.0
                        )
                        == 0.0
                     ? 0
                     : (var13 < 0.0 ? -1 : 1));
               }

               if (var10000 < 0) {
                  recovery$indy$4(this.field_46, 2668313772119521219L, var1);
               }

               var10.method_41$24a796ab4c((float)(var10.method_44$bc607678b6() * recovery$indy$5(this.settingXZMultiplierExplosion, var4, 2668134819108622274L, var1)));
               var10.method_42$24a796ab4c((float)(var10.method_49$bc607678b6() * recovery$indy$6(this.settingYMultiplierExplosion, var4, 2668134819108622274L, var1)));
            }

            var10.method_46$24a796ab4c((float)(var10.method_42$bc607678b6() * recovery$indy$7(this.settingXZMultiplierExplosion, var4, 2668134819108622274L, var1)));
         }

         var10000 = (byte) ((var9 instanceof C_46s) ? 1 : 0);
      }

      byte var10001 = var8;
      if (var1 >= 0L) {
         if (var8 != 0) {
            if (!(var10000 != 0)) {
               return;
            }

            var10000 = (byte) ((recovery$indy$8(this.field_46, 200L, var6, 2667971548569811621L, var1)) ? 1 : 0);
         }

         var10001 = var8;
      }

      if (var10001 != 0) {
         if ((var10000) != 0) {
            return;
         }

         var10000 = (byte) ((recovery$indy$9(this.settingModifyVelocityAfterExplosion, 2666410957319245408L, var1)) ? 1 : 0);
      }

      if ((var10000) != 0) {
         C_46s var11 = (C_46s)var9;
         var11.method_47$d00df7729d((int)(var11.method_49$8abf5c6871() * recovery$indy$10(this.settingXZMultiplierVelocity, var4, 2668134819108622274L, var1)));
         var11.method_48$d00df7729d((int)(var11.method_41$8abf5c6871() * recovery$indy$11(this.settingYMultiplierVelocity, var4, 2668134819108622274L, var1)));
         var11.method_42$d00df7729d((int)(var11.method_47$8abf5c6871() * recovery$indy$12(this.settingXZMultiplierVelocity, var4, 2668134819108622274L, var1)));
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$13(this, 26, var3, -7099431911374406472L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public ExplosionModifier_47kZ(long var1) {
      super("ExplosionModifier", "ExplosionModifizierer", ((a ^ var1) ^ 121516734716869L), new Color(235, 91, 52), Category.MOVEMENT);
      var1 = a ^ var1;
      long var3 = var1 ^ 34773437794270L;
      long var5 = var1 ^ 56042364106841L;
      long var7 = var1 ^ 121516734716869L;
      // Super arguments moved to the required Java constructor position.
      this.settingXZMultiplierExplosion = new NumberSetting(this, "XZMultiplierExplosion", 1.0, var5, 0.0, 10.0, 4);
      this.settingYMultiplierExplosion = new NumberSetting(this, "YMultiplierExplosion", 1.0, var5, 0.0, 10.0, 4);
      this.settingModifyVelocityAfterExplosion = new BooleanSetting(this, var3, "ModifyVelocityAfterExplosion", true);
      this.settingXZMultiplierVelocity = new NumberSetting(this, "XZMultiplierVelocity", 1.0, var5, 0.0, 10.0, 4);
      this.settingYMultiplierVelocity = new NumberSetting(this, "YMultiplierVelocity", 1.0, var5, 0.0, 10.0, 4);
      this.field_46 = new C_47cu();
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(long var0, long var2);

   private static native C_473U recovery$indy$2(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);

   private static native void recovery$indy$4(Object var0, long var1, long var3);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3, long var5, long var7);

   private static native boolean recovery$indy$9(Object var0, long var1, long var3);

   private static native double recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$12(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$14();
}
