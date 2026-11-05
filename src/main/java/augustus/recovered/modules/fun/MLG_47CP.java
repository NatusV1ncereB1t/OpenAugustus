package augustus.recovered.modules.fun;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_42D;
import net.C_473M;
import net.C_473k;
import net.C_476q;
import net.C_476w;
import net.minecraft.client.gui.ScaledResolution;
import net.C_477z;
import net.C_47F9;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47TB;
import net.C_47Vp;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import net.minecraft.util.ResourceLocation;
import net.C_47qf;
import net.C_47rL;
import client.render.RenderUtils;
import net.C_47si;
import net.C_47t0;
import client.module.Category;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class MLG_47CP extends client.module.Module implements net.C_47oO,net.C_47t0,net.C_47Vp,client.event.RenderListener,net.C_47si,net.C_47xz {
    private long field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47TB field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_41; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.List field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.CopyOnWriteArrayList field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

   public static String[] method_46$44c5829186() {
      return field_45;
   }



    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native int a(long a0,long a1);

    private static native void a();

   public void method_42$c07f64928a(C_476w var1, int var2, long var3) {
      long var5 = (long)var2 << 32 | var3 << 32 >>> 32;
      long var7 = var5 ^ 58388793004963L;
      int var9 = recovery$indy$1(0, var7, 1000, 1.0F, 1.0F, 2616275706256320447L, var5);
      recovery$indy$3(var1, recovery$indy$2(var9, 2616114172006973533L, var5), 2615376654488027381L, var5);
      recovery$indy$5(var1, recovery$indy$4(var9, 2614998258413491315L, var5), 2614362626512167345L, var5);
      recovery$indy$7(var1, recovery$indy$6(var9, 2616215760696116606L, var5), 2614730021969891796L, var5);
   }



   public void method_42$c77e6f55ea(C_473k var1, long var2) {
      long var4 = var2 ^ 21012890488035L;
      recovery$indy$9(
         var1, this.field_40 = this.field_40 + recovery$indy$8(C_476q.field_48, 50, 100, var4, -86735452134582885L, var2), -87880152324737772L, var2
      );
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   private static void method_41$6005286a9d(double var0, C_42D var2, int var3, int var4, int var5, int var6) {
      long var7 = a ^ 53526521889536L;
      long var9 = var7 ^ 97041047676297L;
      long var11 = var7 ^ 108941728456810L;
      GL11.glPushMatrix();
      GL11.glScaled(var0, var0, 1.0);
      long var10002 = 7473994338851615133L;
      long var13 = var11;
      C_42D var15 = var2;
      ResourceLocation var10000 = var15.method_41$79a8305e20(var13);
      long var10007 = 7474299936616766277L;
      double var16 = 1.0;
      int var18 = var6;
      int var19 = var5;
      long var20 = var9;
      int var22 = var4;
      int var23 = var3;
      ResourceLocation var24 = var10000;
      C_473M.method_42$c7ed617abf(var24, var23, var22, var20, var19, var18, var16);
      GL11.glPopMatrix();
   }



   public void method_41$426c33b229(C_477z var1, long var2) {
      MLG_47CP var10;
      label30: {
         long var4 = var2 ^ 12152692724213L;
         long var6 = var2 ^ 16648930084438L;
         this.field_438++;
         String[] var10000 = recovery$indy$10(8135023524907645871L, var2);
         this.field_47 = System.currentTimeMillis();
         String[] var8 = var10000;
         int var9 = (int) ((recovery$indy$11(var1, 8134297778592874577L, var2) instanceof EntityLivingBase) ? 1 : 0);
         if (var8 != null) {
            if (var9 != 0) {
               this.field_41 = (EntityLivingBase)recovery$indy$12(var1, 8134297778592874577L, var2);
            }

            var10 = this;
            if (var8 == null) {
               break label30;
            }

            var9 = this.field_438;
         }

         if (var9 <= 4) {
            return;
         }

         recovery$indy$13(this, var4, 8135315072439352711L, var2);
         recovery$indy$14(this, var6, 8135410669636302142L, var2);
         var10 = this;
      }

      var10.field_438 = 0;
   }



   public static void method_40$05a886777b(String[] var0) {
      field_45 = var0;
   }



    private void method_40$e45a9973e5(long n) {
        final long n2;
        n = (n2 = (MLG_47CP.a ^ n));
        final long n3 = n2 ^ 0x48C8ADD3E02FL;
        final long n4 = n2 ^ 0x69E20CB5C696L;
        final long n5 = n2 ^ 0x42DA8A464CCBL;
        final String[] array = (String[])recovery$indy$flow$37(-7925464522751469239L, n);
        final int empty = this.field_43h.isEmpty() ? 1 : 0;
        if (array != null) {
            if (empty != 0) {
                this.field_43h.addAll(this.field_43W);
            }
            int i = 0;
            final double n6 = 1.0f / new net.minecraft.client.gui.ScaledResolution(MLG_47CP.field_43).method_40$8abf5c6871();
            final int recovery$indy$flow$50 = recovery$indy$flow$50(net.C_476q.field_48, 0, this.field_43h.size() - 1, n3, -7924222890174989993L, n);
            final net.C_42D c_42D = ((net.C_42D) (this.field_43h.get(recovery$indy$flow$50)));
            this.field_43h.remove(recovery$indy$flow$50);
            final double recovery$indy$flow$51 = recovery$indy$flow$57(net.C_476q.field_48, 0.7, n5, 1.2, -7925226373599424568L, n);
            int n7;
            for (n7 = ((((String)recovery$indy$flow$58(c_42D, -7924230441335687971L, n)).contains((CharSequence)recovery$indy$flow$59(22862, 0x2F42CD368D5B8D9DL ^ n)) || ((String)recovery$indy$flow$61(c_42D, -7924230441335687971L, n)).contains((CharSequence)recovery$indy$flow$62(23955, 0x248250B270240945L ^ n))) ? 2 : recovery$indy$flow$65(net.C_476q.field_48, 5000, 7000, n3, -7924222890174989993L, n)); i < n7; i += recovery$indy$flow$66(c_42D, -7925176330348039688L, n)) {}
            final int recovery$indy$flow$52 = recovery$indy$flow$67(c_42D, -7924422492093863803L, n);
            if (n >= 0L) {
                final int n8 = (int)(recovery$indy$flow$52 * recovery$indy$flow$51);
                final int n9 = (int)(recovery$indy$flow$68(c_42D, -7924474508207218986L, n) * recovery$indy$flow$51);
                final int recovery$indy$flow$53 = recovery$indy$flow$73(net.C_476q.field_48, 0, ((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$71(MLG_47CP.field_43, -7924346041269877343L, n)).field_44 - n9, n3, -7924222890174989993L, n);
                final int n10 = ((int)recovery$indy$flow$75(net.C_476q.field_48, 0L, 120000L, n4, -7926252947933888976L, n) % 2 == 0) ? ((int)(((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$77(MLG_47CP.field_43, -7924346041269877343L, n)).field_42 - recovery$indy$flow$79(c_42D, -7924422492093863803L, n) * recovery$indy$flow$51)) : 0;
                if (!((String)recovery$indy$flow$80(c_42D, -7924230441335687971L, n)).contains((CharSequence)recovery$indy$flow$81(18300, 0x337D18193F2693A2L ^ n))) {
                    this.field_42.add(new net.C_474r(this, System.currentTimeMillis(), i, (Runnable)recovery$indy$flow$92(n6, c_42D, recovery$indy$flow$53, n10, n9, n8)));
                    return;
                }
                final java.util.concurrent.CopyOnWriteArrayList field_42 = this.field_42;
                final net.C_474r c_474r = new net.C_474r(this, System.currentTimeMillis(), i, (Runnable)recovery$indy$flow$86(n6, c_42D, recovery$indy$flow$53, n10, n9, n8));
                if (n > 0L) {
                    field_42.add(c_474r);
                    return;
                }
                field_42.add(c_474r);
            }
            else {
                while (true) {
                    final int n11 = recovery$indy$flow$52;
                    final int n12 = (n11 < n7) ? (n11 + recovery$indy$flow$66(c_42D, -7925176330348039688L, n)) : recovery$indy$flow$67(c_42D, -7924422492093863803L, n);
                }
            }
        }
        else {
            final int n13 = empty;
            new net.minecraft.client.gui.ScaledResolution(MLG_47CP.field_43).method_40$8abf5c6871();
            final int recovery$indy$flow$54 = recovery$indy$flow$50(net.C_476q.field_48, 0, this.field_43h.size() - 1, n3, -7924222890174989993L, n);
            final net.C_42D c_42D2 = ((net.C_42D) (this.field_43h.get(recovery$indy$flow$54)));
            this.field_43h.remove(recovery$indy$flow$54);
            final double recovery$indy$flow$55 = recovery$indy$flow$57(net.C_476q.field_48, 0.7, n5, 1.2, -7925226373599424568L, n);
            if (n13 < (((String)recovery$indy$flow$58(c_42D2, -7924230441335687971L, n)).contains((CharSequence)recovery$indy$flow$59(22862, 0x2F42CD368D5B8D9DL ^ n)) ? 1 : 0)) {
                final int n14 = n13 + recovery$indy$flow$66(c_42D2, -7925176330348039688L, n);
                recovery$indy$flow$73(net.C_476q.field_48, 0, ((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$71(MLG_47CP.field_43, -7924346041269877343L, n)).field_44 - (int)(recovery$indy$flow$68(c_42D2, -7924474508207218986L, n) * recovery$indy$flow$55), n3, -7924222890174989993L, n);
                final int n15 = (int)recovery$indy$flow$75(net.C_476q.field_48, 0L, 120000L, n4, -7926252947933888976L, n) % 2;
                ((String)recovery$indy$flow$80(c_42D2, -7924230441335687971L, n)).contains((CharSequence)recovery$indy$flow$81(18300, 0x337D18193F2693A2L ^ n));
                return;
            }
            final int recovery$indy$flow$56 = recovery$indy$flow$67(c_42D2, -7924422492093863803L, n);
            if (n >= 0L) {
                final int n16 = (int)(recovery$indy$flow$56 * recovery$indy$flow$55);
                recovery$indy$flow$73(net.C_476q.field_48, 0, ((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$71(MLG_47CP.field_43, -7924346041269877343L, n)).field_44 - (int)(recovery$indy$flow$68(c_42D2, -7924474508207218986L, n) * recovery$indy$flow$55), n3, -7924222890174989993L, n);
                final int n17 = (int)recovery$indy$flow$75(net.C_476q.field_48, 0L, 120000L, n4, -7926252947933888976L, n) % 2;
                ((String)recovery$indy$flow$80(c_42D2, -7924230441335687971L, n)).contains((CharSequence)recovery$indy$flow$81(18300, 0x337D18193F2693A2L ^ n));
                return;
            }
            recovery$indy$flow$73(net.C_476q.field_48, 0, ((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$71(MLG_47CP.field_43, -7924346041269877343L, n)).field_44 - (int)(recovery$indy$flow$68(c_42D2, -7924474508207218986L, n) * recovery$indy$flow$55), n3, -7924222890174989993L, n);
            final int n18 = (int)recovery$indy$flow$75(net.C_476q.field_48, 0L, 120000L, n4, -7926252947933888976L, n) % 2;
            ((String)recovery$indy$flow$80(c_42D2, -7924230441335687971L, n)).contains((CharSequence)recovery$indy$flow$81(18300, 0x337D18193F2693A2L ^ n));
        }
    }





   public void onRender2D(int var1, float var2, char var3, int var4, net.minecraft.client.gui.ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var10001 = var6 ^ 80144507935867L;
      int var8 = (int)((var6 ^ 80144507935867L) >>> 32);
      int var9 = (int)((var6 ^ 80144507935867L) << 32 >>> 56);
      int var10 = (int)(var10001 << 40 >>> 40);
      String[] var11 = (String[])recovery$indy$flow$95(1633129808971341280L, var6);
      java.util.Iterator var12 = this.field_42.iterator();

      while (true) {
         if (var12.hasNext()) {
            net.C_474r var13 = (net.C_474r)var12.next();
            recovery$indy$flow$101(var13, var8, (byte)var9, var10, 1634068799782906863L, var6);
            String[] var10000 = var11;
            if (var4 > 0) {
               if (var11 == null) {
                  break;
               }

               var10000 = var11;
            }

            if (var10000 != null) {
               continue;
            }
         }

         if (var1 > 0) {
            client.render.RenderUtils.method_41$da8c82d5d4();
         }
         break;
      }
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_41 = null;
   }



   private static void method_45$6005286a9d(double var0, C_42D var2, int var3, int var4, int var5, int var6) {
      long var7 = a ^ 124838061438208L;
      long var9 = var7 ^ 27928497771401L;
      long var11 = var7 ^ 37590696334954L;
      GL11.glPushMatrix();
      GL11.glScaled(var0, var0, 1.0);
      long var10002 = -3334713883245197411L;
      long var13 = var11;
      C_42D var15 = var2;
      ResourceLocation var10000 = var15.method_41$79a8305e20(var13);
      long var10007 = -3334267818708767419L;
      double var16 = 1.0;
      int var18 = var6;
      int var19 = var5;
      long var20 = var9;
      int var22 = var4;
      int var23 = var3;
      ResourceLocation var24 = var10000;
      C_473M.method_42$c7ed617abf(var24, var23, var22, var20, var19, var18, var16);
      GL11.glPopMatrix();
   }



   private void method_45$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 108545594639936L;
      long var5 = var1 ^ 84530470680460L;
      int var7 = recovery$indy$37(C_476q.field_48, 0, this.field_44.size() - 1, var5, 406596573383306996L, var1);
      recovery$indy$38(var3, (ResourceLocation)this.field_44.get(var7), 407839970911373463L, var1);
   }



   static CopyOnWriteArrayList method_47$3be28455f4(MLG_47CP var0) {
      return var0.field_42;
   }



   public void method_43$3aa2b8ed81(long var1, C_476w var3) {
      long var10001 = var1 ^ 80653050503280L;
      int var4 = (int)((var1 ^ 80653050503280L) >>> 32);
      int var5 = (int)((var1 ^ 80653050503280L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var1 ^ 80145606932520L;
      int var9 = (int)((var1 ^ 54456499854721L) >>> 48);
      long var10 = (var1 ^ 54456499854721L) << 16 >>> 16;
      String[] var12 = recovery$indy$39(5747468942913684617L, var1);
      int var10000 = (int) ((recovery$indy$40(this.field_49, var4, (char)var5, (char)var6, 5747105941423856539L, var1)) ? 1 : 0);
      if (var12 != null) {
         if (var10000 == 0) {
            recovery$indy$41(this, (short)var9, var10, 5747355809142784066L, var1);
         }

         var10000 = recovery$indy$42(0, var7, 1000, 1.0F, 1.0F, 5748173235490262068L, var1);
      }

      int var13 = var10000;
      recovery$indy$44(var3, recovery$indy$43(var13, 5748053294815456214L, var1), 5746824894745783166L, var1);
      recovery$indy$46(var3, recovery$indy$45(var13, 5746921815153459192L, var1), 5747553049622792762L, var1);
      recovery$indy$48(var3, recovery$indy$47(var13, 5748237587663318773L, var1), 5747190052337416799L, var1);
   }



   private void method_43$a6cfe74df2(short var1, long var2) {
      label24: {
         long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
         long var10001 = var4 ^ 3491518889134L;
         int var6 = (int)((var4 ^ 3491518889134L) >>> 48);
         int var7 = (int)((var4 ^ 3491518889134L) << 16 >>> 32);
         int var8 = (int)(var10001 << 48 >>> 48);
         String[] var9 = recovery$indy$49(-5264053872974807624L, var4);
         MLG_47CP var10000 = this;
         if (var9 != null) {
            if (this.field_43y > 3) {
               this.field_43y = 1;
            }

            try {
               var10000 = this;
            } catch (Exception var12) {
               break label24;
            }
         }

         try {
            recovery$indy$52(
               var10000.field_49,
               (short)var6,
               var7,
               (char)var8,
               recovery$indy$50(19533, 6181019548564667488L ^ var4) + this.field_43y + recovery$indy$51(985, 4952824459545244658L ^ var4),
               true,
               -5262701288306751334L,
               var4
            );
         } catch (Exception var11) {
         }
      }

      this.field_43y++;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$53(this, 44, 100, var3, -7102043960510657891L, var1);
      recovery$indy$54(this, 45, 100, var3, -7102043960510657891L, var1);
      recovery$indy$55(this, 32, 100, var3, -7102043960510657891L, var1);
      recovery$indy$56(this, 1, var5, -7100258459113976080L, var1);
      recovery$indy$57(this, 40, var5, -7100258459113976080L, var1);
      recovery$indy$58(this, 17, var5, -7100258459113976080L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 99847616093611L;
      String[] var8 = recovery$indy$59(2182878435437876481L, var4);
      MLG_47CP var10000 = this;
      if (var8 != null) {
         label33:
         if (this.field_41 != null) {
            long var10;
            int var9 = (var10 = System.currentTimeMillis() - this.field_47 - 5000L) == 0L ? 0 : (var10 < 0L ? -1 : 1);
            if (var8 != null) {
               if (var9 >= 0) {
                  break label33;
               }

               var9 = this.field_41.field_432;
            }

            if (var9 != 10) {
               return;
            }

            recovery$indy$60(var6, C_47rL.field_40, 2180806812239713148L, var4);
            if (var8 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.field_41 = null;
   }



   public void method_43y$e45a9973e5(long var1) {
      int var3 = (int)((var1 ^ 99567168021191L) >>> 48);
      long var4 = (var1 ^ 99567168021191L) << 16 >>> 16;
      recovery$indy$61(this.field_49, (char)var3, var4, -7740399220635578186L, var1);
      this.field_41 = null;
      this.field_42.clear();
      this.field_43h.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      int var6 = (int)((var4 ^ 93700255594401L) >>> 48);
      long var7 = (var4 ^ 93700255594401L) << 16 >>> 16;
      recovery$indy$62(this, (short)var6, var7, 2729974221787408994L, var4);
   }



    public MLG_47CP(long a0) {
        super((java.lang.String) ("MLG"),(java.lang.String) ("MLG"),(long) (((augustus.recovered.modules.fun.MLG_47CP.a ^ a0) ^ 71273449510909L)),(java.awt.Color) (new java.awt.Color((int) (50),(int) (168),(int) (82))),(client.module.Category) (client.module.Category.FUN));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.fun.MLG_47CP.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.fun.MLG_47CP.a ^ a0) ^ 98146987116164L);
        recovery$indy$flow$174(this, 1);
        java.lang.Object initialValue4 = recovery$indy$flow$175();
        net.C_47TB initialized5 = new net.C_47TB();
        recovery$indy$flow$178(this, initialized5);
        recovery$indy$flow$179(this, 10);
        java.util.ArrayList initialized6 = new java.util.ArrayList();
        recovery$indy$flow$182(this, initialized6);
        java.util.ArrayList initialized7 = new java.util.ArrayList();
        recovery$indy$flow$185(this, initialized7);
        java.util.ArrayList initialized8 = new java.util.ArrayList();
        recovery$indy$flow$188(this, initialized8);
        java.lang.Object initialValue9 = initialValue4;
        java.util.concurrent.CopyOnWriteArrayList initialized10 = new java.util.concurrent.CopyOnWriteArrayList();
        recovery$indy$flow$191(this, initialized10);
        java.lang.Object initialValue11 = recovery$indy$flow$192("sounds/mlg/randomsounds");
        java.lang.Object initialValue12 = initialValue11;
        java.lang.Object initialValue13 = recovery$indy$flow$193(initialValue12);
        java.lang.Object initialValue14 = initialValue13;
    
        String selectedGifPath = null;
        boolean useSelectedGifPath = false;
        while (recovery$indy$flow$194(initialValue14)) {
            String soundFile = (String) ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(recovery$indy$flow$195(initialValue14)))))));
            if (constructorKey2 <= 0L || initialValue9 == null) {
                selectedGifPath = soundFile;
                useSelectedGifPath = true;
                break;
            }
            if (recovery$indy$flow$197(soundFile) < 4) continue;
            Object locationBuilder = recovery$indy$flow$201(new StringBuilder(), "sounds/mlg/randomsounds/");
            locationBuilder = recovery$indy$flow$202(locationBuilder, soundFile);
            net.minecraft.util.ResourceLocation sound = new net.minecraft.util.ResourceLocation("augustus", (String) recovery$indy$flow$203(locationBuilder));
            Object game = recovery$indy$flow$205();
            Object soundManager = recovery$indy$flow$207(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(game)))))));
            Object aliasBuilder = recovery$indy$flow$210(new StringBuilder(), "mlg/randomsounds/");
            Object shortName = recovery$indy$flow$212(soundFile, 0, recovery$indy$flow$211(soundFile) - 4);
            aliasBuilder = recovery$indy$flow$213(aliasBuilder, shortName);
            recovery$indy$flow$215(soundManager, sound, recovery$indy$flow$214(aliasBuilder));
            recovery$indy$flow$217(((java.lang.Object)(((augustus.recovered.modules.fun.MLG_47CP) (((java.lang.Object)(this)))).field_44)), sound);
        }
        Object gifPath = useSelectedGifPath ? selectedGifPath : recovery$indy$flow$218(19613, 2949300602442798087L ^ constructorKey2);
        Object gifFiles = recovery$indy$flow$219(gifPath);
        Object gifIterator = recovery$indy$flow$220(gifFiles);
        while (recovery$indy$flow$221(gifIterator)) {
            Object gifFile = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(recovery$indy$flow$222(gifIterator)))))));
            Object gifList = ((java.lang.Object)(((augustus.recovered.modules.fun.MLG_47CP) (((java.lang.Object)(this)))).field_43W));
            Object gifBuilder = recovery$indy$flow$228(new StringBuilder(), "gifs/mlg/");
            gifBuilder = recovery$indy$flow$229(gifBuilder, gifFile);
            net.C_42D clip = new net.C_42D((String) recovery$indy$flow$230(gifBuilder), constructorKey3, 60);
            recovery$indy$flow$232(gifList, clip);
            if (constructorKey2 >= 0L && initialValue9 == null) return;
            if (initialValue9 == null) break;
        }
        if (constructorKey2 <= 0L) {
            // The original nonpositive-key exit re-enters a String cast with this.
            // Keep that invalid-input failure rather than silently changing it.
            String invalidGifName = (String) (Object) this;
            throw new AssertionError(invalidGifName);
        }
        recovery$indy$flow$234(((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), false);
    }




    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$37(long a0,long a1);
    private static native int recovery$indy$flow$50(java.lang.Object a0,int a1,int a2,long a3,long a4,long a5);
    private static native double recovery$indy$flow$57(java.lang.Object a0,double a1,long a2,double a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$58(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$59(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$61(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$62(int a0,long a1);
    private static native int recovery$indy$flow$65(java.lang.Object a0,int a1,int a2,long a3,long a4,long a5);
    private static native int recovery$indy$flow$66(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$67(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$68(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$71(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$73(java.lang.Object a0,int a1,int a2,long a3,long a4,long a5);
    private static native long recovery$indy$flow$75(java.lang.Object a0,long a1,long a2,long a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$77(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$79(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$80(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$81(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$86(double a0,java.lang.Object a1,int a2,int a3,int a4,int a5);
    private static native java.lang.Object recovery$indy$flow$92(double a0,java.lang.Object a1,int a2,int a3,int a4,int a5);
    private static native java.lang.Object recovery$indy$flow$95(long a0,long a1);
    private static native void recovery$indy$flow$101(java.lang.Object a0,int a1,byte a2,int a3,long a4,long a5);
    private static void recovery$indy$flow$174(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.fun.MLG_47CP) (a0)).field_43y = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$175();
    private static void recovery$indy$flow$178(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.fun.MLG_47CP) (a0)).field_49 = ((net.C_47TB) (a1));
        return;
    }
    private static void recovery$indy$flow$179(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.fun.MLG_47CP) (a0)).field_438 = a1;
        return;
    }
    private static native void recovery$indy$flow$182(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$185(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$188(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$191(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$192(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$193(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$194(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$195(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static int recovery$indy$flow$197(java.lang.Object a0) {
        return ((java.lang.String) (a0)).length();
    }
    private static java.lang.Object recovery$indy$flow$201(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$202(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$203(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native java.lang.Object recovery$indy$flow$205();

    private static native java.lang.Object recovery$indy$flow$207(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$210(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static int recovery$indy$flow$211(java.lang.Object a0) {
        return ((java.lang.String) (a0)).length();
    }
    private static java.lang.Object recovery$indy$flow$212(java.lang.Object a0,int a1,int a2) {
        return ((java.lang.String) (a0)).substring(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$213(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$214(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native void recovery$indy$flow$215(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2);

    private static boolean recovery$indy$flow$217(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.List) (a0)).add(a1);
    }
    private static native java.lang.Object recovery$indy$flow$218(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$219(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$220(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$221(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$222(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }


    private static java.lang.Object recovery$indy$flow$228(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$229(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$230(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static boolean recovery$indy$flow$232(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static native void recovery$indy$flow$234(java.lang.Object a0,boolean a1);
   private static native MethodHandle recovery$constant$0();
   private static native int recovery$indy$1(int var0, long var1, int var3, float var4, float var5, long var6, long var8);
   private static native int recovery$indy$2(int var0, long var1, long var3);
   private static native void recovery$indy$3(Object var0, float var1, long var2, long var4);
   private static native int recovery$indy$4(int var0, long var1, long var3);
   private static native void recovery$indy$5(Object var0, float var1, long var2, long var4);
   private static native int recovery$indy$6(int var0, long var1, long var3);
   private static native void recovery$indy$7(Object var0, float var1, long var2, long var4);
   private static native int recovery$indy$8(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$9(Object var0, long var1, long var3, long var5);
   private static native String[] recovery$indy$10(long var0, long var2);
   private static native Entity recovery$indy$11(Object var0, long var1, long var3);
   private static native Entity recovery$indy$12(Object var0, long var1, long var3);
   private static native void recovery$indy$13(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$14(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$37(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$38(long var0, Object var2, long var3, long var5);
   private static native String[] recovery$indy$39(long var0, long var2);
   private static native boolean recovery$indy$40(Object var0, int var1, char var2, char var3, long var4, long var6);
   private static native void recovery$indy$41(Object var0, short var1, long var2, long var4, long var6);
   private static native int recovery$indy$42(int var0, long var1, int var3, float var4, float var5, long var6, long var8);
   private static native int recovery$indy$43(int var0, long var1, long var3);
   private static native void recovery$indy$44(Object var0, float var1, long var2, long var4);
   private static native int recovery$indy$45(int var0, long var1, long var3);
   private static native void recovery$indy$46(Object var0, float var1, long var2, long var4);
   private static native int recovery$indy$47(int var0, long var1, long var3);
   private static native void recovery$indy$48(Object var0, float var1, long var2, long var4);
   private static native String[] recovery$indy$49(long var0, long var2);
   private static native String recovery$indy$50(int var0, long var1);
   private static native String recovery$indy$51(int var0, long var1);
   private static native void recovery$indy$52(Object var0, short var1, int var2, char var3, Object var4, boolean var5, long var6, long var8);
   private static native void recovery$indy$53(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$54(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$55(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$56(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$57(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$58(Object var0, int var1, long var2, long var4, long var6);
   private static native String[] recovery$indy$59(long var0, long var2);
   private static native void recovery$indy$60(long var0, Object var2, long var3, long var5);
   private static native void recovery$indy$61(Object var0, char var1, long var2, long var4, long var6);
   private static native void recovery$indy$62(Object var0, short var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$64();
}
