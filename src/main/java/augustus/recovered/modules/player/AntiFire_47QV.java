package augustus.recovered.modules.player;

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
import net.C_479E;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47Vc;
import client.module.Category;
import net.C_4f;

public class AntiFire_47QV extends Module implements C_47Vc {
   public final BooleanSetting settingOnlyOnGround;
   public final NumberSetting settingMaxPacketsPerTick;
   private static final long a = C_4f.a(3896353723184413049L, 8526811139328554790L, MethodHandles.lookup().lookupClass()).a(53839414954367L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[17];
   private static final String[] f = new String[17];

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
      recovery$indy$1(this, 43, var3, -7098009548621813901L, var1);
   }

   @Override
   public void method_45q$e45a9973e5(long var1) {
      long var3 = var1 ^ 15070989284153L;
      boolean var5 = recovery$indy$2(4559675725948081335L, var1);
      byte var10000 = (byte) ((recovery$indy$3(field_43, 4557868625232037338L, var1).method_45$aae029aa0a()) ? 1 : 0);
      if (var5) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (byte) ((recovery$indy$4(field_43, 4557868625232037338L, var1).field_48M) ? 1 : 0);
      }

      label38:
      if (var5) {
         if (var10000 == 0) {
            var10000 = (byte) ((recovery$indy$5(this.settingOnlyOnGround, 4557688010842510044L, var1)) ? 1 : 0);
            if (!var5) {
               break label38;
            }

            if (var10000 != 0) {
               return;
            }
         }

         var10000 = 0;
      }

      int var6 = var10000;

      while (var6 < recovery$indy$6(this.settingMaxPacketsPerTick, var3, 4557738172494645457L, var1)) {
         recovery$indy$7(field_43, 4557868625232037338L, var1)
            .field_49m
            .method_43$631790539f(new C_479E(recovery$indy$8(field_43, 4557868625232037338L, var1).field_48M));
         var6++;
         if (!var5) {
            break;
         }
      }
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public AntiFire_47QV(short var1, int var2, char var3) {
      super("AntiFire", "GegenFeuer", ((((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a) ^ 79273562961834L), new Color(252, 186, 3), Category.PLAYER);
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 62937698511793L;
      long var8 = var4 ^ 22427790054454L;
      long var10 = var4 ^ 79273562961834L;
      // Super arguments moved to the required Java constructor position.
      this.settingOnlyOnGround = new BooleanSetting(this, var6, "OnlyOnGround", false);
      this.settingMaxPacketsPerTick = new NumberSetting(this, "MaxPacketsPerTick", 20.0, var8, 0.0, 100.0, 0);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, int var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$2(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native boolean recovery$indy$5(Object var0, long var1, long var3);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$9();
}
