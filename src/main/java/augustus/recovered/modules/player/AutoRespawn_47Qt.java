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
import net.C_476q;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Lm;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import net.C_47TU;
import net.C_47cu;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class AutoRespawn_47Qt extends Module implements C_47xz {
   private final C_47cu field_48;
   private final C_47cu field_40;
   public final C_47TU settingDelay;
   private static final long a = C_4f.a(-7603054963114259284L, -2244576390003777144L, MethodHandles.lookup().lookupClass()).a(206210064844517L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[24];
   private static final String[] f = new String[24];

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
      recovery$indy$1(this, 40, var3, -7097972594573381626L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 127739024042857L;
      long var8 = var4 ^ 96342271166190L;
      long var10 = var4 ^ 61968665147898L;
      long var12 = var4 ^ 97834970749362L;
      boolean var14 = recovery$indy$2(2180269922602916946L, var4);
      boolean var10000 = recovery$indy$3(field_43, 2179935723556278248L, var4) instanceof C_47Lm;
      if (!var14) {
         if (!var10000) {
            recovery$indy$14(this.field_48, 2181899436795270332L, var4);
            return;
         }

         var10000 = recovery$indy$4(field_43, 2179847841582199445L, var4).field_427;
      }

      C_47cu var15;
      boolean var10001 = var14;
      if (var1 > 0) {
         if (!var14) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$8(
               this.field_48,
               recovery$indy$7(
                  C_476q.field_48,
                  var10,
                  recovery$indy$5(this.settingDelay, var8, 2179976223110995416L, var4),
                  recovery$indy$6(this.settingDelay, var6, 2179807049017290642L, var4),
                  2180096259417398704L,
                  var4
               ),
               var12,
               2180169836228057234L,
               var4
            );
         }

         var10001 = var14;
      }

      label56: {
         if (!var10001) {
            if (!var10000) {
               return;
            }

            var15 = this.field_40;
            if (var14) {
               break label56;
            }

            var10000 = recovery$indy$9(this.field_40, 10000L, var12, 2180169836228057234L, var4);
         }

         if (!var10000) {
            return;
         }

         recovery$indy$10(field_43, 2179847841582199445L, var4).method_47P$da8c82d5d4();
         recovery$indy$11(field_43, (GuiScreen)null, 2180081020766942778L, var4);
         recovery$indy$12(this.field_48, 2181899436795270332L, var4);
         var15 = this.field_40;
      }

      recovery$indy$13(var15, 2181899436795270332L, var4);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public AutoRespawn_47Qt(byte var1, long var2) {
      super("AutoRespawn", "AutomatischerRespawn", ((((long)var1 << 56 | var2 << 8 >>> 8) ^ a) ^ 122074862106926L), new Color(82, 222, 124), Category.PLAYER);
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
      long var6 = var4 ^ 30009729020832L;
      long var8 = var4 ^ 122074862106926L;
      // Pure super-constructor arguments are evaluated in the first statement above.
      this.field_48 = new C_47cu();
      this.field_40 = new C_47cu();
      this.settingDelay = new C_47TU(var6, this, "Delay", 1000.0, 2000.0, 0.0, 5000.0, 0);
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, int var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$2(long var0, long var2);

   private static native GuiScreen recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native int recovery$indy$7(Object var0, long var1, double var3, double var5, long var7, long var9);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3, long var5, long var7);

   private static native boolean recovery$indy$9(Object var0, long var1, long var3, long var5, long var7);

   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);

   private static native void recovery$indy$11(Object var0, Object var1, long var2, long var4);

   private static native void recovery$indy$12(Object var0, long var1, long var3);

   private static native void recovery$indy$13(Object var0, long var1, long var3);

   private static native void recovery$indy$14(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$15();
}
