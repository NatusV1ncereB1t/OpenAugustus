package augustus.recovered.modules.player;

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
import net.C_47Ld;
import client.gui.ClickGuiScreen;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.MultiSelectSetting;
import net.C_47iC;
import net.C_47ob;
import net.C_47pL;
import net.C_47ph;
import net.C_47sY;
import client.module.Category;
import net.C_48l;
import net.C_4f;

public class NoScreenClosing_47Qu extends Module implements C_47iC {
   private final MultiSelectSetting settingScreensToNoClose;
   private static final long a = C_4f.a(-2758268292947869567L, 3632141384317563910L, MethodHandles.lookup().lookupClass()).a(129891216857461L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[19];
   private static final String[] f = new String[19];

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
   public void method_47$9035875d26(long var1, C_47ob var3) {
      boolean var4 = recovery$indy$1(2668249345968986190L, var1);
      C_473U var5 = recovery$indy$2(var3, 2668191654580507068L, var1);
      boolean var10000 = var5 instanceof C_47sY;
      boolean var10001 = var4;
      if (var1 >= 0L) {
         if (var4) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$3(field_43, 2668146663833542281L, var1) instanceof C_47pL;
         }

         var10001 = var4;
      }

      label178: {
         label166: {
            label165:
            if (var10001) {
               if (var10000) {
                  var10000 = recovery$indy$4(C_48l.INVENTORY, 2666296992873212597L, var1);
                  var10001 = var4;
                  if (var1 < 0L) {
                     break label166;
                  }

                  if (!var4) {
                     break label165;
                  }

                  if (var10000) {
                     break label178;
                  }
               }

               var10000 = recovery$indy$5(field_43, 2668146663833542281L, var1) instanceof ClickGuiScreen;
            }

            var10001 = var4;
         }

         label153: {
            label152:
            if (var10001) {
               if (var10000) {
                  var10000 = recovery$indy$6(C_48l.CLICK_GUI, 2666296992873212597L, var1);
                  var10001 = var4;
                  if (var1 <= 0L) {
                     break label153;
                  }

                  if (!var4) {
                     break label152;
                  }

                  if (var10000) {
                     break label178;
                  }
               }

               var10000 = recovery$indy$7(field_43, 2668146663833542281L, var1) instanceof C_47ph;
            }

            var10001 = var4;
         }

         label140: {
            label139:
            if (var10001) {
               if (var10000) {
                  var10000 = recovery$indy$8(C_48l.CHEST, 2666296992873212597L, var1);
                  var10001 = var4;
                  if (var1 <= 0L) {
                     break label140;
                  }

                  if (!var4) {
                     break label139;
                  }

                  if (var10000) {
                     break label178;
                  }
               }

               var10000 = recovery$indy$9(field_43, 2668146663833542281L, var1) instanceof C_47Ld;
            }

            var10001 = var4;
         }

         label127: {
            label126:
            if (var10001) {
               if (var10000) {
                  var10000 = recovery$indy$10(C_48l.CHAT, 2666296992873212597L, var1);
                  var10001 = var4;
                  if (var1 < 0L) {
                     break label127;
                  }

                  if (!var4) {
                     break label126;
                  }

                  if (var10000) {
                     break label178;
                  }
               }

               var10000 = recovery$indy$11(field_43, 2668146663833542281L, var1) instanceof C_47pL;
            }

            var10001 = var4;
         }

         if (var1 > 0L) {
            if (var10001) {
               if (var10000) {
                  return;
               }

               var10000 = recovery$indy$12(field_43, 2668146663833542281L, var1) instanceof ClickGuiScreen;
            }

            var10001 = var4;
         }

         if (var1 >= 0L) {
            if (var10001) {
               if (var10000) {
                  return;
               }

               var10000 = recovery$indy$13(field_43, 2668146663833542281L, var1) instanceof C_47ph;
            }

            var10001 = var4;
         }

         if (var1 >= 0L) {
            if (var10001) {
               if (var10000) {
                  return;
               }

               var10000 = recovery$indy$14(field_43, 2668146663833542281L, var1) instanceof C_47Ld;
            }

            var10001 = var4;
         }

         if (var10001) {
            if (var10000) {
               return;
            }

            var10000 = recovery$indy$15(C_48l.OTHERS, 2666296992873212597L, var1);
         }

         if (!var10000) {
            return;
         }
      }

      var3.cancel();
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$16(this, 26, var3, -7098221973242029385L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public NoScreenClosing_47Qu(long var1) {
      super("NoScreenClosing", "KeinBildschirmSchließen", ((a ^ var1) ^ 134261891090124L), new Color(255, 153, 64), Category.PLAYER);
      var1 = a ^ var1;
      long var3 = var1 ^ 83432173521722L;
      long var5 = var1 ^ 134261891090124L;
      // Super arguments moved to the required Java constructor position.
      long var10005 = 5725743285809878660L;
      this.settingScreensToNoClose = new MultiSelectSetting(this, "ScreensToNoClose", var3, C_48l.values());
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native boolean recovery$indy$1(long var0, long var2);

   private static native C_473U recovery$indy$2(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$3(Object var0, long var1, long var3);

   private static native boolean recovery$indy$4(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$5(Object var0, long var1, long var3);

   private static native boolean recovery$indy$6(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$7(Object var0, long var1, long var3);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$9(Object var0, long var1, long var3);

   private static native boolean recovery$indy$10(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$11(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$12(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$13(Object var0, long var1, long var3);

   private static native GuiScreen recovery$indy$14(Object var0, long var1, long var3);

   private static native boolean recovery$indy$15(Object var0, long var1, long var3);

   private static native void recovery$indy$16(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$17();
}
