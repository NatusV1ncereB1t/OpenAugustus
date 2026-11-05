package augustus.recovered.modules.misc;
import augustus.recovered.modules.render.Notifications_47HJ;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_40V;
import net.C_425;
import net.C_45n;
import net.C_46Q;
import net.C_46_;
import client.render.RenderPass;
import net.C_473U;
import net.C_4747;
import net.C_475e;
import net.C_4766;
import net.C_477A;
import net.minecraft.client.gui.ScaledResolution;
import net.C_478Q;
import net.C_47AO;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47F9;
import net.C_47Fw;
import net.C_47IW;
import net.C_47Ij;
import net.C_47K6;
import net.minecraft.client.gui.FontRenderer;
import net.C_47Ld;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47Om;
import client.setting.ShaderOptions;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47Uv;
import net.C_47VK;
import client.event.RenderListener;
import net.C_47Yl;
import net.C_47cu;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47eq;
import net.C_47iC;
import net.C_47jO;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import net.C_47oP;
import net.C_47ob;
import net.C_47oy;
import client.ClientGlobals;
import net.C_47rL;
import client.render.RenderUtils;
import net.C_47sv;
import net.C_47tH;
import client.module.Category;
import net.C_47x5;
import net.C_47xz;
import net.C_4f;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class StaffDetector_47kd extends client.module.Module implements net.C_47oO,client.event.RenderListener,net.C_47iC,net.C_47xz {
    private static java.lang.String field_45x; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingModes = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingNormalModeSettings = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingExcludeRawUUIDS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingShowInSpectatorListNormal = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingChatMessageNormal = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotificationNormal = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAcousticWarningNormal = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingSimpleModeSettings = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingShowInSpectatorListSimple = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingChatMessageSimple = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotificationSimple = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAcousticWarningSimple = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingOldGommeModeSettings = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCheckDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingShowInSpectatorListGomme = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingChatMessageGomme = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotificationGomme = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAcousticWarningGomme = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingOtherModeSettings = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingShowInSpectatorListOther = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingChatMessageOther = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotificationOther = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAcousticWarningOther = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingListBasedModeSettings = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingLists = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingShowInSpectatorListListBased = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingChatMessageListBased = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotificationListBased = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAcousticWarningListBased = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingAcousticWaringVolume = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingScale = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ShaderOptions field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_45A = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashSet field_45y = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashSet field_45z = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashSet field_45L = null; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_45q; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashSet field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_45N = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.concurrent.CompletableFuture field_450; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_41$a667103684(C_47x5 var1, long var2, String var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 121298661166620L;
      recovery$indy$4(
         var5,
         recovery$indy$1(15157, 1082878870274295029L ^ var2)
            + recovery$indy$2(var1, 3845561332478622347L, var2)
            + recovery$indy$3(18158, 7950069169525340525L ^ var2)
            + var4,
         3845997698034756622L,
         var2
      );
   }



   private static String method_41$7b622a9996(String var0) {
      long var1 = a ^ 125729743861032L;
      long var10000 = -4455750857868553966L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      String var4 = var0;
      if (var3 == null) {
         if (var0.contains(" ")) {
            var0 = StringUtils.replace(var0, " ", "");
         }

         var4 = var0;
      }

      return var4;
   }



   private void method_41$e45a9973e5(long var1) {
      var1 = a ^ var1;
      this.field_43h.clear();
      this.field_45y.clear();
      this.field_45z.clear();
      recovery$indy$5(this, 0L, 4124369932279075986L, var1);
      this.field_48.clear();
   }



   private void method_40$da8c82d5d4() {
      long var1 = a ^ 29115426864816L;
      long var3 = var1 ^ 107468418659051L;
      long var5 = var1 ^ 85008158720416L;
      File var8 = ((java.io.File) (new File(field_45x)));
      long var10000 = 5310190433376066186L;
      int[] var19 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10003 = 5309083204761731416L;
      long var12 = var5;
      String var14 = field_45x;
      C_47eq.method_40$db82fd5e78(var14, var12);
      int[] var7 = var19;
      File[] var9 = var8.listFiles();
      Object var20 = var9;
      if (var7 == null) {
         if (var9 == null) {
            return;
         }

         var20 = Arrays.stream(var9).filter(recovery$indy$6(this)).findFirst().orElse(null);
      }

      File var10 = (File)var20;
      if (var10 != null) {
         String var10002 = var10.getAbsolutePath();
         var10003 = 5306437029758031024L;
         String var15 = var10002;
         ArrayList var11 = new ArrayList(C_47eq.method_45$b9c62fe171(var15));
         var11.replaceAll(recovery$indy$7());
         this.field_45L.clear();
         this.field_45L.addAll(var11);
         String var10001 = "Loaded " + var11.size() + " staff names!";
         long var21 = 5307691621236838649L;
         String var16 = var10001;
         long var17 = var3;
         C_475e.method_46$d07b98bfef(var17, var16);
      }
   }



   private void method_40$af3834366e(long var1, short var3, String var4) {
      augustus.recovered.modules.misc.StaffDetector_47kd var14;
      long var5 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 20423366949475L;
      long var9 = var5 ^ 129231819538020L;
      long var11 = var5 ^ 109698806325021L;
      int[] var13 = recovery$indy$8(-7109321763608064403L, var5);
      boolean var10000 = this.field_48.contains(var4);
      if (var13 == null) {
         if (var10000) {
            return;
         }

         this.field_48.add(var4);
         var10000 = recovery$indy$9(this.settingAcousticWarningNormal, -7112931301078324445L, var5);
      }

      int[] var10001 = var13;
      if (var3 > 0) {
         if (var13 == null) {
            if (var10000) {
               recovery$indy$10(this, var9, -7113860822060703127L, var5);
            }

            var10000 = recovery$indy$11(this.settingChatMessageNormal, -7112931301078324445L, var5);
         }

         var10001 = var13;
      }

      label53: {
         if (var10001 == null) {
            if (var10000) {
               recovery$indy$12(this, C_47x5.NORMAL, var11, var4, -7109615598183401091L, var5);
            }

            var14 = this;
            if (var13 != null) {
               break label53;
            }

            var10000 = recovery$indy$13(this.settingNotificationNormal, -7112931301078324445L, var5);
         }

         if (!var10000) {
            return;
         }

         var14 = this;
      }

      recovery$indy$14(var14, C_47x5.NORMAL, var4, var7, -7113982761272944284L, var5);
   }



   private void method_44$8f10123f10(int var1, int var2, int var3, FontRenderer var4, String var5, RenderPass var6) {
      int[] var11;
      byte var12;
      label58: {
         label57: {
            long var7 = a ^ 80726398287591L;
            long var9 = var7 ^ 62408302298341L;
            long var10000 = -8509897833927075107L;
            var11 = ClientSettings_47kr.method_46$d4d28024c9();
            var12 = 1;
            if (var11 == null) {
               if (var6 != RenderPass.SHADOW) {
                  break label57;
               }

               int var22 = var1 - var2 / 2;
               int var10002 = var1 + var2 / 2;
               int var10003 = var12 + var3;
               ShaderOptions var10004 = this.field_45;
               int var10005 = Color.black.getRGB();
               long var10007 = -8503350593588979871L;
               long var17 = var9;
               int var19 = var10005;
               ShaderOptions var20 = var10004;
               RenderUtils.method_40$0f4d4a7a6c(var22, 0, var10002, var10003, var20.method_49$7ee0e11626(var19, var17));
            }

            if (var11 == null) {
               break label58;
            }
         }

         RenderUtils.method_42$32e26becb0(var1 - var2 / 2, 0, var1 + var2 / 2, var12 + var3, 0, 0, 0, 150);
      }

      RenderUtils.method_42$657351ea81(var1 - var2 / 2, 11, var1 + var2 / 2, 12, 0, 0, 0);
      if (var11 == null) {
         if (var6 != RenderPass.NONE) {
            return;
         }

         int var24 = var1 - var4.method_48$2f485d5ba3(var5) / 2;
         long var25 = -8510626610293708278L;
         Client var26 = Client.method_44$fbc0c0be91();
         long var27 = -8510249055092587414L;
         Client var21 = var26;
         var4.method_43$7961e3f788(var5, var24, var12, var21.method_41$f87803cb87().getRGB());
         var12 = 13;
      }

      for (Object recovered$element$11787 : this.field_45N.keySet()) {
         String var14 = (String) recovered$element$11787;
         Boolean var15 = (Boolean)this.field_45N.get(var14);
         Boolean var23 = var15;
         if (var11 == null) {
            if (var15 == null) {
               continue;
            }

            var23 = var15;
         }

         Color var16 = var23 ? Color.RED : Color.LIGHT_GRAY;
         var4.method_43$7961e3f788(var14, var1 - var4.method_48$2f485d5ba3(var14) / 2, var12, var16.getRGB());
         var12 += 11;
         if (var11 != null) {
            break;
         }
      }
   }




   private synchronized void method_44$e45a9973e5(long var1) {
      this.field_45q = var1;
   }



   private void method_44$537c8d9634(int var1, short var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 135151261185620L;
      long var8 = var4 ^ 104236979780541L;
      long var10 = var4 ^ 126713099971428L;
      java.io.File var13 = new java.io.File(field_45x);
      int[] var10000 = ClientSettings_47kr.method_46$d4d28024c9();
      long var18 = var6;
      String var20 = field_45x;
      net.C_47eq.method_40$db82fd5e78(var20, var18);
      int[] var12 = var10000;
      java.io.File[] var14 = var13.listFiles();
      if (var12 != null) {
         java.util.List var31 = (java.util.List)(Object) (var14);
         long var32 = var8;
         client.setting.ModeSetting var33 = this.settingLists;
         var31.contains(var33.method_46$5f9dc63072(var32));
         String[] var34 = ((java.lang.String[]) (var31.toArray(new String[0])));
      } else if (var14 != null) {
         java.util.List var15 = ((java.util.List) (java.util.Arrays.stream(var14)
            .filter((java.util.function.Predicate<? super java.io.File>)recovery$indy$flow$122())
            .map((java.util.function.Function)recovery$indy$flow$124())
            .collect(java.util.stream.Collectors.toList())));
         long var21 = var8;
         client.setting.ModeSetting var23 = this.settingLists;
         boolean var16 = var15.contains(var23.method_46$5f9dc63072(var21));
         String[] var17 = ((java.lang.String[]) (var15.toArray(new String[0])));
         if (!var16) {
            String var24 = var17[0];
            client.setting.ModeSetting var25 = this.settingLists;
            var25.method_49$a7421bf54c(var24);
         }

         long var26 = var10;
         String[] var28 = var17;
         client.setting.ModeSetting var29 = this.settingLists;
         var29.method_42$7446cc8078(var28, var26);
         StaffDetector_47kd var30 = this;
         var30.method_40$da8c82d5d4();
      }
   }




   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 62665625052564L;
      long var10 = var6 ^ 79469613767391L;
      long var12 = var6 ^ 132989861136316L;
      long var14 = var6 ^ 91924420980846L;
      long var16 = var6 ^ 41314801871846L;
      long var18 = var6 ^ 58032606781533L;
      int[] var20 = recovery$indy$17(1632989468578973074L, var6);
      if (recovery$indy$18(field_43, 1635529976618540540L, var6) == null) {
         int var10000 = (int) ((this.field_45N.isEmpty()) ? 1 : 0);
         if (var20 == null) {
            if ((var10000) != 0) {
               return;
            }

            var10000 = (int) ((recovery$indy$19(15, var16, 1637590102745562337L, var6)) ? 1 : 0);
         }

         if (!(var10000 != 0)) {
            GL11.glPushMatrix();
            GL11.glScaled(1.0F / var5.method_40$8abf5c6871(), 1.0F / var5.method_40$8abf5c6871(), 1.0);
            long var10001 = 7288179943885952617L ^ var6;
            double var21 = recovery$indy$20(this.settingScale, var10, 1636546745557814207L, var6);
            GL11.glScaled(var21, var21, 1.0);
            ScaledResolution var23 = new ScaledResolution(field_43.field_44f * (1.0 / var21), field_43.field_44g * (1.0 / var21), (int)var21);
            FontRenderer var24 = recovery$indy$21(field_43, 1633542418629189795L, var6);
            int var25 = var23.method_46$8abf5c6871() / 2;
            String var26 = recovery$indy$22(2638, var10001);
            int var27 = var24.method_48$2f485d5ba3(var26) + 4;
            int var28 = var24.field_47 + 2;
            Iterator var29 = this.field_45N.keySet().iterator();

            while (true) {
               if (var29.hasNext()) {
                  String var30 = (String)var29.next();
                  var28 += 11;
                  int var31 = var24.method_48$2f485d5ba3(var30) + 4;
                  var10000 = var31;
                  int[] var35 = var20;
                  if (var3 > 0) {
                     if (var20 != null) {
                        break;
                     }

                     var35 = var20;
                  }

                  label41: {
                     if (var35 == null) {
                        if (var31 <= var27) {
                           break label41;
                        }

                        var10000 = var31;
                     }

                     var27 = var10000;
                  }

                  if (var20 == null) {
                     continue;
                  }
               }

               var10000 = var27;
               break;
            }

            int var32 = var10000;
            int var33 = var28;
            GlStateManager.method_44$42cf812248(770, 771, 1, 0);
            recovery$indy$25(
               recovery$indy$23(this.field_45, var8, 1632801330176079695L, var6),
               recovery$indy$24(this.field_45, var14, 1638574542900532657L, var6),
               var12,
               1636674979934069762L,
               var6
            );
            recovery$indy$27(false, var18, recovery$indy$26(this, var25, var32, var33, var24, var26), 1638959278257236243L, var6);
            GL11.glPopMatrix();
            return;
         }
      }
   }




   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 66816875721565L;
      long var10001 = var1 ^ 13537875079860L;
      int var3 = (int)((var1 ^ 13537875079860L) >>> 32);
      int var4 = (int)((var1 ^ 13537875079860L) << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      long var10000 = -4297365676780791961L;
      int[] var6 = ClientSettings_47kr.method_46$d4d28024c9();
      var10001 = -4303012116609838754L;
      SettingGroup var7 = this.settingNormalModeSettings;
      boolean var12 = var7.method_44$aae029aa0a();
      if (var6 == null) {
         if (!var12) {
            return false;
         }

         byte var10003 = (byte)var5;
         long var10004 = -4302326649587834785L;
         byte var8 = var10003;
         int var9 = var4;
         int var10 = var3;
         StaffDetector_47kd var11 = this;
         var12 = var11.method_452$5a0422472c(var10, var9, var8);
      }

      return var6 != null ? var12 : var12;
   }



   private void method_48$e45a9973e5(long var1) {
      C_478Q var4;
      label29: {
         var1 = a ^ var1;
         int[] var3 = recovery$indy$28(224833791572742181L, var1);
         var4 = null;
         C_47Ij var10000 = recovery$indy$29(field_43, 216909898761232225L, var1);
         if (var3 == null) {
            if (var10000 == null) {
               break label29;
            }

            var10000 = recovery$indy$30(field_43, 216909898761232225L, var1);
         }

         if (var3 == null) {
            if (var10000.field_49 != C_47Az.BLOCK) {
               break label29;
            }

            var10000 = recovery$indy$31(field_43, 216909898761232225L, var1);
         }

         var4 = var10000.method_49$5730377d31();
      }

      recovery$indy$32(field_43, 218493957829934887L, var1)
         .field_49m
         .method_45$631790539f(new C_47oy(recovery$indy$33(29592, 4988710808333072944L ^ var1), var4));
   }



   private synchronized long method_48$f9912cc5c6() {
      return this.field_45q;
   }



   private static boolean method_49$863f74fd15(LinkedList var0, String var1) {
      long var2 = a ^ 134645491756858L;
      long var10000 = 6357945915878591232L;
      int[] var4 = ClientSettings_47kr.method_46$d4d28024c9();
      boolean var5 = var0.contains(var1);
      if (var4 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      long var7 = var5 ^ 100584986026872L;
      recovery$indy$34(this, var7, 3263134096162936679L, var5);
   }



   private void method_49$06ed1137c6(C_47x5 var1, String var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 123641309306475L;
      long var7 = var3 ^ 116502901236646L;
      long var10000 = 1168939917688144643L;
      int[] var9 = ClientSettings_47kr.method_46$d4d28024c9();
      var10000 = 1169251008468906964L;
      Client var23 = Client.method_44$fbc0c0be91();
      long var10001 = 1165710674929505359L;
      Client var10 = var23;
      long var10002 = 1166364043169488491L;
      long var11 = var5;
      Notifications_47HJ var13 = var10.method_45$4a5eee04b7().field_41l;
      boolean var24 = var13.method_46$0dd78e0064(var11);
      if (var9 == null) {
         if (!var24) {
            return;
         }

         var10001 = 1162411651063332894L;
         C_47sv var14 = C_47sv.VANISH_NOTIFICATION;
         var24 = var14.method_43$aae029aa0a();
      }

      if (var24) {
         StringBuilder var26 = new StringBuilder().append("§4§lStaff detected (");
         long var10003 = 1162030951224025077L;
         C_47x5 var15 = var1;
         String var27 = var26.append(var15.method_44$0e30dfc966()).append("):§6 ").append(var2).toString();
         long var10004 = 1162310742828710616L;
         C_47jO var16 = C_47jO.INFO;
         String var17 = var27;
         long var18 = var7;
         String var20 = "VanishNotify";
         C_40V.method_44$a50da88c41(var20, var18, var17, var16);
      }
   }



   private void method_49$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = (var1 ^ 56150818189965L) >>> 8;
      int var5 = (int)((var1 ^ 56150818189965L) << 56 >>> 56);
      long var6 = var1 ^ 31621174616295L;
      long var10001 = var1 ^ 31528643774271L;
      int var8 = (int)((var1 ^ 31528643774271L) >>> 32);
      int var9 = (int)((var1 ^ 31528643774271L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      recovery$indy$39(
         recovery$indy$35(2832, 8269069056500305877L ^ var1),
         recovery$indy$37(recovery$indy$36(5653479374227713435L, var1), var3, (byte)var5, 5648038728905100562L, var1).toLowerCase()
            + recovery$indy$38(5705, 4445273784942465727L ^ var1),
         var6,
         true,
         5650644850013368359L,
         var1
      );
      recovery$indy$44(
         recovery$indy$40(23865, 527119752112396788L ^ var1),
         recovery$indy$42(recovery$indy$41(5653479374227713435L, var1), var3, (byte)var5, 5648038728905100562L, var1).toLowerCase()
            + recovery$indy$43(12793, 4952774364563485983L ^ var1),
         var6,
         true,
         5650644850013368359L,
         var1
      );
      recovery$indy$49(
         recovery$indy$45(12238, 8286198887564684062L ^ var1),
         recovery$indy$47(recovery$indy$46(5653479374227713435L, var1), var3, (byte)var5, 5648038728905100562L, var1).toLowerCase()
            + recovery$indy$48(12793, 4952774364563485983L ^ var1),
         var6,
         true,
         5650644850013368359L,
         var1
      );
      recovery$indy$54(
         recovery$indy$50(25683, 8410902705182138505L ^ var1),
         recovery$indy$52(recovery$indy$51(5653479374227713435L, var1), var3, (byte)var5, 5648038728905100562L, var1).toLowerCase()
            + recovery$indy$53(12793, 4952774364563485983L ^ var1),
         var6,
         true,
         5650644850013368359L,
         var1
      );
      recovery$indy$59(
         recovery$indy$55(7952, 7488919823683328967L ^ var1),
         recovery$indy$57(recovery$indy$56(5653479374227713435L, var1), var3, (byte)var5, 5648038728905100562L, var1).toLowerCase()
            + recovery$indy$58(12793, 4952774364563485983L ^ var1),
         var6,
         true,
         5650644850013368359L,
         var1
      );
      recovery$indy$60(this, var8, (short)var9, (char)var10, 5650593329822978362L, var1);
   }




   private void method_49$650e36780d(String var1, char var2, short var3, int var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 24424160829075L;
      long var9 = var5 ^ 124436985698964L;
      long var11 = var5 ^ 113664707541997L;
      int[] var13 = recovery$indy$61(-5069195966618916195L, var5);
      boolean var10000 = this.field_45L.contains(var1);
      if (var13 == null) {
         if (!var10000) {
            return;
         }

         var10000 = this.field_45z.contains(var1);
      }

      int[] var10001 = var13;
      if (var3 >= 0) {
         if (var13 == null) {
            if (var10000) {
               return;
            }

            var10000 = recovery$indy$62(this.settingAcousticWarningListBased, -5063789740141178925L, var5);
         }

         var10001 = var13;
      }

      if (var4 >= 0) {
         if (var10001 == null) {
            if (var10000) {
               recovery$indy$63(this, var9, -5064726726049347943L, var5);
            }

            var10000 = recovery$indy$64(this.settingChatMessageListBased, -5063789740141178925L, var5);
         }

         var10001 = var13;
      }

      if (var2 >= 0) {
         if (var10001 == null) {
            if (var10000) {
               recovery$indy$65(this, C_47x5.LIST_BASED, var11, var1, -5069479857758036595L, var5);
            }

            var10000 = recovery$indy$66(this.settingNotificationListBased, -5063789740141178925L, var5);
         }

         var10001 = var13;
      }

      if (var10001 == null) {
         if (var10000) {
            recovery$indy$67(this, C_47x5.LIST_BASED, var1, var7, -5064848656185361004L, var5);
         }

         this.field_45z.add(var1);
      }
   }




   private void method_45$1459c08040(int var1, int var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      int[] var6 = recovery$indy$68(-4559902843443784820L, var4);
      boolean var10000 = recovery$indy$69(C_47x5.LIST_BASED, -4565944837813413716L, var4);
      if (var6 == null) {
         if (!var10000) {
            this.field_45z.clear();
         }

         var10000 = recovery$indy$70(C_47x5.GOMME, -4565944837813413716L, var4);
      }

      int[] var10001 = var6;
      if (var3 >= 0) {
         if (var6 == null) {
            if (!var10000) {
               this.field_43h.clear();
               this.field_45y.clear();
            }

            var10000 = recovery$indy$71(C_47x5.OTHER, -4565944837813413716L, var4);
         }

         var10001 = var6;
      }

      if (var10001 == null) {
         if (!var10000) {
            recovery$indy$72(this, 0L, -4560195671020917480L, var4);
         }

         var10000 = recovery$indy$73(C_47x5.NORMAL, -4565944837813413716L, var4);
      }

      if (!var10000) {
         this.field_48.clear();
      }
   }



   private boolean method_45$e8c79bc3f2(File var1) {
      long var2 = a ^ 11157881588747L;
      long var4 = var2 ^ 133218492284658L;
      String var10000 = var1.getName();
      StringBuilder var10001 = new StringBuilder();
      long var10004 = 4257230180973116742L;
      long var6 = var4;
      ModeSetting var8 = this.settingLists;
      return var10000.equals(var10001.append(var8.method_46$5f9dc63072(var6)).append(".txt").toString());
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 130848227328701L;
      long var10001 = var1 ^ 78702960722772L;
      int var3 = (int)((var1 ^ 78702960722772L) >>> 32);
      int var4 = (int)((var1 ^ 78702960722772L) << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      long var10000 = -5351125820045908345L;
      int[] var6 = ClientSettings_47kr.method_46$d4d28024c9();
      var10001 = -5356773907263348546L;
      SettingGroup var7 = this.settingListBasedModeSettings;
      boolean var12 = var7.method_44$aae029aa0a();
      if (var6 == null) {
         if (!var12) {
            return false;
         }

         byte var10003 = (byte)var5;
         long var10004 = -5356086792923213377L;
         byte var8 = var10003;
         int var9 = var4;
         int var10 = var3;
         StaffDetector_47kd var11 = this;
         var12 = var11.method_452$5a0422472c(var10, var9, var8);
      }

      return var6 != null ? var12 : var12;
   }



   public void method_47$9035875d26(long var1, net.C_47ob var3) {
      boolean var358;
        int var353;
        augustus.recovered.modules.misc.StaffDetector_47kd var356;
        int var363;
        java.lang.String var375;
        java.lang.String var389;
        boolean var402;
        java.lang.String var404;
        int[] var413;
        int[] var433;
        int[] var434;
        int[] var443;
        int[] var444;
        int[] var458;
        int[] var461;
        int[] var484;
      long var4 = var1 ^ 93828107371066L;
      long var6 = var1 ^ 55302002624061L;
      long var8 = var1 ^ 39582937163588L;
      long var10000 = 2670593076606187060L;
      int[] var10 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 2672811517998020531L;
      net.C_47ob var23 = var3;
      net.C_473U var11 = var23.method_46$96fcbedb66();
      if (var10 == null) {
         var10001 = 2671205029228247459L;
         net.minecraft.client.Minecraft var24 = field_43;
         if (var24.field_44Q != null) {
            var10001 = 2673203571986372918L;
            net.minecraft.client.Minecraft var183 = field_43;
            if (var183.field_42P != null) {
               label3114: {
                  long var96;
                  label3115: {
                     label3116: {
                        label2874: {
                           int var17;
                           java.util.ArrayList var109;
                           String[] var114;
                           int var119;
                           label2873: {
                              label3087: {
                                 label2870: {
                                    label2869: {
                                       label2987: {
                                          label2988: {
                                             label2989: {
                                                label2865: {
                                                   label2864: {
                                                      label2863: {
                                                         label2862: {
                                                            label2861: {
                                                               label2990: {
                                                                  var10001 = 2673629208581618964L;
                                                                  net.C_47x5 var184 = net.C_47x5.NORMAL;
                                                                  String var18;
                                                                  if (var184.method_43$aae029aa0a()) {
                                                                     var358 = var11 instanceof C_47AO;
                                                                     if (var1 < 0L) {
                                                                        label2388: {
                                                                           if (var10 == null) {
                                                                              if (var358) {
                                                                                 var358 = var11 instanceof C_47AO;
                                                                                 var443 = var10;
                                                                                 long var784;
                                                                                 int var564 = (var784 = var1 - 0L) == 0L ? 0 : (var784 < 0L ? -1 : 1);
                                                                                 break label2388;
                                                                              }

                                                                              var10001 = 2673629208581618964L;
                                                                              net.C_47x5 var201 = net.C_47x5.GOMME;
                                                                              var358 = var201.method_43$aae029aa0a();
                                                                           }

                                                                           var443 = var10;
                                                                        }

                                                                        if (var443 == null) {
                                                                           if (var358 && var11 instanceof C_47Om) {
                                                                              var10001 = 2671972533585702490L;
                                                                              net.minecraft.client.Minecraft var205 = field_43;
                                                                              if (!(var205.field_44m instanceof C_47Ld)) {
                                                                                 C_47Om var97 = (C_47Om)var11;
                                                                                 String[] var104 = var97.method_41$44c5829186();
                                                                                 var109 = new java.util.ArrayList();

                                                                                 label2360:
                                                                                 for (String var128 : var104) {
                                                                                    long var567 = 2670983791407098610L;
                                                                                    net.minecraft.client.Minecraft var210 = field_43;
                                                                                    boolean var364 = var128.equals(var210.field_44h.method_47$0e30dfc966());
                                                                                    int[] var446 = var10;

                                                                                    while (true) {
                                                                                       long var785;
                                                                                       int var568 = (var785 = var1 - 0L) == 0L ? 0 : (var785 < 0L ? -1 : 1);
                                                                                       if (var446 == null) {
                                                                                          var364 = !var364;
                                                                                       }

                                                                                       boolean var136 = var364;
                                                                                       var10001 = 2671096431692727091L;
                                                                                       net.minecraft.client.Minecraft var223 = field_43;
                                                                                       java.util.Iterator var144 = var223.method_40$f8db5d9e73()
                                                                                          .method_43$29638970ac()
                                                                                          .iterator();
                                                                                       Object var365;
                                                                                       if (var144.hasNext()) {
                                                                                          net.C_47Yl var163 = (net.C_47Yl)var144.next();
                                                                                          var365 = var163;
                                                                                          long var786;
                                                                                          int var448 = (var786 = var1 - 0L) == 0L ? 0 : (var786 < 0L ? -1 : 1);
                                                                                       } else {
                                                                                          long var787;
                                                                                          int var569 = (var787 = var1 - 0L) == 0L ? 0 : (var787 < 0L ? -1 : 1);
                                                                                          long var788;
                                                                                          int var570 = (var788 = var1 - 0L) == 0L ? 0 : (var788 < 0L ? -1 : 1);
                                                                                          if (var10 != null) {
                                                                                             continue label2360;
                                                                                          }

                                                                                          if (!var136) {
                                                                                             break;
                                                                                          }

                                                                                          var144 = var109.iterator();
                                                                                          if (!var144.hasNext()) {
                                                                                             break;
                                                                                          }

                                                                                          var365 = var144.next();
                                                                                       }

                                                                                       String var164 = (String)var365;
                                                                                       var364 = this.field_43h.contains(var164);
                                                                                       var446 = var10;
                                                                                       long var789;
                                                                                       int var571 = (var789 = var1 - 0L) == 0L ? 0 : (var789 < 0L ? -1 : 1);
                                                                                    }

                                                                                    this.field_43h.clear();
                                                                                    this.field_43h.addAll(var109);
                                                                                 }
                                                                              }
                                                                           }
                                                                           break label3114;
                                                                        }

                                                                        if (!var358) {
                                                                           return;
                                                                        }

                                                                        var96 = System.currentTimeMillis();
                                                                        var363 = ((var11 instanceof C_47Uv) ? 1 : 0);
                                                                        var444 = var10;
                                                                        long var790;
                                                                        int var565 = (var790 = var1 - 0L) == 0L ? 0 : (var790 < 0L ? -1 : 1);
                                                                        long var791;
                                                                        var565 = (var791 = var1 - 0L) == 0L ? 0 : (var791 < 0L ? -1 : 1);
                                                                        break label3115;
                                                                     }

                                                                     if (var10 == null) {
                                                                        if (var358) {
                                                                           C_47AO var93 = (C_47AO)var11;
                                                                           if (java.util.Objects.requireNonNull(var93.method_41$04123f6f16()) == net.C_47tH.UPDATE_LATENCY) {
                                                                              this.field_43W.add((Runnable)recovery$indy$flow$373(this, var93));
                                                                           }
                                                                        }

                                                                        var10001 = 2673629208581618964L;
                                                                        net.C_47x5 var27 = net.C_47x5.SIMPLE;
                                                                        var358 = var27.method_43$aae029aa0a();
                                                                     }

                                                                     if (var10 == null) {
                                                                        if (var358) {
                                                                           var358 = var11 instanceof C_47AO;
                                                                           var434 = var10;
                                                                           if (var1 > 0L) {
                                                                              break label2865;
                                                                           }

                                                                           if (var10 != null) {
                                                                              break label2988;
                                                                           }

                                                                           if (var358 && var11 instanceof C_47Om) {
                                                                              var10001 = 2671972533585702490L;
                                                                              net.minecraft.client.Minecraft var204 = field_43;
                                                                              if (!(var204.field_44m instanceof C_47Ld)) {
                                                                                 C_47Om var95 = (C_47Om)var11;
                                                                                 String[] var103 = var95.method_41$44c5829186();
                                                                                 var109 = new java.util.ArrayList();

                                                                                 label2787:
                                                                                 for (String var127 : var103) {
                                                                                    long var558 = 2670983791407098610L;
                                                                                    net.minecraft.client.Minecraft var209 = field_43;
                                                                                    var358 = var127.equals(var209.field_44h.method_47$0e30dfc966());
                                                                                    int[] var436 = var10;

                                                                                    while (true) {
                                                                                       long var687;
                                                                                       int var559 = (var687 = var1 - 0L) == 0L ? 0 : (var687 < 0L ? -1 : 1);
                                                                                       if (var436 != null) {
                                                                                          break label2988;
                                                                                       }

                                                                                       if (var10 == null) {
                                                                                          var358 = !var358;
                                                                                       }

                                                                                       boolean var19 = var358;
                                                                                       var10001 = 2671096431692727091L;
                                                                                       net.minecraft.client.Minecraft var48 = field_43;

                                                                                       for (Object recovered$element$31948 : var48.method_40$f8db5d9e73().method_43$29638970ac()) {
         net.C_47Yl var21 = (net.C_47Yl) recovered$element$31948;
                                                                                          long var688;
                                                                                          int var438 = (var688 = var1 - 0L) == 0L ? 0 : (var688 < 0L ? -1 : 1);
                                                                                          long var689;
                                                                                          int var560 = (var689 = var1 - 0L) == 0L ? 0 : (var689 < 0L ? -1 : 1);
                                                                                          if (var10 == null) {
                                                                                             net.C_47oP var360 = var21.method_41$8b128fd962();
                                                                                             long var690;
                                                                                             int var439 = (var690 = var1 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var690 < 0L ? -1 : 1);
                                                                                             var360.method_48$0e30dfc966();
                                                                                          } else {
                                                                                             net.C_46_.method_47$cf2a457752(
                                                                                                var21.method_42$47a7a6d93d(),
                                                                                                var21.method_43$cd99b948a0().getName()
                                                                                             );
                                                                                          }

                                                                                          long var691;
                                                                                          int var361 = (var691 = var1 - 0L) == 0L ? 0 : (var691 < 0L ? -1 : 1);
                                                                                          long var692;
                                                                                          int var440 = (var692 = var1 - 0L) == 0L ? 0 : (var692 < 0L ? -1 : 1);
                                                                                          if (var10 != null) {
                                                                                             break;
                                                                                          }
                                                                                       }

                                                                                       label2996: {
                                                                                          boolean var362 = var19;
                                                                                          long var693;
                                                                                          int var561 = (var693 = var1 - 0L) == 0L ? 0 : (var693 < 0L ? -1 : 1);
                                                                                          long var694;
                                                                                          int var562 = (var694 = var1 - 0L) == 0L ? 0 : (var694 < 0L ? -1 : 1);
                                                                                          if (var10 == null) {
                                                                                             if (var19) {
                                                                                                break label2996;
                                                                                             }

                                                                                             var10001 = 2670790090266153850L;
                                                                                             client.setting.BooleanSetting var51 = this.settingNotificationGomme;
                                                                                             var362 = var51.method_49$aae029aa0a();
                                                                                          }

                                                                                          if (var10 != null) {
                                                                                             continue label2787;
                                                                                          }

                                                                                          if (!var362) {
                                                                                             break;
                                                                                          }
                                                                                       }

                                                                                       java.util.Iterator var143 = var109.iterator();
                                                                                       if (!var143.hasNext()) {
                                                                                          break;
                                                                                       }

                                                                                       String var162 = (String)var143.next();
                                                                                       var358 = this.field_43h.contains(var162);
                                                                                       var436 = var10;
                                                                                       long var695;
                                                                                       int var563 = (var695 = var1 - 0L) == 0L ? 0 : (var695 < 0L ? -1 : 1);
                                                                                    }

                                                                                    this.field_43h.clear();
                                                                                    this.field_43h.addAll(var109);
                                                                                 }
                                                                              }
                                                                           }
                                                                           break label2861;
                                                                        }

                                                                        var10001 = 2673629208581618964L;
                                                                        net.C_47x5 var200 = net.C_47x5.GOMME;
                                                                        var358 = var200.method_43$aae029aa0a();
                                                                     }

                                                                     if (var10 != null) {
                                                                        break label2989;
                                                                     }

                                                                     if (!var358 || !(var11 instanceof C_47Om)) {
                                                                        break label2862;
                                                                     }

                                                                     var10001 = 2671972533585702490L;
                                                                     net.minecraft.client.Minecraft var46 = field_43;
                                                                     if (var46.field_44m instanceof C_47Ld) {
                                                                        break label2862;
                                                                     }

                                                                     C_47Om var94 = (C_47Om)var11;
                                                                     String[] var102 = var94.method_41$44c5829186();
                                                                     var109 = new java.util.ArrayList();
                                                                     var114 = var102;
                                                                     var119 = var114.length;
                                                                     var17 = 0;
                                                                     if (var17 >= var119) {
                                                                        break label2862;
                                                                     }

                                                                     var18 = var114[var17];
                                                                     long var556 = 2670983791407098610L;
                                                                     net.minecraft.client.Minecraft var47 = field_43;
                                                                     var358 = var18.equals(var47.field_44h.method_47$0e30dfc966());
                                                                     var433 = var10;
                                                                     long var696;
                                                                     int var557 = (var696 = var1 - 0L) == 0L ? 0 : (var696 < 0L ? -1 : 1);
                                                                  } else {
                                                                     var10001 = 2673629208581618964L;
                                                                     net.C_47x5 var185 = net.C_47x5.SIMPLE;
                                                                     boolean var366 = var185.method_43$aae029aa0a();
                                                                     if (var10 == null) {
                                                                        if (var366) {
                                                                           var358 = var11 instanceof C_47AO;
                                                                           var434 = var10;
                                                                           if (var1 > 0L) {
                                                                              break label2865;
                                                                           }

                                                                           if (var10 != null) {
                                                                              if (!var358) {
                                                                                 return;
                                                                              }

                                                                              var96 = System.currentTimeMillis();
                                                                              var363 = ((var11 instanceof C_47Uv) ? 1 : 0);
                                                                              var444 = var10;
                                                                              long var697;
                                                                              int var638 = (var697 = var1 - 0L) == 0L ? 0 : (var697 < 0L ? -1 : 1);
                                                                              break label2869;
                                                                           }

                                                                           if (var358 && var11 instanceof C_47Om) {
                                                                              var10001 = 2671972533585702490L;
                                                                              net.minecraft.client.Minecraft var207 = field_43;
                                                                              if (!(var207.field_44m instanceof C_47Ld)) {
                                                                                 C_47Om var99 = (C_47Om)var11;
                                                                                 String[] var106 = var99.method_41$44c5829186();
                                                                                 var109 = new java.util.ArrayList();
                                                                                 var114 = var106;
                                                                                 var119 = var114.length;
                                                                                 var17 = 0;
                                                                                 if (var17 < var119) {
                                                                                    var18 = var114[var17];
                                                                                    long var624 = 2670983791407098610L;
                                                                                    net.minecraft.client.Minecraft var219 = field_43;
                                                                                    var358 = var18.equals(var219.field_44h.method_47$0e30dfc966());
                                                                                    var433 = var10;
                                                                                    if (var1 < 0L) {
                                                                                       break label2873;
                                                                                    }

                                                                                    while (true) {
                                                                                       if (var433 != null) {
                                                                                          break label2988;
                                                                                       }

                                                                                       if (var10 == null) {
                                                                                          var358 = !var358;
                                                                                       }

                                                                                       boolean var140 = var358;
                                                                                       var10001 = 2671096431692727091L;
                                                                                       net.minecraft.client.Minecraft var232 = field_43;

                                                                                       for (Object recovered$element$47750 : var232.method_40$f8db5d9e73()
                                                                                          .method_43$29638970ac()) {
         net.C_47Yl var175 = (net.C_47Yl) recovered$element$47750;
                                                                                          long var698;
                                                                                          int var500 = (var698 = var1 - 0L) == 0L ? 0 : (var698 < 0L ? -1 : 1);
                                                                                          long var699;
                                                                                          int var625 = (var699 = var1 - 0L) == 0L ? 0 : (var699 < 0L ? -1 : 1);
                                                                                          if (var10 == null) {
                                                                                             net.C_47oP var391 = var175.method_41$8b128fd962();
                                                                                             long var700;
                                                                                             int var501 = (var700 = var1 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var700 < 0L ? -1 : 1);
                                                                                             var391.method_48$0e30dfc966();
                                                                                          } else {
                                                                                             net.C_46_.method_47$cf2a457752(
                                                                                                var175.method_42$47a7a6d93d(),
                                                                                                var175.method_43$cd99b948a0().getName()
                                                                                             );
                                                                                          }

                                                                                          long var701;
                                                                                          int var392 = (var701 = var1 - 0L) == 0L ? 0 : (var701 < 0L ? -1 : 1);
                                                                                          long var702;
                                                                                          int var502 = (var702 = var1 - 0L) == 0L ? 0 : (var702 < 0L ? -1 : 1);
                                                                                          if (var10 != null) {
                                                                                             break;
                                                                                          }
                                                                                       }

                                                                                       label3001: {
                                                                                          label2817: {
                                                                                             label2816: {
                                                                                                label3002: {
                                                                                                   boolean var393 = var140;
                                                                                                   long var703;
                                                                                                   int var626 = (var703 = var1 - 0L) == 0L
                                                                                                      ? 0
                                                                                                      : (var703 < 0L ? -1 : 1);
                                                                                                   long var704;
                                                                                                   int var627 = (var704 = var1 - 0L) == 0L
                                                                                                      ? 0
                                                                                                      : (var704 < 0L ? -1 : 1);
                                                                                                   if (var10 == null) {
                                                                                                      if (var140) {
                                                                                                         break label3002;
                                                                                                      }

                                                                                                      var10001 = 2670790090266153850L;
                                                                                                      client.setting.BooleanSetting var248 = this.settingNotificationGomme;
                                                                                                      var393 = var248.method_49$aae029aa0a();
                                                                                                   }

                                                                                                   if (var10 != null) {
                                                                                                      break label2817;
                                                                                                   }

                                                                                                   if (!var393) {
                                                                                                      break label2816;
                                                                                                   }
                                                                                                }

                                                                                                java.util.Iterator var157 = var109.iterator();
                                                                                                if (var157.hasNext()) {
                                                                                                   String var176 = (String)var157.next();
                                                                                                   var358 = this.field_43h.contains(var176);
                                                                                                   var433 = var10;
                                                                                                   long var705;
                                                                                                   int var629 = (var705 = var1 - 0L) == 0L
                                                                                                      ? 0
                                                                                                      : (var705 < 0L ? -1 : 1);
                                                                                                   break label3001;
                                                                                                }
                                                                                             }

                                                                                             this.field_43h.clear();
                                                                                             this.field_43h.addAll(var109);
                                                                                          }

                                                                                          if (++var17 >= var119) {
                                                                                             break label2861;
                                                                                          }

                                                                                          var18 = var114[var17];
                                                                                          var624 = 2670983791407098610L;
                                                                                          var219 = field_43;
                                                                                          var358 = var18.equals(var219.field_44h.method_47$0e30dfc966());
                                                                                          var433 = var10;
                                                                                       }

                                                                                       long var706;
                                                                                       int var630 = (var706 = var1 - 0L) == 0L ? 0 : (var706 < 0L ? -1 : 1);
                                                                                    }
                                                                                 }
                                                                              }
                                                                           }

                                                                           if (var1 < 0L) {
                                                                              return;
                                                                           }
                                                                           break label2863;
                                                                        }

                                                                        var10001 = 2673629208581618964L;
                                                                        net.C_47x5 var202 = net.C_47x5.GOMME;
                                                                        var366 = var202.method_43$aae029aa0a();
                                                                     }

                                                                     if (var10 != null) {
                                                                        if (!var366) {
                                                                           return;
                                                                        }

                                                                        var96 = System.currentTimeMillis();
                                                                        var363 = ((var11 instanceof C_47Uv) ? 1 : 0);
                                                                        var444 = var10;
                                                                        if (var1 > 0L) {
                                                                           break label3116;
                                                                        }
                                                                        break label2869;
                                                                     }

                                                                     if (!var366 || !(var11 instanceof C_47Om)) {
                                                                        break label2990;
                                                                     }

                                                                     var10001 = 2671972533585702490L;
                                                                     net.minecraft.client.Minecraft var206 = field_43;
                                                                     if (var206.field_44m instanceof C_47Ld) {
                                                                        break label2990;
                                                                     }

                                                                     C_47Om var98 = (C_47Om)var11;
                                                                     String[] var105 = var98.method_41$44c5829186();
                                                                     var109 = new java.util.ArrayList();
                                                                     var114 = var105;
                                                                     var119 = var114.length;
                                                                     var17 = 0;
                                                                     if (var17 >= var119) {
                                                                        break label2990;
                                                                     }

                                                                     var18 = var114[var17];
                                                                     long var572 = 2670983791407098610L;
                                                                     net.minecraft.client.Minecraft var211 = field_43;
                                                                     var358 = var18.equals(var211.field_44h.method_47$0e30dfc966());
                                                                     var433 = var10;
                                                                     if (var1 < 0L) {
                                                                        break label2873;
                                                                     }
                                                                  }

                                                                  if (var433 != null) {
                                                                     break label2989;
                                                                  }

                                                                  if (var10 == null) {
                                                                     var358 = !var358;
                                                                  }

                                                                  boolean var137 = var358;
                                                                  var10001 = 2671096431692727091L;
                                                                  net.minecraft.client.Minecraft var224 = field_43;
                                                                  java.util.Iterator var146 = var224.method_40$f8db5d9e73().method_43$29638970ac().iterator();
                                                                  if (var146.hasNext()) {
                                                                     net.C_47Yl var165 = (net.C_47Yl)var146.next();
                                                                     net.C_47Yl var367 = var165;
                                                                     long var707;
                                                                     int var453 = (var707 = var1 - 0L) == 0L ? 0 : (var707 < 0L ? -1 : 1);
                                                                     int[] var454 = var10;
                                                                     if (var1 > 0L) {
                                                                        while (true) {
                                                                           label2598: {
                                                                              label2597: {
                                                                                 label3003: {
                                                                                    if (var454 == null) {
                                                                                       String var372 = var367.method_43$cd99b948a0().getName();
                                                                                       long var584 = 2673203571986372918L;
                                                                                       net.minecraft.client.Minecraft var49 = field_43;
                                                                                       boolean var373 = var372.equals(
                                                                                          var49.field_42P.method_41$cd99b948a0().getName()
                                                                                       );
                                                                                       long var708;
                                                                                       int var585 = (var708 = var1 - 0L) == 0L ? 0 : (var708 < 0L ? -1 : 1);
                                                                                       if (var10 != null) {
                                                                                          while (true) {
                                                                                             long var709;
                                                                                             int var600 = (var709 = var1 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var709 < 0L ? -1 : 1);
                                                                                             if (var10 == null) {
                                                                                                if (var373) {
                                                                                                   var109.add(var18);
                                                                                                }

                                                                                                var10001 = 2670790090266153850L;
                                                                                                client.setting.BooleanSetting var238 = this.settingChatMessageGomme;
                                                                                                var373 = var238.method_49$aae029aa0a();
                                                                                             }

                                                                                             label2520: {
                                                                                                label3006: {
                                                                                                   label3007: {
                                                                                                      long var710;
                                                                                                      int var601 = (var710 = var1 - 0L) == 0L
                                                                                                         ? 0
                                                                                                         : (var710 < 0L ? -1 : 1);
                                                                                                      if (var10 == null) {
                                                                                                         if (var373) {
                                                                                                            break label3007;
                                                                                                         }

                                                                                                         var10001 = 2670790090266153850L;
                                                                                                         client.setting.BooleanSetting var245 = this.settingNotificationGomme;
                                                                                                         var373 = var245.method_49$aae029aa0a();
                                                                                                      }

                                                                                                      if (var10 != null) {
                                                                                                         break label2520;
                                                                                                      }

                                                                                                      if (!var373) {
                                                                                                         break label3006;
                                                                                                      }
                                                                                                   }

                                                                                                   for (Object recovered$element$69648 : var109) {
         String var170 = (String) recovered$element$69648;
                                                                                                      boolean var381 = this.field_43h.contains(var170);
                                                                                                      long var711;
                                                                                                      int var602 = (var711 = var1 - 0L) == 0L
                                                                                                         ? 0
                                                                                                         : (var711 < 0L ? -1 : 1);
                                                                                                      long var712;
                                                                                                      int var603 = (var712 = var1 - 0L) == 0L
                                                                                                         ? 0
                                                                                                         : (var712 < 0L ? -1 : 1);
                                                                                                      if (var10 != null) {
                                                                                                         break label2520;
                                                                                                      }

                                                                                                      long var713;
                                                                                                      int var604 = (var713 = var1 - 0L) == 0L
                                                                                                         ? 0
                                                                                                         : (var713 < 0L ? -1 : 1);
                                                                                                      if (var10 == null) {
                                                                                                         if (var381) {
                                                                                                            continue;
                                                                                                         }

                                                                                                         var10001 = 2670790090266153850L;
                                                                                                         client.setting.BooleanSetting var251 = this.settingChatMessageGomme;
                                                                                                         var381 = var251.method_49$aae029aa0a();
                                                                                                      }

                                                                                                      if (var10 == null) {
                                                                                                         if (var381) {
                                                                                                            long var673 = 2669743480761811236L;
                                                                                                            String var255 = var170;
                                                                                                            long var259 = var8;
                                                                                                            net.C_47x5 var263 = net.C_47x5.GOMME;
                                                                                                            StaffDetector_47kd var267 = this;
                                                                                                            var267.method_41$a667103684(var263, var259, var255);
                                                                                                         }

                                                                                                         var10001 = 2670790090266153850L;
                                                                                                         client.setting.BooleanSetting var271 = this.settingNotificationGomme;
                                                                                                         var381 = var271.method_49$aae029aa0a();
                                                                                                      }

                                                                                                      if (var381) {
                                                                                                         long var674 = 2674937637518205245L;
                                                                                                         long var275 = var4;
                                                                                                         String var279 = var170;
                                                                                                         net.C_47x5 var283 = net.C_47x5.GOMME;
                                                                                                         StaffDetector_47kd var287 = this;
                                                                                                         var287.method_49$06ed1137c6(var283, var279, var275);
                                                                                                      }
                                                                                                   }
                                                                                                }

                                                                                                this.field_43h.clear();
                                                                                                this.field_43h.addAll(var109);
                                                                                             }

                                                                                             if (++var17 >= var119) {
                                                                                                break label2987;
                                                                                             }

                                                                                             var18 = var114[var17];
                                                                                             var584 = 2670983791407098610L;
                                                                                             net.minecraft.client.Minecraft var216 = field_43;
                                                                                             var358 = var18.equals(var216.field_44h.method_47$0e30dfc966());
                                                                                             long var714;
                                                                                             int var606 = (var714 = var1 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var714 < 0L ? -1 : 1);
                                                                                             if (var10 != null) {
                                                                                                break label2870;
                                                                                             }

                                                                                             if (var10 == null) {
                                                                                                var358 = !var358;
                                                                                             }

                                                                                             var137 = var358;
                                                                                             var10001 = 2671096431692727091L;
                                                                                             var224 = field_43;
                                                                                             var146 = var224.method_40$f8db5d9e73()
                                                                                                .method_43$29638970ac()
                                                                                                .iterator();
                                                                                             if (var146.hasNext()) {
                                                                                                break label2598;
                                                                                             }

                                                                                             var373 = var137;
                                                                                          }
                                                                                       }

                                                                                       if (var373) {
                                                                                          break label3003;
                                                                                       }

                                                                                       var367 = var165;
                                                                                    }

                                                                                    label2594: {
                                                                                       if (var10 == null) {
                                                                                          net.C_47oP var374 = var367.method_41$8b128fd962();
                                                                                          long var715;
                                                                                          int var464 = (var715 = var1 - 0L) == 0L ? 0 : (var715 < 0L ? -1 : 1);
                                                                                          if (var374 != null) {
                                                                                             var375 = var165.method_41$8b128fd962().method_48$0e30dfc966();
                                                                                             break label2594;
                                                                                          }

                                                                                          var367 = var165;
                                                                                       }

                                                                                       var375 = net.C_46_.method_47$cf2a457752(
                                                                                          var367.method_42$47a7a6d93d(),
                                                                                          var165.method_43$cd99b948a0().getName()
                                                                                       );
                                                                                    }

                                                                                    String var22 = var375;
                                                                                    long var716;
                                                                                    int var376 = (var716 = var1 - 0L) == 0L ? 0 : (var716 < 0L ? -1 : 1);
                                                                                    if (var22.contains(var18)) {
                                                                                       var137 = false;
                                                                                       long var717;
                                                                                       int var465 = (var717 = var1 - 0L) == 0L ? 0 : (var717 < 0L ? -1 : 1);
                                                                                       if (var10 == null) {
                                                                                          break label2597;
                                                                                       }
                                                                                    }

                                                                                    if (var10 != null) {
                                                                                       break label2597;
                                                                                    }
                                                                                 }

                                                                                 while (true) {
                                                                                    if (var146.hasNext()) {
                                                                                       break label2598;
                                                                                    }

                                                                                    boolean var379 = var137;
                                                                                    long var718;
                                                                                    int var593 = (var718 = var1 - 0L) == 0L ? 0 : (var718 < 0L ? -1 : 1);
                                                                                    if (var10 == null) {
                                                                                       if (var137) {
                                                                                          var109.add(var18);
                                                                                       }

                                                                                       var10001 = 2670790090266153850L;
                                                                                       client.setting.BooleanSetting var237 = this.settingChatMessageGomme;
                                                                                       var379 = var237.method_49$aae029aa0a();
                                                                                    }

                                                                                    label2575: {
                                                                                       label3010: {
                                                                                          label3011: {
                                                                                             long var719;
                                                                                             var593 = (var719 = var1 - 0L) == 0L ? 0 : (var719 < 0L ? -1 : 1);
                                                                                             if (var10 == null) {
                                                                                                if (var379) {
                                                                                                   break label3011;
                                                                                                }

                                                                                                var10001 = 2670790090266153850L;
                                                                                                client.setting.BooleanSetting var244 = this.settingNotificationGomme;
                                                                                                var379 = var244.method_49$aae029aa0a();
                                                                                             }

                                                                                             if (var10 != null) {
                                                                                                break label2575;
                                                                                             }

                                                                                             if (!var379) {
                                                                                                break label3010;
                                                                                             }
                                                                                          }

                                                                                          for (Object recovered$element$87471 : var109) {
         String var169 = (String) recovered$element$87471;
                                                                                             boolean var380 = this.field_43h.contains(var169);
                                                                                             long var720;
                                                                                             var593 = (var720 = var1 - 0L) == 0L ? 0 : (var720 < 0L ? -1 : 1);
                                                                                             long var721;
                                                                                             var593 = (var721 = var1 - 0L) == 0L ? 0 : (var721 < 0L ? -1 : 1);
                                                                                             if (var10 != null) {
                                                                                                break label2575;
                                                                                             }

                                                                                             long var722;
                                                                                             var593 = (var722 = var1 - 0L) == 0L ? 0 : (var722 < 0L ? -1 : 1);
                                                                                             if (var10 == null) {
                                                                                                if (var380) {
                                                                                                   continue;
                                                                                                }

                                                                                                var10001 = 2670790090266153850L;
                                                                                                client.setting.BooleanSetting var250 = this.settingChatMessageGomme;
                                                                                                var380 = var250.method_49$aae029aa0a();
                                                                                             }

                                                                                             if (var10 == null) {
                                                                                                if (var380) {
                                                                                                   long var671 = 2669743480761811236L;
                                                                                                   String var254 = var169;
                                                                                                   long var258 = var8;
                                                                                                   net.C_47x5 var262 = net.C_47x5.GOMME;
                                                                                                   StaffDetector_47kd var266 = this;
                                                                                                   var266.method_41$a667103684(var262, var258, var254);
                                                                                                }

                                                                                                var10001 = 2670790090266153850L;
                                                                                                client.setting.BooleanSetting var270 = this.settingNotificationGomme;
                                                                                                var380 = var270.method_49$aae029aa0a();
                                                                                             }

                                                                                             if (var380) {
                                                                                                long var672 = 2674937637518205245L;
                                                                                                long var274 = var4;
                                                                                                String var278 = var169;
                                                                                                net.C_47x5 var282 = net.C_47x5.GOMME;
                                                                                                StaffDetector_47kd var286 = this;
                                                                                                var286.method_49$06ed1137c6(var282, var278, var274);
                                                                                             }
                                                                                          }
                                                                                       }

                                                                                       this.field_43h.clear();
                                                                                       this.field_43h.addAll(var109);
                                                                                    }

                                                                                    if (++var17 >= var119) {
                                                                                       break label2987;
                                                                                    }

                                                                                    var18 = var114[var17];
                                                                                    long var598 = 2670983791407098610L;
                                                                                    net.minecraft.client.Minecraft var215 = field_43;
                                                                                    var358 = var18.equals(var215.field_44h.method_47$0e30dfc966());
                                                                                    long var723;
                                                                                    var593 = (var723 = var1 - 0L) == 0L ? 0 : (var723 < 0L ? -1 : 1);
                                                                                    if (var10 != null) {
                                                                                       break label2870;
                                                                                    }

                                                                                    if (var10 == null) {
                                                                                       var358 = !var358;
                                                                                    }

                                                                                    var137 = var358;
                                                                                    var10001 = 2671096431692727091L;
                                                                                    var224 = field_43;
                                                                                    var146 = var224.method_40$f8db5d9e73().method_43$29638970ac().iterator();
                                                                                 }
                                                                              }

                                                                              do {
                                                                                 boolean var377 = var137;
                                                                                 long var724;
                                                                                 int var586 = (var724 = var1 - 0L) == 0L ? 0 : (var724 < 0L ? -1 : 1);
                                                                                 if (var10 == null) {
                                                                                    if (var137) {
                                                                                       var109.add(var18);
                                                                                    }

                                                                                    var10001 = 2670790090266153850L;
                                                                                    client.setting.BooleanSetting var50 = this.settingChatMessageGomme;
                                                                                    var377 = var50.method_49$aae029aa0a();
                                                                                 }

                                                                                 label2548: {
                                                                                    label3014: {
                                                                                       label3015: {
                                                                                          long var725;
                                                                                          var586 = (var725 = var1 - 0L) == 0L ? 0 : (var725 < 0L ? -1 : 1);
                                                                                          if (var10 == null) {
                                                                                             if (var377) {
                                                                                                break label3015;
                                                                                             }

                                                                                             var10001 = 2670790090266153850L;
                                                                                             client.setting.BooleanSetting var243 = this.settingNotificationGomme;
                                                                                             var377 = var243.method_49$aae029aa0a();
                                                                                          }

                                                                                          if (var10 != null) {
                                                                                             break label2548;
                                                                                          }

                                                                                          if (!var377) {
                                                                                             break label3014;
                                                                                          }
                                                                                       }

                                                                                       for (Object recovered$element$98851 : var109) {
         String var168 = (String) recovered$element$98851;
                                                                                          boolean var378 = this.field_43h.contains(var168);
                                                                                          long var726;
                                                                                          var586 = (var726 = var1 - 0L) == 0L ? 0 : (var726 < 0L ? -1 : 1);
                                                                                          long var727;
                                                                                          var586 = (var727 = var1 - 0L) == 0L ? 0 : (var727 < 0L ? -1 : 1);
                                                                                          if (var10 != null) {
                                                                                             break label2548;
                                                                                          }

                                                                                          long var728;
                                                                                          var586 = (var728 = var1 - 0L) == 0L ? 0 : (var728 < 0L ? -1 : 1);
                                                                                          if (var10 == null) {
                                                                                             if (var378) {
                                                                                                continue;
                                                                                             }

                                                                                             var10001 = 2670790090266153850L;
                                                                                             client.setting.BooleanSetting var52 = this.settingChatMessageGomme;
                                                                                             var378 = var52.method_49$aae029aa0a();
                                                                                          }

                                                                                          if (var10 == null) {
                                                                                             if (var378) {
                                                                                                long var669 = 2669743480761811236L;
                                                                                                String var53 = var168;
                                                                                                long var54 = var8;
                                                                                                net.C_47x5 var56 = net.C_47x5.GOMME;
                                                                                                StaffDetector_47kd var57 = this;
                                                                                                var57.method_41$a667103684(var56, var54, var53);
                                                                                             }

                                                                                             var10001 = 2670790090266153850L;
                                                                                             client.setting.BooleanSetting var58 = this.settingNotificationGomme;
                                                                                             var378 = var58.method_49$aae029aa0a();
                                                                                          }

                                                                                          if (var378) {
                                                                                             long var670 = 2674937637518205245L;
                                                                                             long var59 = var4;
                                                                                             String var61 = var168;
                                                                                             net.C_47x5 var62 = net.C_47x5.GOMME;
                                                                                             StaffDetector_47kd var63 = this;
                                                                                             var63.method_49$06ed1137c6(var62, var61, var59);
                                                                                          }
                                                                                       }
                                                                                    }

                                                                                    this.field_43h.clear();
                                                                                    this.field_43h.addAll(var109);
                                                                                 }

                                                                                 if (++var17 >= var119) {
                                                                                    break label2987;
                                                                                 }

                                                                                 var18 = var114[var17];
                                                                                 long var591 = 2670983791407098610L;
                                                                                 net.minecraft.client.Minecraft var214 = field_43;
                                                                                 var358 = var18.equals(var214.field_44h.method_47$0e30dfc966());
                                                                                 long var729;
                                                                                 var586 = (var729 = var1 - 0L) == 0L ? 0 : (var729 < 0L ? -1 : 1);
                                                                                 if (var10 != null) {
                                                                                    break label2870;
                                                                                 }

                                                                                 if (var10 == null) {
                                                                                    var358 = !var358;
                                                                                 }

                                                                                 var137 = var358;
                                                                                 var10001 = 2671096431692727091L;
                                                                                 var224 = field_43;
                                                                                 var146 = var224.method_40$f8db5d9e73().method_43$29638970ac().iterator();
                                                                              } while (!var146.hasNext());
                                                                           }

                                                                           var165 = (net.C_47Yl)var146.next();
                                                                           var367 = var165;
                                                                           long var730;
                                                                           int var481 = (var730 = var1 - 0L) == 0L ? 0 : (var730 < 0L ? -1 : 1);
                                                                           var454 = var10;
                                                                           long var731;
                                                                           int var607 = (var731 = var1 - 0L) == 0L ? 0 : (var731 < 0L ? -1 : 1);
                                                                        }
                                                                     }

                                                                     while (true) {
                                                                        if (var454 == null) {
                                                                           net.C_47oP var368 = var367.method_41$8b128fd962();
                                                                           long var732;
                                                                           int var455 = (var732 = var1 - 0L) == 0L ? 0 : (var732 < 0L ? -1 : 1);
                                                                           var368.method_48$0e30dfc966();
                                                                        } else {
                                                                           net.C_46_.method_47$cf2a457752(
                                                                              var367.method_42$47a7a6d93d(), var165.method_43$cd99b948a0().getName()
                                                                           );
                                                                        }

                                                                        long var733;
                                                                        int var369 = (var733 = var1 - 0L) == 0L ? 0 : (var733 < 0L ? -1 : 1);
                                                                        long var734;
                                                                        int var456 = (var734 = var1 - 0L) == 0L ? 0 : (var734 < 0L ? -1 : 1);
                                                                        if (var10 != null) {
                                                                           do {
                                                                              label3019: {
                                                                                 label2699: {
                                                                                    label2698: {
                                                                                       label3020: {
                                                                                          boolean var371 = var137;
                                                                                          long var735;
                                                                                          int var578 = (var735 = var1 - 0L) == 0L ? 0 : (var735 < 0L ? -1 : 1);
                                                                                          long var736;
                                                                                          var578 = (var736 = var1 - 0L) == 0L ? 0 : (var736 < 0L ? -1 : 1);
                                                                                          if (var10 == null) {
                                                                                             if (var137) {
                                                                                                break label3020;
                                                                                             }

                                                                                             var10001 = 2670790090266153850L;
                                                                                             client.setting.BooleanSetting var242 = this.settingNotificationGomme;
                                                                                             var371 = var242.method_49$aae029aa0a();
                                                                                          }

                                                                                          if (var10 != null) {
                                                                                             break label2699;
                                                                                          }

                                                                                          if (!var371) {
                                                                                             break label2698;
                                                                                          }
                                                                                       }

                                                                                       var146 = var109.iterator();
                                                                                       if (var146.hasNext()) {
                                                                                          String var167 = (String)var146.next();
                                                                                          var358 = this.field_43h.contains(var167);
                                                                                          var461 = var10;
                                                                                          long var737;
                                                                                          int var581 = (var737 = var1 - 0L) == 0L ? 0 : (var737 < 0L ? -1 : 1);
                                                                                          break label3019;
                                                                                       }
                                                                                    }

                                                                                    this.field_43h.clear();
                                                                                    this.field_43h.addAll(var109);
                                                                                 }

                                                                                 if (++var17 >= var119) {
                                                                                    break label2861;
                                                                                 }

                                                                                 var18 = var114[var17];
                                                                                 long var580 = 2670983791407098610L;
                                                                                 net.minecraft.client.Minecraft var213 = field_43;
                                                                                 var358 = var18.equals(var213.field_44h.method_47$0e30dfc966());
                                                                                 var461 = var10;
                                                                              }

                                                                              long var738;
                                                                              int var582 = (var738 = var1 - 0L) == 0L ? 0 : (var738 < 0L ? -1 : 1);
                                                                              if (var461 != null) {
                                                                                 break label2988;
                                                                              }

                                                                              if (var10 == null) {
                                                                                 var358 = !var358;
                                                                              }

                                                                              var137 = var358;
                                                                              var10001 = 2671096431692727091L;
                                                                              var224 = field_43;
                                                                              var146 = var224.method_40$f8db5d9e73().method_43$29638970ac().iterator();
                                                                           } while (!var146.hasNext());
                                                                        } else {
                                                                           while (!var146.hasNext()) {
                                                                              label3022: {
                                                                                 label2719: {
                                                                                    label2718: {
                                                                                       label3023: {
                                                                                          boolean var370 = var137;
                                                                                          long var739;
                                                                                          int var573 = (var739 = var1 - 0L) == 0L ? 0 : (var739 < 0L ? -1 : 1);
                                                                                          long var740;
                                                                                          var573 = (var740 = var1 - 0L) == 0L ? 0 : (var740 < 0L ? -1 : 1);
                                                                                          if (var10 == null) {
                                                                                             if (var137) {
                                                                                                break label3023;
                                                                                             }

                                                                                             var10001 = 2670790090266153850L;
                                                                                             client.setting.BooleanSetting var241 = this.settingNotificationGomme;
                                                                                             var370 = var241.method_49$aae029aa0a();
                                                                                          }

                                                                                          if (var10 != null) {
                                                                                             break label2719;
                                                                                          }

                                                                                          if (!var370) {
                                                                                             break label2718;
                                                                                          }
                                                                                       }

                                                                                       var146 = var109.iterator();
                                                                                       if (var146.hasNext()) {
                                                                                          String var166 = (String)var146.next();
                                                                                          var358 = this.field_43h.contains(var166);
                                                                                          var458 = var10;
                                                                                          long var741;
                                                                                          int var576 = (var741 = var1 - 0L) == 0L ? 0 : (var741 < 0L ? -1 : 1);
                                                                                          break label3022;
                                                                                       }
                                                                                    }

                                                                                    this.field_43h.clear();
                                                                                    this.field_43h.addAll(var109);
                                                                                 }

                                                                                 if (++var17 >= var119) {
                                                                                    break label2861;
                                                                                 }

                                                                                 var18 = var114[var17];
                                                                                 long var575 = 2670983791407098610L;
                                                                                 net.minecraft.client.Minecraft var212 = field_43;
                                                                                 var358 = var18.equals(var212.field_44h.method_47$0e30dfc966());
                                                                                 var458 = var10;
                                                                              }

                                                                              long var742;
                                                                              int var577 = (var742 = var1 - 0L) == 0L ? 0 : (var742 < 0L ? -1 : 1);
                                                                              if (var458 != null) {
                                                                                 break label2988;
                                                                              }

                                                                              if (var10 == null) {
                                                                                 var358 = !var358;
                                                                              }

                                                                              var137 = var358;
                                                                              var10001 = 2671096431692727091L;
                                                                              var224 = field_43;
                                                                              var146 = var224.method_40$f8db5d9e73().method_43$29638970ac().iterator();
                                                                           }
                                                                        }

                                                                        var165 = (net.C_47Yl)var146.next();
                                                                        var367 = var165;
                                                                        long var743;
                                                                        int var463 = (var743 = var1 - 0L) == 0L ? 0 : (var743 < 0L ? -1 : 1);
                                                                        var454 = var10;
                                                                        long var744;
                                                                        int var583 = (var744 = var1 - 0L) == 0L ? 0 : (var744 < 0L ? -1 : 1);
                                                                     }
                                                                  } else {
                                                                     boolean var382 = var137;
                                                                     int[] var482 = var10;
                                                                     if (var1 > 0L) {
                                                                        while (true) {
                                                                           if (var482 == null) {
                                                                              if (var382) {
                                                                                 var109.add(var18);
                                                                              }

                                                                              var10001 = 2670790090266153850L;
                                                                              client.setting.BooleanSetting var239 = this.settingChatMessageGomme;
                                                                              var382 = var239.method_49$aae029aa0a();
                                                                           }

                                                                           label2625: {
                                                                              label3025: {
                                                                                 label3026: {
                                                                                    long var745;
                                                                                    int var614 = (var745 = var1 - 0L) == 0L ? 0 : (var745 < 0L ? -1 : 1);
                                                                                    if (var10 == null) {
                                                                                       if (var382) {
                                                                                          break label3026;
                                                                                       }

                                                                                       var10001 = 2670790090266153850L;
                                                                                       client.setting.BooleanSetting var247 = this.settingNotificationGomme;
                                                                                       var382 = var247.method_49$aae029aa0a();
                                                                                    }

                                                                                    if (var10 != null) {
                                                                                       break label2625;
                                                                                    }

                                                                                    if (!var382) {
                                                                                       break label3025;
                                                                                    }
                                                                                 }

                                                                                 for (Object recovered$element$126642 : var109) {
         String var173 = (String) recovered$element$126642;
                                                                                    boolean var385 = this.field_43h.contains(var173);
                                                                                    long var746;
                                                                                    int var615 = (var746 = var1 - 0L) == 0L ? 0 : (var746 < 0L ? -1 : 1);
                                                                                    long var747;
                                                                                    var615 = (var747 = var1 - 0L) == 0L ? 0 : (var747 < 0L ? -1 : 1);
                                                                                    if (var10 != null) {
                                                                                       break label2625;
                                                                                    }

                                                                                    long var748;
                                                                                    var615 = (var748 = var1 - 0L) == 0L ? 0 : (var748 < 0L ? -1 : 1);
                                                                                    if (var10 == null) {
                                                                                       if (var385) {
                                                                                          continue;
                                                                                       }

                                                                                       var10001 = 2670790090266153850L;
                                                                                       client.setting.BooleanSetting var252 = this.settingChatMessageGomme;
                                                                                       var385 = var252.method_49$aae029aa0a();
                                                                                    }

                                                                                    if (var10 == null) {
                                                                                       if (var385) {
                                                                                          long var675 = 2669743480761811236L;
                                                                                          String var256 = var173;
                                                                                          long var260 = var8;
                                                                                          net.C_47x5 var264 = net.C_47x5.GOMME;
                                                                                          StaffDetector_47kd var268 = this;
                                                                                          var268.method_41$a667103684(var264, var260, var256);
                                                                                       }

                                                                                       var10001 = 2670790090266153850L;
                                                                                       client.setting.BooleanSetting var272 = this.settingNotificationGomme;
                                                                                       var385 = var272.method_49$aae029aa0a();
                                                                                    }

                                                                                    if (var385) {
                                                                                       long var676 = 2674937637518205245L;
                                                                                       long var276 = var4;
                                                                                       String var280 = var173;
                                                                                       net.C_47x5 var284 = net.C_47x5.GOMME;
                                                                                       StaffDetector_47kd var288 = this;
                                                                                       var288.method_49$06ed1137c6(var284, var280, var276);
                                                                                    }
                                                                                 }
                                                                              }

                                                                              this.field_43h.clear();
                                                                              this.field_43h.addAll(var109);
                                                                           }

                                                                           if (++var17 >= var119) {
                                                                              break label2987;
                                                                           }

                                                                           var18 = var114[var17];
                                                                           long var618 = 2670983791407098610L;
                                                                           net.minecraft.client.Minecraft var218 = field_43;
                                                                           var358 = var18.equals(var218.field_44h.method_47$0e30dfc966());
                                                                           long var749;
                                                                           int var619 = (var749 = var1 - 0L) == 0L ? 0 : (var749 < 0L ? -1 : 1);
                                                                           if (var10 != null) {
                                                                              break label2870;
                                                                           }

                                                                           if (var10 == null) {
                                                                              var358 = !var358;
                                                                           }

                                                                           var137 = var358;
                                                                           var10001 = 2671096431692727091L;
                                                                           var224 = field_43;

                                                                           label2649: {
                                                                              for (Object recovered$element$133684 : var224.method_40$f8db5d9e73().method_43$29638970ac()) {
         net.C_47Yl var174 = (net.C_47Yl) recovered$element$133684;
                                                                                 net.C_47Yl var386 = var174;
                                                                                 long var750;
                                                                                 int var494 = (var750 = var1 - 0L) == 0L ? 0 : (var750 < 0L ? -1 : 1);
                                                                                 long var751;
                                                                                 int var620 = (var751 = var1 - 0L) == 0L ? 0 : (var751 < 0L ? -1 : 1);
                                                                                 if (var10 == null) {
                                                                                    String var387 = var174.method_43$cd99b948a0().getName();
                                                                                    var618 = 2673203571986372918L;
                                                                                    net.minecraft.client.Minecraft var235 = field_43;
                                                                                    var382 = var387.equals(var235.field_42P.method_41$cd99b948a0().getName());
                                                                                    long var752;
                                                                                    int var622 = (var752 = var1 - 0L) == 0L ? 0 : (var752 < 0L ? -1 : 1);
                                                                                    if (var10 != null) {
                                                                                       break label2649;
                                                                                    }

                                                                                    if (var382) {
                                                                                       continue;
                                                                                    }

                                                                                    var386 = var174;
                                                                                 }

                                                                                 label2645: {
                                                                                    if (var10 == null) {
                                                                                       net.C_47oP var388 = var386.method_41$8b128fd962();
                                                                                       long var753;
                                                                                       int var495 = (var753 = var1 - 0L) == 0L ? 0 : (var753 < 0L ? -1 : 1);
                                                                                       if (var388 != null) {
                                                                                          var389 = var174.method_41$8b128fd962().method_48$0e30dfc966();
                                                                                          break label2645;
                                                                                       }

                                                                                       var386 = var174;
                                                                                    }

                                                                                    var389 = net.C_46_.method_47$cf2a457752(
                                                                                       var386.method_42$47a7a6d93d(), var174.method_43$cd99b948a0().getName()
                                                                                    );
                                                                                 }

                                                                                 String var181 = var389;
                                                                                 long var754;
                                                                                 int var390 = (var754 = var1 - 0L) == 0L ? 0 : (var754 < 0L ? -1 : 1);
                                                                                 if (var181.contains(var18)) {
                                                                                    var137 = false;
                                                                                    long var755;
                                                                                    int var496 = (var755 = var1 - 0L) == 0L ? 0 : (var755 < 0L ? -1 : 1);
                                                                                    if (var10 == null) {
                                                                                       break;
                                                                                    }
                                                                                 }

                                                                                 if (var10 != null) {
                                                                                    break;
                                                                                 }
                                                                              }

                                                                              var382 = var137;
                                                                           }

                                                                           var482 = var10;
                                                                           long var756;
                                                                           int var623 = (var756 = var1 - 0L) == 0L ? 0 : (var756 < 0L ? -1 : 1);
                                                                        }
                                                                     }

                                                                     while (true) {
                                                                        label3031: {
                                                                           label2744: {
                                                                              label2743: {
                                                                                 label3032: {
                                                                                    long var757;
                                                                                    int var608 = (var757 = var1 - 0L) == 0L ? 0 : (var757 < 0L ? -1 : 1);
                                                                                    if (var482 == null) {
                                                                                       if (var382) {
                                                                                          break label3032;
                                                                                       }

                                                                                       var10001 = 2670790090266153850L;
                                                                                       client.setting.BooleanSetting var246 = this.settingNotificationGomme;
                                                                                       var382 = var246.method_49$aae029aa0a();
                                                                                    }

                                                                                    if (var10 != null) {
                                                                                       break label2744;
                                                                                    }

                                                                                    if (!var382) {
                                                                                       break label2743;
                                                                                    }
                                                                                 }

                                                                                 var146 = var109.iterator();
                                                                                 if (var146.hasNext()) {
                                                                                    String var171 = (String)var146.next();
                                                                                    var358 = this.field_43h.contains(var171);
                                                                                    var484 = var10;
                                                                                    long var758;
                                                                                    int var610 = (var758 = var1 - 0L) == 0L ? 0 : (var758 < 0L ? -1 : 1);
                                                                                    break label3031;
                                                                                 }
                                                                              }

                                                                              this.field_43h.clear();
                                                                              this.field_43h.addAll(var109);
                                                                           }

                                                                           if (++var17 >= var119) {
                                                                              break label2861;
                                                                           }

                                                                           var18 = var114[var17];
                                                                           long var609 = 2670983791407098610L;
                                                                           net.minecraft.client.Minecraft var217 = field_43;
                                                                           var358 = var18.equals(var217.field_44h.method_47$0e30dfc966());
                                                                           var484 = var10;
                                                                        }

                                                                        long var759;
                                                                        int var611 = (var759 = var1 - 0L) == 0L ? 0 : (var759 < 0L ? -1 : 1);
                                                                        if (var484 != null) {
                                                                           break label2988;
                                                                        }

                                                                        if (var10 == null) {
                                                                           var358 = !var358;
                                                                        }

                                                                        var137 = var358;
                                                                        var10001 = 2671096431692727091L;
                                                                        var224 = field_43;

                                                                        for (Object recovered$element$145686 : var224.method_40$f8db5d9e73().method_43$29638970ac()) {
         net.C_47Yl var172 = (net.C_47Yl) recovered$element$145686;
                                                                           long var760;
                                                                           int var486 = (var760 = var1 - 0L) == 0L ? 0 : (var760 < 0L ? -1 : 1);
                                                                           long var761;
                                                                           var611 = (var761 = var1 - 0L) == 0L ? 0 : (var761 < 0L ? -1 : 1);
                                                                           if (var10 == null) {
                                                                              net.C_47oP var383 = var172.method_41$8b128fd962();
                                                                              long var762;
                                                                              int var487 = (var762 = var1 - 0L) == 0L ? 0 : (var762 < 0L ? -1 : 1);
                                                                              var383.method_48$0e30dfc966();
                                                                           } else {
                                                                              net.C_46_.method_47$cf2a457752(
                                                                                 var172.method_42$47a7a6d93d(), var172.method_43$cd99b948a0().getName()
                                                                              );
                                                                           }

                                                                           long var763;
                                                                           int var384 = (var763 = var1 - 0L) == 0L ? 0 : (var763 < 0L ? -1 : 1);
                                                                           long var764;
                                                                           int var488 = (var764 = var1 - 0L) == 0L ? 0 : (var764 < 0L ? -1 : 1);
                                                                           if (var10 != null) {
                                                                              break;
                                                                           }
                                                                        }

                                                                        var382 = var137;
                                                                        var482 = var10;
                                                                        long var765;
                                                                        var611 = (var765 = var1 - 0L) == 0L ? 0 : (var765 < 0L ? -1 : 1);
                                                                     }
                                                                  }
                                                               }

                                                               if (var1 < 0L) {
                                                                  return;
                                                               }
                                                               break label2864;
                                                            }

                                                            long var766;
                                                            int var394 = (var766 = var1 - 0L) == 0L ? 0 : (var766 < 0L ? -1 : 1);
                                                            break label2863;
                                                         }

                                                         long var767;
                                                         int var359 = (var767 = var1 - 0L) == 0L ? 0 : (var767 < 0L ? -1 : 1);
                                                         break label2864;
                                                      }

                                                      var10001 = 2673629208581618964L;
                                                      net.C_47x5 var293 = net.C_47x5.OTHER;
                                                      var358 = var293.method_43$aae029aa0a();
                                                      break label2988;
                                                   }

                                                   var10001 = 2673629208581618964L;
                                                   net.C_47x5 var292 = net.C_47x5.OTHER;
                                                   var358 = var292.method_43$aae029aa0a();
                                                   break label2989;
                                                }

                                                if (var434 == null) {
                                                   if (var358) {
                                                      C_47AO var100 = (C_47AO)var11;
                                                      if (var100.method_41$04123f6f16() == net.C_47tH.UPDATE_LATENCY) {
                                                         java.util.List var107 = var100.method_44$3f0615080b();
                                                         int var112 = var107 == null ? 0 : var107.size();
                                                         var10001 = 2671096431692727091L;
                                                         net.minecraft.client.Minecraft var186 = field_43;
                                                         net.C_47K6 var117 = var186.method_40$f8db5d9e73();
                                                         var119 = var117 == null ? 0 : var117.method_43$29638970ac().size();
                                                         if (var112 != var119) {
                                                            if (!this.field_43a) {
                                                               var10001 = 2670790090266153850L;
                                                               client.setting.BooleanSetting var187 = this.settingAcousticWarningSimple;
                                                               boolean var399 = var187.method_49$aae029aa0a();
                                                               long var768;
                                                               int var648 = (var768 = var1 - 0L) == 0L ? 0 : (var768 < 0L ? -1 : 1);
                                                               if (var10 == null) {
                                                                  if (var399) {
                                                                     long var649 = 2674921028585151024L;
                                                                     long var188 = var6;
                                                                     StaffDetector_47kd var189 = this;
                                                                     var189.method_43$e45a9973e5(var188);
                                                                  }

                                                                  var10001 = 2670790090266153850L;
                                                                  client.setting.BooleanSetting var190 = this.settingChatMessageSimple;
                                                                  var399 = var190.method_49$aae029aa0a();
                                                               }

                                                               if (var10 == null) {
                                                                  if (var399) {
                                                                     long var681 = 2669743480761811236L;
                                                                     String var191 = "unknown";
                                                                     long var192 = var8;
                                                                     net.C_47x5 var193 = net.C_47x5.SIMPLE;
                                                                     StaffDetector_47kd var194 = this;
                                                                     var194.method_41$a667103684(var193, var192, var191);
                                                                  }

                                                                  var10001 = 2670790090266153850L;
                                                                  client.setting.BooleanSetting var39 = this.settingNotificationSimple;
                                                                  var399 = var39.method_49$aae029aa0a();
                                                               }

                                                               if (var399) {
                                                                  long var682 = 2674937637518205245L;
                                                                  long var195 = var4;
                                                                  String var196 = "unknown";
                                                                  net.C_47x5 var197 = net.C_47x5.SIMPLE;
                                                                  StaffDetector_47kd var198 = this;
                                                                  var198.method_49$06ed1137c6(var197, var196, var195);
                                                               }
                                                            }

                                                            long var769;
                                                            int var650 = (var769 = var1 - 0L) == 0L ? 0 : (var769 < 0L ? -1 : 1);
                                                            this.field_43a = true;
                                                         } else {
                                                            this.field_43a = false;
                                                         }
                                                      }
                                                   }

                                                   var10001 = 2673629208581618964L;
                                                   net.C_47x5 var203 = net.C_47x5.GOMME;
                                                   var358 = var203.method_43$aae029aa0a();
                                                }

                                                if (var10 != null) {
                                                   break label2870;
                                                }

                                                if (var358 && var11 instanceof C_47Om) {
                                                   var10001 = 2671972533585702490L;
                                                   net.minecraft.client.Minecraft var208 = field_43;
                                                   if (!(var208.field_44m instanceof C_47Ld)) {
                                                      C_47Om var101 = (C_47Om)var11;
                                                      String[] var108 = var101.method_41$44c5829186();
                                                      var109 = new java.util.ArrayList();

                                                      label2474:
                                                      for (String var135 : var108) {
                                                         long var651 = 2670983791407098610L;
                                                         net.minecraft.client.Minecraft var222 = field_43;
                                                         var358 = var135.equals(var222.field_44h.method_47$0e30dfc966());
                                                         long var770;
                                                         int var652 = (var770 = var1 - 0L) == 0L ? 0 : (var770 < 0L ? -1 : 1);
                                                         if (var10 != null) {
                                                            break label2870;
                                                         }

                                                         if (var10 == null) {
                                                            var358 = !var358;
                                                         }

                                                         boolean var142 = var358;
                                                         var10001 = 2671096431692727091L;
                                                         net.minecraft.client.Minecraft var234 = field_43;

                                                         label2445: {
                                                            for (Object recovered$element$158771 : var234.method_40$f8db5d9e73().method_43$29638970ac()) {
         net.C_47Yl var179 = (net.C_47Yl) recovered$element$158771;
                                                               net.C_47Yl var400 = var179;
                                                               long var771;
                                                               int var524 = (var771 = var1 - 0L) == 0L ? 0 : (var771 < 0L ? -1 : 1);
                                                               long var772;
                                                               int var653 = (var772 = var1 - 0L) == 0L ? 0 : (var772 < 0L ? -1 : 1);
                                                               if (var10 == null) {
                                                                  String var401 = var179.method_43$cd99b948a0().getName();
                                                                  var651 = 2673203571986372918L;
                                                                  net.minecraft.client.Minecraft var236 = field_43;
                                                                  var402 = var401.equals(var236.field_42P.method_41$cd99b948a0().getName());
                                                                  long var773;
                                                                  int var655 = (var773 = var1 - 0L) == 0L ? 0 : (var773 < 0L ? -1 : 1);
                                                                  if (var10 != null) {
                                                                     break label2445;
                                                                  }

                                                                  if (var402) {
                                                                     continue;
                                                                  }

                                                                  var400 = var179;
                                                               }

                                                               label2441: {
                                                                  if (var10 == null) {
                                                                     net.C_47oP var403 = var400.method_41$8b128fd962();
                                                                     long var774;
                                                                     int var525 = (var774 = var1 - 0L) == 0L ? 0 : (var774 < 0L ? -1 : 1);
                                                                     if (var403 != null) {
                                                                        var404 = var179.method_41$8b128fd962().method_48$0e30dfc966();
                                                                        break label2441;
                                                                     }

                                                                     var400 = var179;
                                                                  }

                                                                  var404 = net.C_46_.method_47$cf2a457752(
                                                                     var400.method_42$47a7a6d93d(), var179.method_43$cd99b948a0().getName()
                                                                  );
                                                               }

                                                               String var182 = var404;
                                                               long var775;
                                                               int var405 = (var775 = var1 - 0L) == 0L ? 0 : (var775 < 0L ? -1 : 1);
                                                               if (var182.contains(var135)) {
                                                                  var142 = false;
                                                                  long var776;
                                                                  int var526 = (var776 = var1 - 0L) == 0L ? 0 : (var776 < 0L ? -1 : 1);
                                                                  if (var10 == null) {
                                                                     break;
                                                                  }
                                                               }

                                                               if (var10 != null) {
                                                                  break;
                                                               }
                                                            }

                                                            var402 = var142;
                                                         }

                                                         long var777;
                                                         int var656 = (var777 = var1 - 0L) == 0L ? 0 : (var777 < 0L ? -1 : 1);
                                                         if (var10 == null) {
                                                            if (var402) {
                                                               var109.add(var135);
                                                            }

                                                            var10001 = 2670790090266153850L;
                                                            client.setting.BooleanSetting var240 = this.settingChatMessageGomme;
                                                            var402 = var240.method_49$aae029aa0a();
                                                         }

                                                         label3039: {
                                                            label3040: {
                                                               long var778;
                                                               int var657 = (var778 = var1 - 0L) == 0L ? 0 : (var778 < 0L ? -1 : 1);
                                                               if (var10 == null) {
                                                                  if (var402) {
                                                                     break label3040;
                                                                  }

                                                                  var10001 = 2670790090266153850L;
                                                                  client.setting.BooleanSetting var249 = this.settingNotificationGomme;
                                                                  var402 = var249.method_49$aae029aa0a();
                                                               }

                                                               if (var10 != null) {
                                                                  continue;
                                                               }

                                                               if (!var402) {
                                                                  break label3039;
                                                               }
                                                            }

                                                            for (Object recovered$element$166217 : var109) {
         String var180 = (String) recovered$element$166217;
                                                               boolean var406 = this.field_43h.contains(var180);
                                                               long var779;
                                                               int var658 = (var779 = var1 - 0L) == 0L ? 0 : (var779 < 0L ? -1 : 1);
                                                               long var780;
                                                               int var659 = (var780 = var1 - 0L) == 0L ? 0 : (var780 < 0L ? -1 : 1);
                                                               if (var10 != null) {
                                                                  continue label2474;
                                                               }

                                                               long var781;
                                                               int var660 = (var781 = var1 - 0L) == 0L ? 0 : (var781 < 0L ? -1 : 1);
                                                               if (var10 == null) {
                                                                  if (var406) {
                                                                     continue;
                                                                  }

                                                                  var10001 = 2670790090266153850L;
                                                                  client.setting.BooleanSetting var253 = this.settingChatMessageGomme;
                                                                  var406 = var253.method_49$aae029aa0a();
                                                               }

                                                               if (var10 == null) {
                                                                  if (var406) {
                                                                     long var683 = 2669743480761811236L;
                                                                     String var257 = var180;
                                                                     long var261 = var8;
                                                                     net.C_47x5 var265 = net.C_47x5.GOMME;
                                                                     StaffDetector_47kd var269 = this;
                                                                     var269.method_41$a667103684(var265, var261, var257);
                                                                  }

                                                                  var10001 = 2670790090266153850L;
                                                                  client.setting.BooleanSetting var273 = this.settingNotificationGomme;
                                                                  var406 = var273.method_49$aae029aa0a();
                                                               }

                                                               if (var406) {
                                                                  long var684 = 2674937637518205245L;
                                                                  long var277 = var4;
                                                                  String var281 = var180;
                                                                  net.C_47x5 var285 = net.C_47x5.GOMME;
                                                                  StaffDetector_47kd var289 = this;
                                                                  var289.method_49$06ed1137c6(var285, var281, var277);
                                                               }
                                                            }
                                                         }

                                                         this.field_43h.clear();
                                                         this.field_43h.addAll(var109);
                                                      }
                                                   }
                                                }
                                                break label2987;
                                             }

                                             if (!var358) {
                                                return;
                                             }

                                             var96 = System.currentTimeMillis();
                                             var363 = ((var11 instanceof C_47Uv) ? 1 : 0);
                                             var444 = var10;
                                             if (var1 > 0L) {
                                                break label3116;
                                             }
                                             break label3087;
                                          }

                                          if (!var358) {
                                             return;
                                          }

                                          var96 = System.currentTimeMillis();
                                          var363 = ((var11 instanceof C_47Uv) ? 1 : 0);
                                          var444 = var10;
                                          long var782;
                                          int var631 = (var782 = var1 - 0L) == 0L ? 0 : (var782 < 0L ? -1 : 1);
                                          break label3087;
                                       }

                                       long var783;
                                       int var407 = (var783 = var1 - 0L) == 0L ? 0 : (var783 < 0L ? -1 : 1);
                                       var10001 = 2673629208581618964L;
                                       net.C_47x5 var294 = net.C_47x5.OTHER;
                                       var358 = var294.method_43$aae029aa0a();
                                       break label2870;
                                    }

                                    if (var1 < 0L) {
                                       break label3115;
                                    }
                                    break label2874;
                                 }

                                 if (!var358) {
                                    return;
                                 }

                                 var96 = System.currentTimeMillis();
                                 var363 = ((var11 instanceof C_47Uv) ? 1 : 0);
                                 var444 = var10;
                                 long var792;
                                 int var661 = (var792 = var1 - 0L) == 0L ? 0 : (var792 < 0L ? -1 : 1);
                                 break label3116;
                              }

                              long var793;
                              int var632 = (var793 = var1 - 0L) == 0L ? 0 : (var793 < 0L ? -1 : 1);
                              break label2874;
                           }

                           while (true) {
                              if (var433 == null) {
                                 var358 = !var358;
                              }

                              label3080: {
                                 boolean var141 = var358;
                                 var10001 = 2671096431692727091L;
                                 net.minecraft.client.Minecraft var233 = field_43;
                                 java.util.Iterator var158 = var233.method_40$f8db5d9e73().method_43$29638970ac().iterator();
                                 Object var396;
                                 if (var158.hasNext()) {
                                    net.C_47Yl var177 = (net.C_47Yl)var158.next();
                                    var396 = var177;
                                    long var794;
                                    int var506 = (var794 = var1 - 0L) == 0L ? 0 : (var794 < 0L ? -1 : 1);
                                 } else {
                                    label3076: {
                                       long var795;
                                       int var633 = (var795 = var1 - 0L) == 0L ? 0 : (var795 < 0L ? -1 : 1);
                                       long var796;
                                       var633 = (var796 = var1 - 0L) == 0L ? 0 : (var796 < 0L ? -1 : 1);
                                       if (var10 == null) {
                                          if (var141) {
                                             var158 = var109.iterator();
                                             if (var158.hasNext()) {
                                                var396 = var158.next();
                                                break label3076;
                                             }
                                          }

                                          this.field_43h.clear();
                                          this.field_43h.addAll(var109);
                                       }

                                       if (++var17 >= var119) {
                                          break label3114;
                                       }

                                       String var134 = var114[var17];
                                       long var635 = 2670983791407098610L;
                                       net.minecraft.client.Minecraft var221 = field_43;
                                       var358 = var134.equals(var221.field_44h.method_47$0e30dfc966());
                                       var433 = var10;
                                       break label3080;
                                    }
                                 }

                                 String var178 = (String)var396;
                                 var358 = this.field_43h.contains(var178);
                                 var433 = var10;
                                 long var797;
                                 int var636 = (var797 = var1 - 0L) == 0L ? 0 : (var797 < 0L ? -1 : 1);
                              }

                              long var798;
                              int var637 = (var798 = var1 - 0L) == 0L ? 0 : (var798 < 0L ? -1 : 1);
                           }
                        }

                        label2328: {
                           label3047: {
                              label3048: {
                                 if (var444 == null) {
                                    if (var363 != 0) {
                                       var10001 = 2671205029228247459L;
                                       net.minecraft.client.Minecraft var297 = field_43;
                                       if (var297.field_44Q.method_45$cf8871fa3f(((C_4766)var11).method_45$8abf5c6871()) == null) {
                                          break label3048;
                                       }
                                    }

                                    var363 = ((var11 instanceof C_47IW) ? 1 : 0);
                                 }

                                 if (var10 != null) {
                                    break label2328;
                                 }

                                 if (var363 == 0) {
                                    break label3047;
                                 }

                                 var10001 = 2671205029228247459L;
                                 net.minecraft.client.Minecraft var301 = field_43;
                                 if (var301.field_44Q.method_45$cf8871fa3f(((C_47IW)var11).method_42$8abf5c6871()) != null) {
                                    break label3047;
                                 }
                              }

                              var10001 = 2673802769250593493L;
                              StaffDetector_47kd var68 = this;
                              long var799;
                              int var397 = (var799 = var68.method_48$f9912cc5c6() - 0L) == 0L ? 0 : (var799 < 0L ? -1 : 1);
                              long var800;
                              int var510 = (var800 = var1 - 0L) == 0L ? 0 : (var800 < 0L ? -1 : 1);
                              long var801;
                              int var639 = (var801 = var1 - 0L) == 0L ? 0 : (var801 < 0L ? -1 : 1);
                              if (var10 == null) {
                                 if ((var397) != 0) {
                                    long var640 = 2674921028585151024L;
                                    long var70 = var6;
                                    StaffDetector_47kd var72 = this;
                                    var72.method_43$e45a9973e5(var70);
                                 }

                                 var10001 = 2670790090266153850L;
                                 client.setting.BooleanSetting var73 = this.settingChatMessageOther;
                                 var397 = ((int) (var73.method_49$aae029aa0a() ? 1 : 0));
                              }

                              if (var10 == null) {
                                 if ((var397) != 0) {
                                    long var677 = 2669743480761811236L;
                                    String var74 = "unknown";
                                    long var75 = var8;
                                    net.C_47x5 var77 = net.C_47x5.OTHER;
                                    StaffDetector_47kd var78 = this;
                                    var78.method_41$a667103684(var77, var75, var74);
                                 }

                                 var10001 = 2670790090266153850L;
                                 client.setting.BooleanSetting var79 = this.settingNotificationOther;
                                 var397 = ((int) (var79.method_49$aae029aa0a() ? 1 : 0));
                              }

                              if ((var397) != 0) {
                                 long var678 = 2674937637518205245L;
                                 long var80 = var4;
                                 String var82 = "unknown";
                                 net.C_47x5 var83 = net.C_47x5.OTHER;
                                 StaffDetector_47kd var84 = this;
                                 var84.method_49$06ed1137c6(var83, var82, var80);
                              }

                              long var641 = 2670296993426950304L;
                              long var329 = var96;
                              StaffDetector_47kd var334 = this;
                              var334.method_44$e45a9973e5(var329);
                           }

                           long var642 = 2673802769250593493L;
                           StaffDetector_47kd var339 = this;
                           long var802;
                           var363 = (byte)((var802 = var96 - var339.method_48$f9912cc5c6() - 30000L) == 0L ? 0 : (var802 < 0L ? -1 : 1));
                        }

                        if (var363 > 0) {
                           long var643 = 2670296993426950304L;
                           long var344 = 0L;
                           StaffDetector_47kd var349 = this;
                           var349.method_44$e45a9973e5(var344);
                        }

                        return;
                     }

                     label2312: {
                        label3049: {
                           label3050: {
                              if (var444 == null) {
                                 if (var363 != 0) {
                                    var10001 = 2671205029228247459L;
                                    net.minecraft.client.Minecraft var295 = field_43;
                                    if (var295.field_44Q.method_45$cf8871fa3f(((C_47Uv)var11).method_48$8abf5c6871()) == null) {
                                       break label3050;
                                    }
                                 }

                                 var363 = ((var11 instanceof C_4766) ? 1 : 0);
                              }

                              long var803;
                              int var662 = (var803 = var1 - 0L) == 0L ? 0 : (var803 < 0L ? -1 : 1);
                              if (var10 == null) {
                                 if (var363 != 0) {
                                    var10001 = 2671205029228247459L;
                                    net.minecraft.client.Minecraft var298 = field_43;
                                    if (var298.field_44Q.method_45$cf8871fa3f(((C_4766)var11).method_45$8abf5c6871()) == null) {
                                       break label3050;
                                    }
                                 }

                                 var363 = ((var11 instanceof C_47IW) ? 1 : 0);
                              }

                              if (var10 != null) {
                                 break label2312;
                              }

                              if (var363 == 0) {
                                 break label3049;
                              }

                              var10001 = 2671205029228247459L;
                              net.minecraft.client.Minecraft var303 = field_43;
                              if (var303.field_44Q.method_45$cf8871fa3f(((C_47IW)var11).method_42$8abf5c6871()) != null) {
                                 break label3049;
                              }
                           }

                           var10001 = 2673802769250593493L;
                           StaffDetector_47kd var305 = this;
                           long var804;
                           int var408 = (var804 = var305.method_48$f9912cc5c6() - 0L) == 0L ? 0 : (var804 < 0L ? -1 : 1);
                           long var805;
                           int var536 = (var805 = var1 - 0L) == 0L ? 0 : (var805 < 0L ? -1 : 1);
                           if (!(var408 != 0)) {
                              var10001 = 2670790090266153850L;
                              client.setting.BooleanSetting var69 = this.settingAcousticWarningOther;
                              boolean var409 = var69.method_49$aae029aa0a();
                              long var806;
                              int var663 = (var806 = var1 - 0L) == 0L ? 0 : (var806 < 0L ? -1 : 1);
                              if (var10 == null) {
                                 if (var409) {
                                    long var664 = 2674921028585151024L;
                                    long var306 = var6;
                                    StaffDetector_47kd var307 = this;
                                    var307.method_43$e45a9973e5(var306);
                                 }

                                 var10001 = 2670790090266153850L;
                                 client.setting.BooleanSetting var308 = this.settingChatMessageOther;
                                 var409 = var308.method_49$aae029aa0a();
                              }

                              if (var10 == null) {
                                 if (var409) {
                                    long var685 = 2669743480761811236L;
                                    String var310 = "unknown";
                                    long var312 = var8;
                                    net.C_47x5 var314 = net.C_47x5.OTHER;
                                    StaffDetector_47kd var316 = this;
                                    var316.method_41$a667103684(var314, var312, var310);
                                 }

                                 var10001 = 2670790090266153850L;
                                 client.setting.BooleanSetting var318 = this.settingNotificationOther;
                                 var409 = var318.method_49$aae029aa0a();
                              }

                              if (var409) {
                                 long var686 = 2674937637518205245L;
                                 long var320 = var4;
                                 String var322 = "unknown";
                                 net.C_47x5 var324 = net.C_47x5.OTHER;
                                 StaffDetector_47kd var326 = this;
                                 var326.method_49$06ed1137c6(var324, var322, var320);
                              }
                           }

                           long var665 = 2670296993426950304L;
                           long var331 = var96;
                           StaffDetector_47kd var336 = this;
                           var336.method_44$e45a9973e5(var331);
                        }

                        long var666 = 2673802769250593493L;
                        StaffDetector_47kd var341 = this;
                        long var807;
                        var363 = (byte)((var807 = var96 - var341.method_48$f9912cc5c6() - 30000L) == 0L ? 0 : (var807 < 0L ? -1 : 1));
                     }

                     if (var363 > 0) {
                        long var667 = 2670296993426950304L;
                        long var346 = 0L;
                        StaffDetector_47kd var351 = this;
                        var351.method_44$e45a9973e5(var346);
                     }

                     return;
                  }

                  if (var444 == null) {
                     if (var363 != 0) {
                        var10001 = 2671205029228247459L;
                        net.minecraft.client.Minecraft var302 = field_43;
                        if (var302.field_44Q.method_45$cf8871fa3f(((C_47IW)var11).method_42$8abf5c6871()) == null) {
                           var10001 = 2673802769250593493L;
                           StaffDetector_47kd var304 = this;
                           long var808;
                           int var398 = (var808 = var304.method_48$f9912cc5c6() - 0L) == 0L ? 0 : (var808 < 0L ? -1 : 1);
                           long var809;
                           int var515 = (var809 = var1 - 0L) == 0L ? 0 : (var809 < 0L ? -1 : 1);
                           long var810;
                           int var644 = (var810 = var1 - 0L) == 0L ? 0 : (var810 < 0L ? -1 : 1);
                           if (var10 == null) {
                              if ((var398) != 0) {
                                 long var679 = 2669743480761811236L;
                                 String var309 = "unknown";
                                 long var311 = var8;
                                 net.C_47x5 var313 = net.C_47x5.OTHER;
                                 StaffDetector_47kd var315 = this;
                                 var315.method_41$a667103684(var313, var311, var309);
                              }

                              var10001 = 2670790090266153850L;
                              client.setting.BooleanSetting var317 = this.settingNotificationOther;
                              var398 = ((int) (var317.method_49$aae029aa0a() ? 1 : 0));
                           }

                           if ((var398) != 0) {
                              long var680 = 2674937637518205245L;
                              long var319 = var4;
                              String var321 = "unknown";
                              net.C_47x5 var323 = net.C_47x5.OTHER;
                              StaffDetector_47kd var325 = this;
                              var325.method_49$06ed1137c6(var323, var321, var319);
                           }

                           long var645 = 2670296993426950304L;
                           long var330 = var96;
                           StaffDetector_47kd var335 = this;
                           var335.method_44$e45a9973e5(var330);
                        }
                     }

                     long var646 = 2673802769250593493L;
                     StaffDetector_47kd var340 = this;
                     long var811;
                     var363 = (byte)((var811 = var96 - var340.method_48$f9912cc5c6() - 30000L) == 0L ? 0 : (var811 < 0L ? -1 : 1));
                  }

                  if (var363 > 0) {
                     long var647 = 2670296993426950304L;
                     long var345 = 0L;
                     StaffDetector_47kd var350 = this;
                     var350.method_44$e45a9973e5(var345);
                  }

                  return;
               }

               long var812;
               int var395 = (var812 = var1 - 0L) == 0L ? 0 : (var812 < 0L ? -1 : 1);
               return;
            }
         }
      } else {
         var10001 = 2673203571986372918L;
         net.minecraft.client.Minecraft var25 = field_43;
         if (var25.field_42P != null) {
            long var12;
            label3118: {
               label2972: {
                  label2971: {
                     label3055: {
                        var10001 = 2673629208581618964L;
                        net.C_47x5 var26 = net.C_47x5.NORMAL;
                        boolean var352 = var26.method_43$aae029aa0a();
                        if (var10 == null) {
                           if (var352) {
                              boolean var354 = var11 instanceof C_47AO;
                              if (var1 > 0L) {
                                 if (var10 == null) {
                                    if (var354) {
                                       label2939: {
                                          C_47AO var92 = (C_47AO)var11;
                                          java.util.List var13 = var92.method_44$3f0615080b();
                                          int var14 = var13.size();
                                          var10001 = 2671096431692727091L;
                                          net.minecraft.client.Minecraft var28 = field_43;
                                          net.C_47K6 var15 = var28.method_40$f8db5d9e73();
                                          int var16 = var15.method_43$29638970ac().size();
                                          if (var14 == 0) {
                                             var10001 = 2670790090266153850L;
                                             client.setting.BooleanSetting var29 = this.settingAcousticWarningSimple;
                                             boolean var355 = var29.method_49$aae029aa0a();
                                             long var813;
                                             int var548 = (var813 = var1 - 0L) == 0L ? 0 : (var813 < 0L ? -1 : 1);
                                             if (var10 == null) {
                                                if (var355) {
                                                   long var549 = 2674921028585151024L;
                                                   long var30 = var6;
                                                   StaffDetector_47kd var32 = this;
                                                   var32.method_43$e45a9973e5(var30);
                                                }

                                                var10001 = 2670790090266153850L;
                                                client.setting.BooleanSetting var33 = this.settingChatMessageSimple;
                                                var355 = var33.method_49$aae029aa0a();
                                             }

                                             if (var10 == null) {
                                                if (var355) {
                                                   long var668 = 2669743480761811236L;
                                                   String var34 = "unknown";
                                                   long var35 = var8;
                                                   net.C_47x5 var37 = net.C_47x5.SIMPLE;
                                                   StaffDetector_47kd var38 = this;
                                                   var38.method_41$a667103684(var37, var35, var34);
                                                }

                                                var356 = this;
                                                break label2939;
                                             }

                                             if (var355) {
                                                long var10004 = 2674937637518205245L;
                                                long var40 = var4;
                                                String var42 = "unknown";
                                                net.C_47x5 var43 = net.C_47x5.SIMPLE;
                                                StaffDetector_47kd var44 = this;
                                                var44.method_49$06ed1137c6(var43, var42, var40);
                                             }
                                          }

                                          var356 = this;
                                       }

                                       long var814;
                                       int var550 = (var814 = var1 - 0L) == 0L ? 0 : (var814 < 0L ? -1 : 1);
                                       var356.field_43a = true;
                                       this.field_43a = false;
                                    }

                                    var10001 = 2673629208581618964L;
                                    net.C_47x5 var199 = net.C_47x5.GOMME;
                                    var354 = var199.method_43$aae029aa0a();
                                 }

                                 if (var10 == null) {
                                    if (var354) {
                                       var354 = var11 instanceof C_47Om;
                                    } else {
                                       long var815;
                                       int var357 = (var815 = var1 - 0L) == 0L ? 0 : (var815 < 0L ? -1 : 1);
                                       var10001 = 2673629208581618964L;
                                       net.C_47x5 var291 = net.C_47x5.OTHER;
                                       var354 = var291.method_43$aae029aa0a();
                                    }
                                 }

                                 if (!var354) {
                                    return;
                                 }

                                 var12 = System.currentTimeMillis();
                                 var353 = ((var11 instanceof C_47Uv) ? 1 : 0);
                                 var413 = var10;
                                 long var816;
                                 int var551 = (var816 = var1 - 0L) == 0L ? 0 : (var816 < 0L ? -1 : 1);
                                 break label3118;
                              }

                              if (var10 == null) {
                                 if (!var354) {
                                    if (var1 < 0L) {
                                       return;
                                    }

                                    var10001 = 2673629208581618964L;
                                    net.C_47x5 var290 = net.C_47x5.OTHER;
                                    if (!var290.method_43$aae029aa0a()) {
                                       return;
                                    }

                                    var12 = System.currentTimeMillis();
                                    var353 = ((var11 instanceof C_47Uv) ? 1 : 0);
                                    var413 = var10;
                                    long var817;
                                    int var543 = (var817 = var1 - 0L) == 0L ? 0 : (var817 < 0L ? -1 : 1);
                                    break label2971;
                                 }

                                 var354 = var11 instanceof C_47Om;
                              }

                              if (!var354) {
                                 return;
                              }

                              var12 = System.currentTimeMillis();
                              var353 = ((var11 instanceof C_47Uv) ? 1 : 0);
                              var413 = var10;
                              long var818;
                              int var10002 = (var818 = var1 - 0L) == 0L ? 0 : (var818 < 0L ? -1 : 1);
                              break label3055;
                           }

                           var10001 = 2673629208581618964L;
                           net.C_47x5 var45 = net.C_47x5.GOMME;
                           var352 = var45.method_43$aae029aa0a();
                        }

                        if (var10 == null) {
                           if (!var352) {
                              if (var1 < 0L) {
                                 return;
                              }

                              var10001 = 2673629208581618964L;
                              net.C_47x5 var64 = net.C_47x5.OTHER;
                              if (!var64.method_43$aae029aa0a()) {
                                 return;
                              }

                              var12 = System.currentTimeMillis();
                              var353 = ((var11 instanceof C_47Uv) ? 1 : 0);
                              var413 = var10;
                              if (var1 > 0L) {
                                 break label3118;
                              }
                              break label2971;
                           }

                           var352 = var11 instanceof C_47Om;
                        }

                        if (!var352) {
                           return;
                        }

                        var12 = System.currentTimeMillis();
                        var353 = ((var11 instanceof C_47Uv) ? 1 : 0);
                        var413 = var10;
                        if (var1 > 0L) {
                           break label3118;
                        }
                     }

                     if (var1 < 0L) {
                        if (var413 == null) {
                           if (var353 != 0) {
                              var10001 = 2671205029228247459L;
                              net.minecraft.client.Minecraft var67 = field_43;
                              if (var67.field_44Q.method_45$cf8871fa3f(((C_47IW)var11).method_42$8abf5c6871()) == null) {
                                 long var540 = 2670296993426950304L;
                                 long var85 = var12;
                                 StaffDetector_47kd var87 = this;
                                 var87.method_44$e45a9973e5(var85);
                              }
                           }

                           long var541 = 2673802769250593493L;
                           StaffDetector_47kd var88 = this;
                           long var819;
                           var353 = (byte)((var819 = var12 - var88.method_48$f9912cc5c6() - 30000L) == 0L ? 0 : (var819 < 0L ? -1 : 1));
                        }

                        if (var353 > 0) {
                           long var542 = 2670296993426950304L;
                           long var89 = 0L;
                           StaffDetector_47kd var91 = this;
                           var91.method_44$e45a9973e5(var89);
                        }

                        return;
                     }
                     break label2972;
                  }

                  long var820;
                  int var544 = (var820 = var1 - 0L) == 0L ? 0 : (var820 < 0L ? -1 : 1);
               }

               label2921: {
                  label2920: {
                     label3061: {
                        if (var413 == null) {
                           if (var353 != 0) {
                              var10001 = 2671205029228247459L;
                              net.minecraft.client.Minecraft var66 = field_43;
                              if (var66.field_44Q.method_45$cf8871fa3f(((C_4766)var11).method_45$8abf5c6871()) == null) {
                                 break label3061;
                              }
                           }

                           var353 = ((var11 instanceof C_47IW) ? 1 : 0);
                        }

                        if (var10 != null) {
                           break label2921;
                        }

                        if (var353 == 0) {
                           break label2920;
                        }

                        var10001 = 2671205029228247459L;
                        net.minecraft.client.Minecraft var299 = field_43;
                        if (var299.field_44Q.method_45$cf8871fa3f(((C_47IW)var11).method_42$8abf5c6871()) != null) {
                           break label2920;
                        }
                     }

                     long var545 = 2670296993426950304L;
                     long var327 = var12;
                     StaffDetector_47kd var332 = this;
                     var332.method_44$e45a9973e5(var327);
                  }

                  long var546 = 2673802769250593493L;
                  StaffDetector_47kd var337 = this;
                  long var821;
                  var353 = (byte)((var821 = var12 - var337.method_48$f9912cc5c6() - 30000L) == 0L ? 0 : (var821 < 0L ? -1 : 1));
               }

               if (var353 > 0) {
                  long var547 = 2670296993426950304L;
                  long var342 = 0L;
                  StaffDetector_47kd var347 = this;
                  var347.method_44$e45a9973e5(var342);
               }

               return;
            }

            label2905: {
               label2904: {
                  label3062: {
                     if (var413 == null) {
                        if (var353 != 0) {
                           var10001 = 2671205029228247459L;
                           net.minecraft.client.Minecraft var65 = field_43;
                           if (var65.field_44Q.method_45$cf8871fa3f(((C_47Uv)var11).method_48$8abf5c6871()) == null) {
                              break label3062;
                           }
                        }

                        var353 = ((var11 instanceof C_4766) ? 1 : 0);
                     }

                     long var822;
                     int var552 = (var822 = var1 - 0L) == 0L ? 0 : (var822 < 0L ? -1 : 1);
                     if (var10 == null) {
                        if (var353 != 0) {
                           var10001 = 2671205029228247459L;
                           net.minecraft.client.Minecraft var296 = field_43;
                           if (var296.field_44Q.method_45$cf8871fa3f(((C_4766)var11).method_45$8abf5c6871()) == null) {
                              break label3062;
                           }
                        }

                        var353 = ((var11 instanceof C_47IW) ? 1 : 0);
                     }

                     if (var10 != null) {
                        break label2905;
                     }

                     if (var353 == 0) {
                        break label2904;
                     }

                     var10001 = 2671205029228247459L;
                     net.minecraft.client.Minecraft var300 = field_43;
                     if (var300.field_44Q.method_45$cf8871fa3f(((C_47IW)var11).method_42$8abf5c6871()) != null) {
                        break label2904;
                     }
                  }

                  long var553 = 2670296993426950304L;
                  long var328 = var12;
                  StaffDetector_47kd var333 = this;
                  var333.method_44$e45a9973e5(var328);
               }

               long var554 = 2673802769250593493L;
               StaffDetector_47kd var338 = this;
               long var823;
               var353 = (byte)((var823 = var12 - var338.method_48$f9912cc5c6() - 30000L) == 0L ? 0 : (var823 < 0L ? -1 : 1));
            }

            if (var353 > 0) {
               long var555 = 2670296993426950304L;
               long var343 = 0L;
               StaffDetector_47kd var348 = this;
               var348.method_44$e45a9973e5(var343);
            }
         }
      }
   }










   private void method_47$e45a9973e5(long var1) {
      net.C_47x5 var23;
      long var28;
      augustus.recovered.modules.misc.StaffDetector_47kd var25;
      int[] var3;
      int var21;
      int[] var31;
      label199: {
         label198: {
            long var10002;
            label197: {
               label202: {
                  label195: {
                     var1 = a ^ var1;
                     long var10000 = 4176457745124076238L;
                     var3 = ClientSettings_47kr.method_46$d4d28024c9();
                     this.field_45N.clear();
                     long var10001 = 4170539866723688942L;
                     C_47x5 var6 = C_47x5.GOMME;
                     var21 = (int) ((var6.method_43$aae029aa0a()) ? 1 : 0);
                     label194:
                     if (var3 == null) {
                        if ((var21) != 0) {
                           long var26 = 4173311968524144512L;
                           BooleanSetting var7 = this.settingShowInSpectatorListGomme;
                           var21 = (int) ((var7.method_49$aae029aa0a()) ? 1 : 0);
                           var31 = var3;
                           if (var1 < 0L) {
                              break label195;
                           }

                           if (var3 != null) {
                              break label194;
                           }

                           if ((var21) != 0) {
                              for (Object recovered$element$57686 : this.field_43h) {
         String var5 = (String) recovered$element$57686;
                                 this.field_45N.put(var5, this.field_45y.contains(var5));
                                 int[] var22 = var3;
                                 if (var1 >= 0L) {
                                    if (var3 != null) {
                                       break label202;
                                    }

                                    var22 = var3;
                                 }

                                 if (var22 != null) {
                                    break;
                                 }
                              }
                           }
                        }

                        var23 = C_47x5.OTHER;
                        var28 = 4170539866723688942L;
                        var10002 = var1;
                        if (var1 < 0L) {
                           break label197;
                        }

                        C_47x5 var8 = C_47x5.OTHER;
                        var21 = (int) ((var8.method_43$aae029aa0a()) ? 1 : 0);
                     }

                     var31 = var3;
                  }

                  if (var31 != null) {
                     break label198;
                  }

                  if ((var21) != 0) {
                     long var29 = 4173311968524144512L;
                     BooleanSetting var9 = this.settingShowInSpectatorListOther;
                     var21 = (int) ((var9.method_49$aae029aa0a()) ? 1 : 0);
                     if (var3 != null) {
                        break label198;
                     }

                     if ((var21) != 0) {
                        long var30 = 4170712602824226351L;
                        StaffDetector_47kd var10 = this;
                        long var39;
                        var21 = (var39 = var10.method_48$f9912cc5c6() - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
                        var31 = var3;
                        if (var1 <= 0L) {
                           break label199;
                        }

                        if (var3 != null) {
                           break label198;
                        }

                        if ((var21) != 0) {
                           this.field_45N.put("Unknown Staff", true);
                        }
                     }
                  }
               }

               var23 = C_47x5.SIMPLE;
               var28 = 4170539866723688942L;
               var10002 = var1;
            }

            var21 = (int) ((recovery$indy$75(var23, var28, var10002)) ? 1 : 0);
         }

         var31 = var3;
      }

      label157: {
         label156:
         if (var31 == null) {
            if ((var21) != 0) {
               long var32 = 4173311968524144512L;
               BooleanSetting var11 = this.settingShowInSpectatorListSimple;
               var21 = (int) ((var11.method_49$aae029aa0a()) ? 1 : 0);
               if (var3 != null) {
                  break label156;
               }

               if ((var21) != 0) {
                  var21 = (int) ((this.field_43a) ? 1 : 0);
                  var31 = var3;
                  if (var1 <= 0L) {
                     break label157;
                  }

                  if (var3 != null) {
                     break label156;
                  }

                  if (this.field_43a) {
                     this.field_45N.put("Unknown Staff", true);
                  }
               }
            }

            long var34 = 4170539866723688942L;
            C_47x5 var12 = C_47x5.LIST_BASED;
            var21 = (int) ((var12.method_43$aae029aa0a()) ? 1 : 0);
         }

         var31 = var3;
      }

      label142: {
         label141:
         if (var31 == null) {
            if ((var21) != 0) {
               long var35 = 4173311968524144512L;
               BooleanSetting var13 = this.settingShowInSpectatorListListBased;
               var21 = (int) ((var13.method_49$aae029aa0a()) ? 1 : 0);
               var31 = var3;
               if (var1 <= 0L) {
                  break label142;
               }

               if (var3 != null) {
                  break label141;
               }

               if ((var21) != 0) {
                  for (Object recovered$element$61912 : this.field_45z) {
         String var19 = (String) recovered$element$61912;
                     this.field_45N.put(var19, true);
                     int[] var24 = var3;
                     if (var1 >= 0L) {
                        if (var3 != null) {
                           return;
                        }

                        var24 = var3;
                     }

                     if (var24 != null) {
                        break;
                     }
                  }
               }
            }

            if (var1 < 0L) {
               return;
            }

            long var37 = 4170539866723688942L;
            C_47x5 var14 = C_47x5.NORMAL;
            var21 = (int) ((var14.method_43$aae029aa0a()) ? 1 : 0);
         }

         var31 = var3;
      }

      label212: {
         if (var31 == null) {
            if (!(var21 != 0)) {
               return;
            }

            var25 = this;
            if (var3 != null) {
               break label212;
            }

            long var38 = 4173311968524144512L;
            BooleanSetting var15 = this.settingShowInSpectatorListNormal;
            var21 = (int) ((var15.method_49$aae029aa0a()) ? 1 : 0);
         }

         if (!(var21 != 0)) {
            return;
         }

         var25 = this;
      }

      for (Object recovered$element$63200 : var25.field_48) {
         String var20 = (String) recovered$element$63200;
         this.field_45N.put(var20, true);
         if (var3 != null) {
            break;
         }
      }
   }





   private static String method_47$e96e035cfc(File var0) {
      return var0.getName().substring(0, Math.max(0, var0.getName().length() - 4));
   }



   private static boolean method_47$e8c79bc3f2(File var0) {
      long var1 = a ^ 117991716968761L;
      long var10000 = -1281019855951987453L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      File var4 = var0;
      if (var3 == null) {
         if (var0 == null) {
            return false;
         }

         var4 = var0;
      }

      boolean var5 = var4.getName().endsWith(".txt");
      return var3 != null ? var5 : var5;
   }



   private void method_43$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 84321350850633L;
      recovery$indy$76(field_43, 6064839373479192554L, var1)
         .method_48$38ea80174b(
            C_4747.method_42$1e753247d3(C_47rL.field_48o, (float)(recovery$indy$77(this.settingAcousticWaringVolume, var3, 6061891751675218217L, var1) / 100.0))
         );
   }



   private void method_43$4c39de7104(C_47AO var1) {
      long var2 = a ^ 130897642246938L;
      long var4 = (var2 ^ 1498017582656L) >>> 16;
      int var6 = (int)((var2 ^ 1498017582656L) << 48 >>> 48);
      LinkedList var8 = new LinkedList();
      long var10000 = 7213635645998495520L;
      int[] var33 = ClientSettings_47kr.method_46$d4d28024c9();
      Iterator var9 = var1.method_44$3f0615080b().iterator();
      int[] var7 = var33;

      while (true) {
         if (var9.hasNext()) {
            C_46Q var10 = (C_46Q)var9.next();
            long var10001 = 7207313198669922855L;
            Minecraft var18 = field_43;
            boolean var34 = var18.method_40$f8db5d9e73().method_43$43b9f1ea53().containsKey(var10.method_40$cd99b948a0().getId());
            if (var7 != null) {
               break;
            }

            if (var34) {
               continue;
            }

            UUID var11 = var10.method_40$cd99b948a0().getId();

            try {
               StringBuilder var37 = new StringBuilder();
               short var10003 = 30743;
               long var42 = 5698283293480474315L ^ var2;
               URL var12 = new URL(var37.append("https://sessionserver.mojang.com/session/minecraft/profile/").append(var11).toString());
               HttpURLConnection var31 = (HttpURLConnection)var12.openConnection();
               short var36 = 28133;
               long var38 = 5556009477419418432L ^ var2;
               var31.setRequestMethod("GET");
               var31.setConnectTimeout(20000);
               var31.connect();
               BufferedReader var14 = new BufferedReader(new InputStreamReader(var31.getInputStream()));
               String var15 = "";
               StringBuilder var16 = new StringBuilder();

               label42: {
                  while ((var15 = var14.readLine()) != null) {
                     var16.append(var15);
                     if (var7 != null) {
                        break label42;
                     }

                     if (var7 != null) {
                        break;
                     }
                  }

                  var31.disconnect();
                  IOUtils.closeQuietly(var14);
               }

               String[] var17 = var16.toString().split("\"");
               String var39 = var17[7];
               short var43 = (short)var6;
               var42 = 7212587373345401152L;
               String var19 = var39;
               short var20 = var43;
               long var21 = var4;
               StaffDetector_47kd var23 = this;
               var23.method_40$af3834366e(var21, var20, var19);
               var8.add(var17[7]);
            } catch (Exception var30) {
               var10001 = 7207074736379908718L;
               BooleanSetting var24 = this.settingExcludeRawUUIDS;
               if (!var24.method_49$aae029aa0a()) {
                  String var13 = var11.toString();
                  short var10002 = (short)var6;
                  long var10004 = 7212587373345401152L;
                  String var25 = var13;
                  short var26 = var10002;
                  long var27 = var4;
                  StaffDetector_47kd var29 = this;
                  var29.method_40$af3834366e(var27, var26, var25);
                  var8.add(var13);
               }
            }

            if (var7 == null) {
               continue;
            }
         }

         this.field_48.removeIf(recovery$indy$78(var8));
         break;
      }
   }




   private boolean method_45j$aae029aa0a() {
      long var1 = a ^ 77579705299320L;
      long var10001 = var1 ^ 129862142455953L;
      int var3 = (int)((var1 ^ 129862142455953L) >>> 32);
      int var4 = (int)((var1 ^ 129862142455953L) << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      long var10000 = 466627119685080386L;
      int[] var6 = ClientSettings_47kr.method_46$d4d28024c9();
      var10001 = 463267184893105019L;
      SettingGroup var7 = this.settingSimpleModeSettings;
      boolean var12 = var7.method_44$aae029aa0a();
      if (var6 == null) {
         if (!var12) {
            return false;
         }

         byte var10003 = (byte)var5;
         long var10004 = 463425455609619066L;
         byte var8 = var10003;
         int var9 = var4;
         int var10 = var3;
         StaffDetector_47kd var11 = this;
         var12 = var11.method_452$5a0422472c(var10, var9, var8);
      }

      return var6 != null ? var12 : var12;
   }



   private boolean method_452$5a0422472c(int var1, int var2, byte var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
      long var6 = var4 ^ 74332870037430L;
      int[] var8 = recovery$indy$79(4748442453975093982L, var4);
      boolean var10000 = recovery$indy$80(ClientGlobals.field_48.field_443, var6, 4752126653204107190L, var4);
      if (var8 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$81(C_47sv.VANISH_NOTIFICATION, 4754821358777897411L, var4);
      }

      return var8 != null ? var10000 : var10000;
   }



   private boolean method_45S$aae029aa0a() {
      long var1 = a ^ 52057551295210L;
      long var10001 = var1 ^ 34967941944067L;
      int var3 = (int)((var1 ^ 34967941944067L) >>> 32);
      int var4 = (int)((var1 ^ 34967941944067L) << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      long var10000 = -1879228980486703408L;
      int[] var6 = ClientSettings_47kr.method_46$d4d28024c9();
      var10001 = -1873582267658735383L;
      SettingGroup var7 = this.settingOldGommeModeSettings;
      boolean var12 = var7.method_44$aae029aa0a();
      if (var6 == null) {
         if (!var12) {
            return false;
         }

         byte var10003 = (byte)var5;
         long var10004 = -1874619868580363800L;
         byte var8 = var10003;
         int var9 = var4;
         int var10 = var3;
         StaffDetector_47kd var11 = this;
         var12 = var11.method_452$5a0422472c(var10, var9, var8);
      }

      return var6 != null ? var12 : var12;
   }



   public boolean method_45F$0dd78e0064(long var1) {
      var1 = a ^ var1;
      int[] var3 = recovery$indy$82(539023863931573313L, var1);
      Iterator var4 = this.field_45N.keySet().iterator();

      boolean var8;
      while (true) {
         if (var4.hasNext()) {
            String var5 = (String)var4.next();
            Boolean var6 = (Boolean)this.field_45N.get(var5);
            Boolean var10000 = var6;
            if (var3 == null) {
               if (var6 == null) {
                  continue;
               }

               var10000 = var6;
            }

            var8 = var10000;
            if (var3 != null) {
               break;
            }

            if (var8) {
               var8 = true;
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         return false;
      }

      return var8;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$83(this, 32, var3, -7103725861799165149L, var1);
      recovery$indy$84(this, 26, var3, -7103725861799165149L, var1);
      recovery$indy$85(this, 40, var3, -7103725861799165149L, var1);
      recovery$indy$86(this, 17, var3, -7103725861799165149L, var1);
   }



   private boolean method_45L$aae029aa0a() {
      long var1 = a ^ 354743606543L;
      long var10000 = 7642199793766234421L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 7643130938091101307L;
      BooleanSetting var4 = this.settingShowInSpectatorListNormal;
      boolean var12 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (var12) {
            var10001 = 7645596836798758668L;
            BooleanSetting var5 = this.settingShowInSpectatorListNormal;
            boolean var20 = var5.method_44$aae029aa0a();
            if (var3 != null) {
               return var20;
            }

            if (var20) {
               return true;
            }
         }

         var10001 = 7643130938091101307L;
         BooleanSetting var6 = this.settingShowInSpectatorListGomme;
         var12 = var6.method_49$aae029aa0a();
      }

      if (var3 == null) {
         if (var12) {
            var10001 = 7645596836798758668L;
            BooleanSetting var7 = this.settingShowInSpectatorListGomme;
            boolean var21 = var7.method_44$aae029aa0a();
            if (var3 != null) {
               return var21;
            }

            if (var21) {
               return true;
            }
         }

         var10001 = 7643130938091101307L;
         BooleanSetting var8 = this.settingShowInSpectatorListOther;
         var12 = var8.method_49$aae029aa0a();
      }

      if (var3 == null) {
         if (var12) {
            var10001 = 7645596836798758668L;
            BooleanSetting var9 = this.settingShowInSpectatorListOther;
            boolean var22 = var9.method_44$aae029aa0a();
            if (var3 != null) {
               return var22;
            }

            if (var22) {
               return true;
            }
         }

         var10001 = 7643130938091101307L;
         BooleanSetting var10 = this.settingShowInSpectatorListListBased;
         var12 = var10.method_49$aae029aa0a();
      }

      if (var3 == null) {
         if (!var12) {
            return false;
         }

         var10001 = 7645596836798758668L;
         BooleanSetting var11 = this.settingShowInSpectatorListListBased;
         var12 = var11.method_44$aae029aa0a();
      }

      return var3 != null ? var12 : var12;
   }




   private boolean method_45J$aae029aa0a() {
      long var1 = a ^ 139695107945998L;
      long var10001 = var1 ^ 87515349481447L;
      int var3 = (int)((var1 ^ 87515349481447L) >>> 32);
      int var4 = (int)((var1 ^ 87515349481447L) << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      long var10000 = -9146824693436968396L;
      int[] var6 = ClientSettings_47kr.method_46$d4d28024c9();
      var10001 = -9143465512688577523L;
      SettingGroup var7 = this.settingOtherModeSettings;
      boolean var12 = var7.method_44$aae029aa0a();
      if (var6 == null) {
         if (!var12) {
            return false;
         }

         byte var10003 = (byte)var5;
         long var10004 = -9144467248131103476L;
         byte var8 = var10003;
         int var9 = var4;
         int var10 = var3;
         StaffDetector_47kd var11 = this;
         var12 = var11.method_452$5a0422472c(var10, var9, var8);
      }

      return var6 != null ? var12 : var12;
   }



   private boolean method_45u$aae029aa0a() {
      long var1 = a ^ 112795840987293L;
      long var10000 = 8619022155564901543L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 8611935626748674537L;
      BooleanSetting var4 = this.settingShowInSpectatorListNormal;
      boolean var12 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (var12) {
            var10001 = 8613410352499548830L;
            BooleanSetting var5 = this.settingShowInSpectatorListNormal;
            boolean var20 = var5.method_44$aae029aa0a();
            if (var3 != null) {
               return var20;
            }

            if (var20) {
               return true;
            }
         }

         var10001 = 8611935626748674537L;
         BooleanSetting var6 = this.settingShowInSpectatorListGomme;
         var12 = var6.method_49$aae029aa0a();
      }

      if (var3 == null) {
         if (var12) {
            var10001 = 8613410352499548830L;
            BooleanSetting var7 = this.settingShowInSpectatorListGomme;
            boolean var21 = var7.method_44$aae029aa0a();
            if (var3 != null) {
               return var21;
            }

            if (var21) {
               return true;
            }
         }

         var10001 = 8611935626748674537L;
         BooleanSetting var8 = this.settingShowInSpectatorListOther;
         var12 = var8.method_49$aae029aa0a();
      }

      if (var3 == null) {
         if (var12) {
            var10001 = 8613410352499548830L;
            BooleanSetting var9 = this.settingShowInSpectatorListOther;
            boolean var22 = var9.method_44$aae029aa0a();
            if (var3 != null) {
               return var22;
            }

            if (var22) {
               return true;
            }
         }

         var10001 = 8611935626748674537L;
         BooleanSetting var10 = this.settingShowInSpectatorListListBased;
         var12 = var10.method_49$aae029aa0a();
      }

      if (var3 == null) {
         if (!var12) {
            return false;
         }

         var10001 = 8613410352499548830L;
         BooleanSetting var11 = this.settingShowInSpectatorListListBased;
         var12 = var11.method_44$aae029aa0a();
      }

      return var3 != null ? var12 : var12;
   }




   private boolean method_457$aae029aa0a() {
      long var1 = a ^ 37760572609674L;
      long var10000 = -2050353625634017104L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -2047738072402078210L;
      BooleanSetting var4 = this.settingAcousticWarningNormal;
      boolean var12 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (var12) {
            var10001 = -2044704780346657143L;
            BooleanSetting var5 = this.settingAcousticWarningNormal;
            boolean var20 = var5.method_44$aae029aa0a();
            if (var3 != null) {
               return var20;
            }

            if (var20) {
               return true;
            }
         }

         var10001 = -2047738072402078210L;
         BooleanSetting var6 = this.settingAcousticWarningGomme;
         var12 = var6.method_49$aae029aa0a();
      }

      if (var3 == null) {
         if (var12) {
            var10001 = -2044704780346657143L;
            BooleanSetting var7 = this.settingAcousticWarningGomme;
            boolean var21 = var7.method_44$aae029aa0a();
            if (var3 != null) {
               return var21;
            }

            if (var21) {
               return true;
            }
         }

         var10001 = -2047738072402078210L;
         BooleanSetting var8 = this.settingAcousticWarningOther;
         var12 = var8.method_49$aae029aa0a();
      }

      if (var3 == null) {
         if (var12) {
            var10001 = -2044704780346657143L;
            BooleanSetting var9 = this.settingAcousticWarningOther;
            boolean var22 = var9.method_44$aae029aa0a();
            if (var3 != null) {
               return var22;
            }

            if (var22) {
               return true;
            }
         }

         var10001 = -2047738072402078210L;
         BooleanSetting var10 = this.settingAcousticWarningListBased;
         var12 = var10.method_49$aae029aa0a();
      }

      if (var3 == null) {
         if (!var12) {
            return false;
         }

         var10001 = -2044704780346657143L;
         BooleanSetting var11 = this.settingAcousticWarningListBased;
         var12 = var11.method_44$aae029aa0a();
      }

      return var3 != null ? var12 : var12;
   }




    public void method_48o$537c8d9634(int a0,short a1,char a2) {
        long converted12;
        long computed13;
        long converted14;
        long computed15;
        long computed16;
        long computed17;
        long converted18;
        long computed19;
        long computed20;
        long computed21;
        long computed23;
        long computed24;
        int converted25;
        long computed27;
        long computed28;
        int converted29;
        long computed31;
        long computed32;
        int converted33;
        long computed35;
        long computed37;
        long computed39;
        long computed41;
        long computed43;
        long computed44;
        int converted45;
        long computed47;
        long computed48;
        int converted49;
        long computed51;
        long computed52;
        int converted53;
        java.lang.Object value55;
        java.lang.Object value59;
        java.lang.Object value60;
        java.lang.Object value62;
        boolean value63;
        int regionValue76;
        int edgeValue89;
        int edgeValue121;
        java.lang.Object value206;
        java.lang.Object value207;
        java.lang.Object value209;
        int value210;
        long converted211;
        java.lang.Object value215;
        boolean value216;
        int edgeValue229;
        int edgeValue259;
        java.lang.Object value358;
        java.lang.Object value360;
        java.lang.Object value361;
        boolean value362;
        int regionValue375;
        int edgeValue389;
        int edgeValue421;
        java.lang.Object value568;
        java.lang.Object value570;
        double value571;
        java.lang.Object value572;
        java.lang.Object value574;
        java.lang.Object value577;
        java.lang.Object value578;
        java.lang.Object value580;
        java.lang.Object value581;
        java.lang.Object value582;
        java.lang.Object value583;
        boolean value613;
        java.lang.Object value668;
        java.lang.Object value669;
        java.lang.Object value670;
        java.lang.Object value671;
        java.lang.Object value672;
        java.lang.Object value673;
        java.lang.Object value674;
        java.lang.Object value675;
        java.lang.Object value676;
        long value677;
        java.lang.Object value678;
        java.lang.Object value679;
        java.util.LinkedList initialized850;
        java.lang.Object value852;
        java.lang.Object value853;
        java.lang.Object value854;
        java.lang.Object regionValue860;
        boolean value928;
        java.lang.Object value989;
        java.lang.Object regionValue1005;
        java.lang.Object edgeValue1021;
        java.lang.Object value1022;
        java.lang.Object edgeValue1038;
        java.lang.Object regionValue1052;
        java.lang.Object edgeValue1066;
        java.lang.Object value1067;
        java.lang.Object value1068;
        java.lang.Object value1069;
        java.lang.Object value1070;
        java.lang.Object value1071;
        java.lang.Object value1072;
        java.lang.Object regionValue1088;
        java.lang.Object regionValue1089;
        java.lang.Object regionValue1090;
        java.lang.Object edgeValue1107;
        java.lang.Object edgeValue1108;
        java.lang.Object edgeValue1109;
        java.lang.Object regionValue1126;
        java.lang.Object regionValue1127;
        java.lang.Object regionValue1128;
        java.lang.Object edgeValue1145;
        java.lang.Object edgeValue1146;
        java.lang.Object edgeValue1147;
        java.lang.Object edgeValue1154;
        java.lang.Object regionValue1170;
        java.lang.Object regionValue1171;
        java.lang.Object regionValue1172;
        java.lang.Object edgeValue1188;
        java.lang.Object edgeValue1189;
        java.lang.Object edgeValue1190;
        java.lang.Object edgeValue1206;
        java.lang.Object edgeValue1207;
        java.lang.Object edgeValue1208;
        java.lang.Object regionValue1225;
        java.lang.Object regionValue1226;
        java.lang.Object edgeValue1242;
        java.lang.Object edgeValue1243;
        java.lang.Object regionValue1259;
        java.lang.Object regionValue1260;
        java.lang.Object regionValue1261;
        java.lang.Object edgeValue1277;
        java.lang.Object edgeValue1278;
        java.lang.Object edgeValue1279;
        java.lang.Object regionValue1295;
        java.lang.Object edgeValue1311;
        java.lang.Object regionValue1327;
        java.lang.Object regionValue1328;
        java.lang.Object edgeValue1344;
        java.lang.Object edgeValue1345;
        java.lang.Object edgeValue1361;
        java.lang.Object edgeValue1362;
        long value1363;
        long computed1364;
        long value1365;
        int comparison1366;
        java.lang.Object regionValue1382;
        int regionValue1383;
        java.lang.Object edgeValue1400;
        int edgeValue1401;
        java.lang.Object regionValue1418;
        int regionValue1419;
        java.lang.Object edgeValue1436;
        int edgeValue1437;
        java.lang.Object regionValue1454;
        int regionValue1455;
        java.lang.Object edgeValue1471;
        int edgeValue1472;
        java.lang.Object regionValue1488;
        int regionValue1489;
        java.lang.Object edgeValue1505;
        int edgeValue1506;
        java.lang.Object regionValue1522;
        int regionValue1523;
        java.lang.Object edgeValue1539;
        int edgeValue1540;
        java.lang.Object regionValue1586;
        java.lang.Object edgeValue1602;
        java.lang.Object value1603;
        boolean value1604;
        java.lang.Object edgeValue1620;
        int edgeValue1621;
        java.lang.Object edgeValue1637;
        int edgeValue1638;
        int regionValue1655;
        int edgeValue1671;
        java.lang.Object regionValue1687;
        int regionValue1688;
        java.lang.Object edgeValue1704;
        int edgeValue1705;
        java.lang.Object edgeValue1736;
        boolean value1737;
        int edgeValue1753;
        java.lang.Object value1814;
        java.lang.Object edgeValue1830;
        java.lang.Object edgeValue1844;
        java.lang.Object value1845;
        java.lang.Object regionValue1859;
        java.lang.Object edgeValue1873;
        boolean value1874;
        java.lang.Object regionValue1888;
        java.lang.Object edgeValue1902;
        java.lang.Object regionValue1916;
        java.lang.Object edgeValue1930;
        java.lang.Object regionValue1944;
        java.lang.Object regionValue1945;
        java.lang.Object edgeValue1959;
        java.lang.Object edgeValue1960;
        java.lang.Object regionValue1974;
        java.lang.Object regionValue1975;
        java.lang.Object edgeValue1989;
        java.lang.Object edgeValue1990;
        java.lang.Object value1991;
        java.lang.Object regionValue2005;
        java.lang.Object regionValue2006;
        java.lang.Object edgeValue2020;
        java.lang.Object edgeValue2021;
        java.lang.Object value2022;
        java.lang.Object value2023;
        java.lang.Object edgeValue2037;
        java.lang.Object edgeValue2038;
        java.lang.Object regionValue2052;
        java.lang.Object edgeValue2066;
        java.lang.Object value2067;
        java.lang.Object value2068;
        java.lang.Object value2069;
        java.lang.Object value2070;
        java.lang.Object regionValue2084;
        java.lang.Object edgeValue2098;
        java.lang.Object regionValue2112;
        java.lang.Object edgeValue2126;
        java.lang.Object edgeValue2140;
        java.lang.Object regionValue2154;
        java.lang.Object edgeValue2168;
        java.lang.Object value2169;
        java.lang.Object value2170;
        java.lang.Object edgeValue2184;
        java.lang.Object edgeValue2185;
        java.lang.Object edgeValue2199;
        java.lang.Object value2200;
        java.lang.Object edgeValue2214;
        java.lang.Object regionValue2228;
        java.lang.Object regionValue2229;
        java.lang.Object edgeValue2243;
        java.lang.Object edgeValue2244;
        java.lang.Object regionValue2258;
        java.lang.Object regionValue2259;
        java.lang.Object edgeValue2273;
        java.lang.Object edgeValue2274;
        boolean value2275;
        java.lang.Object regionValue2301;
        java.lang.Object edgeValue2315;
        java.lang.Object regionValue2329;
        java.lang.Object edgeValue2343;
        java.lang.Object value2344;
        java.lang.Object edgeValue2358;
        java.lang.Object value2360;
        java.lang.Object regionValue2375;
        java.lang.Object regionValue2377;
        java.lang.Object edgeValue2392;
        java.lang.Object regionValue2409;
        java.lang.Object edgeValue2426;
        java.lang.Object regionValue2443;
        java.lang.Object edgeValue2459;
        java.lang.Object regionValue2475;
        java.lang.Object edgeValue2491;
        java.lang.Object regionValue2507;
        java.lang.Object edgeValue2523;
        java.lang.Object value2526;
        java.lang.Object value2527;
        java.lang.Object edgeValue2541;
        java.lang.Object edgeValue2550;
        java.lang.Object regionValue2564;
        java.lang.Object regionValue2566;
        java.lang.Object edgeValue2580;
        java.lang.Object edgeValue2582;
        java.lang.Object regionValue2596;
        java.lang.Object edgeValue2611;
        java.lang.Object regionValue2626;
        java.lang.Object edgeValue2640;
        java.lang.Object edgeValue2654;
        java.lang.Object edgeValue2668;
        java.lang.Object value2671;
        java.lang.Object regionValue2685;
        java.lang.Object regionValue2686;
        java.lang.Object edgeValue2700;
        java.lang.Object regionValue2715;
        java.lang.Object edgeValue2731;
        java.lang.Object value2735;
        boolean value2736;
        java.lang.Object regionValue2750;
        int regionValue2752;
        java.lang.Object edgeValue2766;
        int edgeValue2768;
        java.lang.Object regionValue2782;
        java.lang.Object edgeValue2798;
        int edgeValue2800;
        java.lang.Object regionValue2814;
        java.lang.Object edgeValue2830;
        java.lang.Object regionValue2846;
        java.lang.Object edgeValue2861;
        java.lang.Object regionValue2876;
        java.lang.Object edgeValue2891;
        java.lang.Object regionValue2906;
        java.lang.Object edgeValue2921;
        java.lang.Object value2925;
        java.lang.Object edgeValue2939;
        java.lang.Object value2941;
        boolean value2942;
        java.lang.Object edgeValue2956;
        int edgeValue2958;
        java.lang.Object value2959;
        long value2960;
        java.lang.Object value2961;
        java.lang.Object value2962;
        java.lang.Object edgeValue2976;
        java.lang.Object edgeValue2991;
        java.lang.Object regionValue3017;
        java.lang.Object regionValue3018;
        java.lang.Object edgeValue3032;
        java.lang.Object edgeValue3033;
        java.lang.Object regionValue3047;
        java.lang.Object regionValue3048;
        java.lang.Object edgeValue3062;
        java.lang.Object edgeValue3063;
        java.lang.Object regionValue3077;
        java.lang.Object regionValue3078;
        java.lang.Object edgeValue3092;
        java.lang.Object edgeValue3093;
        boolean value3094;
        java.lang.Object regionValue3120;
        java.lang.Object edgeValue3134;
        java.lang.Object regionValue3148;
        java.lang.Object edgeValue3162;
        java.lang.Object value3163;
        java.lang.Object edgeValue3177;
        java.lang.Object edgeValue3178;
        java.lang.Object value3179;
        java.lang.Object value3180;
        java.lang.Object regionValue3194;
        java.lang.Object regionValue3195;
        java.lang.Object regionValue3196;
        java.lang.Object edgeValue3211;
        java.lang.Object edgeValue3212;
        java.lang.Object regionValue3228;
        java.lang.Object regionValue3229;
        java.lang.Object edgeValue3245;
        java.lang.Object edgeValue3246;
        java.lang.Object regionValue3262;
        java.lang.Object regionValue3263;
        java.lang.Object edgeValue3278;
        java.lang.Object edgeValue3279;
        java.lang.Object regionValue3294;
        java.lang.Object regionValue3295;
        java.lang.Object edgeValue3310;
        java.lang.Object edgeValue3311;
        java.lang.Object regionValue3326;
        java.lang.Object regionValue3327;
        java.lang.Object edgeValue3342;
        java.lang.Object edgeValue3343;
        java.lang.Object value3345;
        java.lang.Object value3346;
        java.lang.Object edgeValue3360;
        java.lang.Object edgeValue3361;
        java.lang.Object edgeValue3362;
        java.lang.Object edgeValue3369;
        java.lang.Object regionValue3383;
        java.lang.Object regionValue3384;
        java.lang.Object regionValue3385;
        java.lang.Object edgeValue3399;
        java.lang.Object edgeValue3400;
        java.lang.Object edgeValue3401;
        java.lang.Object regionValue3415;
        java.lang.Object regionValue3416;
        java.lang.Object edgeValue3430;
        java.lang.Object edgeValue3431;
        java.lang.Object regionValue3445;
        java.lang.Object edgeValue3459;
        java.lang.Object edgeValue3473;
        java.lang.Object edgeValue3487;
        java.lang.Object edgeValue3488;
        java.lang.Object value3490;
        java.lang.Object regionValue3504;
        java.lang.Object regionValue3505;
        java.lang.Object edgeValue3519;
        java.lang.Object edgeValue3520;
        java.lang.Object regionValue3534;
        java.lang.Object regionValue3535;
        java.lang.Object regionValue3536;
        java.lang.Object edgeValue3550;
        java.lang.Object edgeValue3551;
        java.lang.Object edgeValue3552;
        java.lang.Object value3553;
        java.lang.Object value3554;
        boolean value3555;
        java.lang.Object regionValue3569;
        java.lang.Object regionValue3570;
        int regionValue3571;
        java.lang.Object edgeValue3585;
        java.lang.Object edgeValue3586;
        int edgeValue3587;
        java.lang.Object regionValue3601;
        java.lang.Object regionValue3602;
        int regionValue3603;
        java.lang.Object edgeValue3617;
        java.lang.Object edgeValue3618;
        int edgeValue3619;
        java.lang.Object regionValue3633;
        java.lang.Object regionValue3634;
        int regionValue3635;
        java.lang.Object edgeValue3649;
        java.lang.Object edgeValue3650;
        int edgeValue3651;
        java.lang.Object regionValue3665;
        java.lang.Object regionValue3666;
        java.lang.Object edgeValue3680;
        java.lang.Object edgeValue3681;
        java.lang.Object regionValue3695;
        java.lang.Object regionValue3696;
        java.lang.Object edgeValue3710;
        java.lang.Object edgeValue3711;
        java.lang.Object regionValue3725;
        java.lang.Object regionValue3726;
        java.lang.Object edgeValue3740;
        java.lang.Object edgeValue3741;
        java.lang.Object value3744;
        java.lang.Object edgeValue3758;
        java.lang.Object edgeValue3759;
        java.lang.Object value3760;
        boolean value3761;
        java.lang.Object edgeValue3775;
        java.lang.Object edgeValue3776;
        int edgeValue3777;
        java.lang.Object value3778;
        long value3779;
        java.lang.Object value3780;
        java.lang.Object value3781;
        java.lang.Object edgeValue3795;
        java.lang.Object edgeValue3796;
        java.lang.Object edgeValue3810;
        java.lang.Object value3823;
        java.lang.Object value3825;
        boolean value3826;
        int edgeValue3839;
        int edgeValue3852;
        int regionValue3860;
        int edgeValue3867;
        int regionValue3880;
        int edgeValue3893;
        java.lang.Object value3930;
        boolean value3931;
        int regionValue3938;
        int edgeValue3946;
        int edgeValue3974;
        java.lang.Object value4093;
        java.lang.Object value4095;
        java.lang.Object value4096;
        java.lang.Object value4097;
        java.lang.Object value4098;
        boolean value4126;
        java.lang.Object value4175;
        java.lang.Object value4176;
        java.lang.Object value4177;
        java.lang.Object edgeValue4183;
        java.lang.Object regionValue4197;
        java.lang.Object regionValue4198;
        java.lang.Object edgeValue4212;
        java.lang.Object edgeValue4213;
        java.lang.Object regionValue4227;
        java.lang.Object regionValue4228;
        java.lang.Object edgeValue4243;
        java.lang.Object edgeValue4244;
        java.lang.Object regionValue4259;
        java.lang.Object regionValue4260;
        java.lang.Object edgeValue4275;
        java.lang.Object edgeValue4276;
        java.lang.Object regionValue4291;
        java.lang.Object regionValue4292;
        java.lang.Object edgeValue4307;
        java.lang.Object edgeValue4308;
        java.lang.Object edgeValue4315;
        java.lang.Object regionValue4329;
        java.lang.Object regionValue4330;
        java.lang.Object edgeValue4344;
        java.lang.Object edgeValue4345;
        java.lang.Object regionValue4359;
        java.lang.Object regionValue4360;
        java.lang.Object edgeValue4374;
        java.lang.Object edgeValue4375;
        java.lang.Object edgeValue4389;
        java.lang.Object edgeValue4390;
        java.lang.Object regionValue4405;
        java.lang.Object regionValue4406;
        java.lang.Object edgeValue4420;
        java.lang.Object edgeValue4421;
        java.lang.Object regionValue4435;
        java.lang.Object regionValue4436;
        java.lang.Object edgeValue4450;
        java.lang.Object edgeValue4451;
        java.lang.Object regionValue4478;
        java.lang.Object edgeValue4492;
        java.lang.Object edgeValue4506;
        java.lang.Object edgeValue4507;
        java.lang.Object value4508;
        java.lang.Object regionValue4522;
        java.lang.Object edgeValue4536;
        java.lang.Object value4576;
        java.lang.Object value4577;
        char converted4578;
        short converted4579;
        int value4581;
        int value4582;
        java.lang.Object value4583;
        java.lang.Object value4585;
        java.lang.Object value4586;
        java.lang.Object value4611;
        java.lang.Object value4613;
        java.lang.Object value4614;
        java.lang.Object value4615;
        java.lang.Object value4616;
        boolean value4642;
        java.lang.Object value4673;
        java.lang.Object value4674;
        java.lang.Object value4675;
        java.lang.Object regionValue4694;
        java.lang.Object edgeValue4708;
        java.lang.Object regionValue4748;
        java.lang.Object edgeValue4762;
        java.lang.Object regionValue4776;
        java.lang.Object edgeValue4790;
        java.lang.Object regionValue4828;
        java.lang.Object edgeValue4841;
        java.lang.Object regionValue4854;
        java.lang.Object edgeValue4867;
        boolean value4868;
        int edgeValue4875;
        java.lang.Object regionValue4888;
        int regionValue4889;
        java.lang.Object edgeValue4902;
        int edgeValue4903;
        java.lang.Object regionValue4916;
        int regionValue4917;
        java.lang.Object edgeValue4930;
        int edgeValue4931;
        java.lang.Object regionValue4944;
        java.lang.Object edgeValue4957;
        java.lang.Object value5018;
        java.lang.Object value5019;
        java.lang.Object value5020;
        char converted5021;
        short converted5022;
        int value5024;
        int value5025;
        java.lang.Object value5026;
        java.lang.Object value5028;
        java.lang.Object value5029;
        java.lang.Object value5073;
        java.lang.Object value5075;
        boolean value5076;
        int edgeValue5083;
        int edgeValue5090;
        int regionValue5098;
        int edgeValue5105;
        int regionValue5112;
        int edgeValue5119;
        java.lang.Object value5180;
        boolean value5181;
        int edgeValue5188;
        java.lang.Object value5206;
        java.lang.Object value5304;
        boolean value5305;
        java.lang.Object value5326;
        java.lang.Object value5327;
        java.lang.Object value5334;
        java.lang.Object value5336;
        java.lang.Object value5337;
        java.lang.Object value5338;
        short converted5349;
        int value5350;
        java.lang.Object value5354;
        region629: {
        region628: {
        region617: {
        region611: {
        region609: {
        region606: {
        region604: {
        region601: {
        region599: {
        region598: {
        region596: {
        region592: {
        region591: {
        region587: {
        region585: {
        region582: {
        region581: {
        region580: {
        region579: {
        region570: {
        region514: {
        region502: {
        region448: {
        region436: {
        region435: {
        region433: {
        region432: {
        region430: {
        region424: {
        region423: {
        region422: {
        region421: {
        region412: {
        region336: {
        region832: {
        region824: {
        region819: {
        region805: {
        region803: {
        region801: {
        region799: {
        region788: {
        region784: {
        region782: {
        region780: {
        region778: {
        region776: {
        region770: {
        region768: {
        region766: {
        region759: {
        region755: {
        region753: {
        region750: {
        region747: {
        region335: {
        region310: {
        region309: {
        region254: {
        region253: {
        region243: {
        region212: {
        region167: {
        region166: {
        region164: {
        region163: {
        region161: {
        region148: {
        region146: {
        region145: {
        region143: {
        region115: {
        region113: {
        region112: {
        converted12 = (long) (a0);
        computed13 = converted12 << 32;
        converted14 = (long) (a1);
        computed15 = converted14 << 48;
        computed16 = computed15 >>> 32;
        computed17 = computed13 | computed16;
        converted18 = (long) (a2);
        computed19 = converted18 << 48;
        computed20 = computed19 >>> 48;
        computed21 = computed17 | computed20;
        computed23 = computed21 ^ 64634383526386L;
        computed24 = computed23 >>> 32;
        converted25 = (int) (computed24);
        computed27 = computed23 << 32;
        computed28 = computed27 >>> 48;
        converted29 = (int) (computed28);
        computed31 = computed23 << 48;
        computed32 = computed31 >>> 48;
        converted33 = (int) (computed32);
        computed35 = computed21 ^ 8148684876379L;
        computed37 = computed21 ^ 540474446000L;
        computed39 = computed21 ^ 97834970749362L;
        computed41 = computed21 ^ 85754557300090L;
        computed43 = computed21 ^ 100525380145379L;
        computed44 = computed43 >>> 48;
        converted45 = (int) (computed44);
        computed47 = computed43 << 16;
        computed48 = computed47 >>> 48;
        converted49 = (int) (computed48);
        computed51 = computed43 << 32;
        computed52 = computed51 >>> 32;
        converted53 = (int) (computed52);
        value55 = recovery$indy$flow$807();
        value59 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this))))));
        recovery$indy$flow$809(value59, computed37);
        value60 = recovery$indy$flow$810();
        value62 = ((java.lang.Object)(((net.C_47x5) (((java.lang.Object)(value60))))));
        value63 = recovery$indy$flow$812(value62);
        if (value55 != null) {
            edgeValue89 = (int) ((value63 ? 1 : 0));
            regionValue76 = edgeValue89;
            break region421;
        } else {
            edgeValue121 = (int) ((value63 ? 1 : 0));
            break region112;
        }
        }
        if (edgeValue121 == 0) {
            break region412;
        } else {
            break region113;
        }
        }
        break region115;
        }
        value206 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_45A));
        value207 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingCheckDelay));
        value209 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value207))))));
        value210 = recovery$indy$flow$816(value209);
        converted211 = (long) (value210);
        value215 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value206))))));
        value216 = recovery$indy$flow$818(value215, converted211, computed39);
        if (value55 != null) {
            edgeValue229 = (int) ((value216 ? 1 : 0));
            regionValue76 = edgeValue229;
            break region421;
        } else {
            edgeValue259 = (int) ((value216 ? 1 : 0));
            break region143;
        }
        }
        break region145;
        }
        if (edgeValue259 == 0) {
            break region412;
        } else {
            break region146;
        }
        }
        break region148;
        }
        value358 = recovery$indy$flow$819();
        value360 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value358))))));
        value361 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value360)))).field_44m));
        value362 = recovery$indy$flow$822(value361);
        if (a1 < 0) {
            edgeValue389 = (int) ((value362 ? 1 : 0));
            regionValue375 = edgeValue389;
            break region422;
        } else {
            edgeValue421 = (int) ((value362 ? 1 : 0));
            break region161;
        }
        }
        break region163;
        }
        if (value55 != null) {
            regionValue76 = edgeValue421;
            break region421;
        } else {
            break region164;
        }
        }
        break region166;
        }
        if (edgeValue421 != 0) {
            break region412;
        } else {
            break region167;
        }
        }
        value568 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingCheckDelay));
        value570 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(value568))))));
        value571 = recovery$indy$flow$825(value570);
        value572 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_45A));
        value574 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value572))))));
        recovery$indy$flow$828(value574);
        value577 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this))))));
        recovery$indy$flow$830(value577, computed35);
        value578 = recovery$indy$flow$831();
        value580 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value578))))));
        value581 = recovery$indy$flow$833(value580);
        value582 = recovery$indy$flow$834(value581);
        value583 = recovery$indy$flow$835(value582);
        break region212;
        }
        loop212: while (true) {
        region242: {
        region241: {
        region239: {
        region238: {
        region215: {
        value613 = recovery$indy$flow$836(value583);
        if ((int) ((value613 ? 1 : 0)) == 0) {
            break region243;
        } else {
            break region215;
        }
        }
        value668 = recovery$indy$flow$837(value583);
        value669 = ((java.lang.Object)(((net.C_47Yl) (((java.lang.Object)(value668))))));
        value670 = value669;
        value671 = recovery$indy$flow$839(value670);
        value672 = recovery$indy$flow$840(value671);
        value673 = value672;
        value674 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_46));
        value675 = recovery$indy$flow$842(value674, value673);
        value676 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_46));
        value677 = recovery$indy$flow$844();
        value678 = recovery$indy$flow$845(value677);
        value679 = recovery$indy$flow$846(value676, value673, value678);
        if (a1 < 0) {
            break region242;
        } else {
            break region238;
        }
        }
        if (value55 != null) {
            break region412;
        } else {
            break region239;
        }
        }
        break region241;
        }
        break region242;
        }
        if (value55 == null) {
            continue loop212;
        } else {
            break region243;
        }
        }
        }
        initialized850 = new java.util.LinkedList();
        value852 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_46));
        value853 = recovery$indy$flow$850(value852);
        value854 = recovery$indy$flow$851(value853);
        if (a0 <= 0) {
            regionValue860 = value854;
            break region617;
        } else {
            break region253;
        }
        }
        break region254;
        }
        loop254: while (true) {
        region259: {
        region1088: {
        region257: {
        value928 = recovery$indy$flow$852(value854);
        if ((int) ((value928 ? 1 : 0)) == 0) {
            break region1088;
        } else {
            break region257;
        }
        }
        value989 = recovery$indy$flow$853(value854);
        edgeValue1021 = value989;
        regionValue1005 = edgeValue1021;
        break region259;
        }
        value1022 = recovery$indy$flow$863(initialized850);
        if (a1 < 0) {
            edgeValue1038 = value1022;
            regionValue1005 = edgeValue1038;
            break region259;
        } else {
            edgeValue1066 = value1022;
            regionValue1052 = edgeValue1066;
            break region309;
        }
        }
        loop259: while (true) {
        region305: {
        region303: {
        region302: {
        region297: {
        region296: {
        region295: {
        region294: {
        region288: {
        region287: {
        region285: {
        region284: {
        region276: {
        region275: {
        region274: {
        region273: {
        region272: {
        region271: {
        value1067 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(regionValue1005))))));
        value1068 = value1067;
        value1069 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_46));
        value1070 = recovery$indy$flow$856(value1069, value1068);
        value1071 = ((java.lang.Object)(((java.lang.Long) (((java.lang.Object)(value1070))))));
        value1072 = value1071;
        if (a0 < 0) {
            edgeValue1107 = value1068;
            edgeValue1108 = value1072;
            edgeValue1109 = value1072;
            regionValue1088 = edgeValue1107;
            regionValue1089 = edgeValue1108;
            regionValue1090 = edgeValue1109;
            break region273;
        } else {
            edgeValue1145 = value1068;
            edgeValue1146 = value1072;
            edgeValue1147 = value1072;
            regionValue1126 = edgeValue1145;
            regionValue1127 = edgeValue1146;
            regionValue1128 = edgeValue1147;
            break region271;
        }
        }
        if (value55 != null) {
            edgeValue1154 = regionValue1128;
            regionValue860 = edgeValue1154;
            break region617;
        } else {
            edgeValue1188 = regionValue1126;
            edgeValue1189 = regionValue1127;
            edgeValue1190 = regionValue1128;
            regionValue1170 = edgeValue1188;
            regionValue1171 = edgeValue1189;
            regionValue1172 = edgeValue1190;
            break region272;
        }
        }
        edgeValue1206 = regionValue1170;
        edgeValue1207 = regionValue1171;
        edgeValue1208 = regionValue1172;
        regionValue1088 = edgeValue1206;
        regionValue1089 = edgeValue1207;
        regionValue1090 = edgeValue1208;
        break region273;
        }
        if (value55 != null) {
            edgeValue1242 = regionValue1088;
            edgeValue1243 = regionValue1090;
            regionValue1225 = edgeValue1242;
            regionValue1226 = edgeValue1243;
            break region276;
        } else {
            edgeValue1277 = regionValue1088;
            edgeValue1278 = regionValue1089;
            edgeValue1279 = regionValue1090;
            regionValue1259 = edgeValue1277;
            regionValue1260 = edgeValue1278;
            regionValue1261 = edgeValue1279;
            break region274;
        }
        }
        if (regionValue1261 == null) {
            edgeValue1311 = regionValue1259;
            regionValue1295 = edgeValue1311;
            break region297;
        } else {
            edgeValue1344 = regionValue1259;
            edgeValue1345 = regionValue1260;
            regionValue1327 = edgeValue1344;
            regionValue1328 = edgeValue1345;
            break region275;
        }
        }
        edgeValue1361 = regionValue1327;
        edgeValue1362 = regionValue1328;
        regionValue1225 = edgeValue1361;
        regionValue1226 = edgeValue1362;
        break region276;
        }
        value1363 = recovery$indy$flow$858(regionValue1226);
        computed1364 = value1363 + 15000L;
        value1365 = recovery$indy$flow$859();
        comparison1366 = (computed1364 > value1365 ? 1 : computed1364 == value1365 ? 0 : -1);
        if (a2 <= 0) {
            edgeValue1400 = regionValue1225;
            edgeValue1401 = comparison1366;
            regionValue1382 = edgeValue1400;
            regionValue1383 = edgeValue1401;
            break region295;
        } else {
            edgeValue1436 = regionValue1225;
            edgeValue1437 = comparison1366;
            regionValue1418 = edgeValue1436;
            regionValue1419 = edgeValue1437;
            break region284;
        }
        }
        if (value55 != null) {
            edgeValue1471 = regionValue1418;
            edgeValue1472 = regionValue1419;
            regionValue1454 = edgeValue1471;
            regionValue1455 = edgeValue1472;
            break region294;
        } else {
            edgeValue1505 = regionValue1418;
            edgeValue1506 = regionValue1419;
            regionValue1488 = edgeValue1505;
            regionValue1489 = edgeValue1506;
            break region285;
        }
        }
        edgeValue1539 = regionValue1488;
        edgeValue1540 = regionValue1489;
        regionValue1522 = edgeValue1539;
        regionValue1523 = edgeValue1540;
        break region287;
        }
        if (regionValue1523 >= 0) {
            break region303;
        } else {
            edgeValue1602 = regionValue1522;
            regionValue1586 = edgeValue1602;
            break region288;
        }
        }
        value1603 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_43h));
        value1604 = recovery$indy$flow$861(value1603, regionValue1586);
        edgeValue1620 = regionValue1586;
        edgeValue1621 = (int) ((value1604 ? 1 : 0));
        regionValue1454 = edgeValue1620;
        regionValue1455 = edgeValue1621;
        break region294;
        }
        edgeValue1637 = regionValue1454;
        edgeValue1638 = regionValue1455;
        regionValue1382 = edgeValue1637;
        regionValue1383 = edgeValue1638;
        break region295;
        }
        if (value55 != null) {
            edgeValue1671 = regionValue1383;
            regionValue1655 = edgeValue1671;
            break region302;
        } else {
            edgeValue1704 = regionValue1382;
            edgeValue1705 = regionValue1383;
            regionValue1687 = edgeValue1704;
            regionValue1688 = edgeValue1705;
            break region296;
        }
        }
        if (regionValue1688 != 0) {
            break region303;
        } else {
            edgeValue1736 = regionValue1687;
            regionValue1295 = edgeValue1736;
            break region297;
        }
        }
        value1737 = recovery$indy$flow$862(initialized850, regionValue1295);
        edgeValue1753 = (int) ((value1737 ? 1 : 0));
        regionValue1655 = edgeValue1753;
        break region302;
        }
        break region303;
        }
        if (value55 == null) {
            continue loop254;
        } else {
            break region305;
        }
        }
        value1814 = recovery$indy$flow$863(initialized850);
        if (a1 < 0) {
            edgeValue1830 = value1814;
            regionValue1005 = edgeValue1830;
            continue loop259;
        } else {
            edgeValue1844 = value1814;
            regionValue1052 = edgeValue1844;
            break region309;
        }
        }
        }
        }
        value1845 = regionValue1052;
        edgeValue1873 = value1845;
        regionValue1859 = edgeValue1873;
        break region310;
        }
        loop310: while (true) {
        region319: {
        region937: {
        region316: {
        region313: {
        value1874 = recovery$indy$flow$864(regionValue1859);
        if ((int) ((value1874 ? 1 : 0)) == 0) {
            edgeValue1902 = regionValue1859;
            regionValue1888 = edgeValue1902;
            break region937;
        } else {
            edgeValue1930 = regionValue1859;
            regionValue1916 = edgeValue1930;
            break region313;
        }
        }
        if (a1 <= 0) {
            edgeValue1959 = regionValue1916;
            edgeValue1960 = regionValue1916;
            regionValue1944 = edgeValue1959;
            regionValue1945 = edgeValue1960;
            break region747;
        } else {
            edgeValue1989 = regionValue1916;
            edgeValue1990 = regionValue1916;
            regionValue1974 = edgeValue1989;
            regionValue1975 = edgeValue1990;
            break region316;
        }
        }
        value1991 = recovery$indy$flow$865(regionValue1975);
        edgeValue2020 = regionValue1974;
        edgeValue2021 = value1991;
        regionValue2005 = edgeValue2020;
        regionValue2006 = edgeValue2021;
        break region319;
        }
        value2022 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_43h));
        value2023 = recovery$indy$flow$870(value2022);
        if (a0 <= 0) {
            edgeValue2037 = regionValue1888;
            edgeValue2038 = value2023;
            regionValue2005 = edgeValue2037;
            regionValue2006 = edgeValue2038;
            break region319;
        } else {
            edgeValue2066 = value2023;
            regionValue2052 = edgeValue2066;
            break region335;
        }
        }
        loop319: while (true) {
        region330: {
        region328: {
        value2067 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(regionValue2006))))));
        value2068 = value2067;
        value2069 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_46));
        value2070 = recovery$indy$flow$868(value2069, value2068);
        if (value55 != null) {
            edgeValue2098 = regionValue2005;
            regionValue2084 = edgeValue2098;
            break region336;
        } else {
            edgeValue2126 = regionValue2005;
            regionValue2112 = edgeValue2126;
            break region328;
        }
        }
        if (value55 == null) {
            edgeValue2140 = regionValue2112;
            regionValue1859 = edgeValue2140;
            continue loop310;
        } else {
            edgeValue2168 = regionValue2112;
            regionValue2154 = edgeValue2168;
            break region330;
        }
        }
        value2169 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_43h));
        value2170 = recovery$indy$flow$870(value2169);
        if (a0 <= 0) {
            edgeValue2184 = regionValue2154;
            edgeValue2185 = value2170;
            regionValue2005 = edgeValue2184;
            regionValue2006 = edgeValue2185;
            continue loop319;
        } else {
            edgeValue2199 = value2170;
            regionValue2052 = edgeValue2199;
            break region335;
        }
        }
        }
        }
        value2200 = regionValue2052;
        edgeValue2214 = value2200;
        regionValue2084 = edgeValue2214;
        break region336;
        }
        if (a0 < 0) {
            edgeValue2243 = regionValue1944;
            edgeValue2244 = regionValue1945;
            regionValue2228 = edgeValue2243;
            regionValue2229 = edgeValue2244;
            break region759;
        } else {
            edgeValue2273 = regionValue1944;
            edgeValue2274 = regionValue1945;
            regionValue2258 = edgeValue2273;
            regionValue2259 = edgeValue2274;
            break region750;
        }
        }
        value2275 = recovery$indy$flow$871(regionValue2259);
        if ((int) ((value2275 ? 1 : 0)) == 0) {
            break region412;
        } else {
            edgeValue2315 = regionValue2258;
            regionValue2301 = edgeValue2315;
            break region753;
        }
        }
        edgeValue2343 = regionValue2301;
        regionValue2329 = edgeValue2343;
        break region755;
        }
        value2344 = recovery$indy$flow$872(regionValue2329);
        edgeValue2358 = regionValue2329;
        regionValue2228 = edgeValue2358;
        regionValue2229 = value2344;
        break region759;
        }
        value2360 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(regionValue2229))))));
        if (a1 <= 0) {
            edgeValue2392 = regionValue2228;
            regionValue2375 = edgeValue2392;
            regionValue2377 = this;
            break region776;
        } else {
            edgeValue2426 = regionValue2228;
            regionValue2409 = edgeValue2426;
            break region766;
        }
        }
        if (value55 != null) {
            edgeValue2459 = regionValue2409;
            regionValue2443 = edgeValue2459;
            break region784;
        } else {
            edgeValue2491 = regionValue2409;
            regionValue2475 = edgeValue2491;
            break region768;
        }
        }
        edgeValue2523 = regionValue2475;
        regionValue2507 = edgeValue2523;
        break region770;
        }
        value2526 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_46));
        value2527 = recovery$indy$flow$875(value2526, value2360);
        edgeValue2541 = regionValue2507;
        regionValue2375 = edgeValue2541;
        regionValue2377 = value2527;
        break region776;
        }
        if (value55 != null) {
            edgeValue2550 = regionValue2377;
            regionValue860 = edgeValue2550;
            break region617;
        } else {
            edgeValue2580 = regionValue2375;
            edgeValue2582 = regionValue2377;
            regionValue2564 = edgeValue2580;
            regionValue2566 = edgeValue2582;
            break region778;
        }
        }
        if (regionValue2566 == null) {
            edgeValue2611 = regionValue2564;
            regionValue2596 = edgeValue2611;
            break region782;
        } else {
            edgeValue2640 = regionValue2564;
            regionValue2626 = edgeValue2640;
            break region780;
        }
        }
        edgeValue2654 = regionValue2626;
        regionValue2084 = edgeValue2654;
        break region336;
        }
        edgeValue2668 = regionValue2596;
        regionValue2443 = edgeValue2668;
        break region784;
        }
        value2671 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingAcousticWarningGomme));
        if (a0 < 0) {
            edgeValue2700 = regionValue2443;
            regionValue2685 = edgeValue2700;
            regionValue2686 = value2671;
            break region832;
        } else {
            edgeValue2731 = regionValue2443;
            regionValue2715 = edgeValue2731;
            break region788;
        }
        }
        value2735 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value2671))))));
        value2736 = recovery$indy$flow$878(value2735);
        if (value55 != null) {
            edgeValue2766 = regionValue2715;
            edgeValue2768 = (int) ((value2736 ? 1 : 0));
            regionValue2750 = edgeValue2766;
            regionValue2752 = edgeValue2768;
            break region824;
        } else {
            edgeValue2798 = regionValue2715;
            edgeValue2800 = (int) ((value2736 ? 1 : 0));
            regionValue2782 = edgeValue2798;
            break region799;
        }
        }
        edgeValue2830 = regionValue2782;
        regionValue2814 = edgeValue2830;
        break region801;
        }
        if (edgeValue2800 == 0) {
            edgeValue2861 = regionValue2814;
            regionValue2846 = edgeValue2861;
            break region819;
        } else {
            edgeValue2891 = regionValue2814;
            regionValue2876 = edgeValue2891;
            break region803;
        }
        }
        edgeValue2921 = regionValue2876;
        regionValue2906 = edgeValue2921;
        break region805;
        }
        value2925 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this))))));
        recovery$indy$flow$880(value2925, computed41);
        edgeValue2939 = regionValue2906;
        regionValue2846 = edgeValue2939;
        break region819;
        }
        value2941 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_45y));
        value2942 = recovery$indy$flow$882(value2941, value2360);
        edgeValue2956 = regionValue2846;
        edgeValue2958 = (int) ((value2942 ? 1 : 0));
        regionValue2750 = edgeValue2956;
        regionValue2752 = edgeValue2958;
        break region824;
        }
        value2959 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_46));
        value2960 = recovery$indy$flow$884();
        value2961 = recovery$indy$flow$885(value2960);
        value2962 = recovery$indy$flow$886(value2959, value2360, value2961);
        edgeValue2976 = regionValue2750;
        regionValue2685 = edgeValue2976;
        regionValue2686 = value2962;
        break region832;
        }
        if (value55 == null) {
            edgeValue2991 = regionValue2685;
            regionValue2084 = edgeValue2991;
            break region336;
        } else {
            break region412;
        }
        }
        loop336: while (true) {
        region409: {
        region402: {
        region398: {
        region384: {
        region382: {
        region381: {
        region379: {
        region369: {
        region366: {
        region365: {
        region364: {
        region363: {
        region362: {
        region356: {
        region354: {
        region353: {
        region347: {
        region343: {
        region341: {
        region339: {
        region337: {
        edgeValue3032 = regionValue2084;
        edgeValue3033 = regionValue2084;
        regionValue3017 = edgeValue3032;
        regionValue3018 = edgeValue3033;
        break region337;
        }
        if (a0 < 0) {
            edgeValue3062 = regionValue3017;
            edgeValue3063 = regionValue3018;
            regionValue3047 = edgeValue3062;
            regionValue3048 = edgeValue3063;
            break region347;
        } else {
            edgeValue3092 = regionValue3017;
            edgeValue3093 = regionValue3018;
            regionValue3077 = edgeValue3092;
            regionValue3078 = edgeValue3093;
            break region339;
        }
        }
        value3094 = recovery$indy$flow$871(regionValue3078);
        if ((int) ((value3094 ? 1 : 0)) == 0) {
            break region412;
        } else {
            edgeValue3134 = regionValue3077;
            regionValue3120 = edgeValue3134;
            break region341;
        }
        }
        edgeValue3162 = regionValue3120;
        regionValue3148 = edgeValue3162;
        break region343;
        }
        value3163 = recovery$indy$flow$872(regionValue3148);
        edgeValue3177 = regionValue3148;
        edgeValue3178 = value3163;
        regionValue3047 = edgeValue3177;
        regionValue3048 = edgeValue3178;
        break region347;
        }
        value3179 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(regionValue3048))))));
        value3180 = value3179;
        if (a1 <= 0) {
            edgeValue3211 = regionValue3047;
            edgeValue3212 = value3180;
            regionValue3194 = edgeValue3211;
            regionValue3195 = edgeValue3212;
            regionValue3196 = this;
            break region362;
        } else {
            edgeValue3245 = regionValue3047;
            edgeValue3246 = value3180;
            regionValue3228 = edgeValue3245;
            regionValue3229 = edgeValue3246;
            break region353;
        }
        }
        if (value55 != null) {
            edgeValue3278 = regionValue3228;
            edgeValue3279 = regionValue3229;
            regionValue3262 = edgeValue3278;
            regionValue3263 = edgeValue3279;
            break region366;
        } else {
            edgeValue3310 = regionValue3228;
            edgeValue3311 = regionValue3229;
            regionValue3294 = edgeValue3310;
            regionValue3295 = edgeValue3311;
            break region354;
        }
        }
        edgeValue3342 = regionValue3294;
        edgeValue3343 = regionValue3295;
        regionValue3326 = edgeValue3342;
        regionValue3327 = edgeValue3343;
        break region356;
        }
        value3345 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_46));
        value3346 = recovery$indy$flow$875(value3345, regionValue3327);
        edgeValue3360 = regionValue3326;
        edgeValue3361 = regionValue3327;
        edgeValue3362 = value3346;
        regionValue3194 = edgeValue3360;
        regionValue3195 = edgeValue3361;
        regionValue3196 = edgeValue3362;
        break region362;
        }
        if (value55 != null) {
            edgeValue3369 = regionValue3196;
            regionValue860 = edgeValue3369;
            break region617;
        } else {
            edgeValue3399 = regionValue3194;
            edgeValue3400 = regionValue3195;
            edgeValue3401 = regionValue3196;
            regionValue3383 = edgeValue3399;
            regionValue3384 = edgeValue3400;
            regionValue3385 = edgeValue3401;
            break region363;
        }
        }
        if (regionValue3385 == null) {
            edgeValue3430 = regionValue3383;
            edgeValue3431 = regionValue3384;
            regionValue3415 = edgeValue3430;
            regionValue3416 = edgeValue3431;
            break region365;
        } else {
            edgeValue3459 = regionValue3383;
            regionValue3445 = edgeValue3459;
            break region364;
        }
        }
        edgeValue3473 = regionValue3445;
        regionValue2084 = edgeValue3473;
        continue loop336;
        }
        edgeValue3487 = regionValue3415;
        edgeValue3488 = regionValue3416;
        regionValue3262 = edgeValue3487;
        regionValue3263 = edgeValue3488;
        break region366;
        }
        value3490 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingAcousticWarningGomme));
        if (a0 < 0) {
            edgeValue3519 = regionValue3262;
            edgeValue3520 = value3490;
            regionValue3504 = edgeValue3519;
            regionValue3505 = edgeValue3520;
            break region409;
        } else {
            edgeValue3550 = regionValue3262;
            edgeValue3551 = regionValue3263;
            edgeValue3552 = value3490;
            regionValue3534 = edgeValue3550;
            regionValue3535 = edgeValue3551;
            regionValue3536 = edgeValue3552;
            break region369;
        }
        }
        value3553 = regionValue3536;
        value3554 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value3553))))));
        value3555 = recovery$indy$flow$878(value3554);
        if (value55 != null) {
            edgeValue3585 = regionValue3534;
            edgeValue3586 = regionValue3535;
            edgeValue3587 = (int) ((value3555 ? 1 : 0));
            regionValue3569 = edgeValue3585;
            regionValue3570 = edgeValue3586;
            regionValue3571 = edgeValue3587;
            break region402;
        } else {
            edgeValue3617 = regionValue3534;
            edgeValue3618 = regionValue3535;
            edgeValue3619 = (int) ((value3555 ? 1 : 0));
            regionValue3601 = edgeValue3617;
            regionValue3602 = edgeValue3618;
            regionValue3603 = edgeValue3619;
            break region379;
        }
        }
        edgeValue3649 = regionValue3601;
        edgeValue3650 = regionValue3602;
        edgeValue3651 = regionValue3603;
        regionValue3633 = edgeValue3649;
        regionValue3634 = edgeValue3650;
        regionValue3635 = edgeValue3651;
        break region381;
        }
        if (regionValue3635 == 0) {
            edgeValue3680 = regionValue3633;
            edgeValue3681 = regionValue3634;
            regionValue3665 = edgeValue3680;
            regionValue3666 = edgeValue3681;
            break region398;
        } else {
            edgeValue3710 = regionValue3633;
            edgeValue3711 = regionValue3634;
            regionValue3695 = edgeValue3710;
            regionValue3696 = edgeValue3711;
            break region382;
        }
        }
        edgeValue3740 = regionValue3695;
        edgeValue3741 = regionValue3696;
        regionValue3725 = edgeValue3740;
        regionValue3726 = edgeValue3741;
        break region384;
        }
        value3744 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this))))));
        recovery$indy$flow$880(value3744, computed41);
        edgeValue3758 = regionValue3725;
        edgeValue3759 = regionValue3726;
        regionValue3665 = edgeValue3758;
        regionValue3666 = edgeValue3759;
        break region398;
        }
        value3760 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_45y));
        value3761 = recovery$indy$flow$882(value3760, regionValue3666);
        edgeValue3775 = regionValue3665;
        edgeValue3776 = regionValue3666;
        edgeValue3777 = (int) ((value3761 ? 1 : 0));
        regionValue3569 = edgeValue3775;
        regionValue3570 = edgeValue3776;
        regionValue3571 = edgeValue3777;
        break region402;
        }
        value3778 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_46));
        value3779 = recovery$indy$flow$884();
        value3780 = recovery$indy$flow$885(value3779);
        value3781 = recovery$indy$flow$886(value3778, regionValue3570, value3780);
        edgeValue3795 = regionValue3569;
        edgeValue3796 = value3781;
        regionValue3504 = edgeValue3795;
        regionValue3505 = edgeValue3796;
        break region409;
        }
        if (value55 == null) {
            edgeValue3810 = regionValue3504;
            regionValue2084 = edgeValue3810;
            continue loop336;
        } else {
            break region412;
        }
        }
        }
        value3823 = recovery$indy$flow$887();
        value3825 = ((java.lang.Object)(((net.C_47x5) (((java.lang.Object)(value3823))))));
        value3826 = recovery$indy$flow$889(value3825);
        edgeValue3839 = (int) ((value3826 ? 1 : 0));
        regionValue76 = edgeValue3839;
        break region421;
        }
        edgeValue3852 = regionValue76;
        regionValue375 = edgeValue3852;
        break region422;
        }
        if (value55 != null) {
            edgeValue3867 = regionValue375;
            regionValue3860 = edgeValue3867;
            break region579;
        } else {
            edgeValue3893 = regionValue375;
            regionValue3880 = edgeValue3893;
            break region423;
        }
        }
        if (regionValue3880 == 0) {
            break region570;
        } else {
            break region424;
        }
        }
        value3930 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_45L));
        value3931 = recovery$indy$flow$891(value3930);
        if (a0 < 0) {
            edgeValue3946 = (int) ((value3931 ? 1 : 0));
            regionValue3938 = edgeValue3946;
            break region580;
        } else {
            edgeValue3974 = (int) ((value3931 ? 1 : 0));
            break region430;
        }
        }
        break region432;
        }
        if (value55 != null) {
            regionValue3860 = edgeValue3974;
            break region579;
        } else {
            break region433;
        }
        }
        break region435;
        }
        if (edgeValue3974 != 0) {
            break region570;
        } else {
            break region436;
        }
        }
        value4093 = recovery$indy$flow$892();
        value4095 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4093))))));
        value4096 = recovery$indy$flow$894(value4095);
        value4097 = recovery$indy$flow$895(value4096);
        value4098 = recovery$indy$flow$896(value4097);
        break region448;
        }
        loop448: while (true) {
        region474: {
        region472: {
        region470: {
        region469: {
        region468: {
        region467: {
        region466: {
        region464: {
        region463: {
        region461: {
        region458: {
        region451: {
        value4126 = recovery$indy$flow$897(value4098);
        if ((int) ((value4126 ? 1 : 0)) == 0) {
            break region502;
        } else {
            break region451;
        }
        }
        value4175 = recovery$indy$flow$898(value4098);
        value4176 = ((java.lang.Object)(((net.C_47Yl) (((java.lang.Object)(value4175))))));
        value4177 = value4176;
        if (a2 <= 0) {
            edgeValue4183 = value4177;
            regionValue860 = edgeValue4183;
            break region617;
        } else {
            edgeValue4212 = value4177;
            edgeValue4213 = value4177;
            regionValue4197 = edgeValue4212;
            regionValue4198 = edgeValue4213;
            break region458;
        }
        }
        if (a0 < 0) {
            edgeValue4243 = regionValue4197;
            edgeValue4244 = regionValue4198;
            regionValue4227 = edgeValue4243;
            regionValue4228 = edgeValue4244;
            break region467;
        } else {
            edgeValue4275 = regionValue4197;
            edgeValue4276 = regionValue4198;
            regionValue4259 = edgeValue4275;
            regionValue4260 = edgeValue4276;
            break region461;
        }
        }
        edgeValue4307 = regionValue4259;
        edgeValue4308 = regionValue4260;
        regionValue4291 = edgeValue4307;
        regionValue4292 = edgeValue4308;
        break region463;
        }
        if (value55 != null) {
            edgeValue4315 = regionValue4292;
            regionValue860 = edgeValue4315;
            break region617;
        } else {
            edgeValue4344 = regionValue4291;
            edgeValue4345 = regionValue4292;
            regionValue4329 = edgeValue4344;
            regionValue4330 = edgeValue4345;
            break region464;
        }
        }
        edgeValue4374 = regionValue4329;
        edgeValue4375 = regionValue4330;
        regionValue4359 = edgeValue4374;
        regionValue4360 = edgeValue4375;
        break region466;
        }
        edgeValue4389 = regionValue4359;
        edgeValue4390 = regionValue4360;
        regionValue4227 = edgeValue4389;
        regionValue4228 = edgeValue4390;
        break region467;
        }
        if (value55 != null) {
            edgeValue4420 = regionValue4227;
            edgeValue4421 = regionValue4228;
            regionValue4405 = edgeValue4420;
            regionValue4406 = edgeValue4421;
            break region470;
        } else {
            edgeValue4450 = regionValue4227;
            edgeValue4451 = regionValue4228;
            regionValue4435 = edgeValue4450;
            regionValue4436 = edgeValue4451;
            break region468;
        }
        }
        if (regionValue4436 == null) {
            continue loop448;
        } else {
            edgeValue4492 = regionValue4435;
            regionValue4478 = edgeValue4492;
            break region469;
        }
        }
        edgeValue4506 = regionValue4478;
        edgeValue4507 = regionValue4478;
        regionValue4405 = edgeValue4506;
        regionValue4406 = edgeValue4507;
        break region470;
        }
        value4508 = recovery$indy$flow$900(regionValue4406);
        if (value4508 != null) {
            edgeValue4536 = regionValue4405;
            regionValue4522 = edgeValue4536;
            break region474;
        } else {
            break region472;
        }
        }
        continue loop448;
        }
        value4576 = recovery$indy$flow$901(regionValue4522);
        value4577 = recovery$indy$flow$902(value4576);
        converted4578 = (char) (converted45);
        converted4579 = (short) (converted49);
        value4581 = (int) (converted4579);
        value4582 = (int) (converted4578);
        value4583 = value4577;
        value4585 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this))))));
        value4586 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value4583))))));
        recovery$indy$flow$905(value4585, value4586, (char) (value4582), (short) (value4581), converted53);
        if (value55 == null) {
            continue loop448;
        } else {
            break region502;
        }
        }
        }
        value4611 = recovery$indy$flow$906();
        value4613 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4611))))));
        value4614 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4613)))).field_44Q));
        value4615 = ((java.lang.Object)(((net.minecraft.client.multiplayer.WorldClient) (((java.lang.Object)(value4614)))).field_44Q));
        value4616 = recovery$indy$flow$910(value4615);
        break region514;
        }
        loop514: while (true) {
        region569: {
        region568: {
        region541: {
        region540: {
        region538: {
        region537: {
        region535: {
        region531: {
        region529: {
        region528: {
        region526: {
        region524: {
        region517: {
        value4642 = recovery$indy$flow$911(value4616);
        if ((int) ((value4642 ? 1 : 0)) == 0) {
            break region570;
        } else {
            break region517;
        }
        }
        value4673 = recovery$indy$flow$912(value4616);
        value4674 = ((java.lang.Object)(((net.minecraft.entity.Entity) (((java.lang.Object)(value4673))))));
        value4675 = value4674;
        if (a0 <= 0) {
            regionValue860 = value55;
            break region617;
        } else {
            edgeValue4708 = value4675;
            regionValue4694 = edgeValue4708;
            break region524;
        }
        }
        if (a1 <= 0) {
            break region569;
        } else {
            edgeValue4762 = regionValue4694;
            regionValue4748 = edgeValue4762;
            break region526;
        }
        }
        edgeValue4790 = regionValue4748;
        regionValue4776 = edgeValue4790;
        break region528;
        }
        if (value55 != null) {
            break region568;
        } else {
            edgeValue4841 = regionValue4776;
            regionValue4828 = edgeValue4841;
            break region529;
        }
        }
        edgeValue4867 = regionValue4828;
        regionValue4854 = edgeValue4867;
        break region531;
        }
        value4868 = recovery$indy$flow$914(regionValue4854);
        if (value55 != null) {
            edgeValue4875 = (int) ((value4868 ? 1 : 0));
            regionValue3860 = edgeValue4875;
            break region579;
        } else {
            edgeValue4902 = regionValue4854;
            edgeValue4903 = (int) ((value4868 ? 1 : 0));
            regionValue4888 = edgeValue4902;
            regionValue4889 = edgeValue4903;
            break region535;
        }
        }
        edgeValue4930 = regionValue4888;
        edgeValue4931 = regionValue4889;
        regionValue4916 = edgeValue4930;
        regionValue4917 = edgeValue4931;
        break region537;
        }
        if (regionValue4917 != 0) {
            edgeValue4957 = regionValue4916;
            regionValue4944 = edgeValue4957;
            break region541;
        } else {
            break region538;
        }
        }
        break region540;
        }
        continue loop514;
        }
        value5018 = ((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer) (((java.lang.Object)(regionValue4944))))));
        value5019 = recovery$indy$flow$916(value5018);
        value5020 = recovery$indy$flow$917(value5019);
        converted5021 = (char) (converted45);
        converted5022 = (short) (converted49);
        value5024 = (int) (converted5022);
        value5025 = (int) (converted5021);
        value5026 = value5020;
        value5028 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this))))));
        value5029 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value5026))))));
        recovery$indy$flow$920(value5028, value5029, (char) (value5025), (short) (value5024), converted53);
        break region568;
        }
        break region569;
        }
        if (value55 == null) {
            continue loop514;
        } else {
            break region570;
        }
        }
        }
        value5073 = recovery$indy$flow$921();
        value5075 = ((java.lang.Object)(((net.C_47x5) (((java.lang.Object)(value5073))))));
        value5076 = recovery$indy$flow$923(value5075);
        edgeValue5083 = (int) ((value5076 ? 1 : 0));
        regionValue3860 = edgeValue5083;
        break region579;
        }
        edgeValue5090 = regionValue3860;
        regionValue3938 = edgeValue5090;
        break region580;
        }
        if (value55 != null) {
            edgeValue5105 = regionValue3938;
            regionValue5098 = edgeValue5105;
            break region591;
        } else {
            edgeValue5119 = regionValue3938;
            regionValue5112 = edgeValue5119;
            break region581;
        }
        }
        if (regionValue5112 == 0) {
            break region628;
        } else {
            break region582;
        }
        }
        if (value55 != null) {
            break region629;
        } else {
            break region585;
        }
        }
        break region587;
        }
        value5180 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_43W));
        value5181 = recovery$indy$flow$925(value5180);
        edgeValue5188 = (int) ((value5181 ? 1 : 0));
        regionValue5098 = edgeValue5188;
        break region591;
        }
        if (regionValue5098 != 0) {
            break region628;
        } else {
            break region592;
        }
        }
        value5206 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_450));
        if (value55 != null) {
            regionValue860 = value5206;
            break region617;
        } else {
            break region596;
        }
        }
        break region598;
        }
        if (value5206 == null) {
            break region611;
        } else {
            break region599;
        }
        }
        break region601;
        }
        if (value55 != null) {
            break region629;
        } else {
            break region604;
        }
        }
        break region606;
        }
        value5304 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_450));
        value5305 = recovery$indy$flow$928(value5304);
        if ((int) ((value5305 ? 1 : 0)) != 0) {
            break region628;
        } else {
            break region609;
        }
        }
        break region611;
        }
        value5326 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_43W));
        value5327 = recovery$indy$flow$930(value5326, 0);
        regionValue860 = value5327;
        break region617;
        }
        value5334 = ((java.lang.Object)(((java.lang.Runnable) (((java.lang.Object)(regionValue860))))));
        value5336 = recovery$indy$flow$932(value5334);
        recovery$indy$flow$933(this, value5336);
        value5337 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).field_43W));
        value5338 = recovery$indy$flow$935(value5337, 0);
        break region628;
        }
        break region629;
        }
        converted5349 = (short) (converted33);
        value5350 = (int) (converted5349);
        value5354 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this))))));
        recovery$indy$flow$937(value5354, converted25, converted29, (short) (value5350));
        return;
    }








   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 45464539306662L;
      recovery$indy$87(this, var3, -7739848236807328071L, var1);
      this.field_45N.clear();
      this.field_46.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 69867949042856L;
      int var6 = (int)((var4 ^ 69867949042856L) >>> 32);
      int var7 = (int)((var4 ^ 69867949042856L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var4 ^ 66033138641872L;
      recovery$indy$88(this, var6, (short)var7, (char)var8, 2737576788394654381L, var4);
      recovery$indy$89(this, var9, 2729353302765002703L, var4);
      this.field_45N.clear();
      this.field_46.clear();
      recovery$indy$90(this.settingCheckDelay, 2736854863112593456L, var4);
      this.field_43a = false;
   }



    public StaffDetector_47kd(long a0) {
        super((java.lang.String) ("StaffDetector"),(java.lang.String) ("Moderatorerkenner"),(long) (((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 121355836108537L)),(java.awt.Color) (new java.awt.Color((int) (80),(int) (162),(int) (181))),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 24920557709279L);
        long constructorKey4 = ((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 129195901207104L);
        long constructorKey5 = ((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 42976464553732L);
        long constructorKey6 = ((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 130238597490665L);
        long constructorKey7 = ((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 22896843755671L);
        int constructorPart8 = (int) ((((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 16555107644484L) >>> 32));
        long constructorKey9 = ((((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 16555107644484L) << 32) >>> 32);
        long constructorKey10 = ((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 107975079583285L);
        long constructorKey11 = ((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 133673927898205L);
        long constructorKey12 = ((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 105151583167247L);
        int constructorPart13 = (int) ((((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 115818115255315L) >>> 48));
        int constructorPart14 = (int) (((((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 115818115255315L) << 16) >>> 48));
        int constructorPart15 = (int) (((((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 115818115255315L) << 32) >>> 32));
        int constructorPart16 = (int) ((((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 10482336117583L) >>> 32));
        int constructorPart17 = (int) (((((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 10482336117583L) << 32) >>> 48));
        int constructorPart18 = (int) (((((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 10482336117583L) << 48) >>> 48));
        long constructorKey19 = ((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 11868337336589L);
        int constructorPart20 = (int) ((((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 130214400638803L) >>> 32));
        int constructorPart21 = (int) (((((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 130214400638803L) << 32) >>> 48));
        int constructorPart22 = (int) (((((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 130214400638803L) << 48) >>> 48));
        long constructorKey23 = ((augustus.recovered.modules.misc.StaffDetector_47kd.a ^ a0) ^ 55129855905125L);
        java.lang.Object initialValue24 = recovery$indy$flow$953();
        client.setting.MultiSelectSetting initialized25 = new client.setting.MultiSelectSetting(this, "Modes", constructorKey12, (net.C_47OZ[]) (initialValue24));
        recovery$indy$flow$955(this, initialized25);
        client.setting.SettingGroup initialized26 = new client.setting.SettingGroup(this, "Normal-Mode settings", constructorKey6);
        java.lang.Object initialValue27 = recovery$indy$flow$958();
        java.lang.Object initialValue28 = recovery$indy$flow$959(initialValue27);
        java.lang.Object initialValue29 = recovery$indy$flow$960(initialValue27);
        char converted30 = (char) (constructorPart17);
        java.lang.Object initialValue31 = initialValue29;
        int initialValue32 = constructorPart18;
        int initialValue33 = (int) (converted30);
        int initialValue34 = constructorPart16;
        client.setting.SettingGroup initialValue35 = initialized26;
        java.lang.Object initialValue36 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue35))))));
        java.lang.Object initialValue37 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue38 = recovery$indy$flow$963(initialValue36, initialValue34, (char) (initialValue33), initialValue32, initialValue37);
        recovery$indy$flow$964(this, initialValue38);
        short converted39 = (short) (constructorPart13);
        char converted40 = (char) (constructorPart14);
        java.lang.Object initialValue41 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingNormalModeSettings));
        client.setting.BooleanSetting initialized42 = new client.setting.BooleanSetting(this, "Exclude raw UUIDS", converted39, converted40, constructorPart15, true, (client.setting.SettingGroup) (initialValue41));
        java.lang.Object initialValue43 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingNormalModeSettings));
        java.lang.Object initialValue44 = recovery$indy$flow$969(initialValue43);
        java.lang.Object initialValue45 = recovery$indy$flow$970(initialValue43);
        java.lang.Object initialValue46 = initialValue45;
        long initialValue47 = constructorKey3;
        client.setting.BooleanSetting initialValue48 = initialized42;
        java.lang.Object initialValue49 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue48))))));
        java.lang.Object initialValue50 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue46))))));
        java.lang.Object initialValue51 = recovery$indy$flow$973(initialValue49, initialValue47, initialValue50);
        java.lang.Object initialValue52 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue51))))));
        recovery$indy$flow$975(this, initialValue52);
        short converted53 = (short) (constructorPart13);
        char converted54 = (char) (constructorPart14);
        java.lang.Object initialValue55 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingNormalModeSettings));
        client.setting.BooleanSetting initialized56 = new client.setting.BooleanSetting(this, "Show in spectator list normal", converted53, converted54, constructorPart15, true, (client.setting.SettingGroup) (initialValue55));
        long initialValue57 = constructorKey7;
        java.lang.String initialValue58 = "Show in spectator list";
        client.setting.BooleanSetting initialValue59 = initialized56;
        java.lang.Object initialValue60 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue59))))));
        java.lang.Object initialValue61 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue58))))));
        java.lang.Object initialValue62 = recovery$indy$flow$981(initialValue60, initialValue61, initialValue57);
        java.lang.Object initialValue63 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue62))))));
        java.lang.Object initialValue64 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingNormalModeSettings));
        java.lang.Object initialValue65 = recovery$indy$flow$984(initialValue64);
        java.lang.Object initialValue66 = recovery$indy$flow$985(initialValue64);
        java.lang.Object initialValue67 = initialValue66;
        long initialValue68 = constructorKey3;
        java.lang.Object initialValue69 = initialValue63;
        java.lang.Object initialValue70 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue69))))));
        java.lang.Object initialValue71 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue67))))));
        java.lang.Object initialValue72 = recovery$indy$flow$988(initialValue70, initialValue68, initialValue71);
        java.lang.Object initialValue73 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue72))))));
        recovery$indy$flow$990(this, initialValue73);
        short converted74 = (short) (constructorPart13);
        char converted75 = (char) (constructorPart14);
        java.lang.Object initialValue76 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingNormalModeSettings));
        client.setting.BooleanSetting initialized77 = new client.setting.BooleanSetting(this, "Chat message normal", converted74, converted75, constructorPart15, true, (client.setting.SettingGroup) (initialValue76));
        long initialValue78 = constructorKey7;
        java.lang.String initialValue79 = "Send chat message";
        client.setting.BooleanSetting initialValue80 = initialized77;
        java.lang.Object initialValue81 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue80))))));
        java.lang.Object initialValue82 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue79))))));
        java.lang.Object initialValue83 = recovery$indy$flow$996(initialValue81, initialValue82, initialValue78);
        java.lang.Object initialValue84 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue83))))));
        java.lang.Object initialValue85 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingNormalModeSettings));
        java.lang.Object initialValue86 = recovery$indy$flow$999(initialValue85);
        java.lang.Object initialValue87 = recovery$indy$flow$1000(initialValue85);
        java.lang.Object initialValue88 = initialValue87;
        long initialValue89 = constructorKey3;
        java.lang.Object initialValue90 = initialValue84;
        java.lang.Object initialValue91 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue90))))));
        java.lang.Object initialValue92 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue88))))));
        java.lang.Object initialValue93 = recovery$indy$flow$1003(initialValue91, initialValue89, initialValue92);
        java.lang.Object initialValue94 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue93))))));
        recovery$indy$flow$1005(this, initialValue94);
        short converted95 = (short) (constructorPart13);
        char converted96 = (char) (constructorPart14);
        java.lang.Object initialValue97 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingNormalModeSettings));
        client.setting.BooleanSetting initialized98 = new client.setting.BooleanSetting(this, "Notification normal", converted95, converted96, constructorPart15, true, (client.setting.SettingGroup) (initialValue97));
        long initialValue99 = constructorKey7;
        java.lang.String initialValue100 = "Show notification";
        client.setting.BooleanSetting initialValue101 = initialized98;
        java.lang.Object initialValue102 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue101))))));
        java.lang.Object initialValue103 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue100))))));
        java.lang.Object initialValue104 = recovery$indy$flow$1011(initialValue102, initialValue103, initialValue99);
        java.lang.Object initialValue105 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue104))))));
        java.lang.Object initialValue106 = recovery$indy$flow$1013(this);
        java.lang.Object initialValue107 = initialValue106;
        long initialValue108 = constructorKey3;
        java.lang.Object initialValue109 = initialValue105;
        java.lang.Object initialValue110 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue109))))));
        java.lang.Object initialValue111 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue107))))));
        java.lang.Object initialValue112 = recovery$indy$flow$1016(initialValue110, initialValue108, initialValue111);
        java.lang.Object initialValue113 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue112))))));
        recovery$indy$flow$1018(this, initialValue113);
        short converted114 = (short) (constructorPart13);
        char converted115 = (char) (constructorPart14);
        java.lang.Object initialValue116 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingNormalModeSettings));
        client.setting.BooleanSetting initialized117 = new client.setting.BooleanSetting(this, "Acoustic warning normal", converted114, converted115, constructorPart15, true, (client.setting.SettingGroup) (initialValue116));
        long initialValue118 = constructorKey7;
        java.lang.String initialValue119 = "Acoustic warning";
        client.setting.BooleanSetting initialValue120 = initialized117;
        java.lang.Object initialValue121 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue120))))));
        java.lang.Object initialValue122 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue119))))));
        java.lang.Object initialValue123 = recovery$indy$flow$1024(initialValue121, initialValue122, initialValue118);
        java.lang.Object initialValue124 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue123))))));
        java.lang.Object initialValue125 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingNormalModeSettings));
        java.lang.Object initialValue126 = recovery$indy$flow$1027(initialValue125);
        java.lang.Object initialValue127 = recovery$indy$flow$1028(initialValue125);
        java.lang.Object initialValue128 = initialValue127;
        long initialValue129 = constructorKey3;
        java.lang.Object initialValue130 = initialValue124;
        java.lang.Object initialValue131 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue130))))));
        java.lang.Object initialValue132 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue128))))));
        java.lang.Object initialValue133 = recovery$indy$flow$1031(initialValue131, initialValue129, initialValue132);
        java.lang.Object initialValue134 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue133))))));
        recovery$indy$flow$1033(this, initialValue134);
        client.setting.SettingGroup initialized135 = new client.setting.SettingGroup(this, "Simple-Mode settings", constructorKey6);
        java.lang.Object initialValue136 = recovery$indy$flow$1036();
        java.lang.Object initialValue137 = recovery$indy$flow$1037(initialValue136);
        java.lang.Object initialValue138 = recovery$indy$flow$1038(initialValue136);
        char converted139 = (char) (constructorPart17);
        java.lang.Object initialValue140 = initialValue138;
        int initialValue141 = constructorPart18;
        int initialValue142 = (int) (converted139);
        int initialValue143 = constructorPart16;
        client.setting.SettingGroup initialValue144 = initialized135;
        java.lang.Object initialValue145 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue144))))));
        java.lang.Object initialValue146 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue140))))));
        java.lang.Object initialValue147 = recovery$indy$flow$1041(initialValue145, initialValue143, (char) (initialValue142), initialValue141, initialValue146);
        recovery$indy$flow$1042(this, initialValue147);
        short converted148 = (short) (constructorPart13);
        char converted149 = (char) (constructorPart14);
        java.lang.Object initialValue150 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingSimpleModeSettings));
        client.setting.BooleanSetting initialized151 = new client.setting.BooleanSetting(this, "Show in spectator list simple", converted148, converted149, constructorPart15, true, (client.setting.SettingGroup) (initialValue150));
        long initialValue152 = constructorKey7;
        java.lang.String initialValue153 = "Show in spectator list";
        client.setting.BooleanSetting initialValue154 = initialized151;
        java.lang.Object initialValue155 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue154))))));
        java.lang.Object initialValue156 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue153))))));
        java.lang.Object initialValue157 = recovery$indy$flow$1048(initialValue155, initialValue156, initialValue152);
        java.lang.Object initialValue158 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue157))))));
        java.lang.Object initialValue159 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingSimpleModeSettings));
        java.lang.Object initialValue160 = recovery$indy$flow$1051(initialValue159);
        java.lang.Object initialValue161 = recovery$indy$flow$1052(initialValue159);
        java.lang.Object initialValue162 = initialValue161;
        long initialValue163 = constructorKey3;
        java.lang.Object initialValue164 = initialValue158;
        java.lang.Object initialValue165 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue164))))));
        java.lang.Object initialValue166 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue162))))));
        java.lang.Object initialValue167 = recovery$indy$flow$1055(initialValue165, initialValue163, initialValue166);
        java.lang.Object initialValue168 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue167))))));
        recovery$indy$flow$1057(this, initialValue168);
        short converted169 = (short) (constructorPart13);
        char converted170 = (char) (constructorPart14);
        java.lang.Object initialValue171 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingSimpleModeSettings));
        client.setting.BooleanSetting initialized172 = new client.setting.BooleanSetting(this, "Chat message simple", converted169, converted170, constructorPart15, true, (client.setting.SettingGroup) (initialValue171));
        long initialValue173 = constructorKey7;
        java.lang.String initialValue174 = "Send chat message";
        client.setting.BooleanSetting initialValue175 = initialized172;
        java.lang.Object initialValue176 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue175))))));
        java.lang.Object initialValue177 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue174))))));
        java.lang.Object initialValue178 = recovery$indy$flow$1063(initialValue176, initialValue177, initialValue173);
        java.lang.Object initialValue179 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue178))))));
        java.lang.Object initialValue180 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingSimpleModeSettings));
        java.lang.Object initialValue181 = recovery$indy$flow$1066(initialValue180);
        java.lang.Object initialValue182 = recovery$indy$flow$1067(initialValue180);
        java.lang.Object initialValue183 = initialValue182;
        long initialValue184 = constructorKey3;
        java.lang.Object initialValue185 = initialValue179;
        java.lang.Object initialValue186 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue185))))));
        java.lang.Object initialValue187 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue183))))));
        java.lang.Object initialValue188 = recovery$indy$flow$1070(initialValue186, initialValue184, initialValue187);
        java.lang.Object initialValue189 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue188))))));
        recovery$indy$flow$1072(this, initialValue189);
        short converted190 = (short) (constructorPart13);
        char converted191 = (char) (constructorPart14);
        java.lang.Object initialValue192 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingSimpleModeSettings));
        client.setting.BooleanSetting initialized193 = new client.setting.BooleanSetting(this, "Notification simple", converted190, converted191, constructorPart15, true, (client.setting.SettingGroup) (initialValue192));
        long initialValue194 = constructorKey7;
        java.lang.String initialValue195 = "Show notification";
        client.setting.BooleanSetting initialValue196 = initialized193;
        java.lang.Object initialValue197 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue196))))));
        java.lang.Object initialValue198 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue195))))));
        java.lang.Object initialValue199 = recovery$indy$flow$1078(initialValue197, initialValue198, initialValue194);
        java.lang.Object initialValue200 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue199))))));
        java.lang.Object initialValue201 = recovery$indy$flow$1080(this);
        java.lang.Object initialValue202 = initialValue201;
        long initialValue203 = constructorKey3;
        java.lang.Object initialValue204 = initialValue200;
        java.lang.Object initialValue205 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue204))))));
        java.lang.Object initialValue206 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue202))))));
        java.lang.Object initialValue207 = recovery$indy$flow$1083(initialValue205, initialValue203, initialValue206);
        java.lang.Object initialValue208 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue207))))));
        recovery$indy$flow$1085(this, initialValue208);
        short converted209 = (short) (constructorPart13);
        char converted210 = (char) (constructorPart14);
        java.lang.Object initialValue211 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingSimpleModeSettings));
        client.setting.BooleanSetting initialized212 = new client.setting.BooleanSetting(this, "Acoustic warning simple", converted209, converted210, constructorPart15, true, (client.setting.SettingGroup) (initialValue211));
        long initialValue213 = constructorKey7;
        java.lang.String initialValue214 = "Acoustic warning";
        client.setting.BooleanSetting initialValue215 = initialized212;
        java.lang.Object initialValue216 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue215))))));
        java.lang.Object initialValue217 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue214))))));
        java.lang.Object initialValue218 = recovery$indy$flow$1091(initialValue216, initialValue217, initialValue213);
        java.lang.Object initialValue219 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue218))))));
        java.lang.Object initialValue220 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingSimpleModeSettings));
        java.lang.Object initialValue221 = recovery$indy$flow$1094(initialValue220);
        java.lang.Object initialValue222 = recovery$indy$flow$1095(initialValue220);
        java.lang.Object initialValue223 = initialValue222;
        long initialValue224 = constructorKey3;
        java.lang.Object initialValue225 = initialValue219;
        java.lang.Object initialValue226 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue225))))));
        java.lang.Object initialValue227 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue223))))));
        java.lang.Object initialValue228 = recovery$indy$flow$1098(initialValue226, initialValue224, initialValue227);
        java.lang.Object initialValue229 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue228))))));
        recovery$indy$flow$1100(this, initialValue229);
        client.setting.SettingGroup initialized230 = new client.setting.SettingGroup(this, "OldGomme-Mode settings", constructorKey6);
        java.lang.Object initialValue231 = recovery$indy$flow$1103();
        java.lang.Object initialValue232 = recovery$indy$flow$1104(initialValue231);
        java.lang.Object initialValue233 = recovery$indy$flow$1105(initialValue231);
        char converted234 = (char) (constructorPart17);
        java.lang.Object initialValue235 = initialValue233;
        int initialValue236 = constructorPart18;
        int initialValue237 = (int) (converted234);
        int initialValue238 = constructorPart16;
        client.setting.SettingGroup initialValue239 = initialized230;
        java.lang.Object initialValue240 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue239))))));
        java.lang.Object initialValue241 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue235))))));
        java.lang.Object initialValue242 = recovery$indy$flow$1108(initialValue240, initialValue238, (char) (initialValue237), initialValue236, initialValue241);
        recovery$indy$flow$1109(this, initialValue242);
        java.lang.Object initialValue243 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOldGommeModeSettings));
        client.setting.RangeSetting initialized244 = new client.setting.RangeSetting(constructorPart20, this, "CheckDelay", constructorPart21, constructorPart22, Double.longBitsToDouble(4656510908468559872L), Double.longBitsToDouble(4658815484840378368L), Double.longBitsToDouble(4647503709213818880L), Double.longBitsToDouble(4662219572839972864L), 0, (client.setting.SettingGroup) (initialValue243));
        long initialValue245 = constructorKey5;
        client.setting.RangeSetting initialValue246 = initialized244;
        java.lang.Object initialValue247 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue246))))));
        java.lang.Object initialValue248 = recovery$indy$flow$1114(initialValue247, initialValue245);
        java.lang.Object initialValue249 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOldGommeModeSettings));
        java.lang.Object initialValue250 = recovery$indy$flow$1116(initialValue249);
        java.lang.Object initialValue251 = recovery$indy$flow$1117(initialValue249);
        long initialValue252 = constructorKey9;
        java.lang.Object initialValue253 = initialValue251;
        int initialValue254 = constructorPart8;
        java.lang.Object initialValue255 = initialValue248;
        java.lang.Object initialValue256 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue255))))));
        java.lang.Object initialValue257 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue253))))));
        java.lang.Object initialValue258 = recovery$indy$flow$1120(initialValue256, initialValue254, initialValue257, initialValue252);
        recovery$indy$flow$1121(this, initialValue258);
        short converted259 = (short) (constructorPart13);
        char converted260 = (char) (constructorPart14);
        java.lang.Object initialValue261 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOldGommeModeSettings));
        client.setting.BooleanSetting initialized262 = new client.setting.BooleanSetting(this, "Show in spectator list gomme", converted259, converted260, constructorPart15, true, (client.setting.SettingGroup) (initialValue261));
        long initialValue263 = constructorKey7;
        java.lang.String initialValue264 = "Show in spectator list";
        client.setting.BooleanSetting initialValue265 = initialized262;
        java.lang.Object initialValue266 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue265))))));
        java.lang.Object initialValue267 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue264))))));
        java.lang.Object initialValue268 = recovery$indy$flow$1127(initialValue266, initialValue267, initialValue263);
        java.lang.Object initialValue269 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue268))))));
        java.lang.Object initialValue270 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOldGommeModeSettings));
        java.lang.Object initialValue271 = recovery$indy$flow$1130(initialValue270);
        java.lang.Object initialValue272 = recovery$indy$flow$1131(initialValue270);
        java.lang.Object initialValue273 = initialValue272;
        long initialValue274 = constructorKey3;
        java.lang.Object initialValue275 = initialValue269;
        java.lang.Object initialValue276 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue275))))));
        java.lang.Object initialValue277 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue273))))));
        java.lang.Object initialValue278 = recovery$indy$flow$1134(initialValue276, initialValue274, initialValue277);
        java.lang.Object initialValue279 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue278))))));
        recovery$indy$flow$1136(this, initialValue279);
        short converted280 = (short) (constructorPart13);
        char converted281 = (char) (constructorPart14);
        java.lang.Object initialValue282 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOldGommeModeSettings));
        client.setting.BooleanSetting initialized283 = new client.setting.BooleanSetting(this, "Chat message gomme", converted280, converted281, constructorPart15, true, (client.setting.SettingGroup) (initialValue282));
        long initialValue284 = constructorKey7;
        java.lang.String initialValue285 = "Send chat message";
        client.setting.BooleanSetting initialValue286 = initialized283;
        java.lang.Object initialValue287 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue286))))));
        java.lang.Object initialValue288 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue285))))));
        java.lang.Object initialValue289 = recovery$indy$flow$1142(initialValue287, initialValue288, initialValue284);
        java.lang.Object initialValue290 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue289))))));
        java.lang.Object initialValue291 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOldGommeModeSettings));
        java.lang.Object initialValue292 = recovery$indy$flow$1145(initialValue291);
        java.lang.Object initialValue293 = recovery$indy$flow$1146(initialValue291);
        java.lang.Object initialValue294 = initialValue293;
        long initialValue295 = constructorKey3;
        java.lang.Object initialValue296 = initialValue290;
        java.lang.Object initialValue297 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue296))))));
        java.lang.Object initialValue298 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue294))))));
        java.lang.Object initialValue299 = recovery$indy$flow$1149(initialValue297, initialValue295, initialValue298);
        java.lang.Object initialValue300 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue299))))));
        recovery$indy$flow$1151(this, initialValue300);
        short converted301 = (short) (constructorPart13);
        char converted302 = (char) (constructorPart14);
        java.lang.Object initialValue303 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOldGommeModeSettings));
        client.setting.BooleanSetting initialized304 = new client.setting.BooleanSetting(this, "Notification gomme", converted301, converted302, constructorPart15, true, (client.setting.SettingGroup) (initialValue303));
        long initialValue305 = constructorKey7;
        java.lang.String initialValue306 = "Show notification";
        client.setting.BooleanSetting initialValue307 = initialized304;
        java.lang.Object initialValue308 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue307))))));
        java.lang.Object initialValue309 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue306))))));
        java.lang.Object initialValue310 = recovery$indy$flow$1157(initialValue308, initialValue309, initialValue305);
        java.lang.Object initialValue311 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue310))))));
        java.lang.Object initialValue312 = recovery$indy$flow$1159(this);
        java.lang.Object initialValue313 = initialValue312;
        long initialValue314 = constructorKey3;
        java.lang.Object initialValue315 = initialValue311;
        java.lang.Object initialValue316 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue315))))));
        java.lang.Object initialValue317 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue313))))));
        java.lang.Object initialValue318 = recovery$indy$flow$1162(initialValue316, initialValue314, initialValue317);
        java.lang.Object initialValue319 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue318))))));
        recovery$indy$flow$1164(this, initialValue319);
        short converted320 = (short) (constructorPart13);
        char converted321 = (char) (constructorPart14);
        java.lang.Object initialValue322 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOldGommeModeSettings));
        client.setting.BooleanSetting initialized323 = new client.setting.BooleanSetting(this, "Acoustic warning gomme", converted320, converted321, constructorPart15, true, (client.setting.SettingGroup) (initialValue322));
        long initialValue324 = constructorKey7;
        java.lang.String initialValue325 = "Acoustic warning";
        client.setting.BooleanSetting initialValue326 = initialized323;
        java.lang.Object initialValue327 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue326))))));
        java.lang.Object initialValue328 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue325))))));
        java.lang.Object initialValue329 = recovery$indy$flow$1170(initialValue327, initialValue328, initialValue324);
        java.lang.Object initialValue330 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue329))))));
        java.lang.Object initialValue331 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOldGommeModeSettings));
        java.lang.Object initialValue332 = recovery$indy$flow$1173(initialValue331);
        java.lang.Object initialValue333 = recovery$indy$flow$1174(initialValue331);
        java.lang.Object initialValue334 = initialValue333;
        long initialValue335 = constructorKey3;
        java.lang.Object initialValue336 = initialValue330;
        java.lang.Object initialValue337 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue336))))));
        java.lang.Object initialValue338 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue334))))));
        java.lang.Object initialValue339 = recovery$indy$flow$1177(initialValue337, initialValue335, initialValue338);
        java.lang.Object initialValue340 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue339))))));
        recovery$indy$flow$1179(this, initialValue340);
        client.setting.SettingGroup initialized341 = new client.setting.SettingGroup(this, "Other-Mode settings", constructorKey6);
        java.lang.Object initialValue342 = recovery$indy$flow$1182();
        java.lang.Object initialValue343 = recovery$indy$flow$1183(initialValue342);
        java.lang.Object initialValue344 = recovery$indy$flow$1184(initialValue342);
        char converted345 = (char) (constructorPart17);
        java.lang.Object initialValue346 = initialValue344;
        int initialValue347 = constructorPart18;
        int initialValue348 = (int) (converted345);
        int initialValue349 = constructorPart16;
        client.setting.SettingGroup initialValue350 = initialized341;
        java.lang.Object initialValue351 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue350))))));
        java.lang.Object initialValue352 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue346))))));
        java.lang.Object initialValue353 = recovery$indy$flow$1187(initialValue351, initialValue349, (char) (initialValue348), initialValue347, initialValue352);
        recovery$indy$flow$1188(this, initialValue353);
        short converted354 = (short) (constructorPart13);
        char converted355 = (char) (constructorPart14);
        java.lang.Object initialValue356 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOtherModeSettings));
        client.setting.BooleanSetting initialized357 = new client.setting.BooleanSetting(this, "Show in spectator list other", converted354, converted355, constructorPart15, true, (client.setting.SettingGroup) (initialValue356));
        long initialValue358 = constructorKey7;
        java.lang.String initialValue359 = "Show in spectator list";
        client.setting.BooleanSetting initialValue360 = initialized357;
        java.lang.Object initialValue361 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue360))))));
        java.lang.Object initialValue362 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue359))))));
        java.lang.Object initialValue363 = recovery$indy$flow$1194(initialValue361, initialValue362, initialValue358);
        java.lang.Object initialValue364 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue363))))));
        java.lang.Object initialValue365 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOtherModeSettings));
        java.lang.Object initialValue366 = recovery$indy$flow$1197(initialValue365);
        java.lang.Object initialValue367 = recovery$indy$flow$1198(initialValue365);
        java.lang.Object initialValue368 = initialValue367;
        long initialValue369 = constructorKey3;
        java.lang.Object initialValue370 = initialValue364;
        java.lang.Object initialValue371 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue370))))));
        java.lang.Object initialValue372 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue368))))));
        java.lang.Object initialValue373 = recovery$indy$flow$1201(initialValue371, initialValue369, initialValue372);
        java.lang.Object initialValue374 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue373))))));
        recovery$indy$flow$1203(this, initialValue374);
        short converted375 = (short) (constructorPart13);
        char converted376 = (char) (constructorPart14);
        java.lang.Object initialValue377 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOtherModeSettings));
        client.setting.BooleanSetting initialized378 = new client.setting.BooleanSetting(this, "Chat message other", converted375, converted376, constructorPart15, true, (client.setting.SettingGroup) (initialValue377));
        long initialValue379 = constructorKey7;
        java.lang.String initialValue380 = "Send chat message";
        client.setting.BooleanSetting initialValue381 = initialized378;
        java.lang.Object initialValue382 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue381))))));
        java.lang.Object initialValue383 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue380))))));
        java.lang.Object initialValue384 = recovery$indy$flow$1209(initialValue382, initialValue383, initialValue379);
        java.lang.Object initialValue385 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue384))))));
        java.lang.Object initialValue386 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOtherModeSettings));
        java.lang.Object initialValue387 = recovery$indy$flow$1212(initialValue386);
        java.lang.Object initialValue388 = recovery$indy$flow$1213(initialValue386);
        java.lang.Object initialValue389 = initialValue388;
        long initialValue390 = constructorKey3;
        java.lang.Object initialValue391 = initialValue385;
        java.lang.Object initialValue392 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue391))))));
        java.lang.Object initialValue393 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue389))))));
        java.lang.Object initialValue394 = recovery$indy$flow$1216(initialValue392, initialValue390, initialValue393);
        java.lang.Object initialValue395 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue394))))));
        recovery$indy$flow$1218(this, initialValue395);
        short converted396 = (short) (constructorPart13);
        char converted397 = (char) (constructorPart14);
        java.lang.Object initialValue398 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOtherModeSettings));
        client.setting.BooleanSetting initialized399 = new client.setting.BooleanSetting(this, "Notification other", converted396, converted397, constructorPart15, true, (client.setting.SettingGroup) (initialValue398));
        long initialValue400 = constructorKey7;
        java.lang.String initialValue401 = "Show notification";
        client.setting.BooleanSetting initialValue402 = initialized399;
        java.lang.Object initialValue403 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue402))))));
        java.lang.Object initialValue404 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue401))))));
        java.lang.Object initialValue405 = recovery$indy$flow$1224(initialValue403, initialValue404, initialValue400);
        java.lang.Object initialValue406 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue405))))));
        java.lang.Object initialValue407 = recovery$indy$flow$1226(this);
        java.lang.Object initialValue408 = initialValue407;
        long initialValue409 = constructorKey3;
        java.lang.Object initialValue410 = initialValue406;
        java.lang.Object initialValue411 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue410))))));
        java.lang.Object initialValue412 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue408))))));
        java.lang.Object initialValue413 = recovery$indy$flow$1229(initialValue411, initialValue409, initialValue412);
        java.lang.Object initialValue414 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue413))))));
        recovery$indy$flow$1231(this, initialValue414);
        short converted415 = (short) (constructorPart13);
        char converted416 = (char) (constructorPart14);
        java.lang.Object initialValue417 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOtherModeSettings));
        client.setting.BooleanSetting initialized418 = new client.setting.BooleanSetting(this, "Acoustic warning other", converted415, converted416, constructorPart15, true, (client.setting.SettingGroup) (initialValue417));
        long initialValue419 = constructorKey7;
        java.lang.String initialValue420 = "Acoustic warning";
        client.setting.BooleanSetting initialValue421 = initialized418;
        java.lang.Object initialValue422 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue421))))));
        java.lang.Object initialValue423 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue420))))));
        java.lang.Object initialValue424 = recovery$indy$flow$1237(initialValue422, initialValue423, initialValue419);
        java.lang.Object initialValue425 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue424))))));
        java.lang.Object initialValue426 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingOtherModeSettings));
        java.lang.Object initialValue427 = recovery$indy$flow$1240(initialValue426);
        java.lang.Object initialValue428 = recovery$indy$flow$1241(initialValue426);
        java.lang.Object initialValue429 = initialValue428;
        long initialValue430 = constructorKey3;
        java.lang.Object initialValue431 = initialValue425;
        java.lang.Object initialValue432 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue431))))));
        java.lang.Object initialValue433 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue429))))));
        java.lang.Object initialValue434 = recovery$indy$flow$1244(initialValue432, initialValue430, initialValue433);
        java.lang.Object initialValue435 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue434))))));
        recovery$indy$flow$1246(this, initialValue435);
        client.setting.SettingGroup initialized436 = new client.setting.SettingGroup(this, "ListBased-Mode settings", constructorKey6);
        java.lang.Object initialValue437 = recovery$indy$flow$1249();
        java.lang.Object initialValue438 = recovery$indy$flow$1250(initialValue437);
        java.lang.Object initialValue439 = recovery$indy$flow$1251(initialValue437);
        char converted440 = (char) (constructorPart17);
        java.lang.Object initialValue441 = initialValue439;
        int initialValue442 = constructorPart18;
        int initialValue443 = (int) (converted440);
        int initialValue444 = constructorPart16;
        client.setting.SettingGroup initialValue445 = initialized436;
        java.lang.Object initialValue446 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue445))))));
        java.lang.Object initialValue447 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue441))))));
        java.lang.Object initialValue448 = recovery$indy$flow$1254(initialValue446, initialValue444, (char) (initialValue443), initialValue442, initialValue447);
        recovery$indy$flow$1255(this, initialValue448);
        java.lang.Object initialValue449 = recovery$indy$flow$1257(0);
        java.lang.Object initialValue450 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingListBasedModeSettings));
        client.setting.ModeSetting initialized451 = new client.setting.ModeSetting(this, "Lists", "GommeHDDefault", (java.lang.String[]) (initialValue449), (client.setting.SettingGroup) (initialValue450), constructorKey11);
        java.lang.Object initialValue452 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingListBasedModeSettings));
        java.lang.Object initialValue453 = recovery$indy$flow$1261(initialValue452);
        java.lang.Object initialValue454 = recovery$indy$flow$1262(initialValue452);
        java.lang.Object initialValue455 = initialValue454;
        client.setting.ModeSetting initialValue456 = initialized451;
        java.lang.Object initialValue457 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue456))))));
        java.lang.Object initialValue458 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue455))))));
        java.lang.Object initialValue459 = recovery$indy$flow$1265(initialValue457, initialValue458);
        java.lang.Object initialValue460 = recovery$indy$flow$1266(this);
        java.lang.Object initialValue461 = initialValue460;
        java.lang.Object initialValue462 = initialValue459;
        java.lang.Object initialValue463 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue462))))));
        java.lang.Object initialValue464 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue461))))));
        java.lang.Object initialValue465 = recovery$indy$flow$1269(initialValue463, initialValue464);
        recovery$indy$flow$1270(this, initialValue465);
        short converted466 = (short) (constructorPart13);
        char converted467 = (char) (constructorPart14);
        java.lang.Object initialValue468 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingListBasedModeSettings));
        client.setting.BooleanSetting initialized469 = new client.setting.BooleanSetting(this, "Show in spectator list list based", converted466, converted467, constructorPart15, true, (client.setting.SettingGroup) (initialValue468));
        long initialValue470 = constructorKey7;
        java.lang.String initialValue471 = "Show in spectator list";
        client.setting.BooleanSetting initialValue472 = initialized469;
        java.lang.Object initialValue473 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue472))))));
        java.lang.Object initialValue474 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue471))))));
        java.lang.Object initialValue475 = recovery$indy$flow$1276(initialValue473, initialValue474, initialValue470);
        java.lang.Object initialValue476 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue475))))));
        java.lang.Object initialValue477 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingListBasedModeSettings));
        java.lang.Object initialValue478 = recovery$indy$flow$1279(initialValue477);
        java.lang.Object initialValue479 = recovery$indy$flow$1280(initialValue477);
        java.lang.Object initialValue480 = initialValue479;
        long initialValue481 = constructorKey3;
        java.lang.Object initialValue482 = initialValue476;
        java.lang.Object initialValue483 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue482))))));
        java.lang.Object initialValue484 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue480))))));
        java.lang.Object initialValue485 = recovery$indy$flow$1283(initialValue483, initialValue481, initialValue484);
        java.lang.Object initialValue486 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue485))))));
        recovery$indy$flow$1285(this, initialValue486);
        short converted487 = (short) (constructorPart13);
        char converted488 = (char) (constructorPart14);
        java.lang.Object initialValue489 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingListBasedModeSettings));
        client.setting.BooleanSetting initialized490 = new client.setting.BooleanSetting(this, "Chat message list based", converted487, converted488, constructorPart15, true, (client.setting.SettingGroup) (initialValue489));
        long initialValue491 = constructorKey7;
        java.lang.String initialValue492 = "Send chat message";
        client.setting.BooleanSetting initialValue493 = initialized490;
        java.lang.Object initialValue494 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue493))))));
        java.lang.Object initialValue495 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue492))))));
        java.lang.Object initialValue496 = recovery$indy$flow$1291(initialValue494, initialValue495, initialValue491);
        java.lang.Object initialValue497 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue496))))));
        java.lang.Object initialValue498 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingListBasedModeSettings));
        java.lang.Object initialValue499 = recovery$indy$flow$1294(initialValue498);
        java.lang.Object initialValue500 = recovery$indy$flow$1295(initialValue498);
        java.lang.Object initialValue501 = initialValue500;
        long initialValue502 = constructorKey3;
        java.lang.Object initialValue503 = initialValue497;
        java.lang.Object initialValue504 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue503))))));
        java.lang.Object initialValue505 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue501))))));
        java.lang.Object initialValue506 = recovery$indy$flow$1298(initialValue504, initialValue502, initialValue505);
        java.lang.Object initialValue507 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue506))))));
        recovery$indy$flow$1300(this, initialValue507);
        short converted508 = (short) (constructorPart13);
        char converted509 = (char) (constructorPart14);
        java.lang.Object initialValue510 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingListBasedModeSettings));
        client.setting.BooleanSetting initialized511 = new client.setting.BooleanSetting(this, "Notification list based", converted508, converted509, constructorPart15, true, (client.setting.SettingGroup) (initialValue510));
        long initialValue512 = constructorKey7;
        java.lang.String initialValue513 = "Show notification";
        client.setting.BooleanSetting initialValue514 = initialized511;
        java.lang.Object initialValue515 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue514))))));
        java.lang.Object initialValue516 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue513))))));
        java.lang.Object initialValue517 = recovery$indy$flow$1306(initialValue515, initialValue516, initialValue512);
        java.lang.Object initialValue518 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue517))))));
        java.lang.Object initialValue519 = recovery$indy$flow$1308(this);
        java.lang.Object initialValue520 = initialValue519;
        long initialValue521 = constructorKey3;
        java.lang.Object initialValue522 = initialValue518;
        java.lang.Object initialValue523 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue522))))));
        java.lang.Object initialValue524 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue520))))));
        java.lang.Object initialValue525 = recovery$indy$flow$1311(initialValue523, initialValue521, initialValue524);
        java.lang.Object initialValue526 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue525))))));
        recovery$indy$flow$1313(this, initialValue526);
        short converted527 = (short) (constructorPart13);
        char converted528 = (char) (constructorPart14);
        java.lang.Object initialValue529 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingListBasedModeSettings));
        client.setting.BooleanSetting initialized530 = new client.setting.BooleanSetting(this, "Acoustic warning list based", converted527, converted528, constructorPart15, true, (client.setting.SettingGroup) (initialValue529));
        long initialValue531 = constructorKey7;
        java.lang.String initialValue532 = "Acoustic warning";
        client.setting.BooleanSetting initialValue533 = initialized530;
        java.lang.Object initialValue534 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue533))))));
        java.lang.Object initialValue535 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue532))))));
        java.lang.Object initialValue536 = recovery$indy$flow$1319(initialValue534, initialValue535, initialValue531);
        java.lang.Object initialValue537 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue536))))));
        java.lang.Object initialValue538 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(this)))).settingListBasedModeSettings));
        java.lang.Object initialValue539 = recovery$indy$flow$1322(initialValue538);
        java.lang.Object initialValue540 = recovery$indy$flow$1323(initialValue538);
        java.lang.Object initialValue541 = initialValue540;
        long initialValue542 = constructorKey3;
        java.lang.Object initialValue543 = initialValue537;
        java.lang.Object initialValue544 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue543))))));
        java.lang.Object initialValue545 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue541))))));
        java.lang.Object initialValue546 = recovery$indy$flow$1326(initialValue544, initialValue542, initialValue545);
        java.lang.Object initialValue547 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue546))))));
        recovery$indy$flow$1328(this, initialValue547);
        client.setting.NumberSetting initialized548 = new client.setting.NumberSetting(this, "Acoustic waring volume", Double.longBitsToDouble(4636244710145392640L), constructorKey23, 0.0D, Double.longBitsToDouble(4636737291354636288L), 0);
        java.lang.Object initialValue549 = recovery$indy$flow$1331(this);
        java.lang.Object initialValue550 = initialValue549;
        client.setting.NumberSetting initialValue551 = initialized548;
        java.lang.Object initialValue552 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue551))))));
        java.lang.Object initialValue553 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue550))))));
        java.lang.Object initialValue554 = recovery$indy$flow$1334(initialValue552, initialValue553);
        recovery$indy$flow$1335(this, initialValue554);
        client.setting.NumberSetting initialized555 = new client.setting.NumberSetting(this, "Scale", Double.longBitsToDouble(4611686018427387904L), constructorKey23, 1.0D, Double.longBitsToDouble(4616189618054758400L), 2);
        java.lang.Object initialValue556 = recovery$indy$flow$1338(this);
        java.lang.Object initialValue557 = initialValue556;
        client.setting.NumberSetting initialValue558 = initialized555;
        java.lang.Object initialValue559 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue558))))));
        java.lang.Object initialValue560 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue557))))));
        java.lang.Object initialValue561 = recovery$indy$flow$1341(initialValue559, initialValue560);
        recovery$indy$flow$1342(this, initialValue561);
        client.setting.ShaderOptions initialized562 = new client.setting.ShaderOptions(this, constructorKey4);
        java.lang.Object initialValue563 = recovery$indy$flow$1345();
        java.lang.Object initialValue564 = initialValue563;
        long initialValue565 = constructorKey19;
        client.setting.ShaderOptions initialValue566 = initialized562;
        java.lang.Object initialValue567 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue566))))));
        java.lang.Object initialValue568 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue564))))));
        java.lang.Object initialValue569 = recovery$indy$flow$1348(initialValue567, initialValue565, initialValue568);
        java.lang.Object initialValue570 = recovery$indy$flow$1349(this);
        java.lang.Object initialValue571 = initialValue570;
        long initialValue572 = constructorKey3;
        java.lang.Object initialValue573 = initialValue569;
        java.lang.Object initialValue574 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue573))))));
        java.lang.Object initialValue575 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue571))))));
        java.lang.Object initialValue576 = recovery$indy$flow$1352(initialValue574, initialValue572, initialValue575);
        java.lang.Object initialValue577 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue576))))));
        recovery$indy$flow$1354(this, initialValue577);
        net.C_47cu initialized578 = new net.C_47cu();
        recovery$indy$flow$1357(this, initialized578);
        java.util.ArrayList initialized579 = new java.util.ArrayList();
        recovery$indy$flow$1360(this, initialized579);
        java.util.HashSet initialized580 = new java.util.HashSet();
        recovery$indy$flow$1363(this, initialized580);
        java.util.HashMap initialized581 = new java.util.HashMap();
        recovery$indy$flow$1366(this, initialized581);
        recovery$indy$flow$1367(this, false);
        java.util.HashSet initialized582 = new java.util.HashSet();
        recovery$indy$flow$1370(this, initialized582);
        java.util.HashSet initialized583 = new java.util.HashSet();
        recovery$indy$flow$1373(this, initialized583);
        recovery$indy$flow$1374(this, 0L);
        java.util.HashSet initialized584 = new java.util.HashSet();
        recovery$indy$flow$1377(this, initialized584);
        java.util.HashMap initialized585 = new java.util.HashMap();
        recovery$indy$flow$1380(this, initialized585);
        java.util.ArrayList initialized586 = new java.util.ArrayList();
        recovery$indy$flow$1383(this, initialized586);
        recovery$indy$flow$1384(this, null);
        long initialValue587 = constructorKey10;
        StaffDetector_47kd initialValue588 = this;
        java.lang.Object initialValue589 = ((java.lang.Object)(((augustus.recovered.modules.misc.StaffDetector_47kd) (((java.lang.Object)(initialValue588))))));
        recovery$indy$flow$1386(initialValue589, initialValue587);
        return;
    }
















    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$122();
    private static native java.lang.Object recovery$indy$flow$124();
    private static native java.lang.Object recovery$indy$flow$373(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$807();

    private static native void recovery$indy$flow$809(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$810() {
        return net.C_47x5.GOMME;
    }

    private static native boolean recovery$indy$flow$812(java.lang.Object a0);



    private static native int recovery$indy$flow$816(java.lang.Object a0);

    private static native boolean recovery$indy$flow$818(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$819() {
        return augustus.recovered.modules.misc.StaffDetector_47kd.field_43;
    }


    private static boolean recovery$indy$flow$822(java.lang.Object a0) {
        return (a0 instanceof net.C_47Ld);
    }


    private static native double recovery$indy$flow$825(java.lang.Object a0);


    private static native void recovery$indy$flow$828(java.lang.Object a0);

    private static native void recovery$indy$flow$830(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$831() {
        return augustus.recovered.modules.misc.StaffDetector_47kd.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$833(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$834(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$835(java.lang.Object a0) {
        return ((java.util.Collection) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$836(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$837(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static native java.lang.Object recovery$indy$flow$839(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$840(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$842(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).remove(a1);
    }

    private static long recovery$indy$flow$844() {
        return java.lang.System.currentTimeMillis();
    }
    private static java.lang.Object recovery$indy$flow$845(long a0) {
        return java.lang.Long.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$846(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }

    private static java.lang.Object recovery$indy$flow$850(java.lang.Object a0) {
        return ((java.util.HashMap) (a0)).keySet();
    }
    private static java.lang.Object recovery$indy$flow$851(java.lang.Object a0) {
        return ((java.util.Set) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$852(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$853(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }


    private static java.lang.Object recovery$indy$flow$856(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).get(a1);
    }

    private static long recovery$indy$flow$858(java.lang.Object a0) {
        return ((java.lang.Long) (a0)).longValue();
    }
    private static long recovery$indy$flow$859() {
        return java.lang.System.currentTimeMillis();
    }

    private static boolean recovery$indy$flow$861(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).contains(a1);
    }
    private static boolean recovery$indy$flow$862(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.LinkedList) (a0)).add(a1);
    }
    private static java.lang.Object recovery$indy$flow$863(java.lang.Object a0) {
        return ((java.util.LinkedList) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$864(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$865(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }


    private static java.lang.Object recovery$indy$flow$868(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).remove(a1);
    }

    private static java.lang.Object recovery$indy$flow$870(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$871(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$872(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }


    private static java.lang.Object recovery$indy$flow$875(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).get(a1);
    }


    private static native boolean recovery$indy$flow$878(java.lang.Object a0);

    private static native void recovery$indy$flow$880(java.lang.Object a0,long a1);

    private static boolean recovery$indy$flow$882(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashSet) (a0)).add(a1);
    }

    private static long recovery$indy$flow$884() {
        return java.lang.System.currentTimeMillis();
    }
    private static java.lang.Object recovery$indy$flow$885(long a0) {
        return java.lang.Long.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$886(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$887() {
        return net.C_47x5.LIST_BASED;
    }

    private static native boolean recovery$indy$flow$889(java.lang.Object a0);

    private static boolean recovery$indy$flow$891(java.lang.Object a0) {
        return ((java.util.HashSet) (a0)).isEmpty();
    }
    private static java.lang.Object recovery$indy$flow$892() {
        return augustus.recovered.modules.misc.StaffDetector_47kd.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$894(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$895(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$896(java.lang.Object a0) {
        return ((java.util.Collection) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$897(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$898(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static native java.lang.Object recovery$indy$flow$900(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$901(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$902(java.lang.Object a0);


    private static native void recovery$indy$flow$905(java.lang.Object a0,java.lang.Object a1,char a2,short a3,int a4);
    private static java.lang.Object recovery$indy$flow$906() {
        return augustus.recovered.modules.misc.StaffDetector_47kd.field_43;
    }



    private static java.lang.Object recovery$indy$flow$910(java.lang.Object a0) {
        return ((java.util.List) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$911(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$912(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static boolean recovery$indy$flow$914(java.lang.Object a0) {
        return (a0 instanceof net.minecraft.entity.player.EntityPlayer);
    }

    private static native java.lang.Object recovery$indy$flow$916(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$917(java.lang.Object a0);


    private static native void recovery$indy$flow$920(java.lang.Object a0,java.lang.Object a1,char a2,short a3,int a4);
    private static java.lang.Object recovery$indy$flow$921() {
        return net.C_47x5.NORMAL;
    }

    private static native boolean recovery$indy$flow$923(java.lang.Object a0);

    private static boolean recovery$indy$flow$925(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }


    private static boolean recovery$indy$flow$928(java.lang.Object a0) {
        return ((java.util.concurrent.CompletableFuture) (a0)).isDone();
    }

    private static java.lang.Object recovery$indy$flow$930(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static java.lang.Object recovery$indy$flow$932(java.lang.Object a0) {
        return java.util.concurrent.CompletableFuture.runAsync(((java.lang.Runnable) (a0)));
    }
    private static void recovery$indy$flow$933(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.StaffDetector_47kd) (a0)).field_450 = ((java.util.concurrent.CompletableFuture) (a1));
        return;
    }

    private static java.lang.Object recovery$indy$flow$935(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }

    private static native void recovery$indy$flow$937(java.lang.Object a0,int a1,int a2,short a3);
    private static native java.lang.Object recovery$indy$flow$953();
    private static native void recovery$indy$flow$955(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$958() {
        return net.C_47x5.NORMAL;
    }
    private static java.lang.Object recovery$indy$flow$959(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$960(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$963(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$964(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$969(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$970(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$973(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$975(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$981(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$984(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$985(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$988(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$990(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$996(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$999(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1000(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1003(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1005(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1011(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1013(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1016(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1018(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1024(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1027(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1028(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1031(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1033(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$1036() {
        return net.C_47x5.SIMPLE;
    }
    private static java.lang.Object recovery$indy$flow$1037(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1038(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1041(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$1042(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1048(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1051(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1052(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1055(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1057(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1063(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1066(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1067(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1070(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1072(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1078(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1080(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1083(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1085(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1091(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1094(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1095(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1098(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1100(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$1103() {
        return net.C_47x5.GOMME;
    }
    private static java.lang.Object recovery$indy$flow$1104(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1105(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1108(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$1109(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1114(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$1116(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1117(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1120(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1121(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1127(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1130(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1131(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1134(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1136(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1142(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1145(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1146(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1149(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1151(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1157(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1159(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1162(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1164(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1170(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1173(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1174(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1177(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1179(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$1182() {
        return net.C_47x5.OTHER;
    }
    private static java.lang.Object recovery$indy$flow$1183(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1184(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1187(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$1188(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1194(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1197(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1198(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1201(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1203(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1209(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1212(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1213(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1216(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1218(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1224(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1226(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1229(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1231(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1237(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1240(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1241(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1244(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1246(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$1249() {
        return net.C_47x5.LIST_BASED;
    }
    private static java.lang.Object recovery$indy$flow$1250(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1251(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1254(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$1255(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1257(int a0);


    private static java.lang.Object recovery$indy$flow$1261(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1262(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1265(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1266(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1269(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1270(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1276(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1279(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1280(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1283(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1285(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1291(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1294(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1295(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1298(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1300(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1306(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$1308(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1311(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1313(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1319(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1322(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1323(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1326(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1328(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1331(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1334(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1335(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1338(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1341(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1342(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$1345() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$1348(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$1349(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1352(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1354(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1357(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1360(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1363(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1366(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1367(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.StaffDetector_47kd) (a0)).field_43a = a1;
        return;
    }
    private static native void recovery$indy$flow$1370(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1373(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1374(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.misc.StaffDetector_47kd) (a0)).field_45q = a1;
        return;
    }
    private static native void recovery$indy$flow$1377(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1380(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1383(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1384(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.StaffDetector_47kd) (a0)).field_450 = ((java.util.concurrent.CompletableFuture) (a1));
        return;
    }

    private static native void recovery$indy$flow$1386(java.lang.Object a0,long a1);
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(int var0, long var1);
   private static native String recovery$indy$2(Object var0, long var1, long var3);
   private static native String recovery$indy$3(int var0, long var1);
   private static native void recovery$indy$4(long var0, Object var2, long var3, long var5);
   private static native void recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native Predicate recovery$indy$6(StaffDetector_47kd var0);
   private static native UnaryOperator recovery$indy$7();
   private static native int[] recovery$indy$8(long var0, long var2);
   private static native boolean recovery$indy$9(Object var0, long var1, long var3);
   private static native void recovery$indy$10(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$11(Object var0, long var1, long var3);
   private static native void recovery$indy$12(Object var0, Object var1, long var2, Object var4, long var5, long var7);
   private static native boolean recovery$indy$13(Object var0, long var1, long var3);
   private static native void recovery$indy$14(Object var0, Object var1, Object var2, long var3, long var5, long var7);
   private static native int[] recovery$indy$17(long var0, long var2);
   private static native GuiScreen recovery$indy$18(Object var0, long var1, long var3);
   private static native boolean recovery$indy$19(int var0, long var1, long var3, long var5);
   private static native double recovery$indy$20(Object var0, long var1, long var3, long var5);
   private static native FontRenderer recovery$indy$21(Object var0, long var1, long var3);
   private static native String recovery$indy$22(int var0, long var1);
   private static native boolean recovery$indy$23(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$24(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$25(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$26(StaffDetector_47kd var0, int var1, int var2, int var3, FontRenderer var4, String var5);
   private static native void recovery$indy$27(boolean var0, long var1, Object var3, long var4, long var6);
   private static native int[] recovery$indy$28(long var0, long var2);
   private static native C_47Ij recovery$indy$29(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$30(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$31(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);
   private static native String recovery$indy$33(int var0, long var1);
   private static native void recovery$indy$34(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$35(int var0, long var1);
   private static native Client recovery$indy$36(long var0, long var2);
   private static native String recovery$indy$37(Object var0, long var1, byte var3, long var4, long var6);
   private static native String recovery$indy$38(int var0, long var1);
   private static native void recovery$indy$39(Object var0, Object var1, long var2, boolean var4, long var5, long var7);
   private static native String recovery$indy$40(int var0, long var1);
   private static native Client recovery$indy$41(long var0, long var2);
   private static native String recovery$indy$42(Object var0, long var1, byte var3, long var4, long var6);
   private static native String recovery$indy$43(int var0, long var1);
   private static native void recovery$indy$44(Object var0, Object var1, long var2, boolean var4, long var5, long var7);
   private static native String recovery$indy$45(int var0, long var1);
   private static native Client recovery$indy$46(long var0, long var2);
   private static native String recovery$indy$47(Object var0, long var1, byte var3, long var4, long var6);
   private static native String recovery$indy$48(int var0, long var1);
   private static native void recovery$indy$49(Object var0, Object var1, long var2, boolean var4, long var5, long var7);
   private static native String recovery$indy$50(int var0, long var1);
   private static native Client recovery$indy$51(long var0, long var2);
   private static native String recovery$indy$52(Object var0, long var1, byte var3, long var4, long var6);
   private static native String recovery$indy$53(int var0, long var1);
   private static native void recovery$indy$54(Object var0, Object var1, long var2, boolean var4, long var5, long var7);
   private static native String recovery$indy$55(int var0, long var1);
   private static native Client recovery$indy$56(long var0, long var2);
   private static native String recovery$indy$57(Object var0, long var1, byte var3, long var4, long var6);
   private static native String recovery$indy$58(int var0, long var1);
   private static native void recovery$indy$59(Object var0, Object var1, long var2, boolean var4, long var5, long var7);
   private static native void recovery$indy$60(Object var0, int var1, short var2, char var3, long var4, long var6);
   private static native int[] recovery$indy$61(long var0, long var2);
   private static native boolean recovery$indy$62(Object var0, long var1, long var3);
   private static native void recovery$indy$63(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$64(Object var0, long var1, long var3);
   private static native void recovery$indy$65(Object var0, Object var1, long var2, Object var4, long var5, long var7);
   private static native boolean recovery$indy$66(Object var0, long var1, long var3);
   private static native void recovery$indy$67(Object var0, Object var1, Object var2, long var3, long var5, long var7);
   private static native int[] recovery$indy$68(long var0, long var2);
   private static native boolean recovery$indy$69(Object var0, long var1, long var3);
   private static native boolean recovery$indy$70(Object var0, long var1, long var3);
   private static native boolean recovery$indy$71(Object var0, long var1, long var3);
   private static native void recovery$indy$72(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$73(Object var0, long var1, long var3);
   private static native boolean recovery$indy$75(Object var0, long var1, long var3);
   private static native C_425 recovery$indy$76(Object var0, long var1, long var3);
   private static native double recovery$indy$77(Object var0, long var1, long var3, long var5);
   private static native Predicate recovery$indy$78(LinkedList var0);
   private static native int[] recovery$indy$79(long var0, long var2);
   private static native boolean recovery$indy$80(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$81(Object var0, long var1, long var3);
   private static native int[] recovery$indy$82(long var0, long var2);
   private static native void recovery$indy$83(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$84(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$85(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$86(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$87(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$88(Object var0, int var1, short var2, char var3, long var4, long var6);
   private static native void recovery$indy$89(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$90(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$123();
}
