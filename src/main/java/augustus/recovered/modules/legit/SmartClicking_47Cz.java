package augustus.recovered.modules.legit;
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
import net.C_45n;
import net.C_475c;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47G5;
import net.C_47Ij;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import client.module.Category;
import net.C_48T;
import net.C_49S;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class SmartClicking_47Cz extends client.module.Module implements net.C_47UH,net.C_48T {
    private final client.setting.RangeSetting settingSmartHurttimeStart = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingSmartHurttimeEnd = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMaxDuration = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingChance = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSmartHurttime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingReduceClickingInAir = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFakeAttacks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRatioBypass = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRatioStrength = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_443; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_44c; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_44P = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_444; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_49S field_44b; // Runtime access flags and ConstantValue are restored from the original class.
    private static int[] field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   public static int[] method_42$d4d28024c9() {
      return field_44;
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

    public void method_41$fae8de1664(final net.C_475c c_475c) {
        final long n = SmartClicking_47Cz.a ^ 0xD5C35C45B1FL;
        final long n2 = n ^ 0x7B3734FF54BBL;
        final long n3 = n ^ 0x504D08EC3C10L;
        final long n4 = n ^ 0xFA96A083A7EL;
        final long n5 = n ^ 0x677FB7953F0L;
        final boolean method_45i$aae029aa0a = AimBot_47O_.method_45i$aae029aa0a();
        final int method_48$aae029aa0a = c_475c.method_48$aae029aa0a() ? 1 : 0;
        if (!method_45i$aae029aa0a) {
            final int n6 = method_48$aae029aa0a + (c_475c.method_45$aae029aa0a() ? 1 : 0);
            c_475c.method_45$aae029aa0a();
            ++this.field_42;
            if ((this.method_43N$0dd78e0064(n5) ? 1 : 0) > 0 && SmartClicking_47Cz.field_43.field_42Y.field_49 == net.C_47Az.ENTITY) {
                this.field_47 = System.currentTimeMillis();
                this.field_438 = SmartClicking_47Cz.field_43.field_42Y.field_47.field_48I;
                this.field_43v = false;
            }
            return;
        }
        if (method_48$aae029aa0a != 0) {
            return;
        }
        final int n7 = c_475c.method_48$8abf5c6871() + (c_475c.method_45$aae029aa0a() ? 0 : SmartClicking_47Cz.field_43.field_44r.field_44l.method_49$8abf5c6871());
        boolean b = false;
        if (n7 <= 0 && !this.field_43P && this.settingMaxDuration.method_44$8abf5c6871() < 10 && this.field_42 >= this.settingMaxDuration.method_44$8abf5c6871() && (this.field_443 || this.field_44c)) {
            c_475c.method_44$d00df7729d(1);
            b = true;
            this.settingMaxDuration.method_43$fedcb3e4d3();
        }
        final int n8 = c_475c.method_48$8abf5c6871() + (c_475c.method_45$aae029aa0a() ? 0 : SmartClicking_47Cz.field_43.field_44r.field_44l.method_49$8abf5c6871());
        if (n8 > 0) {
            this.field_42 = 0;
        }
        else {
            ++this.field_42;
        }
        boolean b2 = false;
        if (this.method_43N$0dd78e0064(n5) && !b) {
            if (SmartClicking_47Cz.field_43.field_42Y.field_49 == net.C_47Az.ENTITY && this.settingFakeAttacks.method_49$aae029aa0a() && c_475c.method_48$8abf5c6871() > 0) {
                SmartClicking_47Cz.field_43.field_42Y.field_49 = net.C_47Az.MISS;
                b2 = true;
            }
            else {
                c_475c.method_48$da8c82d5d4();
            }
            this.field_44b.method_42$b7da0951ad(n2, 1.0 - this.settingRatioStrength.method_43$a8c520d5d1(true, n4));
        }
        else {
            this.field_44b.method_42$b7da0951ad(n2, c_475c.method_48$8abf5c6871());
            if (this.settingRatioBypass.method_49$aae029aa0a() && !this.settingFakeAttacks.method_49$aae029aa0a() && Math.random() > this.field_44b.method_47$474dfaa627(n3)) {
                c_475c.method_48$da8c82d5d4();
            }
        }
        if (this.field_43a) {
            this.field_43y += n8;
        }
        if (!b2 && c_475c.method_48$8abf5c6871() > 0 && SmartClicking_47Cz.field_43.field_42Y != null && SmartClicking_47Cz.field_43.field_42Y.field_49 == net.C_47Az.ENTITY) {
            this.field_47 = System.currentTimeMillis();
            this.field_438 = SmartClicking_47Cz.field_43.field_42Y.field_47.field_48I;
            if (this.field_43v) {
                this.field_444 = System.currentTimeMillis();
                this.field_43v = false;
            }
        }
    }







   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 33796263608952L;
      long var10000 = 8784509285332079550L;
      boolean var3 = AimBot_47O_.method_45g$aae029aa0a();
      long var10001 = 8783321317948173274L;
      BooleanSetting var4 = this.settingFakeAttacks;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 72216519912905L;
      long var10000 = -3001218461446996977L;
      boolean var3 = AimBot_47O_.method_45g$aae029aa0a();
      long var10001 = -3002213059001908117L;
      BooleanSetting var4 = this.settingRatioBypass;
      boolean var6 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = -2999809107660035295L;
         BooleanSetting var5 = this.settingRatioBypass;
         var6 = var5.method_44$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   public static void method_47$2022b4f670(int[] var0) {
      field_44 = var0;
   }



   public void method_40G$e45a9973e5(long var1) {
        int var52;
        int var73;
        augustus.recovered.modules.legit.SmartClicking_47Cz var36;
        boolean var40;
        augustus.recovered.modules.legit.SmartClicking_47Cz var41;
        net.C_47Ij var43;
        augustus.recovered.modules.legit.SmartClicking_47Cz var44;
        boolean var48;
        augustus.recovered.modules.legit.SmartClicking_47Cz var49;
        augustus.recovered.modules.legit.SmartClicking_47Cz var50;
        augustus.recovered.modules.legit.SmartClicking_47Cz var51;
        int var55;
        augustus.recovered.modules.legit.SmartClicking_47Cz var56;
        augustus.recovered.modules.legit.SmartClicking_47Cz var61;
        int var63;
        augustus.recovered.modules.legit.SmartClicking_47Cz var64;
        net.C_47Ij var66;
        augustus.recovered.modules.legit.SmartClicking_47Cz var67;
        int var69;
        augustus.recovered.modules.legit.SmartClicking_47Cz var70;
        augustus.recovered.modules.legit.SmartClicking_47Cz var71;
        augustus.recovered.modules.legit.SmartClicking_47Cz var72;
        int var74;
        augustus.recovered.modules.legit.SmartClicking_47Cz var75;
        int var83;
        int var85;
        int var86;
        int var87;
        int var88;
        int var89;
      long var3 = var1 ^ 5058280932348L;
      long var5 = var1 ^ 104729863225817L;
      long var7 = var1 ^ 138255374926875L;
      long var9 = var1 ^ 106978727381589L;
      long var11 = var1 ^ 106766667802891L;
      long var13 = var1 ^ 52607460180022L;
      byte var15 = ((byte) (recovery$indy$flow$122(-3627442278936057858L, var1) ? 1 : 0));
      if (var15 == 0) {
         net.C_47Ij var22;
         EntityLivingBase var23;
         EntityLivingBase var57;
         int var81;
         label1558: {
            if (this.field_45 != null) {
               SmartClicking_47Cz var58 = this;
               if (var1 >= 0L) {
                  if (var15 == 0) {
                     if (recovery$indy$flow$125(this.field_44P, 1500L, var9, -3627100898345186961L, var1)) {
                        this.field_45 = null;
                     }

                     this.field_44c = this.field_443;
                     this.field_443 = false;
                     var58 = this;
                  }

                  var58.field_43P = false;
                  var22 = (net.C_47Ij)recovery$indy$flow$132(field_43, -3625451054734051389L, var1);
                  var23 = (EntityLivingBase)recovery$indy$flow$137(
                     var22 != null && var22.field_47 instanceof EntityLivingBase ? (EntityLivingBase)var22.field_47 : null, var11, -3626810719883887309L, var1
                  );
                  var57 = var23;
                  var81 = var15;
                  break label1558;
               }

               this.field_43P = (boolean)((((int) (var15)) & 1) != 0);
               var22 = (net.C_47Ij)recovery$indy$flow$132(field_43, -3625451054734051389L, var1);
               var23 = (EntityLivingBase)recovery$indy$flow$137(
                  var22 != null && var22.field_47 instanceof EntityLivingBase ? (EntityLivingBase)var22.field_47 : null, var11, -3626810719883887309L, var1
               );
               var57 = var23;
               var81 = var15;
            } else {
               this.field_44c = this.field_443;
               this.field_443 = false;
               this.field_43P = false;
               var22 = (net.C_47Ij)recovery$indy$flow$132(field_43, -3625451054734051389L, var1);
               var23 = (EntityLivingBase)recovery$indy$flow$137(
                  var22 != null && var22.field_47 instanceof EntityLivingBase ? (EntityLivingBase)var22.field_47 : null, var11, -3626810719883887309L, var1
               );
               var57 = var23;
               var81 = var15;
               if (var1 >= 0L) {
                  break label1558;
               }
            }

            label1522: {
               SmartClicking_47Cz var59;
               if (var81 == 0) {
                  if (var57 == null) {
                     break label1522;
                  }

                  var59 = this;
                  var81 = var15;
               } else {
                  if (var57.field_432 != 10) {
                     break label1522;
                  }

                  var59 = this;
                  double var90;
                  var81 = (var90 = Math.random() - recovery$indy$flow$146(this.settingChance, var5, -3628595761782142831L, var1) / 100.0) == 0.0
                     ? 0
                     : (var90 < 0.0 ? -1 : 1);
               }

               var59.field_43u = var81 <= 0;
            }

            label1523: {
               net.C_47Ij var60 = var22;
               if (var15 == 0) {
                  if (var22.field_49 != net.C_47Az.ENTITY) {
                     var61 = this;
                     var83 = var15;
                     break label1523;
                  }

                  var60 = var22;
               }

               if (var60.field_47 instanceof EntityLivingBase) {
                  SmartClicking_47Cz var62 = this;
                  if (var15 == 0) {
                     if (!this.field_43u) {
                        return;
                     }

                     var62 = this;
                  }

                  if (var62.field_45 == null) {
                     return;
                  }

                  byte var29;
                  label1315: {
                     label1314: {
                        int var18 = this.field_45.field_432 > recovery$indy$flow$167(this.settingSmartHurttimeStart, -3626570562057668752L, var1)
                              && this.field_45.field_432 <= recovery$indy$flow$171(this.settingSmartHurttimeEnd, -3626570562057668752L, var1)
                           ? 1
                           : 0;
                        var29 = ((byte) (recovery$indy$flow$176(
                           var7,
                           this.field_45,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$174(field_43, -3625808152041150471L, var1)).field_48h,
                           -3626607776128165909L,
                           var1
                        ) ? 1 : 0));
                        if (recovery$indy$flow$178(this.settingSmartHurttime, -3628558917984575590L, var1)) {
                           long var20 = System.currentTimeMillis() - this.field_47;
                           byte var84;
                           if (var20 > 600L) {
                              var63 = this.field_438;
                              var84 = var15;
                           } else {
                              var63 = var18;
                              var84 = var15;
                           }

                           if (var84 != 0) {
                              break label1314;
                           }

                           if (var63 == 0 && this.field_45.field_432 > 0 && var29 != 0 && !this.field_43v) {
                              long var91;
                              var63 = (var91 = System.currentTimeMillis() - this.field_444 - 500L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                              var85 = var15;
                              break label1315;
                           }
                        }

                        var63 = var18;
                     }

                     var85 = var15;
                  }

                  label1302: {
                     if (var85 == 0) {
                        if (var63 != 0) {
                           var63 = var29;
                           var86 = var15;
                           break label1302;
                        }

                        var63 = ((recovery$indy$flow$191(client.ClientGlobals.field_48.field_48e, var3, -3626080436329547326L, var1)) ? 1 : 0);
                     }

                     var86 = var15;
                  }

                  label1296: {
                     label1295: {
                        if (var86 == 0) {
                           if (var63 != 0) {
                              var64 = this;
                              var87 = var15;
                              break label1296;
                           }
                        } else if (var63 == 0) {
                           this.field_443 = false;
                           this.field_43a = true;
                           break label1295;
                        }

                        this.field_43a = false;
                     }

                     var64 = this;
                     var87 = 0;
                  }

                  var64.field_43a = (boolean)((((int) (var87)) & 1) != 0);
                  return;
               }

               var61 = this;
               var83 = 0;
            }

            var61.field_43P = (boolean)((((int) (var83)) & 1) != 0);
            return;
         }

         if (var81 == 0) {
            if (var57 != null) {
               this.field_45 = var23;
               recovery$indy$flow$140(this.field_44P, -3625725997519360711L, var1);
            }

            var57 = this.field_45;
         }

         label1526: {
            label1280: {
               if (var15 == 0) {
                  if (var57 != null) {
                     SmartClicking_47Cz var65 = this;
                     if (var1 > 0L) {
                        label1528: {
                           if (var15 == 0) {
                              if (this.field_45.field_432 != 10) {
                                 break label1528;
                              }

                              var65 = this;
                           }

                           var65.field_43u = Math.random() <= recovery$indy$flow$146(this.settingChance, var5, -3628595761782142831L, var1) / 100.0;
                        }

                        var66 = var22;
                        var88 = var15;
                        break label1526;
                     }

                     this.field_43u = var15 <= 0;
                     var66 = var22;
                     var88 = var15;
                     break label1280;
                  }
               } else if (var57.field_432 == 10) {
                  this.field_43u = Math.random() <= recovery$indy$flow$146(this.settingChance, var5, -3628595761782142831L, var1) / 100.0;
               }

               var66 = var22;
               var88 = var15;
               if (var1 > 0L) {
                  break label1526;
               }
            }

            label1270: {
               label1269: {
                  if (var88 == 0) {
                     if (var66.field_49 != net.C_47Az.ENTITY) {
                        var67 = this;
                        if (var15 != 0) {
                           break label1270;
                        }

                        if (!recovery$indy$flow$151(this.settingReduceClickingInAir, -3628558917984575590L, var1)) {
                           break label1269;
                        }
                     }

                     var66 = var22;
                  }

                  if (var66.field_47 instanceof EntityLivingBase) {
                     SmartClicking_47Cz var68 = this;
                     if (var15 == 0) {
                        if (!this.field_43u) {
                           return;
                        }

                        var68 = this;
                     }

                     if (var68.field_45 == null) {
                        return;
                     }

                     byte var30;
                     label1250: {
                        int var25 = this.field_45.field_432 > recovery$indy$flow$167(this.settingSmartHurttimeStart, -3626570562057668752L, var1)
                              && this.field_45.field_432 <= recovery$indy$flow$171(this.settingSmartHurttimeEnd, -3626570562057668752L, var1)
                           ? 1
                           : 0;
                        var30 = ((byte) (recovery$indy$flow$176(
                           var7,
                           this.field_45,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$174(field_43, -3625808152041150471L, var1)).field_48h,
                           -3626607776128165909L,
                           var1
                        ) ? 1 : 0));
                        if (recovery$indy$flow$178(this.settingSmartHurttime, -3628558917984575590L, var1)) {
                           label1247: {
                              long var32 = System.currentTimeMillis() - this.field_47;
                              if (var32 > 600L) {
                                 var69 = this.field_438;
                                 if (var15 != 0) {
                                    break label1247;
                                 }

                                 if (this.field_438 > 4) {
                                    this.field_43v = true;
                                 }
                              }

                              var69 = var25;
                           }

                           if (var15 != 0) {
                              break label1250;
                           }

                           if (var69 == 0 && this.field_45.field_432 > 0 && var30 != 0 && !this.field_43v) {
                              long var92;
                              var69 = (var92 = System.currentTimeMillis() - this.field_444 - 500L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                              if (var15 != 0) {
                                 break label1250;
                              }

                              if (var69 < 0) {
                                 var25 = 1;
                              }
                           }
                        }

                        var69 = var25;
                     }

                     label1232:
                     if (var15 == 0) {
                        if (var69 != 0) {
                           var69 = var30;
                           if (var15 != 0) {
                              break label1232;
                           }

                           if (var30 != 0) {
                              this.field_443 = true;
                           }
                        }

                        var69 = ((recovery$indy$flow$191(client.ClientGlobals.field_48.field_48e, var3, -3626080436329547326L, var1)) ? 1 : 0);
                     }

                     label1225: {
                        label1531: {
                           if (var15 == 0) {
                              if (var69 == 0) {
                                 break label1531;
                              }

                              var69 = ((recovery$indy$flow$196(client.ClientGlobals.field_48.field_48e.settingMode, net.C_47G5.class, var13, -3626753303266599885L, var1)) ? 1 : 0);
                           }

                           if (var15 == 0) {
                              if (var69 == 0) {
                                 break label1531;
                              }

                              var69 = ((recovery$indy$flow$197(-3626171866978988913L, var1)) ? 1 : 0);
                           }

                           label1213: {
                              if (var15 == 0) {
                                 if (var69 != 0) {
                                    var70 = this;
                                    var89 = var15;
                                    break label1225;
                                 }
                              } else if (var69 == 0) {
                                 this.field_443 = false;
                                 this.field_43a = true;
                                 break label1213;
                              }

                              this.field_43a = false;
                           }

                           var70 = this;
                           var89 = 0;
                           break label1225;
                        }

                        var70 = this;
                        var89 = 0;
                     }

                     var70.field_43a = (boolean)((((int) (var89)) & 1) != 0);
                     return;
                  }
               }

               var67 = this;
            }

            var67.field_43P = false;
            return;
         }

         label1200: {
            label1532: {
               if (var88 == 0) {
                  if (var66 == null) {
                     break label1532;
                  }

                  var66 = var22;
               }

               if (var15 == 0) {
                  if (var66.field_49 != net.C_47Az.ENTITY) {
                     var71 = this;
                     if (var15 != 0) {
                        break label1200;
                     }

                     if (!recovery$indy$flow$151(this.settingReduceClickingInAir, -3628558917984575590L, var1)) {
                        break label1532;
                     }
                  }

                  var66 = var22;
               }

               if (var66.field_47 instanceof EntityLivingBase) {
                  label1534: {
                     label1535: {
                        var72 = this;
                        if (var15 == 0) {
                           if (this.field_45 != null) {
                              var73 = this.field_45.field_432;
                              if (var15 != 0) {
                                 break label1535;
                              }

                              if (this.field_45.field_432 == 10) {
                                 recovery$indy$flow$159(this.settingSmartHurttimeStart, -3627402558733884931L, var1);
                                 recovery$indy$flow$161(this.settingSmartHurttimeEnd, -3627402558733884931L, var1);
                              }
                           }

                           var72 = this;
                        }

                        if (var15 != 0) {
                           break label1534;
                        }

                        var73 = ((var72.field_43u) ? 1 : 0);
                     }

                     if (var73 == 0) {
                        return;
                     }

                     var72 = this;
                  }

                  if (var72.field_45 == null) {
                     return;
                  }

                  byte var31;
                  label1165: {
                     int var26 = this.field_45.field_432 > recovery$indy$flow$167(this.settingSmartHurttimeStart, -3626570562057668752L, var1)
                           && this.field_45.field_432 <= recovery$indy$flow$171(this.settingSmartHurttimeEnd, -3626570562057668752L, var1)
                        ? 1
                        : 0;
                     var31 = ((byte) (recovery$indy$flow$176(
                        var7,
                        this.field_45,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$174(field_43, -3625808152041150471L, var1)).field_48h,
                        -3626607776128165909L,
                        var1
                     ) ? 1 : 0));
                     if (recovery$indy$flow$178(this.settingSmartHurttime, -3628558917984575590L, var1)) {
                        label1162: {
                           long var33 = System.currentTimeMillis() - this.field_47;
                           if (var33 > 600L) {
                              var74 = this.field_438;
                              if (var15 != 0) {
                                 break label1162;
                              }

                              if (this.field_438 > 4) {
                                 this.field_43v = true;
                              }
                           }

                           var74 = var26;
                        }

                        if (var15 != 0) {
                           break label1165;
                        }

                        if (var74 == 0 && this.field_45.field_432 > 0 && var31 != 0 && !this.field_43v) {
                           long var93;
                           var74 = (var93 = System.currentTimeMillis() - this.field_444 - 500L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                           if (var15 != 0) {
                              break label1165;
                           }

                           if (var74 < 0) {
                              var26 = 1;
                           }
                        }
                     }

                     var74 = var26;
                  }

                  label1147:
                  if (var15 == 0) {
                     if (var74 != 0) {
                        var74 = var31;
                        if (var15 != 0) {
                           break label1147;
                        }

                        if (var31 != 0) {
                           this.field_443 = true;
                        }
                     }

                     var74 = ((recovery$indy$flow$191(client.ClientGlobals.field_48.field_48e, var3, -3626080436329547326L, var1)) ? 1 : 0);
                  }

                  label1576: {
                     if (var15 == 0) {
                        if (var74 == 0) {
                           break label1576;
                        }

                        var74 = ((recovery$indy$flow$196(client.ClientGlobals.field_48.field_48e.settingMode, net.C_47G5.class, var13, -3626753303266599885L, var1)) ? 1 : 0);
                     }

                     if (var15 == 0) {
                        if (var74 == 0) {
                           break label1576;
                        }

                        var74 = ((recovery$indy$flow$197(-3626171866978988913L, var1)) ? 1 : 0);
                     }

                     label1128: {
                        label1127: {
                           if (var15 == 0) {
                              if (var74 == 0) {
                                 break label1127;
                              }

                              var75 = this;
                              if (var15 != 0) {
                                 break label1128;
                              }

                              var74 = this.field_43y;
                           }

                           if (var74 == 0) {
                              this.field_443 = false;
                              this.field_43a = true;
                              return;
                           }
                        }

                        this.field_43a = false;
                        var75 = this;
                     }

                     var75.field_43y = 0;
                     return;
                  }

                  this.field_43a = false;
                  return;
               }
            }

            var71 = this;
         }

         var71.field_43P = false;
      } else {
         this.field_43P = false;
         net.C_47Ij var16 = (net.C_47Ij)recovery$indy$flow$132(field_43, -3625451054734051389L, var1);
         EntityLivingBase var17 = (EntityLivingBase)recovery$indy$flow$137((EntityLivingBase)var16.field_47, var11, -3626810719883887309L, var1);
         EntityLivingBase var10000 = var17;
         if (var1 >= 0L) {
            if (var15 == 0) {
               if (var17 != null) {
                  this.field_45 = var17;
                  recovery$indy$flow$140(this.field_44P, -3625725997519360711L, var1);
               }

               var10000 = this.field_45;
            }

            byte var79;
            label1540: {
               label1476: {
                  if (var15 == 0) {
                     if (var10000 != null) {
                        SmartClicking_47Cz var42 = this;
                        if (var1 > 0L) {
                           label1425: {
                              if (var15 == 0) {
                                 if (this.field_45.field_432 != 10) {
                                    break label1425;
                                 }

                                 var42 = this;
                              }

                              double var94;
                              var42.field_43u = (boolean)((((int) (((
                                       var94 = Math.random() - recovery$indy$flow$146(this.settingChance, var5, -3628595761782142831L, var1) / 100.0
                                    )
                                    == 0.0
                                 ? 0
                                 : (var94 < 0.0 ? -1 : 1)))) & 1) != 0);
                           }

                           var43 = var16;
                           var79 = var15;
                           break label1540;
                        }

                        this.field_43u = (boolean)((((int) (var15)) & 1) != 0);
                        var43 = var16;
                        var79 = var15;
                        break label1476;
                     }
                  } else if (var10000.field_432 == 10) {
                     double var95;
                     this.field_43u = (boolean)((((int) (((var95 = Math.random() - recovery$indy$flow$146(this.settingChance, var5, -3628595761782142831L, var1) / 100.0)
                           == 0.0
                        ? 0
                        : (var95 < 0.0 ? -1 : 1)))) & 1) != 0);
                  }

                  var43 = var16;
                  var79 = var15;
                  if (var1 > 0L) {
                     break label1540;
                  }
               }

               label1466: {
                  label1465: {
                     if (var79 == 0) {
                        if (var43.field_49 != net.C_47Az.ENTITY) {
                           var44 = this;
                           if (var15 != 0) {
                              break label1466;
                           }

                           if (!recovery$indy$flow$151(this.settingReduceClickingInAir, -3628558917984575590L, var1)) {
                              break label1465;
                           }
                        }

                        var43 = var16;
                     }

                     if (var43.field_47 instanceof EntityLivingBase) {
                        SmartClicking_47Cz var45 = this;
                        if (var15 == 0) {
                           if (!this.field_43u) {
                              return;
                           }

                           var45 = this;
                        }

                        if (var45.field_45.field_432 <= recovery$indy$flow$167(this.settingSmartHurttimeStart, -3626570562057668752L, var1)) {
                           boolean var46 = true;
                        } else {
                           boolean var47 = false;
                        }

                        boolean var27 = recovery$indy$flow$176(
                           var7,
                           this.field_45,
                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$174(field_43, -3625808152041150471L, var1)).field_48h,
                           -3626607776128165909L,
                           var1
                        );
                        var48 = recovery$indy$flow$178(this.settingSmartHurttime, -3628558917984575590L, var1);
                        label1451:
                        if (var15 == 0) {
                           if (var48) {
                              var48 = var27;
                              if (var15 != 0) {
                                 break label1451;
                              }

                              if (var27) {
                                 this.field_443 = true;
                              }
                           }

                           var48 = recovery$indy$flow$191(client.ClientGlobals.field_48.field_48e, var3, -3626080436329547326L, var1);
                        }

                        label1444: {
                           label1542: {
                              if (var15 == 0) {
                                 if (!var48) {
                                    break label1542;
                                 }

                                 var48 = recovery$indy$flow$196(client.ClientGlobals.field_48.field_48e.settingMode, net.C_47G5.class, var13, -3626753303266599885L, var1);
                              }

                              if (var15 == 0) {
                                 if (!var48) {
                                    break label1542;
                                 }

                                 var48 = recovery$indy$flow$197(-3626171866978988913L, var1);
                              }

                              label1432: {
                                 if (var15 == 0) {
                                    if (var48) {
                                       var49 = this;
                                       var79 = var15;
                                       break label1444;
                                    }
                                 } else if (!var48) {
                                    this.field_443 = false;
                                    this.field_43a = true;
                                    break label1432;
                                 }

                                 this.field_43a = false;
                              }

                              var49 = this;
                              var79 = ((byte) (0));
                              break label1444;
                           }

                           var49 = this;
                           var79 = ((byte) (0));
                        }

                        var49.field_43a = (boolean)((((int) (var79)) & 1) != 0);
                        return;
                     }
                  }

                  var44 = this;
               }

               var44.field_43P = false;
               return;
            }

            label1419: {
               label1543: {
                  if (var79 == 0) {
                     if (var43 == null) {
                        break label1543;
                     }

                     var43 = var16;
                  }

                  if (var15 == 0) {
                     if (var43.field_49 != net.C_47Az.ENTITY) {
                        var50 = this;
                        if (var15 != 0) {
                           break label1419;
                        }

                        if (!recovery$indy$flow$151(this.settingReduceClickingInAir, -3628558917984575590L, var1)) {
                           break label1543;
                        }
                     }

                     var43 = var16;
                  }

                  if (var43.field_47 instanceof EntityLivingBase) {
                     label1545: {
                        label1546: {
                           var51 = this;
                           if (var15 == 0) {
                              if (this.field_45 != null) {
                                 var52 = this.field_45.field_432;
                                 if (var15 != 0) {
                                    break label1546;
                                 }

                                 if (this.field_45.field_432 == 10) {
                                    recovery$indy$flow$159(this.settingSmartHurttimeStart, -3627402558733884931L, var1);
                                    recovery$indy$flow$161(this.settingSmartHurttimeEnd, -3627402558733884931L, var1);
                                 }
                              }

                              var51 = this;
                           }

                           if (var15 != 0) {
                              break label1545;
                           }

                           var52 = ((var51.field_43u) ? 1 : 0);
                        }

                        if (var52 == 0) {
                           return;
                        }

                        var51 = this;
                     }

                     if (var51.field_45.field_432 <= recovery$indy$flow$167(this.settingSmartHurttimeStart, -3626570562057668752L, var1)) {
                        boolean var53 = true;
                     } else {
                        boolean var54 = false;
                     }

                     byte var28 = ((byte) (recovery$indy$flow$176(
                        var7,
                        this.field_45,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$174(field_43, -3625808152041150471L, var1)).field_48h,
                        -3626607776128165909L,
                        var1
                     ) ? 1 : 0));
                     var55 = ((recovery$indy$flow$178(this.settingSmartHurttime, -3628558917984575590L, var1)) ? 1 : 0);
                     label1389:
                     if (var15 == 0) {
                        if (var55 != 0) {
                           var55 = var28;
                           if (var15 != 0) {
                              break label1389;
                           }

                           if (var28 != 0) {
                              this.field_443 = true;
                           }
                        }

                        var55 = ((recovery$indy$flow$191(client.ClientGlobals.field_48.field_48e, var3, -3626080436329547326L, var1)) ? 1 : 0);
                     }

                     label1547: {
                        if (var15 == 0) {
                           if (var55 == 0) {
                              break label1547;
                           }

                           var55 = ((recovery$indy$flow$196(client.ClientGlobals.field_48.field_48e.settingMode, net.C_47G5.class, var13, -3626753303266599885L, var1)) ? 1 : 0);
                        }

                        if (var15 == 0) {
                           if (var55 == 0) {
                              break label1547;
                           }

                           var55 = ((recovery$indy$flow$197(-3626171866978988913L, var1)) ? 1 : 0);
                        }

                        label1371: {
                           label1370: {
                              if (var15 == 0) {
                                 if (var55 == 0) {
                                    break label1370;
                                 }

                                 var56 = this;
                                 if (var15 != 0) {
                                    break label1371;
                                 }

                                 var55 = this.field_43y;
                              }

                              if (var55 == 0) {
                                 this.field_443 = false;
                                 this.field_43a = true;
                              }
                           }

                           this.field_43a = false;
                           var56 = this;
                        }

                        var56.field_43y = 0;
                     }

                     this.field_43a = false;
                     return;
                  }
               }

               var50 = this;
            }

            var50.field_43P = false;
         } else {
            label1513: {
               SmartClicking_47Cz var34;
               int var10001;
               if (var15 == 0) {
                  if (var17 == null) {
                     break label1513;
                  }

                  var34 = this;
                  var10001 = var15;
               } else {
                  if (var17.field_432 != 10) {
                     break label1513;
                  }

                  var34 = this;
                  double var96;
                  var10001 = (var96 = Math.random() - recovery$indy$flow$146(this.settingChance, var5, -3628595761782142831L, var1) / 100.0) == 0.0
                     ? 0
                     : (var96 < 0.0 ? -1 : 1);
               }

               var34.field_43u = (boolean)((((int) (var10001)) & 1) != 0);
            }

            byte var76;
            label1549: {
               net.C_47Ij var35 = var16;
               if (var15 == 0) {
                  if (var16.field_49 != net.C_47Az.ENTITY) {
                     var36 = this;
                     var76 = var15;
                     break label1549;
                  }

                  var35 = var16;
               }

               if (var35.field_47 instanceof EntityLivingBase) {
                  SmartClicking_47Cz var37 = this;
                  if (var15 == 0) {
                     if (!this.field_43u) {
                        return;
                     }

                     var37 = this;
                  }

                  if (var37.field_45.field_432 <= recovery$indy$flow$167(this.settingSmartHurttimeStart, -3626570562057668752L, var1)) {
                     boolean var38 = true;
                  } else {
                     boolean var39 = false;
                  }

                  label1494: {
                     boolean var19 = recovery$indy$flow$176(
                        var7,
                        this.field_45,
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$174(field_43, -3625808152041150471L, var1)).field_48h,
                        -3626607776128165909L,
                        var1
                     );
                     var40 = recovery$indy$flow$178(this.settingSmartHurttime, -3628558917984575590L, var1);
                     if (var15 == 0) {
                        if (var40) {
                           var40 = var19;
                           var76 = var15;
                           break label1494;
                        }

                        var40 = recovery$indy$flow$191(client.ClientGlobals.field_48.field_48e, var3, -3626080436329547326L, var1);
                     }

                     var76 = var15;
                  }

                  label1488: {
                     label1487: {
                        if (var76 == 0) {
                           if (var40) {
                              var41 = this;
                              var76 = var15;
                              break label1488;
                           }
                        } else if (!var40) {
                           this.field_443 = false;
                           this.field_43a = true;
                           break label1487;
                        }

                        this.field_43a = false;
                     }

                     var41 = this;
                     var76 = ((byte) (0));
                  }

                  var41.field_43a = (boolean)((((int) (var76)) & 1) != 0);
                  return;
               }

               var36 = this;
               var76 = ((byte) (0));
            }

            var36.field_43P = (boolean)((((int) (var76)) & 1) != 0);
         }
      }
   }







   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      recovery$indy$18(this, 7, 100000, var3, -7101877125090001037L, var1);
      recovery$indy$19(this, 34, -1, var3, -7101877125090001037L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public boolean method_43N$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 132097003292336L;
      boolean var5 = recovery$indy$20(639978726650552012L, var1);
      boolean var10000 = recovery$indy$21(this, var3, 640056176597908622L, var1);
      if (var5) {
         if (!var10000) {
            return false;
         }

         var10000 = this.field_443;
      }

      return !var5 ? var10000 : var10000;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_443 = false;
      this.field_43P = false;
      this.field_45 = null;
   }



    public SmartClicking_47Cz(long a0) {
        super((java.lang.String) ("SmartClicking"),(java.lang.String) ("IntelligentesClicken"),(long) (((augustus.recovered.modules.legit.SmartClicking_47Cz.a ^ a0) ^ 41616250288613L)),(java.awt.Color) (new java.awt.Color((int) (235),(int) (125),(int) (52))),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.legit.SmartClicking_47Cz.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.legit.SmartClicking_47Cz.a ^ a0) ^ 74308937123197L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.legit.SmartClicking_47Cz.a ^ a0) ^ 74308937123197L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.legit.SmartClicking_47Cz.a ^ a0) ^ 74308937123197L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.legit.SmartClicking_47Cz.a ^ a0) ^ 102446087893187L);
        long constructorKey7 = ((augustus.recovered.modules.legit.SmartClicking_47Cz.a ^ a0) ^ 119369736081432L);
        long constructorKey8 = ((augustus.recovered.modules.legit.SmartClicking_47Cz.a ^ a0) ^ 93445778990590L);
        long constructorKey9 = ((augustus.recovered.modules.legit.SmartClicking_47Cz.a ^ a0) ^ 133750535641721L);
        short converted10 = (short) (constructorPart4);
        short converted11 = (short) (constructorPart5);
        client.setting.RangeSetting initialized12 = new client.setting.RangeSetting(constructorPart3, this, "Smart hurttime start", Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4613937818241073152L), converted10, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, converted11);
        recovery$indy$flow$215(this, initialized12);
        short converted13 = (short) (constructorPart4);
        short converted14 = (short) (constructorPart5);
        client.setting.RangeSetting initialized15 = new client.setting.RangeSetting(constructorPart3, this, "Smart hurttime end", Double.longBitsToDouble(4621256167635550208L), Double.longBitsToDouble(4621819117588971520L), converted13, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, converted14);
        recovery$indy$flow$218(this, initialized15);
        short converted16 = (short) (constructorPart4);
        short converted17 = (short) (constructorPart5);
        client.setting.RangeSetting initialized18 = new client.setting.RangeSetting(constructorPart3, this, "MaxDuration", Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4621819117588971520L), converted16, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, converted17);
        long initialValue19 = constructorKey7;
        client.setting.RangeSetting initialValue20 = initialized18;
        java.lang.Object initialValue21 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue20))))));
        java.lang.Object initialValue22 = recovery$indy$flow$222(initialValue21, initialValue19);
        recovery$indy$flow$223(this, initialValue22);
        client.setting.NumberSetting initialized23 = new client.setting.NumberSetting(this, "Chance", Double.longBitsToDouble(4636737291354636288L), constructorKey9, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0);
        recovery$indy$flow$226(this, initialized23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey8, "SmartHurttime", false);
        recovery$indy$flow$229(this, initialized24);
        client.setting.BooleanSetting initialized25 = new client.setting.BooleanSetting(this, constructorKey8, "ReduceClickingInAir", false);
        recovery$indy$flow$232(this, initialized25);
        client.setting.BooleanSetting initialized26 = new client.setting.BooleanSetting(this, constructorKey8, "FakeAttacks", false);
        recovery$indy$flow$235(this, initialized26);
        client.setting.BooleanSetting initialized27 = new client.setting.BooleanSetting(this, constructorKey8, "RatioBypass", false);
        java.lang.Object initialValue28 = recovery$indy$flow$238(this);
        java.lang.Object initialValue29 = initialValue28;
        long initialValue30 = constructorKey6;
        client.setting.BooleanSetting initialValue31 = initialized27;
        java.lang.Object initialValue32 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue33 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue29))))));
        java.lang.Object initialValue34 = recovery$indy$flow$241(initialValue32, initialValue30, initialValue33);
        java.lang.Object initialValue35 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue34))))));
        recovery$indy$flow$243(this, initialValue35);
        client.setting.NumberSetting initialized36 = new client.setting.NumberSetting(this, "RatioStrength", 1.0D, constructorKey9, 0.0D, 1.0D, 2);
        java.lang.Object initialValue37 = recovery$indy$flow$246(this);
        java.lang.Object initialValue38 = initialValue37;
        client.setting.NumberSetting initialValue39 = initialized36;
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue39))))));
        java.lang.Object initialValue41 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue42 = recovery$indy$flow$249(initialValue40, initialValue41);
        recovery$indy$flow$250(this, initialValue42);
        recovery$indy$flow$251(this, false);
        recovery$indy$flow$252(this, false);
        recovery$indy$flow$253(this, false);
        recovery$indy$flow$254(this, null);
        net.C_47cu initialized43 = new net.C_47cu();
        recovery$indy$flow$257(this, initialized43);
        recovery$indy$flow$258(this, false);
        recovery$indy$flow$259(this, 0);
        recovery$indy$flow$260(this, 0);
        recovery$indy$flow$261(this, true);
        net.C_49S initialized44 = new net.C_49S(40);
        recovery$indy$flow$264(this, initialized44);
        return;
    }





    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native boolean recovery$indy$flow$122(long a0,long a1);
    private static native boolean recovery$indy$flow$125(java.lang.Object a0,long a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$132(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$137(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$140(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$146(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$151(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$159(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$161(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$167(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$171(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$174(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$176(long a0,java.lang.Object a1,float a2,long a3,long a4);
    private static native boolean recovery$indy$flow$178(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$191(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$196(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native boolean recovery$indy$flow$197(long a0,long a1);
    private static native void recovery$indy$flow$215(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$218(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$222(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$223(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$226(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$229(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$232(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$235(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$238(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$241(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$243(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$246(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$249(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$250(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$251(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.SmartClicking_47Cz) (a0)).field_443 = a1;
        return;
    }
    private static void recovery$indy$flow$252(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.SmartClicking_47Cz) (a0)).field_44c = a1;
        return;
    }
    private static void recovery$indy$flow$253(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.SmartClicking_47Cz) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$254(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.SmartClicking_47Cz) (a0)).field_45 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static native void recovery$indy$flow$257(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$258(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.SmartClicking_47Cz) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$259(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.SmartClicking_47Cz) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$260(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.SmartClicking_47Cz) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$261(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.SmartClicking_47Cz) (a0)).field_43u = a1;
        return;
    }
    private static void recovery$indy$flow$264(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.SmartClicking_47Cz) (a0)).field_44b = ((net.C_49S) (a1));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native void recovery$indy$18(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$19(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native boolean recovery$indy$20(long var0, long var2);
   private static native boolean recovery$indy$21(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$24();
}
