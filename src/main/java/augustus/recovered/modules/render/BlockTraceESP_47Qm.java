package augustus.recovered.modules.render;
import com.google.common.collect.Sets;
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
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import client.render.RenderPass;
import net.C_475y;
import net.C_478Q;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.C_47Fw;
import client.module.Module;
import net.C_47RX;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import net.C_47TX;
import client.setting.ModeSetting;
import client.setting.ColorSetting;
import net.C_47UZ;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderGlobal;
import net.C_47oO;
import net.C_47pO;
import client.render.RenderUtils;
import net.C_47rw;
import net.C_47sk;
import client.module.Category;
import net.C_47uI;
import net.C_47x3;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class BlockTraceESP_47Qm extends client.module.Module implements client.event.RenderListener,net.C_47xz,net.C_47pO,net.C_47oO {
    public final client.setting.ModeSetting settingBlock = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingCustomID = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingBlockColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBlockLineWidth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBlockDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions settingBlock2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ColorSetting settingPathColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ShaderOptions settingPath = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingPathSearchRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47rw field_49s; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Set field_490; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_475y field_46; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   private boolean method_42$91754b766b(C_478Q var1) {
      long var2 = a ^ 28412757242416L;
      long var10000 = -2854310554913273201L;
      int[] var4 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var1 != null && this.field_46 != null) {
         long var10001 = -2853105496389910295L;
         Minecraft var6 = field_43;
         C_47UZ var5 = var6.field_44Q.method_49$0bfd666c6c(var1.method_40$8abf5c6871(), var1.method_43$8abf5c6871(), var1.method_47$8abf5c6871());
         C_47UZ var7 = var5;
         if (var4 == null) {
            if (var5 == null) {
               return false;
            }

            var7 = var5;
         }

         boolean var8 = var7.method_48$e084f7739d().equals(this.field_46);
         return var4 != null ? var8 : !var8;
      } else {
         return true;
      }
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_40$839f0ed6fe(C_47x3 var1, long var2) {
      long var4;
      C_47x3 var10;
      label36: {
         var4 = var2 ^ 81019589207442L;
         long var6 = var2 ^ 22615211443901L;
         int[] var8 = recovery$indy$1(-1831773438524509064L, var2);
         C_47UZ var10000 = recovery$indy$2(var1, -1832566090120186178L, var2);
         if (var8 == null) {
            if (var10000 == null) {
               return;
            }

            var10 = var1;
            if (var8 != null) {
               break label36;
            }

            var10000 = recovery$indy$3(var1, -1832566090120186178L, var2);
         }

         if (!var10000.method_48$e084f7739d().equals(C_475y.method_49$c1e739f280(recovery$indy$4(this, var6, -1830827974633257858L, var2)))) {
            return;
         }

         var10 = var1;
      }

      C_478Q var9 = recovery$indy$5(var10, var4, -1831123671926450875L, var2);
      if (var9 != null) {
         field_490.add(var9);
      }
   }



   private net.C_478Q method_44$d5acae9fbb(long var1) {
        int[] var73;
        java.util.ArrayList var93;
      int[] var9;
      net.C_478Q var11;
      net.C_47rw var89;
      int[] var101;
      label2011: {
         label1880: {
            label2016: {
               label1895: {
                  label2035: {
                     net.C_47rw var28;
                     label2036: {
                        label1898: {
                           long var7;
                           label1899: {
                              label1900: {
                                 label1955: {
                                    var1 = a ^ var1;
                                    long var3 = var1 ^ 86782074343091L;
                                    long var5 = var1 ^ 135447979582185L;
                                    var7 = var1 ^ 111656102999542L;
                                    int var10 = net.C_47sk.method_49$cabccf1c64(
                                       (int)recovery$indy$flow$25(this.settingPathSearchRange, var5, 3358425934344865955L, var1), 0, 10
                                    );
                                    int[] var10000 = (int[])recovery$indy$flow$27(3358103946245962870L, var1);
                                    var11 = null;
                                    var9 = var10000;
                                    double var12 = 100000.0;
                                    int var14 = -var10;
                                    if (var14 > var10) {
                                       if (var11 == null) {
                                          this.field_49s = null;
                                          return null;
                                       }

                                       var28 = (net.C_47rw)recovery$indy$flow$61(
                                          new net.C_47RX(var11),
                                          var7,
                                          new net.C_47RX(
                                             new net.C_478Q(
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$56(field_43, 3358907571065646034L, var1)).method_49$41b79b67a0(1.0F)
                                             )
                                          ),
                                          var11.method_43$8abf5c6871(),
                                          3359349665264485202L,
                                          var1
                                       );
                                       var89 = var28;
                                       var101 = var9;
                                       if (var1 < 0L) {
                                          break label2035;
                                       }
                                    } else {
                                       label1974: {
                                          label1904: {
                                             label1867: {
                                                int var15;
                                                int var16;
                                                net.C_478Q var17;
                                                double var18;
                                                label1956: {
                                                   var15 = -var10;
                                                   int[] var76;
                                                   if (var15 <= var10) {
                                                      int var79 = -var10;
                                                      if (var9 != null) {
                                                         while (var79 <= var10) {
                                                            var15 = -var10;
                                                            if (var15 > var10) {
                                                               var14++;
                                                               if (var1 < 0L) {
                                                                  if (var11 == null) {
                                                                     this.field_49s = null;
                                                                     return null;
                                                                  }

                                                                  var28 = (net.C_47rw)recovery$indy$flow$61(
                                                                     new net.C_47RX(var11),
                                                                     var7,
                                                                     new net.C_47RX(
                                                                        new net.C_478Q(
                                                                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$56(field_43, 3358907571065646034L, var1))
                                                                              .method_49$41b79b67a0(1.0F)
                                                                        )
                                                                     ),
                                                                     var11.method_43$8abf5c6871(),
                                                                     3359349665264485202L,
                                                                     var1
                                                                  );
                                                                  var89 = var28;
                                                                  var101 = var9;
                                                                  break label2011;
                                                               }

                                                               while (true) {
                                                                  if (var9 != null) {
                                                                     break label1900;
                                                                  }

                                                                  int var88 = var14;

                                                                  while (true) {
                                                                     if (var88 > var10) {
                                                                        break label1900;
                                                                     }

                                                                     var15 = -var10;
                                                                     if (var15 > var10) {
                                                                        var14++;
                                                                        break;
                                                                     }

                                                                     var88 = -var10;
                                                                  }
                                                               }
                                                            }

                                                            var79 = -var10;
                                                         }

                                                         if (var11 == null) {
                                                            this.field_49s = null;
                                                            return null;
                                                         }

                                                         var28 = (net.C_47rw)recovery$indy$flow$61(
                                                            new net.C_47RX(var11),
                                                            var7,
                                                            new net.C_47RX(
                                                               new net.C_478Q(
                                                                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$56(field_43, 3358907571065646034L, var1))
                                                                     .method_49$41b79b67a0(1.0F)
                                                               )
                                                            ),
                                                            var11.method_43$8abf5c6871(),
                                                            3359349665264485202L,
                                                            var1
                                                         );
                                                         var89 = var28;
                                                         var101 = var9;
                                                         if (var1 < 0L) {
                                                            break label2011;
                                                         }
                                                         break label2036;
                                                      }

                                                      var16 = var79;

                                                      while (true) {
                                                         if (var16 <= var10) {
                                                            var17 = new net.C_478Q(
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$30(field_43, 3358907571065646034L, var1)).field_48Q + var14,
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, 3358907571065646034L, var1)).field_48j + var15,
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$36(field_43, 3358907571065646034L, var1)).field_42o + var16
                                                            );
                                                            if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$40(field_43, 3359308987615671824L, var1))
                                                               .method_46$efbf73d2b1(var17)
                                                               .method_48$e084f7739d()
                                                               .equals(
                                                                  net.C_475y.method_49$c1e739f280(recovery$indy$flow$43(this, var3, 3357941308574452848L, var1))
                                                               )) {
                                                               var18 = Math.sqrt(
                                                                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$47(field_43, 3358907571065646034L, var1))
                                                                     .method_40$3b7701846d(var17)
                                                               );
                                                               var73 = var9;
                                                               if (var1 <= 0L) {
                                                                  while (true) {
                                                                     if (var73 != null) {
                                                                        do {
                                                                           if (var9 != null || var14 > var10) {
                                                                              break label1904;
                                                                           }

                                                                           var15 = -var10;
                                                                           if (var15 > var10) {
                                                                              break label1867;
                                                                           }

                                                                           var16 = -var10;
                                                                        } while (var16 > var10);
                                                                     } else {
                                                                        while (var16 > var10) {
                                                                           if (var9 != null || var14 > var10) {
                                                                              break label1904;
                                                                           }

                                                                           var15 = -var10;
                                                                           if (var15 > var10) {
                                                                              break label1867;
                                                                           }

                                                                           var16 = -var10;
                                                                        }
                                                                     }

                                                                     var17 = new net.C_478Q(
                                                                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$30(field_43, 3358907571065646034L, var1)).field_48Q
                                                                           + var14,
                                                                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, 3358907571065646034L, var1)).field_48j
                                                                           + var15,
                                                                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$36(field_43, 3358907571065646034L, var1)).field_42o
                                                                           + var16
                                                                     );
                                                                     if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$40(field_43, 3359308987615671824L, var1))
                                                                        .method_46$efbf73d2b1(var17)
                                                                        .method_48$e084f7739d()
                                                                        .equals(
                                                                           net.C_475y.method_49$c1e739f280(
                                                                              recovery$indy$flow$43(this, var3, 3357941308574452848L, var1)
                                                                           )
                                                                        )) {
                                                                        Math.sqrt(
                                                                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$47(field_43, 3358907571065646034L, var1))
                                                                              .method_40$3b7701846d(var17)
                                                                        );
                                                                        var73 = var9;
                                                                     } else {
                                                                        var16++;
                                                                        var73 = var9;
                                                                     }
                                                                  }
                                                               }
                                                               break label1956;
                                                            }

                                                            var16++;
                                                            if (var9 == null) {
                                                               continue;
                                                            }
                                                         }

                                                         var15++;
                                                         var76 = var9;
                                                         if (var1 <= 0L) {
                                                            while (true) {
                                                               if (var76 != null || var14 > var10) {
                                                                  break label1904;
                                                               }

                                                               var15 = -var10;
                                                               if (var15 > var10) {
                                                                  break label1867;
                                                               }

                                                               var16 = -var10;

                                                               while (true) {
                                                                  if (var16 <= var10) {
                                                                     var17 = new net.C_478Q(
                                                                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$30(field_43, 3358907571065646034L, var1)).field_48Q
                                                                           + var14,
                                                                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, 3358907571065646034L, var1)).field_48j
                                                                           + var15,
                                                                        ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$36(field_43, 3358907571065646034L, var1)).field_42o
                                                                           + var16
                                                                     );
                                                                     int[] var80;
                                                                     if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$40(field_43, 3359308987615671824L, var1))
                                                                        .method_46$efbf73d2b1(var17)
                                                                        .method_48$e084f7739d()
                                                                        .equals(
                                                                           net.C_475y.method_49$c1e739f280(
                                                                              recovery$indy$flow$43(this, var3, 3357941308574452848L, var1)
                                                                           )
                                                                        )) {
                                                                        Math.sqrt(
                                                                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$47(field_43, 3358907571065646034L, var1))
                                                                              .method_40$3b7701846d(var17)
                                                                        );
                                                                        var80 = var9;
                                                                     } else {
                                                                        var16++;
                                                                        var80 = var9;
                                                                     }

                                                                     if (var80 == null) {
                                                                        continue;
                                                                     }
                                                                  }

                                                                  var76 = var9;
                                                                  break;
                                                               }
                                                            }
                                                         }
                                                         break;
                                                      }
                                                   } else {
                                                      var14++;
                                                      if (var1 < 0L) {
                                                         if (var11 == null) {
                                                            this.field_49s = null;
                                                            return null;
                                                         }

                                                         var28 = (net.C_47rw)recovery$indy$flow$61(
                                                            new net.C_47RX(var11),
                                                            var7,
                                                            new net.C_47RX(
                                                               new net.C_478Q(
                                                                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$56(field_43, 3358907571065646034L, var1))
                                                                     .method_49$41b79b67a0(1.0F)
                                                               )
                                                            ),
                                                            var11.method_43$8abf5c6871(),
                                                            3359349665264485202L,
                                                            var1
                                                         );
                                                         var89 = var28;
                                                         var101 = var9;
                                                         break label2035;
                                                      }

                                                      while (true) {
                                                         if (var9 != null || var14 > var10) {
                                                            if (var11 == null) {
                                                               this.field_49s = null;
                                                               return null;
                                                            }

                                                            var28 = (net.C_47rw)recovery$indy$flow$61(
                                                               new net.C_47RX(var11),
                                                               var7,
                                                               new net.C_47RX(
                                                                  new net.C_478Q(
                                                                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$56(field_43, 3358907571065646034L, var1))
                                                                        .method_49$41b79b67a0(1.0F)
                                                                  )
                                                               ),
                                                               var11.method_43$8abf5c6871(),
                                                               3359349665264485202L,
                                                               var1
                                                            );
                                                            var89 = var28;
                                                            var101 = var9;
                                                            break label1974;
                                                         }

                                                         var15 = -var10;
                                                         if (var15 <= var10) {
                                                            int var72 = -var10;
                                                            if (var9 != null) {
                                                               while (true) {
                                                                  if (var72 > var10) {
                                                                     break label1900;
                                                                  }

                                                                  var15 = -var10;
                                                                  if (var15 <= var10) {
                                                                     var72 = -var10;
                                                                  } else {
                                                                     var14++;
                                                                     if (var9 != null) {
                                                                        break label1900;
                                                                     }

                                                                     var72 = var14;
                                                                  }
                                                               }
                                                            }

                                                            var16 = var72;

                                                            while (var16 <= var10) {
                                                               var17 = new net.C_478Q(
                                                                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$30(field_43, 3358907571065646034L, var1)).field_48Q
                                                                     + var14,
                                                                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, 3358907571065646034L, var1)).field_48j
                                                                     + var15,
                                                                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$36(field_43, 3358907571065646034L, var1)).field_42o
                                                                     + var16
                                                               );
                                                               if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$40(field_43, 3359308987615671824L, var1))
                                                                  .method_46$efbf73d2b1(var17)
                                                                  .method_48$e084f7739d()
                                                                  .equals(
                                                                     net.C_475y.method_49$c1e739f280(recovery$indy$flow$43(this, var3, 3357941308574452848L, var1))
                                                                  )) {
                                                                  var18 = Math.sqrt(
                                                                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$47(field_43, 3358907571065646034L, var1))
                                                                        .method_40$3b7701846d(var17)
                                                                  );
                                                                  var73 = var9;
                                                                  if (var1 <= 0L) {
                                                                     while (true) {
                                                                        if (var73 != null) {
                                                                           label1618:
                                                                           while (true) {
                                                                              int[] var75 = var9;

                                                                              while (true) {
                                                                                 if (var75 != null || var14 > var10) {
                                                                                    break label1899;
                                                                                 }

                                                                                 var15 = -var10;
                                                                                 if (var15 <= var10) {
                                                                                    var16 = -var10;
                                                                                    if (var16 <= var10) {
                                                                                       break label1618;
                                                                                    }
                                                                                    break;
                                                                                 }

                                                                                 var14++;
                                                                                 var75 = var9;
                                                                              }
                                                                           }
                                                                        } else {
                                                                           for (; var16 > var10; var16 = -var10) {
                                                                              int[] var74 = var9;

                                                                              while (true) {
                                                                                 if (var74 != null || var14 > var10) {
                                                                                    break label1899;
                                                                                 }

                                                                                 var15 = -var10;
                                                                                 if (var15 <= var10) {
                                                                                    break;
                                                                                 }

                                                                                 var14++;
                                                                                 var74 = var9;
                                                                              }
                                                                           }
                                                                        }

                                                                        var17 = new net.C_478Q(
                                                                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$30(field_43, 3358907571065646034L, var1)).field_48Q
                                                                              + var14,
                                                                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, 3358907571065646034L, var1)).field_48j
                                                                              + var15,
                                                                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$36(field_43, 3358907571065646034L, var1)).field_42o
                                                                              + var16
                                                                        );
                                                                        if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$40(field_43, 3359308987615671824L, var1))
                                                                           .method_46$efbf73d2b1(var17)
                                                                           .method_48$e084f7739d()
                                                                           .equals(
                                                                              net.C_475y.method_49$c1e739f280(
                                                                                 recovery$indy$flow$43(this, var3, 3357941308574452848L, var1)
                                                                              )
                                                                           )) {
                                                                           Math.sqrt(
                                                                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$47(field_43, 3358907571065646034L, var1))
                                                                                 .method_40$3b7701846d(var17)
                                                                           );
                                                                           var73 = var9;
                                                                        } else {
                                                                           var16++;
                                                                           var73 = var9;
                                                                        }
                                                                     }
                                                                  }
                                                                  break label1956;
                                                               }

                                                               var16++;
                                                               if (var9 != null) {
                                                                  break;
                                                               }
                                                            }

                                                            var15++;
                                                            var76 = var9;
                                                            if (var1 <= 0L) {
                                                               while (true) {
                                                                  if (var76 != null || var14 > var10) {
                                                                     break label1899;
                                                                  }

                                                                  var15 = -var10;
                                                                  if (var15 <= var10) {
                                                                     var16 = -var10;

                                                                     while (var16 <= var10) {
                                                                        var17 = new net.C_478Q(
                                                                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$30(field_43, 3358907571065646034L, var1)).field_48Q
                                                                              + var14,
                                                                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, 3358907571065646034L, var1)).field_48j
                                                                              + var15,
                                                                           ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$36(field_43, 3358907571065646034L, var1)).field_42o
                                                                              + var16
                                                                        );
                                                                        int[] var77;
                                                                        if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$40(field_43, 3359308987615671824L, var1))
                                                                           .method_46$efbf73d2b1(var17)
                                                                           .method_48$e084f7739d()
                                                                           .equals(
                                                                              net.C_475y.method_49$c1e739f280(
                                                                                 recovery$indy$flow$43(this, var3, 3357941308574452848L, var1)
                                                                              )
                                                                           )) {
                                                                           Math.sqrt(
                                                                              ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$47(field_43, 3358907571065646034L, var1))
                                                                                 .method_40$3b7701846d(var17)
                                                                           );
                                                                           var77 = var9;
                                                                        } else {
                                                                           var16++;
                                                                           var77 = var9;
                                                                        }

                                                                        if (var77 != null) {
                                                                           break;
                                                                        }
                                                                     }

                                                                     var76 = var9;
                                                                  } else {
                                                                     var14++;
                                                                     var76 = var9;
                                                                  }
                                                               }
                                                            }
                                                            break;
                                                         }

                                                         var14++;
                                                      }
                                                   }

                                                   while (true) {
                                                      if (var76 != null) {
                                                         do {
                                                            if (var9 != null || ++var14 > var10) {
                                                               break label1955;
                                                            }

                                                            var15 = -var10;
                                                         } while (var15 > var10);
                                                      } else {
                                                         while (var15 > var10) {
                                                            if (var9 != null || ++var14 > var10) {
                                                               break label1955;
                                                            }

                                                            var15 = -var10;
                                                         }
                                                      }

                                                      var16 = -var10;

                                                      while (var16 <= var10) {
                                                         label1786: {
                                                            var17 = new net.C_478Q(
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$30(field_43, 3358907571065646034L, var1)).field_48Q + var14,
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, 3358907571065646034L, var1)).field_48j + var15,
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$36(field_43, 3358907571065646034L, var1)).field_42o + var16
                                                            );
                                                            if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$40(field_43, 3359308987615671824L, var1))
                                                               .method_46$efbf73d2b1(var17)
                                                               .method_48$e084f7739d()
                                                               .equals(
                                                                  net.C_475y.method_49$c1e739f280(recovery$indy$flow$43(this, var3, 3357941308574452848L, var1))
                                                               )) {
                                                               var18 = Math.sqrt(
                                                                  ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$47(field_43, 3358907571065646034L, var1))
                                                                     .method_40$3b7701846d(var17)
                                                               );
                                                               if (var9 != null) {
                                                                  break label1786;
                                                               }

                                                               if (var18 < var12) {
                                                                  var11 = var17;
                                                                  var12 = var18;
                                                               }
                                                            }

                                                            var16++;
                                                         }

                                                         if (var9 != null) {
                                                            break;
                                                         }
                                                      }

                                                      var15++;
                                                      var76 = var9;
                                                   }
                                                }

                                                while (true) {
                                                   if (var73 == null) {
                                                      if (var18 < var12) {
                                                         var11 = var17;
                                                         var12 = var18;
                                                      }

                                                      do {
                                                         var16++;
                                                         if (var9 != null) {
                                                            do {
                                                               var15++;
                                                               if (var9 != null) {
                                                                  do {
                                                                     if (var9 != null || ++var14 > var10) {
                                                                        break label1955;
                                                                     }

                                                                     var15 = -var10;
                                                                  } while (var15 > var10);
                                                               } else {
                                                                  while (var15 > var10) {
                                                                     if (var9 != null || ++var14 > var10) {
                                                                        break label1955;
                                                                     }

                                                                     var15 = -var10;
                                                                  }
                                                               }

                                                               var16 = -var10;
                                                            } while (var16 > var10);
                                                         } else {
                                                            for (; var16 > var10; var16 = -var10) {
                                                               var15++;
                                                               if (var9 != null) {
                                                                  while (true) {
                                                                     if (var9 != null || ++var14 > var10) {
                                                                        break label1955;
                                                                     }

                                                                     var15 = -var10;
                                                                     if (var15 <= var10) {
                                                                        break;
                                                                     }
                                                                  }
                                                               } else {
                                                                  while (var15 > var10) {
                                                                     if (var9 != null || ++var14 > var10) {
                                                                        break label1955;
                                                                     }

                                                                     var15 = -var10;
                                                                  }
                                                               }
                                                            }
                                                         }

                                                         var17 = new net.C_478Q(
                                                            ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$30(field_43, 3358907571065646034L, var1)).field_48Q + var14,
                                                            ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, 3358907571065646034L, var1)).field_48j + var15,
                                                            ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$36(field_43, 3358907571065646034L, var1)).field_42o + var16
                                                         );
                                                      } while (
                                                         !((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$40(field_43, 3359308987615671824L, var1))
                                                            .method_46$efbf73d2b1(var17)
                                                            .method_48$e084f7739d()
                                                            .equals(net.C_475y.method_49$c1e739f280(recovery$indy$flow$43(this, var3, 3357941308574452848L, var1)))
                                                      );
                                                   } else {
                                                      while (true) {
                                                         if (var9 != null) {
                                                            do {
                                                               var15++;
                                                               if (var9 != null) {
                                                                  do {
                                                                     if (var9 != null || ++var14 > var10) {
                                                                        break label1955;
                                                                     }

                                                                     var15 = -var10;
                                                                  } while (var15 > var10);
                                                               } else {
                                                                  while (var15 > var10) {
                                                                     if (var9 != null || ++var14 > var10) {
                                                                        break label1955;
                                                                     }

                                                                     var15 = -var10;
                                                                  }
                                                               }

                                                               var16 = -var10;
                                                            } while (var16 > var10);
                                                         } else {
                                                            for (; var16 > var10; var16 = -var10) {
                                                               var15++;
                                                               if (var9 != null) {
                                                                  while (true) {
                                                                     if (var9 != null || ++var14 > var10) {
                                                                        break label1955;
                                                                     }

                                                                     var15 = -var10;
                                                                     if (var15 <= var10) {
                                                                        break;
                                                                     }
                                                                  }
                                                               } else {
                                                                  while (var15 > var10) {
                                                                     if (var9 != null || ++var14 > var10) {
                                                                        break label1955;
                                                                     }

                                                                     var15 = -var10;
                                                                  }
                                                               }
                                                            }
                                                         }

                                                         var17 = new net.C_478Q(
                                                            ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$30(field_43, 3358907571065646034L, var1)).field_48Q + var14,
                                                            ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, 3358907571065646034L, var1)).field_48j + var15,
                                                            ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$36(field_43, 3358907571065646034L, var1)).field_42o + var16
                                                         );
                                                         if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$40(field_43, 3359308987615671824L, var1))
                                                            .method_46$efbf73d2b1(var17)
                                                            .method_48$e084f7739d()
                                                            .equals(net.C_475y.method_49$c1e739f280(recovery$indy$flow$43(this, var3, 3357941308574452848L, var1)))
                                                            )
                                                          {
                                                            break;
                                                         }

                                                         var16++;
                                                      }
                                                   }

                                                   var18 = Math.sqrt(
                                                      ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$47(field_43, 3358907571065646034L, var1)).method_40$3b7701846d(var17)
                                                   );
                                                   var73 = var9;
                                                }
                                             }

                                             var14++;
                                             if (var1 < 0L) {
                                                if (var11 == null) {
                                                   this.field_49s = null;
                                                   return null;
                                                }

                                                var28 = (net.C_47rw)recovery$indy$flow$61(
                                                   new net.C_47RX(var11),
                                                   var7,
                                                   new net.C_47RX(
                                                      new net.C_478Q(
                                                         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$56(field_43, 3358907571065646034L, var1))
                                                            .method_49$41b79b67a0(1.0F)
                                                      )
                                                   ),
                                                   var11.method_43$8abf5c6871(),
                                                   3359349665264485202L,
                                                   var1
                                                );
                                                var89 = var28;
                                                var101 = var9;
                                                break label1895;
                                             }

                                             while (true) {
                                                int[] var83 = var9;

                                                while (true) {
                                                   if (var83 != null || var14 > var10) {
                                                      break label1899;
                                                   }

                                                   int var35 = -var10;
                                                   if (var35 > var10) {
                                                      var14++;
                                                      break;
                                                   }

                                                   int var49 = -var10;

                                                   while (var49 <= var10) {
                                                      net.C_478Q var60 = new net.C_478Q(
                                                         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$30(field_43, 3358907571065646034L, var1)).field_48Q + var14,
                                                         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$33(field_43, 3358907571065646034L, var1)).field_48j + var35,
                                                         ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$36(field_43, 3358907571065646034L, var1)).field_42o + var49
                                                      );
                                                      int[] var84;
                                                      if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$40(field_43, 3359308987615671824L, var1))
                                                         .method_46$efbf73d2b1(var60)
                                                         .method_48$e084f7739d()
                                                         .equals(net.C_475y.method_49$c1e739f280(recovery$indy$flow$43(this, var3, 3357941308574452848L, var1)))) {
                                                         Math.sqrt(
                                                            ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$47(field_43, 3358907571065646034L, var1))
                                                               .method_40$3b7701846d(var60)
                                                         );
                                                         var84 = var9;
                                                      } else {
                                                         var49++;
                                                         var84 = var9;
                                                      }

                                                      if (var84 != null) {
                                                         break;
                                                      }
                                                   }

                                                   var83 = var9;
                                                }
                                             }
                                          }

                                          if (var11 == null) {
                                             this.field_49s = null;
                                             return null;
                                          }

                                          var28 = (net.C_47rw)recovery$indy$flow$61(
                                             new net.C_47RX(var11),
                                             var7,
                                             new net.C_47RX(
                                                new net.C_478Q(
                                                   ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$56(field_43, 3358907571065646034L, var1)).method_49$41b79b67a0(1.0F)
                                                )
                                             ),
                                             var11.method_43$8abf5c6871(),
                                             3359349665264485202L,
                                             var1
                                          );
                                          var89 = var28;
                                          var101 = var9;
                                          if (var1 < 0L) {
                                             break label1895;
                                          }
                                          break label1898;
                                       }
                                    }

                                    if (var101 == null) {
                                       if (var89 != null) {
                                          this.field_49s = var28;
                                       }

                                       var89 = this.field_49s;
                                    }

                                    if (var9 == null) {
                                       if (var89 == null) {
                                          return var11;
                                       }

                                       var89 = this.field_49s;
                                    }

                                    net.C_47rw var42;
                                    int var52;
                                    label1941: {
                                       var42 = var89;
                                       this.field_43h.clear();
                                       var52 = 0;
                                       if (var42 != null) {
                                          var89 = (net.C_47rw)recovery$indy$flow$67(var42, 3358511880486296288L, var1);
                                          if (var9 != null) {
                                             return (net.C_478Q)(Object) (var89);
                                          }

                                          if (var9 != null) {
                                             break label1941;
                                          }

                                          if (var89 != null) {
                                             var89 = var42;
                                             break label1941;
                                          }
                                       }

                                       var93 = this.field_43h;
                                       if (var1 <= 0L) {
                                          return (net.C_478Q)(Object) (this.field_43h);
                                       }

                                       if (var9 != null) {
                                          return (net.C_478Q)(Object) (this.field_43h);
                                       }
                                       break label1880;
                                    }

                                    net.C_478Q var65 = (net.C_478Q)recovery$indy$flow$69(
                                       (net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1
                                    );
                                    byte var94 = ((byte) (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
                                       .method_46$efbf73d2b1(var65)
                                       .method_48$e084f7739d()
                                       .method_43$aae029aa0a() ? 1 : 0));
                                    if (var9 != null) {
                                       while (var94 <= 300) {
                                          var52++;
                                          if (var9 != null || var42 == null) {
                                             return var1 <= 0L ? (net.C_478Q)(Object) (this.field_43h) : (net.C_478Q)(Object) (this.field_43h);
                                          }

                                          var89 = (net.C_47rw)recovery$indy$flow$67(var42, 3358511880486296288L, var1);
                                          if (var9 != null) {
                                             return (net.C_478Q)(Object) (var89);
                                          }

                                          if (var9 == null) {
                                             if (var89 == null) {
                                                return var1 <= 0L ? (net.C_478Q)(Object) (this.field_43h) : (net.C_478Q)(Object) (this.field_43h);
                                             }

                                             var89 = var42;
                                          }

                                          var65 = (net.C_478Q)recovery$indy$flow$69(
                                             (net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1
                                          );
                                          var94 = ((byte) (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
                                             .method_46$efbf73d2b1(var65)
                                             .method_48$e084f7739d()
                                             .method_43$aae029aa0a() ? 1 : 0));
                                       }

                                       return var1 <= 0L ? (net.C_478Q)(Object) (this.field_43h) : (net.C_478Q)(Object) (this.field_43h);
                                    }

                                    if (var94 != 0 && !this.field_43h.contains(var65)) {
                                       this.field_43h
                                          .add(
                                             (net.C_478Q)recovery$indy$flow$79(
                                                (net.C_47RX)recovery$indy$flow$78(var42, 3358968662846974719L, var1), 3358249319056874275L, var1
                                             )
                                          );
                                    }

                                    var42 = (net.C_47rw)recovery$indy$flow$81(var42, 3358511880486296288L, var1);
                                    int[] var95 = var9;
                                    if (var1 <= 0L) {
                                       while (var95 == null && var42 != null) {
                                          var89 = (net.C_47rw)recovery$indy$flow$67(var42, 3358511880486296288L, var1);
                                          if (var9 != null) {
                                             return (net.C_478Q)(Object) (var89);
                                          }

                                          if (var9 == null) {
                                             if (var89 == null) {
                                                return (net.C_478Q)(Object) (this.field_43h);
                                             }

                                             var89 = var42;
                                          }

                                          var65 = (net.C_478Q)recovery$indy$flow$69(
                                             (net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1
                                          );
                                          if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
                                                .method_46$efbf73d2b1(var65)
                                                .method_48$e084f7739d()
                                                .method_43$aae029aa0a()
                                             && !this.field_43h.contains(var65)) {
                                             this.field_43h
                                                .add(
                                                   (net.C_478Q)recovery$indy$flow$79(
                                                      (net.C_47RX)recovery$indy$flow$78(var42, 3358968662846974719L, var1), 3358249319056874275L, var1
                                                   )
                                                );
                                          }

                                          var42 = (net.C_47rw)recovery$indy$flow$81(var42, 3358511880486296288L, var1);
                                          var95 = var9;
                                       }

                                       return (net.C_478Q)(Object) (this.field_43h);
                                    }

                                    while (true) {
                                       if (var95 == null) {
                                          if (var52 > 300) {
                                             break label2016;
                                          }

                                          var52++;
                                       }

                                       if (var9 != null || var42 == null) {
                                          break label2016;
                                       }

                                       var89 = (net.C_47rw)recovery$indy$flow$67(var42, 3358511880486296288L, var1);
                                       if (var9 != null) {
                                          return (net.C_478Q)(Object) (var89);
                                       }

                                       if (var9 == null) {
                                          if (var89 == null) {
                                             break label2016;
                                          }

                                          var89 = var42;
                                       }

                                       var65 = (net.C_478Q)recovery$indy$flow$69(
                                          (net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1
                                       );
                                       if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
                                             .method_46$efbf73d2b1(var65)
                                             .method_48$e084f7739d()
                                             .method_43$aae029aa0a()
                                          && !this.field_43h.contains(var65)) {
                                          this.field_43h
                                             .add(
                                                (net.C_478Q)recovery$indy$flow$79(
                                                   (net.C_47RX)recovery$indy$flow$78(var42, 3358968662846974719L, var1), 3358249319056874275L, var1
                                                )
                                             );
                                       }

                                       var42 = (net.C_47rw)recovery$indy$flow$81(var42, 3358511880486296288L, var1);
                                       var95 = var9;
                                    }
                                 }

                                 if (var11 == null) {
                                    this.field_49s = null;
                                    return null;
                                 }

                                 var28 = (net.C_47rw)recovery$indy$flow$61(
                                    new net.C_47RX(var11),
                                    var7,
                                    new net.C_47RX(
                                       new net.C_478Q(((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$56(field_43, 3358907571065646034L, var1)).method_49$41b79b67a0(1.0F))
                                    ),
                                    var11.method_43$8abf5c6871(),
                                    3359349665264485202L,
                                    var1
                                 );
                                 var89 = var28;
                                 if (var9 == null) {
                                    if (var28 != null) {
                                       this.field_49s = var28;
                                    }

                                    var89 = this.field_49s;
                                 }

                                 if (var9 == null) {
                                    if (var89 == null) {
                                       return var11;
                                    }

                                    var89 = this.field_49s;
                                 }

                                 net.C_47rw var34 = var89;
                                 this.field_43h.clear();
                                 int var48 = 0;

                                 while (true) {
                                    if (var34 == null) {
                                       break label2016;
                                    }

                                    var89 = (net.C_47rw)recovery$indy$flow$67(var34, 3358511880486296288L, var1);
                                    if (var9 != null) {
                                       return (net.C_478Q)(Object) (var89);
                                    }

                                    if (var9 == null) {
                                       if (var89 == null) {
                                          break label2016;
                                       }

                                       var89 = var34;
                                    }

                                    net.C_478Q var58 = (net.C_478Q)recovery$indy$flow$69(
                                       (net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1
                                    );
                                    if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
                                          .method_46$efbf73d2b1(var58)
                                          .method_48$e084f7739d()
                                          .method_43$aae029aa0a()
                                       && !this.field_43h.contains(var58)) {
                                       this.field_43h
                                          .add(
                                             (net.C_478Q)recovery$indy$flow$79(
                                                (net.C_47RX)recovery$indy$flow$78(var34, 3358968662846974719L, var1), 3358249319056874275L, var1
                                             )
                                          );
                                    }

                                    var34 = (net.C_47rw)recovery$indy$flow$81(var34, 3358511880486296288L, var1);
                                    if (var9 == null) {
                                       if (var48 > 300) {
                                          break label2016;
                                       }

                                       var48++;
                                    }

                                    if (var9 != null) {
                                       break label2016;
                                    }
                                 }
                              }

                              if (var11 == null) {
                                 this.field_49s = null;
                                 return null;
                              }

                              var28 = (net.C_47rw)recovery$indy$flow$61(
                                 new net.C_47RX(var11),
                                 var7,
                                 new net.C_47RX(
                                    new net.C_478Q(((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$56(field_43, 3358907571065646034L, var1)).method_49$41b79b67a0(1.0F))
                                 ),
                                 var11.method_43$8abf5c6871(),
                                 3359349665264485202L,
                                 var1
                              );
                              var89 = var28;
                              var101 = var9;
                              break label2036;
                           }

                           if (var11 == null) {
                              this.field_49s = null;
                              return null;
                           }

                           var28 = (net.C_47rw)recovery$indy$flow$61(
                              new net.C_47RX(var11),
                              var7,
                              new net.C_47RX(new net.C_478Q(((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$56(field_43, 3358907571065646034L, var1)).method_49$41b79b67a0(1.0F))),
                              var11.method_43$8abf5c6871(),
                              3359349665264485202L,
                              var1
                           );
                           var89 = var28;
                           var101 = var9;
                        }

                        if (var101 == null) {
                           if (var89 != null) {
                              this.field_49s = var28;
                           }

                           var89 = this.field_49s;
                        }

                        if (var9 == null) {
                           if (var89 == null) {
                              return var11;
                           }

                           var89 = this.field_49s;
                        }

                        net.C_47rw var36 = var89;
                        this.field_43h.clear();

                        while (var36 != null) {
                           var89 = (net.C_47rw)recovery$indy$flow$67(var36, 3358511880486296288L, var1);
                           if (var9 != null) {
                              return (net.C_478Q)(Object) (var89);
                           }

                           if (var9 == null) {
                              if (var89 == null) {
                                 return (net.C_478Q)(Object) (this.field_43h);
                              }

                              var89 = var36;
                           }

                           net.C_478Q var61 = (net.C_478Q)recovery$indy$flow$69(
                              (net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1
                           );
                           if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
                                 .method_46$efbf73d2b1(var61)
                                 .method_48$e084f7739d()
                                 .method_43$aae029aa0a()
                              && !this.field_43h.contains(var61)) {
                              this.field_43h
                                 .add(
                                    (net.C_478Q)recovery$indy$flow$79((net.C_47RX)recovery$indy$flow$78(var36, 3358968662846974719L, var1), 3358249319056874275L, var1)
                                 );
                           }

                           var36 = (net.C_47rw)recovery$indy$flow$81(var36, 3358511880486296288L, var1);
                           if (var9 != null) {
                              return (net.C_478Q)(Object) (this.field_43h);
                           }
                        }

                        return (net.C_478Q)(Object) (this.field_43h);
                     }

                     if (var101 == null) {
                        if (var89 != null) {
                           this.field_49s = var28;
                        }

                        var89 = this.field_49s;
                     }

                     if (var9 == null) {
                        if (var89 == null) {
                           return var11;
                        }

                        var89 = this.field_49s;
                     }

                     net.C_47rw var40 = var89;
                     this.field_43h.clear();
                     int var50 = 0;

                     while (var40 != null) {
                        var89 = (net.C_47rw)recovery$indy$flow$67(var40, 3358511880486296288L, var1);
                        if (var9 != null) {
                           return (net.C_478Q)(Object) (var89);
                        }

                        if (var9 == null) {
                           if (var89 == null) {
                              return var1 <= 0L ? (net.C_478Q)(Object) (this.field_43h) : (net.C_478Q)(Object) (this.field_43h);
                           }

                           var89 = var40;
                        }

                        net.C_478Q var63 = (net.C_478Q)recovery$indy$flow$69(
                           (net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1
                        );
                        if (((int) (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
                              .method_46$efbf73d2b1(var63)
                              .method_48$e084f7739d()
                              .method_43$aae029aa0a() ? 1 : 0))
                           > 300) {
                           return var1 <= 0L ? (net.C_478Q)(Object) (this.field_43h) : (net.C_478Q)(Object) (this.field_43h);
                        }

                        var50++;
                        if (var9 != null) {
                           return var1 <= 0L ? (net.C_478Q)(Object) (this.field_43h) : (net.C_478Q)(Object) (this.field_43h);
                        }
                     }

                     return var1 <= 0L ? (net.C_478Q)(Object) (this.field_43h) : (net.C_478Q)(Object) (this.field_43h);
                  }

                  if (var101 == null) {
                     if (var89 == null) {
                        return var11;
                     }

                     var89 = this.field_49s;
                  }

                  net.C_47rw var44 = var89;
                  this.field_43h.clear();
                  int var53 = 0;
                  if (var44 == null) {
                     return (net.C_478Q)(Object) (this.field_43h);
                  }

                  var89 = (net.C_47rw)recovery$indy$flow$67(var44, 3358511880486296288L, var1);
                  if (var9 == null) {
                     if (var89 == null) {
                        return (net.C_478Q)(Object) (this.field_43h);
                     }

                     var89 = var44;
                  }

                  net.C_478Q var69 = (net.C_478Q)recovery$indy$flow$69((net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1);
                  byte var97 = ((byte) (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
                     .method_46$efbf73d2b1(var69)
                     .method_48$e084f7739d()
                     .method_43$aae029aa0a() ? 1 : 0));
                  if (var9 != null) {
                     while (var97 <= 300) {
                        var53++;
                        if (var9 != null || var44 == null) {
                           return (net.C_478Q)(Object) (this.field_43h);
                        }

                        var89 = (net.C_47rw)recovery$indy$flow$67(var44, 3358511880486296288L, var1);
                        if (var9 == null) {
                           if (var89 == null) {
                              return (net.C_478Q)(Object) (this.field_43h);
                           }

                           var89 = var44;
                        }

                        var69 = (net.C_478Q)recovery$indy$flow$69((net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1);
                        var97 = ((byte) (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
                           .method_46$efbf73d2b1(var69)
                           .method_48$e084f7739d()
                           .method_43$aae029aa0a() ? 1 : 0));
                     }

                     return (net.C_478Q)(Object) (this.field_43h);
                  }

                  while (true) {
                     if (var97 != 0 && !this.field_43h.contains(var69)) {
                        this.field_43h
                           .add((net.C_478Q)recovery$indy$flow$79((net.C_47RX)recovery$indy$flow$78(var44, 3358968662846974719L, var1), 3358249319056874275L, var1));
                     }

                     var44 = (net.C_47rw)recovery$indy$flow$81(var44, 3358511880486296288L, var1);
                     if (var9 != null || var44 == null) {
                        return (net.C_478Q)(Object) (this.field_43h);
                     }

                     var89 = (net.C_47rw)recovery$indy$flow$67(var44, 3358511880486296288L, var1);
                     if (var9 == null) {
                        if (var89 == null) {
                           return (net.C_478Q)(Object) (this.field_43h);
                        }

                        var89 = var44;
                     }

                     var69 = (net.C_478Q)recovery$indy$flow$69((net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1);
                     var97 = ((byte) (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
                        .method_46$efbf73d2b1(var69)
                        .method_48$e084f7739d()
                        .method_43$aae029aa0a() ? 1 : 0));
                  }
               }

               if (var101 == null) {
                  if (var89 == null) {
                     return var11;
                  }

                  var89 = this.field_49s;
               }

               net.C_47rw var37 = var89;
               this.field_43h.clear();

               while (var37 != null) {
                  var89 = (net.C_47rw)recovery$indy$flow$67(var37, 3358511880486296288L, var1);
                  if (var9 == null) {
                     if (var89 == null) {
                        return (net.C_478Q)(Object) (this.field_43h);
                     }

                     var89 = var37;
                  }

                  net.C_478Q var62 = (net.C_478Q)recovery$indy$flow$69((net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1);
                  if (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
                        .method_46$efbf73d2b1(var62)
                        .method_48$e084f7739d()
                        .method_43$aae029aa0a()
                     && !this.field_43h.contains(var62)) {
                     this.field_43h
                        .add((net.C_478Q)recovery$indy$flow$79((net.C_47RX)recovery$indy$flow$78(var37, 3358968662846974719L, var1), 3358249319056874275L, var1));
                  }

                  var37 = (net.C_47rw)recovery$indy$flow$81(var37, 3358511880486296288L, var1);
                  if (var9 != null) {
                     return (net.C_478Q)(Object) (this.field_43h);
                  }
               }

               return (net.C_478Q)(Object) (this.field_43h);
            }

            var93 = this.field_43h;
         }

         if (var93.isEmpty()) {
            return var11;
         }

         return (net.C_478Q)this.field_43h.get(this.field_43h.size() - 1);
      }

      if (var101 == null) {
         if (var89 == null) {
            return var11;
         }

         var89 = this.field_49s;
      }

      net.C_47rw var41 = var89;
      this.field_43h.clear();
      int var51 = 0;

      while (var41 != null) {
         var89 = (net.C_47rw)recovery$indy$flow$67(var41, 3358511880486296288L, var1);
         if (var9 == null) {
            if (var89 == null) {
               return (net.C_478Q)(Object) (this.field_43h);
            }

            var89 = var41;
         }

         net.C_478Q var64 = (net.C_478Q)recovery$indy$flow$69((net.C_47RX)recovery$indy$flow$68(var89, 3358968662846974719L, var1), 3358249319056874275L, var1);
         if (((int) (((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$71(field_43, 3359308987615671824L, var1))
               .method_46$efbf73d2b1(var64)
               .method_48$e084f7739d()
               .method_43$aae029aa0a() ? 1 : 0))
            > 300) {
            return (net.C_478Q)(Object) (this.field_43h);
         }

         var51++;
         if (var9 != null) {
            return (net.C_478Q)(Object) (this.field_43h);
         }
      }

      return (net.C_478Q)(Object) (this.field_43h);
   }





   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 83974339800164L;
      long var3 = var1 ^ 888445715402L;
      long var10002 = 446155985937216342L;
      long var5 = var3;
      ModeSetting var7 = this.settingBlock;
      return var7.method_46$5f9dc63072(var5).equals("Custom");
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      field_490.clear();
   }



   private int method_49$95d88932bd(long var1) {
      long var3;
      int var18;
      int[] var10001;
      label58: {
         int[] var7;
         var1 = a ^ var1;
         var3 = var1 ^ 120945349821952L;
         long var5 = var1 ^ 89726141173646L;
         long var10002 = 5365266915332456210L;
         long var10 = var5;
         ModeSetting var12 = this.settingBlock;
         String var8 = var12.method_46$5f9dc63072(var10);
         long var10000 = 5364762908259227807L;
         int[] var17 = AntiStrike_47Qa.method_42$d4d28024c9();
         byte var9 = -1;
         var7 = var17;
         var18 = var8.hashCode();
         label57:
         if (var7 == null) {
            label61: {
               switch (var18) {
                  case 66657:
                     var18 = (int) ((var8.equals("Bed")) ? 1 : 0);
                     if (var7 != null) {
                        break label57;
                     }

                     if (var18 == 0) {
                        break label61;
                     }

                     var18 = 0;
                     if (var1 < 0L) {
                        break;
                     }

                     var9 = 0;
                     if (var7 == null) {
                        break label61;
                     }
                  case 2092632:
                     var18 = (int) ((var8.equals("Cake")) ? 1 : 0);
                     break;
                  default:
                     break label61;
               }

               var10001 = var7;
               if (var1 <= 0L) {
                  break label58;
               }

               if (var7 != null) {
                  break label57;
               }

               if (var18 != 0) {
                  var9 = 1;
               }
            }

            var18 = var9;
         }

         var10001 = var7;
      }

      if (var10001 == null) {
         switch (var18) {
            case 0:
               return 26;
            case 1:
               return 92;
            default:
               long var19 = 5364508815079091274L;
               long var13 = var3;
               NumberSetting var15 = this.settingCustomID;
               var18 = (int)var15.method_44$474dfaa627(var13);
         }
      }

      return var18;
   }



   private void method_47$ad0e900906(RenderPass var1) {
      long var2 = a ^ 88353040301692L;
      long var4 = var2 ^ 53992098107842L;
      long var6 = var2 ^ 35937769756764L;
      long var8 = var2 ^ 79247190423137L;
      long var10001 = var2 ^ 75201359701684L;
      int var10 = (int)((var2 ^ 75201359701684L) >>> 32);
      int var11 = (int)((var2 ^ 75201359701684L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      int var14 = 0;
      long var10000 = 6066131133687826115L;
      int[] var42 = AntiStrike_47Qa.method_42$d4d28024c9();
      Iterator var15 = field_490.iterator();
      int[] var13 = var42;

      while (var15.hasNext()) {
         C_478Q var16 = (C_478Q)var15.next();
         if (var16 != null) {
            float var17;
            int var18;
            label45: {
               long var10002 = 6066028778564399638L;
               long var21 = var6;
               NumberSetting var23 = this.settingBlockLineWidth;
               var17 = (float)(var23.method_44$474dfaa627(var21) / 2.0);
               short var49 = (short)var11;
               char var10003 = (char)var12;
               int var10004 = var14++;
               long var10005 = 6064967961804566984L;
               int var24 = var10004;
               char var25 = var10003;
               short var26 = var49;
               int var27 = var10;
               ColorSetting var28 = this.settingBlockColor;
               var18 = var28.method_47$24af287d8f(var27, var26, var25, var24);
               var10001 = 6064210408402162023L;
               Minecraft var29 = field_43;
               double var43 = var29.field_42P.method_49$4b58f7ab41(var16.method_40$8abf5c6871(), var16.method_43$8abf5c6871(), var16.method_47$8abf5c6871());
               double var46 = 1.0;
               if (var13 == null) {
                  if (!(var43 > 1.0)) {
                     break label45;
                  }

                  var43 = 1.0;
                  var10002 = 6064210408402162023L;
                  Minecraft var30 = field_43;
                  var46 = var30.field_42P.method_49$4b58f7ab41(var16.method_40$8abf5c6871(), var16.method_43$8abf5c6871(), var16.method_47$8abf5c6871()) / 20.0;
               }

               double var19 = var43 - var46;
               double var44 = var19;
               double var47 = 0.3;
               if (var13 == null) {
                  if (var19 < 0.3) {
                     var19 = 0.3;
                  }

                  var44 = var17;
                  var47 = var19;
               }

               var17 = (float)(var44 * var47);
            }

            float var41 = var17;
            ShaderOptions var48 = this.settingBlock2;
            long var10007 = 6064257334582191759L;
            long var31 = var8;
            int var33 = var18;
            RenderPass var34 = var1;
            int var51 = C_47TX.method_40$6b468acafc(var34, var33, var31);
            long var10006 = 6066312130729072169L;
            int var35 = var14;
            int var36 = var51;
            RenderPass var37 = var1;
            long var38 = var4;
            ShaderOptions var40 = var48;
            RenderUtils.method_48$fe549f1055(var16, var40.method_42$f6a9c2ec55(var38, var37, var36, var35), 1.0F, var41);
            if (var13 != null) {
               break;
            }
         }
      }
   }




   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 75862687826910L;
      long var6 = var1 ^ 5451650687478L;
      long var8 = var1 ^ 52344924935716L;
      long var10 = var1 ^ 80017760765463L;
      long var10000 = 8135241215946957322L;
      int[] var12 = AntiStrike_47Qa.method_42$d4d28024c9();
      Minecraft var35 = field_43;
      if (var12 == null) {
         long var10001 = 8133909758169953710L;
         Minecraft var13 = field_43;
         if (var13.field_42P == null) {
            return;
         }

         var35 = field_43;
      }

      long var40 = 8134317649521453164L;
      Minecraft var14 = var35;
      if (var14.field_44Q != null) {
         RenderUtils.method_42$da8c82d5d4();
         GL11.glAlphaFunc(516, 0.0F);
         long var10002 = 8135144711292481704L;
         long var15 = var4;
         ShaderOptions var17 = this.settingBlock2;
         boolean var36 = var17.method_49$0dd78e0064(var15);
         long var10003 = 8134190200505876486L;
         long var18 = var8;
         ShaderOptions var20 = this.settingBlock2;
         boolean var41 = var20.method_47$0dd78e0064(var18);
         var10003 = 8135287563902865162L;
         C_47uI.method_40$9bd74f13d3(var36, var41, var6);
         C_47Fw var43 = recovery$indy$23(this);
         var10003 = 8134036120135432729L;
         C_47Fw var21 = var43;
         long var22 = var10;
         boolean var24 = false;
         C_47uI.method_42$300c7fd546(var24, var22, var21);
         RenderUtils.method_43$da8c82d5d4();
         if (var1 >= 0L) {
            BlockTraceESP_47Qm var37 = this;
            if (var12 == null) {
               if (this.field_49s == null) {
                  return;
               }

               RenderUtils.method_42$da8c82d5d4();
               var37 = this;
            }

            var10002 = 8135144711292481704L;
            long var25 = var4;
            ShaderOptions var27 = var37.settingPath;
            boolean var39 = var27.method_49$0dd78e0064(var25);
            var10003 = 8134190200505876486L;
            long var28 = var8;
            ShaderOptions var30 = this.settingPath;
            boolean var42 = var30.method_47$0dd78e0064(var28);
            var10003 = 8135287563902865162L;
            C_47uI.method_40$9bd74f13d3(var39, var42, var6);
            C_47Fw var45 = recovery$indy$24(this);
            var10003 = 8134036120135432729L;
            C_47Fw var31 = var45;
            long var32 = var10;
            boolean var34 = false;
            C_47uI.method_42$300c7fd546(var34, var32, var31);
            GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
            RenderUtils.method_43$da8c82d5d4();
         }
      }
   }




   private void method_43$ad0e900906(RenderPass var1) {
      long var2 = a ^ 122290370135808L;
      long var4 = var2 ^ 49110110912829L;
      long var10001 = var2 ^ 135268247166920L;
      int var6 = (int)((var2 ^ 135268247166920L) >>> 32);
      int var7 = (int)((var2 ^ 135268247166920L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var10000 = -1345726074543128641L;
      int[] var9 = AntiStrike_47Qa.method_42$d4d28024c9();

      for (Object recovered$element$21982 : this.field_43h) {
         C_478Q var11 = (C_478Q) recovered$element$21982;
         if (var11 != null) {
            double var13;
            double var15;
            double var17;
            label31: {
               int var12;
               label30: {
                  short var10002 = (short)var7;
                  char var10003 = (char)var8;
                  long var10005 = -1344562696498263884L;
                  byte var19 = 0;
                  char var20 = var10003;
                  short var21 = var10002;
                  int var22 = var6;
                  ColorSetting var23 = this.settingPathColor;
                  var12 = var23.method_47$24af287d8f(var22, var21, var20, var19);
                  double var32 = var11.method_40$8abf5c6871();
                  long var35 = -1346540975644010308L;
                  Minecraft var24 = field_43;
                  var13 = var32 - var24.method_45$17391f161a().method_41$fedcb3e4d3();
                  double var33 = var11.method_43$8abf5c6871();
                  long var36 = -1346540975644010308L;
                  Minecraft var25 = field_43;
                  var15 = var33 - var25.method_45$17391f161a().method_49$fedcb3e4d3();
                  double var34 = var11.method_47$8abf5c6871();
                  long var37 = -1346540975644010308L;
                  Minecraft var26 = field_43;
                  var17 = var34 - var26.method_45$17391f161a().method_45$fedcb3e4d3();
                  if (var9 == null) {
                     if (var1 != RenderPass.SHADOW) {
                        break label30;
                     }

                     long var10004 = -1344839149701539865L;
                     int var27 = var12;
                     long var28 = var4;
                     RenderPass var30 = var1;
                     ShaderOptions var31 = this.settingPath;
                     var12 = var31.method_40$d68b376f5b(var30, var28, var27);
                     RenderUtils.method_40$3ebc9ac54d(var12, 1.0F);
                  }

                  if (var9 == null) {
                     break label31;
                  }
               }

               RenderUtils.method_43$d00df7729d(var12);
            }

            RenderUtils.method_49$0bc3ff5d48(var13, var15, var17, var13 + 1.0, var15 + 1.0, var17 + 1.0);
            if (var9 != null) {
               break;
            }
         }
      }
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$25(this, 32, var3, -7101635867626531767L, var1);
      recovery$indy$26(this, 30, var3, -7101635867626531767L, var1);
      recovery$indy$27(this, 40, var3, -7101635867626531767L, var1);
      recovery$indy$28(this, 17, var3, -7101635867626531767L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_43h.clear();
      field_490.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      field_490.clear();
      recovery$indy$29(field_43, 2730994441135556270L, var4).method_42$da8c82d5d4();
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 93388925005326L;
      long var3 = var1 ^ 19542539773044L;
      long var5 = var1 ^ 7737954812061L;
      long var10003 = -4296835367754914121L;
      long var7 = var3;
      BlockTraceESP_47Qm var9 = this;
      this.field_46 = C_475y.method_49$c1e739f280(var9.method_49$95d88932bd(var7));
      field_490.removeIf(recovery$indy$30(this));
      long var10002 = -4298428816452722861L;
      long var10 = var5;
      BlockTraceESP_47Qm var12 = this;
      var12.method_44$d5acae9fbb(var10);
   }



    public BlockTraceESP_47Qm(long a0) {
        super((java.lang.String) ("BlockTraceESP"),(java.lang.String) ("BlockSpurESP"),(long) (((augustus.recovered.modules.render.BlockTraceESP_47Qm.a ^ a0) ^ 51220706931655L)),(java.awt.Color) (new java.awt.Color((int) (50),(int) (168),(int) (82))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.BlockTraceESP_47Qm.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.BlockTraceESP_47Qm.a ^ a0) ^ 111195921203978L);
        long constructorKey4 = ((augustus.recovered.modules.render.BlockTraceESP_47Qm.a ^ a0) ^ 83447303719866L);
        long constructorKey5 = ((augustus.recovered.modules.render.BlockTraceESP_47Qm.a ^ a0) ^ 81371570498611L);
        long constructorKey6 = ((augustus.recovered.modules.render.BlockTraceESP_47Qm.a ^ a0) ^ 57169385116794L);
        long constructorKey7 = ((augustus.recovered.modules.render.BlockTraceESP_47Qm.a ^ a0) ^ 126346947743835L);
        long constructorKey8 = ((augustus.recovered.modules.render.BlockTraceESP_47Qm.a ^ a0) ^ 65013259350009L);
        java.lang.Object initialValue9 = recovery$indy$flow$232(3);
        ((java.lang.Object[]) initialValue9)[0] = "Bed";
        ((java.lang.Object[]) initialValue9)[1] = "Cake";
        ((java.lang.Object[]) initialValue9)[2] = "Custom";
        client.setting.ModeSetting initialized10 = new client.setting.ModeSetting(this, "Block", constructorKey3, "Bed", (java.lang.String[]) (initialValue9));
        recovery$indy$flow$234(this, initialized10);
        client.setting.NumberSetting initialized11 = new client.setting.NumberSetting(this, "CustomID", Double.longBitsToDouble(4628011567076605952L), constructorKey7, 0.0D, Double.longBitsToDouble(4645744490609377280L), 0);
        java.lang.Object initialValue12 = recovery$indy$flow$237(this);
        java.lang.Object initialValue13 = initialValue12;
        client.setting.NumberSetting initialValue14 = initialized11;
        java.lang.Object initialValue15 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue14))))));
        java.lang.Object initialValue16 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue13))))));
        java.lang.Object initialValue17 = recovery$indy$flow$240(initialValue15, initialValue16);
        recovery$indy$flow$241(this, initialValue17);
        java.awt.Color initialized18 = new java.awt.Color(21, 121, 230, 65);
        client.setting.ColorSetting initialized19 = new client.setting.ColorSetting(constructorKey8, this, "BlockColor", initialized18);
        recovery$indy$flow$246(this, initialized19);
        client.setting.NumberSetting initialized20 = new client.setting.NumberSetting(this, "BlockLineWidth", Double.longBitsToDouble(4618441417868443648L), constructorKey7, 0.0D, Double.longBitsToDouble(4624633867356078080L), 0);
        recovery$indy$flow$249(this, initialized20);
        client.setting.NumberSetting initialized21 = new client.setting.NumberSetting(this, "BlockDistance", Double.longBitsToDouble(4632233691727265792L), constructorKey7, 1.0D, Double.longBitsToDouble(4643985272004935680L), 0);
        recovery$indy$flow$252(this, initialized21);
        client.setting.ShaderOptions initialized22 = new client.setting.ShaderOptions(constructorKey6, this, "Block");
        long initialValue23 = constructorKey4;
        client.setting.ShaderOptions initialValue24 = initialized22;
        java.lang.Object initialValue25 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue26 = recovery$indy$flow$256(initialValue25, initialValue23);
        java.lang.Object initialValue27 = recovery$indy$flow$257();
        java.lang.Object initialValue28 = initialValue27;
        long initialValue29 = constructorKey5;
        java.lang.Object initialValue30 = initialValue26;
        java.lang.Object initialValue31 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue32 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue28))))));
        java.lang.Object initialValue33 = recovery$indy$flow$260(initialValue31, initialValue29, initialValue32);
        recovery$indy$flow$261(this, initialValue33);
        java.awt.Color initialized34 = new java.awt.Color(21, 121, 230, 65);
        client.setting.ColorSetting initialized35 = new client.setting.ColorSetting(constructorKey8, this, "PathColor", initialized34);
        recovery$indy$flow$266(this, initialized35);
        client.setting.ShaderOptions initialized36 = new client.setting.ShaderOptions(constructorKey6, this, "Path");
        long initialValue37 = constructorKey4;
        client.setting.ShaderOptions initialValue38 = initialized36;
        java.lang.Object initialValue39 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue40 = recovery$indy$flow$270(initialValue39, initialValue37);
        java.lang.Object initialValue41 = recovery$indy$flow$271();
        java.lang.Object initialValue42 = initialValue41;
        long initialValue43 = constructorKey5;
        java.lang.Object initialValue44 = initialValue40;
        java.lang.Object initialValue45 = ((java.lang.Object)(((client.setting.ShaderOptions) (((java.lang.Object)(initialValue44))))));
        java.lang.Object initialValue46 = ((java.lang.Object)(((java.awt.Color) (((java.lang.Object)(initialValue42))))));
        java.lang.Object initialValue47 = recovery$indy$flow$274(initialValue45, initialValue43, initialValue46);
        recovery$indy$flow$275(this, initialValue47);
        client.setting.NumberSetting initialized48 = new client.setting.NumberSetting(this, "PathSearchRange", Double.longBitsToDouble(4621819117588971520L), constructorKey7, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        recovery$indy$flow$278(this, initialized48);
        recovery$indy$flow$279(this, null);
        java.util.ArrayList initialized49 = new java.util.ArrayList();
        recovery$indy$flow$282(this, initialized49);
        recovery$indy$flow$283(this, null);
    }





    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native double recovery$indy$flow$25(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$27(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$30(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$33(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$36(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$40(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$43(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$47(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$56(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$61(java.lang.Object a0,long a1,java.lang.Object a2,int a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$67(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$68(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$69(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$71(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$78(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$79(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$81(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$232(int a0);
    private static native void recovery$indy$flow$234(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$237(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$240(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$241(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$246(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$249(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$252(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$256(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$257() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$260(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$261(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$266(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$270(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$271() {
        return java.awt.Color.black;
    }


    private static native java.lang.Object recovery$indy$flow$274(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$275(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$278(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$279(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.BlockTraceESP_47Qm) (a0)).field_49s = ((net.C_47rw) (a1));
        return;
    }
    private static native void recovery$indy$flow$282(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$283(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.BlockTraceESP_47Qm) (a0)).field_46 = ((net.C_475y) (a1));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native C_47UZ recovery$indy$2(Object var0, long var1, long var3);
   private static native C_47UZ recovery$indy$3(Object var0, long var1, long var3);
   private static native int recovery$indy$4(Object var0, long var1, long var3, long var5);
   private static native C_478Q recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native C_47Fw recovery$indy$23(BlockTraceESP_47Qm var0);
   private static native C_47Fw recovery$indy$24(BlockTraceESP_47Qm var0);
   private static native void recovery$indy$25(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$26(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$27(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$28(Object var0, int var1, long var2, long var4, long var6);
   private static native RenderGlobal recovery$indy$29(Object var0, long var1, long var3);
   private static native Predicate recovery$indy$30(BlockTraceESP_47Qm var0);
   private static native MethodHandle recovery$constant$32();
}
