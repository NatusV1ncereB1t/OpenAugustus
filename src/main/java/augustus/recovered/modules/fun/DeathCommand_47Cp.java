package augustus.recovered.modules.fun;

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
import net.C_45n;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47cu;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class DeathCommand_47Cp extends Module implements C_47xz {
   private final RangeSetting settingDelay;
   public final ModeSetting settingMessage;
   private final C_47cu field_40;
   private boolean field_43a;
   private boolean field_43P;
   private static final long a = C_4f.a(-1765733735651835569L, 5423351503091935786L, MethodHandles.lookup().lookupClass()).a(131290908377024L);
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

   private static native Method d(long var0, long var2);

   private static boolean method_48$aae029aa0a() {
      return false;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$1(this, 40, var3, -7099538089264667712L, var1);
   }

   @Override
   public void method_482$4a66cb4514(char var1, int var2, char var3) {
      augustus.recovered.modules.fun.DeathCommand_47Cp var12;
      augustus.recovered.modules.fun.DeathCommand_47Cp var14;
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 82344259058937L;
      long var8 = var4 ^ 79760987733755L;
      String[] var10 = recovery$indy$2(-357282296954645909L, var4);
      EntityPlayerSP var10000 = recovery$indy$3(field_43, -356928899702449578L, var4);
      if (var10 != null) {
         if (var10000 == null) {
            return;
         }

         var10000 = recovery$indy$4(field_43, -356928899702449578L, var4);
      }

      label76: {
         boolean var10001;
         label75: {
            label80: {
               label81: {
                  float var15;
                  int var11 = (var15 = var10000.method_43$bc607678b6() - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
                  if (var10 != null) {
                     if (var11 > 0) {
                        break label80;
                     }

                     var12 = this;
                     if (var10 == null) {
                        break label81;
                     }

                     var11 = (int) ((this.field_43P) ? 1 : 0);
                  }

                  if (var11 == 0) {
                     this.field_43a = false;
                     recovery$indy$5(this.field_40, -357174811202597562L, var4);
                  }

                  var12 = this;
               }

               var10001 = true;
               if (var3 <= 0) {
                  break label75;
               }

               var12.field_43P = true;
               if (var10 != null) {
                  break label76;
               }
            }

            var12 = this;
            var10001 = false;
         }

         var12.field_43P = var10001;
      }

      label83: {
         boolean var13 = recovery$indy$7(this.field_40, recovery$indy$6(this.settingDelay, -357373188755844886L, var4), var6, -357432462506428241L, var4);
         if (var10 != null) {
            if (!var13) {
               return;
            }

            var14 = this;
            if (var10 == null) {
               break label83;
            }

            var13 = this.field_43a;
         }

         if (var13) {
            return;
         }

         recovery$indy$8(field_43, -356928899702449578L, var4).method_49$a7421bf54c(recovery$indy$9(this.settingMessage, var8, -357230953706487224L, var4));
         var14 = this;
      }

      var14.field_43a = true;
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43a = false;
      this.field_43P = false;
   }

   public DeathCommand_47Cp(long var1) {
      super("DeathCommand", "Tötungsbefehl", ((a ^ var1) ^ 64682763121917L), new Color(156, 194, 255), Category.FUN);
      var1 = a ^ var1;
      long var10001 = var1 ^ 101811344361573L;
      int var3 = (int)((var1 ^ 101811344361573L) >>> 32);
      int var4 = (int)((var1 ^ 101811344361573L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 124657943872560L;
      long var8 = var1 ^ 127119329434880L;
      long var10 = var1 ^ 64682763121917L;
      // Super arguments moved to the required Java constructor position.
      RangeSetting var18 = new RangeSetting(var3, this, "Delay", 0.0, 0.0, (short)var4, 0.0, 2000.0, 0, (short)var5);
      long var10003 = 9026219251098676522L;
      long var12 = var8;
      RangeSetting var14 = var18;
      this.settingDelay = var14.method_41$1efb8cc0e2(var12);
      ModeSetting var19 = new ModeSetting(this, "Message", var6, "/warp ffa", new String[0]);
      C_45n var10002 = recovery$indy$10();
      var10003 = 9026484247228098974L;
      C_45n var15 = var10002;
      ModeSetting var16 = var19;
      this.settingMessage = var16.method_44$d3b0c78647(var15);
      this.field_40 = new C_47cu();
      this.field_43a = false;
      this.field_43P = false;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, int var1, long var2, long var4, long var6);

   private static native String[] recovery$indy$2(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native void recovery$indy$5(Object var0, long var1, long var3);

   private static native int recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3, long var5, long var7);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native String recovery$indy$9(Object var0, long var1, long var3, long var5);

   private static native C_45n recovery$indy$10();

   private static native MethodHandle recovery$constant$11();
}
