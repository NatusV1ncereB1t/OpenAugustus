package augustus.recovered.modules.movement;
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
import client.Client;
import net.C_40X;
import net.C_41Q;
import net.C_45n;
import net.C_472n;
import net.C_475y;
import net.C_478Q;
import net.C_479J;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47K7;
import net.C_47Kk;
import client.module.Module;
import net.C_47Rw;
import net.C_47S7;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47Vc;
import net.C_47cu;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.minecraft.client.Minecraft;
import net.C_47od;
import net.C_47oo;
import client.module.Category;
import net.C_47tf;
import net.C_47xz;
import net.C_484;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Step_47Qe extends client.module.Module implements net.C_47xz,net.C_47od,net.C_47Vc,net.C_41Q,net.C_47Kk,net.C_47hi {
    public client.setting.ModeSetting settingModes; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingHeight = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTimer = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSlowDown = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_41 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47cu field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_430; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_43F; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native void b();

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    public void method_498$e45a9973e5(long a0) {
        long constructorKey1 = a0;
        java.lang.Object regionValue24;
        long regionValue25;
        long regionValue26;
        java.lang.Object regionValue27;
        int regionValue28;
        int regionValue29;
        java.lang.Object regionValue36;
        long regionValue37;
        long regionValue38;
        java.lang.Object regionValue39;
        java.lang.Object regionValue40;
        int regionValue41;
        int regionValue42;
        int regionValue43;
        java.lang.Object regionValue52;
        long regionValue53;
        long regionValue54;
        java.lang.Object regionValue55;
        java.lang.Object regionValue56;
        int regionValue57;
        int regionValue58;
        java.lang.Object regionValue66;
        long regionValue67;
        long regionValue68;
        java.lang.Object regionValue69;
        java.lang.Object regionValue70;
        int regionValue71;
        int regionValue72;
        java.lang.Object regionValue80;
        long regionValue81;
        long regionValue82;
        java.lang.Object regionValue83;
        java.lang.Object regionValue84;
        int regionValue85;
        int regionValue86;
        java.lang.Object regionValue94;
        long regionValue95;
        long regionValue96;
        java.lang.Object regionValue97;
        java.lang.Object regionValue98;
        int regionValue99;
        int regionValue100;
        java.lang.Object regionValue108;
        long regionValue109;
        long regionValue110;
        java.lang.Object regionValue111;
        int regionValue112;
        int regionValue113;
        java.lang.Object regionValue129;
        long regionValue130;
        long regionValue131;
        java.lang.Object regionValue132;
        java.lang.Object regionValue133;
        int regionValue134;
        int regionValue135;
        int regionValue136;
        java.lang.Object regionValue145;
        long regionValue146;
        long regionValue147;
        java.lang.Object regionValue148;
        java.lang.Object regionValue149;
        int regionValue150;
        int regionValue151;
        int regionValue152;
        java.lang.Object regionValue167;
        long regionValue168;
        long regionValue169;
        java.lang.Object regionValue170;
        java.lang.Object regionValue171;
        int regionValue172;
        java.lang.Object regionValue179;
        long regionValue180;
        long regionValue181;
        java.lang.Object regionValue182;
        java.lang.Object regionValue183;
        int regionValue184;
        java.lang.Object regionValue193;
        long regionValue194;
        long regionValue195;
        java.lang.Object regionValue196;
        java.lang.Object regionValue197;
        int regionValue198;
        int regionValue199;
        int regionValue200;
        java.lang.Object regionValue209;
        long regionValue210;
        long regionValue211;
        java.lang.Object regionValue212;
        java.lang.Object regionValue213;
        int regionValue214;
        int regionValue215;
        int regionValue216;
        java.lang.Object regionValue231;
        long regionValue232;
        long regionValue233;
        java.lang.Object regionValue234;
        java.lang.Object regionValue235;
        int regionValue236;
        int regionValue237;
        java.lang.Object regionValue269;
        long regionValue270;
        long regionValue271;
        java.lang.Object regionValue272;
        java.lang.Object regionValue273;
        int regionValue274;
        int regionValue275;
        int regionValue276;
        java.lang.Object regionValue291;
        long regionValue292;
        long regionValue293;
        java.lang.Object regionValue294;
        java.lang.Object regionValue295;
        int regionValue296;
        java.lang.Object regionValue303;
        long regionValue304;
        long regionValue305;
        java.lang.Object regionValue306;
        java.lang.Object regionValue307;
        int regionValue308;
        java.lang.Object regionValue317;
        long regionValue318;
        long regionValue319;
        java.lang.Object regionValue320;
        java.lang.Object regionValue321;
        int regionValue322;
        int regionValue323;
        int regionValue324;
        java.lang.Object regionValue333;
        long regionValue334;
        long regionValue335;
        java.lang.Object regionValue336;
        java.lang.Object regionValue337;
        int regionValue338;
        int regionValue339;
        int regionValue340;
        java.lang.Object regionValue355;
        long regionValue356;
        long regionValue357;
        java.lang.Object regionValue358;
        java.lang.Object regionValue359;
        int regionValue360;
        int regionValue361;
        java.lang.Object regionValue393;
        long regionValue394;
        long regionValue395;
        java.lang.Object regionValue396;
        java.lang.Object regionValue397;
        int regionValue398;
        int regionValue399;
        int regionValue400;
        java.lang.Object regionValue415;
        long regionValue416;
        long regionValue417;
        java.lang.Object regionValue418;
        java.lang.Object regionValue419;
        int regionValue420;
        java.lang.Object regionValue427;
        long regionValue428;
        long regionValue429;
        java.lang.Object regionValue430;
        java.lang.Object regionValue431;
        int regionValue432;
        java.lang.Object regionValue441;
        long regionValue442;
        long regionValue443;
        java.lang.Object regionValue444;
        int regionValue445;
        int regionValue446;
        int regionValue447;
        java.lang.Object regionValue455;
        long regionValue456;
        long regionValue457;
        java.lang.Object regionValue458;
        java.lang.Object regionValue459;
        int regionValue460;
        int regionValue461;
        int regionValue462;
        java.lang.Object regionValue477;
        long regionValue478;
        long regionValue479;
        java.lang.Object regionValue480;
        java.lang.Object regionValue481;
        int regionValue482;
        int regionValue483;
        java.lang.Object regionValue509;
        long regionValue510;
        long regionValue511;
        java.lang.Object regionValue512;
        int regionValue513;
        int regionValue514;
        int regionValue515;
        java.lang.Object regionValue523;
        long regionValue524;
        long regionValue525;
        java.lang.Object regionValue526;
        int regionValue527;
        int regionValue528;
        int regionValue529;
        int regionValue530;
        java.lang.Object regionValue545;
        long regionValue546;
        long regionValue547;
        java.lang.Object regionValue548;
        int regionValue549;
        int regionValue550;
        int regionValue551;
        java.lang.Object regionValue559;
        long regionValue560;
        long regionValue561;
        java.lang.Object regionValue562;
        int regionValue563;
        int regionValue564;
        int regionValue565;
        java.lang.Object regionValue579;
        long regionValue580;
        long regionValue581;
        java.lang.Object regionValue582;
        int regionValue583;
        java.lang.Object regionValue610;
        long regionValue611;
        long regionValue612;
        java.lang.Object regionValue613;
        int regionValue614;
        int regionValue615;
        int regionValue616;
        java.lang.Object regionValue624;
        long regionValue625;
        long regionValue626;
        java.lang.Object regionValue627;
        int regionValue628;
        int regionValue629;
        int regionValue630;
        java.lang.Object regionValue638;
        long regionValue639;
        long regionValue640;
        java.lang.Object regionValue641;
        int regionValue642;
        int regionValue643;
        java.lang.Object regionValue650;
        long regionValue651;
        long regionValue652;
        java.lang.Object regionValue653;
        int regionValue654;
        int regionValue655;
        java.lang.Object regionValue662;
        long regionValue663;
        long regionValue664;
        java.lang.Object regionValue665;
        int regionValue666;
        int regionValue667;
        java.lang.Object regionValue674;
        long regionValue675;
        long regionValue676;
        java.lang.Object regionValue677;
        int regionValue678;
        java.lang.Object regionValue684;
        long regionValue685;
        long regionValue686;
        java.lang.Object regionValue687;
        int regionValue688;
        java.lang.Object regionValue694;
        long regionValue695;
        java.lang.Object regionValue696;
        int regionValue697;
        java.lang.Object regionValue702;
        long regionValue703;
        java.lang.Object regionValue704;
        int regionValue705;
        java.lang.Object regionValue731;
        long regionValue732;
        long regionValue733;
        java.lang.Object regionValue734;
        int regionValue735;
        int regionValue736;
        int regionValue737;
        java.lang.Object regionValue745;
        long regionValue746;
        long regionValue747;
        java.lang.Object regionValue748;
        int regionValue749;
        int regionValue750;
        int regionValue751;
        java.lang.Object regionValue759;
        long regionValue760;
        long regionValue761;
        java.lang.Object regionValue762;
        int regionValue763;
        int regionValue764;
        java.lang.Object regionValue771;
        long regionValue772;
        long regionValue773;
        java.lang.Object regionValue774;
        int regionValue775;
        int regionValue776;
        java.lang.Object regionValue783;
        long regionValue784;
        long regionValue785;
        java.lang.Object regionValue786;
        int regionValue787;
        int regionValue788;
        java.lang.Object regionValue795;
        long regionValue796;
        long regionValue797;
        java.lang.Object regionValue798;
        int regionValue799;
        java.lang.Object regionValue819;
        long regionValue820;
        long regionValue821;
        java.lang.Object regionValue822;
        int regionValue823;
        int regionValue824;
        java.lang.Object regionValue831;
        long regionValue832;
        long regionValue833;
        java.lang.Object regionValue834;
        int regionValue835;
        int regionValue836;
        java.lang.Object regionValue843;
        long regionValue844;
        long regionValue845;
        java.lang.Object regionValue846;
        int regionValue847;
        java.lang.Object regionValue854;
        long regionValue855;
        long regionValue856;
        java.lang.Object regionValue857;
        int regionValue858;
        java.lang.Object regionValue859;
        int regionValue860;
        java.lang.Object regionValue868;
        long regionValue869;
        long regionValue870;
        java.lang.Object regionValue871;
        int regionValue872;
        java.lang.Object regionValue873;
        int regionValue874;
        java.lang.Object regionValue882;
        long regionValue883;
        long regionValue884;
        java.lang.Object regionValue885;
        int regionValue886;
        java.lang.Object regionValue887;
        int regionValue888;
        java.lang.Object regionValue896;
        long regionValue897;
        long regionValue898;
        java.lang.Object regionValue899;
        int regionValue900;
        java.lang.Object regionValue901;
        java.lang.Object regionValue908;
        long regionValue909;
        long regionValue910;
        java.lang.Object regionValue911;
        int regionValue912;
        java.lang.Object regionValue913;
        java.lang.Object regionValue920;
        long regionValue921;
        long regionValue922;
        java.lang.Object regionValue923;
        int regionValue924;
        java.lang.Object regionValue925;
        java.lang.Object regionValue941;
        long regionValue942;
        long regionValue943;
        java.lang.Object regionValue944;
        int regionValue945;
        java.lang.Object regionValue970;
        long regionValue971;
        long regionValue972;
        java.lang.Object regionValue973;
        int regionValue974;
        int regionValue975;
        java.lang.Object regionValue982;
        long regionValue983;
        long regionValue984;
        java.lang.Object regionValue985;
        int regionValue986;
        int regionValue987;
        java.lang.Object regionValue994;
        long regionValue995;
        long regionValue996;
        java.lang.Object regionValue997;
        int regionValue998;
        java.lang.Object regionValue1022;
        long regionValue1023;
        long regionValue1024;
        java.lang.Object regionValue1025;
        int regionValue1026;
        int regionValue1027;
        java.lang.Object regionValue1034;
        long regionValue1035;
        long regionValue1036;
        java.lang.Object regionValue1037;
        int regionValue1038;
        int regionValue1039;
        java.lang.Object regionValue1046;
        long regionValue1047;
        long regionValue1048;
        java.lang.Object regionValue1049;
        int regionValue1050;
        java.lang.Object regionValue1056;
        long regionValue1057;
        long regionValue1058;
        java.lang.Object regionValue1059;
        int regionValue1060;
        java.lang.Object regionValue1073;
        long regionValue1074;
        long regionValue1075;
        java.lang.Object regionValue1076;
        int regionValue1077;
        java.lang.Object regionValue1093;
        long regionValue1094;
        long regionValue1095;
        java.lang.Object regionValue1096;
        int regionValue1097;
        double regionValue1098;
        int regionValue1099;
        int regionValue1100;
        int regionValue1101;
        java.lang.Object regionValue1111;
        long regionValue1112;
        long regionValue1113;
        java.lang.Object regionValue1114;
        int regionValue1115;
        double regionValue1116;
        int regionValue1117;
        int regionValue1118;
        int regionValue1119;
        java.lang.Object regionValue1129;
        long regionValue1130;
        long regionValue1131;
        java.lang.Object regionValue1132;
        int regionValue1133;
        double regionValue1134;
        int regionValue1135;
        int regionValue1136;
        java.lang.Object regionValue1145;
        long regionValue1146;
        long regionValue1147;
        java.lang.Object regionValue1148;
        int regionValue1149;
        double regionValue1150;
        int regionValue1151;
        int regionValue1152;
        java.lang.Object regionValue1161;
        long regionValue1162;
        long regionValue1163;
        java.lang.Object regionValue1164;
        int regionValue1165;
        double regionValue1166;
        int regionValue1167;
        int regionValue1168;
        java.lang.Object regionValue1177;
        long regionValue1178;
        long regionValue1179;
        java.lang.Object regionValue1180;
        int regionValue1181;
        double regionValue1182;
        int regionValue1183;
        java.lang.Object regionValue1191;
        long regionValue1192;
        long regionValue1193;
        java.lang.Object regionValue1194;
        int regionValue1195;
        double regionValue1196;
        java.lang.Object regionValue1220;
        long regionValue1221;
        long regionValue1222;
        java.lang.Object regionValue1223;
        int regionValue1224;
        double regionValue1225;
        int regionValue1226;
        java.lang.Object regionValue1260;
        long regionValue1261;
        long regionValue1262;
        java.lang.Object regionValue1263;
        int regionValue1264;
        double regionValue1265;
        int regionValue1266;
        int regionValue1267;
        int regionValue1268;
        java.lang.Object regionValue1278;
        long regionValue1279;
        long regionValue1280;
        java.lang.Object regionValue1281;
        int regionValue1282;
        double regionValue1283;
        int regionValue1284;
        int regionValue1285;
        int regionValue1286;
        java.lang.Object regionValue1296;
        long regionValue1297;
        long regionValue1298;
        java.lang.Object regionValue1299;
        int regionValue1300;
        double regionValue1301;
        int regionValue1302;
        int regionValue1303;
        java.lang.Object regionValue1312;
        long regionValue1313;
        long regionValue1314;
        java.lang.Object regionValue1315;
        int regionValue1316;
        double regionValue1317;
        int regionValue1318;
        int regionValue1319;
        java.lang.Object regionValue1328;
        long regionValue1329;
        long regionValue1330;
        java.lang.Object regionValue1331;
        int regionValue1332;
        double regionValue1333;
        int regionValue1334;
        int regionValue1335;
        java.lang.Object regionValue1344;
        long regionValue1345;
        long regionValue1346;
        java.lang.Object regionValue1347;
        int regionValue1348;
        double regionValue1349;
        int regionValue1350;
        java.lang.Object regionValue1358;
        long regionValue1359;
        long regionValue1360;
        java.lang.Object regionValue1361;
        int regionValue1362;
        double regionValue1363;
        int regionValue1364;
        java.lang.Object regionValue1387;
        long regionValue1388;
        long regionValue1389;
        java.lang.Object regionValue1390;
        int regionValue1391;
        double regionValue1392;
        int regionValue1393;
        java.lang.Object regionValue1427;
        long regionValue1428;
        long regionValue1429;
        java.lang.Object regionValue1430;
        int regionValue1431;
        double regionValue1432;
        int regionValue1433;
        int regionValue1434;
        int regionValue1435;
        java.lang.Object regionValue1445;
        long regionValue1446;
        long regionValue1447;
        java.lang.Object regionValue1448;
        int regionValue1449;
        double regionValue1450;
        int regionValue1451;
        int regionValue1452;
        int regionValue1453;
        java.lang.Object regionValue1463;
        long regionValue1464;
        long regionValue1465;
        java.lang.Object regionValue1466;
        int regionValue1467;
        double regionValue1468;
        int regionValue1469;
        int regionValue1470;
        java.lang.Object regionValue1479;
        long regionValue1480;
        long regionValue1481;
        java.lang.Object regionValue1482;
        int regionValue1483;
        double regionValue1484;
        int regionValue1485;
        int regionValue1486;
        java.lang.Object regionValue1495;
        long regionValue1496;
        long regionValue1497;
        java.lang.Object regionValue1498;
        int regionValue1499;
        double regionValue1500;
        int regionValue1501;
        int regionValue1502;
        java.lang.Object regionValue1511;
        long regionValue1512;
        long regionValue1513;
        java.lang.Object regionValue1514;
        int regionValue1515;
        double regionValue1516;
        int regionValue1517;
        java.lang.Object regionValue1525;
        long regionValue1526;
        long regionValue1527;
        java.lang.Object regionValue1528;
        int regionValue1529;
        double regionValue1530;
        int regionValue1531;
        java.lang.Object regionValue1554;
        long regionValue1555;
        long regionValue1556;
        java.lang.Object regionValue1557;
        int regionValue1558;
        double regionValue1559;
        int regionValue1560;
        java.lang.Object regionValue1594;
        long regionValue1595;
        long regionValue1596;
        java.lang.Object regionValue1597;
        int regionValue1598;
        double regionValue1599;
        int regionValue1600;
        int regionValue1601;
        int regionValue1602;
        java.lang.Object regionValue1612;
        long regionValue1613;
        long regionValue1614;
        java.lang.Object regionValue1615;
        int regionValue1616;
        double regionValue1617;
        int regionValue1618;
        int regionValue1619;
        int regionValue1620;
        java.lang.Object regionValue1630;
        long regionValue1631;
        long regionValue1632;
        java.lang.Object regionValue1633;
        int regionValue1634;
        double regionValue1635;
        int regionValue1636;
        int regionValue1637;
        java.lang.Object regionValue1646;
        long regionValue1647;
        long regionValue1648;
        java.lang.Object regionValue1649;
        int regionValue1650;
        double regionValue1651;
        int regionValue1652;
        int regionValue1653;
        java.lang.Object regionValue1662;
        long regionValue1663;
        long regionValue1664;
        java.lang.Object regionValue1665;
        int regionValue1666;
        double regionValue1667;
        int regionValue1668;
        int regionValue1669;
        java.lang.Object regionValue1678;
        long regionValue1679;
        long regionValue1680;
        java.lang.Object regionValue1681;
        int regionValue1682;
        double regionValue1683;
        int regionValue1684;
        java.lang.Object regionValue1692;
        long regionValue1693;
        long regionValue1694;
        java.lang.Object regionValue1695;
        int regionValue1696;
        double regionValue1697;
        java.lang.Object regionValue1754;
        long regionValue1755;
        long regionValue1756;
        java.lang.Object regionValue1757;
        int regionValue1758;
        double regionValue1759;
        int regionValue1760;
        int regionValue1761;
        int regionValue1762;
        java.lang.Object regionValue1772;
        long regionValue1773;
        long regionValue1774;
        java.lang.Object regionValue1775;
        int regionValue1776;
        double regionValue1777;
        int regionValue1778;
        int regionValue1779;
        int regionValue1780;
        java.lang.Object regionValue1790;
        long regionValue1791;
        long regionValue1792;
        java.lang.Object regionValue1793;
        int regionValue1794;
        double regionValue1795;
        int regionValue1796;
        int regionValue1797;
        java.lang.Object regionValue1806;
        long regionValue1807;
        long regionValue1808;
        java.lang.Object regionValue1809;
        int regionValue1810;
        double regionValue1811;
        int regionValue1812;
        int regionValue1813;
        java.lang.Object regionValue1822;
        long regionValue1823;
        long regionValue1824;
        java.lang.Object regionValue1825;
        int regionValue1826;
        double regionValue1827;
        int regionValue1828;
        int regionValue1829;
        java.lang.Object regionValue1838;
        long regionValue1839;
        long regionValue1840;
        java.lang.Object regionValue1841;
        int regionValue1842;
        double regionValue1843;
        int regionValue1844;
        java.lang.Object regionValue1852;
        long regionValue1853;
        long regionValue1854;
        java.lang.Object regionValue1855;
        int regionValue1856;
        double regionValue1857;
        java.lang.Object regionValue1922;
        long regionValue1923;
        long regionValue1924;
        java.lang.Object regionValue1925;
        int regionValue1926;
        double regionValue1927;
        int regionValue1928;
        int regionValue1929;
        int regionValue1930;
        java.lang.Object regionValue1940;
        long regionValue1941;
        long regionValue1942;
        java.lang.Object regionValue1943;
        int regionValue1944;
        double regionValue1945;
        int regionValue1946;
        int regionValue1947;
        int regionValue1948;
        java.lang.Object regionValue1958;
        long regionValue1959;
        long regionValue1960;
        java.lang.Object regionValue1961;
        int regionValue1962;
        double regionValue1963;
        int regionValue1964;
        int regionValue1965;
        java.lang.Object regionValue1974;
        long regionValue1975;
        long regionValue1976;
        java.lang.Object regionValue1977;
        int regionValue1978;
        double regionValue1979;
        int regionValue1980;
        int regionValue1981;
        java.lang.Object regionValue1990;
        long regionValue1991;
        long regionValue1992;
        java.lang.Object regionValue1993;
        int regionValue1994;
        double regionValue1995;
        int regionValue1996;
        int regionValue1997;
        java.lang.Object regionValue2006;
        long regionValue2007;
        long regionValue2008;
        java.lang.Object regionValue2009;
        int regionValue2010;
        double regionValue2011;
        int regionValue2012;
        java.lang.Object regionValue2020;
        long regionValue2021;
        long regionValue2022;
        java.lang.Object regionValue2023;
        int regionValue2024;
        double regionValue2025;
        java.lang.Object regionValue2113;
        long regionValue2114;
        long regionValue2115;
        java.lang.Object regionValue2116;
        int regionValue2117;
        double regionValue2118;
        int regionValue2119;
        int regionValue2120;
        java.lang.Object regionValue2129;
        long regionValue2130;
        long regionValue2131;
        java.lang.Object regionValue2132;
        int regionValue2133;
        double regionValue2134;
        int regionValue2135;
        int regionValue2136;
        java.lang.Object regionValue2152;
        long regionValue2153;
        long regionValue2154;
        java.lang.Object regionValue2155;
        int regionValue2156;
        double regionValue2157;
        java.lang.Object regionValue2247;
        long regionValue2248;
        java.lang.Object regionValue2249;
        int regionValue2250;
        java.lang.Object regionValue2255;
        long regionValue2256;
        long regionValue2257;
        java.lang.Object regionValue2258;
        int regionValue2259;
        double regionValue2260;
        int regionValue2261;
        java.lang.Object regionValue2271;
        long regionValue2272;
        java.lang.Object regionValue2273;
        int regionValue2274;
        java.lang.Object regionValue2275;
        double regionValue2276;
        double regionValue2277;
        java.lang.Object regionValue2285;
        long regionValue2286;
        long regionValue2287;
        java.lang.Object regionValue2288;
        int regionValue2289;
        int regionValue2290;
        java.lang.Object regionValue2291;
        double regionValue2292;
        double regionValue2293;
        java.lang.Object regionValue2303;
        long regionValue2304;
        long regionValue2305;
        java.lang.Object regionValue2306;
        int regionValue2307;
        int regionValue2308;
        java.lang.Object regionValue2309;
        double regionValue2310;
        double regionValue2311;
        java.lang.Object regionValue2322;
        long regionValue2323;
        long regionValue2324;
        java.lang.Object regionValue2325;
        int regionValue2326;
        int regionValue2327;
        java.lang.Object regionValue2328;
        java.lang.Object regionValue2336;
        long regionValue2337;
        long regionValue2338;
        java.lang.Object regionValue2339;
        int regionValue2340;
        java.lang.Object regionValue2341;
        java.lang.Object regionValue2348;
        long regionValue2349;
        long regionValue2350;
        java.lang.Object regionValue2351;
        int regionValue2352;
        java.lang.Object regionValue2353;
        java.lang.Object regionValue2362;
        long regionValue2363;
        java.lang.Object regionValue2364;
        int regionValue2365;
        java.lang.Object regionValue2366;
        double regionValue2367;
        java.lang.Object regionValue2399;
        long regionValue2400;
        java.lang.Object regionValue2401;
        int regionValue2402;
        int regionValue2403;
        java.lang.Object regionValue2409;
        long regionValue2410;
        java.lang.Object regionValue2411;
        int regionValue2412;
        int regionValue2413;
        java.lang.Object regionValue2419;
        long regionValue2420;
        java.lang.Object regionValue2421;
        int regionValue2422;
        java.lang.Object regionValue2441;
        long regionValue2442;
        java.lang.Object regionValue2443;
        int regionValue2444;
        int regionValue2445;
        java.lang.Object regionValue2451;
        long regionValue2452;
        java.lang.Object regionValue2453;
        int regionValue2454;
        int regionValue2455;
        java.lang.Object regionValue2461;
        long regionValue2462;
        java.lang.Object regionValue2463;
        int regionValue2464;
        java.lang.Object regionValue2469;
        long regionValue2470;
        java.lang.Object regionValue2471;
        int regionValue2472;
        java.lang.Object regionValue2479;
        long regionValue2480;
        java.lang.Object regionValue2481;
        int regionValue2482;
        java.lang.Object regionValue2483;
        java.lang.Object regionValue2489;
        long regionValue2490;
        java.lang.Object regionValue2491;
        int regionValue2492;
        java.lang.Object regionValue2493;
        java.lang.Object regionValue2499;
        long regionValue2500;
        java.lang.Object regionValue2501;
        int regionValue2502;
        java.lang.Object regionValue2503;
        java.lang.Object regionValue2519;
        long regionValue2520;
        java.lang.Object regionValue2521;
        int regionValue2522;
        java.lang.Object regionValue2549;
        long regionValue2550;
        java.lang.Object regionValue2551;
        int regionValue2552;
        int regionValue2553;
        java.lang.Object regionValue2559;
        long regionValue2560;
        java.lang.Object regionValue2561;
        int regionValue2562;
        int regionValue2563;
        java.lang.Object regionValue2569;
        long regionValue2570;
        java.lang.Object regionValue2571;
        int regionValue2572;
        java.lang.Object regionValue2591;
        long regionValue2592;
        int regionValue2593;
        java.lang.Object regionValue2597;
        long regionValue2598;
        java.lang.Object regionValue2599;
        int regionValue2600;
        int regionValue2601;
        java.lang.Object regionValue2607;
        long regionValue2608;
        java.lang.Object regionValue2609;
        int regionValue2610;
        java.lang.Object regionValue2615;
        long regionValue2616;
        java.lang.Object regionValue2617;
        int regionValue2618;
        java.lang.Object regionValue2625;
        long regionValue2626;
        java.lang.Object regionValue2627;
        java.lang.Object regionValue2631;
        long regionValue2632;
        java.lang.Object regionValue2633;
        java.lang.Object regionValue2634;
        java.lang.Object regionValue2639;
        long regionValue2640;
        java.lang.Object regionValue2641;
        java.lang.Object regionValue2642;
        java.lang.Object regionValue2655;
        long regionValue2656;
        region998: {
        region969: {
        region959: {
        region958: {
        region957: {
        region948: {
        region946: {
        region940: {
        region938: {
        region937: {
        region935: {
        region925: {
        region923: {
        region922: {
        region891: {
        region881: {
        region880: {
        region879: {
        region870: {
        region868: {
        region862: {
        region860: {
        region859: {
        region857: {
        region847: {
        region845: {
        region844: {
        region839: {
        region832: {
        region831: {
        region821: {
        region813: {
        region811: {
        region809: {
        region807: {
        region799: {
        region798: {
        region790: {
        region644: {
        region643: {
        region642: {
        region641: {
        region636: {
        region524: {
        region523: {
        region521: {
        region520: {
        region516: {
        region515: {
        region510: {
        region452: {
        region451: {
        region449: {
        region448: {
        region444: {
        region443: {
        region438: {
        region398: {
        region397: {
        region395: {
        region394: {
        region390: {
        region389: {
        region384: {
        region382: {
        region362: {
        region361: {
        region359: {
        region358: {
        region354: {
        region353: {
        region348: {
        region346: {
        region326: {
        region325: {
        region323: {
        region322: {
        region318: {
        region317: {
        region312: {
        region272: {
        region271: {
        region269: {
        region268: {
        region248: {
        region247: {
        region243: {
        region241: {
        region240: {
        region238: {
        region225: {
        region223: {
        region222: {
        region216: {
        region215: {
        region200: {
        region199: {
        region190: {
        region188: {
        region187: {
        region185: {
        region179: {
        region178: {
        region177: {
        region176: {
        region172: {
        region171: {
        region169: {
        region168: {
        region164: {
        region163: {
        region150: {
        region149: {
        region147: {
        region146: {
        region142: {
        region141: {
        region140: {
        region138: {
        region137: {
        region135: {
        region134: {
        region129: {
        region120: {
        region118: {
        region117: {
        region110: {
        region108: {
        region107: {
        region105: {
        region96: {
        region94: {
        region93: {
        region86: {
        region84: {
        region83: {
        region81: {
        region72: {
        region70: {
        region69: {
        region62: {
        region60: {
        region59: {
        region57: {
        region48: {
        region46: {
        long computed2 = constructorKey1 ^ 34163035126128L;
        long initialValue3 = computed2;
        long computed4 = constructorKey1 ^ 38994105217278L;
        long initialValue5 = computed4;
        java.lang.Object initialValue6 = recovery$indy$flow$1();
        java.lang.Object initialValue7 = recovery$indy$flow$2(initialValue6, -790899366604326709L, constructorKey1);
        double initialValue8 = recovery$indy$flow$3(initialValue7);
        java.lang.Object initialValue9 = recovery$indy$flow$4();
        java.lang.Object initialValue10 = recovery$indy$flow$5(initialValue9, -790899366604326709L, constructorKey1);
        double initialValue11 = recovery$indy$flow$6(initialValue10);
        java.lang.Object initialValue12 = recovery$indy$flow$7();
        java.lang.Object initialValue13 = recovery$indy$flow$8(initialValue12, -790899366604326709L, constructorKey1);
        double initialValue14 = recovery$indy$flow$9(initialValue13);
        net.C_47tf initialized15 = new net.C_47tf(initialValue8, initialValue11, initialValue14);
        net.C_47tf initialValue16 = initialized15;
        boolean initialValue17 = recovery$indy$flow$11(-792496616404702529L, constructorKey1);
        java.lang.Object initialValue18 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(this)))).settingModes));
        java.lang.Object initialValue19 = recovery$indy$flow$13(initialValue18, initialValue5, -791425841999331176L, constructorKey1);
        java.lang.Object initialValue20 = initialValue19;
        int initialValue21 = -1;
        int initialValue22 = (int) ((initialValue17 ? 1 : 0));
        int initialValue23 = recovery$indy$flow$14(initialValue20);
        if (initialValue22 == 0) {
            java.lang.Object regionNext30 = this;
            long regionNext31 = constructorKey1;
            long regionNext32 = initialValue3;
            java.lang.Object regionNext33 = initialValue16;
            int regionNext34 = initialValue22;
            int regionNext35 = initialValue23;
            regionValue24 = regionNext30;
            regionValue25 = regionNext31;
            regionValue26 = regionNext32;
            regionValue27 = regionNext33;
            regionValue28 = regionNext34;
            regionValue29 = regionNext35;
            break region141;
        } else {
            java.lang.Object regionNext44 = this;
            long regionNext45 = constructorKey1;
            long regionNext46 = initialValue3;
            java.lang.Object regionNext47 = initialValue16;
            java.lang.Object regionNext48 = initialValue20;
            int regionNext49 = initialValue21;
            int regionNext50 = initialValue22;
            int regionNext51 = initialValue23;
            regionValue36 = regionNext44;
            regionValue37 = regionNext45;
            regionValue38 = regionNext46;
            regionValue39 = regionNext47;
            regionValue40 = regionNext48;
            regionValue41 = regionNext49;
            regionValue42 = regionNext50;
            regionValue43 = regionNext51;
            break region46;
        }
        }
        switch (regionValue43) {
            case -1721492669: {
                java.lang.Object regionNext59 = regionValue36;
                long regionNext60 = regionValue37;
                long regionNext61 = regionValue38;
                java.lang.Object regionNext62 = regionValue39;
                java.lang.Object regionNext63 = regionValue40;
                int regionNext64 = regionValue41;
                int regionNext65 = regionValue42;
                regionValue52 = regionNext59;
                regionValue53 = regionNext60;
                regionValue54 = regionNext61;
                regionValue55 = regionNext62;
                regionValue56 = regionNext63;
                regionValue57 = regionNext64;
                regionValue58 = regionNext65;
                break region120;
            }
            case 82544993: {
                java.lang.Object regionNext73 = regionValue36;
                long regionNext74 = regionValue37;
                long regionNext75 = regionValue38;
                java.lang.Object regionNext76 = regionValue39;
                java.lang.Object regionNext77 = regionValue40;
                int regionNext78 = regionValue41;
                int regionNext79 = regionValue42;
                regionValue66 = regionNext73;
                regionValue67 = regionNext74;
                regionValue68 = regionNext75;
                regionValue69 = regionNext76;
                regionValue70 = regionNext77;
                regionValue71 = regionNext78;
                regionValue72 = regionNext79;
                break region96;
            }
            case 1897755483: {
                java.lang.Object regionNext87 = regionValue36;
                long regionNext88 = regionValue37;
                long regionNext89 = regionValue38;
                java.lang.Object regionNext90 = regionValue39;
                java.lang.Object regionNext91 = regionValue40;
                int regionNext92 = regionValue41;
                int regionNext93 = regionValue42;
                regionValue80 = regionNext87;
                regionValue81 = regionNext88;
                regionValue82 = regionNext89;
                regionValue83 = regionNext90;
                regionValue84 = regionNext91;
                regionValue85 = regionNext92;
                regionValue86 = regionNext93;
                break region48;
            }
            case 1925467555: {
                java.lang.Object regionNext101 = regionValue36;
                long regionNext102 = regionValue37;
                long regionNext103 = regionValue38;
                java.lang.Object regionNext104 = regionValue39;
                java.lang.Object regionNext105 = regionValue40;
                int regionNext106 = regionValue41;
                int regionNext107 = regionValue42;
                regionValue94 = regionNext101;
                regionValue95 = regionNext102;
                regionValue96 = regionNext103;
                regionValue97 = regionNext104;
                regionValue98 = regionNext105;
                regionValue99 = regionNext106;
                regionValue100 = regionNext107;
                break region72;
            }
            default: {
                java.lang.Object regionNext114 = regionValue36;
                long regionNext115 = regionValue37;
                long regionNext116 = regionValue38;
                java.lang.Object regionNext117 = regionValue39;
                int regionNext118 = regionValue41;
                int regionNext119 = regionValue42;
                regionValue108 = regionNext114;
                regionValue109 = regionNext115;
                regionValue110 = regionNext116;
                regionValue111 = regionNext117;
                regionValue112 = regionNext118;
                regionValue113 = regionNext119;
                break region140;
            }
        }
        }
        long computed120 = 8514321675855557411L ^ regionValue81;
        java.lang.Object initialValue121 = recovery$indy$flow$15(16078, computed120);
        boolean initialValue122 = recovery$indy$flow$16(regionValue84, initialValue121);
        if (regionValue86 == 0) {
            java.lang.Object regionNext123 = regionValue80;
            long regionNext124 = regionValue81;
            long regionNext125 = regionValue82;
            java.lang.Object regionNext126 = regionValue83;
            int regionNext127 = regionValue86;
            int regionNext128 = (int) ((initialValue122 ? 1 : 0));
            regionValue24 = regionNext123;
            regionValue25 = regionNext124;
            regionValue26 = regionNext125;
            regionValue27 = regionNext126;
            regionValue28 = regionNext127;
            regionValue29 = regionNext128;
            break region141;
        } else {
            java.lang.Object regionNext137 = regionValue80;
            long regionNext138 = regionValue81;
            long regionNext139 = regionValue82;
            java.lang.Object regionNext140 = regionValue83;
            java.lang.Object regionNext141 = regionValue84;
            int regionNext142 = regionValue85;
            int regionNext143 = regionValue86;
            int regionNext144 = (int) ((initialValue122 ? 1 : 0));
            regionValue129 = regionNext137;
            regionValue130 = regionNext138;
            regionValue131 = regionNext139;
            regionValue132 = regionNext140;
            regionValue133 = regionNext141;
            regionValue134 = regionNext142;
            regionValue135 = regionNext143;
            regionValue136 = regionNext144;
            break region57;
        }
        }
        java.lang.Object regionNext153 = regionValue129;
        long regionNext154 = regionValue130;
        long regionNext155 = regionValue131;
        java.lang.Object regionNext156 = regionValue132;
        java.lang.Object regionNext157 = regionValue133;
        int regionNext158 = regionValue134;
        int regionNext159 = regionValue135;
        int regionNext160 = regionValue136;
        regionValue145 = regionNext153;
        regionValue146 = regionNext154;
        regionValue147 = regionNext155;
        regionValue148 = regionNext156;
        regionValue149 = regionNext157;
        regionValue150 = regionNext158;
        regionValue151 = regionNext159;
        regionValue152 = regionNext160;
        break region59;
        }
        if (regionValue152 == 0) {
            java.lang.Object regionNext161 = regionValue145;
            long regionNext162 = regionValue146;
            long regionNext163 = regionValue147;
            java.lang.Object regionNext164 = regionValue148;
            int regionNext165 = regionValue150;
            int regionNext166 = regionValue151;
            regionValue108 = regionNext161;
            regionValue109 = regionNext162;
            regionValue110 = regionNext163;
            regionValue111 = regionNext164;
            regionValue112 = regionNext165;
            regionValue113 = regionNext166;
            break region140;
        } else {
            java.lang.Object regionNext173 = regionValue145;
            long regionNext174 = regionValue146;
            long regionNext175 = regionValue147;
            java.lang.Object regionNext176 = regionValue148;
            java.lang.Object regionNext177 = regionValue149;
            int regionNext178 = regionValue151;
            regionValue167 = regionNext173;
            regionValue168 = regionNext174;
            regionValue169 = regionNext175;
            regionValue170 = regionNext176;
            regionValue171 = regionNext177;
            regionValue172 = regionNext178;
            break region60;
        }
        }
        java.lang.Object regionNext185 = regionValue167;
        long regionNext186 = regionValue168;
        long regionNext187 = regionValue169;
        java.lang.Object regionNext188 = regionValue170;
        java.lang.Object regionNext189 = regionValue171;
        int regionNext190 = regionValue172;
        regionValue179 = regionNext185;
        regionValue180 = regionNext186;
        regionValue181 = regionNext187;
        regionValue182 = regionNext188;
        regionValue183 = regionNext189;
        regionValue184 = regionNext190;
        break region62;
        }
        int initialValue191 = 0;
        int comparison192 = (regionValue180 > 0L ? 1 : regionValue180 == 0L ? 0 : -1);
        if (comparison192 <= 0) {
            java.lang.Object regionNext201 = regionValue179;
            long regionNext202 = regionValue180;
            long regionNext203 = regionValue181;
            java.lang.Object regionNext204 = regionValue182;
            java.lang.Object regionNext205 = regionValue183;
            int regionNext206 = regionValue184;
            int regionNext207 = initialValue191;
            int regionNext208 = regionValue184;
            regionValue193 = regionNext201;
            regionValue194 = regionNext202;
            regionValue195 = regionNext203;
            regionValue196 = regionNext204;
            regionValue197 = regionNext205;
            regionValue198 = regionNext206;
            regionValue199 = regionNext207;
            regionValue200 = regionNext208;
            break region81;
        } else {
            java.lang.Object regionNext217 = regionValue179;
            long regionNext218 = regionValue180;
            long regionNext219 = regionValue181;
            java.lang.Object regionNext220 = regionValue182;
            java.lang.Object regionNext221 = regionValue183;
            int regionNext222 = regionValue184;
            int regionNext223 = initialValue191;
            int regionNext224 = regionValue184;
            regionValue209 = regionNext217;
            regionValue210 = regionNext218;
            regionValue211 = regionNext219;
            regionValue212 = regionNext220;
            regionValue213 = regionNext221;
            regionValue214 = regionNext222;
            regionValue215 = regionNext223;
            regionValue216 = regionNext224;
            break region69;
        }
        }
        if (regionValue216 != 0) {
            java.lang.Object regionNext225 = regionValue209;
            long regionNext226 = regionValue210;
            long regionNext227 = regionValue211;
            java.lang.Object regionNext228 = regionValue212;
            int regionNext229 = regionValue215;
            int regionNext230 = regionValue214;
            regionValue108 = regionNext225;
            regionValue109 = regionNext226;
            regionValue110 = regionNext227;
            regionValue111 = regionNext228;
            regionValue112 = regionNext229;
            regionValue113 = regionNext230;
            break region140;
        } else {
            java.lang.Object regionNext238 = regionValue209;
            long regionNext239 = regionValue210;
            long regionNext240 = regionValue211;
            java.lang.Object regionNext241 = regionValue212;
            java.lang.Object regionNext242 = regionValue213;
            int regionNext243 = regionValue214;
            int regionNext244 = regionValue215;
            regionValue231 = regionNext238;
            regionValue232 = regionNext239;
            regionValue233 = regionNext240;
            regionValue234 = regionNext241;
            regionValue235 = regionNext242;
            regionValue236 = regionNext243;
            regionValue237 = regionNext244;
            break region70;
        }
        }
        java.lang.Object regionNext245 = regionValue231;
        long regionNext246 = regionValue232;
        long regionNext247 = regionValue233;
        java.lang.Object regionNext248 = regionValue234;
        java.lang.Object regionNext249 = regionValue235;
        int regionNext250 = regionValue237;
        int regionNext251 = regionValue236;
        regionValue94 = regionNext245;
        regionValue95 = regionNext246;
        regionValue96 = regionNext247;
        regionValue97 = regionNext248;
        regionValue98 = regionNext249;
        regionValue99 = regionNext250;
        regionValue100 = regionNext251;
        break region72;
        }
        long computed252 = 1545391214438576182L ^ regionValue95;
        java.lang.Object initialValue253 = recovery$indy$flow$17(15824, computed252);
        boolean initialValue254 = recovery$indy$flow$18(regionValue98, initialValue253);
        java.lang.Object regionNext255 = regionValue94;
        long regionNext256 = regionValue95;
        long regionNext257 = regionValue96;
        java.lang.Object regionNext258 = regionValue97;
        java.lang.Object regionNext259 = regionValue98;
        int regionNext260 = regionValue100;
        int regionNext261 = regionValue99;
        int regionNext262 = (int) ((initialValue254 ? 1 : 0));
        regionValue193 = regionNext255;
        regionValue194 = regionNext256;
        regionValue195 = regionNext257;
        regionValue196 = regionNext258;
        regionValue197 = regionNext259;
        regionValue198 = regionNext260;
        regionValue199 = regionNext261;
        regionValue200 = regionNext262;
        break region81;
        }
        if (regionValue198 == 0) {
            java.lang.Object regionNext263 = regionValue193;
            long regionNext264 = regionValue194;
            long regionNext265 = regionValue195;
            java.lang.Object regionNext266 = regionValue196;
            int regionNext267 = regionValue198;
            int regionNext268 = regionValue200;
            regionValue24 = regionNext263;
            regionValue25 = regionNext264;
            regionValue26 = regionNext265;
            regionValue27 = regionNext266;
            regionValue28 = regionNext267;
            regionValue29 = regionNext268;
            break region141;
        } else {
            java.lang.Object regionNext277 = regionValue193;
            long regionNext278 = regionValue194;
            long regionNext279 = regionValue195;
            java.lang.Object regionNext280 = regionValue196;
            java.lang.Object regionNext281 = regionValue197;
            int regionNext282 = regionValue198;
            int regionNext283 = regionValue199;
            int regionNext284 = regionValue200;
            regionValue269 = regionNext277;
            regionValue270 = regionNext278;
            regionValue271 = regionNext279;
            regionValue272 = regionNext280;
            regionValue273 = regionNext281;
            regionValue274 = regionNext282;
            regionValue275 = regionNext283;
            regionValue276 = regionNext284;
            break region83;
        }
        }
        if (regionValue276 == 0) {
            java.lang.Object regionNext285 = regionValue269;
            long regionNext286 = regionValue270;
            long regionNext287 = regionValue271;
            java.lang.Object regionNext288 = regionValue272;
            int regionNext289 = regionValue275;
            int regionNext290 = regionValue274;
            regionValue108 = regionNext285;
            regionValue109 = regionNext286;
            regionValue110 = regionNext287;
            regionValue111 = regionNext288;
            regionValue112 = regionNext289;
            regionValue113 = regionNext290;
            break region140;
        } else {
            java.lang.Object regionNext297 = regionValue269;
            long regionNext298 = regionValue270;
            long regionNext299 = regionValue271;
            java.lang.Object regionNext300 = regionValue272;
            java.lang.Object regionNext301 = regionValue273;
            int regionNext302 = regionValue274;
            regionValue291 = regionNext297;
            regionValue292 = regionNext298;
            regionValue293 = regionNext299;
            regionValue294 = regionNext300;
            regionValue295 = regionNext301;
            regionValue296 = regionNext302;
            break region84;
        }
        }
        java.lang.Object regionNext309 = regionValue291;
        long regionNext310 = regionValue292;
        long regionNext311 = regionValue293;
        java.lang.Object regionNext312 = regionValue294;
        java.lang.Object regionNext313 = regionValue295;
        int regionNext314 = regionValue296;
        regionValue303 = regionNext309;
        regionValue304 = regionNext310;
        regionValue305 = regionNext311;
        regionValue306 = regionNext312;
        regionValue307 = regionNext313;
        regionValue308 = regionNext314;
        break region86;
        }
        int initialValue315 = 1;
        int comparison316 = (regionValue304 > 0L ? 1 : regionValue304 == 0L ? 0 : -1);
        if (comparison316 <= 0) {
            java.lang.Object regionNext325 = regionValue303;
            long regionNext326 = regionValue304;
            long regionNext327 = regionValue305;
            java.lang.Object regionNext328 = regionValue306;
            java.lang.Object regionNext329 = regionValue307;
            int regionNext330 = regionValue308;
            int regionNext331 = initialValue315;
            int regionNext332 = regionValue308;
            regionValue317 = regionNext325;
            regionValue318 = regionNext326;
            regionValue319 = regionNext327;
            regionValue320 = regionNext328;
            regionValue321 = regionNext329;
            regionValue322 = regionNext330;
            regionValue323 = regionNext331;
            regionValue324 = regionNext332;
            break region105;
        } else {
            java.lang.Object regionNext341 = regionValue303;
            long regionNext342 = regionValue304;
            long regionNext343 = regionValue305;
            java.lang.Object regionNext344 = regionValue306;
            java.lang.Object regionNext345 = regionValue307;
            int regionNext346 = regionValue308;
            int regionNext347 = initialValue315;
            int regionNext348 = regionValue308;
            regionValue333 = regionNext341;
            regionValue334 = regionNext342;
            regionValue335 = regionNext343;
            regionValue336 = regionNext344;
            regionValue337 = regionNext345;
            regionValue338 = regionNext346;
            regionValue339 = regionNext347;
            regionValue340 = regionNext348;
            break region93;
        }
        }
        if (regionValue340 != 0) {
            java.lang.Object regionNext349 = regionValue333;
            long regionNext350 = regionValue334;
            long regionNext351 = regionValue335;
            java.lang.Object regionNext352 = regionValue336;
            int regionNext353 = regionValue339;
            int regionNext354 = regionValue338;
            regionValue108 = regionNext349;
            regionValue109 = regionNext350;
            regionValue110 = regionNext351;
            regionValue111 = regionNext352;
            regionValue112 = regionNext353;
            regionValue113 = regionNext354;
            break region140;
        } else {
            java.lang.Object regionNext362 = regionValue333;
            long regionNext363 = regionValue334;
            long regionNext364 = regionValue335;
            java.lang.Object regionNext365 = regionValue336;
            java.lang.Object regionNext366 = regionValue337;
            int regionNext367 = regionValue338;
            int regionNext368 = regionValue339;
            regionValue355 = regionNext362;
            regionValue356 = regionNext363;
            regionValue357 = regionNext364;
            regionValue358 = regionNext365;
            regionValue359 = regionNext366;
            regionValue360 = regionNext367;
            regionValue361 = regionNext368;
            break region94;
        }
        }
        java.lang.Object regionNext369 = regionValue355;
        long regionNext370 = regionValue356;
        long regionNext371 = regionValue357;
        java.lang.Object regionNext372 = regionValue358;
        java.lang.Object regionNext373 = regionValue359;
        int regionNext374 = regionValue361;
        int regionNext375 = regionValue360;
        regionValue66 = regionNext369;
        regionValue67 = regionNext370;
        regionValue68 = regionNext371;
        regionValue69 = regionNext372;
        regionValue70 = regionNext373;
        regionValue71 = regionNext374;
        regionValue72 = regionNext375;
        break region96;
        }
        long computed376 = 5564381993586452042L ^ regionValue67;
        java.lang.Object initialValue377 = recovery$indy$flow$19(11182, computed376);
        boolean initialValue378 = recovery$indy$flow$20(regionValue70, initialValue377);
        java.lang.Object regionNext379 = regionValue66;
        long regionNext380 = regionValue67;
        long regionNext381 = regionValue68;
        java.lang.Object regionNext382 = regionValue69;
        java.lang.Object regionNext383 = regionValue70;
        int regionNext384 = regionValue72;
        int regionNext385 = regionValue71;
        int regionNext386 = (int) ((initialValue378 ? 1 : 0));
        regionValue317 = regionNext379;
        regionValue318 = regionNext380;
        regionValue319 = regionNext381;
        regionValue320 = regionNext382;
        regionValue321 = regionNext383;
        regionValue322 = regionNext384;
        regionValue323 = regionNext385;
        regionValue324 = regionNext386;
        break region105;
        }
        if (regionValue322 == 0) {
            java.lang.Object regionNext387 = regionValue317;
            long regionNext388 = regionValue318;
            long regionNext389 = regionValue319;
            java.lang.Object regionNext390 = regionValue320;
            int regionNext391 = regionValue322;
            int regionNext392 = regionValue324;
            regionValue24 = regionNext387;
            regionValue25 = regionNext388;
            regionValue26 = regionNext389;
            regionValue27 = regionNext390;
            regionValue28 = regionNext391;
            regionValue29 = regionNext392;
            break region141;
        } else {
            java.lang.Object regionNext401 = regionValue317;
            long regionNext402 = regionValue318;
            long regionNext403 = regionValue319;
            java.lang.Object regionNext404 = regionValue320;
            java.lang.Object regionNext405 = regionValue321;
            int regionNext406 = regionValue322;
            int regionNext407 = regionValue323;
            int regionNext408 = regionValue324;
            regionValue393 = regionNext401;
            regionValue394 = regionNext402;
            regionValue395 = regionNext403;
            regionValue396 = regionNext404;
            regionValue397 = regionNext405;
            regionValue398 = regionNext406;
            regionValue399 = regionNext407;
            regionValue400 = regionNext408;
            break region107;
        }
        }
        if (regionValue400 == 0) {
            java.lang.Object regionNext409 = regionValue393;
            long regionNext410 = regionValue394;
            long regionNext411 = regionValue395;
            java.lang.Object regionNext412 = regionValue396;
            int regionNext413 = regionValue399;
            int regionNext414 = regionValue398;
            regionValue108 = regionNext409;
            regionValue109 = regionNext410;
            regionValue110 = regionNext411;
            regionValue111 = regionNext412;
            regionValue112 = regionNext413;
            regionValue113 = regionNext414;
            break region140;
        } else {
            java.lang.Object regionNext421 = regionValue393;
            long regionNext422 = regionValue394;
            long regionNext423 = regionValue395;
            java.lang.Object regionNext424 = regionValue396;
            java.lang.Object regionNext425 = regionValue397;
            int regionNext426 = regionValue398;
            regionValue415 = regionNext421;
            regionValue416 = regionNext422;
            regionValue417 = regionNext423;
            regionValue418 = regionNext424;
            regionValue419 = regionNext425;
            regionValue420 = regionNext426;
            break region108;
        }
        }
        java.lang.Object regionNext433 = regionValue415;
        long regionNext434 = regionValue416;
        long regionNext435 = regionValue417;
        java.lang.Object regionNext436 = regionValue418;
        java.lang.Object regionNext437 = regionValue419;
        int regionNext438 = regionValue420;
        regionValue427 = regionNext433;
        regionValue428 = regionNext434;
        regionValue429 = regionNext435;
        regionValue430 = regionNext436;
        regionValue431 = regionNext437;
        regionValue432 = regionNext438;
        break region110;
        }
        int initialValue439 = 2;
        int comparison440 = (regionValue428 > 0L ? 1 : regionValue428 == 0L ? 0 : -1);
        if (comparison440 < 0) {
            java.lang.Object regionNext448 = regionValue427;
            long regionNext449 = regionValue428;
            long regionNext450 = regionValue429;
            java.lang.Object regionNext451 = regionValue430;
            int regionNext452 = regionValue432;
            int regionNext453 = initialValue439;
            int regionNext454 = regionValue432;
            regionValue441 = regionNext448;
            regionValue442 = regionNext449;
            regionValue443 = regionNext450;
            regionValue444 = regionNext451;
            regionValue445 = regionNext452;
            regionValue446 = regionNext453;
            regionValue447 = regionNext454;
            break region129;
        } else {
            java.lang.Object regionNext463 = regionValue427;
            long regionNext464 = regionValue428;
            long regionNext465 = regionValue429;
            java.lang.Object regionNext466 = regionValue430;
            java.lang.Object regionNext467 = regionValue431;
            int regionNext468 = regionValue432;
            int regionNext469 = initialValue439;
            int regionNext470 = regionValue432;
            regionValue455 = regionNext463;
            regionValue456 = regionNext464;
            regionValue457 = regionNext465;
            regionValue458 = regionNext466;
            regionValue459 = regionNext467;
            regionValue460 = regionNext468;
            regionValue461 = regionNext469;
            regionValue462 = regionNext470;
            break region117;
        }
        }
        if (regionValue462 != 0) {
            java.lang.Object regionNext471 = regionValue455;
            long regionNext472 = regionValue456;
            long regionNext473 = regionValue457;
            java.lang.Object regionNext474 = regionValue458;
            int regionNext475 = regionValue461;
            int regionNext476 = regionValue460;
            regionValue108 = regionNext471;
            regionValue109 = regionNext472;
            regionValue110 = regionNext473;
            regionValue111 = regionNext474;
            regionValue112 = regionNext475;
            regionValue113 = regionNext476;
            break region140;
        } else {
            java.lang.Object regionNext484 = regionValue455;
            long regionNext485 = regionValue456;
            long regionNext486 = regionValue457;
            java.lang.Object regionNext487 = regionValue458;
            java.lang.Object regionNext488 = regionValue459;
            int regionNext489 = regionValue460;
            int regionNext490 = regionValue461;
            regionValue477 = regionNext484;
            regionValue478 = regionNext485;
            regionValue479 = regionNext486;
            regionValue480 = regionNext487;
            regionValue481 = regionNext488;
            regionValue482 = regionNext489;
            regionValue483 = regionNext490;
            break region118;
        }
        }
        java.lang.Object regionNext491 = regionValue477;
        long regionNext492 = regionValue478;
        long regionNext493 = regionValue479;
        java.lang.Object regionNext494 = regionValue480;
        java.lang.Object regionNext495 = regionValue481;
        int regionNext496 = regionValue483;
        int regionNext497 = regionValue482;
        regionValue52 = regionNext491;
        regionValue53 = regionNext492;
        regionValue54 = regionNext493;
        regionValue55 = regionNext494;
        regionValue56 = regionNext495;
        regionValue57 = regionNext496;
        regionValue58 = regionNext497;
        break region120;
        }
        long computed498 = 6628519153408001447L ^ regionValue53;
        java.lang.Object initialValue499 = recovery$indy$flow$21(2137, computed498);
        boolean initialValue500 = recovery$indy$flow$22(regionValue56, initialValue499);
        java.lang.Object regionNext501 = regionValue52;
        long regionNext502 = regionValue53;
        long regionNext503 = regionValue54;
        java.lang.Object regionNext504 = regionValue55;
        int regionNext505 = regionValue58;
        int regionNext506 = regionValue57;
        int regionNext507 = (int) ((initialValue500 ? 1 : 0));
        regionValue441 = regionNext501;
        regionValue442 = regionNext502;
        regionValue443 = regionNext503;
        regionValue444 = regionNext504;
        regionValue445 = regionNext505;
        regionValue446 = regionNext506;
        regionValue447 = regionNext507;
        break region129;
        }
        int comparison508 = (regionValue442 > 0L ? 1 : regionValue442 == 0L ? 0 : -1);
        if (comparison508 <= 0) {
            java.lang.Object regionNext516 = regionValue441;
            long regionNext517 = regionValue442;
            long regionNext518 = regionValue443;
            java.lang.Object regionNext519 = regionValue444;
            int regionNext520 = regionValue445;
            int regionNext521 = regionValue447;
            int regionNext522 = regionValue445;
            regionValue509 = regionNext516;
            regionValue510 = regionNext517;
            regionValue511 = regionNext518;
            regionValue512 = regionNext519;
            regionValue513 = regionNext520;
            regionValue514 = regionNext521;
            regionValue515 = regionNext522;
            break region142;
        } else {
            java.lang.Object regionNext531 = regionValue441;
            long regionNext532 = regionValue442;
            long regionNext533 = regionValue443;
            java.lang.Object regionNext534 = regionValue444;
            int regionNext535 = regionValue445;
            int regionNext536 = regionValue446;
            int regionNext537 = regionValue447;
            int regionNext538 = regionValue445;
            regionValue523 = regionNext531;
            regionValue524 = regionNext532;
            regionValue525 = regionNext533;
            regionValue526 = regionNext534;
            regionValue527 = regionNext535;
            regionValue528 = regionNext536;
            regionValue529 = regionNext537;
            regionValue530 = regionNext538;
            break region134;
        }
        }
        if (regionValue530 == 0) {
            java.lang.Object regionNext539 = regionValue523;
            long regionNext540 = regionValue524;
            long regionNext541 = regionValue525;
            java.lang.Object regionNext542 = regionValue526;
            int regionNext543 = regionValue527;
            int regionNext544 = regionValue529;
            regionValue24 = regionNext539;
            regionValue25 = regionNext540;
            regionValue26 = regionNext541;
            regionValue27 = regionNext542;
            regionValue28 = regionNext543;
            regionValue29 = regionNext544;
            break region141;
        } else {
            java.lang.Object regionNext552 = regionValue523;
            long regionNext553 = regionValue524;
            long regionNext554 = regionValue525;
            java.lang.Object regionNext555 = regionValue526;
            int regionNext556 = regionValue527;
            int regionNext557 = regionValue528;
            int regionNext558 = regionValue529;
            regionValue545 = regionNext552;
            regionValue546 = regionNext553;
            regionValue547 = regionNext554;
            regionValue548 = regionNext555;
            regionValue549 = regionNext556;
            regionValue550 = regionNext557;
            regionValue551 = regionNext558;
            break region135;
        }
        }
        java.lang.Object regionNext566 = regionValue545;
        long regionNext567 = regionValue546;
        long regionNext568 = regionValue547;
        java.lang.Object regionNext569 = regionValue548;
        int regionNext570 = regionValue549;
        int regionNext571 = regionValue550;
        int regionNext572 = regionValue551;
        regionValue559 = regionNext566;
        regionValue560 = regionNext567;
        regionValue561 = regionNext568;
        regionValue562 = regionNext569;
        regionValue563 = regionNext570;
        regionValue564 = regionNext571;
        regionValue565 = regionNext572;
        break region137;
        }
        if (regionValue565 == 0) {
            java.lang.Object regionNext573 = regionValue559;
            long regionNext574 = regionValue560;
            long regionNext575 = regionValue561;
            java.lang.Object regionNext576 = regionValue562;
            int regionNext577 = regionValue564;
            int regionNext578 = regionValue563;
            regionValue108 = regionNext573;
            regionValue109 = regionNext574;
            regionValue110 = regionNext575;
            regionValue111 = regionNext576;
            regionValue112 = regionNext577;
            regionValue113 = regionNext578;
            break region140;
        } else {
            java.lang.Object regionNext584 = regionValue559;
            long regionNext585 = regionValue560;
            long regionNext586 = regionValue561;
            java.lang.Object regionNext587 = regionValue562;
            int regionNext588 = regionValue563;
            regionValue579 = regionNext584;
            regionValue580 = regionNext585;
            regionValue581 = regionNext586;
            regionValue582 = regionNext587;
            regionValue583 = regionNext588;
            break region138;
        }
        }
        int initialValue589 = 3;
        java.lang.Object regionNext590 = regionValue579;
        long regionNext591 = regionValue580;
        long regionNext592 = regionValue581;
        java.lang.Object regionNext593 = regionValue582;
        int regionNext594 = initialValue589;
        int regionNext595 = regionValue583;
        regionValue108 = regionNext590;
        regionValue109 = regionNext591;
        regionValue110 = regionNext592;
        regionValue111 = regionNext593;
        regionValue112 = regionNext594;
        regionValue113 = regionNext595;
        break region140;
        }
        java.lang.Object regionNext596 = regionValue108;
        long regionNext597 = regionValue109;
        long regionNext598 = regionValue110;
        java.lang.Object regionNext599 = regionValue111;
        int regionNext600 = regionValue113;
        int regionNext601 = regionValue112;
        regionValue24 = regionNext596;
        regionValue25 = regionNext597;
        regionValue26 = regionNext598;
        regionValue27 = regionNext599;
        regionValue28 = regionNext600;
        regionValue29 = regionNext601;
        break region141;
        }
        java.lang.Object regionNext602 = regionValue24;
        long regionNext603 = regionValue25;
        long regionNext604 = regionValue26;
        java.lang.Object regionNext605 = regionValue27;
        int regionNext606 = regionValue28;
        int regionNext607 = regionValue29;
        int regionNext608 = regionValue28;
        regionValue509 = regionNext602;
        regionValue510 = regionNext603;
        regionValue511 = regionNext604;
        regionValue512 = regionNext605;
        regionValue513 = regionNext606;
        regionValue514 = regionNext607;
        regionValue515 = regionNext608;
        break region142;
        }
        int comparison609 = (regionValue510 > 0L ? 1 : regionValue510 == 0L ? 0 : -1);
        if (comparison609 < 0) {
            java.lang.Object regionNext617 = regionValue509;
            long regionNext618 = regionValue510;
            long regionNext619 = regionValue511;
            java.lang.Object regionNext620 = regionValue512;
            int regionNext621 = regionValue513;
            int regionNext622 = regionValue514;
            int regionNext623 = regionValue515;
            regionValue610 = regionNext617;
            regionValue611 = regionNext618;
            regionValue612 = regionNext619;
            regionValue613 = regionNext620;
            regionValue614 = regionNext621;
            regionValue615 = regionNext622;
            regionValue616 = regionNext623;
            break region164;
        } else {
            java.lang.Object regionNext631 = regionValue509;
            long regionNext632 = regionValue510;
            long regionNext633 = regionValue511;
            java.lang.Object regionNext634 = regionValue512;
            int regionNext635 = regionValue513;
            int regionNext636 = regionValue514;
            int regionNext637 = regionValue515;
            regionValue624 = regionNext631;
            regionValue625 = regionNext632;
            regionValue626 = regionNext633;
            regionValue627 = regionNext634;
            regionValue628 = regionNext635;
            regionValue629 = regionNext636;
            regionValue630 = regionNext637;
            break region146;
        }
        }
        if (regionValue630 == 0) {
            java.lang.Object regionNext644 = regionValue624;
            long regionNext645 = regionValue625;
            long regionNext646 = regionValue626;
            java.lang.Object regionNext647 = regionValue627;
            int regionNext648 = regionValue628;
            int regionNext649 = regionValue629;
            regionValue638 = regionNext644;
            regionValue639 = regionNext645;
            regionValue640 = regionNext646;
            regionValue641 = regionNext647;
            regionValue642 = regionNext648;
            regionValue643 = regionNext649;
            break region163;
        } else {
            java.lang.Object regionNext656 = regionValue624;
            long regionNext657 = regionValue625;
            long regionNext658 = regionValue626;
            java.lang.Object regionNext659 = regionValue627;
            int regionNext660 = regionValue628;
            int regionNext661 = regionValue629;
            regionValue650 = regionNext656;
            regionValue651 = regionNext657;
            regionValue652 = regionNext658;
            regionValue653 = regionNext659;
            regionValue654 = regionNext660;
            regionValue655 = regionNext661;
            break region147;
        }
        }
        java.lang.Object regionNext668 = regionValue650;
        long regionNext669 = regionValue651;
        long regionNext670 = regionValue652;
        java.lang.Object regionNext671 = regionValue653;
        int regionNext672 = regionValue654;
        int regionNext673 = regionValue655;
        regionValue662 = regionNext668;
        regionValue663 = regionNext669;
        regionValue664 = regionNext670;
        regionValue665 = regionNext671;
        regionValue666 = regionNext672;
        regionValue667 = regionNext673;
        break region149;
        }
        switch (regionValue667) {
            case 0: {
                java.lang.Object regionNext679 = regionValue662;
                long regionNext680 = regionValue663;
                long regionNext681 = regionValue664;
                java.lang.Object regionNext682 = regionValue665;
                int regionNext683 = regionValue666;
                regionValue674 = regionNext679;
                regionValue675 = regionNext680;
                regionValue676 = regionNext681;
                regionValue677 = regionNext682;
                regionValue678 = regionNext683;
                break region150;
            }
            case 1: {
                java.lang.Object regionNext689 = regionValue662;
                long regionNext690 = regionValue663;
                long regionNext691 = regionValue664;
                java.lang.Object regionNext692 = regionValue665;
                int regionNext693 = regionValue666;
                regionValue684 = regionNext689;
                regionValue685 = regionNext690;
                regionValue686 = regionNext691;
                regionValue687 = regionNext692;
                regionValue688 = regionNext693;
                break region225;
            }
            case 2: {
                java.lang.Object regionNext698 = regionValue662;
                long regionNext699 = regionValue663;
                java.lang.Object regionNext700 = regionValue665;
                int regionNext701 = regionValue666;
                regionValue694 = regionNext698;
                regionValue695 = regionNext699;
                regionValue696 = regionNext700;
                regionValue697 = regionNext701;
                break region847;
            }
            case 3: {
                java.lang.Object regionNext706 = regionValue662;
                long regionNext707 = regionValue663;
                java.lang.Object regionNext708 = regionValue665;
                int regionNext709 = regionValue666;
                regionValue702 = regionNext706;
                regionValue703 = regionNext707;
                regionValue704 = regionNext708;
                regionValue705 = regionNext709;
                break region925;
            }
            default: {
                break region998;
            }
        }
        }
        java.lang.Object initialValue710 = recovery$indy$flow$23();
        java.lang.Object initialValue711 = recovery$indy$flow$24(initialValue710, -790899366604326709L, regionValue675);
        java.lang.Object initialValue712 = recovery$indy$flow$25(initialValue711);
        double initialValue713 = recovery$indy$flow$26(initialValue712);
        double initialValue714 = recovery$indy$flow$27(regionValue677);
        double computed715 = initialValue713 - initialValue714;
        int comparison716 = (java.lang.Double.isNaN(computed715) || java.lang.Double.isNaN(Double.longBitsToDouble(4603579539098121011L)) ? -1 : (computed715 > Double.longBitsToDouble(4603579539098121011L) ? 1 : computed715 == Double.longBitsToDouble(4603579539098121011L) ? 0 : -1));
        java.lang.Object regionNext717 = regionValue674;
        long regionNext718 = regionValue675;
        long regionNext719 = regionValue676;
        java.lang.Object regionNext720 = regionValue677;
        int regionNext721 = regionValue678;
        int regionNext722 = comparison716;
        regionValue638 = regionNext717;
        regionValue639 = regionNext718;
        regionValue640 = regionNext719;
        regionValue641 = regionNext720;
        regionValue642 = regionNext721;
        regionValue643 = regionNext722;
        break region163;
        }
        java.lang.Object regionNext723 = regionValue638;
        long regionNext724 = regionValue639;
        long regionNext725 = regionValue640;
        java.lang.Object regionNext726 = regionValue641;
        int regionNext727 = regionValue642;
        int regionNext728 = regionValue643;
        int regionNext729 = regionValue642;
        regionValue610 = regionNext723;
        regionValue611 = regionNext724;
        regionValue612 = regionNext725;
        regionValue613 = regionNext726;
        regionValue614 = regionNext727;
        regionValue615 = regionNext728;
        regionValue616 = regionNext729;
        break region164;
        }
        int comparison730 = (regionValue611 > 0L ? 1 : regionValue611 == 0L ? 0 : -1);
        if (comparison730 < 0) {
            java.lang.Object regionNext738 = regionValue610;
            long regionNext739 = regionValue611;
            long regionNext740 = regionValue612;
            java.lang.Object regionNext741 = regionValue613;
            int regionNext742 = regionValue614;
            int regionNext743 = regionValue615;
            int regionNext744 = regionValue616;
            regionValue731 = regionNext738;
            regionValue732 = regionNext739;
            regionValue733 = regionNext740;
            regionValue734 = regionNext741;
            regionValue735 = regionNext742;
            regionValue736 = regionNext743;
            regionValue737 = regionNext744;
            break region177;
        } else {
            java.lang.Object regionNext752 = regionValue610;
            long regionNext753 = regionValue611;
            long regionNext754 = regionValue612;
            java.lang.Object regionNext755 = regionValue613;
            int regionNext756 = regionValue614;
            int regionNext757 = regionValue615;
            int regionNext758 = regionValue616;
            regionValue745 = regionNext752;
            regionValue746 = regionNext753;
            regionValue747 = regionNext754;
            regionValue748 = regionNext755;
            regionValue749 = regionNext756;
            regionValue750 = regionNext757;
            regionValue751 = regionNext758;
            break region168;
        }
        }
        if (regionValue751 == 0) {
            java.lang.Object regionNext765 = regionValue745;
            long regionNext766 = regionValue746;
            long regionNext767 = regionValue747;
            java.lang.Object regionNext768 = regionValue748;
            int regionNext769 = regionValue749;
            int regionNext770 = regionValue750;
            regionValue759 = regionNext765;
            regionValue760 = regionNext766;
            regionValue761 = regionNext767;
            regionValue762 = regionNext768;
            regionValue763 = regionNext769;
            regionValue764 = regionNext770;
            break region176;
        } else {
            java.lang.Object regionNext777 = regionValue745;
            long regionNext778 = regionValue746;
            long regionNext779 = regionValue747;
            java.lang.Object regionNext780 = regionValue748;
            int regionNext781 = regionValue749;
            int regionNext782 = regionValue750;
            regionValue771 = regionNext777;
            regionValue772 = regionNext778;
            regionValue773 = regionNext779;
            regionValue774 = regionNext780;
            regionValue775 = regionNext781;
            regionValue776 = regionNext782;
            break region169;
        }
        }
        java.lang.Object regionNext789 = regionValue771;
        long regionNext790 = regionValue772;
        long regionNext791 = regionValue773;
        java.lang.Object regionNext792 = regionValue774;
        int regionNext793 = regionValue775;
        int regionNext794 = regionValue776;
        regionValue783 = regionNext789;
        regionValue784 = regionNext790;
        regionValue785 = regionNext791;
        regionValue786 = regionNext792;
        regionValue787 = regionNext793;
        regionValue788 = regionNext794;
        break region171;
        }
        if (regionValue788 <= 0) {
            break region998;
        } else {
            java.lang.Object regionNext800 = regionValue783;
            long regionNext801 = regionValue784;
            long regionNext802 = regionValue785;
            java.lang.Object regionNext803 = regionValue786;
            int regionNext804 = regionValue787;
            regionValue795 = regionNext800;
            regionValue796 = regionNext801;
            regionValue797 = regionNext802;
            regionValue798 = regionNext803;
            regionValue799 = regionNext804;
            break region172;
        }
        }
        boolean initialValue805 = recovery$indy$flow$28(regionValue795);
        java.lang.Object regionNext806 = regionValue795;
        long regionNext807 = regionValue796;
        long regionNext808 = regionValue797;
        java.lang.Object regionNext809 = regionValue798;
        int regionNext810 = regionValue799;
        int regionNext811 = (int) ((initialValue805 ? 1 : 0));
        regionValue759 = regionNext806;
        regionValue760 = regionNext807;
        regionValue761 = regionNext808;
        regionValue762 = regionNext809;
        regionValue763 = regionNext810;
        regionValue764 = regionNext811;
        break region176;
        }
        java.lang.Object regionNext812 = regionValue759;
        long regionNext813 = regionValue760;
        long regionNext814 = regionValue761;
        java.lang.Object regionNext815 = regionValue762;
        int regionNext816 = regionValue763;
        int regionNext817 = regionValue764;
        int regionNext818 = regionValue763;
        regionValue731 = regionNext812;
        regionValue732 = regionNext813;
        regionValue733 = regionNext814;
        regionValue734 = regionNext815;
        regionValue735 = regionNext816;
        regionValue736 = regionNext817;
        regionValue737 = regionNext818;
        break region177;
        }
        if (regionValue737 == 0) {
            java.lang.Object regionNext825 = regionValue731;
            long regionNext826 = regionValue732;
            long regionNext827 = regionValue733;
            java.lang.Object regionNext828 = regionValue734;
            int regionNext829 = regionValue735;
            int regionNext830 = regionValue736;
            regionValue819 = regionNext825;
            regionValue820 = regionNext826;
            regionValue821 = regionNext827;
            regionValue822 = regionNext828;
            regionValue823 = regionNext829;
            regionValue824 = regionNext830;
            break region199;
        } else {
            java.lang.Object regionNext837 = regionValue731;
            long regionNext838 = regionValue732;
            long regionNext839 = regionValue733;
            java.lang.Object regionNext840 = regionValue734;
            int regionNext841 = regionValue735;
            int regionNext842 = regionValue736;
            regionValue831 = regionNext837;
            regionValue832 = regionNext838;
            regionValue833 = regionNext839;
            regionValue834 = regionNext840;
            regionValue835 = regionNext841;
            regionValue836 = regionNext842;
            break region178;
        }
        }
        if (regionValue836 == 0) {
            break region998;
        } else {
            java.lang.Object regionNext848 = regionValue831;
            long regionNext849 = regionValue832;
            long regionNext850 = regionValue833;
            java.lang.Object regionNext851 = regionValue834;
            int regionNext852 = regionValue835;
            regionValue843 = regionNext848;
            regionValue844 = regionNext849;
            regionValue845 = regionNext850;
            regionValue846 = regionNext851;
            regionValue847 = regionNext852;
            break region179;
        }
        }
        int comparison853 = (regionValue844 > 0L ? 1 : regionValue844 == 0L ? 0 : -1);
        if (comparison853 < 0) {
            java.lang.Object regionNext861 = regionValue843;
            long regionNext862 = regionValue844;
            long regionNext863 = regionValue845;
            java.lang.Object regionNext864 = regionValue846;
            int regionNext865 = regionValue847;
            java.lang.Object regionNext866 = regionValue843;
            int regionNext867 = regionValue847;
            regionValue854 = regionNext861;
            regionValue855 = regionNext862;
            regionValue856 = regionNext863;
            regionValue857 = regionNext864;
            regionValue858 = regionNext865;
            regionValue859 = regionNext866;
            regionValue860 = regionNext867;
            break region216;
        } else {
            java.lang.Object regionNext875 = regionValue843;
            long regionNext876 = regionValue844;
            long regionNext877 = regionValue845;
            java.lang.Object regionNext878 = regionValue846;
            int regionNext879 = regionValue847;
            java.lang.Object regionNext880 = regionValue843;
            int regionNext881 = regionValue847;
            regionValue868 = regionNext875;
            regionValue869 = regionNext876;
            regionValue870 = regionNext877;
            regionValue871 = regionNext878;
            regionValue872 = regionNext879;
            regionValue873 = regionNext880;
            regionValue874 = regionNext881;
            break region185;
        }
        }
        java.lang.Object regionNext889 = regionValue868;
        long regionNext890 = regionValue869;
        long regionNext891 = regionValue870;
        java.lang.Object regionNext892 = regionValue871;
        int regionNext893 = regionValue872;
        java.lang.Object regionNext894 = regionValue873;
        int regionNext895 = regionValue874;
        regionValue882 = regionNext889;
        regionValue883 = regionNext890;
        regionValue884 = regionNext891;
        regionValue885 = regionNext892;
        regionValue886 = regionNext893;
        regionValue887 = regionNext894;
        regionValue888 = regionNext895;
        break region187;
        }
        if (regionValue888 == 0) {
            java.lang.Object regionNext902 = regionValue882;
            long regionNext903 = regionValue883;
            long regionNext904 = regionValue884;
            java.lang.Object regionNext905 = regionValue885;
            int regionNext906 = regionValue886;
            java.lang.Object regionNext907 = regionValue887;
            regionValue896 = regionNext902;
            regionValue897 = regionNext903;
            regionValue898 = regionNext904;
            regionValue899 = regionNext905;
            regionValue900 = regionNext906;
            regionValue901 = regionNext907;
            break region215;
        } else {
            java.lang.Object regionNext914 = regionValue882;
            long regionNext915 = regionValue883;
            long regionNext916 = regionValue884;
            java.lang.Object regionNext917 = regionValue885;
            int regionNext918 = regionValue886;
            java.lang.Object regionNext919 = regionValue887;
            regionValue908 = regionNext914;
            regionValue909 = regionNext915;
            regionValue910 = regionNext916;
            regionValue911 = regionNext917;
            regionValue912 = regionNext918;
            regionValue913 = regionNext919;
            break region188;
        }
        }
        java.lang.Object regionNext926 = regionValue908;
        long regionNext927 = regionValue909;
        long regionNext928 = regionValue910;
        java.lang.Object regionNext929 = regionValue911;
        int regionNext930 = regionValue912;
        java.lang.Object regionNext931 = regionValue913;
        regionValue920 = regionNext926;
        regionValue921 = regionNext927;
        regionValue922 = regionNext928;
        regionValue923 = regionNext929;
        regionValue924 = regionNext930;
        regionValue925 = regionNext931;
        break region190;
        }
        java.lang.Object initialValue932 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(regionValue925)))).settingTimer));
        double initialValue933 = recovery$indy$flow$30(initialValue932, regionValue922, -792029917639845517L, regionValue921);
        int comparison934 = (java.lang.Double.isNaN(initialValue933) || java.lang.Double.isNaN(1.0D) ? -1 : (initialValue933 > 1.0D ? 1 : initialValue933 == 1.0D ? 0 : -1));
        java.lang.Object regionNext935 = regionValue920;
        long regionNext936 = regionValue921;
        long regionNext937 = regionValue922;
        java.lang.Object regionNext938 = regionValue923;
        int regionNext939 = regionValue924;
        int regionNext940 = comparison934;
        regionValue819 = regionNext935;
        regionValue820 = regionNext936;
        regionValue821 = regionNext937;
        regionValue822 = regionNext938;
        regionValue823 = regionNext939;
        regionValue824 = regionNext940;
        break region199;
        }
        if (regionValue824 == 0) {
            break region998;
        } else {
            java.lang.Object regionNext946 = regionValue819;
            long regionNext947 = regionValue820;
            long regionNext948 = regionValue821;
            java.lang.Object regionNext949 = regionValue822;
            int regionNext950 = regionValue823;
            regionValue941 = regionNext946;
            regionValue942 = regionNext947;
            regionValue943 = regionNext948;
            regionValue944 = regionNext949;
            regionValue945 = regionNext950;
            break region200;
        }
        }
        java.lang.Object initialValue951 = recovery$indy$flow$31();
        java.lang.Object initialValue952 = recovery$indy$flow$32(initialValue951, -791881089507173125L, regionValue942);
        java.lang.Object initialValue953 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(regionValue941)))).settingTimer));
        double initialValue954 = recovery$indy$flow$34(initialValue953, regionValue943, -792029917639845517L, regionValue942);
        float converted955 = (float) (initialValue954);
        recovery$indy$flow$35(initialValue952, converted955);
        java.lang.Object regionNext956 = regionValue941;
        long regionNext957 = regionValue942;
        long regionNext958 = regionValue943;
        java.lang.Object regionNext959 = regionValue944;
        int regionNext960 = regionValue945;
        java.lang.Object regionNext961 = regionValue941;
        regionValue896 = regionNext956;
        regionValue897 = regionNext957;
        regionValue898 = regionNext958;
        regionValue899 = regionNext959;
        regionValue900 = regionNext960;
        regionValue901 = regionNext961;
        break region215;
        }
        java.lang.Object regionNext962 = regionValue896;
        long regionNext963 = regionValue897;
        long regionNext964 = regionValue898;
        java.lang.Object regionNext965 = regionValue899;
        int regionNext966 = regionValue900;
        java.lang.Object regionNext967 = regionValue901;
        int regionNext968 = 1;
        regionValue854 = regionNext962;
        regionValue855 = regionNext963;
        regionValue856 = regionNext964;
        regionValue857 = regionNext965;
        regionValue858 = regionNext966;
        regionValue859 = regionNext967;
        regionValue860 = regionNext968;
        break region216;
        }
        recovery$indy$flow$36(regionValue859, (regionValue860 != 0));
        int comparison969 = (regionValue855 > 0L ? 1 : regionValue855 == 0L ? 0 : -1);
        if (comparison969 <= 0) {
            java.lang.Object regionNext976 = regionValue854;
            long regionNext977 = regionValue855;
            long regionNext978 = regionValue856;
            java.lang.Object regionNext979 = regionValue857;
            int regionNext980 = regionValue858;
            int regionNext981 = regionValue858;
            regionValue970 = regionNext976;
            regionValue971 = regionNext977;
            regionValue972 = regionNext978;
            regionValue973 = regionNext979;
            regionValue974 = regionNext980;
            regionValue975 = regionNext981;
            break region238;
        } else {
            java.lang.Object regionNext988 = regionValue854;
            long regionNext989 = regionValue855;
            long regionNext990 = regionValue856;
            java.lang.Object regionNext991 = regionValue857;
            int regionNext992 = regionValue858;
            int regionNext993 = regionValue858;
            regionValue982 = regionNext988;
            regionValue983 = regionNext989;
            regionValue984 = regionNext990;
            regionValue985 = regionNext991;
            regionValue986 = regionNext992;
            regionValue987 = regionNext993;
            break region222;
        }
        }
        if (regionValue987 != 0) {
            break region998;
        } else {
            java.lang.Object regionNext999 = regionValue982;
            long regionNext1000 = regionValue983;
            long regionNext1001 = regionValue984;
            java.lang.Object regionNext1002 = regionValue985;
            int regionNext1003 = regionValue986;
            regionValue994 = regionNext999;
            regionValue995 = regionNext1000;
            regionValue996 = regionNext1001;
            regionValue997 = regionNext1002;
            regionValue998 = regionNext1003;
            break region223;
        }
        }
        java.lang.Object regionNext1004 = regionValue994;
        long regionNext1005 = regionValue995;
        long regionNext1006 = regionValue996;
        java.lang.Object regionNext1007 = regionValue997;
        int regionNext1008 = regionValue998;
        regionValue684 = regionNext1004;
        regionValue685 = regionNext1005;
        regionValue686 = regionNext1006;
        regionValue687 = regionNext1007;
        regionValue688 = regionNext1008;
        break region225;
        }
        java.lang.Object initialValue1009 = recovery$indy$flow$37();
        java.lang.Object initialValue1010 = recovery$indy$flow$38(initialValue1009, -790899366604326709L, regionValue685);
        java.lang.Object initialValue1011 = recovery$indy$flow$39(initialValue1010);
        double initialValue1012 = recovery$indy$flow$40(initialValue1011);
        double initialValue1013 = recovery$indy$flow$41(regionValue687);
        double computed1014 = initialValue1012 - initialValue1013;
        int comparison1015 = (java.lang.Double.isNaN(computed1014) || java.lang.Double.isNaN(Double.longBitsToDouble(4603579539098121011L)) ? -1 : (computed1014 > Double.longBitsToDouble(4603579539098121011L) ? 1 : computed1014 == Double.longBitsToDouble(4603579539098121011L) ? 0 : -1));
        java.lang.Object regionNext1016 = regionValue684;
        long regionNext1017 = regionValue685;
        long regionNext1018 = regionValue686;
        java.lang.Object regionNext1019 = regionValue687;
        int regionNext1020 = regionValue688;
        int regionNext1021 = comparison1015;
        regionValue970 = regionNext1016;
        regionValue971 = regionNext1017;
        regionValue972 = regionNext1018;
        regionValue973 = regionNext1019;
        regionValue974 = regionNext1020;
        regionValue975 = regionNext1021;
        break region238;
        }
        if (regionValue974 == 0) {
            java.lang.Object regionNext1028 = regionValue970;
            long regionNext1029 = regionValue971;
            long regionNext1030 = regionValue972;
            java.lang.Object regionNext1031 = regionValue973;
            int regionNext1032 = regionValue974;
            int regionNext1033 = regionValue975;
            regionValue1022 = regionNext1028;
            regionValue1023 = regionNext1029;
            regionValue1024 = regionNext1030;
            regionValue1025 = regionNext1031;
            regionValue1026 = regionNext1032;
            regionValue1027 = regionNext1033;
            break region247;
        } else {
            java.lang.Object regionNext1040 = regionValue970;
            long regionNext1041 = regionValue971;
            long regionNext1042 = regionValue972;
            java.lang.Object regionNext1043 = regionValue973;
            int regionNext1044 = regionValue974;
            int regionNext1045 = regionValue975;
            regionValue1034 = regionNext1040;
            regionValue1035 = regionNext1041;
            regionValue1036 = regionNext1042;
            regionValue1037 = regionNext1043;
            regionValue1038 = regionNext1044;
            regionValue1039 = regionNext1045;
            break region240;
        }
        }
        if (regionValue1039 <= 0) {
            break region998;
        } else {
            java.lang.Object regionNext1051 = regionValue1034;
            long regionNext1052 = regionValue1035;
            long regionNext1053 = regionValue1036;
            java.lang.Object regionNext1054 = regionValue1037;
            int regionNext1055 = regionValue1038;
            regionValue1046 = regionNext1051;
            regionValue1047 = regionNext1052;
            regionValue1048 = regionNext1053;
            regionValue1049 = regionNext1054;
            regionValue1050 = regionNext1055;
            break region241;
        }
        }
        java.lang.Object regionNext1061 = regionValue1046;
        long regionNext1062 = regionValue1047;
        long regionNext1063 = regionValue1048;
        java.lang.Object regionNext1064 = regionValue1049;
        int regionNext1065 = regionValue1050;
        regionValue1056 = regionNext1061;
        regionValue1057 = regionNext1062;
        regionValue1058 = regionNext1063;
        regionValue1059 = regionNext1064;
        regionValue1060 = regionNext1065;
        break region243;
        }
        boolean initialValue1066 = recovery$indy$flow$42(regionValue1056);
        java.lang.Object regionNext1067 = regionValue1056;
        long regionNext1068 = regionValue1057;
        long regionNext1069 = regionValue1058;
        java.lang.Object regionNext1070 = regionValue1059;
        int regionNext1071 = regionValue1060;
        int regionNext1072 = (int) ((initialValue1066 ? 1 : 0));
        regionValue1022 = regionNext1067;
        regionValue1023 = regionNext1068;
        regionValue1024 = regionNext1069;
        regionValue1025 = regionNext1070;
        regionValue1026 = regionNext1071;
        regionValue1027 = regionNext1072;
        break region247;
        }
        if (regionValue1027 == 0) {
            break region998;
        } else {
            java.lang.Object regionNext1078 = regionValue1022;
            long regionNext1079 = regionValue1023;
            long regionNext1080 = regionValue1024;
            java.lang.Object regionNext1081 = regionValue1025;
            int regionNext1082 = regionValue1026;
            regionValue1073 = regionNext1078;
            regionValue1074 = regionNext1079;
            regionValue1075 = regionNext1080;
            regionValue1076 = regionNext1081;
            regionValue1077 = regionNext1082;
            break region248;
        }
        }
        java.lang.Object initialValue1083 = recovery$indy$flow$43();
        java.lang.Object initialValue1084 = recovery$indy$flow$44(initialValue1083, -790899366604326709L, regionValue1074);
        java.lang.Object initialValue1085 = recovery$indy$flow$45(initialValue1084);
        double initialValue1086 = recovery$indy$flow$46(initialValue1085);
        double initialValue1087 = recovery$indy$flow$47(regionValue1076);
        double computed1088 = initialValue1086 - initialValue1087;
        double initialValue1089 = computed1088;
        int initialValue1090 = 2;
        int comparison1091 = (java.lang.Double.isNaN(initialValue1089) || java.lang.Double.isNaN(1.0D) ? -1 : (initialValue1089 > 1.0D ? 1 : initialValue1089 == 1.0D ? 0 : -1));
        int comparison1092 = (regionValue1074 > 0L ? 1 : regionValue1074 == 0L ? 0 : -1);
        if (comparison1092 <= 0) {
            java.lang.Object regionNext1102 = regionValue1073;
            long regionNext1103 = regionValue1074;
            long regionNext1104 = regionValue1075;
            java.lang.Object regionNext1105 = regionValue1076;
            int regionNext1106 = regionValue1077;
            double regionNext1107 = initialValue1089;
            int regionNext1108 = initialValue1090;
            int regionNext1109 = comparison1091;
            int regionNext1110 = regionValue1077;
            regionValue1093 = regionNext1102;
            regionValue1094 = regionNext1103;
            regionValue1095 = regionNext1104;
            regionValue1096 = regionNext1105;
            regionValue1097 = regionNext1106;
            regionValue1098 = regionNext1107;
            regionValue1099 = regionNext1108;
            regionValue1100 = regionNext1109;
            regionValue1101 = regionNext1110;
            break region318;
        } else {
            java.lang.Object regionNext1120 = regionValue1073;
            long regionNext1121 = regionValue1074;
            long regionNext1122 = regionValue1075;
            java.lang.Object regionNext1123 = regionValue1076;
            int regionNext1124 = regionValue1077;
            double regionNext1125 = initialValue1089;
            int regionNext1126 = initialValue1090;
            int regionNext1127 = comparison1091;
            int regionNext1128 = regionValue1077;
            regionValue1111 = regionNext1120;
            regionValue1112 = regionNext1121;
            regionValue1113 = regionNext1122;
            regionValue1114 = regionNext1123;
            regionValue1115 = regionNext1124;
            regionValue1116 = regionNext1125;
            regionValue1117 = regionNext1126;
            regionValue1118 = regionNext1127;
            regionValue1119 = regionNext1128;
            break region268;
        }
        }
        if (regionValue1119 == 0) {
            java.lang.Object regionNext1137 = regionValue1111;
            long regionNext1138 = regionValue1112;
            long regionNext1139 = regionValue1113;
            java.lang.Object regionNext1140 = regionValue1114;
            int regionNext1141 = regionValue1115;
            double regionNext1142 = regionValue1116;
            int regionNext1143 = regionValue1117;
            int regionNext1144 = regionValue1118;
            regionValue1129 = regionNext1137;
            regionValue1130 = regionNext1138;
            regionValue1131 = regionNext1139;
            regionValue1132 = regionNext1140;
            regionValue1133 = regionNext1141;
            regionValue1134 = regionNext1142;
            regionValue1135 = regionNext1143;
            regionValue1136 = regionNext1144;
            break region317;
        } else {
            java.lang.Object regionNext1153 = regionValue1111;
            long regionNext1154 = regionValue1112;
            long regionNext1155 = regionValue1113;
            java.lang.Object regionNext1156 = regionValue1114;
            int regionNext1157 = regionValue1115;
            double regionNext1158 = regionValue1116;
            int regionNext1159 = regionValue1117;
            int regionNext1160 = regionValue1118;
            regionValue1145 = regionNext1153;
            regionValue1146 = regionNext1154;
            regionValue1147 = regionNext1155;
            regionValue1148 = regionNext1156;
            regionValue1149 = regionNext1157;
            regionValue1150 = regionNext1158;
            regionValue1151 = regionNext1159;
            regionValue1152 = regionNext1160;
            break region269;
        }
        }
        java.lang.Object regionNext1169 = regionValue1145;
        long regionNext1170 = regionValue1146;
        long regionNext1171 = regionValue1147;
        java.lang.Object regionNext1172 = regionValue1148;
        int regionNext1173 = regionValue1149;
        double regionNext1174 = regionValue1150;
        int regionNext1175 = regionValue1151;
        int regionNext1176 = regionValue1152;
        regionValue1161 = regionNext1169;
        regionValue1162 = regionNext1170;
        regionValue1163 = regionNext1171;
        regionValue1164 = regionNext1172;
        regionValue1165 = regionNext1173;
        regionValue1166 = regionNext1174;
        regionValue1167 = regionNext1175;
        regionValue1168 = regionNext1176;
        break region271;
        }
        if (regionValue1168 != 0) {
            java.lang.Object regionNext1184 = regionValue1161;
            long regionNext1185 = regionValue1162;
            long regionNext1186 = regionValue1163;
            java.lang.Object regionNext1187 = regionValue1164;
            int regionNext1188 = regionValue1165;
            double regionNext1189 = regionValue1166;
            int regionNext1190 = regionValue1167;
            regionValue1177 = regionNext1184;
            regionValue1178 = regionNext1185;
            regionValue1179 = regionNext1186;
            regionValue1180 = regionNext1187;
            regionValue1181 = regionNext1188;
            regionValue1182 = regionNext1189;
            regionValue1183 = regionNext1190;
            break region312;
        } else {
            java.lang.Object regionNext1197 = regionValue1161;
            long regionNext1198 = regionValue1162;
            long regionNext1199 = regionValue1163;
            java.lang.Object regionNext1200 = regionValue1164;
            int regionNext1201 = regionValue1165;
            double regionNext1202 = regionValue1166;
            regionValue1191 = regionNext1197;
            regionValue1192 = regionNext1198;
            regionValue1193 = regionNext1199;
            regionValue1194 = regionNext1200;
            regionValue1195 = regionNext1201;
            regionValue1196 = regionNext1202;
            break region272;
        }
        }
        java.lang.Object initialValue1203 = recovery$indy$flow$48();
        java.lang.Object initialValue1204 = recovery$indy$flow$49(initialValue1203, -790899366604326709L, regionValue1192);
        java.lang.Object initialValue1205 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue1204)))).field_49m));
        double initialValue1206 = recovery$indy$flow$52(regionValue1194);
        double initialValue1207 = recovery$indy$flow$53(regionValue1194);
        double computed1208 = initialValue1207 + Double.longBitsToDouble(4601237667291888353L);
        double initialValue1209 = recovery$indy$flow$54(regionValue1194);
        net.C_479J initialized1210 = new net.C_479J(initialValue1206, computed1208, initialValue1209, false);
        recovery$indy$flow$56(initialValue1205, initialized1210);
        java.lang.Object initialValue1211 = recovery$indy$flow$57();
        java.lang.Object initialValue1212 = recovery$indy$flow$58(initialValue1211, -790899366604326709L, regionValue1192);
        java.lang.Object initialValue1213 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue1212)))).field_49m));
        double initialValue1214 = recovery$indy$flow$61(regionValue1194);
        double initialValue1215 = recovery$indy$flow$62(regionValue1194);
        double computed1216 = initialValue1215 + Double.longBitsToDouble(4604930618986332160L);
        double initialValue1217 = recovery$indy$flow$63(regionValue1194);
        net.C_479J initialized1218 = new net.C_479J(initialValue1214, computed1216, initialValue1217, false);
        recovery$indy$flow$65(initialValue1213, initialized1218);
        int initialValue1219 = 3;
        if (regionValue1195 != 0) {
            java.lang.Object regionNext1227 = regionValue1191;
            long regionNext1228 = regionValue1192;
            long regionNext1229 = regionValue1193;
            java.lang.Object regionNext1230 = regionValue1194;
            int regionNext1231 = regionValue1195;
            double regionNext1232 = regionValue1196;
            int regionNext1233 = initialValue1219;
            regionValue1220 = regionNext1227;
            regionValue1221 = regionNext1228;
            regionValue1222 = regionNext1229;
            regionValue1223 = regionNext1230;
            regionValue1224 = regionNext1231;
            regionValue1225 = regionNext1232;
            regionValue1226 = regionNext1233;
            break region790;
        } else {
            java.lang.Object regionNext1234 = regionValue1191;
            long regionNext1235 = regionValue1192;
            long regionNext1236 = regionValue1193;
            java.lang.Object regionNext1237 = regionValue1194;
            int regionNext1238 = regionValue1195;
            double regionNext1239 = regionValue1196;
            int regionNext1240 = initialValue1219;
            regionValue1177 = regionNext1234;
            regionValue1178 = regionNext1235;
            regionValue1179 = regionNext1236;
            regionValue1180 = regionNext1237;
            regionValue1181 = regionNext1238;
            regionValue1182 = regionNext1239;
            regionValue1183 = regionNext1240;
            break region312;
        }
        }
        int comparison1241 = (java.lang.Double.isNaN(regionValue1182) || java.lang.Double.isNaN(Double.longBitsToDouble(4604029899060858061L)) ? 1 : (regionValue1182 > Double.longBitsToDouble(4604029899060858061L) ? 1 : regionValue1182 == Double.longBitsToDouble(4604029899060858061L) ? 0 : -1));
        java.lang.Object regionNext1242 = regionValue1177;
        long regionNext1243 = regionValue1178;
        long regionNext1244 = regionValue1179;
        java.lang.Object regionNext1245 = regionValue1180;
        int regionNext1246 = regionValue1181;
        double regionNext1247 = regionValue1182;
        int regionNext1248 = regionValue1183;
        int regionNext1249 = comparison1241;
        regionValue1129 = regionNext1242;
        regionValue1130 = regionNext1243;
        regionValue1131 = regionNext1244;
        regionValue1132 = regionNext1245;
        regionValue1133 = regionNext1246;
        regionValue1134 = regionNext1247;
        regionValue1135 = regionNext1248;
        regionValue1136 = regionNext1249;
        break region317;
        }
        java.lang.Object regionNext1250 = regionValue1129;
        long regionNext1251 = regionValue1130;
        long regionNext1252 = regionValue1131;
        java.lang.Object regionNext1253 = regionValue1132;
        int regionNext1254 = regionValue1133;
        double regionNext1255 = regionValue1134;
        int regionNext1256 = regionValue1135;
        int regionNext1257 = regionValue1136;
        int regionNext1258 = regionValue1133;
        regionValue1093 = regionNext1250;
        regionValue1094 = regionNext1251;
        regionValue1095 = regionNext1252;
        regionValue1096 = regionNext1253;
        regionValue1097 = regionNext1254;
        regionValue1098 = regionNext1255;
        regionValue1099 = regionNext1256;
        regionValue1100 = regionNext1257;
        regionValue1101 = regionNext1258;
        break region318;
        }
        int comparison1259 = (regionValue1094 > 0L ? 1 : regionValue1094 == 0L ? 0 : -1);
        if (comparison1259 <= 0) {
            java.lang.Object regionNext1269 = regionValue1093;
            long regionNext1270 = regionValue1094;
            long regionNext1271 = regionValue1095;
            java.lang.Object regionNext1272 = regionValue1096;
            int regionNext1273 = regionValue1097;
            double regionNext1274 = regionValue1098;
            int regionNext1275 = regionValue1099;
            int regionNext1276 = regionValue1100;
            int regionNext1277 = regionValue1101;
            regionValue1260 = regionNext1269;
            regionValue1261 = regionNext1270;
            regionValue1262 = regionNext1271;
            regionValue1263 = regionNext1272;
            regionValue1264 = regionNext1273;
            regionValue1265 = regionNext1274;
            regionValue1266 = regionNext1275;
            regionValue1267 = regionNext1276;
            regionValue1268 = regionNext1277;
            break region354;
        } else {
            java.lang.Object regionNext1287 = regionValue1093;
            long regionNext1288 = regionValue1094;
            long regionNext1289 = regionValue1095;
            java.lang.Object regionNext1290 = regionValue1096;
            int regionNext1291 = regionValue1097;
            double regionNext1292 = regionValue1098;
            int regionNext1293 = regionValue1099;
            int regionNext1294 = regionValue1100;
            int regionNext1295 = regionValue1101;
            regionValue1278 = regionNext1287;
            regionValue1279 = regionNext1288;
            regionValue1280 = regionNext1289;
            regionValue1281 = regionNext1290;
            regionValue1282 = regionNext1291;
            regionValue1283 = regionNext1292;
            regionValue1284 = regionNext1293;
            regionValue1285 = regionNext1294;
            regionValue1286 = regionNext1295;
            break region322;
        }
        }
        if (regionValue1286 == 0) {
            java.lang.Object regionNext1304 = regionValue1278;
            long regionNext1305 = regionValue1279;
            long regionNext1306 = regionValue1280;
            java.lang.Object regionNext1307 = regionValue1281;
            int regionNext1308 = regionValue1282;
            double regionNext1309 = regionValue1283;
            int regionNext1310 = regionValue1284;
            int regionNext1311 = regionValue1285;
            regionValue1296 = regionNext1304;
            regionValue1297 = regionNext1305;
            regionValue1298 = regionNext1306;
            regionValue1299 = regionNext1307;
            regionValue1300 = regionNext1308;
            regionValue1301 = regionNext1309;
            regionValue1302 = regionNext1310;
            regionValue1303 = regionNext1311;
            break region353;
        } else {
            java.lang.Object regionNext1320 = regionValue1278;
            long regionNext1321 = regionValue1279;
            long regionNext1322 = regionValue1280;
            java.lang.Object regionNext1323 = regionValue1281;
            int regionNext1324 = regionValue1282;
            double regionNext1325 = regionValue1283;
            int regionNext1326 = regionValue1284;
            int regionNext1327 = regionValue1285;
            regionValue1312 = regionNext1320;
            regionValue1313 = regionNext1321;
            regionValue1314 = regionNext1322;
            regionValue1315 = regionNext1323;
            regionValue1316 = regionNext1324;
            regionValue1317 = regionNext1325;
            regionValue1318 = regionNext1326;
            regionValue1319 = regionNext1327;
            break region323;
        }
        }
        java.lang.Object regionNext1336 = regionValue1312;
        long regionNext1337 = regionValue1313;
        long regionNext1338 = regionValue1314;
        java.lang.Object regionNext1339 = regionValue1315;
        int regionNext1340 = regionValue1316;
        double regionNext1341 = regionValue1317;
        int regionNext1342 = regionValue1318;
        int regionNext1343 = regionValue1319;
        regionValue1328 = regionNext1336;
        regionValue1329 = regionNext1337;
        regionValue1330 = regionNext1338;
        regionValue1331 = regionNext1339;
        regionValue1332 = regionNext1340;
        regionValue1333 = regionNext1341;
        regionValue1334 = regionNext1342;
        regionValue1335 = regionNext1343;
        break region325;
        }
        if (regionValue1335 >= 0) {
            java.lang.Object regionNext1351 = regionValue1328;
            long regionNext1352 = regionValue1329;
            long regionNext1353 = regionValue1330;
            java.lang.Object regionNext1354 = regionValue1331;
            int regionNext1355 = regionValue1332;
            double regionNext1356 = regionValue1333;
            int regionNext1357 = regionValue1334;
            regionValue1344 = regionNext1351;
            regionValue1345 = regionNext1352;
            regionValue1346 = regionNext1353;
            regionValue1347 = regionNext1354;
            regionValue1348 = regionNext1355;
            regionValue1349 = regionNext1356;
            regionValue1350 = regionNext1357;
            break region348;
        } else {
            java.lang.Object regionNext1365 = regionValue1328;
            long regionNext1366 = regionValue1329;
            long regionNext1367 = regionValue1330;
            java.lang.Object regionNext1368 = regionValue1331;
            int regionNext1369 = regionValue1332;
            double regionNext1370 = regionValue1333;
            int regionNext1371 = regionValue1334;
            regionValue1358 = regionNext1365;
            regionValue1359 = regionNext1366;
            regionValue1360 = regionNext1367;
            regionValue1361 = regionNext1368;
            regionValue1362 = regionNext1369;
            regionValue1363 = regionNext1370;
            regionValue1364 = regionNext1371;
            break region326;
        }
        }
        java.lang.Object initialValue1372 = recovery$indy$flow$66();
        java.lang.Object initialValue1373 = recovery$indy$flow$67(initialValue1372, -790899366604326709L, regionValue1359);
        java.lang.Object initialValue1374 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue1373)))).field_49m));
        double initialValue1375 = recovery$indy$flow$70(regionValue1361);
        double initialValue1376 = recovery$indy$flow$71(regionValue1361);
        double computed1377 = initialValue1376 + Double.longBitsToDouble(4599976659396224614L);
        double initialValue1378 = recovery$indy$flow$72(regionValue1361);
        net.C_479J initialized1379 = new net.C_479J(initialValue1375, computed1377, initialValue1378, false);
        recovery$indy$flow$74(initialValue1374, initialized1379);
        if (regionValue1362 != 0) {
            java.lang.Object regionNext1380 = regionValue1358;
            long regionNext1381 = regionValue1359;
            long regionNext1382 = regionValue1360;
            java.lang.Object regionNext1383 = regionValue1361;
            int regionNext1384 = regionValue1362;
            double regionNext1385 = regionValue1363;
            int regionNext1386 = regionValue1364;
            regionValue1220 = regionNext1380;
            regionValue1221 = regionNext1381;
            regionValue1222 = regionNext1382;
            regionValue1223 = regionNext1383;
            regionValue1224 = regionNext1384;
            regionValue1225 = regionNext1385;
            regionValue1226 = regionNext1386;
            break region790;
        } else {
            java.lang.Object regionNext1394 = regionValue1358;
            long regionNext1395 = regionValue1359;
            long regionNext1396 = regionValue1360;
            java.lang.Object regionNext1397 = regionValue1361;
            int regionNext1398 = regionValue1362;
            double regionNext1399 = regionValue1363;
            int regionNext1400 = regionValue1364;
            regionValue1387 = regionNext1394;
            regionValue1388 = regionNext1395;
            regionValue1389 = regionNext1396;
            regionValue1390 = regionNext1397;
            regionValue1391 = regionNext1398;
            regionValue1392 = regionNext1399;
            regionValue1393 = regionNext1400;
            break region346;
        }
        }
        java.lang.Object regionNext1401 = regionValue1387;
        long regionNext1402 = regionValue1388;
        long regionNext1403 = regionValue1389;
        java.lang.Object regionNext1404 = regionValue1390;
        int regionNext1405 = regionValue1391;
        double regionNext1406 = regionValue1392;
        int regionNext1407 = regionValue1393;
        regionValue1344 = regionNext1401;
        regionValue1345 = regionNext1402;
        regionValue1346 = regionNext1403;
        regionValue1347 = regionNext1404;
        regionValue1348 = regionNext1405;
        regionValue1349 = regionNext1406;
        regionValue1350 = regionNext1407;
        break region348;
        }
        int comparison1408 = (java.lang.Double.isNaN(regionValue1349) || java.lang.Double.isNaN(Double.longBitsToDouble(4605020690978879570L)) ? 1 : (regionValue1349 > Double.longBitsToDouble(4605020690978879570L) ? 1 : regionValue1349 == Double.longBitsToDouble(4605020690978879570L) ? 0 : -1));
        java.lang.Object regionNext1409 = regionValue1344;
        long regionNext1410 = regionValue1345;
        long regionNext1411 = regionValue1346;
        java.lang.Object regionNext1412 = regionValue1347;
        int regionNext1413 = regionValue1348;
        double regionNext1414 = regionValue1349;
        int regionNext1415 = regionValue1350;
        int regionNext1416 = comparison1408;
        regionValue1296 = regionNext1409;
        regionValue1297 = regionNext1410;
        regionValue1298 = regionNext1411;
        regionValue1299 = regionNext1412;
        regionValue1300 = regionNext1413;
        regionValue1301 = regionNext1414;
        regionValue1302 = regionNext1415;
        regionValue1303 = regionNext1416;
        break region353;
        }
        java.lang.Object regionNext1417 = regionValue1296;
        long regionNext1418 = regionValue1297;
        long regionNext1419 = regionValue1298;
        java.lang.Object regionNext1420 = regionValue1299;
        int regionNext1421 = regionValue1300;
        double regionNext1422 = regionValue1301;
        int regionNext1423 = regionValue1302;
        int regionNext1424 = regionValue1303;
        int regionNext1425 = regionValue1300;
        regionValue1260 = regionNext1417;
        regionValue1261 = regionNext1418;
        regionValue1262 = regionNext1419;
        regionValue1263 = regionNext1420;
        regionValue1264 = regionNext1421;
        regionValue1265 = regionNext1422;
        regionValue1266 = regionNext1423;
        regionValue1267 = regionNext1424;
        regionValue1268 = regionNext1425;
        break region354;
        }
        int comparison1426 = (regionValue1261 > 0L ? 1 : regionValue1261 == 0L ? 0 : -1);
        if (comparison1426 < 0) {
            java.lang.Object regionNext1436 = regionValue1260;
            long regionNext1437 = regionValue1261;
            long regionNext1438 = regionValue1262;
            java.lang.Object regionNext1439 = regionValue1263;
            int regionNext1440 = regionValue1264;
            double regionNext1441 = regionValue1265;
            int regionNext1442 = regionValue1266;
            int regionNext1443 = regionValue1267;
            int regionNext1444 = regionValue1268;
            regionValue1427 = regionNext1436;
            regionValue1428 = regionNext1437;
            regionValue1429 = regionNext1438;
            regionValue1430 = regionNext1439;
            regionValue1431 = regionNext1440;
            regionValue1432 = regionNext1441;
            regionValue1433 = regionNext1442;
            regionValue1434 = regionNext1443;
            regionValue1435 = regionNext1444;
            break region390;
        } else {
            java.lang.Object regionNext1454 = regionValue1260;
            long regionNext1455 = regionValue1261;
            long regionNext1456 = regionValue1262;
            java.lang.Object regionNext1457 = regionValue1263;
            int regionNext1458 = regionValue1264;
            double regionNext1459 = regionValue1265;
            int regionNext1460 = regionValue1266;
            int regionNext1461 = regionValue1267;
            int regionNext1462 = regionValue1268;
            regionValue1445 = regionNext1454;
            regionValue1446 = regionNext1455;
            regionValue1447 = regionNext1456;
            regionValue1448 = regionNext1457;
            regionValue1449 = regionNext1458;
            regionValue1450 = regionNext1459;
            regionValue1451 = regionNext1460;
            regionValue1452 = regionNext1461;
            regionValue1453 = regionNext1462;
            break region358;
        }
        }
        if (regionValue1453 == 0) {
            java.lang.Object regionNext1471 = regionValue1445;
            long regionNext1472 = regionValue1446;
            long regionNext1473 = regionValue1447;
            java.lang.Object regionNext1474 = regionValue1448;
            int regionNext1475 = regionValue1449;
            double regionNext1476 = regionValue1450;
            int regionNext1477 = regionValue1451;
            int regionNext1478 = regionValue1452;
            regionValue1463 = regionNext1471;
            regionValue1464 = regionNext1472;
            regionValue1465 = regionNext1473;
            regionValue1466 = regionNext1474;
            regionValue1467 = regionNext1475;
            regionValue1468 = regionNext1476;
            regionValue1469 = regionNext1477;
            regionValue1470 = regionNext1478;
            break region389;
        } else {
            java.lang.Object regionNext1487 = regionValue1445;
            long regionNext1488 = regionValue1446;
            long regionNext1489 = regionValue1447;
            java.lang.Object regionNext1490 = regionValue1448;
            int regionNext1491 = regionValue1449;
            double regionNext1492 = regionValue1450;
            int regionNext1493 = regionValue1451;
            int regionNext1494 = regionValue1452;
            regionValue1479 = regionNext1487;
            regionValue1480 = regionNext1488;
            regionValue1481 = regionNext1489;
            regionValue1482 = regionNext1490;
            regionValue1483 = regionNext1491;
            regionValue1484 = regionNext1492;
            regionValue1485 = regionNext1493;
            regionValue1486 = regionNext1494;
            break region359;
        }
        }
        java.lang.Object regionNext1503 = regionValue1479;
        long regionNext1504 = regionValue1480;
        long regionNext1505 = regionValue1481;
        java.lang.Object regionNext1506 = regionValue1482;
        int regionNext1507 = regionValue1483;
        double regionNext1508 = regionValue1484;
        int regionNext1509 = regionValue1485;
        int regionNext1510 = regionValue1486;
        regionValue1495 = regionNext1503;
        regionValue1496 = regionNext1504;
        regionValue1497 = regionNext1505;
        regionValue1498 = regionNext1506;
        regionValue1499 = regionNext1507;
        regionValue1500 = regionNext1508;
        regionValue1501 = regionNext1509;
        regionValue1502 = regionNext1510;
        break region361;
        }
        if (regionValue1502 >= 0) {
            java.lang.Object regionNext1518 = regionValue1495;
            long regionNext1519 = regionValue1496;
            long regionNext1520 = regionValue1497;
            java.lang.Object regionNext1521 = regionValue1498;
            int regionNext1522 = regionValue1499;
            double regionNext1523 = regionValue1500;
            int regionNext1524 = regionValue1501;
            regionValue1511 = regionNext1518;
            regionValue1512 = regionNext1519;
            regionValue1513 = regionNext1520;
            regionValue1514 = regionNext1521;
            regionValue1515 = regionNext1522;
            regionValue1516 = regionNext1523;
            regionValue1517 = regionNext1524;
            break region384;
        } else {
            java.lang.Object regionNext1532 = regionValue1495;
            long regionNext1533 = regionValue1496;
            long regionNext1534 = regionValue1497;
            java.lang.Object regionNext1535 = regionValue1498;
            int regionNext1536 = regionValue1499;
            double regionNext1537 = regionValue1500;
            int regionNext1538 = regionValue1501;
            regionValue1525 = regionNext1532;
            regionValue1526 = regionNext1533;
            regionValue1527 = regionNext1534;
            regionValue1528 = regionNext1535;
            regionValue1529 = regionNext1536;
            regionValue1530 = regionNext1537;
            regionValue1531 = regionNext1538;
            break region362;
        }
        }
        java.lang.Object initialValue1539 = recovery$indy$flow$75();
        java.lang.Object initialValue1540 = recovery$indy$flow$76(initialValue1539, -790899366604326709L, regionValue1526);
        java.lang.Object initialValue1541 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue1540)))).field_49m));
        double initialValue1542 = recovery$indy$flow$79(regionValue1528);
        double initialValue1543 = recovery$indy$flow$80(regionValue1528);
        double computed1544 = initialValue1543 + Double.longBitsToDouble(4601237667291888353L);
        double initialValue1545 = recovery$indy$flow$81(regionValue1528);
        net.C_479J initialized1546 = new net.C_479J(initialValue1542, computed1544, initialValue1545, false);
        recovery$indy$flow$83(initialValue1541, initialized1546);
        if (regionValue1529 != 0) {
            java.lang.Object regionNext1547 = regionValue1525;
            long regionNext1548 = regionValue1526;
            long regionNext1549 = regionValue1527;
            java.lang.Object regionNext1550 = regionValue1528;
            int regionNext1551 = regionValue1529;
            double regionNext1552 = regionValue1530;
            int regionNext1553 = regionValue1531;
            regionValue1220 = regionNext1547;
            regionValue1221 = regionNext1548;
            regionValue1222 = regionNext1549;
            regionValue1223 = regionNext1550;
            regionValue1224 = regionNext1551;
            regionValue1225 = regionNext1552;
            regionValue1226 = regionNext1553;
            break region790;
        } else {
            java.lang.Object regionNext1561 = regionValue1525;
            long regionNext1562 = regionValue1526;
            long regionNext1563 = regionValue1527;
            java.lang.Object regionNext1564 = regionValue1528;
            int regionNext1565 = regionValue1529;
            double regionNext1566 = regionValue1530;
            int regionNext1567 = regionValue1531;
            regionValue1554 = regionNext1561;
            regionValue1555 = regionNext1562;
            regionValue1556 = regionNext1563;
            regionValue1557 = regionNext1564;
            regionValue1558 = regionNext1565;
            regionValue1559 = regionNext1566;
            regionValue1560 = regionNext1567;
            break region382;
        }
        }
        java.lang.Object regionNext1568 = regionValue1554;
        long regionNext1569 = regionValue1555;
        long regionNext1570 = regionValue1556;
        java.lang.Object regionNext1571 = regionValue1557;
        int regionNext1572 = regionValue1558;
        double regionNext1573 = regionValue1559;
        int regionNext1574 = regionValue1560;
        regionValue1511 = regionNext1568;
        regionValue1512 = regionNext1569;
        regionValue1513 = regionNext1570;
        regionValue1514 = regionNext1571;
        regionValue1515 = regionNext1572;
        regionValue1516 = regionNext1573;
        regionValue1517 = regionNext1574;
        break region384;
        }
        int comparison1575 = (java.lang.Double.isNaN(regionValue1516) || java.lang.Double.isNaN(Double.longBitsToDouble(4606083540490939007L)) ? 1 : (regionValue1516 > Double.longBitsToDouble(4606083540490939007L) ? 1 : regionValue1516 == Double.longBitsToDouble(4606083540490939007L) ? 0 : -1));
        java.lang.Object regionNext1576 = regionValue1511;
        long regionNext1577 = regionValue1512;
        long regionNext1578 = regionValue1513;
        java.lang.Object regionNext1579 = regionValue1514;
        int regionNext1580 = regionValue1515;
        double regionNext1581 = regionValue1516;
        int regionNext1582 = regionValue1517;
        int regionNext1583 = comparison1575;
        regionValue1463 = regionNext1576;
        regionValue1464 = regionNext1577;
        regionValue1465 = regionNext1578;
        regionValue1466 = regionNext1579;
        regionValue1467 = regionNext1580;
        regionValue1468 = regionNext1581;
        regionValue1469 = regionNext1582;
        regionValue1470 = regionNext1583;
        break region389;
        }
        java.lang.Object regionNext1584 = regionValue1463;
        long regionNext1585 = regionValue1464;
        long regionNext1586 = regionValue1465;
        java.lang.Object regionNext1587 = regionValue1466;
        int regionNext1588 = regionValue1467;
        double regionNext1589 = regionValue1468;
        int regionNext1590 = regionValue1469;
        int regionNext1591 = regionValue1470;
        int regionNext1592 = regionValue1467;
        regionValue1427 = regionNext1584;
        regionValue1428 = regionNext1585;
        regionValue1429 = regionNext1586;
        regionValue1430 = regionNext1587;
        regionValue1431 = regionNext1588;
        regionValue1432 = regionNext1589;
        regionValue1433 = regionNext1590;
        regionValue1434 = regionNext1591;
        regionValue1435 = regionNext1592;
        break region390;
        }
        int comparison1593 = (regionValue1428 > 0L ? 1 : regionValue1428 == 0L ? 0 : -1);
        if (comparison1593 <= 0) {
            java.lang.Object regionNext1603 = regionValue1427;
            long regionNext1604 = regionValue1428;
            long regionNext1605 = regionValue1429;
            java.lang.Object regionNext1606 = regionValue1430;
            int regionNext1607 = regionValue1431;
            double regionNext1608 = regionValue1432;
            int regionNext1609 = regionValue1433;
            int regionNext1610 = regionValue1434;
            int regionNext1611 = regionValue1435;
            regionValue1594 = regionNext1603;
            regionValue1595 = regionNext1604;
            regionValue1596 = regionNext1605;
            regionValue1597 = regionNext1606;
            regionValue1598 = regionNext1607;
            regionValue1599 = regionNext1608;
            regionValue1600 = regionNext1609;
            regionValue1601 = regionNext1610;
            regionValue1602 = regionNext1611;
            break region444;
        } else {
            java.lang.Object regionNext1621 = regionValue1427;
            long regionNext1622 = regionValue1428;
            long regionNext1623 = regionValue1429;
            java.lang.Object regionNext1624 = regionValue1430;
            int regionNext1625 = regionValue1431;
            double regionNext1626 = regionValue1432;
            int regionNext1627 = regionValue1433;
            int regionNext1628 = regionValue1434;
            int regionNext1629 = regionValue1435;
            regionValue1612 = regionNext1621;
            regionValue1613 = regionNext1622;
            regionValue1614 = regionNext1623;
            regionValue1615 = regionNext1624;
            regionValue1616 = regionNext1625;
            regionValue1617 = regionNext1626;
            regionValue1618 = regionNext1627;
            regionValue1619 = regionNext1628;
            regionValue1620 = regionNext1629;
            break region394;
        }
        }
        if (regionValue1620 == 0) {
            java.lang.Object regionNext1638 = regionValue1612;
            long regionNext1639 = regionValue1613;
            long regionNext1640 = regionValue1614;
            java.lang.Object regionNext1641 = regionValue1615;
            int regionNext1642 = regionValue1616;
            double regionNext1643 = regionValue1617;
            int regionNext1644 = regionValue1618;
            int regionNext1645 = regionValue1619;
            regionValue1630 = regionNext1638;
            regionValue1631 = regionNext1639;
            regionValue1632 = regionNext1640;
            regionValue1633 = regionNext1641;
            regionValue1634 = regionNext1642;
            regionValue1635 = regionNext1643;
            regionValue1636 = regionNext1644;
            regionValue1637 = regionNext1645;
            break region443;
        } else {
            java.lang.Object regionNext1654 = regionValue1612;
            long regionNext1655 = regionValue1613;
            long regionNext1656 = regionValue1614;
            java.lang.Object regionNext1657 = regionValue1615;
            int regionNext1658 = regionValue1616;
            double regionNext1659 = regionValue1617;
            int regionNext1660 = regionValue1618;
            int regionNext1661 = regionValue1619;
            regionValue1646 = regionNext1654;
            regionValue1647 = regionNext1655;
            regionValue1648 = regionNext1656;
            regionValue1649 = regionNext1657;
            regionValue1650 = regionNext1658;
            regionValue1651 = regionNext1659;
            regionValue1652 = regionNext1660;
            regionValue1653 = regionNext1661;
            break region395;
        }
        }
        java.lang.Object regionNext1670 = regionValue1646;
        long regionNext1671 = regionValue1647;
        long regionNext1672 = regionValue1648;
        java.lang.Object regionNext1673 = regionValue1649;
        int regionNext1674 = regionValue1650;
        double regionNext1675 = regionValue1651;
        int regionNext1676 = regionValue1652;
        int regionNext1677 = regionValue1653;
        regionValue1662 = regionNext1670;
        regionValue1663 = regionNext1671;
        regionValue1664 = regionNext1672;
        regionValue1665 = regionNext1673;
        regionValue1666 = regionNext1674;
        regionValue1667 = regionNext1675;
        regionValue1668 = regionNext1676;
        regionValue1669 = regionNext1677;
        break region397;
        }
        if (regionValue1669 >= 0) {
            java.lang.Object regionNext1685 = regionValue1662;
            long regionNext1686 = regionValue1663;
            long regionNext1687 = regionValue1664;
            java.lang.Object regionNext1688 = regionValue1665;
            int regionNext1689 = regionValue1666;
            double regionNext1690 = regionValue1667;
            int regionNext1691 = regionValue1668;
            regionValue1678 = regionNext1685;
            regionValue1679 = regionNext1686;
            regionValue1680 = regionNext1687;
            regionValue1681 = regionNext1688;
            regionValue1682 = regionNext1689;
            regionValue1683 = regionNext1690;
            regionValue1684 = regionNext1691;
            break region438;
        } else {
            java.lang.Object regionNext1698 = regionValue1662;
            long regionNext1699 = regionValue1663;
            long regionNext1700 = regionValue1664;
            java.lang.Object regionNext1701 = regionValue1665;
            int regionNext1702 = regionValue1666;
            double regionNext1703 = regionValue1667;
            regionValue1692 = regionNext1698;
            regionValue1693 = regionNext1699;
            regionValue1694 = regionNext1700;
            regionValue1695 = regionNext1701;
            regionValue1696 = regionNext1702;
            regionValue1697 = regionNext1703;
            break region398;
        }
        }
        java.lang.Object initialValue1704 = recovery$indy$flow$84();
        java.lang.Object initialValue1705 = recovery$indy$flow$85(initialValue1704, -790899366604326709L, regionValue1693);
        java.lang.Object initialValue1706 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue1705)))).field_49m));
        double initialValue1707 = recovery$indy$flow$88(regionValue1695);
        double initialValue1708 = recovery$indy$flow$89(regionValue1695);
        double computed1709 = initialValue1708 + Double.longBitsToDouble(4601237667291888353L);
        double initialValue1710 = recovery$indy$flow$90(regionValue1695);
        net.C_479J initialized1711 = new net.C_479J(initialValue1707, computed1709, initialValue1710, false);
        recovery$indy$flow$92(initialValue1706, initialized1711);
        java.lang.Object initialValue1712 = recovery$indy$flow$93();
        java.lang.Object initialValue1713 = recovery$indy$flow$94(initialValue1712, -790899366604326709L, regionValue1693);
        java.lang.Object initialValue1714 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue1713)))).field_49m));
        double initialValue1715 = recovery$indy$flow$97(regionValue1695);
        double initialValue1716 = recovery$indy$flow$98(regionValue1695);
        double computed1717 = initialValue1716 + Double.longBitsToDouble(4604750475001237340L);
        double initialValue1718 = recovery$indy$flow$99(regionValue1695);
        net.C_479J initialized1719 = new net.C_479J(initialValue1715, computed1717, initialValue1718, false);
        recovery$indy$flow$101(initialValue1714, initialized1719);
        int initialValue1720 = 3;
        if (regionValue1696 != 0) {
            java.lang.Object regionNext1721 = regionValue1692;
            long regionNext1722 = regionValue1693;
            long regionNext1723 = regionValue1694;
            java.lang.Object regionNext1724 = regionValue1695;
            int regionNext1725 = regionValue1696;
            double regionNext1726 = regionValue1697;
            int regionNext1727 = initialValue1720;
            regionValue1220 = regionNext1721;
            regionValue1221 = regionNext1722;
            regionValue1222 = regionNext1723;
            regionValue1223 = regionNext1724;
            regionValue1224 = regionNext1725;
            regionValue1225 = regionNext1726;
            regionValue1226 = regionNext1727;
            break region790;
        } else {
            java.lang.Object regionNext1728 = regionValue1692;
            long regionNext1729 = regionValue1693;
            long regionNext1730 = regionValue1694;
            java.lang.Object regionNext1731 = regionValue1695;
            int regionNext1732 = regionValue1696;
            double regionNext1733 = regionValue1697;
            int regionNext1734 = initialValue1720;
            regionValue1678 = regionNext1728;
            regionValue1679 = regionNext1729;
            regionValue1680 = regionNext1730;
            regionValue1681 = regionNext1731;
            regionValue1682 = regionNext1732;
            regionValue1683 = regionNext1733;
            regionValue1684 = regionNext1734;
            break region438;
        }
        }
        int comparison1735 = (java.lang.Double.isNaN(regionValue1683) || java.lang.Double.isNaN(Double.longBitsToDouble(4608353354703133737L)) ? 1 : (regionValue1683 > Double.longBitsToDouble(4608353354703133737L) ? 1 : regionValue1683 == Double.longBitsToDouble(4608353354703133737L) ? 0 : -1));
        java.lang.Object regionNext1736 = regionValue1678;
        long regionNext1737 = regionValue1679;
        long regionNext1738 = regionValue1680;
        java.lang.Object regionNext1739 = regionValue1681;
        int regionNext1740 = regionValue1682;
        double regionNext1741 = regionValue1683;
        int regionNext1742 = regionValue1684;
        int regionNext1743 = comparison1735;
        regionValue1630 = regionNext1736;
        regionValue1631 = regionNext1737;
        regionValue1632 = regionNext1738;
        regionValue1633 = regionNext1739;
        regionValue1634 = regionNext1740;
        regionValue1635 = regionNext1741;
        regionValue1636 = regionNext1742;
        regionValue1637 = regionNext1743;
        break region443;
        }
        java.lang.Object regionNext1744 = regionValue1630;
        long regionNext1745 = regionValue1631;
        long regionNext1746 = regionValue1632;
        java.lang.Object regionNext1747 = regionValue1633;
        int regionNext1748 = regionValue1634;
        double regionNext1749 = regionValue1635;
        int regionNext1750 = regionValue1636;
        int regionNext1751 = regionValue1637;
        int regionNext1752 = regionValue1634;
        regionValue1594 = regionNext1744;
        regionValue1595 = regionNext1745;
        regionValue1596 = regionNext1746;
        regionValue1597 = regionNext1747;
        regionValue1598 = regionNext1748;
        regionValue1599 = regionNext1749;
        regionValue1600 = regionNext1750;
        regionValue1601 = regionNext1751;
        regionValue1602 = regionNext1752;
        break region444;
        }
        int comparison1753 = (regionValue1595 > 0L ? 1 : regionValue1595 == 0L ? 0 : -1);
        if (comparison1753 < 0) {
            java.lang.Object regionNext1763 = regionValue1594;
            long regionNext1764 = regionValue1595;
            long regionNext1765 = regionValue1596;
            java.lang.Object regionNext1766 = regionValue1597;
            int regionNext1767 = regionValue1598;
            double regionNext1768 = regionValue1599;
            int regionNext1769 = regionValue1600;
            int regionNext1770 = regionValue1601;
            int regionNext1771 = regionValue1602;
            regionValue1754 = regionNext1763;
            regionValue1755 = regionNext1764;
            regionValue1756 = regionNext1765;
            regionValue1757 = regionNext1766;
            regionValue1758 = regionNext1767;
            regionValue1759 = regionNext1768;
            regionValue1760 = regionNext1769;
            regionValue1761 = regionNext1770;
            regionValue1762 = regionNext1771;
            break region516;
        } else {
            java.lang.Object regionNext1781 = regionValue1594;
            long regionNext1782 = regionValue1595;
            long regionNext1783 = regionValue1596;
            java.lang.Object regionNext1784 = regionValue1597;
            int regionNext1785 = regionValue1598;
            double regionNext1786 = regionValue1599;
            int regionNext1787 = regionValue1600;
            int regionNext1788 = regionValue1601;
            int regionNext1789 = regionValue1602;
            regionValue1772 = regionNext1781;
            regionValue1773 = regionNext1782;
            regionValue1774 = regionNext1783;
            regionValue1775 = regionNext1784;
            regionValue1776 = regionNext1785;
            regionValue1777 = regionNext1786;
            regionValue1778 = regionNext1787;
            regionValue1779 = regionNext1788;
            regionValue1780 = regionNext1789;
            break region448;
        }
        }
        if (regionValue1780 == 0) {
            java.lang.Object regionNext1798 = regionValue1772;
            long regionNext1799 = regionValue1773;
            long regionNext1800 = regionValue1774;
            java.lang.Object regionNext1801 = regionValue1775;
            int regionNext1802 = regionValue1776;
            double regionNext1803 = regionValue1777;
            int regionNext1804 = regionValue1778;
            int regionNext1805 = regionValue1779;
            regionValue1790 = regionNext1798;
            regionValue1791 = regionNext1799;
            regionValue1792 = regionNext1800;
            regionValue1793 = regionNext1801;
            regionValue1794 = regionNext1802;
            regionValue1795 = regionNext1803;
            regionValue1796 = regionNext1804;
            regionValue1797 = regionNext1805;
            break region515;
        } else {
            java.lang.Object regionNext1814 = regionValue1772;
            long regionNext1815 = regionValue1773;
            long regionNext1816 = regionValue1774;
            java.lang.Object regionNext1817 = regionValue1775;
            int regionNext1818 = regionValue1776;
            double regionNext1819 = regionValue1777;
            int regionNext1820 = regionValue1778;
            int regionNext1821 = regionValue1779;
            regionValue1806 = regionNext1814;
            regionValue1807 = regionNext1815;
            regionValue1808 = regionNext1816;
            regionValue1809 = regionNext1817;
            regionValue1810 = regionNext1818;
            regionValue1811 = regionNext1819;
            regionValue1812 = regionNext1820;
            regionValue1813 = regionNext1821;
            break region449;
        }
        }
        java.lang.Object regionNext1830 = regionValue1806;
        long regionNext1831 = regionValue1807;
        long regionNext1832 = regionValue1808;
        java.lang.Object regionNext1833 = regionValue1809;
        int regionNext1834 = regionValue1810;
        double regionNext1835 = regionValue1811;
        int regionNext1836 = regionValue1812;
        int regionNext1837 = regionValue1813;
        regionValue1822 = regionNext1830;
        regionValue1823 = regionNext1831;
        regionValue1824 = regionNext1832;
        regionValue1825 = regionNext1833;
        regionValue1826 = regionNext1834;
        regionValue1827 = regionNext1835;
        regionValue1828 = regionNext1836;
        regionValue1829 = regionNext1837;
        break region451;
        }
        if (regionValue1829 >= 0) {
            java.lang.Object regionNext1845 = regionValue1822;
            long regionNext1846 = regionValue1823;
            long regionNext1847 = regionValue1824;
            java.lang.Object regionNext1848 = regionValue1825;
            int regionNext1849 = regionValue1826;
            double regionNext1850 = regionValue1827;
            int regionNext1851 = regionValue1828;
            regionValue1838 = regionNext1845;
            regionValue1839 = regionNext1846;
            regionValue1840 = regionNext1847;
            regionValue1841 = regionNext1848;
            regionValue1842 = regionNext1849;
            regionValue1843 = regionNext1850;
            regionValue1844 = regionNext1851;
            break region510;
        } else {
            java.lang.Object regionNext1858 = regionValue1822;
            long regionNext1859 = regionValue1823;
            long regionNext1860 = regionValue1824;
            java.lang.Object regionNext1861 = regionValue1825;
            int regionNext1862 = regionValue1826;
            double regionNext1863 = regionValue1827;
            regionValue1852 = regionNext1858;
            regionValue1853 = regionNext1859;
            regionValue1854 = regionNext1860;
            regionValue1855 = regionNext1861;
            regionValue1856 = regionNext1862;
            regionValue1857 = regionNext1863;
            break region452;
        }
        }
        java.lang.Object initialValue1864 = recovery$indy$flow$102();
        java.lang.Object initialValue1865 = recovery$indy$flow$103(initialValue1864, -790899366604326709L, regionValue1853);
        java.lang.Object initialValue1866 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue1865)))).field_49m));
        double initialValue1867 = recovery$indy$flow$106(regionValue1855);
        double initialValue1868 = recovery$indy$flow$107(regionValue1855);
        double computed1869 = initialValue1868 + Double.longBitsToDouble(4601327739284435763L);
        double initialValue1870 = recovery$indy$flow$108(regionValue1855);
        net.C_479J initialized1871 = new net.C_479J(initialValue1867, computed1869, initialValue1870, false);
        recovery$indy$flow$110(initialValue1866, initialized1871);
        java.lang.Object initialValue1872 = recovery$indy$flow$111();
        java.lang.Object initialValue1873 = recovery$indy$flow$112(initialValue1872, -790899366604326709L, regionValue1853);
        java.lang.Object initialValue1874 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue1873)))).field_49m));
        double initialValue1875 = recovery$indy$flow$115(regionValue1855);
        double initialValue1876 = recovery$indy$flow$116(regionValue1855);
        double computed1877 = initialValue1876 + Double.longBitsToDouble(4605191827764719649L);
        double initialValue1878 = recovery$indy$flow$117(regionValue1855);
        net.C_479J initialized1879 = new net.C_479J(initialValue1875, computed1877, initialValue1878, false);
        recovery$indy$flow$119(initialValue1874, initialized1879);
        java.lang.Object initialValue1880 = recovery$indy$flow$120();
        java.lang.Object initialValue1881 = recovery$indy$flow$121(initialValue1880, -790899366604326709L, regionValue1853);
        java.lang.Object initialValue1882 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue1881)))).field_49m));
        double initialValue1883 = recovery$indy$flow$124(regionValue1855);
        double initialValue1884 = recovery$indy$flow$125(regionValue1855);
        double computed1885 = initialValue1884 + Double.longBitsToDouble(4607452634777659638L);
        double initialValue1886 = recovery$indy$flow$126(regionValue1855);
        net.C_479J initialized1887 = new net.C_479J(initialValue1883, computed1885, initialValue1886, false);
        recovery$indy$flow$128(initialValue1882, initialized1887);
        int initialValue1888 = 4;
        if (regionValue1856 != 0) {
            java.lang.Object regionNext1889 = regionValue1852;
            long regionNext1890 = regionValue1853;
            long regionNext1891 = regionValue1854;
            java.lang.Object regionNext1892 = regionValue1855;
            int regionNext1893 = regionValue1856;
            double regionNext1894 = regionValue1857;
            int regionNext1895 = initialValue1888;
            regionValue1220 = regionNext1889;
            regionValue1221 = regionNext1890;
            regionValue1222 = regionNext1891;
            regionValue1223 = regionNext1892;
            regionValue1224 = regionNext1893;
            regionValue1225 = regionNext1894;
            regionValue1226 = regionNext1895;
            break region790;
        } else {
            java.lang.Object regionNext1896 = regionValue1852;
            long regionNext1897 = regionValue1853;
            long regionNext1898 = regionValue1854;
            java.lang.Object regionNext1899 = regionValue1855;
            int regionNext1900 = regionValue1856;
            double regionNext1901 = regionValue1857;
            int regionNext1902 = initialValue1888;
            regionValue1838 = regionNext1896;
            regionValue1839 = regionNext1897;
            regionValue1840 = regionNext1898;
            regionValue1841 = regionNext1899;
            regionValue1842 = regionNext1900;
            regionValue1843 = regionNext1901;
            regionValue1844 = regionNext1902;
            break region510;
        }
        }
        int comparison1903 = (java.lang.Double.isNaN(regionValue1843) || java.lang.Double.isNaN(Double.longBitsToDouble(4609884578576439706L)) ? 1 : (regionValue1843 > Double.longBitsToDouble(4609884578576439706L) ? 1 : regionValue1843 == Double.longBitsToDouble(4609884578576439706L) ? 0 : -1));
        java.lang.Object regionNext1904 = regionValue1838;
        long regionNext1905 = regionValue1839;
        long regionNext1906 = regionValue1840;
        java.lang.Object regionNext1907 = regionValue1841;
        int regionNext1908 = regionValue1842;
        double regionNext1909 = regionValue1843;
        int regionNext1910 = regionValue1844;
        int regionNext1911 = comparison1903;
        regionValue1790 = regionNext1904;
        regionValue1791 = regionNext1905;
        regionValue1792 = regionNext1906;
        regionValue1793 = regionNext1907;
        regionValue1794 = regionNext1908;
        regionValue1795 = regionNext1909;
        regionValue1796 = regionNext1910;
        regionValue1797 = regionNext1911;
        break region515;
        }
        java.lang.Object regionNext1912 = regionValue1790;
        long regionNext1913 = regionValue1791;
        long regionNext1914 = regionValue1792;
        java.lang.Object regionNext1915 = regionValue1793;
        int regionNext1916 = regionValue1794;
        double regionNext1917 = regionValue1795;
        int regionNext1918 = regionValue1796;
        int regionNext1919 = regionValue1797;
        int regionNext1920 = regionValue1794;
        regionValue1754 = regionNext1912;
        regionValue1755 = regionNext1913;
        regionValue1756 = regionNext1914;
        regionValue1757 = regionNext1915;
        regionValue1758 = regionNext1916;
        regionValue1759 = regionNext1917;
        regionValue1760 = regionNext1918;
        regionValue1761 = regionNext1919;
        regionValue1762 = regionNext1920;
        break region516;
        }
        int comparison1921 = (regionValue1755 > 0L ? 1 : regionValue1755 == 0L ? 0 : -1);
        if (comparison1921 <= 0) {
            java.lang.Object regionNext1931 = regionValue1754;
            long regionNext1932 = regionValue1755;
            long regionNext1933 = regionValue1756;
            java.lang.Object regionNext1934 = regionValue1757;
            int regionNext1935 = regionValue1758;
            double regionNext1936 = regionValue1759;
            int regionNext1937 = regionValue1760;
            int regionNext1938 = regionValue1761;
            int regionNext1939 = regionValue1762;
            regionValue1922 = regionNext1931;
            regionValue1923 = regionNext1932;
            regionValue1924 = regionNext1933;
            regionValue1925 = regionNext1934;
            regionValue1926 = regionNext1935;
            regionValue1927 = regionNext1936;
            regionValue1928 = regionNext1937;
            regionValue1929 = regionNext1938;
            regionValue1930 = regionNext1939;
            break region642;
        } else {
            java.lang.Object regionNext1949 = regionValue1754;
            long regionNext1950 = regionValue1755;
            long regionNext1951 = regionValue1756;
            java.lang.Object regionNext1952 = regionValue1757;
            int regionNext1953 = regionValue1758;
            double regionNext1954 = regionValue1759;
            int regionNext1955 = regionValue1760;
            int regionNext1956 = regionValue1761;
            int regionNext1957 = regionValue1762;
            regionValue1940 = regionNext1949;
            regionValue1941 = regionNext1950;
            regionValue1942 = regionNext1951;
            regionValue1943 = regionNext1952;
            regionValue1944 = regionNext1953;
            regionValue1945 = regionNext1954;
            regionValue1946 = regionNext1955;
            regionValue1947 = regionNext1956;
            regionValue1948 = regionNext1957;
            break region520;
        }
        }
        if (regionValue1948 == 0) {
            java.lang.Object regionNext1966 = regionValue1940;
            long regionNext1967 = regionValue1941;
            long regionNext1968 = regionValue1942;
            java.lang.Object regionNext1969 = regionValue1943;
            int regionNext1970 = regionValue1944;
            double regionNext1971 = regionValue1945;
            int regionNext1972 = regionValue1946;
            int regionNext1973 = regionValue1947;
            regionValue1958 = regionNext1966;
            regionValue1959 = regionNext1967;
            regionValue1960 = regionNext1968;
            regionValue1961 = regionNext1969;
            regionValue1962 = regionNext1970;
            regionValue1963 = regionNext1971;
            regionValue1964 = regionNext1972;
            regionValue1965 = regionNext1973;
            break region641;
        } else {
            java.lang.Object regionNext1982 = regionValue1940;
            long regionNext1983 = regionValue1941;
            long regionNext1984 = regionValue1942;
            java.lang.Object regionNext1985 = regionValue1943;
            int regionNext1986 = regionValue1944;
            double regionNext1987 = regionValue1945;
            int regionNext1988 = regionValue1946;
            int regionNext1989 = regionValue1947;
            regionValue1974 = regionNext1982;
            regionValue1975 = regionNext1983;
            regionValue1976 = regionNext1984;
            regionValue1977 = regionNext1985;
            regionValue1978 = regionNext1986;
            regionValue1979 = regionNext1987;
            regionValue1980 = regionNext1988;
            regionValue1981 = regionNext1989;
            break region521;
        }
        }
        java.lang.Object regionNext1998 = regionValue1974;
        long regionNext1999 = regionValue1975;
        long regionNext2000 = regionValue1976;
        java.lang.Object regionNext2001 = regionValue1977;
        int regionNext2002 = regionValue1978;
        double regionNext2003 = regionValue1979;
        int regionNext2004 = regionValue1980;
        int regionNext2005 = regionValue1981;
        regionValue1990 = regionNext1998;
        regionValue1991 = regionNext1999;
        regionValue1992 = regionNext2000;
        regionValue1993 = regionNext2001;
        regionValue1994 = regionNext2002;
        regionValue1995 = regionNext2003;
        regionValue1996 = regionNext2004;
        regionValue1997 = regionNext2005;
        break region523;
        }
        if (regionValue1997 >= 0) {
            java.lang.Object regionNext2013 = regionValue1990;
            long regionNext2014 = regionValue1991;
            long regionNext2015 = regionValue1992;
            java.lang.Object regionNext2016 = regionValue1993;
            int regionNext2017 = regionValue1994;
            double regionNext2018 = regionValue1995;
            int regionNext2019 = regionValue1996;
            regionValue2006 = regionNext2013;
            regionValue2007 = regionNext2014;
            regionValue2008 = regionNext2015;
            regionValue2009 = regionNext2016;
            regionValue2010 = regionNext2017;
            regionValue2011 = regionNext2018;
            regionValue2012 = regionNext2019;
            break region636;
        } else {
            java.lang.Object regionNext2026 = regionValue1990;
            long regionNext2027 = regionValue1991;
            long regionNext2028 = regionValue1992;
            java.lang.Object regionNext2029 = regionValue1993;
            int regionNext2030 = regionValue1994;
            double regionNext2031 = regionValue1995;
            regionValue2020 = regionNext2026;
            regionValue2021 = regionNext2027;
            regionValue2022 = regionNext2028;
            regionValue2023 = regionNext2029;
            regionValue2024 = regionNext2030;
            regionValue2025 = regionNext2031;
            break region524;
        }
        }
        java.lang.Object initialValue2032 = recovery$indy$flow$129();
        java.lang.Object initialValue2033 = recovery$indy$flow$130(initialValue2032, -790899366604326709L, regionValue2021);
        java.lang.Object initialValue2034 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2033)))).field_49m));
        double initialValue2035 = recovery$indy$flow$133(regionValue2023);
        double initialValue2036 = recovery$indy$flow$134(regionValue2023);
        double computed2037 = initialValue2036 + Double.longBitsToDouble(4601327739284435763L);
        double initialValue2038 = recovery$indy$flow$135(regionValue2023);
        net.C_479J initialized2039 = new net.C_479J(initialValue2035, computed2037, initialValue2038, false);
        recovery$indy$flow$137(initialValue2034, initialized2039);
        java.lang.Object initialValue2040 = recovery$indy$flow$138();
        java.lang.Object initialValue2041 = recovery$indy$flow$139(initialValue2040, -790899366604326709L, regionValue2021);
        java.lang.Object initialValue2042 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2041)))).field_49m));
        double initialValue2043 = recovery$indy$flow$142(regionValue2023);
        double initialValue2044 = recovery$indy$flow$143(regionValue2023);
        double computed2045 = initialValue2044 + Double.longBitsToDouble(4605191827764719649L);
        double initialValue2046 = recovery$indy$flow$144(regionValue2023);
        net.C_479J initialized2047 = new net.C_479J(initialValue2043, computed2045, initialValue2046, false);
        recovery$indy$flow$146(initialValue2042, initialized2047);
        java.lang.Object initialValue2048 = recovery$indy$flow$147();
        java.lang.Object initialValue2049 = recovery$indy$flow$148(initialValue2048, -790899366604326709L, regionValue2021);
        java.lang.Object initialValue2050 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2049)))).field_49m));
        double initialValue2051 = recovery$indy$flow$151(regionValue2023);
        double initialValue2052 = recovery$indy$flow$152(regionValue2023);
        double computed2053 = initialValue2052 + Double.longBitsToDouble(4607424712459969941L);
        double initialValue2054 = recovery$indy$flow$153(regionValue2023);
        net.C_479J initialized2055 = new net.C_479J(initialValue2051, computed2053, initialValue2054, false);
        recovery$indy$flow$155(initialValue2050, initialized2055);
        java.lang.Object initialValue2056 = recovery$indy$flow$156();
        java.lang.Object initialValue2057 = recovery$indy$flow$157(initialValue2056, -790899366604326709L, regionValue2021);
        java.lang.Object initialValue2058 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2057)))).field_49m));
        double initialValue2059 = recovery$indy$flow$160(regionValue2023);
        double initialValue2060 = recovery$indy$flow$161(regionValue2023);
        double computed2061 = initialValue2060 + Double.longBitsToDouble(4608375872701270589L);
        double initialValue2062 = recovery$indy$flow$162(regionValue2023);
        net.C_479J initialized2063 = new net.C_479J(initialValue2059, computed2061, initialValue2062, false);
        recovery$indy$flow$164(initialValue2058, initialized2063);
        java.lang.Object initialValue2064 = recovery$indy$flow$165();
        java.lang.Object initialValue2065 = recovery$indy$flow$166(initialValue2064, -790899366604326709L, regionValue2021);
        java.lang.Object initialValue2066 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2065)))).field_49m));
        double initialValue2067 = recovery$indy$flow$169(regionValue2023);
        double initialValue2068 = recovery$indy$flow$170(regionValue2023);
        double computed2069 = initialValue2068 + Double.longBitsToDouble(4608533498688228557L);
        double initialValue2070 = recovery$indy$flow$171(regionValue2023);
        net.C_479J initialized2071 = new net.C_479J(initialValue2067, computed2069, initialValue2070, false);
        recovery$indy$flow$173(initialValue2066, initialized2071);
        java.lang.Object initialValue2072 = recovery$indy$flow$174();
        java.lang.Object initialValue2073 = recovery$indy$flow$175(initialValue2072, -790899366604326709L, regionValue2021);
        java.lang.Object initialValue2074 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2073)))).field_49m));
        double initialValue2075 = recovery$indy$flow$178(regionValue2023);
        double initialValue2076 = recovery$indy$flow$179(regionValue2023);
        double computed2077 = initialValue2076 + Double.longBitsToDouble(4608308318706860032L);
        double initialValue2078 = recovery$indy$flow$180(regionValue2023);
        net.C_479J initialized2079 = new net.C_479J(initialValue2075, computed2077, initialValue2078, false);
        recovery$indy$flow$182(initialValue2074, initialized2079);
        int initialValue2080 = 7;
        if (regionValue2024 != 0) {
            java.lang.Object regionNext2081 = regionValue2020;
            long regionNext2082 = regionValue2021;
            long regionNext2083 = regionValue2022;
            java.lang.Object regionNext2084 = regionValue2023;
            int regionNext2085 = regionValue2024;
            double regionNext2086 = regionValue2025;
            int regionNext2087 = initialValue2080;
            regionValue1220 = regionNext2081;
            regionValue1221 = regionNext2082;
            regionValue1222 = regionNext2083;
            regionValue1223 = regionNext2084;
            regionValue1224 = regionNext2085;
            regionValue1225 = regionNext2086;
            regionValue1226 = regionNext2087;
            break region790;
        } else {
            java.lang.Object regionNext2088 = regionValue2020;
            long regionNext2089 = regionValue2021;
            long regionNext2090 = regionValue2022;
            java.lang.Object regionNext2091 = regionValue2023;
            int regionNext2092 = regionValue2024;
            double regionNext2093 = regionValue2025;
            int regionNext2094 = initialValue2080;
            regionValue2006 = regionNext2088;
            regionValue2007 = regionNext2089;
            regionValue2008 = regionNext2090;
            regionValue2009 = regionNext2091;
            regionValue2010 = regionNext2092;
            regionValue2011 = regionNext2093;
            regionValue2012 = regionNext2094;
            break region636;
        }
        }
        int comparison2095 = (java.lang.Double.isNaN(regionValue2011) || java.lang.Double.isNaN(Double.longBitsToDouble(4611911198408756429L)) ? 1 : (regionValue2011 > Double.longBitsToDouble(4611911198408756429L) ? 1 : regionValue2011 == Double.longBitsToDouble(4611911198408756429L) ? 0 : -1));
        java.lang.Object regionNext2096 = regionValue2006;
        long regionNext2097 = regionValue2007;
        long regionNext2098 = regionValue2008;
        java.lang.Object regionNext2099 = regionValue2009;
        int regionNext2100 = regionValue2010;
        double regionNext2101 = regionValue2011;
        int regionNext2102 = regionValue2012;
        int regionNext2103 = comparison2095;
        regionValue1958 = regionNext2096;
        regionValue1959 = regionNext2097;
        regionValue1960 = regionNext2098;
        regionValue1961 = regionNext2099;
        regionValue1962 = regionNext2100;
        regionValue1963 = regionNext2101;
        regionValue1964 = regionNext2102;
        regionValue1965 = regionNext2103;
        break region641;
        }
        java.lang.Object regionNext2104 = regionValue1958;
        long regionNext2105 = regionValue1959;
        long regionNext2106 = regionValue1960;
        java.lang.Object regionNext2107 = regionValue1961;
        int regionNext2108 = regionValue1962;
        double regionNext2109 = regionValue1963;
        int regionNext2110 = regionValue1964;
        int regionNext2111 = regionValue1965;
        int regionNext2112 = regionValue1962;
        regionValue1922 = regionNext2104;
        regionValue1923 = regionNext2105;
        regionValue1924 = regionNext2106;
        regionValue1925 = regionNext2107;
        regionValue1926 = regionNext2108;
        regionValue1927 = regionNext2109;
        regionValue1928 = regionNext2110;
        regionValue1929 = regionNext2111;
        regionValue1930 = regionNext2112;
        break region642;
        }
        if (regionValue1930 == 0) {
            java.lang.Object regionNext2121 = regionValue1922;
            long regionNext2122 = regionValue1923;
            long regionNext2123 = regionValue1924;
            java.lang.Object regionNext2124 = regionValue1925;
            int regionNext2125 = regionValue1926;
            double regionNext2126 = regionValue1927;
            int regionNext2127 = regionValue1928;
            int regionNext2128 = regionValue1929;
            regionValue2113 = regionNext2121;
            regionValue2114 = regionNext2122;
            regionValue2115 = regionNext2123;
            regionValue2116 = regionNext2124;
            regionValue2117 = regionNext2125;
            regionValue2118 = regionNext2126;
            regionValue2119 = regionNext2127;
            regionValue2120 = regionNext2128;
            break region798;
        } else {
            java.lang.Object regionNext2137 = regionValue1922;
            long regionNext2138 = regionValue1923;
            long regionNext2139 = regionValue1924;
            java.lang.Object regionNext2140 = regionValue1925;
            int regionNext2141 = regionValue1926;
            double regionNext2142 = regionValue1927;
            int regionNext2143 = regionValue1928;
            int regionNext2144 = regionValue1929;
            regionValue2129 = regionNext2137;
            regionValue2130 = regionNext2138;
            regionValue2131 = regionNext2139;
            regionValue2132 = regionNext2140;
            regionValue2133 = regionNext2141;
            regionValue2134 = regionNext2142;
            regionValue2135 = regionNext2143;
            regionValue2136 = regionNext2144;
            break region643;
        }
        }
        if (regionValue2136 >= 0) {
            java.lang.Object regionNext2145 = regionValue2129;
            long regionNext2146 = regionValue2130;
            long regionNext2147 = regionValue2131;
            java.lang.Object regionNext2148 = regionValue2132;
            int regionNext2149 = regionValue2133;
            double regionNext2150 = regionValue2134;
            int regionNext2151 = regionValue2135;
            regionValue1220 = regionNext2145;
            regionValue1221 = regionNext2146;
            regionValue1222 = regionNext2147;
            regionValue1223 = regionNext2148;
            regionValue1224 = regionNext2149;
            regionValue1225 = regionNext2150;
            regionValue1226 = regionNext2151;
            break region790;
        } else {
            java.lang.Object regionNext2158 = regionValue2129;
            long regionNext2159 = regionValue2130;
            long regionNext2160 = regionValue2131;
            java.lang.Object regionNext2161 = regionValue2132;
            int regionNext2162 = regionValue2133;
            double regionNext2163 = regionValue2134;
            regionValue2152 = regionNext2158;
            regionValue2153 = regionNext2159;
            regionValue2154 = regionNext2160;
            regionValue2155 = regionNext2161;
            regionValue2156 = regionNext2162;
            regionValue2157 = regionNext2163;
            break region644;
        }
        }
        java.lang.Object initialValue2164 = recovery$indy$flow$183();
        java.lang.Object initialValue2165 = recovery$indy$flow$184(initialValue2164, -790899366604326709L, regionValue2153);
        java.lang.Object initialValue2166 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2165)))).field_49m));
        double initialValue2167 = recovery$indy$flow$187(regionValue2155);
        double initialValue2168 = recovery$indy$flow$188(regionValue2155);
        double computed2169 = initialValue2168 + Double.longBitsToDouble(4601327739284435763L);
        double initialValue2170 = recovery$indy$flow$189(regionValue2155);
        net.C_479J initialized2171 = new net.C_479J(initialValue2167, computed2169, initialValue2170, false);
        recovery$indy$flow$191(initialValue2166, initialized2171);
        java.lang.Object initialValue2172 = recovery$indy$flow$192();
        java.lang.Object initialValue2173 = recovery$indy$flow$193(initialValue2172, -790899366604326709L, regionValue2153);
        java.lang.Object initialValue2174 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2173)))).field_49m));
        double initialValue2175 = recovery$indy$flow$196(regionValue2155);
        double initialValue2176 = recovery$indy$flow$197(regionValue2155);
        double computed2177 = initialValue2176 + Double.longBitsToDouble(4605561122934164029L);
        double initialValue2178 = recovery$indy$flow$198(regionValue2155);
        net.C_479J initialized2179 = new net.C_479J(initialValue2175, computed2177, initialValue2178, false);
        recovery$indy$flow$200(initialValue2174, initialized2179);
        java.lang.Object initialValue2180 = recovery$indy$flow$201();
        java.lang.Object initialValue2181 = recovery$indy$flow$202(initialValue2180, -790899366604326709L, regionValue2153);
        java.lang.Object initialValue2182 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2181)))).field_49m));
        double initialValue2183 = recovery$indy$flow$205(regionValue2155);
        double initialValue2184 = recovery$indy$flow$206(regionValue2155);
        double computed2185 = initialValue2184 + Double.longBitsToDouble(4604480259023595110L);
        double initialValue2186 = recovery$indy$flow$207(regionValue2155);
        net.C_479J initialized2187 = new net.C_479J(initialValue2183, computed2185, initialValue2186, false);
        recovery$indy$flow$209(initialValue2182, initialized2187);
        java.lang.Object initialValue2188 = recovery$indy$flow$210();
        java.lang.Object initialValue2189 = recovery$indy$flow$211(initialValue2188, -790899366604326709L, regionValue2153);
        java.lang.Object initialValue2190 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2189)))).field_49m));
        double initialValue2191 = recovery$indy$flow$214(regionValue2155);
        double initialValue2192 = recovery$indy$flow$215(regionValue2155);
        double computed2193 = initialValue2192 + Double.longBitsToDouble(4603534503101847306L);
        double initialValue2194 = recovery$indy$flow$216(regionValue2155);
        net.C_479J initialized2195 = new net.C_479J(initialValue2191, computed2193, initialValue2194, false);
        recovery$indy$flow$218(initialValue2190, initialized2195);
        java.lang.Object initialValue2196 = recovery$indy$flow$219();
        java.lang.Object initialValue2197 = recovery$indy$flow$220(initialValue2196, -790899366604326709L, regionValue2153);
        java.lang.Object initialValue2198 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2197)))).field_49m));
        double initialValue2199 = recovery$indy$flow$223(regionValue2155);
        double initialValue2200 = recovery$indy$flow$224(regionValue2155);
        double computed2201 = initialValue2200 + Double.longBitsToDouble(4607227454796291113L);
        double initialValue2202 = recovery$indy$flow$225(regionValue2155);
        net.C_479J initialized2203 = new net.C_479J(initialValue2199, computed2201, initialValue2202, false);
        recovery$indy$flow$227(initialValue2198, initialized2203);
        java.lang.Object initialValue2204 = recovery$indy$flow$228();
        java.lang.Object initialValue2205 = recovery$indy$flow$229(initialValue2204, -790899366604326709L, regionValue2153);
        java.lang.Object initialValue2206 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2205)))).field_49m));
        double initialValue2207 = recovery$indy$flow$232(regionValue2155);
        double initialValue2208 = recovery$indy$flow$233(regionValue2155);
        double computed2209 = initialValue2208 + Double.longBitsToDouble(4608848750662144492L);
        double initialValue2210 = recovery$indy$flow$234(regionValue2155);
        net.C_479J initialized2211 = new net.C_479J(initialValue2207, computed2209, initialValue2210, false);
        recovery$indy$flow$236(initialValue2206, initialized2211);
        java.lang.Object initialValue2212 = recovery$indy$flow$237();
        java.lang.Object initialValue2213 = recovery$indy$flow$238(initialValue2212, -790899366604326709L, regionValue2153);
        java.lang.Object initialValue2214 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2213)))).field_49m));
        double initialValue2215 = recovery$indy$flow$241(regionValue2155);
        double initialValue2216 = recovery$indy$flow$242(regionValue2155);
        double computed2217 = initialValue2216 + Double.longBitsToDouble(4610141283755199824L);
        double initialValue2218 = recovery$indy$flow$243(regionValue2155);
        net.C_479J initialized2219 = new net.C_479J(initialValue2215, computed2217, initialValue2218, false);
        recovery$indy$flow$245(initialValue2214, initialized2219);
        java.lang.Object initialValue2220 = recovery$indy$flow$246();
        java.lang.Object initialValue2221 = recovery$indy$flow$247(initialValue2220, -790899366604326709L, regionValue2153);
        java.lang.Object initialValue2222 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue2221)))).field_49m));
        double initialValue2223 = recovery$indy$flow$250(regionValue2155);
        double initialValue2224 = recovery$indy$flow$251(regionValue2155);
        double computed2225 = initialValue2224 + Double.longBitsToDouble(4611100550475829740L);
        double initialValue2226 = recovery$indy$flow$252(regionValue2155);
        net.C_479J initialized2227 = new net.C_479J(initialValue2223, computed2225, initialValue2226, false);
        recovery$indy$flow$254(initialValue2222, initialized2227);
        int initialValue2228 = 10;
        java.lang.Object regionNext2229 = regionValue2152;
        long regionNext2230 = regionValue2153;
        long regionNext2231 = regionValue2154;
        java.lang.Object regionNext2232 = regionValue2155;
        int regionNext2233 = regionValue2156;
        double regionNext2234 = regionValue2157;
        int regionNext2235 = initialValue2228;
        regionValue1220 = regionNext2229;
        regionValue1221 = regionNext2230;
        regionValue1222 = regionNext2231;
        regionValue1223 = regionNext2232;
        regionValue1224 = regionNext2233;
        regionValue1225 = regionNext2234;
        regionValue1226 = regionNext2235;
        break region790;
        }
        java.lang.Object initialValue2236 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(regionValue1220)))).settingTimer));
        double initialValue2237 = recovery$indy$flow$256(initialValue2236, regionValue1222, -792029917639845517L, regionValue1221);
        int comparison2238 = (java.lang.Double.isNaN(initialValue2237) || java.lang.Double.isNaN(1.0D) ? -1 : (initialValue2237 > 1.0D ? 1 : initialValue2237 == 1.0D ? 0 : -1));
        java.lang.Object regionNext2239 = regionValue1220;
        long regionNext2240 = regionValue1221;
        long regionNext2241 = regionValue1222;
        java.lang.Object regionNext2242 = regionValue1223;
        int regionNext2243 = regionValue1224;
        double regionNext2244 = regionValue1225;
        int regionNext2245 = regionValue1226;
        int regionNext2246 = comparison2238;
        regionValue2113 = regionNext2239;
        regionValue2114 = regionNext2240;
        regionValue2115 = regionNext2241;
        regionValue2116 = regionNext2242;
        regionValue2117 = regionNext2243;
        regionValue2118 = regionNext2244;
        regionValue2119 = regionNext2245;
        regionValue2120 = regionNext2246;
        break region798;
        }
        if (regionValue2120 == 0) {
            java.lang.Object regionNext2251 = regionValue2113;
            long regionNext2252 = regionValue2114;
            java.lang.Object regionNext2253 = regionValue2116;
            int regionNext2254 = regionValue2117;
            regionValue2247 = regionNext2251;
            regionValue2248 = regionNext2252;
            regionValue2249 = regionNext2253;
            regionValue2250 = regionNext2254;
            break region839;
        } else {
            java.lang.Object regionNext2262 = regionValue2113;
            long regionNext2263 = regionValue2114;
            long regionNext2264 = regionValue2115;
            java.lang.Object regionNext2265 = regionValue2116;
            int regionNext2266 = regionValue2117;
            double regionNext2267 = regionValue2118;
            int regionNext2268 = regionValue2119;
            regionValue2255 = regionNext2262;
            regionValue2256 = regionNext2263;
            regionValue2257 = regionNext2264;
            regionValue2258 = regionNext2265;
            regionValue2259 = regionNext2266;
            regionValue2260 = regionNext2267;
            regionValue2261 = regionNext2268;
            break region799;
        }
        }
        java.lang.Object initialValue2269 = recovery$indy$flow$257();
        java.lang.Object initialValue2270 = recovery$indy$flow$258(initialValue2269, -791881089507173125L, regionValue2256);
        if (regionValue2259 == 0) {
            java.lang.Object regionNext2278 = regionValue2255;
            long regionNext2279 = regionValue2256;
            java.lang.Object regionNext2280 = regionValue2258;
            int regionNext2281 = regionValue2259;
            java.lang.Object regionNext2282 = initialValue2270;
            double regionNext2283 = regionValue2260;
            double regionNext2284 = 1.0D;
            regionValue2271 = regionNext2278;
            regionValue2272 = regionNext2279;
            regionValue2273 = regionNext2280;
            regionValue2274 = regionNext2281;
            regionValue2275 = regionNext2282;
            regionValue2276 = regionNext2283;
            regionValue2277 = regionNext2284;
            break region831;
        } else {
            java.lang.Object regionNext2294 = regionValue2255;
            long regionNext2295 = regionValue2256;
            long regionNext2296 = regionValue2257;
            java.lang.Object regionNext2297 = regionValue2258;
            int regionNext2298 = regionValue2259;
            int regionNext2299 = regionValue2261;
            java.lang.Object regionNext2300 = initialValue2270;
            double regionNext2301 = regionValue2260;
            double regionNext2302 = 1.0D;
            regionValue2285 = regionNext2294;
            regionValue2286 = regionNext2295;
            regionValue2287 = regionNext2296;
            regionValue2288 = regionNext2297;
            regionValue2289 = regionNext2298;
            regionValue2290 = regionNext2299;
            regionValue2291 = regionNext2300;
            regionValue2292 = regionNext2301;
            regionValue2293 = regionNext2302;
            break region807;
        }
        }
        java.lang.Object regionNext2312 = regionValue2285;
        long regionNext2313 = regionValue2286;
        long regionNext2314 = regionValue2287;
        java.lang.Object regionNext2315 = regionValue2288;
        int regionNext2316 = regionValue2289;
        int regionNext2317 = regionValue2290;
        java.lang.Object regionNext2318 = regionValue2291;
        double regionNext2319 = regionValue2292;
        double regionNext2320 = regionValue2293;
        regionValue2303 = regionNext2312;
        regionValue2304 = regionNext2313;
        regionValue2305 = regionNext2314;
        regionValue2306 = regionNext2315;
        regionValue2307 = regionNext2316;
        regionValue2308 = regionNext2317;
        regionValue2309 = regionNext2318;
        regionValue2310 = regionNext2319;
        regionValue2311 = regionNext2320;
        break region809;
        }
        int comparison2321 = (java.lang.Double.isNaN(regionValue2310) || java.lang.Double.isNaN(regionValue2311) ? -1 : (regionValue2310 > regionValue2311 ? 1 : regionValue2310 == regionValue2311 ? 0 : -1));
        if (comparison2321 != 0) {
            java.lang.Object regionNext2329 = regionValue2303;
            long regionNext2330 = regionValue2304;
            long regionNext2331 = regionValue2305;
            java.lang.Object regionNext2332 = regionValue2306;
            int regionNext2333 = regionValue2307;
            int regionNext2334 = regionValue2308;
            java.lang.Object regionNext2335 = regionValue2309;
            regionValue2322 = regionNext2329;
            regionValue2323 = regionNext2330;
            regionValue2324 = regionNext2331;
            regionValue2325 = regionNext2332;
            regionValue2326 = regionNext2333;
            regionValue2327 = regionNext2334;
            regionValue2328 = regionNext2335;
            break region821;
        } else {
            java.lang.Object regionNext2342 = regionValue2303;
            long regionNext2343 = regionValue2304;
            long regionNext2344 = regionValue2305;
            java.lang.Object regionNext2345 = regionValue2306;
            int regionNext2346 = regionValue2307;
            java.lang.Object regionNext2347 = regionValue2309;
            regionValue2336 = regionNext2342;
            regionValue2337 = regionNext2343;
            regionValue2338 = regionNext2344;
            regionValue2339 = regionNext2345;
            regionValue2340 = regionNext2346;
            regionValue2341 = regionNext2347;
            break region811;
        }
        }
        java.lang.Object regionNext2354 = regionValue2336;
        long regionNext2355 = regionValue2337;
        long regionNext2356 = regionValue2338;
        java.lang.Object regionNext2357 = regionValue2339;
        int regionNext2358 = regionValue2340;
        java.lang.Object regionNext2359 = regionValue2341;
        regionValue2348 = regionNext2354;
        regionValue2349 = regionNext2355;
        regionValue2350 = regionNext2356;
        regionValue2351 = regionNext2357;
        regionValue2352 = regionNext2358;
        regionValue2353 = regionNext2359;
        break region813;
        }
        java.lang.Object initialValue2360 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(regionValue2348)))).settingTimer));
        double initialValue2361 = recovery$indy$flow$260(initialValue2360, regionValue2350, -792029917639845517L, regionValue2349);
        java.lang.Object regionNext2368 = regionValue2348;
        long regionNext2369 = regionValue2349;
        java.lang.Object regionNext2370 = regionValue2351;
        int regionNext2371 = regionValue2352;
        java.lang.Object regionNext2372 = regionValue2353;
        double regionNext2373 = initialValue2361;
        regionValue2362 = regionNext2368;
        regionValue2363 = regionNext2369;
        regionValue2364 = regionNext2370;
        regionValue2365 = regionNext2371;
        regionValue2366 = regionNext2372;
        regionValue2367 = regionNext2373;
        break region832;
        }
        java.lang.Object initialValue2374 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(regionValue2322)))).settingTimer));
        double initialValue2375 = recovery$indy$flow$262(initialValue2374, regionValue2324, -792029917639845517L, regionValue2323);
        double computed2376 = initialValue2375 * Double.longBitsToDouble(4614913590654337381L);
        double converted2377 = (double) (regionValue2327);
        java.lang.Object regionNext2378 = regionValue2322;
        long regionNext2379 = regionValue2323;
        java.lang.Object regionNext2380 = regionValue2325;
        int regionNext2381 = regionValue2326;
        java.lang.Object regionNext2382 = regionValue2328;
        double regionNext2383 = computed2376;
        double regionNext2384 = converted2377;
        regionValue2271 = regionNext2378;
        regionValue2272 = regionNext2379;
        regionValue2273 = regionNext2380;
        regionValue2274 = regionNext2381;
        regionValue2275 = regionNext2382;
        regionValue2276 = regionNext2383;
        regionValue2277 = regionNext2384;
        break region831;
        }
        double computed2385 = regionValue2276 / regionValue2277;
        java.lang.Object regionNext2386 = regionValue2271;
        long regionNext2387 = regionValue2272;
        java.lang.Object regionNext2388 = regionValue2273;
        int regionNext2389 = regionValue2274;
        java.lang.Object regionNext2390 = regionValue2275;
        double regionNext2391 = computed2385;
        regionValue2362 = regionNext2386;
        regionValue2363 = regionNext2387;
        regionValue2364 = regionNext2388;
        regionValue2365 = regionNext2389;
        regionValue2366 = regionNext2390;
        regionValue2367 = regionNext2391;
        break region832;
        }
        double initialValue2392 = recovery$indy$flow$263(regionValue2367, Double.longBitsToDouble(4591870180066957722L));
        float converted2393 = (float) (initialValue2392);
        recovery$indy$flow$264(regionValue2366, converted2393);
        recovery$indy$flow$265(regionValue2362, true);
        java.lang.Object regionNext2394 = regionValue2362;
        long regionNext2395 = regionValue2363;
        java.lang.Object regionNext2396 = regionValue2364;
        int regionNext2397 = regionValue2365;
        regionValue2247 = regionNext2394;
        regionValue2248 = regionNext2395;
        regionValue2249 = regionNext2396;
        regionValue2250 = regionNext2397;
        break region839;
        }
        int comparison2398 = (regionValue2248 > 0L ? 1 : regionValue2248 == 0L ? 0 : -1);
        if (comparison2398 <= 0) {
            java.lang.Object regionNext2404 = regionValue2247;
            long regionNext2405 = regionValue2248;
            java.lang.Object regionNext2406 = regionValue2249;
            int regionNext2407 = regionValue2250;
            int regionNext2408 = regionValue2250;
            regionValue2399 = regionNext2404;
            regionValue2400 = regionNext2405;
            regionValue2401 = regionNext2406;
            regionValue2402 = regionNext2407;
            regionValue2403 = regionNext2408;
            break region857;
        } else {
            java.lang.Object regionNext2414 = regionValue2247;
            long regionNext2415 = regionValue2248;
            java.lang.Object regionNext2416 = regionValue2249;
            int regionNext2417 = regionValue2250;
            int regionNext2418 = regionValue2250;
            regionValue2409 = regionNext2414;
            regionValue2410 = regionNext2415;
            regionValue2411 = regionNext2416;
            regionValue2412 = regionNext2417;
            regionValue2413 = regionNext2418;
            break region844;
        }
        }
        if (regionValue2413 != 0) {
            break region998;
        } else {
            java.lang.Object regionNext2423 = regionValue2409;
            long regionNext2424 = regionValue2410;
            java.lang.Object regionNext2425 = regionValue2411;
            int regionNext2426 = regionValue2412;
            regionValue2419 = regionNext2423;
            regionValue2420 = regionNext2424;
            regionValue2421 = regionNext2425;
            regionValue2422 = regionNext2426;
            break region845;
        }
        }
        java.lang.Object regionNext2427 = regionValue2419;
        long regionNext2428 = regionValue2420;
        java.lang.Object regionNext2429 = regionValue2421;
        int regionNext2430 = regionValue2422;
        regionValue694 = regionNext2427;
        regionValue695 = regionNext2428;
        regionValue696 = regionNext2429;
        regionValue697 = regionNext2430;
        break region847;
        }
        java.lang.Object initialValue2431 = recovery$indy$flow$266();
        java.lang.Object initialValue2432 = recovery$indy$flow$267(initialValue2431, -790899366604326709L, regionValue695);
        float initialValue2433 = recovery$indy$flow$268(initialValue2432);
        double converted2434 = (double) (initialValue2433);
        int comparison2435 = (java.lang.Double.isNaN(converted2434) || java.lang.Double.isNaN(Double.longBitsToDouble(4603579539098121011L)) ? 1 : (converted2434 > Double.longBitsToDouble(4603579539098121011L) ? 1 : converted2434 == Double.longBitsToDouble(4603579539098121011L) ? 0 : -1));
        java.lang.Object regionNext2436 = regionValue694;
        long regionNext2437 = regionValue695;
        java.lang.Object regionNext2438 = regionValue696;
        int regionNext2439 = regionValue697;
        int regionNext2440 = comparison2435;
        regionValue2399 = regionNext2436;
        regionValue2400 = regionNext2437;
        regionValue2401 = regionNext2438;
        regionValue2402 = regionNext2439;
        regionValue2403 = regionNext2440;
        break region857;
        }
        if (regionValue2402 == 0) {
            java.lang.Object regionNext2446 = regionValue2399;
            long regionNext2447 = regionValue2400;
            java.lang.Object regionNext2448 = regionValue2401;
            int regionNext2449 = regionValue2402;
            int regionNext2450 = regionValue2403;
            regionValue2441 = regionNext2446;
            regionValue2442 = regionNext2447;
            regionValue2443 = regionNext2448;
            regionValue2444 = regionNext2449;
            regionValue2445 = regionNext2450;
            break region879;
        } else {
            java.lang.Object regionNext2456 = regionValue2399;
            long regionNext2457 = regionValue2400;
            java.lang.Object regionNext2458 = regionValue2401;
            int regionNext2459 = regionValue2402;
            int regionNext2460 = regionValue2403;
            regionValue2451 = regionNext2456;
            regionValue2452 = regionNext2457;
            regionValue2453 = regionNext2458;
            regionValue2454 = regionNext2459;
            regionValue2455 = regionNext2460;
            break region859;
        }
        }
        if (regionValue2455 <= 0) {
            break region880;
        } else {
            java.lang.Object regionNext2465 = regionValue2451;
            long regionNext2466 = regionValue2452;
            java.lang.Object regionNext2467 = regionValue2453;
            int regionNext2468 = regionValue2454;
            regionValue2461 = regionNext2465;
            regionValue2462 = regionNext2466;
            regionValue2463 = regionNext2467;
            regionValue2464 = regionNext2468;
            break region860;
        }
        }
        java.lang.Object regionNext2473 = regionValue2461;
        long regionNext2474 = regionValue2462;
        java.lang.Object regionNext2475 = regionValue2463;
        int regionNext2476 = regionValue2464;
        regionValue2469 = regionNext2473;
        regionValue2470 = regionNext2474;
        regionValue2471 = regionNext2475;
        regionValue2472 = regionNext2476;
        break region862;
        }
        java.lang.Object initialValue2477 = recovery$indy$flow$269();
        java.lang.Object initialValue2478 = recovery$indy$flow$270(initialValue2477, -790899366604326709L, regionValue2470);
        if (regionValue2472 == 0) {
            java.lang.Object regionNext2484 = regionValue2469;
            long regionNext2485 = regionValue2470;
            java.lang.Object regionNext2486 = regionValue2471;
            int regionNext2487 = regionValue2472;
            java.lang.Object regionNext2488 = initialValue2478;
            regionValue2479 = regionNext2484;
            regionValue2480 = regionNext2485;
            regionValue2481 = regionNext2486;
            regionValue2482 = regionNext2487;
            regionValue2483 = regionNext2488;
            break region891;
        } else {
            java.lang.Object regionNext2494 = regionValue2469;
            long regionNext2495 = regionValue2470;
            java.lang.Object regionNext2496 = regionValue2471;
            int regionNext2497 = regionValue2472;
            java.lang.Object regionNext2498 = initialValue2478;
            regionValue2489 = regionNext2494;
            regionValue2490 = regionNext2495;
            regionValue2491 = regionNext2496;
            regionValue2492 = regionNext2497;
            regionValue2493 = regionNext2498;
            break region868;
        }
        }
        java.lang.Object regionNext2504 = regionValue2489;
        long regionNext2505 = regionValue2490;
        java.lang.Object regionNext2506 = regionValue2491;
        int regionNext2507 = regionValue2492;
        java.lang.Object regionNext2508 = regionValue2493;
        regionValue2499 = regionNext2504;
        regionValue2500 = regionNext2505;
        regionValue2501 = regionNext2506;
        regionValue2502 = regionNext2507;
        regionValue2503 = regionNext2508;
        break region870;
        }
        java.lang.Object initialValue2509 = recovery$indy$flow$271(regionValue2503);
        double initialValue2510 = recovery$indy$flow$272(initialValue2509);
        double initialValue2511 = recovery$indy$flow$273(regionValue2501);
        double computed2512 = initialValue2510 - initialValue2511;
        int comparison2513 = (java.lang.Double.isNaN(computed2512) || java.lang.Double.isNaN(Double.longBitsToDouble(4603579539098121011L)) ? 1 : (computed2512 > Double.longBitsToDouble(4603579539098121011L) ? 1 : computed2512 == Double.longBitsToDouble(4603579539098121011L) ? 0 : -1));
        java.lang.Object regionNext2514 = regionValue2499;
        long regionNext2515 = regionValue2500;
        java.lang.Object regionNext2516 = regionValue2501;
        int regionNext2517 = regionValue2502;
        int regionNext2518 = comparison2513;
        regionValue2441 = regionNext2514;
        regionValue2442 = regionNext2515;
        regionValue2443 = regionNext2516;
        regionValue2444 = regionNext2517;
        regionValue2445 = regionNext2518;
        break region879;
        }
        if (regionValue2445 > 0) {
            java.lang.Object regionNext2523 = regionValue2441;
            long regionNext2524 = regionValue2442;
            java.lang.Object regionNext2525 = regionValue2443;
            int regionNext2526 = regionValue2444;
            regionValue2519 = regionNext2523;
            regionValue2520 = regionNext2524;
            regionValue2521 = regionNext2525;
            regionValue2522 = regionNext2526;
            break region881;
        } else {
            break region880;
        }
        }
        return;
        }
        java.lang.Object initialValue2527 = recovery$indy$flow$274();
        java.lang.Object initialValue2528 = recovery$indy$flow$275(initialValue2527, -791881089507173125L, regionValue2520);
        recovery$indy$flow$276(initialValue2528, Float.intBitsToFloat(1056964608));
        java.lang.Object initialValue2529 = recovery$indy$flow$277();
        java.lang.Object initialValue2530 = recovery$indy$flow$278(initialValue2529, -790899366604326709L, regionValue2520);
        java.lang.Object regionNext2531 = regionValue2519;
        long regionNext2532 = regionValue2520;
        java.lang.Object regionNext2533 = regionValue2521;
        int regionNext2534 = regionValue2522;
        java.lang.Object regionNext2535 = initialValue2530;
        regionValue2479 = regionNext2531;
        regionValue2480 = regionNext2532;
        regionValue2481 = regionNext2533;
        regionValue2482 = regionNext2534;
        regionValue2483 = regionNext2535;
        break region891;
        }
        java.lang.Object initialValue2536 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(regionValue2483)))).field_49m));
        java.lang.Object initialValue2537 = recovery$indy$flow$281();
        java.lang.Object initialValue2538 = recovery$indy$flow$282(initialValue2537, -790899366604326709L, regionValue2480);
        double initialValue2539 = recovery$indy$flow$283(initialValue2538);
        java.lang.Object initialValue2540 = recovery$indy$flow$284();
        java.lang.Object initialValue2541 = recovery$indy$flow$285(initialValue2540, -790899366604326709L, regionValue2480);
        double initialValue2542 = recovery$indy$flow$286(initialValue2541);
        double computed2543 = initialValue2542 + Double.longBitsToDouble(4602678819172646912L);
        java.lang.Object initialValue2544 = recovery$indy$flow$287();
        java.lang.Object initialValue2545 = recovery$indy$flow$288(initialValue2544, -790899366604326709L, regionValue2480);
        double initialValue2546 = recovery$indy$flow$289(initialValue2545);
        net.C_479J initialized2547 = new net.C_479J(initialValue2539, computed2543, initialValue2546, true);
        recovery$indy$flow$291(initialValue2536, initialized2547);
        recovery$indy$flow$292(regionValue2479, true);
        int comparison2548 = (regionValue2480 > 0L ? 1 : regionValue2480 == 0L ? 0 : -1);
        if (comparison2548 < 0) {
            java.lang.Object regionNext2554 = regionValue2479;
            long regionNext2555 = regionValue2480;
            java.lang.Object regionNext2556 = regionValue2481;
            int regionNext2557 = regionValue2482;
            int regionNext2558 = regionValue2482;
            regionValue2549 = regionNext2554;
            regionValue2550 = regionNext2555;
            regionValue2551 = regionNext2556;
            regionValue2552 = regionNext2557;
            regionValue2553 = regionNext2558;
            break region935;
        } else {
            java.lang.Object regionNext2564 = regionValue2479;
            long regionNext2565 = regionValue2480;
            java.lang.Object regionNext2566 = regionValue2481;
            int regionNext2567 = regionValue2482;
            int regionNext2568 = regionValue2482;
            regionValue2559 = regionNext2564;
            regionValue2560 = regionNext2565;
            regionValue2561 = regionNext2566;
            regionValue2562 = regionNext2567;
            regionValue2563 = regionNext2568;
            break region922;
        }
        }
        if (regionValue2563 != 0) {
            break region998;
        } else {
            java.lang.Object regionNext2573 = regionValue2559;
            long regionNext2574 = regionValue2560;
            java.lang.Object regionNext2575 = regionValue2561;
            int regionNext2576 = regionValue2562;
            regionValue2569 = regionNext2573;
            regionValue2570 = regionNext2574;
            regionValue2571 = regionNext2575;
            regionValue2572 = regionNext2576;
            break region923;
        }
        }
        java.lang.Object regionNext2577 = regionValue2569;
        long regionNext2578 = regionValue2570;
        java.lang.Object regionNext2579 = regionValue2571;
        int regionNext2580 = regionValue2572;
        regionValue702 = regionNext2577;
        regionValue703 = regionNext2578;
        regionValue704 = regionNext2579;
        regionValue705 = regionNext2580;
        break region925;
        }
        java.lang.Object initialValue2581 = recovery$indy$flow$293();
        java.lang.Object initialValue2582 = recovery$indy$flow$294(initialValue2581, -790899366604326709L, regionValue703);
        float initialValue2583 = recovery$indy$flow$295(initialValue2582);
        double converted2584 = (double) (initialValue2583);
        int comparison2585 = (java.lang.Double.isNaN(converted2584) || java.lang.Double.isNaN(Double.longBitsToDouble(4603579539098121011L)) ? 1 : (converted2584 > Double.longBitsToDouble(4603579539098121011L) ? 1 : converted2584 == Double.longBitsToDouble(4603579539098121011L) ? 0 : -1));
        java.lang.Object regionNext2586 = regionValue702;
        long regionNext2587 = regionValue703;
        java.lang.Object regionNext2588 = regionValue704;
        int regionNext2589 = regionValue705;
        int regionNext2590 = comparison2585;
        regionValue2549 = regionNext2586;
        regionValue2550 = regionNext2587;
        regionValue2551 = regionNext2588;
        regionValue2552 = regionNext2589;
        regionValue2553 = regionNext2590;
        break region935;
        }
        if (regionValue2552 == 0) {
            java.lang.Object regionNext2594 = regionValue2549;
            long regionNext2595 = regionValue2550;
            int regionNext2596 = regionValue2553;
            regionValue2591 = regionNext2594;
            regionValue2592 = regionNext2595;
            regionValue2593 = regionNext2596;
            break region957;
        } else {
            java.lang.Object regionNext2602 = regionValue2549;
            long regionNext2603 = regionValue2550;
            java.lang.Object regionNext2604 = regionValue2551;
            int regionNext2605 = regionValue2552;
            int regionNext2606 = regionValue2553;
            regionValue2597 = regionNext2602;
            regionValue2598 = regionNext2603;
            regionValue2599 = regionNext2604;
            regionValue2600 = regionNext2605;
            regionValue2601 = regionNext2606;
            break region937;
        }
        }
        if (regionValue2601 <= 0) {
            break region958;
        } else {
            java.lang.Object regionNext2611 = regionValue2597;
            long regionNext2612 = regionValue2598;
            java.lang.Object regionNext2613 = regionValue2599;
            int regionNext2614 = regionValue2600;
            regionValue2607 = regionNext2611;
            regionValue2608 = regionNext2612;
            regionValue2609 = regionNext2613;
            regionValue2610 = regionNext2614;
            break region938;
        }
        }
        java.lang.Object regionNext2619 = regionValue2607;
        long regionNext2620 = regionValue2608;
        java.lang.Object regionNext2621 = regionValue2609;
        int regionNext2622 = regionValue2610;
        regionValue2615 = regionNext2619;
        regionValue2616 = regionNext2620;
        regionValue2617 = regionNext2621;
        regionValue2618 = regionNext2622;
        break region940;
        }
        java.lang.Object initialValue2623 = recovery$indy$flow$296();
        java.lang.Object initialValue2624 = recovery$indy$flow$297(initialValue2623, -790899366604326709L, regionValue2616);
        if (regionValue2618 == 0) {
            java.lang.Object regionNext2628 = regionValue2615;
            long regionNext2629 = regionValue2616;
            java.lang.Object regionNext2630 = initialValue2624;
            regionValue2625 = regionNext2628;
            regionValue2626 = regionNext2629;
            regionValue2627 = regionNext2630;
            break region969;
        } else {
            java.lang.Object regionNext2635 = regionValue2615;
            long regionNext2636 = regionValue2616;
            java.lang.Object regionNext2637 = regionValue2617;
            java.lang.Object regionNext2638 = initialValue2624;
            regionValue2631 = regionNext2635;
            regionValue2632 = regionNext2636;
            regionValue2633 = regionNext2637;
            regionValue2634 = regionNext2638;
            break region946;
        }
        }
        java.lang.Object regionNext2643 = regionValue2631;
        long regionNext2644 = regionValue2632;
        java.lang.Object regionNext2645 = regionValue2633;
        java.lang.Object regionNext2646 = regionValue2634;
        regionValue2639 = regionNext2643;
        regionValue2640 = regionNext2644;
        regionValue2641 = regionNext2645;
        regionValue2642 = regionNext2646;
        break region948;
        }
        java.lang.Object initialValue2647 = recovery$indy$flow$298(regionValue2642);
        double initialValue2648 = recovery$indy$flow$299(initialValue2647);
        double initialValue2649 = recovery$indy$flow$300(regionValue2641);
        double computed2650 = initialValue2648 - initialValue2649;
        int comparison2651 = (java.lang.Double.isNaN(computed2650) || java.lang.Double.isNaN(Double.longBitsToDouble(4603579539098121011L)) ? 1 : (computed2650 > Double.longBitsToDouble(4603579539098121011L) ? 1 : computed2650 == Double.longBitsToDouble(4603579539098121011L) ? 0 : -1));
        java.lang.Object regionNext2652 = regionValue2639;
        long regionNext2653 = regionValue2640;
        int regionNext2654 = comparison2651;
        regionValue2591 = regionNext2652;
        regionValue2592 = regionNext2653;
        regionValue2593 = regionNext2654;
        break region957;
        }
        if (regionValue2593 > 0) {
            java.lang.Object regionNext2657 = regionValue2591;
            long regionNext2658 = regionValue2592;
            regionValue2655 = regionNext2657;
            regionValue2656 = regionNext2658;
            break region959;
        } else {
            break region958;
        }
        }
        return;
        }
        java.lang.Object initialValue2659 = recovery$indy$flow$301();
        java.lang.Object initialValue2660 = recovery$indy$flow$302(initialValue2659, -791881089507173125L, regionValue2656);
        recovery$indy$flow$303(initialValue2660, Float.intBitsToFloat(1056964608));
        java.lang.Object initialValue2661 = recovery$indy$flow$304();
        java.lang.Object initialValue2662 = recovery$indy$flow$305(initialValue2661, -790899366604326709L, regionValue2656);
        java.lang.Object regionNext2663 = regionValue2655;
        long regionNext2664 = regionValue2656;
        java.lang.Object regionNext2665 = initialValue2662;
        regionValue2625 = regionNext2663;
        regionValue2626 = regionNext2664;
        regionValue2627 = regionNext2665;
        break region969;
        }
        java.lang.Object initialValue2666 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(regionValue2627)))).field_49m));
        java.lang.Object initialValue2667 = recovery$indy$flow$308();
        java.lang.Object initialValue2668 = recovery$indy$flow$309(initialValue2667, -790899366604326709L, regionValue2626);
        double initialValue2669 = recovery$indy$flow$310(initialValue2668);
        java.lang.Object initialValue2670 = recovery$indy$flow$311();
        java.lang.Object initialValue2671 = recovery$indy$flow$312(initialValue2670, -790899366604326709L, regionValue2626);
        double initialValue2672 = recovery$indy$flow$313(initialValue2671);
        double computed2673 = initialValue2672 + Double.longBitsToDouble(4602678819172646912L);
        java.lang.Object initialValue2674 = recovery$indy$flow$314();
        java.lang.Object initialValue2675 = recovery$indy$flow$315(initialValue2674, -790899366604326709L, regionValue2626);
        double initialValue2676 = recovery$indy$flow$316(initialValue2675);
        net.C_479J initialized2677 = new net.C_479J(initialValue2669, computed2673, initialValue2676, true);
        recovery$indy$flow$318(initialValue2666, initialized2677);
        recovery$indy$flow$319(regionValue2625, true);
        recovery$indy$flow$320(regionValue2625, 0);
        break region998;
        }
        return;
    }











    private static native java.lang.reflect.Method h(long a0,long a1);

    private static native int e(long a0,long a1);

    private static native java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   public void method_40$1a6214e3f4(long var1, C_47Rw var3) {
      long var4 = var1 ^ 53357312556124L;
      long var6 = var1 ^ 95914852349943L;
      long var10000 = 3605505258644357118L;
      byte var8 = (byte) ((Fly_47kE.method_49t$aae029aa0a()) ? 1 : 0);
      long var10002 = 3607204611675291586L;
      Minecraft var11 = field_43;
      int var10001 = (int) ((var11.field_42P.field_48M) ? 1 : 0);
      if (var8 == 0) {
         var10001 = var11.field_42P.field_48M ? this.field_43y + 1 : 0;
      }

      this.field_43y = var10001;
      var10002 = 3606607248763717521L;
      long var12 = var6;
      ModeSetting var14 = this.settingModes;
      if (var14.method_46$5f9dc63072(var12).equals("Legit")) {
         float var10;
         label74: {
            var10000 = 3605797181578219986L;
            Client var30 = Client.method_44$fbc0c0be91();
            long var32 = 3605144564744845321L;
            Client var15 = var30;
            AutoWalk_47Cb var9 = var15.method_45$4a5eee04b7().field_44B;
            long var33 = 3607204611675291586L;
            Minecraft var16 = field_43;
            var10 = var16.field_42P.field_48h;
            byte var31 = var8;
            if (var1 > 0L) {
               if (var8 != 0) {
                  break label74;
               }

               var10002 = 3606626965355199130L;
               long var17 = var4;
               AutoWalk_47Cb var19 = var9;
               var31 = (byte) ((var19.method_46$0dd78e0064(var17)) ? 1 : 0);
            }

            label75: {
               if (var1 >= 0L) {
                  if (var31 == 0) {
                     break label75;
                  }

                  long var34 = 3604211425717578782L;
                  BooleanSetting var20 = var9.settingPathFinding;
                  var31 = (byte) ((var20.method_49$aae029aa0a()) ? 1 : 0);
               }

               byte var35 = var8;
               if (var1 >= 0L) {
                  if (var8 == 0) {
                     if (var31 == 0) {
                        break label75;
                     }

                     var10002 = 3606607248763717521L;
                     long var21 = var6;
                     ModeSetting var23 = var9.settingMovementmode;
                     var31 = (byte) ((var23.method_46$5f9dc63072(var21).equalsIgnoreCase("silent")) ? 1 : 0);
                  }

                  var35 = var8;
               }

               if (var35 == 0) {
                  if (var31 == 0) {
                     break label75;
                  }

                  long var44;
                  var31 = (byte)((var44 = System.currentTimeMillis() - var9.field_47E - 100L) == 0L ? 0 : (var44 < 0L ? -1 : 1));
               }

               if (var31 < 0) {
                  long var36 = 3607204611675291586L;
                  Minecraft var24 = field_43;
                  var24.field_42P.field_48h = var9.field_47i;
               }
            }

            long var37 = 3607204611675291586L;
            Minecraft var25 = field_43;
            var10002 = 3607204611675291586L;
            Minecraft var26 = field_43;
            float var38 = (float)(var26.field_42P.field_48Q - this.field_430) * 1.6F;
            long var10003 = 3607204611675291586L;
            Minecraft var27 = field_43;
            var25.field_42P.method_46$dd322a622a(var38, (float)(var27.field_42P.field_42o - this.field_43F) * 1.6F);
         }

         long var39 = 3607204611675291586L;
         Minecraft var28 = field_43;
         var28.field_42P.field_48h = var10;
      }
   }




   private boolean method_49F$aae029aa0a() {
      long var1 = a ^ 121762033326423L;
      long var3 = var1 ^ 28506441903936L;
      long var10000 = 3079931325141526345L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10002 = 3078897513836388134L;
      long var6 = var3;
      ModeSetting var8 = this.settingModes;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("NCPPacket");
      if (!var5) {
         if (!var12) {
            var10002 = 3078897513836388134L;
            long var9 = var3;
            ModeSetting var11 = this.settingModes;
            boolean var14 = var11.method_46$5f9dc63072(var9).equals("Vanilla");
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



    public void method_44$cecb73866e(int a0,net.C_47K7 a1,long a2) {
        int constructorPart1 = a0;
        long constructorKey2 = a2;
        java.lang.Object regionValue30;
        int regionValue31;
        long regionValue32;
        long regionValue33;
        long regionValue34;
        long regionValue35;
        long regionValue36;
        long regionValue37;
        long regionValue38;
        int regionValue39;
        int regionValue40;
        java.lang.Object regionValue52;
        int regionValue53;
        long regionValue54;
        long regionValue55;
        long regionValue56;
        long regionValue57;
        long regionValue58;
        long regionValue59;
        long regionValue60;
        java.lang.Object regionValue61;
        int regionValue62;
        int regionValue63;
        int regionValue64;
        java.lang.Object regionValue78;
        int regionValue79;
        long regionValue80;
        long regionValue81;
        long regionValue82;
        long regionValue83;
        long regionValue84;
        long regionValue85;
        long regionValue86;
        java.lang.Object regionValue87;
        int regionValue88;
        int regionValue89;
        java.lang.Object regionValue102;
        int regionValue103;
        long regionValue104;
        long regionValue105;
        long regionValue106;
        long regionValue107;
        long regionValue108;
        long regionValue109;
        long regionValue110;
        java.lang.Object regionValue111;
        int regionValue112;
        int regionValue113;
        java.lang.Object regionValue126;
        int regionValue127;
        long regionValue128;
        long regionValue129;
        long regionValue130;
        long regionValue131;
        long regionValue132;
        long regionValue133;
        long regionValue134;
        java.lang.Object regionValue135;
        int regionValue136;
        int regionValue137;
        java.lang.Object regionValue150;
        int regionValue151;
        long regionValue152;
        long regionValue153;
        long regionValue154;
        long regionValue155;
        long regionValue156;
        long regionValue157;
        long regionValue158;
        java.lang.Object regionValue159;
        int regionValue160;
        int regionValue161;
        java.lang.Object regionValue174;
        int regionValue175;
        long regionValue176;
        long regionValue177;
        long regionValue178;
        long regionValue179;
        long regionValue180;
        long regionValue181;
        long regionValue182;
        int regionValue183;
        int regionValue184;
        java.lang.Object regionValue210;
        int regionValue211;
        long regionValue212;
        long regionValue213;
        long regionValue214;
        long regionValue215;
        long regionValue216;
        long regionValue217;
        long regionValue218;
        java.lang.Object regionValue219;
        int regionValue220;
        int regionValue221;
        int regionValue222;
        java.lang.Object regionValue236;
        int regionValue237;
        long regionValue238;
        long regionValue239;
        long regionValue240;
        long regionValue241;
        long regionValue242;
        long regionValue243;
        long regionValue244;
        java.lang.Object regionValue245;
        int regionValue246;
        int regionValue247;
        int regionValue248;
        java.lang.Object regionValue273;
        int regionValue274;
        long regionValue275;
        long regionValue276;
        long regionValue277;
        long regionValue278;
        long regionValue279;
        long regionValue280;
        long regionValue281;
        java.lang.Object regionValue282;
        int regionValue283;
        java.lang.Object regionValue295;
        int regionValue296;
        long regionValue297;
        long regionValue298;
        long regionValue299;
        long regionValue300;
        long regionValue301;
        long regionValue302;
        long regionValue303;
        java.lang.Object regionValue304;
        int regionValue305;
        java.lang.Object regionValue319;
        int regionValue320;
        long regionValue321;
        long regionValue322;
        long regionValue323;
        long regionValue324;
        long regionValue325;
        long regionValue326;
        long regionValue327;
        java.lang.Object regionValue328;
        int regionValue329;
        int regionValue330;
        int regionValue331;
        java.lang.Object regionValue345;
        int regionValue346;
        long regionValue347;
        long regionValue348;
        long regionValue349;
        long regionValue350;
        long regionValue351;
        long regionValue352;
        long regionValue353;
        java.lang.Object regionValue354;
        int regionValue355;
        int regionValue356;
        int regionValue357;
        java.lang.Object regionValue382;
        int regionValue383;
        long regionValue384;
        long regionValue385;
        long regionValue386;
        long regionValue387;
        long regionValue388;
        long regionValue389;
        long regionValue390;
        java.lang.Object regionValue391;
        int regionValue392;
        int regionValue393;
        java.lang.Object regionValue445;
        int regionValue446;
        long regionValue447;
        long regionValue448;
        long regionValue449;
        long regionValue450;
        long regionValue451;
        long regionValue452;
        long regionValue453;
        java.lang.Object regionValue454;
        int regionValue455;
        int regionValue456;
        int regionValue457;
        java.lang.Object regionValue482;
        int regionValue483;
        long regionValue484;
        long regionValue485;
        long regionValue486;
        long regionValue487;
        long regionValue488;
        long regionValue489;
        long regionValue490;
        java.lang.Object regionValue491;
        int regionValue492;
        java.lang.Object regionValue504;
        int regionValue505;
        long regionValue506;
        long regionValue507;
        long regionValue508;
        long regionValue509;
        long regionValue510;
        long regionValue511;
        long regionValue512;
        java.lang.Object regionValue513;
        int regionValue514;
        java.lang.Object regionValue527;
        int regionValue528;
        long regionValue529;
        long regionValue530;
        long regionValue531;
        long regionValue532;
        long regionValue533;
        long regionValue534;
        long regionValue535;
        java.lang.Object regionValue536;
        int regionValue537;
        int regionValue538;
        int regionValue539;
        java.lang.Object regionValue553;
        int regionValue554;
        long regionValue555;
        long regionValue556;
        long regionValue557;
        long regionValue558;
        long regionValue559;
        long regionValue560;
        long regionValue561;
        java.lang.Object regionValue562;
        int regionValue563;
        int regionValue564;
        int regionValue565;
        java.lang.Object regionValue590;
        int regionValue591;
        long regionValue592;
        long regionValue593;
        long regionValue594;
        long regionValue595;
        long regionValue596;
        long regionValue597;
        long regionValue598;
        java.lang.Object regionValue599;
        int regionValue600;
        int regionValue601;
        java.lang.Object regionValue653;
        int regionValue654;
        long regionValue655;
        long regionValue656;
        long regionValue657;
        long regionValue658;
        long regionValue659;
        long regionValue660;
        long regionValue661;
        java.lang.Object regionValue662;
        int regionValue663;
        int regionValue664;
        int regionValue665;
        java.lang.Object regionValue690;
        int regionValue691;
        long regionValue692;
        long regionValue693;
        long regionValue694;
        long regionValue695;
        long regionValue696;
        long regionValue697;
        long regionValue698;
        java.lang.Object regionValue699;
        int regionValue700;
        java.lang.Object regionValue712;
        int regionValue713;
        long regionValue714;
        long regionValue715;
        long regionValue716;
        long regionValue717;
        long regionValue718;
        long regionValue719;
        long regionValue720;
        java.lang.Object regionValue721;
        int regionValue722;
        java.lang.Object regionValue735;
        int regionValue736;
        long regionValue737;
        long regionValue738;
        long regionValue739;
        long regionValue740;
        long regionValue741;
        long regionValue742;
        long regionValue743;
        int regionValue744;
        int regionValue745;
        int regionValue746;
        java.lang.Object regionValue759;
        int regionValue760;
        long regionValue761;
        long regionValue762;
        long regionValue763;
        long regionValue764;
        long regionValue765;
        long regionValue766;
        long regionValue767;
        java.lang.Object regionValue768;
        int regionValue769;
        int regionValue770;
        int regionValue771;
        java.lang.Object regionValue796;
        int regionValue797;
        long regionValue798;
        long regionValue799;
        long regionValue800;
        long regionValue801;
        long regionValue802;
        long regionValue803;
        long regionValue804;
        java.lang.Object regionValue805;
        int regionValue806;
        int regionValue807;
        java.lang.Object regionValue848;
        int regionValue849;
        long regionValue850;
        long regionValue851;
        long regionValue852;
        long regionValue853;
        long regionValue854;
        long regionValue855;
        long regionValue856;
        int regionValue857;
        int regionValue858;
        int regionValue859;
        java.lang.Object regionValue872;
        int regionValue873;
        long regionValue874;
        long regionValue875;
        long regionValue876;
        long regionValue877;
        long regionValue878;
        long regionValue879;
        long regionValue880;
        int regionValue881;
        int regionValue882;
        int regionValue883;
        int regionValue884;
        java.lang.Object regionValue909;
        int regionValue910;
        long regionValue911;
        long regionValue912;
        long regionValue913;
        long regionValue914;
        long regionValue915;
        long regionValue916;
        long regionValue917;
        int regionValue918;
        int regionValue919;
        int regionValue920;
        java.lang.Object regionValue933;
        int regionValue934;
        long regionValue935;
        long regionValue936;
        long regionValue937;
        long regionValue938;
        long regionValue939;
        long regionValue940;
        long regionValue941;
        int regionValue942;
        int regionValue943;
        int regionValue944;
        java.lang.Object regionValue968;
        int regionValue969;
        long regionValue970;
        long regionValue971;
        long regionValue972;
        long regionValue973;
        long regionValue974;
        long regionValue975;
        long regionValue976;
        int regionValue977;
        java.lang.Object regionValue1024;
        int regionValue1025;
        long regionValue1026;
        long regionValue1027;
        long regionValue1028;
        long regionValue1029;
        long regionValue1030;
        long regionValue1031;
        long regionValue1032;
        int regionValue1033;
        int regionValue1034;
        int regionValue1035;
        java.lang.Object regionValue1048;
        int regionValue1049;
        long regionValue1050;
        long regionValue1051;
        long regionValue1052;
        long regionValue1053;
        long regionValue1054;
        long regionValue1055;
        long regionValue1056;
        int regionValue1057;
        int regionValue1058;
        int regionValue1059;
        java.lang.Object regionValue1072;
        int regionValue1073;
        long regionValue1074;
        long regionValue1075;
        long regionValue1076;
        long regionValue1077;
        long regionValue1078;
        long regionValue1079;
        long regionValue1080;
        int regionValue1081;
        int regionValue1082;
        java.lang.Object regionValue1094;
        int regionValue1095;
        long regionValue1096;
        long regionValue1097;
        long regionValue1098;
        long regionValue1099;
        long regionValue1100;
        long regionValue1101;
        long regionValue1102;
        int regionValue1103;
        int regionValue1104;
        java.lang.Object regionValue1116;
        int regionValue1117;
        long regionValue1118;
        long regionValue1119;
        long regionValue1120;
        long regionValue1121;
        long regionValue1122;
        long regionValue1123;
        long regionValue1124;
        int regionValue1125;
        int regionValue1126;
        java.lang.Object regionValue1138;
        int regionValue1139;
        long regionValue1140;
        long regionValue1141;
        long regionValue1142;
        long regionValue1143;
        long regionValue1144;
        long regionValue1145;
        long regionValue1146;
        int regionValue1147;
        java.lang.Object regionValue1158;
        int regionValue1159;
        long regionValue1160;
        long regionValue1161;
        long regionValue1162;
        long regionValue1163;
        long regionValue1164;
        long regionValue1165;
        int regionValue1166;
        java.lang.Object regionValue1176;
        int regionValue1177;
        long regionValue1178;
        long regionValue1179;
        int regionValue1180;
        java.lang.Object regionValue1186;
        int regionValue1187;
        long regionValue1188;
        long regionValue1189;
        int regionValue1190;
        java.lang.Object regionValue1222;
        int regionValue1223;
        long regionValue1224;
        long regionValue1225;
        long regionValue1226;
        long regionValue1227;
        long regionValue1228;
        long regionValue1229;
        int regionValue1230;
        int regionValue1231;
        java.lang.Object regionValue1242;
        int regionValue1243;
        long regionValue1244;
        long regionValue1245;
        long regionValue1246;
        long regionValue1247;
        long regionValue1248;
        long regionValue1249;
        long regionValue1250;
        int regionValue1251;
        int regionValue1252;
        java.lang.Object regionValue1264;
        int regionValue1265;
        long regionValue1266;
        long regionValue1267;
        long regionValue1268;
        long regionValue1269;
        long regionValue1270;
        long regionValue1271;
        int regionValue1272;
        java.lang.Object regionValue1282;
        int regionValue1283;
        long regionValue1284;
        long regionValue1285;
        long regionValue1286;
        long regionValue1287;
        long regionValue1288;
        long regionValue1289;
        long regionValue1290;
        int regionValue1291;
        java.lang.Object regionValue1314;
        int regionValue1315;
        long regionValue1316;
        long regionValue1317;
        long regionValue1318;
        long regionValue1319;
        long regionValue1320;
        long regionValue1321;
        int regionValue1322;
        int regionValue1323;
        java.lang.Object regionValue1334;
        int regionValue1335;
        long regionValue1336;
        long regionValue1337;
        long regionValue1338;
        long regionValue1339;
        long regionValue1340;
        long regionValue1341;
        int regionValue1342;
        int regionValue1343;
        java.lang.Object regionValue1363;
        int regionValue1364;
        long regionValue1365;
        long regionValue1366;
        long regionValue1367;
        long regionValue1368;
        long regionValue1369;
        long regionValue1370;
        int regionValue1371;
        java.lang.Object regionValue1381;
        int regionValue1382;
        long regionValue1383;
        long regionValue1384;
        long regionValue1385;
        long regionValue1386;
        long regionValue1387;
        long regionValue1388;
        int regionValue1389;
        java.lang.Object regionValue1403;
        int regionValue1404;
        long regionValue1405;
        long regionValue1406;
        long regionValue1407;
        long regionValue1408;
        long regionValue1409;
        long regionValue1410;
        int regionValue1411;
        int regionValue1412;
        int regionValue1413;
        java.lang.Object regionValue1425;
        int regionValue1426;
        long regionValue1427;
        long regionValue1428;
        long regionValue1429;
        long regionValue1430;
        long regionValue1431;
        long regionValue1432;
        int regionValue1433;
        int regionValue1434;
        int regionValue1435;
        java.lang.Object regionValue1447;
        int regionValue1448;
        long regionValue1449;
        long regionValue1450;
        long regionValue1451;
        long regionValue1452;
        long regionValue1453;
        long regionValue1454;
        int regionValue1455;
        int regionValue1456;
        int regionValue1457;
        java.lang.Object regionValue1479;
        int regionValue1480;
        long regionValue1481;
        long regionValue1482;
        long regionValue1483;
        long regionValue1484;
        long regionValue1485;
        long regionValue1486;
        int regionValue1487;
        int regionValue1488;
        java.lang.Object regionValue1499;
        int regionValue1500;
        long regionValue1501;
        long regionValue1502;
        long regionValue1503;
        long regionValue1504;
        long regionValue1505;
        long regionValue1506;
        int regionValue1507;
        int regionValue1508;
        java.lang.Object regionValue1528;
        int regionValue1529;
        long regionValue1530;
        long regionValue1531;
        long regionValue1532;
        long regionValue1533;
        long regionValue1534;
        long regionValue1535;
        int regionValue1536;
        java.lang.Object regionValue1585;
        int regionValue1586;
        long regionValue1587;
        long regionValue1588;
        long regionValue1589;
        long regionValue1590;
        long regionValue1591;
        long regionValue1592;
        int regionValue1593;
        int regionValue1594;
        java.lang.Object regionValue1605;
        int regionValue1606;
        long regionValue1607;
        long regionValue1608;
        long regionValue1609;
        long regionValue1610;
        long regionValue1611;
        long regionValue1612;
        int regionValue1613;
        int regionValue1614;
        java.lang.Object regionValue1625;
        int regionValue1626;
        long regionValue1627;
        long regionValue1628;
        long regionValue1629;
        long regionValue1630;
        long regionValue1631;
        long regionValue1632;
        int regionValue1633;
        java.lang.Object regionValue1644;
        int regionValue1645;
        long regionValue1646;
        long regionValue1647;
        long regionValue1648;
        long regionValue1649;
        long regionValue1650;
        long regionValue1651;
        int regionValue1652;
        java.lang.Object regionValue1653;
        int regionValue1654;
        java.lang.Object regionValue1666;
        int regionValue1667;
        long regionValue1668;
        long regionValue1669;
        long regionValue1670;
        long regionValue1671;
        long regionValue1672;
        long regionValue1673;
        int regionValue1674;
        java.lang.Object regionValue1675;
        int regionValue1676;
        java.lang.Object regionValue1688;
        int regionValue1689;
        long regionValue1690;
        long regionValue1691;
        long regionValue1692;
        long regionValue1693;
        long regionValue1694;
        long regionValue1695;
        int regionValue1696;
        java.lang.Object regionValue1697;
        int regionValue1698;
        java.lang.Object regionValue1710;
        int regionValue1711;
        long regionValue1712;
        long regionValue1713;
        long regionValue1714;
        long regionValue1715;
        long regionValue1716;
        long regionValue1717;
        int regionValue1718;
        java.lang.Object regionValue1719;
        java.lang.Object regionValue1730;
        int regionValue1731;
        long regionValue1732;
        long regionValue1733;
        long regionValue1734;
        long regionValue1735;
        long regionValue1736;
        long regionValue1737;
        int regionValue1738;
        java.lang.Object regionValue1739;
        java.lang.Object regionValue1750;
        int regionValue1751;
        long regionValue1752;
        long regionValue1753;
        long regionValue1754;
        long regionValue1755;
        long regionValue1756;
        long regionValue1757;
        int regionValue1758;
        java.lang.Object regionValue1759;
        java.lang.Object regionValue1783;
        int regionValue1784;
        long regionValue1785;
        long regionValue1786;
        long regionValue1787;
        long regionValue1788;
        long regionValue1789;
        long regionValue1790;
        int regionValue1791;
        java.lang.Object regionValue1823;
        int regionValue1824;
        long regionValue1825;
        long regionValue1826;
        long regionValue1827;
        long regionValue1828;
        int regionValue1829;
        int regionValue1830;
        java.lang.Object regionValue1839;
        int regionValue1840;
        long regionValue1841;
        long regionValue1842;
        long regionValue1843;
        long regionValue1844;
        long regionValue1845;
        long regionValue1846;
        int regionValue1847;
        int regionValue1848;
        java.lang.Object regionValue1859;
        int regionValue1860;
        long regionValue1861;
        long regionValue1862;
        long regionValue1863;
        long regionValue1864;
        long regionValue1865;
        long regionValue1866;
        int regionValue1867;
        java.lang.Object regionValue1897;
        int regionValue1898;
        long regionValue1899;
        long regionValue1900;
        long regionValue1901;
        long regionValue1902;
        int regionValue1903;
        int regionValue1904;
        int regionValue1905;
        java.lang.Object regionValue1915;
        int regionValue1916;
        long regionValue1917;
        long regionValue1918;
        long regionValue1919;
        long regionValue1920;
        int regionValue1921;
        int regionValue1922;
        int regionValue1923;
        java.lang.Object regionValue1933;
        int regionValue1934;
        long regionValue1935;
        long regionValue1936;
        long regionValue1937;
        long regionValue1938;
        int regionValue1939;
        int regionValue1940;
        java.lang.Object regionValue1949;
        int regionValue1950;
        long regionValue1951;
        long regionValue1952;
        long regionValue1953;
        long regionValue1954;
        int regionValue1955;
        int regionValue1956;
        java.lang.Object regionValue1965;
        int regionValue1966;
        long regionValue1967;
        long regionValue1968;
        long regionValue1969;
        long regionValue1970;
        int regionValue1971;
        int regionValue1972;
        java.lang.Object regionValue1981;
        int regionValue1982;
        long regionValue1983;
        long regionValue1984;
        long regionValue1985;
        long regionValue1986;
        int regionValue1987;
        java.lang.Object regionValue2015;
        int regionValue2016;
        long regionValue2017;
        long regionValue2018;
        long regionValue2019;
        int regionValue2020;
        int regionValue2021;
        java.lang.Object regionValue2029;
        int regionValue2030;
        long regionValue2031;
        long regionValue2032;
        long regionValue2033;
        long regionValue2034;
        int regionValue2035;
        int regionValue2036;
        java.lang.Object regionValue2045;
        int regionValue2046;
        long regionValue2047;
        long regionValue2048;
        long regionValue2049;
        int regionValue2050;
        java.lang.Object regionValue2057;
        int regionValue2058;
        long regionValue2059;
        long regionValue2060;
        long regionValue2061;
        long regionValue2062;
        int regionValue2063;
        java.lang.Object regionValue2084;
        int regionValue2085;
        long regionValue2086;
        long regionValue2087;
        long regionValue2088;
        int regionValue2089;
        double regionValue2090;
        int regionValue2091;
        java.lang.Object regionValue2100;
        int regionValue2101;
        long regionValue2102;
        long regionValue2103;
        long regionValue2104;
        int regionValue2105;
        double regionValue2106;
        int regionValue2107;
        java.lang.Object regionValue2116;
        int regionValue2117;
        long regionValue2118;
        long regionValue2119;
        long regionValue2120;
        int regionValue2121;
        double regionValue2122;
        java.lang.Object regionValue2130;
        int regionValue2131;
        long regionValue2132;
        long regionValue2133;
        long regionValue2134;
        int regionValue2135;
        double regionValue2136;
        java.lang.Object regionValue2144;
        int regionValue2145;
        long regionValue2146;
        long regionValue2147;
        long regionValue2148;
        int regionValue2149;
        double regionValue2150;
        java.lang.Object regionValue2166;
        int regionValue2167;
        long regionValue2168;
        long regionValue2169;
        long regionValue2170;
        int regionValue2171;
        java.lang.Object regionValue2202;
        int regionValue2203;
        long regionValue2204;
        long regionValue2205;
        int regionValue2206;
        java.lang.Object regionValue2207;
        java.lang.Object regionValue2214;
        int regionValue2215;
        long regionValue2216;
        long regionValue2217;
        int regionValue2218;
        java.lang.Object regionValue2219;
        java.lang.Object regionValue2226;
        int regionValue2227;
        long regionValue2228;
        long regionValue2229;
        int regionValue2230;
        java.lang.Object regionValue2231;
        java.lang.Object regionValue2239;
        int regionValue2240;
        long regionValue2241;
        long regionValue2242;
        int regionValue2243;
        int regionValue2244;
        java.lang.Object regionValue2251;
        int regionValue2252;
        long regionValue2253;
        long regionValue2254;
        int regionValue2255;
        int regionValue2256;
        java.lang.Object regionValue2263;
        int regionValue2264;
        long regionValue2265;
        long regionValue2266;
        int regionValue2267;
        int regionValue2268;
        java.lang.Object regionValue2275;
        int regionValue2276;
        long regionValue2277;
        long regionValue2278;
        int regionValue2279;
        java.lang.Object regionValue2285;
        int regionValue2286;
        long regionValue2287;
        long regionValue2288;
        int regionValue2289;
        java.lang.Object regionValue2295;
        int regionValue2296;
        long regionValue2297;
        long regionValue2298;
        int regionValue2299;
        java.lang.Object regionValue2306;
        int regionValue2307;
        long regionValue2308;
        long regionValue2309;
        int regionValue2310;
        java.lang.Object regionValue2311;
        long regionValue2312;
        long regionValue2313;
        java.lang.Object regionValue2322;
        int regionValue2323;
        long regionValue2324;
        long regionValue2325;
        int regionValue2326;
        java.lang.Object regionValue2327;
        long regionValue2328;
        long regionValue2329;
        java.lang.Object regionValue2338;
        int regionValue2339;
        long regionValue2340;
        long regionValue2341;
        int regionValue2342;
        java.lang.Object regionValue2343;
        long regionValue2344;
        long regionValue2345;
        java.lang.Object regionValue2389;
        java.lang.Object regionValue2391;
        int regionValue2392;
        long regionValue2393;
        long regionValue2394;
        int regionValue2395;
        java.lang.Object regionValue2396;
        java.lang.Object regionValue2403;
        int regionValue2404;
        long regionValue2405;
        long regionValue2406;
        int regionValue2407;
        java.lang.Object regionValue2408;
        long regionValue2416;
        java.lang.Object regionValue2418;
        int regionValue2419;
        long regionValue2420;
        long regionValue2421;
        int regionValue2422;
        java.lang.Object regionValue2428;
        int regionValue2429;
        long regionValue2430;
        long regionValue2431;
        int regionValue2432;
        java.lang.Object regionValue2441;
        int regionValue2442;
        long regionValue2443;
        long regionValue2444;
        int regionValue2445;
        java.lang.Object regionValue2446;
        java.lang.Object regionValue2453;
        int regionValue2454;
        long regionValue2455;
        long regionValue2456;
        int regionValue2457;
        java.lang.Object regionValue2458;
        int regionValue2468;
        long regionValue2469;
        long regionValue2470;
        int regionValue2471;
        int regionValue2472;
        java.lang.Object regionValue2478;
        int regionValue2479;
        long regionValue2480;
        long regionValue2481;
        int regionValue2482;
        int regionValue2483;
        java.lang.Object regionValue2490;
        int regionValue2491;
        long regionValue2492;
        long regionValue2493;
        int regionValue2494;
        int regionValue2495;
        java.lang.Object regionValue2503;
        int regionValue2504;
        long regionValue2505;
        long regionValue2506;
        int regionValue2507;
        java.lang.Object regionValue2513;
        int regionValue2514;
        long regionValue2515;
        long regionValue2516;
        int regionValue2517;
        long regionValue2529;
        int regionValue2530;
        long regionValue2533;
        long regionValue2534;
        int regionValue2535;
        int regionValue2536;
        long regionValue2542;
        long regionValue2543;
        int regionValue2544;
        long regionValue2548;
        long regionValue2549;
        int regionValue2550;
        java.lang.Object regionValue2556;
        long regionValue2557;
        long regionValue2558;
        long regionValue2562;
        int regionValue2563;
        java.lang.Object regionValue2564;
        long regionValue2565;
        long regionValue2566;
        long regionValue2572;
        int regionValue2573;
        java.lang.Object regionValue2574;
        long regionValue2575;
        long regionValue2576;
        region460: {
        region458: {
        region457: {
        region452: {
        region451: {
        region445: {
        region443: {
        region436: {
        region434: {
        region432: {
        region430: {
        region426: {
        region424: {
        region423: {
        region421: {
        region414: {
        region412: {
        region406: {
        region404: {
        region401: {
        region399: {
        region393: {
        region389: {
        region388: {
        region383: {
        region382: {
        region376: {
        region374: {
        region369: {
        region367: {
        region365: {
        region363: {
        region360: {
        region358: {
        region352: {
        region342: {
        region341: {
        region340: {
        region339: {
        region335: {
        region333: {
        region332: {
        region320: {
        region308: {
        region307: {
        region306: {
        region305: {
        region298: {
        region297: {
        region295: {
        region294: {
        region291: {
        region276: {
        region274: {
        region273: {
        region269: {
        region268: {
        region260: {
        region259: {
        region245: {
        region243: {
        region242: {
        region240: {
        region234: {
        region233: {
        region232: {
        region231: {
        region229: {
        region207: {
        region206: {
        region204: {
        region203: {
        region201: {
        region192: {
        region190: {
        region189: {
        region187: {
        region178: {
        region177: {
        region176: {
        region175: {
        region160: {
        region159: {
        region157: {
        region156: {
        region152: {
        region151: {
        region150: {
        region148: {
        region147: {
        region145: {
        region144: {
        region139: {
        region130: {
        region128: {
        region127: {
        region122: {
        region120: {
        region119: {
        region117: {
        region108: {
        region106: {
        region105: {
        region100: {
        region98: {
        region97: {
        region95: {
        region86: {
        region84: {
        region83: {
        region76: {
        region74: {
        region73: {
        region71: {
        region62: {
        region60: {
        long converted3 = (long) (constructorPart1);
        long computed4 = converted3 << 32;
        long computed5 = constructorKey2 << 32;
        long computed6 = computed5 >>> 32;
        long computed7 = computed4 | computed6;
        long initialValue8 = computed7;
        long computed9 = initialValue8 ^ 138043418338980L;
        long initialValue10 = computed9;
        long computed11 = initialValue8 ^ 40452714580975L;
        long initialValue12 = computed11;
        long computed13 = initialValue8 ^ 93560678845923L;
        long initialValue14 = computed13;
        long computed15 = initialValue8 ^ 115942598083693L;
        long initialValue16 = computed15;
        long computed17 = initialValue8 ^ 117769954117231L;
        long initialValue18 = computed17;
        long computed19 = initialValue8 ^ 34050196262160L;
        long initialValue20 = computed19;
        int initialValue21 = recovery$indy$flow$384(this);
        int computed22 = initialValue21 + 1;
        recovery$indy$flow$385(this, computed22);
        java.lang.Object initialValue23 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(this)))).settingModes));
        java.lang.Object initialValue24 = recovery$indy$flow$387(initialValue23, initialValue16, 4726246772924838923L, initialValue8);
        java.lang.Object initialValue25 = initialValue24;
        boolean initialValue26 = recovery$indy$flow$388(4725180371617586732L, initialValue8);
        int initialValue27 = -1;
        int initialValue28 = (int) ((initialValue26 ? 1 : 0));
        int initialValue29 = recovery$indy$flow$389(initialValue25);
        if (initialValue28 == 0) {
            java.lang.Object regionNext41 = this;
            int regionNext42 = constructorPart1;
            long regionNext43 = constructorKey2;
            long regionNext44 = initialValue8;
            long regionNext45 = initialValue10;
            long regionNext46 = initialValue12;
            long regionNext47 = initialValue14;
            long regionNext48 = initialValue18;
            long regionNext49 = initialValue20;
            int regionNext50 = initialValue28;
            int regionNext51 = initialValue29;
            regionValue30 = regionNext41;
            regionValue31 = regionNext42;
            regionValue32 = regionNext43;
            regionValue33 = regionNext44;
            regionValue34 = regionNext45;
            regionValue35 = regionNext46;
            regionValue36 = regionNext47;
            regionValue37 = regionNext48;
            regionValue38 = regionNext49;
            regionValue39 = regionNext50;
            regionValue40 = regionNext51;
            break region151;
        } else {
            java.lang.Object regionNext65 = this;
            int regionNext66 = constructorPart1;
            long regionNext67 = constructorKey2;
            long regionNext68 = initialValue8;
            long regionNext69 = initialValue10;
            long regionNext70 = initialValue12;
            long regionNext71 = initialValue14;
            long regionNext72 = initialValue18;
            long regionNext73 = initialValue20;
            java.lang.Object regionNext74 = initialValue25;
            int regionNext75 = initialValue27;
            int regionNext76 = initialValue28;
            int regionNext77 = initialValue29;
            regionValue52 = regionNext65;
            regionValue53 = regionNext66;
            regionValue54 = regionNext67;
            regionValue55 = regionNext68;
            regionValue56 = regionNext69;
            regionValue57 = regionNext70;
            regionValue58 = regionNext71;
            regionValue59 = regionNext72;
            regionValue60 = regionNext73;
            regionValue61 = regionNext74;
            regionValue62 = regionNext75;
            regionValue63 = regionNext76;
            regionValue64 = regionNext77;
            break region60;
        }
        }
        switch (regionValue64) {
            case -2099899231: {
                java.lang.Object regionNext90 = regionValue52;
                int regionNext91 = regionValue53;
                long regionNext92 = regionValue54;
                long regionNext93 = regionValue55;
                long regionNext94 = regionValue56;
                long regionNext95 = regionValue57;
                long regionNext96 = regionValue58;
                long regionNext97 = regionValue59;
                long regionNext98 = regionValue60;
                java.lang.Object regionNext99 = regionValue61;
                int regionNext100 = regionValue62;
                int regionNext101 = regionValue63;
                regionValue78 = regionNext90;
                regionValue79 = regionNext91;
                regionValue80 = regionNext92;
                regionValue81 = regionNext93;
                regionValue82 = regionNext94;
                regionValue83 = regionNext95;
                regionValue84 = regionNext96;
                regionValue85 = regionNext97;
                regionValue86 = regionNext98;
                regionValue87 = regionNext99;
                regionValue88 = regionNext100;
                regionValue89 = regionNext101;
                break region62;
            }
            case -1721492669: {
                java.lang.Object regionNext114 = regionValue52;
                int regionNext115 = regionValue53;
                long regionNext116 = regionValue54;
                long regionNext117 = regionValue55;
                long regionNext118 = regionValue56;
                long regionNext119 = regionValue57;
                long regionNext120 = regionValue58;
                long regionNext121 = regionValue59;
                long regionNext122 = regionValue60;
                java.lang.Object regionNext123 = regionValue61;
                int regionNext124 = regionValue62;
                int regionNext125 = regionValue63;
                regionValue102 = regionNext114;
                regionValue103 = regionNext115;
                regionValue104 = regionNext116;
                regionValue105 = regionNext117;
                regionValue106 = regionNext118;
                regionValue107 = regionNext119;
                regionValue108 = regionNext120;
                regionValue109 = regionNext121;
                regionValue110 = regionNext122;
                regionValue111 = regionNext123;
                regionValue112 = regionNext124;
                regionValue113 = regionNext125;
                break region130;
            }
            case 82544993: {
                java.lang.Object regionNext138 = regionValue52;
                int regionNext139 = regionValue53;
                long regionNext140 = regionValue54;
                long regionNext141 = regionValue55;
                long regionNext142 = regionValue56;
                long regionNext143 = regionValue57;
                long regionNext144 = regionValue58;
                long regionNext145 = regionValue59;
                long regionNext146 = regionValue60;
                java.lang.Object regionNext147 = regionValue61;
                int regionNext148 = regionValue62;
                int regionNext149 = regionValue63;
                regionValue126 = regionNext138;
                regionValue127 = regionNext139;
                regionValue128 = regionNext140;
                regionValue129 = regionNext141;
                regionValue130 = regionNext142;
                regionValue131 = regionNext143;
                regionValue132 = regionNext144;
                regionValue133 = regionNext145;
                regionValue134 = regionNext146;
                regionValue135 = regionNext147;
                regionValue136 = regionNext148;
                regionValue137 = regionNext149;
                break region108;
            }
            case 1253086419: {
                java.lang.Object regionNext162 = regionValue52;
                int regionNext163 = regionValue53;
                long regionNext164 = regionValue54;
                long regionNext165 = regionValue55;
                long regionNext166 = regionValue56;
                long regionNext167 = regionValue57;
                long regionNext168 = regionValue58;
                long regionNext169 = regionValue59;
                long regionNext170 = regionValue60;
                java.lang.Object regionNext171 = regionValue61;
                int regionNext172 = regionValue62;
                int regionNext173 = regionValue63;
                regionValue150 = regionNext162;
                regionValue151 = regionNext163;
                regionValue152 = regionNext164;
                regionValue153 = regionNext165;
                regionValue154 = regionNext166;
                regionValue155 = regionNext167;
                regionValue156 = regionNext168;
                regionValue157 = regionNext169;
                regionValue158 = regionNext170;
                regionValue159 = regionNext171;
                regionValue160 = regionNext172;
                regionValue161 = regionNext173;
                break region86;
            }
            default: {
                java.lang.Object regionNext185 = regionValue52;
                int regionNext186 = regionValue53;
                long regionNext187 = regionValue54;
                long regionNext188 = regionValue55;
                long regionNext189 = regionValue56;
                long regionNext190 = regionValue57;
                long regionNext191 = regionValue58;
                long regionNext192 = regionValue59;
                long regionNext193 = regionValue60;
                int regionNext194 = regionValue62;
                int regionNext195 = regionValue63;
                regionValue174 = regionNext185;
                regionValue175 = regionNext186;
                regionValue176 = regionNext187;
                regionValue177 = regionNext188;
                regionValue178 = regionNext189;
                regionValue179 = regionNext190;
                regionValue180 = regionNext191;
                regionValue181 = regionNext192;
                regionValue182 = regionNext193;
                regionValue183 = regionNext194;
                regionValue184 = regionNext195;
                break region150;
            }
        }
        }
        long computed196 = 2207777118952987928L ^ regionValue81;
        java.lang.Object initialValue197 = recovery$indy$flow$390(25718, computed196);
        boolean initialValue198 = recovery$indy$flow$391(regionValue87, initialValue197);
        if (regionValue89 == 0) {
            java.lang.Object regionNext199 = regionValue78;
            int regionNext200 = regionValue79;
            long regionNext201 = regionValue80;
            long regionNext202 = regionValue81;
            long regionNext203 = regionValue82;
            long regionNext204 = regionValue83;
            long regionNext205 = regionValue84;
            long regionNext206 = regionValue85;
            long regionNext207 = regionValue86;
            int regionNext208 = regionValue89;
            int regionNext209 = (int) ((initialValue198 ? 1 : 0));
            regionValue30 = regionNext199;
            regionValue31 = regionNext200;
            regionValue32 = regionNext201;
            regionValue33 = regionNext202;
            regionValue34 = regionNext203;
            regionValue35 = regionNext204;
            regionValue36 = regionNext205;
            regionValue37 = regionNext206;
            regionValue38 = regionNext207;
            regionValue39 = regionNext208;
            regionValue40 = regionNext209;
            break region151;
        } else {
            java.lang.Object regionNext223 = regionValue78;
            int regionNext224 = regionValue79;
            long regionNext225 = regionValue80;
            long regionNext226 = regionValue81;
            long regionNext227 = regionValue82;
            long regionNext228 = regionValue83;
            long regionNext229 = regionValue84;
            long regionNext230 = regionValue85;
            long regionNext231 = regionValue86;
            java.lang.Object regionNext232 = regionValue87;
            int regionNext233 = regionValue88;
            int regionNext234 = regionValue89;
            int regionNext235 = (int) ((initialValue198 ? 1 : 0));
            regionValue210 = regionNext223;
            regionValue211 = regionNext224;
            regionValue212 = regionNext225;
            regionValue213 = regionNext226;
            regionValue214 = regionNext227;
            regionValue215 = regionNext228;
            regionValue216 = regionNext229;
            regionValue217 = regionNext230;
            regionValue218 = regionNext231;
            regionValue219 = regionNext232;
            regionValue220 = regionNext233;
            regionValue221 = regionNext234;
            regionValue222 = regionNext235;
            break region71;
        }
        }
        java.lang.Object regionNext249 = regionValue210;
        int regionNext250 = regionValue211;
        long regionNext251 = regionValue212;
        long regionNext252 = regionValue213;
        long regionNext253 = regionValue214;
        long regionNext254 = regionValue215;
        long regionNext255 = regionValue216;
        long regionNext256 = regionValue217;
        long regionNext257 = regionValue218;
        java.lang.Object regionNext258 = regionValue219;
        int regionNext259 = regionValue220;
        int regionNext260 = regionValue221;
        int regionNext261 = regionValue222;
        regionValue236 = regionNext249;
        regionValue237 = regionNext250;
        regionValue238 = regionNext251;
        regionValue239 = regionNext252;
        regionValue240 = regionNext253;
        regionValue241 = regionNext254;
        regionValue242 = regionNext255;
        regionValue243 = regionNext256;
        regionValue244 = regionNext257;
        regionValue245 = regionNext258;
        regionValue246 = regionNext259;
        regionValue247 = regionNext260;
        regionValue248 = regionNext261;
        break region73;
        }
        if (regionValue248 == 0) {
            java.lang.Object regionNext262 = regionValue236;
            int regionNext263 = regionValue237;
            long regionNext264 = regionValue238;
            long regionNext265 = regionValue239;
            long regionNext266 = regionValue240;
            long regionNext267 = regionValue241;
            long regionNext268 = regionValue242;
            long regionNext269 = regionValue243;
            long regionNext270 = regionValue244;
            int regionNext271 = regionValue246;
            int regionNext272 = regionValue247;
            regionValue174 = regionNext262;
            regionValue175 = regionNext263;
            regionValue176 = regionNext264;
            regionValue177 = regionNext265;
            regionValue178 = regionNext266;
            regionValue179 = regionNext267;
            regionValue180 = regionNext268;
            regionValue181 = regionNext269;
            regionValue182 = regionNext270;
            regionValue183 = regionNext271;
            regionValue184 = regionNext272;
            break region150;
        } else {
            java.lang.Object regionNext284 = regionValue236;
            int regionNext285 = regionValue237;
            long regionNext286 = regionValue238;
            long regionNext287 = regionValue239;
            long regionNext288 = regionValue240;
            long regionNext289 = regionValue241;
            long regionNext290 = regionValue242;
            long regionNext291 = regionValue243;
            long regionNext292 = regionValue244;
            java.lang.Object regionNext293 = regionValue245;
            int regionNext294 = regionValue247;
            regionValue273 = regionNext284;
            regionValue274 = regionNext285;
            regionValue275 = regionNext286;
            regionValue276 = regionNext287;
            regionValue277 = regionNext288;
            regionValue278 = regionNext289;
            regionValue279 = regionNext290;
            regionValue280 = regionNext291;
            regionValue281 = regionNext292;
            regionValue282 = regionNext293;
            regionValue283 = regionNext294;
            break region74;
        }
        }
        java.lang.Object regionNext306 = regionValue273;
        int regionNext307 = regionValue274;
        long regionNext308 = regionValue275;
        long regionNext309 = regionValue276;
        long regionNext310 = regionValue277;
        long regionNext311 = regionValue278;
        long regionNext312 = regionValue279;
        long regionNext313 = regionValue280;
        long regionNext314 = regionValue281;
        java.lang.Object regionNext315 = regionValue282;
        int regionNext316 = regionValue283;
        regionValue295 = regionNext306;
        regionValue296 = regionNext307;
        regionValue297 = regionNext308;
        regionValue298 = regionNext309;
        regionValue299 = regionNext310;
        regionValue300 = regionNext311;
        regionValue301 = regionNext312;
        regionValue302 = regionNext313;
        regionValue303 = regionNext314;
        regionValue304 = regionNext315;
        regionValue305 = regionNext316;
        break region76;
        }
        int initialValue317 = 0;
        int comparison318 = (regionValue297 > 0L ? 1 : regionValue297 == 0L ? 0 : -1);
        if (comparison318 < 0) {
            java.lang.Object regionNext332 = regionValue295;
            int regionNext333 = regionValue296;
            long regionNext334 = regionValue297;
            long regionNext335 = regionValue298;
            long regionNext336 = regionValue299;
            long regionNext337 = regionValue300;
            long regionNext338 = regionValue301;
            long regionNext339 = regionValue302;
            long regionNext340 = regionValue303;
            java.lang.Object regionNext341 = regionValue304;
            int regionNext342 = regionValue305;
            int regionNext343 = initialValue317;
            int regionNext344 = regionValue305;
            regionValue319 = regionNext332;
            regionValue320 = regionNext333;
            regionValue321 = regionNext334;
            regionValue322 = regionNext335;
            regionValue323 = regionNext336;
            regionValue324 = regionNext337;
            regionValue325 = regionNext338;
            regionValue326 = regionNext339;
            regionValue327 = regionNext340;
            regionValue328 = regionNext341;
            regionValue329 = regionNext342;
            regionValue330 = regionNext343;
            regionValue331 = regionNext344;
            break region95;
        } else {
            java.lang.Object regionNext358 = regionValue295;
            int regionNext359 = regionValue296;
            long regionNext360 = regionValue297;
            long regionNext361 = regionValue298;
            long regionNext362 = regionValue299;
            long regionNext363 = regionValue300;
            long regionNext364 = regionValue301;
            long regionNext365 = regionValue302;
            long regionNext366 = regionValue303;
            java.lang.Object regionNext367 = regionValue304;
            int regionNext368 = regionValue305;
            int regionNext369 = initialValue317;
            int regionNext370 = regionValue305;
            regionValue345 = regionNext358;
            regionValue346 = regionNext359;
            regionValue347 = regionNext360;
            regionValue348 = regionNext361;
            regionValue349 = regionNext362;
            regionValue350 = regionNext363;
            regionValue351 = regionNext364;
            regionValue352 = regionNext365;
            regionValue353 = regionNext366;
            regionValue354 = regionNext367;
            regionValue355 = regionNext368;
            regionValue356 = regionNext369;
            regionValue357 = regionNext370;
            break region83;
        }
        }
        if (regionValue357 != 0) {
            java.lang.Object regionNext371 = regionValue345;
            int regionNext372 = regionValue346;
            long regionNext373 = regionValue347;
            long regionNext374 = regionValue348;
            long regionNext375 = regionValue349;
            long regionNext376 = regionValue350;
            long regionNext377 = regionValue351;
            long regionNext378 = regionValue352;
            long regionNext379 = regionValue353;
            int regionNext380 = regionValue356;
            int regionNext381 = regionValue355;
            regionValue174 = regionNext371;
            regionValue175 = regionNext372;
            regionValue176 = regionNext373;
            regionValue177 = regionNext374;
            regionValue178 = regionNext375;
            regionValue179 = regionNext376;
            regionValue180 = regionNext377;
            regionValue181 = regionNext378;
            regionValue182 = regionNext379;
            regionValue183 = regionNext380;
            regionValue184 = regionNext381;
            break region150;
        } else {
            java.lang.Object regionNext394 = regionValue345;
            int regionNext395 = regionValue346;
            long regionNext396 = regionValue347;
            long regionNext397 = regionValue348;
            long regionNext398 = regionValue349;
            long regionNext399 = regionValue350;
            long regionNext400 = regionValue351;
            long regionNext401 = regionValue352;
            long regionNext402 = regionValue353;
            java.lang.Object regionNext403 = regionValue354;
            int regionNext404 = regionValue355;
            int regionNext405 = regionValue356;
            regionValue382 = regionNext394;
            regionValue383 = regionNext395;
            regionValue384 = regionNext396;
            regionValue385 = regionNext397;
            regionValue386 = regionNext398;
            regionValue387 = regionNext399;
            regionValue388 = regionNext400;
            regionValue389 = regionNext401;
            regionValue390 = regionNext402;
            regionValue391 = regionNext403;
            regionValue392 = regionNext404;
            regionValue393 = regionNext405;
            break region84;
        }
        }
        java.lang.Object regionNext406 = regionValue382;
        int regionNext407 = regionValue383;
        long regionNext408 = regionValue384;
        long regionNext409 = regionValue385;
        long regionNext410 = regionValue386;
        long regionNext411 = regionValue387;
        long regionNext412 = regionValue388;
        long regionNext413 = regionValue389;
        long regionNext414 = regionValue390;
        java.lang.Object regionNext415 = regionValue391;
        int regionNext416 = regionValue393;
        int regionNext417 = regionValue392;
        regionValue150 = regionNext406;
        regionValue151 = regionNext407;
        regionValue152 = regionNext408;
        regionValue153 = regionNext409;
        regionValue154 = regionNext410;
        regionValue155 = regionNext411;
        regionValue156 = regionNext412;
        regionValue157 = regionNext413;
        regionValue158 = regionNext414;
        regionValue159 = regionNext415;
        regionValue160 = regionNext416;
        regionValue161 = regionNext417;
        break region86;
        }
        long computed418 = 48287984411282763L ^ regionValue153;
        java.lang.Object initialValue419 = recovery$indy$flow$392(29752, computed418);
        boolean initialValue420 = recovery$indy$flow$393(regionValue159, initialValue419);
        java.lang.Object regionNext421 = regionValue150;
        int regionNext422 = regionValue151;
        long regionNext423 = regionValue152;
        long regionNext424 = regionValue153;
        long regionNext425 = regionValue154;
        long regionNext426 = regionValue155;
        long regionNext427 = regionValue156;
        long regionNext428 = regionValue157;
        long regionNext429 = regionValue158;
        java.lang.Object regionNext430 = regionValue159;
        int regionNext431 = regionValue161;
        int regionNext432 = regionValue160;
        int regionNext433 = (int) ((initialValue420 ? 1 : 0));
        regionValue319 = regionNext421;
        regionValue320 = regionNext422;
        regionValue321 = regionNext423;
        regionValue322 = regionNext424;
        regionValue323 = regionNext425;
        regionValue324 = regionNext426;
        regionValue325 = regionNext427;
        regionValue326 = regionNext428;
        regionValue327 = regionNext429;
        regionValue328 = regionNext430;
        regionValue329 = regionNext431;
        regionValue330 = regionNext432;
        regionValue331 = regionNext433;
        break region95;
        }
        if (regionValue329 == 0) {
            java.lang.Object regionNext434 = regionValue319;
            int regionNext435 = regionValue320;
            long regionNext436 = regionValue321;
            long regionNext437 = regionValue322;
            long regionNext438 = regionValue323;
            long regionNext439 = regionValue324;
            long regionNext440 = regionValue325;
            long regionNext441 = regionValue326;
            long regionNext442 = regionValue327;
            int regionNext443 = regionValue329;
            int regionNext444 = regionValue331;
            regionValue30 = regionNext434;
            regionValue31 = regionNext435;
            regionValue32 = regionNext436;
            regionValue33 = regionNext437;
            regionValue34 = regionNext438;
            regionValue35 = regionNext439;
            regionValue36 = regionNext440;
            regionValue37 = regionNext441;
            regionValue38 = regionNext442;
            regionValue39 = regionNext443;
            regionValue40 = regionNext444;
            break region151;
        } else {
            java.lang.Object regionNext458 = regionValue319;
            int regionNext459 = regionValue320;
            long regionNext460 = regionValue321;
            long regionNext461 = regionValue322;
            long regionNext462 = regionValue323;
            long regionNext463 = regionValue324;
            long regionNext464 = regionValue325;
            long regionNext465 = regionValue326;
            long regionNext466 = regionValue327;
            java.lang.Object regionNext467 = regionValue328;
            int regionNext468 = regionValue329;
            int regionNext469 = regionValue330;
            int regionNext470 = regionValue331;
            regionValue445 = regionNext458;
            regionValue446 = regionNext459;
            regionValue447 = regionNext460;
            regionValue448 = regionNext461;
            regionValue449 = regionNext462;
            regionValue450 = regionNext463;
            regionValue451 = regionNext464;
            regionValue452 = regionNext465;
            regionValue453 = regionNext466;
            regionValue454 = regionNext467;
            regionValue455 = regionNext468;
            regionValue456 = regionNext469;
            regionValue457 = regionNext470;
            break region97;
        }
        }
        if (regionValue457 == 0) {
            java.lang.Object regionNext471 = regionValue445;
            int regionNext472 = regionValue446;
            long regionNext473 = regionValue447;
            long regionNext474 = regionValue448;
            long regionNext475 = regionValue449;
            long regionNext476 = regionValue450;
            long regionNext477 = regionValue451;
            long regionNext478 = regionValue452;
            long regionNext479 = regionValue453;
            int regionNext480 = regionValue456;
            int regionNext481 = regionValue455;
            regionValue174 = regionNext471;
            regionValue175 = regionNext472;
            regionValue176 = regionNext473;
            regionValue177 = regionNext474;
            regionValue178 = regionNext475;
            regionValue179 = regionNext476;
            regionValue180 = regionNext477;
            regionValue181 = regionNext478;
            regionValue182 = regionNext479;
            regionValue183 = regionNext480;
            regionValue184 = regionNext481;
            break region150;
        } else {
            java.lang.Object regionNext493 = regionValue445;
            int regionNext494 = regionValue446;
            long regionNext495 = regionValue447;
            long regionNext496 = regionValue448;
            long regionNext497 = regionValue449;
            long regionNext498 = regionValue450;
            long regionNext499 = regionValue451;
            long regionNext500 = regionValue452;
            long regionNext501 = regionValue453;
            java.lang.Object regionNext502 = regionValue454;
            int regionNext503 = regionValue455;
            regionValue482 = regionNext493;
            regionValue483 = regionNext494;
            regionValue484 = regionNext495;
            regionValue485 = regionNext496;
            regionValue486 = regionNext497;
            regionValue487 = regionNext498;
            regionValue488 = regionNext499;
            regionValue489 = regionNext500;
            regionValue490 = regionNext501;
            regionValue491 = regionNext502;
            regionValue492 = regionNext503;
            break region98;
        }
        }
        java.lang.Object regionNext515 = regionValue482;
        int regionNext516 = regionValue483;
        long regionNext517 = regionValue484;
        long regionNext518 = regionValue485;
        long regionNext519 = regionValue486;
        long regionNext520 = regionValue487;
        long regionNext521 = regionValue488;
        long regionNext522 = regionValue489;
        long regionNext523 = regionValue490;
        java.lang.Object regionNext524 = regionValue491;
        int regionNext525 = regionValue492;
        regionValue504 = regionNext515;
        regionValue505 = regionNext516;
        regionValue506 = regionNext517;
        regionValue507 = regionNext518;
        regionValue508 = regionNext519;
        regionValue509 = regionNext520;
        regionValue510 = regionNext521;
        regionValue511 = regionNext522;
        regionValue512 = regionNext523;
        regionValue513 = regionNext524;
        regionValue514 = regionNext525;
        break region100;
        }
        int initialValue526 = 1;
        if (regionValue505 <= 0) {
            java.lang.Object regionNext540 = regionValue504;
            int regionNext541 = regionValue505;
            long regionNext542 = regionValue506;
            long regionNext543 = regionValue507;
            long regionNext544 = regionValue508;
            long regionNext545 = regionValue509;
            long regionNext546 = regionValue510;
            long regionNext547 = regionValue511;
            long regionNext548 = regionValue512;
            java.lang.Object regionNext549 = regionValue513;
            int regionNext550 = regionValue514;
            int regionNext551 = initialValue526;
            int regionNext552 = regionValue514;
            regionValue527 = regionNext540;
            regionValue528 = regionNext541;
            regionValue529 = regionNext542;
            regionValue530 = regionNext543;
            regionValue531 = regionNext544;
            regionValue532 = regionNext545;
            regionValue533 = regionNext546;
            regionValue534 = regionNext547;
            regionValue535 = regionNext548;
            regionValue536 = regionNext549;
            regionValue537 = regionNext550;
            regionValue538 = regionNext551;
            regionValue539 = regionNext552;
            break region117;
        } else {
            java.lang.Object regionNext566 = regionValue504;
            int regionNext567 = regionValue505;
            long regionNext568 = regionValue506;
            long regionNext569 = regionValue507;
            long regionNext570 = regionValue508;
            long regionNext571 = regionValue509;
            long regionNext572 = regionValue510;
            long regionNext573 = regionValue511;
            long regionNext574 = regionValue512;
            java.lang.Object regionNext575 = regionValue513;
            int regionNext576 = regionValue514;
            int regionNext577 = initialValue526;
            int regionNext578 = regionValue514;
            regionValue553 = regionNext566;
            regionValue554 = regionNext567;
            regionValue555 = regionNext568;
            regionValue556 = regionNext569;
            regionValue557 = regionNext570;
            regionValue558 = regionNext571;
            regionValue559 = regionNext572;
            regionValue560 = regionNext573;
            regionValue561 = regionNext574;
            regionValue562 = regionNext575;
            regionValue563 = regionNext576;
            regionValue564 = regionNext577;
            regionValue565 = regionNext578;
            break region105;
        }
        }
        if (regionValue565 != 0) {
            java.lang.Object regionNext579 = regionValue553;
            int regionNext580 = regionValue554;
            long regionNext581 = regionValue555;
            long regionNext582 = regionValue556;
            long regionNext583 = regionValue557;
            long regionNext584 = regionValue558;
            long regionNext585 = regionValue559;
            long regionNext586 = regionValue560;
            long regionNext587 = regionValue561;
            int regionNext588 = regionValue564;
            int regionNext589 = regionValue563;
            regionValue174 = regionNext579;
            regionValue175 = regionNext580;
            regionValue176 = regionNext581;
            regionValue177 = regionNext582;
            regionValue178 = regionNext583;
            regionValue179 = regionNext584;
            regionValue180 = regionNext585;
            regionValue181 = regionNext586;
            regionValue182 = regionNext587;
            regionValue183 = regionNext588;
            regionValue184 = regionNext589;
            break region150;
        } else {
            java.lang.Object regionNext602 = regionValue553;
            int regionNext603 = regionValue554;
            long regionNext604 = regionValue555;
            long regionNext605 = regionValue556;
            long regionNext606 = regionValue557;
            long regionNext607 = regionValue558;
            long regionNext608 = regionValue559;
            long regionNext609 = regionValue560;
            long regionNext610 = regionValue561;
            java.lang.Object regionNext611 = regionValue562;
            int regionNext612 = regionValue563;
            int regionNext613 = regionValue564;
            regionValue590 = regionNext602;
            regionValue591 = regionNext603;
            regionValue592 = regionNext604;
            regionValue593 = regionNext605;
            regionValue594 = regionNext606;
            regionValue595 = regionNext607;
            regionValue596 = regionNext608;
            regionValue597 = regionNext609;
            regionValue598 = regionNext610;
            regionValue599 = regionNext611;
            regionValue600 = regionNext612;
            regionValue601 = regionNext613;
            break region106;
        }
        }
        java.lang.Object regionNext614 = regionValue590;
        int regionNext615 = regionValue591;
        long regionNext616 = regionValue592;
        long regionNext617 = regionValue593;
        long regionNext618 = regionValue594;
        long regionNext619 = regionValue595;
        long regionNext620 = regionValue596;
        long regionNext621 = regionValue597;
        long regionNext622 = regionValue598;
        java.lang.Object regionNext623 = regionValue599;
        int regionNext624 = regionValue601;
        int regionNext625 = regionValue600;
        regionValue126 = regionNext614;
        regionValue127 = regionNext615;
        regionValue128 = regionNext616;
        regionValue129 = regionNext617;
        regionValue130 = regionNext618;
        regionValue131 = regionNext619;
        regionValue132 = regionNext620;
        regionValue133 = regionNext621;
        regionValue134 = regionNext622;
        regionValue135 = regionNext623;
        regionValue136 = regionNext624;
        regionValue137 = regionNext625;
        break region108;
        }
        long computed626 = 5220314213176009709L ^ regionValue129;
        java.lang.Object initialValue627 = recovery$indy$flow$394(6806, computed626);
        boolean initialValue628 = recovery$indy$flow$395(regionValue135, initialValue627);
        java.lang.Object regionNext629 = regionValue126;
        int regionNext630 = regionValue127;
        long regionNext631 = regionValue128;
        long regionNext632 = regionValue129;
        long regionNext633 = regionValue130;
        long regionNext634 = regionValue131;
        long regionNext635 = regionValue132;
        long regionNext636 = regionValue133;
        long regionNext637 = regionValue134;
        java.lang.Object regionNext638 = regionValue135;
        int regionNext639 = regionValue137;
        int regionNext640 = regionValue136;
        int regionNext641 = (int) ((initialValue628 ? 1 : 0));
        regionValue527 = regionNext629;
        regionValue528 = regionNext630;
        regionValue529 = regionNext631;
        regionValue530 = regionNext632;
        regionValue531 = regionNext633;
        regionValue532 = regionNext634;
        regionValue533 = regionNext635;
        regionValue534 = regionNext636;
        regionValue535 = regionNext637;
        regionValue536 = regionNext638;
        regionValue537 = regionNext639;
        regionValue538 = regionNext640;
        regionValue539 = regionNext641;
        break region117;
        }
        if (regionValue537 == 0) {
            java.lang.Object regionNext642 = regionValue527;
            int regionNext643 = regionValue528;
            long regionNext644 = regionValue529;
            long regionNext645 = regionValue530;
            long regionNext646 = regionValue531;
            long regionNext647 = regionValue532;
            long regionNext648 = regionValue533;
            long regionNext649 = regionValue534;
            long regionNext650 = regionValue535;
            int regionNext651 = regionValue537;
            int regionNext652 = regionValue539;
            regionValue30 = regionNext642;
            regionValue31 = regionNext643;
            regionValue32 = regionNext644;
            regionValue33 = regionNext645;
            regionValue34 = regionNext646;
            regionValue35 = regionNext647;
            regionValue36 = regionNext648;
            regionValue37 = regionNext649;
            regionValue38 = regionNext650;
            regionValue39 = regionNext651;
            regionValue40 = regionNext652;
            break region151;
        } else {
            java.lang.Object regionNext666 = regionValue527;
            int regionNext667 = regionValue528;
            long regionNext668 = regionValue529;
            long regionNext669 = regionValue530;
            long regionNext670 = regionValue531;
            long regionNext671 = regionValue532;
            long regionNext672 = regionValue533;
            long regionNext673 = regionValue534;
            long regionNext674 = regionValue535;
            java.lang.Object regionNext675 = regionValue536;
            int regionNext676 = regionValue537;
            int regionNext677 = regionValue538;
            int regionNext678 = regionValue539;
            regionValue653 = regionNext666;
            regionValue654 = regionNext667;
            regionValue655 = regionNext668;
            regionValue656 = regionNext669;
            regionValue657 = regionNext670;
            regionValue658 = regionNext671;
            regionValue659 = regionNext672;
            regionValue660 = regionNext673;
            regionValue661 = regionNext674;
            regionValue662 = regionNext675;
            regionValue663 = regionNext676;
            regionValue664 = regionNext677;
            regionValue665 = regionNext678;
            break region119;
        }
        }
        if (regionValue665 == 0) {
            java.lang.Object regionNext679 = regionValue653;
            int regionNext680 = regionValue654;
            long regionNext681 = regionValue655;
            long regionNext682 = regionValue656;
            long regionNext683 = regionValue657;
            long regionNext684 = regionValue658;
            long regionNext685 = regionValue659;
            long regionNext686 = regionValue660;
            long regionNext687 = regionValue661;
            int regionNext688 = regionValue664;
            int regionNext689 = regionValue663;
            regionValue174 = regionNext679;
            regionValue175 = regionNext680;
            regionValue176 = regionNext681;
            regionValue177 = regionNext682;
            regionValue178 = regionNext683;
            regionValue179 = regionNext684;
            regionValue180 = regionNext685;
            regionValue181 = regionNext686;
            regionValue182 = regionNext687;
            regionValue183 = regionNext688;
            regionValue184 = regionNext689;
            break region150;
        } else {
            java.lang.Object regionNext701 = regionValue653;
            int regionNext702 = regionValue654;
            long regionNext703 = regionValue655;
            long regionNext704 = regionValue656;
            long regionNext705 = regionValue657;
            long regionNext706 = regionValue658;
            long regionNext707 = regionValue659;
            long regionNext708 = regionValue660;
            long regionNext709 = regionValue661;
            java.lang.Object regionNext710 = regionValue662;
            int regionNext711 = regionValue663;
            regionValue690 = regionNext701;
            regionValue691 = regionNext702;
            regionValue692 = regionNext703;
            regionValue693 = regionNext704;
            regionValue694 = regionNext705;
            regionValue695 = regionNext706;
            regionValue696 = regionNext707;
            regionValue697 = regionNext708;
            regionValue698 = regionNext709;
            regionValue699 = regionNext710;
            regionValue700 = regionNext711;
            break region120;
        }
        }
        java.lang.Object regionNext723 = regionValue690;
        int regionNext724 = regionValue691;
        long regionNext725 = regionValue692;
        long regionNext726 = regionValue693;
        long regionNext727 = regionValue694;
        long regionNext728 = regionValue695;
        long regionNext729 = regionValue696;
        long regionNext730 = regionValue697;
        long regionNext731 = regionValue698;
        java.lang.Object regionNext732 = regionValue699;
        int regionNext733 = regionValue700;
        regionValue712 = regionNext723;
        regionValue713 = regionNext724;
        regionValue714 = regionNext725;
        regionValue715 = regionNext726;
        regionValue716 = regionNext727;
        regionValue717 = regionNext728;
        regionValue718 = regionNext729;
        regionValue719 = regionNext730;
        regionValue720 = regionNext731;
        regionValue721 = regionNext732;
        regionValue722 = regionNext733;
        break region122;
        }
        int initialValue734 = 2;
        if (regionValue713 < 0) {
            java.lang.Object regionNext747 = regionValue712;
            int regionNext748 = regionValue713;
            long regionNext749 = regionValue714;
            long regionNext750 = regionValue715;
            long regionNext751 = regionValue716;
            long regionNext752 = regionValue717;
            long regionNext753 = regionValue718;
            long regionNext754 = regionValue719;
            long regionNext755 = regionValue720;
            int regionNext756 = regionValue722;
            int regionNext757 = initialValue734;
            int regionNext758 = regionValue722;
            regionValue735 = regionNext747;
            regionValue736 = regionNext748;
            regionValue737 = regionNext749;
            regionValue738 = regionNext750;
            regionValue739 = regionNext751;
            regionValue740 = regionNext752;
            regionValue741 = regionNext753;
            regionValue742 = regionNext754;
            regionValue743 = regionNext755;
            regionValue744 = regionNext756;
            regionValue745 = regionNext757;
            regionValue746 = regionNext758;
            break region139;
        } else {
            java.lang.Object regionNext772 = regionValue712;
            int regionNext773 = regionValue713;
            long regionNext774 = regionValue714;
            long regionNext775 = regionValue715;
            long regionNext776 = regionValue716;
            long regionNext777 = regionValue717;
            long regionNext778 = regionValue718;
            long regionNext779 = regionValue719;
            long regionNext780 = regionValue720;
            java.lang.Object regionNext781 = regionValue721;
            int regionNext782 = regionValue722;
            int regionNext783 = initialValue734;
            int regionNext784 = regionValue722;
            regionValue759 = regionNext772;
            regionValue760 = regionNext773;
            regionValue761 = regionNext774;
            regionValue762 = regionNext775;
            regionValue763 = regionNext776;
            regionValue764 = regionNext777;
            regionValue765 = regionNext778;
            regionValue766 = regionNext779;
            regionValue767 = regionNext780;
            regionValue768 = regionNext781;
            regionValue769 = regionNext782;
            regionValue770 = regionNext783;
            regionValue771 = regionNext784;
            break region127;
        }
        }
        if (regionValue771 != 0) {
            java.lang.Object regionNext785 = regionValue759;
            int regionNext786 = regionValue760;
            long regionNext787 = regionValue761;
            long regionNext788 = regionValue762;
            long regionNext789 = regionValue763;
            long regionNext790 = regionValue764;
            long regionNext791 = regionValue765;
            long regionNext792 = regionValue766;
            long regionNext793 = regionValue767;
            int regionNext794 = regionValue770;
            int regionNext795 = regionValue769;
            regionValue174 = regionNext785;
            regionValue175 = regionNext786;
            regionValue176 = regionNext787;
            regionValue177 = regionNext788;
            regionValue178 = regionNext789;
            regionValue179 = regionNext790;
            regionValue180 = regionNext791;
            regionValue181 = regionNext792;
            regionValue182 = regionNext793;
            regionValue183 = regionNext794;
            regionValue184 = regionNext795;
            break region150;
        } else {
            java.lang.Object regionNext808 = regionValue759;
            int regionNext809 = regionValue760;
            long regionNext810 = regionValue761;
            long regionNext811 = regionValue762;
            long regionNext812 = regionValue763;
            long regionNext813 = regionValue764;
            long regionNext814 = regionValue765;
            long regionNext815 = regionValue766;
            long regionNext816 = regionValue767;
            java.lang.Object regionNext817 = regionValue768;
            int regionNext818 = regionValue769;
            int regionNext819 = regionValue770;
            regionValue796 = regionNext808;
            regionValue797 = regionNext809;
            regionValue798 = regionNext810;
            regionValue799 = regionNext811;
            regionValue800 = regionNext812;
            regionValue801 = regionNext813;
            regionValue802 = regionNext814;
            regionValue803 = regionNext815;
            regionValue804 = regionNext816;
            regionValue805 = regionNext817;
            regionValue806 = regionNext818;
            regionValue807 = regionNext819;
            break region128;
        }
        }
        java.lang.Object regionNext820 = regionValue796;
        int regionNext821 = regionValue797;
        long regionNext822 = regionValue798;
        long regionNext823 = regionValue799;
        long regionNext824 = regionValue800;
        long regionNext825 = regionValue801;
        long regionNext826 = regionValue802;
        long regionNext827 = regionValue803;
        long regionNext828 = regionValue804;
        java.lang.Object regionNext829 = regionValue805;
        int regionNext830 = regionValue807;
        int regionNext831 = regionValue806;
        regionValue102 = regionNext820;
        regionValue103 = regionNext821;
        regionValue104 = regionNext822;
        regionValue105 = regionNext823;
        regionValue106 = regionNext824;
        regionValue107 = regionNext825;
        regionValue108 = regionNext826;
        regionValue109 = regionNext827;
        regionValue110 = regionNext828;
        regionValue111 = regionNext829;
        regionValue112 = regionNext830;
        regionValue113 = regionNext831;
        break region130;
        }
        long computed832 = 5389463389591327774L ^ regionValue105;
        java.lang.Object initialValue833 = recovery$indy$flow$396(11619, computed832);
        boolean initialValue834 = recovery$indy$flow$397(regionValue111, initialValue833);
        java.lang.Object regionNext835 = regionValue102;
        int regionNext836 = regionValue103;
        long regionNext837 = regionValue104;
        long regionNext838 = regionValue105;
        long regionNext839 = regionValue106;
        long regionNext840 = regionValue107;
        long regionNext841 = regionValue108;
        long regionNext842 = regionValue109;
        long regionNext843 = regionValue110;
        int regionNext844 = regionValue113;
        int regionNext845 = regionValue112;
        int regionNext846 = (int) ((initialValue834 ? 1 : 0));
        regionValue735 = regionNext835;
        regionValue736 = regionNext836;
        regionValue737 = regionNext837;
        regionValue738 = regionNext838;
        regionValue739 = regionNext839;
        regionValue740 = regionNext840;
        regionValue741 = regionNext841;
        regionValue742 = regionNext842;
        regionValue743 = regionNext843;
        regionValue744 = regionNext844;
        regionValue745 = regionNext845;
        regionValue746 = regionNext846;
        break region139;
        }
        int comparison847 = (regionValue737 > 0L ? 1 : regionValue737 == 0L ? 0 : -1);
        if (comparison847 <= 0) {
            java.lang.Object regionNext860 = regionValue735;
            int regionNext861 = regionValue736;
            long regionNext862 = regionValue737;
            long regionNext863 = regionValue738;
            long regionNext864 = regionValue739;
            long regionNext865 = regionValue740;
            long regionNext866 = regionValue741;
            long regionNext867 = regionValue742;
            long regionNext868 = regionValue743;
            int regionNext869 = regionValue744;
            int regionNext870 = regionValue746;
            int regionNext871 = regionValue744;
            regionValue848 = regionNext860;
            regionValue849 = regionNext861;
            regionValue850 = regionNext862;
            regionValue851 = regionNext863;
            regionValue852 = regionNext864;
            regionValue853 = regionNext865;
            regionValue854 = regionNext866;
            regionValue855 = regionNext867;
            regionValue856 = regionNext868;
            regionValue857 = regionNext869;
            regionValue858 = regionNext870;
            regionValue859 = regionNext871;
            break region152;
        } else {
            java.lang.Object regionNext885 = regionValue735;
            int regionNext886 = regionValue736;
            long regionNext887 = regionValue737;
            long regionNext888 = regionValue738;
            long regionNext889 = regionValue739;
            long regionNext890 = regionValue740;
            long regionNext891 = regionValue741;
            long regionNext892 = regionValue742;
            long regionNext893 = regionValue743;
            int regionNext894 = regionValue744;
            int regionNext895 = regionValue745;
            int regionNext896 = regionValue746;
            int regionNext897 = regionValue744;
            regionValue872 = regionNext885;
            regionValue873 = regionNext886;
            regionValue874 = regionNext887;
            regionValue875 = regionNext888;
            regionValue876 = regionNext889;
            regionValue877 = regionNext890;
            regionValue878 = regionNext891;
            regionValue879 = regionNext892;
            regionValue880 = regionNext893;
            regionValue881 = regionNext894;
            regionValue882 = regionNext895;
            regionValue883 = regionNext896;
            regionValue884 = regionNext897;
            break region144;
        }
        }
        if (regionValue884 == 0) {
            java.lang.Object regionNext898 = regionValue872;
            int regionNext899 = regionValue873;
            long regionNext900 = regionValue874;
            long regionNext901 = regionValue875;
            long regionNext902 = regionValue876;
            long regionNext903 = regionValue877;
            long regionNext904 = regionValue878;
            long regionNext905 = regionValue879;
            long regionNext906 = regionValue880;
            int regionNext907 = regionValue881;
            int regionNext908 = regionValue883;
            regionValue30 = regionNext898;
            regionValue31 = regionNext899;
            regionValue32 = regionNext900;
            regionValue33 = regionNext901;
            regionValue34 = regionNext902;
            regionValue35 = regionNext903;
            regionValue36 = regionNext904;
            regionValue37 = regionNext905;
            regionValue38 = regionNext906;
            regionValue39 = regionNext907;
            regionValue40 = regionNext908;
            break region151;
        } else {
            java.lang.Object regionNext921 = regionValue872;
            int regionNext922 = regionValue873;
            long regionNext923 = regionValue874;
            long regionNext924 = regionValue875;
            long regionNext925 = regionValue876;
            long regionNext926 = regionValue877;
            long regionNext927 = regionValue878;
            long regionNext928 = regionValue879;
            long regionNext929 = regionValue880;
            int regionNext930 = regionValue881;
            int regionNext931 = regionValue882;
            int regionNext932 = regionValue883;
            regionValue909 = regionNext921;
            regionValue910 = regionNext922;
            regionValue911 = regionNext923;
            regionValue912 = regionNext924;
            regionValue913 = regionNext925;
            regionValue914 = regionNext926;
            regionValue915 = regionNext927;
            regionValue916 = regionNext928;
            regionValue917 = regionNext929;
            regionValue918 = regionNext930;
            regionValue919 = regionNext931;
            regionValue920 = regionNext932;
            break region145;
        }
        }
        java.lang.Object regionNext945 = regionValue909;
        int regionNext946 = regionValue910;
        long regionNext947 = regionValue911;
        long regionNext948 = regionValue912;
        long regionNext949 = regionValue913;
        long regionNext950 = regionValue914;
        long regionNext951 = regionValue915;
        long regionNext952 = regionValue916;
        long regionNext953 = regionValue917;
        int regionNext954 = regionValue918;
        int regionNext955 = regionValue919;
        int regionNext956 = regionValue920;
        regionValue933 = regionNext945;
        regionValue934 = regionNext946;
        regionValue935 = regionNext947;
        regionValue936 = regionNext948;
        regionValue937 = regionNext949;
        regionValue938 = regionNext950;
        regionValue939 = regionNext951;
        regionValue940 = regionNext952;
        regionValue941 = regionNext953;
        regionValue942 = regionNext954;
        regionValue943 = regionNext955;
        regionValue944 = regionNext956;
        break region147;
        }
        if (regionValue944 == 0) {
            java.lang.Object regionNext957 = regionValue933;
            int regionNext958 = regionValue934;
            long regionNext959 = regionValue935;
            long regionNext960 = regionValue936;
            long regionNext961 = regionValue937;
            long regionNext962 = regionValue938;
            long regionNext963 = regionValue939;
            long regionNext964 = regionValue940;
            long regionNext965 = regionValue941;
            int regionNext966 = regionValue943;
            int regionNext967 = regionValue942;
            regionValue174 = regionNext957;
            regionValue175 = regionNext958;
            regionValue176 = regionNext959;
            regionValue177 = regionNext960;
            regionValue178 = regionNext961;
            regionValue179 = regionNext962;
            regionValue180 = regionNext963;
            regionValue181 = regionNext964;
            regionValue182 = regionNext965;
            regionValue183 = regionNext966;
            regionValue184 = regionNext967;
            break region150;
        } else {
            java.lang.Object regionNext978 = regionValue933;
            int regionNext979 = regionValue934;
            long regionNext980 = regionValue935;
            long regionNext981 = regionValue936;
            long regionNext982 = regionValue937;
            long regionNext983 = regionValue938;
            long regionNext984 = regionValue939;
            long regionNext985 = regionValue940;
            long regionNext986 = regionValue941;
            int regionNext987 = regionValue942;
            regionValue968 = regionNext978;
            regionValue969 = regionNext979;
            regionValue970 = regionNext980;
            regionValue971 = regionNext981;
            regionValue972 = regionNext982;
            regionValue973 = regionNext983;
            regionValue974 = regionNext984;
            regionValue975 = regionNext985;
            regionValue976 = regionNext986;
            regionValue977 = regionNext987;
            break region148;
        }
        }
        int initialValue988 = 3;
        java.lang.Object regionNext989 = regionValue968;
        int regionNext990 = regionValue969;
        long regionNext991 = regionValue970;
        long regionNext992 = regionValue971;
        long regionNext993 = regionValue972;
        long regionNext994 = regionValue973;
        long regionNext995 = regionValue974;
        long regionNext996 = regionValue975;
        long regionNext997 = regionValue976;
        int regionNext998 = initialValue988;
        int regionNext999 = regionValue977;
        regionValue174 = regionNext989;
        regionValue175 = regionNext990;
        regionValue176 = regionNext991;
        regionValue177 = regionNext992;
        regionValue178 = regionNext993;
        regionValue179 = regionNext994;
        regionValue180 = regionNext995;
        regionValue181 = regionNext996;
        regionValue182 = regionNext997;
        regionValue183 = regionNext998;
        regionValue184 = regionNext999;
        break region150;
        }
        java.lang.Object regionNext1000 = regionValue174;
        int regionNext1001 = regionValue175;
        long regionNext1002 = regionValue176;
        long regionNext1003 = regionValue177;
        long regionNext1004 = regionValue178;
        long regionNext1005 = regionValue179;
        long regionNext1006 = regionValue180;
        long regionNext1007 = regionValue181;
        long regionNext1008 = regionValue182;
        int regionNext1009 = regionValue184;
        int regionNext1010 = regionValue183;
        regionValue30 = regionNext1000;
        regionValue31 = regionNext1001;
        regionValue32 = regionNext1002;
        regionValue33 = regionNext1003;
        regionValue34 = regionNext1004;
        regionValue35 = regionNext1005;
        regionValue36 = regionNext1006;
        regionValue37 = regionNext1007;
        regionValue38 = regionNext1008;
        regionValue39 = regionNext1009;
        regionValue40 = regionNext1010;
        break region151;
        }
        java.lang.Object regionNext1011 = regionValue30;
        int regionNext1012 = regionValue31;
        long regionNext1013 = regionValue32;
        long regionNext1014 = regionValue33;
        long regionNext1015 = regionValue34;
        long regionNext1016 = regionValue35;
        long regionNext1017 = regionValue36;
        long regionNext1018 = regionValue37;
        long regionNext1019 = regionValue38;
        int regionNext1020 = regionValue39;
        int regionNext1021 = regionValue40;
        int regionNext1022 = regionValue39;
        regionValue848 = regionNext1011;
        regionValue849 = regionNext1012;
        regionValue850 = regionNext1013;
        regionValue851 = regionNext1014;
        regionValue852 = regionNext1015;
        regionValue853 = regionNext1016;
        regionValue854 = regionNext1017;
        regionValue855 = regionNext1018;
        regionValue856 = regionNext1019;
        regionValue857 = regionNext1020;
        regionValue858 = regionNext1021;
        regionValue859 = regionNext1022;
        break region152;
        }
        int comparison1023 = (regionValue850 > 0L ? 1 : regionValue850 == 0L ? 0 : -1);
        if (comparison1023 < 0) {
            java.lang.Object regionNext1036 = regionValue848;
            int regionNext1037 = regionValue849;
            long regionNext1038 = regionValue850;
            long regionNext1039 = regionValue851;
            long regionNext1040 = regionValue852;
            long regionNext1041 = regionValue853;
            long regionNext1042 = regionValue854;
            long regionNext1043 = regionValue855;
            long regionNext1044 = regionValue856;
            int regionNext1045 = regionValue857;
            int regionNext1046 = regionValue858;
            int regionNext1047 = regionValue859;
            regionValue1024 = regionNext1036;
            regionValue1025 = regionNext1037;
            regionValue1026 = regionNext1038;
            regionValue1027 = regionNext1039;
            regionValue1028 = regionNext1040;
            regionValue1029 = regionNext1041;
            regionValue1030 = regionNext1042;
            regionValue1031 = regionNext1043;
            regionValue1032 = regionNext1044;
            regionValue1033 = regionNext1045;
            regionValue1034 = regionNext1046;
            regionValue1035 = regionNext1047;
            break region176;
        } else {
            java.lang.Object regionNext1060 = regionValue848;
            int regionNext1061 = regionValue849;
            long regionNext1062 = regionValue850;
            long regionNext1063 = regionValue851;
            long regionNext1064 = regionValue852;
            long regionNext1065 = regionValue853;
            long regionNext1066 = regionValue854;
            long regionNext1067 = regionValue855;
            long regionNext1068 = regionValue856;
            int regionNext1069 = regionValue857;
            int regionNext1070 = regionValue858;
            int regionNext1071 = regionValue859;
            regionValue1048 = regionNext1060;
            regionValue1049 = regionNext1061;
            regionValue1050 = regionNext1062;
            regionValue1051 = regionNext1063;
            regionValue1052 = regionNext1064;
            regionValue1053 = regionNext1065;
            regionValue1054 = regionNext1066;
            regionValue1055 = regionNext1067;
            regionValue1056 = regionNext1068;
            regionValue1057 = regionNext1069;
            regionValue1058 = regionNext1070;
            regionValue1059 = regionNext1071;
            break region156;
        }
        }
        if (regionValue1059 == 0) {
            java.lang.Object regionNext1083 = regionValue1048;
            int regionNext1084 = regionValue1049;
            long regionNext1085 = regionValue1050;
            long regionNext1086 = regionValue1051;
            long regionNext1087 = regionValue1052;
            long regionNext1088 = regionValue1053;
            long regionNext1089 = regionValue1054;
            long regionNext1090 = regionValue1055;
            long regionNext1091 = regionValue1056;
            int regionNext1092 = regionValue1057;
            int regionNext1093 = regionValue1058;
            regionValue1072 = regionNext1083;
            regionValue1073 = regionNext1084;
            regionValue1074 = regionNext1085;
            regionValue1075 = regionNext1086;
            regionValue1076 = regionNext1087;
            regionValue1077 = regionNext1088;
            regionValue1078 = regionNext1089;
            regionValue1079 = regionNext1090;
            regionValue1080 = regionNext1091;
            regionValue1081 = regionNext1092;
            regionValue1082 = regionNext1093;
            break region175;
        } else {
            java.lang.Object regionNext1105 = regionValue1048;
            int regionNext1106 = regionValue1049;
            long regionNext1107 = regionValue1050;
            long regionNext1108 = regionValue1051;
            long regionNext1109 = regionValue1052;
            long regionNext1110 = regionValue1053;
            long regionNext1111 = regionValue1054;
            long regionNext1112 = regionValue1055;
            long regionNext1113 = regionValue1056;
            int regionNext1114 = regionValue1057;
            int regionNext1115 = regionValue1058;
            regionValue1094 = regionNext1105;
            regionValue1095 = regionNext1106;
            regionValue1096 = regionNext1107;
            regionValue1097 = regionNext1108;
            regionValue1098 = regionNext1109;
            regionValue1099 = regionNext1110;
            regionValue1100 = regionNext1111;
            regionValue1101 = regionNext1112;
            regionValue1102 = regionNext1113;
            regionValue1103 = regionNext1114;
            regionValue1104 = regionNext1115;
            break region157;
        }
        }
        java.lang.Object regionNext1127 = regionValue1094;
        int regionNext1128 = regionValue1095;
        long regionNext1129 = regionValue1096;
        long regionNext1130 = regionValue1097;
        long regionNext1131 = regionValue1098;
        long regionNext1132 = regionValue1099;
        long regionNext1133 = regionValue1100;
        long regionNext1134 = regionValue1101;
        long regionNext1135 = regionValue1102;
        int regionNext1136 = regionValue1103;
        int regionNext1137 = regionValue1104;
        regionValue1116 = regionNext1127;
        regionValue1117 = regionNext1128;
        regionValue1118 = regionNext1129;
        regionValue1119 = regionNext1130;
        regionValue1120 = regionNext1131;
        regionValue1121 = regionNext1132;
        regionValue1122 = regionNext1133;
        regionValue1123 = regionNext1134;
        regionValue1124 = regionNext1135;
        regionValue1125 = regionNext1136;
        regionValue1126 = regionNext1137;
        break region159;
        }
        switch (regionValue1126) {
            case 0: {
                java.lang.Object regionNext1148 = regionValue1116;
                int regionNext1149 = regionValue1117;
                long regionNext1150 = regionValue1118;
                long regionNext1151 = regionValue1119;
                long regionNext1152 = regionValue1120;
                long regionNext1153 = regionValue1121;
                long regionNext1154 = regionValue1122;
                long regionNext1155 = regionValue1123;
                long regionNext1156 = regionValue1124;
                int regionNext1157 = regionValue1125;
                regionValue1138 = regionNext1148;
                regionValue1139 = regionNext1149;
                regionValue1140 = regionNext1150;
                regionValue1141 = regionNext1151;
                regionValue1142 = regionNext1152;
                regionValue1143 = regionNext1153;
                regionValue1144 = regionNext1154;
                regionValue1145 = regionNext1155;
                regionValue1146 = regionNext1156;
                regionValue1147 = regionNext1157;
                break region160;
            }
            case 1: {
                java.lang.Object regionNext1167 = regionValue1116;
                int regionNext1168 = regionValue1117;
                long regionNext1169 = regionValue1118;
                long regionNext1170 = regionValue1119;
                long regionNext1171 = regionValue1120;
                long regionNext1172 = regionValue1121;
                long regionNext1173 = regionValue1122;
                long regionNext1174 = regionValue1124;
                int regionNext1175 = regionValue1125;
                regionValue1158 = regionNext1167;
                regionValue1159 = regionNext1168;
                regionValue1160 = regionNext1169;
                regionValue1161 = regionNext1170;
                regionValue1162 = regionNext1171;
                regionValue1163 = regionNext1172;
                regionValue1164 = regionNext1173;
                regionValue1165 = regionNext1174;
                regionValue1166 = regionNext1175;
                break region276;
            }
            case 2: {
                java.lang.Object regionNext1181 = regionValue1116;
                int regionNext1182 = regionValue1117;
                long regionNext1183 = regionValue1118;
                long regionNext1184 = regionValue1119;
                int regionNext1185 = regionValue1125;
                regionValue1176 = regionNext1181;
                regionValue1177 = regionNext1182;
                regionValue1178 = regionNext1183;
                regionValue1179 = regionNext1184;
                regionValue1180 = regionNext1185;
                break region352;
            }
            case 3: {
                java.lang.Object regionNext1191 = regionValue1116;
                int regionNext1192 = regionValue1117;
                long regionNext1193 = regionValue1118;
                long regionNext1194 = regionValue1119;
                int regionNext1195 = regionValue1125;
                regionValue1186 = regionNext1191;
                regionValue1187 = regionNext1192;
                regionValue1188 = regionNext1193;
                regionValue1189 = regionNext1194;
                regionValue1190 = regionNext1195;
                break region393;
            }
            default: {
                break region460;
            }
        }
        }
        java.lang.Object initialValue1196 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(regionValue1138)))).settingHeight));
        double initialValue1197 = recovery$indy$flow$399(initialValue1196, regionValue1144, 4724679502013001184L, regionValue1141);
        boolean initialValue1198 = recovery$indy$flow$400(regionValue1138, regionValue1146, initialValue1197, 4725030986833269710L, regionValue1141);
        java.lang.Object regionNext1199 = regionValue1138;
        int regionNext1200 = regionValue1139;
        long regionNext1201 = regionValue1140;
        long regionNext1202 = regionValue1141;
        long regionNext1203 = regionValue1142;
        long regionNext1204 = regionValue1143;
        long regionNext1205 = regionValue1144;
        long regionNext1206 = regionValue1145;
        long regionNext1207 = regionValue1146;
        int regionNext1208 = regionValue1147;
        int regionNext1209 = (int) ((initialValue1198 ? 1 : 0));
        regionValue1072 = regionNext1199;
        regionValue1073 = regionNext1200;
        regionValue1074 = regionNext1201;
        regionValue1075 = regionNext1202;
        regionValue1076 = regionNext1203;
        regionValue1077 = regionNext1204;
        regionValue1078 = regionNext1205;
        regionValue1079 = regionNext1206;
        regionValue1080 = regionNext1207;
        regionValue1081 = regionNext1208;
        regionValue1082 = regionNext1209;
        break region175;
        }
        java.lang.Object regionNext1210 = regionValue1072;
        int regionNext1211 = regionValue1073;
        long regionNext1212 = regionValue1074;
        long regionNext1213 = regionValue1075;
        long regionNext1214 = regionValue1076;
        long regionNext1215 = regionValue1077;
        long regionNext1216 = regionValue1078;
        long regionNext1217 = regionValue1079;
        long regionNext1218 = regionValue1080;
        int regionNext1219 = regionValue1081;
        int regionNext1220 = regionValue1082;
        int regionNext1221 = regionValue1081;
        regionValue1024 = regionNext1210;
        regionValue1025 = regionNext1211;
        regionValue1026 = regionNext1212;
        regionValue1027 = regionNext1213;
        regionValue1028 = regionNext1214;
        regionValue1029 = regionNext1215;
        regionValue1030 = regionNext1216;
        regionValue1031 = regionNext1217;
        regionValue1032 = regionNext1218;
        regionValue1033 = regionNext1219;
        regionValue1034 = regionNext1220;
        regionValue1035 = regionNext1221;
        break region176;
        }
        if (regionValue1035 == 0) {
            java.lang.Object regionNext1232 = regionValue1024;
            int regionNext1233 = regionValue1025;
            long regionNext1234 = regionValue1026;
            long regionNext1235 = regionValue1027;
            long regionNext1236 = regionValue1028;
            long regionNext1237 = regionValue1029;
            long regionNext1238 = regionValue1030;
            long regionNext1239 = regionValue1032;
            int regionNext1240 = regionValue1033;
            int regionNext1241 = regionValue1034;
            regionValue1222 = regionNext1232;
            regionValue1223 = regionNext1233;
            regionValue1224 = regionNext1234;
            regionValue1225 = regionNext1235;
            regionValue1226 = regionNext1236;
            regionValue1227 = regionNext1237;
            regionValue1228 = regionNext1238;
            regionValue1229 = regionNext1239;
            regionValue1230 = regionNext1240;
            regionValue1231 = regionNext1241;
            break region231;
        } else {
            java.lang.Object regionNext1253 = regionValue1024;
            int regionNext1254 = regionValue1025;
            long regionNext1255 = regionValue1026;
            long regionNext1256 = regionValue1027;
            long regionNext1257 = regionValue1028;
            long regionNext1258 = regionValue1029;
            long regionNext1259 = regionValue1030;
            long regionNext1260 = regionValue1031;
            long regionNext1261 = regionValue1032;
            int regionNext1262 = regionValue1033;
            int regionNext1263 = regionValue1034;
            regionValue1242 = regionNext1253;
            regionValue1243 = regionNext1254;
            regionValue1244 = regionNext1255;
            regionValue1245 = regionNext1256;
            regionValue1246 = regionNext1257;
            regionValue1247 = regionNext1258;
            regionValue1248 = regionNext1259;
            regionValue1249 = regionNext1260;
            regionValue1250 = regionNext1261;
            regionValue1251 = regionNext1262;
            regionValue1252 = regionNext1263;
            break region177;
        }
        }
        if (regionValue1252 == 0) {
            java.lang.Object regionNext1273 = regionValue1242;
            int regionNext1274 = regionValue1243;
            long regionNext1275 = regionValue1244;
            long regionNext1276 = regionValue1245;
            long regionNext1277 = regionValue1246;
            long regionNext1278 = regionValue1247;
            long regionNext1279 = regionValue1248;
            long regionNext1280 = regionValue1250;
            int regionNext1281 = regionValue1251;
            regionValue1264 = regionNext1273;
            regionValue1265 = regionNext1274;
            regionValue1266 = regionNext1275;
            regionValue1267 = regionNext1276;
            regionValue1268 = regionNext1277;
            regionValue1269 = regionNext1278;
            regionValue1270 = regionNext1279;
            regionValue1271 = regionNext1280;
            regionValue1272 = regionNext1281;
            break region229;
        } else {
            java.lang.Object regionNext1292 = regionValue1242;
            int regionNext1293 = regionValue1243;
            long regionNext1294 = regionValue1244;
            long regionNext1295 = regionValue1245;
            long regionNext1296 = regionValue1246;
            long regionNext1297 = regionValue1247;
            long regionNext1298 = regionValue1248;
            long regionNext1299 = regionValue1249;
            long regionNext1300 = regionValue1250;
            int regionNext1301 = regionValue1251;
            regionValue1282 = regionNext1292;
            regionValue1283 = regionNext1293;
            regionValue1284 = regionNext1294;
            regionValue1285 = regionNext1295;
            regionValue1286 = regionNext1296;
            regionValue1287 = regionNext1297;
            regionValue1288 = regionNext1298;
            regionValue1289 = regionNext1299;
            regionValue1290 = regionNext1300;
            regionValue1291 = regionNext1301;
            break region178;
        }
        }
        java.lang.Object initialValue1302 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(regionValue1282)))).field_41));
        boolean initialValue1303 = recovery$indy$flow$402(initialValue1302, 6000L, regionValue1289, 4724457335140011862L, regionValue1285);
        if (regionValue1291 == 0) {
            java.lang.Object regionNext1304 = regionValue1282;
            int regionNext1305 = regionValue1283;
            long regionNext1306 = regionValue1284;
            long regionNext1307 = regionValue1285;
            long regionNext1308 = regionValue1286;
            long regionNext1309 = regionValue1287;
            long regionNext1310 = regionValue1288;
            long regionNext1311 = regionValue1290;
            int regionNext1312 = regionValue1291;
            int regionNext1313 = (int) ((initialValue1303 ? 1 : 0));
            regionValue1222 = regionNext1304;
            regionValue1223 = regionNext1305;
            regionValue1224 = regionNext1306;
            regionValue1225 = regionNext1307;
            regionValue1226 = regionNext1308;
            regionValue1227 = regionNext1309;
            regionValue1228 = regionNext1310;
            regionValue1229 = regionNext1311;
            regionValue1230 = regionNext1312;
            regionValue1231 = regionNext1313;
            break region231;
        } else {
            java.lang.Object regionNext1324 = regionValue1282;
            int regionNext1325 = regionValue1283;
            long regionNext1326 = regionValue1284;
            long regionNext1327 = regionValue1285;
            long regionNext1328 = regionValue1286;
            long regionNext1329 = regionValue1287;
            long regionNext1330 = regionValue1288;
            long regionNext1331 = regionValue1290;
            int regionNext1332 = regionValue1291;
            int regionNext1333 = (int) ((initialValue1303 ? 1 : 0));
            regionValue1314 = regionNext1324;
            regionValue1315 = regionNext1325;
            regionValue1316 = regionNext1326;
            regionValue1317 = regionNext1327;
            regionValue1318 = regionNext1328;
            regionValue1319 = regionNext1329;
            regionValue1320 = regionNext1330;
            regionValue1321 = regionNext1331;
            regionValue1322 = regionNext1332;
            regionValue1323 = regionNext1333;
            break region187;
        }
        }
        java.lang.Object regionNext1344 = regionValue1314;
        int regionNext1345 = regionValue1315;
        long regionNext1346 = regionValue1316;
        long regionNext1347 = regionValue1317;
        long regionNext1348 = regionValue1318;
        long regionNext1349 = regionValue1319;
        long regionNext1350 = regionValue1320;
        long regionNext1351 = regionValue1321;
        int regionNext1352 = regionValue1322;
        int regionNext1353 = regionValue1323;
        regionValue1334 = regionNext1344;
        regionValue1335 = regionNext1345;
        regionValue1336 = regionNext1346;
        regionValue1337 = regionNext1347;
        regionValue1338 = regionNext1348;
        regionValue1339 = regionNext1349;
        regionValue1340 = regionNext1350;
        regionValue1341 = regionNext1351;
        regionValue1342 = regionNext1352;
        regionValue1343 = regionNext1353;
        break region189;
        }
        if (regionValue1343 == 0) {
            java.lang.Object regionNext1354 = regionValue1334;
            int regionNext1355 = regionValue1335;
            long regionNext1356 = regionValue1336;
            long regionNext1357 = regionValue1337;
            long regionNext1358 = regionValue1338;
            long regionNext1359 = regionValue1339;
            long regionNext1360 = regionValue1340;
            long regionNext1361 = regionValue1341;
            int regionNext1362 = regionValue1342;
            regionValue1264 = regionNext1354;
            regionValue1265 = regionNext1355;
            regionValue1266 = regionNext1356;
            regionValue1267 = regionNext1357;
            regionValue1268 = regionNext1358;
            regionValue1269 = regionNext1359;
            regionValue1270 = regionNext1360;
            regionValue1271 = regionNext1361;
            regionValue1272 = regionNext1362;
            break region229;
        } else {
            java.lang.Object regionNext1372 = regionValue1334;
            int regionNext1373 = regionValue1335;
            long regionNext1374 = regionValue1336;
            long regionNext1375 = regionValue1337;
            long regionNext1376 = regionValue1338;
            long regionNext1377 = regionValue1339;
            long regionNext1378 = regionValue1340;
            long regionNext1379 = regionValue1341;
            int regionNext1380 = regionValue1342;
            regionValue1363 = regionNext1372;
            regionValue1364 = regionNext1373;
            regionValue1365 = regionNext1374;
            regionValue1366 = regionNext1375;
            regionValue1367 = regionNext1376;
            regionValue1368 = regionNext1377;
            regionValue1369 = regionNext1378;
            regionValue1370 = regionNext1379;
            regionValue1371 = regionNext1380;
            break region190;
        }
        }
        java.lang.Object regionNext1390 = regionValue1363;
        int regionNext1391 = regionValue1364;
        long regionNext1392 = regionValue1365;
        long regionNext1393 = regionValue1366;
        long regionNext1394 = regionValue1367;
        long regionNext1395 = regionValue1368;
        long regionNext1396 = regionValue1369;
        long regionNext1397 = regionValue1370;
        int regionNext1398 = regionValue1371;
        regionValue1381 = regionNext1390;
        regionValue1382 = regionNext1391;
        regionValue1383 = regionNext1392;
        regionValue1384 = regionNext1393;
        regionValue1385 = regionNext1394;
        regionValue1386 = regionNext1395;
        regionValue1387 = regionNext1396;
        regionValue1388 = regionNext1397;
        regionValue1389 = regionNext1398;
        break region192;
        }
        java.lang.Object initialValue1399 = recovery$indy$flow$403();
        java.lang.Object initialValue1400 = recovery$indy$flow$404(initialValue1399, 4724762277038850546L, regionValue1384);
        java.lang.Object initialValue1401 = ((java.lang.Object)(((net.C_47oo) (((java.lang.Object)(initialValue1400)))).field_44W));
        boolean initialValue1402 = recovery$indy$flow$406(initialValue1401);
        if (regionValue1382 <= 0) {
            java.lang.Object regionNext1414 = regionValue1381;
            int regionNext1415 = regionValue1382;
            long regionNext1416 = regionValue1383;
            long regionNext1417 = regionValue1384;
            long regionNext1418 = regionValue1385;
            long regionNext1419 = regionValue1386;
            long regionNext1420 = regionValue1387;
            long regionNext1421 = regionValue1388;
            int regionNext1422 = regionValue1389;
            int regionNext1423 = (int) ((initialValue1402 ? 1 : 0));
            int regionNext1424 = regionValue1389;
            regionValue1403 = regionNext1414;
            regionValue1404 = regionNext1415;
            regionValue1405 = regionNext1416;
            regionValue1406 = regionNext1417;
            regionValue1407 = regionNext1418;
            regionValue1408 = regionNext1419;
            regionValue1409 = regionNext1420;
            regionValue1410 = regionNext1421;
            regionValue1411 = regionNext1422;
            regionValue1412 = regionNext1423;
            regionValue1413 = regionNext1424;
            break region232;
        } else {
            java.lang.Object regionNext1436 = regionValue1381;
            int regionNext1437 = regionValue1382;
            long regionNext1438 = regionValue1383;
            long regionNext1439 = regionValue1384;
            long regionNext1440 = regionValue1385;
            long regionNext1441 = regionValue1386;
            long regionNext1442 = regionValue1387;
            long regionNext1443 = regionValue1388;
            int regionNext1444 = regionValue1389;
            int regionNext1445 = (int) ((initialValue1402 ? 1 : 0));
            int regionNext1446 = regionValue1389;
            regionValue1425 = regionNext1436;
            regionValue1426 = regionNext1437;
            regionValue1427 = regionNext1438;
            regionValue1428 = regionNext1439;
            regionValue1429 = regionNext1440;
            regionValue1430 = regionNext1441;
            regionValue1431 = regionNext1442;
            regionValue1432 = regionNext1443;
            regionValue1433 = regionNext1444;
            regionValue1434 = regionNext1445;
            regionValue1435 = regionNext1446;
            break region201;
        }
        }
        java.lang.Object regionNext1458 = regionValue1425;
        int regionNext1459 = regionValue1426;
        long regionNext1460 = regionValue1427;
        long regionNext1461 = regionValue1428;
        long regionNext1462 = regionValue1429;
        long regionNext1463 = regionValue1430;
        long regionNext1464 = regionValue1431;
        long regionNext1465 = regionValue1432;
        int regionNext1466 = regionValue1433;
        int regionNext1467 = regionValue1434;
        int regionNext1468 = regionValue1435;
        regionValue1447 = regionNext1458;
        regionValue1448 = regionNext1459;
        regionValue1449 = regionNext1460;
        regionValue1450 = regionNext1461;
        regionValue1451 = regionNext1462;
        regionValue1452 = regionNext1463;
        regionValue1453 = regionNext1464;
        regionValue1454 = regionNext1465;
        regionValue1455 = regionNext1466;
        regionValue1456 = regionNext1467;
        regionValue1457 = regionNext1468;
        break region203;
        }
        if (regionValue1457 == 0) {
            java.lang.Object regionNext1469 = regionValue1447;
            int regionNext1470 = regionValue1448;
            long regionNext1471 = regionValue1449;
            long regionNext1472 = regionValue1450;
            long regionNext1473 = regionValue1451;
            long regionNext1474 = regionValue1452;
            long regionNext1475 = regionValue1453;
            long regionNext1476 = regionValue1454;
            int regionNext1477 = regionValue1455;
            int regionNext1478 = regionValue1456;
            regionValue1222 = regionNext1469;
            regionValue1223 = regionNext1470;
            regionValue1224 = regionNext1471;
            regionValue1225 = regionNext1472;
            regionValue1226 = regionNext1473;
            regionValue1227 = regionNext1474;
            regionValue1228 = regionNext1475;
            regionValue1229 = regionNext1476;
            regionValue1230 = regionNext1477;
            regionValue1231 = regionNext1478;
            break region231;
        } else {
            java.lang.Object regionNext1489 = regionValue1447;
            int regionNext1490 = regionValue1448;
            long regionNext1491 = regionValue1449;
            long regionNext1492 = regionValue1450;
            long regionNext1493 = regionValue1451;
            long regionNext1494 = regionValue1452;
            long regionNext1495 = regionValue1453;
            long regionNext1496 = regionValue1454;
            int regionNext1497 = regionValue1455;
            int regionNext1498 = regionValue1456;
            regionValue1479 = regionNext1489;
            regionValue1480 = regionNext1490;
            regionValue1481 = regionNext1491;
            regionValue1482 = regionNext1492;
            regionValue1483 = regionNext1493;
            regionValue1484 = regionNext1494;
            regionValue1485 = regionNext1495;
            regionValue1486 = regionNext1496;
            regionValue1487 = regionNext1497;
            regionValue1488 = regionNext1498;
            break region204;
        }
        }
        java.lang.Object regionNext1509 = regionValue1479;
        int regionNext1510 = regionValue1480;
        long regionNext1511 = regionValue1481;
        long regionNext1512 = regionValue1482;
        long regionNext1513 = regionValue1483;
        long regionNext1514 = regionValue1484;
        long regionNext1515 = regionValue1485;
        long regionNext1516 = regionValue1486;
        int regionNext1517 = regionValue1487;
        int regionNext1518 = regionValue1488;
        regionValue1499 = regionNext1509;
        regionValue1500 = regionNext1510;
        regionValue1501 = regionNext1511;
        regionValue1502 = regionNext1512;
        regionValue1503 = regionNext1513;
        regionValue1504 = regionNext1514;
        regionValue1505 = regionNext1515;
        regionValue1506 = regionNext1516;
        regionValue1507 = regionNext1517;
        regionValue1508 = regionNext1518;
        break region206;
        }
        if (regionValue1508 != 0) {
            java.lang.Object regionNext1519 = regionValue1499;
            int regionNext1520 = regionValue1500;
            long regionNext1521 = regionValue1501;
            long regionNext1522 = regionValue1502;
            long regionNext1523 = regionValue1503;
            long regionNext1524 = regionValue1504;
            long regionNext1525 = regionValue1505;
            long regionNext1526 = regionValue1506;
            int regionNext1527 = regionValue1507;
            regionValue1264 = regionNext1519;
            regionValue1265 = regionNext1520;
            regionValue1266 = regionNext1521;
            regionValue1267 = regionNext1522;
            regionValue1268 = regionNext1523;
            regionValue1269 = regionNext1524;
            regionValue1270 = regionNext1525;
            regionValue1271 = regionNext1526;
            regionValue1272 = regionNext1527;
            break region229;
        } else {
            java.lang.Object regionNext1537 = regionValue1499;
            int regionNext1538 = regionValue1500;
            long regionNext1539 = regionValue1501;
            long regionNext1540 = regionValue1502;
            long regionNext1541 = regionValue1503;
            long regionNext1542 = regionValue1504;
            long regionNext1543 = regionValue1505;
            long regionNext1544 = regionValue1506;
            int regionNext1545 = regionValue1507;
            regionValue1528 = regionNext1537;
            regionValue1529 = regionNext1538;
            regionValue1530 = regionNext1539;
            regionValue1531 = regionNext1540;
            regionValue1532 = regionNext1541;
            regionValue1533 = regionNext1542;
            regionValue1534 = regionNext1543;
            regionValue1535 = regionNext1544;
            regionValue1536 = regionNext1545;
            break region207;
        }
        }
        recovery$indy$flow$407(regionValue1528, false);
        java.lang.Object initialValue1546 = recovery$indy$flow$408();
        java.lang.Object initialValue1547 = recovery$indy$flow$409(initialValue1546, 4725792452825451608L, regionValue1531);
        recovery$indy$flow$410(initialValue1547);
        java.lang.Object initialValue1548 = recovery$indy$flow$411();
        java.lang.Object initialValue1549 = recovery$indy$flow$412(initialValue1548, 4725792452825451608L, regionValue1531);
        java.lang.Object initialValue1550 = recovery$indy$flow$413();
        java.lang.Object initialValue1551 = recovery$indy$flow$414(initialValue1550, 4725792452825451608L, regionValue1531);
        double initialValue1552 = recovery$indy$flow$415(initialValue1551);
        double initialValue1553 = recovery$indy$flow$416(initialValue1552, Double.longBitsToDouble(4603579539098121011L));
        recovery$indy$flow$417(initialValue1549, initialValue1553);
        java.lang.Object regionNext1554 = regionValue1528;
        int regionNext1555 = regionValue1529;
        long regionNext1556 = regionValue1530;
        long regionNext1557 = regionValue1531;
        long regionNext1558 = regionValue1532;
        long regionNext1559 = regionValue1533;
        long regionNext1560 = regionValue1534;
        long regionNext1561 = regionValue1535;
        int regionNext1562 = regionValue1536;
        regionValue1264 = regionNext1554;
        regionValue1265 = regionNext1555;
        regionValue1266 = regionNext1556;
        regionValue1267 = regionNext1557;
        regionValue1268 = regionNext1558;
        regionValue1269 = regionNext1559;
        regionValue1270 = regionNext1560;
        regionValue1271 = regionNext1561;
        regionValue1272 = regionNext1562;
        break region229;
        }
        boolean initialValue1563 = recovery$indy$flow$418(regionValue1264);
        java.lang.Object regionNext1564 = regionValue1264;
        int regionNext1565 = regionValue1265;
        long regionNext1566 = regionValue1266;
        long regionNext1567 = regionValue1267;
        long regionNext1568 = regionValue1268;
        long regionNext1569 = regionValue1269;
        long regionNext1570 = regionValue1270;
        long regionNext1571 = regionValue1271;
        int regionNext1572 = regionValue1272;
        int regionNext1573 = (int) ((initialValue1563 ? 1 : 0));
        regionValue1222 = regionNext1564;
        regionValue1223 = regionNext1565;
        regionValue1224 = regionNext1566;
        regionValue1225 = regionNext1567;
        regionValue1226 = regionNext1568;
        regionValue1227 = regionNext1569;
        regionValue1228 = regionNext1570;
        regionValue1229 = regionNext1571;
        regionValue1230 = regionNext1572;
        regionValue1231 = regionNext1573;
        break region231;
        }
        java.lang.Object regionNext1574 = regionValue1222;
        int regionNext1575 = regionValue1223;
        long regionNext1576 = regionValue1224;
        long regionNext1577 = regionValue1225;
        long regionNext1578 = regionValue1226;
        long regionNext1579 = regionValue1227;
        long regionNext1580 = regionValue1228;
        long regionNext1581 = regionValue1229;
        int regionNext1582 = regionValue1230;
        int regionNext1583 = regionValue1231;
        int regionNext1584 = regionValue1230;
        regionValue1403 = regionNext1574;
        regionValue1404 = regionNext1575;
        regionValue1405 = regionNext1576;
        regionValue1406 = regionNext1577;
        regionValue1407 = regionNext1578;
        regionValue1408 = regionNext1579;
        regionValue1409 = regionNext1580;
        regionValue1410 = regionNext1581;
        regionValue1411 = regionNext1582;
        regionValue1412 = regionNext1583;
        regionValue1413 = regionNext1584;
        break region232;
        }
        if (regionValue1413 == 0) {
            java.lang.Object regionNext1595 = regionValue1403;
            int regionNext1596 = regionValue1404;
            long regionNext1597 = regionValue1405;
            long regionNext1598 = regionValue1406;
            long regionNext1599 = regionValue1407;
            long regionNext1600 = regionValue1408;
            long regionNext1601 = regionValue1409;
            long regionNext1602 = regionValue1410;
            int regionNext1603 = regionValue1411;
            int regionNext1604 = regionValue1412;
            regionValue1585 = regionNext1595;
            regionValue1586 = regionNext1596;
            regionValue1587 = regionNext1597;
            regionValue1588 = regionNext1598;
            regionValue1589 = regionNext1599;
            regionValue1590 = regionNext1600;
            regionValue1591 = regionNext1601;
            regionValue1592 = regionNext1602;
            regionValue1593 = regionNext1603;
            regionValue1594 = regionNext1604;
            break region259;
        } else {
            java.lang.Object regionNext1615 = regionValue1403;
            int regionNext1616 = regionValue1404;
            long regionNext1617 = regionValue1405;
            long regionNext1618 = regionValue1406;
            long regionNext1619 = regionValue1407;
            long regionNext1620 = regionValue1408;
            long regionNext1621 = regionValue1409;
            long regionNext1622 = regionValue1410;
            int regionNext1623 = regionValue1411;
            int regionNext1624 = regionValue1412;
            regionValue1605 = regionNext1615;
            regionValue1606 = regionNext1616;
            regionValue1607 = regionNext1617;
            regionValue1608 = regionNext1618;
            regionValue1609 = regionNext1619;
            regionValue1610 = regionNext1620;
            regionValue1611 = regionNext1621;
            regionValue1612 = regionNext1622;
            regionValue1613 = regionNext1623;
            regionValue1614 = regionNext1624;
            break region233;
        }
        }
        if (regionValue1614 != 0) {
            break region460;
        } else {
            java.lang.Object regionNext1634 = regionValue1605;
            int regionNext1635 = regionValue1606;
            long regionNext1636 = regionValue1607;
            long regionNext1637 = regionValue1608;
            long regionNext1638 = regionValue1609;
            long regionNext1639 = regionValue1610;
            long regionNext1640 = regionValue1611;
            long regionNext1641 = regionValue1612;
            int regionNext1642 = regionValue1613;
            regionValue1625 = regionNext1634;
            regionValue1626 = regionNext1635;
            regionValue1627 = regionNext1636;
            regionValue1628 = regionNext1637;
            regionValue1629 = regionNext1638;
            regionValue1630 = regionNext1639;
            regionValue1631 = regionNext1640;
            regionValue1632 = regionNext1641;
            regionValue1633 = regionNext1642;
            break region234;
        }
        }
        int comparison1643 = (regionValue1627 > 0L ? 1 : regionValue1627 == 0L ? 0 : -1);
        if (comparison1643 <= 0) {
            java.lang.Object regionNext1655 = regionValue1625;
            int regionNext1656 = regionValue1626;
            long regionNext1657 = regionValue1627;
            long regionNext1658 = regionValue1628;
            long regionNext1659 = regionValue1629;
            long regionNext1660 = regionValue1630;
            long regionNext1661 = regionValue1631;
            long regionNext1662 = regionValue1632;
            int regionNext1663 = regionValue1633;
            java.lang.Object regionNext1664 = regionValue1625;
            int regionNext1665 = regionValue1633;
            regionValue1644 = regionNext1655;
            regionValue1645 = regionNext1656;
            regionValue1646 = regionNext1657;
            regionValue1647 = regionNext1658;
            regionValue1648 = regionNext1659;
            regionValue1649 = regionNext1660;
            regionValue1650 = regionNext1661;
            regionValue1651 = regionNext1662;
            regionValue1652 = regionNext1663;
            regionValue1653 = regionNext1664;
            regionValue1654 = regionNext1665;
            break region269;
        } else {
            java.lang.Object regionNext1677 = regionValue1625;
            int regionNext1678 = regionValue1626;
            long regionNext1679 = regionValue1627;
            long regionNext1680 = regionValue1628;
            long regionNext1681 = regionValue1629;
            long regionNext1682 = regionValue1630;
            long regionNext1683 = regionValue1631;
            long regionNext1684 = regionValue1632;
            int regionNext1685 = regionValue1633;
            java.lang.Object regionNext1686 = regionValue1625;
            int regionNext1687 = regionValue1633;
            regionValue1666 = regionNext1677;
            regionValue1667 = regionNext1678;
            regionValue1668 = regionNext1679;
            regionValue1669 = regionNext1680;
            regionValue1670 = regionNext1681;
            regionValue1671 = regionNext1682;
            regionValue1672 = regionNext1683;
            regionValue1673 = regionNext1684;
            regionValue1674 = regionNext1685;
            regionValue1675 = regionNext1686;
            regionValue1676 = regionNext1687;
            break region240;
        }
        }
        java.lang.Object regionNext1699 = regionValue1666;
        int regionNext1700 = regionValue1667;
        long regionNext1701 = regionValue1668;
        long regionNext1702 = regionValue1669;
        long regionNext1703 = regionValue1670;
        long regionNext1704 = regionValue1671;
        long regionNext1705 = regionValue1672;
        long regionNext1706 = regionValue1673;
        int regionNext1707 = regionValue1674;
        java.lang.Object regionNext1708 = regionValue1675;
        int regionNext1709 = regionValue1676;
        regionValue1688 = regionNext1699;
        regionValue1689 = regionNext1700;
        regionValue1690 = regionNext1701;
        regionValue1691 = regionNext1702;
        regionValue1692 = regionNext1703;
        regionValue1693 = regionNext1704;
        regionValue1694 = regionNext1705;
        regionValue1695 = regionNext1706;
        regionValue1696 = regionNext1707;
        regionValue1697 = regionNext1708;
        regionValue1698 = regionNext1709;
        break region242;
        }
        if (regionValue1698 == 0) {
            java.lang.Object regionNext1720 = regionValue1688;
            int regionNext1721 = regionValue1689;
            long regionNext1722 = regionValue1690;
            long regionNext1723 = regionValue1691;
            long regionNext1724 = regionValue1692;
            long regionNext1725 = regionValue1693;
            long regionNext1726 = regionValue1694;
            long regionNext1727 = regionValue1695;
            int regionNext1728 = regionValue1696;
            java.lang.Object regionNext1729 = regionValue1697;
            regionValue1710 = regionNext1720;
            regionValue1711 = regionNext1721;
            regionValue1712 = regionNext1722;
            regionValue1713 = regionNext1723;
            regionValue1714 = regionNext1724;
            regionValue1715 = regionNext1725;
            regionValue1716 = regionNext1726;
            regionValue1717 = regionNext1727;
            regionValue1718 = regionNext1728;
            regionValue1719 = regionNext1729;
            break region268;
        } else {
            java.lang.Object regionNext1740 = regionValue1688;
            int regionNext1741 = regionValue1689;
            long regionNext1742 = regionValue1690;
            long regionNext1743 = regionValue1691;
            long regionNext1744 = regionValue1692;
            long regionNext1745 = regionValue1693;
            long regionNext1746 = regionValue1694;
            long regionNext1747 = regionValue1695;
            int regionNext1748 = regionValue1696;
            java.lang.Object regionNext1749 = regionValue1697;
            regionValue1730 = regionNext1740;
            regionValue1731 = regionNext1741;
            regionValue1732 = regionNext1742;
            regionValue1733 = regionNext1743;
            regionValue1734 = regionNext1744;
            regionValue1735 = regionNext1745;
            regionValue1736 = regionNext1746;
            regionValue1737 = regionNext1747;
            regionValue1738 = regionNext1748;
            regionValue1739 = regionNext1749;
            break region243;
        }
        }
        java.lang.Object regionNext1760 = regionValue1730;
        int regionNext1761 = regionValue1731;
        long regionNext1762 = regionValue1732;
        long regionNext1763 = regionValue1733;
        long regionNext1764 = regionValue1734;
        long regionNext1765 = regionValue1735;
        long regionNext1766 = regionValue1736;
        long regionNext1767 = regionValue1737;
        int regionNext1768 = regionValue1738;
        java.lang.Object regionNext1769 = regionValue1739;
        regionValue1750 = regionNext1760;
        regionValue1751 = regionNext1761;
        regionValue1752 = regionNext1762;
        regionValue1753 = regionNext1763;
        regionValue1754 = regionNext1764;
        regionValue1755 = regionNext1765;
        regionValue1756 = regionNext1766;
        regionValue1757 = regionNext1767;
        regionValue1758 = regionNext1768;
        regionValue1759 = regionNext1769;
        break region245;
        }
        java.lang.Object initialValue1770 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(regionValue1750)))).settingHeight));
        double initialValue1771 = recovery$indy$flow$420(initialValue1770, regionValue1756, 4724679502013001184L, regionValue1753);
        boolean initialValue1772 = recovery$indy$flow$421(regionValue1759, regionValue1757, initialValue1771, 4725030986833269710L, regionValue1753);
        java.lang.Object regionNext1773 = regionValue1750;
        int regionNext1774 = regionValue1751;
        long regionNext1775 = regionValue1752;
        long regionNext1776 = regionValue1753;
        long regionNext1777 = regionValue1754;
        long regionNext1778 = regionValue1755;
        long regionNext1779 = regionValue1756;
        long regionNext1780 = regionValue1757;
        int regionNext1781 = regionValue1758;
        int regionNext1782 = (int) ((initialValue1772 ? 1 : 0));
        regionValue1585 = regionNext1773;
        regionValue1586 = regionNext1774;
        regionValue1587 = regionNext1775;
        regionValue1588 = regionNext1776;
        regionValue1589 = regionNext1777;
        regionValue1590 = regionNext1778;
        regionValue1591 = regionNext1779;
        regionValue1592 = regionNext1780;
        regionValue1593 = regionNext1781;
        regionValue1594 = regionNext1782;
        break region259;
        }
        if (regionValue1594 != 0) {
            break region460;
        } else {
            java.lang.Object regionNext1792 = regionValue1585;
            int regionNext1793 = regionValue1586;
            long regionNext1794 = regionValue1587;
            long regionNext1795 = regionValue1588;
            long regionNext1796 = regionValue1589;
            long regionNext1797 = regionValue1590;
            long regionNext1798 = regionValue1591;
            long regionNext1799 = regionValue1592;
            int regionNext1800 = regionValue1593;
            regionValue1783 = regionNext1792;
            regionValue1784 = regionNext1793;
            regionValue1785 = regionNext1794;
            regionValue1786 = regionNext1795;
            regionValue1787 = regionNext1796;
            regionValue1788 = regionNext1797;
            regionValue1789 = regionNext1798;
            regionValue1790 = regionNext1799;
            regionValue1791 = regionNext1800;
            break region260;
        }
        }
        java.lang.Object initialValue1801 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(regionValue1783)))).field_41));
        recovery$indy$flow$423(initialValue1801, 4725699426269888750L, regionValue1786);
        java.lang.Object regionNext1802 = regionValue1783;
        int regionNext1803 = regionValue1784;
        long regionNext1804 = regionValue1785;
        long regionNext1805 = regionValue1786;
        long regionNext1806 = regionValue1787;
        long regionNext1807 = regionValue1788;
        long regionNext1808 = regionValue1789;
        long regionNext1809 = regionValue1790;
        int regionNext1810 = regionValue1791;
        java.lang.Object regionNext1811 = regionValue1783;
        regionValue1710 = regionNext1802;
        regionValue1711 = regionNext1803;
        regionValue1712 = regionNext1804;
        regionValue1713 = regionNext1805;
        regionValue1714 = regionNext1806;
        regionValue1715 = regionNext1807;
        regionValue1716 = regionNext1808;
        regionValue1717 = regionNext1809;
        regionValue1718 = regionNext1810;
        regionValue1719 = regionNext1811;
        break region268;
        }
        java.lang.Object regionNext1812 = regionValue1710;
        int regionNext1813 = regionValue1711;
        long regionNext1814 = regionValue1712;
        long regionNext1815 = regionValue1713;
        long regionNext1816 = regionValue1714;
        long regionNext1817 = regionValue1715;
        long regionNext1818 = regionValue1716;
        long regionNext1819 = regionValue1717;
        int regionNext1820 = regionValue1718;
        java.lang.Object regionNext1821 = regionValue1719;
        int regionNext1822 = 1;
        regionValue1644 = regionNext1812;
        regionValue1645 = regionNext1813;
        regionValue1646 = regionNext1814;
        regionValue1647 = regionNext1815;
        regionValue1648 = regionNext1816;
        regionValue1649 = regionNext1817;
        regionValue1650 = regionNext1818;
        regionValue1651 = regionNext1819;
        regionValue1652 = regionNext1820;
        regionValue1653 = regionNext1821;
        regionValue1654 = regionNext1822;
        break region269;
        }
        recovery$indy$flow$424(regionValue1653, (regionValue1654 != 0));
        if (regionValue1645 <= 0) {
            java.lang.Object regionNext1831 = regionValue1644;
            int regionNext1832 = regionValue1645;
            long regionNext1833 = regionValue1646;
            long regionNext1834 = regionValue1647;
            long regionNext1835 = regionValue1648;
            long regionNext1836 = regionValue1649;
            int regionNext1837 = regionValue1652;
            int regionNext1838 = regionValue1652;
            regionValue1823 = regionNext1831;
            regionValue1824 = regionNext1832;
            regionValue1825 = regionNext1833;
            regionValue1826 = regionNext1834;
            regionValue1827 = regionNext1835;
            regionValue1828 = regionNext1836;
            regionValue1829 = regionNext1837;
            regionValue1830 = regionNext1838;
            break region291;
        } else {
            java.lang.Object regionNext1849 = regionValue1644;
            int regionNext1850 = regionValue1645;
            long regionNext1851 = regionValue1646;
            long regionNext1852 = regionValue1647;
            long regionNext1853 = regionValue1648;
            long regionNext1854 = regionValue1649;
            long regionNext1855 = regionValue1650;
            long regionNext1856 = regionValue1651;
            int regionNext1857 = regionValue1652;
            int regionNext1858 = regionValue1652;
            regionValue1839 = regionNext1849;
            regionValue1840 = regionNext1850;
            regionValue1841 = regionNext1851;
            regionValue1842 = regionNext1852;
            regionValue1843 = regionNext1853;
            regionValue1844 = regionNext1854;
            regionValue1845 = regionNext1855;
            regionValue1846 = regionNext1856;
            regionValue1847 = regionNext1857;
            regionValue1848 = regionNext1858;
            break region273;
        }
        }
        if (regionValue1848 != 0) {
            break region460;
        } else {
            java.lang.Object regionNext1868 = regionValue1839;
            int regionNext1869 = regionValue1840;
            long regionNext1870 = regionValue1841;
            long regionNext1871 = regionValue1842;
            long regionNext1872 = regionValue1843;
            long regionNext1873 = regionValue1844;
            long regionNext1874 = regionValue1845;
            long regionNext1875 = regionValue1846;
            int regionNext1876 = regionValue1847;
            regionValue1859 = regionNext1868;
            regionValue1860 = regionNext1869;
            regionValue1861 = regionNext1870;
            regionValue1862 = regionNext1871;
            regionValue1863 = regionNext1872;
            regionValue1864 = regionNext1873;
            regionValue1865 = regionNext1874;
            regionValue1866 = regionNext1875;
            regionValue1867 = regionNext1876;
            break region274;
        }
        }
        java.lang.Object regionNext1877 = regionValue1859;
        int regionNext1878 = regionValue1860;
        long regionNext1879 = regionValue1861;
        long regionNext1880 = regionValue1862;
        long regionNext1881 = regionValue1863;
        long regionNext1882 = regionValue1864;
        long regionNext1883 = regionValue1865;
        long regionNext1884 = regionValue1866;
        int regionNext1885 = regionValue1867;
        regionValue1158 = regionNext1877;
        regionValue1159 = regionNext1878;
        regionValue1160 = regionNext1879;
        regionValue1161 = regionNext1880;
        regionValue1162 = regionNext1881;
        regionValue1163 = regionNext1882;
        regionValue1164 = regionNext1883;
        regionValue1165 = regionNext1884;
        regionValue1166 = regionNext1885;
        break region276;
        }
        java.lang.Object initialValue1886 = ((java.lang.Object)(((augustus.recovered.modules.movement.Step_47Qe) (((java.lang.Object)(regionValue1158)))).settingHeight));
        double initialValue1887 = recovery$indy$flow$426(initialValue1886, regionValue1164, 4724679502013001184L, regionValue1161);
        boolean initialValue1888 = recovery$indy$flow$427(regionValue1158, regionValue1165, initialValue1887, 4725030986833269710L, regionValue1161);
        java.lang.Object regionNext1889 = regionValue1158;
        int regionNext1890 = regionValue1159;
        long regionNext1891 = regionValue1160;
        long regionNext1892 = regionValue1161;
        long regionNext1893 = regionValue1162;
        long regionNext1894 = regionValue1163;
        int regionNext1895 = regionValue1166;
        int regionNext1896 = (int) ((initialValue1888 ? 1 : 0));
        regionValue1823 = regionNext1889;
        regionValue1824 = regionNext1890;
        regionValue1825 = regionNext1891;
        regionValue1826 = regionNext1892;
        regionValue1827 = regionNext1893;
        regionValue1828 = regionNext1894;
        regionValue1829 = regionNext1895;
        regionValue1830 = regionNext1896;
        break region291;
        }
        if (regionValue1824 <= 0) {
            java.lang.Object regionNext1906 = regionValue1823;
            int regionNext1907 = regionValue1824;
            long regionNext1908 = regionValue1825;
            long regionNext1909 = regionValue1826;
            long regionNext1910 = regionValue1827;
            long regionNext1911 = regionValue1828;
            int regionNext1912 = regionValue1829;
            int regionNext1913 = regionValue1830;
            int regionNext1914 = regionValue1829;
            regionValue1897 = regionNext1906;
            regionValue1898 = regionNext1907;
            regionValue1899 = regionNext1908;
            regionValue1900 = regionNext1909;
            regionValue1901 = regionNext1910;
            regionValue1902 = regionNext1911;
            regionValue1903 = regionNext1912;
            regionValue1904 = regionNext1913;
            regionValue1905 = regionNext1914;
            break region306;
        } else {
            java.lang.Object regionNext1924 = regionValue1823;
            int regionNext1925 = regionValue1824;
            long regionNext1926 = regionValue1825;
            long regionNext1927 = regionValue1826;
            long regionNext1928 = regionValue1827;
            long regionNext1929 = regionValue1828;
            int regionNext1930 = regionValue1829;
            int regionNext1931 = regionValue1830;
            int regionNext1932 = regionValue1829;
            regionValue1915 = regionNext1924;
            regionValue1916 = regionNext1925;
            regionValue1917 = regionNext1926;
            regionValue1918 = regionNext1927;
            regionValue1919 = regionNext1928;
            regionValue1920 = regionNext1929;
            regionValue1921 = regionNext1930;
            regionValue1922 = regionNext1931;
            regionValue1923 = regionNext1932;
            break region294;
        }
        }
        if (regionValue1923 == 0) {
            java.lang.Object regionNext1941 = regionValue1915;
            int regionNext1942 = regionValue1916;
            long regionNext1943 = regionValue1917;
            long regionNext1944 = regionValue1918;
            long regionNext1945 = regionValue1919;
            long regionNext1946 = regionValue1920;
            int regionNext1947 = regionValue1921;
            int regionNext1948 = regionValue1922;
            regionValue1933 = regionNext1941;
            regionValue1934 = regionNext1942;
            regionValue1935 = regionNext1943;
            regionValue1936 = regionNext1944;
            regionValue1937 = regionNext1945;
            regionValue1938 = regionNext1946;
            regionValue1939 = regionNext1947;
            regionValue1940 = regionNext1948;
            break region305;
        } else {
            java.lang.Object regionNext1957 = regionValue1915;
            int regionNext1958 = regionValue1916;
            long regionNext1959 = regionValue1917;
            long regionNext1960 = regionValue1918;
            long regionNext1961 = regionValue1919;
            long regionNext1962 = regionValue1920;
            int regionNext1963 = regionValue1921;
            int regionNext1964 = regionValue1922;
            regionValue1949 = regionNext1957;
            regionValue1950 = regionNext1958;
            regionValue1951 = regionNext1959;
            regionValue1952 = regionNext1960;
            regionValue1953 = regionNext1961;
            regionValue1954 = regionNext1962;
            regionValue1955 = regionNext1963;
            regionValue1956 = regionNext1964;
            break region295;
        }
        }
        java.lang.Object regionNext1973 = regionValue1949;
        int regionNext1974 = regionValue1950;
        long regionNext1975 = regionValue1951;
        long regionNext1976 = regionValue1952;
        long regionNext1977 = regionValue1953;
        long regionNext1978 = regionValue1954;
        int regionNext1979 = regionValue1955;
        int regionNext1980 = regionValue1956;
        regionValue1965 = regionNext1973;
        regionValue1966 = regionNext1974;
        regionValue1967 = regionNext1975;
        regionValue1968 = regionNext1976;
        regionValue1969 = regionNext1977;
        regionValue1970 = regionNext1978;
        regionValue1971 = regionNext1979;
        regionValue1972 = regionNext1980;
        break region297;
        }
        if (regionValue1972 == 0) {
            break region460;
        } else {
            java.lang.Object regionNext1988 = regionValue1965;
            int regionNext1989 = regionValue1966;
            long regionNext1990 = regionValue1967;
            long regionNext1991 = regionValue1968;
            long regionNext1992 = regionValue1969;
            long regionNext1993 = regionValue1970;
            int regionNext1994 = regionValue1971;
            regionValue1981 = regionNext1988;
            regionValue1982 = regionNext1989;
            regionValue1983 = regionNext1990;
            regionValue1984 = regionNext1991;
            regionValue1985 = regionNext1992;
            regionValue1986 = regionNext1993;
            regionValue1987 = regionNext1994;
            break region298;
        }
        }
        java.lang.Object initialValue1995 = recovery$indy$flow$428();
        java.lang.Object initialValue1996 = recovery$indy$flow$429(initialValue1995, 4725792452825451608L, regionValue1984);
        boolean initialValue1997 = recovery$indy$flow$430(initialValue1996);
        java.lang.Object regionNext1998 = regionValue1981;
        int regionNext1999 = regionValue1982;
        long regionNext2000 = regionValue1983;
        long regionNext2001 = regionValue1984;
        long regionNext2002 = regionValue1985;
        long regionNext2003 = regionValue1986;
        int regionNext2004 = regionValue1987;
        int regionNext2005 = (int) ((initialValue1997 ? 1 : 0));
        regionValue1933 = regionNext1998;
        regionValue1934 = regionNext1999;
        regionValue1935 = regionNext2000;
        regionValue1936 = regionNext2001;
        regionValue1937 = regionNext2002;
        regionValue1938 = regionNext2003;
        regionValue1939 = regionNext2004;
        regionValue1940 = regionNext2005;
        break region305;
        }
        java.lang.Object regionNext2006 = regionValue1933;
        int regionNext2007 = regionValue1934;
        long regionNext2008 = regionValue1935;
        long regionNext2009 = regionValue1936;
        long regionNext2010 = regionValue1937;
        long regionNext2011 = regionValue1938;
        int regionNext2012 = regionValue1939;
        int regionNext2013 = regionValue1940;
        int regionNext2014 = regionValue1939;
        regionValue1897 = regionNext2006;
        regionValue1898 = regionNext2007;
        regionValue1899 = regionNext2008;
        regionValue1900 = regionNext2009;
        regionValue1901 = regionNext2010;
        regionValue1902 = regionNext2011;
        regionValue1903 = regionNext2012;
        regionValue1904 = regionNext2013;
        regionValue1905 = regionNext2014;
        break region306;
        }
        if (regionValue1905 == 0) {
            java.lang.Object regionNext2022 = regionValue1897;
            int regionNext2023 = regionValue1898;
            long regionNext2024 = regionValue1899;
            long regionNext2025 = regionValue1900;
            long regionNext2026 = regionValue1902;
            int regionNext2027 = regionValue1903;
            int regionNext2028 = regionValue1904;
            regionValue2015 = regionNext2022;
            regionValue2016 = regionNext2023;
            regionValue2017 = regionNext2024;
            regionValue2018 = regionNext2025;
            regionValue2019 = regionNext2026;
            regionValue2020 = regionNext2027;
            regionValue2021 = regionNext2028;
            break region339;
        } else {
            java.lang.Object regionNext2037 = regionValue1897;
            int regionNext2038 = regionValue1898;
            long regionNext2039 = regionValue1899;
            long regionNext2040 = regionValue1900;
            long regionNext2041 = regionValue1901;
            long regionNext2042 = regionValue1902;
            int regionNext2043 = regionValue1903;
            int regionNext2044 = regionValue1904;
            regionValue2029 = regionNext2037;
            regionValue2030 = regionNext2038;
            regionValue2031 = regionNext2039;
            regionValue2032 = regionNext2040;
            regionValue2033 = regionNext2041;
            regionValue2034 = regionNext2042;
            regionValue2035 = regionNext2043;
            regionValue2036 = regionNext2044;
            break region307;
        }
        }
        if (regionValue2036 == 0) {
            java.lang.Object regionNext2051 = regionValue2029;
            int regionNext2052 = regionValue2030;
            long regionNext2053 = regionValue2031;
            long regionNext2054 = regionValue2032;
            long regionNext2055 = regionValue2034;
            int regionNext2056 = regionValue2035;
            regionValue2045 = regionNext2051;
            regionValue2046 = regionNext2052;
            regionValue2047 = regionNext2053;
            regionValue2048 = regionNext2054;
            regionValue2049 = regionNext2055;
            regionValue2050 = regionNext2056;
            break region320;
        } else {
            java.lang.Object regionNext2064 = regionValue2029;
            int regionNext2065 = regionValue2030;
            long regionNext2066 = regionValue2031;
            long regionNext2067 = regionValue2032;
            long regionNext2068 = regionValue2033;
            long regionNext2069 = regionValue2034;
            int regionNext2070 = regionValue2035;
            regionValue2057 = regionNext2064;
            regionValue2058 = regionNext2065;
            regionValue2059 = regionNext2066;
            regionValue2060 = regionNext2067;
            regionValue2061 = regionNext2068;
            regionValue2062 = regionNext2069;
            regionValue2063 = regionNext2070;
            break region308;
        }
        }
        java.lang.Object initialValue2071 = recovery$indy$flow$431();
        java.lang.Object initialValue2072 = recovery$indy$flow$432(initialValue2071, 4725792452825451608L, regionValue2060);
        recovery$indy$flow$433(initialValue2072, Double.longBitsToDouble(4601399796878473691L));
        recovery$indy$flow$434(regionValue2061, 4725587931750295056L, regionValue2060);
        java.lang.Object regionNext2073 = regionValue2057;
        int regionNext2074 = regionValue2058;
        long regionNext2075 = regionValue2059;
        long regionNext2076 = regionValue2060;
        long regionNext2077 = regionValue2062;
        int regionNext2078 = regionValue2063;
        regionValue2045 = regionNext2073;
        regionValue2046 = regionNext2074;
        regionValue2047 = regionNext2075;
        regionValue2048 = regionNext2076;
        regionValue2049 = regionNext2077;
        regionValue2050 = regionNext2078;
        break region320;
        }
        java.lang.Object initialValue2079 = recovery$indy$flow$435();
        java.lang.Object initialValue2080 = recovery$indy$flow$436(initialValue2079, 4725792452825451608L, regionValue2048);
        double initialValue2081 = recovery$indy$flow$437(initialValue2080);
        double computed2082 = initialValue2081 % 1.0D;
        int comparison2083 = (regionValue2047 > 0L ? 1 : regionValue2047 == 0L ? 0 : -1);
        if (comparison2083 < 0) {
            java.lang.Object regionNext2092 = regionValue2045;
            int regionNext2093 = regionValue2046;
            long regionNext2094 = regionValue2047;
            long regionNext2095 = regionValue2048;
            long regionNext2096 = regionValue2049;
            int regionNext2097 = regionValue2050;
            double regionNext2098 = computed2082;
            int regionNext2099 = regionValue2050;
            regionValue2084 = regionNext2092;
            regionValue2085 = regionNext2093;
            regionValue2086 = regionNext2094;
            regionValue2087 = regionNext2095;
            regionValue2088 = regionNext2096;
            regionValue2089 = regionNext2097;
            regionValue2090 = regionNext2098;
            regionValue2091 = regionNext2099;
            break region342;
        } else {
            java.lang.Object regionNext2108 = regionValue2045;
            int regionNext2109 = regionValue2046;
            long regionNext2110 = regionValue2047;
            long regionNext2111 = regionValue2048;
            long regionNext2112 = regionValue2049;
            int regionNext2113 = regionValue2050;
            double regionNext2114 = computed2082;
            int regionNext2115 = regionValue2050;
            regionValue2100 = regionNext2108;
            regionValue2101 = regionNext2109;
            regionValue2102 = regionNext2110;
            regionValue2103 = regionNext2111;
            regionValue2104 = regionNext2112;
            regionValue2105 = regionNext2113;
            regionValue2106 = regionNext2114;
            regionValue2107 = regionNext2115;
            break region332;
        }
        }
        if (regionValue2107 == 0) {
            java.lang.Object regionNext2123 = regionValue2100;
            int regionNext2124 = regionValue2101;
            long regionNext2125 = regionValue2102;
            long regionNext2126 = regionValue2103;
            long regionNext2127 = regionValue2104;
            int regionNext2128 = regionValue2105;
            double regionNext2129 = regionValue2106;
            regionValue2116 = regionNext2123;
            regionValue2117 = regionNext2124;
            regionValue2118 = regionNext2125;
            regionValue2119 = regionNext2126;
            regionValue2120 = regionNext2127;
            regionValue2121 = regionNext2128;
            regionValue2122 = regionNext2129;
            break region341;
        } else {
            java.lang.Object regionNext2137 = regionValue2100;
            int regionNext2138 = regionValue2101;
            long regionNext2139 = regionValue2102;
            long regionNext2140 = regionValue2103;
            long regionNext2141 = regionValue2104;
            int regionNext2142 = regionValue2105;
            double regionNext2143 = regionValue2106;
            regionValue2130 = regionNext2137;
            regionValue2131 = regionNext2138;
            regionValue2132 = regionNext2139;
            regionValue2133 = regionNext2140;
            regionValue2134 = regionNext2141;
            regionValue2135 = regionNext2142;
            regionValue2136 = regionNext2143;
            break region333;
        }
        }
        java.lang.Object regionNext2151 = regionValue2130;
        int regionNext2152 = regionValue2131;
        long regionNext2153 = regionValue2132;
        long regionNext2154 = regionValue2133;
        long regionNext2155 = regionValue2134;
        int regionNext2156 = regionValue2135;
        double regionNext2157 = regionValue2136;
        regionValue2144 = regionNext2151;
        regionValue2145 = regionNext2152;
        regionValue2146 = regionNext2153;
        regionValue2147 = regionNext2154;
        regionValue2148 = regionNext2155;
        regionValue2149 = regionNext2156;
        regionValue2150 = regionNext2157;
        break region335;
        }
        int comparison2158 = (java.lang.Double.isNaN(regionValue2150) || java.lang.Double.isNaN(Double.longBitsToDouble(4604480259023595110L)) ? -1 : (regionValue2150 > Double.longBitsToDouble(4604480259023595110L) ? 1 : regionValue2150 == Double.longBitsToDouble(4604480259023595110L) ? 0 : -1));
        java.lang.Object regionNext2159 = regionValue2144;
        int regionNext2160 = regionValue2145;
        long regionNext2161 = regionValue2146;
        long regionNext2162 = regionValue2147;
        long regionNext2163 = regionValue2148;
        int regionNext2164 = regionValue2149;
        int regionNext2165 = comparison2158;
        regionValue2015 = regionNext2159;
        regionValue2016 = regionNext2160;
        regionValue2017 = regionNext2161;
        regionValue2018 = regionNext2162;
        regionValue2019 = regionNext2163;
        regionValue2020 = regionNext2164;
        regionValue2021 = regionNext2165;
        break region339;
        }
        if (regionValue2021 <= 0) {
            break region460;
        } else {
            java.lang.Object regionNext2172 = regionValue2015;
            int regionNext2173 = regionValue2016;
            long regionNext2174 = regionValue2017;
            long regionNext2175 = regionValue2018;
            long regionNext2176 = regionValue2019;
            int regionNext2177 = regionValue2020;
            regionValue2166 = regionNext2172;
            regionValue2167 = regionNext2173;
            regionValue2168 = regionNext2174;
            regionValue2169 = regionNext2175;
            regionValue2170 = regionNext2176;
            regionValue2171 = regionNext2177;
            break region340;
        }
        }
        java.lang.Object regionNext2178 = regionValue2166;
        int regionNext2179 = regionValue2167;
        long regionNext2180 = regionValue2168;
        long regionNext2181 = regionValue2169;
        long regionNext2182 = regionValue2170;
        int regionNext2183 = regionValue2171;
        double regionNext2184 = Double.longBitsToDouble(4592590756007337001L);
        regionValue2116 = regionNext2178;
        regionValue2117 = regionNext2179;
        regionValue2118 = regionNext2180;
        regionValue2119 = regionNext2181;
        regionValue2120 = regionNext2182;
        regionValue2121 = regionNext2183;
        regionValue2122 = regionNext2184;
        break region341;
        }
        java.lang.Object regionNext2185 = regionValue2116;
        int regionNext2186 = regionValue2117;
        long regionNext2187 = regionValue2118;
        long regionNext2188 = regionValue2119;
        long regionNext2189 = regionValue2120;
        int regionNext2190 = regionValue2121;
        double regionNext2191 = regionValue2122;
        int regionNext2192 = 0;
        regionValue2084 = regionNext2185;
        regionValue2085 = regionNext2186;
        regionValue2086 = regionNext2187;
        regionValue2087 = regionNext2188;
        regionValue2088 = regionNext2189;
        regionValue2089 = regionNext2190;
        regionValue2090 = regionNext2191;
        regionValue2091 = regionNext2192;
        break region342;
        }
        int initialValue2193 = regionValue2091;
        double initialValue2194 = regionValue2090;
        recovery$indy$flow$438(regionValue2088, initialValue2194, (initialValue2193 != 0), 4725430372640643562L, regionValue2087);
        if (regionValue2089 != 0) {
            break region460;
        } else {
            java.lang.Object regionNext2195 = regionValue2084;
            int regionNext2196 = regionValue2085;
            long regionNext2197 = regionValue2086;
            long regionNext2198 = regionValue2087;
            int regionNext2199 = regionValue2089;
            regionValue1176 = regionNext2195;
            regionValue1177 = regionNext2196;
            regionValue1178 = regionNext2197;
            regionValue1179 = regionNext2198;
            regionValue1180 = regionNext2199;
            break region352;
        }
        }
        java.lang.Object initialValue2200 = recovery$indy$flow$439();
        java.lang.Object initialValue2201 = recovery$indy$flow$440(initialValue2200, 4725792452825451608L, regionValue1179);
        if (regionValue1180 == 0) {
            java.lang.Object regionNext2208 = regionValue1176;
            int regionNext2209 = regionValue1177;
            long regionNext2210 = regionValue1178;
            long regionNext2211 = regionValue1179;
            int regionNext2212 = regionValue1180;
            java.lang.Object regionNext2213 = initialValue2201;
            regionValue2202 = regionNext2208;
            regionValue2203 = regionNext2209;
            regionValue2204 = regionNext2210;
            regionValue2205 = regionNext2211;
            regionValue2206 = regionNext2212;
            regionValue2207 = regionNext2213;
            break region389;
        } else {
            java.lang.Object regionNext2220 = regionValue1176;
            int regionNext2221 = regionValue1177;
            long regionNext2222 = regionValue1178;
            long regionNext2223 = regionValue1179;
            int regionNext2224 = regionValue1180;
            java.lang.Object regionNext2225 = initialValue2201;
            regionValue2214 = regionNext2220;
            regionValue2215 = regionNext2221;
            regionValue2216 = regionNext2222;
            regionValue2217 = regionNext2223;
            regionValue2218 = regionNext2224;
            regionValue2219 = regionNext2225;
            break region358;
        }
        }
        java.lang.Object regionNext2232 = regionValue2214;
        int regionNext2233 = regionValue2215;
        long regionNext2234 = regionValue2216;
        long regionNext2235 = regionValue2217;
        int regionNext2236 = regionValue2218;
        java.lang.Object regionNext2237 = regionValue2219;
        regionValue2226 = regionNext2232;
        regionValue2227 = regionNext2233;
        regionValue2228 = regionNext2234;
        regionValue2229 = regionNext2235;
        regionValue2230 = regionNext2236;
        regionValue2231 = regionNext2237;
        break region360;
        }
        int initialValue2238 = recovery$indy$flow$441(regionValue2231);
        if (regionValue2227 < 0) {
            java.lang.Object regionNext2245 = regionValue2226;
            int regionNext2246 = regionValue2227;
            long regionNext2247 = regionValue2228;
            long regionNext2248 = regionValue2229;
            int regionNext2249 = regionValue2230;
            int regionNext2250 = initialValue2238;
            regionValue2239 = regionNext2245;
            regionValue2240 = regionNext2246;
            regionValue2241 = regionNext2247;
            regionValue2242 = regionNext2248;
            regionValue2243 = regionNext2249;
            regionValue2244 = regionNext2250;
            break region382;
        } else {
            java.lang.Object regionNext2257 = regionValue2226;
            int regionNext2258 = regionValue2227;
            long regionNext2259 = regionValue2228;
            long regionNext2260 = regionValue2229;
            int regionNext2261 = regionValue2230;
            int regionNext2262 = initialValue2238;
            regionValue2251 = regionNext2257;
            regionValue2252 = regionNext2258;
            regionValue2253 = regionNext2259;
            regionValue2254 = regionNext2260;
            regionValue2255 = regionNext2261;
            regionValue2256 = regionNext2262;
            break region363;
        }
        }
        java.lang.Object regionNext2269 = regionValue2251;
        int regionNext2270 = regionValue2252;
        long regionNext2271 = regionValue2253;
        long regionNext2272 = regionValue2254;
        int regionNext2273 = regionValue2255;
        int regionNext2274 = regionValue2256;
        regionValue2263 = regionNext2269;
        regionValue2264 = regionNext2270;
        regionValue2265 = regionNext2271;
        regionValue2266 = regionNext2272;
        regionValue2267 = regionNext2273;
        regionValue2268 = regionNext2274;
        break region365;
        }
        if (regionValue2268 <= 11) {
            java.lang.Object regionNext2280 = regionValue2263;
            int regionNext2281 = regionValue2264;
            long regionNext2282 = regionValue2265;
            long regionNext2283 = regionValue2266;
            int regionNext2284 = regionValue2267;
            regionValue2275 = regionNext2280;
            regionValue2276 = regionNext2281;
            regionValue2277 = regionNext2282;
            regionValue2278 = regionNext2283;
            regionValue2279 = regionNext2284;
            break region383;
        } else {
            java.lang.Object regionNext2290 = regionValue2263;
            int regionNext2291 = regionValue2264;
            long regionNext2292 = regionValue2265;
            long regionNext2293 = regionValue2266;
            int regionNext2294 = regionValue2267;
            regionValue2285 = regionNext2290;
            regionValue2286 = regionNext2291;
            regionValue2287 = regionNext2292;
            regionValue2288 = regionNext2293;
            regionValue2289 = regionNext2294;
            break region367;
        }
        }
        java.lang.Object regionNext2300 = regionValue2285;
        int regionNext2301 = regionValue2286;
        long regionNext2302 = regionValue2287;
        long regionNext2303 = regionValue2288;
        int regionNext2304 = regionValue2289;
        regionValue2295 = regionNext2300;
        regionValue2296 = regionNext2301;
        regionValue2297 = regionNext2302;
        regionValue2298 = regionNext2303;
        regionValue2299 = regionNext2304;
        break region369;
        }
        java.lang.Object initialValue2305 = recovery$indy$flow$442();
        if (regionValue2296 < 0) {
            java.lang.Object regionNext2314 = regionValue2295;
            int regionNext2315 = regionValue2296;
            long regionNext2316 = regionValue2297;
            long regionNext2317 = regionValue2298;
            int regionNext2318 = regionValue2299;
            java.lang.Object regionNext2319 = initialValue2305;
            long regionNext2320 = 4725792452825451608L;
            long regionNext2321 = regionValue2298;
            regionValue2306 = regionNext2314;
            regionValue2307 = regionNext2315;
            regionValue2308 = regionNext2316;
            regionValue2309 = regionNext2317;
            regionValue2310 = regionNext2318;
            regionValue2311 = regionNext2319;
            regionValue2312 = regionNext2320;
            regionValue2313 = regionNext2321;
            break region388;
        } else {
            java.lang.Object regionNext2330 = regionValue2295;
            int regionNext2331 = regionValue2296;
            long regionNext2332 = regionValue2297;
            long regionNext2333 = regionValue2298;
            int regionNext2334 = regionValue2299;
            java.lang.Object regionNext2335 = initialValue2305;
            long regionNext2336 = 4725792452825451608L;
            long regionNext2337 = regionValue2298;
            regionValue2322 = regionNext2330;
            regionValue2323 = regionNext2331;
            regionValue2324 = regionNext2332;
            regionValue2325 = regionNext2333;
            regionValue2326 = regionNext2334;
            regionValue2327 = regionNext2335;
            regionValue2328 = regionNext2336;
            regionValue2329 = regionNext2337;
            break region374;
        }
        }
        java.lang.Object regionNext2346 = regionValue2322;
        int regionNext2347 = regionValue2323;
        long regionNext2348 = regionValue2324;
        long regionNext2349 = regionValue2325;
        int regionNext2350 = regionValue2326;
        java.lang.Object regionNext2351 = regionValue2327;
        long regionNext2352 = regionValue2328;
        long regionNext2353 = regionValue2329;
        regionValue2338 = regionNext2346;
        regionValue2339 = regionNext2347;
        regionValue2340 = regionNext2348;
        regionValue2341 = regionNext2349;
        regionValue2342 = regionNext2350;
        regionValue2343 = regionNext2351;
        regionValue2344 = regionNext2352;
        regionValue2345 = regionNext2353;
        break region376;
        }
        java.lang.Object initialValue2354 = recovery$indy$flow$443(regionValue2343, regionValue2344, regionValue2345);
        recovery$indy$flow$444(initialValue2354, 1.0F);
        java.lang.Object regionNext2355 = regionValue2338;
        int regionNext2356 = regionValue2339;
        long regionNext2357 = regionValue2340;
        long regionNext2358 = regionValue2341;
        int regionNext2359 = regionValue2342;
        int regionNext2360 = regionValue2342;
        regionValue2239 = regionNext2355;
        regionValue2240 = regionNext2356;
        regionValue2241 = regionNext2357;
        regionValue2242 = regionNext2358;
        regionValue2243 = regionNext2359;
        regionValue2244 = regionNext2360;
        break region382;
        }
        if (regionValue2244 != 0) {
            break region460;
        } else {
            java.lang.Object regionNext2361 = regionValue2239;
            int regionNext2362 = regionValue2240;
            long regionNext2363 = regionValue2241;
            long regionNext2364 = regionValue2242;
            int regionNext2365 = regionValue2243;
            regionValue2275 = regionNext2361;
            regionValue2276 = regionNext2362;
            regionValue2277 = regionNext2363;
            regionValue2278 = regionNext2364;
            regionValue2279 = regionNext2365;
            break region383;
        }
        }
        java.lang.Object initialValue2366 = recovery$indy$flow$445();
        java.lang.Object regionNext2367 = regionValue2275;
        int regionNext2368 = regionValue2276;
        long regionNext2369 = regionValue2277;
        long regionNext2370 = regionValue2278;
        int regionNext2371 = regionValue2279;
        java.lang.Object regionNext2372 = initialValue2366;
        long regionNext2373 = 4725792452825451608L;
        long regionNext2374 = regionValue2278;
        regionValue2306 = regionNext2367;
        regionValue2307 = regionNext2368;
        regionValue2308 = regionNext2369;
        regionValue2309 = regionNext2370;
        regionValue2310 = regionNext2371;
        regionValue2311 = regionNext2372;
        regionValue2312 = regionNext2373;
        regionValue2313 = regionNext2374;
        break region388;
        }
        java.lang.Object initialValue2375 = recovery$indy$flow$446(regionValue2311, regionValue2312, regionValue2313);
        java.lang.Object regionNext2376 = regionValue2306;
        int regionNext2377 = regionValue2307;
        long regionNext2378 = regionValue2308;
        long regionNext2379 = regionValue2309;
        int regionNext2380 = regionValue2310;
        java.lang.Object regionNext2381 = initialValue2375;
        regionValue2202 = regionNext2376;
        regionValue2203 = regionNext2377;
        regionValue2204 = regionNext2378;
        regionValue2205 = regionNext2379;
        regionValue2206 = regionNext2380;
        regionValue2207 = regionNext2381;
        break region389;
        }
        recovery$indy$flow$447(regionValue2207, Float.intBitsToFloat(1058642330));
        if (regionValue2206 != 0) {
            break region460;
        } else {
            java.lang.Object regionNext2382 = regionValue2202;
            int regionNext2383 = regionValue2203;
            long regionNext2384 = regionValue2204;
            long regionNext2385 = regionValue2205;
            int regionNext2386 = regionValue2206;
            regionValue1186 = regionNext2382;
            regionValue1187 = regionNext2383;
            regionValue1188 = regionNext2384;
            regionValue1189 = regionNext2385;
            regionValue1190 = regionNext2386;
            break region393;
        }
        }
        java.lang.Object initialValue2387 = recovery$indy$flow$448();
        java.lang.Object initialValue2388 = recovery$indy$flow$449(initialValue2387, 4725792452825451608L, regionValue1189);
        if (regionValue1190 == 0) {
            java.lang.Object regionNext2390 = initialValue2388;
            regionValue2389 = regionNext2390;
            break region458;
        } else {
            java.lang.Object regionNext2397 = regionValue1186;
            int regionNext2398 = regionValue1187;
            long regionNext2399 = regionValue1188;
            long regionNext2400 = regionValue1189;
            int regionNext2401 = regionValue1190;
            java.lang.Object regionNext2402 = initialValue2388;
            regionValue2391 = regionNext2397;
            regionValue2392 = regionNext2398;
            regionValue2393 = regionNext2399;
            regionValue2394 = regionNext2400;
            regionValue2395 = regionNext2401;
            regionValue2396 = regionNext2402;
            break region399;
        }
        }
        java.lang.Object regionNext2409 = regionValue2391;
        int regionNext2410 = regionValue2392;
        long regionNext2411 = regionValue2393;
        long regionNext2412 = regionValue2394;
        int regionNext2413 = regionValue2395;
        java.lang.Object regionNext2414 = regionValue2396;
        regionValue2403 = regionNext2409;
        regionValue2404 = regionNext2410;
        regionValue2405 = regionNext2411;
        regionValue2406 = regionNext2412;
        regionValue2407 = regionNext2413;
        regionValue2408 = regionNext2414;
        break region401;
        }
        int initialValue2415 = recovery$indy$flow$450(regionValue2408);
        if (initialValue2415 <= 40) {
            long regionNext2417 = regionValue2406;
            regionValue2416 = regionNext2417;
            break region452;
        } else {
            java.lang.Object regionNext2423 = regionValue2403;
            int regionNext2424 = regionValue2404;
            long regionNext2425 = regionValue2405;
            long regionNext2426 = regionValue2406;
            int regionNext2427 = regionValue2407;
            regionValue2418 = regionNext2423;
            regionValue2419 = regionNext2424;
            regionValue2420 = regionNext2425;
            regionValue2421 = regionNext2426;
            regionValue2422 = regionNext2427;
            break region404;
        }
        }
        java.lang.Object regionNext2433 = regionValue2418;
        int regionNext2434 = regionValue2419;
        long regionNext2435 = regionValue2420;
        long regionNext2436 = regionValue2421;
        int regionNext2437 = regionValue2422;
        regionValue2428 = regionNext2433;
        regionValue2429 = regionNext2434;
        regionValue2430 = regionNext2435;
        regionValue2431 = regionNext2436;
        regionValue2432 = regionNext2437;
        break region406;
        }
        java.lang.Object initialValue2438 = recovery$indy$flow$451();
        java.lang.Object initialValue2439 = recovery$indy$flow$452(initialValue2438, 4725792452825451608L, regionValue2431);
        if (regionValue2432 == 0) {
            java.lang.Object regionNext2440 = initialValue2439;
            regionValue2389 = regionNext2440;
            break region458;
        } else {
            java.lang.Object regionNext2447 = regionValue2428;
            int regionNext2448 = regionValue2429;
            long regionNext2449 = regionValue2430;
            long regionNext2450 = regionValue2431;
            int regionNext2451 = regionValue2432;
            java.lang.Object regionNext2452 = initialValue2439;
            regionValue2441 = regionNext2447;
            regionValue2442 = regionNext2448;
            regionValue2443 = regionNext2449;
            regionValue2444 = regionNext2450;
            regionValue2445 = regionNext2451;
            regionValue2446 = regionNext2452;
            break region412;
        }
        }
        java.lang.Object regionNext2459 = regionValue2441;
        int regionNext2460 = regionValue2442;
        long regionNext2461 = regionValue2443;
        long regionNext2462 = regionValue2444;
        int regionNext2463 = regionValue2445;
        java.lang.Object regionNext2464 = regionValue2446;
        regionValue2453 = regionNext2459;
        regionValue2454 = regionNext2460;
        regionValue2455 = regionNext2461;
        regionValue2456 = regionNext2462;
        regionValue2457 = regionNext2463;
        regionValue2458 = regionNext2464;
        break region414;
        }
        double initialValue2465 = recovery$indy$flow$453(regionValue2458);
        int comparison2466 = (java.lang.Double.isNaN(initialValue2465) || java.lang.Double.isNaN(0.0D) ? 1 : (initialValue2465 > 0.0D ? 1 : initialValue2465 == 0.0D ? 0 : -1));
        int comparison2467 = (regionValue2455 > 0L ? 1 : regionValue2455 == 0L ? 0 : -1);
        if (comparison2467 < 0) {
            int regionNext2473 = regionValue2454;
            long regionNext2474 = regionValue2455;
            long regionNext2475 = regionValue2456;
            int regionNext2476 = regionValue2457;
            int regionNext2477 = comparison2466;
            regionValue2468 = regionNext2473;
            regionValue2469 = regionNext2474;
            regionValue2470 = regionNext2475;
            regionValue2471 = regionNext2476;
            regionValue2472 = regionNext2477;
            break region430;
        } else {
            java.lang.Object regionNext2484 = regionValue2453;
            int regionNext2485 = regionValue2454;
            long regionNext2486 = regionValue2455;
            long regionNext2487 = regionValue2456;
            int regionNext2488 = regionValue2457;
            int regionNext2489 = comparison2466;
            regionValue2478 = regionNext2484;
            regionValue2479 = regionNext2485;
            regionValue2480 = regionNext2486;
            regionValue2481 = regionNext2487;
            regionValue2482 = regionNext2488;
            regionValue2483 = regionNext2489;
            break region421;
        }
        }
        java.lang.Object regionNext2496 = regionValue2478;
        int regionNext2497 = regionValue2479;
        long regionNext2498 = regionValue2480;
        long regionNext2499 = regionValue2481;
        int regionNext2500 = regionValue2482;
        int regionNext2501 = regionValue2483;
        regionValue2490 = regionNext2496;
        regionValue2491 = regionNext2497;
        regionValue2492 = regionNext2498;
        regionValue2493 = regionNext2499;
        regionValue2494 = regionNext2500;
        regionValue2495 = regionNext2501;
        break region423;
        }
        if (regionValue2495 > 0) {
            long regionNext2502 = regionValue2493;
            regionValue2416 = regionNext2502;
            break region452;
        } else {
            java.lang.Object regionNext2508 = regionValue2490;
            int regionNext2509 = regionValue2491;
            long regionNext2510 = regionValue2492;
            long regionNext2511 = regionValue2493;
            int regionNext2512 = regionValue2494;
            regionValue2503 = regionNext2508;
            regionValue2504 = regionNext2509;
            regionValue2505 = regionNext2510;
            regionValue2506 = regionNext2511;
            regionValue2507 = regionNext2512;
            break region424;
        }
        }
        java.lang.Object regionNext2518 = regionValue2503;
        int regionNext2519 = regionValue2504;
        long regionNext2520 = regionValue2505;
        long regionNext2521 = regionValue2506;
        int regionNext2522 = regionValue2507;
        regionValue2513 = regionNext2518;
        regionValue2514 = regionNext2519;
        regionValue2515 = regionNext2520;
        regionValue2516 = regionNext2521;
        regionValue2517 = regionNext2522;
        break region426;
        }
        int initialValue2523 = recovery$indy$flow$454(regionValue2513);
        int regionNext2524 = regionValue2514;
        long regionNext2525 = regionValue2515;
        long regionNext2526 = regionValue2516;
        int regionNext2527 = regionValue2517;
        int regionNext2528 = initialValue2523;
        regionValue2468 = regionNext2524;
        regionValue2469 = regionNext2525;
        regionValue2470 = regionNext2526;
        regionValue2471 = regionNext2527;
        regionValue2472 = regionNext2528;
        break region430;
        }
        if (regionValue2468 < 0) {
            long regionNext2531 = regionValue2470;
            int regionNext2532 = regionValue2472;
            regionValue2529 = regionNext2531;
            regionValue2530 = regionNext2532;
            break region451;
        } else {
            long regionNext2537 = regionValue2469;
            long regionNext2538 = regionValue2470;
            int regionNext2539 = regionValue2471;
            int regionNext2540 = regionValue2472;
            regionValue2533 = regionNext2537;
            regionValue2534 = regionNext2538;
            regionValue2535 = regionNext2539;
            regionValue2536 = regionNext2540;
            break region432;
        }
        }
        if (regionValue2536 <= 4) {
            long regionNext2541 = regionValue2534;
            regionValue2416 = regionNext2541;
            break region452;
        } else {
            long regionNext2545 = regionValue2533;
            long regionNext2546 = regionValue2534;
            int regionNext2547 = regionValue2535;
            regionValue2542 = regionNext2545;
            regionValue2543 = regionNext2546;
            regionValue2544 = regionNext2547;
            break region434;
        }
        }
        long regionNext2551 = regionValue2542;
        long regionNext2552 = regionValue2543;
        int regionNext2553 = regionValue2544;
        regionValue2548 = regionNext2551;
        regionValue2549 = regionNext2552;
        regionValue2550 = regionNext2553;
        break region436;
        }
        java.lang.Object initialValue2554 = recovery$indy$flow$455();
        int comparison2555 = (regionValue2548 > 0L ? 1 : regionValue2548 == 0L ? 0 : -1);
        if (comparison2555 <= 0) {
            java.lang.Object regionNext2559 = initialValue2554;
            long regionNext2560 = 4725792452825451608L;
            long regionNext2561 = regionValue2549;
            regionValue2556 = regionNext2559;
            regionValue2557 = regionNext2560;
            regionValue2558 = regionNext2561;
            break region457;
        } else {
            long regionNext2567 = regionValue2549;
            int regionNext2568 = regionValue2550;
            java.lang.Object regionNext2569 = initialValue2554;
            long regionNext2570 = 4725792452825451608L;
            long regionNext2571 = regionValue2549;
            regionValue2562 = regionNext2567;
            regionValue2563 = regionNext2568;
            regionValue2564 = regionNext2569;
            regionValue2565 = regionNext2570;
            regionValue2566 = regionNext2571;
            break region443;
        }
        }
        long regionNext2577 = regionValue2562;
        int regionNext2578 = regionValue2563;
        java.lang.Object regionNext2579 = regionValue2564;
        long regionNext2580 = regionValue2565;
        long regionNext2581 = regionValue2566;
        regionValue2572 = regionNext2577;
        regionValue2573 = regionNext2578;
        regionValue2574 = regionNext2579;
        regionValue2575 = regionNext2580;
        regionValue2576 = regionNext2581;
        break region445;
        }
        java.lang.Object initialValue2582 = recovery$indy$flow$456(regionValue2574, regionValue2575, regionValue2576);
        recovery$indy$flow$457(initialValue2582, 1.0F);
        long regionNext2583 = regionValue2572;
        int regionNext2584 = regionValue2573;
        regionValue2529 = regionNext2583;
        regionValue2530 = regionNext2584;
        break region451;
        }
        if (regionValue2530 != 0) {
            break region460;
        } else {
            long regionNext2585 = regionValue2529;
            regionValue2416 = regionNext2585;
            break region452;
        }
        }
        java.lang.Object initialValue2586 = recovery$indy$flow$458();
        java.lang.Object regionNext2587 = initialValue2586;
        long regionNext2588 = 4725792452825451608L;
        long regionNext2589 = regionValue2416;
        regionValue2556 = regionNext2587;
        regionValue2557 = regionNext2588;
        regionValue2558 = regionNext2589;
        break region457;
        }
        java.lang.Object initialValue2590 = recovery$indy$flow$459(regionValue2556, regionValue2557, regionValue2558);
        java.lang.Object regionNext2591 = initialValue2590;
        regionValue2389 = regionNext2591;
        break region458;
        }
        recovery$indy$flow$460(regionValue2389, Float.intBitsToFloat(1058642330));
        break region460;
        }
        return;
    }






   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 130081966373075L;
      long var3 = var1 ^ 1236204785348L;
      long var10002 = -3801486638533116254L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Hypixel");
   }



   public void method_49$00e8a5c761(long var1, net.C_47S7 var3) {
        int var142;
      long var4 = var1 ^ 115069275051308L;
      long var6 = var1 ^ 93194634861730L;
      long var8 = var1 ^ 95297137237664L;
      long var10000 = -2784262408113990485L;
      byte var10 = ((byte) (Fly_47kE.method_49t$aae029aa0a() ? 1 : 0));
      if (var10 == 0) {
         if (this.field_43P) {
            long var149 = -2783545705774288729L;
            net.minecraft.client.Minecraft var13 = field_43;
            var13.method_46$159e3d0645().field_43 = 1.0F;
            var149 = -2784857175664551903L;
            net.C_47cu var14 = this.field_47;
            var14.method_46$da8c82d5d4();
            this.field_43P = false;
         }

         long var179 = -2785408378698863420L;
         long var37 = var6;
         client.setting.ModeSetting var38 = this.settingModes;
         String var34 = var38.method_46$5f9dc63072(var37);
         byte var35 = -1;
         switch (var34.hashCode()) {
            case 1897755483:
               if (var34.equals("Vanilla")) {
                  var35 = 0;
                  byte var137 = var10;
                  if (var1 > 0L) {
                     label362: {
                        if (var10 != 0) {
                           var142 = ((var34.equals("NCPPacket")) ? 1 : 0);
                           long var220;
                           int var191 = (var220 = var1 - 0L) == 0L ? 0 : (var220 < 0L ? -1 : 1);
                           if (var10 != 0) {
                              break label362;
                           }

                           if (var142 != 0) {
                              var35 = 1;
                           }
                        }

                        var142 = var35;
                     }

                     if (var10 == 0) {
                        switch (var142) {
                           case 0:
                           case 1:
                              long var212 = -2783695942656101073L;
                              long var44 = var4;
                              client.setting.NumberSetting var51 = this.settingHeight;
                              float var168 = (float)var51.method_44$474dfaa627(var44);
                              var179 = -2784730313720338639L;
                              float var58 = var168;
                              net.C_47S7 var65 = var3;
                              var65.method_46$24a796ab4c(var58);
                              net.C_47cu var143 = this.field_41;
                              var212 = -2783695942656101073L;
                              long var71 = var4;
                              client.setting.NumberSetting var77 = this.settingDelay;
                              long var169 = (long)var77.method_44$474dfaa627(var71);
                              var212 = -2783337432097564775L;
                              long var83 = var8;
                              long var89 = var169;
                              net.C_47cu var95 = var143;
                              var142 = ((var95.method_42$b0e346e6e3(var89, var83)) ? 1 : 0);
                              break;
                           default:
                              return;
                        }
                     }

                     if (var142 == 0) {
                        var179 = -2784730313720338639L;
                        float var103 = 0.6F;
                        net.C_47S7 var112 = var3;
                        var112.method_46$24a796ab4c(var103);
                        this.field_43a = false;
                        long var221;
                        int var144 = (var221 = var1 - 0L) == 0L ? 0 : (var221 < 0L ? -1 : 1);
                     } else {
                        this.field_43a = true;
                        long var170 = -2784857175664551903L;
                        net.C_47cu var124 = this.field_41;
                        var124.method_46$da8c82d5d4();
                     }

                     return;
                  }

                  if (var1 >= 0L) {
                     if (var10 == 0) {
                        if (var10 != 0) {
                           var35 = 1;
                        }

                        var137 = var35;
                     }

                     if (var10 == 0) {
                        switch (var137) {
                           case 0:
                           case 1:
                              long var209 = -2783695942656101073L;
                              long var43 = var4;
                              client.setting.NumberSetting var50 = this.settingHeight;
                              float var165 = (float)var50.method_44$474dfaa627(var43);
                              var179 = -2784730313720338639L;
                              float var57 = var165;
                              net.C_47S7 var64 = var3;
                              var64.method_46$24a796ab4c(var57);
                              net.C_47cu var140 = this.field_41;
                              var209 = -2783695942656101073L;
                              long var70 = var4;
                              client.setting.NumberSetting var76 = this.settingDelay;
                              long var166 = (long)var76.method_44$474dfaa627(var70);
                              var209 = -2783337432097564775L;
                              long var82 = var8;
                              long var88 = var166;
                              net.C_47cu var94 = var140;
                              var137 = ((byte) (var94.method_42$b0e346e6e3(var88, var82) ? 1 : 0));
                              break;
                           default:
                              return;
                        }
                     }

                     if (var137 == 0) {
                        var179 = -2784730313720338639L;
                        float var102 = 0.6F;
                        net.C_47S7 var111 = var3;
                        var111.method_46$24a796ab4c(var102);
                        this.field_43a = false;
                        long var222;
                        int var141 = (var222 = var1 - 0L) == 0L ? 0 : (var222 < 0L ? -1 : 1);
                     } else {
                        this.field_43a = true;
                        long var167 = -2784857175664551903L;
                        net.C_47cu var123 = this.field_41;
                        var123.method_46$da8c82d5d4();
                     }

                     return;
                  }

                  if (var10 == 0) {
                     switch (var10) {
                        case 0:
                        case 1:
                           long var206 = -2783695942656101073L;
                           long var42 = var4;
                           client.setting.NumberSetting var49 = this.settingHeight;
                           float var163 = (float)var49.method_44$474dfaa627(var42);
                           var179 = -2784730313720338639L;
                           float var56 = var163;
                           net.C_47S7 var63 = var3;
                           var63.method_46$24a796ab4c(var56);
                           net.C_47cu var138 = this.field_41;
                           var206 = -2783695942656101073L;
                           long var69 = var4;
                           client.setting.NumberSetting var75 = this.settingDelay;
                           long var164 = (long)var75.method_44$474dfaa627(var69);
                           var206 = -2783337432097564775L;
                           long var81 = var8;
                           long var87 = var164;
                           net.C_47cu var93 = var138;
                           var137 = ((byte) (var93.method_42$b0e346e6e3(var87, var81) ? 1 : 0));
                           break;
                        default:
                           return;
                     }
                  }

                  if (var137 == 0) {
                     var179 = -2784730313720338639L;
                     float var101 = 0.6F;
                     net.C_47S7 var110 = var3;
                     var110.method_46$24a796ab4c(var101);
                     this.field_43a = false;
                     long var223;
                     int var139 = (var223 = var1 - 0L) == 0L ? 0 : (var223 < 0L ? -1 : 1);
                  } else {
                     this.field_43a = true;
                  }
               } else {
                  if (var10 == 0) {
                     switch (var35) {
                        case 0:
                        case 1:
                           long var215 = -2783695942656101073L;
                           long var45 = var4;
                           client.setting.NumberSetting var52 = this.settingHeight;
                           float var173 = (float)var52.method_44$474dfaa627(var45);
                           var179 = -2784730313720338639L;
                           float var59 = var173;
                           net.C_47S7 var66 = var3;
                           var66.method_46$24a796ab4c(var59);
                           net.C_47cu var145 = this.field_41;
                           var215 = -2783695942656101073L;
                           long var72 = var4;
                           client.setting.NumberSetting var78 = this.settingDelay;
                           long var174 = (long)var78.method_44$474dfaa627(var72);
                           var215 = -2783337432097564775L;
                           long var84 = var8;
                           long var90 = var174;
                           net.C_47cu var96 = var145;
                           if (!var96.method_42$b0e346e6e3(var90, var84)) {
                              var179 = -2784730313720338639L;
                              float var105 = 0.6F;
                              net.C_47S7 var114 = var3;
                              var114.method_46$24a796ab4c(var105);
                              this.field_43a = false;
                              if (var1 >= 0L) {
                                 return;
                              }

                              long var176 = -2784857175664551903L;
                              net.C_47cu var128 = this.field_41;
                              var128.method_46$da8c82d5d4();
                              return;
                           }

                           this.field_43a = true;
                           long var175 = -2784857175664551903L;
                           net.C_47cu var127 = this.field_41;
                           var127.method_46$da8c82d5d4();
                           return;
                        default:
                           return;
                     }
                  }

                  if (var35 != 0) {
                     this.field_43a = true;
                     long var172 = -2784857175664551903L;
                     net.C_47cu var126 = this.field_41;
                     var126.method_46$da8c82d5d4();
                     return;
                  }

                  var179 = -2784730313720338639L;
                  float var104 = 0.6F;
                  net.C_47S7 var113 = var3;
                  var113.method_46$24a796ab4c(var104);
                  this.field_43a = false;
                  if (var1 >= 0L) {
                     return;
                  }
               }

               long var171 = -2784857175664551903L;
               net.C_47cu var125 = this.field_41;
               var125.method_46$da8c82d5d4();
               return;
            case 1925467555:
               byte var132 = ((byte) (var34.equals("NCPPacket") ? 1 : 0));
               if (var1 >= 0L) {
                  if (var10 == 0) {
                     if (var132 != 0) {
                        var35 = 1;
                     }

                     var132 = var35;
                  }

                  if (var10 == 0) {
                     switch (var132) {
                        case 0:
                        case 1:
                           long var203 = -2783695942656101073L;
                           long var41 = var4;
                           client.setting.NumberSetting var48 = this.settingHeight;
                           float var160 = (float)var48.method_44$474dfaa627(var41);
                           var179 = -2784730313720338639L;
                           float var55 = var160;
                           net.C_47S7 var62 = var3;
                           var62.method_46$24a796ab4c(var55);
                           net.C_47cu var135 = this.field_41;
                           var203 = -2783695942656101073L;
                           long var68 = var4;
                           client.setting.NumberSetting var74 = this.settingDelay;
                           long var161 = (long)var74.method_44$474dfaa627(var68);
                           var203 = -2783337432097564775L;
                           long var80 = var8;
                           long var86 = var161;
                           net.C_47cu var92 = var135;
                           var132 = ((byte) (var92.method_42$b0e346e6e3(var86, var80) ? 1 : 0));
                           break;
                        default:
                           return;
                     }
                  }

                  if (var132 == 0) {
                     var179 = -2784730313720338639L;
                     float var100 = 0.6F;
                     net.C_47S7 var109 = var3;
                     var109.method_46$24a796ab4c(var100);
                     this.field_43a = false;
                     long var218;
                     int var136 = (var218 = var1 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
                  } else {
                     this.field_43a = true;
                     long var162 = -2784857175664551903L;
                     net.C_47cu var122 = this.field_41;
                     var122.method_46$da8c82d5d4();
                  }

                  return;
               } else {
                  if (var10 == 0) {
                     switch (var132) {
                        case 0:
                        case 1:
                           long var200 = -2783695942656101073L;
                           long var40 = var4;
                           client.setting.NumberSetting var47 = this.settingHeight;
                           float var157 = (float)var47.method_44$474dfaa627(var40);
                           var179 = -2784730313720338639L;
                           float var54 = var157;
                           net.C_47S7 var61 = var3;
                           var61.method_46$24a796ab4c(var54);
                           net.C_47cu var133 = this.field_41;
                           var200 = -2783695942656101073L;
                           long var67 = var4;
                           client.setting.NumberSetting var73 = this.settingDelay;
                           long var158 = (long)var73.method_44$474dfaa627(var67);
                           var200 = -2783337432097564775L;
                           long var79 = var8;
                           long var85 = var158;
                           net.C_47cu var91 = var133;
                           var132 = ((byte) (var91.method_42$b0e346e6e3(var85, var79) ? 1 : 0));
                           break;
                        default:
                           return;
                     }
                  }

                  if (var132 == 0) {
                     var179 = -2784730313720338639L;
                     float var99 = 0.6F;
                     net.C_47S7 var108 = var3;
                     var108.method_46$24a796ab4c(var99);
                     this.field_43a = false;
                     long var219;
                     int var134 = (var219 = var1 - 0L) == 0L ? 0 : (var219 < 0L ? -1 : 1);
                  } else {
                     this.field_43a = true;
                  }

                  long var159 = -2784857175664551903L;
                  net.C_47cu var121 = this.field_41;
                  var121.method_46$da8c82d5d4();
                  return;
               }
            default:
               if (var10 == 0) {
                  switch (var35) {
                     case 0:
                     case 1:
                        long var197 = -2783695942656101073L;
                        long var39 = var4;
                        client.setting.NumberSetting var46 = this.settingHeight;
                        float var153 = (float)var46.method_44$474dfaa627(var39);
                        var179 = -2784730313720338639L;
                        float var53 = var153;
                        net.C_47S7 var60 = var3;
                        var60.method_46$24a796ab4c(var53);
                        net.C_47cu var131 = this.field_41;
                        var197 = -2783695942656101073L;
                        long var23 = var4;
                        client.setting.NumberSetting var25 = this.settingDelay;
                        long var154 = (long)var25.method_44$474dfaa627(var23);
                        var197 = -2783337432097564775L;
                        long var26 = var8;
                        long var28 = var154;
                        net.C_47cu var30 = var131;
                        if (!var30.method_42$b0e346e6e3(var28, var26)) {
                           var179 = -2784730313720338639L;
                           float var98 = 0.6F;
                           net.C_47S7 var107 = var3;
                           var107.method_46$24a796ab4c(var98);
                           this.field_43a = false;
                           if (var1 >= 0L) {
                              return;
                           }

                           long var156 = -2784857175664551903L;
                           net.C_47cu var120 = this.field_41;
                           var120.method_46$da8c82d5d4();
                           return;
                        }

                        this.field_43a = true;
                        long var155 = -2784857175664551903L;
                        net.C_47cu var119 = this.field_41;
                        var119.method_46$da8c82d5d4();
                        return;
                  }
               } else if (var35 == 0) {
                  var179 = -2784730313720338639L;
                  float var97 = 0.6F;
                  net.C_47S7 var106 = var3;
                  var106.method_46$24a796ab4c(var97);
                  this.field_43a = false;
                  if (var1 < 0L) {
                     long var152 = -2784857175664551903L;
                     net.C_47cu var118 = this.field_41;
                     var118.method_46$da8c82d5d4();
                  }
               } else {
                  this.field_43a = true;
                  long var151 = -2784857175664551903L;
                  net.C_47cu var117 = this.field_41;
                  var117.method_46$da8c82d5d4();
               }
         }
      } else {
         long var10002 = -2785408378698863420L;
         long var15 = var6;
         client.setting.ModeSetting var17 = this.settingModes;
         String var11 = var17.method_46$5f9dc63072(var15);
         byte var12 = -1;
         int var129 = var11.hashCode();
         net.C_47cu var130;
         if (var10 == 0) {
            switch (var129) {
               case 0:
               case 1:
                  long var10003 = -2783695942656101073L;
                  long var18 = var4;
                  client.setting.NumberSetting var20 = this.settingHeight;
                  float var10001 = (float)var20.method_44$474dfaa627(var18);
                  var10002 = -2784730313720338639L;
                  float var21 = var10001;
                  net.C_47S7 var22 = var3;
                  var22.method_46$24a796ab4c(var21);
                  var130 = this.field_41;
                  break;
               default:
                  return;
            }
         } else {
            if (var129 == 0) {
               var10002 = -2784730313720338639L;
               float var31 = 0.6F;
               net.C_47S7 var32 = var3;
               var32.method_46$24a796ab4c(var31);
               this.field_43a = false;
               if (var1 >= 0L) {
                  this.field_43a = true;
                  long var148 = -2784857175664551903L;
                  net.C_47cu var116 = this.field_41;
                  var116.method_46$da8c82d5d4();
                  return;
               }

               long var147 = -2784857175664551903L;
               net.C_47cu var115 = this.field_41;
               var115.method_46$da8c82d5d4();
               return;
            }

            this.field_43a = true;
            var130 = this.field_41;
         }

         long var146 = -2784857175664551903L;
         net.C_47cu var33 = var130;
         var33.method_46$da8c82d5d4();
      }
   }




   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 23173520458260L;
      long var3 = var1 ^ 108041036706819L;
      long var10000 = -1009537943936533494L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10002 = -1010764170732780443L;
      long var6 = var3;
      ModeSetting var8 = this.settingModes;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Verus");
      if (!var5) {
         if (var12) {
            return false;
         }

         var10002 = -1010764170732780443L;
         long var9 = var3;
         ModeSetting var11 = this.settingModes;
         var12 = var11.method_46$5f9dc63072(var9).equals("Vulcan");
      }

      return var5 ? var12 : !var12;
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var4 = var2 ^ 74807535967538L;
      boolean var6 = recovery$indy$88(6398519925978040179L, var2);
      int var10000 = (int) ((recovery$indy$89(this.settingModes, var4, 6397412876289666388L, var2).equals(recovery$indy$90(2137, 6628555873613539435L ^ var2))) ? 1 : 0);
      if (var6) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.field_438;
      }

      if (var10000 < 5) {
         recovery$indy$91(var1, false, 6398694237075537772L, var2);
      }
   }



   public void method_47$2fe7f6c171(C_47Rw var1, long var2) {
      this.field_430 = recovery$indy$92(field_43, 3157958758583789086L, var2).field_48Q;
      this.field_43F = recovery$indy$93(field_43, 3157958758583789086L, var2).field_42o;
   }



   private boolean method_43$804cab8c93(long var1, double var3) {
      net.C_478Q var25;
      var1 = a ^ var1;
      long var5 = var1 ^ 100055572890801L;
      long var7 = var1 ^ 14256687896820L;
      boolean var9 = recovery$indy$94(9178419153760624863L, var1);
      int var10000 = (int) ((recovery$indy$95(field_43, 9180058041524105899L, var1).field_48d) ? 1 : 0);
      if (var9) {
         if ((var10000) != 0) {
            C_478Q var10 = null;
            int var11 = 0;

            while (var11 < 6) {
               C_478Q var22 = new C_478Q(
                  recovery$indy$96(field_43, 9180058041524105899L, var1).field_48Q,
                  recovery$indy$97(field_43, 9180058041524105899L, var1).field_48j - var11,
                  recovery$indy$98(field_43, 9180058041524105899L, var1).field_42o
               );
               if (var9) {
                  if (!recovery$indy$99(var22, var7, 9179000991677248216L, var1)) {
                     var11++;
                     continue;
                  }

                  var22 = new C_478Q(
                     recovery$indy$100(field_43, 9180058041524105899L, var1).field_48Q,
                     recovery$indy$101(field_43, 9180058041524105899L, var1).field_48j - var11 + 1.0,
                     recovery$indy$102(field_43, 9180058041524105899L, var1).field_42o
                  );
               }

               var10 = var22;
               break;
            }

            if (var10 == null) {
               return false;
            }

            float var20 = (float)Math.toDegrees(recovery$indy$103(var5, 9180308724427989053L, var1));
            C_484 var12 = recovery$indy$104(field_43, 9180058041524105899L, var1).method_42$c279f215ce(var20);
            C_478Q var13 = var10.method_41$0103bdcc48(var12);
            double var14 = 0.0;
            int var16 = 0;

            boolean var28;
            label201:
            while (true) {
               label199:
               if (var16 <= var3 + 3.0) {
                  var10000 = (int) ((recovery$indy$105(var13, var7, 9179000991677248216L, var1)) ? 1 : 0);
                  var28 = var9;
                  if (var1 > 0L) {
                     if (!var9) {
                        return var10000 != 0;
                     }

                     var28 = var9;
                  }

                  if (var1 > 0L) {
                     if (var28) {
                        if (var10000 != 0) {
                           C_475y var17 = recovery$indy$106(field_43, 9178776191001435758L, var1).method_46$efbf73d2b1(var13).method_48$e084f7739d();
                           var14 += var17.method_49$fedcb3e4d3();
                           double var29;
                           var10000 = (var29 = var14 - var3) == 0.0 ? 0 : (var29 < 0.0 ? -1 : 1);
                           var28 = var9;
                           if (var1 > 0L) {
                              if (var9) {
                                 if (var10000 > 0) {
                                    return false;
                                 }

                                 var10000 = var16;
                              }

                              var28 = var9;
                           }

                           label225: {
                              if (var1 > 0L) {
                                 if (var28) {
                                    if (var10000 <= 0) {
                                       break label225;
                                    }

                                    var10000 = (int) ((recovery$indy$107(var13.method_45$5730377d31(), var7, 9179000991677248216L, var1)) ? 1 : 0);
                                 }

                                 var28 = var9;
                              }

                              if (!var28) {
                                 return var10000 != 0;
                              }

                              if (var10000 == 0) {
                                 return false;
                              }
                           }

                           if (var1 < 0L) {
                              if (var9) {
                                 continue;
                              }
                              break label199;
                           }

                           if (var9) {
                              var13 = var13.method_40$5730377d31();
                              var16++;
                              if (var9) {
                                 continue;
                              }
                              break label199;
                           }

                           var10000 = (int) ((recovery$indy$108(var13.method_45$5730377d31(), var7, 9179000991677248216L, var1)) ? 1 : 0);
                           var28 = var9;
                        } else {
                           var10000 = (int) ((recovery$indy$108(var13.method_45$5730377d31(), var7, 9179000991677248216L, var1)) ? 1 : 0);
                           var28 = var9;
                        }
                     } else {
                        var28 = var9;
                     }
                  }

                  label226: {
                     if (var1 >= 0L) {
                        if (var28) {
                           if (var10000 != 0) {
                              break label226;
                           }

                           double var30;
                           var10000 = (byte)((
                                    var30 = var13.method_45$5730377d31().method_43$8abf5c6871()
                                       - recovery$indy$109(field_43, 9180058041524105899L, var1).field_48j
                                 )
                                 == 0.0
                              ? 0
                              : (var30 < 0.0 ? -1 : 1));
                        }

                        var28 = var9;
                     }

                     label227: {
                        label148:
                        if (var28) {
                           if (var10000 < 0) {
                              var10000 = (int) ((recovery$indy$110(field_43, 9180058041524105899L, var1).field_48M) ? 1 : 0);
                              if (!var9) {
                                 break label148;
                              }

                              if (var10000 != 0) {
                                 break label226;
                              }
                           }

                           var25 = var13;
                           if (!var9) {
                              break label227;
                           }

                           var10000 = (int) ((recovery$indy$111(var13, var7, 9179000991677248216L, var1)) ? 1 : 0);
                        }

                        if (var10000 != 0) {
                           break label226;
                        }

                        var25 = var10.method_41$0103bdcc48(var12);
                     }

                     C_478Q var21 = var25;
                     C_475y var18 = recovery$indy$112(field_43, 9178776191001435758L, var1).method_46$efbf73d2b1(var21).method_48$e084f7739d();
                     var10000 = (int) ((var18.method_43$aae029aa0a()) ? 1 : 0);
                     var28 = var9;
                     if (var1 < 0L) {
                        break;
                     }

                     if (!var9) {
                        var28 = var9;
                        break;
                     }

                     if (var10000 != 0) {
                        double var31;
                        var10000 = (byte)((
                                 var31 = recovery$indy$113(field_43, 9180058041524105899L, var1).field_48j
                                    + var3
                                    - (var21.method_43$8abf5c6871() + var18.method_49$fedcb3e4d3() - 1.0)
                              )
                              == 0.0
                           ? 0
                           : (var31 < 0.0 ? -1 : 1));
                        var28 = var9;
                        break;
                     }
                  }

                  var14++;
                  var13 = var13.method_40$5730377d31();
                  var16++;
                  if (var9) {
                     continue;
                  }
               }

               while (var1 <= 0L) {
                  var14++;
                  var13 = var13.method_40$5730377d31();
                  var16++;
                  if (var9) {
                     continue label201;
                  }
               }

               return true;
            }

            if (var28) {
               var10000 = (byte)(var10000 > 0 ? 1 : 0);
            }

            return var10000 != 0;
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }





   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$114(this, 40, var3, -7099968078904902777L, var1);
      recovery$indy$115(this, 20, var3, -7099968078904902777L, var1);
      recovery$indy$116(this, 43, var3, -7099968078904902777L, var1);
      recovery$indy$117(this, 18, var3, -7099968078904902777L, var1);
      recovery$indy$118(this, 37, var3, -7099968078904902777L, var1);
      recovery$indy$119(this, 21, var3, -7099968078904902777L, var1);
   }



   private boolean method_49E$aae029aa0a() {
      long var1 = a ^ 123084902118261L;
      long var3 = var1 ^ 27080527414626L;
      long var10000 = 4655627402939518315L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10002 = 4654595240939582724L;
      long var6 = var3;
      ModeSetting var8 = this.settingModes;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("NCPPacket");
      if (!var5) {
         if (!var12) {
            var10002 = 4654595240939582724L;
            long var9 = var3;
            ModeSetting var11 = this.settingModes;
            boolean var14 = var11.method_46$5f9dc63072(var9).equals("Vanilla");
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



   public void method_45q$e45a9973e5(long var1) {
        augustus.recovered.modules.movement.Step_47Qe var16;
        augustus.recovered.modules.movement.Step_47Qe var19;
        augustus.recovered.modules.movement.Step_47Qe var21;
        augustus.recovered.modules.movement.Step_47Qe var23;
        augustus.recovered.modules.movement.Step_47Qe var25;
        augustus.recovered.modules.movement.Step_47Qe var27;
        int var28;
        int var29;
      long var10001 = var1 ^ 83546769183106L;
      int var3 = (int)((var1 ^ 83546769183106L) >>> 48);
      int var4 = (int)((var1 ^ 83546769183106L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 46911700055250L;
      long var8 = var1 ^ 54777118390967L;
      long var10 = var1 ^ 77330251461578L;
      long var12 = var1 ^ 42225643557435L;
      byte var14 = ((byte) (recovery$indy$flow$606(4560234389812916926L, var1) ? 1 : 0));
      recovery$indy$flow$609(this, var6, (String)recovery$indy$flow$608(this.settingModes, var8, 4561399600777530065L, var1), 4560590684458031051L, var1);
      int var10000 = ((int) (((String)recovery$indy$flow$611(this.settingModes, var8, 4561399600777530065L, var1))
         .equals((String)recovery$indy$flow$612(13623, 4759022735003529877L ^ var1)) ? 1 : 0));
      if (var14 != 0) {
         boolean var22;
         byte var31;
         if (var10000 == 3) {
            var22 = this.field_43v;
            var31 = var14;
            if (var1 > 0L) {
               if (var14 == 0) {
                  if (this.field_43v) {
                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$635(field_43, 4561930444308968066L, var1)).field_42 = 0.0;
                     recovery$indy$flow$637(0.4F, (char)var3, var4, false, var5, 4561740215260827353L, var1);
                     Step_47Qe var24 = this;
                     if (var14 == 0) {
                        if (recovery$indy$flow$639(this.settingSlowDown, 4559012643617235294L, var1)) {
                           return;
                        }

                        var24 = this;
                     }

                     var24.field_43v = false;
                  }

                  var22 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$642(field_43, 4561930444308968066L, var1)).field_48M;
               }

               if (var14 == 0) {
                  if (!var22) {
                     return;
                  }

                  var22 = this.field_43v;
               }

               label716: {
                  if (var14 == 0) {
                     if (!var22) {
                        return;
                     }

                     var25 = this;
                     if (var14 != 0) {
                        break label716;
                     }

                     var22 = recovery$indy$flow$646(this.settingSlowDown, 4559012643617235294L, var1);
                  }

                  if (!var22) {
                     return;
                  }

                  recovery$indy$flow$647(0.2F, (char)var3, var4, false, var5, 4561740215260827353L, var1);
                  var25 = this;
               }

               var25.field_43v = false;
               return;
            }

            if (var1 >= 0L) {
               if (var14 == 0) {
                  if (!this.field_43v) {
                     return;
                  }

                  var22 = this.field_43v;
               }

               label719: {
                  if (var14 == 0) {
                     if (!var22) {
                        return;
                     }

                     var23 = this;
                     if (var14 != 0) {
                        break label719;
                     }

                     var22 = recovery$indy$flow$646(this.settingSlowDown, 4559012643617235294L, var1);
                  }

                  if (!var22) {
                     return;
                  }

                  recovery$indy$flow$647(0.2F, (char)var3, var4, false, var5, 4561740215260827353L, var1);
                  var23 = this;
               }

               var23.field_43v = false;
               return;
            }
         } else {
            var22 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$642(field_43, 4561930444308968066L, var1)).field_48M;
            var31 = var14;
            if (var1 >= 0L) {
               if (var14 == 0) {
                  if (!var22) {
                     return;
                  }

                  var22 = this.field_43v;
               }

               label722: {
                  if (var14 == 0) {
                     if (!var22) {
                        return;
                     }

                     var27 = this;
                     if (var14 != 0) {
                        break label722;
                     }

                     var22 = recovery$indy$flow$646(this.settingSlowDown, 4559012643617235294L, var1);
                  }

                  if (!var22) {
                     return;
                  }

                  recovery$indy$flow$647(0.2F, (char)var3, var4, false, var5, 4561740215260827353L, var1);
                  var27 = this;
               }

               var27.field_43v = false;
               return;
            }
         }

         Step_47Qe var26;
         byte var32;
         if (var31 == 0) {
            if (!var22) {
               return;
            }

            var26 = this;
            var32 = var14;
         } else {
            if (!var22) {
               return;
            }

            recovery$indy$flow$647(0.2F, (char)var3, var4, false, var5, 4561740215260827353L, var1);
            var26 = this;
            var32 = 0;
         }

         var26.field_43v = (boolean)((((int) (var32)) & 1) != 0);
      } else if (var10000 != 0) {
         label772: {
            label773: {
               label774: {
                  label611: {
                     label610: {
                        label702: {
                           label608: {
                              label607: {
                                 label726: {
                                    if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$615(field_43, 4561930444308968066L, var1)).field_48M
                                       && recovery$indy$flow$617(this, var10, 1.0, 4560165131649576212L, var1)) {
                                       var10000 = ((int) (recovery$indy$flow$618(var12, 4559929858297920903L, var1) ? 1 : 0));
                                       if (var1 <= 0L) {
                                          if (var10000 == var14) {
                                             var10000 = ((int) (this.field_43v ? 1 : 0));
                                             var28 = var14;
                                             if (var1 >= 0L) {
                                                if (var14 == 0) {
                                                   if (this.field_43v) {
                                                      ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$628(field_43, 4561930444308968066L, var1)).field_42 = 0.0;
                                                      return;
                                                   }

                                                   var10000 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$631(field_43, 4561930444308968066L, var1)).field_486;
                                                }

                                                if (var14 == 0) {
                                                   if (var10000 == 4) {
                                                      var10000 = ((int) (this.field_43v ? 1 : 0));
                                                      var29 = var14;
                                                      break label773;
                                                   }

                                                   var10000 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$642(field_43, 4561930444308968066L, var1)).field_48M ? 1 : 0));
                                                }

                                                var29 = var14;
                                                break label773;
                                             }
                                             break label608;
                                          }

                                          var10000 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$631(field_43, 4561930444308968066L, var1)).field_486;
                                          if (var14 == 0) {
                                             if (var10000 == 4) {
                                                var10000 = ((int) (this.field_43v ? 1 : 0));
                                                var29 = var14;
                                                break label607;
                                             }

                                             var10000 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$642(field_43, 4561930444308968066L, var1)).field_48M ? 1 : 0));
                                          }

                                          var29 = var14;
                                          break label607;
                                       }

                                       if (var14 == 0) {
                                          if (var10000 != 0) {
                                             ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$620(field_43, 4561930444308968066L, var1)).method_46f$da8c82d5d4();
                                             this.field_43v = true;
                                             return;
                                          }

                                          var10000 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$624(field_43, 4561930444308968066L, var1)).field_486;
                                       }

                                       label597: {
                                          if (var10000 == 3) {
                                             var10000 = ((int) (this.field_43v ? 1 : 0));
                                             if (var14 != 0) {
                                                break label597;
                                             }

                                             if (this.field_43v) {
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$628(field_43, 4561930444308968066L, var1)).field_42 = 0.0;
                                                return;
                                             }
                                          }

                                          var10000 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$631(field_43, 4561930444308968066L, var1)).field_486;
                                       }

                                       if (var14 != 0) {
                                          break label772;
                                       }

                                       if (var10000 != 4) {
                                          break label702;
                                       }

                                       var10000 = ((int) (this.field_43v ? 1 : 0));
                                       var29 = var14;
                                    } else if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$624(field_43, 4561930444308968066L, var1)).field_486 == 3) {
                                       var10000 = ((int) (this.field_43v ? 1 : 0));
                                       var28 = var14;
                                       if (var1 < 0L) {
                                          break label608;
                                       }

                                       if (var14 == 0) {
                                          if (this.field_43v) {
                                             ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$628(field_43, 4561930444308968066L, var1)).field_42 = 0.0;
                                             return;
                                          }

                                          var10000 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$631(field_43, 4561930444308968066L, var1)).field_486;
                                       }

                                       if (var14 != 0) {
                                          break label610;
                                       }

                                       if (var10000 != 4) {
                                          var10000 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$642(field_43, 4561930444308968066L, var1)).field_48M ? 1 : 0));
                                          break label610;
                                       }

                                       var10000 = ((int) (this.field_43v ? 1 : 0));
                                       var29 = var14;
                                       if (var1 <= 0L) {
                                          break label773;
                                       }
                                    } else {
                                       var10000 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$631(field_43, 4561930444308968066L, var1)).field_486;
                                       if (var14 != 0) {
                                          break label726;
                                       }

                                       if (var10000 != 4) {
                                          var10000 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$642(field_43, 4561930444308968066L, var1)).field_48M ? 1 : 0));
                                          break label726;
                                       }

                                       var10000 = ((int) (this.field_43v ? 1 : 0));
                                       var29 = var14;
                                       if (var1 <= 0L) {
                                          break label607;
                                       }
                                    }

                                    if (var29 != 0) {
                                       break label772;
                                    }

                                    if (var10000 != 0) {
                                       ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$635(field_43, 4561930444308968066L, var1)).field_42 = 0.0;
                                       recovery$indy$flow$637(0.4F, (char)var3, var4, false, var5, 4561740215260827353L, var1);
                                       Step_47Qe var18 = this;
                                       if (var14 == 0) {
                                          if (recovery$indy$flow$639(this.settingSlowDown, 4559012643617235294L, var1)) {
                                             return;
                                          }

                                          var18 = this;
                                       }

                                       var18.field_43v = false;
                                       return;
                                    }
                                    break label702;
                                 }

                                 var29 = var14;
                                 if (var1 >= 0L) {
                                    break label774;
                                 }
                                 break label611;
                              }

                              if (var1 >= 0L) {
                                 break label773;
                              }
                              break label611;
                           }

                           if (var28 == 0) {
                              if (var10000 == 4) {
                                 var10000 = ((int) (this.field_43v ? 1 : 0));
                                 var29 = var14;
                                 break label611;
                              }

                              var10000 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$642(field_43, 4561930444308968066L, var1)).field_48M ? 1 : 0));
                           }

                           var29 = var14;
                           break label611;
                        }

                        var10000 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$642(field_43, 4561930444308968066L, var1)).field_48M ? 1 : 0));
                        break label772;
                     }

                     var29 = var14;
                     break label774;
                  }

                  Step_47Qe var20;
                  byte var30;
                  if (var29 == 0) {
                     if (var10000 == 0) {
                        return;
                     }

                     var20 = this;
                     var30 = var14;
                  } else {
                     if (var10000 == 0) {
                        return;
                     }

                     recovery$indy$flow$647(0.2F, (char)var3, var4, false, var5, 4561740215260827353L, var1);
                     var20 = this;
                     var30 = 0;
                  }

                  var20.field_43v = (boolean)((((int) (var30)) & 1) != 0);
                  return;
               }

               if (var29 == 0) {
                  if (var10000 == 0) {
                     return;
                  }

                  var10000 = ((int) (this.field_43v ? 1 : 0));
               }

               label709: {
                  if (var14 == 0) {
                     if (var10000 == 0) {
                        return;
                     }

                     var16 = this;
                     if (var14 != 0) {
                        break label709;
                     }

                     var10000 = ((int) (recovery$indy$flow$646(this.settingSlowDown, 4559012643617235294L, var1) ? 1 : 0));
                  }

                  if (var10000 == 0) {
                     return;
                  }

                  recovery$indy$flow$647(0.2F, (char)var3, var4, false, var5, 4561740215260827353L, var1);
                  var16 = this;
               }

               var16.field_43v = false;
               return;
            }

            if (var29 == 0) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = ((int) (this.field_43v ? 1 : 0));
            }

            label711: {
               if (var14 == 0) {
                  if (var10000 == 0) {
                     return;
                  }

                  var21 = this;
                  if (var14 != 0) {
                     break label711;
                  }

                  var10000 = ((int) (recovery$indy$flow$646(this.settingSlowDown, 4559012643617235294L, var1) ? 1 : 0));
               }

               if (var10000 == 0) {
                  return;
               }

               recovery$indy$flow$647(0.2F, (char)var3, var4, false, var5, 4561740215260827353L, var1);
               var21 = this;
            }

            var21.field_43v = false;
            return;
         }

         if (var14 == 0) {
            if (var10000 == 0) {
               return;
            }

            var10000 = ((int) (this.field_43v ? 1 : 0));
         }

         label713: {
            if (var14 == 0) {
               if (var10000 == 0) {
                  return;
               }

               var19 = this;
               if (var14 != 0) {
                  break label713;
               }

               var10000 = ((int) (recovery$indy$flow$646(this.settingSlowDown, 4559012643617235294L, var1) ? 1 : 0));
            }

            if (var10000 == 0) {
               return;
            }

            recovery$indy$flow$647(0.2F, (char)var3, var4, false, var5, 4561740215260827353L, var1);
            var19 = this;
         }

         var19.field_43v = false;
      }
   }





   public void method_43y$e45a9973e5(long var1) {
      boolean var3 = recovery$indy$138(-7741661939821438617L, var1);
      if (var1 >= 0L) {
         Minecraft var10000 = field_43;
         if (!var3) {
            label26: {
               EntityPlayerSP var4 = recovery$indy$139(field_43, -7739970399335949989L, var1);
               if (var1 > 0L) {
                  if (var4 == null) {
                     break label26;
                  }

                  var4 = recovery$indy$140(field_43, -7739970399335949989L, var1);
               }

               var4.field_48g = 0.6F;
            }

            var10000 = field_43;
         }

         recovery$indy$141(var10000, -7740952730081018517L, var1).field_43 = 1.0F;
      }
   }



   public void method_489$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43v = false;
   }



    public Step_47Qe(char a0,short a1,int a2) {
        super((java.lang.String) ("Step"),(java.lang.String) ("Schritt"),(long) (((((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.movement.Step_47Qe.a) ^ 139601210350726L)),(java.awt.Color) (new java.awt.Color((int) (129),(int) (147),(int) (164))),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = (((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.movement.Step_47Qe.a);
        long constructorKey2 = ((((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.movement.Step_47Qe.a) ^ 6607537722784L);
        long constructorKey3 = ((((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.movement.Step_47Qe.a) ^ 58563521506379L);
        long constructorKey4 = ((((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.movement.Step_47Qe.a) ^ 17402992214173L);
        long constructorKey5 = ((((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.movement.Step_47Qe.a) ^ 37983624855322L);
        java.lang.Object initialValue6 = recovery$indy$flow$660(8);
        ((java.lang.Object[]) initialValue6)[0] = "Vanilla";
        ((java.lang.Object[]) initialValue6)[1] = "NCPPacket";
        ((java.lang.Object[]) initialValue6)[2] = "Verus";
        ((java.lang.Object[]) initialValue6)[3] = "Vulcan";
        ((java.lang.Object[]) initialValue6)[4] = "Intave";
        ((java.lang.Object[]) initialValue6)[5] = "IntaveTest";
        ((java.lang.Object[]) initialValue6)[6] = "Legit";
        ((java.lang.Object[]) initialValue6)[7] = "Hypixel";
        client.setting.ModeSetting initialized7 = new client.setting.ModeSetting(this, "Modes", constructorKey3, "Vanilla", (java.lang.String[]) (initialValue6));
        recovery$indy$flow$662(this, initialized7);
        client.setting.NumberSetting initialized8 = new client.setting.NumberSetting(this, "Height", 1.0D, constructorKey5, 1.0D, Double.longBitsToDouble(4617315517961601024L), 2);
        java.lang.Object initialValue9 = recovery$indy$flow$665(this);
        java.lang.Object initialValue10 = initialValue9;
        client.setting.NumberSetting initialValue11 = initialized8;
        java.lang.Object initialValue12 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue11))))));
        java.lang.Object initialValue13 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue10))))));
        java.lang.Object initialValue14 = recovery$indy$flow$668(initialValue12, initialValue13);
        recovery$indy$flow$669(this, initialValue14);
        client.setting.NumberSetting initialized15 = new client.setting.NumberSetting(this, "Delay", Double.longBitsToDouble(4645744490609377280L), constructorKey5, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0);
        java.lang.Object initialValue16 = recovery$indy$flow$672(this);
        java.lang.Object initialValue17 = initialValue16;
        client.setting.NumberSetting initialValue18 = initialized15;
        java.lang.Object initialValue19 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue20 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue21 = recovery$indy$flow$675(initialValue19, initialValue20);
        recovery$indy$flow$676(this, initialValue21);
        client.setting.NumberSetting initialized22 = new client.setting.NumberSetting(this, "Timer", Double.longBitsToDouble(4599075939470750515L), constructorKey5, Double.longBitsToDouble(4587366580439587226L), 1.0D, 2);
        java.lang.Object initialValue23 = recovery$indy$flow$679(this);
        java.lang.Object initialValue24 = initialValue23;
        client.setting.NumberSetting initialValue25 = initialized22;
        java.lang.Object initialValue26 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue28 = recovery$indy$flow$682(initialValue26, initialValue27);
        recovery$indy$flow$683(this, initialValue28);
        client.setting.BooleanSetting initialized29 = new client.setting.BooleanSetting(this, constructorKey4, "SlowDown", true);
        java.lang.Object initialValue30 = recovery$indy$flow$686(this);
        java.lang.Object initialValue31 = initialValue30;
        long initialValue32 = constructorKey2;
        client.setting.BooleanSetting initialValue33 = initialized29;
        java.lang.Object initialValue34 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue33))))));
        java.lang.Object initialValue35 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue36 = recovery$indy$flow$689(initialValue34, initialValue32, initialValue35);
        java.lang.Object initialValue37 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue36))))));
        recovery$indy$flow$691(this, initialValue37);
        net.C_47cu initialized38 = new net.C_47cu();
        recovery$indy$flow$694(this, initialized38);
        net.C_47cu initialized39 = new net.C_47cu();
        recovery$indy$flow$697(this, initialized39);
        recovery$indy$flow$698(this, 0.0D);
        recovery$indy$flow$699(this, 0.0D);
        recovery$indy$flow$700(this, 0);
        recovery$indy$flow$701(this, 0);
        recovery$indy$flow$702(this, false);
    }




    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);
    private static java.lang.Object recovery$indy$flow$1() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$2(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$3(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static java.lang.Object recovery$indy$flow$4() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$5(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$6(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static java.lang.Object recovery$indy$flow$7() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$8(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$9(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static native boolean recovery$indy$flow$11(long a0,long a1);

    private static native java.lang.Object recovery$indy$flow$13(java.lang.Object a0,long a1,long a2,long a3);
    private static int recovery$indy$flow$14(java.lang.Object a0) {
        return ((java.lang.String) (a0)).hashCode();
    }
    private static native java.lang.Object recovery$indy$flow$15(int a0,long a1);
    private static boolean recovery$indy$flow$16(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static native java.lang.Object recovery$indy$flow$17(int a0,long a1);
    private static boolean recovery$indy$flow$18(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static native java.lang.Object recovery$indy$flow$19(int a0,long a1);
    private static boolean recovery$indy$flow$20(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static native java.lang.Object recovery$indy$flow$21(int a0,long a1);
    private static boolean recovery$indy$flow$22(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$23() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$24(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$25(java.lang.Object a0);
    private static double recovery$indy$flow$26(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_46;
    }
    private static double recovery$indy$flow$27(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static boolean recovery$indy$flow$28(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43a;
    }

    private static native double recovery$indy$flow$30(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$31() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$32(java.lang.Object a0,long a1,long a2);

    private static native double recovery$indy$flow$34(java.lang.Object a0,long a1,long a2,long a3);
    private static void recovery$indy$flow$35(java.lang.Object a0,float a1) {
        ((net.C_40X) (a0)).field_43 = a1;
        return;
    }
    private static void recovery$indy$flow$36(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43P = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$37() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$38(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$39(java.lang.Object a0);
    private static double recovery$indy$flow$40(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_46;
    }
    private static double recovery$indy$flow$41(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static boolean recovery$indy$flow$42(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43a;
    }
    private static java.lang.Object recovery$indy$flow$43() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$44(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$45(java.lang.Object a0);
    private static double recovery$indy$flow$46(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_46;
    }
    private static double recovery$indy$flow$47(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$48() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$49(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$52(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$53(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$54(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$56(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$57() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$58(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$61(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$62(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$63(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$65(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$66() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$67(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$70(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$71(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$72(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$74(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$75() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$76(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$79(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$80(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$81(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$83(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$84() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$85(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$88(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$89(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$90(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$92(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$93() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$94(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$97(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$98(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$99(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$101(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$102() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$103(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$106(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$107(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$108(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$110(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$111() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$112(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$115(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$116(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$117(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$119(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$120() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$121(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$124(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$125(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$126(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$128(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$129() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$130(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$133(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$134(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$135(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$137(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$138() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$139(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$142(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$143(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$144(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$146(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$147() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$148(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$151(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$152(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$153(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$155(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$156() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$157(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$160(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$161(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$162(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$164(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$165() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$166(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$169(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$170(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$171(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$173(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$174() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$175(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$178(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$179(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$180(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$182(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$183() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$184(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$187(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$188(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$189(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$191(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$192() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$193(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$196(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$197(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$198(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$200(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$201() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$202(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$205(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$206(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$207(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$209(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$210() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$211(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$214(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$215(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$216(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$218(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$219() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$220(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$223(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$224(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$225(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$227(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$228() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$229(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$232(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$233(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$234(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$236(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$237() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$238(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$241(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$242(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$243(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$245(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$246() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$247(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$250(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$251(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$252(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native void recovery$indy$flow$254(java.lang.Object a0,java.lang.Object a1);

    private static native double recovery$indy$flow$256(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$257() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$258(java.lang.Object a0,long a1,long a2);

    private static native double recovery$indy$flow$260(java.lang.Object a0,long a1,long a2,long a3);

    private static native double recovery$indy$flow$262(java.lang.Object a0,long a1,long a2,long a3);
    private static double recovery$indy$flow$263(double a0,double a1) {
        return java.lang.Math.max(a0, a1);
    }
    private static void recovery$indy$flow$264(java.lang.Object a0,float a1) {
        ((net.C_40X) (a0)).field_43 = a1;
        return;
    }
    private static void recovery$indy$flow$265(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43P = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$266() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$267(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$268(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48g;
    }
    private static java.lang.Object recovery$indy$flow$269() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$270(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$271(java.lang.Object a0);
    private static double recovery$indy$flow$272(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_46;
    }
    private static double recovery$indy$flow$273(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$274() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$275(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$276(java.lang.Object a0,float a1) {
        ((net.C_40X) (a0)).field_43 = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$277() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$278(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$281() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$282(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$283(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static java.lang.Object recovery$indy$flow$284() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$285(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$286(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static java.lang.Object recovery$indy$flow$287() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$288(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$289(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static native void recovery$indy$flow$291(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$292(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43P = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$293() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$294(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$295(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48g;
    }
    private static java.lang.Object recovery$indy$flow$296() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$297(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$298(java.lang.Object a0);
    private static double recovery$indy$flow$299(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_46;
    }
    private static double recovery$indy$flow$300(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$301() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$302(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$303(java.lang.Object a0,float a1) {
        ((net.C_40X) (a0)).field_43 = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$304() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$305(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$308() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$309(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$310(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static java.lang.Object recovery$indy$flow$311() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$312(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$313(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static java.lang.Object recovery$indy$flow$314() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$315(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$316(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static native void recovery$indy$flow$318(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$319(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$320(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_438 = a1;
        return;
    }
    private static int recovery$indy$flow$384(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_438;
    }
    private static void recovery$indy$flow$385(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_438 = a1;
        return;
    }

    private static native java.lang.Object recovery$indy$flow$387(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$388(long a0,long a1);
    private static int recovery$indy$flow$389(java.lang.Object a0) {
        return ((java.lang.String) (a0)).hashCode();
    }
    private static native java.lang.Object recovery$indy$flow$390(int a0,long a1);
    private static boolean recovery$indy$flow$391(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static native java.lang.Object recovery$indy$flow$392(int a0,long a1);
    private static boolean recovery$indy$flow$393(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static native java.lang.Object recovery$indy$flow$394(int a0,long a1);
    private static boolean recovery$indy$flow$395(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static native java.lang.Object recovery$indy$flow$396(int a0,long a1);
    private static boolean recovery$indy$flow$397(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }

    private static native double recovery$indy$flow$399(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$400(java.lang.Object a0,long a1,double a2,long a3,long a4);

    private static native boolean recovery$indy$flow$402(java.lang.Object a0,long a1,long a2,long a3,long a4);
    private static java.lang.Object recovery$indy$flow$403() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$404(java.lang.Object a0,long a1,long a2);

    private static boolean recovery$indy$flow$406(java.lang.Object a0) {
        return ((net.C_47UA) (a0)).field_45;
    }
    private static void recovery$indy$flow$407(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43a = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$408() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$409(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$410(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$411() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$412(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$413() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$414(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$415(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42;
    }
    private static double recovery$indy$flow$416(double a0,double a1) {
        return java.lang.Math.min(a0, a1);
    }
    private static void recovery$indy$flow$417(java.lang.Object a0,double a1) {
        ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42 = a1;
        return;
    }
    private static boolean recovery$indy$flow$418(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43a;
    }

    private static native double recovery$indy$flow$420(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$421(java.lang.Object a0,long a1,double a2,long a3,long a4);

    private static native void recovery$indy$flow$423(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$424(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43a = a1;
        return;
    }

    private static native double recovery$indy$flow$426(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$427(java.lang.Object a0,long a1,double a2,long a3,long a4);
    private static java.lang.Object recovery$indy$flow$428() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$429(java.lang.Object a0,long a1,long a2);
    private static boolean recovery$indy$flow$430(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48M;
    }
    private static java.lang.Object recovery$indy$flow$431() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$432(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$433(java.lang.Object a0,double a1) {
        ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42 = a1;
        return;
    }
    private static native void recovery$indy$flow$434(long a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$435() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$436(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$437(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static native void recovery$indy$flow$438(long a0,double a1,boolean a2,long a3,long a4);
    private static java.lang.Object recovery$indy$flow$439() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$440(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$441(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_43v;
    }
    private static java.lang.Object recovery$indy$flow$442() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$443(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$444(java.lang.Object a0,float a1) {
        ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48g = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$445() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$446(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$447(java.lang.Object a0,float a1) {
        ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48g = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$448() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$449(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$450(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_43v;
    }
    private static java.lang.Object recovery$indy$flow$451() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$452(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$453(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42;
    }
    private static int recovery$indy$flow$454(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43y;
    }
    private static java.lang.Object recovery$indy$flow$455() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$456(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$457(java.lang.Object a0,float a1) {
        ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48g = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$458() {
        return augustus.recovered.modules.movement.Step_47Qe.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$459(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$460(java.lang.Object a0,float a1) {
        ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48g = a1;
        return;
    }
    private static native boolean recovery$indy$flow$606(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$608(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$609(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$611(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$612(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$615(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$617(java.lang.Object a0,long a1,double a2,long a3,long a4);
    private static native boolean recovery$indy$flow$618(long a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$620(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$624(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$628(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$631(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$635(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$637(float a0,char a1,int a2,boolean a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$639(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$642(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$646(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$647(float a0,char a1,int a2,boolean a3,int a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$660(int a0);
    private static void recovery$indy$flow$662(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).settingModes = ((client.setting.ModeSetting) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$665(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$668(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$669(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$672(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$675(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$676(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$679(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$682(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$683(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$686(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$689(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$691(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$694(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$697(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$698(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_430 = a1;
        return;
    }
    private static void recovery$indy$flow$699(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43F = a1;
        return;
    }
    private static void recovery$indy$flow$700(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$701(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$702(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.Step_47Qe) (a0)).field_43v = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native MethodHandle recovery$constant$57();
   private static native boolean recovery$indy$88(long var0, long var2);
   private static native String recovery$indy$89(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$90(int var0, long var1);
   private static native void recovery$indy$91(Object var0, boolean var1, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$92(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$93(Object var0, long var1, long var3);
   private static native boolean recovery$indy$94(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$95(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$96(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$97(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$98(Object var0, long var1, long var3);
   private static native boolean recovery$indy$99(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$100(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$101(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$102(Object var0, long var1, long var3);
   private static native double recovery$indy$103(long var0, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$104(Object var0, long var1, long var3);
   private static native boolean recovery$indy$105(Object var0, long var1, long var3, long var5);
   private static native WorldClient recovery$indy$106(Object var0, long var1, long var3);
   private static native boolean recovery$indy$107(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$108(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$109(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$110(Object var0, long var1, long var3);
   private static native boolean recovery$indy$111(Object var0, long var1, long var3, long var5);
   private static native WorldClient recovery$indy$112(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$113(Object var0, long var1, long var3);
   private static native void recovery$indy$114(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$115(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$116(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$117(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$118(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$119(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$138(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$139(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$140(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$141(Object var0, long var1, long var3);
}
