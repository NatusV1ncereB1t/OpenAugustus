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
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47ET;
import client.module.Module;
import client.setting.BooleanSetting;
import net.C_47Th;
import client.setting.ModeSetting;
import net.C_47cu;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47oo;
import client.ClientGlobals;
import client.module.Category;
import net.C_47tu;
import net.C_47xz;
import net.C_4f;

public class Jesus_47kW extends Module implements C_47xz {
   public final C_47Th settingMode;
   public final BooleanSetting settingDisableAtSneakJump;
   private final ModeSetting settingIgnoreFlowingWaterForce;
   private final C_47cu field_46;
   private static boolean field_44;
   private static final long a = C_4f.a(-2911910941870219617L, -8972975200623345L, MethodHandles.lookup().lookupClass()).a(123672430533602L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[30];
   private static final String[] f = new String[30];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   private static native Method d(long var0, long var2);

   public boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$1(7122381299995916049L, var1);
      boolean var10000 = recovery$indy$2(ClientGlobals.field_48.field_41J.settingDisableAtSneakJump, 7122323381414224292L, var1);
      if (!var3) {
         if (var10000) {
            var10000 = recovery$indy$3(field_43, 7122049395231963618L, var1).field_44q.method_42$aae029aa0a();
            boolean var10001 = var3;
            if (var1 > 0L) {
               if (!var3) {
                  if (var10000) {
                     return false;
                  }

                  var10000 = recovery$indy$4(field_43, 7122049395231963618L, var1).field_44W.method_42$aae029aa0a();
               }

               var10001 = var3;
            }

            if (var10001) {
               return var10000;
            }

            if (var10000) {
               var10000 = recovery$indy$5(field_43, 7121953899409450893L, var1)
                  .method_45$4093413a27(
                     recovery$indy$6(field_43, 7122117404099410241L, var1).field_48Q,
                     recovery$indy$7(field_43, 7122117404099410241L, var1).field_48j + 1.0,
                     recovery$indy$8(field_43, 7122117404099410241L, var1).field_42o
                  )
                  .method_48$e084f7739d() instanceof C_47ET;
               if (var3) {
                  return var10000;
               }

               if (var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public static void method_48$f633c984d8(boolean var0) {
      field_44 = var0;
   }

   public static boolean method_45$aae029aa0a() {
      boolean var0 = method_493$aae029aa0a();
      return !var0;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$9(this, 40, var3, -7099892280652102249L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 72498010691029L;
      long var8 = var4 ^ 99593642957744L;
      recovery$indy$11(this, var6, recovery$indy$10(this.settingMode, var8, 2180628731627545046L, var4), 2180549891465155609L, var4);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public boolean method_49u$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 57351417192677L;
      long var5 = var1 ^ 91903572028238L;
      long var7 = var1 ^ 74918474630082L;
      boolean var9 = recovery$indy$12(7980070986997513080L, var1);
      boolean var10000 = recovery$indy$13(this, var3, 7979402188072517006L, var1);
      if (!var9) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$14(this.settingIgnoreFlowingWaterForce, var5, 7979586095213826344L, var1).equalsIgnoreCase(recovery$indy$15(27813, 2595627364886466020L ^ var1));
      }

      boolean var10001 = var9;
      if (var1 > 0L) {
         if (!var9) {
            if (var10000) {
               var10000 = recovery$indy$16(var7, 7979264898616642802L, var1);
               if (var9) {
                  return var10000;
               }

               if (var10000) {
                  return true;
               }
            }

            var10000 = recovery$indy$17(this.settingIgnoreFlowingWaterForce, var5, 7979586095213826344L, var1).equalsIgnoreCase(recovery$indy$18(23735, 9025932997335416311L ^ var1));
         }

         var10001 = var9;
      }

      if (var1 > 0L) {
         if (!var10001) {
            if (var10000) {
               var10000 = recovery$indy$19(var7, 7979264898616642802L, var1);
               if (var9) {
                  return var10000;
               }

               if (!var10000) {
                  return true;
               }
            }

            var10000 = recovery$indy$20(this.settingIgnoreFlowingWaterForce, var5, 7979586095213826344L, var1).equalsIgnoreCase(recovery$indy$21(2084, 2484552449717086569L ^ var1));
         }

         var10001 = var9;
      }

      return var10001 ? var10000 : var10000;
   }

   public static boolean method_493$aae029aa0a() {
      return field_44;
   }

   public Jesus_47kW(int var1, int var2, short var3) {
      super("Jesus", "JesusChristus", ((((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a) ^ 56900415449021L), new Color(39, 103, 146), Category.MOVEMENT);
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 132440557623152L;
      long var8 = var4 ^ 73549883259814L;
      long var10 = var4 ^ 48375969642534L;
      long var12 = var4 ^ 56900415449021L;
      long var10001 = var4 ^ 14877655802656L;
      int var14 = (int)((var4 ^ 14877655802656L) >>> 32);
      int var15 = (int)((var4 ^ 14877655802656L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      // Super arguments moved to the required Java constructor position.
      C_47Th var21 = new C_47Th(
         var14,
         (short)var15,
         (short)var16,
         this,
         "Mode",
         "Solid",
         new BiFunction[]{
            recovery$indy$22(), recovery$indy$23(), recovery$indy$24(), recovery$indy$25(), recovery$indy$26(), recovery$indy$27(), recovery$indy$28()
         }
      );
      C_47tu var10003 = recovery$indy$29();
      long var10004 = -1296654024703780253L;
      C_47tu var17 = var10003;
      long var18 = var10;
      C_47Th var20 = var21;
      this.settingMode = var20.method_41$f9a7f5dbb6(var18, var17);
      this.settingDisableAtSneakJump = new BooleanSetting(this, var8, "DisableAtSneak/Jump", false);
      this.settingIgnoreFlowingWaterForce = new ModeSetting(this, "IgnoreFlowingWaterForce", var6, "Never", new String[]{"Never", "OnlyAtMovement", "OnlyWhileStanding", "Everytime"});
      this.field_46 = new C_47cu();
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$3(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$4(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$5(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native void recovery$indy$9(Object var0, int var1, long var2, long var4, long var6);

   private static native String recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$11(Object var0, long var1, Object var3, long var4, long var6);

   private static native boolean recovery$indy$12(long var0, long var2);

   private static native boolean recovery$indy$13(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$14(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$15(int var0, long var1);

   private static native boolean recovery$indy$16(long var0, long var2, long var4);

   private static native String recovery$indy$17(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$18(int var0, long var1);

   private static native boolean recovery$indy$19(long var0, long var2, long var4);

   private static native String recovery$indy$20(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$21(int var0, long var1);

   private static native BiFunction recovery$indy$22();

   private static native BiFunction recovery$indy$23();

   private static native BiFunction recovery$indy$24();

   private static native BiFunction recovery$indy$25();

   private static native BiFunction recovery$indy$26();

   private static native BiFunction recovery$indy$27();

   private static native BiFunction recovery$indy$28();

   private static native C_47tu recovery$indy$29();

   private static native MethodHandle recovery$constant$30();
}
