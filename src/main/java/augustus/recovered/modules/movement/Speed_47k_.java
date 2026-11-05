package augustus.recovered.modules.movement;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40X;
import net.C_41Q;
import net.C_45a;
import net.C_45n;
import net.C_471S;
import net.C_472n;
import net.C_476v;
import net.C_477G;
import net.C_4780;
import net.C_4783;
import net.C_4785;
import net.C_4789;
import net.C_478B;
import net.C_478E;
import net.C_478I;
import net.C_478J;
import net.C_478K;
import net.C_478L;
import net.C_478M;
import net.C_478N;
import net.C_478P;
import net.C_478R;
import net.C_478Z;
import net.C_478a;
import net.C_478c;
import net.C_478d;
import net.C_478g;
import net.C_478m;
import net.C_478p;
import net.C_478q;
import net.C_478u;
import net.C_478w;
import net.C_478x;
import net.C_478y;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47K7;
import client.module.Module;
import net.C_47Rw;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TW;
import client.setting.Setting;
import client.setting.ModeSetting;
import net.C_47U0;
import net.C_47VK;
import net.C_47VO;
import net.C_47Vc;
import net.C_47hP;
import net.C_47hi;
import net.C_47iC;
import net.C_47mz;
import net.C_47ob;
import net.C_47od;
import net.C_47tK;
import client.module.Category;
import net.C_47uG;
import net.C_47xz;
import net.C_47zh;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Speed_47k_ extends client.module.Module implements net.C_45a,net.C_47U0,net.C_47xz,net.C_47od,net.C_47hi,net.C_47Vc,net.C_41Q,net.C_47iC,net.C_471S,net.C_47mz {
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingVanillaSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDojoSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingHeight = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDamageBoost = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDMGSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTimeManipulationTimer = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTimeManipulationTPTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingInteractSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingMouseSensi = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingAutoJump = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyWhileMove = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAdditionalSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCorrectMovement = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_47E = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.ConcurrentHashMap field_47Q = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.lang.String field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_478Z field_47l = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static net.C_47tK field_47S; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String field_47v; // Runtime access flags and ConstantValue are restored from the original class.
    private static long b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native void b();

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method h(long a0,long a1);

   private static String[] method_46$3d4b98126e(int var0) {
      return new String[var0];
   }



   private C_478L method_46$c79612cc61(File var1, long var2, boolean var4) {
      String var15;
      C_478L var17;
      boolean var24;
      label75: {
         label74: {
            var2 = b ^ var2;
            long var10001 = var2 ^ 105323322933230L;
            int var5 = (int)((var2 ^ 105323322933230L) >>> 48);
            int var6 = (int)((var2 ^ 105323322933230L) << 16 >>> 48);
            int var7 = (int)(var10001 << 32 >>> 32);
            long var8 = var2 ^ 38233513750361L;
            long var10 = var2 ^ 100827845565610L;
            long var12 = var2 ^ 105295459631147L;
            var15 = var1.getName().substring(0, Math.max(var1.getName().length() - 5, 0));
            var24 = recovery$indy$1(332892902806835324L, var2);
            JsonArray var16 = recovery$indy$2(this.field_44, var10, var1.getName(), null, 325335315945570724L, var2);
            boolean var14 = var24;
            var17 = new C_478L(var15, (short)var5, this, (short)var6, var7);
            JsonArray var22 = var16;
            if (var14) {
               if (var16 == null) {
                  JsonObject var18 = recovery$indy$3(var12, this.field_44, var1.getName(), null, 325890504147415026L, var2);
                  var24 = var14;
                  if (var2 >= 0L) {
                     if (var14) {
                        if (var18 == null) {
                           return null;
                        }

                        recovery$indy$4(field_47S, new Module[]{var17.field_45}, 324261974210577355L, var2);
                     }

                     var24 = recovery$indy$6(field_47S, var18, var8, true, recovery$indy$5(), 324604959796564546L, var2);
                  }

                  boolean var19 = var24;
                  var24 = var14;
                  if (var2 > 0L) {
                     if (!var14) {
                        return null;
                     }

                     var24 = var19;
                  }

                  if (var2 >= 0L) {
                     if (!var24) {
                        System.out.println(recovery$indy$7(3144, 6062070448443640765L ^ var2));
                        return null;
                     }

                     var24 = var14;
                  }

                  if (var2 < 0L) {
                     break label75;
                  }

                  if (var24) {
                     break label74;
                  }
               }

               var22 = var16;
            }

            var22.forEach(recovery$indy$8(var17));
         }

         var24 = var4;
      }

      if (!var24) {
         return var17;
      }

      try {
         this.field_47Q.put(var15, MessageDigest.getInstance(recovery$indy$9(18065, 6234512656046817602L ^ var2)).digest(Files.readAllBytes(var1.toPath())));
         return var17;
      } catch (NoSuchAlgorithmException | IOException var20) {
         throw new RuntimeException(var20);
      }
   }




    private static native int e(long a0,long a1);

   public void method_42$0db73fbf69(long var1, C_47VO var3) {
      long var10;
      int var10000;
      boolean var10001;
      label44: {
         boolean var12;
         long var4 = var1 ^ 118533900571476L;
         long var6 = var1 ^ 60877589741279L;
         long var8 = var1 ^ 135442579221586L;
         var10 = var1 ^ 54058444301125L;
         var12 = recovery$indy$10(-6221290663821214389L, var1);
         recovery$indy$12(recovery$indy$11(this, var4, -6221110414463220084L, var1), var3, -6218432153378110083L, var1);
         float var13;
         var10000 = (var13 = recovery$indy$13(field_43, -6218172588062622224L, var1).field_48R - 4.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
         label43:
         if (var12) {
            if (var10000 > 0) {
               var10000 = (int) ((recovery$indy$14(this.settingMode, var8, -6218582517475854620L, var1).equals(recovery$indy$15(8000, 5204467505772524989L ^ var1))) ? 1 : 0);
               var10001 = var12;
               if (var1 <= 0L) {
                  break label44;
               }

               if (!var12) {
                  break label43;
               }

               if (var10000 == 0) {
                  var3.cancel();
               }
            }

            var10000 = (int) ((recovery$indy$16(var6, -6220779532430061841L, var1)) ? 1 : 0);
         }

         var10001 = var12;
      }

      if (var10001) {
         if (var10000 != 0) {
            return;
         }

         var10000 = (int) ((recovery$indy$17(this.settingCorrectMovement, -6220268604881524203L, var1)) ? 1 : 0);
      }

      if (var10000 == 0) {
         recovery$indy$19(var3, recovery$indy$18(var10, -6218826286394938985L, var1), -6220098942475163462L, var1);
      }
   }



    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   public synchronized void method_41$e45a9973e5(long var1) {
        java.util.concurrent.ConcurrentHashMap var56;
        boolean var58;
        boolean var60;
        java.lang.String var62;
      long var3;
      long var5;
      boolean var9;
      java.util.HashMap var10;
      java.util.ArrayList var11;
      Speed_47k_ var59;
      label201: {
         var1 = b ^ var1;
         var3 = var1 ^ 37065229042370L;
         var5 = var1 ^ 13498187158043L;
         long var7 = var1 ^ 30885398809654L;
         var10 = new java.util.HashMap(this.field_47E);
         boolean var10000 = Fly_47kE.method_49t$aae029aa0a();
         var11 = new java.util.ArrayList();
         var9 = var10000;
         java.io.File var12 = new java.io.File(this.field_44);
         java.io.File[] var13 = var12.listFiles();
         label200:
         if (!var9) {
            label205: {
               java.io.File[] var51 = var13;
               if (var1 > 0L) {
                  if (var13 == null) {
                     break label205;
                  }

                  var51 = var13;
               }

               java.io.File[] var14 = var51;
               int var15 = var14.length;
               int var16 = 0;

               while (var16 < var15) {
                  java.io.File var17 = var14[var16];
                  boolean var52 = var9;
                  if (var1 > 0L) {
                     if (var9) {
                        break label200;
                     }

                     var52 = var9;
                  }

                  if (var1 > 0L) {
                     if (!var52) {
                        label208: {
                           String var53 = var17.getName();
                           short var10001 = ((short) (15750));
                           if (var1 >= 0L) {
                              if (!var53.contains(".json")) {
                                 break label208;
                              }

                              var53 = var17.getName();
                              var10001 = ((short) (0));
                           }

                           label179: {
                              label209: {
                                 String var18;
                                 label210: {
                                    var18 = var53.substring(var10001, Math.max(var17.getName().length() - 5, 0));
                                    boolean var54 = var11.add(var18);
                                    if (var1 > 0L) {
                                       var59 = this;
                                       if (var9) {
                                          break label179;
                                       }

                                       var56 = this.field_47Q;
                                       var62 = var18;
                                       if (var1 < 0L) {
                                          break label210;
                                       }

                                       var54 = this.field_47Q.containsKey(var18);
                                    }

                                    if (!var54) {
                                       break label209;
                                    }

                                    var56 = this.field_47Q;
                                    var62 = var18;
                                 }

                                 byte[] var19 = (byte[])var56.get(var62);
                                 byte[] var57 = new byte[0];

                                 byte[] var20;
                                 try {
                                    var20 = java.security.MessageDigest.getInstance("SHA-256").digest(java.nio.file.Files.readAllBytes(var17.toPath()));
                                 } catch (java.security.NoSuchAlgorithmException | java.io.IOException var43) {
                                    throw new RuntimeException(var43);
                                 }

                                 label166: {
                                    label212: {
                                       label213: {
                                          if (!var9) {
                                             if (!java.util.Arrays.equals(var20, var19)) {
                                                break label213;
                                             }

                                             var10.put(var18, this.field_42.get(var18));
                                          }

                                          var58 = var9;
                                          if (var1 < 0L) {
                                             break label166;
                                          }

                                          if (!var9) {
                                             break label212;
                                          }
                                       }

                                       boolean var22 = false;
                                       long var23 = var7;
                                       java.io.File var25 = var17;
                                       Speed_47k_ var26 = this;
                                       net.C_478L var21 = var26.method_46$c79612cc61(var25, var23, var22);
                                       if (!var9) {
                                          if (var21 == null) {
                                             break label208;
                                          }

                                          net.C_478L var27 = var21;
                                          var10.put(var27.method_47$0e30dfc966(), var21);
                                          this.field_47Q.put(var18, var20);
                                       }
                                    }

                                    var58 = var9;
                                 }

                                 if (!var58) {
                                    break label208;
                                 }
                              }

                              var59 = this;
                           }

                           boolean var28 = true;
                           long var29 = var7;
                           java.io.File var31 = var17;
                           Speed_47k_ var32 = var59;
                           net.C_478L var50 = var32.method_46$c79612cc61(var31, var29, var28);
                           if (!var9 && var50 != null) {
                              net.C_478L var33 = var50;
                              var10.put(var33.method_47$0e30dfc966(), var50);
                           }
                        }

                        var16++;
                     }

                     var52 = var9;
                  }

                  if (var52) {
                     break;
                  }
               }
            }

            this.field_42.clear();
            var59 = this;
            if (var1 <= 0L) {
               break label201;
            }

            this.field_42.putAll(var10);
         }

         var59 = this;
      }

      java.util.Iterator var45 = var59.field_47Q.keySet().iterator();

      label125:
      while (true) {
         if (var45.hasNext()) {
            String var47 = (String)var45.next();
            if (!var9) {
               var60 = var11.contains(var47);
               if (var9) {
                  break;
               }

               if (!var60) {
                  this.field_47Q.remove(var47);
               }
            }

            if (!var9) {
               continue;
            }
         }

         do {
            var11.clear();
            var10.clear();
            if (var1 > 0L) {
               long var34 = var3;
               client.setting.ModeSetting var36 = this.settingMode;
               var60 = this.field_42.containsKey(var36.method_46$5f9dc63072(var34));
               break label125;
            }

            String var48 = (String)(Object) (this.field_42);
            if (!var9) {
               var60 = var11.contains(var48);
               if (var9) {
                  break label125;
               }

               if (!var60) {
                  this.field_47Q.remove(var48);
               }
            }
         } while (var9);
      }

      boolean var46 = var60;
      String[] var49 = ((java.lang.String[]) (this.field_42.keySet().stream().sorted().toArray((java.util.function.IntFunction<String[]>)recovery$indy$flow$129())));
      boolean var61 = var9;
      if (var1 > 0L) {
         if (var9) {
            return;
         }

         var61 = var46;
      }

      if (!var61) {
         String var37 = var49[0];
         client.setting.ModeSetting var38 = this.settingMode;
         var38.method_49$a7421bf54c(var37);
      }

      long var39 = var5;
      String[] var41 = var49;
      client.setting.ModeSetting var42 = this.settingMode;
      var42.method_42$7446cc8078(var41, var39);
   }






   public void method_41$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 742314321611L;
      long var10001 = var1 ^ 1591666788373L;
      int var6 = (int)((var1 ^ 1591666788373L) >>> 32);
      int var7 = (int)((var1 ^ 1591666788373L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      recovery$indy$23(recovery$indy$22(this, var4, -7190763802721783021L, var1), var6, var7, var3, var8, -7192398970030528733L, var1);
   }



   public void method_41$0db73fbf69(long var1, C_47VO var3) {
      long var6;
      int var8;
      int var9;
      int var10;
      Speed_47k_ var14;
      label27: {
         label26: {
            long var4 = var1 ^ 29226247548657L;
            var6 = var1 ^ 76986148946810L;
            long var10001 = var1 ^ 29802051141295L;
            var8 = (int)((var1 ^ 29802051141295L) >>> 32);
            var9 = (int)((var1 ^ 29802051141295L) << 32 >>> 48);
            var10 = (int)(var10001 << 48 >>> 48);
            long var11 = var1 ^ 31750970979179L;
            boolean var13 = recovery$indy$24(-5077908839202984603L, var1);
            boolean var10000 = recovery$indy$25(var4, -5078525240242708799L, var1);
            if (var13) {
               if (var10000) {
                  break label26;
               }

               var14 = this;
               if (!var13) {
                  break label27;
               }

               var10000 = recovery$indy$26(this.settingCorrectMovement, -5079207829042906565L, var1);
            }

            if (!var10000) {
               recovery$indy$28(var3, recovery$indy$27(var11, -5072065031351862855L, var1), -5078959505216489324L, var1);
            }
         }

         var14 = this;
      }

      recovery$indy$30(recovery$indy$29(var14, var6, -5078933641805310302L, var1), var3, var8, (char)var9, (short)var10, -5072752079645541686L, var1);
   }



    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   public static void method_40$a7421bf54c(String var0) {
      field_47v = var0;
   }



   private static String[] method_40$3d4b98126e(int var0) {
      return new String[var0];
   }



   public void method_40$e781d6169a(C_47zh var1, long var2) {
      long var4 = var2 ^ 119928586981138L;
      long var6 = var2 ^ 1816547374977L;
      recovery$indy$32(recovery$indy$31(this, var4, 8497214789338340042L, var2), var1, var6, 8497261495111804880L, var2);
   }



   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      long var5 = (long)var1 << 32 | var3 << 32 >>> 32;
      long var7 = var5 ^ 125384268368392L;
      long var9 = var5 ^ 133674423319403L;
      long var10001 = var5 ^ 95495382023267L;
      int var11 = (int)((var5 ^ 95495382023267L) >>> 32);
      int var12 = (int)((var5 ^ 95495382023267L) << 32 >>> 48);
      int var13 = (int)(var10001 << 48 >>> 48);
      long var14 = var5 ^ 115942598083693L;
      recovery$indy$34(this, var7, recovery$indy$33(this.settingMode, var14, 4723214396357631707L, var5), 4725582438776880540L, var5);
      recovery$indy$36(recovery$indy$35(this, var9, 4725753014657363635L, var5), var2, var11, var12, (char)var13, 4723426050808799645L, var5);
   }



   private static Boolean method_44$4fb368974c(C_47TW var0) {
      return true;
   }



   public static String method_44$0e30dfc966() {
      return field_47v;
   }



   private boolean method_48$aae029aa0a() {
      long var1 = b ^ 91425476553619L;
      long var3 = var1 ^ 39955746038262L;
      long var10002 = 7212364565642443584L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("EntitySpeed");
   }



   public void method_48$8d573c1d69(long var1, C_47hP var3) {
      long var4 = var1 ^ 62422217248726L;
      recovery$indy$38(recovery$indy$37(this, var4, -781235986541340146L, var1), var3, -777457241679262571L, var1);
   }



   private C_478c method_49$a331282e8b(long var1) {
      var1 = b ^ var1;
      long var3 = var1 ^ 126590395101335L;
      return ((net.C_478c) (this.field_42.getOrDefault(recovery$indy$39(this.settingMode, var3, -759384127131620831L, var1), this.field_47l)));
   }



   private boolean method_45$aae029aa0a() {
      long var1 = b ^ 131615419576129L;
      long var3 = var1 ^ 843178157348L;
      long var10002 = 6973071745114865554L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Dojo");
   }



   private static void method_45$cb7256863f(net.C_478L var0, com.google.gson.JsonElement var1) {
      long var2 = b ^ 20004030681124L;
      long var10001 = var2 ^ 117274367881851L;
      int var4 = (int)((var2 ^ 117274367881851L) >>> 48);
      int var5 = (int)((var2 ^ 117274367881851L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 89562711292140L;
      com.google.gson.JsonObject var10 = var1.getAsJsonObject();
      String var11 = var10.get("Name").getAsString();
      boolean var10000 = Fly_47kE.method_49t$aae029aa0a();
      net.C_478L var14 = var0;
      net.C_477G var15 = var14.method_41$e0d3f31637();
      client.setting.Setting var12 = (client.setting.Setting)var15.method_42$53a5457c0a().get(var11);
      boolean var9 = var10000;
      client.setting.Setting var31 = var12;
      if (var9) {
         try {
            com.google.gson.JsonObject var16 = var10;
            long var17 = var7;
            net.C_475g var19 = net.C_475g.field_47m;
            client.setting.Setting var20 = var31;
            var20.method_49$0512102648((net.C_47uG)var19, var17, var16);
         } catch (Exception var25) {
            java.io.PrintStream var33 = System.err;
            StringBuilder var35 = new StringBuilder().append("Failed to load Setting: ");
            short var36 = (short)var4;
            short var37 = (short)var5;
            int var27 = var6;
            short var28 = var37;
            short var29 = var36;
            client.setting.Setting var30 = var12;
            var33.println(var35.append(var30.method_48$3d4640f80c(var29, var28, var27)).toString());
         }
      } else if (var12 != null) {
         label17:
         try {
            var31 = var12;
            break label17;
         } catch (Exception var26) {
            java.io.PrintStream var32 = System.err;
            StringBuilder var34 = new StringBuilder().append("Failed to load Setting: ");
            short var10003 = (short)var4;
            short var10004 = (short)var5;
            int var21 = var6;
            short var22 = var10004;
            short var23 = var10003;
            client.setting.Setting var24 = var12;
            var32.println(var34.append(var24.method_48$3d4640f80c(var23, var22, var21)).toString());
         }
      }
   }




   private void method_45$5da6881d30(long var1, C_478c var3) {
      var1 = b ^ var1;
      this.field_42.put(recovery$indy$40(var3, 1702955939371320290L, var1), var3);
   }



   public void method_45$e45a9973e5(long var1) {
      long var17 = b ^ var1;
      long var3 = var17 ^ 114234605869306L;
      long var5 = var17 ^ 81460236355619L;
      long var7 = var17 ^ 99263873586702L;
      this.field_42.clear();
      boolean var10000 = recovery$indy$flow$213(6701900384814324697L, var17);
      this.field_42.putAll(this.field_47E);
      java.io.File var10 = new java.io.File(this.field_44);
      boolean var9 = var10000;
      java.io.File[] var11 = var10.listFiles();
      if (!var9) {
         boolean var20;
         String[] var23;
         label192: {
            label163: {
               if (var11 != null) {
                  java.io.File[] var19 = var11;
                  int var22 = var19.length;
                  int var24 = 0;
                  if (var24 < var22) {
                     java.io.File var25 = var19[var24];
                     boolean var31 = var9;
                     if (var17 > 0L) {
                        while (true) {
                           if (!var31) {
                              if (var25.getName().contains((String)recovery$indy$flow$222(8814, 471866198773972000L ^ var17))) {
                                 net.C_478L var16 = (net.C_478L)recovery$indy$flow$224(this, var25, var7, true, 6708723016592910454L, var17);
                                 if (var16 != null) {
                                    this.field_42.put((String)recovery$indy$flow$226(var16, 6708199222710946136L, var17), var16);
                                 }
                              }

                              var24++;
                           }

                           if (var9 || var24 >= var22) {
                              var20 = this.field_42.containsKey((String)recovery$indy$flow$230(this.settingMode, var3, 6709014273830240844L, var17));
                              var23 = ((java.lang.String[]) (this.field_42.keySet().stream().sorted().toArray((java.util.function.IntFunction<String[]>)recovery$indy$flow$236())));
                              var10000 = var9;
                              break label192;
                           }

                           var25 = var19[var24];
                           var31 = var9;
                        }
                     }

                     while (!var31 && var24 < var22) {
                        java.io.File var32 = var19[var24];
                        var31 = var9;
                     }

                     this.field_42.containsKey((String)recovery$indy$flow$230(this.settingMode, var3, 6709014273830240844L, var17));
                     var23 = ((java.lang.String[]) (this.field_42.keySet().stream().sorted().toArray((java.util.function.IntFunction<String[]>)recovery$indy$flow$236())));
                     var10000 = var9;
                     break label163;
                  }
               }

               var20 = this.field_42.containsKey((String)recovery$indy$flow$230(this.settingMode, var3, 6709014273830240844L, var17));
               var23 = ((java.lang.String[]) (this.field_42.keySet().stream().sorted().toArray((java.util.function.IntFunction<String[]>)recovery$indy$flow$236())));
               var10000 = var9;
               if (var17 > 0L) {
                  break label192;
               }
            }

            if (!var10000) {
               recovery$indy$flow$240(this.settingMode, var23[0], 6709640561305338476L, var17);
            }

            recovery$indy$flow$242(this.settingMode, var23, var5, 6709969026940858825L, var17);
            return;
         }

         if (!var10000) {
            if (!var20) {
               recovery$indy$flow$240(this.settingMode, var23[0], 6709640561305338476L, var17);
            }

            recovery$indy$flow$242(this.settingMode, var23, var5, 6709969026940858825L, var17);
         }
      } else {
         boolean var18;
         String[] var21;
         label196: {
            java.io.File[] var12 = var11;
            int var13 = var12.length;
            byte var14 = ((byte) (0));
            if (var14 < var13) {
               java.io.File var15 = var12[var14];
               boolean var26 = var9;
               if (var17 > 0L) {
                  while (true) {
                     if (!var26) {
                        var10000 = var15.getName().contains((String)recovery$indy$flow$222(8814, 471866198773972000L ^ var17));
                     } else {
                        if (!var9 && var14 < var13) {
                           var15 = var12[var14];
                           var26 = var9;
                           continue;
                        }

                        var10000 = this.field_42.containsKey((String)recovery$indy$flow$230(this.settingMode, var3, 6709014273830240844L, var17));
                     }

                     var18 = var10000;
                     var21 = ((java.lang.String[]) (this.field_42.keySet().stream().sorted().toArray((java.util.function.IntFunction<String[]>)recovery$indy$flow$236())));
                     var10000 = var9;
                     break label196;
                  }
               }

               while (!var26 && var14 < var13) {
                  java.io.File var27 = var12[var14];
                  var26 = var9;
               }

               this.field_42.containsKey((String)recovery$indy$flow$230(this.settingMode, var3, 6709014273830240844L, var17));
               var21 = ((java.lang.String[]) (this.field_42.keySet().stream().sorted().toArray((java.util.function.IntFunction<String[]>)recovery$indy$flow$236())));
               var10000 = var9;
            } else {
               var18 = this.field_42.containsKey((String)recovery$indy$flow$230(this.settingMode, var3, 6709014273830240844L, var17));
               var21 = ((java.lang.String[]) (this.field_42.keySet().stream().sorted().toArray((java.util.function.IntFunction<String[]>)recovery$indy$flow$236())));
               var10000 = var9;
               if (var17 > 0L) {
                  break label196;
               }
            }

            if (!var10000) {
               recovery$indy$flow$240(this.settingMode, var21[0], 6709640561305338476L, var17);
            }

            recovery$indy$flow$242(this.settingMode, var21, var5, 6709969026940858825L, var17);
            return;
         }

         if (!var10000) {
            if (!var18) {
               recovery$indy$flow$240(this.settingMode, var21[0], 6709640561305338476L, var17);
            }

            recovery$indy$flow$242(this.settingMode, var21, var5, 6709969026940858825L, var17);
         }
      }
   }




   public void method_45$6c53b83f97(C_476v var1, long var2) {
      long var4 = var2 ^ 123559738006699L;
      long var6 = var2 ^ 18570855997942L;
      recovery$indy$50(recovery$indy$49(this, var4, -1849511977451484813L, var2), var1, var6, -1852319720229768667L, var2);
   }



   public void method_47$2fe7f6c171(C_47Rw var1, long var2) {
      int var4 = (int)((var2 ^ 67742332553731L) >>> 48);
      long var5 = (var2 ^ 67742332553731L) << 16 >>> 16;
      long var7 = var2 ^ 79591999672621L;
      recovery$indy$52(recovery$indy$51(this, var7, 3157883864789566709L, var2), (short)var4, var1, var5, 3155804132554992003L, var2);
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var4 = var2 ^ 93355430142516L;
      long var10001 = var2 ^ 82345442452580L;
      int var6 = (int)((var2 ^ 82345442452580L) >>> 48);
      int var7 = (int)((var2 ^ 82345442452580L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      recovery$indy$54(recovery$indy$53(this, var4, 6397946216510273516L, var2), var1, (short)var6, (char)var7, var8, 6401551837381767927L, var2);
   }



   public void method_47$4ff7ee0874(char var1, C_476v var2, int var3, short var4) {
      long var5 = (long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 119698041999861L;
      long var9 = var5 ^ 13602099211432L;
      recovery$indy$56(recovery$indy$55(this, var7, 3101619063711876141L, var5), var2, var9, 3104424602639286139L, var5);
   }



   public void method_45p$a6cfe74df2(short var1, long var2) {
      long var4 = (long)var1 << 48 | var2 << 16 >>> 16;
      long var6 = var4 ^ 132173944482689L;
      long var10001 = var4 ^ 140214340366745L;
      int var8 = (int)((var4 ^ 140214340366745L) >>> 32);
      int var9 = (int)((var4 ^ 140214340366745L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      recovery$indy$58(recovery$indy$57(this, var6, 5872481646126841433L, var4), var8, (char)var9, var10, 5872128719131272230L, var4);
   }



   private boolean method_41l$aae029aa0a() {
      long var1 = b ^ 54047390571123L;
      long var3 = var1 ^ 77342303391766L;
      long var10002 = -3028928733844944224L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("45Degree");
   }



   private boolean method_41b$aae029aa0a() {
      long var1 = b ^ 6623841039598L;
      long var3 = var1 ^ 124753510678155L;
      long var10002 = -330413704388025283L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Verus");
   }



   private boolean method_41h$aae029aa0a() {
      long var1 = b ^ 70395699969137L;
      long var3 = var1 ^ 60980175418900L;
      long var10002 = 8355695171488607394L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("TimeManipulation");
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$59(this, 0, 1, var3, -7103204403908174301L, var1);
      recovery$indy$60(this, 28, var5, -7102887170338059068L, var1);
      recovery$indy$61(this, 40, var5, -7102887170338059068L, var1);
      recovery$indy$62(this, 20, var5, -7102887170338059068L, var1);
      recovery$indy$63(this, 21, var5, -7102887170338059068L, var1);
      recovery$indy$64(this, 43, var5, -7102887170338059068L, var1);
      recovery$indy$65(this, 18, 1, var3, -7103204403908174301L, var1);
      recovery$indy$66(this, 26, 1, var3, -7103204403908174301L, var1);
      recovery$indy$67(this, 41, var5, -7102887170338059068L, var1);
      recovery$indy$68(this, 25, var5, -7102887170338059068L, var1);
   }



   private boolean method_41Z$aae029aa0a() {
      long var1 = b ^ 44458937522511L;
      long var3 = var1 ^ 104587489743658L;
      long var10002 = 6254105795451636124L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Interact");
   }



   private boolean method_410$aae029aa0a() {
      long var1 = b ^ 10948506712496L;
      long var3 = var1 ^ 139111555625941L;
      long var10000 = -5319041961638186762L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10002 = -5317575165273659037L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("VOnGround");
      if (!var5) {
         if (!var12) {
            var10002 = -5317575165273659037L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var14 = var11.method_46$5f9dc63072(var9).equals("VBhop");
            if (var5) {
               return var14;
            }

            if (!var14) {
               return false;
            }
         }

         var12 = true;
      }

      return var12;
   }



   private boolean method_41R$aae029aa0a() {
      long var1 = b ^ 116857591723980L;
      long var3 = var1 ^ 32127634603433L;
      long var10002 = -5167794592706681057L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("45Degree");
   }



   private boolean method_419$aae029aa0a() {
      long var1 = b ^ 109361513917631L;
      long var3 = var1 ^ 22020250232538L;
      long var10002 = -6684671104960250772L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("VBhop");
   }



   private boolean method_41y$aae029aa0a() {
      long var1 = b ^ 96617783498978L;
      long var3 = var1 ^ 35939743896199L;
      long var10000 = -2919226897109744738L;
      boolean var5 = Fly_47kE.method_48$aae029aa0a();
      long var10002 = -2925523754784339919L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("VOnGround");
      if (var5) {
         if (!var12) {
            var10002 = -2925523754784339919L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var14 = var11.method_46$5f9dc63072(var9).equals("VBhop");
            if (!var5) {
               return var14;
            }

            if (!var14) {
               return false;
            }
         }

         var12 = true;
      }

      return var12;
   }



   private boolean method_41J$aae029aa0a() {
      long var1 = b ^ 81519924947730L;
      long var3 = var1 ^ 67431475847543L;
      long var10000 = -1977978119436160914L;
      boolean var5 = Fly_47kE.method_48$aae029aa0a();
      long var10002 = -1975270032713843775L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Verus");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = -1979212386132957392L;
         BooleanSetting var9 = this.settingDamageBoost;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



   private boolean method_41s$aae029aa0a() {
      long var1 = b ^ 97366988508167L;
      long var3 = var1 ^ 52769306330722L;
      long var10002 = -8970188642316870444L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("TimeManipulation");
   }



   private boolean method_414$aae029aa0a() {
      long var1 = b ^ 110531252063495L;
      long var3 = var1 ^ 21953104906082L;
      long var10002 = -4430626150301901356L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("45Degree");
   }



   public void method_45q$e45a9973e5(long var1) {
      int var3 = (int)((var1 ^ 93708908121781L) >>> 48);
      long var4 = (var1 ^ 93708908121781L) << 16 >>> 16;
      long var6 = var1 ^ 36493120046513L;
      recovery$indy$70(recovery$indy$69(this, var6, 4561979258390663273L, var1), (char)var3, var4, 4561115967328609834L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 81533103624495L;
      long var5 = var1 ^ 3638372904552L;
      boolean var7 = recovery$indy$71(-7740032327948025737L, var1);
      recovery$indy$72(field_43, -7739770010998070118L, var1).field_43 = 1.0F;
      if (var7) {
         label20: {
            EntityPlayerSP var10000 = recovery$indy$73(field_43, -7743670760000880436L, var1);
            if (var1 >= 0L) {
               if (var10000 == null) {
                  break label20;
               }

               recovery$indy$74(field_43, -7743670760000880436L, var1).method_49$24a796ab4c(0.02F);
               var10000 = recovery$indy$75(field_43, -7743670760000880436L, var1);
            }

            var10000.method_45$24a796ab4c(0.1F);
         }

         recovery$indy$77(recovery$indy$76(this, var5, -7739922456058856528L, var1), var3, -7739517401564247856L, var1);
      }
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 24292865482526L;
      long var8 = var4 ^ 117836091845785L;
      boolean var10 = recovery$indy$78(2730294956914438401L, var4);
      recovery$indy$79(field_43, 2729398500273919468L, var4).field_43 = 1.0F;
      if (var10) {
         label20: {
            EntityPlayerSP var10000 = recovery$indy$80(field_43, 2737873218502341050L, var4);
            if (var2 >= 0) {
               if (var10000 == null) {
                  break label20;
               }

               recovery$indy$81(field_43, 2737873218502341050L, var4).method_49$24a796ab4c(0.02F);
               recovery$indy$82(field_43, 2737873218502341050L, var4).method_45$24a796ab4c(0.1F);
               var10000 = recovery$indy$83(field_43, 2737873218502341050L, var4);
            }

            var10000.field_48g = 0.6F;
         }

         recovery$indy$85(recovery$indy$84(this, var6, 2729270296014506694L, var4), var8, 2730003411640259182L, var4);
      }
   }



   public void method_487$da8c82d5d4() {
      long var1 = b ^ 122108361182149L;
      long var3 = var1 ^ 9481805430438L;
      long var5 = var1 ^ 121061601792089L;
      long var10002 = -4298599704431514754L;
      long var7 = var3;
      Speed_47k_ var9 = this;
      C_478c var10000 = var9.method_49$a331282e8b(var7);
      var10002 = -4296454831982583790L;
      long var10 = var5;
      C_478c var12 = var10000;
      var12.method_41$e45a9973e5(var10);
   }



    public Speed_47k_(long a0) {
        super((java.lang.String) ("Speed"),(java.lang.String) ("Schnell"),(long) (((augustus.recovered.modules.movement.Speed_47k_.b ^ a0) ^ 81397771955980L)),(java.awt.Color) (new java.awt.Color((int) (74),(int) (133),(int) (93))),(client.module.Category) (client.module.Category.MOVEMENT));

        long constructorKey10;
        long constructorKey12;
        long constructorKey9;
        long constructorKey6;
        int constructorPart5;
        int constructorPart4;
        int constructorPart3;
        long constructorKey8;
        long constructorKey7;
        long constructorKey11;
        long constructorKey2;
        constructorKey2 = (augustus.recovered.modules.movement.Speed_47k_.b ^ a0);
        constructorPart3 = (int) ((((augustus.recovered.modules.movement.Speed_47k_.b ^ a0) ^ 12263729672363L) >>> 32));
        constructorPart4 = (int) (((((augustus.recovered.modules.movement.Speed_47k_.b ^ a0) ^ 12263729672363L) << 32) >>> 48));
        constructorPart5 = (int) (((((augustus.recovered.modules.movement.Speed_47k_.b ^ a0) ^ 12263729672363L) << 48) >>> 48));
        constructorKey6 = ((augustus.recovered.modules.movement.Speed_47k_.b ^ a0) ^ 56019161294378L);
        constructorKey7 = ((augustus.recovered.modules.movement.Speed_47k_.b ^ a0) ^ 189523358761L);
        constructorKey8 = ((augustus.recovered.modules.movement.Speed_47k_.b ^ a0) ^ 1872406552513L);
        constructorKey9 = ((augustus.recovered.modules.movement.Speed_47k_.b ^ a0) ^ 65023236813591L);
        constructorKey10 = ((augustus.recovered.modules.movement.Speed_47k_.b ^ a0) ^ 91180311953043L);
        constructorKey11 = ((augustus.recovered.modules.movement.Speed_47k_.b ^ a0) ^ 46150268269467L);
        constructorKey12 = ((augustus.recovered.modules.movement.Speed_47k_.b ^ a0) ^ 24718974553232L);
        region1150: {
        int regionValue341;
        java.lang.Object regionValue340;
        java.lang.Object value352;

        region1143: {
        java.lang.Object value351;
        java.lang.Object value350;
        java.lang.Object value349;

        region1137: {
        region1135: {
        java.lang.Object value339;
        boolean value346;
        java.lang.Object value345;
        int regionValue344;

        region1132: {
        java.lang.Object value318;
        net.C_478Z initialized170;
        java.lang.Object value98;
        java.lang.Object value97;
        java.lang.Object value96;
        java.lang.Object value93;
        java.lang.Object value92;
        java.lang.Object value91;
        java.lang.Object value90;
        java.lang.String value87;
        int value85;
        java.lang.Object value82;
        java.lang.Object value81;
        java.lang.Object value80;
        java.lang.Object value79;
        java.lang.Object value75;
        java.lang.Object value73;
        java.lang.Object value72;
        java.lang.Object value71;
        java.lang.Object value68;
        java.lang.Object value66;
        java.lang.Object value65;
        java.lang.Object value64;
        java.lang.Object value63;
        java.lang.Object value59;
        java.lang.Object value57;
        java.lang.Object value56;
        java.lang.Object value55;
        java.lang.Object value52;
        java.lang.Object value50;
        java.lang.Object value49;
        java.lang.Object value48;
        java.lang.Object value45;
        java.lang.Object value43;
        java.lang.Object value42;
        java.lang.Object value41;
        java.lang.Object value38;
        java.lang.Object value37;
        java.lang.Object value36;
        java.lang.Object value35;
        java.lang.Object value338;
        java.lang.Object value337;
        java.lang.Object value336;
        java.lang.Object value332;
        java.lang.Object value331;
        java.lang.Object value330;
        java.lang.Object value326;
        java.lang.Object value325;
        java.lang.Object value324;
        java.lang.Object value320;
        java.lang.String value32;
        java.lang.Object value317;
        java.lang.Object value316;
        java.lang.Object value315;
        java.lang.Object value314;
        java.lang.Object value313;
        java.lang.Object value312;
        java.lang.Object value307;
        java.lang.Object value306;
        java.lang.Object value301;
        java.lang.Object value300;
        int value30;
        java.lang.Object value295;
        java.lang.Object value294;
        java.lang.Object value289;
        java.lang.Object value288;
        java.lang.Object value283;
        java.lang.Object value282;
        java.lang.Object value277;
        java.lang.Object value276;
        java.lang.Object value271;
        java.lang.Object value270;
        boolean value27;
        java.lang.Object value265;
        java.lang.Object value264;
        java.lang.Object value259;
        java.lang.Object value258;
        java.lang.Object value253;
        java.lang.Object value252;
        java.lang.Object value25;
        java.lang.Object value247;
        java.lang.Object value246;
        java.lang.Object value241;
        java.lang.Object value240;
        java.lang.Object value235;
        java.lang.Object value234;
        java.lang.Object value229;
        java.lang.Object value228;
        java.lang.Object value223;
        java.lang.Object value222;
        java.lang.Object value217;
        java.lang.Object value216;
        java.lang.Object value211;
        java.lang.Object value210;
        java.lang.Object value205;
        java.lang.Object value204;
        java.lang.Object value199;
        java.lang.Object value198;
        java.lang.Object value193;
        java.lang.Object value192;
        java.lang.Object value187;
        java.lang.Object value186;
        java.lang.Object value181;
        java.lang.Object value180;
        java.lang.Object value175;
        java.lang.Object value174;
        java.lang.Object value169;
        java.lang.Object value168;
        java.lang.Object value167;
        java.lang.Object value166;
        java.lang.Object value165;
        java.lang.Object value164;
        java.lang.Object value163;
        java.lang.Object value162;
        java.lang.Object value161;
        java.lang.Object value156;
        java.lang.Object value155;
        java.lang.Object value154;
        java.lang.Object value151;
        java.lang.Object value149;
        java.lang.Object value148;
        java.lang.Object value147;
        java.lang.Object value146;
        java.lang.Object value142;
        java.lang.Object value140;
        java.lang.Object value139;
        java.lang.Object value138;
        java.lang.Object value137;
        java.lang.Object value133;
        java.lang.Object value131;
        java.lang.Object value130;
        java.lang.Object value129;
        java.lang.Object value128;
        java.lang.Object value124;
        int value122;
        java.lang.Object value121;
        java.lang.Object value120;
        java.lang.Object value119;
        java.lang.Object value116;
        java.lang.Object value114;
        java.lang.Object value113;
        java.lang.Object value112;
        java.lang.Object value109;
        java.lang.Object value108;
        java.lang.Object value107;
        java.lang.Object value106;
        java.lang.String value103;
        int value101;
        client.setting.NumberSetting initialized99;
        client.setting.NumberSetting initialized83;
        client.setting.BooleanSetting initialized74;
        client.setting.NumberSetting initialized67;
        client.setting.BooleanSetting initialized58;
        client.setting.NumberSetting initialized51;
        client.setting.NumberSetting initialized44;
        java.util.HashMap initialized333;
        net.C_478u initialized308;
        net.C_478p initialized302;
        net.C_478w initialized296;
        net.C_478P initialized290;
        net.C_4785 initialized284;
        client.setting.NumberSetting initialized28;
        net.C_478E initialized278;
        net.C_478m initialized272;
        net.C_478N initialized266;
        net.C_478J initialized260;
        client.setting.ModeSetting initialized26;
        net.C_478y initialized254;
        net.C_4783 initialized248;
        net.C_478q initialized242;
        net.C_478B initialized236;
        net.C_478I initialized230;
        net.C_4789 initialized224;
        net.C_478x initialized218;
        net.C_478g initialized212;
        net.C_478R initialized206;
        net.C_478d initialized200;
        net.C_478K initialized194;
        net.C_478M initialized188;
        net.C_478a initialized182;
        net.C_4780 initialized176;
        java.lang.StringBuilder initialized160;
        java.util.concurrent.ConcurrentHashMap initialized159;
        java.util.HashMap initialized158;
        client.setting.BooleanSetting initialized157;
        client.setting.NumberSetting initialized150;
        client.setting.BooleanSetting initialized141;
        client.setting.BooleanSetting initialized132;
        client.setting.BooleanSetting initialized123;
        client.setting.NumberSetting initialized115;
        short converted84;
        short converted29;
        short converted100;
        java.lang.Object arrayValue321;

        value25 = recovery$indy$flow$372(0);
        initialized26 = new client.setting.ModeSetting((client.module.Module) (this), "Mode", constructorKey8, "", (java.lang.String[]) (value25));
        recovery$indy$flow$374(this, initialized26);
        value27 = recovery$indy$flow$375();
        initialized28 = new client.setting.NumberSetting((client.module.Module) (this), "VanillaSpeed", 1.0D, constructorKey12, 0.0D, Double.longBitsToDouble(4621819117588971520L), 2);
        converted29 = (short) (constructorPart5);
        value30 = (int) (converted29);
        value32 = "Speed";
        value35 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized28))))));
        value36 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value32))))));
        value37 = recovery$indy$flow$380(value35, constructorPart3, value36, constructorPart4, (short) (value30));
        value38 = recovery$indy$flow$381(this);
        value41 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value37))))));
        value42 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value38))))));
        value43 = recovery$indy$flow$384(value41, value42);
        recovery$indy$flow$385(this, value43);
        initialized44 = new client.setting.NumberSetting((client.module.Module) (this), "DojoSpeed", Double.longBitsToDouble(4617315517961601024L), constructorKey12, 1.0D, Double.longBitsToDouble(4621819117588971520L), 2);
        value45 = recovery$indy$flow$388(this);
        value48 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized44))))));
        value49 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value45))))));
        value50 = recovery$indy$flow$391(value48, value49);
        recovery$indy$flow$392(this, value50);
        initialized51 = new client.setting.NumberSetting((client.module.Module) (this), "Height", 1.0D, constructorKey12, 0.0D, Double.longBitsToDouble(4617315517961601024L), 2);
        value52 = recovery$indy$flow$395(this);
        value55 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized51))))));
        value56 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value52))))));
        value57 = recovery$indy$flow$398(value55, value56);
        recovery$indy$flow$399(this, value57);
        initialized58 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey9, "DamageBoost", false);
        value59 = recovery$indy$flow$402(this);
        value63 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized58))))));
        value64 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value59))))));
        value65 = recovery$indy$flow$405(value63, constructorKey6, value64);
        value66 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value65))))));
        recovery$indy$flow$407(this, value66);
        initialized67 = new client.setting.NumberSetting((client.module.Module) (this), "DMGSpeed", 1.0D, constructorKey12, 0.0D, Double.longBitsToDouble(4611686018427387904L), 2);
        value68 = recovery$indy$flow$410(this);
        value71 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized67))))));
        value72 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value68))))));
        value73 = recovery$indy$flow$413(value71, value72);
        recovery$indy$flow$414(this, value73);
        initialized74 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey9, "Strafe", false);
        value75 = recovery$indy$flow$417(this);
        value79 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized74))))));
        value80 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value75))))));
        value81 = recovery$indy$flow$420(value79, constructorKey6, value80);
        value82 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value81))))));
        recovery$indy$flow$422(this, value82);
        initialized83 = new client.setting.NumberSetting((client.module.Module) (this), "TimeManipulationTimer", 1.0D, constructorKey12, 0.0D, Double.longBitsToDouble(4621819117588971520L), 2);
        converted84 = (short) (constructorPart5);
        value85 = (int) (converted84);
        value87 = "TimerSpeed";
        value90 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized83))))));
        value91 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value87))))));
        value92 = recovery$indy$flow$427(value90, constructorPart3, value91, constructorPart4, (short) (value85));
        value93 = recovery$indy$flow$428(this);
        value96 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value92))))));
        value97 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value93))))));
        value98 = recovery$indy$flow$431(value96, value97);
        recovery$indy$flow$432(this, value98);
        initialized99 = new client.setting.NumberSetting((client.module.Module) (this), "TimeManipulationTPTicks", 0.0D, constructorKey12, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        converted100 = (short) (constructorPart5);
        value101 = (int) (converted100);
        value103 = "TPTicks";
        value106 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized99))))));
        value107 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value103))))));
        value108 = recovery$indy$flow$437(value106, constructorPart3, value107, constructorPart4, (short) (value101));
        value109 = recovery$indy$flow$438(this);
        value112 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value108))))));
        value113 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value109))))));
        value114 = recovery$indy$flow$441(value112, value113);
        recovery$indy$flow$442(this, value114);
        initialized115 = new client.setting.NumberSetting((client.module.Module) (this), "InteractSpeed", 1.0D, constructorKey12, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        value116 = recovery$indy$flow$445(this);
        value119 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized115))))));
        value120 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value116))))));
        value121 = recovery$indy$flow$448(value119, value120);
        recovery$indy$flow$449(this, value121);
        value122 = (int) ((value27 ? 1 : 0));
        initialized123 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey9, "MouseSensi", true);
        value124 = recovery$indy$flow$452(this);
        value128 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized123))))));
        value129 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value124))))));
        value130 = recovery$indy$flow$455(value128, constructorKey6, value129);
        value131 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value130))))));
        recovery$indy$flow$457(this, value131);
        initialized132 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey9, "AutoJump", true);
        value133 = recovery$indy$flow$460(this);
        value137 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized132))))));
        value138 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value133))))));
        value139 = recovery$indy$flow$463(value137, constructorKey6, value138);
        value140 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value139))))));
        recovery$indy$flow$465(this, value140);
        initialized141 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey9, "OnlyWhileMove", true);
        value142 = recovery$indy$flow$468(this);
        value146 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized141))))));
        value147 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value142))))));
        value148 = recovery$indy$flow$471(value146, constructorKey6, value147);
        value149 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value148))))));
        recovery$indy$flow$473(this, value149);
        initialized150 = new client.setting.NumberSetting((client.module.Module) (this), "AdditionalSpeed", Double.longBitsToDouble(4596373779694328218L), constructorKey12, 0.0D, Double.longBitsToDouble(4611686018427387904L), 4);
        value151 = recovery$indy$flow$476(this);
        value154 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized150))))));
        value155 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value151))))));
        value156 = recovery$indy$flow$479(value154, value155);
        recovery$indy$flow$480(this, value156);
        initialized157 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey9, "CorrectMovement", true);
        recovery$indy$flow$483(this, initialized157);
        initialized158 = new java.util.HashMap();
        recovery$indy$flow$486(this, initialized158);
        initialized159 = new java.util.concurrent.ConcurrentHashMap();
        recovery$indy$flow$489(this, initialized159);
        initialized160 = new java.lang.StringBuilder();
        value161 = recovery$indy$flow$492();
        value162 = recovery$indy$flow$493(initialized160, value161);
        value163 = recovery$indy$flow$494();
        value164 = recovery$indy$flow$495(value162, value163);
        value165 = recovery$indy$flow$496(value164, "motionmodifier");
        value166 = recovery$indy$flow$497();
        value167 = recovery$indy$flow$498(value165, value166);
        value168 = recovery$indy$flow$499(value167, "speed");
        value169 = recovery$indy$flow$500(value168);
        recovery$indy$flow$501(this, value169);
        initialized170 = new net.C_478Z("VOnGround", (augustus.recovered.modules.movement.Speed_47k_) (this));
        recovery$indy$flow$504(this, initialized170);
        value174 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value175 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized170))))));
        recovery$indy$flow$507(value174, constructorKey10, value175);
        initialized176 = new net.C_4780("VBhop", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value180 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value181 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized176))))));
        recovery$indy$flow$512(value180, constructorKey10, value181);
        initialized182 = new net.C_478a("OldMineplex", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value186 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value187 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized182))))));
        recovery$indy$flow$517(value186, constructorKey10, value187);
        initialized188 = new net.C_478M("OldMatrix", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value192 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value193 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized188))))));
        recovery$indy$flow$522(value192, constructorKey10, value193);
        initialized194 = new net.C_478K("Matrix", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value198 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value199 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized194))))));
        recovery$indy$flow$527(value198, constructorKey10, value199);
        initialized200 = new net.C_478d("OldMinemora", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value204 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value205 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized200))))));
        recovery$indy$flow$532(value204, constructorKey10, value205);
        initialized206 = new net.C_478R("OldNCP", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value210 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value211 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized206))))));
        recovery$indy$flow$537(value210, constructorKey10, value211);
        initialized212 = new net.C_478g("CubeCraft", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value216 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value217 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized212))))));
        recovery$indy$flow$542(value216, constructorKey10, value217);
        initialized218 = new net.C_478x("LegitHop", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value222 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value223 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized218))))));
        recovery$indy$flow$547(value222, constructorKey10, value223);
        initialized224 = new net.C_4789("Dojo", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value228 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value229 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized224))))));
        recovery$indy$flow$552(value228, constructorKey10, value229);
        initialized230 = new net.C_478I("Strafe", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value234 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value235 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized230))))));
        recovery$indy$flow$557(value234, constructorKey10, value235);
        initialized236 = new net.C_478B("Sentry", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value240 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value241 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized236))))));
        recovery$indy$flow$562(value240, constructorKey10, value241);
        initialized242 = new net.C_478q("TimeManipulation", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value246 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value247 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized242))))));
        recovery$indy$flow$567(value246, constructorKey10, value247);
        initialized248 = new net.C_4783("OldHypixel", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value252 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value253 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized248))))));
        recovery$indy$flow$572(value252, constructorKey10, value253);
        initialized254 = new net.C_478y("Intave", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value258 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value259 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized254))))));
        recovery$indy$flow$577(value258, constructorKey10, value259);
        initialized260 = new net.C_478J("VulcanLowHop", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value264 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value265 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized260))))));
        recovery$indy$flow$582(value264, constructorKey10, value265);
        initialized266 = new net.C_478N("VulcanOnground", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value270 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value271 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized266))))));
        recovery$indy$flow$587(value270, constructorKey10, value271);
        initialized272 = new net.C_478m("VulcanHop", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value276 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value277 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized272))))));
        recovery$indy$flow$592(value276, constructorKey10, value277);
        initialized278 = new net.C_478E("Verus", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value282 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value283 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized278))))));
        recovery$indy$flow$597(value282, constructorKey10, value283);
        initialized284 = new net.C_4785("VerusLowHop", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value288 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value289 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized284))))));
        recovery$indy$flow$602(value288, constructorKey10, value289);
        initialized290 = new net.C_478P("Interact", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value294 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value295 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized290))))));
        recovery$indy$flow$607(value294, constructorKey10, value295);
        initialized296 = new net.C_478w("Karhu", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value300 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value301 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized296))))));
        recovery$indy$flow$612(value300, constructorKey10, value301);
        initialized302 = new net.C_478p("45Degree", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value306 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value307 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized302))))));
        recovery$indy$flow$617(value306, constructorKey10, value307);
        initialized308 = new net.C_478u("EntitySpeed", (augustus.recovered.modules.movement.Speed_47k_) (this));
        value312 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        value313 = ((java.lang.Object)(((net.C_478c) (((java.lang.Object)(initialized308))))));
        recovery$indy$flow$622(value312, constructorKey10, value313);
        value314 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this)))).field_42));
        value315 = recovery$indy$flow$624(value314);
        value316 = recovery$indy$flow$625(0);
        value317 = recovery$indy$flow$626(value315, value316);
        value318 = recovery$indy$flow$627(value317);
        value320 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this)))).settingMode));
        arrayValue321 = ((java.lang.Object[]) value318)[0];
        value324 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value320))))));
        value325 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(arrayValue321))))));
        recovery$indy$flow$631(value324, value325);
        value326 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this)))).settingMode));
        value330 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value326))))));
        value331 = recovery$indy$flow$634(value318);
        recovery$indy$flow$635(value330, value331, constructorKey11);
        value332 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this)))).field_42));
        initialized333 = new java.util.HashMap((java.util.Map) (value332));
        recovery$indy$flow$639(this, initialized333);
        value336 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this))))));
        recovery$indy$flow$641(value336, constructorKey7);
        value337 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this)))).field_44));
        value338 = recovery$indy$flow$643(0);
        value339 = recovery$indy$flow$644(value337, value338);
        if (value122 == 0) {
            regionValue340 = value339;
            regionValue341 = 0;
            break region1143;
        } else {
            regionValue344 = 0;
            break region1132;
        }
        }
        value345 = recovery$indy$flow$645(regionValue344);
        value346 = recovery$indy$flow$646(value339, value345);
        if ((int) ((value346 ? 1 : 0)) != 0) {
            break region1150;
        } else {
            break region1135;
        }
        }
        break region1137;
        }
        value349 = ((java.lang.Object)(((augustus.recovered.modules.movement.Speed_47k_) (((java.lang.Object)(this)))).field_44));
        value350 = recovery$indy$flow$648(0);
        value351 = recovery$indy$flow$649(value349, value350);
        regionValue340 = value351;
        regionValue341 = 0;
        break region1143;
        }
        value352 = recovery$indy$flow$650(regionValue341);
        try {
        java.lang.Object value353;

        value353 = recovery$indy$flow$651(regionValue340, value352);
        } catch (java.io.IOException directoryFailure) {
        recovery$indy$flow$652(directoryFailure);
        break region1150;
        }
        break region1150;
        }
        return;
    }












    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);
    private static native java.lang.Object recovery$indy$flow$129();
    private static native boolean recovery$indy$flow$213(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$222(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$224(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$226(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$230(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$236();
    private static native void recovery$indy$flow$240(java.lang.Object a0,java.lang.Object a1,long a2,long a3);
    private static native void recovery$indy$flow$242(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static boolean recovery$indy$flow$370(java.lang.Object a0) {
        return (a0 instanceof java.io.IOException);
    }
    private static native java.lang.Object recovery$indy$flow$372(int a0);
    private static native void recovery$indy$flow$374(java.lang.Object a0,java.lang.Object a1);
    private static native boolean recovery$indy$flow$375();


    private static native java.lang.Object recovery$indy$flow$380(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$381(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$384(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$385(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$388(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$391(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$392(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$395(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$398(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$399(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$402(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$405(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$407(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$410(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$413(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$414(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$417(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$420(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$422(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$427(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$428(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$431(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$432(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$437(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$438(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$441(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$442(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$445(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$448(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$449(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$452(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$455(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$457(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$460(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$463(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$465(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$468(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$471(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$473(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$476(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$479(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$480(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$483(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$486(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$489(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$492() {
        return net.C_47VK.field_42;
    }
    private static java.lang.Object recovery$indy$flow$493(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$494() {
        return java.io.File.separator;
    }
    private static java.lang.Object recovery$indy$flow$495(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$496(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$497() {
        return java.io.File.separator;
    }
    private static java.lang.Object recovery$indy$flow$498(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$499(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$500(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native void recovery$indy$flow$501(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$504(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$507(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$512(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$517(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$522(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$527(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$532(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$537(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$542(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$547(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$552(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$557(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$562(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$567(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$572(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$577(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$582(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$587(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$592(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$597(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$602(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$607(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$612(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$617(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native void recovery$indy$flow$622(java.lang.Object a0,long a1,java.lang.Object a2);

    private static java.lang.Object recovery$indy$flow$624(java.lang.Object a0) {
        return ((java.util.HashMap) (a0)).keySet();
    }
    private static native java.lang.Object recovery$indy$flow$625(int a0);
    private static java.lang.Object recovery$indy$flow$626(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Set) (a0)).toArray(((java.lang.Object[]) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$627(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }



    private static native void recovery$indy$flow$631(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$634(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }
    private static native void recovery$indy$flow$635(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$639(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$641(java.lang.Object a0,long a1);

    private static native java.lang.Object recovery$indy$flow$643(int a0);
    private static java.lang.Object recovery$indy$flow$644(java.lang.Object a0,java.lang.Object a1) {
        return java.nio.file.Paths.get(((java.lang.String) (a0)), ((java.lang.String[]) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$645(int a0);
    private static boolean recovery$indy$flow$646(java.lang.Object a0,java.lang.Object a1) {
        return java.nio.file.Files.exists(((java.nio.file.Path) (a0)), ((java.nio.file.LinkOption[]) (a1)));
    }

    private static native java.lang.Object recovery$indy$flow$648(int a0);
    private static java.lang.Object recovery$indy$flow$649(java.lang.Object a0,java.lang.Object a1) {
        return java.nio.file.Paths.get(((java.lang.String) (a0)), ((java.lang.String[]) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$650(int a0);
    private static native java.lang.Object recovery$indy$flow$651(java.lang.Object a0,java.lang.Object a1) throws java.io.IOException;
    private static void recovery$indy$flow$652(java.lang.Object a0) {
        ((java.io.IOException) (a0)).printStackTrace();
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native JsonArray recovery$indy$2(Object var0, long var1, Object var3, Object var4, long var5, long var7);
   private static native JsonObject recovery$indy$3(long var0, Object var2, Object var3, Object var4, long var5, long var7);
   private static native void recovery$indy$4(Object var0, Object var1, long var2, long var4);
   private static native Function recovery$indy$5();
   private static native boolean recovery$indy$6(Object var0, Object var1, long var2, boolean var4, Object var5, long var6, long var8);
   private static native String recovery$indy$7(int var0, long var1);
   private static native Consumer recovery$indy$8(C_478L var0);
   private static native String recovery$indy$9(int var0, long var1);
   private static native boolean recovery$indy$10(long var0, long var2);
   private static native C_478c recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$12(Object var0, Object var1, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);
   private static native String recovery$indy$14(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$15(int var0, long var1);
   private static native boolean recovery$indy$16(long var0, long var2, long var4);
   private static native boolean recovery$indy$17(Object var0, long var1, long var3);
   private static native float recovery$indy$18(long var0, long var2, long var4);
   private static native void recovery$indy$19(Object var0, float var1, long var2, long var4);
   private static native MethodHandle recovery$constant$20();
   private static native C_478c recovery$indy$22(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$23(Object var0, int var1, int var2, Object var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$24(long var0, long var2);
   private static native boolean recovery$indy$25(long var0, long var2, long var4);
   private static native boolean recovery$indy$26(Object var0, long var1, long var3);
   private static native float recovery$indy$27(long var0, long var2, long var4);
   private static native void recovery$indy$28(Object var0, float var1, long var2, long var4);
   private static native C_478c recovery$indy$29(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$30(Object var0, Object var1, int var2, char var3, short var4, long var5, long var7);
   private static native C_478c recovery$indy$31(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$32(Object var0, Object var1, long var2, long var4, long var6);
   private static native String recovery$indy$33(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$34(Object var0, long var1, Object var3, long var4, long var6);
   private static native C_478c recovery$indy$35(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$36(Object var0, Object var1, int var2, int var3, char var4, long var5, long var7);
   private static native C_478c recovery$indy$37(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$38(Object var0, Object var1, long var2, long var4);
   private static native String recovery$indy$39(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$40(Object var0, long var1, long var3);
   private static native C_478c recovery$indy$49(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$50(Object var0, Object var1, long var2, long var4, long var6);
   private static native C_478c recovery$indy$51(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$52(Object var0, short var1, Object var2, long var3, long var5, long var7);
   private static native C_478c recovery$indy$53(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$54(Object var0, Object var1, short var2, char var3, int var4, long var5, long var7);
   private static native C_478c recovery$indy$55(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$56(Object var0, Object var1, long var2, long var4, long var6);
   private static native C_478c recovery$indy$57(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$58(Object var0, int var1, char var2, int var3, long var4, long var6);
   private static native void recovery$indy$59(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$60(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$61(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$62(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$63(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$64(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$65(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$66(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$67(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$68(Object var0, int var1, long var2, long var4, long var6);
   private static native C_478c recovery$indy$69(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$70(Object var0, char var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$71(long var0, long var2);
   private static native C_40X recovery$indy$72(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$73(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$74(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$75(Object var0, long var1, long var3);
   private static native C_478c recovery$indy$76(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$77(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$78(long var0, long var2);
   private static native C_40X recovery$indy$79(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$80(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$81(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$82(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$83(Object var0, long var1, long var3);
   private static native C_478c recovery$indy$84(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$85(Object var0, long var1, long var3, long var5);
}
