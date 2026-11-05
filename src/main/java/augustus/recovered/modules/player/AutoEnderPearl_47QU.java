package augustus.recovered.modules.player;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_43B;
import net.C_45n;
import net.C_473U;
import net.C_474i;
import net.C_475c;
import net.C_475e;
import net.C_477r;
import net.C_478Q;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Ij;
import client.module.Module;
import client.module.ModuleManager;
import net.C_47S6;
import net.C_47TT;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47UH;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import client.ClientGlobals;
import net.C_47rf;
import client.module.Category;
import net.C_47xZ;
import net.C_47xz;
import net.C_484;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoEnderPearl_47QU extends client.module.Module implements net.C_47UH,net.C_47xz,net.C_47iC,net.C_48T {
    public final client.setting.BooleanSetting settingAutoAirstuck = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingUnstuckIfCombatPearlDidnTLand = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyIfPlayerIsFallingIntoTheVoid = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingAutoDisable = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_47; // Runtime access flags and ConstantValue are restored from the original class.
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

   public void method_41$fae8de1664(C_475c var1) {
      AutoEnderPearl_47QU var31;
      label114: {
         long var2 = a ^ 101421681043444L;
         long var4 = var2 ^ 8141562557256L;
         long var10001 = var2 ^ 84726979948789L;
         int var6 = (int)((var2 ^ 84726979948789L) >>> 48);
         int var7 = (int)((var2 ^ 84726979948789L) << 16 >>> 32);
         int var8 = (int)(var10001 << 48 >>> 48);
         long var10000 = -6878594015712541505L;
         boolean var9 = AirStuck_47Q4.method_45$aae029aa0a();
         char var36 = (char)var6;
         char var10004 = (char)var8;
         long var10005 = -6877752798101966881L;
         char var10 = var10004;
         AutoEnderPearl_47QU var11 = this;
         int var12 = var7;
         char var13 = var36;
         C_47S6 var14 = ClientGlobals.field_46;
         boolean var30 = var14.method_49$dc3f815dad(var13, var12, var11, var10);
         if (var9) {
            if (!var30) {
               return;
            }

            var31 = this;
            if (!var9) {
               break label114;
            }

            var30 = this.field_43a;
         }

         label77:
         if (var30) {
            var10001 = -6877108758193975715L;
            Minecraft var15 = field_43;
            C_47rf var32 = var15.field_42P.method_48$ac4db64966();
            if (var9) {
               if (var32 == null) {
                  break label77;
               }

               var10001 = -6877108758193975715L;
               Minecraft var16 = field_43;
               var32 = var16.field_42P.method_48$ac4db64966();
            }

            boolean var33 = var32.method_48$dbd570a038() instanceof C_43B;
            if (var9) {
               if (!var33) {
                  break label77;
               }

               var33 = this.field_43v;
            }

            if (var9) {
               if (!var33) {
                  long var10002 = -6877390194926624515L;
                  byte var17 = 1;
                  C_475c var18 = var1;
                  var18.method_48$d00df7729d(var17);
                  this.field_47 = System.currentTimeMillis();
               }

               var10001 = -6877908516109562144L;
               BooleanSetting var19 = this.settingAutoAirstuck;
               var33 = var19.method_49$aae029aa0a();
            }

            label93: {
               label92: {
                  label111: {
                     if (var9) {
                        if (var33) {
                           long var10003 = -6878684880256414490L;
                           boolean var20 = true;
                           long var21 = var4;
                           AirStuck_47Q4 var23 = ClientGlobals.field_48.field_48i;
                           var23.method_46$b757cde368(var21, var20);
                           this.field_43v = true;
                           if (var9) {
                              break label77;
                           }
                        }

                        var31 = this;
                        if (!var9) {
                           break label111;
                        }

                        var10001 = -6877908516109562144L;
                        BooleanSetting var24 = this.settingAutoDisable;
                        var33 = var24.method_49$aae029aa0a();
                     }

                     if (!var33) {
                        var31 = this;
                        if (!var9) {
                           break label93;
                        }

                        var10001 = -6877908516109562144L;
                        BooleanSetting var25 = this.settingOnlyIfPlayerIsFallingIntoTheVoid;
                        if (var25.method_49$aae029aa0a()) {
                           break label92;
                        }
                     }

                     var31 = this;
                  }

                  long var42 = -6878684880256414490L;
                  boolean var26 = false;
                  long var27 = var4;
                  AutoEnderPearl_47QU var29 = var31;
                  var29.method_46$b757cde368(var27, var26);
                  if (var9) {
                     break label77;
                  }
               }

               this.field_42 = -1;
               var31 = this;
            }

            var31.field_43P = true;
         }

         var31 = this;
      }

      var31.field_43a = true;
   }





   public int method_45$95d88932bd(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$1(-4520670366302739082L, var1);
      int var4 = 36;

      while (var4 < recovery$indy$2(field_43, -4519763090854727788L, var1).field_429.field_46.size()) {
         C_47rf var5 = recovery$indy$3(field_43, -4519763090854727788L, var1).field_429.method_46$4c10532da1(var4).method_48$ac4db64966();
         byte var10000 = (byte) ((var3) ? 1 : 0);
         if (var1 >= 0L) {
            if (var3) {
               label57: {
                  C_47rf var7 = var5;
                  if (var1 > 0L) {
                     if (var5 == null) {
                        break label57;
                     }

                     var7 = var5;
                  }

                  var10000 = (byte) ((var7.method_48$dbd570a038() instanceof C_43B) ? 1 : 0);
                  if (!var3) {
                     return var10000;
                  }

                  if (var10000 != 0) {
                     return var4 - 36;
                  }
               }

               var4++;
            }

            var10000 = (byte) ((var3) ? 1 : 0);
         }

         if (!(var10000 != 0)) {
            break;
         }
      }

      return -1;
   }



   public boolean method_45$5eec879a9c(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      boolean var6 = recovery$indy$4(568323151826658262L, var4);
      int var7 = 9;

      while (var7 < recovery$indy$5(field_43, 569388485326104884L, var4).field_429.field_46.size()) {
         C_47rf var8 = recovery$indy$6(field_43, 569388485326104884L, var4).field_429.method_46$4c10532da1(var7).method_48$ac4db64966();
         boolean var10000 = var6;
         if (var1 >= 0L) {
            if (var6) {
               label56: {
                  C_47rf var9 = var8;
                  if (var1 > 0L) {
                     if (var8 == null) {
                        break label56;
                     }

                     var9 = var8;
                  }

                  var10000 = var9.method_48$dbd570a038() instanceof C_43B;
                  if (!var6) {
                     return var10000;
                  }

                  if (var10000) {
                     return true;
                  }
               }

               var7++;
            }

            var10000 = var6;
         }

         if (!var10000) {
            break;
         }
      }

      return false;
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      augustus.recovered.modules.player.AutoEnderPearl_47QU var8;
      long var4 = var1 ^ 59735639340751L;
      boolean var6 = recovery$indy$7(2670161415380276504L, var1);
      C_473U var7 = recovery$indy$8(var3, 2668682794781085732L, var1);
      boolean var10000 = var7 instanceof C_47xZ;
      if (!var6) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$9(this.settingAutoAirstuck, 2669495033488886631L, var1);
      }

      label52: {
         label51: {
            label61: {
               if (!var6) {
                  if (!var10000) {
                     return;
                  }

                  var8 = this;
                  if (var6) {
                     break label61;
                  }

                  var10000 = recovery$indy$10(this.settingOnlyIfPlayerIsFallingIntoTheVoid, 2669495033488886631L, var1);
               }

               if (var10000) {
                  var10000 = recovery$indy$11(this.settingAutoDisable, 2669495033488886631L, var1);
                  if (var6) {
                     break label52;
                  }

                  if (!var10000) {
                     break label51;
                  }
               }

               var8 = this;
            }

            recovery$indy$12(var8, var4, false, 2669844820529695073L, var1);
            if (!var6) {
               return;
            }
         }

         var10000 = recovery$indy$13(this.settingAutoAirstuck, 2669495033488886631L, var1);
      }

      if (var10000) {
         recovery$indy$14(ClientGlobals.field_48.field_48i, var4, false, 2669844820529695073L, var1);
      }
   }



   public void method_40G$e45a9973e5(long var1) {
      long var10001 = var1 ^ 6407505185672L;
      int var3 = (int)((var1 ^ 6407505185672L) >>> 32);
      int var4 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      boolean var9 = recovery$indy$15(-3625934629485085256L, var1);
      AutoEnderPearl_47QU var10000 = this;
      if (!var9) {
         if (this.field_42 == -1) {
            return;
         }

         var10000 = this;
      }

      int var6 = this.field_42;
      byte var7 = -2;
      AutoEnderPearl_47QU var8 = var10000;
      recovery$indy$16(var3, var8, var7, (char)var4, (char)var5, var6, -3625989661712593659L, var1);
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$17(this, 7, var3, -7100914714149707113L, var1);
      recovery$indy$18(this, 40, var3, -7100914714149707113L, var1);
      recovery$indy$19(this, 26, var3, -7100914714149707113L, var1);
      recovery$indy$20(this, 34, var3, -7100914714149707113L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 945191028566L;
      boolean var5 = recovery$indy$21(-7740468863159717727L, var1);
      if (recovery$indy$22(this.settingAutoAirstuck, -7740908073760261378L, var1)) {
         ModuleManager var10000 = ClientGlobals.field_48;
         if (var5) {
            if (ClientGlobals.field_48 == null) {
               return;
            }

            var10000 = ClientGlobals.field_48;
         }

         recovery$indy$23(var10000.field_48i, var3, false, -7740553955238709000L, var1);
      }
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43a = false;
      this.field_43v = false;
      this.field_43P = false;
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 88326543115044L;
      long var3 = var1 ^ 116557947522707L;
      long var5 = var1 ^ 132776119805761L;
      long var7 = var1 ^ 18371206823682L;
      long var9 = var1 ^ 12149012223896L;
      int var11 = (int)((var1 ^ 51366119246188L) >>> 48);
      long var12 = (var1 ^ 51366119246188L) << 16 >>> 16;
      long var10001 = var1 ^ 81053336192265L;
      int var14 = (int)((var1 ^ 81053336192265L) >>> 32);
      int var15 = (int)((var1 ^ 81053336192265L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var1 ^ 26933110702496L;
      long var19 = var1 ^ 98530288517737L;
      var10001 = var1 ^ 90864122169193L;
      int var21 = (int)((var1 ^ 90864122169193L) >>> 48);
      int var22 = (int)((var1 ^ 90864122169193L) << 16 >>> 48);
      int var23 = (int)(var10001 << 32 >>> 32);
      long var24 = (var1 ^ 23335588660425L) >>> 16;
      int var26 = (int)((var1 ^ 23335588660425L) << 48 >>> 48);
      var10001 = var1 ^ 138410340241604L;
      int var27 = (int)((var1 ^ 138410340241604L) >>> 48);
      int var28 = (int)((var1 ^ 138410340241604L) << 16 >>> 32);
      int var29 = (int)(var10001 << 48 >>> 48);
      boolean var30 = AirStuck_47Q4.method_419$aae029aa0a();
      client.setting.BooleanSetting var46 = this.settingAutoAirstuck;
      boolean var10000 = var46.method_49$aae029aa0a();
      if (!var30) {
         if (var10000) {
            client.setting.BooleanSetting var47 = this.settingUnstuckIfCombatPearlDidnTLand;
            if (var47.method_49$aae029aa0a() && System.currentTimeMillis() - this.field_47 > 12000L) {
               char var48 = (char)var26;
               long var49 = var24;
               AutoEnderPearl_47QU var51 = this;
               if (!var51.method_45$5eec879a9c(var49, var48)) {
                  boolean var52 = false;
                  long var53 = var9;
                  AirStuck_47Q4 var55 = client.ClientGlobals.field_48.field_48i;
                  var55.method_46$b757cde368(var53, var52);
               }
            }
         }

         client.setting.BooleanSetting var56 = this.settingAutoAirstuck;
         if (var56.method_49$aae029aa0a() && client.ClientGlobals.field_48 != null) {
            long var57 = var17;
            client.setting.ModeSetting var59 = client.ClientGlobals.field_48.field_48i.settingMode;
            if (var59.method_46$5f9dc63072(var57).equals("Intave")) {
               String var60 = "AutoAirstuck doesn't work with Airstuck Mode Intave!";
               long var61 = var7;
               net.C_475e.method_46$d07b98bfef(var61, var60);
               boolean var63 = false;
               long var64 = var9;
               AutoEnderPearl_47QU var66 = this;
               var66.method_46$b757cde368(var64, var63);
            }
         }

         if (this.field_43P) {
            net.minecraft.client.Minecraft var67 = field_43;
            if (!var67.field_42P.field_48M) {
               return;
            }

            this.field_43P = false;
            this.field_43a = false;
            this.field_43v = false;
         }

         label277: {
            client.setting.BooleanSetting var68 = this.settingOnlyIfPlayerIsFallingIntoTheVoid;
            if (var68.method_49$aae029aa0a()) {
               net.minecraft.client.Minecraft var69 = field_43;
               if (var69.field_42P.field_48M) {
                  return;
               }

               net.minecraft.client.Minecraft var70 = field_43;
               net.minecraft.client.multiplayer.WorldClient var156 = var70.field_44Q;
               net.minecraft.client.Minecraft var71 = field_43;
               double var166 = var71.field_42P.field_48Q;
               net.minecraft.client.Minecraft var72 = field_43;
               double var10002 = var72.field_42P.field_48j;
               net.minecraft.client.Minecraft var73 = field_43;
               double var10003 = var73.field_42P.field_42o;
               net.minecraft.client.Minecraft var74 = field_43;
               double var10004 = var74.field_42P.field_48Q;
               net.minecraft.client.Minecraft var75 = field_43;
               double var10005 = Math.min(0.0, var75.field_42P.field_48j - 30.0);
               net.minecraft.client.Minecraft var76 = field_43;
               net.C_47Ij var31 = var156.method_48$3010b789d0(var166, var10002, var10003, var10004, var10005, var76.field_42P.field_42o, true);
               if (var31 != null && var31.field_49 == net.C_47Az.BLOCK) {
                  break label277;
               }

               net.minecraft.client.Minecraft var77 = field_43;
               short var170 = (short)var15;
               short var78 = (short)var16;
               short var79 = var170;
               byte var80 = 30;
               net.minecraft.client.entity.EntityPlayerSP var81 = var77.field_42P;
               int var82 = var14;
               if (net.C_47TT.method_43$6d06c9e8fc(var82, var81, var80, var79, var78)) {
                  break label277;
               }
            }

            long var83 = var19;
            AutoEnderPearl_47QU var85 = this;
            this.field_42 = var85.method_45$95d88932bd(var83);
            if (this.field_42 != -1 && !this.field_43a) {
               if (System.currentTimeMillis() - this.field_46 < 1000L) {
                  return;
               }

               net.minecraft.client.Minecraft var86 = field_43;
               net.C_47rf var152 = var86.field_42P.field_429.method_46$4c10532da1(this.field_42 + 36).method_48$ac4db64966();
               net.minecraft.client.Minecraft var87 = field_43;
               net.minecraft.client.Minecraft var88 = field_43;
               net.minecraft.client.Minecraft var89 = field_43;
               double var32 = var87.field_42P.field_48Q + (var88.field_42P.field_48a - var89.field_42P.field_48Q);
               net.minecraft.client.Minecraft var90 = field_43;
               net.minecraft.client.Minecraft var91 = field_43;
               net.minecraft.client.Minecraft var92 = field_43;
               double var34 = var90.field_42P.field_48j + (var91.field_42P.field_48G - var92.field_42P.field_48j);
               net.minecraft.client.Minecraft var93 = field_43;
               net.minecraft.client.Minecraft var94 = field_43;
               net.minecraft.client.Minecraft var95 = field_43;
               double var36 = var93.field_42P.field_42o + (var94.field_42P.field_48q - var95.field_42P.field_42o);

               for (int var38 = -180; var38 < 180; var38++) {
                  for (int var39 = -90; var39 < 90; var39++) {
                     net.C_47Kr var40 = new net.C_47Kr();
                     net.minecraft.client.Minecraft var96 = field_43;
                     recovery$indy$flow$239(var40, (char)var11, var96.field_42P, var152, var38, var39, var12, var32, var34, var36, -4298337526441699928L, var1);
                     recovery$indy$flow$240(var40, var3, 200, -4298198570900776794L, var1);
                     net.C_47Ij var41 = (net.C_47Ij)recovery$indy$flow$241(var40, -4298442008288594215L, var1);
                     if (var41 != null && var41.field_49 == net.C_47Az.BLOCK && var41.field_40 == net.C_484.UP) {
                        int var42 = var41.method_49$5730377d31().method_40$8abf5c6871();
                        int var43 = var41.method_49$5730377d31().method_43$8abf5c6871();
                        int var44 = var41.method_49$5730377d31().method_47$8abf5c6871();
                        net.minecraft.client.Minecraft var97 = field_43;
                        if (var97.field_44Q.method_49$0bfd666c6c(var42, var43, var44).method_48$e084f7739d().method_43$aae029aa0a()) {
                           net.minecraft.client.Minecraft var98 = field_43;
                           if (var98.field_44Q.method_49$0bfd666c6c(var42, var43, var44 - 1).method_48$e084f7739d().method_43$aae029aa0a()) {
                              net.minecraft.client.Minecraft var99 = field_43;
                              if (var99.field_44Q.method_49$0bfd666c6c(var42, var43, var44 + 1).method_48$e084f7739d().method_43$aae029aa0a()) {
                                 net.minecraft.client.Minecraft var100 = field_43;
                                 if (var100.field_44Q.method_49$0bfd666c6c(var42 - 1, var43, var44).method_48$e084f7739d().method_43$aae029aa0a()) {
                                    net.minecraft.client.Minecraft var101 = field_43;
                                    if (var101.field_44Q.method_49$0bfd666c6c(var42 + 1, var43, var44).method_48$e084f7739d().method_43$aae029aa0a()) {
                                       net.C_478Q var158 = var41.method_49$5730377d31().method_40$5730377d31();
                                       long var102 = var5;
                                       net.C_478Q var104 = var158;
                                       if (!net.C_474i.method_48$2488324e9f(var104, var102)) {
                                          net.C_478Q var159 = var41.method_49$5730377d31().method_46$5730377d31();
                                          long var105 = var5;
                                          net.C_478Q var107 = var159;
                                          if (!net.C_474i.method_48$2488324e9f(var107, var105)) {
                                             net.C_478Q var160 = var41.method_49$5730377d31().method_44$5730377d31();
                                             long var108 = var5;
                                             net.C_478Q var110 = var160;
                                             if (!net.C_474i.method_48$2488324e9f(var110, var108)) {
                                                net.C_478Q var161 = var41.method_49$5730377d31().method_41$5730377d31();
                                                long var111 = var5;
                                                net.C_478Q var113 = var161;
                                                if (!net.C_474i.method_48$2488324e9f(var113, var111)) {
                                                   net.C_478Q var162 = var41.method_49$5730377d31().method_48$5730377d31();
                                                   long var114 = var5;
                                                   net.C_478Q var116 = var162;
                                                   if (!net.C_474i.method_48$2488324e9f(var116, var114)) {
                                                      net.C_47S6 var117 = client.ClientGlobals.field_46;
                                                      float var163 = var117.method_44$4f8050086d().field_44 + var38;
                                                      net.C_47S6 var118 = client.ClientGlobals.field_46;
                                                      float var168 = var118.method_44$4f8050086d().field_41 + var39;
                                                      net.C_47S6 var119 = client.ClientGlobals.field_46;
                                                      net.C_477r var169 = var119.method_44$4f8050086d();
                                                      short var173 = (short)var21;
                                                      short var174 = (short)var22;
                                                      net.C_477r var120 = var169;
                                                      int var121 = var23;
                                                      short var122 = var174;
                                                      short var123 = var173;
                                                      float var124 = var168;
                                                      float var125 = var163;
                                                      net.C_477r var45 = net.C_47gg.method_45$c5daf1e88f(var125, var124, var123, var122, var121, var120);
                                                      char var172 = (char)var27;
                                                      AutoEnderPearl_47QU var126 = this;
                                                      int var127 = var29;
                                                      int var128 = var28;
                                                      char var129 = var172;
                                                      byte var130 = -11;
                                                      net.C_477r var131 = var45;
                                                      net.C_47S6 var132 = client.ClientGlobals.field_46;
                                                      var132.method_45$c163d5afc8(var131, var130, var129, var128, var127, var126);
                                                      this.field_43a = false;
                                                      this.field_46 = System.currentTimeMillis();
                                                      return;
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               this.field_46 = System.currentTimeMillis();
               this.field_43a = false;
            } else if (this.field_43a) {
               net.C_47S6 var133;
               net.C_47S6 var157 = var133 = client.ClientGlobals.field_46;
               net.C_477r var167 = var133.method_44$4f8050086d();
               char var171 = (char)var27;
               AutoEnderPearl_47QU var134 = this;
               int var135 = var29;
               int var136 = var28;
               char var137 = var171;
               byte var138 = -11;
               net.C_477r var139 = var167;
               net.C_47S6 var140 = var157;
               var140.method_45$c163d5afc8(var139, var138, var137, var136, var135, var134);
            } else {
               client.setting.BooleanSetting var141 = this.settingOnlyIfPlayerIsFallingIntoTheVoid;
               if (var141.method_49$aae029aa0a()) {
                  client.setting.BooleanSetting var142 = this.settingAutoDisable;
                  if (var142.method_49$aae029aa0a()) {
                     return;
                  }
               }

               boolean var143 = false;
               long var144 = var9;
               AutoEnderPearl_47QU var146 = this;
               var146.method_46$b757cde368(var144, var143);
               client.setting.BooleanSetting var147 = this.settingAutoAirstuck;
               if (var147.method_49$aae029aa0a()) {
                  boolean var153 = false;
                  long var154 = var9;
                  AirStuck_47Q4 var155 = client.ClientGlobals.field_48.field_48i;
                  var155.method_46$b757cde368(var154, var153);
               }
            }

            return;
         }

         this.field_42 = -1;
      } else {
         if (var10000) {
            boolean var148 = false;
            long var149 = var9;
            AirStuck_47Q4 var151 = client.ClientGlobals.field_48.field_48i;
            var151.method_46$b757cde368(var149, var148);
         }
      }
   }













    public AutoEnderPearl_47QU(int a0,short a1,char a2) {
        super((java.lang.String) ("AutoEnderPearl"),(java.lang.String) ("AutomatischeEnderperle"),(long) (((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.player.AutoEnderPearl_47QU.a) ^ 126297553347351L)),(java.awt.Color) (new java.awt.Color((int) (155),(int) (66),(int) (245))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = (((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.player.AutoEnderPearl_47QU.a);
        long constructorKey2 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.player.AutoEnderPearl_47QU.a) ^ 11170936285745L);
        long constructorKey3 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.player.AutoEnderPearl_47QU.a) ^ 4369918164748L);
        client.setting.BooleanSetting initialized4 = new client.setting.BooleanSetting(this, constructorKey3, "Auto airstuck", true);
        recovery$indy$flow$352(this, initialized4);
        client.setting.BooleanSetting initialized5 = new client.setting.BooleanSetting(this, constructorKey3, "Unstuck if combatPearl didn't land", true);
        java.lang.Object initialValue6 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoEnderPearl_47QU) (((java.lang.Object)(this)))).settingAutoAirstuck));
        java.lang.Object initialValue7 = recovery$indy$flow$356(initialValue6);
        java.lang.Object initialValue8 = recovery$indy$flow$357(initialValue6);
        java.lang.Object initialValue9 = initialValue8;
        long initialValue10 = constructorKey2;
        client.setting.BooleanSetting initialValue11 = initialized5;
        java.lang.Object initialValue12 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue11))))));
        java.lang.Object initialValue13 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue9))))));
        java.lang.Object initialValue14 = recovery$indy$flow$360(initialValue12, initialValue10, initialValue13);
        java.lang.Object initialValue15 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue14))))));
        recovery$indy$flow$362(this, initialValue15);
        client.setting.BooleanSetting initialized16 = new client.setting.BooleanSetting(this, constructorKey3, "Only if player is falling into the void", false);
        recovery$indy$flow$365(this, initialized16);
        client.setting.BooleanSetting initialized17 = new client.setting.BooleanSetting(this, constructorKey3, "Auto disable", true);
        java.lang.Object initialValue18 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoEnderPearl_47QU) (((java.lang.Object)(this)))).settingOnlyIfPlayerIsFallingIntoTheVoid));
        java.lang.Object initialValue19 = recovery$indy$flow$369(initialValue18);
        java.lang.Object initialValue20 = recovery$indy$flow$370(initialValue18);
        java.lang.Object initialValue21 = initialValue20;
        long initialValue22 = constructorKey2;
        client.setting.BooleanSetting initialValue23 = initialized17;
        java.lang.Object initialValue24 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue25 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue21))))));
        java.lang.Object initialValue26 = recovery$indy$flow$373(initialValue24, initialValue22, initialValue25);
        java.lang.Object initialValue27 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue26))))));
        recovery$indy$flow$375(this, initialValue27);
        recovery$indy$flow$376(this, -1);
        recovery$indy$flow$377(this, false);
        recovery$indy$flow$378(this, false);
        recovery$indy$flow$379(this, false);
        recovery$indy$flow$380(this, 0L);
        recovery$indy$flow$381(this, 0L);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$239(java.lang.Object a0,char a1,java.lang.Object a2,java.lang.Object a3,float a4,float a5,long a6,double a7,double a8,double a9,long a10,long a11);
    private static native void recovery$indy$flow$240(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$241(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$352(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$356(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$357(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$360(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$362(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$365(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$369(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$370(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$373(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$375(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$376(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoEnderPearl_47QU) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$377(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.AutoEnderPearl_47QU) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$378(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.AutoEnderPearl_47QU) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$379(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.AutoEnderPearl_47QU) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$380(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.player.AutoEnderPearl_47QU) (a0)).field_46 = a1;
        return;
    }
    private static void recovery$indy$flow$381(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.player.AutoEnderPearl_47QU) (a0)).field_47 = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native boolean recovery$indy$4(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(long var0, long var2);
   private static native C_473U recovery$indy$8(Object var0, long var1, long var3);
   private static native boolean recovery$indy$9(Object var0, long var1, long var3);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3);
   private static native boolean recovery$indy$11(Object var0, long var1, long var3);
   private static native void recovery$indy$12(Object var0, long var1, boolean var3, long var4, long var6);
   private static native boolean recovery$indy$13(Object var0, long var1, long var3);
   private static native void recovery$indy$14(Object var0, long var1, boolean var3, long var4, long var6);
   private static native boolean recovery$indy$15(long var0, long var2);
   private static native void recovery$indy$16(int var0, Object var1, int var2, char var3, char var4, int var5, long var6, long var8);
   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$18(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$19(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$20(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$21(long var0, long var2);
   private static native boolean recovery$indy$22(Object var0, long var1, long var3);
   private static native void recovery$indy$23(Object var0, long var1, boolean var3, long var4, long var6);
   private static native MethodHandle recovery$constant$29();
}
