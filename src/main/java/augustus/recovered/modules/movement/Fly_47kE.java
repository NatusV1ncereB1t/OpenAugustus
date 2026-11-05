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
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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
import net.C_45n;
import net.C_46j;
import net.C_472n;
import net.C_475c;
import net.C_475y;
import net.C_477A;
import net.C_477G;
import net.minecraft.client.gui.ScaledResolution;
import net.C_479J;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47BV;
import net.C_47Bo;
import net.C_47K6;
import net.C_47K7;
import net.minecraft.client.gui.FontRenderer;
import client.module.Module;
import net.C_47Rw;
import net.C_47Rz;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TW;
import client.setting.Setting;
import client.setting.ModeSetting;
import net.C_47U0;
import net.C_47UH;
import net.C_47VK;
import net.C_47VO;
import net.C_47Vc;
import client.event.RenderListener;
import net.C_47c1;
import net.C_47c4;
import net.C_47c8;
import net.C_47c9;
import net.C_47cF;
import net.C_47cL;
import net.C_47cS;
import net.C_47cU;
import net.C_47cV;
import net.C_47cY;
import net.C_47cc;
import net.C_47cf;
import net.C_47cg;
import net.C_47ch;
import net.C_47ci;
import net.C_47cj;
import net.C_47co;
import net.C_47cp;
import net.C_47cr;
import net.C_47cs;
import net.C_47cu;
import net.C_47cv;
import net.C_47hi;
import net.C_47iC;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import net.C_47od;
import client.render.RenderUtils;
import net.C_47tK;
import client.module.Category;
import net.C_47tf;
import net.C_47uG;
import net.C_47xZ;
import net.C_47xz;
import net.C_47zh;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Fly_47kE extends client.module.Module implements net.C_47UH,net.C_48T,net.C_47U0,net.C_47Rz,net.C_47od,net.C_47hi,net.C_47Vc,net.C_41Q,client.event.RenderListener,net.C_47iC,net.C_47mz,net.C_47xz {
    private net.C_47Bo field_42d; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingWaitForDamage = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingAutoJump = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnGroundPacket = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingVanillaSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingVerusSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyOnGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingVerusSpeedCombined = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingCubeCraftSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingCubeCraftStopDuration = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingCollisionY = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingHeight = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBoost = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingHelpMessage = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingVulcanCollisionY = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingTimer = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTimerSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTimerSpeedEnd = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDisableAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCancelS08 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingBlinkMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDistanceFlown = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSpigotFlyKickBypass = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingEnderDragon = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingEnderDragonSound = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.text.DecimalFormat field_42H = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_42k; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_430; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_42W; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_42p = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.ConcurrentHashMap field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_42a = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47ci field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.lang.String field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static net.C_47tK field_42M; // Runtime access flags and ConstantValue are restored from the original class.
    private static boolean field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native void b();

   private boolean method_49A$aae029aa0a() {
      long var1 = a ^ 140221234619657L;
      long var3 = var1 ^ 95559741124774L;
      long var10002 = 8449245314774091617L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Vulcan");
   }



   private boolean method_49O$aae029aa0a() {
      long var1 = a ^ 80156051492865L;
      long var3 = var1 ^ 107237690590638L;
      long var10002 = -9202674039646670231L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("GroundCollision");
   }



   private boolean method_49y$aae029aa0a() {
      long var1 = a ^ 115780490896781L;
      long var3 = var1 ^ 70522549678114L;
      long var10000 = 8492005980193954845L;
      boolean var5 = method_49t$aae029aa0a();
      long var10002 = 8486374976026789861L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Vanilla1");
      if (!var5) {
         if (!var12) {
            var10002 = 8486374976026789861L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var14 = var11.method_46$5f9dc63072(var9).equals("Vanilla2");
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



   private boolean method_498$aae029aa0a() {
      long var1 = a ^ 90083289677733L;
      long var3 = var1 ^ 132494757636618L;
      long var10000 = 8065447461737849681L;
      boolean var5 = method_48$aae029aa0a();
      long var10002 = 8065262696777670093L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Vulcan");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 8064386564638478401L;
         BooleanSetting var9 = this.settingTimer;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



    private static native java.lang.reflect.Method h(long a0,long a1);

   private void method_46$537c8d9634(int var1, short var2, char var3) {
      net.minecraft.client.Minecraft var45;
      double var48;
      boolean var51;
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 113444085220607L;
      long var10000 = 4834935776045027238L;
      boolean var8 = method_48$aae029aa0a();
      long var10001 = 4836137133531839670L;
      BooleanSetting var13 = this.settingSpigotFlyKickBypass;
      boolean var43 = var13.method_49$aae029aa0a();
      if (var8) {
         if (!var43) {
            return;
         }

         long var10003 = 4836595327316908043L;
         long var14 = var6;
         long var16 = 1000L;
         C_47cu var18 = this.field_47;
         var43 = var18.method_42$b0e346e6e3(var16, var14);
      }

      if (var43) {
         Minecraft var44 = field_43;
         if (var8) {
            var10001 = 4833262938057564372L;
            Minecraft var19 = field_43;
            if (var19.field_42P == null) {
               return;
            }

            var44 = field_43;
         }

         var10001 = 4834814673436914368L;
         Minecraft var20 = var44;
         if (var20.field_44Q != null) {
            double var9 = 0.0;
            var10001 = 4833262938057564372L;
            Minecraft var21 = field_43;
            int var11 = (int)var21.field_42P.field_48j;

            while (true) {
               label129:
               if (var11 > 0) {
                  var45 = field_43;
                  if (!var8) {
                     break;
                  }

                  var10001 = 4834814673436914368L;
                  Minecraft var22 = field_43;
                  long var10002 = 4833262938057564372L;
                  Minecraft var23 = field_43;
                  double var63 = var11;
                  long var10004 = 4833262938057564372L;
                  Minecraft var24 = field_43;
                  C_475y var12 = var22.field_44Q.method_45$4093413a27(var23.field_42P.field_48Q, var63, var24.field_42P.field_42o).method_48$e084f7739d();
                  boolean var46 = var8;
                  if (var3 >= 0) {
                     if (var8) {
                        label122: {
                           boolean var47 = var12.method_43$aae029aa0a();
                           if (var1 >= 0) {
                              if (!var47) {
                                 break label122;
                              }

                              var9 = var11 + var12.method_49$fedcb3e4d3();
                              var47 = var8;
                           }

                           if (var47) {
                              break label129;
                           }
                        }

                        var11--;
                     }

                     var46 = var8;
                  }

                  if (var46) {
                     continue;
                  }
               }

               var45 = field_43;
               break;
            }

            var10001 = 4833262938057564372L;
            Minecraft var25 = var45;
            double var41 = var25.field_42P.field_48j;

            label108: {
               label107:
               while (true) {
                  if (var41 > var9) {
                     var10001 = 4833262938057564372L;
                     Minecraft var26 = field_43;
                     long var65 = 4833262938057564372L;
                     Minecraft var27 = field_43;
                     long var10006 = 4833262938057564372L;
                     Minecraft var28 = field_43;
                     var26.field_42P.field_49m.method_43$631790539f(new C_479J(var27.field_42P.field_48Q, var41, var28.field_42P.field_42o, true));
                     var48 = var41 - 8.0;
                     if (var1 <= 0) {
                        break label108;
                     }

                     var41 = var48;
                     if (!var8) {
                        break;
                     }

                     if (var8) {
                        continue;
                     }
                  }

                  do {
                     var10001 = 4833262938057564372L;
                     Minecraft var29 = field_43;
                     C_47K6 var49 = var29.field_42P.field_49m;
                     long var66 = 4833262938057564372L;
                     Minecraft var30 = field_43;
                     long var69 = 4833262938057564372L;
                     Minecraft var31 = field_43;
                     C_479J var59 = new C_479J(var30.field_42P.field_48Q, var9, var31.field_42P.field_42o, true);
                     if (var1 > 0) {
                        var49.method_43$631790539f(var59);
                        break label107;
                     }

                     var49.method_43$631790539f(var59);
                     var48 = var41 - 8.0;
                     if (var1 <= 0) {
                        break label108;
                     }

                     var41 = var48;
                     if (!var8) {
                        break label107;
                     }
                  } while (!var8);
               }

               var48 = var9;
            }

            double var42 = var48;

            while (true) {
               long var64 = 4833262938057564372L;
               Minecraft var32 = field_43;
               if (var42 < var32.field_42P.field_48j) {
                  var10001 = 4833262938057564372L;
                  Minecraft var33 = field_43;
                  long var67 = 4833262938057564372L;
                  Minecraft var34 = field_43;
                  long var70 = 4833262938057564372L;
                  Minecraft var35 = field_43;
                  var33.field_42P.field_49m.method_43$631790539f(new C_479J(var34.field_42P.field_48Q, var42, var35.field_42P.field_42o, true));
                  var42 += 8.0;
                  boolean var50 = var8;
                  if (var3 > 0) {
                     if (!var8) {
                        return;
                     }

                     var50 = var8;
                  }

                  if (var50) {
                     continue;
                  }
               }

               do {
                  var10001 = 4833262938057564372L;
                  Minecraft var36 = field_43;
                  long var68 = 4833262938057564372L;
                  Minecraft var37 = field_43;
                  long var10005 = 4833262938057564372L;
                  Minecraft var38 = field_43;
                  long var71 = 4833262938057564372L;
                  Minecraft var39 = field_43;
                  var36.field_42P
                     .field_49m
                     .method_43$631790539f(new C_479J(var37.field_42P.field_48Q, var38.field_42P.field_48j, var39.field_42P.field_42o, true));
                  if (var1 > 0) {
                     var10001 = 4835534553129672484L;
                     C_47cu var40 = this.field_47;
                     var40.method_46$da8c82d5d4();
                     return;
                  }

                  var51 = var8;
                  if (var3 > 0) {
                     if (!var8) {
                        return;
                     }

                     var51 = var8;
                  }
               } while (!var51);
            }
         }
      }
   }






   public void method_46$e535f8442d(C_47zh var1, long var2, short var4) {
      long var7;
      long var11;
      long var13;
      long var15;
      boolean var17;
      label47: {
         long var9;
         label46: {
            long var5 = var2 << 16 | (long)var4 << 48 >>> 48;
            var7 = var5 ^ 74984398986114L;
            var9 = var5 ^ 136246740323142L;
            var11 = var5 ^ 115002472062334L;
            var13 = var5 ^ 13538434133415L;
            var15 = var5 ^ 43140800877122L;
            long var10000 = 1772775183665173541L;
            var17 = method_48$aae029aa0a();
            Minecraft var41 = field_43;
            if (var17) {
               long var10001 = 1773217103555193155L;
               Minecraft var18 = field_43;
               if (var18.field_44Q == null) {
                  break label46;
               }

               var41 = field_43;
            }

            long var45 = 1769983729565645655L;
            Minecraft var19 = var41;
            if (var19.field_42P != null) {
               break label47;
            }
         }

         long var10003 = 1773452224545184815L;
         boolean var20 = false;
         long var21 = var9;
         Fly_47kE var23 = this;
         var23.method_46$b757cde368(var21, var20);
      }

      Fly_47kE var43;
      label38: {
         label37: {
            label36: {
               long var10002 = 1772590487474809529L;
               long var24 = var11;
               ModeSetting var26 = this.settingBlinkMode;
               boolean var42 = var26.method_46$5f9dc63072(var24).equals("OnlyIncoming");
               if (var17) {
                  if (var42) {
                     break label36;
                  }

                  var43 = this;
                  if (!var17) {
                     break label38;
                  }

                  var10002 = 1772590487474809529L;
                  long var27 = var11;
                  ModeSetting var29 = this.settingBlinkMode;
                  var42 = var29.method_46$5f9dc63072(var27).equals("Both");
               }

               if (!var42) {
                  break label37;
               }
            }

            long var48 = 1767546708663389033L;
            boolean var30 = true;
            long var31 = var13;
            C_47zh var33 = var1;
            var33.method_47$b757cde368(var31, var30);
         }

         var43 = this;
      }

      long var47 = 1770858800045309292L;
      long var34 = var7;
      Fly_47kE var36 = var43;
      C_47c1 var44 = var36.method_44$286ac5bf38(var34);
      long var49 = 1770989345973779625L;
      long var37 = var15;
      C_47zh var39 = var1;
      C_47c1 var40 = var44;
      var40.method_42$e781d6169a(var39, var37);
   }




   private static String[] method_46$3d4b98126e(int var0) {
      return new String[var0];
   }



    private static native int e(long a0,long a1);

   private static Boolean method_42$4fb368974c(C_47TW var0) {
      return true;
   }



   public synchronized void method_42$e45a9973e5(long var1) {
        java.lang.String var32;
        java.util.concurrent.ConcurrentHashMap var35;
        int var37;
        boolean var40;
        java.lang.String var43;
      long var6;
      long var8;
      byte var10;
      java.util.HashMap var11;
      java.util.HashSet var12;
      Fly_47kE var38;
      label192: {
         var1 = a ^ var1;
         long var10001 = var1 ^ 133166466699978L;
         int var3 = (int)((var1 ^ 133166466699978L) >>> 48);
         int var4 = (int)(var10001 << 16 >>> 48);
         int var5 = (int)(var10001 << 32 >>> 32);
         var6 = var1 ^ 7649800656273L;
         var8 = var1 ^ 47305756476744L;
         var11 = new java.util.HashMap(this.field_42a);
         byte var10000 = ((byte) (recovery$indy$flow$169(5797619045702687946L, var1) ? 1 : 0));
         var12 = new java.util.HashSet();
         var10 = var10000;
         java.io.File var13 = new java.io.File(this.field_44);
         java.io.File[] var14 = var13.listFiles();
         label191:
         if (var10 != 0) {
            label196: {
               java.io.File[] var31 = var14;
               if (var1 >= 0L) {
                  if (var14 == null) {
                     break label196;
                  }

                  var31 = var14;
               }

               java.io.File[] var15 = var31;
               int var16 = var15.length;
               int var17 = 0;

               while (var17 < var16) {
                  java.io.File var18 = var15[var17];
                  String var19 = var18.getName();
                  if (var10 == 0) {
                     break label191;
                  }

                  label180: {
                     label198: {
                        label199: {
                           var32 = var19;
                           short var42 = var10;
                           if (var1 > 0L) {
                              if (var10 == 0) {
                                 break label199;
                              }

                              var42 = ((short) (6052));
                           }

                           if (var1 > 0L) {
                              if (!var19.contains((String)recovery$indy$flow$177(var42, 3374631003508386832L ^ var1))) {
                                 break label198;
                              }

                              var32 = var19;
                              var42 = ((short) (0));
                           }

                           var32 = ((java.lang.String) (var32)).substring(var42, Math.max(var19.length() - 5, 0));
                        }

                        label167: {
                           label200: {
                              String var20;
                              label201: {
                                 var20 = var32;
                                 boolean var33 = var12.add(var20);
                                 if (var1 >= 0L) {
                                    var38 = this;
                                    if (var10 == 0) {
                                       break label167;
                                    }

                                    var35 = this.field_42;
                                    var43 = var20;
                                    if (var1 < 0L) {
                                       break label201;
                                    }

                                    var33 = this.field_42.containsKey(var20);
                                 }

                                 if (!var33) {
                                    break label200;
                                 }

                                 var35 = this.field_42;
                                 var43 = var20;
                              }

                              byte[] var21 = (byte[])var35.get(var43);
                              byte[] var36 = new byte[0];

                              byte[] var22;
                              try {
                                 var22 = java.security.MessageDigest.getInstance((String)recovery$indy$flow$188(10034, 2065445206043172046L ^ var1))
                                    .digest(java.nio.file.Files.readAllBytes(var18.toPath()));
                              } catch (java.security.NoSuchAlgorithmException | java.io.IOException var24) {
                                 throw new RuntimeException(var24);
                              }

                              label154: {
                                 label203: {
                                    label204: {
                                       if (var10 != 0) {
                                          if (!java.util.Arrays.equals(var22, var21)) {
                                             break label204;
                                          }

                                          var11.put(var20, this.field_42p.get(var20));
                                       }

                                       var37 = var10;
                                       if (var1 <= 0L) {
                                          break label154;
                                       }

                                       if (var10 != 0) {
                                          break label203;
                                       }
                                    }

                                    net.C_47cr var23 = (net.C_47cr)recovery$indy$flow$199(this, var18, (short)var3, (char)var4, var5, false, 5797174423236769632L, var1);
                                    if (var10 != 0) {
                                       if (var23 == null) {
                                          break label198;
                                       }

                                       var11.put((String)recovery$indy$flow$200(var23, 5794819949100158709L, var1), var23);
                                       this.field_42.put(var20, var22);
                                    }
                                 }

                                 var37 = var10;
                              }

                              if (var1 <= 0L) {
                                 break label180;
                              }

                              if (var37 != 0) {
                                 break label198;
                              }
                           }

                           var38 = this;
                        }

                        net.C_47cr var30 = (net.C_47cr)recovery$indy$flow$204(var38, var18, (short)var3, (char)var4, var5, true, 5797174423236769632L, var1);
                        if (var10 != 0 && var30 != null) {
                           var11.put((String)recovery$indy$flow$205(var30, 5794819949100158709L, var1), var30);
                        }
                     }

                     var17++;
                     var37 = var10;
                  }

                  if (var37 == 0) {
                     break;
                  }
               }
            }

            this.field_42p.clear();
            var38 = this;
            if (var1 <= 0L) {
               break label192;
            }

            this.field_42p.putAll(var11);
         }

         var38 = this;
      }

      java.util.Iterator var26 = var38.field_42.keySet().iterator();

      label114:
      while (true) {
         Object var39;
         if (var26.hasNext()) {
            var39 = var26.next();
         } else {
            var12.clear();
            var11.clear();
            var39 = this.field_42p;
            if (var1 > 0L) {
               var40 = this.field_42p.containsKey((String)recovery$indy$flow$224(this.settingMode, var6, 5798085200226574934L, var1));
               break;
            }
         }

         do {
            String var28 = (String)var39;
            if (var10 != 0) {
               var40 = var12.contains(var28);
               if (var10 == 0) {
                  break label114;
               }

               if (((int) (var40 ? 1 : 0)) == 0) {
                  this.field_42.remove(var28);
               }
            }

            if (var10 != 0) {
               continue label114;
            }

            var12.clear();
            var11.clear();
            var39 = this.field_42p;
         } while (var1 <= 0L);

         var40 = this.field_42p.containsKey((String)recovery$indy$flow$224(this.settingMode, var6, 5798085200226574934L, var1));
         break;
      }

      byte var27 = ((byte) (var40 ? 1 : 0));
      String[] var29 = ((java.lang.String[]) (this.field_42p.keySet().stream().sorted().toArray((java.util.function.IntFunction<String[]>)recovery$indy$flow$230())));
      byte var41 = var10;
      if (var1 >= 0L) {
         if (var10 == 0) {
            return;
         }

         var41 = var27;
      }

      if (var41 == 0) {
         recovery$indy$flow$234(this.settingMode, var29[0], 5800361370684995211L, var1);
      }

      recovery$indy$flow$236(this.settingMode, var29, var8, 5797794395015865458L, var1);
   }






   private C_47cr method_42$2d5ad56bef(File var1, short var2, char var3, int var4, boolean var5) {
      long var6;
      String var17;
      C_47cr var19;
      boolean var25;
      label75: {
         label74: {
            var6 = ((long)var2 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
            long var8 = var6 ^ 68794876492092L;
            long var10 = var6 ^ 79060395264719L;
            long var12 = var6 ^ 36040587311893L;
            long var14 = var6 ^ 74287421216334L;
            var17 = var1.getName().substring(0, Math.max(var1.getName().length() - 5, 0));
            var25 = recovery$indy$12(-7855499975655294145L, var6);
            JsonArray var18 = recovery$indy$13(this.field_44, var10, var1.getName(), null, -7859465607178393818L, var6);
            var19 = new C_47cr(var17, this, var12);
            boolean var16 = var25;
            JsonArray var23 = var18;
            if (!var16) {
               if (var18 == null) {
                  JsonObject var20 = recovery$indy$14(var14, this.field_44, var1.getName(), null, -7861243448475325014L, var6);
                  var25 = var16;
                  if (var3 >= 0) {
                     if (!var16) {
                        if (var20 == null) {
                           return null;
                        }

                        recovery$indy$15(field_42M, new Module[]{var19.field_42}, -7859760719910820646L, var6);
                     }

                     var25 = recovery$indy$17(field_42M, var20, var8, true, recovery$indy$16(), -7859902734503953459L, var6);
                  }

                  boolean var21 = var25;
                  var25 = var16;
                  if (var4 > 0) {
                     if (var16) {
                        return null;
                     }

                     var25 = var21;
                  }

                  if (var2 >= 0) {
                     if (!var25) {
                        System.out.println(recovery$indy$18(14217, 5455241074997350059L ^ var6));
                        return null;
                     }

                     var25 = var16;
                  }

                  if (var3 < 0) {
                     break label75;
                  }

                  if (!var25) {
                     break label74;
                  }
               }

               var23 = var18;
            }

            var23.forEach(recovery$indy$19(var19));
         }

         var25 = var5;
      }

      if (!var25) {
         return var19;
      }

      try {
         this.field_42.put(var17, MessageDigest.getInstance(recovery$indy$20(11560, 4112394784597005387L ^ var6)).digest(Files.readAllBytes(var1.toPath())));
         return var19;
      } catch (NoSuchAlgorithmException | IOException var22) {
         throw new RuntimeException(var22);
      }
   }




   private static String[] method_42$3d4b98126e(int var0) {
      return new String[var0];
   }



   public void method_42$0db73fbf69(long var1, C_47VO var3) {
      long var4 = var1 ^ 96231390685870L;
      long var6 = var1 ^ 60877589741279L;
      long var8 = var1 ^ 54058444301125L;
      recovery$indy$22(recovery$indy$21(this, var4, -6215168674727228352L, var1), var3, -6220837592164998138L, var1);
      if (!recovery$indy$23(var6, -6218377200555530116L, var1)) {
         recovery$indy$25(var3, recovery$indy$24(var8, -6218039429963632055L, var1), -6218654017366993627L, var1);
      }
   }



    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

   public void method_41$fae8de1664(C_475c var1) {
      long var2 = a ^ 67598919004383L;
      long var4 = var2 ^ 62394500490124L;
      int var6 = (int)((var2 ^ 93720268003987L) >>> 56);
      long var7 = (var2 ^ 93720268003987L) << 8 >>> 8;
      long var10002 = -6873295400842984094L;
      long var9 = var4;
      Fly_47kE var11 = this;
      C_47c1 var10000 = var11.method_44$286ac5bf38(var9);
      byte var10001 = (byte)var6;
      long var10004 = -6874854049835398170L;
      long var12 = var7;
      C_475c var14 = var1;
      byte var15 = var10001;
      C_47c1 var16 = var10000;
      var16.method_45$e0e395d7e9(var15, var14, var12);
   }



   public void method_41$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 45236616664868L;
      long var6 = var1 ^ 66963299868465L;
      recovery$indy$28(recovery$indy$27(this, var6, -7196714376381351457L, var1), var3, var4, -7196172336795516435L, var1);
   }



   public void method_41$0db73fbf69(long var1, C_47VO var3) {
      long var4 = var1 ^ 134481648138880L;
      long var6 = var1 ^ 29226247548657L;
      long var8 = var1 ^ 31750970979179L;
      if (!recovery$indy$29(var6, -5071669821650110382L, var1)) {
         recovery$indy$31(var3, recovery$indy$30(var8, -5072394723409059225L, var1), -5071956065914010357L, var1);
      }

      recovery$indy$33(recovery$indy$32(this, var4, -5075164461011461010L, var1), var3, -5078041659179579410L, var1);
   }



    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   public void method_40$6f6970ed3f(long var1, C_46j var3) {
      long var4 = var1 ^ 88467872162391L;
      long var6 = var1 ^ 107636217192306L;
      recovery$indy$35(recovery$indy$34(this, var4, 2397690672749216953L, var1), var6, var3, 2398918669859089851L, var1);
   }



   public void method_40$e781d6169a(C_47zh var1, long var2) {
      long var4;
      int var10;
      long var11;
      Fly_47kE var33;
      label29: {
         label28: {
            long var8;
            label27: {
               var4 = var2 ^ 89441653847784L;
               long var6 = var2 ^ 138480231952404L;
               var8 = var2 ^ 27738005618893L;
               var10 = (int)((var2 ^ 42119114954860L) >>> 48);
               var11 = (var2 ^ 42119114954860L) << 16 >>> 16;
               long var10000 = 8498359332856658255L;
               boolean var13 = method_48$aae029aa0a();
               long var10002 = 8499300483970254803L;
               long var14 = var6;
               ModeSetting var16 = this.settingBlinkMode;
               boolean var32 = var16.method_46$5f9dc63072(var14).equals("OnlyOutgoing");
               if (var13) {
                  if (var32) {
                     break label27;
                  }

                  var33 = this;
                  if (!var13) {
                     break label29;
                  }

                  var10002 = 8499300483970254803L;
                  long var17 = var6;
                  ModeSetting var19 = this.settingBlinkMode;
                  var32 = var19.method_46$5f9dc63072(var17).equals("Both");
               }

               if (!var32) {
                  break label28;
               }
            }

            long var10003 = 8497592347213473283L;
            boolean var20 = true;
            long var21 = var8;
            C_47zh var23 = var1;
            var23.method_47$b757cde368(var21, var20);
         }

         var33 = this;
      }

      long var36 = 8500913562185977862L;
      long var24 = var4;
      Fly_47kE var26 = var33;
      C_47c1 var34 = var26.method_44$286ac5bf38(var24);
      short var37 = (short)var10;
      long var10004 = 8500425429361443947L;
      long var27 = var11;
      short var29 = var37;
      C_47zh var30 = var1;
      C_47c1 var31 = var34;
      var31.method_40$5ae2cdfe03(var30, var29, var27);
   }




   private static void method_40$01eb5971cc(net.C_47cr var0, com.google.gson.JsonElement var1) {
      long var2 = a ^ 130948048787288L;
      long var10001 = var2 ^ 89741467806413L;
      int var4 = (int)((var2 ^ 89741467806413L) >>> 48);
      int var5 = (int)((var2 ^ 89741467806413L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 116837888155738L;
      com.google.gson.JsonObject var10 = var1.getAsJsonObject();
      String var11 = var10.get("Name").getAsString();
      boolean var10000 = method_49t$aae029aa0a();
      net.C_47cr var14 = var0;
      net.C_477G var15 = var14.method_40$e0d3f31637();
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




   private boolean method_49b$aae029aa0a() {
      long var1 = a ^ 129734548278734L;
      long var3 = var1 ^ 101777255422049L;
      long var10002 = 2127587576644972454L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("OldVerus");
   }



   private boolean method_49H$aae029aa0a() {
      long var1 = a ^ 87381006958259L;
      long var3 = var1 ^ 112244833430300L;
      long var10002 = 7997142957540924635L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("AirJump");
   }



   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      long var5 = (long)var1 << 32 | var3 << 32 >>> 32;
      long var7 = var5 ^ 76795329528465L;
      long var9 = var5 ^ 119222652947787L;
      long var11 = var5 ^ 115722334063887L;
      recovery$indy$37(recovery$indy$36(this, var7, 4719872846626710655L, var5), var9, var2, 4723226739572473439L, var5);
      double var13 = recovery$indy$39(
         this, var11, this.field_42k.field_40, recovery$indy$38(field_43, 4720686352333169220L, var5).field_48Q, 4720333924185037106L, var5
      );
      double var15 = recovery$indy$41(
         this, var11, this.field_42k.field_47, recovery$indy$40(field_43, 4720686352333169220L, var5).field_42o, 4720333924185037106L, var5
      );
      this.field_430 = this.field_430 + Math.sqrt(var13 * var13 + var15 * var15);
      this.field_42k = new C_47tf(
         recovery$indy$42(field_43, 4720686352333169220L, var5).field_48Q,
         recovery$indy$43(field_43, 4720686352333169220L, var5).field_48j,
         recovery$indy$44(field_43, 4720686352333169220L, var5).field_42o
      );
   }



   private C_47c1 method_44$286ac5bf38(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 19204591228583L;
      return ((net.C_47c1) (this.field_42p.getOrDefault(recovery$indy$45(this.settingMode, var3, 5999067688851497312L, var1), this.field_48)));
   }



   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      if (recovery$indy$46(this.settingDistanceFlown, 1635220603248240922L, var6)) {
         String var8 = recovery$indy$47(8866, 1676954182220865503L ^ var6)
            + this.field_42H.format(this.field_430)
            + recovery$indy$48(17569, 5796437529878477275L ^ var6)
            + (System.currentTimeMillis() - this.field_42W) / 1000L;
         recovery$indy$49(field_43, 1633255860140335947L, var6)
            .method_43$7961e3f788(
               var8,
               (int)(var5.method_46$8abf5c6871() / 2.0F - recovery$indy$50(field_43, 1633255860140335947L, var6).method_48$2f485d5ba3(var8) / 2.0F),
               var5.method_48$8abf5c6871() - 65,
               -1
            );
      }

      RenderUtils.method_41$da8c82d5d4();
   }



   private void method_44$51e2733016(byte var1, int var2, C_47c1 var3, int var4) {
      long var5 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var4 << 40 >>> 40) ^ a;
      this.field_42p.put(recovery$indy$51(var3, -6873005783745708544L, var5), var3);
   }



   public void method_44$e45a9973e5(long var1) {
      long var6;
      long var8;
      byte var10;
      Object[] var20;
      var1 = a ^ var1;
      long var10001 = var1 ^ 80116892391903L;
      int var3 = (int)((var1 ^ 80116892391903L) >>> 48);
      int var4 = (int)((var1 ^ 80116892391903L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      var6 = var1 ^ 60703100526212L;
      var8 = var1 ^ 29440588861021L;
      this.field_42p.clear();
      this.field_42p.putAll(this.field_42a);
      byte var10000 = (byte) ((recovery$indy$52(-7241826254174817605L, var1)) ? 1 : 0);
      this.field_42.clear();
      File var11 = new File(this.field_44);
      var10 = var10000;
      File[] var12 = var11.listFiles();
      var20 = var12;
      label78:
      if (var10 == 0) {
         if (var12 != null) {
            File[] var13 = var12;
            int var14 = var13.length;
            int var15 = 0;

            while (var15 < var14) {
               var20 = var13;
               int var23 = var10;
               if (var1 > 0L) {
                  if (var10 != 0) {
                     break label78;
                  }

                  var23 = var15;
               }

               File var16 = var13[var23];
               byte var21 = var10;
               if (var1 >= 0L) {
                  if (var10 == 0) {
                     if (var16.getName().contains(recovery$indy$53(21244, 1413946839185367563L ^ var1))) {
                        C_47cr var17 = recovery$indy$54(this, var16, (short)var3, (char)var4, var5, true, -7248962871619928971L, var1);
                        if (var10 == 0 && var17 != null) {
                           this.field_42p.put(recovery$indy$55(var17, -7242237033309108768L, var1), var17);
                        }
                     }

                     var15++;
                  }

                  var21 = var10;
               }

               if (var21 != 0) {
                  break;
               }
            }
         }

         var20 = this.field_42p.keySet().stream().sorted().toArray(recovery$indy$56());
      }

      String[] var19 = (String[])var20;
      if (var1 > 0L) {
         Fly_47kE var22 = this;
         if (var10 == 0) {
            if (this.field_42p.get(recovery$indy$57(this.settingMode, var6, -7249706859095086781L, var1)) == null) {
               recovery$indy$58(this.settingMode, var19[0], -7247923270382813794L, var1);
            }

            var22 = this;
         }

         recovery$indy$59(var22.settingMode, var19, var8, -7250559519075127449L, var1);
      }
   }




   public static void method_48$f633c984d8(boolean var0) {
      field_46 = var0;
   }



   public static boolean method_48$aae029aa0a() {
      return field_46;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 126026100769179L;
      long var3 = var1 ^ 101087633052724L;
      long var10002 = 5896252876860646387L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("VerusCombined");
   }



   public void method_47$2fe7f6c171(C_47Rw var1, long var2) {
      long var4 = var2 ^ 127718268872919L;
      long var10001 = var2 ^ 102494547945146L;
      int var6 = (int)((var2 ^ 102494547945146L) >>> 48);
      int var7 = (int)((var2 ^ 102494547945146L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      recovery$indy$61(recovery$indy$60(this, var4, 3154325859551678009L, var2), (short)var6, var1, (char)var7, var8, 3154606732173864836L, var2);
   }



   static BooleanSetting method_47$5a2d20fee4(Fly_47kE var0) {
      return var0.settingEnderDragonSound;
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var4 = var2 ^ 115052771433422L;
      long var6 = var2 ^ 54898375388682L;
      recovery$indy$63(recovery$indy$62(this, var4, 6403967089349393696L, var2), var1, var6, 6400935145989981974L, var2);
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      int var4 = (int)((var1 ^ 90236815267469L) >>> 32);
      long var5 = (var1 ^ 90236815267469L) << 32 >>> 32;
      long var7 = var1 ^ 10499205375499L;
      long var10000 = 2671589080548157868L;
      boolean var9 = method_48$aae029aa0a();
      Fly_47kE var20 = this;
      if (var9) {
         long var10001 = 2672650518167476924L;
         BooleanSetting var10 = this.settingCancelS08;
         label24:
         if (var10.method_49$aae029aa0a()) {
            C_47ob var21 = var3;
            if (var9) {
               var10001 = 2672678008654101629L;
               C_47ob var11 = var3;
               if (!(var11.method_46$96fcbedb66() instanceof C_47xZ)) {
                  break label24;
               }

               var21 = var3;
            }

            var21.cancel();
         }

         var20 = this;
      }

      long var10002 = 2673474669625737445L;
      long var12 = var7;
      Fly_47kE var14 = var20;
      C_47c1 var22 = var14.method_44$286ac5bf38(var12);
      long var10004 = 2670030843757111122L;
      C_47ob var15 = var3;
      long var16 = var5;
      int var18 = var4;
      C_47c1 var19 = var22;
      var19.method_46$737c63847e(var18, var16, var15);
   }



   private double method_43$7858a7ac7f(long var1, double var3, double var5) {
      var1 = a ^ var1;
      boolean var7 = recovery$indy$64(6691641697800999010L, var1);
      double var10000 = var3;
      double var10001 = var5;
      if (var7) {
         label23: {
            if (var3 >= var5) {
               var10000 = var3 - var5;
               if (var1 < 0L) {
                  break label23;
               }

               double var8 = var10000;
               if (var7) {
                  return var8;
               }
            }

            var10000 = var5;
         }

         var10001 = var3;
      }

      return var10000 - var10001;
   }



   private void method_43$da8c82d5d4() {
      long var1 = a ^ 139103754357321L;
      if (this.field_42d != null) {
         long var10001 = -2737197935021052965L;
         Minecraft var3 = field_43;
         if (var3.field_44Q != null) {
            var10001 = -2736398880985635411L;
            BooleanSetting var4 = this.settingEnderDragon;
            if (var4.method_49$aae029aa0a()) {
               var10001 = -2737197935021052965L;
               Minecraft var5 = field_43;
               var5.field_44Q.method_46$758fc8f1b9(this.field_42d);
            }
         }
      }
   }



   public void method_40G$e45a9973e5(long var1) {
      long var3 = var1 ^ 87479207775915L;
      long var5 = (var1 ^ 125070219713893L) >>> 16;
      int var7 = (int)((var1 ^ 125070219713893L) << 48 >>> 48);
      recovery$indy$66(recovery$indy$65(this, var3, -3622493824300947387L, var1), var5, (short)var7, -3626267778612039562L, var1);
   }



   public void method_45p$a6cfe74df2(short var1, long var2) {
      long var4 = (long)var1 << 48 | var2 << 16 >>> 16;
      long var6 = var4 ^ 75307617899131L;
      long var10001 = var4 ^ 19568491890292L;
      int var8 = (int)((var4 ^ 19568491890292L) >>> 32);
      int var9 = (int)((var4 ^ 19568491890292L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var10000 = 5864577234720447964L;
      boolean var11 = method_48$aae029aa0a();
      long var10002 = 5866601509385696405L;
      long var12 = var6;
      Fly_47kE var14 = this;
      C_47c1 var28 = var14.method_44$286ac5bf38(var12);
      char var33 = (char)var9;
      char var10003 = (char)var10;
      long var10004 = 5864814908612806459L;
      char var15 = var10003;
      char var16 = var33;
      int var17 = var8;
      C_47c1 var18 = var28;
      var18.method_49$c1c423c01c(var17, var16, var15);
      Fly_47kE var29 = this;
      if (var11) {
         var10001 = 5865767596604436172L;
         BooleanSetting var19 = this.settingEnderDragon;
         if (!var19.method_49$aae029aa0a()) {
            return;
         }

         var29 = this;
      }

      C_47Bo var30 = var29.field_42d;
      if (var11) {
         if (var29.field_42d == null) {
            return;
         }

         var10002 = 5866288830492734126L;
         Minecraft var20 = field_43;
         this.field_42d.field_48u = var20.field_42P.field_48u;
         var10002 = 5866288830492734126L;
         Minecraft var21 = field_43;
         this.field_42d.field_48O = var21.field_42P.field_48O - 2.6;
         var10002 = 5866288830492734126L;
         Minecraft var22 = field_43;
         this.field_42d.field_48l = var22.field_42P.field_48l;
         var10002 = 5866288830492734126L;
         Minecraft var23 = field_43;
         long var40 = 5866288830492734126L;
         Minecraft var24 = field_43;
         double var38 = var24.field_42P.field_48j - 2.6;
         var10004 = 5866288830492734126L;
         Minecraft var25 = field_43;
         this.field_42d.method_46$a59262c0f0(var23.field_42P.field_48Q, var38, var25.field_42P.field_42o);
         var30 = this.field_42d;
      }

      var10002 = 5866288830492734126L;
      Minecraft var26 = field_43;
      float var32 = var26.field_42P.field_48h - 180.0F;
      long var41 = 5866288830492734126L;
      Minecraft var27 = field_43;
      var30.method_45$dd322a622a(var32, var27.field_42P.field_48z);
   }




   private boolean method_491$aae029aa0a() {
      long var1 = a ^ 39224088384988L;
      long var3 = var1 ^ 11829973041267L;
      long var10002 = -8821175140080044108L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("AirJump");
   }



   private boolean method_49a$aae029aa0a() {
      long var1 = a ^ 27971124247020L;
      long var3 = var1 ^ 52907426786371L;
      long var10000 = -1610193936123271912L;
      boolean var5 = method_48$aae029aa0a();
      long var10002 = -1610923973972599932L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Vulcan");
      if (var5) {
         if (!var10) {
            return false;
         }

         long var10001 = -1611377978206185976L;
         BooleanSetting var9 = this.settingTimer;
         var10 = var9.method_49$aae029aa0a();
      }

      return !var5 ? var10 : var10;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$67(this, 28, var3, -7103630384028210533L, var1);
      recovery$indy$68(this, 3, var3, -7103630384028210533L, var1);
      recovery$indy$69(this, 20, var3, -7103630384028210533L, var1);
      recovery$indy$70(this, 21, var3, -7103630384028210533L, var1);
      recovery$indy$71(this, 43, var3, -7103630384028210533L, var1);
      recovery$indy$72(this, 18, var3, -7103630384028210533L, var1);
      recovery$indy$73(this, 32, var3, -7103630384028210533L, var1);
      recovery$indy$74(this, 26, var3, -7103630384028210533L, var1);
      recovery$indy$75(this, 25, var3, -7103630384028210533L, var1);
      recovery$indy$76(this, 40, var3, -7103630384028210533L, var1);
      recovery$indy$77(this, 7, var3, -7103630384028210533L, var1);
      recovery$indy$78(this, 34, var3, -7103630384028210533L, var1);
   }



   private boolean method_49P$aae029aa0a() {
      long var1 = a ^ 119821299813309L;
      long var3 = var1 ^ 76505758473746L;
      long var10002 = 6626392250775267797L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("OldVerus");
   }



   public void method_45q$e45a9973e5(long var1) {
      long var10001 = var1 ^ 115791648205841L;
      int var3 = (int)((var1 ^ 115791648205841L) >>> 32);
      int var4 = (int)((var1 ^ 115791648205841L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 32416159185995L;
      var10001 = var1 ^ 66970045563833L;
      int var8 = (int)((var1 ^ 66970045563833L) >>> 48);
      int var9 = (int)((var1 ^ 66970045563833L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      recovery$indy$80(recovery$indy$79(this, var6, 4564965552887634597L, var1), (char)var8, var9, (char)var10, 4563017244908488732L, var1);
      recovery$indy$81(this, var3, (short)var4, (char)var5, 4565099179815767419L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 72498010691029L;
      long var8 = var4 ^ 99593642957744L;
      recovery$indy$83(this, var6, recovery$indy$82(this.settingMode, var8, 2186413662290783351L, var4), 2182654742637201330L, var4);
   }



   public void method_43y$e45a9973e5(long var1) {
      Minecraft var8;
      label28: {
         long var3 = var1 ^ 69289922959250L;
         long var5 = var1 ^ 21707046505086L;
         boolean var7 = recovery$indy$84(-7740005507023831727L, var1);
         recovery$indy$85(field_43, -7741833065631572687L, var1).field_43 = 1.0F;
         EntityPlayerSP var10000 = recovery$indy$86(field_43, -7746114507185670329L, var1);
         if (!var7) {
            if (var10000 != null) {
               recovery$indy$87(field_43, -7746114507185670329L, var1).method_49$24a796ab4c(0.02F);
               recovery$indy$88(field_43, -7746114507185670329L, var1).method_45$24a796ab4c(0.1F);
               recovery$indy$89(field_43, -7746114507185670329L, var1).field_48g = 0.6F;
            }

            var8 = field_43;
            if (var7) {
               break label28;
            }

            var10000 = recovery$indy$90(field_43, -7746114507185670329L, var1);
         }

         if (var10000 != null) {
            recovery$indy$92(recovery$indy$91(this, var3, -7745310082130595460L, var1), var5, -7743842614910720005L, var1);
         }

         var8 = field_43;
      }

      recovery$indy$93(var8, -7741833065631572687L, var1).field_43 = 1.0F;
      recovery$indy$94(this, -7742481180149048926L, var1);
   }



   private boolean method_49o$aae029aa0a() {
      long var1 = a ^ 100584097666397L;
      long var3 = var1 ^ 125438813061362L;
      long var10002 = 366369531216934709L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("CubeCraft");
   }



   private boolean method_49T$aae029aa0a() {
      long var1 = a ^ 136784084121518L;
      long var3 = var1 ^ 93499126129153L;
      long var10002 = -1736493652007332410L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("OldGomme");
   }



   private boolean method_49W$aae029aa0a() {
      long var1 = a ^ 135766599076455L;
      long var3 = var1 ^ 90247721689032L;
      long var10002 = 6498618552024983567L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("OldGomme");
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      boolean var10;
      Minecraft var39;
      boolean var47;
      label62: {
         label65: {
            long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
            long var6 = var4 ^ 46539482080996L;
            long var8 = var4 ^ 85582259704984L;
            long var10001 = 2737668181300656577L;
            C_47cu var11 = this.field_47;
            var11.method_46$da8c82d5d4();
            long var10000 = 2730286009344609319L;
            boolean var37 = method_49t$aae029aa0a();
            long var10002 = 2736339810218847303L;
            Minecraft var12 = field_43;
            var12.method_46$159e3d0645().field_43 = 1.0F;
            var10 = var37;
            long var43 = 2735462551151183409L;
            Minecraft var13 = field_43;
            EntityPlayerSP var38 = var13.field_42P;
            if (!var10) {
               if (var13.field_42P != null) {
                  long var44 = 2735462551151183409L;
                  Minecraft var14 = field_43;
                  var14.field_42P.method_49$24a796ab4c(0.02F);
                  long var45 = 2735462551151183409L;
                  Minecraft var15 = field_43;
                  var15.field_42P.method_45$24a796ab4c(0.1F);
                  long var46 = 2735462551151183409L;
                  Minecraft var16 = field_43;
                  var16.field_42P.field_48g = 0.6F;
                  long var10004 = 2735462551151183409L;
                  Minecraft var17 = field_43;
                  long var10005 = 2735462551151183409L;
                  Minecraft var18 = field_43;
                  long var10006 = 2735462551151183409L;
                  Minecraft var19 = field_43;
                  this.field_42k = new C_47tf(var17.field_42P.field_48Q, var18.field_42P.field_48j, var19.field_42P.field_42o);
               }

               var39 = field_43;
               var47 = var10;
               if (var1 < 0) {
                  break label62;
               }

               if (var10) {
                  break label65;
               }

               long var48 = 2735462551151183409L;
               Minecraft var20 = field_43;
               var38 = var20.field_42P;
            }

            if (var38 != null) {
               var10002 = 2735150430733991946L;
               long var21 = var6;
               Fly_47kE var23 = this;
               C_47c1 var40 = var23.method_44$286ac5bf38(var21);
               var10002 = 2729435655239055904L;
               long var24 = var8;
               C_47c1 var26 = var40;
               var26.method_44$e45a9973e5(var24);
            }

            this.field_430 = 0.0;
            this.field_42W = System.currentTimeMillis();
            var39 = field_43;
         }

         var47 = var10;
      }

      if (!var47) {
         long var49 = 2737579370787296293L;
         Minecraft var27 = var39;
         if (var27.field_44Q == null) {
            return;
         }

         var39 = field_43;
      }

      long var50 = 2735462551151183409L;
      Minecraft var28 = var39;
      if (var28.field_42P != null) {
         Fly_47kE var41 = this;
         if (!var10) {
            long var51 = 2735948469629278803L;
            BooleanSetting var29 = this.settingEnderDragon;
            if (!var29.method_49$aae029aa0a()) {
               return;
            }

            long var59 = 2737579370787296293L;
            Minecraft var30 = field_43;
            this.field_42d = new C_47BV(this, var30.field_44Q);
            long var52 = 2737579370787296293L;
            Minecraft var31 = field_43;
            var31.field_44Q.method_40$ac642ab8ac(-1337, this.field_42d);
            var41 = this;
         }

         long var55 = 2735462551151183409L;
         Minecraft var32 = field_43;
         long var10003 = 2735462551151183409L;
         Minecraft var33 = field_43;
         double var56 = var33.field_42P.field_48j - 2.6;
         long var57 = 2735462551151183409L;
         Minecraft var34 = field_43;
         long var60 = 2735462551151183409L;
         Minecraft var35 = field_43;
         float var58 = var35.field_42P.field_48h - 180.0F;
         long var61 = 2735462551151183409L;
         Minecraft var36 = field_43;
         var41.field_42d.method_48$bd229ade05(var32.field_42P.field_48Q, var56, var34.field_42P.field_42o, var58, var36.field_42P.field_48z);
      }
   }





   private boolean method_49M$aae029aa0a() {
      long var1 = a ^ 90302697000904L;
      long var3 = var1 ^ 135582665726567L;
      long var10000 = 2270722910322922300L;
      boolean var5 = method_48$aae029aa0a();
      long var10002 = 2269975290513075616L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Vanilla1");
      if (var5) {
         if (!var12) {
            var10002 = 2269975290513075616L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var14 = var11.method_46$5f9dc63072(var9).equals("Vanilla2");
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



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 53945509778447L;
      long var3 = var1 ^ 58086907103068L;
      long var5 = var1 ^ 94835378918796L;
      long var10002 = -4301735524523908686L;
      long var7 = var3;
      Fly_47kE var9 = this;
      C_47c1 var10000 = var9.method_44$286ac5bf38(var7);
      var10002 = -4305197178786261412L;
      long var10 = var5;
      C_47c1 var12 = var10000;
      var12.method_46$e45a9973e5(var10);
   }



   private boolean method_49s$aae029aa0a() {
      long var1 = a ^ 103524474623408L;
      long var3 = var1 ^ 131156943339551L;
      long var10002 = 5041954026985781208L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Vulcan");
   }



   private boolean method_49u$aae029aa0a() {
      long var1 = a ^ 59214482273974L;
      long var3 = var1 ^ 31559463985945L;
      long var10002 = 2809953165782357214L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("IntaveBoat");
   }



   private boolean method_49K$aae029aa0a() {
      long var1 = a ^ 64456203277632L;
      long var3 = var1 ^ 21928250441967L;
      long var10002 = -4248870538723264728L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("CubeCraft");
   }



   public static boolean method_49t$aae029aa0a() {
      boolean var0 = method_48$aae029aa0a();
      return !var0;
   }



    public Fly_47kE(long a0) {
        super((java.lang.String) ("Fly"),(java.lang.String) ("Fliegen"),(long) (((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 67483798175185L)),(java.awt.Color) (new java.awt.Color((int) (123),(int) (240),(int) (156))),(client.module.Category) (client.module.Category.MOVEMENT));

        int constructorPart14;
        int constructorPart13;
        int constructorPart12;
        long constructorKey15;
        long constructorKey17;
        long constructorKey7;
        int constructorPart9;
        int constructorPart8;
        int constructorPart10;
        long constructorKey11;
        int constructorPart5;
        int constructorPart4;
        int constructorPart3;
        long constructorKey6;
        long constructorKey16;
        long constructorKey2;
        constructorKey2 = (augustus.recovered.modules.movement.Fly_47kE.a ^ a0);
        constructorPart3 = (int) ((((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 39734220938448L) >>> 32));
        constructorPart4 = (int) (((((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 39734220938448L) << 32) >>> 40));
        constructorPart5 = (int) (((((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 39734220938448L) << 56) >>> 56));
        constructorKey6 = ((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 133616143810368L);
        constructorKey7 = ((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 76507673048311L);
        constructorPart8 = (int) ((((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 136618377290358L) >>> 32));
        constructorPart9 = (int) (((((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 136618377290358L) << 32) >>> 48));
        constructorPart10 = (int) (((((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 136618377290358L) << 48) >>> 48));
        constructorKey11 = ((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 130654427254044L);
        constructorPart12 = (int) ((((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 57073337795744L) >>> 56));
        constructorPart13 = (int) (((((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 57073337795744L) << 8) >>> 32));
        constructorPart14 = (int) (((((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 57073337795744L) << 40) >>> 40));
        constructorKey15 = ((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 83858304770506L);
        constructorKey16 = ((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 104035327779142L);
        constructorKey17 = ((augustus.recovered.modules.movement.Fly_47kE.a ^ a0) ^ 106777100918349L);
        region1443: {
        int regionValue449;
        java.lang.Object regionValue448;
        java.lang.Object value460;

        region1436: {
        java.lang.Object value459;
        java.lang.Object value458;
        java.lang.Object value457;

        region1430: {
        region1428: {
        java.lang.Object value447;
        boolean value454;
        java.lang.Object value453;
        int regionValue452;

        region1425: {
        java.lang.Object value189;
        java.lang.Object value426;
        java.lang.Object value206;
        java.lang.Object value98;
        java.lang.Object value97;
        java.lang.Object value96;
        java.lang.Object value95;
        java.lang.String value92;
        int value90;
        java.lang.Object value87;
        java.lang.Object value86;
        java.lang.Object value85;
        java.lang.Object value84;
        java.lang.Object value80;
        java.lang.Object value78;
        java.lang.Object value77;
        java.lang.Object value76;
        java.lang.Object value73;
        java.lang.Object value71;
        java.lang.Object value70;
        java.lang.Object value69;
        java.lang.Object value66;
        java.lang.Object value64;
        java.lang.Object value63;
        java.lang.Object value62;
        java.lang.Object value61;
        java.lang.Object value57;
        java.lang.Object value55;
        java.lang.Object value54;
        java.lang.Object value53;
        java.lang.Object value52;
        java.lang.Object value48;
        java.lang.Object value46;
        java.lang.Object value45;
        java.lang.Object value446;
        java.lang.Object value445;
        java.lang.Object value444;
        java.lang.Object value440;
        java.lang.Object value44;
        java.lang.Object value439;
        java.lang.Object value438;
        java.lang.Object value434;
        java.lang.Object value433;
        java.lang.Object value432;
        java.lang.Object value43;
        java.lang.Object value428;
        java.lang.Object value425;
        java.lang.Object value424;
        java.lang.Object value423;
        java.lang.Object value422;
        java.lang.Object value421;
        java.lang.Object value420;
        int value418;
        java.lang.Object value411;
        java.lang.Object value410;
        int value408;
        java.lang.Object value401;
        java.lang.Object value400;
        int value398;
        java.lang.Object value391;
        java.lang.Object value390;
        java.lang.Object value39;
        int value388;
        java.lang.Object value381;
        java.lang.Object value380;
        int value378;
        java.lang.Object value371;
        java.lang.Object value370;
        int value368;
        java.lang.Object value361;
        java.lang.Object value360;
        java.lang.Object value36;
        int value358;
        java.lang.Object value351;
        java.lang.Object value350;
        boolean value35;
        int value348;
        int value341;
        java.lang.Object value340;
        java.lang.Object value339;
        int value337;
        java.lang.Object value330;
        java.lang.Object value329;
        int value327;
        java.lang.Object value320;
        java.lang.Object value319;
        int value317;
        java.lang.Object value310;
        java.lang.Object value309;
        int value307;
        java.lang.Object value300;
        java.lang.Object value299;
        int value297;
        java.lang.Object value290;
        java.lang.Object value289;
        int value287;
        java.lang.Object value280;
        java.lang.Object value279;
        int value277;
        java.lang.Object value270;
        java.lang.Object value269;
        int value267;
        java.lang.Object value260;
        java.lang.Object value259;
        int value257;
        java.lang.Object value250;
        java.lang.Object value249;
        int value247;
        java.lang.Object value240;
        java.lang.Object value239;
        int value237;
        java.lang.Object value232;
        java.lang.Object value230;
        java.lang.Object value229;
        java.lang.Object value228;
        java.lang.Object value227;
        java.lang.Object value226;
        java.lang.Object value225;
        java.lang.Object value224;
        java.lang.Object value223;
        java.lang.Object value222;
        java.lang.Object value215;
        java.lang.Object value214;
        java.lang.Object value213;
        java.lang.Object value212;
        java.lang.Object value208;
        java.lang.Object value204;
        java.lang.Object value203;
        java.lang.Object value202;
        java.lang.Object value201;
        int value196;
        java.lang.Object value194;
        java.lang.Object value186;
        java.lang.Object value185;
        java.lang.Object value184;
        java.lang.Object value181;
        java.lang.Object value179;
        java.lang.Object value178;
        java.lang.Object value177;
        java.lang.Object value174;
        java.lang.Object value172;
        java.lang.Object value171;
        java.lang.Object value170;
        java.lang.Object value169;
        java.lang.Object value165;
        java.lang.Object value163;
        java.lang.Object value162;
        java.lang.Object value161;
        java.lang.Object value158;
        java.lang.Object value157;
        java.lang.Object value156;
        java.lang.Object value155;
        java.lang.String value152;
        int value150;
        java.lang.Object value147;
        java.lang.Object value146;
        java.lang.Object value145;
        java.lang.Object value144;
        java.lang.Object value140;
        java.lang.Object value138;
        java.lang.Object value137;
        java.lang.Object value136;
        java.lang.Object value133;
        java.lang.Object value131;
        java.lang.Object value130;
        java.lang.Object value129;
        java.lang.Object value126;
        java.lang.Object value124;
        java.lang.Object value123;
        java.lang.Object value122;
        java.lang.Object value119;
        java.lang.Object value117;
        java.lang.Object value116;
        java.lang.Object value115;
        java.lang.Object value112;
        java.lang.Object value110;
        java.lang.Object value109;
        java.lang.Object value108;
        java.lang.Object value105;
        java.lang.Object value103;
        java.lang.Object value102;
        java.lang.Object value101;
        client.setting.NumberSetting initialized88;
        client.setting.BooleanSetting initialized79;
        client.setting.NumberSetting initialized72;
        client.setting.NumberSetting initialized65;
        client.setting.BooleanSetting initialized56;
        client.setting.BooleanSetting initialized47;
        java.util.HashMap initialized441;
        net.C_47c4 initialized412;
        net.C_47co initialized402;
        net.C_47cv initialized392;
        net.C_47c9 initialized382;
        client.setting.BooleanSetting initialized38;
        net.C_47cY initialized372;
        client.setting.ModeSetting initialized37;
        net.C_47cS initialized362;
        net.C_47cV initialized352;
        net.C_47cf initialized342;
        net.C_47cp initialized331;
        net.C_47cF initialized321;
        net.C_47cL initialized311;
        net.C_47cg initialized301;
        net.C_47cs initialized291;
        net.C_47ch initialized281;
        net.C_47cj initialized271;
        net.C_47cU initialized261;
        net.C_47cc initialized251;
        net.C_47c8 initialized241;
        net.C_47ci initialized231;
        java.lang.StringBuilder initialized221;
        java.util.concurrent.ConcurrentHashMap initialized220;
        java.util.HashMap initialized219;
        net.C_47cu initialized218;
        net.C_47tf initialized217;
        java.text.DecimalFormat initialized216;
        client.setting.BooleanSetting initialized205;
        client.setting.BooleanSetting initialized193;
        client.setting.BooleanSetting initialized192;
        client.setting.BooleanSetting initialized191;
        client.setting.ModeSetting initialized190;
        client.setting.BooleanSetting initialized188;
        client.setting.BooleanSetting initialized187;
        client.setting.NumberSetting initialized180;
        client.setting.NumberSetting initialized173;
        client.setting.BooleanSetting initialized164;
        client.setting.NumberSetting initialized148;
        client.setting.BooleanSetting initialized139;
        client.setting.NumberSetting initialized132;
        client.setting.NumberSetting initialized125;
        client.setting.NumberSetting initialized118;
        client.setting.NumberSetting initialized111;
        client.setting.NumberSetting initialized104;
        short converted89;
        byte converted414;
        byte converted404;
        byte converted394;
        byte converted384;
        byte converted374;
        byte converted364;
        byte converted354;
        byte converted344;
        byte converted333;
        byte converted323;
        byte converted313;
        byte converted303;
        byte converted293;
        byte converted283;
        byte converted273;
        byte converted263;
        byte converted253;
        byte converted243;
        byte converted233;
        byte converted195;
        short converted149;
        java.lang.Object arrayValue429;
        java.lang.Object value207;

        recovery$indy$flow$738(this, null);
        value35 = recovery$indy$flow$739();
        value36 = recovery$indy$flow$741(0);
        initialized37 = new client.setting.ModeSetting((client.module.Module) (this), "Mode", constructorKey11, "", (java.lang.String[]) (value36));
        recovery$indy$flow$743(this, initialized37);
        initialized38 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "WaitForDamage", true);
        value39 = recovery$indy$flow$746(this);
        value43 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized38))))));
        value44 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value39))))));
        value45 = recovery$indy$flow$749(value43, constructorKey7, value44);
        value46 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value45))))));
        recovery$indy$flow$751(this, value46);
        initialized47 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "AutoJump", true);
        value48 = recovery$indy$flow$754(this);
        value52 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized47))))));
        value53 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value48))))));
        value54 = recovery$indy$flow$757(value52, constructorKey7, value53);
        value55 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value54))))));
        recovery$indy$flow$759(this, value55);
        initialized56 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "OnGroundPacket", true);
        value57 = recovery$indy$flow$762(this);
        value61 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized56))))));
        value62 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value57))))));
        value63 = recovery$indy$flow$765(value61, constructorKey7, value62);
        value64 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value63))))));
        recovery$indy$flow$767(this, value64);
        initialized65 = new client.setting.NumberSetting((client.module.Module) (this), "VanillaSpeed", 1.0D, constructorKey17, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4621256167635550208L), 1);
        value66 = recovery$indy$flow$770(this);
        value69 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized65))))));
        value70 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value66))))));
        value71 = recovery$indy$flow$773(value69, value70);
        recovery$indy$flow$774(this, value71);
        initialized72 = new client.setting.NumberSetting((client.module.Module) (this), "VerusSpeed", 1.0D, constructorKey17, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4621256167635550208L), 1);
        value73 = recovery$indy$flow$777(this);
        value76 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized72))))));
        value77 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value73))))));
        value78 = recovery$indy$flow$780(value76, value77);
        recovery$indy$flow$781(this, value78);
        initialized79 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "OnlyOnGround", true);
        value80 = recovery$indy$flow$784(this);
        value84 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized79))))));
        value85 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value80))))));
        value86 = recovery$indy$flow$787(value84, constructorKey7, value85);
        value87 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value86))))));
        recovery$indy$flow$789(this, value87);
        initialized88 = new client.setting.NumberSetting((client.module.Module) (this), "VerusSpeedCombined", 1.0D, constructorKey17, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4621256167635550208L), 1);
        converted89 = (short) (constructorPart10);
        value90 = (int) (converted89);
        value92 = "VerusSpeed";
        value95 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized88))))));
        value96 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value92))))));
        value97 = recovery$indy$flow$794(value95, constructorPart8, value96, constructorPart9, (short) (value90));
        value98 = recovery$indy$flow$795(this);
        value101 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value97))))));
        value102 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value98))))));
        value103 = recovery$indy$flow$798(value101, value102);
        recovery$indy$flow$799(this, value103);
        initialized104 = new client.setting.NumberSetting((client.module.Module) (this), "CubeCraftSpeed", Double.longBitsToDouble(4613937818241073152L), constructorKey17, 0.0D, Double.longBitsToDouble(4617315517961601024L), 2);
        value105 = recovery$indy$flow$802(this);
        value108 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized104))))));
        value109 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value105))))));
        value110 = recovery$indy$flow$805(value108, value109);
        recovery$indy$flow$806(this, value110);
        initialized111 = new client.setting.NumberSetting((client.module.Module) (this), "CubeCraftStopDuration", Double.longBitsToDouble(4616189618054758400L), constructorKey17, 0.0D, Double.longBitsToDouble(4617315517961601024L), 1);
        value112 = recovery$indy$flow$809(this);
        value115 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized111))))));
        value116 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value112))))));
        value117 = recovery$indy$flow$812(value115, value116);
        recovery$indy$flow$813(this, value117);
        initialized118 = new client.setting.NumberSetting((client.module.Module) (this), "CollisionY", 1.0D, constructorKey17, 0.0D, 1.0D, 2);
        value119 = recovery$indy$flow$816(this);
        value122 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized118))))));
        value123 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value119))))));
        value124 = recovery$indy$flow$819(value122, value123);
        recovery$indy$flow$820(this, value124);
        initialized125 = new client.setting.NumberSetting((client.module.Module) (this), "Height", 1.0D, constructorKey17, 1.0D, Double.longBitsToDouble(4620693217682128896L), 2);
        value126 = recovery$indy$flow$823(this);
        value129 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized125))))));
        value130 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value126))))));
        value131 = recovery$indy$flow$826(value129, value130);
        recovery$indy$flow$827(this, value131);
        initialized132 = new client.setting.NumberSetting((client.module.Module) (this), "Boost", 1.0D, constructorKey17, 1.0D, Double.longBitsToDouble(4620693217682128896L), 2);
        value133 = recovery$indy$flow$830(this);
        value136 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized132))))));
        value137 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value133))))));
        value138 = recovery$indy$flow$833(value136, value137);
        recovery$indy$flow$834(this, value138);
        initialized139 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "HelpMessage", true);
        value140 = recovery$indy$flow$837(this);
        value144 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized139))))));
        value145 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value140))))));
        value146 = recovery$indy$flow$840(value144, constructorKey7, value145);
        value147 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value146))))));
        recovery$indy$flow$842(this, value147);
        initialized148 = new client.setting.NumberSetting((client.module.Module) (this), "VulcanCollisionY", 1.0D, constructorKey17, 0.0D, 1.0D, 2);
        converted149 = (short) (constructorPart10);
        value150 = (int) (converted149);
        value152 = "CollisionY";
        value155 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized148))))));
        value156 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value152))))));
        value157 = recovery$indy$flow$847(value155, constructorPart8, value156, constructorPart9, (short) (value150));
        value158 = recovery$indy$flow$848(this);
        value161 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value157))))));
        value162 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value158))))));
        value163 = recovery$indy$flow$851(value161, value162);
        recovery$indy$flow$852(this, value163);
        initialized164 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "Timer", true);
        value165 = recovery$indy$flow$855(this);
        value169 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized164))))));
        value170 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value165))))));
        value171 = recovery$indy$flow$858(value169, constructorKey7, value170);
        value172 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value171))))));
        recovery$indy$flow$860(this, value172);
        initialized173 = new client.setting.NumberSetting((client.module.Module) (this), "TimerSpeed", Double.longBitsToDouble(4617315517961601024L), constructorKey17, Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4621819117588971520L), 2);
        value174 = recovery$indy$flow$863(this);
        value177 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized173))))));
        value178 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value174))))));
        value179 = recovery$indy$flow$866(value177, value178);
        recovery$indy$flow$867(this, value179);
        initialized180 = new client.setting.NumberSetting((client.module.Module) (this), "TimerSpeedEnd", 1.0D, constructorKey17, Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4632233691727265792L), 2);
        value181 = recovery$indy$flow$870(this);
        value184 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialized180))))));
        value185 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value181))))));
        value186 = recovery$indy$flow$873(value184, value185);
        recovery$indy$flow$874(this, value186);
        initialized187 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "DisableAura", false);
        recovery$indy$flow$877(this, initialized187);
        initialized188 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "CancelS08", false);
        recovery$indy$flow$880(this, initialized188);
        value189 = recovery$indy$flow$882(4);
        ((java.lang.Object[]) value189)[0] = "None";
        ((java.lang.Object[]) value189)[1] = "OnlyIncoming";
        ((java.lang.Object[]) value189)[2] = "OnlyOutgoing";
        ((java.lang.Object[]) value189)[3] = "Both";
        initialized190 = new client.setting.ModeSetting((client.module.Module) (this), "BlinkMode", constructorKey11, "None", (java.lang.String[]) (value189));
        recovery$indy$flow$884(this, initialized190);
        initialized191 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "DistanceFlown", false);
        recovery$indy$flow$887(this, initialized191);
        initialized192 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "SpigotFlyKickBypass", false);
        recovery$indy$flow$890(this, initialized192);
        initialized193 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "EnderDragon", false);
        value194 = recovery$indy$flow$893(this);
        converted195 = (byte) (constructorPart5);
        value196 = (int) (converted195);
        value201 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized193))))));
        value202 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(value194))))));
        value203 = recovery$indy$flow$896(value201, constructorPart3, constructorPart4, value202, (byte) (value196));
        value204 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value203))))));
        recovery$indy$flow$898(this, value204);
        initialized205 = new client.setting.BooleanSetting((client.module.Module) (this), constructorKey15, "EnderDragonSound", false);
        value206 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this)))).settingEnderDragon));
        value207 = recovery$indy$flow$902(value206);
        value208 = recovery$indy$flow$903(value206);
        value212 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialized205))))));
        value213 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value208))))));
        value214 = recovery$indy$flow$906(value212, constructorKey7, value213);
        value215 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value214))))));
        recovery$indy$flow$908(this, value215);
        initialized216 = new java.text.DecimalFormat("0.0");
        recovery$indy$flow$911(this, initialized216);
        initialized217 = new net.C_47tf(0.0D, 0.0D, 0.0D);
        recovery$indy$flow$914(this, initialized217);
        recovery$indy$flow$915(this, 0L);
        initialized218 = new net.C_47cu();
        recovery$indy$flow$918(this, initialized218);
        initialized219 = new java.util.HashMap();
        recovery$indy$flow$921(this, initialized219);
        initialized220 = new java.util.concurrent.ConcurrentHashMap();
        recovery$indy$flow$924(this, initialized220);
        initialized221 = new java.lang.StringBuilder();
        value222 = recovery$indy$flow$927();
        value223 = recovery$indy$flow$928(initialized221, value222);
        value224 = recovery$indy$flow$929();
        value225 = recovery$indy$flow$930(value223, value224);
        value226 = recovery$indy$flow$931(value225, "motionmodifier");
        value227 = recovery$indy$flow$932();
        value228 = recovery$indy$flow$933(value226, value227);
        value229 = recovery$indy$flow$934(value228, "fly");
        value230 = recovery$indy$flow$935(value229);
        recovery$indy$flow$936(this, value230);
        initialized231 = new net.C_47ci("AirJump", (augustus.recovered.modules.movement.Fly_47kE) (this));
        recovery$indy$flow$939(this, initialized231);
        value232 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this)))).field_48));
        converted233 = (byte) (constructorPart12);
        value237 = (int) (converted233);
        value239 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value240 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(value232))))));
        recovery$indy$flow$943(value239, (byte) (value237), constructorPart13, value240, constructorPart14);
        initialized241 = new net.C_47c8("Vanilla1", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted243 = (byte) (constructorPart12);
        value247 = (int) (converted243);
        value249 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value250 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized241))))));
        recovery$indy$flow$948(value249, (byte) (value247), constructorPart13, value250, constructorPart14);
        initialized251 = new net.C_47cc("Vanilla2", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted253 = (byte) (constructorPart12);
        value257 = (int) (converted253);
        value259 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value260 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized251))))));
        recovery$indy$flow$953(value259, (byte) (value257), constructorPart13, value260, constructorPart14);
        initialized261 = new net.C_47cU("GroundCollision", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted263 = (byte) (constructorPart12);
        value267 = (int) (converted263);
        value269 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value270 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized261))))));
        recovery$indy$flow$958(value269, (byte) (value267), constructorPart13, value270, constructorPart14);
        initialized271 = new net.C_47cj("Minemora1", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted273 = (byte) (constructorPart12);
        value277 = (int) (converted273);
        value279 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value280 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized271))))));
        recovery$indy$flow$963(value279, (byte) (value277), constructorPart13, value280, constructorPart14);
        initialized281 = new net.C_47ch("Minemora2", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted283 = (byte) (constructorPart12);
        value287 = (int) (converted283);
        value289 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value290 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized281))))));
        recovery$indy$flow$968(value289, (byte) (value287), constructorPart13, value290, constructorPart14);
        initialized291 = new net.C_47cs("OldVerus", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted293 = (byte) (constructorPart12);
        value297 = (int) (converted293);
        value299 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value300 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized291))))));
        recovery$indy$flow$973(value299, (byte) (value297), constructorPart13, value300, constructorPart14);
        initialized301 = new net.C_47cg("Verus1", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted303 = (byte) (constructorPart12);
        value307 = (int) (converted303);
        value309 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value310 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized301))))));
        recovery$indy$flow$978(value309, (byte) (value307), constructorPart13, value310, constructorPart14);
        initialized311 = new net.C_47cL("Verus2", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted313 = (byte) (constructorPart12);
        value317 = (int) (converted313);
        value319 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value320 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized311))))));
        recovery$indy$flow$983(value319, (byte) (value317), constructorPart13, value320, constructorPart14);
        initialized321 = new net.C_47cF("Verus3", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted323 = (byte) (constructorPart12);
        value327 = (int) (converted323);
        value329 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value330 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized321))))));
        recovery$indy$flow$988(value329, (byte) (value327), constructorPart13, value330, constructorPart14);
        initialized331 = new net.C_47cp("VerusCombined", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted333 = (byte) (constructorPart12);
        value337 = (int) (converted333);
        value339 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value340 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized331))))));
        recovery$indy$flow$993(value339, (byte) (value337), constructorPart13, value340, constructorPart14);
        value341 = (int) ((value35 ? 1 : 0));
        initialized342 = new net.C_47cf("UniversoCraft", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted344 = (byte) (constructorPart12);
        value348 = (int) (converted344);
        value350 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value351 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized342))))));
        recovery$indy$flow$998(value350, (byte) (value348), constructorPart13, value351, constructorPart14);
        initialized352 = new net.C_47cV("CubeCraft", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted354 = (byte) (constructorPart12);
        value358 = (int) (converted354);
        value360 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value361 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized352))))));
        recovery$indy$flow$1003(value360, (byte) (value358), constructorPart13, value361, constructorPart14);
        initialized362 = new net.C_47cS("OldGomme", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted364 = (byte) (constructorPart12);
        value368 = (int) (converted364);
        value370 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value371 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized362))))));
        recovery$indy$flow$1008(value370, (byte) (value368), constructorPart13, value371, constructorPart14);
        initialized372 = new net.C_47cY("GrimFly", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted374 = (byte) (constructorPart12);
        value378 = (int) (converted374);
        value380 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value381 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized372))))));
        recovery$indy$flow$1013(value380, (byte) (value378), constructorPart13, value381, constructorPart14);
        initialized382 = new net.C_47c9("Vulcan", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted384 = (byte) (constructorPart12);
        value388 = (int) (converted384);
        value390 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value391 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized382))))));
        recovery$indy$flow$1018(value390, (byte) (value388), constructorPart13, value391, constructorPart14);
        initialized392 = new net.C_47cv("IntaveBoat", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted394 = (byte) (constructorPart12);
        value398 = (int) (converted394);
        value400 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value401 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized392))))));
        recovery$indy$flow$1023(value400, (byte) (value398), constructorPart13, value401, constructorPart14);
        initialized402 = new net.C_47co("BedwarsPractice", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted404 = (byte) (constructorPart12);
        value408 = (int) (converted404);
        value410 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value411 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized402))))));
        recovery$indy$flow$1028(value410, (byte) (value408), constructorPart13, value411, constructorPart14);
        initialized412 = new net.C_47c4("AirPlace", (augustus.recovered.modules.movement.Fly_47kE) (this));
        converted414 = (byte) (constructorPart12);
        value418 = (int) (converted414);
        value420 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        value421 = ((java.lang.Object)(((net.C_47c1) (((java.lang.Object)(initialized412))))));
        recovery$indy$flow$1033(value420, (byte) (value418), constructorPart13, value421, constructorPart14);
        value422 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this)))).field_42p));
        value423 = recovery$indy$flow$1035(value422);
        value424 = recovery$indy$flow$1036(0);
        value425 = recovery$indy$flow$1037(value423, value424);
        value426 = recovery$indy$flow$1038(value425);
        value428 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this)))).settingMode));
        arrayValue429 = ((java.lang.Object[]) value426)[0];
        value432 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value428))))));
        value433 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(arrayValue429))))));
        recovery$indy$flow$1042(value432, value433);
        value434 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this)))).settingMode));
        value438 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value434))))));
        value439 = recovery$indy$flow$1045(value426);
        recovery$indy$flow$1046(value438, value439, constructorKey16);
        value440 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this)))).field_42p));
        initialized441 = new java.util.HashMap((java.util.Map) (value440));
        recovery$indy$flow$1050(this, initialized441);
        value444 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this))))));
        recovery$indy$flow$1052(value444, constructorKey6);
        value445 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this)))).field_44));
        value446 = recovery$indy$flow$1054(0);
        value447 = recovery$indy$flow$1055(value445, value446);
        if (value341 == 0) {
            regionValue448 = value447;
            regionValue449 = 0;
            break region1436;
        } else {
            regionValue452 = 0;
            break region1425;
        }
        }
        value453 = recovery$indy$flow$1056(regionValue452);
        value454 = recovery$indy$flow$1057(value447, value453);
        if ((int) ((value454 ? 1 : 0)) != 0) {
            break region1443;
        } else {
            break region1428;
        }
        }
        break region1430;
        }
        value457 = ((java.lang.Object)(((augustus.recovered.modules.movement.Fly_47kE) (((java.lang.Object)(this)))).field_44));
        value458 = recovery$indy$flow$1059(0);
        value459 = recovery$indy$flow$1060(value457, value458);
        regionValue448 = value459;
        regionValue449 = 0;
        break region1436;
        }
        value460 = recovery$indy$flow$1061(regionValue449);
        try {
        java.lang.Object value461;

        value461 = recovery$indy$flow$1062(regionValue448, value460);
        } catch (java.io.IOException directoryFailure) {
        recovery$indy$flow$1063(directoryFailure);
        break region1443;
        }
        break region1443;
        }
        return;
    }















    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);
    private static native boolean recovery$indy$flow$169(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$177(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$188(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$199(java.lang.Object a0,java.lang.Object a1,short a2,char a3,int a4,boolean a5,long a6,long a7);
    private static native java.lang.Object recovery$indy$flow$200(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$204(java.lang.Object a0,java.lang.Object a1,short a2,char a3,int a4,boolean a5,long a6,long a7);
    private static native java.lang.Object recovery$indy$flow$205(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$224(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$230();
    private static native void recovery$indy$flow$234(java.lang.Object a0,java.lang.Object a1,long a2,long a3);
    private static native void recovery$indy$flow$236(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static boolean recovery$indy$flow$737(java.lang.Object a0) {
        return (a0 instanceof java.io.IOException);
    }
    private static void recovery$indy$flow$738(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.Fly_47kE) (a0)).field_42d = ((net.C_47Bo) (a1));
        return;
    }
    private static native boolean recovery$indy$flow$739();
    private static native java.lang.Object recovery$indy$flow$741(int a0);
    private static native void recovery$indy$flow$743(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$746(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$749(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$751(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$754(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$757(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$759(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$762(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$765(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$767(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$770(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$773(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$774(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$777(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$780(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$781(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$784(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$787(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$789(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$794(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$795(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$798(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$799(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$802(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$805(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$806(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$809(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$812(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$813(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$816(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$819(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$820(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$823(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$826(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$827(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$830(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$833(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$834(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$837(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$840(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$842(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$847(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$848(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$851(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$852(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$855(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$858(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$860(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$863(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$866(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$867(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$870(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$873(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$874(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$877(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$880(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$882(int a0);
    private static native void recovery$indy$flow$884(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$887(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$890(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$893(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$896(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$898(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$902(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$903(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$906(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$908(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$911(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$914(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.Fly_47kE) (a0)).field_42k = ((net.C_47tf) (a1));
        return;
    }
    private static void recovery$indy$flow$915(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.movement.Fly_47kE) (a0)).field_42W = a1;
        return;
    }
    private static native void recovery$indy$flow$918(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$921(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$924(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$927() {
        return net.C_47VK.field_42;
    }
    private static java.lang.Object recovery$indy$flow$928(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$929() {
        return java.io.File.separator;
    }
    private static java.lang.Object recovery$indy$flow$930(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$931(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$932() {
        return java.io.File.separator;
    }
    private static java.lang.Object recovery$indy$flow$933(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$934(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$935(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native void recovery$indy$flow$936(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$939(java.lang.Object a0,java.lang.Object a1);



    private static native void recovery$indy$flow$943(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$948(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$953(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$958(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$963(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$968(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$973(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$978(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$983(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$988(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$993(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$998(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$1003(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$1008(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$1013(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$1018(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$1023(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$1028(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);


    private static native void recovery$indy$flow$1033(java.lang.Object a0,byte a1,int a2,java.lang.Object a3,int a4);

    private static java.lang.Object recovery$indy$flow$1035(java.lang.Object a0) {
        return ((java.util.HashMap) (a0)).keySet();
    }
    private static native java.lang.Object recovery$indy$flow$1036(int a0);
    private static java.lang.Object recovery$indy$flow$1037(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Set) (a0)).toArray(((java.lang.Object[]) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1038(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }



    private static native void recovery$indy$flow$1042(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$1045(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }
    private static native void recovery$indy$flow$1046(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$1050(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$1052(java.lang.Object a0,long a1);

    private static native java.lang.Object recovery$indy$flow$1054(int a0);
    private static java.lang.Object recovery$indy$flow$1055(java.lang.Object a0,java.lang.Object a1) {
        return java.nio.file.Paths.get(((java.lang.String) (a0)), ((java.lang.String[]) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$1056(int a0);
    private static boolean recovery$indy$flow$1057(java.lang.Object a0,java.lang.Object a1) {
        return java.nio.file.Files.exists(((java.nio.file.Path) (a0)), ((java.nio.file.LinkOption[]) (a1)));
    }

    private static native java.lang.Object recovery$indy$flow$1059(int a0);
    private static java.lang.Object recovery$indy$flow$1060(java.lang.Object a0,java.lang.Object a1) {
        return java.nio.file.Paths.get(((java.lang.String) (a0)), ((java.lang.String[]) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$1061(int a0);
    private static native java.lang.Object recovery$indy$flow$1062(java.lang.Object a0,java.lang.Object a1) throws java.io.IOException;
    private static void recovery$indy$flow$1063(java.lang.Object a0) {
        ((java.io.IOException) (a0)).printStackTrace();
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$12(long var0, long var2);
   private static native JsonArray recovery$indy$13(Object var0, long var1, Object var3, Object var4, long var5, long var7);
   private static native JsonObject recovery$indy$14(long var0, Object var2, Object var3, Object var4, long var5, long var7);
   private static native void recovery$indy$15(Object var0, Object var1, long var2, long var4);
   private static native Function recovery$indy$16();
   private static native boolean recovery$indy$17(Object var0, Object var1, long var2, boolean var4, Object var5, long var6, long var8);
   private static native String recovery$indy$18(int var0, long var1);
   private static native Consumer recovery$indy$19(C_47cr var0);
   private static native String recovery$indy$20(int var0, long var1);
   private static native C_47c1 recovery$indy$21(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$22(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$23(long var0, long var2, long var4);
   private static native float recovery$indy$24(long var0, long var2, long var4);
   private static native void recovery$indy$25(Object var0, float var1, long var2, long var4);
   private static native MethodHandle recovery$constant$26();
   private static native C_47c1 recovery$indy$27(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$28(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$29(long var0, long var2, long var4);
   private static native float recovery$indy$30(long var0, long var2, long var4);
   private static native void recovery$indy$31(Object var0, float var1, long var2, long var4);
   private static native C_47c1 recovery$indy$32(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$33(Object var0, Object var1, long var2, long var4);
   private static native C_47c1 recovery$indy$34(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$35(Object var0, long var1, Object var3, long var4, long var6);
   private static native C_47c1 recovery$indy$36(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$37(Object var0, long var1, Object var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$38(Object var0, long var1, long var3);
   private static native double recovery$indy$39(Object var0, long var1, double var3, double var5, long var7, long var9);
   private static native EntityPlayerSP recovery$indy$40(Object var0, long var1, long var3);
   private static native double recovery$indy$41(Object var0, long var1, double var3, double var5, long var7, long var9);
   private static native EntityPlayerSP recovery$indy$42(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$43(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$44(Object var0, long var1, long var3);
   private static native String recovery$indy$45(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$46(Object var0, long var1, long var3);
   private static native String recovery$indy$47(int var0, long var1);
   private static native String recovery$indy$48(int var0, long var1);
   private static native FontRenderer recovery$indy$49(Object var0, long var1, long var3);
   private static native FontRenderer recovery$indy$50(Object var0, long var1, long var3);
   private static native String recovery$indy$51(Object var0, long var1, long var3);
   private static native boolean recovery$indy$52(long var0, long var2);
   private static native String recovery$indy$53(int var0, long var1);
   private static native C_47cr recovery$indy$54(Object var0, Object var1, short var2, char var3, int var4, boolean var5, long var6, long var8);
   private static native String recovery$indy$55(Object var0, long var1, long var3);
   private static native IntFunction recovery$indy$56();
   private static native String recovery$indy$57(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$58(Object var0, Object var1, long var2, long var4);
   private static native void recovery$indy$59(Object var0, Object var1, long var2, long var4, long var6);
   private static native C_47c1 recovery$indy$60(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$61(Object var0, short var1, Object var2, char var3, int var4, long var5, long var7);
   private static native C_47c1 recovery$indy$62(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$63(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$64(long var0, long var2);
   private static native C_47c1 recovery$indy$65(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$66(Object var0, long var1, short var3, long var4, long var6);
   private static native void recovery$indy$67(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$68(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$69(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$70(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$71(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$72(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$73(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$74(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$75(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$76(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$77(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$78(Object var0, int var1, long var2, long var4, long var6);
   private static native C_47c1 recovery$indy$79(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$80(Object var0, char var1, int var2, char var3, long var4, long var6);
   private static native void recovery$indy$81(Object var0, int var1, short var2, char var3, long var4, long var6);
   private static native String recovery$indy$82(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$83(Object var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$84(long var0, long var2);
   private static native C_40X recovery$indy$85(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$86(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$87(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$88(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$89(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$90(Object var0, long var1, long var3);
   private static native C_47c1 recovery$indy$91(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$92(Object var0, long var1, long var3, long var5);
   private static native C_40X recovery$indy$93(Object var0, long var1, long var3);
   private static native void recovery$indy$94(Object var0, long var1, long var3);
}
