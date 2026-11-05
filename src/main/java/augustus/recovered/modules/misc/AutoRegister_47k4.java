package augustus.recovered.modules.misc;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_455;
import net.C_45n;
import net.C_473U;
import net.C_47AL;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47eq;
import net.C_47iC;
import net.C_47iz;
import net.C_47ob;
import client.module.Category;
import net.C_47xz;
import net.C_4f;
import org.apache.commons.lang3.StringUtils;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoRegister_47k4 extends client.module.Module implements net.C_47iC,net.C_47xz {
    private final client.setting.ModeSetting settingPasswordMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingCustomPassword = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingGetPasswordFromTxtIfPresent = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPrintOnRegister = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPrintOnLogin = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public String method_41$1615420cb9(String var1, long var2, boolean var4) {
      boolean var10000;
      byte[] var25;
      long var7;
      long var9;
      long var11;
      int[] var13;
      String var14;
      String var23;
      label118: {
         long var5;
         var2 = a ^ var2;
         var5 = var2 ^ 25516134141965L;
         var7 = var2 ^ 30911454381039L;
         var9 = var2 ^ 114604523504485L;
         var11 = var2 ^ 120846570309200L;
         var13 = recovery$indy$1(6192587303383794409L, var2);
         var14 = recovery$indy$2(field_43, 6193675716776384656L, var2).method_47$0e30dfc966();
         var10000 = var4;
         label114:
         if (var13 == null) {
            if (var4) {
               var10000 = this.field_46.containsKey(var14);
               if (var13 != null) {
                  break label114;
               }

               if (var10000) {
                  return (String)this.field_46.get(var14);
               }
            }

            var23 = var1;
            if (var13 != null) {
               break label118;
            }

            var10000 = var1.equalsIgnoreCase(recovery$indy$3(20860, 8210527462919501056L ^ var2));
         }

         if (var10000) {
            return recovery$indy$4(this.settingCustomPassword, var5, 6193761376337023559L, var2);
         }

         var23 = var14;
      }

      byte[] var15;
      label104: {
         label103: {
            var15 = var23.getBytes(StandardCharsets.UTF_8);
            boolean var24 = var1.equalsIgnoreCase(recovery$indy$5(13372, 7465359404088660048L ^ var2));
            if (var13 == null) {
               if (var24) {
                  int var16 = 0;

                  while (var16 < var15.length) {
                     var25 = var15;
                     if (var2 <= 0L) {
                        break label104;
                     }

                     var15[var16] = (byte)(var15[var16] ^ 5);
                     var16++;
                     if (var13 != null) {
                        break label103;
                     }

                     if (var13 != null) {
                        break;
                     }
                  }
               }

               if (var2 < 0L) {
                  break label103;
               }

               var24 = var1.equalsIgnoreCase(recovery$indy$6(32726, 3134477235873405875L ^ var2));
            }

            if (var24) {
               byte[] var20 = recovery$indy$7(var15, var7, 6193019298777235408L, var2);
               return recovery$indy$9(recovery$indy$8(6193626332456742571L, var2), var11, var20, 6193352158805751258L, var2).substring(0, 12);
            }
         }

         var25 = recovery$indy$10(var15, var7, 6193019298777235408L, var2);
      }

      byte[] var21 = var25;
      int var17 = recovery$indy$12(recovery$indy$11(6194051846617535860L, var2), var9, 6194099474809808707L, var2).hashCode();
      int var18 = 0;

      label81:
      while (true) {
         if (var18 < var21.length) {
            var21[var18] = (byte)(var21[var18] ^ (byte)(var18 ^ 267 ^ var15[var18 % var15.length]) ^ (byte)(var17 >> var18 % 5 & 0xFF));
            var18++;
            int[] var26 = var13;
            if (var2 >= 0L) {
               if (var13 != null) {
                  break;
               }

               var26 = var13;
            }

            if (var26 == null) {
               continue;
            }
         }

         while (var2 <= 0L) {
            int[] var27 = var13;
            if (var2 >= 0L) {
               if (var13 != null) {
                  break label81;
               }

               var27 = var13;
            }

            if (var27 == null) {
               continue label81;
            }
         }

         if (var1.equalsIgnoreCase(recovery$indy$13(3042, 5230597864266280858L ^ var2))) {
            Random var22 = new Random(var17);
            return recovery$indy$15(recovery$indy$14(6193626332456742571L, var2), var11, var21, 6193352158805751258L, var2).substring(0, var22.nextInt(3) + 10);
         }
         break;
      }

      Random var28 = new Random(var17 ^ var14.hashCode());
      return recovery$indy$15(recovery$indy$14(6193626332456742571L, var2), var11, var21, 6193352158805751258L, var2).substring(0, var28.nextInt(3) + 10);
   }





   private void method_48$a19f828fbe(boolean var1, long var2) {
      java.lang.StringBuilder var18;
      long var4;
      int[] var10;
      double var13;
      String var15;
      String var16;
      label52: {
         var2 = a ^ var2;
         var4 = var2 ^ 72954987981144L;
         long var6 = var2 ^ 81989098674170L;
         long var8 = var2 ^ 35492050427307L;
         double var11 = recovery$indy$16(this.settingDelay, -3312758216558633077L, var2);
         int[] var10000 = recovery$indy$17(-3312642773499280098L, var2);
         var13 = System.currentTimeMillis() + var11;
         var10 = var10000;
         var15 = recovery$indy$18(var11 / 1000.0, 1, -3312459567835524511L, var2);
         if (var1) {
            String var20;
            label49: {
               var16 = recovery$indy$21(
                  this,
                  recovery$indy$19(this.settingPasswordMode, var6, -3313536059364813392L, var2),
                  var8,
                  recovery$indy$20(this.settingGetPasswordFromTxtIfPresent, -3312849777051017047L, var2),
                  -3313470435863607637L,
                  var2
               );
               var18 = new StringBuilder().append(recovery$indy$22(30131, 8279235558427874854L ^ var2)).append(var15);
               short var10001 = 17240;
               if (var2 > 0L) {
                  var20 = recovery$indy$23(17240, 8768074140612124891L ^ var2);
                  if (var10 != null) {
                     break label49;
                  }

                  var18 = var18.append(var20);
                  var10001 = (short) ((recovery$indy$24(this.settingPrintOnLogin, -3312849777051017047L, var2)) ? 1 : 0);
               }

               var20 = var10001 != 0 ? recovery$indy$25(16628, 5713592003296912253L ^ var2) + var16 : "";
            }

            recovery$indy$26(var4, var18.append(var20).toString(), -3314038180497030772L, var2);
            this.field_42.put(var13, recovery$indy$27(5469, 8701199394881550019L ^ var2) + var16);
            if (var2 <= 0L) {
               break label52;
            }

            if (var10 == null) {
               return;
            }
         }

         var16 = recovery$indy$30(
            this,
            recovery$indy$28(this.settingPasswordMode, var6, -3313536059364813392L, var2),
            var8,
            recovery$indy$29(this.settingGetPasswordFromTxtIfPresent, -3312849777051017047L, var2),
            -3313470435863607637L,
            var2
         );
      }

      StringBuilder var19;
      String var22;
      label38: {
         var19 = new StringBuilder().append(recovery$indy$31(24855, 2859099296138576531L ^ var2)).append(var15);
         short var21 = 31007;
         if (var2 >= 0L) {
            var22 = recovery$indy$32(31007, 3707385875039902362L ^ var2);
            if (var10 != null) {
               break label38;
            }

            var19 = var19.append(var22);
            var21 = (short) ((recovery$indy$33(this.settingPrintOnRegister, -3312849777051017047L, var2)) ? 1 : 0);
         }

         var22 = var21 != 0 ? recovery$indy$34(25076, 2042496331007804024L ^ var2) + var16 : "";
      }

      recovery$indy$35(var4, var19.append(var22).toString(), -3314038180497030772L, var2);
      this.field_42.put(var13, recovery$indy$36(8247, 5286786605150340026L ^ var2) + var16 + " " + var16);
   }





   private static boolean method_48$aae029aa0a() {
      return false;
   }



    private void method_49$e45a9973e5(long l) {
        java.io.File file;
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x44E611568695L;
        long l4 = l3 >>> 8;
        int n = (int)(l3 << 56 >>> 56);
        long l5 = l2 ^ 0x6B35D02594FFL;
        long l6 = l2 ^ 0x5C276531FD2AL;
        int[] nArray = AutoRegister_47k4.recovery$indy$37(-5014133343915020941L, l);
        this.field_46.clear();
        try {
            file = AutoRegister_47k4.recovery$indy$39(l6, AutoRegister_47k4.recovery$indy$38(14881, 0x3D4E45CA774971CCL ^ l), -5014083768371208476L, l);
        }
        catch (java.io.FileNotFoundException fileNotFoundException) {
            AutoRegister_47k4.recovery$indy$43(AutoRegister_47k4.recovery$indy$40(3072, 0x315DDB4172DE47F9L ^ l), AutoRegister_47k4.recovery$indy$42(AutoRegister_47k4.recovery$indy$41(-5012519253711750418L, l), l4, (byte)n, -5014603816700415476L, l).toLowerCase() + java.io.File.separator, l5, false, -5014248611939368233L, l);
            try {
                file = AutoRegister_47k4.recovery$indy$45(l6, AutoRegister_47k4.recovery$indy$44(1332, 0x7FC1FF2D6268CEC0L ^ l), -5014083768371208476L, l);
            }
            catch (java.io.FileNotFoundException fileNotFoundException2) {
                return;
            }
        }
        try {
            java.util.List<String> list = java.nio.file.Files.readAllLines(file.toPath(), java.nio.charset.StandardCharsets.UTF_8);
            for (String string : list) {
                if (l >= 0L && nArray == null) {
                    String string2 = string;
                    String string3 = "#";
                    if (nArray == null) {
                        if (string2.startsWith(string3)) continue;
                        string2 = string = string.replace(AutoRegister_47k4.recovery$indy$46(19252, 0x6E7BFACABF0E00C3L ^ l), "\u0000");
                        string3 = ":";
                    }
                    String[] stringArray = string2.split(string3);
                    if (l >= 0L) {
                        Object object = stringArray;
                        if (nArray == null) {
                            if (((String[])object).length < 2) continue;
                            object = this.field_46.put(stringArray[0].replace("\u0000", ":"), stringArray[1].replace("\u0000", ":"));
                        }
                    }
                    if (nArray == null) continue;
                }
                break;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }




   public void method_47$9035875d26(long var1, C_47ob var3) {
      boolean var11;
      long var4 = var1 ^ 20158050708817L;
      int[] var6 = recovery$indy$47(2669032888832651795L, var1);
      C_473U var7 = recovery$indy$48(var3, 2669161800539005416L, var1);
      C_473U var10000 = var7;
      if (var6 == null) {
         if (!(var7 instanceof C_47AL)) {
            return;
         }

         var10000 = var7;
      }

      label60: {
         String var9;
         label59: {
            C_47AL var8 = (C_47AL)var10000;
            var9 = var8.method_45$8b128fd962().method_48$0e30dfc966();
            int[] var10 = var6;
            if (var1 > 0L) {
               if (var6 == null) {
                  label66: {
                     var11 = StringUtils.containsIgnoreCase(var9, recovery$indy$49(6396, 967747908013083767L ^ var1));
                     if (var1 >= 0L) {
                        if (var11) {
                           break label66;
                        }

                        var11 = StringUtils.containsIgnoreCase(var9, recovery$indy$50(22404, 3578387961158927129L ^ var1));
                     }

                     if (var6 != null) {
                        break label60;
                     }

                     if (!var11) {
                        break label59;
                     }
                  }

                  recovery$indy$51(this, false, var4, 2670363318190420401L, var1);
               }

               var10 = var6;
            }

            if (var10 == null) {
               return;
            }
         }

         var11 = StringUtils.containsIgnoreCase(var9, recovery$indy$52(31486, 3123803588592676463L ^ var1));
      }

      if (var11) {
         recovery$indy$53(this, true, var4, 2670363318190420401L, var1);
      }
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$54(this, 26, var3, -7100525134176442982L, var1);
      recovery$indy$55(this, 40, var3, -7100525134176442982L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      int[] var6 = recovery$indy$56(2183455232722225492L, var4);
      HashMap var10000 = this.field_42;
      if (var6 == null) {
         if (this.field_42.isEmpty()) {
            return;
         }

         var10000 = this.field_42;
      }

      for (Object recovered$element$15727 : var10000.keySet()) {
         Double var8 = (Double) recovered$element$15727;
         if (var3 >= 0 && var6 == null) {
            if (var8 > System.currentTimeMillis()) {
               continue;
            }

            recovery$indy$57(field_43, 2184024611032622831L, var4).method_49$a7421bf54c((String)this.field_42.get(var8));
            this.field_42.remove(var8);
         }
         break;
      }
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 45297998284243L;
      this.field_42.clear();
      recovery$indy$58(this, var6, 2731105425511768023L, var4);
   }



    public AutoRegister_47k4(long a0) {
        super((java.lang.String) ("AutoRegister"),(java.lang.String) ("AutoRegistrieren"),(long) (((augustus.recovered.modules.misc.AutoRegister_47k4.a ^ a0) ^ 49338243115394L)),(java.awt.Color) (new java.awt.Color((int) (189),(int) (32),(int) (110))),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.misc.AutoRegister_47k4.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.misc.AutoRegister_47k4.a ^ a0) ^ 81997777720602L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.misc.AutoRegister_47k4.a ^ a0) ^ 81997777720602L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.misc.AutoRegister_47k4.a ^ a0) ^ 81997777720602L) << 48) >>> 48));
        long constructorKey6 = (((augustus.recovered.modules.misc.AutoRegister_47k4.a ^ a0) ^ 127671963901134L) >>> 8);
        int constructorPart7 = (int) (((((augustus.recovered.modules.misc.AutoRegister_47k4.a ^ a0) ^ 127671963901134L) << 56) >>> 56));
        long constructorKey8 = ((augustus.recovered.modules.misc.AutoRegister_47k4.a ^ a0) ^ 100941185240740L);
        long constructorKey9 = ((augustus.recovered.modules.misc.AutoRegister_47k4.a ^ a0) ^ 113710955534671L);
        long constructorKey10 = ((augustus.recovered.modules.misc.AutoRegister_47k4.a ^ a0) ^ 111695239544959L);
        long constructorKey11 = ((augustus.recovered.modules.misc.AutoRegister_47k4.a ^ a0) ^ 103336775955865L);
        java.lang.Object initialValue12 = recovery$indy$flow$187(4);
        ((java.lang.Object[]) initialValue12)[0] = "Generated";
        ((java.lang.Object[]) initialValue12)[1] = "Private";
        ((java.lang.Object[]) initialValue12)[2] = "Private2";
        ((java.lang.Object[]) initialValue12)[3] = "Custom";
        client.setting.ModeSetting initialized13 = new client.setting.ModeSetting(this, "PasswordMode", constructorKey9, "Generated", (java.lang.String[]) (initialValue12));
        recovery$indy$flow$189(this, initialized13);
        short converted14 = (short) (constructorPart4);
        short converted15 = (short) (constructorPart5);
        client.setting.RangeSetting initialized16 = new client.setting.RangeSetting(constructorPart3, this, "Delay", Double.longBitsToDouble(4649368480934526976L), Double.longBitsToDouble(4653872080561897472L), converted14, 0.0D, Double.longBitsToDouble(4661014508095930368L), 0, converted15);
        long initialValue17 = constructorKey10;
        client.setting.RangeSetting initialValue18 = initialized16;
        java.lang.Object initialValue19 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue20 = recovery$indy$flow$193(initialValue19, initialValue17);
        recovery$indy$flow$194(this, initialValue20);
        java.lang.Object initialValue21 = recovery$indy$flow$196(0);
        client.setting.ModeSetting initialized22 = new client.setting.ModeSetting(this, "CustomPassword", constructorKey9, "Hallo1337", (java.lang.String[]) (initialValue21));
        java.lang.Object initialValue23 = recovery$indy$flow$198();
        java.lang.Object initialValue24 = initialValue23;
        client.setting.ModeSetting initialValue25 = initialized22;
        java.lang.Object initialValue26 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue28 = recovery$indy$flow$201(initialValue26, initialValue27);
        recovery$indy$flow$202(this, initialValue28);
        client.setting.BooleanSetting initialized29 = new client.setting.BooleanSetting(this, constructorKey11, "Get password from txt if present", false);
        recovery$indy$flow$205(this, initialized29);
        client.setting.BooleanSetting initialized30 = new client.setting.BooleanSetting(this, constructorKey11, "Print on register", false);
        recovery$indy$flow$208(this, initialized30);
        client.setting.BooleanSetting initialized31 = new client.setting.BooleanSetting(this, constructorKey11, "Print on login", false);
        recovery$indy$flow$211(this, initialized31);
        java.util.HashMap initialized32 = new java.util.HashMap();
        recovery$indy$flow$214(this, initialized32);
        java.util.HashMap initialized33 = new java.util.HashMap();
        recovery$indy$flow$217(this, initialized33);
        java.lang.StringBuilder initialized34 = new java.lang.StringBuilder();
        java.lang.Object initialValue35 = recovery$indy$flow$220();
        byte converted36 = (byte) (constructorPart7);
        int initialValue37 = (int) (converted36);
        long initialValue38 = constructorKey6;
        java.lang.Object initialValue39 = initialValue35;
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.Client) (((java.lang.Object)(initialValue39))))));
        java.lang.Object initialValue41 = recovery$indy$flow$222(initialValue40, initialValue38, (byte) (initialValue37));
        java.lang.Object initialValue42 = recovery$indy$flow$223(initialValue41);
        java.lang.Object initialValue43 = recovery$indy$flow$224(initialized34, initialValue42);
        java.lang.Object initialValue44 = recovery$indy$flow$225();
        java.lang.Object initialValue45 = recovery$indy$flow$226(initialValue43, initialValue44);
        java.lang.Object initialValue46 = recovery$indy$flow$227(initialValue45);
        int initialValue47 = 0;
        long initialValue48 = constructorKey8;
        java.lang.Object initialValue49 = initialValue46;
        java.lang.String initialValue50 = "assets/augustus/autoregister.txt";
        java.lang.Object initialValue51 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue50))))));
        java.lang.Object initialValue52 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue49))))));
        recovery$indy$flow$230(initialValue51, initialValue52, initialValue48, (initialValue47 != 0));
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$187(int a0);
    private static native void recovery$indy$flow$189(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$193(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$194(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$196(int a0);
    private static native java.lang.Object recovery$indy$flow$198();


    private static native java.lang.Object recovery$indy$flow$201(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$202(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$205(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$208(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$211(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$214(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$217(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$220();

    private static native java.lang.Object recovery$indy$flow$222(java.lang.Object a0,long a1,byte a2);
    private static java.lang.Object recovery$indy$flow$223(java.lang.Object a0) {
        return ((java.lang.String) (a0)).toLowerCase();
    }
    private static java.lang.Object recovery$indy$flow$224(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$225() {
        return java.io.File.separator;
    }
    private static java.lang.Object recovery$indy$flow$226(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$227(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native void recovery$indy$flow$230(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native C_455 recovery$indy$2(Object var0, long var1, long var3);
   private static native String recovery$indy$3(int var0, long var1);
   private static native String recovery$indy$4(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$5(int var0, long var1);
   private static native String recovery$indy$6(int var0, long var1);
   private static native byte[] recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native C_47iz recovery$indy$8(long var0, long var2);
   private static native String recovery$indy$9(Object var0, long var1, Object var3, long var4, long var6);
   private static native byte[] recovery$indy$10(Object var0, long var1, long var3, long var5);
   private static native Client recovery$indy$11(long var0, long var2);
   private static native String recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$13(int var0, long var1);
   private static native C_47iz recovery$indy$14(long var0, long var2);
   private static native String recovery$indy$15(Object var0, long var1, Object var3, long var4, long var6);
   private static native double recovery$indy$16(Object var0, long var1, long var3);
   private static native int[] recovery$indy$17(long var0, long var2);
   private static native String recovery$indy$18(double var0, int var2, long var3, long var5);
   private static native String recovery$indy$19(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$20(Object var0, long var1, long var3);
   private static native String recovery$indy$21(Object var0, Object var1, long var2, boolean var4, long var5, long var7);
   private static native String recovery$indy$22(int var0, long var1);
   private static native String recovery$indy$23(int var0, long var1);
   private static native boolean recovery$indy$24(Object var0, long var1, long var3);
   private static native String recovery$indy$25(int var0, long var1);
   private static native void recovery$indy$26(long var0, Object var2, long var3, long var5);
   private static native String recovery$indy$27(int var0, long var1);
   private static native String recovery$indy$28(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$29(Object var0, long var1, long var3);
   private static native String recovery$indy$30(Object var0, Object var1, long var2, boolean var4, long var5, long var7);
   private static native String recovery$indy$31(int var0, long var1);
   private static native String recovery$indy$32(int var0, long var1);
   private static native boolean recovery$indy$33(Object var0, long var1, long var3);
   private static native String recovery$indy$34(int var0, long var1);
   private static native void recovery$indy$35(long var0, Object var2, long var3, long var5);
   private static native String recovery$indy$36(int var0, long var1);
   private static native int[] recovery$indy$37(long var0, long var2);
   private static native String recovery$indy$38(int var0, long var1);
   private static native File recovery$indy$39(long var0, Object var2, long var3, long var5) throws java.io.FileNotFoundException;
   private static native String recovery$indy$40(int var0, long var1);
   private static native Client recovery$indy$41(long var0, long var2);
   private static native String recovery$indy$42(Object var0, long var1, byte var3, long var4, long var6);
   private static native void recovery$indy$43(Object var0, Object var1, long var2, boolean var4, long var5, long var7);
   private static native String recovery$indy$44(int var0, long var1);
   private static native File recovery$indy$45(long var0, Object var2, long var3, long var5) throws java.io.FileNotFoundException;
   private static native String recovery$indy$46(int var0, long var1);
   private static native int[] recovery$indy$47(long var0, long var2);
   private static native C_473U recovery$indy$48(Object var0, long var1, long var3);
   private static native String recovery$indy$49(int var0, long var1);
   private static native String recovery$indy$50(int var0, long var1);
   private static native void recovery$indy$51(Object var0, boolean var1, long var2, long var4, long var6);
   private static native String recovery$indy$52(int var0, long var1);
   private static native void recovery$indy$53(Object var0, boolean var1, long var2, long var4, long var6);
   private static native void recovery$indy$54(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$55(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$56(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$57(Object var0, long var1, long var3);
   private static native void recovery$indy$58(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$60();
}
