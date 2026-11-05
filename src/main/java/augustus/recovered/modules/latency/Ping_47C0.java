package augustus.recovered.modules.latency;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_41Q;
import net.C_41Z;
import net.C_42L;
import net.C_42V;
import net.C_43F;
import net.C_45J;
import net.C_45n;
import net.C_46s;
import client.render.RenderPass;
import net.C_473U;
import net.C_475c;
import net.C_477z;
import net.C_478i;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47BX;
import net.C_47F9;
import net.C_47Fw;
import net.C_47Is;
import net.C_47K6;
import net.C_47K7;
import net.C_47MI;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47Pi;
import net.C_47S;
import client.setting.ShaderOptions;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.C_47WF;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.C_47bv;
import net.C_47cl;
import net.C_47cu;
import net.C_47dz;
import net.C_47eb;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47ri;
import client.render.RenderUtils;
import net.C_47si;
import client.module.Category;
import net.C_47tf;
import net.C_47uI;
import net.C_47vS;
import net.C_47vi;
import net.C_47wr;
import net.C_47xZ;
import net.C_47xz;
import net.C_47zh;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Ping_47C0 extends client.module.Module implements net.C_47mz,net.C_47oO,net.C_47si,client.event.RenderListener,net.C_47vi,net.C_47xz,net.C_41Q,net.C_47UH,net.C_47bv {
    private final client.setting.SettingGroup settingIncomingGroup = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47MI field_418 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingOutgoingGroup = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47MI field_41p = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCombatMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingPingStartDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingResetPingAtDistanceToTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFailRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingFailInterval = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingFlushConditionsGroup = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingFlushConditions = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingTargetESPs = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingTargetESP = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingClassicColorTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLineWidthTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSmoothRendering = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions settingTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingRenderTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingPlayerESPs = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingPlayerESP = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingClassicColorMe = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLineWidthMe = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions settingPlayer = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyInThirdPerson = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_41k = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_41d = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_41B = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.atomic.AtomicLong field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.atomic.AtomicBoolean field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private static long c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] i; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] k; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

   public void method_46$c14938f832(C_47Pi var1, C_47tf var2, long var3, boolean var5) {
      var3 = c ^ var3;
      long var6 = var3 ^ 15608324651447L;
      long var8 = var3 ^ 86004565924767L;
      long var10 = var3 ^ 111423002913869L;
      long var12 = var3 ^ 2249054944382L;
      long var10002 = 5370947800636553204L;
      long var15 = var6;
      ShaderOptions var17 = this.settingPlayer;
      boolean var10000 = var17.method_49$0dd78e0064(var15);
      long var10003 = 5376477894907973700L;
      long var18 = var10;
      ShaderOptions var20 = this.settingPlayer;
      boolean var10001 = var20.method_47$0dd78e0064(var18);
      var10003 = 5372999938894875349L;
      C_47uI.method_40$9bd74f13d3(var10000, var10001, var8);
      long var27 = 5374414727083914643L;
      C_47Pi var21 = var1;
      C_47wr var14 = var21.method_43$e97f03698c();
      C_47Fw var28 = recovery$indy$1(var1, var14, var2, var5);
      var10003 = 5375109700920505413L;
      C_47Fw var22 = var28;
      long var23 = var12;
      boolean var25 = false;
      C_47uI.method_42$300c7fd546(var25, var23, var22);
   }



   public void method_46$e535f8442d(C_47zh var1, long var2, short var4) {
      long var5 = var2 << 16 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 37886632965598L;
      long var9 = var5 ^ 117811200503032L;
      long var11 = var5 ^ 59373018299386L;
      long var13 = var5 ^ 882137568690L;
      String var15 = recovery$indy$2(1772809030532585678L, var5);
      recovery$indy$4(this, recovery$indy$3(var1, 1766589698119637771L, var5), var13, 1767640647051739478L, var5);
      int var10000 = (int) ((recovery$indy$5(this, var7, 1772182622955302435L, var5)) ? 1 : 0);
      if (var15 == null) {
         if (var10000 != 0) {
            recovery$indy$7(var1, recovery$indy$6(this.field_418, var9, 1766613895675364086L, var5), 1767416138611716711L, var5);
            if (var15 == null) {
               return;
            }
         }

         var10000 = recovery$indy$8(this.field_418, var11, 1772105042652139639L, var5);
      }

      int var16 = var10000;
      if (var16 > 0) {
         recovery$indy$9(var1, var16, 1767416138611716711L, var5);
      }
   }



    private static native int i(long a0,long a1);

    private static native java.lang.reflect.Field e(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method e(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Method l(long a0,long a1);

   private void method_41$ad0e900906(RenderPass var1) {
      long var2 = c ^ 74136920594144L;
      long var4 = var2 ^ 96561009908661L;
      long var10001 = -7506412515785964575L;
      Minecraft var6 = field_43;
      long var10004 = -7504692067554917843L;
      long var7 = var4;
      NumberSetting var9 = this.settingLineWidthMe;
      RenderUtils.method_48$45fe1d62b8(var6.field_42P, this.settingClassicColorMe, (float)var9.method_44$474dfaa627(var7), 255, true);
   }



   public void method_41$fae8de1664(C_475c var1) {
      long var2 = c ^ 66863433785771L;
      long var10000 = -6875812567181074240L;
      String var4 = C_47eb.method_48$0e30dfc966();
      long var10001 = -6875461956466465254L;
      C_47eb var5 = C_47eb.HOLDING_BLOCKS;
      if (var5.method_43$aae029aa0a()) {
         var10001 = -6874566483051989846L;
         Minecraft var6 = field_43;
         EntityPlayerSP var11 = var6.field_42P;
         if (var4 == null) {
            if (var6.field_42P == null) {
               return;
            }

            var10001 = -6874566483051989846L;
            Minecraft var7 = field_43;
            var11 = var7.field_42P;
         }

         C_47rf var12 = var11.method_48$ac4db64966();
         if (var4 == null) {
            if (var12 == null) {
               return;
            }

            var10001 = -6874566483051989846L;
            Minecraft var8 = field_43;
            var12 = var8.field_42P.method_48$ac4db64966();
         }

         if (var12.method_48$dbd570a038() instanceof C_43F) {
            var10001 = -6878701574345600581L;
            C_47eb var9 = C_47eb.HOLDING_BLOCKS;
            C_47cu var13 = C_47eb.method_44$93deda978b(var9);
            var10001 = -6875022692985826449L;
            C_47cu var10 = var13;
            var10.method_46$da8c82d5d4();
         }
      }
   }



   public void method_41$9b8d272046(C_47Pi var1, long var2) {
      augustus.recovered.modules.latency.Ping_47C0 var60;
      augustus.recovered.modules.latency.Ping_47C0 var62;
      long var6;
      long var8;
      long var12;
      long var14;
      String var16;
      label113: {
         long var4 = var2 ^ 26769845114420L;
         var6 = var2 ^ 28647365199211L;
         var8 = var2 ^ 102346082013722L;
         long var10 = var2 ^ 38550564705390L;
         var12 = var2 ^ 92563987197542L;
         var14 = var2 ^ 39118360861767L;
         long var10000 = 1847323984245414391L;
         var16 = C_47eb.method_48$0e30dfc966();
         long var10001 = 1849488576860664661L;
         C_47Pi var18 = var1;
         EntityLivingBase var17 = var18.method_41$20b8cce974();
         var10001 = 1848794724456119743L;
         PacketHandler_47Cq var19 = ClientGlobals.field_48.field_489;
         boolean var59 = var19.method_45_$aae029aa0a();
         if (var16 == null) {
            if (!var59) {
               break label113;
            }

            long var10003 = 1850770405875266259L;
            EntityLivingBase var20 = var17;
            long var21 = var10;
            Ping_47C0 var23 = this;
            var59 = var23.method_43$5909fdf9ee(var21, var20);
         }

         label114: {
            if (var16 == null) {
               if (!var59) {
                  break label113;
               }

               var60 = this;
               if (var16 != null) {
                  break label114;
               }

               long var71 = 1847536715196156365L;
               long var24 = var12;
               ModeSetting var26 = this.settingTargetESP;
               Ping_47C0 var27 = this;
               var59 = var27.method_45$894f5cf30b(var26, var24);
            }

            if (!var59) {
               break label113;
            }

            var60 = this;
         }

         long var10006 = 1848328897693301680L;
         long var28 = var14;
         ModeSetting var30 = this.settingTargetESP;
         boolean var10004 = var30.method_46$5f9dc63072(var28).equals(recovery$indy$11(23698, 7738101402967661338L ^ var2));
         long var10005 = 1848650067995218765L;
         boolean var31 = var10004;
         EntityLivingBase var32 = var17;
         C_47Pi var33 = var1;
         long var34 = var4;
         Ping_47C0 var36 = var60;
         var36.method_47$11b5865b8f(var34, var33, var32, var31);
      }

      long var64 = 1850862567734480285L;
      Minecraft var37 = field_43;
      if (var37.field_42P != null) {
         long var10002 = 1850661603144988474L;
         long var38 = var6;
         PacketHandler_47Cq var40 = ClientGlobals.field_48.field_489;
         int var61 = (int) ((var40.method_48$0dd78e0064(var38)) ? 1 : 0);
         String var65 = var16;
         if (var2 >= 0L) {
            if (var16 == null) {
               if (var61 == 0) {
                  return;
               }

               var64 = 1850862567734480285L;
               Minecraft var41 = field_43;
               var10002 = 1849488576860664661L;
               C_47Pi var42 = var1;
               var61 = (int) ((var41.field_42P.equals(var42.method_41$20b8cce974())) ? 1 : 0);
            }

            var65 = var16;
         }

         if (var2 >= 0L) {
            if (var65 == null) {
               if (var61 == 0) {
                  return;
               }

               long var72 = 1847536715196156365L;
               long var43 = var12;
               ModeSetting var45 = this.settingPlayerESP;
               Ping_47C0 var46 = this;
               var61 = (int) ((var46.method_45$894f5cf30b(var45, var43)) ? 1 : 0);
            }

            var65 = var16;
         }

         if (var2 > 0L) {
            if (var65 == null) {
               if (var61 == 0) {
                  return;
               }

               var64 = 1854544584812822669L;
               Minecraft var47 = field_43;
               var61 = var47.field_44r.field_44S;
            }

            var65 = var16;
         }

         label70: {
            label69: {
               if (var65 == null) {
                  if (var61 != 0) {
                     break label69;
                  }

                  var62 = this;
                  if (var16 != null) {
                     break label70;
                  }

                  var64 = 1848009986198242293L;
                  BooleanSetting var48 = this.settingOnlyInThirdPerson;
                  var61 = (int) ((var48.method_49$aae029aa0a()) ? 1 : 0);
               }

               if (var61 != 0) {
                  return;
               }
            }

            var62 = this;
         }

         long var73 = 1850862567734480285L;
         Minecraft var49 = field_43;
         C_47tf var70 = var49.field_42P.method_47$b2124a4855();
         long var75 = 1848328897693301680L;
         long var50 = var14;
         ModeSetting var52 = this.settingPlayerESP;
         boolean var74 = var52.method_46$5f9dc63072(var50).equals(recovery$indy$12(23698, 7738101402967661338L ^ var2));
         var75 = 1849854377200116595L;
         boolean var53 = var74;
         long var54 = var8;
         C_47tf var56 = var70;
         C_47Pi var57 = var1;
         Ping_47C0 var58 = var62;
         var58.method_46$c14938f832(var57, var56, var54, var53);
      }
   }





   public void method_41$426c33b229(C_477z var1, long var2) {
      long var10001 = var2 ^ 76355916741729L;
      int var4 = (int)((var2 ^ 76355916741729L) >>> 32);
      int var5 = (int)((var2 ^ 76355916741729L) << 32 >>> 56);
      int var6 = (int)(var10001 << 40 >>> 40);
      long var10000 = 8140879696281120942L;
      String var7 = C_47eb.method_48$0e30dfc966();
      var10001 = 8140481835179747931L;
      Minecraft var8 = field_43;
      if (var8.field_44Q != null) {
         var10001 = 8141460125320735404L;
         BooleanSetting var9 = this.settingCombatMode;
         byte var17 = (byte) ((var9.method_49$aae029aa0a()) ? 1 : 0);
         String var20 = var7;
         if (var2 > 0L) {
            if (var7 == null) {
               if (var17 == 0) {
                  return;
               }

               byte var10002 = (byte)var5;
               long var10004 = 8141115018317256195L;
               int var10 = var6;
               byte var11 = var10002;
               int var12 = var4;
               C_47MI var13 = this.field_41p;
               double var24;
               var17 = (byte)((var24 = var13.method_42$a220c6100e(var12, var11, var10) - 0.0) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1));
            }

            var20 = var7;
         }

         if (var20 == null) {
            if (var17 <= 0) {
               return;
            }

            var10001 = 8141827300554476458L;
            C_477z var14 = var1;
            var17 = (byte) ((var14.method_46$5927cfd1db() instanceof EntityLivingBase) ? 1 : 0);
         }

         if (var17 != 0) {
            long var23 = 8141827300554476458L;
            C_477z var15 = var1;
            this.field_47 = (EntityLivingBase)var15.method_46$5927cfd1db();
            var10001 = 8140539298493711105L;
            C_47cu var16 = this.field_41B;
            var16.method_46$da8c82d5d4();
         }
      }
   }




    private static native java.lang.reflect.Field f(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method f(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   public void method_40$e781d6169a(C_47zh var1, long var2) {
      String var14;
      int var10000;
      label73: {
         long var8;
         label72: {
            long var6;
            label77: {
               String var10001;
               label70: {
                  long var4 = var2 ^ 60607411443892L;
                  var6 = var2 ^ 138866605932946L;
                  var8 = var2 ^ 35827339777680L;
                  long var10 = var2 ^ 140312153485846L;
                  long var12 = var2 ^ 66211356189813L;
                  var14 = recovery$indy$13(8498394759197996452L, var2);
                  recovery$indy$15(this, recovery$indy$14(var1, 8497793945974044257L, var2), var12, 8499121930395504554L, var2);
                  var10000 = (int) ((recovery$indy$16(this.settingCombatMode, 8500031009779150758L, var2)) ? 1 : 0);
                  label69:
                  if (var14 == null) {
                     if (var10000 != 0) {
                        var10000 = (int) ((this.field_43a) ? 1 : 0);
                        var10001 = var14;
                        if (var2 > 0L) {
                           if (var14 == null) {
                              if (this.field_43a) {
                                 break label77;
                              }

                              var10000 = ((int) (recovery$indy$18(
                                 this.field_41d, recovery$indy$17(this.settingPingStartDelay, 8500349389090908729L, var2), var10, 8500847356148600515L, var2
                              ) ? 1 : 0));
                           }

                           var10001 = var14;
                        }

                        if (var2 < 0L) {
                           break label70;
                        }

                        if (var10001 != null) {
                           break label69;
                        }

                        if (var10000 == 0) {
                           break label77;
                        }
                     }

                     var10000 = (int) ((recovery$indy$19(this, var4, 8498886090020127561L, var2)) ? 1 : 0);
                  }

                  var10001 = var14;
               }

               if (var10001 != null) {
                  break label73;
               }

               if (var10000 == 0) {
                  break label72;
               }
            }

            recovery$indy$21(var1, recovery$indy$20(this.field_41p, var6, 8497818126342795164L, var2), 8498981190664837479L, var2);
            if (var14 == null) {
               return;
            }
         }

         var10000 = recovery$indy$22(this.field_41p, var8, 8502195006600379677L, var2);
      }

      int var15 = var10000;
      if (var14 == null) {
         if (var15 <= 0) {
            return;
         }

         this.field_42.set(System.currentTimeMillis());
         this.field_40.set(false);
         this.field_43P = false;
         recovery$indy$23(var1, var15, 8498981190664837479L, var2);
      }

      this.field_43v = true;
   }




   private void method_40$ad0e900906(RenderPass var1) {
      long var2 = c ^ 8799569335545L;
      long var4 = var2 ^ 118778513843943L;
      long var6 = var2 ^ 31610075650476L;
      long var8 = var2 ^ 48434885379279L;
      long var10 = var2 ^ 8125796627229L;
      long var10000 = -3042744321023601262L;
      String var12 = C_47eb.method_48$0e30dfc966();

      for (Object recovered$element$19608 : this.field_43h) {
         EntityLivingBase var14 = (EntityLivingBase) recovered$element$19608;
         boolean var25 = var14 instanceof EntityPlayerSP;
         if (var12 == null) {
            if (var25) {
               continue;
            }

            ColorSetting var10001 = this.settingClassicColorTarget;
            long var10004 = -3044238464307969996L;
            long var15 = var6;
            NumberSetting var17 = this.settingLineWidthTarget;
            float var10002 = (float)var17.method_44$474dfaa627(var15);
            long var10005 = -3044310187336511600L;
            BooleanSetting var18 = this.settingSmoothRendering;
            RenderUtils.method_48$45fe1d62b8(var14, var10001, var10002, 255, var18.method_49$aae029aa0a());
            long var27 = -3037375977368721244L;
            long var19 = var4;
            ShaderOptions var21 = this.settingTarget;
            var25 = var21.method_49$0dd78e0064(var19);
         }

         long var10003 = -3040646503304507628L;
         long var22 = var10;
         ShaderOptions var24 = this.settingTarget;
         boolean var26 = var24.method_47$0dd78e0064(var22);
         var10003 = -3044194962389543547L;
         C_47uI.method_40$9bd74f13d3(var25, var26, var8);
         if (var12 != null) {
            break;
         }
      }
   }



    private static native java.lang.reflect.Field k(long a0,long a1);

    private static native java.lang.Class j(long a0,long a1);

   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      net.minecraft.client.Minecraft var12;
      net.C_47eb var14;
      long var5;
      long var7;
      long var9;
      String var11;
      boolean var10000;
      String var10001;
      label186: {
         var5 = (long)var1 << 32 | var3 << 32 >>> 32;
         var7 = var5 ^ 40698985420512L;
         var9 = var5 ^ 139381814684897L;
         var11 = recovery$indy$24(4722386503804551645L, var5);
         var10000 = recovery$indy$25(C_47eb.SPRINT_RESET, 4723531068994439212L, var5);
         label185:
         if (var11 == null) {
            if (var10000) {
               var10000 = recovery$indy$26(field_43, 4721425336183477687L, var5).method_488$aae029aa0a();
               var10001 = var11;
               if (var1 < 0) {
                  break label186;
               }

               if (var11 != null) {
                  break label185;
               }

               if (var10000 != recovery$indy$27(field_43, 4721425336183477687L, var5).method_47B$aae029aa0a()) {
                  recovery$indy$29(recovery$indy$28(C_47eb.SPRINT_RESET, 4725556097898393766L, var5), 4722725896720183922L, var5);
               }
            }

            var10000 = recovery$indy$30(C_47eb.SPLASH_POTION, 4723531068994439212L, var5);
         }

         var10001 = var11;
      }

      if (var1 >= 0) {
         if (var10001 == null) {
            if (var10000) {
               recovery$indy$31(field_43, 4723064809228114728L, var5).field_44Q.stream().filter(recovery$indy$32()).forEach(recovery$indy$33());
            }

            var10000 = recovery$indy$34(C_47eb.USE_ITEM, 4722040291102902023L, var5);
         }

         var10001 = var11;
      }

      label174: {
         label173:
         if (var10001 == null) {
            if (var10000) {
               var10000 = recovery$indy$35(field_43, 4721425336183477687L, var5).method_436$aae029aa0a();
               var10001 = var11;
               if (var1 < 0) {
                  break label174;
               }

               if (var11 != null) {
                  break label173;
               }

               if (var10000) {
                  recovery$indy$37(recovery$indy$36(C_47eb.USE_ITEM, 4725556097898393766L, var5), 4722725896720183922L, var5);
               }
            }

            var10000 = recovery$indy$38(C_47eb.OPEN_GUI, 4723531068994439212L, var5);
         }

         var10001 = var11;
      }

      label163: {
         label162: {
            label161: {
               if (var10001 == null) {
                  if (!var10000) {
                     break label161;
                  }

                  var12 = field_43;
                  var10001 = var11;
                  if (var3 <= 0L) {
                     break label163;
                  }

                  if (var11 != null) {
                     break label162;
                  }

                  var10000 = recovery$indy$39(field_43, 4722197296549760964L, var5);
               }

               if (!var10000) {
                  recovery$indy$41(recovery$indy$40(C_47eb.OPEN_GUI, 4725556097898393766L, var5), 4722725896720183922L, var5);
               }
            }

            var12 = field_43;
         }

         var10001 = var11;
      }

      if (var10001 == null) {
         label128:
         if (recovery$indy$42(var12, 4721425336183477687L, var5) == null) {
            label145: {
               var10000 = recovery$indy$43(C_47eb.STANDING_STILL, 4723531068994439212L, var5);
               label144:
               if (var11 == null) {
                  if (var10000) {
                     var10000 = recovery$indy$44(var9, 4720778935800842845L, var5);
                     var10001 = var11;
                     if (var1 <= 0) {
                        break label145;
                     }

                     if (var11 != null) {
                        break label144;
                     }

                     if (!var10000) {
                        recovery$indy$46(recovery$indy$45(C_47eb.STANDING_STILL, 4725556097898393766L, var5), 4722725896720183922L, var5);
                     }
                  }

                  var10000 = recovery$indy$47(var7, 4720168793986709319L, var5);
               }

               var10001 = var11;
            }

            label194: {
               if (var10001 == null) {
                  if (!var10000) {
                     break label128;
                  }

                  var14 = C_47eb.SCAFFOLD_TOGGLED;
                  if (var11 != null) {
                     break label194;
                  }

                  var10000 = recovery$indy$48(C_47eb.SCAFFOLD_TOGGLED, 4723531068994439212L, var5);
               }

               if (!var10000) {
                  break label128;
               }

               var14 = C_47eb.SCAFFOLD_TOGGLED;
            }

            recovery$indy$50(recovery$indy$49(var14, 4725556097898393766L, var5), 4722725896720183922L, var5);
         }

         var12 = field_43;
      }

      C_47K6 var15 = recovery$indy$51(var12, 4723632053075510982L, var5);
      if (var11 == null) {
         if (var15 == null) {
            return;
         }

         var15 = recovery$indy$52(field_43, 4723632053075510982L, var5);
      }

      C_47ri var16 = var15.method_49$431840b606();
      if (var11 == null) {
         if (var16 == null) {
            return;
         }

         recovery$indy$53(field_43, 4723632053075510982L, var5).method_49$431840b606().method_43$631790539f(new C_47vS());
         var16 = recovery$indy$54(field_43, 4723632053075510982L, var5).method_49$431840b606();
      }

      var16.method_45$631790539f(new C_47vS());
   }





   private boolean method_44$5909fdf9ee(long var1, Entity var3) {
      var1 = c ^ var1;
      long var4 = var1 ^ 75628803492661L;
      String var6 = recovery$indy$55(-7478118293365237652L, var1);
      Entity var10000 = var3;
      if (var6 == null) {
         if (var3 == recovery$indy$56(field_43, -7479082761006019578L, var1)) {
            return false;
         }

         var10000 = var3;
      }

      boolean var10001 = recovery$indy$57(C_47cl.PLAYER, -7480414344003258369L, var1);
      boolean var10002 = recovery$indy$58(C_47cl.MOB, -7480414344003258369L, var1);
      boolean var10003 = recovery$indy$59(C_47cl.ANIMAL, -7480414344003258369L, var1);
      boolean var10004 = recovery$indy$60(C_47cl.VILLAGER, -7480414344003258369L, var1);
      boolean var10005 = recovery$indy$61(C_47cl.ARMOR_STAND, -7480414344003258369L, var1);
      boolean var10006 = recovery$indy$62(C_47cl.INVISIBLE, -7480414344003258369L, var1);
      boolean var10007 = recovery$indy$63(C_47cl.TEAMMATES, -7480414344003258369L, var1);
      if (var6 == null) {
         var10007 = !var10007;
      }

      boolean var10008 = recovery$indy$64(C_47cl.TEAMMATES, -7480414344003258369L, var1);
      if (var6 == null) {
         var10008 = !var10008;
      }

      boolean var8 = recovery$indy$66(
         var10000,
         var10001,
         var10002,
         var10003,
         var10004,
         var10005,
         var10006,
         var10007,
         var10008,
         var4,
         true,
         recovery$indy$65(C_47cl.DEAD, -7480414344003258369L, var1),
         false,
         -7479657807244499556L,
         var1
      );
      return var6 != null ? var8 : var8;
   }



   private static void method_48$758fc8f1b9(Entity var0) {
      long var1 = c ^ 50512289153218L;
      long var10001 = -4471596090934405693L;
      Minecraft var8 = field_43;
      double var4 = var8.field_42P.method_44$ee256e8a75(var0);
      long var10000 = -4468373640216051287L;
      String var12 = C_47eb.method_48$0e30dfc966();
      long var10002 = -4471596090934405693L;
      Minecraft var9 = field_43;
      double var6 = var9.field_42P.method_46$ee256e8a75(var0);
      String var3 = var12;
      double var17;
      int var13 = (var17 = var4 - 2.0) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
      if (var3 == null) {
         if (var13 >= 0) {
            return;
         }

         double var18;
         var13 = (var18 = var6 - 1.0) == 0.0 ? 0 : (var18 < 0.0 ? -1 : 1);
      }

      if (var13 < 0) {
         var10001 = -4476331309957861166L;
         C_47eb var10 = C_47eb.SPLASH_POTION;
         C_47cu var14 = C_47eb.method_44$93deda978b(var10);
         var10001 = -4468113480848641530L;
         C_47cu var11 = var14;
         var11.method_46$da8c82d5d4();
      }
   }



   private void method_48$fc136bb64a(C_473U var1, long var2) {
      String var4;
      int var19;
      String var24;
      label121: {
         var2 = c ^ var2;
         long var10000 = -8356582147407328173L;
         var4 = C_47eb.method_48$0e30dfc966();
         long var10001 = -8357723003976710750L;
         C_47eb var6 = C_47eb.VELOCITY;
         var19 = (int) ((C_47eb.method_48$b40e761c1b(var6)) ? 1 : 0);
         label120:
         if (var4 == null) {
            if (var19 != 0) {
               var19 = (int) ((var1 instanceof C_46s) ? 1 : 0);
               if (var4 != null) {
                  break label120;
               }

               if (var19 != 0) {
                  C_46s var5 = (C_46s)var1;
                  long var23 = -8355336067854231495L;
                  Minecraft var7 = field_43;
                  if (var7.field_42P != null) {
                     var19 = var5.method_45$8abf5c6871();
                     var24 = var4;
                     if (var2 <= 0L) {
                        break label121;
                     }

                     if (var4 != null) {
                        break label120;
                     }

                     long var10002 = -8355336067854231495L;
                     Minecraft var8 = field_43;
                     if (var19 == var8.field_42P.method_49$8abf5c6871()) {
                        long var25 = -8351167440899605208L;
                        C_47eb var9 = C_47eb.VELOCITY;
                        C_47cu var20 = C_47eb.method_44$93deda978b(var9);
                        long var26 = -8357480925512089604L;
                        C_47cu var10 = var20;
                        var10.method_46$da8c82d5d4();
                     }
                  }
               }
            }

            long var27 = -8357723003976710750L;
            C_47eb var11 = C_47eb.EXPLOSION;
            var19 = (int) ((C_47eb.method_48$b40e761c1b(var11)) ? 1 : 0);
         }

         var24 = var4;
      }

      label106: {
         label105:
         if (var24 == null) {
            if (var19 != 0) {
               var19 = (int) ((var1 instanceof C_42L) ? 1 : 0);
               if (var4 != null) {
                  break label105;
               }

               label101:
               if (var19 != 0) {
                  label125: {
                     C_42L var18 = (C_42L)var1;
                     float var34;
                     var19 = (var34 = var18.method_44$bc607678b6() - 0.0F) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
                     var24 = var4;
                     if (var2 > 0L) {
                        if (var4 == null) {
                           if (var19 != 0) {
                              break label125;
                           }

                           float var35;
                           var19 = (var35 = var18.method_49$bc607678b6() - 0.0F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
                        }

                        var24 = var4;
                     }

                     if (var2 >= 0L) {
                        if (var24 == null) {
                           if (var19 != 0) {
                              break label125;
                           }

                           float var36;
                           var19 = (var36 = var18.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
                        }

                        var24 = var4;
                     }

                     if (var2 < 0L) {
                        break label106;
                     }

                     if (var24 != null) {
                        break label105;
                     }

                     if (var19 == 0) {
                        break label101;
                     }
                  }

                  long var29 = -8351167440899605208L;
                  C_47eb var12 = C_47eb.EXPLOSION;
                  C_47cu var21 = C_47eb.method_44$93deda978b(var12);
                  long var30 = -8357480925512089604L;
                  C_47cu var13 = var21;
                  var13.method_46$da8c82d5d4();
               }
            }

            long var31 = -8357723003976710750L;
            C_47eb var14 = C_47eb.TELEPORT;
            var19 = (int) ((C_47eb.method_48$b40e761c1b(var14)) ? 1 : 0);
         }

         var24 = var4;
      }

      if (var24 == null) {
         if (var19 == 0) {
            return;
         }

         var19 = (int) ((var1 instanceof C_47xZ) ? 1 : 0);
      }

      if (var19 != 0) {
         long var32 = -8351167440899605208L;
         C_47eb var15 = C_47eb.TELEPORT;
         C_47cu var22 = C_47eb.method_44$93deda978b(var15);
         long var33 = -8357480925512089604L;
         C_47cu var16 = var22;
         var16.method_46$da8c82d5d4();
      }
   }




   private boolean method_48$aae029aa0a() {
      long var1 = c ^ 56621256305527L;
      long var3 = var1 ^ 30395951624108L;
      long var10000 = -1564935627174630884L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -1563402867782465445L;
      long var6 = var3;
      ModeSetting var8 = this.settingTargetESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private static boolean method_49$7c2c45e4ce(Entity var0) {
      return var0 instanceof C_47BX;
   }



   private static void method_49$949b423eca(C_47Pi var0, C_47wr var1, C_47tf var2, boolean var3, RenderPass var4) {
      long var5 = c ^ 129217904524011L;
      long var7 = var5 ^ 36421802185656L;
      long var10002 = -4910916463749681174L;
      Minecraft var9 = field_43;
      long var10008 = -4913077935236278056L;
      boolean var10 = var3;
      double var11 = var2.field_47;
      double var13 = var2.field_41;
      double var15 = var2.field_40;
      long var17 = var7;
      C_47wr var19 = var1;
      EntityPlayerSP var20 = var9.field_42P;
      C_47Pi var21 = var0;
      var21.method_41$cec454e236(var20, var19, var17, var15, var13, var11, var10);
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_47 = null;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = c ^ 130688764931705L;
      long var3 = var1 ^ 103381663263394L;
      long var10002 = 8017507687749733717L;
      long var5 = var3;
      ModeSetting var7 = this.settingTargetESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   private boolean method_45$894f5cf30b(ModeSetting var1, long var2) {
      var2 = c ^ var2;
      long var4 = var2 ^ 83379625734926L;
      long var10000 = -654592980933921090L;
      String var6 = C_47eb.method_48$0e30dfc966();
      long var10002 = -653025174443993863L;
      long var7 = var4;
      ModeSetting var9 = var1;
      boolean var14 = var9.method_46$5f9dc63072(var7).equals("PlayerModel");
      if (var6 == null) {
         if (!var14) {
            var10002 = -653025174443993863L;
            long var10 = var4;
            ModeSetting var12 = var1;
            boolean var16 = var12.method_46$5f9dc63072(var10).equals("PlayerModelArmor");
            if (var6 != null) {
               return var16;
            }

            if (!var16) {
               return false;
            }
         }

         var14 = true;
      }

      return var14;
   }



   public void method_47$11b5865b8f(long var1, C_47Pi var3, EntityLivingBase var4, boolean var5) {
      long var12;
      double var15;
      double var17;
      double var19;
      label41: {
         long var6;
         long var8;
         long var10;
         label40: {
            C_47tf var41;
            label39: {
               var1 = c ^ var1;
               var6 = var1 ^ 83011020422553L;
               var8 = var1 ^ 12600987279281L;
               var10 = var1 ^ 35301045381219L;
               var12 = var1 ^ 78366994200656L;
               long var10000 = 5672326961774497516L;
               String var14 = C_47eb.method_48$0e30dfc966();
               long var10001 = 5674068767882728686L;
               BooleanSetting var22 = this.settingSmoothRendering;
               if (var22.method_49$aae029aa0a()) {
                  var41 = var4.field_43D;
                  if (var14 != null) {
                     break label39;
                  }

                  if (var4.field_43D != null) {
                     var41 = var4.field_42g;
                     if (var14 != null) {
                        break label39;
                     }

                     if (var4.field_42g != null) {
                        double var44 = var4.field_43D.field_40 - var4.field_42g.field_40;
                        long var10003 = 5674516002895571545L;
                        Minecraft var23 = field_43;
                        var15 = var4.field_42g.field_40 + var44 * var23.method_46$159e3d0645().field_49;
                        double var45 = var4.field_43D.field_41 - var4.field_42g.field_41;
                        var10003 = 5674516002895571545L;
                        Minecraft var24 = field_43;
                        var17 = var4.field_42g.field_41 + var45 * var24.method_46$159e3d0645().field_49;
                        double var46 = var4.field_43D.field_47 - var4.field_42g.field_47;
                        var10003 = 5674516002895571545L;
                        Minecraft var25 = field_43;
                        var19 = var4.field_42g.field_47 + var46 * var25.method_46$159e3d0645().field_49;
                        if (var1 <= 0L) {
                           break label41;
                        }

                        if (var14 == null) {
                           break label40;
                        }
                     }
                  }
               }

               var41 = var4.field_43r;
            }

            double var47 = var4.field_47N.field_40 - var4.field_43r.field_40;
            long var55 = 5674516002895571545L;
            Minecraft var26 = field_43;
            var15 = var41.field_40 + var47 * var26.method_46$159e3d0645().field_49;
            var47 = var4.field_47N.field_41 - var4.field_43r.field_41;
            var55 = 5674516002895571545L;
            Minecraft var27 = field_43;
            var17 = var4.field_43r.field_41 + var47 * var27.method_46$159e3d0645().field_49;
            var47 = var4.field_47N.field_47 - var4.field_43r.field_47;
            var55 = 5674516002895571545L;
            Minecraft var28 = field_43;
            var19 = var4.field_43r.field_47 + var47 * var28.method_46$159e3d0645().field_49;
         }

         long var10002 = 5667557879085560794L;
         long var29 = var6;
         ShaderOptions var31 = this.settingTarget;
         boolean var43 = var31.method_49$0dd78e0064(var29);
         long var58 = 5670968050229040234L;
         long var32 = var10;
         ShaderOptions var34 = this.settingTarget;
         boolean var50 = var34.method_47$0dd78e0064(var32);
         var58 = 5674253745110732539L;
         C_47uI.method_40$9bd74f13d3(var43, var50, var8);
      }

      long var51 = 5673274346386354621L;
      C_47Pi var35 = var3;
      C_47wr var21 = var35.method_43$e97f03698c();
      C_47Fw var52 = recovery$indy$67(var3, var4, var21, var15, var17, var19, var5);
      long var60 = 5671857699895668843L;
      C_47Fw var36 = var52;
      long var37 = var12;
      boolean var39 = false;
      C_47uI.method_42$300c7fd546(var39, var37, var36);
   }





   private boolean method_43$5909fdf9ee(long var1, Entity var3) {
      var1 = c ^ var1;
      long var4 = var1 ^ 65722893377519L;
      String var6 = recovery$indy$68(-8295036749120516938L, var1);
      Entity var10000 = var3;
      if (var6 == null) {
         if (var3 == recovery$indy$69(field_43, -8291537220029114148L, var1)) {
            return false;
         }

         var10000 = var3;
      }

      boolean var8 = recovery$indy$76(
         var10000,
         recovery$indy$70(C_47S.PLAYER, -8295122407435083139L, var1),
         recovery$indy$71(C_47S.MOB, -8295122407435083139L, var1),
         recovery$indy$72(C_47S.ANIMAL, -8295122407435083139L, var1),
         recovery$indy$73(C_47S.VILLAGER, -8295122407435083139L, var1),
         false,
         recovery$indy$74(C_47S.INVISIBLE, -8295122407435083139L, var1),
         false,
         false,
         var4,
         true,
         recovery$indy$75(C_47S.DEAD, -8295122407435083139L, var1),
         false,
         -8293213973554663098L,
         var1
      );
      return var6 != null ? var8 : var8;
   }



    public void onRender3D(long l, float f) {
        block12: {
            boolean bl;
            long l2;
            block18: {
                long l3;
                long l4;
                long l5;
                block19: {
                    Minecraft c_47nT;
                    String string;
                    block17: {
                        boolean bl2;
                        block16: {
                            String string2;
                            long l6;
                            block15: {
                                block13: {
                                    long l7;
                                    block14: {
                                        String string3;
                                        block11: {
                                            block9: {
                                                block10: {
                                                    long l8 = l;
                                                    l7 = l8 ^ 0x31BC9A9AAC37L;
                                                    l5 = l8 ^ 0x44FF288F43DEL;
                                                    l4 = l8 ^ 0x4F54FB3E1F6L;
                                                    l3 = l8 ^ 0x2F9B80A81624L;
                                                    long l9 = l8 ^ 0xA4C1B84F719L;
                                                    l6 = l8 ^ 0x822929CB51BL;
                                                    l2 = l8 ^ 0x48C69634C617L;
                                                    string = C_47eb.method_48$0e30dfc966();
                                                    long l10 = l9;
                                                    long l11 = 3L;
                                                    C_47cu c_47cu = this.field_41k;
                                                    bl2 = c_47cu.method_42$b0e346e6e3(l11, l10);
                                                    if (string == null) {
                                                        if (bl2) {
                                                            C_47cu c_47cu2 = this.field_41k;
                                                            c_47cu2.method_46$da8c82d5d4();
                                                            Minecraft c_47nT2 = field_43;
                                                            c_47nT2.method_40$f8db5d9e73().method_49$431840b606().method_43$631790539f((C_473U)new C_47vS());
                                                            Minecraft c_47nT3 = field_43;
                                                            c_47nT3.method_40$f8db5d9e73().method_49$431840b606().method_45$631790539f((C_473U)new C_47vS());
                                                        }
                                                        RenderUtils.method_42$da8c82d5d4();
                                                        PacketHandler_47Cq packetHandler_47Cq = ClientGlobals.field_48.field_489;
                                                        bl2 = packetHandler_47Cq.method_45_$aae029aa0a();
                                                    }
                                                    if (string != null) break block9;
                                                    if (bl2) break block10;
                                                    long l12 = l7;
                                                    PacketHandler_47Cq packetHandler_47Cq = ClientGlobals.field_48.field_489;
                                                    bl2 = packetHandler_47Cq.method_48$0dd78e0064(l12);
                                                    string3 = string;
                                                    if (l < 0L) break block11;
                                                    if (string3 != null) break block9;
                                                    if (!bl2) break block12;
                                                }
                                                long l13 = l6;
                                                ModeSetting c_47Tj = this.settingTargetESP;
                                                bl2 = c_47Tj.method_46$5f9dc63072(l13).equals(Ping_47C0.recovery$indy$77(1984, 0x3399D6A39FAE690DL ^ l));
                                            }
                                            string3 = string;
                                        }
                                        if (string3 != null) break block13;
                                        if (!bl2) break block14;
                                        PacketHandler_47Cq packetHandler_47Cq = ClientGlobals.field_48.field_489;
                                        bl2 = packetHandler_47Cq.method_45_$aae029aa0a();
                                        string2 = string;
                                        if (l <= 0L) break block15;
                                        if (string2 != null) break block13;
                                        if (bl2) {
                                            long l14 = l5;
                                            ShaderOptions c_47T2 = this.settingTarget;
                                            long l15 = l3;
                                            ShaderOptions c_47T22 = this.settingTarget;
                                            C_47uI.method_40$9bd74f13d3((boolean)c_47T2.method_49$0dd78e0064(l14), (boolean)c_47T22.method_47$0dd78e0064(l15), (long)l4);
                                            C_47Fw c_47Fw = Ping_47C0.recovery$indy$78(this);
                                            long l16 = l2;
                                            boolean bl3 = false;
                                            C_47uI.method_42$300c7fd546((boolean)bl3, (long)l16, (C_47Fw)c_47Fw);
                                        }
                                    }
                                    long l17 = l7;
                                    PacketHandler_47Cq packetHandler_47Cq = ClientGlobals.field_48.field_489;
                                    bl2 = packetHandler_47Cq.method_48$0dd78e0064(l17);
                                }
                                string2 = string;
                            }
                            if (string2 != null) break block16;
                            if (!bl2) break block12;
                            long l18 = l6;
                            ModeSetting c_47Tj = this.settingPlayerESP;
                            bl2 = c_47Tj.method_46$5f9dc63072(l18).equals(Ping_47C0.recovery$indy$79(1984, 0x3399D6A39FAE690DL ^ l));
                        }
                        if (!bl2) break block12;
                        c_47nT = field_43;
                        if (string != null) break block17;
                        Minecraft c_47nT4 = c_47nT;
                        if (c_47nT4.field_42P == null) break block12;
                        c_47nT = field_43;
                    }
                    Minecraft c_47nT5 = c_47nT;
                    bl = (c_47nT5.field_44r.field_44S != 0);
                    if (string != null) break block18;
                    if (bl) break block19;
                    BooleanSetting c_47TV = this.settingOnlyInThirdPerson;
                    bl = c_47TV.method_49$aae029aa0a();
                    if (string != null) break block18;
                    if (bl) break block12;
                }
                long l19 = l5;
                ShaderOptions c_47T2 = this.settingPlayer;
                long l20 = l3;
                ShaderOptions c_47T23 = this.settingPlayer;
                C_47uI.method_40$9bd74f13d3((boolean)c_47T2.method_49$0dd78e0064(l19), (boolean)c_47T23.method_47$0dd78e0064(l20), (long)l4);
                bl = false;
            }
            C_47Fw c_47Fw = Ping_47C0.recovery$indy$80(this);
            long l21 = l2;
            boolean bl4 = bl;
            C_47uI.method_42$300c7fd546((boolean)bl4, (long)l21, (C_47Fw)c_47Fw);
        }
        RenderUtils.method_43$da8c82d5d4();
    }






   private static void method_43$709ea9dc54(C_47Pi var0, EntityLivingBase var1, C_47wr var2, double var3, double var5, double var7, boolean var9, RenderPass var10) {
      long var11 = c ^ 78567784567599L;
      long var13 = var11 ^ 21788423305852L;
      long var10008 = 5914650552423248156L;
      boolean var15 = var9;
      double var16 = var7;
      double var18 = var5;
      double var20 = var3;
      long var22 = var13;
      C_47wr var24 = var2;
      EntityLivingBase var25 = var1;
      C_47Pi var26 = var0;
      var26.method_41$cec454e236(var25, var24, var22, var20, var18, var16, var15);
   }



   private void method_43$fc136bb64a(net.C_473U var1, long var2) {
        java.lang.String var105;
        java.lang.String var106;
        java.lang.String var111;
        java.lang.String var113;
        java.lang.String var114;
        java.lang.String var117;
        java.lang.String var139;
        java.lang.String var140;
        boolean var62;
        int var63;
        boolean var64;
        boolean var71;
        boolean var72;
        boolean var73;
        int var74;
        java.lang.String var82;
        java.lang.String var83;
        java.lang.String var86;
      var2 = c ^ var2;
      long var10000 = 5812560870948901118L;
      String var4 = net.C_47eb.method_48$0e30dfc966();
      long var10001 = 5813071221147290364L;
      client.setting.BooleanSetting var6 = this.settingCombatMode;
      boolean var61 = var6.method_49$aae029aa0a();
      if (var4 == null) {
         C_42V var21;
         label1134: {
            label1135: {
               label847: {
                  label1045: {
                     label1046: {
                        label844: {
                           label843: {
                              label1047: {
                                 label1048: {
                                    label1049: {
                                       label1083: {
                                          label1052: {
                                             label1053: {
                                                label1054: {
                                                   label1055: {
                                                      label1056: {
                                                         label1057: {
                                                            label831: {
                                                               label1080: {
                                                                  if (var61 && var1 instanceof C_47WF && ((C_47WF)var1).method_45$75ce8b0544() == net.C_41Z.ATTACK) {
                                                                     var72 = this.field_43v;
                                                                     if (var2 < 0L) {
                                                                        if (var4 == null) {
                                                                           if (this.field_43v) {
                                                                              var72 = var1 instanceof C_47WF;
                                                                              var111 = var4;
                                                                              long var184;
                                                                              int var171 = (var184 = var2 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
                                                                              break label844;
                                                                           }

                                                                           var10001 = 5813670663240505615L;
                                                                           net.C_47eb var28 = net.C_47eb.INVENTORY_ACTIONS;
                                                                           var72 = net.C_47eb.method_48$b40e761c1b(var28);
                                                                        }

                                                                        var111 = var4;
                                                                        break label844;
                                                                     }

                                                                     if (var4 == null) {
                                                                        if (this.field_43v) {
                                                                           this.field_43v = false;
                                                                           var10001 = 5812294440951964497L;
                                                                           net.C_47cu var7 = this.field_41d;
                                                                           var7.method_46$da8c82d5d4();
                                                                        }

                                                                        var10001 = 5813670663240505615L;
                                                                        net.C_47eb var22 = net.C_47eb.ATTACK;
                                                                        var72 = net.C_47eb.method_48$b40e761c1b(var22);
                                                                     }

                                                                     if (var4 != null) {
                                                                        break label1057;
                                                                     }

                                                                     if (!var72) {
                                                                        break label1080;
                                                                     }

                                                                     var72 = var1 instanceof C_47WF;
                                                                     var111 = var4;
                                                                     long var177;
                                                                     int var162 = (var177 = var2 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                                                                  } else {
                                                                     var10001 = 5813670663240505615L;
                                                                     net.C_47eb var8 = net.C_47eb.ATTACK;
                                                                     var71 = net.C_47eb.method_48$b40e761c1b(var8);
                                                                     if (var4 != null) {
                                                                        break label831;
                                                                     }

                                                                     if (!var71) {
                                                                        var10001 = 5813670663240505615L;
                                                                        net.C_47eb var26 = net.C_47eb.INVENTORY_ACTIONS;
                                                                        var71 = net.C_47eb.method_48$b40e761c1b(var26);
                                                                        break label831;
                                                                     }

                                                                     var72 = var1 instanceof C_47WF;
                                                                     var111 = var4;
                                                                     if (var2 < 0L) {
                                                                        break label844;
                                                                     }
                                                                  }

                                                                  if (var111 != null) {
                                                                     break label1057;
                                                                  }

                                                                  if (var72 && ((C_47WF)var1).method_45$75ce8b0544() == net.C_41Z.ATTACK) {
                                                                     var10001 = 5816285576609538437L;
                                                                     net.C_47eb var23 = net.C_47eb.ATTACK;
                                                                     net.C_47cu var75 = net.C_47eb.method_44$93deda978b(var23);
                                                                     var10001 = 5812294440951964497L;
                                                                     net.C_47cu var24 = var75;
                                                                     var24.method_46$da8c82d5d4();
                                                                  }
                                                               }

                                                               var10001 = 5813670663240505615L;
                                                               net.C_47eb var27 = net.C_47eb.INVENTORY_ACTIONS;
                                                               var72 = net.C_47eb.method_48$b40e761c1b(var27);
                                                               break label1057;
                                                            }

                                                            if (var4 != null) {
                                                               break label1055;
                                                            }

                                                            if (!var71) {
                                                               var10001 = 5813670663240505615L;
                                                               net.C_47eb var34 = net.C_47eb.BREAK_BLOCKS;
                                                               var71 = net.C_47eb.method_48$b40e761c1b(var34);
                                                               break label1055;
                                                            }

                                                            var73 = var1 instanceof C_47Is;
                                                            var113 = var4;
                                                            if (var2 <= 0L) {
                                                               long var178;
                                                               int var159 = (var178 = var2 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                                                               if (var4 == null) {
                                                                  if (var73) {
                                                                     var73 = var1 instanceof C_45J;
                                                                     var114 = var4;
                                                                     long var179;
                                                                     var159 = (var179 = var2 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
                                                                     break label1048;
                                                                  }

                                                                  var73 = var1 instanceof C_42V;
                                                               }

                                                               var114 = var4;
                                                               break label1048;
                                                            }
                                                            break label1056;
                                                         }

                                                         if (var4 != null) {
                                                            break label1054;
                                                         }

                                                         if (!var72) {
                                                            var10001 = 5813670663240505615L;
                                                            net.C_47eb var36 = net.C_47eb.BREAK_BLOCKS;
                                                            var72 = net.C_47eb.method_48$b40e761c1b(var36);
                                                            break label1054;
                                                         }

                                                         var73 = var1 instanceof C_47Is;
                                                         var113 = var4;
                                                         if (var2 <= 0L) {
                                                            long var180;
                                                            int var165 = (var180 = var2 - 0L) == 0L ? 0 : (var180 < 0L ? -1 : 1);
                                                            if (var4 == null) {
                                                               if (var73) {
                                                                  var73 = var1 instanceof C_45J;
                                                                  var114 = var4;
                                                                  long var181;
                                                                  var165 = (var181 = var2 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
                                                                  break label1049;
                                                               }

                                                               var73 = var1 instanceof C_42V;
                                                            }

                                                            var114 = var4;
                                                            break label1049;
                                                         }
                                                      }

                                                      label797: {
                                                         label796: {
                                                            label1061: {
                                                               if (var113 == null) {
                                                                  if (var73) {
                                                                     break label1061;
                                                                  }

                                                                  var73 = var1 instanceof C_47dz;
                                                               }

                                                               long var182;
                                                               int var163 = (var182 = var2 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
                                                               if (var4 != null) {
                                                                  break label797;
                                                               }

                                                               if (!var73) {
                                                                  break label796;
                                                               }
                                                            }

                                                            var10001 = 5816285576609538437L;
                                                            net.C_47eb var29 = net.C_47eb.INVENTORY_ACTIONS;
                                                            net.C_47cu var76 = net.C_47eb.method_44$93deda978b(var29);
                                                            var10001 = 5812294440951964497L;
                                                            net.C_47cu var30 = var76;
                                                            var30.method_46$da8c82d5d4();
                                                         }

                                                         var10001 = 5813670663240505615L;
                                                         net.C_47eb var35 = net.C_47eb.BREAK_BLOCKS;
                                                         var73 = net.C_47eb.method_48$b40e761c1b(var35);
                                                      }

                                                      if (var4 != null) {
                                                         break label1046;
                                                      }

                                                      if (!var73) {
                                                         break label1047;
                                                      }

                                                      var73 = var1 instanceof C_45J;
                                                      var114 = var4;
                                                      long var183;
                                                      int var164 = (var183 = var2 - 0L) == 0L ? 0 : (var183 < 0L ? -1 : 1);
                                                      break label1053;
                                                   }

                                                   if (var4 != null) {
                                                      break label1052;
                                                   }

                                                   if (!var71) {
                                                      var71 = var1 instanceof C_42V;
                                                      break label1052;
                                                   }

                                                   var73 = var1 instanceof C_45J;
                                                   var114 = var4;
                                                   if (var2 <= 0L) {
                                                      break label1048;
                                                   }
                                                   break label1053;
                                                }

                                                if (var4 != null) {
                                                   break label1083;
                                                }

                                                if (!var72) {
                                                   var72 = var1 instanceof C_42V;
                                                   break label1083;
                                                }

                                                var73 = var1 instanceof C_45J;
                                                var114 = var4;
                                                if (var2 <= 0L) {
                                                   break label1049;
                                                }
                                             }

                                             if (var114 != null) {
                                                break label1046;
                                             }

                                             if (var73) {
                                                var10001 = 5816285576609538437L;
                                                net.C_47eb var38 = net.C_47eb.BREAK_BLOCKS;
                                                net.C_47cu var77 = net.C_47eb.method_44$93deda978b(var38);
                                                var10001 = 5812294440951964497L;
                                                net.C_47cu var39 = var77;
                                                var39.method_46$da8c82d5d4();
                                             }
                                             break label1047;
                                          }

                                          if (var4 == null) {
                                             if (!var71) {
                                                return;
                                             }

                                             var10001 = 5813670663240505615L;
                                             net.C_47eb var46 = net.C_47eb.PLACE_BLOCK;
                                             var71 = net.C_47eb.method_48$b40e761c1b(var46);
                                          }

                                          if (!var71) {
                                             return;
                                          }

                                          var21 = (C_42V)var1;
                                          float var185;
                                          var74 = (var185 = var21.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var185 < 0.0F ? -1 : 1);
                                          var117 = var4;
                                          if (var2 > 0L) {
                                             break label1134;
                                          }
                                          break label843;
                                       }

                                       if (var4 == null) {
                                          if (!var72) {
                                             return;
                                          }

                                          var10001 = 5813670663240505615L;
                                          net.C_47eb var49 = net.C_47eb.PLACE_BLOCK;
                                          var72 = net.C_47eb.method_48$b40e761c1b(var49);
                                       }

                                       if (!var72) {
                                          return;
                                       }

                                       var21 = (C_42V)var1;
                                       float var186;
                                       var74 = (var186 = var21.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var186 < 0.0F ? -1 : 1);
                                       var117 = var4;
                                       if (var2 > 0L) {
                                          break label1134;
                                       }
                                       break label1045;
                                    }

                                    if (var114 == null) {
                                       if (!var73) {
                                          return;
                                       }

                                       var10001 = 5813670663240505615L;
                                       net.C_47eb var48 = net.C_47eb.PLACE_BLOCK;
                                       var73 = net.C_47eb.method_48$b40e761c1b(var48);
                                    }

                                    if (!var73) {
                                       return;
                                    }

                                    var21 = (C_42V)var1;
                                    float var187;
                                    var74 = (var187 = var21.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var187 < 0.0F ? -1 : 1);
                                    var117 = var4;
                                    long var188;
                                    int var168 = (var188 = var2 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
                                    break label1045;
                                 }

                                 if (var114 == null) {
                                    if (!var73) {
                                       return;
                                    }

                                    var10001 = 5813670663240505615L;
                                    net.C_47eb var45 = net.C_47eb.PLACE_BLOCK;
                                    var73 = net.C_47eb.method_48$b40e761c1b(var45);
                                 }

                                 if (!var73) {
                                    return;
                                 }

                                 var21 = (C_42V)var1;
                                 float var189;
                                 var74 = (var189 = var21.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var189 < 0.0F ? -1 : 1);
                                 var117 = var4;
                                 long var190;
                                 int var161 = (var190 = var2 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
                                 break label843;
                              }

                              var73 = var1 instanceof C_42V;
                              break label1046;
                           }

                           if (var2 >= 0L) {
                              break label1135;
                           }
                           break label847;
                        }

                        label731: {
                           if (var111 == null) {
                              if (var72) {
                                 var72 = var1 instanceof C_47Is;
                                 var139 = var4;
                                 long var191;
                                 int var172 = (var191 = var2 - 0L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
                                 long var192;
                                 var172 = (var192 = var2 - 0L) == 0L ? 0 : (var192 < 0L ? -1 : 1);
                                 break label731;
                              }

                              var10001 = 5813670663240505615L;
                              net.C_47eb var37 = net.C_47eb.BREAK_BLOCKS;
                              var72 = net.C_47eb.method_48$b40e761c1b(var37);
                           }

                           var139 = var4;
                        }

                        label725: {
                           if (var139 == null) {
                              if (var72) {
                                 var72 = var1 instanceof C_45J;
                                 var140 = var4;
                                 long var193;
                                 int var174 = (var193 = var2 - 0L) == 0L ? 0 : (var193 < 0L ? -1 : 1);
                                 break label725;
                              }

                              var72 = var1 instanceof C_42V;
                           }

                           var140 = var4;
                        }

                        if (var140 == null) {
                           if (!var72) {
                              return;
                           }

                           var10001 = 5813670663240505615L;
                           net.C_47eb var50 = net.C_47eb.PLACE_BLOCK;
                           var72 = net.C_47eb.method_48$b40e761c1b(var50);
                        }

                        if (!var72) {
                           return;
                        }

                        var21 = (C_42V)var1;
                        float var194;
                        var74 = (var194 = var21.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var194 < 0.0F ? -1 : 1);
                        var117 = var4;
                        long var195;
                        int var175 = (var195 = var2 - 0L) == 0L ? 0 : (var195 < 0L ? -1 : 1);
                        long var196;
                        var175 = (var196 = var2 - 0L) == 0L ? 0 : (var196 < 0L ? -1 : 1);
                        break label847;
                     }

                     if (var4 == null) {
                        if (!var73) {
                           return;
                        }

                        var10001 = 5813670663240505615L;
                        net.C_47eb var47 = net.C_47eb.PLACE_BLOCK;
                        var73 = net.C_47eb.method_48$b40e761c1b(var47);
                     }

                     if (!var73) {
                        return;
                     }

                     var21 = (C_42V)var1;
                     float var197;
                     var74 = (var197 = var21.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var197 < 0.0F ? -1 : 1);
                     var117 = var4;
                     long var198;
                     int var167 = (var198 = var2 - 0L) == 0L ? 0 : (var198 < 0L ? -1 : 1);
                     break label1134;
                  }

                  long var199;
                  int var169 = (var199 = var2 - 0L) == 0L ? 0 : (var199 < 0L ? -1 : 1);
                  break label1135;
               }

               if (var117 == null) {
                  if (var74 == 0) {
                     return;
                  }

                  var74 = var21.method_44$8abf5c6871();
               }

               if (var74 != 255) {
                  var10001 = 5816285576609538437L;
                  net.C_47eb var55 = net.C_47eb.PLACE_BLOCK;
                  net.C_47cu var80 = net.C_47eb.method_44$93deda978b(var55);
                  var10001 = 5812294440951964497L;
                  net.C_47cu var60 = var80;
                  var60.method_46$da8c82d5d4();
               }

               return;
            }

            if (var117 == null) {
               if (var74 == 0) {
                  return;
               }

               float var200;
               var74 = (var200 = var21.method_40$bc607678b6() - 0.0F) == 0.0F ? 0 : (var200 < 0.0F ? -1 : 1);
            }

            if (var4 == null) {
               if (var74 == 0) {
                  return;
               }

               var74 = var21.method_44$8abf5c6871();
            }

            if (var74 != 255) {
               var10001 = 5816285576609538437L;
               net.C_47eb var53 = net.C_47eb.PLACE_BLOCK;
               net.C_47cu var78 = net.C_47eb.method_44$93deda978b(var53);
               var10001 = 5812294440951964497L;
               net.C_47cu var58 = var78;
               var58.method_46$da8c82d5d4();
            }

            return;
         }

         if (var117 == null) {
            if (var74 == 0) {
               return;
            }

            float var201;
            var74 = (var201 = var21.method_48$bc607678b6() - 0.0F) == 0.0F ? 0 : (var201 < 0.0F ? -1 : 1);
         }

         long var202;
         int var170 = (var202 = var2 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
         if (var4 == null) {
            if (var74 == 0) {
               return;
            }

            float var203;
            var74 = (var203 = var21.method_40$bc607678b6() - 0.0F) == 0.0F ? 0 : (var203 < 0.0F ? -1 : 1);
         }

         if (var4 == null) {
            if (var74 == 0) {
               return;
            }

            var74 = var21.method_44$8abf5c6871();
         }

         if (var74 != 255) {
            var10001 = 5816285576609538437L;
            net.C_47eb var54 = net.C_47eb.PLACE_BLOCK;
            net.C_47cu var79 = net.C_47eb.method_44$93deda978b(var54);
            var10001 = 5812294440951964497L;
            net.C_47cu var59 = var79;
            var59.method_46$da8c82d5d4();
         }
      } else {
         C_42V var5;
         label1137: {
            label1138: {
               label1030: {
                  label1084: {
                     label1027: {
                        label1026: {
                           label1067: {
                              label1068: {
                                 label1069: {
                                    label1070: {
                                       label1071: {
                                          label1072: {
                                             label1073: {
                                                label1074: {
                                                   label1075: {
                                                      if (var4 == null) {
                                                         if (var61) {
                                                            var64 = var1 instanceof C_47WF;
                                                            if (var2 < 0L) {
                                                               label940: {
                                                                  if (var4 == null) {
                                                                     if (var64) {
                                                                        var64 = var1 instanceof C_47Is;
                                                                        var105 = var4;
                                                                        long var216;
                                                                        int var154 = (var216 = var2 - 0L) == 0L ? 0 : (var216 < 0L ? -1 : 1);
                                                                        long var217;
                                                                        var154 = (var217 = var2 - 0L) == 0L ? 0 : (var217 < 0L ? -1 : 1);
                                                                        break label940;
                                                                     }

                                                                     var10001 = 5813670663240505615L;
                                                                     net.C_47eb var33 = net.C_47eb.BREAK_BLOCKS;
                                                                     var64 = net.C_47eb.method_48$b40e761c1b(var33);
                                                                  }

                                                                  var105 = var4;
                                                               }

                                                               label934: {
                                                                  if (var105 == null) {
                                                                     if (var64) {
                                                                        var64 = var1 instanceof C_45J;
                                                                        var106 = var4;
                                                                        long var218;
                                                                        int var156 = (var218 = var2 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
                                                                        break label934;
                                                                     }

                                                                     var64 = var1 instanceof C_42V;
                                                                  }

                                                                  var106 = var4;
                                                               }

                                                               if (var106 == null) {
                                                                  if (!var64) {
                                                                     return;
                                                                  }

                                                                  var10001 = 5813670663240505615L;
                                                                  net.C_47eb var44 = net.C_47eb.PLACE_BLOCK;
                                                                  var64 = net.C_47eb.method_48$b40e761c1b(var44);
                                                               }

                                                               if (!var64) {
                                                                  return;
                                                               }

                                                               var5 = (C_42V)var1;
                                                               float var219;
                                                               var63 = (var219 = var5.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var219 < 0.0F ? -1 : 1);
                                                               var86 = var4;
                                                               long var220;
                                                               int var157 = (var220 = var2 - 0L) == 0L ? 0 : (var220 < 0L ? -1 : 1);
                                                               long var221;
                                                               var157 = (var221 = var2 - 0L) == 0L ? 0 : (var221 < 0L ? -1 : 1);
                                                               break label1030;
                                                            }

                                                            if (var4 == null) {
                                                               if (var64 && ((C_47WF)var1).method_45$75ce8b0544() == net.C_41Z.ATTACK) {
                                                                  var10001 = 5816285576609538437L;
                                                                  net.C_47eb var9 = net.C_47eb.ATTACK;
                                                                  net.C_47cu var65 = net.C_47eb.method_44$93deda978b(var9);
                                                                  var10001 = 5812294440951964497L;
                                                                  net.C_47cu var10 = var65;
                                                                  var10.method_46$da8c82d5d4();
                                                               }

                                                               var10001 = 5813670663240505615L;
                                                               net.C_47eb var25 = net.C_47eb.INVENTORY_ACTIONS;
                                                               var64 = net.C_47eb.method_48$b40e761c1b(var25);
                                                            }

                                                            if (var4 != null) {
                                                               break label1073;
                                                            }

                                                            if (!var64) {
                                                               var10001 = 5813670663240505615L;
                                                               net.C_47eb var32 = net.C_47eb.BREAK_BLOCKS;
                                                               var64 = net.C_47eb.method_48$b40e761c1b(var32);
                                                               break label1073;
                                                            }

                                                            var62 = var1 instanceof C_47Is;
                                                            var82 = var4;
                                                            if (var2 <= 0L) {
                                                               long var204;
                                                               int var148 = (var204 = var2 - 0L) == 0L ? 0 : (var204 < 0L ? -1 : 1);
                                                               if (var4 == null) {
                                                                  if (var62) {
                                                                     var62 = var1 instanceof C_45J;
                                                                     var83 = var4;
                                                                     long var205;
                                                                     var148 = (var205 = var2 - 0L) == 0L ? 0 : (var205 < 0L ? -1 : 1);
                                                                     break label1069;
                                                                  }

                                                                  var62 = var1 instanceof C_42V;
                                                               }

                                                               var83 = var4;
                                                               break label1069;
                                                            }
                                                            break label1075;
                                                         }

                                                         var10001 = 5813670663240505615L;
                                                         net.C_47eb var11 = net.C_47eb.INVENTORY_ACTIONS;
                                                         var61 = net.C_47eb.method_48$b40e761c1b(var11);
                                                      }

                                                      if (var4 != null) {
                                                         break label1074;
                                                      }

                                                      if (!var61) {
                                                         var10001 = 5813670663240505615L;
                                                         net.C_47eb var14 = net.C_47eb.BREAK_BLOCKS;
                                                         var61 = net.C_47eb.method_48$b40e761c1b(var14);
                                                         break label1074;
                                                      }

                                                      var62 = var1 instanceof C_47Is;
                                                      var82 = var4;
                                                      if (var2 <= 0L) {
                                                         long var206;
                                                         int var10002 = (var206 = var2 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
                                                         if (var4 == null) {
                                                            if (var62) {
                                                               var62 = var1 instanceof C_45J;
                                                               var83 = var4;
                                                               long var207;
                                                               var10002 = (var207 = var2 - 0L) == 0L ? 0 : (var207 < 0L ? -1 : 1);
                                                               break label1068;
                                                            }

                                                            var62 = var1 instanceof C_42V;
                                                         }

                                                         var83 = var4;
                                                         break label1068;
                                                      }
                                                   }

                                                   label999: {
                                                      label998: {
                                                         label1077: {
                                                            if (var82 == null) {
                                                               if (var62) {
                                                                  break label1077;
                                                               }

                                                               var62 = var1 instanceof C_47dz;
                                                            }

                                                            long var208;
                                                            int var146 = (var208 = var2 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                                                            if (var4 != null) {
                                                               break label999;
                                                            }

                                                            if (!var62) {
                                                               break label998;
                                                            }
                                                         }

                                                         var10001 = 5816285576609538437L;
                                                         net.C_47eb var12 = net.C_47eb.INVENTORY_ACTIONS;
                                                         net.C_47cu var66 = net.C_47eb.method_44$93deda978b(var12);
                                                         var10001 = 5812294440951964497L;
                                                         net.C_47cu var13 = var66;
                                                         var13.method_46$da8c82d5d4();
                                                      }

                                                      var10001 = 5813670663240505615L;
                                                      net.C_47eb var31 = net.C_47eb.BREAK_BLOCKS;
                                                      var62 = net.C_47eb.method_48$b40e761c1b(var31);
                                                   }

                                                   if (var4 != null) {
                                                      break label1027;
                                                   }

                                                   if (!var62) {
                                                      break label1067;
                                                   }

                                                   var62 = var1 instanceof C_45J;
                                                   var83 = var4;
                                                   long var209;
                                                   int var147 = (var209 = var2 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                                                   break label1072;
                                                }

                                                if (var4 != null) {
                                                   break label1071;
                                                }

                                                if (!var61) {
                                                   var61 = var1 instanceof C_42V;
                                                   break label1071;
                                                }

                                                var62 = var1 instanceof C_45J;
                                                var83 = var4;
                                                if (var2 <= 0L) {
                                                   break label1068;
                                                }
                                                break label1072;
                                             }

                                             if (var4 != null) {
                                                break label1070;
                                             }

                                             if (!var64) {
                                                var64 = var1 instanceof C_42V;
                                                break label1070;
                                             }

                                             var62 = var1 instanceof C_45J;
                                             var83 = var4;
                                             if (var2 <= 0L) {
                                                break label1069;
                                             }
                                          }

                                          if (var83 != null) {
                                             break label1027;
                                          }

                                          if (var62) {
                                             var10001 = 5816285576609538437L;
                                             net.C_47eb var15 = net.C_47eb.BREAK_BLOCKS;
                                             net.C_47cu var67 = net.C_47eb.method_44$93deda978b(var15);
                                             var10001 = 5812294440951964497L;
                                             net.C_47cu var16 = var67;
                                             var16.method_46$da8c82d5d4();
                                          }
                                          break label1067;
                                       }

                                       if (var4 == null) {
                                          if (!var61) {
                                             return;
                                          }

                                          var10001 = 5813670663240505615L;
                                          net.C_47eb var40 = net.C_47eb.PLACE_BLOCK;
                                          var61 = net.C_47eb.method_48$b40e761c1b(var40);
                                       }

                                       if (!var61) {
                                          return;
                                       }

                                       var5 = (C_42V)var1;
                                       float var210;
                                       var63 = (var210 = var5.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var210 < 0.0F ? -1 : 1);
                                       var86 = var4;
                                       if (var2 > 0L) {
                                          break label1137;
                                       }
                                       break label1026;
                                    }

                                    if (var4 == null) {
                                       if (!var64) {
                                          return;
                                       }

                                       var10001 = 5813670663240505615L;
                                       net.C_47eb var43 = net.C_47eb.PLACE_BLOCK;
                                       var64 = net.C_47eb.method_48$b40e761c1b(var43);
                                    }

                                    if (!var64) {
                                       return;
                                    }

                                    var5 = (C_42V)var1;
                                    float var211;
                                    var63 = (var211 = var5.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var211 < 0.0F ? -1 : 1);
                                    var86 = var4;
                                    if (var2 > 0L) {
                                       break label1137;
                                    }
                                    break label1084;
                                 }

                                 if (var83 == null) {
                                    if (!var62) {
                                       return;
                                    }

                                    var10001 = 5813670663240505615L;
                                    net.C_47eb var42 = net.C_47eb.PLACE_BLOCK;
                                    var62 = net.C_47eb.method_48$b40e761c1b(var42);
                                 }

                                 if (!var62) {
                                    return;
                                 }

                                 var5 = (C_42V)var1;
                                 float var212;
                                 var63 = (var212 = var5.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var212 < 0.0F ? -1 : 1);
                                 var86 = var4;
                                 long var213;
                                 int var151 = (var213 = var2 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                                 break label1084;
                              }

                              if (var83 == null) {
                                 if (!var62) {
                                    return;
                                 }

                                 var10001 = 5813670663240505615L;
                                 net.C_47eb var17 = net.C_47eb.PLACE_BLOCK;
                                 var62 = net.C_47eb.method_48$b40e761c1b(var17);
                              }

                              if (!var62) {
                                 return;
                              }

                              var5 = (C_42V)var1;
                              float var214;
                              var63 = (var214 = var5.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var214 < 0.0F ? -1 : 1);
                              var86 = var4;
                              long var215;
                              int var145 = (var215 = var2 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                              break label1026;
                           }

                           var62 = var1 instanceof C_42V;
                           break label1027;
                        }

                        if (var2 >= 0L) {
                           break label1138;
                        }
                        break label1030;
                     }

                     if (var4 == null) {
                        if (!var62) {
                           return;
                        }

                        var10001 = 5813670663240505615L;
                        net.C_47eb var41 = net.C_47eb.PLACE_BLOCK;
                        var62 = net.C_47eb.method_48$b40e761c1b(var41);
                     }

                     if (!var62) {
                        return;
                     }

                     var5 = (C_42V)var1;
                     float var222;
                     var63 = (var222 = var5.method_42$bc607678b6() - 0.0F) == 0.0F ? 0 : (var222 < 0.0F ? -1 : 1);
                     var86 = var4;
                     long var223;
                     int var150 = (var223 = var2 - 0L) == 0L ? 0 : (var223 < 0L ? -1 : 1);
                     break label1137;
                  }

                  long var224;
                  int var152 = (var224 = var2 - 0L) == 0L ? 0 : (var224 < 0L ? -1 : 1);
                  break label1138;
               }

               if (var86 == null) {
                  if (var63 == 0) {
                     return;
                  }

                  var63 = var5.method_44$8abf5c6871();
               }

               if (var63 != 255) {
                  var10001 = 5816285576609538437L;
                  net.C_47eb var52 = net.C_47eb.PLACE_BLOCK;
                  net.C_47cu var70 = net.C_47eb.method_44$93deda978b(var52);
                  var10001 = 5812294440951964497L;
                  net.C_47cu var57 = var70;
                  var57.method_46$da8c82d5d4();
               }

               return;
            }

            if (var86 == null) {
               if (var63 == 0) {
                  return;
               }

               float var225;
               var63 = (var225 = var5.method_40$bc607678b6() - 0.0F) == 0.0F ? 0 : (var225 < 0.0F ? -1 : 1);
            }

            if (var4 == null) {
               if (var63 == 0) {
                  return;
               }

               var63 = var5.method_44$8abf5c6871();
            }

            if (var63 != 255) {
               var10001 = 5816285576609538437L;
               net.C_47eb var18 = net.C_47eb.PLACE_BLOCK;
               net.C_47cu var68 = net.C_47eb.method_44$93deda978b(var18);
               var10001 = 5812294440951964497L;
               net.C_47cu var19 = var68;
               var19.method_46$da8c82d5d4();
            }

            return;
         }

         if (var86 == null) {
            if (var63 == 0) {
               return;
            }

            float var226;
            var63 = (var226 = var5.method_48$bc607678b6() - 0.0F) == 0.0F ? 0 : (var226 < 0.0F ? -1 : 1);
         }

         long var227;
         int var153 = (var227 = var2 - 0L) == 0L ? 0 : (var227 < 0L ? -1 : 1);
         if (var4 == null) {
            if (var63 == 0) {
               return;
            }

            float var228;
            var63 = (var228 = var5.method_40$bc607678b6() - 0.0F) == 0.0F ? 0 : (var228 < 0.0F ? -1 : 1);
         }

         if (var4 == null) {
            if (var63 == 0) {
               return;
            }

            var63 = var5.method_44$8abf5c6871();
         }

         if (var63 != 255) {
            var10001 = 5816285576609538437L;
            net.C_47eb var51 = net.C_47eb.PLACE_BLOCK;
            net.C_47cu var69 = net.C_47eb.method_44$93deda978b(var51);
            var10001 = 5812294440951964497L;
            net.C_47cu var56 = var69;
            var56.method_46$da8c82d5d4();
         }
      }
   }





   private boolean method_41N$aae029aa0a() {
      long var1 = c ^ 22888172525737L;
      long var3 = var1 ^ 66018535595122L;
      long var10002 = 1842969290836622213L;
      long var5 = var3;
      ModeSetting var7 = this.settingPlayerESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   private boolean method_416$aae029aa0a() {
      long var1 = c ^ 44418428593311L;
      long var3 = var1 ^ 823737196612L;
      long var10000 = -1900483530005076492L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -1898911029249062989L;
      long var6 = var3;
      ModeSetting var8 = this.settingPlayerESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_41W$aae029aa0a() {
      long var1 = c ^ 23989552908601L;
      long var3 = var1 ^ 67120457043426L;
      long var10002 = 577458896963512853L;
      long var5 = var3;
      ModeSetting var7 = this.settingPlayerESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$81(this, 25, var3, -7104592413594107474L, var1);
      recovery$indy$82(this, 32, var3, -7104592413594107474L, var1);
      recovery$indy$83(this, 31, var3, -7104592413594107474L, var1);
      recovery$indy$84(this, 40, var3, -7104592413594107474L, var1);
      recovery$indy$85(this, 18, var3, -7104592413594107474L, var1);
      recovery$indy$86(this, 7, var3, -7104592413594107474L, var1);
      recovery$indy$87(this, 61, var3, -7104592413594107474L, var1);
      recovery$indy$88(this, 1, var3, -7104592413594107474L, var1);
      recovery$indy$89(this, 17, var3, -7104592413594107474L, var1);
   }



   private boolean method_41V$aae029aa0a() {
      long var1 = c ^ 75833171480280L;
      long var3 = var1 ^ 118895348795907L;
      long var10000 = 1145969094026514355L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = 1144717942590418420L;
      long var6 = var3;
      ModeSetting var8 = this.settingTargetESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_41p$0dd78e0064(long var1) {
      boolean var27;
      var1 = c ^ var1;
      long var3 = var1 ^ 82330748215297L;
      long var5 = var1 ^ 77900425753173L;
      long var10000 = 3200605991593244340L;
      C_47eb[] var8 = C_47eb.values();
      int var9 = var8.length;
      var10000 = 3200747031817219135L;
      String var24 = C_47eb.method_48$0e30dfc966();
      int var10 = 0;
      String var7 = var24;

      while (true) {
         if (var10 < var9) {
            C_47eb var11 = var8[var10];
            String var25 = var7;
            if (var1 >= 0L) {
               if (var7 == null) {
                  long var10001 = 3203910694427516228L;
                  C_47eb var12 = var11;
                  C_47cu var26 = C_47eb.method_44$93deda978b(var12);
                  long var10002 = 3201668331033921863L;
                  C_47eb var13 = var11;
                  NumberSetting var28 = C_47eb.method_45$95dc77a34e(var13);
                  long var10003 = 3201469310690343321L;
                  long var14 = var3;
                  NumberSetting var16 = var28;
                  double var29 = var16.method_44$474dfaa627(var14);
                  var10003 = 3200908426526309390L;
                  long var17 = var5;
                  double var19 = var29;
                  C_47cu var21 = var26;
                  var27 = var21.method_43$2ac7ee8710(var19, var17);
                  if (var7 != null) {
                     break;
                  }

                  if (!var27) {
                     return true;
                  }

                  var10++;
               }

               var25 = var7;
            }

            if (var25 == null) {
               continue;
            }
         }

         var27 = false;
         break;
      }

      return var27;
   }



   private boolean method_41q$aae029aa0a() {
      long var1 = c ^ 63573131473431L;
      long var10000 = -5537120799391845508L;
      String var3 = C_47eb.method_48$0e30dfc966();
      long var10001 = -5535414519319549570L;
      BooleanSetting var4 = this.settingFailRate;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -5538276437496552518L;
         BooleanSetting var5 = this.settingFailRate;
         var6 = var5.method_44$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }



   private boolean method_414$aae029aa0a() {
      long var1 = c ^ 118868519257718L;
      long var3 = var1 ^ 75617360265901L;
      long var10000 = 525061013446641437L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = 526061351512843610L;
      long var6 = var3;
      ModeSetting var8 = this.settingTargetESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_41n$aae029aa0a() {
      long var1 = c ^ 69164361697294L;
      long var3 = var1 ^ 24454051499221L;
      long var10002 = 5275018053725481762L;
      long var5 = var3;
      ModeSetting var7 = this.settingTargetESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
        int var145;
        java.util.concurrent.atomic.AtomicBoolean var147;
        int var148;
        augustus.recovered.modules.latency.Ping_47C0 var150;
        int var152;
        java.lang.String var153;
        java.lang.String var157;
        int var158;
        java.lang.String var160;
        java.lang.String var174;
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 40710808209219L;
      long var8 = var4 ^ 113186446332478L;
      long var10 = var4 ^ 98991597556633L;
      long var12 = var4 ^ 97834970749362L;
      long var10001 = var4 ^ 10882020627151L;
      int var14 = (int)((var4 ^ 10882020627151L) >>> 32);
      int var15 = (int)((var4 ^ 10882020627151L) << 32 >>> 56);
      int var16 = (int)(var10001 << 40 >>> 40);
      var10001 = var4 ^ 106627793729997L;
      int var17 = (int)((var4 ^ 106627793729997L) >>> 32);
      int var18 = (int)((var4 ^ 106627793729997L) << 32 >>> 56);
      int var19 = (int)(var10001 << 40 >>> 40);
      this.field_43h.clear();
      long var10000 = 2185506305432935936L;
      String var143 = net.C_47eb.method_48$0e30dfc966();
      int var21 = 0;
      String var20 = var143;
      long var10003 = 2187963025618838887L;
      long var36 = var12;
      long var38 = 2000L;
      net.C_47cu var40 = this.field_41B;
      boolean var144 = var40.method_42$b0e346e6e3(var38, var36);
      if (var20 == null) {
         if (var144) {
            this.field_47 = null;
         }

         var10001 = 2184820095443633154L;
         client.setting.BooleanSetting var41 = this.settingFailRate;
         label408:
         if (var41.method_49$aae029aa0a() && this.field_47 != null) {
            var10001 = 2186757883139754602L;
            net.minecraft.client.Minecraft var105 = field_43;
            double var241;
            int var151 = (var241 = var105.field_42P.method_44$ee256e8a75(this.field_47) - 4.5) == 0.0 ? 0 : (var241 < 0.0 ? -1 : 1);
            String var172 = var20;
            if (var2 >= 0) {
               if (var20 == null) {
                  if (var151 > 0) {
                     long var195 = 2185206644424933789L;
                     client.setting.RangeSetting var106 = this.settingFailInterval;
                     if (this.field_43y >= var106.method_44$8abf5c6871()) {
                        this.field_43P = true;
                     }
                  }

                  var151 = this.field_47.field_432;
               }

               var172 = var20;
            }

            if (var1 > 0) {
               if (var172 == null) {
                  if (var151 != 10) {
                     break label408;
                  }

                  long var242;
                  var151 = (var242 = System.currentTimeMillis() - this.field_42.get() - 200L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
               }

               var172 = var20;
            }

            label501: {
               if (var1 > 0) {
                  if (var172 == null) {
                     if (var151 <= 0 && !this.field_40.get()) {
                        break label501;
                     }

                     var151 = this.field_43y;
                  }

                  var172 = var20;
               }

               if (var172 == null) {
                  long var196 = 2185206644424933789L;
                  client.setting.RangeSetting var107 = this.settingFailInterval;
                  if (var151 < var107.method_44$8abf5c6871()) {
                     break label408;
                  }

                  var151 = ((int) (this.field_43P ? 1 : 0));
               }

               if (var151 == 0) {
                  break label408;
               }
            }

            this.field_43y++;
            this.field_40.set(true);
         }

         var10001 = 2186077111789995253L;
         net.minecraft.client.Minecraft var108 = field_43;
         java.util.Iterator var92 = var108.field_44Q.field_44Q.iterator();

         label502: {
            label380: {
               while (true) {
                  if (var92.hasNext()) {
                     net.minecraft.entity.Entity var93 = (net.minecraft.entity.Entity)var92.next();
                     var10003 = 2186560185432356132L;
                     net.minecraft.entity.Entity var109 = var93;
                     long var110 = var10;
                     Ping_47C0 var111 = this;
                     var152 = ((var111.method_43$5909fdf9ee(var110, var109)) ? 1 : 0);
                     var174 = var20;
                     if (var1 <= 0) {
                        break label380;
                     }

                     if (var20 != null) {
                        break;
                     }

                     String var175 = var20;
                     if (var3 >= 0) {
                        if (var20 == null) {
                           if (var152 != 0) {
                              this.field_43h.add((net.minecraft.entity.EntityLivingBase)var93);
                           }

                           var10003 = 2187186374855194063L;
                           net.minecraft.entity.Entity var112 = var93;
                           long var113 = var6;
                           Ping_47C0 var114 = this;
                           var152 = ((var114.method_44$5909fdf9ee(var113, var112)) ? 1 : 0);
                        }

                        var175 = var20;
                     }

                     label374: {
                        label505: {
                           if (var3 > 0) {
                              if (var175 == null) {
                                 if (var152 == 0) {
                                    break label505;
                                 }

                                 byte var197 = (byte)var15;
                                 long var222 = 2185724033534245037L;
                                 int var115 = var16;
                                 byte var116 = var197;
                                 int var117 = var14;
                                 net.C_47MI var118 = this.field_41p;
                                 double var243;
                                 var152 = (var243 = var118.method_42$a220c6100e(var117, var116, var115) - 0.0) == 0.0 ? 0 : (var243 < 0.0 ? -1 : 1);
                              }

                              var175 = var20;
                           }

                           if (var175 == null) {
                              if (var152 <= 0) {
                                 break label505;
                              }

                              var10001 = 2184820095443633154L;
                              client.setting.BooleanSetting var119 = this.settingCombatMode;
                              var152 = ((var119.method_49$aae029aa0a()) ? 1 : 0);
                           }

                           label361:
                           if (var152 != 0) {
                              net.minecraft.entity.EntityLivingBase var94 = (net.minecraft.entity.EntityLivingBase)var93;
                              var10001 = 2186757883139754602L;
                              net.minecraft.client.Minecraft var120 = field_43;
                              double var95 = var120.field_42P.method_40$ee256e8a75(var94);
                              var10003 = 2185032452834986918L;
                              long var121 = var8;
                              client.setting.NumberSetting var122 = this.settingResetPingAtDistanceToTarget;
                              if (var95 < var122.method_44$474dfaa627(var121)) {
                                 if (!this.field_43a) {
                                    byte var198 = (byte)var18;
                                    long var223 = 2188076103831844938L;
                                    int var63 = var19;
                                    byte var64 = var198;
                                    int var65 = var17;
                                    client.setting.RangeSetting var66 = this.settingPingStartDelay;
                                    var66.method_46$5d07753af8(var65, var64, var63);
                                 }

                                 this.field_43a = true;
                                 var10001 = 2184392834996328731L;
                                 net.minecraft.client.Minecraft var67 = field_43;
                                 var67.method_40$f8db5d9e73().method_49$431840b606().method_45$631790539f(new net.C_47vS());
                                 var10001 = 2186301669181042095L;
                                 net.C_47cu var68 = this.field_41d;
                                 var68.method_46$da8c82d5d4();
                                 var21 = 1;
                                 var153 = var20;
                                 if (var3 < 0) {
                                    break label374;
                                 }

                                 if (var20 == null) {
                                    break label361;
                                 }
                              }

                              var10001 = 2186757883139754602L;
                              net.minecraft.client.Minecraft var69 = field_43;
                              label355:
                              if (var69.field_42P.method_40$ee256e8a75(var94) < 15.0F) {
                                 var10003 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var123 = field_43;
                                 double var199 = var123.field_42P.field_48u;
                                 long var224 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var124 = field_43;
                                 long var230 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var125 = field_43;
                                 double var216 = var124.field_42P.field_48O + var125.field_42P.method_41$bc607678b6();
                                 var230 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var126 = field_43;
                                 net.C_47tf var96 = new net.C_47tf(var199, var216, var126.field_42P.field_48l);
                                 float var97 = var94.method_42$bc607678b6();
                                 net.C_478i var181 = var94.method_45$6684d3c618().method_42$800791f322(var97, var97, var97);
                                 long var200 = 2185114623276107869L;
                                 net.C_478i var127 = var181;
                                 net.C_47tf var128 = var96;
                                 net.C_47tf var98 = net.C_47gg.method_47$42676af4e9(var128, var127);
                                 int var99 = var95 > var96.method_43$3d77d36e13(var98) ? 1 : 0;
                                 var10001 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var129 = field_43;
                                 float var100 = var129.field_42P.field_48w / 2.0F;
                                 var10001 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var130 = field_43;
                                 float var101 = var130.field_42P.method_42$bc607678b6();
                                 var10003 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var131 = field_43;
                                 var199 = var131.field_42P.method_47$b2124a4855().field_40 - var100;
                                 var224 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var132 = field_43;
                                 double var218 = var132.field_42P.method_47$b2124a4855().field_41;
                                 var230 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var133 = field_43;
                                 double var226 = var133.field_42P.method_47$b2124a4855().field_47 - var100;
                                 long var235 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var134 = field_43;
                                 double var233 = var134.field_42P.method_47$b2124a4855().field_40 + var100;
                                 long var237 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var135 = field_43;
                                 long var239 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var136 = field_43;
                                 double var236 = var135.field_42P.method_47$b2124a4855().field_41 + var136.field_42P.field_48;
                                 var239 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var137 = field_43;
                                 net.C_478i var102 = new net.C_478i(var199, var218, var226, var233, var236, var137.field_42P.method_47$b2124a4855().field_47 + var100)
                                    .method_42$800791f322(var101, var101, var101);
                                 net.C_47tf var103 = new net.C_47tf(var94.field_43S, var94.field_47B, var94.field_43E);
                                 long var202 = 2185114623276107869L;
                                 net.C_478i var138 = var102;
                                 net.C_47tf var139 = var103;
                                 net.C_47tf var104 = net.C_47gg.method_47$42676af4e9(var139, var138);
                                 int var154 = var99;
                                 String var184 = var20;
                                 if (var3 >= 0) {
                                    if (var20 == null) {
                                       if (var99 == 0) {
                                          break label355;
                                       }

                                       double var244;
                                       var154 = (var244 = var103.method_43$3d77d36e13(var104) - 5.0) == 0.0 ? 0 : (var244 < 0.0 ? -1 : 1);
                                    }

                                    var184 = var20;
                                 }

                                 if (var184 == null) {
                                    if (var154 >= 0) {
                                       break label355;
                                    }

                                    this.field_43a = true;
                                    var10001 = 2184392834996328731L;
                                    net.minecraft.client.Minecraft var140 = field_43;
                                    var140.method_40$f8db5d9e73().method_49$431840b606().method_45$631790539f(new net.C_47vS());
                                    var154 = 1;
                                 }

                                 var21 = var154;
                              }
                           }
                        }

                        var153 = var20;
                     }

                     if (var153 == null) {
                        continue;
                     }
                  }

                  if (var3 <= 0) {
                     break label502;
                  }

                  var152 = var21;
                  break;
               }

               var174 = var20;
            }

            if (var174 == null) {
               if (var152 != 0) {
                  return;
               }

               var10001 = 2184820095443633154L;
               client.setting.BooleanSetting var88 = this.settingFailRate;
               var152 = ((var88.method_49$aae029aa0a()) ? 1 : 0);
            }

            if (var152 != 0) {
               long var203 = 2185206644424933789L;
               client.setting.RangeSetting var141 = this.settingFailInterval;
               if (this.field_43y == var141.method_44$8abf5c6871()) {
                  this.field_43a = true;
                  return;
               }

               var203 = 2185206644424933789L;
               client.setting.RangeSetting var90 = this.settingFailInterval;
               if (this.field_43y > var90.method_44$8abf5c6871()) {
                  this.field_43y = 0;
                  var10001 = 2188246335875233019L;
                  client.setting.RangeSetting var142 = this.settingFailInterval;
                  var142.method_43$fedcb3e4d3();
               }
            }
         }

         this.field_43a = false;
      } else {
         label495:
         if (var144 && this.field_47 != null) {
            label492: {
               label509: {
                  label510: {
                     var10001 = 2186757883139754602L;
                     net.minecraft.client.Minecraft var42 = field_43;
                     double var245;
                     var145 = (var245 = var42.field_42P.method_44$ee256e8a75(this.field_47) - 4.5) == 0.0 ? 0 : (var245 < 0.0 ? -1 : 1);
                     var157 = var20;
                     if (var2 >= 0) {
                        if (var20 == null) {
                           if (var145 > 0) {
                              var145 = this.field_43y;
                              long var10002 = 2185206644424933789L;
                              client.setting.RangeSetting var43 = this.settingFailInterval;
                              var158 = var43.method_44$8abf5c6871();
                              break label510;
                           }

                           var145 = this.field_47.field_432;
                        }

                        var157 = var20;
                     }

                     if (var1 <= 0) {
                        break label492;
                     }

                     if (var157 != null) {
                        break label509;
                     }

                     var158 = 10;
                  }

                  if (var145 != var158) {
                     break label495;
                  }

                  long var246;
                  var145 = (var246 = System.currentTimeMillis() - this.field_42.get() - 200L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
               }

               var157 = var20;
            }

            label511: {
               if (var1 > 0) {
                  if (var157 == null) {
                     if (var145 <= 0) {
                        var147 = this.field_40;
                        break label511;
                     }

                     var145 = this.field_43y;
                  }

                  var157 = var20;
               }

               Ping_47C0 var146;
               if (var157 == null) {
                  long var188 = 2185206644424933789L;
                  client.setting.RangeSetting var44 = this.settingFailInterval;
                  if (var145 < var44.method_44$8abf5c6871()) {
                     break label495;
                  }

                  var146 = this;
               } else {
                  if (var145 == 0) {
                     break label495;
                  }

                  this.field_43y++;
                  var146 = this;
               }

               var147 = var146.field_40;
            }

            var147.set(true);
         }

         var10001 = 2186077111789995253L;
         net.minecraft.client.Minecraft var45 = field_43;
         java.util.Iterator var22 = var45.field_44Q.field_44Q.iterator();

         label457: {
            label512: {
               label455: {
                  while (true) {
                     if (var22.hasNext()) {
                        net.minecraft.entity.Entity var23 = (net.minecraft.entity.Entity)var22.next();
                        var10003 = 2186560185432356132L;
                        net.minecraft.entity.Entity var46 = var23;
                        long var47 = var10;
                        Ping_47C0 var49 = this;
                        var148 = ((var49.method_43$5909fdf9ee(var47, var46)) ? 1 : 0);
                        var160 = var20;
                        if (var1 <= 0) {
                           break label455;
                        }

                        if (var20 != null) {
                           break;
                        }

                        String var161 = var20;
                        if (var3 >= 0) {
                           if (var20 == null) {
                              if (var148 != 0) {
                                 this.field_43h.add((net.minecraft.entity.EntityLivingBase)var23);
                              }

                              var10003 = 2187186374855194063L;
                              net.minecraft.entity.Entity var50 = var23;
                              long var51 = var6;
                              Ping_47C0 var53 = this;
                              var148 = ((var53.method_44$5909fdf9ee(var51, var50)) ? 1 : 0);
                           }

                           var161 = var20;
                        }

                        label515: {
                           if (var3 > 0) {
                              if (var161 == null) {
                                 if (var148 == 0) {
                                    break label515;
                                 }

                                 byte var189 = (byte)var15;
                                 long var10004 = 2185724033534245037L;
                                 int var54 = var16;
                                 byte var55 = var189;
                                 int var56 = var14;
                                 net.C_47MI var57 = this.field_41p;
                                 double var247;
                                 var148 = (var247 = var57.method_42$a220c6100e(var56, var55, var54) - 0.0) == 0.0 ? 0 : (var247 < 0.0 ? -1 : 1);
                              }

                              var161 = var20;
                           }

                           if (var161 == null) {
                              if (var148 <= 0) {
                                 break label515;
                              }

                              var10001 = 2184820095443633154L;
                              client.setting.BooleanSetting var58 = this.settingCombatMode;
                              var148 = ((var58.method_49$aae029aa0a()) ? 1 : 0);
                           }

                           if (var148 != 0) {
                              net.minecraft.entity.EntityLivingBase var24 = (net.minecraft.entity.EntityLivingBase)var23;
                              var10001 = 2186757883139754602L;
                              net.minecraft.client.Minecraft var59 = field_43;
                              double var25 = var59.field_42P.method_40$ee256e8a75(var24);
                              var10003 = 2185032452834986918L;
                              long var60 = var8;
                              client.setting.NumberSetting var62 = this.settingResetPingAtDistanceToTarget;
                              label436:
                              if (var25 < var62.method_44$474dfaa627(var60)) {
                                 var10003 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var70 = field_43;
                                 double var190 = var70.field_42P.field_48u;
                                 long var219 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var71 = field_43;
                                 long var10005 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var72 = field_43;
                                 double var209 = var71.field_42P.field_48O + var72.field_42P.method_41$bc607678b6();
                                 var10005 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var73 = field_43;
                                 net.C_47tf var27 = new net.C_47tf(var190, var209, var73.field_42P.field_48l);
                                 float var28 = var24.method_42$bc607678b6();
                                 net.C_478i var164 = var24.method_45$6684d3c618().method_42$800791f322(var28, var28, var28);
                                 long var191 = 2185114623276107869L;
                                 net.C_478i var74 = var164;
                                 net.C_47tf var75 = var27;
                                 net.C_47tf var29 = net.C_47gg.method_47$42676af4e9(var75, var74);
                                 double var248;
                                 int var30 = (var248 = var25 - var27.method_43$3d77d36e13(var29)) == 0.0 ? 0 : (var248 < 0.0 ? -1 : 1);
                                 var10001 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var76 = field_43;
                                 float var31 = var76.field_42P.field_48w / 2.0F;
                                 var10001 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var77 = field_43;
                                 float var32 = var77.field_42P.method_42$bc607678b6();
                                 var10003 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var78 = field_43;
                                 var190 = var78.field_42P.method_47$b2124a4855().field_40 - var31;
                                 var219 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var79 = field_43;
                                 double var211 = var79.field_42P.method_47$b2124a4855().field_41;
                                 var10005 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var80 = field_43;
                                 double var221 = var80.field_42P.method_47$b2124a4855().field_47 - var31;
                                 long var10006 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var81 = field_43;
                                 double var229 = var81.field_42P.method_47$b2124a4855().field_40 + var31;
                                 long var10007 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var82 = field_43;
                                 long var10008 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var83 = field_43;
                                 double var234 = var82.field_42P.method_47$b2124a4855().field_41 + var83.field_42P.field_48;
                                 var10008 = 2186757883139754602L;
                                 net.minecraft.client.Minecraft var84 = field_43;
                                 net.C_478i var33 = new net.C_478i(var190, var211, var221, var229, var234, var84.field_42P.method_47$b2124a4855().field_47 + var31)
                                    .method_42$800791f322(var32, var32, var32);
                                 net.C_47tf var34 = new net.C_47tf(var24.field_43S, var24.field_47B, var24.field_43E);
                                 long var193 = 2185114623276107869L;
                                 net.C_478i var85 = var33;
                                 net.C_47tf var86 = var34;
                                 net.C_47tf var35 = net.C_47gg.method_47$42676af4e9(var86, var85);
                                 int var149 = var30;
                                 String var167 = var20;
                                 if (var3 >= 0) {
                                    if (var20 == null) {
                                       if (var30 == 0) {
                                          break label436;
                                       }

                                       double var249;
                                       var149 = (var249 = var34.method_43$3d77d36e13(var35) - 5.0) == 0.0 ? 0 : (var249 < 0.0 ? -1 : 1);
                                    }

                                    var167 = var20;
                                 }

                                 if (var167 == null) {
                                    if (var149 >= 0) {
                                       break label436;
                                    }

                                    this.field_43a = true;
                                    var10001 = 2184392834996328731L;
                                    net.minecraft.client.Minecraft var87 = field_43;
                                    var87.method_40$f8db5d9e73().method_49$431840b606().method_45$631790539f(new net.C_47vS());
                                    var149 = 1;
                                 }

                                 var21 = var149;
                              }
                           }
                        }

                        if (var20 == null) {
                           continue;
                        }
                     }

                     if (var3 <= 0) {
                        break label512;
                     }

                     var148 = var21;
                     break;
                  }

                  var160 = var20;
               }

               if (var160 == null) {
                  if (var148 != 0) {
                     return;
                  }

                  var150 = this;
                  break label457;
               }

               if (var148 != 0) {
                  long var194 = 2185206644424933789L;
                  client.setting.RangeSetting var89 = this.settingFailInterval;
                  if (this.field_43y > var89.method_44$8abf5c6871()) {
                     this.field_43y = 0;
                     var10001 = 2188246335875233019L;
                     client.setting.RangeSetting var91 = this.settingFailInterval;
                     var91.method_43$fedcb3e4d3();
                  }
               }
            }

            var150 = this;
         }

         var150.field_43a = false;
      }
   }










   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 30124246953932L;
      recovery$indy$91(var3, recovery$indy$90(6206, 8006508288012653197L ^ var1), -7745426467819513194L, var1);
      this.field_43h.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 15611559894714L;
      long var8 = var4 ^ 130720379100535L;
      recovery$indy$93(var6, recovery$indy$92(6897, 4089484672817111351L ^ var4), 2734990081764305888L, var4);
      this.field_43a = false;
      recovery$indy$94(this.field_41p, var8, 2736059139085431345L, var4);
      recovery$indy$95(this.field_418, var8, 2736059139085431345L, var4);
   }



   public void method_40g$e45a9973e5(long var1) {
      long var3 = var1 ^ 112239052891291L;
      recovery$indy$96(this.field_418, var3, -8815774815592033469L, var1);
      recovery$indy$97(this.field_41p, var3, -8815774815592033469L, var1);
   }



    public Ping_47C0(int a0,short a1,short a2) {
        super((java.lang.String) ("Ping"),(java.lang.String) ("Verz\u00f6gerung"),(long) (((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 22257927293356L)),(java.awt.Color) (new java.awt.Color((int) (235),(int) (64),(int) (52))),(client.module.Category) (client.module.Category.LATENCY));
        long constructorKey1 = (((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c);
        long constructorKey2 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 119620419993738L);
        int constructorPart3 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 93591260222987L) >>> 32));
        int constructorPart4 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 93591260222987L) << 32) >>> 48));
        int constructorPart5 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 93591260222987L) << 48) >>> 48));
        long constructorKey6 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 53713678861369L);
        long constructorKey7 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 129250066458496L);
        long constructorKey8 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 102766567383121L);
        long constructorKey9 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 27266761621002L);
        long constructorKey10 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 13273614237884L);
        long constructorKey11 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 121711293118402L);
        long constructorKey12 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 22081602163146L);
        int constructorPart13 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 129121767543569L) >>> 32));
        long constructorKey14 = ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 129121767543569L) << 32) >>> 32);
        long constructorKey15 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 4339706221320L);
        int constructorPart16 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 21127108193094L) >>> 48));
        int constructorPart17 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 21127108193094L) << 16) >>> 48));
        int constructorPart18 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 21127108193094L) << 32) >>> 32));
        int constructorPart19 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 75439423637186L) >>> 32));
        int constructorPart20 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 75439423637186L) << 32) >>> 40));
        int constructorPart21 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 75439423637186L) << 56) >>> 56));
        long constructorKey22 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 72825764309549L);
        int constructorPart23 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 127447042528282L) >>> 32));
        int constructorPart24 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 127447042528282L) << 32) >>> 48));
        int constructorPart25 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 127447042528282L) << 48) >>> 48));
        long constructorKey26 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 124582056325585L);
        int constructorPart27 = (int) ((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 13249693161478L) >>> 32));
        int constructorPart28 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 13249693161478L) << 32) >>> 48));
        int constructorPart29 = (int) (((((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 13249693161478L) << 48) >>> 48));
        long constructorKey30 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.latency.Ping_47C0.c) ^ 91038274302214L);
        client.setting.SettingGroup initialized31 = new client.setting.SettingGroup(this, "IncomingGroup", constructorKey10);
        recovery$indy$flow$870(this, initialized31);
        java.lang.Object initialValue32 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingIncomingGroup));
        net.C_47MI initialized33 = new net.C_47MI(this, "Incoming", (client.setting.SettingGroup) (initialValue32), constructorKey7);
        recovery$indy$flow$874(this, initialized33);
        java.lang.Object initialValue34 = recovery$indy$flow$875();
        client.setting.SettingGroup initialized35 = new client.setting.SettingGroup(this, "OutgoingGroup", constructorKey10);
        recovery$indy$flow$878(this, initialized35);
        java.lang.Object initialValue36 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingOutgoingGroup));
        net.C_47MI initialized37 = new net.C_47MI(this, "Outgoing", (client.setting.SettingGroup) (initialValue36), constructorKey7);
        recovery$indy$flow$882(this, initialized37);
        short converted38 = (short) (constructorPart16);
        char converted39 = (char) (constructorPart17);
        java.lang.Object initialValue40 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingOutgoingGroup));
        client.setting.BooleanSetting initialized41 = new client.setting.BooleanSetting(this, "CombatMode", converted38, converted39, constructorPart18, false, (client.setting.SettingGroup) (initialValue40));
        recovery$indy$flow$886(this, initialized41);
        java.lang.Object initialValue42 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingOutgoingGroup));
        client.setting.RangeSetting initialized43 = new client.setting.RangeSetting(constructorPart27, this, "PingStartDelay", constructorPart28, constructorPart29, Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble(4639481672377565184L), 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, (client.setting.SettingGroup) (initialValue42));
        long initialValue44 = constructorKey8;
        client.setting.RangeSetting initialValue45 = initialized43;
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue47 = recovery$indy$flow$891(initialValue46, initialValue44);
        java.lang.Object initialValue48 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingCombatMode));
        java.lang.Object initialValue49 = recovery$indy$flow$893(initialValue48);
        java.lang.Object initialValue50 = recovery$indy$flow$894(initialValue48);
        long initialValue51 = constructorKey14;
        java.lang.Object initialValue52 = initialValue50;
        int initialValue53 = constructorPart13;
        java.lang.Object initialValue54 = initialValue47;
        java.lang.Object initialValue55 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue54))))));
        java.lang.Object initialValue56 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue52))))));
        java.lang.Object initialValue57 = recovery$indy$flow$897(initialValue55, initialValue53, initialValue56, initialValue51);
        recovery$indy$flow$898(this, initialValue57);
        java.lang.Object initialValue58 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingOutgoingGroup));
        client.setting.NumberSetting initialized59 = new client.setting.NumberSetting(this, "ResetPingAtDistanceToTarget", Double.longBitsToDouble(4614050408231757414L), Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4616189618054758400L), 2, (client.setting.SettingGroup) (initialValue58), constructorKey30);
        java.lang.Object initialValue60 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingCombatMode));
        java.lang.Object initialValue61 = recovery$indy$flow$903(initialValue60);
        java.lang.Object initialValue62 = recovery$indy$flow$904(initialValue60);
        java.lang.Object initialValue63 = initialValue62;
        client.setting.NumberSetting initialValue64 = initialized59;
        java.lang.Object initialValue65 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue64))))));
        java.lang.Object initialValue66 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue63))))));
        java.lang.Object initialValue67 = recovery$indy$flow$907(initialValue65, initialValue66);
        recovery$indy$flow$908(this, initialValue67);
        short converted68 = (short) (constructorPart16);
        char converted69 = (char) (constructorPart17);
        java.lang.Object initialValue70 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingOutgoingGroup));
        client.setting.BooleanSetting initialized71 = new client.setting.BooleanSetting(this, "FailRate", converted68, converted69, constructorPart18, false, (client.setting.SettingGroup) (initialValue70));
        java.lang.Object initialValue72 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingCombatMode));
        java.lang.Object initialValue73 = recovery$indy$flow$913(initialValue72);
        java.lang.Object initialValue74 = recovery$indy$flow$914(initialValue72);
        java.lang.Object initialValue75 = initialValue74;
        long initialValue76 = constructorKey2;
        client.setting.BooleanSetting initialValue77 = initialized71;
        java.lang.Object initialValue78 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue77))))));
        java.lang.Object initialValue79 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue75))))));
        java.lang.Object initialValue80 = recovery$indy$flow$917(initialValue78, initialValue76, initialValue79);
        java.lang.Object initialValue81 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue80))))));
        recovery$indy$flow$919(this, initialValue81);
        java.lang.Object initialValue82 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingOutgoingGroup));
        client.setting.RangeSetting initialized83 = new client.setting.RangeSetting(constructorPart27, this, "FailInterval", constructorPart28, constructorPart29, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4616189618054758400L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue82));
        long initialValue84 = constructorKey8;
        client.setting.RangeSetting initialValue85 = initialized83;
        java.lang.Object initialValue86 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue85))))));
        java.lang.Object initialValue87 = recovery$indy$flow$924(initialValue86, initialValue84);
        java.lang.Object initialValue88 = recovery$indy$flow$925(this);
        long initialValue89 = constructorKey14;
        java.lang.Object initialValue90 = initialValue88;
        int initialValue91 = constructorPart13;
        java.lang.Object initialValue92 = initialValue87;
        java.lang.Object initialValue93 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue92))))));
        java.lang.Object initialValue94 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue90))))));
        java.lang.Object initialValue95 = recovery$indy$flow$928(initialValue93, initialValue91, initialValue94, initialValue89);
        recovery$indy$flow$929(this, initialValue95);
        java.lang.Object initialValue96 = recovery$indy$flow$931();
        java.lang.Object initialValue97 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingOutgoingGroup));
        client.setting.MultiSelectSetting initialized98 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey22, (net.C_47OZ[]) (initialValue96), (client.setting.SettingGroup) (initialValue97));
        java.lang.Object initialValue99 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingCombatMode));
        java.lang.Object initialValue100 = recovery$indy$flow$935(initialValue99);
        java.lang.Object initialValue101 = recovery$indy$flow$936(initialValue99);
        java.lang.Object initialValue102 = initialValue101;
        client.setting.MultiSelectSetting initialValue103 = initialized98;
        java.lang.Object initialValue104 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue103))))));
        java.lang.Object initialValue105 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue102))))));
        java.lang.Object initialValue106 = recovery$indy$flow$939(initialValue104, initialValue105);
        recovery$indy$flow$940(this, initialValue106);
        client.setting.SettingGroup initialized107 = new client.setting.SettingGroup(this, "FlushConditionsGroup", constructorKey10);
        long initialValue108 = constructorKey11;
        java.lang.String initialValue109 = "FlushConditions";
        client.setting.SettingGroup initialValue110 = initialized107;
        java.lang.Object initialValue111 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue110))))));
        java.lang.Object initialValue112 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue109))))));
        java.lang.Object initialValue113 = recovery$indy$flow$945(initialValue111, initialValue112, initialValue108);
        java.lang.Object initialValue114 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue113))))));
        recovery$indy$flow$947(this, initialValue114);
        java.lang.Object initialValue115 = recovery$indy$flow$949();
        java.lang.Object initialValue116 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingFlushConditionsGroup));
        client.setting.MultiSelectSetting initialized117 = new client.setting.MultiSelectSetting(this, "FlushConditions", constructorKey22, (net.C_47OZ[]) (initialValue115), (client.setting.SettingGroup) (initialValue116));
        recovery$indy$flow$952(this, initialized117);
        client.setting.SettingGroup initialized118 = new client.setting.SettingGroup(this, "TargetESPs", constructorKey10);
        recovery$indy$flow$955(this, initialized118);
        java.lang.Object initialValue119 = recovery$indy$flow$957(4);
        ((java.lang.Object[]) initialValue119)[0] = "None";
        ((java.lang.Object[]) initialValue119)[1] = "Classic";
        ((java.lang.Object[]) initialValue119)[2] = "PlayerModel";
        ((java.lang.Object[]) initialValue119)[3] = "PlayerModelArmor";
        java.lang.Object initialValue120 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.ModeSetting initialized121 = new client.setting.ModeSetting(this, "TargetESP", "Classic", (java.lang.String[]) (initialValue119), (client.setting.SettingGroup) (initialValue120), constructorKey15);
        recovery$indy$flow$960(this, initialized121);
        java.lang.Object initialValue122 = initialValue34;
        java.awt.Color initialized123 = new java.awt.Color(0, 255, 0, 0);
        java.lang.Object initialValue124 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.ColorSetting initialized125 = new client.setting.ColorSetting(this, "ClassicColorTarget", constructorKey6, initialized123, (client.setting.SettingGroup) (initialValue124));
        long initialValue126 = constructorKey11;
        java.lang.String initialValue127 = "ClassicColor";
        client.setting.ColorSetting initialValue128 = initialized125;
        java.lang.Object initialValue129 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue128))))));
        java.lang.Object initialValue130 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue127))))));
        java.lang.Object initialValue131 = recovery$indy$flow$968(initialValue129, initialValue130, initialValue126);
        java.lang.Object initialValue132 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue131))))));
        java.lang.Object initialValue133 = recovery$indy$flow$970(this);
        java.lang.Object initialValue134 = initialValue133;
        long initialValue135 = constructorKey2;
        java.lang.Object initialValue136 = initialValue132;
        java.lang.Object initialValue137 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue136))))));
        java.lang.Object initialValue138 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue134))))));
        java.lang.Object initialValue139 = recovery$indy$flow$973(initialValue137, initialValue135, initialValue138);
        java.lang.Object initialValue140 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue139))))));
        recovery$indy$flow$975(this, initialValue140);
        java.lang.Object initialValue141 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.NumberSetting initialized142 = new client.setting.NumberSetting(this, "LineWidthTarget", Double.longBitsToDouble(4613937818241073152L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue141), constructorKey30);
        short converted143 = (short) (constructorPart5);
        int initialValue144 = (int) (converted143);
        int initialValue145 = constructorPart4;
        java.lang.String initialValue146 = "LineWidth";
        int initialValue147 = constructorPart3;
        client.setting.NumberSetting initialValue148 = initialized142;
        java.lang.Object initialValue149 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue148))))));
        java.lang.Object initialValue150 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue146))))));
        java.lang.Object initialValue151 = recovery$indy$flow$981(initialValue149, initialValue147, initialValue150, initialValue145, (short) (initialValue144));
        java.lang.Object initialValue152 = recovery$indy$flow$982(this);
        java.lang.Object initialValue153 = initialValue152;
        java.lang.Object initialValue154 = initialValue151;
        java.lang.Object initialValue155 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue154))))));
        java.lang.Object initialValue156 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue153))))));
        java.lang.Object initialValue157 = recovery$indy$flow$985(initialValue155, initialValue156);
        recovery$indy$flow$986(this, initialValue157);
        short converted158 = (short) (constructorPart16);
        char converted159 = (char) (constructorPart17);
        java.lang.Object initialValue160 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.BooleanSetting initialized161 = new client.setting.BooleanSetting(this, "SmoothRendering", converted158, converted159, constructorPart18, false, (client.setting.SettingGroup) (initialValue160));
        java.lang.Object initialValue162 = recovery$indy$flow$990(this);
        java.lang.Object initialValue163 = initialValue162;
        long initialValue164 = constructorKey2;
        client.setting.BooleanSetting initialValue165 = initialized161;
        java.lang.Object initialValue166 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue165))))));
        java.lang.Object initialValue167 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue163))))));
        java.lang.Object initialValue168 = recovery$indy$flow$993(initialValue166, initialValue164, initialValue167);
        java.lang.Object initialValue169 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue168))))));
        recovery$indy$flow$995(this, initialValue169);
        java.lang.Object initialValue170 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingTargetESPs));
        byte converted171 = (byte) (constructorPart21);
        client.setting.ShaderOptions initialized172 = new client.setting.ShaderOptions(constructorPart19, constructorPart20, this, "Target", converted171, (client.setting.SettingGroup) (initialValue170));
        java.lang.Object initialValue173 = recovery$indy$flow$999(this);
        java.lang.Object initialValue174 = initialValue173;
        long initialValue175 = constructorKey2;
        client.setting.ShaderOptions initialValue176 = initialized172;
        java.lang.Object initialValue177 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue176))))));
        java.lang.Object initialValue178 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue174))))));
        java.lang.Object initialValue179 = recovery$indy$flow$1002(initialValue177, initialValue175, initialValue178);
        java.lang.Object initialValue180 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue179))))));
        long initialValue181 = constructorKey26;
        java.lang.Object initialValue182 = initialValue180;
        java.lang.Object initialValue183 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue182))))));
        java.lang.Object initialValue184 = recovery$indy$flow$1005(initialValue183, initialValue181);
        recovery$indy$flow$1006(this, initialValue184);
        java.lang.Object initialValue185 = recovery$indy$flow$1008();
        java.lang.Object initialValue186 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingTargetESPs));
        client.setting.MultiSelectSetting initialized187 = new client.setting.MultiSelectSetting(this, "RenderTargets", constructorKey22, (net.C_47OZ[]) (initialValue185), (client.setting.SettingGroup) (initialValue186));
        long initialValue188 = constructorKey9;
        java.lang.String initialValue189 = "Targets";
        client.setting.MultiSelectSetting initialValue190 = initialized187;
        java.lang.Object initialValue191 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue190))))));
        java.lang.Object initialValue192 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue189))))));
        java.lang.Object initialValue193 = recovery$indy$flow$1013(initialValue191, initialValue192, initialValue188);
        java.lang.Object initialValue194 = recovery$indy$flow$1014(this);
        java.lang.Object initialValue195 = initialValue194;
        java.lang.Object initialValue196 = initialValue193;
        java.lang.Object initialValue197 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue196))))));
        java.lang.Object initialValue198 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue195))))));
        java.lang.Object initialValue199 = recovery$indy$flow$1017(initialValue197, initialValue198);
        recovery$indy$flow$1018(this, initialValue199);
        client.setting.SettingGroup initialized200 = new client.setting.SettingGroup(this, "PlayerESPs", constructorKey10);
        recovery$indy$flow$1021(this, initialized200);
        java.lang.Object initialValue201 = recovery$indy$flow$1023(4);
        ((java.lang.Object[]) initialValue201)[0] = "None";
        ((java.lang.Object[]) initialValue201)[1] = "Classic";
        ((java.lang.Object[]) initialValue201)[2] = "PlayerModel";
        ((java.lang.Object[]) initialValue201)[3] = "PlayerModelArmor";
        java.lang.Object initialValue202 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.ModeSetting initialized203 = new client.setting.ModeSetting(this, "PlayerESP", "Classic", (java.lang.String[]) (initialValue201), (client.setting.SettingGroup) (initialValue202), constructorKey15);
        recovery$indy$flow$1026(this, initialized203);
        java.awt.Color initialized204 = new java.awt.Color(0, 255, 0, 0);
        java.lang.Object initialValue205 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.ColorSetting initialized206 = new client.setting.ColorSetting(this, "ClassicColorMe", constructorKey6, initialized204, (client.setting.SettingGroup) (initialValue205));
        long initialValue207 = constructorKey11;
        java.lang.String initialValue208 = "ClassicColor";
        client.setting.ColorSetting initialValue209 = initialized206;
        java.lang.Object initialValue210 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue209))))));
        java.lang.Object initialValue211 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue208))))));
        java.lang.Object initialValue212 = recovery$indy$flow$1034(initialValue210, initialValue211, initialValue207);
        java.lang.Object initialValue213 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue212))))));
        java.lang.Object initialValue214 = recovery$indy$flow$1036(this);
        java.lang.Object initialValue215 = initialValue214;
        long initialValue216 = constructorKey2;
        java.lang.Object initialValue217 = initialValue213;
        java.lang.Object initialValue218 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue217))))));
        java.lang.Object initialValue219 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue215))))));
        java.lang.Object initialValue220 = recovery$indy$flow$1039(initialValue218, initialValue216, initialValue219);
        java.lang.Object initialValue221 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue220))))));
        recovery$indy$flow$1041(this, initialValue221);
        java.lang.Object initialValue222 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.NumberSetting initialized223 = new client.setting.NumberSetting(this, "LineWidthMe", Double.longBitsToDouble(4613937818241073152L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue222), constructorKey30);
        short converted224 = (short) (constructorPart5);
        int initialValue225 = (int) (converted224);
        int initialValue226 = constructorPart4;
        java.lang.String initialValue227 = "LineWidth";
        int initialValue228 = constructorPart3;
        client.setting.NumberSetting initialValue229 = initialized223;
        java.lang.Object initialValue230 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue229))))));
        java.lang.Object initialValue231 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue227))))));
        java.lang.Object initialValue232 = recovery$indy$flow$1047(initialValue230, initialValue228, initialValue231, initialValue226, (short) (initialValue225));
        java.lang.Object initialValue233 = recovery$indy$flow$1048(this);
        java.lang.Object initialValue234 = initialValue233;
        java.lang.Object initialValue235 = initialValue232;
        java.lang.Object initialValue236 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue235))))));
        java.lang.Object initialValue237 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue234))))));
        java.lang.Object initialValue238 = recovery$indy$flow$1051(initialValue236, initialValue237);
        recovery$indy$flow$1052(this, initialValue238);
        java.lang.Object initialValue239 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingPlayerESPs));
        byte converted240 = (byte) (constructorPart21);
        client.setting.ShaderOptions initialized241 = new client.setting.ShaderOptions(constructorPart19, constructorPart20, this, "Player", converted240, (client.setting.SettingGroup) (initialValue239));
        java.lang.Object initialValue242 = recovery$indy$flow$1056(this);
        java.lang.Object initialValue243 = initialValue242;
        long initialValue244 = constructorKey2;
        client.setting.ShaderOptions initialValue245 = initialized241;
        java.lang.Object initialValue246 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue245))))));
        java.lang.Object initialValue247 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue243))))));
        java.lang.Object initialValue248 = recovery$indy$flow$1059(initialValue246, initialValue244, initialValue247);
        java.lang.Object initialValue249 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue248))))));
        long initialValue250 = constructorKey26;
        java.lang.Object initialValue251 = initialValue249;
        java.lang.Object initialValue252 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue251))))));
        java.lang.Object initialValue253 = recovery$indy$flow$1062(initialValue252, initialValue250);
        recovery$indy$flow$1063(this, initialValue253);
        short converted254 = (short) (constructorPart16);
        char converted255 = (char) (constructorPart17);
        java.lang.Object initialValue256 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(this)))).settingPlayerESPs));
        client.setting.BooleanSetting initialized257 = new client.setting.BooleanSetting(this, "OnlyInThirdPerson", converted254, converted255, constructorPart18, true, (client.setting.SettingGroup) (initialValue256));
        recovery$indy$flow$1067(this, initialized257);
        net.C_47cu initialized258 = new net.C_47cu();
        recovery$indy$flow$1070(this, initialized258);
        java.util.ArrayList initialized259 = new java.util.ArrayList();
        recovery$indy$flow$1073(this, initialized259);
        recovery$indy$flow$1074(this, false);
        net.C_47cu initialized260 = new net.C_47cu();
        recovery$indy$flow$1077(this, initialized260);
        recovery$indy$flow$1078(this, false);
        recovery$indy$flow$1079(this, 0);
        recovery$indy$flow$1080(this, null);
        net.C_47cu initialized261 = new net.C_47cu();
        recovery$indy$flow$1083(this, initialized261);
        long initialValue262 = recovery$indy$flow$1085();
        java.util.concurrent.atomic.AtomicLong initialized263 = new java.util.concurrent.atomic.AtomicLong(initialValue262);
        recovery$indy$flow$1087(this, initialized263);
        java.util.concurrent.atomic.AtomicBoolean initialized264 = new java.util.concurrent.atomic.AtomicBoolean(false);
        recovery$indy$flow$1090(this, initialized264);
        recovery$indy$flow$1091(this, false);
        java.lang.Object initialValue265 = recovery$indy$flow$1092();
        java.lang.Object initialValue266 = initialValue265;
        int length267 = java.lang.reflect.Array.getLength(initialValue266);
        int initialValue268 = length267;
        int initialValue269 = 0;
        Ping_47C0 loopLocal270 = this;
        long loopLocal271 = constructorKey1;
        int loopLocal272 = constructorPart3;
        int loopLocal273 = constructorPart4;
        int loopLocal274 = constructorPart5;
        long loopLocal275 = constructorKey11;
        long loopLocal276 = constructorKey12;
        int loopLocal277 = constructorPart23;
        int loopLocal278 = constructorPart24;
        int loopLocal279 = constructorPart25;
        long loopLocal280 = constructorKey30;
        java.lang.Object loopLocal281 = initialValue122;
        java.lang.Object loopLocal282 = initialValue266;
        int loopLocal283 = initialValue268;
        int loopLocal284 = initialValue269;
        long loopExit286;
        loop285: while (true) {
            if (loopLocal284 >= loopLocal283) {
                long loopNext287 = loopLocal271;
                loopExit286 = loopNext287;
                break loop285;
            } else {
                java.lang.Object arrayValue288 = ((java.lang.Object[]) loopLocal282)[loopLocal284];
                java.lang.Object initialValue289 = arrayValue288;
                java.lang.StringBuilder initialized290 = new java.lang.StringBuilder();
                java.lang.Object initialValue291 = recovery$indy$flow$1096(initialized290, "Group");
                java.lang.Object initialValue292 = initialValue289;
                java.lang.Object initialValue293 = ((java.lang.Object)(((net.C_47eb) (((java.lang.Object)(initialValue292))))));
                java.lang.Object initialValue294 = recovery$indy$flow$1098(initialValue293);
                java.lang.Object initialValue295 = recovery$indy$flow$1099(initialValue291, initialValue294);
                java.lang.Object initialValue296 = recovery$indy$flow$1100(initialValue295);
                java.lang.Object initialValue297 = ((java.lang.Object)(((augustus.recovered.modules.latency.Ping_47C0) (((java.lang.Object)(loopLocal270)))).settingFlushConditionsGroup));
                client.setting.SettingGroup initialized298 = new client.setting.SettingGroup(loopLocal276, (client.module.Module) (loopLocal270), (java.lang.String) (initialValue296), (client.setting.SettingGroup) (initialValue297));
                java.lang.Object initialValue299 = initialValue289;
                java.lang.Object initialValue300 = ((java.lang.Object)(((net.C_47eb) (((java.lang.Object)(initialValue299))))));
                java.lang.Object initialValue301 = recovery$indy$flow$1104(initialValue300);
                long initialValue302 = loopLocal275;
                java.lang.Object initialValue303 = initialValue301;
                client.setting.SettingGroup initialValue304 = initialized298;
                java.lang.Object initialValue305 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue304))))));
                java.lang.Object initialValue306 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue303))))));
                java.lang.Object initialValue307 = recovery$indy$flow$1107(initialValue305, initialValue306, initialValue302);
                java.lang.Object initialValue308 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue307))))));
                java.lang.Object initialValue309 = recovery$indy$flow$1109(initialValue289);
                java.lang.Object initialValue310 = recovery$indy$flow$1110(initialValue289);
                char converted311 = (char) (loopLocal278);
                java.lang.Object initialValue312 = initialValue310;
                int initialValue313 = loopLocal279;
                int initialValue314 = (int) (converted311);
                int initialValue315 = loopLocal277;
                java.lang.Object initialValue316 = initialValue308;
                java.lang.Object initialValue317 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue316))))));
                java.lang.Object initialValue318 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue312))))));
                java.lang.Object initialValue319 = recovery$indy$flow$1113(initialValue317, initialValue315, (char) (initialValue314), initialValue313, initialValue318);
                java.lang.Object initialValue320 = initialValue319;
                java.lang.StringBuilder initialized321 = new java.lang.StringBuilder();
                java.lang.Object initialValue322 = recovery$indy$flow$1117(initialized321, "FlushDuration");
                java.lang.Object initialValue323 = initialValue289;
                java.lang.Object initialValue324 = ((java.lang.Object)(((net.C_47eb) (((java.lang.Object)(initialValue323))))));
                java.lang.Object initialValue325 = recovery$indy$flow$1119(initialValue324);
                java.lang.Object initialValue326 = recovery$indy$flow$1120(initialValue322, initialValue325);
                java.lang.Object initialValue327 = recovery$indy$flow$1121(initialValue326);
                client.setting.NumberSetting initialized328 = new client.setting.NumberSetting((client.module.Module) (loopLocal270), (java.lang.String) (initialValue327), Double.longBitsToDouble(4641240890982006784L), Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble(4652007308841189376L), 0, (client.setting.SettingGroup) (initialValue320), loopLocal280);
                short converted329 = (short) (loopLocal274);
                int initialValue330 = (int) (converted329);
                int initialValue331 = loopLocal273;
                java.lang.String initialValue332 = "FlushCondition";
                int initialValue333 = loopLocal272;
                client.setting.NumberSetting initialValue334 = initialized328;
                java.lang.Object initialValue335 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue334))))));
                java.lang.Object initialValue336 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue332))))));
                java.lang.Object initialValue337 = recovery$indy$flow$1125(initialValue335, initialValue333, initialValue336, initialValue331, (short) (initialValue330));
                java.lang.Object initialValue338 = initialValue337;
                java.lang.Object initialValue339 = initialValue289;
                java.lang.Object initialValue340 = ((java.lang.Object)(((net.C_47eb) (((java.lang.Object)(initialValue339))))));
                java.lang.Object initialValue341 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue338))))));
                java.lang.Object initialValue342 = recovery$indy$flow$1128(initialValue340, initialValue341);
                int incremented343 = loopLocal284 + (1);
                if (loopLocal281 == null) {
                    Ping_47C0 loopNext344 = loopLocal270;
                    long loopNext345 = loopLocal271;
                    int loopNext346 = loopLocal272;
                    int loopNext347 = loopLocal273;
                    int loopNext348 = loopLocal274;
                    long loopNext349 = loopLocal275;
                    long loopNext350 = loopLocal276;
                    int loopNext351 = loopLocal277;
                    int loopNext352 = loopLocal278;
                    int loopNext353 = loopLocal279;
                    long loopNext354 = loopLocal280;
                    java.lang.Object loopNext355 = loopLocal281;
                    java.lang.Object loopNext356 = loopLocal282;
                    int loopNext357 = loopLocal283;
                    int loopNext358 = incremented343;
                    loopLocal270 = loopNext344;
                    loopLocal271 = loopNext345;
                    loopLocal272 = loopNext346;
                    loopLocal273 = loopNext347;
                    loopLocal274 = loopNext348;
                    loopLocal275 = loopNext349;
                    loopLocal276 = loopNext350;
                    loopLocal277 = loopNext351;
                    loopLocal278 = loopNext352;
                    loopLocal279 = loopNext353;
                    loopLocal280 = loopNext354;
                    loopLocal281 = loopNext355;
                    loopLocal282 = loopNext356;
                    loopLocal283 = loopNext357;
                    loopLocal284 = loopNext358;
                    continue loop285;
                } else {
                    long loopNext359 = loopLocal271;
                    loopExit286 = loopNext359;
                    break loop285;
                }
            }
        }
        java.lang.Object initialValue360 = recovery$indy$flow$1129();
        if (initialValue360 == null) {
        } else {
            java.lang.String initialValue361 = "PCyLpc";
            java.lang.Object initialValue362 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue361))))));
            recovery$indy$flow$1131(initialValue362);
        }
        return;
    }












    private static native java.lang.invoke.MethodHandle c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native void c();

    private static native java.lang.Object c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);
    private static native void recovery$indy$flow$870(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$874(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$875();
    private static native void recovery$indy$flow$878(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$882(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$886(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$891(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$893(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$894(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$897(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$898(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$903(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$904(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$907(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$908(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$913(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$914(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$917(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$919(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$924(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$925(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$928(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$929(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$931();


    private static java.lang.Object recovery$indy$flow$935(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$936(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$939(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$940(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$945(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$947(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$949();

    private static native void recovery$indy$flow$952(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$955(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$957(int a0);

    private static native void recovery$indy$flow$960(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$968(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$970(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$973(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$975(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$981(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$982(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$985(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$986(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$990(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$993(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$995(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$999(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1002(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$1005(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$1006(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1008();



    private static native java.lang.Object recovery$indy$flow$1013(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native java.lang.Object recovery$indy$flow$1014(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1017(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1018(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1021(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1023(int a0);

    private static native void recovery$indy$flow$1026(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1034(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1036(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1039(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1041(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1047(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$1048(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1051(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1052(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1056(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1059(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$1062(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$1063(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$1067(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1070(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1073(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1074(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.Ping_47C0) (a0)).field_43a = a1;
        return;
    }
    private static native void recovery$indy$flow$1077(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1078(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.Ping_47C0) (a0)).field_43v = a1;
        return;
    }
    private static void recovery$indy$flow$1079(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.Ping_47C0) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$1080(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.Ping_47C0) (a0)).field_47 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static native void recovery$indy$flow$1083(java.lang.Object a0,java.lang.Object a1);
    private static long recovery$indy$flow$1085() {
        return java.lang.System.currentTimeMillis();
    }
    private static native void recovery$indy$flow$1087(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1090(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1091(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.Ping_47C0) (a0)).field_43P = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$1092();
    private static java.lang.Object recovery$indy$flow$1096(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }

    private static native java.lang.Object recovery$indy$flow$1098(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1099(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1100(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$1104(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1107(java.lang.Object a0,java.lang.Object a1,long a2);

    private static java.lang.Object recovery$indy$flow$1109(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1110(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1113(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static java.lang.Object recovery$indy$flow$1117(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }

    private static native java.lang.Object recovery$indy$flow$1119(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1120(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1121(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$1125(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);


    private static native java.lang.Object recovery$indy$flow$1128(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1129();

    private static native void recovery$indy$flow$1131(java.lang.Object a0);
   private static native MethodHandle recovery$constant$0();
   private static native C_47Fw recovery$indy$1(C_47Pi var0, C_47wr var1, C_47tf var2, boolean var3);
   private static native String recovery$indy$2(long var0, long var2);
   private static native C_473U recovery$indy$3(Object var0, long var1, long var3);
   private static native void recovery$indy$4(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$6(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$7(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$9(Object var0, int var1, long var2, long var4);
   private static native MethodHandle recovery$constant$10();
   private static native String recovery$indy$11(int var0, long var1);
   private static native String recovery$indy$12(int var0, long var1);
   private static native String recovery$indy$13(long var0, long var2);
   private static native C_473U recovery$indy$14(Object var0, long var1, long var3);
   private static native void recovery$indy$15(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$16(Object var0, long var1, long var3);
   private static native int recovery$indy$17(Object var0, long var1, long var3);
   private static native boolean recovery$indy$18(Object var0, long var1, long var3, long var5, long var7);
   private static native boolean recovery$indy$19(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$20(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$21(Object var0, int var1, long var2, long var4);
   private static native int recovery$indy$22(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$23(Object var0, int var1, long var2, long var4);
   private static native String recovery$indy$24(long var0, long var2);
   private static native boolean recovery$indy$25(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$27(Object var0, long var1, long var3);
   private static native C_47cu recovery$indy$28(Object var0, long var1, long var3);
   private static native void recovery$indy$29(Object var0, long var1, long var3);
   private static native boolean recovery$indy$30(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$31(Object var0, long var1, long var3);
   private static native Predicate recovery$indy$32();
   private static native Consumer recovery$indy$33();
   private static native boolean recovery$indy$34(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$35(Object var0, long var1, long var3);
   private static native C_47cu recovery$indy$36(Object var0, long var1, long var3);
   private static native void recovery$indy$37(Object var0, long var1, long var3);
   private static native boolean recovery$indy$38(Object var0, long var1, long var3);
   private static native boolean recovery$indy$39(Object var0, long var1, long var3);
   private static native C_47cu recovery$indy$40(Object var0, long var1, long var3);
   private static native void recovery$indy$41(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$42(Object var0, long var1, long var3);
   private static native boolean recovery$indy$43(Object var0, long var1, long var3);
   private static native boolean recovery$indy$44(long var0, long var2, long var4);
   private static native C_47cu recovery$indy$45(Object var0, long var1, long var3);
   private static native void recovery$indy$46(Object var0, long var1, long var3);
   private static native boolean recovery$indy$47(long var0, long var2, long var4);
   private static native boolean recovery$indy$48(Object var0, long var1, long var3);
   private static native C_47cu recovery$indy$49(Object var0, long var1, long var3);
   private static native void recovery$indy$50(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$51(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$52(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$53(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$54(Object var0, long var1, long var3);
   private static native String recovery$indy$55(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$56(Object var0, long var1, long var3);
   private static native boolean recovery$indy$57(Object var0, long var1, long var3);
   private static native boolean recovery$indy$58(Object var0, long var1, long var3);
   private static native boolean recovery$indy$59(Object var0, long var1, long var3);
   private static native boolean recovery$indy$60(Object var0, long var1, long var3);
   private static native boolean recovery$indy$61(Object var0, long var1, long var3);
   private static native boolean recovery$indy$62(Object var0, long var1, long var3);
   private static native boolean recovery$indy$63(Object var0, long var1, long var3);
   private static native boolean recovery$indy$64(Object var0, long var1, long var3);
   private static native boolean recovery$indy$65(Object var0, long var1, long var3);
   private static native boolean recovery$indy$66(
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
   private static native C_47Fw recovery$indy$67(C_47Pi var0, EntityLivingBase var1, C_47wr var2, double var3, double var5, double var7, boolean var9);
   private static native String recovery$indy$68(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$69(Object var0, long var1, long var3);
   private static native boolean recovery$indy$70(Object var0, long var1, long var3);
   private static native boolean recovery$indy$71(Object var0, long var1, long var3);
   private static native boolean recovery$indy$72(Object var0, long var1, long var3);
   private static native boolean recovery$indy$73(Object var0, long var1, long var3);
   private static native boolean recovery$indy$74(Object var0, long var1, long var3);
   private static native boolean recovery$indy$75(Object var0, long var1, long var3);
   private static native boolean recovery$indy$76(
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
   private static native String recovery$indy$77(int var0, long var1);
   private static native C_47Fw recovery$indy$78(Ping_47C0 var0);
   private static native String recovery$indy$79(int var0, long var1);
   private static native C_47Fw recovery$indy$80(Ping_47C0 var0);
   private static native void recovery$indy$81(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$82(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$83(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$84(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$85(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$86(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$87(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$88(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$89(Object var0, int var1, long var2, long var4, long var6);
   private static native String recovery$indy$90(int var0, long var1);
   private static native void recovery$indy$91(long var0, Object var2, long var3, long var5);
   private static native String recovery$indy$92(int var0, long var1);
   private static native void recovery$indy$93(long var0, Object var2, long var3, long var5);
   private static native void recovery$indy$94(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$95(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$96(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$97(Object var0, long var1, long var3, long var5);
}
