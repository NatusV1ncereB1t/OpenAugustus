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
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import net.C_47S6;
import client.setting.BooleanSetting;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.minecraft.client.Minecraft;
import net.C_47oo;
import client.ClientGlobals;
import client.module.Category;
import net.C_47tU;
import net.C_47uo;
import net.C_47xz;
import net.C_4f;

public class Parkour_47kQ extends Module implements C_47hi, C_47xz {
   private final BooleanSetting settingDiagonal;
   private final BooleanSetting settingMouseSensi;
   private static final long a = C_4f.a(-1260418792212195066L, -7880708558468654635L, MethodHandles.lookup().lookupClass()).a(120748486567138L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[46];
   private static final String[] f = new String[46];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native void a();

   private static native int a(long var0, long var2);

   private static native Method d(long var0, long var2);

   private boolean method_48$5eec879a9c(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 139112270884045L;
      boolean var8 = recovery$indy$1(4734186115511884840L, var4);
      boolean var10000 = recovery$indy$2(field_43, 4737190892832168379L, var4);
      if (!var8) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$3(var6, 4737039558951355749L, var4);
      }

      boolean var10001 = var8;
      if (var3 >= 0) {
         if (!var8) {
            if (!var10000) {
               return false;
            }

            var10000 = recovery$indy$4(field_43, 4736868394613356510L, var4).field_44q.field_45;
         }

         var10001 = var8;
      }

      return var10001 ? var10000 : !var10000;
   }

   private int method_49$95d88932bd(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 135735501820802L;
      boolean var5 = recovery$indy$5(2657467714853763450L, var1);
      int var6 = recovery$indy$6(var3, 2661031166901703393L, var1);
      int var10000 = var6;
      if (!var5) {
         var10000 = var6 != 0 ? var6 : 1;
      }

      return var10000;
   }

   private boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = (var1 ^ 88221790145056L) >>> 16;
      int var5 = (int)((var1 ^ 88221790145056L) << 48 >>> 48);
      boolean var6 = recovery$indy$7(2022240251929969035L, var1);
      boolean var10000 = recovery$indy$8(this, var3, (char)var5, 2025624359192508825L, var1);
      if (!var6) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$9(field_43, 2025518466891503525L, var1).field_48M;
      }

      boolean var10001 = var6;
      if (var1 >= 0L) {
         if (!var6) {
            if (!var10000) {
               return false;
            }

            var10000 = recovery$indy$10(field_43, 2026448482509698240L, var1)
               .method_48$d4a3a06218(
                  recovery$indy$11(field_43, 2025518466891503525L, var1),
                  recovery$indy$12(field_43, 2025518466891503525L, var1)
                     .method_45$6684d3c618()
                     .method_47$800791f322(0.0, -0.5, 0.0)
                     .method_42$800791f322(-0.001, 0.0, -0.001)
               )
               .isEmpty();
         }

         var10001 = var6;
      }

      return var10001 ? var10000 : var10000;
   }

   @Override
   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var4 = (var2 ^ 62663407619824L) >>> 16;
      int var6 = (int)((var2 ^ 62663407619824L) << 48 >>> 48);
      long var7 = var2 ^ 137469005828947L;
      long var10000 = 6395442618801377637L;
      boolean var9 = Fly_47kE.method_48$aae029aa0a();
      long var10002 = 6398691381123285605L;
      long var10 = var7;
      Parkour_47kQ var12 = this;
      boolean var22 = var12.method_45$0dd78e0064(var10);
      if (var9) {
         if (var22) {
            var10002 = 6395566087006302515L;
            boolean var13 = true;
            C_472n var14 = var1;
            var14.method_47$f633c984d8(var13);
         }

         long var10001 = 6395357798175304946L;
         BooleanSetting var15 = this.settingDiagonal;
         var22 = var15.method_49$aae029aa0a();
      }

      if (var9) {
         if (!var22) {
            return;
         }

         char var24 = (char)var6;
         long var10003 = 6398522559936888137L;
         char var16 = var24;
         long var17 = var4;
         Parkour_47kQ var19 = this;
         var22 = var19.method_48$5eec879a9c(var17, var16);
      }

      if (var22) {
         var10002 = 6395467519649184447L;
         C_47tU var20 = C_47tU.DEFAULT;
         C_472n var21 = var1;
         var21.method_41$1aa94c3a4e(var20);
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$13(this, 21, var3, -7099130358213936464L, var1);
      recovery$indy$14(this, 40, var3, -7099130358213936464L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   @Override
   public void method_487$da8c82d5d4() {
      long var1 = a ^ 27531918906327L;
      long var10001 = var1 ^ 114882626639806L;
      int var3 = (int)((var1 ^ 114882626639806L) >>> 48);
      int var4 = (int)((var1 ^ 114882626639806L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      long var6 = var1 ^ 115949797848880L;
      long var8 = var1 ^ 81635458793337L;
      long var10 = (var1 ^ 110545223176802L) >>> 16;
      int var12 = (int)((var1 ^ 110545223176802L) << 48 >>> 48);
      long var13 = var1 ^ 97684060648582L;
      long var15 = var1 ^ 36770719076289L;
      long var17 = var1 ^ 81150188468503L;
      long var10000 = -4300299387999053367L;
      boolean var19 = Fly_47kE.method_49t$aae029aa0a();
      var10001 = -4300167439780941728L;
      BooleanSetting var21 = this.settingDiagonal;
      int var55 = (int) ((var21.method_49$aae029aa0a()) ? 1 : 0);
      if (!var19) {
         if (var55 == 0) {
            return;
         }

         char var10002 = (char)var12;
         long var10003 = -4296924247538212389L;
         char var22 = var10002;
         long var23 = var10;
         Parkour_47kQ var25 = this;
         var55 = (int) ((var25.method_48$5eec879a9c(var23, var22)) ? 1 : 0);
      }

      if (!var19) {
         if (var55 == 0) {
            return;
         }

         long var68 = -4296737924557201673L;
         long var26 = var15;
         Parkour_47kQ var28 = this;
         var55 = (int) ((var28.method_45$0dd78e0064(var26)) ? 1 : 0);
      }

      label78: {
         label93: {
            label94: {
               if (!var19) {
                  if (var55 != 0) {
                     break label94;
                  }

                  var10001 = -4296958620849205273L;
                  Minecraft var29 = field_43;
                  var55 = (int) ((var29.field_42P.field_48M) ? 1 : 0);
               }

               if (var19) {
                  break label78;
               }

               if (var55 == 0) {
                  break label93;
               }

               var10001 = -4297052000691637697L;
               Minecraft var30 = field_43;
               int var56 = var30.field_44r.field_44W.method_45$8abf5c6871();
               short var63 = (short)var3;
               short var69 = (short)var4;
               long var10004 = -4300150775855230213L;
               var55 = (int) ((C_47uo.method_49$ca21eb6850(var56, var63, var69, var5)) ? 1 : 0);
               if (var19) {
                  break label78;
               }

               if (var55 == 0) {
                  break label93;
               }

               var10001 = -4297052000691637697L;
               Minecraft var31 = field_43;
               int var57 = var31.field_44r.field_44W.method_45$8abf5c6871();
               long var70 = -4296575885681351398L;
               var55 = (int) ((C_47uo.method_45$800bd538b0(var57, var17)) ? 1 : 0);
               if (var19) {
                  break label78;
               }

               if (var55 == 0) {
                  break label93;
               }
            }

            C_47S6 var58 = ClientGlobals.field_46;
            long var71 = -4300167439780941728L;
            BooleanSetting var32 = this.settingMouseSensi;
            float var65;
            if (var32.method_49$aae029aa0a()) {
               var71 = -4296958620849205273L;
               Minecraft var33 = field_43;
               long var78 = -4297469950578279068L;
               C_47S6 var34 = ClientGlobals.field_46;
               long var80 = -4297322710048519443L;
               var65 = C_47gg.method_42$d819a8fdf1(var33.field_42P.field_48h, var34.method_44$4f8050086d().field_44, var13);
            } else {
               var71 = -4296958620849205273L;
               Minecraft var35 = field_43;
               var65 = var35.field_42P.field_48h;
            }

            long var10005 = -4296648678634536207L;
            long var36 = var8;
            Parkour_47kQ var38 = this;
            byte var39 = 11;
            float var40 = var65;
            C_47S6 var41 = var58;
            var41.method_47$508900092b(var40, var39, var38, var36);
            if (!var19) {
               return;
            }
         }

         long var74 = -4297222411889301023L;
         long var42 = var6;
         Parkour_47kQ var44 = this;
         var55 = var44.method_49$95d88932bd(var42);
      }

      int var20 = var55;
      C_47S6 var59 = ClientGlobals.field_46;
      long var75 = -4300167439780941728L;
      BooleanSetting var45 = this.settingMouseSensi;
      float var67;
      if (var45.method_49$aae029aa0a()) {
         var75 = -4296958620849205273L;
         Minecraft var46 = field_43;
         float var66 = var46.field_42P.field_48h - 45 * var20;
         long var79 = -4297469950578279068L;
         C_47S6 var47 = ClientGlobals.field_46;
         long var81 = -4297322710048519443L;
         var67 = C_47gg.method_42$d819a8fdf1(var66, var47.method_44$4f8050086d().field_44, var13);
      } else {
         var75 = -4296958620849205273L;
         Minecraft var48 = field_43;
         var67 = var48.field_42P.field_48h - 45 * var20;
      }

      long var82 = -4296648678634536207L;
      long var49 = var8;
      Parkour_47kQ var51 = this;
      byte var52 = 11;
      float var53 = var67;
      C_47S6 var54 = var59;
      var54.method_47$508900092b(var53, var52, var51, var49);
   }

   public Parkour_47kQ(long var1) {
      super("Parkour", "Parkur", ((a ^ var1) ^ 31322983977108L), new Color(245, 103, 167), Category.MOVEMENT);
      var1 = a ^ var1;
      long var3 = var1 ^ 110543535380914L;
      long var5 = var1 ^ 120226619559055L;
      long var7 = var1 ^ 31322983977108L;
      // Super arguments moved to the required Java constructor position.
      this.settingDiagonal = new BooleanSetting(this, var5, "Diagonal", false);
      BooleanSetting var10001 = new BooleanSetting(this, var5, "MouseSensi", true);
      BooleanSetting var10002 = this.settingDiagonal;
      this.settingDiagonal.getClass();
      C_45n var10003 = recovery$indy$15(var10002);
      long var10004 = 6424361774768794762L;
      C_45n var9 = var10003;
      long var10 = var3;
      BooleanSetting var12 = var10001;
      this.settingMouseSensi = (BooleanSetting)var12.method_43$780fd62a21(var10, var9);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(long var0, long var2, long var4);

   private static native C_47oo recovery$indy$4(Object var0, long var1, long var3);

   private static native boolean recovery$indy$5(long var0, long var2);

   private static native int recovery$indy$6(long var0, long var2, long var4);

   private static native boolean recovery$indy$7(long var0, long var2);

   private static native boolean recovery$indy$8(Object var0, long var1, char var3, long var4, long var6);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$10(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);

   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$14(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$15(BooleanSetting var0);

   private static native MethodHandle recovery$constant$16();
}
