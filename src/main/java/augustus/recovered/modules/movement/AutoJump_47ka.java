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
import net.C_45n;
import net.C_472n;
import net.C_475y;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.BooleanSetting;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.minecraft.client.Minecraft;
import net.C_47p7;
import client.module.Category;
import net.C_4f;

public class AutoJump_47ka extends Module implements C_47hi {
   private final BooleanSetting settingInInv;
   private final MultiSelectSetting settingBlocksToAutoJump;
   private static final long a = C_4f.a(8544754655318901638L, -8989917673825272180L, MethodHandles.lookup().lookupClass()).a(60288053463873L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[37];
   private static final String[] f = new String[37];

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
   public void method_47$05bd94f678(C_472n var1, long var2) {
      boolean var13;
      int var4;
      long var5;
      boolean var7;
      Minecraft var10000;
      label88: {
         label89: {
            var4 = (int)((var2 ^ 98709331138475L) >>> 56);
            var5 = (var2 ^ 98709331138475L) << 8 >>> 8;
            var7 = recovery$indy$1(6396188104745951689L, var2);
            var10000 = field_43;
            if (!var7) {
               if (recovery$indy$2(field_43, 6395515701538400052L, var2) != null) {
                  var13 = recovery$indy$3(this.settingInInv, 6396108086221116223L, var2);
                  if (var7) {
                     break label89;
                  }

                  if (!var13) {
                     return;
                  }
               }

               var10000 = field_43;
            }

            if (var7) {
               break label88;
            }

            var13 = recovery$indy$4(var10000, 6399059839845193709L, var2).field_48M;
         }

         if (!var13) {
            return;
         }

         var10000 = field_43;
      }

      C_475y var8 = recovery$indy$5(var10000, 6395543027362306970L, var2)
         .method_45$4093413a27(
            recovery$indy$6(field_43, 6399059839845193709L, var2).field_48Q,
            recovery$indy$7(field_43, 6399059839845193709L, var2).field_48j - 0.5,
            recovery$indy$8(field_43, 6399059839845193709L, var2).field_42o
         )
         .method_48$e084f7739d();
      C_47p7[] var9 = recovery$indy$9(6399132511176021200L, var2);
      int var10 = var9.length;
      int var11 = 0;

      while (var11 < var10) {
         C_47p7 var12 = var9[var11];
         boolean var14 = var7;
         if (var2 > 0L) {
            if (!var7) {
               label92: {
                  boolean var15 = recovery$indy$10(var12, 6395436608495537008L, var2);
                  if (var2 > 0L) {
                     if (!var15) {
                        break label92;
                     }

                     var15 = recovery$indy$11(var12, (byte)var4, var8, var5, 6395245563536376364L, var2);
                  }

                  if (var2 >= 0L) {
                     if (!var15) {
                        break label92;
                     }

                     recovery$indy$12(var1, true, 6395381906618281351L, var2);
                     var15 = var7;
                  }

                  if (!var15) {
                     break;
                  }
               }

               var11++;
            }

            var14 = var7;
         }

         if (var14) {
            break;
         }
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$13(this, 21, var3, -7099054783976136049L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public AutoJump_47ka(long var1, char var3) {
      super("AutoJump", "AutomatischerSprung", (((var1 << 16 | (long)var3 << 48 >>> 48) ^ a) ^ 17053726006077L), new Color(35, 52, 45), Category.MOVEMENT);
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 68717195318987L;
      long var10001 = var4 ^ 9397310405079L;
      int var8 = (int)((var4 ^ 9397310405079L) >>> 48);
      int var9 = (int)((var4 ^ 9397310405079L) << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      long var11 = var4 ^ 8905063620268L;
      var10001 = var4 ^ 114715911833227L;
      int var13 = (int)((var4 ^ 114715911833227L) >>> 32);
      int var14 = (int)((var4 ^ 114715911833227L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      long var16 = var4 ^ 128706965824851L;
      long var18 = var4 ^ 139252014843686L;
      long var20 = var4 ^ 17053726006077L;
      // Super arguments moved to the required Java constructor position.
      long var10000 = -3277821495420408952L;
      boolean var52 = Fly_47kE.method_49t$aae029aa0a();
      this.settingInInv = new BooleanSetting(this, var18, "InInv", false);
      boolean var24 = var52;
      long var10005 = -3274314174181056879L;
      this.settingBlocksToAutoJump = new MultiSelectSetting(this, "BlocksToAutoJump", var6, C_47p7.values());
      var10000 = -3274314174181056879L;

      for (C_47p7 var28 : C_47p7.values()) {
         long var10004 = -3278134457978702861L;
         C_47p7 var30 = var28;
         SettingGroup var54 = new SettingGroup(this, var30.method_44$0e30dfc966(), true, var11);
         var28.getClass();
         C_45n var10002 = recovery$indy$14(var28);
         char var62 = (char)var14;
         var10005 = -3278363811432115744L;
         C_45n var31 = var10002;
         int var32 = var15;
         char var33 = var62;
         int var34 = var13;
         SettingGroup var35 = var54;
         SettingGroup var29 = var35.method_48$033d42cbfb(var34, var33, var32, var31);
         StringBuilder var63 = new StringBuilder();
         long var10006 = -3278134457978702861L;
         C_47p7 var36 = var28;
         String var64 = var63.append(var36.method_44$0e30dfc966()).append("OnlyWhileMove").toString();
         boolean var70 = var28 == C_47p7.STAIRS;
         SettingGroup var22 = var29;
         boolean var23 = var70;
         BooleanSetting var56 = new BooleanSetting(this, var64, (short)var8, (char)var9, var10, var23, var22);
         var10004 = -3274190932411089163L;
         long var37 = var16;
         String var39 = "OnlyWhileMove";
         BooleanSetting var40 = var56;
         BooleanSetting var57 = (BooleanSetting)var40.method_40$56e823faec(var39, var37);
         long var60 = -3274179917796611756L;
         BooleanSetting var41 = var57;
         C_47p7 var42 = var28;
         C_47p7.method_41$f7a822d595(var42, var41);
         StringBuilder var66 = new StringBuilder();
         var10006 = -3278134457978702861L;
         C_47p7 var43 = var28;
         String var67 = var66.append(var43.method_44$0e30dfc966()).append("OnlyAtSprint").toString();
         boolean var71 = var28 == C_47p7.STAIRS;
         var22 = var29;
         var23 = var71;
         BooleanSetting var58 = new BooleanSetting(this, var67, (short)var8, (char)var9, var10, var23, var22);
         var10004 = -3274190932411089163L;
         long var44 = var16;
         String var46 = "OnlyAtSprint";
         BooleanSetting var47 = var58;
         BooleanSetting var59 = (BooleanSetting)var47.method_40$56e823faec(var46, var44);
         long var61 = -3274588793607845360L;
         BooleanSetting var48 = var59;
         C_47p7 var49 = var28;
         C_47p7.method_45$f7a822d595(var49, var48);
         if (var24) {
            break;
         }
      }
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(long var0, long var2);

   private static native GuiScreen recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$5(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native C_47p7[] recovery$indy$9(long var0, long var2);

   private static native boolean recovery$indy$10(Object var0, long var1, long var3);

   private static native boolean recovery$indy$11(Object var0, byte var1, Object var2, long var3, long var5, long var7);

   private static native void recovery$indy$12(Object var0, boolean var1, long var2, long var4);

   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$14(C_47p7 var0);

   private static native MethodHandle recovery$constant$15();
}
