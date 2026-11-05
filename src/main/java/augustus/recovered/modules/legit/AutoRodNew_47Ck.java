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
import net.C_42o;
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
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoRodNew_47Ck extends client.module.Module implements net.C_47oO,net.C_47U0,net.C_47UH,net.C_47xz,net.C_47hi,client.event.RenderListener,net.C_48T {
    private final client.setting.SettingGroup settingRotations = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaxTargetLookFovDiff = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingFov = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMaxRodRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingMoveFix = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingIgnoreEatingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCombat = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyRodIfNotInReach = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingLuckyThrow = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDisableWhileScaffold = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyWhileKillAuraHasTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingESP = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingESPColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions field_40c = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_409 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_40D; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_429 field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_478i field_40M; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private boolean method_46$7c2c45e4ce(net.minecraft.entity.Entity entity) {
        long l;
        long l2 = l = a ^ 0x40534E3DB080L;
        long l3 = l2 ^ 0x5B2AD6E13EFCL;
        long l4 = l2 ^ 0x607C82D2619BL;
        boolean bl = augustus.recovered.modules.legit.AimBot_47O_.method_45g$aae029aa0a();
        net.minecraft.entity.Entity entity2 = entity;
        AutoRodNew_47Ck autoRodNew_47Ck = this;
        long l5 = l3;
        client.setting.NumberSetting numberSetting = this.settingFov;
        double d = autoRodNew_47Ck.method_48$83ff7736af(entity2) - numberSetting.method_44$474dfaa627(l5);
        double d2 = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
        if (bl) return (boolean)((((int) (d2)) & 1) != 0);
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
        net.C_42o c_42o = net.C_42o.PLAYER;
        net.C_42o c_42o2 = net.C_42o.MOB;
        net.C_42o c_42o3 = net.C_42o.ANIMAL;
        net.C_42o c_42o4 = net.C_42o.VILLAGER;
        net.C_42o c_42o5 = net.C_42o.INVISIBLE;
        net.C_42o c_42o6 = net.C_42o.DEAD;
        if (!AutoRodNew_47Ck.recovery$indy$flow$44(entity, c_42o.method_43$aae029aa0a(), c_42o2.method_43$aae029aa0a(), c_42o3.method_43$aae029aa0a(), c_42o4.method_43$aae029aa0a(), false, c_42o5.method_43$aae029aa0a(), true, true, l4, true, c_42o6.method_43$aae029aa0a(), true, 8259530487327397224L, l)) return false;
        if (!entity.method_48V$aae029aa0a()) return true;
        client.setting.BooleanSetting booleanSetting = this.settingIgnoreEatingTargets;
        if (!booleanSetting.method_49$aae029aa0a()) return true;
        return false;
    }





    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

   public void method_42$0db73fbf69(long var1, C_47VO var3) {
      long var10001 = var1 ^ 37614490548695L;
      int var4 = (int)((var1 ^ 37614490548695L) >>> 48);
      int var5 = (int)((var1 ^ 37614490548695L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var10000 = -6217820885929774309L;
      boolean var7 = AimBot_47O_.method_45i$aae029aa0a();
      AutoRodNew_47Ck var17 = this;
      if (var7) {
         if (this.field_40D == null) {
            return;
         }

         var17 = this;
      }

      var10001 = -6218661497925531230L;
      BooleanSetting var8 = var17.settingMoveFix;
      boolean var19 = var8.method_49$aae029aa0a();
      if (var7) {
         if (var19) {
            return;
         }

         char var21 = (char)var4;
         char var10004 = (char)var6;
         long var10005 = -6215325279544933799L;
         char var9 = var10004;
         AutoRodNew_47Ck var10 = this;
         int var11 = var5;
         char var12 = var21;
         C_47S6 var13 = ClientGlobals.field_46;
         var19 = var13.method_49$dc3f815dad(var12, var11, var10, var9);
      }

      if (var19) {
         var10001 = -6217695461009398564L;
         Client var23 = Client.method_44$fbc0c0be91();
         long var10002 = -6215544336685916177L;
         Client var14 = var23;
         var10002 = -6218345499652737371L;
         float var15 = var14.method_45$03ec613b6f().field_43;
         C_47VO var16 = var3;
         var16.method_49$24a796ab4c(var15);
      }
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$fae8de1664(C_475c var1) {
      augustus.recovered.modules.legit.AutoRodNew_47Ck var37;
      boolean var39;
      augustus.recovered.modules.legit.AutoRodNew_47Ck var40;
      long var2 = a ^ 56114947580546L;
      long var4 = var2 ^ 78855331927091L;
      long var10001 = var2 ^ 18887205966989L;
      int var6 = (int)((var2 ^ 18887205966989L) >>> 32);
      int var7 = (int)((var2 ^ 18887205966989L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 33156999416816L;
      int var11 = (int)((var2 ^ 51958389445645L) >>> 48);
      long var12 = (var2 ^ 51958389445645L) << 16 >>> 16;
      long var10000 = -6872947392686726433L;
      boolean var14 = AimBot_47O_.method_45g$aae029aa0a();
      short var10003 = (short)var7;
      short var10004 = (short)var8;
      long var10005 = -6876881129089566476L;
      short var16 = var10004;
      short var17 = var10003;
      int var18 = var6;
      AutoRodNew_47Ck var19 = this;
      this.field_42 = var19.method_45$fe802877bf(var18, var17, var16);
      AutoRodNew_47Ck var35 = this;
      if (!var14) {
         if (this.field_40D == null) {
            return;
         }

         var35 = this;
      }

      short var41 = (short)var11;
      long var47 = -6872747055166446455L;
      long var20 = var12;
      short var22 = var41;
      AutoRodNew_47Ck var23 = var35;
      C_47Bm var15 = var23.method_48$696c0aa931(var22, var20);
      if (var15 == null) {
         label109: {
            int var36 = (int) ((this.field_43a) ? 1 : 0);
            if (!var14) {
               if (this.field_43a) {
                  return;
               }

               var37 = this;
               if (var14) {
                  break label109;
               }

               var36 = this.field_40D.field_432;
            }

            if (var36 >= this.field_43p) {
               return;
            }

            var37 = this;
         }

         if (!var14) {
            if (var37.field_40M == null) {
               return;
            }

            var37 = this;
         }

         label111: {
            var10001 = -6876838945530707840L;
            BooleanSetting var24 = var37.settingCombat;
            var39 = var24.method_49$aae029aa0a();
            label82:
            if (!var14) {
               if (var39) {
                  var10001 = -6876838945530707840L;
                  BooleanSetting var25 = this.settingOnlyRodIfNotInReach;
                  var39 = var25.method_49$aae029aa0a();
                  if (var14) {
                     break label82;
                  }

                  if (var39) {
                     long var10002 = -6874517236508571547L;
                     long var26 = var4;
                     AutoRodNew_47Ck var28 = this;
                     var39 = var28.method_48$0dd78e0064(var26);
                     if (var14) {
                        break label82;
                     }

                     if (!var39) {
                        return;
                     }
                  }
               }

               var40 = this;
               if (var14) {
                  break label111;
               }

               var10001 = -6876838945530707840L;
               BooleanSetting var29 = this.settingLuckyThrow;
               var39 = var29.method_49$aae029aa0a();
            }

            if (!var39) {
               var40 = this;
               if (var14) {
                  break label111;
               }

               long var45 = -6874214293079190349L;
               long var30 = var9;
               AutoRodNew_47Ck var32 = this;
               if (!var32.method_48P$0dd78e0064(var30)) {
                  return;
               }
            }

            long var46 = -6876190966087940054L;
            byte var33 = 1;
            C_475c var34 = var1;
            var34.method_48$d00df7729d(var33);
            this.field_438 = 0;
            this.field_43a = true;
            var40 = this;
         }

         var40.field_43P = true;
      }
   }





   private void method_41$2e27eb1fa5(float var1, float var2, float var3, float var4, RenderPass var5) {
      long var6 = a ^ 32877615586416L;
      long var8 = var6 ^ 59347714732561L;
      long var10001 = var6 ^ 108118118853860L;
      int var10 = (int)((var6 ^ 108118118853860L) >>> 32);
      int var11 = (int)((var6 ^ 108118118853860L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      ShaderOptions var10000 = this.field_40c;
      short var10004 = (short)var11;
      char var10005 = (char)var12;
      long var10007 = -2419321496010490356L;
      byte var13 = 0;
      char var14 = var10005;
      short var15 = var10004;
      int var16 = var10;
      ColorSetting var17 = this.settingESPColor;
      int var10003 = var17.method_47$24af287d8f(var16, var15, var14, var13);
      long var23 = -2422431055342356998L;
      int var18 = var10003;
      long var19 = var8;
      RenderPass var21 = var5;
      ShaderOptions var22 = var10000;
      RenderUtils.method_43$d00df7729d(var22.method_40$d68b376f5b(var21, var19, var18));
      RenderUtils.method_44$cc82067b44(var1 - var2, var3, var4 - var2, var1 + var2, var3 + this.field_40D.field_48, var4 + var2);
   }



   public void method_41$0db73fbf69(long var1, C_47VO var3) {
      long var10001 = var1 ^ 17588450945529L;
      int var4 = (int)((var1 ^ 17588450945529L) >>> 48);
      int var5 = (int)((var1 ^ 17588450945529L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var10000 = -5072195487400942795L;
      boolean var7 = AimBot_47O_.method_45i$aae029aa0a();
      AutoRodNew_47Ck var17 = this;
      if (var7) {
         if (this.field_40D == null) {
            return;
         }

         var17 = this;
      }

      var10001 = -5071953018299737716L;
      BooleanSetting var8 = var17.settingMoveFix;
      boolean var19 = var8.method_49$aae029aa0a();
      if (var7) {
         if (var19) {
            return;
         }

         char var21 = (char)var4;
         char var10004 = (char)var6;
         long var10005 = -5075390357408181641L;
         char var9 = var10004;
         AutoRodNew_47Ck var10 = this;
         int var11 = var5;
         char var12 = var21;
         C_47S6 var13 = ClientGlobals.field_46;
         var19 = var13.method_49$dc3f815dad(var12, var11, var10, var9);
      }

      if (var19) {
         var10001 = -5073195986109598478L;
         Client var23 = Client.method_44$fbc0c0be91();
         long var10002 = -5074467638598234175L;
         Client var14 = var23;
         var10002 = -5071666174433253749L;
         float var15 = var14.method_45$03ec613b6f().field_43;
         C_47VO var16 = var3;
         var16.method_49$24a796ab4c(var15);
      }
   }



   public EntityLivingBase method_40$20b8cce974() {
      return this.field_40D;
   }



    private boolean method_48$0dd78e0064(long l) {
        int n;
        block5: {
            long l2 = l = a ^ l;
            long l3 = l2 ^ 0x7090BD9F7A78L;
            long l4 = l2 ^ 0x274868676EFDL;
            long l5 = l2 ^ 0x6345B3A5AD11L;
            long l6 = l2 ^ 0x57411CEB6B17L;
            ArrayList arrayList = AutoRodNew_47Ck.recovery$indy$6(l5, AutoRodNew_47Ck.recovery$indy$2(field_43, 3940063656770075139L, l), AutoRodNew_47Ck.recovery$indy$3((Object)AutoRodNew_47Ck.field_43, (long)3940063656770075139L, (long)l).field_48y, AutoRodNew_47Ck.recovery$indy$4((Object)AutoRodNew_47Ck.field_43, (long)3940063656770075139L, (long)l).field_48y, 0, AutoRodNew_47Ck.recovery$indy$5((Object)AutoRodNew_47Ck.field_43, (long)3940063656770075139L, (long)l).field_48y + this.field_43p, 3937845394161922918L, l);
            ArrayList arrayList2 = AutoRodNew_47Ck.recovery$indy$10(l3, AutoRodNew_47Ck.recovery$indy$7(field_43, 3940063656770075139L, l), this.field_40D, AutoRodNew_47Ck.recovery$indy$8((Object)AutoRodNew_47Ck.field_43, (long)3940063656770075139L, (long)l).field_48y, AutoRodNew_47Ck.recovery$indy$9((Object)AutoRodNew_47Ck.field_43, (long)3940063656770075139L, (long)l).field_48y + this.field_43p, 3944624967263825549L, l);
            int n2 = Math.max(arrayList.size(), arrayList2.size());
            double d = AutoRodNew_47Ck.recovery$indy$12(field_43, 3940063656770075139L, l).method_41$bc607678b6();
            boolean bl = AutoRodNew_47Ck.recovery$indy$11(3939267427664098538L, l);
            int n3 = 0;
            while (n3 < n2) {
                C_47tf c_47tf = AutoRodNew_47Ck.recovery$indy$13(arrayList, l4, n3, 3939761007140837714L, l).method_47$a365857470(0.0, d, 0.0);
                C_47tf c_47tf2 = AutoRodNew_47Ck.recovery$indy$14(arrayList2, l4, n3, 3939761007140837714L, l);
                C_478i c_478i = AutoRodNew_47Ck.recovery$indy$15(c_47tf2, l6, true, 3937271158004363448L, l);
                boolean bl2 = bl;
                if (l > 0L) {
                    if (!bl2) {
                        double d2 = AutoRodNew_47Ck.recovery$indy$16(c_47tf, c_478i, 3937964898500118188L, l).method_43$3d77d36e13(c_47tf) - 3.0;
                        n = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                        if (bl) break block5;
                        if (n <= 0) {
                            return false;
                        }
                        ++n3;
                    }
                    bl2 = bl;
                }
                if (!bl2) continue;
            }
            n = 1;
        }
        return n != 0;
    }




    private C_47Bm method_48$696c0aa931(short s, long l) {
        Minecraft c_47nT;
        boolean bl;
        long l2;
        block11: {
            block12: {
                C_47Bm c_47Bm;
                block13: {
                    l2 = ((long)s << 48 | l << 16 >>> 16) ^ a;
                    bl = AutoRodNew_47Ck.recovery$indy$17(-676473370413700046L, l2);
                    c_47nT = field_43;
                    if (!bl) break block11;
                    if (AutoRodNew_47Ck.recovery$indy$18(c_47nT, -679054037770814915L, l2) == null) break block12;
                    c_47nT = field_43;
                    if (!bl) break block11;
                    c_47Bm = AutoRodNew_47Ck.recovery$indy$19((Object)c_47nT, (long)-679054037770814915L, (long)l2).field_42w;
                    if (l < 0L) break block13;
                    if (c_47Bm == null) break block12;
                    c_47Bm = AutoRodNew_47Ck.recovery$indy$20((Object)AutoRodNew_47Ck.field_43, (long)-679054037770814915L, (long)l2).field_42w;
                }
                return c_47Bm;
            }
            c_47nT = field_43;
        }
        WorldClient c_47hb = AutoRodNew_47Ck.recovery$indy$21(c_47nT, -676136205094055833L, l2);
        if (bl) {
            if (c_47hb == null) {
                return null;
            }
            c_47hb = AutoRodNew_47Ck.recovery$indy$22(field_43, -676136205094055833L, l2);
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
                            if (bl) {
                                if (!(c_47MQ2 instanceof C_47Bm)) continue block0;
                                c_47MQ2 = c_47MQ;
                            }
                            c_47Bm = c_47Bm2 = (C_47Bm)c_47MQ2;
                            if (!bl) break block14;
                            bl2 = c_47Bm.field_43.method_41$0e30dfc966().equals(AutoRodNew_47Ck.recovery$indy$23(field_43, -676914095976743123L, l2).method_47$0e30dfc966());
                            if (s < 0) break block15;
                            if (!bl2) break block16;
                            c_47Bm = c_47Bm2;
                        }
                        return c_47Bm;
                    }
                    bl2 = bl;
                }
                if (l < 0L) continue;
                if (!bl2) break block0;
                continue block0;
            }
            break;
        }
        return null;
    }



   private double method_48$83ff7736af(Entity var1) {
      long var2 = a ^ 37273345840359L;
      long var4 = var2 ^ 101368465986602L;
      long var10000 = 1653561089901268060L;
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
      long var10004 = 1653158880209165211L;
      Client var12 = Client.method_44$fbc0c0be91();
      long var10005 = 1655792555947368616L;
      Client var8 = var12;
      float var13 = var8.method_45$03ec613b6f().field_43;
      var10005 = 1653158880209165211L;
      Client var15 = Client.method_44$fbc0c0be91();
      long var10006 = 1655792555947368616L;
      Client var9 = var15;
      var10006 = 1655565230180381281L;
      float var7 = C_47gg.method_42$edd155e764(var11, var10001, var4, var10003, var13, var9.method_45$03ec613b6f().field_48)[0];
      return Math.abs(var7);
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_40D = null;
   }



   private int method_49$95d88932bd(long var1) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 80070000481399L;
      int var3 = (int)((var1 ^ 80070000481399L) >>> 32);
      int var4 = (int)((var1 ^ 80070000481399L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 109851320029789L;
      var10001 = var1 ^ 496043561732L;
      int var8 = (int)((var1 ^ 496043561732L) >>> 32);
      int var9 = (int)((var1 ^ 496043561732L) << 32 >>> 40);
      int var10 = (int)(var10001 << 56 >>> 56);
      long var10000 = -2277630374200106459L;
      byte var11 = (byte) ((AimBot_47O_.method_45g$aae029aa0a()) ? 1 : 0);
      int var30 = (int) ((this.field_43P) ? 1 : 0);
      if (var11 == 0) {
         if (!this.field_43P) {
            return this.field_43y;
         }

         this.field_43P = false;
         this.field_43y = -1;
         short var10002 = (short)var4;
         short var10003 = (short)var5;
         long var10004 = -2275952839956416498L;
         short var14 = var10003;
         short var15 = var10002;
         int var16 = var3;
         AutoRodNew_47Ck var17 = this;
         var30 = var17.method_45$fe802877bf(var16, var15, var14);
      }

      int var12;
      label81: {
         var12 = var30;
         byte var31 = var11;
         if (var1 >= 0L) {
            if (var11 == 0) {
               if (C_47i.field_40 == var12) {
                  break label81;
               }

               this.field_43y = C_47i.field_40;
            }

            var31 = var11;
         }

         if (var1 < 0L) {
            return var31;
         }

         if (var31 == 0) {
            return this.field_43y;
         }
      }

      var10001 = -2278039785598473012L;
      Minecraft var18 = field_43;
      byte var35 = (byte)var10;
      long var10005 = -2277062441824578168L;
      byte var19 = 36;
      byte var20 = var35;
      int var21 = var9;
      int var22 = var8;
      C_47gG var23 = var18.field_42P.field_429;
      ArrayList var13 = C_47KL.method_48$fabe8d61eb(var23, var22, var21, var20, var19);
      byte var32 = (byte) ((var13.isEmpty()) ? 1 : 0);
      if (var1 >= 0L) {
         if (var11 == 0) {
            if (var32 == 0) {
               this.field_43y = (Integer)var13.get(0);
               if (var1 <= 0L) {
                  return var11;
               }

               if (var11 == 0) {
                  return this.field_43y;
               }
            }
         } else if (var32 != var12) {
            return this.field_43y;
         }
      } else if (var32 != var11) {
         return this.field_43y;
      }

      do {
         var10005 = -2277600969997424296L;
         long var24 = var6;
         byte var26 = 8;
         byte var27 = 0;
         C_47MO var28 = C_476q.field_48;
         this.field_43y = var28.method_44$75dd719903(var27, var26, var24);
      } while (this.field_43y == var12);

      return this.field_43y;
   }




   public boolean method_45$0dd78e0064(long var1) {
        boolean var77;
        int var79;
        boolean var80;
        int var81;
        int var83;
        int var84;
        int var85;
      var1 = a ^ var1;
      long var3 = var1 ^ 55615852701428L;
      long var10001 = var1 ^ 88036663467170L;
      int var5 = (int)((var1 ^ 88036663467170L) >>> 32);
      int var6 = (int)((var1 ^ 88036663467170L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 95963647995741L;
      byte var10 = ((byte) (AimBot_47O_.method_45g$aae029aa0a() ? 1 : 0));
      if (var10 == 0) {
         net.minecraft.client.Minecraft var11 = field_43;
         net.C_47rf var76 = var11.field_42P.method_48$ac4db64966();
         if (var1 > 0L) {
            label473: {
               label472:
               if (var76 != null) {
                  label470: {
                     net.minecraft.client.Minecraft var12 = field_43;
                     if (!(var12.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_43J)) {
                        net.minecraft.client.Minecraft var37 = field_43;
                        if (!(var37.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_45V)) {
                           net.minecraft.client.Minecraft var38 = field_43;
                           var80 = var38.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_43z;
                           if (var10 != 0) {
                              break label470;
                           }

                           if (!var80) {
                              net.minecraft.client.Minecraft var15 = field_43;
                              if (!(var15.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_43y)) {
                                 break label472;
                              }
                           }
                        }
                     }

                     net.minecraft.client.Minecraft var39 = field_43;
                     var80 = var39.field_44r.field_45w.method_42$aae029aa0a();
                  }

                  if (var10 != 0) {
                     break label473;
                  }

                  if (var80) {
                     return false;
                  }
               }

               net.minecraft.client.Minecraft var40 = field_43;
               var80 = var40.method_44$aae029aa0a();
            }

            if (var80) {
               label456: {
                  label615: {
                     net.minecraft.client.Minecraft var42 = field_43;
                     if (var42.field_42P.method_48$ac4db64966() != null) {
                        net.minecraft.client.Minecraft var43 = field_43;
                        if (var43.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_435) {
                           break label615;
                        }
                     }

                     client.setting.BooleanSetting var44 = this.settingCombat;
                     var81 = ((var44.method_49$aae029aa0a()) ? 1 : 0);
                     if (var10 != 0) {
                        break label456;
                     }

                     if (var81 == 0) {
                        return false;
                     }
                  }

                  var81 = this.field_42;
               }

               if (var81 != -1) {
                  short var88 = (short)var6;
                  short var47 = (short)var7;
                  short var50 = var88;
                  int var53 = var5;
                  AutoRodNew_47Ck var56 = this;
                  int var82 = var56.method_45$fe802877bf(var53, var50, var47);
                  if (var10 == 0) {
                     if (var82 == -1) {
                        return false;
                     }

                     net.minecraft.client.Minecraft var58 = field_43;
                     var82 = ((int) (var58.field_44r.field_45w.field_45 ? 1 : 0));
                  }

                  if (var10 == 0) {
                     if (var82 != 0) {
                        return false;
                     }

                     long var59 = var8;
                     long var60 = 100L;
                     net.C_47cu var61 = this.field_409;
                     var82 = ((int) (var61.method_42$b0e346e6e3(var60, var59) ? 1 : 0));
                  }

                  label443:
                  if (var10 == 0) {
                     if (var82 == 0) {
                        client.setting.BooleanSetting var65 = this.settingClick;
                        var82 = ((int) (var65.method_49$aae029aa0a() ? 1 : 0));
                        if (var10 != 0) {
                           break label443;
                        }

                        if (var82 != 0) {
                           return false;
                        }
                     }

                     client.setting.BooleanSetting var70 = this.settingOnlyWhileKillAuraHasTarget;
                     var82 = ((int) (var70.method_49$aae029aa0a() ? 1 : 0));
                  }

                  if (var10 != 0) {
                     return (((var82) & 1) != 0);
                  }

                  if (var82 != 0) {
                     long var72 = var3;
                     augustus.recovered.modules.combat.KillAura_47CY var74 = client.ClientGlobals.field_48.field_48Q;
                     if (!var74.method_46$0dd78e0064(var72) || client.ClientGlobals.field_48.field_48Q.field_45z == null) {
                        return false;
                     }
                  }

                  return true;
               }
            }

            return false;
         } else {
            label551: {
               if (!(var76.method_48$dbd570a038() instanceof C_43J)) {
                  net.minecraft.client.Minecraft var13 = field_43;
                  if (!(var13.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_45V)) {
                     net.minecraft.client.Minecraft var14 = field_43;
                     var77 = var14.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_43z;
                     var83 = var10;
                     break label551;
                  }
               }

               net.minecraft.client.Minecraft var16 = field_43;
               var77 = var16.field_44r.field_45w.method_42$aae029aa0a();
               var83 = var10;
            }

            if (var83 == 0) {
               if (var77) {
                  return false;
               }

               net.minecraft.client.Minecraft var17 = field_43;
               var77 = var17.method_44$aae029aa0a();
            }

            if (var77) {
               label659: {
                  label619: {
                     net.minecraft.client.Minecraft var41 = field_43;
                     if (var41.field_42P.method_48$ac4db64966() != null) {
                        net.minecraft.client.Minecraft var19 = field_43;
                        if (var19.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_435) {
                           if (this.field_42 == -1) {
                              return false;
                           }

                           short var87 = (short)var6;
                           short var46 = (short)var7;
                           short var49 = var87;
                           int var52 = var5;
                           AutoRodNew_47Ck var55 = this;
                           var79 = var55.method_45$fe802877bf(var52, var49, var46);
                           var84 = var10;
                           if (var1 < 0L) {
                              break label659;
                           }
                           break label619;
                        }
                     }

                     client.setting.BooleanSetting var20 = this.settingCombat;
                     int var78 = ((int) (var20.method_49$aae029aa0a() ? 1 : 0));
                     if (var1 < 0L) {
                        if (var78 == var10) {
                           return false;
                        }

                        short var86 = (short)var6;
                        short var45 = (short)var7;
                        short var48 = var86;
                        int var51 = var5;
                        AutoRodNew_47Ck var54 = this;
                        var79 = var54.method_45$fe802877bf(var51, var48, var45);
                        var84 = var10;
                        break label659;
                     }

                     if (var10 == 0) {
                        if (var78 == 0) {
                           return false;
                        }

                        var78 = this.field_42;
                     }

                     if (var78 == -1) {
                        return false;
                     }

                     short var10002 = (short)var6;
                     short var21 = (short)var7;
                     short var22 = var10002;
                     int var23 = var5;
                     AutoRodNew_47Ck var24 = this;
                     var79 = var24.method_45$fe802877bf(var23, var22, var21);
                     var84 = var10;
                  }

                  if (var84 == 0) {
                     if (var79 == -1) {
                        return false;
                     }

                     net.minecraft.client.Minecraft var57 = field_43;
                     var79 = ((var57.field_44r.field_45w.field_45) ? 1 : 0);
                  }

                  label526:
                  if (var10 == 0) {
                     if (var79 == 0) {
                        client.setting.BooleanSetting var63 = this.settingClick;
                        var79 = ((var63.method_49$aae029aa0a()) ? 1 : 0);
                        if (var10 != 0) {
                           break label526;
                        }

                        if (var79 != 0) {
                           return false;
                        }
                     }

                     client.setting.BooleanSetting var68 = this.settingOnlyWhileKillAuraHasTarget;
                     var79 = ((var68.method_49$aae029aa0a()) ? 1 : 0);
                  }

                  if (var10 != 0) {
                     return (((var79) & 1) != 0);
                  }

                  if (var79 != 0) {
                     long var33 = var3;
                     augustus.recovered.modules.combat.KillAura_47CY var35 = client.ClientGlobals.field_48.field_48Q;
                     if (!var35.method_46$0dd78e0064(var33) || client.ClientGlobals.field_48.field_48Q.field_45z == null) {
                        return false;
                     }
                  }

                  return true;
               }

               label502: {
                  if (var84 == 0) {
                     if (var79 == 0) {
                        client.setting.BooleanSetting var64 = this.settingClick;
                        var79 = ((var64.method_49$aae029aa0a()) ? 1 : 0);
                        var85 = var10;
                        break label502;
                     }

                     client.setting.BooleanSetting var69 = this.settingOnlyWhileKillAuraHasTarget;
                     var79 = ((var69.method_49$aae029aa0a()) ? 1 : 0);
                  }

                  var85 = var10;
               }

               if (var85 != 0) {
                  return (((var79) & 1) != 0);
               }

               if (var79 != 0) {
                  long var71 = var3;
                  augustus.recovered.modules.combat.KillAura_47CY var73 = client.ClientGlobals.field_48.field_48Q;
                  if (!var73.method_46$0dd78e0064(var71) || client.ClientGlobals.field_48.field_48Q.field_45z == null) {
                     return false;
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         net.minecraft.client.Minecraft var18 = field_43;
         if (((int) (var18.field_42P.method_48$ac4db64966().method_48$dbd570a038() instanceof C_435 ? 1 : 0)) == -1) {
            return false;
         }

         net.minecraft.client.Minecraft var25 = field_43;
         boolean var10000 = var25.field_44r.field_45w.field_45;
         if (var1 > 0L) {
            if (var10 == 0) {
               if (var25.field_44r.field_45w.field_45) {
                  return false;
               }

               long var26 = var8;
               long var28 = 100L;
               net.C_47cu var30 = this.field_409;
               var10000 = var30.method_42$b0e346e6e3(var28, var26);
            }

            if (var10 == 0) {
               if (!var10000) {
                  client.setting.BooleanSetting var62 = this.settingClick;
                  var10000 = var62.method_49$aae029aa0a();
                  if (var10 != 0) {
                     return var10 != 0 ? var10000 : !var10000 || client.ClientGlobals.field_48.field_48Q.field_45z != null;
                  }

                  if (var10000) {
                     return false;
                  }
               }

               client.setting.BooleanSetting var67 = this.settingOnlyWhileKillAuraHasTarget;
               var10000 = var67.method_49$aae029aa0a();
            }

            return var10 != 0 ? var10000 : !var10000 || client.ClientGlobals.field_48.field_48Q.field_45z != null;
         } else {
            if (var10 == 0) {
               if (!var25.field_44r.field_45w.field_45) {
                  client.setting.BooleanSetting var31 = this.settingClick;
                  var10000 = var31.method_49$aae029aa0a();
                  if (var1 >= 0L) {
                     if (var10 == 0) {
                        if (var10000) {
                           return false;
                        }

                        client.setting.BooleanSetting var66 = this.settingOnlyWhileKillAuraHasTarget;
                        var10000 = var66.method_49$aae029aa0a();
                     }

                     if (var10 != 0) {
                        return var10000;
                     }

                     if (!var10000 || client.ClientGlobals.field_48.field_48Q.field_45z != null) {
                        return true;
                     }

                     return false;
                  }

                  if (var10 == 0) {
                     var10000 = !var10000 || client.ClientGlobals.field_48.field_48Q.field_45z != null;
                  }

                  return var10000;
               }

               client.setting.BooleanSetting var32 = this.settingOnlyWhileKillAuraHasTarget;
               var10000 = var32.method_49$aae029aa0a();
            }

            if (var10 == 0) {
               var10000 = !var10000 || client.ClientGlobals.field_48.field_48Q.field_45z != null;
            }

            return var10000;
         }
      }
   }






   public int method_45$fe802877bf(int var1, short var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      boolean var6 = recovery$indy$24(-5324220810371421006L, var4);
      int var7 = 36;

      while (var7 < recovery$indy$25(field_43, -5326705442392671555L, var4).field_429.field_46.size()) {
         byte var10;
         label53: {
            C_47rf var8 = recovery$indy$26(field_43, -5326705442392671555L, var4).field_429.method_46$4c10532da1(var7).method_48$ac4db64966();
            label52:
            if (var6) {
               label62: {
                  C_47rf var10000 = var8;
                  if (var3 >= 0) {
                     if (var8 == null) {
                        break label62;
                     }

                     var10000 = var8;
                  }

                  C_43r var9 = var10000.method_48$dbd570a038();
                  var10 = (byte) ((var6) ? 1 : 0);
                  if (var3 < 0) {
                     break label53;
                  }

                  if (!var6) {
                     break label52;
                  }

                  var10 = (byte) ((var9 instanceof C_435) ? 1 : 0);
                  if (var3 < 0) {
                     return var10;
                  }

                  if (var10 != 0) {
                     return var7 - 36;
                  }
               }

               var7++;
            }

            var10 = (byte) ((var6) ? 1 : 0);
         }

         if (!(var10 != 0)) {
            break;
         }
      }

      return -1;
   }



    private int method_47$3bd97f24ad(long callerKey, net.minecraft.entity.EntityLivingBase target, int predictionLimit) {
        long key = recovery$indy$flow$322() ^ callerKey;
        long slotKey = key ^ 132247033122086L;
        int slotUpper = (int) (slotKey >>> 32);
        short slotMiddle = (short) ((slotKey << 32) >>> 48);
        short slotLower = (short) ((slotKey << 48) >>> 48);
        long rotationKey = key ^ 104592174635451L;
        long pointKey = key ^ 64023800357219L;
        long launchKey = key ^ 54422119748580L;
        long playerPredictionKey = key ^ 138776435384975L;
        long collisionKey = key ^ 117992329532436L;
        long targetPredictionKey = key ^ 115742264778771L;
        int predictionUpper = (int) (targetPredictionKey >>> 32);
        byte predictionMiddle = (byte) ((targetPredictionKey << 32) >>> 56);
        int predictionLower = (int) ((targetPredictionKey << 40) >>> 40);
        java.util.ArrayList predictions = new java.util.ArrayList();
        boolean guard = recovery$indy$flow$325(-489472166460867724L, key);
        int nextTick = 1;
        boolean hitOnLastPrediction = false;
        double halfWidth = (double) (recovery$indy$flow$326(target) / 2.0F + 0.1F);
        Object container = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(recovery$indy$flow$328(recovery$indy$flow$327(), -489776939637983843L, key))))).field_429));
        int rodSlot = recovery$indy$flow$330(this, slotUpper, slotMiddle, slotLower, -487795693090889377L, key) + 36;
        Object rodStack = recovery$indy$flow$332(recovery$indy$flow$331(container, rodSlot));
        Object player = recovery$indy$flow$334(recovery$indy$flow$333(), -489776939637983843L, key);
        int startTick = recovery$indy$flow$337(recovery$indy$flow$336(recovery$indy$flow$335(), -489776939637983843L, key));
        int endTick = recovery$indy$flow$340(recovery$indy$flow$339(recovery$indy$flow$338(), -489776939637983843L, key));
        int nextPlayerTick = recovery$indy$flow$343(recovery$indy$flow$342(recovery$indy$flow$341(), -489776939637983843L, key)) + 1;
        Object playerPrediction = recovery$indy$flow$344(playerPredictionKey, player, startTick, endTick, 0, nextPlayerTick, -488617506854257416L, key);
        Object playerPoint = recovery$indy$flow$345(playerPrediction, pointKey, 999, -490106543692884276L, key);
        if (key < 0L) return nextTick;
        for (int attempt = 0; attempt < predictionLimit; attempt++) {
            if (guard) return nextTick;
            Object targetPredictions;
            if (nextTick <= predictions.size() && nextTick > 0) {
                targetPredictions = predictions;
            } else {
                Object predictionPlayer = recovery$indy$flow$348(recovery$indy$flow$347(), -489776939637983843L, key);
                int fromTick = recovery$indy$flow$351(recovery$indy$flow$350(recovery$indy$flow$349(), -489776939637983843L, key));
                int toTick = recovery$indy$flow$354(recovery$indy$flow$353(recovery$indy$flow$352(), -489776939637983843L, key)) + nextTick;
                predictions = (java.util.ArrayList) recovery$indy$flow$355(predictionPlayer, target, fromTick, toTick, predictionUpper, true, predictionMiddle, predictionLower, -486780347912035851L, key);
                targetPredictions = predictions;
            }
            Object predictedPoint = recovery$indy$flow$356(targetPredictions, pointKey, 9999, -490106543692884276L, key);
            double targetX = recovery$indy$flow$357(predictedPoint);
            double targetY = recovery$indy$flow$358(predictedPoint);
            double targetZ = recovery$indy$flow$359(predictedPoint);
            double deltaX = targetX - recovery$indy$flow$360(playerPoint);
            double targetEyeY = targetY + (double) recovery$indy$flow$362(((java.lang.Object)(((augustus.recovered.modules.legit.AutoRodNew_47Ck) (((java.lang.Object)(this)))).field_40D)));
            double playerY = recovery$indy$flow$363(playerPoint);
            float playerEyeHeight = recovery$indy$flow$366(recovery$indy$flow$365(recovery$indy$flow$364(), -489776939637983843L, key));
            double deltaY = targetEyeY - (playerY + (double) playerEyeHeight);
            double deltaZ = targetZ - recovery$indy$flow$367(playerPoint);
            float yaw = (float) Math.toDegrees(Math.atan2(deltaZ, deltaX)) - 90.0F;
            float pitch = (float) -(recovery$indy$flow$371(deltaY, (double) recovery$indy$flow$370(deltaX * deltaX + deltaZ * deltaZ)) * 180.0D / Math.PI);
            float currentYaw = recovery$indy$flow$374(recovery$indy$flow$373(recovery$indy$flow$372(), -486734102223437442L, key));
            float alignedYaw = recovery$indy$flow$375(currentYaw, yaw, 180.0F, rotationKey, -488326081032857067L, key);
            net.C_478i targetBox = new net.C_478i(targetX - halfWidth, targetY + 0.2D, targetZ - halfWidth, targetX + halfWidth, targetY + (double) recovery$indy$flow$377(target), targetZ + halfWidth);
            float pitchOffset = 0.0F;
            while (pitchOffset < 20.0F) {
                boolean hit = false;
                for (int direction = -1; direction < 2; direction += 2) {
                    float testPitch = pitch + pitchOffset * (float) direction;
                    net.C_47Kr simulation = new net.C_47Kr();
                    Object launchPlayer = recovery$indy$flow$382(recovery$indy$flow$381(), -489776939637983843L, key);
                    recovery$indy$flow$383(simulation, launchKey, launchPlayer, rodStack, alignedYaw, testPitch, -487895971459455933L, key);
                    int hitTick = recovery$indy$flow$384(simulation, 100, collisionKey, target, targetBox, -489203831881227178L, key);
                    if (hitTick == Integer.MAX_VALUE) continue;
                    if (!hitOnLastPrediction && attempt == predictionLimit - 1 && hitTick <= nextTick - 1) hitOnLastPrediction = true;
                    nextTick = hitTick + 1;
                    hit = true;
                    break;
                }
                if (hit) break;
                if (key > 0L) pitchOffset += 0.2F;
            }
        }
        if (guard) return hitOnLastPrediction ? 1 : 0;
        return hitOnLastPrediction ? nextTick : -1000;
    }







   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var10001 = var2 ^ 31970059946167L;
      int var4 = (int)((var2 ^ 31970059946167L) >>> 48);
      int var5 = (int)((var2 ^ 31970059946167L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      boolean var7 = recovery$indy$47(6403048700744964765L, var2);
      AutoRodNew_47Ck var10000 = this;
      if (!var7) {
         if (this.field_40D == null) {
            return;
         }

         var10000 = this;
      }

      boolean var8 = recovery$indy$48(var10000.settingMoveFix, 6400423720888432834L, var2);
      if (!var7) {
         if (!var8) {
            return;
         }

         var8 = recovery$indy$49(ClientGlobals.field_46, (char)var4, var5, this, (char)var6, 6403702715279602489L, var2);
      }

      if (var8) {
         recovery$indy$50(var1, C_47tU.DEFAULT, 6400580422111428990L, var2);
      }
   }



   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 75862687826910L;
      long var6 = var1 ^ 5451650687478L;
      long var8 = var1 ^ 52344924935716L;
      long var10 = var1 ^ 80017760765463L;
      boolean var12 = recovery$indy$51(8139551495384806068L, var1);
      RenderUtils.method_42$da8c82d5d4();
      if (!var12) {
         label44: {
            AutoRodNew_47Ck var10000 = this;
            if (var1 > 0L) {
               if (!recovery$indy$52(this.settingESP, 8141262781082947819L, var1)) {
                  break label44;
               }

               var10000 = this;
            }

            if (!var12) {
               if (var10000.field_40D == null) {
                  break label44;
               }

               var10000 = this;
            }

            C_47tf var17 = var10000.field_46;
            if (!var12) {
               if (var10000.field_46 == null) {
                  break label44;
               }

               var17 = this.field_46;
            }

            float var13 = (float)((float)var17.field_40 - recovery$indy$53(field_43, 8133531074807183221L, var1).method_41$fedcb3e4d3());
            float var14 = (float)((float)this.field_46.field_41 - recovery$indy$54(field_43, 8133531074807183221L, var1).method_49$fedcb3e4d3());
            float var15 = (float)((float)this.field_46.field_47 - recovery$indy$55(field_43, 8133531074807183221L, var1).method_45$fedcb3e4d3());
            float var16 = this.field_40D.field_48w / 2.0F;
            recovery$indy$58(
               recovery$indy$56(this.field_40c, var4, 8133685498572012529L, var1),
               recovery$indy$57(this.field_40c, var8, 8139233789993485425L, var1),
               var6,
               8140940310193997400L,
               var1
            );
            recovery$indy$60(false, var10, recovery$indy$59(this, var13, var16, var14, var15), 8138642263759271819L, var1);
         }

         RenderUtils.method_43$da8c82d5d4();
      }
   }




   public void method_40G$e45a9973e5(long var1) {
        augustus.recovered.modules.legit.AutoRodNew_47Ck var178;
        augustus.recovered.modules.legit.AutoRodNew_47Ck var182;
        boolean var198;
      long var10001 = var1 ^ 112274876447146L;
      int var3 = (int)((var1 ^ 112274876447146L) >>> 32);
      int var4 = (int)((var1 ^ 112274876447146L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 104729863225817L;
      var10001 = var1 ^ 6407505185672L;
      int var8 = (int)((var1 ^ 6407505185672L) >>> 32);
      int var9 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var1 ^ 32298961072091L;
      int var13 = (int)((var1 ^ 97242560854314L) >>> 48);
      long var14 = (var1 ^ 97242560854314L) << 16 >>> 16;
      long var16 = var1 ^ 104233102399728L;
      long var10000 = -3622840294776074248L;
      boolean var18 = AimBot_47O_.method_45g$aae029aa0a();
      short var10003 = (short)var4;
      short var10004 = (short)var5;
      long var10005 = -3623394128138332717L;
      short var26 = var10004;
      short var27 = var10003;
      int var28 = var3;
      AutoRodNew_47Ck var29 = this;
      this.field_42 = var29.method_45$fe802877bf(var28, var27, var26);
      if (!var18) {
         label417: {
            label403: {
               if (this.field_40D != null) {
                  short var193 = (short)var13;
                  long var231 = -3623022995626112594L;
                  long var30 = var14;
                  short var32 = var193;
                  AutoRodNew_47Ck var33 = this;
                  net.C_47Bm var19 = var33.method_48$696c0aa931(var32, var30);
                  if (var19 != null) {
                     net.C_478Q var20 = new net.C_478Q(var19.field_48Q, var19.field_48j + 0.5, var19.field_42o);
                     var10001 = -3620920292106501871L;
                     net.minecraft.client.Minecraft var34 = field_43;
                     net.C_47tf var21 = var34.field_42P.method_49$41b79b67a0(1.0F);
                     var10001 = -3620920292106501871L;
                     net.minecraft.client.Minecraft var35 = field_43;
                     double var22 = var35.field_42P.method_40$ee256e8a75(this.field_40D);
                     var10001 = -3620920292106501871L;
                     net.minecraft.client.Minecraft var36 = field_43;
                     double var24 = var36.field_42P.method_40$ee256e8a75(var19);
                     if (var24 > var22) {
                        break label403;
                     }

                     double var180 = var21.method_43$3d77d36e13(new net.C_47tf(var19.field_48J / 32.0F, var19.field_48o / 32.0F, var19.field_48A / 32.0F));
                     long var232 = -3623230465267892182L;
                     long var37 = var6;
                     client.setting.NumberSetting var39 = this.settingMaxRodRange;
                     if (var180 > var39.method_44$474dfaa627(var37) || var19.field_48M || var19.field_46 || this.field_40D.field_432 == 10 || var19.field_427) {
                        break label403;
                     }

                     var10001 = -3624964034500252853L;
                     net.minecraft.client.Minecraft var40 = field_43;
                     if (var40.field_44Q.method_46$efbf73d2b1(var20.method_45$5730377d31()).method_48$e084f7739d().method_43$aae029aa0a()) {
                        break label403;
                     }
                  }
               } else {
                  long var223 = -3623903217370656040L;
                  long var83 = var16;
                  AutoRodNew_47Ck var84 = this;
                  if (var84.method_48y$0dd78e0064(var83) && this.field_438 > 3) {
                     long var242 = -3624793770232069993L;
                     long var47 = var11;
                     AutoRodNew_47Ck var49 = this;
                     this.field_42 = var49.method_49$95d88932bd(var47);
                     this.field_43a = false;
                  }
               }

               var182 = this;
               var198 = var18;
               if (var1 <= 0L) {
                  label382: {
                     label420: {
                        this.field_43a = var18;
                        var10001 = -3620920292106501871L;
                        net.minecraft.client.Minecraft var97 = field_43;
                        var10003 = (short)var4;
                        var10004 = (short)var5;
                        var10005 = -3623394128138332717L;
                        short var100 = var10004;
                        short var103 = var10003;
                        int var106 = var3;
                        AutoRodNew_47Ck var109 = this;
                        if (var97.field_42P.field_42X.field_42 != var109.method_45$fe802877bf(var106, var103, var100)) {
                           var10001 = -3623154307366294105L;
                           client.setting.BooleanSetting var113 = this.settingCombat;
                           if (!var113.method_49$aae029aa0a()) {
                              break label420;
                           }
                        }

                        var10001 = -3623154307366294105L;
                        client.setting.BooleanSetting var116 = this.settingCombat;
                        if (!var116.method_49$aae029aa0a()) {
                           break label382;
                        }

                        var10003 = (short)var4;
                        var10004 = (short)var5;
                        var10005 = -3623394128138332717L;
                        short var119 = var10004;
                        short var122 = var10003;
                        int var125 = var3;
                        AutoRodNew_47Ck var128 = this;
                        if (this.field_42 == var128.method_45$fe802877bf(var125, var122, var119)) {
                           break label382;
                        }
                     }

                     long var225 = -3623903217370656040L;
                     long var131 = var16;
                     AutoRodNew_47Ck var134 = this;
                     if (var134.method_48y$0dd78e0064(var131)) {
                        long var251 = -3624793770232069993L;
                        long var138 = var11;
                        AutoRodNew_47Ck var142 = this;
                        this.field_42 = var142.method_49$95d88932bd(var138);
                        this.field_43a = false;
                     }
                  }

                  this.field_438++;
                  if (this.field_40D != null) {
                     var10001 = -3620920292106501871L;
                     net.minecraft.client.Minecraft var146 = field_43;
                     byte var187 = ((byte) (var146.field_42P.method_436$aae029aa0a() ? 1 : 0));
                     long var288;
                     int var219 = (var288 = var1 - 0L) == 0L ? 0 : (var288 < 0L ? -1 : 1);
                     char var252 = (char)var9;
                     char var270 = (char)var10;
                     long var287 = -3624707850000315076L;
                     int var151 = this.field_42;
                     char var156 = var270;
                     char var161 = var252;
                     byte var166 = 2;
                     AutoRodNew_47Ck var171 = this;
                     byte var176 = var187;
                     net.C_47i.method_43$95cbd1eb82(var176, var171, var166, var161, var156, var151);
                  }

                  return;
               }
               break label417;
            }

            AutoRodNew_47Ck var181 = this;
            if (var1 < 0L) {
               label347: {
                  label422: {
                     this.field_43a = var18;
                     long var289;
                     int var221 = (var289 = var1 - 0L) == 0L ? 0 : (var289 < 0L ? -1 : 1);
                     this.field_43a = var18;
                     var10001 = -3620920292106501871L;
                     net.minecraft.client.Minecraft var95 = field_43;
                     var10003 = (short)var4;
                     var10004 = (short)var5;
                     var10005 = -3623394128138332717L;
                     short var98 = var10004;
                     short var101 = var10003;
                     int var104 = var3;
                     AutoRodNew_47Ck var107 = this;
                     if (var95.field_42P.field_42X.field_42 != var107.method_45$fe802877bf(var104, var101, var98)) {
                        var10001 = -3623154307366294105L;
                        client.setting.BooleanSetting var111 = this.settingCombat;
                        if (!var111.method_49$aae029aa0a()) {
                           break label422;
                        }
                     }

                     var10001 = -3623154307366294105L;
                     client.setting.BooleanSetting var114 = this.settingCombat;
                     if (!var114.method_49$aae029aa0a()) {
                        break label347;
                     }

                     var10003 = (short)var4;
                     var10004 = (short)var5;
                     var10005 = -3623394128138332717L;
                     short var117 = var10004;
                     short var120 = var10003;
                     int var123 = var3;
                     AutoRodNew_47Ck var126 = this;
                     if (this.field_42 == var126.method_45$fe802877bf(var123, var120, var117)) {
                        break label347;
                     }
                  }

                  long var222 = -3623903217370656040L;
                  long var129 = var16;
                  AutoRodNew_47Ck var132 = this;
                  if (var132.method_48y$0dd78e0064(var129)) {
                     long var240 = -3624793770232069993L;
                     long var136 = var11;
                     AutoRodNew_47Ck var140 = this;
                     this.field_42 = var140.method_49$95d88932bd(var136);
                     this.field_43a = false;
                  }
               }

               this.field_438++;
               if (this.field_40D != null) {
                  var10001 = -3620920292106501871L;
                  net.minecraft.client.Minecraft var144 = field_43;
                  byte var184 = ((byte) (var144.field_42P.method_436$aae029aa0a() ? 1 : 0));
                  long var290;
                  int var208 = (var290 = var1 - 0L) == 0L ? 0 : (var290 < 0L ? -1 : 1);
                  char var241 = (char)var9;
                  char var262 = (char)var10;
                  long var285 = -3624707850000315076L;
                  int var149 = this.field_42;
                  char var154 = var262;
                  char var159 = var241;
                  byte var164 = 2;
                  AutoRodNew_47Ck var169 = this;
                  byte var174 = var184;
                  net.C_47i.method_43$95cbd1eb82(var174, var169, var164, var159, var154, var149);
               }

               return;
            }

            label371: {
               if (!var18) {
                  if (this.field_438 <= 3) {
                     break label371;
                  }

                  long var233 = -3624793770232069993L;
                  long var41 = var11;
                  AutoRodNew_47Ck var43 = this;
                  this.field_42 = var43.method_49$95d88932bd(var41);
                  var181 = this;
               }

               var181.field_43a = false;
            }

            var182 = this;
            var198 = var18;
            if (var1 <= 0L) {
               label336: {
                  label424: {
                     this.field_43a = var18;
                     var10001 = -3620920292106501871L;
                     net.minecraft.client.Minecraft var94 = field_43;
                     var10003 = (short)var4;
                     var10004 = (short)var5;
                     var10005 = -3623394128138332717L;
                     short var60 = var10004;
                     short var61 = var10003;
                     int var62 = var3;
                     AutoRodNew_47Ck var63 = this;
                     if (var94.field_42P.field_42X.field_42 != var63.method_45$fe802877bf(var62, var61, var60)) {
                        var10001 = -3623154307366294105L;
                        client.setting.BooleanSetting var110 = this.settingCombat;
                        if (!var110.method_49$aae029aa0a()) {
                           break label424;
                        }
                     }

                     var10001 = -3623154307366294105L;
                     client.setting.BooleanSetting var65 = this.settingCombat;
                     if (!var65.method_49$aae029aa0a()) {
                        break label336;
                     }

                     var10003 = (short)var4;
                     var10004 = (short)var5;
                     var10005 = -3623394128138332717L;
                     short var66 = var10004;
                     short var67 = var10003;
                     int var68 = var3;
                     AutoRodNew_47Ck var69 = this;
                     if (this.field_42 == var69.method_45$fe802877bf(var68, var67, var66)) {
                        break label336;
                     }
                  }

                  long var220 = -3623903217370656040L;
                  long var70 = var16;
                  AutoRodNew_47Ck var72 = this;
                  if (var72.method_48y$0dd78e0064(var70)) {
                     long var236 = -3624793770232069993L;
                     long var135 = var11;
                     AutoRodNew_47Ck var139 = this;
                     this.field_42 = var139.method_49$95d88932bd(var135);
                     this.field_43a = false;
                  }
               }

               this.field_438++;
               if (this.field_40D != null) {
                  var10001 = -3620920292106501871L;
                  net.minecraft.client.Minecraft var143 = field_43;
                  byte var183 = ((byte) (var143.field_42P.method_436$aae029aa0a() ? 1 : 0));
                  long var291;
                  int var203 = (var291 = var1 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                  char var237 = (char)var9;
                  char var259 = (char)var10;
                  long var284 = -3624707850000315076L;
                  int var148 = this.field_42;
                  char var153 = var259;
                  char var158 = var237;
                  byte var163 = 2;
                  AutoRodNew_47Ck var168 = this;
                  byte var173 = var183;
                  net.C_47i.method_43$95cbd1eb82(var173, var168, var163, var158, var153, var148);
               }

               return;
            }
         }

         label365: {
            if (!var198) {
               var10003 = (short)var4;
               var10004 = (short)var5;
               var10005 = -3623394128138332717L;
               short var85 = var10004;
               short var86 = var10003;
               int var87 = var3;
               AutoRodNew_47Ck var88 = this;
               if (var182.field_42 == var88.method_45$fe802877bf(var87, var86, var85)) {
                  var10001 = -3624402911504189259L;
                  net.minecraft.client.Minecraft var89 = field_43;
                  var10003 = (short)var4;
                  var10004 = (short)var5;
                  var10005 = -3623394128138332717L;
                  short var90 = var10004;
                  short var91 = var10003;
                  int var92 = var3;
                  AutoRodNew_47Ck var93 = this;
                  if (var89.field_44K.field_40 == var93.method_45$fe802877bf(var92, var91, var90)) {
                     break label365;
                  }
               }

               var182 = this;
            }

            var182.field_43a = false;
         }

         label358: {
            label425: {
               var10001 = -3620920292106501871L;
               net.minecraft.client.Minecraft var96 = field_43;
               var10003 = (short)var4;
               var10004 = (short)var5;
               var10005 = -3623394128138332717L;
               short var99 = var10004;
               short var102 = var10003;
               int var105 = var3;
               AutoRodNew_47Ck var108 = this;
               if (var96.field_42P.field_42X.field_42 != var108.method_45$fe802877bf(var105, var102, var99)) {
                  var10001 = -3623154307366294105L;
                  client.setting.BooleanSetting var112 = this.settingCombat;
                  if (!var112.method_49$aae029aa0a()) {
                     break label425;
                  }
               }

               var10001 = -3623154307366294105L;
               client.setting.BooleanSetting var115 = this.settingCombat;
               if (!var115.method_49$aae029aa0a()) {
                  break label358;
               }

               var10003 = (short)var4;
               var10004 = (short)var5;
               var10005 = -3623394128138332717L;
               short var118 = var10004;
               short var121 = var10003;
               int var124 = var3;
               AutoRodNew_47Ck var127 = this;
               if (this.field_42 == var127.method_45$fe802877bf(var124, var121, var118)) {
                  break label358;
               }
            }

            long var224 = -3623903217370656040L;
            long var130 = var16;
            AutoRodNew_47Ck var133 = this;
            if (var133.method_48y$0dd78e0064(var130)) {
               long var247 = -3624793770232069993L;
               long var137 = var11;
               AutoRodNew_47Ck var141 = this;
               this.field_42 = var141.method_49$95d88932bd(var137);
               this.field_43a = false;
            }
         }

         this.field_438++;
         if (this.field_40D != null) {
            var10001 = -3620920292106501871L;
            net.minecraft.client.Minecraft var145 = field_43;
            boolean var186 = var145.field_42P.method_436$aae029aa0a();
            long var292;
            int var214 = (var292 = var1 - 0L) == 0L ? 0 : (var292 < 0L ? -1 : 1);
            if (!var186) {
               char var248 = (char)var9;
               char var267 = (char)var10;
               long var286 = -3624707850000315076L;
               int var150 = this.field_42;
               char var155 = var267;
               char var160 = var248;
               byte var165 = 2;
               AutoRodNew_47Ck var170 = this;
               int var175 = var8;
               net.C_47i.method_43$95cbd1eb82(var175, var170, var165, var160, var155, var150);
            }
         }
      } else {
         label412: {
            long var10002 = -3623903217370656040L;
            long var44 = var16;
            AutoRodNew_47Ck var46 = this;
            byte var177 = ((byte) (var46.method_48y$0dd78e0064(var44) ? 1 : 0));
            var10003 = (short)var4;
            var10004 = (short)var5;
            var10005 = -3623394128138332717L;
            short var50 = var10004;
            short var51 = var10003;
            int var52 = var3;
            AutoRodNew_47Ck var53 = this;
            if (var177 == var53.method_45$fe802877bf(var52, var51, var50)) {
               var10001 = -3624402911504189259L;
               net.minecraft.client.Minecraft var54 = field_43;
               var10003 = (short)var4;
               var10004 = (short)var5;
               var10005 = -3623394128138332717L;
               short var55 = var10004;
               short var56 = var10003;
               int var57 = var3;
               AutoRodNew_47Ck var58 = this;
               if (var54.field_44K.field_40 == var58.method_45$fe802877bf(var57, var56, var55)) {
                  var178 = this;
                  break label412;
               }

               var10001 = -3623154307366294105L;
               client.setting.BooleanSetting var64 = this.settingCombat;
               if (var64.method_49$aae029aa0a()) {
                  long var228 = -3624793770232069993L;
                  long var73 = var11;
                  AutoRodNew_47Ck var75 = this;
                  this.field_42 = var75.method_49$95d88932bd(var73);
                  this.field_43a = false;
               }
            } else {
               this.field_43a = false;
               var10001 = -3620920292106501871L;
               net.minecraft.client.Minecraft var59 = field_43;
               if (var59.field_42P.field_42X.field_42 != 0) {
                  var178 = this;
                  break label412;
               }
            }

            this.field_438++;
            var178 = this;
         }

         if (var178.field_40D != null) {
            var10001 = -3620920292106501871L;
            net.minecraft.client.Minecraft var76 = field_43;
            byte var179 = ((byte) (var76.field_42P.method_436$aae029aa0a() ? 1 : 0));
            if (var1 > 0L) {
               if (var179 == 0) {
                  char var230 = (char)var9;
                  char var256 = (char)var10;
                  long var283 = -3624707850000315076L;
                  int var147 = this.field_42;
                  char var152 = var256;
                  char var157 = var230;
                  byte var162 = 2;
                  AutoRodNew_47Ck var167 = this;
                  int var172 = var8;
                  net.C_47i.method_43$95cbd1eb82(var172, var167, var162, var157, var152, var147);
               }
            } else {
               char var229 = (char)var9;
               char var255 = (char)var10;
               long var10006 = -3624707850000315076L;
               int var77 = this.field_42;
               char var78 = var255;
               char var79 = var229;
               byte var80 = 2;
               AutoRodNew_47Ck var81 = this;
               byte var82 = var179;
               net.C_47i.method_43$95cbd1eb82(var82, var81, var80, var79, var78, var77);
            }
         }
      }
   }








   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$61(this, 28, var3, -7105449630092125326L, var1);
      recovery$indy$62(this, 7, var3, -7105449630092125326L, var1);
      recovery$indy$63(this, 40, var3, -7105449630092125326L, var1);
      recovery$indy$64(this, 21, var3, -7105449630092125326L, var1);
      recovery$indy$65(this, 32, var3, -7105449630092125326L, var1);
      recovery$indy$66(this, 34, var3, -7105449630092125326L, var1);
      recovery$indy$67(this, 17, var3, -7105449630092125326L, var1);
   }



   private boolean method_48P$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 66683490868603L;
      int var3 = (int)((var1 ^ 66683490868603L) >>> 32);
      int var4 = (int)((var1 ^ 66683490868603L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 129321460695993L;
      int var8 = (int)((var1 ^ 33436370049230L) >>> 56);
      long var9 = (var1 ^ 33436370049230L) << 8 >>> 8;
      net.C_47Kr var11 = new net.C_47Kr();
      recovery$indy$flow$548(
         var11,
         var6,
         (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$535(field_43, 7597205975398131136L, var1),
         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$537(field_43, 7597205975398131136L, var1))
            .field_429
            .method_46$4c10532da1(recovery$indy$flow$539(this, var3, (short)var4, (short)var5, 7594833155651907842L, var1) + 36)
            .method_48$ac4db64966(),
         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$543(field_43, 7597205975398131136L, var1)).field_43F,
         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$546(field_43, 7597205975398131136L, var1)).field_43n,
         7595287580882973726L,
         var1
      );
      return recovery$indy$flow$551(var11, 100, (byte)var8, this.field_40D, this.field_40M, var9, 7596288223099209451L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_40D = null;
   }



   private boolean method_48y$0dd78e0064(long var1) {
      var1 = a ^ var1;
      int var3 = (int)((var1 ^ 58352006063068L) >>> 48);
      long var4 = (var1 ^ 58352006063068L) << 16 >>> 16;
      return recovery$indy$75(this, (short)var3, var4, -2932403400308010152L, var1) != null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43p = 0;
      this.field_43a = false;
      this.field_43P = true;
   }



    public void method_487$da8c82d5d4() {
        block16: {
            net.C_47tf c_47tf;
            Object object;
            int n;
            int n2;
            int n3;
            long l;
            long l2;
            long l3;
            block15: {
                int n4;
                int n5;
                long l4;
                int n6;
                int n7;
                int n8;
                long l5;
                long l6;
                long l7;
                block12: {
                    block13: {
                        Object object2;
                        Object object3;
                        block14: {
                            block10: {
                                block11: {
                                    long l8;
                                    long l9;
                                    block8: {
                                        block9: {
                                            block7: {
                                                long l10 = l3 = a ^ 0x3F6274FB0652L;
                                                l9 = l10 ^ 0x7FC20765CA0BL;
                                                l7 = l10 ^ 0x4BDCC37330E3L;
                                                l6 = l10 ^ 0x241BEC27882EL;
                                                l2 = l10 ^ 0x19381F83F2D9L;
                                                l5 = l10 ^ 0x5F3B2CC29C18L;
                                                l = l10 ^ 0x1B36F7005FF4L;
                                                long l11 = l10 ^ 0xC45C7B1DD68L;
                                                n8 = (int)(l11 >>> 32);
                                                n7 = (int)(l11 << 32 >>> 56);
                                                n6 = (int)(l11 << 40 >>> 40);
                                                l4 = l10 ^ 0x56AE18F4FF7DL;
                                                l8 = l10 ^ 0x7EF89397EEF9L;
                                                long l12 = l10 ^ 0x7DE22B29D0C4L;
                                                n3 = (int)(l12 >>> 48);
                                                n2 = (int)(l12 << 16 >>> 32);
                                                n = (int)(l12 << 48 >>> 48);
                                                int n9 = ((int) (augustus.recovered.modules.legit.AimBot_47O_.method_45i$aae029aa0a() ? 1 : 0));
                                                net.minecraft.client.Minecraft c_47nT = field_43;
                                                n5 = n9;
                                                n4 = ((int) (c_47nT.field_44r.field_44l.method_42$aae029aa0a() ? 1 : 0));
                                                if (n5 == 0) break block7;
                                                n5 = n4;
                                                if (n5 != 0) break block8;
                                                break block9;
                                            }
                                            n5 = n4;
                                            if (n5 != 0) return;
                                            net.minecraft.client.Minecraft c_47nT = field_43;
                                            Object[] objectArray = c_47nT.field_44Q.field_44Q.stream().filter(AutoRodNew_47Ck.recovery$indy$76(this)).sorted(java.util.Comparator.comparingDouble(AutoRodNew_47Ck.recovery$indy$77(this))).toArray();
                                            n4 = objectArray.length;
                                            n5 = n4;
                                            if (n5 == 0) break block10;
                                            break block11;
                                        }
                                        net.C_47cu c_47cu = this.field_409;
                                        c_47cu.method_46$da8c82d5d4();
                                    }
                                    this.field_40D = null;
                                    this.field_40M = null;
                                    long l13 = l8;
                                    AutoRodNew_47Ck autoRodNew_47Ck = this;
                                    n4 = ((int) (autoRodNew_47Ck.method_45$0dd78e0064(l13) ? 1 : 0));
                                    n5 = n4;
                                    if (n5 == 0) return;
                                    long l14 = l9;
                                    augustus.recovered.modules.world.Scaffold_47Te scaffold_47Te = client.ClientGlobals.field_48.field_46q;
                                    n4 = ((client.module.Module)scaffold_47Te).method_46$0dd78e0064(l14) ? 1 : 0;
                                    n5 = n4;
                                    if (n5 == 0) break block12;
                                    break block13;
                                }
                                net.minecraft.client.Minecraft c_47nT = field_43;
                                object3 = c_47nT.field_42P;
                                break block14;
                            }
                            object3 = this;
                            object3 = ((AutoRodNew_47Ck)object3).field_40D;
                        }
                        if ((object2 = object3) == null) return;
                        net.minecraft.client.Minecraft c_47nT = field_43;
                        double d = 180.0 - net.C_47hN.method_44$eb37070982(net.C_47sk.method_41$f6c4892e39(c_47nT.field_42P.field_48h), net.C_47sk.method_41$f6c4892e39(this.field_40D.field_43m));
                        long l15 = l6;
                        client.setting.NumberSetting c_47TS = this.settingMaxTargetLookFovDiff;
                        double d2 = d - c_47TS.method_44$474dfaa627(l15);
                        n4 = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                        int n10 = 10;
                        int n11 = n4;
                        if (n11 >= n10) return;
                        net.minecraft.client.Minecraft c_47nT2 = field_43;
                        net.minecraft.client.Minecraft c_47nT3 = field_43;
                        net.minecraft.client.Minecraft c_47nT4 = field_43;
                        net.C_47tf c_47tf2 = AutoRodNew_47Ck.recovery$indy$79(AutoRodNew_47Ck.recovery$indy$78(c_47nT2.field_42P, this.field_40D, c_47nT3.field_42P.field_48y, c_47nT4.field_42P.field_48y + this.field_43p, n8, true, (byte)n7, n6, -4303753648704463730L, l3), l5, 99999, -4302714796811916361L, l3);
                        return;
                    }
                    client.setting.BooleanSetting c_47TV = this.settingDisableWhileScaffold;
                    n4 = c_47TV.method_49$aae029aa0a() ? 1 : 0;
                    n5 = n4;
                    if (n5 != 0) return;
                }
                net.minecraft.client.Minecraft c_47nT = field_43;
                Object[] objectArray = c_47nT.field_44Q.field_44Q.stream().filter(AutoRodNew_47Ck.recovery$indy$76(this)).sorted(java.util.Comparator.comparingDouble(AutoRodNew_47Ck.recovery$indy$77(this))).toArray();
                n4 = objectArray.length;
                n5 = n4;
                if (n5 > 0) {
                    this.field_40D = (net.minecraft.entity.EntityLivingBase)objectArray[0];
                    object = this;
                    client.setting.BooleanSetting c_47TV = ((AutoRodNew_47Ck)object).settingCombat;
                    n4 = c_47TV.method_49$aae029aa0a() ? 1 : 0;
                    n5 = n4;
                    if (n5 != 0) {
                        net.minecraft.client.Minecraft c_47nT5 = field_43;
                        object = c_47nT5.field_42P;
                        double d = (double)((net.minecraft.entity.Entity)object).method_40$ee256e8a75(this.field_40D) - 3.2;
                        n5 = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                        if (n5 < 0) {
                            this.field_40D = null;
                        }
                    }
                }
                object = this;
                object = ((AutoRodNew_47Ck)object).field_40D;
                Object object4 = object;
                if (object4 == null) return;
                net.minecraft.client.Minecraft c_47nT6 = field_43;
                double d = 180.0 - net.C_47hN.method_44$eb37070982(net.C_47sk.method_41$f6c4892e39(c_47nT6.field_42P.field_48h), net.C_47sk.method_41$f6c4892e39(this.field_40D.field_43m));
                long l16 = l6;
                client.setting.NumberSetting c_47TS = this.settingMaxTargetLookFovDiff;
                double d3 = d - c_47TS.method_44$474dfaa627(l16);
                n4 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                int n12 = n4;
                if (n12 > 0) {
                    this.field_40D = null;
                    return;
                }
                int n13 = 8;
                net.minecraft.entity.EntityLivingBase c_47aK = this.field_40D;
                long l17 = l4;
                AutoRodNew_47Ck autoRodNew_47Ck = this;
                n4 = this.field_43p = autoRodNew_47Ck.method_47$3bd97f24ad(l17, c_47aK, n13);
                n12 = n4;
                if (n12 < 0) return;
                n4 = this.field_43p;
                n12 = n4;
                int n14 = 10;
                if (n12 >= n14) return;
                net.minecraft.client.Minecraft c_47nT7 = field_43;
                net.minecraft.client.Minecraft c_47nT8 = field_43;
                net.minecraft.client.Minecraft c_47nT9 = field_43;
                c_47tf = AutoRodNew_47Ck.recovery$indy$79(AutoRodNew_47Ck.recovery$indy$78(c_47nT7.field_42P, this.field_40D, c_47nT8.field_42P.field_48y, c_47nT9.field_42P.field_48y + this.field_43p, n8, true, (byte)n7, n6, -4303753648704463730L, l3), l5, 99999, -4302714796811916361L, l3);
                object = this;
                client.setting.BooleanSetting c_47TV = ((AutoRodNew_47Ck)object).settingCombat;
                n12 = c_47TV.method_49$aae029aa0a() ? 1 : 0;
                if (n12 == 0) break block15;
                object = this;
                client.setting.BooleanSetting c_47TV2 = ((AutoRodNew_47Ck)object).settingOnlyRodIfNotInReach;
                n12 = c_47TV2.method_49$aae029aa0a() ? 1 : 0;
                if (n12 == 0) break block15;
                object = this;
                Object object5 = object;
                long l18 = l7;
                n12 = ((AutoRodNew_47Ck)object5).method_48$0dd78e0064(l18) ? 1 : 0;
                if (n12 == 0) break block16;
            }
            object = this;
            double d = ((AutoRodNew_47Ck)object).field_40D.field_48w / 2.0f + 0.1f;
            net.C_478i c_478i = new net.C_478i(c_47tf.field_40 - d, c_47tf.field_41, c_47tf.field_47 - d, c_47tf.field_40 + d, c_47tf.field_41 + (double)(this.field_40D.field_48 / 2.0f), c_47tf.field_47 + d);
            this.field_46 = c_47tf;
            net.minecraft.client.Minecraft c_47nT = field_43;
            net.minecraft.client.Minecraft c_47nT10 = field_43;
            net.minecraft.client.Minecraft c_47nT11 = field_43;
            net.minecraft.client.Minecraft c_47nT12 = field_43;
            net.C_47tf c_47tf3 = (net.C_47tf)AutoRodNew_47Ck.recovery$indy$80(l, c_47nT.field_42P, c_47nT10.field_42P.field_48y, c_47nT11.field_42P.field_48y, 0, c_47nT12.field_42P.field_48y + 1, -4304471513168871037L, l3).get(0);
            double d4 = c_47tf.field_40 - c_47tf3.field_40;
            net.minecraft.client.Minecraft c_47nT13 = field_43;
            double d5 = c_47tf.field_41 + (double)this.field_40D.field_48 / 1.7 - (c_47tf3.field_41 + (double)c_47nT13.field_42P.method_41$bc607678b6());
            double d6 = c_47tf.field_47 - c_47tf3.field_47;
            float f = (float)Math.toDegrees(Math.atan2(d6, d4)) - 90.0f;
            double d7 = net.C_47sk.method_42$44b37c2d95(d4 * d4 + d6 * d6);
            net.minecraft.client.Minecraft c_47nT14 = field_43;
            double d8 = c_47nT14.field_42P.method_44$ee256e8a75(this.field_40D);
            float f2 = (float)((double)((float)(-(Math.atan2(d5, d7) * 180.0 / Math.PI))) - (double)0.55f * Math.max(0.0, d8 - 3.0));
            net.C_47S6 c_47S6 = client.ClientGlobals.field_46;
            net.C_477r c_477r = c_47S6.method_44$4f8050086d();
            long l19 = l2;
            float f3 = f2;
            float f4 = f;
            net.C_429 c_429 = this.field_44;
            net.C_477r c_477r2 = c_429.method_48$e39a948784(f4, f3, l19, c_477r);
            AutoRodNew_47Ck autoRodNew_47Ck = this;
            int n15 = n;
            int n16 = n2;
            char c = (char)n3;
            int n17 = 0;
            net.C_477r c_477r3 = c_477r2;
            net.C_47S6 c_47S62 = client.ClientGlobals.field_46;
            c_47S62.method_45$c163d5afc8(c_477r3, n17, c, n16, n15, autoRodNew_47Ck);
            this.field_40M = c_478i;
            return;
        }
    }








    public AutoRodNew_47Ck(long a0) {
        super((java.lang.String) ("AutoRodNew"),(java.lang.String) ("AutomatischeAngel"),(long) (((augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0) ^ 81603527077008L)),(java.awt.Color) (new java.awt.Color((int) (203),(int) (232),(int) (162))),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0) ^ 136107857404262L);
        long constructorKey4 = ((augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0) ^ 55812332692918L);
        long constructorKey5 = ((augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0) ^ 85401991571713L);
        long constructorKey6 = ((augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0) ^ 84701286075978L);
        long constructorKey7 = ((augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0) ^ 90058307829801L);
        long constructorKey8 = ((augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0) ^ 51982455903469L);
        long constructorKey9 = ((augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0) ^ 51280948573028L);
        long constructorKey10 = ((augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0) ^ 64954109046923L);
        long constructorKey11 = ((augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0) ^ 24513488391948L);
        long constructorKey12 = ((augustus.recovered.modules.legit.AutoRodNew_47Ck.a ^ a0) ^ 105016665731246L);
        client.setting.SettingGroup initialized13 = new client.setting.SettingGroup(this, "Rotations", true, constructorKey5);
        recovery$indy$flow$713(this, initialized13);
        client.setting.NumberSetting initialized14 = new client.setting.NumberSetting(this, "MaxTargetLookFovDiff", Double.longBitsToDouble(4640537203540230144L), constructorKey11, Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$716(this, initialized14);
        client.setting.NumberSetting initialized15 = new client.setting.NumberSetting(this, "Fov", Double.longBitsToDouble(4636033603912859648L), constructorKey11, 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        recovery$indy$flow$719(this, initialized15);
        client.setting.NumberSetting initialized16 = new client.setting.NumberSetting(this, "MaxRodRange", Double.longBitsToDouble(4621819117588971520L), constructorKey11, 0.0D, Double.longBitsToDouble(4626322717216342016L), 2);
        recovery$indy$flow$722(this, initialized16);
        client.setting.BooleanSetting initialized17 = new client.setting.BooleanSetting(this, constructorKey10, "MoveFix", true);
        recovery$indy$flow$725(this, initialized17);
        java.lang.Object initialValue18 = recovery$indy$flow$727();
        client.setting.MultiSelectSetting initialized19 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey3, (net.C_47OZ[]) (initialValue18));
        recovery$indy$flow$729(this, initialized19);
        client.setting.BooleanSetting initialized20 = new client.setting.BooleanSetting(this, constructorKey10, "IgnoreEatingTargets", true);
        recovery$indy$flow$732(this, initialized20);
        client.setting.BooleanSetting initialized21 = new client.setting.BooleanSetting(this, constructorKey10, "Combat", true);
        recovery$indy$flow$735(this, initialized21);
        client.setting.BooleanSetting initialized22 = new client.setting.BooleanSetting(this, constructorKey10, "OnlyRodIfNotInReach", false);
        recovery$indy$flow$738(this, initialized22);
        client.setting.BooleanSetting initialized23 = new client.setting.BooleanSetting(this, constructorKey10, "LuckyThrow", false);
        recovery$indy$flow$741(this, initialized23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey10, "Click", true);
        recovery$indy$flow$744(this, initialized24);
        client.setting.BooleanSetting initialized25 = new client.setting.BooleanSetting(this, constructorKey10, "DisableWhileScaffold", true);
        recovery$indy$flow$747(this, initialized25);
        client.setting.BooleanSetting initialized26 = new client.setting.BooleanSetting(this, constructorKey10, "OnlyWhileKillAuraHasTarget", false);
        recovery$indy$flow$750(this, initialized26);
        client.setting.BooleanSetting initialized27 = new client.setting.BooleanSetting(this, constructorKey10, "ESP", true);
        recovery$indy$flow$753(this, initialized27);
        java.lang.Object initialValue28 = recovery$indy$flow$755();
        client.setting.ColorSetting initialized29 = new client.setting.ColorSetting(constructorKey12, this, "ESPColor", (java.awt.Color) (initialValue28));
        java.lang.Object initialValue30 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoRodNew_47Ck) (((java.lang.Object)(this)))).settingESP));
        java.lang.Object initialValue31 = recovery$indy$flow$758(initialValue30);
        java.lang.Object initialValue32 = recovery$indy$flow$759(initialValue30);
        java.lang.Object initialValue33 = initialValue32;
        long initialValue34 = constructorKey4;
        client.setting.ColorSetting initialValue35 = initialized29;
        java.lang.Object initialValue36 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue35))))));
        java.lang.Object initialValue37 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue33))))));
        java.lang.Object initialValue38 = recovery$indy$flow$762(initialValue36, initialValue34, initialValue37);
        java.lang.Object initialValue39 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue38))))));
        recovery$indy$flow$764(this, initialValue39);
        client.setting.ShaderOptions initialized40 = new client.setting.ShaderOptions(this, constructorKey7);
        long initialValue41 = constructorKey8;
        client.setting.ShaderOptions initialValue42 = initialized40;
        java.lang.Object initialValue43 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue42))))));
        java.lang.Object initialValue44 = recovery$indy$flow$768(initialValue43, initialValue41);
        java.lang.Object initialValue45 = recovery$indy$flow$769();
        java.lang.Object initialValue46 = initialValue45;
        long initialValue47 = constructorKey9;
        java.lang.Object initialValue48 = initialValue44;
        java.lang.Object initialValue49 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue48))))));
        java.lang.Object initialValue50 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue46))))));
        java.lang.Object initialValue51 = recovery$indy$flow$772(initialValue49, initialValue47, initialValue50);
        recovery$indy$flow$773(this, initialValue51);
        net.C_47cu initialized52 = new net.C_47cu();
        recovery$indy$flow$776(this, initialized52);
        recovery$indy$flow$777(this, 0);
        recovery$indy$flow$778(this, -1);
        recovery$indy$flow$779(this, null);
        recovery$indy$flow$780(this, null);
        recovery$indy$flow$781(this, 0);
        recovery$indy$flow$782(this, false);
        recovery$indy$flow$783(this, false);
        recovery$indy$flow$784(this, -1);
        java.lang.Object initialValue53 = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoRodNew_47Ck) (((java.lang.Object)(this)))).settingRotations));
        net.C_429 initialized54 = new net.C_429(this, (client.setting.SettingGroup) (initialValue53), constructorKey6);
        recovery$indy$flow$788(this, initialized54);
    }





    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native boolean recovery$indy$flow$44(java.lang.Object a0,boolean a1,boolean a2,boolean a3,boolean a4,boolean a5,boolean a6,boolean a7,boolean a8,long a9,boolean a10,boolean a11,boolean a12,long a13,long a14);
    private static long recovery$indy$flow$322() {
        return augustus.recovered.modules.legit.AutoRodNew_47Ck.a;
    }
    private static native boolean recovery$indy$flow$325(long a0,long a1);
    private static float recovery$indy$flow$326(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48w;
    }
    private static java.lang.Object recovery$indy$flow$327() {
        return augustus.recovered.modules.legit.AutoRodNew_47Ck.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$328(java.lang.Object a0,long a1,long a2);

    private static native int recovery$indy$flow$330(java.lang.Object a0,int a1,short a2,short a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$331(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$332(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$333() {
        return augustus.recovered.modules.legit.AutoRodNew_47Ck.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$334(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$335() {
        return augustus.recovered.modules.legit.AutoRodNew_47Ck.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$336(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$337(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static java.lang.Object recovery$indy$flow$338() {
        return augustus.recovered.modules.legit.AutoRodNew_47Ck.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$339(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$340(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static java.lang.Object recovery$indy$flow$341() {
        return augustus.recovered.modules.legit.AutoRodNew_47Ck.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$342(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$343(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static native java.lang.Object recovery$indy$flow$344(long a0,java.lang.Object a1,int a2,int a3,int a4,int a5,long a6,long a7);
    private static native java.lang.Object recovery$indy$flow$345(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static java.lang.Object recovery$indy$flow$347() {
        return augustus.recovered.modules.legit.AutoRodNew_47Ck.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$348(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$349() {
        return augustus.recovered.modules.legit.AutoRodNew_47Ck.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$350(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$351(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static java.lang.Object recovery$indy$flow$352() {
        return augustus.recovered.modules.legit.AutoRodNew_47Ck.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$353(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$354(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static native java.lang.Object recovery$indy$flow$355(java.lang.Object a0,java.lang.Object a1,int a2,int a3,int a4,boolean a5,byte a6,int a7,long a8,long a9);
    private static native java.lang.Object recovery$indy$flow$356(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static double recovery$indy$flow$357(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$358(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$359(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$360(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }

    private static native float recovery$indy$flow$362(java.lang.Object a0);
    private static double recovery$indy$flow$363(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$364() {
        return augustus.recovered.modules.legit.AutoRodNew_47Ck.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$365(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$366(java.lang.Object a0);
    private static double recovery$indy$flow$367(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native float recovery$indy$flow$370(double a0);
    private static native double recovery$indy$flow$371(double a0,double a1);
    private static java.lang.Object recovery$indy$flow$372() {
        return client.ClientGlobals.field_46;
    }
    private static native java.lang.Object recovery$indy$flow$373(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$374(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_44;
    }
    private static native float recovery$indy$flow$375(float a0,float a1,float a2,long a3,long a4,long a5);
    private static float recovery$indy$flow$377(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48;
    }
    private static java.lang.Object recovery$indy$flow$381() {
        return augustus.recovered.modules.legit.AutoRodNew_47Ck.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$382(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$383(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,float a4,float a5,long a6,long a7);
    private static native int recovery$indy$flow$384(java.lang.Object a0,int a1,long a2,java.lang.Object a3,java.lang.Object a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$535(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$537(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$539(java.lang.Object a0,int a1,short a2,short a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$543(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$546(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$548(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,float a4,float a5,long a6,long a7);
    private static native boolean recovery$indy$flow$551(java.lang.Object a0,int a1,byte a2,java.lang.Object a3,java.lang.Object a4,long a5,long a6,long a7);
    private static native void recovery$indy$flow$713(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$716(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$719(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$722(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$725(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$727();
    private static native void recovery$indy$flow$729(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$732(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$735(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$738(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$741(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$744(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$747(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$750(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$753(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$755() {
        return java.awt.Color.GREEN;
    }

    private static java.lang.Object recovery$indy$flow$758(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$759(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$762(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$764(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$768(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$769() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$772(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$773(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$776(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$777(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoRodNew_47Ck) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$778(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoRodNew_47Ck) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$779(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoRodNew_47Ck) (a0)).field_40D = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$780(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoRodNew_47Ck) (a0)).field_46 = ((net.C_47tf) (a1));
        return;
    }
    private static void recovery$indy$flow$781(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoRodNew_47Ck) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$782(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoRodNew_47Ck) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$783(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.AutoRodNew_47Ck) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$784(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoRodNew_47Ck) (a0)).field_43y = a1;
        return;
    }

    private static native void recovery$indy$flow$788(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native ArrayList recovery$indy$6(long var0, Object var2, int var3, int var4, int var5, int var6, long var7, long var9);
   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native ArrayList recovery$indy$10(long var0, Object var2, Object var3, int var4, int var5, long var6, long var8);
   private static native boolean recovery$indy$11(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$13(Object var0, long var1, int var3, long var4, long var6);
   private static native C_47tf recovery$indy$14(Object var0, long var1, int var3, long var4, long var6);
   private static native C_478i recovery$indy$15(Object var0, long var1, boolean var3, long var4, long var6);
   private static native C_47tf recovery$indy$16(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$17(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$19(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$21(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$22(Object var0, long var1, long var3);
   private static native C_455 recovery$indy$23(Object var0, long var1, long var3);
   private static native boolean recovery$indy$24(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$25(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native boolean recovery$indy$47(long var0, long var2);
   private static native boolean recovery$indy$48(Object var0, long var1, long var3);
   private static native boolean recovery$indy$49(Object var0, char var1, int var2, Object var3, char var4, long var5, long var7);
   private static native void recovery$indy$50(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$51(long var0, long var2);
   private static native boolean recovery$indy$52(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$53(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$54(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$55(Object var0, long var1, long var3);
   private static native boolean recovery$indy$56(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$57(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$58(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$59(AutoRodNew_47Ck var0, float var1, float var2, float var3, float var4);
   private static native void recovery$indy$60(boolean var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$61(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$62(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$63(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$64(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$65(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$66(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$67(Object var0, int var1, long var2, long var4, long var6);
   private static native C_47Bm recovery$indy$75(Object var0, short var1, long var2, long var4, long var6);
   private static native Predicate recovery$indy$76(AutoRodNew_47Ck var0);
   private static native ToDoubleFunction recovery$indy$77(AutoRodNew_47Ck var0);
   private static native ArrayList recovery$indy$78(
      Object var0, Object var1, int var2, int var3, int var4, boolean var5, byte var6, int var7, long var8, long var10
   );
   private static native C_47tf recovery$indy$79(Object var0, long var1, int var3, long var4, long var6);
   private static native ArrayList recovery$indy$80(long var0, Object var2, int var3, int var4, int var5, int var6, long var7, long var9);
   private static native MethodHandle recovery$constant$82();
}
