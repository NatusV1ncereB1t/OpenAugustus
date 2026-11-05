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
import net.C_43C;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47e0;
import net.C_47rf;
import net.C_47s6;
import client.module.Category;
import net.C_4f;

public class CustomItemPos_47H4 extends Module implements C_47s6 {
   public final NumberSetting settingX;
   public final NumberSetting settingY;
   public final NumberSetting settingZ;
   public final NumberSetting settingBlockX;
   public final NumberSetting settingBlockY;
   public final NumberSetting settingBlockZ;
   public final NumberSetting settingScale;
   public final BooleanSetting settingLeftHand;
   private static final long a = C_4f.a(-3441052006679653181L, -6412772906103578259L, MethodHandles.lookup().lookupClass()).a(269185375409712L);
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
   public void method_40$520c15f8a9(C_47e0 var1, long var2) {
      long var4 = var2 ^ 36780633579902L;
      int[] var6 = recovery$indy$1(3242767533354250760L, var2);
      C_47rf var7 = recovery$indy$2(field_43, 3242842167431647523L, var2).field_42X.method_46$ac4db64966();
      if (var6 == null) {
         label22: {
            C_47rf var10000 = var7;
            if (var2 >= 0L) {
               if (var7 == null) {
                  break label22;
               }

               var10000 = var7;
            }

            if (var10000.method_48$dbd570a038() instanceof C_43C) {
               return;
            }
         }

         recovery$indy$4(var1, recovery$indy$3(this.settingX, var4, 3242636532334699656L, var2), 3243052128596598538L, var2);
         recovery$indy$6(var1, recovery$indy$5(this.settingY, var4, 3242636532334699656L, var2), 3244591065248038678L, var2);
         recovery$indy$8(var1, recovery$indy$7(this.settingZ, var4, 3242636532334699656L, var2), 3243013053675810218L, var2);
         recovery$indy$10(var1, recovery$indy$9(this.settingBlockX, var4, 3242636532334699656L, var2), 3244711001054312725L, var2);
         recovery$indy$12(var1, recovery$indy$11(this.settingBlockY, var4, 3242636532334699656L, var2), 3244830206806816887L, var2);
         recovery$indy$14(var1, recovery$indy$13(this.settingBlockZ, var4, 3242636532334699656L, var2), 3244696988941514782L, var2);
         recovery$indy$16(var1, recovery$indy$15(this.settingScale, var4, 3242636532334699656L, var2), 3242878761650632345L, var2);
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$17(this, 13, var3, -7099580332916648958L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public CustomItemPos_47H4(long var1) {
      super("CustomItemPos", "KundenspeziefischeObjektPos", ((a ^ var1) ^ 125690892247831L), new Color(42, 145, 95), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 3797612838668L;
      long var5 = var1 ^ 50766513504395L;
      long var7 = var1 ^ 125690892247831L;
      // Super arguments moved to the required Java constructor position.
      this.settingX = new NumberSetting(this, "X", 0.13, var5, -1.0, 1.0, 2);
      this.settingY = new NumberSetting(this, "Y", 0.13, var5, -1.0, 1.0, 2);
      this.settingZ = new NumberSetting(this, "Z", 0.04, var5, -1.0, 1.0, 2);
      this.settingBlockX = new NumberSetting(this, "BlockX", -0.27, var5, -1.0, 1.0, 2);
      this.settingBlockY = new NumberSetting(this, "BlockY", -0.04, var5, -1.0, 1.0, 2);
      this.settingBlockZ = new NumberSetting(this, "BlockZ", 0.0, var5, -1.0, 1.0, 2);
      this.settingScale = new NumberSetting(this, "Scale", 0.2, var5, 0.0, 2.0, 2);
      this.settingLeftHand = new BooleanSetting(this, var3, "LeftHand", false);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);

   private static native double recovery$indy$3(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$4(Object var0, double var1, long var3, long var5);

   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$6(Object var0, double var1, long var3, long var5);

   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$8(Object var0, double var1, long var3, long var5);

   private static native double recovery$indy$9(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$10(Object var0, double var1, long var3, long var5);

   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$12(Object var0, double var1, long var3, long var5);

   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$14(Object var0, double var1, long var3, long var5);

   private static native double recovery$indy$15(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$16(Object var0, double var1, long var3, long var5);

   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$18();
}
