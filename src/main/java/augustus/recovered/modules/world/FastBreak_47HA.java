package augustus.recovered.modules.world;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40x;
import net.C_42R;
import net.C_43r;
import net.C_45J;
import net.C_45n;
import net.C_4715;
import net.C_473U;
import net.C_475y;
import net.C_478Q;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.setting.ModeSetting;
import net.C_47iC;
import net.C_47ob;
import net.minecraft.util.ResourceLocation;
import net.C_47rf;
import net.C_47s7;
import client.module.Category;
import net.C_4f;

public class FastBreak_47HA extends Module implements C_47iC {
   public final BooleanSetting settingNoBlockHitDelay;
   public final BooleanSetting settingIgnoreMiningFatigue;
   public final BooleanSetting settingOnlyWhenBlink;
   public final BooleanSetting settingIgnoreBeds;
   public final BooleanSetting settingDebugBreakSpeed;
   private final ModeSetting settingMode;
   private final SettingGroup settingSimpleSettings;
   private final BooleanSetting settingCustomInAirMultiplier;
   private final NumberSetting settingInAirMultiplier;
   private final NumberSetting settingMultiplier;
   private final NumberSetting settingArtificialMiningSpeedEffect;
   private final BooleanSetting settingInstant;
   private BooleanSetting settingDedicatedItemHandling;
   private SettingGroup settingDedicatedItems;
   private final HashMap field_45;
   private final HashMap field_49;
   private boolean field_43a;
   private static final long a = C_4f.a(-2398637673230228435L, 3051758709181493413L, MethodHandles.lookup().lookupClass()).a(205627887986921L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[55];
   private static final String[] f = new String[55];

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private C_43r method_46$9d67853674(long var1) {
      var1 = a ^ var1;
      Setting[] var3 = recovery$indy$1(-2527768391086820856L, var1);
      C_47rf var4 = recovery$indy$2(field_43, -2527874753554673301L, var1).method_48$ac4db64966();
      C_47rf var10000 = var4;
      if (var3 == null) {
         if (var4 == null) {
            return null;
         }

         var10000 = var4;
      }

      return var10000.method_48$dbd570a038();
   }

   private C_4715 method_46$1c82d0468a(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 2761918035035L;
      Setting[] var5 = recovery$indy$3(-5034529369104821054L, var1);
      C_43r var6 = recovery$indy$4(this, var3, -5033022600226412176L, var1);
      Object var10000 = var6;
      if (var5 == null) {
         if (var6 == null) {
            return null;
         }

         var10000 = this.field_49.get(var6);
      }

      return (C_4715)var10000;
   }

   static void method_46$be15feed3d(long var0, FastBreak_47HA var2, HashMap var3) {
      var0 = a ^ var0;
      long var4 = var0 ^ 83163611875105L;
      recovery$indy$5(var2, var4, var3, -5897181981420725780L, var0);
   }

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native void a();

   private static native int a(long var0, long var2);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   public double method_42$c1b4371f52(long var1, C_475y var3) {
      FastBreak_47HA var15;
      var1 = a ^ var1;
      long var4 = var1 ^ 24777155829610L;
      long var6 = var1 ^ 17356064737506L;
      long var8 = var1 ^ 78108542466988L;
      long var10 = var1 ^ 47201016010468L;
      Setting[] var12 = recovery$indy$6(1377210346800348671L, var1);
      boolean var10000 = recovery$indy$7(this.settingDedicatedItemHandling, 1375696051834837456L, var1);
      if (var12 == null) {
         Setting[] var10001;
         label47: {
            label46: {
               if (var10000) {
                  var15 = this;
                  var10001 = var12;
                  if (var1 < 0L) {
                     break label47;
                  }

                  if (var12 != null) {
                     break label46;
                  }

                  C_4715 var13 = recovery$indy$8(this, var8, 1376854415678637870L, var1);
                  if (var1 < 0L) {
                     return recovery$indy$9(var13, var6, var3, 1376035951667867877L, var1);
                  }

                  if (var13 != null) {
                     return recovery$indy$9(var13, var6, var3, 1376035951667867877L, var1);
                  }
               }

               var15 = this;
            }

            var10001 = var12;
         }

         if (var10001 != null) {
            return recovery$indy$15(
               recovery$indy$14(recovery$indy$13(var15, var3, 1375618713882450500L, var1), 1376175140132381257L, var1), var4, 1375710090141135502L, var1
            );
         }

         var10000 = recovery$indy$10(var15.settingMode, var10, 1377406793044688201L, var1).equals(recovery$indy$11(2657, 6313429322533492857L ^ var1));
      }

      return var10000
         ? recovery$indy$12(this.settingMultiplier, var4, 1375710090141135502L, var1)
         : recovery$indy$15(
            recovery$indy$14(recovery$indy$13(this, var3, 1375618713882450500L, var1), 1376175140132381257L, var1), var4, 1375710090141135502L, var1
         );
   }

   public boolean method_42$e64d5b914b(C_475y var1, long var2) {
      FastBreak_47HA var14;
      var2 = a ^ var2;
      long var10001 = var2 ^ 93058865382584L;
      int var4 = (int)((var2 ^ 93058865382584L) >>> 48);
      int var5 = (int)((var2 ^ 93058865382584L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 69987205452423L;
      long var9 = var2 ^ 90438902136783L;
      Setting[] var11 = recovery$indy$16(8806698010960368852L, var2);
      boolean var10000 = recovery$indy$17(this.settingDedicatedItemHandling, 8807929162303910139L, var2);
      if (var11 == null) {
         label42: {
            if (var10000) {
               var14 = this;
               if (var11 != null) {
                  break label42;
               }

               C_4715 var12 = recovery$indy$18(this, var7, 8804793899909148165L, var2);
               if (var2 <= 0L) {
                  return recovery$indy$19(var12, (char)var4, (short)var5, var6, var1, 8806725274221522542L, var2);
               }

               if (var12 != null) {
                  return recovery$indy$19(var12, (char)var4, (short)var5, var6, var1, 8806725274221522542L, var2);
               }
            }

            var14 = this;
         }

         var10000 = recovery$indy$20(var14.settingMode, var9, 8806490567200150626L, var2).equals(recovery$indy$21(2657, 6313402543901552978L ^ var2));
      }

      if (var11 == null) {
         if (var10000) {
            return recovery$indy$22(this.settingCustomInAirMultiplier, 8807929162303910139L, var2);
         }

         var10000 = recovery$indy$25(
            recovery$indy$24(recovery$indy$23(this, var1, 8808008720538645359L, var2), 8806308350031253416L, var2), 8807929162303910139L, var2
         );
      }

      return var10000;
   }

   private static native Method d(long var0, long var2);

   @Override
   public void method_41$9035875d26(long var1, C_47ob var3) {
      Setting[] var4 = recovery$indy$26(-7190578296399695146L, var1);
      C_473U var10000 = recovery$indy$27(var3, -7191892975927735708L, var1);
      if (var4 == null) {
         if (!(var10000 instanceof C_45J)) {
            return;
         }

         var10000 = recovery$indy$28(var3, -7191892975927735708L, var1);
      }

      C_45J var5 = (C_45J)var10000;
      if (var5.method_47$4de68953a2() == C_40x.START_DESTROY_BLOCK) {
         this.field_43a = true;
      }
   }

   private void method_40$c6d77e50a1(C_47s7 var1) {
      long var2 = a ^ 121591450919588L;
      int var4 = (int)((var2 ^ 135269627662016L) >>> 32);
      long var5 = (var2 ^ 135269627662016L) << 32 >>> 32;
      ModeSetting var10003 = this.settingMode;
      C_45n var10006 = recovery$indy$29(this);
      long var10007 = -5747562132619722492L;
      C_45n var7 = var10006;
      Object var8 = null;
      long var9 = var5;
      ModeSetting var11 = var10003;
      int var12 = var4;
      String var13 = "";
      C_47s7 var14 = var1;
      var14.method_48$1adfa43407(var13, var12, var11, var9, (SettingGroup)var8, var7);
   }

   static SettingGroup method_44$f3bfae611c(FastBreak_47HA var0) {
      return var0.settingDedicatedItems;
   }

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 84843339555641L;
      long var3 = var1 ^ 10058924078172L;
      long var10002 = 8189140501303205873L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Simple");
   }

   public double method_49$dff3ea2558(int var1, C_475y var2, int var3) {
      FastBreak_47HA var16;
      long var4 = ((long)var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 25558584146944L;
      long var8 = var4 ^ 77774277253318L;
      long var10 = var4 ^ 96477183213506L;
      long var12 = var4 ^ 47673668056462L;
      Setting[] var14 = recovery$indy$30(8103897904902610581L, var4);
      boolean var10000 = recovery$indy$31(this.settingDedicatedItemHandling, 8105764591063251642L, var4);
      if (var14 == null) {
         Setting[] var10001;
         label47: {
            label46: {
               if (var10000) {
                  var16 = this;
                  var10001 = var14;
                  if (var1 <= 0) {
                     break label47;
                  }

                  if (var14 != null) {
                     break label46;
                  }

                  C_4715 var15 = recovery$indy$32(this, var8, 8102416074956497988L, var4);
                  if (var1 < 0) {
                     return recovery$indy$33(var15, var10, var2, 8102286566403057328L, var4);
                  }

                  if (var15 != null) {
                     return recovery$indy$33(var15, var10, var2, 8102286566403057328L, var4);
                  }
               }

               var16 = this;
            }

            var10001 = var14;
         }

         if (var10001 != null) {
            return recovery$indy$39(
               recovery$indy$38(recovery$indy$37(var16, var2, 8105683663499409710L, var4), 8105911829357816251L, var4), var6, 8105776466308764132L, var4
            );
         }

         var10000 = recovery$indy$34(var16.settingMode, var12, 8104097340427935267L, var4).equals(recovery$indy$35(2657, 6313430070189013779L ^ var4));
      }

      return var10000
         ? recovery$indy$36(this.settingArtificialMiningSpeedEffect, var6, 8105776466308764132L, var4)
         : recovery$indy$39(
            recovery$indy$38(recovery$indy$37(this, var2, 8105683663499409710L, var4), 8105911829357816251L, var4), var6, 8105776466308764132L, var4
         );
   }

   public boolean method_49$e64d5b914b(C_475y var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 123751050206726L;
      Setting[] var6 = recovery$indy$40(5788788392883240630L, var2);
      Object var10000 = this;
      if (var6 == null) {
         boolean var9 = recovery$indy$41(this, var4, 5788366967937355053L, var2);
         if (var2 <= 0L) {
            return var9;
         }

         if (!var9) {
            return false;
         }

         var10000 = this.field_45.get(var1);
      }

      C_47s7 var7 = (C_47s7)var10000;
      C_47s7 var10 = var7;
      if (var6 == null) {
         if (var7 == null) {
            return true;
         }

         var10 = var7;
      }

      return recovery$indy$42(var10, 5788144033771964174L, var2);
   }

   private C_47s7 method_45$4541f7682f(C_475y var1) {
      return (C_47s7)this.field_45.get(var1);
   }

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 19289616181117L;
      long var3 = var1 ^ 94038598184984L;
      long var10002 = -5340715807555658827L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Expert");
   }

   private void method_47$5c6fbd82aa(long var1, HashMap var3) {
      var1 = a ^ var1;
      Setting[] var4 = recovery$indy$43(4296300978979591548L, var1);

      for (Object recovery$entry : C_475y.field_49H.method_41$9aa7af2ac9()) {
         ResourceLocation var6 = (ResourceLocation) recovery$entry;
         String var7 = var6.method_44$0e30dfc966();
         C_475y var8 = C_475y.method_48$f2d9800f06(var7);
         var3.put(var8, new C_47s7(this, this, var7));
         if (var4 != null) {
            break;
         }
      }
   }

   public boolean method_43$2c50dad841(long var1, C_475y var3) {
      FastBreak_47HA var13;
      var1 = a ^ var1;
      long var4 = var1 ^ 85183094692323L;
      long var6 = var1 ^ 35866806203563L;
      long var8 = var1 ^ 111121766376270L;
      Setting[] var10 = recovery$indy$44(-1057255264309076048L, var1);
      boolean var10000 = recovery$indy$45(this.settingDedicatedItemHandling, -1055955342033077345L, var1);
      if (var10 == null) {
         label42: {
            if (var10000) {
               var13 = this;
               if (var10 != null) {
                  break label42;
               }

               C_4715 var11 = recovery$indy$46(this, var4, -1057048794157226655L, var1);
               if (var1 <= 0L) {
                  return recovery$indy$47(var11, var8, var3, -1056108673068581959L, var1);
               }

               if (var11 != null) {
                  return recovery$indy$47(var11, var8, var3, -1056108673068581959L, var1);
               }
            }

            var13 = this;
         }

         var10000 = recovery$indy$48(var13.settingMode, var6, -1057639626512556282L, var1).equals(recovery$indy$49(684, 2887399138890363636L ^ var1));
      }

      if (var10 == null) {
         if (var10000) {
            return recovery$indy$50(this.settingInstant, -1055955342033077345L, var1);
         }

         var10000 = recovery$indy$53(
            recovery$indy$52(recovery$indy$51(this, var3, -1056050554659981301L, var1), -1057103256975918881L, var1), -1055955342033077345L, var1
         );
      }

      return var10000;
   }

   public void method_43$7567b8542e(long var1, C_475y var3, C_478Q var4) {
      FastBreak_47HA var11;
      var1 = a ^ var1;
      long var5 = var1 ^ 7371290051057L;
      long var7 = var1 ^ 116286860588280L;
      Setting[] var9 = recovery$indy$54(1126637018658824513L, var1);
      boolean var10000 = recovery$indy$55(this, var5, 1126778620975616730L, var1);
      if (var9 == null) {
         if (!var10000) {
            return;
         }

         var10000 = this.field_43a;
      }

      label40: {
         if (var9 == null) {
            if (!var10000) {
               return;
            }

            var11 = this;
            if (var9 != null) {
               break label40;
            }

            var10000 = recovery$indy$56(this.settingDebugBreakSpeed, 1128503139963880814L, var1);
         }

         if (!var10000) {
            return;
         }

         var11 = this;
      }

      var11.field_43a = false;
      recovery$indy$60(
         var7,
         recovery$indy$57(746, 6250721824021826628L ^ var1)
            + Math.round(
               var3.method_43$38de05d5ed(
                     recovery$indy$58(field_43, 1126499287858659874L, var1), recovery$indy$59(field_43, 1126499287858659874L, var1).field_47, var4
                  )
                  * 1000.0F
            ),
         1127884238423794660L,
         var1
      );
   }

   public double method_43$c1b4371f52(long var1, C_475y var3) {
      FastBreak_47HA var15;
      var1 = a ^ var1;
      long var4 = var1 ^ 78026344596233L;
      long var6 = var1 ^ 111073879280130L;
      long var8 = var1 ^ 25787033102287L;
      long var10 = var1 ^ 134775450176135L;
      Setting[] var12 = recovery$indy$61(-3494927462211968612L, var1);
      boolean var10000 = recovery$indy$62(this.settingDedicatedItemHandling, -3498131173839075917L, var1);
      if (var12 == null) {
         Setting[] var10001;
         label47: {
            label46: {
               if (var10000) {
                  var15 = this;
                  var10001 = var12;
                  if (var1 < 0L) {
                     break label47;
                  }

                  if (var12 != null) {
                     break label46;
                  }

                  C_4715 var13 = recovery$indy$63(this, var8, -3496832123813504179L, var1);
                  if (var1 <= 0L) {
                     return recovery$indy$64(var13, var6, var3, -3496062333092523492L, var1);
                  }

                  if (var13 != null) {
                     return recovery$indy$64(var13, var6, var3, -3496062333092523492L, var1);
                  }
               }

               var15 = this;
            }

            var10001 = var12;
         }

         if (var10001 != null) {
            return recovery$indy$70(
               recovery$indy$69(recovery$indy$68(var15, var3, -3498032950475749849L, var1), -3494943892151269619L, var1), var4, -3497940698142363923L, var1
            );
         }

         var10000 = recovery$indy$65(var15.settingMode, var10, -3495118421614616278L, var1).equals(recovery$indy$66(2657, 6313377052866839578L ^ var1));
      }

      return var10000
         ? recovery$indy$67(this.settingInAirMultiplier, var4, -3497940698142363923L, var1)
         : recovery$indy$70(
            recovery$indy$69(recovery$indy$68(this, var3, -3498032950475749849L, var1), -3494943892151269619L, var1), var4, -3497940698142363923L, var1
         );
   }

   static BooleanSetting method_43$e122bdc5c1(FastBreak_47HA var0) {
      return var0.settingDedicatedItemHandling;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$71(this, 26, var3, -7100027314432626935L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public FastBreak_47HA(long var1) {
      super("FastBreak", "Schnellbruch", ((a ^ var1) ^ 38426978813254L), new Color(52, 152, 219), Category.WORLD);
      Object var53;
      HashMap var54;
      var1 = a ^ var1;
      long var3 = var1 ^ 20955735754928L;
      long var10001 = var1 ^ 41762658903980L;
      int var5 = (int)((var1 ^ 41762658903980L) >>> 48);
      int var6 = (int)((var1 ^ 41762658903980L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      long var8 = var1 ^ 115753311597963L;
      long var10 = var1 ^ 76780848539134L;
      long var12 = var1 ^ 41132969722071L;
      var10001 = var1 ^ 76026189650160L;
      int var14 = (int)((var1 ^ 76026189650160L) >>> 32);
      int var15 = (int)((var1 ^ 76026189650160L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var1 ^ 128577236002503L;
      long var19 = var1 ^ 92180631443805L;
      long var21 = var1 ^ 38426978813254L;
      long var23 = var1 ^ 109951862554092L;
      // Pure super-constructor arguments are evaluated in the first statement above.
      this.settingNoBlockHitDelay = new BooleanSetting(this, var19, "NoBlockHitDelay", false);
      long var10000 = 932407376627753491L;
      Setting[] var52 = SmartRaytrace_47TG.method_48$19d51fe81e();
      this.settingIgnoreMiningFatigue = new BooleanSetting(this, var19, "IgnoreMiningFatigue", false);
      this.settingOnlyWhenBlink = new BooleanSetting(this, var19, "OnlyWhenBlink", false);
      this.settingIgnoreBeds = new BooleanSetting(this, var19, "IgnoreBeds", false);
      this.settingDebugBreakSpeed = new BooleanSetting(this, var19, "DebugBreakSpeed", false);
      this.settingMode = new ModeSetting(this, "Mode", var8, "Simple", new String[]{"Simple", "Expert"});
      SettingGroup var10002 = new SettingGroup(this, "SimpleSettings", true, var12);
      C_45n var10004 = recovery$indy$72(this);
      char var10006 = (char)var15;
      long var10007 = 934382980729344573L;
      C_45n var34 = var10004;
      int var35 = var16;
      char var36 = var10006;
      int var37 = var14;
      SettingGroup var38 = var10002;
      this.settingSimpleSettings = var38.method_48$033d42cbfb(var37, var36, var35, var34);
      this.settingCustomInAirMultiplier = new BooleanSetting(this, "CustomInAirMultiplier", (short)var5, (char)var6, var7, false, this.settingSimpleSettings);
      NumberSetting var57 = new NumberSetting(this, "InAirMultiplier", 0.2, 0.0, 1.0, 2, this.settingSimpleSettings, var23);
      BooleanSetting var10003 = this.settingCustomInAirMultiplier;
      this.settingCustomInAirMultiplier.getClass();
      C_45n var59 = recovery$indy$73(var10003);
      long var62 = 933816578940786351L;
      C_45n var39 = var59;
      NumberSetting var40 = var57;
      this.settingInAirMultiplier = var40.method_43$9db6d416f4(var39);
      this.settingMultiplier = new NumberSetting(this, "Multiplier", 2.0, 1.0, 2.0, 2, this.settingSimpleSettings, var23);
      this.settingArtificialMiningSpeedEffect = new NumberSetting(this, "ArtificialMiningSpeedEffect", 0.0, 0.0, 3.0, 0, this.settingSimpleSettings, var23);
      this.settingInstant = new BooleanSetting(this, "Instant", (short)var5, (char)var6, var7, false, this.settingSimpleSettings);
      this.field_45 = new HashMap();
      Setting[] var25 = var52;
      this.field_49 = new HashMap();
      this.field_43a = false;
      long var60 = 933949693970217779L;
      HashMap var41 = this.field_45;
      long var42 = var10;
      FastBreak_47HA var44 = this;
      var44.method_47$5c6fbd82aa(var42, var41);
      C_47s7[] var26 = (C_47s7[])this.field_45.values().toArray(new C_47s7[0]);
      Arrays.sort(var26, Comparator.comparing(recovery$indy$74()));
      new MultiSelectSetting(this, "BlocksToFastbreak", var3, var26);
      this.field_45.values().forEach(recovery$indy$75(this));
      C_43r[] var27 = new C_43r[]{
         C_42R.field_47u,
         C_42R.field_41P,
         C_42R.field_41q,
         C_42R.field_41M,
         C_42R.field_47a,
         C_42R.field_41N,
         C_42R.field_45f,
         C_42R.field_45B,
         C_42R.field_45w,
         C_42R.field_46,
         C_42R.field_45k,
         C_42R.field_47J,
         C_42R.field_47,
         C_42R.field_49,
         C_42R.field_450,
         C_42R.field_41A
      };
      this.settingDedicatedItemHandling = new BooleanSetting(this, var19, "DedicatedItemHandling", false);
      SettingGroup var56 = new SettingGroup(this, "DedicatedItems", true, var12);
      BooleanSetting var58 = this.settingDedicatedItemHandling;
      this.settingDedicatedItemHandling.getClass();
      C_45n var61 = recovery$indy$76(var58);
      char var10005 = (char)var15;
      long var63 = 934382980729344573L;
      C_45n var45 = var61;
      int var46 = var16;
      char var47 = var10005;
      int var48 = var14;
      SettingGroup var49 = var56;
      this.settingDedicatedItems = var49.method_48$033d42cbfb(var48, var47, var46, var45);
      C_43r[] var28 = var27;
      int var29 = var28.length;
      int var30 = 0;

      label24: {
         while (true) {
            if (var30 < var29) {
               var53 = var28;
               if (var1 < 0L) {
                  break label24;
               }

               C_43r var31 = var28[var30];
               ResourceLocation var32 = (ResourceLocation)C_43r.field_43.method_42$262c527aaf(var31);
               String var33 = var32.method_44$0e30dfc966();
               var54 = this.field_49;
               if (var25 != null) {
                  break;
               }

               this.field_49.put(var31, new C_4715(this, this, var33));
               var30++;
               if (var25 == null) {
                  continue;
               }
            }

            var54 = this.field_49;
            break;
         }

         var53 = var54.values().toArray(new C_4715[0]);
      }

      C_4715[] var51 = (C_4715[])var53;
      Arrays.sort(var51, Comparator.comparing(recovery$indy$77()));
      new MultiSelectSetting(this, "CustomItems", var17, var51, this.settingDedicatedItems);
      this.field_49.values().forEach(recovery$indy$78());
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native Setting[] recovery$indy$1(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);

   private static native Setting[] recovery$indy$3(long var0, long var2);

   private static native C_43r recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$5(Object var0, long var1, Object var3, long var4, long var6);

   private static native Setting[] recovery$indy$6(long var0, long var2);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native C_4715 recovery$indy$8(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$9(Object var0, long var1, Object var3, long var4, long var6);

   private static native String recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$11(int var0, long var1);

   private static native double recovery$indy$12(Object var0, long var1, long var3, long var5);

   private static native C_47s7 recovery$indy$13(Object var0, Object var1, long var2, long var4);

   private static native NumberSetting recovery$indy$14(Object var0, long var1, long var3);

   private static native double recovery$indy$15(Object var0, long var1, long var3, long var5);

   private static native Setting[] recovery$indy$16(long var0, long var2);

   private static native boolean recovery$indy$17(Object var0, long var1, long var3);

   private static native C_4715 recovery$indy$18(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$19(Object var0, char var1, short var2, int var3, Object var4, long var5, long var7);

   private static native String recovery$indy$20(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$21(int var0, long var1);

   private static native boolean recovery$indy$22(Object var0, long var1, long var3);

   private static native C_47s7 recovery$indy$23(Object var0, Object var1, long var2, long var4);

   private static native BooleanSetting recovery$indy$24(Object var0, long var1, long var3);

   private static native boolean recovery$indy$25(Object var0, long var1, long var3);

   private static native Setting[] recovery$indy$26(long var0, long var2);

   private static native C_473U recovery$indy$27(Object var0, long var1, long var3);

   private static native C_473U recovery$indy$28(Object var0, long var1, long var3);

   private static native C_45n recovery$indy$29(FastBreak_47HA var0);

   private static native Setting[] recovery$indy$30(long var0, long var2);

   private static native boolean recovery$indy$31(Object var0, long var1, long var3);

   private static native C_4715 recovery$indy$32(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$33(Object var0, long var1, Object var3, long var4, long var6);

   private static native String recovery$indy$34(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$35(int var0, long var1);

   private static native double recovery$indy$36(Object var0, long var1, long var3, long var5);

   private static native C_47s7 recovery$indy$37(Object var0, Object var1, long var2, long var4);

   private static native NumberSetting recovery$indy$38(Object var0, long var1, long var3);

   private static native double recovery$indy$39(Object var0, long var1, long var3, long var5);

   private static native Setting[] recovery$indy$40(long var0, long var2);

   private static native boolean recovery$indy$41(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$42(Object var0, long var1, long var3);

   private static native Setting[] recovery$indy$43(long var0, long var2);

   private static native Setting[] recovery$indy$44(long var0, long var2);

   private static native boolean recovery$indy$45(Object var0, long var1, long var3);

   private static native C_4715 recovery$indy$46(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$47(Object var0, long var1, Object var3, long var4, long var6);

   private static native String recovery$indy$48(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$49(int var0, long var1);

   private static native boolean recovery$indy$50(Object var0, long var1, long var3);

   private static native C_47s7 recovery$indy$51(Object var0, Object var1, long var2, long var4);

   private static native BooleanSetting recovery$indy$52(Object var0, long var1, long var3);

   private static native boolean recovery$indy$53(Object var0, long var1, long var3);

   private static native Setting[] recovery$indy$54(long var0, long var2);

   private static native boolean recovery$indy$55(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$56(Object var0, long var1, long var3);

   private static native String recovery$indy$57(int var0, long var1);

   private static native EntityPlayerSP recovery$indy$58(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$59(Object var0, long var1, long var3);

   private static native void recovery$indy$60(long var0, Object var2, long var3, long var5);

   private static native Setting[] recovery$indy$61(long var0, long var2);

   private static native boolean recovery$indy$62(Object var0, long var1, long var3);

   private static native C_4715 recovery$indy$63(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$64(Object var0, long var1, Object var3, long var4, long var6);

   private static native String recovery$indy$65(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$66(int var0, long var1);

   private static native double recovery$indy$67(Object var0, long var1, long var3, long var5);

   private static native C_47s7 recovery$indy$68(Object var0, Object var1, long var2, long var4);

   private static native NumberSetting recovery$indy$69(Object var0, long var1, long var3);

   private static native double recovery$indy$70(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$71(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$72(FastBreak_47HA var0);

   private static native C_45n recovery$indy$73(BooleanSetting var0);

   private static native Function recovery$indy$74();

   private static native Consumer recovery$indy$75(FastBreak_47HA var0);

   private static native C_45n recovery$indy$76(BooleanSetting var0);

   private static native Function recovery$indy$77();

   private static native Consumer recovery$indy$78();

   private static native MethodHandle recovery$constant$79();
}
