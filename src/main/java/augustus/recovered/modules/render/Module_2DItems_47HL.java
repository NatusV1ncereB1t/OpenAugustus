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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_42R;
import net.C_45g;
import net.minecraft.client.gui.ScaledResolution;
import net.C_47BP;
import net.C_47F9;
import net.C_47Fx;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.BooleanSetting;
import net.C_47Wu;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47j9;
import net.C_47oO;
import net.C_47oo;
import net.C_47rf;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47tf;
import net.C_47xz;
import net.C_4f;

public class Module_2DItems_47HL extends Module implements RenderListener, C_47xz, C_47oO {
   private final MultiSelectSetting settingItems;
   public final BooleanSetting settingRemove3DItems;
   private final BooleanSetting settingShowStackSize;
   private final BooleanSetting settingOnlyAtOptifineZoom;
   private final ArrayList field_43h;
   private final HashMap field_45;
   private static final long a = C_4f.a(1063904447167911710L, -7857684729964633236L, MethodHandles.lookup().lookupClass()).a(41267089472015L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[36];
   private static final String[] f = new String[36];

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

   public boolean method_41$904716e9d2(long var1, C_47rf var3, char var4) {
      long var5;
      int[] var7;
      boolean var10000;
      int[] var10001;
      label226: {
         var5 = (var1 << 16 | (long)var4 << 48 >>> 48) ^ a;
         var7 = recovery$indy$1(-7732487933589307102L, var5);
         var10000 = recovery$indy$2(this.settingOnlyAtOptifineZoom, -7732663806842602299L, var5);
         label225:
         if (var7 == null) {
            if (var10000) {
               var10000 = recovery$indy$3(field_43, -7732253501806375289L, var5).field_45s.method_42$aae029aa0a();
               var10001 = var7;
               if (var4 <= 0) {
                  break label226;
               }

               if (var7 != null) {
                  break label225;
               }

               if (!var10000) {
                  return false;
               }
            }

            var10000 = recovery$indy$4(C_45g.BRONZE, -7732132100897013442L, var5);
         }

         var10001 = var7;
      }

      if (var1 > 0L) {
         if (var10001 == null) {
            if (var10000) {
               var10000 = var3.method_48$dbd570a038().equals(C_42R.field_47I);
               if (var7 != null) {
                  return var10000;
               }

               if (var10000) {
                  return true;
               }
            }

            var10000 = recovery$indy$5(C_45g.DIAMOND, -7732132100897013442L, var5);
         }

         var10001 = var7;
      }

      if (var1 >= 0L) {
         if (var10001 == null) {
            if (var10000) {
               var10000 = var3.method_48$dbd570a038().equals(C_42R.field_45p);
               if (var7 != null) {
                  return var10000;
               }

               if (var10000) {
                  return true;
               }
            }

            var10000 = recovery$indy$6(C_45g.EMERALD, -7732132100897013442L, var5);
         }

         var10001 = var7;
      }

      if (var1 >= 0L) {
         if (var10001 == null) {
            if (var10000) {
               var10000 = var3.method_48$dbd570a038().equals(C_42R.field_47m);
               if (var7 != null) {
                  return var10000;
               }

               if (var10000) {
                  return true;
               }
            }

            var10000 = recovery$indy$7(C_45g.GOLD, -7732132100897013442L, var5);
         }

         var10001 = var7;
      }

      if (var1 > 0L) {
         if (var10001 == null) {
            if (var10000) {
               var10000 = var3.method_48$dbd570a038().equals(C_42R.field_41e);
               if (var7 != null) {
                  return var10000;
               }

               if (var10000) {
                  return true;
               }
            }

            var10000 = recovery$indy$8(C_45g.IRON, -7732132100897013442L, var5);
         }

         var10001 = var7;
      }

      if (var4 > 0) {
         if (var10001 == null) {
            if (var10000) {
               var10000 = var3.method_48$dbd570a038().equals(C_42R.field_41y);
               if (var7 != null) {
                  return var10000;
               }

               if (var10000) {
                  return true;
               }
            }

            var10000 = recovery$indy$9(C_45g.ALL, -7732132100897013442L, var5);
         }

         var10001 = var7;
      }

      if (var4 >= 0) {
         if (var10001 == null) {
            if (!var10000) {
               return false;
            }

            var10000 = var3.method_48$dbd570a038().equals(C_42R.field_47I);
         }

         var10001 = var7;
      }

      if (var1 > 0L) {
         if (var10001 == null) {
            if (var10000) {
               return false;
            }

            var10000 = var3.method_48$dbd570a038().equals(C_42R.field_45p);
         }

         var10001 = var7;
      }

      if (var1 >= 0L) {
         if (var10001 == null) {
            if (var10000) {
               return false;
            }

            var10000 = var3.method_48$dbd570a038().equals(C_42R.field_47m);
         }

         var10001 = var7;
      }

      if (var4 > 0) {
         if (var10001 == null) {
            if (var10000) {
               return false;
            }

            var10000 = var3.method_48$dbd570a038().equals(C_42R.field_41e);
         }

         var10001 = var7;
      }

      if (var1 > 0L) {
         if (var10001 == null) {
            if (var10000) {
               return false;
            }

            var10000 = var3.method_48$dbd570a038().equals(C_42R.field_41y);
         }

         var10001 = var7;
      }

      return var10001 != null ? var10000 : !var10000;
   }

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      int[] var8 = recovery$indy$10(1631319493113725745L, var6);
      Iterator var9 = this.field_43h.iterator();

      while (true) {
         if (var9.hasNext()) {
            C_47BP var10 = (C_47BP)var9.next();
            C_47tf var11 = (C_47tf)this.field_45.get(var10);
            if (var8 != null) {
               break;
            }

            label64: {
               double var12;
               int var10000 = (var12 = var11.field_47 - 0.0) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
               int[] var10001 = var8;
               if (var4 > 0) {
                  if (var8 == null) {
                     if (var10000 < 0) {
                        break label64;
                     }

                     double var13;
                     var10000 = (var13 = var11.field_47 - 1.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
                  }

                  var10001 = var8;
               }

               label65: {
                  if (var10001 == null) {
                     if (var10000 > 0) {
                        break label64;
                     }

                     GlStateManager.method_426$da8c82d5d4();
                     GlStateManager.method_42z$da8c82d5d4();
                     GlStateManager.method_42R$da8c82d5d4();
                     GlStateManager.method_44$42cf812248(770, 771, 1, 0);
                     C_47Fx.method_41$da8c82d5d4();
                     recovery$indy$11(field_43, 1634240685388952686L, var6)
                        .method_49$c76f597421(var10.method_48$ac4db64966(), (int)var11.field_40, (int)var11.field_41);
                     if (var8 != null) {
                        break label65;
                     }

                     var10000 = (int) ((recovery$indy$12(this.settingShowStackSize, 1631213882850475734L, var6)) ? 1 : 0);
                  }

                  if (var10000 != 0) {
                     recovery$indy$13(field_43, 1634240685388952686L, var6)
                        .method_47$2034826591(
                           recovery$indy$14(field_43, 1634143253666205070L, var6), var10.method_48$ac4db64966(), (int)var11.field_40, (int)var11.field_41
                        );
                  }

                  C_47Fx.method_45$da8c82d5d4();
                  GlStateManager.method_423$da8c82d5d4();
                  GlStateManager.method_41$da8c82d5d4();
               }

               GlStateManager.method_42O$da8c82d5d4();
            }

            if (var8 == null) {
               continue;
            }
         }

         if (var3 > 0) {
            RenderUtils.method_41$da8c82d5d4();
         }
         break;
      }
   }

   @Override
   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_43h.clear();
      this.field_45.clear();
   }

   @Override
   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 74191671779935L;
      this.field_45.clear();
      int[] var10000 = recovery$indy$15(8136280968176313723L, var1);
      ScaledResolution var7 = new ScaledResolution(field_43);
      int[] var6 = var10000;

      for (Object recovered$element$11121 : this.field_43h) {
         C_47BP var9 = (C_47BP) recovered$element$11121;
         C_47tf var10 = new C_47tf(
            var9.field_48u + (var9.field_48Q - var9.field_48u) * var3 - recovery$indy$16(field_43, 8135556030472244929L, var1).method_41$fedcb3e4d3(),
            var9.field_48O + (var9.field_48j - var9.field_48O) * var3 + 0.4 - recovery$indy$17(field_43, 8135556030472244929L, var1).method_49$fedcb3e4d3(),
            var9.field_48l + (var9.field_42o - var9.field_48l) * var3 - recovery$indy$18(field_43, 8135556030472244929L, var1).method_45$fedcb3e4d3()
         );
         this.field_45.put(var9, recovery$indy$19(var10.field_40, var10.field_41, var10.field_47, var4, var7, 8135531309776239848L, var1));
         if (var6 != null) {
            break;
         }
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$20(this, 32, var3, -7099235727473841619L, var1);
      recovery$indy$21(this, 40, var3, -7099235727473841619L, var1);
      recovery$indy$22(this, 17, var3, -7099235727473841619L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = (var4 ^ 133185413699093L) >>> 16;
      int var8 = (int)((var4 ^ 133185413699093L) << 48 >>> 48);
      this.field_43h.clear();
      int[] var10000 = recovery$indy$23(2180501811016944592L, var4);
      Iterator var10 = recovery$indy$24(field_43, 2180561514536499911L, var4).field_44Q.iterator();
      int[] var9 = var10000;

      while (var10.hasNext()) {
         label37: {
            Entity var11 = (Entity)var10.next();
            Entity var12 = var11;
            if (var9 == null) {
               if (!(var11 instanceof C_47BP)) {
                  break label37;
               }

               var12 = var11;
            }

            if (((C_47BP)var12).method_48$ac4db64966() != null
               && var9 == null
               && recovery$indy$25(this, var6, ((C_47BP)var11).method_48$ac4db64966(), (char)var8, 2180384766724501436L, var4)) {
               this.field_43h.add((C_47BP)var11);
            }
         }

         if (var9 != null) {
            break;
         }
      }
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      this.field_45.clear();
      this.field_43h.clear();
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Module_2DItems_47HL(long var1) {
      super("2DItems", "2DItems", ((a ^ var1) ^ 64508707835002L), new Color(66, 135, 245), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 12465133715852L;
      long var5 = var1 ^ 83077975724129L;
      long var7 = var1 ^ 64508707835002L;
      // Super arguments moved to the required Java constructor position.
      long var10005 = -8807008072832726724L;
      this.settingItems = new MultiSelectSetting(this, "Items", var3, C_45g.values());
      this.settingRemove3DItems = new BooleanSetting(this, var5, "Remove3DItems", true);
      this.settingShowStackSize = new BooleanSetting(this, var5, "ShowStackSize", false);
      this.settingOnlyAtOptifineZoom = new BooleanSetting(this, var5, "OnlyAtOptifineZoom", false);
      this.field_43h = new ArrayList();
      this.field_45 = new HashMap();
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native C_47oo recovery$indy$3(Object var0, long var1, long var3);

   private static native boolean recovery$indy$4(Object var0, long var1, long var3);

   private static native boolean recovery$indy$5(Object var0, long var1, long var3);

   private static native boolean recovery$indy$6(Object var0, long var1, long var3);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3);

   private static native boolean recovery$indy$9(Object var0, long var1, long var3);

   private static native int[] recovery$indy$10(long var0, long var2);

   private static native C_47Wu recovery$indy$11(Object var0, long var1, long var3);

   private static native boolean recovery$indy$12(Object var0, long var1, long var3);

   private static native C_47Wu recovery$indy$13(Object var0, long var1, long var3);

   private static native FontRenderer recovery$indy$14(Object var0, long var1, long var3);

   private static native int[] recovery$indy$15(long var0, long var2);

   private static native C_47j9 recovery$indy$16(Object var0, long var1, long var3);

   private static native C_47j9 recovery$indy$17(Object var0, long var1, long var3);

   private static native C_47j9 recovery$indy$18(Object var0, long var1, long var3);

   private static native C_47tf recovery$indy$19(double var0, double var2, double var4, long var6, Object var8, long var9, long var11);

   private static native void recovery$indy$20(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$21(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$23(long var0, long var2);

   private static native WorldClient recovery$indy$24(Object var0, long var1, long var3);

   private static native boolean recovery$indy$25(Object var0, long var1, Object var3, char var4, long var5, long var7);

   private static native MethodHandle recovery$constant$26();
}
