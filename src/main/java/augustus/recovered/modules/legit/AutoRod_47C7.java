package augustus.recovered.modules.legit;
import augustus.recovered.modules.combat.KillAura_47CY;
import augustus.recovered.modules.world.Scaffold_47Te;
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
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_429;
import net.C_435;
import net.C_43J;
import net.C_43r;
import net.C_43y;
import net.C_43z;
import net.C_455;
import net.C_45V;
import net.C_45n;
import client.render.RenderPass;
import net.C_472n;
import net.C_475c;
import net.C_476q;
import net.C_477r;
import net.C_478Q;
import net.C_478i;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Bm;
import net.C_47F9;
import net.C_47Fw;
import net.C_47KL;
import net.C_47MO;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47S6;
import client.setting.ShaderOptions;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import net.C_47U0;
import net.C_47UH;
import net.C_47VO;
import client.event.RenderListener;
import net.C_47Xk;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.C_47gG;
import net.C_47gg;
import net.C_47hN;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47i;
import net.C_47j9;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import client.ClientGlobals;
import net.C_47rf;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47tU;
import net.C_47tf;
import net.C_47xz;
import net.C_48T;
import net.C_48p;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoRod_47C7 extends client.module.Module implements net.C_47oO,net.C_47U0,net.C_47UH,net.C_47xz,net.C_47hi,client.event.RenderListener,net.C_48T {
    private final client.setting.SettingGroup settingRotations = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaxTargetLookFovDiff = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingFov = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMaxRodRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingMoveFix = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingIgnoreEatingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCombat = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDisableWhileScaffold = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyWhileKillAuraHasTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingESP = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingESPColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_42v; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_429 field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native void a();

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   public void method_42$0db73fbf69(long var1, C_47VO var3) {
      long var10000 = -6214989312456876165L;
      boolean var4 = AimBot_47O_.method_45g$aae029aa0a();
      AutoRod_47C7 var9 = this;
      if (!var4) {
         if (this.field_42v == null) {
            return;
         }

         var9 = this;
      }

      long var10001 = -6217801058899118421L;
      BooleanSetting var5 = var9.settingMoveFix;
      if (!var5.method_49$aae029aa0a()) {
         var10001 = -6221216622373218220L;
         Client var12 = Client.method_44$fbc0c0be91();
         long var10002 = -6215936273107077898L;
         Client var6 = var12;
         var10002 = -6218510790811880330L;
         float var7 = var6.method_45$03ec613b6f().field_43;
         C_47VO var8 = var3;
         var8.method_49$24a796ab4c(var7);
      }
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$fae8de1664(C_475c var1) {
      augustus.recovered.modules.legit.AutoRod_47C7 var15;
      long var2 = a ^ 95331863775096L;
      long var4 = var2 ^ 94325085904055L;
      long var10000 = -6873193296458770855L;
      boolean var6 = AimBot_47O_.method_45g$aae029aa0a();
      AutoRod_47C7 var13 = this;
      if (!var6) {
         if (this.field_42v == null) {
            return;
         }

         var13 = this;
      }

      long var10002 = -6876716883753461660L;
      long var8 = var4;
      AutoRod_47C7 var10 = var13;
      C_47Bm var7 = var10.method_44$b43cdc17a2(var8);
      if (var7 == null) {
         label45: {
            int var14 = (int) ((this.field_43a) ? 1 : 0);
            if (!var6) {
               if (this.field_43a) {
                  return;
               }

               var15 = this;
               if (var6) {
                  break label45;
               }

               var14 = this.field_42v.field_432;
            }

            if (var14 >= this.field_43p) {
               return;
            }

            var10002 = -6876357069145284865L;
            byte var11 = 1;
            C_475c var12 = var1;
            var12.method_48$d00df7729d(var11);
            this.field_437 = 0;
            this.field_43a = true;
            var15 = this;
         }

         var15.field_43P = true;
      }
   }



   public void method_41$0db73fbf69(long var1, C_47VO var3) {
      long var10000 = -5072526063214321370L;
      boolean var4 = AimBot_47O_.method_45i$aae029aa0a();
      AutoRod_47C7 var9 = this;
      if (var4) {
         if (this.field_42v == null) {
            return;
         }

         var9 = this;
      }

      long var10001 = -5072245962777090427L;
      BooleanSetting var5 = var9.settingMoveFix;
      if (!var5.method_49$aae029aa0a()) {
         var10001 = -5077841859687593862L;
         Client var12 = Client.method_44$fbc0c0be91();
         long var10002 = -5074814410217052968L;
         Client var6 = var12;
         var10002 = -5071822112998595496L;
         float var7 = var6.method_45$03ec613b6f().field_43;
         C_47VO var8 = var3;
         var8.method_49$24a796ab4c(var7);
      }
   }



   private double method_40$83ff7736af(Entity var1) {
      long var2 = a ^ 1734180676002L;
      long var4 = var2 ^ 28558860534933L;
      long var10000 = -4157717750581666064L;
      boolean var6 = AimBot_47O_.method_45i$aae029aa0a();
      Entity var10 = var1;
      if (var6) {
         if (!(var1 instanceof EntityLivingBase)) {
            return 1000.0;
         }

         var10 = var1;
      }

      double var11 = var10.field_48Q;
      double var10001 = var1.field_48j;
      double var10003 = var1.field_42o;
      long var10004 = -4156272233444329556L;
      Client var12 = Client.method_44$fbc0c0be91();
      long var10005 = -4159998972234573042L;
      Client var8 = var12;
      float var13 = var8.method_45$03ec613b6f().field_43;
      var10005 = -4156272233444329556L;
      Client var15 = Client.method_44$fbc0c0be91();
      long var10006 = -4159998972234573042L;
      Client var9 = var15;
      var10006 = -4158584844092102311L;
      float var7 = C_47gg.method_42$edd155e764(var11, var10001, var4, var10003, var13, var9.method_45$03ec613b6f().field_48)[0];
      return Math.abs(var7);
   }



   private int method_44$910884672c(byte var1, int var2, net.minecraft.entity.EntityLivingBase var3, int var4, int var5) {
      long var6 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var5 << 40 >>> 40) ^ a;
      long var8 = var6 ^ 125042891494463L;
      long var10 = var6 ^ 18998031455409L;
      long var12 = var6 ^ 35075678199392L;
      long var14 = var6 ^ 76732420331920L;
      long var16 = var6 ^ 120782038689463L;
      int var19 = -1;
      int var10000 = ((int) (recovery$indy$flow$53(-5426058066260098442L, var6) ? 1 : 0));
      int var20 = 0;
      byte var18 = (byte)var10000;

      while (true) {
         if (var20 < var4) {
            double var21;
            double var23;
            double var25;
            double[] var27;
            label55: {
               label65: {
                  var21 = var3.field_48Q - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$56(field_43, -5426814819477547079L, var6)).field_48Q;
                  var23 = var3.field_48j
                     + this.field_42v.field_48 / 1.7
                     - (
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$62(field_43, -5426814819477547079L, var6)).field_48j
                           + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$65(field_43, -5426814819477547079L, var6)).method_41$bc607678b6()
                     );
                  var25 = var3.field_42o - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$69(field_43, -5426814819477547079L, var6)).field_42o;
                  var27 = (double[])recovery$indy$flow$72(this.field_42v, var16, var19, -5423185260188277671L, var6);
                  var10000 = var18;
                  if (var1 >= 0) {
                     if (var18 != 0) {
                        break label65;
                     }

                     var10000 = var19;
                  }

                  byte var10001 = var18;
                  if (var5 > 0) {
                     if (var18 != 0) {
                        break;
                     }

                     var10001 = -1;
                  }

                  if (var10000 == var10001) {
                     break label55;
                  }

                  var21 = var27[0] - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$74(field_43, -5426814819477547079L, var6)).field_48Q;
                  var23 = var27[1]
                     + this.field_42v.field_48 / 1.7
                     - (
                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$79(field_43, -5426814819477547079L, var6)).field_48j
                           + ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$82(field_43, -5426814819477547079L, var6)).method_41$bc607678b6()
                     );
               }

               var25 = var27[2] - ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$85(field_43, -5426814819477547079L, var6)).field_42o;
            }

            float var28 = (float)Math.toDegrees(Math.atan2(var25, var21)) - 90.0F;
            double var29 = net.C_47sk.method_42$44b37c2d95(var21 * var21 + var25 * var25);
            double var31 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$91(field_43, -5426814819477547079L, var6)).method_44$ee256e8a75(this.field_42v);
            float var33 = (float)((float)(-(Math.atan2(var23, var29) * 180.0 / Math.PI)) - 0.55F * Math.max(0.0, var31 - 3.0));
            float var34 = recovery$indy$flow$99(
               ((net.C_477r)recovery$indy$flow$97(client.ClientGlobals.field_46, -5424014731155255131L, var6)).field_44, var28, 180.0F, var8, -5422639958833824918L, var6
            );
            float var35 = recovery$indy$flow$103(
               ((net.C_477r)recovery$indy$flow$101(client.ClientGlobals.field_46, -5424014731155255131L, var6)).field_41, var33, 180.0F, var8, -5422639958833824918L, var6
            );
            net.C_47Kr var36 = new net.C_47Kr();
            recovery$indy$flow$114(
               var36,
               var12,
               (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$107(field_43, -5426814819477547079L, var6),
               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$109(field_43, -5426814819477547079L, var6))
                  .field_429
                  .method_46$4c10532da1(recovery$indy$flow$111(this, var10, -5424155098266458720L, var6) + 36)
                  .method_48$ac4db64966(),
               var34,
               var35,
               -5422836254044597908L,
               var6
            );
            double var37 = var3.field_48w / 2.0F + 0.1F;
            var19 = recovery$indy$flow$119(
               var36,
               100,
               var14,
               var3,
               new net.C_478i(var27[0] - var37, var27[1] - 0.1F, var27[2] - var37, var27[0] + var37, var27[1] + var3.field_48 + 0.1F, var27[2] + var37),
               -5426082417333171724L,
               var6
            );
            byte var40 = var18;
            if (var5 > 0) {
               if (var18 == 0) {
                  if (var2 < 0) {
                     return var19;
                  }

                  if (var19 == Integer.MAX_VALUE) {
                     return 0;
                  }

                  var20++;
               }

               var40 = var18;
            }

            if (var40 == 0) {
               continue;
            }
         }

         var10000 = var19;
         break;
      }

      return var10000;
   }





    private C_47Bm method_44$b43cdc17a2(long l) {
        Minecraft c_47nT;
        boolean bl;
        block11: {
            block12: {
                C_47Bm c_47Bm;
                block13: {
                    l = a ^ l;
                    bl = AutoRod_47C7.recovery$indy$21(6617618298873146642L, l);
                    c_47nT = field_43;
                    if (bl) break block11;
                    if (AutoRod_47C7.recovery$indy$22(c_47nT, 6617002282555734237L, l) == null) break block12;
                    c_47nT = field_43;
                    if (bl) break block11;
                    c_47Bm = AutoRod_47C7.recovery$indy$23((Object)c_47nT, (long)6617002282555734237L, (long)l).field_42w;
                    if (l <= 0L) break block13;
                    if (c_47Bm == null) break block12;
                    c_47Bm = AutoRod_47C7.recovery$indy$24((Object)AutoRod_47C7.field_43, (long)6617002282555734237L, (long)l).field_42w;
                }
                return c_47Bm;
            }
            c_47nT = field_43;
        }
        WorldClient c_47hb = AutoRod_47C7.recovery$indy$25(c_47nT, 6619996325786646497L, l);
        if (!bl) {
            if (c_47hb == null) {
                return null;
            }
            c_47hb = AutoRod_47C7.recovery$indy$26(field_43, 6619996325786646497L, l);
        }
        Iterator iterator = c_47hb.field_44Q.iterator();
        block0: while (true) {
            boolean bl2 = iterator.hasNext();
            while (bl2) {
                block15: {
                    block16: {
                        C_47Bm c_47Bm;
                        block14: {
                            C_47Bm c_47Bm2;
                            Entity c_47MQ;
                            Entity c_47MQ2 = c_47MQ = (Entity)iterator.next();
                            if (!bl) {
                                if (!(c_47MQ2 instanceof C_47Bm)) continue block0;
                                c_47MQ2 = c_47MQ;
                            }
                            c_47Bm = c_47Bm2 = (C_47Bm)c_47MQ2;
                            if (bl) break block14;
                            bl2 = c_47Bm.field_43.method_41$0e30dfc966().equals(AutoRod_47C7.recovery$indy$27(field_43, 6619251554834177839L, l).method_47$0e30dfc966());
                            if (l <= 0L) break block15;
                            if (!bl2) break block16;
                            c_47Bm = c_47Bm2;
                        }
                        return c_47Bm;
                    }
                    bl2 = bl;
                }
                if (l <= 0L) continue;
                if (bl2) break block0;
                continue block0;
            }
            break;
        }
        return null;
    }



    private boolean method_44$7c2c45e4ce(net.minecraft.entity.Entity entity) {
        long l;
        long l2 = l = a ^ 0xC2746795C82L;
        long l3 = l2 ^ 0x72E3B4C1F704L;
        long l4 = l2 ^ 0x49B5E0F2A863L;
        boolean bl = augustus.recovered.modules.legit.AimBot_47O_.method_45i$aae029aa0a();
        net.minecraft.entity.Entity entity2 = entity;
        AutoRod_47C7 autoRod_47C7 = this;
        long l5 = l3;
        client.setting.NumberSetting numberSetting = this.settingFov;
        double d = autoRod_47C7.method_40$83ff7736af(entity2) - numberSetting.method_44$474dfaa627(l5);
        double d2 = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
        if (!bl) return (boolean)((((int) (d2)) & 1) != 0);
        if (d2 > 0) return false;
        if (entity.field_427) return false;
        if (entity.field_48y < 1) return false;
        if (!(entity instanceof EntityLivingBase)) return false;
        if (((EntityLivingBase)entity).field_48P > 1) return false;
        net.minecraft.client.Minecraft minecraft = field_43;
        if (!((EntityLivingBase)entity).method_48$7c2c45e4ce(minecraft.field_42P)) return false;
        net.minecraft.client.Minecraft minecraft2 = field_43;
        long l6 = l3;
        client.setting.NumberSetting numberSetting2 = this.settingMaxRodRange;
        if ((double)minecraft2.field_42P.method_44$ee256e8a75(entity) > numberSetting2.method_44$474dfaa627(l6)) return false;
        if (entity instanceof EntityPlayerSP) {
            return false;
        }
        net.C_47Xk c_47Xk = net.C_47Xk.PLAYER;
        net.C_47Xk c_47Xk2 = net.C_47Xk.MOB;
        net.C_47Xk c_47Xk3 = net.C_47Xk.ANIMAL;
        net.C_47Xk c_47Xk4 = net.C_47Xk.VILLAGER;
        net.C_47Xk c_47Xk5 = net.C_47Xk.INVISIBLE;
        net.C_47Xk c_47Xk6 = net.C_47Xk.DEAD;
        if (!AutoRod_47C7.recovery$indy$flow$191(entity, c_47Xk.method_43$aae029aa0a(), c_47Xk2.method_43$aae029aa0a(), c_47Xk3.method_43$aae029aa0a(), c_47Xk4.method_43$aae029aa0a(), false, c_47Xk5.method_43$aae029aa0a(), true, true, l4, true, c_47Xk6.method_43$aae029aa0a(), true, -4942939059991782908L, l)) return false;
        if (!entity.method_48V$aae029aa0a()) return true;
        client.setting.BooleanSetting booleanSetting = this.settingIgnoreEatingTargets;
        if (!booleanSetting.method_49$aae029aa0a()) return true;
        return false;
    }





   private void method_48$2e27eb1fa5(float var1, float var2, float var3, float var4, RenderPass var5) {
      long var6 = a ^ 106509555432851L;
      long var8 = var6 ^ 50013950326280L;
      long var10001 = var6 ^ 135033886812413L;
      int var10 = (int)((var6 ^ 135033886812413L) >>> 32);
      int var11 = (int)((var6 ^ 135033886812413L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      ShaderOptions var10000 = this.field_44;
      short var10004 = (short)var11;
      char var10005 = (char)var12;
      long var10007 = -7316829604926072941L;
      byte var13 = 0;
      char var14 = var10005;
      short var15 = var10004;
      int var16 = var10;
      ColorSetting var17 = this.settingESPColor;
      int var10003 = var17.method_47$24af287d8f(var16, var15, var14, var13);
      long var23 = -7315573702843114348L;
      int var18 = var10003;
      long var19 = var8;
      RenderPass var21 = var5;
      ShaderOptions var22 = var10000;
      RenderUtils.method_43$d00df7729d(var22.method_40$d68b376f5b(var21, var19, var18));
      RenderUtils.method_44$cc82067b44(var1 - var2, var3, var4 - var2, var1 + var2, var3 + this.field_42v.field_48, var4 + var2);
   }



   public boolean method_48$0dd78e0064(long var1) {
        boolean var69;
        int var71;
        boolean var72;
        int var73;
      var1 = a ^ var1;
      long var3 = var1 ^ 116472959334072L;
      long var5 = var1 ^ 84607126722813L;
      long var7 = var1 ^ 13452598804241L;
      byte var9 = ((byte) (AimBot_47O_.method_45g$aae029aa0a() ? 1 : 0));
      if (var9 == 0) {
         net.minecraft.client.Minecraft var10 = field_43;
         net.C_47rf var68 = var10.field_42P.method_48$ac4db64966();
         if (var1 > 0L) {
            label432: {
               label431:
               if (var68 != null) {
                  label429: {
                     net.minecraft.client.Minecraft var11 = field_43;
                     if (!(var11.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_43J)) {
                        net.minecraft.client.Minecraft var35 = field_43;
                        if (!(var35.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_45V)) {
                           net.minecraft.client.Minecraft var36 = field_43;
                           var72 = var36.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_43z;
                           if (var9 != 0) {
                              break label429;
                           }

                           if (!var72) {
                              net.minecraft.client.Minecraft var14 = field_43;
                              if (!(var14.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_43y)) {
                                 break label431;
                              }
                           }
                        }
                     }

                     net.minecraft.client.Minecraft var37 = field_43;
                     var72 = var37.field_44r.field_45w.method_42$aae029aa0a();
                  }

                  if (var9 != 0) {
                     break label432;
                  }

                  if (var72) {
                     return false;
                  }
               }

               net.minecraft.client.Minecraft var38 = field_43;
               var72 = var38.method_44$aae029aa0a();
            }

            if (var72) {
               label415: {
                  label555: {
                     net.minecraft.client.Minecraft var40 = field_43;
                     if (var40.field_42P.method_48$ac4db64966() != null) {
                        net.minecraft.client.Minecraft var41 = field_43;
                        if (var41.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_435) {
                           break label555;
                        }
                     }

                     client.setting.BooleanSetting var42 = this.settingCombat;
                     var73 = ((var42.method_49$aae029aa0a()) ? 1 : 0);
                     if (var9 != 0) {
                        break label415;
                     }

                     if (var73 == 0) {
                        return false;
                     }
                  }

                  var73 = this.field_438;
               }

               if (var73 != -1) {
                  long var45 = var5;
                  AutoRod_47C7 var48 = this;
                  int var74 = var48.method_45$95d88932bd(var45);
                  if (var9 == 0) {
                     if (var74 == -1) {
                        return false;
                     }

                     net.minecraft.client.Minecraft var49 = field_43;
                     var74 = ((int) (var49.field_44r.field_45w.field_45 ? 1 : 0));
                  }

                  if (var9 == 0) {
                     if (var74 != 0) {
                        return false;
                     }

                     long var51 = var7;
                     long var53 = 100L;
                     net.C_47cu var55 = this.field_47;
                     var74 = ((int) (var55.method_42$b0e346e6e3(var53, var51) ? 1 : 0));
                  }

                  label402:
                  if (var9 == 0) {
                     if (var74 == 0) {
                        client.setting.BooleanSetting var59 = this.settingClick;
                        var74 = ((int) (var59.method_49$aae029aa0a() ? 1 : 0));
                        if (var9 != 0) {
                           break label402;
                        }

                        if (var74 != 0) {
                           return false;
                        }
                     }

                     client.setting.BooleanSetting var63 = this.settingOnlyWhileKillAuraHasTarget;
                     var74 = ((int) (var63.method_49$aae029aa0a() ? 1 : 0));
                  }

                  if (var9 != 0) {
                     return (((var74) & 1) != 0);
                  }

                  if (var74 != 0) {
                     long var65 = var3;
                     augustus.recovered.modules.combat.KillAura_47CY var67 = client.ClientGlobals.field_48.field_48Q;
                     if (!var67.method_46$0dd78e0064(var65) || client.ClientGlobals.field_48.field_48Q.field_45z == null) {
                        return false;
                     }
                  }

                  return true;
               }
            }

            return false;
         } else {
            byte var75;
            label510: {
               if (!(var68.method_48$dbd570a038() instanceof C_43J)) {
                  net.minecraft.client.Minecraft var12 = field_43;
                  if (!(var12.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_45V)) {
                     net.minecraft.client.Minecraft var13 = field_43;
                     var69 = var13.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_43z;
                     var75 = var9;
                     break label510;
                  }
               }

               net.minecraft.client.Minecraft var15 = field_43;
               var69 = var15.field_44r.field_45w.method_42$aae029aa0a();
               var75 = var9;
            }

            if (var75 == 0) {
               if (var69) {
                  return false;
               }

               net.minecraft.client.Minecraft var16 = field_43;
               var69 = var16.method_44$aae029aa0a();
            }

            if (var69) {
               label593: {
                  label559: {
                     net.minecraft.client.Minecraft var39 = field_43;
                     if (var39.field_42P.method_48$ac4db64966() != null) {
                        net.minecraft.client.Minecraft var18 = field_43;
                        if (var18.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_435) {
                           if (this.field_438 == -1) {
                              return false;
                           }

                           long var44 = var5;
                           AutoRod_47C7 var47 = this;
                           var71 = var47.method_45$95d88932bd(var44);
                           var75 = var9;
                           if (var1 < 0L) {
                              break label593;
                           }
                           break label559;
                        }
                     }

                     client.setting.BooleanSetting var19 = this.settingCombat;
                     int var70 = ((int) (var19.method_49$aae029aa0a() ? 1 : 0));
                     if (var1 < 0L) {
                        if (var70 == var9) {
                           return false;
                        }

                        long var43 = var5;
                        AutoRod_47C7 var46 = this;
                        var71 = var46.method_45$95d88932bd(var43);
                        var75 = var9;
                        break label593;
                     }

                     if (var9 == 0) {
                        if (var70 == 0) {
                           return false;
                        }

                        var70 = this.field_438;
                     }

                     if (var70 == -1) {
                        return false;
                     }

                     long var20 = var5;
                     AutoRod_47C7 var22 = this;
                     var71 = var22.method_45$95d88932bd(var20);
                     var75 = var9;
                  }

                  if (var75 == 0) {
                     if (var71 != 0) {
                        return false;
                     }

                     long var50 = var7;
                     long var52 = 100L;
                     net.C_47cu var54 = this.field_47;
                     var71 = ((var54.method_42$b0e346e6e3(var52, var50)) ? 1 : 0);
                  }

                  label485:
                  if (var9 == 0) {
                     if (var71 == 0) {
                        client.setting.BooleanSetting var57 = this.settingClick;
                        var71 = ((var57.method_49$aae029aa0a()) ? 1 : 0);
                        if (var9 != 0) {
                           break label485;
                        }

                        if (var71 != 0) {
                           return false;
                        }
                     }

                     client.setting.BooleanSetting var61 = this.settingOnlyWhileKillAuraHasTarget;
                     var71 = ((var61.method_49$aae029aa0a()) ? 1 : 0);
                  }

                  if (var9 != 0) {
                     return (((var71) & 1) != 0);
                  }

                  if (var71 != 0) {
                     long var31 = var3;
                     augustus.recovered.modules.combat.KillAura_47CY var33 = client.ClientGlobals.field_48.field_48Q;
                     if (!var33.method_46$0dd78e0064(var31) || client.ClientGlobals.field_48.field_48Q.field_45z == null) {
                        return false;
                     }
                  }

                  return true;
               }

               label461: {
                  if (var75 == 0) {
                     if (var71 == 0) {
                        client.setting.BooleanSetting var58 = this.settingClick;
                        var71 = ((var58.method_49$aae029aa0a()) ? 1 : 0);
                        var75 = var9;
                        break label461;
                     }

                     client.setting.BooleanSetting var62 = this.settingOnlyWhileKillAuraHasTarget;
                     var71 = ((var62.method_49$aae029aa0a()) ? 1 : 0);
                  }

                  var75 = var9;
               }

               if (var75 != 0) {
                  return (((var71) & 1) != 0);
               }

               if (var71 != 0) {
                  long var64 = var3;
                  augustus.recovered.modules.combat.KillAura_47CY var66 = client.ClientGlobals.field_48.field_48Q;
                  if (!var66.method_46$0dd78e0064(var64) || client.ClientGlobals.field_48.field_48Q.field_45z == null) {
                     return false;
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         net.minecraft.client.Minecraft var17 = field_43;
         if (((int) (var17.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_435 ? 1 : 0)) == -1) {
            return false;
         }

         net.minecraft.client.Minecraft var23 = field_43;
         boolean var10000 = var23.field_44r.field_45w.field_45;
         if (var1 >= 0L) {
            if (var9 == 0) {
               if (var23.field_44r.field_45w.field_45) {
                  return false;
               }

               long var24 = var7;
               long var26 = 100L;
               net.C_47cu var28 = this.field_47;
               var10000 = var28.method_42$b0e346e6e3(var26, var24);
            }

            if (var9 == 0) {
               if (!var10000) {
                  client.setting.BooleanSetting var56 = this.settingClick;
                  var10000 = var56.method_49$aae029aa0a();
                  if (var9 != 0) {
                     return var9 != 0 ? var10000 : !var10000 || client.ClientGlobals.field_48.field_48Q.field_45z != null;
                  }

                  if (var10000) {
                     return false;
                  }
               }

               client.setting.BooleanSetting var60 = this.settingOnlyWhileKillAuraHasTarget;
               var10000 = var60.method_49$aae029aa0a();
            }

            return var9 != 0 ? var10000 : !var10000 || client.ClientGlobals.field_48.field_48Q.field_45z != null;
         } else {
            byte var10001;
            label546: {
               if (var9 == 0) {
                  if (!var23.field_44r.field_45w.field_45) {
                     client.setting.BooleanSetting var29 = this.settingClick;
                     var10000 = var29.method_49$aae029aa0a();
                     var10001 = var9;
                     break label546;
                  }

                  client.setting.BooleanSetting var30 = this.settingOnlyWhileKillAuraHasTarget;
                  var10000 = var30.method_49$aae029aa0a();
               }

               var10001 = var9;
            }

            if (var10001 == 0) {
               var10000 = !var10000 || client.ClientGlobals.field_48.field_48Q.field_45z != null;
            }

            return var10000;
         }
      }
   }





   private int method_49$95d88932bd(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 26957383543851L;
      long var5 = var1 ^ 127711247695378L;
      long var10001 = var1 ^ 135374134160754L;
      int var7 = (int)((var1 ^ 135374134160754L) >>> 32);
      int var8 = (int)((var1 ^ 135374134160754L) << 32 >>> 40);
      int var9 = (int)(var10001 << 56 >>> 56);
      long var10000 = 6778376552549411029L;
      byte var10 = (byte) ((AimBot_47O_.method_45g$aae029aa0a()) ? 1 : 0);
      int var28 = (int) ((this.field_43P) ? 1 : 0);
      if (var10 == 0) {
         if (!this.field_43P) {
            return this.field_43y;
         }

         this.field_43P = false;
         this.field_43y = -1;
         long var10002 = 6780981561007525635L;
         long var13 = var5;
         AutoRod_47C7 var15 = this;
         var28 = var15.method_45$95d88932bd(var13);
      }

      int var11;
      label81: {
         var11 = var28;
         byte var29 = var10;
         if (var1 > 0L) {
            if (var10 == 0) {
               if (C_47i.field_40 == var11) {
                  break label81;
               }

               this.field_43y = C_47i.field_40;
            }

            var29 = var10;
         }

         if (var1 < 0L) {
            return var29;
         }

         if (var29 == 0) {
            return this.field_43y;
         }
      }

      var10001 = 6778886988638518554L;
      Minecraft var16 = field_43;
      byte var10003 = (byte)var9;
      long var10005 = 6782198078437873540L;
      byte var17 = 36;
      byte var18 = var10003;
      int var19 = var8;
      int var20 = var7;
      C_47gG var21 = var16.field_42P.field_429;
      ArrayList var12 = C_47KL.method_48$fabe8d61eb(var21, var20, var19, var18, var17);
      byte var30 = (byte) ((var12.isEmpty()) ? 1 : 0);
      if (var1 > 0L) {
         if (var10 == 0) {
            if (var30 == 0) {
               this.field_43y = (Integer)var12.get(0);
               if (var1 < 0L) {
                  return var10;
               }

               if (var10 == 0) {
                  return this.field_43y;
               }
            }
         } else if (var30 != var11) {
            return this.field_43y;
         }
      } else if (var30 != var10) {
         return this.field_43y;
      }

      do {
         var10005 = 6778178696934042209L;
         long var22 = var3;
         byte var24 = 8;
         byte var25 = 0;
         C_47MO var26 = C_476q.field_48;
         this.field_43y = var26.method_44$75dd719903(var25, var24, var22);
      } while (this.field_43y == var11);

      return this.field_43y;
   }




   public EntityLivingBase method_49$20b8cce974() {
      return this.field_42v;
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_42v = null;
   }



   private boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 108843114233734L;
      return recovery$indy$29(this, var3, 4873397662271175509L, var1) != null;
   }



   public int method_45$95d88932bd(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$30(-4035361904825929413L, var1);
      int var4 = 36;

      while (var4 < recovery$indy$31(field_43, -4035977361463745292L, var1).field_429.field_46.size()) {
         byte var8;
         label53: {
            C_47rf var5 = recovery$indy$32(field_43, -4035977361463745292L, var1).field_429.method_46$4c10532da1(var4).method_48$ac4db64966();
            label52:
            if (!var3) {
               label62: {
                  C_47rf var10000 = var5;
                  if (var1 >= 0L) {
                     if (var5 == null) {
                        break label62;
                     }

                     var10000 = var5;
                  }

                  C_43r var6 = var10000.method_48$dbd570a038();
                  var8 = (byte) ((var3) ? 1 : 0);
                  if (var1 <= 0L) {
                     break label53;
                  }

                  if (var3) {
                     break label52;
                  }

                  var8 = (byte) ((var6 instanceof C_435) ? 1 : 0);
                  if (var1 <= 0L) {
                     return var8;
                  }

                  if (var8 != 0) {
                     return var4 - 36;
                  }
               }

               var4++;
            }

            var8 = (byte) ((var3) ? 1 : 0);
         }

         if ((var8) != 0) {
            break;
         }
      }

      return -1;
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var10001 = var2 ^ 31970059946167L;
      int var4 = (int)((var2 ^ 31970059946167L) >>> 48);
      int var5 = (int)((var2 ^ 31970059946167L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      boolean var7 = recovery$indy$33(6404069193278385691L, var2);
      AutoRod_47C7 var10000 = this;
      if (!var7) {
         if (this.field_42v == null) {
            return;
         }

         var10000 = this;
      }

      boolean var8 = recovery$indy$34(var10000.settingMoveFix, 6401253098174334923L, var2);
      if (!var7) {
         if (!var8) {
            return;
         }

         var8 = recovery$indy$35(ClientGlobals.field_46, (char)var4, var5, this, (char)var6, 6403829719133036863L, var2);
      }

      if (var8) {
         recovery$indy$36(var1, C_47tU.DEFAULT, 6400247376821643431L, var2);
      }
   }



   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 75862687826910L;
      long var6 = var1 ^ 5451650687478L;
      long var8 = var1 ^ 52344924935716L;
      long var10 = var1 ^ 80017760765463L;
      boolean var12 = recovery$indy$37(8139868386376435250L, var1);
      RenderUtils.method_42$da8c82d5d4();
      if (!var12) {
         label44: {
            AutoRod_47C7 var10000 = this;
            if (var1 > 0L) {
               if (!recovery$indy$38(this.settingESP, 8141555867142844386L, var1)) {
                  break label44;
               }

               var10000 = this;
            }

            if (!var12) {
               if (var10000.field_42v == null) {
                  break label44;
               }

               var10000 = this;
            }

            C_47tf var17 = var10000.field_48;
            if (!var12) {
               if (var10000.field_48 == null) {
                  break label44;
               }

               var17 = this.field_48;
            }

            float var13 = (float)((float)var17.field_40 - recovery$indy$39(field_43, 8134012610746323416L, var1).method_41$fedcb3e4d3());
            float var14 = (float)((float)this.field_48.field_41 - recovery$indy$40(field_43, 8134012610746323416L, var1).method_49$fedcb3e4d3());
            float var15 = (float)((float)this.field_48.field_47 - recovery$indy$41(field_43, 8134012610746323416L, var1).method_45$fedcb3e4d3());
            float var16 = this.field_42v.field_48w / 2.0F;
            recovery$indy$44(
               recovery$indy$42(this.field_44, var4, 8133532711388281793L, var1),
               recovery$indy$43(this.field_44, var8, 8139596385621058410L, var1),
               var6,
               8141155922079959741L,
               var1
            );
            recovery$indy$46(false, var10, recovery$indy$45(this, var13, var16, var14, var15), 8138883294826186937L, var1);
         }

         RenderUtils.method_43$da8c82d5d4();
      }
   }




   public void method_40G$e45a9973e5(long var1) {
        boolean var162;
        boolean var165;
      long var3 = var1 ^ 24282246965738L;
      long var5 = var1 ^ 4059210740823L;
      long var7 = var1 ^ 104729863225817L;
      long var9 = var1 ^ 38454053204368L;
      long var11 = var1 ^ 36854609997241L;
      long var10001 = var1 ^ 6407505185672L;
      int var13 = (int)((var1 ^ 6407505185672L) >>> 32);
      int var14 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      boolean var16 = AimBot_47O_.method_45g$aae029aa0a();
      long var24 = var11;
      AutoRod_47C7 var26 = this;
      this.field_438 = var26.method_45$95d88932bd(var24);
      if (!var16) {
         AutoRod_47C7 var163;
         label495: {
            label496: {
               label479: {
                  label480: {
                     if (this.field_42v != null) {
                        long var27 = var9;
                        AutoRod_47C7 var29 = this;
                        net.C_47Bm var17 = var29.method_44$b43cdc17a2(var27);
                        if (var17 != null) {
                           net.C_478Q var18 = new net.C_478Q(var17.field_48Q, var17.field_48j + 0.5, var17.field_42o);
                           net.minecraft.client.Minecraft var30 = field_43;
                           net.C_47tf var19 = var30.field_42P.method_49$41b79b67a0(1.0F);
                           net.minecraft.client.Minecraft var31 = field_43;
                           double var20 = var31.field_42P.method_40$ee256e8a75(this.field_42v);
                           net.minecraft.client.Minecraft var32 = field_43;
                           double var22 = var32.field_42P.method_40$ee256e8a75(var17);
                           if (var22 > var20) {
                              break label480;
                           }

                           double var159 = var19.method_43$3d77d36e13(new net.C_47tf(var17.field_48J / 32.0F, var17.field_48o / 32.0F, var17.field_48A / 32.0F));
                           long var33 = var7;
                           client.setting.NumberSetting var35 = this.settingMaxRodRange;
                           if (var159 > var35.method_44$474dfaa627(var33)
                              || var17.field_48M
                              || var17.field_46
                              || this.field_42v.field_432 == 10
                              || var17.field_427) {
                              break label480;
                           }

                           net.minecraft.client.Minecraft var36 = field_43;
                           if (var36.field_44Q.method_46$efbf73d2b1(var18.method_45$5730377d31()).method_48$e084f7739d().method_43$aae029aa0a()) {
                              break label480;
                           }
                        }
                     } else {
                        long var75 = var3;
                        AutoRod_47C7 var76 = this;
                        if (var76.method_45$0dd78e0064(var75) && this.field_437 > 3) {
                           long var43 = var5;
                           AutoRod_47C7 var45 = this;
                           this.field_438 = var45.method_49$95d88932bd(var43);
                           this.field_43a = false;
                        }
                     }

                     var163 = this;
                     var165 = var16;
                     if (var1 < 0L) {
                        break label495;
                     }

                     label441: {
                        if (!var16) {
                           long var79 = var11;
                           AutoRod_47C7 var82 = this;
                           if (this.field_438 == var82.method_45$95d88932bd(var79)) {
                              net.minecraft.client.Minecraft var85 = field_43;
                              long var88 = var11;
                              AutoRod_47C7 var91 = this;
                              if (var85.field_44K.field_40 == var91.method_45$95d88932bd(var88)) {
                                 break label441;
                              }
                           }

                           var163 = this;
                        }

                        var163.field_43a = false;
                     }

                     label434: {
                        label482: {
                           net.minecraft.client.Minecraft var94 = field_43;
                           long var97 = var11;
                           AutoRod_47C7 var100 = this;
                           if (var94.field_42P.field_42X.field_42 != var100.method_45$95d88932bd(var97)) {
                              client.setting.BooleanSetting var104 = this.settingCombat;
                              if (!var104.method_49$aae029aa0a()) {
                                 break label482;
                              }
                           }

                           client.setting.BooleanSetting var107 = this.settingCombat;
                           if (!var107.method_49$aae029aa0a()) {
                              break label434;
                           }

                           long var110 = var11;
                           AutoRod_47C7 var113 = this;
                           if (this.field_438 == var113.method_45$95d88932bd(var110)) {
                              break label434;
                           }
                        }

                        long var116 = var3;
                        AutoRod_47C7 var119 = this;
                        if (var119.method_45$0dd78e0064(var116)) {
                           long var123 = var5;
                           AutoRod_47C7 var127 = this;
                           this.field_438 = var127.method_49$95d88932bd(var123);
                           this.field_43a = false;
                        }
                     }

                     this.field_437++;
                     if (this.field_42v == null) {
                        return;
                     }

                     net.minecraft.client.Minecraft var131 = field_43;
                     var162 = var131.field_42P.method_436$aae029aa0a();
                     if (var1 <= 0L) {
                        break label496;
                     }
                     break label479;
                  }

                  var163 = this;
                  if (var1 <= 0L) {
                     this.field_43a = var16;
                     var163 = this;
                     var165 = var16;
                     if (var1 < 0L) {
                        break label495;
                     }

                     label417: {
                        if (!var16) {
                           long var78 = var11;
                           AutoRod_47C7 var81 = this;
                           if (this.field_438 == var81.method_45$95d88932bd(var78)) {
                              net.minecraft.client.Minecraft var84 = field_43;
                              long var87 = var11;
                              AutoRod_47C7 var90 = this;
                              if (var84.field_44K.field_40 == var90.method_45$95d88932bd(var87)) {
                                 break label417;
                              }
                           }

                           var163 = this;
                        }

                        var163.field_43a = false;
                     }

                     label410: {
                        label484: {
                           net.minecraft.client.Minecraft var93 = field_43;
                           long var96 = var11;
                           AutoRod_47C7 var99 = this;
                           if (var93.field_42P.field_42X.field_42 != var99.method_45$95d88932bd(var96)) {
                              client.setting.BooleanSetting var103 = this.settingCombat;
                              if (!var103.method_49$aae029aa0a()) {
                                 break label484;
                              }
                           }

                           client.setting.BooleanSetting var106 = this.settingCombat;
                           if (!var106.method_49$aae029aa0a()) {
                              break label410;
                           }

                           long var109 = var11;
                           AutoRod_47C7 var112 = this;
                           if (this.field_438 == var112.method_45$95d88932bd(var109)) {
                              break label410;
                           }
                        }

                        long var115 = var3;
                        AutoRod_47C7 var118 = this;
                        if (var118.method_45$0dd78e0064(var115)) {
                           long var122 = var5;
                           AutoRod_47C7 var126 = this;
                           this.field_438 = var126.method_49$95d88932bd(var122);
                           this.field_43a = false;
                        }
                     }

                     this.field_437++;
                     if (this.field_42v == null) {
                        return;
                     }

                     net.minecraft.client.Minecraft var130 = field_43;
                     var162 = var130.field_42P.method_436$aae029aa0a();
                     break label496;
                  }

                  label400: {
                     if (!var16) {
                        if (this.field_437 <= 3) {
                           break label400;
                        }

                        long var37 = var5;
                        AutoRod_47C7 var39 = this;
                        this.field_438 = var39.method_49$95d88932bd(var37);
                        var163 = this;
                     }

                     var163.field_43a = false;
                  }

                  label394: {
                     var163 = this;
                     if (!var16) {
                        long var77 = var11;
                        AutoRod_47C7 var80 = this;
                        if (this.field_438 == var80.method_45$95d88932bd(var77)) {
                           net.minecraft.client.Minecraft var83 = field_43;
                           long var86 = var11;
                           AutoRod_47C7 var89 = this;
                           if (var83.field_44K.field_40 == var89.method_45$95d88932bd(var86)) {
                              break label394;
                           }
                        }

                        var163 = this;
                     }

                     var163.field_43a = false;
                  }

                  label387: {
                     label485: {
                        net.minecraft.client.Minecraft var92 = field_43;
                        long var54 = var11;
                        AutoRod_47C7 var56 = this;
                        if (var92.field_42P.field_42X.field_42 != var56.method_45$95d88932bd(var54)) {
                           client.setting.BooleanSetting var102 = this.settingCombat;
                           if (!var102.method_49$aae029aa0a()) {
                              break label485;
                           }
                        }

                        client.setting.BooleanSetting var58 = this.settingCombat;
                        if (!var58.method_49$aae029aa0a()) {
                           break label387;
                        }

                        long var59 = var11;
                        AutoRod_47C7 var61 = this;
                        if (this.field_438 == var61.method_45$95d88932bd(var59)) {
                           break label387;
                        }
                     }

                     long var62 = var3;
                     AutoRod_47C7 var64 = this;
                     if (var64.method_45$0dd78e0064(var62)) {
                        long var121 = var5;
                        AutoRod_47C7 var125 = this;
                        this.field_438 = var125.method_49$95d88932bd(var121);
                        this.field_43a = false;
                     }
                  }

                  this.field_437++;
                  if (this.field_42v == null) {
                     return;
                  }

                  net.minecraft.client.Minecraft var129 = field_43;
                  var162 = var129.field_42P.method_436$aae029aa0a();
               }

               if (((int) (var162 ? 1 : 0)) == 0) {
                  char var167 = (char)var14;
                  char var171 = (char)var15;
                  int var134 = this.field_438;
                  char var138 = var171;
                  char var142 = var167;
                  byte var146 = 2;
                  AutoRod_47C7 var150 = this;
                  int var154 = var13;
                  net.C_47i.method_43$95cbd1eb82(var154, var150, var146, var142, var138, var134);
               }

               return;
            }

            char var168 = (char)var14;
            char var172 = (char)var15;
            int var135 = this.field_438;
            char var139 = var172;
            char var143 = var168;
            byte var147 = 2;
            AutoRod_47C7 var151 = this;
            byte var155 = ((byte) (var162 ? 1 : 0));
            net.C_47i.method_43$95cbd1eb82(var155, var151, var147, var143, var139, var135);
            return;
         }

         label367: {
            label486: {
               var163.field_43a = var165;
               net.minecraft.client.Minecraft var95 = field_43;
               long var98 = var11;
               AutoRod_47C7 var101 = this;
               if (var95.field_42P.field_42X.field_42 != var101.method_45$95d88932bd(var98)) {
                  client.setting.BooleanSetting var105 = this.settingCombat;
                  if (!var105.method_49$aae029aa0a()) {
                     break label486;
                  }
               }

               client.setting.BooleanSetting var108 = this.settingCombat;
               if (!var108.method_49$aae029aa0a()) {
                  break label367;
               }

               long var111 = var11;
               AutoRod_47C7 var114 = this;
               if (this.field_438 == var114.method_45$95d88932bd(var111)) {
                  break label367;
               }
            }

            long var117 = var3;
            AutoRod_47C7 var120 = this;
            if (var120.method_45$0dd78e0064(var117)) {
               long var124 = var5;
               AutoRod_47C7 var128 = this;
               this.field_438 = var128.method_49$95d88932bd(var124);
               this.field_43a = false;
            }
         }

         this.field_437++;
         if (this.field_42v != null) {
            net.minecraft.client.Minecraft var132 = field_43;
            byte var164 = ((byte) (var132.field_42P.method_436$aae029aa0a() ? 1 : 0));
            char var169 = (char)var14;
            char var173 = (char)var15;
            int var136 = this.field_438;
            char var140 = var173;
            char var144 = var169;
            byte var148 = 2;
            AutoRod_47C7 var152 = this;
            byte var156 = var164;
            net.C_47i.method_43$95cbd1eb82(var156, var152, var148, var144, var140, var136);
         }
      } else {
         AutoRod_47C7 var157;
         label474: {
            long var40 = var3;
            AutoRod_47C7 var42 = this;
            byte var10000 = ((byte) (var42.method_45$0dd78e0064(var40) ? 1 : 0));
            long var46 = var11;
            AutoRod_47C7 var48 = this;
            if (var10000 == var48.method_45$95d88932bd(var46)) {
               net.minecraft.client.Minecraft var49 = field_43;
               long var50 = var11;
               AutoRod_47C7 var52 = this;
               if (var49.field_44K.field_40 == var52.method_45$95d88932bd(var50)) {
                  var157 = this;
                  break label474;
               }

               client.setting.BooleanSetting var57 = this.settingCombat;
               if (var57.method_49$aae029aa0a()) {
                  long var65 = var5;
                  AutoRod_47C7 var67 = this;
                  this.field_438 = var67.method_49$95d88932bd(var65);
                  this.field_43a = false;
               }
            } else {
               this.field_43a = false;
               net.minecraft.client.Minecraft var53 = field_43;
               if (var53.field_42P.field_42X.field_42 != 0) {
                  var157 = this;
                  break label474;
               }
            }

            this.field_437++;
            var157 = this;
         }

         if (var157.field_42v != null) {
            net.minecraft.client.Minecraft var68 = field_43;
            byte var158 = ((byte) (var68.field_42P.method_436$aae029aa0a() ? 1 : 0));
            if (var1 > 0L) {
               if (var158 == 0) {
                  char var166 = (char)var14;
                  char var170 = (char)var15;
                  int var133 = this.field_438;
                  char var137 = var170;
                  char var141 = var166;
                  byte var145 = 2;
                  AutoRod_47C7 var149 = this;
                  int var153 = var13;
                  net.C_47i.method_43$95cbd1eb82(var153, var149, var145, var141, var137, var133);
               }
            } else {
               char var10003 = (char)var14;
               char var10006 = (char)var15;
               int var69 = this.field_438;
               char var70 = var10006;
               char var71 = var10003;
               byte var72 = 2;
               AutoRod_47C7 var73 = this;
               byte var74 = var158;
               net.C_47i.method_43$95cbd1eb82(var74, var73, var72, var71, var70, var69);
            }
         }
      }
   }







   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$47(this, 28, var3, -7105218597611752836L, var1);
      recovery$indy$48(this, 7, var3, -7105218597611752836L, var1);
      recovery$indy$49(this, 40, var3, -7105218597611752836L, var1);
      recovery$indy$50(this, 21, var3, -7105218597611752836L, var1);
      recovery$indy$51(this, 32, var3, -7105218597611752836L, var1);
      recovery$indy$52(this, 34, var3, -7105218597611752836L, var1);
      recovery$indy$53(this, 17, var3, -7105218597611752836L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_42v = null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43p = 0;
      this.field_43a = false;
      this.field_43P = true;
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 99914337952680L;
      long var3 = var1 ^ 70637507500879L;
      long var5 = var1 ^ 140471324494347L;
      long var7 = var1 ^ 35475769234067L;
      long var10001 = var1 ^ 32482315179779L;
      int var9 = (int)((var1 ^ 32482315179779L) >>> 56);
      int var10 = (int)((var1 ^ 32482315179779L) << 8 >>> 32);
      int var11 = (int)(var10001 << 40 >>> 40);
      long var12 = var1 ^ 39702344730670L;
      long var14 = var1 ^ 27728837604057L;
      long var16 = var1 ^ 99915426686030L;
      long var18 = var1 ^ 92903300902559L;
      long var20 = var1 ^ 42064103052872L;
      int var22 = (int)((var1 ^ 69863035909608L) >>> 56);
      long var23 = (var1 ^ 69863035909608L) << 8 >>> 8;
      var10001 = var1 ^ 138410340241604L;
      int var25 = (int)((var1 ^ 138410340241604L) >>> 48);
      int var26 = (int)((var1 ^ 138410340241604L) << 16 >>> 32);
      int var27 = (int)(var10001 << 48 >>> 48);
      boolean var28 = AimBot_47O_.method_45i$aae029aa0a();
      net.minecraft.client.Minecraft var50 = field_43;
      boolean var10000 = var50.field_44r.field_44l.method_42$aae029aa0a();
      if (var28) {
         if (!var10000) {
            net.C_47cu var51 = this.field_47;
            var51.method_46$da8c82d5d4();
         }

         this.field_42v = null;
         long var52 = var3;
         AutoRod_47C7 var54 = this;
         if (var54.method_48$0dd78e0064(var52)) {
            long var55 = var5;
            augustus.recovered.modules.world.Scaffold_47Te var57 = client.ClientGlobals.field_48.field_46q;
            if (var57.method_46$0dd78e0064(var55)) {
               client.setting.BooleanSetting var58 = this.settingDisableWhileScaffold;
               if (var58.method_49$aae029aa0a()) {
                  return;
               }
            }

            net.minecraft.client.Minecraft var122 = field_43;
            Object[] var109 = var122.field_44Q
               .field_44Q
               .stream()
               .filter((java.util.function.Predicate)recovery$indy$flow$504(this))
               .sorted(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$506(this)))
               .toArray();
            if (var109.length > 0) {
               this.field_42v = (net.minecraft.entity.EntityLivingBase)var109[0];
               client.setting.BooleanSetting var60 = this.settingCombat;
               if (var60.method_49$aae029aa0a()) {
                  net.minecraft.client.Minecraft var123 = field_43;
                  if (var123.field_42P.method_40$ee256e8a75(this.field_42v) < 3.2) {
                     this.field_42v = null;
                  }
               }
            }

            if (this.field_42v != null) {
               net.minecraft.client.Minecraft var124 = field_43;
               double var110 = 180.0
                  - net.C_47hN.method_44$eb37070982(net.C_47sk.method_41$f6c4892e39(var124.field_42P.field_48h), net.C_47sk.method_41$f6c4892e39(this.field_42v.field_43m));
               long var125 = var12;
               client.setting.NumberSetting var126 = this.settingMaxTargetLookFovDiff;
               if (var110 > var126.method_44$474dfaa627(var125)) {
                  this.field_42v = null;
                  return;
               }

               double[] var111 = new double[]{this.field_42v.field_48Q, this.field_42v.field_48j, this.field_42v.field_42o};
               byte var168 = (byte)var9;
               int var127 = var11;
               byte var128 = 4;
               net.minecraft.entity.EntityLivingBase var129 = this.field_42v;
               int var130 = var10;
               byte var131 = var168;
               AutoRod_47C7 var132 = this;
               this.field_43p = var132.method_44$910884672c(var131, var130, var129, var128, var127) + 2;
               if (this.field_43p >= 0) {
                  int var72 = this.field_43p;
                  long var73 = var20;
                  net.minecraft.entity.EntityLivingBase var75 = this.field_42v;
                  var111 = net.C_48p.method_49$fcd53558df(var75, var73, var72);
               }

               this.field_48 = new net.C_47tf(var111[0], var111[1], var111[2]);
               double var161 = var111[0];
               net.minecraft.client.Minecraft var133 = field_43;
               double var112 = var161 - var133.field_42P.field_48Q;
               double var162 = var111[1] + this.field_42v.field_48 / 1.7;
               net.minecraft.client.Minecraft var134 = field_43;
               net.minecraft.client.Minecraft var135 = field_43;
               double var113 = var162 - (var134.field_42P.field_48j + var135.field_42P.method_41$bc607678b6());
               double var163 = var111[2];
               net.minecraft.client.Minecraft var136 = field_43;
               double var114 = var163 - var136.field_42P.field_42o;
               float var115 = (float)Math.toDegrees(Math.atan2(var114, var112)) - 90.0F;
               double var116 = net.C_47sk.method_42$44b37c2d95(var112 * var112 + var114 * var114);
               net.minecraft.client.Minecraft var137 = field_43;
               double var117 = var137.field_42P.method_44$ee256e8a75(this.field_42v);
               float var118 = (float)((float)(-(Math.atan2(var113, var116) * 180.0 / Math.PI)) - 0.55F * Math.max(0.0, var117 - 3.0));
               net.C_429 var164 = this.field_49;
               net.C_47S6 var138 = client.ClientGlobals.field_46;
               net.C_477r var139 = var138.method_44$4f8050086d();
               long var140 = var14;
               float var141 = var118;
               float var142 = var115;
               net.C_429 var143 = var164;
               net.C_477r var119 = var143.method_48$e39a948784(var142, var141, var140, var139);
               if (var117 > 4.0) {
                  for (int var120 = -20; var120 < 20; var120++) {
                     net.C_47Kr var121 = new net.C_47Kr();
                     net.minecraft.client.Minecraft var144 = field_43;
                     net.minecraft.client.Minecraft var145 = field_43;
                     long var146 = var16;
                     AutoRod_47C7 var147 = this;
                     recovery$indy$flow$604(
                        var121,
                        var18,
                        var144.field_42P,
                        var145.field_42P.field_429.method_46$4c10532da1(var147.method_45$95d88932bd(var146) + 36).method_48$ac4db64966(),
                        var119.field_44,
                        var119.field_41 + var120,
                        -4305022671153356397L,
                        var1
                     );
                     double var48 = this.field_42v.field_48w / 2.0F + 0.1F;
                     if (recovery$indy$flow$612(
                        var121,
                        100,
                        (byte)var22,
                        this.field_42v,
                        new net.C_478i(
                           var111[0] - var48, var111[1], var111[2] - var48, var111[0] + var48, var111[1] + this.field_42v.field_48 / 2.0F, var111[2] + var48
                        ),
                        var23,
                        -4302001525849673272L,
                        var1
                     )) {
                        net.C_47S6 var165 = client.ClientGlobals.field_46;
                        float var169 = var119.field_41 + var120;
                        net.C_47S6 var93 = client.ClientGlobals.field_46;
                        net.C_47S6 var94 = client.ClientGlobals.field_46;
                        net.C_477r var167 = net.C_47gg.method_45$5c9cee6350(
                           var119.field_44, var169, var7, var93.method_44$4f8050086d().field_44, var94.method_44$4f8050086d().field_41
                        );
                        char var170 = (char)var25;
                        AutoRod_47C7 var95 = this;
                        int var96 = var27;
                        int var97 = var26;
                        char var98 = var170;
                        byte var99 = 0;
                        net.C_477r var100 = var167;
                        net.C_47S6 var101 = var165;
                        var101.method_45$c163d5afc8(var100, var99, var98, var97, var96, var95);
                        return;
                     }
                  }
               }

               char var171 = (char)var25;
               AutoRod_47C7 var148 = this;
               int var149 = var27;
               int var150 = var26;
               char var151 = var171;
               byte var152 = 0;
               net.C_477r var153 = var119;
               net.C_47S6 var154 = client.ClientGlobals.field_46;
               var154.method_45$c163d5afc8(var153, var152, var151, var150, var149, var148);
            }
         }
      } else {
         if (!var10000) {
            net.minecraft.client.Minecraft var59 = field_43;
            Object[] var29 = var59.field_44Q
               .field_44Q
               .stream()
               .filter((java.util.function.Predicate)recovery$indy$flow$504(this))
               .sorted(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$506(this)))
               .toArray();
            net.minecraft.entity.EntityLivingBase var155;
            if (var29.length != 0) {
               net.minecraft.client.Minecraft var61 = field_43;
               var155 = var61.field_42P;
            } else {
               var155 = this.field_42v;
            }

            if (var155 != null) {
               net.minecraft.client.Minecraft var62 = field_43;
               double var30 = 180.0
                  - net.C_47hN.method_44$eb37070982(net.C_47sk.method_41$f6c4892e39(var62.field_42P.field_48h), net.C_47sk.method_41$f6c4892e39(this.field_42v.field_43m));
               long var63 = var12;
               client.setting.NumberSetting var65 = this.settingMaxTargetLookFovDiff;
               double var172;
               double[] var156 = new double[(var172 = var30 - var65.method_44$474dfaa627(var63)) == 0.0 ? 0 : (var172 < 0.0 ? -1 : 1)];
               var156[0] = this.field_42v.field_48Q;
               var156[1] = this.field_42v.field_48j;
               var156[2] = this.field_42v.field_42o;
               double[] var32 = var156;
               byte var10002 = (byte)var9;
               int var66 = var11;
               byte var67 = 4;
               net.minecraft.entity.EntityLivingBase var68 = this.field_42v;
               int var69 = var10;
               byte var70 = var10002;
               AutoRod_47C7 var71 = this;
               this.field_43p = var71.method_44$910884672c(var70, var69, var68, var67, var66) + 2;
               this.field_48 = new net.C_47tf(var32[0], var32[1], var32[2]);
               double var157 = var32[0];
               net.minecraft.client.Minecraft var76 = field_43;
               double var33 = var157 - var76.field_42P.field_48Q;
               double var158 = var32[1] + this.field_42v.field_48 / 1.7;
               net.minecraft.client.Minecraft var77 = field_43;
               net.minecraft.client.Minecraft var78 = field_43;
               double var35 = var158 - (var77.field_42P.field_48j + var78.field_42P.method_41$bc607678b6());
               double var159 = var32[2];
               net.minecraft.client.Minecraft var79 = field_43;
               double var37 = var159 - var79.field_42P.field_42o;
               float var39 = (float)Math.toDegrees(Math.atan2(var37, var33)) - 90.0F;
               double var40 = net.C_47sk.method_42$44b37c2d95(var33 * var33 + var37 * var37);
               net.minecraft.client.Minecraft var80 = field_43;
               double var42 = var80.field_42P.method_44$ee256e8a75(this.field_42v);
               float var44 = (float)((float)(-(Math.atan2(var35, var40) * 180.0 / Math.PI)) - 0.55F * Math.max(0.0, var42 - 3.0));
               net.C_429 var160 = this.field_49;
               net.C_47S6 var81 = client.ClientGlobals.field_46;
               net.C_477r var82 = var81.method_44$4f8050086d();
               long var83 = var14;
               float var85 = var44;
               float var86 = var39;
               net.C_429 var87 = var160;
               net.C_477r var45 = var87.method_48$e39a948784(var86, var85, var83, var82);
               double var173;
               int var46 = (var173 = var42 - 4.0) == 0.0 ? 0 : (var173 < 0.0 ? -1 : 1);
               if (var46 < 20) {
                  net.C_47Kr var47 = new net.C_47Kr();
                  net.minecraft.client.Minecraft var88 = field_43;
                  net.minecraft.client.Minecraft var89 = field_43;
                  long var90 = var16;
                  AutoRod_47C7 var92 = this;
                  recovery$indy$flow$604(
                     var47,
                     var18,
                     var88.field_42P,
                     var89.field_42P.field_429.method_46$4c10532da1(var92.method_45$95d88932bd(var90) + 36).method_48$ac4db64966(),
                     var45.field_44,
                     var45.field_41 + var46,
                     -4305022671153356397L,
                     var1
                  );
               } else {
                  char var10003 = (char)var25;
                  AutoRod_47C7 var102 = this;
                  int var103 = var27;
                  int var104 = var26;
                  char var105 = var10003;
                  byte var106 = 0;
                  net.C_477r var107 = var45;
                  net.C_47S6 var108 = client.ClientGlobals.field_46;
                  var108.method_45$c163d5afc8(var107, var106, var105, var104, var103, var102);
               }
            }
         }
      }
   }









    public AutoRod_47C7(long a0) {
        super((java.lang.String) ("AutoRod"),(java.lang.String) ("AutomatischeAngel"),(long) (((augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0) ^ 94173362533654L)),(java.awt.Color) (new java.awt.Color((int) (203),(int) (232),(int) (162))),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0) ^ 110344832923872L);
        long constructorKey4 = ((augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0) ^ 49836362562608L);
        long constructorKey5 = ((augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0) ^ 90424357335175L);
        long constructorKey6 = ((augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0) ^ 90815791486924L);
        long constructorKey7 = ((augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0) ^ 86285517511087L);
        long constructorKey8 = ((augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0) ^ 53698486979947L);
        long constructorKey9 = ((augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0) ^ 54092870544098L);
        long constructorKey10 = ((augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0) ^ 40144832096525L);
        long constructorKey11 = ((augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0) ^ 10835148199562L);
        long constructorKey12 = ((augustus.recovered.modules.legit.AutoRod_47C7.a ^ a0) ^ 70448836651304L);
        client.setting.SettingGroup initialized13 = new client.setting.SettingGroup(this, "Rotations", true, constructorKey5);
        recovery$indy$flow$636(this, initialized13);
        client.setting.NumberSetting initialized14 = new client.setting.NumberSetting(this, "MaxTargetLookFovDiff", Double.longBitsToDouble(4640537203540230144L), constructorKey11, Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$639(this, initialized14);
        client.setting.NumberSetting initialized15 = new client.setting.NumberSetting(this, "Fov", Double.longBitsToDouble(4636033603912859648L), constructorKey11, 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$642(this, initialized15);
        client.setting.NumberSetting initialized16 = new client.setting.NumberSetting(this, "MaxRodRange", Double.longBitsToDouble(4621819117588971520L), constructorKey11, 0.0D, Double.longBitsToDouble(4626322717216342016L), 2);
        recovery$indy$flow$645(this, initialized16);
        client.setting.BooleanSetting initialized17 = new client.setting.BooleanSetting(this, constructorKey10, "MoveFix", true);
        recovery$indy$flow$648(this, initialized17);
        java.lang.Object initialValue18 = recovery$indy$flow$650();
        client.setting.MultiSelectSetting initialized19 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey3, (net.C_47OZ[]) (initialValue18));
        recovery$indy$flow$652(this, initialized19);
        client.setting.BooleanSetting initialized20 = new client.setting.BooleanSetting(this, constructorKey10, "IgnoreEatingTargets", true);
        recovery$indy$flow$655(this, initialized20);
        client.setting.BooleanSetting initialized21 = new client.setting.BooleanSetting(this, constructorKey10, "Combat", true);
        recovery$indy$flow$658(this, initialized21);
        client.setting.BooleanSetting initialized22 = new client.setting.BooleanSetting(this, constructorKey10, "Click", true);
        recovery$indy$flow$661(this, initialized22);
        client.setting.BooleanSetting initialized23 = new client.setting.BooleanSetting(this, constructorKey10, "DisableWhileScaffold", true);
        recovery$indy$flow$664(this, initialized23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey10, "OnlyWhileKillAuraHasTarget", false);
        recovery$indy$flow$667(this, initialized24);
        client.setting.BooleanSetting initialized25 = new client.setting.BooleanSetting(this, constructorKey10, "ESP", true);
        recovery$indy$flow$670(this, initialized25);
        java.lang.Object initialValue26 = recovery$indy$flow$672();
        client.setting.ColorSetting initialized27 = new client.setting.ColorSetting(constructorKey12, this, "ESPColor", (java.awt.Color) (initialValue26));
        java.lang.Object initialValue28 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoRod_47C7) (((java.lang.Object)(this)))).settingESP));
        java.lang.Object initialValue29 = recovery$indy$flow$675(initialValue28);
        java.lang.Object initialValue30 = recovery$indy$flow$676(initialValue28);
        java.lang.Object initialValue31 = initialValue30;
        long initialValue32 = constructorKey4;
        client.setting.ColorSetting initialValue33 = initialized27;
        java.lang.Object initialValue34 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue33))))));
        java.lang.Object initialValue35 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue36 = recovery$indy$flow$679(initialValue34, initialValue32, initialValue35);
        java.lang.Object initialValue37 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue36))))));
        recovery$indy$flow$681(this, initialValue37);
        client.setting.ShaderOptions initialized38 = new client.setting.ShaderOptions(this, constructorKey7);
        long initialValue39 = constructorKey8;
        client.setting.ShaderOptions initialValue40 = initialized38;
        java.lang.Object initialValue41 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue42 = recovery$indy$flow$685(initialValue41, initialValue39);
        java.lang.Object initialValue43 = recovery$indy$flow$686();
        java.lang.Object initialValue44 = initialValue43;
        long initialValue45 = constructorKey9;
        java.lang.Object initialValue46 = initialValue42;
        java.lang.Object initialValue47 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue46))))));
        java.lang.Object initialValue48 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue44))))));
        java.lang.Object initialValue49 = recovery$indy$flow$689(initialValue47, initialValue45, initialValue48);
        recovery$indy$flow$690(this, initialValue49);
        net.C_47cu initialized50 = new net.C_47cu();
        recovery$indy$flow$693(this, initialized50);
        recovery$indy$flow$694(this, 0);
        recovery$indy$flow$695(this, -1);
        recovery$indy$flow$696(this, null);
        recovery$indy$flow$697(this, null);
        recovery$indy$flow$698(this, 0);
        recovery$indy$flow$699(this, false);
        recovery$indy$flow$700(this, false);
        recovery$indy$flow$701(this, -1);
        java.lang.Object initialValue51 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoRod_47C7) (((java.lang.Object)(this)))).settingRotations));
        net.C_429 initialized52 = new net.C_429(this, (client.setting.SettingGroup) (initialValue51), constructorKey6);
        recovery$indy$flow$705(this, initialized52);
    }





    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native boolean recovery$indy$flow$53(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$56(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$62(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$65(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$69(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$72(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$74(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$79(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$82(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$85(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$91(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$97(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$99(float a0,float a1,float a2,long a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$101(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$103(float a0,float a1,float a2,long a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$107(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$109(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$111(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$114(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,float a4,float a5,long a6,long a7);
    private static native int recovery$indy$flow$119(java.lang.Object a0,int a1,long a2,java.lang.Object a3,java.lang.Object a4,long a5,long a6);
    private static native boolean recovery$indy$flow$191(java.lang.Object a0,boolean a1,boolean a2,boolean a3,boolean a4,boolean a5,boolean a6,boolean a7,boolean a8,long a9,boolean a10,boolean a11,boolean a12,long a13,long a14);
    private static native java.lang.Object recovery$indy$flow$504(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$506(java.lang.Object a0);
    private static native void recovery$indy$flow$604(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,float a4,float a5,long a6,long a7);
    private static native boolean recovery$indy$flow$612(java.lang.Object a0,int a1,byte a2,java.lang.Object a3,java.lang.Object a4,long a5,long a6,long a7);
    private static native void recovery$indy$flow$636(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$639(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$642(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$645(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$648(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$650();
    private static native void recovery$indy$flow$652(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$655(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$658(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$661(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$664(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$667(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$670(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$672() {
        return java.awt.Color.GREEN;
    }

    private static java.lang.Object recovery$indy$flow$675(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$676(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$679(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$681(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$685(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$686() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$689(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$690(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$693(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$694(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoRod_47C7) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$695(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoRod_47C7) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$696(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoRod_47C7) (a0)).field_42v = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$697(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoRod_47C7) (a0)).field_48 = ((net.C_47tf) (a1));
        return;
    }
    private static void recovery$indy$flow$698(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoRod_47C7) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$699(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoRod_47C7) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$700(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoRod_47C7) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$701(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoRod_47C7) (a0)).field_43y = a1;
        return;
    }

    private static native void recovery$indy$flow$705(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$21(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$22(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$24(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$25(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$26(Object var0, long var1, long var3);
   private static native C_455 recovery$indy$27(Object var0, long var1, long var3);
   private static native C_47Bm recovery$indy$29(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$30(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);
   private static native boolean recovery$indy$33(long var0, long var2);
   private static native boolean recovery$indy$34(Object var0, long var1, long var3);
   private static native boolean recovery$indy$35(Object var0, char var1, int var2, Object var3, char var4, long var5, long var7);
   private static native void recovery$indy$36(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$37(long var0, long var2);
   private static native boolean recovery$indy$38(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$39(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$40(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$41(Object var0, long var1, long var3);
   private static native boolean recovery$indy$42(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$43(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$44(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$45(AutoRod_47C7 var0, float var1, float var2, float var3, float var4);
   private static native void recovery$indy$46(boolean var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$47(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$48(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$49(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$50(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$51(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$52(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$53(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$59();
}
