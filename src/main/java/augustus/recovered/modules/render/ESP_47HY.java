package augustus.recovered.modules.render;
import augustus.recovered.modules.misc.MurdererFinder_47kg;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
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
import net.C_40X;
import net.C_44b;
import net.C_45n;
import client.render.RenderPass;
import net.C_477A;
import net.minecraft.client.gui.ScaledResolution;
import net.C_478i;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47Fw;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TX;
import client.setting.Setting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.C_47b0;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import client.render.RenderUtils;
import net.C_47sk;
import client.module.Category;
import net.C_47tP;
import net.C_47tf;
import net.C_47uI;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ESP_47HY extends client.module.Module implements client.event.RenderListener,net.C_47xz {
    private final client.setting.MultiSelectSetting settingModes = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingMarkMurderer = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCustomMurdererAlpha = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMurdererAlpha = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingBox = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingTeamColorBox = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingBoxColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingBoxHitColorBool = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingBoxHitColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingBoxLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingBoxPriority = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions settingBox2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingHitBox = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingHitBoxTeamColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingHitBoxColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingHitBoxHitColorBool = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingHitBoxHitColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingHitBoxLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingHitBoxPriority = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions settingHitBox2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingCollisionBox = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCollisionBoxTeamColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingCollisionBoxColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCollisionBoxHitColorBool = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingCollisionBoxHitColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingCollisionBoxLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingCollisionBoxPriority = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions settingCollisionBox2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup setting3DCorner = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFakeCornerTeamColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingFakeCornerColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFakeCornerHitColorBool = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingFakeCornerHitColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingFakeCornerPriority = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions settingFakeCorner = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingReal2D = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingReal2DTeamColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingReal2DColor1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingReal2DColor2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingReal2DHitColorBool = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingReal2DHitColor1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingReal2DHitColor2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingReal2DPriority = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions settingReal2D2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingCorner = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCornerTeamColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingCornerColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCornerHitColorBool = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingCornerHitColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingLineWidthCorner = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingHorizontalPercentage = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingVerticalPercentage = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingCornerPriority = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions settingCorner2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingVanilla = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingVanillaTeamColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingVanillaColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingVanillaHitColorBool = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingVanillaHitColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.MultiSelectSetting settingEntities = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMaximumRenderDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final java.util.HashMap field_470 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47b0 field_47J = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap field_47F = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap field_47c = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] field_47p; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

   private int method_46$8996e1134f(EntityLivingBase var1, int var2, ColorSetting var3, ColorSetting var4, int var5, boolean var6, boolean var7, byte var8, int var9) {
      long var10 = ((long)var5 << 32 | (long)var8 << 56 >>> 32 | (long)var9 << 40 >>> 40) ^ a;
      long var12 = var10 ^ 50145184956492L;
      return recovery$indy$1(this, var1, var2, var3, var4, var12, var6, var7, true, -7761140306092050085L, var10);
   }



   private void method_46$ad0e900906(RenderPass var1) {
      long var2 = a ^ 88053589471530L;
      long var4 = var2 ^ 121502668982085L;
      long var10001 = var2 ^ 54265910158710L;
      int var6 = (int)((var2 ^ 54265910158710L) >>> 32);
      int var7 = (int)((var2 ^ 54265910158710L) << 32 >>> 56);
      int var8 = (int)(var10001 << 40 >>> 40);
      int var10 = 0;
      long var10000 = -4419078463365993881L;
      int[] var32 = AntiStrike_47Qa.method_42$d4d28024c9();
      Iterator var11 = this.field_43h.iterator();
      int[] var9 = var32;

      while (var11.hasNext()) {
         EntityLivingBase var12 = (EntityLivingBase)var11.next();
         ColorSetting var10003 = this.settingFakeCornerColor;
         ColorSetting var10004 = this.settingFakeCornerHitColor;
         long var10006 = -4418850557482228639L;
         BooleanSetting var14 = this.settingFakeCornerHitColorBool;
         boolean var33 = var14.method_49$aae029aa0a();
         long var10008 = -4418850557482228639L;
         BooleanSetting var15 = this.settingFakeCornerTeamColor;
         boolean var10007 = var15.method_49$aae029aa0a();
         byte var35 = (byte)var7;
         long var10010 = -4417998259655694291L;
         int var16 = var8;
         byte var17 = var35;
         boolean var18 = var10007;
         boolean var19 = var33;
         int var20 = var6;
         ColorSetting var21 = var10004;
         ColorSetting var22 = var10003;
         int var23 = var10;
         EntityLivingBase var24 = var12;
         ESP_47HY var25 = this;
         int var13 = var25.method_46$8996e1134f(var24, var23, var22, var21, var20, var19, var18, var17, var16);
         var10006 = -4418200368895545427L;
         int var26 = var10;
         int var27 = var13;
         RenderPass var28 = var1;
         long var29 = var4;
         ShaderOptions var31 = this.settingFakeCorner;
         RenderUtils.method_42$8895a6b654(var12, var31.method_42$f6a9c2ec55(var29, var28, var27, var26));
         var10++;
         if (var9 != null) {
            break;
         }
      }
   }




   private void method_46$da8c82d5d4() {
      long var1 = a ^ 4090497423752L;
      long var3 = var1 ^ 101295071254834L;
      long var5 = var1 ^ 30971000912666L;
      long var7 = var1 ^ 60766012705992L;
      long var9 = var1 ^ 88068942388475L;
      long var10001 = 7643026915246438183L;
      C_47tP var11 = C_47tP.REAL_2D;
      if (var11.method_43$aae029aa0a()) {
         var10001 = 7644404810244194583L;
         Minecraft var12 = field_43;
         if (var12.field_44Q != null) {
            long var10002 = 7643574914792254630L;
            long var13 = var3;
            ShaderOptions var15 = this.settingReal2D2;
            boolean var10000 = var15.method_49$0dd78e0064(var13);
            long var10003 = 7644615080035578954L;
            long var16 = var7;
            ShaderOptions var18 = this.settingReal2D2;
            boolean var24 = var18.method_47$0dd78e0064(var16);
            var10003 = 7642136731756112034L;
            C_47uI.method_40$9bd74f13d3(var10000, var24, var5);
            C_47Fw var25 = recovery$indy$2(this);
            var10003 = 7643915474574360146L;
            C_47Fw var19 = var25;
            long var20 = var9;
            boolean var22 = false;
            C_47uI.method_42$300c7fd546(var22, var20, var19);
         }
      }
   }



    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

   public static void method_42$05a886777b(String[] var0) {
      field_47p = var0;
   }



   private int method_42$a6044fe3e9(EntityLivingBase var1, int var2, ColorSetting var3, ColorSetting var4, long var5, boolean var7, boolean var8, boolean var9) {
      int var81;
      long var12;
      long var19;
      long var24;
      int[] var26;
      int var27;
      label111: {
         long var10;
         int var14;
         int var15;
         int var16;
         long var17;
         int var21;
         int var22;
         int var23;
         int var61;
         int[] var66;
         label107: {
            var5 = a ^ var5;
            var10 = var5 ^ 1167686448927L;
            var12 = var5 ^ 61520016413515L;
            long var10001 = var5 ^ 54254354362656L;
            var14 = (int)((var5 ^ 54254354362656L) >>> 48);
            var15 = (int)((var5 ^ 54254354362656L) << 16 >>> 48);
            var16 = (int)(var10001 << 32 >>> 32);
            var17 = var5 ^ 39750473684092L;
            var19 = var5 ^ 74963391085921L;
            long var65 = var5 ^ 7963797345545L;
            var21 = (int)((var5 ^ 7963797345545L) >>> 32);
            var22 = (int)((var5 ^ 7963797345545L) << 32 >>> 48);
            var23 = (int)(var65 << 48 >>> 48);
            var24 = var5 ^ 126133861827274L;
            long var10000 = 7464253816903176029L;
            var26 = AntiStrike_47Qa.method_42$d4d28024c9();
            var61 = (int) ((var7) ? 1 : 0);
            label106:
            if (var26 == null) {
               label104: {
                  if ((var7 ? 1 : 0) != 0) {
                     var61 = var1.field_432;
                     var66 = var26;
                     if (var5 <= 0L) {
                        break label107;
                     }

                     if (var26 != null) {
                        break label106;
                     }

                     if (var1.field_432 > 0) {
                        short var10002 = (short)var22;
                        char var10003 = (char)var23;
                        long var10005 = 7460391508278378644L;
                        int var28 = var2;
                        char var29 = var10003;
                        short var30 = var10002;
                        int var31 = var21;
                        ColorSetting var32 = var4;
                        var27 = var32.method_47$24af287d8f(var31, var30, var29, var28);
                        if (var5 <= 0L) {
                           break label104;
                        }

                        if (var26 == null) {
                           break label111;
                        }
                     }
                  }

                  short var71 = (short)var22;
                  char var75 = (char)var23;
                  long var83 = 7460391508278378644L;
                  byte var33 = 0;
                  char var34 = var75;
                  short var35 = var71;
                  int var36 = var21;
                  ColorSetting var37 = var3;
                  var37.method_47$24af287d8f(var36, var35, var34, var33);
               }

               var61 = (int) ((var8) ? 1 : 0);
            }

            var66 = var26;
         }

         label89:
         if (var66 == null) {
            if (var61 != 0) {
               var61 = (int) ((var1 instanceof EntityPlayer) ? 1 : 0);
               if (var26 != null) {
                  break label89;
               }

               if (var61 != 0) {
                  EntityPlayer var67 = (EntityPlayer)var1;
                  long var72 = 7460954418965460440L;
                  EntityPlayer var38 = var67;
                  long var39 = var17;
                  var61 = C_47TX.method_42$946347ffd5(var39, var38);
                  char var73 = (char)var14;
                  char var76 = (char)var15;
                  long var84 = 7460247371385293143L;
                  int var41 = var16;
                  char var42 = var76;
                  char var43 = var73;
                  ColorSetting var44 = var3;
                  int var68 = var44.method_49$056bba07dc(var43, var42, var41);
                  long var77 = 7463751196311250412L;
                  var27 = C_47TX.method_45$75dd719903(var61, var68, var10);
                  if (var26 == null) {
                     break label111;
                  }
               }
            }

            short var74 = (short)var22;
            char var78 = (char)var23;
            long var85 = 7460391508278378644L;
            int var45 = var2;
            char var46 = var78;
            short var47 = var74;
            int var48 = var21;
            ColorSetting var49 = var3;
            var61 = var49.method_47$24af287d8f(var48, var47, var46, var45);
         }

         var27 = var61;
      }

      int var63 = (int) ((var9) ? 1 : 0);
      if (var26 == null) {
         if ((var9 ? 1 : 0) != 0) {
            long var69 = 7464445996661965147L;
            BooleanSetting var50 = this.settingMarkMurderer;
            byte var87 = (byte) ((var50.method_49$aae029aa0a()) ? 1 : 0);
            if (var26 != null) {
               return var87;
            }

            if (var87 != 0) {
               MurdererFinder_47kg var64 = ClientGlobals.field_48.field_46M;
               String var70 = var1.method_41$0e30dfc966();
               long var79 = 7460996439808937512L;
               long var51 = var12;
               String var53 = var70;
               MurdererFinder_47kg var54 = var64;
               var87 = (byte) ((var54.method_48$228bb405f3(var53, var51)) ? 1 : 0);
               if (var26 != null) {
                  return var87;
               }

               if (var87 != 0) {
                  label71: {
                     long var10004 = 7464445996661965147L;
                     BooleanSetting var55 = this.settingCustomMurdererAlpha;
                     int var80 = (int) ((var55.method_49$aae029aa0a()) ? 1 : 0);
                     if (var26 == null) {
                        if (var80 != 0) {
                           long var10006 = 7460680442798829143L;
                           long var56 = var19;
                           boolean var58 = true;
                           NumberSetting var59 = this.settingMurdererAlpha;
                           var81 = (int)var59.method_43$a8c520d5d1(var58, var56);
                           break label71;
                        }

                        var80 = var27;
                     }

                     var10004 = 7463890692048627414L;
                     var81 = C_47TX.method_40$0f7a48eca2(var80);
                  }

                  long var86 = 7463830761261150658L;
                  var27 = C_47TX.method_45$6fcfba2f6d(255, 0, 0, var81, var24);
               }
            }
         }

         var63 = var27;
      }

      return var63;
   }





    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_41$da8c82d5d4() {
      long var1 = a ^ 4681678413964L;
      long var3 = var1 ^ 100995986055222L;
      long var5 = var1 ^ 30582631547422L;
      long var7 = var1 ^ 53594178467276L;
      long var9 = var1 ^ 96633734096383L;
      long var10001 = 5983922041676784601L;
      C_47tP var11 = C_47tP.BOX;
      if (C_47tP.method_44$774b97b34f(var11)) {
         var10001 = 5985959375297493011L;
         Minecraft var12 = field_43;
         if (var12.field_44Q != null) {
            long var10002 = 5987369787169527202L;
            long var13 = var3;
            ShaderOptions var15 = this.settingBox2;
            boolean var10000 = var15.method_49$0dd78e0064(var13);
            long var10003 = 5986171296549915982L;
            long var16 = var7;
            ShaderOptions var18 = this.settingBox2;
            boolean var24 = var18.method_47$0dd78e0064(var16);
            var10003 = 5983688669233123750L;
            C_47uI.method_40$9bd74f13d3(var10000, var24, var5);
            C_47Fw var25 = recovery$indy$3(this);
            var10003 = 5985463561487353686L;
            C_47Fw var19 = var25;
            long var20 = var9;
            boolean var22 = true;
            C_47uI.method_42$300c7fd546(var22, var20, var19);
         }
      }
   }



   private void method_40$da8c82d5d4() {
      long var1 = a ^ 92094208060673L;
      long var3 = var1 ^ 13583481482683L;
      long var5 = var1 ^ 83909730242451L;
      long var7 = var1 ^ 113516232177729L;
      long var9 = var1 ^ 425607374962L;
      long var10001 = -7023787047453217196L;
      C_47tP var11 = C_47tP.COLLISION_BOX;
      if (C_47tP.method_44$774b97b34f(var11)) {
         var10001 = -7016834897351314018L;
         Minecraft var12 = field_43;
         if (var12.field_44Q != null) {
            long var10002 = -7018228242378352593L;
            long var13 = var3;
            ShaderOptions var15 = this.settingCollisionBox2;
            boolean var10000 = var15.method_49$0dd78e0064(var13);
            long var10003 = -7017047389844897597L;
            long var16 = var7;
            ShaderOptions var18 = this.settingCollisionBox2;
            boolean var24 = var18.method_47$0dd78e0064(var16);
            var10003 = -7023642190003676117L;
            C_47uI.method_40$9bd74f13d3(var10000, var24, var5);
            C_47Fw var25 = recovery$indy$4(this);
            var10003 = -7017183376680006949L;
            C_47Fw var19 = var25;
            long var20 = var9;
            boolean var22 = true;
            C_47uI.method_42$300c7fd546(var22, var20, var19);
         }
      }
   }



   private void method_40$ad0e900906(RenderPass var1) {
      long var2 = a ^ 140061776318993L;
      long var4 = var2 ^ 136853824182151L;
      long var6 = var2 ^ 72527869895806L;
      long var8 = var2 ^ 88248093240800L;
      long var10001 = var2 ^ 33182829971021L;
      int var10 = (int)((var2 ^ 33182829971021L) >>> 32);
      int var11 = (int)((var2 ^ 33182829971021L) << 32 >>> 56);
      int var12 = (int)(var10001 << 40 >>> 40);
      int var14 = 0;
      long var10000 = -6802853288179218084L;
      int[] var46 = AntiStrike_47Qa.method_42$d4d28024c9();
      Iterator var15 = this.field_43h.iterator();
      int[] var13 = var46;

      while (var15.hasNext()) {
         EntityLivingBase var16 = (EntityLivingBase)var15.next();
         ColorSetting var10003 = this.settingCollisionBoxColor;
         ColorSetting var10004 = this.settingCollisionBoxHitColor;
         long var10006 = -6803186813726144678L;
         BooleanSetting var19 = this.settingCollisionBoxHitColorBool;
         boolean var50 = var19.method_49$aae029aa0a();
         long var10008 = -6803186813726144678L;
         BooleanSetting var20 = this.settingCollisionBoxTeamColor;
         boolean var10007 = var20.method_49$aae029aa0a();
         byte var52 = (byte)var11;
         long var10010 = -6806290840526599402L;
         int var21 = var12;
         byte var22 = var52;
         boolean var23 = var10007;
         boolean var24 = var50;
         int var25 = var10;
         ColorSetting var26 = var10004;
         ColorSetting var27 = var10003;
         int var28 = var14;
         EntityLivingBase var29 = var16;
         ESP_47HY var30 = this;
         int var17 = var30.method_46$8996e1134f(var29, var28, var27, var26, var25, var24, var23, var22, var21);
         long var48 = -6802988584141600801L;
         long var31 = var8;
         NumberSetting var33 = this.settingCollisionBoxLineWidth;
         double var47 = (float)var33.method_44$474dfaa627(var31) / 2.0F;
         long var49 = -6803511395555005815L;
         long var34 = var4;
         EntityLivingBase var36 = var16;
         double var37 = var47;
         ESP_47HY var39 = this;
         float var18 = var39.method_43$e166087ae1(var37, var36, var34);
         var10006 = -6803732479980319594L;
         int var40 = var14;
         int var41 = var17;
         RenderPass var42 = var1;
         long var43 = var6;
         ShaderOptions var45 = this.settingCollisionBox2;
         RenderUtils.method_47$230c7ec7b1(var16, var45.method_42$f6a9c2ec55(var43, var42, var41, var40), 1.0F, var18, true);
         var14++;
         if (var13 != null) {
            break;
         }
      }
   }




   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      int[] var8 = recovery$indy$5(1632679101428694627L, var6);
      ESP_47HY var10000 = this;
      if (var8 == null) {
         if (this.field_43h.isEmpty()) {
            return;
         }

         var10000 = this;
      }

      for (Object recovered$element$21570 : var10000.field_47F.values()) {
         Runnable var10 = (Runnable) recovered$element$21570;
         var10.run();
         RenderUtils.method_41$da8c82d5d4();
         if (var8 != null) {
            break;
         }
      }
   }



   private void method_44$da8c82d5d4() {
      long var1 = a ^ 109053951921503L;
      long var3 = var1 ^ 83629091041966L;
      this.field_47c.clear();
      long var10003 = -83050921037162351L;
      long var5 = var3;
      NumberSetting var7 = this.settingBoxPriority;
      this.field_47c.put((int)var7.method_44$474dfaa627(var5), recovery$indy$6(this));
      var10003 = -83050921037162351L;
      long var8 = var3;
      NumberSetting var10 = this.settingHitBoxPriority;
      this.field_47c.put((int)var10.method_44$474dfaa627(var8), recovery$indy$7(this));
      var10003 = -83050921037162351L;
      long var11 = var3;
      NumberSetting var13 = this.settingCollisionBoxPriority;
      this.field_47c.put((int)var13.method_44$474dfaa627(var11), recovery$indy$8(this));
      var10003 = -83050921037162351L;
      long var14 = var3;
      NumberSetting var16 = this.settingFakeCornerPriority;
      this.field_47c.put((int)var16.method_44$474dfaa627(var14), recovery$indy$9(this));
   }



   private static boolean method_48$aae029aa0a() {
      long var0 = a ^ 72983403798944L;
      long var10001 = -7915235472470007051L;
      C_47tP var2 = C_47tP.THREE_E_CORNER;
      return C_47tP.method_44$774b97b34f(var2);
   }



   private void method_48$ad0e900906(RenderPass var1) {
      augustus.recovered.modules.render.ESP_47HY var58;
      int var59;
      long var2 = a ^ 5689429708639L;
      long var4 = var2 ^ 138586005309444L;
      long var6 = var2 ^ 65664511949104L;
      long var8 = var2 ^ 85825266034884L;
      long var10001 = var2 ^ 86614867463750L;
      int var10 = (int)((var2 ^ 86614867463750L) >>> 32);
      int var11 = (int)((var2 ^ 86614867463750L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var2 ^ 65212554205573L;
      int var16 = 0;
      long var10000 = -227129740912651246L;
      int[] var56 = AntiStrike_47Qa.method_42$d4d28024c9();
      Iterator var17 = this.field_43h.iterator();
      int[] var15 = var56;

      while (var17.hasNext()) {
         EntityLivingBase var18 = (EntityLivingBase)var17.next();
         double[] var19 = (double[])this.field_470.get(var18);
         if (var19 != null) {
            label81: {
               label80: {
                  label79: {
                     int var57 = var18.field_432;
                     if (var15 == null) {
                        if (var18.field_432 == 0) {
                           break label79;
                        }

                        var58 = this;
                        if (var15 != null) {
                           break label80;
                        }

                        var10001 = -227357094868149740L;
                        BooleanSetting var22 = this.settingReal2DHitColorBool;
                        var57 = (int) ((var22.method_49$aae029aa0a()) ? 1 : 0);
                     }

                     if (var57 != 0) {
                        short var10002 = (short)var11;
                        char var10003 = (char)var12;
                        long var10005 = -231957970603107365L;
                        int var23 = var16;
                        char var24 = var10003;
                        short var25 = var10002;
                        int var26 = var10;
                        ColorSetting var27 = this.settingReal2DHitColor1;
                        var59 = var27.method_47$24af287d8f(var26, var25, var24, var23);
                        break label81;
                     }
                  }

                  var58 = this;
               }

               short var68 = (short)var11;
               char var70 = (char)var12;
               long var76 = -231957970603107365L;
               int var28 = var16;
               char var29 = var70;
               short var30 = var68;
               int var31 = var10;
               ColorSetting var32 = var58.settingReal2DColor1;
               var59 = var32.method_47$24af287d8f(var31, var30, var29, var28);
            }

            int var20;
            label90: {
               var20 = var59;
               var10001 = -227357094868149740L;
               BooleanSetting var33 = this.settingMarkMurderer;
               int var61 = (int) ((var33.method_49$aae029aa0a()) ? 1 : 0);
               if (var15 == null) {
                  if (var61 == 0) {
                     break label90;
                  }

                  MurdererFinder_47kg var62 = ClientGlobals.field_48.field_46M;
                  String var66 = var18.method_41$0e30dfc966();
                  long var71 = -232637677514287769L;
                  long var34 = var4;
                  String var36 = var66;
                  MurdererFinder_47kg var37 = var62;
                  var61 = (int) ((var37.method_48$228bb405f3(var36, var34)) ? 1 : 0);
               }

               if (var15 == null) {
                  if (var61 == 0) {
                     break label90;
                  }

                  long var10004 = -226771037730062951L;
                  int var72 = C_47TX.method_40$0f7a48eca2(var20);
                  long var77 = -226425243051414899L;
                  var61 = C_47TX.method_45$6fcfba2f6d(255, 0, 0, var72, var13);
               }

               var20 = var61;
            }

            if (var1 != RenderPass.SHADOW) {
               RenderUtils.method_40$56a5fc1016(var19[0], var19[1], var19[2], var19[3], var20);
            }

            ColorSetting var73 = this.settingReal2DColor2;
            ColorSetting var75 = this.settingReal2DHitColor2;
            long var10006 = -227357094868149740L;
            BooleanSetting var38 = this.settingReal2DHitColorBool;
            boolean var78 = var38.method_49$aae029aa0a();
            long var10008 = -227357094868149740L;
            BooleanSetting var39 = this.settingReal2DTeamColor;
            boolean var10007 = var39.method_49$aae029aa0a();
            long var10009 = -233475149687696941L;
            boolean var40 = false;
            boolean var41 = var10007;
            boolean var42 = var78;
            long var43 = var8;
            ColorSetting var45 = var75;
            ColorSetting var46 = var73;
            int var47 = var16;
            EntityLivingBase var48 = var18;
            ESP_47HY var49 = this;
            int var21 = var49.method_42$a6044fe3e9(var48, var47, var46, var45, var43, var42, var41, var40);
            if (var15 == null) {
               if (var1 != RenderPass.BLUR) {
                  double var63 = var19[0];
                  double var67 = var19[1];
                  double var69 = var19[2];
                  double var74 = var19[3];
                  long var10010 = -226812664062471720L;
                  int var50 = var16;
                  int var51 = var21;
                  RenderPass var52 = var1;
                  long var53 = var6;
                  ShaderOptions var55 = this.settingReal2D2;
                  RenderUtils.method_43$4f91566a26(var63, var67, var69, var74, 1.0F, var55.method_42$f6a9c2ec55(var53, var52, var51, var50));
               }

               var16++;
            }

            if (var15 != null) {
               break;
            }
         }
      }
   }





   public static String[] method_49$44c5829186() {
      return field_47p;
   }



   private void method_49$da8c82d5d4() {
      long var1 = a ^ 4942476644125L;
      long var3 = var1 ^ 101044449742759L;
      long var5 = var1 ^ 30701931212175L;
      long var7 = var1 ^ 53337431988829L;
      long var9 = var1 ^ 96617440152174L;
      long var10001 = -4862625656674541134L;
      C_47tP var11 = C_47tP.CORNER;
      if (var11.method_43$aae029aa0a()) {
         var10001 = -4862930563019745406L;
         Minecraft var12 = field_43;
         if (var12.field_44Q != null) {
            long var10002 = -4862083137440400845L;
            long var13 = var3;
            ShaderOptions var15 = this.settingCorner2;
            boolean var10000 = var15.method_49$0dd78e0064(var13);
            long var10003 = -4863281563914689825L;
            long var16 = var7;
            ShaderOptions var18 = this.settingCorner2;
            boolean var24 = var18.method_47$0dd78e0064(var16);
            var10003 = -4856194209415397833L;
            C_47uI.method_40$9bd74f13d3(var10000, var24, var5);
            C_47Fw var25 = recovery$indy$10(this);
            var10003 = -4863426518373078841L;
            C_47Fw var19 = var25;
            long var20 = var9;
            boolean var22 = false;
            C_47uI.method_42$300c7fd546(var22, var20, var19);
         }
      }
   }



   private static boolean method_45$aae029aa0a() {
      long var0 = a ^ 130394534403556L;
      long var10001 = 7954302184108482225L;
      C_47tP var2 = C_47tP.CORNER;
      return C_47tP.method_44$774b97b34f(var2);
   }



   private void method_45$da8c82d5d4() {
      long var1 = a ^ 42483404477440L;
      long var3 = var1 ^ 133296661173434L;
      long var5 = var1 ^ 62886560872082L;
      long var7 = var1 ^ 20199835484480L;
      long var9 = var1 ^ 128652299211123L;
      long var10001 = -6375114077630720171L;
      C_47tP var11 = C_47tP.HIT_BOX;
      if (C_47tP.method_44$774b97b34f(var11)) {
         var10001 = -6368577269119955809L;
         Minecraft var12 = field_43;
         if (var12.field_44Q != null) {
            long var10002 = -6369413718675447506L;
            long var13 = var3;
            ShaderOptions var15 = this.settingHitBox2;
            boolean var10000 = var15.method_49$0dd78e0064(var13);
            long var10003 = -6368364808881587774L;
            long var16 = var7;
            ShaderOptions var18 = this.settingHitBox2;
            boolean var24 = var18.method_47$0dd78e0064(var16);
            var10003 = -6375276533667896022L;
            C_47uI.method_40$9bd74f13d3(var10000, var24, var5);
            C_47Fw var25 = recovery$indy$11(this);
            var10003 = -6369073365054688294L;
            C_47Fw var19 = var25;
            long var20 = var9;
            boolean var22 = true;
            C_47uI.method_42$300c7fd546(var22, var20, var19);
         }
      }
   }



   private void method_45$ad0e900906(RenderPass var1) {
      long var2 = a ^ 92793550113414L;
      long var4 = var2 ^ 96139645325072L;
      long var6 = var2 ^ 117584243522793L;
      long var8 = var2 ^ 135537872926071L;
      long var10001 = var2 ^ 58456521318106L;
      int var10 = (int)((var2 ^ 58456521318106L) >>> 32);
      int var11 = (int)((var2 ^ 58456521318106L) << 32 >>> 56);
      int var12 = (int)(var10001 << 40 >>> 40);
      int var14 = 0;
      long var10000 = -5116014419699969589L;
      int[] var46 = AntiStrike_47Qa.method_42$d4d28024c9();
      Iterator var15 = this.field_43h.iterator();
      int[] var13 = var46;

      while (var15.hasNext()) {
         EntityLivingBase var16 = (EntityLivingBase)var15.next();
         ColorSetting var10003 = this.settingBoxColor;
         ColorSetting var10004 = this.settingBoxHitColor;
         long var10006 = -5115787202881626163L;
         BooleanSetting var19 = this.settingBoxHitColorBool;
         boolean var50 = var19.method_49$aae029aa0a();
         long var10008 = -5115787202881626163L;
         BooleanSetting var20 = this.settingTeamColorBox;
         boolean var10007 = var20.method_49$aae029aa0a();
         byte var52 = (byte)var11;
         long var10010 = -5108179783048375423L;
         int var21 = var12;
         byte var22 = var52;
         boolean var23 = var10007;
         boolean var24 = var50;
         int var25 = var10;
         ColorSetting var26 = var10004;
         ColorSetting var27 = var10003;
         int var28 = var14;
         EntityLivingBase var29 = var16;
         ESP_47HY var30 = this;
         int var17 = var30.method_46$8996e1134f(var29, var28, var27, var26, var25, var24, var23, var22, var21);
         long var48 = -5115588990475903160L;
         long var31 = var8;
         NumberSetting var33 = this.settingBoxLineWidth;
         double var47 = (float)var33.method_44$474dfaa627(var31) / 2.0F;
         long var49 = -5115463102927457762L;
         long var34 = var4;
         EntityLivingBase var36 = var16;
         double var37 = var47;
         ESP_47HY var39 = this;
         float var18 = var39.method_43$e166087ae1(var37, var36, var34);
         var10006 = -5115136600509557759L;
         int var40 = var14;
         int var41 = var17;
         RenderPass var42 = var1;
         long var43 = var6;
         ShaderOptions var45 = this.settingBox2;
         RenderUtils.method_49$fe3d7b3fc5(var16, var45.method_42$f6a9c2ec55(var43, var42, var41, var40), 1.0F, var18);
         var14++;
         if (var13 != null) {
            break;
         }
      }
   }




   private boolean method_41E$aae029aa0a() {
      long var1 = a ^ 4605182026485L;
      long var10000 = 1257370336138852792L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 1257140852424898494L;
      BooleanSetting var4 = this.settingTeamColorBox;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private void method_47$da8c82d5d4() {
      long var1 = a ^ 92346046660449L;
      long var3 = var1 ^ 137286702186640L;
      this.field_47F.clear();
      long var10003 = -8293728961975686481L;
      long var5 = var3;
      NumberSetting var7 = this.settingReal2DPriority;
      this.field_47F.put((int)var7.method_44$474dfaa627(var5), recovery$indy$12(this));
      var10003 = -8293728961975686481L;
      long var8 = var3;
      NumberSetting var10 = this.settingCornerPriority;
      this.field_47F.put((int)var10.method_44$474dfaa627(var8), recovery$indy$13(this));
   }



   private void method_47$ad0e900906(RenderPass var1) {
      long var2 = a ^ 88818281406343L;
      long var4 = var2 ^ 92165466479121L;
      long var6 = var2 ^ 121305036466664L;
      long var8 = var2 ^ 140634112368758L;
      long var10001 = var2 ^ 54463553031131L;
      int var10 = (int)((var2 ^ 54463553031131L) >>> 32);
      int var11 = (int)((var2 ^ 54463553031131L) << 32 >>> 56);
      int var12 = (int)(var10001 << 40 >>> 40);
      int var14 = 0;
      long var10000 = -1440791932291087158L;
      int[] var46 = AntiStrike_47Qa.method_42$d4d28024c9();
      Iterator var15 = this.field_43h.iterator();
      int[] var13 = var46;

      while (var15.hasNext()) {
         EntityLivingBase var16 = (EntityLivingBase)var15.next();
         ColorSetting var10003 = this.settingHitBoxColor;
         ColorSetting var10004 = this.settingHitBoxHitColor;
         long var10006 = -1441127663832200500L;
         BooleanSetting var19 = this.settingHitBoxHitColorBool;
         boolean var50 = var19.method_49$aae029aa0a();
         long var10008 = -1441127663832200500L;
         BooleanSetting var20 = this.settingHitBoxTeamColor;
         boolean var10007 = var20.method_49$aae029aa0a();
         byte var52 = (byte)var11;
         long var10010 = -1432957016483395968L;
         int var21 = var12;
         byte var22 = var52;
         boolean var23 = var10007;
         boolean var24 = var50;
         int var25 = var10;
         ColorSetting var26 = var10004;
         ColorSetting var27 = var10003;
         int var28 = var14;
         EntityLivingBase var29 = var16;
         ESP_47HY var30 = this;
         int var17 = var30.method_46$8996e1134f(var29, var28, var27, var26, var25, var24, var23, var22, var21);
         long var48 = -1440938265774159287L;
         long var31 = var8;
         NumberSetting var33 = this.settingHitBoxLineWidth;
         double var47 = (float)var33.method_44$474dfaa627(var31) / 2.0F;
         long var49 = -1440239511174944993L;
         long var34 = var4;
         EntityLivingBase var36 = var16;
         double var37 = var47;
         ESP_47HY var39 = this;
         float var18 = var39.method_43$e166087ae1(var37, var36, var34);
         var10006 = -1440475688127954688L;
         int var40 = var14;
         int var41 = var17;
         RenderPass var42 = var1;
         long var43 = var6;
         ShaderOptions var45 = this.settingHitBox2;
         RenderUtils.method_47$230c7ec7b1(var16, var45.method_42$f6a9c2ec55(var43, var42, var41, var40), 1.0F, var18, false);
         var14++;
         if (var13 != null) {
            break;
         }
      }
   }




   public boolean method_47$e04982bb4a(EntityLivingBase var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 4677822839773L;
      long var10001 = var2 ^ 110120971451845L;
      int var6 = (int)((var2 ^ 110120971451845L) >>> 48);
      int var7 = (int)((var2 ^ 110120971451845L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      int[] var16 = recovery$indy$14(-5212286575274959007L, var2);
      EntityLivingBase var10000 = var1;
      if (var16 == null) {
         if (var1 instanceof EntityPlayerSP) {
            return false;
         }

         var10000 = var1;
      }

      boolean var19 = recovery$indy$15(C_44b.PLAYERS, -5210639576154988335L, var2);
      boolean var10002 = recovery$indy$16(C_44b.MOBS, -5210639576154988335L, var2);
      boolean var10003 = recovery$indy$17(C_44b.ANIMALS, -5210639576154988335L, var2);
      boolean var10004 = recovery$indy$18(C_44b.VILLAGER, -5210639576154988335L, var2);
      boolean var10006 = recovery$indy$19(C_44b.INVISIBLE, -5210639576154988335L, var2);
      boolean var10007 = recovery$indy$20(C_44b.TEAMMATES, -5210639576154988335L, var2);
      if (var16 == null) {
         var10007 = !var10007;
      }

      boolean var9 = true;
      boolean var10 = false;
      boolean var11 = var10007;
      boolean var12 = var10006;
      boolean var13 = false;
      boolean var14 = var10004;
      boolean var15 = var10003;
      byte var18 = ((byte) (recovery$indy$21(
         var10000, var19, var10002, (short)var6, var15, var14, var13, var12, var11, var10, var7, var9, (char)var8, -5209835371724994802L, var2
      ) ? 1 : 0));
      int[] var20 = var16;
      if (var2 > 0L) {
         if (var16 == null) {
            if (var18 == 0) {
               return false;
            }

            double var21;
            var18 = (byte)((
                     var21 = recovery$indy$22(field_43, -5210343291320666768L, var2).method_44$ee256e8a75(var1)
                        - recovery$indy$23(this.settingMaximumRenderDistance, var4, -5211867708391697950L, var2)
                  )
                  == 0.0
               ? 0
               : (var21 < 0.0 ? -1 : 1));
         }

         var20 = var16;
      }

      return (boolean)(var20 != null ? var18 : var18 < 0);
   }




   private void method_43$ad0e900906(client.render.RenderPass var1) {
        int var65;
      long var2 = a ^ 33583701528693L;
      long var4 = var2 ^ 111793391818542L;
      long var6 = var2 ^ 35318742836762L;
      long var8 = var2 ^ 54611059339140L;
      long var10 = var2 ^ 130259698372633L;
      long var10001 = var2 ^ 93876788269420L;
      int var12 = (int)((var2 ^ 93876788269420L) >>> 32);
      int var13 = (int)((var2 ^ 93876788269420L) << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      long var15 = var2 ^ 36183083484847L;
      int var18 = 0;
      long var10000 = -6632947845654656200L;
      int[] var63 = AntiStrike_47Qa.method_42$d4d28024c9();
      java.util.Iterator var19 = this.field_43h.iterator();
      int[] var17 = var63;

      while (var19.hasNext()) {
         net.minecraft.entity.EntityLivingBase var20 = (net.minecraft.entity.EntityLivingBase)var19.next();
         double[] var21 = (double[])this.field_470.get(var20);
         if (var21 != null) {
            int var64 = var20.field_432;
            if (var17 != null) {
               if (var20.field_432 != 0) {
                  boolean var68 = var20 instanceof EntityPlayer;
               } else {
                  short var78 = (short)var13;
                  char var83 = (char)var14;
                  long var88 = -6634381884407692047L;
                  int var58 = var18;
                  char var59 = var83;
                  short var60 = var78;
                  int var61 = var12;
                  client.setting.ColorSetting var62 = this.settingCornerColor;
                  var62.method_47$24af287d8f(var61, var60, var59, var58);
               }

               return;
            }

            label85:
            while (true) {
               label92: {
                  if (var64 != 0) {
                     var10001 = -6633142223094528706L;
                     client.setting.BooleanSetting var23 = this.settingCornerHitColorBool;
                     if (var23.method_49$aae029aa0a()) {
                        short var76 = (short)var13;
                        char var79 = (char)var14;
                        long var85 = -6634381884407692047L;
                        int var24 = var18;
                        char var25 = var79;
                        short var26 = var76;
                        int var27 = var12;
                        client.setting.ColorSetting var28 = this.settingCornerHitColor;
                        var65 = var28.method_47$24af287d8f(var27, var26, var25, var24);
                        break label92;
                     }
                  }

                  var10001 = -6633142223094528706L;
                  client.setting.BooleanSetting var29 = this.settingCornerTeamColor;
                  if (var29.method_49$aae029aa0a() && var20 instanceof EntityPlayer) {
                     EntityPlayer var71 = (EntityPlayer)var20;
                     long var75 = -6633818894383386179L;
                     EntityPlayer var30 = var71;
                     long var31 = var10;
                     var65 = net.C_47TX.method_42$946347ffd5(var31, var30);
                  } else {
                     short var10002 = (short)var13;
                     char var10003 = (char)var14;
                     long var10005 = -6634381884407692047L;
                     int var33 = var18;
                     char var34 = var10003;
                     short var35 = var10002;
                     int var36 = var12;
                     client.setting.ColorSetting var37 = this.settingCornerColor;
                     var65 = var37.method_47$24af287d8f(var36, var35, var34, var33);
                  }
               }

               int var22 = var65;
               var10001 = -6633142223094528706L;
               client.setting.BooleanSetting var38 = this.settingMarkMurderer;
               if (var38.method_49$aae029aa0a()) {
                  augustus.recovered.modules.misc.MurdererFinder_47kg var66 = client.ClientGlobals.field_48.field_46M;
                  String var73 = var20.method_41$0e30dfc966();
                  long var80 = -6633913421201552819L;
                  long var39 = var4;
                  String var41 = var73;
                  augustus.recovered.modules.misc.MurdererFinder_47kg var42 = var66;
                  if (var42.method_48$228bb405f3(var41, var39)) {
                     long var10004 = -6633728211547659597L;
                     int var81 = net.C_47TX.method_40$0f7a48eca2(var22);
                     long var86 = -6633370318749862489L;
                     var22 = net.C_47TX.method_45$6fcfba2f6d(255, 0, 0, var81, var15);
                  }
               }

               double var67 = var21[0];
               double var74 = var21[1];
               double var77 = var21[2];
               double var82 = var21[3];
               long var10006 = -6633085348802542149L;
               long var43 = var8;
               client.setting.NumberSetting var45 = this.settingLineWidthCorner;
               float var84 = (float)var45.method_44$474dfaa627(var43);
               long var10007 = -6633085348802542149L;
               long var46 = var8;
               client.setting.NumberSetting var48 = this.settingHorizontalPercentage;
               double var87 = net.C_47sk.method_45$4b58f7ab41(var48.method_44$474dfaa627(var46), 0.0, 100.0);
               long var10008 = -6633085348802542149L;
               long var49 = var8;
               client.setting.NumberSetting var51 = this.settingVerticalPercentage;
               double var89 = net.C_47sk.method_45$4b58f7ab41(var51.method_44$474dfaa627(var49), 0.0, 100.0);
               long var10012 = -6633757503680590094L;
               int var52 = var18;
               int var53 = var22;
               client.render.RenderPass var54 = var1;
               long var55 = var6;
               client.setting.ShaderOptions var57 = this.settingCorner2;
               client.render.RenderUtils.method_43$da1bfc93ea(var67, var74, var77, var82, var84, var87, var89, var57.method_42$f6a9c2ec55(var55, var54, var53, var52));
               var18++;

               while (var19.hasNext()) {
                  var20 = (net.minecraft.entity.EntityLivingBase)var19.next();
                  var21 = (double[])this.field_470.get(var20);
                  if (var21 != null) {
                     var64 = var20.field_432;
                     continue label85;
                  }
               }

               return;
            }
         }
      }
   }





   private void method_43$b0301f85f0(EntityLivingBase var1, long var2) {
      int[] var6;
      label42: {
         var2 = a ^ var2;
         long var4 = var2 ^ 29387219112543L;
         var6 = recovery$indy$24(-7201966246730468154L, var2);
         C_47b0 var10000 = this.field_47J;
         double var10001 = recovery$indy$25(field_43, -7200070641121162189L, var2).field_48Q;
         double var10002 = recovery$indy$26(field_43, -7200070641121162189L, var2).field_48j;
         double var10003 = recovery$indy$27(field_43, -7200070641121162189L, var2).field_42o;
         if (var6 == null) {
            var10000.method_40$a59262c0f0(var10001, var10002, var10003);
            if (!recovery$indy$28(ClientGlobals.field_48.field_41p, var4, -7199277435391112492L, var2)) {
               break label42;
            }

            var10000 = this.field_47J;
            var10001 = ClientGlobals.field_48.field_41p.field_47.field_40;
            var10002 = ClientGlobals.field_48.field_41p.field_47.field_41;
            var10003 = ClientGlobals.field_48.field_41p.field_47.field_47;
         }

         var10000.method_40$a59262c0f0(var10001, var10002, var10003);
      }

      C_478i var7 = var1.method_45$6684d3c618();
      boolean var9 = this.field_47J
         .method_41$a9269b572f(var7.field_48 - 0.5, var7.field_46 - 0.5, var7.field_44 - 0.5, var7.field_42 + 0.5, var7.field_47 + 0.5, var7.field_40 + 0.5);
      int[] var10 = var6;
      if (var2 >= 0L) {
         if (var6 == null) {
            if (!var9) {
               return;
            }

            var9 = this.field_43h.contains(var1);
         }

         var10 = var6;
      }

      if (var10 == null && !var9) {
         this.field_43h.add(var1);
      }
   }



   private void method_43$da8c82d5d4() {
      long var1 = a ^ 83825151006916L;
      long var3 = var1 ^ 21603354237054L;
      long var5 = var1 ^ 92013424671318L;
      long var7 = var1 ^ 132771471560068L;
      long var9 = var1 ^ 34756267531703L;
      long var10001 = 7729128156511624081L;
      C_47tP var11 = C_47tP.THREE_E_CORNER;
      if (C_47tP.method_44$774b97b34f(var11)) {
         var10001 = 7735546064213147739L;
         Minecraft var12 = field_43;
         if (var12.field_44Q != null) {
            long var10002 = 7736939408137088490L;
            long var13 = var3;
            ShaderOptions var15 = this.settingFakeCorner;
            boolean var10000 = var15.method_49$0dd78e0064(var13);
            long var10003 = 7735899298459645190L;
            long var16 = var7;
            ShaderOptions var18 = this.settingFakeCorner;
            boolean var24 = var18.method_47$0dd78e0064(var16);
            var10003 = 7728772188571281902L;
            C_47uI.method_40$9bd74f13d3(var10000, var24, var5);
            C_47Fw var25 = recovery$indy$29(this);
            var10003 = 7735190859324440350L;
            C_47Fw var19 = var25;
            long var20 = var9;
            boolean var22 = true;
            C_47uI.method_42$300c7fd546(var22, var20, var19);
         }
      }
   }



   private float method_43$e166087ae1(double var1, EntityLivingBase var3, long var4) {
      var4 = a ^ var4;
      int[] var6 = recovery$indy$30(403938013101452624L, var4);
      float var10000 = recovery$indy$31(field_43, 396329838975076161L, var4).method_44$ee256e8a75(var3);
      if (var6 == null) {
         label40: {
            float var10001 = 1.0F;
            if (var4 >= 0L) {
               if (!(var10000 > 1.0F)) {
                  break label40;
               }

               var10000 = 1.0F;
               var10001 = recovery$indy$32(field_43, 396329838975076161L, var4).method_44$ee256e8a75(var3) / 20.0F;
            }

            double var7 = var10000 - var10001;
            double var10 = var7;
            if (var4 >= 0L) {
               double var11 = 0.3;
               if (var6 == null) {
                  if (var7 < 0.3) {
                     var7 = 0.3;
                  }

                  var10 = var1;
                  var11 = var7;
               }

               var10 *= var11;
            }

            var1 = var10;
         }

         var10000 = (float)var1;
      }

      return var10000;
   }



   public void onRender3D(long var1, float var3) {
      net.minecraft.entity.EntityLivingBase var22;
      float var23;
      long var4 = var1 ^ 122725729730224L;
      long var6 = var1 ^ 138341576030118L;
      int[] var8 = recovery$indy$33(8134078167448098857L, var1);
      this.field_470.clear();
      ESP_47HY var10000 = this;
      if (var8 == null) {
         if (this.field_43h.isEmpty()) {
            return;
         }

         var10000 = this;
      }

      ObjectIterator var9 = var10000.field_47c.values().iterator();

      label97:
      while (true) {
         Object var17;
         if (var9.hasNext()) {
            var17 = var9.next();
         } else {
            var17 = C_47tP.REAL_2D;
            if (var1 >= 0L) {
               boolean var20 = recovery$indy$34(C_47tP.REAL_2D, 8134405006181154865L, var1);
               if (var8 == null) {
                  if (var20) {
                     break;
                  }

                  var20 = recovery$indy$35(C_47tP.CORNER, 8134405006181154865L, var1);
               }

               if (!var20) {
                  return;
               }
               break;
            }
         }

         do {
            Runnable var10 = (Runnable)var17;
            GL11.glPushMatrix();
            RenderUtils.method_42$da8c82d5d4();
            var10.run();
            RenderUtils.method_43$da8c82d5d4();
            GL11.glPopMatrix();
            int[] var18 = var8;
            if (var1 >= 0L) {
               if (var8 != null) {
                  break label97;
               }

               var18 = var8;
            }

            if (var18 == null) {
               continue label97;
            }

            var17 = C_47tP.REAL_2D;
         } while (var1 < 0L);

         boolean var19 = recovery$indy$34(C_47tP.REAL_2D, 8134405006181154865L, var1);
         if (var8 == null) {
            if (var19) {
               break;
            }

            var19 = recovery$indy$35(C_47tP.CORNER, 8134405006181154865L, var1);
         }

         if (!var19) {
            return;
         }
         break;
      }

      ScaledResolution var15 = new ScaledResolution(field_43);

      for (Object recovered$element$52577 : this.field_43h) {
         EntityLivingBase var11 = (EntityLivingBase) recovered$element$52577;
         C_47tf var12;
         float var13;
         label63: {
            label62: {
               label61: {
                  var12 = new C_47tf(
                     var11.field_48u + (var11.field_48Q - var11.field_48u) * recovery$indy$36(field_43, 8142256580510466994L, var1).field_49,
                     var11.field_48O + (var11.field_48j - var11.field_48O) * recovery$indy$37(field_43, 8142256580510466994L, var1).field_49,
                     var11.field_48l + (var11.field_42o - var11.field_48l) * recovery$indy$38(field_43, 8142256580510466994L, var1).field_49
                  );
                  var13 = var11.field_48w / 2.0F;
                  boolean var21 = recovery$indy$39(ClientGlobals.field_48.field_44X, var4, 8140382171450893883L, var1);
                  if (var8 == null) {
                     if (!var21) {
                        break label61;
                     }

                     var22 = var11;
                     if (var8 != null) {
                        break label62;
                     }

                     var21 = var11 instanceof EntityPlayer;
                  }

                  if (var21) {
                     var23 = var11.field_48 / 1.7F;
                     break label63;
                  }
               }

               var22 = var11;
            }

            var23 = var22.field_48;
         }

         float var14 = var23;
         this.field_470
            .put(
               var11,
               recovery$indy$40(
                  var6,
                  new C_478i(
                        var12.field_40 - var13, var12.field_41, var12.field_47 - var13, var12.field_40 + var13, var12.field_41 + var14, var12.field_47 + var13
                     )
                     .method_42$800791f322(0.1, 0.1, 0.1),
                  var15,
                  8134035924909636422L,
                  var1
               )
            );
         if (var8 != null) {
            break;
         }
      }
   }




   private boolean method_41z$aae029aa0a() {
      long var1 = a ^ 140592012641789L;
      long var10000 = -685839865326166352L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -686173184429453130L;
      BooleanSetting var4 = this.settingVanillaTeamColor;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_418$aae029aa0a() {
      long var1 = a ^ 111916068735100L;
      long var10000 = -4901479548277501135L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -4901285249732682441L;
      BooleanSetting var4 = this.settingCollisionBoxTeamColor;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private static boolean method_416$aae029aa0a() {
      long var0 = a ^ 27811257523653L;
      long var10001 = 3333284320455499408L;
      C_47tP var2 = C_47tP.VANILLA;
      return C_47tP.method_44$774b97b34f(var2);
   }



   private boolean method_411$aae029aa0a() {
      long var1 = a ^ 29538020673343L;
      long var10000 = -812603664309117838L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -812798454384487820L;
      BooleanSetting var4 = this.settingCornerTeamColor;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private static boolean method_41C$aae029aa0a() {
      long var0 = a ^ 64140707790060L;
      long var10001 = 5722693536006766521L;
      C_47tP var2 = C_47tP.REAL_2D;
      return C_47tP.method_44$774b97b34f(var2);
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$41(this, 32, -100, var3, -7103867889345261007L, var1);
      recovery$indy$42(this, 40, var5, -7102620311848072251L, var1);
   }



   private static boolean method_41c$aae029aa0a() {
      long var0 = a ^ 45341737976564L;
      long var10001 = -5660175795043270239L;
      C_47tP var2 = C_47tP.HIT_BOX;
      return C_47tP.method_44$774b97b34f(var2);
   }



   private boolean method_41R$aae029aa0a() {
      long var1 = a ^ 97703553039096L;
      long var10000 = 5295757369454895541L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 5295984799109197747L;
      BooleanSetting var4 = this.settingReal2DTeamColor;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private static boolean method_41L$aae029aa0a() {
      long var0 = a ^ 21176889468933L;
      long var10001 = 6593901404194630480L;
      C_47tP var2 = C_47tP.BOX;
      return C_47tP.method_44$774b97b34f(var2);
   }



   private boolean method_41m$aae029aa0a() {
      long var1 = a ^ 92799119936720L;
      long var10000 = 9175596052974278557L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 9175823276772137371L;
      BooleanSetting var4 = this.settingFakeCornerTeamColor;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private static boolean method_41d$aae029aa0a() {
      long var0 = a ^ 15632113725990L;
      long var10001 = -4494272396637441677L;
      C_47tP var2 = C_47tP.COLLISION_BOX;
      return C_47tP.method_44$774b97b34f(var2);
   }



   private boolean method_41H$aae029aa0a() {
      long var1 = a ^ 1674897546665L;
      long var10000 = 7939588983518529252L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 7939361550903249122L;
      BooleanSetting var4 = this.settingHitBoxTeamColor;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_41t$aae029aa0a() {
      long var1 = a ^ 21330556507756L;
      long var10000 = 7343687635621645601L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 7344057795377464103L;
      BooleanSetting var4 = this.settingMarkMurderer;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 7344057795377464103L;
         BooleanSetting var5 = this.settingCustomMurdererAlpha;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 111351477541480L;
      long var8 = var4 ^ 35618150658511L;
      int[] var10 = recovery$indy$43(2182379164800677506L, var4);
      WorldClient var10000 = recovery$indy$44(field_43, 2184575419376727376L, var4);
      if (var10 == null) {
         if (var10000 == null) {
            return;
         }

         this.field_43h.clear();
         var10000 = recovery$indy$45(field_43, 2184575419376727376L, var4);
      }

      for (Object var12 : var10000.field_44Q) {
         Object var14 = var12;
         if (var10 == null) {
            if (!(var12 instanceof EntityLivingBase)) {
               continue;
            }

            var14 = var12;
         }

         label43: {
            EntityLivingBase var13 = (EntityLivingBase)var14;
            ESP_47HY var15 = this;
            EntityLivingBase var10001 = var13;
            if (var10 == null) {
               if (!recovery$indy$46(this, var13, var6, 2182957602171414025L, var4)) {
                  break label43;
               }

               var15 = this;
               var10001 = var13;
            }

            recovery$indy$47(var15, var10001, var8, 2185606044157485164L, var4);
         }

         if (var10 != null) {
            break;
         }
      }
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_470.clear();
      this.field_43h.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public ESP_47HY(long a0) {
        super((java.lang.String) ("ESP"),(java.lang.String) ("SpielerDurchWandSehen"),(long) (((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 36313713735059L)),(java.awt.Color) (new java.awt.Color((int) (47),(int) (134),(int) (124),(int) (255))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.ESP_47HY.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 98904196267189L);
        int constructorPart4 = (int) ((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 105717533616692L) >>> 32));
        int constructorPart5 = (int) (((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 105717533616692L) << 32) >>> 48));
        int constructorPart6 = (int) (((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 105717533616692L) << 48) >>> 48));
        long constructorKey7 = ((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 6470660257798L);
        long constructorKey8 = ((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 100651480402941L);
        long constructorKey9 = ((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 88108865890696L);
        long constructorKey10 = ((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 2418790391896L);
        long constructorKey11 = ((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 18670948612197L);
        int constructorPart12 = (int) ((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 61872792360082L) >>> 32));
        int constructorPart13 = (int) (((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 61872792360082L) << 32) >>> 40));
        int constructorPart14 = (int) (((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 61872792360082L) << 56) >>> 56));
        int constructorPart15 = (int) ((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 41848686974841L) >>> 48));
        int constructorPart16 = (int) (((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 41848686974841L) << 16) >>> 48));
        int constructorPart17 = (int) (((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 41848686974841L) << 32) >>> 32));
        int constructorPart18 = (int) ((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 124950225894141L) >>> 32));
        int constructorPart19 = (int) (((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 124950225894141L) << 32) >>> 40));
        int constructorPart20 = (int) (((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 124950225894141L) << 56) >>> 56));
        long constructorKey21 = ((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 42455959433218L);
        int constructorPart22 = (int) ((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 77864307976229L) >>> 32));
        int constructorPart23 = (int) (((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 77864307976229L) << 32) >>> 48));
        int constructorPart24 = (int) (((((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 77864307976229L) << 48) >>> 48));
        long constructorKey25 = ((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 76497553893991L);
        long constructorKey26 = ((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 137964063233551L);
        long constructorKey27 = ((augustus.recovered.modules.render.ESP_47HY.a ^ a0) ^ 114298237504825L);
        java.lang.Object initialValue28 = recovery$indy$flow$648();
        client.setting.MultiSelectSetting initialized29 = new client.setting.MultiSelectSetting(this, "Modes", constructorKey11, (net.C_47OZ[]) (initialValue28));
        recovery$indy$flow$650(this, initialized29);
        client.setting.BooleanSetting initialized30 = new client.setting.BooleanSetting(this, constructorKey9, "MarkMurderer", true);
        recovery$indy$flow$653(this, initialized30);
        java.lang.Object initialValue31 = recovery$indy$flow$654();
        client.setting.BooleanSetting initialized32 = new client.setting.BooleanSetting(this, constructorKey9, "Custom Murderer Alpha", false);
        java.lang.Object initialValue33 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingMarkMurderer));
        java.lang.Object initialValue34 = recovery$indy$flow$658(initialValue33);
        java.lang.Object initialValue35 = recovery$indy$flow$659(initialValue33);
        java.lang.Object initialValue36 = initialValue35;
        long initialValue37 = constructorKey3;
        client.setting.BooleanSetting initialValue38 = initialized32;
        java.lang.Object initialValue39 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue40 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue41 = recovery$indy$flow$662(initialValue39, initialValue37, initialValue40);
        java.lang.Object initialValue42 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue41))))));
        recovery$indy$flow$664(this, initialValue42);
        client.setting.NumberSetting initialized43 = new client.setting.NumberSetting(this, "Murderer Alpha", Double.longBitsToDouble(4634274385308418048L), constructorKey26, 0.0D, Double.longBitsToDouble(4643176031446892544L), 0);
        java.lang.Object initialValue44 = recovery$indy$flow$667(this);
        java.lang.Object initialValue45 = initialValue44;
        client.setting.NumberSetting initialValue46 = initialized43;
        java.lang.Object initialValue47 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue46))))));
        java.lang.Object initialValue48 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue49 = recovery$indy$flow$670(initialValue47, initialValue48);
        recovery$indy$flow$671(this, initialValue49);
        client.setting.SettingGroup initialized50 = new client.setting.SettingGroup(this, "Box", true, constructorKey21);
        java.lang.Object initialValue51 = recovery$indy$flow$674();
        char converted52 = (char) (constructorPart23);
        java.lang.Object initialValue53 = initialValue51;
        int initialValue54 = constructorPart24;
        int initialValue55 = (int) (converted52);
        int initialValue56 = constructorPart22;
        client.setting.SettingGroup initialValue57 = initialized50;
        java.lang.Object initialValue58 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue59 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue53))))));
        java.lang.Object initialValue60 = recovery$indy$flow$677(initialValue58, initialValue56, (char) (initialValue55), initialValue54, initialValue59);
        recovery$indy$flow$678(this, initialValue60);
        short converted61 = (short) (constructorPart15);
        char converted62 = (char) (constructorPart16);
        java.lang.Object initialValue63 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingBox));
        client.setting.BooleanSetting initialized64 = new client.setting.BooleanSetting(this, "TeamColorBox", converted61, converted62, constructorPart17, false, (client.setting.SettingGroup) (initialValue63));
        long initialValue65 = constructorKey8;
        java.lang.String initialValue66 = "TeamColor";
        client.setting.BooleanSetting initialValue67 = initialized64;
        java.lang.Object initialValue68 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue67))))));
        java.lang.Object initialValue69 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue66))))));
        java.lang.Object initialValue70 = recovery$indy$flow$684(initialValue68, initialValue69, initialValue65);
        java.lang.Object initialValue71 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue70))))));
        recovery$indy$flow$686(this, initialValue71);
        java.awt.Color initialized72 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue73 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingBox));
        client.setting.ColorSetting initialized74 = new client.setting.ColorSetting(this, "BoxColor", constructorKey7, initialized72, (client.setting.SettingGroup) (initialValue73));
        long initialValue75 = constructorKey8;
        java.lang.String initialValue76 = "Color";
        client.setting.ColorSetting initialValue77 = initialized74;
        java.lang.Object initialValue78 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue77))))));
        java.lang.Object initialValue79 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue76))))));
        java.lang.Object initialValue80 = recovery$indy$flow$694(initialValue78, initialValue79, initialValue75);
        java.lang.Object initialValue81 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue80))))));
        java.lang.Object initialValue82 = recovery$indy$flow$696(this);
        java.lang.Object initialValue83 = initialValue82;
        long initialValue84 = constructorKey3;
        java.lang.Object initialValue85 = initialValue81;
        java.lang.Object initialValue86 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue85))))));
        java.lang.Object initialValue87 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue83))))));
        java.lang.Object initialValue88 = recovery$indy$flow$699(initialValue86, initialValue84, initialValue87);
        java.lang.Object initialValue89 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue88))))));
        recovery$indy$flow$701(this, initialValue89);
        short converted90 = (short) (constructorPart15);
        char converted91 = (char) (constructorPart16);
        java.lang.Object initialValue92 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingBox));
        client.setting.BooleanSetting initialized93 = new client.setting.BooleanSetting(this, "BoxHitColorBool", converted90, converted91, constructorPart17, false, (client.setting.SettingGroup) (initialValue92));
        recovery$indy$flow$705(this, initialized93);
        java.awt.Color initialized94 = new java.awt.Color(255, 0, 0, 65);
        java.lang.Object initialValue95 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingBox));
        client.setting.ColorSetting initialized96 = new client.setting.ColorSetting(this, "BoxHitColor", constructorKey7, initialized94, (client.setting.SettingGroup) (initialValue95));
        long initialValue97 = constructorKey8;
        java.lang.String initialValue98 = "HitColor";
        client.setting.ColorSetting initialValue99 = initialized96;
        java.lang.Object initialValue100 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue99))))));
        java.lang.Object initialValue101 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue98))))));
        java.lang.Object initialValue102 = recovery$indy$flow$713(initialValue100, initialValue101, initialValue97);
        java.lang.Object initialValue103 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue102))))));
        java.lang.Object initialValue104 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingBoxHitColorBool));
        java.lang.Object initialValue105 = recovery$indy$flow$716(initialValue104);
        java.lang.Object initialValue106 = recovery$indy$flow$717(initialValue104);
        java.lang.Object initialValue107 = initialValue106;
        long initialValue108 = constructorKey3;
        java.lang.Object initialValue109 = initialValue103;
        java.lang.Object initialValue110 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue109))))));
        java.lang.Object initialValue111 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue107))))));
        java.lang.Object initialValue112 = recovery$indy$flow$720(initialValue110, initialValue108, initialValue111);
        java.lang.Object initialValue113 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue112))))));
        recovery$indy$flow$722(this, initialValue113);
        java.lang.Object initialValue114 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingBox));
        client.setting.NumberSetting initialized115 = new client.setting.NumberSetting(this, "BoxLineWidth", Double.longBitsToDouble(4618441417868443648L), 0.0D, Double.longBitsToDouble(4624633867356078080L), 0, (client.setting.SettingGroup) (initialValue114), constructorKey27);
        short converted116 = (short) (constructorPart6);
        int initialValue117 = (int) (converted116);
        int initialValue118 = constructorPart5;
        java.lang.String initialValue119 = "LineWidth";
        int initialValue120 = constructorPart4;
        client.setting.NumberSetting initialValue121 = initialized115;
        java.lang.Object initialValue122 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue121))))));
        java.lang.Object initialValue123 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue119))))));
        java.lang.Object initialValue124 = recovery$indy$flow$728(initialValue122, initialValue120, initialValue123, initialValue118, (short) (initialValue117));
        recovery$indy$flow$729(this, initialValue124);
        java.lang.Object initialValue125 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingBox));
        client.setting.NumberSetting initialized126 = new client.setting.NumberSetting(this, "BoxPriority", 0.0D, 0.0D, Double.longBitsToDouble(4613937818241073152L), 0, (client.setting.SettingGroup) (initialValue125), constructorKey27);
        short converted127 = (short) (constructorPart6);
        int initialValue128 = (int) (converted127);
        int initialValue129 = constructorPart5;
        java.lang.String initialValue130 = "3DPriority";
        int initialValue131 = constructorPart4;
        client.setting.NumberSetting initialValue132 = initialized126;
        java.lang.Object initialValue133 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue132))))));
        java.lang.Object initialValue134 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue130))))));
        java.lang.Object initialValue135 = recovery$indy$flow$735(initialValue133, initialValue131, initialValue134, initialValue129, (short) (initialValue128));
        java.lang.Object initialValue136 = recovery$indy$flow$736(this);
        byte converted137 = (byte) (constructorPart14);
        int initialValue138 = (int) (converted137);
        java.lang.Object initialValue139 = initialValue136;
        int initialValue140 = constructorPart13;
        int initialValue141 = constructorPart12;
        java.lang.Object initialValue142 = initialValue135;
        java.lang.Object initialValue143 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue142))))));
        java.lang.Object initialValue144 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue139))))));
        java.lang.Object initialValue145 = recovery$indy$flow$739(initialValue143, initialValue141, initialValue140, initialValue144, (byte) (initialValue138));
        java.lang.Object initialValue146 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue145))))));
        recovery$indy$flow$741(this, initialValue146);
        java.lang.Object initialValue147 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingBox));
        byte converted148 = (byte) (constructorPart20);
        client.setting.ShaderOptions initialized149 = new client.setting.ShaderOptions(constructorPart18, constructorPart19, this, "Box", converted148, (client.setting.SettingGroup) (initialValue147));
        long initialValue150 = constructorKey10;
        client.setting.ShaderOptions initialValue151 = initialized149;
        java.lang.Object initialValue152 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue151))))));
        java.lang.Object initialValue153 = recovery$indy$flow$746(initialValue152, initialValue150);
        java.lang.Object initialValue154 = recovery$indy$flow$747();
        java.lang.Object initialValue155 = initialValue154;
        long initialValue156 = constructorKey25;
        java.lang.Object initialValue157 = initialValue153;
        java.lang.Object initialValue158 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue157))))));
        java.lang.Object initialValue159 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue155))))));
        java.lang.Object initialValue160 = recovery$indy$flow$750(initialValue158, initialValue156, initialValue159);
        recovery$indy$flow$751(this, initialValue160);
        client.setting.SettingGroup initialized161 = new client.setting.SettingGroup(this, "HitBox", true, constructorKey21);
        java.lang.Object initialValue162 = recovery$indy$flow$754();
        char converted163 = (char) (constructorPart23);
        java.lang.Object initialValue164 = initialValue162;
        int initialValue165 = constructorPart24;
        int initialValue166 = (int) (converted163);
        int initialValue167 = constructorPart22;
        client.setting.SettingGroup initialValue168 = initialized161;
        java.lang.Object initialValue169 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue168))))));
        java.lang.Object initialValue170 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue164))))));
        java.lang.Object initialValue171 = recovery$indy$flow$757(initialValue169, initialValue167, (char) (initialValue166), initialValue165, initialValue170);
        recovery$indy$flow$758(this, initialValue171);
        short converted172 = (short) (constructorPart15);
        char converted173 = (char) (constructorPart16);
        java.lang.Object initialValue174 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingHitBox));
        client.setting.BooleanSetting initialized175 = new client.setting.BooleanSetting(this, "HitBoxTeamColor", converted172, converted173, constructorPart17, false, (client.setting.SettingGroup) (initialValue174));
        long initialValue176 = constructorKey8;
        java.lang.String initialValue177 = "TeamColor";
        client.setting.BooleanSetting initialValue178 = initialized175;
        java.lang.Object initialValue179 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue178))))));
        java.lang.Object initialValue180 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue177))))));
        java.lang.Object initialValue181 = recovery$indy$flow$764(initialValue179, initialValue180, initialValue176);
        java.lang.Object initialValue182 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue181))))));
        recovery$indy$flow$766(this, initialValue182);
        java.awt.Color initialized183 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue184 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingHitBox));
        client.setting.ColorSetting initialized185 = new client.setting.ColorSetting(this, "HitBoxColor", constructorKey7, initialized183, (client.setting.SettingGroup) (initialValue184));
        long initialValue186 = constructorKey8;
        java.lang.String initialValue187 = "Color";
        client.setting.ColorSetting initialValue188 = initialized185;
        java.lang.Object initialValue189 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue188))))));
        java.lang.Object initialValue190 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue187))))));
        java.lang.Object initialValue191 = recovery$indy$flow$774(initialValue189, initialValue190, initialValue186);
        java.lang.Object initialValue192 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue191))))));
        java.lang.Object initialValue193 = recovery$indy$flow$776(this);
        java.lang.Object initialValue194 = initialValue193;
        long initialValue195 = constructorKey3;
        java.lang.Object initialValue196 = initialValue192;
        java.lang.Object initialValue197 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue196))))));
        java.lang.Object initialValue198 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue194))))));
        java.lang.Object initialValue199 = recovery$indy$flow$779(initialValue197, initialValue195, initialValue198);
        java.lang.Object initialValue200 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue199))))));
        recovery$indy$flow$781(this, initialValue200);
        short converted201 = (short) (constructorPart15);
        char converted202 = (char) (constructorPart16);
        java.lang.Object initialValue203 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingHitBox));
        client.setting.BooleanSetting initialized204 = new client.setting.BooleanSetting(this, "HitBoxHitColorBool", converted201, converted202, constructorPart17, false, (client.setting.SettingGroup) (initialValue203));
        recovery$indy$flow$785(this, initialized204);
        java.awt.Color initialized205 = new java.awt.Color(255, 0, 0, 65);
        java.lang.Object initialValue206 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingHitBox));
        client.setting.ColorSetting initialized207 = new client.setting.ColorSetting(this, "HitBoxHitColor", constructorKey7, initialized205, (client.setting.SettingGroup) (initialValue206));
        long initialValue208 = constructorKey8;
        java.lang.String initialValue209 = "HitColor";
        client.setting.ColorSetting initialValue210 = initialized207;
        java.lang.Object initialValue211 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue210))))));
        java.lang.Object initialValue212 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue209))))));
        java.lang.Object initialValue213 = recovery$indy$flow$793(initialValue211, initialValue212, initialValue208);
        java.lang.Object initialValue214 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue213))))));
        java.lang.Object initialValue215 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingHitBoxHitColorBool));
        java.lang.Object initialValue216 = recovery$indy$flow$796(initialValue215);
        java.lang.Object initialValue217 = recovery$indy$flow$797(initialValue215);
        java.lang.Object initialValue218 = initialValue217;
        long initialValue219 = constructorKey3;
        java.lang.Object initialValue220 = initialValue214;
        java.lang.Object initialValue221 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue220))))));
        java.lang.Object initialValue222 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue218))))));
        java.lang.Object initialValue223 = recovery$indy$flow$800(initialValue221, initialValue219, initialValue222);
        java.lang.Object initialValue224 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue223))))));
        recovery$indy$flow$802(this, initialValue224);
        java.lang.Object initialValue225 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingHitBox));
        client.setting.NumberSetting initialized226 = new client.setting.NumberSetting(this, "HitBoxLineWidth", Double.longBitsToDouble(4618441417868443648L), 0.0D, Double.longBitsToDouble(4624633867356078080L), 0, (client.setting.SettingGroup) (initialValue225), constructorKey27);
        short converted227 = (short) (constructorPart6);
        int initialValue228 = (int) (converted227);
        int initialValue229 = constructorPart5;
        java.lang.String initialValue230 = "LineWidth";
        int initialValue231 = constructorPart4;
        client.setting.NumberSetting initialValue232 = initialized226;
        java.lang.Object initialValue233 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue232))))));
        java.lang.Object initialValue234 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue230))))));
        java.lang.Object initialValue235 = recovery$indy$flow$808(initialValue233, initialValue231, initialValue234, initialValue229, (short) (initialValue228));
        recovery$indy$flow$809(this, initialValue235);
        java.lang.Object initialValue236 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingHitBox));
        client.setting.NumberSetting initialized237 = new client.setting.NumberSetting(this, "HitBoxPriority", 1.0D, 0.0D, Double.longBitsToDouble(4613937818241073152L), 0, (client.setting.SettingGroup) (initialValue236), constructorKey27);
        short converted238 = (short) (constructorPart6);
        int initialValue239 = (int) (converted238);
        int initialValue240 = constructorPart5;
        java.lang.String initialValue241 = "3DPriority";
        int initialValue242 = constructorPart4;
        client.setting.NumberSetting initialValue243 = initialized237;
        java.lang.Object initialValue244 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue243))))));
        java.lang.Object initialValue245 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue241))))));
        java.lang.Object initialValue246 = recovery$indy$flow$815(initialValue244, initialValue242, initialValue245, initialValue240, (short) (initialValue239));
        java.lang.Object initialValue247 = recovery$indy$flow$816(this);
        byte converted248 = (byte) (constructorPart14);
        int initialValue249 = (int) (converted248);
        java.lang.Object initialValue250 = initialValue247;
        int initialValue251 = constructorPart13;
        int initialValue252 = constructorPart12;
        java.lang.Object initialValue253 = initialValue246;
        java.lang.Object initialValue254 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue253))))));
        java.lang.Object initialValue255 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue250))))));
        java.lang.Object initialValue256 = recovery$indy$flow$819(initialValue254, initialValue252, initialValue251, initialValue255, (byte) (initialValue249));
        java.lang.Object initialValue257 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue256))))));
        recovery$indy$flow$821(this, initialValue257);
        java.lang.Object initialValue258 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingHitBox));
        byte converted259 = (byte) (constructorPart20);
        client.setting.ShaderOptions initialized260 = new client.setting.ShaderOptions(constructorPart18, constructorPart19, this, "HitBox", converted259, (client.setting.SettingGroup) (initialValue258));
        long initialValue261 = constructorKey10;
        client.setting.ShaderOptions initialValue262 = initialized260;
        java.lang.Object initialValue263 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue262))))));
        java.lang.Object initialValue264 = recovery$indy$flow$826(initialValue263, initialValue261);
        java.lang.Object initialValue265 = recovery$indy$flow$827();
        java.lang.Object initialValue266 = initialValue265;
        long initialValue267 = constructorKey25;
        java.lang.Object initialValue268 = initialValue264;
        java.lang.Object initialValue269 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue268))))));
        java.lang.Object initialValue270 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue266))))));
        java.lang.Object initialValue271 = recovery$indy$flow$830(initialValue269, initialValue267, initialValue270);
        recovery$indy$flow$831(this, initialValue271);
        client.setting.SettingGroup initialized272 = new client.setting.SettingGroup(this, "CollisionBox", true, constructorKey21);
        java.lang.Object initialValue273 = recovery$indy$flow$834();
        char converted274 = (char) (constructorPart23);
        java.lang.Object initialValue275 = initialValue273;
        int initialValue276 = constructorPart24;
        int initialValue277 = (int) (converted274);
        int initialValue278 = constructorPart22;
        client.setting.SettingGroup initialValue279 = initialized272;
        java.lang.Object initialValue280 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue279))))));
        java.lang.Object initialValue281 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue275))))));
        java.lang.Object initialValue282 = recovery$indy$flow$837(initialValue280, initialValue278, (char) (initialValue277), initialValue276, initialValue281);
        recovery$indy$flow$838(this, initialValue282);
        short converted283 = (short) (constructorPart15);
        char converted284 = (char) (constructorPart16);
        java.lang.Object initialValue285 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCollisionBox));
        client.setting.BooleanSetting initialized286 = new client.setting.BooleanSetting(this, "CollisionBoxTeamColor", converted283, converted284, constructorPart17, false, (client.setting.SettingGroup) (initialValue285));
        long initialValue287 = constructorKey8;
        java.lang.String initialValue288 = "TeamColor";
        client.setting.BooleanSetting initialValue289 = initialized286;
        java.lang.Object initialValue290 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue289))))));
        java.lang.Object initialValue291 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue288))))));
        java.lang.Object initialValue292 = recovery$indy$flow$844(initialValue290, initialValue291, initialValue287);
        java.lang.Object initialValue293 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue292))))));
        recovery$indy$flow$846(this, initialValue293);
        java.awt.Color initialized294 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue295 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCollisionBox));
        client.setting.ColorSetting initialized296 = new client.setting.ColorSetting(this, "CollisionBoxColor", constructorKey7, initialized294, (client.setting.SettingGroup) (initialValue295));
        long initialValue297 = constructorKey8;
        java.lang.String initialValue298 = "Color";
        client.setting.ColorSetting initialValue299 = initialized296;
        java.lang.Object initialValue300 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue299))))));
        java.lang.Object initialValue301 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue298))))));
        java.lang.Object initialValue302 = recovery$indy$flow$854(initialValue300, initialValue301, initialValue297);
        java.lang.Object initialValue303 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue302))))));
        java.lang.Object initialValue304 = recovery$indy$flow$856(this);
        java.lang.Object initialValue305 = initialValue304;
        long initialValue306 = constructorKey3;
        java.lang.Object initialValue307 = initialValue303;
        java.lang.Object initialValue308 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue307))))));
        java.lang.Object initialValue309 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue305))))));
        java.lang.Object initialValue310 = recovery$indy$flow$859(initialValue308, initialValue306, initialValue309);
        java.lang.Object initialValue311 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue310))))));
        recovery$indy$flow$861(this, initialValue311);
        short converted312 = (short) (constructorPart15);
        char converted313 = (char) (constructorPart16);
        java.lang.Object initialValue314 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCollisionBox));
        client.setting.BooleanSetting initialized315 = new client.setting.BooleanSetting(this, "CollisionBoxHitColorBool", converted312, converted313, constructorPart17, false, (client.setting.SettingGroup) (initialValue314));
        recovery$indy$flow$865(this, initialized315);
        java.awt.Color initialized316 = new java.awt.Color(255, 0, 0, 65);
        java.lang.Object initialValue317 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCollisionBox));
        client.setting.ColorSetting initialized318 = new client.setting.ColorSetting(this, "CollisionBoxHitColor", constructorKey7, initialized316, (client.setting.SettingGroup) (initialValue317));
        long initialValue319 = constructorKey8;
        java.lang.String initialValue320 = "HitColor";
        client.setting.ColorSetting initialValue321 = initialized318;
        java.lang.Object initialValue322 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue321))))));
        java.lang.Object initialValue323 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue320))))));
        java.lang.Object initialValue324 = recovery$indy$flow$873(initialValue322, initialValue323, initialValue319);
        java.lang.Object initialValue325 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue324))))));
        java.lang.Object initialValue326 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCollisionBoxHitColorBool));
        java.lang.Object initialValue327 = recovery$indy$flow$876(initialValue326);
        java.lang.Object initialValue328 = recovery$indy$flow$877(initialValue326);
        java.lang.Object initialValue329 = initialValue328;
        long initialValue330 = constructorKey3;
        java.lang.Object initialValue331 = initialValue325;
        java.lang.Object initialValue332 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue331))))));
        java.lang.Object initialValue333 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue329))))));
        java.lang.Object initialValue334 = recovery$indy$flow$880(initialValue332, initialValue330, initialValue333);
        java.lang.Object initialValue335 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue334))))));
        recovery$indy$flow$882(this, initialValue335);
        java.lang.Object initialValue336 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCollisionBox));
        client.setting.NumberSetting initialized337 = new client.setting.NumberSetting(this, "CollisionBoxLineWidth", Double.longBitsToDouble(4618441417868443648L), 0.0D, Double.longBitsToDouble(4624633867356078080L), 0, (client.setting.SettingGroup) (initialValue336), constructorKey27);
        short converted338 = (short) (constructorPart6);
        int initialValue339 = (int) (converted338);
        int initialValue340 = constructorPart5;
        java.lang.String initialValue341 = "LineWidth";
        int initialValue342 = constructorPart4;
        client.setting.NumberSetting initialValue343 = initialized337;
        java.lang.Object initialValue344 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue343))))));
        java.lang.Object initialValue345 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue341))))));
        java.lang.Object initialValue346 = recovery$indy$flow$888(initialValue344, initialValue342, initialValue345, initialValue340, (short) (initialValue339));
        recovery$indy$flow$889(this, initialValue346);
        java.lang.Object initialValue347 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCollisionBox));
        client.setting.NumberSetting initialized348 = new client.setting.NumberSetting(this, "CollisionBoxPriority", Double.longBitsToDouble(4611686018427387904L), 0.0D, Double.longBitsToDouble(4613937818241073152L), 0, (client.setting.SettingGroup) (initialValue347), constructorKey27);
        short converted349 = (short) (constructorPart6);
        int initialValue350 = (int) (converted349);
        int initialValue351 = constructorPart5;
        java.lang.String initialValue352 = "3DPriority";
        int initialValue353 = constructorPart4;
        client.setting.NumberSetting initialValue354 = initialized348;
        java.lang.Object initialValue355 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue354))))));
        java.lang.Object initialValue356 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue352))))));
        java.lang.Object initialValue357 = recovery$indy$flow$895(initialValue355, initialValue353, initialValue356, initialValue351, (short) (initialValue350));
        java.lang.Object initialValue358 = recovery$indy$flow$896(this);
        byte converted359 = (byte) (constructorPart14);
        int initialValue360 = (int) (converted359);
        java.lang.Object initialValue361 = initialValue358;
        int initialValue362 = constructorPart13;
        int initialValue363 = constructorPart12;
        java.lang.Object initialValue364 = initialValue357;
        java.lang.Object initialValue365 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue364))))));
        java.lang.Object initialValue366 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue361))))));
        java.lang.Object initialValue367 = recovery$indy$flow$899(initialValue365, initialValue363, initialValue362, initialValue366, (byte) (initialValue360));
        java.lang.Object initialValue368 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue367))))));
        recovery$indy$flow$901(this, initialValue368);
        java.lang.Object initialValue369 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCollisionBox));
        byte converted370 = (byte) (constructorPart20);
        client.setting.ShaderOptions initialized371 = new client.setting.ShaderOptions(constructorPart18, constructorPart19, this, "CollisionBox", converted370, (client.setting.SettingGroup) (initialValue369));
        long initialValue372 = constructorKey10;
        client.setting.ShaderOptions initialValue373 = initialized371;
        java.lang.Object initialValue374 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue373))))));
        java.lang.Object initialValue375 = recovery$indy$flow$906(initialValue374, initialValue372);
        java.lang.Object initialValue376 = recovery$indy$flow$907();
        java.lang.Object initialValue377 = initialValue376;
        long initialValue378 = constructorKey25;
        java.lang.Object initialValue379 = initialValue375;
        java.lang.Object initialValue380 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue379))))));
        java.lang.Object initialValue381 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue377))))));
        java.lang.Object initialValue382 = recovery$indy$flow$910(initialValue380, initialValue378, initialValue381);
        recovery$indy$flow$911(this, initialValue382);
        client.setting.SettingGroup initialized383 = new client.setting.SettingGroup(this, "3DCorner", true, constructorKey21);
        java.lang.Object initialValue384 = recovery$indy$flow$914();
        char converted385 = (char) (constructorPart23);
        java.lang.Object initialValue386 = initialValue384;
        int initialValue387 = constructorPart24;
        int initialValue388 = (int) (converted385);
        int initialValue389 = constructorPart22;
        client.setting.SettingGroup initialValue390 = initialized383;
        java.lang.Object initialValue391 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue390))))));
        java.lang.Object initialValue392 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue386))))));
        java.lang.Object initialValue393 = recovery$indy$flow$917(initialValue391, initialValue389, (char) (initialValue388), initialValue387, initialValue392);
        recovery$indy$flow$918(this, initialValue393);
        short converted394 = (short) (constructorPart15);
        char converted395 = (char) (constructorPart16);
        java.lang.Object initialValue396 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).setting3DCorner));
        client.setting.BooleanSetting initialized397 = new client.setting.BooleanSetting(this, "FakeCornerTeamColor", converted394, converted395, constructorPart17, false, (client.setting.SettingGroup) (initialValue396));
        long initialValue398 = constructorKey8;
        java.lang.String initialValue399 = "TeamColor";
        client.setting.BooleanSetting initialValue400 = initialized397;
        java.lang.Object initialValue401 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue400))))));
        java.lang.Object initialValue402 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue399))))));
        java.lang.Object initialValue403 = recovery$indy$flow$924(initialValue401, initialValue402, initialValue398);
        java.lang.Object initialValue404 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue403))))));
        recovery$indy$flow$926(this, initialValue404);
        java.awt.Color initialized405 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue406 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).setting3DCorner));
        client.setting.ColorSetting initialized407 = new client.setting.ColorSetting(this, "FakeCornerColor", constructorKey7, initialized405, (client.setting.SettingGroup) (initialValue406));
        long initialValue408 = constructorKey8;
        java.lang.String initialValue409 = "Color";
        client.setting.ColorSetting initialValue410 = initialized407;
        java.lang.Object initialValue411 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue410))))));
        java.lang.Object initialValue412 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue409))))));
        java.lang.Object initialValue413 = recovery$indy$flow$934(initialValue411, initialValue412, initialValue408);
        java.lang.Object initialValue414 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue413))))));
        java.lang.Object initialValue415 = recovery$indy$flow$936(this);
        java.lang.Object initialValue416 = initialValue415;
        long initialValue417 = constructorKey3;
        java.lang.Object initialValue418 = initialValue414;
        java.lang.Object initialValue419 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue418))))));
        java.lang.Object initialValue420 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue416))))));
        java.lang.Object initialValue421 = recovery$indy$flow$939(initialValue419, initialValue417, initialValue420);
        java.lang.Object initialValue422 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue421))))));
        recovery$indy$flow$941(this, initialValue422);
        short converted423 = (short) (constructorPart15);
        char converted424 = (char) (constructorPart16);
        java.lang.Object initialValue425 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).setting3DCorner));
        client.setting.BooleanSetting initialized426 = new client.setting.BooleanSetting(this, "FakeCornerHitColorBool", converted423, converted424, constructorPart17, false, (client.setting.SettingGroup) (initialValue425));
        recovery$indy$flow$945(this, initialized426);
        java.awt.Color initialized427 = new java.awt.Color(255, 0, 0, 65);
        java.lang.Object initialValue428 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).setting3DCorner));
        client.setting.ColorSetting initialized429 = new client.setting.ColorSetting(this, "FakeCornerHitColor", constructorKey7, initialized427, (client.setting.SettingGroup) (initialValue428));
        long initialValue430 = constructorKey8;
        java.lang.String initialValue431 = "HitColor";
        client.setting.ColorSetting initialValue432 = initialized429;
        java.lang.Object initialValue433 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue432))))));
        java.lang.Object initialValue434 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue431))))));
        java.lang.Object initialValue435 = recovery$indy$flow$953(initialValue433, initialValue434, initialValue430);
        java.lang.Object initialValue436 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue435))))));
        java.lang.Object initialValue437 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingFakeCornerHitColorBool));
        java.lang.Object initialValue438 = recovery$indy$flow$956(initialValue437);
        java.lang.Object initialValue439 = recovery$indy$flow$957(initialValue437);
        java.lang.Object initialValue440 = initialValue439;
        long initialValue441 = constructorKey3;
        java.lang.Object initialValue442 = initialValue436;
        java.lang.Object initialValue443 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue442))))));
        java.lang.Object initialValue444 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue440))))));
        java.lang.Object initialValue445 = recovery$indy$flow$960(initialValue443, initialValue441, initialValue444);
        java.lang.Object initialValue446 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue445))))));
        recovery$indy$flow$962(this, initialValue446);
        java.lang.Object initialValue447 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).setting3DCorner));
        client.setting.NumberSetting initialized448 = new client.setting.NumberSetting(this, "FakeCornerPriority", Double.longBitsToDouble(4613937818241073152L), 0.0D, Double.longBitsToDouble(4613937818241073152L), 0, (client.setting.SettingGroup) (initialValue447), constructorKey27);
        short converted449 = (short) (constructorPart6);
        int initialValue450 = (int) (converted449);
        int initialValue451 = constructorPart5;
        java.lang.String initialValue452 = "3DPriority";
        int initialValue453 = constructorPart4;
        client.setting.NumberSetting initialValue454 = initialized448;
        java.lang.Object initialValue455 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue454))))));
        java.lang.Object initialValue456 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue452))))));
        java.lang.Object initialValue457 = recovery$indy$flow$968(initialValue455, initialValue453, initialValue456, initialValue451, (short) (initialValue450));
        java.lang.Object initialValue458 = recovery$indy$flow$969(this);
        byte converted459 = (byte) (constructorPart14);
        int initialValue460 = (int) (converted459);
        java.lang.Object initialValue461 = initialValue458;
        int initialValue462 = constructorPart13;
        int initialValue463 = constructorPart12;
        java.lang.Object initialValue464 = initialValue457;
        java.lang.Object initialValue465 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue464))))));
        java.lang.Object initialValue466 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue461))))));
        java.lang.Object initialValue467 = recovery$indy$flow$972(initialValue465, initialValue463, initialValue462, initialValue466, (byte) (initialValue460));
        java.lang.Object initialValue468 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue467))))));
        recovery$indy$flow$974(this, initialValue468);
        java.lang.Object initialValue469 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).setting3DCorner));
        byte converted470 = (byte) (constructorPart20);
        client.setting.ShaderOptions initialized471 = new client.setting.ShaderOptions(constructorPart18, constructorPart19, this, "FakeCorner", converted470, (client.setting.SettingGroup) (initialValue469));
        long initialValue472 = constructorKey10;
        client.setting.ShaderOptions initialValue473 = initialized471;
        java.lang.Object initialValue474 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue473))))));
        java.lang.Object initialValue475 = recovery$indy$flow$979(initialValue474, initialValue472);
        java.lang.Object initialValue476 = recovery$indy$flow$980();
        java.lang.Object initialValue477 = initialValue476;
        long initialValue478 = constructorKey25;
        java.lang.Object initialValue479 = initialValue475;
        java.lang.Object initialValue480 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue479))))));
        java.lang.Object initialValue481 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue477))))));
        java.lang.Object initialValue482 = recovery$indy$flow$983(initialValue480, initialValue478, initialValue481);
        recovery$indy$flow$984(this, initialValue482);
        client.setting.SettingGroup initialized483 = new client.setting.SettingGroup(this, "Real2D", true, constructorKey21);
        java.lang.Object initialValue484 = recovery$indy$flow$987();
        char converted485 = (char) (constructorPart23);
        java.lang.Object initialValue486 = initialValue484;
        int initialValue487 = constructorPart24;
        int initialValue488 = (int) (converted485);
        int initialValue489 = constructorPart22;
        client.setting.SettingGroup initialValue490 = initialized483;
        java.lang.Object initialValue491 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue490))))));
        java.lang.Object initialValue492 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue486))))));
        java.lang.Object initialValue493 = recovery$indy$flow$990(initialValue491, initialValue489, (char) (initialValue488), initialValue487, initialValue492);
        recovery$indy$flow$991(this, initialValue493);
        short converted494 = (short) (constructorPart15);
        char converted495 = (char) (constructorPart16);
        java.lang.Object initialValue496 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.BooleanSetting initialized497 = new client.setting.BooleanSetting(this, "Real2DTeamColor", converted494, converted495, constructorPart17, false, (client.setting.SettingGroup) (initialValue496));
        long initialValue498 = constructorKey8;
        java.lang.String initialValue499 = "TeamColor";
        client.setting.BooleanSetting initialValue500 = initialized497;
        java.lang.Object initialValue501 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue500))))));
        java.lang.Object initialValue502 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue499))))));
        java.lang.Object initialValue503 = recovery$indy$flow$997(initialValue501, initialValue502, initialValue498);
        java.lang.Object initialValue504 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue503))))));
        recovery$indy$flow$999(this, initialValue504);
        java.awt.Color initialized505 = new java.awt.Color(21, 121, 230, 60);
        java.lang.Object initialValue506 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.ColorSetting initialized507 = new client.setting.ColorSetting(this, "Real2DColor1", constructorKey7, initialized505, (client.setting.SettingGroup) (initialValue506));
        long initialValue508 = constructorKey8;
        java.lang.String initialValue509 = "FillColor";
        client.setting.ColorSetting initialValue510 = initialized507;
        java.lang.Object initialValue511 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue510))))));
        java.lang.Object initialValue512 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue509))))));
        java.lang.Object initialValue513 = recovery$indy$flow$1007(initialValue511, initialValue512, initialValue508);
        java.lang.Object initialValue514 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue513))))));
        recovery$indy$flow$1009(this, initialValue514);
        java.awt.Color initialized515 = new java.awt.Color(0, 0, 0);
        java.lang.Object initialValue516 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.ColorSetting initialized517 = new client.setting.ColorSetting(this, "Real2DColor2", constructorKey7, initialized515, (client.setting.SettingGroup) (initialValue516));
        long initialValue518 = constructorKey8;
        java.lang.String initialValue519 = "OutlineColor";
        client.setting.ColorSetting initialValue520 = initialized517;
        java.lang.Object initialValue521 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue520))))));
        java.lang.Object initialValue522 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue519))))));
        java.lang.Object initialValue523 = recovery$indy$flow$1017(initialValue521, initialValue522, initialValue518);
        java.lang.Object initialValue524 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue523))))));
        java.lang.Object initialValue525 = recovery$indy$flow$1019(this);
        java.lang.Object initialValue526 = initialValue525;
        long initialValue527 = constructorKey3;
        java.lang.Object initialValue528 = initialValue524;
        java.lang.Object initialValue529 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue528))))));
        java.lang.Object initialValue530 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue526))))));
        java.lang.Object initialValue531 = recovery$indy$flow$1022(initialValue529, initialValue527, initialValue530);
        java.lang.Object initialValue532 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue531))))));
        recovery$indy$flow$1024(this, initialValue532);
        short converted533 = (short) (constructorPart15);
        char converted534 = (char) (constructorPart16);
        java.lang.Object initialValue535 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.BooleanSetting initialized536 = new client.setting.BooleanSetting(this, "Real2DHitColorBool", converted533, converted534, constructorPart17, false, (client.setting.SettingGroup) (initialValue535));
        recovery$indy$flow$1028(this, initialized536);
        java.awt.Color initialized537 = new java.awt.Color(255, 0, 0, 60);
        java.lang.Object initialValue538 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.ColorSetting initialized539 = new client.setting.ColorSetting(this, "Real2DHitColor1", constructorKey7, initialized537, (client.setting.SettingGroup) (initialValue538));
        long initialValue540 = constructorKey8;
        java.lang.String initialValue541 = "FillColorHit";
        client.setting.ColorSetting initialValue542 = initialized539;
        java.lang.Object initialValue543 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue542))))));
        java.lang.Object initialValue544 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue541))))));
        java.lang.Object initialValue545 = recovery$indy$flow$1036(initialValue543, initialValue544, initialValue540);
        java.lang.Object initialValue546 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue545))))));
        java.lang.Object initialValue547 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingReal2DHitColorBool));
        java.lang.Object initialValue548 = recovery$indy$flow$1039(initialValue547);
        java.lang.Object initialValue549 = recovery$indy$flow$1040(initialValue547);
        java.lang.Object initialValue550 = initialValue549;
        long initialValue551 = constructorKey3;
        java.lang.Object initialValue552 = initialValue546;
        java.lang.Object initialValue553 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue552))))));
        java.lang.Object initialValue554 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue550))))));
        java.lang.Object initialValue555 = recovery$indy$flow$1043(initialValue553, initialValue551, initialValue554);
        java.lang.Object initialValue556 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue555))))));
        recovery$indy$flow$1045(this, initialValue556);
        java.awt.Color initialized557 = new java.awt.Color(0, 0, 0);
        java.lang.Object initialValue558 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.ColorSetting initialized559 = new client.setting.ColorSetting(this, "Real2DHitColor2", constructorKey7, initialized557, (client.setting.SettingGroup) (initialValue558));
        long initialValue560 = constructorKey8;
        java.lang.String initialValue561 = "OutlineColorHit";
        client.setting.ColorSetting initialValue562 = initialized559;
        java.lang.Object initialValue563 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue562))))));
        java.lang.Object initialValue564 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue561))))));
        java.lang.Object initialValue565 = recovery$indy$flow$1053(initialValue563, initialValue564, initialValue560);
        java.lang.Object initialValue566 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue565))))));
        java.lang.Object initialValue567 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingReal2DHitColorBool));
        java.lang.Object initialValue568 = recovery$indy$flow$1056(initialValue567);
        java.lang.Object initialValue569 = recovery$indy$flow$1057(initialValue567);
        java.lang.Object initialValue570 = initialValue569;
        long initialValue571 = constructorKey3;
        java.lang.Object initialValue572 = initialValue566;
        java.lang.Object initialValue573 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue572))))));
        java.lang.Object initialValue574 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue570))))));
        java.lang.Object initialValue575 = recovery$indy$flow$1060(initialValue573, initialValue571, initialValue574);
        java.lang.Object initialValue576 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue575))))));
        recovery$indy$flow$1062(this, initialValue576);
        java.lang.Object initialValue577 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingReal2D));
        client.setting.NumberSetting initialized578 = new client.setting.NumberSetting(this, "Real2DPriority", 0.0D, 0.0D, 1.0D, 0, (client.setting.SettingGroup) (initialValue577), constructorKey27);
        short converted579 = (short) (constructorPart6);
        int initialValue580 = (int) (converted579);
        int initialValue581 = constructorPart5;
        java.lang.String initialValue582 = "2DPriority";
        int initialValue583 = constructorPart4;
        client.setting.NumberSetting initialValue584 = initialized578;
        java.lang.Object initialValue585 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue584))))));
        java.lang.Object initialValue586 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue582))))));
        java.lang.Object initialValue587 = recovery$indy$flow$1068(initialValue585, initialValue583, initialValue586, initialValue581, (short) (initialValue580));
        java.lang.Object initialValue588 = recovery$indy$flow$1069(this);
        byte converted589 = (byte) (constructorPart14);
        int initialValue590 = (int) (converted589);
        java.lang.Object initialValue591 = initialValue588;
        int initialValue592 = constructorPart13;
        int initialValue593 = constructorPart12;
        java.lang.Object initialValue594 = initialValue587;
        java.lang.Object initialValue595 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue594))))));
        java.lang.Object initialValue596 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue591))))));
        java.lang.Object initialValue597 = recovery$indy$flow$1072(initialValue595, initialValue593, initialValue592, initialValue596, (byte) (initialValue590));
        java.lang.Object initialValue598 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue597))))));
        recovery$indy$flow$1074(this, initialValue598);
        java.lang.Object initialValue599 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingReal2D));
        byte converted600 = (byte) (constructorPart20);
        client.setting.ShaderOptions initialized601 = new client.setting.ShaderOptions(constructorPart18, constructorPart19, this, "Real2D", converted600, (client.setting.SettingGroup) (initialValue599));
        long initialValue602 = constructorKey10;
        client.setting.ShaderOptions initialValue603 = initialized601;
        java.lang.Object initialValue604 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue603))))));
        java.lang.Object initialValue605 = recovery$indy$flow$1079(initialValue604, initialValue602);
        java.lang.Object initialValue606 = recovery$indy$flow$1080();
        java.lang.Object initialValue607 = initialValue606;
        long initialValue608 = constructorKey25;
        java.lang.Object initialValue609 = initialValue605;
        java.lang.Object initialValue610 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue609))))));
        java.lang.Object initialValue611 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue607))))));
        java.lang.Object initialValue612 = recovery$indy$flow$1083(initialValue610, initialValue608, initialValue611);
        recovery$indy$flow$1084(this, initialValue612);
        client.setting.SettingGroup initialized613 = new client.setting.SettingGroup(this, "Corner", true, constructorKey21);
        java.lang.Object initialValue614 = recovery$indy$flow$1087();
        char converted615 = (char) (constructorPart23);
        java.lang.Object initialValue616 = initialValue614;
        int initialValue617 = constructorPart24;
        int initialValue618 = (int) (converted615);
        int initialValue619 = constructorPart22;
        client.setting.SettingGroup initialValue620 = initialized613;
        java.lang.Object initialValue621 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue620))))));
        java.lang.Object initialValue622 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue616))))));
        java.lang.Object initialValue623 = recovery$indy$flow$1090(initialValue621, initialValue619, (char) (initialValue618), initialValue617, initialValue622);
        recovery$indy$flow$1091(this, initialValue623);
        short converted624 = (short) (constructorPart15);
        char converted625 = (char) (constructorPart16);
        java.lang.Object initialValue626 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCorner));
        client.setting.BooleanSetting initialized627 = new client.setting.BooleanSetting(this, "CornerTeamColor", converted624, converted625, constructorPart17, false, (client.setting.SettingGroup) (initialValue626));
        long initialValue628 = constructorKey8;
        java.lang.String initialValue629 = "TeamColor";
        client.setting.BooleanSetting initialValue630 = initialized627;
        java.lang.Object initialValue631 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue630))))));
        java.lang.Object initialValue632 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue629))))));
        java.lang.Object initialValue633 = recovery$indy$flow$1097(initialValue631, initialValue632, initialValue628);
        java.lang.Object initialValue634 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue633))))));
        recovery$indy$flow$1099(this, initialValue634);
        java.awt.Color initialized635 = new java.awt.Color(21, 121, 230);
        java.lang.Object initialValue636 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCorner));
        client.setting.ColorSetting initialized637 = new client.setting.ColorSetting(this, "CornerColor", constructorKey7, initialized635, (client.setting.SettingGroup) (initialValue636));
        long initialValue638 = constructorKey8;
        java.lang.String initialValue639 = "Color";
        client.setting.ColorSetting initialValue640 = initialized637;
        java.lang.Object initialValue641 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue640))))));
        java.lang.Object initialValue642 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue639))))));
        java.lang.Object initialValue643 = recovery$indy$flow$1107(initialValue641, initialValue642, initialValue638);
        java.lang.Object initialValue644 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue643))))));
        java.lang.Object initialValue645 = recovery$indy$flow$1109(this);
        java.lang.Object initialValue646 = initialValue645;
        long initialValue647 = constructorKey3;
        java.lang.Object initialValue648 = initialValue644;
        java.lang.Object initialValue649 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue648))))));
        java.lang.Object initialValue650 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue646))))));
        java.lang.Object initialValue651 = recovery$indy$flow$1112(initialValue649, initialValue647, initialValue650);
        java.lang.Object initialValue652 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue651))))));
        recovery$indy$flow$1114(this, initialValue652);
        short converted653 = (short) (constructorPart15);
        char converted654 = (char) (constructorPart16);
        java.lang.Object initialValue655 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCorner));
        client.setting.BooleanSetting initialized656 = new client.setting.BooleanSetting(this, "CornerHitColorBool", converted653, converted654, constructorPart17, true, (client.setting.SettingGroup) (initialValue655));
        long initialValue657 = constructorKey8;
        java.lang.String initialValue658 = "HitColor";
        client.setting.BooleanSetting initialValue659 = initialized656;
        java.lang.Object initialValue660 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue659))))));
        java.lang.Object initialValue661 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue658))))));
        java.lang.Object initialValue662 = recovery$indy$flow$1120(initialValue660, initialValue661, initialValue657);
        java.lang.Object initialValue663 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue662))))));
        recovery$indy$flow$1122(this, initialValue663);
        java.lang.Object initialValue664 = initialValue31;
        java.awt.Color initialized665 = new java.awt.Color(21, 121, 230);
        java.lang.Object initialValue666 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCorner));
        client.setting.ColorSetting initialized667 = new client.setting.ColorSetting(this, "CornerHitColor", constructorKey7, initialized665, (client.setting.SettingGroup) (initialValue666));
        java.lang.Object initialValue668 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCornerHitColorBool));
        java.lang.Object initialValue669 = recovery$indy$flow$1129(initialValue668);
        java.lang.Object initialValue670 = recovery$indy$flow$1130(initialValue668);
        java.lang.Object initialValue671 = initialValue670;
        long initialValue672 = constructorKey3;
        client.setting.ColorSetting initialValue673 = initialized667;
        java.lang.Object initialValue674 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue673))))));
        java.lang.Object initialValue675 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue671))))));
        java.lang.Object initialValue676 = recovery$indy$flow$1133(initialValue674, initialValue672, initialValue675);
        java.lang.Object initialValue677 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue676))))));
        recovery$indy$flow$1135(this, initialValue677);
        java.lang.Object initialValue678 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCorner));
        client.setting.NumberSetting initialized679 = new client.setting.NumberSetting(this, "LineWidthCorner", Double.longBitsToDouble(4611686018427387904L), 1.0D, Double.longBitsToDouble(4617315517961601024L), 0, (client.setting.SettingGroup) (initialValue678), constructorKey27);
        short converted680 = (short) (constructorPart6);
        int initialValue681 = (int) (converted680);
        int initialValue682 = constructorPart5;
        java.lang.String initialValue683 = "LineWidth";
        int initialValue684 = constructorPart4;
        client.setting.NumberSetting initialValue685 = initialized679;
        java.lang.Object initialValue686 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue685))))));
        java.lang.Object initialValue687 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue683))))));
        java.lang.Object initialValue688 = recovery$indy$flow$1141(initialValue686, initialValue684, initialValue687, initialValue682, (short) (initialValue681));
        recovery$indy$flow$1142(this, initialValue688);
        java.lang.Object initialValue689 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCorner));
        client.setting.NumberSetting initialized690 = new client.setting.NumberSetting(this, "HorizontalPercentage", Double.longBitsToDouble(4632937379169042432L), 1.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue689), constructorKey27);
        recovery$indy$flow$1146(this, initialized690);
        java.lang.Object initialValue691 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCorner));
        client.setting.NumberSetting initialized692 = new client.setting.NumberSetting(this, "VerticalPercentage", Double.longBitsToDouble(4631530004285489152L), 1.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue691), constructorKey27);
        recovery$indy$flow$1150(this, initialized692);
        java.lang.Object initialValue693 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCorner));
        client.setting.NumberSetting initialized694 = new client.setting.NumberSetting(this, "CornerPriority", 1.0D, 0.0D, 1.0D, 0, (client.setting.SettingGroup) (initialValue693), constructorKey27);
        short converted695 = (short) (constructorPart6);
        int initialValue696 = (int) (converted695);
        int initialValue697 = constructorPart5;
        java.lang.String initialValue698 = "2DPriority";
        int initialValue699 = constructorPart4;
        client.setting.NumberSetting initialValue700 = initialized694;
        java.lang.Object initialValue701 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue700))))));
        java.lang.Object initialValue702 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue698))))));
        java.lang.Object initialValue703 = recovery$indy$flow$1156(initialValue701, initialValue699, initialValue702, initialValue697, (short) (initialValue696));
        java.lang.Object initialValue704 = recovery$indy$flow$1157(this);
        byte converted705 = (byte) (constructorPart14);
        int initialValue706 = (int) (converted705);
        java.lang.Object initialValue707 = initialValue704;
        int initialValue708 = constructorPart13;
        int initialValue709 = constructorPart12;
        java.lang.Object initialValue710 = initialValue703;
        java.lang.Object initialValue711 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue710))))));
        java.lang.Object initialValue712 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue707))))));
        java.lang.Object initialValue713 = recovery$indy$flow$1160(initialValue711, initialValue709, initialValue708, initialValue712, (byte) (initialValue706));
        java.lang.Object initialValue714 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue713))))));
        recovery$indy$flow$1162(this, initialValue714);
        java.lang.Object initialValue715 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingCorner));
        byte converted716 = (byte) (constructorPart20);
        client.setting.ShaderOptions initialized717 = new client.setting.ShaderOptions(constructorPart18, constructorPart19, this, "Corner", converted716, (client.setting.SettingGroup) (initialValue715));
        long initialValue718 = constructorKey10;
        client.setting.ShaderOptions initialValue719 = initialized717;
        java.lang.Object initialValue720 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue719))))));
        java.lang.Object initialValue721 = recovery$indy$flow$1167(initialValue720, initialValue718);
        java.lang.Object initialValue722 = recovery$indy$flow$1168();
        java.lang.Object initialValue723 = initialValue722;
        long initialValue724 = constructorKey25;
        java.lang.Object initialValue725 = initialValue721;
        java.lang.Object initialValue726 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue725))))));
        java.lang.Object initialValue727 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue723))))));
        java.lang.Object initialValue728 = recovery$indy$flow$1171(initialValue726, initialValue724, initialValue727);
        recovery$indy$flow$1172(this, initialValue728);
        client.setting.SettingGroup initialized729 = new client.setting.SettingGroup(this, "Vanilla", true, constructorKey21);
        java.lang.Object initialValue730 = recovery$indy$flow$1175();
        char converted731 = (char) (constructorPart23);
        java.lang.Object initialValue732 = initialValue730;
        int initialValue733 = constructorPart24;
        int initialValue734 = (int) (converted731);
        int initialValue735 = constructorPart22;
        client.setting.SettingGroup initialValue736 = initialized729;
        java.lang.Object initialValue737 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue736))))));
        java.lang.Object initialValue738 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue732))))));
        java.lang.Object initialValue739 = recovery$indy$flow$1178(initialValue737, initialValue735, (char) (initialValue734), initialValue733, initialValue738);
        recovery$indy$flow$1179(this, initialValue739);
        short converted740 = (short) (constructorPart15);
        char converted741 = (char) (constructorPart16);
        java.lang.Object initialValue742 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingVanilla));
        client.setting.BooleanSetting initialized743 = new client.setting.BooleanSetting(this, "VanillaTeamColor", converted740, converted741, constructorPart17, false, (client.setting.SettingGroup) (initialValue742));
        long initialValue744 = constructorKey8;
        java.lang.String initialValue745 = "TeamColor";
        client.setting.BooleanSetting initialValue746 = initialized743;
        java.lang.Object initialValue747 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue746))))));
        java.lang.Object initialValue748 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue745))))));
        java.lang.Object initialValue749 = recovery$indy$flow$1185(initialValue747, initialValue748, initialValue744);
        java.lang.Object initialValue750 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue749))))));
        recovery$indy$flow$1187(this, initialValue750);
        java.awt.Color initialized751 = new java.awt.Color(21, 121, 230, 65);
        java.lang.Object initialValue752 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingVanilla));
        client.setting.ColorSetting initialized753 = new client.setting.ColorSetting(this, "VanillaColor", constructorKey7, initialized751, (client.setting.SettingGroup) (initialValue752));
        java.lang.Object initialValue754 = recovery$indy$flow$1193(this);
        java.lang.Object initialValue755 = initialValue754;
        long initialValue756 = constructorKey3;
        client.setting.ColorSetting initialValue757 = initialized753;
        java.lang.Object initialValue758 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue757))))));
        java.lang.Object initialValue759 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue755))))));
        java.lang.Object initialValue760 = recovery$indy$flow$1196(initialValue758, initialValue756, initialValue759);
        java.lang.Object initialValue761 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue760))))));
        recovery$indy$flow$1198(this, initialValue761);
        short converted762 = (short) (constructorPart15);
        char converted763 = (char) (constructorPart16);
        java.lang.Object initialValue764 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingVanilla));
        client.setting.BooleanSetting initialized765 = new client.setting.BooleanSetting(this, "VanillaHitColorBool", converted762, converted763, constructorPart17, true, (client.setting.SettingGroup) (initialValue764));
        recovery$indy$flow$1202(this, initialized765);
        java.awt.Color initialized766 = new java.awt.Color(255, 0, 0, 65);
        java.lang.Object initialValue767 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingVanilla));
        client.setting.ColorSetting initialized768 = new client.setting.ColorSetting(this, "VanillaHitColor", constructorKey7, initialized766, (client.setting.SettingGroup) (initialValue767));
        long initialValue769 = constructorKey8;
        java.lang.String initialValue770 = "HitColor";
        client.setting.ColorSetting initialValue771 = initialized768;
        java.lang.Object initialValue772 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue771))))));
        java.lang.Object initialValue773 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue770))))));
        java.lang.Object initialValue774 = recovery$indy$flow$1210(initialValue772, initialValue773, initialValue769);
        java.lang.Object initialValue775 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue774))))));
        java.lang.Object initialValue776 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(this)))).settingVanillaHitColorBool));
        java.lang.Object initialValue777 = recovery$indy$flow$1213(initialValue776);
        java.lang.Object initialValue778 = recovery$indy$flow$1214(initialValue776);
        java.lang.Object initialValue779 = initialValue778;
        long initialValue780 = constructorKey3;
        java.lang.Object initialValue781 = initialValue775;
        java.lang.Object initialValue782 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue781))))));
        java.lang.Object initialValue783 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue779))))));
        java.lang.Object initialValue784 = recovery$indy$flow$1217(initialValue782, initialValue780, initialValue783);
        java.lang.Object initialValue785 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue784))))));
        recovery$indy$flow$1219(this, initialValue785);
        java.lang.Object initialValue786 = recovery$indy$flow$1221();
        client.setting.MultiSelectSetting initialized787 = new client.setting.MultiSelectSetting(this, "Entities", constructorKey11, (net.C_47OZ[]) (initialValue786));
        recovery$indy$flow$1223(this, initialized787);
        client.setting.NumberSetting initialized788 = new client.setting.NumberSetting(this, "MaximumRenderDistance", Double.longBitsToDouble(4647503709213818880L), constructorKey26, 0.0D, Double.longBitsToDouble(4647503709213818880L), 0);
        recovery$indy$flow$1226(this, initialized788);
        java.util.ArrayList initialized789 = new java.util.ArrayList();
        recovery$indy$flow$1229(this, initialized789);
        java.util.HashMap initialized790 = new java.util.HashMap();
        recovery$indy$flow$1232(this, initialized790);
        net.C_47b0 initialized791 = new net.C_47b0();
        recovery$indy$flow$1235(this, initialized791);
        it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap initialized792 = new it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap();
        recovery$indy$flow$1238(this, initialized792);
        it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap initialized793 = new it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap();
        recovery$indy$flow$1241(this, initialized793);
        ESP_47HY initialValue794 = this;
        java.lang.Object initialValue795 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(initialValue794))))));
        recovery$indy$flow$1243(initialValue795);
        ESP_47HY initialValue796 = this;
        java.lang.Object initialValue797 = ((java.lang.Object)(((augustus.recovered.modules.render.ESP_47HY) (((java.lang.Object)(initialValue796))))));
        recovery$indy$flow$1245(initialValue797);
        if (initialValue664 == null) {
            return;
        } else {
            java.lang.Object initialValue798 = recovery$indy$flow$1246(1);
            java.lang.Object initialValue799 = initialValue798;
            java.lang.Object initialValue800 = recovery$indy$flow$1247(initialValue799);
            recovery$indy$flow$1248(initialValue800);
            return;
        }
    }























    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$648();
    private static native void recovery$indy$flow$650(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$653(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$654();

    private static java.lang.Object recovery$indy$flow$658(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$659(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$662(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$664(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$667(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$670(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$671(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$674();


    private static native java.lang.Object recovery$indy$flow$677(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$678(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$684(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$686(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$694(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$696(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$699(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$701(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$705(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$713(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$716(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$717(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$720(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$722(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$728(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native void recovery$indy$flow$729(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$735(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$736(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$739(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$741(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$746(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$747() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$750(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$751(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$754();


    private static native java.lang.Object recovery$indy$flow$757(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$758(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$764(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$766(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$774(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$776(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$779(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$781(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$785(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$793(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$796(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$797(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$800(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$802(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$808(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native void recovery$indy$flow$809(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$815(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$816(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$819(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$821(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$826(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$827() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$830(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$831(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$834();


    private static native java.lang.Object recovery$indy$flow$837(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$838(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$844(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$846(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$854(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$856(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$859(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$861(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$865(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$873(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$876(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$877(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$880(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$882(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$888(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native void recovery$indy$flow$889(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$895(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$896(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$899(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$901(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$906(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$907() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$910(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$911(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$914();


    private static native java.lang.Object recovery$indy$flow$917(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$918(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$924(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$926(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$934(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$936(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$939(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$941(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$945(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$953(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$956(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$957(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$960(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$962(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$968(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$969(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$972(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$974(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$979(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$980() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$983(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$984(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$987();


    private static native java.lang.Object recovery$indy$flow$990(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$991(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$997(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$999(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1007(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$1009(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1017(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1019(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1022(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1024(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$1028(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1036(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1039(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1040(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1043(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1045(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1053(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1056(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1057(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1060(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1062(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1068(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$1069(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1072(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$1074(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1079(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$1080() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$1083(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$1084(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1087();


    private static native java.lang.Object recovery$indy$flow$1090(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$1091(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1097(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$1099(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1107(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1109(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1112(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1114(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1120(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$1122(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$1129(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1130(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1133(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1135(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1141(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native void recovery$indy$flow$1142(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$1146(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$1150(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1156(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$1157(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1160(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$1162(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1167(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$1168() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$1171(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$1172(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1175();


    private static native java.lang.Object recovery$indy$flow$1178(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$1179(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1185(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$1187(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1193(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1196(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1198(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$1202(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1210(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1213(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1214(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1217(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1219(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1221();
    private static native void recovery$indy$flow$1223(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1226(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1229(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1232(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1235(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1238(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1241(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$1243(java.lang.Object a0);

    private static native void recovery$indy$flow$1245(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$1246(int a0);
    private static java.lang.Object recovery$indy$flow$1247(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }
    private static native void recovery$indy$flow$1248(java.lang.Object a0);
   private static native MethodHandle recovery$constant$0();
   private static native int recovery$indy$1(
      Object var0, Object var1, int var2, Object var3, Object var4, long var5, boolean var7, boolean var8, boolean var9, long var10, long var12
   );
   private static native C_47Fw recovery$indy$2(ESP_47HY var0);
   private static native C_47Fw recovery$indy$3(ESP_47HY var0);
   private static native C_47Fw recovery$indy$4(ESP_47HY var0);
   private static native int[] recovery$indy$5(long var0, long var2);
   private static native Runnable recovery$indy$6(ESP_47HY var0);
   private static native Runnable recovery$indy$7(ESP_47HY var0);
   private static native Runnable recovery$indy$8(ESP_47HY var0);
   private static native Runnable recovery$indy$9(ESP_47HY var0);
   private static native C_47Fw recovery$indy$10(ESP_47HY var0);
   private static native C_47Fw recovery$indy$11(ESP_47HY var0);
   private static native Runnable recovery$indy$12(ESP_47HY var0);
   private static native Runnable recovery$indy$13(ESP_47HY var0);
   private static native int[] recovery$indy$14(long var0, long var2);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3);
   private static native boolean recovery$indy$16(Object var0, long var1, long var3);
   private static native boolean recovery$indy$17(Object var0, long var1, long var3);
   private static native boolean recovery$indy$18(Object var0, long var1, long var3);
   private static native boolean recovery$indy$19(Object var0, long var1, long var3);
   private static native boolean recovery$indy$20(Object var0, long var1, long var3);
   private static native boolean recovery$indy$21(
      Object var0,
      boolean var1,
      boolean var2,
      short var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      int var10,
      boolean var11,
      char var12,
      long var13,
      long var15
   );
   private static native EntityPlayerSP recovery$indy$22(Object var0, long var1, long var3);
   private static native double recovery$indy$23(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$24(long var0, long var2);
   private static native Entity recovery$indy$25(Object var0, long var1, long var3);
   private static native Entity recovery$indy$26(Object var0, long var1, long var3);
   private static native Entity recovery$indy$27(Object var0, long var1, long var3);
   private static native boolean recovery$indy$28(Object var0, long var1, long var3, long var5);
   private static native C_47Fw recovery$indy$29(ESP_47HY var0);
   private static native int[] recovery$indy$30(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);
   private static native int[] recovery$indy$33(long var0, long var2);
   private static native boolean recovery$indy$34(Object var0, long var1, long var3);
   private static native boolean recovery$indy$35(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$36(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$37(Object var0, long var1, long var3);
   private static native C_40X recovery$indy$38(Object var0, long var1, long var3);
   private static native boolean recovery$indy$39(Object var0, long var1, long var3, long var5);
   private static native double[] recovery$indy$40(long var0, Object var2, Object var3, long var4, long var6);
   private static native void recovery$indy$41(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$42(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$43(long var0, long var2);
   private static native WorldClient recovery$indy$44(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$45(Object var0, long var1, long var3);
   private static native boolean recovery$indy$46(Object var0, Object var1, long var2, long var4, long var6);
   private static native void recovery$indy$47(Object var0, Object var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$78();
}
