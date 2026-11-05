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
import net.C_40g;
import net.C_43r;
import net.C_45D;
import net.C_45S;
import net.C_45U;
import net.C_45V;
import net.C_45Y;
import net.C_45r;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47DW;
import net.C_47Ij;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.RangeSetting;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import net.C_47oo;
import net.C_47rf;
import net.C_47ru;
import client.module.Category;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoTool_47Qv extends client.module.Module implements net.C_48T {
    private final client.setting.BooleanSetting settingTools = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSword = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDelayBeforeSwitch = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDelayAtItemSwitch = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingBackSwitchDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyAtSneak = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSilent = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    public static boolean field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private double method_40$60125b624c(long var1, C_47rf var3) {
      var1 = a ^ var1;
      boolean var4 = recovery$indy$1(-259907730234482804L, var1);
      double var5 = 0.0;
      C_47rf var10000 = var3;
      if (!var4) {
         if (var3 == null) {
            return var5;
         }

         var10000 = var3;
      }

      boolean var16 = var10000.method_48$dbd570a038() instanceof C_45V;
      if (!var4) {
         if (var16) {
            var5 += ((C_45V)var3.method_48$dbd570a038()).method_40$bc607678b6() + C_47ru.method_47$6eb1f4c276(C_47DW.field_488.field_48X, var3) * 1.25F;
            var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_48A.field_48X, var3) / 11.0;
            var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_45.field_48X, var3) / 11.0;
            var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_46.field_48X, var3) / 11.0;
            double var17 = var5 - var3.method_43$8abf5c6871() / 10000.0;
            if (var1 <= 0L) {
               return var17;
            }

            var5 = var17;
            if (!var4) {
               return var5;
            }
         }

         var16 = var3.method_48$dbd570a038() instanceof C_45r;
      }

      if (var16) {
         var5 += ((C_45r)var3.method_48$dbd570a038()).method_47$bc607678b6() + C_47ru.method_47$6eb1f4c276(C_47DW.field_488.field_48X, var3) * 1.25F;
         var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_48A.field_48X, var3) / 11.0;
         var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_45.field_48X, var3) / 11.0;
         var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_46.field_48X, var3) / 11.0;
         var5 -= var3.method_43$8abf5c6871() / 10000.0;
      }

      return var5;
   }




   private double method_49$1af1d0a9dd(long var1, C_47rf var3, C_47Ij var4) {
      net.C_43r var16;
      var1 = a ^ var1;
      boolean var5 = recovery$indy$2(-5565681343354722960L, var1);
      double var6 = 0.0;
      C_47rf var10000 = var3;
      if (var5) {
         if (var3 == null) {
            return 1.0;
         }

         var10000 = var3;
      }

      var16 = var10000.method_48$dbd570a038();
      label97:
      if (var5) {
         if (!(var16 instanceof C_45r)) {
            var16 = var3.method_48$dbd570a038();
            if (!var5) {
               break label97;
            }

            if (!(var16 instanceof C_45V)) {
               var16 = var3.method_48$dbd570a038();
               if (!var5) {
                  break label97;
               }

               if (!(var16 instanceof C_45D)) {
                  return 1.0;
               }
            }
         }

         var16 = var3.method_48$dbd570a038();
      }

      label81: {
         double var8;
         label104: {
            label105: {
               var8 = var16.method_46$2a6db11640(
                  var3, recovery$indy$3(field_43, -5566442127603573528L, var1).method_46$efbf73d2b1(var4.method_49$5730377d31()).method_48$e084f7739d()
               );
               C_43r var10 = var3.method_48$dbd570a038();
               boolean var17 = var10 instanceof C_45S;
               boolean var10001 = var5;
               if (var1 >= 0L) {
                  if (var5) {
                     if (var17) {
                        break label105;
                     }

                     var17 = var10 instanceof C_45Y;
                  }

                  var10001 = var5;
               }

               if (var10001) {
                  if (var17) {
                     break label105;
                  }

                  var17 = var3.method_48$dbd570a038() instanceof C_45U;
               }

               if (!var17) {
                  break label104;
               }
            }

            double var18;
            int var10002 = (var18 = var8 - 1.0) == 0.0 ? 0 : (var18 < 0.0 ? -1 : 1);
            if (var5) {
               var10002 = var10002 > 0 ? C_47ru.method_47$6eb1f4c276(C_47DW.field_48P.field_48X, var3) : 0;
            }

            var6 += var8 + var10002;
            if (var1 < 0L) {
               return var6;
            }

            if (var5) {
               break label81;
            }
         }

         var6 = var8;
      }

      var6 += C_47ru.method_47$6eb1f4c276(C_47DW.field_46.field_48X, var3) / 11.0;
      var6 += C_47ru.method_47$6eb1f4c276(C_47DW.field_48I.field_48X, var3) / 11.0;
      var6 += C_47ru.method_47$6eb1f4c276(C_47DW.field_488.field_48X, var3) / 33.0;
      return var6 - var3.method_43$8abf5c6871() / 10000.0;
   }




   private void method_47$3f94bc4175(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      boolean var6 = recovery$indy$4(-323483129750557648L, var4);
      AutoTool_47Qv var10000 = this;
      if (var6) {
         if (this.field_438 > 1) {
            recovery$indy$5(this.settingBackSwitchDelay, -320124747846872337L, var4);
         }

         var10000 = this;
      }

      var10000.field_438 = 0;
   }



    public void method_40G$e45a9973e5(long a0) {
        long computed6;
        long computed8;
        long computed10;
        long computed11;
        int converted12;
        long computed14;
        long computed15;
        int converted16;
        long computed18;
        long computed19;
        int converted20;
        long computed22;
        long computed24;
        long computed26;
        long computed27;
        int converted28;
        long computed30;
        long computed31;
        int converted32;
        long computed34;
        long computed35;
        int converted36;
        long computed38;
        long computed40;
        double value42;
        boolean value43;
        java.lang.Object value44;
        java.lang.Object value45;
        int value47;
        int value48;
        int regionValue58;
        java.lang.Object value103;
        java.lang.Object value104;
        boolean value105;
        int regionValue114;
        int regionValue115;
        int edgeValue125;
        int edgeValue161;
        double value276;
        java.lang.Object value277;
        boolean value278;
        java.lang.Object value351;
        java.lang.Object regionValue370;
        java.lang.Object value390;
        java.lang.Object value391;
        java.lang.Object value392;
        int value393;
        java.lang.Object value394;
        java.lang.Object value395;
        java.lang.Object value415;
        java.lang.Object value416;
        java.lang.Object value417;
        boolean value418;
        int comparison419;
        int regionValue431;
        double regionValue432;
        java.lang.Object regionValue433;
        int regionValue434;
        java.lang.Object edgeValue449;
        int edgeValue450;
        java.lang.Object regionValue470;
        java.lang.Object edgeValue491;
        int edgeValue492;
        int regionValue505;
        double regionValue506;
        java.lang.Object regionValue507;
        int regionValue508;
        java.lang.Object edgeValue522;
        java.lang.Object regionValue542;
        java.lang.Object edgeValue562;
        java.lang.Object regionValue582;
        java.lang.Object edgeValue602;
        int regionValue615;
        double regionValue616;
        java.lang.Object regionValue617;
        java.lang.Object edgeValue631;
        java.lang.Object regionValue650;
        java.lang.Object edgeValue669;
        int value670;
        int regionValue687;
        double regionValue688;
        java.lang.Object regionValue689;
        int regionValue690;
        java.lang.Object edgeValue709;
        java.lang.Object value711;
        java.lang.Object value712;
        java.lang.Object value713;
        java.lang.Object value714;
        int value715;
        int edgeValue727;
        double edgeValue728;
        java.lang.Object edgeValue729;
        int regionValue746;
        double regionValue747;
        java.lang.Object regionValue748;
        int regionValue749;
        int edgeValue766;
        double edgeValue767;
        java.lang.Object edgeValue768;
        int edgeValue769;
        java.lang.Object value770;
        java.lang.Object value771;
        java.lang.Object value772;
        java.lang.Object value773;
        java.lang.Object value774;
        java.lang.Object value775;
        int comparison776;
        int regionValue793;
        double regionValue794;
        java.lang.Object regionValue795;
        int regionValue796;
        java.lang.Object regionValue797;
        java.lang.Object regionValue798;
        int edgeValue816;
        double edgeValue817;
        java.lang.Object edgeValue818;
        int edgeValue819;
        java.lang.Object edgeValue820;
        java.lang.Object edgeValue821;
        int regionValue839;
        double regionValue840;
        java.lang.Object regionValue841;
        int regionValue842;
        java.lang.Object regionValue843;
        java.lang.Object regionValue844;
        int edgeValue862;
        double edgeValue863;
        java.lang.Object edgeValue864;
        int edgeValue865;
        java.lang.Object edgeValue866;
        java.lang.Object edgeValue867;
        int regionValue879;
        double regionValue880;
        java.lang.Object regionValue881;
        int regionValue882;
        java.lang.Object regionValue883;
        java.lang.Object regionValue884;
        int edgeValue895;
        double edgeValue896;
        java.lang.Object edgeValue897;
        int edgeValue898;
        java.lang.Object edgeValue899;
        java.lang.Object edgeValue900;
        int regionValue917;
        double regionValue918;
        java.lang.Object regionValue919;
        int regionValue920;
        java.lang.Object regionValue921;
        java.lang.Object regionValue922;
        int edgeValue939;
        double edgeValue940;
        java.lang.Object edgeValue941;
        int edgeValue942;
        java.lang.Object edgeValue943;
        java.lang.Object edgeValue944;
        int regionValue961;
        double regionValue962;
        java.lang.Object regionValue963;
        int regionValue964;
        java.lang.Object regionValue965;
        java.lang.Object regionValue966;
        int edgeValue983;
        double edgeValue984;
        java.lang.Object edgeValue985;
        int edgeValue986;
        java.lang.Object edgeValue987;
        java.lang.Object edgeValue988;
        int edgeValue1005;
        double edgeValue1006;
        java.lang.Object edgeValue1007;
        int edgeValue1008;
        java.lang.Object edgeValue1009;
        java.lang.Object edgeValue1010;
        int regionValue1028;
        double regionValue1029;
        java.lang.Object regionValue1030;
        int regionValue1031;
        java.lang.Object regionValue1032;
        java.lang.Object regionValue1033;
        int edgeValue1050;
        double edgeValue1051;
        java.lang.Object edgeValue1052;
        int edgeValue1053;
        java.lang.Object edgeValue1054;
        java.lang.Object edgeValue1055;
        int regionValue1072;
        double regionValue1073;
        java.lang.Object regionValue1074;
        int regionValue1075;
        java.lang.Object regionValue1076;
        java.lang.Object regionValue1077;
        int edgeValue1094;
        double edgeValue1095;
        java.lang.Object edgeValue1096;
        int edgeValue1097;
        java.lang.Object edgeValue1098;
        java.lang.Object edgeValue1099;
        int regionValue1116;
        double regionValue1117;
        java.lang.Object regionValue1118;
        int regionValue1119;
        java.lang.Object regionValue1120;
        int edgeValue1137;
        double edgeValue1138;
        java.lang.Object edgeValue1139;
        int edgeValue1140;
        java.lang.Object edgeValue1141;
        int regionValue1158;
        double regionValue1159;
        java.lang.Object regionValue1160;
        int regionValue1161;
        int edgeValue1178;
        double edgeValue1179;
        java.lang.Object edgeValue1180;
        int edgeValue1181;
        int regionValue1198;
        double regionValue1199;
        java.lang.Object regionValue1200;
        int regionValue1201;
        int edgeValue1218;
        double edgeValue1219;
        java.lang.Object edgeValue1220;
        int edgeValue1221;
        int edgeValue1238;
        double edgeValue1239;
        java.lang.Object edgeValue1240;
        int edgeValue1241;
        java.lang.Object edgeValue1242;
        java.lang.Object edgeValue1243;
        java.lang.Object value1244;
        java.lang.Object value1245;
        int regionValue1262;
        double regionValue1263;
        java.lang.Object regionValue1264;
        int regionValue1265;
        java.lang.Object regionValue1266;
        java.lang.Object regionValue1267;
        int edgeValue1285;
        double edgeValue1286;
        java.lang.Object edgeValue1287;
        int edgeValue1288;
        java.lang.Object edgeValue1289;
        java.lang.Object edgeValue1290;
        int regionValue1308;
        double regionValue1309;
        java.lang.Object regionValue1310;
        int regionValue1311;
        java.lang.Object regionValue1312;
        java.lang.Object regionValue1313;
        int edgeValue1331;
        double edgeValue1332;
        java.lang.Object edgeValue1333;
        int edgeValue1334;
        java.lang.Object edgeValue1335;
        java.lang.Object edgeValue1336;
        java.lang.Object value1338;
        java.lang.Object value1339;
        int regionValue1356;
        double regionValue1357;
        java.lang.Object regionValue1358;
        int regionValue1359;
        java.lang.Object regionValue1360;
        int edgeValue1377;
        double edgeValue1378;
        java.lang.Object edgeValue1379;
        int edgeValue1380;
        java.lang.Object edgeValue1381;
        int regionValue1398;
        double regionValue1399;
        java.lang.Object regionValue1400;
        int regionValue1401;
        java.lang.Object regionValue1402;
        java.lang.Object regionValue1403;
        int edgeValue1420;
        double edgeValue1421;
        java.lang.Object edgeValue1422;
        int edgeValue1423;
        java.lang.Object edgeValue1424;
        java.lang.Object edgeValue1425;
        int regionValue1442;
        double regionValue1443;
        java.lang.Object regionValue1444;
        int regionValue1445;
        java.lang.Object regionValue1446;
        java.lang.Object regionValue1447;
        int edgeValue1464;
        double edgeValue1465;
        java.lang.Object edgeValue1466;
        int edgeValue1467;
        java.lang.Object edgeValue1468;
        java.lang.Object edgeValue1469;
        int edgeValue1486;
        double edgeValue1487;
        java.lang.Object edgeValue1488;
        int edgeValue1489;
        java.lang.Object edgeValue1490;
        java.lang.Object edgeValue1491;
        java.lang.Object value1493;
        int edgeValue1510;
        double edgeValue1511;
        java.lang.Object edgeValue1512;
        int edgeValue1513;
        java.lang.Object edgeValue1514;
        int regionValue1531;
        double regionValue1532;
        java.lang.Object regionValue1533;
        int regionValue1534;
        java.lang.Object regionValue1535;
        java.lang.Object regionValue1536;
        int edgeValue1553;
        double edgeValue1554;
        java.lang.Object edgeValue1555;
        int edgeValue1556;
        java.lang.Object edgeValue1557;
        java.lang.Object edgeValue1558;
        java.lang.Object value1559;
        boolean value1560;
        int regionValue1577;
        double regionValue1578;
        java.lang.Object regionValue1579;
        int regionValue1580;
        java.lang.Object regionValue1581;
        int regionValue1582;
        int edgeValue1599;
        double edgeValue1600;
        java.lang.Object edgeValue1601;
        int edgeValue1602;
        java.lang.Object edgeValue1603;
        int edgeValue1604;
        int regionValue1621;
        double regionValue1622;
        java.lang.Object regionValue1623;
        int regionValue1624;
        java.lang.Object regionValue1625;
        java.lang.Object regionValue1626;
        int regionValue1627;
        int edgeValue1644;
        double edgeValue1645;
        java.lang.Object edgeValue1646;
        int edgeValue1647;
        java.lang.Object edgeValue1648;
        java.lang.Object edgeValue1649;
        int edgeValue1650;
        int regionValue1667;
        double regionValue1668;
        java.lang.Object regionValue1669;
        int regionValue1670;
        java.lang.Object regionValue1671;
        java.lang.Object regionValue1672;
        int regionValue1673;
        int edgeValue1690;
        double edgeValue1691;
        java.lang.Object edgeValue1692;
        int edgeValue1693;
        java.lang.Object edgeValue1694;
        java.lang.Object edgeValue1695;
        int edgeValue1696;
        int edgeValue1713;
        double edgeValue1714;
        java.lang.Object edgeValue1715;
        int edgeValue1716;
        java.lang.Object edgeValue1717;
        int regionValue1734;
        double regionValue1735;
        java.lang.Object regionValue1736;
        int regionValue1737;
        java.lang.Object regionValue1738;
        java.lang.Object regionValue1739;
        int edgeValue1756;
        double edgeValue1757;
        java.lang.Object edgeValue1758;
        int edgeValue1759;
        java.lang.Object edgeValue1760;
        java.lang.Object edgeValue1761;
        int regionValue1778;
        double regionValue1779;
        java.lang.Object regionValue1780;
        int regionValue1781;
        java.lang.Object regionValue1782;
        java.lang.Object regionValue1783;
        int edgeValue1800;
        double edgeValue1801;
        java.lang.Object edgeValue1802;
        int edgeValue1803;
        java.lang.Object edgeValue1804;
        java.lang.Object edgeValue1805;
        boolean value1806;
        int comparison1807;
        int regionValue1824;
        double regionValue1825;
        java.lang.Object regionValue1826;
        int regionValue1827;
        java.lang.Object regionValue1828;
        java.lang.Object regionValue1829;
        int regionValue1830;
        int edgeValue1848;
        double edgeValue1849;
        java.lang.Object edgeValue1850;
        int edgeValue1851;
        java.lang.Object edgeValue1852;
        java.lang.Object edgeValue1853;
        int edgeValue1854;
        int regionValue1872;
        double regionValue1873;
        java.lang.Object regionValue1874;
        int regionValue1875;
        java.lang.Object regionValue1876;
        java.lang.Object regionValue1877;
        int regionValue1878;
        int edgeValue1896;
        double edgeValue1897;
        java.lang.Object edgeValue1898;
        int edgeValue1899;
        java.lang.Object edgeValue1900;
        java.lang.Object edgeValue1901;
        int edgeValue1902;
        int regionValue1920;
        double regionValue1921;
        java.lang.Object regionValue1922;
        int regionValue1923;
        java.lang.Object regionValue1924;
        java.lang.Object regionValue1925;
        int regionValue1926;
        int edgeValue1944;
        double edgeValue1945;
        java.lang.Object edgeValue1946;
        int edgeValue1947;
        java.lang.Object edgeValue1948;
        java.lang.Object edgeValue1949;
        int edgeValue1950;
        int regionValue1968;
        double regionValue1969;
        java.lang.Object regionValue1970;
        int regionValue1971;
        java.lang.Object regionValue1972;
        java.lang.Object regionValue1973;
        int regionValue1974;
        int edgeValue1991;
        double edgeValue1992;
        java.lang.Object edgeValue1993;
        int edgeValue1994;
        java.lang.Object edgeValue1995;
        java.lang.Object edgeValue1996;
        int edgeValue1997;
        int regionValue2014;
        double regionValue2015;
        java.lang.Object regionValue2016;
        int regionValue2017;
        java.lang.Object regionValue2018;
        java.lang.Object regionValue2019;
        int regionValue2020;
        int edgeValue2037;
        double edgeValue2038;
        java.lang.Object edgeValue2039;
        int edgeValue2040;
        java.lang.Object edgeValue2041;
        java.lang.Object edgeValue2042;
        int edgeValue2043;
        int regionValue2060;
        double regionValue2061;
        java.lang.Object regionValue2062;
        int regionValue2063;
        java.lang.Object regionValue2064;
        java.lang.Object regionValue2065;
        int regionValue2066;
        int edgeValue2083;
        double edgeValue2084;
        java.lang.Object edgeValue2085;
        int edgeValue2086;
        java.lang.Object edgeValue2087;
        java.lang.Object edgeValue2088;
        int edgeValue2089;
        int regionValue2106;
        double regionValue2107;
        java.lang.Object regionValue2108;
        int regionValue2109;
        java.lang.Object regionValue2110;
        java.lang.Object regionValue2111;
        int edgeValue2128;
        double edgeValue2129;
        java.lang.Object edgeValue2130;
        int edgeValue2131;
        java.lang.Object edgeValue2132;
        java.lang.Object edgeValue2133;
        int regionValue2150;
        double regionValue2151;
        java.lang.Object regionValue2152;
        int regionValue2153;
        java.lang.Object regionValue2154;
        java.lang.Object regionValue2155;
        int edgeValue2172;
        double edgeValue2173;
        java.lang.Object edgeValue2174;
        int edgeValue2175;
        java.lang.Object edgeValue2176;
        java.lang.Object edgeValue2177;
        java.lang.Object value2178;
        java.lang.Object value2179;
        java.lang.Object value2180;
        boolean value2181;
        int edgeValue2198;
        double edgeValue2199;
        java.lang.Object edgeValue2200;
        int edgeValue2201;
        java.lang.Object edgeValue2202;
        int edgeValue2203;
        int regionValue2220;
        double regionValue2221;
        java.lang.Object regionValue2222;
        int regionValue2223;
        java.lang.Object regionValue2224;
        java.lang.Object regionValue2225;
        int regionValue2226;
        int edgeValue2243;
        double edgeValue2244;
        java.lang.Object edgeValue2245;
        int edgeValue2246;
        java.lang.Object edgeValue2247;
        java.lang.Object edgeValue2248;
        int edgeValue2249;
        int regionValue2266;
        double regionValue2267;
        java.lang.Object regionValue2268;
        int regionValue2269;
        java.lang.Object regionValue2270;
        java.lang.Object regionValue2271;
        int regionValue2272;
        int edgeValue2289;
        double edgeValue2290;
        java.lang.Object edgeValue2291;
        int edgeValue2292;
        java.lang.Object edgeValue2293;
        java.lang.Object edgeValue2294;
        int edgeValue2295;
        int edgeValue2312;
        double edgeValue2313;
        java.lang.Object edgeValue2314;
        int edgeValue2315;
        java.lang.Object edgeValue2316;
        int regionValue2333;
        double regionValue2334;
        java.lang.Object regionValue2335;
        int regionValue2336;
        java.lang.Object regionValue2337;
        java.lang.Object regionValue2338;
        int edgeValue2355;
        double edgeValue2356;
        java.lang.Object edgeValue2357;
        int edgeValue2358;
        java.lang.Object edgeValue2359;
        java.lang.Object edgeValue2360;
        int edgeValue2377;
        double edgeValue2378;
        java.lang.Object edgeValue2379;
        int edgeValue2380;
        java.lang.Object edgeValue2381;
        java.lang.Object edgeValue2382;
        boolean value2383;
        int edgeValue2400;
        double edgeValue2401;
        java.lang.Object edgeValue2402;
        int edgeValue2403;
        java.lang.Object edgeValue2404;
        java.lang.Object edgeValue2405;
        int edgeValue2406;
        int edgeValue2423;
        double edgeValue2424;
        java.lang.Object edgeValue2425;
        int edgeValue2426;
        java.lang.Object edgeValue2427;
        java.lang.Object edgeValue2428;
        int edgeValue2429;
        int comparison2431;
        int regionValue2448;
        double regionValue2449;
        java.lang.Object regionValue2450;
        int regionValue2451;
        java.lang.Object regionValue2452;
        java.lang.Object regionValue2453;
        int regionValue2454;
        int edgeValue2472;
        double edgeValue2473;
        java.lang.Object edgeValue2474;
        int edgeValue2475;
        java.lang.Object edgeValue2476;
        java.lang.Object edgeValue2477;
        int edgeValue2478;
        int regionValue2496;
        double regionValue2497;
        java.lang.Object regionValue2498;
        int regionValue2499;
        java.lang.Object regionValue2500;
        java.lang.Object regionValue2501;
        int regionValue2502;
        int edgeValue2520;
        double edgeValue2521;
        java.lang.Object edgeValue2522;
        int edgeValue2523;
        java.lang.Object edgeValue2524;
        java.lang.Object edgeValue2525;
        int edgeValue2526;
        int regionValue2544;
        double regionValue2545;
        java.lang.Object regionValue2546;
        int regionValue2547;
        java.lang.Object regionValue2548;
        java.lang.Object regionValue2549;
        int regionValue2550;
        int edgeValue2567;
        double edgeValue2568;
        java.lang.Object edgeValue2569;
        int edgeValue2570;
        java.lang.Object edgeValue2571;
        java.lang.Object edgeValue2572;
        int edgeValue2573;
        int regionValue2590;
        double regionValue2591;
        java.lang.Object regionValue2592;
        int regionValue2593;
        java.lang.Object regionValue2594;
        java.lang.Object regionValue2595;
        int regionValue2596;
        int edgeValue2613;
        double edgeValue2614;
        java.lang.Object edgeValue2615;
        int edgeValue2616;
        java.lang.Object edgeValue2617;
        java.lang.Object edgeValue2618;
        int edgeValue2619;
        int regionValue2636;
        double regionValue2637;
        java.lang.Object regionValue2638;
        int regionValue2639;
        java.lang.Object regionValue2640;
        java.lang.Object regionValue2641;
        int regionValue2642;
        int edgeValue2659;
        double edgeValue2660;
        java.lang.Object edgeValue2661;
        int edgeValue2662;
        java.lang.Object edgeValue2663;
        java.lang.Object edgeValue2664;
        int edgeValue2665;
        int regionValue2682;
        double regionValue2683;
        java.lang.Object regionValue2684;
        int regionValue2685;
        java.lang.Object regionValue2686;
        int edgeValue2703;
        double edgeValue2704;
        java.lang.Object edgeValue2705;
        int edgeValue2706;
        java.lang.Object edgeValue2707;
        int regionValue2724;
        double regionValue2725;
        java.lang.Object regionValue2726;
        int regionValue2727;
        java.lang.Object regionValue2728;
        java.lang.Object regionValue2729;
        int edgeValue2746;
        double edgeValue2747;
        java.lang.Object edgeValue2748;
        int edgeValue2749;
        java.lang.Object edgeValue2750;
        java.lang.Object edgeValue2751;
        boolean value2752;
        int edgeValue2769;
        double edgeValue2770;
        java.lang.Object edgeValue2771;
        int edgeValue2772;
        java.lang.Object edgeValue2773;
        java.lang.Object edgeValue2774;
        int edgeValue2775;
        int edgeValue2792;
        double edgeValue2793;
        java.lang.Object edgeValue2794;
        int edgeValue2795;
        java.lang.Object edgeValue2796;
        java.lang.Object edgeValue2797;
        int edgeValue2798;
        int regionValue2816;
        double regionValue2817;
        java.lang.Object regionValue2818;
        int regionValue2819;
        java.lang.Object regionValue2820;
        int regionValue2821;
        int edgeValue2838;
        double edgeValue2839;
        java.lang.Object edgeValue2840;
        int edgeValue2841;
        java.lang.Object edgeValue2842;
        int edgeValue2843;
        int regionValue2860;
        double regionValue2861;
        java.lang.Object regionValue2862;
        int regionValue2863;
        java.lang.Object regionValue2864;
        java.lang.Object regionValue2865;
        int regionValue2866;
        int edgeValue2883;
        double edgeValue2884;
        java.lang.Object edgeValue2885;
        int edgeValue2886;
        java.lang.Object edgeValue2887;
        java.lang.Object edgeValue2888;
        int edgeValue2889;
        int regionValue2906;
        double regionValue2907;
        java.lang.Object regionValue2908;
        int regionValue2909;
        java.lang.Object regionValue2910;
        java.lang.Object regionValue2911;
        int edgeValue2928;
        double edgeValue2929;
        java.lang.Object edgeValue2930;
        int edgeValue2931;
        java.lang.Object edgeValue2932;
        java.lang.Object edgeValue2933;
        int regionValue2950;
        double regionValue2951;
        java.lang.Object regionValue2952;
        int regionValue2953;
        java.lang.Object regionValue2954;
        java.lang.Object regionValue2955;
        int edgeValue2972;
        double edgeValue2973;
        java.lang.Object edgeValue2974;
        int edgeValue2975;
        java.lang.Object edgeValue2976;
        java.lang.Object edgeValue2977;
        java.lang.Object value2978;
        java.lang.Object value2979;
        java.lang.Object value2980;
        java.lang.Object value2981;
        java.lang.Object value2982;
        java.lang.Object value2983;
        boolean value2984;
        int comparison2985;
        int regionValue3002;
        double regionValue3003;
        java.lang.Object regionValue3004;
        int regionValue3005;
        java.lang.Object regionValue3006;
        int regionValue3007;
        int edgeValue3025;
        double edgeValue3026;
        java.lang.Object edgeValue3027;
        int edgeValue3028;
        java.lang.Object edgeValue3029;
        int edgeValue3030;
        int regionValue3048;
        double regionValue3049;
        java.lang.Object regionValue3050;
        int regionValue3051;
        java.lang.Object regionValue3052;
        java.lang.Object regionValue3053;
        int regionValue3054;
        int edgeValue3072;
        double edgeValue3073;
        java.lang.Object edgeValue3074;
        int edgeValue3075;
        java.lang.Object edgeValue3076;
        java.lang.Object edgeValue3077;
        int edgeValue3078;
        int regionValue3096;
        double regionValue3097;
        java.lang.Object regionValue3098;
        int regionValue3099;
        java.lang.Object regionValue3100;
        java.lang.Object regionValue3101;
        int regionValue3102;
        int edgeValue3120;
        double edgeValue3121;
        java.lang.Object edgeValue3122;
        int edgeValue3123;
        java.lang.Object edgeValue3124;
        java.lang.Object edgeValue3125;
        int edgeValue3126;
        int edgeValue3144;
        double edgeValue3145;
        java.lang.Object edgeValue3146;
        int edgeValue3147;
        java.lang.Object edgeValue3148;
        int edgeValue3149;
        int regionValue3166;
        double regionValue3167;
        java.lang.Object regionValue3168;
        int regionValue3169;
        java.lang.Object regionValue3170;
        java.lang.Object regionValue3171;
        int regionValue3172;
        int edgeValue3189;
        double edgeValue3190;
        java.lang.Object edgeValue3191;
        int edgeValue3192;
        java.lang.Object edgeValue3193;
        java.lang.Object edgeValue3194;
        int edgeValue3195;
        int regionValue3212;
        double regionValue3213;
        java.lang.Object regionValue3214;
        int regionValue3215;
        java.lang.Object regionValue3216;
        java.lang.Object regionValue3217;
        int regionValue3218;
        int edgeValue3235;
        double edgeValue3236;
        java.lang.Object edgeValue3237;
        int edgeValue3238;
        java.lang.Object edgeValue3239;
        java.lang.Object edgeValue3240;
        int edgeValue3241;
        int edgeValue3258;
        double edgeValue3259;
        java.lang.Object edgeValue3260;
        int edgeValue3261;
        java.lang.Object edgeValue3262;
        int edgeValue3279;
        double edgeValue3280;
        java.lang.Object edgeValue3281;
        int edgeValue3282;
        java.lang.Object edgeValue3283;
        java.lang.Object edgeValue3284;
        boolean value3285;
        int edgeValue3302;
        double edgeValue3303;
        java.lang.Object edgeValue3304;
        int edgeValue3305;
        java.lang.Object edgeValue3306;
        int edgeValue3307;
        int edgeValue3324;
        double edgeValue3325;
        java.lang.Object edgeValue3326;
        int edgeValue3327;
        java.lang.Object edgeValue3328;
        int edgeValue3329;
        int edgeValue3347;
        double edgeValue3348;
        java.lang.Object edgeValue3349;
        int edgeValue3350;
        java.lang.Object edgeValue3351;
        int edgeValue3352;
        int regionValue3369;
        double regionValue3370;
        java.lang.Object regionValue3371;
        int regionValue3372;
        java.lang.Object regionValue3373;
        int regionValue3374;
        int edgeValue3391;
        double edgeValue3392;
        java.lang.Object edgeValue3393;
        int edgeValue3394;
        java.lang.Object edgeValue3395;
        int edgeValue3396;
        int edgeValue3413;
        double edgeValue3414;
        java.lang.Object edgeValue3415;
        int edgeValue3416;
        java.lang.Object edgeValue3417;
        int edgeValue3434;
        double edgeValue3435;
        java.lang.Object edgeValue3436;
        int edgeValue3437;
        java.lang.Object edgeValue3438;
        double value3439;
        double value3440;
        double value3441;
        double value3442;
        int comparison3443;
        int edgeValue3460;
        double edgeValue3461;
        java.lang.Object edgeValue3462;
        int edgeValue3463;
        java.lang.Object edgeValue3464;
        int edgeValue3465;
        int regionValue3482;
        double regionValue3483;
        java.lang.Object regionValue3484;
        int regionValue3485;
        java.lang.Object regionValue3486;
        double regionValue3487;
        double regionValue3488;
        int regionValue3489;
        int edgeValue3506;
        double edgeValue3507;
        java.lang.Object edgeValue3508;
        int edgeValue3509;
        java.lang.Object edgeValue3510;
        double edgeValue3511;
        double edgeValue3512;
        int edgeValue3513;
        int edgeValue3530;
        double edgeValue3531;
        java.lang.Object edgeValue3532;
        int edgeValue3533;
        java.lang.Object edgeValue3534;
        int regionValue3551;
        double regionValue3552;
        java.lang.Object regionValue3553;
        int regionValue3554;
        java.lang.Object regionValue3555;
        double regionValue3556;
        double regionValue3557;
        int edgeValue3574;
        double edgeValue3575;
        java.lang.Object edgeValue3576;
        int edgeValue3577;
        java.lang.Object edgeValue3578;
        double edgeValue3579;
        double edgeValue3580;
        int regionValue3597;
        double regionValue3598;
        java.lang.Object regionValue3599;
        int regionValue3600;
        java.lang.Object regionValue3601;
        double regionValue3602;
        double regionValue3603;
        int edgeValue3620;
        double edgeValue3621;
        java.lang.Object edgeValue3622;
        int edgeValue3623;
        java.lang.Object edgeValue3624;
        double edgeValue3625;
        double edgeValue3626;
        int comparison3627;
        int edgeValue3644;
        double edgeValue3645;
        java.lang.Object edgeValue3646;
        int edgeValue3647;
        java.lang.Object edgeValue3648;
        int edgeValue3649;
        int regionValue3666;
        double regionValue3667;
        java.lang.Object regionValue3668;
        int regionValue3669;
        java.lang.Object regionValue3670;
        double regionValue3671;
        int regionValue3672;
        int edgeValue3689;
        double edgeValue3690;
        java.lang.Object edgeValue3691;
        int edgeValue3692;
        java.lang.Object edgeValue3693;
        double edgeValue3694;
        int edgeValue3695;
        int regionValue3712;
        double regionValue3713;
        java.lang.Object regionValue3714;
        int regionValue3715;
        java.lang.Object regionValue3716;
        double regionValue3717;
        int regionValue3718;
        int edgeValue3735;
        double edgeValue3736;
        java.lang.Object edgeValue3737;
        int edgeValue3738;
        java.lang.Object edgeValue3739;
        double edgeValue3740;
        int edgeValue3741;
        int edgeValue3758;
        double edgeValue3759;
        java.lang.Object edgeValue3760;
        int edgeValue3761;
        java.lang.Object edgeValue3762;
        int regionValue3779;
        double regionValue3780;
        java.lang.Object regionValue3781;
        int regionValue3782;
        java.lang.Object regionValue3783;
        double regionValue3784;
        int edgeValue3801;
        double edgeValue3802;
        java.lang.Object edgeValue3803;
        int edgeValue3804;
        java.lang.Object edgeValue3805;
        double edgeValue3806;
        int regionValue3823;
        double regionValue3824;
        java.lang.Object regionValue3825;
        int regionValue3826;
        java.lang.Object regionValue3827;
        double regionValue3828;
        int edgeValue3845;
        double edgeValue3846;
        java.lang.Object edgeValue3847;
        int edgeValue3848;
        java.lang.Object edgeValue3849;
        double edgeValue3850;
        int comparison3851;
        int comparison3852;
        int regionValue3869;
        double regionValue3870;
        java.lang.Object regionValue3871;
        int regionValue3872;
        java.lang.Object regionValue3873;
        int regionValue3874;
        int edgeValue3892;
        double edgeValue3893;
        java.lang.Object edgeValue3894;
        int edgeValue3895;
        java.lang.Object edgeValue3896;
        int edgeValue3897;
        int regionValue3915;
        double regionValue3916;
        java.lang.Object regionValue3917;
        int regionValue3918;
        java.lang.Object regionValue3919;
        double regionValue3920;
        int regionValue3921;
        int edgeValue3939;
        double edgeValue3940;
        java.lang.Object edgeValue3941;
        int edgeValue3942;
        java.lang.Object edgeValue3943;
        double edgeValue3944;
        int edgeValue3945;
        int regionValue3963;
        double regionValue3964;
        java.lang.Object regionValue3965;
        int regionValue3966;
        java.lang.Object regionValue3967;
        double regionValue3968;
        int regionValue3969;
        int edgeValue3987;
        double edgeValue3988;
        java.lang.Object edgeValue3989;
        int edgeValue3990;
        java.lang.Object edgeValue3991;
        double edgeValue3992;
        int edgeValue3993;
        int edgeValue4011;
        double edgeValue4012;
        java.lang.Object edgeValue4013;
        int edgeValue4014;
        java.lang.Object edgeValue4015;
        int edgeValue4016;
        int regionValue4033;
        double regionValue4034;
        java.lang.Object regionValue4035;
        int regionValue4036;
        java.lang.Object regionValue4037;
        double regionValue4038;
        int regionValue4039;
        int edgeValue4056;
        double edgeValue4057;
        java.lang.Object edgeValue4058;
        int edgeValue4059;
        java.lang.Object edgeValue4060;
        double edgeValue4061;
        int edgeValue4062;
        int regionValue4079;
        double regionValue4080;
        java.lang.Object regionValue4081;
        int regionValue4082;
        java.lang.Object regionValue4083;
        double regionValue4084;
        int regionValue4085;
        int edgeValue4102;
        double edgeValue4103;
        java.lang.Object edgeValue4104;
        int edgeValue4105;
        java.lang.Object edgeValue4106;
        double edgeValue4107;
        int edgeValue4108;
        int edgeValue4125;
        double edgeValue4126;
        java.lang.Object edgeValue4127;
        int edgeValue4128;
        java.lang.Object edgeValue4129;
        java.lang.Object regionValue4146;
        int regionValue4147;
        java.lang.Object regionValue4148;
        double regionValue4149;
        java.lang.Object edgeValue4166;
        int edgeValue4167;
        java.lang.Object edgeValue4168;
        double edgeValue4169;
        int computed4170;
        int value4171;
        double value4172;
        int edgeValue4189;
        double edgeValue4190;
        java.lang.Object edgeValue4191;
        int edgeValue4192;
        java.lang.Object edgeValue4193;
        java.lang.Object value4194;
        boolean value4195;
        int edgeValue4212;
        double edgeValue4213;
        java.lang.Object edgeValue4214;
        int edgeValue4215;
        java.lang.Object edgeValue4216;
        int edgeValue4217;
        int edgeValue4234;
        double edgeValue4235;
        java.lang.Object edgeValue4236;
        int edgeValue4237;
        java.lang.Object edgeValue4238;
        int edgeValue4239;
        int comparison4241;
        int regionValue4258;
        double regionValue4259;
        java.lang.Object regionValue4260;
        int regionValue4261;
        java.lang.Object regionValue4262;
        int regionValue4263;
        int edgeValue4281;
        double edgeValue4282;
        java.lang.Object edgeValue4283;
        int edgeValue4284;
        java.lang.Object edgeValue4285;
        int edgeValue4286;
        int regionValue4304;
        double regionValue4305;
        java.lang.Object regionValue4306;
        int regionValue4307;
        java.lang.Object regionValue4308;
        int regionValue4309;
        int edgeValue4327;
        double edgeValue4328;
        java.lang.Object edgeValue4329;
        int edgeValue4330;
        java.lang.Object edgeValue4331;
        int edgeValue4332;
        int regionValue4350;
        double regionValue4351;
        java.lang.Object regionValue4352;
        int regionValue4353;
        java.lang.Object regionValue4354;
        int regionValue4355;
        int edgeValue4372;
        double edgeValue4373;
        java.lang.Object edgeValue4374;
        int edgeValue4375;
        java.lang.Object edgeValue4376;
        int edgeValue4377;
        int regionValue4394;
        double regionValue4395;
        java.lang.Object regionValue4396;
        int regionValue4397;
        java.lang.Object regionValue4398;
        int regionValue4399;
        int edgeValue4416;
        double edgeValue4417;
        java.lang.Object edgeValue4418;
        int edgeValue4419;
        java.lang.Object edgeValue4420;
        int edgeValue4421;
        int regionValue4438;
        double regionValue4439;
        java.lang.Object regionValue4440;
        int regionValue4441;
        java.lang.Object regionValue4442;
        int regionValue4443;
        int edgeValue4460;
        double edgeValue4461;
        java.lang.Object edgeValue4462;
        int edgeValue4463;
        java.lang.Object edgeValue4464;
        int edgeValue4465;
        int edgeValue4482;
        double edgeValue4483;
        java.lang.Object edgeValue4484;
        int edgeValue4485;
        int regionValue4502;
        double regionValue4503;
        java.lang.Object regionValue4504;
        int regionValue4505;
        java.lang.Object regionValue4506;
        int edgeValue4523;
        double edgeValue4524;
        java.lang.Object edgeValue4525;
        int edgeValue4526;
        java.lang.Object edgeValue4527;
        java.lang.Object value4528;
        java.lang.Object value4529;
        boolean value4530;
        int edgeValue4547;
        double edgeValue4548;
        java.lang.Object edgeValue4549;
        int edgeValue4550;
        java.lang.Object edgeValue4551;
        int edgeValue4552;
        int edgeValue4569;
        double edgeValue4570;
        java.lang.Object edgeValue4571;
        int edgeValue4572;
        java.lang.Object edgeValue4573;
        int edgeValue4574;
        int regionValue4592;
        double regionValue4593;
        java.lang.Object regionValue4594;
        int regionValue4595;
        java.lang.Object regionValue4596;
        int regionValue4597;
        int edgeValue4614;
        double edgeValue4615;
        java.lang.Object edgeValue4616;
        int edgeValue4617;
        java.lang.Object edgeValue4618;
        int edgeValue4619;
        int regionValue4636;
        double regionValue4637;
        java.lang.Object regionValue4638;
        int regionValue4639;
        java.lang.Object regionValue4640;
        int regionValue4641;
        int edgeValue4658;
        double edgeValue4659;
        java.lang.Object edgeValue4660;
        int edgeValue4661;
        java.lang.Object edgeValue4662;
        int edgeValue4663;
        int edgeValue4680;
        double edgeValue4681;
        java.lang.Object edgeValue4682;
        int edgeValue4683;
        int regionValue4700;
        double regionValue4701;
        java.lang.Object regionValue4702;
        int regionValue4703;
        java.lang.Object regionValue4704;
        int edgeValue4721;
        double edgeValue4722;
        java.lang.Object edgeValue4723;
        int edgeValue4724;
        java.lang.Object edgeValue4725;
        java.lang.Object value4726;
        java.lang.Object value4727;
        java.lang.Object value4728;
        char converted4729;
        char converted4730;
        boolean value4731;
        int edgeValue4748;
        double edgeValue4749;
        java.lang.Object edgeValue4750;
        int edgeValue4751;
        java.lang.Object edgeValue4752;
        int edgeValue4753;
        int edgeValue4770;
        double edgeValue4771;
        java.lang.Object edgeValue4772;
        int edgeValue4773;
        int regionValue4790;
        double regionValue4791;
        java.lang.Object regionValue4792;
        int regionValue4793;
        java.lang.Object regionValue4794;
        int edgeValue4811;
        double edgeValue4812;
        java.lang.Object edgeValue4813;
        int edgeValue4814;
        java.lang.Object edgeValue4815;
        java.lang.Object value4816;
        java.lang.Object value4817;
        java.lang.Object value4818;
        int edgeValue4835;
        double edgeValue4836;
        java.lang.Object edgeValue4837;
        int edgeValue4838;
        int regionValue4855;
        double regionValue4856;
        java.lang.Object regionValue4857;
        int regionValue4858;
        java.lang.Object regionValue4859;
        int edgeValue4876;
        double edgeValue4877;
        java.lang.Object edgeValue4878;
        int edgeValue4879;
        java.lang.Object edgeValue4880;
        int regionValue4897;
        double regionValue4898;
        java.lang.Object regionValue4899;
        int regionValue4900;
        java.lang.Object regionValue4901;
        int edgeValue4918;
        double edgeValue4919;
        java.lang.Object edgeValue4920;
        int edgeValue4921;
        java.lang.Object edgeValue4922;
        double value4923;
        double value4924;
        double value4925;
        double value4926;
        int comparison4927;
        int regionValue4944;
        double regionValue4945;
        java.lang.Object regionValue4946;
        int regionValue4947;
        int edgeValue4965;
        double edgeValue4966;
        java.lang.Object edgeValue4967;
        int edgeValue4968;
        int regionValue4986;
        double regionValue4987;
        java.lang.Object regionValue4988;
        int regionValue4989;
        double regionValue4990;
        double regionValue4991;
        int edgeValue5009;
        double edgeValue5010;
        java.lang.Object edgeValue5011;
        int edgeValue5012;
        double edgeValue5013;
        double edgeValue5014;
        int regionValue5032;
        double regionValue5033;
        java.lang.Object regionValue5034;
        int regionValue5035;
        int edgeValue5052;
        double edgeValue5053;
        java.lang.Object edgeValue5054;
        int edgeValue5055;
        int regionValue5072;
        double regionValue5073;
        java.lang.Object regionValue5074;
        int regionValue5075;
        double regionValue5076;
        double regionValue5077;
        int edgeValue5094;
        double edgeValue5095;
        java.lang.Object edgeValue5096;
        int edgeValue5097;
        double edgeValue5098;
        double edgeValue5099;
        int regionValue5116;
        double regionValue5117;
        java.lang.Object regionValue5118;
        int regionValue5119;
        double regionValue5120;
        double regionValue5121;
        int edgeValue5138;
        double edgeValue5139;
        java.lang.Object edgeValue5140;
        int edgeValue5141;
        double edgeValue5142;
        double edgeValue5143;
        int comparison5144;
        int comparison5145;
        int regionValue5162;
        double regionValue5163;
        java.lang.Object regionValue5164;
        int regionValue5165;
        double regionValue5166;
        int regionValue5167;
        int edgeValue5184;
        double edgeValue5185;
        java.lang.Object edgeValue5186;
        int edgeValue5187;
        double edgeValue5188;
        int edgeValue5189;
        int regionValue5206;
        double regionValue5207;
        java.lang.Object regionValue5208;
        int regionValue5209;
        double regionValue5210;
        double regionValue5211;
        int regionValue5212;
        int edgeValue5229;
        double edgeValue5230;
        java.lang.Object edgeValue5231;
        int edgeValue5232;
        double edgeValue5233;
        double edgeValue5234;
        int edgeValue5235;
        int regionValue5252;
        double regionValue5253;
        java.lang.Object regionValue5254;
        int regionValue5255;
        double regionValue5256;
        double regionValue5257;
        int regionValue5258;
        int edgeValue5275;
        double edgeValue5276;
        java.lang.Object edgeValue5277;
        int edgeValue5278;
        double edgeValue5279;
        double edgeValue5280;
        int edgeValue5281;
        int edgeValue5298;
        double edgeValue5299;
        java.lang.Object edgeValue5300;
        int edgeValue5301;
        int regionValue5318;
        double regionValue5319;
        java.lang.Object regionValue5320;
        int regionValue5321;
        double regionValue5322;
        double regionValue5323;
        int edgeValue5340;
        double edgeValue5341;
        java.lang.Object edgeValue5342;
        int edgeValue5343;
        double edgeValue5344;
        double edgeValue5345;
        int regionValue5362;
        double regionValue5363;
        java.lang.Object regionValue5364;
        int regionValue5365;
        double regionValue5366;
        double regionValue5367;
        int edgeValue5384;
        double edgeValue5385;
        java.lang.Object edgeValue5386;
        int edgeValue5387;
        double edgeValue5388;
        double edgeValue5389;
        int comparison5390;
        int edgeValue5407;
        double edgeValue5408;
        java.lang.Object edgeValue5409;
        int edgeValue5410;
        double edgeValue5411;
        int edgeValue5412;
        int comparison5413;
        int regionValue5430;
        double regionValue5431;
        java.lang.Object regionValue5432;
        int regionValue5433;
        double regionValue5434;
        int regionValue5435;
        int edgeValue5453;
        double edgeValue5454;
        java.lang.Object edgeValue5455;
        int edgeValue5456;
        double edgeValue5457;
        int edgeValue5458;
        int regionValue5476;
        double regionValue5477;
        java.lang.Object regionValue5478;
        int regionValue5479;
        double regionValue5480;
        int regionValue5481;
        int edgeValue5499;
        double edgeValue5500;
        java.lang.Object edgeValue5501;
        int edgeValue5502;
        double edgeValue5503;
        int edgeValue5504;
        int regionValue5522;
        double regionValue5523;
        java.lang.Object regionValue5524;
        int regionValue5525;
        double regionValue5526;
        int regionValue5527;
        int edgeValue5544;
        double edgeValue5545;
        java.lang.Object edgeValue5546;
        int edgeValue5547;
        double edgeValue5548;
        int edgeValue5549;
        int regionValue5566;
        double regionValue5567;
        java.lang.Object regionValue5568;
        int regionValue5569;
        double regionValue5570;
        int regionValue5571;
        int edgeValue5588;
        double edgeValue5589;
        java.lang.Object edgeValue5590;
        int edgeValue5591;
        double edgeValue5592;
        int edgeValue5593;
        int regionValue5610;
        double regionValue5611;
        java.lang.Object regionValue5612;
        int regionValue5613;
        double regionValue5614;
        int regionValue5615;
        int edgeValue5632;
        double edgeValue5633;
        java.lang.Object edgeValue5634;
        int edgeValue5635;
        double edgeValue5636;
        int edgeValue5637;
        int edgeValue5654;
        double edgeValue5655;
        java.lang.Object edgeValue5656;
        int edgeValue5657;
        int regionValue5674;
        double regionValue5675;
        java.lang.Object regionValue5676;
        int regionValue5677;
        double regionValue5678;
        int edgeValue5695;
        double edgeValue5696;
        java.lang.Object edgeValue5697;
        int edgeValue5698;
        double edgeValue5699;
        int comparison5700;
        int edgeValue5717;
        double edgeValue5718;
        java.lang.Object edgeValue5719;
        int edgeValue5720;
        double edgeValue5721;
        int edgeValue5722;
        int edgeValue5739;
        double edgeValue5740;
        java.lang.Object edgeValue5741;
        int edgeValue5742;
        double edgeValue5743;
        int edgeValue5744;
        java.lang.Object regionValue5762;
        int regionValue5763;
        double regionValue5764;
        int regionValue5765;
        java.lang.Object edgeValue5782;
        int edgeValue5783;
        double edgeValue5784;
        int edgeValue5785;
        int regionValue5802;
        double regionValue5803;
        java.lang.Object regionValue5804;
        int regionValue5805;
        double regionValue5806;
        int regionValue5807;
        int edgeValue5824;
        double edgeValue5825;
        java.lang.Object edgeValue5826;
        int edgeValue5827;
        double edgeValue5828;
        int edgeValue5829;
        int edgeValue5846;
        double edgeValue5847;
        java.lang.Object edgeValue5848;
        int edgeValue5849;
        java.lang.Object regionValue5866;
        int regionValue5867;
        double regionValue5868;
        java.lang.Object edgeValue5885;
        int edgeValue5886;
        double edgeValue5887;
        int computed5888;
        java.lang.Object edgeValue5905;
        int edgeValue5906;
        double edgeValue5907;
        int edgeValue5908;
        int value5909;
        double value5910;
        int edgeValue5927;
        double edgeValue5928;
        java.lang.Object edgeValue5929;
        int edgeValue5930;
        int incremented5931;
        int edgeValue5948;
        double edgeValue5949;
        java.lang.Object edgeValue5950;
        int edgeValue5951;
        int edgeValue5968;
        double edgeValue5969;
        java.lang.Object edgeValue5970;
        int edgeValue5971;
        int edgeValue5989;
        double edgeValue5990;
        java.lang.Object edgeValue5991;
        int edgeValue5992;
        int edgeValue6004;
        double edgeValue6005;
        java.lang.Object edgeValue6006;
        int comparison6007;
        int edgeValue6017;
        int regionValue6029;
        double regionValue6030;
        java.lang.Object regionValue6031;
        int edgeValue6043;
        double edgeValue6044;
        java.lang.Object edgeValue6045;
        java.lang.Object value6046;
        boolean value6047;
        int edgeValue6059;
        double edgeValue6060;
        java.lang.Object edgeValue6061;
        int edgeValue6062;
        int edgeValue6074;
        double edgeValue6075;
        java.lang.Object edgeValue6076;
        int edgeValue6077;
        int edgeValue6087;
        int edgeValue6088;
        int regionValue6100;
        double regionValue6101;
        java.lang.Object regionValue6102;
        int regionValue6103;
        int edgeValue6115;
        double edgeValue6116;
        java.lang.Object edgeValue6117;
        int edgeValue6118;
        int edgeValue6128;
        int regionValue6140;
        double regionValue6141;
        java.lang.Object regionValue6142;
        int edgeValue6154;
        double edgeValue6155;
        java.lang.Object edgeValue6156;
        java.lang.Object value6157;
        java.lang.Object value6158;
        int edgeValue6168;
        int regionValue6179;
        double regionValue6180;
        java.lang.Object regionValue6181;
        int edgeValue6192;
        double edgeValue6193;
        java.lang.Object edgeValue6194;
        int regionValue6205;
        double regionValue6206;
        java.lang.Object regionValue6207;
        int edgeValue6218;
        double edgeValue6219;
        java.lang.Object edgeValue6220;
        java.lang.Object value6221;
        java.lang.Object value6222;
        java.lang.Object value6223;
        int value6224;
        int regionValue6235;
        double regionValue6236;
        java.lang.Object regionValue6237;
        int regionValue6238;
        int edgeValue6249;
        double edgeValue6250;
        java.lang.Object edgeValue6251;
        int regionValue6263;
        double regionValue6264;
        java.lang.Object regionValue6265;
        int edgeValue6277;
        double edgeValue6278;
        java.lang.Object edgeValue6279;
        int regionValue6291;
        double regionValue6292;
        java.lang.Object regionValue6293;
        int edgeValue6305;
        double edgeValue6306;
        java.lang.Object edgeValue6307;
        int regionValue6319;
        double regionValue6320;
        java.lang.Object regionValue6321;
        int edgeValue6332;
        double edgeValue6333;
        java.lang.Object edgeValue6334;
        int regionValue6345;
        double regionValue6346;
        java.lang.Object regionValue6347;
        int edgeValue6358;
        double edgeValue6359;
        java.lang.Object edgeValue6360;
        int regionValue6371;
        double regionValue6372;
        java.lang.Object regionValue6373;
        int edgeValue6384;
        double edgeValue6385;
        java.lang.Object edgeValue6386;
        java.lang.Object value6387;
        java.lang.Object value6388;
        java.lang.Object value6389;
        boolean value6390;
        int edgeValue6399;
        int edgeValue6400;
        int regionValue6411;
        double regionValue6412;
        java.lang.Object regionValue6413;
        int edgeValue6425;
        double edgeValue6426;
        java.lang.Object edgeValue6427;
        int edgeValue6428;
        int regionValue6439;
        double regionValue6440;
        java.lang.Object regionValue6441;
        int edgeValue6453;
        double edgeValue6454;
        java.lang.Object edgeValue6455;
        int edgeValue6466;
        int regionValue6477;
        double regionValue6478;
        java.lang.Object regionValue6479;
        int edgeValue6490;
        double edgeValue6491;
        java.lang.Object edgeValue6492;
        int edgeValue6503;
        double edgeValue6504;
        java.lang.Object edgeValue6505;
        int edgeValue6516;
        double edgeValue6517;
        java.lang.Object edgeValue6518;
        int edgeValue6519;
        int value6520;
        int regionValue6531;
        double regionValue6532;
        java.lang.Object regionValue6533;
        int regionValue6534;
        int edgeValue6545;
        double edgeValue6546;
        java.lang.Object edgeValue6547;
        int edgeValue6548;
        int regionValue6559;
        double regionValue6560;
        java.lang.Object regionValue6561;
        int regionValue6562;
        java.lang.Object regionValue6563;
        int edgeValue6574;
        double edgeValue6575;
        java.lang.Object edgeValue6576;
        int edgeValue6577;
        java.lang.Object edgeValue6578;
        int regionValue6589;
        double regionValue6590;
        java.lang.Object regionValue6591;
        int regionValue6592;
        int edgeValue6603;
        double edgeValue6604;
        java.lang.Object edgeValue6605;
        int edgeValue6606;
        int regionValue6617;
        double regionValue6618;
        java.lang.Object regionValue6619;
        int regionValue6620;
        int edgeValue6631;
        double edgeValue6632;
        java.lang.Object edgeValue6633;
        int edgeValue6634;
        double value6635;
        double value6637;
        int comparison6639;
        int regionValue6650;
        double regionValue6651;
        java.lang.Object regionValue6652;
        int regionValue6653;
        int edgeValue6665;
        double edgeValue6666;
        java.lang.Object edgeValue6667;
        int edgeValue6668;
        int regionValue6680;
        double regionValue6681;
        java.lang.Object regionValue6682;
        int regionValue6683;
        int edgeValue6697;
        double edgeValue6698;
        java.lang.Object edgeValue6699;
        int edgeValue6700;
        int regionValue6714;
        double regionValue6715;
        java.lang.Object regionValue6716;
        int regionValue6717;
        int edgeValue6728;
        double edgeValue6729;
        java.lang.Object edgeValue6730;
        int edgeValue6731;
        int regionValue6742;
        double regionValue6743;
        java.lang.Object regionValue6744;
        int regionValue6745;
        int edgeValue6758;
        double edgeValue6759;
        java.lang.Object edgeValue6760;
        int edgeValue6761;
        int regionValue6774;
        double regionValue6775;
        java.lang.Object regionValue6776;
        int regionValue6777;
        int edgeValue6790;
        double edgeValue6791;
        java.lang.Object edgeValue6792;
        int edgeValue6793;
        int comparison6796;
        int comparison6797;
        int regionValue6808;
        double regionValue6809;
        java.lang.Object regionValue6810;
        int regionValue6811;
        int regionValue6813;
        int edgeValue6824;
        double edgeValue6825;
        java.lang.Object edgeValue6826;
        int edgeValue6827;
        int regionValue6840;
        double regionValue6841;
        java.lang.Object regionValue6842;
        int regionValue6843;
        int edgeValue6857;
        double edgeValue6858;
        java.lang.Object edgeValue6859;
        int edgeValue6860;
        int regionValue6874;
        double regionValue6875;
        java.lang.Object regionValue6876;
        int regionValue6877;
        int edgeValue6891;
        double edgeValue6892;
        java.lang.Object edgeValue6893;
        int edgeValue6894;
        int edgeValue6908;
        double edgeValue6909;
        java.lang.Object edgeValue6910;
        int edgeValue6911;
        int regionValue6922;
        double regionValue6923;
        java.lang.Object regionValue6924;
        int regionValue6925;
        int edgeValue6938;
        double edgeValue6939;
        java.lang.Object edgeValue6940;
        int edgeValue6941;
        int regionValue6954;
        double regionValue6955;
        java.lang.Object regionValue6956;
        int regionValue6957;
        int edgeValue6970;
        double edgeValue6971;
        java.lang.Object edgeValue6972;
        int edgeValue6973;
        int comparison6976;
        int edgeValue6987;
        double edgeValue6988;
        java.lang.Object edgeValue6989;
        int edgeValue6990;
        int comparison6993;
        int regionValue7004;
        double regionValue7005;
        java.lang.Object regionValue7006;
        int regionValue7007;
        int regionValue7009;
        int edgeValue7021;
        double edgeValue7022;
        java.lang.Object edgeValue7023;
        int edgeValue7024;
        int edgeValue7026;
        int regionValue7038;
        double regionValue7039;
        java.lang.Object regionValue7040;
        int regionValue7041;
        int regionValue7043;
        int edgeValue7055;
        double edgeValue7056;
        java.lang.Object edgeValue7057;
        int edgeValue7058;
        int edgeValue7060;
        int regionValue7072;
        double regionValue7073;
        java.lang.Object regionValue7074;
        int regionValue7075;
        int regionValue7077;
        int edgeValue7088;
        double edgeValue7089;
        java.lang.Object edgeValue7090;
        int edgeValue7091;
        int edgeValue7093;
        int regionValue7104;
        double regionValue7105;
        java.lang.Object regionValue7106;
        int regionValue7107;
        int regionValue7109;
        int edgeValue7120;
        double edgeValue7121;
        java.lang.Object edgeValue7122;
        int edgeValue7123;
        int edgeValue7125;
        int regionValue7136;
        double regionValue7137;
        java.lang.Object regionValue7138;
        int regionValue7139;
        int regionValue7141;
        int edgeValue7152;
        double edgeValue7153;
        java.lang.Object edgeValue7154;
        int edgeValue7155;
        int edgeValue7157;
        int edgeValue7168;
        double edgeValue7169;
        java.lang.Object edgeValue7170;
        int edgeValue7171;
        int regionValue7182;
        double regionValue7183;
        java.lang.Object regionValue7184;
        int regionValue7185;
        int edgeValue7197;
        double edgeValue7198;
        java.lang.Object edgeValue7199;
        int edgeValue7200;
        int comparison7202;
        int edgeValue7213;
        double edgeValue7214;
        java.lang.Object edgeValue7215;
        int edgeValue7216;
        int edgeValue7229;
        double edgeValue7230;
        java.lang.Object edgeValue7231;
        int edgeValue7232;
        int edgeValue7234;
        java.lang.Object regionValue7246;
        int regionValue7247;
        int regionValue7249;
        java.lang.Object edgeValue7260;
        int edgeValue7261;
        int edgeValue7263;
        int regionValue7274;
        double regionValue7275;
        java.lang.Object regionValue7276;
        int regionValue7277;
        int regionValue7279;
        int edgeValue7290;
        double edgeValue7291;
        java.lang.Object edgeValue7292;
        int edgeValue7293;
        int edgeValue7295;
        int edgeValue7306;
        double edgeValue7307;
        java.lang.Object edgeValue7308;
        int edgeValue7309;
        java.lang.Object regionValue7320;
        int regionValue7321;
        java.lang.Object edgeValue7333;
        int edgeValue7334;
        int computed7336;
        java.lang.Object edgeValue7347;
        int edgeValue7348;
        int value7351;
        int edgeValue7363;
        java.lang.Object edgeValue7365;
        int edgeValue7366;
        int incremented7367;
        int edgeValue7378;
        double edgeValue7379;
        java.lang.Object edgeValue7380;
        int edgeValue7392;
        double edgeValue7393;
        java.lang.Object edgeValue7394;
        int edgeValue7395;
        int edgeValue7407;
        double edgeValue7408;
        java.lang.Object edgeValue7409;
        int edgeValue7410;
        int edgeValue7420;
        java.lang.Object value7421;
        java.lang.Object value7422;
        java.lang.Object value7423;
        java.lang.Object value7424;
        int value7425;
        int edgeValue7435;
        int regionValue7446;
        double regionValue7447;
        java.lang.Object regionValue7448;
        int regionValue7449;
        int edgeValue7460;
        double edgeValue7461;
        java.lang.Object edgeValue7462;
        int edgeValue7463;
        java.lang.Object value7464;
        java.lang.Object value7465;
        java.lang.Object value7466;
        java.lang.Object value7467;
        java.lang.Object value7468;
        java.lang.Object value7469;
        int regionValue7480;
        double regionValue7481;
        java.lang.Object regionValue7482;
        int regionValue7483;
        java.lang.Object regionValue7484;
        java.lang.Object regionValue7485;
        int edgeValue7496;
        double edgeValue7497;
        java.lang.Object edgeValue7498;
        int edgeValue7499;
        java.lang.Object edgeValue7500;
        java.lang.Object edgeValue7501;
        int regionValue7512;
        double regionValue7513;
        java.lang.Object regionValue7514;
        int regionValue7515;
        java.lang.Object regionValue7516;
        int edgeValue7527;
        double edgeValue7528;
        java.lang.Object edgeValue7529;
        int edgeValue7530;
        java.lang.Object edgeValue7531;
        int regionValue7542;
        double regionValue7543;
        java.lang.Object regionValue7544;
        int regionValue7545;
        int edgeValue7556;
        double edgeValue7557;
        java.lang.Object edgeValue7558;
        int edgeValue7559;
        int regionValue7570;
        double regionValue7571;
        java.lang.Object regionValue7572;
        int regionValue7573;
        int edgeValue7584;
        double edgeValue7585;
        java.lang.Object edgeValue7586;
        int edgeValue7587;
        double value7588;
        double value7589;
        double value7590;
        double value7591;
        int comparison7592;
        int regionValue7603;
        double regionValue7604;
        java.lang.Object regionValue7605;
        int regionValue7606;
        int edgeValue7618;
        double edgeValue7619;
        java.lang.Object edgeValue7620;
        int edgeValue7621;
        int regionValue7633;
        double regionValue7634;
        java.lang.Object regionValue7635;
        int regionValue7636;
        double regionValue7637;
        double regionValue7638;
        int edgeValue7650;
        double edgeValue7651;
        java.lang.Object edgeValue7652;
        int edgeValue7653;
        double edgeValue7654;
        double edgeValue7655;
        int regionValue7667;
        double regionValue7668;
        java.lang.Object regionValue7669;
        int regionValue7670;
        int edgeValue7681;
        double edgeValue7682;
        java.lang.Object edgeValue7683;
        int edgeValue7684;
        int regionValue7695;
        double regionValue7696;
        java.lang.Object regionValue7697;
        int regionValue7698;
        double regionValue7699;
        double regionValue7700;
        int edgeValue7711;
        double edgeValue7712;
        java.lang.Object edgeValue7713;
        int edgeValue7714;
        double edgeValue7715;
        double edgeValue7716;
        int regionValue7727;
        double regionValue7728;
        java.lang.Object regionValue7729;
        int regionValue7730;
        double regionValue7731;
        double regionValue7732;
        int edgeValue7743;
        double edgeValue7744;
        java.lang.Object edgeValue7745;
        int edgeValue7746;
        double edgeValue7747;
        double edgeValue7748;
        int comparison7749;
        int comparison7750;
        int regionValue7761;
        double regionValue7762;
        java.lang.Object regionValue7763;
        int regionValue7764;
        double regionValue7765;
        int regionValue7766;
        int edgeValue7777;
        double edgeValue7778;
        java.lang.Object edgeValue7779;
        int edgeValue7780;
        double edgeValue7781;
        int edgeValue7782;
        int regionValue7793;
        double regionValue7794;
        java.lang.Object regionValue7795;
        int regionValue7796;
        double regionValue7797;
        double regionValue7798;
        int regionValue7799;
        int edgeValue7810;
        double edgeValue7811;
        java.lang.Object edgeValue7812;
        int edgeValue7813;
        double edgeValue7814;
        double edgeValue7815;
        int edgeValue7816;
        int regionValue7827;
        double regionValue7828;
        java.lang.Object regionValue7829;
        int regionValue7830;
        double regionValue7831;
        double regionValue7832;
        int regionValue7833;
        int edgeValue7844;
        double edgeValue7845;
        java.lang.Object edgeValue7846;
        int edgeValue7847;
        double edgeValue7848;
        double edgeValue7849;
        int edgeValue7850;
        int edgeValue7861;
        double edgeValue7862;
        java.lang.Object edgeValue7863;
        int edgeValue7864;
        int regionValue7875;
        double regionValue7876;
        java.lang.Object regionValue7877;
        int regionValue7878;
        double regionValue7879;
        double regionValue7880;
        int edgeValue7891;
        double edgeValue7892;
        java.lang.Object edgeValue7893;
        int edgeValue7894;
        double edgeValue7895;
        double edgeValue7896;
        int regionValue7907;
        double regionValue7908;
        java.lang.Object regionValue7909;
        int regionValue7910;
        double regionValue7911;
        double regionValue7912;
        int edgeValue7923;
        double edgeValue7924;
        java.lang.Object edgeValue7925;
        int edgeValue7926;
        double edgeValue7927;
        double edgeValue7928;
        int comparison7929;
        int edgeValue7940;
        double edgeValue7941;
        java.lang.Object edgeValue7942;
        int edgeValue7943;
        double edgeValue7944;
        int edgeValue7945;
        int comparison7946;
        int regionValue7957;
        double regionValue7958;
        java.lang.Object regionValue7959;
        int regionValue7960;
        double regionValue7961;
        int regionValue7962;
        int edgeValue7974;
        double edgeValue7975;
        java.lang.Object edgeValue7976;
        int edgeValue7977;
        double edgeValue7978;
        int edgeValue7979;
        int regionValue7991;
        double regionValue7992;
        java.lang.Object regionValue7993;
        int regionValue7994;
        double regionValue7995;
        int regionValue7996;
        int edgeValue8008;
        double edgeValue8009;
        java.lang.Object edgeValue8010;
        int edgeValue8011;
        double edgeValue8012;
        int edgeValue8013;
        int regionValue8025;
        double regionValue8026;
        java.lang.Object regionValue8027;
        int regionValue8028;
        double regionValue8029;
        int regionValue8030;
        int edgeValue8041;
        double edgeValue8042;
        java.lang.Object edgeValue8043;
        int edgeValue8044;
        double edgeValue8045;
        int edgeValue8046;
        int regionValue8057;
        double regionValue8058;
        java.lang.Object regionValue8059;
        int regionValue8060;
        double regionValue8061;
        int regionValue8062;
        int edgeValue8073;
        double edgeValue8074;
        java.lang.Object edgeValue8075;
        int edgeValue8076;
        double edgeValue8077;
        int edgeValue8078;
        int regionValue8089;
        double regionValue8090;
        java.lang.Object regionValue8091;
        int regionValue8092;
        double regionValue8093;
        int regionValue8094;
        int edgeValue8105;
        double edgeValue8106;
        java.lang.Object edgeValue8107;
        int edgeValue8108;
        double edgeValue8109;
        int edgeValue8110;
        int edgeValue8121;
        double edgeValue8122;
        java.lang.Object edgeValue8123;
        int edgeValue8124;
        int regionValue8135;
        double regionValue8136;
        java.lang.Object regionValue8137;
        int regionValue8138;
        double regionValue8139;
        int edgeValue8150;
        double edgeValue8151;
        java.lang.Object edgeValue8152;
        int edgeValue8153;
        double edgeValue8154;
        int comparison8155;
        int edgeValue8166;
        double edgeValue8167;
        java.lang.Object edgeValue8168;
        int edgeValue8169;
        double edgeValue8170;
        int edgeValue8171;
        int edgeValue8182;
        double edgeValue8183;
        java.lang.Object edgeValue8184;
        int edgeValue8185;
        double edgeValue8186;
        int edgeValue8187;
        java.lang.Object regionValue8199;
        int regionValue8200;
        double regionValue8201;
        int regionValue8202;
        java.lang.Object edgeValue8213;
        int edgeValue8214;
        double edgeValue8215;
        int edgeValue8216;
        int regionValue8227;
        double regionValue8228;
        java.lang.Object regionValue8229;
        int regionValue8230;
        double regionValue8231;
        int regionValue8232;
        int edgeValue8243;
        double edgeValue8244;
        java.lang.Object edgeValue8245;
        int edgeValue8246;
        double edgeValue8247;
        int edgeValue8248;
        int edgeValue8259;
        double edgeValue8260;
        java.lang.Object edgeValue8261;
        int edgeValue8262;
        java.lang.Object regionValue8273;
        int regionValue8274;
        double regionValue8275;
        java.lang.Object edgeValue8286;
        int edgeValue8287;
        double edgeValue8288;
        int computed8289;
        java.lang.Object edgeValue8300;
        int edgeValue8301;
        double edgeValue8302;
        int edgeValue8303;
        int value8304;
        double value8305;
        int edgeValue8316;
        double edgeValue8317;
        java.lang.Object edgeValue8318;
        int edgeValue8319;
        int incremented8320;
        int edgeValue8331;
        double edgeValue8332;
        java.lang.Object edgeValue8333;
        int edgeValue8334;
        int edgeValue8345;
        double edgeValue8346;
        java.lang.Object edgeValue8347;
        int edgeValue8348;
        int edgeValue8360;
        double edgeValue8361;
        java.lang.Object edgeValue8362;
        int edgeValue8363;
        int edgeValue8373;
        boolean value8374;
        int edgeValue8383;
        int edgeValue8384;
        int value8385;
        int comparison8386;
        int regionValue8395;
        int regionValue8396;
        int edgeValue8406;
        int edgeValue8407;
        int regionValue8417;
        int regionValue8418;
        int edgeValue8428;
        int edgeValue8429;
        int regionValue8439;
        int regionValue8440;
        int edgeValue8449;
        int edgeValue8450;
        int regionValue8459;
        int regionValue8460;
        int edgeValue8469;
        int edgeValue8470;
        int regionValue8479;
        int regionValue8480;
        int edgeValue8489;
        int edgeValue8490;
        int regionValue8499;
        int regionValue8500;
        int edgeValue8509;
        int edgeValue8510;
        int regionValue8519;
        int regionValue8520;
        int edgeValue8529;
        int edgeValue8530;
        int regionValue8539;
        int regionValue8540;
        int edgeValue8549;
        int edgeValue8550;
        java.lang.Object value8551;
        double value8552;
        int edgeValue8561;
        int edgeValue8562;
        int edgeValue8571;
        int edgeValue8572;
        int comparison8574;
        int regionValue8583;
        int regionValue8584;
        int regionValue8585;
        int edgeValue8594;
        int edgeValue8595;
        int regionValue8605;
        int regionValue8606;
        int edgeValue8616;
        int edgeValue8617;
        int regionValue8627;
        int regionValue8628;
        int edgeValue8637;
        int edgeValue8638;
        int regionValue8647;
        int regionValue8648;
        int edgeValue8657;
        int edgeValue8658;
        int edgeValue8667;
        int edgeValue8668;
        int value8669;
        int computed8670;
        int edgeValue8679;
        int edgeValue8680;
        int edgeValue8689;
        int edgeValue8690;
        int edgeValue8691;
        int value8692;
        int comparison8693;
        int regionValue8702;
        int regionValue8703;
        int regionValue8704;
        int regionValue8705;
        int regionValue8706;
        int edgeValue8715;
        int edgeValue8716;
        int edgeValue8717;
        int edgeValue8718;
        int regionValue8728;
        int regionValue8729;
        int regionValue8730;
        int regionValue8731;
        int edgeValue8741;
        int edgeValue8742;
        int edgeValue8743;
        int edgeValue8744;
        int regionValue8754;
        int regionValue8755;
        int regionValue8756;
        int regionValue8757;
        int edgeValue8766;
        int edgeValue8767;
        int edgeValue8768;
        int edgeValue8769;
        int regionValue8778;
        int regionValue8779;
        int regionValue8780;
        int regionValue8781;
        int edgeValue8790;
        int edgeValue8791;
        int edgeValue8792;
        int edgeValue8793;
        int regionValue8802;
        int regionValue8803;
        int regionValue8804;
        int regionValue8805;
        int edgeValue8814;
        int edgeValue8815;
        int edgeValue8816;
        int edgeValue8817;
        int value8818;
        int edgeValue8827;
        int edgeValue8828;
        int edgeValue8829;
        int edgeValue8830;
        int comparison8832;
        int regionValue8841;
        int regionValue8842;
        int regionValue8843;
        int regionValue8844;
        int regionValue8845;
        int edgeValue8854;
        int edgeValue8855;
        int edgeValue8856;
        int edgeValue8857;
        int edgeValue8858;
        int regionValue8867;
        int regionValue8868;
        int regionValue8869;
        int regionValue8870;
        int regionValue8871;
        int edgeValue8880;
        int edgeValue8881;
        int edgeValue8882;
        int edgeValue8883;
        int edgeValue8884;
        int regionValue8893;
        int regionValue8894;
        int regionValue8895;
        int edgeValue8904;
        int edgeValue8905;
        int edgeValue8906;
        int regionValue8915;
        int regionValue8916;
        int regionValue8917;
        int edgeValue8926;
        int edgeValue8927;
        int edgeValue8928;
        int regionValue8937;
        int regionValue8938;
        int regionValue8939;
        int edgeValue8948;
        int edgeValue8949;
        int edgeValue8950;
        int value8951;
        int edgeValue8960;
        int edgeValue8961;
        int edgeValue8962;
        int edgeValue8973;
        int edgeValue8974;
        int edgeValue8975;
        int edgeValue8976;
        int regionValue8985;
        int regionValue8986;
        int regionValue8987;
        int regionValue8988;
        int edgeValue8997;
        int edgeValue8998;
        int edgeValue8999;
        int edgeValue9000;
        int edgeValue9009;
        int edgeValue9010;
        int edgeValue9011;
        int regionValue9020;
        int regionValue9021;
        int regionValue9022;
        int edgeValue9031;
        int edgeValue9032;
        int edgeValue9033;
        int value9034;
        int regionValue9043;
        int regionValue9044;
        int regionValue9045;
        int regionValue9047;
        int edgeValue9056;
        int edgeValue9057;
        int edgeValue9058;
        int edgeValue9060;
        int regionValue9069;
        int regionValue9070;
        int regionValue9071;
        int regionValue9073;
        int edgeValue9082;
        int edgeValue9083;
        int edgeValue9084;
        int edgeValue9086;
        int regionValue9095;
        int regionValue9096;
        int regionValue9097;
        int regionValue9099;
        int edgeValue9108;
        int edgeValue9109;
        int edgeValue9110;
        int edgeValue9112;
        int regionValue9121;
        int regionValue9122;
        int regionValue9123;
        int edgeValue9133;
        int edgeValue9134;
        int edgeValue9135;
        int regionValue9145;
        int regionValue9146;
        int regionValue9147;
        int edgeValue9157;
        int edgeValue9158;
        int edgeValue9159;
        int regionValue9169;
        int regionValue9170;
        int regionValue9171;
        int edgeValue9181;
        int edgeValue9182;
        int edgeValue9183;
        int edgeValue9193;
        int edgeValue9194;
        int edgeValue9195;
        int edgeValue9197;
        int regionValue9206;
        int regionValue9207;
        int regionValue9208;
        int regionValue9210;
        int edgeValue9219;
        int edgeValue9220;
        int edgeValue9221;
        int edgeValue9223;
        java.lang.Object value9224;
        int value9225;
        int edgeValue9234;
        int edgeValue9235;
        int edgeValue9236;
        int regionValue9247;
        int regionValue9248;
        int regionValue9249;
        int edgeValue9258;
        int edgeValue9259;
        int edgeValue9260;
        int regionValue9269;
        int regionValue9270;
        int edgeValue9279;
        int edgeValue9280;
        int value9281;
        int edgeValue9290;
        int edgeValue9291;
        int value9293;
        int computed9294;
        int comparison9295;
        int regionValue9304;
        int regionValue9305;
        int regionValue9306;
        int regionValue9307;
        int edgeValue9316;
        int edgeValue9317;
        int edgeValue9318;
        int regionValue9328;
        int regionValue9329;
        int regionValue9330;
        int edgeValue9340;
        int edgeValue9341;
        int edgeValue9342;
        int regionValue9352;
        int regionValue9353;
        int regionValue9354;
        int edgeValue9363;
        int edgeValue9364;
        int edgeValue9365;
        int regionValue9374;
        int regionValue9375;
        int regionValue9376;
        int edgeValue9385;
        int edgeValue9386;
        int edgeValue9387;
        int edgeValue9396;
        int edgeValue9397;
        int edgeValue9398;
        int comparison9399;
        int regionValue9408;
        int regionValue9409;
        int regionValue9410;
        int regionValue9412;
        int edgeValue9421;
        int edgeValue9422;
        int edgeValue9423;
        int regionValue9434;
        int regionValue9435;
        int regionValue9436;
        int edgeValue9447;
        int edgeValue9448;
        int edgeValue9449;
        int regionValue9460;
        int regionValue9461;
        int regionValue9462;
        int edgeValue9473;
        int edgeValue9474;
        int edgeValue9475;
        int regionValue9486;
        int regionValue9487;
        int regionValue9488;
        int edgeValue9498;
        int edgeValue9499;
        int edgeValue9500;
        int regionValue9510;
        int regionValue9511;
        int regionValue9512;
        int edgeValue9522;
        int edgeValue9523;
        int edgeValue9524;
        int regionValue9534;
        int regionValue9535;
        int regionValue9536;
        int edgeValue9546;
        int edgeValue9547;
        int edgeValue9548;
        int value9550;
        int edgeValue9559;
        int edgeValue9560;
        int edgeValue9561;
        int regionValue9571;
        int regionValue9572;
        int regionValue9573;
        int edgeValue9582;
        int edgeValue9583;
        int edgeValue9584;
        int regionValue9593;
        int regionValue9594;
        int regionValue9595;
        int edgeValue9604;
        int edgeValue9605;
        int edgeValue9606;
        java.lang.Object value9607;
        double value9608;
        int edgeValue9617;
        int edgeValue9618;
        int edgeValue9619;
        int edgeValue9628;
        int edgeValue9629;
        int edgeValue9630;
        int edgeValue9640;
        int edgeValue9641;
        int edgeValue9642;
        int edgeValue9644;
        int edgeValue9653;
        int edgeValue9654;
        int edgeValue9655;
        int edgeValue9664;
        int edgeValue9665;
        int edgeValue9666;
        int edgeValue9667;
        int comparison9668;
        int regionValue9673;
        int regionValue9674;
        int edgeValue9680;
        int edgeValue9681;
        int regionValue9691;
        int regionValue9692;
        int regionValue9693;
        int regionValue9694;
        int edgeValue9704;
        int edgeValue9705;
        int edgeValue9706;
        int edgeValue9707;
        int regionValue9713;
        int regionValue9714;
        int edgeValue9719;
        int edgeValue9720;
        int regionValue9729;
        int regionValue9730;
        int regionValue9731;
        int regionValue9732;
        int edgeValue9741;
        int edgeValue9742;
        int edgeValue9743;
        int edgeValue9744;
        int regionValue9753;
        int regionValue9754;
        int regionValue9755;
        int regionValue9756;
        int edgeValue9765;
        int edgeValue9766;
        int edgeValue9767;
        int edgeValue9768;
        int regionValue9774;
        int edgeValue9780;
        int regionValue9789;
        int regionValue9790;
        int regionValue9791;
        int edgeValue9800;
        int edgeValue9801;
        int edgeValue9802;
        int regionValue9811;
        int regionValue9812;
        int regionValue9813;
        int edgeValue9822;
        int edgeValue9823;
        int edgeValue9824;
        int regionValue9833;
        int edgeValue9842;
        int regionValue9851;
        int regionValue9852;
        int edgeValue9861;
        int edgeValue9862;
        int regionValue9871;
        int regionValue9872;
        int edgeValue9881;
        int edgeValue9882;
        int edgeValue9891;
        short converted9892;
        short converted9893;
        int edgeValue9899;
        boolean value9900;
        int edgeValue9905;
        int edgeValue9906;
        int edgeValue9911;
        int edgeValue9912;
        int comparison9914;
        int regionValue9919;
        int regionValue9920;
        int regionValue9921;
        int edgeValue9926;
        int edgeValue9927;
        int regionValue9933;
        int regionValue9934;
        int edgeValue9940;
        int edgeValue9941;
        int regionValue9947;
        int regionValue9948;
        int edgeValue9953;
        int edgeValue9954;
        int regionValue9959;
        int regionValue9960;
        int edgeValue9965;
        int edgeValue9966;
        int regionValue9971;
        int regionValue9972;
        int edgeValue9977;
        int edgeValue9978;
        int regionValue9991;
        int edgeValue9996;
        int comparison9997;
        int regionValue10003;
        int regionValue10014;
        int edgeValue10021;
        int regionValue10028;
        int edgeValue10035;
        int regionValue10052;
        int edgeValue10058;
        int regionValue10064;
        int edgeValue10070;
        int value10072;
        int edgeValue10077;
        java.lang.Object value10079;
        int value10080;
        int edgeValue10085;
        int edgeValue10086;
        int comparison10088;
        int regionValue10093;
        int regionValue10094;
        int regionValue10095;
        int edgeValue10100;
        int edgeValue10101;
        int edgeValue10102;
        int regionValue10107;
        int regionValue10108;
        int regionValue10109;
        int edgeValue10114;
        int edgeValue10115;
        int edgeValue10116;
        int regionValue10125;
        int edgeValue10130;
        int regionValue10135;
        int edgeValue10140;
        java.lang.Object value10141;
        boolean value10142;
        int edgeValue10147;
        int edgeValue10148;
        int regionValue10154;
        int regionValue10155;
        int edgeValue10160;
        int edgeValue10161;
        int regionValue10166;
        int regionValue10167;
        int edgeValue10172;
        int edgeValue10173;
        int regionValue10178;
        int edgeValue10183;
        int regionValue10188;
        int edgeValue10193;
        java.lang.Object value10194;
        java.lang.Object value10195;
        java.lang.Object value10196;
        boolean value10197;
        int comparison10198;
        int regionValue10203;
        int regionValue10204;
        int edgeValue10209;
        int regionValue10215;
        int edgeValue10222;
        int edgeValue10223;
        int regionValue10229;
        int edgeValue10236;
        int edgeValue10243;
        int regionValue10249;
        int edgeValue10255;
        int regionValue10261;
        int edgeValue10267;
        int edgeValue10277;
        int value10278;
        int edgeValue10283;
        int edgeValue10289;
        int edgeValue10290;
        int comparison10291;
        int regionValue10296;
        int regionValue10297;
        int regionValue10298;
        int edgeValue10303;
        int edgeValue10304;
        int regionValue10310;
        int regionValue10311;
        int edgeValue10317;
        int edgeValue10318;
        int regionValue10324;
        int regionValue10325;
        int edgeValue10330;
        int edgeValue10331;
        int regionValue10336;
        int regionValue10337;
        int edgeValue10342;
        int edgeValue10343;
        int regionValue10348;
        int regionValue10349;
        int edgeValue10354;
        int edgeValue10355;
        int regionValue10360;
        int edgeValue10365;
        int regionValue10370;
        int edgeValue10375;
        int regionValue10380;
        int regionValue10381;
        int edgeValue10386;
        int edgeValue10387;
        java.lang.Object value10388;
        int value10389;
        int edgeValue10394;
        int edgeValue10400;
        int edgeValue10401;
        int edgeValue10402;
        int computed10403;
        int edgeValue10408;
        int edgeValue10432;
        int value10437;
        int comparison10438;
        int regionValue10444;
        int regionValue10467;
        int edgeValue10498;
        int comparison10499;
        int regionValue10504;
        int regionValue10505;
        int edgeValue10511;
        int regionValue10517;
        int edgeValue10523;
        int value10548;
        int comparison10555;
        int regionValue10560;
        int regionValue10561;
        int edgeValue10566;
        int edgeValue10567;
        int regionValue10572;
        int regionValue10573;
        int edgeValue10578;
        int edgeValue10579;
        int edgeValue10584;
        int regionValue10589;
        int edgeValue10594;
        int regionValue10599;
        int edgeValue10604;
        int value10625;
        java.lang.Object value10626;
        boolean value10627;
        int comparison10628;
        boolean value10659;
        int edgeValue10664;
        int edgeValue10669;
        int comparison10671;
        int regionValue10674;
        int regionValue10675;
        int edgeValue10678;
        int edgeValue10679;
        int regionValue10684;
        int regionValue10685;
        int edgeValue10690;
        int edgeValue10691;
        int regionValue10695;
        int edgeValue10699;
        int regionValue10704;
        int edgeValue10709;
        int regionValue10714;
        int edgeValue10719;
        int value10734;
        java.lang.Object value10735;
        boolean value10736;
        int value10740;
        int edgeValue10747;
        int comparison10749;
        int regionValue10751;
        int regionValue10752;
        int edgeValue10754;
        int edgeValue10755;
        int regionValue10757;
        int regionValue10758;
        int edgeValue10760;
        int edgeValue10761;
        int regionValue10763;
        int edgeValue10765;
        int regionValue10767;
        int edgeValue10769;
        int regionValue10771;
        int edgeValue10773;
        int value10777;
        int edgeValue10781;
        int edgeValue10782;
        int value10786;
        int value10788;
        int computed10789;
        region942: {
        region936: {
        region931: {
        region930: {
        region929: {
        region928: {
        region927: {
        region925: {
        region924: {
        region920: {
        region919: {
        region918: {
        region900: {
        region899: {
        region897: {
        region896: {
        region892: {
        region891: {
        region887: {
        region885: {
        region883: {
        region881: {
        region861: {
        region859: {
        region857: {
        region855: {
        region854: {
        region850: {
        region845: {
        region843: {
        region842: {
        region838: {
        region837: {
        region835: {
        region834: {
        region827: {
        region826: {
        region825: {
        region824: {
        region823: {
        region822: {
        region821: {
        region816: {
        region813: {
        region812: {
        region810: {
        region809: {
        region804: {
        region803: {
        region799: {
        region798: {
        region796: {
        region795: {
        region793: {
        region782: {
        region781: {
        region780: {
        region772: {
        region770: {
        region769: {
        region765: {
        region760: {
        region759: {
        region757: {
        region756: {
        region754: {
        region748: {
        region747: {
        region745: {
        region744: {
        region740: {
        region739: {
        region735: {
        region726: {
        region721: {
        region719: {
        region717: {
        region715: {
        region713: {
        region711: {
        region710: {
        region705: {
        region704: {
        region703: {
        region702: {
        region701: {
        region693: {
        region692: {
        region691: {
        region689: {
        region688: {
        region686: {
        region680: {
        region678: {
        region677: {
        region666: {
        region664: {
        region663: {
        region658: {
        region657: {
        region656: {
        region654: {
        region653: {
        region651: {
        region646: {
        region645: {
        region644: {
        region639: {
        region637: {
        region636: {
        region632: {
        region628: {
        region626: {
        region625: {
        region618: {
        region617: {
        region609: {
        region607: {
        region606: {
        region602: {
        region601: {
        region590: {
        region588: {
        region586: {
        region584: {
        region583: {
        region577: {
        region572: {
        region484: {
        region1136: {
        region1134: {
        region1132: {
        region1128: {
        region1123: {
        region1121: {
        region1119: {
        region1117: {
        region1112: {
        region1110: {
        region1108: {
        region1106: {
        region1100: {
        region1095: {
        region1093: {
        region1091: {
        region1089: {
        region1081: {
        region1079: {
        region1077: {
        region1057: {
        region1055: {
        region1053: {
        region483: {
        region482: {
        region480: {
        region479: {
        region477: {
        region469: {
        region467: {
        region466: {
        region464: {
        region456: {
        region454: {
        region450: {
        region449: {
        region448: {
        region447: {
        region440: {
        region436: {
        region136: {
        region134: {
        region133: {
        region131: {
        region130: {
        region119: {
        region110: {
        region107: {
        region99: {
        region97: {
        region96: {
        region94: {
        region87: {
        computed6 = a0 ^ 57372826330249L;
        computed8 = a0 ^ 5058280932348L;
        computed10 = a0 ^ 87612549148105L;
        computed11 = computed10 >>> 48;
        converted12 = (int) (computed11);
        computed14 = computed10 << 16;
        computed15 = computed14 >>> 48;
        converted16 = (int) (computed15);
        computed18 = computed10 << 32;
        computed19 = computed18 >>> 32;
        converted20 = (int) (computed19);
        computed22 = a0 ^ 52039465638618L;
        computed24 = a0 ^ 5600699066924L;
        computed26 = a0 ^ 64044482010578L;
        computed27 = computed26 >>> 48;
        converted28 = (int) (computed27);
        computed30 = computed26 << 16;
        computed31 = computed30 >>> 32;
        converted32 = (int) (computed31);
        computed34 = computed26 << 48;
        computed35 = computed34 >>> 48;
        converted36 = (int) (computed35);
        computed38 = a0 ^ 119376855428400L;
        computed40 = a0 ^ 22205751967824L;
        value42 = 0.0D;
        value43 = recovery$indy$flow$77(-3626806365724742078L, a0);
        value44 = recovery$indy$flow$78();
        value45 = recovery$indy$flow$79(value44, -3628506222990939571L, a0);
        value47 = (int) ((value43 ? 1 : 0));
        value48 = -1;
        if (value45 == null) {
            regionValue58 = value48;
            break region572;
        } else {
            break region87;
        }
        }
        value103 = recovery$indy$flow$80();
        value104 = recovery$indy$flow$81(value103, -3627364308711286721L, a0);
        value105 = recovery$indy$flow$82(value104);
        if (value47 != 0) {
            edgeValue125 = (int) ((value105 ? 1 : 0));
            regionValue114 = value48;
            regionValue115 = edgeValue125;
            break region577;
        } else {
            edgeValue161 = (int) ((value105 ? 1 : 0));
            break region94;
        }
        }
        break region96;
        }
        if (edgeValue161 == 0) {
            regionValue58 = value48;
            break region572;
        } else {
            break region97;
        }
        }
        break region99;
        }
        value276 = 1.0D;
        value277 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingSilent));
        value278 = recovery$indy$flow$84(value277, -3628393978617010352L, a0);
        if ((int) ((value278 ? 1 : 0)) == 0) {
            break region110;
        } else {
            break region107;
        }
        }
        value351 = recovery$indy$flow$85();
        regionValue370 = value351;
        break region119;
        }
        value390 = recovery$indy$flow$86();
        value391 = recovery$indy$flow$87(value390, -3626764515505276552L, a0);
        value392 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value391)))).field_429));
        value393 = recovery$indy$flow$89(this);
        value394 = recovery$indy$flow$90(value392, value393);
        value395 = recovery$indy$flow$91(value394);
        regionValue370 = value395;
        break region119;
        }
        value415 = regionValue370;
        value416 = recovery$indy$flow$92();
        value417 = recovery$indy$flow$93(value416, -3626764515505276552L, a0);
        value418 = recovery$indy$flow$94(value417);
        comparison419 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison419 <= 0) {
            edgeValue449 = value415;
            edgeValue450 = (int) ((value418 ? 1 : 0));
            regionValue431 = value48;
            regionValue432 = value276;
            regionValue433 = edgeValue449;
            regionValue434 = edgeValue450;
            break region448;
        } else {
            edgeValue491 = value415;
            edgeValue492 = (int) ((value418 ? 1 : 0));
            regionValue470 = edgeValue491;
            break region130;
        }
        }
        if (value47 != 0) {
            edgeValue522 = regionValue470;
            regionValue505 = value48;
            regionValue506 = value276;
            regionValue507 = edgeValue522;
            regionValue508 = edgeValue492;
            break region447;
        } else {
            edgeValue562 = regionValue470;
            regionValue542 = edgeValue562;
            break region131;
        }
        }
        edgeValue602 = regionValue542;
        regionValue582 = edgeValue602;
        break region133;
        }
        if (edgeValue492 != 0) {
            edgeValue631 = regionValue582;
            regionValue615 = value48;
            regionValue616 = value276;
            regionValue617 = edgeValue631;
            break region436;
        } else {
            edgeValue669 = regionValue582;
            regionValue650 = edgeValue669;
            break region134;
        }
        }
        value670 = 36;
        edgeValue709 = regionValue650;
        regionValue687 = value48;
        regionValue688 = value276;
        regionValue689 = edgeValue709;
        regionValue690 = value670;
        break region136;
        }
        loop136: while (true) {
        region435: {
        region434: {
        region433: {
        region430: {
        region425: {
        region424: {
        region423: {
        region422: {
        region417: {
        region416: {
        region414: {
        region413: {
        region408: {
        region403: {
        region401: {
        region400: {
        region398: {
        region391: {
        region389: {
        region388: {
        region369: {
        region367: {
        region363: {
        region362: {
        region347: {
        region346: {
        region345: {
        region344: {
        region336: {
        region335: {
        region333: {
        region332: {
        region328: {
        region327: {
        region322: {
        region316: {
        region315: {
        region313: {
        region312: {
        region310: {
        region302: {
        region300: {
        region299: {
        region297: {
        region292: {
        region290: {
        region289: {
        region268: {
        region267: {
        region266: {
        region265: {
        region261: {
        region260: {
        region258: {
        region257: {
        region255: {
        region240: {
        region239: {
        region238: {
        region237: {
        region233: {
        region232: {
        region230: {
        region229: {
        region225: {
        region224: {
        region220: {
        region218: {
        region217: {
        region215: {
        region207: {
        region206: {
        region204: {
        region203: {
        region201: {
        region195: {
        region193: {
        region192: {
        region190: {
        region183: {
        region181: {
        region178: {
        region176: {
        region173: {
        region168: {
        region167: {
        region166: {
        region165: {
        region164: {
        region163: {
        region161: {
        region160: {
        region145: {
        value711 = recovery$indy$flow$95();
        value712 = recovery$indy$flow$96(value711, -3626764515505276552L, a0);
        value713 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value712)))).field_429));
        value714 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value713)))).field_46));
        value715 = recovery$indy$flow$99(value714);
        if (regionValue690 >= value715) {
            edgeValue727 = regionValue687;
            edgeValue728 = regionValue688;
            edgeValue729 = regionValue689;
            regionValue615 = edgeValue727;
            regionValue616 = edgeValue728;
            regionValue617 = edgeValue729;
            break region436;
        } else {
            edgeValue766 = regionValue687;
            edgeValue767 = regionValue688;
            edgeValue768 = regionValue689;
            edgeValue769 = regionValue690;
            regionValue746 = edgeValue766;
            regionValue747 = edgeValue767;
            regionValue748 = edgeValue768;
            regionValue749 = edgeValue769;
            break region145;
        }
        }
        value770 = recovery$indy$flow$100();
        value771 = recovery$indy$flow$101(value770, -3626764515505276552L, a0);
        value772 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value771)))).field_429));
        value773 = recovery$indy$flow$103(value772, regionValue749);
        value774 = recovery$indy$flow$104(value773);
        value775 = value774;
        comparison776 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison776 <= 0) {
            edgeValue816 = regionValue746;
            edgeValue817 = regionValue747;
            edgeValue818 = regionValue748;
            edgeValue819 = regionValue749;
            edgeValue820 = value775;
            edgeValue821 = value775;
            regionValue793 = edgeValue816;
            regionValue794 = edgeValue817;
            regionValue795 = edgeValue818;
            regionValue796 = edgeValue819;
            regionValue797 = edgeValue820;
            regionValue798 = edgeValue821;
            break region164;
        } else {
            edgeValue862 = regionValue746;
            edgeValue863 = regionValue747;
            edgeValue864 = regionValue748;
            edgeValue865 = regionValue749;
            edgeValue866 = value775;
            edgeValue867 = value775;
            regionValue839 = edgeValue862;
            regionValue840 = edgeValue863;
            regionValue841 = edgeValue864;
            regionValue842 = edgeValue865;
            regionValue843 = edgeValue866;
            regionValue844 = edgeValue867;
            break region160;
        }
        }
        if (value47 != 0) {
            edgeValue895 = regionValue839;
            edgeValue896 = regionValue840;
            edgeValue897 = regionValue841;
            edgeValue898 = regionValue842;
            edgeValue899 = regionValue843;
            edgeValue900 = regionValue844;
            regionValue879 = edgeValue895;
            regionValue880 = edgeValue896;
            regionValue881 = edgeValue897;
            regionValue882 = edgeValue898;
            regionValue883 = edgeValue899;
            regionValue884 = edgeValue900;
            break region1053;
        } else {
            edgeValue939 = regionValue839;
            edgeValue940 = regionValue840;
            edgeValue941 = regionValue841;
            edgeValue942 = regionValue842;
            edgeValue943 = regionValue843;
            edgeValue944 = regionValue844;
            regionValue917 = edgeValue939;
            regionValue918 = edgeValue940;
            regionValue919 = edgeValue941;
            regionValue920 = edgeValue942;
            regionValue921 = edgeValue943;
            regionValue922 = edgeValue944;
            break region161;
        }
        }
        edgeValue983 = regionValue917;
        edgeValue984 = regionValue918;
        edgeValue985 = regionValue919;
        edgeValue986 = regionValue920;
        edgeValue987 = regionValue921;
        edgeValue988 = regionValue922;
        regionValue961 = edgeValue983;
        regionValue962 = edgeValue984;
        regionValue963 = edgeValue985;
        regionValue964 = edgeValue986;
        regionValue965 = edgeValue987;
        regionValue966 = edgeValue988;
        break region163;
        }
        edgeValue1005 = regionValue961;
        edgeValue1006 = regionValue962;
        edgeValue1007 = regionValue963;
        edgeValue1008 = regionValue964;
        edgeValue1009 = regionValue965;
        edgeValue1010 = regionValue966;
        regionValue793 = edgeValue1005;
        regionValue794 = edgeValue1006;
        regionValue795 = edgeValue1007;
        regionValue796 = edgeValue1008;
        regionValue797 = edgeValue1009;
        regionValue798 = edgeValue1010;
        break region164;
        }
        if (value47 != 0) {
            edgeValue1050 = regionValue793;
            edgeValue1051 = regionValue794;
            edgeValue1052 = regionValue795;
            edgeValue1053 = regionValue796;
            edgeValue1054 = regionValue797;
            edgeValue1055 = regionValue798;
            regionValue1028 = edgeValue1050;
            regionValue1029 = edgeValue1051;
            regionValue1030 = edgeValue1052;
            regionValue1031 = edgeValue1053;
            regionValue1032 = edgeValue1054;
            regionValue1033 = edgeValue1055;
            break region168;
        } else {
            edgeValue1094 = regionValue793;
            edgeValue1095 = regionValue794;
            edgeValue1096 = regionValue795;
            edgeValue1097 = regionValue796;
            edgeValue1098 = regionValue797;
            edgeValue1099 = regionValue798;
            regionValue1072 = edgeValue1094;
            regionValue1073 = edgeValue1095;
            regionValue1074 = edgeValue1096;
            regionValue1075 = edgeValue1097;
            regionValue1076 = edgeValue1098;
            regionValue1077 = edgeValue1099;
            break region165;
        }
        }
        if (regionValue1077 != null) {
            edgeValue1137 = regionValue1072;
            edgeValue1138 = regionValue1073;
            edgeValue1139 = regionValue1074;
            edgeValue1140 = regionValue1075;
            edgeValue1141 = regionValue1076;
            regionValue1116 = edgeValue1137;
            regionValue1117 = edgeValue1138;
            regionValue1118 = edgeValue1139;
            regionValue1119 = edgeValue1140;
            regionValue1120 = edgeValue1141;
            break region167;
        } else {
            edgeValue1178 = regionValue1072;
            edgeValue1179 = regionValue1073;
            edgeValue1180 = regionValue1074;
            edgeValue1181 = regionValue1075;
            regionValue1158 = edgeValue1178;
            regionValue1159 = edgeValue1179;
            regionValue1160 = edgeValue1180;
            regionValue1161 = edgeValue1181;
            break region166;
        }
        }
        edgeValue1218 = regionValue1158;
        edgeValue1219 = regionValue1159;
        edgeValue1220 = regionValue1160;
        edgeValue1221 = regionValue1161;
        regionValue1198 = edgeValue1218;
        regionValue1199 = edgeValue1219;
        regionValue1200 = edgeValue1220;
        regionValue1201 = edgeValue1221;
        break region433;
        }
        edgeValue1238 = regionValue1116;
        edgeValue1239 = regionValue1117;
        edgeValue1240 = regionValue1118;
        edgeValue1241 = regionValue1119;
        edgeValue1242 = regionValue1120;
        edgeValue1243 = regionValue1120;
        regionValue1028 = edgeValue1238;
        regionValue1029 = edgeValue1239;
        regionValue1030 = edgeValue1240;
        regionValue1031 = edgeValue1241;
        regionValue1032 = edgeValue1242;
        regionValue1033 = edgeValue1243;
        break region168;
        }
        value1244 = recovery$indy$flow$105(regionValue1033);
        value1245 = value1244;
        if (value47 != 0) {
            edgeValue1285 = regionValue1028;
            edgeValue1286 = regionValue1029;
            edgeValue1287 = regionValue1030;
            edgeValue1288 = regionValue1031;
            edgeValue1289 = regionValue1032;
            edgeValue1290 = value1245;
            regionValue1262 = edgeValue1285;
            regionValue1263 = edgeValue1286;
            regionValue1264 = edgeValue1287;
            regionValue1265 = edgeValue1288;
            regionValue1266 = edgeValue1289;
            regionValue1267 = edgeValue1290;
            break region181;
        } else {
            edgeValue1331 = regionValue1028;
            edgeValue1332 = regionValue1029;
            edgeValue1333 = regionValue1030;
            edgeValue1334 = regionValue1031;
            edgeValue1335 = regionValue1032;
            edgeValue1336 = value1245;
            regionValue1308 = edgeValue1331;
            regionValue1309 = edgeValue1332;
            regionValue1310 = edgeValue1333;
            regionValue1311 = edgeValue1334;
            regionValue1312 = edgeValue1335;
            regionValue1313 = edgeValue1336;
            break region173;
        }
        }
        value1338 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(value45)))).field_49));
        value1339 = recovery$indy$flow$107();
        if (((java.lang.Object) value1338) != ((java.lang.Object) value1339)) {
            edgeValue1377 = regionValue1308;
            edgeValue1378 = regionValue1309;
            edgeValue1379 = regionValue1310;
            edgeValue1380 = regionValue1311;
            edgeValue1381 = regionValue1312;
            regionValue1356 = edgeValue1377;
            regionValue1357 = edgeValue1378;
            regionValue1358 = edgeValue1379;
            regionValue1359 = edgeValue1380;
            regionValue1360 = edgeValue1381;
            break region322;
        } else {
            edgeValue1420 = regionValue1308;
            edgeValue1421 = regionValue1309;
            edgeValue1422 = regionValue1310;
            edgeValue1423 = regionValue1311;
            edgeValue1424 = regionValue1312;
            edgeValue1425 = regionValue1313;
            regionValue1398 = edgeValue1420;
            regionValue1399 = edgeValue1421;
            regionValue1400 = edgeValue1422;
            regionValue1401 = edgeValue1423;
            regionValue1402 = edgeValue1424;
            regionValue1403 = edgeValue1425;
            break region176;
        }
        }
        edgeValue1464 = regionValue1398;
        edgeValue1465 = regionValue1399;
        edgeValue1466 = regionValue1400;
        edgeValue1467 = regionValue1401;
        edgeValue1468 = regionValue1402;
        edgeValue1469 = regionValue1403;
        regionValue1442 = edgeValue1464;
        regionValue1443 = edgeValue1465;
        regionValue1444 = edgeValue1466;
        regionValue1445 = edgeValue1467;
        regionValue1446 = edgeValue1468;
        regionValue1447 = edgeValue1469;
        break region178;
        }
        edgeValue1486 = regionValue1442;
        edgeValue1487 = regionValue1443;
        edgeValue1488 = regionValue1444;
        edgeValue1489 = regionValue1445;
        edgeValue1490 = regionValue1446;
        edgeValue1491 = regionValue1447;
        regionValue1262 = edgeValue1486;
        regionValue1263 = edgeValue1487;
        regionValue1264 = edgeValue1488;
        regionValue1265 = edgeValue1489;
        regionValue1266 = edgeValue1490;
        regionValue1267 = edgeValue1491;
        break region181;
        }
        value1493 = recovery$indy$flow$108(value45);
        if (value1493 == null) {
            edgeValue1510 = regionValue1262;
            edgeValue1511 = regionValue1263;
            edgeValue1512 = regionValue1264;
            edgeValue1513 = regionValue1265;
            edgeValue1514 = regionValue1266;
            regionValue1356 = edgeValue1510;
            regionValue1357 = edgeValue1511;
            regionValue1358 = edgeValue1512;
            regionValue1359 = edgeValue1513;
            regionValue1360 = edgeValue1514;
            break region322;
        } else {
            edgeValue1553 = regionValue1262;
            edgeValue1554 = regionValue1263;
            edgeValue1555 = regionValue1264;
            edgeValue1556 = regionValue1265;
            edgeValue1557 = regionValue1266;
            edgeValue1558 = regionValue1267;
            regionValue1531 = edgeValue1553;
            regionValue1532 = edgeValue1554;
            regionValue1533 = edgeValue1555;
            regionValue1534 = edgeValue1556;
            regionValue1535 = edgeValue1557;
            regionValue1536 = edgeValue1558;
            break region183;
        }
        }
        value1559 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingTools));
        value1560 = recovery$indy$flow$110(value1559, -3628393978617010352L, a0);
        if (value47 != 0) {
            edgeValue1599 = regionValue1531;
            edgeValue1600 = regionValue1532;
            edgeValue1601 = regionValue1533;
            edgeValue1602 = regionValue1534;
            edgeValue1603 = regionValue1535;
            edgeValue1604 = (int) ((value1560 ? 1 : 0));
            regionValue1577 = edgeValue1599;
            regionValue1578 = edgeValue1600;
            regionValue1579 = edgeValue1601;
            regionValue1580 = edgeValue1602;
            regionValue1581 = edgeValue1603;
            regionValue1582 = edgeValue1604;
            break region327;
        } else {
            edgeValue1644 = regionValue1531;
            edgeValue1645 = regionValue1532;
            edgeValue1646 = regionValue1533;
            edgeValue1647 = regionValue1534;
            edgeValue1648 = regionValue1535;
            edgeValue1649 = regionValue1536;
            edgeValue1650 = (int) ((value1560 ? 1 : 0));
            regionValue1621 = edgeValue1644;
            regionValue1622 = edgeValue1645;
            regionValue1623 = edgeValue1646;
            regionValue1624 = edgeValue1647;
            regionValue1625 = edgeValue1648;
            regionValue1626 = edgeValue1649;
            regionValue1627 = edgeValue1650;
            break region190;
        }
        }
        edgeValue1690 = regionValue1621;
        edgeValue1691 = regionValue1622;
        edgeValue1692 = regionValue1623;
        edgeValue1693 = regionValue1624;
        edgeValue1694 = regionValue1625;
        edgeValue1695 = regionValue1626;
        edgeValue1696 = regionValue1627;
        regionValue1667 = edgeValue1690;
        regionValue1668 = edgeValue1691;
        regionValue1669 = edgeValue1692;
        regionValue1670 = edgeValue1693;
        regionValue1671 = edgeValue1694;
        regionValue1672 = edgeValue1695;
        regionValue1673 = edgeValue1696;
        break region192;
        }
        if (regionValue1673 == 0) {
            edgeValue1713 = regionValue1667;
            edgeValue1714 = regionValue1668;
            edgeValue1715 = regionValue1669;
            edgeValue1716 = regionValue1670;
            edgeValue1717 = regionValue1671;
            regionValue1356 = edgeValue1713;
            regionValue1357 = edgeValue1714;
            regionValue1358 = edgeValue1715;
            regionValue1359 = edgeValue1716;
            regionValue1360 = edgeValue1717;
            break region322;
        } else {
            edgeValue1756 = regionValue1667;
            edgeValue1757 = regionValue1668;
            edgeValue1758 = regionValue1669;
            edgeValue1759 = regionValue1670;
            edgeValue1760 = regionValue1671;
            edgeValue1761 = regionValue1672;
            regionValue1734 = edgeValue1756;
            regionValue1735 = edgeValue1757;
            regionValue1736 = edgeValue1758;
            regionValue1737 = edgeValue1759;
            regionValue1738 = edgeValue1760;
            regionValue1739 = edgeValue1761;
            break region193;
        }
        }
        edgeValue1800 = regionValue1734;
        edgeValue1801 = regionValue1735;
        edgeValue1802 = regionValue1736;
        edgeValue1803 = regionValue1737;
        edgeValue1804 = regionValue1738;
        edgeValue1805 = regionValue1739;
        regionValue1778 = edgeValue1800;
        regionValue1779 = edgeValue1801;
        regionValue1780 = edgeValue1802;
        regionValue1781 = edgeValue1803;
        regionValue1782 = edgeValue1804;
        regionValue1783 = edgeValue1805;
        break region195;
        }
        value1806 = recovery$indy$flow$111();
        comparison1807 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison1807 <= 0) {
            edgeValue1848 = regionValue1778;
            edgeValue1849 = regionValue1779;
            edgeValue1850 = regionValue1780;
            edgeValue1851 = regionValue1781;
            edgeValue1852 = regionValue1782;
            edgeValue1853 = regionValue1783;
            edgeValue1854 = (int) ((value1806 ? 1 : 0));
            regionValue1824 = edgeValue1848;
            regionValue1825 = edgeValue1849;
            regionValue1826 = edgeValue1850;
            regionValue1827 = edgeValue1851;
            regionValue1828 = edgeValue1852;
            regionValue1829 = edgeValue1853;
            regionValue1830 = edgeValue1854;
            break region225;
        } else {
            edgeValue1896 = regionValue1778;
            edgeValue1897 = regionValue1779;
            edgeValue1898 = regionValue1780;
            edgeValue1899 = regionValue1781;
            edgeValue1900 = regionValue1782;
            edgeValue1901 = regionValue1783;
            edgeValue1902 = (int) ((value1806 ? 1 : 0));
            regionValue1872 = edgeValue1896;
            regionValue1873 = edgeValue1897;
            regionValue1874 = edgeValue1898;
            regionValue1875 = edgeValue1899;
            regionValue1876 = edgeValue1900;
            regionValue1877 = edgeValue1901;
            regionValue1878 = edgeValue1902;
            break region201;
        }
        }
        edgeValue1944 = regionValue1872;
        edgeValue1945 = regionValue1873;
        edgeValue1946 = regionValue1874;
        edgeValue1947 = regionValue1875;
        edgeValue1948 = regionValue1876;
        edgeValue1949 = regionValue1877;
        edgeValue1950 = regionValue1878;
        regionValue1920 = edgeValue1944;
        regionValue1921 = edgeValue1945;
        regionValue1922 = edgeValue1946;
        regionValue1923 = edgeValue1947;
        regionValue1924 = edgeValue1948;
        regionValue1925 = edgeValue1949;
        regionValue1926 = edgeValue1950;
        break region203;
        }
        if (value47 != 0) {
            edgeValue1991 = regionValue1920;
            edgeValue1992 = regionValue1921;
            edgeValue1993 = regionValue1922;
            edgeValue1994 = regionValue1923;
            edgeValue1995 = regionValue1924;
            edgeValue1996 = regionValue1925;
            edgeValue1997 = regionValue1926;
            regionValue1968 = edgeValue1991;
            regionValue1969 = edgeValue1992;
            regionValue1970 = edgeValue1993;
            regionValue1971 = edgeValue1994;
            regionValue1972 = edgeValue1995;
            regionValue1973 = edgeValue1996;
            regionValue1974 = edgeValue1997;
            break region224;
        } else {
            edgeValue2037 = regionValue1920;
            edgeValue2038 = regionValue1921;
            edgeValue2039 = regionValue1922;
            edgeValue2040 = regionValue1923;
            edgeValue2041 = regionValue1924;
            edgeValue2042 = regionValue1925;
            edgeValue2043 = regionValue1926;
            regionValue2014 = edgeValue2037;
            regionValue2015 = edgeValue2038;
            regionValue2016 = edgeValue2039;
            regionValue2017 = edgeValue2040;
            regionValue2018 = edgeValue2041;
            regionValue2019 = edgeValue2042;
            regionValue2020 = edgeValue2043;
            break region204;
        }
        }
        edgeValue2083 = regionValue2014;
        edgeValue2084 = regionValue2015;
        edgeValue2085 = regionValue2016;
        edgeValue2086 = regionValue2017;
        edgeValue2087 = regionValue2018;
        edgeValue2088 = regionValue2019;
        edgeValue2089 = regionValue2020;
        regionValue2060 = edgeValue2083;
        regionValue2061 = edgeValue2084;
        regionValue2062 = edgeValue2085;
        regionValue2063 = edgeValue2086;
        regionValue2064 = edgeValue2087;
        regionValue2065 = edgeValue2088;
        regionValue2066 = edgeValue2089;
        break region206;
        }
        if (regionValue2066 != 0) {
            edgeValue2128 = regionValue2060;
            edgeValue2129 = regionValue2061;
            edgeValue2130 = regionValue2062;
            edgeValue2131 = regionValue2063;
            edgeValue2132 = regionValue2064;
            edgeValue2133 = regionValue2065;
            regionValue2106 = edgeValue2128;
            regionValue2107 = edgeValue2129;
            regionValue2108 = edgeValue2130;
            regionValue2109 = edgeValue2131;
            regionValue2110 = edgeValue2132;
            regionValue2111 = edgeValue2133;
            break region220;
        } else {
            edgeValue2172 = regionValue2060;
            edgeValue2173 = regionValue2061;
            edgeValue2174 = regionValue2062;
            edgeValue2175 = regionValue2063;
            edgeValue2176 = regionValue2064;
            edgeValue2177 = regionValue2065;
            regionValue2150 = edgeValue2172;
            regionValue2151 = edgeValue2173;
            regionValue2152 = edgeValue2174;
            regionValue2153 = edgeValue2175;
            regionValue2154 = edgeValue2176;
            regionValue2155 = edgeValue2177;
            break region207;
        }
        }
        value2178 = recovery$indy$flow$112();
        value2179 = recovery$indy$flow$113(value2178, -3626585406982106914L, a0);
        value2180 = ((java.lang.Object)(((net.C_47oo) (((java.lang.Object)(value2179)))).field_44l));
        value2181 = recovery$indy$flow$115(value2180);
        if (value47 != 0) {
            edgeValue2198 = regionValue2150;
            edgeValue2199 = regionValue2151;
            edgeValue2200 = regionValue2152;
            edgeValue2201 = regionValue2153;
            edgeValue2202 = regionValue2154;
            edgeValue2203 = (int) ((value2181 ? 1 : 0));
            regionValue1577 = edgeValue2198;
            regionValue1578 = edgeValue2199;
            regionValue1579 = edgeValue2200;
            regionValue1580 = edgeValue2201;
            regionValue1581 = edgeValue2202;
            regionValue1582 = edgeValue2203;
            break region327;
        } else {
            edgeValue2243 = regionValue2150;
            edgeValue2244 = regionValue2151;
            edgeValue2245 = regionValue2152;
            edgeValue2246 = regionValue2153;
            edgeValue2247 = regionValue2154;
            edgeValue2248 = regionValue2155;
            edgeValue2249 = (int) ((value2181 ? 1 : 0));
            regionValue2220 = edgeValue2243;
            regionValue2221 = edgeValue2244;
            regionValue2222 = edgeValue2245;
            regionValue2223 = edgeValue2246;
            regionValue2224 = edgeValue2247;
            regionValue2225 = edgeValue2248;
            regionValue2226 = edgeValue2249;
            break region215;
        }
        }
        edgeValue2289 = regionValue2220;
        edgeValue2290 = regionValue2221;
        edgeValue2291 = regionValue2222;
        edgeValue2292 = regionValue2223;
        edgeValue2293 = regionValue2224;
        edgeValue2294 = regionValue2225;
        edgeValue2295 = regionValue2226;
        regionValue2266 = edgeValue2289;
        regionValue2267 = edgeValue2290;
        regionValue2268 = edgeValue2291;
        regionValue2269 = edgeValue2292;
        regionValue2270 = edgeValue2293;
        regionValue2271 = edgeValue2294;
        regionValue2272 = edgeValue2295;
        break region217;
        }
        if (regionValue2272 == 0) {
            edgeValue2312 = regionValue2266;
            edgeValue2313 = regionValue2267;
            edgeValue2314 = regionValue2268;
            edgeValue2315 = regionValue2269;
            edgeValue2316 = regionValue2270;
            regionValue1356 = edgeValue2312;
            regionValue1357 = edgeValue2313;
            regionValue1358 = edgeValue2314;
            regionValue1359 = edgeValue2315;
            regionValue1360 = edgeValue2316;
            break region322;
        } else {
            edgeValue2355 = regionValue2266;
            edgeValue2356 = regionValue2267;
            edgeValue2357 = regionValue2268;
            edgeValue2358 = regionValue2269;
            edgeValue2359 = regionValue2270;
            edgeValue2360 = regionValue2271;
            regionValue2333 = edgeValue2355;
            regionValue2334 = edgeValue2356;
            regionValue2335 = edgeValue2357;
            regionValue2336 = edgeValue2358;
            regionValue2337 = edgeValue2359;
            regionValue2338 = edgeValue2360;
            break region218;
        }
        }
        edgeValue2377 = regionValue2333;
        edgeValue2378 = regionValue2334;
        edgeValue2379 = regionValue2335;
        edgeValue2380 = regionValue2336;
        edgeValue2381 = regionValue2337;
        edgeValue2382 = regionValue2338;
        regionValue2106 = edgeValue2377;
        regionValue2107 = edgeValue2378;
        regionValue2108 = edgeValue2379;
        regionValue2109 = edgeValue2380;
        regionValue2110 = edgeValue2381;
        regionValue2111 = edgeValue2382;
        break region220;
        }
        value2383 = recovery$indy$flow$116(regionValue2111);
        edgeValue2400 = regionValue2106;
        edgeValue2401 = regionValue2107;
        edgeValue2402 = regionValue2108;
        edgeValue2403 = regionValue2109;
        edgeValue2404 = regionValue2110;
        edgeValue2405 = regionValue2111;
        edgeValue2406 = (int) ((value2383 ? 1 : 0));
        regionValue1968 = edgeValue2400;
        regionValue1969 = edgeValue2401;
        regionValue1970 = edgeValue2402;
        regionValue1971 = edgeValue2403;
        regionValue1972 = edgeValue2404;
        regionValue1973 = edgeValue2405;
        regionValue1974 = edgeValue2406;
        break region224;
        }
        edgeValue2423 = regionValue1968;
        edgeValue2424 = regionValue1969;
        edgeValue2425 = regionValue1970;
        edgeValue2426 = regionValue1971;
        edgeValue2427 = regionValue1972;
        edgeValue2428 = regionValue1973;
        edgeValue2429 = regionValue1974;
        regionValue1824 = edgeValue2423;
        regionValue1825 = edgeValue2424;
        regionValue1826 = edgeValue2425;
        regionValue1827 = edgeValue2426;
        regionValue1828 = edgeValue2427;
        regionValue1829 = edgeValue2428;
        regionValue1830 = edgeValue2429;
        break region225;
        }
        comparison2431 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison2431 <= 0) {
            edgeValue2472 = regionValue1824;
            edgeValue2473 = regionValue1825;
            edgeValue2474 = regionValue1826;
            edgeValue2475 = regionValue1827;
            edgeValue2476 = regionValue1828;
            edgeValue2477 = regionValue1829;
            edgeValue2478 = regionValue1830;
            regionValue2448 = edgeValue2472;
            regionValue2449 = edgeValue2473;
            regionValue2450 = edgeValue2474;
            regionValue2451 = edgeValue2475;
            regionValue2452 = edgeValue2476;
            regionValue2453 = edgeValue2477;
            regionValue2454 = edgeValue2478;
            break region238;
        } else {
            edgeValue2520 = regionValue1824;
            edgeValue2521 = regionValue1825;
            edgeValue2522 = regionValue1826;
            edgeValue2523 = regionValue1827;
            edgeValue2524 = regionValue1828;
            edgeValue2525 = regionValue1829;
            edgeValue2526 = regionValue1830;
            regionValue2496 = edgeValue2520;
            regionValue2497 = edgeValue2521;
            regionValue2498 = edgeValue2522;
            regionValue2499 = edgeValue2523;
            regionValue2500 = edgeValue2524;
            regionValue2501 = edgeValue2525;
            regionValue2502 = edgeValue2526;
            break region229;
        }
        }
        if (value47 != 0) {
            edgeValue2567 = regionValue2496;
            edgeValue2568 = regionValue2497;
            edgeValue2569 = regionValue2498;
            edgeValue2570 = regionValue2499;
            edgeValue2571 = regionValue2500;
            edgeValue2572 = regionValue2501;
            edgeValue2573 = regionValue2502;
            regionValue2544 = edgeValue2567;
            regionValue2545 = edgeValue2568;
            regionValue2546 = edgeValue2569;
            regionValue2547 = edgeValue2570;
            regionValue2548 = edgeValue2571;
            regionValue2549 = edgeValue2572;
            regionValue2550 = edgeValue2573;
            break region237;
        } else {
            edgeValue2613 = regionValue2496;
            edgeValue2614 = regionValue2497;
            edgeValue2615 = regionValue2498;
            edgeValue2616 = regionValue2499;
            edgeValue2617 = regionValue2500;
            edgeValue2618 = regionValue2501;
            edgeValue2619 = regionValue2502;
            regionValue2590 = edgeValue2613;
            regionValue2591 = edgeValue2614;
            regionValue2592 = edgeValue2615;
            regionValue2593 = edgeValue2616;
            regionValue2594 = edgeValue2617;
            regionValue2595 = edgeValue2618;
            regionValue2596 = edgeValue2619;
            break region230;
        }
        }
        edgeValue2659 = regionValue2590;
        edgeValue2660 = regionValue2591;
        edgeValue2661 = regionValue2592;
        edgeValue2662 = regionValue2593;
        edgeValue2663 = regionValue2594;
        edgeValue2664 = regionValue2595;
        edgeValue2665 = regionValue2596;
        regionValue2636 = edgeValue2659;
        regionValue2637 = edgeValue2660;
        regionValue2638 = edgeValue2661;
        regionValue2639 = edgeValue2662;
        regionValue2640 = edgeValue2663;
        regionValue2641 = edgeValue2664;
        regionValue2642 = edgeValue2665;
        break region232;
        }
        if (regionValue2642 != 0) {
            edgeValue2703 = regionValue2636;
            edgeValue2704 = regionValue2637;
            edgeValue2705 = regionValue2638;
            edgeValue2706 = regionValue2639;
            edgeValue2707 = regionValue2640;
            regionValue2682 = edgeValue2703;
            regionValue2683 = edgeValue2704;
            regionValue2684 = edgeValue2705;
            regionValue2685 = edgeValue2706;
            regionValue2686 = edgeValue2707;
            break region268;
        } else {
            edgeValue2746 = regionValue2636;
            edgeValue2747 = regionValue2637;
            edgeValue2748 = regionValue2638;
            edgeValue2749 = regionValue2639;
            edgeValue2750 = regionValue2640;
            edgeValue2751 = regionValue2641;
            regionValue2724 = edgeValue2746;
            regionValue2725 = edgeValue2747;
            regionValue2726 = edgeValue2748;
            regionValue2727 = edgeValue2749;
            regionValue2728 = edgeValue2750;
            regionValue2729 = edgeValue2751;
            break region233;
        }
        }
        value2752 = recovery$indy$flow$117(regionValue2729);
        edgeValue2769 = regionValue2724;
        edgeValue2770 = regionValue2725;
        edgeValue2771 = regionValue2726;
        edgeValue2772 = regionValue2727;
        edgeValue2773 = regionValue2728;
        edgeValue2774 = regionValue2729;
        edgeValue2775 = (int) ((value2752 ? 1 : 0));
        regionValue2544 = edgeValue2769;
        regionValue2545 = edgeValue2770;
        regionValue2546 = edgeValue2771;
        regionValue2547 = edgeValue2772;
        regionValue2548 = edgeValue2773;
        regionValue2549 = edgeValue2774;
        regionValue2550 = edgeValue2775;
        break region237;
        }
        edgeValue2792 = regionValue2544;
        edgeValue2793 = regionValue2545;
        edgeValue2794 = regionValue2546;
        edgeValue2795 = regionValue2547;
        edgeValue2796 = regionValue2548;
        edgeValue2797 = regionValue2549;
        edgeValue2798 = regionValue2550;
        regionValue2448 = edgeValue2792;
        regionValue2449 = edgeValue2793;
        regionValue2450 = edgeValue2794;
        regionValue2451 = edgeValue2795;
        regionValue2452 = edgeValue2796;
        regionValue2453 = edgeValue2797;
        regionValue2454 = edgeValue2798;
        break region238;
        }
        if (value47 != 0) {
            edgeValue2838 = regionValue2448;
            edgeValue2839 = regionValue2449;
            edgeValue2840 = regionValue2450;
            edgeValue2841 = regionValue2451;
            edgeValue2842 = regionValue2452;
            edgeValue2843 = regionValue2454;
            regionValue2816 = edgeValue2838;
            regionValue2817 = edgeValue2839;
            regionValue2818 = edgeValue2840;
            regionValue2819 = edgeValue2841;
            regionValue2820 = edgeValue2842;
            regionValue2821 = edgeValue2843;
            break region265;
        } else {
            edgeValue2883 = regionValue2448;
            edgeValue2884 = regionValue2449;
            edgeValue2885 = regionValue2450;
            edgeValue2886 = regionValue2451;
            edgeValue2887 = regionValue2452;
            edgeValue2888 = regionValue2453;
            edgeValue2889 = regionValue2454;
            regionValue2860 = edgeValue2883;
            regionValue2861 = edgeValue2884;
            regionValue2862 = edgeValue2885;
            regionValue2863 = edgeValue2886;
            regionValue2864 = edgeValue2887;
            regionValue2865 = edgeValue2888;
            regionValue2866 = edgeValue2889;
            break region239;
        }
        }
        if (regionValue2866 == 0) {
            edgeValue2928 = regionValue2860;
            edgeValue2929 = regionValue2861;
            edgeValue2930 = regionValue2862;
            edgeValue2931 = regionValue2863;
            edgeValue2932 = regionValue2864;
            edgeValue2933 = regionValue2865;
            regionValue2906 = edgeValue2928;
            regionValue2907 = edgeValue2929;
            regionValue2908 = edgeValue2930;
            regionValue2909 = edgeValue2931;
            regionValue2910 = edgeValue2932;
            regionValue2911 = edgeValue2933;
            break region261;
        } else {
            edgeValue2972 = regionValue2860;
            edgeValue2973 = regionValue2861;
            edgeValue2974 = regionValue2862;
            edgeValue2975 = regionValue2863;
            edgeValue2976 = regionValue2864;
            edgeValue2977 = regionValue2865;
            regionValue2950 = edgeValue2972;
            regionValue2951 = edgeValue2973;
            regionValue2952 = edgeValue2974;
            regionValue2953 = edgeValue2975;
            regionValue2954 = edgeValue2976;
            regionValue2955 = edgeValue2977;
            break region240;
        }
        }
        value2978 = recovery$indy$flow$118();
        value2979 = recovery$indy$flow$119(value2978, -3626709631598910589L, a0);
        value2980 = recovery$indy$flow$120(value45);
        value2981 = recovery$indy$flow$121(value2979, value2980);
        value2982 = recovery$indy$flow$122(value2981);
        value2983 = recovery$indy$flow$123();
        value2984 = recovery$indy$flow$124(value2982, value2983);
        comparison2985 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison2985 <= 0) {
            edgeValue3025 = regionValue2950;
            edgeValue3026 = regionValue2951;
            edgeValue3027 = regionValue2952;
            edgeValue3028 = regionValue2953;
            edgeValue3029 = regionValue2954;
            edgeValue3030 = (int) ((value2984 ? 1 : 0));
            regionValue3002 = edgeValue3025;
            regionValue3003 = edgeValue3026;
            regionValue3004 = edgeValue3027;
            regionValue3005 = edgeValue3028;
            regionValue3006 = edgeValue3029;
            regionValue3007 = edgeValue3030;
            break region266;
        } else {
            edgeValue3072 = regionValue2950;
            edgeValue3073 = regionValue2951;
            edgeValue3074 = regionValue2952;
            edgeValue3075 = regionValue2953;
            edgeValue3076 = regionValue2954;
            edgeValue3077 = regionValue2955;
            edgeValue3078 = (int) ((value2984 ? 1 : 0));
            regionValue3048 = edgeValue3072;
            regionValue3049 = edgeValue3073;
            regionValue3050 = edgeValue3074;
            regionValue3051 = edgeValue3075;
            regionValue3052 = edgeValue3076;
            regionValue3053 = edgeValue3077;
            regionValue3054 = edgeValue3078;
            break region255;
        }
        }
        edgeValue3120 = regionValue3048;
        edgeValue3121 = regionValue3049;
        edgeValue3122 = regionValue3050;
        edgeValue3123 = regionValue3051;
        edgeValue3124 = regionValue3052;
        edgeValue3125 = regionValue3053;
        edgeValue3126 = regionValue3054;
        regionValue3096 = edgeValue3120;
        regionValue3097 = edgeValue3121;
        regionValue3098 = edgeValue3122;
        regionValue3099 = edgeValue3123;
        regionValue3100 = edgeValue3124;
        regionValue3101 = edgeValue3125;
        regionValue3102 = edgeValue3126;
        break region257;
        }
        if (value47 != 0) {
            edgeValue3144 = regionValue3096;
            edgeValue3145 = regionValue3097;
            edgeValue3146 = regionValue3098;
            edgeValue3147 = regionValue3099;
            edgeValue3148 = regionValue3100;
            edgeValue3149 = regionValue3102;
            regionValue2816 = edgeValue3144;
            regionValue2817 = edgeValue3145;
            regionValue2818 = edgeValue3146;
            regionValue2819 = edgeValue3147;
            regionValue2820 = edgeValue3148;
            regionValue2821 = edgeValue3149;
            break region265;
        } else {
            edgeValue3189 = regionValue3096;
            edgeValue3190 = regionValue3097;
            edgeValue3191 = regionValue3098;
            edgeValue3192 = regionValue3099;
            edgeValue3193 = regionValue3100;
            edgeValue3194 = regionValue3101;
            edgeValue3195 = regionValue3102;
            regionValue3166 = edgeValue3189;
            regionValue3167 = edgeValue3190;
            regionValue3168 = edgeValue3191;
            regionValue3169 = edgeValue3192;
            regionValue3170 = edgeValue3193;
            regionValue3171 = edgeValue3194;
            regionValue3172 = edgeValue3195;
            break region258;
        }
        }
        edgeValue3235 = regionValue3166;
        edgeValue3236 = regionValue3167;
        edgeValue3237 = regionValue3168;
        edgeValue3238 = regionValue3169;
        edgeValue3239 = regionValue3170;
        edgeValue3240 = regionValue3171;
        edgeValue3241 = regionValue3172;
        regionValue3212 = edgeValue3235;
        regionValue3213 = edgeValue3236;
        regionValue3214 = edgeValue3237;
        regionValue3215 = edgeValue3238;
        regionValue3216 = edgeValue3239;
        regionValue3217 = edgeValue3240;
        regionValue3218 = edgeValue3241;
        break region260;
        }
        if (regionValue3218 != 0) {
            edgeValue3258 = regionValue3212;
            edgeValue3259 = regionValue3213;
            edgeValue3260 = regionValue3214;
            edgeValue3261 = regionValue3215;
            edgeValue3262 = regionValue3216;
            regionValue2682 = edgeValue3258;
            regionValue2683 = edgeValue3259;
            regionValue2684 = edgeValue3260;
            regionValue2685 = edgeValue3261;
            regionValue2686 = edgeValue3262;
            break region268;
        } else {
            edgeValue3279 = regionValue3212;
            edgeValue3280 = regionValue3213;
            edgeValue3281 = regionValue3214;
            edgeValue3282 = regionValue3215;
            edgeValue3283 = regionValue3216;
            edgeValue3284 = regionValue3217;
            regionValue2906 = edgeValue3279;
            regionValue2907 = edgeValue3280;
            regionValue2908 = edgeValue3281;
            regionValue2909 = edgeValue3282;
            regionValue2910 = edgeValue3283;
            regionValue2911 = edgeValue3284;
            break region261;
        }
        }
        value3285 = recovery$indy$flow$125(regionValue2911);
        edgeValue3302 = regionValue2906;
        edgeValue3303 = regionValue2907;
        edgeValue3304 = regionValue2908;
        edgeValue3305 = regionValue2909;
        edgeValue3306 = regionValue2910;
        edgeValue3307 = (int) ((value3285 ? 1 : 0));
        regionValue2816 = edgeValue3302;
        regionValue2817 = edgeValue3303;
        regionValue2818 = edgeValue3304;
        regionValue2819 = edgeValue3305;
        regionValue2820 = edgeValue3306;
        regionValue2821 = edgeValue3307;
        break region265;
        }
        edgeValue3324 = regionValue2816;
        edgeValue3325 = regionValue2817;
        edgeValue3326 = regionValue2818;
        edgeValue3327 = regionValue2819;
        edgeValue3328 = regionValue2820;
        edgeValue3329 = regionValue2821;
        regionValue3002 = edgeValue3324;
        regionValue3003 = edgeValue3325;
        regionValue3004 = edgeValue3326;
        regionValue3005 = edgeValue3327;
        regionValue3006 = edgeValue3328;
        regionValue3007 = edgeValue3329;
        break region266;
        }
        if (value47 != 0) {
            edgeValue3347 = regionValue3002;
            edgeValue3348 = regionValue3003;
            edgeValue3349 = regionValue3004;
            edgeValue3350 = regionValue3005;
            edgeValue3351 = regionValue3006;
            edgeValue3352 = regionValue3007;
            regionValue1577 = edgeValue3347;
            regionValue1578 = edgeValue3348;
            regionValue1579 = edgeValue3349;
            regionValue1580 = edgeValue3350;
            regionValue1581 = edgeValue3351;
            regionValue1582 = edgeValue3352;
            break region327;
        } else {
            edgeValue3391 = regionValue3002;
            edgeValue3392 = regionValue3003;
            edgeValue3393 = regionValue3004;
            edgeValue3394 = regionValue3005;
            edgeValue3395 = regionValue3006;
            edgeValue3396 = regionValue3007;
            regionValue3369 = edgeValue3391;
            regionValue3370 = edgeValue3392;
            regionValue3371 = edgeValue3393;
            regionValue3372 = edgeValue3394;
            regionValue3373 = edgeValue3395;
            regionValue3374 = edgeValue3396;
            break region267;
        }
        }
        if (regionValue3374 == 0) {
            edgeValue3413 = regionValue3369;
            edgeValue3414 = regionValue3370;
            edgeValue3415 = regionValue3371;
            edgeValue3416 = regionValue3372;
            edgeValue3417 = regionValue3373;
            regionValue1356 = edgeValue3413;
            regionValue1357 = edgeValue3414;
            regionValue1358 = edgeValue3415;
            regionValue1359 = edgeValue3416;
            regionValue1360 = edgeValue3417;
            break region322;
        } else {
            edgeValue3434 = regionValue3369;
            edgeValue3435 = regionValue3370;
            edgeValue3436 = regionValue3371;
            edgeValue3437 = regionValue3372;
            edgeValue3438 = regionValue3373;
            regionValue2682 = edgeValue3434;
            regionValue2683 = edgeValue3435;
            regionValue2684 = edgeValue3436;
            regionValue2685 = edgeValue3437;
            regionValue2686 = edgeValue3438;
            break region268;
        }
        }
        value3439 = recovery$indy$flow$126(this, computed6, regionValue2686, value45, -3627244205170747934L, a0);
        value3440 = value3439;
        value3441 = recovery$indy$flow$127(this, computed6, regionValue2684, value45, -3627244205170747934L, a0);
        value3442 = value3441;
        comparison3443 = (java.lang.Double.isNaN(value3440) || java.lang.Double.isNaN(1.0D) ? -1 : (value3440 > 1.0D ? 1 : value3440 == 1.0D ? 0 : -1));
        if (value47 != 0) {
            edgeValue3460 = regionValue2682;
            edgeValue3461 = regionValue2683;
            edgeValue3462 = regionValue2684;
            edgeValue3463 = regionValue2685;
            edgeValue3464 = regionValue2686;
            edgeValue3465 = comparison3443;
            regionValue1577 = edgeValue3460;
            regionValue1578 = edgeValue3461;
            regionValue1579 = edgeValue3462;
            regionValue1580 = edgeValue3463;
            regionValue1581 = edgeValue3464;
            regionValue1582 = edgeValue3465;
            break region327;
        } else {
            edgeValue3506 = regionValue2682;
            edgeValue3507 = regionValue2683;
            edgeValue3508 = regionValue2684;
            edgeValue3509 = regionValue2685;
            edgeValue3510 = regionValue2686;
            edgeValue3511 = value3440;
            edgeValue3512 = value3442;
            edgeValue3513 = comparison3443;
            regionValue3482 = edgeValue3506;
            regionValue3483 = edgeValue3507;
            regionValue3484 = edgeValue3508;
            regionValue3485 = edgeValue3509;
            regionValue3486 = edgeValue3510;
            regionValue3487 = edgeValue3511;
            regionValue3488 = edgeValue3512;
            regionValue3489 = edgeValue3513;
            break region289;
        }
        }
        if (regionValue3489 <= 0) {
            edgeValue3530 = regionValue3482;
            edgeValue3531 = regionValue3483;
            edgeValue3532 = regionValue3484;
            edgeValue3533 = regionValue3485;
            edgeValue3534 = regionValue3486;
            regionValue1356 = edgeValue3530;
            regionValue1357 = edgeValue3531;
            regionValue1358 = edgeValue3532;
            regionValue1359 = edgeValue3533;
            regionValue1360 = edgeValue3534;
            break region322;
        } else {
            edgeValue3574 = regionValue3482;
            edgeValue3575 = regionValue3483;
            edgeValue3576 = regionValue3484;
            edgeValue3577 = regionValue3485;
            edgeValue3578 = regionValue3486;
            edgeValue3579 = regionValue3487;
            edgeValue3580 = regionValue3488;
            regionValue3551 = edgeValue3574;
            regionValue3552 = edgeValue3575;
            regionValue3553 = edgeValue3576;
            regionValue3554 = edgeValue3577;
            regionValue3555 = edgeValue3578;
            regionValue3556 = edgeValue3579;
            regionValue3557 = edgeValue3580;
            break region290;
        }
        }
        edgeValue3620 = regionValue3551;
        edgeValue3621 = regionValue3552;
        edgeValue3622 = regionValue3553;
        edgeValue3623 = regionValue3554;
        edgeValue3624 = regionValue3555;
        edgeValue3625 = regionValue3556;
        edgeValue3626 = regionValue3557;
        regionValue3597 = edgeValue3620;
        regionValue3598 = edgeValue3621;
        regionValue3599 = edgeValue3622;
        regionValue3600 = edgeValue3623;
        regionValue3601 = edgeValue3624;
        regionValue3602 = edgeValue3625;
        regionValue3603 = edgeValue3626;
        break region292;
        }
        comparison3627 = (java.lang.Double.isNaN(regionValue3602) || java.lang.Double.isNaN(regionValue3603) ? -1 : (regionValue3602 > regionValue3603 ? 1 : regionValue3602 == regionValue3603 ? 0 : -1));
        if (value47 != 0) {
            edgeValue3644 = regionValue3597;
            edgeValue3645 = regionValue3598;
            edgeValue3646 = regionValue3599;
            edgeValue3647 = regionValue3600;
            edgeValue3648 = regionValue3601;
            edgeValue3649 = comparison3627;
            regionValue1577 = edgeValue3644;
            regionValue1578 = edgeValue3645;
            regionValue1579 = edgeValue3646;
            regionValue1580 = edgeValue3647;
            regionValue1581 = edgeValue3648;
            regionValue1582 = edgeValue3649;
            break region327;
        } else {
            edgeValue3689 = regionValue3597;
            edgeValue3690 = regionValue3598;
            edgeValue3691 = regionValue3599;
            edgeValue3692 = regionValue3600;
            edgeValue3693 = regionValue3601;
            edgeValue3694 = regionValue3602;
            edgeValue3695 = comparison3627;
            regionValue3666 = edgeValue3689;
            regionValue3667 = edgeValue3690;
            regionValue3668 = edgeValue3691;
            regionValue3669 = edgeValue3692;
            regionValue3670 = edgeValue3693;
            regionValue3671 = edgeValue3694;
            regionValue3672 = edgeValue3695;
            break region297;
        }
        }
        edgeValue3735 = regionValue3666;
        edgeValue3736 = regionValue3667;
        edgeValue3737 = regionValue3668;
        edgeValue3738 = regionValue3669;
        edgeValue3739 = regionValue3670;
        edgeValue3740 = regionValue3671;
        edgeValue3741 = regionValue3672;
        regionValue3712 = edgeValue3735;
        regionValue3713 = edgeValue3736;
        regionValue3714 = edgeValue3737;
        regionValue3715 = edgeValue3738;
        regionValue3716 = edgeValue3739;
        regionValue3717 = edgeValue3740;
        regionValue3718 = edgeValue3741;
        break region299;
        }
        if (regionValue3718 <= 0) {
            edgeValue3758 = regionValue3712;
            edgeValue3759 = regionValue3713;
            edgeValue3760 = regionValue3714;
            edgeValue3761 = regionValue3715;
            edgeValue3762 = regionValue3716;
            regionValue1356 = edgeValue3758;
            regionValue1357 = edgeValue3759;
            regionValue1358 = edgeValue3760;
            regionValue1359 = edgeValue3761;
            regionValue1360 = edgeValue3762;
            break region322;
        } else {
            edgeValue3801 = regionValue3712;
            edgeValue3802 = regionValue3713;
            edgeValue3803 = regionValue3714;
            edgeValue3804 = regionValue3715;
            edgeValue3805 = regionValue3716;
            edgeValue3806 = regionValue3717;
            regionValue3779 = edgeValue3801;
            regionValue3780 = edgeValue3802;
            regionValue3781 = edgeValue3803;
            regionValue3782 = edgeValue3804;
            regionValue3783 = edgeValue3805;
            regionValue3784 = edgeValue3806;
            break region300;
        }
        }
        edgeValue3845 = regionValue3779;
        edgeValue3846 = regionValue3780;
        edgeValue3847 = regionValue3781;
        edgeValue3848 = regionValue3782;
        edgeValue3849 = regionValue3783;
        edgeValue3850 = regionValue3784;
        regionValue3823 = edgeValue3845;
        regionValue3824 = edgeValue3846;
        regionValue3825 = edgeValue3847;
        regionValue3826 = edgeValue3848;
        regionValue3827 = edgeValue3849;
        regionValue3828 = edgeValue3850;
        break region302;
        }
        comparison3851 = (java.lang.Double.isNaN(regionValue3828) || java.lang.Double.isNaN(regionValue3824) ? -1 : (regionValue3828 > regionValue3824 ? 1 : regionValue3828 == regionValue3824 ? 0 : -1));
        comparison3852 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison3852 < 0) {
            edgeValue3892 = regionValue3823;
            edgeValue3893 = regionValue3824;
            edgeValue3894 = regionValue3825;
            edgeValue3895 = regionValue3826;
            edgeValue3896 = regionValue3827;
            edgeValue3897 = comparison3851;
            regionValue3869 = edgeValue3892;
            regionValue3870 = edgeValue3893;
            regionValue3871 = edgeValue3894;
            regionValue3872 = edgeValue3895;
            regionValue3873 = edgeValue3896;
            regionValue3874 = edgeValue3897;
            break region328;
        } else {
            edgeValue3939 = regionValue3823;
            edgeValue3940 = regionValue3824;
            edgeValue3941 = regionValue3825;
            edgeValue3942 = regionValue3826;
            edgeValue3943 = regionValue3827;
            edgeValue3944 = regionValue3828;
            edgeValue3945 = comparison3851;
            regionValue3915 = edgeValue3939;
            regionValue3916 = edgeValue3940;
            regionValue3917 = edgeValue3941;
            regionValue3918 = edgeValue3942;
            regionValue3919 = edgeValue3943;
            regionValue3920 = edgeValue3944;
            regionValue3921 = edgeValue3945;
            break region310;
        }
        }
        edgeValue3987 = regionValue3915;
        edgeValue3988 = regionValue3916;
        edgeValue3989 = regionValue3917;
        edgeValue3990 = regionValue3918;
        edgeValue3991 = regionValue3919;
        edgeValue3992 = regionValue3920;
        edgeValue3993 = regionValue3921;
        regionValue3963 = edgeValue3987;
        regionValue3964 = edgeValue3988;
        regionValue3965 = edgeValue3989;
        regionValue3966 = edgeValue3990;
        regionValue3967 = edgeValue3991;
        regionValue3968 = edgeValue3992;
        regionValue3969 = edgeValue3993;
        break region312;
        }
        if (value47 != 0) {
            edgeValue4011 = regionValue3963;
            edgeValue4012 = regionValue3964;
            edgeValue4013 = regionValue3965;
            edgeValue4014 = regionValue3966;
            edgeValue4015 = regionValue3967;
            edgeValue4016 = regionValue3969;
            regionValue1577 = edgeValue4011;
            regionValue1578 = edgeValue4012;
            regionValue1579 = edgeValue4013;
            regionValue1580 = edgeValue4014;
            regionValue1581 = edgeValue4015;
            regionValue1582 = edgeValue4016;
            break region327;
        } else {
            edgeValue4056 = regionValue3963;
            edgeValue4057 = regionValue3964;
            edgeValue4058 = regionValue3965;
            edgeValue4059 = regionValue3966;
            edgeValue4060 = regionValue3967;
            edgeValue4061 = regionValue3968;
            edgeValue4062 = regionValue3969;
            regionValue4033 = edgeValue4056;
            regionValue4034 = edgeValue4057;
            regionValue4035 = edgeValue4058;
            regionValue4036 = edgeValue4059;
            regionValue4037 = edgeValue4060;
            regionValue4038 = edgeValue4061;
            regionValue4039 = edgeValue4062;
            break region313;
        }
        }
        edgeValue4102 = regionValue4033;
        edgeValue4103 = regionValue4034;
        edgeValue4104 = regionValue4035;
        edgeValue4105 = regionValue4036;
        edgeValue4106 = regionValue4037;
        edgeValue4107 = regionValue4038;
        edgeValue4108 = regionValue4039;
        regionValue4079 = edgeValue4102;
        regionValue4080 = edgeValue4103;
        regionValue4081 = edgeValue4104;
        regionValue4082 = edgeValue4105;
        regionValue4083 = edgeValue4106;
        regionValue4084 = edgeValue4107;
        regionValue4085 = edgeValue4108;
        break region315;
        }
        if (regionValue4085 <= 0) {
            edgeValue4125 = regionValue4079;
            edgeValue4126 = regionValue4080;
            edgeValue4127 = regionValue4081;
            edgeValue4128 = regionValue4082;
            edgeValue4129 = regionValue4083;
            regionValue1356 = edgeValue4125;
            regionValue1357 = edgeValue4126;
            regionValue1358 = edgeValue4127;
            regionValue1359 = edgeValue4128;
            regionValue1360 = edgeValue4129;
            break region322;
        } else {
            edgeValue4166 = regionValue4081;
            edgeValue4167 = regionValue4082;
            edgeValue4168 = regionValue4083;
            edgeValue4169 = regionValue4084;
            regionValue4146 = edgeValue4166;
            regionValue4147 = edgeValue4167;
            regionValue4148 = edgeValue4168;
            regionValue4149 = edgeValue4169;
            break region316;
        }
        }
        computed4170 = regionValue4147 - 36;
        value4171 = computed4170;
        value4172 = regionValue4149;
        edgeValue4189 = value4171;
        edgeValue4190 = value4172;
        edgeValue4191 = regionValue4146;
        edgeValue4192 = regionValue4147;
        edgeValue4193 = regionValue4148;
        regionValue1356 = edgeValue4189;
        regionValue1357 = edgeValue4190;
        regionValue1358 = edgeValue4191;
        regionValue1359 = edgeValue4192;
        regionValue1360 = edgeValue4193;
        break region322;
        }
        value4194 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingSword));
        value4195 = recovery$indy$flow$129(value4194, -3628393978617010352L, a0);
        edgeValue4212 = regionValue1356;
        edgeValue4213 = regionValue1357;
        edgeValue4214 = regionValue1358;
        edgeValue4215 = regionValue1359;
        edgeValue4216 = regionValue1360;
        edgeValue4217 = (int) ((value4195 ? 1 : 0));
        regionValue1577 = edgeValue4212;
        regionValue1578 = edgeValue4213;
        regionValue1579 = edgeValue4214;
        regionValue1580 = edgeValue4215;
        regionValue1581 = edgeValue4216;
        regionValue1582 = edgeValue4217;
        break region327;
        }
        edgeValue4234 = regionValue1577;
        edgeValue4235 = regionValue1578;
        edgeValue4236 = regionValue1579;
        edgeValue4237 = regionValue1580;
        edgeValue4238 = regionValue1581;
        edgeValue4239 = regionValue1582;
        regionValue3869 = edgeValue4234;
        regionValue3870 = edgeValue4235;
        regionValue3871 = edgeValue4236;
        regionValue3872 = edgeValue4237;
        regionValue3873 = edgeValue4238;
        regionValue3874 = edgeValue4239;
        break region328;
        }
        comparison4241 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison4241 <= 0) {
            edgeValue4281 = regionValue3869;
            edgeValue4282 = regionValue3870;
            edgeValue4283 = regionValue3871;
            edgeValue4284 = regionValue3872;
            edgeValue4285 = regionValue3873;
            edgeValue4286 = regionValue3874;
            regionValue4258 = edgeValue4281;
            regionValue4259 = edgeValue4282;
            regionValue4260 = edgeValue4283;
            regionValue4261 = edgeValue4284;
            regionValue4262 = edgeValue4285;
            regionValue4263 = edgeValue4286;
            break region345;
        } else {
            edgeValue4327 = regionValue3869;
            edgeValue4328 = regionValue3870;
            edgeValue4329 = regionValue3871;
            edgeValue4330 = regionValue3872;
            edgeValue4331 = regionValue3873;
            edgeValue4332 = regionValue3874;
            regionValue4304 = edgeValue4327;
            regionValue4305 = edgeValue4328;
            regionValue4306 = edgeValue4329;
            regionValue4307 = edgeValue4330;
            regionValue4308 = edgeValue4331;
            regionValue4309 = edgeValue4332;
            break region332;
        }
        }
        if (value47 != 0) {
            edgeValue4372 = regionValue4304;
            edgeValue4373 = regionValue4305;
            edgeValue4374 = regionValue4306;
            edgeValue4375 = regionValue4307;
            edgeValue4376 = regionValue4308;
            edgeValue4377 = regionValue4309;
            regionValue4350 = edgeValue4372;
            regionValue4351 = edgeValue4373;
            regionValue4352 = edgeValue4374;
            regionValue4353 = edgeValue4375;
            regionValue4354 = edgeValue4376;
            regionValue4355 = edgeValue4377;
            break region344;
        } else {
            edgeValue4416 = regionValue4304;
            edgeValue4417 = regionValue4305;
            edgeValue4418 = regionValue4306;
            edgeValue4419 = regionValue4307;
            edgeValue4420 = regionValue4308;
            edgeValue4421 = regionValue4309;
            regionValue4394 = edgeValue4416;
            regionValue4395 = edgeValue4417;
            regionValue4396 = edgeValue4418;
            regionValue4397 = edgeValue4419;
            regionValue4398 = edgeValue4420;
            regionValue4399 = edgeValue4421;
            break region333;
        }
        }
        edgeValue4460 = regionValue4394;
        edgeValue4461 = regionValue4395;
        edgeValue4462 = regionValue4396;
        edgeValue4463 = regionValue4397;
        edgeValue4464 = regionValue4398;
        edgeValue4465 = regionValue4399;
        regionValue4438 = edgeValue4460;
        regionValue4439 = edgeValue4461;
        regionValue4440 = edgeValue4462;
        regionValue4441 = edgeValue4463;
        regionValue4442 = edgeValue4464;
        regionValue4443 = edgeValue4465;
        break region335;
        }
        if (regionValue4443 == 0) {
            edgeValue4482 = regionValue4438;
            edgeValue4483 = regionValue4439;
            edgeValue4484 = regionValue4440;
            edgeValue4485 = regionValue4441;
            regionValue1198 = edgeValue4482;
            regionValue1199 = edgeValue4483;
            regionValue1200 = edgeValue4484;
            regionValue1201 = edgeValue4485;
            break region433;
        } else {
            edgeValue4523 = regionValue4438;
            edgeValue4524 = regionValue4439;
            edgeValue4525 = regionValue4440;
            edgeValue4526 = regionValue4441;
            edgeValue4527 = regionValue4442;
            regionValue4502 = edgeValue4523;
            regionValue4503 = edgeValue4524;
            regionValue4504 = edgeValue4525;
            regionValue4505 = edgeValue4526;
            regionValue4506 = edgeValue4527;
            break region336;
        }
        }
        value4528 = recovery$indy$flow$130();
        value4529 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value4528)))).field_48Q));
        value4530 = recovery$indy$flow$132(value4529, computed8, -3626881611095097051L, a0);
        edgeValue4547 = regionValue4502;
        edgeValue4548 = regionValue4503;
        edgeValue4549 = regionValue4504;
        edgeValue4550 = regionValue4505;
        edgeValue4551 = regionValue4506;
        edgeValue4552 = (int) ((value4530 ? 1 : 0));
        regionValue4350 = edgeValue4547;
        regionValue4351 = edgeValue4548;
        regionValue4352 = edgeValue4549;
        regionValue4353 = edgeValue4550;
        regionValue4354 = edgeValue4551;
        regionValue4355 = edgeValue4552;
        break region344;
        }
        edgeValue4569 = regionValue4350;
        edgeValue4570 = regionValue4351;
        edgeValue4571 = regionValue4352;
        edgeValue4572 = regionValue4353;
        edgeValue4573 = regionValue4354;
        edgeValue4574 = regionValue4355;
        regionValue4258 = edgeValue4569;
        regionValue4259 = edgeValue4570;
        regionValue4260 = edgeValue4571;
        regionValue4261 = edgeValue4572;
        regionValue4262 = edgeValue4573;
        regionValue4263 = edgeValue4574;
        break region345;
        }
        if (value47 != 0) {
            edgeValue4614 = regionValue4258;
            edgeValue4615 = regionValue4259;
            edgeValue4616 = regionValue4260;
            edgeValue4617 = regionValue4261;
            edgeValue4618 = regionValue4262;
            edgeValue4619 = regionValue4263;
            regionValue4592 = edgeValue4614;
            regionValue4593 = edgeValue4615;
            regionValue4594 = edgeValue4616;
            regionValue4595 = edgeValue4617;
            regionValue4596 = edgeValue4618;
            regionValue4597 = edgeValue4619;
            break region362;
        } else {
            edgeValue4658 = regionValue4258;
            edgeValue4659 = regionValue4259;
            edgeValue4660 = regionValue4260;
            edgeValue4661 = regionValue4261;
            edgeValue4662 = regionValue4262;
            edgeValue4663 = regionValue4263;
            regionValue4636 = edgeValue4658;
            regionValue4637 = edgeValue4659;
            regionValue4638 = edgeValue4660;
            regionValue4639 = edgeValue4661;
            regionValue4640 = edgeValue4662;
            regionValue4641 = edgeValue4663;
            break region346;
        }
        }
        if (regionValue4641 == 0) {
            edgeValue4680 = regionValue4636;
            edgeValue4681 = regionValue4637;
            edgeValue4682 = regionValue4638;
            edgeValue4683 = regionValue4639;
            regionValue1198 = edgeValue4680;
            regionValue1199 = edgeValue4681;
            regionValue1200 = edgeValue4682;
            regionValue1201 = edgeValue4683;
            break region433;
        } else {
            edgeValue4721 = regionValue4636;
            edgeValue4722 = regionValue4637;
            edgeValue4723 = regionValue4638;
            edgeValue4724 = regionValue4639;
            edgeValue4725 = regionValue4640;
            regionValue4700 = edgeValue4721;
            regionValue4701 = edgeValue4722;
            regionValue4702 = edgeValue4723;
            regionValue4703 = edgeValue4724;
            regionValue4704 = edgeValue4725;
            break region347;
        }
        }
        value4726 = recovery$indy$flow$133();
        value4727 = recovery$indy$flow$134();
        value4728 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value4727)))).field_48Q));
        converted4729 = (char) (converted28);
        converted4730 = (char) (converted36);
        value4731 = recovery$indy$flow$136(value4726, converted4729, converted32, value4728, converted4730, -3628466459438219096L, a0);
        edgeValue4748 = regionValue4700;
        edgeValue4749 = regionValue4701;
        edgeValue4750 = regionValue4702;
        edgeValue4751 = regionValue4703;
        edgeValue4752 = regionValue4704;
        edgeValue4753 = (int) ((value4731 ? 1 : 0));
        regionValue4592 = edgeValue4748;
        regionValue4593 = edgeValue4749;
        regionValue4594 = edgeValue4750;
        regionValue4595 = edgeValue4751;
        regionValue4596 = edgeValue4752;
        regionValue4597 = edgeValue4753;
        break region362;
        }
        if (regionValue4597 == 0) {
            edgeValue4770 = regionValue4592;
            edgeValue4771 = regionValue4593;
            edgeValue4772 = regionValue4594;
            edgeValue4773 = regionValue4595;
            regionValue1198 = edgeValue4770;
            regionValue1199 = edgeValue4771;
            regionValue1200 = edgeValue4772;
            regionValue1201 = edgeValue4773;
            break region433;
        } else {
            edgeValue4811 = regionValue4592;
            edgeValue4812 = regionValue4593;
            edgeValue4813 = regionValue4594;
            edgeValue4814 = regionValue4595;
            edgeValue4815 = regionValue4596;
            regionValue4790 = edgeValue4811;
            regionValue4791 = edgeValue4812;
            regionValue4792 = edgeValue4813;
            regionValue4793 = edgeValue4814;
            regionValue4794 = edgeValue4815;
            break region363;
        }
        }
        value4816 = recovery$indy$flow$137();
        value4817 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value4816)))).field_48Q));
        value4818 = ((java.lang.Object)(((augustus.recovered.modules.combat.KillAura_47CY) (((java.lang.Object)(value4817)))).field_45z));
        if (value4818 == null) {
            edgeValue4835 = regionValue4790;
            edgeValue4836 = regionValue4791;
            edgeValue4837 = regionValue4792;
            edgeValue4838 = regionValue4793;
            regionValue1198 = edgeValue4835;
            regionValue1199 = edgeValue4836;
            regionValue1200 = edgeValue4837;
            regionValue1201 = edgeValue4838;
            break region433;
        } else {
            edgeValue4876 = regionValue4790;
            edgeValue4877 = regionValue4791;
            edgeValue4878 = regionValue4792;
            edgeValue4879 = regionValue4793;
            edgeValue4880 = regionValue4794;
            regionValue4855 = edgeValue4876;
            regionValue4856 = edgeValue4877;
            regionValue4857 = edgeValue4878;
            regionValue4858 = edgeValue4879;
            regionValue4859 = edgeValue4880;
            break region367;
        }
        }
        edgeValue4918 = regionValue4855;
        edgeValue4919 = regionValue4856;
        edgeValue4920 = regionValue4857;
        edgeValue4921 = regionValue4858;
        edgeValue4922 = regionValue4859;
        regionValue4897 = edgeValue4918;
        regionValue4898 = edgeValue4919;
        regionValue4899 = edgeValue4920;
        regionValue4900 = edgeValue4921;
        regionValue4901 = edgeValue4922;
        break region369;
        }
        value4923 = recovery$indy$flow$140(this, computed24, regionValue4901, -3628665704559860256L, a0);
        value4924 = value4923;
        value4925 = recovery$indy$flow$141(this, computed24, regionValue4899, -3628665704559860256L, a0);
        value4926 = value4925;
        comparison4927 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison4927 <= 0) {
            edgeValue4965 = regionValue4897;
            edgeValue4966 = regionValue4898;
            edgeValue4967 = regionValue4899;
            edgeValue4968 = regionValue4900;
            regionValue4944 = edgeValue4965;
            regionValue4945 = edgeValue4966;
            regionValue4946 = edgeValue4967;
            regionValue4947 = edgeValue4968;
            break region435;
        } else {
            edgeValue5009 = regionValue4897;
            edgeValue5010 = regionValue4898;
            edgeValue5011 = regionValue4899;
            edgeValue5012 = regionValue4900;
            edgeValue5013 = value4924;
            edgeValue5014 = value4926;
            regionValue4986 = edgeValue5009;
            regionValue4987 = edgeValue5010;
            regionValue4988 = edgeValue5011;
            regionValue4989 = edgeValue5012;
            regionValue4990 = edgeValue5013;
            regionValue4991 = edgeValue5014;
            break region388;
        }
        }
        if (value47 != 0) {
            edgeValue5052 = regionValue4986;
            edgeValue5053 = regionValue4987;
            edgeValue5054 = regionValue4988;
            edgeValue5055 = regionValue4989;
            regionValue5032 = edgeValue5052;
            regionValue5033 = edgeValue5053;
            regionValue5034 = edgeValue5054;
            regionValue5035 = edgeValue5055;
            break region434;
        } else {
            edgeValue5094 = regionValue4986;
            edgeValue5095 = regionValue4987;
            edgeValue5096 = regionValue4988;
            edgeValue5097 = regionValue4989;
            edgeValue5098 = regionValue4990;
            edgeValue5099 = regionValue4991;
            regionValue5072 = edgeValue5094;
            regionValue5073 = edgeValue5095;
            regionValue5074 = edgeValue5096;
            regionValue5075 = edgeValue5097;
            regionValue5076 = edgeValue5098;
            regionValue5077 = edgeValue5099;
            break region389;
        }
        }
        edgeValue5138 = regionValue5072;
        edgeValue5139 = regionValue5073;
        edgeValue5140 = regionValue5074;
        edgeValue5141 = regionValue5075;
        edgeValue5142 = regionValue5076;
        edgeValue5143 = regionValue5077;
        regionValue5116 = edgeValue5138;
        regionValue5117 = edgeValue5139;
        regionValue5118 = edgeValue5140;
        regionValue5119 = edgeValue5141;
        regionValue5120 = edgeValue5142;
        regionValue5121 = edgeValue5143;
        break region391;
        }
        comparison5144 = (java.lang.Double.isNaN(regionValue5120) || java.lang.Double.isNaN(1.0D) ? -1 : (regionValue5120 > 1.0D ? 1 : regionValue5120 == 1.0D ? 0 : -1));
        comparison5145 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison5145 <= 0) {
            edgeValue5184 = regionValue5116;
            edgeValue5185 = regionValue5117;
            edgeValue5186 = regionValue5118;
            edgeValue5187 = regionValue5119;
            edgeValue5188 = regionValue5120;
            edgeValue5189 = comparison5144;
            regionValue5162 = edgeValue5184;
            regionValue5163 = edgeValue5185;
            regionValue5164 = edgeValue5186;
            regionValue5165 = edgeValue5187;
            regionValue5166 = edgeValue5188;
            regionValue5167 = edgeValue5189;
            break region408;
        } else {
            edgeValue5229 = regionValue5116;
            edgeValue5230 = regionValue5117;
            edgeValue5231 = regionValue5118;
            edgeValue5232 = regionValue5119;
            edgeValue5233 = regionValue5120;
            edgeValue5234 = regionValue5121;
            edgeValue5235 = comparison5144;
            regionValue5206 = edgeValue5229;
            regionValue5207 = edgeValue5230;
            regionValue5208 = edgeValue5231;
            regionValue5209 = edgeValue5232;
            regionValue5210 = edgeValue5233;
            regionValue5211 = edgeValue5234;
            regionValue5212 = edgeValue5235;
            break region398;
        }
        }
        edgeValue5275 = regionValue5206;
        edgeValue5276 = regionValue5207;
        edgeValue5277 = regionValue5208;
        edgeValue5278 = regionValue5209;
        edgeValue5279 = regionValue5210;
        edgeValue5280 = regionValue5211;
        edgeValue5281 = regionValue5212;
        regionValue5252 = edgeValue5275;
        regionValue5253 = edgeValue5276;
        regionValue5254 = edgeValue5277;
        regionValue5255 = edgeValue5278;
        regionValue5256 = edgeValue5279;
        regionValue5257 = edgeValue5280;
        regionValue5258 = edgeValue5281;
        break region400;
        }
        if (regionValue5258 <= 0) {
            edgeValue5298 = regionValue5252;
            edgeValue5299 = regionValue5253;
            edgeValue5300 = regionValue5254;
            edgeValue5301 = regionValue5255;
            regionValue1198 = edgeValue5298;
            regionValue1199 = edgeValue5299;
            regionValue1200 = edgeValue5300;
            regionValue1201 = edgeValue5301;
            break region433;
        } else {
            edgeValue5340 = regionValue5252;
            edgeValue5341 = regionValue5253;
            edgeValue5342 = regionValue5254;
            edgeValue5343 = regionValue5255;
            edgeValue5344 = regionValue5256;
            edgeValue5345 = regionValue5257;
            regionValue5318 = edgeValue5340;
            regionValue5319 = edgeValue5341;
            regionValue5320 = edgeValue5342;
            regionValue5321 = edgeValue5343;
            regionValue5322 = edgeValue5344;
            regionValue5323 = edgeValue5345;
            break region401;
        }
        }
        edgeValue5384 = regionValue5318;
        edgeValue5385 = regionValue5319;
        edgeValue5386 = regionValue5320;
        edgeValue5387 = regionValue5321;
        edgeValue5388 = regionValue5322;
        edgeValue5389 = regionValue5323;
        regionValue5362 = edgeValue5384;
        regionValue5363 = edgeValue5385;
        regionValue5364 = edgeValue5386;
        regionValue5365 = edgeValue5387;
        regionValue5366 = edgeValue5388;
        regionValue5367 = edgeValue5389;
        break region403;
        }
        comparison5390 = (java.lang.Double.isNaN(regionValue5366) || java.lang.Double.isNaN(regionValue5367) ? -1 : (regionValue5366 > regionValue5367 ? 1 : regionValue5366 == regionValue5367 ? 0 : -1));
        edgeValue5407 = regionValue5362;
        edgeValue5408 = regionValue5363;
        edgeValue5409 = regionValue5364;
        edgeValue5410 = regionValue5365;
        edgeValue5411 = regionValue5366;
        edgeValue5412 = comparison5390;
        regionValue5162 = edgeValue5407;
        regionValue5163 = edgeValue5408;
        regionValue5164 = edgeValue5409;
        regionValue5165 = edgeValue5410;
        regionValue5166 = edgeValue5411;
        regionValue5167 = edgeValue5412;
        break region408;
        }
        comparison5413 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison5413 < 0) {
            edgeValue5453 = regionValue5162;
            edgeValue5454 = regionValue5163;
            edgeValue5455 = regionValue5164;
            edgeValue5456 = regionValue5165;
            edgeValue5457 = regionValue5166;
            edgeValue5458 = regionValue5167;
            regionValue5430 = edgeValue5453;
            regionValue5431 = edgeValue5454;
            regionValue5432 = edgeValue5455;
            regionValue5433 = edgeValue5456;
            regionValue5434 = edgeValue5457;
            regionValue5435 = edgeValue5458;
            break region423;
        } else {
            edgeValue5499 = regionValue5162;
            edgeValue5500 = regionValue5163;
            edgeValue5501 = regionValue5164;
            edgeValue5502 = regionValue5165;
            edgeValue5503 = regionValue5166;
            edgeValue5504 = regionValue5167;
            regionValue5476 = edgeValue5499;
            regionValue5477 = edgeValue5500;
            regionValue5478 = edgeValue5501;
            regionValue5479 = edgeValue5502;
            regionValue5480 = edgeValue5503;
            regionValue5481 = edgeValue5504;
            break region413;
        }
        }
        if (value47 != 0) {
            edgeValue5544 = regionValue5476;
            edgeValue5545 = regionValue5477;
            edgeValue5546 = regionValue5478;
            edgeValue5547 = regionValue5479;
            edgeValue5548 = regionValue5480;
            edgeValue5549 = regionValue5481;
            regionValue5522 = edgeValue5544;
            regionValue5523 = edgeValue5545;
            regionValue5524 = edgeValue5546;
            regionValue5525 = edgeValue5547;
            regionValue5526 = edgeValue5548;
            regionValue5527 = edgeValue5549;
            break region422;
        } else {
            edgeValue5588 = regionValue5476;
            edgeValue5589 = regionValue5477;
            edgeValue5590 = regionValue5478;
            edgeValue5591 = regionValue5479;
            edgeValue5592 = regionValue5480;
            edgeValue5593 = regionValue5481;
            regionValue5566 = edgeValue5588;
            regionValue5567 = edgeValue5589;
            regionValue5568 = edgeValue5590;
            regionValue5569 = edgeValue5591;
            regionValue5570 = edgeValue5592;
            regionValue5571 = edgeValue5593;
            break region414;
        }
        }
        edgeValue5632 = regionValue5566;
        edgeValue5633 = regionValue5567;
        edgeValue5634 = regionValue5568;
        edgeValue5635 = regionValue5569;
        edgeValue5636 = regionValue5570;
        edgeValue5637 = regionValue5571;
        regionValue5610 = edgeValue5632;
        regionValue5611 = edgeValue5633;
        regionValue5612 = edgeValue5634;
        regionValue5613 = edgeValue5635;
        regionValue5614 = edgeValue5636;
        regionValue5615 = edgeValue5637;
        break region416;
        }
        if (regionValue5615 <= 0) {
            edgeValue5654 = regionValue5610;
            edgeValue5655 = regionValue5611;
            edgeValue5656 = regionValue5612;
            edgeValue5657 = regionValue5613;
            regionValue1198 = edgeValue5654;
            regionValue1199 = edgeValue5655;
            regionValue1200 = edgeValue5656;
            regionValue1201 = edgeValue5657;
            break region433;
        } else {
            edgeValue5695 = regionValue5610;
            edgeValue5696 = regionValue5611;
            edgeValue5697 = regionValue5612;
            edgeValue5698 = regionValue5613;
            edgeValue5699 = regionValue5614;
            regionValue5674 = edgeValue5695;
            regionValue5675 = edgeValue5696;
            regionValue5676 = edgeValue5697;
            regionValue5677 = edgeValue5698;
            regionValue5678 = edgeValue5699;
            break region417;
        }
        }
        comparison5700 = (java.lang.Double.isNaN(regionValue5678) || java.lang.Double.isNaN(regionValue5675) ? -1 : (regionValue5678 > regionValue5675 ? 1 : regionValue5678 == regionValue5675 ? 0 : -1));
        edgeValue5717 = regionValue5674;
        edgeValue5718 = regionValue5675;
        edgeValue5719 = regionValue5676;
        edgeValue5720 = regionValue5677;
        edgeValue5721 = regionValue5678;
        edgeValue5722 = comparison5700;
        regionValue5522 = edgeValue5717;
        regionValue5523 = edgeValue5718;
        regionValue5524 = edgeValue5719;
        regionValue5525 = edgeValue5720;
        regionValue5526 = edgeValue5721;
        regionValue5527 = edgeValue5722;
        break region422;
        }
        edgeValue5739 = regionValue5522;
        edgeValue5740 = regionValue5523;
        edgeValue5741 = regionValue5524;
        edgeValue5742 = regionValue5525;
        edgeValue5743 = regionValue5526;
        edgeValue5744 = regionValue5527;
        regionValue5430 = edgeValue5739;
        regionValue5431 = edgeValue5740;
        regionValue5432 = edgeValue5741;
        regionValue5433 = edgeValue5742;
        regionValue5434 = edgeValue5743;
        regionValue5435 = edgeValue5744;
        break region423;
        }
        if (value47 != 0) {
            edgeValue5782 = regionValue5432;
            edgeValue5783 = regionValue5433;
            edgeValue5784 = regionValue5434;
            edgeValue5785 = regionValue5435;
            regionValue5762 = edgeValue5782;
            regionValue5763 = edgeValue5783;
            regionValue5764 = edgeValue5784;
            regionValue5765 = edgeValue5785;
            break region430;
        } else {
            edgeValue5824 = regionValue5430;
            edgeValue5825 = regionValue5431;
            edgeValue5826 = regionValue5432;
            edgeValue5827 = regionValue5433;
            edgeValue5828 = regionValue5434;
            edgeValue5829 = regionValue5435;
            regionValue5802 = edgeValue5824;
            regionValue5803 = edgeValue5825;
            regionValue5804 = edgeValue5826;
            regionValue5805 = edgeValue5827;
            regionValue5806 = edgeValue5828;
            regionValue5807 = edgeValue5829;
            break region424;
        }
        }
        if (regionValue5807 <= 0) {
            edgeValue5846 = regionValue5802;
            edgeValue5847 = regionValue5803;
            edgeValue5848 = regionValue5804;
            edgeValue5849 = regionValue5805;
            regionValue1198 = edgeValue5846;
            regionValue1199 = edgeValue5847;
            regionValue1200 = edgeValue5848;
            regionValue1201 = edgeValue5849;
            break region433;
        } else {
            edgeValue5885 = regionValue5804;
            edgeValue5886 = regionValue5805;
            edgeValue5887 = regionValue5806;
            regionValue5866 = edgeValue5885;
            regionValue5867 = edgeValue5886;
            regionValue5868 = edgeValue5887;
            break region425;
        }
        }
        computed5888 = regionValue5867 - 36;
        edgeValue5905 = regionValue5866;
        edgeValue5906 = regionValue5867;
        edgeValue5907 = regionValue5868;
        edgeValue5908 = computed5888;
        regionValue5762 = edgeValue5905;
        regionValue5763 = edgeValue5906;
        regionValue5764 = edgeValue5907;
        regionValue5765 = edgeValue5908;
        break region430;
        }
        value5909 = regionValue5765;
        value5910 = regionValue5764;
        edgeValue5927 = value5909;
        edgeValue5928 = value5910;
        edgeValue5929 = regionValue5762;
        edgeValue5930 = regionValue5763;
        regionValue1198 = edgeValue5927;
        regionValue1199 = edgeValue5928;
        regionValue1200 = edgeValue5929;
        regionValue1201 = edgeValue5930;
        break region433;
        }
        incremented5931 = regionValue1201 + (1);
        edgeValue5948 = regionValue1198;
        edgeValue5949 = regionValue1199;
        edgeValue5950 = regionValue1200;
        edgeValue5951 = incremented5931;
        regionValue5032 = edgeValue5948;
        regionValue5033 = edgeValue5949;
        regionValue5034 = edgeValue5950;
        regionValue5035 = edgeValue5951;
        break region434;
        }
        edgeValue5968 = regionValue5032;
        edgeValue5969 = regionValue5033;
        edgeValue5970 = regionValue5034;
        edgeValue5971 = regionValue5035;
        regionValue4944 = edgeValue5968;
        regionValue4945 = edgeValue5969;
        regionValue4946 = edgeValue5970;
        regionValue4947 = edgeValue5971;
        break region435;
        }
        if (value47 == 0) {
            edgeValue5989 = regionValue4944;
            edgeValue5990 = regionValue4945;
            edgeValue5991 = regionValue4946;
            edgeValue5992 = regionValue4947;
            regionValue687 = edgeValue5989;
            regionValue688 = edgeValue5990;
            regionValue689 = edgeValue5991;
            regionValue690 = edgeValue5992;
            continue loop136;
        } else {
            edgeValue6004 = regionValue4944;
            edgeValue6005 = regionValue4945;
            edgeValue6006 = regionValue4946;
            regionValue615 = edgeValue6004;
            regionValue616 = edgeValue6005;
            regionValue617 = edgeValue6006;
            break region436;
        }
        }
        }
        comparison6007 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison6007 <= 0) {
            edgeValue6017 = regionValue615;
            regionValue58 = edgeValue6017;
            break region572;
        } else {
            edgeValue6043 = regionValue615;
            edgeValue6044 = regionValue616;
            edgeValue6045 = regionValue617;
            regionValue6029 = edgeValue6043;
            regionValue6030 = edgeValue6044;
            regionValue6031 = edgeValue6045;
            break region440;
        }
        }
        value6046 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingSword));
        value6047 = recovery$indy$flow$143(value6046, -3628393978617010352L, a0);
        edgeValue6059 = regionValue6029;
        edgeValue6060 = regionValue6030;
        edgeValue6061 = regionValue6031;
        edgeValue6062 = (int) ((value6047 ? 1 : 0));
        regionValue505 = edgeValue6059;
        regionValue506 = edgeValue6060;
        regionValue507 = edgeValue6061;
        regionValue508 = edgeValue6062;
        break region447;
        }
        edgeValue6074 = regionValue505;
        edgeValue6075 = regionValue506;
        edgeValue6076 = regionValue507;
        edgeValue6077 = regionValue508;
        regionValue431 = edgeValue6074;
        regionValue432 = edgeValue6075;
        regionValue433 = edgeValue6076;
        regionValue434 = edgeValue6077;
        break region448;
        }
        if (value47 != 0) {
            edgeValue6087 = regionValue431;
            edgeValue6088 = regionValue434;
            regionValue114 = edgeValue6087;
            regionValue115 = edgeValue6088;
            break region577;
        } else {
            edgeValue6115 = regionValue431;
            edgeValue6116 = regionValue432;
            edgeValue6117 = regionValue433;
            edgeValue6118 = regionValue434;
            regionValue6100 = edgeValue6115;
            regionValue6101 = edgeValue6116;
            regionValue6102 = edgeValue6117;
            regionValue6103 = edgeValue6118;
            break region449;
        }
        }
        if (regionValue6103 == 0) {
            edgeValue6128 = regionValue6100;
            regionValue58 = edgeValue6128;
            break region572;
        } else {
            edgeValue6154 = regionValue6100;
            edgeValue6155 = regionValue6101;
            edgeValue6156 = regionValue6102;
            regionValue6140 = edgeValue6154;
            regionValue6141 = edgeValue6155;
            regionValue6142 = edgeValue6156;
            break region450;
        }
        }
        value6157 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(value45)))).field_49));
        value6158 = recovery$indy$flow$145();
        if (((java.lang.Object) value6157) != ((java.lang.Object) value6158)) {
            edgeValue6168 = regionValue6140;
            regionValue58 = edgeValue6168;
            break region572;
        } else {
            edgeValue6192 = regionValue6140;
            edgeValue6193 = regionValue6141;
            edgeValue6194 = regionValue6142;
            regionValue6179 = edgeValue6192;
            regionValue6180 = edgeValue6193;
            regionValue6181 = edgeValue6194;
            break region454;
        }
        }
        edgeValue6218 = regionValue6179;
        edgeValue6219 = regionValue6180;
        edgeValue6220 = regionValue6181;
        regionValue6205 = edgeValue6218;
        regionValue6206 = edgeValue6219;
        regionValue6207 = edgeValue6220;
        break region456;
        }
        value6221 = recovery$indy$flow$146();
        value6222 = recovery$indy$flow$147(value6221, -3626585406982106914L, a0);
        value6223 = ((java.lang.Object)(((net.C_47oo) (((java.lang.Object)(value6222)))).field_44l));
        value6224 = recovery$indy$flow$149(value6223);
        if (value47 != 0) {
            edgeValue6249 = regionValue6205;
            edgeValue6250 = regionValue6206;
            edgeValue6251 = regionValue6207;
            regionValue6235 = edgeValue6249;
            regionValue6236 = edgeValue6250;
            regionValue6237 = edgeValue6251;
            regionValue6238 = value6224;
            break region483;
        } else {
            edgeValue6277 = regionValue6205;
            edgeValue6278 = regionValue6206;
            edgeValue6279 = regionValue6207;
            regionValue6263 = edgeValue6277;
            regionValue6264 = edgeValue6278;
            regionValue6265 = edgeValue6279;
            break region464;
        }
        }
        edgeValue6305 = regionValue6263;
        edgeValue6306 = regionValue6264;
        edgeValue6307 = regionValue6265;
        regionValue6291 = edgeValue6305;
        regionValue6292 = edgeValue6306;
        regionValue6293 = edgeValue6307;
        break region466;
        }
        if (value6224 > 0) {
            edgeValue6332 = regionValue6291;
            edgeValue6333 = regionValue6292;
            edgeValue6334 = regionValue6293;
            regionValue6319 = edgeValue6332;
            regionValue6320 = edgeValue6333;
            regionValue6321 = edgeValue6334;
            break region482;
        } else {
            edgeValue6358 = regionValue6291;
            edgeValue6359 = regionValue6292;
            edgeValue6360 = regionValue6293;
            regionValue6345 = edgeValue6358;
            regionValue6346 = edgeValue6359;
            regionValue6347 = edgeValue6360;
            break region467;
        }
        }
        edgeValue6384 = regionValue6345;
        edgeValue6385 = regionValue6346;
        edgeValue6386 = regionValue6347;
        regionValue6371 = edgeValue6384;
        regionValue6372 = edgeValue6385;
        regionValue6373 = edgeValue6386;
        break region469;
        }
        value6387 = recovery$indy$flow$150();
        value6388 = recovery$indy$flow$151(value6387, -3626585406982106914L, a0);
        value6389 = ((java.lang.Object)(((net.C_47oo) (((java.lang.Object)(value6388)))).field_44l));
        value6390 = recovery$indy$flow$153(value6389);
        if (value47 != 0) {
            edgeValue6399 = regionValue6371;
            edgeValue6400 = (int) ((value6390 ? 1 : 0));
            regionValue114 = edgeValue6399;
            regionValue115 = edgeValue6400;
            break region577;
        } else {
            edgeValue6425 = regionValue6371;
            edgeValue6426 = regionValue6372;
            edgeValue6427 = regionValue6373;
            edgeValue6428 = (int) ((value6390 ? 1 : 0));
            regionValue6411 = edgeValue6425;
            regionValue6412 = edgeValue6426;
            regionValue6413 = edgeValue6427;
            break region477;
        }
        }
        edgeValue6453 = regionValue6411;
        edgeValue6454 = regionValue6412;
        edgeValue6455 = regionValue6413;
        regionValue6439 = edgeValue6453;
        regionValue6440 = edgeValue6454;
        regionValue6441 = edgeValue6455;
        break region479;
        }
        if (edgeValue6428 == 0) {
            edgeValue6466 = regionValue6439;
            regionValue58 = edgeValue6466;
            break region572;
        } else {
            edgeValue6490 = regionValue6439;
            edgeValue6491 = regionValue6440;
            edgeValue6492 = regionValue6441;
            regionValue6477 = edgeValue6490;
            regionValue6478 = edgeValue6491;
            regionValue6479 = edgeValue6492;
            break region480;
        }
        }
        edgeValue6503 = regionValue6477;
        edgeValue6504 = regionValue6478;
        edgeValue6505 = regionValue6479;
        regionValue6319 = edgeValue6503;
        regionValue6320 = edgeValue6504;
        regionValue6321 = edgeValue6505;
        break region482;
        }
        edgeValue6516 = regionValue6319;
        edgeValue6517 = regionValue6320;
        edgeValue6518 = regionValue6321;
        edgeValue6519 = 36;
        regionValue6235 = edgeValue6516;
        regionValue6236 = edgeValue6517;
        regionValue6237 = edgeValue6518;
        regionValue6238 = edgeValue6519;
        break region483;
        }
        value6520 = regionValue6238;
        edgeValue6545 = regionValue6235;
        edgeValue6546 = regionValue6236;
        edgeValue6547 = regionValue6237;
        edgeValue6548 = value6520;
        regionValue6531 = edgeValue6545;
        regionValue6532 = edgeValue6546;
        regionValue6533 = edgeValue6547;
        regionValue6534 = edgeValue6548;
        break region484;
        }
        if (regionValue884 != null) {
            edgeValue6574 = regionValue879;
            edgeValue6575 = regionValue880;
            edgeValue6576 = regionValue881;
            edgeValue6577 = regionValue882;
            edgeValue6578 = regionValue883;
            regionValue6559 = edgeValue6574;
            regionValue6560 = edgeValue6575;
            regionValue6561 = edgeValue6576;
            regionValue6562 = edgeValue6577;
            regionValue6563 = edgeValue6578;
            break region1057;
        } else {
            edgeValue6603 = regionValue879;
            edgeValue6604 = regionValue880;
            edgeValue6605 = regionValue881;
            edgeValue6606 = regionValue882;
            regionValue6589 = edgeValue6603;
            regionValue6590 = edgeValue6604;
            regionValue6591 = edgeValue6605;
            regionValue6592 = edgeValue6606;
            break region1055;
        }
        }
        edgeValue6631 = regionValue6589;
        edgeValue6632 = regionValue6590;
        edgeValue6633 = regionValue6591;
        edgeValue6634 = regionValue6592;
        regionValue6617 = edgeValue6631;
        regionValue6618 = edgeValue6632;
        regionValue6619 = edgeValue6633;
        regionValue6620 = edgeValue6634;
        break region1132;
        }
        value6635 = recovery$indy$flow$164(this, computed24, regionValue6563, -3628665704559860256L, a0);
        value6637 = recovery$indy$flow$165(this, computed24, regionValue6561, -3628665704559860256L, a0);
        comparison6639 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison6639 < 0) {
            edgeValue6665 = regionValue6559;
            edgeValue6666 = regionValue6560;
            edgeValue6667 = regionValue6561;
            edgeValue6668 = regionValue6562;
            regionValue6650 = edgeValue6665;
            regionValue6651 = edgeValue6666;
            regionValue6652 = edgeValue6667;
            regionValue6653 = edgeValue6668;
            break region1136;
        } else {
            edgeValue6697 = regionValue6559;
            edgeValue6698 = regionValue6560;
            edgeValue6699 = regionValue6561;
            edgeValue6700 = regionValue6562;
            regionValue6680 = edgeValue6697;
            regionValue6681 = edgeValue6698;
            regionValue6682 = edgeValue6699;
            regionValue6683 = edgeValue6700;
            break region1077;
        }
        }
        if (value47 != 0) {
            edgeValue6728 = regionValue6680;
            edgeValue6729 = regionValue6681;
            edgeValue6730 = regionValue6682;
            edgeValue6731 = regionValue6683;
            regionValue6714 = edgeValue6728;
            regionValue6715 = edgeValue6729;
            regionValue6716 = edgeValue6730;
            regionValue6717 = edgeValue6731;
            break region1134;
        } else {
            edgeValue6758 = regionValue6680;
            edgeValue6759 = regionValue6681;
            edgeValue6760 = regionValue6682;
            edgeValue6761 = regionValue6683;
            regionValue6742 = edgeValue6758;
            regionValue6743 = edgeValue6759;
            regionValue6744 = edgeValue6760;
            regionValue6745 = edgeValue6761;
            break region1079;
        }
        }
        edgeValue6790 = regionValue6742;
        edgeValue6791 = regionValue6743;
        edgeValue6792 = regionValue6744;
        edgeValue6793 = regionValue6745;
        regionValue6774 = edgeValue6790;
        regionValue6775 = edgeValue6791;
        regionValue6776 = edgeValue6792;
        regionValue6777 = edgeValue6793;
        break region1081;
        }
        comparison6796 = (java.lang.Double.isNaN(value6635) || java.lang.Double.isNaN(1.0D) ? -1 : (value6635 > 1.0D ? 1 : value6635 == 1.0D ? 0 : -1));
        comparison6797 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison6797 <= 0) {
            edgeValue6824 = regionValue6774;
            edgeValue6825 = regionValue6775;
            edgeValue6826 = regionValue6776;
            edgeValue6827 = regionValue6777;
            regionValue6808 = edgeValue6824;
            regionValue6809 = edgeValue6825;
            regionValue6810 = edgeValue6826;
            regionValue6811 = edgeValue6827;
            regionValue6813 = comparison6796;
            break region1100;
        } else {
            edgeValue6857 = regionValue6774;
            edgeValue6858 = regionValue6775;
            edgeValue6859 = regionValue6776;
            edgeValue6860 = regionValue6777;
            regionValue6840 = edgeValue6857;
            regionValue6841 = edgeValue6858;
            regionValue6842 = edgeValue6859;
            regionValue6843 = edgeValue6860;
            break region1089;
        }
        }
        edgeValue6891 = regionValue6840;
        edgeValue6892 = regionValue6841;
        edgeValue6893 = regionValue6842;
        edgeValue6894 = regionValue6843;
        regionValue6874 = edgeValue6891;
        regionValue6875 = edgeValue6892;
        regionValue6876 = edgeValue6893;
        regionValue6877 = edgeValue6894;
        break region1091;
        }
        if (comparison6796 <= 0) {
            edgeValue6908 = regionValue6874;
            edgeValue6909 = regionValue6875;
            edgeValue6910 = regionValue6876;
            edgeValue6911 = regionValue6877;
            regionValue6617 = edgeValue6908;
            regionValue6618 = edgeValue6909;
            regionValue6619 = edgeValue6910;
            regionValue6620 = edgeValue6911;
            break region1132;
        } else {
            edgeValue6938 = regionValue6874;
            edgeValue6939 = regionValue6875;
            edgeValue6940 = regionValue6876;
            edgeValue6941 = regionValue6877;
            regionValue6922 = edgeValue6938;
            regionValue6923 = edgeValue6939;
            regionValue6924 = edgeValue6940;
            regionValue6925 = edgeValue6941;
            break region1093;
        }
        }
        edgeValue6970 = regionValue6922;
        edgeValue6971 = regionValue6923;
        edgeValue6972 = regionValue6924;
        edgeValue6973 = regionValue6925;
        regionValue6954 = edgeValue6970;
        regionValue6955 = edgeValue6971;
        regionValue6956 = edgeValue6972;
        regionValue6957 = edgeValue6973;
        break region1095;
        }
        comparison6976 = (java.lang.Double.isNaN(value6635) || java.lang.Double.isNaN(value6637) ? -1 : (value6635 > value6637 ? 1 : value6635 == value6637 ? 0 : -1));
        edgeValue6987 = regionValue6954;
        edgeValue6988 = regionValue6955;
        edgeValue6989 = regionValue6956;
        edgeValue6990 = regionValue6957;
        regionValue6808 = edgeValue6987;
        regionValue6809 = edgeValue6988;
        regionValue6810 = edgeValue6989;
        regionValue6811 = edgeValue6990;
        regionValue6813 = comparison6976;
        break region1100;
        }
        comparison6993 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison6993 < 0) {
            edgeValue7021 = regionValue6808;
            edgeValue7022 = regionValue6809;
            edgeValue7023 = regionValue6810;
            edgeValue7024 = regionValue6811;
            edgeValue7026 = regionValue6813;
            regionValue7004 = edgeValue7021;
            regionValue7005 = edgeValue7022;
            regionValue7006 = edgeValue7023;
            regionValue7007 = edgeValue7024;
            regionValue7009 = edgeValue7026;
            break region1119;
        } else {
            edgeValue7055 = regionValue6808;
            edgeValue7056 = regionValue6809;
            edgeValue7057 = regionValue6810;
            edgeValue7058 = regionValue6811;
            edgeValue7060 = regionValue6813;
            regionValue7038 = edgeValue7055;
            regionValue7039 = edgeValue7056;
            regionValue7040 = edgeValue7057;
            regionValue7041 = edgeValue7058;
            regionValue7043 = edgeValue7060;
            break region1106;
        }
        }
        if (value47 != 0) {
            edgeValue7088 = regionValue7038;
            edgeValue7089 = regionValue7039;
            edgeValue7090 = regionValue7040;
            edgeValue7091 = regionValue7041;
            edgeValue7093 = regionValue7043;
            regionValue7072 = edgeValue7088;
            regionValue7073 = edgeValue7089;
            regionValue7074 = edgeValue7090;
            regionValue7075 = edgeValue7091;
            regionValue7077 = edgeValue7093;
            break region1117;
        } else {
            edgeValue7120 = regionValue7038;
            edgeValue7121 = regionValue7039;
            edgeValue7122 = regionValue7040;
            edgeValue7123 = regionValue7041;
            edgeValue7125 = regionValue7043;
            regionValue7104 = edgeValue7120;
            regionValue7105 = edgeValue7121;
            regionValue7106 = edgeValue7122;
            regionValue7107 = edgeValue7123;
            regionValue7109 = edgeValue7125;
            break region1108;
        }
        }
        edgeValue7152 = regionValue7104;
        edgeValue7153 = regionValue7105;
        edgeValue7154 = regionValue7106;
        edgeValue7155 = regionValue7107;
        edgeValue7157 = regionValue7109;
        regionValue7136 = edgeValue7152;
        regionValue7137 = edgeValue7153;
        regionValue7138 = edgeValue7154;
        regionValue7139 = edgeValue7155;
        regionValue7141 = edgeValue7157;
        break region1110;
        }
        if (regionValue7141 <= 0) {
            edgeValue7168 = regionValue7136;
            edgeValue7169 = regionValue7137;
            edgeValue7170 = regionValue7138;
            edgeValue7171 = regionValue7139;
            regionValue6617 = edgeValue7168;
            regionValue6618 = edgeValue7169;
            regionValue6619 = edgeValue7170;
            regionValue6620 = edgeValue7171;
            break region1132;
        } else {
            edgeValue7197 = regionValue7136;
            edgeValue7198 = regionValue7137;
            edgeValue7199 = regionValue7138;
            edgeValue7200 = regionValue7139;
            regionValue7182 = edgeValue7197;
            regionValue7183 = edgeValue7198;
            regionValue7184 = edgeValue7199;
            regionValue7185 = edgeValue7200;
            break region1112;
        }
        }
        comparison7202 = (java.lang.Double.isNaN(value6635) || java.lang.Double.isNaN(regionValue7183) ? -1 : (value6635 > regionValue7183 ? 1 : value6635 == regionValue7183 ? 0 : -1));
        edgeValue7213 = regionValue7182;
        edgeValue7214 = regionValue7183;
        edgeValue7215 = regionValue7184;
        edgeValue7216 = regionValue7185;
        regionValue7072 = edgeValue7213;
        regionValue7073 = edgeValue7214;
        regionValue7074 = edgeValue7215;
        regionValue7075 = edgeValue7216;
        regionValue7077 = comparison7202;
        break region1117;
        }
        edgeValue7229 = regionValue7072;
        edgeValue7230 = regionValue7073;
        edgeValue7231 = regionValue7074;
        edgeValue7232 = regionValue7075;
        edgeValue7234 = regionValue7077;
        regionValue7004 = edgeValue7229;
        regionValue7005 = edgeValue7230;
        regionValue7006 = edgeValue7231;
        regionValue7007 = edgeValue7232;
        regionValue7009 = edgeValue7234;
        break region1119;
        }
        if (value47 != 0) {
            edgeValue7260 = regionValue7006;
            edgeValue7261 = regionValue7007;
            edgeValue7263 = regionValue7009;
            regionValue7246 = edgeValue7260;
            regionValue7247 = edgeValue7261;
            regionValue7249 = edgeValue7263;
            break region1128;
        } else {
            edgeValue7290 = regionValue7004;
            edgeValue7291 = regionValue7005;
            edgeValue7292 = regionValue7006;
            edgeValue7293 = regionValue7007;
            edgeValue7295 = regionValue7009;
            regionValue7274 = edgeValue7290;
            regionValue7275 = edgeValue7291;
            regionValue7276 = edgeValue7292;
            regionValue7277 = edgeValue7293;
            regionValue7279 = edgeValue7295;
            break region1121;
        }
        }
        if (regionValue7279 <= 0) {
            edgeValue7306 = regionValue7274;
            edgeValue7307 = regionValue7275;
            edgeValue7308 = regionValue7276;
            edgeValue7309 = regionValue7277;
            regionValue6617 = edgeValue7306;
            regionValue6618 = edgeValue7307;
            regionValue6619 = edgeValue7308;
            regionValue6620 = edgeValue7309;
            break region1132;
        } else {
            edgeValue7333 = regionValue7276;
            edgeValue7334 = regionValue7277;
            regionValue7320 = edgeValue7333;
            regionValue7321 = edgeValue7334;
            break region1123;
        }
        }
        computed7336 = regionValue7321 - 36;
        edgeValue7347 = regionValue7320;
        edgeValue7348 = regionValue7321;
        regionValue7246 = edgeValue7347;
        regionValue7247 = edgeValue7348;
        regionValue7249 = computed7336;
        break region1128;
        }
        value7351 = regionValue7249;
        edgeValue7363 = value7351;
        edgeValue7365 = regionValue7246;
        edgeValue7366 = regionValue7247;
        regionValue6617 = edgeValue7363;
        regionValue6618 = value6635;
        regionValue6619 = edgeValue7365;
        regionValue6620 = edgeValue7366;
        break region1132;
        }
        incremented7367 = regionValue6620 + (1);
        edgeValue7378 = regionValue6617;
        edgeValue7379 = regionValue6618;
        edgeValue7380 = regionValue6619;
        regionValue6714 = edgeValue7378;
        regionValue6715 = edgeValue7379;
        regionValue6716 = edgeValue7380;
        regionValue6717 = incremented7367;
        break region1134;
        }
        edgeValue7392 = regionValue6714;
        edgeValue7393 = regionValue6715;
        edgeValue7394 = regionValue6716;
        edgeValue7395 = regionValue6717;
        regionValue6650 = edgeValue7392;
        regionValue6651 = edgeValue7393;
        regionValue6652 = edgeValue7394;
        regionValue6653 = edgeValue7395;
        break region1136;
        }
        if (value47 == 0) {
            edgeValue7407 = regionValue6650;
            edgeValue7408 = regionValue6651;
            edgeValue7409 = regionValue6652;
            edgeValue7410 = regionValue6653;
            regionValue6531 = edgeValue7407;
            regionValue6532 = edgeValue7408;
            regionValue6533 = edgeValue7409;
            regionValue6534 = edgeValue7410;
            break region484;
        } else {
            edgeValue7420 = regionValue6650;
            regionValue58 = edgeValue7420;
            break region572;
        }
        }
        loop484: while (true) {
        region571: {
        region570: {
        region569: {
        region566: {
        region561: {
        region560: {
        region559: {
        region558: {
        region553: {
        region552: {
        region550: {
        region549: {
        region544: {
        region539: {
        region537: {
        region536: {
        region534: {
        region527: {
        region525: {
        region524: {
        region505: {
        region504: {
        region503: {
        region493: {
        value7421 = recovery$indy$flow$154();
        value7422 = recovery$indy$flow$155(value7421, -3626764515505276552L, a0);
        value7423 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value7422)))).field_429));
        value7424 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value7423)))).field_46));
        value7425 = recovery$indy$flow$158(value7424);
        if (regionValue6534 >= value7425) {
            edgeValue7435 = regionValue6531;
            regionValue58 = edgeValue7435;
            break region572;
        } else {
            edgeValue7460 = regionValue6531;
            edgeValue7461 = regionValue6532;
            edgeValue7462 = regionValue6533;
            edgeValue7463 = regionValue6534;
            regionValue7446 = edgeValue7460;
            regionValue7447 = edgeValue7461;
            regionValue7448 = edgeValue7462;
            regionValue7449 = edgeValue7463;
            break region493;
        }
        }
        value7464 = recovery$indy$flow$159();
        value7465 = recovery$indy$flow$160(value7464, -3626764515505276552L, a0);
        value7466 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value7465)))).field_429));
        value7467 = recovery$indy$flow$162(value7466, regionValue7449);
        value7468 = recovery$indy$flow$163(value7467);
        value7469 = value7468;
        edgeValue7496 = regionValue7446;
        edgeValue7497 = regionValue7447;
        edgeValue7498 = regionValue7448;
        edgeValue7499 = regionValue7449;
        edgeValue7500 = value7469;
        edgeValue7501 = value7469;
        regionValue7480 = edgeValue7496;
        regionValue7481 = edgeValue7497;
        regionValue7482 = edgeValue7498;
        regionValue7483 = edgeValue7499;
        regionValue7484 = edgeValue7500;
        regionValue7485 = edgeValue7501;
        break region503;
        }
        if (regionValue7485 != null) {
            edgeValue7527 = regionValue7480;
            edgeValue7528 = regionValue7481;
            edgeValue7529 = regionValue7482;
            edgeValue7530 = regionValue7483;
            edgeValue7531 = regionValue7484;
            regionValue7512 = edgeValue7527;
            regionValue7513 = edgeValue7528;
            regionValue7514 = edgeValue7529;
            regionValue7515 = edgeValue7530;
            regionValue7516 = edgeValue7531;
            break region505;
        } else {
            edgeValue7556 = regionValue7480;
            edgeValue7557 = regionValue7481;
            edgeValue7558 = regionValue7482;
            edgeValue7559 = regionValue7483;
            regionValue7542 = edgeValue7556;
            regionValue7543 = edgeValue7557;
            regionValue7544 = edgeValue7558;
            regionValue7545 = edgeValue7559;
            break region504;
        }
        }
        edgeValue7584 = regionValue7542;
        edgeValue7585 = regionValue7543;
        edgeValue7586 = regionValue7544;
        edgeValue7587 = regionValue7545;
        regionValue7570 = edgeValue7584;
        regionValue7571 = edgeValue7585;
        regionValue7572 = edgeValue7586;
        regionValue7573 = edgeValue7587;
        break region569;
        }
        value7588 = recovery$indy$flow$164(this, computed24, regionValue7516, -3628665704559860256L, a0);
        value7589 = value7588;
        value7590 = recovery$indy$flow$165(this, computed24, regionValue7514, -3628665704559860256L, a0);
        value7591 = value7590;
        comparison7592 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison7592 < 0) {
            edgeValue7618 = regionValue7512;
            edgeValue7619 = regionValue7513;
            edgeValue7620 = regionValue7514;
            edgeValue7621 = regionValue7515;
            regionValue7603 = edgeValue7618;
            regionValue7604 = edgeValue7619;
            regionValue7605 = edgeValue7620;
            regionValue7606 = edgeValue7621;
            break region571;
        } else {
            edgeValue7650 = regionValue7512;
            edgeValue7651 = regionValue7513;
            edgeValue7652 = regionValue7514;
            edgeValue7653 = regionValue7515;
            edgeValue7654 = value7589;
            edgeValue7655 = value7591;
            regionValue7633 = edgeValue7650;
            regionValue7634 = edgeValue7651;
            regionValue7635 = edgeValue7652;
            regionValue7636 = edgeValue7653;
            regionValue7637 = edgeValue7654;
            regionValue7638 = edgeValue7655;
            break region524;
        }
        }
        if (value47 != 0) {
            edgeValue7681 = regionValue7633;
            edgeValue7682 = regionValue7634;
            edgeValue7683 = regionValue7635;
            edgeValue7684 = regionValue7636;
            regionValue7667 = edgeValue7681;
            regionValue7668 = edgeValue7682;
            regionValue7669 = edgeValue7683;
            regionValue7670 = edgeValue7684;
            break region570;
        } else {
            edgeValue7711 = regionValue7633;
            edgeValue7712 = regionValue7634;
            edgeValue7713 = regionValue7635;
            edgeValue7714 = regionValue7636;
            edgeValue7715 = regionValue7637;
            edgeValue7716 = regionValue7638;
            regionValue7695 = edgeValue7711;
            regionValue7696 = edgeValue7712;
            regionValue7697 = edgeValue7713;
            regionValue7698 = edgeValue7714;
            regionValue7699 = edgeValue7715;
            regionValue7700 = edgeValue7716;
            break region525;
        }
        }
        edgeValue7743 = regionValue7695;
        edgeValue7744 = regionValue7696;
        edgeValue7745 = regionValue7697;
        edgeValue7746 = regionValue7698;
        edgeValue7747 = regionValue7699;
        edgeValue7748 = regionValue7700;
        regionValue7727 = edgeValue7743;
        regionValue7728 = edgeValue7744;
        regionValue7729 = edgeValue7745;
        regionValue7730 = edgeValue7746;
        regionValue7731 = edgeValue7747;
        regionValue7732 = edgeValue7748;
        break region527;
        }
        comparison7749 = (java.lang.Double.isNaN(regionValue7731) || java.lang.Double.isNaN(1.0D) ? -1 : (regionValue7731 > 1.0D ? 1 : regionValue7731 == 1.0D ? 0 : -1));
        comparison7750 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison7750 <= 0) {
            edgeValue7777 = regionValue7727;
            edgeValue7778 = regionValue7728;
            edgeValue7779 = regionValue7729;
            edgeValue7780 = regionValue7730;
            edgeValue7781 = regionValue7731;
            edgeValue7782 = comparison7749;
            regionValue7761 = edgeValue7777;
            regionValue7762 = edgeValue7778;
            regionValue7763 = edgeValue7779;
            regionValue7764 = edgeValue7780;
            regionValue7765 = edgeValue7781;
            regionValue7766 = edgeValue7782;
            break region544;
        } else {
            edgeValue7810 = regionValue7727;
            edgeValue7811 = regionValue7728;
            edgeValue7812 = regionValue7729;
            edgeValue7813 = regionValue7730;
            edgeValue7814 = regionValue7731;
            edgeValue7815 = regionValue7732;
            edgeValue7816 = comparison7749;
            regionValue7793 = edgeValue7810;
            regionValue7794 = edgeValue7811;
            regionValue7795 = edgeValue7812;
            regionValue7796 = edgeValue7813;
            regionValue7797 = edgeValue7814;
            regionValue7798 = edgeValue7815;
            regionValue7799 = edgeValue7816;
            break region534;
        }
        }
        edgeValue7844 = regionValue7793;
        edgeValue7845 = regionValue7794;
        edgeValue7846 = regionValue7795;
        edgeValue7847 = regionValue7796;
        edgeValue7848 = regionValue7797;
        edgeValue7849 = regionValue7798;
        edgeValue7850 = regionValue7799;
        regionValue7827 = edgeValue7844;
        regionValue7828 = edgeValue7845;
        regionValue7829 = edgeValue7846;
        regionValue7830 = edgeValue7847;
        regionValue7831 = edgeValue7848;
        regionValue7832 = edgeValue7849;
        regionValue7833 = edgeValue7850;
        break region536;
        }
        if (regionValue7833 <= 0) {
            edgeValue7861 = regionValue7827;
            edgeValue7862 = regionValue7828;
            edgeValue7863 = regionValue7829;
            edgeValue7864 = regionValue7830;
            regionValue7570 = edgeValue7861;
            regionValue7571 = edgeValue7862;
            regionValue7572 = edgeValue7863;
            regionValue7573 = edgeValue7864;
            break region569;
        } else {
            edgeValue7891 = regionValue7827;
            edgeValue7892 = regionValue7828;
            edgeValue7893 = regionValue7829;
            edgeValue7894 = regionValue7830;
            edgeValue7895 = regionValue7831;
            edgeValue7896 = regionValue7832;
            regionValue7875 = edgeValue7891;
            regionValue7876 = edgeValue7892;
            regionValue7877 = edgeValue7893;
            regionValue7878 = edgeValue7894;
            regionValue7879 = edgeValue7895;
            regionValue7880 = edgeValue7896;
            break region537;
        }
        }
        edgeValue7923 = regionValue7875;
        edgeValue7924 = regionValue7876;
        edgeValue7925 = regionValue7877;
        edgeValue7926 = regionValue7878;
        edgeValue7927 = regionValue7879;
        edgeValue7928 = regionValue7880;
        regionValue7907 = edgeValue7923;
        regionValue7908 = edgeValue7924;
        regionValue7909 = edgeValue7925;
        regionValue7910 = edgeValue7926;
        regionValue7911 = edgeValue7927;
        regionValue7912 = edgeValue7928;
        break region539;
        }
        comparison7929 = (java.lang.Double.isNaN(regionValue7911) || java.lang.Double.isNaN(regionValue7912) ? -1 : (regionValue7911 > regionValue7912 ? 1 : regionValue7911 == regionValue7912 ? 0 : -1));
        edgeValue7940 = regionValue7907;
        edgeValue7941 = regionValue7908;
        edgeValue7942 = regionValue7909;
        edgeValue7943 = regionValue7910;
        edgeValue7944 = regionValue7911;
        edgeValue7945 = comparison7929;
        regionValue7761 = edgeValue7940;
        regionValue7762 = edgeValue7941;
        regionValue7763 = edgeValue7942;
        regionValue7764 = edgeValue7943;
        regionValue7765 = edgeValue7944;
        regionValue7766 = edgeValue7945;
        break region544;
        }
        comparison7946 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison7946 < 0) {
            edgeValue7974 = regionValue7761;
            edgeValue7975 = regionValue7762;
            edgeValue7976 = regionValue7763;
            edgeValue7977 = regionValue7764;
            edgeValue7978 = regionValue7765;
            edgeValue7979 = regionValue7766;
            regionValue7957 = edgeValue7974;
            regionValue7958 = edgeValue7975;
            regionValue7959 = edgeValue7976;
            regionValue7960 = edgeValue7977;
            regionValue7961 = edgeValue7978;
            regionValue7962 = edgeValue7979;
            break region559;
        } else {
            edgeValue8008 = regionValue7761;
            edgeValue8009 = regionValue7762;
            edgeValue8010 = regionValue7763;
            edgeValue8011 = regionValue7764;
            edgeValue8012 = regionValue7765;
            edgeValue8013 = regionValue7766;
            regionValue7991 = edgeValue8008;
            regionValue7992 = edgeValue8009;
            regionValue7993 = edgeValue8010;
            regionValue7994 = edgeValue8011;
            regionValue7995 = edgeValue8012;
            regionValue7996 = edgeValue8013;
            break region549;
        }
        }
        if (value47 != 0) {
            edgeValue8041 = regionValue7991;
            edgeValue8042 = regionValue7992;
            edgeValue8043 = regionValue7993;
            edgeValue8044 = regionValue7994;
            edgeValue8045 = regionValue7995;
            edgeValue8046 = regionValue7996;
            regionValue8025 = edgeValue8041;
            regionValue8026 = edgeValue8042;
            regionValue8027 = edgeValue8043;
            regionValue8028 = edgeValue8044;
            regionValue8029 = edgeValue8045;
            regionValue8030 = edgeValue8046;
            break region558;
        } else {
            edgeValue8073 = regionValue7991;
            edgeValue8074 = regionValue7992;
            edgeValue8075 = regionValue7993;
            edgeValue8076 = regionValue7994;
            edgeValue8077 = regionValue7995;
            edgeValue8078 = regionValue7996;
            regionValue8057 = edgeValue8073;
            regionValue8058 = edgeValue8074;
            regionValue8059 = edgeValue8075;
            regionValue8060 = edgeValue8076;
            regionValue8061 = edgeValue8077;
            regionValue8062 = edgeValue8078;
            break region550;
        }
        }
        edgeValue8105 = regionValue8057;
        edgeValue8106 = regionValue8058;
        edgeValue8107 = regionValue8059;
        edgeValue8108 = regionValue8060;
        edgeValue8109 = regionValue8061;
        edgeValue8110 = regionValue8062;
        regionValue8089 = edgeValue8105;
        regionValue8090 = edgeValue8106;
        regionValue8091 = edgeValue8107;
        regionValue8092 = edgeValue8108;
        regionValue8093 = edgeValue8109;
        regionValue8094 = edgeValue8110;
        break region552;
        }
        if (regionValue8094 <= 0) {
            edgeValue8121 = regionValue8089;
            edgeValue8122 = regionValue8090;
            edgeValue8123 = regionValue8091;
            edgeValue8124 = regionValue8092;
            regionValue7570 = edgeValue8121;
            regionValue7571 = edgeValue8122;
            regionValue7572 = edgeValue8123;
            regionValue7573 = edgeValue8124;
            break region569;
        } else {
            edgeValue8150 = regionValue8089;
            edgeValue8151 = regionValue8090;
            edgeValue8152 = regionValue8091;
            edgeValue8153 = regionValue8092;
            edgeValue8154 = regionValue8093;
            regionValue8135 = edgeValue8150;
            regionValue8136 = edgeValue8151;
            regionValue8137 = edgeValue8152;
            regionValue8138 = edgeValue8153;
            regionValue8139 = edgeValue8154;
            break region553;
        }
        }
        comparison8155 = (java.lang.Double.isNaN(regionValue8139) || java.lang.Double.isNaN(regionValue8136) ? -1 : (regionValue8139 > regionValue8136 ? 1 : regionValue8139 == regionValue8136 ? 0 : -1));
        edgeValue8166 = regionValue8135;
        edgeValue8167 = regionValue8136;
        edgeValue8168 = regionValue8137;
        edgeValue8169 = regionValue8138;
        edgeValue8170 = regionValue8139;
        edgeValue8171 = comparison8155;
        regionValue8025 = edgeValue8166;
        regionValue8026 = edgeValue8167;
        regionValue8027 = edgeValue8168;
        regionValue8028 = edgeValue8169;
        regionValue8029 = edgeValue8170;
        regionValue8030 = edgeValue8171;
        break region558;
        }
        edgeValue8182 = regionValue8025;
        edgeValue8183 = regionValue8026;
        edgeValue8184 = regionValue8027;
        edgeValue8185 = regionValue8028;
        edgeValue8186 = regionValue8029;
        edgeValue8187 = regionValue8030;
        regionValue7957 = edgeValue8182;
        regionValue7958 = edgeValue8183;
        regionValue7959 = edgeValue8184;
        regionValue7960 = edgeValue8185;
        regionValue7961 = edgeValue8186;
        regionValue7962 = edgeValue8187;
        break region559;
        }
        if (value47 != 0) {
            edgeValue8213 = regionValue7959;
            edgeValue8214 = regionValue7960;
            edgeValue8215 = regionValue7961;
            edgeValue8216 = regionValue7962;
            regionValue8199 = edgeValue8213;
            regionValue8200 = edgeValue8214;
            regionValue8201 = edgeValue8215;
            regionValue8202 = edgeValue8216;
            break region566;
        } else {
            edgeValue8243 = regionValue7957;
            edgeValue8244 = regionValue7958;
            edgeValue8245 = regionValue7959;
            edgeValue8246 = regionValue7960;
            edgeValue8247 = regionValue7961;
            edgeValue8248 = regionValue7962;
            regionValue8227 = edgeValue8243;
            regionValue8228 = edgeValue8244;
            regionValue8229 = edgeValue8245;
            regionValue8230 = edgeValue8246;
            regionValue8231 = edgeValue8247;
            regionValue8232 = edgeValue8248;
            break region560;
        }
        }
        if (regionValue8232 <= 0) {
            edgeValue8259 = regionValue8227;
            edgeValue8260 = regionValue8228;
            edgeValue8261 = regionValue8229;
            edgeValue8262 = regionValue8230;
            regionValue7570 = edgeValue8259;
            regionValue7571 = edgeValue8260;
            regionValue7572 = edgeValue8261;
            regionValue7573 = edgeValue8262;
            break region569;
        } else {
            edgeValue8286 = regionValue8229;
            edgeValue8287 = regionValue8230;
            edgeValue8288 = regionValue8231;
            regionValue8273 = edgeValue8286;
            regionValue8274 = edgeValue8287;
            regionValue8275 = edgeValue8288;
            break region561;
        }
        }
        computed8289 = regionValue8274 - 36;
        edgeValue8300 = regionValue8273;
        edgeValue8301 = regionValue8274;
        edgeValue8302 = regionValue8275;
        edgeValue8303 = computed8289;
        regionValue8199 = edgeValue8300;
        regionValue8200 = edgeValue8301;
        regionValue8201 = edgeValue8302;
        regionValue8202 = edgeValue8303;
        break region566;
        }
        value8304 = regionValue8202;
        value8305 = regionValue8201;
        edgeValue8316 = value8304;
        edgeValue8317 = value8305;
        edgeValue8318 = regionValue8199;
        edgeValue8319 = regionValue8200;
        regionValue7570 = edgeValue8316;
        regionValue7571 = edgeValue8317;
        regionValue7572 = edgeValue8318;
        regionValue7573 = edgeValue8319;
        break region569;
        }
        incremented8320 = regionValue7573 + (1);
        edgeValue8331 = regionValue7570;
        edgeValue8332 = regionValue7571;
        edgeValue8333 = regionValue7572;
        edgeValue8334 = incremented8320;
        regionValue7667 = edgeValue8331;
        regionValue7668 = edgeValue8332;
        regionValue7669 = edgeValue8333;
        regionValue7670 = edgeValue8334;
        break region570;
        }
        edgeValue8345 = regionValue7667;
        edgeValue8346 = regionValue7668;
        edgeValue8347 = regionValue7669;
        edgeValue8348 = regionValue7670;
        regionValue7603 = edgeValue8345;
        regionValue7604 = edgeValue8346;
        regionValue7605 = edgeValue8347;
        regionValue7606 = edgeValue8348;
        break region571;
        }
        if (value47 == 0) {
            edgeValue8360 = regionValue7603;
            edgeValue8361 = regionValue7604;
            edgeValue8362 = regionValue7605;
            edgeValue8363 = regionValue7606;
            regionValue6531 = edgeValue8360;
            regionValue6532 = edgeValue8361;
            regionValue6533 = edgeValue8362;
            regionValue6534 = edgeValue8363;
            continue loop484;
        } else {
            edgeValue8373 = regionValue7603;
            regionValue58 = edgeValue8373;
            break region572;
        }
        }
        }
        value8374 = recovery$indy$flow$166(1, computed40, -3628613056835738053L, a0);
        edgeValue8383 = regionValue58;
        edgeValue8384 = (int) ((value8374 ? 1 : 0));
        regionValue114 = edgeValue8383;
        regionValue115 = edgeValue8384;
        break region577;
        }
        value8385 = regionValue115;
        comparison8386 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison8386 <= 0) {
            edgeValue8406 = regionValue114;
            edgeValue8407 = value8385;
            regionValue8395 = edgeValue8406;
            regionValue8396 = edgeValue8407;
            break region602;
        } else {
            edgeValue8428 = regionValue114;
            edgeValue8429 = value8385;
            regionValue8417 = edgeValue8428;
            regionValue8418 = edgeValue8429;
            break region583;
        }
        }
        if (value47 != 0) {
            edgeValue8449 = regionValue8417;
            edgeValue8450 = regionValue8418;
            regionValue8439 = edgeValue8449;
            regionValue8440 = edgeValue8450;
            break region601;
        } else {
            edgeValue8469 = regionValue8417;
            edgeValue8470 = regionValue8418;
            regionValue8459 = edgeValue8469;
            regionValue8460 = edgeValue8470;
            break region584;
        }
        }
        edgeValue8489 = regionValue8459;
        edgeValue8490 = regionValue8460;
        regionValue8479 = edgeValue8489;
        regionValue8480 = edgeValue8490;
        break region586;
        }
        if (regionValue8479 >= 0) {
            edgeValue8509 = regionValue8479;
            edgeValue8510 = regionValue8480;
            regionValue8499 = edgeValue8509;
            regionValue8500 = edgeValue8510;
            break region609;
        } else {
            edgeValue8529 = regionValue8479;
            edgeValue8530 = regionValue8480;
            regionValue8519 = edgeValue8529;
            regionValue8520 = edgeValue8530;
            break region588;
        }
        }
        edgeValue8549 = regionValue8519;
        edgeValue8550 = regionValue8520;
        regionValue8539 = edgeValue8549;
        regionValue8540 = edgeValue8550;
        break region590;
        }
        recovery$indy$flow$167(this, 0);
        value8551 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingDelayBeforeSwitch));
        value8552 = recovery$indy$flow$169(value8551, -3628323420538493756L, a0);
        edgeValue8561 = regionValue8539;
        edgeValue8562 = regionValue8540;
        regionValue8439 = edgeValue8561;
        regionValue8440 = edgeValue8562;
        break region601;
        }
        edgeValue8571 = regionValue8439;
        edgeValue8572 = regionValue8440;
        regionValue8395 = edgeValue8571;
        regionValue8396 = edgeValue8572;
        break region602;
        }
        comparison8574 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison8574 <= 0) {
            edgeValue8594 = regionValue8395;
            edgeValue8595 = regionValue8396;
            regionValue8583 = edgeValue8594;
            regionValue8584 = edgeValue8595;
            regionValue8585 = value47;
            break region618;
        } else {
            edgeValue8616 = regionValue8395;
            edgeValue8617 = regionValue8396;
            regionValue8605 = edgeValue8616;
            regionValue8606 = edgeValue8617;
            break region606;
        }
        }
        if (value47 == 0) {
            edgeValue8637 = regionValue8605;
            edgeValue8638 = regionValue8606;
            regionValue8627 = edgeValue8637;
            regionValue8628 = edgeValue8638;
            break region617;
        } else {
            edgeValue8657 = regionValue8605;
            edgeValue8658 = regionValue8606;
            regionValue8647 = edgeValue8657;
            regionValue8648 = edgeValue8658;
            break region607;
        }
        }
        edgeValue8667 = regionValue8647;
        edgeValue8668 = regionValue8648;
        regionValue8499 = edgeValue8667;
        regionValue8500 = edgeValue8668;
        break region609;
        }
        value8669 = recovery$indy$flow$170(this);
        computed8670 = value8669 + 1;
        recovery$indy$flow$171(this, computed8670);
        edgeValue8679 = regionValue8499;
        edgeValue8680 = regionValue8500;
        regionValue8627 = edgeValue8679;
        regionValue8628 = edgeValue8680;
        break region617;
        }
        edgeValue8689 = regionValue8627;
        edgeValue8690 = regionValue8628;
        edgeValue8691 = 0;
        regionValue8583 = edgeValue8689;
        regionValue8584 = edgeValue8690;
        regionValue8585 = edgeValue8691;
        break region618;
        }
        value8692 = regionValue8585;
        comparison8693 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison8693 < 0) {
            edgeValue8715 = regionValue8583;
            edgeValue8716 = regionValue8584;
            edgeValue8717 = value8692;
            edgeValue8718 = regionValue8583;
            regionValue8702 = edgeValue8715;
            regionValue8703 = edgeValue8716;
            regionValue8704 = edgeValue8717;
            regionValue8705 = edgeValue8718;
            regionValue8706 = value47;
            break region632;
        } else {
            edgeValue8741 = regionValue8583;
            edgeValue8742 = regionValue8584;
            edgeValue8743 = value8692;
            edgeValue8744 = regionValue8583;
            regionValue8728 = edgeValue8741;
            regionValue8729 = edgeValue8742;
            regionValue8730 = edgeValue8743;
            regionValue8731 = edgeValue8744;
            break region625;
        }
        }
        if (value47 != 0) {
            edgeValue8766 = regionValue8728;
            edgeValue8767 = regionValue8729;
            edgeValue8768 = regionValue8730;
            edgeValue8769 = regionValue8731;
            regionValue8754 = edgeValue8766;
            regionValue8755 = edgeValue8767;
            regionValue8756 = edgeValue8768;
            regionValue8757 = edgeValue8769;
            break region692;
        } else {
            edgeValue8790 = regionValue8728;
            edgeValue8791 = regionValue8729;
            edgeValue8792 = regionValue8730;
            edgeValue8793 = regionValue8731;
            regionValue8778 = edgeValue8790;
            regionValue8779 = edgeValue8791;
            regionValue8780 = edgeValue8792;
            regionValue8781 = edgeValue8793;
            break region626;
        }
        }
        edgeValue8814 = regionValue8778;
        edgeValue8815 = regionValue8779;
        edgeValue8816 = regionValue8780;
        edgeValue8817 = regionValue8781;
        regionValue8802 = edgeValue8814;
        regionValue8803 = edgeValue8815;
        regionValue8804 = edgeValue8816;
        regionValue8805 = edgeValue8817;
        break region628;
        }
        value8818 = recovery$indy$flow$172(this);
        edgeValue8827 = regionValue8802;
        edgeValue8828 = regionValue8803;
        edgeValue8829 = regionValue8804;
        edgeValue8830 = regionValue8805;
        regionValue8702 = edgeValue8827;
        regionValue8703 = edgeValue8828;
        regionValue8704 = edgeValue8829;
        regionValue8705 = edgeValue8830;
        regionValue8706 = value8818;
        break region632;
        }
        comparison8832 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison8832 <= 0) {
            edgeValue8854 = regionValue8702;
            edgeValue8855 = regionValue8703;
            edgeValue8856 = regionValue8704;
            edgeValue8857 = regionValue8705;
            edgeValue8858 = regionValue8706;
            regionValue8841 = edgeValue8854;
            regionValue8842 = edgeValue8855;
            regionValue8843 = edgeValue8856;
            regionValue8844 = edgeValue8857;
            regionValue8845 = edgeValue8858;
            break region644;
        } else {
            edgeValue8880 = regionValue8702;
            edgeValue8881 = regionValue8703;
            edgeValue8882 = regionValue8704;
            edgeValue8883 = regionValue8705;
            edgeValue8884 = regionValue8706;
            regionValue8867 = edgeValue8880;
            regionValue8868 = edgeValue8881;
            regionValue8869 = edgeValue8882;
            regionValue8870 = edgeValue8883;
            regionValue8871 = edgeValue8884;
            break region636;
        }
        }
        if (regionValue8870 == regionValue8871) {
            edgeValue8904 = regionValue8867;
            edgeValue8905 = regionValue8868;
            edgeValue8906 = regionValue8869;
            regionValue8893 = edgeValue8904;
            regionValue8894 = edgeValue8905;
            regionValue8895 = edgeValue8906;
            break region680;
        } else {
            edgeValue8926 = regionValue8867;
            edgeValue8927 = regionValue8868;
            edgeValue8928 = regionValue8869;
            regionValue8915 = edgeValue8926;
            regionValue8916 = edgeValue8927;
            regionValue8917 = edgeValue8928;
            break region637;
        }
        }
        edgeValue8948 = regionValue8915;
        edgeValue8949 = regionValue8916;
        edgeValue8950 = regionValue8917;
        regionValue8937 = edgeValue8948;
        regionValue8938 = edgeValue8949;
        regionValue8939 = edgeValue8950;
        break region639;
        }
        value8951 = recovery$indy$flow$173(this);
        edgeValue8960 = regionValue8937;
        edgeValue8961 = regionValue8938;
        edgeValue8962 = regionValue8939;
        regionValue8841 = edgeValue8960;
        regionValue8842 = edgeValue8961;
        regionValue8843 = edgeValue8962;
        regionValue8844 = value8951;
        regionValue8845 = value47;
        break region644;
        }
        if (regionValue8845 != 0) {
            edgeValue8973 = regionValue8841;
            edgeValue8974 = regionValue8842;
            edgeValue8975 = regionValue8843;
            edgeValue8976 = regionValue8844;
            regionValue8754 = edgeValue8973;
            regionValue8755 = edgeValue8974;
            regionValue8756 = edgeValue8975;
            regionValue8757 = edgeValue8976;
            break region692;
        } else {
            edgeValue8997 = regionValue8841;
            edgeValue8998 = regionValue8842;
            edgeValue8999 = regionValue8843;
            edgeValue9000 = regionValue8844;
            regionValue8985 = edgeValue8997;
            regionValue8986 = edgeValue8998;
            regionValue8987 = edgeValue8999;
            regionValue8988 = edgeValue9000;
            break region645;
        }
        }
        if (regionValue8988 <= 0) {
            edgeValue9009 = regionValue8985;
            edgeValue9010 = regionValue8986;
            edgeValue9011 = regionValue8987;
            regionValue8893 = edgeValue9009;
            regionValue8894 = edgeValue9010;
            regionValue8895 = edgeValue9011;
            break region680;
        } else {
            edgeValue9031 = regionValue8985;
            edgeValue9032 = regionValue8986;
            edgeValue9033 = regionValue8987;
            regionValue9020 = edgeValue9031;
            regionValue9021 = edgeValue9032;
            regionValue9022 = edgeValue9033;
            break region646;
        }
        }
        value9034 = recovery$indy$flow$174(this);
        if (value47 != 0) {
            edgeValue9056 = regionValue9020;
            edgeValue9057 = regionValue9021;
            edgeValue9058 = regionValue9022;
            edgeValue9060 = regionValue9021;
            regionValue9043 = edgeValue9056;
            regionValue9044 = edgeValue9057;
            regionValue9045 = edgeValue9058;
            regionValue9047 = edgeValue9060;
            break region657;
        } else {
            edgeValue9082 = regionValue9020;
            edgeValue9083 = regionValue9021;
            edgeValue9084 = regionValue9022;
            edgeValue9086 = regionValue9021;
            regionValue9069 = edgeValue9082;
            regionValue9070 = edgeValue9083;
            regionValue9071 = edgeValue9084;
            regionValue9073 = edgeValue9086;
            break region651;
        }
        }
        edgeValue9108 = regionValue9069;
        edgeValue9109 = regionValue9070;
        edgeValue9110 = regionValue9071;
        edgeValue9112 = regionValue9073;
        regionValue9095 = edgeValue9108;
        regionValue9096 = edgeValue9109;
        regionValue9097 = edgeValue9110;
        regionValue9099 = edgeValue9112;
        break region653;
        }
        if (regionValue9099 == 0) {
            edgeValue9133 = regionValue9095;
            edgeValue9134 = regionValue9096;
            edgeValue9135 = regionValue9097;
            regionValue9121 = edgeValue9133;
            regionValue9122 = edgeValue9134;
            regionValue9123 = edgeValue9135;
            break region658;
        } else {
            edgeValue9157 = regionValue9095;
            edgeValue9158 = regionValue9096;
            edgeValue9159 = regionValue9097;
            regionValue9145 = edgeValue9157;
            regionValue9146 = edgeValue9158;
            regionValue9147 = edgeValue9159;
            break region654;
        }
        }
        edgeValue9181 = regionValue9145;
        edgeValue9182 = regionValue9146;
        edgeValue9183 = regionValue9147;
        regionValue9169 = edgeValue9181;
        regionValue9170 = edgeValue9182;
        regionValue9171 = edgeValue9183;
        break region656;
        }
        edgeValue9193 = regionValue9169;
        edgeValue9194 = regionValue9170;
        edgeValue9195 = regionValue9171;
        edgeValue9197 = 0;
        regionValue9043 = edgeValue9193;
        regionValue9044 = edgeValue9194;
        regionValue9045 = edgeValue9195;
        regionValue9047 = edgeValue9197;
        break region657;
        }
        edgeValue9219 = regionValue9043;
        edgeValue9220 = regionValue9044;
        edgeValue9221 = regionValue9045;
        edgeValue9223 = regionValue9047;
        regionValue9206 = edgeValue9219;
        regionValue9207 = edgeValue9220;
        regionValue9208 = edgeValue9221;
        regionValue9210 = edgeValue9223;
        break region663;
        }
        value9224 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingDelayAtItemSwitch));
        value9225 = recovery$indy$flow$176(value9224, -3628745149736280163L, a0);
        edgeValue9234 = regionValue9121;
        edgeValue9235 = regionValue9122;
        edgeValue9236 = regionValue9123;
        regionValue9206 = edgeValue9234;
        regionValue9207 = edgeValue9235;
        regionValue9208 = edgeValue9236;
        regionValue9210 = value9225;
        break region663;
        }
        if (value9034 >= regionValue9210) {
            edgeValue9258 = regionValue9206;
            edgeValue9259 = regionValue9207;
            edgeValue9260 = regionValue9208;
            regionValue9247 = edgeValue9258;
            regionValue9248 = edgeValue9259;
            regionValue9249 = edgeValue9260;
            break region666;
        } else {
            edgeValue9279 = regionValue9206;
            edgeValue9280 = regionValue9207;
            regionValue9269 = edgeValue9279;
            regionValue9270 = edgeValue9280;
            break region664;
        }
        }
        value9281 = 1;
        edgeValue9290 = regionValue9269;
        edgeValue9291 = regionValue9270;
        regionValue9247 = edgeValue9290;
        regionValue9248 = edgeValue9291;
        regionValue9249 = value9281;
        break region666;
        }
        value9293 = recovery$indy$flow$177(this);
        computed9294 = value9293 + 1;
        recovery$indy$flow$178(this, computed9294);
        comparison9295 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison9295 < 0) {
            edgeValue9316 = regionValue9247;
            edgeValue9317 = regionValue9248;
            edgeValue9318 = regionValue9249;
            regionValue9304 = edgeValue9316;
            regionValue9305 = edgeValue9317;
            regionValue9306 = edgeValue9318;
            regionValue9307 = value47;
            break region705;
        } else {
            edgeValue9340 = regionValue9247;
            edgeValue9341 = regionValue9248;
            edgeValue9342 = regionValue9249;
            regionValue9328 = edgeValue9340;
            regionValue9329 = edgeValue9341;
            regionValue9330 = edgeValue9342;
            break region677;
        }
        }
        if (value47 == 0) {
            edgeValue9363 = regionValue9328;
            edgeValue9364 = regionValue9329;
            edgeValue9365 = regionValue9330;
            regionValue9352 = edgeValue9363;
            regionValue9353 = edgeValue9364;
            regionValue9354 = edgeValue9365;
            break region704;
        } else {
            edgeValue9385 = regionValue9328;
            edgeValue9386 = regionValue9329;
            edgeValue9387 = regionValue9330;
            regionValue9374 = edgeValue9385;
            regionValue9375 = edgeValue9386;
            regionValue9376 = edgeValue9387;
            break region678;
        }
        }
        edgeValue9396 = regionValue9374;
        edgeValue9397 = regionValue9375;
        edgeValue9398 = regionValue9376;
        regionValue8893 = edgeValue9396;
        regionValue8894 = edgeValue9397;
        regionValue8895 = edgeValue9398;
        break region680;
        }
        comparison9399 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison9399 < 0) {
            edgeValue9421 = regionValue8893;
            edgeValue9422 = regionValue8894;
            edgeValue9423 = regionValue8895;
            regionValue9408 = edgeValue9421;
            regionValue9409 = edgeValue9422;
            regionValue9410 = edgeValue9423;
            regionValue9412 = value47;
            break region703;
        } else {
            edgeValue9447 = regionValue8893;
            edgeValue9448 = regionValue8894;
            edgeValue9449 = regionValue8895;
            regionValue9434 = edgeValue9447;
            regionValue9435 = edgeValue9448;
            regionValue9436 = edgeValue9449;
            break region686;
        }
        }
        edgeValue9473 = regionValue9434;
        edgeValue9474 = regionValue9435;
        edgeValue9475 = regionValue9436;
        regionValue9460 = edgeValue9473;
        regionValue9461 = edgeValue9474;
        regionValue9462 = edgeValue9475;
        break region688;
        }
        if (value47 != 0) {
            edgeValue9498 = regionValue9460;
            edgeValue9499 = regionValue9461;
            edgeValue9500 = regionValue9462;
            regionValue9486 = edgeValue9498;
            regionValue9487 = edgeValue9499;
            regionValue9488 = edgeValue9500;
            break region702;
        } else {
            edgeValue9522 = regionValue9460;
            edgeValue9523 = regionValue9461;
            edgeValue9524 = regionValue9462;
            regionValue9510 = edgeValue9522;
            regionValue9511 = edgeValue9523;
            regionValue9512 = edgeValue9524;
            break region689;
        }
        }
        edgeValue9546 = regionValue9510;
        edgeValue9547 = regionValue9511;
        edgeValue9548 = regionValue9512;
        regionValue9534 = edgeValue9546;
        regionValue9535 = edgeValue9547;
        regionValue9536 = edgeValue9548;
        break region691;
        }
        value9550 = recovery$indy$flow$179(this);
        edgeValue9559 = regionValue9534;
        edgeValue9560 = regionValue9535;
        edgeValue9561 = regionValue9536;
        regionValue8754 = edgeValue9559;
        regionValue8755 = edgeValue9560;
        regionValue8756 = edgeValue9561;
        regionValue8757 = value9550;
        break region692;
        }
        if (regionValue8757 <= 0) {
            edgeValue9582 = regionValue8754;
            edgeValue9583 = regionValue8755;
            edgeValue9584 = regionValue8756;
            regionValue9571 = edgeValue9582;
            regionValue9572 = edgeValue9583;
            regionValue9573 = edgeValue9584;
            break region701;
        } else {
            edgeValue9604 = regionValue8754;
            edgeValue9605 = regionValue8755;
            edgeValue9606 = regionValue8756;
            regionValue9593 = edgeValue9604;
            regionValue9594 = edgeValue9605;
            regionValue9595 = edgeValue9606;
            break region693;
        }
        }
        value9607 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingDelayAtItemSwitch));
        value9608 = recovery$indy$flow$181(value9607, -3628323420538493756L, a0);
        edgeValue9617 = regionValue9593;
        edgeValue9618 = regionValue9594;
        edgeValue9619 = regionValue9595;
        regionValue9571 = edgeValue9617;
        regionValue9572 = edgeValue9618;
        regionValue9573 = edgeValue9619;
        break region701;
        }
        edgeValue9628 = regionValue9571;
        edgeValue9629 = regionValue9572;
        edgeValue9630 = regionValue9573;
        regionValue9486 = edgeValue9628;
        regionValue9487 = edgeValue9629;
        regionValue9488 = edgeValue9630;
        break region702;
        }
        edgeValue9640 = regionValue9486;
        edgeValue9641 = regionValue9487;
        edgeValue9642 = regionValue9488;
        edgeValue9644 = 0;
        regionValue9408 = edgeValue9640;
        regionValue9409 = edgeValue9641;
        regionValue9410 = edgeValue9642;
        regionValue9412 = edgeValue9644;
        break region703;
        }
        recovery$indy$flow$182(this, regionValue9412);
        edgeValue9653 = regionValue9408;
        edgeValue9654 = regionValue9409;
        edgeValue9655 = regionValue9410;
        regionValue9352 = edgeValue9653;
        regionValue9353 = edgeValue9654;
        regionValue9354 = edgeValue9655;
        break region704;
        }
        edgeValue9664 = regionValue9352;
        edgeValue9665 = regionValue9353;
        edgeValue9666 = regionValue9354;
        edgeValue9667 = regionValue9352;
        regionValue9304 = edgeValue9664;
        regionValue9305 = edgeValue9665;
        regionValue9306 = edgeValue9666;
        regionValue9307 = edgeValue9667;
        break region705;
        }
        comparison9668 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison9668 <= 0) {
            edgeValue9680 = regionValue9305;
            edgeValue9681 = regionValue9307;
            regionValue9673 = edgeValue9680;
            regionValue9674 = edgeValue9681;
            break region740;
        } else {
            edgeValue9704 = regionValue9304;
            edgeValue9705 = regionValue9305;
            edgeValue9706 = regionValue9306;
            edgeValue9707 = regionValue9307;
            regionValue9691 = edgeValue9704;
            regionValue9692 = edgeValue9705;
            regionValue9693 = edgeValue9706;
            regionValue9694 = edgeValue9707;
            break region710;
        }
        }
        if (value47 != 0) {
            edgeValue9719 = regionValue9692;
            edgeValue9720 = regionValue9694;
            regionValue9713 = edgeValue9719;
            regionValue9714 = edgeValue9720;
            break region739;
        } else {
            edgeValue9741 = regionValue9691;
            edgeValue9742 = regionValue9692;
            edgeValue9743 = regionValue9693;
            edgeValue9744 = regionValue9694;
            regionValue9729 = edgeValue9741;
            regionValue9730 = edgeValue9742;
            regionValue9731 = edgeValue9743;
            regionValue9732 = edgeValue9744;
            break region711;
        }
        }
        edgeValue9765 = regionValue9729;
        edgeValue9766 = regionValue9730;
        edgeValue9767 = regionValue9731;
        edgeValue9768 = regionValue9732;
        regionValue9753 = edgeValue9765;
        regionValue9754 = edgeValue9766;
        regionValue9755 = edgeValue9767;
        regionValue9756 = edgeValue9768;
        break region713;
        }
        if (regionValue9756 == -1) {
            edgeValue9780 = regionValue9754;
            regionValue9774 = edgeValue9780;
            break region735;
        } else {
            edgeValue9800 = regionValue9753;
            edgeValue9801 = regionValue9754;
            edgeValue9802 = regionValue9755;
            regionValue9789 = edgeValue9800;
            regionValue9790 = edgeValue9801;
            regionValue9791 = edgeValue9802;
            break region715;
        }
        }
        edgeValue9822 = regionValue9789;
        edgeValue9823 = regionValue9790;
        edgeValue9824 = regionValue9791;
        regionValue9811 = edgeValue9822;
        regionValue9812 = edgeValue9823;
        regionValue9813 = edgeValue9824;
        break region717;
        }
        if (regionValue9813 != 0) {
            edgeValue9842 = regionValue9812;
            regionValue9833 = edgeValue9842;
            break region726;
        } else {
            edgeValue9861 = regionValue9811;
            edgeValue9862 = regionValue9812;
            regionValue9851 = edgeValue9861;
            regionValue9852 = edgeValue9862;
            break region719;
        }
        }
        edgeValue9881 = regionValue9851;
        edgeValue9882 = regionValue9852;
        regionValue9871 = edgeValue9881;
        regionValue9872 = edgeValue9882;
        break region721;
        }
        recovery$indy$flow$183(this, regionValue9871);
        edgeValue9891 = regionValue9872;
        regionValue9833 = edgeValue9891;
        break region726;
        }
        converted9892 = (short) (converted12);
        converted9893 = (short) (converted16);
        recovery$indy$flow$184(this, converted9892, converted9893, converted20, -3627083758795801153L, a0);
        edgeValue9899 = regionValue9833;
        regionValue9774 = edgeValue9899;
        break region735;
        }
        value9900 = recovery$indy$flow$185(computed22, -3626638550338267837L, a0);
        edgeValue9905 = regionValue9774;
        edgeValue9906 = (int) ((value9900 ? 1 : 0));
        regionValue9713 = edgeValue9905;
        regionValue9714 = edgeValue9906;
        break region739;
        }
        edgeValue9911 = regionValue9713;
        edgeValue9912 = regionValue9714;
        regionValue9673 = edgeValue9911;
        regionValue9674 = edgeValue9912;
        break region740;
        }
        comparison9914 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison9914 <= 0) {
            edgeValue9926 = regionValue9673;
            edgeValue9927 = regionValue9674;
            regionValue9919 = edgeValue9926;
            regionValue9920 = edgeValue9927;
            regionValue9921 = value47;
            break region765;
        } else {
            edgeValue9940 = regionValue9673;
            edgeValue9941 = regionValue9674;
            regionValue9933 = edgeValue9940;
            regionValue9934 = edgeValue9941;
            break region744;
        }
        }
        if (value47 != 0) {
            edgeValue9953 = regionValue9933;
            edgeValue9954 = regionValue9934;
            regionValue9947 = edgeValue9953;
            regionValue9948 = edgeValue9954;
            break region760;
        } else {
            edgeValue9965 = regionValue9933;
            edgeValue9966 = regionValue9934;
            regionValue9959 = edgeValue9965;
            regionValue9960 = edgeValue9966;
            break region745;
        }
        }
        edgeValue9977 = regionValue9959;
        edgeValue9978 = regionValue9960;
        regionValue9971 = edgeValue9977;
        regionValue9972 = edgeValue9978;
        break region747;
        }
        if (regionValue9972 != 0) {
            break region824;
        } else {
            edgeValue9996 = regionValue9971;
            regionValue9991 = edgeValue9996;
            break region748;
        }
        }
        comparison9997 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison9997 <= 0) {
            regionValue10003 = value47;
            break region826;
        } else {
            edgeValue10021 = regionValue9991;
            regionValue10014 = edgeValue10021;
            break region754;
        }
        }
        edgeValue10035 = regionValue10014;
        regionValue10028 = edgeValue10035;
        break region756;
        }
        if (value47 != 0) {
            break region825;
        } else {
            edgeValue10058 = regionValue10028;
            regionValue10052 = edgeValue10058;
            break region757;
        }
        }
        edgeValue10070 = regionValue10052;
        regionValue10064 = edgeValue10070;
        break region759;
        }
        value10072 = recovery$indy$flow$186(this);
        edgeValue10077 = regionValue10064;
        regionValue9947 = edgeValue10077;
        regionValue9948 = value10072;
        break region760;
        }
        value10079 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingBackSwitchDelay));
        value10080 = recovery$indy$flow$188(value10079, -3628745149736280163L, a0);
        edgeValue10085 = regionValue9947;
        edgeValue10086 = regionValue9948;
        regionValue9919 = edgeValue10085;
        regionValue9920 = edgeValue10086;
        regionValue9921 = value10080;
        break region765;
        }
        comparison10088 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10088 <= 0) {
            edgeValue10100 = regionValue9919;
            edgeValue10101 = regionValue9920;
            edgeValue10102 = regionValue9921;
            regionValue10093 = edgeValue10100;
            regionValue10094 = edgeValue10101;
            regionValue10095 = edgeValue10102;
            break region780;
        } else {
            edgeValue10114 = regionValue9919;
            edgeValue10115 = regionValue9920;
            edgeValue10116 = regionValue9921;
            regionValue10107 = edgeValue10114;
            regionValue10108 = edgeValue10115;
            regionValue10109 = edgeValue10116;
            break region769;
        }
        }
        if (regionValue10108 > regionValue10109) {
            break region824;
        } else {
            edgeValue10130 = regionValue10107;
            regionValue10125 = edgeValue10130;
            break region770;
        }
        }
        edgeValue10140 = regionValue10125;
        regionValue10135 = edgeValue10140;
        break region772;
        }
        value10141 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingOnlyAtSneak));
        value10142 = recovery$indy$flow$190(value10141, -3628393978617010352L, a0);
        edgeValue10147 = regionValue10135;
        edgeValue10148 = (int) ((value10142 ? 1 : 0));
        regionValue10093 = edgeValue10147;
        regionValue10094 = edgeValue10148;
        regionValue10095 = value47;
        break region780;
        }
        if (regionValue10095 != 0) {
            edgeValue10160 = regionValue10093;
            edgeValue10161 = regionValue10094;
            regionValue10154 = edgeValue10160;
            regionValue10155 = edgeValue10161;
            break region803;
        } else {
            edgeValue10172 = regionValue10093;
            edgeValue10173 = regionValue10094;
            regionValue10166 = edgeValue10172;
            regionValue10167 = edgeValue10173;
            break region781;
        }
        }
        if (regionValue10167 == 0) {
            edgeValue10183 = regionValue10166;
            regionValue10178 = edgeValue10183;
            break region799;
        } else {
            edgeValue10193 = regionValue10166;
            regionValue10188 = edgeValue10193;
            break region782;
        }
        }
        value10194 = recovery$indy$flow$191();
        value10195 = recovery$indy$flow$192(value10194, -3626585406982106914L, a0);
        value10196 = ((java.lang.Object)(((net.C_47oo) (((java.lang.Object)(value10195)))).field_44q));
        value10197 = recovery$indy$flow$194(value10196);
        comparison10198 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10198 < 0) {
            edgeValue10209 = (int) ((value10197 ? 1 : 0));
            regionValue10203 = edgeValue10209;
            regionValue10204 = value47;
            break region804;
        } else {
            edgeValue10222 = regionValue10188;
            edgeValue10223 = (int) ((value10197 ? 1 : 0));
            regionValue10215 = edgeValue10222;
            break region793;
        }
        }
        edgeValue10236 = regionValue10215;
        regionValue10229 = edgeValue10236;
        break region795;
        }
        if (value47 != 0) {
            edgeValue10243 = regionValue10229;
            regionValue10154 = edgeValue10243;
            regionValue10155 = edgeValue10223;
            break region803;
        } else {
            edgeValue10255 = regionValue10229;
            regionValue10249 = edgeValue10255;
            break region796;
        }
        }
        edgeValue10267 = regionValue10249;
        regionValue10261 = edgeValue10267;
        break region798;
        }
        if (edgeValue10223 == 0) {
            break region824;
        } else {
            edgeValue10277 = regionValue10261;
            regionValue10178 = edgeValue10277;
            break region799;
        }
        }
        value10278 = recovery$indy$flow$195(this);
        edgeValue10283 = regionValue10178;
        regionValue10154 = edgeValue10283;
        regionValue10155 = value10278;
        break region803;
        }
        edgeValue10289 = regionValue10155;
        edgeValue10290 = regionValue10154;
        regionValue10203 = edgeValue10289;
        regionValue10204 = edgeValue10290;
        break region804;
        }
        comparison10291 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10291 <= 0) {
            edgeValue10303 = regionValue10203;
            edgeValue10304 = regionValue10204;
            regionValue10296 = edgeValue10303;
            regionValue10297 = edgeValue10304;
            regionValue10298 = value47;
            break region822;
        } else {
            edgeValue10317 = regionValue10203;
            edgeValue10318 = regionValue10204;
            regionValue10310 = edgeValue10317;
            regionValue10311 = edgeValue10318;
            break region809;
        }
        }
        if (value47 != 0) {
            edgeValue10330 = regionValue10310;
            edgeValue10331 = regionValue10311;
            regionValue10324 = edgeValue10330;
            regionValue10325 = edgeValue10331;
            break region821;
        } else {
            edgeValue10342 = regionValue10310;
            edgeValue10343 = regionValue10311;
            regionValue10336 = edgeValue10342;
            regionValue10337 = edgeValue10343;
            break region810;
        }
        }
        edgeValue10354 = regionValue10336;
        edgeValue10355 = regionValue10337;
        regionValue10348 = edgeValue10354;
        regionValue10349 = edgeValue10355;
        break region812;
        }
        if (regionValue10349 == 0) {
            edgeValue10365 = regionValue10348;
            regionValue10360 = edgeValue10365;
            break region816;
        } else {
            edgeValue10375 = regionValue10348;
            regionValue10370 = edgeValue10375;
            break region813;
        }
        }
        edgeValue10386 = regionValue10370;
        edgeValue10387 = 0;
        regionValue10380 = edgeValue10386;
        regionValue10381 = edgeValue10387;
        break region823;
        }
        value10388 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingDelayBeforeSwitch));
        value10389 = recovery$indy$flow$197(value10388, -3628745149736280163L, a0);
        edgeValue10394 = regionValue10360;
        regionValue10324 = edgeValue10394;
        regionValue10325 = value10389;
        break region821;
        }
        edgeValue10400 = regionValue10324;
        edgeValue10401 = regionValue10325;
        edgeValue10402 = 1;
        regionValue10296 = edgeValue10400;
        regionValue10297 = edgeValue10401;
        regionValue10298 = edgeValue10402;
        break region822;
        }
        computed10403 = regionValue10297 + regionValue10298;
        edgeValue10408 = regionValue10296;
        regionValue10380 = edgeValue10408;
        regionValue10381 = computed10403;
        break region823;
        }
        if (regionValue10380 >= regionValue10381) {
            break region827;
        } else {
            break region824;
        }
        }
        break region825;
        }
        edgeValue10432 = -1;
        regionValue10003 = edgeValue10432;
        break region826;
        }
        recovery$indy$flow$198(this, regionValue10003);
        break region827;
        }
        value10437 = recovery$indy$flow$199(this);
        comparison10438 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10438 <= 0) {
            regionValue10444 = value47;
            break region838;
        } else {
            break region834;
        }
        }
        if (value47 != 0) {
            regionValue10467 = value10437;
            break region891;
        } else {
            break region835;
        }
        }
        break region837;
        }
        edgeValue10498 = -1;
        regionValue10444 = edgeValue10498;
        break region838;
        }
        comparison10499 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10499 <= 0) {
            edgeValue10511 = regionValue10444;
            regionValue10504 = value10437;
            regionValue10505 = edgeValue10511;
            break region850;
        } else {
            edgeValue10523 = regionValue10444;
            regionValue10517 = edgeValue10523;
            break region842;
        }
        }
        if (value10437 <= regionValue10517) {
            break region887;
        } else {
            break region843;
        }
        }
        break region845;
        }
        value10548 = recovery$indy$flow$200(this);
        regionValue10504 = value10548;
        regionValue10505 = value47;
        break region850;
        }
        comparison10555 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10555 < 0) {
            edgeValue10566 = regionValue10504;
            edgeValue10567 = regionValue10505;
            regionValue10560 = edgeValue10566;
            regionValue10561 = edgeValue10567;
            break region892;
        } else {
            edgeValue10578 = regionValue10504;
            edgeValue10579 = regionValue10505;
            regionValue10572 = edgeValue10578;
            regionValue10573 = edgeValue10579;
            break region854;
        }
        }
        if (regionValue10573 != 0) {
            edgeValue10584 = regionValue10572;
            regionValue10467 = edgeValue10584;
            break region891;
        } else {
            edgeValue10594 = regionValue10572;
            regionValue10589 = edgeValue10594;
            break region855;
        }
        }
        edgeValue10604 = regionValue10589;
        regionValue10599 = edgeValue10604;
        break region857;
        }
        if (regionValue10599 >= 9) {
            break region887;
        } else {
            break region859;
        }
        }
        break region861;
        }
        recovery$indy$flow$201(this, true);
        value10625 = recovery$indy$flow$202(this);
        value10626 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingSilent));
        value10627 = recovery$indy$flow$204(value10626, -3628393978617010352L, a0);
        recovery$indy$flow$205(this, computed38, 8, value10625, value10627, -3626994264649551763L, a0);
        comparison10628 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10628 < 0) {
            break region942;
        } else {
            break region881;
        }
        }
        break region883;
        }
        if (value47 == 0) {
            break region936;
        } else {
            break region885;
        }
        }
        break region887;
        }
        value10659 = recovery$indy$flow$206(this);
        edgeValue10664 = (int) ((value10659 ? 1 : 0));
        regionValue10467 = edgeValue10664;
        break region891;
        }
        edgeValue10669 = regionValue10467;
        regionValue10560 = edgeValue10669;
        regionValue10561 = value47;
        break region892;
        }
        comparison10671 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10671 < 0) {
            edgeValue10678 = regionValue10560;
            edgeValue10679 = regionValue10561;
            regionValue10674 = edgeValue10678;
            regionValue10675 = edgeValue10679;
            break region920;
        } else {
            edgeValue10690 = regionValue10560;
            edgeValue10691 = regionValue10561;
            regionValue10684 = edgeValue10690;
            regionValue10685 = edgeValue10691;
            break region896;
        }
        }
        if (regionValue10685 != 0) {
            edgeValue10699 = regionValue10684;
            regionValue10695 = edgeValue10699;
            break region919;
        } else {
            edgeValue10709 = regionValue10684;
            regionValue10704 = edgeValue10709;
            break region897;
        }
        }
        edgeValue10719 = regionValue10704;
        regionValue10714 = edgeValue10719;
        break region899;
        }
        if (regionValue10714 == 0) {
            break region918;
        } else {
            break region900;
        }
        }
        recovery$indy$flow$207(this, false);
        value10734 = recovery$indy$flow$208(this);
        value10735 = ((java.lang.Object)(((augustus.recovered.modules.player.AutoTool_47Qv) (((java.lang.Object)(this)))).settingSilent));
        value10736 = recovery$indy$flow$210(value10735, -3628393978617010352L, a0);
        recovery$indy$flow$211(this, computed38, 8, value10734, value10736, -3626994264649551763L, a0);
        break region918;
        }
        value10740 = recovery$indy$flow$212();
        regionValue10695 = value10740;
        break region919;
        }
        edgeValue10747 = regionValue10695;
        regionValue10674 = edgeValue10747;
        regionValue10675 = value47;
        break region920;
        }
        comparison10749 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10749 < 0) {
            edgeValue10754 = regionValue10674;
            edgeValue10755 = regionValue10675;
            regionValue10751 = edgeValue10754;
            regionValue10752 = edgeValue10755;
            break region930;
        } else {
            edgeValue10760 = regionValue10674;
            edgeValue10761 = regionValue10675;
            regionValue10757 = edgeValue10760;
            regionValue10758 = edgeValue10761;
            break region924;
        }
        }
        if (regionValue10758 != 0) {
            edgeValue10765 = regionValue10757;
            regionValue10763 = edgeValue10765;
            break region929;
        } else {
            edgeValue10769 = regionValue10757;
            regionValue10767 = edgeValue10769;
            break region925;
        }
        }
        edgeValue10773 = regionValue10767;
        regionValue10771 = edgeValue10773;
        break region927;
        }
        if (regionValue10771 < 0) {
            break region936;
        } else {
            break region928;
        }
        }
        value10777 = recovery$indy$flow$213();
        regionValue10763 = value10777;
        break region929;
        }
        edgeValue10781 = regionValue10763;
        edgeValue10782 = 9;
        regionValue10751 = edgeValue10781;
        regionValue10752 = edgeValue10782;
        break region930;
        }
        if (regionValue10751 >= regionValue10752) {
            break region936;
        } else {
            break region931;
        }
        }
        value10786 = recovery$indy$flow$214();
        recovery$indy$flow$215(this, value10786);
        break region936;
        }
        value10788 = recovery$indy$flow$216(this);
        computed10789 = value10788 + 1;
        recovery$indy$flow$217(this, computed10789);
        break region942;
        }
        return;
    }










   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$45(this, 34, var3, -7098829913764039434L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      boolean var6 = recovery$indy$46(2731027715168678484L, var4);
      Minecraft var10000 = field_43;
      if (var6) {
         if (recovery$indy$47(field_43, 2730379015063212343L, var4) == null) {
            return;
         }

         var10000 = field_43;
      }

      if (recovery$indy$48(var10000, 2730363427155987404L, var4) != null) {
         this.field_42 = -1;
         this.field_438 = 0;
         this.field_43p = 0;
         this.field_43y = 0;
         recovery$indy$49(this.settingDelayBeforeSwitch, 2732276287266901131L, var4);
         recovery$indy$50(this.settingDelayAtItemSwitch, 2732276287266901131L, var4);
         recovery$indy$51(this.settingBackSwitchDelay, 2732276287266901131L, var4);
      }
   }



    public AutoTool_47Qv(long a0) {
        super((java.lang.String) ("AutoTool"),(java.lang.String) ("AutoWerkzeug"),(long) (((augustus.recovered.modules.player.AutoTool_47Qv.a ^ a0) ^ 85746537347862L)),(java.awt.Color) (new java.awt.Color((int) (237),(int) (237),(int) (0))),(client.module.Category) (client.module.Category.PLAYER));
        int constructorPart1 = (int) ((((augustus.recovered.modules.player.AutoTool_47Qv.a ^ a0) ^ 48037195646862L) >>> 32));
        int constructorPart2 = (int) (((((augustus.recovered.modules.player.AutoTool_47Qv.a ^ a0) ^ 48037195646862L) << 32) >>> 48));
        int constructorPart3 = (int) (((((augustus.recovered.modules.player.AutoTool_47Qv.a ^ a0) ^ 48037195646862L) << 48) >>> 48));
        long constructorKey4 = ((augustus.recovered.modules.player.AutoTool_47Qv.a ^ a0) ^ 66902307170061L);
        client.setting.BooleanSetting initialized5 = new client.setting.BooleanSetting(this, constructorKey4, "Tools", true);
        recovery$indy$flow$236(this, initialized5);
        client.setting.BooleanSetting initialized6 = new client.setting.BooleanSetting(this, constructorKey4, "Sword", false);
        recovery$indy$flow$239(this, initialized6);
        short converted7 = (short) (constructorPart2);
        short converted8 = (short) (constructorPart3);
        client.setting.RangeSetting initialized9 = new client.setting.RangeSetting(constructorPart1, this, "DelayBeforeSwitch", 0.0D, 0.0D, converted7, 0.0D, Double.longBitsToDouble(4617315517961601024L), 0, converted8);
        recovery$indy$flow$242(this, initialized9);
        short converted10 = (short) (constructorPart2);
        short converted11 = (short) (constructorPart3);
        client.setting.RangeSetting initialized12 = new client.setting.RangeSetting(constructorPart1, this, "DelayAtItemSwitch", 0.0D, 0.0D, converted10, 0.0D, Double.longBitsToDouble(4617315517961601024L), 0, converted11);
        recovery$indy$flow$245(this, initialized12);
        short converted13 = (short) (constructorPart2);
        short converted14 = (short) (constructorPart3);
        client.setting.RangeSetting initialized15 = new client.setting.RangeSetting(constructorPart1, this, "BackSwitchDelay", Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4613937818241073152L), converted13, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted14);
        recovery$indy$flow$248(this, initialized15);
        client.setting.BooleanSetting initialized16 = new client.setting.BooleanSetting(this, constructorKey4, "OnlyAtSneak", false);
        recovery$indy$flow$251(this, initialized16);
        client.setting.BooleanSetting initialized17 = new client.setting.BooleanSetting(this, constructorKey4, "Silent", true);
        recovery$indy$flow$254(this, initialized17);
        recovery$indy$flow$255(this, 0);
        recovery$indy$flow$256(this, 0);
        recovery$indy$flow$257(this, 0);
        recovery$indy$flow$258(this, 0);
        recovery$indy$flow$259(this, false);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native boolean recovery$indy$flow$77(long a0,long a1);
    private static java.lang.Object recovery$indy$flow$78() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$79(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$80() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$81(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$82(java.lang.Object a0);

    private static native boolean recovery$indy$flow$84(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$85() {
        return net.C_47i.field_47;
    }
    private static java.lang.Object recovery$indy$flow$86() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$87(java.lang.Object a0,long a1,long a2);

    private static int recovery$indy$flow$89(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_437;
    }
    private static native java.lang.Object recovery$indy$flow$90(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$91(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$92() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$93(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$94(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$95() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$96(java.lang.Object a0,long a1,long a2);


    private static int recovery$indy$flow$99(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$100() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$101(java.lang.Object a0,long a1,long a2);

    private static native java.lang.Object recovery$indy$flow$103(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$104(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$105(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$107() {
        return net.C_47Az.BLOCK;
    }
    private static native java.lang.Object recovery$indy$flow$108(java.lang.Object a0);

    private static native boolean recovery$indy$flow$110(java.lang.Object a0,long a1,long a2);
    private static boolean recovery$indy$flow$111() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_45;
    }
    private static java.lang.Object recovery$indy$flow$112() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$113(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$115(java.lang.Object a0);
    private static boolean recovery$indy$flow$116(java.lang.Object a0) {
        return (a0 instanceof net.C_45r);
    }
    private static boolean recovery$indy$flow$117(java.lang.Object a0) {
        return (a0 instanceof net.C_45V);
    }
    private static java.lang.Object recovery$indy$flow$118() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$119(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$120(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$121(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$122(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$123() {
        return net.C_45z.field_46M;
    }
    private static boolean recovery$indy$flow$124(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }
    private static boolean recovery$indy$flow$125(java.lang.Object a0) {
        return (a0 instanceof net.C_45D);
    }
    private static native double recovery$indy$flow$126(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,long a4,long a5);
    private static native double recovery$indy$flow$127(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,long a4,long a5);

    private static native boolean recovery$indy$flow$129(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$130() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$132(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$133() {
        return client.ClientGlobals.field_46;
    }
    private static java.lang.Object recovery$indy$flow$134() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$136(java.lang.Object a0,char a1,int a2,java.lang.Object a3,char a4,long a5,long a6);
    private static java.lang.Object recovery$indy$flow$137() {
        return client.ClientGlobals.field_48;
    }


    private static native double recovery$indy$flow$140(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native double recovery$indy$flow$141(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);

    private static native boolean recovery$indy$flow$143(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$145() {
        return net.C_47Az.ENTITY;
    }
    private static java.lang.Object recovery$indy$flow$146() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$147(java.lang.Object a0,long a1,long a2);

    private static native int recovery$indy$flow$149(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$150() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$151(java.lang.Object a0,long a1,long a2);

    private static boolean recovery$indy$flow$153(java.lang.Object a0) {
        return ((net.C_47UA) (a0)).field_45;
    }
    private static java.lang.Object recovery$indy$flow$154() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$155(java.lang.Object a0,long a1,long a2);


    private static int recovery$indy$flow$158(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$159() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$160(java.lang.Object a0,long a1,long a2);

    private static native java.lang.Object recovery$indy$flow$162(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$163(java.lang.Object a0);
    private static native double recovery$indy$flow$164(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native double recovery$indy$flow$165(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native boolean recovery$indy$flow$166(int a0,long a1,long a2,long a3);
    private static void recovery$indy$flow$167(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43p = a1;
        return;
    }

    private static native double recovery$indy$flow$169(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$170(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43p;
    }
    private static void recovery$indy$flow$171(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43p = a1;
        return;
    }
    private static int recovery$indy$flow$172(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_42;
    }
    private static int recovery$indy$flow$173(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_42;
    }
    private static int recovery$indy$flow$174(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43y;
    }

    private static native int recovery$indy$flow$176(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$177(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43y;
    }
    private static void recovery$indy$flow$178(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43y = a1;
        return;
    }
    private static int recovery$indy$flow$179(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43y;
    }

    private static native double recovery$indy$flow$181(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$182(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$183(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_42 = a1;
        return;
    }
    private static native void recovery$indy$flow$184(java.lang.Object a0,short a1,short a2,int a3,long a4,long a5);
    private static native boolean recovery$indy$flow$185(long a0,long a1,long a2);
    private static int recovery$indy$flow$186(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_438;
    }

    private static native int recovery$indy$flow$188(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$190(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$191() {
        return augustus.recovered.modules.player.AutoTool_47Qv.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$192(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$194(java.lang.Object a0);
    private static int recovery$indy$flow$195(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43p;
    }

    private static native int recovery$indy$flow$197(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$198(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_42 = a1;
        return;
    }
    private static int recovery$indy$flow$199(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_42;
    }
    private static int recovery$indy$flow$200(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_42;
    }
    private static void recovery$indy$flow$201(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43a = a1;
        return;
    }
    private static int recovery$indy$flow$202(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_42;
    }

    private static native boolean recovery$indy$flow$204(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$205(java.lang.Object a0,long a1,int a2,int a3,boolean a4,long a5,long a6);
    private static boolean recovery$indy$flow$206(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43a;
    }
    private static void recovery$indy$flow$207(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43a = a1;
        return;
    }
    private static int recovery$indy$flow$208(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_437;
    }

    private static native boolean recovery$indy$flow$210(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$211(java.lang.Object a0,long a1,int a2,int a3,boolean a4,long a5,long a6);
    private static int recovery$indy$flow$212() {
        return net.C_47i.field_40;
    }
    private static int recovery$indy$flow$213() {
        return net.C_47i.field_40;
    }
    private static int recovery$indy$flow$214() {
        return net.C_47i.field_40;
    }
    private static void recovery$indy$flow$215(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_437 = a1;
        return;
    }
    private static int recovery$indy$flow$216(java.lang.Object a0) {
        return ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_438;
    }
    private static void recovery$indy$flow$217(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_438 = a1;
        return;
    }
    private static native void recovery$indy$flow$236(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$239(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$242(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$245(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$248(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$251(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$254(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$255(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$256(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$257(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$258(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$259(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.AutoTool_47Qv) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(long var0, long var2);
   private static native WorldClient recovery$indy$3(Object var0, long var1, long var3);
   private static native boolean recovery$indy$4(long var0, long var2);
   private static native double recovery$indy$5(Object var0, long var1, long var3);
   private static native void recovery$indy$45(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$46(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$47(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$48(Object var0, long var1, long var3);
   private static native double recovery$indy$49(Object var0, long var1, long var3);
   private static native double recovery$indy$50(Object var0, long var1, long var3);
   private static native double recovery$indy$51(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$52();
}
