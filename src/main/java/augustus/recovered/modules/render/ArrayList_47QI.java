package augustus.recovered.modules.render;
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
import net.C_40t;
import net.C_45K;
import net.C_45n;
import client.render.RenderPass;
import net.C_477A;
import net.minecraft.client.gui.ScaledResolution;
import net.C_47Fw;
import net.minecraft.client.gui.FontRenderer;
import net.C_47LS;
import client.module.Module;
import net.C_47Pn;
import client.module.ModuleManager;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.C_47cu;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import net.C_47nb;
import client.ClientGlobals;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47uI;
import net.C_47xI;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ArrayList_47QI extends client.module.Module implements net.C_47xI,client.event.RenderListener {
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingXPos = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingYPos = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingSide = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingSorting = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingSuffix = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingCasing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingSuffixCasing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingSuffixColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingCustomSuffix = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingRandomColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingCustomColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBackgound = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingBackGroundColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingLine = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingLineGap = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCustomLineColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingLineColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions field_47W = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingFont = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBold = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingVerticalSpacing = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingScale = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingFontSize = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingFontShadow = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingToggleAnimation = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAnimationTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47Pn field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.minecraft.client.gui.FontRenderer field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static boolean field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

   private void method_46$da8c82d5d4() {
      long var1 = a ^ 130171893850651L;
      long var3 = var1 ^ 139701769456122L;
      long var5 = var1 ^ 81618146952149L;
      long var7 = var1 ^ 46798656859970L;
      long var10000 = -2403183493492293857L;
      int[] var9 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -2402933290044105575L;
      long var12 = var5;
      ModuleManager var14 = ClientGlobals.field_48;
      Iterator var10 = var14.method_46$04910bcb3f(var12).iterator();

      while (true) {
         if (var10.hasNext()) {
            Module var11 = (Module)var10.next();
            var10002 = -2402674863119740455L;
            long var15 = var7;
            Module var17 = var11;
            var17.method_43m$e45a9973e5(var15);
            if (var9 != null) {
               break;
            }

            if (var9 == null) {
               continue;
            }
         }

         var10002 = -2403487397561882590L;
         long var18 = var3;
         ModuleManager var20 = ClientGlobals.field_48;
         var20.method_41$e45a9973e5(var18);
         break;
      }
   }



    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   public void method_42$da8c82d5d4() {
      long var3;
      long var5;
      long var7;
      int[] var11;
      int var29;
      long var1 = a ^ 139840388088410L;
      var3 = var1 ^ 130042944399803L;
      var5 = var1 ^ 22698886441917L;
      var7 = var1 ^ 41779294237335L;
      long var9 = var1 ^ 28150451239705L;
      long var10002 = -4684031428250767632L;
      long var14 = var9;
      ModeSetting var16 = this.settingFont;
      String var12 = var16.method_46$5f9dc63072(var14);
      long var10000 = -4690740821692424354L;
      int[] var28 = AntiStrike_47Qa.method_42$d4d28024c9();
      byte var13 = -1;
      var11 = var28;
      var29 = var12.hashCode();
      label239:
      if (var11 == null) {
         switch (var29) {
            case 2015806707:
               var29 = (int) ((var12.equals("Verdana")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 0;
               if (var11 == null) {
                  break;
               }
            case -1841836187:
               var29 = (int) ((var12.equals("Roboto")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 1;
               if (var11 == null) {
                  break;
               }
            case 63529059:
               var29 = (int) ((var12.equals("Arial")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 2;
               if (var11 == null) {
                  break;
               }
            case 317902540:
               var29 = (int) ((var12.equals("Comfortaa")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 3;
               if (var11 == null) {
                  break;
               }
            case 69986:
               var29 = (int) ((var12.equals("Esp")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 4;
               if (var11 == null) {
                  break;
               }
            case 1868873829:
               var29 = (int) ((var12.equals("GoldBil")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 5;
               if (var11 == null) {
                  break;
               }
            case 71456692:
               var29 = (int) ((var12.equals("Jello")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 6;
               if (var11 == null) {
                  break;
               }
            case 176200194:
               var29 = (int) ((var12.equals("ProductSans")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 7;
               if (var11 == null) {
                  break;
               }
            case -2004328504:
               var29 = (int) ((var12.equals("MuseoSans")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 8;
               if (var11 == null) {
                  break;
               }
            case 64371980:
               var29 = (int) ((var12.equals("Borel")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 9;
               if (var11 == null) {
                  break;
               }
            case 79311809:
               var29 = (int) ((var12.equals("Rubik")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 10;
               if (var11 == null) {
                  break;
               }
            case -249030170:
               var29 = (int) ((var12.equals("RubikBold")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 11;
               if (var11 == null) {
                  break;
               }
            case -1797328664:
               var29 = (int) ((var12.equals("Tahoma")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 == 0) {
                  break;
               }

               var13 = 12;
               if (var11 == null) {
                  break;
               }
            case 952888205:
               var29 = (int) ((var12.equals("TahomaBold")) ? 1 : 0);
               if (var11 != null) {
                  break label239;
               }

               if (var29 != 0) {
                  var13 = 13;
               }
         }

         var29 = var13;
      }

      switch (var29) {
         case 0:
            this.field_48 = C_40t.field_46;
            if (var11 == null) {
               break;
            }
         case 1:
            this.field_48 = C_40t.field_49;
            if (var11 == null) {
               break;
            }
         case 2:
            this.field_48 = C_40t.field_42q;
            if (var11 == null) {
               break;
            }
         case 3:
            this.field_48 = C_40t.field_42L;
            if (var11 == null) {
               break;
            }
         case 4:
            this.field_48 = C_40t.field_42g;
            if (var11 == null) {
               break;
            }
         case 5:
            this.field_48 = C_40t.field_42T;
            if (var11 == null) {
               break;
            }
         case 6:
            this.field_48 = C_40t.field_42E;
            if (var11 == null) {
               break;
            }
         case 7:
            this.field_48 = C_40t.field_41;
            if (var11 == null) {
               break;
            }
         case 8:
            this.field_48 = C_40t.field_48;
            if (var11 == null) {
               break;
            }
         case 9:
            this.field_48 = C_40t.field_42A;
            if (var11 == null) {
               break;
            }
         case 10:
            this.field_48 = C_40t.field_427;
            if (var11 == null) {
               break;
            }
         case 11:
            this.field_48 = C_40t.field_42c;
            if (var11 == null) {
               break;
            }
         case 12:
            this.field_48 = C_40t.field_42B;
            if (var11 == null) {
               break;
            }
         case 13:
            this.field_48 = C_40t.field_40;
      }

      var10002 = -4691605425145755549L;
      long var17 = var3;
      ModuleManager var19 = ClientGlobals.field_48;
      var19.method_41$e45a9973e5(var17);
      C_47Pn var30 = this.field_48;
      long var10003 = -4691434355166931731L;
      long var20 = var7;
      NumberSetting var22 = this.settingFontSize;
      int var32 = (int)var22.method_44$474dfaa627(var20);
      var10003 = -4690879410481048232L;
      int var23 = var32;
      long var24 = var5;
      C_47Pn var26 = var30;
      var26.method_42$a2276b849d(var24, var23);
      long var10001 = -4683762840344760580L;
      ArrayList_47QI var27 = this;
      var27.method_46$da8c82d5d4();
   }






    private static native java.lang.reflect.Method d(long a0,long a1);

   public void onRender2D(int var1, float var2, char var3, int var4, net.minecraft.client.gui.ScaledResolution var5) {
        int var105;
        int[] var110;
        int[] var112;
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 21574113237242L;
      long var10 = var6 ^ 62665625052564L;
      long var12 = var6 ^ 133167456748533L;
      long var14 = var6 ^ 79469613767391L;
      long var16 = var6 ^ 51443450694620L;
      long var18 = var6 ^ 132989861136316L;
      long var20 = var6 ^ 91924420980846L;
      long var22 = var6 ^ 127696898216785L;
      long var24 = var6 ^ 69985357389437L;
      long var26 = var6 ^ 58032606781533L;
      long var10000 = 1634606187682854678L;
      int[] var28 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var28 == null) {
         long var10001 = 1632854093820087229L;
         net.minecraft.client.Minecraft var34 = field_43;
         if (!var34.field_44r.field_42N) {
            this.field_43h.clear();
            long var10003 = 1636662099796838072L;
            long var35 = var22;
            client.setting.ModeSetting var37 = this.settingToggleAnimation;
            boolean var108 = var37.method_46$5f9dc63072(var35).equals("None");
            if (var28 == null) {
               var108 = !var108;
            }

            this.field_43P = var108;
            long var10002 = 1636662099796838072L;
            long var38 = var22;
            client.setting.ModeSetting var40 = this.settingSide;
            boolean var29 = var40.method_46$5f9dc63072(var38).equals("Left");
            ArrayList_47QI var101 = this;
            if (var28 == null) {
               double var102 = this.field_43y;
               var10003 = 1633892931462151333L;
               long var41 = var14;
               client.setting.NumberSetting var43 = this.settingFontSize;
               if (var102 != var43.method_44$474dfaa627(var41)) {
                  net.C_47Pn var103 = this.field_48;
                  var10003 = 1633892931462151333L;
                  long var44 = var14;
                  client.setting.NumberSetting var46 = this.settingFontSize;
                  int var116 = (int)var46.method_44$474dfaa627(var44);
                  var10003 = 1634467731819592976L;
                  int var47 = var116;
                  long var48 = var12;
                  net.C_47Pn var50 = var103;
                  var50.method_42$a2276b849d(var48, var47);
                  var10001 = 1636921277404399284L;
                  ArrayList_47QI var51 = this;
                  var51.method_46$da8c82d5d4();
               }

               var10003 = 1633892931462151333L;
               long var52 = var14;
               client.setting.NumberSetting var54 = this.settingFontSize;
               this.field_43y = (int)var54.method_44$474dfaa627(var52);
               var101 = this;
            }

            var10002 = 1636662099796838072L;
            long var55 = var22;
            client.setting.ModeSetting var57 = var101.settingToggleAnimation;
            net.C_45K var30 = net.C_47nb.method_41$7498260812(var57.method_46$5f9dc63072(var55));
            var10002 = 1634371351609808016L;
            long var58 = var16;
            client.module.ModuleManager var60 = client.ClientGlobals.field_48;
            java.util.Iterator var31 = var60.method_46$04910bcb3f(var58).iterator();

            label144: {
               while (true) {
                  if (var31.hasNext()) {
                     client.module.Module var32 = (client.module.Module)var31.next();
                     var10002 = 1635945670565982444L;
                     long var61 = var24;
                     client.module.Module var63 = var32;
                     var105 = ((var63.method_40$0dd78e0064(var61)) ? 1 : 0);
                     var110 = var28;
                     if (var4 < 0 || var4 <= 0) {
                        break label144;
                     }

                     if (var28 != null) {
                        break;
                     }

                     int[] var111 = var28;
                     if (var3 > 0) {
                        if (var28 == null) {
                           if (var105 == 0) {
                              continue;
                           }

                           var105 = ((this.field_43a) ? 1 : 0);
                        }

                        var111 = var28;
                     }

                     label138: {
                        label137:
                        if (var111 == null) {
                           if (var105 != 0) {
                              var10002 = 1636519967616505154L;
                              long var64 = var8;
                              client.module.Module var66 = var32;
                              var105 = ((var66.method_46$0dd78e0064(var64)) ? 1 : 0);
                              var112 = var28;
                              if (var1 < 0) {
                                 break label138;
                              }

                              if (var28 != null) {
                                 break label137;
                              }

                              if (var105 != 0) {
                                 net.C_47nb var106 = var32.field_431;
                                 var10003 = 1633892931462151333L;
                                 long var67 = var14;
                                 client.setting.NumberSetting var69 = this.settingAnimationTime;
                                 int var113 = (int)var69.method_44$474dfaa627(var67);
                                 long var10005 = 1636519967616505154L;
                                 long var70 = var8;
                                 client.module.Module var72 = var32;
                                 byte var131 = ((byte) (var72.method_46$0dd78e0064(var70) ? 1 : 0));
                                 if (var28 == null) {
                                    var131 = (byte)(var131 != 0 ? 1 : 0);
                                 }

                                 var106.method_44$7c39c8007b(var113, var30, var131, false);
                              }
                           }

                           var105 = ((this.field_43P) ? 1 : 0);
                        }

                        var112 = var28;
                     }

                     label126: {
                        label153: {
                           if (var3 >= 0) {
                              if (var112 == null) {
                                 if (var105 == 0) {
                                    var10002 = 1636519967616505154L;
                                    long var73 = var8;
                                    client.module.Module var75 = var32;
                                    if (!var75.method_46$0dd78e0064(var73)) {
                                       break label126;
                                    }
                                    break label153;
                                 }

                                 double var137;
                                 var105 = (var137 = var32.field_431.method_48$fedcb3e4d3() - 1.0) == 0.0 ? 0 : (var137 < 0.0 ? -1 : 1);
                              }

                              var112 = var28;
                           }

                           if (var112 != null) {
                              break label126;
                           }

                           if (var105 >= 0) {
                              var10002 = 1636519967616505154L;
                              long var76 = var8;
                              client.module.Module var78 = var32;
                              if (var28 != null || !var78.method_46$0dd78e0064(var76)) {
                                 break label126;
                              }
                           }
                        }

                        this.field_43h.add(var32);
                     }

                     if (var28 == null) {
                        continue;
                     }
                  }

                  var10001 = 1633691702934472560L;
                  client.setting.BooleanSetting var79 = this.settingLine;
                  var105 = ((var79.method_49$aae029aa0a()) ? 1 : 0);
                  break;
               }

               var110 = var28;
            }

            if (var110 == null) {
               if (var105 != 0) {
                  var10003 = 1633892931462151333L;
                  long var80 = var14;
                  client.setting.NumberSetting var82 = this.settingLineWidth;
                  var105 = Math.max(0, (int)var82.method_44$474dfaa627(var80));
               } else {
                  var105 = 0;
               }
            }

            int var99 = var105;
            var10002 = 1633892931462151333L;
            long var83 = var14;
            client.setting.NumberSetting var85 = this.settingVerticalSpacing;
            int var100 = (int)var85.method_44$474dfaa627(var83);
            var10003 = 1633892931462151333L;
            long var86 = var14;
            client.setting.NumberSetting var88 = this.settingLineGap;
            int var33 = (int)Math.max(0.0, var88.method_44$474dfaa627(var86));
            this.field_43a = false;
            var10002 = 1632933440216764790L;
            long var89 = var10;
            client.setting.ShaderOptions var91 = this.field_47W;
            boolean var107 = var91.method_49$0dd78e0064(var89);
            var10003 = 1636285619783489422L;
            long var92 = var20;
            client.setting.ShaderOptions var94 = this.field_47W;
            boolean var115 = var94.method_47$0dd78e0064(var92);
            var10003 = 1634526744450687905L;
            net.C_47uI.method_40$9bd74f13d3(var107, var115, var18);
            net.C_47Fw var125 = (net.C_47Fw)recovery$indy$flow$159(this, var5, var100, var29, var99, var33);
            var10003 = 1636721726746405065L;
            net.C_47Fw var95 = var125;
            long var96 = var26;
            boolean var98 = false;
            net.C_47uI.method_42$300c7fd546(var98, var96, var95);
         }

         client.render.RenderUtils.method_41$da8c82d5d4();
      }
   }







   public static void method_48$f633c984d8(boolean var0) {
      field_49 = var0;
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 45320538955611L;
      long var3 = var1 ^ 87468815492632L;
      long var10000 = -2024805619213467041L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -2017704800773164047L;
      long var6 = var3;
      ModeSetting var8 = this.settingSuffix;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



    private void method_49$5f30b03ffc(final net.minecraft.client.gui.ScaledResolution scaledResolution, final int n, final boolean b, final int n2, final int n3, final client.render.RenderPass renderPass) {
        final long n4 = ArrayList_47QI.a ^ 0x725122C5F5B4L;
        final long n5 = n4 ^ 0x1641F24A040CL;
        final long n6 = n4 ^ 0x393514444CE7L;
        final long n7 = n4 ^ 0x28817D904579L;
        final long n8 = n4 ^ 0x14E44BC8CCF7L;
        final long n9 = n4 ^ 0x2558F149C879L;
        final int n10 = (int)(n9 >>> 32);
        final int n11 = (int)(n9 << 32 >>> 48);
        final int n12 = (int)(n9 << 48 >>> 48);
        final long n13 = n4 ^ 0x4C4B39C4BB91L;
        final int n14 = (int)(n13 >>> 32);
        final int n15 = (int)(n13 << 32 >>> 48);
        final int n16 = (int)(n13 << 48 >>> 48);
        org.lwjgl.opengl.GL11.glPushMatrix();
        final boolean equals = this.settingFont.method_46$5f9dc63072(n8).equals("Minecraft");
        final int[] method_42$d4d28024c9 = AntiStrike_47Qa.method_42$d4d28024c9();
        org.lwjgl.opengl.GL11.glScaled(1.0f / scaledResolution.method_40$8abf5c6871(), 1.0f / scaledResolution.method_40$8abf5c6871(), 1.0);
        final int[] array = method_42$d4d28024c9;
        org.lwjgl.opengl.GL11.glTranslated((int)(this.settingXPos.method_44$474dfaa627(n7) / 100.0 * ArrayList_47QI.field_43.field_44f), (int)(this.settingYPos.method_44$474dfaa627(n7) / 100.0 * ArrayList_47QI.field_43.field_44g), 0.0);
        final boolean b2 = equals;
        if (array == null) {
            if (b2) {
                org.lwjgl.opengl.GL11.glScaled(this.settingScale.method_44$474dfaa627(n7), this.settingScale.method_44$474dfaa627(n7), 1.0);
            }
            float method_49$bc607678b6 = (float)(int)(float)(((net.C_47LS.field_47 != 0.0f) ? 1 : 0) + net.C_47LS.field_47 * (1.0 / this.settingScale.method_44$474dfaa627(n7)));
            int n17 = 0;
            final boolean b3 = !this.settingSuffix.method_46$5f9dc63072(n8).equals("None");
            final int n18 = (equals ? this.field_44.field_47 : Math.round(this.field_48.method_44$bc607678b6())) + n * 2;
            if (this.settingBackgound.method_49$aae029aa0a()) {
                net.minecraft.client.renderer.GlStateManager.method_423$da8c82d5d4();
                net.minecraft.client.renderer.GlStateManager.method_421$da8c82d5d4();
                net.minecraft.client.renderer.GlStateManager.method_44$42cf812248(770, 771, 1, 0);
                if (renderPass == client.render.RenderPass.SHADOW) {
                    client.render.RenderUtils.method_40$3ebc9ac54d(this.field_47W.method_49$7ee0e11626(this.settingBackGroundColor.method_47$24af287d8f(n14, (short)n15, (char)n16, n17), n5), 1.0f);
                }
                else {
                    client.render.RenderUtils.method_43$d00df7729d(this.settingBackGroundColor.method_47$24af287d8f(n14, (short)n15, (char)n16, n17));
                }
                org.lwjgl.opengl.GL11.glBegin(7);
                final java.util.Iterator iterator = this.field_43h.iterator();
                while (iterator.hasNext()) {
                    final client.module.Module module = (client.module.Module)iterator.next();
                    int n19 = 0;
                    if (!b) {
                        n19 -= module.method_42$8abf5c6871();
                    }
                    if (this.field_43P) {
                        if (b) {
                            module.field_431.method_48$f2b6a9055b((float)(n19 - module.method_42$8abf5c6871()), method_49$bc607678b6 - n18, (float)n19, method_49$bc607678b6);
                        }
                        else {
                            module.field_431.method_48$f2b6a9055b((float)(n19 + module.method_42$8abf5c6871()), method_49$bc607678b6 - n18, (float)n19, method_49$bc607678b6);
                        }
                        n19 = (int)module.field_431.method_46$bc607678b6();
                    }
                    final int n20 = b ? n2 : (-n2);
                    client.render.RenderUtils.method_41$7ad4183c87(n19 - 3 + n20, method_49$bc607678b6 - n, n19 + module.method_42$8abf5c6871() + 3 + n20, method_49$bc607678b6 + n18 - n);
                    if (this.field_43P) {
                        method_49$bc607678b6 = module.field_431.method_49$bc607678b6();
                    }
                    method_49$bc607678b6 += n18;
                }
                org.lwjgl.opengl.GL11.glEnd();
                net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
                net.minecraft.client.renderer.GlStateManager.method_42z$da8c82d5d4();
            }
            if (renderPass == client.render.RenderPass.NONE || (renderPass == client.render.RenderPass.SHADOW && !this.settingBackgound.method_49$aae029aa0a())) {
                float n21 = (float)(int)(float)(((net.C_47LS.field_47 != 0.0f) ? 1 : 0) + net.C_47LS.field_47 * (1.0 / this.settingScale.method_44$474dfaa627(n7)));
                final java.util.Iterator iterator2 = this.field_43h.iterator();
                while (iterator2.hasNext()) {
                    final client.module.Module module2 = (client.module.Module)iterator2.next();
                    int n22 = this.settingCustomColor.method_47$24af287d8f(n14, (short)n15, (char)n16, n17);
                    int n23 = 0;
                    if (!b) {
                        n23 -= module2.method_42$8abf5c6871();
                    }
                    if (this.field_43P) {
                        if (b) {
                            module2.field_431.method_48$f2b6a9055b((float)(n23 - module2.method_42$8abf5c6871()), n21 - n18, (float)n23, n21);
                        }
                        else {
                            module2.field_431.method_48$f2b6a9055b((float)(n23 + module2.method_42$8abf5c6871()), n21 - n18, (float)n23, n21);
                        }
                        n23 = (int)module2.field_431.method_46$bc607678b6();
                        if (module2.field_431.method_45$fedcb3e4d3() == 1.0) {
                            n21 = module2.field_431.method_49$bc607678b6();
                        }
                    }
                    if (this.settingRandomColor.method_49$aae029aa0a()) {
                        n22 = module2.method_40$f87803cb87().getRGB();
                    }
                    if (this.settingLine.method_49$aae029aa0a()) {
                        net.minecraft.client.renderer.GlStateManager.method_46$da8c82d5d4();
                        int method_47$24af287d8f = n22;
                        if (this.settingCustomLineColor.method_49$aae029aa0a()) {
                            method_47$24af287d8f = this.settingLineColor.method_47$24af287d8f(n14, (short)n15, (char)n16, n17);
                        }
                        final int method_42$f6a9c2ec55 = this.field_47W.method_42$f6a9c2ec55(n6, renderPass, method_47$24af287d8f, n17);
                        if (b) {
                            client.render.RenderUtils.method_40$0f4d4a7a6c(n23 - 3, (int)n21 - n + n3, n23 + n2 - 3, (int)n21 + module2.method_40$8abf5c6871() + n - n3, method_42$f6a9c2ec55);
                        }
                        else {
                            client.render.RenderUtils.method_40$0f4d4a7a6c(n23 + module2.method_42$8abf5c6871() + 3, (int)n21 - n + n3, n23 + module2.method_42$8abf5c6871() - n2 + 3, (int)n21 + module2.method_40$8abf5c6871() + n - n3, method_42$f6a9c2ec55);
                        }
                    }
                    final int n24 = n23 + (b ? n2 : (-n2));
                    if (equals) {
                        if (b3) {
                            this.field_44.method_43$ea09a4674c(this.settingBold.method_49$aae029aa0a() ? ("§l" + module2.method_40$0e30dfc966()) : module2.method_40$0e30dfc966(), (float)n24, n21 + 1.0f, this.field_47W.method_42$f6a9c2ec55(n6, renderPass, n22, n17), this.settingFontShadow.method_49$aae029aa0a(), false, true);
                            final String method_47$0e30dfc966 = module2.method_47$0e30dfc966();
                            if (!method_47$0e30dfc966.isEmpty()) {
                                this.field_44.method_43$ea09a4674c(this.settingBold.method_49$aae029aa0a() ? ("§l" + method_47$0e30dfc966) : method_47$0e30dfc966, (float)(int)(n24 + module2.method_42$fedcb3e4d3()), n21 + 1.0f, this.field_47W.method_42$f6a9c2ec55(n6, renderPass, this.settingSuffixColor.method_47$24af287d8f(n14, (short)n15, (char)n16, n17), n17), this.settingFontShadow.method_49$aae029aa0a(), false, true);
                            }
                        }
                        else {
                            this.field_44.method_43$ea09a4674c(this.settingBold.method_49$aae029aa0a() ? ("§l" + module2.method_49$0e30dfc966()) : module2.method_49$0e30dfc966(), (float)n24, n21 + 1.0f, this.field_47W.method_42$f6a9c2ec55(n6, renderPass, n22, n17), this.settingFontShadow.method_49$aae029aa0a(), false, true);
                        }
                    }
                    else if (b3) {
                        this.field_48.method_45$8aa7b32ad9(module2.method_40$0e30dfc966(), n24, n10, (int)n21, this.field_47W.method_42$f6a9c2ec55(n6, renderPass, n22, n17), (short)n11, (short)n12, this.settingFontShadow.method_49$aae029aa0a());
                        final String method_47$0e30dfc967 = module2.method_47$0e30dfc966();
                        if (!method_47$0e30dfc967.isEmpty()) {
                            this.field_48.method_45$8aa7b32ad9(method_47$0e30dfc967, n24 + module2.method_42$fedcb3e4d3(), n10, (int)n21, this.field_47W.method_42$f6a9c2ec55(n6, renderPass, this.settingSuffixColor.method_47$24af287d8f(n14, (short)n15, (char)n16, n17), n17), (short)n11, (short)n12, this.settingFontShadow.method_49$aae029aa0a());
                        }
                    }
                    else {
                        this.field_48.method_45$8aa7b32ad9(module2.method_49$0e30dfc966(), n24, n10, (int)n21, this.field_47W.method_42$f6a9c2ec55(n6, renderPass, n22, n17), (short)n11, (short)n12, this.settingFontShadow.method_49$aae029aa0a());
                    }
                    ++n17;
                    if (this.field_43P) {
                        n21 = module2.field_431.method_49$bc607678b6();
                    }
                    n21 += n18;
                }
            }
            org.lwjgl.opengl.GL11.glPopMatrix();
            return;
        }
        final double n25 = (double)(b2 ? 1 : 0);
        final double n26 = net.C_47LS.field_47;
        this.settingScale.method_44$474dfaa627(n7);
        final int n27 = 0;
        this.settingSuffix.method_46$5f9dc63072(n8).equals("None");
        client.render.RenderUtils.method_43$d00df7729d(this.settingBackgound.method_49$aae029aa0a() ? 1 : 0);
        org.lwjgl.opengl.GL11.glBegin(7);
        final java.util.Iterator iterator3 = this.field_43h.iterator();
        Label_0688: {
            boolean method_49$aae029aa0a;
            if (iterator3.hasNext()) {
                final client.module.Module module3 = (client.module.Module)iterator3.next();
                method_49$aae029aa0a = b;
            }
            else {
                org.lwjgl.opengl.GL11.glEnd();
                net.minecraft.client.renderer.GlStateManager.method_42y$da8c82d5d4();
                net.minecraft.client.renderer.GlStateManager.method_42z$da8c82d5d4();
                if (renderPass != client.render.RenderPass.NONE) {
                    break Label_0688;
                }
                method_49$aae029aa0a = this.settingBackgound.method_49$aae029aa0a();
            }
            final double n28 = (double)(method_49$aae029aa0a ? 1 : 0);
            final double n29 = net.C_47LS.field_47;
            this.settingScale.method_44$474dfaa627(n7);
            final java.util.Iterator iterator4 = this.field_43h.iterator();
            if (iterator4.hasNext()) {
                final client.module.Module module4 = (client.module.Module)iterator4.next();
                this.settingCustomColor.method_47$24af287d8f(n14, (short)n15, (char)n16, n27);
                return;
            }
        }
        org.lwjgl.opengl.GL11.glPopMatrix();
    }
















   public C_47Pn method_49$76f7d9e368() {
      return this.field_48;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 3813049511913L;
      long var3 = var1 ^ 111886624036522L;
      long var10002 = -3220770397640817853L;
      long var5 = var3;
      ModeSetting var7 = this.settingFont;
      return var7.method_46$5f9dc63072(var5).equals("Minecraft");
   }



   private void method_43$da8c82d5d4() {
      this.field_43a = true;
   }



   private boolean method_48p$aae029aa0a() {
      long var1 = a ^ 62679034240581L;
      long var10000 = -2091814008542526655L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -2091039782494309593L;
      BooleanSetting var4 = this.settingRandomColor;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$2(this, 11, var5, -7101520412413519379L, var1);
      recovery$indy$3(this, 32, 1, var3, -7102740851649451405L, var1);
   }



   private boolean method_48l$aae029aa0a() {
      long var1 = a ^ 57361504820374L;
      long var3 = var1 ^ 90842535781845L;
      long var10000 = -6905303455289622126L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -6903260394413952964L;
      long var6 = var3;
      ModeSetting var8 = this.settingToggleAnimation;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_48L$aae029aa0a() {
      long var1 = a ^ 106987598933005L;
      long var3 = var1 ^ 8764230554958L;
      long var10000 = -8020846676775964407L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -8022630188281708377L;
      long var6 = var3;
      ModeSetting var8 = this.settingFont;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("Minecraft");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   public void method_41T$e45a9973e5(long var1) {
      long var3 = var1 ^ 58119816065715L;
      recovery$indy$4(ClientGlobals.field_48, var3, -6490721561772272789L, var1);
   }



   private boolean method_48n$aae029aa0a() {
      long var1 = a ^ 21788367103464L;
      long var3 = var1 ^ 129079184235691L;
      long var10002 = 6434683738127403330L;
      long var5 = var3;
      ModeSetting var7 = this.settingFont;
      return var7.method_46$5f9dc63072(var5).equals("Minecraft");
   }



   private static boolean method_48W$aae029aa0a() {
      return false;
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_43h.clear();
   }



   public static boolean method_48Z$aae029aa0a() {
      boolean var0 = method_48f$aae029aa0a();
      return !var0;
   }



   private boolean method_489$aae029aa0a() {
      long var1 = a ^ 130664087556753L;
      long var3 = var1 ^ 18021473790930L;
      long var10000 = -1284601306371649643L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -1281850504091615685L;
      long var6 = var3;
      ModeSetting var8 = this.settingSuffix;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_483$aae029aa0a() {
      long var1 = a ^ 37376742981275L;
      long var10000 = 154946211207308191L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 154594196988728313L;
      BooleanSetting var4 = this.settingLine;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 154594196988728313L;
         BooleanSetting var5 = this.settingCustomLineColor;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }



   public static boolean method_48f$aae029aa0a() {
      return field_49;
   }



   private static boolean method_48B$aae029aa0a() {
      return false;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      this.field_43a = true;
      recovery$indy$5(this, 2730122459041328431L, var4);
      recovery$indy$6(this, 2737891567912351229L, var4);
   }



    public ArrayList_47QI(long a0) {
        super((java.lang.String) ("ArrayList"),(java.lang.String) ("Modulliste"),(long) (((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 69378620647613L)),(java.awt.Color) (java.awt.Color.CYAN),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.ArrayList_47QI.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 79080673517979L);
        long constructorKey4 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 40436584743940L);
        long constructorKey5 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 76507153454803L);
        long constructorKey6 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 86028122535078L);
        long constructorKey7 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 46925407188099L);
        int constructorPart8 = (int) ((((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 42169797134780L) >>> 32));
        int constructorPart9 = (int) (((((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 42169797134780L) << 32) >>> 40));
        int constructorPart10 = (int) (((((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 42169797134780L) << 56) >>> 56));
        long constructorKey11 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 57009342829502L);
        long constructorKey12 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 128288146135152L);
        long constructorKey13 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 100663087249225L);
        long constructorKey14 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 82373858215072L);
        long constructorKey15 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 109288814218017L);
        long constructorKey16 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 48111031452832L);
        long constructorKey17 = ((augustus.recovered.modules.render.ArrayList_47QI.a ^ a0) ^ 117877008364608L);
        java.util.ArrayList initialized18 = new java.util.ArrayList();
        recovery$indy$flow$496(this, initialized18);
        recovery$indy$flow$497(this, false);
        client.setting.NumberSetting initialized19 = new client.setting.NumberSetting(this, "X-Pos", Double.longBitsToDouble(4636737291354636288L), constructorKey15, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        recovery$indy$flow$500(this, initialized19);
        client.setting.NumberSetting initialized20 = new client.setting.NumberSetting(this, "Y-Pos", 0.0D, constructorKey15, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        recovery$indy$flow$503(this, initialized20);
        java.lang.Object initialValue21 = recovery$indy$flow$505(2);
        ((java.lang.Object[]) initialValue21)[0] = "Left";
        ((java.lang.Object[]) initialValue21)[1] = "Right";
        client.setting.ModeSetting initialized22 = new client.setting.ModeSetting(this, "Side", constructorKey12, "Right", (java.lang.String[]) (initialValue21));
        recovery$indy$flow$507(this, initialized22);
        java.lang.Object initialValue23 = recovery$indy$flow$509(2);
        ((java.lang.Object[]) initialValue23)[0] = "Alphabet";
        ((java.lang.Object[]) initialValue23)[1] = "Length";
        client.setting.ModeSetting initialized24 = new client.setting.ModeSetting(this, "Sorting", constructorKey12, "Length", (java.lang.String[]) (initialValue23));
        recovery$indy$flow$511(this, initialized24);
        java.lang.Object initialValue25 = recovery$indy$flow$513(6);
        ((java.lang.Object[]) initialValue25)[0] = "None";
        ((java.lang.Object[]) initialValue25)[1] = "Simple";
        ((java.lang.Object[]) initialValue25)[2] = "Dash";
        ((java.lang.Object[]) initialValue25)[3] = "Bracket";
        ((java.lang.Object[]) initialValue25)[4] = "Colon";
        ((java.lang.Object[]) initialValue25)[5] = "Custom";
        client.setting.ModeSetting initialized26 = new client.setting.ModeSetting(this, "Suffix", constructorKey12, "Dash", (java.lang.String[]) (initialValue25));
        recovery$indy$flow$515(this, initialized26);
        java.lang.Object initialValue27 = recovery$indy$flow$517(3);
        ((java.lang.Object[]) initialValue27)[0] = "Default";
        ((java.lang.Object[]) initialValue27)[1] = "UpperCase";
        ((java.lang.Object[]) initialValue27)[2] = "LowerCase";
        client.setting.ModeSetting initialized28 = new client.setting.ModeSetting(this, "Casing", constructorKey12, "Default", (java.lang.String[]) (initialValue27));
        java.lang.Object initialValue29 = recovery$indy$flow$519(this);
        java.lang.Object initialValue30 = initialValue29;
        client.setting.ModeSetting initialValue31 = initialized28;
        java.lang.Object initialValue32 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue33 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue34 = recovery$indy$flow$522(initialValue32, initialValue33);
        recovery$indy$flow$523(this, initialValue34);
        java.lang.Object initialValue35 = recovery$indy$flow$525(3);
        ((java.lang.Object[]) initialValue35)[0] = "Default";
        ((java.lang.Object[]) initialValue35)[1] = "UpperCase";
        ((java.lang.Object[]) initialValue35)[2] = "LowerCase";
        client.setting.ModeSetting initialized36 = new client.setting.ModeSetting(this, "SuffixCasing", constructorKey12, "Default", (java.lang.String[]) (initialValue35));
        java.lang.Object initialValue37 = recovery$indy$flow$527(this);
        java.lang.Object initialValue38 = initialValue37;
        client.setting.ModeSetting initialValue39 = initialized36;
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue39))))));
        java.lang.Object initialValue41 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue42 = recovery$indy$flow$530(initialValue40, initialValue41);
        java.lang.Object initialValue43 = recovery$indy$flow$531(this);
        java.lang.Object initialValue44 = initialValue43;
        java.lang.Object initialValue45 = initialValue42;
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue47 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue44))))));
        java.lang.Object initialValue48 = recovery$indy$flow$534(initialValue46, initialValue47);
        recovery$indy$flow$535(this, initialValue48);
        java.lang.Object initialValue49 = recovery$indy$flow$537();
        client.setting.ColorSetting initialized50 = new client.setting.ColorSetting(constructorKey7, this, "SuffixColor", (java.awt.Color) (initialValue49));
        java.lang.Object initialValue51 = recovery$indy$flow$539(this);
        java.lang.Object initialValue52 = initialValue51;
        long initialValue53 = constructorKey3;
        client.setting.ColorSetting initialValue54 = initialized50;
        java.lang.Object initialValue55 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue54))))));
        java.lang.Object initialValue56 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue52))))));
        java.lang.Object initialValue57 = recovery$indy$flow$542(initialValue55, initialValue53, initialValue56);
        java.lang.Object initialValue58 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue57))))));
        recovery$indy$flow$544(this, initialValue58);
        java.lang.Object initialValue59 = recovery$indy$flow$546(1);
        ((java.lang.Object[]) initialValue59)[0] = "";
        client.setting.ModeSetting initialized60 = new client.setting.ModeSetting(this, "CustomSuffix", constructorKey12, "", (java.lang.String[]) (initialValue59));
        java.lang.Object initialValue61 = recovery$indy$flow$548();
        java.lang.Object initialValue62 = initialValue61;
        client.setting.ModeSetting initialValue63 = initialized60;
        java.lang.Object initialValue64 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue63))))));
        java.lang.Object initialValue65 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue62))))));
        java.lang.Object initialValue66 = recovery$indy$flow$551(initialValue64, initialValue65);
        recovery$indy$flow$552(this, initialValue66);
        client.setting.BooleanSetting initialized67 = new client.setting.BooleanSetting(this, constructorKey6, "RandomColor", false);
        recovery$indy$flow$555(this, initialized67);
        java.lang.Object initialValue68 = recovery$indy$flow$557();
        java.lang.Object initialValue69 = initialValue68;
        java.lang.Object initialValue70 = ((java.lang.Object)(((client.Client) (((java.lang.Object)(initialValue69))))));
        java.lang.Object initialValue71 = recovery$indy$flow$559(initialValue70);
        client.setting.ColorSetting initialized72 = new client.setting.ColorSetting(constructorKey7, this, "CustomColor", (java.awt.Color) (initialValue71));
        java.lang.Object initialValue73 = recovery$indy$flow$561(this);
        java.lang.Object initialValue74 = initialValue73;
        long initialValue75 = constructorKey3;
        client.setting.ColorSetting initialValue76 = initialized72;
        java.lang.Object initialValue77 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue76))))));
        java.lang.Object initialValue78 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue79 = recovery$indy$flow$564(initialValue77, initialValue75, initialValue78);
        java.lang.Object initialValue80 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue79))))));
        int initialValue81 = 1;
        long initialValue82 = constructorKey16;
        java.lang.Object initialValue83 = initialValue80;
        java.lang.Object initialValue84 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue83))))));
        java.lang.Object initialValue85 = recovery$indy$flow$567(initialValue84, initialValue82, (initialValue81 != 0));
        java.awt.Color initialized86 = new java.awt.Color(1, 254, 177);
        long initialValue87 = constructorKey17;
        java.awt.Color initialValue88 = initialized86;
        java.lang.Object initialValue89 = initialValue85;
        java.lang.Object initialValue90 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue89))))));
        java.lang.Object initialValue91 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue88))))));
        java.lang.Object initialValue92 = recovery$indy$flow$572(initialValue90, initialValue91, initialValue87);
        int initialValue93 = 50;
        long initialValue94 = constructorKey14;
        java.lang.Object initialValue95 = initialValue92;
        java.lang.Object initialValue96 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue95))))));
        java.lang.Object initialValue97 = recovery$indy$flow$574(initialValue96, initialValue94, initialValue93);
        long initialValue98 = constructorKey11;
        int initialValue99 = 43;
        java.lang.Object initialValue100 = initialValue97;
        java.lang.Object initialValue101 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue100))))));
        java.lang.Object initialValue102 = recovery$indy$flow$576(initialValue101, initialValue99, initialValue98);
        recovery$indy$flow$577(this, initialValue102);
        client.setting.BooleanSetting initialized103 = new client.setting.BooleanSetting(this, constructorKey6, "Backgound", true);
        long initialValue104 = constructorKey5;
        java.lang.String initialValue105 = "BackGround";
        client.setting.BooleanSetting initialValue106 = initialized103;
        java.lang.Object initialValue107 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue106))))));
        java.lang.Object initialValue108 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue105))))));
        java.lang.Object initialValue109 = recovery$indy$flow$582(initialValue107, initialValue108, initialValue104);
        java.lang.Object initialValue110 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue109))))));
        recovery$indy$flow$584(this, initialValue110);
        java.awt.Color initialized111 = new java.awt.Color(0, 0, 0, 119);
        client.setting.ColorSetting initialized112 = new client.setting.ColorSetting(constructorKey7, this, "BackGroundColor", initialized111);
        java.lang.Object initialValue113 = ((java.lang.Object)(((augustus.recovered.modules.render.ArrayList_47QI) (((java.lang.Object)(this)))).settingBackgound));
        java.lang.Object initialValue114 = recovery$indy$flow$590(initialValue113);
        java.lang.Object initialValue115 = recovery$indy$flow$591(initialValue113);
        java.lang.Object initialValue116 = initialValue115;
        long initialValue117 = constructorKey3;
        client.setting.ColorSetting initialValue118 = initialized112;
        java.lang.Object initialValue119 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue118))))));
        java.lang.Object initialValue120 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue116))))));
        java.lang.Object initialValue121 = recovery$indy$flow$594(initialValue119, initialValue117, initialValue120);
        java.lang.Object initialValue122 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue121))))));
        recovery$indy$flow$596(this, initialValue122);
        client.setting.BooleanSetting initialized123 = new client.setting.BooleanSetting(this, constructorKey6, "Line", false);
        recovery$indy$flow$599(this, initialized123);
        client.setting.NumberSetting initialized124 = new client.setting.NumberSetting(this, "LineWidth", Double.longBitsToDouble(4613937818241073152L), constructorKey15, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue125 = ((java.lang.Object)(((augustus.recovered.modules.render.ArrayList_47QI) (((java.lang.Object)(this)))).settingLine));
        java.lang.Object initialValue126 = recovery$indy$flow$603(initialValue125);
        java.lang.Object initialValue127 = recovery$indy$flow$604(initialValue125);
        java.lang.Object initialValue128 = initialValue127;
        client.setting.NumberSetting initialValue129 = initialized124;
        java.lang.Object initialValue130 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue129))))));
        java.lang.Object initialValue131 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue128))))));
        java.lang.Object initialValue132 = recovery$indy$flow$607(initialValue130, initialValue131);
        recovery$indy$flow$608(this, initialValue132);
        client.setting.NumberSetting initialized133 = new client.setting.NumberSetting(this, "LineGap", 0.0D, constructorKey15, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue134 = ((java.lang.Object)(((augustus.recovered.modules.render.ArrayList_47QI) (((java.lang.Object)(this)))).settingLine));
        java.lang.Object initialValue135 = recovery$indy$flow$612(initialValue134);
        java.lang.Object initialValue136 = recovery$indy$flow$613(initialValue134);
        java.lang.Object initialValue137 = initialValue136;
        client.setting.NumberSetting initialValue138 = initialized133;
        java.lang.Object initialValue139 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue138))))));
        java.lang.Object initialValue140 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue137))))));
        java.lang.Object initialValue141 = recovery$indy$flow$616(initialValue139, initialValue140);
        recovery$indy$flow$617(this, initialValue141);
        client.setting.BooleanSetting initialized142 = new client.setting.BooleanSetting(this, constructorKey6, "CustomLineColor", false);
        java.lang.Object initialValue143 = ((java.lang.Object)(((augustus.recovered.modules.render.ArrayList_47QI) (((java.lang.Object)(this)))).settingLine));
        java.lang.Object initialValue144 = recovery$indy$flow$621(initialValue143);
        java.lang.Object initialValue145 = recovery$indy$flow$622(initialValue143);
        java.lang.Object initialValue146 = initialValue145;
        long initialValue147 = constructorKey3;
        client.setting.BooleanSetting initialValue148 = initialized142;
        java.lang.Object initialValue149 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue148))))));
        java.lang.Object initialValue150 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue146))))));
        java.lang.Object initialValue151 = recovery$indy$flow$625(initialValue149, initialValue147, initialValue150);
        java.lang.Object initialValue152 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue151))))));
        recovery$indy$flow$627(this, initialValue152);
        java.lang.Object initialValue153 = recovery$indy$flow$629();
        client.setting.ColorSetting initialized154 = new client.setting.ColorSetting(constructorKey7, this, "LineColor", (java.awt.Color) (initialValue153));
        java.lang.Object initialValue155 = recovery$indy$flow$631(this);
        java.lang.Object initialValue156 = initialValue155;
        long initialValue157 = constructorKey3;
        client.setting.ColorSetting initialValue158 = initialized154;
        java.lang.Object initialValue159 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue158))))));
        java.lang.Object initialValue160 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue156))))));
        java.lang.Object initialValue161 = recovery$indy$flow$634(initialValue159, initialValue157, initialValue160);
        java.lang.Object initialValue162 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue161))))));
        recovery$indy$flow$636(this, initialValue162);
        client.setting.ShaderOptions initialized163 = new client.setting.ShaderOptions(this, constructorKey4);
        java.lang.Object initialValue164 = recovery$indy$flow$639();
        java.lang.Object initialValue165 = initialValue164;
        java.lang.Object initialValue166 = ((java.lang.Object)(((client.Client) (((java.lang.Object)(initialValue165))))));
        java.lang.Object initialValue167 = recovery$indy$flow$641(initialValue166);
        java.lang.Object initialValue168 = initialValue167;
        long initialValue169 = constructorKey13;
        client.setting.ShaderOptions initialValue170 = initialized163;
        java.lang.Object initialValue171 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue170))))));
        java.lang.Object initialValue172 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue168))))));
        java.lang.Object initialValue173 = recovery$indy$flow$644(initialValue171, initialValue169, initialValue172);
        recovery$indy$flow$645(this, initialValue173);
        java.lang.Object initialValue174 = recovery$indy$flow$647(15);
        ((java.lang.Object[]) initialValue174)[0] = "Minecraft";
        ((java.lang.Object[]) initialValue174)[1] = "Verdana";
        ((java.lang.Object[]) initialValue174)[2] = "Arial";
        ((java.lang.Object[]) initialValue174)[3] = "Roboto";
        ((java.lang.Object[]) initialValue174)[4] = "Comfortaa";
        ((java.lang.Object[]) initialValue174)[5] = "Esp";
        ((java.lang.Object[]) initialValue174)[6] = "GoldBil";
        ((java.lang.Object[]) initialValue174)[7] = "Jello";
        ((java.lang.Object[]) initialValue174)[8] = "ProductSans";
        ((java.lang.Object[]) initialValue174)[9] = "MuseoSans";
        ((java.lang.Object[]) initialValue174)[10] = "Borel";
        ((java.lang.Object[]) initialValue174)[11] = "Rubik";
        ((java.lang.Object[]) initialValue174)[12] = "RubikBold";
        ((java.lang.Object[]) initialValue174)[13] = "Tahoma";
        ((java.lang.Object[]) initialValue174)[14] = "TahomaBold";
        client.setting.ModeSetting initialized175 = new client.setting.ModeSetting(this, "Font", constructorKey12, "Minecraft", (java.lang.String[]) (initialValue174));
        java.lang.Object initialValue176 = recovery$indy$flow$649(this);
        java.lang.Object initialValue177 = initialValue176;
        client.setting.ModeSetting initialValue178 = initialized175;
        java.lang.Object initialValue179 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue178))))));
        java.lang.Object initialValue180 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue177))))));
        java.lang.Object initialValue181 = recovery$indy$flow$652(initialValue179, initialValue180);
        recovery$indy$flow$653(this, initialValue181);
        client.setting.BooleanSetting initialized182 = new client.setting.BooleanSetting(this, constructorKey6, "Bold", false);
        java.lang.Object initialValue183 = recovery$indy$flow$656(this);
        java.lang.Object initialValue184 = initialValue183;
        long initialValue185 = constructorKey3;
        client.setting.BooleanSetting initialValue186 = initialized182;
        java.lang.Object initialValue187 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue186))))));
        java.lang.Object initialValue188 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue184))))));
        java.lang.Object initialValue189 = recovery$indy$flow$659(initialValue187, initialValue185, initialValue188);
        java.lang.Object initialValue190 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue189))))));
        java.lang.Object initialValue191 = recovery$indy$flow$661(this);
        byte converted192 = (byte) (constructorPart10);
        int initialValue193 = (int) (converted192);
        java.lang.Object initialValue194 = initialValue191;
        int initialValue195 = constructorPart9;
        int initialValue196 = constructorPart8;
        java.lang.Object initialValue197 = initialValue190;
        java.lang.Object initialValue198 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue197))))));
        java.lang.Object initialValue199 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue194))))));
        java.lang.Object initialValue200 = recovery$indy$flow$664(initialValue198, initialValue196, initialValue195, initialValue199, (byte) (initialValue193));
        java.lang.Object initialValue201 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue200))))));
        recovery$indy$flow$666(this, initialValue201);
        client.setting.NumberSetting initialized202 = new client.setting.NumberSetting(this, "VerticalSpacing", 1.0D, constructorKey15, Double.longBitsToDouble(-4606056518893174784L), Double.longBitsToDouble(4617315517961601024L), 0);
        recovery$indy$flow$669(this, initialized202);
        client.setting.NumberSetting initialized203 = new client.setting.NumberSetting(this, "Scale", Double.longBitsToDouble(4611686018427387904L), constructorKey15, Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4616189618054758400L), 2);
        java.lang.Object initialValue204 = recovery$indy$flow$672(this);
        java.lang.Object initialValue205 = initialValue204;
        client.setting.NumberSetting initialValue206 = initialized203;
        java.lang.Object initialValue207 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue206))))));
        java.lang.Object initialValue208 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue205))))));
        java.lang.Object initialValue209 = recovery$indy$flow$675(initialValue207, initialValue208);
        recovery$indy$flow$676(this, initialValue209);
        client.setting.NumberSetting initialized210 = new client.setting.NumberSetting(this, "FontSize", Double.longBitsToDouble(4625196817309499392L), constructorKey15, Double.longBitsToDouble(4625196817309499392L), Double.longBitsToDouble(4635329916471083008L), 0);
        java.lang.Object initialValue211 = recovery$indy$flow$679(this);
        java.lang.Object initialValue212 = initialValue211;
        client.setting.NumberSetting initialValue213 = initialized210;
        java.lang.Object initialValue214 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue213))))));
        java.lang.Object initialValue215 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue212))))));
        java.lang.Object initialValue216 = recovery$indy$flow$682(initialValue214, initialValue215);
        recovery$indy$flow$683(this, initialValue216);
        client.setting.BooleanSetting initialized217 = new client.setting.BooleanSetting(this, constructorKey6, "FontShadow", true);
        recovery$indy$flow$686(this, initialized217);
        java.lang.Object initialValue218 = recovery$indy$flow$688(true);
        client.setting.ModeSetting initialized219 = new client.setting.ModeSetting(this, "ToggleAnimation", constructorKey12, "easeInOutBack", (java.lang.String[]) (initialValue218));
        java.lang.Object initialValue220 = recovery$indy$flow$690(this);
        java.lang.Object initialValue221 = initialValue220;
        client.setting.ModeSetting initialValue222 = initialized219;
        java.lang.Object initialValue223 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue222))))));
        java.lang.Object initialValue224 = ((java.lang.Object)(((net.C_477A) (((java.lang.Object)(initialValue221))))));
        java.lang.Object initialValue225 = recovery$indy$flow$693(initialValue223, initialValue224);
        recovery$indy$flow$694(this, initialValue225);
        client.setting.NumberSetting initialized226 = new client.setting.NumberSetting(this, "AnimationTime", Double.longBitsToDouble(4647785184190529536L), constructorKey15, 0.0D, Double.longBitsToDouble(4656510908468559872L), 0);
        java.lang.Object initialValue227 = recovery$indy$flow$697(this);
        java.lang.Object initialValue228 = initialValue227;
        client.setting.NumberSetting initialValue229 = initialized226;
        java.lang.Object initialValue230 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue229))))));
        java.lang.Object initialValue231 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue228))))));
        java.lang.Object initialValue232 = recovery$indy$flow$700(initialValue230, initialValue231);
        recovery$indy$flow$701(this, initialValue232);
        java.lang.Object initialValue233 = recovery$indy$flow$702();
        recovery$indy$flow$703(this, initialValue233);
        recovery$indy$flow$704(this, true);
        recovery$indy$flow$705(this, 0);
        net.C_47cu initialized234 = new net.C_47cu();
        recovery$indy$flow$708(this, initialized234);
        java.lang.Object initialValue235 = ((java.lang.Object)(((augustus.recovered.modules.render.ArrayList_47QI) (((java.lang.Object)(this)))).settingCustomSuffix));
        java.lang.Object initialValue236 = recovery$indy$flow$710();
        java.lang.Object initialValue237 = initialValue236;
        java.lang.Object initialValue238 = initialValue235;
        java.lang.Object initialValue239 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue238))))));
        java.lang.Object initialValue240 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue237))))));
        java.lang.Object initialValue241 = recovery$indy$flow$713(initialValue239, initialValue240);
        java.lang.Object initialValue242 = recovery$indy$flow$714();
        java.lang.Object initialValue243 = initialValue242;
        java.lang.Object initialValue244 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(initialValue243))))));
        java.lang.Object initialValue245 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(initialValue244)))).field_42N));
        recovery$indy$flow$717(this, initialValue245);
    }











    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$159(java.lang.Object a0,java.lang.Object a1,int a2,boolean a3,int a4,int a5);
    private static native void recovery$indy$flow$496(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$497(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.render.ArrayList_47QI) (a0)).field_43a = a1;
        return;
    }
    private static native void recovery$indy$flow$500(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$503(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$505(int a0);
    private static native void recovery$indy$flow$507(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$509(int a0);
    private static native void recovery$indy$flow$511(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$513(int a0);
    private static native void recovery$indy$flow$515(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$517(int a0);
    private static native java.lang.Object recovery$indy$flow$519(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$522(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$523(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$525(int a0);
    private static native java.lang.Object recovery$indy$flow$527(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$530(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$531(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$534(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$535(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$537() {
        return java.awt.Color.white;
    }
    private static native java.lang.Object recovery$indy$flow$539(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$542(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$544(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$546(int a0);
    private static native java.lang.Object recovery$indy$flow$548();


    private static native java.lang.Object recovery$indy$flow$551(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$552(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$555(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$557();

    private static native java.lang.Object recovery$indy$flow$559(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$561(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$564(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$567(java.lang.Object a0,long a1,boolean a2);


    private static native java.lang.Object recovery$indy$flow$572(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native java.lang.Object recovery$indy$flow$574(java.lang.Object a0,long a1,int a2);

    private static native java.lang.Object recovery$indy$flow$576(java.lang.Object a0,int a1,long a2);
    private static native void recovery$indy$flow$577(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$582(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$584(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$590(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$591(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$594(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$596(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$599(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$603(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$604(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$607(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$608(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$612(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$613(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$616(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$617(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$621(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$622(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$625(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$627(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$629() {
        return java.awt.Color.BLUE;
    }
    private static native java.lang.Object recovery$indy$flow$631(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$634(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$636(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$639();

    private static native java.lang.Object recovery$indy$flow$641(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$644(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$645(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$647(int a0);
    private static native java.lang.Object recovery$indy$flow$649(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$652(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$653(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$656(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$659(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native java.lang.Object recovery$indy$flow$661(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$664(java.lang.Object a0,int a1,int a2,java.lang.Object a3,byte a4);

    private static native void recovery$indy$flow$666(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$669(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$672(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$675(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$676(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$679(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$682(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$683(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$686(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$688(boolean a0);
    private static native java.lang.Object recovery$indy$flow$690(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$693(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$694(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$697(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$700(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$701(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$702() {
        return net.C_40t.field_49;
    }
    private static void recovery$indy$flow$703(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.ArrayList_47QI) (a0)).field_48 = ((net.C_47Pn) (a1));
        return;
    }
    private static void recovery$indy$flow$704(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.render.ArrayList_47QI) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$705(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.render.ArrayList_47QI) (a0)).field_43y = a1;
        return;
    }
    private static native void recovery$indy$flow$708(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$710();


    private static native java.lang.Object recovery$indy$flow$713(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$714() {
        return augustus.recovered.modules.render.ArrayList_47QI.field_43;
    }


    private static native void recovery$indy$flow$717(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native void recovery$indy$2(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$3(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$4(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$5(Object var0, long var1, long var3);
   private static native void recovery$indy$6(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$26();
}
