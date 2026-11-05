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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40g;
import net.C_42a;
import net.C_45V;
import net.C_477z;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.minecraft.entity.EntityLivingBase;
import net.C_47rf;
import net.C_47si;
import client.module.Category;
import net.C_48T;
import net.C_4f;

public class GommeMode_47Cr extends Module implements C_47si, C_48T {
   private Entity field_42;
   private static final long a = C_4f.a(2489100730143307674L, -9087074050643155838L, MethodHandles.lookup().lookupClass()).a(46142910163496L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final Object[] f = new Object[26];
   private static final String[] g = new String[26];

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

   @Override
   public void method_41$426c33b229(C_477z var1, long var2) {
      this.field_42 = recovery$indy$1(var1, 8137658765265937371L, var2);
   }

   @Override
   public void method_40G$e45a9973e5(long var1) {
      boolean var14;
      net.minecraft.client.Minecraft var15;
      long var3 = var1 ^ 41735769330851L;
      long var10001 = var1 ^ 6407505185672L;
      int var5 = (int)((var1 ^ 6407505185672L) >>> 32);
      int var6 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      int[] var8 = recovery$indy$2(-3627995692292593422L, var1);
      Entity var10000 = this.field_42;
      if (var8 == null) {
         if (this.field_42 == null) {
            return;
         }

         var10000 = this.field_42;
      }

      if (var8 == null) {
         if (!(var10000 instanceof EntityLivingBase)) {
            return;
         }

         var10000 = this.field_42;
      }

      EntityLivingBase var9 = (EntityLivingBase)var10000;
      if (var8 == null) {
         if (var9.field_432 >= 6) {
            label111: {
               label112: {
                  label113: {
                     C_47rf var10 = recovery$indy$3(field_43, -3628124986583068429L, var1).method_48$ac4db64966();
                     C_47rf var13 = var10;
                     if (var8 == null) {
                        if (var10 == null) {
                           break label113;
                        }

                        var13 = var10;
                     }

                     var14 = var13.method_48$dbd570a038() instanceof C_45V;
                     if (var8 != null) {
                        break label112;
                     }

                     if (!var14) {
                        var14 = recovery$indy$4(field_43, -3628124986583068429L, var1).method_436$aae029aa0a();
                        if (var8 != null) {
                           break label112;
                        }

                        if (var14) {
                           return;
                        }
                     }
                  }

                  var15 = field_43;
                  if (var8 != null) {
                     break label111;
                  }

                  var14 = recovery$indy$5(field_43, -3628420810450402401L, var1).field_42;
               }

               if (var14) {
                  return;
               }

               var15 = field_43;
            }

            ArrayList var11 = recovery$indy$7(recovery$indy$6(var15, -3628124986583068429L, var1).field_429, var3, 36, -3628144372370138561L, var1);
            Object var16 = var11;
            if (var8 == null) {
               if (var11.isEmpty()) {
                  return;
               }

               var16 = var11.get(0);
            }

            C_42a var12 = (C_42a)var16;
            int var17 = (Integer)recovery$indy$8(var12, -3628018657354205252L, var1) - 36;
            if (var1 > 0L) {
               if (var17 == recovery$indy$9(field_43, -3628124986583068429L, var1).field_42X.field_42) {
                  return;
               }

               var17 = var5;
            }

            recovery$indy$11(
               var17, this, 8, (char)var6, (char)var7, (Integer)recovery$indy$10(var12, -3628018657354205252L, var1) - 36, -3628483030160914549L, var1
            );
            return;
         }

         this.field_42 = null;
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$12(this, 1, var3, -7099394592566608984L, var1);
      recovery$indy$13(this, 34, var3, -7099394592566608984L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public GommeMode_47Cr(long var1) {
      super("GommeMode", "GommeModus", ((a ^ var1) ^ 127459839961279L), new Color(167, 85, 250), Category.COMBAT);
      var1 = a ^ var1;
      long var3 = var1 ^ 127459839961279L;
      // Super arguments moved to the required Java constructor position.
      this.field_42 = null;
   }

   // Retained obfuscator initialization is restored after javac.
   static { c = null; d = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native Entity recovery$indy$1(Object var0, long var1, long var3);

   private static native int[] recovery$indy$2(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native C_40g recovery$indy$5(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);

   private static native ArrayList recovery$indy$7(Object var0, long var1, int var3, long var4, long var6);

   private static native Object recovery$indy$8(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native Object recovery$indy$10(Object var0, long var1, long var3);

   private static native void recovery$indy$11(int var0, Object var1, int var2, char var3, char var4, int var5, long var6, long var8);

   private static native void recovery$indy$12(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$14();
}
