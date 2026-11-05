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
import net.C_473U;
import net.C_477z;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47Pi;
import client.setting.NumberSetting;
import client.setting.ModeSetting;
import net.minecraft.entity.EntityLivingBase;
import net.C_47bC;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.C_47nD;
import net.C_47ob;
import net.C_47si;
import client.module.Category;
import net.C_47vi;
import net.C_4f;

public class Emojify_47HU extends Module implements C_47iC, C_47si, C_47vi {
   public final ModeSetting settingModes;
   public final NumberSetting settingComboHits;
   public final NumberSetting settingComboTime;
   private final C_47bC field_41;
   private static final long a = C_4f.a(-3651450755901118071L, -1265014817977292793L, MethodHandles.lookup().lookupClass()).a(29758237104295L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final Object[] f = new Object[34];
   private static final String[] g = new String[34];

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

   @Override
   public void method_41$9b8d272046(C_47Pi var1, long var2) {
      long var4 = var2 ^ 51924536706089L;
      EntityLivingBase var6 = recovery$indy$1(var1, 1852692203506271977L, var2);
      if (var6 instanceof EntityPlayer) {
         recovery$indy$5(
            this.field_41,
            (EntityPlayer)var6,
            recovery$indy$2(var1, 1854122920421731923L, var2),
            var4,
            recovery$indy$3(var1, 1852641749018872395L, var2),
            recovery$indy$4(var1, 1852531144521836259L, var2),
            1854196075015489651L,
            var2
         );
      }
   }

   @Override
   public void method_41$426c33b229(C_477z var1, long var2) {
      long var10001 = var2 ^ 23689861039632L;
      int var4 = (int)((var2 ^ 23689861039632L) >>> 48);
      int var5 = (int)((var2 ^ 23689861039632L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      recovery$indy$7(this.field_41, recovery$indy$6(var1, 8137385767766618047L, var2), (char)var4, var5, var6, 8137814062876635408L, var2);
   }

   @Override
   public void method_47$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 7477672236475L;
      int[] var6 = recovery$indy$8(2668033784832521110L, var1);
      C_473U var7 = recovery$indy$9(var3, 2667628972311351682L, var1);
      C_473U var10000 = var7;
      if (var6 == null) {
         if (!(var7 instanceof C_47nD)) {
            return;
         }

         var10000 = var7;
      }

      C_47nD var8 = (C_47nD)var10000;
      if (var8.method_42$7d493934e8() == 2) {
         if (recovery$indy$10(field_43, 2667408991492639531L, var1) != null) {
            Entity var9 = var8.method_48$33959771da(recovery$indy$11(field_43, 2667408991492639531L, var1));
            if (var9 != null) {
               recovery$indy$12(this.field_41, var9, var4, 2667290797448787639L, var1);
            }
         }
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$13(this, 26, var5, -7099646468833350171L, var1);
      recovery$indy$14(this, 1, var5, -7099646468833350171L, var1);
      recovery$indy$15(this, 31, 100, var3, -7099328719028572445L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 31668421760341L;
      recovery$indy$16(this.field_41.field_46, var6, 2732029249707842373L, var4);
   }

   public Emojify_47HU(long var1) {
      super("Emojify", "Emojify", ((a ^ var1) ^ 126543063006250L), new Color(66, 135, 245), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 62272919129319L;
      long var5 = var1 ^ 52139471364022L;
      long var7 = var1 ^ 126543063006250L;
      // Super arguments moved to the required Java constructor position.
      this.settingModes = new ModeSetting(
         this, "Modes", var3, "default1", new String[]{"default1", "default2", "default3", "angry", "pogchamp", "prettygood", "trashmeme"}
      );
      this.settingComboHits = new NumberSetting(this, "ComboHits", 2.0, var5, 0.0, 5.0, 0);
      this.settingComboTime = new NumberSetting(this, "ComboTime", 2.0, var5, 0.0, 5.0, 0);
      this.field_41 = new C_47bC();
   }

   // Retained obfuscator initialization is restored after javac.
   static { c = null; d = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native EntityLivingBase recovery$indy$1(Object var0, long var1, long var3);

   private static native double recovery$indy$2(Object var0, long var1, long var3);

   private static native double recovery$indy$3(Object var0, long var1, long var3);

   private static native double recovery$indy$4(Object var0, long var1, long var3);

   private static native void recovery$indy$5(Object var0, Object var1, double var2, long var4, double var6, double var8, long var10, long var12);

   private static native Entity recovery$indy$6(Object var0, long var1, long var3);

   private static native void recovery$indy$7(Object var0, Object var1, char var2, int var3, int var4, long var5, long var7);

   private static native int[] recovery$indy$8(long var0, long var2);

   private static native C_473U recovery$indy$9(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$10(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$11(Object var0, long var1, long var3);

   private static native void recovery$indy$12(Object var0, Object var1, long var2, long var4, long var6);

   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$14(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$15(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native void recovery$indy$16(Object var0, long var1, long var3, long var5);

   private static native MethodHandle recovery$constant$17();
}
