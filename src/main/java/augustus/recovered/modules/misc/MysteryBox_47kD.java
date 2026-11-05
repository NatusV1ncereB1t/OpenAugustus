package augustus.recovered.modules.misc;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.io.File;
import java.io.FileFilter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_455;
import net.C_476q;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Ir;
import net.minecraft.client.gui.GuiMainMenu;
import net.C_47LX;
import client.module.Module;
import net.C_47VK;
import net.C_47WU;
import net.C_47cu;
import net.C_47eq;
import net.C_47gp;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import net.C_47p9;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class MysteryBox_47kD extends client.module.Module implements net.C_47xz {
    private final java.lang.String field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private java.lang.String field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

   private void method_42$3345a93977(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      int[] var6 = recovery$indy$1(-7954202196901595254L, var4);
      long var7 = recovery$indy$2(this, -7954348544538601737L, var4);
      MysteryBox_47kD var10000 = this;
      if (var6 == null) {
         if (this.field_47 != var7) {
            this.field_42 = this.field_43y = 0;
         }

         var10000 = this;
      }

      var10000.field_47 = recovery$indy$3(this, -7954348544538601737L, var4);
   }



   private Runnable method_42$2ebc253dbf() {
      return recovery$indy$4(this);
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_41$63d34830e0(int var1, ArrayList var2, int var3, int var4, Runnable var5) {
      long var6 = ((long)var1 << 32 | (long)var4 << 32 >>> 32) ^ a;
      if (var3 < var2.size()) {
         long var8 = System.currentTimeMillis();
         long var10 = (Long)var2.get(var3);
         long var12 = var8 - this.field_47;
         if (var12 > var10) {
            var5.run();
         }
      }
   }



   private void method_40$da8c82d5d4() {
      long var1 = a ^ 110479511253275L;
      long var10000 = 4625925726176650788L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      String var7 = this.field_40;
      if (var3 == null) {
         if (this.field_40 == null) {
            return;
         }

         var7 = this.field_40;
      }

      if (!var7.isEmpty()) {
         Minecraft var8 = field_43;
         if (var3 == null) {
            long var10001 = 4629302564838225777L;
            Minecraft var4 = field_43;
            if (var4.field_42P != null) {
               return;
            }

            var8 = field_43;
         }

         C_47p9 var9 = new C_47p9(new C_47LX(new GuiMainMenu()), field_43, new C_47WU(this.field_40, this.field_40, false));
         long var10002 = 4626002971414645483L;
         C_47p9 var5 = var9;
         Minecraft var6 = var8;
         var6.method_43$7480b345ab(var5);
      }
   }



   public long method_44$f9912cc5c6() {
      LocalDateTime var1 = LocalDateTime.now();
      LocalDateTime var2 = var1.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)).with(LocalTime.MIDNIGHT);
      ZonedDateTime var3 = var2.atZone(ZoneId.systemDefault());
      return var3.toInstant().toEpochMilli();
   }



   private Runnable method_44$2ebc253dbf() {
      return recovery$indy$5(this);
   }



   private JsonArray method_48$bef381aec7(JsonObject var1, String var2, long var3) {
      var3 = a ^ var3;
      int[] var5 = recovery$indy$6(8606282649842651513L, var3);
      JsonElement var6 = var1.get(var2);
      JsonElement var10000 = var6;
      if (var5 == null) {
         if (!var6.isJsonArray()) {
            return null;
         }

         var10000 = var6;
      }

      return (JsonArray)var10000;
   }



   private void method_49$da8c82d5d4() {
      long var1 = a ^ 14735043218567L;
      long var10000 = -166914740325966920L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      Minecraft var16 = field_43;
      if (var3 == null) {
         long var10001 = -170293210911012115L;
         Minecraft var5 = field_43;
         if (var5.field_42P == null) {
            return;
         }

         long var10002 = -167172337018307090L;
         boolean var6 = true;
         Minecraft var7 = field_43;
         var7.field_42O = var6;
         var16 = field_43;
      }

      long var19 = -169667741804080194L;
      Minecraft var8 = var16;
      boolean var4 = var8.method_42$aae029aa0a();
      var19 = -170561445436496234L;
      Minecraft var9 = field_43;
      var9.field_44Q.method_45$da8c82d5d4();
      long var23 = -170795910107576586L;
      Object var10 = null;
      Minecraft var11 = field_43;
      var11.method_44$a1dcd804df((WorldClient)var10);
      if (var3 == null && var4) {
         Minecraft var17 = field_43;
         GuiMainMenu var21 = new GuiMainMenu();
         var23 = -166998032408905865L;
         GuiMainMenu var12 = var21;
         Minecraft var13 = var17;
         var13.method_43$7480b345ab(var12);
         if (var3 == null) {
            return;
         }
      }

      Minecraft var18 = field_43;
      C_47LX var22 = new C_47LX(new GuiMainMenu());
      var23 = -166998032408905865L;
      C_47LX var14 = var22;
      Minecraft var15 = var18;
      var15.method_43$7480b345ab(var14);
   }




   private boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      return recovery$indy$7(field_43, 3770628901170234140L, var1) != null;
   }



    private void method_43$e45a9973e5(long a0) {
        long value6;
        long computed7;
        long computed9;
        long computed11;
        long computed13;
        long computed14;
        int converted15;
        long computed17;
        long computed18;
        int converted19;
        long computed21;
        long computed22;
        int converted23;
        long computed25;
        long computed27;
        long computed29;
        long computed31;
        java.lang.Object value32;
        java.lang.Object value33;
        java.lang.Object value34;
        java.lang.Object value35;
        java.io.File initialized36;
        java.lang.Object value38;
        java.lang.Object value39;
        java.lang.Object value41;
        java.lang.Object value42;
        java.lang.Object value76;
        java.lang.Object value77;
        int length128;
        int value130;
        int regionValue143;
        int regionValue174;
        int edgeValue187;
        java.lang.Object arrayValue188;
        java.lang.Object value189;
        java.lang.Object value190;
        java.lang.Object value191;
        int value192;
        int computed193;
        int value194;
        java.lang.Object value195;
        java.lang.Object value196;
        java.lang.Object value197;
        java.lang.Object value198;
        java.lang.Object value199;
        int regionValue212;
        java.lang.Object regionValue213;
        java.lang.Object regionValue214;
        int edgeValue227;
        java.lang.Object edgeValue228;
        java.lang.Object edgeValue229;
        int regionValue242;
        java.lang.Object regionValue243;
        java.lang.Object regionValue244;
        java.lang.Object regionValue245;
        int edgeValue258;
        java.lang.Object edgeValue259;
        java.lang.Object edgeValue260;
        java.lang.Object edgeValue261;
        boolean value262;
        int regionValue268;
        int edgeValue274;
        int regionValue287;
        java.lang.Object regionValue288;
        int regionValue289;
        int edgeValue302;
        java.lang.Object edgeValue303;
        int edgeValue304;
        int regionValue317;
        java.lang.Object regionValue318;
        int regionValue319;
        int edgeValue332;
        java.lang.Object edgeValue333;
        int edgeValue334;
        int regionValue347;
        java.lang.Object regionValue348;
        int edgeValue361;
        java.lang.Object edgeValue362;
        int regionValue375;
        int edgeValue388;
        int regionValue401;
        int edgeValue414;
        int regionValue427;
        int edgeValue440;
        java.lang.Object value441;
        java.lang.Object value442;
        int edgeValue455;
        java.lang.Object edgeValue456;
        java.lang.Object edgeValue457;
        java.lang.Object value458;
        java.lang.Object value459;
        java.lang.Object value460;
        java.lang.Object value461;
        java.lang.Object value462;
        java.lang.Object value463;
        java.lang.Object value464;
        long computed465;
        java.lang.Object value466;
        java.lang.Object value467;
        char converted468;
        java.lang.Object value469;
        java.lang.Object value470;
        long computed471;
        java.lang.Object value472;
        java.lang.Object value473;
        java.lang.Object value474;
        long computed475;
        java.lang.Object value476;
        java.lang.Object value477;
        java.lang.Object value478;
        int comparison479;
        int regionValue492;
        int edgeValue506;
        int regionValue520;
        java.lang.Object regionValue521;
        java.lang.Object regionValue522;
        int edgeValue536;
        java.lang.Object edgeValue537;
        java.lang.Object edgeValue538;
        int regionValue552;
        int edgeValue565;
        int regionValue578;
        java.lang.Object regionValue579;
        java.lang.Object regionValue580;
        int edgeValue593;
        java.lang.Object edgeValue594;
        java.lang.Object edgeValue595;
        int regionValue608;
        java.lang.Object regionValue609;
        java.lang.Object regionValue610;
        int edgeValue623;
        java.lang.Object edgeValue624;
        java.lang.Object edgeValue625;
        int comparison626;
        int regionValue639;
        java.lang.Object regionValue640;
        java.lang.Object regionValue641;
        java.lang.Object regionValue642;
        int edgeValue655;
        java.lang.Object edgeValue656;
        java.lang.Object edgeValue657;
        java.lang.Object edgeValue658;
        int regionValue671;
        java.lang.Object regionValue672;
        java.lang.Object regionValue673;
        java.lang.Object regionValue674;
        int edgeValue687;
        java.lang.Object edgeValue688;
        java.lang.Object edgeValue689;
        java.lang.Object edgeValue690;
        int regionValue703;
        java.lang.Object regionValue704;
        java.lang.Object regionValue705;
        java.lang.Object regionValue706;
        int edgeValue719;
        java.lang.Object edgeValue720;
        java.lang.Object edgeValue721;
        java.lang.Object edgeValue722;
        int edgeValue735;
        int regionValue748;
        java.lang.Object regionValue749;
        java.lang.Object regionValue750;
        int edgeValue763;
        java.lang.Object edgeValue764;
        java.lang.Object edgeValue765;
        int regionValue778;
        java.lang.Object regionValue779;
        java.lang.Object regionValue780;
        int edgeValue793;
        java.lang.Object edgeValue794;
        java.lang.Object edgeValue795;
        int edgeValue808;
        java.lang.Object edgeValue809;
        java.lang.Object edgeValue810;
        java.lang.Object edgeValue811;
        int regionValue824;
        java.lang.Object regionValue825;
        java.lang.Object regionValue826;
        int edgeValue839;
        java.lang.Object edgeValue840;
        java.lang.Object edgeValue841;
        int regionValue854;
        java.lang.Object regionValue855;
        java.lang.Object regionValue856;
        java.lang.Object regionValue857;
        int edgeValue870;
        java.lang.Object edgeValue871;
        java.lang.Object edgeValue872;
        java.lang.Object edgeValue873;
        int regionValue886;
        java.lang.Object regionValue887;
        java.lang.Object regionValue888;
        int edgeValue901;
        java.lang.Object edgeValue902;
        java.lang.Object edgeValue903;
        int regionValue916;
        int edgeValue929;
        int regionValue942;
        int edgeValue955;
        int edgeValue968;
        int edgeValue981;
        java.lang.Object edgeValue982;
        java.lang.Object edgeValue983;
        java.lang.Object value984;
        java.lang.Object value985;
        int regionValue998;
        java.lang.Object regionValue999;
        java.lang.Object regionValue1000;
        int edgeValue1013;
        java.lang.Object edgeValue1014;
        java.lang.Object edgeValue1015;
        boolean value1016;
        int regionValue1029;
        java.lang.Object regionValue1030;
        java.lang.Object regionValue1031;
        int edgeValue1044;
        java.lang.Object edgeValue1045;
        java.lang.Object edgeValue1046;
        int regionValue1059;
        java.lang.Object regionValue1060;
        java.lang.Object regionValue1061;
        int edgeValue1074;
        java.lang.Object edgeValue1075;
        java.lang.Object edgeValue1076;
        java.lang.Object value1077;
        int regionValue1090;
        java.lang.Object regionValue1091;
        java.lang.Object regionValue1092;
        java.lang.Object regionValue1093;
        int edgeValue1106;
        java.lang.Object edgeValue1107;
        java.lang.Object edgeValue1108;
        java.lang.Object edgeValue1109;
        java.lang.Object value1110;
        int comparison1111;
        int edgeValue1124;
        java.lang.Object edgeValue1125;
        java.lang.Object edgeValue1126;
        java.lang.Object edgeValue1127;
        int regionValue1140;
        java.lang.Object regionValue1141;
        int edgeValue1154;
        java.lang.Object edgeValue1155;
        java.lang.Object value1156;
        java.lang.Object value1157;
        java.lang.Object value1158;
        long value1159;
        java.lang.Object value1160;
        boolean value1161;
        int comparison1162;
        int regionValue1175;
        java.lang.Object regionValue1176;
        int regionValue1177;
        int edgeValue1190;
        java.lang.Object edgeValue1191;
        int edgeValue1192;
        int regionValue1205;
        java.lang.Object regionValue1206;
        java.lang.Object regionValue1207;
        int regionValue1208;
        int edgeValue1221;
        java.lang.Object edgeValue1222;
        java.lang.Object edgeValue1223;
        int edgeValue1224;
        int regionValue1237;
        java.lang.Object regionValue1238;
        int edgeValue1251;
        java.lang.Object edgeValue1252;
        int regionValue1265;
        java.lang.Object regionValue1266;
        java.lang.Object regionValue1267;
        int edgeValue1280;
        java.lang.Object edgeValue1281;
        java.lang.Object edgeValue1282;
        int edgeValue1295;
        java.lang.Object edgeValue1296;
        java.lang.Object edgeValue1297;
        int regionValue1310;
        java.lang.Object regionValue1311;
        java.lang.Object regionValue1312;
        int edgeValue1325;
        java.lang.Object edgeValue1326;
        java.lang.Object edgeValue1327;
        int regionValue1340;
        java.lang.Object regionValue1341;
        java.lang.Object regionValue1342;
        int edgeValue1355;
        java.lang.Object edgeValue1356;
        java.lang.Object edgeValue1357;
        java.lang.Object value1358;
        int comparison1359;
        int edgeValue1372;
        java.lang.Object edgeValue1373;
        java.lang.Object edgeValue1374;
        java.lang.Object edgeValue1375;
        int edgeValue1388;
        java.lang.Object edgeValue1389;
        java.lang.Object value1390;
        int edgeValue1403;
        java.lang.Object edgeValue1404;
        int regionValue1417;
        int edgeValue1430;
        int regionValue1443;
        java.lang.Object regionValue1444;
        int edgeValue1457;
        java.lang.Object edgeValue1458;
        java.lang.Object value1459;
        int regionValue1472;
        java.lang.Object regionValue1473;
        java.lang.Object regionValue1474;
        int edgeValue1487;
        java.lang.Object edgeValue1488;
        java.lang.Object edgeValue1489;
        java.lang.Object value1490;
        java.lang.Object value1491;
        java.lang.Object value1492;
        long value1493;
        java.lang.Object value1494;
        boolean value1495;
        int comparison1496;
        int regionValue1509;
        int edgeValue1523;
        int regionValue1537;
        java.lang.Object regionValue1538;
        int edgeValue1552;
        java.lang.Object edgeValue1553;
        int regionValue1567;
        int edgeValue1580;
        int regionValue1593;
        java.lang.Object regionValue1594;
        int edgeValue1607;
        java.lang.Object edgeValue1608;
        int regionValue1621;
        java.lang.Object regionValue1622;
        int edgeValue1635;
        java.lang.Object edgeValue1636;
        int edgeValue1649;
        java.lang.Object edgeValue1650;
        int regionValue1663;
        int edgeValue1676;
        int comparison1677;
        int regionValue1690;
        java.lang.Object regionValue1691;
        java.lang.Object regionValue1692;
        int edgeValue1705;
        java.lang.Object edgeValue1706;
        java.lang.Object edgeValue1707;
        int regionValue1720;
        java.lang.Object regionValue1721;
        java.lang.Object regionValue1722;
        int edgeValue1735;
        java.lang.Object edgeValue1736;
        java.lang.Object edgeValue1737;
        boolean value1738;
        int regionValue1751;
        java.lang.Object regionValue1752;
        int regionValue1753;
        int edgeValue1766;
        java.lang.Object edgeValue1767;
        int edgeValue1768;
        int edgeValue1781;
        int regionValue1794;
        java.lang.Object regionValue1795;
        int edgeValue1808;
        java.lang.Object edgeValue1809;
        java.lang.Object value1810;
        int edgeValue1823;
        java.lang.Object edgeValue1824;
        java.lang.Object edgeValue1825;
        java.lang.Object value1826;
        java.lang.Object value1827;
        java.lang.Object value1828;
        long value1829;
        java.lang.Object value1830;
        boolean value1831;
        int comparison1832;
        int edgeValue1845;
        int regionValue1859;
        java.lang.Object regionValue1860;
        int edgeValue1874;
        java.lang.Object edgeValue1875;
        int edgeValue1889;
        int regionValue1902;
        java.lang.Object regionValue1903;
        int edgeValue1916;
        java.lang.Object edgeValue1917;
        int regionValue1930;
        java.lang.Object regionValue1931;
        int edgeValue1944;
        java.lang.Object edgeValue1945;
        int edgeValue1958;
        java.lang.Object edgeValue1959;
        int edgeValue1972;
        int edgeValue1985;
        long computed1986;
        java.lang.Object value1987;
        int comparison1988;
        java.lang.Object regionValue1994;
        long regionValue1995;
        java.lang.Object edgeValue2002;
        long edgeValue2003;
        int regionValue2017;
        java.lang.Object regionValue2019;
        long regionValue2020;
        int edgeValue2034;
        java.lang.Object edgeValue2036;
        long edgeValue2037;
        int edgeValue2051;
        int edgeValue2064;
        int edgeValue2083;
        int incremented2084;
        int edgeValue2097;
        int edgeValue2110;
        int edgeValue2124;
        int comparison2130;
        java.lang.Object value2153;
        int comparison2154;
        java.lang.Object regionValue2159;
        java.lang.Object regionValue2193;
        boolean value2223;
        int edgeValue2229;
        long computed2248;
        java.lang.Object value2249;
        long edgeValue2256;
        java.lang.Object value2262;
        java.lang.Object value2268;
        long value2279;
        long value2281;
        long computed2282;
        int value2284;
        int regionValue2290;
        java.lang.Object value2297;
        int value2298;
        int regionValue2304;
        int edgeValue2310;
        int regionValue2316;
        int edgeValue2322;
        java.lang.Object value2323;
        java.lang.Object value2324;
        java.lang.Object value2325;
        long value2326;
        long value2327;
        int comparison2328;
        int regionValue2334;
        int edgeValue2341;
        int regionValue2348;
        long regionValue2349;
        int edgeValue2356;
        long edgeValue2357;
        int regionValue2364;
        int edgeValue2370;
        int regionValue2376;
        long regionValue2377;
        int edgeValue2383;
        long edgeValue2384;
        int regionValue2390;
        long regionValue2391;
        int edgeValue2397;
        long edgeValue2398;
        int comparison2399;
        int regionValue2405;
        int edgeValue2411;
        int regionValue2417;
        int regionValue2418;
        int edgeValue2424;
        int edgeValue2425;
        int regionValue2431;
        int regionValue2432;
        int edgeValue2438;
        int edgeValue2439;
        int regionValue2445;
        int edgeValue2451;
        int regionValue2457;
        int edgeValue2463;
        int regionValue2469;
        int edgeValue2475;
        int edgeValue2481;
        int regionValue2487;
        int edgeValue2493;
        int edgeValue2499;
        int incremented2500;
        int edgeValue2506;
        int edgeValue2512;
        int edgeValue2519;
        int edgeValue2525;
        int comparison2526;
        int regionValue2532;
        int edgeValue2538;
        int edgeValue2554;
        int value2555;
        int edgeValue2561;
        java.lang.Object value2562;
        int value2563;
        int regionValue2569;
        int edgeValue2575;
        int regionValue2581;
        int edgeValue2587;
        java.lang.Object value2588;
        java.lang.Object value2589;
        int regionValue2595;
        java.lang.Object regionValue2596;
        int edgeValue2602;
        java.lang.Object edgeValue2603;
        int comparison2604;
        int edgeValue2610;
        java.lang.Object value2620;
        long value2621;
        long value2622;
        int comparison2623;
        int regionValue2629;
        long regionValue2630;
        int edgeValue2637;
        long edgeValue2638;
        int regionValue2645;
        long regionValue2646;
        int edgeValue2653;
        long edgeValue2654;
        int regionValue2661;
        long regionValue2662;
        int edgeValue2668;
        long edgeValue2669;
        int edgeValue2675;
        long edgeValue2676;
        int comparison2678;
        int regionValue2684;
        int edgeValue2691;
        int regionValue2698;
        long regionValue2699;
        int edgeValue2706;
        long edgeValue2707;
        int regionValue2714;
        int edgeValue2720;
        int regionValue2726;
        long regionValue2727;
        int edgeValue2733;
        long edgeValue2734;
        int regionValue2740;
        long regionValue2741;
        int edgeValue2747;
        long edgeValue2748;
        int comparison2749;
        int regionValue2755;
        int edgeValue2761;
        int regionValue2767;
        int edgeValue2773;
        int regionValue2779;
        int edgeValue2785;
        int comparison2786;
        int regionValue2788;
        int edgeValue2790;
        int regionValue2796;
        int regionValue2798;
        int edgeValue2804;
        int edgeValue2806;
        int regionValue2812;
        int regionValue2814;
        int edgeValue2820;
        int edgeValue2822;
        int regionValue2828;
        int edgeValue2834;
        int regionValue2840;
        int edgeValue2846;
        int edgeValue2852;
        int incremented2853;
        int edgeValue2859;
        int edgeValue2865;
        int edgeValue2872;
        int edgeValue2878;
        int comparison2879;
        int edgeValue2885;
        boolean value2891;
        int edgeValue2893;
        region468: {
        region467: {
        region462: {
        region407: {
        region406: {
        region403: {
        region399: {
        region357: {
        region347: {
        region345: {
        region342: {
        region340: {
        region339: {
        region329: {
        region328: {
        region325: {
        region323: {
        region321: {
        region319: {
        region314: {
        region309: {
        region100: {
        region93: {
        region91: {
        region86: {
        value6 = recovery$indy$flow$92();
        computed7 = value6 ^ a0;
        computed9 = computed7 ^ 45732204855818L;
        computed11 = computed7 ^ 122169469828890L;
        computed13 = computed7 ^ 75624445959651L;
        computed14 = computed13 >>> 32;
        converted15 = (int) (computed14);
        computed17 = computed13 << 32;
        computed18 = computed17 >>> 48;
        converted19 = (int) (computed18);
        computed21 = computed13 << 48;
        computed22 = computed21 >>> 48;
        converted23 = (int) (computed22);
        computed25 = computed7 ^ 129993650602298L;
        computed27 = computed7 ^ 74705489382481L;
        computed29 = computed7 ^ 112643741663478L;
        computed31 = 1245593404514491964L ^ computed7;
        value32 = recovery$indy$flow$93(1127, computed31);
        recovery$indy$flow$94(computed11, value32, -8915856366855361508L, computed7);
        value33 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43W));
        recovery$indy$flow$96(value33);
        value34 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43h));
        recovery$indy$flow$98(value34);
        value35 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_44));
        initialized36 = new java.io.File((java.lang.String) (value35));
        value38 = recovery$indy$flow$102(-8913776646286908835L, computed7);
        value39 = recovery$indy$flow$103(initialized36);
        recovery$indy$flow$104(value39, computed27, -8915070126361729207L, computed7);
        value41 = recovery$indy$flow$105();
        value42 = recovery$indy$flow$106(initialized36, value41);
        if (value42 == null) {
            break region309;
        } else {
            break region86;
        }
        }
        value76 = recovery$indy$flow$107();
        value77 = recovery$indy$flow$108(value76, -8916931263521568465L, computed7);
        if (value77 == null) {
            break region309;
        } else {
            break region91;
        }
        }
        break region93;
        }
        length128 = java.lang.reflect.Array.getLength(value42);
        value130 = 0;
        regionValue143 = value130;
        break region100;
        }
        loop100: while (true) {
        region308: {
        region307: {
        region306: {
        region305: {
        region304: {
        region301: {
        region289: {
        region287: {
        region257: {
        region741: {
        region739: {
        region737: {
        region722: {
        region718: {
        region716: {
        region256: {
        region226: {
        region224: {
        region223: {
        region222: {
        region220: {
        region219: {
        region217: {
        region216: {
        region214: {
        region213: {
        region211: {
        region206: {
        region204: {
        region203: {
        region140: {
        region136: {
        region135: {
        region133: {
        region132: {
        region130: {
        region127: {
        region103: {
        if (regionValue143 >= length128) {
            break region309;
        } else {
            edgeValue187 = regionValue143;
            regionValue174 = edgeValue187;
            break region103;
        }
        }
        arrayValue188 = ((java.lang.Object[]) value42)[regionValue174];
        value189 = arrayValue188;
        value190 = recovery$indy$flow$109(value189);
        value191 = recovery$indy$flow$110(value189);
        value192 = recovery$indy$flow$111(value191);
        computed193 = value192 - 5;
        value194 = recovery$indy$flow$112(computed193, 0);
        value195 = recovery$indy$flow$113(value190, 0, value194);
        value196 = value195;
        value197 = recovery$indy$flow$114();
        value198 = recovery$indy$flow$115(value197, -8916931263521568465L, computed7);
        value199 = recovery$indy$flow$116(value198);
        if (value38 != null) {
            edgeValue227 = regionValue174;
            edgeValue228 = value196;
            edgeValue229 = value199;
            regionValue212 = edgeValue227;
            regionValue213 = edgeValue228;
            regionValue214 = edgeValue229;
            break region140;
        } else {
            edgeValue258 = regionValue174;
            edgeValue259 = value189;
            edgeValue260 = value196;
            edgeValue261 = value199;
            regionValue242 = edgeValue258;
            regionValue243 = edgeValue259;
            regionValue244 = edgeValue260;
            regionValue245 = edgeValue261;
            break region127;
        }
        }
        value262 = recovery$indy$flow$117(regionValue244, regionValue245);
        if (value38 != null) {
            edgeValue274 = (int) ((value262 ? 1 : 0));
            regionValue268 = edgeValue274;
            break region328;
        } else {
            edgeValue302 = regionValue242;
            edgeValue303 = regionValue243;
            edgeValue304 = (int) ((value262 ? 1 : 0));
            regionValue287 = edgeValue302;
            regionValue288 = edgeValue303;
            regionValue289 = edgeValue304;
            break region130;
        }
        }
        edgeValue332 = regionValue287;
        edgeValue333 = regionValue288;
        edgeValue334 = regionValue289;
        regionValue317 = edgeValue332;
        regionValue318 = edgeValue333;
        regionValue319 = edgeValue334;
        break region132;
        }
        if (regionValue319 != 0) {
            edgeValue361 = regionValue317;
            edgeValue362 = regionValue318;
            regionValue347 = edgeValue361;
            regionValue348 = edgeValue362;
            break region136;
        } else {
            edgeValue388 = regionValue317;
            regionValue375 = edgeValue388;
            break region133;
        }
        }
        edgeValue414 = regionValue375;
        regionValue401 = edgeValue414;
        break region135;
        }
        edgeValue440 = regionValue401;
        regionValue427 = edgeValue440;
        break region306;
        }
        value441 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_44));
        value442 = recovery$indy$flow$119(regionValue348);
        edgeValue455 = regionValue347;
        edgeValue456 = value441;
        edgeValue457 = value442;
        regionValue212 = edgeValue455;
        regionValue213 = edgeValue456;
        regionValue214 = edgeValue457;
        break region140;
        }
        value458 = null;
        value459 = regionValue214;
        value460 = regionValue213;
        value461 = recovery$indy$flow$120(computed29, value460, value459, value458, -8917045214411749233L, computed7);
        value462 = value461;
        value463 = recovery$indy$flow$121();
        value464 = recovery$indy$flow$122(value463, -8915722065701709929L, computed7);
        computed465 = 3076838552097968161L ^ computed7;
        value466 = recovery$indy$flow$123(2681, computed465);
        value467 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_40));
        converted468 = (char) (converted23);
        value469 = recovery$indy$flow$125(value464, converted15, value466, value467, converted19, converted468, value462, -8915888833001744699L, computed7);
        value470 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value469))))));
        recovery$indy$flow$127(this, value470);
        computed471 = 4181113849457660367L ^ computed7;
        value472 = recovery$indy$flow$128(2960, computed471);
        value473 = recovery$indy$flow$129(this, value462, value472, computed9, -8916892560397491830L, computed7);
        value474 = value473;
        computed475 = 6765264743087575860L ^ computed7;
        value476 = recovery$indy$flow$130(18794, computed475);
        value477 = recovery$indy$flow$131(this, value462, value476, computed9, -8916892560397491830L, computed7);
        value478 = value477;
        comparison479 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison479 < 0) {
            edgeValue506 = regionValue212;
            regionValue492 = edgeValue506;
            break region308;
        } else {
            edgeValue536 = regionValue212;
            edgeValue537 = value474;
            edgeValue538 = value478;
            regionValue520 = edgeValue536;
            regionValue521 = edgeValue537;
            regionValue522 = edgeValue538;
            break region203;
        }
        }
        if (value38 != null) {
            edgeValue565 = regionValue520;
            regionValue552 = edgeValue565;
            break region307;
        } else {
            edgeValue593 = regionValue520;
            edgeValue594 = regionValue521;
            edgeValue595 = regionValue522;
            regionValue578 = edgeValue593;
            regionValue579 = edgeValue594;
            regionValue580 = edgeValue595;
            break region204;
        }
        }
        edgeValue623 = regionValue578;
        edgeValue624 = regionValue579;
        edgeValue625 = regionValue580;
        regionValue608 = edgeValue623;
        regionValue609 = edgeValue624;
        regionValue610 = edgeValue625;
        break region206;
        }
        comparison626 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison626 <= 0) {
            edgeValue655 = regionValue608;
            edgeValue656 = regionValue609;
            edgeValue657 = regionValue610;
            edgeValue658 = regionValue609;
            regionValue639 = edgeValue655;
            regionValue640 = edgeValue656;
            regionValue641 = edgeValue657;
            regionValue642 = edgeValue658;
            break region217;
        } else {
            edgeValue687 = regionValue608;
            edgeValue688 = regionValue609;
            edgeValue689 = regionValue610;
            edgeValue690 = regionValue609;
            regionValue671 = edgeValue687;
            regionValue672 = edgeValue688;
            regionValue673 = edgeValue689;
            regionValue674 = edgeValue690;
            break region211;
        }
        }
        edgeValue719 = regionValue671;
        edgeValue720 = regionValue672;
        edgeValue721 = regionValue673;
        edgeValue722 = regionValue674;
        regionValue703 = edgeValue719;
        regionValue704 = edgeValue720;
        regionValue705 = edgeValue721;
        regionValue706 = edgeValue722;
        break region213;
        }
        if (regionValue706 == null) {
            edgeValue735 = regionValue703;
            regionValue427 = edgeValue735;
            break region306;
        } else {
            edgeValue763 = regionValue703;
            edgeValue764 = regionValue704;
            edgeValue765 = regionValue705;
            regionValue748 = edgeValue763;
            regionValue749 = edgeValue764;
            regionValue750 = edgeValue765;
            break region214;
        }
        }
        edgeValue793 = regionValue748;
        edgeValue794 = regionValue749;
        edgeValue795 = regionValue750;
        regionValue778 = edgeValue793;
        regionValue779 = edgeValue794;
        regionValue780 = edgeValue795;
        break region216;
        }
        edgeValue808 = regionValue778;
        edgeValue809 = regionValue779;
        edgeValue810 = regionValue780;
        edgeValue811 = regionValue780;
        regionValue639 = edgeValue808;
        regionValue640 = edgeValue809;
        regionValue641 = edgeValue810;
        regionValue642 = edgeValue811;
        break region217;
        }
        if (value38 != null) {
            edgeValue839 = regionValue639;
            edgeValue840 = regionValue641;
            edgeValue841 = regionValue642;
            regionValue824 = edgeValue839;
            regionValue825 = edgeValue840;
            regionValue826 = edgeValue841;
            break region224;
        } else {
            edgeValue870 = regionValue639;
            edgeValue871 = regionValue640;
            edgeValue872 = regionValue641;
            edgeValue873 = regionValue642;
            regionValue854 = edgeValue870;
            regionValue855 = edgeValue871;
            regionValue856 = edgeValue872;
            regionValue857 = edgeValue873;
            break region219;
        }
        }
        if (regionValue857 != null) {
            edgeValue901 = regionValue854;
            edgeValue902 = regionValue855;
            edgeValue903 = regionValue856;
            regionValue886 = edgeValue901;
            regionValue887 = edgeValue902;
            regionValue888 = edgeValue903;
            break region223;
        } else {
            edgeValue929 = regionValue854;
            regionValue916 = edgeValue929;
            break region220;
        }
        }
        edgeValue955 = regionValue916;
        regionValue942 = edgeValue955;
        break region222;
        }
        edgeValue968 = regionValue942;
        regionValue427 = edgeValue968;
        break region306;
        }
        edgeValue981 = regionValue886;
        edgeValue982 = regionValue888;
        edgeValue983 = regionValue887;
        regionValue824 = edgeValue981;
        regionValue825 = edgeValue982;
        regionValue826 = edgeValue983;
        break region224;
        }
        value984 = recovery$indy$flow$132(regionValue826);
        value985 = value984;
        edgeValue1013 = regionValue824;
        edgeValue1014 = regionValue825;
        edgeValue1015 = value985;
        regionValue998 = edgeValue1013;
        regionValue999 = edgeValue1014;
        regionValue1000 = edgeValue1015;
        break region226;
        }
        loop226: while (true) {
        region231: {
        region851: {
        region229: {
        value1016 = recovery$indy$flow$133(regionValue1000);
        if ((int) ((value1016 ? 1 : 0)) == 0) {
            edgeValue1044 = regionValue998;
            edgeValue1045 = regionValue999;
            edgeValue1046 = regionValue1000;
            regionValue1029 = edgeValue1044;
            regionValue1030 = edgeValue1045;
            regionValue1031 = edgeValue1046;
            break region851;
        } else {
            edgeValue1074 = regionValue998;
            edgeValue1075 = regionValue999;
            edgeValue1076 = regionValue1000;
            regionValue1059 = edgeValue1074;
            regionValue1060 = edgeValue1075;
            regionValue1061 = edgeValue1076;
            break region229;
        }
        }
        value1077 = recovery$indy$flow$134(regionValue1061);
        edgeValue1106 = regionValue1059;
        edgeValue1107 = regionValue1060;
        edgeValue1108 = regionValue1061;
        edgeValue1109 = value1077;
        regionValue1090 = edgeValue1106;
        regionValue1091 = edgeValue1107;
        regionValue1092 = edgeValue1108;
        regionValue1093 = edgeValue1109;
        break region231;
        }
        value1110 = recovery$indy$flow$140(regionValue1030);
        comparison1111 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1111 < 0) {
            edgeValue1124 = regionValue1029;
            edgeValue1125 = regionValue1030;
            edgeValue1126 = regionValue1031;
            edgeValue1127 = value1110;
            regionValue1090 = edgeValue1124;
            regionValue1091 = edgeValue1125;
            regionValue1092 = edgeValue1126;
            regionValue1093 = edgeValue1127;
            break region231;
        } else {
            edgeValue1154 = regionValue1029;
            edgeValue1155 = value1110;
            regionValue1140 = edgeValue1154;
            regionValue1141 = edgeValue1155;
            break region256;
        }
        }
        loop231: while (true) {
        region250: {
        region248: {
        region246: {
        region243: {
        value1156 = ((java.lang.Object)(((com.google.gson.JsonElement) (((java.lang.Object)(regionValue1093))))));
        value1157 = value1156;
        value1158 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43W));
        value1159 = recovery$indy$flow$137(value1157);
        value1160 = recovery$indy$flow$138(value1159);
        value1161 = recovery$indy$flow$139(value1158, value1160);
        comparison1162 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1162 < 0) {
            edgeValue1190 = regionValue1090;
            edgeValue1191 = regionValue1092;
            edgeValue1192 = (int) ((value1161 ? 1 : 0));
            regionValue1175 = edgeValue1190;
            regionValue1176 = edgeValue1191;
            regionValue1177 = edgeValue1192;
            break region716;
        } else {
            edgeValue1221 = regionValue1090;
            edgeValue1222 = regionValue1091;
            edgeValue1223 = regionValue1092;
            edgeValue1224 = (int) ((value1161 ? 1 : 0));
            regionValue1205 = edgeValue1221;
            regionValue1206 = edgeValue1222;
            regionValue1207 = edgeValue1223;
            regionValue1208 = edgeValue1224;
            break region243;
        }
        }
        if (value38 != null) {
            edgeValue1251 = regionValue1205;
            edgeValue1252 = regionValue1207;
            regionValue1237 = edgeValue1251;
            regionValue1238 = edgeValue1252;
            break region257;
        } else {
            edgeValue1280 = regionValue1205;
            edgeValue1281 = regionValue1206;
            edgeValue1282 = regionValue1207;
            regionValue1265 = edgeValue1280;
            regionValue1266 = edgeValue1281;
            regionValue1267 = edgeValue1282;
            break region246;
        }
        }
        if (value38 == null) {
            edgeValue1295 = regionValue1265;
            edgeValue1296 = regionValue1266;
            edgeValue1297 = regionValue1267;
            regionValue998 = edgeValue1295;
            regionValue999 = edgeValue1296;
            regionValue1000 = edgeValue1297;
            continue loop226;
        } else {
            edgeValue1325 = regionValue1265;
            edgeValue1326 = regionValue1266;
            edgeValue1327 = regionValue1267;
            regionValue1310 = edgeValue1325;
            regionValue1311 = edgeValue1326;
            regionValue1312 = edgeValue1327;
            break region248;
        }
        }
        edgeValue1355 = regionValue1310;
        edgeValue1356 = regionValue1311;
        edgeValue1357 = regionValue1312;
        regionValue1340 = edgeValue1355;
        regionValue1341 = edgeValue1356;
        regionValue1342 = edgeValue1357;
        break region250;
        }
        value1358 = recovery$indy$flow$140(regionValue1341);
        comparison1359 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1359 < 0) {
            edgeValue1372 = regionValue1340;
            edgeValue1373 = regionValue1341;
            edgeValue1374 = regionValue1342;
            edgeValue1375 = value1358;
            regionValue1090 = edgeValue1372;
            regionValue1091 = edgeValue1373;
            regionValue1092 = edgeValue1374;
            regionValue1093 = edgeValue1375;
            continue loop231;
        } else {
            edgeValue1388 = regionValue1340;
            edgeValue1389 = value1358;
            regionValue1140 = edgeValue1388;
            regionValue1141 = edgeValue1389;
            break region256;
        }
        }
        }
        }
        value1390 = regionValue1141;
        edgeValue1403 = regionValue1140;
        edgeValue1404 = value1390;
        regionValue1237 = edgeValue1403;
        regionValue1238 = edgeValue1404;
        break region257;
        }
        if (regionValue1177 == 0) {
            edgeValue1430 = regionValue1175;
            regionValue1417 = edgeValue1430;
            break region289;
        } else {
            edgeValue1457 = regionValue1175;
            edgeValue1458 = regionValue1176;
            regionValue1443 = edgeValue1457;
            regionValue1444 = edgeValue1458;
            break region718;
        }
        }
        value1459 = recovery$indy$flow$142(regionValue1444);
        edgeValue1487 = regionValue1443;
        edgeValue1488 = regionValue1444;
        edgeValue1489 = value1459;
        regionValue1472 = edgeValue1487;
        regionValue1473 = edgeValue1488;
        regionValue1474 = edgeValue1489;
        break region722;
        }
        value1490 = ((java.lang.Object)(((com.google.gson.JsonElement) (((java.lang.Object)(regionValue1474))))));
        value1491 = value1490;
        value1492 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43h));
        value1493 = recovery$indy$flow$145(value1491);
        value1494 = recovery$indy$flow$146(value1493);
        value1495 = recovery$indy$flow$147(value1492, value1494);
        comparison1496 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1496 < 0) {
            edgeValue1523 = regionValue1472;
            regionValue1509 = edgeValue1523;
            break region305;
        } else {
            edgeValue1552 = regionValue1472;
            edgeValue1553 = regionValue1473;
            regionValue1537 = edgeValue1552;
            regionValue1538 = edgeValue1553;
            break region737;
        }
        }
        if (value38 != null) {
            edgeValue1580 = regionValue1537;
            regionValue1567 = edgeValue1580;
            break region304;
        } else {
            edgeValue1607 = regionValue1537;
            edgeValue1608 = regionValue1538;
            regionValue1593 = edgeValue1607;
            regionValue1594 = edgeValue1608;
            break region739;
        }
        }
        edgeValue1635 = regionValue1593;
        edgeValue1636 = regionValue1594;
        regionValue1621 = edgeValue1635;
        regionValue1622 = edgeValue1636;
        break region741;
        }
        if (value38 == null) {
            edgeValue1649 = regionValue1621;
            edgeValue1650 = regionValue1622;
            regionValue1237 = edgeValue1649;
            regionValue1238 = edgeValue1650;
            break region257;
        } else {
            edgeValue1676 = regionValue1621;
            regionValue1663 = edgeValue1676;
            break region287;
        }
        }
        loop257: while (true) {
        region285: {
        region283: {
        region282: {
        region268: {
        region264: {
        region263: {
        region262: {
        comparison1677 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1677 < 0) {
            edgeValue1705 = regionValue1237;
            edgeValue1706 = regionValue1238;
            edgeValue1707 = regionValue1238;
            regionValue1690 = edgeValue1705;
            regionValue1691 = edgeValue1706;
            regionValue1692 = edgeValue1707;
            break region268;
        } else {
            edgeValue1735 = regionValue1237;
            edgeValue1736 = regionValue1238;
            edgeValue1737 = regionValue1238;
            regionValue1720 = edgeValue1735;
            regionValue1721 = edgeValue1736;
            regionValue1722 = edgeValue1737;
            break region262;
        }
        }
        value1738 = recovery$indy$flow$141(regionValue1722);
        edgeValue1766 = regionValue1720;
        edgeValue1767 = regionValue1721;
        edgeValue1768 = (int) ((value1738 ? 1 : 0));
        regionValue1751 = edgeValue1766;
        regionValue1752 = edgeValue1767;
        regionValue1753 = edgeValue1768;
        break region263;
        }
        if (regionValue1753 == 0) {
            edgeValue1781 = regionValue1751;
            regionValue1417 = edgeValue1781;
            break region289;
        } else {
            edgeValue1808 = regionValue1751;
            edgeValue1809 = regionValue1752;
            regionValue1794 = edgeValue1808;
            regionValue1795 = edgeValue1809;
            break region264;
        }
        }
        value1810 = recovery$indy$flow$142(regionValue1795);
        edgeValue1823 = regionValue1794;
        edgeValue1824 = regionValue1795;
        edgeValue1825 = value1810;
        regionValue1690 = edgeValue1823;
        regionValue1691 = edgeValue1824;
        regionValue1692 = edgeValue1825;
        break region268;
        }
        value1826 = ((java.lang.Object)(((com.google.gson.JsonElement) (((java.lang.Object)(regionValue1692))))));
        value1827 = value1826;
        value1828 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43h));
        value1829 = recovery$indy$flow$145(value1827);
        value1830 = recovery$indy$flow$146(value1829);
        value1831 = recovery$indy$flow$147(value1828, value1830);
        comparison1832 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1832 < 0) {
            edgeValue1845 = regionValue1690;
            regionValue1509 = edgeValue1845;
            break region305;
        } else {
            edgeValue1874 = regionValue1690;
            edgeValue1875 = regionValue1691;
            regionValue1859 = edgeValue1874;
            regionValue1860 = edgeValue1875;
            break region282;
        }
        }
        if (value38 != null) {
            edgeValue1889 = regionValue1859;
            regionValue1567 = edgeValue1889;
            break region304;
        } else {
            edgeValue1916 = regionValue1859;
            edgeValue1917 = regionValue1860;
            regionValue1902 = edgeValue1916;
            regionValue1903 = edgeValue1917;
            break region283;
        }
        }
        edgeValue1944 = regionValue1902;
        edgeValue1945 = regionValue1903;
        regionValue1930 = edgeValue1944;
        regionValue1931 = edgeValue1945;
        break region285;
        }
        if (value38 == null) {
            edgeValue1958 = regionValue1930;
            edgeValue1959 = regionValue1931;
            regionValue1237 = edgeValue1958;
            regionValue1238 = edgeValue1959;
            continue loop257;
        } else {
            edgeValue1972 = regionValue1930;
            regionValue1663 = edgeValue1972;
            break region287;
        }
        }
        }
        edgeValue1985 = regionValue1663;
        regionValue1417 = edgeValue1985;
        break region289;
        }
        computed1986 = 6729731077609406653L ^ computed7;
        value1987 = recovery$indy$flow$148(6889, computed1986);
        comparison1988 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison1988 <= 0) {
            edgeValue2002 = value1987;
            edgeValue2003 = -8915856366855361508L;
            regionValue1994 = edgeValue2002;
            regionValue1995 = edgeValue2003;
            break region339;
        } else {
            edgeValue2034 = regionValue1417;
            edgeValue2036 = value1987;
            edgeValue2037 = -8915856366855361508L;
            regionValue2017 = edgeValue2034;
            regionValue2019 = edgeValue2036;
            regionValue2020 = edgeValue2037;
            break region301;
        }
        }
        recovery$indy$flow$149(computed11, regionValue2019, regionValue2020, computed7);
        edgeValue2051 = regionValue2017;
        regionValue1567 = edgeValue2051;
        break region304;
        }
        edgeValue2064 = regionValue1567;
        regionValue1509 = edgeValue2064;
        break region305;
        }
        if (value38 == null) {
            break region309;
        } else {
            edgeValue2083 = regionValue1509;
            regionValue427 = edgeValue2083;
            break region306;
        }
        }
        incremented2084 = regionValue427 + (1);
        edgeValue2097 = incremented2084;
        regionValue552 = edgeValue2097;
        break region307;
        }
        edgeValue2110 = regionValue552;
        regionValue492 = edgeValue2110;
        break region308;
        }
        if (value38 == null) {
            edgeValue2124 = regionValue492;
            regionValue143 = edgeValue2124;
            continue loop100;
        } else {
            break region309;
        }
        }
        }
        comparison2130 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2130 <= 0) {
            break region347;
        } else {
            break region314;
        }
        }
        value2153 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43W));
        comparison2154 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2154 < 0) {
            regionValue2159 = value2153;
            break region342;
        } else {
            break region319;
        }
        }
        break region321;
        }
        if (value38 != null) {
            regionValue2193 = value2153;
            break region345;
        } else {
            break region323;
        }
        }
        break region325;
        }
        value2223 = recovery$indy$flow$151(value2153);
        edgeValue2229 = (int) ((value2223 ? 1 : 0));
        regionValue268 = edgeValue2229;
        break region328;
        }
        if (regionValue268 == 0) {
            break region340;
        } else {
            break region329;
        }
        }
        computed2248 = 860695732299706227L ^ computed7;
        value2249 = recovery$indy$flow$152(29994, computed2248);
        edgeValue2256 = -8915856366855361508L;
        regionValue1994 = value2249;
        regionValue1995 = edgeValue2256;
        break region339;
        }
        recovery$indy$flow$153(computed11, regionValue1994, regionValue1995, computed7);
        break region340;
        }
        value2262 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43W));
        regionValue2159 = value2262;
        break region342;
        }
        recovery$indy$flow$155(regionValue2159);
        value2268 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43h));
        regionValue2193 = value2268;
        break region345;
        }
        recovery$indy$flow$157(regionValue2193);
        break region347;
        }
        value2279 = recovery$indy$flow$158(this, -8913922992316579040L, computed7);
        value2281 = recovery$indy$flow$159();
        computed2282 = value2281 - value2279;
        value2284 = 0;
        regionValue2290 = value2284;
        break region357;
        }
        loop357: while (true) {
        region398: {
        region397: {
        region394: {
        region392: {
        region387: {
        region385: {
        region384: {
        region382: {
        region377: {
        region375: {
        region374: {
        region362: {
        value2297 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43W));
        value2298 = recovery$indy$flow$161(value2297);
        if (regionValue2290 >= value2298) {
            edgeValue2310 = regionValue2290;
            regionValue2304 = edgeValue2310;
            break region399;
        } else {
            edgeValue2322 = regionValue2290;
            regionValue2316 = edgeValue2322;
            break region362;
        }
        }
        value2323 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43W));
        value2324 = recovery$indy$flow$163(value2323, regionValue2316);
        value2325 = ((java.lang.Object)(((java.lang.Long) (((java.lang.Object)(value2324))))));
        value2326 = recovery$indy$flow$165(value2325);
        value2327 = value2326;
        comparison2328 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2328 < 0) {
            edgeValue2341 = regionValue2316;
            regionValue2334 = edgeValue2341;
            break region398;
        } else {
            edgeValue2356 = regionValue2316;
            edgeValue2357 = value2327;
            regionValue2348 = edgeValue2356;
            regionValue2349 = edgeValue2357;
            break region374;
        }
        }
        if (value38 != null) {
            edgeValue2370 = regionValue2348;
            regionValue2364 = edgeValue2370;
            break region397;
        } else {
            edgeValue2383 = regionValue2348;
            edgeValue2384 = regionValue2349;
            regionValue2376 = edgeValue2383;
            regionValue2377 = edgeValue2384;
            break region375;
        }
        }
        edgeValue2397 = regionValue2376;
        edgeValue2398 = regionValue2377;
        regionValue2390 = edgeValue2397;
        regionValue2391 = edgeValue2398;
        break region377;
        }
        comparison2399 = (regionValue2391 > computed2282 ? 1 : regionValue2391 == computed2282 ? 0 : -1);
        if (value38 != null) {
            edgeValue2411 = comparison2399;
            regionValue2405 = edgeValue2411;
            break region406;
        } else {
            edgeValue2424 = regionValue2390;
            edgeValue2425 = comparison2399;
            regionValue2417 = edgeValue2424;
            regionValue2418 = edgeValue2425;
            break region382;
        }
        }
        edgeValue2438 = regionValue2417;
        edgeValue2439 = regionValue2418;
        regionValue2431 = edgeValue2438;
        regionValue2432 = edgeValue2439;
        break region384;
        }
        if (regionValue2432 <= 0) {
            edgeValue2451 = regionValue2431;
            regionValue2445 = edgeValue2451;
            break region394;
        } else {
            edgeValue2463 = regionValue2431;
            regionValue2457 = edgeValue2463;
            break region385;
        }
        }
        edgeValue2475 = regionValue2457;
        regionValue2469 = edgeValue2475;
        break region387;
        }
        recovery$indy$flow$166(this, regionValue2469);
        if (value38 == null) {
            edgeValue2481 = regionValue2469;
            regionValue2304 = edgeValue2481;
            break region399;
        } else {
            edgeValue2493 = regionValue2469;
            regionValue2487 = edgeValue2493;
            break region392;
        }
        }
        edgeValue2499 = regionValue2487;
        regionValue2445 = edgeValue2499;
        break region394;
        }
        incremented2500 = regionValue2445 + (1);
        edgeValue2506 = incremented2500;
        regionValue2364 = edgeValue2506;
        break region397;
        }
        edgeValue2512 = regionValue2364;
        regionValue2334 = edgeValue2512;
        break region398;
        }
        if (value38 == null) {
            edgeValue2519 = regionValue2334;
            regionValue2290 = edgeValue2519;
            continue loop357;
        } else {
            edgeValue2525 = regionValue2334;
            regionValue2304 = edgeValue2525;
            break region399;
        }
        }
        }
        comparison2526 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2526 <= 0) {
            edgeValue2538 = regionValue2304;
            regionValue2532 = edgeValue2538;
            break region407;
        } else {
            break region403;
        }
        }
        edgeValue2554 = 0;
        regionValue2405 = edgeValue2554;
        break region406;
        }
        value2555 = regionValue2405;
        edgeValue2561 = value2555;
        regionValue2532 = edgeValue2561;
        break region407;
        }
        loop407: while (true) {
        region416: {
        region610: {
        region412: {
        value2562 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43h));
        value2563 = recovery$indy$flow$168(value2562);
        if (regionValue2532 >= value2563) {
            edgeValue2575 = regionValue2532;
            regionValue2569 = edgeValue2575;
            break region610;
        } else {
            edgeValue2587 = regionValue2532;
            regionValue2581 = edgeValue2587;
            break region412;
        }
        }
        value2588 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_43h));
        value2589 = recovery$indy$flow$170(value2588, regionValue2581);
        edgeValue2602 = regionValue2581;
        edgeValue2603 = value2589;
        regionValue2595 = edgeValue2602;
        regionValue2596 = edgeValue2603;
        break region416;
        }
        comparison2604 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2604 < 0) {
            edgeValue2610 = regionValue2569;
            regionValue2595 = edgeValue2610;
            regionValue2596 = this;
            break region416;
        } else {
            break region462;
        }
        }
        loop416: while (true) {
        region457: {
        region456: {
        region455: {
        region452: {
        region450: {
        region447: {
        region445: {
        region439: {
        region437: {
        region433: {
        region431: {
        region430: {
        region426: {
        region425: {
        region424: {
        value2620 = ((java.lang.Object)(((java.lang.Long) (((java.lang.Object)(regionValue2596))))));
        value2621 = recovery$indy$flow$172(value2620);
        value2622 = value2621;
        comparison2623 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2623 < 0) {
            edgeValue2637 = regionValue2595;
            edgeValue2638 = value2622;
            regionValue2629 = edgeValue2637;
            regionValue2630 = edgeValue2638;
            break region426;
        } else {
            edgeValue2653 = regionValue2595;
            edgeValue2654 = value2622;
            regionValue2645 = edgeValue2653;
            regionValue2646 = edgeValue2654;
            break region424;
        }
        }
        if (value38 != null) {
            break region468;
        } else {
            edgeValue2668 = regionValue2645;
            edgeValue2669 = regionValue2646;
            regionValue2661 = edgeValue2668;
            regionValue2662 = edgeValue2669;
            break region425;
        }
        }
        edgeValue2675 = regionValue2661;
        edgeValue2676 = regionValue2662;
        regionValue2629 = edgeValue2675;
        regionValue2630 = edgeValue2676;
        break region426;
        }
        comparison2678 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2678 <= 0) {
            edgeValue2691 = regionValue2629;
            regionValue2684 = edgeValue2691;
            break region456;
        } else {
            edgeValue2706 = regionValue2629;
            edgeValue2707 = regionValue2630;
            regionValue2698 = edgeValue2706;
            regionValue2699 = edgeValue2707;
            break region430;
        }
        }
        if (value38 != null) {
            edgeValue2720 = regionValue2698;
            regionValue2714 = edgeValue2720;
            break region455;
        } else {
            edgeValue2733 = regionValue2698;
            edgeValue2734 = regionValue2699;
            regionValue2726 = edgeValue2733;
            regionValue2727 = edgeValue2734;
            break region431;
        }
        }
        edgeValue2747 = regionValue2726;
        edgeValue2748 = regionValue2727;
        regionValue2740 = edgeValue2747;
        regionValue2741 = edgeValue2748;
        break region433;
        }
        comparison2749 = (regionValue2741 > computed2282 ? 1 : regionValue2741 == computed2282 ? 0 : -1);
        if (comparison2749 <= 0) {
            edgeValue2761 = regionValue2740;
            regionValue2755 = edgeValue2761;
            break region452;
        } else {
            edgeValue2773 = regionValue2740;
            regionValue2767 = edgeValue2773;
            break region437;
        }
        }
        edgeValue2785 = regionValue2767;
        regionValue2779 = edgeValue2785;
        break region439;
        }
        comparison2786 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2786 < 0) {
            edgeValue2790 = regionValue2779;
            regionValue2788 = edgeValue2790;
            break region467;
        } else {
            edgeValue2804 = regionValue2779;
            edgeValue2806 = regionValue2779;
            regionValue2796 = edgeValue2804;
            regionValue2798 = edgeValue2806;
            break region445;
        }
        }
        edgeValue2820 = regionValue2796;
        edgeValue2822 = regionValue2798;
        regionValue2812 = edgeValue2820;
        regionValue2814 = edgeValue2822;
        break region447;
        }
        recovery$indy$flow$173(this, regionValue2814);
        if (value38 == null) {
            edgeValue2834 = regionValue2812;
            regionValue2828 = edgeValue2834;
            break region457;
        } else {
            edgeValue2846 = regionValue2812;
            regionValue2840 = edgeValue2846;
            break region450;
        }
        }
        edgeValue2852 = regionValue2840;
        regionValue2755 = edgeValue2852;
        break region452;
        }
        incremented2853 = regionValue2755 + (1);
        edgeValue2859 = incremented2853;
        regionValue2714 = edgeValue2859;
        break region455;
        }
        edgeValue2865 = regionValue2714;
        regionValue2684 = edgeValue2865;
        break region456;
        }
        if (value38 == null) {
            edgeValue2872 = regionValue2684;
            regionValue2532 = edgeValue2872;
            continue loop407;
        } else {
            edgeValue2878 = regionValue2684;
            regionValue2828 = edgeValue2878;
            break region457;
        }
        }
        comparison2879 = (computed7 > 0L ? 1 : computed7 == 0L ? 0 : -1);
        if (comparison2879 < 0) {
            edgeValue2885 = regionValue2828;
            regionValue2595 = edgeValue2885;
            regionValue2596 = this;
            continue loop416;
        } else {
            break region462;
        }
        }
        }
        }
        value2891 = recovery$indy$flow$174(this, computed25, -8915531689861002213L, computed7);
        edgeValue2893 = (int) ((value2891 ? 1 : 0));
        regionValue2788 = edgeValue2893;
        break region467;
        }
        recovery$indy$flow$175(this, ((regionValue2788 & 1) != 0));
        break region468;
        }
        return;
    }






   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$29(this, 40, var3, -7100141980671536100L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 8379815563406L;
      recovery$indy$30(this, var6, 2730595310398483081L, var4);
   }



   public void method_488$e45a9973e5(long var1) {
      augustus.recovered.modules.misc.MysteryBox_47kD var17;
      int var19;
      augustus.recovered.modules.misc.MysteryBox_47kD var18;
      long var10001 = var1 ^ 101942728890674L;
      int var3 = (int)((var1 ^ 101942728890674L) >>> 48);
      int var4 = (int)((var1 ^ 101942728890674L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 118419602197412L;
      int var8 = (int)((var1 ^ 26587122273883L) >>> 32);
      int var9 = (int)((var1 ^ 26587122273883L) << 32 >>> 32);
      long var10 = var1 ^ 92755537640689L;
      long var12 = var1 ^ 79023849750129L;
      int[] var14 = recovery$indy$31(-5079843531684290666L, var1);
      boolean var10000 = recovery$indy$32(this.field_46, this.field_438, var12, -5076115309635041969L, var1);
      if (var14 == null) {
         if (!var10000) {
            return;
         }

         this.field_438 = recovery$indy$33(C_476q.field_48, 9000, 12000, var6, -5076131816933337562L, var1);
         recovery$indy$34(this.field_46, -5076532434142807395L, var1);
         recovery$indy$35(this, (short)var3, var4, (short)var5, -5077107554061170896L, var1);
         var10000 = recovery$indy$36(this, var10, -5075968766335389232L, var1);
      }

      boolean var15 = var10000;
      var10000 = var15;
      if (var14 == null) {
         label58:
         if (var15 != this.field_43a) {
            label56: {
               if (var15) {
                  var17 = this;
                  var19 = this.field_42 + 1;
                  if (var1 < 0L) {
                     break label56;
                  }

                  this.field_42 = var19;
                  if (var14 == null) {
                     break label58;
                  }
               }

               var17 = this;
               var19 = this.field_43y + 1;
            }

            var17.field_43y = var19;
         }

         var10000 = var15;
      }

      label46: {
         label45: {
            if (var10000) {
               var18 = this;
               if (var1 <= 0L) {
                  break label46;
               }

               recovery$indy$38(
                  this, var8, this.field_43W, this.field_42, var9, recovery$indy$37(this, -5075906831382741935L, var1), -5079609742903199850L, var1
               );
               if (var14 == null) {
                  break label45;
               }
            }

            recovery$indy$40(this, var8, this.field_43h, this.field_43y, var9, recovery$indy$39(this, -5076203717931131861L, var1), -5079609742903199850L, var1);
         }

         var18 = this;
      }

      var18.field_43a = var15;
   }




    public MysteryBox_47kD(long a0) {
        super((java.lang.String) ("MysteryBox"),(java.lang.String) ("GeheimnisKiste"),(long) (((augustus.recovered.modules.misc.MysteryBox_47kD.a ^ a0) ^ 10218920603550L)),(java.awt.Color) (java.awt.Color.GREEN),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.misc.MysteryBox_47kD.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.misc.MysteryBox_47kD.a ^ a0) ^ 15063456240696L);
        long constructorKey4 = ((augustus.recovered.modules.misc.MysteryBox_47kD.a ^ a0) ^ 109266041515577L);
        java.lang.StringBuilder initialized5 = new java.lang.StringBuilder();
        java.lang.Object initialValue6 = recovery$indy$flow$205();
        java.lang.Object initialValue7 = recovery$indy$flow$206(initialized5, initialValue6);
        java.lang.Object initialValue8 = recovery$indy$flow$207();
        java.lang.Object initialValue9 = recovery$indy$flow$208(initialValue7, initialValue8);
        java.lang.Object initialValue10 = recovery$indy$flow$209(initialValue9, "data");
        java.lang.Object initialValue11 = recovery$indy$flow$210(initialValue10);
        recovery$indy$flow$211(this, initialValue11);
        net.C_47cu initialized12 = new net.C_47cu();
        recovery$indy$flow$214(this, initialized12);
        java.util.ArrayList initialized13 = new java.util.ArrayList();
        recovery$indy$flow$217(this, initialized13);
        java.util.ArrayList initialized14 = new java.util.ArrayList();
        recovery$indy$flow$220(this, initialized14);
        recovery$indy$flow$221(this, 0);
        recovery$indy$flow$222(this, 0);
        recovery$indy$flow$223(this, "");
        recovery$indy$flow$224(this, false);
        recovery$indy$flow$225(this, 10000);
        java.lang.Object initialValue15 = ((java.lang.Object)(((augustus.recovered.modules.misc.MysteryBox_47kD) (((java.lang.Object)(this)))).field_44));
        long initialValue16 = constructorKey4;
        java.lang.Object initialValue17 = initialValue15;
        java.lang.Object initialValue18 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue17))))));
        recovery$indy$flow$228(initialValue18, initialValue16);
        long initialValue19 = constructorKey3;
        MysteryBox_47kD initialValue20 = this;
        java.lang.Object initialValue21 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(initialValue20))))));
        recovery$indy$flow$230(initialValue21, initialValue19);
    }



    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static long recovery$indy$flow$92() {
        return augustus.recovered.modules.misc.MysteryBox_47kD.a;
    }
    private static native java.lang.Object recovery$indy$flow$93(int a0,long a1);
    private static native void recovery$indy$flow$94(long a0,java.lang.Object a1,long a2,long a3);

    private static void recovery$indy$flow$96(java.lang.Object a0) {
        ((java.util.ArrayList) (a0)).clear();
        return;
    }

    private static void recovery$indy$flow$98(java.lang.Object a0) {
        ((java.util.ArrayList) (a0)).clear();
        return;
    }

    private static native java.lang.Object recovery$indy$flow$102(long a0,long a1);
    private static java.lang.Object recovery$indy$flow$103(java.lang.Object a0) {
        return ((java.io.File) (a0)).getAbsolutePath();
    }
    private static native void recovery$indy$flow$104(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$105();
    private static java.lang.Object recovery$indy$flow$106(java.lang.Object a0,java.lang.Object a1) {
        return ((java.io.File) (a0)).listFiles(((java.io.FileFilter) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$107() {
        return augustus.recovered.modules.misc.MysteryBox_47kD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$108(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$109(java.lang.Object a0) {
        return ((java.io.File) (a0)).getName();
    }
    private static java.lang.Object recovery$indy$flow$110(java.lang.Object a0) {
        return ((java.io.File) (a0)).getName();
    }
    private static int recovery$indy$flow$111(java.lang.Object a0) {
        return ((java.lang.String) (a0)).length();
    }
    private static int recovery$indy$flow$112(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }
    private static java.lang.Object recovery$indy$flow$113(java.lang.Object a0,int a1,int a2) {
        return ((java.lang.String) (a0)).substring(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$114() {
        return augustus.recovered.modules.misc.MysteryBox_47kD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$115(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$116(java.lang.Object a0);
    private static boolean recovery$indy$flow$117(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }

    private static java.lang.Object recovery$indy$flow$119(java.lang.Object a0) {
        return ((java.io.File) (a0)).getName();
    }
    private static native java.lang.Object recovery$indy$flow$120(long a0,java.lang.Object a1,java.lang.Object a2,java.lang.Object a3,long a4,long a5);
    private static java.lang.Object recovery$indy$flow$121() {
        return net.C_47Ir.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$122(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$123(int a0,long a1);

    private static native java.lang.Object recovery$indy$flow$125(java.lang.Object a0,int a1,java.lang.Object a2,java.lang.Object a3,int a4,char a5,java.lang.Object a6,long a7,long a8);

    private static void recovery$indy$flow$127(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.MysteryBox_47kD) (a0)).field_40 = ((java.lang.String) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$128(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$129(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$130(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$131(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$132(java.lang.Object a0);
    private static boolean recovery$indy$flow$133(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$134(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }


    private static native long recovery$indy$flow$137(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$138(long a0) {
        return java.lang.Long.valueOf(a0);
    }
    private static boolean recovery$indy$flow$139(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }
    private static native java.lang.Object recovery$indy$flow$140(java.lang.Object a0);
    private static boolean recovery$indy$flow$141(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$142(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }


    private static native long recovery$indy$flow$145(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$146(long a0) {
        return java.lang.Long.valueOf(a0);
    }
    private static boolean recovery$indy$flow$147(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }
    private static native java.lang.Object recovery$indy$flow$148(int a0,long a1);
    private static native void recovery$indy$flow$149(long a0,java.lang.Object a1,long a2,long a3);

    private static boolean recovery$indy$flow$151(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }
    private static native java.lang.Object recovery$indy$flow$152(int a0,long a1);
    private static native void recovery$indy$flow$153(long a0,java.lang.Object a1,long a2,long a3);

    private static void recovery$indy$flow$155(java.lang.Object a0) {
        java.util.Collections.sort(((java.util.List) (a0)));
        return;
    }

    private static void recovery$indy$flow$157(java.lang.Object a0) {
        java.util.Collections.sort(((java.util.List) (a0)));
        return;
    }
    private static native long recovery$indy$flow$158(java.lang.Object a0,long a1,long a2);
    private static long recovery$indy$flow$159() {
        return java.lang.System.currentTimeMillis();
    }

    private static int recovery$indy$flow$161(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }

    private static java.lang.Object recovery$indy$flow$163(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static long recovery$indy$flow$165(java.lang.Object a0) {
        return ((java.lang.Long) (a0)).longValue();
    }
    private static void recovery$indy$flow$166(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.MysteryBox_47kD) (a0)).field_42 = a1;
        return;
    }

    private static int recovery$indy$flow$168(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }

    private static java.lang.Object recovery$indy$flow$170(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static long recovery$indy$flow$172(java.lang.Object a0) {
        return ((java.lang.Long) (a0)).longValue();
    }
    private static void recovery$indy$flow$173(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.MysteryBox_47kD) (a0)).field_43y = a1;
        return;
    }
    private static native boolean recovery$indy$flow$174(java.lang.Object a0,long a1,long a2,long a3);
    private static void recovery$indy$flow$175(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.MysteryBox_47kD) (a0)).field_43a = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$205() {
        return net.C_47VK.field_42;
    }
    private static java.lang.Object recovery$indy$flow$206(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$207() {
        return java.io.File.separator;
    }
    private static java.lang.Object recovery$indy$flow$208(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$209(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$210(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native void recovery$indy$flow$211(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$214(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$217(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$220(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$221(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.MysteryBox_47kD) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$222(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.MysteryBox_47kD) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$223(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.MysteryBox_47kD) (a0)).field_40 = ((java.lang.String) (a1));
        return;
    }
    private static void recovery$indy$flow$224(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.MysteryBox_47kD) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$225(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.MysteryBox_47kD) (a0)).field_438 = a1;
        return;
    }


    private static native void recovery$indy$flow$228(java.lang.Object a0,long a1);

    private static native void recovery$indy$flow$230(java.lang.Object a0,long a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native long recovery$indy$2(Object var0, long var1, long var3);
   private static native long recovery$indy$3(Object var0, long var1, long var3);
   private static native Runnable recovery$indy$4(MysteryBox_47kD var0);
   private static native Runnable recovery$indy$5(MysteryBox_47kD var0);
   private static native int[] recovery$indy$6(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);
   private static native void recovery$indy$29(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$30(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$31(long var0, long var2);
   private static native boolean recovery$indy$32(Object var0, long var1, long var3, long var5, long var7);
   private static native int recovery$indy$33(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$34(Object var0, long var1, long var3);
   private static native void recovery$indy$35(Object var0, short var1, int var2, short var3, long var4, long var6);
   private static native boolean recovery$indy$36(Object var0, long var1, long var3, long var5);
   private static native Runnable recovery$indy$37(Object var0, long var1, long var3);
   private static native void recovery$indy$38(Object var0, int var1, Object var2, int var3, int var4, Object var5, long var6, long var8);
   private static native Runnable recovery$indy$39(Object var0, long var1, long var3);
   private static native void recovery$indy$40(Object var0, int var1, Object var2, int var3, int var4, Object var5, long var6, long var8);
   private static native MethodHandle recovery$constant$41();
}
