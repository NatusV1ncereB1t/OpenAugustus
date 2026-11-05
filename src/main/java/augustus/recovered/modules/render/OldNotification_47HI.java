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
import net.C_45n;
import client.gui.ClickGuiScreen;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import net.minecraft.client.shader.Framebuffer;
import client.module.Category;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class OldNotification_47HI extends client.module.Module {
    public final client.setting.ModeSetting settingModes = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingSide = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingY = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAnimationTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAnimationDuration = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public java.util.ArrayList field_43h; // Runtime access flags and ConstantValue are restored from the original class.
    private static boolean field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    public void method_46$b27b1746e4(int n, byte by, float f, int n2) {
        long l = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ a;
        long l2 = l ^ 0x2F2BCFD73795L;
        int n3 = 0;
        java.util.Iterator iterator = this.field_43h.iterator();
        int[] nArray = (int[])OldNotification_47HI.recovery$indy$flow$1(6281713045896216606L, l);
        while (iterator.hasNext()) {
            int[] nArray2;
            block9: {
                block10: {
                    int n4;
                    block7: {
                        net.C_49c c_49c;
                        block8: {
                            c_49c = (net.C_49c)((Object)iterator.next());
                            n4 = n3;
                            int[] nArray3 = nArray;
                            if (n2 > 0) {
                                if (nArray3 == null) {
                                    long l3;
                                    if (n4 != 0) {
                                        this.field_43h.remove((Object)c_49c);
                                    }
                                    n4 = (l3 = Math.abs(System.currentTimeMillis() - OldNotification_47HI.recovery$indy$flow$10((Object)c_49c, 6282337041380321944L, l)) - (long)OldNotification_47HI.recovery$indy$flow$12((Object)c_49c, 6281963083964699809L, l)) == 0L ? 0 : (l3 < 0L ? -1 : 1);
                                }
                                nArray3 = nArray;
                            }
                            if (nArray3 != null) break block7;
                            if (n4 <= 0) break block8;
                            this.field_43h.remove((Object)c_49c);
                            nArray2 = nArray;
                            if (n < 0) break block9;
                            if (nArray2 == null) break block10;
                        }
                        OldNotification_47HI.recovery$indy$flow$16((Object)c_49c, f, this.field_45, l2, 6282133737520255630L, l);
                        n4 = 1;
                    }
                    n3 = n4;
                }
                nArray2 = nArray;
            }
            if (nArray2 == null) continue;
        }
    }



    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 77836968598864L;
      long var3 = var1 ^ 107654371701090L;
      long var10002 = -5432903508281373290L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Basic");
   }



   public static void method_48$f633c984d8(boolean var0) {
      field_47 = var0;
   }



   public static boolean method_45$aae029aa0a() {
      boolean var0 = method_44K$aae029aa0a();
      return !var0;
   }



   public void method_47$785d4097d5(long var1, client.module.Module var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 4843598061484L;
      long var6 = var1 ^ 105271119797641L;
      long var8 = var1 ^ 109793891832839L;
      long var10 = var1 ^ 138638569684461L;
      long var12 = var1 ^ 140289431801940L;
      long var10001 = var1 ^ 65369736192865L;
      int var14 = (int)((var1 ^ 65369736192865L) >>> 32);
      int var15 = (int)((var1 ^ 65369736192865L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      String var18 = (String)recovery$indy$flow$26(this.settingModes, var8, 1296879707812587763L, var1);
      int[] var10000 = (int[])recovery$indy$flow$27(1295711674060342984L, var1);
      byte var19 = -1;
      int[] var17 = var10000;
      int var49 = var18.hashCode();
      if (var17 == null) {
         switch (var49) {
            case -1280820637:
               if (var18.equals((String)recovery$indy$flow$29(6831, 2452147680965254051L ^ var1))) {
                  if (var1 >= 0L) {
                     var19 = 0;
                     switch (var19) {
                        case 0:
                           String var54 = (String)recovery$indy$flow$35(9555, 1090801293504701521L ^ var1)
                              + (String)recovery$indy$flow$37(var3, 1295675981991111984L, var1)
                              + (String)recovery$indy$flow$39(14836, 2146043562637621492L ^ var1);
                           StringBuilder var59 = new StringBuilder().append((String)recovery$indy$flow$44(var3, 1295675981991111984L, var1));
                           if (var1 > 0L) {
                              recovery$indy$flow$53(
                                 var54,
                                 var59.append((String)recovery$indy$flow$46(16439, 5867912746800611625L ^ var1))
                                    .append(
                                       recovery$indy$flow$48(var3, var4, 1294994800823681972L, var1)
                                          ? (String)recovery$indy$flow$49(27337, 5176863718311275460L ^ var1)
                                          : (String)recovery$indy$flow$50(799, 9077038694676775441L ^ var1)
                                    )
                                    .toString(),
                                 1295528642744388615L,
                                 var1
                              );
                              return;
                           }

                           recovery$indy$flow$53(
                              var54,
                              var59.append(
                                    16439 != 0
                                       ? (String)recovery$indy$flow$49(27337, 5176863718311275460L ^ var1)
                                       : (String)recovery$indy$flow$50(799, 9077038694676775441L ^ var1)
                                 )
                                 .toString(),
                              1295528642744388615L,
                              var1
                           );
                           return;
                        case 1:
                           if (!((net.minecraft.client.gui.GuiScreen)recovery$indy$flow$55(field_43, 1295880279193528155L, var1) instanceof ClickGuiScreen)) {
                              String var32 = (String)recovery$indy$flow$59(var3, 1295675981991111984L, var1)
                                 + (String)recovery$indy$flow$61(26696, 2678175506930510164L ^ var1);
                              int var40 = ((String)recovery$indy$flow$65(this.settingSide, var8, 1296879707812587763L, var1))
                                    .equalsIgnoreCase((String)recovery$indy$flow$66(28084, 7053394391153683646L ^ var1))
                                 ? ((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$69(field_43, 1293888697657016979L, var1)).field_44
                                    - (int)(recovery$indy$flow$72(net.C_40t.field_42S, var32, var10, 1295812414114325824L, var1) + 10.0F)
                                 : 0;
                              int var48 = (int)(
                                 (((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$74(field_43, 1293888697657016979L, var1)).field_42 - 60)
                                    * (recovery$indy$flow$77(this.settingY, var6, 1293837140502198509L, var1) / 100.0)
                              );
                              this.field_43h
                                 .add(
                                    0,
                                    new net.C_49c(
                                       var40,
                                       var48,
                                       (int)(recovery$indy$flow$81(net.C_40t.field_42S, var32, var10, 1295812414114325824L, var1) + 10.0F),
                                       60,
                                       var3,
                                       (int)recovery$indy$flow$83(this.settingAnimationTime, var6, 1293837140502198509L, var1),
                                       (int)recovery$indy$flow$85(this.settingAnimationDuration, var6, 1293837140502198509L, var1),
                                       recovery$indy$flow$87(this.settingColor, var14, (short)var15, (char)var16, 0, 1295455037443251628L, var1),
                                       var12
                                    )
                                 );
                           }

                           return;
                        default:
                           return;
                     }
                  }

                  if (false) {
                     var19 = 1;
                  }

                  switch (var19) {
                     case 0:
                        recovery$indy$flow$53(
                           (String)recovery$indy$flow$35(9555, 1090801293504701521L ^ var1)
                              + (String)recovery$indy$flow$37(var3, 1295675981991111984L, var1)
                              + (String)recovery$indy$flow$39(14836, 2146043562637621492L ^ var1),
                           (String)recovery$indy$flow$44(var3, 1295675981991111984L, var1) + (String)recovery$indy$flow$50(16439, 9077038694676775441L ^ var1),
                           1295528642744388615L,
                           var1
                        );
                        break;
                     case 1:
                        if (!((net.minecraft.client.gui.GuiScreen)recovery$indy$flow$55(field_43, 1295880279193528155L, var1) instanceof ClickGuiScreen)) {
                           String var31 = (String)recovery$indy$flow$59(var3, 1295675981991111984L, var1)
                              + (String)recovery$indy$flow$61(26696, 2678175506930510164L ^ var1);
                           int var39 = ((String)recovery$indy$flow$65(this.settingSide, var8, 1296879707812587763L, var1))
                                 .equalsIgnoreCase((String)recovery$indy$flow$66(28084, 7053394391153683646L ^ var1))
                              ? ((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$69(field_43, 1293888697657016979L, var1)).field_44
                                 - (int)(recovery$indy$flow$72(net.C_40t.field_42S, var31, var10, 1295812414114325824L, var1) + 10.0F)
                              : 0;
                           int var47 = (int)(
                              (((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$74(field_43, 1293888697657016979L, var1)).field_42 - 60)
                                 * (recovery$indy$flow$77(this.settingY, var6, 1293837140502198509L, var1) / 100.0)
                           );
                           this.field_43h
                              .add(
                                 0,
                                 new net.C_49c(
                                    var39,
                                    var47,
                                    (int)(recovery$indy$flow$81(net.C_40t.field_42S, var31, var10, 1295812414114325824L, var1) + 10.0F),
                                    60,
                                    var3,
                                    (int)recovery$indy$flow$83(this.settingAnimationTime, var6, 1293837140502198509L, var1),
                                    (int)recovery$indy$flow$85(this.settingAnimationDuration, var6, 1293837140502198509L, var1),
                                    recovery$indy$flow$87(this.settingColor, var14, (short)var15, (char)var16, 0, 1295455037443251628L, var1),
                                    var12
                                 )
                              );
                        }
                  }

                  return;
               } else {
                  switch (var19) {
                     case 0:
                        String var53 = (String)recovery$indy$flow$35(9555, 1090801293504701521L ^ var1)
                           + (String)recovery$indy$flow$37(var3, 1295675981991111984L, var1)
                           + (String)recovery$indy$flow$39(14836, 2146043562637621492L ^ var1);
                        StringBuilder var58 = new StringBuilder().append((String)recovery$indy$flow$44(var3, 1295675981991111984L, var1));
                        if (var1 > 0L) {
                           recovery$indy$flow$53(
                              var53,
                              var58.append((String)recovery$indy$flow$46(16439, 5867912746800611625L ^ var1))
                                 .append(
                                    recovery$indy$flow$48(var3, var4, 1294994800823681972L, var1)
                                       ? (String)recovery$indy$flow$49(27337, 5176863718311275460L ^ var1)
                                       : (String)recovery$indy$flow$50(799, 9077038694676775441L ^ var1)
                                 )
                                 .toString(),
                              1295528642744388615L,
                              var1
                           );
                           return;
                        } else {
                           if (var1 >= 0L) {
                              recovery$indy$flow$53(
                                 var53,
                                 var58.append(
                                       16439 != 0
                                          ? (String)recovery$indy$flow$49(27337, 5176863718311275460L ^ var1)
                                          : (String)recovery$indy$flow$50(799, 9077038694676775441L ^ var1)
                                    )
                                    .toString(),
                                 1295528642744388615L,
                                 var1
                              );
                              return;
                           }

                           recovery$indy$flow$53(
                              var53, var58.append((String)recovery$indy$flow$50(16439, 9077038694676775441L ^ var1)).toString(), 1295528642744388615L, var1
                           );
                           return;
                        }
                     case 1:
                        if (!((net.minecraft.client.gui.GuiScreen)recovery$indy$flow$55(field_43, 1295880279193528155L, var1) instanceof ClickGuiScreen)) {
                           String var30 = (String)recovery$indy$flow$59(var3, 1295675981991111984L, var1)
                              + (String)recovery$indy$flow$61(26696, 2678175506930510164L ^ var1);
                           int var38 = ((String)recovery$indy$flow$65(this.settingSide, var8, 1296879707812587763L, var1))
                                 .equalsIgnoreCase((String)recovery$indy$flow$66(28084, 7053394391153683646L ^ var1))
                              ? ((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$69(field_43, 1293888697657016979L, var1)).field_44
                                 - (int)(recovery$indy$flow$72(net.C_40t.field_42S, var30, var10, 1295812414114325824L, var1) + 10.0F)
                              : 0;
                           int var46 = (int)(
                              (((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$74(field_43, 1293888697657016979L, var1)).field_42 - 60)
                                 * (recovery$indy$flow$77(this.settingY, var6, 1293837140502198509L, var1) / 100.0)
                           );
                           this.field_43h
                              .add(
                                 0,
                                 new net.C_49c(
                                    var38,
                                    var46,
                                    (int)(recovery$indy$flow$81(net.C_40t.field_42S, var30, var10, 1295812414114325824L, var1) + 10.0F),
                                    60,
                                    var3,
                                    (int)recovery$indy$flow$83(this.settingAnimationTime, var6, 1293837140502198509L, var1),
                                    (int)recovery$indy$flow$85(this.settingAnimationDuration, var6, 1293837140502198509L, var1),
                                    recovery$indy$flow$87(this.settingColor, var14, (short)var15, (char)var16, 0, 1295455037443251628L, var1),
                                    var12
                                 )
                              );
                        }

                        return;
                     default:
                        return;
                  }
               }
            case 63955982:
               if (var18.equals((String)recovery$indy$flow$31(20714, 7979556486497669615L ^ var1))) {
                  var19 = 1;
               }

               switch (var19) {
                  case 0:
                     String var52 = (String)recovery$indy$flow$35(9555, 1090801293504701521L ^ var1)
                        + (String)recovery$indy$flow$37(var3, 1295675981991111984L, var1)
                        + (String)recovery$indy$flow$39(14836, 2146043562637621492L ^ var1);
                     StringBuilder var57 = new StringBuilder().append((String)recovery$indy$flow$44(var3, 1295675981991111984L, var1));
                     if (var1 > 0L) {
                        recovery$indy$flow$53(
                           var52,
                           var57.append((String)recovery$indy$flow$46(16439, 5867912746800611625L ^ var1))
                              .append(
                                 recovery$indy$flow$48(var3, var4, 1294994800823681972L, var1)
                                    ? (String)recovery$indy$flow$49(27337, 5176863718311275460L ^ var1)
                                    : (String)recovery$indy$flow$50(799, 9077038694676775441L ^ var1)
                              )
                              .toString(),
                           1295528642744388615L,
                           var1
                        );
                        return;
                     } else {
                        if (var1 >= 0L) {
                           recovery$indy$flow$53(
                              var52,
                              var57.append(
                                    16439 != 0
                                       ? (String)recovery$indy$flow$49(27337, 5176863718311275460L ^ var1)
                                       : (String)recovery$indy$flow$50(799, 9077038694676775441L ^ var1)
                                 )
                                 .toString(),
                              1295528642744388615L,
                              var1
                           );
                           return;
                        }

                        recovery$indy$flow$53(
                           var52, var57.append((String)recovery$indy$flow$50(16439, 9077038694676775441L ^ var1)).toString(), 1295528642744388615L, var1
                        );
                        return;
                     }
                  case 1:
                     if (!((net.minecraft.client.gui.GuiScreen)recovery$indy$flow$55(field_43, 1295880279193528155L, var1) instanceof ClickGuiScreen)) {
                        String var29 = (String)recovery$indy$flow$59(var3, 1295675981991111984L, var1)
                           + (String)recovery$indy$flow$61(26696, 2678175506930510164L ^ var1);
                        int var37 = ((String)recovery$indy$flow$65(this.settingSide, var8, 1296879707812587763L, var1))
                              .equalsIgnoreCase((String)recovery$indy$flow$66(28084, 7053394391153683646L ^ var1))
                           ? ((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$69(field_43, 1293888697657016979L, var1)).field_44
                              - (int)(recovery$indy$flow$72(net.C_40t.field_42S, var29, var10, 1295812414114325824L, var1) + 10.0F)
                           : 0;
                        int var45 = (int)(
                           (((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$74(field_43, 1293888697657016979L, var1)).field_42 - 60)
                              * (recovery$indy$flow$77(this.settingY, var6, 1293837140502198509L, var1) / 100.0)
                        );
                        this.field_43h
                           .add(
                              0,
                              new net.C_49c(
                                 var37,
                                 var45,
                                 (int)(recovery$indy$flow$81(net.C_40t.field_42S, var29, var10, 1295812414114325824L, var1) + 10.0F),
                                 60,
                                 var3,
                                 (int)recovery$indy$flow$83(this.settingAnimationTime, var6, 1293837140502198509L, var1),
                                 (int)recovery$indy$flow$85(this.settingAnimationDuration, var6, 1293837140502198509L, var1),
                                 recovery$indy$flow$87(this.settingColor, var14, (short)var15, (char)var16, 0, 1295455037443251628L, var1),
                                 var12
                              )
                           );
                     }

                     return;
                  default:
                     return;
               }
            default:
               switch (var19) {
                  case 0:
                     String var51 = (String)recovery$indy$flow$35(9555, 1090801293504701521L ^ var1)
                        + (String)recovery$indy$flow$37(var3, 1295675981991111984L, var1)
                        + (String)recovery$indy$flow$39(14836, 2146043562637621492L ^ var1);
                     StringBuilder var56 = new StringBuilder().append((String)recovery$indy$flow$44(var3, 1295675981991111984L, var1));
                     if (var1 > 0L) {
                        recovery$indy$flow$53(
                           var51,
                           var56.append((String)recovery$indy$flow$46(16439, 5867912746800611625L ^ var1))
                              .append(
                                 recovery$indy$flow$48(var3, var4, 1294994800823681972L, var1)
                                    ? (String)recovery$indy$flow$49(27337, 5176863718311275460L ^ var1)
                                    : (String)recovery$indy$flow$50(799, 9077038694676775441L ^ var1)
                              )
                              .toString(),
                           1295528642744388615L,
                           var1
                        );
                        return;
                     } else {
                        if (var1 >= 0L) {
                           recovery$indy$flow$53(
                              var51,
                              var56.append(
                                    16439 != 0
                                       ? (String)recovery$indy$flow$49(27337, 5176863718311275460L ^ var1)
                                       : (String)recovery$indy$flow$50(799, 9077038694676775441L ^ var1)
                                 )
                                 .toString(),
                              1295528642744388615L,
                              var1
                           );
                           return;
                        }

                        recovery$indy$flow$53(
                           var51, var56.append((String)recovery$indy$flow$50(16439, 9077038694676775441L ^ var1)).toString(), 1295528642744388615L, var1
                        );
                        return;
                     }
                  case 1:
                     if (!((net.minecraft.client.gui.GuiScreen)recovery$indy$flow$55(field_43, 1295880279193528155L, var1) instanceof ClickGuiScreen)) {
                        String var28 = (String)recovery$indy$flow$59(var3, 1295675981991111984L, var1)
                           + (String)recovery$indy$flow$61(26696, 2678175506930510164L ^ var1);
                        int var36 = ((String)recovery$indy$flow$65(this.settingSide, var8, 1296879707812587763L, var1))
                              .equalsIgnoreCase((String)recovery$indy$flow$66(28084, 7053394391153683646L ^ var1))
                           ? ((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$69(field_43, 1293888697657016979L, var1)).field_44
                              - (int)(recovery$indy$flow$72(net.C_40t.field_42S, var28, var10, 1295812414114325824L, var1) + 10.0F)
                           : 0;
                        int var44 = (int)(
                           (((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$74(field_43, 1293888697657016979L, var1)).field_42 - 60)
                              * (recovery$indy$flow$77(this.settingY, var6, 1293837140502198509L, var1) / 100.0)
                        );
                        this.field_43h
                           .add(
                              0,
                              new net.C_49c(
                                 var36,
                                 var44,
                                 (int)(recovery$indy$flow$81(net.C_40t.field_42S, var28, var10, 1295812414114325824L, var1) + 10.0F),
                                 60,
                                 var3,
                                 (int)recovery$indy$flow$83(this.settingAnimationTime, var6, 1293837140502198509L, var1),
                                 (int)recovery$indy$flow$85(this.settingAnimationDuration, var6, 1293837140502198509L, var1),
                                 recovery$indy$flow$87(this.settingColor, var14, (short)var15, (char)var16, 0, 1295455037443251628L, var1),
                                 var12
                              )
                           );
                     }

                     return;
               }
         }
      } else {
         switch (var49) {
            case 0:
               String var50 = (String)recovery$indy$flow$35(9555, 1090801293504701521L ^ var1)
                  + (String)recovery$indy$flow$37(var3, 1295675981991111984L, var1)
                  + (String)recovery$indy$flow$39(14836, 2146043562637621492L ^ var1);
               StringBuilder var55 = new StringBuilder().append((String)recovery$indy$flow$44(var3, 1295675981991111984L, var1));
               if (var1 > 0L) {
                  recovery$indy$flow$53(
                     var50, var55.append((String)recovery$indy$flow$46(16439, 5867912746800611625L ^ var1)).toString(), 1295528642744388615L, var1
                  );
                  if (!((net.minecraft.client.gui.GuiScreen)recovery$indy$flow$55(field_43, 1295880279193528155L, var1) instanceof ClickGuiScreen)) {
                     String var27 = (String)recovery$indy$flow$59(var3, 1295675981991111984L, var1)
                        + (String)recovery$indy$flow$61(26696, 2678175506930510164L ^ var1);
                     byte var35 = ((byte) (((String)recovery$indy$flow$65(this.settingSide, var8, 1296879707812587763L, var1))
                        .equalsIgnoreCase((String)recovery$indy$flow$66(28084, 7053394391153683646L ^ var1)) ? 1 : 0));
                     int var43 = (int)(
                        (((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$74(field_43, 1293888697657016979L, var1)).field_42 - 60)
                           * (recovery$indy$flow$77(this.settingY, var6, 1293837140502198509L, var1) / 100.0)
                     );
                     this.field_43h
                        .add(
                           0,
                           new net.C_49c(
                              var35,
                              var43,
                              (int)(recovery$indy$flow$81(net.C_40t.field_42S, var27, var10, 1295812414114325824L, var1) + 10.0F),
                              60,
                              var3,
                              (int)recovery$indy$flow$83(this.settingAnimationTime, var6, 1293837140502198509L, var1),
                              (int)recovery$indy$flow$85(this.settingAnimationDuration, var6, 1293837140502198509L, var1),
                              recovery$indy$flow$87(this.settingColor, var14, (short)var15, (char)var16, 0, 1295455037443251628L, var1),
                              var12
                           )
                        );
                  }

                  return;
               } else {
                  if (var1 >= 0L) {
                     recovery$indy$flow$53(
                        var50,
                        var55.append(
                              16439 != 0
                                 ? (String)recovery$indy$flow$49(27337, 5176863718311275460L ^ var1)
                                 : (String)recovery$indy$flow$50(799, 9077038694676775441L ^ var1)
                           )
                           .toString(),
                        1295528642744388615L,
                        var1
                     );
                     if (!((net.minecraft.client.gui.GuiScreen)recovery$indy$flow$55(field_43, 1295880279193528155L, var1) instanceof ClickGuiScreen)) {
                        String var26 = (String)recovery$indy$flow$59(var3, 1295675981991111984L, var1)
                           + (String)recovery$indy$flow$61(26696, 2678175506930510164L ^ var1);
                        byte var34 = ((byte) (((String)recovery$indy$flow$65(this.settingSide, var8, 1296879707812587763L, var1))
                           .equalsIgnoreCase((String)recovery$indy$flow$66(28084, 7053394391153683646L ^ var1)) ? 1 : 0));
                        int var42 = (int)(
                           (((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$74(field_43, 1293888697657016979L, var1)).field_42 - 60)
                              * (recovery$indy$flow$77(this.settingY, var6, 1293837140502198509L, var1) / 100.0)
                        );
                        this.field_43h
                           .add(
                              0,
                              new net.C_49c(
                                 var34,
                                 var42,
                                 (int)(recovery$indy$flow$81(net.C_40t.field_42S, var26, var10, 1295812414114325824L, var1) + 10.0F),
                                 60,
                                 var3,
                                 (int)recovery$indy$flow$83(this.settingAnimationTime, var6, 1293837140502198509L, var1),
                                 (int)recovery$indy$flow$85(this.settingAnimationDuration, var6, 1293837140502198509L, var1),
                                 recovery$indy$flow$87(this.settingColor, var14, (short)var15, (char)var16, 0, 1295455037443251628L, var1),
                                 var12
                              )
                           );
                     }

                     return;
                  }

                  recovery$indy$flow$53(
                     var50, var55.append((String)recovery$indy$flow$50(16439, 9077038694676775441L ^ var1)).toString(), 1295528642744388615L, var1
                  );
                  if (!((net.minecraft.client.gui.GuiScreen)recovery$indy$flow$55(field_43, 1295880279193528155L, var1) instanceof ClickGuiScreen)) {
                     String var25 = (String)recovery$indy$flow$59(var3, 1295675981991111984L, var1)
                        + (String)recovery$indy$flow$61(26696, 2678175506930510164L ^ var1);
                     byte var33 = ((byte) (((String)recovery$indy$flow$65(this.settingSide, var8, 1296879707812587763L, var1))
                        .equalsIgnoreCase((String)recovery$indy$flow$66(28084, 7053394391153683646L ^ var1)) ? 1 : 0));
                     int var41 = (int)(
                        (((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$74(field_43, 1293888697657016979L, var1)).field_42 - 60)
                           * (recovery$indy$flow$77(this.settingY, var6, 1293837140502198509L, var1) / 100.0)
                     );
                     this.field_43h
                        .add(
                           0,
                           new net.C_49c(
                              var33,
                              var41,
                              (int)(recovery$indy$flow$81(net.C_40t.field_42S, var25, var10, 1295812414114325824L, var1) + 10.0F),
                              60,
                              var3,
                              (int)recovery$indy$flow$83(this.settingAnimationTime, var6, 1293837140502198509L, var1),
                              (int)recovery$indy$flow$85(this.settingAnimationDuration, var6, 1293837140502198509L, var1),
                              recovery$indy$flow$87(this.settingColor, var14, (short)var15, (char)var16, 0, 1295455037443251628L, var1),
                              var12
                           )
                        );
                  }

                  return;
               }
            case 1:
               if (!((net.minecraft.client.gui.GuiScreen)recovery$indy$flow$55(field_43, 1295880279193528155L, var1) instanceof ClickGuiScreen)) {
                  String var20 = (String)recovery$indy$flow$59(var3, 1295675981991111984L, var1)
                     + (String)recovery$indy$flow$61(26696, 2678175506930510164L ^ var1);
                  byte var21 = ((byte) (((String)recovery$indy$flow$65(this.settingSide, var8, 1296879707812587763L, var1))
                     .equalsIgnoreCase((String)recovery$indy$flow$66(28084, 7053394391153683646L ^ var1)) ? 1 : 0));
                  int var22 = (int)(
                     (((net.minecraft.client.shader.Framebuffer)recovery$indy$flow$74(field_43, 1293888697657016979L, var1)).field_42 - 60)
                        * (recovery$indy$flow$77(this.settingY, var6, 1293837140502198509L, var1) / 100.0)
                  );
                  this.field_43h
                     .add(
                        0,
                        new net.C_49c(
                           var21,
                           var22,
                           (int)(recovery$indy$flow$81(net.C_40t.field_42S, var20, var10, 1295812414114325824L, var1) + 10.0F),
                           60,
                           var3,
                           (int)recovery$indy$flow$83(this.settingAnimationTime, var6, 1293837140502198509L, var1),
                           (int)recovery$indy$flow$85(this.settingAnimationDuration, var6, 1293837140502198509L, var1),
                           recovery$indy$flow$87(this.settingColor, var14, (short)var15, (char)var16, 0, 1295455037443251628L, var1),
                           var12
                        )
                     );
               }

               return;
         }
      }
   }





   public void method_43_$e45a9973e5(long var1) {
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   private boolean method_44Z$aae029aa0a() {
      long var1 = a ^ 50092662931806L;
      long var3 = var1 ^ 11737930214764L;
      long var10002 = -1687697234682572392L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Basic");
   }



   private boolean method_44C$aae029aa0a() {
      long var1 = a ^ 39434664937149L;
      long var3 = var1 ^ 5490872052367L;
      long var10002 = -5803145285127022981L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Basic");
   }



   private boolean method_44j$aae029aa0a() {
      long var1 = a ^ 5038426184121L;
      long var3 = var1 ^ 39268648105355L;
      long var10002 = -1120497643077957249L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Basic");
   }



   private boolean method_44q$aae029aa0a() {
      long var1 = a ^ 134195664144428L;
      long var3 = var1 ^ 102457328542750L;
      long var10002 = -2168958427406853910L;
      long var5 = var3;
      ModeSetting var7 = this.settingModes;
      return var7.method_46$5f9dc63072(var5).equals("Basic");
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   public static boolean method_44K$aae029aa0a() {
      return field_47;
   }



    public OldNotification_47HI(long a0) {
        super((java.lang.String) ("OldNotification"),(java.lang.String) ("AlteBenachrichtigung"),(long) (((augustus.recovered.modules.render.OldNotification_47HI.a ^ a0) ^ 87384814066680L)),(java.awt.Color) (new java.awt.Color((int) (126),(int) (133),(int) (222))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.OldNotification_47HI.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.OldNotification_47HI.a ^ a0) ^ 61077718094558L);
        long constructorKey4 = ((augustus.recovered.modules.render.OldNotification_47HI.a ^ a0) ^ 5281965009717L);
        long constructorKey5 = ((augustus.recovered.modules.render.OldNotification_47HI.a ^ a0) ^ 93073090672449L);
        long constructorKey6 = ((augustus.recovered.modules.render.OldNotification_47HI.a ^ a0) ^ 48300519212044L);
        long constructorKey7 = ((augustus.recovered.modules.render.OldNotification_47HI.a ^ a0) ^ 20914011371620L);
        long constructorKey8 = ((augustus.recovered.modules.render.OldNotification_47HI.a ^ a0) ^ 99836665595846L);
        java.lang.Object initialValue9 = recovery$indy$flow$112(2);
        ((java.lang.Object[]) initialValue9)[0] = "Windows";
        ((java.lang.Object[]) initialValue9)[1] = "Basic";
        client.setting.ModeSetting initialized10 = new client.setting.ModeSetting(this, "Modes", constructorKey4, "Windows", (java.lang.String[]) (initialValue9));
        recovery$indy$flow$114(this, initialized10);
        java.lang.Object initialValue11 = recovery$indy$flow$116(2);
        ((java.lang.Object[]) initialValue11)[0] = "Left";
        ((java.lang.Object[]) initialValue11)[1] = "Right";
        client.setting.ModeSetting initialized12 = new client.setting.ModeSetting(this, "Side", constructorKey4, "Right", (java.lang.String[]) (initialValue11));
        java.lang.Object initialValue13 = recovery$indy$flow$118(this);
        java.lang.Object initialValue14 = initialValue13;
        client.setting.ModeSetting initialValue15 = initialized12;
        java.lang.Object initialValue16 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue15))))));
        java.lang.Object initialValue17 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue14))))));
        java.lang.Object initialValue18 = recovery$indy$flow$121(initialValue16, initialValue17);
        recovery$indy$flow$122(this, initialValue18);
        client.setting.NumberSetting initialized19 = new client.setting.NumberSetting(this, "Y", Double.longBitsToDouble(4636737291354636288L), constructorKey7, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        java.lang.Object initialValue20 = recovery$indy$flow$125(this);
        java.lang.Object initialValue21 = initialValue20;
        client.setting.NumberSetting initialValue22 = initialized19;
        java.lang.Object initialValue23 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue22))))));
        java.lang.Object initialValue24 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue21))))));
        java.lang.Object initialValue25 = recovery$indy$flow$128(initialValue23, initialValue24);
        recovery$indy$flow$129(this, initialValue25);
        client.setting.NumberSetting initialized26 = new client.setting.NumberSetting(this, "AnimationTime", Double.longBitsToDouble(4645744490609377280L), constructorKey7, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0);
        java.lang.Object initialValue27 = recovery$indy$flow$132(this);
        java.lang.Object initialValue28 = initialValue27;
        client.setting.NumberSetting initialValue29 = initialized26;
        java.lang.Object initialValue30 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue29))))));
        java.lang.Object initialValue31 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue28))))));
        java.lang.Object initialValue32 = recovery$indy$flow$135(initialValue30, initialValue31);
        recovery$indy$flow$136(this, initialValue32);
        client.setting.NumberSetting initialized33 = new client.setting.NumberSetting(this, "AnimationDuration", Double.longBitsToDouble(4656510908468559872L), constructorKey7, 0.0D, Double.longBitsToDouble(4662219572839972864L), 0);
        java.lang.Object initialValue34 = recovery$indy$flow$139(this);
        java.lang.Object initialValue35 = initialValue34;
        client.setting.NumberSetting initialValue36 = initialized33;
        java.lang.Object initialValue37 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue38 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue35))))));
        java.lang.Object initialValue39 = recovery$indy$flow$142(initialValue37, initialValue38);
        recovery$indy$flow$143(this, initialValue39);
        java.lang.Object initialValue40 = recovery$indy$flow$145();
        java.lang.Object initialValue41 = initialValue40;
        java.lang.Object initialValue42 = ((java.lang.Object)(((client.Client) (((java.lang.Object)(initialValue41))))));
        java.lang.Object initialValue43 = recovery$indy$flow$147(initialValue42);
        client.setting.ColorSetting initialized44 = new client.setting.ColorSetting(constructorKey8, this, "Color", (java.awt.Color) (initialValue43));
        java.lang.Object initialValue45 = recovery$indy$flow$149(this);
        java.lang.Object initialValue46 = initialValue45;
        long initialValue47 = constructorKey3;
        client.setting.ColorSetting initialValue48 = initialized44;
        java.lang.Object initialValue49 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue48))))));
        java.lang.Object initialValue50 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue46))))));
        java.lang.Object initialValue51 = recovery$indy$flow$152(initialValue49, initialValue47, initialValue50);
        java.lang.Object initialValue52 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue51))))));
        recovery$indy$flow$154(this, initialValue52);
        client.setting.ShaderOptions initialized53 = new client.setting.ShaderOptions(this, constructorKey5);
        java.lang.Object initialValue54 = recovery$indy$flow$157();
        java.lang.Object initialValue55 = initialValue54;
        long initialValue56 = constructorKey6;
        client.setting.ShaderOptions initialValue57 = initialized53;
        java.lang.Object initialValue58 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue59 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue55))))));
        java.lang.Object initialValue60 = recovery$indy$flow$160(initialValue58, initialValue56, initialValue59);
        recovery$indy$flow$161(this, initialValue60);
        java.util.ArrayList initialized61 = new java.util.ArrayList();
        recovery$indy$flow$164(this, initialized61);
    }





    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$1(long a0,long a1);
    private static native long recovery$indy$flow$10(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$12(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$16(java.lang.Object a0,float a1,java.lang.Object a2,long a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$26(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$27(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$29(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$31(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$35(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$37(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$39(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$44(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$46(int a0,long a1);
    private static native boolean recovery$indy$flow$48(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$49(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$50(int a0,long a1);
    private static native void recovery$indy$flow$53(java.lang.Object a0,java.lang.Object a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$55(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$59(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$61(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$65(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$66(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$69(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$72(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$74(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$77(java.lang.Object a0,long a1,long a2,long a3);
    private static native float recovery$indy$flow$81(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native double recovery$indy$flow$83(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$85(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$87(java.lang.Object a0,int a1,short a2,char a3,int a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$112(int a0);
    private static native void recovery$indy$flow$114(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$116(int a0);
    private static native java.lang.Object recovery$indy$flow$118(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$121(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$122(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$125(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$128(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$129(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$132(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$135(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$136(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$139(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$142(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$143(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$145();

    private static native java.lang.Object recovery$indy$flow$147(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$149(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$152(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$154(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$157() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$160(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$161(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$164(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.OldNotification_47HI) (a0)).field_43h = ((java.util.ArrayList) (a1));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native MethodHandle recovery$constant$36();
}
