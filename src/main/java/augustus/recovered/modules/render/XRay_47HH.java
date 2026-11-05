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
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_42W;
import net.C_45n;
import net.C_475y;
import net.C_478Q;
import net.C_47ET;
import net.C_47JD;
import net.C_47OE;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47UZ;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47mP;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.util.ResourceLocation;
import net.C_47qF;
import net.C_47rg;
import client.module.Category;
import net.C_47xz;
import net.C_484;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class XRay_47HH extends client.module.Module implements net.C_47mP,net.C_47xz {
    public static boolean field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private static client.setting.BooleanSetting field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private static client.setting.BooleanSetting field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private static client.setting.NumberSetting field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private static boolean field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private static boolean field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private static int field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.HashMap field_41; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static boolean field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

   public void method_46$4072749d5d(int var1, int var2, C_47OE var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
      recovery$indy$1(var3, true, -4185061758909634555L, var4);
   }



    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private static boolean method_48$aae029aa0a() {
      long var0 = a ^ 351571458022L;
      long var10000 = -2780398899512370944L;
      int[] var2 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -2780653728518093337L;
      BooleanSetting var3 = field_44;
      boolean var5 = var3.method_49$aae029aa0a();
      if (var2 == null) {
         if (!var5) {
            return false;
         }

         var10001 = -2780653728518093337L;
         BooleanSetting var4 = field_49;
         var5 = var4.method_49$aae029aa0a();
      }

      return var2 != null ? var5 : !var5;
   }



   public static void method_48$f633c984d8(boolean var0) {
      field_46 = var0;
   }



   private void method_48$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 137062149154666L;
      field_40 = (int)recovery$indy$2(field_42, var3, 3104631838747247454L, var1);
      field_45 = recovery$indy$3(field_44, 3104516742706608027L, var1);
      field_47 = recovery$indy$4(field_49, 3104516742706608027L, var1);
   }



   static boolean method_45$6b49beec50(XRay_47HH var0, boolean var1) {
      return var0.field_43a = var1;
   }



   public static boolean method_45$aae029aa0a() {
      boolean var0 = method_483$aae029aa0a();
      return !var0;
   }



   public static C_47rg method_47$c85404e746(long var0, C_475y var2, @Nullable C_47UZ var3, C_478Q var4) {
      var0 = a ^ var0;
      long var5 = var0 ^ 106335337290273L;
      long var7 = var0 ^ 36885306967735L;
      int[] var9 = recovery$indy$5(-3833966915994088799L, var0);
      C_47qF var10 = (C_47qF)field_41.get(var2);
      C_47qF var10000 = var10;
      if (var9 == null) {
         if (var10 == null) {
            return C_47rg.HIDE;
         }

         var10000 = var10;
      }

      int var13 = (int) ((var10000.field_47) ? 1 : 0);
      int[] var10001 = var9;
      if (var0 >= 0L) {
         if (var9 == null) {
            if (!var10000.field_47) {
               return C_47rg.HIDE;
            }

            var13 = (int) ((recovery$indy$6(field_44, -3834770401298262458L, var0)) ? 1 : 0);
         }

         var10001 = var9;
      }

      if (var0 >= 0L) {
         if (var10001 == null) {
            if (var13 == 0) {
               return C_47rg.FORCE_VISIBLE;
            }

            var13 = (int) ((recovery$indy$7(field_49, -3834770401298262458L, var0)) ? 1 : 0);
         }

         var10001 = var9;
      }

      if (var10001 == null) {
         if (var13 != 0) {
            return C_47rg.NOTHING;
         }

         var13 = (int)recovery$indy$8(field_42, var7, -3834670973369638269L, var0);
      }

      int var11 = var13;
      boolean var14 = recovery$indy$9(var4, var5, C_484.UP, var11, -3834684442907431096L, var0);
      var10001 = var9;
      if (var0 > 0L) {
         if (var9 == null) {
            if (var14) {
               return C_47rg.FORCE_VISIBLE;
            }

            var14 = recovery$indy$10(var4, var5, C_484.DOWN, var11, -3834684442907431096L, var0);
         }

         var10001 = var9;
      }

      if (var0 >= 0L) {
         if (var10001 == null) {
            if (var14) {
               return C_47rg.FORCE_VISIBLE;
            }

            var14 = recovery$indy$11(var4, var5, C_484.EAST, var11, -3834684442907431096L, var0);
         }

         var10001 = var9;
      }

      if (var0 > 0L) {
         if (var10001 == null) {
            if (var14) {
               return C_47rg.FORCE_VISIBLE;
            }

            var14 = recovery$indy$12(var4, var5, C_484.WEST, var11, -3834684442907431096L, var0);
         }

         var10001 = var9;
      }

      if (var0 > 0L) {
         if (var10001 == null) {
            if (var14) {
               return C_47rg.FORCE_VISIBLE;
            }

            var14 = recovery$indy$13(var4, var5, C_484.NORTH, var11, -3834684442907431096L, var0);
         }

         var10001 = var9;
      }

      if (var10001 == null) {
         if (var14) {
            return C_47rg.FORCE_VISIBLE;
         }

         var14 = recovery$indy$14(var4, var5, C_484.SOUTH, var11, -3834684442907431096L, var0);
      }

      return var14 ? C_47rg.FORCE_VISIBLE : C_47rg.HIDE;
   }




   private static boolean method_47$3af5c6f102(C_478Q var0, long var1, C_484 var3, int var4) {
      var1 = a ^ var1;
      int[] var5 = recovery$indy$15(4494698339852516874L, var1);
      int var6 = 1;

      while (true) {
         if (var6 <= var4) {
            int var7 = var0.method_43$8abf5c6871() + var6 * var3.method_47$8abf5c6871();
            int[] var10001 = var5;
            if (var1 > 0L) {
               if (var5 != null) {
                  return var7 != 0;
               }

               var10001 = var5;
            }

            if (var10001 != null) {
               return var7 != 0;
            }

            if (var7 < 0) {
               break;
            }

            int var13 = var7;
            if (var1 > 0L) {
               int var17 = 255;
               if (var5 == null) {
                  if (var7 > 255) {
                     break;
                  }

                  var13 = var0.method_40$8abf5c6871();
                  var17 = var3.method_49$8abf5c6871() * var6;
               }

               var13 += var17;
            }

            int var8 = var13;
            int var9 = var0.method_47$8abf5c6871() + var3.method_40$8abf5c6871() * var6;
            C_42W var10 = recovery$indy$16(field_43, 4495622025862246593L, var1).method_46$c2ef50bdaf(var8, var9);
            boolean var14 = var10.method_41$aae029aa0a();
            if (var5 != null) {
               return var14;
            }

            if (var14) {
               return false;
            }

            C_475y var11 = recovery$indy$17(field_43, 4495622025862246593L, var1)
               .method_46$04bc0e019e(var10, var8, var0.method_43$8abf5c6871() + var3.method_47$8abf5c6871() * var6, var9)
               .method_48$e084f7739d();
            int[] var15 = var5;
            if (var1 >= 0L) {
               if (var5 == null) {
                  var14 = var11.method_42F$aae029aa0a();
                  if (var1 <= 0L) {
                     return var14;
                  }

                  if (!var14) {
                     return false;
                  }

                  var6++;
               }

               var15 = var5;
            }

            if (var15 == null) {
               continue;
            }
         }

         return true;
      }

      return false;
   }




   public void method_43$d0d1553836(long var1, C_47OE var3) {
      recovery$indy$18(var3, true, 8025006156652085936L, var1);
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$19(this, 22, var3, -7099035937585474647L, var1);
      recovery$indy$20(this, 40, var3, -7099035937585474647L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      field_48 = false;
      recovery$indy$21(field_43, -7737938632402984981L, var1).method_42$da8c82d5d4();
   }



   public static boolean method_483$aae029aa0a() {
      return field_46;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 76650071613558L;
      field_48 = true;
      recovery$indy$22(field_43, 2732353021402656413L, var4).method_42$da8c82d5d4();
      recovery$indy$23(this, var6, 2732329324108344552L, var4);
   }



    public void method_487$da8c82d5d4() {
        long l;
        long l2 = l = a ^ 0xF4F9FCCAADEL;
        long l3 = l2 ^ 0x5B31C47081CEL;
        long l4 = l2 ^ 0x241BEC27882EL;
        int[] nArray = AntiStrike_47Qa.method_42$d4d28024c9();
        boolean bl = this.field_43a;
        if (nArray != null) {
            if (!bl) return;
            Minecraft c_47nT = field_43;
            c_47nT.field_44P.method_42$da8c82d5d4();
            long l5 = l3;
            XRay_47HH xRay_47HH = this;
            xRay_47HH.method_48$e45a9973e5(l5);
            return;
        }
        if (bl) {
            this.field_43a = false;
            Minecraft c_47nT = field_43;
            c_47nT.field_44P.method_42$da8c82d5d4();
        }
        BooleanSetting c_47TV = field_44;
        if (c_47TV.method_49$aae029aa0a() == field_45) {
            if (!field_45) return;
            BooleanSetting c_47TV2 = field_49;
            if (field_47 == c_47TV2.method_49$aae029aa0a()) {
                if (field_47) return;
                NumberSetting c_47TS = field_42;
                long l6 = l4;
                if ((double)field_40 == c_47TS.method_44$474dfaa627(l6)) return;
            }
        }
        Minecraft c_47nT = field_43;
        c_47nT.field_44P.method_42$da8c82d5d4();
        long l7 = l3;
        XRay_47HH xRay_47HH = this;
        xRay_47HH.method_48$e45a9973e5(l7);
    }




    public XRay_47HH(byte a0,long a1) {
        super((java.lang.String) ("XRay"),(java.lang.String) ("R\u00f6ntgenstrahl"),(long) ((((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.XRay_47HH.a) ^ 12046737252617L)),(java.awt.Color) (java.awt.Color.BLUE),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = ((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.XRay_47HH.a);
        long constructorKey2 = (((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.XRay_47HH.a) ^ 64909844753663L);
        long constructorKey3 = (((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.XRay_47HH.a) ^ 125351942645807L);
        long constructorKey4 = (((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.XRay_47HH.a) ^ 136134807551250L);
        long constructorKey5 = (((((long) (a0) << 56) | ((a1 << 8) >>> 8)) ^ augustus.recovered.modules.render.XRay_47HH.a) ^ 95143885816469L);
        java.lang.Object initialValue6 = recovery$indy$flow$117();
        recovery$indy$flow$118(this, false);
        java.lang.Object initialValue7 = recovery$indy$flow$119();
        java.lang.Object initialValue8 = recovery$indy$flow$120(initialValue7);
        java.lang.Object initialValue9 = recovery$indy$flow$121(initialValue8);
        java.lang.Object initialValue10 = initialValue9;
        java.lang.Object initialValue11 = initialValue6;
        XRay_47HH loopLocal12 = this;
        long loopLocal13 = constructorKey1;
        long loopLocal14 = constructorKey2;
        long loopLocal15 = constructorKey3;
        long loopLocal16 = constructorKey4;
        long loopLocal17 = constructorKey5;
        java.lang.Object loopLocal18 = initialValue10;
        java.lang.Object loopLocal19 = initialValue11;
        XRay_47HH loopExit23;
        long loopExit24;
        long loopExit25;
        long loopExit26;
        long loopExit27;
        long loopExit28;
        java.lang.Object loopExit29;
        loop20: while (true) {
            boolean initialValue21 = recovery$indy$flow$122(loopLocal18);
            if ((int) ((initialValue21 ? 1 : 0)) == 0) {
                java.lang.Object initialValue22 = recovery$indy$flow$133();
                XRay_47HH loopNext30 = loopLocal12;
                long loopNext31 = loopLocal13;
                long loopNext32 = loopLocal14;
                long loopNext33 = loopLocal15;
                long loopNext34 = loopLocal16;
                long loopNext35 = loopLocal17;
                java.lang.Object loopNext36 = initialValue22;
                loopExit23 = loopNext30;
                loopExit24 = loopNext31;
                loopExit25 = loopNext32;
                loopExit26 = loopNext33;
                loopExit27 = loopNext34;
                loopExit28 = loopNext35;
                loopExit29 = loopNext36;
                break loop20;
            } else {
                java.lang.Object initialValue37 = recovery$indy$flow$123(loopLocal18);
                java.lang.Object initialValue38 = ((java.lang.Object)(((net.minecraft.util.ResourceLocation) (((java.lang.Object)(initialValue37))))));
                java.lang.Object initialValue39 = initialValue38;
                java.lang.Object initialValue40 = recovery$indy$flow$125(initialValue39);
                java.lang.Object initialValue41 = initialValue40;
                java.lang.Object initialValue42 = recovery$indy$flow$126(initialValue41);
                java.lang.Object initialValue43 = initialValue42;
                java.lang.Object initialValue44 = recovery$indy$flow$127();
                if (loopLocal19 != null) {
                    XRay_47HH loopNext45 = loopLocal12;
                    long loopNext46 = loopLocal13;
                    long loopNext47 = loopLocal14;
                    long loopNext48 = loopLocal15;
                    long loopNext49 = loopLocal16;
                    long loopNext50 = loopLocal17;
                    java.lang.Object loopNext51 = initialValue44;
                    loopExit23 = loopNext45;
                    loopExit24 = loopNext46;
                    loopExit25 = loopNext47;
                    loopExit26 = loopNext48;
                    loopExit27 = loopNext49;
                    loopExit28 = loopNext50;
                    loopExit29 = loopNext51;
                    break loop20;
                } else {
                    boolean initialValue52 = recovery$indy$flow$129(initialValue43);
                    int merged55;
                    if ((int) ((initialValue52 ? 1 : 0)) != 0) {
                        merged55 = 1;
                    } else {
                        boolean initialValue53 = recovery$indy$flow$130(initialValue43);
                        int merged54;
                        if ((int) ((initialValue53 ? 1 : 0)) == 0) {
                            merged54 = 0;
                        } else {
                            merged54 = 1;
                        }
                        merged55 = merged54;
                    }
                    net.C_47qF initialized56 = new net.C_47qF((augustus.recovered.modules.render.XRay_47HH) (loopLocal12), (java.lang.String) (initialValue41), (merged55 != 0), null);
                    java.lang.Object initialValue57 = recovery$indy$flow$132(initialValue44, initialValue43, initialized56);
                    if (loopLocal19 == null) {
                        XRay_47HH loopNext58 = loopLocal12;
                        long loopNext59 = loopLocal13;
                        long loopNext60 = loopLocal14;
                        long loopNext61 = loopLocal15;
                        long loopNext62 = loopLocal16;
                        long loopNext63 = loopLocal17;
                        java.lang.Object loopNext64 = loopLocal18;
                        java.lang.Object loopNext65 = loopLocal19;
                        loopLocal12 = loopNext58;
                        loopLocal13 = loopNext59;
                        loopLocal14 = loopNext60;
                        loopLocal15 = loopNext61;
                        loopLocal16 = loopNext62;
                        loopLocal17 = loopNext63;
                        loopLocal18 = loopNext64;
                        loopLocal19 = loopNext65;
                        continue loop20;
                    } else {
                        java.lang.Object initialValue66 = recovery$indy$flow$133();
                        XRay_47HH loopNext67 = loopLocal12;
                        long loopNext68 = loopLocal13;
                        long loopNext69 = loopLocal14;
                        long loopNext70 = loopLocal15;
                        long loopNext71 = loopLocal16;
                        long loopNext72 = loopLocal17;
                        java.lang.Object loopNext73 = initialValue66;
                        loopExit23 = loopNext67;
                        loopExit24 = loopNext68;
                        loopExit25 = loopNext69;
                        loopExit26 = loopNext70;
                        loopExit27 = loopNext71;
                        loopExit28 = loopNext72;
                        loopExit29 = loopNext73;
                        break loop20;
                    }
                }
            }
        }
        java.lang.Object initialValue74 = recovery$indy$flow$134(loopExit29);
        java.lang.Object initialValue75 = recovery$indy$flow$135(0);
        java.lang.Object initialValue76 = recovery$indy$flow$136(initialValue74, initialValue75);
        java.lang.Object initialValue77 = recovery$indy$flow$137(initialValue76);
        java.lang.Object initialValue78 = initialValue77;
        java.lang.Object initialValue79 = recovery$indy$flow$138();
        java.lang.Object initialValue80 = recovery$indy$flow$139(initialValue79);
        recovery$indy$flow$140(initialValue78, initialValue80);
        client.setting.MultiSelectSetting initialized81 = new client.setting.MultiSelectSetting((client.module.Module) (loopExit23), "Visible Blocks", loopExit25, (net.C_47OZ[]) (initialValue78));
        client.setting.BooleanSetting initialized82 = new client.setting.BooleanSetting((client.module.Module) (loopExit23), loopExit27, "Anti-Xray", false);
        recovery$indy$flow$145(initialized82);
        client.setting.BooleanSetting initialized83 = new client.setting.BooleanSetting((client.module.Module) (loopExit23), loopExit27, "Simple", true);
        java.lang.Object initialValue84 = recovery$indy$flow$148();
        java.lang.Object initialValue85 = recovery$indy$flow$149(initialValue84);
        java.lang.Object initialValue86 = recovery$indy$flow$150(initialValue84);
        java.lang.Object initialValue87 = initialValue86;
        long initialValue88 = loopExit26;
        client.setting.BooleanSetting initialValue89 = initialized83;
        java.lang.Object initialValue90 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue89))))));
        java.lang.Object initialValue91 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue87))))));
        java.lang.Object initialValue92 = recovery$indy$flow$153(initialValue90, initialValue88, initialValue91);
        java.lang.Object initialValue93 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue92))))));
        recovery$indy$flow$155(initialValue93);
        client.setting.NumberSetting initialized94 = new client.setting.NumberSetting((client.module.Module) (loopExit23), "Minimum free space", 1.0D, loopExit28, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue95 = recovery$indy$flow$158();
        java.lang.Object initialValue96 = initialValue95;
        client.setting.NumberSetting initialValue97 = initialized94;
        java.lang.Object initialValue98 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue97))))));
        java.lang.Object initialValue99 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue96))))));
        java.lang.Object initialValue100 = recovery$indy$flow$161(initialValue98, initialValue99);
        recovery$indy$flow$162(initialValue100);
        return;
    }




    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$117();
    private static void recovery$indy$flow$118(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.render.XRay_47HH) (a0)).field_43a = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$119() {
        return net.C_475y.field_49H;
    }
    private static native java.lang.Object recovery$indy$flow$120(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$121(java.lang.Object a0) {
        return ((java.util.Set) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$122(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$123(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static native java.lang.Object recovery$indy$flow$125(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$126(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$127() {
        return augustus.recovered.modules.render.XRay_47HH.field_41;
    }
    private static boolean recovery$indy$flow$129(java.lang.Object a0) {
        return (a0 instanceof net.C_47JD);
    }
    private static boolean recovery$indy$flow$130(java.lang.Object a0) {
        return (a0 instanceof net.C_47ET);
    }
    private static java.lang.Object recovery$indy$flow$132(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }
    private static java.lang.Object recovery$indy$flow$133() {
        return augustus.recovered.modules.render.XRay_47HH.field_41;
    }
    private static java.lang.Object recovery$indy$flow$134(java.lang.Object a0) {
        return ((java.util.HashMap) (a0)).values();
    }
    private static native java.lang.Object recovery$indy$flow$135(int a0);
    private static java.lang.Object recovery$indy$flow$136(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.Collection) (a0)).toArray(((java.lang.Object[]) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$137(java.lang.Object a0) {
        return ((net.C_47qF[]) (a0));
    }
    private static native java.lang.Object recovery$indy$flow$138();
    private static java.lang.Object recovery$indy$flow$139(java.lang.Object a0) {
        return java.util.Comparator.comparing(((java.util.function.Function) (a0)));
    }
    private static void recovery$indy$flow$140(java.lang.Object a0,java.lang.Object a1) {
        java.util.Arrays.sort(((java.lang.Object[]) (a0)), ((java.util.Comparator) (a1)));
        return;
    }
    private static void recovery$indy$flow$145(java.lang.Object a0) {
        augustus.recovered.modules.render.XRay_47HH.field_44 = ((client.setting.BooleanSetting) (a0));
        return;
    }
    private static java.lang.Object recovery$indy$flow$148() {
        return augustus.recovered.modules.render.XRay_47HH.field_44;
    }
    private static java.lang.Object recovery$indy$flow$149(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$150(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$153(java.lang.Object a0,long a1,java.lang.Object a2);

    private static void recovery$indy$flow$155(java.lang.Object a0) {
        augustus.recovered.modules.render.XRay_47HH.field_49 = ((client.setting.BooleanSetting) (a0));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$158();


    private static native java.lang.Object recovery$indy$flow$161(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$162(java.lang.Object a0) {
        augustus.recovered.modules.render.XRay_47HH.field_42 = ((client.setting.NumberSetting) (a0));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native void recovery$indy$1(Object var0, boolean var1, long var2, long var4);
   private static native double recovery$indy$2(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$3(Object var0, long var1, long var3);
   private static native boolean recovery$indy$4(Object var0, long var1, long var3);
   private static native int[] recovery$indy$5(long var0, long var2);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3);
   private static native double recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$9(Object var0, long var1, Object var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$10(Object var0, long var1, Object var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$11(Object var0, long var1, Object var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$12(Object var0, long var1, Object var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$13(Object var0, long var1, Object var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$14(Object var0, long var1, Object var3, int var4, long var5, long var7);
   private static native int[] recovery$indy$15(long var0, long var2);
   private static native WorldClient recovery$indy$16(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$17(Object var0, long var1, long var3);
   private static native void recovery$indy$18(Object var0, boolean var1, long var2, long var4);
   private static native void recovery$indy$19(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$20(Object var0, int var1, long var2, long var4, long var6);
   private static native RenderGlobal recovery$indy$21(Object var0, long var1, long var3);
   private static native RenderGlobal recovery$indy$22(Object var0, long var1, long var3);
   private static native void recovery$indy$23(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$27();
}
