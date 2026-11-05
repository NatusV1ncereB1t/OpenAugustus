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
import client.Client;
import net.C_45n;
import net.C_472Z;
import net.C_472n;
import net.C_474v;
import net.C_475c;
import net.C_477r;
import net.minecraft.client.gui.ScaledResolution;
import net.C_478Q;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47B_;
import net.C_47Ij;
import net.C_47Il;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import net.C_47UH;
import client.event.RenderListener;
import net.C_47bu;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47j9;
import net.minecraft.client.renderer.RenderGlobal;
import client.ClientGlobals;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47tf;
import net.C_47xz;
import net.C_47y6;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class FreeCam_47kJ extends Module implements C_47UH, C_47hi, RenderListener, C_474v, C_472Z, C_47xz {
   private final NumberSetting settingSpeed;
   public final BooleanSetting settingSpectatorRender;
   private final BooleanSetting settingDisplayCoordinates;
   public final BooleanSetting settingUpdateRaytrace;
   public final BooleanSetting settingShowRealPlayerModel;
   private ColorSetting settingHighlightColor;
   private ColorSetting settingTextColor;
   private boolean field_43a;
   public C_47tf field_47;
   public C_47tf field_41;
   public double field_43F;
   public double field_430;
   public double field_41X;
   public double field_42;
   public double field_41G;
   public double field_41u;
   public float field_40;
   public float field_46;
   public float field_49;
   public float field_41s;
   private static int field_48;
   private static final long c = C_4f.a(-3978021141814133145L, -2989000583781405544L, MethodHandles.lookup().lookupClass()).a(202492771258162L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final Object[] l = new Object[69];
   private static final String[] m = new String[69];

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static int i(long var0, long var2) {
      var0 ^= var2 << 48 | var2;
      int var4 = (int)(var0 >>> 46);
      if (m[var4] != null) {
         return var4;
      }

      Object var5 = l[var4];
      if (!(var5 instanceof String)) {
         return var4;
      }

      byte var6 = 0;
      byte var10000;
      switch ((int)(var0 >>> 42 & 63L)) {
         case 0:
            var10000 = 5;
            break;
         case 1:
            var10000 = 0;
            break;
         case 2:
            var10000 = 61;
            break;
         case 3:
            var10000 = 28;
            break;
         case 4:
            var10000 = 50;
            break;
         case 5:
            var10000 = 3;
            break;
         case 6:
            var10000 = 17;
            break;
         case 7:
            var10000 = 26;
            break;
         case 8:
            var10000 = 11;
            break;
         case 9:
            var10000 = 44;
            break;
         case 10:
            var10000 = 21;
            break;
         case 11:
            var10000 = 46;
            break;
         case 12:
            var10000 = 48;
            break;
         case 13:
            var10000 = 36;
            break;
         case 14:
            var10000 = 54;
            break;
         case 15:
            var10000 = 49;
            break;
         case 16:
            var10000 = 8;
            break;
         case 17:
            var10000 = 23;
            break;
         case 18:
            var10000 = 45;
            break;
         case 19:
            var10000 = 62;
            break;
         case 20:
            var10000 = 41;
            break;
         case 21:
            var10000 = 10;
            break;
         case 22:
            var10000 = 7;
            break;
         case 23:
            var10000 = 40;
            break;
         case 24:
            var10000 = 29;
            break;
         case 25:
            var10000 = 58;
            break;
         case 26:
            var10000 = 63;
            break;
         case 27:
            var10000 = 4;
            break;
         case 28:
            var10000 = 18;
            break;
         case 29:
            var10000 = 22;
            break;
         case 30:
            var10000 = 33;
            break;
         case 31:
            var10000 = 9;
            break;
         case 32:
            var10000 = 30;
            break;
         case 33:
            var10000 = 2;
            break;
         case 34:
            var10000 = 27;
            break;
         case 35:
            var10000 = 32;
            break;
         case 36:
            var10000 = 53;
            break;
         case 37:
            var10000 = 31;
            break;
         case 38:
            var10000 = 12;
            break;
         case 39:
            var10000 = 59;
            break;
         case 40:
            var10000 = 42;
            break;
         case 41:
            var10000 = 1;
            break;
         case 42:
            var10000 = 35;
            break;
         case 43:
            var10000 = 51;
            break;
         case 44:
            var10000 = 34;
            break;
         case 45:
            var10000 = 47;
            break;
         case 46:
            var10000 = 15;
            break;
         case 47:
            var10000 = 24;
            break;
         case 48:
            var10000 = 13;
            break;
         case 49:
            var10000 = 19;
            break;
         case 50:
            var10000 = 20;
            break;
         case 51:
            var10000 = 52;
            break;
         case 52:
            var10000 = 14;
            break;
         case 53:
            var10000 = 39;
            break;
         case 54:
            var10000 = 16;
            break;
         case 55:
            var10000 = 25;
            break;
         case 56:
            var10000 = 6;
            break;
         case 57:
            var10000 = 56;
            break;
         case 58:
            var10000 = 60;
            break;
         case 59:
            var10000 = 43;
            break;
         case 60:
            var10000 = 37;
            break;
         case 61:
            var10000 = 55;
            break;
         case 62:
            var10000 = 38;
            break;
         default:
            var10000 = 57;
      }

      var6 = var10000;
      int[] var7 = new int[6];

      for (int var8 = 0; var8 < 6; var8++) {
         int var9 = 7 * (5 - var8);
         int var10 = (int)(var0 >>> var9 & 127L);
         var10 -= var6;
         if (var10 < 0) {
            var10 += 128;
         }

         var7[var8] = var10;
      }

      char[] var13 = ((String)var5).toCharArray();

      for (int var14 = 0; var14 < var13.length; var14++) {
         int var16 = var7[var14 % var7.length];
         if (var16 == 0) {
            break;
         }

         var13[var14] = (char)(var13[var14] ^ var16);
      }

      m[var4] = new String(var13);
      return var4;
   }

   private static Field e(Class var0, String var1, Class var2) {
      for (Field var6 : var0.getDeclaredFields()) {
         if (var6.getName().equals(var1) && var6.getType() == var2) {
            return var6;
         }
      }

      return null;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(recovery$constant$1().asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1, var2), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("net/47kJ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static Method e(Class var0, String var1, Class var2, int var3, Class[] var4) {
      label38:
      for (Method var8 : var0.getDeclaredMethods()) {
         if (var8.getName().equals(var1) && var8.getReturnType() == var2) {
            Class[] var9 = var8.getParameterTypes();
            if (var9.length == var3) {
               for (int var10 = 0; var10 < var3; var10++) {
                  if (var9[var10] != var4[var10]) {
                     continue label38;
                  }
               }

               return var8;
            }
         }
      }

      return null;
   }

   @Override
   public void method_42$1da516aeaa(int var1, int var2, short var3, C_47B_ var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      boolean var7 = recovery$indy$2(7883819562760489646L, var5);
      C_47B_ var10000 = var4;
      if (var7) {
         if (recovery$indy$3(var4, 7884078649708872357L, var5) != recovery$indy$4(field_43, 7886962982500532971L, var5)) {
            return;
         }

         var10000 = var4;
      }

      recovery$indy$5(var10000, true, 7887323580282448406L, var5);
   }

   private static Method l(long var0, long var2) {
      int var4 = i(var0, var2);
      Object var5 = l[var4];
      if (!(var5 instanceof String)) {
         return (Method)var5;
      }

      String var6 = m[var4];
      int var7 = var6.indexOf(8);
      Class var8 = j(Long.parseLong(var6.substring(0, var7), 36), 0L);
      int var9 = var6.indexOf(8, ++var7);
      String var10 = var6.substring(var7, var9);
      int var11 = -1;
      int var12 = var9;

      do {
         var11++;
         var12++;
      } while ((var12 = var6.indexOf(8, var12)) > -1);

      int var13;
      Class[] var14 = new Class[var13 = var11 - 1];
      Class var15 = null;
      var12 = var9 + 1;

      for (int var16 = 0; var16 < var11; var16++) {
         int var17 = var6.indexOf(8, var12);
         var15 = j(Long.parseLong(var6.substring(var12, var17), 36), 0L);
         if (var16 < var13) {
            var14[var16] = var15;
         }

         var12 = var17 + 1;
      }

      Class var23 = var8;

      while (true) {
         Method var26 = e(var23, var10, var15, var13, var14);
         if (var26 != null) {
            l[var4] = var26;
            return var26;
         }

         if (var23.getName().equals("java.lang.Object")) {
            break;
         }

         if ((var23 = var23.getSuperclass()) == null) {
            var23 = j(2519139426801877L, 0L);
            break;
         }
      }

      var23 = var8;

      while (true) {
         Class[] var27;
         if ((var27 = var23.getInterfaces()) != null) {
            for (int var18 = 0; var18 < var27.length; var18++) {
               Method var19 = f(var27[var18], var10, var15, var13, var14);
               if (var19 != null) {
                  l[var4] = var19;
                  return var19;
               }
            }
         }

         if (var23.getName().equals("java.lang.Object")) {
            StringBuffer var28 = new StringBuffer();
            var28.append("NoSuchMethodException in ").append(var8.getName()).append(' ').append(var15.getName()).append(' ').append(var10).append('(');
            int var29 = 0;

            while (var29 < var13) {
               var28.append(var14[var29].getName());
               if (++var29 < var13) {
                  var28.append(", ");
               }
            }

            var28.append(')');
            throw new RuntimeException(var28.toString());
         }

         if ((var23 = var23.getSuperclass()) == null) {
            var23 = j(2519139426801877L, 0L);
         }
      }
   }

   @Override
   public void method_41$fae8de1664(C_475c var1) {
      long var2 = c ^ 31424128190528L;
      long var10001 = -6877822542444153344L;
      BooleanSetting var4 = this.settingUpdateRaytrace;
      if (!var4.method_49$aae029aa0a()) {
         var1.cancel();
         long var10002 = -6878266315620383408L;
         boolean var5 = true;
         C_475c var6 = var1;
         var6.method_42$f633c984d8(var5);
      }
   }

   private static Method f(Class var0, String var1, Class var2, int var3, Class[] var4) {
      Method var5 = e(var0, var1, var2, var3, var4);
      if (var5 != null) {
         return var5;
      }

      Class[] var6 = var0.getInterfaces();
      if (var6 != null) {
         for (int var7 = 0; var7 < var6.length; var7++) {
            var5 = f(var6[var7], var1, var2, var3, var4);
            if (var5 != null) {
               return var5;
            }
         }
      }

      return null;
   }

   private static Field f(Class var0, String var1, Class var2) {
      Field var3 = e(var0, var1, var2);
      if (var3 != null) {
         return var3;
      }

      Class[] var4 = var0.getInterfaces();
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.length; var5++) {
            var3 = f(var4[var5], var1, var2);
            if (var3 != null) {
               return var3;
            }
         }
      }

      return null;
   }

   private static Field k(long var0, long var2) {
      int var4 = i(var0, var2);
      Object var5 = l[var4];
      if (!(var5 instanceof String)) {
         return (Field)var5;
      }

      String var6 = m[var4];
      int var7 = var6.indexOf(8);
      Class var8 = j(Long.parseLong(var6.substring(0, var7), 36), 0L);
      int var9 = var6.indexOf(8, ++var7);
      String var10 = var6.substring(var7, var9);
      Class var11 = j(Long.parseLong(var6.substring(++var9), 36), 0L);
      Class var12 = var8;

      while (true) {
         Field var13 = e(var12, var10, var11);
         if (var13 != null) {
            l[var4] = var13;
            return var13;
         }

         Class[] var14 = var12.getInterfaces();
         if (var14 != null) {
            for (int var15 = 0; var15 < var14.length; var15++) {
               var13 = f(var14[var15], var10, var11);
               if (var13 != null) {
                  l[var4] = var13;
                  return var13;
               }
            }
         }

         if (var12.getName().equals("java.lang.Object")) {
            StringBuffer var19 = new StringBuffer();
            var19.append("NoSuchFieldException in ").append(var8.getName()).append(' ').append(var11.getName()).append(' ').append(var10);
            throw new RuntimeException(var19.toString());
         }

         var12 = var12.getSuperclass();
         if (var12 == null) {
            var12 = j(2519139426801877L, 0L);
         }
      }
   }

   private static Class j(long var0, long var2) {
      Class var5 = null;
      int var4 = i(var0, var2);
      Object var6 = l[var4];
      Object var10000 = var6;

      try {
         if (var10000 instanceof String) {
            var5 = Class.forName(m[var4]);
            l[var4] = var5;
            return var5;
         }
      } catch (Exception var8) {
         throw new RuntimeException(var8.toString());
      }

      return (Class)var6;
   }

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var10001 = var6 ^ 48982798476343L;
      int var8 = (int)((var6 ^ 48982798476343L) >>> 32);
      int var9 = (int)((var6 ^ 48982798476343L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      boolean var11 = recovery$indy$6(1633074609422545263L, var6);
      if (recovery$indy$7(this.settingDisplayCoordinates, 1633804875025383457L, var6)) {
         C_47tf var12 = recovery$indy$10(
               recovery$indy$8(field_43, 1636270806156966186L, var6).field_48z,
               recovery$indy$9(field_43, 1636270806156966186L, var6).field_48h,
               1632590561104494404L,
               var6
            )
            .method_46$90d20bf996(200.0);
         C_47tf var13 = this.field_41.method_48$d6978c8819(this.field_47, var2);
         C_47Ij var14 = recovery$indy$11(field_43, 1636327236944338830L, var6)
            .method_40$f1a7e917f7(
               var13.field_40,
               var13.field_41 + recovery$indy$12(field_43, 1636270806156966186L, var6).method_41$bc607678b6(),
               var13.field_47,
               var12.field_40 + var13.field_40,
               var12.field_41 + var13.field_41 + recovery$indy$13(field_43, 1636270806156966186L, var6).method_41$bc607678b6(),
               var12.field_47 + var13.field_47
            );
         C_47Ij var10000 = var14;
         boolean var17 = var11;
         if (var3 > 0) {
            if (var11) {
               if (var14 == null) {
                  return;
               }

               var10000 = var14;
            }

            var17 = var11;
         }

         if (var17) {
            if (var10000.field_45 == null) {
               return;
            }

            var10000 = var14;
         }

         C_478Q var15 = var10000.method_49$5730377d31();
         String var16 = recovery$indy$14(28232, 5374005640414069758L ^ var6)
            + var15.method_40$8abf5c6871()
            + recovery$indy$15(17000, 2264645286910570451L ^ var6)
            + var15.method_43$8abf5c6871()
            + recovery$indy$16(15640, 771200813037572258L ^ var6)
            + var15.method_47$8abf5c6871();
         recovery$indy$17(field_43, 1634390948219604458L, var6)
            .method_43$7961e3f788(
               var16,
               (var5.method_46$8abf5c6871() - recovery$indy$18(field_43, 1634390948219604458L, var6).method_48$2f485d5ba3(var16)) / 2,
               var5.method_48$8abf5c6871() / 2 + recovery$indy$19(field_43, 1634390948219604458L, var6).field_47 * 3,
               recovery$indy$20(this.settingTextColor, var8, (short)var9, (char)var10, 0, 1632714575986864399L, var6)
            );
      }
   }

   @Override
   public void method_49$685ee83d43(C_47bu var1, long var2) {
      boolean var4 = recovery$indy$21(1815255032657009853L, var2);
      if (recovery$indy$22(this.settingShowRealPlayerModel, 1816171966522167225L, var2)) {
         EntityPlayerSP var5 = recovery$indy$23(field_43, 1814129897265755826L, var2);
         double var6 = var5.field_48Q;
         double var8 = var5.field_48j;
         double var10 = var5.field_42o;
         double var12 = var5.field_48u;
         double var14 = var5.field_48O;
         double var16 = var5.field_48l;
         var5.field_48Q = this.field_43F;
         var5.field_48j = this.field_430;
         var5.field_42o = this.field_41X;
         var5.field_48u = this.field_42;
         var5.field_48O = this.field_41G;
         var5.field_48l = this.field_41u;
         recovery$indy$24(field_43, 1816996260353400967L, var2).field_42y++;
         if (var2 >= 0L) {
            boolean var18 = recovery$indy$25(var1, 1815834886239013164L, var2);
            if (!var4) {
               if (var18) {
                  C_47Il.method_49$758fc8f1b9(var5);
               }

               recovery$indy$26(field_43, 1816996260353400967L, var2).field_42k.method_49$9adb6424b3(var5, recovery$indy$27(var1, 1816916688044513321L, var2));
            }

            var5.field_48Q = var6;
            var5.field_48j = var8;
            var5.field_42o = var10;
            var5.field_48u = var12;
            var5.field_48O = var14;
            var5.field_48l = var16;
         }
      }
   }

   public static void method_49$d00df7729d(int var0) {
      field_48 = var0;
   }

   public static int method_49$8abf5c6871() {
      return field_48;
   }

   public static int method_45$8abf5c6871() {
      int var0 = method_49$8abf5c6871();
      return var0 == 0 ? 60 : 0;
   }

   @Override
   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var4 = var2 ^ 132406506099900L;
      boolean var6 = recovery$indy$28(6398181989401067276L, var2);
      FreeCam_47kJ var10000 = this;
      if (var6) {
         if (!this.field_43a) {
            double[] var7 = recovery$indy$32(
               0.5,
               recovery$indy$30(var1, 6398871764682195671L, var2),
               recovery$indy$31(var1, 6397872605460449047L, var2),
               this.field_49,
               6398063033314207331L,
               var2
            );
            C_47tf var8 = new C_47tf(
               var7[0], recovery$indy$33(var1, 6398714788790359389L, var2) ? 0.4 : (recovery$indy$34(var1, 6398648022392736437L, var2) ? -0.4 : 0.0), var7[1]
            );
            var8 = var8.method_46$90d20bf996(recovery$indy$35(this.settingSpeed, var4, 6399360566853043958L, var2));
            recovery$indy$36(var1, false, 6398310127094664205L, var2);
            recovery$indy$37(var1, false, 6399521294440197897L, var2);
            recovery$indy$38(var1, 0.0F, 6398557376459142898L, var2);
            recovery$indy$39(var1, 0.0F, 6397586793951716227L, var2);
            this.field_41 = new C_47tf(this.field_47);
            this.field_47 = this.field_47.method_40$8f851fab6c(var8);
            return;
         }

         this.field_43a = false;
         var10000 = this;
      }

      recovery$indy$29(var10000, 6401558414408235157L, var2);
   }

   @Override
   public void onRender3D(long var1, float var3) {
      long var10001 = var1 ^ 88570288194173L;
      int var4 = (int)((var1 ^ 88570288194173L) >>> 32);
      int var5 = (int)((var1 ^ 88570288194173L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      this.field_49 = recovery$indy$40(field_43, 8142314207162834784L, var1).field_48h;
      boolean var10000 = recovery$indy$41(8134432160485258607L, var1);
      this.field_41s = recovery$indy$42(field_43, 8142314207162834784L, var1).field_48z;
      boolean var7 = var10000;
      if (recovery$indy$43(this.settingDisplayCoordinates, 8135203941608449643L, var1)) {
         C_47tf var8 = recovery$indy$46(
               recovery$indy$44(field_43, 8142314207162834784L, var1).field_48z,
               recovery$indy$45(field_43, 8142314207162834784L, var1).field_48h,
               8134165540883437838L,
               var1
            )
            .method_46$90d20bf996(200.0);
         C_47tf var9 = this.field_41.method_48$d6978c8819(this.field_47, var3);
         C_47Ij var10 = recovery$indy$47(field_43, 8142256280619219396L, var1)
            .method_40$f1a7e917f7(
               var9.field_40,
               var9.field_41 + recovery$indy$48(field_43, 8142314207162834784L, var1).method_41$bc607678b6(),
               var9.field_47,
               var8.field_40 + var9.field_40,
               var8.field_41 + var9.field_41 + recovery$indy$49(field_43, 8142314207162834784L, var1).method_41$bc607678b6(),
               var8.field_47 + var9.field_47
            );
         C_47Ij var12 = var10;
         boolean var13 = var7;
         if (var1 > 0L) {
            if (!var7) {
               if (var10 == null) {
                  return;
               }

               var12 = var10;
            }

            var13 = var7;
         }

         if (!var13) {
            if (var12.field_45 == null) {
               return;
            }

            RenderUtils.method_42$da8c82d5d4();
            GL11.glPushMatrix();
            GL11.glLineWidth(3.0F);
            GL11.glTranslated(
               -recovery$indy$50(field_43, 8135343675569087735L, var1).method_41$fedcb3e4d3(),
               -recovery$indy$51(field_43, 8135343675569087735L, var1).method_49$fedcb3e4d3(),
               -recovery$indy$52(field_43, 8135343675569087735L, var1).method_45$fedcb3e4d3()
            );
            GL11.glDisable(3008);
            RenderUtils.method_43$d00df7729d(recovery$indy$53(this.settingHighlightColor, var4, (short)var5, (char)var6, 0, 8134324740204648261L, var1));
            var12 = var10;
         }

         C_478Q var11 = var12.method_49$5730377d31();
         RenderUtils.method_44$cc82067b44(
            var11.method_40$8abf5c6871(),
            var11.method_43$8abf5c6871(),
            var11.method_47$8abf5c6871(),
            var11.method_40$8abf5c6871() + 1,
            var11.method_43$8abf5c6871() + 1,
            var11.method_47$8abf5c6871() + 1
         );
         GL11.glPopMatrix();
         RenderUtils.method_43$da8c82d5d4();
         GL11.glEnable(3008);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$54(this, 7, var5, -7101741296577986957L, var1);
      recovery$indy$55(this, 21, 100, var3, -7101479438951269663L, var1);
      recovery$indy$56(this, 32, var5, -7101741296577986957L, var1);
      recovery$indy$57(this, 57, var5, -7101741296577986957L, var1);
      recovery$indy$58(this, 58, var5, -7101741296577986957L, var1);
      recovery$indy$59(this, 40, var5, -7101741296577986957L, var1);
   }

   @Override
   public void method_482$4a66cb4514(char var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      boolean var6 = recovery$indy$60(-359192729919300411L, var4);
      EntityPlayerSP var10000 = recovery$indy$61(field_43, -351545710551427968L, var4);
      if (var6) {
         if (var10000 == null) {
            this.field_43a = true;
            return;
         }

         recovery$indy$62(field_43, -351545710551427968L, var4).field_48h = this.field_49;
         var10000 = recovery$indy$63(field_43, -351545710551427968L, var4);
      }

      var10000.field_48z = this.field_41s;
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      long var10001 = var1 ^ 129959593082890L;
      int var3 = (int)((var1 ^ 129959593082890L) >>> 48);
      int var4 = (int)((var1 ^ 129959593082890L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      boolean var6 = recovery$indy$64(-7739904904036658918L, var1);
      EntityPlayerSP var10000 = recovery$indy$65(field_43, -7743284055463593195L, var1);
      if (!var6) {
         if (var10000 == null) {
            return;
         }

         var10000 = recovery$indy$66(field_43, -7743284055463593195L, var1);
      }

      float var7 = var10000.field_48h;
      float var8 = recovery$indy$67(field_43, -7743284055463593195L, var1).field_48z;
      recovery$indy$68(ClientGlobals.field_46, new C_477r(var7, var8), 3, (char)var3, var4, var5, this, -7740014624451146420L, var1);
      C_47y6 var9 = recovery$indy$70(recovery$indy$69(-7741276128184959058L, var1), -7740287101430677760L, var1);
      var9.field_43 = var7;
      var9.field_48 = var8;
      var9.field_49 = var7;
      var9.field_41 = var8;
      recovery$indy$71(field_43, -7743284055463593195L, var1).field_48h = var7;
      recovery$indy$72(field_43, -7743284055463593195L, var1).field_48z = var8;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      if (recovery$indy$73(field_43, 2737134667375823459L, var4) != null) {
         this.field_40 = recovery$indy$74(field_43, 2737134667375823459L, var4).field_48h;
         this.field_46 = recovery$indy$75(field_43, 2737134667375823459L, var4).field_48z;
         this.field_49 = recovery$indy$76(field_43, 2737134667375823459L, var4).field_48h;
         this.field_41s = recovery$indy$77(field_43, 2737134667375823459L, var4).field_48z;
         this.field_47 = recovery$indy$78(field_43, 2737134667375823459L, var4).method_42$41b79b67a0(1.0F);
         this.field_41 = recovery$indy$79(field_43, 2737134667375823459L, var4).method_42$41b79b67a0(0.0F);
      }
   }

   @Override
   public void method_488$e45a9973e5(long var1) {
      long var10001 = var1 ^ 35379058093335L;
      int var3 = (int)((var1 ^ 35379058093335L) >>> 48);
      int var4 = (int)((var1 ^ 35379058093335L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      boolean var6 = recovery$indy$80(-5076960441515213817L, var1);
      EntityPlayerSP var10000 = recovery$indy$81(field_43, -5073584038880193016L, var1);
      if (!var6) {
         label25: {
            if (var10000 == null) {
               this.field_43a = true;
               if (var1 <= 0L) {
                  break label25;
               }

               if (!var6) {
                  return;
               }
            }

            recovery$indy$84(
               ClientGlobals.field_46,
               new C_477r(recovery$indy$82(field_43, -5073584038880193016L, var1).field_43F, recovery$indy$83(field_43, -5073584038880193016L, var1).field_43n),
               -50,
               (char)var3,
               var4,
               var5,
               this,
               -5077624227548110767L,
               var1
            );
            recovery$indy$85(field_43, -5073584038880193016L, var1).field_48h = recovery$indy$86(field_43, -5073584038880193016L, var1).field_43F;
         }

         var10000 = recovery$indy$87(field_43, -5073584038880193016L, var1);
      }

      var10000.field_48z = recovery$indy$88(field_43, -5073584038880193016L, var1).field_43n;
   }

   public FreeCam_47kJ(long var1) {
      super("FreeCam", "FreieKamera", ((c ^ var1) ^ 59721741408299L), new Color(235, 116, 52), Category.MOVEMENT);
      var1 = c ^ var1;
      long var3 = var1 ^ 86466589053197L;
      long var5 = var1 ^ 78570228040752L;
      long var7 = var1 ^ 116744690891703L;
      long var9 = var1 ^ 39470097138709L;
      long var11 = var1 ^ 59721741408299L;
      // Super arguments moved to the required Java constructor position.
      this.settingSpeed = new NumberSetting(this, "Speed", 1.0, var7, 0.0, 4.0, 2);
      this.settingSpectatorRender = new BooleanSetting(this, var5, "Spectator Render", false);
      this.settingDisplayCoordinates = new BooleanSetting(this, var5, "Display Coordinates", false);
      this.settingUpdateRaytrace = new BooleanSetting(this, var5, "Update Raytrace", false);
      this.settingShowRealPlayerModel = new BooleanSetting(this, var5, "Show real Player Model", true);
      ColorSetting var10001 = new ColorSetting(var9, this, "Highlight Color", new Color(5, 245, 69, 50));
      BooleanSetting var10002 = this.settingDisplayCoordinates;
      this.settingDisplayCoordinates.getClass();
      C_45n var10003 = recovery$indy$89(var10002);
      long var10004 = -7961890110371170125L;
      C_45n var13 = var10003;
      long var14 = var3;
      ColorSetting var16 = var10001;
      this.settingHighlightColor = (ColorSetting)var16.method_43$780fd62a21(var14, var13);
      var10001 = new ColorSetting(var9, this, "Text Color", new Color(255, 255, 255, 255));
      var10002 = this.settingDisplayCoordinates;
      this.settingDisplayCoordinates.getClass();
      var10003 = recovery$indy$90(var10002);
      var10004 = -7961890110371170125L;
      C_45n var17 = var10003;
      long var18 = var3;
      ColorSetting var20 = var10001;
      this.settingTextColor = (ColorSetting)var20.method_43$780fd62a21(var18, var17);
      this.field_43a = false;
      this.field_47 = new C_47tf(0.0, 0.0, 0.0);
      this.field_41 = new C_47tf(0.0, 0.0, 0.0);
   }

   // Retained obfuscator initialization is restored after javac.
   static { d = null; e = null; }

   private static native void c();

   private static native Object c(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle c(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native MethodHandle recovery$constant$0();

   private static native MethodHandle recovery$constant$1();

   private static native boolean recovery$indy$2(long var0, long var2);

   private static native Entity recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native void recovery$indy$5(Object var0, boolean var1, long var2, long var4);

   private static native boolean recovery$indy$6(long var0, long var2);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native C_47tf recovery$indy$10(float var0, float var1, long var2, long var4);

   private static native WorldClient recovery$indy$11(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);

   private static native String recovery$indy$14(int var0, long var1);

   private static native String recovery$indy$15(int var0, long var1);

   private static native String recovery$indy$16(int var0, long var1);

   private static native FontRenderer recovery$indy$17(Object var0, long var1, long var3);

   private static native FontRenderer recovery$indy$18(Object var0, long var1, long var3);

   private static native FontRenderer recovery$indy$19(Object var0, long var1, long var3);

   private static native int recovery$indy$20(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native boolean recovery$indy$21(long var0, long var2);

   private static native boolean recovery$indy$22(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);

   private static native RenderGlobal recovery$indy$24(Object var0, long var1, long var3);

   private static native boolean recovery$indy$25(Object var0, long var1, long var3);

   private static native RenderGlobal recovery$indy$26(Object var0, long var1, long var3);

   private static native float recovery$indy$27(Object var0, long var1, long var3);

   private static native boolean recovery$indy$28(long var0, long var2);

   private static native void recovery$indy$29(Object var0, long var1, long var3);

   private static native float recovery$indy$30(Object var0, long var1, long var3);

   private static native float recovery$indy$31(Object var0, long var1, long var3);

   private static native double[] recovery$indy$32(double var0, float var2, float var3, float var4, long var5, long var7);

   private static native boolean recovery$indy$33(Object var0, long var1, long var3);

   private static native boolean recovery$indy$34(Object var0, long var1, long var3);

   private static native double recovery$indy$35(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$36(Object var0, boolean var1, long var2, long var4);

   private static native void recovery$indy$37(Object var0, boolean var1, long var2, long var4);

   private static native void recovery$indy$38(Object var0, float var1, long var2, long var4);

   private static native void recovery$indy$39(Object var0, float var1, long var2, long var4);

   private static native EntityPlayerSP recovery$indy$40(Object var0, long var1, long var3);

   private static native boolean recovery$indy$41(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$42(Object var0, long var1, long var3);

   private static native boolean recovery$indy$43(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$44(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$45(Object var0, long var1, long var3);

   private static native C_47tf recovery$indy$46(float var0, float var1, long var2, long var4);

   private static native WorldClient recovery$indy$47(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$48(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$49(Object var0, long var1, long var3);

   private static native C_47j9 recovery$indy$50(Object var0, long var1, long var3);

   private static native C_47j9 recovery$indy$51(Object var0, long var1, long var3);

   private static native C_47j9 recovery$indy$52(Object var0, long var1, long var3);

   private static native int recovery$indy$53(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);

   private static native void recovery$indy$54(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$55(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native void recovery$indy$56(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$57(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$58(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$59(Object var0, int var1, long var2, long var4, long var6);

   private static native boolean recovery$indy$60(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$61(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$62(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$63(Object var0, long var1, long var3);

   private static native boolean recovery$indy$64(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$65(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$66(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$67(Object var0, long var1, long var3);

   private static native void recovery$indy$68(Object var0, Object var1, int var2, char var3, int var4, int var5, Object var6, long var7, long var9);

   private static native Client recovery$indy$69(long var0, long var2);

   private static native C_47y6 recovery$indy$70(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$71(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$72(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$73(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$74(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$75(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$76(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$77(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$78(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$79(Object var0, long var1, long var3);

   private static native boolean recovery$indy$80(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$81(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$82(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$83(Object var0, long var1, long var3);

   private static native void recovery$indy$84(Object var0, Object var1, int var2, char var3, int var4, int var5, Object var6, long var7, long var9);

   private static native EntityPlayerSP recovery$indy$85(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$86(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$87(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$88(Object var0, long var1, long var3);

   private static native C_45n recovery$indy$89(BooleanSetting var0);

   private static native C_45n recovery$indy$90(BooleanSetting var0);
}
