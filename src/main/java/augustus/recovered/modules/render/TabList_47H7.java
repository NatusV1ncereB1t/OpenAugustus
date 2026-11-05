package augustus.recovered.modules.render;
import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.io.Serializable;
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
import net.C_45n;
import client.render.RenderPass;
import net.C_474A;
import net.C_474z;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47Fw;
import net.C_47ID;
import net.C_47IT;
import net.C_47K6;
import net.minecraft.client.gui.FontRenderer;
import net.C_47Lt;
import client.module.Module;
import net.C_47Pf;
import client.setting.ShaderOptions;
import net.C_47TA;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.event.RenderListener;
import net.C_47Yl;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47g5;
import net.minecraft.client.Minecraft;
import net.C_47oP;
import client.ClientGlobals;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47uI;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class TabList_47H7 extends client.module.Module implements client.event.RenderListener {
    private final client.setting.BooleanSetting settingRemove = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingScale = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingPingNumber = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAlwaysOpen = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRowSize = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingColumnSize = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.reflect.Method d(long a0,long a1);

    private void method_40$be4932ce22(int n, int n2, int n3, int n4, int n5, int n6, int n7, List list, List list2, long l) {
        block5: {
            l = a ^ l;
            int[] nArray = TabList_47H7.recovery$indy$1(5233401933690563681L, l);
            if (list2 != null) {
                RenderUtils.method_40$0f4d4a7a6c((int)(n / 2 - n2 / 2 - 1), (int)(n3 - 1), (int)(n / 2 + n2 / 2 + 1), (int)(n3 + list2.size() * TabList_47H7.recovery$indy$2((Object)TabList_47H7.field_43, (long)5236848960119414698L, (long)l).field_47), (int)Integer.MIN_VALUE);
                n3 += TabList_47H7.recovery$indy$3((Object)TabList_47H7.field_43, (long)5236848960119414698L, (long)l).field_47 * list2.size();
                ++n3;
            }
            RenderUtils.method_40$0f4d4a7a6c((int)(n / 2 - n2 / 2 - 1), (int)(n3 - 1), (int)(n / 2 + n2 / 2 + 1), (int)(n3 + n4 * 9), (int)Integer.MIN_VALUE);
            int n8 = 0;
            while (n8 < n7) {
                int n9 = n8 / n4;
                int n10 = n8 % n4;
                int n11 = n5 + n9 * n6 + n9 * 5;
                int n12 = n3 + n10 * 9;
                RenderUtils.method_40$0f4d4a7a6c((int)n11, (int)n12, (int)(n11 + n6), (int)(n12 + 8), (int)0x20FFFFFF);
                ++n8;
                int[] nArray2 = nArray;
                if (l > 0L) {
                    if (nArray2 != null) break block5;
                    nArray2 = nArray;
                }
                if (nArray2 == null) continue;
            }
            if (l >= 0L && list != null) {
                n3 = n3 + n4 * 9 + 1;
                RenderUtils.method_40$0f4d4a7a6c((int)(n / 2 - n2 / 2 - 1), (int)(n3 - 1), (int)(n / 2 + n2 / 2 + 1), (int)(n3 + list.size() * TabList_47H7.recovery$indy$4((Object)TabList_47H7.field_43, (long)5236848960119414698L, (long)l).field_47), (int)Integer.MIN_VALUE);
            }
        }
    }




   private boolean method_46s$aae029aa0a() {
      long var1 = a ^ 128320521813883L;
      long var10000 = 1732748527569845450L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 1732510387509204610L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



    private void method_44$d121023614(int n, int n2, int n3, int n4, long l, List list, List list2) {
        block7: {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            block5: {
                long l2;
                block6: {
                    List list3;
                    block4: {
                        l2 = (l = a ^ l) ^ 0x57D0D0680188L;
                        int[] nArray = TabList_47H7.recovery$indy$5(900936582798026817L, l);
                        list3 = list2;
                        if (nArray != null) break block4;
                        if (list3 != null) {
                            RenderUtils.method_40$0f4d4a7a6c((int)(n / 2 - n2 / 2 - 1), (int)(n3 - 1), (int)(n / 2 + n2 / 2 + 1), (int)(n3 + list2.size() * TabList_47H7.recovery$indy$6((Object)TabList_47H7.field_43, (long)904383750898047882L, (long)l).field_47), (int)TabList_47H7.recovery$indy$7(this.field_44, Color.black.getRGB(), l2, 904947908181317354L, l));
                            n3 += TabList_47H7.recovery$indy$8((Object)TabList_47H7.field_43, (long)904383750898047882L, (long)l).field_47 * list2.size();
                            ++n3;
                        }
                        n9 = n / 2 - n2 / 2 - 1;
                        n8 = n3 - 1;
                        n7 = n / 2 + n2 / 2 + 1;
                        n6 = n3 + n4 * 9;
                        n5 = Color.black.getRGB();
                        if (l <= 0L) break block5;
                        RenderUtils.method_40$0f4d4a7a6c((int)n9, (int)n8, (int)n7, (int)n6, (int)n5);
                        if (nArray != null) break block6;
                        list3 = list;
                    }
                    if (list3 == null) break block7;
                    n3 = n3 + n4 * 9 + 1;
                }
                n9 = n / 2 - n2 / 2 - 1;
                n8 = n3 - 1;
                n7 = n / 2 + n2 / 2 + 1;
                n6 = n3 + list.size() * TabList_47H7.recovery$indy$9((Object)TabList_47H7.field_43, (long)904383750898047882L, (long)l).field_47;
                n5 = TabList_47H7.recovery$indy$10(this.field_44, Color.black.getRGB(), l2, 904947908181317354L, l);
            }
            RenderUtils.method_40$0f4d4a7a6c((int)n9, (int)n8, (int)n7, (int)n6, (int)n5);
        }
    }




    public void onRender2D(int a0,float a1,char a2,int a3,net.minecraft.client.gui.ScaledResolution a4) {
        region1430: {
        region1427: {
        region1425: {
        java.lang.Object value37;
        int value591;
        java.lang.Object value5399;
        int regionValue5407;

        region1356: {
        java.lang.Object regionValue5323;
        int regionValue5322;

        region1354: {
        java.lang.Object regionValue3060;
        int regionValue3058;
        int regionValue3062;
        int regionValue3061;
        int regionValue3059;
        int value5396;
        java.lang.Object value5395;
        java.lang.Object value5394;
        java.lang.Object value5392;
        int value5391;
        int computed5398;
        int computed5397;
        int computed5390;
        int computed5389;
        int computed5388;
        int computed5387;

        region1325: {
        int regionValue5376;
        int computed5380;
        java.lang.Object regionValue5377;
        int regionValue5375;
        int regionValue5374;
        int computed5386;
        int computed5385;
        int computed5384;
        int computed5383;
        int computed5382;
        int computed5379;
        int computed5378;

        region1305: {
        java.lang.Object regionValue5367;
        int regionValue5366;
        int regionValue5365;
        int regionValue5364;

        region1303: {
        java.lang.Object regionValue5356;
        java.lang.Object regionValue5355;
        int regionValue5354;
        int regionValue5353;
        int regionValue5352;

        region1302: {
        java.lang.Object regionValue5345;
        java.lang.Object regionValue5344;
        int regionValue5343;
        int regionValue5342;
        int regionValue5341;

        region1300: {
        java.lang.Object regionValue5334;
        int regionValue5331;
        java.lang.Object regionValue5333;
        int regionValue5332;
        int regionValue5330;

        region1298: {
        java.lang.Object regionValue2908;
        int regionValue2906;
        int regionValue2907;
        int regionValue2905;

        region1294: {
        java.lang.Object value599;
        int regionValue1362;
        int computed1768;
        int regionValue2898;
        java.lang.Object regionValue2897;
        int regionValue2896;
        int regionValue2895;
        int regionValue2890;
        int regionValue2889;
        int regionValue2892;
        int regionValue2888;
        java.lang.Object regionValue2887;
        int computed1776;

        region920: {
        int regionValue2446;
        java.lang.Object regionValue2445;
        int regionValue2444;
        int regionValue2443;
        int regionValue2440;
        int regionValue2438;
        int regionValue2437;
        int regionValue2436;
        java.lang.Object regionValue2435;

        region919: {
        java.lang.Object regionValue2498;
        int regionValue2497;
        int regionValue2496;
        int regionValue2493;
        int regionValue2491;
        int regionValue2490;
        int regionValue2489;
        java.lang.Object regionValue2488;

        region918: {
        int regionValue2618;
        int regionValue2617;
        int regionValue2612;
        java.lang.Object regionValue2619;
        int regionValue2614;
        int regionValue2611;
        int regionValue2610;
        java.lang.Object regionValue2609;
        int computed2877;
        int computed2876;
        int computed2875;
        int computed2874;
        int computed2873;
        int computed2872;
        int computed2871;
        int computed2870;
        int computed2869;
        int computed2868;
        int computed2867;

        region890: {
        java.lang.Object regionValue2865;
        int regionValue2864;
        int regionValue2863;
        int regionValue2860;
        int regionValue2858;
        int regionValue2857;
        int regionValue2856;
        java.lang.Object regionValue2855;
        int incremented2866;

        region887: {
        java.lang.Object regionValue2718;
        int regionValue2717;
        int regionValue2716;
        int regionValue2713;
        int regionValue2711;
        int regionValue2710;
        int regionValue2709;
        java.lang.Object regionValue2708;

        region885: {
        java.lang.Object regionValue2697;
        int regionValue2696;
        int regionValue2695;
        int regionValue2692;
        int regionValue2690;
        int regionValue2689;
        int regionValue2688;
        java.lang.Object regionValue2687;
        java.lang.Object value2677;

        region816: {
        int value1778;
        java.lang.Object regionValue2558;
        java.lang.Object regionValue2557;
        int regionValue2556;
        int regionValue2552;
        int regionValue2550;
        int regionValue2549;
        int regionValue2548;
        java.lang.Object regionValue2547;

        region814: {
        int regionValue2657;
        java.lang.Object regionValue2658;
        int value2674;
        java.lang.Object value2673;
        java.lang.Object value2672;
        java.lang.Object value2670;
        int value2669;
        java.lang.Object regionValue2659;
        int regionValue2653;
        int regionValue2651;
        int regionValue2650;
        int regionValue2649;
        java.lang.Object regionValue2648;
        int computed2676;
        int computed2675;
        int computed2668;
        int computed2667;
        int computed2666;
        int computed2665;
        int computed2664;
        int computed2663;
        int computed2662;
        int computed2661;
        int computed2660;

        region771: {
        java.lang.Object regionValue2639;
        java.lang.Object regionValue2638;
        int regionValue2637;
        int regionValue2633;
        int regionValue2631;
        int regionValue2630;
        int regionValue2629;
        java.lang.Object regionValue2628;

        region769: {
        java.lang.Object regionValue2599;
        int regionValue2597;
        int regionValue2593;
        int regionValue2591;
        int regionValue2590;
        int regionValue2589;
        java.lang.Object regionValue2588;
        java.lang.Object regionValue2600;
        java.lang.Object regionValue2598;

        region768: {
        java.lang.Object regionValue2579;
        java.lang.Object regionValue2578;
        java.lang.Object regionValue2577;
        int regionValue2576;
        int regionValue2572;
        int regionValue2570;
        int regionValue2569;
        int regionValue2568;
        java.lang.Object regionValue2567;

        region766: {
        java.lang.Object regionValue2537;
        java.lang.Object regionValue2538;
        int regionValue2536;
        int regionValue2532;
        int regionValue2530;
        int regionValue2529;
        int regionValue2528;
        java.lang.Object regionValue2527;

        region763: {
        java.lang.Object regionValue2518;
        java.lang.Object regionValue2517;
        int regionValue2516;
        int regionValue2512;
        int regionValue2510;
        int regionValue2509;
        int regionValue2508;
        java.lang.Object regionValue2507;

        region761: {
        int regionValue2458;
        java.lang.Object regionValue2467;
        int regionValue2465;
        int regionValue2461;
        int regionValue2459;
        int regionValue2457;
        java.lang.Object regionValue2456;
        java.lang.Object value2479;
        java.lang.Object value2475;
        int regionValue2474;
        java.lang.Object regionValue2473;
        java.lang.Object regionValue2472;
        java.lang.Object regionValue2471;
        int regionValue2470;
        int regionValue2468;
        java.lang.Object regionValue2466;
        long computed35;

        region732: {
        java.lang.Object regionValue2292;
        java.lang.Object regionValue2291;
        int regionValue2284;
        int regionValue2290;
        int regionValue2286;
        int regionValue2283;
        int regionValue2282;
        java.lang.Object regionValue2281;
        int regionValue2293;
        java.lang.Object value2426;
        java.lang.Object value2425;
        java.lang.Object value2424;
        int value2423;
        int value2421;

        region718: {
        int regionValue2340;
        java.lang.Object regionValue2339;
        java.lang.Object regionValue2338;
        int regionValue2334;
        int regionValue2332;
        int regionValue2331;
        int regionValue2330;
        java.lang.Object regionValue2329;

        region717: {
        java.lang.Object regionValue2420;
        java.lang.Object regionValue2419;
        int regionValue2418;
        int regionValue2414;
        int regionValue2412;
        int regionValue2411;
        int regionValue2410;
        java.lang.Object regionValue2409;

        region710: {
        java.lang.Object regionValue2153;
        java.lang.Object regionValue2152;
        int regionValue2151;
        int regionValue2147;
        int regionValue2145;
        int regionValue2144;
        int regionValue2143;
        java.lang.Object regionValue2142;
        boolean value2399;
        java.lang.Object value2398;
        java.lang.Object value2395;
        boolean value2394;
        java.lang.Object value2393;
        java.lang.Object value2390;
        long computed33;
        long computed29;
        long computed23;

        region676: {
        java.lang.Object value2208;
        int regionValue2389;
        java.lang.Object regionValue2387;
        int regionValue2383;
        int regionValue2381;
        int regionValue2380;
        int regionValue2379;
        java.lang.Object regionValue2378;

        region674: {
        java.lang.Object regionValue2234;
        int regionValue2233;
        int regionValue2229;
        int regionValue2227;
        int regionValue2226;
        int regionValue2225;
        java.lang.Object regionValue2224;
        java.lang.Object value2210;

        region645: {
        java.lang.Object value1798;
        java.lang.Object value2206;
        java.lang.Object value2205;
        java.lang.Object value2204;
        java.lang.Object value2202;
        java.lang.Object regionValue2200;
        int regionValue2199;
        int regionValue2195;
        int regionValue2193;
        int regionValue2192;
        int regionValue2191;
        java.lang.Object regionValue2190;
        int computed2207;

        region624: {
        java.lang.Object regionValue2176;
        int regionValue2175;
        int regionValue2171;
        int regionValue2169;
        int regionValue2168;
        int regionValue2167;
        java.lang.Object regionValue2166;

        region622: {
        java.lang.Object regionValue2127;
        int regionValue2126;
        int regionValue2122;
        int regionValue2120;
        int regionValue2119;
        int regionValue2118;
        java.lang.Object regionValue2117;
        java.lang.Object value1785;

        region620: {
        java.lang.Object regionValue1873;
        int regionValue1872;
        int regionValue1868;
        int regionValue1866;
        int regionValue1865;
        int regionValue1864;
        java.lang.Object regionValue1863;

        region618: {
        java.lang.Object value1932;
        int regionValue1957;
        int regionValue1953;
        int regionValue1951;
        int regionValue1950;
        int regionValue1949;
        java.lang.Object regionValue1948;
        java.lang.Object value1934;

        region587: {
        java.lang.Object value1791;
        int regionValue1817;
        int regionValue1815;
        int regionValue1814;
        int regionValue1813;
        java.lang.Object regionValue1812;
        int computed1782;
        java.lang.Object value1930;
        java.lang.Object value1929;
        java.lang.Object value1928;
        java.lang.Object value1926;
        int computed1931;

        region568: {
        int regionValue1918;
        int regionValue1916;
        int regionValue1915;
        int regionValue1914;
        java.lang.Object regionValue1913;

        region564: {
        int regionValue1893;
        int regionValue1891;
        int regionValue1890;
        int regionValue1889;
        java.lang.Object regionValue1888;

        region562: {
        int regionValue1842;
        int regionValue1840;
        int regionValue1839;
        int regionValue1838;
        java.lang.Object regionValue1837;
        java.lang.Object value1784;

        region560: {
        int regionValue1757;
        int regionValue1759;
        int regionValue1754;
        int regionValue1756;
        int regionValue1755;
        java.lang.Object regionValue1753;
        int regionValue1761;
        int regionValue1760;
        java.lang.Object value1797;
        java.lang.Object value1796;
        java.lang.Object value1795;
        java.lang.Object value1793;
        java.lang.Object value1790;
        java.lang.Object value1789;
        java.lang.Object value1788;
        java.lang.Object value1786;
        int value1767;
        int computed1781;
        int computed1780;
        int computed1779;
        int computed1775;
        int computed1774;
        int computed1773;
        int computed1772;
        int computed1771;
        int computed1770;
        int computed1766;
        int computed1765;
        int computed1764;
        int computed1763;
        int computed1762;

        region488: {
        int regionValue1700;
        int regionValue1699;
        int regionValue1697;
        int regionValue1696;
        int regionValue1695;
        int regionValue1694;
        java.lang.Object regionValue1693;

        region487: {
        int regionValue1659;
        int regionValue1658;
        int regionValue1657;
        int regionValue1655;
        int regionValue1654;
        int regionValue1653;
        int regionValue1652;
        java.lang.Object regionValue1651;

        region486: {
        int regionValue1740;
        int regionValue1739;
        int regionValue1737;
        int regionValue1736;
        int regionValue1735;
        int regionValue1734;
        java.lang.Object regionValue1733;

        region485: {
        int regionValue1720;
        int regionValue1719;
        int regionValue1717;
        int regionValue1716;
        int regionValue1715;
        int regionValue1714;
        java.lang.Object regionValue1713;

        region483: {
        int regionValue1679;
        int regionValue1678;
        int regionValue1676;
        int regionValue1675;
        int regionValue1674;
        int regionValue1673;
        java.lang.Object regionValue1672;

        region482: {
        int regionValue1558;
        int regionValue1560;
        int regionValue1557;
        int regionValue1556;
        int regionValue1555;
        java.lang.Object regionValue1554;

        region478: {
        int regionValue1598;
        int regionValue1596;
        int regionValue1595;
        int regionValue1594;
        int regionValue1593;
        java.lang.Object regionValue1592;

        region477: {
        int regionValue1420;
        int regionValue1419;
        int regionValue1418;
        int regionValue1417;
        java.lang.Object regionValue1416;

        region476: {
        int regionValue1517;
        int regionValue1516;
        int regionValue1515;
        int regionValue1514;
        java.lang.Object regionValue1513;
        int regionValue1519;

        region475: {
        int value1637;
        int regionValue1636;
        int regionValue1634;
        int regionValue1633;
        int regionValue1632;
        int regionValue1631;
        java.lang.Object regionValue1630;

        region473: {
        int regionValue1617;
        int regionValue1615;
        int regionValue1614;
        int regionValue1613;
        int regionValue1612;
        java.lang.Object regionValue1611;

        region471: {
        int regionValue1479;
        int regionValue1478;
        int regionValue1477;
        int regionValue1476;
        int regionValue1475;
        java.lang.Object regionValue1474;

        region468: {
        int regionValue1578;
        int regionValue1577;
        int regionValue1576;
        int regionValue1575;
        int regionValue1574;
        java.lang.Object regionValue1573;

        region466: {
        int value1500;
        int regionValue1538;
        int regionValue1537;
        int regionValue1536;
        int regionValue1534;
        java.lang.Object regionValue1533;
        int regionValue1535;

        region465: {
        int regionValue1498;
        int regionValue1497;
        int regionValue1496;
        int regionValue1494;
        java.lang.Object regionValue1493;
        int regionValue1495;

        region460: {
        int regionValue1381;
        int regionValue1380;
        int regionValue1379;
        int regionValue1378;
        int regionValue1377;
        java.lang.Object regionValue1376;
        java.lang.Object value1461;
        java.lang.Object value1460;

        region457: {
        int regionValue1458;
        int regionValue1457;
        int regionValue1456;
        int regionValue1455;
        int regionValue1454;
        java.lang.Object regionValue1453;

        region456: {
        int regionValue1439;
        int regionValue1438;
        int regionValue1437;
        int regionValue1436;
        int regionValue1435;
        java.lang.Object regionValue1434;

        region454: {
        int regionValue1401;
        int regionValue1400;
        int regionValue1399;
        int regionValue1397;
        java.lang.Object regionValue1396;
        int regionValue1398;

        region453: {
        int regionValue1361;
        int regionValue1360;
        int regionValue1359;
        int regionValue1358;
        int regionValue1357;
        java.lang.Object regionValue1356;

        region449: {
        int regionValue1325;
        int regionValue1324;
        int regionValue1323;
        int regionValue1322;
        int regionValue1321;
        java.lang.Object regionValue1320;

        region448: {
        int regionValue1209;
        int regionValue1208;
        int regionValue1207;
        int regionValue1206;
        int regionValue1205;
        int regionValue1204;
        java.lang.Object regionValue1203;

        region447: {
        int regionValue1246;
        int regionValue1245;
        int regionValue1244;
        int regionValue1243;
        int regionValue1242;
        java.lang.Object regionValue1241;

        region446: {
        int regionValue1343;
        int regionValue1342;
        int regionValue1341;
        int regionValue1340;
        int regionValue1339;
        java.lang.Object regionValue1338;

        region444: {
        int regionValue1306;
        int regionValue1305;
        int regionValue1304;
        int regionValue1303;
        int regionValue1302;
        java.lang.Object regionValue1301;
        int regionValue1307;

        region443: {
        int regionValue1166;
        int regionValue1165;
        int regionValue1164;
        int regionValue1163;
        int regionValue1162;
        java.lang.Object regionValue1161;
        boolean value1288;
        java.lang.Object value1287;
        java.lang.Object value1286;
        java.lang.Object value1285;
        java.lang.Object value1283;

        region429: {
        int regionValue1282;
        int regionValue1281;
        int regionValue1280;
        int regionValue1279;
        int regionValue1278;
        java.lang.Object regionValue1277;

        region428: {
        int regionValue1264;
        int regionValue1263;
        int regionValue1262;
        int regionValue1261;
        int regionValue1260;
        java.lang.Object regionValue1259;

        region426: {
        int regionValue1227;
        int regionValue1226;
        int regionValue1225;
        int regionValue1224;
        int regionValue1223;
        java.lang.Object regionValue1222;
        int regionValue1228;

        region425: {
        int regionValue1073;
        int regionValue1072;
        int regionValue1071;
        int regionValue1070;
        int regionValue1069;
        int regionValue1068;
        java.lang.Object regionValue1067;

        region423: {
        int regionValue1111;
        int regionValue1110;
        int regionValue1109;
        int regionValue1108;
        int regionValue1107;
        java.lang.Object regionValue1106;
        boolean value1190;
        java.lang.Object value1189;
        java.lang.Object value1187;

        region414: {
        int regionValue1185;
        int regionValue1184;
        int regionValue1183;
        int regionValue1182;
        int regionValue1181;
        java.lang.Object regionValue1180;

        region411: {
        int regionValue1031;
        int regionValue1030;
        int regionValue1029;
        int regionValue1028;
        int regionValue1027;
        java.lang.Object regionValue1026;

        region408: {
        int regionValue1148;
        int regionValue1147;
        int regionValue1146;
        int regionValue1145;
        int regionValue1144;
        java.lang.Object regionValue1143;

        region406: {
        int regionValue1011;
        int regionValue1013;
        int regionValue1010;
        int regionValue1009;
        int regionValue1008;
        java.lang.Object regionValue1007;
        int converted992;

        region388: {
        long computed27;
        int value985;
        int regionValue747;
        int regionValue746;
        int regionValue745;
        java.lang.Object regionValue744;
        int value994;
        double value991;
        java.lang.Object value990;
        java.lang.Object value987;
        int value986;

        region368: {
        java.lang.Object regionValue781;
        int regionValue783;
        int regionValue782;
        int value984;

        region366: {
        java.lang.Object regionValue714;
        int regionValue713;
        int regionValue712;
        java.lang.Object value983;

        region365: {
        java.lang.Object value609;
        int regionValue631;
        int regionValue630;
        java.lang.Object value613;
        java.lang.Object value597;

        region258: {
        java.lang.Object regionValue476;
        int value612;
        int value611;
        java.lang.Object value608;
        java.lang.Object value607;
        java.lang.Object value605;
        java.lang.Object value604;
        java.lang.Object value603;
        java.lang.Object value601;
        java.lang.Object value596;
        java.lang.Object value595;
        java.lang.Object value593;
        java.lang.Object value589;
        java.lang.Object value588;
        java.lang.Object value587;
        java.lang.Object value586;
        long computed31;

        region199: {
        region195: {
        region193: {
        java.lang.Object value538;
        boolean value570;
        java.lang.Object value569;
        java.lang.Object value567;

        region183: {
        region181: {
        java.lang.Object value537;

        region177: {
        int regionValue431;

        region176: {
        java.lang.Object value462;
        boolean value510;
        java.lang.Object value509;
        long computed21;

        region163: {
        region161: {
        java.lang.Object value461;

        region157: {
        int regionValue446;

        region156: {
        int regionValue331;

        region155: {
        int regionValue364;

        region154: {
        boolean value417;
        java.lang.Object value416;
        java.lang.Object value413;
        java.lang.Object value412;
        long computed25;

        region139: {
        int regionValue396;

        region138: {
        int regionValue380;

        region136: {
        int regionValue348;

        region135: {
        int regionValue228;

        region133: {
        int regionValue262;

        region132: {
        boolean value316;
        java.lang.Object value315;
        java.lang.Object value314;
        java.lang.Object value313;
        java.lang.Object value312;
        java.lang.Object value310;

        region116: {
        int regionValue141;

        region115: {
        region113: {
        region112: {
        region110: {
        int regionValue60;

        region109: {
        boolean value212;
        java.lang.Object value211;
        java.lang.Object value209;

        region96: {
        int regionValue158;

        region95: {
        region93: {
        region92: {
        region90: {
        boolean value125;
        java.lang.Object value124;
        java.lang.Object value122;

        region77: {
        region75: {
        int regionValue76;

        region74: {
        long computed19;
        boolean value44;
        java.lang.Object value43;
        java.lang.Object value42;
        java.lang.Object value41;
        java.lang.Object value39;
        long converted16;
        long converted12;
        long converted10;
        long computed18;
        long computed17;
        long computed15;
        long computed14;
        long computed13;
        long computed11;

        converted10 = (long) (a0);
        computed11 = converted10 << 32;
        converted12 = (long) (a2);
        computed13 = converted12 << 48;
        computed14 = computed13 >>> 32;
        computed15 = computed11 | computed14;
        converted16 = (long) (a3);
        computed17 = converted16 << 48;
        computed18 = computed17 >>> 48;
        computed19 = computed15 | computed18;
        computed21 = computed19 ^ 21574113237242L;
        computed23 = computed19 ^ 62665625052564L;
        computed25 = computed19 ^ 132509372682955L;
        computed27 = computed19 ^ 79469613767391L;
        computed29 = computed19 ^ 132989861136316L;
        computed31 = computed19 ^ 64841158862185L;
        computed33 = computed19 ^ 91924420980846L;
        computed35 = computed19 ^ 58032606781533L;
        value37 = recovery$indy$flow$50();
        value39 = recovery$indy$flow$51();
        value41 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value39))))));
        value42 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value41)))).field_44r));
        value43 = ((java.lang.Object)(((net.C_47oo) (((java.lang.Object)(value42)))).field_42));
        value44 = recovery$indy$flow$55(value43);
        if (value37 != null) {
            regionValue60 = (int) ((value44 ? 1 : 0));
            break region109;
        } else {
            regionValue76 = (int) ((value44 ? 1 : 0));
            break region74;
        }
        }
        if (regionValue76 != 0) {
            break region96;
        } else {
            break region75;
        }
        }
        break region77;
        }
        value122 = ((java.lang.Object)(((augustus.recovered.modules.render.TabList_47H7) (((java.lang.Object)(this)))).settingAlwaysOpen));
        value124 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value122))))));
        value125 = recovery$indy$flow$58(value124);
        if (a2 < 0) {
            regionValue141 = (int) ((value125 ? 1 : 0));
            break region110;
        } else {
            regionValue158 = (int) ((value125 ? 1 : 0));
            break region90;
        }
        }
        break region92;
        }
        if (value37 != null) {
            regionValue60 = regionValue158;
            break region109;
        } else {
            break region93;
        }
        }
        break region95;
        }
        if (regionValue158 == 0) {
            break region1430;
        } else {
            break region96;
        }
        }
        value209 = recovery$indy$flow$59();
        value211 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value209))))));
        value212 = recovery$indy$flow$61(value211);
        regionValue60 = (int) ((value212 ? 1 : 0));
        break region109;
        }
        regionValue141 = regionValue60;
        break region110;
        }
        if (a2 <= 0) {
            regionValue228 = regionValue141;
            break region133;
        } else {
            break region112;
        }
        }
        if (value37 != null) {
            regionValue262 = regionValue141;
            break region132;
        } else {
            break region113;
        }
        }
        break region115;
        }
        if (regionValue141 != 0) {
            break region1430;
        } else {
            break region116;
        }
        }
        value310 = recovery$indy$flow$62();
        value312 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value310))))));
        value313 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value312)))).field_42P));
        value314 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value313)))).field_49m));
        value315 = recovery$indy$flow$66(value314);
        value316 = recovery$indy$flow$67(value315);
        regionValue262 = (int) ((value316 ? 1 : 0));
        break region132;
        }
        regionValue228 = regionValue262;
        break region133;
        }
        if (a3 <= 0) {
            regionValue331 = regionValue228;
            break region155;
        } else {
            regionValue348 = regionValue228;
            break region135;
        }
        }
        if (value37 != null) {
            regionValue364 = regionValue348;
            break region154;
        } else {
            regionValue380 = regionValue348;
            break region136;
        }
        }
        regionValue396 = regionValue380;
        break region138;
        }
        if (regionValue396 != 0) {
            break region1430;
        } else {
            break region139;
        }
        }
        value412 = recovery$indy$flow$68();
        value413 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value412)))).field_41s));
        value416 = ((java.lang.Object)(((augustus.recovered.modules.render.AntiStrike_47Qa) (((java.lang.Object)(value413))))));
        value417 = recovery$indy$flow$71(value416, computed25);
        regionValue364 = (int) ((value417 ? 1 : 0));
        break region154;
        }
        regionValue331 = regionValue364;
        break region155;
        }
        if (value37 != null) {
            regionValue431 = regionValue331;
            break region176;
        } else {
            regionValue446 = regionValue331;
            break region156;
        }
        }
        if (regionValue446 != 0) {
            break region1430;
        } else {
            break region157;
        }
        }
        value461 = recovery$indy$flow$72();
        value462 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value461)))).field_48f));
        if (value37 != null) {
            regionValue476 = value462;
            break region199;
        } else {
            break region161;
        }
        }
        break region163;
        }
        value509 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(value462))))));
        value510 = recovery$indy$flow$75(value509, computed21);
        regionValue431 = (int) ((value510 ? 1 : 0));
        break region176;
        }
        if (regionValue431 == 0) {
            break region195;
        } else {
            break region177;
        }
        }
        value537 = recovery$indy$flow$76();
        value538 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value537)))).field_48f));
        if (value37 != null) {
            regionValue476 = value538;
            break region199;
        } else {
            break region181;
        }
        }
        break region183;
        }
        value567 = ((java.lang.Object)(((augustus.recovered.modules.render.TabList_47H7) (((java.lang.Object)(value538)))).settingRemove));
        value569 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value567))))));
        value570 = recovery$indy$flow$80(value569);
        if ((int) ((value570 ? 1 : 0)) != 0) {
            break region1430;
        } else {
            break region193;
        }
        }
        break region195;
        }
        recovery$indy$flow$81();
        regionValue476 = this;
        break region199;
        }
        value586 = regionValue476;
        value587 = ((java.lang.Object)(((augustus.recovered.modules.render.TabList_47H7) (((java.lang.Object)(value586))))));
        value588 = ((java.lang.Object)(((net.minecraft.client.gui.ScaledResolution) (((java.lang.Object)(a4))))));
        value589 = recovery$indy$flow$84(value587, computed31, value588);
        value591 = recovery$indy$flow$85(value589);
        value593 = recovery$indy$flow$86();
        value595 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value593))))));
        value596 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value595)))).field_44Q));
        value597 = recovery$indy$flow$89(value596);
        value599 = recovery$indy$flow$90(value597, 0);
        value601 = recovery$indy$flow$91();
        value603 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value601))))));
        value604 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value603)))).field_42P));
        value605 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value604)))).field_49m));
        value607 = recovery$indy$flow$95();
        value608 = recovery$indy$flow$96(value605);
        value609 = recovery$indy$flow$97(value607, value608);
        value611 = 0;
        value612 = 0;
        value613 = recovery$indy$flow$98(value609);
        regionValue630 = value611;
        regionValue631 = value612;
        break region258;
        }
        loop258: while (true) {
        int regionValue687;
        int regionValue686;
        java.lang.Object regionValue689;

        region263: {
        java.lang.Object value698;
        int regionValue650;
        int regionValue649;
        int value697;
        double value695;
        java.lang.Object value694;
        java.lang.Object value693;
        java.lang.Object value691;
        int value690;
        int converted696;

        region1585: {
        java.lang.Object value670;
        int regionValue668;
        int regionValue667;

        region261: {
        boolean value633;

        value633 = recovery$indy$flow$99(value613);
        if ((int) ((value633 ? 1 : 0)) == 0) {
            regionValue649 = regionValue630;
            regionValue650 = regionValue631;
            break region1585;
        } else {
            regionValue667 = regionValue630;
            regionValue668 = regionValue631;
            break region261;
        }
        }
        value670 = recovery$indy$flow$100(value613);
        regionValue686 = regionValue667;
        regionValue687 = regionValue668;
        regionValue689 = value670;
        break region263;
        }
        value690 = recovery$indy$flow$131(value609);
        value691 = ((java.lang.Object)(((augustus.recovered.modules.render.TabList_47H7) (((java.lang.Object)(this)))).settingRowSize));
        value693 = value691;
        value694 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value693))))));
        value695 = recovery$indy$flow$134(value694, computed27);
        converted696 = (int) (value695);
        value697 = recovery$indy$flow$135(value690, converted696);
        value698 = recovery$indy$flow$136(value609, 0, value697);
        if (a2 < 0) {
            regionValue686 = regionValue649;
            regionValue687 = regionValue650;
            regionValue689 = value698;
            break region263;
        } else {
            regionValue712 = regionValue649;
            regionValue713 = regionValue650;
            regionValue714 = value698;
            break region365;
        }
        }
        loop263: while (true) {
        java.lang.Object value982;
        int regionValue973;
        int regionValue971;
        int value981;
        double value979;
        java.lang.Object value978;
        java.lang.Object value977;
        java.lang.Object value975;
        int value974;
        int converted980;

        region343: {
        int regionValue880;
        int regionValue878;

        region341: {
        int value955;
        int value954;
        int value953;
        int value952;
        java.lang.Object value951;
        java.lang.Object value950;
        int value949;
        java.lang.Object value948;
        java.lang.Object value947;
        java.lang.Object value946;
        java.lang.Object value945;
        java.lang.Object value943;
        java.lang.Object value942;
        java.lang.Object value941;
        java.lang.Object value940;
        int regionValue939;
        java.lang.Object regionValue938;
        int regionValue936;
        java.lang.StringBuilder initialized944;

        region310: {
        int regionValue821;
        int regionValue818;
        java.lang.Object regionValue820;
        java.lang.Object value920;
        java.lang.Object value919;

        region307: {
        int regionValue918;
        java.lang.Object regionValue917;
        int regionValue915;

        region306: {
        int regionValue899;
        java.lang.Object regionValue898;
        int regionValue896;

        region304: {
        int regionValue861;
        int regionValue858;
        java.lang.Object regionValue860;

        region303: {
        int regionValue841;
        java.lang.Object regionValue840;
        int regionValue838;

        region301: {
        int regionValue802;
        java.lang.Object regionValue801;
        int regionValue799;

        region298: {
        int value767;
        int regionValue763;
        int regionValue766;
        java.lang.Object regionValue765;

        region295: {
        java.lang.Object value716;
        int value730;
        int value729;
        int value728;
        java.lang.Object value727;
        java.lang.Object value726;
        int value725;
        java.lang.Object value724;
        java.lang.Object value723;
        java.lang.Object value722;
        java.lang.Object value720;
        java.lang.Object value719;
        java.lang.Object value718;
        java.lang.Object value717;
        java.lang.Object value715;
        java.lang.StringBuilder initialized721;

        value715 = ((java.lang.Object)(((net.C_47Yl) (((java.lang.Object)(regionValue689))))));
        value716 = value715;
        value717 = recovery$indy$flow$102();
        value718 = value717;
        value719 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value718))))));
        value720 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value719)))).field_42N));
        initialized721 = new java.lang.StringBuilder();
        value722 = recovery$indy$flow$107(value716);
        value723 = recovery$indy$flow$108(initialized721, value722);
        value724 = recovery$indy$flow$109(value723, " ");
        value725 = recovery$indy$flow$110(value716);
        value726 = recovery$indy$flow$111(value724, value725);
        value727 = recovery$indy$flow$112(value726);
        value728 = recovery$indy$flow$113(value720, value727);
        value729 = value728;
        value730 = recovery$indy$flow$114(regionValue686, value729);
        if (a3 <= 0) {
            regionValue744 = value609;
            regionValue745 = regionValue686;
            regionValue746 = regionValue687;
            regionValue747 = value730;
            break region368;
        } else {
            regionValue763 = regionValue687;
            regionValue765 = value716;
            regionValue766 = value730;
            break region295;
        }
        }
        value767 = regionValue766;
        if (value37 != null) {
            regionValue781 = value609;
            regionValue782 = regionValue763;
            regionValue783 = value767;
            break region366;
        } else {
            regionValue799 = regionValue763;
            regionValue801 = regionValue765;
            regionValue802 = value767;
            break region298;
        }
        }
        if (value37 != null) {
            regionValue818 = regionValue799;
            regionValue820 = regionValue801;
            regionValue821 = regionValue802;
            break region307;
        } else {
            regionValue838 = regionValue799;
            regionValue840 = regionValue801;
            regionValue841 = regionValue802;
            break region301;
        }
        }
        regionValue858 = regionValue838;
        regionValue860 = regionValue840;
        regionValue861 = regionValue841;
        break region303;
        }
        if (value599 == null) {
            regionValue878 = regionValue858;
            regionValue880 = regionValue861;
            break region341;
        } else {
            regionValue896 = regionValue858;
            regionValue898 = regionValue860;
            regionValue899 = regionValue861;
            break region304;
        }
        }
        regionValue915 = regionValue896;
        regionValue917 = regionValue898;
        regionValue918 = regionValue899;
        break region306;
        }
        regionValue818 = regionValue915;
        regionValue820 = regionValue917;
        regionValue821 = regionValue918;
        break region307;
        }
        value919 = recovery$indy$flow$115(value599);
        value920 = recovery$indy$flow$116();
        if (((java.lang.Object) value919) == ((java.lang.Object) value920)) {
            regionValue878 = regionValue818;
            regionValue880 = regionValue821;
            break region341;
        } else {
            regionValue936 = regionValue818;
            regionValue938 = regionValue820;
            regionValue939 = regionValue821;
            break region310;
        }
        }
        value940 = recovery$indy$flow$117();
        value941 = value940;
        value942 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value941))))));
        value943 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value942)))).field_42N));
        initialized944 = new java.lang.StringBuilder();
        value945 = recovery$indy$flow$122(initialized944, " ");
        value946 = recovery$indy$flow$123(regionValue938);
        value947 = recovery$indy$flow$124(value946);
        value948 = recovery$indy$flow$125(value597, value947, value599);
        value949 = recovery$indy$flow$126(value948);
        value950 = recovery$indy$flow$127(value945, value949);
        value951 = recovery$indy$flow$128(value950);
        value952 = recovery$indy$flow$129(value943, value951);
        value953 = value952;
        value954 = recovery$indy$flow$130(regionValue936, value953);
        value955 = value954;
        regionValue878 = value955;
        regionValue880 = regionValue939;
        break region341;
        }
        if (value37 == null) {
            regionValue630 = regionValue880;
            regionValue631 = regionValue878;
            continue loop258;
        } else {
            regionValue971 = regionValue878;
            regionValue973 = regionValue880;
            break region343;
        }
        }
        value974 = recovery$indy$flow$131(value609);
        value975 = ((java.lang.Object)(((augustus.recovered.modules.render.TabList_47H7) (((java.lang.Object)(this)))).settingRowSize));
        value977 = value975;
        value978 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value977))))));
        value979 = recovery$indy$flow$134(value978, computed27);
        converted980 = (int) (value979);
        value981 = recovery$indy$flow$135(value974, converted980);
        value982 = recovery$indy$flow$136(value609, 0, value981);
        if (a2 < 0) {
            regionValue686 = regionValue973;
            regionValue687 = regionValue971;
            regionValue689 = value982;
            continue loop263;
        } else {
            regionValue712 = regionValue973;
            regionValue713 = regionValue971;
            regionValue714 = value982;
            break region365;
        }
        }
        }
        }
        value983 = regionValue714;
        regionValue781 = value983;
        regionValue782 = regionValue713;
        regionValue783 = regionValue712;
        break region366;
        }
        value984 = recovery$indy$flow$137(regionValue781);
        regionValue744 = regionValue781;
        regionValue745 = regionValue783;
        regionValue746 = regionValue782;
        regionValue747 = value984;
        break region368;
        }
        value985 = regionValue747;
        value986 = value985;
        value987 = ((java.lang.Object)(((augustus.recovered.modules.render.TabList_47H7) (((java.lang.Object)(this)))).settingColumnSize));
        value990 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value987))))));
        value991 = recovery$indy$flow$140(value990, computed27);
        converted992 = (int) (value991);
        value994 = 1;
        regionValue1007 = regionValue744;
        regionValue1008 = regionValue745;
        regionValue1009 = regionValue746;
        regionValue1010 = value985;
        regionValue1011 = value986;
        regionValue1013 = value994;
        break region388;
        }
        loop388: while (true) {
        int regionValue1130;
        int regionValue1129;
        int regionValue1127;
        int regionValue1126;
        int regionValue1125;
        java.lang.Object regionValue1124;

        region404: {
        int value1093;
        int regionValue1091;
        int regionValue1089;
        int regionValue1088;
        int regionValue1087;
        java.lang.Object regionValue1086;
        int regionValue1092;

        region401: {
        int incremented1051;
        int regionValue1047;
        int regionValue1046;
        int regionValue1045;
        java.lang.Object regionValue1044;
        int computed1054;
        int regionValue1050;
        int regionValue1048;
        int computed1053;
        int computed1052;

        region391: {
        if (regionValue1011 <= converted992) {
            regionValue1026 = regionValue1007;
            regionValue1027 = regionValue1008;
            regionValue1028 = regionValue1009;
            regionValue1029 = regionValue1010;
            regionValue1030 = regionValue1011;
            regionValue1031 = regionValue1013;
            break region408;
        } else {
            regionValue1044 = regionValue1007;
            regionValue1045 = regionValue1008;
            regionValue1046 = regionValue1009;
            regionValue1047 = regionValue1010;
            regionValue1048 = regionValue1011;
            regionValue1050 = regionValue1013;
            break region391;
        }
        }
        incremented1051 = regionValue1050 + (1);
        computed1052 = regionValue1047 + incremented1051;
        computed1053 = computed1052 - 1;
        computed1054 = computed1053 / incremented1051;
        if (a2 <= 0) {
            regionValue1067 = regionValue1044;
            regionValue1068 = regionValue1045;
            regionValue1069 = regionValue1046;
            regionValue1070 = regionValue1047;
            regionValue1071 = regionValue1048;
            regionValue1072 = incremented1051;
            regionValue1073 = computed1054;
            break region423;
        } else {
            regionValue1086 = regionValue1044;
            regionValue1087 = regionValue1045;
            regionValue1088 = regionValue1046;
            regionValue1089 = regionValue1047;
            regionValue1091 = incremented1051;
            regionValue1092 = computed1054;
            break region401;
        }
        }
        value1093 = regionValue1092;
        if (value37 != null) {
            regionValue1106 = regionValue1086;
            regionValue1107 = regionValue1087;
            regionValue1108 = regionValue1088;
            regionValue1109 = regionValue1089;
            regionValue1110 = regionValue1091;
            regionValue1111 = value1093;
            break region414;
        } else {
            regionValue1124 = regionValue1086;
            regionValue1125 = regionValue1087;
            regionValue1126 = regionValue1088;
            regionValue1127 = regionValue1089;
            regionValue1129 = regionValue1091;
            regionValue1130 = value1093;
            break region404;
        }
        }
        if (value37 == null) {
            regionValue1007 = regionValue1124;
            regionValue1008 = regionValue1125;
            regionValue1009 = regionValue1126;
            regionValue1010 = regionValue1127;
            regionValue1011 = regionValue1130;
            regionValue1013 = regionValue1129;
            continue loop388;
        } else {
            regionValue1143 = regionValue1124;
            regionValue1144 = regionValue1125;
            regionValue1145 = regionValue1126;
            regionValue1146 = regionValue1127;
            regionValue1147 = regionValue1129;
            regionValue1148 = regionValue1130;
            break region406;
        }
        }
        }
        regionValue1026 = regionValue1143;
        regionValue1027 = regionValue1144;
        regionValue1028 = regionValue1145;
        regionValue1029 = regionValue1146;
        regionValue1030 = regionValue1148;
        regionValue1031 = regionValue1147;
        break region408;
        }
        if (a2 <= 0) {
            regionValue1161 = regionValue1026;
            regionValue1162 = regionValue1027;
            regionValue1163 = regionValue1028;
            regionValue1164 = regionValue1029;
            regionValue1165 = regionValue1030;
            regionValue1166 = regionValue1031;
            break region429;
        } else {
            regionValue1180 = regionValue1026;
            regionValue1181 = regionValue1027;
            regionValue1182 = regionValue1028;
            regionValue1183 = regionValue1029;
            regionValue1184 = regionValue1030;
            regionValue1185 = regionValue1031;
            break region411;
        }
        }
        regionValue1106 = regionValue1180;
        regionValue1107 = regionValue1181;
        regionValue1108 = regionValue1182;
        regionValue1109 = regionValue1183;
        regionValue1110 = regionValue1185;
        regionValue1111 = regionValue1184;
        break region414;
        }
        value1187 = recovery$indy$flow$141();
        value1189 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1187))))));
        value1190 = recovery$indy$flow$143(value1189);
        regionValue1067 = regionValue1106;
        regionValue1068 = regionValue1107;
        regionValue1069 = regionValue1108;
        regionValue1070 = regionValue1109;
        regionValue1071 = regionValue1111;
        regionValue1072 = regionValue1110;
        regionValue1073 = (int) ((value1190 ? 1 : 0));
        break region423;
        }
        if (value37 != null) {
            regionValue1203 = regionValue1067;
            regionValue1204 = regionValue1068;
            regionValue1205 = regionValue1069;
            regionValue1206 = regionValue1070;
            regionValue1207 = regionValue1071;
            regionValue1208 = regionValue1072;
            regionValue1209 = regionValue1073;
            break region447;
        } else {
            regionValue1222 = regionValue1067;
            regionValue1223 = regionValue1068;
            regionValue1224 = regionValue1069;
            regionValue1225 = regionValue1070;
            regionValue1226 = regionValue1071;
            regionValue1227 = regionValue1072;
            regionValue1228 = regionValue1073;
            break region425;
        }
        }
        if (regionValue1228 != 0) {
            regionValue1241 = regionValue1222;
            regionValue1242 = regionValue1223;
            regionValue1243 = regionValue1224;
            regionValue1244 = regionValue1225;
            regionValue1245 = regionValue1226;
            regionValue1246 = regionValue1227;
            break region446;
        } else {
            regionValue1259 = regionValue1222;
            regionValue1260 = regionValue1223;
            regionValue1261 = regionValue1224;
            regionValue1262 = regionValue1225;
            regionValue1263 = regionValue1226;
            regionValue1264 = regionValue1227;
            break region426;
        }
        }
        regionValue1277 = regionValue1259;
        regionValue1278 = regionValue1260;
        regionValue1279 = regionValue1261;
        regionValue1280 = regionValue1262;
        regionValue1281 = regionValue1263;
        regionValue1282 = regionValue1264;
        break region428;
        }
        regionValue1161 = regionValue1277;
        regionValue1162 = regionValue1278;
        regionValue1163 = regionValue1279;
        regionValue1164 = regionValue1280;
        regionValue1165 = regionValue1281;
        regionValue1166 = regionValue1282;
        break region429;
        }
        value1283 = recovery$indy$flow$144();
        value1285 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1283))))));
        value1286 = recovery$indy$flow$146(value1285);
        value1287 = recovery$indy$flow$147(value1286);
        value1288 = recovery$indy$flow$148(value1287);
        if (value37 != null) {
            regionValue1203 = regionValue1161;
            regionValue1204 = regionValue1162;
            regionValue1205 = regionValue1163;
            regionValue1206 = regionValue1164;
            regionValue1207 = regionValue1165;
            regionValue1208 = regionValue1166;
            regionValue1209 = (int) ((value1288 ? 1 : 0));
            break region447;
        } else {
            regionValue1301 = regionValue1161;
            regionValue1302 = regionValue1162;
            regionValue1303 = regionValue1163;
            regionValue1304 = regionValue1164;
            regionValue1305 = regionValue1165;
            regionValue1306 = regionValue1166;
            regionValue1307 = (int) ((value1288 ? 1 : 0));
            break region443;
        }
        }
        if (regionValue1307 == 0) {
            regionValue1320 = regionValue1301;
            regionValue1321 = regionValue1302;
            regionValue1322 = regionValue1303;
            regionValue1323 = regionValue1304;
            regionValue1324 = regionValue1305;
            regionValue1325 = regionValue1306;
            break region448;
        } else {
            regionValue1338 = regionValue1301;
            regionValue1339 = regionValue1302;
            regionValue1340 = regionValue1303;
            regionValue1341 = regionValue1304;
            regionValue1342 = regionValue1305;
            regionValue1343 = regionValue1306;
            break region444;
        }
        }
        regionValue1241 = regionValue1338;
        regionValue1242 = regionValue1339;
        regionValue1243 = regionValue1340;
        regionValue1244 = regionValue1341;
        regionValue1245 = regionValue1342;
        regionValue1246 = regionValue1343;
        break region446;
        }
        regionValue1203 = regionValue1241;
        regionValue1204 = regionValue1242;
        regionValue1205 = regionValue1243;
        regionValue1206 = regionValue1244;
        regionValue1207 = regionValue1245;
        regionValue1208 = regionValue1246;
        regionValue1209 = 1;
        break region447;
        }
        regionValue1356 = regionValue1203;
        regionValue1357 = regionValue1204;
        regionValue1358 = regionValue1205;
        regionValue1359 = regionValue1206;
        regionValue1360 = regionValue1207;
        regionValue1361 = regionValue1208;
        regionValue1362 = regionValue1209;
        break region449;
        }
        regionValue1356 = regionValue1320;
        regionValue1357 = regionValue1321;
        regionValue1358 = regionValue1322;
        regionValue1359 = regionValue1323;
        regionValue1360 = regionValue1324;
        regionValue1361 = regionValue1325;
        regionValue1362 = 0;
        break region449;
        }
        if (value37 != null) {
            regionValue1376 = regionValue1356;
            regionValue1377 = regionValue1357;
            regionValue1378 = regionValue1358;
            regionValue1379 = regionValue1359;
            regionValue1380 = regionValue1360;
            regionValue1381 = regionValue1361;
            break region457;
        } else {
            regionValue1396 = regionValue1356;
            regionValue1397 = regionValue1357;
            regionValue1398 = regionValue1358;
            regionValue1399 = regionValue1359;
            regionValue1400 = regionValue1360;
            regionValue1401 = regionValue1361;
            break region453;
        }
        }
        if (value599 == null) {
            regionValue1416 = regionValue1396;
            regionValue1417 = regionValue1397;
            regionValue1418 = regionValue1399;
            regionValue1419 = regionValue1400;
            regionValue1420 = regionValue1401;
            break region476;
        } else {
            regionValue1434 = regionValue1396;
            regionValue1435 = regionValue1397;
            regionValue1436 = regionValue1398;
            regionValue1437 = regionValue1399;
            regionValue1438 = regionValue1400;
            regionValue1439 = regionValue1401;
            break region454;
        }
        }
        regionValue1453 = regionValue1434;
        regionValue1454 = regionValue1435;
        regionValue1455 = regionValue1436;
        regionValue1456 = regionValue1437;
        regionValue1457 = regionValue1438;
        regionValue1458 = regionValue1439;
        break region456;
        }
        regionValue1376 = regionValue1453;
        regionValue1377 = regionValue1454;
        regionValue1378 = regionValue1455;
        regionValue1379 = regionValue1456;
        regionValue1380 = regionValue1457;
        regionValue1381 = regionValue1458;
        break region457;
        }
        value1460 = recovery$indy$flow$149(value599);
        value1461 = recovery$indy$flow$150();
        if (((java.lang.Object) value1460) != ((java.lang.Object) value1461)) {
            regionValue1474 = regionValue1376;
            regionValue1475 = regionValue1377;
            regionValue1476 = regionValue1378;
            regionValue1477 = regionValue1379;
            regionValue1478 = regionValue1380;
            regionValue1479 = regionValue1381;
            break region468;
        } else {
            regionValue1493 = regionValue1376;
            regionValue1494 = regionValue1377;
            regionValue1495 = regionValue1378;
            regionValue1496 = regionValue1379;
            regionValue1497 = regionValue1380;
            regionValue1498 = regionValue1381;
            break region460;
        }
        }
        value1500 = 90;
        if (a2 < 0) {
            regionValue1513 = regionValue1493;
            regionValue1514 = regionValue1494;
            regionValue1515 = regionValue1496;
            regionValue1516 = regionValue1497;
            regionValue1517 = regionValue1498;
            regionValue1519 = value1500;
            break region475;
        } else {
            regionValue1533 = regionValue1493;
            regionValue1534 = regionValue1494;
            regionValue1535 = regionValue1495;
            regionValue1536 = regionValue1496;
            regionValue1537 = regionValue1497;
            regionValue1538 = regionValue1498;
            break region465;
        }
        }
        if (value37 == null) {
            regionValue1554 = regionValue1533;
            regionValue1555 = regionValue1534;
            regionValue1556 = regionValue1536;
            regionValue1557 = regionValue1537;
            regionValue1558 = regionValue1538;
            regionValue1560 = value1500;
            break region478;
        } else {
            regionValue1573 = regionValue1533;
            regionValue1574 = regionValue1534;
            regionValue1575 = regionValue1535;
            regionValue1576 = regionValue1536;
            regionValue1577 = regionValue1537;
            regionValue1578 = regionValue1538;
            break region466;
        }
        }
        regionValue1474 = regionValue1573;
        regionValue1475 = regionValue1574;
        regionValue1476 = regionValue1575;
        regionValue1477 = regionValue1576;
        regionValue1478 = regionValue1577;
        regionValue1479 = regionValue1578;
        break region468;
        }
        if (a0 < 0) {
            regionValue1592 = regionValue1474;
            regionValue1593 = regionValue1475;
            regionValue1594 = regionValue1477;
            regionValue1595 = regionValue1478;
            regionValue1596 = regionValue1479;
            regionValue1598 = regionValue1476;
            break region477;
        } else {
            regionValue1611 = regionValue1474;
            regionValue1612 = regionValue1475;
            regionValue1613 = regionValue1477;
            regionValue1614 = regionValue1478;
            regionValue1615 = regionValue1479;
            regionValue1617 = regionValue1476;
            break region471;
        }
        }
        regionValue1630 = regionValue1611;
        regionValue1631 = regionValue1612;
        regionValue1632 = regionValue1613;
        regionValue1633 = regionValue1614;
        regionValue1634 = regionValue1615;
        regionValue1636 = regionValue1617;
        break region473;
        }
        value1637 = regionValue1636;
        regionValue1513 = regionValue1630;
        regionValue1514 = regionValue1631;
        regionValue1515 = regionValue1632;
        regionValue1516 = regionValue1633;
        regionValue1517 = regionValue1634;
        regionValue1519 = value1637;
        break region475;
        }
        if (value37 == null) {
            regionValue1554 = regionValue1513;
            regionValue1555 = regionValue1514;
            regionValue1556 = regionValue1515;
            regionValue1557 = regionValue1516;
            regionValue1558 = regionValue1517;
            regionValue1560 = regionValue1519;
            break region478;
        } else {
            regionValue1416 = regionValue1513;
            regionValue1417 = regionValue1514;
            regionValue1418 = regionValue1515;
            regionValue1419 = regionValue1516;
            regionValue1420 = regionValue1517;
            break region476;
        }
        }
        regionValue1592 = regionValue1416;
        regionValue1593 = regionValue1417;
        regionValue1594 = regionValue1418;
        regionValue1595 = regionValue1419;
        regionValue1596 = regionValue1420;
        regionValue1598 = 0;
        break region477;
        }
        regionValue1554 = regionValue1592;
        regionValue1555 = regionValue1593;
        regionValue1556 = regionValue1594;
        regionValue1557 = regionValue1595;
        regionValue1558 = regionValue1596;
        regionValue1560 = regionValue1598;
        break region478;
        }
        if (value37 != null) {
            regionValue1651 = regionValue1554;
            regionValue1652 = regionValue1555;
            regionValue1653 = regionValue1556;
            regionValue1654 = regionValue1557;
            regionValue1655 = regionValue1558;
            regionValue1657 = regionValue1560;
            regionValue1658 = regionValue1558;
            regionValue1659 = regionValue1362;
            break region486;
        } else {
            regionValue1672 = regionValue1554;
            regionValue1673 = regionValue1555;
            regionValue1674 = regionValue1556;
            regionValue1675 = regionValue1557;
            regionValue1676 = regionValue1558;
            regionValue1678 = regionValue1560;
            regionValue1679 = regionValue1558;
            break region482;
        }
        }
        if (regionValue1362 == 0) {
            regionValue1693 = regionValue1672;
            regionValue1694 = regionValue1673;
            regionValue1695 = regionValue1674;
            regionValue1696 = regionValue1675;
            regionValue1697 = regionValue1676;
            regionValue1699 = regionValue1678;
            regionValue1700 = regionValue1679;
            break region487;
        } else {
            regionValue1713 = regionValue1672;
            regionValue1714 = regionValue1673;
            regionValue1715 = regionValue1674;
            regionValue1716 = regionValue1675;
            regionValue1717 = regionValue1676;
            regionValue1719 = regionValue1678;
            regionValue1720 = regionValue1679;
            break region483;
        }
        }
        regionValue1733 = regionValue1713;
        regionValue1734 = regionValue1714;
        regionValue1735 = regionValue1715;
        regionValue1736 = regionValue1716;
        regionValue1737 = regionValue1717;
        regionValue1739 = regionValue1719;
        regionValue1740 = regionValue1720;
        break region485;
        }
        regionValue1651 = regionValue1733;
        regionValue1652 = regionValue1734;
        regionValue1653 = regionValue1735;
        regionValue1654 = regionValue1736;
        regionValue1655 = regionValue1737;
        regionValue1657 = regionValue1739;
        regionValue1658 = regionValue1740;
        regionValue1659 = 9;
        break region486;
        }
        regionValue1753 = regionValue1651;
        regionValue1754 = regionValue1652;
        regionValue1755 = regionValue1653;
        regionValue1756 = regionValue1654;
        regionValue1757 = regionValue1655;
        regionValue1759 = regionValue1657;
        regionValue1760 = regionValue1658;
        regionValue1761 = regionValue1659;
        break region488;
        }
        regionValue1753 = regionValue1693;
        regionValue1754 = regionValue1694;
        regionValue1755 = regionValue1695;
        regionValue1756 = regionValue1696;
        regionValue1757 = regionValue1697;
        regionValue1759 = regionValue1699;
        regionValue1760 = regionValue1700;
        regionValue1761 = 0;
        break region488;
        }
        computed1762 = regionValue1761 + regionValue1754;
        computed1763 = computed1762 + regionValue1759;
        computed1764 = computed1763 + 13;
        computed1765 = regionValue1760 * computed1764;
        computed1766 = value591 - 50;
        value1767 = recovery$indy$flow$151(computed1765, computed1766);
        computed1768 = value1767 / regionValue1757;
        computed1770 = value591 / 2;
        computed1771 = computed1768 * regionValue1757;
        computed1772 = regionValue1757 - 1;
        computed1773 = computed1772 * 5;
        computed1774 = computed1771 + computed1773;
        computed1775 = computed1774 / 2;
        computed1776 = computed1770 - computed1775;
        value1778 = 10;
        computed1779 = computed1768 * regionValue1757;
        computed1780 = regionValue1757 - 1;
        computed1781 = computed1780 * 5;
        computed1782 = computed1779 + computed1781;
        value1784 = null;
        value1785 = null;
        value1786 = recovery$indy$flow$152();
        value1788 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1786))))));
        value1789 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1788)))).field_42R));
        value1790 = recovery$indy$flow$155(value1789);
        value1791 = recovery$indy$flow$156(value1790);
        value1793 = recovery$indy$flow$157();
        value1795 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1793))))));
        value1796 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1795)))).field_42R));
        value1797 = recovery$indy$flow$160(value1796);
        value1798 = recovery$indy$flow$161(value1797);
        if (value37 != null) {
            regionValue1812 = regionValue1753;
            regionValue1813 = regionValue1754;
            regionValue1814 = regionValue1755;
            regionValue1815 = regionValue1756;
            regionValue1817 = regionValue1759;
            break region568;
        } else {
            regionValue1837 = regionValue1753;
            regionValue1838 = regionValue1754;
            regionValue1839 = regionValue1755;
            regionValue1840 = regionValue1756;
            regionValue1842 = regionValue1759;
            break region560;
        }
        }
        if (value1791 == null) {
            regionValue1863 = regionValue1837;
            regionValue1864 = regionValue1838;
            regionValue1865 = regionValue1839;
            regionValue1866 = regionValue1840;
            regionValue1868 = regionValue1842;
            regionValue1872 = computed1782;
            regionValue1873 = value1784;
            break region618;
        } else {
            regionValue1888 = regionValue1837;
            regionValue1889 = regionValue1838;
            regionValue1890 = regionValue1839;
            regionValue1891 = regionValue1840;
            regionValue1893 = regionValue1842;
            break region562;
        }
        }
        regionValue1913 = regionValue1888;
        regionValue1914 = regionValue1889;
        regionValue1915 = regionValue1890;
        regionValue1916 = regionValue1891;
        regionValue1918 = regionValue1893;
        break region564;
        }
        regionValue1812 = regionValue1913;
        regionValue1813 = regionValue1914;
        regionValue1814 = regionValue1915;
        regionValue1815 = regionValue1916;
        regionValue1817 = regionValue1918;
        break region568;
        }
        value1926 = recovery$indy$flow$162();
        value1928 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1926))))));
        value1929 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1928)))).field_42N));
        value1930 = recovery$indy$flow$165(value1791);
        computed1931 = value591 - 50;
        value1932 = recovery$indy$flow$166(value1929, value1930, computed1931);
        value1934 = recovery$indy$flow$167(value1932);
        regionValue1948 = regionValue1812;
        regionValue1949 = regionValue1813;
        regionValue1950 = regionValue1814;
        regionValue1951 = regionValue1815;
        regionValue1953 = regionValue1817;
        regionValue1957 = computed1782;
        break region587;
        }
        loop587: while (true) {
        int regionValue2020;
        int regionValue2016;
        int regionValue2014;
        int regionValue2013;
        int regionValue2012;
        java.lang.Object regionValue2011;

        region617: {
        int regionValue2100;
        int regionValue2096;
        int regionValue2094;
        int regionValue2093;
        int regionValue2092;
        java.lang.Object regionValue2091;

        region616: {
        int regionValue2074;
        int regionValue2070;
        int regionValue2068;
        int regionValue2067;
        int regionValue2066;
        java.lang.Object regionValue2065;

        region614: {
        int regionValue2047;
        int regionValue2043;
        int regionValue2041;
        int regionValue2040;
        int regionValue2039;
        java.lang.Object regionValue2038;

        region613: {
        int value1998;
        int regionValue1980;
        int regionValue1978;
        int regionValue1977;
        int regionValue1976;
        java.lang.Object regionValue1975;
        int value1997;
        int value1996;
        java.lang.Object value1995;
        java.lang.Object value1994;
        java.lang.Object value1993;
        java.lang.Object value1992;
        java.lang.Object value1991;
        java.lang.Object value1990;
        java.lang.Object value1989;
        int regionValue1984;

        region590: {
        boolean value1962;

        value1962 = recovery$indy$flow$168(value1934);
        if ((int) ((value1962 ? 1 : 0)) == 0) {
            regionValue1863 = regionValue1948;
            regionValue1864 = regionValue1949;
            regionValue1865 = regionValue1950;
            regionValue1866 = regionValue1951;
            regionValue1868 = regionValue1953;
            regionValue1872 = regionValue1957;
            regionValue1873 = value1932;
            break region618;
        } else {
            regionValue1975 = regionValue1948;
            regionValue1976 = regionValue1949;
            regionValue1977 = regionValue1950;
            regionValue1978 = regionValue1951;
            regionValue1980 = regionValue1953;
            regionValue1984 = regionValue1957;
            break region590;
        }
        }
        value1989 = recovery$indy$flow$169(value1934);
        value1990 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value1989))))));
        value1991 = value1990;
        value1992 = recovery$indy$flow$171();
        value1993 = value1992;
        value1994 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1993))))));
        value1995 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1994)))).field_42N));
        value1996 = recovery$indy$flow$174(value1995, value1991);
        value1997 = recovery$indy$flow$175(regionValue1984, value1996);
        value1998 = value1997;
        if (a2 < 0) {
            regionValue2011 = regionValue1975;
            regionValue2012 = regionValue1976;
            regionValue2013 = regionValue1977;
            regionValue2014 = regionValue1978;
            regionValue2016 = regionValue1980;
            regionValue2020 = value1998;
            break region617;
        } else {
            regionValue2038 = regionValue1975;
            regionValue2039 = regionValue1976;
            regionValue2040 = regionValue1977;
            regionValue2041 = regionValue1978;
            regionValue2043 = regionValue1980;
            regionValue2047 = value1998;
            break region613;
        }
        }
        if (value37 != null) {
            break region1430;
        } else {
            regionValue2065 = regionValue2038;
            regionValue2066 = regionValue2039;
            regionValue2067 = regionValue2040;
            regionValue2068 = regionValue2041;
            regionValue2070 = regionValue2043;
            regionValue2074 = regionValue2047;
            break region614;
        }
        }
        regionValue2091 = regionValue2065;
        regionValue2092 = regionValue2066;
        regionValue2093 = regionValue2067;
        regionValue2094 = regionValue2068;
        regionValue2096 = regionValue2070;
        regionValue2100 = regionValue2074;
        break region616;
        }
        regionValue2011 = regionValue2091;
        regionValue2012 = regionValue2092;
        regionValue2013 = regionValue2093;
        regionValue2014 = regionValue2094;
        regionValue2016 = regionValue2096;
        regionValue2020 = regionValue2100;
        break region617;
        }
        if (value37 == null) {
            regionValue1948 = regionValue2011;
            regionValue1949 = regionValue2012;
            regionValue1950 = regionValue2013;
            regionValue1951 = regionValue2014;
            regionValue1953 = regionValue2016;
            regionValue1957 = regionValue2020;
            continue loop587;
        } else {
            regionValue1863 = regionValue2011;
            regionValue1864 = regionValue2012;
            regionValue1865 = regionValue2013;
            regionValue1866 = regionValue2014;
            regionValue1868 = regionValue2016;
            regionValue1872 = regionValue2020;
            regionValue1873 = value1932;
            break region618;
        }
        }
        }
        if (a2 <= 0) {
            break region1430;
        } else {
            regionValue2117 = regionValue1863;
            regionValue2118 = regionValue1864;
            regionValue2119 = regionValue1865;
            regionValue2120 = regionValue1866;
            regionValue2122 = regionValue1868;
            regionValue2126 = regionValue1872;
            regionValue2127 = regionValue1873;
            break region620;
        }
        }
        if (value1798 == null) {
            regionValue2142 = regionValue2117;
            regionValue2143 = regionValue2118;
            regionValue2144 = regionValue2119;
            regionValue2145 = regionValue2120;
            regionValue2147 = regionValue2122;
            regionValue2151 = regionValue2126;
            regionValue2152 = regionValue2127;
            regionValue2153 = value1785;
            break region676;
        } else {
            regionValue2166 = regionValue2117;
            regionValue2167 = regionValue2118;
            regionValue2168 = regionValue2119;
            regionValue2169 = regionValue2120;
            regionValue2171 = regionValue2122;
            regionValue2175 = regionValue2126;
            regionValue2176 = regionValue2127;
            break region622;
        }
        }
        regionValue2190 = regionValue2166;
        regionValue2191 = regionValue2167;
        regionValue2192 = regionValue2168;
        regionValue2193 = regionValue2169;
        regionValue2195 = regionValue2171;
        regionValue2199 = regionValue2175;
        regionValue2200 = regionValue2176;
        break region624;
        }
        value2202 = recovery$indy$flow$176();
        value2204 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2202))))));
        value2205 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2204)))).field_42N));
        value2206 = recovery$indy$flow$179(value1798);
        computed2207 = value591 - 50;
        value2208 = recovery$indy$flow$180(value2205, value2206, computed2207);
        value2210 = recovery$indy$flow$181(value2208);
        regionValue2224 = regionValue2190;
        regionValue2225 = regionValue2191;
        regionValue2226 = regionValue2192;
        regionValue2227 = regionValue2193;
        regionValue2229 = regionValue2195;
        regionValue2233 = regionValue2199;
        regionValue2234 = regionValue2200;
        break region645;
        }
        loop645: while (true) {
        int regionValue2365;
        java.lang.Object regionValue2362;
        int regionValue2358;
        int regionValue2356;
        int regionValue2355;
        int regionValue2354;
        java.lang.Object regionValue2353;

        region672: {
        int value2319;
        java.lang.Object regionValue2315;
        int regionValue2311;
        int regionValue2309;
        int regionValue2308;
        int regionValue2307;
        java.lang.Object regionValue2306;
        int regionValue2318;

        region669: {
        int value2271;
        java.lang.Object regionValue2260;
        int regionValue2259;
        int regionValue2255;
        int regionValue2253;
        int regionValue2252;
        int regionValue2251;
        java.lang.Object regionValue2250;
        int value2270;
        java.lang.Object value2269;
        java.lang.Object value2268;
        java.lang.Object value2267;
        java.lang.Object value2266;
        java.lang.Object value2265;
        java.lang.Object value2264;
        java.lang.Object value2263;

        region648: {
        boolean value2237;

        value2237 = recovery$indy$flow$182(value2210);
        if ((int) ((value2237 ? 1 : 0)) == 0) {
            regionValue2142 = regionValue2224;
            regionValue2143 = regionValue2225;
            regionValue2144 = regionValue2226;
            regionValue2145 = regionValue2227;
            regionValue2147 = regionValue2229;
            regionValue2151 = regionValue2233;
            regionValue2152 = regionValue2234;
            regionValue2153 = value2208;
            break region676;
        } else {
            regionValue2250 = regionValue2224;
            regionValue2251 = regionValue2225;
            regionValue2252 = regionValue2226;
            regionValue2253 = regionValue2227;
            regionValue2255 = regionValue2229;
            regionValue2259 = regionValue2233;
            regionValue2260 = regionValue2234;
            break region648;
        }
        }
        value2263 = recovery$indy$flow$183(value2210);
        value2264 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value2263))))));
        value2265 = value2264;
        value2266 = recovery$indy$flow$185();
        value2267 = value2266;
        value2268 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2267))))));
        value2269 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2268)))).field_42N));
        value2270 = recovery$indy$flow$188(value2269, value2265);
        value2271 = recovery$indy$flow$189(regionValue2259, value2270);
        if (a0 < 0) {
            regionValue2281 = regionValue2250;
            regionValue2282 = regionValue2251;
            regionValue2283 = regionValue2252;
            regionValue2284 = regionValue2253;
            regionValue2286 = regionValue2255;
            regionValue2290 = regionValue2259;
            regionValue2291 = regionValue2260;
            regionValue2292 = value2208;
            regionValue2293 = value2271;
            break region718;
        } else {
            regionValue2306 = regionValue2250;
            regionValue2307 = regionValue2251;
            regionValue2308 = regionValue2252;
            regionValue2309 = regionValue2253;
            regionValue2311 = regionValue2255;
            regionValue2315 = regionValue2260;
            regionValue2318 = value2271;
            break region669;
        }
        }
        value2319 = regionValue2318;
        if (value37 != null) {
            regionValue2329 = regionValue2306;
            regionValue2330 = regionValue2307;
            regionValue2331 = regionValue2308;
            regionValue2332 = regionValue2309;
            regionValue2334 = regionValue2311;
            regionValue2338 = regionValue2315;
            regionValue2339 = value2208;
            regionValue2340 = value2319;
            break region717;
        } else {
            regionValue2353 = regionValue2306;
            regionValue2354 = regionValue2307;
            regionValue2355 = regionValue2308;
            regionValue2356 = regionValue2309;
            regionValue2358 = regionValue2311;
            regionValue2362 = regionValue2315;
            regionValue2365 = value2319;
            break region672;
        }
        }
        if (value37 == null) {
            regionValue2224 = regionValue2353;
            regionValue2225 = regionValue2354;
            regionValue2226 = regionValue2355;
            regionValue2227 = regionValue2356;
            regionValue2229 = regionValue2358;
            regionValue2233 = regionValue2365;
            regionValue2234 = regionValue2362;
            continue loop645;
        } else {
            regionValue2378 = regionValue2353;
            regionValue2379 = regionValue2354;
            regionValue2380 = regionValue2355;
            regionValue2381 = regionValue2356;
            regionValue2383 = regionValue2358;
            regionValue2387 = regionValue2362;
            regionValue2389 = regionValue2365;
            break region674;
        }
        }
        }
        regionValue2142 = regionValue2378;
        regionValue2143 = regionValue2379;
        regionValue2144 = regionValue2380;
        regionValue2145 = regionValue2381;
        regionValue2147 = regionValue2383;
        regionValue2151 = regionValue2389;
        regionValue2152 = regionValue2387;
        regionValue2153 = value2208;
        break region676;
        }
        value2390 = ((java.lang.Object)(((augustus.recovered.modules.render.TabList_47H7) (((java.lang.Object)(this)))).field_44));
        value2393 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(value2390))))));
        value2394 = recovery$indy$flow$192(value2393, computed23);
        value2395 = ((java.lang.Object)(((augustus.recovered.modules.render.TabList_47H7) (((java.lang.Object)(this)))).field_44));
        value2398 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(value2395))))));
        value2399 = recovery$indy$flow$195(value2398, computed33);
        recovery$indy$flow$196(value2394, value2399, computed29);
        if (a2 < 0) {
            regionValue2329 = regionValue2142;
            regionValue2330 = regionValue2143;
            regionValue2331 = regionValue2144;
            regionValue2332 = regionValue2145;
            regionValue2334 = regionValue2147;
            regionValue2338 = regionValue2152;
            regionValue2339 = regionValue2153;
            regionValue2340 = regionValue2151;
            break region717;
        } else {
            regionValue2409 = regionValue2142;
            regionValue2410 = regionValue2143;
            regionValue2411 = regionValue2144;
            regionValue2412 = regionValue2145;
            regionValue2414 = regionValue2147;
            regionValue2418 = regionValue2151;
            regionValue2419 = regionValue2152;
            regionValue2420 = regionValue2153;
            break region710;
        }
        }
        recovery$indy$flow$197();
        regionValue2329 = regionValue2409;
        regionValue2330 = regionValue2410;
        regionValue2331 = regionValue2411;
        regionValue2332 = regionValue2412;
        regionValue2334 = regionValue2414;
        regionValue2338 = regionValue2419;
        regionValue2339 = regionValue2420;
        regionValue2340 = regionValue2418;
        break region717;
        }
        regionValue2281 = regionValue2329;
        regionValue2282 = regionValue2330;
        regionValue2283 = regionValue2331;
        regionValue2284 = regionValue2332;
        regionValue2286 = regionValue2334;
        regionValue2290 = regionValue2340;
        regionValue2291 = regionValue2338;
        regionValue2292 = regionValue2339;
        regionValue2293 = regionValue2340;
        break region718;
        }
        value2421 = regionValue2293;
        value2423 = regionValue2284;
        value2424 = regionValue2292;
        value2425 = regionValue2291;
        value2426 = regionValue2291;
        if (a3 < 0) {
            regionValue2435 = regionValue2281;
            regionValue2436 = regionValue2282;
            regionValue2437 = regionValue2283;
            regionValue2438 = regionValue2284;
            regionValue2440 = regionValue2286;
            regionValue2443 = value1778;
            regionValue2444 = regionValue2290;
            regionValue2445 = regionValue2292;
            regionValue2446 = 0;
            break region919;
        } else {
            regionValue2456 = regionValue2281;
            regionValue2457 = regionValue2282;
            regionValue2458 = regionValue2283;
            regionValue2459 = regionValue2284;
            regionValue2461 = regionValue2286;
            regionValue2465 = regionValue2290;
            regionValue2466 = regionValue2291;
            regionValue2467 = regionValue2292;
            regionValue2468 = value2421;
            regionValue2470 = value2423;
            regionValue2471 = value2424;
            regionValue2472 = value2425;
            regionValue2473 = value2426;
            regionValue2474 = 0;
            break region732;
        }
        }
        value2475 = recovery$indy$flow$198(this, value591, regionValue2468, value1778, regionValue2470, regionValue2471, regionValue2472, computed1776, computed1768, regionValue2458, regionValue2473);
        value2479 = ((java.lang.Object)(((net.C_47Fw) (((java.lang.Object)(value2475))))));
        recovery$indy$flow$200(((regionValue2474 & 1) != 0), computed35, value2479);
        if (value37 != null) {
            regionValue2488 = regionValue2456;
            regionValue2489 = regionValue2457;
            regionValue2490 = regionValue2458;
            regionValue2491 = regionValue2459;
            regionValue2493 = regionValue2461;
            regionValue2496 = value1778;
            regionValue2497 = regionValue2465;
            regionValue2498 = regionValue2467;
            break region918;
        } else {
            regionValue2507 = regionValue2456;
            regionValue2508 = regionValue2457;
            regionValue2509 = regionValue2458;
            regionValue2510 = regionValue2459;
            regionValue2512 = regionValue2461;
            regionValue2516 = regionValue2465;
            regionValue2517 = regionValue2466;
            regionValue2518 = regionValue2467;
            break region761;
        }
        }
        regionValue2527 = regionValue2507;
        regionValue2528 = regionValue2508;
        regionValue2529 = regionValue2509;
        regionValue2530 = regionValue2510;
        regionValue2532 = regionValue2512;
        regionValue2536 = regionValue2516;
        regionValue2537 = regionValue2517;
        regionValue2538 = regionValue2518;
        break region763;
        }
        if (a0 <= 0) {
            regionValue2547 = regionValue2527;
            regionValue2548 = regionValue2528;
            regionValue2549 = regionValue2529;
            regionValue2550 = regionValue2530;
            regionValue2552 = regionValue2532;
            regionValue2556 = regionValue2536;
            regionValue2557 = regionValue2538;
            regionValue2558 = regionValue2537;
            break region814;
        } else {
            regionValue2567 = regionValue2527;
            regionValue2568 = regionValue2528;
            regionValue2569 = regionValue2529;
            regionValue2570 = regionValue2530;
            regionValue2572 = regionValue2532;
            regionValue2576 = regionValue2536;
            regionValue2577 = regionValue2537;
            regionValue2578 = regionValue2538;
            regionValue2579 = regionValue2537;
            break region766;
        }
        }
        regionValue2588 = regionValue2567;
        regionValue2589 = regionValue2568;
        regionValue2590 = regionValue2569;
        regionValue2591 = regionValue2570;
        regionValue2593 = regionValue2572;
        regionValue2597 = regionValue2576;
        regionValue2598 = regionValue2577;
        regionValue2599 = regionValue2578;
        regionValue2600 = regionValue2579;
        break region768;
        }
        if (regionValue2600 == null) {
            regionValue2609 = regionValue2588;
            regionValue2610 = regionValue2589;
            regionValue2611 = regionValue2590;
            regionValue2612 = regionValue2591;
            regionValue2614 = regionValue2593;
            regionValue2617 = value1778;
            regionValue2618 = regionValue2597;
            regionValue2619 = regionValue2599;
            break region890;
        } else {
            regionValue2628 = regionValue2588;
            regionValue2629 = regionValue2589;
            regionValue2630 = regionValue2590;
            regionValue2631 = regionValue2591;
            regionValue2633 = regionValue2593;
            regionValue2637 = regionValue2597;
            regionValue2638 = regionValue2598;
            regionValue2639 = regionValue2599;
            break region769;
        }
        }
        regionValue2648 = regionValue2628;
        regionValue2649 = regionValue2629;
        regionValue2650 = regionValue2630;
        regionValue2651 = regionValue2631;
        regionValue2653 = regionValue2633;
        regionValue2657 = regionValue2637;
        regionValue2658 = regionValue2638;
        regionValue2659 = regionValue2639;
        break region771;
        }
        computed2660 = value591 / 2;
        computed2661 = regionValue2657 / 2;
        computed2662 = computed2660 - computed2661;
        computed2663 = computed2662 - 1;
        computed2664 = value1778 - 1;
        computed2665 = value591 / 2;
        computed2666 = regionValue2657 / 2;
        computed2667 = computed2665 + computed2666;
        computed2668 = computed2667 + 1;
        value2669 = recovery$indy$flow$201(regionValue2658);
        value2670 = recovery$indy$flow$202();
        value2672 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2670))))));
        value2673 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2672)))).field_42N));
        value2674 = recovery$indy$flow$205(value2673);
        computed2675 = value2669 * value2674;
        computed2676 = value1778 + computed2675;
        recovery$indy$flow$206(computed2663, computed2664, computed2668, computed2676, -2147483648);
        regionValue2547 = regionValue2648;
        regionValue2548 = regionValue2649;
        regionValue2549 = regionValue2650;
        regionValue2550 = regionValue2651;
        regionValue2552 = regionValue2653;
        regionValue2556 = regionValue2657;
        regionValue2557 = regionValue2659;
        regionValue2558 = regionValue2658;
        break region814;
        }
        value2677 = recovery$indy$flow$207(regionValue2558);
        regionValue2687 = regionValue2547;
        regionValue2688 = regionValue2548;
        regionValue2689 = regionValue2549;
        regionValue2690 = regionValue2550;
        regionValue2692 = regionValue2552;
        regionValue2695 = value1778;
        regionValue2696 = regionValue2556;
        regionValue2697 = regionValue2557;
        break region816;
        }
        loop816: while (true) {
        java.lang.Object regionValue2783;
        int regionValue2782;
        int regionValue2781;
        int regionValue2778;
        int regionValue2776;
        int regionValue2775;
        int regionValue2774;
        java.lang.Object regionValue2773;

        region884: {
        java.lang.Object regionValue2845;
        int regionValue2844;
        int regionValue2843;
        int regionValue2840;
        int regionValue2838;
        int regionValue2837;
        int regionValue2836;
        java.lang.Object regionValue2835;

        region883: {
        java.lang.Object regionValue2825;
        int regionValue2824;
        int regionValue2823;
        int regionValue2820;
        int regionValue2818;
        int regionValue2817;
        int regionValue2816;
        java.lang.Object regionValue2815;

        region881: {
        java.lang.Object regionValue2804;
        int regionValue2803;
        int regionValue2802;
        int regionValue2799;
        int regionValue2797;
        int regionValue2796;
        int regionValue2795;
        java.lang.Object regionValue2794;

        region880: {
        int value2764;
        java.lang.Object value2741;
        java.lang.Object regionValue2737;
        int regionValue2736;
        int regionValue2735;
        int regionValue2732;
        int regionValue2730;
        int regionValue2729;
        int regionValue2728;
        java.lang.Object regionValue2727;
        int value2762;
        java.lang.Object value2761;
        java.lang.Object value2760;
        java.lang.Object value2759;
        java.lang.Object value2758;
        java.lang.Object value2751;
        java.lang.Object value2750;
        java.lang.Object value2749;
        java.lang.Object value2748;
        int value2747;
        int value2746;
        java.lang.Object value2745;
        java.lang.Object value2744;
        java.lang.Object value2743;
        java.lang.Object value2742;
        java.lang.Object value2740;
        java.lang.Object value2739;
        float converted2756;
        float converted2755;
        int computed2763;
        int computed2754;
        int computed2753;
        int computed2752;
        int value2757;

        region819: {
        boolean value2699;

        value2699 = recovery$indy$flow$208(value2677);
        if ((int) ((value2699 ? 1 : 0)) == 0) {
            regionValue2708 = regionValue2687;
            regionValue2709 = regionValue2688;
            regionValue2710 = regionValue2689;
            regionValue2711 = regionValue2690;
            regionValue2713 = regionValue2692;
            regionValue2716 = regionValue2695;
            regionValue2717 = regionValue2696;
            regionValue2718 = regionValue2697;
            break region885;
        } else {
            regionValue2727 = regionValue2687;
            regionValue2728 = regionValue2688;
            regionValue2729 = regionValue2689;
            regionValue2730 = regionValue2690;
            regionValue2732 = regionValue2692;
            regionValue2735 = regionValue2695;
            regionValue2736 = regionValue2696;
            regionValue2737 = regionValue2697;
            break region819;
        }
        }
        value2739 = recovery$indy$flow$209(value2677);
        value2740 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value2739))))));
        value2741 = value2740;
        value2742 = recovery$indy$flow$211();
        value2743 = value2742;
        value2744 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2743))))));
        value2745 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2744)))).field_42N));
        value2746 = recovery$indy$flow$214(value2745, value2741);
        value2747 = value2746;
        value2748 = recovery$indy$flow$215();
        value2749 = value2748;
        value2750 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2749))))));
        value2751 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2750)))).field_42N));
        computed2752 = value591 / 2;
        computed2753 = value2747 / 2;
        computed2754 = computed2752 - computed2753;
        converted2755 = (float) (computed2754);
        converted2756 = (float) (regionValue2735);
        value2757 = recovery$indy$flow$218(value2751, value2741, converted2755, converted2756, -1);
        value2758 = recovery$indy$flow$219();
        value2759 = value2758;
        value2760 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2759))))));
        value2761 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2760)))).field_42N));
        value2762 = recovery$indy$flow$222(value2761);
        computed2763 = regionValue2735 + value2762;
        value2764 = computed2763;
        if (a3 < 0) {
            regionValue2773 = regionValue2727;
            regionValue2774 = regionValue2728;
            regionValue2775 = regionValue2729;
            regionValue2776 = regionValue2730;
            regionValue2778 = regionValue2732;
            regionValue2781 = value2764;
            regionValue2782 = regionValue2736;
            regionValue2783 = regionValue2737;
            break region884;
        } else {
            regionValue2794 = regionValue2727;
            regionValue2795 = regionValue2728;
            regionValue2796 = regionValue2729;
            regionValue2797 = regionValue2730;
            regionValue2799 = regionValue2732;
            regionValue2802 = value2764;
            regionValue2803 = regionValue2736;
            regionValue2804 = regionValue2737;
            break region880;
        }
        }
        if (value37 != null) {
            regionValue2488 = regionValue2794;
            regionValue2489 = regionValue2795;
            regionValue2490 = regionValue2796;
            regionValue2491 = regionValue2797;
            regionValue2493 = regionValue2799;
            regionValue2496 = regionValue2802;
            regionValue2497 = regionValue2803;
            regionValue2498 = regionValue2804;
            break region918;
        } else {
            regionValue2815 = regionValue2794;
            regionValue2816 = regionValue2795;
            regionValue2817 = regionValue2796;
            regionValue2818 = regionValue2797;
            regionValue2820 = regionValue2799;
            regionValue2823 = regionValue2802;
            regionValue2824 = regionValue2803;
            regionValue2825 = regionValue2804;
            break region881;
        }
        }
        regionValue2835 = regionValue2815;
        regionValue2836 = regionValue2816;
        regionValue2837 = regionValue2817;
        regionValue2838 = regionValue2818;
        regionValue2840 = regionValue2820;
        regionValue2843 = regionValue2823;
        regionValue2844 = regionValue2824;
        regionValue2845 = regionValue2825;
        break region883;
        }
        regionValue2773 = regionValue2835;
        regionValue2774 = regionValue2836;
        regionValue2775 = regionValue2837;
        regionValue2776 = regionValue2838;
        regionValue2778 = regionValue2840;
        regionValue2781 = regionValue2843;
        regionValue2782 = regionValue2844;
        regionValue2783 = regionValue2845;
        break region884;
        }
        if (value37 == null) {
            regionValue2687 = regionValue2773;
            regionValue2688 = regionValue2774;
            regionValue2689 = regionValue2775;
            regionValue2690 = regionValue2776;
            regionValue2692 = regionValue2778;
            regionValue2695 = regionValue2781;
            regionValue2696 = regionValue2782;
            regionValue2697 = regionValue2783;
            continue loop816;
        } else {
            regionValue2708 = regionValue2773;
            regionValue2709 = regionValue2774;
            regionValue2710 = regionValue2775;
            regionValue2711 = regionValue2776;
            regionValue2713 = regionValue2778;
            regionValue2716 = regionValue2781;
            regionValue2717 = regionValue2782;
            regionValue2718 = regionValue2783;
            break region885;
        }
        }
        }
        if (a3 <= 0) {
            regionValue2488 = regionValue2708;
            regionValue2489 = regionValue2709;
            regionValue2490 = regionValue2710;
            regionValue2491 = regionValue2711;
            regionValue2493 = regionValue2713;
            regionValue2496 = regionValue2716;
            regionValue2497 = regionValue2717;
            regionValue2498 = regionValue2718;
            break region918;
        } else {
            regionValue2855 = regionValue2708;
            regionValue2856 = regionValue2709;
            regionValue2857 = regionValue2710;
            regionValue2858 = regionValue2711;
            regionValue2860 = regionValue2713;
            regionValue2863 = regionValue2716;
            regionValue2864 = regionValue2717;
            regionValue2865 = regionValue2718;
            break region887;
        }
        }
        incremented2866 = regionValue2863 + (1);
        regionValue2609 = regionValue2855;
        regionValue2610 = regionValue2856;
        regionValue2611 = regionValue2857;
        regionValue2612 = regionValue2858;
        regionValue2614 = regionValue2860;
        regionValue2617 = incremented2866;
        regionValue2618 = regionValue2864;
        regionValue2619 = regionValue2865;
        break region890;
        }
        computed2867 = value591 / 2;
        computed2868 = regionValue2618 / 2;
        computed2869 = computed2867 - computed2868;
        computed2870 = computed2869 - 1;
        computed2871 = regionValue2617 - 1;
        computed2872 = value591 / 2;
        computed2873 = regionValue2618 / 2;
        computed2874 = computed2872 + computed2873;
        computed2875 = computed2874 + 1;
        computed2876 = regionValue2612 * 9;
        computed2877 = regionValue2617 + computed2876;
        recovery$indy$flow$223(computed2870, computed2871, computed2875, computed2877, -2147483648);
        regionValue2488 = regionValue2609;
        regionValue2489 = regionValue2610;
        regionValue2490 = regionValue2611;
        regionValue2491 = regionValue2612;
        regionValue2493 = regionValue2614;
        regionValue2496 = regionValue2617;
        regionValue2497 = regionValue2618;
        regionValue2498 = regionValue2619;
        break region918;
        }
        regionValue2435 = regionValue2488;
        regionValue2436 = regionValue2489;
        regionValue2437 = regionValue2490;
        regionValue2438 = regionValue2491;
        regionValue2440 = regionValue2493;
        regionValue2443 = regionValue2496;
        regionValue2444 = regionValue2497;
        regionValue2445 = regionValue2498;
        regionValue2446 = 0;
        break region919;
        }
        regionValue2887 = regionValue2435;
        regionValue2888 = regionValue2436;
        regionValue2889 = regionValue2437;
        regionValue2890 = regionValue2438;
        regionValue2892 = regionValue2440;
        regionValue2895 = regionValue2443;
        regionValue2896 = regionValue2444;
        regionValue2897 = regionValue2445;
        regionValue2898 = regionValue2446;
        break region920;
        }
        loop920: while (true) {
        java.lang.Object regionValue2961;
        int regionValue2960;
        int regionValue2959;
        int regionValue2954;
        int regionValue2962;
        int regionValue2956;
        int regionValue2953;
        int regionValue2952;
        java.lang.Object regionValue2951;

        region1293: {
        int regionValue3006;
        java.lang.Object regionValue3005;
        int regionValue3004;
        int regionValue3003;
        int regionValue3000;
        int regionValue2998;
        int regionValue2997;
        int regionValue2996;
        java.lang.Object regionValue2995;

        region1292: {
        int regionValue3130;
        java.lang.Object regionValue3129;
        int regionValue3128;
        int regionValue3127;
        int regionValue3124;
        int regionValue3122;
        int regionValue3121;
        int regionValue3120;
        java.lang.Object regionValue3119;
        int incremented5315;

        region1291: {
        int regionValue5313;
        int regionValue5312;
        java.lang.Object regionValue5310;
        java.lang.Object regionValue5309;
        int regionValue5308;
        int regionValue5307;
        java.lang.Object regionValue5306;
        int regionValue5305;
        int regionValue5304;
        int regionValue5301;
        int regionValue5299;
        int regionValue5298;
        int regionValue5297;
        java.lang.Object regionValue5296;
        int computed5314;

        region1287: {
        int regionValue5237;
        java.lang.Object regionValue5235;
        java.lang.Object regionValue5234;
        int regionValue5233;
        int regionValue5232;
        java.lang.Object regionValue5231;
        int regionValue5230;
        int regionValue5229;
        int regionValue5226;
        int regionValue5224;
        int regionValue5223;
        int regionValue5222;
        java.lang.Object regionValue5221;

        region1286: {
        int regionValue5186;
        int regionValue5185;
        java.lang.Object regionValue5183;
        java.lang.Object regionValue5182;
        int regionValue5181;
        int regionValue5180;
        java.lang.Object regionValue5179;
        int regionValue5178;
        int regionValue5177;
        int regionValue5174;
        int regionValue5172;
        int regionValue5171;
        int regionValue5170;
        java.lang.Object regionValue5169;

        region1285: {
        int regionValue5287;
        java.lang.Object regionValue5285;
        java.lang.Object regionValue5284;
        int regionValue5283;
        int regionValue5282;
        java.lang.Object regionValue5281;
        int regionValue5280;
        int regionValue5279;
        int regionValue5276;
        int regionValue5274;
        int regionValue5273;
        int regionValue5272;
        java.lang.Object regionValue5271;

        region1284: {
        int regionValue5262;
        java.lang.Object regionValue5260;
        java.lang.Object regionValue5259;
        int regionValue5258;
        int regionValue5257;
        java.lang.Object regionValue5256;
        int regionValue5255;
        int regionValue5254;
        int regionValue5251;
        int regionValue5249;
        int regionValue5248;
        int regionValue5247;
        java.lang.Object regionValue5246;

        region1282: {
        int regionValue5211;
        java.lang.Object regionValue5209;
        java.lang.Object regionValue5208;
        int regionValue5207;
        int regionValue5206;
        java.lang.Object regionValue5205;
        int regionValue5204;
        int regionValue5203;
        int regionValue5200;
        int regionValue5198;
        int regionValue5197;
        int regionValue5196;
        java.lang.Object regionValue5195;

        region1281: {
        java.lang.Object regionValue5043;
        int regionValue5042;
        int regionValue5041;
        int regionValue5040;
        java.lang.Object regionValue5039;
        int regionValue5038;
        int regionValue5037;
        int regionValue5034;
        int regionValue5032;
        int regionValue5031;
        int regionValue5030;
        java.lang.Object regionValue5029;
        java.lang.Object value5160;
        java.lang.Object value5159;
        java.lang.Object value5158;
        java.lang.Object value5157;
        java.lang.Object value5156;

        region1266: {
        java.lang.Object regionValue5146;
        int regionValue5145;
        java.lang.Object value5155;
        java.lang.Object value5154;
        java.lang.Object value5153;
        java.lang.Object value5152;
        java.lang.Object value5151;
        java.lang.Object value5150;
        int regionValue5149;
        int regionValue5148;
        java.lang.Object regionValue5147;
        int regionValue5144;
        int regionValue5143;
        java.lang.Object regionValue5142;
        int regionValue5141;
        int regionValue5140;
        int regionValue5137;
        int regionValue5135;
        int regionValue5134;
        int regionValue5133;
        java.lang.Object regionValue5132;

        region1246: {
        int value5120;
        int regionValue5114;
        int regionValue5107;
        int regionValue5103;
        int value5122;
        java.lang.Object regionValue5116;
        int regionValue5115;
        int regionValue5113;
        java.lang.Object regionValue5112;
        int regionValue5111;
        int regionValue5110;
        int regionValue5105;
        int regionValue5104;
        java.lang.Object regionValue5102;
        java.lang.Object regionValue5117;
        int computed5123;
        int computed5121;
        int computed5119;
        int computed5118;

        region1231: {
        java.lang.Object regionValue5093;
        java.lang.Object regionValue5092;
        int regionValue5091;
        int regionValue5090;
        int regionValue5089;
        java.lang.Object regionValue5088;
        int regionValue5087;
        int regionValue5086;
        int regionValue5083;
        int regionValue5081;
        int regionValue5080;
        int regionValue5079;
        java.lang.Object regionValue5078;

        region1229: {
        java.lang.Object regionValue5066;
        int regionValue5065;
        int regionValue5064;
        int regionValue5063;
        java.lang.Object regionValue5062;
        int regionValue5061;
        int regionValue5060;
        int regionValue5057;
        int regionValue5055;
        int regionValue5054;
        int regionValue5053;
        java.lang.Object regionValue5052;
        java.lang.Object value5069;
        java.lang.Object value5068;
        java.lang.Object regionValue5067;

        region1225: {
        java.lang.Object regionValue4987;
        int regionValue4986;
        int regionValue4985;
        int regionValue4984;
        java.lang.Object regionValue4983;
        int regionValue4982;
        int regionValue4981;
        int regionValue4978;
        int regionValue4976;
        int regionValue4975;
        int regionValue4974;
        java.lang.Object regionValue4973;
        java.lang.Object regionValue4988;

        region1223: {
        int regionValue4936;
        int regionValue4935;
        java.lang.Object regionValue4939;
        java.lang.Object regionValue4938;
        java.lang.Object regionValue4937;
        int regionValue4934;
        java.lang.Object regionValue4933;
        int regionValue4932;
        int regionValue4931;
        int regionValue4928;
        int regionValue4926;
        int regionValue4925;
        int regionValue4924;
        java.lang.Object regionValue4923;
        java.lang.Object value5017;
        java.lang.Object value5016;
        java.lang.Object value5015;
        java.lang.Object value5014;
        float converted5019;
        float converted5018;
        int value5020;

        region1206: {
        java.lang.Object regionValue4876;
        java.lang.Object regionValue4875;
        java.lang.Object regionValue4874;
        int regionValue4873;
        int regionValue4872;
        int regionValue4871;
        java.lang.Object regionValue4870;
        int regionValue4869;
        int regionValue4868;
        int regionValue4865;
        int regionValue4863;
        int regionValue4862;
        int regionValue4861;
        java.lang.Object regionValue4860;

        region1202: {
        java.lang.Object regionValue5013;
        java.lang.Object regionValue5012;
        java.lang.Object regionValue5011;
        int regionValue5010;
        int regionValue5009;
        int regionValue5008;
        java.lang.Object regionValue5007;
        int regionValue5006;
        int regionValue5005;
        int regionValue5002;
        int regionValue5000;
        int regionValue4999;
        int regionValue4998;
        java.lang.Object regionValue4997;

        region1200: {
        java.lang.Object regionValue4964;
        java.lang.Object regionValue4962;
        int regionValue4961;
        int regionValue4960;
        int regionValue4959;
        java.lang.Object regionValue4958;
        int regionValue4957;
        int regionValue4956;
        int regionValue4953;
        int regionValue4951;
        int regionValue4950;
        int regionValue4949;
        java.lang.Object regionValue4948;
        java.lang.Object regionValue4963;

        region1198: {
        java.lang.Object value4907;
        int regionValue4898;
        int regionValue4897;
        java.lang.Object regionValue4901;
        java.lang.Object regionValue4899;
        int regionValue4896;
        java.lang.Object regionValue4895;
        int regionValue4894;
        int regionValue4893;
        int regionValue4890;
        int regionValue4888;
        int regionValue4887;
        int regionValue4886;
        java.lang.Object regionValue4885;
        java.lang.Object value4911;
        java.lang.Object value4910;
        java.lang.Object value4909;
        java.lang.Object value4908;
        java.lang.Object value4906;
        java.lang.Object value4905;
        java.lang.Object value4904;
        java.lang.Object value4903;
        java.lang.Object regionValue4900;
        java.lang.StringBuilder initialized4902;
        float converted4913;
        float converted4912;
        int value4914;

        region1168: {
        java.lang.Object regionValue3254;
        java.lang.Object regionValue3256;
        java.lang.Object regionValue3255;
        int regionValue3253;
        int regionValue3252;
        int regionValue3251;
        java.lang.Object regionValue3250;
        int regionValue3249;
        int regionValue3248;
        int regionValue3245;
        int regionValue3243;
        int regionValue3242;
        int regionValue3241;
        java.lang.Object regionValue3240;
        java.lang.Object value4851;
        java.lang.Object value4850;

        region1164: {
        java.lang.Object regionValue4351;
        java.lang.Object regionValue4350;
        java.lang.Object regionValue4349;
        int regionValue4348;
        int regionValue4347;
        int regionValue4346;
        java.lang.Object regionValue4345;
        int regionValue4344;
        int regionValue4343;
        int regionValue4340;
        int regionValue4338;
        int regionValue4337;
        int regionValue4336;
        java.lang.Object regionValue4335;
        int incremented4849;

        region1163: {
        int regionValue4839;
        int regionValue4838;
        int regionValue4845;
        int regionValue4844;
        int regionValue4843;
        java.lang.Object regionValue4842;
        java.lang.Object regionValue4841;
        java.lang.Object regionValue4840;
        int regionValue4837;
        java.lang.Object regionValue4836;
        int regionValue4835;
        int regionValue4834;
        int regionValue4831;
        int regionValue4829;
        int regionValue4828;
        int regionValue4827;
        java.lang.Object regionValue4826;
        int value4847;
        float converted4848;
        int computed4846;

        region1149: {
        int regionValue4763;
        int regionValue4762;
        java.lang.Object regionValue4761;
        java.lang.Object regionValue4760;
        java.lang.Object regionValue4759;
        int regionValue4758;
        int regionValue4757;
        int regionValue4756;
        java.lang.Object regionValue4755;
        int regionValue4754;
        int regionValue4753;
        int regionValue4750;
        int regionValue4748;
        int regionValue4747;
        int regionValue4746;
        java.lang.Object regionValue4745;

        region1148: {
        int regionValue4708;
        int regionValue4707;
        int regionValue4706;
        java.lang.Object regionValue4705;
        java.lang.Object regionValue4704;
        java.lang.Object regionValue4703;
        int regionValue4702;
        int regionValue4701;
        int regionValue4700;
        java.lang.Object regionValue4699;
        int regionValue4698;
        int regionValue4697;
        int regionValue4694;
        int regionValue4692;
        int regionValue4691;
        int regionValue4690;
        java.lang.Object regionValue4689;

        region1147: {
        int regionValue4817;
        int regionValue4816;
        java.lang.Object regionValue4815;
        java.lang.Object regionValue4814;
        java.lang.Object regionValue4813;
        int regionValue4812;
        int regionValue4811;
        int regionValue4810;
        java.lang.Object regionValue4809;
        int regionValue4808;
        int regionValue4807;
        int regionValue4804;
        int regionValue4802;
        int regionValue4801;
        int regionValue4800;
        java.lang.Object regionValue4799;

        region1146: {
        int regionValue4790;
        int regionValue4789;
        java.lang.Object regionValue4788;
        java.lang.Object regionValue4787;
        java.lang.Object regionValue4786;
        int regionValue4785;
        int regionValue4784;
        int regionValue4783;
        java.lang.Object regionValue4782;
        int regionValue4781;
        int regionValue4780;
        int regionValue4777;
        int regionValue4775;
        int regionValue4774;
        int regionValue4773;
        java.lang.Object regionValue4772;

        region1144: {
        int regionValue4735;
        int regionValue4734;
        java.lang.Object regionValue4733;
        java.lang.Object regionValue4732;
        java.lang.Object regionValue4731;
        int regionValue4730;
        int regionValue4729;
        int regionValue4728;
        java.lang.Object regionValue4727;
        int regionValue4726;
        int regionValue4725;
        int regionValue4722;
        int regionValue4720;
        int regionValue4719;
        int regionValue4718;
        java.lang.Object regionValue4717;
        int regionValue4736;

        region1143: {
        int regionValue4676;
        java.lang.Object regionValue4675;
        java.lang.Object regionValue4674;
        java.lang.Object regionValue4673;
        int regionValue4672;
        int regionValue4671;
        int regionValue4670;
        java.lang.Object regionValue4669;
        int regionValue4668;
        int regionValue4667;
        int regionValue4664;
        int regionValue4662;
        int regionValue4661;
        int regionValue4660;
        java.lang.Object regionValue4659;
        int value4680;
        int regionValue4678;
        int regionValue4677;
        int computed4679;

        region1137: {
        int regionValue4596;
        int regionValue4595;
        java.lang.Object regionValue4594;
        java.lang.Object regionValue4593;
        java.lang.Object regionValue4592;
        int regionValue4591;
        int regionValue4590;
        int regionValue4589;
        java.lang.Object regionValue4588;
        int regionValue4587;
        int regionValue4586;
        int regionValue4583;
        int regionValue4581;
        int regionValue4580;
        int regionValue4579;
        java.lang.Object regionValue4578;

        region1136: {
        int regionValue4541;
        int regionValue4540;
        int regionValue4539;
        java.lang.Object regionValue4538;
        java.lang.Object regionValue4537;
        java.lang.Object regionValue4536;
        int regionValue4535;
        int regionValue4534;
        int regionValue4533;
        java.lang.Object regionValue4532;
        int regionValue4531;
        int regionValue4530;
        int regionValue4527;
        int regionValue4525;
        int regionValue4524;
        int regionValue4523;
        java.lang.Object regionValue4522;

        region1135: {
        int regionValue4650;
        int regionValue4649;
        java.lang.Object regionValue4648;
        java.lang.Object regionValue4647;
        java.lang.Object regionValue4646;
        int regionValue4645;
        int regionValue4644;
        int regionValue4643;
        java.lang.Object regionValue4642;
        int regionValue4641;
        int regionValue4640;
        int regionValue4637;
        int regionValue4635;
        int regionValue4634;
        int regionValue4633;
        java.lang.Object regionValue4632;

        region1134: {
        int regionValue4623;
        int regionValue4622;
        java.lang.Object regionValue4621;
        java.lang.Object regionValue4620;
        java.lang.Object regionValue4619;
        int regionValue4618;
        int regionValue4617;
        int regionValue4616;
        java.lang.Object regionValue4615;
        int regionValue4614;
        int regionValue4613;
        int regionValue4610;
        int regionValue4608;
        int regionValue4607;
        int regionValue4606;
        java.lang.Object regionValue4605;

        region1132: {
        int regionValue4568;
        int regionValue4567;
        java.lang.Object regionValue4566;
        java.lang.Object regionValue4565;
        java.lang.Object regionValue4564;
        int regionValue4563;
        int regionValue4562;
        int regionValue4561;
        java.lang.Object regionValue4560;
        int regionValue4559;
        int regionValue4558;
        int regionValue4555;
        int regionValue4553;
        int regionValue4552;
        int regionValue4551;
        java.lang.Object regionValue4550;
        int regionValue4569;

        region1131: {
        int regionValue4433;
        int regionValue4434;
        java.lang.Object regionValue4432;
        java.lang.Object regionValue4431;
        java.lang.Object regionValue4430;
        int regionValue4429;
        int regionValue4428;
        int regionValue4427;
        java.lang.Object regionValue4426;
        int regionValue4425;
        int regionValue4424;
        int regionValue4421;
        int regionValue4419;
        int regionValue4418;
        int regionValue4417;
        java.lang.Object regionValue4416;

        region1128: {
        int regionValue4513;
        java.lang.Object regionValue4512;
        java.lang.Object regionValue4511;
        java.lang.Object regionValue4510;
        int regionValue4509;
        int regionValue4508;
        int regionValue4507;
        java.lang.Object regionValue4506;
        int regionValue4505;
        int regionValue4504;
        int regionValue4501;
        int regionValue4499;
        int regionValue4498;
        int regionValue4497;
        java.lang.Object regionValue4496;

        region1127: {
        int regionValue4487;
        java.lang.Object regionValue4486;
        java.lang.Object regionValue4485;
        java.lang.Object regionValue4484;
        int regionValue4483;
        int regionValue4482;
        int regionValue4481;
        java.lang.Object regionValue4480;
        int regionValue4479;
        int regionValue4478;
        int regionValue4475;
        int regionValue4473;
        int regionValue4472;
        int regionValue4471;
        java.lang.Object regionValue4470;

        region1125: {
        java.lang.Object regionValue4459;
        java.lang.Object regionValue4458;
        java.lang.Object regionValue4457;
        int regionValue4456;
        int regionValue4455;
        int regionValue4454;
        java.lang.Object regionValue4453;
        int regionValue4452;
        int regionValue4451;
        int regionValue4448;
        int regionValue4446;
        int regionValue4445;
        int regionValue4444;
        java.lang.Object regionValue4443;
        int regionValue4461;
        int regionValue4460;

        region1124: {
        int regionValue4212;
        int regionValue4211;
        java.lang.Object regionValue4210;
        java.lang.Object regionValue4209;
        java.lang.Object regionValue4208;
        int regionValue4207;
        int regionValue4206;
        int regionValue4205;
        java.lang.Object regionValue4204;
        int regionValue4203;
        int regionValue4202;
        int regionValue4199;
        int regionValue4197;
        int regionValue4196;
        int regionValue4195;
        java.lang.Object regionValue4194;

        region1122: {
        java.lang.Object regionValue4270;
        int regionValue4269;
        java.lang.Object regionValue4268;
        java.lang.Object regionValue4267;
        java.lang.Object regionValue4266;
        int regionValue4265;
        int regionValue4264;
        int regionValue4263;
        java.lang.Object regionValue4262;
        int regionValue4261;
        int regionValue4260;
        int regionValue4257;
        int regionValue4255;
        int regionValue4254;
        int regionValue4253;
        java.lang.Object regionValue4252;
        boolean value4407;
        java.lang.Object value4406;

        region1120: {
        int regionValue4405;
        java.lang.Object regionValue4404;
        java.lang.Object regionValue4403;
        java.lang.Object regionValue4402;
        java.lang.Object regionValue4401;
        int regionValue4400;
        int regionValue4399;
        int regionValue4398;
        java.lang.Object regionValue4397;
        int regionValue4396;
        int regionValue4395;
        int regionValue4392;
        int regionValue4390;
        int regionValue4389;
        int regionValue4388;
        java.lang.Object regionValue4387;

        region1119: {
        int regionValue4378;
        java.lang.Object regionValue4377;
        java.lang.Object regionValue4376;
        java.lang.Object regionValue4375;
        java.lang.Object regionValue4374;
        int regionValue4373;
        int regionValue4372;
        int regionValue4371;
        java.lang.Object regionValue4370;
        int regionValue4369;
        int regionValue4368;
        int regionValue4365;
        int regionValue4363;
        int regionValue4362;
        int regionValue4361;
        java.lang.Object regionValue4360;

        region1117: {
        java.lang.Object regionValue4323;
        java.lang.Object regionValue4322;
        java.lang.Object regionValue4321;
        int regionValue4320;
        int regionValue4319;
        int regionValue4318;
        java.lang.Object regionValue4317;
        int regionValue4316;
        int regionValue4315;
        int regionValue4312;
        int regionValue4310;
        int regionValue4309;
        int regionValue4308;
        java.lang.Object regionValue4307;
        java.lang.Object regionValue4326;
        int regionValue4325;
        java.lang.Object regionValue4324;

        region1116: {
        java.lang.Object regionValue4298;
        int regionValue4297;
        java.lang.Object regionValue4296;
        java.lang.Object regionValue4295;
        java.lang.Object regionValue4294;
        java.lang.Object regionValue4293;
        int regionValue4292;
        int regionValue4291;
        int regionValue4290;
        java.lang.Object regionValue4289;
        int regionValue4288;
        int regionValue4287;
        int regionValue4284;
        int regionValue4282;
        int regionValue4281;
        int regionValue4280;
        java.lang.Object regionValue4279;

        region1114: {
        java.lang.Object regionValue4238;
        int regionValue4234;
        int regionValue4239;
        java.lang.Object regionValue4237;
        java.lang.Object regionValue4236;
        java.lang.Object regionValue4235;
        int regionValue4233;
        int regionValue4232;
        java.lang.Object regionValue4231;
        int regionValue4230;
        int regionValue4229;
        int regionValue4226;
        int regionValue4224;
        int regionValue4223;
        int regionValue4222;
        java.lang.Object regionValue4221;
        int regionValue4242;
        int regionValue4241;
        int regionValue4240;
        float converted4243;

        region1100: {
        int regionValue4174;
        int regionValue4180;
        java.lang.Object regionValue4178;
        java.lang.Object regionValue4177;
        java.lang.Object regionValue4176;
        int regionValue4175;
        int regionValue4173;
        java.lang.Object regionValue4172;
        int regionValue4171;
        int regionValue4170;
        int regionValue4167;
        int regionValue4165;
        int regionValue4164;
        int regionValue4163;
        java.lang.Object regionValue4162;
        int regionValue4183;
        int regionValue4182;
        int regionValue4181;
        java.lang.Object regionValue4179;
        int value4185;
        int computed4184;

        region1095: {
        int regionValue4095;
        int regionValue4094;
        int regionValue4093;
        java.lang.Object regionValue4092;
        java.lang.Object regionValue4091;
        java.lang.Object regionValue4090;
        java.lang.Object regionValue4089;
        int regionValue4088;
        int regionValue4087;
        int regionValue4086;
        java.lang.Object regionValue4085;
        int regionValue4084;
        int regionValue4083;
        int regionValue4080;
        int regionValue4078;
        int regionValue4077;
        int regionValue4076;
        java.lang.Object regionValue4075;

        region1094: {
        int regionValue4036;
        int regionValue4035;
        int regionValue4034;
        int regionValue4033;
        java.lang.Object regionValue4032;
        java.lang.Object regionValue4031;
        java.lang.Object regionValue4030;
        java.lang.Object regionValue4029;
        int regionValue4028;
        int regionValue4027;
        int regionValue4026;
        java.lang.Object regionValue4025;
        int regionValue4024;
        int regionValue4023;
        int regionValue4020;
        int regionValue4018;
        int regionValue4017;
        int regionValue4016;
        java.lang.Object regionValue4015;

        region1093: {
        int regionValue4153;
        int regionValue4152;
        int regionValue4151;
        java.lang.Object regionValue4150;
        java.lang.Object regionValue4149;
        java.lang.Object regionValue4148;
        java.lang.Object regionValue4147;
        int regionValue4146;
        int regionValue4145;
        int regionValue4144;
        java.lang.Object regionValue4143;
        int regionValue4142;
        int regionValue4141;
        int regionValue4138;
        int regionValue4136;
        int regionValue4135;
        int regionValue4134;
        java.lang.Object regionValue4133;

        region1092: {
        int regionValue4124;
        int regionValue4123;
        int regionValue4122;
        java.lang.Object regionValue4121;
        java.lang.Object regionValue4120;
        java.lang.Object regionValue4119;
        java.lang.Object regionValue4118;
        int regionValue4117;
        int regionValue4116;
        int regionValue4115;
        java.lang.Object regionValue4114;
        int regionValue4113;
        int regionValue4112;
        int regionValue4109;
        int regionValue4107;
        int regionValue4106;
        int regionValue4105;
        java.lang.Object regionValue4104;

        region1090: {
        int regionValue4065;
        int regionValue4064;
        int regionValue4063;
        java.lang.Object regionValue4062;
        java.lang.Object regionValue4061;
        java.lang.Object regionValue4060;
        java.lang.Object regionValue4059;
        int regionValue4058;
        int regionValue4057;
        int regionValue4056;
        java.lang.Object regionValue4055;
        int regionValue4054;
        int regionValue4053;
        int regionValue4050;
        int regionValue4048;
        int regionValue4047;
        int regionValue4046;
        java.lang.Object regionValue4045;
        int regionValue4066;

        region1089: {
        int regionValue4002;
        java.lang.Object regionValue4001;
        java.lang.Object regionValue4000;
        java.lang.Object regionValue3999;
        java.lang.Object regionValue3998;
        int regionValue3997;
        int regionValue3996;
        int regionValue3995;
        java.lang.Object regionValue3994;
        int regionValue3993;
        int regionValue3992;
        int regionValue3989;
        int regionValue3987;
        int regionValue3986;
        int regionValue3985;
        java.lang.Object regionValue3984;
        int value4006;
        int regionValue4004;
        int regionValue4003;
        int computed4005;

        region1083: {
        int regionValue3919;
        int regionValue3918;
        java.lang.Object regionValue3917;
        java.lang.Object regionValue3916;
        java.lang.Object regionValue3915;
        java.lang.Object regionValue3914;
        int regionValue3913;
        int regionValue3912;
        int regionValue3911;
        java.lang.Object regionValue3910;
        int regionValue3909;
        int regionValue3908;
        int regionValue3905;
        int regionValue3903;
        int regionValue3902;
        int regionValue3901;
        java.lang.Object regionValue3900;

        region1082: {
        int regionValue3862;
        int regionValue3861;
        int regionValue3860;
        java.lang.Object regionValue3859;
        java.lang.Object regionValue3858;
        java.lang.Object regionValue3857;
        java.lang.Object regionValue3856;
        int regionValue3855;
        int regionValue3854;
        int regionValue3853;
        java.lang.Object regionValue3852;
        int regionValue3851;
        int regionValue3850;
        int regionValue3847;
        int regionValue3845;
        int regionValue3844;
        int regionValue3843;
        java.lang.Object regionValue3842;

        region1081: {
        int regionValue3975;
        int regionValue3974;
        java.lang.Object regionValue3973;
        java.lang.Object regionValue3972;
        java.lang.Object regionValue3971;
        java.lang.Object regionValue3970;
        int regionValue3969;
        int regionValue3968;
        int regionValue3967;
        java.lang.Object regionValue3966;
        int regionValue3965;
        int regionValue3964;
        int regionValue3961;
        int regionValue3959;
        int regionValue3958;
        int regionValue3957;
        java.lang.Object regionValue3956;

        region1080: {
        int regionValue3947;
        int regionValue3946;
        java.lang.Object regionValue3945;
        java.lang.Object regionValue3944;
        java.lang.Object regionValue3943;
        java.lang.Object regionValue3942;
        int regionValue3941;
        int regionValue3940;
        int regionValue3939;
        java.lang.Object regionValue3938;
        int regionValue3937;
        int regionValue3936;
        int regionValue3933;
        int regionValue3931;
        int regionValue3930;
        int regionValue3929;
        java.lang.Object regionValue3928;

        region1078: {
        int regionValue3890;
        int regionValue3889;
        java.lang.Object regionValue3888;
        java.lang.Object regionValue3887;
        java.lang.Object regionValue3886;
        java.lang.Object regionValue3885;
        int regionValue3884;
        int regionValue3883;
        int regionValue3882;
        java.lang.Object regionValue3881;
        int regionValue3880;
        int regionValue3879;
        int regionValue3876;
        int regionValue3874;
        int regionValue3873;
        int regionValue3872;
        java.lang.Object regionValue3871;
        int regionValue3891;

        region1077: {
        int value3828;
        java.lang.Object regionValue3823;
        java.lang.Object regionValue3826;
        java.lang.Object regionValue3825;
        java.lang.Object regionValue3824;
        int regionValue3822;
        int regionValue3821;
        int regionValue3820;
        java.lang.Object regionValue3819;
        int regionValue3818;
        int regionValue3817;
        int regionValue3814;
        int regionValue3812;
        int regionValue3811;
        int regionValue3810;
        java.lang.Object regionValue3809;
        int regionValue3827;
        java.lang.Object value3833;
        java.lang.Object value3832;
        java.lang.Object value3831;
        java.lang.Object value3830;
        java.lang.Object value3829;

        region1058: {
        java.lang.Object regionValue3393;
        java.lang.Object regionValue3392;
        java.lang.Object regionValue3391;
        java.lang.Object regionValue3390;
        int regionValue3389;
        int regionValue3388;
        int regionValue3387;
        java.lang.Object regionValue3386;
        int regionValue3385;
        int regionValue3384;
        int regionValue3381;
        int regionValue3379;
        int regionValue3378;
        int regionValue3377;
        java.lang.Object regionValue3376;

        region1057: {
        int regionValue3639;
        java.lang.Object regionValue3638;
        java.lang.Object regionValue3637;
        java.lang.Object regionValue3636;
        java.lang.Object regionValue3635;
        int regionValue3634;
        int regionValue3633;
        int regionValue3632;
        java.lang.Object regionValue3631;
        int regionValue3630;
        int regionValue3629;
        int regionValue3626;
        int regionValue3624;
        int regionValue3623;
        int regionValue3622;
        java.lang.Object regionValue3621;

        region1056: {
        java.lang.Object regionValue3692;
        java.lang.Object regionValue3691;
        java.lang.Object regionValue3690;
        java.lang.Object regionValue3689;
        int regionValue3688;
        int regionValue3687;
        int regionValue3686;
        java.lang.Object regionValue3685;
        int regionValue3684;
        int regionValue3683;
        int regionValue3680;
        int regionValue3678;
        int regionValue3677;
        int regionValue3676;
        java.lang.Object regionValue3675;

        region1055: {
        java.lang.Object regionValue3800;
        java.lang.Object regionValue3799;
        java.lang.Object regionValue3798;
        java.lang.Object regionValue3797;
        int regionValue3796;
        int regionValue3795;
        int regionValue3794;
        java.lang.Object regionValue3793;
        int regionValue3792;
        int regionValue3791;
        int regionValue3788;
        int regionValue3786;
        int regionValue3785;
        int regionValue3784;
        java.lang.Object regionValue3783;

        region1053: {
        java.lang.Object regionValue3773;
        java.lang.Object regionValue3772;
        java.lang.Object regionValue3771;
        java.lang.Object regionValue3770;
        int regionValue3769;
        int regionValue3768;
        int regionValue3767;
        java.lang.Object regionValue3766;
        int regionValue3765;
        int regionValue3764;
        int regionValue3761;
        int regionValue3759;
        int regionValue3758;
        int regionValue3757;
        java.lang.Object regionValue3756;
        int regionValue3774;

        region1052: {
        int regionValue3747;
        java.lang.Object regionValue3746;
        java.lang.Object regionValue3745;
        java.lang.Object regionValue3744;
        java.lang.Object regionValue3743;
        int regionValue3742;
        int regionValue3741;
        int regionValue3740;
        java.lang.Object regionValue3739;
        int regionValue3738;
        int regionValue3737;
        int regionValue3734;
        int regionValue3732;
        int regionValue3731;
        int regionValue3730;
        java.lang.Object regionValue3729;

        region1050: {
        java.lang.Object regionValue3717;
        boolean value3720;
        java.lang.Object regionValue3718;
        java.lang.Object regionValue3716;
        java.lang.Object regionValue3715;
        int regionValue3714;
        int regionValue3713;
        int regionValue3712;
        java.lang.Object regionValue3711;
        int regionValue3710;
        int regionValue3709;
        int regionValue3706;
        int regionValue3704;
        int regionValue3703;
        int regionValue3702;
        java.lang.Object regionValue3701;
        java.lang.Object value3719;

        region1044: {
        java.lang.Object regionValue3665;
        java.lang.Object regionValue3664;
        java.lang.Object regionValue3663;
        java.lang.Object regionValue3662;
        int regionValue3661;
        int regionValue3660;
        int regionValue3659;
        java.lang.Object regionValue3658;
        int regionValue3657;
        int regionValue3656;
        int regionValue3653;
        int regionValue3651;
        int regionValue3650;
        int regionValue3649;
        java.lang.Object regionValue3648;
        int regionValue3666;

        region1043: {
        int regionValue3474;
        java.lang.Object regionValue3473;
        java.lang.Object regionValue3472;
        java.lang.Object regionValue3471;
        java.lang.Object regionValue3470;
        int regionValue3469;
        int regionValue3468;
        int regionValue3467;
        java.lang.Object regionValue3466;
        int regionValue3465;
        int regionValue3464;
        int regionValue3461;
        int regionValue3459;
        int regionValue3458;
        int regionValue3457;
        java.lang.Object regionValue3456;

        region1042: {
        int regionValue3530;
        java.lang.Object regionValue3529;
        java.lang.Object regionValue3528;
        java.lang.Object regionValue3527;
        java.lang.Object regionValue3526;
        int regionValue3525;
        int regionValue3524;
        int regionValue3523;
        java.lang.Object regionValue3522;
        int regionValue3521;
        int regionValue3520;
        int regionValue3517;
        int regionValue3515;
        int regionValue3514;
        int regionValue3513;
        java.lang.Object regionValue3512;

        region1041: {
        java.lang.Object regionValue3609;
        boolean value3612;
        java.lang.Object value3611;
        java.lang.Object regionValue3610;
        java.lang.Object regionValue3608;
        java.lang.Object regionValue3607;
        int regionValue3606;
        int regionValue3605;
        int regionValue3604;
        java.lang.Object regionValue3603;
        int regionValue3602;
        int regionValue3601;
        int regionValue3598;
        int regionValue3596;
        int regionValue3595;
        int regionValue3594;
        java.lang.Object regionValue3593;

        region1035: {
        java.lang.Object regionValue3583;
        java.lang.Object regionValue3582;
        java.lang.Object regionValue3581;
        java.lang.Object regionValue3580;
        int regionValue3579;
        int regionValue3578;
        int regionValue3577;
        java.lang.Object regionValue3576;
        int regionValue3575;
        int regionValue3574;
        int regionValue3571;
        int regionValue3569;
        int regionValue3568;
        int regionValue3567;
        java.lang.Object regionValue3566;
        int regionValue3584;

        region1034: {
        int regionValue3557;
        java.lang.Object regionValue3556;
        java.lang.Object regionValue3555;
        java.lang.Object regionValue3554;
        java.lang.Object regionValue3553;
        int regionValue3552;
        int regionValue3551;
        int regionValue3550;
        java.lang.Object regionValue3549;
        int regionValue3548;
        int regionValue3547;
        int regionValue3544;
        int regionValue3542;
        int regionValue3541;
        int regionValue3540;
        java.lang.Object regionValue3539;

        region1032: {
        int regionValue3502;
        java.lang.Object regionValue3501;
        java.lang.Object regionValue3500;
        java.lang.Object regionValue3499;
        java.lang.Object regionValue3498;
        int regionValue3497;
        int regionValue3496;
        int regionValue3495;
        java.lang.Object regionValue3494;
        int regionValue3493;
        int regionValue3492;
        int regionValue3489;
        int regionValue3487;
        int regionValue3486;
        int regionValue3485;
        java.lang.Object regionValue3484;

        region1031: {
        java.lang.Object regionValue3339;
        java.lang.Object regionValue3338;
        java.lang.Object regionValue3337;
        java.lang.Object regionValue3336;
        int regionValue3335;
        int regionValue3334;
        int regionValue3333;
        java.lang.Object regionValue3332;
        int regionValue3331;
        int regionValue3330;
        int regionValue3327;
        int regionValue3325;
        int regionValue3324;
        int regionValue3323;
        java.lang.Object regionValue3322;
        boolean value3447;
        java.lang.Object regionValue3340;
        java.lang.Object value3446;

        region1026: {
        java.lang.Object regionValue3445;
        java.lang.Object regionValue3444;
        java.lang.Object regionValue3443;
        java.lang.Object regionValue3442;
        int regionValue3441;
        int regionValue3440;
        int regionValue3439;
        java.lang.Object regionValue3438;
        int regionValue3437;
        int regionValue3436;
        int regionValue3433;
        int regionValue3431;
        int regionValue3430;
        int regionValue3429;
        java.lang.Object regionValue3428;

        region1025: {
        java.lang.Object regionValue3419;
        java.lang.Object regionValue3418;
        java.lang.Object regionValue3417;
        java.lang.Object regionValue3416;
        int regionValue3415;
        int regionValue3414;
        int regionValue3413;
        java.lang.Object regionValue3412;
        int regionValue3411;
        int regionValue3410;
        int regionValue3407;
        int regionValue3405;
        int regionValue3404;
        int regionValue3403;
        java.lang.Object regionValue3402;

        region1023: {
        java.lang.Object regionValue3366;
        java.lang.Object regionValue3365;
        java.lang.Object regionValue3364;
        java.lang.Object regionValue3363;
        int regionValue3362;
        int regionValue3361;
        int regionValue3360;
        java.lang.Object regionValue3359;
        int regionValue3358;
        int regionValue3357;
        int regionValue3354;
        int regionValue3352;
        int regionValue3351;
        int regionValue3350;
        java.lang.Object regionValue3349;
        java.lang.Object regionValue3367;

        region1022: {
        java.lang.Object value3313;
        java.lang.Object regionValue3206;
        java.lang.Object regionValue3205;
        java.lang.Object regionValue3204;
        int regionValue3203;
        int regionValue3202;
        int regionValue3201;
        java.lang.Object regionValue3200;
        int regionValue3199;
        int regionValue3198;
        int regionValue3195;
        int regionValue3193;
        int regionValue3192;
        int regionValue3191;
        java.lang.Object regionValue3190;
        java.lang.Object value3312;
        java.lang.Object value3311;
        java.lang.Object value3310;
        java.lang.Object value3309;
        java.lang.Object value3308;
        java.lang.Object value3307;

        region1006: {
        java.lang.Object regionValue3306;
        java.lang.Object regionValue3305;
        java.lang.Object regionValue3304;
        int regionValue3303;
        int regionValue3302;
        int regionValue3301;
        java.lang.Object regionValue3300;
        int regionValue3299;
        int regionValue3298;
        int regionValue3295;
        int regionValue3293;
        int regionValue3292;
        int regionValue3291;
        java.lang.Object regionValue3290;

        region1002: {
        java.lang.Object regionValue3281;
        java.lang.Object regionValue3280;
        java.lang.Object regionValue3279;
        int regionValue3278;
        int regionValue3277;
        int regionValue3276;
        java.lang.Object regionValue3275;
        int regionValue3274;
        int regionValue3273;
        int regionValue3270;
        int regionValue3268;
        int regionValue3267;
        int regionValue3266;
        java.lang.Object regionValue3265;

        region1000: {
        java.lang.Object regionValue3231;
        java.lang.Object regionValue3230;
        java.lang.Object regionValue3229;
        int regionValue3228;
        int regionValue3227;
        int regionValue3226;
        java.lang.Object regionValue3225;
        int regionValue3224;
        int regionValue3223;
        int regionValue3220;
        int regionValue3218;
        int regionValue3217;
        int regionValue3216;
        java.lang.Object regionValue3215;

        region998: {
        java.lang.Object value3177;
        int regionValue3172;
        java.lang.Object regionValue3161;
        java.lang.Object value3181;
        java.lang.Object value3179;
        int regionValue3174;
        int regionValue3173;
        java.lang.Object regionValue3171;
        int regionValue3170;
        int regionValue3169;
        int regionValue3166;
        int regionValue3164;
        int regionValue3163;
        int regionValue3162;
        java.lang.Object value3180;
        java.lang.Object value3178;
        java.lang.Object value3176;
        java.lang.Object value3175;

        region985: {
        int regionValue3152;
        int regionValue3151;
        int regionValue3150;
        java.lang.Object regionValue3149;
        int regionValue3148;
        int regionValue3147;
        int regionValue3144;
        int regionValue3142;
        int regionValue3141;
        int regionValue3140;
        java.lang.Object regionValue3139;

        region983: {
        int regionValue3106;
        java.lang.Object regionValue3105;
        int regionValue3104;
        int regionValue3103;
        int regionValue3100;
        int regionValue3098;
        int regionValue3097;
        int regionValue3096;
        java.lang.Object regionValue3095;
        int regionValue3110;
        int regionValue3109;
        int regionValue3108;
        int regionValue3107;

        region982: {
        int regionValue3086;
        int regionValue3085;
        int regionValue3084;
        int regionValue3083;
        int regionValue3082;
        java.lang.Object regionValue3081;
        int regionValue3080;
        int regionValue3079;
        int regionValue3076;
        int regionValue3074;
        int regionValue3073;
        int regionValue3072;
        java.lang.Object regionValue3071;

        region980: {
        int regionValue3048;
        int value3051;
        java.lang.Object regionValue3047;
        int regionValue3046;
        int regionValue3045;
        java.lang.Object regionValue3037;
        int regionValue3050;
        int regionValue3049;
        int regionValue3042;
        int regionValue3040;
        int regionValue3039;
        int regionValue3038;

        region975: {
        int regionValue3028;
        int regionValue3027;
        int regionValue3026;
        java.lang.Object regionValue3025;
        int regionValue3024;
        int regionValue3023;
        int regionValue3020;
        int regionValue3018;
        int regionValue3017;
        int regionValue3016;
        java.lang.Object regionValue3015;

        region973: {
        int regionValue2983;
        java.lang.Object regionValue2982;
        int regionValue2981;
        int regionValue2980;
        int regionValue2977;
        int regionValue2975;
        int regionValue2974;
        int regionValue2973;
        java.lang.Object regionValue2972;
        int regionValue2985;
        int regionValue2984;

        region972: {
        int regionValue2928;
        int regionValue2920;
        int value2940;
        int value2937;
        int regionValue2925;
        int value2930;
        java.lang.Object regionValue2927;
        int regionValue2926;
        int regionValue2922;
        int regionValue2919;
        int regionValue2918;
        java.lang.Object regionValue2917;
        int value2932;
        int computed2942;
        int computed2941;
        int computed2939;
        int computed2938;
        int computed2936;
        int computed2935;
        int computed2934;
        int computed2933;
        int computed2931;
        int computed2929;

        region923: {
        if (regionValue2898 >= regionValue2889) {
            regionValue2905 = regionValue2890;
            regionValue2906 = regionValue2895;
            regionValue2907 = regionValue2896;
            regionValue2908 = regionValue2897;
            break region1294;
        } else {
            regionValue2917 = regionValue2887;
            regionValue2918 = regionValue2888;
            regionValue2919 = regionValue2889;
            regionValue2920 = regionValue2890;
            regionValue2922 = regionValue2892;
            regionValue2925 = regionValue2895;
            regionValue2926 = regionValue2896;
            regionValue2927 = regionValue2897;
            regionValue2928 = regionValue2898;
            break region923;
        }
        }
        computed2929 = regionValue2928 / regionValue2920;
        value2930 = computed2929;
        computed2931 = regionValue2928 % regionValue2920;
        value2932 = computed2931;
        computed2933 = value2930 * computed1768;
        computed2934 = computed1776 + computed2933;
        computed2935 = value2930 * 5;
        computed2936 = computed2934 + computed2935;
        value2937 = computed2936;
        computed2938 = value2932 * 9;
        computed2939 = regionValue2925 + computed2938;
        value2940 = computed2939;
        computed2941 = value2937 + computed1768;
        computed2942 = value2940 + 8;
        recovery$indy$flow$224(value2937, value2940, computed2941, computed2942, 553648127);
        recovery$indy$flow$225(1.0F, 1.0F, 1.0F, 1.0F);
        recovery$indy$flow$226();
        recovery$indy$flow$227();
        recovery$indy$flow$228(770, 771, 1, 0);
        if (a0 < 0) {
            regionValue2951 = regionValue2917;
            regionValue2952 = regionValue2918;
            regionValue2953 = regionValue2919;
            regionValue2954 = regionValue2920;
            regionValue2956 = regionValue2922;
            regionValue2959 = regionValue2925;
            regionValue2960 = regionValue2926;
            regionValue2961 = regionValue2927;
            regionValue2962 = regionValue2928;
            break region1293;
        } else {
            regionValue2972 = regionValue2917;
            regionValue2973 = regionValue2918;
            regionValue2974 = regionValue2919;
            regionValue2975 = regionValue2920;
            regionValue2977 = regionValue2922;
            regionValue2980 = regionValue2925;
            regionValue2981 = regionValue2926;
            regionValue2982 = regionValue2927;
            regionValue2983 = regionValue2928;
            regionValue2984 = value2937;
            regionValue2985 = value2940;
            break region972;
        }
        }
        if (value37 != null) {
            regionValue2995 = regionValue2972;
            regionValue2996 = regionValue2973;
            regionValue2997 = regionValue2974;
            regionValue2998 = regionValue2975;
            regionValue3000 = regionValue2977;
            regionValue3003 = regionValue2980;
            regionValue3004 = regionValue2981;
            regionValue3005 = regionValue2982;
            regionValue3006 = regionValue2983;
            break region1292;
        } else {
            regionValue3015 = regionValue2972;
            regionValue3016 = regionValue2973;
            regionValue3017 = regionValue2974;
            regionValue3018 = regionValue2975;
            regionValue3020 = regionValue2977;
            regionValue3023 = regionValue2980;
            regionValue3024 = regionValue2981;
            regionValue3025 = regionValue2982;
            regionValue3026 = regionValue2983;
            regionValue3027 = regionValue2984;
            regionValue3028 = regionValue2985;
            break region973;
        }
        }
        regionValue3037 = regionValue3015;
        regionValue3038 = regionValue3016;
        regionValue3039 = regionValue3017;
        regionValue3040 = regionValue3018;
        regionValue3042 = regionValue3020;
        regionValue3045 = regionValue3023;
        regionValue3046 = regionValue3024;
        regionValue3047 = regionValue3025;
        regionValue3048 = regionValue3026;
        regionValue3049 = regionValue3027;
        regionValue3050 = regionValue3028;
        break region975;
        }
        value3051 = recovery$indy$flow$229(regionValue3037);
        if (value37 != null) {
            regionValue3058 = regionValue3045;
            regionValue3059 = regionValue3046;
            regionValue3060 = regionValue3047;
            regionValue3061 = regionValue3048;
            regionValue3062 = value3051;
            break region1325;
        } else {
            regionValue3071 = regionValue3037;
            regionValue3072 = regionValue3038;
            regionValue3073 = regionValue3039;
            regionValue3074 = regionValue3040;
            regionValue3076 = regionValue3042;
            regionValue3079 = regionValue3045;
            regionValue3080 = regionValue3046;
            regionValue3081 = regionValue3047;
            regionValue3082 = regionValue3048;
            regionValue3083 = regionValue3049;
            regionValue3084 = regionValue3050;
            regionValue3085 = regionValue3048;
            regionValue3086 = value3051;
            break region980;
        }
        }
        regionValue3095 = regionValue3071;
        regionValue3096 = regionValue3072;
        regionValue3097 = regionValue3073;
        regionValue3098 = regionValue3074;
        regionValue3100 = regionValue3076;
        regionValue3103 = regionValue3079;
        regionValue3104 = regionValue3080;
        regionValue3105 = regionValue3081;
        regionValue3106 = regionValue3082;
        regionValue3107 = regionValue3083;
        regionValue3108 = regionValue3084;
        regionValue3109 = regionValue3085;
        regionValue3110 = regionValue3086;
        break region982;
        }
        if (regionValue3109 >= regionValue3110) {
            regionValue3119 = regionValue3095;
            regionValue3120 = regionValue3096;
            regionValue3121 = regionValue3097;
            regionValue3122 = regionValue3098;
            regionValue3124 = regionValue3100;
            regionValue3127 = regionValue3103;
            regionValue3128 = regionValue3104;
            regionValue3129 = regionValue3105;
            regionValue3130 = regionValue3106;
            break region1291;
        } else {
            regionValue3139 = regionValue3095;
            regionValue3140 = regionValue3096;
            regionValue3141 = regionValue3097;
            regionValue3142 = regionValue3098;
            regionValue3144 = regionValue3100;
            regionValue3147 = regionValue3103;
            regionValue3148 = regionValue3104;
            regionValue3149 = regionValue3105;
            regionValue3150 = regionValue3106;
            regionValue3151 = regionValue3107;
            regionValue3152 = regionValue3108;
            break region983;
        }
        }
        regionValue3161 = regionValue3139;
        regionValue3162 = regionValue3140;
        regionValue3163 = regionValue3141;
        regionValue3164 = regionValue3142;
        regionValue3166 = regionValue3144;
        regionValue3169 = regionValue3147;
        regionValue3170 = regionValue3148;
        regionValue3171 = regionValue3149;
        regionValue3172 = regionValue3150;
        regionValue3173 = regionValue3151;
        regionValue3174 = regionValue3152;
        break region985;
        }
        value3175 = recovery$indy$flow$230(regionValue3161, regionValue3172);
        value3176 = ((java.lang.Object)(((net.C_47Yl) (((java.lang.Object)(value3175))))));
        value3177 = value3176;
        value3178 = recovery$indy$flow$232(value3177);
        value3179 = value3178;
        value3180 = recovery$indy$flow$233(value3177);
        value3181 = value3180;
        if (value37 != null) {
            regionValue3190 = regionValue3161;
            regionValue3191 = regionValue3162;
            regionValue3192 = regionValue3163;
            regionValue3193 = regionValue3164;
            regionValue3195 = regionValue3166;
            regionValue3198 = regionValue3169;
            regionValue3199 = regionValue3170;
            regionValue3200 = regionValue3171;
            regionValue3201 = regionValue3172;
            regionValue3202 = regionValue3173;
            regionValue3203 = regionValue3174;
            regionValue3204 = value3177;
            regionValue3205 = value3179;
            regionValue3206 = value3181;
            break region1006;
        } else {
            regionValue3215 = regionValue3161;
            regionValue3216 = regionValue3162;
            regionValue3217 = regionValue3163;
            regionValue3218 = regionValue3164;
            regionValue3220 = regionValue3166;
            regionValue3223 = regionValue3169;
            regionValue3224 = regionValue3170;
            regionValue3225 = regionValue3171;
            regionValue3226 = regionValue3172;
            regionValue3227 = regionValue3173;
            regionValue3228 = regionValue3174;
            regionValue3229 = value3177;
            regionValue3230 = value3179;
            regionValue3231 = value3181;
            break region998;
        }
        }
        if (regionValue1362 == 0) {
            regionValue3240 = regionValue3215;
            regionValue3241 = regionValue3216;
            regionValue3242 = regionValue3217;
            regionValue3243 = regionValue3218;
            regionValue3245 = regionValue3220;
            regionValue3248 = regionValue3223;
            regionValue3249 = regionValue3224;
            regionValue3250 = regionValue3225;
            regionValue3251 = regionValue3226;
            regionValue3252 = regionValue3227;
            regionValue3253 = regionValue3228;
            regionValue3254 = regionValue3229;
            regionValue3255 = regionValue3230;
            regionValue3256 = regionValue3231;
            break region1164;
        } else {
            regionValue3265 = regionValue3215;
            regionValue3266 = regionValue3216;
            regionValue3267 = regionValue3217;
            regionValue3268 = regionValue3218;
            regionValue3270 = regionValue3220;
            regionValue3273 = regionValue3223;
            regionValue3274 = regionValue3224;
            regionValue3275 = regionValue3225;
            regionValue3276 = regionValue3226;
            regionValue3277 = regionValue3227;
            regionValue3278 = regionValue3228;
            regionValue3279 = regionValue3229;
            regionValue3280 = regionValue3230;
            regionValue3281 = regionValue3231;
            break region1000;
        }
        }
        regionValue3290 = regionValue3265;
        regionValue3291 = regionValue3266;
        regionValue3292 = regionValue3267;
        regionValue3293 = regionValue3268;
        regionValue3295 = regionValue3270;
        regionValue3298 = regionValue3273;
        regionValue3299 = regionValue3274;
        regionValue3300 = regionValue3275;
        regionValue3301 = regionValue3276;
        regionValue3302 = regionValue3277;
        regionValue3303 = regionValue3278;
        regionValue3304 = regionValue3279;
        regionValue3305 = regionValue3280;
        regionValue3306 = regionValue3281;
        break region1002;
        }
        regionValue3190 = regionValue3290;
        regionValue3191 = regionValue3291;
        regionValue3192 = regionValue3292;
        regionValue3193 = regionValue3293;
        regionValue3195 = regionValue3295;
        regionValue3198 = regionValue3298;
        regionValue3199 = regionValue3299;
        regionValue3200 = regionValue3300;
        regionValue3201 = regionValue3301;
        regionValue3202 = regionValue3302;
        regionValue3203 = regionValue3303;
        regionValue3204 = regionValue3304;
        regionValue3205 = regionValue3305;
        regionValue3206 = regionValue3306;
        break region1006;
        }
        value3307 = recovery$indy$flow$234();
        value3308 = value3307;
        value3309 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3308))))));
        value3310 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3309)))).field_44Q));
        value3311 = recovery$indy$flow$237(regionValue3206);
        value3312 = recovery$indy$flow$238(value3310, value3311);
        value3313 = value3312;
        if (value37 != null) {
            regionValue3322 = regionValue3190;
            regionValue3323 = regionValue3191;
            regionValue3324 = regionValue3192;
            regionValue3325 = regionValue3193;
            regionValue3327 = regionValue3195;
            regionValue3330 = regionValue3198;
            regionValue3331 = regionValue3199;
            regionValue3332 = regionValue3200;
            regionValue3333 = regionValue3201;
            regionValue3334 = regionValue3202;
            regionValue3335 = regionValue3203;
            regionValue3336 = regionValue3204;
            regionValue3337 = regionValue3205;
            regionValue3338 = regionValue3206;
            regionValue3339 = value3313;
            regionValue3340 = value3313;
            break region1026;
        } else {
            regionValue3349 = regionValue3190;
            regionValue3350 = regionValue3191;
            regionValue3351 = regionValue3192;
            regionValue3352 = regionValue3193;
            regionValue3354 = regionValue3195;
            regionValue3357 = regionValue3198;
            regionValue3358 = regionValue3199;
            regionValue3359 = regionValue3200;
            regionValue3360 = regionValue3201;
            regionValue3361 = regionValue3202;
            regionValue3362 = regionValue3203;
            regionValue3363 = regionValue3204;
            regionValue3364 = regionValue3205;
            regionValue3365 = regionValue3206;
            regionValue3366 = value3313;
            regionValue3367 = value3313;
            break region1022;
        }
        }
        if (regionValue3367 == null) {
            regionValue3376 = regionValue3349;
            regionValue3377 = regionValue3350;
            regionValue3378 = regionValue3351;
            regionValue3379 = regionValue3352;
            regionValue3381 = regionValue3354;
            regionValue3384 = regionValue3357;
            regionValue3385 = regionValue3358;
            regionValue3386 = regionValue3359;
            regionValue3387 = regionValue3360;
            regionValue3388 = regionValue3361;
            regionValue3389 = regionValue3362;
            regionValue3390 = regionValue3363;
            regionValue3391 = regionValue3364;
            regionValue3392 = regionValue3365;
            regionValue3393 = regionValue3366;
            break region1057;
        } else {
            regionValue3402 = regionValue3349;
            regionValue3403 = regionValue3350;
            regionValue3404 = regionValue3351;
            regionValue3405 = regionValue3352;
            regionValue3407 = regionValue3354;
            regionValue3410 = regionValue3357;
            regionValue3411 = regionValue3358;
            regionValue3412 = regionValue3359;
            regionValue3413 = regionValue3360;
            regionValue3414 = regionValue3361;
            regionValue3415 = regionValue3362;
            regionValue3416 = regionValue3363;
            regionValue3417 = regionValue3364;
            regionValue3418 = regionValue3365;
            regionValue3419 = regionValue3366;
            break region1023;
        }
        }
        regionValue3428 = regionValue3402;
        regionValue3429 = regionValue3403;
        regionValue3430 = regionValue3404;
        regionValue3431 = regionValue3405;
        regionValue3433 = regionValue3407;
        regionValue3436 = regionValue3410;
        regionValue3437 = regionValue3411;
        regionValue3438 = regionValue3412;
        regionValue3439 = regionValue3413;
        regionValue3440 = regionValue3414;
        regionValue3441 = regionValue3415;
        regionValue3442 = regionValue3416;
        regionValue3443 = regionValue3417;
        regionValue3444 = regionValue3418;
        regionValue3445 = regionValue3419;
        break region1025;
        }
        regionValue3322 = regionValue3428;
        regionValue3323 = regionValue3429;
        regionValue3324 = regionValue3430;
        regionValue3325 = regionValue3431;
        regionValue3327 = regionValue3433;
        regionValue3330 = regionValue3436;
        regionValue3331 = regionValue3437;
        regionValue3332 = regionValue3438;
        regionValue3333 = regionValue3439;
        regionValue3334 = regionValue3440;
        regionValue3335 = regionValue3441;
        regionValue3336 = regionValue3442;
        regionValue3337 = regionValue3443;
        regionValue3338 = regionValue3444;
        regionValue3339 = regionValue3445;
        regionValue3340 = regionValue3445;
        break region1026;
        }
        value3446 = recovery$indy$flow$239();
        value3447 = recovery$indy$flow$240(regionValue3340, value3446);
        if (a2 <= 0) {
            regionValue3456 = regionValue3322;
            regionValue3457 = regionValue3323;
            regionValue3458 = regionValue3324;
            regionValue3459 = regionValue3325;
            regionValue3461 = regionValue3327;
            regionValue3464 = regionValue3330;
            regionValue3465 = regionValue3331;
            regionValue3466 = regionValue3332;
            regionValue3467 = regionValue3333;
            regionValue3468 = regionValue3334;
            regionValue3469 = regionValue3335;
            regionValue3470 = regionValue3336;
            regionValue3471 = regionValue3337;
            regionValue3472 = regionValue3338;
            regionValue3473 = regionValue3339;
            regionValue3474 = (int) ((value3447 ? 1 : 0));
            break region1042;
        } else {
            regionValue3484 = regionValue3322;
            regionValue3485 = regionValue3323;
            regionValue3486 = regionValue3324;
            regionValue3487 = regionValue3325;
            regionValue3489 = regionValue3327;
            regionValue3492 = regionValue3330;
            regionValue3493 = regionValue3331;
            regionValue3494 = regionValue3332;
            regionValue3495 = regionValue3333;
            regionValue3496 = regionValue3334;
            regionValue3497 = regionValue3335;
            regionValue3498 = regionValue3336;
            regionValue3499 = regionValue3337;
            regionValue3500 = regionValue3338;
            regionValue3501 = regionValue3339;
            regionValue3502 = (int) ((value3447 ? 1 : 0));
            break region1031;
        }
        }
        if (value37 != null) {
            regionValue3512 = regionValue3484;
            regionValue3513 = regionValue3485;
            regionValue3514 = regionValue3486;
            regionValue3515 = regionValue3487;
            regionValue3517 = regionValue3489;
            regionValue3520 = regionValue3492;
            regionValue3521 = regionValue3493;
            regionValue3522 = regionValue3494;
            regionValue3523 = regionValue3495;
            regionValue3524 = regionValue3496;
            regionValue3525 = regionValue3497;
            regionValue3526 = regionValue3498;
            regionValue3527 = regionValue3499;
            regionValue3528 = regionValue3500;
            regionValue3529 = regionValue3501;
            regionValue3530 = regionValue3502;
            break region1041;
        } else {
            regionValue3539 = regionValue3484;
            regionValue3540 = regionValue3485;
            regionValue3541 = regionValue3486;
            regionValue3542 = regionValue3487;
            regionValue3544 = regionValue3489;
            regionValue3547 = regionValue3492;
            regionValue3548 = regionValue3493;
            regionValue3549 = regionValue3494;
            regionValue3550 = regionValue3495;
            regionValue3551 = regionValue3496;
            regionValue3552 = regionValue3497;
            regionValue3553 = regionValue3498;
            regionValue3554 = regionValue3499;
            regionValue3555 = regionValue3500;
            regionValue3556 = regionValue3501;
            regionValue3557 = regionValue3502;
            break region1032;
        }
        }
        regionValue3566 = regionValue3539;
        regionValue3567 = regionValue3540;
        regionValue3568 = regionValue3541;
        regionValue3569 = regionValue3542;
        regionValue3571 = regionValue3544;
        regionValue3574 = regionValue3547;
        regionValue3575 = regionValue3548;
        regionValue3576 = regionValue3549;
        regionValue3577 = regionValue3550;
        regionValue3578 = regionValue3551;
        regionValue3579 = regionValue3552;
        regionValue3580 = regionValue3553;
        regionValue3581 = regionValue3554;
        regionValue3582 = regionValue3555;
        regionValue3583 = regionValue3556;
        regionValue3584 = regionValue3557;
        break region1034;
        }
        if (regionValue3584 == 0) {
            regionValue3376 = regionValue3566;
            regionValue3377 = regionValue3567;
            regionValue3378 = regionValue3568;
            regionValue3379 = regionValue3569;
            regionValue3381 = regionValue3571;
            regionValue3384 = regionValue3574;
            regionValue3385 = regionValue3575;
            regionValue3386 = regionValue3576;
            regionValue3387 = regionValue3577;
            regionValue3388 = regionValue3578;
            regionValue3389 = regionValue3579;
            regionValue3390 = regionValue3580;
            regionValue3391 = regionValue3581;
            regionValue3392 = regionValue3582;
            regionValue3393 = regionValue3583;
            break region1057;
        } else {
            regionValue3593 = regionValue3566;
            regionValue3594 = regionValue3567;
            regionValue3595 = regionValue3568;
            regionValue3596 = regionValue3569;
            regionValue3598 = regionValue3571;
            regionValue3601 = regionValue3574;
            regionValue3602 = regionValue3575;
            regionValue3603 = regionValue3576;
            regionValue3604 = regionValue3577;
            regionValue3605 = regionValue3578;
            regionValue3606 = regionValue3579;
            regionValue3607 = regionValue3580;
            regionValue3608 = regionValue3581;
            regionValue3609 = regionValue3582;
            regionValue3610 = regionValue3583;
            break region1035;
        }
        }
        value3611 = recovery$indy$flow$241(regionValue3609);
        value3612 = recovery$indy$flow$242(value3611, "Dinnerbone");
        regionValue3512 = regionValue3593;
        regionValue3513 = regionValue3594;
        regionValue3514 = regionValue3595;
        regionValue3515 = regionValue3596;
        regionValue3517 = regionValue3598;
        regionValue3520 = regionValue3601;
        regionValue3521 = regionValue3602;
        regionValue3522 = regionValue3603;
        regionValue3523 = regionValue3604;
        regionValue3524 = regionValue3605;
        regionValue3525 = regionValue3606;
        regionValue3526 = regionValue3607;
        regionValue3527 = regionValue3608;
        regionValue3528 = regionValue3609;
        regionValue3529 = regionValue3610;
        regionValue3530 = (int) ((value3612 ? 1 : 0));
        break region1041;
        }
        regionValue3456 = regionValue3512;
        regionValue3457 = regionValue3513;
        regionValue3458 = regionValue3514;
        regionValue3459 = regionValue3515;
        regionValue3461 = regionValue3517;
        regionValue3464 = regionValue3520;
        regionValue3465 = regionValue3521;
        regionValue3466 = regionValue3522;
        regionValue3467 = regionValue3523;
        regionValue3468 = regionValue3524;
        regionValue3469 = regionValue3525;
        regionValue3470 = regionValue3526;
        regionValue3471 = regionValue3527;
        regionValue3472 = regionValue3528;
        regionValue3473 = regionValue3529;
        regionValue3474 = regionValue3530;
        break region1042;
        }
        if (value37 != null) {
            regionValue3621 = regionValue3456;
            regionValue3622 = regionValue3457;
            regionValue3623 = regionValue3458;
            regionValue3624 = regionValue3459;
            regionValue3626 = regionValue3461;
            regionValue3629 = regionValue3464;
            regionValue3630 = regionValue3465;
            regionValue3631 = regionValue3466;
            regionValue3632 = regionValue3467;
            regionValue3633 = regionValue3468;
            regionValue3634 = regionValue3469;
            regionValue3635 = regionValue3470;
            regionValue3636 = regionValue3471;
            regionValue3637 = regionValue3472;
            regionValue3638 = regionValue3473;
            regionValue3639 = regionValue3474;
            break region1056;
        } else {
            regionValue3648 = regionValue3456;
            regionValue3649 = regionValue3457;
            regionValue3650 = regionValue3458;
            regionValue3651 = regionValue3459;
            regionValue3653 = regionValue3461;
            regionValue3656 = regionValue3464;
            regionValue3657 = regionValue3465;
            regionValue3658 = regionValue3466;
            regionValue3659 = regionValue3467;
            regionValue3660 = regionValue3468;
            regionValue3661 = regionValue3469;
            regionValue3662 = regionValue3470;
            regionValue3663 = regionValue3471;
            regionValue3664 = regionValue3472;
            regionValue3665 = regionValue3473;
            regionValue3666 = regionValue3474;
            break region1043;
        }
        }
        if (regionValue3666 != 0) {
            regionValue3675 = regionValue3648;
            regionValue3676 = regionValue3649;
            regionValue3677 = regionValue3650;
            regionValue3678 = regionValue3651;
            regionValue3680 = regionValue3653;
            regionValue3683 = regionValue3656;
            regionValue3684 = regionValue3657;
            regionValue3685 = regionValue3658;
            regionValue3686 = regionValue3659;
            regionValue3687 = regionValue3660;
            regionValue3688 = regionValue3661;
            regionValue3689 = regionValue3662;
            regionValue3690 = regionValue3663;
            regionValue3691 = regionValue3664;
            regionValue3692 = regionValue3665;
            break region1055;
        } else {
            regionValue3701 = regionValue3648;
            regionValue3702 = regionValue3649;
            regionValue3703 = regionValue3650;
            regionValue3704 = regionValue3651;
            regionValue3706 = regionValue3653;
            regionValue3709 = regionValue3656;
            regionValue3710 = regionValue3657;
            regionValue3711 = regionValue3658;
            regionValue3712 = regionValue3659;
            regionValue3713 = regionValue3660;
            regionValue3714 = regionValue3661;
            regionValue3715 = regionValue3662;
            regionValue3716 = regionValue3663;
            regionValue3717 = regionValue3664;
            regionValue3718 = regionValue3665;
            break region1044;
        }
        }
        value3719 = recovery$indy$flow$243(regionValue3717);
        value3720 = recovery$indy$flow$244(value3719, "Grumm");
        if (value37 != null) {
            regionValue3621 = regionValue3701;
            regionValue3622 = regionValue3702;
            regionValue3623 = regionValue3703;
            regionValue3624 = regionValue3704;
            regionValue3626 = regionValue3706;
            regionValue3629 = regionValue3709;
            regionValue3630 = regionValue3710;
            regionValue3631 = regionValue3711;
            regionValue3632 = regionValue3712;
            regionValue3633 = regionValue3713;
            regionValue3634 = regionValue3714;
            regionValue3635 = regionValue3715;
            regionValue3636 = regionValue3716;
            regionValue3637 = regionValue3717;
            regionValue3638 = regionValue3718;
            regionValue3639 = (int) ((value3720 ? 1 : 0));
            break region1056;
        } else {
            regionValue3729 = regionValue3701;
            regionValue3730 = regionValue3702;
            regionValue3731 = regionValue3703;
            regionValue3732 = regionValue3704;
            regionValue3734 = regionValue3706;
            regionValue3737 = regionValue3709;
            regionValue3738 = regionValue3710;
            regionValue3739 = regionValue3711;
            regionValue3740 = regionValue3712;
            regionValue3741 = regionValue3713;
            regionValue3742 = regionValue3714;
            regionValue3743 = regionValue3715;
            regionValue3744 = regionValue3716;
            regionValue3745 = regionValue3717;
            regionValue3746 = regionValue3718;
            regionValue3747 = (int) ((value3720 ? 1 : 0));
            break region1050;
        }
        }
        regionValue3756 = regionValue3729;
        regionValue3757 = regionValue3730;
        regionValue3758 = regionValue3731;
        regionValue3759 = regionValue3732;
        regionValue3761 = regionValue3734;
        regionValue3764 = regionValue3737;
        regionValue3765 = regionValue3738;
        regionValue3766 = regionValue3739;
        regionValue3767 = regionValue3740;
        regionValue3768 = regionValue3741;
        regionValue3769 = regionValue3742;
        regionValue3770 = regionValue3743;
        regionValue3771 = regionValue3744;
        regionValue3772 = regionValue3745;
        regionValue3773 = regionValue3746;
        regionValue3774 = regionValue3747;
        break region1052;
        }
        if (regionValue3774 == 0) {
            regionValue3376 = regionValue3756;
            regionValue3377 = regionValue3757;
            regionValue3378 = regionValue3758;
            regionValue3379 = regionValue3759;
            regionValue3381 = regionValue3761;
            regionValue3384 = regionValue3764;
            regionValue3385 = regionValue3765;
            regionValue3386 = regionValue3766;
            regionValue3387 = regionValue3767;
            regionValue3388 = regionValue3768;
            regionValue3389 = regionValue3769;
            regionValue3390 = regionValue3770;
            regionValue3391 = regionValue3771;
            regionValue3392 = regionValue3772;
            regionValue3393 = regionValue3773;
            break region1057;
        } else {
            regionValue3783 = regionValue3756;
            regionValue3784 = regionValue3757;
            regionValue3785 = regionValue3758;
            regionValue3786 = regionValue3759;
            regionValue3788 = regionValue3761;
            regionValue3791 = regionValue3764;
            regionValue3792 = regionValue3765;
            regionValue3793 = regionValue3766;
            regionValue3794 = regionValue3767;
            regionValue3795 = regionValue3768;
            regionValue3796 = regionValue3769;
            regionValue3797 = regionValue3770;
            regionValue3798 = regionValue3771;
            regionValue3799 = regionValue3772;
            regionValue3800 = regionValue3773;
            break region1053;
        }
        }
        regionValue3675 = regionValue3783;
        regionValue3676 = regionValue3784;
        regionValue3677 = regionValue3785;
        regionValue3678 = regionValue3786;
        regionValue3680 = regionValue3788;
        regionValue3683 = regionValue3791;
        regionValue3684 = regionValue3792;
        regionValue3685 = regionValue3793;
        regionValue3686 = regionValue3794;
        regionValue3687 = regionValue3795;
        regionValue3688 = regionValue3796;
        regionValue3689 = regionValue3797;
        regionValue3690 = regionValue3798;
        regionValue3691 = regionValue3799;
        regionValue3692 = regionValue3800;
        break region1055;
        }
        regionValue3621 = regionValue3675;
        regionValue3622 = regionValue3676;
        regionValue3623 = regionValue3677;
        regionValue3624 = regionValue3678;
        regionValue3626 = regionValue3680;
        regionValue3629 = regionValue3683;
        regionValue3630 = regionValue3684;
        regionValue3631 = regionValue3685;
        regionValue3632 = regionValue3686;
        regionValue3633 = regionValue3687;
        regionValue3634 = regionValue3688;
        regionValue3635 = regionValue3689;
        regionValue3636 = regionValue3690;
        regionValue3637 = regionValue3691;
        regionValue3638 = regionValue3692;
        regionValue3639 = 1;
        break region1056;
        }
        regionValue3809 = regionValue3621;
        regionValue3810 = regionValue3622;
        regionValue3811 = regionValue3623;
        regionValue3812 = regionValue3624;
        regionValue3814 = regionValue3626;
        regionValue3817 = regionValue3629;
        regionValue3818 = regionValue3630;
        regionValue3819 = regionValue3631;
        regionValue3820 = regionValue3632;
        regionValue3821 = regionValue3633;
        regionValue3822 = regionValue3634;
        regionValue3823 = regionValue3635;
        regionValue3824 = regionValue3636;
        regionValue3825 = regionValue3637;
        regionValue3826 = regionValue3638;
        regionValue3827 = regionValue3639;
        break region1058;
        }
        regionValue3809 = regionValue3376;
        regionValue3810 = regionValue3377;
        regionValue3811 = regionValue3378;
        regionValue3812 = regionValue3379;
        regionValue3814 = regionValue3381;
        regionValue3817 = regionValue3384;
        regionValue3818 = regionValue3385;
        regionValue3819 = regionValue3386;
        regionValue3820 = regionValue3387;
        regionValue3821 = regionValue3388;
        regionValue3822 = regionValue3389;
        regionValue3823 = regionValue3390;
        regionValue3824 = regionValue3391;
        regionValue3825 = regionValue3392;
        regionValue3826 = regionValue3393;
        regionValue3827 = 0;
        break region1058;
        }
        value3828 = regionValue3827;
        value3829 = recovery$indy$flow$245();
        value3830 = value3829;
        value3831 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3830))))));
        value3832 = recovery$indy$flow$247(value3831);
        value3833 = recovery$indy$flow$248(regionValue3823);
        recovery$indy$flow$249(value3832, value3833);
        if (value37 != null) {
            regionValue3842 = regionValue3809;
            regionValue3843 = regionValue3810;
            regionValue3844 = regionValue3811;
            regionValue3845 = regionValue3812;
            regionValue3847 = regionValue3814;
            regionValue3850 = regionValue3817;
            regionValue3851 = regionValue3818;
            regionValue3852 = regionValue3819;
            regionValue3853 = regionValue3820;
            regionValue3854 = regionValue3821;
            regionValue3855 = regionValue3822;
            regionValue3856 = regionValue3823;
            regionValue3857 = regionValue3824;
            regionValue3858 = regionValue3825;
            regionValue3859 = regionValue3826;
            regionValue3860 = value3828;
            regionValue3861 = 8;
            regionValue3862 = value3828;
            break region1081;
        } else {
            regionValue3871 = regionValue3809;
            regionValue3872 = regionValue3810;
            regionValue3873 = regionValue3811;
            regionValue3874 = regionValue3812;
            regionValue3876 = regionValue3814;
            regionValue3879 = regionValue3817;
            regionValue3880 = regionValue3818;
            regionValue3881 = regionValue3819;
            regionValue3882 = regionValue3820;
            regionValue3883 = regionValue3821;
            regionValue3884 = regionValue3822;
            regionValue3885 = regionValue3823;
            regionValue3886 = regionValue3824;
            regionValue3887 = regionValue3825;
            regionValue3888 = regionValue3826;
            regionValue3889 = value3828;
            regionValue3890 = 8;
            regionValue3891 = value3828;
            break region1077;
        }
        }
        if (regionValue3891 == 0) {
            regionValue3900 = regionValue3871;
            regionValue3901 = regionValue3872;
            regionValue3902 = regionValue3873;
            regionValue3903 = regionValue3874;
            regionValue3905 = regionValue3876;
            regionValue3908 = regionValue3879;
            regionValue3909 = regionValue3880;
            regionValue3910 = regionValue3881;
            regionValue3911 = regionValue3882;
            regionValue3912 = regionValue3883;
            regionValue3913 = regionValue3884;
            regionValue3914 = regionValue3885;
            regionValue3915 = regionValue3886;
            regionValue3916 = regionValue3887;
            regionValue3917 = regionValue3888;
            regionValue3918 = regionValue3889;
            regionValue3919 = regionValue3890;
            break region1082;
        } else {
            regionValue3928 = regionValue3871;
            regionValue3929 = regionValue3872;
            regionValue3930 = regionValue3873;
            regionValue3931 = regionValue3874;
            regionValue3933 = regionValue3876;
            regionValue3936 = regionValue3879;
            regionValue3937 = regionValue3880;
            regionValue3938 = regionValue3881;
            regionValue3939 = regionValue3882;
            regionValue3940 = regionValue3883;
            regionValue3941 = regionValue3884;
            regionValue3942 = regionValue3885;
            regionValue3943 = regionValue3886;
            regionValue3944 = regionValue3887;
            regionValue3945 = regionValue3888;
            regionValue3946 = regionValue3889;
            regionValue3947 = regionValue3890;
            break region1078;
        }
        }
        regionValue3956 = regionValue3928;
        regionValue3957 = regionValue3929;
        regionValue3958 = regionValue3930;
        regionValue3959 = regionValue3931;
        regionValue3961 = regionValue3933;
        regionValue3964 = regionValue3936;
        regionValue3965 = regionValue3937;
        regionValue3966 = regionValue3938;
        regionValue3967 = regionValue3939;
        regionValue3968 = regionValue3940;
        regionValue3969 = regionValue3941;
        regionValue3970 = regionValue3942;
        regionValue3971 = regionValue3943;
        regionValue3972 = regionValue3944;
        regionValue3973 = regionValue3945;
        regionValue3974 = regionValue3946;
        regionValue3975 = regionValue3947;
        break region1080;
        }
        regionValue3842 = regionValue3956;
        regionValue3843 = regionValue3957;
        regionValue3844 = regionValue3958;
        regionValue3845 = regionValue3959;
        regionValue3847 = regionValue3961;
        regionValue3850 = regionValue3964;
        regionValue3851 = regionValue3965;
        regionValue3852 = regionValue3966;
        regionValue3853 = regionValue3967;
        regionValue3854 = regionValue3968;
        regionValue3855 = regionValue3969;
        regionValue3856 = regionValue3970;
        regionValue3857 = regionValue3971;
        regionValue3858 = regionValue3972;
        regionValue3859 = regionValue3973;
        regionValue3860 = regionValue3974;
        regionValue3861 = regionValue3975;
        regionValue3862 = 8;
        break region1081;
        }
        regionValue3984 = regionValue3842;
        regionValue3985 = regionValue3843;
        regionValue3986 = regionValue3844;
        regionValue3987 = regionValue3845;
        regionValue3989 = regionValue3847;
        regionValue3992 = regionValue3850;
        regionValue3993 = regionValue3851;
        regionValue3994 = regionValue3852;
        regionValue3995 = regionValue3853;
        regionValue3996 = regionValue3854;
        regionValue3997 = regionValue3855;
        regionValue3998 = regionValue3856;
        regionValue3999 = regionValue3857;
        regionValue4000 = regionValue3858;
        regionValue4001 = regionValue3859;
        regionValue4002 = regionValue3860;
        regionValue4003 = regionValue3861;
        regionValue4004 = regionValue3862;
        break region1083;
        }
        regionValue3984 = regionValue3900;
        regionValue3985 = regionValue3901;
        regionValue3986 = regionValue3902;
        regionValue3987 = regionValue3903;
        regionValue3989 = regionValue3905;
        regionValue3992 = regionValue3908;
        regionValue3993 = regionValue3909;
        regionValue3994 = regionValue3910;
        regionValue3995 = regionValue3911;
        regionValue3996 = regionValue3912;
        regionValue3997 = regionValue3913;
        regionValue3998 = regionValue3914;
        regionValue3999 = regionValue3915;
        regionValue4000 = regionValue3916;
        regionValue4001 = regionValue3917;
        regionValue4002 = regionValue3918;
        regionValue4003 = regionValue3919;
        regionValue4004 = 0;
        break region1083;
        }
        computed4005 = regionValue4003 + regionValue4004;
        value4006 = computed4005;
        if (value37 != null) {
            regionValue4015 = regionValue3984;
            regionValue4016 = regionValue3985;
            regionValue4017 = regionValue3986;
            regionValue4018 = regionValue3987;
            regionValue4020 = regionValue3989;
            regionValue4023 = regionValue3992;
            regionValue4024 = regionValue3993;
            regionValue4025 = regionValue3994;
            regionValue4026 = regionValue3995;
            regionValue4027 = regionValue3996;
            regionValue4028 = regionValue3997;
            regionValue4029 = regionValue3998;
            regionValue4030 = regionValue3999;
            regionValue4031 = regionValue4000;
            regionValue4032 = regionValue4001;
            regionValue4033 = regionValue4002;
            regionValue4034 = value4006;
            regionValue4035 = 8;
            regionValue4036 = regionValue4002;
            break region1093;
        } else {
            regionValue4045 = regionValue3984;
            regionValue4046 = regionValue3985;
            regionValue4047 = regionValue3986;
            regionValue4048 = regionValue3987;
            regionValue4050 = regionValue3989;
            regionValue4053 = regionValue3992;
            regionValue4054 = regionValue3993;
            regionValue4055 = regionValue3994;
            regionValue4056 = regionValue3995;
            regionValue4057 = regionValue3996;
            regionValue4058 = regionValue3997;
            regionValue4059 = regionValue3998;
            regionValue4060 = regionValue3999;
            regionValue4061 = regionValue4000;
            regionValue4062 = regionValue4001;
            regionValue4063 = regionValue4002;
            regionValue4064 = value4006;
            regionValue4065 = 8;
            regionValue4066 = regionValue4002;
            break region1089;
        }
        }
        if (regionValue4066 == 0) {
            regionValue4075 = regionValue4045;
            regionValue4076 = regionValue4046;
            regionValue4077 = regionValue4047;
            regionValue4078 = regionValue4048;
            regionValue4080 = regionValue4050;
            regionValue4083 = regionValue4053;
            regionValue4084 = regionValue4054;
            regionValue4085 = regionValue4055;
            regionValue4086 = regionValue4056;
            regionValue4087 = regionValue4057;
            regionValue4088 = regionValue4058;
            regionValue4089 = regionValue4059;
            regionValue4090 = regionValue4060;
            regionValue4091 = regionValue4061;
            regionValue4092 = regionValue4062;
            regionValue4093 = regionValue4063;
            regionValue4094 = regionValue4064;
            regionValue4095 = regionValue4065;
            break region1094;
        } else {
            regionValue4104 = regionValue4045;
            regionValue4105 = regionValue4046;
            regionValue4106 = regionValue4047;
            regionValue4107 = regionValue4048;
            regionValue4109 = regionValue4050;
            regionValue4112 = regionValue4053;
            regionValue4113 = regionValue4054;
            regionValue4114 = regionValue4055;
            regionValue4115 = regionValue4056;
            regionValue4116 = regionValue4057;
            regionValue4117 = regionValue4058;
            regionValue4118 = regionValue4059;
            regionValue4119 = regionValue4060;
            regionValue4120 = regionValue4061;
            regionValue4121 = regionValue4062;
            regionValue4122 = regionValue4063;
            regionValue4123 = regionValue4064;
            regionValue4124 = regionValue4065;
            break region1090;
        }
        }
        regionValue4133 = regionValue4104;
        regionValue4134 = regionValue4105;
        regionValue4135 = regionValue4106;
        regionValue4136 = regionValue4107;
        regionValue4138 = regionValue4109;
        regionValue4141 = regionValue4112;
        regionValue4142 = regionValue4113;
        regionValue4143 = regionValue4114;
        regionValue4144 = regionValue4115;
        regionValue4145 = regionValue4116;
        regionValue4146 = regionValue4117;
        regionValue4147 = regionValue4118;
        regionValue4148 = regionValue4119;
        regionValue4149 = regionValue4120;
        regionValue4150 = regionValue4121;
        regionValue4151 = regionValue4122;
        regionValue4152 = regionValue4123;
        regionValue4153 = regionValue4124;
        break region1092;
        }
        regionValue4015 = regionValue4133;
        regionValue4016 = regionValue4134;
        regionValue4017 = regionValue4135;
        regionValue4018 = regionValue4136;
        regionValue4020 = regionValue4138;
        regionValue4023 = regionValue4141;
        regionValue4024 = regionValue4142;
        regionValue4025 = regionValue4143;
        regionValue4026 = regionValue4144;
        regionValue4027 = regionValue4145;
        regionValue4028 = regionValue4146;
        regionValue4029 = regionValue4147;
        regionValue4030 = regionValue4148;
        regionValue4031 = regionValue4149;
        regionValue4032 = regionValue4150;
        regionValue4033 = regionValue4151;
        regionValue4034 = regionValue4152;
        regionValue4035 = regionValue4153;
        regionValue4036 = -1;
        break region1093;
        }
        regionValue4162 = regionValue4015;
        regionValue4163 = regionValue4016;
        regionValue4164 = regionValue4017;
        regionValue4165 = regionValue4018;
        regionValue4167 = regionValue4020;
        regionValue4170 = regionValue4023;
        regionValue4171 = regionValue4024;
        regionValue4172 = regionValue4025;
        regionValue4173 = regionValue4026;
        regionValue4174 = regionValue4027;
        regionValue4175 = regionValue4028;
        regionValue4176 = regionValue4029;
        regionValue4177 = regionValue4030;
        regionValue4178 = regionValue4031;
        regionValue4179 = regionValue4032;
        regionValue4180 = regionValue4033;
        regionValue4181 = regionValue4034;
        regionValue4182 = regionValue4035;
        regionValue4183 = regionValue4036;
        break region1095;
        }
        regionValue4162 = regionValue4075;
        regionValue4163 = regionValue4076;
        regionValue4164 = regionValue4077;
        regionValue4165 = regionValue4078;
        regionValue4167 = regionValue4080;
        regionValue4170 = regionValue4083;
        regionValue4171 = regionValue4084;
        regionValue4172 = regionValue4085;
        regionValue4173 = regionValue4086;
        regionValue4174 = regionValue4087;
        regionValue4175 = regionValue4088;
        regionValue4176 = regionValue4089;
        regionValue4177 = regionValue4090;
        regionValue4178 = regionValue4091;
        regionValue4179 = regionValue4092;
        regionValue4180 = regionValue4093;
        regionValue4181 = regionValue4094;
        regionValue4182 = regionValue4095;
        regionValue4183 = 1;
        break region1095;
        }
        computed4184 = regionValue4182 * regionValue4183;
        value4185 = computed4184;
        if (a2 < 0) {
            regionValue4194 = regionValue4162;
            regionValue4195 = regionValue4163;
            regionValue4196 = regionValue4164;
            regionValue4197 = regionValue4165;
            regionValue4199 = regionValue4167;
            regionValue4202 = regionValue4170;
            regionValue4203 = regionValue4171;
            regionValue4204 = regionValue4172;
            regionValue4205 = regionValue4173;
            regionValue4206 = regionValue4174;
            regionValue4207 = regionValue4175;
            regionValue4208 = regionValue4176;
            regionValue4209 = regionValue4177;
            regionValue4210 = regionValue4178;
            regionValue4211 = regionValue4180;
            regionValue4212 = regionValue4174;
            break region1122;
        } else {
            regionValue4221 = regionValue4162;
            regionValue4222 = regionValue4163;
            regionValue4223 = regionValue4164;
            regionValue4224 = regionValue4165;
            regionValue4226 = regionValue4167;
            regionValue4229 = regionValue4170;
            regionValue4230 = regionValue4171;
            regionValue4231 = regionValue4172;
            regionValue4232 = regionValue4173;
            regionValue4233 = regionValue4174;
            regionValue4234 = regionValue4175;
            regionValue4235 = regionValue4176;
            regionValue4236 = regionValue4177;
            regionValue4237 = regionValue4178;
            regionValue4238 = regionValue4179;
            regionValue4239 = regionValue4180;
            regionValue4240 = regionValue4181;
            regionValue4241 = value4185;
            regionValue4242 = regionValue4174;
            break region1100;
        }
        }
        converted4243 = (float) (regionValue4240);
        recovery$indy$flow$250(regionValue4242, regionValue4234, Float.intBitsToFloat(1090519040), converted4243, 8, regionValue4241, 8, 8, Float.intBitsToFloat(1115684864), Float.intBitsToFloat(1115684864));
        if (value37 != null) {
            regionValue4252 = regionValue4221;
            regionValue4253 = regionValue4222;
            regionValue4254 = regionValue4223;
            regionValue4255 = regionValue4224;
            regionValue4257 = regionValue4226;
            regionValue4260 = regionValue4229;
            regionValue4261 = regionValue4230;
            regionValue4262 = regionValue4231;
            regionValue4263 = regionValue4232;
            regionValue4264 = regionValue4233;
            regionValue4265 = regionValue4234;
            regionValue4266 = regionValue4235;
            regionValue4267 = regionValue4236;
            regionValue4268 = regionValue4237;
            regionValue4269 = regionValue4239;
            regionValue4270 = regionValue4238;
            break region1120;
        } else {
            regionValue4279 = regionValue4221;
            regionValue4280 = regionValue4222;
            regionValue4281 = regionValue4223;
            regionValue4282 = regionValue4224;
            regionValue4284 = regionValue4226;
            regionValue4287 = regionValue4229;
            regionValue4288 = regionValue4230;
            regionValue4289 = regionValue4231;
            regionValue4290 = regionValue4232;
            regionValue4291 = regionValue4233;
            regionValue4292 = regionValue4234;
            regionValue4293 = regionValue4235;
            regionValue4294 = regionValue4236;
            regionValue4295 = regionValue4237;
            regionValue4296 = regionValue4238;
            regionValue4297 = regionValue4239;
            regionValue4298 = regionValue4238;
            break region1114;
        }
        }
        regionValue4307 = regionValue4279;
        regionValue4308 = regionValue4280;
        regionValue4309 = regionValue4281;
        regionValue4310 = regionValue4282;
        regionValue4312 = regionValue4284;
        regionValue4315 = regionValue4287;
        regionValue4316 = regionValue4288;
        regionValue4317 = regionValue4289;
        regionValue4318 = regionValue4290;
        regionValue4319 = regionValue4291;
        regionValue4320 = regionValue4292;
        regionValue4321 = regionValue4293;
        regionValue4322 = regionValue4294;
        regionValue4323 = regionValue4295;
        regionValue4324 = regionValue4296;
        regionValue4325 = regionValue4297;
        regionValue4326 = regionValue4298;
        break region1116;
        }
        if (regionValue4326 == null) {
            regionValue4335 = regionValue4307;
            regionValue4336 = regionValue4308;
            regionValue4337 = regionValue4309;
            regionValue4338 = regionValue4310;
            regionValue4340 = regionValue4312;
            regionValue4343 = regionValue4315;
            regionValue4344 = regionValue4316;
            regionValue4345 = regionValue4317;
            regionValue4346 = regionValue4318;
            regionValue4347 = regionValue4319;
            regionValue4348 = regionValue4320;
            regionValue4349 = regionValue4321;
            regionValue4350 = regionValue4322;
            regionValue4351 = regionValue4323;
            break region1163;
        } else {
            regionValue4360 = regionValue4307;
            regionValue4361 = regionValue4308;
            regionValue4362 = regionValue4309;
            regionValue4363 = regionValue4310;
            regionValue4365 = regionValue4312;
            regionValue4368 = regionValue4315;
            regionValue4369 = regionValue4316;
            regionValue4370 = regionValue4317;
            regionValue4371 = regionValue4318;
            regionValue4372 = regionValue4319;
            regionValue4373 = regionValue4320;
            regionValue4374 = regionValue4321;
            regionValue4375 = regionValue4322;
            regionValue4376 = regionValue4323;
            regionValue4377 = regionValue4324;
            regionValue4378 = regionValue4325;
            break region1117;
        }
        }
        regionValue4387 = regionValue4360;
        regionValue4388 = regionValue4361;
        regionValue4389 = regionValue4362;
        regionValue4390 = regionValue4363;
        regionValue4392 = regionValue4365;
        regionValue4395 = regionValue4368;
        regionValue4396 = regionValue4369;
        regionValue4397 = regionValue4370;
        regionValue4398 = regionValue4371;
        regionValue4399 = regionValue4372;
        regionValue4400 = regionValue4373;
        regionValue4401 = regionValue4374;
        regionValue4402 = regionValue4375;
        regionValue4403 = regionValue4376;
        regionValue4404 = regionValue4377;
        regionValue4405 = regionValue4378;
        break region1119;
        }
        regionValue4252 = regionValue4387;
        regionValue4253 = regionValue4388;
        regionValue4254 = regionValue4389;
        regionValue4255 = regionValue4390;
        regionValue4257 = regionValue4392;
        regionValue4260 = regionValue4395;
        regionValue4261 = regionValue4396;
        regionValue4262 = regionValue4397;
        regionValue4263 = regionValue4398;
        regionValue4264 = regionValue4399;
        regionValue4265 = regionValue4400;
        regionValue4266 = regionValue4401;
        regionValue4267 = regionValue4402;
        regionValue4268 = regionValue4403;
        regionValue4269 = regionValue4405;
        regionValue4270 = regionValue4404;
        break region1120;
        }
        value4406 = recovery$indy$flow$251();
        value4407 = recovery$indy$flow$252(regionValue4270, value4406);
        regionValue4194 = regionValue4252;
        regionValue4195 = regionValue4253;
        regionValue4196 = regionValue4254;
        regionValue4197 = regionValue4255;
        regionValue4199 = regionValue4257;
        regionValue4202 = regionValue4260;
        regionValue4203 = regionValue4261;
        regionValue4204 = regionValue4262;
        regionValue4205 = regionValue4263;
        regionValue4206 = regionValue4264;
        regionValue4207 = regionValue4265;
        regionValue4208 = regionValue4266;
        regionValue4209 = regionValue4267;
        regionValue4210 = regionValue4268;
        regionValue4211 = regionValue4269;
        regionValue4212 = (int) ((value4407 ? 1 : 0));
        break region1122;
        }
        if (value37 != null) {
            regionValue4416 = regionValue4194;
            regionValue4417 = regionValue4195;
            regionValue4418 = regionValue4196;
            regionValue4419 = regionValue4197;
            regionValue4421 = regionValue4199;
            regionValue4424 = regionValue4202;
            regionValue4425 = regionValue4203;
            regionValue4426 = regionValue4204;
            regionValue4427 = regionValue4205;
            regionValue4428 = regionValue4206;
            regionValue4429 = regionValue4207;
            regionValue4430 = regionValue4208;
            regionValue4431 = regionValue4209;
            regionValue4432 = regionValue4210;
            regionValue4433 = regionValue4211;
            regionValue4434 = regionValue4212;
            break region1128;
        } else {
            regionValue4443 = regionValue4194;
            regionValue4444 = regionValue4195;
            regionValue4445 = regionValue4196;
            regionValue4446 = regionValue4197;
            regionValue4448 = regionValue4199;
            regionValue4451 = regionValue4202;
            regionValue4452 = regionValue4203;
            regionValue4453 = regionValue4204;
            regionValue4454 = regionValue4205;
            regionValue4455 = regionValue4206;
            regionValue4456 = regionValue4207;
            regionValue4457 = regionValue4208;
            regionValue4458 = regionValue4209;
            regionValue4459 = regionValue4210;
            regionValue4460 = regionValue4211;
            regionValue4461 = regionValue4212;
            break region1124;
        }
        }
        if (regionValue4461 == 0) {
            regionValue4335 = regionValue4443;
            regionValue4336 = regionValue4444;
            regionValue4337 = regionValue4445;
            regionValue4338 = regionValue4446;
            regionValue4340 = regionValue4448;
            regionValue4343 = regionValue4451;
            regionValue4344 = regionValue4452;
            regionValue4345 = regionValue4453;
            regionValue4346 = regionValue4454;
            regionValue4347 = regionValue4455;
            regionValue4348 = regionValue4456;
            regionValue4349 = regionValue4457;
            regionValue4350 = regionValue4458;
            regionValue4351 = regionValue4459;
            break region1163;
        } else {
            regionValue4470 = regionValue4443;
            regionValue4471 = regionValue4444;
            regionValue4472 = regionValue4445;
            regionValue4473 = regionValue4446;
            regionValue4475 = regionValue4448;
            regionValue4478 = regionValue4451;
            regionValue4479 = regionValue4452;
            regionValue4480 = regionValue4453;
            regionValue4481 = regionValue4454;
            regionValue4482 = regionValue4455;
            regionValue4483 = regionValue4456;
            regionValue4484 = regionValue4457;
            regionValue4485 = regionValue4458;
            regionValue4486 = regionValue4459;
            regionValue4487 = regionValue4460;
            break region1125;
        }
        }
        regionValue4496 = regionValue4470;
        regionValue4497 = regionValue4471;
        regionValue4498 = regionValue4472;
        regionValue4499 = regionValue4473;
        regionValue4501 = regionValue4475;
        regionValue4504 = regionValue4478;
        regionValue4505 = regionValue4479;
        regionValue4506 = regionValue4480;
        regionValue4507 = regionValue4481;
        regionValue4508 = regionValue4482;
        regionValue4509 = regionValue4483;
        regionValue4510 = regionValue4484;
        regionValue4511 = regionValue4485;
        regionValue4512 = regionValue4486;
        regionValue4513 = regionValue4487;
        break region1127;
        }
        regionValue4416 = regionValue4496;
        regionValue4417 = regionValue4497;
        regionValue4418 = regionValue4498;
        regionValue4419 = regionValue4499;
        regionValue4421 = regionValue4501;
        regionValue4424 = regionValue4504;
        regionValue4425 = regionValue4505;
        regionValue4426 = regionValue4506;
        regionValue4427 = regionValue4507;
        regionValue4428 = regionValue4508;
        regionValue4429 = regionValue4509;
        regionValue4430 = regionValue4510;
        regionValue4431 = regionValue4511;
        regionValue4432 = regionValue4512;
        regionValue4433 = regionValue4513;
        regionValue4434 = 8;
        break region1128;
        }
        if (value37 != null) {
            regionValue4522 = regionValue4416;
            regionValue4523 = regionValue4417;
            regionValue4524 = regionValue4418;
            regionValue4525 = regionValue4419;
            regionValue4527 = regionValue4421;
            regionValue4530 = regionValue4424;
            regionValue4531 = regionValue4425;
            regionValue4532 = regionValue4426;
            regionValue4533 = regionValue4427;
            regionValue4534 = regionValue4428;
            regionValue4535 = regionValue4429;
            regionValue4536 = regionValue4430;
            regionValue4537 = regionValue4431;
            regionValue4538 = regionValue4432;
            regionValue4539 = regionValue4433;
            regionValue4540 = regionValue4434;
            regionValue4541 = regionValue4433;
            break region1135;
        } else {
            regionValue4550 = regionValue4416;
            regionValue4551 = regionValue4417;
            regionValue4552 = regionValue4418;
            regionValue4553 = regionValue4419;
            regionValue4555 = regionValue4421;
            regionValue4558 = regionValue4424;
            regionValue4559 = regionValue4425;
            regionValue4560 = regionValue4426;
            regionValue4561 = regionValue4427;
            regionValue4562 = regionValue4428;
            regionValue4563 = regionValue4429;
            regionValue4564 = regionValue4430;
            regionValue4565 = regionValue4431;
            regionValue4566 = regionValue4432;
            regionValue4567 = regionValue4433;
            regionValue4568 = regionValue4434;
            regionValue4569 = regionValue4433;
            break region1131;
        }
        }
        if (regionValue4569 == 0) {
            regionValue4578 = regionValue4550;
            regionValue4579 = regionValue4551;
            regionValue4580 = regionValue4552;
            regionValue4581 = regionValue4553;
            regionValue4583 = regionValue4555;
            regionValue4586 = regionValue4558;
            regionValue4587 = regionValue4559;
            regionValue4588 = regionValue4560;
            regionValue4589 = regionValue4561;
            regionValue4590 = regionValue4562;
            regionValue4591 = regionValue4563;
            regionValue4592 = regionValue4564;
            regionValue4593 = regionValue4565;
            regionValue4594 = regionValue4566;
            regionValue4595 = regionValue4567;
            regionValue4596 = regionValue4568;
            break region1136;
        } else {
            regionValue4605 = regionValue4550;
            regionValue4606 = regionValue4551;
            regionValue4607 = regionValue4552;
            regionValue4608 = regionValue4553;
            regionValue4610 = regionValue4555;
            regionValue4613 = regionValue4558;
            regionValue4614 = regionValue4559;
            regionValue4615 = regionValue4560;
            regionValue4616 = regionValue4561;
            regionValue4617 = regionValue4562;
            regionValue4618 = regionValue4563;
            regionValue4619 = regionValue4564;
            regionValue4620 = regionValue4565;
            regionValue4621 = regionValue4566;
            regionValue4622 = regionValue4567;
            regionValue4623 = regionValue4568;
            break region1132;
        }
        }
        regionValue4632 = regionValue4605;
        regionValue4633 = regionValue4606;
        regionValue4634 = regionValue4607;
        regionValue4635 = regionValue4608;
        regionValue4637 = regionValue4610;
        regionValue4640 = regionValue4613;
        regionValue4641 = regionValue4614;
        regionValue4642 = regionValue4615;
        regionValue4643 = regionValue4616;
        regionValue4644 = regionValue4617;
        regionValue4645 = regionValue4618;
        regionValue4646 = regionValue4619;
        regionValue4647 = regionValue4620;
        regionValue4648 = regionValue4621;
        regionValue4649 = regionValue4622;
        regionValue4650 = regionValue4623;
        break region1134;
        }
        regionValue4522 = regionValue4632;
        regionValue4523 = regionValue4633;
        regionValue4524 = regionValue4634;
        regionValue4525 = regionValue4635;
        regionValue4527 = regionValue4637;
        regionValue4530 = regionValue4640;
        regionValue4531 = regionValue4641;
        regionValue4532 = regionValue4642;
        regionValue4533 = regionValue4643;
        regionValue4534 = regionValue4644;
        regionValue4535 = regionValue4645;
        regionValue4536 = regionValue4646;
        regionValue4537 = regionValue4647;
        regionValue4538 = regionValue4648;
        regionValue4539 = regionValue4649;
        regionValue4540 = regionValue4650;
        regionValue4541 = 8;
        break region1135;
        }
        regionValue4659 = regionValue4522;
        regionValue4660 = regionValue4523;
        regionValue4661 = regionValue4524;
        regionValue4662 = regionValue4525;
        regionValue4664 = regionValue4527;
        regionValue4667 = regionValue4530;
        regionValue4668 = regionValue4531;
        regionValue4669 = regionValue4532;
        regionValue4670 = regionValue4533;
        regionValue4671 = regionValue4534;
        regionValue4672 = regionValue4535;
        regionValue4673 = regionValue4536;
        regionValue4674 = regionValue4537;
        regionValue4675 = regionValue4538;
        regionValue4676 = regionValue4539;
        regionValue4677 = regionValue4540;
        regionValue4678 = regionValue4541;
        break region1137;
        }
        regionValue4659 = regionValue4578;
        regionValue4660 = regionValue4579;
        regionValue4661 = regionValue4580;
        regionValue4662 = regionValue4581;
        regionValue4664 = regionValue4583;
        regionValue4667 = regionValue4586;
        regionValue4668 = regionValue4587;
        regionValue4669 = regionValue4588;
        regionValue4670 = regionValue4589;
        regionValue4671 = regionValue4590;
        regionValue4672 = regionValue4591;
        regionValue4673 = regionValue4592;
        regionValue4674 = regionValue4593;
        regionValue4675 = regionValue4594;
        regionValue4676 = regionValue4595;
        regionValue4677 = regionValue4596;
        regionValue4678 = 0;
        break region1137;
        }
        computed4679 = regionValue4677 + regionValue4678;
        value4680 = computed4679;
        if (value37 != null) {
            regionValue4689 = regionValue4659;
            regionValue4690 = regionValue4660;
            regionValue4691 = regionValue4661;
            regionValue4692 = regionValue4662;
            regionValue4694 = regionValue4664;
            regionValue4697 = regionValue4667;
            regionValue4698 = regionValue4668;
            regionValue4699 = regionValue4669;
            regionValue4700 = regionValue4670;
            regionValue4701 = regionValue4671;
            regionValue4702 = regionValue4672;
            regionValue4703 = regionValue4673;
            regionValue4704 = regionValue4674;
            regionValue4705 = regionValue4675;
            regionValue4706 = value4680;
            regionValue4707 = 8;
            regionValue4708 = regionValue4676;
            break region1147;
        } else {
            regionValue4717 = regionValue4659;
            regionValue4718 = regionValue4660;
            regionValue4719 = regionValue4661;
            regionValue4720 = regionValue4662;
            regionValue4722 = regionValue4664;
            regionValue4725 = regionValue4667;
            regionValue4726 = regionValue4668;
            regionValue4727 = regionValue4669;
            regionValue4728 = regionValue4670;
            regionValue4729 = regionValue4671;
            regionValue4730 = regionValue4672;
            regionValue4731 = regionValue4673;
            regionValue4732 = regionValue4674;
            regionValue4733 = regionValue4675;
            regionValue4734 = value4680;
            regionValue4735 = 8;
            regionValue4736 = regionValue4676;
            break region1143;
        }
        }
        if (regionValue4736 == 0) {
            regionValue4745 = regionValue4717;
            regionValue4746 = regionValue4718;
            regionValue4747 = regionValue4719;
            regionValue4748 = regionValue4720;
            regionValue4750 = regionValue4722;
            regionValue4753 = regionValue4725;
            regionValue4754 = regionValue4726;
            regionValue4755 = regionValue4727;
            regionValue4756 = regionValue4728;
            regionValue4757 = regionValue4729;
            regionValue4758 = regionValue4730;
            regionValue4759 = regionValue4731;
            regionValue4760 = regionValue4732;
            regionValue4761 = regionValue4733;
            regionValue4762 = regionValue4734;
            regionValue4763 = regionValue4735;
            break region1148;
        } else {
            regionValue4772 = regionValue4717;
            regionValue4773 = regionValue4718;
            regionValue4774 = regionValue4719;
            regionValue4775 = regionValue4720;
            regionValue4777 = regionValue4722;
            regionValue4780 = regionValue4725;
            regionValue4781 = regionValue4726;
            regionValue4782 = regionValue4727;
            regionValue4783 = regionValue4728;
            regionValue4784 = regionValue4729;
            regionValue4785 = regionValue4730;
            regionValue4786 = regionValue4731;
            regionValue4787 = regionValue4732;
            regionValue4788 = regionValue4733;
            regionValue4789 = regionValue4734;
            regionValue4790 = regionValue4735;
            break region1144;
        }
        }
        regionValue4799 = regionValue4772;
        regionValue4800 = regionValue4773;
        regionValue4801 = regionValue4774;
        regionValue4802 = regionValue4775;
        regionValue4804 = regionValue4777;
        regionValue4807 = regionValue4780;
        regionValue4808 = regionValue4781;
        regionValue4809 = regionValue4782;
        regionValue4810 = regionValue4783;
        regionValue4811 = regionValue4784;
        regionValue4812 = regionValue4785;
        regionValue4813 = regionValue4786;
        regionValue4814 = regionValue4787;
        regionValue4815 = regionValue4788;
        regionValue4816 = regionValue4789;
        regionValue4817 = regionValue4790;
        break region1146;
        }
        regionValue4689 = regionValue4799;
        regionValue4690 = regionValue4800;
        regionValue4691 = regionValue4801;
        regionValue4692 = regionValue4802;
        regionValue4694 = regionValue4804;
        regionValue4697 = regionValue4807;
        regionValue4698 = regionValue4808;
        regionValue4699 = regionValue4809;
        regionValue4700 = regionValue4810;
        regionValue4701 = regionValue4811;
        regionValue4702 = regionValue4812;
        regionValue4703 = regionValue4813;
        regionValue4704 = regionValue4814;
        regionValue4705 = regionValue4815;
        regionValue4706 = regionValue4816;
        regionValue4707 = regionValue4817;
        regionValue4708 = -1;
        break region1147;
        }
        regionValue4826 = regionValue4689;
        regionValue4827 = regionValue4690;
        regionValue4828 = regionValue4691;
        regionValue4829 = regionValue4692;
        regionValue4831 = regionValue4694;
        regionValue4834 = regionValue4697;
        regionValue4835 = regionValue4698;
        regionValue4836 = regionValue4699;
        regionValue4837 = regionValue4700;
        regionValue4838 = regionValue4701;
        regionValue4839 = regionValue4702;
        regionValue4840 = regionValue4703;
        regionValue4841 = regionValue4704;
        regionValue4842 = regionValue4705;
        regionValue4843 = regionValue4706;
        regionValue4844 = regionValue4707;
        regionValue4845 = regionValue4708;
        break region1149;
        }
        regionValue4826 = regionValue4745;
        regionValue4827 = regionValue4746;
        regionValue4828 = regionValue4747;
        regionValue4829 = regionValue4748;
        regionValue4831 = regionValue4750;
        regionValue4834 = regionValue4753;
        regionValue4835 = regionValue4754;
        regionValue4836 = regionValue4755;
        regionValue4837 = regionValue4756;
        regionValue4838 = regionValue4757;
        regionValue4839 = regionValue4758;
        regionValue4840 = regionValue4759;
        regionValue4841 = regionValue4760;
        regionValue4842 = regionValue4761;
        regionValue4843 = regionValue4762;
        regionValue4844 = regionValue4763;
        regionValue4845 = 1;
        break region1149;
        }
        computed4846 = regionValue4844 * regionValue4845;
        value4847 = computed4846;
        converted4848 = (float) (regionValue4843);
        recovery$indy$flow$253(regionValue4838, regionValue4839, Float.intBitsToFloat(1109393408), converted4848, 8, value4847, 8, 8, Float.intBitsToFloat(1115684864), Float.intBitsToFloat(1115684864));
        regionValue4335 = regionValue4826;
        regionValue4336 = regionValue4827;
        regionValue4337 = regionValue4828;
        regionValue4338 = regionValue4829;
        regionValue4340 = regionValue4831;
        regionValue4343 = regionValue4834;
        regionValue4344 = regionValue4835;
        regionValue4345 = regionValue4836;
        regionValue4346 = regionValue4837;
        regionValue4347 = regionValue4838;
        regionValue4348 = regionValue4839;
        regionValue4349 = regionValue4840;
        regionValue4350 = regionValue4841;
        regionValue4351 = regionValue4842;
        break region1163;
        }
        incremented4849 = regionValue4347 + (9);
        regionValue3240 = regionValue4335;
        regionValue3241 = regionValue4336;
        regionValue3242 = regionValue4337;
        regionValue3243 = regionValue4338;
        regionValue3245 = regionValue4340;
        regionValue3248 = regionValue4343;
        regionValue3249 = regionValue4344;
        regionValue3250 = regionValue4345;
        regionValue3251 = regionValue4346;
        regionValue3252 = incremented4849;
        regionValue3253 = regionValue4348;
        regionValue3254 = regionValue4349;
        regionValue3255 = regionValue4350;
        regionValue3256 = regionValue4351;
        break region1164;
        }
        value4850 = recovery$indy$flow$254(regionValue3254);
        value4851 = recovery$indy$flow$255();
        if (((java.lang.Object) value4850) != ((java.lang.Object) value4851)) {
            regionValue4860 = regionValue3240;
            regionValue4861 = regionValue3241;
            regionValue4862 = regionValue3242;
            regionValue4863 = regionValue3243;
            regionValue4865 = regionValue3245;
            regionValue4868 = regionValue3248;
            regionValue4869 = regionValue3249;
            regionValue4870 = regionValue3250;
            regionValue4871 = regionValue3251;
            regionValue4872 = regionValue3252;
            regionValue4873 = regionValue3253;
            regionValue4874 = regionValue3254;
            regionValue4875 = regionValue3255;
            regionValue4876 = regionValue3256;
            break region1202;
        } else {
            regionValue4885 = regionValue3240;
            regionValue4886 = regionValue3241;
            regionValue4887 = regionValue3242;
            regionValue4888 = regionValue3243;
            regionValue4890 = regionValue3245;
            regionValue4893 = regionValue3248;
            regionValue4894 = regionValue3249;
            regionValue4895 = regionValue3250;
            regionValue4896 = regionValue3251;
            regionValue4897 = regionValue3252;
            regionValue4898 = regionValue3253;
            regionValue4899 = regionValue3254;
            regionValue4900 = regionValue3255;
            regionValue4901 = regionValue3256;
            break region1168;
        }
        }
        initialized4902 = new java.lang.StringBuilder();
        value4903 = recovery$indy$flow$258();
        value4904 = recovery$indy$flow$259(initialized4902, value4903);
        value4905 = recovery$indy$flow$260(value4904, regionValue4900);
        value4906 = recovery$indy$flow$261(value4905);
        value4907 = value4906;
        value4908 = recovery$indy$flow$262();
        value4909 = value4908;
        value4910 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4909))))));
        value4911 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4910)))).field_42N));
        converted4912 = (float) (regionValue4897);
        converted4913 = (float) (regionValue4898);
        value4914 = recovery$indy$flow$265(value4911, value4907, converted4912, converted4913, -1862270977);
        if (a3 <= 0) {
            regionValue4923 = regionValue4885;
            regionValue4924 = regionValue4886;
            regionValue4925 = regionValue4887;
            regionValue4926 = regionValue4888;
            regionValue4928 = regionValue4890;
            regionValue4931 = regionValue4893;
            regionValue4932 = regionValue4894;
            regionValue4933 = regionValue4895;
            regionValue4934 = regionValue4896;
            regionValue4935 = regionValue4897;
            regionValue4936 = regionValue4898;
            regionValue4937 = regionValue4899;
            regionValue4938 = value4907;
            regionValue4939 = regionValue4901;
            break region1206;
        } else {
            regionValue4948 = regionValue4885;
            regionValue4949 = regionValue4886;
            regionValue4950 = regionValue4887;
            regionValue4951 = regionValue4888;
            regionValue4953 = regionValue4890;
            regionValue4956 = regionValue4893;
            regionValue4957 = regionValue4894;
            regionValue4958 = regionValue4895;
            regionValue4959 = regionValue4896;
            regionValue4960 = regionValue4897;
            regionValue4961 = regionValue4898;
            regionValue4962 = regionValue4899;
            regionValue4963 = value4907;
            regionValue4964 = regionValue4901;
            break region1198;
        }
        }
        if (value37 == null) {
            regionValue4973 = regionValue4948;
            regionValue4974 = regionValue4949;
            regionValue4975 = regionValue4950;
            regionValue4976 = regionValue4951;
            regionValue4978 = regionValue4953;
            regionValue4981 = regionValue4956;
            regionValue4982 = regionValue4957;
            regionValue4983 = regionValue4958;
            regionValue4984 = regionValue4959;
            regionValue4985 = regionValue4960;
            regionValue4986 = regionValue4961;
            regionValue4987 = regionValue4962;
            regionValue4988 = regionValue4964;
            break region1223;
        } else {
            regionValue4997 = regionValue4948;
            regionValue4998 = regionValue4949;
            regionValue4999 = regionValue4950;
            regionValue5000 = regionValue4951;
            regionValue5002 = regionValue4953;
            regionValue5005 = regionValue4956;
            regionValue5006 = regionValue4957;
            regionValue5007 = regionValue4958;
            regionValue5008 = regionValue4959;
            regionValue5009 = regionValue4960;
            regionValue5010 = regionValue4961;
            regionValue5011 = regionValue4962;
            regionValue5012 = regionValue4963;
            regionValue5013 = regionValue4964;
            break region1200;
        }
        }
        regionValue4860 = regionValue4997;
        regionValue4861 = regionValue4998;
        regionValue4862 = regionValue4999;
        regionValue4863 = regionValue5000;
        regionValue4865 = regionValue5002;
        regionValue4868 = regionValue5005;
        regionValue4869 = regionValue5006;
        regionValue4870 = regionValue5007;
        regionValue4871 = regionValue5008;
        regionValue4872 = regionValue5009;
        regionValue4873 = regionValue5010;
        regionValue4874 = regionValue5011;
        regionValue4875 = regionValue5012;
        regionValue4876 = regionValue5013;
        break region1202;
        }
        regionValue4923 = regionValue4860;
        regionValue4924 = regionValue4861;
        regionValue4925 = regionValue4862;
        regionValue4926 = regionValue4863;
        regionValue4928 = regionValue4865;
        regionValue4931 = regionValue4868;
        regionValue4932 = regionValue4869;
        regionValue4933 = regionValue4870;
        regionValue4934 = regionValue4871;
        regionValue4935 = regionValue4872;
        regionValue4936 = regionValue4873;
        regionValue4937 = regionValue4874;
        regionValue4938 = regionValue4875;
        regionValue4939 = regionValue4876;
        break region1206;
        }
        value5014 = recovery$indy$flow$266();
        value5015 = value5014;
        value5016 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5015))))));
        value5017 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5016)))).field_42N));
        converted5018 = (float) (regionValue4935);
        converted5019 = (float) (regionValue4936);
        value5020 = recovery$indy$flow$269(value5017, regionValue4938, converted5018, converted5019, -1);
        regionValue4973 = regionValue4923;
        regionValue4974 = regionValue4924;
        regionValue4975 = regionValue4925;
        regionValue4976 = regionValue4926;
        regionValue4978 = regionValue4928;
        regionValue4981 = regionValue4931;
        regionValue4982 = regionValue4932;
        regionValue4983 = regionValue4933;
        regionValue4984 = regionValue4934;
        regionValue4985 = regionValue4935;
        regionValue4986 = regionValue4936;
        regionValue4987 = regionValue4937;
        regionValue4988 = regionValue4939;
        break region1223;
        }
        if (value599 == null) {
            regionValue5029 = regionValue4973;
            regionValue5030 = regionValue4974;
            regionValue5031 = regionValue4975;
            regionValue5032 = regionValue4976;
            regionValue5034 = regionValue4978;
            regionValue5037 = regionValue4981;
            regionValue5038 = regionValue4982;
            regionValue5039 = regionValue4983;
            regionValue5040 = regionValue4984;
            regionValue5041 = regionValue4985;
            regionValue5042 = regionValue4986;
            regionValue5043 = regionValue4987;
            break region1266;
        } else {
            regionValue5052 = regionValue4973;
            regionValue5053 = regionValue4974;
            regionValue5054 = regionValue4975;
            regionValue5055 = regionValue4976;
            regionValue5057 = regionValue4978;
            regionValue5060 = regionValue4981;
            regionValue5061 = regionValue4982;
            regionValue5062 = regionValue4983;
            regionValue5063 = regionValue4984;
            regionValue5064 = regionValue4985;
            regionValue5065 = regionValue4986;
            regionValue5066 = regionValue4987;
            regionValue5067 = regionValue4988;
            break region1225;
        }
        }
        value5068 = recovery$indy$flow$270(regionValue5066);
        value5069 = recovery$indy$flow$271();
        if (((java.lang.Object) value5068) == ((java.lang.Object) value5069)) {
            regionValue5029 = regionValue5052;
            regionValue5030 = regionValue5053;
            regionValue5031 = regionValue5054;
            regionValue5032 = regionValue5055;
            regionValue5034 = regionValue5057;
            regionValue5037 = regionValue5060;
            regionValue5038 = regionValue5061;
            regionValue5039 = regionValue5062;
            regionValue5040 = regionValue5063;
            regionValue5041 = regionValue5064;
            regionValue5042 = regionValue5065;
            regionValue5043 = regionValue5066;
            break region1266;
        } else {
            regionValue5078 = regionValue5052;
            regionValue5079 = regionValue5053;
            regionValue5080 = regionValue5054;
            regionValue5081 = regionValue5055;
            regionValue5083 = regionValue5057;
            regionValue5086 = regionValue5060;
            regionValue5087 = regionValue5061;
            regionValue5088 = regionValue5062;
            regionValue5089 = regionValue5063;
            regionValue5090 = regionValue5064;
            regionValue5091 = regionValue5065;
            regionValue5092 = regionValue5066;
            regionValue5093 = regionValue5067;
            break region1229;
        }
        }
        regionValue5102 = regionValue5078;
        regionValue5103 = regionValue5079;
        regionValue5104 = regionValue5080;
        regionValue5105 = regionValue5081;
        regionValue5107 = regionValue5083;
        regionValue5110 = regionValue5086;
        regionValue5111 = regionValue5087;
        regionValue5112 = regionValue5088;
        regionValue5113 = regionValue5089;
        regionValue5114 = regionValue5090;
        regionValue5115 = regionValue5091;
        regionValue5116 = regionValue5092;
        regionValue5117 = regionValue5093;
        break region1231;
        }
        computed5118 = regionValue5114 + regionValue5103;
        computed5119 = computed5118 + 1;
        value5120 = computed5119;
        computed5121 = value5120 + regionValue5107;
        value5122 = computed5121;
        computed5123 = value5122 - value5120;
        if (computed5123 <= 5) {
            regionValue5029 = regionValue5102;
            regionValue5030 = regionValue5103;
            regionValue5031 = regionValue5104;
            regionValue5032 = regionValue5105;
            regionValue5034 = regionValue5107;
            regionValue5037 = regionValue5110;
            regionValue5038 = regionValue5111;
            regionValue5039 = regionValue5112;
            regionValue5040 = regionValue5113;
            regionValue5041 = regionValue5114;
            regionValue5042 = regionValue5115;
            regionValue5043 = regionValue5116;
            break region1266;
        } else {
            regionValue5132 = regionValue5102;
            regionValue5133 = regionValue5103;
            regionValue5134 = regionValue5104;
            regionValue5135 = regionValue5105;
            regionValue5137 = regionValue5107;
            regionValue5140 = regionValue5110;
            regionValue5141 = regionValue5111;
            regionValue5142 = regionValue5112;
            regionValue5143 = regionValue5113;
            regionValue5144 = regionValue5114;
            regionValue5145 = regionValue5115;
            regionValue5146 = regionValue5116;
            regionValue5147 = regionValue5117;
            regionValue5148 = value5120;
            regionValue5149 = value5122;
            break region1246;
        }
        }
        value5150 = recovery$indy$flow$272();
        value5151 = value5150;
        value5152 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5151))))));
        value5153 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5152)))).field_42R));
        value5154 = recovery$indy$flow$275(value5153);
        value5155 = recovery$indy$flow$276(regionValue5147);
        recovery$indy$flow$277(value5154, value599, regionValue5145, value5155, regionValue5148, regionValue5149, regionValue5146);
        regionValue5029 = regionValue5132;
        regionValue5030 = regionValue5133;
        regionValue5031 = regionValue5134;
        regionValue5032 = regionValue5135;
        regionValue5034 = regionValue5137;
        regionValue5037 = regionValue5140;
        regionValue5038 = regionValue5141;
        regionValue5039 = regionValue5142;
        regionValue5040 = regionValue5143;
        regionValue5041 = regionValue5144;
        regionValue5042 = regionValue5145;
        regionValue5043 = regionValue5146;
        break region1266;
        }
        value5156 = recovery$indy$flow$278();
        value5157 = value5156;
        value5158 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5157))))));
        value5159 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5158)))).field_42R));
        value5160 = recovery$indy$flow$281(value5159);
        if (value37 != null) {
            regionValue5169 = regionValue5029;
            regionValue5170 = regionValue5030;
            regionValue5171 = regionValue5031;
            regionValue5172 = regionValue5032;
            regionValue5174 = regionValue5034;
            regionValue5177 = regionValue5037;
            regionValue5178 = regionValue5038;
            regionValue5179 = regionValue5039;
            regionValue5180 = regionValue5040;
            regionValue5181 = regionValue5042;
            regionValue5182 = regionValue5043;
            regionValue5183 = value5160;
            regionValue5185 = regionValue5041;
            regionValue5186 = regionValue1362;
            break region1285;
        } else {
            regionValue5195 = regionValue5029;
            regionValue5196 = regionValue5030;
            regionValue5197 = regionValue5031;
            regionValue5198 = regionValue5032;
            regionValue5200 = regionValue5034;
            regionValue5203 = regionValue5037;
            regionValue5204 = regionValue5038;
            regionValue5205 = regionValue5039;
            regionValue5206 = regionValue5040;
            regionValue5207 = regionValue5042;
            regionValue5208 = regionValue5043;
            regionValue5209 = value5160;
            regionValue5211 = regionValue5041;
            break region1281;
        }
        }
        if (regionValue1362 == 0) {
            regionValue5221 = regionValue5195;
            regionValue5222 = regionValue5196;
            regionValue5223 = regionValue5197;
            regionValue5224 = regionValue5198;
            regionValue5226 = regionValue5200;
            regionValue5229 = regionValue5203;
            regionValue5230 = regionValue5204;
            regionValue5231 = regionValue5205;
            regionValue5232 = regionValue5206;
            regionValue5233 = regionValue5207;
            regionValue5234 = regionValue5208;
            regionValue5235 = regionValue5209;
            regionValue5237 = regionValue5211;
            break region1286;
        } else {
            regionValue5246 = regionValue5195;
            regionValue5247 = regionValue5196;
            regionValue5248 = regionValue5197;
            regionValue5249 = regionValue5198;
            regionValue5251 = regionValue5200;
            regionValue5254 = regionValue5203;
            regionValue5255 = regionValue5204;
            regionValue5256 = regionValue5205;
            regionValue5257 = regionValue5206;
            regionValue5258 = regionValue5207;
            regionValue5259 = regionValue5208;
            regionValue5260 = regionValue5209;
            regionValue5262 = regionValue5211;
            break region1282;
        }
        }
        regionValue5271 = regionValue5246;
        regionValue5272 = regionValue5247;
        regionValue5273 = regionValue5248;
        regionValue5274 = regionValue5249;
        regionValue5276 = regionValue5251;
        regionValue5279 = regionValue5254;
        regionValue5280 = regionValue5255;
        regionValue5281 = regionValue5256;
        regionValue5282 = regionValue5257;
        regionValue5283 = regionValue5258;
        regionValue5284 = regionValue5259;
        regionValue5285 = regionValue5260;
        regionValue5287 = regionValue5262;
        break region1284;
        }
        regionValue5169 = regionValue5271;
        regionValue5170 = regionValue5272;
        regionValue5171 = regionValue5273;
        regionValue5172 = regionValue5274;
        regionValue5174 = regionValue5276;
        regionValue5177 = regionValue5279;
        regionValue5178 = regionValue5280;
        regionValue5179 = regionValue5281;
        regionValue5180 = regionValue5282;
        regionValue5181 = regionValue5283;
        regionValue5182 = regionValue5284;
        regionValue5183 = regionValue5285;
        regionValue5185 = regionValue5287;
        regionValue5186 = 9;
        break region1285;
        }
        regionValue5296 = regionValue5169;
        regionValue5297 = regionValue5170;
        regionValue5298 = regionValue5171;
        regionValue5299 = regionValue5172;
        regionValue5301 = regionValue5174;
        regionValue5304 = regionValue5177;
        regionValue5305 = regionValue5178;
        regionValue5306 = regionValue5179;
        regionValue5307 = regionValue5180;
        regionValue5308 = regionValue5181;
        regionValue5309 = regionValue5182;
        regionValue5310 = regionValue5183;
        regionValue5312 = regionValue5185;
        regionValue5313 = regionValue5186;
        break region1287;
        }
        regionValue5296 = regionValue5221;
        regionValue5297 = regionValue5222;
        regionValue5298 = regionValue5223;
        regionValue5299 = regionValue5224;
        regionValue5301 = regionValue5226;
        regionValue5304 = regionValue5229;
        regionValue5305 = regionValue5230;
        regionValue5306 = regionValue5231;
        regionValue5307 = regionValue5232;
        regionValue5308 = regionValue5233;
        regionValue5309 = regionValue5234;
        regionValue5310 = regionValue5235;
        regionValue5312 = regionValue5237;
        regionValue5313 = 0;
        break region1287;
        }
        computed5314 = regionValue5312 - regionValue5313;
        recovery$indy$flow$282(regionValue5310, computed1768, computed5314, regionValue5308, regionValue5309);
        regionValue3119 = regionValue5296;
        regionValue3120 = regionValue5297;
        regionValue3121 = regionValue5298;
        regionValue3122 = regionValue5299;
        regionValue3124 = regionValue5301;
        regionValue3127 = regionValue5304;
        regionValue3128 = regionValue5305;
        regionValue3129 = regionValue5306;
        regionValue3130 = regionValue5307;
        break region1291;
        }
        incremented5315 = regionValue3130 + (1);
        regionValue2995 = regionValue3119;
        regionValue2996 = regionValue3120;
        regionValue2997 = regionValue3121;
        regionValue2998 = regionValue3122;
        regionValue3000 = regionValue3124;
        regionValue3003 = regionValue3127;
        regionValue3004 = regionValue3128;
        regionValue3005 = regionValue3129;
        regionValue3006 = incremented5315;
        break region1292;
        }
        regionValue2951 = regionValue2995;
        regionValue2952 = regionValue2996;
        regionValue2953 = regionValue2997;
        regionValue2954 = regionValue2998;
        regionValue2956 = regionValue3000;
        regionValue2959 = regionValue3003;
        regionValue2960 = regionValue3004;
        regionValue2961 = regionValue3005;
        regionValue2962 = regionValue3006;
        break region1293;
        }
        if (value37 == null) {
            regionValue2887 = regionValue2951;
            regionValue2888 = regionValue2952;
            regionValue2889 = regionValue2953;
            regionValue2890 = regionValue2954;
            regionValue2892 = regionValue2956;
            regionValue2895 = regionValue2959;
            regionValue2896 = regionValue2960;
            regionValue2897 = regionValue2961;
            regionValue2898 = regionValue2962;
            continue loop920;
        } else {
            regionValue2905 = regionValue2954;
            regionValue2906 = regionValue2959;
            regionValue2907 = regionValue2960;
            regionValue2908 = regionValue2961;
            break region1294;
        }
        }
        }
        recovery$indy$flow$283();
        if (a0 <= 0) {
            regionValue5322 = regionValue2906;
            regionValue5323 = regionValue2908;
            break region1354;
        } else {
            regionValue5330 = regionValue2905;
            regionValue5331 = regionValue2906;
            regionValue5332 = regionValue2907;
            regionValue5333 = regionValue2908;
            regionValue5334 = regionValue2908;
            break region1298;
        }
        }
        if (value37 != null) {
            regionValue5322 = regionValue5331;
            regionValue5323 = regionValue5334;
            break region1354;
        } else {
            regionValue5341 = regionValue5330;
            regionValue5342 = regionValue5331;
            regionValue5343 = regionValue5332;
            regionValue5344 = regionValue5333;
            regionValue5345 = regionValue5334;
            break region1300;
        }
        }
        regionValue5352 = regionValue5341;
        regionValue5353 = regionValue5342;
        regionValue5354 = regionValue5343;
        regionValue5355 = regionValue5344;
        regionValue5356 = regionValue5345;
        break region1302;
        }
        if (regionValue5356 == null) {
            break region1425;
        } else {
            regionValue5364 = regionValue5352;
            regionValue5365 = regionValue5353;
            regionValue5366 = regionValue5354;
            regionValue5367 = regionValue5355;
            break region1303;
        }
        }
        regionValue5374 = regionValue5364;
        regionValue5375 = regionValue5365;
        regionValue5376 = regionValue5366;
        regionValue5377 = regionValue5367;
        break region1305;
        }
        computed5378 = regionValue5374 * 9;
        computed5379 = regionValue5375 + computed5378;
        computed5380 = computed5379 + 1;
        computed5382 = value591 / 2;
        computed5383 = regionValue5376 / 2;
        computed5384 = computed5382 - computed5383;
        computed5385 = computed5384 - 1;
        computed5386 = computed5380 - 1;
        regionValue3058 = computed5380;
        regionValue3059 = regionValue5376;
        regionValue3060 = regionValue5377;
        regionValue3061 = computed5385;
        regionValue3062 = computed5386;
        break region1325;
        }
        computed5387 = value591 / 2;
        computed5388 = regionValue3059 / 2;
        computed5389 = computed5387 + computed5388;
        computed5390 = computed5389 + 1;
        value5391 = recovery$indy$flow$284(regionValue3060);
        value5392 = recovery$indy$flow$285();
        value5394 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5392))))));
        value5395 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5394)))).field_42N));
        value5396 = recovery$indy$flow$288(value5395);
        computed5397 = value5391 * value5396;
        computed5398 = regionValue3058 + computed5397;
        recovery$indy$flow$289(regionValue3061, regionValue3062, computed5390, computed5398, -2147483648);
        regionValue5322 = regionValue3058;
        regionValue5323 = regionValue3060;
        break region1354;
        }
        value5399 = recovery$indy$flow$290(regionValue5323);
        regionValue5407 = regionValue5322;
        break region1356;
        }
        loop1356: while (true) {
        int regionValue5450;

        region1424: {
        int regionValue5476;

        region1423: {
        int regionValue5468;

        region1421: {
        int regionValue5459;

        region1420: {
        int value5443;
        java.lang.Object value5420;
        int regionValue5416;
        int value5441;
        java.lang.Object value5440;
        java.lang.Object value5439;
        java.lang.Object value5438;
        java.lang.Object value5437;
        java.lang.Object value5430;
        java.lang.Object value5429;
        java.lang.Object value5428;
        java.lang.Object value5427;
        int value5426;
        int value5425;
        java.lang.Object value5424;
        java.lang.Object value5423;
        java.lang.Object value5422;
        java.lang.Object value5421;
        java.lang.Object value5419;
        java.lang.Object value5418;
        float converted5435;
        float converted5434;
        int computed5442;
        int computed5433;
        int computed5432;
        int computed5431;
        int value5436;

        region1359: {
        boolean value5409;

        value5409 = recovery$indy$flow$291(value5399);
        if ((int) ((value5409 ? 1 : 0)) == 0) {
            break region1425;
        } else {
            regionValue5416 = regionValue5407;
            break region1359;
        }
        }
        value5418 = recovery$indy$flow$292(value5399);
        value5419 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value5418))))));
        value5420 = value5419;
        value5421 = recovery$indy$flow$294();
        value5422 = value5421;
        value5423 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5422))))));
        value5424 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5423)))).field_42N));
        value5425 = recovery$indy$flow$297(value5424, value5420);
        value5426 = value5425;
        value5427 = recovery$indy$flow$298();
        value5428 = value5427;
        value5429 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5428))))));
        value5430 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5429)))).field_42N));
        computed5431 = value591 / 2;
        computed5432 = value5426 / 2;
        computed5433 = computed5431 - computed5432;
        converted5434 = (float) (computed5433);
        converted5435 = (float) (regionValue5416);
        value5436 = recovery$indy$flow$301(value5430, value5420, converted5434, converted5435, -1);
        value5437 = recovery$indy$flow$302();
        value5438 = value5437;
        value5439 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5438))))));
        value5440 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5439)))).field_42N));
        value5441 = recovery$indy$flow$305(value5440);
        computed5442 = regionValue5416 + value5441;
        value5443 = computed5442;
        if (a2 < 0) {
            regionValue5450 = value5443;
            break region1424;
        } else {
            regionValue5459 = value5443;
            break region1420;
        }
        }
        if (value37 != null) {
            break region1430;
        } else {
            regionValue5468 = regionValue5459;
            break region1421;
        }
        }
        regionValue5476 = regionValue5468;
        break region1423;
        }
        regionValue5450 = regionValue5476;
        break region1424;
        }
        if (value37 == null) {
            regionValue5407 = regionValue5450;
            continue loop1356;
        } else {
            break region1425;
        }
        }
        }
        if (a0 <= 0) {
            break region1430;
        } else {
            break region1427;
        }
        }
        recovery$indy$flow$306();
        break region1430;
        }
        return;
    }














   private ScaledResolution method_48$c1ad8b8e2e(long var1, ScaledResolution var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 131236076411073L;
      GL11.glScaled(1.0F / var3.method_40$8abf5c6871(), 1.0F / var3.method_40$8abf5c6871(), 1.0);
      GL11.glScaled(recovery$indy$12(this.settingScale, var4, 1494177787450687118L, var1), recovery$indy$13(this.settingScale, var4, 1494177787450687118L, var1), 1.0);
      return new ScaledResolution(
         field_43.field_44f * (1.0 / recovery$indy$14(this.settingScale, var4, 1494177787450687118L, var1)),
         field_43.field_44g * (1.0 / recovery$indy$15(this.settingScale, var4, 1494177787450687118L, var1)),
         (int)recovery$indy$16(this.settingScale, var4, 1494177787450687118L, var1)
      );
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 98320077060198L;
      long var10000 = -2371470358995043369L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -2371654433530195553L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 32153943115288L;
      long var10000 = 2407345595135329705L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 2407302154976767969L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private void method_47$5f0712d845(int var1, int var2, int var3, int var4, List var5, List var6, int var7, int var8, int var9, List var10, RenderPass var11) {
      long var12 = a ^ 10580421623934L;
      long var14 = var12 ^ 79547944783097L;
      long var16 = var12 ^ 81372389476569L;
      long var10000 = 7426023131379844047L;
      int[] var18 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var11 == RenderPass.SHADOW) {
         long var10008 = 7422455561716131861L;
         List var19 = var6;
         List var20 = var5;
         long var21 = var14;
         int var23 = var4;
         int var24 = var3;
         int var25 = var2;
         int var26 = var1;
         TabList_47H7 var27 = this;
         var27.method_44$d121023614(var26, var25, var24, var23, var21, var20, var19);
         if (var18 == null) {
            return;
         }
      }

      long var10011 = 7423429552440422491L;
      long var28 = var16;
      List var30 = var10;
      List var31 = var5;
      int var32 = var9;
      int var33 = var8;
      int var34 = var7;
      int var35 = var4;
      int var36 = var3;
      int var37 = var2;
      int var38 = var1;
      TabList_47H7 var39 = this;
      var39.method_40$be4932ce22(var38, var37, var36, var35, var34, var33, var32, var31, var30, var28);
   }



   private boolean method_46w$aae029aa0a() {
      long var1 = a ^ 32988303183261L;
      long var10000 = 7704989560470031916L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 7704946139226727524L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$17(this, 32, var3, -7099979912340672809L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   private boolean method_46x$aae029aa0a() {
      long var1 = a ^ 47029284485935L;
      long var10000 = 2044541785383155870L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 2044426927820509910L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_46B$aae029aa0a() {
      long var1 = a ^ 75764953930061L;
      long var10000 = -126727758644159748L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -126895357490761548L;
      BooleanSetting var4 = this.settingRemove;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



    public TabList_47H7(short a0,char a1,int a2) {
        super((java.lang.String) ("TabList"),(java.lang.String) ("TabulaturListe"),(long) (((((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.render.TabList_47H7.a) ^ 71542783586609L)),(java.awt.Color) (new java.awt.Color((int) (162),(int) (250),(int) (115))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = (((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.render.TabList_47H7.a);
        long constructorKey2 = ((((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.render.TabList_47H7.a) ^ 63652578097175L);
        long constructorKey3 = ((((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.render.TabList_47H7.a) ^ 99844072889736L);
        long constructorKey4 = ((((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.render.TabList_47H7.a) ^ 41254531690181L);
        long constructorKey5 = ((((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.render.TabList_47H7.a) ^ 53007841848618L);
        long constructorKey6 = ((((((long) (a0) << 48) | (((long) (a1) << 48) >>> 16)) | (((long) (a2) << 32) >>> 32)) ^ augustus.recovered.modules.render.TabList_47H7.a) ^ 32357927703213L);
        client.setting.BooleanSetting initialized7 = new client.setting.BooleanSetting(this, constructorKey5, "Remove", false);
        recovery$indy$flow$367(this, initialized7);
        client.setting.NumberSetting initialized8 = new client.setting.NumberSetting(this, "Scale", Double.longBitsToDouble(4611686018427387904L), constructorKey6, 1.0D, Double.longBitsToDouble(4616189618054758400L), 2);
        java.lang.Object initialValue9 = recovery$indy$flow$370(this);
        java.lang.Object initialValue10 = initialValue9;
        client.setting.NumberSetting initialValue11 = initialized8;
        java.lang.Object initialValue12 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue11))))));
        java.lang.Object initialValue13 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue10))))));
        java.lang.Object initialValue14 = recovery$indy$flow$373(initialValue12, initialValue13);
        recovery$indy$flow$374(this, initialValue14);
        client.setting.BooleanSetting initialized15 = new client.setting.BooleanSetting(this, constructorKey5, "PingNumber", false);
        java.lang.Object initialValue16 = recovery$indy$flow$377(this);
        java.lang.Object initialValue17 = initialValue16;
        long initialValue18 = constructorKey2;
        client.setting.BooleanSetting initialValue19 = initialized15;
        java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue21 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue22 = recovery$indy$flow$380(initialValue20, initialValue18, initialValue21);
        java.lang.Object initialValue23 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue22))))));
        recovery$indy$flow$382(this, initialValue23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey5, "AlwaysOpen", false);
        java.lang.Object initialValue25 = recovery$indy$flow$385(this);
        java.lang.Object initialValue26 = initialValue25;
        long initialValue27 = constructorKey2;
        client.setting.BooleanSetting initialValue28 = initialized24;
        java.lang.Object initialValue29 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue28))))));
        java.lang.Object initialValue30 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue31 = recovery$indy$flow$388(initialValue29, initialValue27, initialValue30);
        java.lang.Object initialValue32 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue31))))));
        recovery$indy$flow$390(this, initialValue32);
        client.setting.NumberSetting initialized33 = new client.setting.NumberSetting(this, "RowSize", Double.longBitsToDouble(4635329916471083008L), constructorKey6, Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4641240890982006784L), 1);
        java.lang.Object initialValue34 = recovery$indy$flow$393(this);
        java.lang.Object initialValue35 = initialValue34;
        client.setting.NumberSetting initialValue36 = initialized33;
        java.lang.Object initialValue37 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue38 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue35))))));
        java.lang.Object initialValue39 = recovery$indy$flow$396(initialValue37, initialValue38);
        recovery$indy$flow$397(this, initialValue39);
        client.setting.NumberSetting initialized40 = new client.setting.NumberSetting(this, "ColumnSize", Double.longBitsToDouble(4626322717216342016L), constructorKey6, 1.0D, Double.longBitsToDouble(4641240890982006784L), 1);
        java.lang.Object initialValue41 = recovery$indy$flow$400(this);
        java.lang.Object initialValue42 = initialValue41;
        client.setting.NumberSetting initialValue43 = initialized40;
        java.lang.Object initialValue44 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue43))))));
        java.lang.Object initialValue45 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue42))))));
        java.lang.Object initialValue46 = recovery$indy$flow$403(initialValue44, initialValue45);
        recovery$indy$flow$404(this, initialValue46);
        client.setting.ShaderOptions initialized47 = new client.setting.ShaderOptions(this, constructorKey3);
        java.lang.Object initialValue48 = recovery$indy$flow$407();
        java.lang.Object initialValue49 = initialValue48;
        long initialValue50 = constructorKey4;
        client.setting.ShaderOptions initialValue51 = initialized47;
        java.lang.Object initialValue52 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue51))))));
        java.lang.Object initialValue53 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue54 = recovery$indy$flow$410(initialValue52, initialValue50, initialValue53);
        java.lang.Object initialValue55 = recovery$indy$flow$411(this);
        java.lang.Object initialValue56 = initialValue55;
        long initialValue57 = constructorKey2;
        java.lang.Object initialValue58 = initialValue54;
        java.lang.Object initialValue59 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue58))))));
        java.lang.Object initialValue60 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue56))))));
        java.lang.Object initialValue61 = recovery$indy$flow$414(initialValue59, initialValue57, initialValue60);
        java.lang.Object initialValue62 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue61))))));
        recovery$indy$flow$416(this, initialValue62);
        return;
    }





    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$50();
    private static java.lang.Object recovery$indy$flow$51() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }



    private static native boolean recovery$indy$flow$55(java.lang.Object a0);


    private static native boolean recovery$indy$flow$58(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$59() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }

    private static native boolean recovery$indy$flow$61(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$62() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$66(java.lang.Object a0);
    private static boolean recovery$indy$flow$67(java.lang.Object a0) {
        return ((java.util.Collection) (a0)).isEmpty();
    }
    private static java.lang.Object recovery$indy$flow$68() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$71(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$72() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$75(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$76() {
        return client.ClientGlobals.field_48;
    }



    private static native boolean recovery$indy$flow$80(java.lang.Object a0);
    private static native void recovery$indy$flow$81();


    private static native java.lang.Object recovery$indy$flow$84(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native int recovery$indy$flow$85(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$86() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$89(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$90(java.lang.Object a0,int a1);
    private static java.lang.Object recovery$indy$flow$91() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }



    private static java.lang.Object recovery$indy$flow$95() {
        return net.C_47Lt.field_47;
    }
    private static native java.lang.Object recovery$indy$flow$96(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$97(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$98(java.lang.Object a0) {
        return ((java.util.List) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$99(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$100(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static java.lang.Object recovery$indy$flow$102() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$107(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$108(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$109(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native int recovery$indy$flow$110(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$111(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$112(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native int recovery$indy$flow$113(java.lang.Object a0,java.lang.Object a1);
    private static int recovery$indy$flow$114(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }
    private static native java.lang.Object recovery$indy$flow$115(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$116() {
        return net.C_474A.HEARTS;
    }
    private static java.lang.Object recovery$indy$flow$117() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static java.lang.Object recovery$indy$flow$122(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$123(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$124(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$125(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2);
    private static native int recovery$indy$flow$126(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$127(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$128(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native int recovery$indy$flow$129(java.lang.Object a0,java.lang.Object a1);
    private static int recovery$indy$flow$130(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }
    private static int recovery$indy$flow$131(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }


    private static native double recovery$indy$flow$134(java.lang.Object a0,long a1);
    private static int recovery$indy$flow$135(int a0,int a1) {
        return java.lang.Math.min(a0, a1);
    }
    private static java.lang.Object recovery$indy$flow$136(java.lang.Object a0,int a1,int a2) {
        return ((java.util.List) (a0)).subList(a1, a2);
    }
    private static int recovery$indy$flow$137(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }


    private static native double recovery$indy$flow$140(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$141() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }

    private static native boolean recovery$indy$flow$143(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$144() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$146(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$147(java.lang.Object a0);
    private static native boolean recovery$indy$flow$148(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$149(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$150() {
        return net.C_474A.HEARTS;
    }
    private static int recovery$indy$flow$151(int a0,int a1) {
        return java.lang.Math.min(a0, a1);
    }
    private static java.lang.Object recovery$indy$flow$152() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$155(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$156(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$157() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$160(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$161(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$162() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$165(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$166(java.lang.Object a0,java.lang.Object a1,int a2);
    private static java.lang.Object recovery$indy$flow$167(java.lang.Object a0) {
        return ((java.util.List) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$168(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$169(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static java.lang.Object recovery$indy$flow$171() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native int recovery$indy$flow$174(java.lang.Object a0,java.lang.Object a1);
    private static int recovery$indy$flow$175(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }
    private static java.lang.Object recovery$indy$flow$176() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$179(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$180(java.lang.Object a0,java.lang.Object a1,int a2);
    private static java.lang.Object recovery$indy$flow$181(java.lang.Object a0) {
        return ((java.util.List) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$182(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$183(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static java.lang.Object recovery$indy$flow$185() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native int recovery$indy$flow$188(java.lang.Object a0,java.lang.Object a1);
    private static int recovery$indy$flow$189(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }


    private static native boolean recovery$indy$flow$192(java.lang.Object a0,long a1);


    private static native boolean recovery$indy$flow$195(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$196(boolean a0,boolean a1,long a2);
    private static native void recovery$indy$flow$197();
    private static native java.lang.Object recovery$indy$flow$198(java.lang.Object a0,int a1,int a2,int a3,int a4,java.lang.Object a5,java.lang.Object a6,int a7,int a8,int a9,java.lang.Object a10);

    private static native void recovery$indy$flow$200(boolean a0,long a1,java.lang.Object a2);
    private static int recovery$indy$flow$201(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$202() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static int recovery$indy$flow$205(java.lang.Object a0) {
        return ((net.minecraft.client.gui.FontRenderer) (a0)).field_47;
    }
    private static native void recovery$indy$flow$206(int a0,int a1,int a2,int a3,int a4);
    private static java.lang.Object recovery$indy$flow$207(java.lang.Object a0) {
        return ((java.util.List) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$208(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$209(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static java.lang.Object recovery$indy$flow$211() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native int recovery$indy$flow$214(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$215() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native int recovery$indy$flow$218(java.lang.Object a0,java.lang.Object a1,float a2,float a3,int a4);
    private static java.lang.Object recovery$indy$flow$219() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static int recovery$indy$flow$222(java.lang.Object a0) {
        return ((net.minecraft.client.gui.FontRenderer) (a0)).field_47;
    }
    private static native void recovery$indy$flow$223(int a0,int a1,int a2,int a3,int a4);
    private static native void recovery$indy$flow$224(int a0,int a1,int a2,int a3,int a4);
    private static native void recovery$indy$flow$225(float a0,float a1,float a2,float a3);
    private static native void recovery$indy$flow$226();
    private static native void recovery$indy$flow$227();
    private static native void recovery$indy$flow$228(int a0,int a1,int a2,int a3);
    private static int recovery$indy$flow$229(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$230(java.lang.Object a0,int a1) {
        return ((java.util.List) (a0)).get(a1);
    }

    private static native java.lang.Object recovery$indy$flow$232(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$233(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$234() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$237(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$238(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$239() {
        return net.C_47ID.CAPE;
    }
    private static native boolean recovery$indy$flow$240(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$241(java.lang.Object a0);
    private static boolean recovery$indy$flow$242(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static native java.lang.Object recovery$indy$flow$243(java.lang.Object a0);
    private static boolean recovery$indy$flow$244(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$245() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$247(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$248(java.lang.Object a0);
    private static native void recovery$indy$flow$249(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$250(int a0,int a1,float a2,float a3,int a4,int a5,int a6,int a7,float a8,float a9);
    private static java.lang.Object recovery$indy$flow$251() {
        return net.C_47ID.HAT;
    }
    private static native boolean recovery$indy$flow$252(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$253(int a0,int a1,float a2,float a3,int a4,int a5,int a6,int a7,float a8,float a9);
    private static native java.lang.Object recovery$indy$flow$254(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$255() {
        return net.C_47IT.SPECTATOR;
    }
    private static java.lang.Object recovery$indy$flow$258() {
        return net.C_47Pf.ITALIC;
    }
    private static java.lang.Object recovery$indy$flow$259(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$260(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$261(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$262() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native int recovery$indy$flow$265(java.lang.Object a0,java.lang.Object a1,float a2,float a3,int a4);
    private static java.lang.Object recovery$indy$flow$266() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native int recovery$indy$flow$269(java.lang.Object a0,java.lang.Object a1,float a2,float a3,int a4);
    private static native java.lang.Object recovery$indy$flow$270(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$271() {
        return net.C_47IT.SPECTATOR;
    }
    private static java.lang.Object recovery$indy$flow$272() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$275(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$276(java.lang.Object a0);
    private static native void recovery$indy$flow$277(java.lang.Object a0,java.lang.Object a1,int a2,java.lang.Object a3,int a4,int a5,java.lang.Object a6);
    private static java.lang.Object recovery$indy$flow$278() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$281(java.lang.Object a0);
    private static native void recovery$indy$flow$282(java.lang.Object a0,int a1,int a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$283();
    private static int recovery$indy$flow$284(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$285() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static int recovery$indy$flow$288(java.lang.Object a0) {
        return ((net.minecraft.client.gui.FontRenderer) (a0)).field_47;
    }
    private static native void recovery$indy$flow$289(int a0,int a1,int a2,int a3,int a4);
    private static java.lang.Object recovery$indy$flow$290(java.lang.Object a0) {
        return ((java.util.List) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$291(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$292(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static java.lang.Object recovery$indy$flow$294() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native int recovery$indy$flow$297(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$298() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static native int recovery$indy$flow$301(java.lang.Object a0,java.lang.Object a1,float a2,float a3,int a4);
    private static java.lang.Object recovery$indy$flow$302() {
        return augustus.recovered.modules.render.TabList_47H7.field_43;
    }


    private static int recovery$indy$flow$305(java.lang.Object a0) {
        return ((net.minecraft.client.gui.FontRenderer) (a0)).field_47;
    }
    private static native void recovery$indy$flow$306();
    private static native void recovery$indy$flow$367(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$370(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$373(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$374(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$377(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$380(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$382(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$385(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$388(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$390(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$393(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$396(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$397(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$400(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$403(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$404(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$407() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$410(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$411(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$414(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$416(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native FontRenderer recovery$indy$2(Object var0, long var1, long var3);
   private static native FontRenderer recovery$indy$3(Object var0, long var1, long var3);
   private static native FontRenderer recovery$indy$4(Object var0, long var1, long var3);
   private static native int[] recovery$indy$5(long var0, long var2);
   private static native FontRenderer recovery$indy$6(Object var0, long var1, long var3);
   private static native int recovery$indy$7(Object var0, int var1, long var2, long var4, long var6);
   private static native FontRenderer recovery$indy$8(Object var0, long var1, long var3);
   private static native FontRenderer recovery$indy$9(Object var0, long var1, long var3);
   private static native int recovery$indy$10(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$14(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$15(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$16(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$24();
}
