package augustus.recovered.modules.latency;
import com.google.common.collect.Queues;
import io.netty.util.concurrent.GenericFutureListener;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import java.util.function.IntFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_42C;
import net.C_42E;
import net.C_42L;
import net.C_42V;
import net.C_42k;
import net.C_434;
import net.C_44B;
import net.C_456;
import net.C_45J;
import net.C_45M;
import net.C_45W;
import net.C_46E;
import net.C_46N;
import net.C_46d;
import net.C_46o;
import net.C_46s;
import net.C_470I;
import net.C_471V;
import net.C_471o;
import net.C_471u;
import net.C_472;
import net.C_473U;
import net.C_4742;
import net.C_474I;
import net.C_474V;
import net.C_4753;
import net.C_475D;
import net.C_475b;
import net.C_4766;
import net.C_4767;
import net.C_476O;
import net.C_476Q;
import net.C_476X;
import net.C_476l;
import net.C_476s;
import net.C_4775;
import net.C_477I;
import net.C_477Q;
import net.C_477Y;
import net.C_478i;
import net.C_479E;
import net.C_479J;
import net.C_479N;
import net.C_479Q;
import net.C_479X;
import net.C_479m;
import net.C_47AL;
import net.C_47AO;
import net.C_47Al;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47BC;
import net.C_47FO;
import net.C_47FQ;
import net.C_47IG;
import net.C_47IW;
import net.C_47Is;
import net.C_47Iz;
import net.C_47K6;
import net.C_47KH;
import net.C_47KJ;
import net.C_47MM;
import net.C_47MN;
import net.minecraft.entity.Entity;
import net.C_47Md;
import client.module.Module;
import net.C_47Om;
import net.C_47PM;
import net.C_47PU;
import net.C_47RC;
import net.C_47RG;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.BooleanSetting;
import net.C_47TZ;
import client.setting.ModeSetting;
import net.C_47Tq;
import net.C_47Ug;
import net.C_47Ut;
import net.C_47Uv;
import net.C_47VY;
import net.C_47Vl;
import net.C_47WF;
import net.C_47Xn;
import net.minecraft.entity.EntityLivingBase;
import net.C_47bi;
import net.C_47bo;
import net.C_47c3;
import net.C_47dU;
import net.C_47dz;
import net.C_47eb;
import net.C_47et;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hw;
import net.C_47j4;
import net.C_47jt;
import net.C_47mT;
import net.C_47mz;
import net.C_47nD;
import net.minecraft.client.Minecraft;
import net.C_47o4;
import net.C_47oN;
import net.C_47oy;
import net.C_47q4;
import net.C_47qi;
import client.ClientGlobals;
import net.C_47rc;
import net.C_47sY;
import client.module.Category;
import net.C_47tS;
import net.C_47tf;
import net.C_47tl;
import net.C_47uV;
import net.C_47vS;
import net.C_47vh;
import net.C_47xZ;
import net.C_47xm;
import net.C_47xz;
import net.C_47y;
import net.C_47yA;
import net.C_47y_;
import net.C_47zh;
import net.C_47zs;
import net.C_47zv;
import net.C_48c;
import net.C_48n;
import net.C_49D;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class PacketHandler_47Cq extends client.module.Module implements net.C_47mz,net.C_47xz {
    private static java.util.Map field_41a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map field_41; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.Queue field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.Queue field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPingFix = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.SettingGroup settingIncoming = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingMacroDelayModes = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRealTimeDamage = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingEventToHandlePacket = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingIncomingPacketsToDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingAbortIncoming = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingIncomingPacketsToDelayAbort = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.SettingGroup settingOutgoing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingOutGoingPacketsToDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingAbortOutgoing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingOutGoingPacketsToDelayAbort = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.CopyOnWriteArrayList field_41C = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

   public void method_46$fc136bb64a(C_473U var1, long var2) {
      var2 = a ^ var2;
      String var4 = recovery$indy$1(368568168287891318L, var2);
      if (recovery$indy$2(field_43, 367963576602550675L, var2) != null) {
         C_473U var10000;
         var10000 = var1;
         label29:
         if (var4 == null) {
            if (!(var1 instanceof C_4766)) {
               var10000 = var1;
               if (var4 != null) {
                  break label29;
               }

               if (!(var1 instanceof C_47IW)) {
                  return;
               }
            }

            var10000 = var1;
         }

         C_42C.method_48$f98697054d(recovery$indy$3(var10000));
      }
   }



   public void method_46$51c0e5ba96(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 69238499581929L;
      long var6 = var2 ^ 44057764568694L;
      String var8 = recovery$indy$4(4611182256079754645L, var2);
      if (!this.field_48.isEmpty()) {
         long var9 = System.currentTimeMillis();
         LinkedBlockingQueue var11 = Queues.newLinkedBlockingQueue();

         for (Object recovered$element$6676 : this.field_48) {
         C_473U var13 = (C_473U) recovered$element$6676;
            String var18;
            label87: {
               label95: {
                  long var14 = (Long)this.field_46.get(var13) + var1;
                  long var19;
                  int var10000 = (var19 = var9 - var14) == 0L ? 0 : (var19 < 0L ? -1 : 1);
                  String var10001 = var8;
                  if (var2 >= 0L) {
                     if (var8 == null) {
                        if (var10000 <= 0) {
                           break label95;
                        }

                        var10000 = (int) ((recovery$indy$5(this, var13, var4, 4610697775697303648L, var2)) ? 1 : 0);
                        var10001 = var8;
                     } else {
                        var10001 = var8;
                     }
                  }

                  label84:
                  while (true) {
                     if (var10001 == null) {
                        if (var10000 != 0) {
                           var11.add(var13);
                           var18 = var8;
                           if (var2 < 0L) {
                              break label87;
                           }

                           if (var8 == null) {
                              break label95;
                           }
                        }

                        var10000 = (int) ((var11.isEmpty()) ? 1 : 0);
                     }

                     while (var10000 == 0) {
                        C_473U var16 = (C_473U)var11.poll();
                        recovery$indy$6(this, var16, var6, 4609852931706539815L, var2);
                        this.field_48.remove(var16);
                        if (var2 <= 0L) {
                           break label95;
                        }

                        if (var8 != null) {
                           break label84;
                        }

                        if (var8 != null) {
                           break;
                        }

                        var10000 = (int) ((var11.isEmpty()) ? 1 : 0);
                     }

                     if (var2 >= 0L) {
                        recovery$indy$7(this, var13, var6, 4609852931706539815L, var2);
                        break;
                     }

                     var10000 = (int) ((recovery$indy$5(this, var13, var6, 4609852931706539815L, var2)) ? 1 : 0);
                     var10001 = var8;
                  }

                  this.field_48.remove(var13);
               }

               var18 = var8;
            }

            if (var18 != null) {
               break;
            }
         }
      }
   }




   private C_47tf method_46$ac0a416c50(C_473U var1, long var2, EntityLivingBase var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 62712689751622L;
      int var7 = recovery$indy$8(this, var5, var1, -8401803002561100758L, var2);
      return var7 != var4.method_49$8abf5c6871() ? null : (C_47tf)var4.field_43X.get(var1);
   }



   public void method_46$e535f8442d(net.C_47zh var1, long var2, short var4) {
      long var5 = var2 << 16 | (long)var4 << 48 >>> 48;
      String var7 = (String)recovery$indy$flow$40(1765516704161592043L, var5);
      boolean var10001 = recovery$indy$flow$41(var1, 1767133701512295100L, var5);
      if (var7 != null) {
         this.field_43P = var10001;
      } else {
         this.field_43P = var10001 || recovery$indy$flow$42(var1, 1765710870203236656L, var5) > 0;
      }
   }



   private static void method_46$c30f2b6ea1(long var0, Map var2) {
      var0 = a ^ var0;
      long var3 = var0 ^ 1508111206118L;
      recovery$indy$13(var3, var2, new C_4753(recovery$indy$12(24100, 5495257189563819317L ^ var0), C_434.class), -5390272442342005436L, var0);
      recovery$indy$15(var3, var2, new C_4753(recovery$indy$14(13085, 3386261638468831232L ^ var0), C_479Q.class), -5390272442342005436L, var0);
      recovery$indy$17(var3, var2, new C_4753(recovery$indy$16(13640, 9117855188605275672L ^ var0), C_47AL.class), -5390272442342005436L, var0);
      recovery$indy$19(var3, var2, new C_4753(recovery$indy$18(12410, 8859614573768444673L ^ var0), C_470I.class), -5390272442342005436L, var0);
      recovery$indy$21(var3, var2, new C_4753(recovery$indy$20(31517, 1513829691825832033L ^ var0), C_476s.class), -5390272442342005436L, var0);
      recovery$indy$23(var3, var2, new C_4753(recovery$indy$22(28256, 1469012670519530869L ^ var0), C_47Ug.class), -5390272442342005436L, var0);
      recovery$indy$25(var3, var2, new C_4753(recovery$indy$24(1940, 1946778111151946962L ^ var0), C_47bo.class), -5390272442342005436L, var0);
      recovery$indy$27(var3, var2, new C_4753(recovery$indy$26(28463, 7280359633190966393L ^ var0), C_47FQ.class), -5390272442342005436L, var0);
      recovery$indy$29(var3, var2, new C_4753(recovery$indy$28(24802, 2575380578611190716L ^ var0), C_47xZ.class), -5390272442342005436L, var0);
      recovery$indy$31(var3, var2, new C_4753(recovery$indy$30(8095, 7064572133713454270L ^ var0), C_474V.class), -5390272442342005436L, var0);
      recovery$indy$33(var3, var2, new C_4753(recovery$indy$32(23337, 5681032133520744525L ^ var0), C_47j4.class), -5390272442342005436L, var0);
      recovery$indy$35(var3, var2, new C_4753(recovery$indy$34(5872, 5667720420597149139L ^ var0), C_48c.class), -5390272442342005436L, var0);
      recovery$indy$37(var3, var2, new C_4753(recovery$indy$36(13337, 8901819474528243537L ^ var0), C_474I.class), -5390272442342005436L, var0);
      recovery$indy$39(var3, var2, new C_4753(recovery$indy$38(29083, 7696781611759946401L ^ var0), C_47VY.class), -5390272442342005436L, var0);
      recovery$indy$41(var3, var2, new C_4753(recovery$indy$40(11391, 4053464806411343631L ^ var0), C_456.class), -5390272442342005436L, var0);
      recovery$indy$43(var3, var2, new C_4753(recovery$indy$42(4569, 1283764541069273806L ^ var0), C_47tS.class), -5390272442342005436L, var0);
      recovery$indy$45(var3, var2, new C_4753(recovery$indy$44(19016, 2396498238251200822L ^ var0), C_49D.class), -5390272442342005436L, var0);
      recovery$indy$47(var3, var2, new C_4753(recovery$indy$46(20991, 7857953124594051826L ^ var0), C_47FO.class), -5390272442342005436L, var0);
      recovery$indy$49(var3, var2, new C_4753(recovery$indy$48(32641, 810219476429587676L ^ var0), C_46s.class), -5390272442342005436L, var0);
      recovery$indy$51(var3, var2, new C_4753(recovery$indy$50(5419, 3623203795152088697L ^ var0), C_47y_.class), -5390272442342005436L, var0);
      recovery$indy$53(var3, var2, new C_4753(recovery$indy$52(20926, 8627359577755249403L ^ var0), C_4766.class), -5390272442342005436L, var0);
      recovery$indy$55(var3, var2, new C_4753(recovery$indy$54(17891, 2630630596566646439L ^ var0), C_4767.class), -5390272442342005436L, var0);
      recovery$indy$57(var3, var2, new C_4753(recovery$indy$56(23535, 2651651841564500097L ^ var0), C_476X.class), -5390272442342005436L, var0);
      recovery$indy$59(var3, var2, new C_4753(recovery$indy$58(1133, 1511020865146208126L ^ var0), C_476O.class), -5390272442342005436L, var0);
      recovery$indy$61(var3, var2, new C_4753(recovery$indy$60(6333, 6710661882847404941L ^ var0), C_47IW.class), -5390272442342005436L, var0);
      recovery$indy$63(var3, var2, new C_4753(recovery$indy$62(31706, 6292878314681450734L ^ var0), C_47Tq.class), -5390272442342005436L, var0);
      recovery$indy$65(var3, var2, new C_4753(recovery$indy$64(6100, 6556734372143901950L ^ var0), C_47nD.class), -5390272442342005436L, var0);
      recovery$indy$67(var3, var2, new C_4753(recovery$indy$66(17902, 3828317645932166842L ^ var0), C_475D.class), -5390272442342005436L, var0);
      recovery$indy$69(var3, var2, new C_4753(recovery$indy$68(6985, 3449823394399395851L ^ var0), C_479X.class), -5390272442342005436L, var0);
      recovery$indy$71(var3, var2, new C_4753(recovery$indy$70(23938, 7183648409717466867L ^ var0), C_47Uv.class), -5390272442342005436L, var0);
      recovery$indy$73(var3, var2, new C_4753(recovery$indy$72(25880, 8763765522979282542L ^ var0), C_47zv.class), -5390272442342005436L, var0);
      recovery$indy$75(var3, var2, new C_4753(recovery$indy$74(6690, 1339821305896575268L ^ var0), C_48n.class), -5390272442342005436L, var0);
      recovery$indy$77(var3, var2, new C_4753(recovery$indy$76(28075, 3412519806753953527L ^ var0), C_47Vl.class), -5390272442342005436L, var0);
      recovery$indy$79(var3, var2, new C_4753(recovery$indy$78(15530, 7970292787104155609L ^ var0), C_471u.class), -5390272442342005436L, var0);
      recovery$indy$81(var3, var2, new C_4753(recovery$indy$80(30677, 6972019660911201508L ^ var0), C_47Xn.class), -5390272442342005436L, var0);
      recovery$indy$83(var3, var2, new C_4753(recovery$indy$82(25729, 2446637571938639795L ^ var0), C_47RC.class), -5390272442342005436L, var0);
      recovery$indy$85(var3, var2, new C_4753(recovery$indy$84(25565, 7257216037604055241L ^ var0), C_47rc.class), -5390272442342005436L, var0);
      recovery$indy$87(var3, var2, new C_4753(recovery$indy$86(3673, 2046173264493032818L ^ var0), C_45M.class), -5390272442342005436L, var0);
      recovery$indy$89(var3, var2, new C_4753(recovery$indy$88(2398, 3138050470546485765L ^ var0), C_47PM.class), -5390272442342005436L, var0);
      recovery$indy$91(var3, var2, new C_4753(recovery$indy$90(29536, 5750449678385465355L ^ var0), C_42L.class), -5390272442342005436L, var0);
      recovery$indy$93(var3, var2, new C_4753(recovery$indy$92(16573, 4222800629895068656L ^ var0), C_47KJ.class), -5390272442342005436L, var0);
      recovery$indy$95(var3, var2, new C_4753(recovery$indy$94(17933, 5347594356244577640L ^ var0), C_477Q.class), -5390272442342005436L, var0);
      recovery$indy$97(var3, var2, new C_4753(recovery$indy$96(831, 3556594708808218736L ^ var0), C_46o.class), -5390272442342005436L, var0);
      recovery$indy$99(var3, var2, new C_4753(recovery$indy$98(5764, 1445191860885433815L ^ var0), C_47KH.class), -5390272442342005436L, var0);
      recovery$indy$101(var3, var2, new C_4753(recovery$indy$100(23534, 7876954995896639500L ^ var0), C_47xm.class), -5390272442342005436L, var0);
      recovery$indy$103(var3, var2, new C_4753(recovery$indy$102(741, 8513164618287331714L ^ var0), C_47zs.class), -5390272442342005436L, var0);
      recovery$indy$105(var3, var2, new C_4753(recovery$indy$104(193, 4184031147842780137L ^ var0), C_47sY.class), -5390272442342005436L, var0);
      recovery$indy$107(var3, var2, new C_4753(recovery$indy$106(509, 347440055915100889L ^ var0), C_477I.class), -5390272442342005436L, var0);
      recovery$indy$109(var3, var2, new C_4753(recovery$indy$108(15489, 7748326202832291789L ^ var0), C_475b.class), -5390272442342005436L, var0);
      recovery$indy$111(var3, var2, new C_4753(recovery$indy$110(6302, 6298722179112674181L ^ var0), C_47c3.class), -5390272442342005436L, var0);
      recovery$indy$113(var3, var2, new C_4753(recovery$indy$112(16847, 6651266071360174752L ^ var0), C_47qi.class), -5390272442342005436L, var0);
      recovery$indy$115(var3, var2, new C_4753(recovery$indy$114(20493, 3011024986935094124L ^ var0), C_4742.class), -5390272442342005436L, var0);
      recovery$indy$117(var3, var2, new C_4753(recovery$indy$116(27998, 6959477093247374961L ^ var0), C_47q4.class), -5390272442342005436L, var0);
      recovery$indy$119(var3, var2, new C_4753(recovery$indy$118(30449, 3681717470340074907L ^ var0), C_47Iz.class), -5390272442342005436L, var0);
      recovery$indy$121(var3, var2, new C_4753(recovery$indy$120(11921, 2249648872407078296L ^ var0), C_47tl.class), -5390272442342005436L, var0);
      recovery$indy$123(var3, var2, new C_4753(recovery$indy$122(12186, 9048104103872468116L ^ var0), C_47oN.class), -5390272442342005436L, var0);
      recovery$indy$125(var3, var2, new C_4753(recovery$indy$124(848, 8482232822382016572L ^ var0), C_47AO.class), -5390272442342005436L, var0);
      recovery$indy$127(var3, var2, new C_4753(recovery$indy$126(26844, 2300333057834177484L ^ var0), C_47mT.class), -5390272442342005436L, var0);
      recovery$indy$129(var3, var2, new C_4753(recovery$indy$128(15795, 2937479699281086163L ^ var0), C_47Om.class), -5390272442342005436L, var0);
      recovery$indy$131(var3, var2, new C_4753(recovery$indy$130(24324, 5599928035506775125L ^ var0), C_4775.class), -5390272442342005436L, var0);
      recovery$indy$133(var3, var2, new C_4753(recovery$indy$132(1701, 8679118490654752128L ^ var0), C_47RG.class), -5390272442342005436L, var0);
      recovery$indy$135(var3, var2, new C_4753(recovery$indy$134(26385, 5978835322478910536L ^ var0), C_46E.class), -5390272442342005436L, var0);
      recovery$indy$137(var3, var2, new C_4753(recovery$indy$136(31800, 2377035530336847676L ^ var0), C_44B.class), -5390272442342005436L, var0);
      recovery$indy$139(var3, var2, new C_4753(recovery$indy$138(28757, 8431908417534872341L ^ var0), C_47BC.class), -5390272442342005436L, var0);
      recovery$indy$141(var3, var2, new C_4753(recovery$indy$140(7412, 8279642806939363244L ^ var0), C_47MM.class), -5390272442342005436L, var0);
      recovery$indy$143(var3, var2, new C_4753(recovery$indy$142(10911, 5845829795394785718L ^ var0), C_471o.class), -5390272442342005436L, var0);
      recovery$indy$145(var3, var2, new C_4753(recovery$indy$144(11371, 8937092965742843665L ^ var0), C_47hw.class), -5390272442342005436L, var0);
      recovery$indy$147(var3, var2, new C_4753(recovery$indy$146(23805, 8791698694585280502L ^ var0), C_46N.class), -5390272442342005436L, var0);
      recovery$indy$149(var3, var2, new C_4753(recovery$indy$148(14049, 3571782416552824211L ^ var0), C_47uV.class), -5390272442342005436L, var0);
      recovery$indy$151(var3, var2, new C_4753(recovery$indy$150(5144, 3444389915066019835L ^ var0), C_47Ut.class), -5390272442342005436L, var0);
      recovery$indy$153(var3, var2, new C_4753(recovery$indy$152(19942, 1455340917530949312L ^ var0), C_472.class), -5390272442342005436L, var0);
      recovery$indy$155(var3, var2, new C_4753(recovery$indy$154(25552, 1630142499186465015L ^ var0), C_42E.class), -5390272442342005436L, var0);
      recovery$indy$157(var3, var2, new C_4753(recovery$indy$156(26244, 7118517552295009719L ^ var0), C_47TZ.class), -5390272442342005436L, var0);
      recovery$indy$159(var3, var2, new C_4753(recovery$indy$158(22235, 9126379583718616537L ^ var0), C_47IG.class), -5390272442342005436L, var0);
   }











   public boolean method_46$219b97e346(C_473U var1, char var2, long var3) {
      boolean var10000;
      long var5;
      String var7;
      Object var9;
      label109: {
         label97: {
            label98: {
               var5 = ((long)var2 << 48 | var3 << 16 >>> 16) ^ a;
               var7 = recovery$indy$160(-1343728777109698767L, var5);
               var10000 = recovery$indy$161(this.settingPingFix, -1344443295535572939L, var5);
               if (var7 == null) {
                  if (!var10000) {
                     var10000 = (Boolean)this.field_41C.get(0);
                     if (var7 != null) {
                        break label97;
                     }

                     if (!var10000) {
                        break label98;
                     }
                  }

                  var10000 = var1 instanceof C_434;
               }

               if (var7 != null) {
                  break label97;
               }

               if (var10000) {
                  return false;
               }
            }

            var9 = this.settingRealTimeDamage;
            if (var7 != null) {
               break label109;
            }

            var10000 = recovery$indy$162(this.settingRealTimeDamage, -1344443295535572939L, var5);
         }

         if (var10000) {
            boolean var10 = var1 instanceof C_47nD;
            if (var7 != null) {
               return var10;
            }

            if (var10) {
               return false;
            }

            var10 = var1 instanceof C_47bo;
            if (var7 != null) {
               return var10;
            }

            if (var10) {
               return false;
            }

            var9 = var1;
            if (var7 != null) {
               break label109;
            }

            if (var1 instanceof C_477Q) {
               return false;
            }
         }

         var9 = field_41a.get(var1.getClass());
      }

      C_4753 var8 = (C_4753)var9;
      C_4753 var11 = var8;
      if (var7 == null) {
         if (var8 == null) {
            return var1 instanceof C_47vS;
         }

         var11 = var8;
      }

      return recovery$indy$163(var11, -1344338152949112083L, var5);
   }



    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private static void method_42$c30f2b6ea1(long var0, Map var2) {
      var0 = a ^ var0;
      long var3 = var0 ^ 79255673679415L;
      recovery$indy$165(var3, var2, new C_4753(recovery$indy$164(27568, 6109971927227709448L ^ var0), C_47o4.class), -2458773464060211819L, var0);
      recovery$indy$167(var3, var2, new C_4753(recovery$indy$166(6157, 2836316759569451999L ^ var0), C_471V.class), -2458773464060211819L, var0);
      recovery$indy$169(var3, var2, new C_4753(recovery$indy$168(6543, 3803060968336050713L ^ var0), C_47WF.class), -2458773464060211819L, var0);
      recovery$indy$171(var3, var2, new C_4753(recovery$indy$170(1291, 1303781688655435460L ^ var0), C_479E.class), -2458773464060211819L, var0);
      recovery$indy$173(var3, var2, new C_4753(recovery$indy$172(24397, 1357613189308648676L ^ var0), C_479J.class), -2458773464060211819L, var0);
      recovery$indy$175(var3, var2, new C_4753(recovery$indy$174(23726, 518511218431725438L ^ var0), C_479N.class), -2458773464060211819L, var0);
      recovery$indy$177(var3, var2, new C_4753(recovery$indy$176(26224, 8186443599409526203L ^ var0), C_479m.class), -2458773464060211819L, var0);
      recovery$indy$179(var3, var2, new C_4753(recovery$indy$178(21711, 7725482444051187581L ^ var0), C_45J.class), -2458773464060211819L, var0);
      recovery$indy$181(var3, var2, new C_4753(recovery$indy$180(15941, 6811702008297516474L ^ var0), C_42V.class), -2458773464060211819L, var0);
      recovery$indy$183(var3, var2, new C_4753(recovery$indy$182(20026, 4633382113131077091L ^ var0), C_477Y.class), -2458773464060211819L, var0);
      recovery$indy$185(var3, var2, new C_4753(recovery$indy$184(2243, 4055515133744110445L ^ var0), C_47bi.class), -2458773464060211819L, var0);
      recovery$indy$187(var3, var2, new C_4753(recovery$indy$186(14738, 2447361777109723702L ^ var0), C_45W.class), -2458773464060211819L, var0);
      recovery$indy$189(var3, var2, new C_4753(recovery$indy$188(7580, 472612829173960303L ^ var0), C_47MN.class), -2458773464060211819L, var0);
      recovery$indy$191(var3, var2, new C_4753(recovery$indy$190(8369, 2076075665607652187L ^ var0), C_47dz.class), -2458773464060211819L, var0);
      recovery$indy$193(var3, var2, new C_4753(recovery$indy$192(13388, 8655564654895556484L ^ var0), C_47Is.class), -2458773464060211819L, var0);
      recovery$indy$195(var3, var2, new C_4753(recovery$indy$194(5899, 7433152148773160186L ^ var0), C_47Al.class), -2458773464060211819L, var0);
      recovery$indy$197(var3, var2, new C_4753(recovery$indy$196(2879, 907336747164784825L ^ var0), C_47vh.class), -2458773464060211819L, var0);
      recovery$indy$199(var3, var2, new C_4753(recovery$indy$198(18271, 7313481466479121553L ^ var0), C_42k.class), -2458773464060211819L, var0);
      recovery$indy$201(var3, var2, new C_4753(recovery$indy$200(27501, 4880231239773993169L ^ var0), C_47et.class), -2458773464060211819L, var0);
      recovery$indy$203(var3, var2, new C_4753(recovery$indy$202(10177, 4382893919962231854L ^ var0), C_47y.class), -2458773464060211819L, var0);
      recovery$indy$205(var3, var2, new C_4753(recovery$indy$204(10863, 66850587097889252L ^ var0), C_47oy.class), -2458773464060211819L, var0);
      recovery$indy$207(var3, var2, new C_4753(recovery$indy$206(13424, 962231938928732120L ^ var0), C_476Q.class), -2458773464060211819L, var0);
      recovery$indy$209(var3, var2, new C_4753(recovery$indy$208(662, 7292938141298315595L ^ var0), C_47jt.class), -2458773464060211819L, var0);
      recovery$indy$211(var3, var2, new C_4753(recovery$indy$210(14197, 3210218335441740952L ^ var0), C_47PU.class), -2458773464060211819L, var0);
      recovery$indy$213(var3, var2, new C_4753(recovery$indy$212(26065, 1786845870515926602L ^ var0), C_47dU.class), -2458773464060211819L, var0);
      recovery$indy$215(var3, var2, new C_4753(recovery$indy$214(13077, 5992905254009987304L ^ var0), C_47Md.class), -2458773464060211819L, var0);
      recovery$indy$217(var3, var2, new C_4753(recovery$indy$216(8930, 7818500868561957174L ^ var0), C_476l.class), -2458773464060211819L, var0);
      recovery$indy$219(var3, var2, new C_4753(recovery$indy$218(2316, 1395538003596794537L ^ var0), C_46d.class), -2458773464060211819L, var0);
   }






   public void method_42$c8cab2e7ea(double var1, EntityLivingBase var3, long var4) {
      java.lang.String var23;
      var4 = a ^ var4;
      long var6 = var4 ^ 138896145795880L;
      long var8 = var4 ^ 44239077114047L;
      long var10 = var4 ^ 80073725843267L;
      String var12 = recovery$indy$220(7683250460327772363L, var4);
      if (!this.field_48.isEmpty() && var3 != null && recovery$indy$221(field_43, 7685046288906082734L, var4) != null) {
         LinkedBlockingQueue var13 = Queues.newLinkedBlockingQueue();
         C_47tf var14 = recovery$indy$222(field_43, 7685046288906082734L, var4).method_49$41b79b67a0(1.0F);
         Iterator var15 = this.field_48.iterator();

         while (true) {
            int var10000 = (int) ((var15.hasNext()) ? 1 : 0);

            label92:
            while (true) {
               if ((var10000) != 0) {
                  C_473U var16 = (C_473U)var15.next();
                  C_47tf var17 = recovery$indy$223(this, var16, var10, var3, 7685014709092885450L, var4);
                  C_47tf var21 = var17;
                  if (var12 == null) {
                     if (var17 == null) {
                        var10000 = (int) ((var13.add(var16)) ? 1 : 0);
                        if (var4 < 0L) {
                           continue;
                        }

                        if (var12 == null) {
                           break;
                        }
                     }

                     var21 = recovery$indy$225(var14, recovery$indy$224(var3, var8, var17, 7684087766074805943L, var4), 7683997344014805949L, var4);
                  }

                  label103: {
                     C_47tf var18 = var21;
                     double var24;
                     var10000 = (var24 = var14.method_43$3d77d36e13(var18) - var1) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
                     if (var12 == null) {
                        if (var10000 >= 0) {
                           return;
                        }

                        var10000 = (int) ((var13.isEmpty()) ? 1 : 0);
                     }

                     while (true) {
                        if (var10000 != 0) {
                           recovery$indy$227(this, var16, var6, 7685158102214056569L, var4);
                           var10000 = (int) ((this.field_48.remove(var16)) ? 1 : 0);
                           if (var4 < 0L) {
                              continue label92;
                           }
                           break;
                        }

                        C_473U var19 = (C_473U)var13.poll();
                        recovery$indy$226(this, var19, var6, 7685158102214056569L, var4);
                        this.field_48.remove(var19);
                        var23 = var12;
                        if (var4 < 0L) {
                           break label103;
                        }

                        if (var12 != null) {
                           break;
                        }

                        if (var12 != null) {
                           recovery$indy$227(this, var16, var6, 7685158102214056569L, var4);
                           var10000 = (int) ((this.field_48.remove(var16)) ? 1 : 0);
                           if (var4 < 0L) {
                              continue label92;
                           }
                           break;
                        }

                        var10000 = (int) ((var13.isEmpty()) ? 1 : 0);
                     }

                     var23 = var12;
                  }

                  if (var4 >= 0L) {
                     if (var23 != null) {
                        return;
                     }

                     var23 = var12;
                  }

                  if (var23 == null) {
                     break;
                  }
               }

               if (var4 >= 0L) {
                  return;
               }
               break;
            }
         }
      }
   }




    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$ebb0434f64(int var1, short var2, short var3, C_47zh var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 94594678097945L;
      C_473U var10 = recovery$indy$228(var4, 7261747031716121079L, var5);
      String var10000 = recovery$indy$229(7261065494141177519L, var5);
      this.field_48.add(var10);
      String var9 = var10000;
      PacketHandler_47Cq var11 = this;
      if (var9 == null) {
         this.field_46.put(var10, System.currentTimeMillis());
         if (!(var10 instanceof C_47FQ)) {
            return;
         }

         var11 = this;
      }

      recovery$indy$230(var11, var7, 7261591383934082337L, var5);
   }



   public boolean method_41$ac970f20b2(C_473U var1, long var2) {
      var2 = a ^ var2;
      String var4 = recovery$indy$231(-984863871366064066L, var2);
      Object var10000 = var1;
      if (var4 == null) {
         boolean var7 = var1 instanceof C_47FQ;
         if (var2 < 0L) {
            return var7;
         }

         if (var7) {
            return true;
         }

         var10000 = field_44.get(var1.getClass());
      }

      C_4753 var5 = (C_4753)var10000;
      C_4753 var8 = var5;
      if (var4 == null) {
         if (var5 == null) {
            return var1 instanceof C_47vS;
         }

         var8 = var5;
      }

      return recovery$indy$232(var8, -983788168379449886L, var2);
   }



    public void method_40$20513e4323(java.util.Queue destination, long eventKey, java.util.concurrent.locks.ReentrantReadWriteLock packetLock) {
        long decodedKey = recovery$indy$flow$625() ^ eventKey;
        Object flowGuard = recovery$indy$flow$626(-8568585015469513859L, decodedKey);
        Object writeLock = recovery$indy$flow$627(packetLock);
        recovery$indy$flow$628(writeLock);
        drainQueue:
        while (true) {
            Object pendingPacket;
            if (recovery$indy$flow$630(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_42)))) {
                pendingPacket = recovery$indy$flow$638(packetLock);
                if (decodedKey > 0L) {
                    recovery$indy$flow$639(pendingPacket);
                    return;
                }
            } else {
                pendingPacket = recovery$indy$flow$632(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_42)));
            }
            while (true) {
                Object queuedPacket = ((java.lang.Object)(((net.C_47P) (((java.lang.Object)(pendingPacket))))));
                Object packet = recovery$indy$flow$634(queuedPacket);
                recovery$indy$flow$635(destination, queuedPacket);
                recovery$indy$flow$637(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_45)), packet);
                if (decodedKey > 0L && flowGuard != null) {
                    return;
                }
                if (flowGuard == null) {
                    continue drainQueue;
                }
                pendingPacket = recovery$indy$flow$638(packetLock);
            }
        }
    }



   public void method_40$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 14520409865171L;
      String var5 = recovery$indy$234(1899130297363001392L, var1);

      label32:
      while (true) {
         int var62 = ((int) (this.field_48.isEmpty() ? 1 : 0));
         if (!(var62 != 0)) {
            recovery$indy$235(this, (net.C_473U)this.field_48.poll(), var3, 1899492047511775874L, var1);

            do {
               String var66 = var5;
               if (var66 == null) {
                  continue label32;
               }

               long var68;
               var62 = (var68 = var1 - 0L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
            } while (var62 <= 0);

            return;
         } else {
            while (true) {
               long var69;
               var62 = (var69 = var1 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
               if (var62 > 0) {
                  return;
               }

               String var65 = var5;
               if (var65 == null) {
                  break;
               }
            }
         }
      }
   }



    public boolean method_40$ac970f20b2(C_473U c_473U, long l) {
        block12: {
            C_4753 c_4753;
            block11: {
                C_4753 c_47532;
                Object object;
                String string;
                block9: {
                    block10: {
                        boolean bl;
                        block7: {
                            block8: {
                                l = a ^ l;
                                string = PacketHandler_47Cq.recovery$indy$236(-3604455751284414575L, l);
                                bl = PacketHandler_47Cq.recovery$indy$237(this.settingPingFix, -3605157139962759019L, l);
                                if (string != null) break block7;
                                if (bl) break block8;
                                object = (Boolean)this.field_41C.get(0);
                                if (string != null) break block9;
                                if (!((Boolean)object).booleanValue()) break block10;
                            }
                            object = c_473U;
                            if (string != null) break block9;
                            bl = object instanceof C_47o4;
                        }
                        if (bl) {
                            return false;
                        }
                    }
                    object = field_40.get(c_473U.getClass());
                }
                c_4753 = c_47532 = (C_4753)object;
                if (string != null) break block11;
                if (c_4753 == null) break block12;
                c_4753 = c_47532;
            }
            return PacketHandler_47Cq.recovery$indy$238(c_4753, -3605262558165302707L, l);
        }
        return c_473U instanceof C_47vS;
    }



   private int method_40$dea94fbd5c(long var1, C_473U var3) {
      var1 = a ^ var1;
      String var4 = recovery$indy$239(839097027401212366L, var1);
      byte var10000 = (byte) ((var3 instanceof C_4766) ? 1 : 0);
      if (var4 == null) {
         if (var10000 != 0) {
            C_4766 var7 = (C_4766)var3;
            return var7.method_45$8abf5c6871();
         }

         var10000 = (byte) ((var3 instanceof C_47IW) ? 1 : 0);
      }

      if (var4 == null) {
         if (var10000 != 0) {
            C_47IW var5 = (C_47IW)var3;
            return var5.method_42$8abf5c6871();
         }

         var10000 = -1;
      }

      return var10000;
   }



    public boolean method_44$ac970f20b2(net.C_473U packet, long callerKey) {
        long key = recovery$indy$flow$671() ^ callerKey;
        long settingKey = key ^ 63511803335535L;
        Object guard = recovery$indy$flow$672(-2985550866966823686L, key);
        Object mode = recovery$indy$flow$676(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(recovery$indy$flow$673())))).field_489)))))).settingMacroDelayModes)), settingKey, -2984401434099196338L, key);
        Object excludedMode = recovery$indy$flow$677(13425, 6445953452383464647L ^ key);
        boolean modeMatches = recovery$indy$flow$678(mode, excludedMode);
        boolean selected = guard == null ? !modeMatches : modeMatches;
        boolean resetsCounter = recovery$indy$flow$679(packet);
        if (guard != null) {
            if (selected) return false;
            Object player = recovery$indy$flow$700(recovery$indy$flow$699(), -2983751052139240033L, key);
            return (recovery$indy$flow$703(player) & 1) != 0;
        }
        if (resetsCounter) {
            recovery$indy$flow$681(this, recovery$indy$flow$680(this) + 1);
            int packetCount = recovery$indy$flow$682(this);
            if (key < 0L) {
                resetsCounter = packetCount != 0;
            } else {
                if (packetCount >= 2) selected = true;
                resetsCounter = recovery$indy$flow$683(packet);
            }
        } else {
            resetsCounter = recovery$indy$flow$683(packet);
        }
        if (key >= 0L && !resetsCounter) resetsCounter = recovery$indy$flow$684(packet);
        if (resetsCounter) recovery$indy$flow$685(this, 0);
        Object historyEntry = ((java.lang.Object)(((java.lang.Boolean) (((java.lang.Object)(recovery$indy$flow$687(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_41C)), 0)))))));
        boolean alreadyHandled = recovery$indy$flow$689(historyEntry);
        boolean eligible;
        if (key > 0L) {
            if (!selected || alreadyHandled) return false;
            eligible = recovery$indy$flow$690(packet);
        } else {
            eligible = selected;
        }
        if (!eligible) {
            eligible = recovery$indy$flow$691(packet);
            if (!eligible) eligible = recovery$indy$flow$692(packet);
            if (!eligible) return false;
        }
        Object activeMode = recovery$indy$flow$696(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(recovery$indy$flow$693())))).field_489)))))).settingMacroDelayModes)), settingKey, -2984401434099196338L, key);
        Object bypassMode = recovery$indy$flow$697(28293, 7367736038483703378L ^ key);
        if (recovery$indy$flow$698(activeMode, bypassMode)) return false;
        Object player = recovery$indy$flow$700(recovery$indy$flow$699(), -2983751052139240033L, key);
        if (player == null) return false;
        Object currentPlayer = recovery$indy$flow$702(recovery$indy$flow$701(), -2983751052139240033L, key);
        return recovery$indy$flow$703(currentPlayer) > 5;
    }




   private static void method_44$f506a9a4b6(long var0, Map var2, C_4753 var3) {
      var0 = a ^ var0;
      var2.put(recovery$indy$247(var3, -8840499796792974113L, var0), var3);
   }



   public synchronized void method_48$f633c984d8(boolean var1) {
      this.field_43a = var1;
   }



    public void method_48$272a764f0e(long callerKey, net.C_47zh network, int delayMillis) {
        long key = recovery$indy$flow$708() ^ callerKey;
        Object guard = recovery$indy$flow$709(4761245696556050552L, key);
        if (recovery$indy$flow$711(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_42)))) return;
        long now = recovery$indy$flow$712();
        Object writeLock = recovery$indy$flow$714(recovery$indy$flow$713(network, 4761552184717557802L, key));
        recovery$indy$flow$715(writeLock);
        Object iterator = recovery$indy$flow$717(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_42)));
        Object pendingPacket = null;
        boolean pendingFromUnlock = false;
        boolean advanceWithoutHasNext = false;
        while (true) {
            while (true) {
                if (pendingFromUnlock) {
                    pendingFromUnlock = false;
                } else {
                    if (!advanceWithoutHasNext && !recovery$indy$flow$718(iterator)) break;
                    advanceWithoutHasNext = false;
                    pendingPacket = ((java.lang.Object)(((net.C_47P) (((java.lang.Object)(recovery$indy$flow$719(iterator)))))));
                }
                if (guard != null) return;
                if (pendingPacket == null) {
                    boolean removed = recovery$indy$flow$722(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_42)), null);
                    if (key <= 0L) {
                        if (!removed) break;
                        advanceWithoutHasNext = true;
                    }
                    continue;
                }
                Object packet = recovery$indy$flow$723(pendingPacket);
                if (packet == null) {
                    recovery$indy$flow$725(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_45)), null);
                    if (key > 0L) {
                        recovery$indy$flow$727(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_42)), pendingPacket);
                        continue;
                    }
                }
                Object timestamp = ((java.lang.Object)(((java.lang.Long) (((java.lang.Object)(recovery$indy$flow$729(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_45)), packet)))))));
                if (key <= 0L) continue;
                if (timestamp == null) {
                    recovery$indy$flow$732(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_45)), null);
                    recovery$indy$flow$734(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_42)), pendingPacket);
                    continue;
                }
                if (now > recovery$indy$flow$735(timestamp) + (long) delayMillis) {
                    Object destination = recovery$indy$flow$736(network, 4761024392269639610L, key);
                    recovery$indy$flow$737(destination, pendingPacket);
                    recovery$indy$flow$739(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_45)), packet);
                    recovery$indy$flow$741(((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_42)), pendingPacket);
                }
            }
            Object finishingLock = recovery$indy$flow$743(recovery$indy$flow$742(network, 4761552184717557802L, key));
            if (key >= 0L) {
                recovery$indy$flow$744(finishingLock);
                return;
            }
            // A negative decoded key reuses this operand in the original guarded path.
            pendingPacket = ((java.lang.Object)(((net.C_47P) (((java.lang.Object)(finishingLock))))));
            pendingFromUnlock = true;
        }
    }




   private void method_48$fc136bb64a(C_473U var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 130904514045077L;
      String var6 = recovery$indy$252(-2950377116848276123L, var2);

      try {
         label21: {
            C_473U var10000 = var1;
            if (var6 == null) {
               if (var1 instanceof C_47vS) {
                  break label21;
               }

               var10000 = var1;
            }

            var10000.method_44$f0d6357a98(recovery$indy$253(field_43, -2951623026826079314L, var2).method_49$431840b606().method_45$43d93f0756());
            recovery$indy$254(this, var1, var4, -2950747889243066962L, var2);
         }
      } catch (Exception var8) {
      }

      this.field_46.remove(var1);
   }



   public boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      String var3 = recovery$indy$255(3050075428105994303L, var1);
      boolean var10000 = this.field_42.isEmpty();
      if (var3 == null) {
         var10000 = !var10000;
      }

      return var10000;
   }



   private static C_4753[] method_45$609314bd8b(int var0) {
      return new C_4753[var0];
   }



   private static void method_45$631790539f(C_473U var0) {
      long var1 = a ^ 99060538770944L;
      long var10000 = 8109993662282898151L;
      String var3 = C_47eb.method_48$0e30dfc966();
      long var10001 = 8109384667695092738L;
      Minecraft var6 = field_43;
      if (var6.field_44Q != null) {
         Entity var4;
         label26: {
            if (var0 instanceof C_4766) {
               var10001 = 8109384667695092738L;
               Minecraft var7 = field_43;
               var4 = var7.field_44Q.method_45$cf8871fa3f(((C_4766)var0).method_45$8abf5c6871());
               if (var3 == null) {
                  break label26;
               }
            }

            var10001 = 8109384667695092738L;
            Minecraft var8 = field_43;
            var4 = var8.field_44Q.method_45$cf8871fa3f(((C_47IW)var0).method_42$8abf5c6871());
         }

         Entity var9 = var4;
         if (var3 == null) {
            if (!(var4 instanceof EntityLivingBase)) {
               return;
            }

            var9 = var4;
         }

         EntityLivingBase var5 = (EntityLivingBase)var9;
         var5.field_43X.remove(var0);
      }
   }



    private static C_4753[] method_45$0421faf776(Map map) {
        return (C_4753[])Arrays.stream(map.values().toArray(new C_4753[0])).sorted(Comparator.comparing(PacketHandler_47Cq.recovery$indy$256())).toArray(PacketHandler_47Cq.recovery$indy$257());
    }



   public boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      String var3 = recovery$indy$258(-8308288141896292648L, var1);
      Minecraft var10000 = Minecraft.method_46$28f1e2a3f8();
      if (var3 == null) {
         if (var10000 == null) {
            return false;
         }

         var10000 = Minecraft.method_46$28f1e2a3f8();
      }

      if (var3 == null) {
         if (recovery$indy$259(var10000, -8307687947217147843L, var1) == null) {
            return false;
         }

         var10000 = Minecraft.method_46$28f1e2a3f8();
      }

      EntityPlayerSP var5 = recovery$indy$260(var10000, -8307557449922920515L, var1);
      if (var3 == null) {
         if (var5 == null) {
            return false;
         }

         var5 = recovery$indy$261(Minecraft.method_46$28f1e2a3f8(), -8307557449922920515L, var1);
      }

      return (boolean)(var3 != null ? var5.field_48y : var5.field_48y > 5);
   }



   public boolean method_47$ac970f20b2(C_473U var1, long var2) {
      var2 = a ^ var2;
      String var4 = recovery$indy$262(-1030409376444572712L, var2);
      C_4753 var5 = (C_4753)field_41.get(var1.getClass());
      C_4753 var10000 = var5;
      if (var4 == null) {
         if (var5 == null) {
            return var1 instanceof C_47vS;
         }

         var10000 = var5;
      }

      return recovery$indy$263(var10000, -1027191831263920636L, var2);
   }



    public void method_43$e781d6169a(net.C_47zh event, long eventKey) {
        long decodedKey = recovery$indy$flow$812() ^ eventKey;
        Object queuedPackets = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_42));
        recovery$indy$flow$814();
        Object packet = recovery$indy$flow$815(event, 9044016123097632947L, decodedKey);
        Object listeners = recovery$indy$flow$816(null);
        Object queuedPacket = recovery$indy$flow$817(packet, listeners);
        recovery$indy$flow$818(queuedPackets, queuedPacket);
        Object enqueueTimes = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_45));
        Object timestampKey = recovery$indy$flow$820(event, 9044016123097632947L, decodedKey);
        long enqueueTime = recovery$indy$flow$821();
        Object timestamp = recovery$indy$flow$822(enqueueTime);
        recovery$indy$flow$823(enqueueTimes, timestampKey, timestamp);
    }



   public synchronized boolean method_45S$aae029aa0a() {
      return this.field_43a;
   }



   public void method_43_$e45a9973e5(long var1) {
   }



   public boolean method_45_$aae029aa0a() {
      return this.field_43P;
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 50041642521527L;
      String var8 = recovery$indy$266(2183773145077052453L, var4);
      int var72 = recovery$indy$267(field_43, 2182263868141940032L, var4).field_48y % 20;
      if (var72 == 0) {
         java.util.concurrent.CopyOnWriteArrayList var81;
         byte var88;
         int var93;
         label39: {
            label38: {
               label43: {
                  java.util.concurrent.CopyOnWriteArrayList var10000 = this.field_41C;
                  byte var10002 = ((byte) (recovery$indy$268(1, var6, 2183677148634473813L, var4) ? 1 : 0));
                  int var95 = var2;
                  String var36 = var8;
                  var93 = var10002;
                  var88 = 0;
                  var81 = var10000;
                  if (var95 >= 0) {
                     var36 = var36;
                     var93 = var93;
                     var88 = var88;
                     var81 = var81;
                     String var96 = var36;
                     var93 = var93;
                     var88 = var88;
                     var81 = var81;
                     if (var96 == null) {
                        var93 = var93;
                        var88 = var88;
                        var81 = var81;
                        var95 = var93;
                        var88 = var88;
                        var81 = var81;
                        if (var95 == 0) {
                           break label43;
                        }

                        var93 = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, 100);
                        var88 = var88;
                        var81 = var81;
                     }

                     var36 = var8;
                     var93 = var93;
                     var88 = var88;
                     var81 = var81;
                  }

                  String var98 = var36;
                  var93 = var93;
                  var88 = var88;
                  var81 = var81;
                  if (var98 != null) {
                     break label38;
                  }

                  byte var74 = 20;
                  var95 = var93;
                  var88 = var88;
                  var81 = var81;
                  if (var95 < var74) {
                     var88 = var88;
                     var81 = var81;
                     var93 = 1;
                     var88 = var88;
                     var81 = var81;
                     break label38;
                  }
               }

               var93 = 0;
               var88 = var88;
               var81 = var81;
               break label39;
            }

            var93 = var93;
            var88 = var88;
            var81 = var81;
         }

         var81.set(var88, Boolean.valueOf((var93 != 0)));
      }
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public PacketHandler_47Cq(long a0) {
        super((long) (((augustus.recovered.modules.latency.PacketHandler_47Cq.a ^ a0) ^ 138961429634707L)),(java.lang.String) ("PacketHandler"),(java.lang.String) ("PacketHandler"),((1) != 0),(java.awt.Color) (java.awt.Color.red),(client.module.Category) (client.module.Category.LATENCY));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.latency.PacketHandler_47Cq.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.latency.PacketHandler_47Cq.a ^ a0) ^ 91868916732853L) >>> 48));
        int constructorPart4 = (int) (((((augustus.recovered.modules.latency.PacketHandler_47Cq.a ^ a0) ^ 91868916732853L) << 16) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.latency.PacketHandler_47Cq.a ^ a0) ^ 91868916732853L) << 32) >>> 32));
        long constructorKey6 = ((augustus.recovered.modules.latency.PacketHandler_47Cq.a ^ a0) ^ 91393722397902L);
        long constructorKey7 = ((augustus.recovered.modules.latency.PacketHandler_47Cq.a ^ a0) ^ 2778813256414L);
        long constructorKey8 = ((augustus.recovered.modules.latency.PacketHandler_47Cq.a ^ a0) ^ 97265544939257L);
        long constructorKey9 = ((augustus.recovered.modules.latency.PacketHandler_47Cq.a ^ a0) ^ 41370192309572L);
        long constructorKey10 = ((augustus.recovered.modules.latency.PacketHandler_47Cq.a ^ a0) ^ 93113447033145L);
        long constructorKey11 = ((augustus.recovered.modules.latency.PacketHandler_47Cq.a ^ a0) ^ 73978752756731L);
        java.lang.Object initialValue12 = recovery$indy$flow$836();
        recovery$indy$flow$837(this, initialValue12);
        java.util.HashMap initialized13 = new java.util.HashMap();
        recovery$indy$flow$840(this, initialized13);
        java.util.HashMap initialized14 = new java.util.HashMap();
        recovery$indy$flow$843(this, initialized14);
        java.lang.Object initialValue15 = recovery$indy$flow$844();
        recovery$indy$flow$845(this, initialValue15);
        client.setting.BooleanSetting initialized16 = new client.setting.BooleanSetting(this, constructorKey9, "PingFix", false);
        recovery$indy$flow$848(this, initialized16);
        client.setting.SettingGroup initialized17 = new client.setting.SettingGroup(this, "Incoming", true, constructorKey6);
        recovery$indy$flow$851(this, initialized17);
        java.lang.Object initialValue18 = recovery$indy$flow$853(5);
        ((java.lang.Object[]) initialValue18)[0] = "None";
        ((java.lang.Object[]) initialValue18)[1] = "MacroDelay";
        ((java.lang.Object[]) initialValue18)[2] = "OtherMacroDelay";
        ((java.lang.Object[]) initialValue18)[3] = "ExperimentalMacroDelay";
        ((java.lang.Object[]) initialValue18)[4] = "Sandwich";
        java.lang.Object initialValue19 = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).settingIncoming));
        client.setting.ModeSetting initialized20 = new client.setting.ModeSetting(this, "MacroDelayModes", "None", (java.lang.String[]) (initialValue18), (client.setting.SettingGroup) (initialValue19), constructorKey11);
        recovery$indy$flow$856(this, initialized20);
        short converted21 = (short) (constructorPart3);
        char converted22 = (char) (constructorPart4);
        java.lang.Object initialValue23 = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).settingIncoming));
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, "RealTimeDamage", converted21, converted22, constructorPart5, true, (client.setting.SettingGroup) (initialValue23));
        recovery$indy$flow$860(this, initialized24);
        java.lang.Object initialValue25 = recovery$indy$flow$862(2);
        ((java.lang.Object[]) initialValue25)[0] = "Vanilla";
        ((java.lang.Object[]) initialValue25)[1] = "Tick";
        java.lang.Object initialValue26 = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).settingIncoming));
        client.setting.ModeSetting initialized27 = new client.setting.ModeSetting(this, "EventToHandlePacket", "Vanilla", (java.lang.String[]) (initialValue25), (client.setting.SettingGroup) (initialValue26), constructorKey11);
        recovery$indy$flow$865(this, initialized27);
        java.lang.Object initialValue28 = recovery$indy$flow$867();
        java.lang.Object initialValue29 = initialValue28;
        java.lang.Object initialValue30 = ((java.lang.Object)(((java.util.Map) (((java.lang.Object)(initialValue29))))));
        java.lang.Object initialValue31 = recovery$indy$flow$869(initialValue30);
        java.lang.Object initialValue32 = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).settingIncoming));
        client.setting.MultiSelectSetting initialized33 = new client.setting.MultiSelectSetting(this, "IncomingPacketsToDelay", constructorKey7, (net.C_47OZ[]) (initialValue31), (client.setting.SettingGroup) (initialValue32));
        long initialValue34 = constructorKey8;
        java.lang.String initialValue35 = "PacketsToDelay";
        client.setting.MultiSelectSetting initialValue36 = initialized33;
        java.lang.Object initialValue37 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue38 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue35))))));
        java.lang.Object initialValue39 = recovery$indy$flow$874(initialValue37, initialValue38, initialValue34);
        recovery$indy$flow$875(this, initialValue39);
        java.lang.Object initialValue40 = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).settingIncoming));
        client.setting.SettingGroup initialized41 = new client.setting.SettingGroup(constructorKey10, this, "AbortIncoming", (client.setting.SettingGroup) (initialValue40));
        recovery$indy$flow$879(this, initialized41);
        java.lang.Object initialValue42 = recovery$indy$flow$881();
        java.lang.Object initialValue43 = initialValue42;
        java.lang.Object initialValue44 = ((java.lang.Object)(((java.util.Map) (((java.lang.Object)(initialValue43))))));
        java.lang.Object initialValue45 = recovery$indy$flow$883(initialValue44);
        java.lang.Object initialValue46 = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).settingAbortIncoming));
        client.setting.MultiSelectSetting initialized47 = new client.setting.MultiSelectSetting(this, "IncomingPacketsToDelayAbort", constructorKey7, (net.C_47OZ[]) (initialValue45), (client.setting.SettingGroup) (initialValue46));
        long initialValue48 = constructorKey8;
        java.lang.String initialValue49 = "PacketsToAbortDelay";
        client.setting.MultiSelectSetting initialValue50 = initialized47;
        java.lang.Object initialValue51 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue50))))));
        java.lang.Object initialValue52 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue53 = recovery$indy$flow$888(initialValue51, initialValue52, initialValue48);
        recovery$indy$flow$889(this, initialValue53);
        client.setting.SettingGroup initialized54 = new client.setting.SettingGroup(this, "Outgoing", true, constructorKey6);
        recovery$indy$flow$892(this, initialized54);
        java.lang.Object initialValue55 = recovery$indy$flow$894();
        java.lang.Object initialValue56 = initialValue55;
        java.lang.Object initialValue57 = ((java.lang.Object)(((java.util.Map) (((java.lang.Object)(initialValue56))))));
        java.lang.Object initialValue58 = recovery$indy$flow$896(initialValue57);
        java.lang.Object initialValue59 = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).settingOutgoing));
        client.setting.MultiSelectSetting initialized60 = new client.setting.MultiSelectSetting(this, "OutGoingPacketsToDelay", constructorKey7, (net.C_47OZ[]) (initialValue58), (client.setting.SettingGroup) (initialValue59));
        long initialValue61 = constructorKey8;
        java.lang.String initialValue62 = "PacketsToDelay";
        client.setting.MultiSelectSetting initialValue63 = initialized60;
        java.lang.Object initialValue64 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue63))))));
        java.lang.Object initialValue65 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue62))))));
        java.lang.Object initialValue66 = recovery$indy$flow$901(initialValue64, initialValue65, initialValue61);
        recovery$indy$flow$902(this, initialValue66);
        java.lang.Object initialValue67 = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).settingOutgoing));
        client.setting.SettingGroup initialized68 = new client.setting.SettingGroup(constructorKey10, this, "AbortOutgoing", (client.setting.SettingGroup) (initialValue67));
        recovery$indy$flow$906(this, initialized68);
        java.lang.Object initialValue69 = recovery$indy$flow$908();
        java.lang.Object initialValue70 = initialValue69;
        java.lang.Object initialValue71 = ((java.lang.Object)(((java.util.Map) (((java.lang.Object)(initialValue70))))));
        java.lang.Object initialValue72 = recovery$indy$flow$910(initialValue71);
        java.lang.Object initialValue73 = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).settingAbortOutgoing));
        client.setting.MultiSelectSetting initialized74 = new client.setting.MultiSelectSetting(this, "OutGoingPacketsToDelayAbort", constructorKey7, (net.C_47OZ[]) (initialValue72), (client.setting.SettingGroup) (initialValue73));
        long initialValue75 = constructorKey8;
        java.lang.String initialValue76 = "PacketsToAbortDelay";
        client.setting.MultiSelectSetting initialValue77 = initialized74;
        java.lang.Object initialValue78 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue77))))));
        java.lang.Object initialValue79 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue76))))));
        java.lang.Object initialValue80 = recovery$indy$flow$915(initialValue78, initialValue79, initialValue75);
        recovery$indy$flow$916(this, initialValue80);
        recovery$indy$flow$917(this, false);
        java.util.concurrent.CopyOnWriteArrayList initialized81 = new java.util.concurrent.CopyOnWriteArrayList();
        recovery$indy$flow$920(this, initialized81);
        recovery$indy$flow$921(this, 2);
        java.lang.Object initialValue82 = recovery$indy$flow$922();
        recovery$indy$flow$923(initialValue82, 25, this, 2147483640);
        java.lang.Object initialValue83 = recovery$indy$flow$924();
        recovery$indy$flow$925(initialValue83, 40, this);
        java.lang.Object initialValue84 = ((java.lang.Object)(((augustus.recovered.modules.latency.PacketHandler_47Cq) (((java.lang.Object)(this)))).field_41C));
        java.lang.Object initialValue85 = recovery$indy$flow$927(false);
        boolean initialValue86 = recovery$indy$flow$928(initialValue84, initialValue85);
    }






    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$40(long a0,long a1);
    private static native boolean recovery$indy$flow$41(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$42(java.lang.Object a0,long a1,long a2);
    private static long recovery$indy$flow$625() {
        return augustus.recovered.modules.latency.PacketHandler_47Cq.a;
    }
    private static native java.lang.Object recovery$indy$flow$626(long a0,long a1);
    private static java.lang.Object recovery$indy$flow$627(java.lang.Object a0) {
        return ((java.util.concurrent.locks.ReentrantReadWriteLock) (a0)).writeLock();
    }
    private static void recovery$indy$flow$628(java.lang.Object a0) {
        ((java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) (a0)).lock();
        return;
    }

    private static boolean recovery$indy$flow$630(java.lang.Object a0) {
        return ((java.util.Queue) (a0)).isEmpty();
    }

    private static java.lang.Object recovery$indy$flow$632(java.lang.Object a0) {
        return ((java.util.Queue) (a0)).poll();
    }

    private static native java.lang.Object recovery$indy$flow$634(java.lang.Object a0);
    private static boolean recovery$indy$flow$635(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Queue) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$637(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).remove(a1);
    }
    private static java.lang.Object recovery$indy$flow$638(java.lang.Object a0) {
        return ((java.util.concurrent.locks.ReentrantReadWriteLock) (a0)).writeLock();
    }
    private static void recovery$indy$flow$639(java.lang.Object a0) {
        ((java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) (a0)).unlock();
        return;
    }
    private static long recovery$indy$flow$671() {
        return augustus.recovered.modules.latency.PacketHandler_47Cq.a;
    }
    private static native java.lang.Object recovery$indy$flow$672(long a0,long a1);
    private static java.lang.Object recovery$indy$flow$673() {
        return client.ClientGlobals.field_48;
    }


    private static native java.lang.Object recovery$indy$flow$676(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$677(int a0,long a1);
    private static boolean recovery$indy$flow$678(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static boolean recovery$indy$flow$679(java.lang.Object a0) {
        return (a0 instanceof net.C_47qi);
    }
    private static int recovery$indy$flow$680(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.PacketHandler_47Cq) (a0)).field_43y;
    }
    private static void recovery$indy$flow$681(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.PacketHandler_47Cq) (a0)).field_43y = a1;
        return;
    }
    private static int recovery$indy$flow$682(java.lang.Object a0) {
        return ((augustus.recovered.modules.latency.PacketHandler_47Cq) (a0)).field_43y;
    }
    private static boolean recovery$indy$flow$683(java.lang.Object a0) {
        return (a0 instanceof net.C_4766);
    }
    private static boolean recovery$indy$flow$684(java.lang.Object a0) {
        return (a0 instanceof net.C_47IW);
    }
    private static void recovery$indy$flow$685(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.PacketHandler_47Cq) (a0)).field_43y = a1;
        return;
    }

    private static java.lang.Object recovery$indy$flow$687(java.lang.Object a0,int a1) {
        return ((java.util.concurrent.CopyOnWriteArrayList) (a0)).get(a1);
    }

    private static boolean recovery$indy$flow$689(java.lang.Object a0) {
        return ((java.lang.Boolean) (a0)).booleanValue();
    }
    private static boolean recovery$indy$flow$690(java.lang.Object a0) {
        return (a0 instanceof net.C_47qi);
    }
    private static boolean recovery$indy$flow$691(java.lang.Object a0) {
        return (a0 instanceof net.C_434);
    }
    private static boolean recovery$indy$flow$692(java.lang.Object a0) {
        return (a0 instanceof net.C_47TZ);
    }
    private static java.lang.Object recovery$indy$flow$693() {
        return client.ClientGlobals.field_48;
    }


    private static native java.lang.Object recovery$indy$flow$696(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$697(int a0,long a1);
    private static boolean recovery$indy$flow$698(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static native java.lang.Object recovery$indy$flow$699();
    private static native java.lang.Object recovery$indy$flow$700(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$701();
    private static native java.lang.Object recovery$indy$flow$702(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$703(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static long recovery$indy$flow$708() {
        return augustus.recovered.modules.latency.PacketHandler_47Cq.a;
    }
    private static native java.lang.Object recovery$indy$flow$709(long a0,long a1);

    private static boolean recovery$indy$flow$711(java.lang.Object a0) {
        return ((java.util.Queue) (a0)).isEmpty();
    }
    private static long recovery$indy$flow$712() {
        return java.lang.System.currentTimeMillis();
    }
    private static native java.lang.Object recovery$indy$flow$713(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$714(java.lang.Object a0) {
        return ((java.util.concurrent.locks.ReentrantReadWriteLock) (a0)).writeLock();
    }
    private static void recovery$indy$flow$715(java.lang.Object a0) {
        ((java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) (a0)).lock();
        return;
    }

    private static java.lang.Object recovery$indy$flow$717(java.lang.Object a0) {
        return ((java.util.Queue) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$718(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$719(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }


    private static boolean recovery$indy$flow$722(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Queue) (a0)).remove(a1);
    }
    private static native java.lang.Object recovery$indy$flow$723(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$725(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).remove(a1);
    }

    private static boolean recovery$indy$flow$727(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Queue) (a0)).remove(a1);
    }

    private static java.lang.Object recovery$indy$flow$729(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).get(a1);
    }


    private static java.lang.Object recovery$indy$flow$732(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).remove(a1);
    }

    private static boolean recovery$indy$flow$734(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Queue) (a0)).remove(a1);
    }
    private static long recovery$indy$flow$735(java.lang.Object a0) {
        return ((java.lang.Long) (a0)).longValue();
    }
    private static native java.lang.Object recovery$indy$flow$736(java.lang.Object a0,long a1,long a2);
    private static boolean recovery$indy$flow$737(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Queue) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$739(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).remove(a1);
    }

    private static boolean recovery$indy$flow$741(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Queue) (a0)).remove(a1);
    }
    private static native java.lang.Object recovery$indy$flow$742(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$743(java.lang.Object a0) {
        return ((java.util.concurrent.locks.ReentrantReadWriteLock) (a0)).writeLock();
    }
    private static void recovery$indy$flow$744(java.lang.Object a0) {
        ((java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) (a0)).unlock();
        return;
    }
    private static long recovery$indy$flow$812() {
        return augustus.recovered.modules.latency.PacketHandler_47Cq.a;
    }

    private static native java.lang.Object recovery$indy$flow$814();
    private static native java.lang.Object recovery$indy$flow$815(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$816(java.lang.Object a0) {
        return ((io.netty.util.concurrent.GenericFutureListener[]) (a0));
    }
    private static native java.lang.Object recovery$indy$flow$817(java.lang.Object a0,java.lang.Object a1);
    private static boolean recovery$indy$flow$818(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Queue) (a0)).add(a1);
    }

    private static native java.lang.Object recovery$indy$flow$820(java.lang.Object a0,long a1,long a2);
    private static long recovery$indy$flow$821() {
        return java.lang.System.currentTimeMillis();
    }
    private static java.lang.Object recovery$indy$flow$822(long a0) {
        return java.lang.Long.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$823(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }
    private static native java.lang.Object recovery$indy$flow$836();
    private static void recovery$indy$flow$837(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.PacketHandler_47Cq) (a0)).field_48 = ((java.util.Queue) (a1));
        return;
    }
    private static native void recovery$indy$flow$840(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$843(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$844();
    private static void recovery$indy$flow$845(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.PacketHandler_47Cq) (a0)).field_42 = ((java.util.Queue) (a1));
        return;
    }
    private static native void recovery$indy$flow$848(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$851(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$853(int a0);

    private static native void recovery$indy$flow$856(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$860(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$862(int a0);

    private static native void recovery$indy$flow$865(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$867() {
        return augustus.recovered.modules.latency.PacketHandler_47Cq.field_41a;
    }

    private static native java.lang.Object recovery$indy$flow$869(java.lang.Object a0);



    private static native java.lang.Object recovery$indy$flow$874(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$875(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$879(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$881() {
        return augustus.recovered.modules.latency.PacketHandler_47Cq.field_44;
    }

    private static native java.lang.Object recovery$indy$flow$883(java.lang.Object a0);



    private static native java.lang.Object recovery$indy$flow$888(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$889(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$892(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$894() {
        return augustus.recovered.modules.latency.PacketHandler_47Cq.field_40;
    }

    private static native java.lang.Object recovery$indy$flow$896(java.lang.Object a0);



    private static native java.lang.Object recovery$indy$flow$901(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$902(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$906(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$908() {
        return augustus.recovered.modules.latency.PacketHandler_47Cq.field_41;
    }

    private static native java.lang.Object recovery$indy$flow$910(java.lang.Object a0);



    private static native java.lang.Object recovery$indy$flow$915(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$916(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$917(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.PacketHandler_47Cq) (a0)).field_43a = a1;
        return;
    }
    private static native void recovery$indy$flow$920(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$921(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.PacketHandler_47Cq) (a0)).field_43y = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$922();
    private static native void recovery$indy$flow$923(java.lang.Object a0,int a1,java.lang.Object a2,int a3);
    private static native java.lang.Object recovery$indy$flow$924();
    private static native void recovery$indy$flow$925(java.lang.Object a0,int a1,java.lang.Object a2);

    private static java.lang.Object recovery$indy$flow$927(boolean a0) {
        return java.lang.Boolean.valueOf(a0);
    }
    private static boolean recovery$indy$flow$928(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.concurrent.CopyOnWriteArrayList) (a0)).add(a1);
    }
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(long var0, long var2);
   private static native WorldClient recovery$indy$2(Object var0, long var1, long var3);
   private static native Runnable recovery$indy$3(C_473U var0);
   private static native String recovery$indy$4(long var0, long var2);
   private static native boolean recovery$indy$5(Object var0, Object var1, long var2, long var4, long var6);
   private static native void recovery$indy$6(Object var0, Object var1, long var2, long var4, long var6);
   private static native void recovery$indy$7(Object var0, Object var1, long var2, long var4, long var6);
   private static native int recovery$indy$8(Object var0, long var1, Object var3, long var4, long var6);
   private static native String recovery$indy$12(int var0, long var1);
   private static native void recovery$indy$13(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$14(int var0, long var1);
   private static native void recovery$indy$15(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$16(int var0, long var1);
   private static native void recovery$indy$17(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$18(int var0, long var1);
   private static native void recovery$indy$19(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$20(int var0, long var1);
   private static native void recovery$indy$21(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$22(int var0, long var1);
   private static native void recovery$indy$23(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$24(int var0, long var1);
   private static native void recovery$indy$25(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$26(int var0, long var1);
   private static native void recovery$indy$27(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$28(int var0, long var1);
   private static native void recovery$indy$29(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$30(int var0, long var1);
   private static native void recovery$indy$31(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$32(int var0, long var1);
   private static native void recovery$indy$33(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$34(int var0, long var1);
   private static native void recovery$indy$35(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$36(int var0, long var1);
   private static native void recovery$indy$37(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$38(int var0, long var1);
   private static native void recovery$indy$39(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$40(int var0, long var1);
   private static native void recovery$indy$41(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$42(int var0, long var1);
   private static native void recovery$indy$43(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$44(int var0, long var1);
   private static native void recovery$indy$45(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$46(int var0, long var1);
   private static native void recovery$indy$47(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$48(int var0, long var1);
   private static native void recovery$indy$49(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$50(int var0, long var1);
   private static native void recovery$indy$51(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$52(int var0, long var1);
   private static native void recovery$indy$53(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$54(int var0, long var1);
   private static native void recovery$indy$55(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$56(int var0, long var1);
   private static native void recovery$indy$57(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$58(int var0, long var1);
   private static native void recovery$indy$59(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$60(int var0, long var1);
   private static native void recovery$indy$61(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$62(int var0, long var1);
   private static native void recovery$indy$63(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$64(int var0, long var1);
   private static native void recovery$indy$65(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$66(int var0, long var1);
   private static native void recovery$indy$67(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$68(int var0, long var1);
   private static native void recovery$indy$69(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$70(int var0, long var1);
   private static native void recovery$indy$71(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$72(int var0, long var1);
   private static native void recovery$indy$73(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$74(int var0, long var1);
   private static native void recovery$indy$75(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$76(int var0, long var1);
   private static native void recovery$indy$77(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$78(int var0, long var1);
   private static native void recovery$indy$79(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$80(int var0, long var1);
   private static native void recovery$indy$81(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$82(int var0, long var1);
   private static native void recovery$indy$83(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$84(int var0, long var1);
   private static native void recovery$indy$85(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$86(int var0, long var1);
   private static native void recovery$indy$87(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$88(int var0, long var1);
   private static native void recovery$indy$89(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$90(int var0, long var1);
   private static native void recovery$indy$91(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$92(int var0, long var1);
   private static native void recovery$indy$93(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$94(int var0, long var1);
   private static native void recovery$indy$95(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$96(int var0, long var1);
   private static native void recovery$indy$97(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$98(int var0, long var1);
   private static native void recovery$indy$99(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$100(int var0, long var1);
   private static native void recovery$indy$101(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$102(int var0, long var1);
   private static native void recovery$indy$103(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$104(int var0, long var1);
   private static native void recovery$indy$105(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$106(int var0, long var1);
   private static native void recovery$indy$107(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$108(int var0, long var1);
   private static native void recovery$indy$109(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$110(int var0, long var1);
   private static native void recovery$indy$111(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$112(int var0, long var1);
   private static native void recovery$indy$113(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$114(int var0, long var1);
   private static native void recovery$indy$115(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$116(int var0, long var1);
   private static native void recovery$indy$117(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$118(int var0, long var1);
   private static native void recovery$indy$119(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$120(int var0, long var1);
   private static native void recovery$indy$121(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$122(int var0, long var1);
   private static native void recovery$indy$123(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$124(int var0, long var1);
   private static native void recovery$indy$125(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$126(int var0, long var1);
   private static native void recovery$indy$127(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$128(int var0, long var1);
   private static native void recovery$indy$129(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$130(int var0, long var1);
   private static native void recovery$indy$131(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$132(int var0, long var1);
   private static native void recovery$indy$133(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$134(int var0, long var1);
   private static native void recovery$indy$135(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$136(int var0, long var1);
   private static native void recovery$indy$137(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$138(int var0, long var1);
   private static native void recovery$indy$139(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$140(int var0, long var1);
   private static native void recovery$indy$141(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$142(int var0, long var1);
   private static native void recovery$indy$143(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$144(int var0, long var1);
   private static native void recovery$indy$145(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$146(int var0, long var1);
   private static native void recovery$indy$147(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$148(int var0, long var1);
   private static native void recovery$indy$149(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$150(int var0, long var1);
   private static native void recovery$indy$151(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$152(int var0, long var1);
   private static native void recovery$indy$153(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$154(int var0, long var1);
   private static native void recovery$indy$155(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$156(int var0, long var1);
   private static native void recovery$indy$157(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$158(int var0, long var1);
   private static native void recovery$indy$159(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$160(long var0, long var2);
   private static native boolean recovery$indy$161(Object var0, long var1, long var3);
   private static native boolean recovery$indy$162(Object var0, long var1, long var3);
   private static native boolean recovery$indy$163(Object var0, long var1, long var3);
   private static native String recovery$indy$164(int var0, long var1);
   private static native void recovery$indy$165(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$166(int var0, long var1);
   private static native void recovery$indy$167(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$168(int var0, long var1);
   private static native void recovery$indy$169(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$170(int var0, long var1);
   private static native void recovery$indy$171(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$172(int var0, long var1);
   private static native void recovery$indy$173(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$174(int var0, long var1);
   private static native void recovery$indy$175(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$176(int var0, long var1);
   private static native void recovery$indy$177(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$178(int var0, long var1);
   private static native void recovery$indy$179(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$180(int var0, long var1);
   private static native void recovery$indy$181(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$182(int var0, long var1);
   private static native void recovery$indy$183(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$184(int var0, long var1);
   private static native void recovery$indy$185(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$186(int var0, long var1);
   private static native void recovery$indy$187(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$188(int var0, long var1);
   private static native void recovery$indy$189(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$190(int var0, long var1);
   private static native void recovery$indy$191(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$192(int var0, long var1);
   private static native void recovery$indy$193(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$194(int var0, long var1);
   private static native void recovery$indy$195(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$196(int var0, long var1);
   private static native void recovery$indy$197(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$198(int var0, long var1);
   private static native void recovery$indy$199(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$200(int var0, long var1);
   private static native void recovery$indy$201(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$202(int var0, long var1);
   private static native void recovery$indy$203(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$204(int var0, long var1);
   private static native void recovery$indy$205(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$206(int var0, long var1);
   private static native void recovery$indy$207(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$208(int var0, long var1);
   private static native void recovery$indy$209(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$210(int var0, long var1);
   private static native void recovery$indy$211(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$212(int var0, long var1);
   private static native void recovery$indy$213(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$214(int var0, long var1);
   private static native void recovery$indy$215(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$216(int var0, long var1);
   private static native void recovery$indy$217(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$218(int var0, long var1);
   private static native void recovery$indy$219(long var0, Object var2, Object var3, long var4, long var6);
   private static native String recovery$indy$220(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$221(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$222(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$223(Object var0, Object var1, long var2, Object var4, long var5, long var7);
   private static native C_478i recovery$indy$224(Object var0, long var1, Object var3, long var4, long var6);
   private static native C_47tf recovery$indy$225(Object var0, Object var1, long var2, long var4);
   private static native void recovery$indy$226(Object var0, Object var1, long var2, long var4, long var6);
   private static native void recovery$indy$227(Object var0, Object var1, long var2, long var4, long var6);
   private static native C_473U recovery$indy$228(Object var0, long var1, long var3);
   private static native String recovery$indy$229(long var0, long var2);
   private static native void recovery$indy$230(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$231(long var0, long var2);
   private static native boolean recovery$indy$232(Object var0, long var1, long var3);
   private static native String recovery$indy$234(long var0, long var2);
   private static native void recovery$indy$235(Object var0, Object var1, long var2, long var4, long var6);
   private static native String recovery$indy$236(long var0, long var2);
   private static native boolean recovery$indy$237(Object var0, long var1, long var3);
   private static native boolean recovery$indy$238(Object var0, long var1, long var3);
   private static native String recovery$indy$239(long var0, long var2);
   private static native Class recovery$indy$247(Object var0, long var1, long var3);
   private static native String recovery$indy$252(long var0, long var2);
   private static native C_47K6 recovery$indy$253(Object var0, long var1, long var3);
   private static native void recovery$indy$254(Object var0, Object var1, long var2, long var4, long var6);
   private static native String recovery$indy$255(long var0, long var2);
   private static native Function recovery$indy$256();
   private static native IntFunction recovery$indy$257();
   private static native String recovery$indy$258(long var0, long var2);
   private static native WorldClient recovery$indy$259(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$260(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$261(Object var0, long var1, long var3);
   private static native String recovery$indy$262(long var0, long var2);
   private static native boolean recovery$indy$263(Object var0, long var1, long var3);
   private static native String recovery$indy$266(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$267(Object var0, long var1, long var3);
   private static native boolean recovery$indy$268(int var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$269();
}
