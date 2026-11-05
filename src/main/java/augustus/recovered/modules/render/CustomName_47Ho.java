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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_45n;
import net.C_477A;
import net.C_47F9;
import client.module.Module;
import client.setting.ModeSetting;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import client.module.Category;
import net.C_4f;

public class CustomName_47Ho extends Module implements C_47oO {
   public final ModeSetting settingModes;
   public final ModeSetting settingNameFormatting;
   public final ModeSetting settingCusom;
   public final String field_44;
   public String field_40;
   private static final long a = C_4f.a(-8981064204762688665L, 3763592913379162656L, MethodHandles.lookup().lookupClass()).a(254962113311446L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[24];
   private static final String[] f = new String[24];

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

   public void method_41$da8c82d5d4() {
      long var3;
      long var5;
      int[] var7;
      int var21;
      long var1 = a ^ 139927937122902L;
      var3 = var1 ^ 42237060924216L;
      var5 = var1 ^ 98292825722960L;
      long var10002 = -8734199353193641813L;
      long var10 = var3;
      ModeSetting var12 = this.settingModes;
      String var8 = var12.method_46$5f9dc63072(var10);
      long var10000 = -8734561025591112704L;
      int[] var20 = AntiStrike_47Qa.method_42$d4d28024c9();
      byte var9 = -1;
      var7 = var20;
      var21 = var8.hashCode();
      label79:
      if (var7 == null) {
         switch (var21) {
            case 2114874924:
               var21 = (int) ((var8.equals("AugustusName")) ? 1 : 0);
               if (var7 != null) {
                  break label79;
               }

               if (var21 == 0) {
                  break;
               }

               var9 = 0;
               if (var7 == null) {
                  break;
               }
            case -186456606:
               var21 = (int) ((var8.equals("IngameName")) ? 1 : 0);
               if (var7 != null) {
                  break label79;
               }

               if (var21 == 0) {
                  break;
               }

               var9 = 1;
               if (var7 == null) {
                  break;
               }
            case -1940338914:
               var21 = (int) ((var8.equals("PCName")) ? 1 : 0);
               if (var7 != null) {
                  break label79;
               }

               if (var21 == 0) {
                  break;
               }

               var9 = 2;
               if (var7 == null) {
                  break;
               }
            case 2029746065:
               var21 = (int) ((var8.equals("Custom")) ? 1 : 0);
               if (var7 != null) {
                  break label79;
               }

               if (var21 != 0) {
                  var9 = 3;
               }
         }

         var21 = var9;
      }

      switch (var21) {
         case 0:
            long var10001 = -8734390091845127053L;
            Client var22 = Client.method_44$fbc0c0be91();
            long var10003 = -8734374474381586818L;
            long var13 = var5;
            Client var15 = var22;
            this.field_40 = var15.method_43$5f9dc63072(var13);
            if (var7 == null) {
               break;
            }
         case 1:
            var10002 = -8734279840605331018L;
            Minecraft var16 = field_43;
            this.field_40 = var16.method_41$557fdc188b().method_47$0e30dfc966();
            if (var7 == null) {
               break;
            }
         case 2:
            this.field_40 = this.field_44;
            if (var7 == null) {
               break;
            }
         case 3:
            long var24 = -8734199353193641813L;
            long var17 = var3;
            ModeSetting var19 = this.settingCusom;
            this.field_40 = var19.method_46$5f9dc63072(var17);
      }
   }

   private static boolean method_48$aae029aa0a() {
      return false;
   }

   @Override
   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      recovery$indy$1(this, 3260636072009719790L, var5);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$2(this, 17, var3, -7099496346381302347L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public CustomName_47Ho(long var1) {
      super("CustomName", "KundenspezifischerName", ((a ^ var1) ^ 13588897528242L), new Color(63, 21, 21), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 79095983507839L;
      long var5 = var1 ^ 13588897528242L;
      // Super arguments moved to the required Java constructor position.
      ModeSetting var10001 = new ModeSetting(this, "Modes", var3, "AugustusName", new String[]{"AugustusName", "IngameName", "PCName", "Custom"});
      C_477A var10002 = recovery$indy$3(this);
      long var10003 = -1149649509184177154L;
      C_477A var7 = var10002;
      ModeSetting var8 = var10001;
      this.settingModes = var8.method_42$977b7ac128(var7);
      var10001 = new ModeSetting(this, "Name-Formatting", var3, "Xanax", new String[]{"Xanax", "Xanax2", "Centaurus", "Centaurus2", "Skid", "Simple"});
      var10002 = recovery$indy$4(this);
      var10003 = -1149649509184177154L;
      C_477A var9 = var10002;
      ModeSetting var10 = var10001;
      this.settingNameFormatting = var10.method_42$977b7ac128(var9);
      var10001 = new ModeSetting(this, "Cusom", var3, "CustomName", new String[]{""});
      C_45n var17 = recovery$indy$5();
      var10003 = -1149453170220093031L;
      C_45n var11 = var17;
      ModeSetting var12 = var10001;
      this.settingCusom = var12.method_44$d3b0c78647(var11);
      this.field_44 = System.getProperty("user.name");
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, long var1, long var3);

   private static native void recovery$indy$2(Object var0, int var1, long var2, long var4, long var6);

   private static native C_477A recovery$indy$3(CustomName_47Ho var0);

   private static native C_477A recovery$indy$4(CustomName_47Ho var0);

   private static native C_45n recovery$indy$5();

   private static native MethodHandle recovery$constant$6();
}
