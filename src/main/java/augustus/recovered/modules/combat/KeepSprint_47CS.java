package augustus.recovered.modules.combat;

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
import net.C_47Ij;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.minecraft.entity.EntityLivingBase;
import net.C_47jB;
import net.C_47rn;
import client.module.Category;
import net.C_4f;

public class KeepSprint_47CS extends Module implements C_47rn {
   private final NumberSetting settingMoveSlowdownOnGround;
   private final BooleanSetting settingSprintOnGround;
   private final NumberSetting settingMoveSlowdownInAir;
   private final BooleanSetting settingSprintOnGroundInAir;
   private final BooleanSetting settingSmart;
   private static final long a = C_4f.a(8487264787431806453L, -2538817473039112713L, MethodHandles.lookup().lookupClass()).a(27456129452284L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final Object[] f = new Object[31];
   private static final String[] g = new String[31];

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
   public void method_43$bb947e007b(C_47jB var1, long var2) {
      net.minecraft.client.Minecraft var13;
      EntityLivingBase var16;
      long var4;
      int[] var10;
      boolean var10000;
      var4 = var2 ^ 41682254119871L;
      long var6 = var2 ^ 7793809163901L;
      long var8 = var2 ^ 30452273785709L;
      var10 = recovery$indy$1(1136020594300912115L, var2);
      var10000 = recovery$indy$2(this.settingSmart, 1134975189673465560L, var2);
      label102:
      if (var10 == null) {
         label100: {
            label99:
            if (var10000) {
               if (recovery$indy$3(var1, 1135118378267029688L, var2)) {
                  return;
               }

               var13 = field_43;
               if (var10 != null) {
                  break label100;
               }

               C_47Ij var11 = recovery$indy$4(field_43, 1135601218363100951L, var2);
               C_47Ij var14 = var11;
               if (var2 > 0L) {
                  if (var11 == null) {
                     break label99;
                  }

                  var14 = var11;
               }

               Entity var15 = var14.field_47;
               int[] var10001 = var10;
               if (var2 > 0L) {
                  if (var10 == null) {
                     if (var14.field_47 == null) {
                        break label99;
                     }

                     var15 = var11.field_47;
                  }

                  var10001 = var10;
               }

               label84: {
                  if (var10001 == null) {
                     if (!(var15 instanceof EntityLivingBase)) {
                        var16 = null;
                        break label84;
                     }

                     var15 = var11.field_47;
                  }

                  var16 = (EntityLivingBase)var15;
               }

               EntityLivingBase var12 = recovery$indy$5(var16, var8, 1135838303240535329L, var2);
               EntityLivingBase var17 = var12;
               if (var10 == null) {
                  if (var12 == null) {
                     break label99;
                  }

                  var17 = var12;
               }

               var10000 = recovery$indy$7(var6, var17, recovery$indy$6(field_43, 1135072167646032824L, var2).field_48h, 1135910921672522954L, var2);
               if (var10 != null) {
                  break label102;
               }

               if (!var10000) {
                  return;
               }
            }

            var13 = field_43;
         }

         var10000 = recovery$indy$8(var13, 1135072167646032824L, var2).field_48M;
      }

      label66: {
         if (var10000) {
            recovery$indy$10(var1, recovery$indy$9(this.settingMoveSlowdownOnGround, var4, 1135031018184771616L, var2), 1135818039283736905L, var2);
            recovery$indy$12(var1, recovery$indy$11(this.settingSprintOnGround, 1134975189673465560L, var2), 1135651678401131843L, var2);
            if (var2 < 0L) {
               break label66;
            }

            if (var10 == null) {
               return;
            }
         }

         recovery$indy$14(var1, recovery$indy$13(this.settingMoveSlowdownInAir, var4, 1135031018184771616L, var2), 1135818039283736905L, var2);
      }

      recovery$indy$16(var1, recovery$indy$15(this.settingSprintOnGroundInAir, 1134975189673465560L, var2), 1135651678401131843L, var2);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      recovery$indy$17(this, 2, 10, var3, -7099232691271816402L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public KeepSprint_47CS(short var1, int var2, short var3) {
      super("KeepSprint", "BeibehaltenSprinten", ((((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a) ^ 33573374367709L), new Color(66, 132, 245), Category.COMBAT);
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 122786314668998L;
      long var8 = var4 ^ 73617248842817L;
      long var10 = var4 ^ 33573374367709L;
      // Pure super-constructor arguments are evaluated in the first statement above.
      this.settingMoveSlowdownOnGround = new NumberSetting(this, "MoveSlowdownOnGround", 1.0, var8, 0.0, 1.0, 2);
      this.settingSprintOnGround = new BooleanSetting(this, var6, "SprintOnGround", true);
      this.settingMoveSlowdownInAir = new NumberSetting(this, "MoveSlowdownInAir", 1.0, var8, 0.0, 1.0, 2);
      this.settingSprintOnGroundInAir = new BooleanSetting(this, var6, "SprintOnGroundInAir", true);
      this.settingSmart = new BooleanSetting(this, var6, "Smart", true);
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; d = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native C_47Ij recovery$indy$4(Object var0, long var1, long var3);

   private static native EntityLivingBase recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(long var0, Object var2, float var3, long var4, long var6);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native double recovery$indy$9(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$10(Object var0, double var1, long var3, long var5);

   private static native boolean recovery$indy$11(Object var0, long var1, long var3);

   private static native void recovery$indy$12(Object var0, boolean var1, long var2, long var4);

   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$14(Object var0, double var1, long var3, long var5);

   private static native boolean recovery$indy$15(Object var0, long var1, long var3);

   private static native void recovery$indy$16(Object var0, boolean var1, long var2, long var4);

   private static native void recovery$indy$17(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native MethodHandle recovery$constant$18();
}
