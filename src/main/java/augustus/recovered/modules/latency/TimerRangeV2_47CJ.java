package augustus.recovered.modules.latency;
import augustus.recovered.modules.combat.KillAura_47CY;
import augustus.recovered.modules.legit.Range_47CT;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_473U;
import net.C_475e;
import net.C_478Q;
import net.C_478i;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47H;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import net.C_47TT;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47WF;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.C_47eb;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import net.C_47ru;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47zh;
import net.C_48i;
import net.C_48p;
import net.C_48q;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class TimerRangeV2_47CJ extends client.module.Module implements net.C_48q,net.C_47mz {
    private final client.setting.BooleanSetting settingDynamicLagTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLagTickDiff = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLagTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingTimerTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaxTargetHurttime = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCorrect = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDynamic = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAccurate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDebug = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyOnGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingFixMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingExtreme = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyWhileKillAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingTargets2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingPreAimRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47cu field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    public int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43n; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_478i field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

   public void method_46$e535f8442d(C_47zh var1, long var2, short var4) {
      long var5 = var2 << 16 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 115002472062334L;
      long var9 = var5 ^ 13538434133415L;
      String var11 = recovery$indy$1(1767285284467982118L, var5);
      if (!recovery$indy$2(this.settingFixMode, var7, 1772292755991538040L, var5).equals(recovery$indy$3(21638, 7849536545611611791L ^ var5))) {
         EntityPlayerSP var10000 = recovery$indy$4(field_43, 1773004694215756564L, var5);
         if (var11 == null) {
            if (var10000 == null) {
               return;
            }

            var10000 = recovery$indy$5(field_43, 1773004694215756564L, var5);
         }

         if (var10000.field_48y > 10) {
            recovery$indy$6(var1, var9, this.field_43a, 1767193110027993209L, var5);
         }
      }
   }



    public void method_46$2c4d5d53cf(long a0,net.C_47H a1) {
        long computed9;
        long computed11;
        long computed13;
        long computed15;
        long computed17;
        long computed19;
        long computed20;
        int converted21;
        long computed23;
        long computed24;
        int converted25;
        long computed27;
        long computed28;
        int converted29;
        long computed31;
        long computed33;
        java.lang.Object value37;
        java.lang.Object value38;
        java.lang.Object value40;
        java.lang.Object value41;
        java.lang.Object value43;
        boolean value44;
        int value46;
        java.lang.Object value48;
        java.lang.Object value50;
        java.lang.Object value53;
        double value54;
        int converted55;
        java.lang.Object value57;
        java.lang.Object value60;
        double value61;
        int comparison62;
        int regionValue78;
        java.lang.Object value217;
        java.lang.Object value219;
        boolean value220;
        int regionValue236;
        int edgeValue252;
        int edgeValue284;
        boolean value392;
        int edgeValue408;
        int edgeValue424;
        int regionValue440;
        int edgeValue456;
        int edgeValue547;
        int regionValue563;
        int edgeValue579;
        int edgeValue595;
        java.lang.Object value596;
        java.lang.Object value598;
        boolean value599;
        int regionValue614;
        int edgeValue629;
        int edgeValue659;
        java.lang.Object value744;
        java.lang.Object value747;
        double value748;
        int converted749;
        java.lang.Object value765;
        int value766;
        int regionValue792;
        int regionValue793;
        int edgeValue804;
        int edgeValue805;
        int regionValue820;
        int edgeValue836;
        int edgeValue837;
        boolean value914;
        int comparison915;
        int regionValue929;
        int edgeValue944;
        int edgeValue976;
        int regionValue1023;
        int value1154;
        int regionValue1165;
        java.lang.Object value1303;
        java.lang.Object value1304;
        java.lang.Object value1307;
        double value1308;
        java.lang.Object value1312;
        boolean value1313;
        int regionValue1328;
        int edgeValue1343;
        int edgeValue1373;
        java.lang.Object value1492;
        java.lang.Object value1494;
        boolean value1495;
        int edgeValue1510;
        double converted1567;
        java.lang.Object value1568;
        java.lang.Object value1571;
        double value1572;
        double computed1573;
        double regionValue1588;
        java.lang.Object value1619;
        java.lang.Object value1622;
        double value1623;
        int converted1639;
        int comparison1641;
        int regionValue1978;
        int value1995;
        int regionValue2026;
        int edgeValue2042;
        int value2043;
        int value2044;
        int value2045;
        java.lang.Object value2049;
        java.lang.Object value2050;
        boolean value2051;
        int value2052;
        int comparison2053;
        int regionValue2069;
        int regionValue2070;
        int edgeValue2087;
        int edgeValue2088;
        int regionValue2105;
        int regionValue2106;
        int edgeValue2123;
        int edgeValue2124;
        int regionValue2141;
        int edgeValue2157;
        int regionValue2173;
        int regionValue2174;
        int edgeValue2190;
        int edgeValue2191;
        int regionValue2207;
        int regionValue2208;
        int edgeValue2224;
        int edgeValue2225;
        int edgeValue2241;
        int edgeValue2242;
        int regionValue2259;
        int regionValue2260;
        int edgeValue2276;
        int edgeValue2277;
        int regionValue2293;
        int regionValue2294;
        int edgeValue2310;
        int edgeValue2311;
        int regionValue2327;
        int edgeValue2343;
        int regionValue2359;
        int edgeValue2375;
        int comparison2376;
        int regionValue2424;
        int edgeValue2441;
        int regionValue2458;
        int edgeValue2475;
        int regionValue2507;
        int edgeValue2523;
        int edgeValue2539;
        int comparison2540;
        int regionValue2556;
        int edgeValue2573;
        int regionValue2590;
        int edgeValue2607;
        int regionValue2624;
        int edgeValue2641;
        int regionValue2658;
        int edgeValue2674;
        int regionValue2690;
        int edgeValue2706;
        int regionValue2722;
        int edgeValue2738;
        java.lang.Object value2739;
        java.lang.Object value2740;
        java.lang.Object value2741;
        boolean value2742;
        int edgeValue2758;
        int edgeValue2759;
        int regionValue2775;
        int edgeValue2791;
        int regionValue2807;
        int edgeValue2823;
        int comparison2824;
        int regionValue2856;
        int edgeValue2873;
        int regionValue2890;
        int edgeValue2907;
        int regionValue2939;
        int edgeValue2955;
        int edgeValue2971;
        int incremented2972;
        int edgeValue2988;
        int edgeValue3004;
        int edgeValue3021;
        int comparison3053;
        boolean value3194;
        int edgeValue3210;
        int regionValue3300;
        int edgeValue3454;
        int regionValue3470;
        int edgeValue3486;
        int edgeValue3502;
        java.lang.Object value3503;
        java.lang.Object value3505;
        boolean value3506;
        java.lang.String value3549;
        java.lang.Object value3551;
        java.lang.Object value3590;
        java.lang.Object value3591;
        java.lang.Object value3594;
        double value3595;
        java.lang.Object value3599;
        boolean value3600;
        int edgeValue3614;
        int edgeValue3628;
        int regionValue3643;
        int edgeValue3657;
        int regionValue3671;
        int edgeValue3685;
        java.lang.Object value3768;
        java.lang.Object value3770;
        boolean value3771;
        int edgeValue3785;
        int value3838;
        double converted3839;
        java.lang.Object value3840;
        java.lang.Object value3843;
        double value3844;
        double computed3845;
        double regionValue3859;
        java.lang.Object value3888;
        java.lang.Object value3891;
        double value3892;
        int converted3907;
        int value3909;
        int value4020;
        int comparison4021;
        int regionValue4032;
        int regionValue4033;
        int edgeValue4046;
        int edgeValue4080;
        int comparison4314;
        int regionValue4326;
        int edgeValue4338;
        int edgeValue4370;
        java.lang.Object value4465;
        java.lang.Object value4467;
        boolean value4468;
        int regionValue4482;
        int edgeValue4496;
        int edgeValue4526;
        int value4637;
        double converted4638;
        java.lang.Object value4639;
        java.lang.Object value4642;
        double value4643;
        double value4644;
        int converted4645;
        int regionValue4673;
        int edgeValue4687;
        int value4702;
        int value4703;
        int regionValue4717;
        int edgeValue4731;
        int value4732;
        int regionValue4756;
        int edgeValue4770;
        int value4771;
        int value4772;
        java.lang.Object value4776;
        java.lang.Object value4777;
        boolean value4778;
        int value4779;
        int comparison4780;
        int regionValue4794;
        int regionValue4795;
        int edgeValue4810;
        int edgeValue4811;
        int regionValue4826;
        int regionValue4827;
        int edgeValue4842;
        int edgeValue4843;
        int edgeValue4855;
        int regionValue4869;
        int regionValue4870;
        int edgeValue4884;
        int edgeValue4885;
        int regionValue4899;
        int regionValue4900;
        int edgeValue4914;
        int edgeValue4915;
        int edgeValue4929;
        int edgeValue4930;
        int regionValue4945;
        int regionValue4946;
        int edgeValue4960;
        int edgeValue4961;
        int regionValue4975;
        int regionValue4976;
        int edgeValue4990;
        int edgeValue4991;
        int regionValue5005;
        int edgeValue5019;
        int regionValue5033;
        int edgeValue5047;
        int comparison5048;
        int edgeValue5060;
        int regionValue5074;
        int regionValue5076;
        int edgeValue5090;
        int edgeValue5092;
        int regionValue5106;
        int regionValue5108;
        int edgeValue5122;
        int edgeValue5124;
        int regionValue5148;
        int edgeValue5162;
        int edgeValue5176;
        int comparison5177;
        int regionValue5191;
        int edgeValue5206;
        int regionValue5221;
        int edgeValue5236;
        int regionValue5251;
        int edgeValue5266;
        int regionValue5281;
        int edgeValue5295;
        int regionValue5309;
        int edgeValue5323;
        int regionValue5337;
        int edgeValue5351;
        java.lang.Object value5352;
        java.lang.Object value5353;
        java.lang.Object value5354;
        boolean value5355;
        int edgeValue5369;
        int edgeValue5370;
        int regionValue5384;
        int edgeValue5398;
        int regionValue5412;
        int edgeValue5426;
        int comparison5427;
        int edgeValue5439;
        int regionValue5453;
        int regionValue5455;
        int edgeValue5469;
        int edgeValue5471;
        int regionValue5485;
        int regionValue5487;
        int edgeValue5501;
        int edgeValue5503;
        int regionValue5527;
        int edgeValue5541;
        int edgeValue5555;
        int incremented5556;
        int edgeValue5570;
        int edgeValue5584;
        int edgeValue5599;
        int comparison5610;
        int regionValue5612;
        int edgeValue5614;
        int edgeValue5626;
        int value5637;
        int edgeValue5659;
        int edgeValue5660;
        int edgeValue5671;
        int edgeValue5672;
        int comparison5674;
        int regionValue5685;
        int regionValue5686;
        int edgeValue5698;
        int edgeValue5699;
        int regionValue5711;
        int regionValue5712;
        int edgeValue5724;
        int edgeValue5725;
        int regionValue5737;
        int regionValue5738;
        int edgeValue5749;
        int edgeValue5750;
        int regionValue5761;
        int regionValue5762;
        int edgeValue5773;
        int edgeValue5774;
        int regionValue5785;
        int regionValue5786;
        int edgeValue5797;
        int edgeValue5798;
        boolean value5887;
        int value5932;
        java.lang.Object value5934;
        float value5935;
        java.lang.Object value5937;
        int value5938;
        java.lang.Object value5940;
        int comparison5941;
        java.lang.Object value6008;
        java.lang.Object value6010;
        int value6054;
        int edgeValue6066;
        int edgeValue6077;
        int edgeValue6078;
        int regionValue6089;
        int regionValue6090;
        int edgeValue6100;
        int edgeValue6101;
        int regionValue6112;
        int regionValue6113;
        int edgeValue6124;
        int edgeValue6125;
        boolean value6164;
        int comparison6165;
        int regionValue6175;
        int edgeValue6186;
        int edgeValue6210;
        int regionValue6245;
        int value6338;
        java.lang.Object value6341;
        java.lang.Object value6342;
        java.lang.Object value6344;
        boolean value6345;
        int regionValue6355;
        int edgeValue6365;
        int edgeValue6387;
        java.lang.StringBuilder initialized6470;
        java.lang.Object value6471;
        int value6472;
        java.lang.Object value6473;
        java.lang.Object value6474;
        java.lang.Object value6477;
        java.lang.Object value6488;
        java.lang.Object value6490;
        java.lang.Object value6515;
        java.lang.Object value6518;
        java.lang.Object value6519;
        boolean value6520;
        int edgeValue6530;
        int comparison6551;
        java.lang.Object value6651;
        java.lang.Object value6653;
        boolean value6654;
        int edgeValue6664;
        int edgeValue6674;
        int regionValue6685;
        int edgeValue6695;
        int regionValue6705;
        int edgeValue6715;
        int value6752;
        double converted6753;
        java.lang.Object value6754;
        java.lang.Object value6757;
        double value6758;
        double computed6759;
        int converted6760;
        int regionValue6771;
        java.lang.Object value6856;
        java.lang.Object value6859;
        double value6860;
        int converted6861;
        java.lang.Object value6864;
        char converted6865;
        char converted6866;
        int value6867;
        int value6869;
        java.lang.Object value6871;
        int comparison6872;
        int regionValue6883;
        int edgeValue6894;
        int edgeValue6916;
        java.lang.Object value6999;
        java.lang.Object value7001;
        boolean value7002;
        int edgeValue7012;
        java.lang.String value7049;
        java.lang.Object value7051;
        java.lang.Object value7061;
        java.lang.Object value7063;
        int edgeValue7084;
        java.lang.Object value7147;
        java.lang.Object value7150;
        double value7151;
        int comparison7152;
        java.lang.Object value7183;
        java.lang.Object value7186;
        double value7187;
        int converted7188;
        java.lang.Object value7191;
        char converted7192;
        char converted7193;
        int value7194;
        int value7196;
        java.lang.Object value7198;
        int comparison7199;
        java.lang.Object value7314;
        java.lang.Object value7316;
        boolean value7317;
        java.lang.String value7372;
        java.lang.Object value7374;
        java.lang.Object value7384;
        java.lang.Object value7386;
        int value7459;
        int edgeValue7470;
        java.lang.Object value7491;
        java.lang.Object value7493;
        boolean value7494;
        int regionValue7504;
        int edgeValue7514;
        int edgeValue7534;
        int value7609;
        double converted7610;
        int value7611;
        double converted7612;
        java.lang.Object value7613;
        java.lang.Object value7616;
        double value7617;
        double computed7618;
        double value7619;
        double computed7620;
        int converted7621;
        int regionValue7630;
        int value7640;
        double converted7651;
        java.lang.Object value7652;
        java.lang.Object value7655;
        double value7656;
        double computed7657;
        int converted7658;
        int value7668;
        int value7669;
        int regionValue7673;
        int regionValue7686;
        int edgeValue7696;
        int value7744;
        java.lang.Object value7746;
        float value7747;
        java.lang.Object value7749;
        int value7750;
        java.lang.Object value7752;
        java.lang.Object value7753;
        java.lang.Object value7755;
        int comparison7756;
        char converted7816;
        int comparison7817;
        int regionValue7821;
        int edgeValue7825;
        int edgeValue7841;
        char converted7858;
        int value7859;
        java.lang.Object value7863;
        java.lang.Object value7887;
        java.lang.Object value7889;
        boolean value7890;
        int edgeValue7894;
        java.lang.String value7905;
        java.lang.Object value7907;
        int edgeValue7916;
        int value7921;
        java.lang.Object value7922;
        java.lang.Object value7924;
        java.lang.Object value7925;
        int value7926;
        int computed7927;
        region1467: {
        region1454: {
        region1453: {
        region1452: {
        region1451: {
        region1450: {
        region1436: {
        region1435: {
        region1424: {
        region1423: {
        region1421: {
        region1402: {
        region1400: {
        region1393: {
        region1391: {
        region1389: {
        region1387: {
        region1328: {
        region1326: {
        region1324: {
        region1319: {
        region1303: {
        region1301: {
        region1275: {
        region1273: {
        region1272: {
        region1270: {
        region1258: {
        region1257: {
        region1253: {
        region1251: {
        region1248: {
        region1246: {
        region1244: {
        region1233: {
        region1219: {
        region1217: {
        region1207: {
        region1205: {
        region1202: {
        region1200: {
        region1145: {
        region1144: {
        region1128: {
        region1126: {
        region1123: {
        region1121: {
        region1120: {
        region1119: {
        region1108: {
        region1094: {
        region1093: {
        region1082: {
        region1080: {
        region1076: {
        region1074: {
        region1020: {
        region1018: {
        region1017: {
        region995: {
        region994: {
        region993: {
        region992: {
        region983: {
        region980: {
        region978: {
        region974: {
        region972: {
        region967: {
        region966: {
        region950: {
        region937: {
        region913: {
        region911: {
        region910: {
        region908: {
        region874: {
        region873: {
        region871: {
        region870: {
        region868: {
        region861: {
        region860: {
        region859: {
        region858: {
        region856: {
        region853: {
        region851: {
        region840: {
        region838: {
        region788: {
        region786: {
        region784: {
        region782: {
        region779: {
        region778: {
        region776: {
        region775: {
        region771: {
        region770: {
        region769: {
        region767: {
        region764: {
        region758: {
        region658: {
        region655: {
        region654: {
        region653: {
        region633: {
        region631: {
        region630: {
        region628: {
        region616: {
        region614: {
        region611: {
        region609: {
        region603: {
        region601: {
        region599: {
        region598: {
        region596: {
        region595: {
        region593: {
        region585: {
        region583: {
        region582: {
        region575: {
        region563: {
        region562: {
        region543: {
        region542: {
        region531: {
        region528: {
        region527: {
        region526: {
        region525: {
        region524: {
        region494: {
        region492: {
        region478: {
        region463: {
        region462: {
        region461: {
        region460: {
        region458: {
        region457: {
        region454: {
        region453: {
        region452: {
        region451: {
        region449: {
        region448: {
        region443: {
        region442: {
        region337: {
        region335: {
        region334: {
        region333: {
        region328: {
        region326: {
        region324: {
        region322: {
        region321: {
        region314: {
        region302: {
        region301: {
        region283: {
        region282: {
        region271: {
        region268: {
        region267: {
        region265: {
        region264: {
        region262: {
        region232: {
        region230: {
        region229: {
        region227: {
        region223: {
        region222: {
        region220: {
        region219: {
        region217: {
        region210: {
        region208: {
        region207: {
        region204: {
        region195: {
        region177: {
        region175: {
        region174: {
        region161: {
        region160: {
        region159: {
        region158: {
        region156: {
        region155: {
        region153: {
        region149: {
        region147: {
        region146: {
        region144: {
        region132: {
        region130: {
        region129: {
        computed9 = a0 ^ 74073662626348L;
        computed11 = a0 ^ 39716244248338L;
        computed13 = a0 ^ 140287718120517L;
        computed15 = a0 ^ 131872998763776L;
        computed17 = a0 ^ 136101457772372L;
        computed19 = a0 ^ 73777596045743L;
        computed20 = computed19 >>> 48;
        converted21 = (int) (computed20);
        computed23 = computed19 << 16;
        computed24 = computed23 >>> 32;
        converted25 = (int) (computed24);
        computed27 = computed19 << 48;
        computed28 = computed27 >>> 48;
        converted29 = (int) (computed28);
        computed31 = a0 ^ 83103949759630L;
        computed33 = a0 ^ 51121417619997L;
        value37 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this))))));
        value38 = recovery$indy$flow$13(value37, computed33);
        value40 = recovery$indy$flow$14();
        value41 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingCorrect));
        value43 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value41))))));
        value44 = recovery$indy$flow$17(value43);
        value46 = (int) ((value44 ? 1 : 0));
        value48 = ((java.lang.Object)(((net.C_47H) (((java.lang.Object)(a1))))));
        recovery$indy$flow$19(value48, ((value46 & 1) != 0), computed11);
        value50 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingTimerTicks));
        value53 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value50))))));
        value54 = recovery$indy$flow$22(value53, computed15);
        converted55 = (int) (value54);
        value57 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTicks));
        value60 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value57))))));
        value61 = recovery$indy$flow$25(value60, computed15);
        comparison62 = (java.lang.Double.isNaN(value61) || java.lang.Double.isNaN(0.0D) ? 1 : (value61 > 0.0D ? 1 : value61 == 0.0D ? 0 : -1));
        if (value40 != null) {
            regionValue78 = comparison62;
            break region153;
        } else {
            break region129;
        }
        }
        if (comparison62 > 0) {
            break region149;
        } else {
            break region130;
        }
        }
        break region132;
        }
        value217 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDynamicLagTicks));
        value219 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value217))))));
        value220 = recovery$indy$flow$28(value219);
        if (value40 != null) {
            edgeValue252 = (int) ((value220 ? 1 : 0));
            regionValue236 = edgeValue252;
            break region159;
        } else {
            edgeValue284 = (int) ((value220 ? 1 : 0));
            break region144;
        }
        }
        break region146;
        }
        if (edgeValue284 == 0) {
            break region158;
        } else {
            break region147;
        }
        }
        break region149;
        }
        value392 = recovery$indy$flow$29(this);
        edgeValue408 = (int) ((value392 ? 1 : 0));
        regionValue78 = edgeValue408;
        break region153;
        }
        if (value40 != null) {
            edgeValue424 = regionValue78;
            regionValue236 = edgeValue424;
            break region159;
        } else {
            edgeValue456 = regionValue78;
            regionValue440 = edgeValue456;
            break region155;
        }
        }
        if (regionValue440 == 0) {
            break region160;
        } else {
            break region156;
        }
        }
        break region158;
        }
        edgeValue547 = 1;
        regionValue236 = edgeValue547;
        break region159;
        }
        edgeValue579 = regionValue236;
        regionValue563 = edgeValue579;
        break region161;
        }
        edgeValue595 = 0;
        regionValue563 = edgeValue595;
        break region161;
        }
        recovery$indy$flow$30(this, ((regionValue563 & 1) != 0));
        value596 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDynamicLagTicks));
        value598 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value596))))));
        value599 = recovery$indy$flow$33(value598);
        if (value40 != null) {
            edgeValue629 = (int) ((value599 ? 1 : 0));
            regionValue614 = edgeValue629;
            break region204;
        } else {
            edgeValue659 = (int) ((value599 ? 1 : 0));
            break region174;
        }
        }
        if (edgeValue659 != 0) {
            break region195;
        } else {
            break region175;
        }
        }
        break region177;
        }
        value744 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTicks));
        value747 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value744))))));
        value748 = recovery$indy$flow$36(value747, computed15);
        converted749 = (int) (value748);
        recovery$indy$flow$37(this, converted749);
        break region195;
        }
        value765 = ((java.lang.Object)(((net.C_47H) (((java.lang.Object)(a1))))));
        value766 = recovery$indy$flow$39(value765);
        regionValue614 = value766;
        break region204;
        }
        if (value40 != null) {
            edgeValue804 = regionValue614;
            edgeValue805 = 1;
            regionValue792 = edgeValue804;
            regionValue793 = edgeValue805;
            break region770;
        } else {
            edgeValue836 = regionValue614;
            edgeValue837 = 1;
            regionValue820 = edgeValue836;
            break region207;
        }
        }
        if (regionValue820 < edgeValue837) {
            break region767;
        } else {
            break region208;
        }
        }
        break region210;
        }
        value914 = recovery$indy$flow$40(this);
        comparison915 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison915 < 0) {
            edgeValue944 = (int) ((value914 ? 1 : 0));
            regionValue929 = edgeValue944;
            break region525;
        } else {
            edgeValue976 = (int) ((value914 ? 1 : 0));
            break region217;
        }
        }
        break region219;
        }
        if (value40 != null) {
            regionValue1023 = edgeValue976;
            break region524;
        } else {
            break region220;
        }
        }
        break region222;
        }
        if (edgeValue976 != 0) {
            break region494;
        } else {
            break region223;
        }
        }
        value1154 = recovery$indy$flow$41(this);
        if (value40 != null) {
            regionValue1165 = value1154;
            break region769;
        } else {
            break region227;
        }
        }
        break region229;
        }
        if (value1154 != 0) {
            break region767;
        } else {
            break region230;
        }
        }
        break region232;
        }
        value1303 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).field_48));
        value1304 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDelay));
        value1307 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value1304))))));
        value1308 = recovery$indy$flow$45(value1307, computed15);
        value1312 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value1303))))));
        value1313 = recovery$indy$flow$47(value1312, value1308, computed17);
        if (value40 != null) {
            edgeValue1343 = (int) ((value1313 ? 1 : 0));
            regionValue1328 = edgeValue1343;
            break region282;
        } else {
            edgeValue1373 = (int) ((value1313 ? 1 : 0));
            break region262;
        }
        }
        break region264;
        }
        if (edgeValue1373 != 0) {
            break region268;
        } else {
            break region265;
        }
        }
        break region267;
        }
        return;
        }
        if (value40 != null) {
            break region302;
        } else {
            break region271;
        }
        }
        value1492 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDynamicLagTicks));
        value1494 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value1492))))));
        value1495 = recovery$indy$flow$50(value1494);
        edgeValue1510 = (int) ((value1495 ? 1 : 0));
        regionValue1328 = edgeValue1510;
        break region282;
        }
        if (regionValue1328 == 0) {
            break region301;
        } else {
            break region283;
        }
        }
        converted1567 = (double) (converted55);
        value1568 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTickDiff));
        value1571 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value1568))))));
        value1572 = recovery$indy$flow$53(value1571, computed15);
        computed1573 = converted1567 - value1572;
        regionValue1588 = computed1573;
        break region314;
        }
        break region302;
        }
        value1619 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTicks));
        value1622 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value1619))))));
        value1623 = recovery$indy$flow$56(value1622, computed15);
        regionValue1588 = value1623;
        break region314;
        }
        converted1639 = (int) (regionValue1588);
        comparison1641 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison1641 <= 0) {
            break region334;
        } else {
            break region321;
        }
        }
        if (value40 != null) {
            break region333;
        } else {
            break region322;
        }
        }
        break region324;
        }
        if (value38 != null) {
            break region335;
        } else {
            break region326;
        }
        }
        break region328;
        }
        recovery$indy$flow$57(this, false);
        break region333;
        }
        break region334;
        }
        if (value40 == null) {
            break region442;
        } else {
            break region335;
        }
        }
        regionValue1978 = converted55;
        break region337;
        }
        loop337: while (true) {
        region441: {
        region440: {
        region437: {
        region435: {
        region431: {
        region429: {
        region424: {
        region423: {
        region411: {
        region409: {
        region408: {
        region406: {
        region398: {
        region396: {
        region392: {
        region390: {
        region379: {
        region378: {
        region377: {
        region376: {
        region374: {
        region373: {
        region342: {
        value1995 = recovery$indy$flow$58(1, converted1639);
        if (regionValue1978 <= value1995) {
            break region442;
        } else {
            edgeValue2042 = regionValue1978;
            regionValue2026 = edgeValue2042;
            break region342;
        }
        }
        value2043 = recovery$indy$flow$59(0, converted1639);
        value2044 = value2043;
        value2045 = regionValue2026;
        value2049 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this))))));
        value2050 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(value38))))));
        value2051 = recovery$indy$flow$62(value2049, value2050, computed13, value2045, value2044);
        value2052 = (int) ((value2051 ? 1 : 0));
        comparison2053 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison2053 <= 0) {
            edgeValue2087 = regionValue2026;
            edgeValue2088 = value2052;
            regionValue2069 = edgeValue2087;
            regionValue2070 = edgeValue2088;
            break region377;
        } else {
            edgeValue2123 = regionValue2026;
            edgeValue2124 = value2052;
            regionValue2105 = edgeValue2123;
            regionValue2106 = edgeValue2124;
            break region373;
        }
        }
        if (value40 != null) {
            edgeValue2157 = regionValue2106;
            regionValue2141 = edgeValue2157;
            break region452;
        } else {
            edgeValue2190 = regionValue2105;
            edgeValue2191 = regionValue2106;
            regionValue2173 = edgeValue2190;
            regionValue2174 = edgeValue2191;
            break region374;
        }
        }
        edgeValue2224 = regionValue2173;
        edgeValue2225 = regionValue2174;
        regionValue2207 = edgeValue2224;
        regionValue2208 = edgeValue2225;
        break region376;
        }
        edgeValue2241 = regionValue2207;
        edgeValue2242 = regionValue2208;
        regionValue2069 = edgeValue2241;
        regionValue2070 = edgeValue2242;
        break region377;
        }
        if (value40 != null) {
            edgeValue2276 = regionValue2069;
            edgeValue2277 = regionValue2070;
            regionValue2259 = edgeValue2276;
            regionValue2260 = edgeValue2277;
            break region423;
        } else {
            edgeValue2310 = regionValue2069;
            edgeValue2311 = regionValue2070;
            regionValue2293 = edgeValue2310;
            regionValue2294 = edgeValue2311;
            break region378;
        }
        }
        if (regionValue2294 == 0) {
            edgeValue2343 = regionValue2293;
            regionValue2327 = edgeValue2343;
            break region398;
        } else {
            edgeValue2375 = regionValue2293;
            regionValue2359 = edgeValue2375;
            break region379;
        }
        }
        recovery$indy$flow$63(this, true);
        recovery$indy$flow$64(this, regionValue2359);
        comparison2376 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison2376 <= 0) {
            break region443;
        } else {
            edgeValue2441 = regionValue2359;
            regionValue2424 = edgeValue2441;
            break region390;
        }
        }
        edgeValue2475 = regionValue2424;
        regionValue2458 = edgeValue2475;
        break region392;
        }
        recovery$indy$flow$65(this, regionValue2458);
        if (value40 == null) {
            break region442;
        } else {
            edgeValue2523 = regionValue2458;
            regionValue2507 = edgeValue2523;
            break region396;
        }
        }
        edgeValue2539 = regionValue2507;
        regionValue2327 = edgeValue2539;
        break region398;
        }
        recovery$indy$flow$66(this, false);
        comparison2540 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison2540 <= 0) {
            edgeValue2573 = regionValue2327;
            regionValue2556 = edgeValue2573;
            break region441;
        } else {
            edgeValue2607 = regionValue2327;
            regionValue2590 = edgeValue2607;
            break region406;
        }
        }
        edgeValue2641 = regionValue2590;
        regionValue2624 = edgeValue2641;
        break region408;
        }
        if (value40 != null) {
            edgeValue2674 = regionValue2624;
            regionValue2658 = edgeValue2674;
            break region440;
        } else {
            edgeValue2706 = regionValue2624;
            regionValue2690 = edgeValue2706;
            break region409;
        }
        }
        edgeValue2738 = regionValue2690;
        regionValue2722 = edgeValue2738;
        break region411;
        }
        value2739 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDynamic));
        value2740 = value2739;
        value2741 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value2740))))));
        value2742 = recovery$indy$flow$69(value2741);
        edgeValue2758 = regionValue2722;
        edgeValue2759 = (int) ((value2742 ? 1 : 0));
        regionValue2259 = edgeValue2758;
        regionValue2260 = edgeValue2759;
        break region423;
        }
        if (regionValue2260 != 0) {
            edgeValue2791 = regionValue2259;
            regionValue2775 = edgeValue2791;
            break region437;
        } else {
            edgeValue2823 = regionValue2259;
            regionValue2807 = edgeValue2823;
            break region424;
        }
        }
        comparison2824 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison2824 <= 0) {
            break region443;
        } else {
            edgeValue2873 = regionValue2807;
            regionValue2856 = edgeValue2873;
            break region429;
        }
        }
        edgeValue2907 = regionValue2856;
        regionValue2890 = edgeValue2907;
        break region431;
        }
        recovery$indy$flow$70(this, false);
        if (value40 == null) {
            break region442;
        } else {
            edgeValue2955 = regionValue2890;
            regionValue2939 = edgeValue2955;
            break region435;
        }
        }
        edgeValue2971 = regionValue2939;
        regionValue2775 = edgeValue2971;
        break region437;
        }
        incremented2972 = regionValue2775 + (-1);
        edgeValue2988 = incremented2972;
        regionValue2658 = edgeValue2988;
        break region440;
        }
        edgeValue3004 = regionValue2658;
        regionValue2556 = edgeValue3004;
        break region441;
        }
        if (value40 == null) {
            edgeValue3021 = regionValue2556;
            regionValue1978 = edgeValue3021;
            continue loop337;
        } else {
            break region442;
        }
        }
        }
        break region443;
        }
        comparison3053 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison3053 <= 0) {
            break region1423;
        } else {
            break region448;
        }
        }
        if (value40 != null) {
            break region454;
        } else {
            break region449;
        }
        }
        break region451;
        }
        value3194 = recovery$indy$flow$71(this);
        edgeValue3210 = (int) ((value3194 ? 1 : 0));
        regionValue2141 = edgeValue3210;
        break region452;
        }
        if (regionValue2141 == 0) {
            break region492;
        } else {
            break region453;
        }
        }
        break region454;
        }
        if (value40 != null) {
            regionValue3300 = converted1639;
            break region461;
        } else {
            break region457;
        }
        }
        if (converted1639 <= 0) {
            break region462;
        } else {
            break region458;
        }
        }
        break region460;
        }
        edgeValue3454 = 1;
        regionValue3300 = edgeValue3454;
        break region461;
        }
        edgeValue3486 = regionValue3300;
        regionValue3470 = edgeValue3486;
        break region463;
        }
        edgeValue3502 = 2;
        regionValue3470 = edgeValue3502;
        break region463;
        }
        recovery$indy$flow$72(this, regionValue3470);
        recovery$indy$flow$73(this, 0);
        value3503 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDebug));
        value3505 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value3503))))));
        value3506 = recovery$indy$flow$76(value3505);
        if ((int) ((value3506 ? 1 : 0)) == 0) {
            break region492;
        } else {
            break region478;
        }
        }
        value3549 = "PreStop";
        value3551 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value3549))))));
        recovery$indy$flow$78(computed9, value3551);
        break region492;
        }
        if (value40 == null) {
            break region767;
        } else {
            break region494;
        }
        }
        value3590 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).field_48));
        value3591 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDelay));
        value3594 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value3591))))));
        value3595 = recovery$indy$flow$82(value3594, computed15);
        value3599 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value3590))))));
        value3600 = recovery$indy$flow$84(value3599, value3595, computed17);
        edgeValue3614 = (int) ((value3600 ? 1 : 0));
        regionValue1023 = edgeValue3614;
        break region524;
        }
        edgeValue3628 = regionValue1023;
        regionValue929 = edgeValue3628;
        break region525;
        }
        if (value40 != null) {
            edgeValue3657 = regionValue929;
            regionValue3643 = edgeValue3657;
            break region542;
        } else {
            edgeValue3685 = regionValue929;
            regionValue3671 = edgeValue3685;
            break region526;
        }
        }
        if (regionValue3671 != 0) {
            break region528;
        } else {
            break region527;
        }
        }
        return;
        }
        if (value40 != null) {
            break region563;
        } else {
            break region531;
        }
        }
        value3768 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDynamicLagTicks));
        value3770 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value3768))))));
        value3771 = recovery$indy$flow$87(value3770);
        edgeValue3785 = (int) ((value3771 ? 1 : 0));
        regionValue3643 = edgeValue3785;
        break region542;
        }
        if (regionValue3643 == 0) {
            break region562;
        } else {
            break region543;
        }
        }
        value3838 = recovery$indy$flow$88(this);
        converted3839 = (double) (value3838);
        value3840 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTickDiff));
        value3843 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value3840))))));
        value3844 = recovery$indy$flow$91(value3843, computed15);
        computed3845 = converted3839 - value3844;
        regionValue3859 = computed3845;
        break region575;
        }
        break region563;
        }
        value3888 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTicks));
        value3891 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value3888))))));
        value3892 = recovery$indy$flow$94(value3891, computed15);
        regionValue3859 = value3892;
        break region575;
        }
        converted3907 = (int) (regionValue3859);
        value3909 = recovery$indy$flow$95(this);
        if (value40 != null) {
            regionValue792 = value3909;
            regionValue793 = converted3907;
            break region770;
        } else {
            break region582;
        }
        }
        if (value3909 < converted3907) {
            break region767;
        } else {
            break region583;
        }
        }
        break region585;
        }
        value4020 = recovery$indy$flow$96(this);
        comparison4021 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison4021 < 0) {
            edgeValue4046 = 3;
            regionValue4032 = value4020;
            regionValue4033 = edgeValue4046;
            break region771;
        } else {
            edgeValue4080 = 3;
            break region593;
        }
        }
        break region595;
        }
        if (value40 != null) {
            regionValue792 = value4020;
            regionValue793 = edgeValue4080;
            break region770;
        } else {
            break region596;
        }
        }
        break region598;
        }
        if (value4020 == edgeValue4080) {
            break region767;
        } else {
            break region599;
        }
        }
        if (value38 != null) {
            break region616;
        } else {
            break region601;
        }
        }
        break region603;
        }
        comparison4314 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison4314 < 0) {
            edgeValue4338 = 0;
            regionValue4326 = edgeValue4338;
            break region764;
        } else {
            edgeValue4370 = 0;
            break region609;
        }
        }
        break region611;
        }
        recovery$indy$flow$97(this, ((edgeValue4370 & 1) != 0));
        if (value40 == null) {
            break region758;
        } else {
            break region614;
        }
        }
        break region616;
        }
        value4465 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDynamicLagTicks));
        value4467 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value4465))))));
        value4468 = recovery$indy$flow$100(value4467);
        if (value40 != null) {
            edgeValue4496 = (int) ((value4468 ? 1 : 0));
            regionValue4482 = edgeValue4496;
            break region653;
        } else {
            edgeValue4526 = (int) ((value4468 ? 1 : 0));
            break region628;
        }
        }
        break region630;
        }
        if (edgeValue4526 == 0) {
            break region654;
        } else {
            break region631;
        }
        }
        break region633;
        }
        value4637 = recovery$indy$flow$101(this);
        converted4638 = (double) (value4637);
        value4639 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTickDiff));
        value4642 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value4639))))));
        value4643 = recovery$indy$flow$104(value4642, computed15);
        value4644 = recovery$indy$flow$105(converted4638, value4643);
        converted4645 = (int) (value4644);
        regionValue4482 = converted4645;
        break region653;
        }
        edgeValue4687 = regionValue4482;
        regionValue4673 = edgeValue4687;
        break region655;
        }
        regionValue4673 = converted55;
        break region655;
        }
        value4702 = regionValue4673;
        value4703 = value4702;
        edgeValue4731 = value4703;
        regionValue4717 = edgeValue4731;
        break region658;
        }
        loop658: while (true) {
        region757: {
        region756: {
        region753: {
        region751: {
        region748: {
        region746: {
        region740: {
        region739: {
        region727: {
        region725: {
        region724: {
        region722: {
        region714: {
        region712: {
        region709: {
        region707: {
        region698: {
        region697: {
        region696: {
        region695: {
        region693: {
        region692: {
        region663: {
        value4732 = recovery$indy$flow$106(1, converted3907);
        if (regionValue4717 <= value4732) {
            break region758;
        } else {
            edgeValue4770 = regionValue4717;
            regionValue4756 = edgeValue4770;
            break region663;
        }
        }
        value4771 = 0;
        value4772 = regionValue4756;
        value4776 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this))))));
        value4777 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(value38))))));
        value4778 = recovery$indy$flow$109(value4776, value4777, computed13, value4772, value4771);
        value4779 = (int) ((value4778 ? 1 : 0));
        comparison4780 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison4780 < 0) {
            edgeValue4810 = regionValue4756;
            edgeValue4811 = value4779;
            regionValue4794 = edgeValue4810;
            regionValue4795 = edgeValue4811;
            break region696;
        } else {
            edgeValue4842 = regionValue4756;
            edgeValue4843 = value4779;
            regionValue4826 = edgeValue4842;
            regionValue4827 = edgeValue4843;
            break region692;
        }
        }
        if (value40 != null) {
            edgeValue4855 = regionValue4827;
            regionValue1165 = edgeValue4855;
            break region769;
        } else {
            edgeValue4884 = regionValue4826;
            edgeValue4885 = regionValue4827;
            regionValue4869 = edgeValue4884;
            regionValue4870 = edgeValue4885;
            break region693;
        }
        }
        edgeValue4914 = regionValue4869;
        edgeValue4915 = regionValue4870;
        regionValue4899 = edgeValue4914;
        regionValue4900 = edgeValue4915;
        break region695;
        }
        edgeValue4929 = regionValue4899;
        edgeValue4930 = regionValue4900;
        regionValue4794 = edgeValue4929;
        regionValue4795 = edgeValue4930;
        break region696;
        }
        if (value40 != null) {
            edgeValue4960 = regionValue4794;
            edgeValue4961 = regionValue4795;
            regionValue4945 = edgeValue4960;
            regionValue4946 = edgeValue4961;
            break region739;
        } else {
            edgeValue4990 = regionValue4794;
            edgeValue4991 = regionValue4795;
            regionValue4975 = edgeValue4990;
            regionValue4976 = edgeValue4991;
            break region697;
        }
        }
        if (regionValue4976 == 0) {
            edgeValue5019 = regionValue4975;
            regionValue5005 = edgeValue5019;
            break region714;
        } else {
            edgeValue5047 = regionValue4975;
            regionValue5033 = edgeValue5047;
            break region698;
        }
        }
        recovery$indy$flow$110(this, true);
        comparison5048 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison5048 < 0) {
            edgeValue5060 = regionValue5033;
            regionValue4326 = edgeValue5060;
            break region764;
        } else {
            edgeValue5090 = regionValue5033;
            edgeValue5092 = regionValue5033;
            regionValue5074 = edgeValue5090;
            regionValue5076 = edgeValue5092;
            break region707;
        }
        }
        edgeValue5122 = regionValue5074;
        edgeValue5124 = regionValue5076;
        regionValue5106 = edgeValue5122;
        regionValue5108 = edgeValue5124;
        break region709;
        }
        recovery$indy$flow$111(this, regionValue5108);
        if (value40 == null) {
            break region758;
        } else {
            edgeValue5162 = regionValue5106;
            regionValue5148 = edgeValue5162;
            break region712;
        }
        }
        edgeValue5176 = regionValue5148;
        regionValue5005 = edgeValue5176;
        break region714;
        }
        recovery$indy$flow$112(this, false);
        comparison5177 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison5177 < 0) {
            edgeValue5206 = regionValue5005;
            regionValue5191 = edgeValue5206;
            break region757;
        } else {
            edgeValue5236 = regionValue5005;
            regionValue5221 = edgeValue5236;
            break region722;
        }
        }
        edgeValue5266 = regionValue5221;
        regionValue5251 = edgeValue5266;
        break region724;
        }
        if (value40 != null) {
            edgeValue5295 = regionValue5251;
            regionValue5281 = edgeValue5295;
            break region756;
        } else {
            edgeValue5323 = regionValue5251;
            regionValue5309 = edgeValue5323;
            break region725;
        }
        }
        edgeValue5351 = regionValue5309;
        regionValue5337 = edgeValue5351;
        break region727;
        }
        value5352 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDynamic));
        value5353 = value5352;
        value5354 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value5353))))));
        value5355 = recovery$indy$flow$115(value5354);
        edgeValue5369 = regionValue5337;
        edgeValue5370 = (int) ((value5355 ? 1 : 0));
        regionValue4945 = edgeValue5369;
        regionValue4946 = edgeValue5370;
        break region739;
        }
        if (regionValue4946 != 0) {
            edgeValue5398 = regionValue4945;
            regionValue5384 = edgeValue5398;
            break region753;
        } else {
            edgeValue5426 = regionValue4945;
            regionValue5412 = edgeValue5426;
            break region740;
        }
        }
        comparison5427 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison5427 < 0) {
            edgeValue5439 = 0;
            regionValue4326 = edgeValue5439;
            break region764;
        } else {
            edgeValue5469 = regionValue5412;
            edgeValue5471 = 0;
            regionValue5453 = edgeValue5469;
            regionValue5455 = edgeValue5471;
            break region746;
        }
        }
        edgeValue5501 = regionValue5453;
        edgeValue5503 = regionValue5455;
        regionValue5485 = edgeValue5501;
        regionValue5487 = edgeValue5503;
        break region748;
        }
        recovery$indy$flow$116(this, ((regionValue5487 & 1) != 0));
        if (value40 == null) {
            break region758;
        } else {
            edgeValue5541 = regionValue5485;
            regionValue5527 = edgeValue5541;
            break region751;
        }
        }
        edgeValue5555 = regionValue5527;
        regionValue5384 = edgeValue5555;
        break region753;
        }
        incremented5556 = regionValue5384 + (-1);
        edgeValue5570 = incremented5556;
        regionValue5281 = edgeValue5570;
        break region756;
        }
        edgeValue5584 = regionValue5281;
        regionValue5191 = edgeValue5584;
        break region757;
        }
        if (value40 == null) {
            edgeValue5599 = regionValue5191;
            regionValue4717 = edgeValue5599;
            continue loop658;
        } else {
            break region758;
        }
        }
        }
        comparison5610 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison5610 < 0) {
            edgeValue5614 = 2;
            regionValue5612 = edgeValue5614;
            break region1467;
        } else {
            edgeValue5626 = 2;
            regionValue4326 = edgeValue5626;
            break region764;
        }
        }
        recovery$indy$flow$117(this, regionValue4326);
        break region767;
        }
        value5637 = recovery$indy$flow$118(this);
        regionValue1165 = value5637;
        break region769;
        }
        edgeValue5659 = regionValue1165;
        edgeValue5660 = 1;
        regionValue792 = edgeValue5659;
        regionValue793 = edgeValue5660;
        break region770;
        }
        edgeValue5671 = regionValue792;
        edgeValue5672 = regionValue793;
        regionValue4032 = edgeValue5671;
        regionValue4033 = edgeValue5672;
        break region771;
        }
        comparison5674 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison5674 < 0) {
            edgeValue5698 = regionValue4032;
            edgeValue5699 = regionValue4033;
            regionValue5685 = edgeValue5698;
            regionValue5686 = edgeValue5699;
            break region859;
        } else {
            edgeValue5724 = regionValue4032;
            edgeValue5725 = regionValue4033;
            regionValue5711 = edgeValue5724;
            regionValue5712 = edgeValue5725;
            break region775;
        }
        }
        if (value40 != null) {
            edgeValue5749 = regionValue5711;
            edgeValue5750 = regionValue5712;
            regionValue5737 = edgeValue5749;
            regionValue5738 = edgeValue5750;
            break region858;
        } else {
            edgeValue5773 = regionValue5711;
            edgeValue5774 = regionValue5712;
            regionValue5761 = edgeValue5773;
            regionValue5762 = edgeValue5774;
            break region776;
        }
        }
        edgeValue5797 = regionValue5761;
        edgeValue5798 = regionValue5762;
        regionValue5785 = edgeValue5797;
        regionValue5786 = edgeValue5798;
        break region778;
        }
        if (regionValue5785 != regionValue5786) {
            break region853;
        } else {
            break region779;
        }
        }
        if (value40 != null) {
            break region1454;
        } else {
            break region782;
        }
        }
        break region784;
        }
        value5887 = recovery$indy$flow$119(this);
        if ((int) ((value5887 ? 1 : 0)) == 0) {
            break region1453;
        } else {
            break region786;
        }
        }
        break region788;
        }
        recovery$indy$flow$120(this, null);
        value5932 = 0;
        value5934 = ((java.lang.Object)(((net.C_47H) (((java.lang.Object)(a1))))));
        recovery$indy$flow$122(value5934, value5932);
        value5935 = 0.0F;
        value5937 = ((java.lang.Object)(((net.C_47H) (((java.lang.Object)(a1))))));
        recovery$indy$flow$124(value5937, value5935);
        value5938 = 1;
        value5940 = ((java.lang.Object)(((net.C_47H) (((java.lang.Object)(a1))))));
        recovery$indy$flow$126(value5940, ((value5938 & 1) != 0));
        recovery$indy$flow$127(this, true);
        recovery$indy$flow$128(this, true);
        comparison5941 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison5941 <= 0) {
            break region856;
        } else {
            break region838;
        }
        }
        break region840;
        }
        value6008 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).field_40));
        value6010 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value6008))))));
        recovery$indy$flow$131(value6010);
        if (value40 == null) {
            break region1453;
        } else {
            break region851;
        }
        }
        break region853;
        }
        break region856;
        }
        value6054 = recovery$indy$flow$132(this);
        edgeValue6066 = 2;
        regionValue5737 = value6054;
        regionValue5738 = edgeValue6066;
        break region858;
        }
        edgeValue6077 = regionValue5737;
        edgeValue6078 = regionValue5738;
        regionValue5685 = edgeValue6077;
        regionValue5686 = edgeValue6078;
        break region859;
        }
        if (value40 != null) {
            edgeValue6100 = regionValue5685;
            edgeValue6101 = regionValue5686;
            regionValue6089 = edgeValue6100;
            regionValue6090 = edgeValue6101;
            break region1257;
        } else {
            edgeValue6124 = regionValue5685;
            edgeValue6125 = regionValue5686;
            regionValue6112 = edgeValue6124;
            regionValue6113 = edgeValue6125;
            break region860;
        }
        }
        if (regionValue6112 != regionValue6113) {
            break region1248;
        } else {
            break region861;
        }
        }
        value6164 = recovery$indy$flow$133(this);
        comparison6165 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison6165 < 0) {
            edgeValue6186 = (int) ((value6164 ? 1 : 0));
            regionValue6175 = edgeValue6186;
            break region993;
        } else {
            edgeValue6210 = (int) ((value6164 ? 1 : 0));
            break region868;
        }
        }
        break region870;
        }
        if (value40 != null) {
            regionValue6245 = edgeValue6210;
            break region992;
        } else {
            break region871;
        }
        }
        break region873;
        }
        if (edgeValue6210 == 0) {
            break region980;
        } else {
            break region874;
        }
        }
        value6338 = recovery$indy$flow$134(this);
        value6341 = ((java.lang.Object)(((net.C_47H) (((java.lang.Object)(a1))))));
        recovery$indy$flow$136(value6341, value6338);
        recovery$indy$flow$137(this, 3);
        recovery$indy$flow$138(this, 0);
        recovery$indy$flow$139(this, 0);
        value6342 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDebug));
        value6344 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value6342))))));
        value6345 = recovery$indy$flow$142(value6344);
        if (value40 != null) {
            edgeValue6365 = (int) ((value6345 ? 1 : 0));
            regionValue6355 = edgeValue6365;
            break region966;
        } else {
            edgeValue6387 = (int) ((value6345 ? 1 : 0));
            break region908;
        }
        }
        break region910;
        }
        if (edgeValue6387 == 0) {
            break region937;
        } else {
            break region911;
        }
        }
        break region913;
        }
        initialized6470 = new java.lang.StringBuilder();
        value6471 = recovery$indy$flow$145(initialized6470, "TimerSuccessful ");
        value6472 = recovery$indy$flow$146(this);
        value6473 = recovery$indy$flow$147(value6471, value6472);
        value6474 = recovery$indy$flow$148(value6473);
        value6477 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value6474))))));
        recovery$indy$flow$150(computed9, value6477);
        break region937;
        }
        value6488 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).field_40));
        value6490 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value6488))))));
        recovery$indy$flow$153(value6490);
        if (value40 != null) {
            break region1454;
        } else {
            break region950;
        }
        }
        value6515 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingFixMode));
        value6518 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value6515))))));
        value6519 = recovery$indy$flow$156(value6518, computed31);
        value6520 = recovery$indy$flow$157(value6519, "Fix2");
        edgeValue6530 = (int) ((value6520 ? 1 : 0));
        regionValue6355 = edgeValue6530;
        break region966;
        }
        if (regionValue6355 == 0) {
            break region1453;
        } else {
            break region967;
        }
        }
        comparison6551 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison6551 <= 0) {
            break region983;
        } else {
            break region972;
        }
        }
        break region974;
        }
        recovery$indy$flow$158(this, true);
        if (value40 == null) {
            break region1453;
        } else {
            break region978;
        }
        }
        break region980;
        }
        break region983;
        }
        value6651 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDynamicLagTicks));
        value6653 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value6651))))));
        value6654 = recovery$indy$flow$161(value6653);
        edgeValue6664 = (int) ((value6654 ? 1 : 0));
        regionValue6245 = edgeValue6664;
        break region992;
        }
        edgeValue6674 = regionValue6245;
        regionValue6175 = edgeValue6674;
        break region993;
        }
        if (value40 != null) {
            edgeValue6695 = regionValue6175;
            regionValue6685 = edgeValue6695;
            break region1144;
        } else {
            edgeValue6715 = regionValue6175;
            regionValue6705 = edgeValue6715;
            break region994;
        }
        }
        if (regionValue6705 == 0) {
            break region1123;
        } else {
            break region995;
        }
        }
        value6752 = recovery$indy$flow$162(this);
        converted6753 = (double) (value6752);
        value6754 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTickDiff));
        value6757 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value6754))))));
        value6758 = recovery$indy$flow$165(value6757, computed15);
        computed6759 = converted6753 - value6758;
        converted6760 = (int) (computed6759);
        if (value40 != null) {
            regionValue6771 = converted6760;
            break region1093;
        } else {
            break region1017;
        }
        }
        if (converted6760 <= 0) {
            break region1121;
        } else {
            break region1018;
        }
        }
        break region1020;
        }
        value6856 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTicks));
        value6859 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value6856))))));
        value6860 = recovery$indy$flow$168(value6859, computed15);
        converted6861 = (int) (value6860);
        value6864 = ((java.lang.Object)(((net.C_47H) (((java.lang.Object)(a1))))));
        recovery$indy$flow$170(value6864, converted6861);
        converted6865 = (char) (converted21);
        converted6866 = (char) (converted29);
        value6867 = (int) (converted6866);
        value6869 = (int) (converted6865);
        value6871 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this))))));
        recovery$indy$flow$172(value6871, (char) (value6869), converted25, (char) (value6867));
        recovery$indy$flow$173(this, false);
        comparison6872 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison6872 <= 0) {
            edgeValue6894 = 0;
            regionValue6883 = edgeValue6894;
            break region1120;
        } else {
            edgeValue6916 = 0;
            break region1074;
        }
        }
        break region1076;
        }
        recovery$indy$flow$174(this, edgeValue6916);
        if (value40 != null) {
            break region1119;
        } else {
            break region1080;
        }
        }
        break region1082;
        }
        value6999 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDebug));
        value7001 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value6999))))));
        value7002 = recovery$indy$flow$177(value7001);
        edgeValue7012 = (int) ((value7002 ? 1 : 0));
        regionValue6771 = edgeValue7012;
        break region1093;
        }
        if (regionValue6771 == 0) {
            break region1108;
        } else {
            break region1094;
        }
        }
        value7049 = "TimerAbort";
        value7051 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value7049))))));
        recovery$indy$flow$179(computed9, value7051);
        break region1108;
        }
        value7061 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).field_40));
        value7063 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value7061))))));
        recovery$indy$flow$182(value7063);
        break region1119;
        }
        edgeValue7084 = 0;
        regionValue6883 = edgeValue7084;
        break region1120;
        }
        recovery$indy$flow$183(this, ((regionValue6883 & 1) != 0));
        break region1121;
        }
        if (value40 == null) {
            break region1453;
        } else {
            break region1123;
        }
        }
        if (value40 != null) {
            break region1454;
        } else {
            break region1126;
        }
        }
        break region1128;
        }
        value7147 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTicks));
        value7150 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value7147))))));
        value7151 = recovery$indy$flow$186(value7150, computed15);
        comparison7152 = (java.lang.Double.isNaN(value7151) || java.lang.Double.isNaN(0.0D) ? -1 : (value7151 > 0.0D ? 1 : value7151 == 0.0D ? 0 : -1));
        regionValue6685 = comparison7152;
        break region1144;
        }
        if (regionValue6685 <= 0) {
            break region1453;
        } else {
            break region1145;
        }
        }
        value7183 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTicks));
        value7186 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value7183))))));
        value7187 = recovery$indy$flow$189(value7186, computed15);
        converted7188 = (int) (value7187);
        value7191 = ((java.lang.Object)(((net.C_47H) (((java.lang.Object)(a1))))));
        recovery$indy$flow$191(value7191, converted7188);
        converted7192 = (char) (converted21);
        converted7193 = (char) (converted29);
        value7194 = (int) (converted7193);
        value7196 = (int) (converted7192);
        value7198 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this))))));
        recovery$indy$flow$193(value7198, (char) (value7196), converted25, (char) (value7194));
        recovery$indy$flow$194(this, false);
        recovery$indy$flow$195(this, 0);
        comparison7199 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison7199 < 0) {
            break region1246;
        } else {
            break region1200;
        }
        }
        break region1202;
        }
        if (value40 != null) {
            break region1244;
        } else {
            break region1205;
        }
        }
        break region1207;
        }
        value7314 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDebug));
        value7316 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value7314))))));
        value7317 = recovery$indy$flow$198(value7316);
        if ((int) ((value7317 ? 1 : 0)) == 0) {
            break region1233;
        } else {
            break region1217;
        }
        }
        break region1219;
        }
        value7372 = "TimerAbort";
        value7374 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value7372))))));
        recovery$indy$flow$200(computed9, value7374);
        break region1233;
        }
        value7384 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).field_40));
        value7386 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value7384))))));
        recovery$indy$flow$203(value7386);
        break region1244;
        }
        recovery$indy$flow$204(this, false);
        break region1246;
        }
        if (value40 == null) {
            break region1453;
        } else {
            break region1248;
        }
        }
        if (value40 != null) {
            break region1454;
        } else {
            break region1251;
        }
        }
        break region1253;
        }
        value7459 = recovery$indy$flow$205(this);
        edgeValue7470 = 3;
        regionValue6089 = value7459;
        regionValue6090 = edgeValue7470;
        break region1257;
        }
        if (regionValue6089 != regionValue6090) {
            break region1453;
        } else {
            break region1258;
        }
        }
        value7491 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDynamicLagTicks));
        value7493 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value7491))))));
        value7494 = recovery$indy$flow$208(value7493);
        if (value40 != null) {
            edgeValue7514 = (int) ((value7494 ? 1 : 0));
            regionValue7504 = edgeValue7514;
            break region1303;
        } else {
            edgeValue7534 = (int) ((value7494 ? 1 : 0));
            break region1270;
        }
        }
        break region1272;
        }
        if (edgeValue7534 == 0) {
            break region1301;
        } else {
            break region1273;
        }
        }
        break region1275;
        }
        value7609 = recovery$indy$flow$209(this);
        converted7610 = (double) (value7609);
        value7611 = recovery$indy$flow$210(this);
        converted7612 = (double) (value7611);
        value7613 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTickDiff));
        value7616 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value7613))))));
        value7617 = recovery$indy$flow$213(value7616, computed15);
        computed7618 = converted7612 - value7617;
        value7619 = recovery$indy$flow$214(0.0D, computed7618);
        computed7620 = converted7610 - value7619;
        converted7621 = (int) (computed7620);
        regionValue7630 = converted7621;
        break region1319;
        }
        value7640 = recovery$indy$flow$215(this);
        regionValue7504 = value7640;
        break region1303;
        }
        converted7651 = (double) (regionValue7504);
        value7652 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingLagTicks));
        value7655 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value7652))))));
        value7656 = recovery$indy$flow$218(value7655, computed15);
        computed7657 = converted7651 - value7656;
        converted7658 = (int) (computed7657);
        regionValue7630 = converted7658;
        break region1319;
        }
        value7668 = regionValue7630;
        value7669 = recovery$indy$flow$219(this);
        if (value40 != null) {
            regionValue7673 = value7669;
            break region1435;
        } else {
            edgeValue7696 = value7668;
            regionValue7686 = edgeValue7696;
            break region1324;
        }
        }
        if (value7669 > regionValue7686) {
            break region1393;
        } else {
            break region1326;
        }
        }
        break region1328;
        }
        recovery$indy$flow$220(this, null);
        value7744 = 0;
        value7746 = ((java.lang.Object)(((net.C_47H) (((java.lang.Object)(a1))))));
        recovery$indy$flow$222(value7746, value7744);
        value7747 = 0.0F;
        value7749 = ((java.lang.Object)(((net.C_47H) (((java.lang.Object)(a1))))));
        recovery$indy$flow$224(value7749, value7747);
        value7750 = 1;
        value7752 = ((java.lang.Object)(((net.C_47H) (((java.lang.Object)(a1))))));
        recovery$indy$flow$226(value7752, ((value7750 & 1) != 0));
        recovery$indy$flow$227(this, false);
        value7753 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).field_40));
        value7755 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value7753))))));
        recovery$indy$flow$230(value7755);
        recovery$indy$flow$231(this, true);
        comparison7756 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison7756 <= 0) {
            break region1421;
        } else {
            break region1387;
        }
        }
        break region1389;
        }
        if (value40 == null) {
            break region1453;
        } else {
            break region1391;
        }
        }
        break region1393;
        }
        converted7816 = (char) (converted21);
        comparison7817 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison7817 < 0) {
            edgeValue7825 = (int) (converted7816);
            regionValue7821 = edgeValue7825;
            break region1452;
        } else {
            edgeValue7841 = (int) (converted7816);
            break region1400;
        }
        }
        break region1402;
        }
        converted7858 = (char) (converted29);
        value7859 = (int) (converted7858);
        value7863 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this))))));
        recovery$indy$flow$233(value7863, (char) (edgeValue7841), converted25, (char) (value7859));
        break region1421;
        }
        break region1423;
        }
        if (value40 != null) {
            break region1451;
        } else {
            break region1424;
        }
        }
        value7887 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDebug));
        value7889 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value7887))))));
        value7890 = recovery$indy$flow$236(value7889);
        edgeValue7894 = (int) ((value7890 ? 1 : 0));
        regionValue7673 = edgeValue7894;
        break region1435;
        }
        if (regionValue7673 == 0) {
            break region1450;
        } else {
            break region1436;
        }
        }
        value7905 = "LastTimerStop";
        value7907 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value7905))))));
        recovery$indy$flow$238(computed9, value7907);
        break region1450;
        }
        break region1451;
        }
        edgeValue7916 = 0;
        regionValue7821 = edgeValue7916;
        break region1452;
        }
        recovery$indy$flow$239(this, ((regionValue7821 & 1) != 0));
        break region1453;
        }
        break region1454;
        }
        value7921 = recovery$indy$flow$240(this);
        value7922 = recovery$indy$flow$241();
        value7924 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value7922))))));
        value7925 = recovery$indy$flow$243(value7924);
        value7926 = recovery$indy$flow$244(value7925);
        computed7927 = value7921 + value7926;
        regionValue5612 = computed7927;
        break region1467;
        }
        recovery$indy$flow$245(this, regionValue5612);
        return;
    }















    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private boolean method_42$d4e2356819(net.minecraft.entity.EntityLivingBase a0,long a1,int a2,int a3) {
        long value15;
        long computed16;
        long computed18;
        long computed20;
        long computed21;
        int converted22;
        long computed24;
        long computed25;
        int converted26;
        long computed28;
        long computed29;
        int converted30;
        long computed32;
        long computed34;
        long computed36;
        long computed38;
        long computed39;
        int converted40;
        long computed42;
        long computed43;
        int converted44;
        long computed46;
        long computed47;
        int converted48;
        long computed50;
        long computed52;
        long computed54;
        java.lang.Object value56;
        java.lang.Object value58;
        java.lang.Object value60;
        boolean value61;
        int regionValue81;
        int edgeValue101;
        int edgeValue141;
        java.lang.Object value256;
        java.lang.Object value258;
        java.lang.Object value259;
        boolean value260;
        int regionValue261;
        int edgeValue262;
        int edgeValue302;
        java.lang.Object value400;
        java.lang.Object value401;
        java.lang.Object value404;
        boolean value405;
        int edgeValue425;
        int regionValue444;
        int edgeValue463;
        int regionValue483;
        int edgeValue503;
        java.lang.Object value616;
        java.lang.Object value617;
        java.lang.Object value618;
        java.lang.Object value621;
        java.lang.Object value622;
        boolean value623;
        int comparison624;
        int regionValue643;
        int edgeValue663;
        int edgeValue703;
        java.lang.Object value894;
        java.lang.Object value895;
        boolean value896;
        int edgeValue897;
        int edgeValue935;
        int value1028;
        int edgeValue1066;
        int edgeValue1068;
        int regionValue1087;
        int edgeValue1106;
        int edgeValue1143;
        double value1144;
        double value1145;
        double value1146;
        net.C_47tf initialized1147;
        int comparison1149;
        int regionValue1169;
        double value1344;
        double value1345;
        double value1346;
        net.C_47tf initialized1347;
        int comparison1348;
        java.lang.Object regionValue1368;
        java.lang.Object regionValue1489;
        short converted1529;
        int edgeValue1549;
        short converted1550;
        int value1554;
        int value1555;
        java.lang.Object value1556;
        java.lang.Object value1557;
        java.lang.Object value1578;
        net.C_47tf initialized1579;
        double value1601;
        double value1603;
        double value1605;
        int value1607;
        int value1609;
        java.lang.Object regionValue1628;
        double regionValue1629;
        double regionValue1630;
        double regionValue1631;
        int regionValue1632;
        int regionValue1633;
        java.lang.Object edgeValue1652;
        int computed1658;
        java.lang.Object regionValue1677;
        double regionValue1678;
        double regionValue1679;
        double regionValue1680;
        int regionValue1681;
        int regionValue1682;
        java.lang.Object edgeValue1701;
        double edgeValue1702;
        double edgeValue1703;
        double edgeValue1704;
        int edgeValue1705;
        int edgeValue1706;
        java.lang.Object regionValue1725;
        double regionValue1726;
        double regionValue1727;
        double regionValue1728;
        int regionValue1729;
        int regionValue1730;
        java.lang.Object edgeValue1749;
        double edgeValue1750;
        double edgeValue1751;
        double edgeValue1752;
        int edgeValue1753;
        int edgeValue1754;
        double value1755;
        double computed1756;
        int value1757;
        double converted1758;
        double computed1759;
        double computed1760;
        double value1761;
        double value1762;
        double computed1763;
        int value1764;
        double converted1765;
        double computed1766;
        double computed1767;
        double value1768;
        double value1769;
        double computed1770;
        int value1771;
        double converted1772;
        double computed1773;
        double computed1774;
        double value1775;
        int incremented1776;
        int incremented1777;
        java.lang.Object regionValue1796;
        double regionValue1797;
        double regionValue1798;
        double regionValue1799;
        int regionValue1800;
        int regionValue1801;
        java.lang.Object edgeValue1820;
        double edgeValue1821;
        double edgeValue1822;
        double edgeValue1823;
        int edgeValue1824;
        int edgeValue1825;
        int comparison1826;
        java.lang.Object edgeValue1845;
        double edgeValue1846;
        double edgeValue1847;
        double edgeValue1848;
        int edgeValue1849;
        int edgeValue1850;
        double regionValue1869;
        double regionValue1870;
        double regionValue1871;
        double edgeValue1890;
        double edgeValue1891;
        double edgeValue1892;
        java.lang.Object edgeValue1911;
        double edgeValue1912;
        double edgeValue1913;
        double edgeValue1914;
        int edgeValue1915;
        int edgeValue1916;
        java.lang.Object regionValue1935;
        double regionValue1936;
        double regionValue1937;
        double regionValue1938;
        int regionValue1939;
        int regionValue1940;
        java.lang.Object edgeValue1959;
        double edgeValue1960;
        double edgeValue1961;
        double edgeValue1962;
        int edgeValue1963;
        int edgeValue1964;
        int comparison1965;
        java.lang.Object edgeValue1984;
        double edgeValue1985;
        double edgeValue1986;
        double edgeValue1987;
        int edgeValue1988;
        int edgeValue1989;
        double edgeValue2008;
        double edgeValue2009;
        double edgeValue2010;
        float value2011;
        float computed2012;
        float value2014;
        double converted2016;
        double computed2017;
        double converted2018;
        double computed2019;
        double converted2020;
        double computed2021;
        float value2022;
        double converted2023;
        double computed2024;
        double converted2025;
        double computed2026;
        net.C_478i initialized2027;
        double converted2028;
        double converted2029;
        double converted2030;
        java.lang.Object value2031;
        java.lang.Object value2033;
        java.lang.Object value2035;
        java.lang.Object value2036;
        java.lang.Object value2037;
        java.lang.Object value2039;
        java.lang.Object value2041;
        java.lang.Object value2042;
        java.lang.Object value2043;
        double value2045;
        double value2046;
        double value2047;
        double computed2048;
        double computed2049;
        double computed2050;
        double value2051;
        double value2052;
        double value2053;
        double computed2054;
        double computed2055;
        double computed2056;
        double value2057;
        double value2058;
        double value2059;
        double computed2060;
        double computed2061;
        double computed2062;
        net.C_47tf initialized2063;
        int value2065;
        int comparison2066;
        int regionValue2088;
        int regionValue2180;
        int edgeValue2416;
        java.lang.Object regionValue2436;
        int regionValue2437;
        int edgeValue2457;
        int regionValue2479;
        int edgeValue2501;
        java.lang.Object regionValue2521;
        double value2562;
        double value2563;
        double value2564;
        net.C_47tf initialized2565;
        int computed2587;
        java.lang.Object edgeValue2606;
        java.lang.Object value2608;
        java.lang.Object value2610;
        java.lang.Object value2611;
        int value2615;
        java.lang.Object value2616;
        java.lang.Object value2617;
        java.lang.Object value2618;
        double arrayValue2620;
        double arrayValue2621;
        double arrayValue2622;
        net.C_47tf initialized2623;
        double value2625;
        double value2627;
        double value2629;
        int value2631;
        java.lang.Object regionValue2649;
        double regionValue2652;
        double regionValue2653;
        double regionValue2654;
        int regionValue2655;
        java.lang.Object edgeValue2673;
        double value2680;
        double computed2681;
        double converted2682;
        double computed2683;
        double computed2684;
        double value2685;
        double value2686;
        double computed2687;
        double converted2688;
        double computed2689;
        double computed2690;
        double value2691;
        double value2692;
        double computed2693;
        double converted2694;
        double computed2695;
        double computed2696;
        double value2697;
        int incremented2698;
        java.lang.Object regionValue2716;
        double regionValue2719;
        double regionValue2720;
        double regionValue2721;
        int regionValue2722;
        int regionValue2723;
        java.lang.Object edgeValue2741;
        double edgeValue2744;
        double edgeValue2745;
        double edgeValue2746;
        int edgeValue2747;
        int edgeValue2748;
        java.lang.Object regionValue2766;
        double regionValue2769;
        double regionValue2770;
        double regionValue2771;
        int regionValue2772;
        int regionValue2773;
        int regionValue2774;
        java.lang.Object edgeValue2792;
        double edgeValue2795;
        double edgeValue2796;
        double edgeValue2797;
        int edgeValue2798;
        int edgeValue2799;
        int edgeValue2800;
        java.lang.Object edgeValue2818;
        double edgeValue2821;
        double edgeValue2822;
        double edgeValue2823;
        int edgeValue2824;
        java.lang.Object regionValue2842;
        double regionValue2845;
        double regionValue2846;
        double regionValue2847;
        int regionValue2848;
        java.lang.Object edgeValue2866;
        double edgeValue2869;
        double edgeValue2870;
        double edgeValue2871;
        int edgeValue2872;
        net.C_47tf initialized2873;
        net.C_47tf value2874;
        double value2875;
        double value2876;
        double value2877;
        double computed2878;
        double computed2879;
        double computed2880;
        double value2881;
        double value2882;
        double value2883;
        double computed2884;
        double computed2885;
        double computed2886;
        double value2887;
        double value2888;
        double value2889;
        double computed2890;
        double computed2891;
        double computed2892;
        net.C_47tf initialized2893;
        net.C_47tf value2894;
        java.lang.Object value2895;
        java.lang.Object value2896;
        java.lang.Object value2897;
        java.lang.Object value2898;
        float value2899;
        float computed2900;
        float value2901;
        java.lang.Object value2902;
        java.lang.Object value2903;
        java.lang.Object value2904;
        java.lang.Object value2905;
        float value2906;
        float value2907;
        double value2908;
        double converted2909;
        double computed2910;
        double value2911;
        double value2912;
        double converted2913;
        double computed2914;
        double value2915;
        double converted2916;
        double computed2917;
        double value2918;
        java.lang.Object value2919;
        java.lang.Object value2920;
        java.lang.Object value2921;
        java.lang.Object value2922;
        float value2923;
        double converted2924;
        double computed2925;
        double value2926;
        double converted2927;
        double computed2928;
        net.C_478i initialized2929;
        double converted2930;
        double converted2931;
        double converted2932;
        java.lang.Object value2933;
        java.lang.Object value2934;
        double value2935;
        double converted2936;
        double computed2937;
        double value2938;
        double value2939;
        double converted2940;
        double computed2941;
        double value2942;
        double converted2943;
        double computed2944;
        double value2945;
        java.lang.Object value2946;
        java.lang.Object value2947;
        java.lang.Object value2948;
        java.lang.Object value2949;
        float value2950;
        double converted2951;
        double computed2952;
        double value2953;
        double converted2954;
        double computed2955;
        net.C_478i initialized2956;
        double converted2957;
        double converted2958;
        double converted2959;
        java.lang.Object value2960;
        java.lang.Object value2961;
        short converted2962;
        short converted2963;
        int computed2964;
        int value2965;
        int value2968;
        int value2969;
        java.lang.Object value2970;
        java.lang.Object value2971;
        java.lang.Object value2972;
        short converted2973;
        short converted2974;
        int comparison2975;
        java.lang.Object edgeValue2993;
        double edgeValue2996;
        double edgeValue2997;
        double edgeValue2998;
        int edgeValue2999;
        int edgeValue3000;
        int edgeValue3001;
        java.lang.Object regionValue3019;
        double regionValue3022;
        double regionValue3023;
        double regionValue3024;
        int regionValue3025;
        java.lang.Object regionValue3026;
        java.lang.Object regionValue3027;
        java.lang.Object regionValue3028;
        int regionValue3029;
        int regionValue3030;
        java.lang.Object edgeValue3048;
        double edgeValue3051;
        double edgeValue3052;
        double edgeValue3053;
        int edgeValue3054;
        java.lang.Object edgeValue3055;
        java.lang.Object edgeValue3056;
        java.lang.Object edgeValue3057;
        int edgeValue3058;
        int edgeValue3059;
        int value3063;
        int value3064;
        java.lang.Object value3065;
        java.lang.Object value3066;
        java.lang.Object value3067;
        int computed3068;
        int value3069;
        java.lang.Object value3072;
        java.lang.Object value3073;
        java.lang.Object value3074;
        double arrayValue3075;
        int comparison3076;
        java.lang.Object regionValue3094;
        double regionValue3097;
        double regionValue3098;
        double regionValue3099;
        int regionValue3100;
        java.lang.Object regionValue3101;
        java.lang.Object regionValue3102;
        java.lang.Object regionValue3103;
        java.lang.Object regionValue3104;
        int regionValue3105;
        java.lang.Object edgeValue3124;
        double edgeValue3127;
        double edgeValue3128;
        double edgeValue3129;
        int edgeValue3130;
        java.lang.Object edgeValue3131;
        java.lang.Object edgeValue3132;
        java.lang.Object edgeValue3133;
        java.lang.Object edgeValue3134;
        int edgeValue3135;
        java.lang.Object edgeValue3154;
        double edgeValue3157;
        double edgeValue3158;
        double edgeValue3159;
        int edgeValue3160;
        int edgeValue3161;
        java.lang.Object regionValue3179;
        double regionValue3182;
        double regionValue3183;
        double regionValue3184;
        int regionValue3185;
        java.lang.Object regionValue3186;
        java.lang.Object regionValue3187;
        java.lang.Object regionValue3188;
        java.lang.Object regionValue3189;
        int regionValue3190;
        java.lang.Object edgeValue3208;
        double edgeValue3211;
        double edgeValue3212;
        double edgeValue3213;
        int edgeValue3214;
        java.lang.Object edgeValue3215;
        java.lang.Object edgeValue3216;
        java.lang.Object edgeValue3217;
        java.lang.Object edgeValue3218;
        int edgeValue3219;
        int comparison3220;
        java.lang.Object edgeValue3238;
        double edgeValue3241;
        double edgeValue3242;
        double edgeValue3243;
        int edgeValue3244;
        java.lang.Object edgeValue3245;
        java.lang.Object edgeValue3246;
        java.lang.Object edgeValue3247;
        java.lang.Object edgeValue3248;
        int edgeValue3249;
        java.lang.Object regionValue3264;
        java.lang.Object regionValue3265;
        java.lang.Object regionValue3266;
        java.lang.Object regionValue3267;
        int regionValue3268;
        java.lang.Object edgeValue3283;
        java.lang.Object edgeValue3284;
        java.lang.Object edgeValue3285;
        java.lang.Object edgeValue3286;
        int edgeValue3287;
        java.lang.Object regionValue3302;
        java.lang.Object regionValue3303;
        java.lang.Object regionValue3304;
        java.lang.Object regionValue3305;
        int regionValue3306;
        java.lang.Object edgeValue3320;
        java.lang.Object edgeValue3321;
        java.lang.Object edgeValue3322;
        java.lang.Object edgeValue3323;
        int edgeValue3324;
        java.lang.Object regionValue3338;
        java.lang.Object regionValue3339;
        java.lang.Object regionValue3340;
        java.lang.Object regionValue3341;
        int regionValue3342;
        java.lang.Object edgeValue3356;
        java.lang.Object edgeValue3357;
        java.lang.Object edgeValue3358;
        java.lang.Object edgeValue3359;
        int edgeValue3360;
        java.lang.Object regionValue3374;
        java.lang.Object regionValue3375;
        java.lang.Object regionValue3376;
        java.lang.Object regionValue3377;
        java.lang.Object edgeValue3391;
        java.lang.Object edgeValue3392;
        java.lang.Object edgeValue3393;
        java.lang.Object edgeValue3394;
        java.lang.Object regionValue3408;
        java.lang.Object regionValue3409;
        java.lang.Object regionValue3410;
        java.lang.Object regionValue3411;
        java.lang.Object edgeValue3425;
        java.lang.Object edgeValue3426;
        java.lang.Object edgeValue3427;
        java.lang.Object edgeValue3428;
        java.lang.Object edgeValue3442;
        java.lang.Object edgeValue3443;
        java.lang.Object edgeValue3444;
        java.lang.Object edgeValue3445;
        int edgeValue3446;
        java.lang.Object regionValue3460;
        java.lang.Object regionValue3461;
        java.lang.Object regionValue3462;
        java.lang.Object regionValue3463;
        int regionValue3464;
        java.lang.Object edgeValue3478;
        java.lang.Object edgeValue3479;
        java.lang.Object edgeValue3480;
        java.lang.Object edgeValue3481;
        int edgeValue3482;
        java.lang.Object edgeValue3496;
        java.lang.Object edgeValue3497;
        java.lang.Object edgeValue3498;
        java.lang.Object edgeValue3499;
        int edgeValue3500;
        int value3501;
        net.C_47tf initialized3502;
        net.C_47tf initialized3504;
        float value3506;
        java.lang.Object regionValue3520;
        java.lang.Object regionValue3521;
        int regionValue3522;
        float regionValue3525;
        java.lang.Object edgeValue3539;
        java.lang.Object edgeValue3540;
        int edgeValue3541;
        java.lang.Object regionValue3558;
        java.lang.Object regionValue3559;
        int regionValue3560;
        java.lang.Object edgeValue3576;
        java.lang.Object edgeValue3577;
        int edgeValue3578;
        java.lang.Object value3581;
        double value3582;
        int value3583;
        double value3584;
        int value3585;
        int computed3586;
        double value3587;
        int value3588;
        net.C_478Q initialized3589;
        java.lang.Object value3590;
        java.lang.Object value3591;
        float value3592;
        float computed3593;
        java.lang.Object edgeValue3608;
        java.lang.Object edgeValue3609;
        int edgeValue3610;
        double value3614;
        double value3615;
        double computed3616;
        double value3618;
        double value3619;
        double computed3620;
        double value3622;
        double value3623;
        double computed3624;
        java.lang.Object value3626;
        java.lang.Object value3628;
        java.lang.Object value3629;
        boolean value3630;
        int comparison3631;
        java.lang.Object regionValue3645;
        java.lang.Object regionValue3646;
        int regionValue3647;
        float regionValue3650;
        int regionValue3654;
        java.lang.Object edgeValue3669;
        java.lang.Object edgeValue3670;
        int edgeValue3671;
        float edgeValue3674;
        int edgeValue3678;
        java.lang.Object regionValue3693;
        java.lang.Object regionValue3694;
        int regionValue3695;
        float regionValue3698;
        java.lang.Object edgeValue3717;
        java.lang.Object edgeValue3718;
        int edgeValue3719;
        float edgeValue3722;
        int edgeValue3726;
        java.lang.Object regionValue3741;
        java.lang.Object regionValue3742;
        int regionValue3743;
        float regionValue3746;
        int regionValue3750;
        java.lang.Object edgeValue3764;
        java.lang.Object edgeValue3765;
        int edgeValue3766;
        float edgeValue3769;
        java.lang.Object regionValue3787;
        java.lang.Object regionValue3788;
        int regionValue3789;
        float regionValue3792;
        java.lang.Object edgeValue3810;
        java.lang.Object edgeValue3811;
        int edgeValue3812;
        float edgeValue3815;
        java.lang.Object regionValue3833;
        java.lang.Object regionValue3834;
        int regionValue3835;
        float regionValue3838;
        java.lang.Object edgeValue3856;
        java.lang.Object edgeValue3857;
        int edgeValue3858;
        float edgeValue3861;
        java.lang.Object regionValue3879;
        java.lang.Object regionValue3880;
        int regionValue3881;
        float regionValue3884;
        double regionValue3886;
        java.lang.Object edgeValue3901;
        java.lang.Object edgeValue3902;
        int edgeValue3903;
        float edgeValue3906;
        java.lang.Object regionValue3923;
        java.lang.Object regionValue3924;
        int regionValue3925;
        float regionValue3928;
        java.lang.Object edgeValue3945;
        java.lang.Object edgeValue3946;
        int edgeValue3947;
        float edgeValue3950;
        java.lang.Object value3954;
        java.lang.Object value3956;
        java.lang.Object value3957;
        double value3958;
        int converted3959;
        double value3960;
        int converted3961;
        net.C_478Q initialized3962;
        boolean value3963;
        java.lang.Object edgeValue3977;
        java.lang.Object edgeValue3978;
        int edgeValue3979;
        float edgeValue3982;
        int edgeValue3986;
        java.lang.Object edgeValue4000;
        java.lang.Object edgeValue4001;
        int edgeValue4002;
        float edgeValue4005;
        int edgeValue4009;
        java.lang.Object regionValue4024;
        java.lang.Object regionValue4025;
        int regionValue4026;
        float regionValue4029;
        int regionValue4032;
        java.lang.Object edgeValue4046;
        java.lang.Object edgeValue4047;
        int edgeValue4048;
        float edgeValue4051;
        int edgeValue4054;
        java.lang.Object regionValue4068;
        java.lang.Object regionValue4069;
        int regionValue4070;
        float regionValue4073;
        int regionValue4077;
        java.lang.Object edgeValue4091;
        java.lang.Object edgeValue4092;
        int edgeValue4093;
        float edgeValue4096;
        int edgeValue4100;
        java.lang.Object regionValue4114;
        java.lang.Object regionValue4115;
        int regionValue4116;
        float regionValue4119;
        java.lang.Object edgeValue4135;
        java.lang.Object edgeValue4136;
        int edgeValue4137;
        float edgeValue4140;
        java.lang.Object regionValue4156;
        java.lang.Object regionValue4157;
        int regionValue4158;
        float regionValue4161;
        java.lang.Object edgeValue4178;
        java.lang.Object edgeValue4179;
        int edgeValue4180;
        float edgeValue4183;
        java.lang.Object value4187;
        java.lang.Object value4189;
        java.lang.Object value4190;
        double value4191;
        int converted4192;
        double value4193;
        int converted4194;
        net.C_478Q initialized4195;
        java.lang.Object value4196;
        boolean value4197;
        java.lang.Object edgeValue4211;
        java.lang.Object edgeValue4212;
        int edgeValue4213;
        float edgeValue4216;
        int edgeValue4219;
        java.lang.Object regionValue4233;
        java.lang.Object regionValue4234;
        int regionValue4235;
        float regionValue4238;
        java.lang.Object edgeValue4256;
        java.lang.Object edgeValue4257;
        int edgeValue4258;
        float edgeValue4261;
        int edgeValue4265;
        java.lang.Object regionValue4279;
        java.lang.Object regionValue4280;
        int regionValue4281;
        float regionValue4284;
        java.lang.Object edgeValue4302;
        java.lang.Object edgeValue4303;
        int edgeValue4304;
        float edgeValue4307;
        java.lang.Object edgeValue4325;
        java.lang.Object edgeValue4326;
        int edgeValue4327;
        float edgeValue4330;
        java.lang.Object regionValue4347;
        java.lang.Object regionValue4348;
        int regionValue4349;
        float regionValue4352;
        java.lang.Object edgeValue4368;
        java.lang.Object edgeValue4369;
        int edgeValue4370;
        float edgeValue4373;
        java.lang.Object edgeValue4389;
        java.lang.Object edgeValue4390;
        int edgeValue4391;
        float edgeValue4394;
        double value4397;
        java.lang.Object regionValue4411;
        java.lang.Object regionValue4412;
        int regionValue4413;
        float regionValue4416;
        double regionValue4419;
        java.lang.Object edgeValue4433;
        java.lang.Object edgeValue4434;
        int edgeValue4435;
        float edgeValue4438;
        java.lang.Object regionValue4455;
        java.lang.Object regionValue4456;
        int regionValue4457;
        float regionValue4460;
        java.lang.Object edgeValue4477;
        java.lang.Object edgeValue4478;
        int edgeValue4479;
        float edgeValue4482;
        java.lang.Object regionValue4499;
        java.lang.Object regionValue4500;
        int regionValue4501;
        float regionValue4504;
        java.lang.Object edgeValue4521;
        java.lang.Object edgeValue4522;
        int edgeValue4523;
        float edgeValue4526;
        int comparison4530;
        java.lang.Object edgeValue4544;
        java.lang.Object edgeValue4545;
        int edgeValue4546;
        float edgeValue4549;
        java.lang.Object regionValue4566;
        java.lang.Object regionValue4567;
        int regionValue4568;
        float regionValue4571;
        java.lang.Object edgeValue4587;
        java.lang.Object edgeValue4588;
        int edgeValue4589;
        float edgeValue4592;
        java.lang.Object regionValue4608;
        java.lang.Object regionValue4609;
        int regionValue4610;
        float regionValue4613;
        java.lang.Object edgeValue4629;
        java.lang.Object edgeValue4630;
        int edgeValue4631;
        float edgeValue4634;
        double value4637;
        int comparison4638;
        java.lang.Object regionValue4652;
        java.lang.Object regionValue4653;
        int regionValue4654;
        float regionValue4657;
        double regionValue4658;
        double regionValue4659;
        double regionValue4660;
        java.lang.Object edgeValue4674;
        java.lang.Object edgeValue4675;
        int edgeValue4676;
        float edgeValue4679;
        java.lang.Object regionValue4696;
        java.lang.Object regionValue4697;
        int regionValue4698;
        float regionValue4701;
        java.lang.Object edgeValue4718;
        java.lang.Object edgeValue4719;
        int edgeValue4720;
        float edgeValue4723;
        java.lang.Object regionValue4740;
        java.lang.Object regionValue4741;
        int regionValue4742;
        float regionValue4745;
        double regionValue4748;
        java.lang.Object edgeValue4762;
        java.lang.Object edgeValue4763;
        int edgeValue4764;
        float edgeValue4767;
        java.lang.Object regionValue4784;
        java.lang.Object regionValue4785;
        int regionValue4786;
        float regionValue4789;
        java.lang.Object edgeValue4805;
        java.lang.Object edgeValue4806;
        int edgeValue4807;
        float edgeValue4810;
        java.lang.Object edgeValue4826;
        java.lang.Object edgeValue4827;
        int edgeValue4828;
        float edgeValue4831;
        java.lang.Object edgeValue4847;
        java.lang.Object edgeValue4848;
        int edgeValue4849;
        float edgeValue4852;
        double edgeValue4855;
        double value4856;
        int comparison4857;
        java.lang.Object edgeValue4871;
        java.lang.Object edgeValue4872;
        int edgeValue4873;
        float edgeValue4876;
        double edgeValue4879;
        java.lang.Object regionValue4893;
        java.lang.Object regionValue4894;
        int regionValue4895;
        float regionValue4898;
        double regionValue4901;
        java.lang.Object edgeValue4915;
        java.lang.Object edgeValue4916;
        int edgeValue4917;
        float edgeValue4920;
        double edgeValue4923;
        java.lang.Object edgeValue4937;
        java.lang.Object edgeValue4938;
        int edgeValue4939;
        float edgeValue4942;
        double edgeValue4945;
        java.lang.Object regionValue4959;
        java.lang.Object regionValue4960;
        int regionValue4961;
        float regionValue4964;
        double regionValue4967;
        java.lang.Object edgeValue4981;
        java.lang.Object edgeValue4982;
        int edgeValue4983;
        float edgeValue4986;
        double edgeValue4989;
        java.lang.Object edgeValue5003;
        java.lang.Object edgeValue5004;
        int edgeValue5005;
        float edgeValue5008;
        double edgeValue5010;
        double computed5012;
        java.lang.Object edgeValue5027;
        java.lang.Object edgeValue5028;
        int edgeValue5029;
        float edgeValue5032;
        double computed5036;
        double converted5038;
        double computed5039;
        double converted5041;
        double computed5042;
        java.lang.Object edgeValue5057;
        java.lang.Object edgeValue5058;
        int edgeValue5059;
        float edgeValue5062;
        java.lang.Object value5066;
        java.lang.Object value5068;
        java.lang.Object value5069;
        double value5070;
        double value5071;
        double computed5072;
        java.lang.Object value5074;
        java.lang.Object value5076;
        java.lang.Object value5077;
        double value5078;
        double value5079;
        double computed5080;
        double computed5082;
        double computed5083;
        double computed5084;
        float value5085;
        float value5087;
        double computed5088;
        double computed5090;
        double computed5092;
        double converted5094;
        double computed5095;
        double converted5096;
        double computed5097;
        double computed5098;
        double converted5100;
        double computed5101;
        double converted5103;
        double computed5104;
        double converted5105;
        double computed5106;
        int comparison5107;
        java.lang.Object regionValue5121;
        java.lang.Object regionValue5122;
        int regionValue5123;
        float regionValue5125;
        double regionValue5127;
        double regionValue5129;
        double regionValue5130;
        java.lang.Object edgeValue5144;
        java.lang.Object edgeValue5145;
        int edgeValue5146;
        float edgeValue5148;
        java.lang.Object regionValue5167;
        java.lang.Object regionValue5168;
        int regionValue5169;
        float regionValue5171;
        java.lang.Object edgeValue5189;
        java.lang.Object edgeValue5190;
        int edgeValue5191;
        float edgeValue5193;
        double computed5198;
        java.lang.Object regionValue5213;
        java.lang.Object regionValue5214;
        int regionValue5215;
        float regionValue5217;
        double regionValue5219;
        double regionValue5220;
        java.lang.Object edgeValue5234;
        java.lang.Object edgeValue5235;
        int edgeValue5236;
        float edgeValue5238;
        java.lang.Object regionValue5255;
        java.lang.Object regionValue5256;
        int regionValue5257;
        float regionValue5259;
        java.lang.Object edgeValue5277;
        java.lang.Object edgeValue5278;
        int edgeValue5279;
        float edgeValue5281;
        java.lang.Object edgeValue5299;
        java.lang.Object edgeValue5300;
        int edgeValue5301;
        float edgeValue5303;
        double edgeValue5308;
        int comparison5309;
        java.lang.Object regionValue5323;
        java.lang.Object regionValue5324;
        int regionValue5325;
        float regionValue5327;
        double regionValue5329;
        double regionValue5330;
        java.lang.Object edgeValue5344;
        java.lang.Object edgeValue5345;
        int edgeValue5346;
        float edgeValue5348;
        double edgeValue5350;
        java.lang.Object regionValue5365;
        java.lang.Object regionValue5366;
        int regionValue5367;
        float regionValue5369;
        double regionValue5371;
        java.lang.Object edgeValue5385;
        java.lang.Object edgeValue5386;
        int edgeValue5387;
        float edgeValue5389;
        double edgeValue5391;
        java.lang.Object edgeValue5405;
        java.lang.Object edgeValue5406;
        int edgeValue5407;
        float edgeValue5409;
        double edgeValue5411;
        double edgeValue5412;
        double value5413;
        java.lang.Object edgeValue5427;
        java.lang.Object edgeValue5428;
        int edgeValue5429;
        float edgeValue5431;
        double edgeValue5433;
        double edgeValue5434;
        net.C_47tf initialized5435;
        double arrayValue5437;
        double arrayValue5438;
        java.lang.Object value5439;
        java.lang.Object value5441;
        java.lang.Object value5442;
        float value5443;
        double converted5444;
        double computed5445;
        double arrayValue5446;
        net.C_47tf initialized5447;
        double value5449;
        double value5450;
        double value5451;
        double value5452;
        double value5454;
        double value5455;
        double value5456;
        double value5457;
        double arrayValue5459;
        double computed5460;
        double arrayValue5462;
        double computed5463;
        double value5465;
        double computed5466;
        double computed5467;
        double computed5468;
        float converted5469;
        java.lang.Object value5471;
        java.lang.Object value5473;
        java.lang.Object value5474;
        int value5475;
        int computed5476;
        float computed5478;
        float computed5479;
        float value5480;
        float negated5481;
        float converted5482;
        float computed5483;
        float computed5484;
        double converted5485;
        float computed5486;
        float computed5487;
        float value5488;
        float converted5489;
        float computed5490;
        float computed5491;
        double converted5492;
        java.lang.Object value5493;
        int comparison5495;
        java.lang.Object regionValue5509;
        java.lang.Object regionValue5510;
        int regionValue5511;
        float regionValue5513;
        java.lang.Object edgeValue5528;
        java.lang.Object edgeValue5529;
        int edgeValue5530;
        float edgeValue5532;
        java.lang.Object regionValue5547;
        java.lang.Object regionValue5548;
        int regionValue5549;
        java.lang.Object edgeValue5565;
        java.lang.Object edgeValue5566;
        int edgeValue5567;
        java.lang.Object regionValue5583;
        java.lang.Object regionValue5584;
        int regionValue5585;
        float regionValue5588;
        java.lang.Object edgeValue5602;
        java.lang.Object edgeValue5603;
        int edgeValue5604;
        float edgeValue5607;
        java.lang.Object regionValue5621;
        java.lang.Object regionValue5622;
        int regionValue5623;
        java.lang.Object edgeValue5640;
        java.lang.Object edgeValue5641;
        int edgeValue5642;
        float edgeValue5645;
        java.lang.Object regionValue5659;
        java.lang.Object regionValue5660;
        int regionValue5661;
        java.lang.Object edgeValue5678;
        java.lang.Object edgeValue5679;
        int edgeValue5680;
        java.lang.Object edgeValue5698;
        java.lang.Object edgeValue5699;
        int edgeValue5700;
        java.lang.Object regionValue5717;
        java.lang.Object regionValue5718;
        int regionValue5719;
        float regionValue5721;
        java.lang.Object edgeValue5736;
        java.lang.Object edgeValue5737;
        int edgeValue5738;
        float edgeValue5740;
        java.lang.Object regionValue5755;
        java.lang.Object regionValue5756;
        int regionValue5757;
        java.lang.Object edgeValue5773;
        java.lang.Object edgeValue5774;
        int edgeValue5775;
        java.lang.Object value5778;
        double value5779;
        int value5780;
        double value5781;
        int value5782;
        int computed5783;
        double value5784;
        int value5785;
        net.C_478Q initialized5786;
        java.lang.Object value5787;
        java.lang.Object value5788;
        float value5789;
        float computed5790;
        java.lang.Object edgeValue5805;
        java.lang.Object edgeValue5806;
        int edgeValue5807;
        float computed5811;
        float computed5812;
        float computed5813;
        java.lang.Object edgeValue5827;
        java.lang.Object edgeValue5828;
        int edgeValue5829;
        float value5833;
        java.lang.Object regionValue5847;
        java.lang.Object regionValue5848;
        java.lang.Object edgeValue5864;
        java.lang.Object edgeValue5865;
        java.lang.Object regionValue5881;
        java.lang.Object regionValue5882;
        float regionValue5885;
        java.lang.Object edgeValue5899;
        java.lang.Object edgeValue5900;
        float edgeValue5903;
        float value5904;
        float computed5905;
        int comparison5906;
        java.lang.Object regionValue5920;
        java.lang.Object regionValue5921;
        float regionValue5924;
        java.lang.Object edgeValue5938;
        java.lang.Object edgeValue5939;
        java.lang.Object regionValue5956;
        java.lang.Object regionValue5957;
        java.lang.Object edgeValue5974;
        java.lang.Object edgeValue5975;
        java.lang.Object regionValue5992;
        java.lang.Object regionValue5993;
        java.lang.Object edgeValue6010;
        java.lang.Object edgeValue6011;
        java.lang.Object regionValue6029;
        java.lang.Object regionValue6030;
        float regionValue6033;
        java.lang.Object edgeValue6047;
        java.lang.Object edgeValue6048;
        java.lang.Object edgeValue6065;
        java.lang.Object edgeValue6066;
        float value6069;
        java.lang.Object edgeValue6083;
        java.lang.Object edgeValue6084;
        float value6088;
        java.lang.Object edgeValue6102;
        java.lang.Object edgeValue6103;
        float edgeValue6106;
        float value6107;
        float value6108;
        float computed6109;
        float computed6110;
        float computed6111;
        int comparison6113;
        java.lang.Object regionValue6127;
        java.lang.Object regionValue6128;
        float regionValue6131;
        float regionValue6134;
        int regionValue6135;
        java.lang.Object edgeValue6149;
        java.lang.Object edgeValue6150;
        float edgeValue6153;
        java.lang.Object regionValue6171;
        java.lang.Object regionValue6172;
        float regionValue6175;
        java.lang.Object edgeValue6193;
        java.lang.Object edgeValue6194;
        float edgeValue6197;
        java.lang.Object regionValue6215;
        java.lang.Object regionValue6216;
        java.lang.Object regionValue6218;
        java.lang.Object edgeValue6232;
        java.lang.Object edgeValue6233;
        java.lang.Object regionValue6249;
        java.lang.Object regionValue6250;
        float regionValue6253;
        java.lang.Object edgeValue6270;
        java.lang.Object edgeValue6271;
        float edgeValue6274;
        java.lang.Object regionValue6291;
        java.lang.Object regionValue6292;
        float regionValue6295;
        java.lang.Object edgeValue6312;
        java.lang.Object edgeValue6313;
        float edgeValue6316;
        float value6320;
        int comparison6322;
        java.lang.Object regionValue6336;
        java.lang.Object regionValue6337;
        float regionValue6340;
        float regionValue6341;
        java.lang.Object edgeValue6355;
        java.lang.Object edgeValue6356;
        java.lang.Object regionValue6374;
        java.lang.Object regionValue6375;
        float regionValue6378;
        java.lang.Object edgeValue6396;
        java.lang.Object edgeValue6397;
        float edgeValue6400;
        java.lang.Object regionValue6418;
        java.lang.Object regionValue6419;
        float regionValue6422;
        float regionValue6423;
        float regionValue6424;
        java.lang.Object edgeValue6438;
        java.lang.Object edgeValue6439;
        float edgeValue6444;
        java.lang.Object regionValue6458;
        java.lang.Object regionValue6459;
        float regionValue6462;
        java.lang.Object edgeValue6481;
        java.lang.Object edgeValue6482;
        float edgeValue6485;
        float edgeValue6490;
        java.lang.Object regionValue6504;
        java.lang.Object regionValue6505;
        float regionValue6508;
        java.lang.Object edgeValue6527;
        java.lang.Object edgeValue6528;
        float edgeValue6531;
        int comparison6537;
        java.lang.Object edgeValue6551;
        java.lang.Object edgeValue6552;
        float edgeValue6555;
        java.lang.Object regionValue6573;
        java.lang.Object regionValue6574;
        float regionValue6577;
        float regionValue6580;
        java.lang.Object edgeValue6594;
        java.lang.Object edgeValue6595;
        float edgeValue6598;
        float edgeValue6601;
        java.lang.Object regionValue6615;
        java.lang.Object regionValue6616;
        float regionValue6619;
        java.lang.Object edgeValue6635;
        java.lang.Object edgeValue6636;
        float edgeValue6639;
        float value6642;
        java.lang.Object edgeValue6656;
        java.lang.Object edgeValue6657;
        float edgeValue6660;
        float computed6664;
        float computed6666;
        java.lang.Object edgeValue6681;
        java.lang.Object edgeValue6682;
        float computed6688;
        java.lang.Object edgeValue6702;
        java.lang.Object edgeValue6703;
        float edgeValue6706;
        float value6708;
        double value6709;
        double value6710;
        float value6711;
        double converted6712;
        double computed6713;
        double value6714;
        net.C_47tf initialized6715;
        double value6717;
        double value6718;
        double value6719;
        double value6720;
        double value6721;
        double value6722;
        double value6723;
        double value6724;
        double value6725;
        double value6726;
        double value6727;
        double value6728;
        net.C_47tf initialized6729;
        double value6731;
        double computed6732;
        double value6734;
        double computed6735;
        double value6737;
        double computed6738;
        double computed6739;
        double computed6740;
        float converted6741;
        float computed6743;
        float computed6744;
        float value6745;
        float computed6747;
        float computed6748;
        float value6749;
        float computed6751;
        float computed6752;
        float computed6753;
        double converted6754;
        float computed6755;
        float computed6756;
        float computed6757;
        double converted6758;
        java.lang.Object value6759;
        java.lang.Object edgeValue6774;
        java.lang.Object edgeValue6775;
        java.lang.Object value6778;
        double value6780;
        double value6781;
        float value6782;
        double converted6783;
        double computed6784;
        double value6785;
        net.C_47tf initialized6786;
        double value6788;
        double value6789;
        double value6790;
        double value6791;
        double value6792;
        double value6793;
        double value6794;
        double value6795;
        double value6796;
        double value6797;
        double value6798;
        double value6799;
        net.C_47tf initialized6800;
        double value6802;
        double value6803;
        float value6804;
        double converted6805;
        double computed6806;
        double value6807;
        net.C_47tf initialized6808;
        double value6810;
        double value6811;
        double value6812;
        double value6813;
        double value6814;
        double value6815;
        double value6816;
        double value6817;
        double value6818;
        double value6819;
        double value6820;
        double value6821;
        net.C_47tf initialized6822;
        double arrayValue6824;
        double arrayValue6825;
        double arrayValue6826;
        net.C_47tf initialized6827;
        double value6829;
        double value6830;
        java.lang.Object value6831;
        java.lang.Object value6833;
        java.lang.Object value6834;
        float value6835;
        double converted6836;
        double computed6837;
        double value6838;
        net.C_47tf initialized6839;
        double value6841;
        double value6842;
        double value6843;
        double value6844;
        double value6845;
        double value6846;
        double value6847;
        double value6848;
        double value6849;
        double value6850;
        double value6851;
        double value6852;
        net.C_47tf initialized6853;
        java.lang.Object value6855;
        java.lang.Object value6856;
        java.lang.Object value6859;
        boolean value6860;
        int regionValue6875;
        int edgeValue6890;
        int edgeValue6926;
        java.lang.Object value7029;
        java.lang.Object regionValue7047;
        java.lang.Object value7138;
        int comparison7139;
        java.lang.Object regionValue7154;
        java.lang.Object value7242;
        java.lang.Object value7316;
        java.lang.Object value7317;
        double value7333;
        double regionValue7348;
        java.lang.Object value7364;
        java.lang.Object value7383;
        java.lang.Object regionValue7398;
        char converted7450;
        short converted7451;
        int value7453;
        int value7454;
        java.lang.Object value7456;
        boolean value7457;
        int edgeValue7472;
        java.lang.Object value7529;
        java.lang.Object value7530;
        java.lang.Object value7546;
        java.lang.Object value7547;
        double value7548;
        double edgeValue7578;
        double value7579;
        java.lang.Object value7580;
        java.lang.Object value7582;
        boolean value7583;
        double regionValue7595;
        int regionValue7596;
        double edgeValue7608;
        int edgeValue7609;
        double regionValue7624;
        double edgeValue7640;
        int edgeValue7641;
        double regionValue7654;
        double edgeValue7667;
        double regionValue7682;
        double edgeValue7697;
        double regionValue7712;
        double edgeValue7727;
        int value7728;
        double converted7729;
        java.lang.Object value7730;
        java.lang.Object value7733;
        double value7734;
        int comparison7735;
        double edgeValue7747;
        double regionValue7763;
        double edgeValue7779;
        double regionValue7795;
        double edgeValue7811;
        double edgeValue7825;
        double regionValue7840;
        double edgeValue7855;
        double regionValue7870;
        double edgeValue7885;
        double value7886;
        int comparison7887;
        int comparison7888;
        double regionValue7903;
        int regionValue7904;
        double edgeValue7920;
        double regionValue7937;
        double edgeValue7954;
        double regionValue7971;
        double edgeValue7988;
        double regionValue8005;
        int regionValue8006;
        double edgeValue8021;
        double regionValue8037;
        double edgeValue8053;
        double regionValue8069;
        double edgeValue8085;
        double regionValue8101;
        double edgeValue8116;
        double regionValue8131;
        double edgeValue8146;
        java.lang.Object value8147;
        java.lang.Object value8149;
        boolean value8150;
        double edgeValue8162;
        int edgeValue8163;
        double regionValue8178;
        double edgeValue8194;
        int edgeValue8195;
        double regionValue8210;
        double edgeValue8226;
        double edgeValue8240;
        double regionValue8255;
        double edgeValue8270;
        double edgeValue8285;
        double value8286;
        int comparison8287;
        double edgeValue8302;
        double edgeValue8318;
        int edgeValue8319;
        double edgeValue8332;
        int edgeValue8333;
        double regionValue8348;
        int regionValue8349;
        double edgeValue8364;
        int edgeValue8365;
        double edgeValue8378;
        double regionValue8393;
        double edgeValue8408;
        double value8409;
        int comparison8410;
        double edgeValue8422;
        double regionValue8438;
        double edgeValue8454;
        double regionValue8470;
        double edgeValue8486;
        double edgeValue8500;
        double regionValue8515;
        double edgeValue8530;
        double regionValue8545;
        double edgeValue8560;
        java.lang.Object value8561;
        java.lang.Object value8563;
        java.lang.Object value8564;
        float value8565;
        int comparison8566;
        int comparison8567;
        double regionValue8579;
        int regionValue8580;
        double edgeValue8593;
        double regionValue8610;
        double edgeValue8627;
        double regionValue8644;
        double edgeValue8661;
        double edgeValue8675;
        double regionValue8691;
        double edgeValue8707;
        double regionValue8723;
        double edgeValue8739;
        double edgeValue8753;
        double regionValue8768;
        double edgeValue8783;
        java.lang.StringBuilder initialized8784;
        double value8785;
        java.lang.Object value8786;
        java.lang.Object value8787;
        java.lang.Object value8788;
        double value8789;
        java.lang.Object value8790;
        java.lang.Object value8791;
        java.lang.Object value8792;
        double value8793;
        java.lang.Object value8794;
        java.lang.Object value8795;
        java.lang.Object value8796;
        java.lang.Object value8799;
        double edgeValue8812;
        int value8813;
        double converted8814;
        java.lang.Object value8815;
        java.lang.Object value8818;
        double value8819;
        int comparison8820;
        double edgeValue8832;
        double edgeValue8845;
        int edgeValue8846;
        int comparison8848;
        double regionValue8858;
        int regionValue8859;
        double edgeValue8870;
        int edgeValue8871;
        double regionValue8884;
        int regionValue8885;
        double edgeValue8898;
        int edgeValue8899;
        double regionValue8910;
        int regionValue8911;
        double edgeValue8921;
        int edgeValue8922;
        double regionValue8934;
        int regionValue8935;
        double edgeValue8947;
        int edgeValue8948;
        double regionValue8960;
        int regionValue8961;
        double edgeValue8973;
        int edgeValue8974;
        double regionValue8990;
        double edgeValue9002;
        double value9003;
        int comparison9004;
        double edgeValue9014;
        double edgeValue9025;
        int edgeValue9026;
        double regionValue9035;
        int regionValue9036;
        double edgeValue9044;
        int edgeValue9045;
        double regionValue9055;
        int regionValue9056;
        double edgeValue9066;
        int edgeValue9067;
        double regionValue9077;
        double edgeValue9087;
        double regionValue9097;
        double edgeValue9107;
        java.lang.Object value9108;
        java.lang.Object value9110;
        boolean value9111;
        int comparison9112;
        double regionValue9120;
        int regionValue9121;
        double edgeValue9130;
        int edgeValue9131;
        double regionValue9142;
        double edgeValue9154;
        int edgeValue9155;
        double regionValue9166;
        double edgeValue9178;
        double edgeValue9188;
        double regionValue9199;
        double edgeValue9210;
        double regionValue9221;
        double edgeValue9232;
        double edgeValue9245;
        double value9246;
        int comparison9247;
        double edgeValue9255;
        double edgeValue9264;
        int edgeValue9265;
        int comparison9267;
        int regionValue9273;
        int edgeValue9280;
        double regionValue9289;
        int regionValue9290;
        double edgeValue9299;
        int edgeValue9300;
        int regionValue9307;
        int edgeValue9313;
        double regionValue9321;
        int regionValue9322;
        double edgeValue9330;
        int edgeValue9331;
        double regionValue9339;
        int regionValue9340;
        double edgeValue9348;
        int edgeValue9349;
        double regionValue9359;
        double edgeValue9367;
        double value9368;
        int comparison9369;
        int edgeValue9381;
        int comparison9383;
        int regionValue9386;
        int edgeValue9390;
        int regionValue9397;
        int edgeValue9404;
        int regionValue9409;
        int edgeValue9413;
        int regionValue9419;
        int edgeValue9425;
        int regionValue9431;
        int edgeValue9437;
        java.lang.Object value9450;
        java.lang.Object value9452;
        java.lang.Object value9453;
        float value9454;
        int comparison9455;
        int edgeValue9462;
        int regionValue9466;
        int edgeValue9469;
        int regionValue9472;
        int edgeValue9475;
        int edgeValue9484;
        int regionValue9487;
        int edgeValue9490;
        int edgeValue9493;
        int value9494;
        int regionValue9495;
        int edgeValue9497;
        int regionValue9500;
        int edgeValue9503;
        int regionValue9505;
        java.lang.Object regionValue9507;
        int edgeValue9508;
        int edgeValue9511;
        java.lang.Object edgeValue9513;
        region1878: {
        region1877: {
        region1874: {
        region1870: {
        region1869: {
        region1868: {
        region1867: {
        region1866: {
        region1865: {
        region1864: {
        region1849: {
        region1848: {
        region1846: {
        region1845: {
        region1841: {
        region1840: {
        region1833: {
        region1832: {
        region1830: {
        region1829: {
        region1825: {
        region1824: {
        region1817: {
        region1816: {
        region1814: {
        region1813: {
        region1811: {
        region1796: {
        region1795: {
        region1794: {
        region1793: {
        region1786: {
        region1785: {
        region1783: {
        region1782: {
        region1778: {
        region1777: {
        region1760: {
        region1710: {
        region1709: {
        region1707: {
        region1706: {
        region1704: {
        region1686: {
        region1684: {
        region1683: {
        region1681: {
        region1674: {
        region1673: {
        region1672: {
        region1671: {
        region1664: {
        region1662: {
        region1661: {
        region1659: {
        region1647: {
        region1646: {
        region1644: {
        region1643: {
        region1641: {
        region1631: {
        region1629: {
        region1628: {
        region1626: {
        region1607: {
        region1605: {
        region1604: {
        region1591: {
        region1590: {
        region1581: {
        region1577: {
        region1576: {
        region1555: {
        region1552: {
        region1551: {
        region1549: {
        region1545: {
        region1543: {
        region1541: {
        region1539: {
        region1534: {
        region1532: {
        region1529: {
        region1527: {
        region1526: {
        region1369: {
        region1274: {
        region1273: {
        region1263: {
        region1261: {
        region1260: {
        region1257: {
        region1255: {
        region1252: {
        region1244: {
        region1242: {
        region1241: {
        region1224: {
        region1223: {
        region1219: {
        region1216: {
        region1214: {
        region1206: {
        region1203: {
        region1196: {
        region1174: {
        region1172: {
        region1171: {
        region1169: {
        region1166: {
        region1049: {
        region1048: {
        region1045: {
        region1043: {
        region1040: {
        region1035: {
        region957: {
        region943: {
        region939: {
        region937: {
        region935: {
        region930: {
        region927: {
        region925: {
        region923: {
        region917: {
        region916: {
        region912: {
        region910: {
        region906: {
        region904: {
        region903: {
        region901: {
        region878: {
        region877: {
        region876: {
        region875: {
        region853: {
        region852: {
        region850: {
        region849: {
        region816: {
        region794: {
        region779: {
        region778: {
        region777: {
        region776: {
        region775: {
        region774: {
        region495: {
        region444: {
        region441: {
        region431: {
        region430: {
        region429: {
        region428: {
        region427: {
        region426: {
        region424: {
        region423: {
        region319: {
        region270: {
        region256: {
        region250: {
        region229: {
        region225: {
        region222: {
        region220: {
        region207: {
        region205: {
        region204: {
        region189: {
        region188: {
        region185: {
        region183: {
        region181: {
        region180: {
        region179: {
        region175: {
        region173: {
        region172: {
        region170: {
        region165: {
        region164: {
        region162: {
        region161: {
        region159: {
        region138: {
        region136: {
        region135: {
        region133: {
        region118: {
        region116: {
        region115: {
        region113: {
        region101: {
        region99: {
        region98: {
        value15 = recovery$indy$flow$246();
        computed16 = value15 ^ a1;
        computed18 = computed16 ^ 70391445564705L;
        computed20 = computed16 ^ 109355575397522L;
        computed21 = computed20 >>> 48;
        converted22 = (int) (computed21);
        computed24 = computed20 << 16;
        computed25 = computed24 >>> 48;
        converted26 = (int) (computed25);
        computed28 = computed20 << 32;
        computed29 = computed28 >>> 32;
        converted30 = (int) (computed29);
        computed32 = computed16 ^ 52167465490472L;
        computed34 = computed16 ^ 30634430557956L;
        computed36 = computed16 ^ 43678005552778L;
        computed38 = computed16 ^ 49375097673636L;
        computed39 = computed38 >>> 48;
        converted40 = (int) (computed39);
        computed42 = computed38 << 16;
        computed43 = computed42 >>> 48;
        converted44 = (int) (computed43);
        computed46 = computed38 << 32;
        computed47 = computed46 >>> 32;
        converted48 = (int) (computed47);
        computed50 = computed16 ^ 28065490399586L;
        computed52 = computed16 ^ 49345329273527L;
        computed54 = computed16 ^ 19050912194580L;
        value56 = recovery$indy$flow$247();
        value58 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingOnlyOnGround));
        value60 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value58))))));
        value61 = recovery$indy$flow$250(value60);
        if (value56 != null) {
            edgeValue101 = (int) ((value61 ? 1 : 0));
            regionValue81 = edgeValue101;
            break region133;
        } else {
            edgeValue141 = (int) ((value61 ? 1 : 0));
            break region98;
        }
        }
        if (edgeValue141 == 0) {
            break region118;
        } else {
            break region99;
        }
        }
        break region101;
        }
        value256 = recovery$indy$flow$251();
        value258 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value256))))));
        value259 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value258)))).field_42P));
        value260 = recovery$indy$flow$254(value259);
        if (value56 != null) {
            edgeValue262 = (int) ((value260 ? 1 : 0));
            regionValue261 = edgeValue262;
            break region188;
        } else {
            edgeValue302 = (int) ((value260 ? 1 : 0));
            break region113;
        }
        }
        break region115;
        }
        if (edgeValue302 == 0) {
            break region185;
        } else {
            break region116;
        }
        }
        break region118;
        }
        value400 = recovery$indy$flow$255();
        value401 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value400)))).field_48Q));
        value404 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(value401))))));
        value405 = recovery$indy$flow$258(value404, computed18);
        edgeValue425 = (int) ((value405 ? 1 : 0));
        regionValue81 = edgeValue425;
        break region133;
        }
        if (value56 != null) {
            edgeValue463 = regionValue81;
            regionValue444 = edgeValue463;
            break region179;
        } else {
            edgeValue503 = regionValue81;
            regionValue483 = edgeValue503;
            break region135;
        }
        }
        if (regionValue483 == 0) {
            break region175;
        } else {
            break region136;
        }
        }
        break region138;
        }
        value616 = recovery$indy$flow$259();
        value617 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value616)))).field_48Q));
        value618 = ((java.lang.Object)(((augustus.recovered.modules.combat.KillAura_47CY) (((java.lang.Object)(value617)))).field_473));
        value621 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value618))))));
        value622 = recovery$indy$flow$263(value621, computed36);
        value623 = recovery$indy$flow$264(value622, "Grim");
        comparison624 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison624 <= 0) {
            edgeValue663 = (int) ((value623 ? 1 : 0));
            regionValue643 = edgeValue663;
            break region180;
        } else {
            edgeValue703 = (int) ((value623 ? 1 : 0));
            break region159;
        }
        }
        break region161;
        }
        if (value56 != null) {
            regionValue444 = edgeValue703;
            break region179;
        } else {
            break region162;
        }
        }
        break region164;
        }
        if (edgeValue703 == 0) {
            break region175;
        } else {
            break region165;
        }
        }
        value894 = recovery$indy$flow$265();
        value895 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value894)))).field_48Q));
        value896 = recovery$indy$flow$267(value895);
        if (value56 != null) {
            edgeValue897 = (int) ((value896 ? 1 : 0));
            regionValue261 = edgeValue897;
            break region188;
        } else {
            edgeValue935 = (int) ((value896 ? 1 : 0));
            break region170;
        }
        }
        break region172;
        }
        if (edgeValue935 != 0) {
            break region185;
        } else {
            break region173;
        }
        }
        break region175;
        }
        value1028 = recovery$indy$flow$268(a0);
        regionValue444 = value1028;
        break region179;
        }
        edgeValue1066 = regionValue444;
        regionValue643 = edgeValue1066;
        break region180;
        }
        if (value56 != null) {
            edgeValue1068 = regionValue643;
            regionValue261 = edgeValue1068;
            break region188;
        } else {
            edgeValue1106 = regionValue643;
            regionValue1087 = edgeValue1106;
            break region181;
        }
        }
        if (regionValue1087 >= 20) {
            break region189;
        } else {
            break region183;
        }
        }
        break region185;
        }
        edgeValue1143 = 0;
        regionValue261 = edgeValue1143;
        break region188;
        }
        return ((regionValue261 & 1) != 0);
        }
        value1144 = recovery$indy$flow$270(a0);
        value1145 = recovery$indy$flow$271(a0);
        value1146 = recovery$indy$flow$272(a0);
        initialized1147 = new net.C_47tf(value1144, value1145, value1146);
        comparison1149 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison1149 <= 0) {
            regionValue1169 = a3;
            break region229;
        } else {
            break region204;
        }
        }
        if (a3 > 0) {
            break region225;
        } else {
            break region205;
        }
        }
        break region207;
        }
        value1344 = recovery$indy$flow$275(a0);
        value1345 = recovery$indy$flow$276(a0);
        value1346 = recovery$indy$flow$277(a0);
        initialized1347 = new net.C_47tf(value1344, value1345, value1346);
        comparison1348 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison1348 < 0) {
            regionValue1368 = initialized1347;
            break region250;
        } else {
            break region220;
        }
        }
        break region222;
        }
        if (value56 == null) {
            regionValue1489 = initialized1347;
            break region256;
        } else {
            break region225;
        }
        }
        converted1529 = (short) (converted40);
        edgeValue1549 = (int) (converted1529);
        regionValue1169 = edgeValue1549;
        break region229;
        }
        converted1550 = (short) (converted44);
        value1554 = (int) (converted1550);
        value1555 = regionValue1169;
        value1556 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(a0))))));
        value1557 = recovery$indy$flow$280((short) (value1555), (short) (value1554), converted48, value1556, a3);
        regionValue1368 = value1557;
        break region250;
        }
        value1578 = regionValue1368;
        initialized1579 = new net.C_47tf((net.C_47tf) (value1578));
        regionValue1489 = initialized1579;
        break region256;
        }
        value1601 = recovery$indy$flow$283(initialized1147);
        value1603 = recovery$indy$flow$284(initialized1147);
        value1605 = recovery$indy$flow$285(initialized1147);
        value1607 = recovery$indy$flow$286(a0);
        value1609 = 0;
        edgeValue1652 = regionValue1489;
        regionValue1628 = edgeValue1652;
        regionValue1629 = value1601;
        regionValue1630 = value1603;
        regionValue1631 = value1605;
        regionValue1632 = value1607;
        regionValue1633 = value1609;
        break region270;
        }
        loop270: while (true) {
        region313: {
        region1980: {
        region275: {
        computed1658 = a2 - 1;
        if (regionValue1633 >= computed1658) {
            edgeValue1701 = regionValue1628;
            edgeValue1702 = regionValue1629;
            edgeValue1703 = regionValue1630;
            edgeValue1704 = regionValue1631;
            edgeValue1705 = regionValue1632;
            edgeValue1706 = regionValue1633;
            regionValue1677 = edgeValue1701;
            regionValue1678 = edgeValue1702;
            regionValue1679 = edgeValue1703;
            regionValue1680 = edgeValue1704;
            regionValue1681 = edgeValue1705;
            regionValue1682 = edgeValue1706;
            break region1980;
        } else {
            edgeValue1749 = regionValue1628;
            edgeValue1750 = regionValue1629;
            edgeValue1751 = regionValue1630;
            edgeValue1752 = regionValue1631;
            edgeValue1753 = regionValue1632;
            edgeValue1754 = regionValue1633;
            regionValue1725 = edgeValue1749;
            regionValue1726 = edgeValue1750;
            regionValue1727 = edgeValue1751;
            regionValue1728 = edgeValue1752;
            regionValue1729 = edgeValue1753;
            regionValue1730 = edgeValue1754;
            break region275;
        }
        }
        value1755 = recovery$indy$flow$287(regionValue1725);
        computed1756 = value1755 - regionValue1726;
        value1757 = recovery$indy$flow$288(1, regionValue1729);
        converted1758 = (double) (value1757);
        computed1759 = computed1756 / converted1758;
        computed1760 = regionValue1726 + computed1759;
        value1761 = computed1760;
        value1762 = recovery$indy$flow$289(regionValue1725);
        computed1763 = value1762 - regionValue1727;
        value1764 = recovery$indy$flow$290(1, regionValue1729);
        converted1765 = (double) (value1764);
        computed1766 = computed1763 / converted1765;
        computed1767 = regionValue1727 + computed1766;
        value1768 = computed1767;
        value1769 = recovery$indy$flow$291(regionValue1725);
        computed1770 = value1769 - regionValue1728;
        value1771 = recovery$indy$flow$292(1, regionValue1729);
        converted1772 = (double) (value1771);
        computed1773 = computed1770 / converted1772;
        computed1774 = regionValue1728 + computed1773;
        value1775 = computed1774;
        incremented1776 = regionValue1729 + (-1);
        incremented1777 = regionValue1730 + (1);
        edgeValue1820 = regionValue1725;
        edgeValue1821 = value1761;
        edgeValue1822 = value1768;
        edgeValue1823 = value1775;
        edgeValue1824 = incremented1776;
        edgeValue1825 = incremented1777;
        regionValue1796 = edgeValue1820;
        regionValue1797 = edgeValue1821;
        regionValue1798 = edgeValue1822;
        regionValue1799 = edgeValue1823;
        regionValue1800 = edgeValue1824;
        regionValue1801 = edgeValue1825;
        break region313;
        }
        comparison1826 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison1826 <= 0) {
            edgeValue1845 = regionValue1677;
            edgeValue1846 = regionValue1678;
            edgeValue1847 = regionValue1679;
            edgeValue1848 = regionValue1680;
            edgeValue1849 = regionValue1681;
            edgeValue1850 = regionValue1682;
            regionValue1796 = edgeValue1845;
            regionValue1797 = edgeValue1846;
            regionValue1798 = edgeValue1847;
            regionValue1799 = edgeValue1848;
            regionValue1800 = edgeValue1849;
            regionValue1801 = edgeValue1850;
            break region313;
        } else {
            edgeValue1890 = regionValue1678;
            edgeValue1891 = regionValue1679;
            edgeValue1892 = regionValue1680;
            regionValue1869 = edgeValue1890;
            regionValue1870 = edgeValue1891;
            regionValue1871 = edgeValue1892;
            break region319;
        }
        }
        loop313: while (true) {
        region315: {
        if (value56 == null) {
            edgeValue1911 = regionValue1796;
            edgeValue1912 = regionValue1797;
            edgeValue1913 = regionValue1798;
            edgeValue1914 = regionValue1799;
            edgeValue1915 = regionValue1800;
            edgeValue1916 = regionValue1801;
            regionValue1628 = edgeValue1911;
            regionValue1629 = edgeValue1912;
            regionValue1630 = edgeValue1913;
            regionValue1631 = edgeValue1914;
            regionValue1632 = edgeValue1915;
            regionValue1633 = edgeValue1916;
            continue loop270;
        } else {
            edgeValue1959 = regionValue1796;
            edgeValue1960 = regionValue1797;
            edgeValue1961 = regionValue1798;
            edgeValue1962 = regionValue1799;
            edgeValue1963 = regionValue1800;
            edgeValue1964 = regionValue1801;
            regionValue1935 = edgeValue1959;
            regionValue1936 = edgeValue1960;
            regionValue1937 = edgeValue1961;
            regionValue1938 = edgeValue1962;
            regionValue1939 = edgeValue1963;
            regionValue1940 = edgeValue1964;
            break region315;
        }
        }
        comparison1965 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison1965 <= 0) {
            edgeValue1984 = regionValue1935;
            edgeValue1985 = regionValue1936;
            edgeValue1986 = regionValue1937;
            edgeValue1987 = regionValue1938;
            edgeValue1988 = regionValue1939;
            edgeValue1989 = regionValue1940;
            regionValue1796 = edgeValue1984;
            regionValue1797 = edgeValue1985;
            regionValue1798 = edgeValue1986;
            regionValue1799 = edgeValue1987;
            regionValue1800 = edgeValue1988;
            regionValue1801 = edgeValue1989;
            continue loop313;
        } else {
            edgeValue2008 = regionValue1936;
            edgeValue2009 = regionValue1937;
            edgeValue2010 = regionValue1938;
            regionValue1869 = edgeValue2008;
            regionValue1870 = edgeValue2009;
            regionValue1871 = edgeValue2010;
            break region319;
        }
        }
        }
        }
        value2011 = recovery$indy$flow$293(a0);
        computed2012 = value2011 / 2.0F;
        value2014 = recovery$indy$flow$294(a0);
        converted2016 = (double) (computed2012);
        computed2017 = regionValue1869 - converted2016;
        converted2018 = (double) (computed2012);
        computed2019 = regionValue1871 - converted2018;
        converted2020 = (double) (computed2012);
        computed2021 = regionValue1869 + converted2020;
        value2022 = recovery$indy$flow$296(a0);
        converted2023 = (double) (value2022);
        computed2024 = regionValue1870 + converted2023;
        converted2025 = (double) (computed2012);
        computed2026 = regionValue1871 + converted2025;
        initialized2027 = new net.C_478i(computed2017, regionValue1870, computed2019, computed2021, computed2024, computed2026);
        converted2028 = (double) (value2014);
        converted2029 = (double) (value2014);
        converted2030 = (double) (value2014);
        value2031 = recovery$indy$flow$298(initialized2027, converted2028, converted2029, converted2030);
        value2033 = recovery$indy$flow$299();
        value2035 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2033))))));
        value2036 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2035)))).field_42P));
        value2037 = recovery$indy$flow$302(value2036);
        value2039 = recovery$indy$flow$303();
        value2041 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2039))))));
        value2042 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2041)))).field_42P));
        value2043 = recovery$indy$flow$306(value2042);
        value2045 = recovery$indy$flow$308(value2043);
        value2046 = recovery$indy$flow$309(value2037);
        value2047 = recovery$indy$flow$310(value2043);
        computed2048 = value2046 - value2047;
        computed2049 = computed2048 / Double.longBitsToDouble(4611686018427387904L);
        computed2050 = value2045 + computed2049;
        value2051 = recovery$indy$flow$311(value2043);
        value2052 = recovery$indy$flow$312(value2037);
        value2053 = recovery$indy$flow$313(value2043);
        computed2054 = value2052 - value2053;
        computed2055 = computed2054 / Double.longBitsToDouble(4611686018427387904L);
        computed2056 = value2051 + computed2055;
        value2057 = recovery$indy$flow$314(value2043);
        value2058 = recovery$indy$flow$315(value2037);
        value2059 = recovery$indy$flow$316(value2043);
        computed2060 = value2058 - value2059;
        computed2061 = computed2060 / Double.longBitsToDouble(4611686018427387904L);
        computed2062 = value2057 + computed2061;
        initialized2063 = new net.C_47tf(computed2050, computed2056, computed2062);
        value2065 = recovery$indy$flow$318(this);
        comparison2066 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison2066 < 0) {
            regionValue2088 = value2065;
            break region429;
        } else {
            break region423;
        }
        }
        if (value56 != null) {
            regionValue2180 = value2065;
            break region428;
        } else {
            break region424;
        }
        }
        break region426;
        }
        if (value2065 > 0) {
            break region431;
        } else {
            break region427;
        }
        }
        regionValue2180 = a3;
        break region428;
        }
        edgeValue2416 = regionValue2180;
        regionValue2088 = edgeValue2416;
        break region429;
        }
        if (value56 != null) {
            edgeValue2457 = regionValue2088;
            regionValue2436 = initialized2063;
            regionValue2437 = edgeValue2457;
            break region444;
        } else {
            edgeValue2501 = regionValue2088;
            regionValue2479 = edgeValue2501;
            break region430;
        }
        }
        if (regionValue2479 <= 0) {
            regionValue2521 = initialized2063;
            break region441;
        } else {
            break region431;
        }
        }
        value2562 = recovery$indy$flow$320(value2037);
        value2563 = recovery$indy$flow$321(value2037);
        value2564 = recovery$indy$flow$322(value2037);
        initialized2565 = new net.C_47tf(value2562, value2563, value2564);
        regionValue2521 = initialized2565;
        break region441;
        }
        computed2587 = a2 - 1;
        edgeValue2606 = regionValue2521;
        regionValue2436 = edgeValue2606;
        regionValue2437 = computed2587;
        break region444;
        }
        value2608 = recovery$indy$flow$324();
        value2610 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2608))))));
        value2611 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2610)))).field_42P));
        value2615 = regionValue2437;
        value2616 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value2611))))));
        value2617 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(a0))))));
        value2618 = recovery$indy$flow$329(value2615, value2616, value2617, computed54);
        arrayValue2620 = ((double[]) value2618)[0];
        arrayValue2621 = ((double[]) value2618)[1];
        arrayValue2622 = ((double[]) value2618)[2];
        initialized2623 = new net.C_47tf(arrayValue2620, arrayValue2621, arrayValue2622);
        value2625 = recovery$indy$flow$332(regionValue2436);
        value2627 = recovery$indy$flow$333(regionValue2436);
        value2629 = recovery$indy$flow$334(regionValue2436);
        value2631 = 3;
        edgeValue2673 = regionValue2436;
        regionValue2649 = edgeValue2673;
        regionValue2652 = value2625;
        regionValue2653 = value2627;
        regionValue2654 = value2629;
        regionValue2655 = value2631;
        break region495;
        }
        loop495: while (true) {
        region527: {
        value2680 = recovery$indy$flow$335(initialized2623);
        computed2681 = value2680 - regionValue2652;
        converted2682 = (double) (regionValue2655);
        computed2683 = computed2681 / converted2682;
        computed2684 = regionValue2652 + computed2683;
        value2685 = computed2684;
        value2686 = recovery$indy$flow$336(initialized2623);
        computed2687 = value2686 - regionValue2653;
        converted2688 = (double) (regionValue2655);
        computed2689 = computed2687 / converted2688;
        computed2690 = regionValue2653 + computed2689;
        value2691 = computed2690;
        value2692 = recovery$indy$flow$337(initialized2623);
        computed2693 = value2692 - regionValue2654;
        converted2694 = (double) (regionValue2655);
        computed2695 = computed2693 / converted2694;
        computed2696 = regionValue2654 + computed2695;
        value2697 = computed2696;
        incremented2698 = regionValue2655 + (-1);
        edgeValue2741 = regionValue2649;
        edgeValue2744 = value2685;
        edgeValue2745 = value2691;
        edgeValue2746 = value2697;
        edgeValue2747 = incremented2698;
        edgeValue2748 = incremented2698;
        regionValue2716 = edgeValue2741;
        regionValue2719 = edgeValue2744;
        regionValue2720 = edgeValue2745;
        regionValue2721 = edgeValue2746;
        regionValue2722 = edgeValue2747;
        regionValue2723 = edgeValue2748;
        break region527;
        }
        loop527: while (true) {
        region768: {
        region722: {
        region528: {
        edgeValue2792 = regionValue2716;
        edgeValue2795 = regionValue2719;
        edgeValue2796 = regionValue2720;
        edgeValue2797 = regionValue2721;
        edgeValue2798 = regionValue2722;
        edgeValue2799 = regionValue2723;
        edgeValue2800 = 2;
        regionValue2766 = edgeValue2792;
        regionValue2769 = edgeValue2795;
        regionValue2770 = edgeValue2796;
        regionValue2771 = edgeValue2797;
        regionValue2772 = edgeValue2798;
        regionValue2773 = edgeValue2799;
        regionValue2774 = edgeValue2800;
        break region528;
        }
        loop528: while (true) {
        region529: {
        if (regionValue2773 >= regionValue2774) {
            edgeValue2818 = regionValue2766;
            edgeValue2821 = regionValue2769;
            edgeValue2822 = regionValue2770;
            edgeValue2823 = regionValue2771;
            edgeValue2824 = regionValue2772;
            regionValue2649 = edgeValue2818;
            regionValue2652 = edgeValue2821;
            regionValue2653 = edgeValue2822;
            regionValue2654 = edgeValue2823;
            regionValue2655 = edgeValue2824;
            continue loop495;
        } else {
            edgeValue2866 = regionValue2766;
            edgeValue2869 = regionValue2769;
            edgeValue2870 = regionValue2770;
            edgeValue2871 = regionValue2771;
            edgeValue2872 = regionValue2772;
            regionValue2842 = edgeValue2866;
            regionValue2845 = edgeValue2869;
            regionValue2846 = edgeValue2870;
            regionValue2847 = edgeValue2871;
            regionValue2848 = edgeValue2872;
            break region529;
        }
        }
        initialized2873 = new net.C_47tf(regionValue2845, regionValue2846, regionValue2847);
        value2874 = initialized2873;
        value2875 = recovery$indy$flow$341(regionValue2842);
        value2876 = recovery$indy$flow$342(initialized2623);
        value2877 = recovery$indy$flow$343(regionValue2842);
        computed2878 = value2876 - value2877;
        computed2879 = computed2878 / Double.longBitsToDouble(4613937818241073152L);
        computed2880 = value2875 + computed2879;
        value2881 = recovery$indy$flow$344(regionValue2842);
        value2882 = recovery$indy$flow$345(initialized2623);
        value2883 = recovery$indy$flow$346(regionValue2842);
        computed2884 = value2882 - value2883;
        computed2885 = computed2884 / Double.longBitsToDouble(4613937818241073152L);
        computed2886 = value2881 + computed2885;
        value2887 = recovery$indy$flow$347(regionValue2842);
        value2888 = recovery$indy$flow$348(initialized2623);
        value2889 = recovery$indy$flow$349(regionValue2842);
        computed2890 = value2888 - value2889;
        computed2891 = computed2890 / Double.longBitsToDouble(4613937818241073152L);
        computed2892 = value2887 + computed2891;
        initialized2893 = new net.C_47tf(computed2880, computed2886, computed2892);
        value2894 = initialized2893;
        value2895 = recovery$indy$flow$351();
        value2896 = value2895;
        value2897 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2896))))));
        value2898 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2897)))).field_42P));
        value2899 = recovery$indy$flow$354(value2898);
        computed2900 = value2899 / 2.0F;
        value2901 = computed2900;
        value2902 = recovery$indy$flow$355();
        value2903 = value2902;
        value2904 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2903))))));
        value2905 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2904)))).field_42P));
        value2906 = recovery$indy$flow$358(value2905);
        value2907 = value2906;
        value2908 = recovery$indy$flow$360(value2874);
        converted2909 = (double) (value2901);
        computed2910 = value2908 - converted2909;
        value2911 = recovery$indy$flow$361(value2874);
        value2912 = recovery$indy$flow$362(value2874);
        converted2913 = (double) (value2901);
        computed2914 = value2912 - converted2913;
        value2915 = recovery$indy$flow$363(value2874);
        converted2916 = (double) (value2901);
        computed2917 = value2915 + converted2916;
        value2918 = recovery$indy$flow$364(value2874);
        value2919 = recovery$indy$flow$365();
        value2920 = value2919;
        value2921 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2920))))));
        value2922 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2921)))).field_42P));
        value2923 = recovery$indy$flow$368(value2922);
        converted2924 = (double) (value2923);
        computed2925 = value2918 + converted2924;
        value2926 = recovery$indy$flow$369(value2874);
        converted2927 = (double) (value2901);
        computed2928 = value2926 + converted2927;
        initialized2929 = new net.C_478i(computed2910, value2911, computed2914, computed2917, computed2925, computed2928);
        converted2930 = (double) (value2907);
        converted2931 = (double) (value2907);
        converted2932 = (double) (value2907);
        value2933 = recovery$indy$flow$371(initialized2929, converted2930, converted2931, converted2932);
        value2934 = value2933;
        value2935 = recovery$indy$flow$373(value2894);
        converted2936 = (double) (value2901);
        computed2937 = value2935 - converted2936;
        value2938 = recovery$indy$flow$374(value2894);
        value2939 = recovery$indy$flow$375(value2894);
        converted2940 = (double) (value2901);
        computed2941 = value2939 - converted2940;
        value2942 = recovery$indy$flow$376(value2894);
        converted2943 = (double) (value2901);
        computed2944 = value2942 + converted2943;
        value2945 = recovery$indy$flow$377(value2894);
        value2946 = recovery$indy$flow$378();
        value2947 = value2946;
        value2948 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2947))))));
        value2949 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2948)))).field_42P));
        value2950 = recovery$indy$flow$381(value2949);
        converted2951 = (double) (value2950);
        computed2952 = value2945 + converted2951;
        value2953 = recovery$indy$flow$382(value2894);
        converted2954 = (double) (value2901);
        computed2955 = value2953 + converted2954;
        initialized2956 = new net.C_478i(computed2937, value2938, computed2941, computed2944, computed2952, computed2955);
        converted2957 = (double) (value2907);
        converted2958 = (double) (value2907);
        converted2959 = (double) (value2907);
        value2960 = recovery$indy$flow$384(initialized2956, converted2957, converted2958, converted2959);
        value2961 = value2960;
        converted2962 = (short) (converted40);
        converted2963 = (short) (converted44);
        computed2964 = a3 + 1;
        value2965 = computed2964;
        value2968 = (int) (converted2963);
        value2969 = (int) (converted2962);
        value2970 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(a0))))));
        value2971 = recovery$indy$flow$386((short) (value2969), (short) (value2968), converted48, value2970, value2965);
        value2972 = value2971;
        converted2973 = (short) (converted40);
        converted2974 = (short) (converted44);
        comparison2975 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison2975 < 0) {
            edgeValue2993 = regionValue2842;
            edgeValue2996 = regionValue2845;
            edgeValue2997 = regionValue2846;
            edgeValue2998 = regionValue2847;
            edgeValue2999 = regionValue2848;
            edgeValue3000 = (int) (converted2973);
            edgeValue3001 = (int) (converted2974);
            regionValue2766 = edgeValue2993;
            regionValue2769 = edgeValue2996;
            regionValue2770 = edgeValue2997;
            regionValue2771 = edgeValue2998;
            regionValue2772 = edgeValue2999;
            regionValue2773 = edgeValue3000;
            regionValue2774 = edgeValue3001;
            continue loop528;
        } else {
            edgeValue3048 = regionValue2842;
            edgeValue3051 = regionValue2845;
            edgeValue3052 = regionValue2846;
            edgeValue3053 = regionValue2847;
            edgeValue3054 = regionValue2848;
            edgeValue3055 = value2934;
            edgeValue3056 = value2961;
            edgeValue3057 = value2972;
            edgeValue3058 = (int) (converted2973);
            edgeValue3059 = (int) (converted2974);
            regionValue3019 = edgeValue3048;
            regionValue3022 = edgeValue3051;
            regionValue3023 = edgeValue3052;
            regionValue3024 = edgeValue3053;
            regionValue3025 = edgeValue3054;
            regionValue3026 = edgeValue3055;
            regionValue3027 = edgeValue3056;
            regionValue3028 = edgeValue3057;
            regionValue3029 = edgeValue3058;
            regionValue3030 = edgeValue3059;
            break region722;
        }
        }
        }
        value3063 = regionValue3030;
        value3064 = regionValue3029;
        value3065 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(a0))))));
        value3066 = recovery$indy$flow$388((short) (value3064), (short) (value3063), converted48, value3065, a3);
        value3067 = value3066;
        computed3068 = a3 + 1;
        value3069 = computed3068;
        value3072 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(a0))))));
        value3073 = recovery$indy$flow$390(value3072, computed50, value3069);
        value3074 = value3073;
        arrayValue3075 = ((double[]) value3074)[9];
        comparison3076 = (java.lang.Double.isNaN(arrayValue3075) || java.lang.Double.isNaN(1.0D) ? -1 : (arrayValue3075 > 1.0D ? 1 : arrayValue3075 == 1.0D ? 0 : -1));
        edgeValue3124 = regionValue3019;
        edgeValue3127 = regionValue3022;
        edgeValue3128 = regionValue3023;
        edgeValue3129 = regionValue3024;
        edgeValue3130 = regionValue3025;
        edgeValue3131 = regionValue3026;
        edgeValue3132 = regionValue3027;
        edgeValue3133 = regionValue3028;
        edgeValue3134 = value3067;
        edgeValue3135 = comparison3076;
        regionValue3094 = edgeValue3124;
        regionValue3097 = edgeValue3127;
        regionValue3098 = edgeValue3128;
        regionValue3099 = edgeValue3129;
        regionValue3100 = edgeValue3130;
        regionValue3101 = edgeValue3131;
        regionValue3102 = edgeValue3132;
        regionValue3103 = edgeValue3133;
        regionValue3104 = edgeValue3134;
        regionValue3105 = edgeValue3135;
        break region768;
        }
        loop768: while (true) {
        region769: {
        if (value56 != null) {
            edgeValue3154 = regionValue3094;
            edgeValue3157 = regionValue3097;
            edgeValue3158 = regionValue3098;
            edgeValue3159 = regionValue3099;
            edgeValue3160 = regionValue3100;
            edgeValue3161 = regionValue3105;
            regionValue2716 = edgeValue3154;
            regionValue2719 = edgeValue3157;
            regionValue2720 = edgeValue3158;
            regionValue2721 = edgeValue3159;
            regionValue2722 = edgeValue3160;
            regionValue2723 = edgeValue3161;
            continue loop527;
        } else {
            edgeValue3208 = regionValue3094;
            edgeValue3211 = regionValue3097;
            edgeValue3212 = regionValue3098;
            edgeValue3213 = regionValue3099;
            edgeValue3214 = regionValue3100;
            edgeValue3215 = regionValue3101;
            edgeValue3216 = regionValue3102;
            edgeValue3217 = regionValue3103;
            edgeValue3218 = regionValue3104;
            edgeValue3219 = regionValue3105;
            regionValue3179 = edgeValue3208;
            regionValue3182 = edgeValue3211;
            regionValue3183 = edgeValue3212;
            regionValue3184 = edgeValue3213;
            regionValue3185 = edgeValue3214;
            regionValue3186 = edgeValue3215;
            regionValue3187 = edgeValue3216;
            regionValue3188 = edgeValue3217;
            regionValue3189 = edgeValue3218;
            regionValue3190 = edgeValue3219;
            break region769;
        }
        }
        comparison3220 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison3220 < 0) {
            edgeValue3238 = regionValue3179;
            edgeValue3241 = regionValue3182;
            edgeValue3242 = regionValue3183;
            edgeValue3243 = regionValue3184;
            edgeValue3244 = regionValue3185;
            edgeValue3245 = regionValue3186;
            edgeValue3246 = regionValue3187;
            edgeValue3247 = regionValue3188;
            edgeValue3248 = regionValue3189;
            edgeValue3249 = regionValue3190;
            regionValue3094 = edgeValue3238;
            regionValue3097 = edgeValue3241;
            regionValue3098 = edgeValue3242;
            regionValue3099 = edgeValue3243;
            regionValue3100 = edgeValue3244;
            regionValue3101 = edgeValue3245;
            regionValue3102 = edgeValue3246;
            regionValue3103 = edgeValue3247;
            regionValue3104 = edgeValue3248;
            regionValue3105 = edgeValue3249;
            continue loop768;
        } else {
            edgeValue3283 = regionValue3186;
            edgeValue3284 = regionValue3187;
            edgeValue3285 = regionValue3188;
            edgeValue3286 = regionValue3189;
            edgeValue3287 = regionValue3190;
            regionValue3264 = edgeValue3283;
            regionValue3265 = edgeValue3284;
            regionValue3266 = edgeValue3285;
            regionValue3267 = edgeValue3286;
            regionValue3268 = edgeValue3287;
            break region774;
        }
        }
        }
        }
        }
        if (value56 != null) {
            edgeValue3320 = regionValue3264;
            edgeValue3321 = regionValue3265;
            edgeValue3322 = regionValue3266;
            edgeValue3323 = regionValue3267;
            edgeValue3324 = regionValue3268;
            regionValue3302 = edgeValue3320;
            regionValue3303 = edgeValue3321;
            regionValue3304 = edgeValue3322;
            regionValue3305 = edgeValue3323;
            regionValue3306 = edgeValue3324;
            break region777;
        } else {
            edgeValue3356 = regionValue3264;
            edgeValue3357 = regionValue3265;
            edgeValue3358 = regionValue3266;
            edgeValue3359 = regionValue3267;
            edgeValue3360 = regionValue3268;
            regionValue3338 = edgeValue3356;
            regionValue3339 = edgeValue3357;
            regionValue3340 = edgeValue3358;
            regionValue3341 = edgeValue3359;
            regionValue3342 = edgeValue3360;
            break region775;
        }
        }
        if (regionValue3342 != 0) {
            edgeValue3391 = regionValue3338;
            edgeValue3392 = regionValue3339;
            edgeValue3393 = regionValue3340;
            edgeValue3394 = regionValue3341;
            regionValue3374 = edgeValue3391;
            regionValue3375 = edgeValue3392;
            regionValue3376 = edgeValue3393;
            regionValue3377 = edgeValue3394;
            break region778;
        } else {
            edgeValue3425 = regionValue3338;
            edgeValue3426 = regionValue3339;
            edgeValue3427 = regionValue3340;
            edgeValue3428 = regionValue3341;
            regionValue3408 = edgeValue3425;
            regionValue3409 = edgeValue3426;
            regionValue3410 = edgeValue3427;
            regionValue3411 = edgeValue3428;
            break region776;
        }
        }
        edgeValue3442 = regionValue3408;
        edgeValue3443 = regionValue3409;
        edgeValue3444 = regionValue3410;
        edgeValue3445 = regionValue3411;
        edgeValue3446 = 1;
        regionValue3302 = edgeValue3442;
        regionValue3303 = edgeValue3443;
        regionValue3304 = edgeValue3444;
        regionValue3305 = edgeValue3445;
        regionValue3306 = edgeValue3446;
        break region777;
        }
        edgeValue3478 = regionValue3302;
        edgeValue3479 = regionValue3303;
        edgeValue3480 = regionValue3304;
        edgeValue3481 = regionValue3305;
        edgeValue3482 = regionValue3306;
        regionValue3460 = edgeValue3478;
        regionValue3461 = edgeValue3479;
        regionValue3462 = edgeValue3480;
        regionValue3463 = edgeValue3481;
        regionValue3464 = edgeValue3482;
        break region779;
        }
        edgeValue3496 = regionValue3374;
        edgeValue3497 = regionValue3375;
        edgeValue3498 = regionValue3376;
        edgeValue3499 = regionValue3377;
        edgeValue3500 = 0;
        regionValue3460 = edgeValue3496;
        regionValue3461 = edgeValue3497;
        regionValue3462 = edgeValue3498;
        regionValue3463 = edgeValue3499;
        regionValue3464 = edgeValue3500;
        break region779;
        }
        value3501 = regionValue3464;
        initialized3502 = new net.C_47tf((net.C_47tf) (regionValue3462));
        initialized3504 = new net.C_47tf((net.C_47tf) (regionValue3463));
        value3506 = Float.intBitsToFloat(1063843267);
        if (value3501 == 0) {
            edgeValue3539 = regionValue3460;
            edgeValue3540 = regionValue3461;
            edgeValue3541 = value3501;
            regionValue3520 = edgeValue3539;
            regionValue3521 = edgeValue3540;
            regionValue3522 = edgeValue3541;
            regionValue3525 = value3506;
            break region816;
        } else {
            edgeValue3576 = regionValue3460;
            edgeValue3577 = regionValue3461;
            edgeValue3578 = value3501;
            regionValue3558 = edgeValue3576;
            regionValue3559 = edgeValue3577;
            regionValue3560 = edgeValue3578;
            break region794;
        }
        }
        value3581 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(a0)))).field_47));
        value3582 = recovery$indy$flow$397(initialized3502);
        value3583 = recovery$indy$flow$398(value3582);
        value3584 = recovery$indy$flow$399(initialized3502);
        value3585 = recovery$indy$flow$400(value3584);
        computed3586 = value3585 - 1;
        value3587 = recovery$indy$flow$401(initialized3502);
        value3588 = recovery$indy$flow$402(value3587);
        initialized3589 = new net.C_478Q(value3583, computed3586, value3588);
        value3590 = recovery$indy$flow$404(value3581, initialized3589);
        value3591 = recovery$indy$flow$405(value3590);
        value3592 = recovery$indy$flow$406(value3591);
        computed3593 = value3592 * Float.intBitsToFloat(1063843267);
        edgeValue3608 = regionValue3558;
        edgeValue3609 = regionValue3559;
        edgeValue3610 = regionValue3560;
        regionValue3520 = edgeValue3608;
        regionValue3521 = edgeValue3609;
        regionValue3522 = edgeValue3610;
        regionValue3525 = computed3593;
        break region816;
        }
        value3614 = recovery$indy$flow$407(initialized3502);
        value3615 = recovery$indy$flow$408(initialized3504);
        computed3616 = value3614 - value3615;
        value3618 = recovery$indy$flow$409(initialized3502);
        value3619 = recovery$indy$flow$410(initialized3504);
        computed3620 = value3618 - value3619;
        value3622 = recovery$indy$flow$411(initialized3502);
        value3623 = recovery$indy$flow$412(initialized3504);
        computed3624 = value3622 - value3623;
        value3626 = recovery$indy$flow$413();
        value3628 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3626))))));
        value3629 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3628)))).field_44Q));
        value3630 = recovery$indy$flow$416(value3629);
        comparison3631 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison3631 <= 0) {
            edgeValue3669 = regionValue3520;
            edgeValue3670 = regionValue3521;
            edgeValue3671 = regionValue3522;
            edgeValue3674 = regionValue3525;
            edgeValue3678 = (int) ((value3630 ? 1 : 0));
            regionValue3645 = edgeValue3669;
            regionValue3646 = edgeValue3670;
            regionValue3647 = edgeValue3671;
            regionValue3650 = edgeValue3674;
            regionValue3654 = edgeValue3678;
            break region876;
        } else {
            edgeValue3717 = regionValue3520;
            edgeValue3718 = regionValue3521;
            edgeValue3719 = regionValue3522;
            edgeValue3722 = regionValue3525;
            edgeValue3726 = (int) ((value3630 ? 1 : 0));
            regionValue3693 = edgeValue3717;
            regionValue3694 = edgeValue3718;
            regionValue3695 = edgeValue3719;
            regionValue3698 = edgeValue3722;
            break region849;
        }
        }
        if (value56 != null) {
            edgeValue3764 = regionValue3693;
            edgeValue3765 = regionValue3694;
            edgeValue3766 = regionValue3695;
            edgeValue3769 = regionValue3698;
            regionValue3741 = edgeValue3764;
            regionValue3742 = edgeValue3765;
            regionValue3743 = edgeValue3766;
            regionValue3746 = edgeValue3769;
            regionValue3750 = edgeValue3726;
            break region875;
        } else {
            edgeValue3810 = regionValue3693;
            edgeValue3811 = regionValue3694;
            edgeValue3812 = regionValue3695;
            edgeValue3815 = regionValue3698;
            regionValue3787 = edgeValue3810;
            regionValue3788 = edgeValue3811;
            regionValue3789 = edgeValue3812;
            regionValue3792 = edgeValue3815;
            break region850;
        }
        }
        edgeValue3856 = regionValue3787;
        edgeValue3857 = regionValue3788;
        edgeValue3858 = regionValue3789;
        edgeValue3861 = regionValue3792;
        regionValue3833 = edgeValue3856;
        regionValue3834 = edgeValue3857;
        regionValue3835 = edgeValue3858;
        regionValue3838 = edgeValue3861;
        break region852;
        }
        if (edgeValue3726 == 0) {
            edgeValue3901 = regionValue3833;
            edgeValue3902 = regionValue3834;
            edgeValue3903 = regionValue3835;
            edgeValue3906 = regionValue3838;
            regionValue3879 = edgeValue3901;
            regionValue3880 = edgeValue3902;
            regionValue3881 = edgeValue3903;
            regionValue3884 = edgeValue3906;
            regionValue3886 = computed3620;
            break region939;
        } else {
            edgeValue3945 = regionValue3833;
            edgeValue3946 = regionValue3834;
            edgeValue3947 = regionValue3835;
            edgeValue3950 = regionValue3838;
            regionValue3923 = edgeValue3945;
            regionValue3924 = edgeValue3946;
            regionValue3925 = edgeValue3947;
            regionValue3928 = edgeValue3950;
            break region853;
        }
        }
        value3954 = recovery$indy$flow$417();
        value3956 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3954))))));
        value3957 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3956)))).field_44Q));
        value3958 = recovery$indy$flow$421(initialized3502);
        converted3959 = (int) (value3958);
        value3960 = recovery$indy$flow$422(initialized3502);
        converted3961 = (int) (value3960);
        initialized3962 = new net.C_478Q(converted3959, 0, converted3961);
        value3963 = recovery$indy$flow$424(value3957, initialized3962);
        edgeValue3977 = regionValue3923;
        edgeValue3978 = regionValue3924;
        edgeValue3979 = regionValue3925;
        edgeValue3982 = regionValue3928;
        edgeValue3986 = (int) ((value3963 ? 1 : 0));
        regionValue3741 = edgeValue3977;
        regionValue3742 = edgeValue3978;
        regionValue3743 = edgeValue3979;
        regionValue3746 = edgeValue3982;
        regionValue3750 = edgeValue3986;
        break region875;
        }
        edgeValue4000 = regionValue3741;
        edgeValue4001 = regionValue3742;
        edgeValue4002 = regionValue3743;
        edgeValue4005 = regionValue3746;
        edgeValue4009 = regionValue3750;
        regionValue3645 = edgeValue4000;
        regionValue3646 = edgeValue4001;
        regionValue3647 = edgeValue4002;
        regionValue3650 = edgeValue4005;
        regionValue3654 = edgeValue4009;
        break region876;
        }
        if (value56 != null) {
            edgeValue4046 = regionValue3645;
            edgeValue4047 = regionValue3646;
            edgeValue4048 = regionValue3647;
            edgeValue4051 = regionValue3650;
            edgeValue4054 = regionValue3654;
            regionValue4024 = edgeValue4046;
            regionValue4025 = edgeValue4047;
            regionValue4026 = edgeValue4048;
            regionValue4029 = edgeValue4051;
            regionValue4032 = edgeValue4054;
            break region916;
        } else {
            edgeValue4091 = regionValue3645;
            edgeValue4092 = regionValue3646;
            edgeValue4093 = regionValue3647;
            edgeValue4096 = regionValue3650;
            edgeValue4100 = regionValue3654;
            regionValue4068 = edgeValue4091;
            regionValue4069 = edgeValue4092;
            regionValue4070 = edgeValue4093;
            regionValue4073 = edgeValue4096;
            regionValue4077 = edgeValue4100;
            break region877;
        }
        }
        if (regionValue4077 == 0) {
            edgeValue4135 = regionValue4068;
            edgeValue4136 = regionValue4069;
            edgeValue4137 = regionValue4070;
            edgeValue4140 = regionValue4073;
            regionValue4114 = edgeValue4135;
            regionValue4115 = edgeValue4136;
            regionValue4116 = edgeValue4137;
            regionValue4119 = edgeValue4140;
            break region906;
        } else {
            edgeValue4178 = regionValue4068;
            edgeValue4179 = regionValue4069;
            edgeValue4180 = regionValue4070;
            edgeValue4183 = regionValue4073;
            regionValue4156 = edgeValue4178;
            regionValue4157 = edgeValue4179;
            regionValue4158 = edgeValue4180;
            regionValue4161 = edgeValue4183;
            break region878;
        }
        }
        value4187 = recovery$indy$flow$425();
        value4189 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4187))))));
        value4190 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4189)))).field_44Q));
        value4191 = recovery$indy$flow$429(initialized3502);
        converted4192 = (int) (value4191);
        value4193 = recovery$indy$flow$430(initialized3502);
        converted4194 = (int) (value4193);
        initialized4195 = new net.C_478Q(converted4192, 0, converted4194);
        value4196 = recovery$indy$flow$432(value4190, initialized4195);
        value4197 = recovery$indy$flow$433(value4196);
        if (value56 != null) {
            edgeValue4211 = regionValue4156;
            edgeValue4212 = regionValue4157;
            edgeValue4213 = regionValue4158;
            edgeValue4216 = regionValue4161;
            edgeValue4219 = (int) ((value4197 ? 1 : 0));
            regionValue4024 = edgeValue4211;
            regionValue4025 = edgeValue4212;
            regionValue4026 = edgeValue4213;
            regionValue4029 = edgeValue4216;
            regionValue4032 = edgeValue4219;
            break region916;
        } else {
            edgeValue4256 = regionValue4156;
            edgeValue4257 = regionValue4157;
            edgeValue4258 = regionValue4158;
            edgeValue4261 = regionValue4161;
            edgeValue4265 = (int) ((value4197 ? 1 : 0));
            regionValue4233 = edgeValue4256;
            regionValue4234 = edgeValue4257;
            regionValue4235 = edgeValue4258;
            regionValue4238 = edgeValue4261;
            break region901;
        }
        }
        edgeValue4302 = regionValue4233;
        edgeValue4303 = regionValue4234;
        edgeValue4304 = regionValue4235;
        edgeValue4307 = regionValue4238;
        regionValue4279 = edgeValue4302;
        regionValue4280 = edgeValue4303;
        regionValue4281 = edgeValue4304;
        regionValue4284 = edgeValue4307;
        break region903;
        }
        if (edgeValue4265 != 0) {
            edgeValue4325 = regionValue4279;
            edgeValue4326 = regionValue4280;
            edgeValue4327 = regionValue4281;
            edgeValue4330 = regionValue4284;
            regionValue3879 = edgeValue4325;
            regionValue3880 = edgeValue4326;
            regionValue3881 = edgeValue4327;
            regionValue3884 = edgeValue4330;
            regionValue3886 = computed3620;
            break region939;
        } else {
            edgeValue4368 = regionValue4279;
            edgeValue4369 = regionValue4280;
            edgeValue4370 = regionValue4281;
            edgeValue4373 = regionValue4284;
            regionValue4347 = edgeValue4368;
            regionValue4348 = edgeValue4369;
            regionValue4349 = edgeValue4370;
            regionValue4352 = edgeValue4373;
            break region904;
        }
        }
        edgeValue4389 = regionValue4347;
        edgeValue4390 = regionValue4348;
        edgeValue4391 = regionValue4349;
        edgeValue4394 = regionValue4352;
        regionValue4114 = edgeValue4389;
        regionValue4115 = edgeValue4390;
        regionValue4116 = edgeValue4391;
        regionValue4119 = edgeValue4394;
        break region906;
        }
        value4397 = recovery$indy$flow$434(initialized3502);
        if (value56 != null) {
            edgeValue4433 = regionValue4114;
            edgeValue4434 = regionValue4115;
            edgeValue4435 = regionValue4116;
            edgeValue4438 = regionValue4119;
            regionValue4411 = edgeValue4433;
            regionValue4412 = edgeValue4434;
            regionValue4413 = edgeValue4435;
            regionValue4416 = edgeValue4438;
            regionValue4419 = value4397;
            break region930;
        } else {
            edgeValue4477 = regionValue4114;
            edgeValue4478 = regionValue4115;
            edgeValue4479 = regionValue4116;
            edgeValue4482 = regionValue4119;
            regionValue4455 = edgeValue4477;
            regionValue4456 = edgeValue4478;
            regionValue4457 = edgeValue4479;
            regionValue4460 = edgeValue4482;
            break region910;
        }
        }
        edgeValue4521 = regionValue4455;
        edgeValue4522 = regionValue4456;
        edgeValue4523 = regionValue4457;
        edgeValue4526 = regionValue4460;
        regionValue4499 = edgeValue4521;
        regionValue4500 = edgeValue4522;
        regionValue4501 = edgeValue4523;
        regionValue4504 = edgeValue4526;
        break region912;
        }
        comparison4530 = (java.lang.Double.isNaN(value4397) || java.lang.Double.isNaN(0.0D) ? -1 : (value4397 > 0.0D ? 1 : value4397 == 0.0D ? 0 : -1));
        edgeValue4544 = regionValue4499;
        edgeValue4545 = regionValue4500;
        edgeValue4546 = regionValue4501;
        edgeValue4549 = regionValue4504;
        regionValue4024 = edgeValue4544;
        regionValue4025 = edgeValue4545;
        regionValue4026 = edgeValue4546;
        regionValue4029 = edgeValue4549;
        regionValue4032 = comparison4530;
        break region916;
        }
        if (regionValue4032 <= 0) {
            edgeValue4587 = regionValue4024;
            edgeValue4588 = regionValue4025;
            edgeValue4589 = regionValue4026;
            edgeValue4592 = regionValue4029;
            regionValue4566 = edgeValue4587;
            regionValue4567 = edgeValue4588;
            regionValue4568 = edgeValue4589;
            regionValue4571 = edgeValue4592;
            break region927;
        } else {
            edgeValue4629 = regionValue4024;
            edgeValue4630 = regionValue4025;
            edgeValue4631 = regionValue4026;
            edgeValue4634 = regionValue4029;
            regionValue4608 = edgeValue4629;
            regionValue4609 = edgeValue4630;
            regionValue4610 = edgeValue4631;
            regionValue4613 = edgeValue4634;
            break region917;
        }
        }
        value4637 = Double.longBitsToDouble(-4631501856787818086L);
        comparison4638 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison4638 < 0) {
            edgeValue4674 = regionValue4608;
            edgeValue4675 = regionValue4609;
            edgeValue4676 = regionValue4610;
            edgeValue4679 = regionValue4613;
            regionValue4652 = edgeValue4674;
            regionValue4653 = edgeValue4675;
            regionValue4654 = edgeValue4676;
            regionValue4657 = edgeValue4679;
            regionValue4658 = computed3616;
            regionValue4659 = computed3624;
            regionValue4660 = value4637;
            break region957;
        } else {
            edgeValue4718 = regionValue4608;
            edgeValue4719 = regionValue4609;
            edgeValue4720 = regionValue4610;
            edgeValue4723 = regionValue4613;
            regionValue4696 = edgeValue4718;
            regionValue4697 = edgeValue4719;
            regionValue4698 = edgeValue4720;
            regionValue4701 = edgeValue4723;
            break region923;
        }
        }
        if (value56 == null) {
            edgeValue4762 = regionValue4696;
            edgeValue4763 = regionValue4697;
            edgeValue4764 = regionValue4698;
            edgeValue4767 = regionValue4701;
            regionValue4740 = edgeValue4762;
            regionValue4741 = edgeValue4763;
            regionValue4742 = edgeValue4764;
            regionValue4745 = edgeValue4767;
            regionValue4748 = value4637;
            break region943;
        } else {
            edgeValue4805 = regionValue4696;
            edgeValue4806 = regionValue4697;
            edgeValue4807 = regionValue4698;
            edgeValue4810 = regionValue4701;
            regionValue4784 = edgeValue4805;
            regionValue4785 = edgeValue4806;
            regionValue4786 = edgeValue4807;
            regionValue4789 = edgeValue4810;
            break region925;
        }
        }
        edgeValue4826 = regionValue4784;
        edgeValue4827 = regionValue4785;
        edgeValue4828 = regionValue4786;
        edgeValue4831 = regionValue4789;
        regionValue4566 = edgeValue4826;
        regionValue4567 = edgeValue4827;
        regionValue4568 = edgeValue4828;
        regionValue4571 = edgeValue4831;
        break region927;
        }
        edgeValue4847 = regionValue4566;
        edgeValue4848 = regionValue4567;
        edgeValue4849 = regionValue4568;
        edgeValue4852 = regionValue4571;
        edgeValue4855 = 0.0D;
        regionValue4411 = edgeValue4847;
        regionValue4412 = edgeValue4848;
        regionValue4413 = edgeValue4849;
        regionValue4416 = edgeValue4852;
        regionValue4419 = edgeValue4855;
        break region930;
        }
        value4856 = regionValue4419;
        comparison4857 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison4857 <= 0) {
            edgeValue4871 = regionValue4411;
            edgeValue4872 = regionValue4412;
            edgeValue4873 = regionValue4413;
            edgeValue4876 = regionValue4416;
            edgeValue4879 = value4856;
            regionValue4652 = edgeValue4871;
            regionValue4653 = edgeValue4872;
            regionValue4654 = edgeValue4873;
            regionValue4657 = edgeValue4876;
            regionValue4658 = computed3616;
            regionValue4659 = computed3624;
            regionValue4660 = edgeValue4879;
            break region957;
        } else {
            edgeValue4915 = regionValue4411;
            edgeValue4916 = regionValue4412;
            edgeValue4917 = regionValue4413;
            edgeValue4920 = regionValue4416;
            edgeValue4923 = value4856;
            regionValue4893 = edgeValue4915;
            regionValue4894 = edgeValue4916;
            regionValue4895 = edgeValue4917;
            regionValue4898 = edgeValue4920;
            regionValue4901 = edgeValue4923;
            break region935;
        }
        }
        if (value56 == null) {
            edgeValue4937 = regionValue4893;
            edgeValue4938 = regionValue4894;
            edgeValue4939 = regionValue4895;
            edgeValue4942 = regionValue4898;
            edgeValue4945 = regionValue4901;
            regionValue4740 = edgeValue4937;
            regionValue4741 = edgeValue4938;
            regionValue4742 = edgeValue4939;
            regionValue4745 = edgeValue4942;
            regionValue4748 = edgeValue4945;
            break region943;
        } else {
            edgeValue4981 = regionValue4893;
            edgeValue4982 = regionValue4894;
            edgeValue4983 = regionValue4895;
            edgeValue4986 = regionValue4898;
            edgeValue4989 = regionValue4901;
            regionValue4959 = edgeValue4981;
            regionValue4960 = edgeValue4982;
            regionValue4961 = edgeValue4983;
            regionValue4964 = edgeValue4986;
            regionValue4967 = edgeValue4989;
            break region937;
        }
        }
        edgeValue5003 = regionValue4959;
        edgeValue5004 = regionValue4960;
        edgeValue5005 = regionValue4961;
        edgeValue5008 = regionValue4964;
        edgeValue5010 = regionValue4967;
        regionValue3879 = edgeValue5003;
        regionValue3880 = edgeValue5004;
        regionValue3881 = edgeValue5005;
        regionValue3884 = edgeValue5008;
        regionValue3886 = edgeValue5010;
        break region939;
        }
        computed5012 = regionValue3886 - Double.longBitsToDouble(4590429028186199163L);
        edgeValue5027 = regionValue3879;
        edgeValue5028 = regionValue3880;
        edgeValue5029 = regionValue3881;
        edgeValue5032 = regionValue3884;
        regionValue4740 = edgeValue5027;
        regionValue4741 = edgeValue5028;
        regionValue4742 = edgeValue5029;
        regionValue4745 = edgeValue5032;
        regionValue4748 = computed5012;
        break region943;
        }
        computed5036 = regionValue4748 * Double.longBitsToDouble(4607002274986721280L);
        converted5038 = (double) (regionValue4745);
        computed5039 = computed3616 * converted5038;
        converted5041 = (double) (regionValue4745);
        computed5042 = computed3624 * converted5041;
        edgeValue5057 = regionValue4740;
        edgeValue5058 = regionValue4741;
        edgeValue5059 = regionValue4742;
        edgeValue5062 = regionValue4745;
        regionValue4652 = edgeValue5057;
        regionValue4653 = edgeValue5058;
        regionValue4654 = edgeValue5059;
        regionValue4657 = edgeValue5062;
        regionValue4658 = computed5039;
        regionValue4659 = computed5042;
        regionValue4660 = computed5036;
        break region957;
        }
        value5066 = recovery$indy$flow$435();
        value5068 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5066))))));
        value5069 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5068)))).field_42P));
        value5070 = recovery$indy$flow$438(value5069);
        value5071 = recovery$indy$flow$439(initialized3504);
        computed5072 = value5070 - value5071;
        value5074 = recovery$indy$flow$440();
        value5076 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5074))))));
        value5077 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5076)))).field_42P));
        value5078 = recovery$indy$flow$443(value5077);
        value5079 = recovery$indy$flow$444(initialized3504);
        computed5080 = value5078 - value5079;
        computed5082 = computed5072 * computed5072;
        computed5083 = computed5080 * computed5080;
        computed5084 = computed5082 + computed5083;
        value5085 = recovery$indy$flow$445(computed5084);
        value5087 = Float.intBitsToFloat(1053609165);
        computed5088 = regionValue4658 / Double.longBitsToDouble(4611686018427387904L);
        computed5090 = regionValue4660 / Double.longBitsToDouble(4611686018427387904L);
        computed5092 = regionValue4659 / Double.longBitsToDouble(4611686018427387904L);
        converted5094 = (double) (value5085);
        computed5095 = computed5072 / converted5094;
        converted5096 = (double) (value5087);
        computed5097 = computed5095 * converted5096;
        computed5098 = computed5088 - computed5097;
        converted5100 = (double) (value5087);
        computed5101 = computed5090 + converted5100;
        converted5103 = (double) (value5085);
        computed5104 = computed5080 / converted5103;
        converted5105 = (double) (value5087);
        computed5106 = computed5104 * converted5105;
        comparison5107 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison5107 < 0) {
            edgeValue5144 = regionValue4652;
            edgeValue5145 = regionValue4653;
            edgeValue5146 = regionValue4654;
            edgeValue5148 = regionValue4657;
            regionValue5121 = edgeValue5144;
            regionValue5122 = edgeValue5145;
            regionValue5123 = edgeValue5146;
            regionValue5125 = edgeValue5148;
            regionValue5127 = computed5092;
            regionValue5129 = computed5092;
            regionValue5130 = computed5106;
            break region1043;
        } else {
            edgeValue5189 = regionValue4652;
            edgeValue5190 = regionValue4653;
            edgeValue5191 = regionValue4654;
            edgeValue5193 = regionValue4657;
            regionValue5167 = edgeValue5189;
            regionValue5168 = edgeValue5190;
            regionValue5169 = edgeValue5191;
            regionValue5171 = edgeValue5193;
            break region1035;
        }
        }
        computed5198 = computed5092 - computed5106;
        if (value56 != null) {
            edgeValue5234 = regionValue5167;
            edgeValue5235 = regionValue5168;
            edgeValue5236 = regionValue5169;
            edgeValue5238 = regionValue5171;
            regionValue5213 = edgeValue5234;
            regionValue5214 = edgeValue5235;
            regionValue5215 = edgeValue5236;
            regionValue5217 = edgeValue5238;
            regionValue5219 = computed5198;
            regionValue5220 = computed5101;
            break region1048;
        } else {
            edgeValue5277 = regionValue5167;
            edgeValue5278 = regionValue5168;
            edgeValue5279 = regionValue5169;
            edgeValue5281 = regionValue5171;
            regionValue5255 = edgeValue5277;
            regionValue5256 = edgeValue5278;
            regionValue5257 = edgeValue5279;
            regionValue5259 = edgeValue5281;
            break region1040;
        }
        }
        edgeValue5299 = regionValue5255;
        edgeValue5300 = regionValue5256;
        edgeValue5301 = regionValue5257;
        edgeValue5303 = regionValue5259;
        edgeValue5308 = Double.longBitsToDouble(4600877379429072896L);
        regionValue5121 = edgeValue5299;
        regionValue5122 = edgeValue5300;
        regionValue5123 = edgeValue5301;
        regionValue5125 = edgeValue5303;
        regionValue5127 = computed5198;
        regionValue5129 = computed5101;
        regionValue5130 = edgeValue5308;
        break region1043;
        }
        comparison5309 = (java.lang.Double.isNaN(regionValue5129) || java.lang.Double.isNaN(regionValue5130) ? -1 : (regionValue5129 > regionValue5130 ? 1 : regionValue5129 == regionValue5130 ? 0 : -1));
        if (comparison5309 <= 0) {
            edgeValue5344 = regionValue5121;
            edgeValue5345 = regionValue5122;
            edgeValue5346 = regionValue5123;
            edgeValue5348 = regionValue5125;
            edgeValue5350 = regionValue5127;
            regionValue5323 = edgeValue5344;
            regionValue5324 = edgeValue5345;
            regionValue5325 = edgeValue5346;
            regionValue5327 = edgeValue5348;
            regionValue5329 = edgeValue5350;
            regionValue5330 = computed5101;
            break region1049;
        } else {
            edgeValue5385 = regionValue5121;
            edgeValue5386 = regionValue5122;
            edgeValue5387 = regionValue5123;
            edgeValue5389 = regionValue5125;
            edgeValue5391 = regionValue5127;
            regionValue5365 = edgeValue5385;
            regionValue5366 = edgeValue5386;
            regionValue5367 = edgeValue5387;
            regionValue5369 = edgeValue5389;
            regionValue5371 = edgeValue5391;
            break region1045;
        }
        }
        edgeValue5405 = regionValue5365;
        edgeValue5406 = regionValue5366;
        edgeValue5407 = regionValue5367;
        edgeValue5409 = regionValue5369;
        edgeValue5411 = regionValue5371;
        edgeValue5412 = Double.longBitsToDouble(4600877379429072896L);
        regionValue5213 = edgeValue5405;
        regionValue5214 = edgeValue5406;
        regionValue5215 = edgeValue5407;
        regionValue5217 = edgeValue5409;
        regionValue5219 = edgeValue5411;
        regionValue5220 = edgeValue5412;
        break region1048;
        }
        value5413 = regionValue5220;
        edgeValue5427 = regionValue5213;
        edgeValue5428 = regionValue5214;
        edgeValue5429 = regionValue5215;
        edgeValue5431 = regionValue5217;
        edgeValue5433 = regionValue5219;
        edgeValue5434 = value5413;
        regionValue5323 = edgeValue5427;
        regionValue5324 = edgeValue5428;
        regionValue5325 = edgeValue5429;
        regionValue5327 = edgeValue5431;
        regionValue5329 = edgeValue5433;
        regionValue5330 = edgeValue5434;
        break region1049;
        }
        initialized5435 = new net.C_47tf(computed5098, regionValue5330, regionValue5329);
        arrayValue5437 = ((double[]) value2618)[3];
        arrayValue5438 = ((double[]) value2618)[4];
        value5439 = recovery$indy$flow$449();
        value5441 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5439))))));
        value5442 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5441)))).field_42P));
        value5443 = recovery$indy$flow$452(value5442);
        converted5444 = (double) (value5443);
        computed5445 = arrayValue5438 + converted5444;
        arrayValue5446 = ((double[]) value2618)[5];
        initialized5447 = new net.C_47tf(arrayValue5437, computed5445, arrayValue5446);
        value5449 = recovery$indy$flow$454(initialized5447);
        value5450 = recovery$indy$flow$455(value2031);
        value5451 = recovery$indy$flow$456(value2031);
        value5452 = recovery$indy$flow$457(value5449, value5450, value5451);
        value5454 = recovery$indy$flow$458(initialized5447);
        value5455 = recovery$indy$flow$459(value2031);
        value5456 = recovery$indy$flow$460(value2031);
        value5457 = recovery$indy$flow$461(value5454, value5455, value5456);
        arrayValue5459 = ((double[]) value2618)[3];
        computed5460 = value5452 - arrayValue5459;
        arrayValue5462 = ((double[]) value2618)[5];
        computed5463 = value5457 - arrayValue5462;
        value5465 = recovery$indy$flow$462(computed5463, computed5460);
        computed5466 = value5465 * Double.longBitsToDouble(4640537203540230144L);
        computed5467 = computed5466 / Double.longBitsToDouble(4614256656552045848L);
        computed5468 = computed5467 - Double.longBitsToDouble(4636033603912859648L);
        converted5469 = (float) (computed5468);
        value5471 = recovery$indy$flow$463();
        value5473 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5471))))));
        value5474 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5473)))).field_42P));
        value5475 = recovery$indy$flow$466(value5474);
        computed5476 = 1 + value5475;
        computed5478 = converted5469 * Float.intBitsToFloat(1078530011);
        computed5479 = computed5478 / Float.intBitsToFloat(1127481344);
        value5480 = recovery$indy$flow$467(computed5479);
        negated5481 = -(value5480);
        converted5482 = (float) (computed5476);
        computed5483 = negated5481 * converted5482;
        computed5484 = computed5483 * Float.intBitsToFloat(1056964608);
        converted5485 = (double) (computed5484);
        computed5486 = converted5469 * Float.intBitsToFloat(1078530011);
        computed5487 = computed5486 / Float.intBitsToFloat(1127481344);
        value5488 = recovery$indy$flow$468(computed5487);
        converted5489 = (float) (computed5476);
        computed5490 = value5488 * converted5489;
        computed5491 = computed5490 * Float.intBitsToFloat(1056964608);
        converted5492 = (double) (computed5491);
        value5493 = recovery$indy$flow$469(initialized5435, converted5485, Double.longBitsToDouble(4591870180066957722L), converted5492);
        comparison5495 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison5495 < 0) {
            edgeValue5528 = regionValue5323;
            edgeValue5529 = regionValue5324;
            edgeValue5530 = regionValue5325;
            edgeValue5532 = regionValue5327;
            regionValue5509 = edgeValue5528;
            regionValue5510 = edgeValue5529;
            regionValue5511 = edgeValue5530;
            regionValue5513 = edgeValue5532;
            break region1172;
        } else {
            edgeValue5565 = regionValue5323;
            edgeValue5566 = regionValue5324;
            edgeValue5567 = regionValue5325;
            regionValue5547 = edgeValue5565;
            regionValue5548 = edgeValue5566;
            regionValue5549 = edgeValue5567;
            break region1166;
        }
        }
        if (value56 != null) {
            edgeValue5602 = regionValue5547;
            edgeValue5603 = regionValue5548;
            edgeValue5604 = regionValue5549;
            edgeValue5607 = Float.intBitsToFloat(1063843267);
            regionValue5583 = edgeValue5602;
            regionValue5584 = edgeValue5603;
            regionValue5585 = edgeValue5604;
            regionValue5588 = edgeValue5607;
            break region1203;
        } else {
            edgeValue5640 = regionValue5547;
            edgeValue5641 = regionValue5548;
            edgeValue5642 = regionValue5549;
            edgeValue5645 = Float.intBitsToFloat(1063843267);
            regionValue5621 = edgeValue5640;
            regionValue5622 = edgeValue5641;
            regionValue5623 = edgeValue5642;
            break region1169;
        }
        }
        edgeValue5678 = regionValue5621;
        edgeValue5679 = regionValue5622;
        edgeValue5680 = regionValue5623;
        regionValue5659 = edgeValue5678;
        regionValue5660 = edgeValue5679;
        regionValue5661 = edgeValue5680;
        break region1171;
        }
        edgeValue5698 = regionValue5659;
        edgeValue5699 = regionValue5660;
        edgeValue5700 = regionValue5661;
        regionValue5509 = edgeValue5698;
        regionValue5510 = edgeValue5699;
        regionValue5511 = edgeValue5700;
        regionValue5513 = edgeValue5645;
        break region1172;
        }
        if (regionValue5511 == 0) {
            edgeValue5736 = regionValue5509;
            edgeValue5737 = regionValue5510;
            edgeValue5738 = regionValue5511;
            edgeValue5740 = regionValue5513;
            regionValue5717 = edgeValue5736;
            regionValue5718 = edgeValue5737;
            regionValue5719 = edgeValue5738;
            regionValue5721 = edgeValue5740;
            break region1196;
        } else {
            edgeValue5773 = regionValue5509;
            edgeValue5774 = regionValue5510;
            edgeValue5775 = regionValue5511;
            regionValue5755 = edgeValue5773;
            regionValue5756 = edgeValue5774;
            regionValue5757 = edgeValue5775;
            break region1174;
        }
        }
        value5778 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(a0)))).field_47));
        value5779 = recovery$indy$flow$472(initialized3502);
        value5780 = recovery$indy$flow$473(value5779);
        value5781 = recovery$indy$flow$474(initialized3502);
        value5782 = recovery$indy$flow$475(value5781);
        computed5783 = value5782 - 1;
        value5784 = recovery$indy$flow$476(initialized3502);
        value5785 = recovery$indy$flow$477(value5784);
        initialized5786 = new net.C_478Q(value5780, computed5783, value5785);
        value5787 = recovery$indy$flow$479(value5778, initialized5786);
        value5788 = recovery$indy$flow$480(value5787);
        value5789 = recovery$indy$flow$481(value5788);
        computed5790 = value5789 * Float.intBitsToFloat(1063843267);
        edgeValue5805 = regionValue5755;
        edgeValue5806 = regionValue5756;
        edgeValue5807 = regionValue5757;
        regionValue5717 = edgeValue5805;
        regionValue5718 = edgeValue5806;
        regionValue5719 = edgeValue5807;
        regionValue5721 = computed5790;
        break region1196;
        }
        computed5811 = regionValue5721 * regionValue5721;
        computed5812 = computed5811 * regionValue5721;
        computed5813 = Float.intBitsToFloat(1042722185) / computed5812;
        edgeValue5827 = regionValue5717;
        edgeValue5828 = regionValue5718;
        edgeValue5829 = regionValue5719;
        regionValue5583 = edgeValue5827;
        regionValue5584 = edgeValue5828;
        regionValue5585 = edgeValue5829;
        regionValue5588 = computed5813;
        break region1203;
        }
        value5833 = regionValue5588;
        if (regionValue5585 == 0) {
            edgeValue5864 = regionValue5583;
            edgeValue5865 = regionValue5584;
            regionValue5847 = edgeValue5864;
            regionValue5848 = edgeValue5865;
            break region1219;
        } else {
            edgeValue5899 = regionValue5583;
            edgeValue5900 = regionValue5584;
            edgeValue5903 = value5833;
            regionValue5881 = edgeValue5899;
            regionValue5882 = edgeValue5900;
            regionValue5885 = edgeValue5903;
            break region1206;
        }
        }
        value5904 = recovery$indy$flow$482(a0);
        computed5905 = value5904 * regionValue5885;
        comparison5906 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison5906 <= 0) {
            edgeValue5938 = regionValue5881;
            edgeValue5939 = regionValue5882;
            regionValue5920 = edgeValue5938;
            regionValue5921 = edgeValue5939;
            regionValue5924 = computed5905;
            break region1223;
        } else {
            edgeValue5974 = regionValue5881;
            edgeValue5975 = regionValue5882;
            regionValue5956 = edgeValue5974;
            regionValue5957 = edgeValue5975;
            break region1214;
        }
        }
        edgeValue6010 = regionValue5956;
        edgeValue6011 = regionValue5957;
        regionValue5992 = edgeValue6010;
        regionValue5993 = edgeValue6011;
        break region1216;
        }
        if (value56 == null) {
            edgeValue6047 = regionValue5992;
            edgeValue6048 = regionValue5993;
            regionValue6029 = edgeValue6047;
            regionValue6030 = edgeValue6048;
            regionValue6033 = computed5905;
            break region1224;
        } else {
            edgeValue6065 = regionValue5992;
            edgeValue6066 = regionValue5993;
            regionValue5847 = edgeValue6065;
            regionValue5848 = edgeValue6066;
            break region1219;
        }
        }
        value6069 = recovery$indy$flow$483(a0);
        edgeValue6083 = regionValue5847;
        edgeValue6084 = regionValue5848;
        regionValue5920 = edgeValue6083;
        regionValue5921 = edgeValue6084;
        regionValue5924 = value6069;
        break region1223;
        }
        value6088 = regionValue5924;
        edgeValue6102 = regionValue5920;
        edgeValue6103 = regionValue5921;
        edgeValue6106 = value6088;
        regionValue6029 = edgeValue6102;
        regionValue6030 = edgeValue6103;
        regionValue6033 = edgeValue6106;
        break region1224;
        }
        value6107 = 0.0F;
        value6108 = Float.intBitsToFloat(1065017672);
        computed6109 = value6107 * value6107;
        computed6110 = value6108 * value6108;
        computed6111 = computed6109 + computed6110;
        comparison6113 = (java.lang.Float.isNaN(computed6111) || java.lang.Float.isNaN(Float.intBitsToFloat(953267991)) ? -1 : (computed6111 > Float.intBitsToFloat(953267991) ? 1 : computed6111 == Float.intBitsToFloat(953267991) ? 0 : -1));
        if (value56 != null) {
            edgeValue6149 = regionValue6029;
            edgeValue6150 = regionValue6030;
            edgeValue6153 = regionValue6033;
            regionValue6127 = edgeValue6149;
            regionValue6128 = edgeValue6150;
            regionValue6131 = edgeValue6153;
            regionValue6134 = computed6111;
            regionValue6135 = comparison6113;
            break region1260;
        } else {
            edgeValue6193 = regionValue6029;
            edgeValue6194 = regionValue6030;
            edgeValue6197 = regionValue6033;
            regionValue6171 = edgeValue6193;
            regionValue6172 = edgeValue6194;
            regionValue6175 = edgeValue6197;
            break region1241;
        }
        }
        if (comparison6113 < 0) {
            edgeValue6232 = regionValue6171;
            edgeValue6233 = regionValue6172;
            regionValue6215 = edgeValue6232;
            regionValue6216 = edgeValue6233;
            regionValue6218 = value5493;
            break region1369;
        } else {
            edgeValue6270 = regionValue6171;
            edgeValue6271 = regionValue6172;
            edgeValue6274 = regionValue6175;
            regionValue6249 = edgeValue6270;
            regionValue6250 = edgeValue6271;
            regionValue6253 = edgeValue6274;
            break region1242;
        }
        }
        edgeValue6312 = regionValue6249;
        edgeValue6313 = regionValue6250;
        edgeValue6316 = regionValue6253;
        regionValue6291 = edgeValue6312;
        regionValue6292 = edgeValue6313;
        regionValue6295 = edgeValue6316;
        break region1244;
        }
        value6320 = recovery$indy$flow$484(computed6111);
        comparison6322 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison6322 <= 0) {
            edgeValue6355 = regionValue6291;
            edgeValue6356 = regionValue6292;
            regionValue6336 = edgeValue6355;
            regionValue6337 = edgeValue6356;
            regionValue6340 = value6107;
            regionValue6341 = value6320;
            break region1274;
        } else {
            edgeValue6396 = regionValue6291;
            edgeValue6397 = regionValue6292;
            edgeValue6400 = regionValue6295;
            regionValue6374 = edgeValue6396;
            regionValue6375 = edgeValue6397;
            regionValue6378 = edgeValue6400;
            break region1252;
        }
        }
        if (value56 != null) {
            edgeValue6438 = regionValue6374;
            edgeValue6439 = regionValue6375;
            edgeValue6444 = 1.0F;
            regionValue6418 = edgeValue6438;
            regionValue6419 = edgeValue6439;
            regionValue6422 = value6107;
            regionValue6423 = value6320;
            regionValue6424 = edgeValue6444;
            break region1273;
        } else {
            edgeValue6481 = regionValue6374;
            edgeValue6482 = regionValue6375;
            edgeValue6485 = regionValue6378;
            edgeValue6490 = 1.0F;
            regionValue6458 = edgeValue6481;
            regionValue6459 = edgeValue6482;
            regionValue6462 = edgeValue6485;
            break region1255;
        }
        }
        edgeValue6527 = regionValue6458;
        edgeValue6528 = regionValue6459;
        edgeValue6531 = regionValue6462;
        regionValue6504 = edgeValue6527;
        regionValue6505 = edgeValue6528;
        regionValue6508 = edgeValue6531;
        break region1257;
        }
        comparison6537 = (java.lang.Float.isNaN(value6320) || java.lang.Float.isNaN(edgeValue6490) ? 1 : (value6320 > edgeValue6490 ? 1 : value6320 == edgeValue6490 ? 0 : -1));
        edgeValue6551 = regionValue6504;
        edgeValue6552 = regionValue6505;
        edgeValue6555 = regionValue6508;
        regionValue6127 = edgeValue6551;
        regionValue6128 = edgeValue6552;
        regionValue6131 = edgeValue6555;
        regionValue6134 = value6320;
        regionValue6135 = comparison6537;
        break region1260;
        }
        if (regionValue6135 >= 0) {
            edgeValue6594 = regionValue6127;
            edgeValue6595 = regionValue6128;
            edgeValue6598 = regionValue6131;
            edgeValue6601 = regionValue6134;
            regionValue6573 = edgeValue6594;
            regionValue6574 = edgeValue6595;
            regionValue6577 = edgeValue6598;
            regionValue6580 = edgeValue6601;
            break region1263;
        } else {
            edgeValue6635 = regionValue6127;
            edgeValue6636 = regionValue6128;
            edgeValue6639 = regionValue6131;
            regionValue6615 = edgeValue6635;
            regionValue6616 = edgeValue6636;
            regionValue6619 = edgeValue6639;
            break region1261;
        }
        }
        value6642 = 1.0F;
        edgeValue6656 = regionValue6615;
        edgeValue6657 = regionValue6616;
        edgeValue6660 = regionValue6619;
        regionValue6573 = edgeValue6656;
        regionValue6574 = edgeValue6657;
        regionValue6577 = edgeValue6660;
        regionValue6580 = value6642;
        break region1263;
        }
        computed6664 = regionValue6577 / regionValue6580;
        computed6666 = value6107 * computed6664;
        edgeValue6681 = regionValue6573;
        edgeValue6682 = regionValue6574;
        regionValue6418 = edgeValue6681;
        regionValue6419 = edgeValue6682;
        regionValue6422 = computed6666;
        regionValue6423 = value6108;
        regionValue6424 = computed6664;
        break region1273;
        }
        computed6688 = regionValue6423 * regionValue6424;
        edgeValue6702 = regionValue6418;
        edgeValue6703 = regionValue6419;
        edgeValue6706 = regionValue6422;
        regionValue6336 = edgeValue6702;
        regionValue6337 = edgeValue6703;
        regionValue6340 = edgeValue6706;
        regionValue6341 = computed6688;
        break region1274;
        }
        value6708 = regionValue6341;
        value6709 = recovery$indy$flow$486(initialized3502);
        value6710 = recovery$indy$flow$487(initialized3502);
        value6711 = recovery$indy$flow$488(a0);
        converted6712 = (double) (value6711);
        computed6713 = value6710 + converted6712;
        value6714 = recovery$indy$flow$489(initialized3502);
        initialized6715 = new net.C_47tf(value6709, computed6713, value6714);
        value6717 = recovery$indy$flow$492(initialized6715);
        value6718 = recovery$indy$flow$493(regionValue6336);
        value6719 = recovery$indy$flow$494(regionValue6336);
        value6720 = recovery$indy$flow$495(value6717, value6718, value6719);
        value6721 = recovery$indy$flow$496(initialized6715);
        value6722 = recovery$indy$flow$497(regionValue6336);
        value6723 = recovery$indy$flow$498(regionValue6336);
        value6724 = recovery$indy$flow$499(value6721, value6722, value6723);
        value6725 = recovery$indy$flow$500(initialized6715);
        value6726 = recovery$indy$flow$501(regionValue6336);
        value6727 = recovery$indy$flow$502(regionValue6336);
        value6728 = recovery$indy$flow$503(value6725, value6726, value6727);
        initialized6729 = new net.C_47tf(value6720, value6724, value6728);
        value6731 = recovery$indy$flow$505(value5493);
        computed6732 = value6731 * Double.longBitsToDouble(-4616189618054758400L);
        value6734 = recovery$indy$flow$506(value5493);
        computed6735 = value6734 * Double.longBitsToDouble(-4616189618054758400L);
        value6737 = recovery$indy$flow$507(computed6735, computed6732);
        computed6738 = value6737 * Double.longBitsToDouble(4640537203540230144L);
        computed6739 = computed6738 / Double.longBitsToDouble(4614256656552045848L);
        computed6740 = computed6739 - Double.longBitsToDouble(4636033603912859648L);
        converted6741 = (float) (computed6740);
        computed6743 = converted6741 * Float.intBitsToFloat(1078530011);
        computed6744 = computed6743 / Float.intBitsToFloat(1127481344);
        value6745 = recovery$indy$flow$508(computed6744);
        computed6747 = converted6741 * Float.intBitsToFloat(1078530011);
        computed6748 = computed6747 / Float.intBitsToFloat(1127481344);
        value6749 = recovery$indy$flow$509(computed6748);
        computed6751 = regionValue6340 * value6749;
        computed6752 = value6708 * value6745;
        computed6753 = computed6751 - computed6752;
        converted6754 = (double) (computed6753);
        computed6755 = value6708 * value6749;
        computed6756 = regionValue6340 * value6745;
        computed6757 = computed6755 + computed6756;
        converted6758 = (double) (computed6757);
        value6759 = recovery$indy$flow$510(value5493, converted6754, 0.0D, converted6758);
        edgeValue6774 = regionValue6336;
        edgeValue6775 = regionValue6337;
        regionValue6215 = edgeValue6774;
        regionValue6216 = edgeValue6775;
        regionValue6218 = value6759;
        break region1369;
        }
        value6778 = recovery$indy$flow$511(initialized3502, regionValue6218);
        value6780 = recovery$indy$flow$513(value6778);
        value6781 = recovery$indy$flow$514(value6778);
        value6782 = recovery$indy$flow$515(a0);
        converted6783 = (double) (value6782);
        computed6784 = value6781 + converted6783;
        value6785 = recovery$indy$flow$516(value6778);
        initialized6786 = new net.C_47tf(value6780, computed6784, value6785);
        value6788 = recovery$indy$flow$519(initialized6786);
        value6789 = recovery$indy$flow$520(regionValue6215);
        value6790 = recovery$indy$flow$521(regionValue6215);
        value6791 = recovery$indy$flow$522(value6788, value6789, value6790);
        value6792 = recovery$indy$flow$523(initialized6786);
        value6793 = recovery$indy$flow$524(regionValue6215);
        value6794 = recovery$indy$flow$525(regionValue6215);
        value6795 = recovery$indy$flow$526(value6792, value6793, value6794);
        value6796 = recovery$indy$flow$527(initialized6786);
        value6797 = recovery$indy$flow$528(regionValue6215);
        value6798 = recovery$indy$flow$529(regionValue6215);
        value6799 = recovery$indy$flow$530(value6796, value6797, value6798);
        initialized6800 = new net.C_47tf(value6791, value6795, value6799);
        value6802 = recovery$indy$flow$533(initialized3502);
        value6803 = recovery$indy$flow$534(initialized3502);
        value6804 = recovery$indy$flow$535(a0);
        converted6805 = (double) (value6804);
        computed6806 = value6803 + converted6805;
        value6807 = recovery$indy$flow$536(initialized3502);
        initialized6808 = new net.C_47tf(value6802, computed6806, value6807);
        value6810 = recovery$indy$flow$539(initialized6808);
        value6811 = recovery$indy$flow$540(regionValue6216);
        value6812 = recovery$indy$flow$541(regionValue6216);
        value6813 = recovery$indy$flow$542(value6810, value6811, value6812);
        value6814 = recovery$indy$flow$543(initialized6808);
        value6815 = recovery$indy$flow$544(regionValue6216);
        value6816 = recovery$indy$flow$545(regionValue6216);
        value6817 = recovery$indy$flow$546(value6814, value6815, value6816);
        value6818 = recovery$indy$flow$547(initialized6808);
        value6819 = recovery$indy$flow$548(regionValue6216);
        value6820 = recovery$indy$flow$549(regionValue6216);
        value6821 = recovery$indy$flow$550(value6818, value6819, value6820);
        initialized6822 = new net.C_47tf(value6813, value6817, value6821);
        arrayValue6824 = ((double[]) value2618)[3];
        arrayValue6825 = ((double[]) value2618)[4];
        arrayValue6826 = ((double[]) value2618)[5];
        initialized6827 = new net.C_47tf(arrayValue6824, arrayValue6825, arrayValue6826);
        value6829 = recovery$indy$flow$555(initialized6827);
        value6830 = recovery$indy$flow$556(initialized6827);
        value6831 = recovery$indy$flow$557();
        value6833 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6831))))));
        value6834 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6833)))).field_42P));
        value6835 = recovery$indy$flow$560(value6834);
        converted6836 = (double) (value6835);
        computed6837 = value6830 + converted6836;
        value6838 = recovery$indy$flow$561(initialized6827);
        initialized6839 = new net.C_47tf(value6829, computed6837, value6838);
        value6841 = recovery$indy$flow$564(initialized6839);
        value6842 = recovery$indy$flow$565(value2031);
        value6843 = recovery$indy$flow$566(value2031);
        value6844 = recovery$indy$flow$567(value6841, value6842, value6843);
        value6845 = recovery$indy$flow$568(initialized6839);
        value6846 = recovery$indy$flow$569(value2031);
        value6847 = recovery$indy$flow$570(value2031);
        value6848 = recovery$indy$flow$571(value6845, value6846, value6847);
        value6849 = recovery$indy$flow$572(initialized6839);
        value6850 = recovery$indy$flow$573(value2031);
        value6851 = recovery$indy$flow$574(value2031);
        value6852 = recovery$indy$flow$575(value6849, value6850, value6851);
        initialized6853 = new net.C_47tf(value6844, value6848, value6852);
        value6855 = recovery$indy$flow$577();
        value6856 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value6855)))).field_48Q));
        value6859 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(value6856))))));
        value6860 = recovery$indy$flow$580(value6859, computed18);
        if (value56 != null) {
            edgeValue6890 = (int) ((value6860 ? 1 : 0));
            regionValue6875 = edgeValue6890;
            break region1576;
        } else {
            edgeValue6926 = (int) ((value6860 ? 1 : 0));
            break region1526;
        }
        }
        if (edgeValue6926 == 0) {
            break region1551;
        } else {
            break region1527;
        }
        }
        break region1529;
        }
        value7029 = recovery$indy$flow$581();
        if (value56 != null) {
            regionValue7047 = value7029;
            break region1552;
        } else {
            break region1532;
        }
        }
        break region1534;
        }
        value7138 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value7029)))).field_48Q));
        comparison7139 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison7139 < 0) {
            regionValue7154 = value7138;
            break region1549;
        } else {
            break region1539;
        }
        }
        break region1541;
        }
        value7242 = ((java.lang.Object)(((augustus.recovered.modules.combat.KillAura_47CY) (((java.lang.Object)(value7138)))).field_45z));
        if (value7242 == null) {
            break region1551;
        } else {
            break region1543;
        }
        }
        break region1545;
        }
        value7316 = recovery$indy$flow$584();
        value7317 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value7316)))).field_48Q));
        regionValue7154 = value7317;
        break region1549;
        }
        value7333 = recovery$indy$flow$586(regionValue7154);
        regionValue7348 = value7333;
        break region1591;
        }
        value7364 = recovery$indy$flow$587();
        regionValue7047 = value7364;
        break region1552;
        }
        value7383 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(regionValue7047)))).field_41L));
        if (value56 != null) {
            regionValue7398 = value7383;
            break region1581;
        } else {
            break region1555;
        }
        }
        converted7450 = (char) (converted22);
        converted7451 = (short) (converted26);
        value7453 = (int) (converted7451);
        value7454 = (int) (converted7450);
        value7456 = ((java.lang.Object)(((augustus.recovered.modules.legit.Range_47CT) (((java.lang.Object)(value7383))))));
        value7457 = recovery$indy$flow$590(value7456, (char) (value7454), (short) (value7453), converted30);
        edgeValue7472 = (int) ((value7457 ? 1 : 0));
        regionValue6875 = edgeValue7472;
        break region1576;
        }
        if (regionValue6875 == 0) {
            break region1590;
        } else {
            break region1577;
        }
        }
        value7529 = recovery$indy$flow$591();
        value7530 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value7529)))).field_41L));
        regionValue7398 = value7530;
        break region1581;
        }
        value7546 = regionValue7398;
        value7547 = ((java.lang.Object)(((augustus.recovered.modules.legit.Range_47CT) (((java.lang.Object)(value7546))))));
        value7548 = recovery$indy$flow$594(value7547);
        regionValue7348 = value7548;
        break region1591;
        }
        edgeValue7578 = Double.longBitsToDouble(4613937818241073152L);
        regionValue7348 = edgeValue7578;
        break region1591;
        }
        value7579 = regionValue7348;
        value7580 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDebug));
        value7582 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value7580))))));
        value7583 = recovery$indy$flow$597(value7582);
        if (value56 != null) {
            edgeValue7608 = value7579;
            edgeValue7609 = (int) ((value7583 ? 1 : 0));
            regionValue7595 = edgeValue7608;
            regionValue7596 = edgeValue7609;
            break region1777;
        } else {
            edgeValue7640 = value7579;
            edgeValue7641 = (int) ((value7583 ? 1 : 0));
            regionValue7624 = edgeValue7640;
            break region1604;
        }
        }
        if (edgeValue7641 == 0) {
            edgeValue7667 = regionValue7624;
            regionValue7654 = edgeValue7667;
            break region1760;
        } else {
            edgeValue7697 = regionValue7624;
            regionValue7682 = edgeValue7697;
            break region1605;
        }
        }
        edgeValue7727 = regionValue7682;
        regionValue7712 = edgeValue7727;
        break region1607;
        }
        value7728 = recovery$indy$flow$598(a0);
        converted7729 = (double) (value7728);
        value7730 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingMaxTargetHurttime));
        value7733 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value7730))))));
        value7734 = recovery$indy$flow$601(value7733, computed34);
        comparison7735 = (java.lang.Double.isNaN(converted7729) || java.lang.Double.isNaN(value7734) ? 1 : (converted7729 > value7734 ? 1 : converted7729 == value7734 ? 0 : -1));
        if (value56 != null) {
            edgeValue7747 = regionValue7712;
            regionValue7595 = edgeValue7747;
            regionValue7596 = comparison7735;
            break region1777;
        } else {
            edgeValue7779 = regionValue7712;
            regionValue7763 = edgeValue7779;
            break region1626;
        }
        }
        edgeValue7811 = regionValue7763;
        regionValue7795 = edgeValue7811;
        break region1628;
        }
        if (comparison7735 > 0) {
            edgeValue7825 = regionValue7795;
            regionValue7654 = edgeValue7825;
            break region1760;
        } else {
            edgeValue7855 = regionValue7795;
            regionValue7840 = edgeValue7855;
            break region1629;
        }
        }
        edgeValue7885 = regionValue7840;
        regionValue7870 = edgeValue7885;
        break region1631;
        }
        value7886 = recovery$indy$flow$602(initialized6808, initialized6822);
        comparison7887 = (java.lang.Double.isNaN(value7886) || java.lang.Double.isNaN(Double.longBitsToDouble(4613937818241073152L)) ? -1 : (value7886 > Double.longBitsToDouble(4613937818241073152L) ? 1 : value7886 == Double.longBitsToDouble(4613937818241073152L) ? 0 : -1));
        comparison7888 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison7888 <= 0) {
            edgeValue7920 = regionValue7870;
            regionValue7903 = edgeValue7920;
            regionValue7904 = comparison7887;
            break region1672;
        } else {
            edgeValue7954 = regionValue7870;
            regionValue7937 = edgeValue7954;
            break region1641;
        }
        }
        edgeValue7988 = regionValue7937;
        regionValue7971 = edgeValue7988;
        break region1643;
        }
        if (value56 != null) {
            edgeValue8021 = regionValue7971;
            regionValue8005 = edgeValue8021;
            regionValue8006 = comparison7887;
            break region1671;
        } else {
            edgeValue8053 = regionValue7971;
            regionValue8037 = edgeValue8053;
            break region1644;
        }
        }
        edgeValue8085 = regionValue8037;
        regionValue8069 = edgeValue8085;
        break region1646;
        }
        if (comparison7887 > 0) {
            edgeValue8116 = regionValue8069;
            regionValue8101 = edgeValue8116;
            break region1664;
        } else {
            edgeValue8146 = regionValue8069;
            regionValue8131 = edgeValue8146;
            break region1647;
        }
        }
        value8147 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingAccurate));
        value8149 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value8147))))));
        value8150 = recovery$indy$flow$605(value8149);
        if (value56 != null) {
            edgeValue8162 = regionValue8131;
            edgeValue8163 = (int) ((value8150 ? 1 : 0));
            regionValue7595 = edgeValue8162;
            regionValue7596 = edgeValue8163;
            break region1777;
        } else {
            edgeValue8194 = regionValue8131;
            edgeValue8195 = (int) ((value8150 ? 1 : 0));
            regionValue8178 = edgeValue8194;
            break region1659;
        }
        }
        edgeValue8226 = regionValue8178;
        regionValue8210 = edgeValue8226;
        break region1661;
        }
        if (edgeValue8195 != 0) {
            edgeValue8240 = regionValue8210;
            regionValue7654 = edgeValue8240;
            break region1760;
        } else {
            edgeValue8270 = regionValue8210;
            regionValue8255 = edgeValue8270;
            break region1662;
        }
        }
        edgeValue8285 = regionValue8255;
        regionValue8101 = edgeValue8285;
        break region1664;
        }
        value8286 = recovery$indy$flow$606(initialized6786, initialized6800);
        comparison8287 = (java.lang.Double.isNaN(value8286) || java.lang.Double.isNaN(Double.longBitsToDouble(4613937818241073152L)) ? -1 : (value8286 > Double.longBitsToDouble(4613937818241073152L) ? 1 : value8286 == Double.longBitsToDouble(4613937818241073152L) ? 0 : -1));
        edgeValue8302 = regionValue8101;
        regionValue8005 = edgeValue8302;
        regionValue8006 = comparison8287;
        break region1671;
        }
        edgeValue8318 = regionValue8005;
        edgeValue8319 = regionValue8006;
        regionValue7903 = edgeValue8318;
        regionValue7904 = edgeValue8319;
        break region1672;
        }
        if (value56 != null) {
            edgeValue8332 = regionValue7903;
            edgeValue8333 = regionValue7904;
            regionValue7595 = edgeValue8332;
            regionValue7596 = edgeValue8333;
            break region1777;
        } else {
            edgeValue8364 = regionValue7903;
            edgeValue8365 = regionValue7904;
            regionValue8348 = edgeValue8364;
            regionValue8349 = edgeValue8365;
            break region1673;
        }
        }
        if (regionValue8349 <= 0) {
            edgeValue8378 = regionValue8348;
            regionValue7654 = edgeValue8378;
            break region1760;
        } else {
            edgeValue8408 = regionValue8348;
            regionValue8393 = edgeValue8408;
            break region1674;
        }
        }
        value8409 = recovery$indy$flow$607(initialized6839, initialized6853);
        comparison8410 = (java.lang.Double.isNaN(value8409) || java.lang.Double.isNaN(regionValue8393) ? 1 : (value8409 > regionValue8393 ? 1 : value8409 == regionValue8393 ? 0 : -1));
        if (value56 != null) {
            edgeValue8422 = regionValue8393;
            regionValue7595 = edgeValue8422;
            regionValue7596 = comparison8410;
            break region1777;
        } else {
            edgeValue8454 = regionValue8393;
            regionValue8438 = edgeValue8454;
            break region1681;
        }
        }
        edgeValue8486 = regionValue8438;
        regionValue8470 = edgeValue8486;
        break region1683;
        }
        if (comparison8410 >= 0) {
            edgeValue8500 = regionValue8470;
            regionValue7654 = edgeValue8500;
            break region1760;
        } else {
            edgeValue8530 = regionValue8470;
            regionValue8515 = edgeValue8530;
            break region1684;
        }
        }
        edgeValue8560 = regionValue8515;
        regionValue8545 = edgeValue8560;
        break region1686;
        }
        value8561 = recovery$indy$flow$608();
        value8563 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8561))))));
        value8564 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8563)))).field_42P));
        value8565 = recovery$indy$flow$611(value8564, a0);
        comparison8566 = (java.lang.Float.isNaN(value8565) || java.lang.Float.isNaN(Float.intBitsToFloat(1077936128)) ? -1 : (value8565 > Float.intBitsToFloat(1077936128) ? 1 : value8565 == Float.intBitsToFloat(1077936128) ? 0 : -1));
        comparison8567 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison8567 <= 0) {
            edgeValue8593 = regionValue8545;
            regionValue8579 = edgeValue8593;
            regionValue8580 = comparison8566;
            break region1778;
        } else {
            edgeValue8627 = regionValue8545;
            regionValue8610 = edgeValue8627;
            break region1704;
        }
        }
        edgeValue8661 = regionValue8610;
        regionValue8644 = edgeValue8661;
        break region1706;
        }
        if (value56 != null) {
            edgeValue8675 = regionValue8644;
            regionValue7595 = edgeValue8675;
            regionValue7596 = comparison8566;
            break region1777;
        } else {
            edgeValue8707 = regionValue8644;
            regionValue8691 = edgeValue8707;
            break region1707;
        }
        }
        edgeValue8739 = regionValue8691;
        regionValue8723 = edgeValue8739;
        break region1709;
        }
        if (comparison8566 <= 0) {
            edgeValue8753 = regionValue8723;
            regionValue7654 = edgeValue8753;
            break region1760;
        } else {
            edgeValue8783 = regionValue8723;
            regionValue8768 = edgeValue8783;
            break region1710;
        }
        }
        initialized8784 = new java.lang.StringBuilder();
        value8785 = recovery$indy$flow$614(initialized6808, initialized6822);
        value8786 = recovery$indy$flow$615(value8785, computed52, 4, -6667596045783793069L, computed16);
        value8787 = recovery$indy$flow$616(initialized8784, value8786);
        value8788 = recovery$indy$flow$617(value8787, "  ");
        value8789 = recovery$indy$flow$618(initialized6786, initialized6800);
        value8790 = recovery$indy$flow$619(value8789, computed52, 4, -6667596045783793069L, computed16);
        value8791 = recovery$indy$flow$620(value8788, value8790);
        value8792 = recovery$indy$flow$621(value8791, "  ");
        value8793 = recovery$indy$flow$622(initialized6839, initialized6853);
        value8794 = recovery$indy$flow$623(value8793, computed52, 4, -6667596045783793069L, computed16);
        value8795 = recovery$indy$flow$624(value8792, value8794);
        value8796 = recovery$indy$flow$625(value8795);
        value8799 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value8796))))));
        recovery$indy$flow$627(computed32, value8799);
        edgeValue8812 = regionValue8768;
        regionValue7654 = edgeValue8812;
        break region1760;
        }
        value8813 = recovery$indy$flow$628(a0);
        converted8814 = (double) (value8813);
        value8815 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingMaxTargetHurttime));
        value8818 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value8815))))));
        value8819 = recovery$indy$flow$631(value8818, computed34);
        comparison8820 = (java.lang.Double.isNaN(converted8814) || java.lang.Double.isNaN(value8819) ? 1 : (converted8814 > value8819 ? 1 : converted8814 == value8819 ? 0 : -1));
        edgeValue8832 = regionValue7654;
        regionValue7595 = edgeValue8832;
        regionValue7596 = comparison8820;
        break region1777;
        }
        edgeValue8845 = regionValue7595;
        edgeValue8846 = regionValue7596;
        regionValue8579 = edgeValue8845;
        regionValue8580 = edgeValue8846;
        break region1778;
        }
        comparison8848 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison8848 <= 0) {
            edgeValue8870 = regionValue8579;
            edgeValue8871 = regionValue8580;
            regionValue8858 = edgeValue8870;
            regionValue8859 = edgeValue8871;
            break region1794;
        } else {
            edgeValue8898 = regionValue8579;
            edgeValue8899 = regionValue8580;
            regionValue8884 = edgeValue8898;
            regionValue8885 = edgeValue8899;
            break region1782;
        }
        }
        if (value56 != null) {
            edgeValue8921 = regionValue8884;
            edgeValue8922 = regionValue8885;
            regionValue8910 = edgeValue8921;
            regionValue8911 = edgeValue8922;
            break region1793;
        } else {
            edgeValue8947 = regionValue8884;
            edgeValue8948 = regionValue8885;
            regionValue8934 = edgeValue8947;
            regionValue8935 = edgeValue8948;
            break region1783;
        }
        }
        edgeValue8973 = regionValue8934;
        edgeValue8974 = regionValue8935;
        regionValue8960 = edgeValue8973;
        regionValue8961 = edgeValue8974;
        break region1785;
        }
        if (regionValue8961 > 0) {
            break region1869;
        } else {
            edgeValue9002 = regionValue8960;
            regionValue8990 = edgeValue9002;
            break region1786;
        }
        }
        value9003 = recovery$indy$flow$632(initialized6808, initialized6822);
        comparison9004 = (java.lang.Double.isNaN(value9003) || java.lang.Double.isNaN(Double.longBitsToDouble(4613937818241073152L)) ? -1 : (value9003 > Double.longBitsToDouble(4613937818241073152L) ? 1 : value9003 == Double.longBitsToDouble(4613937818241073152L) ? 0 : -1));
        edgeValue9014 = regionValue8990;
        regionValue8910 = edgeValue9014;
        regionValue8911 = comparison9004;
        break region1793;
        }
        edgeValue9025 = regionValue8910;
        edgeValue9026 = regionValue8911;
        regionValue8858 = edgeValue9025;
        regionValue8859 = edgeValue9026;
        break region1794;
        }
        if (value56 != null) {
            edgeValue9044 = regionValue8858;
            edgeValue9045 = regionValue8859;
            regionValue9035 = edgeValue9044;
            regionValue9036 = edgeValue9045;
            break region1824;
        } else {
            edgeValue9066 = regionValue8858;
            edgeValue9067 = regionValue8859;
            regionValue9055 = edgeValue9066;
            regionValue9056 = edgeValue9067;
            break region1795;
        }
        }
        if (regionValue9056 > 0) {
            edgeValue9087 = regionValue9055;
            regionValue9077 = edgeValue9087;
            break region1817;
        } else {
            edgeValue9107 = regionValue9055;
            regionValue9097 = edgeValue9107;
            break region1796;
        }
        }
        value9108 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingAccurate));
        value9110 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value9108))))));
        value9111 = recovery$indy$flow$635(value9110);
        comparison9112 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison9112 < 0) {
            edgeValue9130 = regionValue9097;
            edgeValue9131 = (int) ((value9111 ? 1 : 0));
            regionValue9120 = edgeValue9130;
            regionValue9121 = edgeValue9131;
            break region1825;
        } else {
            edgeValue9154 = regionValue9097;
            edgeValue9155 = (int) ((value9111 ? 1 : 0));
            regionValue9142 = edgeValue9154;
            break region1811;
        }
        }
        edgeValue9178 = regionValue9142;
        regionValue9166 = edgeValue9178;
        break region1813;
        }
        if (value56 != null) {
            edgeValue9188 = regionValue9166;
            regionValue9035 = edgeValue9188;
            regionValue9036 = edgeValue9155;
            break region1824;
        } else {
            edgeValue9210 = regionValue9166;
            regionValue9199 = edgeValue9210;
            break region1814;
        }
        }
        edgeValue9232 = regionValue9199;
        regionValue9221 = edgeValue9232;
        break region1816;
        }
        if (edgeValue9155 != 0) {
            break region1869;
        } else {
            edgeValue9245 = regionValue9221;
            regionValue9077 = edgeValue9245;
            break region1817;
        }
        }
        value9246 = recovery$indy$flow$636(initialized6786, initialized6800);
        comparison9247 = (java.lang.Double.isNaN(value9246) || java.lang.Double.isNaN(Double.longBitsToDouble(4613937818241073152L)) ? -1 : (value9246 > Double.longBitsToDouble(4613937818241073152L) ? 1 : value9246 == Double.longBitsToDouble(4613937818241073152L) ? 0 : -1));
        edgeValue9255 = regionValue9077;
        regionValue9035 = edgeValue9255;
        regionValue9036 = comparison9247;
        break region1824;
        }
        edgeValue9264 = regionValue9035;
        edgeValue9265 = regionValue9036;
        regionValue9120 = edgeValue9264;
        regionValue9121 = edgeValue9265;
        break region1825;
        }
        comparison9267 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison9267 <= 0) {
            edgeValue9280 = regionValue9121;
            regionValue9273 = edgeValue9280;
            break region1841;
        } else {
            edgeValue9299 = regionValue9120;
            edgeValue9300 = regionValue9121;
            regionValue9289 = edgeValue9299;
            regionValue9290 = edgeValue9300;
            break region1829;
        }
        }
        if (value56 != null) {
            edgeValue9313 = regionValue9290;
            regionValue9307 = edgeValue9313;
            break region1840;
        } else {
            edgeValue9330 = regionValue9289;
            edgeValue9331 = regionValue9290;
            regionValue9321 = edgeValue9330;
            regionValue9322 = edgeValue9331;
            break region1830;
        }
        }
        edgeValue9348 = regionValue9321;
        edgeValue9349 = regionValue9322;
        regionValue9339 = edgeValue9348;
        regionValue9340 = edgeValue9349;
        break region1832;
        }
        if (regionValue9340 <= 0) {
            break region1869;
        } else {
            edgeValue9367 = regionValue9339;
            regionValue9359 = edgeValue9367;
            break region1833;
        }
        }
        value9368 = recovery$indy$flow$637(initialized6839, initialized6853);
        comparison9369 = (java.lang.Double.isNaN(value9368) || java.lang.Double.isNaN(regionValue9359) ? 1 : (value9368 > regionValue9359 ? 1 : value9368 == regionValue9359 ? 0 : -1));
        regionValue9307 = comparison9369;
        break region1840;
        }
        edgeValue9381 = regionValue9307;
        regionValue9273 = edgeValue9381;
        break region1841;
        }
        comparison9383 = (computed16 > 0L ? 1 : computed16 == 0L ? 0 : -1);
        if (comparison9383 < 0) {
            edgeValue9390 = regionValue9273;
            regionValue9386 = edgeValue9390;
            break region1865;
        } else {
            edgeValue9404 = regionValue9273;
            regionValue9397 = edgeValue9404;
            break region1845;
        }
        }
        if (value56 != null) {
            edgeValue9413 = regionValue9397;
            regionValue9409 = edgeValue9413;
            break region1864;
        } else {
            edgeValue9425 = regionValue9397;
            regionValue9419 = edgeValue9425;
            break region1846;
        }
        }
        edgeValue9437 = regionValue9419;
        regionValue9431 = edgeValue9437;
        break region1848;
        }
        if (regionValue9431 >= 0) {
            break region1869;
        } else {
            break region1849;
        }
        }
        value9450 = recovery$indy$flow$638();
        value9452 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9450))))));
        value9453 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9452)))).field_42P));
        value9454 = recovery$indy$flow$641(value9453, a0);
        comparison9455 = (java.lang.Float.isNaN(value9454) || java.lang.Float.isNaN(Float.intBitsToFloat(1077936128)) ? -1 : (value9454 > Float.intBitsToFloat(1077936128) ? 1 : value9454 == Float.intBitsToFloat(1077936128) ? 0 : -1));
        regionValue9409 = comparison9455;
        break region1864;
        }
        edgeValue9462 = regionValue9409;
        regionValue9386 = edgeValue9462;
        break region1865;
        }
        if (value56 != null) {
            edgeValue9469 = regionValue9386;
            regionValue9466 = edgeValue9469;
            break region1868;
        } else {
            edgeValue9475 = regionValue9386;
            regionValue9472 = edgeValue9475;
            break region1866;
        }
        }
        if (regionValue9472 <= 0) {
            break region1869;
        } else {
            break region1867;
        }
        }
        edgeValue9484 = 1;
        regionValue9466 = edgeValue9484;
        break region1868;
        }
        edgeValue9490 = regionValue9466;
        regionValue9487 = edgeValue9490;
        break region1870;
        }
        edgeValue9493 = 0;
        regionValue9487 = edgeValue9493;
        break region1870;
        }
        value9494 = regionValue9487;
        if (value9494 == 0) {
            edgeValue9497 = value9494;
            regionValue9495 = edgeValue9497;
            break region1877;
        } else {
            edgeValue9503 = value9494;
            regionValue9500 = edgeValue9503;
            break region1874;
        }
        }
        edgeValue9508 = regionValue9500;
        regionValue9505 = edgeValue9508;
        regionValue9507 = value2031;
        break region1878;
        }
        edgeValue9511 = regionValue9495;
        edgeValue9513 = null;
        regionValue9505 = edgeValue9511;
        regionValue9507 = edgeValue9513;
        break region1878;
        }
        recovery$indy$flow$642(this, regionValue9507);
        return ((regionValue9505 & 1) != 0);
    }


















   private void method_42$4a66cb4514(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      this.field_437 = 0;
      recovery$indy$10(this.field_48, -1836224888457047505L, var4);
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_40$e781d6169a(C_47zh var1, long var2) {
      TimerRangeV2_47CJ var10000;
      long var4 = var2 ^ 27738005618893L;
      String var6 = recovery$indy$11(8497375436052582988L, var2);
      C_473U var7 = recovery$indy$12(var1, 8497109445198174660L, var2);
      var10000 = this;
      label74:
      if (var6 == null) {
         label72:
         if (recovery$indy$13(this.settingExtreme, 8496737275519657488L, var2)) {
            var10000 = this;
            if (var6 != null) {
               break label74;
            }

            int var8 = this.field_437;
            if (var2 > 0L) {
               if (this.field_437 != 3) {
                  break label72;
               }

               var8 = (int) ((var7 instanceof C_47WF) ? 1 : 0);
            }

            label55:
            if (var6 == null) {
               label62: {
                  if (var8 != 0) {
                     var8 = (int) ((this.field_43u) ? 1 : 0);
                     if (var6 != null) {
                        break label55;
                     }

                     if (!this.field_43u) {
                        var10000 = this;
                        if (var2 < 0L) {
                           break label62;
                        }

                        this.field_43u = true;
                        if (var6 == null) {
                           return;
                        }
                     }
                  }

                  var10000 = this;
               }

               var8 = (int) ((var10000.field_43u) ? 1 : 0);
            }

            if (var8 == 0) {
               return;
            }

            recovery$indy$14(var1, var4, true, 8497238817567862035L, var2);
            if (var6 == null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.field_43u = false;
   }



   public C_478i method_44$6684d3c618() {
      return this.field_46;
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 134440544214445L;
      long var10000 = -8943940711157554112L;
      String var3 = C_47eb.method_48$0e30dfc966();
      long var10001 = -8942326730292686820L;
      BooleanSetting var4 = this.settingOnlyWhileKillAura;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public boolean method_45$70c9b2b421(short var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 58410669576703L;
      String var8 = recovery$indy$15(2282360332467779596L, var4);
      TimerRangeV2_47CJ var10000 = this;
      if (var8 == null) {
         if (!recovery$indy$16(this, var6, 2283833286810227696L, var4)) {
            return false;
         }

         var10000 = this;
      }

      return var10000.field_46 != null;
   }



   private EntityLivingBase method_47$f2b0beb8fc(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 36490716550430L;
      long var5 = var1 ^ 50308928119005L;
      String var7 = recovery$indy$17(8442760915407360650L, var1);
      EntityLivingBase var8 = recovery$indy$18(var3, 8442467077180479134L, var1);
      if (!recovery$indy$19(this.settingOnlyWhileKillAura, 8443248929654990550L, var1)) {
         if (var7 != null) {
            return var8;
         }

         if (var8 == null) {
            double var9 = 10000.0;
            Iterator var11 = recovery$indy$20(field_43, 8446042524441620607L, var1).field_44Q.iterator();

            label60:
            while (true) {
               Entity var14;
               if (var11.hasNext()) {
                  var14 = (Entity)var11.next();
               } else {
                  var14 = var8;
                  if (var1 >= 0L) {
                     return var8;
                  }
               }

               do {
                  Entity var12 = var14;
                  byte var15 = (byte) ((recovery$indy$21(this, var12, var5, 8442610993529653177L, var1)) ? 1 : 0);
                  if (var7 == null) {
                     if (var15 != 0) {
                        if (var7 == null) {
                           if (var9 > recovery$indy$22(field_43, 8446189562673358520L, var1).method_44$ee256e8a75(var12)) {
                              var8 = (EntityLivingBase)var12;
                              var9 = recovery$indy$23(field_43, 8446189562673358520L, var1).method_44$ee256e8a75(var12);
                           }

                           if (var7 == null) {
                              continue label60;
                           }
                        } else {
                           var9 = var9;
                           if (var7 == null) {
                              continue label60;
                           }
                        }
                     } else if (var7 == null) {
                        continue label60;
                     }
                  } else {
                     if (var15 > 0) {
                        var8 = (EntityLivingBase)var12;
                        var9 = recovery$indy$23(field_43, 8446189562673358520L, var1).method_44$ee256e8a75(var12);
                     }

                     if (var7 == null) {
                        continue label60;
                     }
                  }

                  var14 = var8;
               } while (var1 < 0L);

               return var8;
            }
         }
      }

      return var8;
   }



   private boolean method_47$8a15fc4c7b(Entity var1, long var2) {
      long var4;
      String var8;
      Entity var10;
      label44: {
         var2 = a ^ var2;
         var4 = var2 ^ 127885990234048L;
         long var6 = var2 ^ 86971262589095L;
         var8 = recovery$indy$24(5455697706760432662L, var2);
         boolean var10000 = var1 instanceof EntityPlayerSP;
         if (var8 == null) {
            if (var10000) {
               return false;
            }

            var10 = var1;
            if (var8 != null) {
               break label44;
            }

            var10000 = recovery$indy$30(
               var1,
               recovery$indy$25(C_48i.PLAYER, 5454161758117172203L, var2),
               recovery$indy$26(C_48i.MOB, 5454161758117172203L, var2),
               recovery$indy$27(C_48i.ANIMAL, 5454161758117172203L, var2),
               recovery$indy$28(C_48i.VILLAGER, 5454161758117172203L, var2),
               recovery$indy$29(C_48i.ARMOR_STAND, 5454161758117172203L, var2),
               true,
               true,
               true,
               var6,
               true,
               true,
               true,
               5455390607217424504L,
               var2
            );
         }

         if (!var10000) {
            return false;
         }

         var10 = var1;
      }

      if (var10 != recovery$indy$31(field_43, 5452410897852520484L, var2)) {
         double var12;
         int var11 = (
                  var12 = recovery$indy$32(field_43, 5452410897852520484L, var2).method_44$ee256e8a75(var1)
                     - recovery$indy$33(this.settingPreAimRange, var4, 5453874658979195761L, var2)
               )
               == 0.0
            ? 0
            : (var12 < 0.0 ? -1 : 1);
         if (var8 != null) {
            return var11 != 0;
         }

         if (var11 < 0) {
            return true;
         }
      }

      return false;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$34(this, 16, var3, -7101154410172153031L, var1);
      recovery$indy$35(this, 25, var3, -7101154410172153031L, var1);
   }



   private boolean method_43j$aae029aa0a() {
      long var1 = a ^ 33358817372213L;
      long var10000 = -5298245970296270376L;
      String var3 = C_47eb.method_48$0e30dfc966();
      long var10001 = -5296764068936768124L;
      BooleanSetting var4 = this.settingDynamicLagTicks;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   private boolean method_43E$aae029aa0a() {
      long var1 = a ^ 40270269279368L;
      long var10000 = 8270266612917294437L;
      String var3 = C_47eb.method_48$0e30dfc966();
      long var10001 = 8269497125165162809L;
      BooleanSetting var4 = this.settingOnlyWhileKillAura;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 15899570855225L;
      int var6 = (int)((var4 ^ 15899570855225L) >>> 48);
      int var7 = (int)((var4 ^ 15899570855225L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      this.field_43v = false;
      this.field_43a = false;
      this.field_43P = false;
      this.field_438 = 0;
      recovery$indy$36(this, (char)var6, var7, (char)var8, 2729504737735841189L, var4);
      this.field_43y = 0;
      this.field_42 = 0;
      this.field_43p = 0;
   }



    public TimerRangeV2_47CJ(long a0) {
        super((java.lang.String) ("TimerRangeV2"),(java.lang.String) ("ZeitDistanzV2"),(long) (((augustus.recovered.modules.latency.TimerRangeV2_47CJ.a ^ a0) ^ 16569401112834L)),(java.awt.Color) (new java.awt.Color((int) (23),(int) (233),(int) (123))),(client.module.Category) (client.module.Category.LATENCY));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.latency.TimerRangeV2_47CJ.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.latency.TimerRangeV2_47CJ.a ^ a0) ^ 8901443099624L) >>> 48));
        int constructorPart4 = (int) (((((augustus.recovered.modules.latency.TimerRangeV2_47CJ.a ^ a0) ^ 8901443099624L) << 16) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.latency.TimerRangeV2_47CJ.a ^ a0) ^ 8901443099624L) << 32) >>> 32));
        long constructorKey6 = ((augustus.recovered.modules.latency.TimerRangeV2_47CJ.a ^ a0) ^ 75478885763535L);
        long constructorKey7 = ((augustus.recovered.modules.latency.TimerRangeV2_47CJ.a ^ a0) ^ 97940812208771L);
        long constructorKey8 = ((augustus.recovered.modules.latency.TimerRangeV2_47CJ.a ^ a0) ^ 25551021682706L);
        long constructorKey9 = ((augustus.recovered.modules.latency.TimerRangeV2_47CJ.a ^ a0) ^ 138767690278169L);
        long constructorKey10 = ((augustus.recovered.modules.latency.TimerRangeV2_47CJ.a ^ a0) ^ 91729457748638L);
        long constructorKey11 = ((augustus.recovered.modules.latency.TimerRangeV2_47CJ.a ^ a0) ^ 81239551623592L);
        client.setting.BooleanSetting initialized12 = new client.setting.BooleanSetting(this, constructorKey9, "DynamicLagTicks", true);
        recovery$indy$flow$731(this, initialized12);
        client.setting.NumberSetting initialized13 = new client.setting.NumberSetting(this, "LagTickDiff", Double.longBitsToDouble(4613937818241073152L), constructorKey10, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue14 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingDynamicLagTicks));
        java.lang.Object initialValue15 = recovery$indy$flow$735(initialValue14);
        java.lang.Object initialValue16 = recovery$indy$flow$736(initialValue14);
        java.lang.Object initialValue17 = initialValue16;
        client.setting.NumberSetting initialValue18 = initialized13;
        java.lang.Object initialValue19 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue20 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue21 = recovery$indy$flow$739(initialValue19, initialValue20);
        recovery$indy$flow$740(this, initialValue21);
        client.setting.NumberSetting initialized22 = new client.setting.NumberSetting(this, "LagTicks", 1.0D, constructorKey10, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue23 = recovery$indy$flow$743(this);
        java.lang.Object initialValue24 = initialValue23;
        client.setting.NumberSetting initialValue25 = initialized22;
        java.lang.Object initialValue26 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue28 = recovery$indy$flow$746(initialValue26, initialValue27);
        recovery$indy$flow$747(this, initialValue28);
        client.setting.NumberSetting initialized29 = new client.setting.NumberSetting(this, "TimerTicks", Double.longBitsToDouble(4617315517961601024L), constructorKey10, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        recovery$indy$flow$750(this, initialized29);
        client.setting.NumberSetting initialized30 = new client.setting.NumberSetting(this, "MaxTargetHurttime", Double.longBitsToDouble(4613937818241073152L), constructorKey10, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        recovery$indy$flow$753(this, initialized30);
        client.setting.NumberSetting initialized31 = new client.setting.NumberSetting(this, "Delay", Double.longBitsToDouble(4647503709213818880L), constructorKey10, 0.0D, Double.longBitsToDouble(4661014508095930368L), 0);
        recovery$indy$flow$756(this, initialized31);
        client.setting.BooleanSetting initialized32 = new client.setting.BooleanSetting(this, constructorKey9, "Correct", false);
        recovery$indy$flow$759(this, initialized32);
        client.setting.BooleanSetting initialized33 = new client.setting.BooleanSetting(this, constructorKey9, "Dynamic", true);
        recovery$indy$flow$762(this, initialized33);
        client.setting.BooleanSetting initialized34 = new client.setting.BooleanSetting(this, constructorKey9, "Accurate", false);
        recovery$indy$flow$765(this, initialized34);
        client.setting.BooleanSetting initialized35 = new client.setting.BooleanSetting(this, constructorKey9, "Debug", false);
        recovery$indy$flow$768(this, initialized35);
        client.setting.BooleanSetting initialized36 = new client.setting.BooleanSetting(this, constructorKey9, "OnlyOnGround", false);
        recovery$indy$flow$771(this, initialized36);
        java.lang.Object initialValue37 = recovery$indy$flow$773(3);
        ((java.lang.Object[]) initialValue37)[0] = "None";
        ((java.lang.Object[]) initialValue37)[1] = "Fix1";
        ((java.lang.Object[]) initialValue37)[2] = "Fix2";
        client.setting.ModeSetting initialized38 = new client.setting.ModeSetting(this, "FixMode", constructorKey6, "None", (java.lang.String[]) (initialValue37));
        recovery$indy$flow$775(this, initialized38);
        client.setting.BooleanSetting initialized39 = new client.setting.BooleanSetting(this, constructorKey9, "Extreme", false);
        recovery$indy$flow$778(this, initialized39);
        client.setting.SettingGroup initialized40 = new client.setting.SettingGroup(this, "Targets", constructorKey8);
        recovery$indy$flow$781(this, initialized40);
        short converted41 = (short) (constructorPart3);
        char converted42 = (char) (constructorPart4);
        java.lang.Object initialValue43 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingTargets));
        client.setting.BooleanSetting initialized44 = new client.setting.BooleanSetting(this, "OnlyWhileKillAura", converted41, converted42, constructorPart5, true, (client.setting.SettingGroup) (initialValue43));
        recovery$indy$flow$785(this, initialized44);
        java.lang.Object initialValue45 = recovery$indy$flow$787();
        java.lang.Object initialValue46 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingTargets));
        client.setting.MultiSelectSetting initialized47 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey7, (net.C_47OZ[]) (initialValue45), (client.setting.SettingGroup) (initialValue46));
        java.lang.Object initialValue48 = recovery$indy$flow$790(this);
        java.lang.Object initialValue49 = initialValue48;
        client.setting.MultiSelectSetting initialValue50 = initialized47;
        java.lang.Object initialValue51 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue50))))));
        java.lang.Object initialValue52 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue53 = recovery$indy$flow$793(initialValue51, initialValue52);
        recovery$indy$flow$794(this, initialValue53);
        java.lang.Object initialValue54 = ((java.lang.Object)(((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (((java.lang.Object)(this)))).settingTargets));
        client.setting.NumberSetting initialized55 = new client.setting.NumberSetting(this, "PreAimRange", Double.longBitsToDouble(4616189618054758400L), 0.0D, Double.longBitsToDouble(4624633867356078080L), 1, (client.setting.SettingGroup) (initialValue54), constructorKey11);
        java.lang.Object initialValue56 = recovery$indy$flow$798(this);
        java.lang.Object initialValue57 = initialValue56;
        client.setting.NumberSetting initialValue58 = initialized55;
        java.lang.Object initialValue59 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue58))))));
        java.lang.Object initialValue60 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue61 = recovery$indy$flow$801(initialValue59, initialValue60);
        recovery$indy$flow$802(this, initialValue61);
        net.C_47cu initialized62 = new net.C_47cu();
        recovery$indy$flow$805(this, initialized62);
        net.C_47cu initialized63 = new net.C_47cu();
        recovery$indy$flow$808(this, initialized63);
        recovery$indy$flow$809(this, false);
        recovery$indy$flow$810(this, false);
        recovery$indy$flow$811(this, false);
        recovery$indy$flow$812(this, 0);
        recovery$indy$flow$813(this, 0);
        recovery$indy$flow$814(this, 0);
        recovery$indy$flow$815(this, 0);
        recovery$indy$flow$816(this, 0);
        recovery$indy$flow$817(this, 0);
        recovery$indy$flow$818(this, null);
        recovery$indy$flow$819(this, false);
    }






    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object recovery$indy$flow$13(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$14();


    private static native boolean recovery$indy$flow$17(java.lang.Object a0);

    private static native void recovery$indy$flow$19(java.lang.Object a0,boolean a1,long a2);


    private static native double recovery$indy$flow$22(java.lang.Object a0,long a1);


    private static native double recovery$indy$flow$25(java.lang.Object a0,long a1);


    private static native boolean recovery$indy$flow$28(java.lang.Object a0);
    private static boolean recovery$indy$flow$29(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43P;
    }
    private static void recovery$indy$flow$30(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43P = a1;
        return;
    }


    private static native boolean recovery$indy$flow$33(java.lang.Object a0);


    private static native double recovery$indy$flow$36(java.lang.Object a0,long a1);
    private static void recovery$indy$flow$37(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_42 = a1;
        return;
    }

    private static native int recovery$indy$flow$39(java.lang.Object a0);
    private static boolean recovery$indy$flow$40(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43P;
    }
    private static int recovery$indy$flow$41(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_437;
    }



    private static native double recovery$indy$flow$45(java.lang.Object a0,long a1);

    private static native boolean recovery$indy$flow$47(java.lang.Object a0,double a1,long a2);


    private static native boolean recovery$indy$flow$50(java.lang.Object a0);


    private static native double recovery$indy$flow$53(java.lang.Object a0,long a1);


    private static native double recovery$indy$flow$56(java.lang.Object a0,long a1);
    private static void recovery$indy$flow$57(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v = a1;
        return;
    }
    private static int recovery$indy$flow$58(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }
    private static int recovery$indy$flow$59(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }


    private static native boolean recovery$indy$flow$62(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4);
    private static void recovery$indy$flow$63(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$64(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$65(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$66(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v = a1;
        return;
    }


    private static native boolean recovery$indy$flow$69(java.lang.Object a0);
    private static void recovery$indy$flow$70(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v = a1;
        return;
    }
    private static boolean recovery$indy$flow$71(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v;
    }
    private static void recovery$indy$flow$72(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$73(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_438 = a1;
        return;
    }


    private static native boolean recovery$indy$flow$76(java.lang.Object a0);

    private static native void recovery$indy$flow$78(long a0,java.lang.Object a1);



    private static native double recovery$indy$flow$82(java.lang.Object a0,long a1);

    private static native boolean recovery$indy$flow$84(java.lang.Object a0,double a1,long a2);


    private static native boolean recovery$indy$flow$87(java.lang.Object a0);
    private static int recovery$indy$flow$88(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43y;
    }


    private static native double recovery$indy$flow$91(java.lang.Object a0,long a1);


    private static native double recovery$indy$flow$94(java.lang.Object a0,long a1);
    private static int recovery$indy$flow$95(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_438;
    }
    private static int recovery$indy$flow$96(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_437;
    }
    private static void recovery$indy$flow$97(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v = a1;
        return;
    }


    private static native boolean recovery$indy$flow$100(java.lang.Object a0);
    private static int recovery$indy$flow$101(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43y;
    }


    private static native double recovery$indy$flow$104(java.lang.Object a0,long a1);
    private static double recovery$indy$flow$105(double a0,double a1) {
        return java.lang.Math.max(a0, a1);
    }
    private static int recovery$indy$flow$106(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }


    private static native boolean recovery$indy$flow$109(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4);
    private static void recovery$indy$flow$110(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$111(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$112(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v = a1;
        return;
    }


    private static native boolean recovery$indy$flow$115(java.lang.Object a0);
    private static void recovery$indy$flow$116(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$117(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_437 = a1;
        return;
    }
    private static int recovery$indy$flow$118(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_437;
    }
    private static boolean recovery$indy$flow$119(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v;
    }
    private static void recovery$indy$flow$120(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_46 = ((net.C_478i) (a1));
        return;
    }

    private static native void recovery$indy$flow$122(java.lang.Object a0,int a1);

    private static native void recovery$indy$flow$124(java.lang.Object a0,float a1);

    private static native void recovery$indy$flow$126(java.lang.Object a0,boolean a1);
    private static void recovery$indy$flow$127(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$128(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43a = a1;
        return;
    }


    private static native void recovery$indy$flow$131(java.lang.Object a0);
    private static int recovery$indy$flow$132(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_437;
    }
    private static boolean recovery$indy$flow$133(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v;
    }
    private static int recovery$indy$flow$134(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43y;
    }

    private static native void recovery$indy$flow$136(java.lang.Object a0,int a1);
    private static void recovery$indy$flow$137(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$138(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$139(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43p = a1;
        return;
    }


    private static native boolean recovery$indy$flow$142(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$145(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static int recovery$indy$flow$146(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43y;
    }
    private static java.lang.Object recovery$indy$flow$147(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$148(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }

    private static native void recovery$indy$flow$150(long a0,java.lang.Object a1);


    private static native void recovery$indy$flow$153(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$156(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$157(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static void recovery$indy$flow$158(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43a = a1;
        return;
    }


    private static native boolean recovery$indy$flow$161(java.lang.Object a0);
    private static int recovery$indy$flow$162(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43y;
    }


    private static native double recovery$indy$flow$165(java.lang.Object a0,long a1);


    private static native double recovery$indy$flow$168(java.lang.Object a0,long a1);

    private static native void recovery$indy$flow$170(java.lang.Object a0,int a1);

    private static native void recovery$indy$flow$172(java.lang.Object a0,char a1,int a2,char a3);
    private static void recovery$indy$flow$173(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$174(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43p = a1;
        return;
    }


    private static native boolean recovery$indy$flow$177(java.lang.Object a0);

    private static native void recovery$indy$flow$179(long a0,java.lang.Object a1);


    private static native void recovery$indy$flow$182(java.lang.Object a0);
    private static void recovery$indy$flow$183(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43a = a1;
        return;
    }


    private static native double recovery$indy$flow$186(java.lang.Object a0,long a1);


    private static native double recovery$indy$flow$189(java.lang.Object a0,long a1);

    private static native void recovery$indy$flow$191(java.lang.Object a0,int a1);

    private static native void recovery$indy$flow$193(java.lang.Object a0,char a1,int a2,char a3);
    private static void recovery$indy$flow$194(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$195(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43p = a1;
        return;
    }


    private static native boolean recovery$indy$flow$198(java.lang.Object a0);

    private static native void recovery$indy$flow$200(long a0,java.lang.Object a1);


    private static native void recovery$indy$flow$203(java.lang.Object a0);
    private static void recovery$indy$flow$204(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43a = a1;
        return;
    }
    private static int recovery$indy$flow$205(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_437;
    }


    private static native boolean recovery$indy$flow$208(java.lang.Object a0);
    private static int recovery$indy$flow$209(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43y;
    }
    private static int recovery$indy$flow$210(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43y;
    }


    private static native double recovery$indy$flow$213(java.lang.Object a0,long a1);
    private static double recovery$indy$flow$214(double a0,double a1) {
        return java.lang.Math.max(a0, a1);
    }
    private static int recovery$indy$flow$215(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43y;
    }


    private static native double recovery$indy$flow$218(java.lang.Object a0,long a1);
    private static int recovery$indy$flow$219(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_438;
    }
    private static void recovery$indy$flow$220(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_46 = ((net.C_478i) (a1));
        return;
    }

    private static native void recovery$indy$flow$222(java.lang.Object a0,int a1);

    private static native void recovery$indy$flow$224(java.lang.Object a0,float a1);

    private static native void recovery$indy$flow$226(java.lang.Object a0,boolean a1);
    private static void recovery$indy$flow$227(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43P = a1;
        return;
    }


    private static native void recovery$indy$flow$230(java.lang.Object a0);
    private static void recovery$indy$flow$231(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43a = a1;
        return;
    }

    private static native void recovery$indy$flow$233(java.lang.Object a0,char a1,int a2,char a3);


    private static native boolean recovery$indy$flow$236(java.lang.Object a0);

    private static native void recovery$indy$flow$238(long a0,java.lang.Object a1);
    private static void recovery$indy$flow$239(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43a = a1;
        return;
    }
    private static int recovery$indy$flow$240(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_438;
    }
    private static java.lang.Object recovery$indy$flow$241() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$243(java.lang.Object a0);
    private static int recovery$indy$flow$244(java.lang.Object a0) {
        return ((net.C_40X) (a0)).field_48;
    }
    private static void recovery$indy$flow$245(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_438 = a1;
        return;
    }
    private static long recovery$indy$flow$246() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.a;
    }
    private static native java.lang.Object recovery$indy$flow$247();


    private static native boolean recovery$indy$flow$250(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$251() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static boolean recovery$indy$flow$254(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48M;
    }
    private static java.lang.Object recovery$indy$flow$255() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$258(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$259() {
        return client.ClientGlobals.field_48;
    }



    private static native java.lang.Object recovery$indy$flow$263(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$264(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$265() {
        return client.ClientGlobals.field_48;
    }

    private static boolean recovery$indy$flow$267(java.lang.Object a0) {
        return ((augustus.recovered.modules.combat.KillAura_47CY) (a0)).field_43v;
    }
    private static int recovery$indy$flow$268(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48y;
    }
    private static double recovery$indy$flow$270(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48Q;
    }
    private static double recovery$indy$flow$271(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48j;
    }
    private static double recovery$indy$flow$272(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_42o;
    }
    private static double recovery$indy$flow$275(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_43S;
    }
    private static double recovery$indy$flow$276(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_47B;
    }
    private static double recovery$indy$flow$277(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_43E;
    }

    private static native java.lang.Object recovery$indy$flow$280(short a0,short a1,int a2,java.lang.Object a3,int a4);
    private static double recovery$indy$flow$283(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$284(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$285(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static int recovery$indy$flow$286(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_47m;
    }
    private static double recovery$indy$flow$287(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static int recovery$indy$flow$288(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }
    private static double recovery$indy$flow$289(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static int recovery$indy$flow$290(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }
    private static double recovery$indy$flow$291(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static int recovery$indy$flow$292(int a0,int a1) {
        return java.lang.Math.max(a0, a1);
    }
    private static float recovery$indy$flow$293(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48w;
    }
    private static native float recovery$indy$flow$294(java.lang.Object a0);
    private static float recovery$indy$flow$296(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48;
    }
    private static native java.lang.Object recovery$indy$flow$298(java.lang.Object a0,double a1,double a2,double a3);
    private static java.lang.Object recovery$indy$flow$299() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$302(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$303() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$306(java.lang.Object a0);
    private static double recovery$indy$flow$308(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$309(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$310(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$311(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$312(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$313(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$314(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$315(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$316(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static int recovery$indy$flow$318(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43p;
    }
    private static double recovery$indy$flow$320(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$321(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$322(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static java.lang.Object recovery$indy$flow$324() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }




    private static native java.lang.Object recovery$indy$flow$329(int a0,java.lang.Object a1,java.lang.Object a2,long a3);
    private static double recovery$indy$flow$332(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$333(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$334(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$335(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$336(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$337(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$341(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$342(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$343(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$344(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$345(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$346(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$347(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$348(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$349(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static java.lang.Object recovery$indy$flow$351() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static float recovery$indy$flow$354(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48w;
    }
    private static java.lang.Object recovery$indy$flow$355() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static native float recovery$indy$flow$358(java.lang.Object a0);
    private static double recovery$indy$flow$360(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$361(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$362(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$363(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$364(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$365() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static float recovery$indy$flow$368(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48;
    }
    private static double recovery$indy$flow$369(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native java.lang.Object recovery$indy$flow$371(java.lang.Object a0,double a1,double a2,double a3);
    private static double recovery$indy$flow$373(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$374(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$375(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$376(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$377(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$378() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static float recovery$indy$flow$381(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48;
    }
    private static double recovery$indy$flow$382(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native java.lang.Object recovery$indy$flow$384(java.lang.Object a0,double a1,double a2,double a3);

    private static native java.lang.Object recovery$indy$flow$386(short a0,short a1,int a2,java.lang.Object a3,int a4);

    private static native java.lang.Object recovery$indy$flow$388(short a0,short a1,int a2,java.lang.Object a3,int a4);

    private static native java.lang.Object recovery$indy$flow$390(java.lang.Object a0,long a1,int a2);

    private static double recovery$indy$flow$397(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static native int recovery$indy$flow$398(double a0);
    private static double recovery$indy$flow$399(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static native int recovery$indy$flow$400(double a0);
    private static double recovery$indy$flow$401(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native int recovery$indy$flow$402(double a0);
    private static native java.lang.Object recovery$indy$flow$404(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$405(java.lang.Object a0);
    private static float recovery$indy$flow$406(java.lang.Object a0) {
        return ((net.C_475y) (a0)).field_49F;
    }
    private static double recovery$indy$flow$407(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$408(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$409(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$410(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$411(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$412(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static java.lang.Object recovery$indy$flow$413() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static boolean recovery$indy$flow$416(java.lang.Object a0) {
        return ((net.minecraft.client.multiplayer.WorldClient) (a0)).field_446;
    }
    private static java.lang.Object recovery$indy$flow$417() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static double recovery$indy$flow$421(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$422(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native boolean recovery$indy$flow$424(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$425() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static double recovery$indy$flow$429(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$430(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native java.lang.Object recovery$indy$flow$432(java.lang.Object a0,java.lang.Object a1);
    private static native boolean recovery$indy$flow$433(java.lang.Object a0);
    private static double recovery$indy$flow$434(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$435() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static double recovery$indy$flow$438(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static double recovery$indy$flow$439(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static java.lang.Object recovery$indy$flow$440() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static double recovery$indy$flow$443(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static double recovery$indy$flow$444(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native float recovery$indy$flow$445(double a0);
    private static java.lang.Object recovery$indy$flow$449() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static native float recovery$indy$flow$452(java.lang.Object a0);
    private static double recovery$indy$flow$454(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$455(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_48;
    }
    private static double recovery$indy$flow$456(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_42;
    }
    private static native double recovery$indy$flow$457(double a0,double a1,double a2);
    private static double recovery$indy$flow$458(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$459(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_44;
    }
    private static double recovery$indy$flow$460(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_40;
    }
    private static native double recovery$indy$flow$461(double a0,double a1,double a2);
    private static native double recovery$indy$flow$462(double a0,double a1);
    private static java.lang.Object recovery$indy$flow$463() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static native int recovery$indy$flow$466(java.lang.Object a0);
    private static native float recovery$indy$flow$467(float a0);
    private static native float recovery$indy$flow$468(float a0);
    private static native java.lang.Object recovery$indy$flow$469(java.lang.Object a0,double a1,double a2,double a3);

    private static double recovery$indy$flow$472(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static native int recovery$indy$flow$473(double a0);
    private static double recovery$indy$flow$474(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static native int recovery$indy$flow$475(double a0);
    private static double recovery$indy$flow$476(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native int recovery$indy$flow$477(double a0);
    private static native java.lang.Object recovery$indy$flow$479(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$480(java.lang.Object a0);
    private static float recovery$indy$flow$481(java.lang.Object a0) {
        return ((net.C_475y) (a0)).field_49F;
    }
    private static native float recovery$indy$flow$482(java.lang.Object a0);
    private static float recovery$indy$flow$483(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_43i;
    }
    private static native float recovery$indy$flow$484(float a0);
    private static double recovery$indy$flow$486(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$487(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static native float recovery$indy$flow$488(java.lang.Object a0);
    private static double recovery$indy$flow$489(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$492(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$493(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_48;
    }
    private static double recovery$indy$flow$494(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_42;
    }
    private static native double recovery$indy$flow$495(double a0,double a1,double a2);
    private static double recovery$indy$flow$496(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$497(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_46;
    }
    private static double recovery$indy$flow$498(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_47;
    }
    private static native double recovery$indy$flow$499(double a0,double a1,double a2);
    private static double recovery$indy$flow$500(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$501(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_44;
    }
    private static double recovery$indy$flow$502(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_40;
    }
    private static native double recovery$indy$flow$503(double a0,double a1,double a2);
    private static double recovery$indy$flow$505(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$506(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native double recovery$indy$flow$507(double a0,double a1);
    private static native float recovery$indy$flow$508(float a0);
    private static native float recovery$indy$flow$509(float a0);
    private static native java.lang.Object recovery$indy$flow$510(java.lang.Object a0,double a1,double a2,double a3);
    private static native java.lang.Object recovery$indy$flow$511(java.lang.Object a0,java.lang.Object a1);
    private static double recovery$indy$flow$513(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$514(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static native float recovery$indy$flow$515(java.lang.Object a0);
    private static double recovery$indy$flow$516(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$519(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$520(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_48;
    }
    private static double recovery$indy$flow$521(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_42;
    }
    private static native double recovery$indy$flow$522(double a0,double a1,double a2);
    private static double recovery$indy$flow$523(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$524(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_46;
    }
    private static double recovery$indy$flow$525(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_47;
    }
    private static native double recovery$indy$flow$526(double a0,double a1,double a2);
    private static double recovery$indy$flow$527(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$528(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_44;
    }
    private static double recovery$indy$flow$529(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_40;
    }
    private static native double recovery$indy$flow$530(double a0,double a1,double a2);
    private static double recovery$indy$flow$533(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$534(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static native float recovery$indy$flow$535(java.lang.Object a0);
    private static double recovery$indy$flow$536(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$539(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$540(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_48;
    }
    private static double recovery$indy$flow$541(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_42;
    }
    private static native double recovery$indy$flow$542(double a0,double a1,double a2);
    private static double recovery$indy$flow$543(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$544(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_46;
    }
    private static double recovery$indy$flow$545(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_47;
    }
    private static native double recovery$indy$flow$546(double a0,double a1,double a2);
    private static double recovery$indy$flow$547(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$548(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_44;
    }
    private static double recovery$indy$flow$549(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_40;
    }
    private static native double recovery$indy$flow$550(double a0,double a1,double a2);
    private static double recovery$indy$flow$555(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$556(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$557() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static native float recovery$indy$flow$560(java.lang.Object a0);
    private static double recovery$indy$flow$561(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$564(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$565(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_48;
    }
    private static double recovery$indy$flow$566(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_42;
    }
    private static native double recovery$indy$flow$567(double a0,double a1,double a2);
    private static double recovery$indy$flow$568(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$569(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_46;
    }
    private static double recovery$indy$flow$570(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_47;
    }
    private static native double recovery$indy$flow$571(double a0,double a1,double a2);
    private static double recovery$indy$flow$572(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$573(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_44;
    }
    private static double recovery$indy$flow$574(java.lang.Object a0) {
        return ((net.C_478i) (a0)).field_40;
    }
    private static native double recovery$indy$flow$575(double a0,double a1,double a2);
    private static java.lang.Object recovery$indy$flow$577() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$580(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$581() {
        return client.ClientGlobals.field_48;
    }


    private static java.lang.Object recovery$indy$flow$584() {
        return client.ClientGlobals.field_48;
    }

    private static double recovery$indy$flow$586(java.lang.Object a0) {
        return ((augustus.recovered.modules.combat.KillAura_47CY) (a0)).field_42J;
    }
    private static java.lang.Object recovery$indy$flow$587() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$590(java.lang.Object a0,char a1,short a2,int a3);
    private static java.lang.Object recovery$indy$flow$591() {
        return client.ClientGlobals.field_48;
    }


    private static native double recovery$indy$flow$594(java.lang.Object a0);


    private static native boolean recovery$indy$flow$597(java.lang.Object a0);
    private static int recovery$indy$flow$598(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_432;
    }


    private static native double recovery$indy$flow$601(java.lang.Object a0,long a1);
    private static native double recovery$indy$flow$602(java.lang.Object a0,java.lang.Object a1);


    private static native boolean recovery$indy$flow$605(java.lang.Object a0);
    private static native double recovery$indy$flow$606(java.lang.Object a0,java.lang.Object a1);
    private static native double recovery$indy$flow$607(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$608() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static native float recovery$indy$flow$611(java.lang.Object a0,java.lang.Object a1);
    private static native double recovery$indy$flow$614(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$615(double a0,long a1,int a2,long a3,long a4);
    private static java.lang.Object recovery$indy$flow$616(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$617(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native double recovery$indy$flow$618(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$619(double a0,long a1,int a2,long a3,long a4);
    private static java.lang.Object recovery$indy$flow$620(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$621(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native double recovery$indy$flow$622(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$623(double a0,long a1,int a2,long a3,long a4);
    private static java.lang.Object recovery$indy$flow$624(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$625(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }

    private static native void recovery$indy$flow$627(long a0,java.lang.Object a1);
    private static int recovery$indy$flow$628(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_432;
    }


    private static native double recovery$indy$flow$631(java.lang.Object a0,long a1);
    private static native double recovery$indy$flow$632(java.lang.Object a0,java.lang.Object a1);


    private static native boolean recovery$indy$flow$635(java.lang.Object a0);
    private static native double recovery$indy$flow$636(java.lang.Object a0,java.lang.Object a1);
    private static native double recovery$indy$flow$637(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$638() {
        return augustus.recovered.modules.latency.TimerRangeV2_47CJ.field_43;
    }


    private static native float recovery$indy$flow$641(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$642(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_46 = ((net.C_478i) (a1));
        return;
    }
    private static native void recovery$indy$flow$731(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$735(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$736(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$739(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$740(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$743(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$746(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$747(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$750(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$753(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$756(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$759(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$762(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$765(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$768(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$771(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$773(int a0);
    private static native void recovery$indy$flow$775(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$778(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$781(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$785(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$787();

    private static native java.lang.Object recovery$indy$flow$790(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$793(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$794(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$798(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$801(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$802(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$805(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$808(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$809(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$810(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$811(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$812(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$813(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$814(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43n = a1;
        return;
    }
    private static void recovery$indy$flow$815(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$816(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$817(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$818(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_46 = ((net.C_478i) (a1));
        return;
    }
    private static void recovery$indy$flow$819(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.TimerRangeV2_47CJ) (a0)).field_43u = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(long var0, long var2);
   private static native String recovery$indy$2(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$3(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native void recovery$indy$6(Object var0, long var1, boolean var3, long var4, long var6);
   private static native void recovery$indy$10(Object var0, long var1, long var3);
   private static native String recovery$indy$11(long var0, long var2);
   private static native C_473U recovery$indy$12(Object var0, long var1, long var3);
   private static native boolean recovery$indy$13(Object var0, long var1, long var3);
   private static native void recovery$indy$14(Object var0, long var1, boolean var3, long var4, long var6);
   private static native String recovery$indy$15(long var0, long var2);
   private static native boolean recovery$indy$16(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$17(long var0, long var2);
   private static native EntityLivingBase recovery$indy$18(long var0, long var2, long var4);
   private static native boolean recovery$indy$19(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$20(Object var0, long var1, long var3);
   private static native boolean recovery$indy$21(Object var0, Object var1, long var2, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$22(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);
   private static native String recovery$indy$24(long var0, long var2);
   private static native boolean recovery$indy$25(Object var0, long var1, long var3);
   private static native boolean recovery$indy$26(Object var0, long var1, long var3);
   private static native boolean recovery$indy$27(Object var0, long var1, long var3);
   private static native boolean recovery$indy$28(Object var0, long var1, long var3);
   private static native boolean recovery$indy$29(Object var0, long var1, long var3);
   private static native boolean recovery$indy$30(
      Object var0,
      boolean var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      long var9,
      boolean var11,
      boolean var12,
      boolean var13,
      long var14,
      long var16
   );
   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);
   private static native double recovery$indy$33(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$34(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$35(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$36(Object var0, char var1, int var2, char var3, long var4, long var6);
   private static native MethodHandle recovery$constant$41();
}
