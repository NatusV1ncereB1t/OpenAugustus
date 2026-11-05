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
import net.C_42q;
import net.C_45K;
import net.C_45n;
import net.C_475U;
import net.C_47Bk;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cJ;
import net.C_47nb;
import net.C_47sk;
import client.module.Category;
import net.C_4f;

public class EntityColor_47HF extends Module implements C_47cJ, C_475U {
   private final ColorSetting settingHitColor;
   private final ModeSetting settingHitColorAnimation;
   private final BooleanSetting settingReverseAnimation;
   private final ColorSetting settingColor;
   private static final long a = C_4f.a(685170707732699205L, 4133422632185635786L, MethodHandles.lookup().lookupClass()).a(182509787501462L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[39];
   private static final String[] f = new String[39];

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
   public void method_41$39ef26e5b0(C_42q var1, long var2) {
      long var4 = var2 ^ 11374020887002L;
      int[] var6 = recovery$indy$1(4912218054808778971L, var2);
      if (!recovery$indy$2(this.settingHitColorAnimation, var4, 4911040427790432363L, var2).equals(recovery$indy$3(12317, 7359663000839633447L ^ var2))) {
         C_47nb var10000 = recovery$indy$4(var1, 4910880708282983518L, var2).field_43k;
         C_45K var10002 = C_47nb.method_41$7498260812(recovery$indy$6(this.settingHitColorAnimation, var4, 4911040427790432363L, var2));
         byte var10003 = (byte) ((recovery$indy$7(this.settingReverseAnimation, 4912104533665083982L, var2)) ? 1 : 0);
         if (var6 == null) {
            var10003 = (byte)(var10003 != 0 ? 1 : 0);
         }

         var10000.method_44$7c39c8007b(500, var10002, var10003, true);
      }
   }

   @Override
   public void method_41$ae23acb38e(long var1, C_47Bk var3) {
      long var4;
      long var6;
      long var14;
      int var18;
      int var19;
      int var20;
      label40: {
         var4 = var1 ^ 87455280807511L;
         var6 = var1 ^ 83175746429367L;
         long var10001 = var1 ^ 59119967671956L;
         int var8 = (int)((var1 ^ 59119967671956L) >>> 32);
         int var9 = (int)((var1 ^ 59119967671956L) << 32 >>> 48);
         int var10 = (int)(var10001 << 48 >>> 48);
         var10001 = var1 ^ 114277765269327L;
         int var11 = (int)((var1 ^ 114277765269327L) >>> 48);
         int var12 = (int)((var1 ^ 114277765269327L) << 16 >>> 48);
         int var13 = (int)(var10001 << 32 >>> 32);
         var14 = var1 ^ 71359187724497L;
         long var16 = var1 ^ 10059004089344L;
         var10001 = var1 ^ 35531400696478L;
         var18 = (int)((var1 ^ 35531400696478L) >>> 48);
         var19 = (int)((var1 ^ 35531400696478L) << 16 >>> 32);
         var20 = (int)(var10001 << 48 >>> 48);
         var10001 = var1 ^ 89650887779174L;
         int var21 = (int)((var1 ^ 89650887779174L) >>> 32);
         int var22 = (int)((var1 ^ 89650887779174L) << 32 >>> 48);
         int var23 = (int)(var10001 << 48 >>> 48);
         int[] var24 = recovery$indy$8(5904702025979342081L, var1);
         int var10000 = recovery$indy$9(var3, 5904549239255362366L, var1).field_432;
         if (var24 == null) {
            if (var10000 > 0) {
               boolean var25 = recovery$indy$10(this.settingHitColorAnimation, var16, 5908025903721737649L, var1).equals(recovery$indy$11(12317, 7359662443247022077L ^ var1));
               if (var24 != null) {
                  break label40;
               }

               if (!var25) {
                  recovery$indy$12(this.settingHitColor, var21, (short)var22, (char)var23, 0, 5905145091681935461L, var1);
                  break label40;
               }

               recovery$indy$23(
                  var3,
                  recovery$indy$22(this.settingHitColor, var21, (short)var22, (char)var23, 0, 5905145091681935461L, var1),
                  var8,
                  (char)var9,
                  var10,
                  5904930747567957293L,
                  var1
               );
               if (var24 == null) {
                  return;
               }
            }

            var10000 = recovery$indy$24(this.settingColor, (char)var11, (char)var12, var13, 5904792202519621942L, var1);
         }

         if (var10000 > 10) {
            recovery$indy$26(
               var3,
               recovery$indy$25(this.settingColor, var21, (short)var22, (char)var23, 0, 5905145091681935461L, var1),
               var8,
               (char)var9,
               var10,
               5904930747567957293L,
               var1
            );
            recovery$indy$27(var3, true, 5905268797086807788L, var1);
         }

         return;
      }

      recovery$indy$14(var3, recovery$indy$13(this.settingHitColor, var6, 5904900221458666122L, var1), 5905274770728727177L, var1);
      recovery$indy$16(var3, recovery$indy$15(this.settingHitColor, var4, 5905063064743490642L, var1), 5907889691959326579L, var1);
      recovery$indy$18(var3, recovery$indy$17(this.settingHitColor, var14, 5907653402082845808L, var1), 5905119652194857030L, var1);
      recovery$indy$21(
         var3,
         C_47sk.method_49$cabccf1c64(
               (int)(
                  recovery$indy$19(this.settingHitColor, (short)var18, var19, var20, 5908017992531030289L, var1)
                     * recovery$indy$20(var3, 5904549239255362366L, var1).field_43k.method_45$fedcb3e4d3()
               ),
               0,
               255
            )
            / 255.0F,
         5907738925018359681L,
         var1
      );
   }

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 114017294875414L;
      long var3 = var1 ^ 86030141590854L;
      long var10000 = 5239920768411579463L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 5240995181997192439L;
      long var6 = var3;
      ModeSetting var8 = this.settingHitColorAnimation;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$28(this, 10, var3, -7099766002976084694L, var1);
      recovery$indy$29(this, 50, var3, -7099766002976084694L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public EntityColor_47HF(long var1) {
      super("EntityColor", "EntitätFarbe", ((a ^ var1) ^ 74269345693838L), new Color(12, 171, 152), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 65391724988840L;
      long var5 = var1 ^ 9037628256323L;
      long var7 = var1 ^ 55700060445845L;
      long var9 = var1 ^ 94802708782256L;
      long var11 = var1 ^ 74269345693838L;
      // Super arguments moved to the required Java constructor position.
      this.settingHitColor = new ColorSetting(var9, this, "HitColor", new Color(0, 255, 0, 36));
      this.settingHitColorAnimation = new ModeSetting(this, "HitColorAnimation", var5, "easeInSine", C_47nb.method_42$8fc34d0ddc(true));
      BooleanSetting var10001 = new BooleanSetting(this, var7, "ReverseAnimation", false);
      C_45n var10003 = recovery$indy$30(this);
      long var10004 = -3946180587856495612L;
      C_45n var13 = var10003;
      long var14 = var3;
      BooleanSetting var16 = var10001;
      this.settingReverseAnimation = (BooleanSetting)var16.method_43$780fd62a21(var14, var13);
      this.settingColor = new ColorSetting(var9, this, "Color", new Color(0, 0, 0, 0));
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native String recovery$indy$2(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$3(int var0, long var1);

   private static native EntityLivingBase recovery$indy$4(Object var0, long var1, long var3);


   private static native String recovery$indy$6(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native int[] recovery$indy$8(long var0, long var2);

   private static native EntityLivingBase recovery$indy$9(Object var0, long var1, long var3);

   private static native String recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$11(int var0, long var1);

   private static native int recovery$indy$12(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native float recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$14(Object var0, float var1, long var2, long var4);

   private static native float recovery$indy$15(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$16(Object var0, float var1, long var2, long var4);

   private static native float recovery$indy$17(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$18(Object var0, float var1, long var2, long var4);

   private static native int recovery$indy$19(Object var0, short var1, int var2, int var3, long var4, long var6);

   private static native EntityLivingBase recovery$indy$20(Object var0, long var1, long var3);

   private static native void recovery$indy$21(Object var0, float var1, long var2, long var4);

   private static native int recovery$indy$22(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native void recovery$indy$23(Object var0, int var1, int var2, char var3, int var4, long var5, long var7);

   private static native int recovery$indy$24(Object var0, char var1, char var2, int var3, long var4, long var6);

   private static native int recovery$indy$25(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native void recovery$indy$26(Object var0, int var1, int var2, char var3, int var4, long var5, long var7);

   private static native void recovery$indy$27(Object var0, boolean var1, long var2, long var4);

   private static native void recovery$indy$28(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$29(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$30(EntityColor_47HF var0);

   private static native MethodHandle recovery$constant$31();
}
