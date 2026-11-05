package augustus.recovered.modules.misc;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_425;
import net.C_42R;
import net.C_43K;
import net.C_43r;
import net.C_45n;
import net.C_4747;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47F9;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.Setting;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47oO;
import net.C_47rL;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class MurdererFinder_47kg extends client.module.Module implements net.C_47xz,net.C_47oO {
    private final client.setting.BooleanSetting settingAcousticWarning = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingVolume = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final java.util.HashSet field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    public static java.util.ArrayList field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private static client.setting.Setting[] field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public boolean method_48$228bb405f3(String var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 123099021423334L;
      int[] var6 = recovery$indy$1(-4846818038173318610L, var2);
      boolean var10000 = recovery$indy$2(this, var4, -4846084214911510221L, var2);
      if (var6 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.field_46.contains(var1);
      }

      return var6 != null ? var10000 : var10000;
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_46.clear();
   }



   public static Setting[] method_47$19d51fe81e() {
      return field_47;
   }



   public static void method_47$5994d1a418(Setting[] var0) {
      field_47 = var0;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$3(this, 40, var3, -7099805443817529799L, var1);
      recovery$indy$4(this, 17, var3, -7099805443817529799L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      boolean var13;
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 113186446332478L;
      int[] var8 = recovery$indy$5(2180294663714889939L, var4);
      Iterator var9 = recovery$indy$6(field_43, 2179897706561804027L, var4).field_44Q.iterator();

      MurdererFinder_47kg var14;
      label110: {
         while (true) {
            if (var9.hasNext()) {
               Entity var10 = (Entity)var9.next();
               if (var3 <= 0) {
                  return;
               }

               Entity var10000 = var10;
               if (var8 == null) {
                  var13 = var10 instanceof EntityPlayer;
                  if (var8 != null) {
                     break;
                  }

                  if (!var13) {
                     continue;
                  }

                  var10000 = var10;
               }

               EntityPlayer var11 = (EntityPlayer)var10000;
               if (var11.method_41$ac4db64966() == null || this.field_46.contains(var11.method_41$0e30dfc966())) {
                  continue;
               }

               if (var11.method_41$ac4db64966() != null && !this.field_46.contains(var11.method_41$0e30dfc966())) {
                  C_43r var12 = var11.method_41$ac4db64966().method_48$dbd570a038();
                  if (var8 == null && (field_49.contains(var12) || var8 == null && var12 instanceof C_43K)) {
                     this.field_46.add(var11.method_41$0e30dfc966());
                  }
               }

               if (var8 == null) {
                  continue;
               }
            }

            var14 = this;
            if (var8 != null) {
               break label110;
            }

            var13 = this.field_46.isEmpty();
            break;
         }

         if (!var13) {
            var14 = this;
            if (var8 != null) {
               break label110;
            }

            if (this.field_43a) {
               var14 = this;
               if (var8 != null) {
                  break label110;
               }

               if (recovery$indy$7(this.settingAcousticWarning, 2179801926682138121L, var4)) {
                  recovery$indy$8(field_43, 2180089104546482726L, var4)
                     .method_48$38ea80174b(
                        C_4747.method_42$1e753247d3(C_47rL.field_48o, (float)(recovery$indy$9(this.settingVolume, var6, 2179975012578481777L, var4) / 100.0))
                     );
               }
            }
         }

         var14 = this;
      }

      var14.field_43a = this.field_46.isEmpty();
   }




   public void method_43y$e45a9973e5(long var1) {
      this.field_46.clear();
      this.field_43a = true;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_46.clear();
      this.field_43a = true;
   }



    public MurdererFinder_47kg(long a0) {
        super((java.lang.String) ("MurdererFinder"),(java.lang.String) ("M\u00f6rderFinder"),(long) (((augustus.recovered.modules.misc.MurdererFinder_47kg.a ^ a0) ^ 33142305713424L)),(java.awt.Color) (new java.awt.Color((int) (252),(int) (186),(int) (3))),(client.module.Category) (client.module.Category.MISC));
        long settingKey = ((augustus.recovered.modules.misc.MurdererFinder_47kg.a ^ a0) ^ 122045941494027L);
        long volumeKey = ((augustus.recovered.modules.misc.MurdererFinder_47kg.a ^ a0) ^ 72946724966028L);
        client.setting.BooleanSetting warning = new client.setting.BooleanSetting(this, settingKey, "AcousticWarning", true);
        recovery$indy$flow$60(this, warning);
        client.setting.NumberSetting volume = new client.setting.NumberSetting(this, "Volume", 93.0D, volumeKey, 0.0D, 100.0D, 0);
        Object acousticWarning = ((java.lang.Object)(((augustus.recovered.modules.misc.MurdererFinder_47kg) (((java.lang.Object)(this)))).settingAcousticWarning));
        recovery$indy$flow$64(acousticWarning);
        Object visible = recovery$indy$flow$65(acousticWarning);
        Object visibleVolume = recovery$indy$flow$68(((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(volume)))))), ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(visible)))))));
        recovery$indy$flow$69(this, visibleVolume);
        recovery$indy$flow$72(this, new java.util.HashSet());
        recovery$indy$flow$73(this, true);
    }



    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native void recovery$indy$flow$60(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$64(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$65(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$68(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$69(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$72(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$73(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.MurdererFinder_47kg) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$3(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$4(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$5(long var0, long var2);
   private static native WorldClient recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3);
   private static native C_425 recovery$indy$8(Object var0, long var1, long var3);
   private static native double recovery$indy$9(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$11();
}
