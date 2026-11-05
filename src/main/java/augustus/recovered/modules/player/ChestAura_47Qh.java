package augustus.recovered.modules.player;
import augustus.recovered.modules.combat.AntiBot_47CG;
import augustus.recovered.modules.combat.Teams_47C2;
import augustus.recovered.modules.misc.MidClick_47kc;
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
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_470;
import net.C_472n;
import net.C_475c;
import net.C_475y;
import net.C_476q;
import net.C_477r;
import net.C_478i;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47Ij;
import net.C_47K;
import net.C_47MO;
import net.minecraft.entity.Entity;
import net.C_47N;
import client.module.Module;
import net.C_47S6;
import client.setting.NumberSetting;
import net.C_47TU;
import client.setting.BooleanSetting;
import net.C_47U0;
import net.C_47UH;
import net.C_47VO;
import net.C_47cu;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.minecraft.client.Minecraft;
import net.C_47ph;
import net.C_47r0;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47sT;
import client.module.Category;
import net.C_47tU;
import net.C_47tf;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ChestAura_47Qh extends client.module.Module implements net.C_47U0,net.C_47UH,net.C_47xz,net.C_47hi,net.C_47r0 {
    private final client.setting.NumberSetting settingPreRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingYawSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingPitchSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingThroughWalls = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingThroughEntities = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingTargetNearbyCheck = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileInventoryIsFull = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyOnGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingMoveFix = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47K field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.client.multiplayer.WorldClient field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

   private boolean method_46$c792670bc2(C_47tf var1, long var2, byte var4, C_47K var5) {
      long var6 = (var2 << 8 | (long)var4 << 56 >>> 56) ^ a;
      boolean var10000 = recovery$indy$1(6029114764501844520L, var6);
      C_47Ij var9 = recovery$indy$2(field_43, 6028599811177803748L, var6)
         .method_48$10ff535342(
            recovery$indy$3(field_43, 6028134195823430072L, var6).field_48Q,
            recovery$indy$4(field_43, 6028134195823430072L, var6).field_48j + recovery$indy$5(field_43, 6028134195823430072L, var6).method_41$bc607678b6(),
            recovery$indy$6(field_43, 6028134195823430072L, var6).field_42o,
            var1.field_40,
            var1.field_41,
            var1.field_47,
            false,
            false,
            true
         );
      boolean var8 = var10000;
      C_47Ij var10 = var9;
      if (var8) {
         if (var9 == null) {
            return false;
         }

         var10 = var9;
      }

      if (var8) {
         if (var10.field_49 != C_47Az.BLOCK) {
            return false;
         }

         var10 = var9;
      }

      var10000 = var10.method_49$5730377d31().method_40$91754b766b(var5.method_43$5730377d31());
      return !var8 ? var10000 : var10000;
   }



    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native int a(long a0,long a1);

   public void method_42$0db73fbf69(long var1, C_47VO var3) {
      long var4 = var1 ^ 54058444301125L;
      long var10001 = var1 ^ 37614490548695L;
      int var6 = (int)((var1 ^ 37614490548695L) >>> 48);
      int var7 = (int)((var1 ^ 37614490548695L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      boolean var9 = recovery$indy$7(-6218309976709485628L, var1);
      boolean var10000 = recovery$indy$8(this.settingMoveFix, -6220370168149854404L, var1);
      if (!var9) {
         if (var10000) {
            return;
         }

         var10000 = recovery$indy$9(ClientGlobals.field_46, (char)var6, var7, this, (char)var8, -6221612314298107811L, var1);
      }

      if (var10000) {
         recovery$indy$11(var3, recovery$indy$10(var4, -6217342052417661302L, var1), -6220075980858196142L, var1);
      }
   }



   private boolean method_42$7c2c45e4ce(Entity var1) {
      long var2 = a ^ 28479503070419L;
      long var4 = var2 ^ 128999911030257L;
      long var6 = var2 ^ 80309007304542L;
      long var10001 = var2 ^ 108007223788815L;
      int var8 = (int)((var2 ^ 108007223788815L) >>> 48);
      int var9 = (int)((var2 ^ 108007223788815L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var2 ^ 15335479937805L;
      long var10000 = -4078640940663990554L;
      boolean var13 = AirStuck_47Q4.method_45$aae029aa0a();
      Entity var32 = var1;
      if (var13) {
         if (!(var1 instanceof EntityPlayer)) {
            return false;
         }

         var32 = var1;
      }

      long var10002 = -4078490640166855306L;
      Minecraft var14 = field_43;
      if (var32 != var14.field_42P) {
         var10001 = -4078490640166855306L;
         Minecraft var15 = field_43;
         double var33 = var15.field_42P.method_44$ee256e8a75(var1);
         long var10003 = -4071857470545058233L;
         long var16 = var11;
         NumberSetting var18 = this.settingPreRange;
         double var39;
         int var34 = (var39 = var33 - (var18.method_44$474dfaa627(var16) + 3.0)) == 0.0 ? 0 : (var39 < 0.0 ? -1 : 1);
         if (var13) {
            if (var34 >= 0) {
               return false;
            }

            var34 = (int) ((var1.method_48y$aae029aa0a()) ? 1 : 0);
         }

         if (var13) {
            if (var34 != 0) {
               return false;
            }

            short var36 = (short)var8;
            long var10005 = -4078826786308125051L;
            int var19 = var10;
            Entity var20 = var1;
            int var21 = var9;
            short var22 = var36;
            Teams_47C2 var23 = ClientGlobals.field_48.field_44Q;
            var34 = (int) ((var23.method_48$9e4267e589(var22, var21, var20, var19)) ? 1 : 0);
         }

         if (var13) {
            if (var34 != 0) {
               return false;
            }

            var10003 = -4072289738043692345L;
            Entity var24 = var1;
            long var25 = var4;
            AntiBot_47CG var27 = ClientGlobals.field_48.field_480;
            var34 = (int) ((var27.method_44$5909fdf9ee(var25, var24)) ? 1 : 0);
         }

         if (var13) {
            if (var34 != 0) {
               return false;
            }

            var34 = (int) ((ClientGlobals.field_48.field_46Z.field_43P) ? 1 : 0);
         }

         if (!var13) {
            return var34 != 0;
         }

         if (var34 != 0) {
            return true;
         }

         var10003 = -4073423794984102460L;
         long var28 = var6;
         Entity var30 = var1;
         MidClick_47kc var31 = ClientGlobals.field_48.field_46Z;
         boolean var40 = var31.method_42$8a15fc4c7b(var30, var28);
         if (!var13) {
            return var40;
         }

         if (!var40) {
            return true;
         }
      }

      return false;
   }




    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$0db73fbf69(long var1, C_47VO var3) {
      long var4 = var1 ^ 31750970979179L;
      long var10001 = var1 ^ 17588450945529L;
      int var6 = (int)((var1 ^ 17588450945529L) >>> 48);
      int var7 = (int)((var1 ^ 17588450945529L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      boolean var9 = recovery$indy$12(-5072726846463755286L, var1);
      boolean var10000 = recovery$indy$13(this.settingMoveFix, -5079247277588240622L, var1);
      if (!var9) {
         if (var10000) {
            return;
         }

         var10000 = recovery$indy$14(ClientGlobals.field_46, (char)var6, var7, this, (char)var8, -5078290876181600141L, var1);
      }

      if (var10000) {
         recovery$indy$16(var3, recovery$indy$15(var4, -5072815066440923484L, var1), -5078947591731286148L, var1);
      }
   }



   public void method_41$fae8de1664(C_475c var1) {
      net.minecraft.client.Minecraft var52;
      net.C_47cu var55;
      ChestAura_47Qh var50;
      label101: {
         label96: {
            long var2 = a ^ 66403015365408L;
            long var4 = var2 ^ 64510770763177L;
            long var6 = var2 ^ 76630226227609L;
            long var8 = var2 ^ 27620740446254L;
            long var10 = var2 ^ 39893190114986L;
            long var10001 = var2 ^ 84726979948789L;
            int var12 = (int)((var2 ^ 84726979948789L) >>> 48);
            int var13 = (int)((var2 ^ 84726979948789L) << 16 >>> 32);
            int var14 = (int)(var10001 << 48 >>> 48);
            long var10000 = -6875056891629211371L;
            boolean var15 = AirStuck_47Q4.method_45$aae029aa0a();
            char var57 = (char)var12;
            char var10004 = (char)var14;
            long var10005 = -6878672653737873025L;
            char var16 = var10004;
            ChestAura_47Qh var17 = this;
            int var18 = var13;
            char var19 = var57;
            C_47S6 var20 = ClientGlobals.field_46;
            if (var20.method_49$dc3f815dad(var19, var18, var17, var16)) {
               var10001 = -6878472492454244108L;
               Minecraft var21 = field_43;
               if (var21.field_44m == null) {
                  var50 = this;
                  if (!var15) {
                     break label101;
                  }

                  label69:
                  if (this.field_46 != null) {
                     var10001 = -6875844712309055912L;
                     Minecraft var22 = field_43;
                     C_47Ij var51 = var22.field_42Y;
                     if (var15) {
                        if (var22.field_42Y == null) {
                           break label69;
                        }

                        var10001 = -6875844712309055912L;
                        Minecraft var23 = field_43;
                        var51 = var23.field_42Y;
                     }

                     label90: {
                        if (var15) {
                           if (var51.field_49 != C_47Az.BLOCK) {
                              break label69;
                           }

                           var52 = field_43;
                           if (!var15) {
                              break label90;
                           }

                           var10001 = -6875844712309055912L;
                           Minecraft var24 = field_43;
                           var51 = var24.field_42Y;
                        }

                        if (var51.method_49$5730377d31() == null) {
                           break label69;
                        }

                        var52 = field_43;
                     }

                     var10001 = -6875676839791452967L;
                     Minecraft var25 = var52;
                     long var10002 = -6875844712309055912L;
                     Minecraft var26 = field_43;
                     C_475y var53 = var25.field_44Q.method_46$efbf73d2b1(var26.field_42Y.method_49$5730377d31()).method_48$e084f7739d();
                     var10002 = -6875676839791452967L;
                     Minecraft var27 = field_43;
                     boolean var54 = var53.equals(var27.field_44Q.method_46$efbf73d2b1(this.field_46.method_43$5730377d31()).method_48$e084f7739d());
                     if (var15) {
                        if (!var54) {
                           break label69;
                        }

                        var55 = this.field_49;
                        if (!var15) {
                           break label96;
                        }

                        C_47MO var63 = C_476q.field_48;
                        long var70 = -6878531060866399277L;
                        long var28 = var8;
                        C_47TU var30 = this.settingDelay;
                        double var68 = var30.method_41$474dfaa627(var28);
                        var10005 = -6879025109171185043L;
                        long var31 = var4;
                        C_47TU var33 = this.settingDelay;
                        double var71 = var33.method_43$474dfaa627(var31);
                        var10005 = -6875614744150504870L;
                        double var34 = var71;
                        long var36 = var6;
                        double var38 = var68;
                        C_47MO var40 = var63;
                        double var64 = var40.method_41$1e515b636c(var38, var36, var34);
                        long var10003 = -6878790548049889699L;
                        long var41 = var10;
                        double var43 = var64;
                        C_47cu var45 = var55;
                        var54 = var45.method_43$2ac7ee8710(var43, var41);
                     }

                     if (!var54) {
                        return;
                     }

                     var10002 = -6879096594070665634L;
                     byte var46 = 1;
                     C_475c var47 = var1;
                     var47.method_48$d00df7729d(var46);
                     this.field_48 = new C_47tf(
                        this.field_46.method_43$5730377d31().method_40$8abf5c6871() + 0.5,
                        this.field_46.method_43$5730377d31().method_43$8abf5c6871() + 0.5,
                        this.field_46.method_43$5730377d31().method_47$8abf5c6871() + 0.5
                     );
                     var55 = this.field_49;
                     break label96;
                  }
               }
            }

            var50 = this;
            break label101;
         }

         long var65 = -6875533713289043310L;
         C_47cu var48 = var55;
         var48.method_46$da8c82d5d4();
         return;
      }

      long var66 = -6875533713289043310L;
      C_47cu var49 = var50.field_49;
      var49.method_46$da8c82d5d4();
   }





    private void method_48$1e0b323d75(float a0,short a1,int a2,short a3) {
        long converted15;
        long computed16;
        long converted17;
        long computed18;
        long computed19;
        long computed20;
        long converted21;
        long computed22;
        long computed23;
        long computed24;
        long value25;
        long computed26;
        long computed28;
        long computed30;
        boolean value32;
        int value33;
        java.lang.Object value34;
        java.lang.Object value36;
        java.lang.Object value37;
        java.lang.Object value129;
        java.lang.Object regionValue140;
        java.lang.Object value175;
        java.lang.Object value176;
        java.lang.Object value217;
        java.lang.Object value218;
        java.lang.Object value220;
        java.lang.Object value221;
        java.lang.Object value233;
        java.lang.Object value234;
        java.lang.Object value235;
        float value236;
        double converted237;
        java.lang.Object value239;
        java.lang.Object value242;
        double value243;
        double value244;
        java.lang.Object value354;
        java.lang.Object value356;
        boolean value357;
        java.lang.Object value420;
        java.lang.Object value421;
        java.lang.Object value422;
        java.lang.Object value423;
        java.lang.Object value425;
        java.lang.Object value426;
        float value427;
        java.lang.Object value428;
        java.lang.Object value430;
        java.lang.Object value431;
        float value432;
        java.lang.Object value433;
        java.lang.Object value436;
        double value437;
        java.lang.Object value443;
        java.lang.Object value444;
        java.lang.Object value447;
        java.lang.Object value502;
        java.lang.Object regionValue512;
        java.lang.Object value564;
        java.lang.Object value565;
        java.lang.Object value620;
        java.lang.Object value621;
        java.lang.Object value623;
        java.lang.Object value624;
        java.lang.Object value625;
        java.lang.Object value626;
        java.lang.Object value628;
        java.lang.Object value629;
        java.lang.Object value630;
        java.lang.Object value631;
        java.lang.Object value632;
        net.C_47Ij initialized633;
        java.lang.Object value636;
        java.lang.Object value745;
        java.lang.Object value756;
        java.lang.Object value758;
        java.lang.Object value759;
        java.lang.Object value806;
        java.lang.Object value807;
        java.lang.Object value810;
        java.lang.Object value821;
        int value823;
        int value824;
        int regionValue836;
        int regionValue883;
        int comparison949;
        int regionValue961;
        int regionValue1037;
        int edgeValue1105;
        int value1106;
        int edgeValue1118;
        int edgeValue1129;
        int edgeValue1143;
        int regionValue1155;
        int edgeValue1167;
        int regionValue1179;
        int edgeValue1191;
        double regionValue1201;
        int regionValue1203;
        int edgeValue1216;
        int regionValue1229;
        int edgeValue1242;
        int regionValue1255;
        int edgeValue1268;
        int edgeValue1281;
        java.lang.Object value1282;
        java.lang.Object value1284;
        java.lang.Object value1285;
        int regionValue1296;
        java.lang.Object regionValue1297;
        int edgeValue1308;
        int regionValue1321;
        int edgeValue1334;
        double regionValue1345;
        int regionValue1347;
        int edgeValue1359;
        int regionValue1370;
        int edgeValue1381;
        int regionValue1392;
        int edgeValue1403;
        java.lang.Object value1404;
        java.lang.Object value1406;
        java.lang.Object value1407;
        int edgeValue1418;
        java.lang.Object value1420;
        double value1421;
        int edgeValue1434;
        double edgeValue1444;
        int edgeValue1446;
        java.lang.Object value1448;
        java.lang.Object value1450;
        boolean value1451;
        double regionValue1461;
        int regionValue1463;
        double edgeValue1473;
        int edgeValue1475;
        java.lang.Object value1476;
        double value1478;
        double computed1479;
        double value1480;
        double computed1481;
        double value1482;
        double computed1483;
        java.lang.Object value1484;
        java.lang.Object value1486;
        java.lang.Object value1488;
        java.lang.Object value1489;
        java.lang.Object value1490;
        float value1491;
        java.lang.Object value1492;
        java.lang.Object value1494;
        java.lang.Object value1495;
        java.lang.Object value1496;
        double value1497;
        double computed1498;
        double value1499;
        double computed1500;
        double value1501;
        double computed1502;
        java.lang.Object value1503;
        double converted1504;
        double converted1505;
        double converted1506;
        java.lang.Object value1507;
        java.lang.Object value1508;
        java.lang.Object value1509;
        java.lang.Object value1511;
        java.lang.Object value1512;
        net.C_47by initialized1513;
        java.lang.Object value1514;
        java.lang.Object value1515;
        double value1517;
        int value1518;
        double regionValue1526;
        int regionValue1528;
        java.lang.Object regionValue1530;
        double regionValue1532;
        int regionValue1533;
        double edgeValue1541;
        int edgeValue1543;
        double edgeValue1547;
        int value1549;
        double regionValue1557;
        int regionValue1559;
        java.lang.Object regionValue1561;
        double regionValue1563;
        int regionValue1564;
        double edgeValue1572;
        int edgeValue1574;
        java.lang.Object edgeValue1576;
        double edgeValue1578;
        int edgeValue1579;
        double regionValue1587;
        int regionValue1589;
        java.lang.Object regionValue1591;
        double regionValue1593;
        int regionValue1594;
        double edgeValue1602;
        int edgeValue1604;
        java.lang.Object edgeValue1606;
        double edgeValue1608;
        int edgeValue1609;
        java.lang.Object value1610;
        java.lang.Object value1611;
        double regionValue1619;
        int regionValue1621;
        java.lang.Object regionValue1623;
        double regionValue1625;
        int regionValue1626;
        java.lang.Object regionValue1627;
        double edgeValue1635;
        int edgeValue1637;
        java.lang.Object edgeValue1639;
        double edgeValue1641;
        int edgeValue1642;
        java.lang.Object edgeValue1643;
        java.lang.Object value1644;
        java.lang.Object value1645;
        java.lang.Object value1646;
        java.lang.Object value1647;
        java.lang.Object value1648;
        double edgeValue1656;
        int edgeValue1658;
        java.lang.Object edgeValue1660;
        double edgeValue1662;
        int edgeValue1663;
        java.lang.Object edgeValue1664;
        double regionValue1669;
        int regionValue1671;
        java.lang.Object regionValue1672;
        double regionValue1673;
        java.lang.Object regionValue1674;
        double edgeValue1679;
        int edgeValue1681;
        java.lang.Object edgeValue1682;
        double edgeValue1683;
        java.lang.Object edgeValue1684;
        java.lang.Object value1685;
        float value1686;
        float value1687;
        java.lang.Object value1688;
        double converted1689;
        double converted1690;
        double converted1691;
        java.lang.Object value1692;
        java.lang.Object value1693;
        java.lang.Object value1694;
        java.lang.Object value1695;
        boolean value1696;
        java.lang.Object regionValue1701;
        int regionValue1702;
        java.lang.Object edgeValue1708;
        int edgeValue1709;
        double regionValue1718;
        int regionValue1720;
        java.lang.Object regionValue1722;
        double regionValue1724;
        int regionValue1725;
        java.lang.Object regionValue1726;
        java.lang.Object regionValue1727;
        int regionValue1728;
        double edgeValue1737;
        int edgeValue1739;
        java.lang.Object edgeValue1741;
        double edgeValue1743;
        int edgeValue1744;
        java.lang.Object edgeValue1745;
        java.lang.Object edgeValue1746;
        int edgeValue1747;
        java.lang.Object regionValue1753;
        int regionValue1754;
        java.lang.Object edgeValue1759;
        int edgeValue1760;
        double regionValue1768;
        int regionValue1770;
        java.lang.Object regionValue1772;
        double regionValue1774;
        int regionValue1775;
        java.lang.Object regionValue1776;
        java.lang.Object regionValue1777;
        int regionValue1778;
        double edgeValue1786;
        int edgeValue1788;
        java.lang.Object edgeValue1790;
        double edgeValue1792;
        int edgeValue1793;
        java.lang.Object edgeValue1794;
        java.lang.Object edgeValue1795;
        int edgeValue1796;
        double regionValue1804;
        int regionValue1806;
        java.lang.Object regionValue1808;
        double regionValue1810;
        int regionValue1811;
        java.lang.Object regionValue1812;
        java.lang.Object regionValue1813;
        int regionValue1814;
        double edgeValue1822;
        int edgeValue1824;
        java.lang.Object edgeValue1826;
        double edgeValue1828;
        int edgeValue1829;
        java.lang.Object edgeValue1830;
        java.lang.Object edgeValue1831;
        int edgeValue1832;
        double regionValue1840;
        int regionValue1842;
        java.lang.Object regionValue1844;
        double regionValue1846;
        int regionValue1847;
        java.lang.Object regionValue1848;
        java.lang.Object regionValue1849;
        int regionValue1850;
        double edgeValue1858;
        int edgeValue1860;
        java.lang.Object edgeValue1862;
        double edgeValue1864;
        int edgeValue1865;
        java.lang.Object edgeValue1866;
        java.lang.Object edgeValue1867;
        int edgeValue1868;
        double regionValue1876;
        int regionValue1878;
        java.lang.Object regionValue1880;
        double regionValue1882;
        int regionValue1883;
        java.lang.Object regionValue1884;
        java.lang.Object regionValue1885;
        int regionValue1886;
        double edgeValue1894;
        int edgeValue1896;
        java.lang.Object edgeValue1898;
        double edgeValue1900;
        int edgeValue1901;
        java.lang.Object edgeValue1902;
        java.lang.Object edgeValue1903;
        int edgeValue1904;
        double regionValue1912;
        int regionValue1914;
        java.lang.Object regionValue1916;
        double regionValue1918;
        int regionValue1919;
        java.lang.Object regionValue1920;
        java.lang.Object regionValue1921;
        double edgeValue1929;
        int edgeValue1931;
        java.lang.Object edgeValue1933;
        double edgeValue1935;
        int edgeValue1936;
        java.lang.Object edgeValue1937;
        java.lang.Object edgeValue1938;
        double regionValue1946;
        int regionValue1948;
        java.lang.Object regionValue1950;
        double regionValue1952;
        int regionValue1953;
        java.lang.Object regionValue1954;
        java.lang.Object regionValue1955;
        double edgeValue1963;
        int edgeValue1965;
        java.lang.Object edgeValue1967;
        double edgeValue1969;
        int edgeValue1970;
        java.lang.Object edgeValue1971;
        java.lang.Object edgeValue1972;
        double regionValue1980;
        int regionValue1982;
        java.lang.Object regionValue1984;
        double regionValue1986;
        int regionValue1987;
        java.lang.Object regionValue1988;
        java.lang.Object regionValue1989;
        double edgeValue1997;
        int edgeValue1999;
        java.lang.Object edgeValue2001;
        double edgeValue2003;
        int edgeValue2004;
        java.lang.Object edgeValue2005;
        java.lang.Object edgeValue2006;
        int comparison2007;
        double edgeValue2015;
        int edgeValue2017;
        java.lang.Object edgeValue2019;
        double edgeValue2021;
        int edgeValue2022;
        java.lang.Object edgeValue2023;
        java.lang.Object edgeValue2024;
        int edgeValue2025;
        double regionValue2033;
        int regionValue2035;
        java.lang.Object regionValue2037;
        double regionValue2039;
        int regionValue2040;
        double edgeValue2048;
        int edgeValue2050;
        java.lang.Object edgeValue2052;
        double edgeValue2054;
        int edgeValue2055;
        double regionValue2063;
        int regionValue2065;
        int regionValue2068;
        java.lang.Object regionValue2069;
        java.lang.Object regionValue2070;
        double edgeValue2078;
        int edgeValue2080;
        int edgeValue2083;
        java.lang.Object edgeValue2084;
        java.lang.Object edgeValue2085;
        java.lang.Object value2086;
        java.lang.Object value2087;
        java.lang.Object value2088;
        java.lang.Object value2089;
        double regionValue2097;
        int regionValue2099;
        int regionValue2102;
        java.lang.Object regionValue2103;
        java.lang.Object regionValue2104;
        java.lang.Object regionValue2105;
        double edgeValue2113;
        int edgeValue2115;
        int edgeValue2118;
        java.lang.Object edgeValue2119;
        java.lang.Object edgeValue2120;
        java.lang.Object edgeValue2121;
        double regionValue2129;
        int regionValue2131;
        int regionValue2134;
        java.lang.Object regionValue2135;
        java.lang.Object regionValue2136;
        java.lang.Object regionValue2137;
        double edgeValue2145;
        int edgeValue2147;
        int edgeValue2150;
        java.lang.Object edgeValue2151;
        java.lang.Object edgeValue2152;
        java.lang.Object edgeValue2153;
        double regionValue2161;
        int regionValue2163;
        int regionValue2166;
        java.lang.Object regionValue2167;
        java.lang.Object regionValue2168;
        java.lang.Object regionValue2169;
        double edgeValue2177;
        int edgeValue2179;
        int edgeValue2182;
        java.lang.Object edgeValue2183;
        java.lang.Object edgeValue2184;
        java.lang.Object edgeValue2185;
        double regionValue2193;
        int regionValue2195;
        int regionValue2198;
        java.lang.Object regionValue2199;
        java.lang.Object regionValue2200;
        double edgeValue2208;
        int edgeValue2210;
        int edgeValue2213;
        java.lang.Object edgeValue2214;
        java.lang.Object edgeValue2215;
        double regionValue2223;
        int regionValue2225;
        int regionValue2228;
        java.lang.Object regionValue2229;
        java.lang.Object regionValue2230;
        double edgeValue2238;
        int edgeValue2240;
        int edgeValue2243;
        java.lang.Object edgeValue2244;
        java.lang.Object edgeValue2245;
        double regionValue2253;
        int regionValue2255;
        int regionValue2258;
        java.lang.Object regionValue2259;
        java.lang.Object regionValue2260;
        double edgeValue2268;
        int edgeValue2270;
        int edgeValue2273;
        java.lang.Object edgeValue2274;
        java.lang.Object edgeValue2275;
        double regionValue2283;
        int regionValue2285;
        int regionValue2288;
        java.lang.Object regionValue2289;
        java.lang.Object regionValue2290;
        java.lang.Object regionValue2291;
        double edgeValue2299;
        int edgeValue2301;
        int edgeValue2304;
        java.lang.Object edgeValue2305;
        java.lang.Object edgeValue2306;
        double edgeValue2315;
        int edgeValue2317;
        int edgeValue2320;
        java.lang.Object edgeValue2321;
        java.lang.Object edgeValue2322;
        java.lang.Object edgeValue2323;
        java.lang.Object value2324;
        double edgeValue2332;
        int edgeValue2334;
        int edgeValue2337;
        java.lang.Object edgeValue2338;
        java.lang.Object edgeValue2339;
        java.lang.Object edgeValue2340;
        java.lang.Object value2341;
        double value2342;
        double regionValue2350;
        int regionValue2352;
        int regionValue2355;
        java.lang.Object regionValue2356;
        double regionValue2357;
        double edgeValue2366;
        int edgeValue2368;
        int edgeValue2371;
        java.lang.Object edgeValue2372;
        double edgeValue2373;
        double regionValue2382;
        int regionValue2384;
        int regionValue2387;
        java.lang.Object regionValue2388;
        java.lang.Object regionValue2389;
        java.lang.Object regionValue2390;
        double regionValue2391;
        double edgeValue2400;
        int edgeValue2402;
        int edgeValue2405;
        java.lang.Object edgeValue2406;
        java.lang.Object edgeValue2407;
        java.lang.Object edgeValue2408;
        double edgeValue2409;
        double edgeValue2418;
        int edgeValue2420;
        java.lang.Object edgeValue2422;
        double edgeValue2424;
        int edgeValue2425;
        double regionValue2433;
        int regionValue2435;
        int regionValue2438;
        java.lang.Object regionValue2439;
        java.lang.Object regionValue2440;
        java.lang.Object regionValue2441;
        double regionValue2442;
        double edgeValue2450;
        int edgeValue2452;
        int edgeValue2455;
        java.lang.Object edgeValue2456;
        java.lang.Object edgeValue2457;
        java.lang.Object edgeValue2458;
        double edgeValue2459;
        double edgeValue2467;
        int edgeValue2469;
        java.lang.Object edgeValue2471;
        double edgeValue2473;
        int edgeValue2474;
        java.lang.Object edgeValue2475;
        java.lang.Object edgeValue2476;
        double edgeValue2484;
        int edgeValue2486;
        java.lang.Object edgeValue2488;
        double edgeValue2490;
        int edgeValue2491;
        double regionValue2499;
        int regionValue2501;
        java.lang.Object regionValue2503;
        double regionValue2505;
        int regionValue2506;
        java.lang.Object regionValue2507;
        java.lang.Object regionValue2508;
        double edgeValue2516;
        int edgeValue2518;
        java.lang.Object edgeValue2520;
        double edgeValue2522;
        int edgeValue2523;
        java.lang.Object edgeValue2524;
        java.lang.Object edgeValue2525;
        double regionValue2533;
        int regionValue2535;
        java.lang.Object regionValue2537;
        double regionValue2539;
        int regionValue2540;
        java.lang.Object regionValue2541;
        java.lang.Object regionValue2542;
        double edgeValue2550;
        int edgeValue2552;
        java.lang.Object edgeValue2554;
        double edgeValue2556;
        int edgeValue2557;
        java.lang.Object edgeValue2558;
        java.lang.Object edgeValue2559;
        java.lang.Object value2560;
        double value2561;
        double value2562;
        int comparison2563;
        double regionValue2571;
        int regionValue2573;
        java.lang.Object regionValue2575;
        double regionValue2577;
        int regionValue2578;
        java.lang.Object regionValue2579;
        java.lang.Object regionValue2580;
        double regionValue2581;
        int regionValue2582;
        double edgeValue2590;
        int edgeValue2592;
        java.lang.Object edgeValue2594;
        double edgeValue2596;
        int edgeValue2597;
        java.lang.Object edgeValue2598;
        java.lang.Object edgeValue2599;
        double edgeValue2600;
        int edgeValue2601;
        double regionValue2609;
        int regionValue2611;
        java.lang.Object regionValue2613;
        double regionValue2615;
        int regionValue2616;
        java.lang.Object regionValue2617;
        java.lang.Object regionValue2618;
        double regionValue2619;
        int regionValue2620;
        double edgeValue2628;
        int edgeValue2630;
        java.lang.Object edgeValue2632;
        double edgeValue2634;
        int edgeValue2635;
        java.lang.Object edgeValue2636;
        java.lang.Object edgeValue2637;
        double edgeValue2638;
        int edgeValue2639;
        double regionValue2647;
        int regionValue2649;
        java.lang.Object regionValue2651;
        double regionValue2653;
        int regionValue2654;
        java.lang.Object regionValue2655;
        java.lang.Object regionValue2656;
        double regionValue2657;
        double edgeValue2665;
        int edgeValue2667;
        java.lang.Object edgeValue2669;
        double edgeValue2671;
        int edgeValue2672;
        java.lang.Object edgeValue2673;
        java.lang.Object edgeValue2674;
        double edgeValue2675;
        double regionValue2683;
        int regionValue2685;
        java.lang.Object regionValue2687;
        double regionValue2689;
        int regionValue2690;
        java.lang.Object regionValue2691;
        java.lang.Object regionValue2692;
        double regionValue2693;
        double edgeValue2701;
        int edgeValue2703;
        java.lang.Object edgeValue2705;
        double edgeValue2707;
        int edgeValue2708;
        java.lang.Object edgeValue2709;
        java.lang.Object edgeValue2710;
        double edgeValue2711;
        double regionValue2719;
        int regionValue2721;
        java.lang.Object regionValue2723;
        double regionValue2725;
        int regionValue2726;
        java.lang.Object regionValue2727;
        java.lang.Object regionValue2728;
        double regionValue2729;
        double edgeValue2737;
        int edgeValue2739;
        java.lang.Object edgeValue2741;
        double edgeValue2743;
        int edgeValue2744;
        java.lang.Object edgeValue2745;
        java.lang.Object edgeValue2746;
        double edgeValue2747;
        int comparison2748;
        double edgeValue2756;
        int edgeValue2758;
        java.lang.Object edgeValue2760;
        double edgeValue2762;
        int edgeValue2763;
        java.lang.Object edgeValue2764;
        java.lang.Object edgeValue2765;
        double edgeValue2766;
        int edgeValue2767;
        double regionValue2775;
        int regionValue2777;
        java.lang.Object regionValue2779;
        double regionValue2781;
        int regionValue2782;
        java.lang.Object regionValue2783;
        java.lang.Object regionValue2784;
        double regionValue2785;
        int regionValue2786;
        double edgeValue2794;
        int edgeValue2796;
        java.lang.Object edgeValue2798;
        double edgeValue2800;
        int edgeValue2801;
        java.lang.Object edgeValue2802;
        java.lang.Object edgeValue2803;
        double edgeValue2804;
        int edgeValue2805;
        double regionValue2813;
        int regionValue2815;
        java.lang.Object regionValue2817;
        double regionValue2819;
        int regionValue2820;
        java.lang.Object regionValue2821;
        java.lang.Object regionValue2822;
        double regionValue2823;
        int regionValue2824;
        double edgeValue2832;
        int edgeValue2834;
        java.lang.Object edgeValue2836;
        double edgeValue2838;
        int edgeValue2839;
        java.lang.Object edgeValue2840;
        java.lang.Object edgeValue2841;
        double edgeValue2842;
        int edgeValue2843;
        double edgeValue2851;
        int edgeValue2853;
        java.lang.Object edgeValue2855;
        double edgeValue2857;
        int edgeValue2858;
        double regionValue2866;
        int regionValue2868;
        java.lang.Object regionValue2870;
        double regionValue2872;
        int regionValue2873;
        java.lang.Object regionValue2874;
        java.lang.Object regionValue2875;
        double regionValue2876;
        double edgeValue2884;
        int edgeValue2886;
        java.lang.Object edgeValue2888;
        double edgeValue2890;
        int edgeValue2891;
        java.lang.Object edgeValue2892;
        java.lang.Object edgeValue2893;
        double edgeValue2894;
        double edgeValue2902;
        int edgeValue2904;
        java.lang.Object edgeValue2906;
        double edgeValue2908;
        int edgeValue2909;
        java.lang.Object edgeValue2910;
        java.lang.Object edgeValue2911;
        double edgeValue2912;
        double edgeValue2920;
        int edgeValue2922;
        java.lang.Object edgeValue2924;
        double edgeValue2926;
        int edgeValue2927;
        java.lang.Object edgeValue2928;
        java.lang.Object edgeValue2929;
        double edgeValue2930;
        int edgeValue2931;
        int value2932;
        double regionValue2940;
        int regionValue2942;
        java.lang.Object regionValue2944;
        int regionValue2946;
        double regionValue2947;
        double edgeValue2955;
        int edgeValue2957;
        java.lang.Object edgeValue2959;
        int edgeValue2961;
        double edgeValue2962;
        double regionValue2970;
        int regionValue2972;
        java.lang.Object regionValue2974;
        double regionValue2976;
        int regionValue2977;
        java.lang.Object regionValue2978;
        java.lang.Object regionValue2979;
        double regionValue2980;
        int regionValue2981;
        double edgeValue2989;
        int edgeValue2991;
        java.lang.Object edgeValue2993;
        double edgeValue2995;
        int edgeValue2996;
        java.lang.Object edgeValue2997;
        java.lang.Object edgeValue2998;
        double edgeValue2999;
        int edgeValue3000;
        java.lang.Object value3001;
        double regionValue3009;
        int regionValue3011;
        int regionValue3014;
        java.lang.Object regionValue3015;
        java.lang.Object regionValue3016;
        double regionValue3017;
        double edgeValue3025;
        int edgeValue3027;
        int edgeValue3030;
        java.lang.Object edgeValue3031;
        java.lang.Object edgeValue3032;
        double edgeValue3033;
        double regionValue3041;
        int regionValue3043;
        java.lang.Object regionValue3045;
        double regionValue3047;
        int regionValue3048;
        java.lang.Object regionValue3049;
        java.lang.Object regionValue3050;
        double regionValue3051;
        int regionValue3052;
        double edgeValue3060;
        int edgeValue3062;
        java.lang.Object edgeValue3064;
        double edgeValue3066;
        int edgeValue3067;
        java.lang.Object edgeValue3068;
        java.lang.Object edgeValue3069;
        double edgeValue3070;
        int edgeValue3071;
        double regionValue3079;
        int regionValue3081;
        java.lang.Object regionValue3083;
        double regionValue3085;
        int regionValue3086;
        java.lang.Object regionValue3087;
        java.lang.Object regionValue3088;
        double regionValue3089;
        int regionValue3090;
        double edgeValue3098;
        int edgeValue3100;
        java.lang.Object edgeValue3102;
        double edgeValue3104;
        int edgeValue3105;
        java.lang.Object edgeValue3106;
        java.lang.Object edgeValue3107;
        double edgeValue3108;
        int edgeValue3109;
        double regionValue3117;
        int regionValue3119;
        java.lang.Object regionValue3121;
        double regionValue3123;
        int regionValue3124;
        java.lang.Object regionValue3125;
        java.lang.Object regionValue3126;
        double regionValue3127;
        int regionValue3128;
        double edgeValue3136;
        int edgeValue3138;
        java.lang.Object edgeValue3140;
        double edgeValue3142;
        int edgeValue3143;
        java.lang.Object edgeValue3144;
        java.lang.Object edgeValue3145;
        double edgeValue3146;
        int edgeValue3147;
        double regionValue3155;
        int regionValue3157;
        java.lang.Object regionValue3159;
        double regionValue3161;
        int regionValue3162;
        java.lang.Object regionValue3163;
        java.lang.Object regionValue3164;
        double regionValue3165;
        int regionValue3166;
        double edgeValue3174;
        int edgeValue3176;
        java.lang.Object edgeValue3178;
        double edgeValue3180;
        int edgeValue3181;
        java.lang.Object edgeValue3182;
        java.lang.Object edgeValue3183;
        double edgeValue3184;
        int edgeValue3185;
        double regionValue3193;
        int regionValue3195;
        java.lang.Object regionValue3197;
        double regionValue3199;
        int regionValue3200;
        java.lang.Object regionValue3201;
        java.lang.Object regionValue3202;
        double regionValue3203;
        int regionValue3204;
        double edgeValue3212;
        int edgeValue3214;
        java.lang.Object edgeValue3216;
        double edgeValue3218;
        int edgeValue3219;
        java.lang.Object edgeValue3220;
        java.lang.Object edgeValue3221;
        double edgeValue3222;
        int edgeValue3223;
        double edgeValue3231;
        int edgeValue3233;
        int edgeValue3236;
        java.lang.Object edgeValue3237;
        java.lang.Object edgeValue3238;
        double edgeValue3239;
        double regionValue3247;
        int regionValue3249;
        java.lang.Object regionValue3251;
        double regionValue3253;
        int regionValue3254;
        java.lang.Object regionValue3255;
        java.lang.Object regionValue3256;
        double regionValue3257;
        double edgeValue3265;
        int edgeValue3267;
        java.lang.Object edgeValue3269;
        double edgeValue3271;
        int edgeValue3272;
        java.lang.Object edgeValue3273;
        java.lang.Object edgeValue3274;
        double edgeValue3275;
        double regionValue3283;
        int regionValue3285;
        java.lang.Object regionValue3287;
        double regionValue3289;
        int regionValue3290;
        java.lang.Object regionValue3291;
        java.lang.Object regionValue3292;
        double regionValue3293;
        double edgeValue3301;
        int edgeValue3303;
        java.lang.Object edgeValue3305;
        double edgeValue3307;
        int edgeValue3308;
        java.lang.Object edgeValue3309;
        java.lang.Object edgeValue3310;
        double edgeValue3311;
        int comparison3312;
        double edgeValue3320;
        int edgeValue3322;
        java.lang.Object edgeValue3324;
        double edgeValue3326;
        int edgeValue3327;
        java.lang.Object edgeValue3328;
        java.lang.Object edgeValue3329;
        double edgeValue3330;
        int edgeValue3331;
        double edgeValue3339;
        int edgeValue3341;
        java.lang.Object edgeValue3343;
        double edgeValue3345;
        int edgeValue3346;
        double regionValue3354;
        int regionValue3356;
        double regionValue3359;
        int regionValue3360;
        java.lang.Object regionValue3361;
        java.lang.Object regionValue3362;
        double regionValue3363;
        double edgeValue3371;
        int edgeValue3373;
        double edgeValue3376;
        int edgeValue3377;
        java.lang.Object edgeValue3378;
        java.lang.Object edgeValue3379;
        double edgeValue3380;
        java.lang.Object value3381;
        java.lang.Object value3382;
        java.lang.Object value3383;
        java.lang.Object value3384;
        java.lang.Object value3385;
        java.lang.Object value3386;
        double edgeValue3394;
        int edgeValue3396;
        int edgeValue3399;
        java.lang.Object edgeValue3400;
        double edgeValue3401;
        double regionValue3410;
        int regionValue3412;
        double regionValue3415;
        int regionValue3416;
        java.lang.Object regionValue3417;
        java.lang.Object regionValue3418;
        double regionValue3419;
        java.lang.Object regionValue3420;
        double edgeValue3429;
        int edgeValue3431;
        double edgeValue3434;
        int edgeValue3435;
        java.lang.Object edgeValue3436;
        java.lang.Object edgeValue3437;
        double edgeValue3438;
        java.lang.Object edgeValue3439;
        double edgeValue3448;
        int edgeValue3450;
        java.lang.Object edgeValue3452;
        double edgeValue3454;
        int edgeValue3455;
        double regionValue3463;
        int regionValue3465;
        int regionValue3468;
        java.lang.Object regionValue3469;
        java.lang.Object regionValue3470;
        double regionValue3471;
        double edgeValue3479;
        int edgeValue3481;
        int edgeValue3484;
        java.lang.Object edgeValue3485;
        java.lang.Object edgeValue3486;
        double edgeValue3487;
        double edgeValue3495;
        int edgeValue3497;
        int edgeValue3500;
        java.lang.Object edgeValue3501;
        java.lang.Object edgeValue3502;
        double edgeValue3503;
        java.lang.Object value3504;
        java.lang.Object value3505;
        java.lang.Object value3506;
        java.lang.Object value3507;
        java.lang.Object value3508;
        java.lang.Object value3509;
        double edgeValue3517;
        int edgeValue3519;
        java.lang.Object edgeValue3521;
        int edgeValue3523;
        double edgeValue3524;
        double value3525;
        double edgeValue3533;
        int edgeValue3535;
        java.lang.Object edgeValue3537;
        double edgeValue3539;
        int edgeValue3540;
        int incremented3541;
        double edgeValue3549;
        int edgeValue3551;
        int edgeValue3554;
        java.lang.Object edgeValue3555;
        double edgeValue3556;
        double edgeValue3565;
        int edgeValue3567;
        java.lang.Object edgeValue3569;
        double edgeValue3571;
        int edgeValue3572;
        double regionValue3580;
        int regionValue3582;
        int regionValue3585;
        java.lang.Object regionValue3586;
        double regionValue3587;
        double edgeValue3595;
        int edgeValue3597;
        int edgeValue3600;
        java.lang.Object edgeValue3601;
        double edgeValue3602;
        java.lang.Object value3603;
        java.lang.Object value3604;
        java.lang.Object value3605;
        java.lang.Object value3606;
        java.lang.Object value3607;
        double edgeValue3615;
        int edgeValue3617;
        java.lang.Object edgeValue3619;
        double edgeValue3621;
        int edgeValue3622;
        java.lang.Object edgeValue3623;
        double edgeValue3628;
        int edgeValue3630;
        java.lang.Object edgeValue3631;
        double edgeValue3632;
        java.lang.Object edgeValue3633;
        double regionValue3638;
        java.lang.Object regionValue3639;
        double regionValue3640;
        java.lang.Object regionValue3641;
        double edgeValue3646;
        java.lang.Object edgeValue3647;
        double edgeValue3648;
        java.lang.Object edgeValue3649;
        double regionValue3654;
        int regionValue3656;
        java.lang.Object regionValue3657;
        double regionValue3658;
        java.lang.Object regionValue3659;
        double edgeValue3664;
        int edgeValue3666;
        java.lang.Object edgeValue3667;
        double edgeValue3668;
        java.lang.Object edgeValue3669;
        double regionValue3674;
        java.lang.Object regionValue3675;
        double regionValue3676;
        double edgeValue3681;
        java.lang.Object edgeValue3682;
        double edgeValue3683;
        double regionValue3688;
        int regionValue3690;
        java.lang.Object regionValue3691;
        double regionValue3692;
        double edgeValue3697;
        int edgeValue3699;
        java.lang.Object edgeValue3700;
        double edgeValue3701;
        double regionValue3706;
        int regionValue3708;
        java.lang.Object regionValue3709;
        double regionValue3710;
        double edgeValue3715;
        int edgeValue3717;
        java.lang.Object edgeValue3718;
        double edgeValue3719;
        double regionValue3724;
        java.lang.Object regionValue3725;
        double regionValue3726;
        int regionValue3727;
        double edgeValue3732;
        java.lang.Object edgeValue3733;
        double edgeValue3734;
        int edgeValue3735;
        double regionValue3740;
        java.lang.Object regionValue3742;
        double regionValue3743;
        int regionValue3744;
        double edgeValue3749;
        java.lang.Object edgeValue3751;
        double edgeValue3752;
        int edgeValue3753;
        double regionValue3758;
        java.lang.Object regionValue3760;
        double regionValue3761;
        int regionValue3762;
        double edgeValue3767;
        java.lang.Object edgeValue3769;
        double edgeValue3770;
        int edgeValue3771;
        double edgeValue3776;
        java.lang.Object edgeValue3777;
        double edgeValue3778;
        double regionValue3783;
        java.lang.Object regionValue3785;
        double regionValue3786;
        double edgeValue3791;
        java.lang.Object edgeValue3793;
        double edgeValue3794;
        double regionValue3799;
        java.lang.Object regionValue3801;
        double regionValue3802;
        double edgeValue3807;
        java.lang.Object edgeValue3809;
        double edgeValue3810;
        double value3811;
        int comparison3812;
        double edgeValue3817;
        java.lang.Object edgeValue3818;
        double edgeValue3819;
        double edgeValue3825;
        java.lang.Object edgeValue3826;
        double edgeValue3827;
        double regionValue3832;
        java.lang.Object regionValue3833;
        double regionValue3834;
        double edgeValue3839;
        java.lang.Object edgeValue3840;
        double edgeValue3841;
        java.lang.Object value3842;
        java.lang.Object value3844;
        java.lang.Object value3845;
        java.lang.Object value3846;
        java.lang.Object value3847;
        java.lang.Object value3848;
        net.C_478Q initialized3849;
        net.C_47Ij initialized3850;
        java.lang.Object value3853;
        double edgeValue3858;
        java.lang.Object edgeValue3859;
        double edgeValue3860;
        java.lang.Object value3861;
        java.lang.Object value3863;
        java.lang.Object value3864;
        java.lang.Object value3865;
        double edgeValue3870;
        java.lang.Object edgeValue3871;
        double edgeValue3872;
        double regionValue3878;
        java.lang.Object regionValue3879;
        double regionValue3880;
        double edgeValue3885;
        java.lang.Object edgeValue3886;
        double edgeValue3887;
        int comparison3888;
        java.lang.Object edgeValue3893;
        java.lang.Object edgeValue3899;
        int edgeValue3900;
        int regionValue3905;
        int edgeValue3909;
        java.lang.Object regionValue3914;
        int regionValue3915;
        java.lang.Object edgeValue3920;
        int edgeValue3921;
        java.lang.Object regionValue3925;
        java.lang.Object edgeValue3929;
        java.lang.Object regionValue3934;
        java.lang.Object edgeValue3939;
        java.lang.Object value3940;
        java.lang.Object regionValue3944;
        java.lang.Object regionValue3954;
        java.lang.Object edgeValue3960;
        java.lang.Object regionValue3966;
        java.lang.Object edgeValue3972;
        java.lang.Object regionValue3978;
        java.lang.Object regionValue3986;
        java.lang.Object edgeValue3991;
        java.lang.Object regionValue3996;
        java.lang.Object edgeValue4001;
        java.lang.Object value4004;
        java.lang.Object value4005;
        java.lang.Object regionValue4009;
        java.lang.Object edgeValue4013;
        java.lang.Object edgeValue4017;
        java.lang.Object value4018;
        java.lang.Object value4019;
        java.lang.Object value4021;
        java.lang.Object value4022;
        java.lang.Object value4023;
        net.C_47Ij initialized4024;
        java.lang.Object value4027;
        java.lang.Object value4028;
        java.lang.Object edgeValue4036;
        java.lang.Object regionValue4039;
        java.lang.Object edgeValue4041;
        java.lang.Object regionValue4045;
        java.lang.Object edgeValue4049;
        java.lang.Object value4050;
        java.lang.Object value4051;
        java.lang.Object value4052;
        java.lang.Object value4053;
        boolean value4054;
        int edgeValue4058;
        java.lang.Object value4069;
        java.lang.Object value4085;
        java.lang.Object value4086;
        java.lang.Object value4087;
        boolean value4088;
        java.lang.Object value4095;
        java.lang.Object value4098;
        java.lang.Object value4100;
        java.lang.Object value4101;
        java.lang.Object value4102;
        java.lang.Object value4104;
        java.lang.Object value4105;
        region852: {
        region832: {
        region827: {
        region825: {
        region814: {
        region812: {
        region809: {
        region808: {
        region796: {
        region795: {
        region794: {
        region764: {
        region762: {
        region753: {
        region751: {
        region750: {
        region748: {
        region742: {
        region741: {
        region740: {
        region739: {
        region734: {
        region733: {
        region723: {
        region686: {
        region685: {
        region678: {
        region676: {
        region675: {
        region673: {
        region670: {
        region668: {
        region667: {
        region665: {
        region483: {
        region395: {
        region393: {
        region383: {
        region382: {
        region378: {
        region365: {
        region363: {
        region362: {
        region351: {
        region348: {
        region346: {
        region343: {
        region341: {
        region340: {
        region339: {
        region338: {
        region337: {
        region335: {
        region334: {
        region332: {
        region328: {
        region326: {
        region323: {
        region311: {
        region296: {
        region295: {
        region292: {
        region290: {
        region276: {
        region275: {
        region271: {
        region269: {
        region267: {
        region265: {
        region226: {
        region224: {
        region215: {
        region213: {
        region210: {
        region208: {
        region138: {
        region136: {
        region126: {
        region124: {
        region121: {
        region92: {
        region73: {
        region71: {
        region62: {
        region59: {
        region55: {
        region53: {
        region51: {
        converted15 = (long) (a1);
        computed16 = converted15 << 48;
        converted17 = (long) (a2);
        computed18 = converted17 << 32;
        computed19 = computed18 >>> 16;
        computed20 = computed16 | computed19;
        converted21 = (long) (a3);
        computed22 = converted21 << 48;
        computed23 = computed22 >>> 48;
        computed24 = computed20 | computed23;
        value25 = recovery$indy$flow$142();
        computed26 = computed24 ^ value25;
        computed28 = computed26 ^ 30303189907072L;
        computed30 = computed26 ^ 40649685789999L;
        value32 = recovery$indy$flow$143();
        value33 = (int) ((value32 ? 1 : 0));
        value34 = recovery$indy$flow$144();
        value36 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value34))))));
        value37 = recovery$indy$flow$146(value36);
        if (value33 != 0) {
            break region59;
        } else {
            break region51;
        }
        }
        if (value37 == null) {
            break region852;
        } else {
            break region53;
        }
        }
        break region55;
        }
        break region59;
        }
        value129 = recovery$indy$flow$147();
        if (value33 != 0) {
            regionValue140 = value129;
            break region92;
        } else {
            break region62;
        }
        }
        value175 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value129))))));
        value176 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value175)))).field_44Q));
        if (value176 == null) {
            break region852;
        } else {
            break region71;
        }
        }
        break region73;
        }
        value217 = recovery$indy$flow$150();
        value218 = null;
        value220 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value217))))));
        recovery$indy$flow$152(value220, value218);
        value221 = recovery$indy$flow$153();
        regionValue140 = value221;
        break region92;
        }
        value233 = regionValue140;
        value234 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value233))))));
        value235 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value234)))).field_44K));
        value236 = recovery$indy$flow$156(value235);
        converted237 = (double) (value236);
        value239 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestAura_47Qh) (((java.lang.Object)(this)))).settingRange));
        value242 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value239))))));
        value243 = recovery$indy$flow$159(value242, computed28);
        value244 = recovery$indy$flow$160(converted237, value243);
        if (a2 <= 0) {
            break region296;
        } else {
            break region121;
        }
        }
        if (value33 != 0) {
            break region295;
        } else {
            break region124;
        }
        }
        break region126;
        }
        value354 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestAura_47Qh) (((java.lang.Object)(this)))).settingThroughWalls));
        value356 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value354))))));
        value357 = recovery$indy$flow$163(value356);
        if ((int) ((value357 ? 1 : 0)) == 0) {
            break region292;
        } else {
            break region136;
        }
        }
        break region138;
        }
        value420 = recovery$indy$flow$164();
        value421 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestAura_47Qh) (((java.lang.Object)(this)))).field_46));
        value422 = recovery$indy$flow$166(value421);
        value423 = recovery$indy$flow$167();
        value425 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value423))))));
        value426 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value425)))).field_42P));
        value427 = recovery$indy$flow$170(value426);
        value428 = recovery$indy$flow$171();
        value430 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value428))))));
        value431 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value430)))).field_42P));
        value432 = recovery$indy$flow$174(value431);
        value433 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestAura_47Qh) (((java.lang.Object)(this)))).settingRange));
        value436 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value433))))));
        value437 = recovery$indy$flow$177(value436, computed28);
        value443 = ((java.lang.Object)(((net.C_478Q) (((java.lang.Object)(value422))))));
        value444 = recovery$indy$flow$179(value443, value427, computed30, value432, value437);
        value447 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value420))))));
        recovery$indy$flow$181(value447, value444);
        if (a3 >= 0) {
            break region290;
        } else {
            break region208;
        }
        }
        break region210;
        }
        value502 = recovery$indy$flow$182();
        if (value33 != 0) {
            regionValue512 = value502;
            break region276;
        } else {
            break region213;
        }
        }
        break region215;
        }
        value564 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value502))))));
        value565 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value564)))).field_42Y));
        if (value565 == null) {
            break region271;
        } else {
            break region224;
        }
        }
        break region226;
        }
        value620 = recovery$indy$flow$185();
        value621 = recovery$indy$flow$187();
        value623 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value621))))));
        value624 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value623)))).field_42Y));
        value625 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(value624)))).field_45));
        value626 = recovery$indy$flow$191();
        value628 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value626))))));
        value629 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value628)))).field_42Y));
        value630 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(value629)))).field_40));
        value631 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestAura_47Qh) (((java.lang.Object)(this)))).field_46));
        value632 = recovery$indy$flow$196(value631);
        initialized633 = new net.C_47Ij((net.C_47tf) (value625), (net.C_484) (value630), (net.C_478Q) (value632));
        value636 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value620))))));
        recovery$indy$flow$199(value636, initialized633);
        if (a3 >= 0) {
            break region275;
        } else {
            break region265;
        }
        }
        break region267;
        }
        if (value33 == 0) {
            break region311;
        } else {
            break region269;
        }
        }
        break region271;
        }
        break region275;
        }
        value745 = recovery$indy$flow$200();
        regionValue512 = value745;
        break region276;
        }
        value756 = recovery$indy$flow$201(value37, value244, a0);
        value758 = regionValue512;
        value759 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value758))))));
        recovery$indy$flow$203(value759, value756);
        break region290;
        }
        if (value33 == 0) {
            break region311;
        } else {
            break region292;
        }
        }
        break region295;
        }
        break region296;
        }
        value806 = recovery$indy$flow$204();
        value807 = recovery$indy$flow$205(value37, value244, a0);
        value810 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value806))))));
        recovery$indy$flow$207(value810, value807);
        break region311;
        }
        value821 = recovery$indy$flow$208(value37, a0);
        value823 = 0;
        value824 = 1;
        if (a1 < 0) {
            regionValue836 = value823;
            break region341;
        } else {
            break region323;
        }
        }
        if (value33 != 0) {
            regionValue883 = value823;
            break region340;
        } else {
            break region326;
        }
        }
        break region328;
        }
        comparison949 = (java.lang.Double.isNaN(value244) || java.lang.Double.isNaN(Double.longBitsToDouble(4613937818241073152L)) ? -1 : (value244 > Double.longBitsToDouble(4613937818241073152L) ? 1 : value244 == Double.longBitsToDouble(4613937818241073152L) ? 0 : -1));
        if (a3 > 0) {
            regionValue961 = comparison949;
            break region338;
        } else {
            break region332;
        }
        }
        break region334;
        }
        if (comparison949 <= 0) {
            regionValue1037 = value823;
            break region339;
        } else {
            break region335;
        }
        }
        break region337;
        }
        edgeValue1105 = 1;
        regionValue961 = edgeValue1105;
        break region338;
        }
        value1106 = regionValue961;
        edgeValue1118 = value1106;
        regionValue1037 = edgeValue1118;
        break region339;
        }
        edgeValue1129 = regionValue1037;
        regionValue883 = edgeValue1129;
        break region340;
        }
        edgeValue1143 = regionValue883;
        regionValue836 = edgeValue1143;
        break region341;
        }
        if (a3 >= 0) {
            edgeValue1167 = regionValue836;
            regionValue1155 = edgeValue1167;
            break region351;
        } else {
            edgeValue1191 = regionValue836;
            regionValue1179 = edgeValue1191;
            break region343;
        }
        }
        if (value33 != 0) {
            edgeValue1216 = regionValue1179;
            regionValue1201 = value244;
            regionValue1203 = edgeValue1216;
            break region383;
        } else {
            edgeValue1242 = regionValue1179;
            regionValue1229 = edgeValue1242;
            break region346;
        }
        }
        edgeValue1268 = regionValue1229;
        regionValue1255 = edgeValue1268;
        break region348;
        }
        edgeValue1281 = regionValue1255;
        regionValue1155 = edgeValue1281;
        break region351;
        }
        value1282 = recovery$indy$flow$209();
        value1284 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1282))))));
        value1285 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1284)))).field_42Y));
        if (a2 < 0) {
            edgeValue1308 = regionValue1155;
            regionValue1296 = edgeValue1308;
            regionValue1297 = value1285;
            break region378;
        } else {
            edgeValue1334 = regionValue1155;
            regionValue1321 = edgeValue1334;
            break region362;
        }
        }
        if (value1285 == null) {
            edgeValue1359 = regionValue1321;
            regionValue1345 = value244;
            regionValue1347 = edgeValue1359;
            break region382;
        } else {
            edgeValue1381 = regionValue1321;
            regionValue1370 = edgeValue1381;
            break region363;
        }
        }
        edgeValue1403 = regionValue1370;
        regionValue1392 = edgeValue1403;
        break region365;
        }
        value1404 = recovery$indy$flow$212();
        value1406 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1404))))));
        value1407 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1406)))).field_42Y));
        edgeValue1418 = regionValue1392;
        regionValue1296 = edgeValue1418;
        regionValue1297 = value1407;
        break region378;
        }
        value1420 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue1297)))).field_45));
        value1421 = recovery$indy$flow$216(value1420, value821);
        edgeValue1434 = regionValue1296;
        regionValue1345 = value1421;
        regionValue1347 = edgeValue1434;
        break region382;
        }
        edgeValue1444 = regionValue1345;
        edgeValue1446 = regionValue1347;
        regionValue1201 = edgeValue1444;
        regionValue1203 = edgeValue1446;
        break region383;
        }
        value1448 = ((java.lang.Object)(((augustus.recovered.modules.player.ChestAura_47Qh) (((java.lang.Object)(this)))).settingThroughEntities));
        value1450 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value1448))))));
        value1451 = recovery$indy$flow$219(value1450);
        if ((int) ((value1451 ? 1 : 0)) == 0) {
            edgeValue1473 = regionValue1201;
            edgeValue1475 = regionValue1203;
            regionValue1461 = edgeValue1473;
            regionValue1463 = edgeValue1475;
            break region395;
        } else {
            break region393;
        }
        }
        return;
        }
        value1476 = recovery$indy$flow$220(value37, a0);
        value1478 = recovery$indy$flow$221(value1476);
        computed1479 = value1478 * value244;
        value1480 = recovery$indy$flow$222(value1476);
        computed1481 = value1480 * value244;
        value1482 = recovery$indy$flow$223(value1476);
        computed1483 = value1482 * value244;
        value1484 = recovery$indy$flow$224(value821, computed1479, computed1481, computed1483);
        value1486 = recovery$indy$flow$225();
        value1488 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1486))))));
        value1489 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1488)))).field_44a));
        recovery$indy$flow$228(value1489, null);
        value1490 = null;
        value1491 = 1.0F;
        value1492 = recovery$indy$flow$229();
        value1494 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1492))))));
        value1495 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1494)))).field_44Q));
        value1496 = recovery$indy$flow$232(value37);
        value1497 = recovery$indy$flow$233(value1476);
        computed1498 = value1497 * value244;
        value1499 = recovery$indy$flow$234(value1476);
        computed1500 = value1499 * value244;
        value1501 = recovery$indy$flow$235(value1476);
        computed1502 = value1501 * value244;
        value1503 = recovery$indy$flow$236(value1496, computed1498, computed1500, computed1502);
        converted1504 = (double) (value1491);
        converted1505 = (double) (value1491);
        converted1506 = (double) (value1491);
        value1507 = recovery$indy$flow$237(value1503, converted1504, converted1505, converted1506);
        value1508 = recovery$indy$flow$238();
        value1509 = recovery$indy$flow$240();
        value1511 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1509))))));
        value1512 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1511)))).field_44a));
        initialized1513 = new net.C_47by((net.C_46I) (value1512));
        value1514 = recovery$indy$flow$244(value1508, initialized1513);
        value1515 = recovery$indy$flow$245(value1495, value37, value1507, value1514);
        value1517 = regionValue1461;
        value1518 = 0;
        edgeValue1541 = regionValue1461;
        edgeValue1543 = regionValue1463;
        edgeValue1547 = value1517;
        regionValue1526 = edgeValue1541;
        regionValue1528 = edgeValue1543;
        regionValue1530 = value1490;
        regionValue1532 = edgeValue1547;
        regionValue1533 = value1518;
        break region483;
        }
        loop483: while (true) {
        region491: {
        region1116: {
        region487: {
        value1549 = recovery$indy$flow$246(value1515);
        if (regionValue1533 >= value1549) {
            edgeValue1572 = regionValue1526;
            edgeValue1574 = regionValue1528;
            edgeValue1576 = regionValue1530;
            edgeValue1578 = regionValue1532;
            edgeValue1579 = regionValue1533;
            regionValue1557 = edgeValue1572;
            regionValue1559 = edgeValue1574;
            regionValue1561 = edgeValue1576;
            regionValue1563 = edgeValue1578;
            regionValue1564 = edgeValue1579;
            break region1116;
        } else {
            edgeValue1602 = regionValue1526;
            edgeValue1604 = regionValue1528;
            edgeValue1606 = regionValue1530;
            edgeValue1608 = regionValue1532;
            edgeValue1609 = regionValue1533;
            regionValue1587 = edgeValue1602;
            regionValue1589 = edgeValue1604;
            regionValue1591 = edgeValue1606;
            regionValue1593 = edgeValue1608;
            regionValue1594 = edgeValue1609;
            break region487;
        }
        }
        value1610 = recovery$indy$flow$247(value1515, regionValue1594);
        value1611 = ((java.lang.Object)(((net.minecraft.entity.Entity) (((java.lang.Object)(value1610))))));
        edgeValue1635 = regionValue1587;
        edgeValue1637 = regionValue1589;
        edgeValue1639 = regionValue1591;
        edgeValue1641 = regionValue1593;
        edgeValue1642 = regionValue1594;
        edgeValue1643 = value1611;
        regionValue1619 = edgeValue1635;
        regionValue1621 = edgeValue1637;
        regionValue1623 = edgeValue1639;
        regionValue1625 = edgeValue1641;
        regionValue1626 = edgeValue1642;
        regionValue1627 = edgeValue1643;
        break region491;
        }
        value1644 = recovery$indy$flow$272();
        value1645 = value1644;
        value1646 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1645))))));
        value1647 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1646)))).field_44a));
        value1648 = ((java.lang.Object)(((net.C_46I) (((java.lang.Object)(value1647)))).field_45g));
        if (a1 < 0) {
            edgeValue1656 = regionValue1557;
            edgeValue1658 = regionValue1559;
            edgeValue1660 = regionValue1561;
            edgeValue1662 = regionValue1563;
            edgeValue1663 = regionValue1564;
            edgeValue1664 = value1648;
            regionValue1619 = edgeValue1656;
            regionValue1621 = edgeValue1658;
            regionValue1623 = edgeValue1660;
            regionValue1625 = edgeValue1662;
            regionValue1626 = edgeValue1663;
            regionValue1627 = edgeValue1664;
            break region491;
        } else {
            edgeValue1679 = regionValue1557;
            edgeValue1681 = regionValue1559;
            edgeValue1682 = regionValue1561;
            edgeValue1683 = regionValue1563;
            edgeValue1684 = value1648;
            regionValue1669 = edgeValue1679;
            regionValue1671 = edgeValue1681;
            regionValue1672 = edgeValue1682;
            regionValue1673 = edgeValue1683;
            regionValue1674 = edgeValue1684;
            break region665;
        }
        }
        loop491: while (true) {
        region653: {
        region652: {
        region650: {
        region648: {
        region634: {
        region632: {
        region631: {
        region614: {
        region613: {
        region608: {
        region606: {
        region605: {
        region603: {
        region600: {
        region598: {
        region594: {
        region591: {
        region590: {
        region588: {
        region587: {
        region585: {
        region580: {
        region578: {
        region577: {
        region567: {
        region565: {
        region563: {
        region561: {
        region560: {
        region554: {
        region553: {
        region552: {
        region549: {
        region547: {
        region546: {
        region544: {
        region530: {
        region529: {
        region524: {
        region522: {
        region521: {
        region519: {
        region517: {
        region516: {
        value1685 = regionValue1627;
        value1686 = recovery$indy$flow$249(value1685);
        value1687 = value1686;
        value1688 = recovery$indy$flow$250(value1685);
        converted1689 = (double) (value1687);
        converted1690 = (double) (value1687);
        converted1691 = (double) (value1687);
        value1692 = recovery$indy$flow$251(value1688, converted1689, converted1690, converted1691);
        value1693 = value1692;
        value1694 = recovery$indy$flow$252(value1693, value821, value1484);
        value1695 = value1694;
        value1696 = recovery$indy$flow$253(value1693, value821);
        if (a2 <= 0) {
            edgeValue1708 = regionValue1623;
            edgeValue1709 = (int) ((value1696 ? 1 : 0));
            regionValue1701 = edgeValue1708;
            regionValue1702 = edgeValue1709;
            break region740;
        } else {
            edgeValue1737 = regionValue1619;
            edgeValue1739 = regionValue1621;
            edgeValue1741 = regionValue1623;
            edgeValue1743 = regionValue1625;
            edgeValue1744 = regionValue1626;
            edgeValue1745 = value1685;
            edgeValue1746 = value1695;
            edgeValue1747 = (int) ((value1696 ? 1 : 0));
            regionValue1718 = edgeValue1737;
            regionValue1720 = edgeValue1739;
            regionValue1722 = edgeValue1741;
            regionValue1724 = edgeValue1743;
            regionValue1725 = edgeValue1744;
            regionValue1726 = edgeValue1745;
            regionValue1727 = edgeValue1746;
            regionValue1728 = edgeValue1747;
            break region516;
        }
        }
        if (value33 != 0) {
            edgeValue1759 = regionValue1722;
            edgeValue1760 = regionValue1728;
            regionValue1753 = edgeValue1759;
            regionValue1754 = edgeValue1760;
            break region739;
        } else {
            edgeValue1786 = regionValue1718;
            edgeValue1788 = regionValue1720;
            edgeValue1790 = regionValue1722;
            edgeValue1792 = regionValue1724;
            edgeValue1793 = regionValue1725;
            edgeValue1794 = regionValue1726;
            edgeValue1795 = regionValue1727;
            edgeValue1796 = regionValue1728;
            regionValue1768 = edgeValue1786;
            regionValue1770 = edgeValue1788;
            regionValue1772 = edgeValue1790;
            regionValue1774 = edgeValue1792;
            regionValue1775 = edgeValue1793;
            regionValue1776 = edgeValue1794;
            regionValue1777 = edgeValue1795;
            regionValue1778 = edgeValue1796;
            break region517;
        }
        }
        if (value33 != 0) {
            edgeValue1822 = regionValue1768;
            edgeValue1824 = regionValue1770;
            edgeValue1826 = regionValue1772;
            edgeValue1828 = regionValue1774;
            edgeValue1829 = regionValue1775;
            edgeValue1830 = regionValue1776;
            edgeValue1831 = regionValue1777;
            edgeValue1832 = regionValue1778;
            regionValue1804 = edgeValue1822;
            regionValue1806 = edgeValue1824;
            regionValue1808 = edgeValue1826;
            regionValue1810 = edgeValue1828;
            regionValue1811 = edgeValue1829;
            regionValue1812 = edgeValue1830;
            regionValue1813 = edgeValue1831;
            regionValue1814 = edgeValue1832;
            break region529;
        } else {
            edgeValue1858 = regionValue1768;
            edgeValue1860 = regionValue1770;
            edgeValue1862 = regionValue1772;
            edgeValue1864 = regionValue1774;
            edgeValue1865 = regionValue1775;
            edgeValue1866 = regionValue1776;
            edgeValue1867 = regionValue1777;
            edgeValue1868 = regionValue1778;
            regionValue1840 = edgeValue1858;
            regionValue1842 = edgeValue1860;
            regionValue1844 = edgeValue1862;
            regionValue1846 = edgeValue1864;
            regionValue1847 = edgeValue1865;
            regionValue1848 = edgeValue1866;
            regionValue1849 = edgeValue1867;
            regionValue1850 = edgeValue1868;
            break region519;
        }
        }
        edgeValue1894 = regionValue1840;
        edgeValue1896 = regionValue1842;
        edgeValue1898 = regionValue1844;
        edgeValue1900 = regionValue1846;
        edgeValue1901 = regionValue1847;
        edgeValue1902 = regionValue1848;
        edgeValue1903 = regionValue1849;
        edgeValue1904 = regionValue1850;
        regionValue1876 = edgeValue1894;
        regionValue1878 = edgeValue1896;
        regionValue1880 = edgeValue1898;
        regionValue1882 = edgeValue1900;
        regionValue1883 = edgeValue1901;
        regionValue1884 = edgeValue1902;
        regionValue1885 = edgeValue1903;
        regionValue1886 = edgeValue1904;
        break region521;
        }
        if (regionValue1886 == 0) {
            edgeValue1929 = regionValue1876;
            edgeValue1931 = regionValue1878;
            edgeValue1933 = regionValue1880;
            edgeValue1935 = regionValue1882;
            edgeValue1936 = regionValue1883;
            edgeValue1937 = regionValue1884;
            edgeValue1938 = regionValue1885;
            regionValue1912 = edgeValue1929;
            regionValue1914 = edgeValue1931;
            regionValue1916 = edgeValue1933;
            regionValue1918 = edgeValue1935;
            regionValue1919 = edgeValue1936;
            regionValue1920 = edgeValue1937;
            regionValue1921 = edgeValue1938;
            break region563;
        } else {
            edgeValue1963 = regionValue1876;
            edgeValue1965 = regionValue1878;
            edgeValue1967 = regionValue1880;
            edgeValue1969 = regionValue1882;
            edgeValue1970 = regionValue1883;
            edgeValue1971 = regionValue1884;
            edgeValue1972 = regionValue1885;
            regionValue1946 = edgeValue1963;
            regionValue1948 = edgeValue1965;
            regionValue1950 = edgeValue1967;
            regionValue1952 = edgeValue1969;
            regionValue1953 = edgeValue1970;
            regionValue1954 = edgeValue1971;
            regionValue1955 = edgeValue1972;
            break region522;
        }
        }
        edgeValue1997 = regionValue1946;
        edgeValue1999 = regionValue1948;
        edgeValue2001 = regionValue1950;
        edgeValue2003 = regionValue1952;
        edgeValue2004 = regionValue1953;
        edgeValue2005 = regionValue1954;
        edgeValue2006 = regionValue1955;
        regionValue1980 = edgeValue1997;
        regionValue1982 = edgeValue1999;
        regionValue1984 = edgeValue2001;
        regionValue1986 = edgeValue2003;
        regionValue1987 = edgeValue2004;
        regionValue1988 = edgeValue2005;
        regionValue1989 = edgeValue2006;
        break region524;
        }
        comparison2007 = (java.lang.Double.isNaN(regionValue1986) || java.lang.Double.isNaN(0.0D) ? -1 : (regionValue1986 > 0.0D ? 1 : regionValue1986 == 0.0D ? 0 : -1));
        edgeValue2015 = regionValue1980;
        edgeValue2017 = regionValue1982;
        edgeValue2019 = regionValue1984;
        edgeValue2021 = regionValue1986;
        edgeValue2022 = regionValue1987;
        edgeValue2023 = regionValue1988;
        edgeValue2024 = regionValue1989;
        edgeValue2025 = comparison2007;
        regionValue1804 = edgeValue2015;
        regionValue1806 = edgeValue2017;
        regionValue1808 = edgeValue2019;
        regionValue1810 = edgeValue2021;
        regionValue1811 = edgeValue2022;
        regionValue1812 = edgeValue2023;
        regionValue1813 = edgeValue2024;
        regionValue1814 = edgeValue2025;
        break region529;
        }
        if (regionValue1814 < 0) {
            edgeValue2048 = regionValue1804;
            edgeValue2050 = regionValue1806;
            edgeValue2052 = regionValue1808;
            edgeValue2054 = regionValue1810;
            edgeValue2055 = regionValue1811;
            regionValue2033 = edgeValue2048;
            regionValue2035 = edgeValue2050;
            regionValue2037 = edgeValue2052;
            regionValue2039 = edgeValue2054;
            regionValue2040 = edgeValue2055;
            break region650;
        } else {
            edgeValue2078 = regionValue1804;
            edgeValue2080 = regionValue1806;
            edgeValue2083 = regionValue1811;
            edgeValue2084 = regionValue1812;
            edgeValue2085 = regionValue1813;
            regionValue2063 = edgeValue2078;
            regionValue2065 = edgeValue2080;
            regionValue2068 = edgeValue2083;
            regionValue2069 = edgeValue2084;
            regionValue2070 = edgeValue2085;
            break region530;
        }
        }
        value2086 = recovery$indy$flow$254();
        value2087 = value2086;
        value2088 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2087))))));
        value2089 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2088)))).field_44a));
        recovery$indy$flow$257(value2089, regionValue2069);
        if (value33 != 0) {
            edgeValue2113 = regionValue2063;
            edgeValue2115 = regionValue2065;
            edgeValue2118 = regionValue2068;
            edgeValue2119 = regionValue2069;
            edgeValue2120 = regionValue2070;
            edgeValue2121 = regionValue2070;
            regionValue2097 = edgeValue2113;
            regionValue2099 = edgeValue2115;
            regionValue2102 = edgeValue2118;
            regionValue2103 = edgeValue2119;
            regionValue2104 = edgeValue2120;
            regionValue2105 = edgeValue2121;
            break region553;
        } else {
            edgeValue2145 = regionValue2063;
            edgeValue2147 = regionValue2065;
            edgeValue2150 = regionValue2068;
            edgeValue2151 = regionValue2069;
            edgeValue2152 = regionValue2070;
            edgeValue2153 = regionValue2070;
            regionValue2129 = edgeValue2145;
            regionValue2131 = edgeValue2147;
            regionValue2134 = edgeValue2150;
            regionValue2135 = edgeValue2151;
            regionValue2136 = edgeValue2152;
            regionValue2137 = edgeValue2153;
            break region544;
        }
        }
        edgeValue2177 = regionValue2129;
        edgeValue2179 = regionValue2131;
        edgeValue2182 = regionValue2134;
        edgeValue2183 = regionValue2135;
        edgeValue2184 = regionValue2136;
        edgeValue2185 = regionValue2137;
        regionValue2161 = edgeValue2177;
        regionValue2163 = edgeValue2179;
        regionValue2166 = edgeValue2182;
        regionValue2167 = edgeValue2183;
        regionValue2168 = edgeValue2184;
        regionValue2169 = edgeValue2185;
        break region546;
        }
        if (regionValue2169 != null) {
            edgeValue2208 = regionValue2161;
            edgeValue2210 = regionValue2163;
            edgeValue2213 = regionValue2166;
            edgeValue2214 = regionValue2167;
            edgeValue2215 = regionValue2168;
            regionValue2193 = edgeValue2208;
            regionValue2195 = edgeValue2210;
            regionValue2198 = edgeValue2213;
            regionValue2199 = edgeValue2214;
            regionValue2200 = edgeValue2215;
            break region552;
        } else {
            edgeValue2238 = regionValue2161;
            edgeValue2240 = regionValue2163;
            edgeValue2243 = regionValue2166;
            edgeValue2244 = regionValue2167;
            edgeValue2245 = regionValue2168;
            regionValue2223 = edgeValue2238;
            regionValue2225 = edgeValue2240;
            regionValue2228 = edgeValue2243;
            regionValue2229 = edgeValue2244;
            regionValue2230 = edgeValue2245;
            break region547;
        }
        }
        edgeValue2268 = regionValue2223;
        edgeValue2270 = regionValue2225;
        edgeValue2273 = regionValue2228;
        edgeValue2274 = regionValue2229;
        edgeValue2275 = regionValue2230;
        regionValue2253 = edgeValue2268;
        regionValue2255 = edgeValue2270;
        regionValue2258 = edgeValue2273;
        regionValue2259 = edgeValue2274;
        regionValue2260 = edgeValue2275;
        break region549;
        }
        edgeValue2299 = regionValue2253;
        edgeValue2301 = regionValue2255;
        edgeValue2304 = regionValue2258;
        edgeValue2305 = regionValue2259;
        edgeValue2306 = regionValue2260;
        regionValue2283 = edgeValue2299;
        regionValue2285 = edgeValue2301;
        regionValue2288 = edgeValue2304;
        regionValue2289 = edgeValue2305;
        regionValue2290 = edgeValue2306;
        regionValue2291 = value821;
        break region554;
        }
        edgeValue2315 = regionValue2193;
        edgeValue2317 = regionValue2195;
        edgeValue2320 = regionValue2198;
        edgeValue2321 = regionValue2199;
        edgeValue2322 = regionValue2200;
        edgeValue2323 = regionValue2200;
        regionValue2097 = edgeValue2315;
        regionValue2099 = edgeValue2317;
        regionValue2102 = edgeValue2320;
        regionValue2103 = edgeValue2321;
        regionValue2104 = edgeValue2322;
        regionValue2105 = edgeValue2323;
        break region553;
        }
        value2324 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue2105)))).field_45));
        edgeValue2332 = regionValue2097;
        edgeValue2334 = regionValue2099;
        edgeValue2337 = regionValue2102;
        edgeValue2338 = regionValue2103;
        edgeValue2339 = regionValue2104;
        edgeValue2340 = value2324;
        regionValue2283 = edgeValue2332;
        regionValue2285 = edgeValue2334;
        regionValue2288 = edgeValue2337;
        regionValue2289 = edgeValue2338;
        regionValue2290 = edgeValue2339;
        regionValue2291 = edgeValue2340;
        break region554;
        }
        value2341 = regionValue2291;
        value2342 = 0.0D;
        if (a2 < 0) {
            edgeValue2366 = regionValue2283;
            edgeValue2368 = regionValue2285;
            edgeValue2371 = regionValue2288;
            edgeValue2372 = value2341;
            edgeValue2373 = value2342;
            regionValue2350 = edgeValue2366;
            regionValue2352 = edgeValue2368;
            regionValue2355 = edgeValue2371;
            regionValue2356 = edgeValue2372;
            regionValue2357 = edgeValue2373;
            break region652;
        } else {
            edgeValue2400 = regionValue2283;
            edgeValue2402 = regionValue2285;
            edgeValue2405 = regionValue2288;
            edgeValue2406 = regionValue2289;
            edgeValue2407 = regionValue2290;
            edgeValue2408 = value2341;
            edgeValue2409 = value2342;
            regionValue2382 = edgeValue2400;
            regionValue2384 = edgeValue2402;
            regionValue2387 = edgeValue2405;
            regionValue2388 = edgeValue2406;
            regionValue2389 = edgeValue2407;
            regionValue2390 = edgeValue2408;
            regionValue2391 = edgeValue2409;
            break region560;
        }
        }
        if (value33 == 0) {
            edgeValue2418 = regionValue2382;
            edgeValue2420 = regionValue2384;
            edgeValue2422 = regionValue2390;
            edgeValue2424 = regionValue2391;
            edgeValue2425 = regionValue2387;
            regionValue2033 = edgeValue2418;
            regionValue2035 = edgeValue2420;
            regionValue2037 = edgeValue2422;
            regionValue2039 = edgeValue2424;
            regionValue2040 = edgeValue2425;
            break region650;
        } else {
            edgeValue2450 = regionValue2382;
            edgeValue2452 = regionValue2384;
            edgeValue2455 = regionValue2387;
            edgeValue2456 = regionValue2388;
            edgeValue2457 = regionValue2389;
            edgeValue2458 = regionValue2390;
            edgeValue2459 = regionValue2391;
            regionValue2433 = edgeValue2450;
            regionValue2435 = edgeValue2452;
            regionValue2438 = edgeValue2455;
            regionValue2439 = edgeValue2456;
            regionValue2440 = edgeValue2457;
            regionValue2441 = edgeValue2458;
            regionValue2442 = edgeValue2459;
            break region561;
        }
        }
        edgeValue2467 = regionValue2433;
        edgeValue2469 = regionValue2435;
        edgeValue2471 = regionValue2441;
        edgeValue2473 = regionValue2442;
        edgeValue2474 = regionValue2438;
        edgeValue2475 = regionValue2439;
        edgeValue2476 = regionValue2440;
        regionValue1912 = edgeValue2467;
        regionValue1914 = edgeValue2469;
        regionValue1916 = edgeValue2471;
        regionValue1918 = edgeValue2473;
        regionValue1919 = edgeValue2474;
        regionValue1920 = edgeValue2475;
        regionValue1921 = edgeValue2476;
        break region563;
        }
        if (regionValue1921 == null) {
            edgeValue2484 = regionValue1912;
            edgeValue2486 = regionValue1914;
            edgeValue2488 = regionValue1916;
            edgeValue2490 = regionValue1918;
            edgeValue2491 = regionValue1919;
            regionValue2033 = edgeValue2484;
            regionValue2035 = edgeValue2486;
            regionValue2037 = edgeValue2488;
            regionValue2039 = edgeValue2490;
            regionValue2040 = edgeValue2491;
            break region650;
        } else {
            edgeValue2516 = regionValue1912;
            edgeValue2518 = regionValue1914;
            edgeValue2520 = regionValue1916;
            edgeValue2522 = regionValue1918;
            edgeValue2523 = regionValue1919;
            edgeValue2524 = regionValue1920;
            edgeValue2525 = regionValue1921;
            regionValue2499 = edgeValue2516;
            regionValue2501 = edgeValue2518;
            regionValue2503 = edgeValue2520;
            regionValue2505 = edgeValue2522;
            regionValue2506 = edgeValue2523;
            regionValue2507 = edgeValue2524;
            regionValue2508 = edgeValue2525;
            break region565;
        }
        }
        edgeValue2550 = regionValue2499;
        edgeValue2552 = regionValue2501;
        edgeValue2554 = regionValue2503;
        edgeValue2556 = regionValue2505;
        edgeValue2557 = regionValue2506;
        edgeValue2558 = regionValue2507;
        edgeValue2559 = regionValue2508;
        regionValue2533 = edgeValue2550;
        regionValue2535 = edgeValue2552;
        regionValue2537 = edgeValue2554;
        regionValue2539 = edgeValue2556;
        regionValue2540 = edgeValue2557;
        regionValue2541 = edgeValue2558;
        regionValue2542 = edgeValue2559;
        break region567;
        }
        value2560 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue2542)))).field_45));
        value2561 = recovery$indy$flow$260(value821, value2560);
        value2562 = value2561;
        comparison2563 = (java.lang.Double.isNaN(value2562) || java.lang.Double.isNaN(regionValue2539) ? 1 : (value2562 > regionValue2539 ? 1 : value2562 == regionValue2539 ? 0 : -1));
        if (value33 != 0) {
            edgeValue2590 = regionValue2533;
            edgeValue2592 = regionValue2535;
            edgeValue2594 = regionValue2537;
            edgeValue2596 = regionValue2539;
            edgeValue2597 = regionValue2540;
            edgeValue2598 = regionValue2541;
            edgeValue2599 = regionValue2542;
            edgeValue2600 = value2562;
            edgeValue2601 = comparison2563;
            regionValue2571 = edgeValue2590;
            regionValue2573 = edgeValue2592;
            regionValue2575 = edgeValue2594;
            regionValue2577 = edgeValue2596;
            regionValue2578 = edgeValue2597;
            regionValue2579 = edgeValue2598;
            regionValue2580 = edgeValue2599;
            regionValue2581 = edgeValue2600;
            regionValue2582 = edgeValue2601;
            break region591;
        } else {
            edgeValue2628 = regionValue2533;
            edgeValue2630 = regionValue2535;
            edgeValue2632 = regionValue2537;
            edgeValue2634 = regionValue2539;
            edgeValue2635 = regionValue2540;
            edgeValue2636 = regionValue2541;
            edgeValue2637 = regionValue2542;
            edgeValue2638 = value2562;
            edgeValue2639 = comparison2563;
            regionValue2609 = edgeValue2628;
            regionValue2611 = edgeValue2630;
            regionValue2613 = edgeValue2632;
            regionValue2615 = edgeValue2634;
            regionValue2616 = edgeValue2635;
            regionValue2617 = edgeValue2636;
            regionValue2618 = edgeValue2637;
            regionValue2619 = edgeValue2638;
            regionValue2620 = edgeValue2639;
            break region577;
        }
        }
        if (regionValue2620 < 0) {
            edgeValue2665 = regionValue2609;
            edgeValue2667 = regionValue2611;
            edgeValue2669 = regionValue2613;
            edgeValue2671 = regionValue2615;
            edgeValue2672 = regionValue2616;
            edgeValue2673 = regionValue2617;
            edgeValue2674 = regionValue2618;
            edgeValue2675 = regionValue2619;
            regionValue2647 = edgeValue2665;
            regionValue2649 = edgeValue2667;
            regionValue2651 = edgeValue2669;
            regionValue2653 = edgeValue2671;
            regionValue2654 = edgeValue2672;
            regionValue2655 = edgeValue2673;
            regionValue2656 = edgeValue2674;
            regionValue2657 = edgeValue2675;
            break region590;
        } else {
            edgeValue2701 = regionValue2609;
            edgeValue2703 = regionValue2611;
            edgeValue2705 = regionValue2613;
            edgeValue2707 = regionValue2615;
            edgeValue2708 = regionValue2616;
            edgeValue2709 = regionValue2617;
            edgeValue2710 = regionValue2618;
            edgeValue2711 = regionValue2619;
            regionValue2683 = edgeValue2701;
            regionValue2685 = edgeValue2703;
            regionValue2687 = edgeValue2705;
            regionValue2689 = edgeValue2707;
            regionValue2690 = edgeValue2708;
            regionValue2691 = edgeValue2709;
            regionValue2692 = edgeValue2710;
            regionValue2693 = edgeValue2711;
            break region578;
        }
        }
        edgeValue2737 = regionValue2683;
        edgeValue2739 = regionValue2685;
        edgeValue2741 = regionValue2687;
        edgeValue2743 = regionValue2689;
        edgeValue2744 = regionValue2690;
        edgeValue2745 = regionValue2691;
        edgeValue2746 = regionValue2692;
        edgeValue2747 = regionValue2693;
        regionValue2719 = edgeValue2737;
        regionValue2721 = edgeValue2739;
        regionValue2723 = edgeValue2741;
        regionValue2725 = edgeValue2743;
        regionValue2726 = edgeValue2744;
        regionValue2727 = edgeValue2745;
        regionValue2728 = edgeValue2746;
        regionValue2729 = edgeValue2747;
        break region580;
        }
        comparison2748 = (java.lang.Double.isNaN(regionValue2725) || java.lang.Double.isNaN(0.0D) ? -1 : (regionValue2725 > 0.0D ? 1 : regionValue2725 == 0.0D ? 0 : -1));
        if (value33 != 0) {
            edgeValue2756 = regionValue2719;
            edgeValue2758 = regionValue2721;
            edgeValue2760 = regionValue2723;
            edgeValue2762 = regionValue2725;
            edgeValue2763 = regionValue2726;
            edgeValue2764 = regionValue2727;
            edgeValue2765 = regionValue2728;
            edgeValue2766 = regionValue2729;
            edgeValue2767 = comparison2748;
            regionValue2571 = edgeValue2756;
            regionValue2573 = edgeValue2758;
            regionValue2575 = edgeValue2760;
            regionValue2577 = edgeValue2762;
            regionValue2578 = edgeValue2763;
            regionValue2579 = edgeValue2764;
            regionValue2580 = edgeValue2765;
            regionValue2581 = edgeValue2766;
            regionValue2582 = edgeValue2767;
            break region591;
        } else {
            edgeValue2794 = regionValue2719;
            edgeValue2796 = regionValue2721;
            edgeValue2798 = regionValue2723;
            edgeValue2800 = regionValue2725;
            edgeValue2801 = regionValue2726;
            edgeValue2802 = regionValue2727;
            edgeValue2803 = regionValue2728;
            edgeValue2804 = regionValue2729;
            edgeValue2805 = comparison2748;
            regionValue2775 = edgeValue2794;
            regionValue2777 = edgeValue2796;
            regionValue2779 = edgeValue2798;
            regionValue2781 = edgeValue2800;
            regionValue2782 = edgeValue2801;
            regionValue2783 = edgeValue2802;
            regionValue2784 = edgeValue2803;
            regionValue2785 = edgeValue2804;
            regionValue2786 = edgeValue2805;
            break region585;
        }
        }
        edgeValue2832 = regionValue2775;
        edgeValue2834 = regionValue2777;
        edgeValue2836 = regionValue2779;
        edgeValue2838 = regionValue2781;
        edgeValue2839 = regionValue2782;
        edgeValue2840 = regionValue2783;
        edgeValue2841 = regionValue2784;
        edgeValue2842 = regionValue2785;
        edgeValue2843 = regionValue2786;
        regionValue2813 = edgeValue2832;
        regionValue2815 = edgeValue2834;
        regionValue2817 = edgeValue2836;
        regionValue2819 = edgeValue2838;
        regionValue2820 = edgeValue2839;
        regionValue2821 = edgeValue2840;
        regionValue2822 = edgeValue2841;
        regionValue2823 = edgeValue2842;
        regionValue2824 = edgeValue2843;
        break region587;
        }
        if (regionValue2824 != 0) {
            edgeValue2851 = regionValue2813;
            edgeValue2853 = regionValue2815;
            edgeValue2855 = regionValue2817;
            edgeValue2857 = regionValue2819;
            edgeValue2858 = regionValue2820;
            regionValue2033 = edgeValue2851;
            regionValue2035 = edgeValue2853;
            regionValue2037 = edgeValue2855;
            regionValue2039 = edgeValue2857;
            regionValue2040 = edgeValue2858;
            break region650;
        } else {
            edgeValue2884 = regionValue2813;
            edgeValue2886 = regionValue2815;
            edgeValue2888 = regionValue2817;
            edgeValue2890 = regionValue2819;
            edgeValue2891 = regionValue2820;
            edgeValue2892 = regionValue2821;
            edgeValue2893 = regionValue2822;
            edgeValue2894 = regionValue2823;
            regionValue2866 = edgeValue2884;
            regionValue2868 = edgeValue2886;
            regionValue2870 = edgeValue2888;
            regionValue2872 = edgeValue2890;
            regionValue2873 = edgeValue2891;
            regionValue2874 = edgeValue2892;
            regionValue2875 = edgeValue2893;
            regionValue2876 = edgeValue2894;
            break region588;
        }
        }
        edgeValue2902 = regionValue2866;
        edgeValue2904 = regionValue2868;
        edgeValue2906 = regionValue2870;
        edgeValue2908 = regionValue2872;
        edgeValue2909 = regionValue2873;
        edgeValue2910 = regionValue2874;
        edgeValue2911 = regionValue2875;
        edgeValue2912 = regionValue2876;
        regionValue2647 = edgeValue2902;
        regionValue2649 = edgeValue2904;
        regionValue2651 = edgeValue2906;
        regionValue2653 = edgeValue2908;
        regionValue2654 = edgeValue2909;
        regionValue2655 = edgeValue2910;
        regionValue2656 = edgeValue2911;
        regionValue2657 = edgeValue2912;
        break region590;
        }
        edgeValue2920 = regionValue2647;
        edgeValue2922 = regionValue2649;
        edgeValue2924 = regionValue2651;
        edgeValue2926 = regionValue2653;
        edgeValue2927 = regionValue2654;
        edgeValue2928 = regionValue2655;
        edgeValue2929 = regionValue2656;
        edgeValue2930 = regionValue2657;
        edgeValue2931 = 0;
        regionValue2571 = edgeValue2920;
        regionValue2573 = edgeValue2922;
        regionValue2575 = edgeValue2924;
        regionValue2577 = edgeValue2926;
        regionValue2578 = edgeValue2927;
        regionValue2579 = edgeValue2928;
        regionValue2580 = edgeValue2929;
        regionValue2581 = edgeValue2930;
        regionValue2582 = edgeValue2931;
        break region591;
        }
        value2932 = regionValue2582;
        if (value33 != 0) {
            edgeValue2955 = regionValue2571;
            edgeValue2957 = regionValue2573;
            edgeValue2959 = regionValue2575;
            edgeValue2961 = regionValue2578;
            edgeValue2962 = regionValue2581;
            regionValue2940 = edgeValue2955;
            regionValue2942 = edgeValue2957;
            regionValue2944 = edgeValue2959;
            regionValue2946 = edgeValue2961;
            regionValue2947 = edgeValue2962;
            break region648;
        } else {
            edgeValue2989 = regionValue2571;
            edgeValue2991 = regionValue2573;
            edgeValue2993 = regionValue2575;
            edgeValue2995 = regionValue2577;
            edgeValue2996 = regionValue2578;
            edgeValue2997 = regionValue2579;
            edgeValue2998 = regionValue2580;
            edgeValue2999 = regionValue2581;
            edgeValue3000 = value2932;
            regionValue2970 = edgeValue2989;
            regionValue2972 = edgeValue2991;
            regionValue2974 = edgeValue2993;
            regionValue2976 = edgeValue2995;
            regionValue2977 = edgeValue2996;
            regionValue2978 = edgeValue2997;
            regionValue2979 = edgeValue2998;
            regionValue2980 = edgeValue2999;
            regionValue2981 = edgeValue3000;
            break region594;
        }
        }
        value3001 = ((java.lang.Object)(((net.minecraft.entity.Entity) (((java.lang.Object)(value37)))).field_48S));
        if (((java.lang.Object) regionValue2978) != ((java.lang.Object) value3001)) {
            edgeValue3025 = regionValue2970;
            edgeValue3027 = regionValue2972;
            edgeValue3030 = regionValue2977;
            edgeValue3031 = regionValue2978;
            edgeValue3032 = regionValue2979;
            edgeValue3033 = regionValue2980;
            regionValue3009 = edgeValue3025;
            regionValue3011 = edgeValue3027;
            regionValue3014 = edgeValue3030;
            regionValue3015 = edgeValue3031;
            regionValue3016 = edgeValue3032;
            regionValue3017 = edgeValue3033;
            break region634;
        } else {
            edgeValue3060 = regionValue2970;
            edgeValue3062 = regionValue2972;
            edgeValue3064 = regionValue2974;
            edgeValue3066 = regionValue2976;
            edgeValue3067 = regionValue2977;
            edgeValue3068 = regionValue2978;
            edgeValue3069 = regionValue2979;
            edgeValue3070 = regionValue2980;
            edgeValue3071 = regionValue2981;
            regionValue3041 = edgeValue3060;
            regionValue3043 = edgeValue3062;
            regionValue3045 = edgeValue3064;
            regionValue3047 = edgeValue3066;
            regionValue3048 = edgeValue3067;
            regionValue3049 = edgeValue3068;
            regionValue3050 = edgeValue3069;
            regionValue3051 = edgeValue3070;
            regionValue3052 = edgeValue3071;
            break region598;
        }
        }
        edgeValue3098 = regionValue3041;
        edgeValue3100 = regionValue3043;
        edgeValue3102 = regionValue3045;
        edgeValue3104 = regionValue3047;
        edgeValue3105 = regionValue3048;
        edgeValue3106 = regionValue3049;
        edgeValue3107 = regionValue3050;
        edgeValue3108 = regionValue3051;
        edgeValue3109 = regionValue3052;
        regionValue3079 = edgeValue3098;
        regionValue3081 = edgeValue3100;
        regionValue3083 = edgeValue3102;
        regionValue3085 = edgeValue3104;
        regionValue3086 = edgeValue3105;
        regionValue3087 = edgeValue3106;
        regionValue3088 = edgeValue3107;
        regionValue3089 = edgeValue3108;
        regionValue3090 = edgeValue3109;
        break region600;
        }
        if (value33 != 0) {
            edgeValue3136 = regionValue3079;
            edgeValue3138 = regionValue3081;
            edgeValue3140 = regionValue3083;
            edgeValue3142 = regionValue3085;
            edgeValue3143 = regionValue3086;
            edgeValue3144 = regionValue3087;
            edgeValue3145 = regionValue3088;
            edgeValue3146 = regionValue3089;
            edgeValue3147 = regionValue3090;
            regionValue3117 = edgeValue3136;
            regionValue3119 = edgeValue3138;
            regionValue3121 = edgeValue3140;
            regionValue3123 = edgeValue3142;
            regionValue3124 = edgeValue3143;
            regionValue3125 = edgeValue3144;
            regionValue3126 = edgeValue3145;
            regionValue3127 = edgeValue3146;
            regionValue3128 = edgeValue3147;
            break region613;
        } else {
            edgeValue3174 = regionValue3079;
            edgeValue3176 = regionValue3081;
            edgeValue3178 = regionValue3083;
            edgeValue3180 = regionValue3085;
            edgeValue3181 = regionValue3086;
            edgeValue3182 = regionValue3087;
            edgeValue3183 = regionValue3088;
            edgeValue3184 = regionValue3089;
            edgeValue3185 = regionValue3090;
            regionValue3155 = edgeValue3174;
            regionValue3157 = edgeValue3176;
            regionValue3159 = edgeValue3178;
            regionValue3161 = edgeValue3180;
            regionValue3162 = edgeValue3181;
            regionValue3163 = edgeValue3182;
            regionValue3164 = edgeValue3183;
            regionValue3165 = edgeValue3184;
            regionValue3166 = edgeValue3185;
            break region603;
        }
        }
        edgeValue3212 = regionValue3155;
        edgeValue3214 = regionValue3157;
        edgeValue3216 = regionValue3159;
        edgeValue3218 = regionValue3161;
        edgeValue3219 = regionValue3162;
        edgeValue3220 = regionValue3163;
        edgeValue3221 = regionValue3164;
        edgeValue3222 = regionValue3165;
        edgeValue3223 = regionValue3166;
        regionValue3193 = edgeValue3212;
        regionValue3195 = edgeValue3214;
        regionValue3197 = edgeValue3216;
        regionValue3199 = edgeValue3218;
        regionValue3200 = edgeValue3219;
        regionValue3201 = edgeValue3220;
        regionValue3202 = edgeValue3221;
        regionValue3203 = edgeValue3222;
        regionValue3204 = edgeValue3223;
        break region605;
        }
        if (regionValue3204 != 0) {
            edgeValue3231 = regionValue3193;
            edgeValue3233 = regionValue3195;
            edgeValue3236 = regionValue3200;
            edgeValue3237 = regionValue3201;
            edgeValue3238 = regionValue3202;
            edgeValue3239 = regionValue3203;
            regionValue3009 = edgeValue3231;
            regionValue3011 = edgeValue3233;
            regionValue3014 = edgeValue3236;
            regionValue3015 = edgeValue3237;
            regionValue3016 = edgeValue3238;
            regionValue3017 = edgeValue3239;
            break region634;
        } else {
            edgeValue3265 = regionValue3193;
            edgeValue3267 = regionValue3195;
            edgeValue3269 = regionValue3197;
            edgeValue3271 = regionValue3199;
            edgeValue3272 = regionValue3200;
            edgeValue3273 = regionValue3201;
            edgeValue3274 = regionValue3202;
            edgeValue3275 = regionValue3203;
            regionValue3247 = edgeValue3265;
            regionValue3249 = edgeValue3267;
            regionValue3251 = edgeValue3269;
            regionValue3253 = edgeValue3271;
            regionValue3254 = edgeValue3272;
            regionValue3255 = edgeValue3273;
            regionValue3256 = edgeValue3274;
            regionValue3257 = edgeValue3275;
            break region606;
        }
        }
        edgeValue3301 = regionValue3247;
        edgeValue3303 = regionValue3249;
        edgeValue3305 = regionValue3251;
        edgeValue3307 = regionValue3253;
        edgeValue3308 = regionValue3254;
        edgeValue3309 = regionValue3255;
        edgeValue3310 = regionValue3256;
        edgeValue3311 = regionValue3257;
        regionValue3283 = edgeValue3301;
        regionValue3285 = edgeValue3303;
        regionValue3287 = edgeValue3305;
        regionValue3289 = edgeValue3307;
        regionValue3290 = edgeValue3308;
        regionValue3291 = edgeValue3309;
        regionValue3292 = edgeValue3310;
        regionValue3293 = edgeValue3311;
        break region608;
        }
        comparison3312 = (java.lang.Double.isNaN(regionValue3289) || java.lang.Double.isNaN(0.0D) ? -1 : (regionValue3289 > 0.0D ? 1 : regionValue3289 == 0.0D ? 0 : -1));
        edgeValue3320 = regionValue3283;
        edgeValue3322 = regionValue3285;
        edgeValue3324 = regionValue3287;
        edgeValue3326 = regionValue3289;
        edgeValue3327 = regionValue3290;
        edgeValue3328 = regionValue3291;
        edgeValue3329 = regionValue3292;
        edgeValue3330 = regionValue3293;
        edgeValue3331 = comparison3312;
        regionValue3117 = edgeValue3320;
        regionValue3119 = edgeValue3322;
        regionValue3121 = edgeValue3324;
        regionValue3123 = edgeValue3326;
        regionValue3124 = edgeValue3327;
        regionValue3125 = edgeValue3328;
        regionValue3126 = edgeValue3329;
        regionValue3127 = edgeValue3330;
        regionValue3128 = edgeValue3331;
        break region613;
        }
        if (regionValue3128 != 0) {
            edgeValue3339 = regionValue3117;
            edgeValue3341 = regionValue3119;
            edgeValue3343 = regionValue3121;
            edgeValue3345 = regionValue3123;
            edgeValue3346 = regionValue3124;
            regionValue2033 = edgeValue3339;
            regionValue2035 = edgeValue3341;
            regionValue2037 = edgeValue3343;
            regionValue2039 = edgeValue3345;
            regionValue2040 = edgeValue3346;
            break region650;
        } else {
            edgeValue3371 = regionValue3117;
            edgeValue3373 = regionValue3119;
            edgeValue3376 = regionValue3123;
            edgeValue3377 = regionValue3124;
            edgeValue3378 = regionValue3125;
            edgeValue3379 = regionValue3126;
            edgeValue3380 = regionValue3127;
            regionValue3354 = edgeValue3371;
            regionValue3356 = edgeValue3373;
            regionValue3359 = edgeValue3376;
            regionValue3360 = edgeValue3377;
            regionValue3361 = edgeValue3378;
            regionValue3362 = edgeValue3379;
            regionValue3363 = edgeValue3380;
            break region614;
        }
        }
        value3381 = recovery$indy$flow$262();
        value3382 = value3381;
        value3383 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3382))))));
        value3384 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3383)))).field_44a));
        recovery$indy$flow$265(value3384, regionValue3361);
        value3385 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue3362)))).field_45));
        value3386 = value3385;
        if (a3 >= 0) {
            edgeValue3394 = regionValue3354;
            edgeValue3396 = regionValue3356;
            edgeValue3399 = regionValue3360;
            edgeValue3400 = value3386;
            edgeValue3401 = regionValue3359;
            regionValue2350 = edgeValue3394;
            regionValue2352 = edgeValue3396;
            regionValue2355 = edgeValue3399;
            regionValue2356 = edgeValue3400;
            regionValue2357 = edgeValue3401;
            break region652;
        } else {
            edgeValue3429 = regionValue3354;
            edgeValue3431 = regionValue3356;
            edgeValue3434 = regionValue3359;
            edgeValue3435 = regionValue3360;
            edgeValue3436 = regionValue3361;
            edgeValue3437 = regionValue3362;
            edgeValue3438 = regionValue3363;
            edgeValue3439 = value3386;
            regionValue3410 = edgeValue3429;
            regionValue3412 = edgeValue3431;
            regionValue3415 = edgeValue3434;
            regionValue3416 = edgeValue3435;
            regionValue3417 = edgeValue3436;
            regionValue3418 = edgeValue3437;
            regionValue3419 = edgeValue3438;
            regionValue3420 = edgeValue3439;
            break region631;
        }
        }
        if (value33 == 0) {
            edgeValue3448 = regionValue3410;
            edgeValue3450 = regionValue3412;
            edgeValue3452 = regionValue3420;
            edgeValue3454 = regionValue3415;
            edgeValue3455 = regionValue3416;
            regionValue2033 = edgeValue3448;
            regionValue2035 = edgeValue3450;
            regionValue2037 = edgeValue3452;
            regionValue2039 = edgeValue3454;
            regionValue2040 = edgeValue3455;
            break region650;
        } else {
            edgeValue3479 = regionValue3410;
            edgeValue3481 = regionValue3412;
            edgeValue3484 = regionValue3416;
            edgeValue3485 = regionValue3417;
            edgeValue3486 = regionValue3418;
            edgeValue3487 = regionValue3419;
            regionValue3463 = edgeValue3479;
            regionValue3465 = edgeValue3481;
            regionValue3468 = edgeValue3484;
            regionValue3469 = edgeValue3485;
            regionValue3470 = edgeValue3486;
            regionValue3471 = edgeValue3487;
            break region632;
        }
        }
        edgeValue3495 = regionValue3463;
        edgeValue3497 = regionValue3465;
        edgeValue3500 = regionValue3468;
        edgeValue3501 = regionValue3469;
        edgeValue3502 = regionValue3470;
        edgeValue3503 = regionValue3471;
        regionValue3009 = edgeValue3495;
        regionValue3011 = edgeValue3497;
        regionValue3014 = edgeValue3500;
        regionValue3015 = edgeValue3501;
        regionValue3016 = edgeValue3502;
        regionValue3017 = edgeValue3503;
        break region634;
        }
        value3504 = recovery$indy$flow$267();
        value3505 = value3504;
        value3506 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3505))))));
        value3507 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3506)))).field_44a));
        recovery$indy$flow$270(value3507, regionValue3015);
        value3508 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue3016)))).field_45));
        value3509 = value3508;
        edgeValue3517 = regionValue3009;
        edgeValue3519 = regionValue3011;
        edgeValue3521 = value3509;
        edgeValue3523 = regionValue3014;
        edgeValue3524 = regionValue3017;
        regionValue2940 = edgeValue3517;
        regionValue2942 = edgeValue3519;
        regionValue2944 = edgeValue3521;
        regionValue2946 = edgeValue3523;
        regionValue2947 = edgeValue3524;
        break region648;
        }
        value3525 = regionValue2947;
        edgeValue3533 = regionValue2940;
        edgeValue3535 = regionValue2942;
        edgeValue3537 = regionValue2944;
        edgeValue3539 = value3525;
        edgeValue3540 = regionValue2946;
        regionValue2033 = edgeValue3533;
        regionValue2035 = edgeValue3535;
        regionValue2037 = edgeValue3537;
        regionValue2039 = edgeValue3539;
        regionValue2040 = edgeValue3540;
        break region650;
        }
        incremented3541 = regionValue2040 + (1);
        edgeValue3549 = regionValue2033;
        edgeValue3551 = regionValue2035;
        edgeValue3554 = incremented3541;
        edgeValue3555 = regionValue2037;
        edgeValue3556 = regionValue2039;
        regionValue2350 = edgeValue3549;
        regionValue2352 = edgeValue3551;
        regionValue2355 = edgeValue3554;
        regionValue2356 = edgeValue3555;
        regionValue2357 = edgeValue3556;
        break region652;
        }
        if (value33 == 0) {
            edgeValue3565 = regionValue2350;
            edgeValue3567 = regionValue2352;
            edgeValue3569 = regionValue2356;
            edgeValue3571 = regionValue2357;
            edgeValue3572 = regionValue2355;
            regionValue1526 = edgeValue3565;
            regionValue1528 = edgeValue3567;
            regionValue1530 = edgeValue3569;
            regionValue1532 = edgeValue3571;
            regionValue1533 = edgeValue3572;
            continue loop483;
        } else {
            edgeValue3595 = regionValue2350;
            edgeValue3597 = regionValue2352;
            edgeValue3600 = regionValue2355;
            edgeValue3601 = regionValue2356;
            edgeValue3602 = regionValue2357;
            regionValue3580 = edgeValue3595;
            regionValue3582 = edgeValue3597;
            regionValue3585 = edgeValue3600;
            regionValue3586 = edgeValue3601;
            regionValue3587 = edgeValue3602;
            break region653;
        }
        }
        value3603 = recovery$indy$flow$272();
        value3604 = value3603;
        value3605 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3604))))));
        value3606 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3605)))).field_44a));
        value3607 = ((java.lang.Object)(((net.C_46I) (((java.lang.Object)(value3606)))).field_45g));
        if (a1 < 0) {
            edgeValue3615 = regionValue3580;
            edgeValue3617 = regionValue3582;
            edgeValue3619 = regionValue3586;
            edgeValue3621 = regionValue3587;
            edgeValue3622 = regionValue3585;
            edgeValue3623 = value3607;
            regionValue1619 = edgeValue3615;
            regionValue1621 = edgeValue3617;
            regionValue1623 = edgeValue3619;
            regionValue1625 = edgeValue3621;
            regionValue1626 = edgeValue3622;
            regionValue1627 = edgeValue3623;
            continue loop491;
        } else {
            edgeValue3628 = regionValue3580;
            edgeValue3630 = regionValue3582;
            edgeValue3631 = regionValue3586;
            edgeValue3632 = regionValue3587;
            edgeValue3633 = value3607;
            regionValue1669 = edgeValue3628;
            regionValue1671 = edgeValue3630;
            regionValue1672 = edgeValue3631;
            regionValue1673 = edgeValue3632;
            regionValue1674 = edgeValue3633;
            break region665;
        }
        }
        }
        }
        if (value33 != 0) {
            edgeValue3646 = regionValue1669;
            edgeValue3647 = regionValue1672;
            edgeValue3648 = regionValue1673;
            edgeValue3649 = regionValue1674;
            regionValue3638 = edgeValue3646;
            regionValue3639 = edgeValue3647;
            regionValue3640 = edgeValue3648;
            regionValue3641 = edgeValue3649;
            break region733;
        } else {
            edgeValue3664 = regionValue1669;
            edgeValue3666 = regionValue1671;
            edgeValue3667 = regionValue1672;
            edgeValue3668 = regionValue1673;
            edgeValue3669 = regionValue1674;
            regionValue3654 = edgeValue3664;
            regionValue3656 = edgeValue3666;
            regionValue3657 = edgeValue3667;
            regionValue3658 = edgeValue3668;
            regionValue3659 = edgeValue3669;
            break region667;
        }
        }
        if (regionValue3659 == null) {
            edgeValue3681 = regionValue3654;
            edgeValue3682 = regionValue3657;
            edgeValue3683 = regionValue3658;
            regionValue3674 = edgeValue3681;
            regionValue3675 = edgeValue3682;
            regionValue3676 = edgeValue3683;
            break region723;
        } else {
            edgeValue3697 = regionValue3654;
            edgeValue3699 = regionValue3656;
            edgeValue3700 = regionValue3657;
            edgeValue3701 = regionValue3658;
            regionValue3688 = edgeValue3697;
            regionValue3690 = edgeValue3699;
            regionValue3691 = edgeValue3700;
            regionValue3692 = edgeValue3701;
            break region668;
        }
        }
        edgeValue3715 = regionValue3688;
        edgeValue3717 = regionValue3690;
        edgeValue3718 = regionValue3691;
        edgeValue3719 = regionValue3692;
        regionValue3706 = edgeValue3715;
        regionValue3708 = edgeValue3717;
        regionValue3709 = edgeValue3718;
        regionValue3710 = edgeValue3719;
        break region670;
        }
        if (value33 != 0) {
            edgeValue3732 = regionValue3706;
            edgeValue3733 = regionValue3709;
            edgeValue3734 = regionValue3710;
            edgeValue3735 = regionValue3708;
            regionValue3724 = edgeValue3732;
            regionValue3725 = edgeValue3733;
            regionValue3726 = edgeValue3734;
            regionValue3727 = edgeValue3735;
            break region685;
        } else {
            edgeValue3749 = regionValue3706;
            edgeValue3751 = regionValue3709;
            edgeValue3752 = regionValue3710;
            edgeValue3753 = regionValue3708;
            regionValue3740 = edgeValue3749;
            regionValue3742 = edgeValue3751;
            regionValue3743 = edgeValue3752;
            regionValue3744 = edgeValue3753;
            break region673;
        }
        }
        edgeValue3767 = regionValue3740;
        edgeValue3769 = regionValue3742;
        edgeValue3770 = regionValue3743;
        edgeValue3771 = regionValue3744;
        regionValue3758 = edgeValue3767;
        regionValue3760 = edgeValue3769;
        regionValue3761 = edgeValue3770;
        regionValue3762 = edgeValue3771;
        break region675;
        }
        if (regionValue3762 == 0) {
            edgeValue3776 = regionValue3758;
            edgeValue3777 = regionValue3760;
            edgeValue3778 = regionValue3761;
            regionValue3674 = edgeValue3776;
            regionValue3675 = edgeValue3777;
            regionValue3676 = edgeValue3778;
            break region723;
        } else {
            edgeValue3791 = regionValue3758;
            edgeValue3793 = regionValue3760;
            edgeValue3794 = regionValue3761;
            regionValue3783 = edgeValue3791;
            regionValue3785 = edgeValue3793;
            regionValue3786 = edgeValue3794;
            break region676;
        }
        }
        edgeValue3807 = regionValue3783;
        edgeValue3809 = regionValue3785;
        edgeValue3810 = regionValue3786;
        regionValue3799 = edgeValue3807;
        regionValue3801 = edgeValue3809;
        regionValue3802 = edgeValue3810;
        break region678;
        }
        value3811 = recovery$indy$flow$276(value821, regionValue3801);
        comparison3812 = (java.lang.Double.isNaN(value3811) || java.lang.Double.isNaN(Double.longBitsToDouble(4613937818241073152L)) ? -1 : (value3811 > Double.longBitsToDouble(4613937818241073152L) ? 1 : value3811 == Double.longBitsToDouble(4613937818241073152L) ? 0 : -1));
        edgeValue3817 = regionValue3799;
        edgeValue3818 = regionValue3801;
        edgeValue3819 = regionValue3802;
        regionValue3724 = edgeValue3817;
        regionValue3725 = edgeValue3818;
        regionValue3726 = edgeValue3819;
        regionValue3727 = comparison3812;
        break region685;
        }
        if (regionValue3727 <= 0) {
            edgeValue3825 = regionValue3724;
            edgeValue3826 = regionValue3725;
            edgeValue3827 = regionValue3726;
            regionValue3674 = edgeValue3825;
            regionValue3675 = edgeValue3826;
            regionValue3676 = edgeValue3827;
            break region723;
        } else {
            edgeValue3839 = regionValue3724;
            edgeValue3840 = regionValue3725;
            edgeValue3841 = regionValue3726;
            regionValue3832 = edgeValue3839;
            regionValue3833 = edgeValue3840;
            regionValue3834 = edgeValue3841;
            break region686;
        }
        }
        value3842 = recovery$indy$flow$277();
        value3844 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3842))))));
        value3845 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3844)))).field_44a));
        recovery$indy$flow$280(value3845, null);
        value3846 = recovery$indy$flow$281();
        value3847 = recovery$indy$flow$283();
        value3848 = ((java.lang.Object)(((net.C_484) (((java.lang.Object)(null))))));
        initialized3849 = new net.C_478Q((net.C_47tf) (regionValue3833));
        initialized3850 = new net.C_47Ij((net.C_47Az) (value3847), (net.C_47tf) (regionValue3833), (net.C_484) (value3848), initialized3849);
        value3853 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3846))))));
        recovery$indy$flow$289(value3853, initialized3850);
        edgeValue3858 = regionValue3832;
        edgeValue3859 = regionValue3833;
        edgeValue3860 = regionValue3834;
        regionValue3674 = edgeValue3858;
        regionValue3675 = edgeValue3859;
        regionValue3676 = edgeValue3860;
        break region723;
        }
        value3861 = recovery$indy$flow$290();
        value3863 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3861))))));
        value3864 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3863)))).field_44a));
        value3865 = ((java.lang.Object)(((net.C_46I) (((java.lang.Object)(value3864)))).field_45g));
        edgeValue3870 = regionValue3674;
        edgeValue3871 = regionValue3675;
        edgeValue3872 = regionValue3676;
        regionValue3638 = edgeValue3870;
        regionValue3639 = edgeValue3871;
        regionValue3640 = edgeValue3872;
        regionValue3641 = value3865;
        break region733;
        }
        if (regionValue3641 == null) {
            break region852;
        } else {
            edgeValue3885 = regionValue3638;
            edgeValue3886 = regionValue3639;
            edgeValue3887 = regionValue3640;
            regionValue3878 = edgeValue3885;
            regionValue3879 = edgeValue3886;
            regionValue3880 = edgeValue3887;
            break region734;
        }
        }
        comparison3888 = (java.lang.Double.isNaN(regionValue3880) || java.lang.Double.isNaN(regionValue3878) ? 1 : (regionValue3880 > regionValue3878 ? 1 : regionValue3880 == regionValue3878 ? 0 : -1));
        edgeValue3893 = regionValue3879;
        regionValue1753 = edgeValue3893;
        regionValue1754 = comparison3888;
        break region739;
        }
        edgeValue3899 = regionValue1753;
        edgeValue3900 = regionValue1754;
        regionValue1701 = edgeValue3899;
        regionValue1702 = edgeValue3900;
        break region740;
        }
        if (value33 != 0) {
            edgeValue3909 = regionValue1702;
            regionValue3905 = edgeValue3909;
            break region808;
        } else {
            edgeValue3920 = regionValue1701;
            edgeValue3921 = regionValue1702;
            regionValue3914 = edgeValue3920;
            regionValue3915 = edgeValue3921;
            break region741;
        }
        }
        if (regionValue3915 < 0) {
            edgeValue3929 = regionValue3914;
            regionValue3925 = edgeValue3929;
            break region764;
        } else {
            edgeValue3939 = regionValue3914;
            regionValue3934 = edgeValue3939;
            break region742;
        }
        }
        value3940 = recovery$indy$flow$294();
        if (a2 <= 0) {
            regionValue3944 = value3940;
            break region795;
        } else {
            edgeValue3960 = regionValue3934;
            regionValue3954 = edgeValue3960;
            break region748;
        }
        }
        edgeValue3972 = regionValue3954;
        regionValue3966 = edgeValue3972;
        break region750;
        }
        if (value33 != 0) {
            regionValue3978 = value3940;
            break region794;
        } else {
            edgeValue3991 = regionValue3966;
            regionValue3986 = edgeValue3991;
            break region751;
        }
        }
        edgeValue4001 = regionValue3986;
        regionValue3996 = edgeValue4001;
        break region753;
        }
        value4004 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3940))))));
        value4005 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4004)))).field_42Y));
        if (value4005 != null) {
            break region852;
        } else {
            edgeValue4013 = regionValue3996;
            regionValue4009 = edgeValue4013;
            break region762;
        }
        }
        edgeValue4017 = regionValue4009;
        regionValue3925 = edgeValue4017;
        break region764;
        }
        value4018 = recovery$indy$flow$297();
        value4019 = recovery$indy$flow$299();
        value4021 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4019))))));
        value4022 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4021)))).field_44a));
        value4023 = ((java.lang.Object)(((net.C_46I) (((java.lang.Object)(value4022)))).field_45g));
        initialized4024 = new net.C_47Ij((net.minecraft.entity.Entity) (value4023), (net.C_47tf) (regionValue3925));
        value4027 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4018))))));
        recovery$indy$flow$305(value4027, initialized4024);
        value4028 = recovery$indy$flow$306();
        regionValue3978 = value4028;
        break region794;
        }
        edgeValue4036 = regionValue3978;
        regionValue3944 = edgeValue4036;
        break region795;
        }
        if (value33 != 0) {
            edgeValue4041 = regionValue3944;
            regionValue4039 = edgeValue4041;
            break region832;
        } else {
            edgeValue4049 = regionValue3944;
            regionValue4045 = edgeValue4049;
            break region796;
        }
        }
        value4050 = regionValue4045;
        value4051 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4050))))));
        value4052 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4051)))).field_44a));
        value4053 = ((java.lang.Object)(((net.C_46I) (((java.lang.Object)(value4052)))).field_45g));
        value4054 = recovery$indy$flow$310(value4053);
        edgeValue4058 = (int) ((value4054 ? 1 : 0));
        regionValue3905 = edgeValue4058;
        break region808;
        }
        if (regionValue3905 != 0) {
            break region827;
        } else {
            break region809;
        }
        }
        value4069 = recovery$indy$flow$311();
        if (value33 != 0) {
            regionValue4039 = value4069;
            break region832;
        } else {
            break region812;
        }
        }
        break region814;
        }
        value4085 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4069))))));
        value4086 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4085)))).field_44a));
        value4087 = ((java.lang.Object)(((net.C_46I) (((java.lang.Object)(value4086)))).field_45g));
        value4088 = recovery$indy$flow$315(value4087);
        if ((int) ((value4088 ? 1 : 0)) == 0) {
            break region852;
        } else {
            break region825;
        }
        }
        break region827;
        }
        value4095 = recovery$indy$flow$316();
        regionValue4039 = value4095;
        break region832;
        }
        value4098 = recovery$indy$flow$317();
        value4100 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4098))))));
        value4101 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4100)))).field_44a));
        value4102 = ((java.lang.Object)(((net.C_46I) (((java.lang.Object)(value4101)))).field_45g));
        value4104 = regionValue4039;
        value4105 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4104))))));
        recovery$indy$flow$322(value4105, value4102);
        break region852;
        }
        return;
    }










   private boolean method_48$a94942e097(C_47K var1) {
      long var4;
      boolean var6;
      label105: {
         long var2 = a ^ 49756004121999L;
         var4 = var2 ^ 63036422292049L;
         long var10000 = 5636805835469430714L;
         var6 = AirStuck_47Q4.method_45$aae029aa0a();
         byte var16 = (byte) ((var1 instanceof C_47N) ? 1 : 0);
         if (var6) {
            if (var16 != 0) {
               break label105;
            }

            var16 = (byte) ((var1 instanceof C_470) ? 1 : 0);
         }

         if (!var6) {
            return var16 != 0;
         }

         if (var16 == 0) {
            return false;
         }
      }

      C_47tf var7 = ((net.C_47tf) (new C_47tf(var1.method_43$5730377d31().method_40$8abf5c6871() + 0.5, var1.method_43$5730377d31().method_43$8abf5c6871() + 0.5, var1.method_43$5730377d31().method_47$8abf5c6871() + 0.5)));
      long var10001 = 5636957492648072234L;
      Minecraft var10 = field_43;
      double var17 = var10.field_42P.method_49$4b58f7ab41(var7.field_40, var7.field_41, var7.field_47);
      long var10003 = 5630044419978604315L;
      long var11 = var4;
      NumberSetting var13 = this.settingPreRange;
      double var22;
      int var26 = (var22 = var17 - var13.method_44$474dfaa627(var11)) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
      if (!var6) {
         return var26 != 0;
      }

      if (var26 < 0) {
         for (Object recovered$element$45746 : this.field_43h) {
         C_47tf var9 = (C_47tf) recovered$element$45746;
            label109: {
               C_47tf var18 = var9;
               if (var6) {
                  if (var9 == null) {
                     break label109;
                  }

                  var18 = var7;
               }

               double var23;
               int var19 = (var23 = var18.field_40 - var9.field_40) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
               if (var6) {
                  if ((var19) != 0) {
                     break label109;
                  }

                  double var24;
                  var19 = (var24 = var7.field_41 - var9.field_41) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
               }

               if (var6) {
                  if ((var19) != 0) {
                     break label109;
                  }

                  double var25;
                  var19 = (var25 = var7.field_47 - var9.field_47) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
               }

               if (!var6) {
                  return var19 != 0;
               }

               if (!(var19 != 0)) {
                  return false;
               }
            }

            if (!var6) {
               break;
            }
         }

         var10001 = 5637276877183677046L;
         Minecraft var14 = field_43;
         C_475y var15 = var14.field_44Q.method_46$efbf73d2b1(var1.method_43$5730377d31().method_40$5730377d31()).method_48$e084f7739d();
         boolean var20 = var15.method_43$aae029aa0a();
         if (var6) {
            if (var20) {
               return false;
            }

            var20 = true;
         }

         return var20;
      } else {
         return false;
      }
   }




   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var10001 = var2 ^ 31970059946167L;
      int var4 = (int)((var2 ^ 31970059946167L) >>> 48);
      int var5 = (int)((var2 ^ 31970059946167L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      boolean var7 = recovery$indy$17(6400775209825032868L, var2);
      boolean var10000 = recovery$indy$18(this.settingMoveFix, 6398754632477460060L, var2);
      if (!var7) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$19(ClientGlobals.field_46, (char)var4, var5, this, (char)var6, 6397464108431132989L, var2);
      }

      if (var10000) {
         recovery$indy$20(var1, C_47tU.DEFAULT, 6398894464906322237L, var2);
      }
   }



   private static double method_47$574e6486fd(C_47K var0) {
      long var1 = a ^ 6930663106150L;
      long var10001 = 6184381221112827843L;
      Minecraft var3 = field_43;
      return var3.field_42P
         .method_49$4b58f7ab41(
            var0.method_43$5730377d31().method_40$8abf5c6871() + 0.5,
            var0.method_43$5730377d31().method_43$8abf5c6871() + 0.5,
            var0.method_43$5730377d31().method_47$8abf5c6871() + 0.5
         );
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$21(this, 28, var3, -7101317473248626797L, var1);
      recovery$indy$22(this, 7, var3, -7101317473248626797L, var1);
      recovery$indy$23(this, 40, var3, -7101317473248626797L, var1);
      recovery$indy$24(this, 21, var3, -7101317473248626797L, var1);
      recovery$indy$25(this, 29, var3, -7101317473248626797L, var1);
   }



   public void method_40v$e45a9973e5(long var1) {
      long var10001 = var1 ^ 23226102646565L;
      int var3 = (int)((var1 ^ 23226102646565L) >>> 48);
      int var4 = (int)((var1 ^ 23226102646565L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 95852997877258L;
      int var6 = (int)((var1 ^ 95852997877258L) >>> 48);
      int var7 = (int)((var1 ^ 95852997877258L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      if (this.field_46 != null && recovery$indy$26(ClientGlobals.field_46, (char)var6, var7, this, (char)var8, -3569927853779984512L, var1)) {
         recovery$indy$27(this, 1.0F, (short)var3, var4, (short)var5, -3573115763683166006L, var1);
      }
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_45 = null;
      this.field_46 = null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_48 = null;
      this.field_46 = null;
   }



   public void method_487$da8c82d5d4() {
      net.minecraft.client.Minecraft var125;
      double var130;
      double var131;
      double var146;
      long var1 = a ^ 52843589138416L;
      long var3 = var1 ^ 60228979405177L;
      long var5 = var1 ^ 23595595291902L;
      long var7 = var1 ^ 13879808414380L;
      long var9 = var1 ^ 17270656638515L;
      long var11 = var1 ^ 26741507650058L;
      long var13 = (var1 ^ 109301832983625L) >>> 8;
      int var15 = (int)((var1 ^ 109301832983625L) << 56 >>> 56);
      long var10001 = var1 ^ 138410340241604L;
      int var16 = (int)((var1 ^ 138410340241604L) >>> 48);
      int var17 = (int)((var1 ^ 138410340241604L) << 16 >>> 32);
      int var18 = (int)(var10001 << 48 >>> 48);
      long var10000 = -4303497006817897019L;
      boolean var19 = AirStuck_47Q4.method_45$aae029aa0a();
      ChestAura_47Qh var123 = this;
      if (var19) {
         long var10002 = -4304108374105589751L;
         Minecraft var39 = field_43;
         if (this.field_45 != var39.field_44Q) {
            this.field_43h.clear();
         }

         var123 = this;
      }

      long var149 = -4304108374105589751L;
      Minecraft var40 = field_43;
      var123.field_45 = var40.field_44Q;
      var10001 = -4297896545123601372L;
      Minecraft var41 = field_43;
      int var124 = (int) ((var41.field_44m instanceof C_47ph) ? 1 : 0);
      if (var19) {
         if (var124 != 0) {
            this.field_43h.add(this.field_48);
            this.field_48 = null;
         }

         var10001 = -4296806675617097010L;
         BooleanSetting var42 = this.settingTargetNearbyCheck;
         var124 = (int) ((var42.method_49$aae029aa0a()) ? 1 : 0);
      }

      label264:
      if (var19) {
         if (var124 != 0) {
            var10001 = -4304108374105589751L;
            Minecraft var43 = field_43;
            Object[] var20 = var43.field_44Q.field_44Q.stream().filter(recovery$indy$28(this)).toArray();
            var124 = var20.length;
            if (!var19) {
               break label264;
            }

            if (var124 > 0) {
               this.field_46 = null;
               return;
            }
         }

         var10001 = -4296806675617097010L;
         BooleanSetting var44 = this.settingOnlyOnGround;
         var124 = (int) ((var44.method_49$aae029aa0a()) ? 1 : 0);
      }

      label257:
      if (var19) {
         if (var124 != 0) {
            var10001 = -4303924233921405355L;
            Minecraft var45 = field_43;
            var124 = (int) ((var45.field_42P.field_48M) ? 1 : 0);
            if (!var19) {
               break label257;
            }

            if (!var45.field_42P.field_48M) {
               return;
            }
         }

         var10001 = -4296806675617097010L;
         BooleanSetting var46 = this.settingNotWhileInventoryIsFull;
         var124 = (int) ((var46.method_49$aae029aa0a()) ? 1 : 0);
      }

      label271: {
         label248:
         if (var19) {
            label246:
            if (var124 != 0) {
               byte var119 = 1;
               int var21 = 9;

               do {
                  var149 = -4303924233921405355L;
                  Minecraft var47 = field_43;
                  if (var21 >= var47.field_42P.field_429.field_46.size()) {
                     break;
                  }

                  var10001 = -4303924233921405355L;
                  Minecraft var48 = field_43;
                  C_47rf var22 = ((C_47sT)var48.field_42P.field_429.field_46.get(var21)).method_48$ac4db64966();
                  if (!var19) {
                     break label246;
                  }

                  if (var19) {
                     if (var22 == null) {
                        var119 = 0;
                        if (var19) {
                           break;
                        }
                     }

                     var21++;
                  }
               } while (var19);

               var124 = var119;
               if (!var19) {
                  break label248;
               }

               if (var119 != 0) {
                  return;
               }
            }

            var125 = field_43;
            if (!var19) {
               break label271;
            }

            var10001 = -4297616287067202239L;
            Minecraft var49 = field_43;
            var124 = (int) ((var49.method_44$aae029aa0a()) ? 1 : 0);
         }

         if (var124 == 0) {
            return;
         }

         var125 = field_43;
      }

      if (var19) {
         var10001 = -4303924233921405355L;
         Minecraft var50 = var125;
         if (var50.field_42P.method_46$f8ba6cbd86() != null) {
            return;
         }

         var125 = field_43;
      }

      var10001 = -4304108374105589751L;
      Minecraft var51 = var125;
      Object[] var120 = var51.field_44Q.field_44e.stream().filter(recovery$indy$29(this)).sorted(Comparator.comparingDouble(recovery$indy$30())).toArray();
      this.field_46 = null;
      if (var120.length > 0) {
         var10001 = -4297896545123601372L;
         Minecraft var52 = field_43;
         if (var52.field_44m == null) {
            C_47tf var122;
            label276: {
               this.field_46 = (C_47K)var120[0];
               C_47tf var121 = ((net.C_47tf) (new C_47tf(this.field_46.method_43$5730377d31().method_40$8abf5c6871() + 0.5, this.field_46.method_43$5730377d31().method_43$8abf5c6871() + 0.5, this.field_46.method_43$5730377d31().method_47$8abf5c6871() + 0.5)));
               var122 = null;
               boolean var23 = false;
               var10001 = -4296806675617097010L;
               BooleanSetting var53 = this.settingThroughWalls;
               byte var126 = (byte) ((var53.method_49$aae029aa0a()) ? 1 : 0);
               if (var19) {
                  if (var126 != 0) {
                     this.field_46 = (C_47K)var120[0];
                     var122 = var121;
                     break label276;
                  }

                  byte var10003 = (byte)var15;
                  long var10005 = -4296898312797685398L;
                  C_47K var54 = this.field_46;
                  byte var55 = var10003;
                  long var56 = var13;
                  C_47tf var58 = var121;
                  ChestAura_47Qh var59 = this;
                  var126 = (byte) ((var59.method_46$c792670bc2(var58, var56, var55, var54)) ? 1 : 0);
               }

               label277: {
                  if (var19) {
                     if (var126 != 0) {
                        this.field_46 = (C_47K)var120[0];
                        var122 = var121;
                        var23 = true;
                        break label277;
                     }

                     var126 = 0;
                  }

                  int var24 = var126;

                  while (var24 < var120.length) {
                     C_47K var25 = (C_47K)var120[var24];
                     C_475y var127 = var25.method_46$e084f7739d();
                     var149 = -4304108374105589751L;
                     Minecraft var60 = field_43;
                     C_478i var26 = var127.method_42$f487e42d4b(var60.field_44Q, var25.method_43$5730377d31());
                     double var27 = 15.0;
                     if (!var19) {
                        break label276;
                     }

                     double var128 = var26.field_48;

                     label197:
                     while (true) {
                        double var29 = var128;

                        while (true) {
                           if (!(var29 <= var26.field_42)) {
                              break label197;
                           }

                           var128 = var26.field_44;
                           if (!var19) {
                              break;
                           }

                           double var31 = var26.field_44;

                           label192: {
                              label191:
                              while (true) {
                                 double var172;
                                 int var129 = (var172 = var31 - var26.field_40) == 0.0 ? 0 : (var172 < 0.0 ? -1 : 1);

                                 label189:
                                 while (true) {
                                    if (var129 > 0) {
                                       break label191;
                                    }

                                    var130 = var26.field_46;
                                    if (!var19) {
                                       break label192;
                                    }

                                    double var33 = var26.field_46;

                                    while (var33 <= var26.field_47) {
                                       C_47tf var35 = ((net.C_47tf) (new C_47tf(var29, var33, var31)));
                                       if (var19) {
                                          byte var154 = (byte)var15;
                                          long var159 = -4296898312797685398L;
                                          C_47K var61 = this.field_46;
                                          byte var62 = var154;
                                          long var63 = var13;
                                          C_47tf var65 = var35;
                                          ChestAura_47Qh var66 = this;
                                          var129 = (int) ((var66.method_46$c792670bc2(var65, var63, var62, var61)) ? 1 : 0);
                                          if (!var19) {
                                             continue label189;
                                          }

                                          label180: {
                                             if (var129 != 0) {
                                                var10001 = -4303924233921405355L;
                                                Minecraft var67 = field_43;
                                                C_47tf var36 = var67.field_42P.method_49$41b79b67a0(1.0F);
                                                double var37 = Math.sqrt(
                                                   Math.pow(var29 - var36.field_40, 2.0)
                                                      + Math.pow(var33 - var36.field_41, 2.0)
                                                      + Math.pow(var31 - var36.field_47, 2.0)
                                                );
                                                var131 = var37;
                                                var146 = var27;
                                                if (!var19) {
                                                   break label180;
                                                }

                                                if (var37 <= var27) {
                                                   var27 = var37;
                                                   var122 = var35;
                                                }
                                             }

                                             var131 = var33;
                                             var146 = 0.07;
                                          }

                                          var33 = var131 + var146;
                                       }

                                       if (!var19) {
                                          break;
                                       }
                                    }

                                    var31 += 0.07;
                                    if (!var19) {
                                       break label191;
                                    }
                                    break;
                                 }
                              }

                              var130 = var29 + 0.07;
                           }

                           var29 = var130;
                           if (!var19) {
                              break label197;
                           }
                        }
                     }

                     if (var122 != null) {
                        this.field_46 = (C_47K)var120[var24];
                        var23 = true;
                        if (var19) {
                           break;
                        }
                     }

                     var24++;
                     if (!var19) {
                        break;
                     }
                  }
               }

               if (!var23) {
                  this.field_46 = null;
               }
            }

            if (var122 != null) {
               C_47S6 var132 = ClientGlobals.field_46;
               double var147 = var122.field_40;
               double var152 = var122.field_41;
               double var10004 = var122.field_47;
               long var10006 = -4297774335183653196L;
               C_47S6 var68 = ClientGlobals.field_46;
               C_477r var160 = var68.method_44$4f8050086d();
               C_47MO var161 = C_476q.field_48;
               long var10009 = -4297982042933680381L;
               long var69 = var5;
               C_47TU var71 = this.settingYawSpeed;
               double var10007 = var71.method_41$474dfaa627(var69);
               long var10010 = -4298466529644331331L;
               long var72 = var3;
               C_47TU var74 = this.settingYawSpeed;
               double var10008 = var74.method_43$474dfaa627(var72);
               var10010 = -4303873099031595275L;
               long var75 = var7;
               double var77 = var10008;
               double var79 = var10007;
               C_47MO var81 = var161;
               float var162 = var81.method_46$75c1d434ba(var79, var77, var75);
               C_47MO var163 = C_476q.field_48;
               var10010 = -4297982042933680381L;
               long var82 = var5;
               C_47TU var84 = this.settingPitchSpeed;
               var10008 = var84.method_41$474dfaa627(var82);
               long var10011 = -4298466529644331331L;
               long var85 = var3;
               C_47TU var87 = this.settingPitchSpeed;
               double var167 = var87.method_43$474dfaa627(var85);
               var10011 = -4303873099031595275L;
               long var88 = var7;
               double var90 = var167;
               double var92 = var10008;
               C_47MO var94 = var163;
               float var164 = var94.method_46$75c1d434ba(var92, var90, var88);
               var10009 = -4298128536585379720L;
               boolean var95 = true;
               float var96 = var164;
               float var97 = var162;
               C_477r var98 = var160;
               double var99 = var10004;
               long var101 = var11;
               double var103 = var152;
               double var105 = var147;
               C_477r var153 = C_47gg.method_48$63715048f6(var105, var103, var101, var99, var98, var97, var96, var95);
               long var157 = -4297774335183653196L;
               C_47S6 var107 = ClientGlobals.field_46;
               C_477r var155 = var107.method_44$4f8050086d();
               long var158 = -4298335679765853719L;
               C_477r var108 = var155;
               C_477r var109 = var153;
               long var110 = var9;
               C_477r var148 = C_47gg.method_49$c311864491(var110, var109, var108);
               char var156 = (char)var16;
               long var165 = -4304222404700538112L;
               ChestAura_47Qh var112 = this;
               int var113 = var18;
               int var114 = var17;
               char var115 = var156;
               byte var116 = 4;
               C_477r var117 = var148;
               C_47S6 var118 = var132;
               var118.method_45$c163d5afc8(var117, var116, var115, var114, var113, var112);
            }

            return;
         }
      }
   }









    public ChestAura_47Qh(long a0) {
        super((java.lang.String) ("ChestAura"),(java.lang.String) ("TruhenAura"),(long) (((augustus.recovered.modules.player.ChestAura_47Qh.a ^ a0) ^ 129327388266335L)),(java.awt.Color) (new java.awt.Color((int) (134),(int) (227),(int) (145))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = ((augustus.recovered.modules.player.ChestAura_47Qh.a ^ a0) ^ 2003786778065L);
        long constructorKey2 = ((augustus.recovered.modules.player.ChestAura_47Qh.a ^ a0) ^ 5205008536388L);
        long constructorKey3 = ((augustus.recovered.modules.player.ChestAura_47Qh.a ^ a0) ^ 46058456706243L);
        client.setting.NumberSetting initialized4 = new client.setting.NumberSetting(this, "PreRange", Double.longBitsToDouble(4618441417868443648L), constructorKey3, 0.0D, Double.longBitsToDouble(4621819117588971520L), 1);
        recovery$indy$flow$571(this, initialized4);
        client.setting.NumberSetting initialized5 = new client.setting.NumberSetting(this, "Range", Double.longBitsToDouble(4616752568008179712L), constructorKey3, Double.longBitsToDouble(4616752568008179712L), Double.longBitsToDouble(4618441417868443648L), 2);
        recovery$indy$flow$574(this, initialized5);
        net.C_47TU initialized6 = new net.C_47TU(constructorKey1, this, "YawSpeed", Double.longBitsToDouble(4629137466983448576L), Double.longBitsToDouble(4632233691727265792L), 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$577(this, initialized6);
        net.C_47TU initialized7 = new net.C_47TU(constructorKey1, this, "PitchSpeed", Double.longBitsToDouble(4629137466983448576L), Double.longBitsToDouble(4632233691727265792L), 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$580(this, initialized7);
        net.C_47TU initialized8 = new net.C_47TU(constructorKey1, this, "Delay", Double.longBitsToDouble(4641240890982006784L), Double.longBitsToDouble(4647503709213818880L), 0.0D, Double.longBitsToDouble(4652007308841189376L), 0);
        recovery$indy$flow$583(this, initialized8);
        client.setting.BooleanSetting initialized9 = new client.setting.BooleanSetting(this, constructorKey2, "ThroughWalls", false);
        recovery$indy$flow$586(this, initialized9);
        client.setting.BooleanSetting initialized10 = new client.setting.BooleanSetting(this, constructorKey2, "ThroughEntities", false);
        recovery$indy$flow$589(this, initialized10);
        client.setting.BooleanSetting initialized11 = new client.setting.BooleanSetting(this, constructorKey2, "TargetNearbyCheck", true);
        recovery$indy$flow$592(this, initialized11);
        client.setting.BooleanSetting initialized12 = new client.setting.BooleanSetting(this, constructorKey2, "NotWhileInventoryIsFull", false);
        recovery$indy$flow$595(this, initialized12);
        client.setting.BooleanSetting initialized13 = new client.setting.BooleanSetting(this, constructorKey2, "OnlyOnGround", false);
        recovery$indy$flow$598(this, initialized13);
        client.setting.BooleanSetting initialized14 = new client.setting.BooleanSetting(this, constructorKey2, "MoveFix", false);
        recovery$indy$flow$601(this, initialized14);
        java.util.ArrayList initialized15 = new java.util.ArrayList();
        recovery$indy$flow$604(this, initialized15);
        net.C_47cu initialized16 = new net.C_47cu();
        recovery$indy$flow$607(this, initialized16);
        recovery$indy$flow$608(this, null);
        recovery$indy$flow$609(this, null);
        recovery$indy$flow$610(this, null);
    }




    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static long recovery$indy$flow$142() {
        return augustus.recovered.modules.player.ChestAura_47Qh.a;
    }
    private static native boolean recovery$indy$flow$143();
    private static java.lang.Object recovery$indy$flow$144() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$146(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$147() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static java.lang.Object recovery$indy$flow$150() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }

    private static void recovery$indy$flow$152(java.lang.Object a0,java.lang.Object a1) {
        ((net.minecraft.client.Minecraft) (a0)).field_44x = ((net.minecraft.entity.Entity) (a1));
        return;
    }
    private static java.lang.Object recovery$indy$flow$153() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static native float recovery$indy$flow$156(java.lang.Object a0);


    private static native double recovery$indy$flow$159(java.lang.Object a0,long a1);
    private static double recovery$indy$flow$160(double a0,double a1) {
        return java.lang.Math.max(a0, a1);
    }


    private static native boolean recovery$indy$flow$163(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$164() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$166(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$167() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static float recovery$indy$flow$170(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48h;
    }
    private static java.lang.Object recovery$indy$flow$171() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static float recovery$indy$flow$174(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48z;
    }


    private static native double recovery$indy$flow$177(java.lang.Object a0,long a1);

    private static native java.lang.Object recovery$indy$flow$179(java.lang.Object a0,float a1,long a2,float a3,double a4);

    private static void recovery$indy$flow$181(java.lang.Object a0,java.lang.Object a1) {
        ((net.minecraft.client.Minecraft) (a0)).field_42Y = ((net.C_47Ij) (a1));
        return;
    }
    private static java.lang.Object recovery$indy$flow$182() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static java.lang.Object recovery$indy$flow$185() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }
    private static java.lang.Object recovery$indy$flow$187() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }



    private static java.lang.Object recovery$indy$flow$191() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }




    private static native java.lang.Object recovery$indy$flow$196(java.lang.Object a0);

    private static void recovery$indy$flow$199(java.lang.Object a0,java.lang.Object a1) {
        ((net.minecraft.client.Minecraft) (a0)).field_42Y = ((net.C_47Ij) (a1));
        return;
    }
    private static java.lang.Object recovery$indy$flow$200() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$201(java.lang.Object a0,double a1,float a2);

    private static void recovery$indy$flow$203(java.lang.Object a0,java.lang.Object a1) {
        ((net.minecraft.client.Minecraft) (a0)).field_42Y = ((net.C_47Ij) (a1));
        return;
    }
    private static java.lang.Object recovery$indy$flow$204() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$205(java.lang.Object a0,double a1,float a2);

    private static void recovery$indy$flow$207(java.lang.Object a0,java.lang.Object a1) {
        ((net.minecraft.client.Minecraft) (a0)).field_42Y = ((net.C_47Ij) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$208(java.lang.Object a0,float a1);
    private static java.lang.Object recovery$indy$flow$209() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static java.lang.Object recovery$indy$flow$212() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }



    private static native double recovery$indy$flow$216(java.lang.Object a0,java.lang.Object a1);


    private static native boolean recovery$indy$flow$219(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$220(java.lang.Object a0,float a1);
    private static double recovery$indy$flow$221(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$222(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$223(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native java.lang.Object recovery$indy$flow$224(java.lang.Object a0,double a1,double a2,double a3);
    private static java.lang.Object recovery$indy$flow$225() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static void recovery$indy$flow$228(java.lang.Object a0,java.lang.Object a1) {
        ((net.C_46I) (a0)).field_45g = ((net.minecraft.entity.Entity) (a1));
        return;
    }
    private static java.lang.Object recovery$indy$flow$229() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$232(java.lang.Object a0);
    private static double recovery$indy$flow$233(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$234(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$235(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native java.lang.Object recovery$indy$flow$236(java.lang.Object a0,double a1,double a2,double a3);
    private static native java.lang.Object recovery$indy$flow$237(java.lang.Object a0,double a1,double a2,double a3);
    private static java.lang.Object recovery$indy$flow$238() {
        return net.C_47TI.field_48;
    }
    private static java.lang.Object recovery$indy$flow$240() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$244(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$245(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,java.lang.Object a3);
    private static int recovery$indy$flow$246(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$247(java.lang.Object a0,int a1) {
        return ((java.util.List) (a0)).get(a1);
    }

    private static native float recovery$indy$flow$249(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$250(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$251(java.lang.Object a0,double a1,double a2,double a3);
    private static native java.lang.Object recovery$indy$flow$252(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2);
    private static native boolean recovery$indy$flow$253(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$254() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static void recovery$indy$flow$257(java.lang.Object a0,java.lang.Object a1) {
        ((net.C_46I) (a0)).field_45g = ((net.minecraft.entity.Entity) (a1));
        return;
    }


    private static native double recovery$indy$flow$260(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$262() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static void recovery$indy$flow$265(java.lang.Object a0,java.lang.Object a1) {
        ((net.C_46I) (a0)).field_45g = ((net.minecraft.entity.Entity) (a1));
        return;
    }

    private static java.lang.Object recovery$indy$flow$267() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static void recovery$indy$flow$270(java.lang.Object a0,java.lang.Object a1) {
        ((net.C_46I) (a0)).field_45g = ((net.minecraft.entity.Entity) (a1));
        return;
    }

    private static java.lang.Object recovery$indy$flow$272() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }



    private static native double recovery$indy$flow$276(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$277() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static void recovery$indy$flow$280(java.lang.Object a0,java.lang.Object a1) {
        ((net.C_46I) (a0)).field_45g = ((net.minecraft.entity.Entity) (a1));
        return;
    }
    private static java.lang.Object recovery$indy$flow$281() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }
    private static java.lang.Object recovery$indy$flow$283() {
        return net.C_47Az.MISS;
    }


    private static void recovery$indy$flow$289(java.lang.Object a0,java.lang.Object a1) {
        ((net.minecraft.client.Minecraft) (a0)).field_42Y = ((net.C_47Ij) (a1));
        return;
    }
    private static java.lang.Object recovery$indy$flow$290() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }



    private static java.lang.Object recovery$indy$flow$294() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }


    private static java.lang.Object recovery$indy$flow$297() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }
    private static java.lang.Object recovery$indy$flow$299() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }




    private static void recovery$indy$flow$305(java.lang.Object a0,java.lang.Object a1) {
        ((net.minecraft.client.Minecraft) (a0)).field_42Y = ((net.C_47Ij) (a1));
        return;
    }
    private static java.lang.Object recovery$indy$flow$306() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }



    private static boolean recovery$indy$flow$310(java.lang.Object a0) {
        return (a0 instanceof net.minecraft.entity.EntityLivingBase);
    }
    private static java.lang.Object recovery$indy$flow$311() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }



    private static boolean recovery$indy$flow$315(java.lang.Object a0) {
        return (a0 instanceof net.C_47aw);
    }
    private static java.lang.Object recovery$indy$flow$316() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }
    private static java.lang.Object recovery$indy$flow$317() {
        return augustus.recovered.modules.player.ChestAura_47Qh.field_43;
    }




    private static void recovery$indy$flow$322(java.lang.Object a0,java.lang.Object a1) {
        ((net.minecraft.client.Minecraft) (a0)).field_44x = ((net.minecraft.entity.Entity) (a1));
        return;
    }
    private static native void recovery$indy$flow$571(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$574(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$577(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$580(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$583(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$586(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$589(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$592(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$595(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$598(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$601(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$604(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$607(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$608(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.ChestAura_47Qh) (a0)).field_46 = ((net.C_47K) (a1));
        return;
    }
    private static void recovery$indy$flow$609(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.ChestAura_47Qh) (a0)).field_48 = ((net.C_47tf) (a1));
        return;
    }
    private static void recovery$indy$flow$610(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.ChestAura_47Qh) (a0)).field_45 = ((net.minecraft.client.multiplayer.WorldClient) (a1));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native WorldClient recovery$indy$2(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(long var0, long var2);
   private static native boolean recovery$indy$8(Object var0, long var1, long var3);
   private static native boolean recovery$indy$9(Object var0, char var1, int var2, Object var3, char var4, long var5, long var7);
   private static native float recovery$indy$10(long var0, long var2, long var4);
   private static native void recovery$indy$11(Object var0, float var1, long var2, long var4);
   private static native boolean recovery$indy$12(long var0, long var2);
   private static native boolean recovery$indy$13(Object var0, long var1, long var3);
   private static native boolean recovery$indy$14(Object var0, char var1, int var2, Object var3, char var4, long var5, long var7);
   private static native float recovery$indy$15(long var0, long var2, long var4);
   private static native void recovery$indy$16(Object var0, float var1, long var2, long var4);
   private static native boolean recovery$indy$17(long var0, long var2);
   private static native boolean recovery$indy$18(Object var0, long var1, long var3);
   private static native boolean recovery$indy$19(Object var0, char var1, int var2, Object var3, char var4, long var5, long var7);
   private static native void recovery$indy$20(Object var0, Object var1, long var2, long var4);
   private static native void recovery$indy$21(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$23(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$24(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$25(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$26(Object var0, char var1, int var2, Object var3, char var4, long var5, long var7);
   private static native void recovery$indy$27(Object var0, float var1, short var2, int var3, short var4, long var5, long var7);
   private static native Predicate recovery$indy$28(ChestAura_47Qh var0);
   private static native Predicate recovery$indy$29(ChestAura_47Qh var0);
   private static native ToDoubleFunction recovery$indy$30();
   private static native MethodHandle recovery$constant$31();
}
