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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_41Z;
import net.C_45n;
import client.render.RenderPass;
import net.C_473U;
import net.C_479E;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Fw;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47Pi;
import client.module.ModuleManager;
import client.setting.ShaderOptions;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import net.C_47WF;
import client.event.RenderListener;
import net.C_47Y_;
import net.minecraft.entity.EntityLivingBase;
import net.C_47eb;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import client.ClientGlobals;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47tf;
import net.C_47uI;
import net.C_47vi;
import net.C_47wr;
import net.C_47xz;
import net.C_47zh;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Blink_47CB extends client.module.Module implements net.C_47mz,net.C_47iC,client.event.RenderListener,net.C_47vi,net.C_47xz {
    public final client.setting.ModeSetting settingPacketDirection = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAutoDisable = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDisableOnAttack = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDisableKillAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    client.setting.SettingGroup field_47A; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingTargetESP = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingClassicColorTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLineWidthTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSmoothRendering = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions settingTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    client.setting.SettingGroup field_47; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingPlayerESP = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingClassicColorMe = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLineWidthMe = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions settingPlayer = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    public long field_478; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

   private boolean method_49O$aae029aa0a() {
      long var1 = a ^ 93280512280496L;
      long var3 = var1 ^ 69548940020915L;
      long var10002 = -8551124745182620125L;
      long var5 = var3;
      ModeSetting var7 = this.settingPlayerESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   public void method_46$e535f8442d(C_47zh var1, long var2, short var4) {
      long var9;
      long var11;
      String var13;
      label39: {
         long var7;
         label38: {
            long var5 = var2 << 16 | (long)var4 << 48 >>> 48;
            var7 = var5 ^ 136246740323142L;
            var9 = var5 ^ 115002472062334L;
            var11 = var5 ^ 13538434133415L;
            long var10000 = 1767167345752852930L;
            var13 = C_47eb.method_48$0e30dfc966();
            Minecraft var30 = field_43;
            if (var13 == null) {
               long var10001 = 1772994854804451171L;
               Minecraft var14 = field_43;
               if (var14.field_44Q == null) {
                  break label38;
               }

               var30 = field_43;
            }

            long var32 = 1773113907976773701L;
            Minecraft var15 = var30;
            if (var15.field_42P != null) {
               break label39;
            }
         }

         long var10003 = 1766561907825451245L;
         boolean var16 = false;
         long var17 = var7;
         Blink_47CB var19 = this;
         var19.method_46$b757cde368(var17, var16);
      }

      label29: {
         long var10002 = 1772477068021712878L;
         long var20 = var9;
         ModeSetting var22 = this.settingPacketDirection;
         boolean var31 = var22.method_46$5f9dc63072(var20).equals("OnlyIncoming");
         if (var13 == null) {
            if (var31) {
               break label29;
            }

            var10002 = 1772477068021712878L;
            long var23 = var9;
            ModeSetting var25 = this.settingPacketDirection;
            var31 = var25.method_46$5f9dc63072(var23).equals("Both");
         }

         if (!var31) {
            return;
         }
      }

      long var34 = 1767237485020537060L;
      boolean var26 = true;
      long var27 = var11;
      C_47zh var29 = var1;
      var29.method_47$b757cde368(var27, var26);
   }




    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$9b8d272046(C_47Pi var1, long var2) {
      augustus.recovered.modules.latency.Blink_47CB var61;
      long var4;
      long var6;
      long var8;
      long var10;
      String var17;
      label73: {
         var4 = var2 ^ 11353910223030L;
         var6 = var2 ^ 37798274050229L;
         var8 = var2 ^ 28647365199211L;
         var10 = var2 ^ 39118360861767L;
         long var12 = var2 ^ 31354608533590L;
         long var10001 = var2 ^ 96790379025173L;
         int var14 = (int)((var2 ^ 96790379025173L) >>> 48);
         int var15 = (int)((var2 ^ 96790379025173L) << 16 >>> 48);
         int var16 = (int)(var10001 << 32 >>> 32);
         long var10000 = 1855331714968766715L;
         var17 = C_47eb.method_48$0e30dfc966();
         var10001 = 1854782136885230565L;
         C_47Pi var20 = var1;
         EntityLivingBase var18 = var20.method_41$20b8cce974();
         var10001 = 1854563860339866893L;
         PacketHandler_47Cq var21 = ClientGlobals.field_48.field_489;
         boolean var60 = var21.method_45_$aae029aa0a();
         if (var17 == null) {
            if (!var60) {
               break label73;
            }

            char var10002 = (char)var14;
            char var10003 = (char)var15;
            long var10005 = 1847538008137004035L;
            int var22 = var16;
            char var23 = var10003;
            char var24 = var10002;
            EntityLivingBase var25 = var18;
            Blink_47CB var26 = this;
            var60 = var26.method_48$951bc9e716(var25, var24, var23, var22);
         }

         label74: {
            if (var17 == null) {
               if (!var60) {
                  break label73;
               }

               var61 = this;
               if (var17 != null) {
                  break label74;
               }

               long var71 = 1846980274524538184L;
               long var27 = var6;
               ModeSetting var29 = this.settingTargetESP;
               Blink_47CB var30 = this;
               var60 = var30.method_41$894f5cf30b(var29, var27);
            }

            if (!var60) {
               break label73;
            }

            var61 = this;
         }

         long var74 = 1846565506653079255L;
         long var31 = var10;
         ModeSetting var33 = this.settingTargetESP;
         boolean var10004 = var33.method_46$5f9dc63072(var31).equals("PlayerModelArmor");
         var74 = 1854926891590719851L;
         boolean var34 = var10004;
         long var35 = var12;
         EntityLivingBase var37 = var18;
         C_47Pi var38 = var1;
         Blink_47CB var39 = var61;
         var39.method_48$35a3ef6725(var38, var37, var35, var34);
      }

      long var65 = 1847063809357554044L;
      Minecraft var40 = field_43;
      if (var40.field_42P != null) {
         long var69 = 1846803654934069230L;
         long var41 = var8;
         PacketHandler_47Cq var43 = ClientGlobals.field_48.field_489;
         boolean var62 = var43.method_48$0dd78e0064(var41);
         String var66 = var17;
         if (var2 >= 0L) {
            if (var17 == null) {
               if (!var62) {
                  return;
               }

               var65 = 1847063809357554044L;
               Minecraft var44 = field_43;
               var69 = 1854782136885230565L;
               C_47Pi var45 = var1;
               var62 = var44.field_42P.equals(var45.method_41$20b8cce974());
            }

            var66 = var17;
         }

         if (var66 == null) {
            if (!var62) {
               return;
            }

            long var72 = 1846980274524538184L;
            long var46 = var6;
            ModeSetting var48 = this.settingPlayerESP;
            Blink_47CB var49 = this;
            var62 = var49.method_41$894f5cf30b(var48, var46);
         }

         if (var62) {
            var65 = 1847063809357554044L;
            Minecraft var50 = field_43;
            C_47tf var19 = var50.field_42P.method_47$b2124a4855();
            long var10006 = 1846565506653079255L;
            long var51 = var10;
            ModeSetting var53 = this.settingPlayerESP;
            boolean var73 = var53.method_46$5f9dc63072(var51).equals("PlayerModelArmor");
            long var76 = 1847371820983988325L;
            boolean var54 = var73;
            C_47tf var55 = var19;
            C_47Pi var56 = var1;
            long var57 = var4;
            Blink_47CB var59 = this;
            var59.method_43$160bd52c17(var57, var56, var55, var54);
         }
      }
   }





   public void method_41$9035875d26(long var1, C_47ob var3) {
      net.C_473U var32;
      long var6;
      String var10;
      C_473U var11;
      int var30;
      String var33;
      label70: {
         long var4 = var1 ^ 12326977869736L;
         var6 = var1 ^ 3572796985333L;
         long var8 = var1 ^ 48552975978563L;
         long var10001 = -7191663422213252939L;
         C_47ob var12 = var3;
         var11 = var12.method_46$96fcbedb66();
         long var10000 = -7190764800018723471L;
         String var29 = C_47eb.method_48$0e30dfc966();
         String var10003 = "" + this.field_43y;
         long var10004 = -7190927860538959216L;
         String var13 = var10003;
         long var14 = var4;
         Blink_47CB var16 = this;
         var16.method_47$d07b98bfef(var14, var13);
         var10 = var29;
         long var10002 = -7191311527348097578L;
         long var17 = var8;
         NumberSetting var19 = this.settingAutoDisable;
         double var38;
         var30 = (var38 = var19.method_44$474dfaa627(var17) - 0.0) == 0.0 ? 0 : (var38 < 0.0 ? -1 : 1);
         label69:
         if (var10 == null) {
            if (var30 > 0) {
               double var31 = this.field_43y;
               long var36 = -7191311527348097578L;
               long var20 = var8;
               NumberSetting var22 = this.settingAutoDisable;
               double var39;
               var30 = (var39 = var31 - var22.method_44$474dfaa627(var20)) == 0.0 ? 0 : (var39 < 0.0 ? -1 : 1);
               var33 = var10;
               if (var1 <= 0L) {
                  break label70;
               }

               if (var10 != null) {
                  break label69;
               }

               if (var30 > 0) {
                  this.field_43y = 0;
                  long var34 = -7194377341093988207L;
                  Blink_47CB var23 = this;
                  var23.method_43W$da8c82d5d4();
               }
            }

            var30 = (int) ((var11 instanceof C_479E) ? 1 : 0);
         }

         var33 = var10;
      }

      if (var1 > 0L) {
         if (var33 == null) {
            if (var30 != 0) {
               this.field_43y++;
            }

            long var35 = -7191349634187032352L;
            BooleanSetting var24 = this.settingDisableOnAttack;
            var30 = (int) ((var24.method_49$aae029aa0a()) ? 1 : 0);
         }

         var33 = var10;
      }

      label74: {
         if (var33 == null) {
            if (var30 == 0) {
               return;
            }

            var32 = var11;
            if (var10 != null) {
               break label74;
            }

            var30 = (int) ((var11 instanceof C_47WF) ? 1 : 0);
         }

         if (var30 == 0) {
            return;
         }

         var32 = var11;
      }

      if (((C_47WF)var32).method_45$75ce8b0544() == C_41Z.ATTACK) {
         long var37 = -7190156888252046242L;
         boolean var25 = false;
         long var26 = var6;
         Blink_47CB var28 = this;
         var28.method_46$b757cde368(var26, var25);
      }
   }




   private boolean method_41$894f5cf30b(ModeSetting var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 139465472440837L;
      long var10000 = -4612483055862714695L;
      String var6 = C_47eb.method_48$0e30dfc966();
      long var10002 = -4620116183063306091L;
      long var7 = var4;
      ModeSetting var9 = var1;
      boolean var14 = var9.method_46$5f9dc63072(var7).equals("PlayerModel");
      if (var6 == null) {
         if (!var14) {
            var10002 = -4620116183063306091L;
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



    private void method_41$ad0e900906(RenderPass c_471t) {
        long l;
        long l2 = l = a ^ 0x27AF7853F02DL;
        long l3 = l2 ^ 0xE55251CDEBL;
        long l4 = l2 ^ 0x705DDE1AB2A0L;
        long l5 = l2 ^ 0x40EF356D6FC3L;
        long l6 = l2 ^ 0x6B81FA769811L;
        String string = C_47eb.method_48$0e30dfc966();
        for (Object recovered$element$7175 : this.field_43h) {
         EntityLivingBase c_47aK = (EntityLivingBase) recovered$element$7175;
            boolean bl = c_47aK instanceof EntityPlayerSP;
            if (string == null) {
                if (bl) continue;
                long l7 = l4;
                NumberSetting c_47TS = this.settingLineWidthTarget;
                BooleanSetting c_47TV = this.settingSmoothRendering;
                RenderUtils.method_48$45fe1d62b8((EntityLivingBase)c_47aK, (ColorSetting)this.settingClassicColorTarget, (float)((float)c_47TS.method_44$474dfaa627(l7)), (int)255, (boolean)c_47TV.method_49$aae029aa0a());
                long l8 = l3;
                ShaderOptions c_47T2 = this.settingTarget;
                bl = c_47T2.method_49$0dd78e0064(l8);
            }
            long l9 = l6;
            ShaderOptions c_47T2 = this.settingTarget;
            C_47uI.method_40$9bd74f13d3((boolean)bl, (boolean)c_47T2.method_47$0dd78e0064(l9), (long)l5);
            if (string == null) continue;
        }
    }



   public void method_40$e781d6169a(C_47zh var1, long var2) {
      long var6;
      label20: {
         long var4 = var2 ^ 138480231952404L;
         var6 = var2 ^ 27738005618893L;
         long var10000 = 8497210838966510760L;
         String var8 = C_47eb.method_48$0e30dfc966();
         long var10002 = 8499154423560514180L;
         long var9 = var4;
         ModeSetting var11 = this.settingPacketDirection;
         boolean var19 = var11.method_46$5f9dc63072(var9).equals("OnlyOutgoing");
         if (var8 == null) {
            if (var19) {
               break label20;
            }

            var10002 = 8499154423560514180L;
            long var12 = var4;
            ModeSetting var14 = this.settingPacketDirection;
            var19 = var14.method_46$5f9dc63072(var12).equals("Both");
         }

         if (!var19) {
            return;
         }
      }

      long var10003 = 8497281269482196366L;
      boolean var15 = true;
      long var16 = var6;
      C_47zh var18 = var1;
      var18.method_47$b757cde368(var16, var15);
   }



   private static void method_40$709ea9dc54(C_47Pi var0, EntityLivingBase var1, C_47wr var2, double var3, double var5, double var7, boolean var9, RenderPass var10) {
      long var11 = a ^ 44296404693979L;
      long var13 = var11 ^ 69964254287184L;
      long var10008 = 9025015536196542932L;
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



   private void method_40$ad0e900906(RenderPass var1) {
      long var2 = a ^ 43715773599537L;
      long var4 = var2 ^ 123355644644796L;
      long var10001 = 132708277330229513L;
      Minecraft var6 = field_43;
      long var10004 = 129487681468837929L;
      long var7 = var4;
      NumberSetting var9 = this.settingLineWidthMe;
      RenderUtils.method_48$45fe1d62b8(var6.field_42P, this.settingClassicColorMe, (float)var9.method_44$474dfaa627(var7), 255, false);
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 45668711376518L;
      long var3 = var1 ^ 72698818489733L;
      long var10002 = -6313430925261965547L;
      long var5 = var3;
      ModeSetting var7 = this.settingPlayerESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   private boolean method_48$951bc9e716(Entity var1, char var2, char var3, int var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 3865118299980L;
      String var9 = recovery$indy$1(-4297188867325225703L, var5);
      Entity var10000 = var1;
      if (var9 == null) {
         if (var1 == recovery$indy$2(field_43, -4305386693800264546L, var5)) {
            return false;
         }

         var10000 = var1;
      }

      boolean var10 = recovery$indy$9(
         var10000,
         recovery$indy$3(C_47Y_.PLAYER, -4297598427116911964L, var5),
         recovery$indy$4(C_47Y_.MOB, -4297598427116911964L, var5),
         recovery$indy$5(C_47Y_.ANIMAL, -4297598427116911964L, var5),
         recovery$indy$6(C_47Y_.VILLAGER, -4297598427116911964L, var5),
         false,
         recovery$indy$7(C_47Y_.INVISIBLE, -4297598427116911964L, var5),
         false,
         false,
         var7,
         true,
         recovery$indy$8(C_47Y_.DEAD, -4297598427116911964L, var5),
         false,
         -4296881263674053147L,
         var5
      );
      return var9 != null ? var10 : var10;
   }



   public void method_48$35a3ef6725(C_47Pi var1, EntityLivingBase var2, long var3, boolean var5) {
      var3 = a ^ var3;
      long var6 = var3 ^ 14219145503779L;
      long var8 = var3 ^ 84545359660555L;
      long var10 = var3 ^ 113842658652633L;
      long var12 = var3 ^ 923848303082L;
      double var10001 = var2.field_43D.field_40 - var2.field_42g.field_40;
      long var10003 = -2947098192041938663L;
      Minecraft var21 = field_43;
      double var14 = var2.field_42g.field_40 + var10001 * var21.method_46$159e3d0645().field_49;
      var10001 = var2.field_43D.field_41 - var2.field_42g.field_41;
      var10003 = -2947098192041938663L;
      Minecraft var22 = field_43;
      double var16 = var2.field_42g.field_41 + var10001 * var22.method_46$159e3d0645().field_49;
      var10001 = var2.field_43D.field_47 - var2.field_42g.field_47;
      var10003 = -2947098192041938663L;
      Minecraft var23 = field_43;
      double var18 = var2.field_42g.field_47 + var10001 * var23.method_46$159e3d0645().field_49;
      long var10002 = -2947321605783260382L;
      long var24 = var6;
      ShaderOptions var26 = this.settingTarget;
      boolean var10000 = var26.method_49$0dd78e0064(var24);
      var10003 = -2946057683581374592L;
      long var27 = var10;
      ShaderOptions var29 = this.settingTarget;
      boolean var38 = var29.method_47$0dd78e0064(var27);
      var10003 = -2947342767196533535L;
      C_47uI.method_40$9bd74f13d3(var10000, var38, var8);
      long var39 = -2953352292937707206L;
      C_47Pi var30 = var1;
      C_47wr var20 = var30.method_43$e97f03698c();
      C_47Fw var40 = recovery$indy$10(var1, var2, var20, var14, var16, var18, var5);
      var10003 = -2954345069334078385L;
      C_47Fw var31 = var40;
      long var32 = var12;
      boolean var34 = false;
      C_47uI.method_42$300c7fd546(var34, var32, var31);
   }




   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 111336945384737L;
      long var3 = var1 ^ 16308913944098L;
      long var10000 = 8348085033495405214L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = 8342211107729878194L;
      long var6 = var3;
      ModeSetting var8 = this.settingTargetESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   public void method_43$160bd52c17(long var1, C_47Pi var3, C_47tf var4, boolean var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 28834239415491L;
      long var8 = var1 ^ 99175520118507L;
      long var10 = var1 ^ 124647848694073L;
      long var12 = var1 ^ 24192479297802L;
      long var10002 = 4033277252064023490L;
      long var15 = var6;
      ShaderOptions var17 = this.settingPlayer;
      boolean var10000 = var17.method_49$0dd78e0064(var15);
      long var10003 = 4034546809800396640L;
      long var18 = var10;
      ShaderOptions var20 = this.settingPlayer;
      boolean var10001 = var20.method_47$0dd78e0064(var18);
      var10003 = 4033247835941760001L;
      C_47uI.method_40$9bd74f13d3(var10000, var10001, var8);
      long var27 = 4027206989185036762L;
      C_47Pi var21 = var3;
      C_47wr var14 = var21.method_43$e97f03698c();
      C_47Fw var28 = recovery$indy$11(var3, var14, var4, var5);
      var10003 = 4026244559165897903L;
      C_47Fw var22 = var28;
      long var23 = var12;
      boolean var25 = false;
      C_47uI.method_42$300c7fd546(var25, var23, var22);
   }



   public void onRender3D(long var1, float var3) {
      label75: {
         long var4;
         long var6;
         long var8;
         long var10;
         long var12;
         long var14;
         String var16;
         boolean var52;
         String var55;
         label72: {
            var4 = var1 ^ 54686117440567L;
            var6 = var1 ^ 75862687826910L;
            var8 = var1 ^ 5451650687478L;
            var10 = var1 ^ 52344924935716L;
            var12 = var1 ^ 8944581653787L;
            var14 = var1 ^ 80017760765463L;
            long var10000 = 8134448620249719207L;
            var16 = C_47eb.method_48$0e30dfc966();
            RenderUtils.method_42$da8c82d5d4();
            long var10001 = 8133667709910635601L;
            PacketHandler_47Cq var17 = ClientGlobals.field_48.field_489;
            var52 = var17.method_45_$aae029aa0a();
            label71:
            if (var16 == null) {
               if (!var52) {
                  long var10002 = 8141665431298545330L;
                  long var18 = var4;
                  PacketHandler_47Cq var20 = ClientGlobals.field_48.field_489;
                  var52 = var20.method_48$0dd78e0064(var18);
                  var55 = var16;
                  if (var1 <= 0L) {
                     break label72;
                  }

                  if (var16 != null) {
                     break label71;
                  }

                  if (!var52) {
                     break label75;
                  }
               }

               long var61 = 8141516616175693707L;
               long var21 = var12;
               ModeSetting var23 = this.settingTargetESP;
               var52 = var23.method_46$5f9dc63072(var21).equals(recovery$indy$12(2915, 898340899621628116L ^ var1));
            }

            var55 = var16;
         }

         label59: {
            label58:
            if (var55 == null) {
               if (var52) {
                  long var56 = 8133667709910635601L;
                  PacketHandler_47Cq var24 = ClientGlobals.field_48.field_489;
                  var52 = var24.method_45_$aae029aa0a();
                  var55 = var16;
                  if (var1 <= 0L) {
                     break label59;
                  }

                  if (var16 != null) {
                     break label58;
                  }

                  if (var52) {
                     long var62 = 8134708796252935391L;
                     long var25 = var6;
                     ShaderOptions var27 = this.settingTarget;
                     var52 = var27.method_49$0dd78e0064(var25);
                     long var10003 = 8133721056012716157L;
                     long var28 = var10;
                     ShaderOptions var30 = this.settingTarget;
                     boolean var58 = var30.method_47$0dd78e0064(var28);
                     var10003 = 8135092263928572700L;
                     C_47uI.method_40$9bd74f13d3(var52, var58, var8);
                     C_47Fw var63 = recovery$indy$13(this);
                     var10003 = 8141741622296116146L;
                     C_47Fw var31 = var63;
                     long var32 = var14;
                     boolean var34 = false;
                     C_47uI.method_42$300c7fd546(var34, var32, var31);
                  }
               }

               long var64 = 8141665431298545330L;
               long var35 = var4;
               PacketHandler_47Cq var37 = ClientGlobals.field_48.field_489;
               var52 = var37.method_48$0dd78e0064(var35);
            }

            var55 = var16;
         }

         if (var55 == null) {
            if (!var52) {
               break label75;
            }

            long var65 = 8141516616175693707L;
            long var38 = var12;
            ModeSetting var40 = this.settingPlayerESP;
            var52 = var40.method_46$5f9dc63072(var38).equals(recovery$indy$14(2915, 898340899621628116L ^ var1));
         }

         if (var52) {
            long var59 = 8142012310909667360L;
            Minecraft var41 = field_43;
            if (var41.field_42P != null) {
               long var66 = 8134708796252935391L;
               long var42 = var6;
               ShaderOptions var44 = this.settingPlayer;
               var52 = var44.method_49$0dd78e0064(var42);
               long var70 = 8133721056012716157L;
               long var45 = var10;
               ShaderOptions var47 = this.settingPlayer;
               boolean var60 = var47.method_47$0dd78e0064(var45);
               var70 = 8135092263928572700L;
               C_47uI.method_40$9bd74f13d3(var52, var60, var8);
               C_47Fw var67 = recovery$indy$15(this);
               var70 = 8141741622296116146L;
               C_47Fw var48 = var67;
               long var49 = var14;
               boolean var51 = false;
               C_47uI.method_42$300c7fd546(var51, var49, var48);
            }
         }
      }

      RenderUtils.method_43$da8c82d5d4();
   }





   private static void method_43$949b423eca(C_47Pi var0, C_47wr var1, C_47tf var2, boolean var3, RenderPass var4) {
      long var5 = a ^ 7720744830690L;
      long var7 = var5 ^ 18614349570153L;
      long var10002 = -4034000692054232870L;
      Minecraft var9 = field_43;
      long var10008 = -4033425793335438099L;
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



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$16(this, 25, var3, -7101171674638091414L, var1);
      recovery$indy$17(this, 26, var3, -7101171674638091414L, var1);
      recovery$indy$18(this, 32, var3, -7101171674638091414L, var1);
      recovery$indy$19(this, 31, var3, -7101171674638091414L, var1);
      recovery$indy$20(this, 40, var3, -7101171674638091414L, var1);
   }



   private boolean method_49P$aae029aa0a() {
      long var1 = a ^ 132280572809433L;
      long var3 = var1 ^ 21824483908570L;
      long var10000 = -7051996997621493914L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = -7044366756653612726L;
      long var6 = var3;
      ModeSetting var8 = this.settingTargetESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 36285018133730L;
      int var6 = (int)((var4 ^ 36285018133730L) >>> 48);
      int var7 = (int)((var4 ^ 36285018133730L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      this.field_43h.clear();
      String var10000 = recovery$indy$21(2182010902517108492L, var4);
      Iterator var10 = recovery$indy$22(field_43, 2185586542037035437L, var4).field_44Q.iterator();
      String var9 = var10000;

      while (var10.hasNext()) {
         Entity var11 = (Entity)var10.next();
         if (var9 == null && recovery$indy$23(this, var11, (char)var6, (char)var7, var8, 2185581726367806452L, var4)) {
            this.field_43h.add((EntityLivingBase)var11);
         }

         if (var9 != null) {
            break;
         }
      }
   }



   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 127623865670341L;
      long var5 = var1 ^ 30124246953932L;
      String var7 = recovery$indy$24(-7739921527347526190L, var1);
      this.field_43y = 0;
      if (var7 == null) {
         label36: {
            ModuleManager var10000 = recovery$indy$26(recovery$indy$25(-7739764515966419313L, var1), -7743281049596893339L, var1);
            if (var1 >= 0L) {
               if (var10000 == null) {
                  break label36;
               }

               var10000 = ClientGlobals.field_48;
            }

            boolean var8 = recovery$indy$27(var10000.field_412, var3, -7743786666938741695L, var1);
            if (var7 == null) {
               if (!var8) {
                  break label36;
               }

               var8 = recovery$indy$28(ClientGlobals.field_48.field_412.settingBlink, -7741632267865784253L, var1);
            }

            if (var8) {
               recovery$indy$29(var5, System.currentTimeMillis() - this.field_478 + " ", -7739819195760526491L, var1);
            }
         }

         this.field_43h.clear();
      }
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43y = 0;
      this.field_478 = System.currentTimeMillis();
   }



   private boolean method_49M$aae029aa0a() {
      long var1 = a ^ 23824617182900L;
      long var3 = var1 ^ 138798474845623L;
      long var10002 = 1751913603994404647L;
      long var5 = var3;
      ModeSetting var7 = this.settingTargetESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   private boolean method_49u$aae029aa0a() {
      long var1 = a ^ 21142815904925L;
      long var3 = var1 ^ 132684996796318L;
      long var10000 = 1902257798874647330L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = 1907567692367447310L;
      long var6 = var3;
      ModeSetting var8 = this.settingTargetESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_499$aae029aa0a() {
      long var1 = a ^ 113453034875917L;
      long var3 = var1 ^ 13987765184270L;
      long var10002 = -6707690943169069666L;
      long var5 = var3;
      ModeSetting var7 = this.settingTargetESP;
      return var7.method_46$5f9dc63072(var5).equals("Classic");
   }



   private boolean method_492$aae029aa0a() {
      long var1 = a ^ 4160953524169L;
      long var3 = var1 ^ 114758778475722L;
      long var10000 = 1239120543865880694L;
      String var5 = C_47eb.method_48$0e30dfc966();
      long var10002 = 1237674368578014810L;
      long var6 = var3;
      ModeSetting var8 = this.settingPlayerESP;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



    public Blink_47CB(long a0) {
        super((java.lang.String) ("Blink"),(java.lang.String) ("Laag"),(long) (((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 31152916782383L)),(java.awt.Color) (new java.awt.Color((int) (75),(int) (5),(int) (161))),(client.module.Category) (client.module.Category.LATENCY));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.latency.Blink_47CB.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 110639531168777L);
        int constructorPart4 = (int) ((((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 102760859140744L) >>> 32));
        int constructorPart5 = (int) (((((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 102760859140744L) << 32) >>> 48));
        int constructorPart6 = (int) (((((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 102760859140744L) << 48) >>> 48));
        long constructorKey7 = ((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 62333832384698L);
        long constructorKey8 = ((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 4920025519167L);
        long constructorKey9 = ((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 113082583245633L);
        long constructorKey10 = ((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 120335742468404L);
        long constructorKey11 = ((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 12753434937227L);
        int constructorPart12 = (int) ((((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 30081960853445L) >>> 48));
        int constructorPart13 = (int) (((((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 30081960853445L) << 16) >>> 48));
        int constructorPart14 = (int) (((((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 30081960853445L) << 32) >>> 32));
        long constructorKey15 = ((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 96625152306658L);
        int constructorPart16 = (int) ((((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 84626246472257L) >>> 32));
        int constructorPart17 = (int) (((((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 84626246472257L) << 32) >>> 40));
        int constructorPart18 = (int) (((((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 84626246472257L) << 56) >>> 56));
        long constructorKey19 = ((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 81737935732398L);
        long constructorKey20 = ((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 133202176255314L);
        long constructorKey21 = ((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 70548771258035L);
        long constructorKey22 = ((augustus.recovered.modules.latency.Blink_47CB.a ^ a0) ^ 99675609785733L);
        java.lang.Object initialValue23 = recovery$indy$flow$384(3);
        ((java.lang.Object[]) initialValue23)[0] = "OnlyIncoming";
        ((java.lang.Object[]) initialValue23)[1] = "OnlyOutgoing";
        ((java.lang.Object[]) initialValue23)[2] = "Both";
        client.setting.ModeSetting initialized24 = new client.setting.ModeSetting(this, "PacketDirection", constructorKey15, "OnlyOutgoing", (java.lang.String[]) (initialValue23));
        recovery$indy$flow$386(this, initialized24);
        client.setting.NumberSetting initialized25 = new client.setting.NumberSetting(this, "AutoDisable", 0.0D, constructorKey21, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0);
        recovery$indy$flow$389(this, initialized25);
        client.setting.BooleanSetting initialized26 = new client.setting.BooleanSetting(this, constructorKey10, "DisableOnAttack", false);
        recovery$indy$flow$392(this, initialized26);
        client.setting.BooleanSetting initialized27 = new client.setting.BooleanSetting(this, constructorKey10, "DisableKillAura", false);
        recovery$indy$flow$395(this, initialized27);
        client.setting.SettingGroup initialized28 = new client.setting.SettingGroup(this, "TargetESPs", constructorKey8);
        recovery$indy$flow$398(this, initialized28);
        java.lang.Object initialValue29 = recovery$indy$flow$400(4);
        ((java.lang.Object[]) initialValue29)[0] = "None";
        ((java.lang.Object[]) initialValue29)[1] = "Classic";
        ((java.lang.Object[]) initialValue29)[2] = "PlayerModel";
        ((java.lang.Object[]) initialValue29)[3] = "PlayerModelArmor";
        java.lang.Object initialValue30 = ((java.lang.Object)(((augustus.recovered.modules.latency.Blink_47CB) (((java.lang.Object)(this)))).field_47A));
        client.setting.ModeSetting initialized31 = new client.setting.ModeSetting(this, "TargetESP", "Classic", (java.lang.String[]) (initialValue29), (client.setting.SettingGroup) (initialValue30), constructorKey11);
        recovery$indy$flow$403(this, initialized31);
        java.awt.Color initialized32 = new java.awt.Color(0, 255, 0, 0);
        java.lang.Object initialValue33 = ((java.lang.Object)(((augustus.recovered.modules.latency.Blink_47CB) (((java.lang.Object)(this)))).field_47A));
        client.setting.ColorSetting initialized34 = new client.setting.ColorSetting(this, "ClassicColorTarget", constructorKey7, initialized32, (client.setting.SettingGroup) (initialValue33));
        long initialValue35 = constructorKey9;
        java.lang.String initialValue36 = "ClassicColor";
        client.setting.ColorSetting initialValue37 = initialized34;
        java.lang.Object initialValue38 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue39 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue40 = recovery$indy$flow$411(initialValue38, initialValue39, initialValue35);
        java.lang.Object initialValue41 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue42 = recovery$indy$flow$413(this);
        java.lang.Object initialValue43 = initialValue42;
        long initialValue44 = constructorKey3;
        java.lang.Object initialValue45 = initialValue41;
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue47 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue43))))));
        java.lang.Object initialValue48 = recovery$indy$flow$416(initialValue46, initialValue44, initialValue47);
        java.lang.Object initialValue49 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue48))))));
        recovery$indy$flow$418(this, initialValue49);
        java.lang.Object initialValue50 = ((java.lang.Object)(((augustus.recovered.modules.latency.Blink_47CB) (((java.lang.Object)(this)))).field_47A));
        client.setting.NumberSetting initialized51 = new client.setting.NumberSetting(this, "LineWidthTarget", Double.longBitsToDouble(4613937818241073152L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue50), constructorKey22);
        short converted52 = (short) (constructorPart6);
        int initialValue53 = (int) (converted52);
        int initialValue54 = constructorPart5;
        java.lang.String initialValue55 = "LineWidth";
        int initialValue56 = constructorPart4;
        client.setting.NumberSetting initialValue57 = initialized51;
        java.lang.Object initialValue58 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue59 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue55))))));
        java.lang.Object initialValue60 = recovery$indy$flow$424(initialValue58, initialValue56, initialValue59, initialValue54, (short) (initialValue53));
        java.lang.Object initialValue61 = recovery$indy$flow$425(this);
        java.lang.Object initialValue62 = initialValue61;
        java.lang.Object initialValue63 = initialValue60;
        java.lang.Object initialValue64 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue63))))));
        java.lang.Object initialValue65 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue62))))));
        java.lang.Object initialValue66 = recovery$indy$flow$428(initialValue64, initialValue65);
        recovery$indy$flow$429(this, initialValue66);
        short converted67 = (short) (constructorPart12);
        char converted68 = (char) (constructorPart13);
        java.lang.Object initialValue69 = ((java.lang.Object)(((augustus.recovered.modules.latency.Blink_47CB) (((java.lang.Object)(this)))).field_47A));
        client.setting.BooleanSetting initialized70 = new client.setting.BooleanSetting(this, "SmoothRendering", converted67, converted68, constructorPart14, false, (client.setting.SettingGroup) (initialValue69));
        java.lang.Object initialValue71 = recovery$indy$flow$433(this);
        java.lang.Object initialValue72 = initialValue71;
        long initialValue73 = constructorKey3;
        client.setting.BooleanSetting initialValue74 = initialized70;
        java.lang.Object initialValue75 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue76 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue72))))));
        java.lang.Object initialValue77 = recovery$indy$flow$436(initialValue75, initialValue73, initialValue76);
        java.lang.Object initialValue78 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue77))))));
        recovery$indy$flow$438(this, initialValue78);
        java.lang.Object initialValue79 = ((java.lang.Object)(((augustus.recovered.modules.latency.Blink_47CB) (((java.lang.Object)(this)))).field_47A));
        byte converted80 = (byte) (constructorPart18);
        client.setting.ShaderOptions initialized81 = new client.setting.ShaderOptions(constructorPart16, constructorPart17, this, "Target", converted80, (client.setting.SettingGroup) (initialValue79));
        java.lang.Object initialValue82 = recovery$indy$flow$442(this);
        java.lang.Object initialValue83 = initialValue82;
        long initialValue84 = constructorKey3;
        client.setting.ShaderOptions initialValue85 = initialized81;
        java.lang.Object initialValue86 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue85))))));
        java.lang.Object initialValue87 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue83))))));
        java.lang.Object initialValue88 = recovery$indy$flow$445(initialValue86, initialValue84, initialValue87);
        java.lang.Object initialValue89 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue88))))));
        long initialValue90 = constructorKey20;
        java.lang.Object initialValue91 = initialValue89;
        java.lang.Object initialValue92 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue91))))));
        java.lang.Object initialValue93 = recovery$indy$flow$448(initialValue92, initialValue90);
        recovery$indy$flow$449(this, initialValue93);
        java.lang.Object initialValue94 = recovery$indy$flow$451();
        java.lang.Object initialValue95 = ((java.lang.Object)(((augustus.recovered.modules.latency.Blink_47CB) (((java.lang.Object)(this)))).field_47A));
        client.setting.MultiSelectSetting initialized96 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey19, (net.C_47OZ[]) (initialValue94), (client.setting.SettingGroup) (initialValue95));
        java.lang.Object initialValue97 = recovery$indy$flow$454(this);
        java.lang.Object initialValue98 = initialValue97;
        client.setting.MultiSelectSetting initialValue99 = initialized96;
        java.lang.Object initialValue100 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue99))))));
        java.lang.Object initialValue101 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue98))))));
        java.lang.Object initialValue102 = recovery$indy$flow$457(initialValue100, initialValue101);
        recovery$indy$flow$458(this, initialValue102);
        client.setting.SettingGroup initialized103 = new client.setting.SettingGroup(this, "PlayerESPs", constructorKey8);
        recovery$indy$flow$461(this, initialized103);
        java.lang.Object initialValue104 = recovery$indy$flow$463(4);
        ((java.lang.Object[]) initialValue104)[0] = "None";
        ((java.lang.Object[]) initialValue104)[1] = "Classic";
        ((java.lang.Object[]) initialValue104)[2] = "PlayerModel";
        ((java.lang.Object[]) initialValue104)[3] = "PlayerModelArmor";
        java.lang.Object initialValue105 = ((java.lang.Object)(((augustus.recovered.modules.latency.Blink_47CB) (((java.lang.Object)(this)))).field_47));
        client.setting.ModeSetting initialized106 = new client.setting.ModeSetting(this, "PlayerESP", "Classic", (java.lang.String[]) (initialValue104), (client.setting.SettingGroup) (initialValue105), constructorKey11);
        recovery$indy$flow$466(this, initialized106);
        java.awt.Color initialized107 = new java.awt.Color(0, 255, 0, 0);
        java.lang.Object initialValue108 = ((java.lang.Object)(((augustus.recovered.modules.latency.Blink_47CB) (((java.lang.Object)(this)))).field_47));
        client.setting.ColorSetting initialized109 = new client.setting.ColorSetting(this, "ClassicColorMe", constructorKey7, initialized107, (client.setting.SettingGroup) (initialValue108));
        long initialValue110 = constructorKey9;
        java.lang.String initialValue111 = "ClassicColor";
        client.setting.ColorSetting initialValue112 = initialized109;
        java.lang.Object initialValue113 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue112))))));
        java.lang.Object initialValue114 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue111))))));
        java.lang.Object initialValue115 = recovery$indy$flow$474(initialValue113, initialValue114, initialValue110);
        java.lang.Object initialValue116 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue115))))));
        java.lang.Object initialValue117 = recovery$indy$flow$476(this);
        java.lang.Object initialValue118 = initialValue117;
        long initialValue119 = constructorKey3;
        java.lang.Object initialValue120 = initialValue116;
        java.lang.Object initialValue121 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue120))))));
        java.lang.Object initialValue122 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue118))))));
        java.lang.Object initialValue123 = recovery$indy$flow$479(initialValue121, initialValue119, initialValue122);
        java.lang.Object initialValue124 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue123))))));
        recovery$indy$flow$481(this, initialValue124);
        java.lang.Object initialValue125 = ((java.lang.Object)(((augustus.recovered.modules.latency.Blink_47CB) (((java.lang.Object)(this)))).field_47));
        client.setting.NumberSetting initialized126 = new client.setting.NumberSetting(this, "LineWidthMe", Double.longBitsToDouble(4613937818241073152L), 0.0D, Double.longBitsToDouble(4621819117588971520L), 0, (client.setting.SettingGroup) (initialValue125), constructorKey22);
        short converted127 = (short) (constructorPart6);
        int initialValue128 = (int) (converted127);
        int initialValue129 = constructorPart5;
        java.lang.String initialValue130 = "LineWidth";
        int initialValue131 = constructorPart4;
        client.setting.NumberSetting initialValue132 = initialized126;
        java.lang.Object initialValue133 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue132))))));
        java.lang.Object initialValue134 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue130))))));
        java.lang.Object initialValue135 = recovery$indy$flow$487(initialValue133, initialValue131, initialValue134, initialValue129, (short) (initialValue128));
        java.lang.Object initialValue136 = recovery$indy$flow$488(this);
        java.lang.Object initialValue137 = initialValue136;
        java.lang.Object initialValue138 = initialValue135;
        java.lang.Object initialValue139 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue138))))));
        java.lang.Object initialValue140 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue137))))));
        java.lang.Object initialValue141 = recovery$indy$flow$491(initialValue139, initialValue140);
        recovery$indy$flow$492(this, initialValue141);
        java.lang.Object initialValue142 = ((java.lang.Object)(((augustus.recovered.modules.latency.Blink_47CB) (((java.lang.Object)(this)))).field_47));
        byte converted143 = (byte) (constructorPart18);
        client.setting.ShaderOptions initialized144 = new client.setting.ShaderOptions(constructorPart16, constructorPart17, this, "Player", converted143, (client.setting.SettingGroup) (initialValue142));
        java.lang.Object initialValue145 = recovery$indy$flow$496(this);
        java.lang.Object initialValue146 = initialValue145;
        long initialValue147 = constructorKey3;
        client.setting.ShaderOptions initialValue148 = initialized144;
        java.lang.Object initialValue149 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue148))))));
        java.lang.Object initialValue150 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue146))))));
        java.lang.Object initialValue151 = recovery$indy$flow$499(initialValue149, initialValue147, initialValue150);
        java.lang.Object initialValue152 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue151))))));
        long initialValue153 = constructorKey20;
        java.lang.Object initialValue154 = initialValue152;
        java.lang.Object initialValue155 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue154))))));
        java.lang.Object initialValue156 = recovery$indy$flow$502(initialValue155, initialValue153);
        recovery$indy$flow$503(this, initialValue156);
        java.util.ArrayList initialized157 = new java.util.ArrayList();
        recovery$indy$flow$506(this, initialized157);
        recovery$indy$flow$507(this, 0);
        recovery$indy$flow$508(this, 0L);
    }







    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$384(int a0);
    private static native void recovery$indy$flow$386(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$389(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$392(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$395(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$398(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.Blink_47CB) (a0)).field_47A = ((client.setting.SettingGroup) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$400(int a0);

    private static native void recovery$indy$flow$403(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$411(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$413(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$416(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$418(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$424(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$425(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$428(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$429(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$433(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$436(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$438(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$442(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$445(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$448(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$449(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$451();

    private static native java.lang.Object recovery$indy$flow$454(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$457(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$458(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$461(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.Blink_47CB) (a0)).field_47 = ((client.setting.SettingGroup) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$463(int a0);

    private static native void recovery$indy$flow$466(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$474(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$476(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$479(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$481(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$487(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$488(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$491(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$492(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$496(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$499(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$502(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$503(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$506(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$507(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.Blink_47CB) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$508(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.latency.Blink_47CB) (a0)).field_478 = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);
   private static native boolean recovery$indy$3(Object var0, long var1, long var3);
   private static native boolean recovery$indy$4(Object var0, long var1, long var3);
   private static native boolean recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3);
   private static native boolean recovery$indy$8(Object var0, long var1, long var3);
   private static native boolean recovery$indy$9(
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
   private static native C_47Fw recovery$indy$10(C_47Pi var0, EntityLivingBase var1, C_47wr var2, double var3, double var5, double var7, boolean var9);
   private static native C_47Fw recovery$indy$11(C_47Pi var0, C_47wr var1, C_47tf var2, boolean var3);
   private static native String recovery$indy$12(int var0, long var1);
   private static native C_47Fw recovery$indy$13(Blink_47CB var0);
   private static native String recovery$indy$14(int var0, long var1);
   private static native C_47Fw recovery$indy$15(Blink_47CB var0);
   private static native void recovery$indy$16(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$18(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$19(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$20(Object var0, int var1, long var2, long var4, long var6);
   private static native String recovery$indy$21(long var0, long var2);
   private static native WorldClient recovery$indy$22(Object var0, long var1, long var3);
   private static native boolean recovery$indy$23(Object var0, Object var1, char var2, char var3, int var4, long var5, long var7);
   private static native String recovery$indy$24(long var0, long var2);
   private static native Client recovery$indy$25(long var0, long var2);
   private static native ModuleManager recovery$indy$26(Object var0, long var1, long var3);
   private static native boolean recovery$indy$27(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$28(Object var0, long var1, long var3);
   private static native void recovery$indy$29(long var0, Object var2, long var3, long var5);
   private static native MethodHandle recovery$constant$38();
}
