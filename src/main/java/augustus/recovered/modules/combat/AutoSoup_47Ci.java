package augustus.recovered.modules.combat;
import java.awt.Color;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40g;
import net.C_42R;
import net.C_43r;
import net.C_45n;
import net.C_4713;
import net.C_473U;
import net.C_474k;
import net.C_475c;
import net.C_476q;
import net.C_47AC;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47FQ;
import net.C_47GS;
import net.C_47KL;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import net.C_47TU;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.C_47VY;
import net.C_47cu;
import net.C_47dv;
import net.C_47dz;
import net.C_47gG;
import net.C_47i;
import net.C_47iC;
import net.C_47jt;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import net.C_47pL;
import net.C_47rf;
import net.C_47sT;
import client.module.Category;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoSoup_47Ci extends client.module.Module implements net.C_47UH,net.C_47GS,net.C_48T,net.C_47iC,net.C_47dv {
    private final net.C_47TU settingHealth = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingTickDelayAfterClosingGui = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingTickDelayBeforeSwitch = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingTickDelayBeforeClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDrop = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInventoryDrop = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingDropBowlsIfYouHaveMoreThan = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingTickDelayDrop = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingTickDelayAfter = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSilent = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRandom = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingStopClickingAtSouping = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingDeprecated = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOpenInv = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAutoOpen = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingAutoOpenDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingStartDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFill = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingFillDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCraft = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingReCraftIfSoupsLowerThan = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCraftInstant = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCraftCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAutoClose = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingAutoCloseDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_48L; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_48X; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_48K; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_48z; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43n; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43U; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43f; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_436; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_48Z; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_48F = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_48T = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_48y = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_485 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class b(long a0,long a1);

   private void method_46$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 131996426769352L;
      long var5 = var1 ^ 100872438578767L;
      long var7 = var1 ^ 57713275044187L;
      this.field_438 = recovery$indy$3(
         C_476q.field_48,
         var7,
         recovery$indy$1(this.settingHealth, var5, -1805426356659288558L, var1),
         recovery$indy$2(this.settingHealth, var3, -1803966508628675490L, var1),
         -1804858304425263735L,
         var1
      );
      this.field_43f = recovery$indy$6(
         C_476q.field_48,
         var7,
         recovery$indy$4(this.settingTickDelayBeforeClick, var5, -1805426356659288558L, var1),
         recovery$indy$5(this.settingTickDelayBeforeClick, var3, -1803966508628675490L, var1),
         -1804858304425263735L,
         var1
      );
      this.field_43y = recovery$indy$9(
         C_476q.field_48,
         var7,
         recovery$indy$7(this.settingTickDelayAfter, var5, -1805426356659288558L, var1),
         recovery$indy$8(this.settingTickDelayAfter, var3, -1803966508628675490L, var1),
         -1804858304425263735L,
         var1
      );
      this.field_436 = recovery$indy$12(
         C_476q.field_48,
         var7,
         recovery$indy$10(this.settingTickDelayDrop, var5, -1805426356659288558L, var1),
         recovery$indy$11(this.settingTickDelayDrop, var3, -1803966508628675490L, var1),
         -1804858304425263735L,
         var1
      );
      this.field_43U = recovery$indy$15(
         C_476q.field_48,
         var7,
         recovery$indy$13(this.settingTickDelayBeforeSwitch, var5, -1805426356659288558L, var1),
         recovery$indy$14(this.settingTickDelayBeforeSwitch, var3, -1803966508628675490L, var1),
         -1804858304425263735L,
         var1
      );
      this.field_48L = false;
      this.field_48X = false;
      this.field_43h.clear();
      this.field_48K = true;
      this.field_48z = true;
      this.field_42 = -1;
   }




    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private void method_42$da8c82d5d4() {
        AutoSoup_47Ci autoSoup_47Ci;
        block18: {
            long l;
            block19: {
                int n;
                int n2;
                int n3;
                int n4;
                int n5;
                long l2;
                block14: {
                    block17: {
                        AutoSoup_47Ci autoSoup_47Ci2;
                        block16: {
                            block11: {
                                block15: {
                                    block12: {
                                        block13: {
                                            block9: {
                                                block10: {
                                                    block8: {
                                                        long l3;
                                                        long l4 = l3 = a ^ 0x3C53B64529F4L;
                                                        l = l4 ^ 0x7E55B3A5CF11L;
                                                        l2 = l4 ^ 0x4BF3745A302CL;
                                                        int[] nArray = augustus.recovered.modules.combat.AntiBot_47CG.method_40$d4d28024c9();
                                                        net.minecraft.client.Minecraft c_47nT = field_43;
                                                        c_47nT.method_41$da8c82d5d4();
                                                        long l5 = l2;
                                                        AutoSoup_47Ci autoSoup_47Ci3 = this;
                                                        int[] nArray2 = nArray;
                                                        n5 = ((int) (autoSoup_47Ci3.method_477$0dd78e0064(l5) ? 1 : 0));
                                                        if (nArray2 != null) break block8;
                                                        n4 = n5;
                                                        if (n4 == 0) break block9;
                                                        break block10;
                                                    }
                                                    int n6 = n5;
                                                    n5 = n6;
                                                    int n7 = n5;
                                                    int n8 = this.field_43f + n6 + this.field_43y;
                                                    int n9 = n8;
                                                    if (n7 <= n9) break block11;
                                                    break block12;
                                                }
                                                n5 = this.field_436;
                                                break block13;
                                            }
                                            n5 = 0;
                                        }
                                        n3 = n5;
                                        n5 = n3;
                                        n4 = n5;
                                        if (n4 != 0) break block14;
                                        break block15;
                                    }
                                    autoSoup_47Ci2 = this;
                                    break block16;
                                }
                                n2 = this.field_43f + n3;
                                n5 = this.field_43n;
                                n4 = n5;
                                n = n2;
                                if (n4 <= n) break block14;
                                break block17;
                            }
                            autoSoup_47Ci2 = this;
                        }
                        ++autoSoup_47Ci2.field_43n;
                        return;
                    }
                    long l6 = l2;
                    AutoSoup_47Ci autoSoup_47Ci4 = this;
                    n5 = autoSoup_47Ci4.method_477$0dd78e0064(l6) ? 1 : 0;
                    n4 = n5;
                    if (n4 != 0) {
                        n5 = this.field_48L ? 1 : 0;
                        n4 = n5;
                        if (n4 != 0) {
                            n5 = this.field_48X ? 1 : 0;
                            n4 = n5;
                            if (n4 == 0) {
                                client.setting.BooleanSetting c_47TV = this.settingInventoryDrop;
                                n4 = c_47TV.method_49$aae029aa0a() ? 1 : 0;
                                if (n4 != 0) {
                                    net.minecraft.client.Minecraft c_47nT = field_43;
                                    net.minecraft.client.Minecraft c_47nT2 = field_43;
                                    net.minecraft.client.Minecraft c_47nT3 = field_43;
                                    c_47nT.field_44K.method_42$f0ddb617a2(c_47nT2.field_42P.field_429.field_43, this.field_42 + 36, 1, 4, c_47nT3.field_42P);
                                } else {
                                    net.minecraft.client.Minecraft c_47nT = field_43;
                                    c_47nT.field_42P.method_40$28bbed2f9a(true);
                                }
                                this.field_48X = true;
                            }
                        }
                    }
                }
                autoSoup_47Ci = this;
                n5 = autoSoup_47Ci.field_43n;
                n2 = this.field_43f + n3 + this.field_43y;
                n = n2;
                n4 = n5;
                if (n4 <= n) break block18;
                autoSoup_47Ci = this;
                n4 = autoSoup_47Ci.field_48L ? 1 : 0;
                if (n4 == 0) break block18;
                autoSoup_47Ci = this;
                n4 = autoSoup_47Ci.field_48X ? 1 : 0;
                if (n4 != 0) break block19;
                autoSoup_47Ci = this;
                AutoSoup_47Ci autoSoup_47Ci5 = autoSoup_47Ci;
                long l7 = l2;
                n4 = autoSoup_47Ci5.method_477$0dd78e0064(l7) ? 1 : 0;
                if (n4 != 0) break block18;
            }
            autoSoup_47Ci = this;
            long l8 = l;
            AutoSoup_47Ci autoSoup_47Ci6 = autoSoup_47Ci;
            autoSoup_47Ci6.method_46$e45a9973e5(l8);
        }
        autoSoup_47Ci = this;
        ++autoSoup_47Ci.field_43n;
    }





   private void method_42$6e29aeb949(int var1, long var2, int var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 37895636341292L;
      long var7 = var2 ^ 55587505423213L;
      recovery$indy$16(this, var7, 9022788793525438028L, var2);
      recovery$indy$17(this.field_48T, 9020968749700778941L, var2);
      recovery$indy$18(this.settingFillDelay, 9018777832611756738L, var2);
      recovery$indy$19(field_43, 9021188926881038448L, var2)
         .method_42$f0ddb617a2(
            recovery$indy$20(field_43, 9018734652204289230L, var2).field_429.field_43,
            var1,
            var4 - 36,
            2,
            recovery$indy$21(field_43, 9018734652204289230L, var2)
         );
      recovery$indy$22(this, var5, 9019219739896233301L, var2);
      this.field_43P = true;
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$fae8de1664(net.C_475c var1) {
        boolean var61;
      long var2 = a ^ 128815055224602L;
      long var4 = var2 ^ 60671018097151L;
      long var6 = var2 ^ 54464817438378L;
      long var8 = var2 ^ 2786721048258L;
      long var10 = var2 ^ 78429900962854L;
      long var10000 = -6877349076877782384L;
      int[] var12 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = -6879048022660391479L;
      net.minecraft.client.Minecraft var15 = field_43;
      if (!var15.field_44K.method_40$aae029aa0a()) {
         long var10002 = -6875024178063240474L;
         net.C_475c var16 = var1;
         boolean var60 = var16.method_45$aae029aa0a();
         if (var12 != null) {
            this.field_43v = var60;
            var10002 = -6878997246995755242L;
            long var58 = var10;
            AutoSoup_47Ci var59 = this;
            net.C_47i.method_49$e40da76921(var59, var58);
            if (this.field_42 == 0) {
               this.field_43n++;
            }
         } else {
            label224: {
               if (!var60) {
                  var10002 = -6877609732702287809L;
                  net.C_475c var17 = var1;
                  label204:
                  if (!var17.method_42$aae029aa0a()) {
                     long var10003 = -6878997246995755242L;
                     long var18 = var10;
                     AutoSoup_47Ci var20 = this;
                     if (!net.C_47i.method_49$e40da76921(var20, var18)) {
                        var10002 = -6876690276180591369L;
                        if (net.C_47i.method_42$0dd78e0064(var6)) {
                           break label204;
                        }
                     }

                     var61 = false;
                     break label224;
                  }
               }

               var61 = true;
            }

            this.field_43v = var61;
            var10002 = -6878997246995755242L;
            long var21 = var10;
            AutoSoup_47Ci var23 = this;
            if (net.C_47i.method_49$e40da76921(var23, var21)) {
               var10001 = -6878308910472543691L;
               client.setting.BooleanSetting var24 = this.settingStopClickingAtSouping;
               if (var24.method_49$aae029aa0a()) {
                  var10002 = -6876624104348522286L;
                  boolean var25 = true;
                  net.C_475c var26 = var1;
                  var26.method_42$f633c984d8(var25);
               }
            }

            var10001 = -6878839777684989178L;
            net.minecraft.client.Minecraft var27 = field_43;
            if (var27.method_44$aae029aa0a() && !this.field_43v) {
               boolean var13 = false;
               if (this.field_42 > -1) {
                  if (this.field_43n > this.field_43f) {
                     var10001 = -6876435126529339017L;
                     net.minecraft.client.Minecraft var28 = field_43;
                     if (!var28.field_42P.method_436$aae029aa0a() && !this.field_48L) {
                        var10001 = -6878308910472543691L;
                        client.setting.BooleanSetting var29 = this.settingStopClickingAtSouping;
                        if (var29.method_49$aae029aa0a()) {
                           var10001 = -6875481736521436241L;
                           net.C_475c var30 = var1;
                           var30.method_48$da8c82d5d4();
                           var10002 = -6878542677408482585L;
                           boolean var31 = false;
                           net.C_475c var32 = var1;
                           var32.method_43$f633c984d8(var31);
                           var10002 = -6876624104348522286L;
                           boolean var33 = false;
                           net.C_475c var34 = var1;
                           var34.method_42$f633c984d8(var33);
                           var10002 = -6875656656999662393L;
                           boolean var35 = true;
                           net.C_475c var36 = var1;
                           var36.method_40$f633c984d8(var35);
                        }

                        var10002 = -6875371655012620672L;
                        byte var37 = 1;
                        net.C_475c var38 = var1;
                        var38.method_48$d00df7729d(var37);
                        Runnable var67 = (Runnable)recovery$indy$flow$152(this);
                        var10002 = -6878367766261947641L;
                        Runnable var39 = var67;
                        net.C_475c var40 = var1;
                        var40.method_47$f98697054d(var39);
                        var13 = true;
                        this.field_48L = true;
                     }
                  }

                  if (!var13) {
                     var10002 = -6876098397669183151L;
                     long var41 = var8;
                     AutoSoup_47Ci var43 = this;
                     int var14 = var43.method_477$0dd78e0064(var41) ? this.field_436 : 0;
                     if (var14 == 0 && this.field_43n > this.field_43f + var14) {
                        var10002 = -6876098397669183151L;
                        long var44 = var8;
                        AutoSoup_47Ci var46 = this;
                        if (var46.method_477$0dd78e0064(var44) && this.field_48L && !this.field_48X) {
                           var10001 = -6878308910472543691L;
                           client.setting.BooleanSetting var47 = this.settingInventoryDrop;
                           if (var47.method_49$aae029aa0a()) {
                              var10001 = -6879048022660391479L;
                              net.minecraft.client.Minecraft var48 = field_43;
                              var10002 = -6876435126529339017L;
                              net.minecraft.client.Minecraft var49 = field_43;
                              int var83 = this.field_42 + 36;
                              long var10006 = -6876435126529339017L;
                              net.minecraft.client.Minecraft var50 = field_43;
                              var48.field_44K.method_42$f0ddb617a2(var49.field_42P.field_429.field_43, var83, 1, 4, var50.field_42P);
                           } else {
                              var10001 = -6876435126529339017L;
                              net.minecraft.client.Minecraft var51 = field_43;
                              var51.field_42P.method_40$28bbed2f9a(true);
                           }

                           this.field_48X = true;
                        }
                     }

                     label187:
                     if (this.field_43n > this.field_43f + var14 + this.field_43y && this.field_48L) {
                        if (!this.field_48X) {
                           var10002 = -6876098397669183151L;
                           long var52 = var8;
                           AutoSoup_47Ci var54 = this;
                           if (var54.method_477$0dd78e0064(var52)) {
                              break label187;
                           }
                        }

                        var10002 = -6877243050736737826L;
                        long var55 = var4;
                        AutoSoup_47Ci var57 = this;
                        var57.method_46$e45a9973e5(var55);
                     }

                     this.field_43n++;
                  }
               }

               if (!var13) {
                  this.field_43n++;
               }
            }
         }
      }
   }







    private void method_40$9cf59f9d4e(final int n, final short n2, final int n3, final short n4) {
        final long n6;
        final long n5 = n6 = (((long)n2 << 48 | (long)n3 << 32 >>> 16 | (long)n4 << 48 >>> 48) ^ AutoSoup_47Ci.a);
        final long n7 = n6 ^ 0x17E3EC834918L;
        final long n8 = n6 ^ 0x71AD6F1D859L;
        final int[] method_40$d4d28024c9 = AntiBot_47CG.method_40$d4d28024c9();
        this.method_45$e45a9973e5(n8);
        net.minecraft.client.Minecraft minecraft2;
        final net.minecraft.client.Minecraft minecraft = minecraft2 = AutoSoup_47Ci.field_43;
        Label_0266: {
            if (method_40$d4d28024c9 == null) {
                long n9 = 7358176351996665566L;
                long n10 = n5;
                Label_0118: {
                    if (n3 <= 0) {
                        break Label_0118;
                    }
                    if (!(minecraft.field_44m instanceof C_47pL)) {
                        break Label_0118;
                    }
                    try {
                        final net.minecraft.client.Minecraft field_43 = AutoSoup_47Ci.field_43;
                        n9 = 7357983450048403450L;
                        n10 = n5;
                        final net.C_47sT method_46$4c10532da1 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$210(minecraft, n9, n10)).field_429.method_46$4c10532da1(n);
                        final C_47pL c_47pL = (C_47pL)AutoSoup_47Ci.field_43.field_44m;
                        c_47pL.field_42 = true;
                        c_47pL.method_47$23922dd444(method_46$4c10532da1.field_40 + 2 + c_47pL.field_46c, method_46$4c10532da1.field_46 + 2 + c_47pL.field_433, 0);
                        break Label_0266;
                    }
                    catch (final java.io.IOException ex) {
                        ex.printStackTrace();
                        if (n3 <= 0) {
                            return;
                        }
                        if (method_40$d4d28024c9 == null) {
                            break Label_0266;
                        }
                    }
                }
                minecraft2 = AutoSoup_47Ci.field_43;
            }
            minecraft2.field_44K.method_42$f0ddb617a2(AutoSoup_47Ci.field_43.field_42P.field_429.field_43, n, 0, 1, AutoSoup_47Ci.field_43.field_42P);
        }
        this.field_43P = true;
        this.field_48T.method_46$da8c82d5d4();
        this.settingFillDelay.method_43$fedcb3e4d3();
        this.method_44$e45a9973e5(n7);
    }




   private void method_40$76da145a62(long var1, C_47gG var3, int var4, int var5) {
      var1 = a ^ var1;
      recovery$indy$25(field_43, -9047737753185976530L, var1)
         .method_42$f0ddb617a2(var3.field_43, var4, var5, 0, recovery$indy$26(field_43, -9045846431155391600L, var1));
      recovery$indy$27(this.field_48T, -9048115710285613853L, var1);
      this.field_43P = true;
   }



   private void method_44$e45a9973e5(long var1) {
      var1 = a ^ var1;
      int[] var3 = recovery$indy$28(3496461575701217947L, var1);
      if (recovery$indy$29(field_43, 3502301444371693948L, var1).method_46$f8ba6cbd86() != null) {
         Minecraft var5;
         label34: {
            boolean var10000 = recovery$indy$30(this.settingOpenInv, 3494798026676818494L, var1);
            if (var3 == null) {
               if (var10000) {
                  return;
               }

               var5 = field_43;
               if (var3 != null) {
                  break label34;
               }

               var10000 = recovery$indy$31(field_43, 3495393223724878605L, var1);
            }

            if (!var10000) {
               return;
            }

            recovery$indy$32(field_43, 3502301444371693948L, var1)
               .field_49m
               .method_45$631790539f(new C_47dz(recovery$indy$33(field_43, 3502301444371693948L, var1).field_429.field_43));
            var5 = field_43;
         }

         recovery$indy$34(var5, 3502301444371693948L, var1).method_40$7480b345ab(null);
      }
   }



   private int[] method_44$b8f2dc0848(int var1, short var2, char var3, C_47gG var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      int[] var8 = new int[5];
      int[] var10000 = recovery$indy$35(-5941755418940874860L, var5);
      int var9 = -1;
      int[] var7 = var10000;

      while (true) {
         C_47rf var12;
         if (var9 < var4.field_46.size()) {
            var12 = var9 == -1
               ? recovery$indy$36(field_43, -5938588531216393101L, var5).field_42X.method_41$ac4db64966()
               : var4.method_46$4c10532da1(var9).method_48$ac4db64966();
         } else {
            if (var2 <= 0) {
               return var8;
            }

            var12 = var4.method_46$4c10532da1(var9).method_48$ac4db64966();
         }

         while (true) {
            label149: {
               label156: {
                  C_47rf var10 = var12;
                  C_47rf var13 = var10;
                  if (var7 == null) {
                     if (var10 == null) {
                        if (var9 <= 8) {
                           break label156;
                        }

                        var8[0]++;
                        var10000 = var7;
                        if (var2 >= 0) {
                           break label149;
                        }

                        if (var7 == null) {
                           break label156;
                        }

                        var13 = var10;
                     } else {
                        var13 = var10;
                     }
                  }

                  C_43r var11 = var13.method_48$dbd570a038();
                  int var15 = (int) ((var11.equals(C_42R.field_45)) ? 1 : 0);
                  int[] var10001 = var7;
                  if (var1 >= 0) {
                     if (var7 == null) {
                        if (var15 != 0) {
                           var8[1] += var10.field_47;
                           var10000 = var7;
                           if (var2 >= 0) {
                              break label149;
                           }

                           if (var7 == null) {
                              break label156;
                           }

                           var15 = (int) ((var11.equals(C_43r.method_46$4158f44b4a(40))) ? 1 : 0);
                           var10001 = var7;
                        } else {
                           var15 = (int) ((var11.equals(C_43r.method_46$4158f44b4a(40))) ? 1 : 0);
                           var10001 = var7;
                        }
                     } else {
                        var10001 = var7;
                     }
                  }

                  if (var2 < 0) {
                     if (var10001 == null) {
                        if (var15 != 0) {
                           var8[2] += var10.field_47;
                           var10000 = var7;
                           if (var1 <= 0) {
                              break label149;
                           }

                           if (var7 == null) {
                              break label156;
                           }

                           var15 = (int) ((var11.equals(C_43r.method_46$4158f44b4a(39))) ? 1 : 0);
                           var10001 = var7;
                        } else {
                           var15 = (int) ((var11.equals(C_43r.method_46$4158f44b4a(39))) ? 1 : 0);
                           var10001 = var7;
                        }
                     } else {
                        var10001 = var7;
                     }
                  }

                  if (var2 <= 0) {
                     if (var10001 == null) {
                        if (var15 != 0) {
                           var8[3] += var10.field_47;
                           var10000 = var7;
                           if (var1 <= 0) {
                              break label149;
                           }

                           if (var7 == null) {
                              break label156;
                           }

                           var15 = (int) ((var11.equals(C_42R.field_41u)) ? 1 : 0);
                           var10001 = var7;
                        } else {
                           var15 = (int) ((var11.equals(C_42R.field_41u)) ? 1 : 0);
                           var10001 = var7;
                        }
                     } else {
                        var10001 = var7;
                     }
                  }

                  if (var10001 == null) {
                     if (var15 == 0) {
                        break label156;
                     }

                     var15 = var9;
                  }

                  if (var15 != 0) {
                     var8[4]++;
                  }
               }

               var9++;
               var10000 = var7;
            }

            if (var10000 == null) {
               break;
            }

            if (var2 <= 0) {
               return var8;
            }

            var12 = var4.method_46$4c10532da1(var9).method_48$ac4db64966();
         }
      }
   }




   public boolean method_48$b4bb6d006d(char var1, int var2, short var3) {
      boolean var18;
      long var4;
      long var6;
      long var8;
      long var10;
      int var12;
      int var13;
      int var14;
      int[] var15;
      Minecraft var16;
      label243: {
         var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
         var6 = var4 ^ 22046803245925L;
         var8 = var4 ^ 7671179881630L;
         var10 = var4 ^ 121076264962689L;
         long var10001 = var4 ^ 18795190399740L;
         var12 = (int)((var4 ^ 18795190399740L) >>> 32);
         var13 = (int)((var4 ^ 18795190399740L) << 32 >>> 48);
         var14 = (int)(var10001 << 48 >>> 48);
         var15 = recovery$indy$37(972151995904130915L, var4);
         boolean var10000 = recovery$indy$38(field_43, 971596781657976890L, var4).method_40$aae029aa0a();
         if (var15 == null) {
            if (var10000) {
               return false;
            }

            var16 = field_43;
            if (var15 != null) {
               break label243;
            }

            var10000 = recovery$indy$39(field_43, 971101657022199541L, var4);
         }

         if (var10000) {
            recovery$indy$40(this.field_47, 971254558638275575L, var4);
            this.field_43P = false;
            this.field_43u = true;
         }

         var16 = field_43;
      }

      label233: {
         GuiScreen var17 = recovery$indy$41(var16, 964674483313882528L, var4);
         if (var15 == null) {
            if (var17 == null) {
               break label233;
            }

            var17 = recovery$indy$42(field_43, 971705150458293703L, var4);
         }

         if (var17 == null) {
            recovery$indy$43(this.settingTickDelayAfterClosingGui, 964719267128920712L, var4);
         }
      }

      int[] var20;
      label227: {
         var18 = recovery$indy$44(var8, 963788039308559512L, var4);
         label226:
         if (var15 == null) {
            if (!var18) {
               var18 = recovery$indy$45(this.settingOpenInv, 970576401322930118L, var4);
               var20 = var15;
               if (var3 <= 0) {
                  break label227;
               }

               if (var15 != null) {
                  break label226;
               }

               if (var18) {
                  return false;
               }
            }

            var18 = recovery$indy$46(field_43, 964674483313882528L, var4) instanceof C_47pL;
         }

         var20 = var15;
      }

      if (var2 > 0) {
         if (var20 == null) {
            if (!var18) {
               boolean var22 = recovery$indy$47(this.settingOpenInv, 970576401322930118L, var4);
               if (var15 != null) {
                  return var22;
               }

               if (var22) {
                  return false;
               }

               boolean var23 = recovery$indy$48(field_43, 971101657022199541L, var4);
               if (var15 != null) {
                  return var23;
               }

               if (!var23) {
                  return false;
               }

               boolean var24 = recovery$indy$49(this.settingFill, 970576401322930118L, var4);
               if (var15 != null) {
                  return var24;
               }

               if (!var24) {
                  return false;
               }
            }

            var18 = recovery$indy$50(this.settingFill, 970576401322930118L, var4);
         }

         var20 = var15;
      }

      if (var3 >= 0) {
         if (var20 == null) {
            if (!var18) {
               boolean var25 = recovery$indy$51(this.settingCraft, 970576401322930118L, var4);
               if (var15 != null) {
                  return var25;
               }

               if (!var25) {
                  return false;
               }
            }

            var18 = recovery$indy$53(this.field_47, recovery$indy$52(this.settingStartDelay, 965759147322343835L, var4), var10, 964911991562006495L, var4);
         }

         var20 = var15;
      }

      if (var1 >= 0) {
         if (var20 == null) {
            if (!var18) {
               return true;
            }

            recovery$indy$54(this.settingStartDelay, 964719267128920712L, var4);
            var18 = recovery$indy$55(this, var12, var13, (short)var14, 971165417798675842L, var4);
         }

         var20 = var15;
      }

      if (var1 >= 0) {
         if (var20 == null) {
            if (!var18) {
               return true;
            }

            var18 = recovery$indy$56(this, var6, 965389822320196281L, var4);
         }

         var20 = var15;
      }

      if (var1 >= 0) {
         if (var20 == null) {
            if (!var18) {
               return true;
            }

            var18 = recovery$indy$57(this.settingFill, 970576401322930118L, var4);
         }

         var20 = var15;
      }

      if (var20 != null) {
         return var18;
      }

      if (var18) {
         boolean var26 = recovery$indy$58(this.settingAutoClose, 970576401322930118L, var4);
         if (var15 != null) {
            return var26;
         }

         if (var26 && recovery$indy$59(field_43, 964674483313882528L, var4) != null) {
            if (var15 != null) {
               return this.field_43P;
            }

            if (this.field_43P) {
               boolean var19 = this.field_43u;
               var20 = var15;
               if (var3 >= 0) {
                  if (var15 == null) {
                     if (this.field_43u) {
                        recovery$indy$60(this.field_485, 971254558638275575L, var4);
                        this.field_43u = false;
                        recovery$indy$61(this.settingAutoCloseDelay, 964719267128920712L, var4);
                     }

                     var19 = recovery$indy$63(this.field_485, recovery$indy$62(this.settingAutoCloseDelay, 965759147322343835L, var4), var10, 964911991562006495L, var4);
                  }

                  var20 = var15;
               }

               if (var20 == null) {
                  if (var19) {
                     recovery$indy$64(field_43, 964481473726446724L, var4).method_47a$da8c82d5d4();
                     recovery$indy$65(this.field_485, 971254558638275575L, var4);
                     this.field_43u = true;
                  }

                  var19 = true;
               }

               return var19;
            }
         }
      }

      return false;
   }






    private int method_45$cabccf1c64(int upperKey, int middleKey, int lowerKey) {
        long key = (((long) upperKey << 32) | (((long) middleKey << 48) >>> 32) | (((long) lowerKey << 48) >>> 48)) ^ recovery$indy$flow$362();
        long cleanupKey = key ^ 40980146090790L;
        long packedKey = key ^ 58931983804812L;
        int checkUpper = (int) (packedKey >>> 32);
        short checkMiddle = (short) ((packedKey << 32) >>> 48);
        short checkLower = (short) ((packedKey << 48) >>> 48);
        Object guard = recovery$indy$flow$363();
        Object game = recovery$indy$flow$364();
        if (guard != null) {
            boolean empty;
            if (((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(game)))))))))).field_44m)) != null) {
                recovery$indy$flow$386(this, false);
                recovery$indy$flow$388(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))))), cleanupKey);
                recovery$indy$flow$389(this, -1);
                empty = recovery$indy$flow$392(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$390())))))));
            } else {
                empty = recovery$indy$flow$384(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).field_43h)));
            }
            if (empty) return -1;
            return recovery$indy$flow$443(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$441(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).field_43h)), 0))))))));
        }
        float health = recovery$indy$flow$367(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(game)))))))))).field_42P)));
        if (health != recovery$indy$flow$368(this)) {
            recovery$indy$flow$369(this, true);
            Object player = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$370())))))))))).field_42P));
            recovery$indy$flow$374(this, recovery$indy$flow$373(player));
        }
        if (middleKey > 0) {
            Object player = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$375())))))))))).field_42P));
            recovery$indy$flow$379(this, recovery$indy$flow$378(player));
            Object screen = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$380())))))))))).field_44m));
            boolean cleanup = screen != null;
            if (!cleanup && recovery$indy$flow$384(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).field_43h)))) cleanup = recovery$indy$flow$385(this);
            if (cleanup) {
                recovery$indy$flow$386(this, false);
                recovery$indy$flow$388(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))))), cleanupKey);
                recovery$indy$flow$389(this, -1);
            }
        } else {
            recovery$indy$flow$389(this, -1);
        }
        boolean refresh = recovery$indy$flow$392(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$390())))))));
        if (refresh) {
            int gameState = recovery$indy$flow$395(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$393())))))));
            int requiredState = recovery$indy$flow$398(((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingTickDelayAfterClosingGui)))))))));
            refresh = gameState >= requiredState;
        }
        if (refresh) {
            float currentHealth = recovery$indy$flow$402(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$399())))))))))).field_42P)));
            refresh = currentHealth < (float) recovery$indy$flow$403(this);
        }
        if (refresh) refresh = recovery$indy$flow$404(this);
        if (refresh) refresh = !recovery$indy$flow$405(this);
        if (refresh) refresh = recovery$indy$flow$407(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))))), checkUpper, checkMiddle, checkLower);
        if (refresh) {
            recovery$indy$flow$408(this, false);
            recovery$indy$flow$410(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).field_43h)));
            for (int slot = 36;;) {
                Object player = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$411())))))))))).field_42P));
                Object inventory = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(player)))).field_429));
                if (slot >= recovery$indy$flow$416(((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(inventory)))).field_46)))) break;
                Object currentInventory = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$417())))))))))).field_42P)))))).field_429));
                Object stack = recovery$indy$flow$422(recovery$indy$flow$421(currentInventory, slot));
                if (lowerKey < 0) continue;
                if (stack != null) {
                    Object item = recovery$indy$flow$423(stack);
                    if (recovery$indy$flow$425(item, recovery$indy$flow$424())) {
                        recovery$indy$flow$428(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).field_43h)), recovery$indy$flow$427(slot - 36));
                    }
                }
                slot++;
            }
            boolean shuffle = recovery$indy$flow$431(((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingRandom)))))))));
            if (upperKey < 0) return shuffle ? 1 : 0;
            if (lowerKey >= 0) {
                if (shuffle) recovery$indy$flow$433(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).field_43h)));
                recovery$indy$flow$434(this, 0);
                if (!recovery$indy$flow$436(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).field_43h)))) recovery$indy$flow$437(this, false);
            } else if (!shuffle) {
                recovery$indy$flow$437(this, false);
            }
        }
        if (recovery$indy$flow$439(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).field_43h)))) return -1;
        return recovery$indy$flow$443(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$441(((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).field_43h)), 0))))))));
    }






   private boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 134906918047050L;
      int[] var5 = recovery$indy$66(3567092160699122590L, var1);
      boolean var10000 = recovery$indy$67(this.settingCraftInstant, 3568313690949866299L, var1);
      if (var5 == null) {
         if (var10000) {
            return false;
         }

         var10000 = recovery$indy$69(this.field_48F, recovery$indy$68(this.settingCraftCPS, 3574183198734400870L, var1), var3, 3568153760553229584L, var1);
      }

      boolean var6 = var10000;
      var10000 = var6;
      int[] var10001 = var5;
      if (var1 >= 0L) {
         if (var5 == null) {
            if (var6) {
               recovery$indy$70(this.settingCraftCPS, 3575369314191144565L, var1);
            }

            var10000 = var6;
         }

         var10001 = var5;
      }

      if (var10001 == null) {
         var10000 = !var10000;
      }

      return var10000;
   }



   private void method_45$e45a9973e5(long var1) {
      var1 = a ^ var1;
      int[] var3 = recovery$indy$71(-6790023345345932326L, var1);
      if (!recovery$indy$72(this.settingOpenInv, -6791124013600193665L, var1)) {
         Minecraft var10000 = field_43;
         int[] var10001 = var3;
         if (var1 > 0L) {
            if (var3 == null) {
               if (recovery$indy$73(field_43, -6783621281751347139L, var1).method_46$f8ba6cbd86() != null) {
                  return;
               }

               var10000 = field_43;
            }

            var10001 = var3;
         }

         if (var10001 == null) {
            long var5 = -6790529494154257844L;
            long var10002 = var1;
            if (var1 > 0L) {
               if (!recovery$indy$74(var10000, -6790529494154257844L, var1)) {
                  return;
               }

               var10000 = field_43;
               var5 = -6783621281751347139L;
               var10002 = var1;
            }

            recovery$indy$75(var10000, var5, var10002).field_49m.method_45$631790539f(new C_47jt(C_4713.OPEN_INVENTORY_ACHIEVEMENT));
            var10000 = field_43;
         }

         recovery$indy$76(var10000, -6783621281751347139L, var1).method_40$7480b345ab(new C_47pL(recovery$indy$77(field_43, -6783621281751347139L, var1)));
      }
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 6724863581304L;
      int[] var6 = recovery$indy$78(2668820660246501143L, var1);
      C_473U var7 = recovery$indy$79(var3, 2671530313209483468L, var1);
      boolean var10000 = var7 instanceof C_47FQ;
      if (var6 == null) {
         if (var10000) {
            this.field_48Z = true;
            recovery$indy$80(this, var4, 2668434259730080857L, var1);
         }

         var10000 = var7 instanceof C_47VY;
      }

      if (var10000) {
         this.field_48Z = true;
      }
   }



   public void method_40G$e45a9973e5(long var1) {
        int var231;
        int var257;
        augustus.recovered.modules.combat.AutoSoup_47Ci var232;
        int var234;
        int var249;
        net.C_47cu var260;
        int var261;
        augustus.recovered.modules.combat.AutoSoup_47Ci var262;
        int[] var274;
        int[] var360;
      long var10001 = var1 ^ 105895214227441L;
      int var3 = (int)((var1 ^ 105895214227441L) >>> 32);
      int var4 = (int)((var1 ^ 105895214227441L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 106978727381589L;
      var10001 = var1 ^ 18507679783008L;
      int var8 = (int)((var1 ^ 18507679783008L) >>> 32);
      int var9 = (int)((var1 ^ 18507679783008L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var1 ^ 119376855428400L;
      long var10000 = -3627147833686769737L;
      int[] var13 = AntiBot_47CG.method_40$d4d28024c9();
      var10001 = -3625466463979425554L;
      net.minecraft.client.Minecraft var22 = field_43;
      boolean var230 = var22.field_44K.method_40$aae029aa0a();
      if (var13 != null) {
         label2283: {
            label2284: {
               label2285: {
                  label2177: {
                     label2176: {
                        byte var64;
                        label2175: {
                           label2220: {
                              label2173: {
                                 label2258: {
                                    if (!var230) {
                                       var10001 = -3625791644553168093L;
                                       net.C_47cu var181 = this.field_48y;
                                       var181.method_46$da8c82d5d4();
                                       long var500 = -3624559932156021829L;
                                       int var184 = var10;
                                       int var187 = var9;
                                       int var190 = var8;
                                       AutoSoup_47Ci var193 = this;
                                       this.field_42 = var193.method_45$cabccf1c64(var190, var187, var184);
                                       var257 = this.field_42;
                                       var360 = var13;
                                       if (var1 < 0L) {
                                          break label2177;
                                       }

                                       if (var13 != null) {
                                          break label2285;
                                       }

                                       if (this.field_42 <= -1) {
                                          var257 = ((this.field_43a) ? 1 : 0);
                                          break label2285;
                                       }

                                       this.field_43a = true;
                                       var262 = this;
                                       if (var1 <= 0L) {
                                          break label2176;
                                       }
                                    } else {
                                       label2256: {
                                          label2223: {
                                             label2168: {
                                                label2224: {
                                                   int var65;
                                                   label2225: {
                                                      int var73;
                                                      int var81;
                                                      int var88;
                                                      label2165: {
                                                         label2226: {
                                                            label2163: {
                                                               var10001 = -3625955588546939359L;
                                                               net.minecraft.client.Minecraft var120 = field_43;
                                                               var64 = ((byte) (var120.method_44$aae029aa0a() ? 1 : 0));
                                                               var65 = 36;
                                                               long var431 = -3623557529899877296L;
                                                               net.minecraft.client.Minecraft var125 = field_43;
                                                               label2162:
                                                               if (var65 < var125.field_42P.field_429.field_46.size()) {
                                                                  var10001 = -3623557529899877296L;
                                                                  net.minecraft.client.Minecraft var134 = field_43;
                                                                  net.C_47rf var71 = var134.field_42P.field_429.method_46$4c10532da1(var65).method_48$ac4db64966();
                                                                  int[] var248 = var13;
                                                                  if (var1 < 0L) {
                                                                     while (true) {
                                                                        long var509;
                                                                        int var361 = (var509 = var1 - 0L) == 0L ? 0 : (var509 < 0L ? -1 : 1);
                                                                        if (var248 == null) {
                                                                           var431 = -3623557529899877296L;
                                                                           var125 = field_43;
                                                                           if (var65 < var125.field_42P.field_429.field_46.size()) {
                                                                              var10001 = -3623557529899877296L;
                                                                              var134 = field_43;
                                                                              net.C_47rf var75 = var134.field_42P
                                                                                 .field_429
                                                                                 .method_46$4c10532da1(var65)
                                                                                 .method_48$ac4db64966();
                                                                              var248 = var13;
                                                                              long var510;
                                                                              int var367 = (var510 = var1 - 0L) == 0L ? 0 : (var510 < 0L ? -1 : 1);
                                                                              continue;
                                                                           }
                                                                        }

                                                                        long var511;
                                                                        int var362 = (var511 = var1 - 0L) == 0L ? 0 : (var511 < 0L ? -1 : 1);
                                                                        boolean var74 = false;
                                                                        boolean var82 = false;
                                                                        boolean var89 = false;
                                                                        byte var97 = 0;

                                                                        while (true) {
                                                                           var431 = -3623557529899877296L;
                                                                           net.minecraft.client.Minecraft var151 = field_43;
                                                                           if (var97 >= var151.field_42P.field_429.field_46.size()) {
                                                                              break label2175;
                                                                           }

                                                                           var10001 = -3623557529899877296L;
                                                                           net.minecraft.client.Minecraft var168 = field_43;
                                                                           net.C_47rf var107 = var168.field_42P
                                                                              .field_429
                                                                              .method_46$4c10532da1(var97)
                                                                              .method_48$ac4db64966();
                                                                           long var512;
                                                                           int var364 = (var512 = var1 - 0L) == 0L ? 0 : (var512 < 0L ? -1 : 1);
                                                                           long var513;
                                                                           int var365 = (var513 = var1 - 0L) == 0L ? 0 : (var513 < 0L ? -1 : 1);
                                                                           if (var13 != null) {
                                                                              break label2175;
                                                                           }
                                                                        }
                                                                     }
                                                                  }

                                                                  while (true) {
                                                                     if (var248 != null) {
                                                                        var73 = 0;
                                                                        var81 = 0;
                                                                        var88 = 0;
                                                                        int var96 = 0;
                                                                        var431 = -3623557529899877296L;
                                                                        net.minecraft.client.Minecraft var148 = field_43;
                                                                        if (var96 >= var148.field_42P.field_429.field_46.size()) {
                                                                           var257 = var64;
                                                                           var360 = var13;
                                                                           if (var1 <= 0L) {
                                                                              break label2258;
                                                                           }
                                                                           break label2165;
                                                                        }

                                                                        var10001 = -3623557529899877296L;
                                                                        net.minecraft.client.Minecraft var165 = field_43;
                                                                        net.C_47rf var106 = var165.field_42P
                                                                           .field_429
                                                                           .method_46$4c10532da1(var96)
                                                                           .method_48$ac4db64966();
                                                                        int[] var254 = var13;
                                                                        if (var1 <= 0L) {
                                                                           while (true) {
                                                                              long var514;
                                                                              int var356 = (var514 = var1 - 0L) == 0L ? 0 : (var514 < 0L ? -1 : 1);
                                                                              if (var254 == null) {
                                                                                 long var515;
                                                                                 int var357 = (var515 = var1 - 0L) == 0L ? 0 : (var515 < 0L ? -1 : 1);
                                                                                 if (var106 != null) {
                                                                                    net.C_43r var117 = var106.method_48$dbd570a038();
                                                                                    boolean var256 = var117.equals(net.C_42R.field_45);
                                                                                    long var516;
                                                                                    int var442 = (var516 = var1 - 0L) == 0L ? 0 : (var516 < 0L ? -1 : 1);
                                                                                    if (var13 == null) {
                                                                                       if (var256) {
                                                                                          var65 += var106.field_47;
                                                                                       }

                                                                                       var256 = var117.equals(net.C_43r.method_46$4158f44b4a(40));
                                                                                    }

                                                                                    long var517;
                                                                                    int var443 = (var517 = var1 - 0L) == 0L ? 0 : (var517 < 0L ? -1 : 1);
                                                                                    if (var13 == null) {
                                                                                       if (var256) {
                                                                                          var81 += var106.field_47;
                                                                                       }

                                                                                       var256 = var117.equals(net.C_42R.field_41u);
                                                                                    }

                                                                                    if (var256) {
                                                                                       var88++;
                                                                                    }
                                                                                 }

                                                                                 var96++;
                                                                              }

                                                                              if (var13 != null) {
                                                                                 break label2223;
                                                                              }

                                                                              var431 = -3623557529899877296L;
                                                                              var148 = field_43;
                                                                              if (var96 >= var148.field_42P.field_429.field_46.size()) {
                                                                                 break label2223;
                                                                              }

                                                                              var10001 = -3623557529899877296L;
                                                                              var165 = field_43;
                                                                              var106 = var165.field_42P
                                                                                 .field_429
                                                                                 .method_46$4c10532da1(var96)
                                                                                 .method_48$ac4db64966();
                                                                              var254 = var13;
                                                                              long var518;
                                                                              int var359 = (var518 = var1 - 0L) == 0L ? 0 : (var518 < 0L ? -1 : 1);
                                                                           }
                                                                        }

                                                                        while (true) {
                                                                           if (var254 != null) {
                                                                              break label2224;
                                                                           }

                                                                           long var519;
                                                                           int var352 = (var519 = var1 - 0L) == 0L ? 0 : (var519 < 0L ? -1 : 1);
                                                                           if (var13 == null) {
                                                                              long var520;
                                                                              int var353 = (var520 = var1 - 0L) == 0L ? 0 : (var520 < 0L ? -1 : 1);
                                                                              if (var106 != null) {
                                                                                 net.C_43r var116 = var106.method_48$dbd570a038();
                                                                                 boolean var255 = var116.equals(net.C_42R.field_45);
                                                                                 long var521;
                                                                                 int var439 = (var521 = var1 - 0L) == 0L ? 0 : (var521 < 0L ? -1 : 1);
                                                                                 if (var13 == null) {
                                                                                    if (var255) {
                                                                                       var65 += var106.field_47;
                                                                                    }

                                                                                    var255 = var116.equals(net.C_43r.method_46$4158f44b4a(40));
                                                                                 }

                                                                                 long var522;
                                                                                 int var440 = (var522 = var1 - 0L) == 0L ? 0 : (var522 < 0L ? -1 : 1);
                                                                                 if (var13 == null) {
                                                                                    if (var255) {
                                                                                       var73 += var106.field_47;
                                                                                    }

                                                                                    var255 = var116.equals(net.C_43r.method_46$4158f44b4a(39));
                                                                                 }

                                                                                 if (var13 == null) {
                                                                                    if (var255) {
                                                                                       var81 += var106.field_47;
                                                                                    }

                                                                                    var255 = var116.equals(net.C_42R.field_41u);
                                                                                 }

                                                                                 if (var255) {
                                                                                    var88++;
                                                                                 }
                                                                              }

                                                                              var96++;
                                                                           }

                                                                           if (var13 != null) {
                                                                              break label2226;
                                                                           }

                                                                           var431 = -3623557529899877296L;
                                                                           var148 = field_43;
                                                                           if (var96 >= var148.field_42P.field_429.field_46.size()) {
                                                                              break label2226;
                                                                           }

                                                                           var10001 = -3623557529899877296L;
                                                                           var165 = field_43;
                                                                           var106 = var165.field_42P
                                                                              .field_429
                                                                              .method_46$4c10532da1(var96)
                                                                              .method_48$ac4db64966();
                                                                           var254 = var13;
                                                                           long var523;
                                                                           int var355 = (var523 = var1 - 0L) == 0L ? 0 : (var523 < 0L ? -1 : 1);
                                                                        }
                                                                     }

                                                                     long var524;
                                                                     int var334 = (var524 = var1 - 0L) == 0L ? 0 : (var524 < 0L ? -1 : 1);
                                                                     if (var13 == null) {
                                                                        net.C_47rf var250 = var71;
                                                                        if (var1 <= 0L) {
                                                                           label2112:
                                                                           while (true) {
                                                                              var64 = ((byte) (var250.method_48$dbd570a038().equals(net.C_42R.field_41u) ? 1 : 0));
                                                                              var65++;

                                                                              while (var13 == null) {
                                                                                 var431 = -3623557529899877296L;
                                                                                 var125 = field_43;
                                                                                 if (var65 >= var125.field_42P.field_429.field_46.size()) {
                                                                                    break;
                                                                                 }

                                                                                 var10001 = -3623557529899877296L;
                                                                                 var134 = field_43;
                                                                                 net.C_47rf var72 = var134.field_42P
                                                                                    .field_429
                                                                                    .method_46$4c10532da1(var65)
                                                                                    .method_48$ac4db64966();
                                                                                 long var525;
                                                                                 int var343 = (var525 = var1 - 0L) == 0L ? 0 : (var525 < 0L ? -1 : 1);
                                                                                 if (var13 != null) {
                                                                                    boolean var251 = false;
                                                                                    break label2225;
                                                                                 }

                                                                                 long var526;
                                                                                 int var344 = (var526 = var1 - 0L) == 0L ? 0 : (var526 < 0L ? -1 : 1);
                                                                                 if (var13 == null) {
                                                                                    var250 = var72;
                                                                                    long var527;
                                                                                    int var345 = (var527 = var1 - 0L) == 0L ? 0 : (var527 < 0L ? -1 : 1);
                                                                                    continue label2112;
                                                                                 }
                                                                              }

                                                                              boolean var252 = false;
                                                                              long var528;
                                                                              int var346 = (var528 = var1 - 0L) == 0L ? 0 : (var528 < 0L ? -1 : 1);
                                                                              break label2225;
                                                                           }
                                                                        }

                                                                        label2147:
                                                                        while (true) {
                                                                           if (var250 != null) {
                                                                              var64 = ((byte) (var71.method_48$dbd570a038().equals(net.C_42R.field_41u) ? 1 : 0));
                                                                           }

                                                                           var65++;

                                                                           do {
                                                                              if (var13 != null) {
                                                                                 break label2147;
                                                                              }

                                                                              var431 = -3623557529899877296L;
                                                                              var125 = field_43;
                                                                              if (var65 >= var125.field_42P.field_429.field_46.size()) {
                                                                                 break label2147;
                                                                              }

                                                                              var10001 = -3623557529899877296L;
                                                                              var134 = field_43;
                                                                              var71 = var134.field_42P
                                                                                 .field_429
                                                                                 .method_46$4c10532da1(var65)
                                                                                 .method_48$ac4db64966();
                                                                              long var529;
                                                                              int var338 = (var529 = var1 - 0L) == 0L ? 0 : (var529 < 0L ? -1 : 1);
                                                                              if (var13 != null) {
                                                                                 break label2163;
                                                                              }

                                                                              long var530;
                                                                              int var339 = (var530 = var1 - 0L) == 0L ? 0 : (var530 < 0L ? -1 : 1);
                                                                           } while (var13 != null);

                                                                           var250 = var71;
                                                                           long var531;
                                                                           int var340 = (var531 = var1 - 0L) == 0L ? 0 : (var531 < 0L ? -1 : 1);
                                                                        }

                                                                        var249 = 0;
                                                                        long var532;
                                                                        int var341 = (var532 = var1 - 0L) == 0L ? 0 : (var532 < 0L ? -1 : 1);
                                                                        break label2162;
                                                                     }

                                                                     if (var13 != null) {
                                                                        break;
                                                                     }

                                                                     var431 = -3623557529899877296L;
                                                                     var125 = field_43;
                                                                     if (var65 >= var125.field_42P.field_429.field_46.size()) {
                                                                        break;
                                                                     }

                                                                     var10001 = -3623557529899877296L;
                                                                     var134 = field_43;
                                                                     var71 = var134.field_42P.field_429.method_46$4c10532da1(var65).method_48$ac4db64966();
                                                                     var248 = var13;
                                                                     long var533;
                                                                     int var336 = (var533 = var1 - 0L) == 0L ? 0 : (var533 < 0L ? -1 : 1);
                                                                  }

                                                                  var249 = 0;
                                                                  if (var1 <= 0L) {
                                                                     break label2225;
                                                                  }
                                                               } else {
                                                                  var249 = 0;
                                                                  if (var1 <= 0L) {
                                                                     boolean var76 = false;
                                                                     var81 = 0;
                                                                     var88 = 0;
                                                                     int var99 = 0;
                                                                     var431 = -3623557529899877296L;
                                                                     net.minecraft.client.Minecraft var153 = field_43;
                                                                     if (var99 >= var153.field_42P.field_429.field_46.size()) {
                                                                        var257 = var64;
                                                                        var360 = var13;
                                                                        long var534;
                                                                        int var466 = (var534 = var1 - 0L) == 0L ? 0 : (var534 < 0L ? -1 : 1);
                                                                        if (var1 < 0L) {
                                                                           break label2177;
                                                                        }
                                                                        break label2173;
                                                                     }

                                                                     var10001 = -3623557529899877296L;
                                                                     net.minecraft.client.Minecraft var170 = field_43;
                                                                     net.C_47rf var109 = var170.field_42P
                                                                        .field_429
                                                                        .method_46$4c10532da1(var99)
                                                                        .method_48$ac4db64966();
                                                                     int[] var263 = var13;
                                                                     long var535;
                                                                     int var381 = (var535 = var1 - 0L) == 0L ? 0 : (var535 < 0L ? -1 : 1);
                                                                     if (var1 < 0L) {
                                                                        while (true) {
                                                                           if (var263 != null) {
                                                                              break label2175;
                                                                           }

                                                                           var431 = -3623557529899877296L;
                                                                           var153 = field_43;
                                                                           if (var99 >= var153.field_42P.field_429.field_46.size()) {
                                                                              break label2175;
                                                                           }

                                                                           var10001 = -3623557529899877296L;
                                                                           var170 = field_43;
                                                                           var109 = var170.field_42P
                                                                              .field_429
                                                                              .method_46$4c10532da1(var99)
                                                                              .method_48$ac4db64966();
                                                                           var263 = var13;
                                                                           long var536;
                                                                           int var387 = (var536 = var1 - 0L) == 0L ? 0 : (var536 < 0L ? -1 : 1);
                                                                           long var537;
                                                                           int var388 = (var537 = var1 - 0L) == 0L ? 0 : (var537 < 0L ? -1 : 1);
                                                                        }
                                                                     }

                                                                     while (true) {
                                                                        if (var263 == null) {
                                                                           long var538;
                                                                           int var382 = (var538 = var1 - 0L) == 0L ? 0 : (var538 < 0L ? -1 : 1);
                                                                           if (var109 != null) {
                                                                              net.C_43r var119 = var109.method_48$dbd570a038();
                                                                              boolean var264 = var119.equals(net.C_42R.field_45);
                                                                              long var539;
                                                                              int var458 = (var539 = var1 - 0L) == 0L ? 0 : (var539 < 0L ? -1 : 1);
                                                                              if (var13 == null) {
                                                                                 if (var264) {
                                                                                    var65 += var109.field_47;
                                                                                 }

                                                                                 var264 = var119.equals(net.C_43r.method_46$4158f44b4a(40));
                                                                              }

                                                                              long var540;
                                                                              int var459 = (var540 = var1 - 0L) == 0L ? 0 : (var540 < 0L ? -1 : 1);
                                                                              if (var13 == null) {
                                                                                 if (var264) {
                                                                                    var81 += var109.field_47;
                                                                                 }

                                                                                 var264 = var119.equals(net.C_42R.field_41u);
                                                                              }

                                                                              if (var264) {
                                                                                 var88++;
                                                                              }
                                                                           }

                                                                           var99++;
                                                                        }

                                                                        if (var13 != null) {
                                                                           break label2223;
                                                                        }

                                                                        var431 = -3623557529899877296L;
                                                                        var153 = field_43;
                                                                        if (var99 >= var153.field_42P.field_429.field_46.size()) {
                                                                           break label2223;
                                                                        }

                                                                        var10001 = -3623557529899877296L;
                                                                        var170 = field_43;
                                                                        var109 = var170.field_42P.field_429.method_46$4c10532da1(var99).method_48$ac4db64966();
                                                                        var263 = var13;
                                                                        long var541;
                                                                        int var384 = (var541 = var1 - 0L) == 0L ? 0 : (var541 < 0L ? -1 : 1);
                                                                        long var542;
                                                                        int var385 = (var542 = var1 - 0L) == 0L ? 0 : (var542 < 0L ? -1 : 1);
                                                                     }
                                                                  }
                                                               }

                                                               var65 = var249;
                                                            }

                                                            var73 = 0;
                                                            var81 = 0;
                                                            var88 = 0;
                                                            int var98 = 0;

                                                            do {
                                                               long var447 = -3623557529899877296L;
                                                               net.minecraft.client.Minecraft var152 = field_43;
                                                               if (var98 >= var152.field_42P.field_429.field_46.size()) {
                                                                  break;
                                                               }

                                                               var10001 = -3623557529899877296L;
                                                               net.minecraft.client.Minecraft var169 = field_43;
                                                               net.C_47rf var108 = var169.field_42P.field_429.method_46$4c10532da1(var98).method_48$ac4db64966();
                                                               long var543;
                                                               int var369 = (var543 = var1 - 0L) == 0L ? 0 : (var543 < 0L ? -1 : 1);
                                                               if (var13 != null) {
                                                                  break label2224;
                                                               }

                                                               long var544;
                                                               int var370 = (var544 = var1 - 0L) == 0L ? 0 : (var544 < 0L ? -1 : 1);
                                                               if (var13 == null) {
                                                                  long var545;
                                                                  int var371 = (var545 = var1 - 0L) == 0L ? 0 : (var545 < 0L ? -1 : 1);
                                                                  if (var108 != null) {
                                                                     net.C_43r var118 = var108.method_48$dbd570a038();
                                                                     boolean var258 = var118.equals(net.C_42R.field_45);
                                                                     long var546;
                                                                     int var448 = (var546 = var1 - 0L) == 0L ? 0 : (var546 < 0L ? -1 : 1);
                                                                     if (var13 == null) {
                                                                        if (var258) {
                                                                           var65 += var108.field_47;
                                                                        }

                                                                        var258 = var118.equals(net.C_43r.method_46$4158f44b4a(40));
                                                                     }

                                                                     long var547;
                                                                     int var449 = (var547 = var1 - 0L) == 0L ? 0 : (var547 < 0L ? -1 : 1);
                                                                     if (var13 == null) {
                                                                        if (var258) {
                                                                           var73 += var108.field_47;
                                                                        }

                                                                        var258 = var118.equals(net.C_43r.method_46$4158f44b4a(39));
                                                                     }

                                                                     if (var13 == null) {
                                                                        if (var258) {
                                                                           var81 += var108.field_47;
                                                                        }

                                                                        var258 = var118.equals(net.C_42R.field_41u);
                                                                     }

                                                                     if (var258) {
                                                                        var88++;
                                                                     }
                                                                  }

                                                                  var98++;
                                                               }
                                                            } while (var13 == null);
                                                         }

                                                         var257 = var64;
                                                         var360 = var13;
                                                         long var548;
                                                         int var450 = (var548 = var1 - 0L) == 0L ? 0 : (var548 < 0L ? -1 : 1);
                                                      }

                                                      long var549;
                                                      int var451 = (var549 = var1 - 0L) == 0L ? 0 : (var549 < 0L ? -1 : 1);
                                                      if (var360 == null) {
                                                         if (var257 != 0) {
                                                            break label2224;
                                                         }

                                                         var257 = var88;
                                                      }

                                                      label2086: {
                                                         label2246: {
                                                            if (var13 == null) {
                                                               if (var257 > 0) {
                                                                  break label2246;
                                                               }

                                                               var257 = var81;
                                                               long var550;
                                                               var451 = (var550 = var1 - 0L) == 0L ? 0 : (var550 < 0L ? -1 : 1);
                                                               if (var13 == null) {
                                                                  if (var81 <= 0) {
                                                                     break label2224;
                                                                  }

                                                                  var257 = var73;
                                                               }

                                                               long var551;
                                                               var451 = (var551 = var1 - 0L) == 0L ? 0 : (var551 < 0L ? -1 : 1);
                                                               if (var13 == null) {
                                                                  if (var257 <= 0) {
                                                                     break label2224;
                                                                  }

                                                                  var257 = var65;
                                                               }

                                                               if (var13 == null) {
                                                                  if (var257 <= 0) {
                                                                     break label2224;
                                                                  }
                                                                  break label2246;
                                                               }
                                                            }

                                                            if (var257 == 0) {
                                                               break label2168;
                                                            }

                                                            char var454 = (char)var5;
                                                            long var476 = -3627280432820602949L;
                                                            net.C_47AC.method_43$f84fd1f462(var3, var4, var454);
                                                            net.minecraft.client.Minecraft var259 = field_43;
                                                            long var485 = -3623557529899877296L;
                                                            net.minecraft.client.Minecraft var173 = field_43;
                                                            net.C_47pL var372 = new net.C_47pL(var173.field_42P);
                                                            long var455 = -3624695007628123656L;
                                                            net.C_47pL var174 = var372;
                                                            net.minecraft.client.Minecraft var175 = var259;
                                                            var175.method_43$7480b345ab(var174);
                                                            var260 = this.field_48y;
                                                            break label2086;
                                                         }

                                                         long var552;
                                                         int var373 = (var552 = var1 - 0L) == 0L ? 0 : (var552 < 0L ? -1 : 1);
                                                         var260 = this.field_48y;
                                                      }

                                                      var10001 = -3625791644553168093L;
                                                      net.C_47cu var176 = var260;
                                                      var176.method_46$da8c82d5d4();
                                                      var10001 = -3623339026511492516L;
                                                      client.setting.RangeSetting var177 = this.settingAutoOpenDelay;
                                                      var177.method_43$fedcb3e4d3();
                                                      long var553;
                                                      int var376 = (var553 = var1 - 0L) == 0L ? 0 : (var553 < 0L ? -1 : 1);
                                                      if (var13 == null) {
                                                         break label2168;
                                                      }
                                                      break label2224;
                                                   }

                                                   int var80 = 0;
                                                   int var87 = 0;
                                                   int var95 = 0;

                                                   while (true) {
                                                      long var435 = -3623557529899877296L;
                                                      net.minecraft.client.Minecraft var147 = field_43;
                                                      if (var95 >= var147.field_42P.field_429.field_46.size()) {
                                                         break label2223;
                                                      }

                                                      var10001 = -3623557529899877296L;
                                                      net.minecraft.client.Minecraft var164 = field_43;
                                                      net.C_47rf var105 = var164.field_42P.field_429.method_46$4c10532da1(var95).method_48$ac4db64966();
                                                      long var554;
                                                      int var348 = (var554 = var1 - 0L) == 0L ? 0 : (var554 < 0L ? -1 : 1);
                                                      long var555;
                                                      int var349 = (var555 = var1 - 0L) == 0L ? 0 : (var555 < 0L ? -1 : 1);
                                                      if (var13 == null) {
                                                         long var556;
                                                         int var350 = (var556 = var1 - 0L) == 0L ? 0 : (var556 < 0L ? -1 : 1);
                                                         if (var105 != null) {
                                                            net.C_43r var115 = var105.method_48$dbd570a038();
                                                            boolean var253 = var115.equals(net.C_42R.field_45);
                                                            long var557;
                                                            int var436 = (var557 = var1 - 0L) == 0L ? 0 : (var557 < 0L ? -1 : 1);
                                                            if (var13 == null) {
                                                               if (var253) {
                                                                  var65 += var105.field_47;
                                                               }

                                                               var253 = var115.equals(net.C_43r.method_46$4158f44b4a(40));
                                                            }

                                                            long var558;
                                                            int var437 = (var558 = var1 - 0L) == 0L ? 0 : (var558 < 0L ? -1 : 1);
                                                            if (var13 == null) {
                                                               if (var253) {
                                                                  var80 += var105.field_47;
                                                               }

                                                               var253 = var115.equals(net.C_42R.field_41u);
                                                            }

                                                            if (var253) {
                                                               var87++;
                                                            }
                                                         }

                                                         var95++;
                                                      }

                                                      if (var13 != null) {
                                                         break label2223;
                                                      }
                                                   }
                                                }

                                                var10001 = -3625791644553168093L;
                                                net.C_47cu var178 = this.field_48y;
                                                var178.method_46$da8c82d5d4();
                                             }

                                             if (var13 != null) {
                                                var10001 = -3625791644553168093L;
                                                net.C_47cu var180 = this.field_48y;
                                                var180.method_46$da8c82d5d4();
                                             }

                                             long var499 = -3624559932156021829L;
                                             int var183 = var10;
                                             int var186 = var9;
                                             int var189 = var8;
                                             AutoSoup_47Ci var192 = this;
                                             this.field_42 = var192.method_45$cabccf1c64(var189, var186, var183);
                                             var261 = this.field_42;
                                             long var559;
                                             int var456 = (var559 = var1 - 0L) == 0L ? 0 : (var559 < 0L ? -1 : 1);
                                             if (var13 != null) {
                                                break label2283;
                                             }

                                             if (this.field_42 <= -1) {
                                                break label2220;
                                             }

                                             this.field_43a = true;
                                             var262 = this;
                                             long var560;
                                             int var379 = (var560 = var1 - 0L) == 0L ? 0 : (var560 < 0L ? -1 : 1);
                                             break label2256;
                                          }

                                          var257 = var64;
                                          var360 = var13;
                                          long var561;
                                          int var461 = (var561 = var1 - 0L) == 0L ? 0 : (var561 < 0L ? -1 : 1);
                                          break label2258;
                                       }
                                    }

                                    int var477 = this.field_42;
                                    long var501 = -3626486982878548206L;
                                    client.setting.BooleanSetting var194 = this.settingSilent;
                                    boolean var486 = var194.method_49$aae029aa0a();
                                    var501 = -3623986212517300498L;
                                    boolean var195 = var486;
                                    int var196 = var477;
                                    byte var197 = 5;
                                    long var198 = var11;
                                    AutoSoup_47Ci var199 = var262;
                                    net.C_47i.method_46$1d13c11fdd(var199, var198, var197, var196, var195);
                                    break label2220;
                                 }

                                 long var562;
                                 int var462 = (var562 = var1 - 0L) == 0L ? 0 : (var562 < 0L ? -1 : 1);
                              }

                              if (var360 != null) {
                                 break label2284;
                              }

                              if (var257 > -1) {
                                 this.field_43a = true;
                                 var262 = this;
                                 long var563;
                                 int var389 = (var563 = var1 - 0L) == 0L ? 0 : (var563 < 0L ? -1 : 1);
                              } else {
                                 var262 = this;
                              }
                              break label2176;
                           }

                           var261 = ((this.field_43a) ? 1 : 0);
                           break label2283;
                        }

                        var257 = var64;
                        var360 = var13;
                        long var564;
                        int var464 = (var564 = var1 - 0L) == 0L ? 0 : (var564 < 0L ? -1 : 1);
                        long var565;
                        var464 = (var565 = var1 - 0L) == 0L ? 0 : (var565 < 0L ? -1 : 1);
                        break label2177;
                     }

                     var257 = ((var262.field_43a) ? 1 : 0);
                     break label2284;
                  }

                  long var566;
                  int var470 = (var566 = var1 - 0L) == 0L ? 0 : (var566 < 0L ? -1 : 1);
                  if (var360 == null) {
                     if (var257 < 0) {
                        return;
                     }

                     var257 = net.C_47i.field_40;
                  }

                  if (var257 < 9) {
                     this.field_437 = net.C_47i.field_40;
                  }

                  return;
               }

               long var567;
               int var469 = (var567 = var1 - 0L) == 0L ? 0 : (var567 < 0L ? -1 : 1);
               if (var13 == null) {
                  if (var257 != 0) {
                     this.field_43a = false;
                     int var480 = this.field_437;
                     long var507 = -3626486982878548206L;
                     client.setting.BooleanSetting var204 = this.settingSilent;
                     boolean var489 = var204.method_49$aae029aa0a();
                     var507 = -3623986212517300498L;
                     boolean var209 = var489;
                     int var214 = var480;
                     byte var219 = 5;
                     long var224 = var11;
                     AutoSoup_47Ci var229 = this;
                     net.C_47i.method_46$1d13c11fdd(var229, var224, var219, var214, var209);
                  }

                  var257 = net.C_47i.field_40;
               }

               if (var13 == null) {
                  if (var257 < 0) {
                     return;
                  }

                  var257 = net.C_47i.field_40;
               }

               if (var257 < 9) {
                  this.field_437 = net.C_47i.field_40;
               }

               return;
            }

            long var568;
            int var468 = (var568 = var1 - 0L) == 0L ? 0 : (var568 < 0L ? -1 : 1);
            if (var13 == null) {
               if (var257 != 0) {
                  this.field_43a = false;
                  int var479 = this.field_437;
                  long var505 = -3626486982878548206L;
                  client.setting.BooleanSetting var203 = this.settingSilent;
                  boolean var488 = var203.method_49$aae029aa0a();
                  var505 = -3623986212517300498L;
                  boolean var208 = var488;
                  int var213 = var479;
                  byte var218 = 5;
                  long var223 = var11;
                  AutoSoup_47Ci var228 = this;
                  net.C_47i.method_46$1d13c11fdd(var228, var223, var218, var213, var208);
               }

               var257 = net.C_47i.field_40;
            }

            if (var13 == null) {
               if (var257 < 0) {
                  return;
               }

               var257 = net.C_47i.field_40;
            }

            if (var257 < 9) {
               this.field_437 = net.C_47i.field_40;
            }

            return;
         }

         long var569;
         int var467 = (var569 = var1 - 0L) == 0L ? 0 : (var569 < 0L ? -1 : 1);
         if (var13 == null) {
            if (var261 != 0) {
               this.field_43a = false;
               int var478 = this.field_437;
               long var503 = -3626486982878548206L;
               client.setting.BooleanSetting var202 = this.settingSilent;
               boolean var487 = var202.method_49$aae029aa0a();
               var503 = -3623986212517300498L;
               boolean var207 = var487;
               int var212 = var478;
               byte var217 = 5;
               long var222 = var11;
               AutoSoup_47Ci var227 = this;
               net.C_47i.method_46$1d13c11fdd(var227, var222, var217, var212, var207);
            }

            var261 = net.C_47i.field_40;
         }

         if (var13 == null) {
            if (var261 < 0) {
               return;
            }

            var261 = net.C_47i.field_40;
         }

         if (var261 < 9) {
            this.field_437 = net.C_47i.field_40;
         }
      } else if (!var230) {
         if (this.field_48Z) {
            var10001 = -3623557529899877296L;
            net.minecraft.client.Minecraft var23 = field_43;
            if (var23.field_42P != null) {
               var10001 = -3625955588546939359L;
               net.minecraft.client.Minecraft var24 = field_43;
               if (var24.method_44$aae029aa0a()) {
                  var10001 = -3623557529899877296L;
                  net.minecraft.client.Minecraft var25 = field_43;
                  if (var25.field_42P.field_48y > 50) {
                     var10001 = -3623557529899877296L;
                     net.minecraft.client.Minecraft var26 = field_43;
                     if (var26.field_42P.method_43$bc607678b6() > 0.0F) {
                     }
                  }
               }
            }
         }

         label2287: {
            label2288: {
               label1956: {
                  label2289: {
                     label2188: {
                        var10001 = -3626486982878548206L;
                        client.setting.BooleanSetting var27 = this.settingAutoOpen;
                        if (var27.method_49$aae029aa0a()) {
                           var10001 = -3625955588546939359L;
                           net.minecraft.client.Minecraft var28 = field_43;
                           if (var28.method_44$aae029aa0a()) {
                              byte var14;
                              label2189: {
                                 label2290: {
                                    label1948: {
                                       label1947: {
                                          label1946: {
                                             label2191: {
                                                int var15;
                                                int var67;
                                                int var77;
                                                int var84;
                                                label2192: {
                                                   label1943: {
                                                      label2193: {
                                                         label1941: {
                                                            var14 = 0;
                                                            var15 = 36;
                                                            long var391 = -3623557529899877296L;
                                                            net.minecraft.client.Minecraft var29 = field_43;
                                                            label1940:
                                                            if (var15 < var29.field_42P.field_429.field_46.size()) {
                                                               var10001 = -3623557529899877296L;
                                                               net.minecraft.client.Minecraft var30 = field_43;
                                                               net.C_47rf var16 = var30.field_42P.field_429.method_46$4c10532da1(var15).method_48$ac4db64966();
                                                               int[] var233 = var13;
                                                               if (var1 < 0L) {
                                                                  while (true) {
                                                                     long var570;
                                                                     int var302 = (var570 = var1 - 0L) == 0L ? 0 : (var570 < 0L ? -1 : 1);
                                                                     if (var233 == null) {
                                                                        var391 = -3623557529899877296L;
                                                                        var29 = field_43;
                                                                        if (var15 < var29.field_42P.field_429.field_46.size()) {
                                                                           var10001 = -3623557529899877296L;
                                                                           var30 = field_43;
                                                                           net.C_47rf var69 = var30.field_42P
                                                                              .field_429
                                                                              .method_46$4c10532da1(var15)
                                                                              .method_48$ac4db64966();
                                                                           var233 = var13;
                                                                           long var571;
                                                                           int var308 = (var571 = var1 - 0L) == 0L ? 0 : (var571 < 0L ? -1 : 1);
                                                                           continue;
                                                                        }
                                                                     }

                                                                     long var572;
                                                                     int var303 = (var572 = var1 - 0L) == 0L ? 0 : (var572 < 0L ? -1 : 1);
                                                                     boolean var68 = false;
                                                                     boolean var78 = false;
                                                                     boolean var85 = false;
                                                                     byte var92 = 0;

                                                                     while (true) {
                                                                        var391 = -3623557529899877296L;
                                                                        net.minecraft.client.Minecraft var142 = field_43;
                                                                        if (var92 >= var142.field_42P.field_429.field_46.size()) {
                                                                           break label2189;
                                                                        }

                                                                        var10001 = -3623557529899877296L;
                                                                        net.minecraft.client.Minecraft var159 = field_43;
                                                                        net.C_47rf var101 = var159.field_42P
                                                                           .field_429
                                                                           .method_46$4c10532da1(var92)
                                                                           .method_48$ac4db64966();
                                                                        long var573;
                                                                        int var305 = (var573 = var1 - 0L) == 0L ? 0 : (var573 < 0L ? -1 : 1);
                                                                        long var574;
                                                                        int var306 = (var574 = var1 - 0L) == 0L ? 0 : (var574 < 0L ? -1 : 1);
                                                                        if (var13 != null) {
                                                                           break label2189;
                                                                        }
                                                                     }
                                                                  }
                                                               }

                                                               while (true) {
                                                                  if (var233 != null) {
                                                                     var67 = 0;
                                                                     var77 = 0;
                                                                     var84 = 0;
                                                                     int var91 = 0;
                                                                     var391 = -3623557529899877296L;
                                                                     net.minecraft.client.Minecraft var139 = field_43;
                                                                     if (var91 >= var139.field_42P.field_429.field_46.size()) {
                                                                        var231 = var14;
                                                                        var274 = var13;
                                                                        if (var1 <= 0L) {
                                                                           break label1947;
                                                                        }
                                                                        break label2192;
                                                                     }

                                                                     var10001 = -3623557529899877296L;
                                                                     net.minecraft.client.Minecraft var156 = field_43;
                                                                     net.C_47rf var100 = var156.field_42P
                                                                        .field_429
                                                                        .method_46$4c10532da1(var91)
                                                                        .method_48$ac4db64966();
                                                                     int[] var239 = var13;
                                                                     if (var1 <= 0L) {
                                                                        while (true) {
                                                                           long var575;
                                                                           int var298 = (var575 = var1 - 0L) == 0L ? 0 : (var575 < 0L ? -1 : 1);
                                                                           if (var239 == null) {
                                                                              long var576;
                                                                              int var299 = (var576 = var1 - 0L) == 0L ? 0 : (var576 < 0L ? -1 : 1);
                                                                              label1826:
                                                                              if (var100 != null) {
                                                                                 net.C_43r var112 = var100.method_48$dbd570a038();
                                                                                 boolean var241 = var112.equals(net.C_42R.field_45);
                                                                                 long var577;
                                                                                 int var402 = (var577 = var1 - 0L) == 0L ? 0 : (var577 < 0L ? -1 : 1);
                                                                                 if (var13 == null) {
                                                                                    if (var241) {
                                                                                       var15 += var100.field_47;
                                                                                       break label1826;
                                                                                    }

                                                                                    var241 = var112.equals(net.C_43r.method_46$4158f44b4a(40));
                                                                                 }

                                                                                 long var578;
                                                                                 int var403 = (var578 = var1 - 0L) == 0L ? 0 : (var578 < 0L ? -1 : 1);
                                                                                 if (var13 == null) {
                                                                                    if (var241) {
                                                                                       var77 += var100.field_47;
                                                                                       break label1826;
                                                                                    }

                                                                                    var241 = var112.equals(net.C_42R.field_41u);
                                                                                 }

                                                                                 if (var241) {
                                                                                    var84++;
                                                                                 }
                                                                              }

                                                                              var91++;
                                                                           }

                                                                           if (var13 != null) {
                                                                              break label2191;
                                                                           }

                                                                           var391 = -3623557529899877296L;
                                                                           var139 = field_43;
                                                                           if (var91 >= var139.field_42P.field_429.field_46.size()) {
                                                                              break label2191;
                                                                           }

                                                                           var10001 = -3623557529899877296L;
                                                                           var156 = field_43;
                                                                           var100 = var156.field_42P
                                                                              .field_429
                                                                              .method_46$4c10532da1(var91)
                                                                              .method_48$ac4db64966();
                                                                           var239 = var13;
                                                                           long var579;
                                                                           int var301 = (var579 = var1 - 0L) == 0L ? 0 : (var579 < 0L ? -1 : 1);
                                                                        }
                                                                     }

                                                                     while (true) {
                                                                        if (var239 != null) {
                                                                           break label1946;
                                                                        }

                                                                        long var580;
                                                                        int var294 = (var580 = var1 - 0L) == 0L ? 0 : (var580 < 0L ? -1 : 1);
                                                                        if (var13 == null) {
                                                                           long var581;
                                                                           int var295 = (var581 = var1 - 0L) == 0L ? 0 : (var581 < 0L ? -1 : 1);
                                                                           label1873:
                                                                           if (var100 != null) {
                                                                              net.C_43r var111 = var100.method_48$dbd570a038();
                                                                              boolean var240 = var111.equals(net.C_42R.field_45);
                                                                              long var582;
                                                                              int var399 = (var582 = var1 - 0L) == 0L ? 0 : (var582 < 0L ? -1 : 1);
                                                                              if (var13 == null) {
                                                                                 if (var240) {
                                                                                    var15 += var100.field_47;
                                                                                    break label1873;
                                                                                 }

                                                                                 var240 = var111.equals(net.C_43r.method_46$4158f44b4a(40));
                                                                              }

                                                                              long var583;
                                                                              int var400 = (var583 = var1 - 0L) == 0L ? 0 : (var583 < 0L ? -1 : 1);
                                                                              if (var13 == null) {
                                                                                 if (var240) {
                                                                                    var67 += var100.field_47;
                                                                                    break label1873;
                                                                                 }

                                                                                 var240 = var111.equals(net.C_43r.method_46$4158f44b4a(39));
                                                                              }

                                                                              if (var13 == null) {
                                                                                 if (var240) {
                                                                                    var77 += var100.field_47;
                                                                                    break label1873;
                                                                                 }

                                                                                 var240 = var111.equals(net.C_42R.field_41u);
                                                                              }

                                                                              if (var240) {
                                                                                 var84++;
                                                                              }
                                                                           }

                                                                           var91++;
                                                                        }

                                                                        if (var13 != null) {
                                                                           break label2193;
                                                                        }

                                                                        var391 = -3623557529899877296L;
                                                                        var139 = field_43;
                                                                        if (var91 >= var139.field_42P.field_429.field_46.size()) {
                                                                           break label2193;
                                                                        }

                                                                        var10001 = -3623557529899877296L;
                                                                        var156 = field_43;
                                                                        var100 = var156.field_42P.field_429.method_46$4c10532da1(var91).method_48$ac4db64966();
                                                                        var239 = var13;
                                                                        long var584;
                                                                        int var297 = (var584 = var1 - 0L) == 0L ? 0 : (var584 < 0L ? -1 : 1);
                                                                     }
                                                                  }

                                                                  long var585;
                                                                  int var276 = (var585 = var1 - 0L) == 0L ? 0 : (var585 < 0L ? -1 : 1);
                                                                  if (var13 == null) {
                                                                     net.C_47rf var235 = var16;
                                                                     if (var1 <= 0L) {
                                                                        label1852:
                                                                        while (true) {
                                                                           if (var235.method_48$dbd570a038().equals(net.C_42R.field_41u)) {
                                                                              var14 = 1;
                                                                           } else {
                                                                              var15++;

                                                                              while (var13 == null) {
                                                                                 var391 = -3623557529899877296L;
                                                                                 var29 = field_43;
                                                                                 if (var15 >= var29.field_42P.field_429.field_46.size()) {
                                                                                    break;
                                                                                 }

                                                                                 var10001 = -3623557529899877296L;
                                                                                 var30 = field_43;
                                                                                 net.C_47rf var66 = var30.field_42P
                                                                                    .field_429
                                                                                    .method_46$4c10532da1(var15)
                                                                                    .method_48$ac4db64966();
                                                                                 long var586;
                                                                                 int var285 = (var586 = var1 - 0L) == 0L ? 0 : (var586 < 0L ? -1 : 1);
                                                                                 if (var13 != null) {
                                                                                    boolean var236 = false;
                                                                                    break label1943;
                                                                                 }

                                                                                 long var587;
                                                                                 int var286 = (var587 = var1 - 0L) == 0L ? 0 : (var587 < 0L ? -1 : 1);
                                                                                 if (var13 == null) {
                                                                                    var235 = var66;
                                                                                    long var588;
                                                                                    int var287 = (var588 = var1 - 0L) == 0L ? 0 : (var588 < 0L ? -1 : 1);
                                                                                    continue label1852;
                                                                                 }
                                                                              }
                                                                           }

                                                                           boolean var237 = false;
                                                                           long var589;
                                                                           int var288 = (var589 = var1 - 0L) == 0L ? 0 : (var589 < 0L ? -1 : 1);
                                                                           break label1943;
                                                                        }
                                                                     }

                                                                     label1925:
                                                                     while (true) {
                                                                        if (var235 != null && var16.method_48$dbd570a038().equals(net.C_42R.field_41u)) {
                                                                           var14 = 1;
                                                                           break;
                                                                        }

                                                                        var15++;

                                                                        do {
                                                                           if (var13 != null) {
                                                                              break label1925;
                                                                           }

                                                                           var391 = -3623557529899877296L;
                                                                           var29 = field_43;
                                                                           if (var15 >= var29.field_42P.field_429.field_46.size()) {
                                                                              break label1925;
                                                                           }

                                                                           var10001 = -3623557529899877296L;
                                                                           var30 = field_43;
                                                                           var16 = var30.field_42P.field_429.method_46$4c10532da1(var15).method_48$ac4db64966();
                                                                           long var590;
                                                                           int var280 = (var590 = var1 - 0L) == 0L ? 0 : (var590 < 0L ? -1 : 1);
                                                                           if (var13 != null) {
                                                                              break label1941;
                                                                           }

                                                                           long var591;
                                                                           int var281 = (var591 = var1 - 0L) == 0L ? 0 : (var591 < 0L ? -1 : 1);
                                                                        } while (var13 != null);

                                                                        var235 = var16;
                                                                        long var592;
                                                                        int var282 = (var592 = var1 - 0L) == 0L ? 0 : (var592 < 0L ? -1 : 1);
                                                                     }

                                                                     var234 = 0;
                                                                     long var593;
                                                                     int var283 = (var593 = var1 - 0L) == 0L ? 0 : (var593 < 0L ? -1 : 1);
                                                                     break label1940;
                                                                  }

                                                                  if (var13 != null) {
                                                                     break;
                                                                  }

                                                                  var391 = -3623557529899877296L;
                                                                  var29 = field_43;
                                                                  if (var15 >= var29.field_42P.field_429.field_46.size()) {
                                                                     break;
                                                                  }

                                                                  var10001 = -3623557529899877296L;
                                                                  var30 = field_43;
                                                                  var16 = var30.field_42P.field_429.method_46$4c10532da1(var15).method_48$ac4db64966();
                                                                  var233 = var13;
                                                                  long var594;
                                                                  int var278 = (var594 = var1 - 0L) == 0L ? 0 : (var594 < 0L ? -1 : 1);
                                                               }

                                                               var234 = 0;
                                                               if (var1 <= 0L) {
                                                                  break label1943;
                                                               }
                                                            } else {
                                                               var234 = 0;
                                                               if (var1 <= 0L) {
                                                                  boolean var70 = false;
                                                                  var77 = 0;
                                                                  var84 = 0;
                                                                  int var94 = 0;
                                                                  var391 = -3623557529899877296L;
                                                                  net.minecraft.client.Minecraft var144 = field_43;
                                                                  if (var94 >= var144.field_42P.field_429.field_46.size()) {
                                                                     var231 = var14;
                                                                     var274 = var13;
                                                                     long var595;
                                                                     int var428 = (var595 = var1 - 0L) == 0L ? 0 : (var595 < 0L ? -1 : 1);
                                                                     if (var1 < 0L) {
                                                                        break label1956;
                                                                     }
                                                                     break label2290;
                                                                  }

                                                                  var10001 = -3623557529899877296L;
                                                                  net.minecraft.client.Minecraft var161 = field_43;
                                                                  net.C_47rf var103 = var161.field_42P.field_429.method_46$4c10532da1(var94).method_48$ac4db64966();
                                                                  int[] var246 = var13;
                                                                  long var596;
                                                                  int var323 = (var596 = var1 - 0L) == 0L ? 0 : (var596 < 0L ? -1 : 1);
                                                                  if (var1 < 0L) {
                                                                     while (true) {
                                                                        if (var246 != null) {
                                                                           break label2189;
                                                                        }

                                                                        var391 = -3623557529899877296L;
                                                                        var144 = field_43;
                                                                        if (var94 >= var144.field_42P.field_429.field_46.size()) {
                                                                           break label2189;
                                                                        }

                                                                        var10001 = -3623557529899877296L;
                                                                        var161 = field_43;
                                                                        var103 = var161.field_42P.field_429.method_46$4c10532da1(var94).method_48$ac4db64966();
                                                                        var246 = var13;
                                                                        long var597;
                                                                        int var329 = (var597 = var1 - 0L) == 0L ? 0 : (var597 < 0L ? -1 : 1);
                                                                        long var598;
                                                                        int var330 = (var598 = var1 - 0L) == 0L ? 0 : (var598 < 0L ? -1 : 1);
                                                                     }
                                                                  }

                                                                  while (true) {
                                                                     if (var246 == null) {
                                                                        long var599;
                                                                        int var324 = (var599 = var1 - 0L) == 0L ? 0 : (var599 < 0L ? -1 : 1);
                                                                        label1803:
                                                                        if (var103 != null) {
                                                                           net.C_43r var114 = var103.method_48$dbd570a038();
                                                                           boolean var247 = var114.equals(net.C_42R.field_45);
                                                                           long var600;
                                                                           int var420 = (var600 = var1 - 0L) == 0L ? 0 : (var600 < 0L ? -1 : 1);
                                                                           if (var13 == null) {
                                                                              if (var247) {
                                                                                 var15 += var103.field_47;
                                                                                 break label1803;
                                                                              }

                                                                              var247 = var114.equals(net.C_43r.method_46$4158f44b4a(40));
                                                                           }

                                                                           long var601;
                                                                           int var421 = (var601 = var1 - 0L) == 0L ? 0 : (var601 < 0L ? -1 : 1);
                                                                           if (var13 == null) {
                                                                              if (var247) {
                                                                                 var77 += var103.field_47;
                                                                                 break label1803;
                                                                              }

                                                                              var247 = var114.equals(net.C_42R.field_41u);
                                                                           }

                                                                           if (var247) {
                                                                              var84++;
                                                                           }
                                                                        }

                                                                        var94++;
                                                                     }

                                                                     if (var13 != null) {
                                                                        break label2191;
                                                                     }

                                                                     var391 = -3623557529899877296L;
                                                                     var144 = field_43;
                                                                     if (var94 >= var144.field_42P.field_429.field_46.size()) {
                                                                        break label2191;
                                                                     }

                                                                     var10001 = -3623557529899877296L;
                                                                     var161 = field_43;
                                                                     var103 = var161.field_42P.field_429.method_46$4c10532da1(var94).method_48$ac4db64966();
                                                                     var246 = var13;
                                                                     long var602;
                                                                     int var326 = (var602 = var1 - 0L) == 0L ? 0 : (var602 < 0L ? -1 : 1);
                                                                     long var603;
                                                                     int var327 = (var603 = var1 - 0L) == 0L ? 0 : (var603 < 0L ? -1 : 1);
                                                                  }
                                                               }
                                                            }

                                                            var15 = var234;
                                                         }

                                                         var67 = 0;
                                                         var77 = 0;
                                                         var84 = 0;
                                                         int var93 = 0;

                                                         do {
                                                            long var407 = -3623557529899877296L;
                                                            net.minecraft.client.Minecraft var143 = field_43;
                                                            if (var93 >= var143.field_42P.field_429.field_46.size()) {
                                                               break;
                                                            }

                                                            var10001 = -3623557529899877296L;
                                                            net.minecraft.client.Minecraft var160 = field_43;
                                                            net.C_47rf var102 = var160.field_42P.field_429.method_46$4c10532da1(var93).method_48$ac4db64966();
                                                            long var604;
                                                            int var310 = (var604 = var1 - 0L) == 0L ? 0 : (var604 < 0L ? -1 : 1);
                                                            if (var13 != null) {
                                                               break label1946;
                                                            }

                                                            long var605;
                                                            int var311 = (var605 = var1 - 0L) == 0L ? 0 : (var605 < 0L ? -1 : 1);
                                                            if (var13 == null) {
                                                               long var606;
                                                               int var312 = (var606 = var1 - 0L) == 0L ? 0 : (var606 < 0L ? -1 : 1);
                                                               label1899:
                                                               if (var102 != null) {
                                                                  net.C_43r var113 = var102.method_48$dbd570a038();
                                                                  boolean var242 = var113.equals(net.C_42R.field_45);
                                                                  long var607;
                                                                  int var408 = (var607 = var1 - 0L) == 0L ? 0 : (var607 < 0L ? -1 : 1);
                                                                  if (var13 == null) {
                                                                     if (var242) {
                                                                        var15 += var102.field_47;
                                                                        break label1899;
                                                                     }

                                                                     var242 = var113.equals(net.C_43r.method_46$4158f44b4a(40));
                                                                  }

                                                                  long var608;
                                                                  int var409 = (var608 = var1 - 0L) == 0L ? 0 : (var608 < 0L ? -1 : 1);
                                                                  if (var13 == null) {
                                                                     if (var242) {
                                                                        var67 += var102.field_47;
                                                                        break label1899;
                                                                     }

                                                                     var242 = var113.equals(net.C_43r.method_46$4158f44b4a(39));
                                                                  }

                                                                  if (var13 == null) {
                                                                     if (var242) {
                                                                        var77 += var102.field_47;
                                                                        break label1899;
                                                                     }

                                                                     var242 = var113.equals(net.C_42R.field_41u);
                                                                  }

                                                                  if (var242) {
                                                                     var84++;
                                                                  }
                                                               }

                                                               var93++;
                                                            }
                                                         } while (var13 == null);
                                                      }

                                                      var231 = var14;
                                                      var274 = var13;
                                                      long var609;
                                                      int var410 = (var609 = var1 - 0L) == 0L ? 0 : (var609 < 0L ? -1 : 1);
                                                      break label2192;
                                                   }

                                                   var77 = 0;
                                                   var84 = 0;
                                                   int var19 = 0;

                                                   while (true) {
                                                      long var395 = -3623557529899877296L;
                                                      net.minecraft.client.Minecraft var31 = field_43;
                                                      if (var19 >= var31.field_42P.field_429.field_46.size()) {
                                                         break label2191;
                                                      }

                                                      var10001 = -3623557529899877296L;
                                                      net.minecraft.client.Minecraft var32 = field_43;
                                                      net.C_47rf var20 = var32.field_42P.field_429.method_46$4c10532da1(var19).method_48$ac4db64966();
                                                      long var610;
                                                      int var290 = (var610 = var1 - 0L) == 0L ? 0 : (var610 < 0L ? -1 : 1);
                                                      long var611;
                                                      int var291 = (var611 = var1 - 0L) == 0L ? 0 : (var611 < 0L ? -1 : 1);
                                                      if (var13 == null) {
                                                         long var612;
                                                         int var292 = (var612 = var1 - 0L) == 0L ? 0 : (var612 < 0L ? -1 : 1);
                                                         label1778:
                                                         if (var20 != null) {
                                                            net.C_43r var21 = var20.method_48$dbd570a038();
                                                            boolean var238 = var21.equals(net.C_42R.field_45);
                                                            long var613;
                                                            int var396 = (var613 = var1 - 0L) == 0L ? 0 : (var613 < 0L ? -1 : 1);
                                                            if (var13 == null) {
                                                               if (var238) {
                                                                  var15 += var20.field_47;
                                                                  break label1778;
                                                               }

                                                               var238 = var21.equals(net.C_43r.method_46$4158f44b4a(40));
                                                            }

                                                            long var614;
                                                            int var397 = (var614 = var1 - 0L) == 0L ? 0 : (var614 < 0L ? -1 : 1);
                                                            if (var13 == null) {
                                                               if (var238) {
                                                                  var77 += var20.field_47;
                                                                  break label1778;
                                                               }

                                                               var238 = var21.equals(net.C_42R.field_41u);
                                                            }

                                                            if (var238) {
                                                               var84++;
                                                            }
                                                         }

                                                         var19++;
                                                      }

                                                      if (var13 != null) {
                                                         break label2191;
                                                      }
                                                   }
                                                }

                                                long var615;
                                                int var411 = (var615 = var1 - 0L) == 0L ? 0 : (var615 < 0L ? -1 : 1);
                                                if (var274 == null) {
                                                   if (var231 != 0) {
                                                      break label1946;
                                                   }

                                                   var231 = var84;
                                                }

                                                label1753:
                                                if (var13 == null) {
                                                   if (var231 <= 0) {
                                                      var231 = var77;
                                                      long var616;
                                                      var411 = (var616 = var1 - 0L) == 0L ? 0 : (var616 < 0L ? -1 : 1);
                                                      if (var13 == null) {
                                                         if (var77 <= 0) {
                                                            break label1946;
                                                         }

                                                         var231 = var67;
                                                      }

                                                      long var617;
                                                      var411 = (var617 = var1 - 0L) == 0L ? 0 : (var617 < 0L ? -1 : 1);
                                                      if (var13 == null) {
                                                         if (var231 <= 0) {
                                                            break label1946;
                                                         }

                                                         var231 = var15;
                                                      }

                                                      if (var13 != null) {
                                                         break label1753;
                                                      }

                                                      if (var231 <= 0) {
                                                         break label1946;
                                                      }
                                                   }

                                                   long var618;
                                                   int var313 = (var618 = var1 - 0L) == 0L ? 0 : (var618 < 0L ? -1 : 1);
                                                   net.C_47cu var243 = this.field_48y;
                                                   long var414 = -3624518613434416817L;
                                                   client.setting.RangeSetting var33 = this.settingAutoOpenDelay;
                                                   var10001 = var33.method_44$8abf5c6871();
                                                   long var471 = -3625396541493498101L;
                                                   long var34 = var6;
                                                   long var36 = var10001;
                                                   net.C_47cu var38 = var243;
                                                   var231 = ((var38.method_42$b0e346e6e3(var36, var34)) ? 1 : 0);
                                                }

                                                if (var231 == 0) {
                                                   break label1948;
                                                }

                                                char var415 = (char)var5;
                                                long var472 = -3627280432820602949L;
                                                net.C_47AC.method_43$f84fd1f462(var3, var4, var415);
                                                net.minecraft.client.Minecraft var244 = field_43;
                                                long var481 = -3623557529899877296L;
                                                net.minecraft.client.Minecraft var39 = field_43;
                                                net.C_47pL var315 = new net.C_47pL(var39.field_42P);
                                                long var416 = -3624695007628123656L;
                                                net.C_47pL var40 = var315;
                                                net.minecraft.client.Minecraft var41 = var244;
                                                var41.method_43$7480b345ab(var40);
                                                var10001 = -3625791644553168093L;
                                                net.C_47cu var42 = this.field_48y;
                                                var42.method_46$da8c82d5d4();
                                                var10001 = -3623339026511492516L;
                                                client.setting.RangeSetting var43 = this.settingAutoOpenDelay;
                                                var43.method_43$fedcb3e4d3();
                                                long var619;
                                                int var318 = (var619 = var1 - 0L) == 0L ? 0 : (var619 < 0L ? -1 : 1);
                                                if (var13 == null) {
                                                   break label1948;
                                                }
                                                break label1946;
                                             }

                                             var231 = var14;
                                             var274 = var13;
                                             long var620;
                                             int var423 = (var620 = var1 - 0L) == 0L ? 0 : (var620 < 0L ? -1 : 1);
                                             break label1947;
                                          }

                                          var10001 = -3625791644553168093L;
                                          net.C_47cu var44 = this.field_48y;
                                          var44.method_46$da8c82d5d4();
                                          break label1948;
                                       }

                                       long var621;
                                       int var424 = (var621 = var1 - 0L) == 0L ? 0 : (var621 < 0L ? -1 : 1);
                                       break label2290;
                                    }

                                    if (var13 != null) {
                                       var10001 = -3625791644553168093L;
                                       net.C_47cu var179 = this.field_48y;
                                       var179.method_46$da8c82d5d4();
                                    }

                                    long var492 = -3624559932156021829L;
                                    int var182 = var10;
                                    int var185 = var9;
                                    int var188 = var8;
                                    AutoSoup_47Ci var191 = this;
                                    this.field_42 = var191.method_45$cabccf1c64(var188, var185, var182);
                                    int var245 = this.field_42;
                                    long var622;
                                    int var417 = (var622 = var1 - 0L) == 0L ? 0 : (var622 < 0L ? -1 : 1);
                                    if (var13 == null) {
                                       if (this.field_42 > -1) {
                                          this.field_43a = true;
                                          var232 = this;
                                          long var623;
                                          int var321 = (var623 = var1 - 0L) == 0L ? 0 : (var623 < 0L ? -1 : 1);
                                          break label2188;
                                       }

                                       var245 = ((int) (this.field_43a ? 1 : 0));
                                    }

                                    long var624;
                                    var417 = (var624 = var1 - 0L) == 0L ? 0 : (var624 < 0L ? -1 : 1);
                                    if (var13 == null) {
                                       if (var245 != 0) {
                                          this.field_43a = false;
                                          int var473 = this.field_437;
                                          var492 = -3626486982878548206L;
                                          client.setting.BooleanSetting var200 = this.settingSilent;
                                          boolean var482 = var200.method_49$aae029aa0a();
                                          var492 = -3623986212517300498L;
                                          boolean var205 = var482;
                                          int var210 = var473;
                                          byte var215 = 5;
                                          long var220 = var11;
                                          AutoSoup_47Ci var225 = this;
                                          net.C_47i.method_46$1d13c11fdd(var225, var220, var215, var210, var205);
                                       }

                                       var245 = net.C_47i.field_40;
                                    }

                                    if (var13 == null) {
                                       if (var245 < 0) {
                                          return;
                                       }

                                       var245 = net.C_47i.field_40;
                                    }

                                    if (var245 < 9) {
                                       this.field_437 = net.C_47i.field_40;
                                    }

                                    return;
                                 }

                                 if (var274 != null) {
                                    break label2287;
                                 }

                                 if (var231 > -1) {
                                    this.field_43a = true;
                                    var232 = this;
                                    long var625;
                                    int var331 = (var625 = var1 - 0L) == 0L ? 0 : (var625 < 0L ? -1 : 1);
                                 } else {
                                    var232 = this;
                                 }
                                 break label2289;
                              }

                              var231 = var14;
                              var274 = var13;
                              long var626;
                              int var426 = (var626 = var1 - 0L) == 0L ? 0 : (var626 < 0L ? -1 : 1);
                              long var627;
                              var426 = (var627 = var1 - 0L) == 0L ? 0 : (var627 < 0L ? -1 : 1);
                              break label1956;
                           }
                        }

                        var10001 = -3625791644553168093L;
                        net.C_47cu var45 = this.field_48y;
                        var45.method_46$da8c82d5d4();
                        long var10005 = -3624559932156021829L;
                        int var46 = var10;
                        int var47 = var9;
                        int var48 = var8;
                        AutoSoup_47Ci var49 = this;
                        this.field_42 = var49.method_45$cabccf1c64(var48, var47, var46);
                        var231 = this.field_42;
                        var274 = var13;
                        if (var1 < 0L) {
                           break label1956;
                        }

                        if (var13 != null) {
                           break label2288;
                        }

                        if (this.field_42 <= -1) {
                           var231 = ((this.field_43a) ? 1 : 0);
                           break label2288;
                        }

                        this.field_43a = true;
                        var232 = this;
                        if (var1 <= 0L) {
                           break label2289;
                        }
                     }

                     int var474 = this.field_42;
                     long var495 = -3626486982878548206L;
                     client.setting.BooleanSetting var50 = this.settingSilent;
                     boolean var483 = var50.method_49$aae029aa0a();
                     var495 = -3623986212517300498L;
                     boolean var51 = var483;
                     int var52 = var474;
                     byte var53 = 5;
                     long var54 = var11;
                     AutoSoup_47Ci var56 = var232;
                     net.C_47i.method_46$1d13c11fdd(var56, var54, var53, var52, var51);
                     return;
                  }

                  var231 = ((var232.field_43a) ? 1 : 0);
                  break label2287;
               }

               long var628;
               int var430 = (var628 = var1 - 0L) == 0L ? 0 : (var628 < 0L ? -1 : 1);
               if (var274 == null) {
                  if (var231 < 0) {
                     return;
                  }

                  var231 = net.C_47i.field_40;
               }

               if (var231 < 9) {
                  this.field_437 = net.C_47i.field_40;
               }

               return;
            }

            long var629;
            int var10002 = (var629 = var1 - 0L) == 0L ? 0 : (var629 < 0L ? -1 : 1);
            if (var13 == null) {
               if (var231 != 0) {
                  this.field_43a = false;
                  int var10003 = this.field_437;
                  long var490 = -3626486982878548206L;
                  client.setting.BooleanSetting var57 = this.settingSilent;
                  boolean var10004 = var57.method_49$aae029aa0a();
                  var490 = -3623986212517300498L;
                  boolean var58 = var10004;
                  int var59 = var10003;
                  byte var60 = 5;
                  long var61 = var11;
                  AutoSoup_47Ci var63 = this;
                  net.C_47i.method_46$1d13c11fdd(var63, var61, var60, var59, var58);
               }

               var231 = net.C_47i.field_40;
            }

            if (var13 == null) {
               if (var231 < 0) {
                  return;
               }

               var231 = net.C_47i.field_40;
            }

            if (var231 < 9) {
               this.field_437 = net.C_47i.field_40;
            }

            return;
         }

         long var630;
         int var429 = (var630 = var1 - 0L) == 0L ? 0 : (var630 < 0L ? -1 : 1);
         if (var13 == null) {
            if (var231 != 0) {
               this.field_43a = false;
               int var475 = this.field_437;
               long var497 = -3626486982878548206L;
               client.setting.BooleanSetting var201 = this.settingSilent;
               boolean var484 = var201.method_49$aae029aa0a();
               var497 = -3623986212517300498L;
               boolean var206 = var484;
               int var211 = var475;
               byte var216 = 5;
               long var221 = var11;
               AutoSoup_47Ci var226 = this;
               net.C_47i.method_46$1d13c11fdd(var226, var221, var216, var211, var206);
            }

            var231 = net.C_47i.field_40;
         }

         if (var13 == null) {
            if (var231 < 0) {
               return;
            }

            var231 = net.C_47i.field_40;
         }

         if (var231 < 9) {
            this.field_437 = net.C_47i.field_40;
         }
      }
   }








   private boolean method_479$30a17b9327(int var1, short var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      int[] var6 = recovery$indy$81(-268547952784601509L, var4);
      int var7 = recovery$indy$82(field_43, -262707601924944452L, var4).field_48y - this.field_43p;
      int var10000 = var7;
      if (var6 == null) {
         if (var7 < this.field_43U) {
            return false;
         }

         var10000 = (int) ((this.field_48z) ? 1 : 0);
      }

      return (boolean)(var6 != null ? var10000 : var10000 != 0);
   }



   private boolean method_47M$0dd78e0064(long var1) {
      net.C_47rf var82;
      int[] var98;
      int var83;
      int var85;
      int[] var100;
      var1 = a ^ var1;
      long var10001 = var1 ^ 101369035771931L;
      int var3 = (int)((var1 ^ 101369035771931L) >>> 48);
      int var4 = (int)((var1 ^ 101369035771931L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 42389265331007L;
      int var6 = (int)((var1 ^ 42389265331007L) >>> 48);
      int var7 = (int)((var1 ^ 42389265331007L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var1 ^ 17170204110458L;
      long var11 = var1 ^ 8522524110996L;
      long var10000 = 2992262161644149656L;
      int[] var13 = AntiBot_47CG.method_40$d4d28024c9();
      var10001 = 2991322107865189181L;
      BooleanSetting var18 = this.settingFill;
      byte var80 = (byte) ((var18.method_49$aae029aa0a()) ? 1 : 0);
      if (var13 == null) {
         if (var80 == 0) {
            return true;
         }

         C_47cu var81 = this.field_48T;
         long var10002 = 2998396040846157152L;
         RangeSetting var19 = this.settingFillDelay;
         var10001 = var19.method_44$8abf5c6871();
         long var10003 = 2999238867212061476L;
         long var20 = var9;
         long var22 = var10001;
         C_47cu var24 = var81;
         var80 = (byte) ((var24.method_42$b0e346e6e3(var22, var20)) ? 1 : 0);
      }

      if (var13 == null) {
         if (var80 == 0) {
            return false;
         }

         var80 = 0;
      }

      int var14 = var80;
      int var15 = 9;

      label703: {
         label695: {
            label694: {
               C_47rf var16;
               while (true) {
                  label691:
                  if (var15 < 36) {
                     var10001 = 2997681330625566847L;
                     Minecraft var25 = field_43;
                     var16 = var25.field_42P.field_429.method_46$4c10532da1(var15).method_48$ac4db64966();
                     var82 = var16;
                     var98 = var13;
                     if (var1 <= 0L) {
                        break;
                     }

                     if (var13 != null) {
                        var98 = var13;
                        break;
                     }

                     label672: {
                        if (var13 == null) {
                           if (var16 == null) {
                              var83 = 1;
                              if (var1 < 0L) {
                                 if (var13 != null) {
                                    break label703;
                                 }

                                 if (false) {
                                    var83 = 0;
                                    break label695;
                                 }

                                 var15 = 36;
                                 break label691;
                              }

                              var14 = 1;
                              if (var13 == null) {
                                 break label672;
                              }

                              var82 = var16;
                           } else {
                              var82 = var16;
                           }
                        }

                        C_43r var17 = var82.method_48$dbd570a038();
                        if (var1 >= 0L) {
                           if (var13 == null) {
                              byte var84 = (byte) ((var17.equals(C_42R.field_45)) ? 1 : 0);
                              if (var1 > 0L) {
                                 if (var84 != 0) {
                                    if (var13 == null) {
                                       if (var16.field_47 < var16.method_44$8abf5c6871()) {
                                          var14 = 1;
                                          if (var13 != null) {
                                             var15++;
                                             if (var13 == null) {
                                                continue;
                                             }
                                          }
                                       } else {
                                          var15++;
                                          if (var13 == null) {
                                             continue;
                                          }
                                       }
                                    } else {
                                       var14 = var16.field_47;
                                       if (var13 != null) {
                                          var15++;
                                          if (var13 == null) {
                                             continue;
                                          }
                                       }
                                    }
                                 } else {
                                    var15++;
                                    if (var13 == null) {
                                       continue;
                                    }
                                 }
                              } else if (var13 == null) {
                                 if (var84 < var16.method_44$8abf5c6871()) {
                                    var14 = 1;
                                    if (var13 != null) {
                                       var15++;
                                       if (var13 == null) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var15++;
                                    if (var13 == null) {
                                       continue;
                                    }
                                 }
                              } else {
                                 var14 = var84;
                                 if (var13 != null) {
                                    var15++;
                                    if (var13 == null) {
                                       continue;
                                    }
                                 }
                              }
                           } else if (var13 == null) {
                              continue;
                           }
                        } else if (var13 == null) {
                           continue;
                        }
                     }

                     var83 = var14;
                     if (var1 < 0L) {
                        break label695;
                     }

                     if (var13 != null) {
                        break label703;
                     }

                     if (var14 == 0) {
                        var83 = 0;
                        break label695;
                     }

                     var15 = 36;
                  } else {
                     var83 = var14;
                     if (var1 < 0L) {
                        break label695;
                     }

                     if (var13 != null) {
                        break label703;
                     }

                     if (var14 == 0) {
                        var83 = 0;
                        break label695;
                     }

                     var15 = 36;
                  }

                  long var107 = 2997681330625566847L;
                  Minecraft var26 = field_43;
                  if (var15 >= var26.field_42P.field_429.field_46.size()) {
                     break label694;
                  }

                  var10001 = 2997681330625566847L;
                  Minecraft var27 = field_43;
                  var16 = var27.field_42P.field_429.method_46$4c10532da1(var15).method_48$ac4db64966();
                  if (var13 != null) {
                     var83 = 36;
                     break label703;
                  }

                  var82 = var16;
                  var98 = var13;
                  break;
               }

               while (true) {
                  label744: {
                     label718: {
                        if (var98 == null) {
                           if (var82 == null) {
                              break label718;
                           }

                           var82 = var16;
                        }

                        var85 = (int) ((var82.method_48$dbd570a038().equals(C_42R.field_45)) ? 1 : 0);
                        var100 = var13;
                        if (var1 <= 0L) {
                           break label744;
                        }

                        if (var13 == null) {
                           if (!(var85 != 0)) {
                              break label718;
                           }

                           short var108 = (short)var3;
                           short var10004 = (short)var5;
                           long var10005 = 2998867188760511699L;
                           short var28 = var10004;
                           int var29 = var4;
                           short var30 = var108;
                           int var31 = var15;
                           AutoSoup_47Ci var32 = this;
                           var32.method_40$9cf59f9d4e(var31, var30, var29, var28);
                           char var101 = (char)var6;
                           long var120 = 2991048667795330373L;
                           int var33 = var8;
                           int var34 = var7;
                           char var35 = var101;
                           RangeSetting var36 = this.settingFillDelay;
                           double var127;
                           var85 = (var127 = var36.method_47$3192260b25(var35, var34, var33) - 0.0) == 0.0 ? 0 : (var127 < 0.0 ? -1 : 1);
                        }

                        var100 = var13;
                        break label744;
                     }

                     var15++;
                     if (var13 != null) {
                        break;
                     }

                     long var110 = 2997681330625566847L;
                     Minecraft var59 = field_43;
                     if (var15 >= var59.field_42P.field_429.field_46.size()) {
                        break;
                     }

                     var10001 = 2997681330625566847L;
                     Minecraft var60 = field_43;
                     var16 = var60.field_42P.field_429.method_46$4c10532da1(var15).method_48$ac4db64966();
                     if (var13 != null) {
                        var83 = 36;
                        break label703;
                     }

                     var82 = var16;
                     var98 = var13;
                     continue;
                  }

                  if (var100 != null) {
                     return var85 != 0;
                  }

                  if ((var85) != 0) {
                     return false;
                  }

                  long var109 = 2997608639457087844L;
                  long var37 = var11;
                  RangeSetting var39 = this.settingFillDelay;
                  double var128;
                  int var137 = (var128 = var39.method_42$474dfaa627(var37) - 0.0) == 0.0 ? 0 : (var128 < 0.0 ? -1 : 1);
                  if (var13 != null) {
                     return var137 != 0;
                  }

                  if ((var137) != 0) {
                     return false;
                  }
                  break;
               }
            }

            var83 = 0;
         }

         if (var1 > 0L) {
            var15 = var83;
            var83 = 36;
         }
      }

      int var56 = var83;

      while (true) {
         long var111 = 2997681330625566847L;
         Minecraft var40 = field_43;
         if (var56 < var40.field_42P.field_429.field_46.size()) {
            var10001 = 2997681330625566847L;
            Minecraft var41 = field_43;
            C_47rf var57 = var41.field_42P.field_429.method_46$4c10532da1(var56).method_48$ac4db64966();
            if (var1 >= 0L) {
               if (var13 == null) {
                  if (var13 == null) {
                     if (var57 == null) {
                        var15++;
                     }

                     var56++;
                     if (var13 == null) {
                        continue;
                     }

                     int var86 = 0;
                     if (var1 >= 0L) {
                        var56 = 0;
                        var86 = var56;
                     }

                     if (var86 >= 36) {
                        break;
                     }

                     if (var1 >= 0L) {
                        if (var13 != null || var13 != null) {
                           return var15 != 0;
                        }

                        if (var15 <= 0) {
                           break;
                        }
                     } else {
                        if (var13 != null) {
                           return var15 != 0;
                        }

                        if (var15 <= 0) {
                           break;
                        }
                     }
                  } else {
                     int[] var89;
                     if (var57 != null) {
                        boolean var88 = var57.method_48$dbd570a038().equals(C_42R.field_41u);
                        if (var1 >= 0L) {
                           if (var13 == null) {
                              if (var88) {
                                 short var112 = (short)var3;
                                 short var121 = (short)var5;
                                 long var125 = 2998867188760511699L;
                                 short var43 = var121;
                                 int var44 = var4;
                                 short var45 = var112;
                                 int var46 = var56;
                                 AutoSoup_47Ci var47 = this;
                                 var47.method_40$9cf59f9d4e(var46, var45, var44, var43);
                                 var15--;
                                 char var104 = (char)var6;
                                 long var122 = 2991048667795330373L;
                                 int var48 = var8;
                                 int var49 = var7;
                                 char var50 = var104;
                                 RangeSetting var51 = this.settingFillDelay;
                                 double var129;
                                 int var138 = (var129 = var51.method_47$3192260b25(var50, var49, var48) - 0.0) == 0.0 ? 0 : (var129 < 0.0 ? -1 : 1);
                                 if (var13 != null) {
                                    return var138 != 0;
                                 }

                                 if ((var138) != 0) {
                                    return false;
                                 }

                                 var111 = 2997608639457087844L;
                                 long var52 = var11;
                                 RangeSetting var54 = this.settingFillDelay;
                                 double var130;
                                 int var139 = (var130 = var54.method_42$474dfaa627(var52) - 0.0) == 0.0 ? 0 : (var130 < 0.0 ? -1 : 1);
                                 if (var13 != null) {
                                    return var139 != 0;
                                 }

                                 if ((var139) != 0) {
                                    return false;
                                 }

                                 var56++;
                                 var89 = var13;
                              } else {
                                 var56++;
                                 var89 = var13;
                              }
                           } else {
                              if (var13 != null) {
                                 return var88;
                              }

                              if (var88) {
                                 return false;
                              }

                              var111 = 2997608639457087844L;
                              long var70 = var11;
                              RangeSetting var75 = this.settingFillDelay;
                              double var131;
                              int var140 = (var131 = var75.method_42$474dfaa627(var70) - 0.0) == 0.0 ? 0 : (var131 < 0.0 ? -1 : 1);
                              if (var13 != null) {
                                 return var140 != 0;
                              }

                              if ((var140) != 0) {
                                 return false;
                              }

                              var56++;
                              var89 = var13;
                           }
                        } else {
                           if (var13 != null) {
                              return var88;
                           }

                           if (var88) {
                              return false;
                           }

                           var111 = 2997608639457087844L;
                           long var71 = var11;
                           RangeSetting var76 = this.settingFillDelay;
                           double var132;
                           int var141 = (var132 = var76.method_42$474dfaa627(var71) - 0.0) == 0.0 ? 0 : (var132 < 0.0 ? -1 : 1);
                           if (var13 != null) {
                              return var141 != 0;
                           }

                           if ((var141) != 0) {
                              return false;
                           }

                           var56++;
                           var89 = var13;
                        }
                     } else {
                        var56++;
                        var89 = var13;
                     }

                     if (var89 != null || var56 >= 36) {
                        break;
                     }

                     if (var1 >= 0L) {
                        if (var13 != null || var13 != null) {
                           return var15 != 0;
                        }

                        if (var15 <= 0) {
                           break;
                        }
                     } else {
                        if (var13 != null) {
                           return var15 != 0;
                        }

                        if (var15 <= 0) {
                           break;
                        }
                     }
                  }
               } else {
                  if (var13 == null) {
                     continue;
                  }

                  int var90 = 0;
                  if (var1 >= 0L) {
                     var56 = 0;
                     var90 = var56;
                  }

                  if (var90 >= 36) {
                     break;
                  }

                  if (var1 >= 0L) {
                     if (var13 != null || var13 != null) {
                        return var15 != 0;
                     }

                     if (var15 <= 0) {
                        break;
                     }
                  } else {
                     if (var13 != null) {
                        return var15 != 0;
                     }

                     if (var15 <= 0) {
                        break;
                     }
                  }
               }
            } else {
               if (var13 == null) {
                  continue;
               }

               int var91 = 0;
               if (var1 >= 0L) {
                  var56 = 0;
                  var91 = var56;
               }

               if (var91 >= 36) {
                  break;
               }

               if (var1 >= 0L) {
                  if (var13 != null || var13 != null) {
                     return var15 != 0;
                  }

                  if (var15 <= 0) {
                     break;
                  }
               } else {
                  if (var13 != null) {
                     return var15 != 0;
                  }

                  if (var15 <= 0) {
                     break;
                  }
               }
            }
         } else {
            int var92 = 0;
            if (var1 >= 0L) {
               var56 = 0;
               var92 = var56;
            }

            if (var92 >= 36) {
               break;
            }

            if (var1 >= 0L) {
               if (var13 != null || var13 != null) {
                  return var15 != 0;
               }

               if (var15 <= 0) {
                  break;
               }
            } else {
               if (var13 != null) {
                  return var15 != 0;
               }

               if (var15 <= 0) {
                  break;
               }
            }
         }

         while (true) {
            var10001 = 2997681330625566847L;
            Minecraft var42 = field_43;
            C_47rf var58 = var42.field_42P.field_429.method_46$4c10532da1(var56).method_48$ac4db64966();
            if (var1 > 0L) {
               if (var13 == null) {
                  int[] var93;
                  if (var58 != null) {
                     boolean var142 = var58.method_48$dbd570a038().equals(C_42R.field_41u);
                     if (var1 >= 0L) {
                        if (var13 == null) {
                           if (var142) {
                              short var116 = (short)var3;
                              short var123 = (short)var5;
                              long var126 = 2998867188760511699L;
                              short var61 = var123;
                              int var62 = var4;
                              short var63 = var116;
                              int var64 = var56;
                              AutoSoup_47Ci var65 = this;
                              var65.method_40$9cf59f9d4e(var64, var63, var62, var61);
                              var15--;
                              char var106 = (char)var6;
                              long var124 = 2991048667795330373L;
                              int var66 = var8;
                              int var67 = var7;
                              char var68 = var106;
                              RangeSetting var69 = this.settingFillDelay;
                              double var133;
                              int var143 = (var133 = var69.method_47$3192260b25(var68, var67, var66) - 0.0) == 0.0 ? 0 : (var133 < 0.0 ? -1 : 1);
                              if (var13 != null) {
                                 return var143 != 0;
                              }

                              if ((var143) != 0) {
                                 return false;
                              }

                              var111 = 2997608639457087844L;
                              long var72 = var11;
                              RangeSetting var77 = this.settingFillDelay;
                              double var134;
                              int var144 = (var134 = var77.method_42$474dfaa627(var72) - 0.0) == 0.0 ? 0 : (var134 < 0.0 ? -1 : 1);
                              if (var13 != null) {
                                 return var144 != 0;
                              }

                              if ((var144) != 0) {
                                 return false;
                              }

                              var56++;
                              var93 = var13;
                           } else {
                              var56++;
                              var93 = var13;
                           }
                        } else {
                           if (var13 != null) {
                              return var142;
                           }

                           if (var142) {
                              return false;
                           }

                           var111 = 2997608639457087844L;
                           long var73 = var11;
                           RangeSetting var78 = this.settingFillDelay;
                           double var135;
                           int var145 = (var135 = var78.method_42$474dfaa627(var73) - 0.0) == 0.0 ? 0 : (var135 < 0.0 ? -1 : 1);
                           if (var13 != null) {
                              return var145 != 0;
                           }

                           if ((var145) != 0) {
                              return false;
                           }

                           var56++;
                           var93 = var13;
                        }
                     } else {
                        if (var13 != null) {
                           return var142;
                        }

                        if (var142) {
                           return false;
                        }

                        var111 = 2997608639457087844L;
                        long var74 = var11;
                        RangeSetting var79 = this.settingFillDelay;
                        double var136;
                        int var146 = (var136 = var79.method_42$474dfaa627(var74) - 0.0) == 0.0 ? 0 : (var136 < 0.0 ? -1 : 1);
                        if (var13 != null) {
                           return var146 != 0;
                        }

                        if ((var146) != 0) {
                           return false;
                        }

                        var56++;
                        var93 = var13;
                     }
                  } else {
                     var56++;
                     var93 = var13;
                  }

                  if (var93 != null || var56 >= 36) {
                     return true;
                  }

                  if (var1 >= 0L) {
                     if (var13 != null || var13 != null) {
                        return var15 != 0;
                     }

                     if (var15 <= 0) {
                        return true;
                     }
                  } else {
                     if (var13 != null) {
                        return var15 != 0;
                     }

                     if (var15 <= 0) {
                        return true;
                     }
                  }
               } else {
                  if (var13 != null || var56 >= 36) {
                     return true;
                  }

                  if (var1 >= 0L) {
                     if (var13 != null || var13 != null) {
                        return var15 != 0;
                     }

                     if (var15 <= 0) {
                        return true;
                     }
                  } else {
                     if (var13 != null) {
                        return var15 != 0;
                     }

                     if (var15 <= 0) {
                        return true;
                     }
                  }
               }
            } else {
               if (var13 != null || var56 >= 36) {
                  return true;
               }

               if (var1 >= 0L) {
                  if (var13 != null || var13 != null) {
                     return var15 != 0;
                  }

                  if (var15 <= 0) {
                     return true;
                  }
               } else {
                  if (var13 != null) {
                     return var15 != 0;
                  }

                  if (var15 <= 0) {
                     return true;
                  }
               }
            }
         }
      }

      return true;
   }







   private boolean method_47B$aae029aa0a() {
      long var1 = a ^ 138846148264380L;
      long var10000 = -7050187182273336266L;
      int[] var3 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = -7048875507002999661L;
      BooleanSetting var4 = this.settingCraft;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -7048875507002999661L;
         BooleanSetting var5 = this.settingCraftInstant;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : !var6;
   }



   public void method_47m$e45a9973e5(long var1) {
      net.minecraft.client.Minecraft var21;
      long var3 = var1 ^ 39093908122942L;
      long var10000 = -6092633118998275732L;
      int[] var5 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = -6092078078694238667L;
      Minecraft var7 = field_43;
      int var19 = (int) ((var7.field_44K.method_40$aae029aa0a()) ? 1 : 0);
      if (var5 == null) {
         if (var19 != 0) {
            return;
         }

         var10001 = -6091872020393930502L;
         Minecraft var8 = field_43;
         var19 = (int) ((var8.method_44$aae029aa0a()) ? 1 : 0);
      }

      int[] var23 = var5;
      if (var1 >= 0L) {
         if (var5 == null) {
            if (var19 == 0) {
               return;
            }

            var19 = this.field_42;
         }

         var23 = var5;
      }

      if (var1 > 0L) {
         if (var23 == null) {
            if (var19 <= -1) {
               return;
            }

            var19 = (int) ((this.field_43v) ? 1 : 0);
         }

         var23 = var5;
      }

      if (var1 >= 0L) {
         if (var23 == null) {
            if (var19 != 0) {
               return;
            }

            long var10002 = -6093632019708855635L;
            long var9 = var3;
            AutoSoup_47Ci var11 = this;
            var19 = (int) ((var11.method_477$0dd78e0064(var9)) ? 1 : 0);
         }

         var23 = var5;
      }

      if (var23 == null) {
         var19 = var19 != 0 ? this.field_436 : 0;
      }

      int var6 = var19;
      int var20 = var6;
      int[] var24 = var5;
      if (var1 >= 0L) {
         if (var5 == null) {
            if (var6 <= 0) {
               return;
            }

            var20 = this.field_43n;
         }

         var24 = var5;
      }

      if (var1 >= 0L) {
         if (var24 == null) {
            if (var20 <= this.field_43f + var6) {
               return;
            }

            long var27 = -6093632019708855635L;
            long var12 = var3;
            AutoSoup_47Ci var14 = this;
            var20 = (int) ((var14.method_477$0dd78e0064(var12)) ? 1 : 0);
         }

         var24 = var5;
      }

      if (var1 >= 0L) {
         if (var24 == null) {
            if (var20 == 0) {
               return;
            }

            var20 = (int) ((this.field_48L) ? 1 : 0);
         }

         var24 = var5;
      }

      if (var1 > 0L) {
         if (var24 == null) {
            if (var20 == 0) {
               return;
            }

            var20 = (int) ((this.field_48X) ? 1 : 0);
         }

         var24 = var5;
      }

      if (var24 == null) {
         if (var20 != 0) {
            return;
         }

         var10001 = -6091268598533961271L;
         BooleanSetting var15 = this.settingInventoryDrop;
         var20 = (int) ((var15.method_49$aae029aa0a()) ? 1 : 0);
      }

      label104: {
         long var28;
         label103: {
            if (var20 != 0) {
               var21 = field_43;
               var10001 = -6092078078694238667L;
               var28 = var1;
               if (var1 < 0L) {
                  break label103;
               }

               Minecraft var16 = field_43;
               var28 = -6093968799974401397L;
               Minecraft var17 = field_43;
               int var30 = this.field_42 + 36;
               long var10006 = -6093968799974401397L;
               Minecraft var18 = field_43;
               var16.field_44K.method_42$f0ddb617a2(var17.field_42P.field_429.field_43, var30, 1, 4, var18.field_42P);
               if (var5 == null) {
                  break label104;
               }
            }

            var21 = field_43;
            var10001 = -6093968799974401397L;
            var28 = var1;
         }

         recovery$indy$83(var21, var10001, var28).method_40$28bbed2f9a(true);
      }

      this.field_48X = true;
   }





    private boolean method_474$9e601c9239(int a0,int a1,short a2) {

        int regionValue11170;
        region1042: {
        region1041: {
        int regionValue11168;

        region1040: {
        region1039: {
        int regionValue11169;

        region1038: {
        java.lang.Object value51;
        int regionValue711;

        region1037: {
        int regionValue738;

        region1036: {
        int regionValue11167;

        region1033: {
        int regionValue664;

        region1031: {
        int regionValue4641;

        region852: {
        region851: {
        region751: {
        region647: {
        region556: {
        java.lang.Object value601;
        java.lang.Object value186;
        long computed37;
        int converted35;
        int converted31;
        int converted27;
        long computed23;
        int regionValue631;
        int regionValue599;
        int regionValue630;
        java.lang.Object regionValue629;
        int regionValue626;
        int converted49;
        int converted45;
        int converted41;
        long computed21;

        region266: {
        boolean[] values606;
        int arrayValue380;
        int value609;
        int value608;
        java.lang.Object value604;
        java.lang.Object value603;
        java.lang.Object value602;

        region229: {
        region228: {
        int regionValue512;

        region227: {
        region224: {
        region222: {
        int regionValue530;

        region220: {
        int regionValue399;

        region219: {
        int regionValue438;

        region218: {
        int regionValue493;

        region217: {
        region214: {
        int regionValue476;
        int regionValue474;

        region213: {
        int regionValue457;
        int regionValue455;

        region211: {
        int regionValue419;
        int regionValue417;

        region210: {
        int value379;
        int regionValue323;

        region201: {
        int value378;
        int value377;
        int arrayValue376;
        int arrayValue375;
        int arrayValue374;

        region190: {
        int regionValue189;

        region189: {
        region188: {
        region186: {
        int arrayValue306;

        region185: {
        region183: {
        region178: {
        region176: {
        int arrayValue239;

        region175: {
        region173: {
        region168: {
        region166: {
        int arrayValue188;

        region165: {
        java.lang.Object value185;
        java.lang.Object value184;
        int value181;
        int value180;
        java.lang.Object value176;
        java.lang.Object value175;
        java.lang.Object value174;
        java.lang.Object value172;
        char converted178;
        short converted177;

        region124: {
        region123: {
        int regionValue58;

        region122: {
        region119: {
        region117: {
        boolean value156;
        java.lang.Object value155;
        java.lang.Object value153;

        region107: {
        region105: {
        region102: {
        region100: {
        int regionValue74;

        region99: {
        long computed19;
        long computed39;
        long computed25;
        boolean value57;
        java.lang.Object value56;
        java.lang.Object value55;
        java.lang.Object value53;
        long value18;
        long converted8;
        long converted14;
        long converted10;
        long computed9;
        long computed48;
        long computed47;
        long computed44;
        long computed43;
        long computed40;
        long computed34;
        long computed33;
        long computed30;
        long computed29;
        long computed26;
        long computed17;
        long computed16;
        long computed15;
        long computed13;
        long computed12;
        long computed11;

        converted8 = (long) (a0);
        computed9 = converted8 << 32;
        converted10 = (long) (a1);
        computed11 = converted10 << 48;
        computed12 = computed11 >>> 32;
        computed13 = computed9 | computed12;
        converted14 = (long) (a2);
        computed15 = converted14 << 48;
        computed16 = computed15 >>> 48;
        computed17 = computed13 | computed16;
        value18 = recovery$indy$flow$729();
        computed19 = computed17 ^ value18;
        computed21 = computed19 ^ 57738116721775L;
        computed23 = computed19 ^ 41005184335336L;
        computed25 = computed19 ^ 98014947170690L;
        computed26 = computed25 >>> 48;
        converted27 = (int) (computed26);
        computed29 = computed25 << 16;
        computed30 = computed29 >>> 32;
        converted31 = (int) (computed30);
        computed33 = computed25 << 48;
        computed34 = computed33 >>> 48;
        converted35 = (int) (computed34);
        computed37 = computed19 ^ 14728661667329L;
        computed39 = computed19 ^ 126322117317131L;
        computed40 = computed39 >>> 32;
        converted41 = (int) (computed40);
        computed43 = computed39 << 32;
        computed44 = computed43 >>> 48;
        converted45 = (int) (computed44);
        computed47 = computed39 << 48;
        computed48 = computed47 >>> 48;
        converted49 = (int) (computed48);
        value51 = recovery$indy$flow$730();
        value53 = recovery$indy$flow$731();
        value55 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value53))))));
        value56 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value55)))).field_44m));
        value57 = recovery$indy$flow$734(value56);
        if (value51 != null) {
            regionValue58 = (int) ((value57 ? 1 : 0));
            break region122;
        } else {
            regionValue74 = (int) ((value57 ? 1 : 0));
            break region99;
        }
        }
        if (regionValue74 == 0) {
            break region119;
        } else {
            break region100;
        }
        }
        break region102;
        }
        if (value51 != null) {
            break region124;
        } else {
            break region105;
        }
        }
        break region107;
        }
        value153 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingCraft));
        value155 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value153))))));
        value156 = recovery$indy$flow$737(value155);
        if ((int) ((value156 ? 1 : 0)) != 0) {
            break region123;
        } else {
            break region117;
        }
        }
        break region119;
        }
        regionValue58 = 1;
        break region122;
        }
        return ((regionValue58 & 1) != 0);
        }
        break region124;
        }
        value172 = recovery$indy$flow$738();
        value174 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value172))))));
        value175 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value174)))).field_42P));
        value176 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value175)))).field_429));
        converted177 = (short) (converted45);
        converted178 = (char) (converted49);
        value180 = (int) (converted178);
        value181 = (int) (converted177);
        value184 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value185 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value176))))));
        value186 = recovery$indy$flow$744(value184, converted41, (short) (value181), (char) (value180), value185);
        arrayValue188 = ((int[]) value186)[1];
        if (value51 != null) {
            regionValue189 = arrayValue188;
            break region189;
        } else {
            break region165;
        }
        }
        if (arrayValue188 == 0) {
            break region188;
        } else {
            break region166;
        }
        }
        break region168;
        }
        arrayValue239 = ((int[]) value186)[2];
        if (value51 != null) {
            regionValue189 = arrayValue239;
            break region189;
        } else {
            break region173;
        }
        }
        break region175;
        }
        if (arrayValue239 == 0) {
            break region188;
        } else {
            break region176;
        }
        }
        break region178;
        }
        arrayValue306 = ((int[]) value186)[3];
        if (value51 != null) {
            regionValue323 = arrayValue306;
            break region201;
        } else {
            break region183;
        }
        }
        break region185;
        }
        if (arrayValue306 != 0) {
            break region190;
        } else {
            break region186;
        }
        }
        break region188;
        }
        regionValue189 = 1;
        break region189;
        }
        return ((regionValue189 & 1) != 0);
        }
        arrayValue374 = ((int[]) value186)[1];
        arrayValue375 = ((int[]) value186)[2];
        arrayValue376 = ((int[]) value186)[3];
        value377 = recovery$indy$flow$745(arrayValue375, arrayValue376);
        value378 = recovery$indy$flow$746(arrayValue374, value377);
        regionValue323 = value378;
        break region201;
        }
        value379 = regionValue323;
        arrayValue380 = ((int[]) value186)[0];
        if (a0 < 0) {
            regionValue399 = value379;
            break region219;
        } else {
            regionValue417 = value379;
            regionValue419 = value379;
            break region210;
        }
        }
        if (value51 != null) {
            regionValue438 = regionValue419;
            break region218;
        } else {
            regionValue455 = regionValue417;
            regionValue457 = regionValue419;
            break region211;
        }
        }
        regionValue474 = regionValue455;
        regionValue476 = regionValue457;
        break region213;
        }
        if (regionValue476 > 0) {
            regionValue493 = regionValue474;
            break region217;
        } else {
            break region214;
        }
        }
        return true;
        }
        regionValue438 = regionValue493;
        break region218;
        }
        regionValue399 = regionValue438;
        break region219;
        }
        if (value51 != null) {
            regionValue512 = regionValue399;
            break region227;
        } else {
            regionValue530 = regionValue399;
            break region220;
        }
        }
        if (regionValue530 <= arrayValue380) {
            break region228;
        } else {
            break region222;
        }
        }
        break region224;
        }
        regionValue512 = 1;
        break region227;
        }
        regionValue599 = regionValue512;
        break region229;
        }
        regionValue599 = 0;
        break region229;
        }
        value601 = recovery$indy$flow$747(3);
        value602 = recovery$indy$flow$748();
        ((java.lang.Object[]) value601)[0] = value602;
        value603 = recovery$indy$flow$749(40);
        ((java.lang.Object[]) value601)[1] = value603;
        value604 = recovery$indy$flow$750(39);
        ((java.lang.Object[]) value601)[2] = value604;
        values606 = new boolean[3];
        values606[0] = false;
        values606[1] = false;
        values606[2] = false;
        value608 = 0;
        value609 = 1;
        regionValue626 = arrayValue380;
        regionValue629 = values606;
        regionValue630 = value608;
        regionValue631 = value609;
        break region266;
        }
        loop266: while (true) {
        int regionValue3455;
        int regionValue3456;
        java.lang.Object regionValue3454;
        int regionValue3451;

        region1030: {
        int regionValue652;
        int regionValue654;
        int regionValue653;
        java.lang.Object regionValue651;
        int regionValue648;

        region267: {
        regionValue648 = regionValue626;
        regionValue651 = regionValue629;
        regionValue652 = regionValue630;
        regionValue653 = regionValue631;
        regionValue654 = regionValue631;
        break region267;
        }
        loop267: while (true) {
        int regionValue709;
        int regionValue708;
        int regionValue707;
        java.lang.Object regionValue706;
        int regionValue703;

        region282: {
        int regionValue686;
        int regionValue685;
        java.lang.Object regionValue684;
        int regionValue681;

        region280: {
        int value661;
        java.lang.Object value660;
        java.lang.Object value659;
        java.lang.Object value658;
        java.lang.Object value657;
        java.lang.Object value656;
        java.lang.Object value655;

        value655 = recovery$indy$flow$751();
        value656 = value655;
        value657 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value656))))));
        value658 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value657)))).field_42P));
        value659 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value658)))).field_429));
        value660 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value659)))).field_46));
        value661 = recovery$indy$flow$756(value660);
        if (regionValue654 >= value661) {
            regionValue664 = regionValue652;
            break region1031;
        } else {
            regionValue681 = regionValue648;
            regionValue684 = regionValue651;
            regionValue685 = regionValue652;
            regionValue686 = regionValue653;
            break region280;
        }
        }
        regionValue703 = regionValue681;
        regionValue706 = regionValue684;
        regionValue707 = regionValue685;
        regionValue708 = regionValue686;
        regionValue709 = regionValue686;
        break region282;
        }
        loop282: while (true) {
        java.lang.Object regionValue930;
        java.lang.Object regionValue929;
        int regionValue928;
        int regionValue927;

        region344: {
        int regionValue4145;
        int regionValue4144;
        java.lang.Object regionValue4143;
        int regionValue4140;

        region1955: {
        int regionValue1435;
        int regionValue1434;
        java.lang.Object regionValue1433;
        int regionValue1430;

        region1953: {
        int regionValue3042;
        int regionValue3041;
        java.lang.Object regionValue3040;
        int regionValue3037;
        int incremented6037;

        region1951: {
        int regionValue6036;
        int regionValue6035;
        java.lang.Object regionValue6034;
        int regionValue6031;

        region1949: {
        int regionValue1056;
        int regionValue1055;
        java.lang.Object regionValue1054;
        int regionValue1051;

        region1165: {
        java.lang.Object regionValue963;
        java.lang.Object regionValue962;
        int regionValue961;
        int regionValue960;
        java.lang.Object regionValue959;
        int regionValue956;

        region1160: {
        int regionValue851;
        java.lang.Object value939;
        int regionValue850;
        java.lang.Object regionValue849;
        int regionValue846;
        java.lang.Object value938;
        java.lang.Object value937;
        java.lang.Object value936;
        java.lang.Object value935;
        java.lang.Object value934;
        java.lang.Object value933;
        java.lang.Object value932;

        region1144: {
        int value931;
        int regionValue783;
        int regionValue782;
        int regionValue781;
        java.lang.Object regionValue780;

        region1142: {
        boolean[] values892;
        java.lang.Object value908;
        java.lang.Object value907;
        java.lang.Object value906;
        int value903;
        int value902;
        java.lang.Object value901;
        java.lang.Object value898;
        java.lang.Object value897;
        java.lang.Object value896;
        java.lang.Object value895;
        java.lang.Object value894;
        boolean[] value893;
        int regionValue891;
        int regionValue890;
        char converted900;
        short converted899;

        region293: {
        int regionValue871;
        int regionValue870;

        region291: {
        int regionValue828;
        int regionValue827;
        int regionValue829;
        java.lang.Object regionValue826;
        int regionValue823;

        region289: {
        int regionValue806;
        int regionValue805;
        int regionValue804;
        java.lang.Object regionValue803;
        int regionValue800;

        region287: {
        int regionValue761;
        int regionValue760;
        int regionValue759;
        java.lang.Object regionValue758;
        int regionValue755;

        region285: {
        int regionValue735;
        int regionValue734;
        int regionValue733;
        java.lang.Object regionValue732;
        int regionValue729;

        region284: {
        if (a0 < 0) {
            regionValue711 = regionValue709;
            break region1037;
        } else {
            regionValue729 = regionValue703;
            regionValue732 = regionValue706;
            regionValue733 = regionValue707;
            regionValue734 = regionValue708;
            regionValue735 = regionValue709;
            break region284;
        }
        }
        if (value51 != null) {
            regionValue738 = regionValue735;
            break region1036;
        } else {
            regionValue755 = regionValue729;
            regionValue758 = regionValue732;
            regionValue759 = regionValue733;
            regionValue760 = regionValue734;
            regionValue761 = regionValue735;
            break region285;
        }
        }
        if (value51 != null) {
            regionValue780 = regionValue758;
            regionValue781 = regionValue759;
            regionValue782 = regionValue760;
            regionValue783 = regionValue761;
            break region1142;
        } else {
            regionValue800 = regionValue755;
            regionValue803 = regionValue758;
            regionValue804 = regionValue759;
            regionValue805 = regionValue760;
            regionValue806 = regionValue761;
            break region287;
        }
        }
        regionValue823 = regionValue800;
        regionValue826 = regionValue803;
        regionValue827 = regionValue804;
        regionValue828 = regionValue805;
        regionValue829 = regionValue806;
        break region289;
        }
        if (regionValue829 != 1) {
            regionValue846 = regionValue823;
            regionValue849 = regionValue826;
            regionValue850 = regionValue827;
            regionValue851 = regionValue828;
            break region1144;
        } else {
            regionValue870 = regionValue827;
            regionValue871 = regionValue828;
            break region291;
        }
        }
        regionValue890 = regionValue870;
        regionValue891 = regionValue871;
        break region293;
        }
        values892 = new boolean[3];
        values892[0] = false;
        values892[1] = false;
        values892[2] = false;
        value893 = values892;
        value894 = recovery$indy$flow$757();
        value895 = value894;
        value896 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value895))))));
        value897 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value896)))).field_42P));
        value898 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value897)))).field_429));
        converted899 = (short) (converted45);
        converted900 = (char) (converted49);
        value901 = value898;
        value902 = (int) (converted900);
        value903 = (int) (converted899);
        value906 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value907 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value901))))));
        value908 = recovery$indy$flow$763(value906, converted41, (short) (value903), (char) (value902), value907);
        regionValue927 = regionValue890;
        regionValue928 = regionValue891;
        regionValue929 = value893;
        regionValue930 = value908;
        break region344;
        }
        value931 = regionValue783;
        regionValue846 = value931;
        regionValue849 = regionValue780;
        regionValue850 = regionValue781;
        regionValue851 = regionValue782;
        break region1144;
        }
        value932 = recovery$indy$flow$764();
        value933 = value932;
        value934 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value933))))));
        value935 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value934)))).field_42P));
        value936 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value935)))).field_429));
        value937 = recovery$indy$flow$768(value936, regionValue851);
        value938 = recovery$indy$flow$769(value937);
        value939 = value938;
        regionValue956 = regionValue846;
        regionValue959 = regionValue849;
        regionValue960 = regionValue850;
        regionValue961 = regionValue851;
        regionValue962 = value939;
        regionValue963 = value939;
        break region1160;
        }
        loop1160: while (true) {
        int regionValue4360;
        int regionValue4358;
        int regionValue4357;
        java.lang.Object regionValue4356;
        int regionValue4353;
        java.lang.Object regionValue4359;

        region1698: {
        int regionValue4265;
        java.lang.Object regionValue4264;
        int regionValue4263;
        int regionValue4262;
        java.lang.Object regionValue4261;
        int regionValue4258;
        int value4336;

        region1696: {
        java.lang.Object regionValue4335;
        int regionValue4334;
        int regionValue4333;
        java.lang.Object regionValue4332;
        int regionValue4329;

        region1693: {
        java.lang.Object regionValue4312;
        int regionValue4311;
        int regionValue4310;
        java.lang.Object regionValue4309;
        int regionValue4306;

        region1691: {
        int regionValue4287;
        int regionValue4286;
        java.lang.Object regionValue4285;
        int regionValue4282;
        int regionValue4289;
        java.lang.Object regionValue4288;

        region1688: {
        int regionValue1587;
        java.lang.Object regionValue1586;
        int regionValue1585;
        int regionValue1584;
        java.lang.Object regionValue1583;
        int regionValue1580;

        region1686: {
        int regionValue1483;
        java.lang.Object regionValue1482;
        int regionValue1481;
        int regionValue1480;
        java.lang.Object regionValue1479;
        int regionValue1476;

        region1684: {
        int regionValue1530;
        java.lang.Object regionValue1531;
        int regionValue1529;
        java.lang.Object regionValue1528;
        int regionValue1525;

        region1682: {
        java.lang.Object regionValue4241;
        int regionValue4240;
        int regionValue4239;
        java.lang.Object regionValue4238;
        int regionValue4235;

        region1680: {
        int regionValue4216;
        int regionValue4215;
        java.lang.Object regionValue4214;
        int regionValue4211;
        java.lang.Object regionValue4217;

        region1678: {
        java.lang.Object regionValue4193;
        int regionValue4192;
        int regionValue4191;
        java.lang.Object regionValue4190;
        int regionValue4187;

        region1676: {
        int regionValue4168;
        int regionValue4167;
        java.lang.Object regionValue4166;
        int regionValue4163;
        java.lang.Object regionValue4169;

        region1673: {
        int regionValue3561;
        int regionValue3560;
        java.lang.Object regionValue3559;
        int regionValue3556;
        java.lang.Object regionValue3562;

        region1669: {
        int regionValue3539;
        java.lang.Object regionValue3537;
        int regionValue3536;
        int regionValue3535;
        java.lang.Object regionValue3534;
        int regionValue3531;
        java.lang.Object regionValue3538;

        region1560: {
        java.lang.Object regionValue1744;
        java.lang.Object regionValue1743;
        int regionValue1742;
        int regionValue1741;
        java.lang.Object regionValue1740;
        int regionValue1737;
        int value3514;
        java.lang.Object value3513;
        java.lang.Object value3512;
        java.lang.Object value3511;

        region1553: {
        java.lang.Object regionValue1817;
        int regionValue1816;
        int regionValue1815;
        java.lang.Object regionValue1814;
        int regionValue1811;
        java.lang.Object value3510;
        java.lang.Object value3509;
        java.lang.Object value3508;
        java.lang.Object value3507;
        java.lang.Object value3506;
        java.lang.Object value3505;

        region1540: {
        int regionValue3504;
        java.lang.Object regionValue3503;
        int regionValue3502;
        java.lang.Object regionValue3501;
        int regionValue3498;

        region1538: {
        int regionValue3480;
        int regionValue3478;
        java.lang.Object regionValue3477;
        int regionValue3474;
        java.lang.Object regionValue3479;

        region1536: {
        int regionValue3379;
        java.lang.Object regionValue3378;
        int regionValue3375;
        int value3434;
        int regionValue3381;
        java.lang.Object regionValue3380;

        region1531: {
        int value3433;
        java.lang.Object value3432;
        int value3430;
        int value3429;
        int value3427;
        java.lang.Object regionValue3424;
        java.lang.Object regionValue3423;
        int regionValue3420;
        short converted3426;
        short converted3425;

        region1504: {
        int regionValue3403;
        java.lang.Object regionValue3402;
        java.lang.Object regionValue3401;
        int regionValue3398;

        region1502: {
        int regionValue3235;
        java.lang.Object regionValue3234;
        java.lang.Object regionValue3232;
        int regionValue3229;
        int regionValue3233;

        region1500: {
        int regionValue3284;
        java.lang.Object regionValue3283;
        int regionValue3282;
        java.lang.Object regionValue3281;
        int regionValue3278;

        region1498: {
        boolean value3358;
        java.lang.Object value3357;
        java.lang.Object regionValue3354;
        int regionValue3353;
        java.lang.Object regionValue3352;
        int regionValue3349;

        region1484: {
        int regionValue3329;
        java.lang.Object regionValue3328;
        int regionValue3325;
        int regionValue3332;
        java.lang.Object regionValue3331;
        int regionValue3330;

        region1482: {
        int regionValue3308;
        java.lang.Object regionValue3307;
        int regionValue3306;
        int regionValue3305;
        java.lang.Object regionValue3304;
        int regionValue3301;

        region1480: {
        int regionValue3260;
        java.lang.Object regionValue3259;
        int regionValue3257;
        java.lang.Object regionValue3256;
        int regionValue3253;
        int regionValue3258;

        region1478: {
        int regionValue3090;
        java.lang.Object regionValue3089;
        int regionValue3087;
        java.lang.Object regionValue3086;
        int regionValue3083;
        int regionValue3088;

        region1475: {
        int regionValue3140;
        java.lang.Object regionValue3139;
        int regionValue3138;
        int regionValue3137;
        java.lang.Object regionValue3136;
        int regionValue3133;

        region1473: {
        java.lang.Object regionValue3208;
        java.lang.Object regionValue3211;
        int regionValue3210;
        int regionValue3209;
        int regionValue3205;
        int arrayValue3212;

        region1468: {
        int regionValue3186;
        int regionValue3185;
        java.lang.Object regionValue3184;
        int regionValue3181;
        int regionValue3188;
        java.lang.Object regionValue3187;

        region1466: {
        int regionValue3164;
        java.lang.Object regionValue3163;
        int regionValue3162;
        int regionValue3161;
        java.lang.Object regionValue3160;
        int regionValue3157;

        region1464: {
        int regionValue3115;
        java.lang.Object regionValue3114;
        int regionValue3113;
        int regionValue3112;
        java.lang.Object regionValue3111;
        int regionValue3108;

        region1462: {
        int regionValue2922;
        java.lang.Object regionValue2921;
        int regionValue2920;
        int regionValue2919;
        java.lang.Object regionValue2918;
        int regionValue2915;

        region1459: {
        int regionValue2972;
        java.lang.Object regionValue2971;
        int regionValue2970;
        int regionValue2969;
        java.lang.Object regionValue2968;
        int regionValue2965;

        region1457: {
        java.lang.Object regionValue3062;
        java.lang.Object regionValue3065;
        int regionValue3064;
        int regionValue3063;
        int regionValue3059;
        int arrayValue3066;

        region1452: {
        int regionValue3018;
        int regionValue3017;
        java.lang.Object regionValue3016;
        int regionValue3013;
        int regionValue3020;
        java.lang.Object regionValue3019;

        region1450: {
        int regionValue2996;
        java.lang.Object regionValue2995;
        int regionValue2994;
        int regionValue2993;
        java.lang.Object regionValue2992;
        int regionValue2989;

        region1448: {
        int regionValue2947;
        java.lang.Object regionValue2946;
        int regionValue2945;
        int regionValue2944;
        java.lang.Object regionValue2943;
        int regionValue2940;

        region1446: {
        int regionValue2712;
        java.lang.Object regionValue2711;
        int regionValue2710;
        int regionValue2709;
        java.lang.Object regionValue2708;
        int regionValue2705;

        region1443: {
        int regionValue1889;
        java.lang.Object regionValue1888;
        int regionValue1887;
        int regionValue1886;
        java.lang.Object regionValue1885;
        int regionValue1882;

        region1441: {
        java.lang.Object regionValue1959;
        java.lang.Object regionValue1962;
        int regionValue1961;
        int regionValue1960;
        int regionValue1956;
        int arrayValue2898;

        region1437: {
        int regionValue2838;
        java.lang.Object regionValue2837;
        int regionValue2836;
        java.lang.Object regionValue2835;
        int regionValue2832;
        int value2897;

        region1435: {
        int value2896;
        java.lang.Object value2895;
        java.lang.Object value2894;
        java.lang.Object value2891;
        int value2890;
        java.lang.Object value2888;
        java.lang.Object value2887;
        java.lang.Object value2886;
        java.lang.Object value2885;
        java.lang.Object value2884;
        java.lang.Object regionValue2883;
        int regionValue2882;
        java.lang.Object regionValue2881;
        int regionValue2878;

        region1398: {
        int regionValue2861;
        java.lang.Object regionValue2860;
        int regionValue2859;
        java.lang.Object regionValue2858;
        int regionValue2855;

        region1396: {
        int regionValue2535;
        java.lang.Object regionValue2534;
        java.lang.Object regionValue2531;
        int regionValue2528;
        int regionValue2533;
        int regionValue2532;

        region1394: {
        int regionValue2238;
        java.lang.Object regionValue2237;
        int regionValue2236;
        int regionValue2235;
        java.lang.Object regionValue2234;
        int regionValue2231;

        region1392: {
        java.lang.Object regionValue2311;
        int regionValue2310;
        int regionValue2309;
        java.lang.Object regionValue2308;
        int regionValue2305;
        boolean value2815;
        java.lang.Object value2814;

        region1378: {
        java.lang.Object regionValue2810;
        int regionValue2809;
        int regionValue2808;
        java.lang.Object regionValue2807;
        int regionValue2804;
        int regionValue2811;

        region1376: {
        int regionValue2787;
        java.lang.Object regionValue2786;
        int regionValue2785;
        int regionValue2784;
        java.lang.Object regionValue2783;
        int regionValue2780;

        region1374: {
        int regionValue2762;
        java.lang.Object regionValue2761;
        int regionValue2760;
        int regionValue2759;
        java.lang.Object regionValue2758;
        int regionValue2755;

        region1372: {
        int regionValue2737;
        java.lang.Object regionValue2736;
        int regionValue2735;
        int regionValue2734;
        java.lang.Object regionValue2733;
        int regionValue2730;

        region1370: {
        java.lang.Object regionValue2684;
        java.lang.Object regionValue2687;
        int regionValue2686;
        int regionValue2685;
        int regionValue2681;
        int arrayValue2688;

        region1363: {
        java.lang.Object regionValue2663;
        int regionValue2662;
        int regionValue2661;
        java.lang.Object regionValue2660;
        int regionValue2657;
        int regionValue2664;

        region1361: {
        int regionValue2361;
        java.lang.Object regionValue2360;
        int regionValue2359;
        int regionValue2358;
        java.lang.Object regionValue2357;
        int regionValue2354;

        region1359: {
        int regionValue2412;
        java.lang.Object regionValue2411;
        int regionValue2410;
        int regionValue2409;
        java.lang.Object regionValue2408;
        int regionValue2405;

        region1357: {
        java.lang.Object regionValue2486;
        java.lang.Object regionValue2485;
        int regionValue2484;
        int regionValue2483;
        java.lang.Object regionValue2482;
        int regionValue2479;
        boolean value2640;
        java.lang.Object arrayValue2639;

        region1350: {
        java.lang.Object regionValue2636;
        int regionValue2635;
        int regionValue2634;
        java.lang.Object regionValue2633;
        int regionValue2630;
        int regionValue2638;
        java.lang.Object regionValue2637;

        region1348: {
        int regionValue2613;
        java.lang.Object regionValue2612;
        java.lang.Object regionValue2611;
        int regionValue2610;
        int regionValue2609;
        java.lang.Object regionValue2608;
        int regionValue2605;

        region1346: {
        int regionValue2587;
        java.lang.Object regionValue2585;
        int regionValue2584;
        int regionValue2583;
        java.lang.Object regionValue2582;
        int regionValue2579;
        java.lang.Object regionValue2586;

        region1344: {
        int regionValue2561;
        java.lang.Object regionValue2560;
        java.lang.Object regionValue2559;
        int regionValue2558;
        int regionValue2557;
        java.lang.Object regionValue2556;
        int regionValue2553;

        region1342: {
        java.lang.Object regionValue2506;
        java.lang.Object regionValue2509;
        int regionValue2508;
        int regionValue2507;
        int regionValue2503;
        int arrayValue2511;
        java.lang.Object regionValue2510;

        region1335: {
        java.lang.Object regionValue2461;
        java.lang.Object regionValue2460;
        int regionValue2459;
        int regionValue2458;
        java.lang.Object regionValue2457;
        int regionValue2454;
        int regionValue2462;

        region1333: {
        int regionValue2437;
        java.lang.Object regionValue2436;
        java.lang.Object regionValue2435;
        int regionValue2434;
        int regionValue2433;
        java.lang.Object regionValue2432;
        int regionValue2429;

        region1331: {
        int regionValue2387;
        java.lang.Object regionValue2385;
        int regionValue2384;
        int regionValue2383;
        java.lang.Object regionValue2382;
        int regionValue2379;
        java.lang.Object regionValue2386;

        region1329: {
        int regionValue2037;
        java.lang.Object regionValue2035;
        int regionValue2034;
        int regionValue2033;
        java.lang.Object regionValue2032;
        int regionValue2029;
        java.lang.Object regionValue2036;

        region1326: {
        int regionValue2115;
        java.lang.Object regionValue2114;
        java.lang.Object regionValue2113;
        int regionValue2112;
        int regionValue2111;
        java.lang.Object regionValue2110;
        int regionValue2107;

        region1324: {
        java.lang.Object regionValue2189;
        java.lang.Object regionValue2188;
        int regionValue2187;
        int regionValue2186;
        java.lang.Object regionValue2185;
        int regionValue2182;
        boolean value2337;
        java.lang.Object arrayValue2336;

        region1317: {
        java.lang.Object regionValue2335;
        java.lang.Object regionValue2334;
        int regionValue2333;
        int regionValue2332;
        java.lang.Object regionValue2331;
        int regionValue2328;

        region1315: {
        java.lang.Object regionValue2286;
        int regionValue2285;
        int regionValue2284;
        java.lang.Object regionValue2283;
        int regionValue2280;
        int regionValue2288;
        java.lang.Object regionValue2287;

        region1313: {
        int regionValue2263;
        java.lang.Object regionValue2262;
        java.lang.Object regionValue2261;
        int regionValue2260;
        int regionValue2259;
        java.lang.Object regionValue2258;
        int regionValue2255;

        region1311: {
        java.lang.Object regionValue2209;
        java.lang.Object regionValue2212;
        int regionValue2211;
        int regionValue2210;
        int regionValue2206;
        int arrayValue2214;
        java.lang.Object regionValue2213;

        region1305: {
        java.lang.Object regionValue2164;
        java.lang.Object regionValue2163;
        int regionValue2162;
        int regionValue2161;
        java.lang.Object regionValue2160;
        int regionValue2157;
        int regionValue2165;

        region1303: {
        int regionValue2140;
        java.lang.Object regionValue2139;
        java.lang.Object regionValue2138;
        int regionValue2137;
        int regionValue2136;
        java.lang.Object regionValue2135;
        int regionValue2132;

        region1301: {
        int regionValue2089;
        java.lang.Object regionValue2088;
        java.lang.Object regionValue2087;
        int regionValue2086;
        int regionValue2085;
        java.lang.Object regionValue2084;
        int regionValue2081;

        region1299: {
        int regionValue2063;
        java.lang.Object regionValue2062;
        java.lang.Object regionValue2061;
        int regionValue2060;
        int regionValue2059;
        java.lang.Object regionValue2058;
        int regionValue2055;

        region1297: {
        java.lang.Object regionValue2010;
        boolean value2012;
        java.lang.Object regionValue2009;
        int regionValue2008;
        int regionValue2007;
        java.lang.Object regionValue2006;
        int regionValue2003;
        java.lang.Object arrayValue2011;

        region1288: {
        java.lang.Object regionValue1986;
        java.lang.Object regionValue1985;
        int regionValue1984;
        int regionValue1983;
        java.lang.Object regionValue1982;
        int regionValue1979;

        region1286: {
        java.lang.Object regionValue1937;
        int regionValue1936;
        int regionValue1935;
        java.lang.Object regionValue1934;
        int regionValue1931;
        int regionValue1939;
        java.lang.Object regionValue1938;

        region1283: {
        int regionValue1914;
        java.lang.Object regionValue1913;
        java.lang.Object regionValue1912;
        int regionValue1911;
        int regionValue1910;
        java.lang.Object regionValue1909;
        int regionValue1906;

        region1281: {
        int regionValue1863;
        java.lang.Object regionValue1864;
        int regionValue1862;
        java.lang.Object regionValue1861;
        int regionValue1858;
        java.lang.Object regionValue1865;

        region1277: {
        java.lang.Object regionValue1841;
        java.lang.Object regionValue1840;
        int regionValue1839;
        int regionValue1838;
        java.lang.Object regionValue1837;
        int regionValue1834;

        region1275: {
        java.lang.Object regionValue1792;
        int regionValue1791;
        int regionValue1790;
        java.lang.Object regionValue1789;
        int regionValue1786;
        java.lang.Object regionValue1794;
        java.lang.Object regionValue1793;

        region1273: {
        java.lang.Object regionValue1769;
        java.lang.Object regionValue1768;
        java.lang.Object regionValue1767;
        int regionValue1766;
        int regionValue1765;
        java.lang.Object regionValue1764;
        int regionValue1761;

        region1271: {
        java.lang.Object value1720;
        java.lang.Object regionValue1713;
        int regionValue1712;
        int regionValue1711;
        java.lang.Object regionValue1710;
        int regionValue1707;
        java.lang.Object value1719;
        java.lang.Object value1718;
        java.lang.Object value1717;
        java.lang.Object value1716;
        java.lang.Object value1715;
        java.lang.Object regionValue1714;

        region1257: {
        java.lang.Object regionValue1688;
        int regionValue1687;
        int regionValue1686;
        java.lang.Object regionValue1685;
        int regionValue1682;
        int regionValue1690;
        java.lang.Object regionValue1689;

        region1255: {
        int regionValue1665;
        java.lang.Object regionValue1664;
        java.lang.Object regionValue1663;
        int regionValue1662;
        int regionValue1661;
        java.lang.Object regionValue1660;
        int regionValue1657;

        region1253: {
        int regionValue1639;
        java.lang.Object regionValue1637;
        int regionValue1636;
        int regionValue1635;
        java.lang.Object regionValue1634;
        int regionValue1631;
        java.lang.Object regionValue1638;

        region1251: {
        int regionValue1613;
        java.lang.Object regionValue1612;
        java.lang.Object regionValue1611;
        int regionValue1610;
        int regionValue1609;
        java.lang.Object regionValue1608;
        int regionValue1605;

        region1249: {
        double value1562;
        double converted1557;
        java.lang.Object regionValue1554;
        int regionValue1553;
        int regionValue1552;
        java.lang.Object regionValue1551;
        int regionValue1548;
        int comparison1563;
        java.lang.Object value1561;
        java.lang.Object value1560;
        java.lang.Object value1558;
        java.lang.Object regionValue1555;
        int arrayValue1556;

        region1227: {
        java.lang.Object regionValue1506;
        int regionValue1505;
        int regionValue1504;
        java.lang.Object regionValue1503;
        int regionValue1500;
        int regionValue1508;
        java.lang.Object regionValue1507;

        region1225: {
        int regionValue1083;
        java.lang.Object regionValue1081;
        int regionValue1080;
        int regionValue1079;
        java.lang.Object regionValue1078;
        int regionValue1075;
        java.lang.Object regionValue1082;

        region1223: {
        int regionValue1135;
        java.lang.Object regionValue1134;
        java.lang.Object regionValue1133;
        int regionValue1132;
        int regionValue1131;
        java.lang.Object regionValue1130;
        int regionValue1127;

        region1221: {
        int regionValue1452;
        java.lang.Object regionValue1459;
        java.lang.Object regionValue1458;
        int regionValue1457;
        int regionValue1456;
        java.lang.Object regionValue1455;

        region1218: {
        int regionValue1207;
        int regionValue1206;
        java.lang.Object regionValue1205;
        int regionValue1202;
        java.lang.Object regionValue1209;
        java.lang.Object regionValue1208;

        region1215: {
        int regionValue1283;
        java.lang.Object regionValue1282;
        java.lang.Object regionValue1281;
        int regionValue1280;
        int regionValue1279;
        java.lang.Object regionValue1278;
        int regionValue1275;

        region1188: {
        int value1258;
        java.lang.Object regionValue1257;
        java.lang.Object regionValue1256;
        int regionValue1255;
        int regionValue1254;
        java.lang.Object regionValue1253;
        int regionValue1250;

        region1185: {
        java.lang.Object regionValue1233;
        java.lang.Object regionValue1232;
        int regionValue1231;
        int regionValue1230;
        java.lang.Object regionValue1229;
        int regionValue1226;

        region1183: {
        java.lang.Object regionValue1184;
        java.lang.Object regionValue1183;
        int regionValue1182;
        int regionValue1181;
        java.lang.Object regionValue1180;
        int regionValue1177;
        int regionValue1185;

        region1180: {
        int regionValue1160;
        java.lang.Object regionValue1159;
        java.lang.Object regionValue1158;
        int regionValue1157;
        int regionValue1156;
        java.lang.Object regionValue1155;
        int regionValue1152;

        region1178: {
        int regionValue1109;
        java.lang.Object regionValue1108;
        java.lang.Object regionValue1107;
        int regionValue1106;
        int regionValue1105;
        java.lang.Object regionValue1104;
        int regionValue1101;

        region1176: {
        int regionValue985;
        java.lang.Object regionValue986;
        int regionValue984;
        java.lang.Object regionValue983;
        int regionValue980;
        java.lang.Object value1058;
        java.lang.Object regionValue987;
        java.lang.Object value1057;

        region1169: {
        java.lang.Object regionValue1034;
        int regionValue1033;
        int regionValue1032;
        java.lang.Object regionValue1031;
        int regionValue1028;

        region1167: {
        int regionValue1009;
        int regionValue1008;
        java.lang.Object regionValue1007;
        int regionValue1004;
        java.lang.Object regionValue1011;
        java.lang.Object regionValue1010;

        region1163: {
        if (value51 != null) {
            regionValue980 = regionValue956;
            regionValue983 = regionValue959;
            regionValue984 = regionValue960;
            regionValue985 = regionValue961;
            regionValue986 = regionValue962;
            regionValue987 = regionValue963;
            break region1169;
        } else {
            regionValue1004 = regionValue956;
            regionValue1007 = regionValue959;
            regionValue1008 = regionValue960;
            regionValue1009 = regionValue961;
            regionValue1010 = regionValue962;
            regionValue1011 = regionValue963;
            break region1163;
        }
        }
        if (regionValue1011 != null) {
            regionValue1028 = regionValue1004;
            regionValue1031 = regionValue1007;
            regionValue1032 = regionValue1008;
            regionValue1033 = regionValue1009;
            regionValue1034 = regionValue1010;
            break region1167;
        } else {
            regionValue1051 = regionValue1004;
            regionValue1054 = regionValue1007;
            regionValue1055 = regionValue1008;
            regionValue1056 = regionValue1009;
            break region1165;
        }
        }
        regionValue980 = regionValue1028;
        regionValue983 = regionValue1031;
        regionValue984 = regionValue1032;
        regionValue985 = regionValue1033;
        regionValue986 = regionValue1034;
        regionValue987 = regionValue1034;
        break region1169;
        }
        value1057 = recovery$indy$flow$770(regionValue987);
        value1058 = value1057;
        if (a1 < 0) {
            regionValue1075 = regionValue980;
            regionValue1078 = regionValue983;
            regionValue1079 = regionValue984;
            regionValue1080 = regionValue985;
            regionValue1081 = regionValue986;
            regionValue1082 = value1058;
            regionValue1083 = regionValue985;
            break region1223;
        } else {
            regionValue1101 = regionValue980;
            regionValue1104 = regionValue983;
            regionValue1105 = regionValue984;
            regionValue1106 = regionValue985;
            regionValue1107 = regionValue986;
            regionValue1108 = value1058;
            regionValue1109 = regionValue985;
            break region1176;
        }
        }
        if (value51 != null) {
            regionValue1127 = regionValue1101;
            regionValue1130 = regionValue1104;
            regionValue1131 = regionValue1105;
            regionValue1132 = regionValue1106;
            regionValue1133 = regionValue1107;
            regionValue1134 = regionValue1108;
            regionValue1135 = regionValue1109;
            break region1221;
        } else {
            regionValue1152 = regionValue1101;
            regionValue1155 = regionValue1104;
            regionValue1156 = regionValue1105;
            regionValue1157 = regionValue1106;
            regionValue1158 = regionValue1107;
            regionValue1159 = regionValue1108;
            regionValue1160 = regionValue1109;
            break region1178;
        }
        }
        regionValue1177 = regionValue1152;
        regionValue1180 = regionValue1155;
        regionValue1181 = regionValue1156;
        regionValue1182 = regionValue1157;
        regionValue1183 = regionValue1158;
        regionValue1184 = regionValue1159;
        regionValue1185 = regionValue1160;
        break region1180;
        }
        if (regionValue1185 >= 5) {
            regionValue1202 = regionValue1177;
            regionValue1205 = regionValue1180;
            regionValue1206 = regionValue1181;
            regionValue1207 = regionValue1182;
            regionValue1208 = regionValue1183;
            regionValue1209 = regionValue1184;
            break region1215;
        } else {
            regionValue1226 = regionValue1177;
            regionValue1229 = regionValue1180;
            regionValue1230 = regionValue1181;
            regionValue1231 = regionValue1182;
            regionValue1232 = regionValue1183;
            regionValue1233 = regionValue1184;
            break region1183;
        }
        }
        regionValue1250 = regionValue1226;
        regionValue1253 = regionValue1229;
        regionValue1254 = regionValue1230;
        regionValue1255 = regionValue1231;
        regionValue1256 = regionValue1232;
        regionValue1257 = regionValue1233;
        break region1185;
        }
        value1258 = 0;
        regionValue1275 = regionValue1250;
        regionValue1278 = regionValue1253;
        regionValue1279 = regionValue1254;
        regionValue1280 = regionValue1255;
        regionValue1281 = regionValue1256;
        regionValue1282 = regionValue1257;
        regionValue1283 = value1258;
        break region1188;
        }
        loop1188: while (true) {
        java.lang.Object regionValue1361;
        java.lang.Object regionValue1360;
        int regionValue1359;
        int regionValue1358;
        java.lang.Object regionValue1357;
        int regionValue1354;
        int regionValue1362;
        int incremented1413;

        region1211: {
        java.lang.Object regionValue1407;
        int regionValue1412;
        java.lang.Object regionValue1411;
        java.lang.Object regionValue1410;
        int regionValue1409;
        int regionValue1408;
        int regionValue1404;

        region1205: {
        int regionValue1387;
        java.lang.Object regionValue1386;
        java.lang.Object regionValue1385;
        int regionValue1384;
        int regionValue1383;
        java.lang.Object regionValue1382;
        int regionValue1379;

        region1203: {
        int regionValue1336;
        java.lang.Object regionValue1335;
        java.lang.Object regionValue1334;
        int regionValue1333;
        int regionValue1332;
        java.lang.Object regionValue1331;
        int regionValue1328;
        int regionValue1337;

        region1201: {
        java.lang.Object regionValue1308;
        boolean value1311;
        int regionValue1309;
        java.lang.Object regionValue1307;
        int regionValue1306;
        int regionValue1305;
        java.lang.Object regionValue1304;
        int regionValue1301;
        java.lang.Object arrayValue1310;

        region1193: {
        int length1284;

        length1284 = java.lang.reflect.Array.getLength(value601);
        if (regionValue1283 >= length1284) {
            regionValue1202 = regionValue1275;
            regionValue1205 = regionValue1278;
            regionValue1206 = regionValue1279;
            regionValue1207 = regionValue1280;
            regionValue1208 = regionValue1281;
            regionValue1209 = regionValue1282;
            break region1215;
        } else {
            regionValue1301 = regionValue1275;
            regionValue1304 = regionValue1278;
            regionValue1305 = regionValue1279;
            regionValue1306 = regionValue1280;
            regionValue1307 = regionValue1281;
            regionValue1308 = regionValue1282;
            regionValue1309 = regionValue1283;
            break region1193;
        }
        }
        arrayValue1310 = ((java.lang.Object[]) value601)[regionValue1309];
        value1311 = recovery$indy$flow$771(arrayValue1310, regionValue1308);
        if (value51 != null) {
            regionValue1127 = regionValue1301;
            regionValue1130 = regionValue1304;
            regionValue1131 = regionValue1305;
            regionValue1132 = regionValue1306;
            regionValue1133 = regionValue1307;
            regionValue1134 = regionValue1308;
            regionValue1135 = (int) ((value1311 ? 1 : 0));
            break region1221;
        } else {
            regionValue1328 = regionValue1301;
            regionValue1331 = regionValue1304;
            regionValue1332 = regionValue1305;
            regionValue1333 = regionValue1306;
            regionValue1334 = regionValue1307;
            regionValue1335 = regionValue1308;
            regionValue1336 = regionValue1309;
            regionValue1337 = (int) ((value1311 ? 1 : 0));
            break region1201;
        }
        }
        if (regionValue1337 == 0) {
            regionValue1354 = regionValue1328;
            regionValue1357 = regionValue1331;
            regionValue1358 = regionValue1332;
            regionValue1359 = regionValue1333;
            regionValue1360 = regionValue1334;
            regionValue1361 = regionValue1335;
            regionValue1362 = regionValue1336;
            break region1211;
        } else {
            regionValue1379 = regionValue1328;
            regionValue1382 = regionValue1331;
            regionValue1383 = regionValue1332;
            regionValue1384 = regionValue1333;
            regionValue1385 = regionValue1334;
            regionValue1386 = regionValue1335;
            regionValue1387 = regionValue1336;
            break region1203;
        }
        }
        regionValue1404 = regionValue1379;
        regionValue1407 = regionValue1382;
        regionValue1408 = regionValue1383;
        regionValue1409 = regionValue1384;
        regionValue1410 = regionValue1385;
        regionValue1411 = regionValue1386;
        regionValue1412 = regionValue1387;
        break region1205;
        }
        if (regionValue1407 instanceof boolean[]) {
            ((boolean[]) regionValue1407)[regionValue1412] = true;
        } else {
            ((byte[]) regionValue1407)[regionValue1412] = (byte) (1);
        }
        regionValue1354 = regionValue1404;
        regionValue1357 = regionValue1407;
        regionValue1358 = regionValue1408;
        regionValue1359 = regionValue1409;
        regionValue1360 = regionValue1410;
        regionValue1361 = regionValue1411;
        regionValue1362 = regionValue1412;
        break region1211;
        }
        incremented1413 = regionValue1362 + (1);
        if (value51 == null) {
            regionValue1275 = regionValue1354;
            regionValue1278 = regionValue1357;
            regionValue1279 = regionValue1358;
            regionValue1280 = regionValue1359;
            regionValue1281 = regionValue1360;
            regionValue1282 = regionValue1361;
            regionValue1283 = incremented1413;
            continue loop1188;
        } else {
            regionValue1202 = regionValue1354;
            regionValue1205 = regionValue1357;
            regionValue1206 = regionValue1358;
            regionValue1207 = regionValue1359;
            regionValue1208 = regionValue1360;
            regionValue1209 = regionValue1361;
            break region1215;
        }
        }
        }
        if (a2 >= 0) {
            regionValue1430 = regionValue1202;
            regionValue1433 = regionValue1205;
            regionValue1434 = regionValue1206;
            regionValue1435 = regionValue1207;
            break region1953;
        } else {
            regionValue1452 = regionValue1202;
            regionValue1455 = regionValue1205;
            regionValue1456 = regionValue1206;
            regionValue1457 = regionValue1207;
            regionValue1458 = regionValue1208;
            regionValue1459 = regionValue1209;
            break region1218;
        }
        }
        regionValue1127 = regionValue1452;
        regionValue1130 = regionValue1455;
        regionValue1131 = regionValue1456;
        regionValue1132 = regionValue1457;
        regionValue1133 = regionValue1458;
        regionValue1134 = regionValue1459;
        regionValue1135 = regionValue1452;
        break region1221;
        }
        regionValue1075 = regionValue1127;
        regionValue1078 = regionValue1130;
        regionValue1079 = regionValue1131;
        regionValue1080 = regionValue1132;
        regionValue1081 = regionValue1133;
        regionValue1082 = regionValue1134;
        regionValue1083 = regionValue1135;
        break region1223;
        }
        if (value51 != null) {
            regionValue1476 = regionValue1075;
            regionValue1479 = regionValue1078;
            regionValue1480 = regionValue1079;
            regionValue1481 = regionValue1080;
            regionValue1482 = regionValue1081;
            regionValue1483 = regionValue1083;
            break region1684;
        } else {
            regionValue1500 = regionValue1075;
            regionValue1503 = regionValue1078;
            regionValue1504 = regionValue1079;
            regionValue1505 = regionValue1080;
            regionValue1506 = regionValue1081;
            regionValue1507 = regionValue1082;
            regionValue1508 = regionValue1083;
            break region1225;
        }
        }
        if (regionValue1508 <= 0) {
            regionValue1525 = regionValue1500;
            regionValue1528 = regionValue1503;
            regionValue1529 = regionValue1504;
            regionValue1530 = regionValue1505;
            regionValue1531 = regionValue1506;
            break region1682;
        } else {
            regionValue1548 = regionValue1500;
            regionValue1551 = regionValue1503;
            regionValue1552 = regionValue1504;
            regionValue1553 = regionValue1505;
            regionValue1554 = regionValue1506;
            regionValue1555 = regionValue1507;
            break region1227;
        }
        }
        arrayValue1556 = ((int[]) value186)[4];
        converted1557 = (double) (arrayValue1556);
        value1558 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingReCraftIfSoupsLowerThan));
        value1560 = value1558;
        value1561 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value1560))))));
        value1562 = recovery$indy$flow$774(value1561, computed21);
        comparison1563 = (java.lang.Double.isNaN(converted1557) || java.lang.Double.isNaN(value1562) ? 1 : (converted1557 > value1562 ? 1 : converted1557 == value1562 ? 0 : -1));
        if (a0 <= 0) {
            regionValue1580 = regionValue1548;
            regionValue1583 = regionValue1551;
            regionValue1584 = regionValue1552;
            regionValue1585 = regionValue1553;
            regionValue1586 = regionValue1554;
            regionValue1587 = comparison1563;
            break region1686;
        } else {
            regionValue1605 = regionValue1548;
            regionValue1608 = regionValue1551;
            regionValue1609 = regionValue1552;
            regionValue1610 = regionValue1553;
            regionValue1611 = regionValue1554;
            regionValue1612 = regionValue1555;
            regionValue1613 = comparison1563;
            break region1249;
        }
        }
        regionValue1631 = regionValue1605;
        regionValue1634 = regionValue1608;
        regionValue1635 = regionValue1609;
        regionValue1636 = regionValue1610;
        regionValue1637 = regionValue1611;
        regionValue1638 = regionValue1612;
        regionValue1639 = regionValue1613;
        break region1251;
        }
        if (value51 != null) {
            regionValue1476 = regionValue1631;
            regionValue1479 = regionValue1634;
            regionValue1480 = regionValue1635;
            regionValue1481 = regionValue1636;
            regionValue1482 = regionValue1637;
            regionValue1483 = regionValue1639;
            break region1684;
        } else {
            regionValue1657 = regionValue1631;
            regionValue1660 = regionValue1634;
            regionValue1661 = regionValue1635;
            regionValue1662 = regionValue1636;
            regionValue1663 = regionValue1637;
            regionValue1664 = regionValue1638;
            regionValue1665 = regionValue1639;
            break region1253;
        }
        }
        regionValue1682 = regionValue1657;
        regionValue1685 = regionValue1660;
        regionValue1686 = regionValue1661;
        regionValue1687 = regionValue1662;
        regionValue1688 = regionValue1663;
        regionValue1689 = regionValue1664;
        regionValue1690 = regionValue1665;
        break region1255;
        }
        if (regionValue1690 > 0) {
            regionValue1525 = regionValue1682;
            regionValue1528 = regionValue1685;
            regionValue1529 = regionValue1686;
            regionValue1530 = regionValue1687;
            regionValue1531 = regionValue1688;
            break region1682;
        } else {
            regionValue1707 = regionValue1682;
            regionValue1710 = regionValue1685;
            regionValue1711 = regionValue1686;
            regionValue1712 = regionValue1687;
            regionValue1713 = regionValue1688;
            regionValue1714 = regionValue1689;
            break region1257;
        }
        }
        value1715 = recovery$indy$flow$775();
        value1716 = value1715;
        value1717 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1716))))));
        value1718 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1717)))).field_42P));
        value1719 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value1718)))).field_42X));
        value1720 = recovery$indy$flow$779(value1719);
        if (value51 != null) {
            regionValue1737 = regionValue1707;
            regionValue1740 = regionValue1710;
            regionValue1741 = regionValue1711;
            regionValue1742 = regionValue1712;
            regionValue1743 = regionValue1713;
            regionValue1744 = value1720;
            break region1553;
        } else {
            regionValue1761 = regionValue1707;
            regionValue1764 = regionValue1710;
            regionValue1765 = regionValue1711;
            regionValue1766 = regionValue1712;
            regionValue1767 = regionValue1713;
            regionValue1768 = regionValue1714;
            regionValue1769 = value1720;
            break region1271;
        }
        }
        regionValue1786 = regionValue1761;
        regionValue1789 = regionValue1764;
        regionValue1790 = regionValue1765;
        regionValue1791 = regionValue1766;
        regionValue1792 = regionValue1767;
        regionValue1793 = regionValue1768;
        regionValue1794 = regionValue1769;
        break region1273;
        }
        if (regionValue1794 != null) {
            regionValue1811 = regionValue1786;
            regionValue1814 = regionValue1789;
            regionValue1815 = regionValue1790;
            regionValue1816 = regionValue1791;
            regionValue1817 = regionValue1792;
            break region1540;
        } else {
            regionValue1834 = regionValue1786;
            regionValue1837 = regionValue1789;
            regionValue1838 = regionValue1790;
            regionValue1839 = regionValue1791;
            regionValue1840 = regionValue1792;
            regionValue1841 = regionValue1793;
            break region1275;
        }
        }
        regionValue1858 = regionValue1834;
        regionValue1861 = regionValue1837;
        regionValue1862 = regionValue1838;
        regionValue1863 = regionValue1839;
        regionValue1864 = regionValue1840;
        regionValue1865 = regionValue1841;
        break region1277;
        }
        if (value51 != null) {
            regionValue1882 = regionValue1858;
            regionValue1885 = regionValue1861;
            regionValue1886 = regionValue1862;
            regionValue1887 = regionValue1863;
            regionValue1888 = regionValue1864;
            regionValue1889 = regionValue1863;
            break region1441;
        } else {
            regionValue1906 = regionValue1858;
            regionValue1909 = regionValue1861;
            regionValue1910 = regionValue1862;
            regionValue1911 = regionValue1863;
            regionValue1912 = regionValue1864;
            regionValue1913 = regionValue1865;
            regionValue1914 = regionValue1863;
            break region1281;
        }
        }
        regionValue1931 = regionValue1906;
        regionValue1934 = regionValue1909;
        regionValue1935 = regionValue1910;
        regionValue1936 = regionValue1911;
        regionValue1937 = regionValue1912;
        regionValue1938 = regionValue1913;
        regionValue1939 = regionValue1914;
        break region1283;
        }
        if (regionValue1939 <= 8) {
            regionValue1956 = regionValue1931;
            regionValue1959 = regionValue1934;
            regionValue1960 = regionValue1935;
            regionValue1961 = regionValue1936;
            regionValue1962 = regionValue1937;
            break region1437;
        } else {
            regionValue1979 = regionValue1931;
            regionValue1982 = regionValue1934;
            regionValue1983 = regionValue1935;
            regionValue1984 = regionValue1936;
            regionValue1985 = regionValue1937;
            regionValue1986 = regionValue1938;
            break region1286;
        }
        }
        regionValue2003 = regionValue1979;
        regionValue2006 = regionValue1982;
        regionValue2007 = regionValue1983;
        regionValue2008 = regionValue1984;
        regionValue2009 = regionValue1985;
        regionValue2010 = regionValue1986;
        break region1288;
        }
        arrayValue2011 = ((java.lang.Object[]) value601)[0];
        value2012 = recovery$indy$flow$780(regionValue2010, arrayValue2011);
        if (a2 > 0) {
            regionValue2029 = regionValue2003;
            regionValue2032 = regionValue2006;
            regionValue2033 = regionValue2007;
            regionValue2034 = regionValue2008;
            regionValue2035 = regionValue2009;
            regionValue2036 = regionValue2010;
            regionValue2037 = (int) ((value2012 ? 1 : 0));
            break region1326;
        } else {
            regionValue2055 = regionValue2003;
            regionValue2058 = regionValue2006;
            regionValue2059 = regionValue2007;
            regionValue2060 = regionValue2008;
            regionValue2061 = regionValue2009;
            regionValue2062 = regionValue2010;
            regionValue2063 = (int) ((value2012 ? 1 : 0));
            break region1297;
        }
        }
        regionValue2081 = regionValue2055;
        regionValue2084 = regionValue2058;
        regionValue2085 = regionValue2059;
        regionValue2086 = regionValue2060;
        regionValue2087 = regionValue2061;
        regionValue2088 = regionValue2062;
        regionValue2089 = regionValue2063;
        break region1299;
        }
        if (value51 != null) {
            regionValue2107 = regionValue2081;
            regionValue2110 = regionValue2084;
            regionValue2111 = regionValue2085;
            regionValue2112 = regionValue2086;
            regionValue2113 = regionValue2087;
            regionValue2114 = regionValue2088;
            regionValue2115 = regionValue2089;
            break region1324;
        } else {
            regionValue2132 = regionValue2081;
            regionValue2135 = regionValue2084;
            regionValue2136 = regionValue2085;
            regionValue2137 = regionValue2086;
            regionValue2138 = regionValue2087;
            regionValue2139 = regionValue2088;
            regionValue2140 = regionValue2089;
            break region1301;
        }
        }
        regionValue2157 = regionValue2132;
        regionValue2160 = regionValue2135;
        regionValue2161 = regionValue2136;
        regionValue2162 = regionValue2137;
        regionValue2163 = regionValue2138;
        regionValue2164 = regionValue2139;
        regionValue2165 = regionValue2140;
        break region1303;
        }
        if (regionValue2165 == 0) {
            regionValue2182 = regionValue2157;
            regionValue2185 = regionValue2160;
            regionValue2186 = regionValue2161;
            regionValue2187 = regionValue2162;
            regionValue2188 = regionValue2163;
            regionValue2189 = regionValue2164;
            break region1317;
        } else {
            regionValue2206 = regionValue2157;
            regionValue2209 = regionValue2160;
            regionValue2210 = regionValue2161;
            regionValue2211 = regionValue2162;
            regionValue2212 = regionValue2163;
            regionValue2213 = regionValue2164;
            break region1305;
        }
        }
        arrayValue2214 = (regionValue2209 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue2209)[0] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue2209)[0]);
        if (value51 != null) {
            regionValue2231 = regionValue2206;
            regionValue2234 = regionValue2209;
            regionValue2235 = regionValue2210;
            regionValue2236 = regionValue2211;
            regionValue2237 = regionValue2212;
            regionValue2238 = arrayValue2214;
            break region1392;
        } else {
            regionValue2255 = regionValue2206;
            regionValue2258 = regionValue2209;
            regionValue2259 = regionValue2210;
            regionValue2260 = regionValue2211;
            regionValue2261 = regionValue2212;
            regionValue2262 = regionValue2213;
            regionValue2263 = arrayValue2214;
            break region1311;
        }
        }
        regionValue2280 = regionValue2255;
        regionValue2283 = regionValue2258;
        regionValue2284 = regionValue2259;
        regionValue2285 = regionValue2260;
        regionValue2286 = regionValue2261;
        regionValue2287 = regionValue2262;
        regionValue2288 = regionValue2263;
        break region1313;
        }
        if (regionValue2288 == 0) {
            regionValue2305 = regionValue2280;
            regionValue2308 = regionValue2283;
            regionValue2309 = regionValue2284;
            regionValue2310 = regionValue2285;
            regionValue2311 = regionValue2286;
            break region1378;
        } else {
            regionValue2328 = regionValue2280;
            regionValue2331 = regionValue2283;
            regionValue2332 = regionValue2284;
            regionValue2333 = regionValue2285;
            regionValue2334 = regionValue2286;
            regionValue2335 = regionValue2287;
            break region1315;
        }
        }
        regionValue2182 = regionValue2328;
        regionValue2185 = regionValue2331;
        regionValue2186 = regionValue2332;
        regionValue2187 = regionValue2333;
        regionValue2188 = regionValue2334;
        regionValue2189 = regionValue2335;
        break region1317;
        }
        arrayValue2336 = ((java.lang.Object[]) value601)[1];
        value2337 = recovery$indy$flow$781(regionValue2189, arrayValue2336);
        regionValue2107 = regionValue2182;
        regionValue2110 = regionValue2185;
        regionValue2111 = regionValue2186;
        regionValue2112 = regionValue2187;
        regionValue2113 = regionValue2188;
        regionValue2114 = regionValue2189;
        regionValue2115 = (int) ((value2337 ? 1 : 0));
        break region1324;
        }
        regionValue2029 = regionValue2107;
        regionValue2032 = regionValue2110;
        regionValue2033 = regionValue2111;
        regionValue2034 = regionValue2112;
        regionValue2035 = regionValue2113;
        regionValue2036 = regionValue2114;
        regionValue2037 = regionValue2115;
        break region1326;
        }
        if (a2 > 0) {
            regionValue2354 = regionValue2029;
            regionValue2357 = regionValue2032;
            regionValue2358 = regionValue2033;
            regionValue2359 = regionValue2034;
            regionValue2360 = regionValue2035;
            regionValue2361 = regionValue2037;
            break region1359;
        } else {
            regionValue2379 = regionValue2029;
            regionValue2382 = regionValue2032;
            regionValue2383 = regionValue2033;
            regionValue2384 = regionValue2034;
            regionValue2385 = regionValue2035;
            regionValue2386 = regionValue2036;
            regionValue2387 = regionValue2037;
            break region1329;
        }
        }
        if (value51 != null) {
            regionValue2405 = regionValue2379;
            regionValue2408 = regionValue2382;
            regionValue2409 = regionValue2383;
            regionValue2410 = regionValue2384;
            regionValue2411 = regionValue2385;
            regionValue2412 = regionValue2387;
            break region1357;
        } else {
            regionValue2429 = regionValue2379;
            regionValue2432 = regionValue2382;
            regionValue2433 = regionValue2383;
            regionValue2434 = regionValue2384;
            regionValue2435 = regionValue2385;
            regionValue2436 = regionValue2386;
            regionValue2437 = regionValue2387;
            break region1331;
        }
        }
        regionValue2454 = regionValue2429;
        regionValue2457 = regionValue2432;
        regionValue2458 = regionValue2433;
        regionValue2459 = regionValue2434;
        regionValue2460 = regionValue2435;
        regionValue2461 = regionValue2436;
        regionValue2462 = regionValue2437;
        break region1333;
        }
        if (regionValue2462 == 0) {
            regionValue2479 = regionValue2454;
            regionValue2482 = regionValue2457;
            regionValue2483 = regionValue2458;
            regionValue2484 = regionValue2459;
            regionValue2485 = regionValue2460;
            regionValue2486 = regionValue2461;
            break region1350;
        } else {
            regionValue2503 = regionValue2454;
            regionValue2506 = regionValue2457;
            regionValue2507 = regionValue2458;
            regionValue2508 = regionValue2459;
            regionValue2509 = regionValue2460;
            regionValue2510 = regionValue2461;
            break region1335;
        }
        }
        arrayValue2511 = (regionValue2506 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue2506)[1] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue2506)[1]);
        if (a0 <= 0) {
            regionValue2528 = regionValue2503;
            regionValue2531 = regionValue2506;
            regionValue2532 = regionValue2507;
            regionValue2533 = regionValue2508;
            regionValue2534 = regionValue2509;
            regionValue2535 = arrayValue2511;
            break region1394;
        } else {
            regionValue2553 = regionValue2503;
            regionValue2556 = regionValue2506;
            regionValue2557 = regionValue2507;
            regionValue2558 = regionValue2508;
            regionValue2559 = regionValue2509;
            regionValue2560 = regionValue2510;
            regionValue2561 = arrayValue2511;
            break region1342;
        }
        }
        regionValue2579 = regionValue2553;
        regionValue2582 = regionValue2556;
        regionValue2583 = regionValue2557;
        regionValue2584 = regionValue2558;
        regionValue2585 = regionValue2559;
        regionValue2586 = regionValue2560;
        regionValue2587 = regionValue2561;
        break region1344;
        }
        if (value51 != null) {
            regionValue2231 = regionValue2579;
            regionValue2234 = regionValue2582;
            regionValue2235 = regionValue2583;
            regionValue2236 = regionValue2584;
            regionValue2237 = regionValue2585;
            regionValue2238 = regionValue2587;
            break region1392;
        } else {
            regionValue2605 = regionValue2579;
            regionValue2608 = regionValue2582;
            regionValue2609 = regionValue2583;
            regionValue2610 = regionValue2584;
            regionValue2611 = regionValue2585;
            regionValue2612 = regionValue2586;
            regionValue2613 = regionValue2587;
            break region1346;
        }
        }
        regionValue2630 = regionValue2605;
        regionValue2633 = regionValue2608;
        regionValue2634 = regionValue2609;
        regionValue2635 = regionValue2610;
        regionValue2636 = regionValue2611;
        regionValue2637 = regionValue2612;
        regionValue2638 = regionValue2613;
        break region1348;
        }
        if (regionValue2638 == 0) {
            regionValue2305 = regionValue2630;
            regionValue2308 = regionValue2633;
            regionValue2309 = regionValue2634;
            regionValue2310 = regionValue2635;
            regionValue2311 = regionValue2636;
            break region1378;
        } else {
            regionValue2479 = regionValue2630;
            regionValue2482 = regionValue2633;
            regionValue2483 = regionValue2634;
            regionValue2484 = regionValue2635;
            regionValue2485 = regionValue2636;
            regionValue2486 = regionValue2637;
            break region1350;
        }
        }
        arrayValue2639 = ((java.lang.Object[]) value601)[2];
        value2640 = recovery$indy$flow$782(regionValue2486, arrayValue2639);
        regionValue2405 = regionValue2479;
        regionValue2408 = regionValue2482;
        regionValue2409 = regionValue2483;
        regionValue2410 = regionValue2484;
        regionValue2411 = regionValue2485;
        regionValue2412 = (int) ((value2640 ? 1 : 0));
        break region1357;
        }
        regionValue2354 = regionValue2405;
        regionValue2357 = regionValue2408;
        regionValue2358 = regionValue2409;
        regionValue2359 = regionValue2410;
        regionValue2360 = regionValue2411;
        regionValue2361 = regionValue2412;
        break region1359;
        }
        if (value51 != null) {
            regionValue1882 = regionValue2354;
            regionValue1885 = regionValue2357;
            regionValue1886 = regionValue2358;
            regionValue1887 = regionValue2359;
            regionValue1888 = regionValue2360;
            regionValue1889 = regionValue2361;
            break region1441;
        } else {
            regionValue2657 = regionValue2354;
            regionValue2660 = regionValue2357;
            regionValue2661 = regionValue2358;
            regionValue2662 = regionValue2359;
            regionValue2663 = regionValue2360;
            regionValue2664 = regionValue2361;
            break region1361;
        }
        }
        if (regionValue2664 == 0) {
            regionValue1956 = regionValue2657;
            regionValue1959 = regionValue2660;
            regionValue1960 = regionValue2661;
            regionValue1961 = regionValue2662;
            regionValue1962 = regionValue2663;
            break region1437;
        } else {
            regionValue2681 = regionValue2657;
            regionValue2684 = regionValue2660;
            regionValue2685 = regionValue2661;
            regionValue2686 = regionValue2662;
            regionValue2687 = regionValue2663;
            break region1363;
        }
        }
        arrayValue2688 = (regionValue2684 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue2684)[2] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue2684)[2]);
        if (a0 < 0) {
            regionValue2705 = regionValue2681;
            regionValue2708 = regionValue2684;
            regionValue2709 = regionValue2685;
            regionValue2710 = regionValue2686;
            regionValue2711 = regionValue2687;
            regionValue2712 = arrayValue2688;
            break region1443;
        } else {
            regionValue2730 = regionValue2681;
            regionValue2733 = regionValue2684;
            regionValue2734 = regionValue2685;
            regionValue2735 = regionValue2686;
            regionValue2736 = regionValue2687;
            regionValue2737 = arrayValue2688;
            break region1370;
        }
        }
        regionValue2755 = regionValue2730;
        regionValue2758 = regionValue2733;
        regionValue2759 = regionValue2734;
        regionValue2760 = regionValue2735;
        regionValue2761 = regionValue2736;
        regionValue2762 = regionValue2737;
        break region1372;
        }
        if (value51 != null) {
            regionValue1882 = regionValue2755;
            regionValue1885 = regionValue2758;
            regionValue1886 = regionValue2759;
            regionValue1887 = regionValue2760;
            regionValue1888 = regionValue2761;
            regionValue1889 = regionValue2762;
            break region1441;
        } else {
            regionValue2780 = regionValue2755;
            regionValue2783 = regionValue2758;
            regionValue2784 = regionValue2759;
            regionValue2785 = regionValue2760;
            regionValue2786 = regionValue2761;
            regionValue2787 = regionValue2762;
            break region1374;
        }
        }
        regionValue2804 = regionValue2780;
        regionValue2807 = regionValue2783;
        regionValue2808 = regionValue2784;
        regionValue2809 = regionValue2785;
        regionValue2810 = regionValue2786;
        regionValue2811 = regionValue2787;
        break region1376;
        }
        if (regionValue2811 != 0) {
            regionValue1956 = regionValue2804;
            regionValue1959 = regionValue2807;
            regionValue1960 = regionValue2808;
            regionValue1961 = regionValue2809;
            regionValue1962 = regionValue2810;
            break region1437;
        } else {
            regionValue2305 = regionValue2804;
            regionValue2308 = regionValue2807;
            regionValue2309 = regionValue2808;
            regionValue2310 = regionValue2809;
            regionValue2311 = regionValue2810;
            break region1378;
        }
        }
        value2814 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value2815 = recovery$indy$flow$784(value2814, computed37);
        regionValue2231 = regionValue2305;
        regionValue2234 = regionValue2308;
        regionValue2235 = regionValue2309;
        regionValue2236 = regionValue2310;
        regionValue2237 = regionValue2311;
        regionValue2238 = (int) ((value2815 ? 1 : 0));
        break region1392;
        }
        regionValue2528 = regionValue2231;
        regionValue2531 = regionValue2234;
        regionValue2532 = regionValue2235;
        regionValue2533 = regionValue2236;
        regionValue2534 = regionValue2237;
        regionValue2535 = regionValue2238;
        break region1394;
        }
        if (value51 != null) {
            regionValue2832 = regionValue2528;
            regionValue2835 = regionValue2531;
            regionValue2836 = regionValue2532;
            regionValue2837 = regionValue2534;
            regionValue2838 = regionValue2535;
            break region1435;
        } else {
            regionValue2855 = regionValue2528;
            regionValue2858 = regionValue2531;
            regionValue2859 = regionValue2533;
            regionValue2860 = regionValue2534;
            regionValue2861 = regionValue2535;
            break region1396;
        }
        }
        if (regionValue2861 == 0) {
            regionValue2878 = regionValue2855;
            regionValue2881 = regionValue2858;
            regionValue2882 = regionValue2859;
            regionValue2883 = regionValue2860;
            break region1398;
        } else {
            break region556;
        }
        }
        value2884 = recovery$indy$flow$785();
        value2885 = value2884;
        value2886 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2885))))));
        value2887 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2886)))).field_42P));
        value2888 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value2887)))).field_429));
        value2890 = regionValue2882;
        value2891 = value2888;
        value2894 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value2895 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value2891))))));
        recovery$indy$flow$791(value2894, computed23, value2895, value2890, regionValue599);
        value2896 = 1;
        regionValue2832 = regionValue2878;
        regionValue2835 = regionValue2881;
        regionValue2836 = value2896;
        regionValue2837 = regionValue2883;
        regionValue2838 = 0;
        break region1435;
        }
        value2897 = regionValue2838;
        regionValue1956 = regionValue2832;
        regionValue1959 = regionValue2835;
        regionValue1960 = regionValue2836;
        regionValue1961 = value2897;
        regionValue1962 = regionValue2837;
        break region1437;
        }
        arrayValue2898 = (regionValue1959 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue1959)[0] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue1959)[0]);
        regionValue1882 = regionValue1956;
        regionValue1885 = regionValue1959;
        regionValue1886 = regionValue1960;
        regionValue1887 = regionValue1961;
        regionValue1888 = regionValue1962;
        regionValue1889 = arrayValue2898;
        break region1441;
        }
        regionValue2705 = regionValue1882;
        regionValue2708 = regionValue1885;
        regionValue2709 = regionValue1886;
        regionValue2710 = regionValue1887;
        regionValue2711 = regionValue1888;
        regionValue2712 = regionValue1889;
        break region1443;
        }
        if (a1 < 0) {
            regionValue2915 = regionValue2705;
            regionValue2918 = regionValue2708;
            regionValue2919 = regionValue2709;
            regionValue2920 = regionValue2710;
            regionValue2921 = regionValue2711;
            regionValue2922 = regionValue2712;
            break region1459;
        } else {
            regionValue2940 = regionValue2705;
            regionValue2943 = regionValue2708;
            regionValue2944 = regionValue2709;
            regionValue2945 = regionValue2710;
            regionValue2946 = regionValue2711;
            regionValue2947 = regionValue2712;
            break region1446;
        }
        }
        if (value51 != null) {
            regionValue2965 = regionValue2940;
            regionValue2968 = regionValue2943;
            regionValue2969 = regionValue2944;
            regionValue2970 = regionValue2945;
            regionValue2971 = regionValue2946;
            regionValue2972 = regionValue2947;
            break region1457;
        } else {
            regionValue2989 = regionValue2940;
            regionValue2992 = regionValue2943;
            regionValue2993 = regionValue2944;
            regionValue2994 = regionValue2945;
            regionValue2995 = regionValue2946;
            regionValue2996 = regionValue2947;
            break region1448;
        }
        }
        regionValue3013 = regionValue2989;
        regionValue3016 = regionValue2992;
        regionValue3017 = regionValue2993;
        regionValue3018 = regionValue2994;
        regionValue3019 = regionValue2995;
        regionValue3020 = regionValue2996;
        break region1450;
        }
        if (regionValue3020 == 0) {
            regionValue3037 = regionValue3013;
            regionValue3040 = regionValue3016;
            regionValue3041 = regionValue3017;
            regionValue3042 = regionValue3018;
            break region1951;
        } else {
            regionValue3059 = regionValue3013;
            regionValue3062 = regionValue3016;
            regionValue3063 = regionValue3017;
            regionValue3064 = regionValue3018;
            regionValue3065 = regionValue3019;
            break region1452;
        }
        }
        arrayValue3066 = (regionValue3062 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue3062)[1] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue3062)[1]);
        regionValue2965 = regionValue3059;
        regionValue2968 = regionValue3062;
        regionValue2969 = regionValue3063;
        regionValue2970 = regionValue3064;
        regionValue2971 = regionValue3065;
        regionValue2972 = arrayValue3066;
        break region1457;
        }
        regionValue2915 = regionValue2965;
        regionValue2918 = regionValue2968;
        regionValue2919 = regionValue2969;
        regionValue2920 = regionValue2970;
        regionValue2921 = regionValue2971;
        regionValue2922 = regionValue2972;
        break region1459;
        }
        if (a0 < 0) {
            regionValue3083 = regionValue2915;
            regionValue3086 = regionValue2918;
            regionValue3087 = regionValue2919;
            regionValue3088 = regionValue2920;
            regionValue3089 = regionValue2921;
            regionValue3090 = regionValue2922;
            break region1475;
        } else {
            regionValue3108 = regionValue2915;
            regionValue3111 = regionValue2918;
            regionValue3112 = regionValue2919;
            regionValue3113 = regionValue2920;
            regionValue3114 = regionValue2921;
            regionValue3115 = regionValue2922;
            break region1462;
        }
        }
        if (value51 != null) {
            regionValue3133 = regionValue3108;
            regionValue3136 = regionValue3111;
            regionValue3137 = regionValue3112;
            regionValue3138 = regionValue3113;
            regionValue3139 = regionValue3114;
            regionValue3140 = regionValue3115;
            break region1473;
        } else {
            regionValue3157 = regionValue3108;
            regionValue3160 = regionValue3111;
            regionValue3161 = regionValue3112;
            regionValue3162 = regionValue3113;
            regionValue3163 = regionValue3114;
            regionValue3164 = regionValue3115;
            break region1464;
        }
        }
        regionValue3181 = regionValue3157;
        regionValue3184 = regionValue3160;
        regionValue3185 = regionValue3161;
        regionValue3186 = regionValue3162;
        regionValue3187 = regionValue3163;
        regionValue3188 = regionValue3164;
        break region1466;
        }
        if (regionValue3188 == 0) {
            regionValue3037 = regionValue3181;
            regionValue3040 = regionValue3184;
            regionValue3041 = regionValue3185;
            regionValue3042 = regionValue3186;
            break region1951;
        } else {
            regionValue3205 = regionValue3181;
            regionValue3208 = regionValue3184;
            regionValue3209 = regionValue3185;
            regionValue3210 = regionValue3186;
            regionValue3211 = regionValue3187;
            break region1468;
        }
        }
        arrayValue3212 = (regionValue3208 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue3208)[2] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue3208)[2]);
        regionValue3133 = regionValue3205;
        regionValue3136 = regionValue3208;
        regionValue3137 = regionValue3209;
        regionValue3138 = regionValue3210;
        regionValue3139 = regionValue3211;
        regionValue3140 = arrayValue3212;
        break region1473;
        }
        regionValue3083 = regionValue3133;
        regionValue3086 = regionValue3136;
        regionValue3087 = regionValue3137;
        regionValue3088 = regionValue3138;
        regionValue3089 = regionValue3139;
        regionValue3090 = regionValue3140;
        break region1475;
        }
        if (a2 > 0) {
            regionValue3229 = regionValue3083;
            regionValue3232 = regionValue3086;
            regionValue3233 = regionValue3087;
            regionValue3234 = regionValue3089;
            regionValue3235 = regionValue3090;
            break region1500;
        } else {
            regionValue3253 = regionValue3083;
            regionValue3256 = regionValue3086;
            regionValue3257 = regionValue3087;
            regionValue3258 = regionValue3088;
            regionValue3259 = regionValue3089;
            regionValue3260 = regionValue3090;
            break region1478;
        }
        }
        if (value51 != null) {
            regionValue3278 = regionValue3253;
            regionValue3281 = regionValue3256;
            regionValue3282 = regionValue3257;
            regionValue3283 = regionValue3259;
            regionValue3284 = regionValue3260;
            break region1498;
        } else {
            regionValue3301 = regionValue3253;
            regionValue3304 = regionValue3256;
            regionValue3305 = regionValue3257;
            regionValue3306 = regionValue3258;
            regionValue3307 = regionValue3259;
            regionValue3308 = regionValue3260;
            break region1480;
        }
        }
        regionValue3325 = regionValue3301;
        regionValue3328 = regionValue3304;
        regionValue3329 = regionValue3305;
        regionValue3330 = regionValue3306;
        regionValue3331 = regionValue3307;
        regionValue3332 = regionValue3308;
        break region1482;
        }
        if (regionValue3332 == 0) {
            regionValue3037 = regionValue3325;
            regionValue3040 = regionValue3328;
            regionValue3041 = regionValue3329;
            regionValue3042 = regionValue3330;
            break region1951;
        } else {
            regionValue3349 = regionValue3325;
            regionValue3352 = regionValue3328;
            regionValue3353 = regionValue3329;
            regionValue3354 = regionValue3331;
            break region1484;
        }
        }
        value3357 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value3358 = recovery$indy$flow$793(value3357, computed37);
        regionValue3278 = regionValue3349;
        regionValue3281 = regionValue3352;
        regionValue3282 = regionValue3353;
        regionValue3283 = regionValue3354;
        regionValue3284 = (int) ((value3358 ? 1 : 0));
        break region1498;
        }
        regionValue3229 = regionValue3278;
        regionValue3232 = regionValue3281;
        regionValue3233 = regionValue3282;
        regionValue3234 = regionValue3283;
        regionValue3235 = regionValue3284;
        break region1500;
        }
        if (value51 != null) {
            regionValue3375 = regionValue3229;
            regionValue3378 = regionValue3232;
            regionValue3379 = regionValue3233;
            regionValue3380 = regionValue3234;
            regionValue3381 = regionValue3235;
            break region1531;
        } else {
            regionValue3398 = regionValue3229;
            regionValue3401 = regionValue3232;
            regionValue3402 = regionValue3234;
            regionValue3403 = regionValue3235;
            break region1502;
        }
        }
        if (regionValue3403 == 0) {
            regionValue3420 = regionValue3398;
            regionValue3423 = regionValue3401;
            regionValue3424 = regionValue3402;
            break region1504;
        } else {
            break region647;
        }
        }
        converted3425 = (short) (converted27);
        converted3426 = (short) (converted35);
        value3427 = (int) (converted3426);
        value3429 = (int) (converted3425);
        value3430 = 0;
        value3432 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        recovery$indy$flow$795(value3432, value3430, (short) (value3429), converted31, (short) (value3427));
        value3433 = 1;
        regionValue3375 = regionValue3420;
        regionValue3378 = regionValue3423;
        regionValue3379 = value3433;
        regionValue3380 = regionValue3424;
        regionValue3381 = 0;
        break region1531;
        }
        value3434 = regionValue3381;
        if (a1 < 0) {
            regionValue3451 = regionValue3375;
            regionValue3454 = regionValue3378;
            regionValue3455 = regionValue3379;
            regionValue3456 = value3434;
            break region1030;
        } else {
            regionValue3474 = regionValue3375;
            regionValue3477 = regionValue3378;
            regionValue3478 = regionValue3379;
            regionValue3479 = regionValue3380;
            regionValue3480 = value3434;
            break region1536;
        }
        }
        if (value51 == null) {
            regionValue3037 = regionValue3474;
            regionValue3040 = regionValue3477;
            regionValue3041 = regionValue3478;
            regionValue3042 = regionValue3480;
            break region1951;
        } else {
            regionValue3498 = regionValue3474;
            regionValue3501 = regionValue3477;
            regionValue3502 = regionValue3478;
            regionValue3503 = regionValue3479;
            regionValue3504 = regionValue3480;
            break region1538;
        }
        }
        regionValue1811 = regionValue3498;
        regionValue1814 = regionValue3501;
        regionValue1815 = regionValue3502;
        regionValue1816 = regionValue3504;
        regionValue1817 = regionValue3503;
        break region1540;
        }
        value3505 = recovery$indy$flow$796();
        value3506 = value3505;
        value3507 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3506))))));
        value3508 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3507)))).field_42P));
        value3509 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value3508)))).field_42X));
        value3510 = recovery$indy$flow$800(value3509);
        regionValue1737 = regionValue1811;
        regionValue1740 = regionValue1814;
        regionValue1741 = regionValue1815;
        regionValue1742 = regionValue1816;
        regionValue1743 = regionValue1817;
        regionValue1744 = value3510;
        break region1553;
        }
        value3511 = regionValue1744;
        value3512 = recovery$indy$flow$801(value3511);
        value3513 = value3512;
        value3514 = 0;
        regionValue3531 = regionValue1737;
        regionValue3534 = regionValue1740;
        regionValue3535 = regionValue1741;
        regionValue3536 = regionValue1742;
        regionValue3537 = regionValue1743;
        regionValue3538 = value3513;
        regionValue3539 = value3514;
        break region1560;
        }
        loop1560: while (true) {
        java.lang.Object regionValue3824;
        int regionValue3823;
        int regionValue3822;
        java.lang.Object regionValue3821;
        int regionValue3818;
        int regionValue3826;
        java.lang.Object regionValue3825;
        int incremented4123;

        region1665: {
        int regionValue4060;
        int regionValue4059;
        java.lang.Object regionValue4058;
        java.lang.Object regionValue4057;
        int regionValue4056;
        java.lang.Object regionValue4055;
        int regionValue4052;
        int value4122;

        region1663: {
        int regionValue4107;
        int value4121;
        java.lang.Object value4120;
        java.lang.Object value4119;
        java.lang.Object value4116;
        int value4115;
        int value4114;
        java.lang.Object value4112;
        java.lang.Object value4111;
        java.lang.Object value4110;
        java.lang.Object value4109;
        java.lang.Object value4108;
        java.lang.Object regionValue4106;
        java.lang.Object regionValue4105;
        java.lang.Object regionValue4104;
        int regionValue4101;
        int computed4113;

        region1624: {
        int regionValue4084;
        int regionValue4083;
        java.lang.Object regionValue4082;
        java.lang.Object regionValue4081;
        java.lang.Object regionValue4080;
        int regionValue4077;

        region1622: {
        int regionValue3877;
        int regionValue3876;
        java.lang.Object regionValue3875;
        java.lang.Object regionValue3874;
        java.lang.Object regionValue3872;
        int regionValue3869;
        int regionValue3873;

        region1620: {
        int regionValue3930;
        int regionValue3929;
        java.lang.Object regionValue3928;
        java.lang.Object regionValue3927;
        int regionValue3926;
        java.lang.Object regionValue3925;
        int regionValue3922;

        region1618: {
        boolean value4035;
        java.lang.Object value4034;
        int regionValue4006;
        java.lang.Object regionValue4005;
        java.lang.Object regionValue4004;
        int regionValue4003;
        java.lang.Object regionValue4002;
        int regionValue3999;

        region1605: {
        int regionValue4031;
        java.lang.Object regionValue4030;
        java.lang.Object regionValue4029;
        int regionValue4028;
        int regionValue4027;
        java.lang.Object regionValue4026;
        int regionValue4023;

        region1603: {
        int regionValue3981;
        java.lang.Object regionValue3980;
        java.lang.Object regionValue3979;
        int regionValue3977;
        java.lang.Object regionValue3976;
        int regionValue3973;
        int regionValue3982;
        int regionValue3978;

        region1601: {
        int regionValue3956;
        int regionValue3955;
        java.lang.Object regionValue3954;
        java.lang.Object regionValue3953;
        int regionValue3952;
        int regionValue3951;
        java.lang.Object regionValue3950;
        int regionValue3947;

        region1599: {
        int regionValue3904;
        int regionValue3903;
        java.lang.Object regionValue3902;
        java.lang.Object regionValue3901;
        int regionValue3899;
        java.lang.Object regionValue3898;
        int regionValue3895;
        int regionValue3900;

        region1597: {
        int regionValue3668;
        int regionValue3667;
        java.lang.Object regionValue3666;
        java.lang.Object regionValue3665;
        int regionValue3663;
        java.lang.Object regionValue3662;
        int regionValue3659;
        int regionValue3664;

        region1594: {
        int regionValue3749;
        int regionValue3748;
        java.lang.Object regionValue3747;
        java.lang.Object regionValue3746;
        int regionValue3745;
        int regionValue3744;
        java.lang.Object regionValue3743;
        int regionValue3740;

        region1592: {
        java.lang.Object regionValue3846;
        int regionValue3851;
        java.lang.Object regionValue3850;
        java.lang.Object regionValue3849;
        int regionValue3848;
        int regionValue3847;
        int regionValue3843;
        int arrayValue3852;

        region1587: {
        int regionValue3800;
        java.lang.Object regionValue3799;
        java.lang.Object regionValue3798;
        int regionValue3797;
        int regionValue3796;
        java.lang.Object regionValue3795;
        int regionValue3792;
        int regionValue3801;

        region1585: {
        int regionValue3775;
        int regionValue3774;
        java.lang.Object regionValue3773;
        java.lang.Object regionValue3772;
        int regionValue3771;
        int regionValue3770;
        java.lang.Object regionValue3769;
        int regionValue3766;

        region1583: {
        int regionValue3722;
        int regionValue3721;
        java.lang.Object regionValue3720;
        java.lang.Object regionValue3719;
        int regionValue3718;
        int regionValue3717;
        java.lang.Object regionValue3716;
        int regionValue3713;

        region1581: {
        int regionValue3695;
        int regionValue3694;
        java.lang.Object regionValue3693;
        java.lang.Object regionValue3692;
        int regionValue3691;
        int regionValue3690;
        java.lang.Object regionValue3689;
        int regionValue3686;

        region1579: {
        int regionValue3641;
        int regionValue3640;
        java.lang.Object regionValue3639;
        java.lang.Object regionValue3638;
        int regionValue3637;
        int regionValue3636;
        java.lang.Object regionValue3635;
        int regionValue3632;

        region1576: {
        int regionValue3615;
        int regionValue3614;
        java.lang.Object regionValue3613;
        java.lang.Object regionValue3612;
        int regionValue3611;
        int regionValue3610;
        java.lang.Object regionValue3609;
        int regionValue3606;

        region1572: {
        boolean value3589;
        int regionValue3587;
        java.lang.Object regionValue3586;
        int regionValue3584;
        int regionValue3583;
        java.lang.Object regionValue3582;
        int regionValue3579;
        java.lang.Object regionValue3585;
        java.lang.Object arrayValue3588;

        region1564: {
        if (regionValue3539 >= 3) {
            regionValue3556 = regionValue3531;
            regionValue3559 = regionValue3534;
            regionValue3560 = regionValue3535;
            regionValue3561 = regionValue3536;
            regionValue3562 = regionValue3537;
            break region1669;
        } else {
            regionValue3579 = regionValue3531;
            regionValue3582 = regionValue3534;
            regionValue3583 = regionValue3535;
            regionValue3584 = regionValue3536;
            regionValue3585 = regionValue3537;
            regionValue3586 = regionValue3538;
            regionValue3587 = regionValue3539;
            break region1564;
        }
        }
        arrayValue3588 = ((java.lang.Object[]) value601)[regionValue3587];
        value3589 = recovery$indy$flow$802(regionValue3586, arrayValue3588);
        if (value51 != null) {
            regionValue648 = regionValue3579;
            regionValue651 = regionValue3582;
            regionValue652 = regionValue3583;
            regionValue653 = regionValue3584;
            regionValue654 = (int) ((value3589 ? 1 : 0));
            continue loop267;
        } else {
            regionValue3606 = regionValue3579;
            regionValue3609 = regionValue3582;
            regionValue3610 = regionValue3583;
            regionValue3611 = regionValue3584;
            regionValue3612 = regionValue3585;
            regionValue3613 = regionValue3586;
            regionValue3614 = regionValue3587;
            regionValue3615 = (int) ((value3589 ? 1 : 0));
            break region1572;
        }
        }
        if (a2 >= 0) {
            regionValue711 = regionValue3615;
            break region1037;
        } else {
            regionValue3632 = regionValue3606;
            regionValue3635 = regionValue3609;
            regionValue3636 = regionValue3610;
            regionValue3637 = regionValue3611;
            regionValue3638 = regionValue3612;
            regionValue3639 = regionValue3613;
            regionValue3640 = regionValue3614;
            regionValue3641 = regionValue3615;
            break region1576;
        }
        }
        if (a0 <= 0) {
            regionValue3659 = regionValue3632;
            regionValue3662 = regionValue3635;
            regionValue3663 = regionValue3636;
            regionValue3664 = regionValue3637;
            regionValue3665 = regionValue3638;
            regionValue3666 = regionValue3639;
            regionValue3667 = regionValue3640;
            regionValue3668 = regionValue3641;
            break region1594;
        } else {
            regionValue3686 = regionValue3632;
            regionValue3689 = regionValue3635;
            regionValue3690 = regionValue3636;
            regionValue3691 = regionValue3637;
            regionValue3692 = regionValue3638;
            regionValue3693 = regionValue3639;
            regionValue3694 = regionValue3640;
            regionValue3695 = regionValue3641;
            break region1579;
        }
        }
        regionValue3713 = regionValue3686;
        regionValue3716 = regionValue3689;
        regionValue3717 = regionValue3690;
        regionValue3718 = regionValue3691;
        regionValue3719 = regionValue3692;
        regionValue3720 = regionValue3693;
        regionValue3721 = regionValue3694;
        regionValue3722 = regionValue3695;
        break region1581;
        }
        if (value51 != null) {
            regionValue3740 = regionValue3713;
            regionValue3743 = regionValue3716;
            regionValue3744 = regionValue3717;
            regionValue3745 = regionValue3718;
            regionValue3746 = regionValue3719;
            regionValue3747 = regionValue3720;
            regionValue3748 = regionValue3721;
            regionValue3749 = regionValue3722;
            break region1592;
        } else {
            regionValue3766 = regionValue3713;
            regionValue3769 = regionValue3716;
            regionValue3770 = regionValue3717;
            regionValue3771 = regionValue3718;
            regionValue3772 = regionValue3719;
            regionValue3773 = regionValue3720;
            regionValue3774 = regionValue3721;
            regionValue3775 = regionValue3722;
            break region1583;
        }
        }
        regionValue3792 = regionValue3766;
        regionValue3795 = regionValue3769;
        regionValue3796 = regionValue3770;
        regionValue3797 = regionValue3771;
        regionValue3798 = regionValue3772;
        regionValue3799 = regionValue3773;
        regionValue3800 = regionValue3774;
        regionValue3801 = regionValue3775;
        break region1585;
        }
        if (regionValue3801 == 0) {
            regionValue3818 = regionValue3792;
            regionValue3821 = regionValue3795;
            regionValue3822 = regionValue3796;
            regionValue3823 = regionValue3797;
            regionValue3824 = regionValue3798;
            regionValue3825 = regionValue3799;
            regionValue3826 = regionValue3800;
            break region1665;
        } else {
            regionValue3843 = regionValue3792;
            regionValue3846 = regionValue3795;
            regionValue3847 = regionValue3796;
            regionValue3848 = regionValue3797;
            regionValue3849 = regionValue3798;
            regionValue3850 = regionValue3799;
            regionValue3851 = regionValue3800;
            break region1587;
        }
        }
        arrayValue3852 = (regionValue3846 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue3846)[regionValue3851] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue3846)[regionValue3851]);
        regionValue3740 = regionValue3843;
        regionValue3743 = regionValue3846;
        regionValue3744 = regionValue3847;
        regionValue3745 = regionValue3848;
        regionValue3746 = regionValue3849;
        regionValue3747 = regionValue3850;
        regionValue3748 = regionValue3851;
        regionValue3749 = arrayValue3852;
        break region1592;
        }
        regionValue3659 = regionValue3740;
        regionValue3662 = regionValue3743;
        regionValue3663 = regionValue3744;
        regionValue3664 = regionValue3745;
        regionValue3665 = regionValue3746;
        regionValue3666 = regionValue3747;
        regionValue3667 = regionValue3748;
        regionValue3668 = regionValue3749;
        break region1594;
        }
        if (a2 >= 0) {
            regionValue3869 = regionValue3659;
            regionValue3872 = regionValue3662;
            regionValue3873 = regionValue3663;
            regionValue3874 = regionValue3665;
            regionValue3875 = regionValue3666;
            regionValue3876 = regionValue3667;
            regionValue3877 = regionValue3668;
            break region1620;
        } else {
            regionValue3895 = regionValue3659;
            regionValue3898 = regionValue3662;
            regionValue3899 = regionValue3663;
            regionValue3900 = regionValue3664;
            regionValue3901 = regionValue3665;
            regionValue3902 = regionValue3666;
            regionValue3903 = regionValue3667;
            regionValue3904 = regionValue3668;
            break region1597;
        }
        }
        if (value51 != null) {
            regionValue3922 = regionValue3895;
            regionValue3925 = regionValue3898;
            regionValue3926 = regionValue3899;
            regionValue3927 = regionValue3901;
            regionValue3928 = regionValue3902;
            regionValue3929 = regionValue3903;
            regionValue3930 = regionValue3904;
            break region1618;
        } else {
            regionValue3947 = regionValue3895;
            regionValue3950 = regionValue3898;
            regionValue3951 = regionValue3899;
            regionValue3952 = regionValue3900;
            regionValue3953 = regionValue3901;
            regionValue3954 = regionValue3902;
            regionValue3955 = regionValue3903;
            regionValue3956 = regionValue3904;
            break region1599;
        }
        }
        regionValue3973 = regionValue3947;
        regionValue3976 = regionValue3950;
        regionValue3977 = regionValue3951;
        regionValue3978 = regionValue3952;
        regionValue3979 = regionValue3953;
        regionValue3980 = regionValue3954;
        regionValue3981 = regionValue3955;
        regionValue3982 = regionValue3956;
        break region1601;
        }
        if (regionValue3982 == 0) {
            regionValue3999 = regionValue3973;
            regionValue4002 = regionValue3976;
            regionValue4003 = regionValue3977;
            regionValue4004 = regionValue3979;
            regionValue4005 = regionValue3980;
            regionValue4006 = regionValue3981;
            break region1605;
        } else {
            regionValue4023 = regionValue3973;
            regionValue4026 = regionValue3976;
            regionValue4027 = regionValue3977;
            regionValue4028 = regionValue3978;
            regionValue4029 = regionValue3979;
            regionValue4030 = regionValue3980;
            regionValue4031 = regionValue3981;
            break region1603;
        }
        }
        regionValue3818 = regionValue4023;
        regionValue3821 = regionValue4026;
        regionValue3822 = regionValue4027;
        regionValue3823 = regionValue4028;
        regionValue3824 = regionValue4029;
        regionValue3825 = regionValue4030;
        regionValue3826 = regionValue4031;
        break region1665;
        }
        value4034 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value4035 = recovery$indy$flow$804(value4034, computed37);
        regionValue3922 = regionValue3999;
        regionValue3925 = regionValue4002;
        regionValue3926 = regionValue4003;
        regionValue3927 = regionValue4004;
        regionValue3928 = regionValue4005;
        regionValue3929 = regionValue4006;
        regionValue3930 = (int) ((value4035 ? 1 : 0));
        break region1618;
        }
        regionValue3869 = regionValue3922;
        regionValue3872 = regionValue3925;
        regionValue3873 = regionValue3926;
        regionValue3874 = regionValue3927;
        regionValue3875 = regionValue3928;
        regionValue3876 = regionValue3929;
        regionValue3877 = regionValue3930;
        break region1620;
        }
        if (value51 != null) {
            regionValue4052 = regionValue3869;
            regionValue4055 = regionValue3872;
            regionValue4056 = regionValue3873;
            regionValue4057 = regionValue3874;
            regionValue4058 = regionValue3875;
            regionValue4059 = regionValue3876;
            regionValue4060 = regionValue3877;
            break region1663;
        } else {
            regionValue4077 = regionValue3869;
            regionValue4080 = regionValue3872;
            regionValue4081 = regionValue3874;
            regionValue4082 = regionValue3875;
            regionValue4083 = regionValue3876;
            regionValue4084 = regionValue3877;
            break region1622;
        }
        }
        if (regionValue4084 == 0) {
            regionValue4101 = regionValue4077;
            regionValue4104 = regionValue4080;
            regionValue4105 = regionValue4081;
            regionValue4106 = regionValue4082;
            regionValue4107 = regionValue4083;
            break region1624;
        } else {
            break region751;
        }
        }
        value4108 = recovery$indy$flow$805();
        value4109 = value4108;
        value4110 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4109))))));
        value4111 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4110)))).field_42P));
        value4112 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value4111)))).field_429));
        computed4113 = regionValue4107 + 1;
        value4114 = 0;
        value4115 = computed4113;
        value4116 = value4112;
        value4119 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value4120 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value4116))))));
        recovery$indy$flow$811(value4119, computed23, value4120, value4115, value4114);
        value4121 = 1;
        regionValue4052 = regionValue4101;
        regionValue4055 = regionValue4104;
        regionValue4056 = value4121;
        regionValue4057 = regionValue4105;
        regionValue4058 = regionValue4106;
        regionValue4059 = regionValue4107;
        regionValue4060 = 0;
        break region1663;
        }
        value4122 = regionValue4060;
        regionValue3818 = regionValue4052;
        regionValue3821 = regionValue4055;
        regionValue3822 = regionValue4056;
        regionValue3823 = value4122;
        regionValue3824 = regionValue4057;
        regionValue3825 = regionValue4058;
        regionValue3826 = regionValue4059;
        break region1665;
        }
        incremented4123 = regionValue3826 + (1);
        if (value51 == null) {
            regionValue3531 = regionValue3818;
            regionValue3534 = regionValue3821;
            regionValue3535 = regionValue3822;
            regionValue3536 = regionValue3823;
            regionValue3537 = regionValue3824;
            regionValue3538 = regionValue3825;
            regionValue3539 = incremented4123;
            continue loop1560;
        } else {
            regionValue3556 = regionValue3818;
            regionValue3559 = regionValue3821;
            regionValue3560 = regionValue3822;
            regionValue3561 = regionValue3823;
            regionValue3562 = regionValue3824;
            break region1669;
        }
        }
        }
        if (a2 >= 0) {
            regionValue4140 = regionValue3556;
            regionValue4143 = regionValue3559;
            regionValue4144 = regionValue3560;
            regionValue4145 = regionValue3561;
            break region1955;
        } else {
            regionValue4163 = regionValue3556;
            regionValue4166 = regionValue3559;
            regionValue4167 = regionValue3560;
            regionValue4168 = regionValue3561;
            regionValue4169 = regionValue3562;
            break region1673;
        }
        }
        if (a2 >= 0) {
            regionValue3451 = regionValue4163;
            regionValue3454 = regionValue4166;
            regionValue3455 = regionValue4167;
            regionValue3456 = regionValue4168;
            break region1030;
        } else {
            regionValue4187 = regionValue4163;
            regionValue4190 = regionValue4166;
            regionValue4191 = regionValue4167;
            regionValue4192 = regionValue4168;
            regionValue4193 = regionValue4169;
            break region1676;
        }
        }
        regionValue4211 = regionValue4187;
        regionValue4214 = regionValue4190;
        regionValue4215 = regionValue4191;
        regionValue4216 = regionValue4192;
        regionValue4217 = regionValue4193;
        break region1678;
        }
        if (value51 == null) {
            regionValue3037 = regionValue4211;
            regionValue3040 = regionValue4214;
            regionValue3041 = regionValue4215;
            regionValue3042 = regionValue4216;
            break region1951;
        } else {
            regionValue4235 = regionValue4211;
            regionValue4238 = regionValue4214;
            regionValue4239 = regionValue4215;
            regionValue4240 = regionValue4216;
            regionValue4241 = regionValue4217;
            break region1680;
        }
        }
        regionValue1525 = regionValue4235;
        regionValue1528 = regionValue4238;
        regionValue1529 = regionValue4239;
        regionValue1530 = regionValue4240;
        regionValue1531 = regionValue4241;
        break region1682;
        }
        regionValue1476 = regionValue1525;
        regionValue1479 = regionValue1528;
        regionValue1480 = regionValue1529;
        regionValue1481 = regionValue1530;
        regionValue1482 = regionValue1531;
        regionValue1483 = regionValue1530;
        break region1684;
        }
        regionValue1580 = regionValue1476;
        regionValue1583 = regionValue1479;
        regionValue1584 = regionValue1480;
        regionValue1585 = regionValue1481;
        regionValue1586 = regionValue1482;
        regionValue1587 = regionValue1483;
        break region1686;
        }
        if (value51 != null) {
            regionValue4258 = regionValue1580;
            regionValue4261 = regionValue1583;
            regionValue4262 = regionValue1584;
            regionValue4263 = regionValue1585;
            regionValue4264 = regionValue1586;
            regionValue4265 = regionValue1587;
            break region1696;
        } else {
            regionValue4282 = regionValue1580;
            regionValue4285 = regionValue1583;
            regionValue4286 = regionValue1584;
            regionValue4287 = regionValue1585;
            regionValue4288 = regionValue1586;
            regionValue4289 = regionValue1587;
            break region1688;
        }
        }
        if (regionValue4289 <= 5) {
            regionValue3037 = regionValue4282;
            regionValue3040 = regionValue4285;
            regionValue3041 = regionValue4286;
            regionValue3042 = regionValue4287;
            break region1951;
        } else {
            regionValue4306 = regionValue4282;
            regionValue4309 = regionValue4285;
            regionValue4310 = regionValue4286;
            regionValue4311 = regionValue4287;
            regionValue4312 = regionValue4288;
            break region1691;
        }
        }
        regionValue4329 = regionValue4306;
        regionValue4332 = regionValue4309;
        regionValue4333 = regionValue4310;
        regionValue4334 = regionValue4311;
        regionValue4335 = regionValue4312;
        break region1693;
        }
        regionValue4258 = regionValue4329;
        regionValue4261 = regionValue4332;
        regionValue4262 = regionValue4333;
        regionValue4263 = regionValue4334;
        regionValue4264 = regionValue4335;
        regionValue4265 = 0;
        break region1696;
        }
        value4336 = regionValue4265;
        regionValue4353 = regionValue4258;
        regionValue4356 = regionValue4261;
        regionValue4357 = regionValue4262;
        regionValue4358 = regionValue4263;
        regionValue4359 = regionValue4264;
        regionValue4360 = value4336;
        break region1698;
        }
        loop1698: while (true) {
        int regionValue5956;
        int regionValue5953;
        java.lang.Object regionValue5952;
        int regionValue5949;
        int regionValue5955;
        java.lang.Object regionValue5954;

        region1947: {
        int regionValue4803;
        int regionValue4802;
        java.lang.Object regionValue4801;
        int regionValue4798;
        int regionValue4805;
        java.lang.Object regionValue4804;

        region1944: {
        int regionValue4636;
        java.lang.Object regionValue4635;
        int regionValue4634;
        int regionValue4633;
        java.lang.Object regionValue4632;
        int regionValue4629;
        int incremented6014;

        region1941: {
        int regionValue5201;
        int regionValue5198;
        java.lang.Object regionValue5197;
        int regionValue5196;
        int regionValue5195;
        java.lang.Object regionValue5194;
        int regionValue5191;
        int regionValue5200;
        java.lang.Object regionValue5199;

        region1814: {
        int regionValue4746;
        java.lang.Object regionValue4745;
        int regionValue4744;
        java.lang.Object regionValue4743;
        int regionValue4742;
        int regionValue4741;
        java.lang.Object regionValue4740;
        int regionValue4737;
        int value5174;

        region1811: {
        java.lang.Object regionValue5057;
        int regionValue5056;
        int regionValue5055;
        java.lang.Object regionValue5054;
        int regionValue5053;
        int regionValue5052;
        java.lang.Object regionValue5051;
        int regionValue5048;
        int value5173;
        java.lang.Object value5172;

        region1802: {
        java.lang.Object regionValue5171;
        int regionValue5170;
        int regionValue5169;
        java.lang.Object regionValue5168;
        int regionValue5167;
        int regionValue5166;
        java.lang.Object regionValue5165;
        int regionValue5162;

        region1799: {
        java.lang.Object regionValue5144;
        int regionValue5143;
        int regionValue5142;
        java.lang.Object regionValue5141;
        int regionValue5140;
        int regionValue5139;
        java.lang.Object regionValue5138;
        int regionValue5135;

        region1797: {
        int regionValue4720;
        int regionValue4719;
        java.lang.Object regionValue4718;
        int regionValue4717;
        java.lang.Object regionValue4716;
        int regionValue4715;
        int regionValue4714;
        java.lang.Object regionValue4713;
        int regionValue4710;

        region1750: {
        int value4693;
        int value4692;
        java.lang.Object value4691;
        int regionValue4690;
        java.lang.Object regionValue4689;
        int regionValue4688;
        int regionValue4687;
        java.lang.Object regionValue4686;
        int regionValue4683;

        region1743: {
        int regionValue4666;
        int regionValue4665;
        java.lang.Object regionValue4664;
        int regionValue4663;
        int regionValue4662;
        java.lang.Object regionValue4661;
        int regionValue4658;

        region1741: {
        int regionValue4462;
        int regionValue4461;
        java.lang.Object regionValue4460;
        int regionValue4459;
        int regionValue4458;
        java.lang.Object regionValue4457;
        int regionValue4454;

        region1739: {
        int regionValue4514;
        int regionValue4513;
        java.lang.Object regionValue4512;
        int regionValue4511;
        int regionValue4510;
        java.lang.Object regionValue4509;
        int regionValue4506;

        region1737: {
        boolean value4640;
        java.lang.Object value4639;
        int regionValue4588;
        java.lang.Object regionValue4587;
        int regionValue4586;
        int regionValue4585;
        java.lang.Object regionValue4584;
        int regionValue4581;

        region1724: {
        int regionValue4612;
        java.lang.Object regionValue4611;
        int regionValue4610;
        int regionValue4609;
        java.lang.Object regionValue4608;
        int regionValue4605;

        region1722: {
        int regionValue4563;
        java.lang.Object regionValue4562;
        int regionValue4561;
        int regionValue4560;
        java.lang.Object regionValue4559;
        int regionValue4556;
        int regionValue4564;

        region1720: {
        int regionValue4539;
        int regionValue4538;
        java.lang.Object regionValue4537;
        int regionValue4536;
        int regionValue4535;
        java.lang.Object regionValue4534;
        int regionValue4531;

        region1718: {
        int regionValue4488;
        int regionValue4487;
        java.lang.Object regionValue4486;
        int regionValue4485;
        int regionValue4484;
        java.lang.Object regionValue4483;
        int regionValue4480;

        region1716: {
        int regionValue4436;
        int regionValue4435;
        java.lang.Object regionValue4434;
        int regionValue4433;
        int regionValue4432;
        java.lang.Object regionValue4431;
        int regionValue4428;

        region1713: {
        int regionValue4411;
        int regionValue4408;
        int regionValue4407;
        java.lang.Object regionValue4406;
        int regionValue4403;
        int regionValue4410;
        java.lang.Object regionValue4409;

        region1709: {
        java.lang.Object regionValue4381;
        int regionValue4385;
        int regionValue4383;
        int regionValue4382;
        int regionValue4378;
        int arrayValue4386;
        java.lang.Object regionValue4384;

        region1703: {
        int length4361;

        length4361 = java.lang.reflect.Array.getLength(value601);
        if (regionValue4360 >= length4361) {
            regionValue3037 = regionValue4353;
            regionValue3040 = regionValue4356;
            regionValue3041 = regionValue4357;
            regionValue3042 = regionValue4358;
            break region1951;
        } else {
            regionValue4378 = regionValue4353;
            regionValue4381 = regionValue4356;
            regionValue4382 = regionValue4357;
            regionValue4383 = regionValue4358;
            regionValue4384 = regionValue4359;
            regionValue4385 = regionValue4360;
            break region1703;
        }
        }
        arrayValue4386 = (regionValue4381 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue4381)[regionValue4385] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue4381)[regionValue4385]);
        if (value51 != null) {
            regionValue648 = regionValue4378;
            regionValue651 = regionValue4381;
            regionValue652 = regionValue4382;
            regionValue653 = regionValue4383;
            regionValue654 = arrayValue4386;
            continue loop267;
        } else {
            regionValue4403 = regionValue4378;
            regionValue4406 = regionValue4381;
            regionValue4407 = regionValue4382;
            regionValue4408 = regionValue4383;
            regionValue4409 = regionValue4384;
            regionValue4410 = regionValue4385;
            regionValue4411 = arrayValue4386;
            break region1709;
        }
        }
        if (a0 <= 0) {
            regionValue703 = regionValue4403;
            regionValue706 = regionValue4406;
            regionValue707 = regionValue4407;
            regionValue708 = regionValue4408;
            regionValue709 = regionValue4411;
            continue loop282;
        } else {
            regionValue4428 = regionValue4403;
            regionValue4431 = regionValue4406;
            regionValue4432 = regionValue4407;
            regionValue4433 = regionValue4408;
            regionValue4434 = regionValue4409;
            regionValue4435 = regionValue4410;
            regionValue4436 = regionValue4411;
            break region1713;
        }
        }
        if (a2 >= 0) {
            regionValue4454 = regionValue4428;
            regionValue4457 = regionValue4431;
            regionValue4458 = regionValue4432;
            regionValue4459 = regionValue4433;
            regionValue4460 = regionValue4434;
            regionValue4461 = regionValue4435;
            regionValue4462 = regionValue4436;
            break region1739;
        } else {
            regionValue4480 = regionValue4428;
            regionValue4483 = regionValue4431;
            regionValue4484 = regionValue4432;
            regionValue4485 = regionValue4433;
            regionValue4486 = regionValue4434;
            regionValue4487 = regionValue4435;
            regionValue4488 = regionValue4436;
            break region1716;
        }
        }
        if (value51 != null) {
            regionValue4506 = regionValue4480;
            regionValue4509 = regionValue4483;
            regionValue4510 = regionValue4484;
            regionValue4511 = regionValue4485;
            regionValue4512 = regionValue4486;
            regionValue4513 = regionValue4487;
            regionValue4514 = regionValue4488;
            break region1737;
        } else {
            regionValue4531 = regionValue4480;
            regionValue4534 = regionValue4483;
            regionValue4535 = regionValue4484;
            regionValue4536 = regionValue4485;
            regionValue4537 = regionValue4486;
            regionValue4538 = regionValue4487;
            regionValue4539 = regionValue4488;
            break region1718;
        }
        }
        regionValue4556 = regionValue4531;
        regionValue4559 = regionValue4534;
        regionValue4560 = regionValue4535;
        regionValue4561 = regionValue4536;
        regionValue4562 = regionValue4537;
        regionValue4563 = regionValue4538;
        regionValue4564 = regionValue4539;
        break region1720;
        }
        if (regionValue4564 != 0) {
            regionValue4581 = regionValue4556;
            regionValue4584 = regionValue4559;
            regionValue4585 = regionValue4560;
            regionValue4586 = regionValue4561;
            regionValue4587 = regionValue4562;
            regionValue4588 = regionValue4563;
            break region1724;
        } else {
            regionValue4605 = regionValue4556;
            regionValue4608 = regionValue4559;
            regionValue4609 = regionValue4560;
            regionValue4610 = regionValue4561;
            regionValue4611 = regionValue4562;
            regionValue4612 = regionValue4563;
            break region1722;
        }
        }
        regionValue4629 = regionValue4605;
        regionValue4632 = regionValue4608;
        regionValue4633 = regionValue4609;
        regionValue4634 = regionValue4610;
        regionValue4635 = regionValue4611;
        regionValue4636 = regionValue4612;
        break region1941;
        }
        value4639 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value4640 = recovery$indy$flow$813(value4639, computed37);
        regionValue4506 = regionValue4581;
        regionValue4509 = regionValue4584;
        regionValue4510 = regionValue4585;
        regionValue4511 = regionValue4586;
        regionValue4512 = regionValue4587;
        regionValue4513 = regionValue4588;
        regionValue4514 = (int) ((value4640 ? 1 : 0));
        break region1737;
        }
        regionValue4454 = regionValue4506;
        regionValue4457 = regionValue4509;
        regionValue4458 = regionValue4510;
        regionValue4459 = regionValue4511;
        regionValue4460 = regionValue4512;
        regionValue4461 = regionValue4513;
        regionValue4462 = regionValue4514;
        break region1739;
        }
        if (value51 != null) {
            regionValue4641 = regionValue4462;
            break region852;
        } else {
            regionValue4658 = regionValue4454;
            regionValue4661 = regionValue4457;
            regionValue4662 = regionValue4458;
            regionValue4663 = regionValue4459;
            regionValue4664 = regionValue4460;
            regionValue4665 = regionValue4461;
            regionValue4666 = regionValue4462;
            break region1741;
        }
        }
        if (regionValue4666 == 0) {
            regionValue4683 = regionValue4658;
            regionValue4686 = regionValue4661;
            regionValue4687 = regionValue4662;
            regionValue4688 = regionValue4663;
            regionValue4689 = regionValue4664;
            regionValue4690 = regionValue4665;
            break region1743;
        } else {
            break region851;
        }
        }
        value4691 = null;
        value4692 = 0;
        value4693 = 0;
        regionValue4710 = regionValue4683;
        regionValue4713 = regionValue4686;
        regionValue4714 = regionValue4687;
        regionValue4715 = regionValue4688;
        regionValue4716 = regionValue4689;
        regionValue4717 = regionValue4690;
        regionValue4718 = value4691;
        regionValue4719 = value4692;
        regionValue4720 = value4693;
        break region1750;
        }
        loop1750: while (true) {
        int regionValue4862;
        int regionValue4861;
        java.lang.Object regionValue4860;
        int regionValue4859;
        java.lang.Object regionValue4858;
        int regionValue4857;
        int regionValue4856;
        java.lang.Object regionValue4855;
        int regionValue4852;

        region1809: {
        int regionValue5003;
        int regionValue5002;
        java.lang.Object regionValue5001;
        int regionValue5000;
        java.lang.Object regionValue4999;
        int regionValue4998;
        int regionValue4997;
        java.lang.Object regionValue4996;
        int regionValue4993;
        int incremented5145;

        region1807: {
        int regionValue5110;
        int regionValue5113;
        java.lang.Object regionValue5109;
        int regionValue5108;
        int regionValue5107;
        java.lang.Object regionValue5106;
        int regionValue5103;
        boolean value5118;
        java.lang.Object value5116;
        java.lang.Object regionValue5115;
        java.lang.Object regionValue5114;
        int regionValue5112;
        java.lang.Object regionValue5111;
        java.lang.Object arrayValue5117;

        region1790: {
        java.lang.Object regionValue5086;
        java.lang.Object regionValue5085;
        int regionValue5084;
        int regionValue5083;
        java.lang.Object regionValue5082;
        int regionValue5081;
        java.lang.Object regionValue5080;
        int regionValue5079;
        int regionValue5078;
        java.lang.Object regionValue5077;
        int regionValue5074;

        region1788: {
        java.lang.Object regionValue5031;
        int regionValue5030;
        int regionValue5027;
        java.lang.Object regionValue5026;
        int regionValue5025;
        int regionValue5024;
        java.lang.Object regionValue5023;
        int regionValue5020;
        int regionValue5029;
        java.lang.Object regionValue5028;

        region1784: {
        int regionValue4974;
        int regionValue4973;
        java.lang.Object regionValue4972;
        int regionValue4971;
        java.lang.Object regionValue4970;
        int regionValue4969;
        int regionValue4968;
        java.lang.Object regionValue4967;
        int regionValue4964;
        java.lang.Object regionValue4976;
        java.lang.Object regionValue4975;

        region1782: {
        java.lang.Object regionValue4947;
        java.lang.Object regionValue4946;
        int regionValue4945;
        int regionValue4944;
        java.lang.Object regionValue4943;
        int regionValue4942;
        java.lang.Object regionValue4941;
        int regionValue4940;
        int regionValue4939;
        java.lang.Object regionValue4938;
        int regionValue4935;

        region1780: {
        java.lang.Object regionValue4918;
        java.lang.Object regionValue4913;
        int regionValue4912;
        int regionValue4911;
        java.lang.Object regionValue4910;
        int regionValue4907;
        int regionValue4917;
        int regionValue4916;
        java.lang.Object regionValue4915;
        int regionValue4914;

        region1776: {
        java.lang.Object regionValue4890;
        int regionValue4889;
        int regionValue4888;
        java.lang.Object regionValue4887;
        int regionValue4886;
        java.lang.Object regionValue4885;
        int regionValue4884;
        int regionValue4883;
        java.lang.Object regionValue4882;
        int regionValue4879;

        region1774: {
        int regionValue4833;
        int regionValue4832;
        java.lang.Object regionValue4831;
        int regionValue4830;
        java.lang.Object regionValue4829;
        int regionValue4828;
        int regionValue4827;
        java.lang.Object regionValue4826;
        int regionValue4823;
        java.lang.Object regionValue4834;

        region1772: {
        int regionValue4773;
        int regionValue4770;
        java.lang.Object regionValue4769;
        int regionValue4768;
        int regionValue4767;
        java.lang.Object regionValue4766;
        int regionValue4763;
        java.lang.Object value4781;
        java.lang.Object value4780;
        java.lang.Object value4779;
        java.lang.Object value4778;
        java.lang.Object value4777;
        java.lang.Object value4776;
        java.lang.Object value4775;
        java.lang.Object value4774;
        int regionValue4772;
        java.lang.Object regionValue4771;

        region1754: {
        if (regionValue4720 >= 5) {
            regionValue4737 = regionValue4710;
            regionValue4740 = regionValue4713;
            regionValue4741 = regionValue4714;
            regionValue4742 = regionValue4715;
            regionValue4743 = regionValue4716;
            regionValue4744 = regionValue4717;
            regionValue4745 = regionValue4718;
            regionValue4746 = regionValue4719;
            break region1811;
        } else {
            regionValue4763 = regionValue4710;
            regionValue4766 = regionValue4713;
            regionValue4767 = regionValue4714;
            regionValue4768 = regionValue4715;
            regionValue4769 = regionValue4716;
            regionValue4770 = regionValue4717;
            regionValue4771 = regionValue4718;
            regionValue4772 = regionValue4719;
            regionValue4773 = regionValue4720;
            break region1754;
        }
        }
        value4774 = recovery$indy$flow$814();
        value4775 = value4774;
        value4776 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4775))))));
        value4777 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4776)))).field_42P));
        value4778 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value4777)))).field_429));
        value4779 = recovery$indy$flow$818(value4778, regionValue4773);
        value4780 = recovery$indy$flow$819(value4779);
        value4781 = value4780;
        if (a0 <= 0) {
            regionValue4798 = regionValue4763;
            regionValue4801 = regionValue4766;
            regionValue4802 = regionValue4767;
            regionValue4803 = regionValue4768;
            regionValue4804 = regionValue4769;
            regionValue4805 = regionValue4770;
            break region1944;
        } else {
            regionValue4823 = regionValue4763;
            regionValue4826 = regionValue4766;
            regionValue4827 = regionValue4767;
            regionValue4828 = regionValue4768;
            regionValue4829 = regionValue4769;
            regionValue4830 = regionValue4770;
            regionValue4831 = regionValue4771;
            regionValue4832 = regionValue4772;
            regionValue4833 = regionValue4773;
            regionValue4834 = value4781;
            break region1772;
        }
        }
        if (value51 != null) {
            regionValue4852 = regionValue4823;
            regionValue4855 = regionValue4826;
            regionValue4856 = regionValue4827;
            regionValue4857 = regionValue4828;
            regionValue4858 = regionValue4829;
            regionValue4859 = regionValue4830;
            regionValue4860 = regionValue4831;
            regionValue4861 = regionValue4832;
            regionValue4862 = regionValue4833;
            break region1809;
        } else {
            regionValue4879 = regionValue4823;
            regionValue4882 = regionValue4826;
            regionValue4883 = regionValue4827;
            regionValue4884 = regionValue4828;
            regionValue4885 = regionValue4829;
            regionValue4886 = regionValue4830;
            regionValue4887 = regionValue4831;
            regionValue4888 = regionValue4832;
            regionValue4889 = regionValue4833;
            regionValue4890 = regionValue4834;
            break region1774;
        }
        }
        regionValue4907 = regionValue4879;
        regionValue4910 = regionValue4882;
        regionValue4911 = regionValue4883;
        regionValue4912 = regionValue4884;
        regionValue4913 = regionValue4885;
        regionValue4914 = regionValue4886;
        regionValue4915 = regionValue4887;
        regionValue4916 = regionValue4888;
        regionValue4917 = regionValue4889;
        regionValue4918 = regionValue4890;
        break region1776;
        }
        if (value51 != null) {
            regionValue956 = regionValue4907;
            regionValue959 = regionValue4910;
            regionValue960 = regionValue4911;
            regionValue961 = regionValue4912;
            regionValue962 = regionValue4913;
            regionValue963 = regionValue4918;
            continue loop1160;
        } else {
            regionValue4935 = regionValue4907;
            regionValue4938 = regionValue4910;
            regionValue4939 = regionValue4911;
            regionValue4940 = regionValue4912;
            regionValue4941 = regionValue4913;
            regionValue4942 = regionValue4914;
            regionValue4943 = regionValue4915;
            regionValue4944 = regionValue4916;
            regionValue4945 = regionValue4917;
            regionValue4946 = regionValue4918;
            regionValue4947 = regionValue4918;
            break region1780;
        }
        }
        regionValue4964 = regionValue4935;
        regionValue4967 = regionValue4938;
        regionValue4968 = regionValue4939;
        regionValue4969 = regionValue4940;
        regionValue4970 = regionValue4941;
        regionValue4971 = regionValue4942;
        regionValue4972 = regionValue4943;
        regionValue4973 = regionValue4944;
        regionValue4974 = regionValue4945;
        regionValue4975 = regionValue4946;
        regionValue4976 = regionValue4947;
        break region1782;
        }
        if (regionValue4976 == null) {
            regionValue4993 = regionValue4964;
            regionValue4996 = regionValue4967;
            regionValue4997 = regionValue4968;
            regionValue4998 = regionValue4969;
            regionValue4999 = regionValue4970;
            regionValue5000 = regionValue4971;
            regionValue5001 = regionValue4972;
            regionValue5002 = regionValue4973;
            regionValue5003 = regionValue4974;
            break region1807;
        } else {
            regionValue5020 = regionValue4964;
            regionValue5023 = regionValue4967;
            regionValue5024 = regionValue4968;
            regionValue5025 = regionValue4969;
            regionValue5026 = regionValue4970;
            regionValue5027 = regionValue4971;
            regionValue5028 = regionValue4972;
            regionValue5029 = regionValue4973;
            regionValue5030 = regionValue4974;
            regionValue5031 = regionValue4975;
            break region1784;
        }
        }
        if (value51 != null) {
            regionValue5048 = regionValue5020;
            regionValue5051 = regionValue5023;
            regionValue5052 = regionValue5024;
            regionValue5053 = regionValue5025;
            regionValue5054 = regionValue5026;
            regionValue5055 = regionValue5027;
            regionValue5056 = regionValue5030;
            regionValue5057 = regionValue5031;
            break region1802;
        } else {
            regionValue5074 = regionValue5020;
            regionValue5077 = regionValue5023;
            regionValue5078 = regionValue5024;
            regionValue5079 = regionValue5025;
            regionValue5080 = regionValue5026;
            regionValue5081 = regionValue5027;
            regionValue5082 = regionValue5028;
            regionValue5083 = regionValue5029;
            regionValue5084 = regionValue5030;
            regionValue5085 = regionValue5031;
            regionValue5086 = regionValue5031;
            break region1788;
        }
        }
        regionValue5103 = regionValue5074;
        regionValue5106 = regionValue5077;
        regionValue5107 = regionValue5078;
        regionValue5108 = regionValue5079;
        regionValue5109 = regionValue5080;
        regionValue5110 = regionValue5081;
        regionValue5111 = regionValue5082;
        regionValue5112 = regionValue5083;
        regionValue5113 = regionValue5084;
        regionValue5114 = regionValue5085;
        regionValue5115 = regionValue5086;
        break region1790;
        }
        value5116 = recovery$indy$flow$820(regionValue5115);
        arrayValue5117 = ((java.lang.Object[]) value601)[regionValue5110];
        value5118 = recovery$indy$flow$821(value5116, arrayValue5117);
        if ((int) ((value5118 ? 1 : 0)) == 0) {
            regionValue4993 = regionValue5103;
            regionValue4996 = regionValue5106;
            regionValue4997 = regionValue5107;
            regionValue4998 = regionValue5108;
            regionValue4999 = regionValue5109;
            regionValue5000 = regionValue5110;
            regionValue5001 = regionValue5111;
            regionValue5002 = regionValue5112;
            regionValue5003 = regionValue5113;
            break region1807;
        } else {
            regionValue5135 = regionValue5103;
            regionValue5138 = regionValue5106;
            regionValue5139 = regionValue5107;
            regionValue5140 = regionValue5108;
            regionValue5141 = regionValue5109;
            regionValue5142 = regionValue5110;
            regionValue5143 = regionValue5113;
            regionValue5144 = regionValue5114;
            break region1797;
        }
        }
        incremented5145 = regionValue5003 + (1);
        regionValue4852 = regionValue4993;
        regionValue4855 = regionValue4996;
        regionValue4856 = regionValue4997;
        regionValue4857 = regionValue4998;
        regionValue4858 = regionValue4999;
        regionValue4859 = regionValue5000;
        regionValue4860 = regionValue5001;
        regionValue4861 = regionValue5002;
        regionValue4862 = incremented5145;
        break region1809;
        }
        regionValue4710 = regionValue4852;
        regionValue4713 = regionValue4855;
        regionValue4714 = regionValue4856;
        regionValue4715 = regionValue4857;
        regionValue4716 = regionValue4858;
        regionValue4717 = regionValue4859;
        regionValue4718 = regionValue4860;
        regionValue4719 = regionValue4861;
        regionValue4720 = regionValue4862;
        continue loop1750;
        }
        }
        regionValue5162 = regionValue5135;
        regionValue5165 = regionValue5138;
        regionValue5166 = regionValue5139;
        regionValue5167 = regionValue5140;
        regionValue5168 = regionValue5141;
        regionValue5169 = regionValue5142;
        regionValue5170 = regionValue5143;
        regionValue5171 = regionValue5144;
        break region1799;
        }
        regionValue5048 = regionValue5162;
        regionValue5051 = regionValue5165;
        regionValue5052 = regionValue5166;
        regionValue5053 = regionValue5167;
        regionValue5054 = regionValue5168;
        regionValue5055 = regionValue5169;
        regionValue5056 = regionValue5170;
        regionValue5057 = regionValue5171;
        break region1802;
        }
        value5172 = regionValue5057;
        value5173 = regionValue5056;
        regionValue4737 = regionValue5048;
        regionValue4740 = regionValue5051;
        regionValue4741 = regionValue5052;
        regionValue4742 = regionValue5053;
        regionValue4743 = regionValue5054;
        regionValue4744 = regionValue5055;
        regionValue4745 = value5172;
        regionValue4746 = value5173;
        break region1811;
        }
        value5174 = 9;
        regionValue5191 = regionValue4737;
        regionValue5194 = regionValue4740;
        regionValue5195 = regionValue4741;
        regionValue5196 = regionValue4742;
        regionValue5197 = regionValue4743;
        regionValue5198 = regionValue4744;
        regionValue5199 = regionValue4745;
        regionValue5200 = regionValue4746;
        regionValue5201 = value5174;
        break region1814;
        }
        loop1814: while (true) {
        int regionValue5267;
        java.lang.Object regionValue5266;
        int regionValue5265;
        int regionValue5264;
        java.lang.Object regionValue5263;
        int regionValue5260;
        int regionValue5270;
        int regionValue5269;
        java.lang.Object regionValue5268;

        region1939: {
        int regionValue5327;
        int regionValue5326;
        java.lang.Object regionValue5325;
        int regionValue5324;
        java.lang.Object regionValue5323;
        int regionValue5322;
        int regionValue5321;
        java.lang.Object regionValue5320;
        int regionValue5317;

        region1937: {
        int regionValue5468;
        int regionValue5467;
        java.lang.Object regionValue5466;
        int regionValue5465;
        java.lang.Object regionValue5464;
        int regionValue5463;
        int regionValue5462;
        java.lang.Object regionValue5461;
        int regionValue5458;
        int incremented6013;

        region1935: {
        int regionValue6012;
        int regionValue6011;
        int regionValue6010;
        java.lang.Object regionValue6009;
        int regionValue6008;
        java.lang.Object regionValue6007;
        int regionValue6006;
        java.lang.Object regionValue6005;
        int regionValue6002;

        region1933: {
        int regionValue5984;
        int regionValue5980;
        java.lang.Object regionValue5979;
        int regionValue5978;
        java.lang.Object regionValue5977;
        int regionValue5974;
        int regionValue5983;
        int regionValue5982;
        java.lang.Object regionValue5981;

        region1931: {
        int regionValue5864;
        java.lang.Object regionValue5863;
        int regionValue5862;
        java.lang.Object regionValue5861;
        int regionValue5858;
        int value5932;
        int regionValue5868;
        int regionValue5867;
        int regionValue5866;
        java.lang.Object regionValue5865;

        region1926: {
        int regionValue5607;
        int regionValue5608;
        java.lang.Object regionValue5606;
        int regionValue5605;
        java.lang.Object regionValue5604;
        java.lang.Object regionValue5603;
        int regionValue5600;
        int value5931;
        java.lang.Object value5930;
        int value5928;
        int value5927;
        int value5925;
        short converted5924;
        short converted5923;

        region1899: {
        int regionValue5922;
        int regionValue5921;
        java.lang.Object regionValue5920;
        int regionValue5919;
        java.lang.Object regionValue5918;
        java.lang.Object regionValue5917;
        int regionValue5914;

        region1897: {
        java.lang.Object regionValue5893;
        int regionValue5895;
        int regionValue5894;
        int regionValue5892;
        java.lang.Object regionValue5891;
        java.lang.Object regionValue5888;
        int regionValue5885;
        int value5897;
        int regionValue5896;
        int regionValue5890;
        int regionValue5889;

        region1893: {
        int regionValue5695;
        int regionValue5694;
        int regionValue5693;
        java.lang.Object regionValue5692;
        int regionValue5691;
        java.lang.Object regionValue5690;
        int regionValue5688;
        java.lang.Object regionValue5687;
        int regionValue5684;
        int regionValue5689;

        region1891: {
        int regionValue5754;
        int regionValue5753;
        int regionValue5752;
        java.lang.Object regionValue5751;
        int regionValue5750;
        java.lang.Object regionValue5749;
        int regionValue5748;
        int regionValue5747;
        java.lang.Object regionValue5746;
        int regionValue5743;

        region1889: {
        int value5841;
        java.lang.Object regionValue5840;
        int regionValue5839;
        int regionValue5838;
        java.lang.Object regionValue5837;
        int regionValue5836;
        java.lang.Object regionValue5835;
        int regionValue5834;
        int regionValue5833;
        java.lang.Object regionValue5832;
        int regionValue5829;

        region1885: {
        int regionValue5810;
        int regionValue5809;
        java.lang.Object regionValue5808;
        int regionValue5807;
        java.lang.Object regionValue5806;
        int regionValue5805;
        int regionValue5804;
        java.lang.Object regionValue5803;
        int regionValue5800;
        int regionValue5812;
        java.lang.Object regionValue5811;

        region1883: {
        int regionValue5783;
        java.lang.Object regionValue5782;
        int regionValue5781;
        int regionValue5780;
        java.lang.Object regionValue5779;
        int regionValue5778;
        java.lang.Object regionValue5777;
        int regionValue5776;
        int regionValue5775;
        java.lang.Object regionValue5774;
        int regionValue5771;

        region1881: {
        int regionValue5725;
        int regionValue5723;
        int regionValue5722;
        java.lang.Object regionValue5721;
        int regionValue5720;
        java.lang.Object regionValue5719;
        int regionValue5718;
        int regionValue5717;
        java.lang.Object regionValue5716;
        int regionValue5713;
        java.lang.Object regionValue5724;

        region1879: {
        java.lang.Object regionValue5521;
        int regionValue5523;
        int regionValue5522;
        int regionValue5520;
        java.lang.Object regionValue5519;
        int regionValue5518;
        int regionValue5517;
        java.lang.Object regionValue5516;
        int regionValue5513;
        boolean value5667;
        java.lang.Object regionValue5525;
        java.lang.Object regionValue5524;
        java.lang.Object value5666;
        java.lang.Object value5665;

        region1871: {
        java.lang.Object regionValue5664;
        int regionValue5663;
        int regionValue5662;
        java.lang.Object regionValue5661;
        int regionValue5660;
        java.lang.Object regionValue5659;
        int regionValue5658;
        int regionValue5657;
        java.lang.Object regionValue5656;
        int regionValue5653;

        region1869: {
        java.lang.Object regionValue5636;
        int regionValue5635;
        int regionValue5634;
        java.lang.Object regionValue5633;
        int regionValue5632;
        java.lang.Object regionValue5631;
        int regionValue5630;
        int regionValue5629;
        java.lang.Object regionValue5628;
        int regionValue5625;

        region1867: {
        int regionValue5581;
        int regionValue5580;
        java.lang.Object regionValue5579;
        int regionValue5578;
        java.lang.Object regionValue5577;
        java.lang.Object regionValue5574;
        int regionValue5571;
        java.lang.Object regionValue5583;
        java.lang.Object regionValue5582;
        int regionValue5576;
        int regionValue5575;

        region1865: {
        java.lang.Object regionValue5554;
        java.lang.Object regionValue5553;
        int regionValue5552;
        int regionValue5551;
        java.lang.Object regionValue5550;
        int regionValue5549;
        java.lang.Object regionValue5548;
        int regionValue5547;
        int regionValue5546;
        java.lang.Object regionValue5545;
        int regionValue5542;

        region1863: {
        java.lang.Object regionValue5496;
        int regionValue5495;
        int regionValue5494;
        java.lang.Object regionValue5493;
        int regionValue5492;
        java.lang.Object regionValue5491;
        int regionValue5490;
        int regionValue5489;
        java.lang.Object regionValue5488;
        int regionValue5485;

        region1859: {
        int regionValue5439;
        int regionValue5438;
        java.lang.Object regionValue5437;
        int regionValue5436;
        java.lang.Object regionValue5435;
        int regionValue5434;
        int regionValue5433;
        java.lang.Object regionValue5432;
        int regionValue5429;
        java.lang.Object regionValue5441;
        java.lang.Object regionValue5440;

        region1857: {
        java.lang.Object regionValue5412;
        java.lang.Object regionValue5411;
        int regionValue5410;
        int regionValue5409;
        java.lang.Object regionValue5408;
        int regionValue5407;
        java.lang.Object regionValue5406;
        int regionValue5405;
        int regionValue5404;
        java.lang.Object regionValue5403;
        int regionValue5400;

        region1855: {
        java.lang.Object regionValue5380;
        java.lang.Object regionValue5378;
        int regionValue5377;
        int regionValue5376;
        java.lang.Object regionValue5375;
        int regionValue5372;
        java.lang.Object regionValue5383;
        int regionValue5382;
        int regionValue5381;
        int regionValue5379;

        region1851: {
        java.lang.Object regionValue5355;
        int regionValue5354;
        int regionValue5353;
        java.lang.Object regionValue5352;
        int regionValue5351;
        java.lang.Object regionValue5350;
        int regionValue5349;
        int regionValue5348;
        java.lang.Object regionValue5347;
        int regionValue5344;

        region1849: {
        int regionValue5298;
        int regionValue5297;
        java.lang.Object regionValue5296;
        int regionValue5295;
        java.lang.Object regionValue5294;
        int regionValue5293;
        int regionValue5292;
        java.lang.Object regionValue5291;
        int regionValue5288;
        java.lang.Object regionValue5299;

        region1847: {
        int regionValue5235;
        int regionValue5234;
        java.lang.Object regionValue5233;
        int regionValue5232;
        java.lang.Object regionValue5231;
        int regionValue5230;
        int regionValue5229;
        java.lang.Object regionValue5228;
        int regionValue5225;
        java.lang.Object value5243;
        java.lang.Object value5242;
        java.lang.Object value5241;
        java.lang.Object value5240;
        java.lang.Object value5239;
        java.lang.Object value5238;
        java.lang.Object value5237;
        java.lang.Object value5236;

        region1829: {
        int value5208;
        java.lang.Object value5207;
        java.lang.Object value5206;
        java.lang.Object value5205;
        java.lang.Object value5204;
        java.lang.Object value5203;
        java.lang.Object value5202;

        value5202 = recovery$indy$flow$822();
        value5203 = value5202;
        value5204 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5203))))));
        value5205 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5204)))).field_42P));
        value5206 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value5205)))).field_429));
        value5207 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value5206)))).field_46));
        value5208 = recovery$indy$flow$827(value5207);
        if (regionValue5201 >= value5208) {
            regionValue4629 = regionValue5191;
            regionValue4632 = regionValue5194;
            regionValue4633 = regionValue5195;
            regionValue4634 = regionValue5196;
            regionValue4635 = regionValue5197;
            regionValue4636 = regionValue5198;
            break region1941;
        } else {
            regionValue5225 = regionValue5191;
            regionValue5228 = regionValue5194;
            regionValue5229 = regionValue5195;
            regionValue5230 = regionValue5196;
            regionValue5231 = regionValue5197;
            regionValue5232 = regionValue5198;
            regionValue5233 = regionValue5199;
            regionValue5234 = regionValue5200;
            regionValue5235 = regionValue5201;
            break region1829;
        }
        }
        value5236 = recovery$indy$flow$828();
        value5237 = value5236;
        value5238 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5237))))));
        value5239 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5238)))).field_42P));
        value5240 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value5239)))).field_429));
        value5241 = recovery$indy$flow$832(value5240, regionValue5235);
        value5242 = recovery$indy$flow$833(value5241);
        value5243 = value5242;
        if (a1 < 0) {
            regionValue5260 = regionValue5225;
            regionValue5263 = regionValue5228;
            regionValue5264 = regionValue5229;
            regionValue5265 = regionValue5230;
            regionValue5266 = regionValue5231;
            regionValue5267 = regionValue5232;
            regionValue5268 = regionValue5233;
            regionValue5269 = regionValue5234;
            regionValue5270 = regionValue5235;
            break region1939;
        } else {
            regionValue5288 = regionValue5225;
            regionValue5291 = regionValue5228;
            regionValue5292 = regionValue5229;
            regionValue5293 = regionValue5230;
            regionValue5294 = regionValue5231;
            regionValue5295 = regionValue5232;
            regionValue5296 = regionValue5233;
            regionValue5297 = regionValue5234;
            regionValue5298 = regionValue5235;
            regionValue5299 = value5243;
            break region1847;
        }
        }
        if (value51 != null) {
            regionValue5317 = regionValue5288;
            regionValue5320 = regionValue5291;
            regionValue5321 = regionValue5292;
            regionValue5322 = regionValue5293;
            regionValue5323 = regionValue5294;
            regionValue5324 = regionValue5295;
            regionValue5325 = regionValue5296;
            regionValue5326 = regionValue5297;
            regionValue5327 = regionValue5298;
            break region1937;
        } else {
            regionValue5344 = regionValue5288;
            regionValue5347 = regionValue5291;
            regionValue5348 = regionValue5292;
            regionValue5349 = regionValue5293;
            regionValue5350 = regionValue5294;
            regionValue5351 = regionValue5295;
            regionValue5352 = regionValue5296;
            regionValue5353 = regionValue5297;
            regionValue5354 = regionValue5298;
            regionValue5355 = regionValue5299;
            break region1849;
        }
        }
        regionValue5372 = regionValue5344;
        regionValue5375 = regionValue5347;
        regionValue5376 = regionValue5348;
        regionValue5377 = regionValue5349;
        regionValue5378 = regionValue5350;
        regionValue5379 = regionValue5351;
        regionValue5380 = regionValue5352;
        regionValue5381 = regionValue5353;
        regionValue5382 = regionValue5354;
        regionValue5383 = regionValue5355;
        break region1851;
        }
        if (value51 != null) {
            regionValue956 = regionValue5372;
            regionValue959 = regionValue5375;
            regionValue960 = regionValue5376;
            regionValue961 = regionValue5377;
            regionValue962 = regionValue5378;
            regionValue963 = regionValue5380;
            continue loop1160;
        } else {
            regionValue5400 = regionValue5372;
            regionValue5403 = regionValue5375;
            regionValue5404 = regionValue5376;
            regionValue5405 = regionValue5377;
            regionValue5406 = regionValue5378;
            regionValue5407 = regionValue5379;
            regionValue5408 = regionValue5380;
            regionValue5409 = regionValue5381;
            regionValue5410 = regionValue5382;
            regionValue5411 = regionValue5383;
            regionValue5412 = regionValue5380;
            break region1855;
        }
        }
        regionValue5429 = regionValue5400;
        regionValue5432 = regionValue5403;
        regionValue5433 = regionValue5404;
        regionValue5434 = regionValue5405;
        regionValue5435 = regionValue5406;
        regionValue5436 = regionValue5407;
        regionValue5437 = regionValue5408;
        regionValue5438 = regionValue5409;
        regionValue5439 = regionValue5410;
        regionValue5440 = regionValue5411;
        regionValue5441 = regionValue5412;
        break region1857;
        }
        if (regionValue5441 == null) {
            regionValue5458 = regionValue5429;
            regionValue5461 = regionValue5432;
            regionValue5462 = regionValue5433;
            regionValue5463 = regionValue5434;
            regionValue5464 = regionValue5435;
            regionValue5465 = regionValue5436;
            regionValue5466 = regionValue5437;
            regionValue5467 = regionValue5438;
            regionValue5468 = regionValue5439;
            break region1935;
        } else {
            regionValue5485 = regionValue5429;
            regionValue5488 = regionValue5432;
            regionValue5489 = regionValue5433;
            regionValue5490 = regionValue5434;
            regionValue5491 = regionValue5435;
            regionValue5492 = regionValue5436;
            regionValue5493 = regionValue5437;
            regionValue5494 = regionValue5438;
            regionValue5495 = regionValue5439;
            regionValue5496 = regionValue5440;
            break region1859;
        }
        }
        if (value51 != null) {
            regionValue5513 = regionValue5485;
            regionValue5516 = regionValue5488;
            regionValue5517 = regionValue5489;
            regionValue5518 = regionValue5490;
            regionValue5519 = regionValue5491;
            regionValue5520 = regionValue5492;
            regionValue5521 = regionValue5493;
            regionValue5522 = regionValue5494;
            regionValue5523 = regionValue5495;
            regionValue5524 = regionValue5496;
            regionValue5525 = regionValue5496;
            break region1871;
        } else {
            regionValue5542 = regionValue5485;
            regionValue5545 = regionValue5488;
            regionValue5546 = regionValue5489;
            regionValue5547 = regionValue5490;
            regionValue5548 = regionValue5491;
            regionValue5549 = regionValue5492;
            regionValue5550 = regionValue5493;
            regionValue5551 = regionValue5494;
            regionValue5552 = regionValue5495;
            regionValue5553 = regionValue5496;
            regionValue5554 = regionValue5496;
            break region1863;
        }
        }
        regionValue5571 = regionValue5542;
        regionValue5574 = regionValue5545;
        regionValue5575 = regionValue5546;
        regionValue5576 = regionValue5547;
        regionValue5577 = regionValue5548;
        regionValue5578 = regionValue5549;
        regionValue5579 = regionValue5550;
        regionValue5580 = regionValue5551;
        regionValue5581 = regionValue5552;
        regionValue5582 = regionValue5553;
        regionValue5583 = regionValue5554;
        break region1865;
        }
        if (regionValue5583 == null) {
            regionValue5600 = regionValue5571;
            regionValue5603 = regionValue5574;
            regionValue5604 = regionValue5577;
            regionValue5605 = regionValue5578;
            regionValue5606 = regionValue5579;
            regionValue5607 = regionValue5580;
            regionValue5608 = regionValue5581;
            break region1899;
        } else {
            regionValue5625 = regionValue5571;
            regionValue5628 = regionValue5574;
            regionValue5629 = regionValue5575;
            regionValue5630 = regionValue5576;
            regionValue5631 = regionValue5577;
            regionValue5632 = regionValue5578;
            regionValue5633 = regionValue5579;
            regionValue5634 = regionValue5580;
            regionValue5635 = regionValue5581;
            regionValue5636 = regionValue5582;
            break region1867;
        }
        }
        regionValue5653 = regionValue5625;
        regionValue5656 = regionValue5628;
        regionValue5657 = regionValue5629;
        regionValue5658 = regionValue5630;
        regionValue5659 = regionValue5631;
        regionValue5660 = regionValue5632;
        regionValue5661 = regionValue5633;
        regionValue5662 = regionValue5634;
        regionValue5663 = regionValue5635;
        regionValue5664 = regionValue5636;
        break region1869;
        }
        regionValue5513 = regionValue5653;
        regionValue5516 = regionValue5656;
        regionValue5517 = regionValue5657;
        regionValue5518 = regionValue5658;
        regionValue5519 = regionValue5659;
        regionValue5520 = regionValue5660;
        regionValue5521 = regionValue5661;
        regionValue5522 = regionValue5662;
        regionValue5523 = regionValue5663;
        regionValue5524 = regionValue5664;
        regionValue5525 = regionValue5664;
        break region1871;
        }
        value5665 = recovery$indy$flow$834(regionValue5525);
        value5666 = recovery$indy$flow$835(regionValue5521);
        value5667 = recovery$indy$flow$836(value5665, value5666);
        if (a0 <= 0) {
            regionValue5684 = regionValue5513;
            regionValue5687 = regionValue5516;
            regionValue5688 = regionValue5517;
            regionValue5689 = regionValue5518;
            regionValue5690 = regionValue5519;
            regionValue5691 = regionValue5520;
            regionValue5692 = regionValue5521;
            regionValue5693 = regionValue5522;
            regionValue5694 = regionValue5523;
            regionValue5695 = (int) ((value5667 ? 1 : 0));
            break region1891;
        } else {
            regionValue5713 = regionValue5513;
            regionValue5716 = regionValue5516;
            regionValue5717 = regionValue5517;
            regionValue5718 = regionValue5518;
            regionValue5719 = regionValue5519;
            regionValue5720 = regionValue5520;
            regionValue5721 = regionValue5521;
            regionValue5722 = regionValue5522;
            regionValue5723 = regionValue5523;
            regionValue5724 = regionValue5524;
            regionValue5725 = (int) ((value5667 ? 1 : 0));
            break region1879;
        }
        }
        if (value51 != null) {
            regionValue5743 = regionValue5713;
            regionValue5746 = regionValue5716;
            regionValue5747 = regionValue5717;
            regionValue5748 = regionValue5718;
            regionValue5749 = regionValue5719;
            regionValue5750 = regionValue5720;
            regionValue5751 = regionValue5721;
            regionValue5752 = regionValue5722;
            regionValue5753 = regionValue5723;
            regionValue5754 = regionValue5725;
            break region1889;
        } else {
            regionValue5771 = regionValue5713;
            regionValue5774 = regionValue5716;
            regionValue5775 = regionValue5717;
            regionValue5776 = regionValue5718;
            regionValue5777 = regionValue5719;
            regionValue5778 = regionValue5720;
            regionValue5779 = regionValue5721;
            regionValue5780 = regionValue5722;
            regionValue5781 = regionValue5723;
            regionValue5782 = regionValue5724;
            regionValue5783 = regionValue5725;
            break region1881;
        }
        }
        regionValue5800 = regionValue5771;
        regionValue5803 = regionValue5774;
        regionValue5804 = regionValue5775;
        regionValue5805 = regionValue5776;
        regionValue5806 = regionValue5777;
        regionValue5807 = regionValue5778;
        regionValue5808 = regionValue5779;
        regionValue5809 = regionValue5780;
        regionValue5810 = regionValue5781;
        regionValue5811 = regionValue5782;
        regionValue5812 = regionValue5783;
        break region1883;
        }
        if (regionValue5812 == 0) {
            regionValue5458 = regionValue5800;
            regionValue5461 = regionValue5803;
            regionValue5462 = regionValue5804;
            regionValue5463 = regionValue5805;
            regionValue5464 = regionValue5806;
            regionValue5465 = regionValue5807;
            regionValue5466 = regionValue5808;
            regionValue5467 = regionValue5809;
            regionValue5468 = regionValue5810;
            break region1935;
        } else {
            regionValue5829 = regionValue5800;
            regionValue5832 = regionValue5803;
            regionValue5833 = regionValue5804;
            regionValue5834 = regionValue5805;
            regionValue5835 = regionValue5806;
            regionValue5836 = regionValue5807;
            regionValue5837 = regionValue5808;
            regionValue5838 = regionValue5809;
            regionValue5839 = regionValue5810;
            regionValue5840 = regionValue5811;
            break region1885;
        }
        }
        value5841 = recovery$indy$flow$837(regionValue5840);
        regionValue5743 = regionValue5829;
        regionValue5746 = regionValue5832;
        regionValue5747 = regionValue5833;
        regionValue5748 = regionValue5834;
        regionValue5749 = regionValue5835;
        regionValue5750 = regionValue5836;
        regionValue5751 = regionValue5837;
        regionValue5752 = regionValue5838;
        regionValue5753 = regionValue5839;
        regionValue5754 = value5841;
        break region1889;
        }
        regionValue5684 = regionValue5743;
        regionValue5687 = regionValue5746;
        regionValue5688 = regionValue5747;
        regionValue5689 = regionValue5748;
        regionValue5690 = regionValue5749;
        regionValue5691 = regionValue5750;
        regionValue5692 = regionValue5751;
        regionValue5693 = regionValue5752;
        regionValue5694 = regionValue5753;
        regionValue5695 = regionValue5754;
        break region1891;
        }
        if (value51 != null) {
            regionValue5858 = regionValue5684;
            regionValue5861 = regionValue5687;
            regionValue5862 = regionValue5688;
            regionValue5863 = regionValue5690;
            regionValue5864 = regionValue5691;
            regionValue5865 = regionValue5692;
            regionValue5866 = regionValue5693;
            regionValue5867 = regionValue5694;
            regionValue5868 = regionValue5695;
            break region1926;
        } else {
            regionValue5885 = regionValue5684;
            regionValue5888 = regionValue5687;
            regionValue5889 = regionValue5688;
            regionValue5890 = regionValue5689;
            regionValue5891 = regionValue5690;
            regionValue5892 = regionValue5691;
            regionValue5893 = regionValue5692;
            regionValue5894 = regionValue5693;
            regionValue5895 = regionValue5694;
            regionValue5896 = regionValue5695;
            break region1893;
        }
        }
        value5897 = recovery$indy$flow$838(regionValue5893);
        if (regionValue5896 >= value5897) {
            regionValue5458 = regionValue5885;
            regionValue5461 = regionValue5888;
            regionValue5462 = regionValue5889;
            regionValue5463 = regionValue5890;
            regionValue5464 = regionValue5891;
            regionValue5465 = regionValue5892;
            regionValue5466 = regionValue5893;
            regionValue5467 = regionValue5894;
            regionValue5468 = regionValue5895;
            break region1935;
        } else {
            regionValue5914 = regionValue5885;
            regionValue5917 = regionValue5888;
            regionValue5918 = regionValue5891;
            regionValue5919 = regionValue5892;
            regionValue5920 = regionValue5893;
            regionValue5921 = regionValue5894;
            regionValue5922 = regionValue5895;
            break region1897;
        }
        }
        regionValue5600 = regionValue5914;
        regionValue5603 = regionValue5917;
        regionValue5604 = regionValue5918;
        regionValue5605 = regionValue5919;
        regionValue5606 = regionValue5920;
        regionValue5607 = regionValue5921;
        regionValue5608 = regionValue5922;
        break region1899;
        }
        converted5923 = (short) (converted27);
        converted5924 = (short) (converted35);
        value5925 = (int) (converted5924);
        value5927 = (int) (converted5923);
        value5928 = regionValue5607;
        value5930 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        recovery$indy$flow$840(value5930, value5928, (short) (value5927), converted31, (short) (value5925));
        value5931 = 1;
        regionValue5858 = regionValue5600;
        regionValue5861 = regionValue5603;
        regionValue5862 = value5931;
        regionValue5863 = regionValue5604;
        regionValue5864 = regionValue5605;
        regionValue5865 = regionValue5606;
        regionValue5866 = regionValue5607;
        regionValue5867 = regionValue5608;
        regionValue5868 = 0;
        break region1926;
        }
        value5932 = regionValue5868;
        if (a1 < 0) {
            regionValue5949 = regionValue5858;
            regionValue5952 = regionValue5861;
            regionValue5953 = regionValue5862;
            regionValue5954 = regionValue5863;
            regionValue5955 = regionValue5864;
            regionValue5956 = value5932;
            break region1947;
        } else {
            regionValue5974 = regionValue5858;
            regionValue5977 = regionValue5861;
            regionValue5978 = regionValue5862;
            regionValue5979 = regionValue5863;
            regionValue5980 = regionValue5864;
            regionValue5981 = regionValue5865;
            regionValue5982 = regionValue5866;
            regionValue5983 = regionValue5867;
            regionValue5984 = value5932;
            break region1931;
        }
        }
        if (value51 == null) {
            regionValue4629 = regionValue5974;
            regionValue4632 = regionValue5977;
            regionValue4633 = regionValue5978;
            regionValue4634 = regionValue5984;
            regionValue4635 = regionValue5979;
            regionValue4636 = regionValue5980;
            break region1941;
        } else {
            regionValue6002 = regionValue5974;
            regionValue6005 = regionValue5977;
            regionValue6006 = regionValue5978;
            regionValue6007 = regionValue5979;
            regionValue6008 = regionValue5980;
            regionValue6009 = regionValue5981;
            regionValue6010 = regionValue5982;
            regionValue6011 = regionValue5983;
            regionValue6012 = regionValue5984;
            break region1933;
        }
        }
        regionValue5458 = regionValue6002;
        regionValue5461 = regionValue6005;
        regionValue5462 = regionValue6006;
        regionValue5463 = regionValue6012;
        regionValue5464 = regionValue6007;
        regionValue5465 = regionValue6008;
        regionValue5466 = regionValue6009;
        regionValue5467 = regionValue6010;
        regionValue5468 = regionValue6011;
        break region1935;
        }
        incremented6013 = regionValue5468 + (1);
        regionValue5317 = regionValue5458;
        regionValue5320 = regionValue5461;
        regionValue5321 = regionValue5462;
        regionValue5322 = regionValue5463;
        regionValue5323 = regionValue5464;
        regionValue5324 = regionValue5465;
        regionValue5325 = regionValue5466;
        regionValue5326 = regionValue5467;
        regionValue5327 = incremented6013;
        break region1937;
        }
        regionValue5260 = regionValue5317;
        regionValue5263 = regionValue5320;
        regionValue5264 = regionValue5321;
        regionValue5265 = regionValue5322;
        regionValue5266 = regionValue5323;
        regionValue5267 = regionValue5324;
        regionValue5268 = regionValue5325;
        regionValue5269 = regionValue5326;
        regionValue5270 = regionValue5327;
        break region1939;
        }
        if (value51 == null) {
            regionValue5191 = regionValue5260;
            regionValue5194 = regionValue5263;
            regionValue5195 = regionValue5264;
            regionValue5196 = regionValue5265;
            regionValue5197 = regionValue5266;
            regionValue5198 = regionValue5267;
            regionValue5199 = regionValue5268;
            regionValue5200 = regionValue5269;
            regionValue5201 = regionValue5270;
            continue loop1814;
        } else {
            regionValue4629 = regionValue5260;
            regionValue4632 = regionValue5263;
            regionValue4633 = regionValue5264;
            regionValue4634 = regionValue5265;
            regionValue4635 = regionValue5266;
            regionValue4636 = regionValue5267;
            break region1941;
        }
        }
        }
        incremented6014 = regionValue4636 + (1);
        regionValue4798 = regionValue4629;
        regionValue4801 = regionValue4632;
        regionValue4802 = regionValue4633;
        regionValue4803 = regionValue4634;
        regionValue4804 = regionValue4635;
        regionValue4805 = incremented6014;
        break region1944;
        }
        if (a1 < 0) {
            regionValue3451 = regionValue4798;
            regionValue3454 = regionValue4801;
            regionValue3455 = regionValue4802;
            regionValue3456 = regionValue4803;
            break region1030;
        } else {
            regionValue5949 = regionValue4798;
            regionValue5952 = regionValue4801;
            regionValue5953 = regionValue4802;
            regionValue5954 = regionValue4804;
            regionValue5955 = regionValue4805;
            regionValue5956 = regionValue4803;
            break region1947;
        }
        }
        if (value51 == null) {
            regionValue4353 = regionValue5949;
            regionValue4356 = regionValue5952;
            regionValue4357 = regionValue5953;
            regionValue4358 = regionValue5956;
            regionValue4359 = regionValue5954;
            regionValue4360 = regionValue5955;
            continue loop1698;
        } else {
            regionValue6031 = regionValue5949;
            regionValue6034 = regionValue5952;
            regionValue6035 = regionValue5953;
            regionValue6036 = regionValue5956;
            break region1949;
        }
        }
        }
        }
        regionValue3037 = regionValue1051;
        regionValue3040 = regionValue1054;
        regionValue3041 = regionValue1055;
        regionValue3042 = regionValue1056;
        break region1951;
        }
        regionValue3037 = regionValue6031;
        regionValue3040 = regionValue6034;
        regionValue3041 = regionValue6035;
        regionValue3042 = regionValue6036;
        break region1951;
        }
        incremented6037 = regionValue3042 + (1);
        regionValue1430 = regionValue3037;
        regionValue1433 = regionValue3040;
        regionValue1434 = regionValue3041;
        regionValue1435 = incremented6037;
        break region1953;
        }
        regionValue4140 = regionValue1430;
        regionValue4143 = regionValue1433;
        regionValue4144 = regionValue1434;
        regionValue4145 = regionValue1435;
        break region1955;
        }
        if (a2 > 0) {
            regionValue927 = regionValue4144;
            regionValue928 = regionValue4145;
            regionValue929 = regionValue4143;
            regionValue930 = value51;
            break region344;
        } else {
            regionValue3451 = regionValue4140;
            regionValue3454 = regionValue4143;
            regionValue3455 = regionValue4144;
            regionValue3456 = regionValue4145;
            break region1030;
        }
        }
        loop344: while (true) {
        java.lang.Object regionValue9273;
        int regionValue9272;
        int regionValue9271;
        int regionValue9274;

        region1028: {
        int regionValue6587;
        java.lang.Object regionValue6586;
        int regionValue6585;
        int regionValue6584;

        region1027: {
        int regionValue8194;
        java.lang.Object regionValue8193;
        int regionValue8192;
        int regionValue8191;
        int incremented11165;

        region1026: {
        int regionValue11164;
        int regionValue11163;
        java.lang.Object regionValue11162;
        int regionValue11161;

        region1024: {
        int regionValue6208;
        java.lang.Object regionValue6207;
        int regionValue6206;
        int regionValue6205;

        region365: {
        java.lang.Object regionValue6115;
        java.lang.Object regionValue6114;
        int regionValue6113;
        java.lang.Object regionValue6112;
        int regionValue6111;
        int regionValue6110;

        region362: {
        java.lang.Object value6091;
        int regionValue6081;
        java.lang.Object value6090;
        java.lang.Object value6089;
        java.lang.Object value6088;
        java.lang.Object value6087;
        java.lang.Object value6086;
        java.lang.Object value6085;
        java.lang.Object value6084;
        int regionValue6083;
        java.lang.Object regionValue6082;
        int regionValue6080;

        region347: {
        int value6061;
        int regionValue6060;
        java.lang.Object regionValue6059;
        int regionValue6058;
        int regionValue6057;

        region346: {
        int arrayValue6038;

        arrayValue6038 = ((int[]) regionValue930)[0];
        regionValue6057 = regionValue927;
        regionValue6058 = regionValue928;
        regionValue6059 = regionValue929;
        regionValue6060 = arrayValue6038;
        break region346;
        }
        value6061 = regionValue6060;
        regionValue6080 = regionValue6057;
        regionValue6081 = regionValue6058;
        regionValue6082 = regionValue6059;
        regionValue6083 = value6061;
        break region347;
        }
        value6084 = recovery$indy$flow$764();
        value6085 = value6084;
        value6086 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6085))))));
        value6087 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6086)))).field_42P));
        value6088 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value6087)))).field_429));
        value6089 = recovery$indy$flow$768(value6088, regionValue6081);
        value6090 = recovery$indy$flow$769(value6089);
        value6091 = value6090;
        regionValue6110 = regionValue6080;
        regionValue6111 = regionValue6081;
        regionValue6112 = regionValue6082;
        regionValue6113 = regionValue6083;
        regionValue6114 = value6091;
        regionValue6115 = value6091;
        break region362;
        }
        loop362: while (true) {
        int regionValue9489;
        int regionValue9487;
        java.lang.Object regionValue9486;
        int regionValue9485;
        int regionValue9484;
        java.lang.Object regionValue9488;

        region817: {
        int regionValue9394;
        java.lang.Object regionValue9393;
        int regionValue9392;
        java.lang.Object regionValue9391;
        int regionValue9390;
        int regionValue9389;
        int value9465;

        region816: {
        java.lang.Object regionValue9464;
        int regionValue9463;
        java.lang.Object regionValue9462;
        int regionValue9461;
        int regionValue9460;

        region813: {
        java.lang.Object regionValue9441;
        int regionValue9440;
        java.lang.Object regionValue9439;
        int regionValue9438;
        int regionValue9437;

        region811: {
        int regionValue9416;
        java.lang.Object regionValue9415;
        int regionValue9414;
        int regionValue9413;
        int regionValue9418;
        java.lang.Object regionValue9417;

        region809: {
        int regionValue6739;
        java.lang.Object regionValue6738;
        int regionValue6737;
        java.lang.Object regionValue6736;
        int regionValue6735;
        int regionValue6734;

        region808: {
        int regionValue6635;
        java.lang.Object regionValue6634;
        int regionValue6633;
        java.lang.Object regionValue6632;
        int regionValue6631;
        int regionValue6630;

        region807: {
        int regionValue6680;
        java.lang.Object regionValue6683;
        int regionValue6682;
        java.lang.Object regionValue6681;
        int regionValue6679;

        region806: {
        java.lang.Object regionValue9370;
        int regionValue9369;
        java.lang.Object regionValue9368;
        int regionValue9367;
        int regionValue9366;

        region804: {
        int regionValue9345;
        java.lang.Object regionValue9344;
        int regionValue9343;
        int regionValue9342;
        java.lang.Object regionValue9346;

        region803: {
        java.lang.Object regionValue9322;
        int regionValue9321;
        java.lang.Object regionValue9320;
        int regionValue9319;
        int regionValue9318;

        region801: {
        int regionValue9297;
        java.lang.Object regionValue9296;
        int regionValue9295;
        int regionValue9294;
        java.lang.Object regionValue9298;

        region799: {
        int regionValue8690;
        java.lang.Object regionValue8689;
        int regionValue8688;
        int regionValue8687;
        java.lang.Object regionValue8691;

        region796: {
        int regionValue8668;
        java.lang.Object regionValue8666;
        int regionValue8665;
        java.lang.Object regionValue8664;
        int regionValue8663;
        int regionValue8662;
        java.lang.Object regionValue8667;

        region702: {
        java.lang.Object regionValue6896;
        java.lang.Object regionValue6895;
        int regionValue6894;
        java.lang.Object regionValue6893;
        int regionValue6892;
        int regionValue6891;
        int value8643;
        java.lang.Object value8642;
        java.lang.Object value8641;
        java.lang.Object value8640;

        region696: {
        java.lang.Object regionValue6969;
        int regionValue6968;
        java.lang.Object regionValue6967;
        int regionValue6966;
        int regionValue6965;
        java.lang.Object value8639;
        java.lang.Object value8638;
        java.lang.Object value8637;
        java.lang.Object value8636;
        java.lang.Object value8635;
        java.lang.Object value8634;

        region683: {
        int regionValue8633;
        java.lang.Object regionValue8632;
        int regionValue8631;
        java.lang.Object regionValue8630;
        int regionValue8629;

        region681: {
        int regionValue8609;
        int regionValue8607;
        java.lang.Object regionValue8606;
        int regionValue8605;
        java.lang.Object regionValue8608;

        region680: {
        int regionValue8531;
        java.lang.Object regionValue8530;
        int regionValue8529;
        int value8586;
        int regionValue8533;
        java.lang.Object regionValue8532;

        region676: {
        int value8585;
        java.lang.Object value8584;
        int value8582;
        int value8581;
        int value8579;
        java.lang.Object regionValue8576;
        int regionValue8575;
        java.lang.Object regionValue8574;
        short converted8578;
        short converted8577;

        region650: {
        int regionValue8555;
        java.lang.Object regionValue8554;
        int regionValue8553;
        java.lang.Object regionValue8552;

        region646: {
        int regionValue8387;
        java.lang.Object regionValue8386;
        int regionValue8385;
        java.lang.Object regionValue8384;
        int regionValue8383;

        region645: {
        int regionValue8436;
        java.lang.Object regionValue8435;
        int regionValue8434;
        java.lang.Object regionValue8433;
        int regionValue8432;

        region644: {
        boolean value8510;
        java.lang.Object value8509;
        java.lang.Object regionValue8506;
        int regionValue8505;
        java.lang.Object regionValue8504;
        int regionValue8503;

        region630: {
        int regionValue8482;
        java.lang.Object regionValue8481;
        int regionValue8479;
        int regionValue8484;
        java.lang.Object regionValue8483;
        int regionValue8480;

        region629: {
        int regionValue8460;
        java.lang.Object regionValue8459;
        int regionValue8458;
        java.lang.Object regionValue8457;
        int regionValue8456;
        int regionValue8455;

        region627: {
        int regionValue8412;
        java.lang.Object regionValue8411;
        int regionValue8410;
        java.lang.Object regionValue8409;
        int regionValue8407;
        int regionValue8408;

        region626: {
        int regionValue8242;
        java.lang.Object regionValue8241;
        int regionValue8240;
        java.lang.Object regionValue8239;
        int regionValue8237;
        int regionValue8238;

        region624: {
        int regionValue8292;
        java.lang.Object regionValue8291;
        int regionValue8290;
        java.lang.Object regionValue8289;
        int regionValue8288;
        int regionValue8287;

        region623: {
        java.lang.Object regionValue8361;
        java.lang.Object regionValue8363;
        int regionValue8362;
        int regionValue8360;
        int regionValue8359;
        int arrayValue8364;

        region618: {
        int regionValue8338;
        java.lang.Object regionValue8337;
        int regionValue8336;
        int regionValue8335;
        int regionValue8340;
        java.lang.Object regionValue8339;

        region617: {
        int regionValue8316;
        java.lang.Object regionValue8315;
        int regionValue8314;
        java.lang.Object regionValue8313;
        int regionValue8312;
        int regionValue8311;

        region615: {
        int regionValue8267;
        java.lang.Object regionValue8266;
        int regionValue8265;
        java.lang.Object regionValue8264;
        int regionValue8263;
        int regionValue8262;

        region614: {
        int regionValue8074;
        java.lang.Object regionValue8073;
        int regionValue8072;
        java.lang.Object regionValue8071;
        int regionValue8070;
        int regionValue8069;

        region612: {
        int regionValue8124;
        java.lang.Object regionValue8123;
        int regionValue8122;
        java.lang.Object regionValue8121;
        int regionValue8120;
        int regionValue8119;

        region611: {
        java.lang.Object regionValue8215;
        java.lang.Object regionValue8217;
        int regionValue8216;
        int regionValue8214;
        int regionValue8213;
        int arrayValue8218;

        region606: {
        int regionValue8170;
        java.lang.Object regionValue8169;
        int regionValue8168;
        int regionValue8167;
        int regionValue8172;
        java.lang.Object regionValue8171;

        region605: {
        int regionValue8148;
        java.lang.Object regionValue8147;
        int regionValue8146;
        java.lang.Object regionValue8145;
        int regionValue8144;
        int regionValue8143;

        region603: {
        int regionValue8099;
        java.lang.Object regionValue8098;
        int regionValue8097;
        java.lang.Object regionValue8096;
        int regionValue8095;
        int regionValue8094;

        region602: {
        int regionValue7864;
        java.lang.Object regionValue7863;
        int regionValue7862;
        java.lang.Object regionValue7861;
        int regionValue7860;
        int regionValue7859;

        region600: {
        int regionValue7041;
        java.lang.Object regionValue7040;
        int regionValue7039;
        java.lang.Object regionValue7038;
        int regionValue7037;
        int regionValue7036;

        region599: {
        java.lang.Object regionValue7112;
        java.lang.Object regionValue7114;
        int regionValue7113;
        int regionValue7111;
        int regionValue7110;
        int arrayValue8050;

        region596: {
        int regionValue7990;
        java.lang.Object regionValue7989;
        int regionValue7988;
        java.lang.Object regionValue7987;
        int regionValue7986;
        int value8049;

        region595: {
        int value8048;
        java.lang.Object value8047;
        java.lang.Object value8046;
        java.lang.Object value8043;
        int value8042;
        java.lang.Object value8040;
        java.lang.Object value8039;
        java.lang.Object value8038;
        java.lang.Object value8037;
        java.lang.Object value8036;
        java.lang.Object regionValue8035;
        int regionValue8034;
        java.lang.Object regionValue8033;
        int regionValue8032;

        region559: {
        int regionValue8013;
        java.lang.Object regionValue8012;
        int regionValue8011;
        java.lang.Object regionValue8010;
        int regionValue8009;

        region555: {
        int regionValue7687;
        java.lang.Object regionValue7686;
        int regionValue7685;
        java.lang.Object regionValue7684;
        int regionValue7683;
        int regionValue7682;

        region554: {
        int regionValue7390;
        java.lang.Object regionValue7389;
        int regionValue7388;
        java.lang.Object regionValue7387;
        int regionValue7386;
        int regionValue7385;

        region553: {
        java.lang.Object regionValue7463;
        int regionValue7462;
        java.lang.Object regionValue7461;
        int regionValue7460;
        int regionValue7459;
        boolean value7967;
        java.lang.Object value7966;

        region539: {
        java.lang.Object regionValue7962;
        int regionValue7961;
        java.lang.Object regionValue7960;
        int regionValue7959;
        int regionValue7958;
        int regionValue7963;

        region538: {
        int regionValue7939;
        java.lang.Object regionValue7938;
        int regionValue7937;
        java.lang.Object regionValue7936;
        int regionValue7935;
        int regionValue7934;

        region536: {
        int regionValue7914;
        java.lang.Object regionValue7913;
        int regionValue7912;
        java.lang.Object regionValue7911;
        int regionValue7910;
        int regionValue7909;

        region535: {
        int regionValue7889;
        java.lang.Object regionValue7888;
        int regionValue7887;
        java.lang.Object regionValue7886;
        int regionValue7885;
        int regionValue7884;

        region533: {
        java.lang.Object regionValue7837;
        java.lang.Object regionValue7839;
        int regionValue7838;
        int regionValue7836;
        int regionValue7835;
        int arrayValue7840;

        region527: {
        java.lang.Object regionValue7815;
        int regionValue7814;
        java.lang.Object regionValue7813;
        int regionValue7812;
        int regionValue7811;
        int regionValue7816;

        region526: {
        int regionValue7513;
        java.lang.Object regionValue7512;
        int regionValue7511;
        java.lang.Object regionValue7510;
        int regionValue7509;
        int regionValue7508;

        region525: {
        int regionValue7564;
        java.lang.Object regionValue7563;
        int regionValue7562;
        java.lang.Object regionValue7561;
        int regionValue7560;
        int regionValue7559;

        region524: {
        java.lang.Object regionValue7638;
        java.lang.Object regionValue7637;
        int regionValue7636;
        java.lang.Object regionValue7635;
        int regionValue7634;
        int regionValue7633;
        boolean value7792;
        java.lang.Object arrayValue7791;

        region517: {
        java.lang.Object regionValue7788;
        int regionValue7787;
        java.lang.Object regionValue7786;
        int regionValue7785;
        int regionValue7784;
        int regionValue7790;
        java.lang.Object regionValue7789;

        region516: {
        int regionValue7765;
        java.lang.Object regionValue7764;
        java.lang.Object regionValue7763;
        int regionValue7762;
        java.lang.Object regionValue7761;
        int regionValue7760;
        int regionValue7759;

        region514: {
        int regionValue7739;
        java.lang.Object regionValue7737;
        int regionValue7736;
        java.lang.Object regionValue7735;
        int regionValue7734;
        int regionValue7733;
        java.lang.Object regionValue7738;

        region513: {
        int regionValue7713;
        java.lang.Object regionValue7712;
        java.lang.Object regionValue7711;
        int regionValue7710;
        java.lang.Object regionValue7709;
        int regionValue7708;
        int regionValue7707;

        region511: {
        java.lang.Object regionValue7659;
        java.lang.Object regionValue7661;
        int regionValue7660;
        int regionValue7658;
        int regionValue7657;
        int arrayValue7663;
        java.lang.Object regionValue7662;

        region505: {
        java.lang.Object regionValue7613;
        java.lang.Object regionValue7612;
        int regionValue7611;
        java.lang.Object regionValue7610;
        int regionValue7609;
        int regionValue7608;
        int regionValue7614;

        region504: {
        int regionValue7589;
        java.lang.Object regionValue7588;
        java.lang.Object regionValue7587;
        int regionValue7586;
        java.lang.Object regionValue7585;
        int regionValue7584;
        int regionValue7583;

        region502: {
        int regionValue7539;
        java.lang.Object regionValue7537;
        int regionValue7536;
        java.lang.Object regionValue7535;
        int regionValue7534;
        int regionValue7533;
        java.lang.Object regionValue7538;

        region501: {
        int regionValue7189;
        java.lang.Object regionValue7187;
        int regionValue7186;
        java.lang.Object regionValue7185;
        int regionValue7184;
        int regionValue7183;
        java.lang.Object regionValue7188;

        region499: {
        int regionValue7267;
        java.lang.Object regionValue7266;
        java.lang.Object regionValue7265;
        int regionValue7264;
        java.lang.Object regionValue7263;
        int regionValue7262;
        int regionValue7261;

        region498: {
        java.lang.Object regionValue7341;
        java.lang.Object regionValue7340;
        int regionValue7339;
        java.lang.Object regionValue7338;
        int regionValue7337;
        int regionValue7336;
        boolean value7489;
        java.lang.Object arrayValue7488;

        region491: {
        java.lang.Object regionValue7487;
        java.lang.Object regionValue7486;
        int regionValue7485;
        java.lang.Object regionValue7484;
        int regionValue7483;
        int regionValue7482;

        region489: {
        java.lang.Object regionValue7438;
        int regionValue7437;
        java.lang.Object regionValue7436;
        int regionValue7435;
        int regionValue7434;
        int regionValue7440;
        java.lang.Object regionValue7439;

        region488: {
        int regionValue7415;
        java.lang.Object regionValue7414;
        java.lang.Object regionValue7413;
        int regionValue7412;
        java.lang.Object regionValue7411;
        int regionValue7410;
        int regionValue7409;

        region486: {
        java.lang.Object regionValue7362;
        java.lang.Object regionValue7364;
        int regionValue7363;
        int regionValue7361;
        int regionValue7360;
        int arrayValue7366;
        java.lang.Object regionValue7365;

        region481: {
        java.lang.Object regionValue7316;
        java.lang.Object regionValue7315;
        int regionValue7314;
        java.lang.Object regionValue7313;
        int regionValue7312;
        int regionValue7311;
        int regionValue7317;

        region480: {
        int regionValue7292;
        java.lang.Object regionValue7291;
        java.lang.Object regionValue7290;
        int regionValue7289;
        java.lang.Object regionValue7288;
        int regionValue7287;
        int regionValue7286;

        region478: {
        int regionValue7241;
        java.lang.Object regionValue7240;
        java.lang.Object regionValue7239;
        int regionValue7238;
        java.lang.Object regionValue7237;
        int regionValue7236;
        int regionValue7235;

        region477: {
        int regionValue7215;
        java.lang.Object regionValue7214;
        java.lang.Object regionValue7213;
        int regionValue7212;
        java.lang.Object regionValue7211;
        int regionValue7210;
        int regionValue7209;

        region475: {
        java.lang.Object regionValue7162;
        boolean value7164;
        java.lang.Object regionValue7161;
        int regionValue7160;
        java.lang.Object regionValue7159;
        int regionValue7158;
        int regionValue7157;
        java.lang.Object arrayValue7163;

        region467: {
        java.lang.Object regionValue7138;
        java.lang.Object regionValue7137;
        int regionValue7136;
        java.lang.Object regionValue7135;
        int regionValue7134;
        int regionValue7133;

        region465: {
        java.lang.Object regionValue7089;
        int regionValue7088;
        java.lang.Object regionValue7087;
        int regionValue7086;
        int regionValue7085;
        int regionValue7091;
        java.lang.Object regionValue7090;

        region463: {
        int regionValue7066;
        java.lang.Object regionValue7065;
        java.lang.Object regionValue7064;
        int regionValue7063;
        java.lang.Object regionValue7062;
        int regionValue7061;
        int regionValue7060;

        region461: {
        int regionValue7013;
        java.lang.Object regionValue7016;
        int regionValue7015;
        java.lang.Object regionValue7014;
        int regionValue7012;
        java.lang.Object regionValue7017;

        region458: {
        java.lang.Object regionValue6993;
        java.lang.Object regionValue6992;
        int regionValue6991;
        java.lang.Object regionValue6990;
        int regionValue6989;
        int regionValue6988;

        region456: {
        java.lang.Object regionValue6944;
        int regionValue6943;
        java.lang.Object regionValue6942;
        int regionValue6941;
        int regionValue6940;
        java.lang.Object regionValue6946;
        java.lang.Object regionValue6945;

        region455: {
        java.lang.Object regionValue6921;
        java.lang.Object regionValue6920;
        java.lang.Object regionValue6919;
        int regionValue6918;
        java.lang.Object regionValue6917;
        int regionValue6916;
        int regionValue6915;

        region453: {
        java.lang.Object value6872;
        java.lang.Object regionValue6865;
        int regionValue6864;
        java.lang.Object regionValue6863;
        int regionValue6862;
        int regionValue6861;
        java.lang.Object value6871;
        java.lang.Object value6870;
        java.lang.Object value6869;
        java.lang.Object value6868;
        java.lang.Object value6867;
        java.lang.Object regionValue6866;

        region440: {
        java.lang.Object regionValue6840;
        int regionValue6839;
        java.lang.Object regionValue6838;
        int regionValue6837;
        int regionValue6836;
        int regionValue6842;
        java.lang.Object regionValue6841;

        region439: {
        int regionValue6817;
        java.lang.Object regionValue6816;
        java.lang.Object regionValue6815;
        int regionValue6814;
        java.lang.Object regionValue6813;
        int regionValue6812;
        int regionValue6811;

        region437: {
        int regionValue6791;
        java.lang.Object regionValue6789;
        int regionValue6788;
        java.lang.Object regionValue6787;
        int regionValue6786;
        int regionValue6785;
        java.lang.Object regionValue6790;

        region436: {
        int regionValue6765;
        java.lang.Object regionValue6764;
        java.lang.Object regionValue6763;
        int regionValue6762;
        java.lang.Object regionValue6761;
        int regionValue6760;
        int regionValue6759;

        region434: {
        double value6714;
        double converted6709;
        java.lang.Object regionValue6706;
        int regionValue6705;
        java.lang.Object regionValue6704;
        int regionValue6703;
        int regionValue6702;
        int comparison6715;
        java.lang.Object value6713;
        java.lang.Object value6712;
        java.lang.Object value6710;
        java.lang.Object regionValue6707;
        int arrayValue6708;

        region413: {
        java.lang.Object regionValue6658;
        int regionValue6657;
        java.lang.Object regionValue6656;
        int regionValue6655;
        int regionValue6654;
        int regionValue6660;
        java.lang.Object regionValue6659;

        region412: {
        int regionValue6235;
        java.lang.Object regionValue6233;
        int regionValue6232;
        java.lang.Object regionValue6231;
        int regionValue6230;
        int regionValue6229;
        java.lang.Object regionValue6234;

        region411: {
        int regionValue6287;
        java.lang.Object regionValue6286;
        java.lang.Object regionValue6285;
        int regionValue6284;
        java.lang.Object regionValue6283;
        int regionValue6282;
        int regionValue6281;

        region410: {
        int regionValue6609;
        java.lang.Object regionValue6611;
        java.lang.Object regionValue6610;
        java.lang.Object regionValue6608;
        int regionValue6607;
        int regionValue6606;

        region407: {
        int regionValue6359;
        java.lang.Object regionValue6358;
        int regionValue6357;
        int regionValue6356;
        java.lang.Object regionValue6361;
        java.lang.Object regionValue6360;

        region405: {
        int regionValue6435;
        java.lang.Object regionValue6434;
        java.lang.Object regionValue6433;
        int regionValue6432;
        java.lang.Object regionValue6431;
        int regionValue6430;
        int regionValue6429;

        region382: {
        int value6410;
        java.lang.Object regionValue6409;
        java.lang.Object regionValue6408;
        int regionValue6407;
        java.lang.Object regionValue6406;
        int regionValue6405;
        int regionValue6404;

        region380: {
        java.lang.Object regionValue6385;
        java.lang.Object regionValue6384;
        int regionValue6383;
        java.lang.Object regionValue6382;
        int regionValue6381;
        int regionValue6380;

        region378: {
        java.lang.Object regionValue6336;
        java.lang.Object regionValue6335;
        int regionValue6334;
        java.lang.Object regionValue6333;
        int regionValue6332;
        int regionValue6331;
        int regionValue6337;

        region376: {
        int regionValue6312;
        java.lang.Object regionValue6311;
        java.lang.Object regionValue6310;
        int regionValue6309;
        java.lang.Object regionValue6308;
        int regionValue6307;
        int regionValue6306;

        region374: {
        int regionValue6261;
        java.lang.Object regionValue6260;
        java.lang.Object regionValue6259;
        int regionValue6258;
        java.lang.Object regionValue6257;
        int regionValue6256;
        int regionValue6255;

        region373: {
        int regionValue6135;
        java.lang.Object regionValue6138;
        int regionValue6137;
        java.lang.Object regionValue6136;
        int regionValue6134;
        java.lang.Object value6210;
        java.lang.Object regionValue6139;
        java.lang.Object value6209;

        region367: {
        java.lang.Object regionValue6186;
        int regionValue6185;
        java.lang.Object regionValue6184;
        int regionValue6183;
        int regionValue6182;

        region366: {
        int regionValue6161;
        java.lang.Object regionValue6160;
        int regionValue6159;
        int regionValue6158;
        java.lang.Object regionValue6163;
        java.lang.Object regionValue6162;

        region364: {
        if (value51 != null) {
            regionValue6134 = regionValue6110;
            regionValue6135 = regionValue6111;
            regionValue6136 = regionValue6112;
            regionValue6137 = regionValue6113;
            regionValue6138 = regionValue6114;
            regionValue6139 = regionValue6115;
            break region367;
        } else {
            regionValue6158 = regionValue6110;
            regionValue6159 = regionValue6111;
            regionValue6160 = regionValue6112;
            regionValue6161 = regionValue6113;
            regionValue6162 = regionValue6114;
            regionValue6163 = regionValue6115;
            break region364;
        }
        }
        if (regionValue6163 != null) {
            regionValue6182 = regionValue6158;
            regionValue6183 = regionValue6159;
            regionValue6184 = regionValue6160;
            regionValue6185 = regionValue6161;
            regionValue6186 = regionValue6162;
            break region366;
        } else {
            regionValue6205 = regionValue6158;
            regionValue6206 = regionValue6159;
            regionValue6207 = regionValue6160;
            regionValue6208 = regionValue6161;
            break region365;
        }
        }
        regionValue6134 = regionValue6182;
        regionValue6135 = regionValue6183;
        regionValue6136 = regionValue6184;
        regionValue6137 = regionValue6185;
        regionValue6138 = regionValue6186;
        regionValue6139 = regionValue6186;
        break region367;
        }
        value6209 = recovery$indy$flow$770(regionValue6139);
        value6210 = value6209;
        if (a1 < 0) {
            regionValue6229 = regionValue6134;
            regionValue6230 = regionValue6135;
            regionValue6231 = regionValue6136;
            regionValue6232 = regionValue6137;
            regionValue6233 = regionValue6138;
            regionValue6234 = value6210;
            regionValue6235 = regionValue6135;
            break region411;
        } else {
            regionValue6255 = regionValue6134;
            regionValue6256 = regionValue6135;
            regionValue6257 = regionValue6136;
            regionValue6258 = regionValue6137;
            regionValue6259 = regionValue6138;
            regionValue6260 = value6210;
            regionValue6261 = regionValue6135;
            break region373;
        }
        }
        if (value51 != null) {
            regionValue6281 = regionValue6255;
            regionValue6282 = regionValue6256;
            regionValue6283 = regionValue6257;
            regionValue6284 = regionValue6258;
            regionValue6285 = regionValue6259;
            regionValue6286 = regionValue6260;
            regionValue6287 = regionValue6261;
            break region410;
        } else {
            regionValue6306 = regionValue6255;
            regionValue6307 = regionValue6256;
            regionValue6308 = regionValue6257;
            regionValue6309 = regionValue6258;
            regionValue6310 = regionValue6259;
            regionValue6311 = regionValue6260;
            regionValue6312 = regionValue6261;
            break region374;
        }
        }
        regionValue6331 = regionValue6306;
        regionValue6332 = regionValue6307;
        regionValue6333 = regionValue6308;
        regionValue6334 = regionValue6309;
        regionValue6335 = regionValue6310;
        regionValue6336 = regionValue6311;
        regionValue6337 = regionValue6312;
        break region376;
        }
        if (regionValue6337 >= 5) {
            regionValue6356 = regionValue6331;
            regionValue6357 = regionValue6332;
            regionValue6358 = regionValue6333;
            regionValue6359 = regionValue6334;
            regionValue6360 = regionValue6335;
            regionValue6361 = regionValue6336;
            break region405;
        } else {
            regionValue6380 = regionValue6331;
            regionValue6381 = regionValue6332;
            regionValue6382 = regionValue6333;
            regionValue6383 = regionValue6334;
            regionValue6384 = regionValue6335;
            regionValue6385 = regionValue6336;
            break region378;
        }
        }
        regionValue6404 = regionValue6380;
        regionValue6405 = regionValue6381;
        regionValue6406 = regionValue6382;
        regionValue6407 = regionValue6383;
        regionValue6408 = regionValue6384;
        regionValue6409 = regionValue6385;
        break region380;
        }
        value6410 = 0;
        regionValue6429 = regionValue6404;
        regionValue6430 = regionValue6405;
        regionValue6431 = regionValue6406;
        regionValue6432 = regionValue6407;
        regionValue6433 = regionValue6408;
        regionValue6434 = regionValue6409;
        regionValue6435 = value6410;
        break region382;
        }
        loop382: while (true) {
        java.lang.Object regionValue6513;
        java.lang.Object regionValue6512;
        int regionValue6511;
        java.lang.Object regionValue6510;
        int regionValue6509;
        int regionValue6508;
        int regionValue6514;
        int incremented6565;

        region402: {
        java.lang.Object regionValue6560;
        int regionValue6564;
        java.lang.Object regionValue6563;
        java.lang.Object regionValue6562;
        int regionValue6561;
        int regionValue6559;
        int regionValue6558;

        region396: {
        int regionValue6539;
        java.lang.Object regionValue6538;
        java.lang.Object regionValue6537;
        int regionValue6536;
        java.lang.Object regionValue6535;
        int regionValue6534;
        int regionValue6533;

        region394: {
        int regionValue6488;
        java.lang.Object regionValue6487;
        java.lang.Object regionValue6486;
        int regionValue6485;
        java.lang.Object regionValue6484;
        int regionValue6483;
        int regionValue6482;
        int regionValue6489;

        region393: {
        java.lang.Object regionValue6460;
        boolean value6463;
        int regionValue6461;
        java.lang.Object regionValue6459;
        int regionValue6458;
        java.lang.Object regionValue6457;
        int regionValue6456;
        int regionValue6455;
        java.lang.Object arrayValue6462;

        region386: {
        int length6436;

        length6436 = java.lang.reflect.Array.getLength(value601);
        if (regionValue6435 >= length6436) {
            regionValue6356 = regionValue6429;
            regionValue6357 = regionValue6430;
            regionValue6358 = regionValue6431;
            regionValue6359 = regionValue6432;
            regionValue6360 = regionValue6433;
            regionValue6361 = regionValue6434;
            break region405;
        } else {
            regionValue6455 = regionValue6429;
            regionValue6456 = regionValue6430;
            regionValue6457 = regionValue6431;
            regionValue6458 = regionValue6432;
            regionValue6459 = regionValue6433;
            regionValue6460 = regionValue6434;
            regionValue6461 = regionValue6435;
            break region386;
        }
        }
        arrayValue6462 = ((java.lang.Object[]) value601)[regionValue6461];
        value6463 = recovery$indy$flow$771(arrayValue6462, regionValue6460);
        if (value51 != null) {
            regionValue6281 = regionValue6455;
            regionValue6282 = regionValue6456;
            regionValue6283 = regionValue6457;
            regionValue6284 = regionValue6458;
            regionValue6285 = regionValue6459;
            regionValue6286 = regionValue6460;
            regionValue6287 = (int) ((value6463 ? 1 : 0));
            break region410;
        } else {
            regionValue6482 = regionValue6455;
            regionValue6483 = regionValue6456;
            regionValue6484 = regionValue6457;
            regionValue6485 = regionValue6458;
            regionValue6486 = regionValue6459;
            regionValue6487 = regionValue6460;
            regionValue6488 = regionValue6461;
            regionValue6489 = (int) ((value6463 ? 1 : 0));
            break region393;
        }
        }
        if (regionValue6489 == 0) {
            regionValue6508 = regionValue6482;
            regionValue6509 = regionValue6483;
            regionValue6510 = regionValue6484;
            regionValue6511 = regionValue6485;
            regionValue6512 = regionValue6486;
            regionValue6513 = regionValue6487;
            regionValue6514 = regionValue6488;
            break region402;
        } else {
            regionValue6533 = regionValue6482;
            regionValue6534 = regionValue6483;
            regionValue6535 = regionValue6484;
            regionValue6536 = regionValue6485;
            regionValue6537 = regionValue6486;
            regionValue6538 = regionValue6487;
            regionValue6539 = regionValue6488;
            break region394;
        }
        }
        regionValue6558 = regionValue6533;
        regionValue6559 = regionValue6534;
        regionValue6560 = regionValue6535;
        regionValue6561 = regionValue6536;
        regionValue6562 = regionValue6537;
        regionValue6563 = regionValue6538;
        regionValue6564 = regionValue6539;
        break region396;
        }
        if (regionValue6560 instanceof boolean[]) {
            ((boolean[]) regionValue6560)[regionValue6564] = true;
        } else {
            ((byte[]) regionValue6560)[regionValue6564] = (byte) (1);
        }
        regionValue6508 = regionValue6558;
        regionValue6509 = regionValue6559;
        regionValue6510 = regionValue6560;
        regionValue6511 = regionValue6561;
        regionValue6512 = regionValue6562;
        regionValue6513 = regionValue6563;
        regionValue6514 = regionValue6564;
        break region402;
        }
        incremented6565 = regionValue6514 + (1);
        if (value51 == null) {
            regionValue6429 = regionValue6508;
            regionValue6430 = regionValue6509;
            regionValue6431 = regionValue6510;
            regionValue6432 = regionValue6511;
            regionValue6433 = regionValue6512;
            regionValue6434 = regionValue6513;
            regionValue6435 = incremented6565;
            continue loop382;
        } else {
            regionValue6356 = regionValue6508;
            regionValue6357 = regionValue6509;
            regionValue6358 = regionValue6510;
            regionValue6359 = regionValue6511;
            regionValue6360 = regionValue6512;
            regionValue6361 = regionValue6513;
            break region405;
        }
        }
        }
        if (a2 >= 0) {
            regionValue6584 = regionValue6356;
            regionValue6585 = regionValue6357;
            regionValue6586 = regionValue6358;
            regionValue6587 = regionValue6359;
            break region1027;
        } else {
            regionValue6606 = regionValue6356;
            regionValue6607 = regionValue6357;
            regionValue6608 = regionValue6358;
            regionValue6609 = regionValue6359;
            regionValue6610 = regionValue6360;
            regionValue6611 = regionValue6361;
            break region407;
        }
        }
        regionValue6281 = regionValue6606;
        regionValue6282 = regionValue6607;
        regionValue6283 = regionValue6608;
        regionValue6284 = regionValue6609;
        regionValue6285 = regionValue6610;
        regionValue6286 = regionValue6611;
        regionValue6287 = regionValue6609;
        break region410;
        }
        regionValue6229 = regionValue6281;
        regionValue6230 = regionValue6282;
        regionValue6231 = regionValue6283;
        regionValue6232 = regionValue6284;
        regionValue6233 = regionValue6285;
        regionValue6234 = regionValue6286;
        regionValue6235 = regionValue6287;
        break region411;
        }
        if (value51 != null) {
            regionValue6630 = regionValue6229;
            regionValue6631 = regionValue6230;
            regionValue6632 = regionValue6231;
            regionValue6633 = regionValue6232;
            regionValue6634 = regionValue6233;
            regionValue6635 = regionValue6235;
            break region807;
        } else {
            regionValue6654 = regionValue6229;
            regionValue6655 = regionValue6230;
            regionValue6656 = regionValue6231;
            regionValue6657 = regionValue6232;
            regionValue6658 = regionValue6233;
            regionValue6659 = regionValue6234;
            regionValue6660 = regionValue6235;
            break region412;
        }
        }
        if (regionValue6660 <= 0) {
            regionValue6679 = regionValue6654;
            regionValue6680 = regionValue6655;
            regionValue6681 = regionValue6656;
            regionValue6682 = regionValue6657;
            regionValue6683 = regionValue6658;
            break region806;
        } else {
            regionValue6702 = regionValue6654;
            regionValue6703 = regionValue6655;
            regionValue6704 = regionValue6656;
            regionValue6705 = regionValue6657;
            regionValue6706 = regionValue6658;
            regionValue6707 = regionValue6659;
            break region413;
        }
        }
        arrayValue6708 = ((int[]) value186)[4];
        converted6709 = (double) (arrayValue6708);
        value6710 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingReCraftIfSoupsLowerThan));
        value6712 = value6710;
        value6713 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value6712))))));
        value6714 = recovery$indy$flow$774(value6713, computed21);
        comparison6715 = (java.lang.Double.isNaN(converted6709) || java.lang.Double.isNaN(value6714) ? 1 : (converted6709 > value6714 ? 1 : converted6709 == value6714 ? 0 : -1));
        if (a0 <= 0) {
            regionValue6734 = regionValue6702;
            regionValue6735 = regionValue6703;
            regionValue6736 = regionValue6704;
            regionValue6737 = regionValue6705;
            regionValue6738 = regionValue6706;
            regionValue6739 = comparison6715;
            break region808;
        } else {
            regionValue6759 = regionValue6702;
            regionValue6760 = regionValue6703;
            regionValue6761 = regionValue6704;
            regionValue6762 = regionValue6705;
            regionValue6763 = regionValue6706;
            regionValue6764 = regionValue6707;
            regionValue6765 = comparison6715;
            break region434;
        }
        }
        regionValue6785 = regionValue6759;
        regionValue6786 = regionValue6760;
        regionValue6787 = regionValue6761;
        regionValue6788 = regionValue6762;
        regionValue6789 = regionValue6763;
        regionValue6790 = regionValue6764;
        regionValue6791 = regionValue6765;
        break region436;
        }
        if (value51 != null) {
            regionValue6630 = regionValue6785;
            regionValue6631 = regionValue6786;
            regionValue6632 = regionValue6787;
            regionValue6633 = regionValue6788;
            regionValue6634 = regionValue6789;
            regionValue6635 = regionValue6791;
            break region807;
        } else {
            regionValue6811 = regionValue6785;
            regionValue6812 = regionValue6786;
            regionValue6813 = regionValue6787;
            regionValue6814 = regionValue6788;
            regionValue6815 = regionValue6789;
            regionValue6816 = regionValue6790;
            regionValue6817 = regionValue6791;
            break region437;
        }
        }
        regionValue6836 = regionValue6811;
        regionValue6837 = regionValue6812;
        regionValue6838 = regionValue6813;
        regionValue6839 = regionValue6814;
        regionValue6840 = regionValue6815;
        regionValue6841 = regionValue6816;
        regionValue6842 = regionValue6817;
        break region439;
        }
        if (regionValue6842 > 0) {
            regionValue6679 = regionValue6836;
            regionValue6680 = regionValue6837;
            regionValue6681 = regionValue6838;
            regionValue6682 = regionValue6839;
            regionValue6683 = regionValue6840;
            break region806;
        } else {
            regionValue6861 = regionValue6836;
            regionValue6862 = regionValue6837;
            regionValue6863 = regionValue6838;
            regionValue6864 = regionValue6839;
            regionValue6865 = regionValue6840;
            regionValue6866 = regionValue6841;
            break region440;
        }
        }
        value6867 = recovery$indy$flow$775();
        value6868 = value6867;
        value6869 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6868))))));
        value6870 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value6869)))).field_42P));
        value6871 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value6870)))).field_42X));
        value6872 = recovery$indy$flow$779(value6871);
        if (value51 != null) {
            regionValue6891 = regionValue6861;
            regionValue6892 = regionValue6862;
            regionValue6893 = regionValue6863;
            regionValue6894 = regionValue6864;
            regionValue6895 = regionValue6865;
            regionValue6896 = value6872;
            break region696;
        } else {
            regionValue6915 = regionValue6861;
            regionValue6916 = regionValue6862;
            regionValue6917 = regionValue6863;
            regionValue6918 = regionValue6864;
            regionValue6919 = regionValue6865;
            regionValue6920 = regionValue6866;
            regionValue6921 = value6872;
            break region453;
        }
        }
        regionValue6940 = regionValue6915;
        regionValue6941 = regionValue6916;
        regionValue6942 = regionValue6917;
        regionValue6943 = regionValue6918;
        regionValue6944 = regionValue6919;
        regionValue6945 = regionValue6920;
        regionValue6946 = regionValue6921;
        break region455;
        }
        if (regionValue6946 != null) {
            regionValue6965 = regionValue6940;
            regionValue6966 = regionValue6941;
            regionValue6967 = regionValue6942;
            regionValue6968 = regionValue6943;
            regionValue6969 = regionValue6944;
            break region683;
        } else {
            regionValue6988 = regionValue6940;
            regionValue6989 = regionValue6941;
            regionValue6990 = regionValue6942;
            regionValue6991 = regionValue6943;
            regionValue6992 = regionValue6944;
            regionValue6993 = regionValue6945;
            break region456;
        }
        }
        regionValue7012 = regionValue6988;
        regionValue7013 = regionValue6989;
        regionValue7014 = regionValue6990;
        regionValue7015 = regionValue6991;
        regionValue7016 = regionValue6992;
        regionValue7017 = regionValue6993;
        break region458;
        }
        if (value51 != null) {
            regionValue7036 = regionValue7012;
            regionValue7037 = regionValue7013;
            regionValue7038 = regionValue7014;
            regionValue7039 = regionValue7015;
            regionValue7040 = regionValue7016;
            regionValue7041 = regionValue7013;
            break region599;
        } else {
            regionValue7060 = regionValue7012;
            regionValue7061 = regionValue7013;
            regionValue7062 = regionValue7014;
            regionValue7063 = regionValue7015;
            regionValue7064 = regionValue7016;
            regionValue7065 = regionValue7017;
            regionValue7066 = regionValue7013;
            break region461;
        }
        }
        regionValue7085 = regionValue7060;
        regionValue7086 = regionValue7061;
        regionValue7087 = regionValue7062;
        regionValue7088 = regionValue7063;
        regionValue7089 = regionValue7064;
        regionValue7090 = regionValue7065;
        regionValue7091 = regionValue7066;
        break region463;
        }
        if (regionValue7091 <= 8) {
            regionValue7110 = regionValue7085;
            regionValue7111 = regionValue7086;
            regionValue7112 = regionValue7087;
            regionValue7113 = regionValue7088;
            regionValue7114 = regionValue7089;
            break region596;
        } else {
            regionValue7133 = regionValue7085;
            regionValue7134 = regionValue7086;
            regionValue7135 = regionValue7087;
            regionValue7136 = regionValue7088;
            regionValue7137 = regionValue7089;
            regionValue7138 = regionValue7090;
            break region465;
        }
        }
        regionValue7157 = regionValue7133;
        regionValue7158 = regionValue7134;
        regionValue7159 = regionValue7135;
        regionValue7160 = regionValue7136;
        regionValue7161 = regionValue7137;
        regionValue7162 = regionValue7138;
        break region467;
        }
        arrayValue7163 = ((java.lang.Object[]) value601)[0];
        value7164 = recovery$indy$flow$780(regionValue7162, arrayValue7163);
        if (a2 > 0) {
            regionValue7183 = regionValue7157;
            regionValue7184 = regionValue7158;
            regionValue7185 = regionValue7159;
            regionValue7186 = regionValue7160;
            regionValue7187 = regionValue7161;
            regionValue7188 = regionValue7162;
            regionValue7189 = (int) ((value7164 ? 1 : 0));
            break region499;
        } else {
            regionValue7209 = regionValue7157;
            regionValue7210 = regionValue7158;
            regionValue7211 = regionValue7159;
            regionValue7212 = regionValue7160;
            regionValue7213 = regionValue7161;
            regionValue7214 = regionValue7162;
            regionValue7215 = (int) ((value7164 ? 1 : 0));
            break region475;
        }
        }
        regionValue7235 = regionValue7209;
        regionValue7236 = regionValue7210;
        regionValue7237 = regionValue7211;
        regionValue7238 = regionValue7212;
        regionValue7239 = regionValue7213;
        regionValue7240 = regionValue7214;
        regionValue7241 = regionValue7215;
        break region477;
        }
        if (value51 != null) {
            regionValue7261 = regionValue7235;
            regionValue7262 = regionValue7236;
            regionValue7263 = regionValue7237;
            regionValue7264 = regionValue7238;
            regionValue7265 = regionValue7239;
            regionValue7266 = regionValue7240;
            regionValue7267 = regionValue7241;
            break region498;
        } else {
            regionValue7286 = regionValue7235;
            regionValue7287 = regionValue7236;
            regionValue7288 = regionValue7237;
            regionValue7289 = regionValue7238;
            regionValue7290 = regionValue7239;
            regionValue7291 = regionValue7240;
            regionValue7292 = regionValue7241;
            break region478;
        }
        }
        regionValue7311 = regionValue7286;
        regionValue7312 = regionValue7287;
        regionValue7313 = regionValue7288;
        regionValue7314 = regionValue7289;
        regionValue7315 = regionValue7290;
        regionValue7316 = regionValue7291;
        regionValue7317 = regionValue7292;
        break region480;
        }
        if (regionValue7317 == 0) {
            regionValue7336 = regionValue7311;
            regionValue7337 = regionValue7312;
            regionValue7338 = regionValue7313;
            regionValue7339 = regionValue7314;
            regionValue7340 = regionValue7315;
            regionValue7341 = regionValue7316;
            break region491;
        } else {
            regionValue7360 = regionValue7311;
            regionValue7361 = regionValue7312;
            regionValue7362 = regionValue7313;
            regionValue7363 = regionValue7314;
            regionValue7364 = regionValue7315;
            regionValue7365 = regionValue7316;
            break region481;
        }
        }
        arrayValue7366 = (regionValue7362 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue7362)[0] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue7362)[0]);
        if (value51 != null) {
            regionValue7385 = regionValue7360;
            regionValue7386 = regionValue7361;
            regionValue7387 = regionValue7362;
            regionValue7388 = regionValue7363;
            regionValue7389 = regionValue7364;
            regionValue7390 = arrayValue7366;
            break region553;
        } else {
            regionValue7409 = regionValue7360;
            regionValue7410 = regionValue7361;
            regionValue7411 = regionValue7362;
            regionValue7412 = regionValue7363;
            regionValue7413 = regionValue7364;
            regionValue7414 = regionValue7365;
            regionValue7415 = arrayValue7366;
            break region486;
        }
        }
        regionValue7434 = regionValue7409;
        regionValue7435 = regionValue7410;
        regionValue7436 = regionValue7411;
        regionValue7437 = regionValue7412;
        regionValue7438 = regionValue7413;
        regionValue7439 = regionValue7414;
        regionValue7440 = regionValue7415;
        break region488;
        }
        if (regionValue7440 == 0) {
            regionValue7459 = regionValue7434;
            regionValue7460 = regionValue7435;
            regionValue7461 = regionValue7436;
            regionValue7462 = regionValue7437;
            regionValue7463 = regionValue7438;
            break region539;
        } else {
            regionValue7482 = regionValue7434;
            regionValue7483 = regionValue7435;
            regionValue7484 = regionValue7436;
            regionValue7485 = regionValue7437;
            regionValue7486 = regionValue7438;
            regionValue7487 = regionValue7439;
            break region489;
        }
        }
        regionValue7336 = regionValue7482;
        regionValue7337 = regionValue7483;
        regionValue7338 = regionValue7484;
        regionValue7339 = regionValue7485;
        regionValue7340 = regionValue7486;
        regionValue7341 = regionValue7487;
        break region491;
        }
        arrayValue7488 = ((java.lang.Object[]) value601)[1];
        value7489 = recovery$indy$flow$781(regionValue7341, arrayValue7488);
        regionValue7261 = regionValue7336;
        regionValue7262 = regionValue7337;
        regionValue7263 = regionValue7338;
        regionValue7264 = regionValue7339;
        regionValue7265 = regionValue7340;
        regionValue7266 = regionValue7341;
        regionValue7267 = (int) ((value7489 ? 1 : 0));
        break region498;
        }
        regionValue7183 = regionValue7261;
        regionValue7184 = regionValue7262;
        regionValue7185 = regionValue7263;
        regionValue7186 = regionValue7264;
        regionValue7187 = regionValue7265;
        regionValue7188 = regionValue7266;
        regionValue7189 = regionValue7267;
        break region499;
        }
        if (a2 > 0) {
            regionValue7508 = regionValue7183;
            regionValue7509 = regionValue7184;
            regionValue7510 = regionValue7185;
            regionValue7511 = regionValue7186;
            regionValue7512 = regionValue7187;
            regionValue7513 = regionValue7189;
            break region525;
        } else {
            regionValue7533 = regionValue7183;
            regionValue7534 = regionValue7184;
            regionValue7535 = regionValue7185;
            regionValue7536 = regionValue7186;
            regionValue7537 = regionValue7187;
            regionValue7538 = regionValue7188;
            regionValue7539 = regionValue7189;
            break region501;
        }
        }
        if (value51 != null) {
            regionValue7559 = regionValue7533;
            regionValue7560 = regionValue7534;
            regionValue7561 = regionValue7535;
            regionValue7562 = regionValue7536;
            regionValue7563 = regionValue7537;
            regionValue7564 = regionValue7539;
            break region524;
        } else {
            regionValue7583 = regionValue7533;
            regionValue7584 = regionValue7534;
            regionValue7585 = regionValue7535;
            regionValue7586 = regionValue7536;
            regionValue7587 = regionValue7537;
            regionValue7588 = regionValue7538;
            regionValue7589 = regionValue7539;
            break region502;
        }
        }
        regionValue7608 = regionValue7583;
        regionValue7609 = regionValue7584;
        regionValue7610 = regionValue7585;
        regionValue7611 = regionValue7586;
        regionValue7612 = regionValue7587;
        regionValue7613 = regionValue7588;
        regionValue7614 = regionValue7589;
        break region504;
        }
        if (regionValue7614 == 0) {
            regionValue7633 = regionValue7608;
            regionValue7634 = regionValue7609;
            regionValue7635 = regionValue7610;
            regionValue7636 = regionValue7611;
            regionValue7637 = regionValue7612;
            regionValue7638 = regionValue7613;
            break region517;
        } else {
            regionValue7657 = regionValue7608;
            regionValue7658 = regionValue7609;
            regionValue7659 = regionValue7610;
            regionValue7660 = regionValue7611;
            regionValue7661 = regionValue7612;
            regionValue7662 = regionValue7613;
            break region505;
        }
        }
        arrayValue7663 = (regionValue7659 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue7659)[1] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue7659)[1]);
        if (a0 <= 0) {
            regionValue7682 = regionValue7657;
            regionValue7683 = regionValue7658;
            regionValue7684 = regionValue7659;
            regionValue7685 = regionValue7660;
            regionValue7686 = regionValue7661;
            regionValue7687 = arrayValue7663;
            break region554;
        } else {
            regionValue7707 = regionValue7657;
            regionValue7708 = regionValue7658;
            regionValue7709 = regionValue7659;
            regionValue7710 = regionValue7660;
            regionValue7711 = regionValue7661;
            regionValue7712 = regionValue7662;
            regionValue7713 = arrayValue7663;
            break region511;
        }
        }
        regionValue7733 = regionValue7707;
        regionValue7734 = regionValue7708;
        regionValue7735 = regionValue7709;
        regionValue7736 = regionValue7710;
        regionValue7737 = regionValue7711;
        regionValue7738 = regionValue7712;
        regionValue7739 = regionValue7713;
        break region513;
        }
        if (value51 != null) {
            regionValue7385 = regionValue7733;
            regionValue7386 = regionValue7734;
            regionValue7387 = regionValue7735;
            regionValue7388 = regionValue7736;
            regionValue7389 = regionValue7737;
            regionValue7390 = regionValue7739;
            break region553;
        } else {
            regionValue7759 = regionValue7733;
            regionValue7760 = regionValue7734;
            regionValue7761 = regionValue7735;
            regionValue7762 = regionValue7736;
            regionValue7763 = regionValue7737;
            regionValue7764 = regionValue7738;
            regionValue7765 = regionValue7739;
            break region514;
        }
        }
        regionValue7784 = regionValue7759;
        regionValue7785 = regionValue7760;
        regionValue7786 = regionValue7761;
        regionValue7787 = regionValue7762;
        regionValue7788 = regionValue7763;
        regionValue7789 = regionValue7764;
        regionValue7790 = regionValue7765;
        break region516;
        }
        if (regionValue7790 == 0) {
            regionValue7459 = regionValue7784;
            regionValue7460 = regionValue7785;
            regionValue7461 = regionValue7786;
            regionValue7462 = regionValue7787;
            regionValue7463 = regionValue7788;
            break region539;
        } else {
            regionValue7633 = regionValue7784;
            regionValue7634 = regionValue7785;
            regionValue7635 = regionValue7786;
            regionValue7636 = regionValue7787;
            regionValue7637 = regionValue7788;
            regionValue7638 = regionValue7789;
            break region517;
        }
        }
        arrayValue7791 = ((java.lang.Object[]) value601)[2];
        value7792 = recovery$indy$flow$782(regionValue7638, arrayValue7791);
        regionValue7559 = regionValue7633;
        regionValue7560 = regionValue7634;
        regionValue7561 = regionValue7635;
        regionValue7562 = regionValue7636;
        regionValue7563 = regionValue7637;
        regionValue7564 = (int) ((value7792 ? 1 : 0));
        break region524;
        }
        regionValue7508 = regionValue7559;
        regionValue7509 = regionValue7560;
        regionValue7510 = regionValue7561;
        regionValue7511 = regionValue7562;
        regionValue7512 = regionValue7563;
        regionValue7513 = regionValue7564;
        break region525;
        }
        if (value51 != null) {
            regionValue7036 = regionValue7508;
            regionValue7037 = regionValue7509;
            regionValue7038 = regionValue7510;
            regionValue7039 = regionValue7511;
            regionValue7040 = regionValue7512;
            regionValue7041 = regionValue7513;
            break region599;
        } else {
            regionValue7811 = regionValue7508;
            regionValue7812 = regionValue7509;
            regionValue7813 = regionValue7510;
            regionValue7814 = regionValue7511;
            regionValue7815 = regionValue7512;
            regionValue7816 = regionValue7513;
            break region526;
        }
        }
        if (regionValue7816 == 0) {
            regionValue7110 = regionValue7811;
            regionValue7111 = regionValue7812;
            regionValue7112 = regionValue7813;
            regionValue7113 = regionValue7814;
            regionValue7114 = regionValue7815;
            break region596;
        } else {
            regionValue7835 = regionValue7811;
            regionValue7836 = regionValue7812;
            regionValue7837 = regionValue7813;
            regionValue7838 = regionValue7814;
            regionValue7839 = regionValue7815;
            break region527;
        }
        }
        arrayValue7840 = (regionValue7837 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue7837)[2] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue7837)[2]);
        if (a0 < 0) {
            regionValue7859 = regionValue7835;
            regionValue7860 = regionValue7836;
            regionValue7861 = regionValue7837;
            regionValue7862 = regionValue7838;
            regionValue7863 = regionValue7839;
            regionValue7864 = arrayValue7840;
            break region600;
        } else {
            regionValue7884 = regionValue7835;
            regionValue7885 = regionValue7836;
            regionValue7886 = regionValue7837;
            regionValue7887 = regionValue7838;
            regionValue7888 = regionValue7839;
            regionValue7889 = arrayValue7840;
            break region533;
        }
        }
        regionValue7909 = regionValue7884;
        regionValue7910 = regionValue7885;
        regionValue7911 = regionValue7886;
        regionValue7912 = regionValue7887;
        regionValue7913 = regionValue7888;
        regionValue7914 = regionValue7889;
        break region535;
        }
        if (value51 != null) {
            regionValue7036 = regionValue7909;
            regionValue7037 = regionValue7910;
            regionValue7038 = regionValue7911;
            regionValue7039 = regionValue7912;
            regionValue7040 = regionValue7913;
            regionValue7041 = regionValue7914;
            break region599;
        } else {
            regionValue7934 = regionValue7909;
            regionValue7935 = regionValue7910;
            regionValue7936 = regionValue7911;
            regionValue7937 = regionValue7912;
            regionValue7938 = regionValue7913;
            regionValue7939 = regionValue7914;
            break region536;
        }
        }
        regionValue7958 = regionValue7934;
        regionValue7959 = regionValue7935;
        regionValue7960 = regionValue7936;
        regionValue7961 = regionValue7937;
        regionValue7962 = regionValue7938;
        regionValue7963 = regionValue7939;
        break region538;
        }
        if (regionValue7963 != 0) {
            regionValue7110 = regionValue7958;
            regionValue7111 = regionValue7959;
            regionValue7112 = regionValue7960;
            regionValue7113 = regionValue7961;
            regionValue7114 = regionValue7962;
            break region596;
        } else {
            regionValue7459 = regionValue7958;
            regionValue7460 = regionValue7959;
            regionValue7461 = regionValue7960;
            regionValue7462 = regionValue7961;
            regionValue7463 = regionValue7962;
            break region539;
        }
        }
        value7966 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value7967 = recovery$indy$flow$784(value7966, computed37);
        regionValue7385 = regionValue7459;
        regionValue7386 = regionValue7460;
        regionValue7387 = regionValue7461;
        regionValue7388 = regionValue7462;
        regionValue7389 = regionValue7463;
        regionValue7390 = (int) ((value7967 ? 1 : 0));
        break region553;
        }
        regionValue7682 = regionValue7385;
        regionValue7683 = regionValue7386;
        regionValue7684 = regionValue7387;
        regionValue7685 = regionValue7388;
        regionValue7686 = regionValue7389;
        regionValue7687 = regionValue7390;
        break region554;
        }
        if (value51 != null) {
            regionValue7986 = regionValue7682;
            regionValue7987 = regionValue7684;
            regionValue7988 = regionValue7685;
            regionValue7989 = regionValue7686;
            regionValue7990 = regionValue7687;
            break region595;
        } else {
            regionValue8009 = regionValue7683;
            regionValue8010 = regionValue7684;
            regionValue8011 = regionValue7685;
            regionValue8012 = regionValue7686;
            regionValue8013 = regionValue7687;
            break region555;
        }
        }
        if (regionValue8013 == 0) {
            regionValue8032 = regionValue8009;
            regionValue8033 = regionValue8010;
            regionValue8034 = regionValue8011;
            regionValue8035 = regionValue8012;
            break region559;
        } else {
            break region556;
        }
        }
        value8036 = recovery$indy$flow$785();
        value8037 = value8036;
        value8038 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8037))))));
        value8039 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8038)))).field_42P));
        value8040 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value8039)))).field_429));
        value8042 = regionValue8032;
        value8043 = value8040;
        value8046 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value8047 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value8043))))));
        recovery$indy$flow$791(value8046, computed23, value8047, value8042, regionValue599);
        value8048 = 1;
        regionValue7986 = value8048;
        regionValue7987 = regionValue8033;
        regionValue7988 = regionValue8034;
        regionValue7989 = regionValue8035;
        regionValue7990 = 0;
        break region595;
        }
        value8049 = regionValue7990;
        regionValue7110 = regionValue7986;
        regionValue7111 = value8049;
        regionValue7112 = regionValue7987;
        regionValue7113 = regionValue7988;
        regionValue7114 = regionValue7989;
        break region596;
        }
        arrayValue8050 = (regionValue7112 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue7112)[0] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue7112)[0]);
        regionValue7036 = regionValue7110;
        regionValue7037 = regionValue7111;
        regionValue7038 = regionValue7112;
        regionValue7039 = regionValue7113;
        regionValue7040 = regionValue7114;
        regionValue7041 = arrayValue8050;
        break region599;
        }
        regionValue7859 = regionValue7036;
        regionValue7860 = regionValue7037;
        regionValue7861 = regionValue7038;
        regionValue7862 = regionValue7039;
        regionValue7863 = regionValue7040;
        regionValue7864 = regionValue7041;
        break region600;
        }
        if (a1 < 0) {
            regionValue8069 = regionValue7859;
            regionValue8070 = regionValue7860;
            regionValue8071 = regionValue7861;
            regionValue8072 = regionValue7862;
            regionValue8073 = regionValue7863;
            regionValue8074 = regionValue7864;
            break region612;
        } else {
            regionValue8094 = regionValue7859;
            regionValue8095 = regionValue7860;
            regionValue8096 = regionValue7861;
            regionValue8097 = regionValue7862;
            regionValue8098 = regionValue7863;
            regionValue8099 = regionValue7864;
            break region602;
        }
        }
        if (value51 != null) {
            regionValue8119 = regionValue8094;
            regionValue8120 = regionValue8095;
            regionValue8121 = regionValue8096;
            regionValue8122 = regionValue8097;
            regionValue8123 = regionValue8098;
            regionValue8124 = regionValue8099;
            break region611;
        } else {
            regionValue8143 = regionValue8094;
            regionValue8144 = regionValue8095;
            regionValue8145 = regionValue8096;
            regionValue8146 = regionValue8097;
            regionValue8147 = regionValue8098;
            regionValue8148 = regionValue8099;
            break region603;
        }
        }
        regionValue8167 = regionValue8143;
        regionValue8168 = regionValue8144;
        regionValue8169 = regionValue8145;
        regionValue8170 = regionValue8146;
        regionValue8171 = regionValue8147;
        regionValue8172 = regionValue8148;
        break region605;
        }
        if (regionValue8172 == 0) {
            regionValue8191 = regionValue8167;
            regionValue8192 = regionValue8168;
            regionValue8193 = regionValue8169;
            regionValue8194 = regionValue8170;
            break region1026;
        } else {
            regionValue8213 = regionValue8167;
            regionValue8214 = regionValue8168;
            regionValue8215 = regionValue8169;
            regionValue8216 = regionValue8170;
            regionValue8217 = regionValue8171;
            break region606;
        }
        }
        arrayValue8218 = (regionValue8215 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue8215)[1] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue8215)[1]);
        regionValue8119 = regionValue8213;
        regionValue8120 = regionValue8214;
        regionValue8121 = regionValue8215;
        regionValue8122 = regionValue8216;
        regionValue8123 = regionValue8217;
        regionValue8124 = arrayValue8218;
        break region611;
        }
        regionValue8069 = regionValue8119;
        regionValue8070 = regionValue8120;
        regionValue8071 = regionValue8121;
        regionValue8072 = regionValue8122;
        regionValue8073 = regionValue8123;
        regionValue8074 = regionValue8124;
        break region612;
        }
        if (a0 < 0) {
            regionValue8237 = regionValue8069;
            regionValue8238 = regionValue8070;
            regionValue8239 = regionValue8071;
            regionValue8240 = regionValue8072;
            regionValue8241 = regionValue8073;
            regionValue8242 = regionValue8074;
            break region624;
        } else {
            regionValue8262 = regionValue8069;
            regionValue8263 = regionValue8070;
            regionValue8264 = regionValue8071;
            regionValue8265 = regionValue8072;
            regionValue8266 = regionValue8073;
            regionValue8267 = regionValue8074;
            break region614;
        }
        }
        if (value51 != null) {
            regionValue8287 = regionValue8262;
            regionValue8288 = regionValue8263;
            regionValue8289 = regionValue8264;
            regionValue8290 = regionValue8265;
            regionValue8291 = regionValue8266;
            regionValue8292 = regionValue8267;
            break region623;
        } else {
            regionValue8311 = regionValue8262;
            regionValue8312 = regionValue8263;
            regionValue8313 = regionValue8264;
            regionValue8314 = regionValue8265;
            regionValue8315 = regionValue8266;
            regionValue8316 = regionValue8267;
            break region615;
        }
        }
        regionValue8335 = regionValue8311;
        regionValue8336 = regionValue8312;
        regionValue8337 = regionValue8313;
        regionValue8338 = regionValue8314;
        regionValue8339 = regionValue8315;
        regionValue8340 = regionValue8316;
        break region617;
        }
        if (regionValue8340 == 0) {
            regionValue8191 = regionValue8335;
            regionValue8192 = regionValue8336;
            regionValue8193 = regionValue8337;
            regionValue8194 = regionValue8338;
            break region1026;
        } else {
            regionValue8359 = regionValue8335;
            regionValue8360 = regionValue8336;
            regionValue8361 = regionValue8337;
            regionValue8362 = regionValue8338;
            regionValue8363 = regionValue8339;
            break region618;
        }
        }
        arrayValue8364 = (regionValue8361 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue8361)[2] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue8361)[2]);
        regionValue8287 = regionValue8359;
        regionValue8288 = regionValue8360;
        regionValue8289 = regionValue8361;
        regionValue8290 = regionValue8362;
        regionValue8291 = regionValue8363;
        regionValue8292 = arrayValue8364;
        break region623;
        }
        regionValue8237 = regionValue8287;
        regionValue8238 = regionValue8288;
        regionValue8239 = regionValue8289;
        regionValue8240 = regionValue8290;
        regionValue8241 = regionValue8291;
        regionValue8242 = regionValue8292;
        break region624;
        }
        if (a2 > 0) {
            regionValue8383 = regionValue8237;
            regionValue8384 = regionValue8239;
            regionValue8385 = regionValue8240;
            regionValue8386 = regionValue8241;
            regionValue8387 = regionValue8242;
            break region645;
        } else {
            regionValue8407 = regionValue8237;
            regionValue8408 = regionValue8238;
            regionValue8409 = regionValue8239;
            regionValue8410 = regionValue8240;
            regionValue8411 = regionValue8241;
            regionValue8412 = regionValue8242;
            break region626;
        }
        }
        if (value51 != null) {
            regionValue8432 = regionValue8407;
            regionValue8433 = regionValue8409;
            regionValue8434 = regionValue8410;
            regionValue8435 = regionValue8411;
            regionValue8436 = regionValue8412;
            break region644;
        } else {
            regionValue8455 = regionValue8407;
            regionValue8456 = regionValue8408;
            regionValue8457 = regionValue8409;
            regionValue8458 = regionValue8410;
            regionValue8459 = regionValue8411;
            regionValue8460 = regionValue8412;
            break region627;
        }
        }
        regionValue8479 = regionValue8455;
        regionValue8480 = regionValue8456;
        regionValue8481 = regionValue8457;
        regionValue8482 = regionValue8458;
        regionValue8483 = regionValue8459;
        regionValue8484 = regionValue8460;
        break region629;
        }
        if (regionValue8484 == 0) {
            regionValue8191 = regionValue8479;
            regionValue8192 = regionValue8480;
            regionValue8193 = regionValue8481;
            regionValue8194 = regionValue8482;
            break region1026;
        } else {
            regionValue8503 = regionValue8479;
            regionValue8504 = regionValue8481;
            regionValue8505 = regionValue8482;
            regionValue8506 = regionValue8483;
            break region630;
        }
        }
        value8509 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value8510 = recovery$indy$flow$793(value8509, computed37);
        regionValue8432 = regionValue8503;
        regionValue8433 = regionValue8504;
        regionValue8434 = regionValue8505;
        regionValue8435 = regionValue8506;
        regionValue8436 = (int) ((value8510 ? 1 : 0));
        break region644;
        }
        regionValue8383 = regionValue8432;
        regionValue8384 = regionValue8433;
        regionValue8385 = regionValue8434;
        regionValue8386 = regionValue8435;
        regionValue8387 = regionValue8436;
        break region645;
        }
        if (value51 != null) {
            regionValue8529 = regionValue8383;
            regionValue8530 = regionValue8384;
            regionValue8531 = regionValue8385;
            regionValue8532 = regionValue8386;
            regionValue8533 = regionValue8387;
            break region676;
        } else {
            regionValue8552 = regionValue8384;
            regionValue8553 = regionValue8385;
            regionValue8554 = regionValue8386;
            regionValue8555 = regionValue8387;
            break region646;
        }
        }
        if (regionValue8555 == 0) {
            regionValue8574 = regionValue8552;
            regionValue8575 = regionValue8553;
            regionValue8576 = regionValue8554;
            break region650;
        } else {
            break region647;
        }
        }
        converted8577 = (short) (converted27);
        converted8578 = (short) (converted35);
        value8579 = (int) (converted8578);
        value8581 = (int) (converted8577);
        value8582 = 0;
        value8584 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        recovery$indy$flow$795(value8584, value8582, (short) (value8581), converted31, (short) (value8579));
        value8585 = 1;
        regionValue8529 = value8585;
        regionValue8530 = regionValue8574;
        regionValue8531 = regionValue8575;
        regionValue8532 = regionValue8576;
        regionValue8533 = 0;
        break region676;
        }
        value8586 = regionValue8533;
        if (a1 < 0) {
            regionValue3451 = regionValue8531;
            regionValue3454 = regionValue8530;
            regionValue3455 = regionValue8529;
            regionValue3456 = value8586;
            break region1030;
        } else {
            regionValue8605 = regionValue8529;
            regionValue8606 = regionValue8530;
            regionValue8607 = regionValue8531;
            regionValue8608 = regionValue8532;
            regionValue8609 = value8586;
            break region680;
        }
        }
        if (value51 == null) {
            regionValue8191 = regionValue8605;
            regionValue8192 = regionValue8609;
            regionValue8193 = regionValue8606;
            regionValue8194 = regionValue8607;
            break region1026;
        } else {
            regionValue8629 = regionValue8605;
            regionValue8630 = regionValue8606;
            regionValue8631 = regionValue8607;
            regionValue8632 = regionValue8608;
            regionValue8633 = regionValue8609;
            break region681;
        }
        }
        regionValue6965 = regionValue8629;
        regionValue6966 = regionValue8633;
        regionValue6967 = regionValue8630;
        regionValue6968 = regionValue8631;
        regionValue6969 = regionValue8632;
        break region683;
        }
        value8634 = recovery$indy$flow$796();
        value8635 = value8634;
        value8636 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8635))))));
        value8637 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value8636)))).field_42P));
        value8638 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value8637)))).field_42X));
        value8639 = recovery$indy$flow$800(value8638);
        regionValue6891 = regionValue6965;
        regionValue6892 = regionValue6966;
        regionValue6893 = regionValue6967;
        regionValue6894 = regionValue6968;
        regionValue6895 = regionValue6969;
        regionValue6896 = value8639;
        break region696;
        }
        value8640 = regionValue6896;
        value8641 = recovery$indy$flow$801(value8640);
        value8642 = value8641;
        value8643 = 0;
        regionValue8662 = regionValue6891;
        regionValue8663 = regionValue6892;
        regionValue8664 = regionValue6893;
        regionValue8665 = regionValue6894;
        regionValue8666 = regionValue6895;
        regionValue8667 = value8642;
        regionValue8668 = value8643;
        break region702;
        }
        loop702: while (true) {
        java.lang.Object regionValue8953;
        int regionValue8952;
        java.lang.Object regionValue8951;
        int regionValue8950;
        int regionValue8949;
        int regionValue8955;
        java.lang.Object regionValue8954;
        int incremented9252;

        region793: {
        int regionValue9189;
        int regionValue9188;
        java.lang.Object regionValue9187;
        java.lang.Object regionValue9186;
        int regionValue9185;
        java.lang.Object regionValue9184;
        int regionValue9183;
        int value9251;

        region792: {
        int regionValue9236;
        int value9250;
        java.lang.Object value9249;
        java.lang.Object value9248;
        java.lang.Object value9245;
        int value9244;
        int value9243;
        java.lang.Object value9241;
        java.lang.Object value9240;
        java.lang.Object value9239;
        java.lang.Object value9238;
        java.lang.Object value9237;
        java.lang.Object regionValue9235;
        java.lang.Object regionValue9234;
        int regionValue9233;
        java.lang.Object regionValue9232;
        int computed9242;

        region754: {
        int regionValue9213;
        int regionValue9212;
        java.lang.Object regionValue9211;
        java.lang.Object regionValue9210;
        int regionValue9209;
        java.lang.Object regionValue9208;

        region750: {
        int regionValue9006;
        int regionValue9005;
        java.lang.Object regionValue9004;
        java.lang.Object regionValue9003;
        int regionValue9002;
        java.lang.Object regionValue9001;
        int regionValue9000;

        region749: {
        int regionValue9059;
        int regionValue9058;
        java.lang.Object regionValue9057;
        java.lang.Object regionValue9056;
        int regionValue9055;
        java.lang.Object regionValue9054;
        int regionValue9053;

        region748: {
        boolean value9164;
        java.lang.Object value9163;
        int regionValue9135;
        java.lang.Object regionValue9134;
        java.lang.Object regionValue9133;
        int regionValue9132;
        java.lang.Object regionValue9131;
        int regionValue9130;

        region736: {
        int regionValue9160;
        java.lang.Object regionValue9159;
        java.lang.Object regionValue9158;
        int regionValue9157;
        java.lang.Object regionValue9156;
        int regionValue9155;
        int regionValue9154;

        region735: {
        int regionValue9110;
        java.lang.Object regionValue9109;
        java.lang.Object regionValue9108;
        int regionValue9107;
        java.lang.Object regionValue9106;
        int regionValue9104;
        int regionValue9111;
        int regionValue9105;

        region734: {
        int regionValue9085;
        int regionValue9084;
        java.lang.Object regionValue9083;
        java.lang.Object regionValue9082;
        int regionValue9081;
        java.lang.Object regionValue9080;
        int regionValue9079;
        int regionValue9078;

        region732: {
        int regionValue9033;
        int regionValue9032;
        java.lang.Object regionValue9031;
        java.lang.Object regionValue9030;
        int regionValue9029;
        java.lang.Object regionValue9028;
        int regionValue9026;
        int regionValue9027;

        region731: {
        int regionValue8797;
        int regionValue8796;
        java.lang.Object regionValue8795;
        java.lang.Object regionValue8794;
        int regionValue8793;
        java.lang.Object regionValue8792;
        int regionValue8790;
        int regionValue8791;

        region729: {
        int regionValue8878;
        int regionValue8877;
        java.lang.Object regionValue8876;
        java.lang.Object regionValue8875;
        int regionValue8874;
        java.lang.Object regionValue8873;
        int regionValue8872;
        int regionValue8871;

        region728: {
        java.lang.Object regionValue8976;
        int regionValue8980;
        java.lang.Object regionValue8979;
        java.lang.Object regionValue8978;
        int regionValue8977;
        int regionValue8975;
        int regionValue8974;
        int arrayValue8981;

        region723: {
        int regionValue8929;
        java.lang.Object regionValue8928;
        java.lang.Object regionValue8927;
        int regionValue8926;
        java.lang.Object regionValue8925;
        int regionValue8924;
        int regionValue8923;
        int regionValue8930;

        region722: {
        int regionValue8904;
        int regionValue8903;
        java.lang.Object regionValue8902;
        java.lang.Object regionValue8901;
        int regionValue8900;
        java.lang.Object regionValue8899;
        int regionValue8898;
        int regionValue8897;

        region720: {
        int regionValue8851;
        int regionValue8850;
        java.lang.Object regionValue8849;
        java.lang.Object regionValue8848;
        int regionValue8847;
        java.lang.Object regionValue8846;
        int regionValue8845;
        int regionValue8844;

        region719: {
        int regionValue8824;
        int regionValue8823;
        java.lang.Object regionValue8822;
        java.lang.Object regionValue8821;
        int regionValue8820;
        java.lang.Object regionValue8819;
        int regionValue8818;
        int regionValue8817;

        region717: {
        int regionValue8770;
        int regionValue8769;
        java.lang.Object regionValue8768;
        java.lang.Object regionValue8767;
        int regionValue8766;
        java.lang.Object regionValue8765;
        int regionValue8764;
        int regionValue8763;

        region715: {
        int regionValue8744;
        int regionValue8743;
        java.lang.Object regionValue8742;
        java.lang.Object regionValue8741;
        int regionValue8740;
        java.lang.Object regionValue8739;
        int regionValue8738;
        int regionValue8737;

        region712: {
        boolean value8718;
        int regionValue8716;
        java.lang.Object regionValue8715;
        int regionValue8713;
        java.lang.Object regionValue8712;
        int regionValue8711;
        int regionValue8710;
        java.lang.Object regionValue8714;
        java.lang.Object arrayValue8717;

        region705: {
        if (regionValue8668 >= 3) {
            regionValue8687 = regionValue8662;
            regionValue8688 = regionValue8663;
            regionValue8689 = regionValue8664;
            regionValue8690 = regionValue8665;
            regionValue8691 = regionValue8666;
            break region796;
        } else {
            regionValue8710 = regionValue8662;
            regionValue8711 = regionValue8663;
            regionValue8712 = regionValue8664;
            regionValue8713 = regionValue8665;
            regionValue8714 = regionValue8666;
            regionValue8715 = regionValue8667;
            regionValue8716 = regionValue8668;
            break region705;
        }
        }
        arrayValue8717 = ((java.lang.Object[]) value601)[regionValue8716];
        value8718 = recovery$indy$flow$802(regionValue8715, arrayValue8717);
        if (value51 != null) {
            regionValue648 = regionValue8713;
            regionValue651 = regionValue8712;
            regionValue652 = regionValue8710;
            regionValue653 = regionValue8711;
            regionValue654 = (int) ((value8718 ? 1 : 0));
            continue loop267;
        } else {
            regionValue8737 = regionValue8710;
            regionValue8738 = regionValue8711;
            regionValue8739 = regionValue8712;
            regionValue8740 = regionValue8713;
            regionValue8741 = regionValue8714;
            regionValue8742 = regionValue8715;
            regionValue8743 = regionValue8716;
            regionValue8744 = (int) ((value8718 ? 1 : 0));
            break region712;
        }
        }
        if (a2 >= 0) {
            regionValue711 = regionValue8744;
            break region1037;
        } else {
            regionValue8763 = regionValue8737;
            regionValue8764 = regionValue8738;
            regionValue8765 = regionValue8739;
            regionValue8766 = regionValue8740;
            regionValue8767 = regionValue8741;
            regionValue8768 = regionValue8742;
            regionValue8769 = regionValue8743;
            regionValue8770 = regionValue8744;
            break region715;
        }
        }
        if (a0 <= 0) {
            regionValue8790 = regionValue8763;
            regionValue8791 = regionValue8764;
            regionValue8792 = regionValue8765;
            regionValue8793 = regionValue8766;
            regionValue8794 = regionValue8767;
            regionValue8795 = regionValue8768;
            regionValue8796 = regionValue8769;
            regionValue8797 = regionValue8770;
            break region729;
        } else {
            regionValue8817 = regionValue8763;
            regionValue8818 = regionValue8764;
            regionValue8819 = regionValue8765;
            regionValue8820 = regionValue8766;
            regionValue8821 = regionValue8767;
            regionValue8822 = regionValue8768;
            regionValue8823 = regionValue8769;
            regionValue8824 = regionValue8770;
            break region717;
        }
        }
        regionValue8844 = regionValue8817;
        regionValue8845 = regionValue8818;
        regionValue8846 = regionValue8819;
        regionValue8847 = regionValue8820;
        regionValue8848 = regionValue8821;
        regionValue8849 = regionValue8822;
        regionValue8850 = regionValue8823;
        regionValue8851 = regionValue8824;
        break region719;
        }
        if (value51 != null) {
            regionValue8871 = regionValue8844;
            regionValue8872 = regionValue8845;
            regionValue8873 = regionValue8846;
            regionValue8874 = regionValue8847;
            regionValue8875 = regionValue8848;
            regionValue8876 = regionValue8849;
            regionValue8877 = regionValue8850;
            regionValue8878 = regionValue8851;
            break region728;
        } else {
            regionValue8897 = regionValue8844;
            regionValue8898 = regionValue8845;
            regionValue8899 = regionValue8846;
            regionValue8900 = regionValue8847;
            regionValue8901 = regionValue8848;
            regionValue8902 = regionValue8849;
            regionValue8903 = regionValue8850;
            regionValue8904 = regionValue8851;
            break region720;
        }
        }
        regionValue8923 = regionValue8897;
        regionValue8924 = regionValue8898;
        regionValue8925 = regionValue8899;
        regionValue8926 = regionValue8900;
        regionValue8927 = regionValue8901;
        regionValue8928 = regionValue8902;
        regionValue8929 = regionValue8903;
        regionValue8930 = regionValue8904;
        break region722;
        }
        if (regionValue8930 == 0) {
            regionValue8949 = regionValue8923;
            regionValue8950 = regionValue8924;
            regionValue8951 = regionValue8925;
            regionValue8952 = regionValue8926;
            regionValue8953 = regionValue8927;
            regionValue8954 = regionValue8928;
            regionValue8955 = regionValue8929;
            break region793;
        } else {
            regionValue8974 = regionValue8923;
            regionValue8975 = regionValue8924;
            regionValue8976 = regionValue8925;
            regionValue8977 = regionValue8926;
            regionValue8978 = regionValue8927;
            regionValue8979 = regionValue8928;
            regionValue8980 = regionValue8929;
            break region723;
        }
        }
        arrayValue8981 = (regionValue8976 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue8976)[regionValue8980] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue8976)[regionValue8980]);
        regionValue8871 = regionValue8974;
        regionValue8872 = regionValue8975;
        regionValue8873 = regionValue8976;
        regionValue8874 = regionValue8977;
        regionValue8875 = regionValue8978;
        regionValue8876 = regionValue8979;
        regionValue8877 = regionValue8980;
        regionValue8878 = arrayValue8981;
        break region728;
        }
        regionValue8790 = regionValue8871;
        regionValue8791 = regionValue8872;
        regionValue8792 = regionValue8873;
        regionValue8793 = regionValue8874;
        regionValue8794 = regionValue8875;
        regionValue8795 = regionValue8876;
        regionValue8796 = regionValue8877;
        regionValue8797 = regionValue8878;
        break region729;
        }
        if (a2 >= 0) {
            regionValue9000 = regionValue8790;
            regionValue9001 = regionValue8792;
            regionValue9002 = regionValue8793;
            regionValue9003 = regionValue8794;
            regionValue9004 = regionValue8795;
            regionValue9005 = regionValue8796;
            regionValue9006 = regionValue8797;
            break region749;
        } else {
            regionValue9026 = regionValue8790;
            regionValue9027 = regionValue8791;
            regionValue9028 = regionValue8792;
            regionValue9029 = regionValue8793;
            regionValue9030 = regionValue8794;
            regionValue9031 = regionValue8795;
            regionValue9032 = regionValue8796;
            regionValue9033 = regionValue8797;
            break region731;
        }
        }
        if (value51 != null) {
            regionValue9053 = regionValue9026;
            regionValue9054 = regionValue9028;
            regionValue9055 = regionValue9029;
            regionValue9056 = regionValue9030;
            regionValue9057 = regionValue9031;
            regionValue9058 = regionValue9032;
            regionValue9059 = regionValue9033;
            break region748;
        } else {
            regionValue9078 = regionValue9026;
            regionValue9079 = regionValue9027;
            regionValue9080 = regionValue9028;
            regionValue9081 = regionValue9029;
            regionValue9082 = regionValue9030;
            regionValue9083 = regionValue9031;
            regionValue9084 = regionValue9032;
            regionValue9085 = regionValue9033;
            break region732;
        }
        }
        regionValue9104 = regionValue9078;
        regionValue9105 = regionValue9079;
        regionValue9106 = regionValue9080;
        regionValue9107 = regionValue9081;
        regionValue9108 = regionValue9082;
        regionValue9109 = regionValue9083;
        regionValue9110 = regionValue9084;
        regionValue9111 = regionValue9085;
        break region734;
        }
        if (regionValue9111 == 0) {
            regionValue9130 = regionValue9104;
            regionValue9131 = regionValue9106;
            regionValue9132 = regionValue9107;
            regionValue9133 = regionValue9108;
            regionValue9134 = regionValue9109;
            regionValue9135 = regionValue9110;
            break region736;
        } else {
            regionValue9154 = regionValue9104;
            regionValue9155 = regionValue9105;
            regionValue9156 = regionValue9106;
            regionValue9157 = regionValue9107;
            regionValue9158 = regionValue9108;
            regionValue9159 = regionValue9109;
            regionValue9160 = regionValue9110;
            break region735;
        }
        }
        regionValue8949 = regionValue9154;
        regionValue8950 = regionValue9155;
        regionValue8951 = regionValue9156;
        regionValue8952 = regionValue9157;
        regionValue8953 = regionValue9158;
        regionValue8954 = regionValue9159;
        regionValue8955 = regionValue9160;
        break region793;
        }
        value9163 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value9164 = recovery$indy$flow$804(value9163, computed37);
        regionValue9053 = regionValue9130;
        regionValue9054 = regionValue9131;
        regionValue9055 = regionValue9132;
        regionValue9056 = regionValue9133;
        regionValue9057 = regionValue9134;
        regionValue9058 = regionValue9135;
        regionValue9059 = (int) ((value9164 ? 1 : 0));
        break region748;
        }
        regionValue9000 = regionValue9053;
        regionValue9001 = regionValue9054;
        regionValue9002 = regionValue9055;
        regionValue9003 = regionValue9056;
        regionValue9004 = regionValue9057;
        regionValue9005 = regionValue9058;
        regionValue9006 = regionValue9059;
        break region749;
        }
        if (value51 != null) {
            regionValue9183 = regionValue9000;
            regionValue9184 = regionValue9001;
            regionValue9185 = regionValue9002;
            regionValue9186 = regionValue9003;
            regionValue9187 = regionValue9004;
            regionValue9188 = regionValue9005;
            regionValue9189 = regionValue9006;
            break region792;
        } else {
            regionValue9208 = regionValue9001;
            regionValue9209 = regionValue9002;
            regionValue9210 = regionValue9003;
            regionValue9211 = regionValue9004;
            regionValue9212 = regionValue9005;
            regionValue9213 = regionValue9006;
            break region750;
        }
        }
        if (regionValue9213 == 0) {
            regionValue9232 = regionValue9208;
            regionValue9233 = regionValue9209;
            regionValue9234 = regionValue9210;
            regionValue9235 = regionValue9211;
            regionValue9236 = regionValue9212;
            break region754;
        } else {
            break region751;
        }
        }
        value9237 = recovery$indy$flow$805();
        value9238 = value9237;
        value9239 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9238))))));
        value9240 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9239)))).field_42P));
        value9241 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value9240)))).field_429));
        computed9242 = regionValue9236 + 1;
        value9243 = 0;
        value9244 = computed9242;
        value9245 = value9241;
        value9248 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value9249 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value9245))))));
        recovery$indy$flow$811(value9248, computed23, value9249, value9244, value9243);
        value9250 = 1;
        regionValue9183 = value9250;
        regionValue9184 = regionValue9232;
        regionValue9185 = regionValue9233;
        regionValue9186 = regionValue9234;
        regionValue9187 = regionValue9235;
        regionValue9188 = regionValue9236;
        regionValue9189 = 0;
        break region792;
        }
        value9251 = regionValue9189;
        regionValue8949 = regionValue9183;
        regionValue8950 = value9251;
        regionValue8951 = regionValue9184;
        regionValue8952 = regionValue9185;
        regionValue8953 = regionValue9186;
        regionValue8954 = regionValue9187;
        regionValue8955 = regionValue9188;
        break region793;
        }
        incremented9252 = regionValue8955 + (1);
        if (value51 == null) {
            regionValue8662 = regionValue8949;
            regionValue8663 = regionValue8950;
            regionValue8664 = regionValue8951;
            regionValue8665 = regionValue8952;
            regionValue8666 = regionValue8953;
            regionValue8667 = regionValue8954;
            regionValue8668 = incremented9252;
            continue loop702;
        } else {
            regionValue8687 = regionValue8949;
            regionValue8688 = regionValue8950;
            regionValue8689 = regionValue8951;
            regionValue8690 = regionValue8952;
            regionValue8691 = regionValue8953;
            break region796;
        }
        }
        }
        if (a2 >= 0) {
            regionValue9271 = regionValue8687;
            regionValue9272 = regionValue8688;
            regionValue9273 = regionValue8689;
            regionValue9274 = regionValue8690;
            break region1028;
        } else {
            regionValue9294 = regionValue8687;
            regionValue9295 = regionValue8688;
            regionValue9296 = regionValue8689;
            regionValue9297 = regionValue8690;
            regionValue9298 = regionValue8691;
            break region799;
        }
        }
        if (a2 >= 0) {
            regionValue3451 = regionValue9297;
            regionValue3454 = regionValue9296;
            regionValue3455 = regionValue9294;
            regionValue3456 = regionValue9295;
            break region1030;
        } else {
            regionValue9318 = regionValue9294;
            regionValue9319 = regionValue9295;
            regionValue9320 = regionValue9296;
            regionValue9321 = regionValue9297;
            regionValue9322 = regionValue9298;
            break region801;
        }
        }
        regionValue9342 = regionValue9318;
        regionValue9343 = regionValue9319;
        regionValue9344 = regionValue9320;
        regionValue9345 = regionValue9321;
        regionValue9346 = regionValue9322;
        break region803;
        }
        if (value51 == null) {
            regionValue8191 = regionValue9342;
            regionValue8192 = regionValue9343;
            regionValue8193 = regionValue9344;
            regionValue8194 = regionValue9345;
            break region1026;
        } else {
            regionValue9366 = regionValue9342;
            regionValue9367 = regionValue9343;
            regionValue9368 = regionValue9344;
            regionValue9369 = regionValue9345;
            regionValue9370 = regionValue9346;
            break region804;
        }
        }
        regionValue6679 = regionValue9366;
        regionValue6680 = regionValue9367;
        regionValue6681 = regionValue9368;
        regionValue6682 = regionValue9369;
        regionValue6683 = regionValue9370;
        break region806;
        }
        regionValue6630 = regionValue6679;
        regionValue6631 = regionValue6680;
        regionValue6632 = regionValue6681;
        regionValue6633 = regionValue6682;
        regionValue6634 = regionValue6683;
        regionValue6635 = regionValue6680;
        break region807;
        }
        regionValue6734 = regionValue6630;
        regionValue6735 = regionValue6631;
        regionValue6736 = regionValue6632;
        regionValue6737 = regionValue6633;
        regionValue6738 = regionValue6634;
        regionValue6739 = regionValue6635;
        break region808;
        }
        if (value51 != null) {
            regionValue9389 = regionValue6734;
            regionValue9390 = regionValue6735;
            regionValue9391 = regionValue6736;
            regionValue9392 = regionValue6737;
            regionValue9393 = regionValue6738;
            regionValue9394 = regionValue6739;
            break region816;
        } else {
            regionValue9413 = regionValue6734;
            regionValue9414 = regionValue6735;
            regionValue9415 = regionValue6736;
            regionValue9416 = regionValue6737;
            regionValue9417 = regionValue6738;
            regionValue9418 = regionValue6739;
            break region809;
        }
        }
        if (regionValue9418 <= 5) {
            regionValue8191 = regionValue9413;
            regionValue8192 = regionValue9414;
            regionValue8193 = regionValue9415;
            regionValue8194 = regionValue9416;
            break region1026;
        } else {
            regionValue9437 = regionValue9413;
            regionValue9438 = regionValue9414;
            regionValue9439 = regionValue9415;
            regionValue9440 = regionValue9416;
            regionValue9441 = regionValue9417;
            break region811;
        }
        }
        regionValue9460 = regionValue9437;
        regionValue9461 = regionValue9438;
        regionValue9462 = regionValue9439;
        regionValue9463 = regionValue9440;
        regionValue9464 = regionValue9441;
        break region813;
        }
        regionValue9389 = regionValue9460;
        regionValue9390 = regionValue9461;
        regionValue9391 = regionValue9462;
        regionValue9392 = regionValue9463;
        regionValue9393 = regionValue9464;
        regionValue9394 = 0;
        break region816;
        }
        value9465 = regionValue9394;
        regionValue9484 = regionValue9389;
        regionValue9485 = regionValue9390;
        regionValue9486 = regionValue9391;
        regionValue9487 = regionValue9392;
        regionValue9488 = regionValue9393;
        regionValue9489 = value9465;
        break region817;
        }
        loop817: while (true) {
        int regionValue11084;
        int regionValue11081;
        java.lang.Object regionValue11080;
        int regionValue11079;
        int regionValue11083;
        java.lang.Object regionValue11082;

        region1023: {
        int regionValue9931;
        java.lang.Object regionValue9930;
        int regionValue9929;
        int regionValue9928;
        int regionValue9933;
        java.lang.Object regionValue9932;

        region1021: {
        int regionValue9765;
        java.lang.Object regionValue9764;
        int regionValue9763;
        java.lang.Object regionValue9762;
        int regionValue9761;
        int regionValue9760;
        int incremented11142;

        region1019: {
        int regionValue10329;
        int regionValue10326;
        java.lang.Object regionValue10325;
        int regionValue10324;
        java.lang.Object regionValue10323;
        int regionValue10322;
        int regionValue10321;
        int regionValue10328;
        java.lang.Object regionValue10327;

        region912: {
        int regionValue9874;
        java.lang.Object regionValue9873;
        int regionValue9872;
        java.lang.Object regionValue9871;
        int regionValue9870;
        java.lang.Object regionValue9869;
        int regionValue9868;
        int regionValue9867;
        int value10302;

        region910: {
        java.lang.Object regionValue10185;
        int regionValue10184;
        int regionValue10183;
        java.lang.Object regionValue10182;
        int regionValue10181;
        java.lang.Object regionValue10180;
        int regionValue10179;
        int regionValue10178;
        int value10301;
        java.lang.Object value10300;

        region904: {
        java.lang.Object regionValue10299;
        int regionValue10298;
        int regionValue10297;
        java.lang.Object regionValue10296;
        int regionValue10295;
        java.lang.Object regionValue10294;
        int regionValue10293;
        int regionValue10292;

        region901: {
        java.lang.Object regionValue10272;
        int regionValue10271;
        int regionValue10270;
        java.lang.Object regionValue10269;
        int regionValue10268;
        java.lang.Object regionValue10267;
        int regionValue10266;
        int regionValue10265;

        region899: {
        int regionValue9848;
        int regionValue9847;
        java.lang.Object regionValue9846;
        int regionValue9845;
        java.lang.Object regionValue9844;
        int regionValue9843;
        java.lang.Object regionValue9842;
        int regionValue9841;
        int regionValue9840;

        region859: {
        int value9821;
        int value9820;
        java.lang.Object value9819;
        int regionValue9818;
        java.lang.Object regionValue9817;
        int regionValue9816;
        java.lang.Object regionValue9815;
        int regionValue9814;
        int regionValue9813;

        region853: {
        int regionValue9794;
        int regionValue9793;
        java.lang.Object regionValue9792;
        int regionValue9791;
        java.lang.Object regionValue9790;
        int regionValue9789;
        int regionValue9788;

        region850: {
        int regionValue9591;
        int regionValue9590;
        java.lang.Object regionValue9589;
        int regionValue9588;
        java.lang.Object regionValue9587;
        int regionValue9586;
        int regionValue9585;

        region849: {
        int regionValue9643;
        int regionValue9642;
        java.lang.Object regionValue9641;
        int regionValue9640;
        java.lang.Object regionValue9639;
        int regionValue9638;
        int regionValue9637;

        region848: {
        boolean value9769;
        java.lang.Object value9768;
        int regionValue9717;
        java.lang.Object regionValue9716;
        int regionValue9715;
        java.lang.Object regionValue9714;
        int regionValue9713;
        int regionValue9712;

        region836: {
        int regionValue9741;
        java.lang.Object regionValue9740;
        int regionValue9739;
        java.lang.Object regionValue9738;
        int regionValue9737;
        int regionValue9736;

        region835: {
        int regionValue9692;
        java.lang.Object regionValue9691;
        int regionValue9690;
        java.lang.Object regionValue9689;
        int regionValue9688;
        int regionValue9687;
        int regionValue9693;

        region834: {
        int regionValue9668;
        int regionValue9667;
        java.lang.Object regionValue9666;
        int regionValue9665;
        java.lang.Object regionValue9664;
        int regionValue9663;
        int regionValue9662;

        region832: {
        int regionValue9617;
        int regionValue9616;
        java.lang.Object regionValue9615;
        int regionValue9614;
        java.lang.Object regionValue9613;
        int regionValue9612;
        int regionValue9611;

        region831: {
        int regionValue9565;
        int regionValue9564;
        java.lang.Object regionValue9563;
        int regionValue9562;
        java.lang.Object regionValue9561;
        int regionValue9560;
        int regionValue9559;

        region829: {
        int regionValue9540;
        int regionValue9537;
        java.lang.Object regionValue9536;
        int regionValue9535;
        int regionValue9534;
        int regionValue9539;
        java.lang.Object regionValue9538;

        region826: {
        java.lang.Object regionValue9511;
        int regionValue9514;
        int regionValue9512;
        int regionValue9510;
        int regionValue9509;
        int arrayValue9515;
        java.lang.Object regionValue9513;

        region821: {
        int length9490;

        length9490 = java.lang.reflect.Array.getLength(value601);
        if (regionValue9489 >= length9490) {
            regionValue8191 = regionValue9484;
            regionValue8192 = regionValue9485;
            regionValue8193 = regionValue9486;
            regionValue8194 = regionValue9487;
            break region1026;
        } else {
            regionValue9509 = regionValue9484;
            regionValue9510 = regionValue9485;
            regionValue9511 = regionValue9486;
            regionValue9512 = regionValue9487;
            regionValue9513 = regionValue9488;
            regionValue9514 = regionValue9489;
            break region821;
        }
        }
        arrayValue9515 = (regionValue9511 instanceof boolean[] ? (((boolean[]) (java.lang.Object) regionValue9511)[regionValue9514] ? 1 : 0) : ((byte[]) (java.lang.Object) regionValue9511)[regionValue9514]);
        if (value51 != null) {
            regionValue648 = regionValue9512;
            regionValue651 = regionValue9511;
            regionValue652 = regionValue9509;
            regionValue653 = regionValue9510;
            regionValue654 = arrayValue9515;
            continue loop267;
        } else {
            regionValue9534 = regionValue9509;
            regionValue9535 = regionValue9510;
            regionValue9536 = regionValue9511;
            regionValue9537 = regionValue9512;
            regionValue9538 = regionValue9513;
            regionValue9539 = regionValue9514;
            regionValue9540 = arrayValue9515;
            break region826;
        }
        }
        if (a0 <= 0) {
            regionValue703 = regionValue9537;
            regionValue706 = regionValue9536;
            regionValue707 = regionValue9534;
            regionValue708 = regionValue9535;
            regionValue709 = regionValue9540;
            continue loop282;
        } else {
            regionValue9559 = regionValue9534;
            regionValue9560 = regionValue9535;
            regionValue9561 = regionValue9536;
            regionValue9562 = regionValue9537;
            regionValue9563 = regionValue9538;
            regionValue9564 = regionValue9539;
            regionValue9565 = regionValue9540;
            break region829;
        }
        }
        if (a2 >= 0) {
            regionValue9585 = regionValue9559;
            regionValue9586 = regionValue9560;
            regionValue9587 = regionValue9561;
            regionValue9588 = regionValue9562;
            regionValue9589 = regionValue9563;
            regionValue9590 = regionValue9564;
            regionValue9591 = regionValue9565;
            break region849;
        } else {
            regionValue9611 = regionValue9559;
            regionValue9612 = regionValue9560;
            regionValue9613 = regionValue9561;
            regionValue9614 = regionValue9562;
            regionValue9615 = regionValue9563;
            regionValue9616 = regionValue9564;
            regionValue9617 = regionValue9565;
            break region831;
        }
        }
        if (value51 != null) {
            regionValue9637 = regionValue9611;
            regionValue9638 = regionValue9612;
            regionValue9639 = regionValue9613;
            regionValue9640 = regionValue9614;
            regionValue9641 = regionValue9615;
            regionValue9642 = regionValue9616;
            regionValue9643 = regionValue9617;
            break region848;
        } else {
            regionValue9662 = regionValue9611;
            regionValue9663 = regionValue9612;
            regionValue9664 = regionValue9613;
            regionValue9665 = regionValue9614;
            regionValue9666 = regionValue9615;
            regionValue9667 = regionValue9616;
            regionValue9668 = regionValue9617;
            break region832;
        }
        }
        regionValue9687 = regionValue9662;
        regionValue9688 = regionValue9663;
        regionValue9689 = regionValue9664;
        regionValue9690 = regionValue9665;
        regionValue9691 = regionValue9666;
        regionValue9692 = regionValue9667;
        regionValue9693 = regionValue9668;
        break region834;
        }
        if (regionValue9693 != 0) {
            regionValue9712 = regionValue9687;
            regionValue9713 = regionValue9688;
            regionValue9714 = regionValue9689;
            regionValue9715 = regionValue9690;
            regionValue9716 = regionValue9691;
            regionValue9717 = regionValue9692;
            break region836;
        } else {
            regionValue9736 = regionValue9687;
            regionValue9737 = regionValue9688;
            regionValue9738 = regionValue9689;
            regionValue9739 = regionValue9690;
            regionValue9740 = regionValue9691;
            regionValue9741 = regionValue9692;
            break region835;
        }
        }
        regionValue9760 = regionValue9736;
        regionValue9761 = regionValue9737;
        regionValue9762 = regionValue9738;
        regionValue9763 = regionValue9739;
        regionValue9764 = regionValue9740;
        regionValue9765 = regionValue9741;
        break region1019;
        }
        value9768 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        value9769 = recovery$indy$flow$813(value9768, computed37);
        regionValue9637 = regionValue9712;
        regionValue9638 = regionValue9713;
        regionValue9639 = regionValue9714;
        regionValue9640 = regionValue9715;
        regionValue9641 = regionValue9716;
        regionValue9642 = regionValue9717;
        regionValue9643 = (int) ((value9769 ? 1 : 0));
        break region848;
        }
        regionValue9585 = regionValue9637;
        regionValue9586 = regionValue9638;
        regionValue9587 = regionValue9639;
        regionValue9588 = regionValue9640;
        regionValue9589 = regionValue9641;
        regionValue9590 = regionValue9642;
        regionValue9591 = regionValue9643;
        break region849;
        }
        if (value51 != null) {
            regionValue4641 = regionValue9591;
            break region852;
        } else {
            regionValue9788 = regionValue9585;
            regionValue9789 = regionValue9586;
            regionValue9790 = regionValue9587;
            regionValue9791 = regionValue9588;
            regionValue9792 = regionValue9589;
            regionValue9793 = regionValue9590;
            regionValue9794 = regionValue9591;
            break region850;
        }
        }
        if (regionValue9794 == 0) {
            regionValue9813 = regionValue9788;
            regionValue9814 = regionValue9789;
            regionValue9815 = regionValue9790;
            regionValue9816 = regionValue9791;
            regionValue9817 = regionValue9792;
            regionValue9818 = regionValue9793;
            break region853;
        } else {
            break region851;
        }
        }
        value9819 = null;
        value9820 = 0;
        value9821 = 0;
        regionValue9840 = regionValue9813;
        regionValue9841 = regionValue9814;
        regionValue9842 = regionValue9815;
        regionValue9843 = regionValue9816;
        regionValue9844 = regionValue9817;
        regionValue9845 = regionValue9818;
        regionValue9846 = value9819;
        regionValue9847 = value9820;
        regionValue9848 = value9821;
        break region859;
        }
        loop859: while (true) {
        int regionValue9990;
        int regionValue9989;
        java.lang.Object regionValue9988;
        int regionValue9987;
        java.lang.Object regionValue9986;
        int regionValue9985;
        java.lang.Object regionValue9984;
        int regionValue9983;
        int regionValue9982;

        region909: {
        int regionValue10131;
        int regionValue10130;
        java.lang.Object regionValue10129;
        int regionValue10128;
        java.lang.Object regionValue10127;
        int regionValue10126;
        java.lang.Object regionValue10125;
        int regionValue10124;
        int regionValue10123;
        int incremented10273;

        region908: {
        int regionValue10238;
        int regionValue10241;
        java.lang.Object regionValue10237;
        int regionValue10236;
        java.lang.Object regionValue10235;
        int regionValue10234;
        int regionValue10233;
        boolean value10246;
        java.lang.Object value10244;
        java.lang.Object regionValue10243;
        java.lang.Object regionValue10242;
        int regionValue10240;
        java.lang.Object regionValue10239;
        java.lang.Object arrayValue10245;

        region893: {
        java.lang.Object regionValue10214;
        java.lang.Object regionValue10213;
        int regionValue10212;
        int regionValue10211;
        java.lang.Object regionValue10210;
        int regionValue10209;
        java.lang.Object regionValue10208;
        int regionValue10207;
        java.lang.Object regionValue10206;
        int regionValue10205;
        int regionValue10204;

        region891: {
        java.lang.Object regionValue10159;
        int regionValue10158;
        int regionValue10155;
        java.lang.Object regionValue10154;
        int regionValue10153;
        java.lang.Object regionValue10152;
        int regionValue10151;
        int regionValue10150;
        int regionValue10157;
        java.lang.Object regionValue10156;

        region888: {
        int regionValue10102;
        int regionValue10101;
        java.lang.Object regionValue10100;
        int regionValue10099;
        java.lang.Object regionValue10098;
        int regionValue10097;
        java.lang.Object regionValue10096;
        int regionValue10095;
        int regionValue10094;
        java.lang.Object regionValue10104;
        java.lang.Object regionValue10103;

        region887: {
        java.lang.Object regionValue10075;
        java.lang.Object regionValue10074;
        int regionValue10073;
        int regionValue10072;
        java.lang.Object regionValue10071;
        int regionValue10070;
        java.lang.Object regionValue10069;
        int regionValue10068;
        java.lang.Object regionValue10067;
        int regionValue10066;
        int regionValue10065;

        region885: {
        java.lang.Object regionValue10046;
        java.lang.Object regionValue10041;
        int regionValue10040;
        java.lang.Object regionValue10039;
        int regionValue10038;
        int regionValue10037;
        int regionValue10045;
        int regionValue10044;
        java.lang.Object regionValue10043;
        int regionValue10042;

        region882: {
        java.lang.Object regionValue10018;
        int regionValue10017;
        int regionValue10016;
        java.lang.Object regionValue10015;
        int regionValue10014;
        java.lang.Object regionValue10013;
        int regionValue10012;
        java.lang.Object regionValue10011;
        int regionValue10010;
        int regionValue10009;

        region880: {
        int regionValue9961;
        int regionValue9960;
        java.lang.Object regionValue9959;
        int regionValue9958;
        java.lang.Object regionValue9957;
        int regionValue9956;
        java.lang.Object regionValue9955;
        int regionValue9954;
        int regionValue9953;
        java.lang.Object regionValue9962;

        region879: {
        int regionValue9901;
        int regionValue9898;
        java.lang.Object regionValue9897;
        int regionValue9896;
        java.lang.Object regionValue9895;
        int regionValue9894;
        int regionValue9893;
        java.lang.Object value9909;
        java.lang.Object value9908;
        java.lang.Object value9907;
        java.lang.Object value9906;
        java.lang.Object value9905;
        java.lang.Object value9904;
        java.lang.Object value9903;
        java.lang.Object value9902;
        int regionValue9900;
        java.lang.Object regionValue9899;

        region862: {
        if (regionValue9848 >= 5) {
            regionValue9867 = regionValue9840;
            regionValue9868 = regionValue9841;
            regionValue9869 = regionValue9842;
            regionValue9870 = regionValue9843;
            regionValue9871 = regionValue9844;
            regionValue9872 = regionValue9845;
            regionValue9873 = regionValue9846;
            regionValue9874 = regionValue9847;
            break region910;
        } else {
            regionValue9893 = regionValue9840;
            regionValue9894 = regionValue9841;
            regionValue9895 = regionValue9842;
            regionValue9896 = regionValue9843;
            regionValue9897 = regionValue9844;
            regionValue9898 = regionValue9845;
            regionValue9899 = regionValue9846;
            regionValue9900 = regionValue9847;
            regionValue9901 = regionValue9848;
            break region862;
        }
        }
        value9902 = recovery$indy$flow$814();
        value9903 = value9902;
        value9904 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9903))))));
        value9905 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9904)))).field_42P));
        value9906 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value9905)))).field_429));
        value9907 = recovery$indy$flow$818(value9906, regionValue9901);
        value9908 = recovery$indy$flow$819(value9907);
        value9909 = value9908;
        if (a0 <= 0) {
            regionValue9928 = regionValue9893;
            regionValue9929 = regionValue9894;
            regionValue9930 = regionValue9895;
            regionValue9931 = regionValue9896;
            regionValue9932 = regionValue9897;
            regionValue9933 = regionValue9898;
            break region1021;
        } else {
            regionValue9953 = regionValue9893;
            regionValue9954 = regionValue9894;
            regionValue9955 = regionValue9895;
            regionValue9956 = regionValue9896;
            regionValue9957 = regionValue9897;
            regionValue9958 = regionValue9898;
            regionValue9959 = regionValue9899;
            regionValue9960 = regionValue9900;
            regionValue9961 = regionValue9901;
            regionValue9962 = value9909;
            break region879;
        }
        }
        if (value51 != null) {
            regionValue9982 = regionValue9953;
            regionValue9983 = regionValue9954;
            regionValue9984 = regionValue9955;
            regionValue9985 = regionValue9956;
            regionValue9986 = regionValue9957;
            regionValue9987 = regionValue9958;
            regionValue9988 = regionValue9959;
            regionValue9989 = regionValue9960;
            regionValue9990 = regionValue9961;
            break region909;
        } else {
            regionValue10009 = regionValue9953;
            regionValue10010 = regionValue9954;
            regionValue10011 = regionValue9955;
            regionValue10012 = regionValue9956;
            regionValue10013 = regionValue9957;
            regionValue10014 = regionValue9958;
            regionValue10015 = regionValue9959;
            regionValue10016 = regionValue9960;
            regionValue10017 = regionValue9961;
            regionValue10018 = regionValue9962;
            break region880;
        }
        }
        regionValue10037 = regionValue10009;
        regionValue10038 = regionValue10010;
        regionValue10039 = regionValue10011;
        regionValue10040 = regionValue10012;
        regionValue10041 = regionValue10013;
        regionValue10042 = regionValue10014;
        regionValue10043 = regionValue10015;
        regionValue10044 = regionValue10016;
        regionValue10045 = regionValue10017;
        regionValue10046 = regionValue10018;
        break region882;
        }
        if (value51 != null) {
            regionValue6110 = regionValue10037;
            regionValue6111 = regionValue10038;
            regionValue6112 = regionValue10039;
            regionValue6113 = regionValue10040;
            regionValue6114 = regionValue10041;
            regionValue6115 = regionValue10046;
            continue loop362;
        } else {
            regionValue10065 = regionValue10037;
            regionValue10066 = regionValue10038;
            regionValue10067 = regionValue10039;
            regionValue10068 = regionValue10040;
            regionValue10069 = regionValue10041;
            regionValue10070 = regionValue10042;
            regionValue10071 = regionValue10043;
            regionValue10072 = regionValue10044;
            regionValue10073 = regionValue10045;
            regionValue10074 = regionValue10046;
            regionValue10075 = regionValue10046;
            break region885;
        }
        }
        regionValue10094 = regionValue10065;
        regionValue10095 = regionValue10066;
        regionValue10096 = regionValue10067;
        regionValue10097 = regionValue10068;
        regionValue10098 = regionValue10069;
        regionValue10099 = regionValue10070;
        regionValue10100 = regionValue10071;
        regionValue10101 = regionValue10072;
        regionValue10102 = regionValue10073;
        regionValue10103 = regionValue10074;
        regionValue10104 = regionValue10075;
        break region887;
        }
        if (regionValue10104 == null) {
            regionValue10123 = regionValue10094;
            regionValue10124 = regionValue10095;
            regionValue10125 = regionValue10096;
            regionValue10126 = regionValue10097;
            regionValue10127 = regionValue10098;
            regionValue10128 = regionValue10099;
            regionValue10129 = regionValue10100;
            regionValue10130 = regionValue10101;
            regionValue10131 = regionValue10102;
            break region908;
        } else {
            regionValue10150 = regionValue10094;
            regionValue10151 = regionValue10095;
            regionValue10152 = regionValue10096;
            regionValue10153 = regionValue10097;
            regionValue10154 = regionValue10098;
            regionValue10155 = regionValue10099;
            regionValue10156 = regionValue10100;
            regionValue10157 = regionValue10101;
            regionValue10158 = regionValue10102;
            regionValue10159 = regionValue10103;
            break region888;
        }
        }
        if (value51 != null) {
            regionValue10178 = regionValue10150;
            regionValue10179 = regionValue10151;
            regionValue10180 = regionValue10152;
            regionValue10181 = regionValue10153;
            regionValue10182 = regionValue10154;
            regionValue10183 = regionValue10155;
            regionValue10184 = regionValue10158;
            regionValue10185 = regionValue10159;
            break region904;
        } else {
            regionValue10204 = regionValue10150;
            regionValue10205 = regionValue10151;
            regionValue10206 = regionValue10152;
            regionValue10207 = regionValue10153;
            regionValue10208 = regionValue10154;
            regionValue10209 = regionValue10155;
            regionValue10210 = regionValue10156;
            regionValue10211 = regionValue10157;
            regionValue10212 = regionValue10158;
            regionValue10213 = regionValue10159;
            regionValue10214 = regionValue10159;
            break region891;
        }
        }
        regionValue10233 = regionValue10204;
        regionValue10234 = regionValue10205;
        regionValue10235 = regionValue10206;
        regionValue10236 = regionValue10207;
        regionValue10237 = regionValue10208;
        regionValue10238 = regionValue10209;
        regionValue10239 = regionValue10210;
        regionValue10240 = regionValue10211;
        regionValue10241 = regionValue10212;
        regionValue10242 = regionValue10213;
        regionValue10243 = regionValue10214;
        break region893;
        }
        value10244 = recovery$indy$flow$820(regionValue10243);
        arrayValue10245 = ((java.lang.Object[]) value601)[regionValue10238];
        value10246 = recovery$indy$flow$821(value10244, arrayValue10245);
        if ((int) ((value10246 ? 1 : 0)) == 0) {
            regionValue10123 = regionValue10233;
            regionValue10124 = regionValue10234;
            regionValue10125 = regionValue10235;
            regionValue10126 = regionValue10236;
            regionValue10127 = regionValue10237;
            regionValue10128 = regionValue10238;
            regionValue10129 = regionValue10239;
            regionValue10130 = regionValue10240;
            regionValue10131 = regionValue10241;
            break region908;
        } else {
            regionValue10265 = regionValue10233;
            regionValue10266 = regionValue10234;
            regionValue10267 = regionValue10235;
            regionValue10268 = regionValue10236;
            regionValue10269 = regionValue10237;
            regionValue10270 = regionValue10238;
            regionValue10271 = regionValue10241;
            regionValue10272 = regionValue10242;
            break region899;
        }
        }
        incremented10273 = regionValue10131 + (1);
        regionValue9982 = regionValue10123;
        regionValue9983 = regionValue10124;
        regionValue9984 = regionValue10125;
        regionValue9985 = regionValue10126;
        regionValue9986 = regionValue10127;
        regionValue9987 = regionValue10128;
        regionValue9988 = regionValue10129;
        regionValue9989 = regionValue10130;
        regionValue9990 = incremented10273;
        break region909;
        }
        regionValue9840 = regionValue9982;
        regionValue9841 = regionValue9983;
        regionValue9842 = regionValue9984;
        regionValue9843 = regionValue9985;
        regionValue9844 = regionValue9986;
        regionValue9845 = regionValue9987;
        regionValue9846 = regionValue9988;
        regionValue9847 = regionValue9989;
        regionValue9848 = regionValue9990;
        continue loop859;
        }
        }
        regionValue10292 = regionValue10265;
        regionValue10293 = regionValue10266;
        regionValue10294 = regionValue10267;
        regionValue10295 = regionValue10268;
        regionValue10296 = regionValue10269;
        regionValue10297 = regionValue10270;
        regionValue10298 = regionValue10271;
        regionValue10299 = regionValue10272;
        break region901;
        }
        regionValue10178 = regionValue10292;
        regionValue10179 = regionValue10293;
        regionValue10180 = regionValue10294;
        regionValue10181 = regionValue10295;
        regionValue10182 = regionValue10296;
        regionValue10183 = regionValue10297;
        regionValue10184 = regionValue10298;
        regionValue10185 = regionValue10299;
        break region904;
        }
        value10300 = regionValue10185;
        value10301 = regionValue10184;
        regionValue9867 = regionValue10178;
        regionValue9868 = regionValue10179;
        regionValue9869 = regionValue10180;
        regionValue9870 = regionValue10181;
        regionValue9871 = regionValue10182;
        regionValue9872 = regionValue10183;
        regionValue9873 = value10300;
        regionValue9874 = value10301;
        break region910;
        }
        value10302 = 9;
        regionValue10321 = regionValue9867;
        regionValue10322 = regionValue9868;
        regionValue10323 = regionValue9869;
        regionValue10324 = regionValue9870;
        regionValue10325 = regionValue9871;
        regionValue10326 = regionValue9872;
        regionValue10327 = regionValue9873;
        regionValue10328 = regionValue9874;
        regionValue10329 = value10302;
        break region912;
        }
        loop912: while (true) {
        int regionValue10395;
        java.lang.Object regionValue10394;
        int regionValue10393;
        java.lang.Object regionValue10392;
        int regionValue10391;
        int regionValue10390;
        int regionValue10398;
        int regionValue10397;
        java.lang.Object regionValue10396;

        region1018: {
        int regionValue10455;
        int regionValue10454;
        java.lang.Object regionValue10453;
        int regionValue10452;
        java.lang.Object regionValue10451;
        int regionValue10450;
        java.lang.Object regionValue10449;
        int regionValue10448;
        int regionValue10447;

        region1017: {
        int regionValue10596;
        int regionValue10595;
        java.lang.Object regionValue10594;
        int regionValue10593;
        java.lang.Object regionValue10592;
        int regionValue10591;
        java.lang.Object regionValue10590;
        int regionValue10589;
        int regionValue10588;
        int incremented11141;

        region1016: {
        int regionValue11140;
        int regionValue11139;
        int regionValue11138;
        java.lang.Object regionValue11137;
        int regionValue11136;
        java.lang.Object regionValue11135;
        int regionValue11134;
        java.lang.Object regionValue11133;
        int regionValue11132;

        region1014: {
        int regionValue11112;
        int regionValue11108;
        java.lang.Object regionValue11107;
        int regionValue11106;
        java.lang.Object regionValue11105;
        int regionValue11104;
        int regionValue11111;
        int regionValue11110;
        java.lang.Object regionValue11109;

        region1013: {
        int regionValue10992;
        java.lang.Object regionValue10991;
        int regionValue10990;
        java.lang.Object regionValue10989;
        int regionValue10988;
        int value11060;
        int regionValue10996;
        int regionValue10995;
        int regionValue10994;
        java.lang.Object regionValue10993;

        region1009: {
        int regionValue10735;
        int regionValue10736;
        java.lang.Object regionValue10734;
        int regionValue10733;
        java.lang.Object regionValue10732;
        int regionValue10731;
        java.lang.Object regionValue10730;
        int value11059;
        java.lang.Object value11058;
        int value11056;
        int value11055;
        int value11053;
        short converted11052;
        short converted11051;

        region983: {
        int regionValue11050;
        int regionValue11049;
        java.lang.Object regionValue11048;
        int regionValue11047;
        java.lang.Object regionValue11046;
        int regionValue11045;
        java.lang.Object regionValue11044;

        region981: {
        java.lang.Object regionValue11021;
        int regionValue11023;
        int regionValue11022;
        int regionValue11020;
        java.lang.Object regionValue11019;
        int regionValue11018;
        java.lang.Object regionValue11017;
        int value11025;
        int regionValue11024;
        int regionValue11016;
        int regionValue11015;

        region978: {
        int regionValue10823;
        int regionValue10822;
        int regionValue10821;
        java.lang.Object regionValue10820;
        int regionValue10819;
        java.lang.Object regionValue10818;
        int regionValue10817;
        java.lang.Object regionValue10816;
        int regionValue10814;
        int regionValue10815;

        region977: {
        int regionValue10882;
        int regionValue10881;
        int regionValue10880;
        java.lang.Object regionValue10879;
        int regionValue10878;
        java.lang.Object regionValue10877;
        int regionValue10876;
        java.lang.Object regionValue10875;
        int regionValue10874;
        int regionValue10873;

        region976: {
        int value10969;
        java.lang.Object regionValue10968;
        int regionValue10967;
        int regionValue10966;
        java.lang.Object regionValue10965;
        int regionValue10964;
        java.lang.Object regionValue10963;
        int regionValue10962;
        java.lang.Object regionValue10961;
        int regionValue10960;
        int regionValue10959;

        region972: {
        int regionValue10938;
        int regionValue10937;
        java.lang.Object regionValue10936;
        int regionValue10935;
        java.lang.Object regionValue10934;
        int regionValue10933;
        java.lang.Object regionValue10932;
        int regionValue10931;
        int regionValue10930;
        int regionValue10940;
        java.lang.Object regionValue10939;

        region971: {
        int regionValue10911;
        java.lang.Object regionValue10910;
        int regionValue10909;
        int regionValue10908;
        java.lang.Object regionValue10907;
        int regionValue10906;
        java.lang.Object regionValue10905;
        int regionValue10904;
        java.lang.Object regionValue10903;
        int regionValue10902;
        int regionValue10901;

        region969: {
        int regionValue10853;
        int regionValue10851;
        int regionValue10850;
        java.lang.Object regionValue10849;
        int regionValue10848;
        java.lang.Object regionValue10847;
        int regionValue10846;
        java.lang.Object regionValue10845;
        int regionValue10844;
        int regionValue10843;
        java.lang.Object regionValue10852;

        region968: {
        java.lang.Object regionValue10649;
        int regionValue10651;
        int regionValue10650;
        int regionValue10648;
        java.lang.Object regionValue10647;
        int regionValue10646;
        java.lang.Object regionValue10645;
        int regionValue10644;
        int regionValue10643;
        boolean value10795;
        java.lang.Object regionValue10653;
        java.lang.Object regionValue10652;
        java.lang.Object value10794;
        java.lang.Object value10793;

        region961: {
        java.lang.Object regionValue10792;
        int regionValue10791;
        int regionValue10790;
        java.lang.Object regionValue10789;
        int regionValue10788;
        java.lang.Object regionValue10787;
        int regionValue10786;
        java.lang.Object regionValue10785;
        int regionValue10784;
        int regionValue10783;

        region960: {
        java.lang.Object regionValue10764;
        int regionValue10763;
        int regionValue10762;
        java.lang.Object regionValue10761;
        int regionValue10760;
        java.lang.Object regionValue10759;
        int regionValue10758;
        java.lang.Object regionValue10757;
        int regionValue10756;
        int regionValue10755;

        region958: {
        int regionValue10709;
        int regionValue10708;
        java.lang.Object regionValue10707;
        int regionValue10706;
        java.lang.Object regionValue10705;
        int regionValue10704;
        java.lang.Object regionValue10703;
        java.lang.Object regionValue10711;
        java.lang.Object regionValue10710;
        int regionValue10702;
        int regionValue10701;

        region957: {
        java.lang.Object regionValue10682;
        java.lang.Object regionValue10681;
        int regionValue10680;
        int regionValue10679;
        java.lang.Object regionValue10678;
        int regionValue10677;
        java.lang.Object regionValue10676;
        int regionValue10675;
        java.lang.Object regionValue10674;
        int regionValue10673;
        int regionValue10672;

        region955: {
        java.lang.Object regionValue10624;
        int regionValue10623;
        int regionValue10622;
        java.lang.Object regionValue10621;
        int regionValue10620;
        java.lang.Object regionValue10619;
        int regionValue10618;
        java.lang.Object regionValue10617;
        int regionValue10616;
        int regionValue10615;

        region952: {
        int regionValue10567;
        int regionValue10566;
        java.lang.Object regionValue10565;
        int regionValue10564;
        java.lang.Object regionValue10563;
        int regionValue10562;
        java.lang.Object regionValue10561;
        int regionValue10560;
        int regionValue10559;
        java.lang.Object regionValue10569;
        java.lang.Object regionValue10568;

        region951: {
        java.lang.Object regionValue10540;
        java.lang.Object regionValue10539;
        int regionValue10538;
        int regionValue10537;
        java.lang.Object regionValue10536;
        int regionValue10535;
        java.lang.Object regionValue10534;
        int regionValue10533;
        java.lang.Object regionValue10532;
        int regionValue10531;
        int regionValue10530;

        region949: {
        java.lang.Object regionValue10508;
        java.lang.Object regionValue10506;
        int regionValue10505;
        java.lang.Object regionValue10504;
        int regionValue10503;
        int regionValue10502;
        java.lang.Object regionValue10511;
        int regionValue10510;
        int regionValue10509;
        int regionValue10507;

        region946: {
        java.lang.Object regionValue10483;
        int regionValue10482;
        int regionValue10481;
        java.lang.Object regionValue10480;
        int regionValue10479;
        java.lang.Object regionValue10478;
        int regionValue10477;
        java.lang.Object regionValue10476;
        int regionValue10475;
        int regionValue10474;

        region944: {
        int regionValue10426;
        int regionValue10425;
        java.lang.Object regionValue10424;
        int regionValue10423;
        java.lang.Object regionValue10422;
        int regionValue10421;
        java.lang.Object regionValue10420;
        int regionValue10419;
        int regionValue10418;
        java.lang.Object regionValue10427;

        region943: {
        int regionValue10363;
        int regionValue10362;
        java.lang.Object regionValue10361;
        int regionValue10360;
        java.lang.Object regionValue10359;
        int regionValue10358;
        java.lang.Object regionValue10357;
        int regionValue10356;
        int regionValue10355;
        java.lang.Object value10371;
        java.lang.Object value10370;
        java.lang.Object value10369;
        java.lang.Object value10368;
        java.lang.Object value10367;
        java.lang.Object value10366;
        java.lang.Object value10365;
        java.lang.Object value10364;

        region926: {
        int value10336;
        java.lang.Object value10335;
        java.lang.Object value10334;
        java.lang.Object value10333;
        java.lang.Object value10332;
        java.lang.Object value10331;
        java.lang.Object value10330;

        value10330 = recovery$indy$flow$822();
        value10331 = value10330;
        value10332 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value10331))))));
        value10333 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value10332)))).field_42P));
        value10334 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value10333)))).field_429));
        value10335 = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(value10334)))).field_46));
        value10336 = recovery$indy$flow$827(value10335);
        if (regionValue10329 >= value10336) {
            regionValue9760 = regionValue10321;
            regionValue9761 = regionValue10322;
            regionValue9762 = regionValue10323;
            regionValue9763 = regionValue10324;
            regionValue9764 = regionValue10325;
            regionValue9765 = regionValue10326;
            break region1019;
        } else {
            regionValue10355 = regionValue10321;
            regionValue10356 = regionValue10322;
            regionValue10357 = regionValue10323;
            regionValue10358 = regionValue10324;
            regionValue10359 = regionValue10325;
            regionValue10360 = regionValue10326;
            regionValue10361 = regionValue10327;
            regionValue10362 = regionValue10328;
            regionValue10363 = regionValue10329;
            break region926;
        }
        }
        value10364 = recovery$indy$flow$828();
        value10365 = value10364;
        value10366 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value10365))))));
        value10367 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value10366)))).field_42P));
        value10368 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(value10367)))).field_429));
        value10369 = recovery$indy$flow$832(value10368, regionValue10363);
        value10370 = recovery$indy$flow$833(value10369);
        value10371 = value10370;
        if (a1 < 0) {
            regionValue10390 = regionValue10355;
            regionValue10391 = regionValue10356;
            regionValue10392 = regionValue10357;
            regionValue10393 = regionValue10358;
            regionValue10394 = regionValue10359;
            regionValue10395 = regionValue10360;
            regionValue10396 = regionValue10361;
            regionValue10397 = regionValue10362;
            regionValue10398 = regionValue10363;
            break region1018;
        } else {
            regionValue10418 = regionValue10355;
            regionValue10419 = regionValue10356;
            regionValue10420 = regionValue10357;
            regionValue10421 = regionValue10358;
            regionValue10422 = regionValue10359;
            regionValue10423 = regionValue10360;
            regionValue10424 = regionValue10361;
            regionValue10425 = regionValue10362;
            regionValue10426 = regionValue10363;
            regionValue10427 = value10371;
            break region943;
        }
        }
        if (value51 != null) {
            regionValue10447 = regionValue10418;
            regionValue10448 = regionValue10419;
            regionValue10449 = regionValue10420;
            regionValue10450 = regionValue10421;
            regionValue10451 = regionValue10422;
            regionValue10452 = regionValue10423;
            regionValue10453 = regionValue10424;
            regionValue10454 = regionValue10425;
            regionValue10455 = regionValue10426;
            break region1017;
        } else {
            regionValue10474 = regionValue10418;
            regionValue10475 = regionValue10419;
            regionValue10476 = regionValue10420;
            regionValue10477 = regionValue10421;
            regionValue10478 = regionValue10422;
            regionValue10479 = regionValue10423;
            regionValue10480 = regionValue10424;
            regionValue10481 = regionValue10425;
            regionValue10482 = regionValue10426;
            regionValue10483 = regionValue10427;
            break region944;
        }
        }
        regionValue10502 = regionValue10474;
        regionValue10503 = regionValue10475;
        regionValue10504 = regionValue10476;
        regionValue10505 = regionValue10477;
        regionValue10506 = regionValue10478;
        regionValue10507 = regionValue10479;
        regionValue10508 = regionValue10480;
        regionValue10509 = regionValue10481;
        regionValue10510 = regionValue10482;
        regionValue10511 = regionValue10483;
        break region946;
        }
        if (value51 != null) {
            regionValue6110 = regionValue10502;
            regionValue6111 = regionValue10503;
            regionValue6112 = regionValue10504;
            regionValue6113 = regionValue10505;
            regionValue6114 = regionValue10506;
            regionValue6115 = regionValue10508;
            continue loop362;
        } else {
            regionValue10530 = regionValue10502;
            regionValue10531 = regionValue10503;
            regionValue10532 = regionValue10504;
            regionValue10533 = regionValue10505;
            regionValue10534 = regionValue10506;
            regionValue10535 = regionValue10507;
            regionValue10536 = regionValue10508;
            regionValue10537 = regionValue10509;
            regionValue10538 = regionValue10510;
            regionValue10539 = regionValue10511;
            regionValue10540 = regionValue10508;
            break region949;
        }
        }
        regionValue10559 = regionValue10530;
        regionValue10560 = regionValue10531;
        regionValue10561 = regionValue10532;
        regionValue10562 = regionValue10533;
        regionValue10563 = regionValue10534;
        regionValue10564 = regionValue10535;
        regionValue10565 = regionValue10536;
        regionValue10566 = regionValue10537;
        regionValue10567 = regionValue10538;
        regionValue10568 = regionValue10539;
        regionValue10569 = regionValue10540;
        break region951;
        }
        if (regionValue10569 == null) {
            regionValue10588 = regionValue10559;
            regionValue10589 = regionValue10560;
            regionValue10590 = regionValue10561;
            regionValue10591 = regionValue10562;
            regionValue10592 = regionValue10563;
            regionValue10593 = regionValue10564;
            regionValue10594 = regionValue10565;
            regionValue10595 = regionValue10566;
            regionValue10596 = regionValue10567;
            break region1016;
        } else {
            regionValue10615 = regionValue10559;
            regionValue10616 = regionValue10560;
            regionValue10617 = regionValue10561;
            regionValue10618 = regionValue10562;
            regionValue10619 = regionValue10563;
            regionValue10620 = regionValue10564;
            regionValue10621 = regionValue10565;
            regionValue10622 = regionValue10566;
            regionValue10623 = regionValue10567;
            regionValue10624 = regionValue10568;
            break region952;
        }
        }
        if (value51 != null) {
            regionValue10643 = regionValue10615;
            regionValue10644 = regionValue10616;
            regionValue10645 = regionValue10617;
            regionValue10646 = regionValue10618;
            regionValue10647 = regionValue10619;
            regionValue10648 = regionValue10620;
            regionValue10649 = regionValue10621;
            regionValue10650 = regionValue10622;
            regionValue10651 = regionValue10623;
            regionValue10652 = regionValue10624;
            regionValue10653 = regionValue10624;
            break region961;
        } else {
            regionValue10672 = regionValue10615;
            regionValue10673 = regionValue10616;
            regionValue10674 = regionValue10617;
            regionValue10675 = regionValue10618;
            regionValue10676 = regionValue10619;
            regionValue10677 = regionValue10620;
            regionValue10678 = regionValue10621;
            regionValue10679 = regionValue10622;
            regionValue10680 = regionValue10623;
            regionValue10681 = regionValue10624;
            regionValue10682 = regionValue10624;
            break region955;
        }
        }
        regionValue10701 = regionValue10672;
        regionValue10702 = regionValue10673;
        regionValue10703 = regionValue10674;
        regionValue10704 = regionValue10675;
        regionValue10705 = regionValue10676;
        regionValue10706 = regionValue10677;
        regionValue10707 = regionValue10678;
        regionValue10708 = regionValue10679;
        regionValue10709 = regionValue10680;
        regionValue10710 = regionValue10681;
        regionValue10711 = regionValue10682;
        break region957;
        }
        if (regionValue10711 == null) {
            regionValue10730 = regionValue10703;
            regionValue10731 = regionValue10704;
            regionValue10732 = regionValue10705;
            regionValue10733 = regionValue10706;
            regionValue10734 = regionValue10707;
            regionValue10735 = regionValue10708;
            regionValue10736 = regionValue10709;
            break region983;
        } else {
            regionValue10755 = regionValue10701;
            regionValue10756 = regionValue10702;
            regionValue10757 = regionValue10703;
            regionValue10758 = regionValue10704;
            regionValue10759 = regionValue10705;
            regionValue10760 = regionValue10706;
            regionValue10761 = regionValue10707;
            regionValue10762 = regionValue10708;
            regionValue10763 = regionValue10709;
            regionValue10764 = regionValue10710;
            break region958;
        }
        }
        regionValue10783 = regionValue10755;
        regionValue10784 = regionValue10756;
        regionValue10785 = regionValue10757;
        regionValue10786 = regionValue10758;
        regionValue10787 = regionValue10759;
        regionValue10788 = regionValue10760;
        regionValue10789 = regionValue10761;
        regionValue10790 = regionValue10762;
        regionValue10791 = regionValue10763;
        regionValue10792 = regionValue10764;
        break region960;
        }
        regionValue10643 = regionValue10783;
        regionValue10644 = regionValue10784;
        regionValue10645 = regionValue10785;
        regionValue10646 = regionValue10786;
        regionValue10647 = regionValue10787;
        regionValue10648 = regionValue10788;
        regionValue10649 = regionValue10789;
        regionValue10650 = regionValue10790;
        regionValue10651 = regionValue10791;
        regionValue10652 = regionValue10792;
        regionValue10653 = regionValue10792;
        break region961;
        }
        value10793 = recovery$indy$flow$834(regionValue10653);
        value10794 = recovery$indy$flow$835(regionValue10649);
        value10795 = recovery$indy$flow$836(value10793, value10794);
        if (a0 <= 0) {
            regionValue10814 = regionValue10643;
            regionValue10815 = regionValue10644;
            regionValue10816 = regionValue10645;
            regionValue10817 = regionValue10646;
            regionValue10818 = regionValue10647;
            regionValue10819 = regionValue10648;
            regionValue10820 = regionValue10649;
            regionValue10821 = regionValue10650;
            regionValue10822 = regionValue10651;
            regionValue10823 = (int) ((value10795 ? 1 : 0));
            break region977;
        } else {
            regionValue10843 = regionValue10643;
            regionValue10844 = regionValue10644;
            regionValue10845 = regionValue10645;
            regionValue10846 = regionValue10646;
            regionValue10847 = regionValue10647;
            regionValue10848 = regionValue10648;
            regionValue10849 = regionValue10649;
            regionValue10850 = regionValue10650;
            regionValue10851 = regionValue10651;
            regionValue10852 = regionValue10652;
            regionValue10853 = (int) ((value10795 ? 1 : 0));
            break region968;
        }
        }
        if (value51 != null) {
            regionValue10873 = regionValue10843;
            regionValue10874 = regionValue10844;
            regionValue10875 = regionValue10845;
            regionValue10876 = regionValue10846;
            regionValue10877 = regionValue10847;
            regionValue10878 = regionValue10848;
            regionValue10879 = regionValue10849;
            regionValue10880 = regionValue10850;
            regionValue10881 = regionValue10851;
            regionValue10882 = regionValue10853;
            break region976;
        } else {
            regionValue10901 = regionValue10843;
            regionValue10902 = regionValue10844;
            regionValue10903 = regionValue10845;
            regionValue10904 = regionValue10846;
            regionValue10905 = regionValue10847;
            regionValue10906 = regionValue10848;
            regionValue10907 = regionValue10849;
            regionValue10908 = regionValue10850;
            regionValue10909 = regionValue10851;
            regionValue10910 = regionValue10852;
            regionValue10911 = regionValue10853;
            break region969;
        }
        }
        regionValue10930 = regionValue10901;
        regionValue10931 = regionValue10902;
        regionValue10932 = regionValue10903;
        regionValue10933 = regionValue10904;
        regionValue10934 = regionValue10905;
        regionValue10935 = regionValue10906;
        regionValue10936 = regionValue10907;
        regionValue10937 = regionValue10908;
        regionValue10938 = regionValue10909;
        regionValue10939 = regionValue10910;
        regionValue10940 = regionValue10911;
        break region971;
        }
        if (regionValue10940 == 0) {
            regionValue10588 = regionValue10930;
            regionValue10589 = regionValue10931;
            regionValue10590 = regionValue10932;
            regionValue10591 = regionValue10933;
            regionValue10592 = regionValue10934;
            regionValue10593 = regionValue10935;
            regionValue10594 = regionValue10936;
            regionValue10595 = regionValue10937;
            regionValue10596 = regionValue10938;
            break region1016;
        } else {
            regionValue10959 = regionValue10930;
            regionValue10960 = regionValue10931;
            regionValue10961 = regionValue10932;
            regionValue10962 = regionValue10933;
            regionValue10963 = regionValue10934;
            regionValue10964 = regionValue10935;
            regionValue10965 = regionValue10936;
            regionValue10966 = regionValue10937;
            regionValue10967 = regionValue10938;
            regionValue10968 = regionValue10939;
            break region972;
        }
        }
        value10969 = recovery$indy$flow$837(regionValue10968);
        regionValue10873 = regionValue10959;
        regionValue10874 = regionValue10960;
        regionValue10875 = regionValue10961;
        regionValue10876 = regionValue10962;
        regionValue10877 = regionValue10963;
        regionValue10878 = regionValue10964;
        regionValue10879 = regionValue10965;
        regionValue10880 = regionValue10966;
        regionValue10881 = regionValue10967;
        regionValue10882 = value10969;
        break region976;
        }
        regionValue10814 = regionValue10873;
        regionValue10815 = regionValue10874;
        regionValue10816 = regionValue10875;
        regionValue10817 = regionValue10876;
        regionValue10818 = regionValue10877;
        regionValue10819 = regionValue10878;
        regionValue10820 = regionValue10879;
        regionValue10821 = regionValue10880;
        regionValue10822 = regionValue10881;
        regionValue10823 = regionValue10882;
        break region977;
        }
        if (value51 != null) {
            regionValue10988 = regionValue10814;
            regionValue10989 = regionValue10816;
            regionValue10990 = regionValue10817;
            regionValue10991 = regionValue10818;
            regionValue10992 = regionValue10819;
            regionValue10993 = regionValue10820;
            regionValue10994 = regionValue10821;
            regionValue10995 = regionValue10822;
            regionValue10996 = regionValue10823;
            break region1009;
        } else {
            regionValue11015 = regionValue10814;
            regionValue11016 = regionValue10815;
            regionValue11017 = regionValue10816;
            regionValue11018 = regionValue10817;
            regionValue11019 = regionValue10818;
            regionValue11020 = regionValue10819;
            regionValue11021 = regionValue10820;
            regionValue11022 = regionValue10821;
            regionValue11023 = regionValue10822;
            regionValue11024 = regionValue10823;
            break region978;
        }
        }
        value11025 = recovery$indy$flow$838(regionValue11021);
        if (regionValue11024 >= value11025) {
            regionValue10588 = regionValue11015;
            regionValue10589 = regionValue11016;
            regionValue10590 = regionValue11017;
            regionValue10591 = regionValue11018;
            regionValue10592 = regionValue11019;
            regionValue10593 = regionValue11020;
            regionValue10594 = regionValue11021;
            regionValue10595 = regionValue11022;
            regionValue10596 = regionValue11023;
            break region1016;
        } else {
            regionValue11044 = regionValue11017;
            regionValue11045 = regionValue11018;
            regionValue11046 = regionValue11019;
            regionValue11047 = regionValue11020;
            regionValue11048 = regionValue11021;
            regionValue11049 = regionValue11022;
            regionValue11050 = regionValue11023;
            break region981;
        }
        }
        regionValue10730 = regionValue11044;
        regionValue10731 = regionValue11045;
        regionValue10732 = regionValue11046;
        regionValue10733 = regionValue11047;
        regionValue10734 = regionValue11048;
        regionValue10735 = regionValue11049;
        regionValue10736 = regionValue11050;
        break region983;
        }
        converted11051 = (short) (converted27);
        converted11052 = (short) (converted35);
        value11053 = (int) (converted11052);
        value11055 = (int) (converted11051);
        value11056 = regionValue10735;
        value11058 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this))))));
        recovery$indy$flow$840(value11058, value11056, (short) (value11055), converted31, (short) (value11053));
        value11059 = 1;
        regionValue10988 = value11059;
        regionValue10989 = regionValue10730;
        regionValue10990 = regionValue10731;
        regionValue10991 = regionValue10732;
        regionValue10992 = regionValue10733;
        regionValue10993 = regionValue10734;
        regionValue10994 = regionValue10735;
        regionValue10995 = regionValue10736;
        regionValue10996 = 0;
        break region1009;
        }
        value11060 = regionValue10996;
        if (a1 < 0) {
            regionValue11079 = regionValue10988;
            regionValue11080 = regionValue10989;
            regionValue11081 = regionValue10990;
            regionValue11082 = regionValue10991;
            regionValue11083 = regionValue10992;
            regionValue11084 = value11060;
            break region1023;
        } else {
            regionValue11104 = regionValue10988;
            regionValue11105 = regionValue10989;
            regionValue11106 = regionValue10990;
            regionValue11107 = regionValue10991;
            regionValue11108 = regionValue10992;
            regionValue11109 = regionValue10993;
            regionValue11110 = regionValue10994;
            regionValue11111 = regionValue10995;
            regionValue11112 = value11060;
            break region1013;
        }
        }
        if (value51 == null) {
            regionValue9760 = regionValue11104;
            regionValue9761 = regionValue11112;
            regionValue9762 = regionValue11105;
            regionValue9763 = regionValue11106;
            regionValue9764 = regionValue11107;
            regionValue9765 = regionValue11108;
            break region1019;
        } else {
            regionValue11132 = regionValue11104;
            regionValue11133 = regionValue11105;
            regionValue11134 = regionValue11106;
            regionValue11135 = regionValue11107;
            regionValue11136 = regionValue11108;
            regionValue11137 = regionValue11109;
            regionValue11138 = regionValue11110;
            regionValue11139 = regionValue11111;
            regionValue11140 = regionValue11112;
            break region1014;
        }
        }
        regionValue10588 = regionValue11132;
        regionValue10589 = regionValue11140;
        regionValue10590 = regionValue11133;
        regionValue10591 = regionValue11134;
        regionValue10592 = regionValue11135;
        regionValue10593 = regionValue11136;
        regionValue10594 = regionValue11137;
        regionValue10595 = regionValue11138;
        regionValue10596 = regionValue11139;
        break region1016;
        }
        incremented11141 = regionValue10596 + (1);
        regionValue10447 = regionValue10588;
        regionValue10448 = regionValue10589;
        regionValue10449 = regionValue10590;
        regionValue10450 = regionValue10591;
        regionValue10451 = regionValue10592;
        regionValue10452 = regionValue10593;
        regionValue10453 = regionValue10594;
        regionValue10454 = regionValue10595;
        regionValue10455 = incremented11141;
        break region1017;
        }
        regionValue10390 = regionValue10447;
        regionValue10391 = regionValue10448;
        regionValue10392 = regionValue10449;
        regionValue10393 = regionValue10450;
        regionValue10394 = regionValue10451;
        regionValue10395 = regionValue10452;
        regionValue10396 = regionValue10453;
        regionValue10397 = regionValue10454;
        regionValue10398 = regionValue10455;
        break region1018;
        }
        if (value51 == null) {
            regionValue10321 = regionValue10390;
            regionValue10322 = regionValue10391;
            regionValue10323 = regionValue10392;
            regionValue10324 = regionValue10393;
            regionValue10325 = regionValue10394;
            regionValue10326 = regionValue10395;
            regionValue10327 = regionValue10396;
            regionValue10328 = regionValue10397;
            regionValue10329 = regionValue10398;
            continue loop912;
        } else {
            regionValue9760 = regionValue10390;
            regionValue9761 = regionValue10391;
            regionValue9762 = regionValue10392;
            regionValue9763 = regionValue10393;
            regionValue9764 = regionValue10394;
            regionValue9765 = regionValue10395;
            break region1019;
        }
        }
        }
        incremented11142 = regionValue9765 + (1);
        regionValue9928 = regionValue9760;
        regionValue9929 = regionValue9761;
        regionValue9930 = regionValue9762;
        regionValue9931 = regionValue9763;
        regionValue9932 = regionValue9764;
        regionValue9933 = incremented11142;
        break region1021;
        }
        if (a1 < 0) {
            regionValue3451 = regionValue9931;
            regionValue3454 = regionValue9930;
            regionValue3455 = regionValue9928;
            regionValue3456 = regionValue9929;
            break region1030;
        } else {
            regionValue11079 = regionValue9928;
            regionValue11080 = regionValue9930;
            regionValue11081 = regionValue9931;
            regionValue11082 = regionValue9932;
            regionValue11083 = regionValue9933;
            regionValue11084 = regionValue9929;
            break region1023;
        }
        }
        if (value51 == null) {
            regionValue9484 = regionValue11079;
            regionValue9485 = regionValue11084;
            regionValue9486 = regionValue11080;
            regionValue9487 = regionValue11081;
            regionValue9488 = regionValue11082;
            regionValue9489 = regionValue11083;
            continue loop817;
        } else {
            regionValue11161 = regionValue11079;
            regionValue11162 = regionValue11080;
            regionValue11163 = regionValue11081;
            regionValue11164 = regionValue11084;
            break region1024;
        }
        }
        }
        }
        regionValue8191 = regionValue6205;
        regionValue8192 = regionValue6206;
        regionValue8193 = regionValue6207;
        regionValue8194 = regionValue6208;
        break region1026;
        }
        regionValue8191 = regionValue11161;
        regionValue8192 = regionValue11164;
        regionValue8193 = regionValue11162;
        regionValue8194 = regionValue11163;
        break region1026;
        }
        incremented11165 = regionValue8192 + (1);
        regionValue6584 = regionValue8191;
        regionValue6585 = incremented11165;
        regionValue6586 = regionValue8193;
        regionValue6587 = regionValue8194;
        break region1027;
        }
        regionValue9271 = regionValue6584;
        regionValue9272 = regionValue6585;
        regionValue9273 = regionValue6586;
        regionValue9274 = regionValue6587;
        break region1028;
        }
        if (a2 > 0) {
            regionValue927 = regionValue9271;
            regionValue928 = regionValue9272;
            regionValue929 = regionValue9273;
            regionValue930 = value51;
            continue loop344;
        } else {
            regionValue3451 = regionValue9274;
            regionValue3454 = regionValue9273;
            regionValue3455 = regionValue9271;
            regionValue3456 = regionValue9272;
            break region1030;
        }
        }
        }
        }
        }
        if (value51 == null) {
            regionValue626 = regionValue3451;
            regionValue629 = regionValue3454;
            regionValue630 = regionValue3455;
            regionValue631 = regionValue3456;
            continue loop266;
        } else {
            regionValue664 = regionValue3455;
            break region1031;
        }
        }
        }
        return false;
        }
        return false;
        }
        return false;
        }
        regionValue4641 = 0;
        break region852;
        }
        return ((regionValue4641 & 1) != 0);
        }
        if (a2 >= 0) {
            break region1041;
        } else {
            regionValue11167 = regionValue664;
            break region1033;
        }
        }
        regionValue738 = regionValue11167;
        break region1036;
        }
        regionValue711 = regionValue738;
        break region1037;
        }
        if (value51 != null) {
            regionValue11168 = regionValue711;
            break region1040;
        } else {
            regionValue11169 = regionValue711;
            break region1038;
        }
        }
        if (regionValue11169 != 0) {
            break region1041;
        } else {
            break region1039;
        }
        }
        regionValue11168 = 1;
        break region1040;
        }
        regionValue11170 = regionValue11168;
        break region1042;
        }
        regionValue11170 = 0;
        break region1042;
        }
        return ((regionValue11170 & 1) != 0);
    }











   private boolean method_477$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 104964119942562L;
      long var10001 = var1 ^ 111227663065054L;
      int var5 = (int)((var1 ^ 111227663065054L) >>> 32);
      int var6 = (int)((var1 ^ 111227663065054L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var10000 = 1860770004352068556L;
      int[] var12 = AntiBot_47CG.method_40$d4d28024c9();
      var10001 = 1861993783603559273L;
      BooleanSetting var13 = this.settingDrop;
      byte var27 = (byte) ((var13.method_49$aae029aa0a()) ? 1 : 0);
      if (var12 == null) {
         if (var27 == 0) {
            return false;
         }

         var10001 = 1859293582003726379L;
         Minecraft var14 = field_43;
         C_47gG var28 = var14.field_42P.field_429;
         long var10003 = 1859293582003726379L;
         Minecraft var15 = field_43;
         int var10002 = var15.field_42P.field_429.field_46.size();
         C_43r[] var8 = new C_43r[]{C_42R.field_45};
         int var9 = var10002;
         byte var10 = 0;
         C_47gG var11 = var28;
         short var32 = (short)var6;
         short var10005 = (short)var7;
         long var10007 = 1861658400458646787L;
         C_43r[] var16 = var8;
         short var17 = var10005;
         int var18 = var9;
         byte var19 = var10;
         short var20 = var32;
         C_47gG var21 = var11;
         int var22 = var5;
         double var29 = C_47KL.method_46$0db0c5c1e2(var22, var21, var20, var19, var18, var17, var16);
         long var10004 = 1862198831732161345L;
         long var23 = var3;
         NumberSetting var25 = this.settingDropBowlsIfYouHaveMoreThan;
         double var33;
         var27 = (byte)((var33 = var29 - Math.max(0.0, var25.method_44$474dfaa627(var23))) == 0.0 ? 0 : (var33 < 0.0 ? -1 : 1));
      }

      return (boolean)(var12 != null ? var27 : var27 >= 0);
   }




   private boolean method_47Y$aae029aa0a() {
      long var1 = a ^ 115122773005906L;
      long var10000 = -8518942494519395368L;
      int[] var3 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = -8519882639987479683L;
      BooleanSetting var4 = this.settingAutoClose;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -8519882639987479683L;
         BooleanSetting var5 = this.settingFill;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$84(this, 7, 20, var3, -7103942805681702830L, var1);
      recovery$indy$85(this, 52, 3, var3, -7103942805681702830L, var1);
      recovery$indy$86(this, 34, var5, -7102548017997523074L, var1);
      recovery$indy$87(this, 26, var5, -7102548017997523074L, var1);
      recovery$indy$88(this, 9, var5, -7102548017997523074L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 41517724916887L;
      recovery$indy$89(this.settingFillDelay, 2735995624371511827L, var4);
      this.field_42 = -1;
      recovery$indy$90(this, var6, 2731166050213536950L, var4);
      this.field_48K = true;
      this.field_48Z = false;
      this.field_43P = false;
      recovery$indy$91(this.settingTickDelayAfterClosingGui, 2735995624371511827L, var4);
   }



    public AutoSoup_47Ci(long a0,char a1) {
        super((java.lang.String) ("AutoSoup"),(java.lang.String) ("AutoSuppe"),(long) (((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 118917335416884L)),(java.awt.Color) (new java.awt.Color((int) (19),(int) (178),(int) (110))),(client.module.Category) (client.module.Category.COMBAT));
        long constructorKey1 = (((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a);
        long constructorKey2 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 22894439876882L);
        long constructorKey3 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 526037107047L);
        long constructorKey4 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 26845466544826L);
        long constructorKey5 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 41158653700553L);
        long constructorKey6 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 127591857998116L);
        long constructorKey7 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 31899161451567L);
        int constructorPart8 = (int) ((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 14801720236681L) >>> 32));
        long constructorKey9 = ((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 14801720236681L) << 32) >>> 32);
        int constructorPart10 = (int) ((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 11456650460332L) >>> 32));
        int constructorPart11 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 11456650460332L) << 32) >>> 48));
        int constructorPart12 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 11456650460332L) << 48) >>> 48));
        int constructorPart13 = (int) ((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 117848594178782L) >>> 48));
        int constructorPart14 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 117848594178782L) << 16) >>> 48));
        int constructorPart15 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 117848594178782L) << 32) >>> 32));
        int constructorPart16 = (int) ((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 127634165043614L) >>> 32));
        int constructorPart17 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 127634165043614L) << 32) >>> 48));
        int constructorPart18 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 127634165043614L) << 48) >>> 48));
        long constructorKey19 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 53168095617960L);
        long constructorKey20 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.combat.AutoSoup_47Ci.a) ^ 47095563204766L);
        net.C_47TU initialized21 = new net.C_47TU(constructorKey4, this, "Health", Double.longBitsToDouble(4622382067542392832L), Double.longBitsToDouble(4624070917402656768L), 1.0D, Double.longBitsToDouble(4626322717216342016L), 0);
        recovery$indy$flow$889(this, initialized21);
        short converted22 = (short) (constructorPart11);
        short converted23 = (short) (constructorPart12);
        client.setting.RangeSetting initialized24 = new client.setting.RangeSetting(constructorPart10, this, "TickDelayAfterClosingGui", Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4613937818241073152L), converted22, 1.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted23);
        long initialValue25 = constructorKey5;
        client.setting.RangeSetting initialValue26 = initialized24;
        java.lang.Object initialValue27 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue28 = recovery$indy$flow$893(initialValue27, initialValue25);
        recovery$indy$flow$894(this, initialValue28);
        net.C_47TU initialized29 = new net.C_47TU(constructorKey4, this, "TickDelayBeforeSwitch", 1.0D, Double.longBitsToDouble(4611686018427387904L), 0.0D, Double.longBitsToDouble(4619567317775286272L), 0);
        recovery$indy$flow$897(this, initialized29);
        net.C_47TU initialized30 = new net.C_47TU(constructorKey4, this, "TickDelayBeforeClick", 1.0D, Double.longBitsToDouble(4611686018427387904L), 0.0D, Double.longBitsToDouble(4619567317775286272L), 0);
        recovery$indy$flow$900(this, initialized30);
        client.setting.BooleanSetting initialized31 = new client.setting.BooleanSetting(this, constructorKey7, "Drop", true);
        recovery$indy$flow$903(this, initialized31);
        client.setting.BooleanSetting initialized32 = new client.setting.BooleanSetting(this, constructorKey7, "InventoryDrop", false);
        java.lang.Object initialValue33 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDrop));
        java.lang.Object initialValue34 = recovery$indy$flow$907(initialValue33);
        java.lang.Object initialValue35 = recovery$indy$flow$908(initialValue33);
        java.lang.Object initialValue36 = initialValue35;
        long initialValue37 = constructorKey2;
        client.setting.BooleanSetting initialValue38 = initialized32;
        java.lang.Object initialValue39 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue40 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue41 = recovery$indy$flow$911(initialValue39, initialValue37, initialValue40);
        java.lang.Object initialValue42 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue41))))));
        recovery$indy$flow$913(this, initialValue42);
        client.setting.NumberSetting initialized43 = new client.setting.NumberSetting(this, "DropBowlsIfYouHaveMoreThan", 0.0D, constructorKey19, 0.0D, Double.longBitsToDouble(4634204016564240384L), 0);
        java.lang.Object initialValue44 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDrop));
        java.lang.Object initialValue45 = recovery$indy$flow$917(initialValue44);
        java.lang.Object initialValue46 = recovery$indy$flow$918(initialValue44);
        java.lang.Object initialValue47 = initialValue46;
        client.setting.NumberSetting initialValue48 = initialized43;
        java.lang.Object initialValue49 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue48))))));
        java.lang.Object initialValue50 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue47))))));
        java.lang.Object initialValue51 = recovery$indy$flow$921(initialValue49, initialValue50);
        recovery$indy$flow$922(this, initialValue51);
        net.C_47TU initialized52 = new net.C_47TU(constructorKey4, this, "TickDelayDrop", 1.0D, Double.longBitsToDouble(4611686018427387904L), 0.0D, Double.longBitsToDouble(4619567317775286272L), 0);
        java.lang.Object initialValue53 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDrop));
        java.lang.Object initialValue54 = recovery$indy$flow$926(initialValue53);
        java.lang.Object initialValue55 = recovery$indy$flow$927(initialValue53);
        long initialValue56 = constructorKey3;
        java.lang.Object initialValue57 = initialValue55;
        net.C_47TU initialValue58 = initialized52;
        java.lang.Object initialValue59 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue58))))));
        java.lang.Object initialValue60 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue61 = recovery$indy$flow$930(initialValue59, initialValue60, initialValue56);
        recovery$indy$flow$931(this, initialValue61);
        net.C_47TU initialized62 = new net.C_47TU(constructorKey4, this, "TickDelayAfter", 1.0D, Double.longBitsToDouble(4611686018427387904L), 0.0D, Double.longBitsToDouble(4619567317775286272L), 0);
        recovery$indy$flow$934(this, initialized62);
        client.setting.BooleanSetting initialized63 = new client.setting.BooleanSetting(this, constructorKey7, "Silent", true);
        recovery$indy$flow$937(this, initialized63);
        client.setting.BooleanSetting initialized64 = new client.setting.BooleanSetting(this, constructorKey7, "Random", true);
        recovery$indy$flow$940(this, initialized64);
        client.setting.BooleanSetting initialized65 = new client.setting.BooleanSetting(this, constructorKey7, "StopClickingAtSouping", false);
        recovery$indy$flow$943(this, initialized65);
        client.setting.SettingGroup initialized66 = new client.setting.SettingGroup(this, "Deprecated", constructorKey6);
        recovery$indy$flow$946(this, initialized66);
        short converted67 = (short) (constructorPart13);
        char converted68 = (char) (constructorPart14);
        java.lang.Object initialValue69 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.BooleanSetting initialized70 = new client.setting.BooleanSetting(this, "OpenInv", converted67, converted68, constructorPart15, true, (client.setting.SettingGroup) (initialValue69));
        recovery$indy$flow$950(this, initialized70);
        short converted71 = (short) (constructorPart13);
        char converted72 = (char) (constructorPart14);
        java.lang.Object initialValue73 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.BooleanSetting initialized74 = new client.setting.BooleanSetting(this, "AutoOpen", converted71, converted72, constructorPart15, false, (client.setting.SettingGroup) (initialValue73));
        recovery$indy$flow$954(this, initialized74);
        java.lang.Object initialValue75 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.RangeSetting initialized76 = new client.setting.RangeSetting(constructorPart16, this, "AutoOpenDelay", constructorPart17, constructorPart18, Double.longBitsToDouble(4639481672377565184L), Double.longBitsToDouble(4643000109586448384L), 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, (client.setting.SettingGroup) (initialValue75));
        long initialValue77 = constructorKey5;
        client.setting.RangeSetting initialValue78 = initialized76;
        java.lang.Object initialValue79 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue78))))));
        java.lang.Object initialValue80 = recovery$indy$flow$959(initialValue79, initialValue77);
        java.lang.Object initialValue81 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingAutoOpen));
        java.lang.Object initialValue82 = recovery$indy$flow$961(initialValue81);
        java.lang.Object initialValue83 = recovery$indy$flow$962(initialValue81);
        long initialValue84 = constructorKey9;
        java.lang.Object initialValue85 = initialValue83;
        int initialValue86 = constructorPart8;
        java.lang.Object initialValue87 = initialValue80;
        java.lang.Object initialValue88 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue87))))));
        java.lang.Object initialValue89 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue85))))));
        java.lang.Object initialValue90 = recovery$indy$flow$965(initialValue88, initialValue86, initialValue89, initialValue84);
        recovery$indy$flow$966(this, initialValue90);
        java.lang.Object initialValue91 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.RangeSetting initialized92 = new client.setting.RangeSetting(constructorPart16, this, "StartDelay", constructorPart17, constructorPart18, Double.longBitsToDouble(4639481672377565184L), Double.longBitsToDouble(4641240890982006784L), 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, (client.setting.SettingGroup) (initialValue91));
        long initialValue93 = constructorKey5;
        client.setting.RangeSetting initialValue94 = initialized92;
        java.lang.Object initialValue95 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue94))))));
        java.lang.Object initialValue96 = recovery$indy$flow$971(initialValue95, initialValue93);
        recovery$indy$flow$972(this, initialValue96);
        short converted97 = (short) (constructorPart13);
        char converted98 = (char) (constructorPart14);
        java.lang.Object initialValue99 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.BooleanSetting initialized100 = new client.setting.BooleanSetting(this, "Fill", converted97, converted98, constructorPart15, true, (client.setting.SettingGroup) (initialValue99));
        recovery$indy$flow$976(this, initialized100);
        java.lang.Object initialValue101 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.RangeSetting initialized102 = new client.setting.RangeSetting(constructorPart16, this, "FillDelay", constructorPart17, constructorPart18, Double.longBitsToDouble(4632233691727265792L), Double.longBitsToDouble(4636737291354636288L), 0.0D, Double.longBitsToDouble(4647503709213818880L), 0, (client.setting.SettingGroup) (initialValue101));
        long initialValue103 = constructorKey5;
        client.setting.RangeSetting initialValue104 = initialized102;
        java.lang.Object initialValue105 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue104))))));
        java.lang.Object initialValue106 = recovery$indy$flow$981(initialValue105, initialValue103);
        java.lang.Object initialValue107 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingFill));
        java.lang.Object initialValue108 = recovery$indy$flow$983(initialValue107);
        java.lang.Object initialValue109 = recovery$indy$flow$984(initialValue107);
        long initialValue110 = constructorKey9;
        java.lang.Object initialValue111 = initialValue109;
        int initialValue112 = constructorPart8;
        java.lang.Object initialValue113 = initialValue106;
        java.lang.Object initialValue114 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue113))))));
        java.lang.Object initialValue115 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue111))))));
        java.lang.Object initialValue116 = recovery$indy$flow$987(initialValue114, initialValue112, initialValue115, initialValue110);
        recovery$indy$flow$988(this, initialValue116);
        short converted117 = (short) (constructorPart13);
        char converted118 = (char) (constructorPart14);
        java.lang.Object initialValue119 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.BooleanSetting initialized120 = new client.setting.BooleanSetting(this, "Craft", converted117, converted118, constructorPart15, true, (client.setting.SettingGroup) (initialValue119));
        recovery$indy$flow$992(this, initialized120);
        java.lang.Object initialValue121 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.NumberSetting initialized122 = new client.setting.NumberSetting(this, "ReCraftIfSoupsLowerThan", Double.longBitsToDouble(4616189618054758400L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue121), constructorKey20);
        java.lang.Object initialValue123 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingCraft));
        java.lang.Object initialValue124 = recovery$indy$flow$997(initialValue123);
        java.lang.Object initialValue125 = recovery$indy$flow$998(initialValue123);
        java.lang.Object initialValue126 = initialValue125;
        client.setting.NumberSetting initialValue127 = initialized122;
        java.lang.Object initialValue128 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue127))))));
        java.lang.Object initialValue129 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue126))))));
        java.lang.Object initialValue130 = recovery$indy$flow$1001(initialValue128, initialValue129);
        recovery$indy$flow$1002(this, initialValue130);
        short converted131 = (short) (constructorPart13);
        char converted132 = (char) (constructorPart14);
        java.lang.Object initialValue133 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.BooleanSetting initialized134 = new client.setting.BooleanSetting(this, "CraftInstant", converted131, converted132, constructorPart15, false, (client.setting.SettingGroup) (initialValue133));
        java.lang.Object initialValue135 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingCraft));
        java.lang.Object initialValue136 = recovery$indy$flow$1007(initialValue135);
        java.lang.Object initialValue137 = recovery$indy$flow$1008(initialValue135);
        java.lang.Object initialValue138 = initialValue137;
        long initialValue139 = constructorKey2;
        client.setting.BooleanSetting initialValue140 = initialized134;
        java.lang.Object initialValue141 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue140))))));
        java.lang.Object initialValue142 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue138))))));
        java.lang.Object initialValue143 = recovery$indy$flow$1011(initialValue141, initialValue139, initialValue142);
        java.lang.Object initialValue144 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue143))))));
        recovery$indy$flow$1013(this, initialValue144);
        java.lang.Object initialValue145 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.RangeSetting initialized146 = new client.setting.RangeSetting(constructorPart16, this, "CraftCPS", constructorPart17, constructorPart18, Double.longBitsToDouble(4623507967449235456L), Double.longBitsToDouble(4625196817309499392L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue145));
        long initialValue147 = constructorKey5;
        client.setting.RangeSetting initialValue148 = initialized146;
        java.lang.Object initialValue149 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue148))))));
        java.lang.Object initialValue150 = recovery$indy$flow$1018(initialValue149, initialValue147);
        java.lang.Object initialValue151 = recovery$indy$flow$1019(this);
        long initialValue152 = constructorKey9;
        java.lang.Object initialValue153 = initialValue151;
        int initialValue154 = constructorPart8;
        java.lang.Object initialValue155 = initialValue150;
        java.lang.Object initialValue156 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue155))))));
        java.lang.Object initialValue157 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue153))))));
        java.lang.Object initialValue158 = recovery$indy$flow$1022(initialValue156, initialValue154, initialValue157, initialValue152);
        recovery$indy$flow$1023(this, initialValue158);
        java.lang.Object initialValue159 = recovery$indy$flow$1024();
        short converted160 = (short) (constructorPart13);
        char converted161 = (char) (constructorPart14);
        java.lang.Object initialValue162 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.BooleanSetting initialized163 = new client.setting.BooleanSetting(this, "AutoClose", converted160, converted161, constructorPart15, true, (client.setting.SettingGroup) (initialValue162));
        java.lang.Object initialValue164 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingFill));
        java.lang.Object initialValue165 = recovery$indy$flow$1029(initialValue164);
        java.lang.Object initialValue166 = recovery$indy$flow$1030(initialValue164);
        java.lang.Object initialValue167 = initialValue166;
        long initialValue168 = constructorKey2;
        client.setting.BooleanSetting initialValue169 = initialized163;
        java.lang.Object initialValue170 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue169))))));
        java.lang.Object initialValue171 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue167))))));
        java.lang.Object initialValue172 = recovery$indy$flow$1033(initialValue170, initialValue168, initialValue171);
        java.lang.Object initialValue173 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue172))))));
        recovery$indy$flow$1035(this, initialValue173);
        java.lang.Object initialValue174 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoSoup_47Ci) (((java.lang.Object)(this)))).settingDeprecated));
        client.setting.RangeSetting initialized175 = new client.setting.RangeSetting(constructorPart16, this, "AutoCloseDelay", constructorPart17, constructorPart18, Double.longBitsToDouble(4639481672377565184L), Double.longBitsToDouble(4643000109586448384L), 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, (client.setting.SettingGroup) (initialValue174));
        long initialValue176 = constructorKey5;
        client.setting.RangeSetting initialValue177 = initialized175;
        java.lang.Object initialValue178 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue177))))));
        java.lang.Object initialValue179 = recovery$indy$flow$1040(initialValue178, initialValue176);
        java.lang.Object initialValue180 = recovery$indy$flow$1041(this);
        long initialValue181 = constructorKey9;
        java.lang.Object initialValue182 = initialValue180;
        int initialValue183 = constructorPart8;
        java.lang.Object initialValue184 = initialValue179;
        java.lang.Object initialValue185 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue184))))));
        java.lang.Object initialValue186 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue182))))));
        java.lang.Object initialValue187 = recovery$indy$flow$1044(initialValue185, initialValue183, initialValue186, initialValue181);
        recovery$indy$flow$1045(this, initialValue187);
        java.util.ArrayList initialized188 = new java.util.ArrayList();
        recovery$indy$flow$1048(this, initialized188);
        recovery$indy$flow$1049(this, false);
        recovery$indy$flow$1050(this, false);
        recovery$indy$flow$1051(this, true);
        recovery$indy$flow$1052(this, true);
        recovery$indy$flow$1053(this, false);
        recovery$indy$flow$1054(this, 0);
        recovery$indy$flow$1055(this, 0);
        recovery$indy$flow$1056(this, 1);
        recovery$indy$flow$1057(this, 1);
        java.lang.Object initialValue189 = initialValue159;
        recovery$indy$flow$1058(this, 1);
        recovery$indy$flow$1059(this, 1);
        recovery$indy$flow$1060(this, 13);
        recovery$indy$flow$1061(this, 0.0F);
        recovery$indy$flow$1062(this, false);
        recovery$indy$flow$1063(this, false);
        net.C_474k initialized190 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$1066(this, initialized190);
        net.C_47cu initialized191 = new net.C_47cu();
        recovery$indy$flow$1069(this, initialized191);
        net.C_47cu initialized192 = new net.C_47cu();
        recovery$indy$flow$1072(this, initialized192);
        recovery$indy$flow$1073(this, false);
        net.C_47cu initialized193 = new net.C_47cu();
        recovery$indy$flow$1076(this, initialized193);
        net.C_47cu initialized194 = new net.C_47cu();
        recovery$indy$flow$1079(this, initialized194);
        recovery$indy$flow$1080(this, true);
        java.lang.Object initialValue195 = recovery$indy$flow$1081();
        if (initialValue195 == null) {
            return;
        } else {
            int[] values196 = new int[2];
            int[] initialValue197 = values196;
            java.lang.Object initialValue198 = recovery$indy$flow$1082(initialValue197);
            recovery$indy$flow$1083(initialValue198);
            return;
        }
    }









    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$152(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$210(java.lang.Object a0,long a1,long a2);
    private static long recovery$indy$flow$362() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.a;
    }
    private static native java.lang.Object recovery$indy$flow$363();
    private static java.lang.Object recovery$indy$flow$364() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }


    private static native float recovery$indy$flow$367(java.lang.Object a0);
    private static float recovery$indy$flow$368(java.lang.Object a0) {
        return ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_40;
    }
    private static void recovery$indy$flow$369(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48z = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$370() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }


    private static int recovery$indy$flow$373(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static void recovery$indy$flow$374(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_43p = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$375() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }


    private static native float recovery$indy$flow$378(java.lang.Object a0);
    private static void recovery$indy$flow$379(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_40 = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$380() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }



    private static boolean recovery$indy$flow$384(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }
    private static boolean recovery$indy$flow$385(java.lang.Object a0) {
        return ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48Z;
    }
    private static void recovery$indy$flow$386(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48Z = a1;
        return;
    }

    private static native void recovery$indy$flow$388(java.lang.Object a0,long a1);
    private static void recovery$indy$flow$389(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_42 = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$390() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }

    private static native boolean recovery$indy$flow$392(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$393() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }

    private static native int recovery$indy$flow$395(java.lang.Object a0);


    private static native int recovery$indy$flow$398(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$399() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }


    private static native float recovery$indy$flow$402(java.lang.Object a0);
    private static int recovery$indy$flow$403(java.lang.Object a0) {
        return ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_438;
    }
    private static boolean recovery$indy$flow$404(java.lang.Object a0) {
        return ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48K;
    }
    private static boolean recovery$indy$flow$405(java.lang.Object a0) {
        return ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48L;
    }

    private static native boolean recovery$indy$flow$407(java.lang.Object a0,int a1,short a2,short a3);
    private static void recovery$indy$flow$408(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48z = a1;
        return;
    }

    private static void recovery$indy$flow$410(java.lang.Object a0) {
        ((java.util.ArrayList) (a0)).clear();
        return;
    }
    private static java.lang.Object recovery$indy$flow$411() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }




    private static int recovery$indy$flow$416(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$417() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$421(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$422(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$423(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$424() {
        return net.C_42R.field_41u;
    }
    private static boolean recovery$indy$flow$425(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }

    private static java.lang.Object recovery$indy$flow$427(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static boolean recovery$indy$flow$428(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }


    private static native boolean recovery$indy$flow$431(java.lang.Object a0);

    private static void recovery$indy$flow$433(java.lang.Object a0) {
        java.util.Collections.shuffle(((java.util.List) (a0)));
        return;
    }
    private static void recovery$indy$flow$434(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_43n = a1;
        return;
    }

    private static boolean recovery$indy$flow$436(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }
    private static void recovery$indy$flow$437(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48K = a1;
        return;
    }

    private static boolean recovery$indy$flow$439(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }

    private static java.lang.Object recovery$indy$flow$441(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static int recovery$indy$flow$443(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static long recovery$indy$flow$729() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.a;
    }
    private static native java.lang.Object recovery$indy$flow$730();
    private static java.lang.Object recovery$indy$flow$731() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }


    private static boolean recovery$indy$flow$734(java.lang.Object a0) {
        return (a0 instanceof net.C_47pL);
    }


    private static native boolean recovery$indy$flow$737(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$738() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }





    private static native java.lang.Object recovery$indy$flow$744(java.lang.Object a0,int a1,short a2,char a3,java.lang.Object a4);
    private static int recovery$indy$flow$745(int a0,int a1) {
        return java.lang.Math.min(a0, a1);
    }
    private static int recovery$indy$flow$746(int a0,int a1) {
        return java.lang.Math.min(a0, a1);
    }
    private static native java.lang.Object recovery$indy$flow$747(int a0);
    private static java.lang.Object recovery$indy$flow$748() {
        return net.C_42R.field_45;
    }
    private static native java.lang.Object recovery$indy$flow$749(int a0);
    private static native java.lang.Object recovery$indy$flow$750(int a0);
    private static java.lang.Object recovery$indy$flow$751() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }




    private static int recovery$indy$flow$756(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$757() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }





    private static native java.lang.Object recovery$indy$flow$763(java.lang.Object a0,int a1,short a2,char a3,java.lang.Object a4);
    private static java.lang.Object recovery$indy$flow$764() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$768(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$769(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$770(java.lang.Object a0);
    private static boolean recovery$indy$flow$771(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }


    private static native double recovery$indy$flow$774(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$775() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$779(java.lang.Object a0);
    private static boolean recovery$indy$flow$780(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }
    private static boolean recovery$indy$flow$781(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }
    private static boolean recovery$indy$flow$782(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }

    private static native boolean recovery$indy$flow$784(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$785() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }





    private static native void recovery$indy$flow$791(java.lang.Object a0,long a1,java.lang.Object a2,int a3,int a4);

    private static native boolean recovery$indy$flow$793(java.lang.Object a0,long a1);

    private static native void recovery$indy$flow$795(java.lang.Object a0,int a1,short a2,int a3,short a4);
    private static java.lang.Object recovery$indy$flow$796() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$800(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$801(java.lang.Object a0);
    private static boolean recovery$indy$flow$802(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }

    private static native boolean recovery$indy$flow$804(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$805() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }





    private static native void recovery$indy$flow$811(java.lang.Object a0,long a1,java.lang.Object a2,int a3,int a4);

    private static native boolean recovery$indy$flow$813(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$814() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$818(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$819(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$820(java.lang.Object a0);
    private static boolean recovery$indy$flow$821(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$822() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }




    private static int recovery$indy$flow$827(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$828() {
        return augustus.recovered.modules.combat.AutoSoup_47Ci.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$832(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$833(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$834(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$835(java.lang.Object a0);
    private static boolean recovery$indy$flow$836(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }
    private static int recovery$indy$flow$837(java.lang.Object a0) {
        return ((net.C_47rf) (a0)).field_47;
    }
    private static native int recovery$indy$flow$838(java.lang.Object a0);

    private static native void recovery$indy$flow$840(java.lang.Object a0,int a1,short a2,int a3,short a4);
    private static native void recovery$indy$flow$889(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$893(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$894(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$897(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$900(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$903(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$907(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$908(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$911(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$913(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$917(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$918(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$921(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$922(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$926(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$927(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$930(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$931(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$934(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$937(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$940(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$943(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$946(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$950(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$954(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$959(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$961(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$962(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$965(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$966(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$971(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$972(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$976(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$981(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$983(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$984(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$987(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$988(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$992(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$997(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$998(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1001(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1002(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$1007(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1008(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1011(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1013(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1018(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1019(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1022(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1023(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1024();


    private static java.lang.Object recovery$indy$flow$1029(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1030(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1033(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1035(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$1040(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$1041(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1044(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1045(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1048(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1049(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48L = a1;
        return;
    }
    private static void recovery$indy$flow$1050(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48X = a1;
        return;
    }
    private static void recovery$indy$flow$1051(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48K = a1;
        return;
    }
    private static void recovery$indy$flow$1052(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48z = a1;
        return;
    }
    private static void recovery$indy$flow$1053(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$1054(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_43n = a1;
        return;
    }
    private static void recovery$indy$flow$1055(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$1056(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_43U = a1;
        return;
    }
    private static void recovery$indy$flow$1057(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_43f = a1;
        return;
    }
    private static void recovery$indy$flow$1058(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_436 = a1;
        return;
    }
    private static void recovery$indy$flow$1059(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$1060(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$1061(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_40 = a1;
        return;
    }
    private static void recovery$indy$flow$1062(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_48Z = a1;
        return;
    }
    private static void recovery$indy$flow$1063(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_43v = a1;
        return;
    }
    private static native void recovery$indy$flow$1066(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1069(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1072(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1073(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_43P = a1;
        return;
    }
    private static native void recovery$indy$flow$1076(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1079(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1080(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.combat.AutoSoup_47Ci) (a0)).field_43u = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$1081();
    private static java.lang.Object recovery$indy$flow$1082(java.lang.Object a0) {
        return ((int[]) (a0));
    }
    private static native void recovery$indy$flow$1083(java.lang.Object a0);
   private static native MethodHandle recovery$constant$0();
   private static native double recovery$indy$1(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$2(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$3(Object var0, long var1, double var3, double var5, long var7, long var9);
   private static native double recovery$indy$4(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$6(Object var0, long var1, double var3, double var5, long var7, long var9);
   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$8(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$9(Object var0, long var1, double var3, double var5, long var7, long var9);
   private static native double recovery$indy$10(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$12(Object var0, long var1, double var3, double var5, long var7, long var9);
   private static native double recovery$indy$13(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$14(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$15(Object var0, long var1, double var3, double var5, long var7, long var9);
   private static native void recovery$indy$16(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$17(Object var0, long var1, long var3);
   private static native double recovery$indy$18(Object var0, long var1, long var3);
   private static native C_40g recovery$indy$19(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);
   private static native void recovery$indy$22(Object var0, long var1, long var3, long var5);
   private static native C_40g recovery$indy$25(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native void recovery$indy$27(Object var0, long var1, long var3);
   private static native int[] recovery$indy$28(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$29(Object var0, long var1, long var3);
   private static native boolean recovery$indy$30(Object var0, long var1, long var3);
   private static native boolean recovery$indy$31(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$33(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$34(Object var0, long var1, long var3);
   private static native int[] recovery$indy$35(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);
   private static native int[] recovery$indy$37(long var0, long var2);
   private static native C_40g recovery$indy$38(Object var0, long var1, long var3);
   private static native boolean recovery$indy$39(Object var0, long var1, long var3);
   private static native void recovery$indy$40(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$41(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$42(Object var0, long var1, long var3);
   private static native double recovery$indy$43(Object var0, long var1, long var3);
   private static native boolean recovery$indy$44(long var0, long var2, long var4);
   private static native boolean recovery$indy$45(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$46(Object var0, long var1, long var3);
   private static native boolean recovery$indy$47(Object var0, long var1, long var3);
   private static native boolean recovery$indy$48(Object var0, long var1, long var3);
   private static native boolean recovery$indy$49(Object var0, long var1, long var3);
   private static native boolean recovery$indy$50(Object var0, long var1, long var3);
   private static native boolean recovery$indy$51(Object var0, long var1, long var3);
   private static native int recovery$indy$52(Object var0, long var1, long var3);
   private static native boolean recovery$indy$53(Object var0, long var1, long var3, long var5, long var7);
   private static native double recovery$indy$54(Object var0, long var1, long var3);
   private static native boolean recovery$indy$55(Object var0, int var1, int var2, short var3, long var4, long var6);
   private static native boolean recovery$indy$56(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$57(Object var0, long var1, long var3);
   private static native boolean recovery$indy$58(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$59(Object var0, long var1, long var3);
   private static native void recovery$indy$60(Object var0, long var1, long var3);
   private static native double recovery$indy$61(Object var0, long var1, long var3);
   private static native int recovery$indy$62(Object var0, long var1, long var3);
   private static native boolean recovery$indy$63(Object var0, long var1, long var3, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$64(Object var0, long var1, long var3);
   private static native void recovery$indy$65(Object var0, long var1, long var3);
   private static native int[] recovery$indy$66(long var0, long var2);
   private static native boolean recovery$indy$67(Object var0, long var1, long var3);
   private static native int recovery$indy$68(Object var0, long var1, long var3);
   private static native boolean recovery$indy$69(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$70(Object var0, long var1, long var3);
   private static native int[] recovery$indy$71(long var0, long var2);
   private static native boolean recovery$indy$72(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$73(Object var0, long var1, long var3);
   private static native boolean recovery$indy$74(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$75(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$76(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$77(Object var0, long var1, long var3);
   private static native int[] recovery$indy$78(long var0, long var2);
   private static native C_473U recovery$indy$79(Object var0, long var1, long var3);
   private static native void recovery$indy$80(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$81(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$82(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$83(Object var0, long var1, long var3);
   private static native void recovery$indy$84(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$85(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$86(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$87(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$88(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$89(Object var0, long var1, long var3);
   private static native void recovery$indy$90(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$91(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$102();
}
