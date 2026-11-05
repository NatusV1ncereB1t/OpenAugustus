package augustus.recovered.modules.render;

import augustus.recovered.modules.movement.Fly_47kE;
import augustus.recovered.modules.movement.Speed_47k_;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_46P;
import net.C_477A;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Kw;
import client.gui.ClickGuiScreen;
import net.minecraft.client.gui.GuiScreen;
import client.gui.ClickGuiPanel;
import client.module.Module;
import client.font.FontFace;
import client.module.ModuleManager;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47Th;
import client.setting.Setting;
import client.setting.ModeSetting;
import net.minecraft.client.Minecraft;
import net.C_47pS;
import client.ClientGlobals;
import client.module.Category;
import net.C_47uT;
import net.C_47xz;
import net.C_48F;
import net.C_49L;
import net.C_4f;

public class ClickGui_47QT extends Module implements C_49L, C_47xz {
   public final ModeSetting settingSorting;
   public final BooleanSetting settingGermanMode;
   public final BooleanSetting settingOpenInInventory;
   public final ShaderOptions settingClickGui;
   public final BooleanSetting settingOutline;
   public final NumberSetting settingAlpha;
   public final NumberSetting settingDynamicKeyTime;
   public final ModeSetting settingDescriptions;
   public final ModeSetting settingSettingNames;
   public final BooleanSetting settingModuleDescriptions;
   public final BooleanSetting settingSettingDescriptions;
   private CompletableFuture field_45;
   private static Setting[] field_48;
   private static final long a = C_4f.a(8918096600448404796L, 8505658306038723643L, MethodHandles.lookup().lookupClass()).a(63280242918396L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[94];
   private static final String[] f = new String[94];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native String b(byte[] var0);

   private void method_46$da8c82d5d4() {
      long var1 = a ^ 87096428285616L;
      long var3 = var1 ^ 77530681202747L;
      long var5 = var1 ^ 29194225392339L;
      long var10000 = -2366606940187732978L;
      Client var15 = Client.method_44$fbc0c0be91();
      long var10001 = -2363090256966223628L;
      Client var7 = var15;
      C_48F var16 = var7.method_45$0a14d890f9();
      long var10003 = -2364384946869212798L;
      long var8 = var5;
      ModeSetting var10 = this.settingDescriptions;
      String var17 = var10.method_46$5f9dc63072(var8);
      var10003 = -2362370656220517404L;
      long var11 = var3;
      String var13 = var17;
      C_48F var14 = var16;
      var14.method_44$db82fd5e78(var13, var11);
   }

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native void a();

   private static native int a(long var0, long var2);

   private void method_42$da8c82d5d4() {
      long var1 = a ^ 12668136160197L;
      long var3 = var1 ^ 2408216030542L;
      long var5 = var1 ^ 31099700470517L;
      long var7 = var1 ^ 103622512029606L;
      long var9 = var1 ^ 111148342766188L;
      long var11 = var1 ^ 69525850139025L;
      long var10000 = -1558989608928616069L;
      Client var35 = Client.method_44$fbc0c0be91();
      long var10001 = -1566732200731390591L;
      Client var13 = var35;
      C_48F var36 = var13.method_45$0a14d890f9();
      long var10003 = -1565773991300408073L;
      long var14 = var7;
      ModeSetting var16 = this.settingDescriptions;
      String var40 = var16.method_46$5f9dc63072(var14);
      var10003 = -1566574457940517231L;
      long var17 = var3;
      String var19 = var40;
      C_48F var20 = var36;
      var20.method_44$db82fd5e78(var19, var17);
      var10000 = -1558989608928616069L;
      Client var38 = Client.method_44$fbc0c0be91();
      var10001 = -1566333913521048523L;
      Client var21 = var38;
      C_46P var39 = var21.method_41$6ea2d045c9();
      var10003 = -1565773991300408073L;
      long var22 = var7;
      ModeSetting var24 = this.settingSettingNames;
      String var10002 = var24.method_46$5f9dc63072(var22);
      var10003 = -1559091504419750875L;
      String var25 = var10002;
      long var26 = var11;
      C_46P var28 = var39;
      var28.method_45$d07b98bfef(var26, var25);
      long var42 = -1565324866140987600L;
      long var29 = var9;
      Fly_47kE var31 = ClientGlobals.field_48.field_41P;
      var31.method_42$e45a9973e5(var29);
      long var43 = -1558818690461637016L;
      long var32 = var5;
      Speed_47k_ var34 = ClientGlobals.field_48.field_47;
      var34.method_41$e45a9973e5(var32);
      C_47Th.field_48.forEach(recovery$indy$1());
   }

   private static native Method d(long var0, long var2);

   private void method_41$da8c82d5d4() {
      CompletableFuture.runAsync(recovery$indy$2(this));
   }

   private static double method_40$71e8bd8a56(Module var0) {
      long var1 = a ^ 117582719105273L;
      long var3 = var1 ^ 37963411555696L;
      long var10001 = -6241643558839934393L;
      Client var13 = Client.method_44$fbc0c0be91();
      long var10002 = -6234631490546575022L;
      Client var5 = var13;
      ClickGuiScreen var14 = var5.method_44$a6a538af3c();
      var10002 = -6234110915999929219L;
      ClickGuiScreen var6 = var14;
      ClickGuiPanel var15 = var6.method_47$e4cbab95fa();
      var10002 = -6241964145873681025L;
      ClickGuiPanel var7 = var15;
      FontFace var16 = var7.method_49$18feef1d43();
      long var10003 = -6234051176963988089L;
      Module var8 = var0;
      String var19 = var8.method_41$0e30dfc966();
      long var10004 = -6241032846386652960L;
      long var9 = var3;
      String var11 = var19;
      FontFace var12 = var16;
      return 1000.0F - var12.method_40$4795379639(var11, var9);
   }

   public static void method_40$5994d1a418(Setting[] var0) {
      field_48 = var0;
   }

   private void method_44$da8c82d5d4() {
      long var1 = a ^ 51862648957914L;
      long var10001 = var1 ^ 129158678878083L;
      int var3 = (int)((var1 ^ 129158678878083L) >>> 48);
      int var4 = (int)((var1 ^ 129158678878083L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      long var6 = var1 ^ 72891126097075L;
      long var8 = var1 ^ 107861112201827L;
      long var10000 = 4197870853427473632L;
      int[] var10 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 4206272192607006525L;
      long var13 = var8;
      ModuleManager var15 = ClientGlobals.field_48;

      for (Object recovery$entry : var15.method_49$04910bcb3f(var13)) {
         Module var12 = (Module) recovery$entry;
         String var27;
         label23: {
            Module var26 = this;
            if (var10 == null) {
               var10002 = 4197676320258209625L;
               BooleanSetting var16 = this.settingGermanMode;
               if (var16.method_49$aae029aa0a()) {
                  var10002 = 4205888414582585336L;
                  Module var17 = var12;
                  var27 = var17.method_42$0e30dfc966();
                  break label23;
               }

               var26 = var12;
            }

            short var29 = (short)var3;
            short var10003 = (short)var4;
            long var10005 = 4205039575293486028L;
            int var18 = var5;
            short var19 = var10003;
            short var20 = var29;
            Module var21 = var26;
            var27 = var21.method_48$3d4640f80c(var20, var19, var18);
         }

         long var31 = 4206311160306632332L;
         long var22 = var6;
         String var24 = var27;
         Module var25 = var12;
         var25.method_45$db82fd5e78(var24, var22);
         if (var10 != null) {
            break;
         }
      }
   }

   public static Setting[] method_49$19d51fe81e() {
      return field_48;
   }

   private void method_49$da8c82d5d4() {
      long var1 = a ^ 115352575945290L;
      long var3 = var1 ^ 67424100843049L;
      long var5 = var1 ^ 101531500738590L;
      long var10000 = -4912802284345642764L;
      Client var15 = Client.method_44$fbc0c0be91();
      long var10001 = -4914516849640643142L;
      Client var7 = var15;
      C_46P var16 = var7.method_41$6ea2d045c9();
      long var10003 = -4915076779478151816L;
      long var8 = var3;
      ModeSetting var10 = this.settingSettingNames;
      String var10002 = var10.method_46$5f9dc63072(var8);
      var10003 = -4912409159105090134L;
      String var11 = var10002;
      long var12 = var5;
      C_46P var14 = var16;
      var14.method_45$d07b98bfef(var12, var11);
   }

   @Override
   public void method_45$df16004b03(int var1, int var2) {
      long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
      long var10001 = var3 ^ 61074082727685L;
      int var5 = (int)((var3 ^ 61074082727685L) >>> 48);
      int var6 = (int)((var3 ^ 61074082727685L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      long var8 = var3 ^ 793419756597L;
      long var10 = var3 ^ 36192303854309L;
      long var10000 = 3082599317453651046L;
      int[] var12 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 3087759286216736699L;
      long var15 = var10;
      ModuleManager var17 = ClientGlobals.field_48;

      for (Object recovery$entry : var17.method_49$04910bcb3f(var15)) {
         Module var14 = (Module) recovery$entry;
         String var29;
         label23: {
            Module var28 = this;
            if (var12 == null) {
               var10002 = 3082545361246627807L;
               BooleanSetting var18 = this.settingGermanMode;
               if (var18.method_49$aae029aa0a()) {
                  var10002 = 3087239299747096446L;
                  Module var19 = var14;
                  var29 = var19.method_42$0e30dfc966();
                  break label23;
               }

               var28 = var14;
            }

            short var31 = (short)var5;
            short var10003 = (short)var6;
            long var10005 = 3088642258598032202L;
            int var20 = var7;
            short var21 = var10003;
            short var22 = var31;
            Module var23 = var28;
            var29 = var23.method_48$3d4640f80c(var22, var21, var20);
         }

         long var33 = 3087660944889452042L;
         long var24 = var8;
         String var26 = var29;
         Module var27 = var14;
         var27.method_45$db82fd5e78(var26, var24);
         if (var12 != null) {
            break;
         }
      }
   }

   private void method_47$da8c82d5d4() {
      CompletableFuture.runAsync(recovery$indy$3(this));
   }

   private void method_45P$da8c82d5d4() {
      int[] var5;
      int var29;
      long var1 = a ^ 52036138495831L;
      long var3 = var1 ^ 135138516712244L;
      long var10002 = 9139883987944327269L;
      long var12 = var3;
      ModeSetting var14 = this.settingSorting;
      String var6 = var14.method_46$5f9dc63072(var12);
      long var10000 = 9136912165134592109L;
      int[] var28 = AntiStrike_47Qa.method_42$d4d28024c9();
      byte var7 = -1;
      var5 = var28;
      var29 = var6.hashCode();
      label143:
      if (var5 == null) {
         switch (var29) {
            case -1854418717:
               var29 = var6.equals("Random") ? 1 : 0;
               if (var5 != null) {
                  break label143;
               }

               if (var29 == 0) {
                  break;
               }

               var7 = 0;
               if (var5 == null) {
                  break;
               }
            case 1985170067:
               var29 = var6.equals("Alphabet") ? 1 : 0;
               if (var5 != null) {
                  break label143;
               }

               if (var29 == 0) {
                  break;
               }

               var7 = 1;
               if (var5 == null) {
                  break;
               }
            case -2022496506:
               var29 = var6.equals("Length") ? 1 : 0;
               if (var5 != null) {
                  break label143;
               }

               if (var29 != 0) {
                  var7 = 2;
               }
         }

         var29 = var7;
      }

      switch (var29) {
         case 0:
            long var30 = 9137257754450545666L;

            for (Category var11 : Category.values()) {
               if (var5 != null) {
                  return;
               }

               if (var5 == null && !var11.hidden) {
                  long var10001 = 9138324722087891805L;
                  Category var15 = var11;
                  var15.method_48$3f0615080b().clear();
                  var10001 = 9138324722087891805L;
                  Category var16 = var11;
                  List var31 = var16.method_48$3f0615080b();
                  var10002 = 9139548453403400140L;
                  Category var17 = var11;
                  var31.addAll(var17.method_47$3f0615080b());
               }

               if (var5 != null) {
                  break;
               }
            }

            if (var5 == null) {
               return;
            }
         case 1:
            long var32 = 9137257754450545666L;

            for (Category var26 : Category.values()) {
               if (var5 != null) {
                  return;
               }

               label99: {
                  Category var33 = var26;
                  if (var5 == null) {
                     if (var26.hidden) {
                        break label99;
                     }

                     var33 = var26;
                  }

                  long var37 = 9138324722087891805L;
                  Category var18 = var33;
                  var18.method_48$3f0615080b().sort(Comparator.comparing(recovery$indy$4()));
               }

               if (var5 != null) {
                  break;
               }
            }

            if (var5 == null) {
               return;
            }
         case 2:
            break;
         default:
            return;
      }

      long var34 = 9137257754450545666L;

      for (Category var27 : Category.values()) {
         label80: {
            Category var35 = var27;
            if (var5 == null) {
               if (var27.hidden) {
                  break label80;
               }

               var35 = var27;
            }

            long var38 = 9138324722087891805L;
            Category var19 = var35;
            var19.method_48$3f0615080b().sort(Comparator.comparingDouble(recovery$indy$5()));
         }

         if (var5 != null) {
            break;
         }
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$6(this, 8, var3, -7103288416295139289L, var1);
      recovery$indy$7(this, 40, var3, -7103288416295139289L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4;
      ClickGui_47QT var9;
      label29: {
         var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
         long var6 = var4 ^ 67244938694683L;
         int[] var8 = recovery$indy$8(2182263711097915625L, var4);
         boolean var10000 = recovery$indy$9(field_43, 2185854858867798181L, var4) instanceof ClickGuiScreen;
         if (var8 == null) {
            if (var10000) {
               return;
            }

            var9 = this;
            if (var8 != null) {
               break label29;
            }

            var10000 = recovery$indy$10(this, var6, 2185010758373200972L, var4);
         }

         if (!var10000) {
            return;
         }

         var9 = this;
      }

      recovery$indy$11(var9, 2184639316311839237L, var4);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$14(recovery$indy$13(recovery$indy$12(-7740255482438574157L, var1), -7740350038104970751L, var1), -7739514204749164139L, var1);
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      ClickGui_47QT var84;
      CompletableFuture var86;
      label154: {
         long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
         long var6 = var4 ^ 129438333898535L;
         long var8 = var4 ^ 21555015564904L;
         long var10 = var4 ^ 81973925598792L;
         long var12 = var4 ^ 56841354755714L;
         long var14 = var4 ^ 7668165369880L;
         long var16 = var4 ^ 47323076686017L;
         long var18 = var4 ^ 11654222961629L;
         long var20 = var4 ^ 30660129020958L;
         long var10000 = 2729367352373654337L;
         int[] var22 = AntiStrike_47Qa.method_42$d4d28024c9();
         Minecraft var83 = field_43;
         if (var22 == null) {
            long var10001 = 2737602553751554829L;
            Minecraft var23 = field_43;
            if (var23.field_44m instanceof C_47pS) {
               var84 = this;
               if (var22 != null) {
                  break label154;
               }

               var10001 = 2729278366682851576L;
               BooleanSetting var24 = this.settingOpenInInventory;
               if (!var24.method_49$aae029aa0a()) {
                  var84 = this;
                  break label154;
               }
            }

            var83 = field_43;
         }

         label145: {
            label146: {
               label131: {
                  if (var22 == null) {
                     long var100 = 2736420684858838210L;
                     Minecraft var26 = var83;
                     if (var26.field_42P == null) {
                        break label131;
                     }

                     var83 = field_43;
                  }

                  long var101 = 2736046903937141294L;
                  Minecraft var27 = var83;
                  label126:
                  if (var27.field_44Q != null) {
                     var84 = this;
                     if (var22 == null) {
                        label147: {
                           var86 = this.field_45;
                           if (var3 > 0) {
                              if (this.field_45 == null) {
                                 break label147;
                              }

                              var86 = this.field_45;
                           }

                           if (var22 != null) {
                              break label146;
                           }

                           if (!var86.isDone()) {
                              break label126;
                           }
                        }

                        var84 = this;
                     }

                     var84.field_45 = null;
                  }
               }

               var84 = this;
               if (var22 != null) {
                  break label145;
               }

               var86 = this.field_45;
            }

            if (var86 == null) {
               this.field_45 = CompletableFuture.runAsync(recovery$indy$15(this));
            }

            long var88 = 2730030141228461765L;
            Client var89 = Client.method_44$fbc0c0be91();
            long var102 = 2729979557449882487L;
            Client var28 = var89;
            C_47Kw var90 = var28.method_44$da60f75490();
            var102 = 2729653619323609315L;
            C_47Kw var29 = var90;
            var29.method_42$da8c82d5d4();
            long var91 = 2730030141228461765L;
            Client var92 = Client.method_44$fbc0c0be91();
            var102 = 2731368478220183268L;
            Client var30 = var92;
            C_47uT var93 = var30.method_42$a5d8eb8e7b();
            long var10002 = 2737236386945641670L;
            long var31 = var18;
            C_47uT var33 = var93;
            var33.method_45$e45a9973e5(var31);
            ModeSetting var94 = this.settingDescriptions;
            var102 = 2730030141228461765L;
            Client var106 = Client.method_44$fbc0c0be91();
            var10002 = 2738049598374117951L;
            Client var34 = var106;
            C_48F var107 = var34.method_45$0a14d890f9();
            long var10003 = 2736669040070634673L;
            long var35 = var10;
            C_48F var37 = var107;
            String[] var108 = var37.method_46$1cd68c4abd(var35);
            var10003 = 2738020607545657308L;
            long var38 = var16;
            String[] var40 = var108;
            ModeSetting var41 = var94;
            var41.method_42$7446cc8078(var40, var38);
            ModeSetting var95 = this.settingDescriptions;
            var102 = 2730030141228461765L;
            Client var110 = Client.method_44$fbc0c0be91();
            var10002 = 2738049598374117951L;
            Client var42 = var110;
            C_48F var111 = var42.method_45$0a14d890f9();
            long var10004 = 2736807719255053129L;
            long var43 = var14;
            ModeSetting var45 = this.settingDescriptions;
            String var131 = var45.method_46$5f9dc63072(var43);
            var10004 = 2730305664434034006L;
            ModeSetting var46 = this.settingDescriptions;
            String[] var146 = var46.method_43$44c5829186();
            long var10005 = 2736192633751551299L;
            String[] var47 = var146;
            long var48 = var20;
            String var50 = var131;
            C_48F var51 = var111;
            String var112 = var51.method_43$d4418b6a8e(var50, var48, var47);
            var10002 = 2736334867569692348L;
            String var52 = var112;
            ModeSetting var53 = var95;
            var53.method_49$a7421bf54c(var52);
            ModeSetting var96 = this.settingSettingNames;
            var102 = 2730030141228461765L;
            Client var114 = Client.method_44$fbc0c0be91();
            var10002 = 2737374237469637515L;
            Client var54 = var114;
            C_46P var115 = var54.method_41$6ea2d045c9();
            var10003 = 2738131420526192411L;
            long var55 = var6;
            C_46P var57 = var115;
            String[] var116 = var57.method_49$1cd68c4abd(var55);
            var10003 = 2738020607545657308L;
            long var58 = var16;
            String[] var60 = var116;
            ModeSetting var61 = var96;
            var61.method_42$7446cc8078(var60, var58);
            var84 = this;
         }

         ModeSetting var97 = var84.settingSettingNames;
         long var117 = 2730030141228461765L;
         Client var118 = Client.method_44$fbc0c0be91();
         long var134 = 2737374237469637515L;
         Client var62 = var118;
         C_46P var119 = var62.method_41$6ea2d045c9();
         long var147 = 2736807719255053129L;
         long var63 = var14;
         ModeSetting var65 = this.settingSettingNames;
         String var135 = var65.method_46$5f9dc63072(var63);
         var147 = 2730305664434034006L;
         ModeSetting var66 = this.settingSettingNames;
         String[] var144 = var66.method_43$44c5829186();
         long var149 = 2736854734315792388L;
         long var67 = var8;
         String[] var69 = var144;
         String var70 = var135;
         C_46P var71 = var119;
         String var120 = var71.method_43$cef9978adc(var70, var69, var67);
         var134 = 2736334867569692348L;
         String var72 = var120;
         ModeSetting var73 = var97;
         var73.method_49$a7421bf54c(var72);
         Minecraft var98 = field_43;
         int[] var121 = var22;
         if (var2 > 0) {
            if (var22 == null) {
               var117 = 2736420684858838210L;
               Minecraft var74 = field_43;
               if (var74.field_42P == null) {
                  return;
               }

               var98 = field_43;
            }

            var121 = var22;
         }

         if (var2 >= 0) {
            if (var121 == null) {
               var117 = 2736046903937141294L;
               Minecraft var75 = var98;
               if (var75.field_44Q == null) {
                  return;
               }

               var98 = field_43;
            }

            var121 = var22;
         }

         if (var121 == null) {
            label91: {
               var117 = 2737602553751554829L;
               var134 = var4;
               if (var3 > 0) {
                  Minecraft var76 = var98;
                  if (var76.field_44m == null) {
                     break label91;
                  }

                  var98 = field_43;
                  var117 = 2736420684858838210L;
                  var134 = var4;
               }

               recovery$indy$16(var98, var117, var134).method_47a$da8c82d5d4();
            }

            var134 = 2729489158326383004L;
            long var77 = var12;
            CustomCape_47He var79 = ClientGlobals.field_48.field_46Q;
            var79.method_40$e45a9973e5(var77);
            var98 = field_43;
         }

         var117 = 2730030141228461765L;
         Client var126 = Client.method_44$fbc0c0be91();
         var134 = 2735965375328179664L;
         Client var80 = var126;
         ClickGuiScreen var127 = var80.method_44$a6a538af3c();
         var134 = 2729712778263207800L;
         ClickGuiScreen var81 = var127;
         Minecraft var82 = var98;
         var82.method_43$7480b345ab(var81);
         return;
      }

      long var128 = 2736281535936113069L;
      ClickGui_47QT var25 = var84;
      var25.method_43W$da8c82d5d4();
   }

   public ClickGui_47QT(long var1) {
      super("ClickGui", "KlickbareGrafischeBenutzeroberfläche", (a ^ var1) ^ 117534714508711L, Color.BLACK, Category.RENDER);
      var1 = a ^ var1;
      long var10001 = var1 ^ 127159975187622L;
      int var3 = (int)((var1 ^ 127159975187622L) >>> 32);
      int var4 = (int)((var1 ^ 127159975187622L) << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      long var6 = var1 ^ 36634988954986L;
      long var8 = var1 ^ 105849153761627L;
      long var10 = var1 ^ 15881269635667L;
      long var12 = var1 ^ 30516502784444L;
      long var14 = var1 ^ 131454554526234L;
      long var16 = var1 ^ 60031262447163L;
      long var18 = var1 ^ 117534714508711L;
      // Super-constructor key is computed in the required first statement above.
      ModeSetting var42 = new ModeSetting(this, "Sorting", var6, "Alphabet", new String[]{"Random", "Length", "Alphabet"});
      C_477A var10002 = recovery$indy$17(this);
      long var10003 = 4327390321201882403L;
      C_477A var20 = var10002;
      ModeSetting var21 = var42;
      this.settingSorting = var21.method_42$977b7ac128(var20);
      BooleanSetting var43 = new BooleanSetting(this, var12, "GermanMode", false);
      C_477A var10004 = recovery$indy$18(this);
      byte var10005 = (byte)var5;
      long var10006 = 4327762981530935080L;
      byte var22 = var10005;
      C_477A var23 = var10004;
      int var24 = var4;
      int var25 = var3;
      BooleanSetting var26 = var43;
      this.settingGermanMode = (BooleanSetting)var26.method_45$bd7ddd925e(var25, var24, var23, var22);
      this.settingOpenInInventory = new BooleanSetting(this, var12, "OpenInInventory", true);
      ShaderOptions var44 = new ShaderOptions(var14, this, "ClickGui");
      long var53 = 4328632271520597058L;
      Color var27 = Color.black;
      long var28 = var10;
      ShaderOptions var30 = var44;
      this.settingClickGui = var30.method_44$10ed55120d(var28, var27);
      this.settingOutline = new BooleanSetting(this, var12, "Outline", true);
      this.settingAlpha = new NumberSetting(this, "Alpha", 200.0, var16, 0.0, 255.0, 0);
      this.settingDynamicKeyTime = new NumberSetting(this, "DynamicKeyTime", 500.0, var16, 0.0, 2000.0, 0);
      ModeSetting var45 = new ModeSetting(this, "Descriptions", var6, "Default", new String[]{"Default"});
      var10002 = recovery$indy$19(this);
      var10003 = 4327390321201882403L;
      C_477A var31 = var10002;
      ModeSetting var32 = var45;
      this.settingDescriptions = var32.method_42$977b7ac128(var31);
      ModeSetting var46 = new ModeSetting(this, "SettingNames", var6, "English_Default", new String[]{"English_Default", "English_New"});
      var10002 = recovery$indy$20(this);
      var10003 = 4327390321201882403L;
      C_477A var33 = var10002;
      ModeSetting var34 = var46;
      this.settingSettingNames = var34.method_42$977b7ac128(var33);
      this.settingModuleDescriptions = new BooleanSetting(this, var12, "ModuleDescriptions", true);
      this.settingSettingDescriptions = new BooleanSetting(this, var12, "SettingDescriptions", true);
      this.field_45 = null;
      var10003 = 4327251770717985805L;
      long var35 = var8;
      byte var37 = 54;
      ClickGui_47QT var38 = this;
      var38.method_48$51c0e5ba96(var37, var35);
      long var49 = 4328471774202958387L;
      boolean var39 = false;
      ClickGui_47QT var40 = this;
      var40.method_41$f633c984d8(var39);
   }

   // Build-time initializer only; the assembler restores the retained <clinit>.
   static { b = null; c = null; }


   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native Consumer recovery$indy$1();

   private static native Runnable recovery$indy$2(ClickGui_47QT var0);

   private static native Runnable recovery$indy$3(ClickGui_47QT var0);

   private static native Function recovery$indy$4();

   private static native ToDoubleFunction recovery$indy$5();

   private static native void recovery$indy$6(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$7(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$8(long var0, long var2);

   private static native GuiScreen recovery$indy$9(Object var0, long var1, long var3);

   private static native boolean recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$11(Object var0, long var1, long var3);

   private static native Client recovery$indy$12(long var0, long var2);

   private static native C_47Kw recovery$indy$13(Object var0, long var1, long var3);

   private static native void recovery$indy$14(Object var0, long var1, long var3);

   private static native Runnable recovery$indy$15(ClickGui_47QT var0);

   private static native EntityPlayerSP recovery$indy$16(Object var0, long var1, long var3);

   private static native C_477A recovery$indy$17(ClickGui_47QT var0);

   private static native C_477A recovery$indy$18(ClickGui_47QT var0);

   private static native C_477A recovery$indy$19(ClickGui_47QT var0);

   private static native C_477A recovery$indy$20(ClickGui_47QT var0);

   private static native MethodHandle recovery$constant$21();
}
