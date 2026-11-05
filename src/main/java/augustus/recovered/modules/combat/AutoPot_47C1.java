package augustus.recovered.modules.combat;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_40g;
import net.C_41Q;
import net.C_42V;
import net.C_42a;
import net.C_43r;
import net.C_43z;
import net.C_459;
import net.C_45n;
import net.C_473U;
import net.C_474i;
import net.C_475c;
import net.C_476q;
import net.C_477Y;
import net.C_479N;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47K7;
import net.C_47MO;
import client.module.Module;
import net.C_47S6;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import net.C_47TU;
import client.setting.BooleanSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.C_47bo;
import net.C_47cu;
import net.C_47gg;
import net.C_47hg;
import net.C_47i;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47oY;
import net.C_47ob;
import net.C_47pL;
import client.ClientGlobals;
import net.C_47rf;
import client.module.Category;
import net.C_47xz;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoPot_47C1 extends client.module.Module implements net.C_47xz,net.C_41Q,net.C_48T,net.C_47UH,net.C_47iC {
    public final net.C_47TU settingPitchSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingHealHearts = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingInstant = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47TU settingTickDelayBeforeClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.RangeSetting settingTickDelayBetweenClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47TU settingTickDelayAfterClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingHotbarOnly = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingInInv = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingNotWhileKillAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingPotions = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47cu field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43n; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_43z field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47rf field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_43Z; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native void b();

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method h(long a0,long a1);

    private static native int e(long a0,long a1);

   private void method_42$e45a9973e5(long var1) {
      var1 = a ^ var1;
      int[] var3 = (int[])recovery$indy$flow$1(-3020270629067449115L, var1);
      if (var3 != null) {
         Object var11 = this.field_40;
         if (var1 > 0L) {
            var11 = this.field_40.method_48$e4caa49b8d(this.field_44).get(0);
         }

         net.C_47hg var8 = (net.C_47hg)var11;
         int var9 = var8.method_49$8abf5c6871();
         float var10 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$16(field_43, -3023348945137235932L, var1)).method_40$bc607678b6() - this.field_43Z;
         double var12;
         this.field_43P = (boolean)((((int) (((var12 = (int)(var10 / var9) - 0.85) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1)))) & 1) != 0);
         this.field_43Z += var9;
         System.out.println(this.field_43P);
      } else if (this.field_40 != null && this.field_44 != null) {
         Object var10000 = this.field_40;
         if (var1 > 0L) {
            if (!this.field_40.method_41$202261b6ed(this.field_44)) {
               return;
            }

            var10000 = this.field_40.method_48$e4caa49b8d(this.field_44).get(0);
         }

         net.C_47hg var4 = (net.C_47hg)var10000;
         if (var4.method_49$8abf5c6871() != 6) {
            this.field_43P = false;
         } else {
            int var5 = (int)(1.0 * (4 << var4.method_47$8abf5c6871()) + 0.5);
            float var6 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$16(field_43, -3023348945137235932L, var1)).method_40$bc607678b6() - this.field_43Z;
            this.field_43P = (int)(var6 / var5) > 0.85;
            this.field_43Z += var5;
            System.out.println(this.field_43P);
         }
      }
   }



    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   public void method_41$fae8de1664(C_475c var1) {
      AutoPot_47C1 var49;
      long var2 = a ^ 33322738371001L;
      long var4 = var2 ^ 129601863819168L;
      long var6 = var2 ^ 22736921475924L;
      long var8 = var2 ^ 19020538984813L;
      long var10 = var2 ^ 113362548750664L;
      long var10001 = var2 ^ 11696992424745L;
      int var12 = (int)((var2 ^ 11696992424745L) >>> 48);
      int var13 = (int)((var2 ^ 11696992424745L) << 16 >>> 48);
      int var14 = (int)(var10001 << 32 >>> 32);
      long var10000 = -6879040715850716552L;
      int[] var15 = AntiBot_47CG.method_40$d4d28024c9();
      this.field_438++;
      var49 = this;
      label119:
      if (var15 == null) {
         var10001 = -6877485400456673221L;
         BooleanSetting var19 = this.settingInstant;
         if (!var19.method_49$aae029aa0a()) {
            var49 = this;
            if (var15 != null) {
               break label119;
            }

            long var10002 = -6878266347695203976L;
            long var20 = var8;
            AutoPot_47C1 var22 = this;
            label126:
            if (var22.method_44Y$0dd78e0064(var20)) {
               var10002 = -6879136554098804996L;
               long var23 = var10;
               AutoPot_47C1 var25 = this;
               int var50 = (int) ((var25.method_44C$0dd78e0064(var23)) ? 1 : 0);
               if (var15 == null) {
                  if (var50 == 0) {
                     break label126;
                  }

                  long var10003 = -6874910476060660411L;
                  long var26 = var6;
                  int var28 = this.field_43n;
                  AutoPot_47C1 var29 = this;
                  var50 = var29.method_49$7ee0e11626(var28, var26);
               }

               int var16;
               label115: {
                  var16 = var50;
                  if (var15 == null) {
                     if (var16 == this.field_43n - 36) {
                        break label115;
                     }

                     char var67 = (char)var12;
                     char var10004 = (char)var13;
                     long var10006 = -6876695359746581897L;
                     int var30 = var14;
                     char var31 = var10004;
                     char var32 = var67;
                     int var33 = var16;
                     int var34 = this.field_43n;
                     AutoPot_47C1 var35 = this;
                     var35.method_44$4aca6745c9(var34, var33, var32, var31, var30);
                  }

                  this.field_43n = var16;
               }

               var10001 = -6874882200984322375L;
               Minecraft var36 = field_43;
               C_47rf var17 = var36.field_42P.method_48$ac4db64966();
               C_47rf var51 = var17;
               if (var15 == null) {
                  if (var17 == null) {
                     return;
                  }

                  var51 = var17;
               }

               int var52 = (int) ((var51.method_48$dbd570a038() instanceof C_43z) ? 1 : 0);
               if (var15 == null) {
                  if (var52 == 0) {
                     return;
                  }

                  var52 = var16;
               }

               var10002 = -6874882200984322375L;
               Minecraft var37 = field_43;
               if (var52 == var37.field_42P.field_42X.field_42) {
                  C_43z var18 = (C_43z)var17.method_48$dbd570a038();
                  int var53 = (int) ((var18.equals(this.field_40)) ? 1 : 0);
                  if (var15 == null) {
                     if (var53 == 0) {
                        return;
                     }

                     var10001 = -6875318017148106497L;
                     C_47S6 var38 = ClientGlobals.field_46;
                     float var68;
                     var53 = (var68 = var38.method_44$4f8050086d().field_41 - 85.0F) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1);
                  }

                  if (var15 == null) {
                     if (var53 <= 0) {
                        return;
                     }

                     var53 = this.field_43y;
                  }

                  label138: {
                     int var58 = this.field_43p;
                     if (var15 == null) {
                        if (var53 <= this.field_43p) {
                           return;
                        }

                        var49 = this;
                        if (var15 != null) {
                           break label138;
                        }

                        var53 = this.field_438;
                        var10002 = -6879228618551175412L;
                        RangeSetting var39 = this.settingTickDelayBetweenClick;
                        var58 = var39.method_44$8abf5c6871();
                     }

                     if (var53 <= var58) {
                        var49 = this;
                        if (var15 != null) {
                           break label138;
                        }

                        if (this.field_43a) {
                           return;
                        }
                     }

                     var10001 = -6875416261523307314L;
                     RangeSetting var40 = this.settingTickDelayBetweenClick;
                     var40.method_43$fedcb3e4d3();
                     var10002 = -6878797626910486854L;
                     byte var41 = 1;
                     C_475c var42 = var1;
                     var42.method_48$d00df7729d(var41);
                     var10002 = -6877120015174766762L;
                     boolean var43 = true;
                     C_475c var44 = var1;
                     var44.method_45$f633c984d8(var43);
                     var10002 = -6877310461813668159L;
                     long var45 = var4;
                     AutoPot_47C1 var47 = this;
                     var47.method_42$e45a9973e5(var45);
                     this.field_42 = 0;
                     this.field_43a = true;
                     this.field_438 = 0;
                     var10001 = -6874810531326626247L;
                     C_47cu var48 = this.field_45;
                     var48.method_46$da8c82d5d4();
                     var49 = this;
                  }

                  var49.field_40 = null;
               }

               return;
            }
         }

         this.field_438 = 0;
         var49 = this;
      }

      var49.field_43a = false;
   }





    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   private void method_44$4aca6745c9(int var1, int var2, char var3, char var4, int var5) {
      long var6 = ((long)var3 << 48 | (long)var4 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ a;
      recovery$indy$4(field_43, -2702110422653642891L, var6)
         .method_42$f0ddb617a2(
            recovery$indy$5(field_43, -2701148933336267603L, var6).field_429.field_43, var1, var2, 2, recovery$indy$6(field_43, -2701148933336267603L, var6)
         );
   }



   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      long var5 = (long)var1 << 32 | var3 << 32 >>> 32;
      long var7 = var5 ^ 9587932659389L;
      long var9 = var5 ^ 116319768762953L;
      long var11 = var5 ^ 118934156597360L;
      long var13 = var5 ^ 29125551921237L;
      long var10001 = var5 ^ 131685832978996L;
      int var15 = (int)((var5 ^ 131685832978996L) >>> 48);
      int var16 = (int)((var5 ^ 131685832978996L) << 16 >>> 48);
      int var17 = (int)(var10001 << 32 >>> 32);
      long var10000 = 4725896197411900261L;
      int[] var18 = AntiBot_47CG.method_40$d4d28024c9();
      var10001 = 4725188674252679462L;
      BooleanSetting var21 = this.settingInstant;
      int var55 = (int) ((var21.method_49$aae029aa0a()) ? 1 : 0);
      if (var18 == null) {
         if (var55 == 0) {
            return;
         }

         long var10002 = 4725965220273813605L;
         long var22 = var11;
         AutoPot_47C1 var24 = this;
         var55 = (int) ((var24.method_44Y$0dd78e0064(var22)) ? 1 : 0);
      }

      int[] var59 = var18;
      if (var3 >= 0L) {
         if (var18 == null) {
            if (var55 == 0) {
               return;
            }

            long var68 = 4725710490739070945L;
            long var25 = var13;
            AutoPot_47C1 var27 = this;
            var55 = (int) ((var27.method_44C$0dd78e0064(var25)) ? 1 : 0);
         }

         var59 = var18;
      }

      if (var59 == null) {
         if (var55 == 0) {
            return;
         }

         var10001 = 4722866946540019620L;
         Minecraft var28 = field_43;
         var55 = var28.field_42P.field_42X.field_42;
      }

      label63: {
         int var19 = var55;
         if (var18 == null) {
            label84: {
               int var56 = var19;
               if (var3 >= 0L) {
                  if (var19 == this.field_43n - 36) {
                     break label84;
                  }

                  long var10003 = 4722609423817968728L;
                  long var29 = var9;
                  int var31 = this.field_43n;
                  AutoPot_47C1 var32 = this;
                  var56 = var32.method_49$7ee0e11626(var31, var29);
               }

               int var20 = var56;
               int[] var57 = var18;
               if (var1 >= 0) {
                  if (var18 == null) {
                     if (var20 != this.field_43n - 36) {
                        char var70 = (char)var15;
                        char var10004 = (char)var16;
                        long var10006 = 4723272594053512042L;
                        int var33 = var17;
                        char var34 = var10004;
                        char var35 = var70;
                        int var36 = var20;
                        int var37 = this.field_43n;
                        AutoPot_47C1 var38 = this;
                        var38.method_44$4aca6745c9(var37, var36, var35, var34, var33);
                     }

                     var10001 = 4722866946540019620L;
                     Minecraft var39 = field_43;
                     var39.field_42P.field_49m.method_45$631790539f(new C_477Y(var20));
                     var10001 = 4722866946540019620L;
                     Minecraft var40 = field_43;
                     long var71 = 4722866946540019620L;
                     Minecraft var41 = field_43;
                     long var75 = 4722866946540019620L;
                     Minecraft var42 = field_43;
                     var40.field_42P.field_49m.method_45$631790539f(new C_479N(var41.field_42P.field_48h, 90.0F, var42.field_42P.field_48M));
                     var10001 = 4722866946540019620L;
                     Minecraft var43 = field_43;
                     var71 = 4722866946540019620L;
                     Minecraft var44 = field_43;
                     var43.field_42P.field_49m.method_45$631790539f(new C_42V(var44.field_42P.field_42X.method_43$8da6669f6b(var20)));
                     long var69 = 4725296310903318492L;
                     long var45 = var7;
                     AutoPot_47C1 var47 = this;
                     var47.method_42$e45a9973e5(var45);
                     var10001 = 4722866946540019620L;
                     Minecraft var48 = field_43;
                     var48.field_42P.field_49m.method_45$631790539f(new C_477Y(var19));
                  }

                  var57 = var18;
               }

               if (var57 == null) {
                  break label63;
               }
            }

            var10001 = 4722866946540019620L;
            Minecraft var49 = field_43;
            long var73 = 4722866946540019620L;
            Minecraft var50 = field_43;
            long var76 = 4722866946540019620L;
            Minecraft var51 = field_43;
            var49.field_42P.field_49m.method_45$631790539f(new C_479N(var50.field_42P.field_48h, 90.0F, var51.field_42P.field_48M));
         }

         var10001 = 4722866946540019620L;
         Minecraft var52 = field_43;
         long var74 = 4722866946540019620L;
         Minecraft var53 = field_43;
         var52.field_42P.field_49m.method_45$631790539f(new C_42V(var53.field_42P.field_42X.method_43$8da6669f6b(this.field_43n - 36)));
      }

      var10001 = 4722790955088254756L;
      C_47cu var54 = this.field_45;
      var54.method_46$da8c82d5d4();
      this.field_43n = -1;
   }






   private boolean method_48$05d3808578(long var1, int var3) {
      var1 = a ^ var1;
      int[] var4 = recovery$indy$7(-8287195999580535283L, var1);
      Iterator var5 = recovery$indy$8(field_43, -8294846702937025844L, var1).method_46$29638970ac().iterator();

      int var10000;
      while (true) {
         if (var5.hasNext()) {
            C_47hg var6 = (C_47hg)var5.next();
            var10000 = var6.method_49$8abf5c6871();
            int[] var10001 = var4;
            if (var1 > 0L) {
               if (var4 != null) {
                  break;
               }

               var10001 = var4;
            }

            if (var10001 != null) {
               return var10000 != 0;
            }

            if (var10000 == var3) {
               return false;
            }

            if (var4 == null) {
               continue;
            }
         }

         var10000 = 1;
         break;
      }

      return var10000 != 0;
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 105143953068477L;
      long var10000 = 8686595976494199420L;
      int[] var3 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = 8685757688763289663L;
      BooleanSetting var4 = this.settingInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_48$69a0267010(C_43z var1, long var2, C_47hg var4, boolean var5) {
      java.lang.Object var16;
      int[] var17;
      var2 = a ^ var2;
      int[] var6 = recovery$indy$9(820440666251018642L, var2);
      int var10000 = (int) ((var5) ? 1 : 0);
      if (var6 == null) {
         var10000 = (var5 ? 1 : 0) != 0 ? 36 : 9;
      }

      int var7 = var10000;

      while (var7 < recovery$indy$10(field_43, 828087879942395219L, var2).field_429.field_46.size()) {
         C_47hg var10;
         int var10001;
         label148: {
            label147: {
               C_47rf var8 = recovery$indy$11(field_43, 828087879942395219L, var2).field_429.method_46$4c10532da1(var7).method_48$ac4db64966();
               label146:
               if (var6 == null) {
                  label156: {
                     C_47rf var12 = var8;
                     if (var2 >= 0L) {
                        if (var8 == null) {
                           break label156;
                        }

                        var12 = var8;
                     }

                     C_43r var13 = var12.method_48$dbd570a038();
                     if (var6 == null) {
                        if (!(var13 instanceof C_43z)) {
                           break label156;
                        }

                        var13 = var8.method_48$dbd570a038();
                     }

                     C_43z var9 = (C_43z)var13;
                     if (var6 != null) {
                        break label146;
                     }

                     C_43z var14 = var9;
                     if (var2 >= 0L) {
                        if (var9 == var1) {
                           break label156;
                        }

                        var14 = var1;
                     }

                     label157: {
                        boolean var15 = var14.method_48$e4caa49b8d(var8).isEmpty();
                        if (var6 == null) {
                           if (var15) {
                              break label156;
                           }

                           var16 = var8;
                           if (var6 != null) {
                              break label157;
                           }

                           var15 = C_43z.method_40$9a6ad9dfe5(var8.method_40$8abf5c6871());
                        }

                        if (!var15) {
                           break label156;
                        }

                        var16 = var9.method_48$e4caa49b8d(var8).get(0);
                     }

                     var10 = (C_47hg)var16;
                     var17 = var6;
                     if (var2 <= 0L) {
                        break label147;
                     }

                     if (var6 != null) {
                        break label146;
                     }

                     var10000 = var10.method_49$8abf5c6871();
                     var10001 = var4.method_49$8abf5c6871();
                     if (var2 <= 0L) {
                        break label148;
                     }

                     if (var10000 == var10001) {
                        var10000 = var4.method_47$8abf5c6871();
                        var10001 = var10.method_47$8abf5c6871();
                        break label148;
                     }
                  }

                  var7++;
               }

               var17 = var6;
            }

            if (var17 == null) {
               continue;
            }
            break;
         }

         if (var6 == null) {
            if (var10000 > var10001) {
               return false;
            }

            var10000 = var4.method_40$8abf5c6871();
            if (var6 != null) {
               return var10000 != 0;
            }

            var10001 = var10.method_40$8abf5c6871();
         }

         if (var10000 > var10001) {
            var10000 = var4.method_47$8abf5c6871();
            if (var6 != null) {
               return var10000 != 0;
            }

            if (var10000 == var10.method_47$8abf5c6871()) {
               return false;
            }
         }

         return true;
      }

      return true;
   }




   private int method_49$7ee0e11626(int var1, long var2) {
      var2 = a ^ var2;
      int[] var4 = recovery$indy$12(8278098457110853649L, var2);
      int var10000 = var1;
      if (var4 == null) {
         label73:
         if (var1 >= 0) {
            var10000 = var1;
            int var10001 = recovery$indy$13(field_43, 8286211364958350544L, var2).field_429.field_46.size();
            int[] var10002 = var4;
            if (var2 > 0L) {
               if (var4 == null) {
                  if (var1 > var10001) {
                     break label73;
                  }

                  var10000 = var1;
                  var10001 = 36;
               }

               var10002 = var4;
            }

            if (var10002 == null) {
               if (var10000 < var10001) {
                  int var5 = 36;

                  while (var5 < recovery$indy$14(field_43, 8286211364958350544L, var2).field_429.field_46.size()) {
                     C_47rf var6 = recovery$indy$15(field_43, 8286211364958350544L, var2).field_429.method_46$4c10532da1(var5).method_48$ac4db64966();
                     C_47rf var9 = var6;
                     if (var4 == null) {
                        if (var6 == null) {
                           return var5 - 36;
                        }

                        var9 = var6;
                     }

                     byte var10 = (byte) ((var9.method_48$dbd570a038() instanceof C_43z) ? 1 : 0);
                     if (var4 != null) {
                        return var10;
                     }

                     if (var10 == 0) {
                        var5++;
                        if (var4 == null) {
                           continue;
                        }
                        break;
                     }

                     return var5 - 36;
                  }

                  return 6;
               }

               var10000 = var1;
               var10001 = 36;
            }

            return var10000 - var10001;
         }

         var10000 = var1;
      }

      return var10000;
   }



   public int method_45$95d88932bd(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 52687795110540L;
      return recovery$indy$16(this, this.field_43n, var3, -2787919354364848995L, var1);
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 112756802417382L;
      long var10000 = 2006287843023409447L;
      int[] var3 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = 2004448956876387172L;
      BooleanSetting var4 = this.settingInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private void method_45$42e3641c66(long var1, short var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 70734610434741L;
      long var8 = var4 ^ 109847255934770L;
      long var10 = var4 ^ 13351244994598L;
      this.field_43p = recovery$indy$19(
         C_476q.field_48,
         var10,
         recovery$indy$17(this.settingTickDelayBeforeClick, var8, -33104156526606218L, var4),
         recovery$indy$18(this.settingTickDelayBeforeClick, var6, -29794897521819504L, var4),
         -32392793189434267L,
         var4
      );
      this.field_437 = recovery$indy$22(
         C_476q.field_48,
         var10,
         recovery$indy$20(this.settingTickDelayAfterClick, var8, -33104156526606218L, var4),
         recovery$indy$21(this.settingTickDelayAfterClick, var6, -29794897521819504L, var4),
         -32392793189434267L,
         var4
      );
      this.field_43y = 0;
   }



   private C_42a method_47$1e13eefc2d(boolean var1, long var2) {
      java.lang.Object var23;
      int[] var25;
      augustus.recovered.modules.combat.AutoPot_47C1 var27;
      augustus.recovered.modules.combat.AutoPot_47C1 var29;
      var2 = a ^ var2;
      long var4 = var2 ^ 61019692301666L;
      long var6 = var2 ^ 131382454866763L;
      long var8 = var2 ^ 81539674592468L;
      int[] var10 = recovery$indy$23(3536631815463336932L, var2);
      int var10000 = (int) ((var1) ? 1 : 0);
      if (var10 == null) {
         var10000 = (var1 ? 1 : 0) != 0 ? 36 : 9;
      }

      int var11 = var10000;

      C_47rf var12;
      label308: {
         label307: {
            while (true) {
               if (var11 < recovery$indy$24(field_43, 3534089991839936293L, var2).field_429.field_46.size()) {
                  var12 = recovery$indy$25(field_43, 3534089991839936293L, var2).field_429.method_46$4c10532da1(var11).method_48$ac4db64966();
                  int[] var18 = var10;
                  if (var2 > 0L) {
                     if (var10 != null) {
                        break;
                     }

                     var18 = var10;
                  }

                  label301: {
                     label300:
                     if (var18 == null) {
                        label332: {
                           C_47rf var19 = var12;
                           if (var2 > 0L) {
                              if (var12 == null) {
                                 break label332;
                              }

                              var19 = var12;
                           }

                           C_43r var20 = var19.method_48$dbd570a038();
                           if (var10 == null) {
                              if (!(var20 instanceof C_43z)) {
                                 break label332;
                              }

                              var20 = var12.method_48$dbd570a038();
                           }

                           C_43z var13 = (C_43z)var20;
                           List var14 = var13.method_48$e4caa49b8d(var12);
                           if (var10 != null) {
                              break label300;
                           }

                           List var21 = var14;
                           if (var2 > 0L) {
                              if (var14 == null) {
                                 break label332;
                              }

                              var21 = var14;
                           }

                           label314: {
                              boolean var22 = var21.isEmpty();
                              if (var10 == null) {
                                 if (var22) {
                                    break label332;
                                 }

                                 var23 = var12;
                                 if (var10 != null) {
                                    break label314;
                                 }

                                 var22 = C_43z.method_40$9a6ad9dfe5(var12.method_40$8abf5c6871());
                              }

                              if (!var22) {
                                 break label332;
                              }

                              var23 = var13.method_48$e4caa49b8d(var12).get(0);
                           }

                           C_47hg var15;
                           int[] var31;
                           label328: {
                              var15 = (C_47hg)var23;
                              var10000 = var15.method_49$8abf5c6871();
                              var31 = var10;
                              if (var2 > 0L) {
                                 label254:
                                 if (var10 == null) {
                                    switch (var10000) {
                                       case 6:
                                          double var35;
                                          var10000 = (
                                                   var35 = recovery$indy$26(field_43, 3534089991839936293L, var2).method_43$bc607678b6()
                                                      - recovery$indy$27(this.settingHealHearts, var4, 3536039734079532882L, var2)
                                                )
                                                == 0.0
                                             ? 0
                                             : (var35 < 0.0 ? -1 : 1);
                                          break label254;
                                       case 10:
                                          var10000 = (int) ((recovery$indy$30(C_459.REGENERATION, 3537230530122030849L, var2)) ? 1 : 0);
                                          var31 = var10;
                                          if (var2 <= 0L) {
                                             break label328;
                                          }

                                          if (var10 != null) {
                                             break;
                                          }

                                          if (var10000 == 0) {
                                             break label332;
                                          }
                                       case 1:
                                          double var34;
                                          var10000 = (
                                                   var34 = recovery$indy$31(field_43, 3534089991839936293L, var2).method_43$bc607678b6()
                                                      - recovery$indy$32(this.settingHealHearts, var4, 3536039734079532882L, var2)
                                                )
                                                == 0.0
                                             ? 0
                                             : (var34 < 0.0 ? -1 : 1);
                                          break;
                                       default:
                                          C_47oY var16 = C_47oY.field_461[var15.method_49$8abf5c6871()];
                                          var25 = var10;
                                          if (var2 < 0L) {
                                             break label301;
                                          }

                                          if (var10 != null) {
                                             break label300;
                                          }

                                          boolean var26 = var16.method_46$aae029aa0a();
                                          if (var2 >= 0L) {
                                             if (var26) {
                                                break label332;
                                             }

                                             var26 = recovery$indy$36(C_459.ALL_POSITIVE, 3537230530122030849L, var2);
                                          }

                                          var31 = var10;
                                          if (var2 > 0L) {
                                             if (var10 == null) {
                                                if (!var26) {
                                                   break label332;
                                                }

                                                var26 = recovery$indy$37(this, var8, var15.method_49$8abf5c6871(), 3536672157007856812L, var2);
                                             }

                                             var31 = var10;
                                          }

                                          if (var31 == null) {
                                             if (!var26) {
                                                break label332;
                                             }

                                             var27 = this;
                                             if (var10 != null) {
                                                break label307;
                                             }

                                             var26 = recovery$indy$38(this, var13, var6, var15, (boolean)var1, 3536738617520920969L, var2);
                                          }

                                          if (var26) {
                                             var27 = this;
                                             break label307;
                                          }
                                          break label332;
                                    }

                                    var31 = var10;
                                    break label328;
                                 }

                                 var31 = var10;
                              }

                              if (var2 > 0L) {
                                 if (var31 == null) {
                                    if (var10000 >= 0) {
                                       break label332;
                                    }

                                    var10000 = (int) ((recovery$indy$28(C_459.HEALTH, 3537230530122030849L, var2)) ? 1 : 0);
                                 }

                                 var31 = var10;
                              }

                              if (var31 == null) {
                                 if (var10000 == 0) {
                                    break label332;
                                 }

                                 var10000 = (int) ((recovery$indy$29(this, var13, var6, var15, (boolean)var1, 3536738617520920969L, var2)) ? 1 : 0);
                              }

                              if (var10000 != 0) {
                                 return new C_42a(var11, var12);
                              }
                              break label332;
                           }

                           label231: {
                              label230:
                              if (var31 == null) {
                                 if (var10000 >= 0) {
                                    var10000 = var15.method_49$8abf5c6871();
                                    var31 = var10;
                                    if (var2 <= 0L) {
                                       break label231;
                                    }

                                    if (var10 != null) {
                                       break label230;
                                    }

                                    if (var10000 == 10) {
                                       break label332;
                                    }
                                 }

                                 var10000 = (int) ((recovery$indy$33(C_459.SPEED, 3537230530122030849L, var2)) ? 1 : 0);
                              }

                              var31 = var10;
                           }

                           label218: {
                              label217:
                              if (var31 == null) {
                                 if (var10000 == 0) {
                                    var10000 = var15.method_49$8abf5c6871();
                                    var31 = var10;
                                    if (var2 < 0L) {
                                       break label218;
                                    }

                                    if (var10 != null) {
                                       break label217;
                                    }

                                    if (var10000 == 1) {
                                       break label332;
                                    }
                                 }

                                 var10000 = (int) ((recovery$indy$34(this, var8, var15.method_49$8abf5c6871(), 3536672157007856812L, var2)) ? 1 : 0);
                              }

                              var31 = var10;
                           }

                           if (var31 == null) {
                              if (var10000 == 0) {
                                 break label332;
                              }

                              var29 = this;
                              if (var10 != null) {
                                 break label308;
                              }

                              var10000 = (int) ((recovery$indy$35(this, var13, var6, var15, (boolean)var1, 3536738617520920969L, var2)) ? 1 : 0);
                           }

                           if (var10000 != 0) {
                              var29 = this;
                              break label308;
                           }
                        }

                        var11++;
                     }

                     var25 = var10;
                  }

                  if (var25 == null) {
                     continue;
                  }
               }

               if (var2 >= 0L) {
                  this.field_43P = false;
               }
               break;
            }

            return new C_42a(-1, null);
         }

         var27.field_43P = false;
         return new C_42a(var11, var12);
      }

      var29.field_43P = false;
      return new C_42a(var11, var12);
   }






   public void method_47$9035875d26(long var1, C_47ob var3) {
      int[] var4 = recovery$indy$39(2670509070341206015L, var1);
      C_473U var5 = recovery$indy$40(var3, 2668489433734100920L, var1);
      C_473U var10000 = var5;
      if (var4 == null) {
         if (!(var5 instanceof C_47bo)) {
            return;
         }

         var10000 = var5;
      }

      C_47bo var6 = (C_47bo)var10000;
      if (var6.method_49$bc607678b6() < this.field_47) {
         this.field_43Z = var6.method_49$bc607678b6();
      }

      this.field_47 = var6.method_49$bc607678b6();
   }



    public void method_40G$e45a9973e5(long l) {
        boolean bl;
        int n;
        long l2;
        block15: {
            long l3;
            int n2;
            int n3;
            int n4;
            block14: {
                block9: {
                    block13: {
                        block11: {
                            block12: {
                                int n5;
                                int n6;
                                int n7;
                                block10: {
                                    int n8;
                                    block8: {
                                        long l4 = l;
                                        long l5 = l4 ^ 0x1321FA7D5B06L;
                                        l2 = l5 >>> 16;
                                        n = (int)(l5 << 48 >>> 48);
                                        long l6 = l4 ^ 0x5D3DD120B88L;
                                        n4 = (int)(l6 >>> 32);
                                        n3 = (int)(l6 << 32 >>> 48);
                                        n2 = (int)(l6 << 48 >>> 48);
                                        long l7 = l4 ^ 0x3A3F84999DD2L;
                                        n7 = (int)(l7 >>> 48);
                                        n6 = (int)(l7 << 16 >>> 32);
                                        n5 = (int)(l7 << 48 >>> 48);
                                        l3 = l4 ^ 0x529E4FD57DC2L;
                                        ++this.field_43y;
                                        bl = false;
                                        int[] nArray = AntiBot_47CG.method_40$d4d28024c9();
                                        long l8 = l3;
                                        AutoPot_47C1 autoPot_47C1 = this;
                                        n8 = autoPot_47C1.method_45$95d88932bd(l8);
                                        if (nArray != null) break block8;
                                        if (n8 < 0) break block9;
                                        break block10;
                                    }
                                    if (n8 >= this.field_437) break block11;
                                    break block12;
                                }
                                Client c_40U = Client.method_44$fbc0c0be91();
                                char c = (char)n5;
                                AutoPot_47C1 autoPot_47C1 = this;
                                int n9 = n6;
                                char c2 = (char)n7;
                                C_47S6 c_47S6 = c_40U.method_45$22ea1ae835();
                                if (!c_47S6.method_49$dc3f815dad(c2, n9, (Module)autoPot_47C1, c)) break block9;
                                break block13;
                            }
                            long l9 = l3;
                            AutoPot_47C1 autoPot_47C1 = this;
                            int n10 = autoPot_47C1.method_45$95d88932bd(l9);
                            char c = (char)n2;
                            char c3 = (char)n3;
                            int n11 = 4;
                            AutoPot_47C1 autoPot_47C12 = this;
                            int n12 = n4;
                            C_47i.method_43$95cbd1eb82((int)n12, (Module)autoPot_47C12, (int)n11, (char)c3, (char)c, (int)n10);
                            bl = true;
                        }
                        if (bl != this.field_43v) {
                            short s = (short)n;
                            long l10 = l2;
                            AutoPot_47C1 autoPot_47C1 = this;
                            autoPot_47C1.method_45$42e3641c66(l10, s);
                        }
                        this.field_43v = bl;
                        ++this.field_42;
                        return;
                    }
                    C_47S6 c_47S6 = ClientGlobals.field_46;
                    if (c_47S6.method_44$4f8050086d().field_41 > 85.0f) break block14;
                }
                int n13 = ((int) (this.field_43P ? 1 : 0));
                if (l >= 0L) {
                    if (n13 != 0) {
                        RangeSetting c_47Ts = this.settingTickDelayBetweenClick;
                        n13 = Math.max(this.field_437, c_47Ts.method_44$8abf5c6871());
                    } else {
                        n13 = this.field_437;
                    }
                }
                if (this.field_42 >= n13) break block15;
            }
            long l11 = l3;
            AutoPot_47C1 autoPot_47C1 = this;
            int n14 = autoPot_47C1.method_45$95d88932bd(l11);
            char c = (char)n2;
            char c4 = (char)n3;
            int n15 = 4;
            AutoPot_47C1 autoPot_47C13 = this;
            int n16 = n4;
            C_47i.method_43$95cbd1eb82((int)n16, (Module)autoPot_47C13, (int)n15, (char)c4, (char)c, (int)n14);
            bl = true;
        }
        if (bl != this.field_43v) {
            short s = (short)n;
            long l12 = l2;
            AutoPot_47C1 autoPot_47C1 = this;
            autoPot_47C1.method_45$42e3641c66(l12, s);
        }
        this.field_43v = bl;
        ++this.field_42;
    }





   private boolean method_44Y$0dd78e0064(long var1) {
      int[] var23;
      int[] var25;
      var1 = a ^ var1;
      long var3 = var1 ^ 136399198879371L;
      long var5 = var1 ^ 96482969462701L;
      long var10000 = -1091925759002035672L;
      int[] var7 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = -1096753276222886167L;
      Minecraft var8 = field_43;
      boolean var20 = var8.field_42P.method_48V$aae029aa0a();
      if (var7 == null) {
         if (var20) {
            return false;
         }

         var10001 = -1091627467765087191L;
         Minecraft var9 = field_43;
         var20 = var9.field_44r.field_45w.field_45;
      }

      label128: {
         label127:
         if (var7 == null) {
            if (var20) {
               var10001 = -1097691880554660559L;
               Minecraft var10 = field_43;
               var20 = var10.field_44K.method_43$aae029aa0a();
               var23 = var7;
               if (var1 < 0L) {
                  break label128;
               }

               if (var7 != null) {
                  break label127;
               }

               if (!var20) {
                  return false;
               }
            }

            var10001 = -1090349587970320277L;
            BooleanSetting var11 = this.settingNotWhileKillAura;
            var20 = var11.method_49$aae029aa0a();
         }

         var23 = var7;
      }

      label117: {
         label116:
         if (var23 == null) {
            if (var20) {
               long var10002 = -1098456326083439070L;
               long var12 = var3;
               KillAura_47CY var14 = ClientGlobals.field_48.field_48Q;
               var20 = var14.method_46$0dd78e0064(var12);
               var25 = var7;
               if (var1 < 0L) {
                  break label117;
               }

               if (var7 != null) {
                  break label116;
               }

               if (var20 && ClientGlobals.field_48.field_48Q.field_45z != null) {
                  return false;
               }
            }

            var10001 = -1091524329388834674L;
            var20 = C_474i.method_45$0dd78e0064(var5);
         }

         var25 = var7;
      }

      if (var1 >= 0L) {
         if (var25 == null) {
            if (var20) {
               return false;
            }

            var10001 = -1096753276222886167L;
            Minecraft var15 = field_43;
            var20 = var15.field_42P.method_436$aae029aa0a();
         }

         var25 = var7;
      }

      if (var1 >= 0L) {
         if (var25 == null) {
            if (var20) {
               return false;
            }

            var10001 = -1097015201947353390L;
            Minecraft var16 = field_43;
            var20 = var16.method_44$aae029aa0a();
         }

         var25 = var7;
      }

      if (var25 != null) {
         return var20;
      }

      if (var20) {
         return true;
      }

      var10001 = -1090349587970320277L;
      BooleanSetting var17 = this.settingInInv;
      boolean var32 = var17.method_49$aae029aa0a();
      int[] var30 = var7;
      if (var1 >= 0L) {
         if (var7 == null) {
            if (!var32) {
               return false;
            }

            var10001 = -1097087266923112374L;
            Minecraft var18 = field_43;
            var32 = var18.field_44m instanceof C_47pL;
         }

         var30 = var7;
      }

      return var30 != null ? var32 : var32;
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$41(this, 40, var5, -7103173325312761192L, var1);
      recovery$indy$42(this, 18, var5, -7103173325312761192L, var1);
      recovery$indy$43(this, 34, var5, -7103173325312761192L, var1);
      recovery$indy$44(this, 7, 20, var3, -7102294708807777222L, var1);
      recovery$indy$45(this, 26, var5, -7103173325312761192L, var1);
   }



   private boolean method_44t$aae029aa0a() {
      long var1 = a ^ 84639819447726L;
      long var10000 = 6097854509518691951L;
      int[] var3 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = 6095923101155769388L;
      BooleanSetting var4 = this.settingInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_43n = -1;
   }



   private boolean method_44C$0dd78e0064(long var1) {
      var1 = a ^ var1;
      int[] var3 = recovery$indy$46(3530194391469619725L, var1);
      AutoPot_47C1 var10000 = this;
      if (var3 == null) {
         if (this.field_43n <= 0) {
            return false;
         }

         var10000 = this;
      }

      return var10000.field_40 != null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = (var4 ^ 130833229525833L) >>> 16;
      int var8 = (int)((var4 ^ 130833229525833L) << 48 >>> 48);
      this.field_43n = -1;
      this.field_40 = null;
      this.field_43v = false;
      recovery$indy$47(this, var6, (short)var8, 2737448302563481900L, var4);
   }



   public void method_487$da8c82d5d4() {
      net.C_43z var70;
      long var3;
      long var5;
      long var7;
      int var13;
      int var14;
      int var15;
      long var16;
      long var18;
      long var20;
      int[] var22;
      boolean var66;
      label76: {
         label79: {
            long var1 = a ^ 19953319456105L;
            var3 = var1 ^ 60228979405177L;
            var5 = var1 ^ 23595595291902L;
            var7 = var1 ^ 13879808414380L;
            long var9 = var1 ^ 14898714877041L;
            long var11 = var1 ^ 28657421075362L;
            long var10001 = var1 ^ 16289646350217L;
            var13 = (int)((var1 ^ 16289646350217L) >>> 48);
            var14 = (int)((var1 ^ 16289646350217L) << 16 >>> 48);
            var15 = (int)(var10001 << 32 >>> 32);
            var16 = var1 ^ 32056076099005L;
            var18 = var1 ^ 118135039303064L;
            var20 = var1 ^ 133140353470701L;
            long var10000 = -4298491774697238872L;
            var22 = AntiBot_47CG.method_40$d4d28024c9();
            long var10003 = -4297568031620283559L;
            long var24 = var11;
            long var26 = 1000L;
            C_47cu var28 = this.field_45;
            var66 = var28.method_42$b0e346e6e3(var26, var24);
            if (var22 == null) {
               if (!var66) {
                  var66 = this.field_43P;
                  if (var22 != null) {
                     break label76;
                  }

                  if (!this.field_43P) {
                     break label79;
                  }
               }

               long var10002 = -4297716795677737560L;
               long var29 = var16;
               AutoPot_47C1 var31 = this;
               var66 = var31.method_44Y$0dd78e0064(var29);
            }

            if (var22 != null) {
               break label76;
            }

            if (var66) {
               label65: {
                  long var72 = -4296910011467617045L;
                  BooleanSetting var32 = this.settingHotbarOnly;
                  boolean var68 = var32.method_49$aae029aa0a();
                  var10003 = -4303429782655967786L;
                  long var33 = var9;
                  boolean var35 = var68;
                  AutoPot_47C1 var36 = this;
                  C_42a var23 = var36.method_47$1e13eefc2d(var35, var33);
                  var72 = -4296450051660371544L;
                  C_42a var37 = var23;
                  this.field_43n = (Integer)var37.method_40$0502b11602();
                  var72 = -4297661890257577913L;
                  C_42a var38 = var23;
                  this.field_44 = (C_47rf)var38.method_45$0502b11602();
                  C_47rf var69 = this.field_44;
                  if (var22 == null) {
                     if (this.field_44 == null) {
                        var70 = null;
                        break label65;
                     }

                     var69 = this.field_44;
                  }

                  var70 = (C_43z)var69.method_48$dbd570a038();
               }

               this.field_40 = var70;
               this.field_42 = 1000;
            }
         }

         long var71 = -4296910011467617045L;
         BooleanSetting var39 = this.settingInstant;
         var66 = var39.method_49$aae029aa0a();
      }

      if (var22 == null) {
         if (var66) {
            return;
         }

         long var75 = -4297716795677737560L;
         long var40 = var16;
         AutoPot_47C1 var42 = this;
         var66 = var42.method_44Y$0dd78e0064(var40);
      }

      if (var22 == null) {
         if (!var66) {
            return;
         }

         long var76 = -4298569659538058708L;
         long var43 = var18;
         AutoPot_47C1 var45 = this;
         var66 = var45.method_44C$0dd78e0064(var43);
      }

      if (var66) {
         C_47S6 var67 = ClientGlobals.field_46;
         long var77 = -4303758048004658129L;
         C_47S6 var46 = ClientGlobals.field_46;
         short var81 = (short)var13;
         float var78 = var46.method_44$4f8050086d().field_41;
         C_47MO var10004 = C_476q.field_48;
         long var10007 = -4303728875132898374L;
         long var47 = var5;
         C_47TU var49 = this.settingPitchSpeed;
         double var10005 = var49.method_41$474dfaa627(var47);
         long var10008 = -4298031493765137572L;
         long var50 = var3;
         C_47TU var52 = this.settingPitchSpeed;
         double var10006 = var52.method_43$474dfaa627(var50);
         var10008 = -4305309191520132096L;
         long var53 = var7;
         double var55 = var10006;
         double var57 = var10005;
         C_47MO var59 = var10004;
         float var82 = var59.method_46$75c1d434ba(var57, var55, var53);
         char var84 = (char)var14;
         var10007 = -4305180619801872285L;
         float var79 = C_47gg.method_44$558c5d3f22(var81, var78, 90.0F, var84, var15, var82);
         long var83 = -4304141128055832677L;
         AutoPot_47C1 var60 = this;
         byte var61 = 1;
         float var62 = var79;
         long var63 = var20;
         C_47S6 var65 = var67;
         var65.method_46$6a778c6bfe(var63, var62, var61, var60);
      }
   }





    public AutoPot_47C1(long a0) {
        super((java.lang.String) ("AutoPot"),(java.lang.String) ("AutoTrank"),(long) (((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 123148356181892L)),(java.awt.Color) (new java.awt.Color((int) (227),(int) (66),(int) (101))),(client.module.Category) (client.module.Category.COMBAT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 24517185102620L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 24517185102620L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 24517185102620L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 72556749378162L);
        long constructorKey7 = ((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 31187197107927L);
        long constructorKey8 = ((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 4730335008010L);
        long constructorKey9 = ((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 62989208237689L);
        long constructorKey10 = ((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 1255030162335L);
        long constructorKey11 = ((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 48911204793368L);
        int constructorPart12 = (int) ((((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 19041280951609L) >>> 32));
        long constructorKey13 = ((((augustus.recovered.modules.combat.AutoPot_47C1.a ^ a0) ^ 19041280951609L) << 32) >>> 32);
        net.C_47TU initialized14 = new net.C_47TU(constructorKey8, this, "PitchSpeed", Double.longBitsToDouble(4629137466983448576L), Double.longBitsToDouble(4632233691727265792L), 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$509(this, initialized14);
        client.setting.NumberSetting initialized15 = new client.setting.NumberSetting(this, "HealHearts", Double.longBitsToDouble(4624070917402656768L), constructorKey11, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4626322717216342016L), 0);
        recovery$indy$flow$512(this, initialized15);
        client.setting.BooleanSetting initialized16 = new client.setting.BooleanSetting(this, constructorKey10, "Instant", true);
        recovery$indy$flow$515(this, initialized16);
        net.C_47TU initialized17 = new net.C_47TU(constructorKey8, this, "TickDelayBeforeClick", 0.0D, 0.0D, 0.0D, Double.longBitsToDouble(4619567317775286272L), 0);
        java.lang.Object initialValue18 = recovery$indy$flow$518(this);
        long initialValue19 = constructorKey7;
        java.lang.Object initialValue20 = initialValue18;
        net.C_47TU initialValue21 = initialized17;
        java.lang.Object initialValue22 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue21))))));
        java.lang.Object initialValue23 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue20))))));
        java.lang.Object initialValue24 = recovery$indy$flow$521(initialValue22, initialValue23, initialValue19);
        recovery$indy$flow$522(this, initialValue24);
        short converted25 = (short) (constructorPart4);
        short converted26 = (short) (constructorPart5);
        client.setting.RangeSetting initialized27 = new client.setting.RangeSetting(constructorPart3, this, "TickDelayBetweenClick", 0.0D, 0.0D, converted25, 0.0D, Double.longBitsToDouble(4619567317775286272L), 0, converted26);
        long initialValue28 = constructorKey9;
        client.setting.RangeSetting initialValue29 = initialized27;
        java.lang.Object initialValue30 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue29))))));
        java.lang.Object initialValue31 = recovery$indy$flow$526(initialValue30, initialValue28);
        java.lang.Object initialValue32 = recovery$indy$flow$527(this);
        long initialValue33 = constructorKey13;
        java.lang.Object initialValue34 = initialValue32;
        int initialValue35 = constructorPart12;
        java.lang.Object initialValue36 = initialValue31;
        java.lang.Object initialValue37 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue38 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue34))))));
        java.lang.Object initialValue39 = recovery$indy$flow$530(initialValue37, initialValue35, initialValue38, initialValue33);
        recovery$indy$flow$531(this, initialValue39);
        net.C_47TU initialized40 = new net.C_47TU(constructorKey8, this, "TickDelayAfterClick", 1.0D, 1.0D, 0.0D, Double.longBitsToDouble(4619567317775286272L), 0);
        java.lang.Object initialValue41 = recovery$indy$flow$534(this);
        long initialValue42 = constructorKey7;
        java.lang.Object initialValue43 = initialValue41;
        net.C_47TU initialValue44 = initialized40;
        java.lang.Object initialValue45 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue44))))));
        java.lang.Object initialValue46 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue43))))));
        java.lang.Object initialValue47 = recovery$indy$flow$537(initialValue45, initialValue46, initialValue42);
        recovery$indy$flow$538(this, initialValue47);
        client.setting.BooleanSetting initialized48 = new client.setting.BooleanSetting(this, constructorKey10, "HotbarOnly", true);
        recovery$indy$flow$541(this, initialized48);
        client.setting.BooleanSetting initialized49 = new client.setting.BooleanSetting(this, constructorKey10, "InInv", false);
        recovery$indy$flow$544(this, initialized49);
        client.setting.BooleanSetting initialized50 = new client.setting.BooleanSetting(this, constructorKey10, "NotWhileKillAura", true);
        recovery$indy$flow$547(this, initialized50);
        java.lang.Object initialValue51 = recovery$indy$flow$549();
        client.setting.MultiSelectSetting initialized52 = new client.setting.MultiSelectSetting(this, "Potions", constructorKey6, (net.C_47OZ[]) (initialValue51));
        recovery$indy$flow$551(this, initialized52);
        net.C_47cu initialized53 = new net.C_47cu();
        recovery$indy$flow$554(this, initialized53);
        recovery$indy$flow$555(this, -1);
        recovery$indy$flow$556(this, null);
        recovery$indy$flow$557(this, null);
        recovery$indy$flow$558(this, 1);
        recovery$indy$flow$559(this, 1);
        recovery$indy$flow$560(this, 0);
        recovery$indy$flow$561(this, 0);
        recovery$indy$flow$562(this, 0);
        recovery$indy$flow$563(this, false);
        recovery$indy$flow$564(this, 0.0F);
        recovery$indy$flow$565(this, false);
        recovery$indy$flow$566(this, false);
    }





    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);
    private static native java.lang.Object recovery$indy$flow$1(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$16(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$509(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$512(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$515(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$518(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$521(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$522(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$526(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$527(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$530(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$531(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$534(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$537(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$538(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$541(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$544(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$547(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$549();
    private static native void recovery$indy$flow$551(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$554(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$555(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_43n = a1;
        return;
    }
    private static void recovery$indy$flow$556(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_40 = ((net.C_43z) (a1));
        return;
    }
    private static void recovery$indy$flow$557(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_44 = ((net.C_47rf) (a1));
        return;
    }
    private static void recovery$indy$flow$558(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$559(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$560(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$561(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$562(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$563(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$564(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_43Z = a1;
        return;
    }
    private static void recovery$indy$flow$565(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$566(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoPot_47C1) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native MethodHandle recovery$constant$3();
   private static native C_40g recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native int[] recovery$indy$7(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native int[] recovery$indy$9(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);
   private static native int[] recovery$indy$12(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);
   private static native int recovery$indy$16(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$17(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$18(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$19(Object var0, long var1, double var3, double var5, long var7, long var9);
   private static native double recovery$indy$20(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$21(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$22(Object var0, long var1, double var3, double var5, long var7, long var9);
   private static native int[] recovery$indy$23(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$24(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$25(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native double recovery$indy$27(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$28(Object var0, long var1, long var3);
   private static native boolean recovery$indy$29(Object var0, Object var1, long var2, Object var4, boolean var5, long var6, long var8);
   private static native boolean recovery$indy$30(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);
   private static native double recovery$indy$32(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$33(Object var0, long var1, long var3);
   private static native boolean recovery$indy$34(Object var0, long var1, int var3, long var4, long var6);
   private static native boolean recovery$indy$35(Object var0, Object var1, long var2, Object var4, boolean var5, long var6, long var8);
   private static native boolean recovery$indy$36(Object var0, long var1, long var3);
   private static native boolean recovery$indy$37(Object var0, long var1, int var3, long var4, long var6);
   private static native boolean recovery$indy$38(Object var0, Object var1, long var2, Object var4, boolean var5, long var6, long var8);
   private static native int[] recovery$indy$39(long var0, long var2);
   private static native C_473U recovery$indy$40(Object var0, long var1, long var3);
   private static native void recovery$indy$41(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$42(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$43(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$44(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$45(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$46(long var0, long var2);
   private static native void recovery$indy$47(Object var0, long var1, short var3, long var4, long var6);
}
