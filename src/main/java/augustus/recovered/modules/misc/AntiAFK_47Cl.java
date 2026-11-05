package augustus.recovered.modules.misc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_472n;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.RangeSetting;
import net.C_47cu;
import net.C_47hi;
import client.module.Category;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AntiAFK_47Cl extends client.module.Module implements net.C_47hi {
    private final client.setting.RangeSetting settingAFKDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingMove = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMoveDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMoveDuration = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInInv = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyIfAfk = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingDelayToStartAntiAfkAfterBeingAFK = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Method d(long a0,long a1);

   private boolean method_41$38ee189b62(net.C_472n var1, long var2) {
      int var86;
      int[] var94;
      label113: {
         int[] var8;
         label112: {
            long var4;
            long var6;
            label111: {
               label116: {
                  var2 = a ^ var2;
                  var4 = var2 ^ 39512386364857L;
                  var6 = var2 ^ 52601369720813L;
                  var8 = recovery$indy$1(-6213382939645663629L, var2);
                  float var113;
                  int var10000 = (var113 = recovery$indy$2(var1, -6211738577586353770L, var2) - 0.0F) == 0.0F ? 0 : (var113 < 0.0F ? -1 : 1);
                  int[] var72 = var8;
                  var86 = var10000;
                  if (var72 == null) {
                     int var95 = var86;
                     if ((var95) != 0) {
                        break label116;
                     }

                     float var114;
                     var86 = (var114 = recovery$indy$3(var1, -6211879480207758464L, var2) - 0.0F) == 0.0F ? 0 : (var114 < 0.0F ? -1 : 1);
                  }

                  long var115;
                  int var96 = (var115 = var2 - 0L) == 0L ? 0 : (var115 < 0L ? -1 : 1);
                  var94 = var8;
                  var86 = var86;
                  if (var96 >= 0) {
                     var72 = var94;
                     var86 = var86;
                     if (var72 == null) {
                        var86 = var86;
                        int var98 = var86;
                        if ((var98) != 0) {
                           break label116;
                        }

                        var86 = ((int) (recovery$indy$4(var1, -6213749319270056573L, var2) ? 1 : 0));
                     }

                     var94 = var8;
                     var86 = var86;
                  }

                  long var116;
                  int var99 = (var116 = var2 - 0L) == 0L ? 0 : (var116 < 0L ? -1 : 1);
                  var94 = var94;
                  var86 = var86;
                  if (var99 >= 0) {
                     var72 = var94;
                     var86 = var86;
                     if (var72 == null) {
                        var86 = var86;
                        int var101 = var86;
                        if ((var101) != 0) {
                           break label116;
                        }

                        var86 = ((int) (recovery$indy$5(var1, -6211613165826603605L, var2) ? 1 : 0));
                     }

                     var94 = var8;
                     var86 = var86;
                  }

                  long var117;
                  int var102 = (var117 = var2 - 0L) == 0L ? 0 : (var117 < 0L ? -1 : 1);
                  var94 = var94;
                  var86 = var86;
                  if (var102 >= 0) {
                     var72 = var94;
                     var86 = var86;
                     if (var72 == null) {
                        var86 = var86;
                        int var104 = var86;
                        if ((var104) != 0) {
                           break label116;
                        }

                        float var118;
                        var86 = (
                                 var118 = recovery$indy$6(field_43, -6212046733363654087L, var2).field_48h
                                    - recovery$indy$7(field_43, -6212046733363654087L, var2).field_43F
                              )
                              == 0.0F
                           ? 0
                           : (var118 < 0.0F ? -1 : 1);
                     }

                     var94 = var8;
                     var86 = var86;
                  }

                  long var119;
                  int var105 = (var119 = var2 - 0L) == 0L ? 0 : (var119 < 0L ? -1 : 1);
                  var94 = var94;
                  var86 = var86;
                  if (var105 >= 0) {
                     var72 = var94;
                     var86 = var86;
                     if (var72 == null) {
                        var86 = var86;
                        int var107 = var86;
                        if ((var107) != 0) {
                           break label116;
                        }

                        float var120;
                        var86 = (
                                 var120 = recovery$indy$8(field_43, -6212046733363654087L, var2).field_48z
                                    - recovery$indy$9(field_43, -6212046733363654087L, var2).field_43n
                              )
                              == 0.0F
                           ? 0
                           : (var120 < 0.0F ? -1 : 1);
                     }

                     var94 = var8;
                     var86 = var86;
                  }

                  long var121;
                  int var108 = (var121 = var2 - 0L) == 0L ? 0 : (var121 < 0L ? -1 : 1);
                  var94 = var94;
                  var86 = var86;
                  if (var108 < 0) {
                     break label113;
                  }

                  var72 = var94;
                  var86 = var86;
                  if (var72 != null) {
                     break label112;
                  }

                  var86 = var86;
                  int var110 = var86;
                  if (!(var110 != 0)) {
                     break label111;
                  }
               }

               recovery$indy$10(this.field_46, -6212131755008348974L, var2);
            }

            var86 = ((int) (recovery$indy$12(this.field_46, recovery$indy$11(this.settingDelayToStartAntiAfkAfterBeingAFK, var4, -6213208084839699515L, var2), var6, -6213260879286582680L, var2) ? 1 : 0));
         }

         var94 = var8;
         var86 = var86;
      }

      int[] var111 = var94;
      var86 = var86;
      if (var111 == null) {
         int var112 = var86;
         if ((var112) != 0) {
            return false;
         }

         var86 = 1;
      }

      return (var86 != 0);
   }




   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var4 = var2 ^ 21937934067770L;
      long var6 = var2 ^ 77412314636080L;
      int[] var8 = recovery$indy$13(6395387040798693238L, var2);
      int var10000 = (int) ((recovery$indy$14(this, var1, var4, 6399325040588439066L, var2)) ? 1 : 0);
      if (var8 == null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = (int) ((recovery$indy$15(this.settingInInv, 6396233408486839862L, var2)) ? 1 : 0);
      }

      int[] var10001 = var8;
      if (var2 >= 0L) {
         if (var8 == null) {
            if (var10000 == 0 && recovery$indy$16(field_43, 6395253332141435184L, var2) != null) {
               return;
            }

            var10000 = (int) ((recovery$indy$17(this.settingMove, 6396233408486839862L, var2)) ? 1 : 0);
         }

         var10001 = var8;
      }

      label149: {
         label148:
         if (var10001 == null) {
            label146:
            if (var10000 == 0) {
               label155: {
                  float var11;
                  var10000 = (var11 = recovery$indy$18(var1, 6399090806357227667L, var2) - 0.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
                  var10001 = var8;
                  if (var2 >= 0L) {
                     if (var8 == null) {
                        if (var10000 != 0) {
                           break label155;
                        }

                        float var12;
                        var10000 = (var12 = recovery$indy$19(var1, 6399512840233704069L, var2) - 0.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
                     }

                     var10001 = var8;
                  }

                  if (var2 < 0L) {
                     break label149;
                  }

                  if (var10001 != null) {
                     break label148;
                  }

                  if (var10000 == 0) {
                     break label146;
                  }
               }

               recovery$indy$20(this.field_40, 6399413408890772951L, var2);
            }

            var10000 = (int) ((recovery$indy$22(this.field_40, recovery$indy$21(this.settingAFKDelay, 6395493317062580477L, var2), var6, 6398519662700016006L, var2)) ? 1 : 0);
         }

         var10001 = var8;
      }

      if (var2 >= 0L) {
         if (var10001 == null) {
            if (var10000 != 0) {
               recovery$indy$23(var1, true, 6395138984473752753L, var2);
               recovery$indy$24(this.field_40, 6399413408890772951L, var2);
            }

            var10000 = ((int) (recovery$indy$27(
               this.field_49,
               recovery$indy$25(this.settingMoveDelay, 6395493317062580477L, var2) + recovery$indy$26(this.settingMoveDuration, 6395493317062580477L, var2),
               var6,
               6398519662700016006L,
               var2
            ) ? 1 : 0));
         }

         var10001 = var8;
      }

      if (var2 >= 0L) {
         if (var10001 == null) {
            if (var10000 != 0) {
               this.field_42++;
               recovery$indy$28(this.settingMoveDelay, 6395211183223240920L, var2);
               recovery$indy$29(this.settingMoveDuration, 6395211183223240920L, var2);
               recovery$indy$30(this.field_49, 6399413408890772951L, var2);
               this.field_43a = false;
            }

            var10000 = (int) ((recovery$indy$32(this.field_49, recovery$indy$31(this.settingMoveDelay, 6395493317062580477L, var2), var6, 6398519662700016006L, var2)) ? 1 : 0);
         }

         var10001 = var8;
      }

      if (var2 >= 0L) {
         if (var10001 == null) {
            if (var10000 != 0) {
               this.field_43a = true;
            }

            var10000 = (int) ((this.field_43a) ? 1 : 0);
         }

         var10001 = var8;
      }

      if (var10001 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.field_42 % 4;
      }

      int var9 = var10000;
      if (var9 < 2) {
         recovery$indy$33(var1, var9 == 0 ? 1.0F : -1.0F, 6395619930249529536L, var2);
         if (var8 == null) {
            return;
         }
      }

      recovery$indy$34(var1, var9 == 2 ? 1.0F : -1.0F, 6395545588983055059L, var2);
   }





   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$35(this, 21, var3, -7099724428321075750L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      this.field_42 = 0;
      this.field_43a = false;
      recovery$indy$36(this.settingAFKDelay, 2732022787269854706L, var4);
      recovery$indy$37(this.settingMoveDelay, 2732022787269854706L, var4);
   }



    public AntiAFK_47Cl(long a0) {
        super((java.lang.String) ("AntiAFK"),(java.lang.String) ("NichtAbwesend"),(long) (((augustus.recovered.modules.misc.AntiAFK_47Cl.a ^ a0) ^ 67143522447009L)),(java.awt.Color) (new java.awt.Color((int) (50),(int) (168),(int) (149))),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.misc.AntiAFK_47Cl.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.misc.AntiAFK_47Cl.a ^ a0) ^ 100459248374329L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.misc.AntiAFK_47Cl.a ^ a0) ^ 100459248374329L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.misc.AntiAFK_47Cl.a ^ a0) ^ 100459248374329L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.misc.AntiAFK_47Cl.a ^ a0) ^ 127923296798556L);
        long constructorKey7 = ((augustus.recovered.modules.misc.AntiAFK_47Cl.a ^ a0) ^ 83792973476538L);
        int constructorPart8 = (int) ((((augustus.recovered.modules.misc.AntiAFK_47Cl.a ^ a0) ^ 101433219363868L) >>> 32));
        long constructorKey9 = ((((augustus.recovered.modules.misc.AntiAFK_47Cl.a ^ a0) ^ 101433219363868L) << 32) >>> 32);
        long constructorKey10 = ((augustus.recovered.modules.misc.AntiAFK_47Cl.a ^ a0) ^ 107123484069181L);
        short converted11 = (short) (constructorPart4);
        short converted12 = (short) (constructorPart5);
        client.setting.RangeSetting initialized13 = new client.setting.RangeSetting(constructorPart3, this, "AFKDelay", Double.longBitsToDouble(4666723172467343360L), Double.longBitsToDouble(4669471951536783360L), converted11, 0.0D, Double.longBitsToDouble(4671226772094713856L), 0, converted12);
        long initialValue14 = constructorKey6;
        client.setting.RangeSetting initialValue15 = initialized13;
        java.lang.Object initialValue16 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue15))))));
        java.lang.Object initialValue17 = recovery$indy$flow$77(initialValue16, initialValue14);
        recovery$indy$flow$78(this, initialValue17);
        client.setting.BooleanSetting initialized18 = new client.setting.BooleanSetting(this, constructorKey7, "Move", true);
        recovery$indy$flow$81(this, initialized18);
        short converted19 = (short) (constructorPart4);
        short converted20 = (short) (constructorPart5);
        client.setting.RangeSetting initialized21 = new client.setting.RangeSetting(constructorPart3, this, "MoveDelay", Double.longBitsToDouble(4661014508095930368L), Double.longBitsToDouble(4663319084467748864L), converted19, 0.0D, Double.longBitsToDouble(4671226772094713856L), 0, converted20);
        long initialValue22 = constructorKey6;
        client.setting.RangeSetting initialValue23 = initialized21;
        java.lang.Object initialValue24 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue25 = recovery$indy$flow$85(initialValue24, initialValue22);
        java.lang.Object initialValue26 = ((java.lang.Object)(((augustus.recovered.modules.misc.AntiAFK_47Cl) (((java.lang.Object)(this)))).settingMove));
        java.lang.Object initialValue27 = recovery$indy$flow$87(initialValue26);
        java.lang.Object initialValue28 = recovery$indy$flow$88(initialValue26);
        long initialValue29 = constructorKey9;
        java.lang.Object initialValue30 = initialValue28;
        int initialValue31 = constructorPart8;
        java.lang.Object initialValue32 = initialValue25;
        java.lang.Object initialValue33 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue32))))));
        java.lang.Object initialValue34 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue35 = recovery$indy$flow$91(initialValue33, initialValue31, initialValue34, initialValue29);
        recovery$indy$flow$92(this, initialValue35);
        short converted36 = (short) (constructorPart4);
        short converted37 = (short) (constructorPart5);
        client.setting.RangeSetting initialized38 = new client.setting.RangeSetting(constructorPart3, this, "MoveDuration", Double.longBitsToDouble(4641240890982006784L), Double.longBitsToDouble(4645744490609377280L), converted36, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, converted37);
        long initialValue39 = constructorKey6;
        client.setting.RangeSetting initialValue40 = initialized38;
        java.lang.Object initialValue41 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue42 = recovery$indy$flow$96(initialValue41, initialValue39);
        java.lang.Object initialValue43 = ((java.lang.Object)(((augustus.recovered.modules.misc.AntiAFK_47Cl) (((java.lang.Object)(this)))).settingMove));
        java.lang.Object initialValue44 = recovery$indy$flow$98(initialValue43);
        java.lang.Object initialValue45 = recovery$indy$flow$99(initialValue43);
        long initialValue46 = constructorKey9;
        java.lang.Object initialValue47 = initialValue45;
        int initialValue48 = constructorPart8;
        java.lang.Object initialValue49 = initialValue42;
        java.lang.Object initialValue50 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue51 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue47))))));
        java.lang.Object initialValue52 = recovery$indy$flow$102(initialValue50, initialValue48, initialValue51, initialValue46);
        recovery$indy$flow$103(this, initialValue52);
        client.setting.BooleanSetting initialized53 = new client.setting.BooleanSetting(this, constructorKey7, "InInv", false);
        recovery$indy$flow$106(this, initialized53);
        client.setting.BooleanSetting initialized54 = new client.setting.BooleanSetting(this, constructorKey7, "OnlyIfAfk", false);
        recovery$indy$flow$109(this, initialized54);
        client.setting.NumberSetting initialized55 = new client.setting.NumberSetting(this, "DelayToStartAntiAfkAfterBeingAFK", Double.longBitsToDouble(4666723172467343360L), constructorKey10, 0.0D, Double.longBitsToDouble(4671226772094713856L), 0);
        java.lang.Object initialValue56 = ((java.lang.Object)(((augustus.recovered.modules.misc.AntiAFK_47Cl) (((java.lang.Object)(this)))).settingOnlyIfAfk));
        java.lang.Object initialValue57 = recovery$indy$flow$113(initialValue56);
        java.lang.Object initialValue58 = recovery$indy$flow$114(initialValue56);
        java.lang.Object initialValue59 = initialValue58;
        client.setting.NumberSetting initialValue60 = initialized55;
        java.lang.Object initialValue61 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue62 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue59))))));
        java.lang.Object initialValue63 = recovery$indy$flow$117(initialValue61, initialValue62);
        recovery$indy$flow$118(this, initialValue63);
        net.C_47cu initialized64 = new net.C_47cu();
        recovery$indy$flow$121(this, initialized64);
        net.C_47cu initialized65 = new net.C_47cu();
        recovery$indy$flow$124(this, initialized65);
        net.C_47cu initialized66 = new net.C_47cu();
        recovery$indy$flow$127(this, initialized66);
        recovery$indy$flow$128(this, 0);
        recovery$indy$flow$129(this, false);
    }





    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.Object recovery$indy$flow$77(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$78(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$81(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$85(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$87(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$88(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$91(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$92(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$96(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$98(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$99(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$102(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$103(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$106(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$109(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$113(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$114(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$117(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$118(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$121(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$124(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$127(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$128(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.AntiAFK_47Cl) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$129(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.AntiAFK_47Cl) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native float recovery$indy$2(Object var0, long var1, long var3);
   private static native float recovery$indy$3(Object var0, long var1, long var3);
   private static native boolean recovery$indy$4(Object var0, long var1, long var3);
   private static native boolean recovery$indy$5(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native void recovery$indy$10(Object var0, long var1, long var3);
   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$12(Object var0, double var1, long var3, long var5, long var7);
   private static native int[] recovery$indy$13(long var0, long var2);
   private static native boolean recovery$indy$14(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$16(Object var0, long var1, long var3);
   private static native boolean recovery$indy$17(Object var0, long var1, long var3);
   private static native float recovery$indy$18(Object var0, long var1, long var3);
   private static native float recovery$indy$19(Object var0, long var1, long var3);
   private static native void recovery$indy$20(Object var0, long var1, long var3);
   private static native int recovery$indy$21(Object var0, long var1, long var3);
   private static native boolean recovery$indy$22(Object var0, long var1, long var3, long var5, long var7);
   private static native void recovery$indy$23(Object var0, boolean var1, long var2, long var4);
   private static native void recovery$indy$24(Object var0, long var1, long var3);
   private static native int recovery$indy$25(Object var0, long var1, long var3);
   private static native int recovery$indy$26(Object var0, long var1, long var3);
   private static native boolean recovery$indy$27(Object var0, long var1, long var3, long var5, long var7);
   private static native double recovery$indy$28(Object var0, long var1, long var3);
   private static native double recovery$indy$29(Object var0, long var1, long var3);
   private static native void recovery$indy$30(Object var0, long var1, long var3);
   private static native int recovery$indy$31(Object var0, long var1, long var3);
   private static native boolean recovery$indy$32(Object var0, long var1, long var3, long var5, long var7);
   private static native void recovery$indy$33(Object var0, float var1, long var2, long var4);
   private static native void recovery$indy$34(Object var0, float var1, long var2, long var4);
   private static native void recovery$indy$35(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$36(Object var0, long var1, long var3);
   private static native double recovery$indy$37(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$41();
}
