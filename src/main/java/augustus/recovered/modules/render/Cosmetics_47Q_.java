package augustus.recovered.modules.render;
import com.mojang.authlib.GameProfile;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_471M;
import net.C_472F;
import net.C_472J;
import net.C_476c;
import net.C_47;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.player.EntityPlayer;
import client.module.Module;
import net.C_47Pe;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import net.C_47UE;
import net.C_47Ua;
import net.C_47Wh;
import net.C_47cq;
import net.C_47cu;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47mH;
import net.minecraft.client.Minecraft;
import client.module.Category;
import net.C_47xz;
import net.C_4f;
import net.labymod.ModelData;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Cosmetics_47Q_ extends client.module.Module implements net.C_47xz {
    private final java.util.HashMap field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private static boolean field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

   public void method_46$da8c82d5d4() {
      this.field_47.forEach(recovery$indy$1(this));
      this.field_47.clear();
   }



   private void method_46$fcaf703eae(Collection var1, AbstractClientPlayer var2, long var3, boolean var5) {
      net.C_471M var40;
      var3 = a ^ var3;
      long var6 = var3 ^ 7135362397660L;
      long var8 = var3 ^ 41121171989448L;
      long var10 = var3 ^ 7344530718208L;
      long var12 = var3 ^ 40998772216206L;
      long var10000 = -8056114871566807736L;
      int[] var14 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var2 != null) {
         Collection var38 = var1;
         if (var14 == null) {
            if (var1 == null) {
               return;
            }

            var38 = var1;
         }

         for (Object recovered$element$3388 : var38) {
         C_472F var16 = (C_472F) recovered$element$3388;
            boolean var42;
            label44: {
               label60: {
                  long var10001 = -8059140153598471977L;
                  C_472J var39 = C_472J.method_44$832346ff7a(var8);
                  long var41 = -8055911739358122109L;
                  C_472J var17 = var39;
                  var40 = var17.method_44$7c71d51fed();
                  var42 = var5;
                  int[] var10002 = var14;
                  if (var3 > 0L) {
                     if (var14 == null) {
                        if (var5) {
                           break label60;
                        }

                        long var44 = -8061413902732965263L;
                        C_472F var18 = var16;
                        BooleanSetting var43 = var18.method_45$c0981bb43f();
                        long var45 = -8057982110625296251L;
                        BooleanSetting var19 = var43;
                        var42 = var19.method_49$aae029aa0a();
                     }

                     var10002 = var14;
                  }

                  if (var10002 != null) {
                     break label44;
                  }

                  if (var42) {
                     var42 = true;
                     break label44;
                  }
               }

               var42 = false;
            }

            long var10003 = -8055854148046872870L;
            C_472F var20 = var16;
            C_47Wh var46 = var20.method_49$548c2d20e7();
            long var10006 = -8057464602131401467L;
            long var21 = var6;
            C_472F var23 = var16;
            float var10004 = (float)var23.method_47$474dfaa627(var21);
            long var10007 = -8055529856868114413L;
            long var24 = var12;
            C_472F var26 = var16;
            float var10005 = (float)var26.method_46$474dfaa627(var24);
            var10007 = -8054941598992481804L;
            C_472F var27 = var16;
            ColorSetting[] var47 = var27.method_47$c544bfc1d8();
            long var10008 = -8061269853587851970L;
            long var28 = var10;
            ColorSetting[] var30 = var47;
            float var31 = var10005;
            float var32 = var10004;
            AbstractClientPlayer var33 = var2;
            C_47Wh var34 = var46;
            boolean var35 = var42;
            C_471M var36 = var40;
            var36.method_46$b35b176b64(var35, var34, var33, var32, var31, var30, var28);
            if (var14 != null) {
               break;
            }
         }
      }
   }




    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

   private void method_42$82b25a7bd2(Collection var1, long var2, AbstractClientPlayer var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 115835278751717L;
      recovery$indy$2(this, var1, var4, var5, false, 8469899708275055277L, var2);
   }



   private void method_42$ea672e4935(String var1, C_47Pe var2) {
      long var3 = a ^ 75018758057288L;
      long var5 = var3 ^ 73636391000843L;
      long var7 = var3 ^ 98214664568176L;
      long var10000 = 9152928909379248767L;
      int[] var9 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var2 != null) {
         Object var23 = var1;
         if (var9 == null) {
            if (var1 == null) {
               return;
            }

            long var10001 = 9158417064168748488L;
            C_47Pe var12 = var2;
            var23 = var12.method_42$0502b11602();
         }

         HashMap var10 = (HashMap)var23;
         long var10003 = 9158154102305120552L;
         long var13 = var5;
         String var15 = var1;
         Cosmetics_47Q_ var16 = this;
         EntityPlayer var11 = var16.method_49$f1cca08486(var15, var13);
         if (var11 instanceof AbstractClientPlayer) {
            Collection var24 = var10.values();
            AbstractClientPlayer var10002 = (AbstractClientPlayer)var11;
            long var10005 = 9159777253364486200L;
            boolean var17 = true;
            long var18 = var7;
            AbstractClientPlayer var20 = var10002;
            Collection var21 = var24;
            Cosmetics_47Q_ var22 = this;
            var22.method_46$fcaf703eae(var21, var20, var18, var17);
         }
      }
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_41$5c6fbd82aa(long var1, HashMap var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 95394107990023L;
      recovery$indy$5(recovery$indy$4(recovery$indy$3(var4, 6045903409584788248L, var1), 6044298389230011260L, var1), 6051575565237015991L, var1)
         .forEach(recovery$indy$6(var3));
   }



   private static void method_40$70de8b43f9(net.C_476c var0, java.util.concurrent.atomic.AtomicInteger var1, String var2, net.C_472F var3) {
        client.setting.BooleanSetting var92;
      long var4 = a ^ 111342953258454L;
      long var6 = var4 ^ 132898393034033L;
      long var8 = var4 ^ 34358580112224L;
      long var10 = var4 ^ 106401070879528L;
      int[] var12 = AntiStrike_47Qa.method_42$d4d28024c9();
      net.C_476c var24 = var0;
      Boolean var13 = (Boolean)var24.method_43$43b9f1ea53().get(var2);
      if (var13 != null) {
         int var14 = 0;
         boolean var10000 = var13;
         if (var12 == null) {
            if (var10000) {
               var14 = var1.incrementAndGet();
            }

            boolean var10001;
            label90: {
               net.C_472F var71 = var3;
               var92 = var71.method_45$c0981bb43f();
               if (var13) {
                  net.C_476c var26 = var0;
                  if (var14 < var26.method_43$8abf5c6871()) {
                     var10001 = true;
                     break label90;
                  }
               }

               var10001 = false;
            }

            boolean var72 = var10001;
            client.setting.BooleanSetting var73 = var92;
            var73.method_45$f633c984d8(var72);
            if (var13) {
               net.C_476c var29 = var0;
               Float var62 = (Float)var29.method_49$43b9f1ea53().get(var2);
               if (var62 != null && !Float.isNaN(var62)) {
                  double var93 = var62.floatValue();
                  long var30 = var10;
                  double var32 = var93;
                  net.C_472F var34 = var3;
                  var34.method_45$e19a0205c8(var32, var30);
               }

               net.C_476c var35 = var0;
               Float var63 = (Float)var35.method_44$43b9f1ea53().get(var2);
               if (var63 != null && !Float.isNaN(var63)) {
                  double var36 = var63.floatValue();
                  long var38 = var6;
                  net.C_472F var40 = var3;
                  var40.method_48$b7da0951ad(var38, var36);
               }

               net.C_476c var41 = var0;
               int[] var64 = (int[])var41.method_46$43b9f1ea53().get(var2);
               net.C_476c var74 = var0;
               boolean[] var65 = (boolean[])var74.method_48$43b9f1ea53().get(var2);
               net.C_476c var75 = var0;
               boolean[] var66 = (boolean[])var75.method_47$43b9f1ea53().get(var2);
               net.C_476c var76 = var0;
               double[] var67 = (double[])var76.method_40$43b9f1ea53().get(var2);
               net.C_476c var77 = var0;
               double[] var68 = (double[])var77.method_41$43b9f1ea53().get(var2);
               int var69 = 0;

               while (true) {
                  net.C_472F var78 = var3;
                  if (var69 >= var78.method_47$c544bfc1d8().length) {
                     break;
                  }

                  net.C_472F var79 = var3;
                  client.setting.ColorSetting var70 = var79.method_47$c544bfc1d8()[var69];
                  java.awt.Color var80 = new java.awt.Color(var64[var69], true);
                  long var81 = var8;
                  client.setting.ColorSetting var82 = var70;
                  var82.method_40$41332f254f(var81, var80);
                  double var83 = var67[var69];
                  client.setting.ColorSetting var84 = var70;
                  var84.method_44$2c20cf5948(var83);
                  double var85 = var68[var69];
                  client.setting.ColorSetting var86 = var70;
                  var86.method_45$2c20cf5948(var85);
                  boolean var87 = var65[var69];
                  client.setting.ColorSetting var88 = var70;
                  var88.method_47$f633c984d8(var87);
                  boolean var89 = var66[var69];
                  client.setting.ColorSetting var90 = var70;
                  var90.method_44$f633c984d8(var89);
                  var69++;
               }
            }
         } else {
            net.C_472F var25 = var3;
            client.setting.BooleanSetting var91 = var25.method_45$c0981bb43f();
            boolean var27 = var13;
            client.setting.BooleanSetting var28 = var91;
            var28.method_45$f633c984d8(var27);
            Float var15 = (Float)(Object) (var13);
            Float var16 = var15;
            int[] var17 = (int[])(Object) (var16);
            net.C_476c var42 = var0;
            boolean[] var18 = (boolean[])var42.method_48$43b9f1ea53().get(var2);
            net.C_476c var43 = var0;
            boolean[] var19 = (boolean[])var43.method_47$43b9f1ea53().get(var2);
            net.C_476c var44 = var0;
            double[] var20 = (double[])var44.method_40$43b9f1ea53().get(var2);
            net.C_476c var45 = var0;
            double[] var21 = (double[])var45.method_41$43b9f1ea53().get(var2);
            byte var22 = ((byte) (0));
            net.C_472F var46 = var3;
            if (var22 < var46.method_47$c544bfc1d8().length) {
               net.C_472F var47 = var3;
               client.setting.ColorSetting var23 = var47.method_47$c544bfc1d8()[var22];
               java.awt.Color var48 = new java.awt.Color(var17[var22], true);
               long var49 = var8;
               client.setting.ColorSetting var51 = var23;
               var51.method_40$41332f254f(var49, var48);
               double var52 = var20[var22];
               client.setting.ColorSetting var54 = var23;
               var54.method_44$2c20cf5948(var52);
               double var55 = var21[var22];
               client.setting.ColorSetting var57 = var23;
               var57.method_45$2c20cf5948(var55);
               boolean var58 = var18[var22];
               client.setting.ColorSetting var59 = var23;
               var59.method_47$f633c984d8(var58);
               boolean var60 = var19[var22];
               client.setting.ColorSetting var61 = var23;
               var61.method_44$f633c984d8(var60);
            }
         }
      }
   }






   private void method_44$d19d36dc9e(String var1, net.C_47Wh var2) {
      long var3 = a ^ 125793483365108L;
      long var10001 = var3 ^ 40545155048419L;
      int var5 = (int)((var3 ^ 40545155048419L) >>> 48);
      int var6 = (int)((var3 ^ 40545155048419L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      long var8 = var3 ^ 100177477322799L;
      long var10 = var3 ^ 40074258285720L;
      long var12 = var3 ^ 7752934526108L;
      long var14 = var3 ^ 98291135233895L;
      long var16 = var3 ^ 71846986873667L;
      long var18 = var3 ^ 111169563474339L;
      client.setting.SettingGroup var10000 = new client.setting.SettingGroup(this, "Group" + var1, true, var10);
      long var29 = var14;
      String var31 = var1;
      client.setting.SettingGroup var32 = var10000;
      client.setting.SettingGroup var21 = (client.setting.SettingGroup)var32.method_40$56e823faec(var31, var29);
      int[] var49 = AntiStrike_47Qa.method_42$d4d28024c9();
      client.setting.BooleanSetting var22 = new client.setting.BooleanSetting(this, var1, (short)var5, (char)var6, var7, false, var21);
      client.setting.NumberSetting var50 = new client.setting.NumberSetting(this, var1 + "Scale", 1.0, 0.5, 2.0, 2, var21, var18);
      var22.getClass();
      net.C_45n var33 = (net.C_45n)recovery$indy$flow$148(var22);
      client.setting.NumberSetting var34 = var50;
      client.setting.NumberSetting var23 = var34.method_43$9db6d416f4(var33);
      client.setting.NumberSetting var51 = new client.setting.NumberSetting(this, var1 + "Height", 0.0, -2.0, 2.0, 2, var21, var18);
      var22.getClass();
      net.C_45n var35 = (net.C_45n)recovery$indy$flow$160(var22);
      client.setting.NumberSetting var36 = var51;
      client.setting.NumberSetting var24 = var36.method_43$9db6d416f4(var35);
      net.C_472J var37 = net.C_472J.method_44$832346ff7a(var16);
      net.C_471M var52 = var37.method_44$7c71d51fed();
      boolean var38 = true;
      net.C_47Wh var39 = var2;
      net.C_471M var40 = var52;
      net.labymod.ModelData var25 = var40.method_44$725d1196ea(var39, var38);
      int var26 = var25.model.length;
      client.setting.ColorSetting[] var27 = new client.setting.ColorSetting[var26];
      int var28 = 0;
      int[] var20 = var49;
      if (var28 >= var26) {
         this.field_43h.add(new net.C_472F(var2, var22, var23, var24, var27, null));
      } else {
         client.setting.ColorSetting var10002 = new client.setting.ColorSetting(this, var1 + "Color" + var28, var12, new java.awt.Color(var25.model[var28].color), var21);
         var22.getClass();
         net.C_45n var41 = (net.C_45n)recovery$indy$flow$185(var22);
         long var42 = var8;
         client.setting.ColorSetting var44 = var10002;
         var27[var28] = (client.setting.ColorSetting)var44.method_43$780fd62a21(var42, var41);
         var28++;
         if (var20 == null) {
            while (var28 < var26) {
               var10002 = new client.setting.ColorSetting(this, var1 + "Color" + var28, var12, new java.awt.Color(var25.model[var28].color), var21);
               var22.getClass();
               var41 = (net.C_45n)recovery$indy$flow$185(var22);
               var42 = var8;
               var44 = var10002;
               var27[var28] = (client.setting.ColorSetting)var44.method_43$780fd62a21(var42, var41);
               var28++;
            }

            this.field_43h.add(new net.C_472F(var2, var22, var23, var24, var27, null));
         }
      }
   }





   public boolean method_48$aae029aa0a() {
      return this.field_43a;
   }



   private static void method_48$107b105d68(java.util.HashMap var0, String var1, net.C_47Wh var2) {
      long var3 = a ^ 10777491192522L;
      long var5 = var3 ^ 64862215330685L;
      long var7 = var3 ^ 45527614160172L;
      long var9 = var3 ^ 4604374336171L;
      long var11 = var3 ^ 85729406500105L;
      int[] var13 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var0.size() <= 40) {
         client.setting.BooleanSetting var14 = new client.setting.BooleanSetting(null, var7, var1, false);
         client.setting.NumberSetting var15 = new client.setting.NumberSetting(null, var1 + "Scale", 1.0, var9, 0.5, 2.0, 2);
         client.setting.NumberSetting var16 = new client.setting.NumberSetting(null, var1 + "Height", 0.0, var9, -2.0, 2.0, 2);
         net.C_472J var21 = net.C_472J.method_44$832346ff7a(var5);
         net.C_471M var10000 = var21.method_44$7c71d51fed();
         boolean var22 = true;
         net.C_47Wh var23 = var2;
         net.C_471M var24 = var10000;
         net.labymod.ModelData var17 = var24.method_44$725d1196ea(var23, var22);
         int var18 = var17.model.length;
         client.setting.ColorSetting[] var19 = new client.setting.ColorSetting[var18];
         int var20 = 0;
         if (var20 >= var18) {
            var0.put(var1, new net.C_472F(var2, var14, var15, var16, var19, null));
         } else {
            var19[var20] = new client.setting.ColorSetting(var11, null, var1 + "Color" + var20, new java.awt.Color(var17.model[var20].color));
            var20++;
            if (var13 == null) {
               while (var20 < var18) {
                  var19[var20] = new client.setting.ColorSetting(var11, null, var1 + "Color" + var20, new java.awt.Color(var17.model[var20].color));
                  var20++;
               }

               var0.put(var1, new net.C_472F(var2, var14, var15, var16, var19, null));
            }
         }
      }
   }




   public static void method_48$f633c984d8(boolean var0) {
      field_46 = var0;
   }



    public void method_48$e83afe97e3(net.C_476c event, long eventKey) {
        long decodedKey = recovery$indy$flow$238() ^ eventKey;
        long refreshKey = decodedKey ^ 30246986081007L;
        Object identity = recovery$indy$flow$239(event, -6678785381263535654L, decodedKey);
        Object flowGuard = recovery$indy$flow$240(-6677275649567359441L, decodedKey);
        Object cache = ((java.lang.Object)(((augustus.recovered.modules.render.Cosmetics_47Q_) (((java.lang.Object)(this)))).field_47));
        Object previous = ((java.lang.Object)(((net.C_47Pe) (((java.lang.Object)(recovery$indy$flow$242(cache, identity)))))));
        Object properties;
        if (flowGuard != null) {
            properties = ((java.lang.Object)(((java.util.HashMap) (((java.lang.Object)(previous))))));
        } else if (previous != null) {
            properties = ((java.lang.Object)(((java.util.HashMap) (((java.lang.Object)(recovery$indy$flow$244(previous, -6680796760942007912L, decodedKey)))))));
        } else {
            recovery$indy$flow$246();
            properties = recovery$indy$flow$247();
        }
        if (previous == null) {
            recovery$indy$flow$248(this, refreshKey, properties, -6679643661579252673L, decodedKey);
        }
        recovery$indy$flow$249();
        Object index = recovery$indy$flow$250();
        recovery$indy$flow$251(index, 0);
        Object applyProperty = recovery$indy$flow$252(event, index);
        recovery$indy$flow$253(properties, applyProperty);
        Object refreshedCache = ((java.lang.Object)(((augustus.recovered.modules.render.Cosmetics_47Q_) (((java.lang.Object)(this)))).field_47));
        recovery$indy$flow$255();
        int version = recovery$indy$flow$256(event, -6679598285534110248L, decodedKey);
        Object boxedVersion = recovery$indy$flow$257(version);
        Object metadata = recovery$indy$flow$258(event, -6681640553988537951L, decodedKey);
        Object updated = recovery$indy$flow$259(boxedVersion, metadata, properties);
        recovery$indy$flow$260(refreshedCache, identity, updated);
    }



   private EntityPlayer method_49$f1cca08486(String var1, long var2) {
      var2 = a ^ var2;
      int[] var4 = recovery$indy$17(8523613831788243763L, var2);
      WorldClient var10000 = recovery$indy$18(field_43, 8525806124631566411L, var2);
      if (var4 == null) {
         if (var10000 == null) {
            return null;
         }

         var10000 = recovery$indy$19(field_43, 8525806124631566411L, var2);
      }

      Object var6 = var10000.field_44E;
      if (var4 == null) {
         if (var10000.field_44E.isEmpty()) {
            return null;
         }

         var6 = recovery$indy$20(field_43, 8525806124631566411L, var2).field_44E.stream().filter(recovery$indy$21(var1)).findFirst().orElse(null);
      }

      return (EntityPlayer)var6;
   }



   public void method_49$a99b4a7bef(char var1, AbstractClientPlayer var2, char var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 89734543124122L;
      long var9 = var5 ^ 122453921169153L;
      long var11 = var5 ^ 68671651930827L;
      int[] var13 = recovery$indy$22(1789873195257972140L, var5);
      AbstractClientPlayer var10000 = var2;
      if (var13 == null) {
         if (var2 instanceof EntityPlayerSP) {
            recovery$indy$23(this, var7, var2, 1786708193154374958L, var5);
            if (var13 == null) {
               return;
            }
         }

         var10000 = var2;
      }

      Object var16 = var10000.method_41$cd99b948a0();
      if (var13 == null) {
         if (var16 == null) {
            return;
         }

         var16 = this.field_47.get(var2.method_41$cd99b948a0().getName());
      }

      C_47Pe var14 = (C_47Pe)var16;
      if (var14 != null) {
         label64: {
            var16 = var2;
            Object var10001 = var13;
            if (var4 <= 0) {
               if (var13 != null) {
                  break label64;
               }

               var10001 = recovery$indy$24(var14, 1786025869437703040L, var5);
            }

            if (!recovery$indy$26(var2, var11, (Integer)var10001, (String)recovery$indy$25(var14, 1786032529994648081L, var5), 1789053832711687297L, var5)) {
               return;
            }

            var16 = recovery$indy$27(var14, 1786362946785055259L, var5);
         }

         HashMap var15 = (HashMap)var16;
         if (var15 != null) {
            recovery$indy$28(this, var15.values(), var9, var2, 1785725485097705564L, var5);
         }
      }
   }




   public void method_45$eadbac6712(long var1, AbstractClientPlayer var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 55804377539166L;
      long var6 = var1 ^ 59359747394524L;
      int[] var8 = recovery$indy$29(-6049545326278676111L, var1);
      Cosmetics_47Q_ var10000 = this;
      if (var8 == null) {
         if (!recovery$indy$30(this, var4, -6045237783694300126L, var1)) {
            return;
         }

         var10000 = this;
      }

      recovery$indy$31(var10000, this.field_43h, var6, var3, -6046802139378035583L, var1);
   }



   public void method_45$6d1d83ac0f(int var1, byte var2, int var3, C_47UE var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ a;
      long var7 = var5 ^ 56174523448849L;
      long var9 = var5 ^ 44790240450666L;
      long var10000 = 1882449353543141221L;
      int[] var11 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 1881240161814639095L;
      C_47UE var15 = var4;
      C_47Pe var12 = (C_47Pe)this.field_47.get(var15.method_41$0e30dfc966());
      Object var29 = var12;
      if (var11 == null) {
         if (var12 == null) {
            return;
         }

         long var10001 = 1874423388643594450L;
         C_47Pe var16 = var12;
         var29 = var16.method_42$0502b11602();
      }

      HashMap var13 = (HashMap)var29;
      var10002 = 1881240161814639095L;
      C_47UE var17 = var4;
      String var30 = var17.method_41$0e30dfc966();
      long var10003 = 1874127798986114098L;
      long var18 = var7;
      String var20 = var30;
      Cosmetics_47Q_ var21 = this;
      EntityPlayer var14 = var21.method_49$f1cca08486(var20, var18);
      if (var11 == null && var14 instanceof AbstractClientPlayer) {
         Collection var31 = var13.values();
         AbstractClientPlayer var33 = (AbstractClientPlayer)var14;
         long var10005 = 1874730058859427106L;
         boolean var22 = true;
         long var23 = var9;
         AbstractClientPlayer var25 = var33;
         Collection var26 = var31;
         Cosmetics_47Q_ var27 = this;
         var27.method_46$fcaf703eae(var26, var25, var23, var22);
         var10002 = 1881240161814639095L;
         C_47UE var28 = var4;
         this.field_47.remove(var28.method_41$0e30dfc966());
      }
   }




   public static boolean method_45$aae029aa0a() {
      return field_46;
   }



   private static boolean method_45$b6dc8ecb47(String var0, EntityPlayer var1) {
      long var2 = a ^ 58140083748245L;
      long var10000 = 8059416396872888994L;
      int[] var4 = AntiStrike_47Qa.method_42$d4d28024c9();
      GameProfile var5 = var1.method_41$cd99b948a0();
      if (var4 == null) {
         if (var5 == null) {
            return false;
         }

         var5 = var1.method_41$cd99b948a0();
      }

      boolean var6 = var5.getName().equals(var0);
      return var4 != null ? var6 : var6;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$32(this, 40, var3, -7103831242427292072L, var1);
   }



   public static boolean method_45k$aae029aa0a() {
      boolean var0 = method_45$aae029aa0a();
      return !var0;
   }



   public void method_449$f633c984d8(boolean var1) {
      this.field_43a = var1;
   }



   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 19016814532325L;
      this.field_43a = true;
      recovery$indy$34(this, this.field_43h, recovery$indy$33(field_43, -7745155201081359115L, var1), var3, true, -7742997305980699731L, var1);
   }



    public void method_489$e45a9973e5(long a0) {
        long computed4;
        long computed6;
        long computed8;
        long computed10;
        long computed12;
        long computed14;
        long computed16;
        long computed18;
        long computed20;
        long computed22;
        long computed24;
        long computed25;
        int converted26;
        long computed28;
        long computed29;
        int converted30;
        long computed32;
        long computed33;
        int converted34;
        long computed36;
        long computed37;
        int converted38;
        long computed40;
        long computed41;
        int converted42;
        java.lang.Object value44;
        java.lang.Object value46;
        long value48;
        java.lang.Object value50;
        boolean value51;
        int regionValue68;
        int regionValue86;
        boolean value121;
        java.lang.Object value138;
        java.lang.Object value140;
        java.lang.Object value141;
        java.lang.Object value174;
        java.lang.Object value177;
        boolean value178;
        int comparison179;
        int regionValue195;
        int regionValue212;
        int regionValue246;
        java.lang.Object value294;
        java.lang.Object value296;
        int value297;
        int regionValue313;
        java.lang.Object value330;
        java.lang.Object value332;
        java.lang.Object value333;
        int value334;
        java.lang.Object value380;
        java.lang.Object value381;
        java.lang.Object value382;
        boolean value383;
        int regionValue399;
        int regionValue461;
        int regionValue478;
        boolean value588;
        java.lang.Object value589;
        java.lang.Object value590;
        boolean value608;
        java.lang.Object value641;
        java.lang.Object regionValue658;
        int comparison659;
        java.lang.Object value676;
        java.lang.Object value677;
        java.lang.Object value678;
        java.lang.Object value679;
        boolean value680;
        int comparison681;
        int comparison763;
        java.lang.Object value764;
        java.lang.Object value766;
        java.lang.Object value767;
        int value768;
        java.util.HashMap initialized769;
        java.util.HashMap initialized771;
        java.util.HashMap initialized773;
        java.util.HashMap initialized775;
        java.util.HashMap initialized777;
        java.util.HashMap initialized779;
        java.util.HashMap initialized781;
        java.util.HashMap initialized783;
        java.lang.Object value785;
        java.lang.Object value786;
        boolean value811;
        java.lang.Object value858;
        java.lang.Object regionValue882;
        java.lang.Object value883;
        net.C_47mH initialized884;
        int comparison885;
        java.lang.Object regionValue888;
        java.lang.Object value889;
        java.lang.Object value890;
        java.lang.Object value891;
        java.lang.Object value892;
        java.lang.Object value893;
        java.lang.Object value894;
        java.lang.Object value895;
        java.lang.Object value896;
        java.lang.Object value897;
        java.lang.Object value898;
        java.lang.Object value899;
        java.lang.Object value900;
        java.lang.Object value901;
        java.lang.Object value902;
        boolean value903;
        java.lang.Object value904;
        java.lang.Object value905;
        java.lang.Object value907;
        java.lang.Object value908;
        double value909;
        float converted910;
        java.lang.Object value911;
        java.lang.Object value912;
        java.lang.Object value914;
        java.lang.Object value915;
        double value916;
        float converted917;
        java.lang.Object value918;
        java.lang.Object value919;
        java.lang.Object regionValue943;
        java.lang.Object regionValue944;
        java.lang.Object regionValue945;
        java.lang.Object value946;
        java.lang.Object value947;
        java.lang.Object value948;
        java.lang.Object value949;
        int length950;
        int[] values951;
        int[] value952;
        int length953;
        boolean[] values954;
        boolean[] value955;
        int length956;
        boolean[] values957;
        boolean[] value958;
        int length959;
        double[] values960;
        double[] value961;
        int length962;
        double[] values963;
        double[] value964;
        int value965;
        java.lang.Object regionValue989;
        java.lang.Object regionValue990;
        java.lang.Object regionValue991;
        java.lang.Object regionValue992;
        java.lang.Object regionValue993;
        java.lang.Object regionValue994;
        java.lang.Object regionValue995;
        java.lang.Object regionValue996;
        int regionValue997;
        int length998;
        java.lang.Object regionValue1022;
        java.lang.Object regionValue1023;
        java.lang.Object regionValue1024;
        java.lang.Object regionValue1025;
        java.lang.Object regionValue1026;
        java.lang.Object regionValue1027;
        java.lang.Object regionValue1028;
        java.lang.Object regionValue1052;
        java.lang.Object regionValue1053;
        java.lang.Object regionValue1054;
        java.lang.Object regionValue1055;
        java.lang.Object regionValue1056;
        java.lang.Object regionValue1057;
        java.lang.Object regionValue1058;
        java.lang.Object regionValue1059;
        int regionValue1060;
        java.lang.Object arrayValue1061;
        java.lang.Object value1062;
        java.lang.Object value1064;
        java.lang.Object value1065;
        boolean value1066;
        java.lang.Object value1069;
        java.lang.Object value1070;
        boolean value1071;
        java.lang.Object value1073;
        java.lang.Object value1074;
        double value1075;
        java.lang.Object value1077;
        java.lang.Object value1078;
        double value1079;
        short converted1080;
        char converted1081;
        int value1082;
        int value1083;
        int value1084;
        java.lang.Object value1086;
        java.lang.Object value1087;
        int value1088;
        int incremented1089;
        int comparison1090;
        java.lang.Object regionValue1138;
        java.lang.Object regionValue1139;
        java.lang.Object regionValue1140;
        java.lang.Object regionValue1141;
        java.lang.Object regionValue1142;
        java.lang.Object regionValue1143;
        java.lang.Object regionValue1144;
        java.lang.Object regionValue1145;
        int regionValue1146;
        java.lang.Object regionValue1194;
        java.lang.Object regionValue1195;
        java.lang.Object regionValue1196;
        java.lang.Object regionValue1197;
        java.lang.Object regionValue1198;
        java.lang.Object regionValue1199;
        java.lang.Object regionValue1200;
        java.lang.Object regionValue1201;
        int regionValue1202;
        java.lang.Object regionValue1226;
        java.lang.Object regionValue1227;
        java.lang.Object regionValue1228;
        java.lang.Object regionValue1229;
        java.lang.Object regionValue1230;
        java.lang.Object regionValue1231;
        java.lang.Object regionValue1232;
        java.lang.Object regionValue1233;
        int regionValue1234;
        java.lang.Object regionValue1258;
        java.lang.Object regionValue1259;
        java.lang.Object regionValue1260;
        java.lang.Object regionValue1261;
        java.lang.Object regionValue1262;
        java.lang.Object regionValue1263;
        java.lang.Object regionValue1264;
        java.lang.Object value1265;
        java.lang.Object value1266;
        java.lang.Object value1267;
        java.lang.Object value1268;
        java.lang.Object value1269;
        int comparison1270;
        java.lang.Object regionValue1294;
        java.lang.Object value1318;
        net.C_47mH initialized1319;
        int comparison1320;
        java.lang.Object value1321;
        java.lang.Object value1322;
        java.lang.Object value1323;
        java.lang.Object value1326;
        java.lang.Object value1327;
        region573: {
        region300: {
        region264: {
        region253: {
        region220: {
        region217: {
        region216: {
        region215: {
        region214: {
        region211: {
        region209: {
        region206: {
        region204: {
        region203: {
        region199: {
        region198: {
        region197: {
        region196: {
        region194: {
        region193: {
        region191: {
        region184: {
        region182: {
        region171: {
        region170: {
        region169: {
        region157: {
        region156: {
        region155: {
        region153: {
        region152: {
        region150: {
        region129: {
        region127: {
        region117: {
        region116: {
        region108: {
        region106: {
        region105: {
        computed4 = a0 ^ 138396005964801L;
        computed6 = a0 ^ 60104420110687L;
        computed8 = a0 ^ 31369633393895L;
        computed10 = a0 ^ 80102744777474L;
        computed12 = a0 ^ 128999244447183L;
        computed14 = a0 ^ 123247985999379L;
        computed16 = a0 ^ 6165869113804L;
        computed18 = a0 ^ 104360276834387L;
        computed20 = a0 ^ 126090401419865L;
        computed22 = a0 ^ 117727121906419L;
        computed24 = a0 ^ 67921376985931L;
        computed25 = computed24 >>> 32;
        converted26 = (int) (computed25);
        computed28 = computed24 << 32;
        computed29 = computed28 >>> 32;
        converted30 = (int) (computed29);
        computed32 = a0 ^ 47098938035063L;
        computed33 = computed32 >>> 32;
        converted34 = (int) (computed33);
        computed36 = computed32 << 32;
        computed37 = computed36 >>> 48;
        converted38 = (int) (computed37);
        computed40 = computed32 << 48;
        computed41 = computed40 >>> 48;
        converted42 = (int) (computed41);
        value44 = recovery$indy$flow$344();
        value46 = ((java.lang.Object)(((augustus.recovered.modules.render.Cosmetics_47Q_) (((java.lang.Object)(this)))).field_49));
        value48 = 5000L;
        value50 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value46))))));
        value51 = recovery$indy$flow$347(value50, value48, computed14);
        if (value44 != null) {
            regionValue68 = (int) ((value51 ? 1 : 0));
            break region116;
        } else {
            regionValue86 = (int) ((value51 ? 1 : 0));
            break region105;
        }
        }
        if (regionValue86 == 0) {
            break region156;
        } else {
            break region106;
        }
        }
        break region108;
        }
        value121 = recovery$indy$flow$348(computed22);
        regionValue68 = (int) ((value121 ? 1 : 0));
        break region116;
        }
        if (regionValue68 == 0) {
            break region156;
        } else {
            break region117;
        }
        }
        value138 = recovery$indy$flow$349();
        value140 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value138))))));
        value141 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value140)))).field_42P));
        if (value141 == null) {
            break region156;
        } else {
            break region127;
        }
        }
        break region129;
        }
        value174 = recovery$indy$flow$352();
        value177 = ((java.lang.Object)(((net.C_47Ua) (((java.lang.Object)(value174))))));
        value178 = recovery$indy$flow$354(value177, computed16);
        comparison179 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison179 < 0) {
            regionValue195 = (int) ((value178 ? 1 : 0));
            break region170;
        } else {
            regionValue212 = (int) ((value178 ? 1 : 0));
            break region150;
        }
        }
        break region152;
        }
        if (value44 != null) {
            regionValue246 = regionValue212;
            break region169;
        } else {
            break region153;
        }
        }
        break region155;
        }
        if (regionValue212 != 0) {
            break region157;
        } else {
            break region156;
        }
        }
        return;
        }
        value294 = ((java.lang.Object)(((augustus.recovered.modules.render.Cosmetics_47Q_) (((java.lang.Object)(this)))).field_49));
        value296 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value294))))));
        recovery$indy$flow$357(value296);
        value297 = recovery$indy$flow$358(this);
        regionValue246 = value297;
        break region169;
        }
        regionValue195 = regionValue246;
        break region170;
        }
        if (value44 != null) {
            regionValue313 = regionValue195;
            break region197;
        } else {
            break region171;
        }
        }
        value330 = recovery$indy$flow$359();
        value332 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value330))))));
        value333 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value332)))).field_42P));
        value334 = recovery$indy$flow$362(value333);
        if (regionValue195 != value334) {
            break region196;
        } else {
            break region182;
        }
        }
        break region184;
        }
        value380 = ((java.lang.Object)(((augustus.recovered.modules.render.Cosmetics_47Q_) (((java.lang.Object)(this)))).field_43h));
        value381 = recovery$indy$flow$364(value380);
        value382 = recovery$indy$flow$365();
        value383 = recovery$indy$flow$366(value381, value382);
        if (value44 != null) {
            regionValue313 = (int) ((value383 ? 1 : 0));
            break region197;
        } else {
            regionValue399 = (int) ((value383 ? 1 : 0));
            break region191;
        }
        }
        break region193;
        }
        if (regionValue399 == 0) {
            break region198;
        } else {
            break region194;
        }
        }
        break region196;
        }
        regionValue313 = 1;
        break region197;
        }
        regionValue461 = regionValue313;
        break region199;
        }
        regionValue461 = 0;
        break region199;
        }
        if (value44 != null) {
            regionValue478 = regionValue461;
            break region214;
        } else {
            break region203;
        }
        }
        if (regionValue461 != 0) {
            break region216;
        } else {
            break region204;
        }
        }
        break region206;
        }
        if (value44 != null) {
            break region217;
        } else {
            break region209;
        }
        }
        break region211;
        }
        value588 = recovery$indy$flow$367(this);
        regionValue478 = (int) ((value588 ? 1 : 0));
        break region214;
        }
        if (regionValue478 != 0) {
            break region216;
        } else {
            break region215;
        }
        }
        return;
        }
        break region217;
        }
        value589 = ((java.lang.Object)(((augustus.recovered.modules.render.Cosmetics_47Q_) (((java.lang.Object)(this)))).field_43h));
        value590 = recovery$indy$flow$369(value589);
        break region220;
        }
        loop220: while (true) {
        region225: {
        region999: {
        region223: {
        value608 = recovery$indy$flow$370(value590);
        if ((int) ((value608 ? 1 : 0)) == 0) {
            break region999;
        } else {
            break region223;
        }
        }
        value641 = recovery$indy$flow$371(value590);
        regionValue658 = value641;
        break region225;
        }
        recovery$indy$flow$375(this, false);
        comparison659 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison659 <= 0) {
            regionValue658 = this;
            break region225;
        } else {
            break region253;
        }
        }
        loop225: while (true) {
        region245: {
        region244: {
        region243: {
        region242: {
        value676 = ((java.lang.Object)(((net.C_472F) (((java.lang.Object)(regionValue658))))));
        value677 = value676;
        value678 = value677;
        value679 = ((java.lang.Object)(((net.C_472F) (((java.lang.Object)(value678))))));
        value680 = recovery$indy$flow$374(value679);
        comparison681 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison681 < 0) {
            break region244;
        } else {
            break region242;
        }
        }
        if (value44 != null) {
            break region264;
        } else {
            break region243;
        }
        }
        break region244;
        }
        if (value44 == null) {
            continue loop220;
        } else {
            break region245;
        }
        }
        recovery$indy$flow$375(this, false);
        comparison763 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison763 <= 0) {
            regionValue658 = this;
            continue loop225;
        } else {
            break region253;
        }
        }
        }
        }
        value764 = recovery$indy$flow$376();
        value766 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value764))))));
        value767 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value766)))).field_42P));
        value768 = recovery$indy$flow$379(value767);
        recovery$indy$flow$380(this, value768);
        break region264;
        }
        initialized769 = new java.util.HashMap();
        initialized771 = new java.util.HashMap();
        initialized773 = new java.util.HashMap();
        initialized775 = new java.util.HashMap();
        initialized777 = new java.util.HashMap();
        initialized779 = new java.util.HashMap();
        initialized781 = new java.util.HashMap();
        initialized783 = new java.util.HashMap();
        value785 = ((java.lang.Object)(((augustus.recovered.modules.render.Cosmetics_47Q_) (((java.lang.Object)(this)))).field_43h));
        value786 = recovery$indy$flow$398(value785);
        break region300;
        }
        loop300: while (true) {
        region305: {
        region877: {
        region303: {
        value811 = recovery$indy$flow$399(value786);
        if ((int) ((value811 ? 1 : 0)) == 0) {
            break region877;
        } else {
            break region303;
        }
        }
        value858 = recovery$indy$flow$400(value786);
        regionValue882 = value858;
        break region305;
        }
        value883 = recovery$indy$flow$438();
        initialized884 = new net.C_47mH((byte[]) (value883), (java.util.Map) (initialized769), (java.util.Map) (initialized771), (java.util.Map) (initialized773), (java.util.Map) (initialized775), (java.util.Map) (initialized777), (java.util.Map) (initialized779), (java.util.Map) (initialized781), computed12, (java.util.Map) (initialized783));
        comparison885 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison885 < 0) {
            regionValue882 = initialized884;
            break region305;
        } else {
            regionValue888 = initialized884;
            break region573;
        }
        }
        loop305: while (true) {
        region556: {
        region555: {
        region554: {
        region553: {
        region382: {
        value889 = ((java.lang.Object)(((net.C_472F) (((java.lang.Object)(regionValue882))))));
        value890 = value889;
        value891 = value890;
        value892 = ((java.lang.Object)(((net.C_472F) (((java.lang.Object)(value891))))));
        value893 = recovery$indy$flow$403(value892);
        value894 = value893;
        value895 = ((java.lang.Object)(((net.C_47Wh) (((java.lang.Object)(value894))))));
        value896 = recovery$indy$flow$405(value895);
        value897 = value896;
        value898 = value890;
        value899 = ((java.lang.Object)(((net.C_472F) (((java.lang.Object)(value898))))));
        value900 = recovery$indy$flow$407(value899);
        value901 = value900;
        value902 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value901))))));
        value903 = recovery$indy$flow$409(value902);
        value904 = recovery$indy$flow$410(value903);
        value905 = recovery$indy$flow$411(initialized779, value897, value904);
        value907 = value890;
        value908 = ((java.lang.Object)(((net.C_472F) (((java.lang.Object)(value907))))));
        value909 = recovery$indy$flow$413(value908, computed4);
        converted910 = (float) (value909);
        value911 = recovery$indy$flow$414(converted910);
        value912 = recovery$indy$flow$415(initialized781, value897, value911);
        value914 = value890;
        value915 = ((java.lang.Object)(((net.C_472F) (((java.lang.Object)(value914))))));
        value916 = recovery$indy$flow$417(value915, computed18);
        converted917 = (float) (value916);
        value918 = recovery$indy$flow$418(converted917);
        value919 = recovery$indy$flow$419(initialized783, value897, value918);
        regionValue943 = value890;
        regionValue944 = value897;
        regionValue945 = value919;
        break region382;
        }
        loop382: while (true) {
        region525: {
        region523: {
        region415: {
        value946 = regionValue943;
        value947 = ((java.lang.Object)(((net.C_472F) (((java.lang.Object)(value946))))));
        value948 = recovery$indy$flow$421(value947);
        value949 = value948;
        length950 = java.lang.reflect.Array.getLength(value949);
        values951 = new int[length950];
        value952 = values951;
        length953 = java.lang.reflect.Array.getLength(value952);
        values954 = new boolean[length953];
        value955 = values954;
        length956 = java.lang.reflect.Array.getLength(value952);
        values957 = new boolean[length956];
        value958 = values957;
        length959 = java.lang.reflect.Array.getLength(value952);
        values960 = new double[length959];
        value961 = values960;
        length962 = java.lang.reflect.Array.getLength(value952);
        values963 = new double[length962];
        value964 = values963;
        value965 = 0;
        regionValue989 = regionValue943;
        regionValue990 = regionValue944;
        regionValue991 = value949;
        regionValue992 = value952;
        regionValue993 = value955;
        regionValue994 = value958;
        regionValue995 = value961;
        regionValue996 = value964;
        regionValue997 = value965;
        break region415;
        }
        loop415: while (true) {
        region521: {
        region519: {
        region518: {
        region419: {
        length998 = java.lang.reflect.Array.getLength(regionValue991);
        if (regionValue997 >= length998) {
            regionValue1022 = regionValue989;
            regionValue1023 = regionValue990;
            regionValue1024 = regionValue992;
            regionValue1025 = regionValue993;
            regionValue1026 = regionValue994;
            regionValue1027 = regionValue995;
            regionValue1028 = regionValue996;
            break region525;
        } else {
            regionValue1052 = regionValue989;
            regionValue1053 = regionValue990;
            regionValue1054 = regionValue991;
            regionValue1055 = regionValue992;
            regionValue1056 = regionValue993;
            regionValue1057 = regionValue994;
            regionValue1058 = regionValue995;
            regionValue1059 = regionValue996;
            regionValue1060 = regionValue997;
            break region419;
        }
        }
        arrayValue1061 = ((java.lang.Object[]) regionValue1054)[regionValue1060];
        value1062 = arrayValue1061;
        value1064 = value1062;
        value1065 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(value1064))))));
        value1066 = recovery$indy$flow$423(value1065, computed6);
        if (regionValue1056 instanceof boolean[]) {
            ((boolean[]) regionValue1056)[regionValue1060] = value1066;
        } else {
            ((byte[]) regionValue1056)[regionValue1060] = (byte) ((value1066 ? 1 : 0));
        }
        value1069 = value1062;
        value1070 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(value1069))))));
        value1071 = recovery$indy$flow$425(value1070, converted26, converted30);
        if (regionValue1057 instanceof boolean[]) {
            ((boolean[]) regionValue1057)[regionValue1060] = value1071;
        } else {
            ((byte[]) regionValue1057)[regionValue1060] = (byte) ((value1071 ? 1 : 0));
        }
        value1073 = value1062;
        value1074 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(value1073))))));
        value1075 = recovery$indy$flow$427(value1074, computed10);
        ((double[]) regionValue1058)[regionValue1060] = value1075;
        value1077 = value1062;
        value1078 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(value1077))))));
        value1079 = recovery$indy$flow$429(value1078, computed8);
        ((double[]) regionValue1059)[regionValue1060] = value1079;
        converted1080 = (short) (converted38);
        converted1081 = (char) (converted42);
        value1082 = 0;
        value1083 = (int) (converted1081);
        value1084 = (int) (converted1080);
        value1086 = value1062;
        value1087 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(value1086))))));
        value1088 = recovery$indy$flow$431(value1087, converted34, (short) (value1084), (char) (value1083), value1082);
        ((int[]) regionValue1055)[regionValue1060] = value1088;
        incremented1089 = regionValue1060 + (1);
        comparison1090 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison1090 < 0) {
            break region555;
        } else {
            regionValue1138 = regionValue1052;
            regionValue1139 = regionValue1053;
            regionValue1140 = regionValue1054;
            regionValue1141 = regionValue1055;
            regionValue1142 = regionValue1056;
            regionValue1143 = regionValue1057;
            regionValue1144 = regionValue1058;
            regionValue1145 = regionValue1059;
            regionValue1146 = incremented1089;
            break region518;
        }
        }
        if (value44 != null) {
            break region554;
        } else {
            regionValue1194 = regionValue1138;
            regionValue1195 = regionValue1139;
            regionValue1196 = regionValue1140;
            regionValue1197 = regionValue1141;
            regionValue1198 = regionValue1142;
            regionValue1199 = regionValue1143;
            regionValue1200 = regionValue1144;
            regionValue1201 = regionValue1145;
            regionValue1202 = regionValue1146;
            break region519;
        }
        }
        regionValue1226 = regionValue1194;
        regionValue1227 = regionValue1195;
        regionValue1228 = regionValue1196;
        regionValue1229 = regionValue1197;
        regionValue1230 = regionValue1198;
        regionValue1231 = regionValue1199;
        regionValue1232 = regionValue1200;
        regionValue1233 = regionValue1201;
        regionValue1234 = regionValue1202;
        break region521;
        }
        if (value44 == null) {
            regionValue989 = regionValue1226;
            regionValue990 = regionValue1227;
            regionValue991 = regionValue1228;
            regionValue992 = regionValue1229;
            regionValue993 = regionValue1230;
            regionValue994 = regionValue1231;
            regionValue995 = regionValue1232;
            regionValue996 = regionValue1233;
            regionValue997 = regionValue1234;
            continue loop415;
        } else {
            regionValue1258 = regionValue1226;
            regionValue1259 = regionValue1227;
            regionValue1260 = regionValue1229;
            regionValue1261 = regionValue1230;
            regionValue1262 = regionValue1231;
            regionValue1263 = regionValue1232;
            regionValue1264 = regionValue1233;
            break region523;
        }
        }
        }
        regionValue1022 = regionValue1258;
        regionValue1023 = regionValue1259;
        regionValue1024 = regionValue1260;
        regionValue1025 = regionValue1261;
        regionValue1026 = regionValue1262;
        regionValue1027 = regionValue1263;
        regionValue1028 = regionValue1264;
        break region525;
        }
        value1265 = recovery$indy$flow$432(initialized769, regionValue1023, regionValue1024);
        value1266 = recovery$indy$flow$433(initialized771, regionValue1023, regionValue1025);
        value1267 = recovery$indy$flow$434(initialized773, regionValue1023, regionValue1026);
        value1268 = recovery$indy$flow$435(initialized775, regionValue1023, regionValue1027);
        value1269 = recovery$indy$flow$436(initialized777, regionValue1023, regionValue1028);
        comparison1270 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison1270 < 0) {
            regionValue943 = regionValue1022;
            regionValue944 = regionValue1023;
            regionValue945 = value1269;
            continue loop382;
        } else {
            regionValue1294 = value1269;
            break region553;
        }
        }
        }
        break region554;
        }
        break region555;
        }
        if (value44 == null) {
            continue loop300;
        } else {
            break region556;
        }
        }
        value1318 = recovery$indy$flow$438();
        initialized1319 = new net.C_47mH((byte[]) (value1318), (java.util.Map) (initialized769), (java.util.Map) (initialized771), (java.util.Map) (initialized773), (java.util.Map) (initialized775), (java.util.Map) (initialized777), (java.util.Map) (initialized779), (java.util.Map) (initialized781), computed12, (java.util.Map) (initialized783));
        comparison1320 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison1320 < 0) {
            regionValue882 = initialized1319;
            continue loop305;
        } else {
            regionValue888 = initialized1319;
            break region573;
        }
        }
        }
        }
        value1321 = regionValue888;
        value1322 = recovery$indy$flow$440();
        value1323 = value1321;
        value1326 = ((java.lang.Object)(((net.C_47Ua) (((java.lang.Object)(value1322))))));
        value1327 = ((java.lang.Object)(((net.C_47d7) (((java.lang.Object)(value1323))))));
        recovery$indy$flow$443(value1326, computed20, value1327);
        return;
    }







   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43P = true;
   }



    public Cosmetics_47Q_(long a0) {
        super((java.lang.String) ("Cosmetics"),(java.lang.String) ("Kosmetische Gegenst\u00e4nde"),(long) (((augustus.recovered.modules.render.Cosmetics_47Q_.a ^ a0) ^ 54343751915629L)),(java.awt.Color) (new java.awt.Color((int) (0),(int) (244),(int) (231),(int) (255))),(client.module.Category) (client.module.Category.RENDER));
        long registryKey = ((augustus.recovered.modules.render.Cosmetics_47Q_.a ^ a0) ^ 92211734159911L);
        recovery$indy$flow$447(this, new java.util.HashMap());
        recovery$indy$flow$450(this, new java.util.ArrayList());
        recovery$indy$flow$453(this, new net.C_47cu());
        recovery$indy$flow$454(this, false);
        recovery$indy$flow$455(this, false);
        Object session = recovery$indy$flow$456(registryKey);
        Object cosmetics = recovery$indy$flow$458(((java.lang.Object)(((net.C_472J) (((java.lang.Object)(session)))))));
        Object registry = recovery$indy$flow$460(((java.lang.Object)(((net.C_47) (((java.lang.Object)(cosmetics)))))));
        Object registerCosmetic = recovery$indy$flow$461(this);
        recovery$indy$flow$462(registry, registerCosmetic);
    }



    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$148(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$160(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$185(java.lang.Object a0);
    private static long recovery$indy$flow$238() {
        return augustus.recovered.modules.render.Cosmetics_47Q_.a;
    }
    private static native java.lang.Object recovery$indy$flow$239(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$240(long a0,long a1);

    private static java.lang.Object recovery$indy$flow$242(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).get(a1);
    }

    private static native java.lang.Object recovery$indy$flow$244(java.lang.Object a0,long a1,long a2);

    private static native java.lang.Object recovery$indy$flow$246();
    private static native java.lang.Object recovery$indy$flow$247();
    private static native void recovery$indy$flow$248(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$249();
    private static native java.lang.Object recovery$indy$flow$250();
    private static void recovery$indy$flow$251(java.lang.Object a0,int a1) {
        ((java.util.concurrent.atomic.AtomicInteger) (a0)).set(a1);
        return;
    }
    private static native java.lang.Object recovery$indy$flow$252(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$253(java.lang.Object a0,java.lang.Object a1) {
        ((java.util.HashMap) (a0)).forEach(((java.util.function.BiConsumer) (a1)));
        return;
    }

    private static native java.lang.Object recovery$indy$flow$255();
    private static native int recovery$indy$flow$256(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$257(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static native java.lang.Object recovery$indy$flow$258(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$259(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2);
    private static java.lang.Object recovery$indy$flow$260(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }
    private static native java.lang.Object recovery$indy$flow$344();


    private static native boolean recovery$indy$flow$347(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$348(long a0);
    private static java.lang.Object recovery$indy$flow$349() {
        return augustus.recovered.modules.render.Cosmetics_47Q_.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$352();

    private static native boolean recovery$indy$flow$354(java.lang.Object a0,long a1);


    private static native void recovery$indy$flow$357(java.lang.Object a0);
    private static int recovery$indy$flow$358(java.lang.Object a0) {
        return ((augustus.recovered.modules.render.Cosmetics_47Q_) (a0)).field_42;
    }
    private static java.lang.Object recovery$indy$flow$359() {
        return augustus.recovered.modules.render.Cosmetics_47Q_.field_43;
    }


    private static native int recovery$indy$flow$362(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$364(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).stream();
    }
    private static native java.lang.Object recovery$indy$flow$365();
    private static boolean recovery$indy$flow$366(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.stream.Stream) (a0)).anyMatch(((java.util.function.Predicate) (a1)));
    }
    private static boolean recovery$indy$flow$367(java.lang.Object a0) {
        return ((augustus.recovered.modules.render.Cosmetics_47Q_) (a0)).field_43P;
    }

    private static java.lang.Object recovery$indy$flow$369(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$370(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$371(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }


    private static native boolean recovery$indy$flow$374(java.lang.Object a0);
    private static void recovery$indy$flow$375(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.render.Cosmetics_47Q_) (a0)).field_43P = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$376() {
        return augustus.recovered.modules.render.Cosmetics_47Q_.field_43;
    }


    private static native int recovery$indy$flow$379(java.lang.Object a0);
    private static void recovery$indy$flow$380(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.render.Cosmetics_47Q_) (a0)).field_42 = a1;
        return;
    }

    private static java.lang.Object recovery$indy$flow$398(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$399(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$400(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }


    private static native java.lang.Object recovery$indy$flow$403(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$405(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$407(java.lang.Object a0);

    private static native boolean recovery$indy$flow$409(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$410(boolean a0) {
        return java.lang.Boolean.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$411(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.Map) (a0)).put(a1, a2);
    }

    private static native double recovery$indy$flow$413(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$414(float a0) {
        return java.lang.Float.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$415(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.Map) (a0)).put(a1, a2);
    }

    private static native double recovery$indy$flow$417(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$418(float a0) {
        return java.lang.Float.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$419(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.Map) (a0)).put(a1, a2);
    }

    private static native java.lang.Object recovery$indy$flow$421(java.lang.Object a0);

    private static native boolean recovery$indy$flow$423(java.lang.Object a0,long a1);

    private static native boolean recovery$indy$flow$425(java.lang.Object a0,int a1,int a2);

    private static native double recovery$indy$flow$427(java.lang.Object a0,long a1);

    private static native double recovery$indy$flow$429(java.lang.Object a0,long a1);

    private static native int recovery$indy$flow$431(java.lang.Object a0,int a1,short a2,char a3,int a4);
    private static java.lang.Object recovery$indy$flow$432(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.Map) (a0)).put(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$433(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.Map) (a0)).put(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$434(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.Map) (a0)).put(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$435(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.Map) (a0)).put(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$436(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.Map) (a0)).put(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$438() {
        return net.C_47cq.field_48;
    }
    private static native java.lang.Object recovery$indy$flow$440();


    private static native void recovery$indy$flow$443(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$447(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$450(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$453(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$454(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.render.Cosmetics_47Q_) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$455(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.render.Cosmetics_47Q_) (a0)).field_43a = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$456(long a0);

    private static native java.lang.Object recovery$indy$flow$458(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$460(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$461(java.lang.Object a0);
    private static void recovery$indy$flow$462(java.lang.Object a0,java.lang.Object a1) {
        ((java.util.HashMap) (a0)).forEach(((java.util.function.BiConsumer) (a1)));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native BiConsumer recovery$indy$1(Cosmetics_47Q_ var0);
   private static native void recovery$indy$2(Object var0, Object var1, Object var2, long var3, boolean var5, long var6, long var8);
   private static native C_472J recovery$indy$3(long var0, long var2, long var4);
   private static native C_47 recovery$indy$4(Object var0, long var1, long var3);
   private static native HashMap recovery$indy$5(Object var0, long var1, long var3);
   private static native BiConsumer recovery$indy$6(HashMap var0);
   private static native int[] recovery$indy$17(long var0, long var2);
   private static native WorldClient recovery$indy$18(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$19(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$20(Object var0, long var1, long var3);
   private static native Predicate recovery$indy$21(String var0);
   private static native int[] recovery$indy$22(long var0, long var2);
   private static native void recovery$indy$23(Object var0, long var1, Object var3, long var4, long var6);
   private static native Object recovery$indy$24(Object var0, long var1, long var3);
   private static native Object recovery$indy$25(Object var0, long var1, long var3);
   private static native boolean recovery$indy$26(Object var0, long var1, int var3, Object var4, long var5, long var7);
   private static native Object recovery$indy$27(Object var0, long var1, long var3);
   private static native void recovery$indy$28(Object var0, Object var1, long var2, Object var4, long var5, long var7);
   private static native int[] recovery$indy$29(long var0, long var2);
   private static native boolean recovery$indy$30(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$31(Object var0, Object var1, long var2, Object var4, long var5, long var7);
   private static native void recovery$indy$32(Object var0, int var1, long var2, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$33(Object var0, long var1, long var3);
   private static native void recovery$indy$34(Object var0, Object var1, Object var2, long var3, boolean var5, long var6, long var8);
   private static native MethodHandle recovery$constant$37();
}
