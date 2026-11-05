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
import net.C_472n;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.BooleanSetting;
import net.C_47Vc;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47oo;
import client.ClientGlobals;
import client.module.Category;
import net.C_4f;

public class HeadHitter_47kN extends Module implements C_47hi, C_47Vc {
   private final BooleanSetting settingOnlyWhileMoving;
   private final BooleanSetting settingOnlyWhileJumping;
   private final BooleanSetting settingNotWhileSneaking;
   private final BooleanSetting settingNotWhileScaffold;
   private final BooleanSetting settingInInventory;
   private static final long a = C_4f.a(369334097466808456L, -2318807862966642143L, MethodHandles.lookup().lookupClass()).a(54449063700765L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[28];
   private static final String[] f = new String[28];

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

   private boolean method_45$0dd78e0064(long var1) {
      long var5;
      boolean var7;
      boolean var10000;
      boolean var10001;
      label135: {
         label134: {
            var1 = a ^ var1;
            long var3 = var1 ^ 63185629326235L;
            var5 = var1 ^ 80805367220412L;
            var7 = recovery$indy$1(-6502776770159933739L, var1);
            if (recovery$indy$2(field_43, -6502531167220388330L, var1) != null) {
               var10000 = recovery$indy$3(this.settingInInventory, -6503181767424709581L, var1);
               var10001 = var7;
               if (var1 <= 0L) {
                  break label135;
               }

               if (!var7) {
                  break label134;
               }

               if (!var10000) {
                  return false;
               }
            }

            var10000 = recovery$indy$4(ClientGlobals.field_48.field_46q, var3, -6502443221173975792L, var1);
         }

         var10001 = var7;
      }

      label123: {
         label122:
         if (var10001) {
            if (var10000) {
               var10000 = recovery$indy$5(this.settingNotWhileScaffold, -6503181767424709581L, var1);
               var10001 = var7;
               if (var1 < 0L) {
                  break label123;
               }

               if (!var7) {
                  break label122;
               }

               if (var10000) {
                  return false;
               }
            }

            var10000 = recovery$indy$6(field_43, -6502760134556760598L, var1).field_44q.method_42$aae029aa0a();
         }

         var10001 = var7;
      }

      label110: {
         label109:
         if (var10001) {
            if (var10000) {
               var10000 = recovery$indy$7(this.settingNotWhileSneaking, -6503181767424709581L, var1);
               var10001 = var7;
               if (var1 < 0L) {
                  break label110;
               }

               if (!var7) {
                  break label109;
               }

               if (var10000) {
                  return false;
               }
            }

            var10000 = recovery$indy$8(field_43, -6502760134556760598L, var1).field_44W.method_42$aae029aa0a();
         }

         var10001 = var7;
      }

      label97: {
         label96:
         if (var10001) {
            if (!var10000) {
               var10000 = recovery$indy$9(this.settingOnlyWhileJumping, -6503181767424709581L, var1);
               var10001 = var7;
               if (var1 <= 0L) {
                  break label97;
               }

               if (!var7) {
                  break label96;
               }

               if (var10000) {
                  return false;
               }
            }

            var10000 = recovery$indy$10(var5, -6502571470141816303L, var1);
         }

         var10001 = var7;
      }

      if (var10001) {
         if (!var10000) {
            var10000 = recovery$indy$11(this.settingOnlyWhileMoving, -6503181767424709581L, var1);
            if (var1 < 0L) {
               return !var7 ? var10000 : var10000;
            }

            if (!var7) {
               return !var7 ? var10000 : var10000;
            }

            if (var10000) {
               return false;
            }
         }

         var10000 = recovery$indy$12(field_43, -6502969505572437196L, var1)
            .method_45$4093413a27(
               recovery$indy$13(field_43, -6502698824258968022L, var1).field_48Q,
               recovery$indy$14(field_43, -6502698824258968022L, var1).field_438 + 2.0,
               recovery$indy$15(field_43, -6502698824258968022L, var1).field_42o
            )
            .method_48$e084f7739d()
            .method_43$aae029aa0a();
      }

      return !var7 ? var10000 : var10000;
   }

   @Override
   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var4 = var2 ^ 59219880001740L;
      boolean var6 = recovery$indy$16(6396066092804504535L, var2);
      C_472n var10000 = var1;
      if (var6) {
         if (recovery$indy$17(var1, 6395375554821472213L, var2)) {
            return;
         }

         var10000 = var1;
      }

      recovery$indy$19(var10000, recovery$indy$18(this, var4, 6395760569378380606L, var2), 6395998861802087875L, var2);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$20(this, 21, var3, -7099448270743125776L, var1);
      recovery$indy$21(this, 43, var3, -7099448270743125776L, var1);
   }

   @Override
   public void method_45q$e45a9973e5(long var1) {
      long var3 = var1 ^ 70388169844553L;
      if (recovery$indy$22(this, var3, 4559678580221213883L, var1)) {
         recovery$indy$23(field_43, 4559519439501409453L, var1).method_48$d00df7729d(0);
      }
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public HeadHitter_47kN(long var1) {
      super("HeadHitter", "KopfStoßer", ((a ^ var1) ^ 79632877825724L), new Color(230, 250, 175), Category.MOVEMENT);
      var1 = a ^ var1;
      long var3 = var1 ^ 62983460090535L;
      long var5 = var1 ^ 79632877825724L;
      // Super arguments moved to the required Java constructor position.
      this.settingOnlyWhileMoving = new BooleanSetting(this, var3, "OnlyWhileMoving", true);
      this.settingOnlyWhileJumping = new BooleanSetting(this, var3, "OnlyWhileJumping", true);
      this.settingNotWhileSneaking = new BooleanSetting(this, var3, "NotWhileSneaking", true);
      this.settingNotWhileScaffold = new BooleanSetting(this, var3, "NotWhileScaffold", false);
      this.settingInInventory = new BooleanSetting(this, var3, "InInventory", false);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(long var0, long var2);

   private static native GuiScreen recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(Object var0, long var1, long var3);

   private static native boolean recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$5(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$8(Object var0, long var1, long var3);

   private static native boolean recovery$indy$9(Object var0, long var1, long var3);

   private static native boolean recovery$indy$10(long var0, long var2, long var4);

   private static native boolean recovery$indy$11(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$12(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);

   private static native boolean recovery$indy$16(long var0, long var2);

   private static native boolean recovery$indy$17(Object var0, long var1, long var3);

   private static native boolean recovery$indy$18(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$19(Object var0, boolean var1, long var2, long var4);

   private static native void recovery$indy$20(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$21(Object var0, int var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$22(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);

   private static native MethodHandle recovery$constant$24();
}
