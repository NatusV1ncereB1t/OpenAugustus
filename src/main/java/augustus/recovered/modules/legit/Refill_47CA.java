package augustus.recovered.modules.legit;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40g;
import net.C_41E;
import net.C_42R;
import net.C_43r;
import net.C_45n;
import net.C_474k;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47GS;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import client.event.RenderListener;
import net.C_47cu;
import net.C_47gG;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import net.C_47pL;
import net.C_47rf;
import net.C_47sT;
import client.module.Category;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Refill_47CA extends client.module.Module implements net.C_48T,net.C_47GS,client.event.RenderListener {
    private final client.setting.BooleanSetting settingAutoOpen = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingAutoOpenDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAutoClose = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingAutoCloseDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingStartDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingTypes = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingBlockInvActions = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingCraftGroup = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCraft = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingReCraftIfSoupsLowerThan = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCraftInstant = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaxMouseMoveSpeedCraft = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingCraftCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingRefillGroup = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRefillInstant = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaxMouseMoveSpeedRefill = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingRefillCPS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingMissClickRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingFailRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDoubleClickRate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSequence = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_462 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_46o = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_465 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_474k field_464 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_430; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_43F; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_463 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_46c = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private int method_46$bef48e2513(double d, int n, C_47gG c_47gG, int n2, short s, int n3, int n4) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        C_47sT c_47sT = c_47gG.method_46$4c10532da1(n3);
        ScaledResolution c_477t = new ScaledResolution(field_43);
        int n5 = (c_477t.method_46$8abf5c6871() - 176) / 2;
        int n6 = (c_477t.method_48$8abf5c6871() - Refill_47CA.recovery$indy$1((Object)this, c_47gG, -5757386289125510707L, l)) / 2;
        double d2 = Math.abs((double)(c_47sT.field_40 + 2 + n5) - Refill_47CA.recovery$indy$3(-5757468171776142126L, l)[0]);
        boolean bl = Refill_47CA.recovery$indy$2(-5763014089650589171L, l);
        double d3 = Math.abs((double)(c_47sT.field_46 + 2 + n6) - Refill_47CA.recovery$indy$4(-5757468171776142126L, l)[1]);
        double d4 = Math.sqrt(d2 * d2 + d3 * d3);
        double d5 = d == d4 ? 0 : (d > d4 ? 1 : -1);
        if (bl) {
            if (d5 > 0) {
                return n4;
            }
            d5 = 0.0;
        }
        return (int)d5;
    }



   private void method_46$9c9e8f0c87(C_47gG var1, int var2, int var3, long var4) {
      var4 = a ^ var4;
      long var6 = var4 ^ 4399549629992L;
      recovery$indy$5(field_43, -7631267016778572219L, var4)
         .method_42$f0ddb617a2(var1.field_43, var2, var3, 0, recovery$indy$6(field_43, -7636299031416842914L, var4));
      recovery$indy$7(this, var6, var1, var2, -7629265115299542324L, var4);
      this.field_43a = true;
   }



    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

   private int[] method_42$edcb88c2b6(net.C_47gG var1, long var2) {
      var2 = a ^ var2;
      int[] var5 = new int[5];
      byte var10000 = ((byte) (recovery$indy$8(-4230042620008642749L, var2) ? 1 : 0));
      int var6 = -1;
      byte var4 = var10000;

      label495:
      while (true) {
         int var60 = var1.field_46.size();
         int var58 = var6;
         if (var58 < var60) {
            byte var254 = -1;
            var58 = var6;
            if (var58 == var254) {
               net.C_47rf var154 = recovery$indy$9(field_43, -4227948880237296117L, var2).field_42X.method_41$ac4db64966();

               while (true) {
                  int var121;
                  label383: {
                     label500: {
                        net.C_47rf var63 = var154;
                        int var227 = var4;
                        var154 = var63;
                        if (var227 != 0) {
                           var154 = var154;
                           net.C_47rf var228 = var154;
                           if (var228 == null) {
                              long var260;
                              var227 = (var260 = var2 - 0L) == 0L ? 0 : (var260 < 0L ? -1 : 1);
                              var121 = var6;
                              if (var227 <= 0) {
                                 break label383;
                              }

                              var121 = var121;
                              var121 = var121;
                              var254 = 8;
                              var227 = var121;
                              if (var227 <= var254) {
                                 break label500;
                              }

                              var5[0]++;
                              long var261;
                              var227 = (var261 = var2 - 0L) == 0L ? 0 : (var261 < 0L ? -1 : 1);
                              var121 = var4;
                              if (var227 <= 0) {
                                 break label383;
                              }

                              var121 = var121;
                              var121 = var121;
                              var227 = var121;
                              if (var227 != 0) {
                                 break label500;
                              }
                           }

                           var154 = var63;
                        }

                        net.C_43r var65 = var154.method_48$dbd570a038();
                        var10000 = ((byte) (var65.equals(net.C_42R.field_45) ? 1 : 0));
                        long var262;
                        var227 = (var262 = var2 - 0L) == 0L ? 0 : (var262 < 0L ? -1 : 1);
                        byte var168 = var4;
                        int var126 = var10000;
                        if (var227 > 0) {
                           var168 = var168;
                           var126 = (byte)var126;
                           int var234 = var168;
                           var126 = var126;
                           if (var234 != 0) {
                              var126 = var126;
                              var126 = var126;
                              var234 = var126;
                              if (var234 != 0) {
                                 var5[1] += var63.field_47;
                                 long var263;
                                 var234 = (var263 = var2 - 0L) == 0L ? 0 : (var263 < 0L ? -1 : 1);
                                 var121 = var4;
                                 if (var234 <= 0) {
                                    break label383;
                                 }

                                 var126 = var121;
                                 var126 = var126;
                                 var234 = var126;
                                 if (var234 != 0) {
                                    break label500;
                                 }
                              }

                              var126 = ((int) (var65.equals(net.C_43r.method_46$4158f44b4a(40)) ? 1 : 0));
                           }

                           var168 = var4;
                           var126 = var126;
                        }

                        long var264;
                        var227 = (var264 = var2 - 0L) == 0L ? 0 : (var264 < 0L ? -1 : 1);
                        var168 = var168;
                        int var133 = var126;
                        if (var227 > 0) {
                           var168 = var168;
                           var133 = (byte)var133;
                           int var239 = var168;
                           var133 = var133;
                           if (var239 != 0) {
                              var133 = var133;
                              var133 = var133;
                              var239 = var133;
                              if (var239 != 0) {
                                 var5[2] += var63.field_47;
                                 long var265;
                                 var239 = (var265 = var2 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
                                 var121 = var4;
                                 if (var239 < 0) {
                                    break label383;
                                 }

                                 var133 = var121;
                                 var133 = var133;
                                 var239 = var133;
                                 if (var239 != 0) {
                                    break label500;
                                 }
                              }

                              var133 = ((int) (var65.equals(net.C_43r.method_46$4158f44b4a(39)) ? 1 : 0));
                           }

                           var168 = var4;
                           var133 = var133;
                        }

                        long var266;
                        var227 = (var266 = var2 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
                        var168 = var168;
                        int var140 = var133;
                        if (var227 > 0) {
                           var168 = var168;
                           var140 = (byte)var140;
                           int var244 = var168;
                           var140 = var140;
                           if (var244 != 0) {
                              var140 = var140;
                              var140 = var140;
                              var244 = var140;
                              if (var244 != 0) {
                                 var5[3] += var63.field_47;
                                 long var267;
                                 var244 = (var267 = var2 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                                 var121 = var4;
                                 if (var244 < 0) {
                                    break label383;
                                 }

                                 var140 = var121;
                                 var140 = var140;
                                 var244 = var140;
                                 if (var244 != 0) {
                                    break label500;
                                 }
                              }

                              var140 = ((int) (var65.equals(net.C_42R.field_41u) ? 1 : 0));
                           }

                           var168 = var4;
                           var140 = var140;
                        }

                        int var248 = var168;
                        var140 = var140;
                        if (var248 != 0) {
                           var140 = var140;
                           var248 = var140;
                           if (var248 == 0) {
                              break label500;
                           }

                           var140 = var6;
                        }

                        var248 = var140;
                        if (var248 != 0) {
                           var5[4]++;
                        }
                     }

                     var6++;
                     var121 = var4;
                  }

                  var58 = var121;
                  if (var58 != 0) {
                     break;
                  }

                  long var268;
                  var58 = (var268 = var2 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                  if (var58 >= 0) {
                     return var5;
                  }

                  var154 = var1.method_46$4c10532da1(var6).method_48$ac4db64966();
               }
            } else {
               do {
                  int var93;
                  label436: {
                     label503: {
                        net.C_47rf var151 = var1.method_46$4c10532da1(var6).method_48$ac4db64966();
                        net.C_47rf var62 = var151;
                        int var201 = var4;
                        var151 = var62;
                        if (var201 != 0) {
                           var151 = var151;
                           net.C_47rf var202 = var151;
                           if (var202 == null) {
                              long var269;
                              var201 = (var269 = var2 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                              var93 = var6;
                              if (var201 <= 0) {
                                 break label436;
                              }

                              var93 = var93;
                              var93 = var93;
                              var254 = 8;
                              var201 = var93;
                              if (var201 <= var254) {
                                 break label503;
                              }

                              var5[0]++;
                              long var270;
                              var201 = (var270 = var2 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                              var93 = var4;
                              if (var201 <= 0) {
                                 break label436;
                              }

                              var93 = var93;
                              var93 = var93;
                              var201 = var93;
                              if (var201 != 0) {
                                 break label503;
                              }
                           }

                           var151 = var62;
                        }

                        net.C_43r var64 = var151.method_48$dbd570a038();
                        var10000 = ((byte) (var64.equals(net.C_42R.field_45) ? 1 : 0));
                        long var271;
                        var201 = (var271 = var2 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                        byte var162 = var4;
                        int var98 = var10000;
                        if (var201 > 0) {
                           var162 = var162;
                           var98 = (byte)var98;
                           int var208 = var162;
                           var98 = var98;
                           if (var208 != 0) {
                              var98 = var98;
                              var98 = var98;
                              var208 = var98;
                              if (var208 != 0) {
                                 var5[1] += var62.field_47;
                                 long var272;
                                 var208 = (var272 = var2 - 0L) == 0L ? 0 : (var272 < 0L ? -1 : 1);
                                 var93 = var4;
                                 if (var208 <= 0) {
                                    break label436;
                                 }

                                 var98 = var93;
                                 var98 = var98;
                                 var208 = var98;
                                 if (var208 != 0) {
                                    break label503;
                                 }
                              }

                              var98 = ((int) (var64.equals(net.C_43r.method_46$4158f44b4a(40)) ? 1 : 0));
                           }

                           var162 = var4;
                           var98 = var98;
                        }

                        long var273;
                        var201 = (var273 = var2 - 0L) == 0L ? 0 : (var273 < 0L ? -1 : 1);
                        var162 = var162;
                        int var105 = var98;
                        if (var201 > 0) {
                           var162 = var162;
                           var105 = (byte)var105;
                           int var213 = var162;
                           var105 = var105;
                           if (var213 != 0) {
                              var105 = var105;
                              var105 = var105;
                              var213 = var105;
                              if (var213 != 0) {
                                 var5[2] += var62.field_47;
                                 long var274;
                                 var213 = (var274 = var2 - 0L) == 0L ? 0 : (var274 < 0L ? -1 : 1);
                                 var93 = var4;
                                 if (var213 < 0) {
                                    break label436;
                                 }

                                 var105 = var93;
                                 var105 = var105;
                                 var213 = var105;
                                 if (var213 != 0) {
                                    break label503;
                                 }
                              }

                              var105 = ((int) (var64.equals(net.C_43r.method_46$4158f44b4a(39)) ? 1 : 0));
                           }

                           var162 = var4;
                           var105 = var105;
                        }

                        long var275;
                        var201 = (var275 = var2 - 0L) == 0L ? 0 : (var275 < 0L ? -1 : 1);
                        var162 = var162;
                        int var112 = var105;
                        if (var201 > 0) {
                           var162 = var162;
                           var112 = (byte)var112;
                           int var218 = var162;
                           var112 = var112;
                           if (var218 != 0) {
                              var112 = var112;
                              var112 = var112;
                              var218 = var112;
                              if (var218 != 0) {
                                 var5[3] += var62.field_47;
                                 long var276;
                                 var218 = (var276 = var2 - 0L) == 0L ? 0 : (var276 < 0L ? -1 : 1);
                                 var93 = var4;
                                 if (var218 < 0) {
                                    break label436;
                                 }

                                 var112 = var93;
                                 var112 = var112;
                                 var218 = var112;
                                 if (var218 != 0) {
                                    break label503;
                                 }
                              }

                              var112 = ((int) (var64.equals(net.C_42R.field_41u) ? 1 : 0));
                           }

                           var162 = var4;
                           var112 = var112;
                        }

                        int var222 = var162;
                        var112 = var112;
                        if (var222 != 0) {
                           var112 = var112;
                           var222 = var112;
                           if (var222 == 0) {
                              break label503;
                           }

                           var112 = var6;
                        }

                        var222 = var112;
                        if (var222 != 0) {
                           var5[4]++;
                        }
                     }

                     var6++;
                     var93 = var4;
                  }

                  var58 = var93;
                  if (var58 != 0) {
                     continue label495;
                  }

                  long var277;
                  var58 = (var277 = var2 - 0L) == 0L ? 0 : (var277 < 0L ? -1 : 1);
               } while (var58 < 0);

               return var5;
            }
         } else {
            while (true) {
               long var278;
               var58 = (var278 = var2 - 0L) == 0L ? 0 : (var278 < 0L ? -1 : 1);
               if (var58 >= 0) {
                  return var5;
               }

               int var9;
               label490: {
                  label506: {
                     net.C_47rf var15 = var1.method_46$4c10532da1(var6).method_48$ac4db64966();
                     net.C_47rf var7 = var15;
                     int var175 = var4;
                     var15 = var7;
                     if (var175 != 0) {
                        var15 = var15;
                        net.C_47rf var176 = var15;
                        if (var176 == null) {
                           long var279;
                           var175 = (var279 = var2 - 0L) == 0L ? 0 : (var279 < 0L ? -1 : 1);
                           var9 = var6;
                           if (var175 <= 0) {
                              break label490;
                           }

                           var9 = var9;
                           var9 = var9;
                           byte var253 = 8;
                           var175 = var9;
                           if (var175 <= var253) {
                              break label506;
                           }

                           var5[0]++;
                           long var280;
                           var175 = (var280 = var2 - 0L) == 0L ? 0 : (var280 < 0L ? -1 : 1);
                           var9 = var4;
                           if (var175 <= 0) {
                              break label490;
                           }

                           var9 = var9;
                           var9 = var9;
                           var175 = var9;
                           if (var175 != 0) {
                              break label506;
                           }
                        }

                        var15 = var7;
                     }

                     net.C_43r var8 = var15.method_48$dbd570a038();
                     var10000 = ((byte) (var8.equals(net.C_42R.field_45) ? 1 : 0));
                     long var281;
                     var175 = (var281 = var2 - 0L) == 0L ? 0 : (var281 < 0L ? -1 : 1);
                     byte var16 = var4;
                     int var70 = var10000;
                     if (var175 > 0) {
                        var16 = var16;
                        var70 = (byte)var70;
                        int var182 = var16;
                        var70 = var70;
                        if (var182 != 0) {
                           var70 = var70;
                           var70 = var70;
                           var182 = var70;
                           if (var182 != 0) {
                              var5[1] += var7.field_47;
                              long var282;
                              var182 = (var282 = var2 - 0L) == 0L ? 0 : (var282 < 0L ? -1 : 1);
                              var9 = var4;
                              if (var182 <= 0) {
                                 break label490;
                              }

                              var70 = var9;
                              var70 = var70;
                              var182 = var70;
                              if (var182 != 0) {
                                 break label506;
                              }
                           }

                           var70 = ((int) (var8.equals(net.C_43r.method_46$4158f44b4a(40)) ? 1 : 0));
                        }

                        var16 = var4;
                        var70 = var70;
                     }

                     long var283;
                     var175 = (var283 = var2 - 0L) == 0L ? 0 : (var283 < 0L ? -1 : 1);
                     var16 = var16;
                     int var77 = var70;
                     if (var175 > 0) {
                        var16 = var16;
                        var77 = (byte)var77;
                        int var187 = var16;
                        var77 = var77;
                        if (var187 != 0) {
                           var77 = var77;
                           var77 = var77;
                           var187 = var77;
                           if (var187 != 0) {
                              var5[2] += var7.field_47;
                              long var284;
                              var187 = (var284 = var2 - 0L) == 0L ? 0 : (var284 < 0L ? -1 : 1);
                              var9 = var4;
                              if (var187 < 0) {
                                 break label490;
                              }

                              var77 = var9;
                              var77 = var77;
                              var187 = var77;
                              if (var187 != 0) {
                                 break label506;
                              }
                           }

                           var77 = ((int) (var8.equals(net.C_43r.method_46$4158f44b4a(39)) ? 1 : 0));
                        }

                        var16 = var4;
                        var77 = var77;
                     }

                     long var285;
                     var175 = (var285 = var2 - 0L) == 0L ? 0 : (var285 < 0L ? -1 : 1);
                     var16 = var16;
                     int var84 = var77;
                     if (var175 > 0) {
                        var16 = var16;
                        var84 = (byte)var84;
                        int var192 = var16;
                        var84 = var84;
                        if (var192 != 0) {
                           var84 = var84;
                           var84 = var84;
                           var192 = var84;
                           if (var192 != 0) {
                              var5[3] += var7.field_47;
                              long var286;
                              var192 = (var286 = var2 - 0L) == 0L ? 0 : (var286 < 0L ? -1 : 1);
                              var9 = var4;
                              if (var192 < 0) {
                                 break label490;
                              }

                              var84 = var9;
                              var84 = var84;
                              var192 = var84;
                              if (var192 != 0) {
                                 break label506;
                              }
                           }

                           var84 = ((int) (var8.equals(net.C_42R.field_41u) ? 1 : 0));
                        }

                        var16 = var4;
                        var84 = var84;
                     }

                     int var196 = var16;
                     var84 = var84;
                     if (var196 != 0) {
                        var84 = var84;
                        var196 = var84;
                        if (var196 == 0) {
                           break label506;
                        }

                        var84 = var6;
                     }

                     var196 = var84;
                     if (var196 != 0) {
                        var5[4]++;
                     }
                  }

                  var6++;
                  var9 = var4;
               }

               var58 = var9;
               if (var58 != 0) {
                  break;
               }
            }
         }
      }
   }




   private void method_42$da8c82d5d4() {
      this.field_43F = 0.0;
      this.field_430 = 0.0;
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_40$172e8d11a1(int var1, short var2, int var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 24264497810914L;
      recovery$indy$11(this, var7, recovery$indy$10(field_43, -7076148506084286828L, var5).field_429, var3, -7073618046524817146L, var5);

      try {
         C_47sT var9 = recovery$indy$12(field_43, -7076148506084286828L, var5).field_429.method_46$4c10532da1(var3);
         C_47pL var10 = (C_47pL)recovery$indy$13(field_43, -7076580991746691467L, var5);
         var10.field_42 = true;
         var10.method_47$23922dd444(var9.field_40 + 2 + var10.field_46c, var9.field_46 + 2 + var10.field_433, 0);
      } catch (IOException var11) {
         var11.printStackTrace();
      }

      this.field_43a = true;
   }



   public boolean method_48$b4bb6d006d(char var1, int var2, short var3) {
      augustus.recovered.modules.legit.Refill_47CA var15;
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 137757400198974L;
      long var8 = var4 ^ 7671179881630L;
      long var10 = var4 ^ 121076264962689L;
      boolean var12 = recovery$indy$14(971284693746421618L, var4);
      boolean var10000 = recovery$indy$15(var8, 964489410336256112L, var4);
      if (var12) {
         if (!var10000) {
            label60: {
               this.field_43P = true;
               this.field_43a = false;
               this.field_43y = -1;
               recovery$indy$16(this.field_45, 971222867968007133L, var4);
               if (var2 > 0) {
                  var15 = this;
                  if (!var12) {
                     break label60;
                  }

                  recovery$indy$17(this, 970924758508507929L, var4);
               }

               if (recovery$indy$18(field_43, 971940769441923052L, var4) == null) {
                  return false;
               }

               var15 = this;
            }

            recovery$indy$19(var15.settingStartDelay, 965016294863153798L, var4);
            return false;
         }

         var10000 = recovery$indy$21(this.field_45, recovery$indy$20(this.settingStartDelay, 965780248308865259L, var4), var10, 965289767781263539L, var4);
      }

      if (var12) {
         if (!var10000) {
            recovery$indy$22(this.field_40, 971222867968007133L, var4);
            return true;
         }

         var10000 = recovery$indy$23(this, var6, 965189765989223445L, var4);
      }

      boolean var13 = var10000;
      var10000 = var13;
      if (var12) {
         if (var13) {
            recovery$indy$24(this.field_40, 971222867968007133L, var4);
         }

         var10000 = var13;
      }

      return var10000;
   }




   private void method_48$4c1b05eebb(long var1, C_47gG var3, int var4) {
      var1 = a ^ var1;
      recovery$indy$25(this, -2699488628873050903L, var1);
      ScaledResolution var5 = new ScaledResolution(field_43);
      int var6 = (var5.method_46$8abf5c6871() - 176) / 2;
      int var7 = (var5.method_48$8abf5c6871() - recovery$indy$26(this, var3, -2695778943026767038L, var1)) / 2;
      C_47sT var8 = var3.method_46$4c10532da1(var4);
      recovery$indy$27(new double[]{var8.field_40 + 2 + var6, var8.field_46 + 2 + var7}, -2698307182719367289L, var1);
      recovery$indy$28(var4, -2696273243617410698L, var1);
      recovery$indy$29(this.field_40, -2699224612740215763L, var1);
   }



   private boolean method_48$05d3808578(long var1, int var3) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 71416837026602L;
      int var4 = (int)((var1 ^ 71416837026602L) >>> 32);
      int var5 = (int)((var1 ^ 71416837026602L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var1 ^ 61568150356932L;
      boolean var9 = recovery$indy$30(-8535139352202119714L, var1);
      int var10000 = (int) ((recovery$indy$31(this.settingRefillInstant, -8533857946352291606L, var1)) ? 1 : 0);
      if (!var9) {
         if (var10000 != 0) {
            return false;
         }

         var10000 = recovery$indy$33(this.field_464, recovery$indy$32(this.settingRefillCPS, -8534844118198952958L, var1), var7, -8535617966981406517L, var1);
      }

      int var10 = var10000;
      var10 = recovery$indy$35(
         this,
         this.field_430,
         var4,
         recovery$indy$34(field_43, -8535690803295008045L, var1).field_429,
         var5,
         (short)var6,
         var3,
         var10,
         -8533779980372057543L,
         var1
      );
      var10000 = var10;
      boolean var14 = var9;
      if (var1 > 0L) {
         if (!var9) {
            if (var10 > 0) {
               recovery$indy$36(this.settingRefillCPS, -8535045529520132497L, var1);
            }

            var10000 = var10;
         }

         var14 = var9;
      }

      if (!var14) {
         var10000 = var10000 <= 0 ? 1 : 0;
      }

      return var10000 != 0;
   }



    private void method_49$bd38c73ed7(long callerKey, short lowerKey, int nextSlot) {
        long key = ((callerKey << 16) | (((long) lowerKey << 48) >>> 48)) ^ recovery$indy$flow$121();
        long actionKey = key ^ 92932507609908L;
        int actionUpper = (int) (actionKey >>> 32);
        short actionMiddle = (short) ((actionKey << 32) >>> 48);
        int actionLower = (int) ((actionKey << 48) >>> 48);
        long fallbackKey = key ^ 86107690443183L;
        short fallbackUpper = (short) (fallbackKey >>> 48);
        int fallbackMiddle = (int) ((fallbackKey << 16) >>> 32);
        char fallbackLower = (char) ((fallbackKey << 48) >>> 48);
        long conditionKey = key ^ 86904016462364L;
        long stateKey = key ^ 77973180352578L;
        boolean guard = recovery$indy$flow$122(-4881265803385782255L, key);
        recovery$indy$flow$123(this, true);
        boolean state = recovery$indy$flow$124(this, stateKey, -4880425491047394059L, key);
        boolean findNearbySlot;
        if (guard) {
            findNearbySlot = state;
        } else {
            boolean preference;
            if (state) {
                preference = recovery$indy$flow$126(((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingRefillInstant)), -4873193802415487707L, key);
                if (callerKey >= 0L) {
                    if (!preference) return;
                    preference = recovery$indy$flow$128(((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingRefillInstant)), -4873193802415487707L, key);
                }
            } else {
                preference = recovery$indy$flow$128(((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingRefillInstant)), -4873193802415487707L, key);
            }
            if (lowerKey > 0) {
                findNearbySlot = !preference && recovery$indy$flow$129(this, conditionKey, -4881383330405634889L, key) && recovery$indy$flow$130(this) > 0;
            } else {
                findNearbySlot = preference;
            }
        }
        int repetitions;
        if (guard) {
            repetitions = findNearbySlot ? 1 : 0;
        } else if (findNearbySlot) {
            Object inventory = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(recovery$indy$flow$132(recovery$indy$flow$131(), -4880645151595331812L, key))))).field_429));
            Object currentSlot = recovery$indy$flow$135(inventory, recovery$indy$flow$134(this));
            int currentX = recovery$indy$flow$136(currentSlot);
            int currentY = recovery$indy$flow$137(currentSlot);
            double nearestDistance = Double.longBitsToDouble(9218868437227405311L);
            int nearestSlot = -1;
            for (int slot = 9;;) {
                Object player = recovery$indy$flow$139(recovery$indy$flow$138(), -4880645151595331812L, key);
                Object slots = ((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(player)))).field_429)))))).field_46));
                if (slot >= recovery$indy$flow$142(slots)) break;
                Object candidateInventory = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(recovery$indy$flow$144(recovery$indy$flow$143(), -4880645151595331812L, key))))).field_429));
                Object stack = recovery$indy$flow$147(recovery$indy$flow$146(candidateInventory, slot));
                if (stack == null && slot != recovery$indy$flow$148(this) && slot != nearestSlot) {
                    Object candidateSlots = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(recovery$indy$flow$150(recovery$indy$flow$149(), -4880645151595331812L, key))))).field_429));
                    Object candidate = recovery$indy$flow$152(candidateSlots, slot);
                    int dx = currentX - recovery$indy$flow$153(candidate);
                    int dy = currentY - recovery$indy$flow$154(candidate);
                    double distance = recovery$indy$flow$155((double) (dx * dx + dy * dy));
                    if (callerKey <= 0L) continue;
                    if (distance < nearestDistance) {
                        nearestDistance = distance;
                        nearestSlot = slot;
                    }
                }
                slot++;
            }
            double maximumDistance = Double.longBitsToDouble(4630263366890291200L);
            if (callerKey > 0L && lowerKey >= 0) {
                if (nearestDistance < maximumDistance) {
                    recovery$indy$flow$156(this, actionUpper, actionMiddle, nearestSlot, actionLower, -4881814954752027862L, key);
                    recovery$indy$flow$157(this, nextSlot);
                    return;
                }
                repetitions = recovery$indy$flow$158(this, fallbackUpper, fallbackMiddle, fallbackLower, -4874946467851866645L, key) ? 2 : 1;
            } else {
                // DCMPG yields a nonzero result for NaN and either strict inequality.
                repetitions = nearestDistance == maximumDistance ? 1 : 2;
            }
        } else {
            repetitions = recovery$indy$flow$158(this, fallbackUpper, fallbackMiddle, fallbackLower, -4874946467851866645L, key) ? 2 : 1;
        }
        while (repetitions > 0) {
            recovery$indy$flow$159(this, actionUpper, actionMiddle, nextSlot, actionLower, -4881814954752027862L, key);
            recovery$indy$flow$160(this, nextSlot);
            repetitions--;
            if (guard) break;
        }
        if (lowerKey < 0) while (true) { }
    }





   public boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 93386199915124L;
      boolean var5 = recovery$indy$49(6741757495380926343L, var1);
      Minecraft var10000 = field_43;
      if (var5) {
         if (recovery$indy$50(field_43, 6743886437544664783L, var1) == null) {
            return false;
         }

         var10000 = field_43;
      }

      if (recovery$indy$51(var10000, 6741583909585234620L, var1) != null) {
         boolean var7 = recovery$indy$52(this.settingBlockInvActions, 6741220011435762934L, var1);
         boolean var10001 = var5;
         if (var1 > 0L) {
            if (var5) {
               if (!var7) {
                  return false;
               }

               var7 = recovery$indy$53(this.field_40, 500L, var3, 6741993218611460166L, var1);
            }

            var10001 = var5;
         }

         if (var1 > 0L) {
            if (var10001) {
               if (var7) {
                  return false;
               }

               var7 = recovery$indy$54(field_43, 6742327912456515118L, var1) instanceof C_47pL;
            }

            var10001 = var5;
         }

         if (!var10001) {
            return var7;
         }

         if (var7) {
            return true;
         }
      }

      return false;
   }



   private int method_47$771f52aa35(C_47gG var1) {
      return 114 + (var1.field_46.size() - 36) / 9 * 18;
   }



   private boolean method_43$05d3808578(long var1, int var3) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 92406849369093L;
      int var4 = (int)((var1 ^ 92406849369093L) >>> 32);
      int var5 = (int)((var1 ^ 92406849369093L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var1 ^ 38490723484907L;
      boolean var9 = recovery$indy$55(5666094604715635441L, var1);
      int var10000 = (int) ((recovery$indy$56(this.settingCraftInstant, 5674167841060501445L, var1)) ? 1 : 0);
      if (!var9) {
         if (var10000 != 0) {
            return false;
         }

         var10000 = recovery$indy$58(this.field_464, recovery$indy$57(this.settingCraftCPS, 5665863138348014381L, var1), var7, 5666777728125003748L, var1);
      }

      int var10 = var10000;
      var10 = recovery$indy$60(
         this,
         this.field_43F,
         var4,
         recovery$indy$59(field_43, 5666714219472850428L, var1).field_429,
         var5,
         (short)var6,
         var3,
         var10,
         5674246004539958550L,
         var1
      );
      var10000 = var10;
      boolean var14 = var9;
      if (var1 >= 0L) {
         if (!var9) {
            if (var10 > 0) {
               recovery$indy$61(this.settingCraftCPS, 5666225080648558912L, var1);
            }

            var10000 = var10;
         }

         var14 = var9;
      }

      if (!var14) {
         var10000 = var10000 <= 0 ? 1 : 0;
      }

      return var10000 != 0;
   }



    public void method_40G$e45a9973e5(long l) {
        block25: {
            int n;
            int n2;
            block14: {
                boolean bl;
                block15: {
                    Object object;
                    block16: {
                        long l2;
                        int n3;
                        int n4;
                        int n5;
                        block26: {
                            block20: {
                                boolean bl2;
                                int n6;
                                block23: {
                                    block24: {
                                        long l3;
                                        int n7;
                                        block21: {
                                            block22: {
                                                int n8;
                                                block19: {
                                                    net.C_47gG c_47gG;
                                                    int n9;
                                                    int n10;
                                                    net.C_43r[] c_43rArray;
                                                    int n11;
                                                    int n12;
                                                    int n13;
                                                    block18: {
                                                        block17: {
                                                            long l4 = l;
                                                            long l5 = l4 ^ 0x604FA6A09FF1L;
                                                            n5 = (int)(l5 >>> 32);
                                                            n4 = (int)(l5 << 32 >>> 48);
                                                            n3 = (int)(l5 << 48 >>> 48);
                                                            long l6 = l4 ^ 0x651FBA064BA5L;
                                                            n13 = (int)(l6 >>> 32);
                                                            n12 = (int)(l6 << 32 >>> 48);
                                                            n11 = (int)(l6 << 48 >>> 48);
                                                            l2 = l4 ^ 0x614BED0B4A55L;
                                                            boolean bl3 = bl = Refill_47CA.recovery$indy$62(-3625370392838622749L, l);
                                                            object = this;
                                                            if (bl3) {
                                                                Refill_47CA.recovery$indy$66(((Refill_47CA)object).field_463, -3625831625609127159L, l);
                                                                return;
                                                            }
                                                            bl3 = Refill_47CA.recovery$indy$63(((Refill_47CA)object).settingAutoOpen, -3626336380165245737L, l);
                                                            if (!bl3) break block17;
                                                            object = field_43;
                                                            net.minecraft.client.gui.GuiScreen c_47Lv = Refill_47CA.recovery$indy$64(object, -3625193021967598065L, l);
                                                            if (c_47Lv != null) break block17;
                                                            object = field_43;
                                                            n2 = ((int) (Refill_47CA.recovery$indy$65(object, -3627636070384056843L, l).method_40$aae029aa0a() ? 1 : 0));
                                                            n6 = n2;
                                                            if (n6 == 0) break block18;
                                                        }
                                                        object = this;
                                                        Refill_47CA.recovery$indy$66(((Refill_47CA)object).field_463, -3625831625609127159L, l);
                                                        return;
                                                    }
                                                    n2 = Refill_47CA.recovery$indy$68(net.C_41E.SOUPS, 36, Refill_47CA.recovery$indy$67((Object)Refill_47CA.field_43, (long)-3623658963102200082L, (long)l).field_429.field_46.size(), -3627381169905693547L, l).size();
                                                    int n14 = n2;
                                                    n8 = Refill_47CA.recovery$indy$70(net.C_41E.HEAL_POTS, 36, Refill_47CA.recovery$indy$69((Object)Refill_47CA.field_43, (long)-3623658963102200082L, (long)l).field_429.field_46.size(), -3627381169905693547L, l).size();
                                                    n2 = Refill_47CA.recovery$indy$71(net.C_41E.SOUPS, -3625493210305170382L, l) ? 1 : 0;
                                                    n6 = n2;
                                                    n2 = n6 != 0 ? Refill_47CA.recovery$indy$72(net.C_41E.SOUPS, 9, 36, -3627381169905693547L, l).size() : 0;
                                                    int n15 = n2;
                                                    n2 = Refill_47CA.recovery$indy$73(net.C_41E.HEAL_POTS, -3625493210305170382L, l) ? 1 : 0;
                                                    n6 = n2;
                                                    n2 = n6 != 0 ? Refill_47CA.recovery$indy$74(net.C_41E.HEAL_POTS, 9, 36, -3627381169905693547L, l).size() : 0;
                                                    n7 = n2;
                                                    n2 = Refill_47CA.recovery$indy$75(net.C_41E.SOUPS, -3625493210305170382L, l) ? 1 : 0;
                                                    n6 = n2;
                                                    if (n6 != 0) {
                                                        c_43rArray = new net.C_43r[]{net.C_42R.field_45};
                                                        n10 = Refill_47CA.recovery$indy$77((Object)Refill_47CA.field_43, (long)-3623658963102200082L, (long)l).field_429.field_46.size();
                                                        n9 = 0;
                                                        c_47gG = Refill_47CA.recovery$indy$76((Object)Refill_47CA.field_43, (long)-3623658963102200082L, (long)l).field_429;
                                                        n2 = Refill_47CA.recovery$indy$78(n13, c_47gG, (short)n12, n9, n10, (short)n11, c_43rArray, -3625564851661367425L, l);
                                                    } else {
                                                        n2 = 0;
                                                    }
                                                    int n16 = n2;
                                                    n2 = Refill_47CA.recovery$indy$79(net.C_41E.SOUPS, -3625493210305170382L, l) ? 1 : 0;
                                                    n6 = n2;
                                                    if (n6 != 0) {
                                                        c_43rArray = new net.C_43r[]{net.C_43r.method_46$4158f44b4a(40)};
                                                        n10 = Refill_47CA.recovery$indy$81((Object)Refill_47CA.field_43, (long)-3623658963102200082L, (long)l).field_429.field_46.size();
                                                        n9 = 0;
                                                        c_47gG = Refill_47CA.recovery$indy$80((Object)Refill_47CA.field_43, (long)-3623658963102200082L, (long)l).field_429;
                                                        n2 = Refill_47CA.recovery$indy$82(n13, c_47gG, (short)n12, n9, n10, (short)n11, c_43rArray, -3625564851661367425L, l);
                                                    } else {
                                                        n2 = 0;
                                                    }
                                                    int n17 = n2;
                                                    n2 = Refill_47CA.recovery$indy$83(net.C_41E.SOUPS, -3625493210305170382L, l) ? 1 : 0;
                                                    n6 = n2;
                                                    if (n6 != 0) {
                                                        c_43rArray = new net.C_43r[]{net.C_43r.method_46$4158f44b4a(39)};
                                                        n10 = Refill_47CA.recovery$indy$85((Object)Refill_47CA.field_43, (long)-3623658963102200082L, (long)l).field_429.field_46.size();
                                                        n9 = 0;
                                                        c_47gG = Refill_47CA.recovery$indy$84((Object)Refill_47CA.field_43, (long)-3623658963102200082L, (long)l).field_429;
                                                        n2 = Refill_47CA.recovery$indy$86(n13, c_47gG, (short)n12, n9, n10, (short)n11, c_43rArray, -3625564851661367425L, l);
                                                    } else {
                                                        n2 = 0;
                                                    }
                                                    int n18 = n2;
                                                    n2 = n14;
                                                    n6 = n2;
                                                    if (n6 != 0) break block19;
                                                    n2 = n15;
                                                    n6 = n2;
                                                    if (n6 > 0) break block20;
                                                    n2 = n18;
                                                    n6 = n2;
                                                    if (n6 <= 0) break block19;
                                                    n2 = n17;
                                                    n6 = n2;
                                                    if (n6 <= 0) break block19;
                                                    long l7 = l - 0L;
                                                    n6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                                    bl2 = bl;
                                                    n2 = n16;
                                                    if (n6 < 0) break block21;
                                                    n6 = bl2 ? 1 : 0;
                                                    if (n6 != 0) break block22;
                                                    n6 = n2;
                                                    if (n6 <= 0) break block19;
                                                    n2 = Refill_47CA.recovery$indy$87(this.settingCraft, -3626336380165245737L, l) ? 1 : 0;
                                                    n6 = n2;
                                                    if (n6 != 0) break block20;
                                                }
                                                n2 = n8;
                                            }
                                            bl2 = bl;
                                        }
                                        if ((n6 = (int)((l3 = l - 0L) == 0L ? 0 : (l3 < 0L ? -1 : 1))) < 0) break block23;
                                        n6 = bl2 ? 1 : 0;
                                        if (n6 != 0) break block24;
                                        n6 = n2;
                                        if (n6 != 0) break block25;
                                        n2 = n7;
                                    }
                                    bl2 = bl;
                                }
                                if ((n6 = (int)(bl2 ? 1 : 0)) != 0) break block26;
                                n6 = n2;
                                if (n6 <= 0) break block25;
                            }
                            n2 = 0;
                        }
                        int n19 = n2;
                        int n20 = 36;
                        while (true) {
                            block32: {
                                block33: {
                                    long l8;
                                    block27: {
                                        long l9;
                                        block28: {
                                            block29: {
                                                block31: {
                                                    Object object2;
                                                    block30: {
                                                        int n21;
                                                        if ((n = n20) >= (n21 = Refill_47CA.recovery$indy$88((Object)Refill_47CA.field_43, (long)-3623658963102200082L, (long)l).field_429.field_46.size())) break block27;
                                                        net.C_47rf c_47rf = Refill_47CA.recovery$indy$89((Object)Refill_47CA.field_43, (long)-3623658963102200082L, (long)l).field_429.method_46$4c10532da1(n20).method_48$ac4db64966();
                                                        long l10 = l - 0L;
                                                        n = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                                                        n2 = bl ? 1 : 0;
                                                        if (n < 0) break block14;
                                                        n = n2;
                                                        if (n != 0) break block15;
                                                        long l11 = l - 0L;
                                                        n = l11 == 0L ? 0 : (l11 < 0L ? -1 : 1);
                                                        n2 = bl ? 1 : 0;
                                                        if (n <= 0) break block28;
                                                        n = n2;
                                                        if (n != 0) break block29;
                                                        long l12 = l - 0L;
                                                        n = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                                        object = c_47rf;
                                                        if (n < 0) break block30;
                                                        object2 = object;
                                                        if (object2 == null) break block31;
                                                        object = c_47rf;
                                                    }
                                                    net.C_43r c_43r = net.C_42R.field_45;
                                                    object2 = ((net.C_47rf)object).method_48$dbd570a038();
                                                    if (object2 != c_43r) break block32;
                                                }
                                                n19 = 1;
                                            }
                                            n2 = bl ? 1 : 0;
                                        }
                                        if ((n = (int)((l9 = l - 0L) == 0L ? 0 : (l9 < 0L ? -1 : 1))) <= 0) break block33;
                                        n = n2;
                                        if (n != 0) break block32;
                                    }
                                    n = (l8 = l - 0L) == 0L ? 0 : (l8 < 0L ? -1 : 1);
                                    n2 = n19;
                                    if (n <= 0) break block14;
                                }
                                if ((n = n2) == 0) break block15;
                                long l13 = l - 0L;
                                n = l13 == 0L ? 0 : (l13 < 0L ? -1 : 1);
                                object = this;
                                if (n <= 0) break block16;
                                object = ((Refill_47CA)object).field_463;
                                n2 = Refill_47CA.recovery$indy$91(object, Refill_47CA.recovery$indy$90(this.settingAutoOpenDelay, -3624505646176462785L, l), l2, -3624998884953872281L, l) ? 1 : 0;
                                n = n2;
                                if (n != 0) {
                                    break;
                                }
                                break block15;
                            }
                            ++n20;
                        }
                        Refill_47CA.recovery$indy$92(n5, n4, (char)n3, -3626881912470707736L, l);
                        Refill_47CA.recovery$indy$94(field_43, new net.C_47pL(Refill_47CA.recovery$indy$93(field_43, -3623658963102200082L, l)), -3624325777576878490L, l);
                        object = this.field_463;
                        Refill_47CA.recovery$indy$95(object, -3625831625609127159L, l);
                        object = this;
                    }
                    Refill_47CA.recovery$indy$96(((Refill_47CA)object).settingAutoOpenDelay, -3625289532372358574L, l);
                }
                n2 = bl ? 1 : 0;
            }
            if ((n = n2) == 0) return;
        }
        Refill_47CA.recovery$indy$97(this.field_463, -3625831625609127159L, l);
    }







   private boolean method_45K$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 43041678518321L;
      boolean var5 = recovery$indy$98(-3106825779389749071L, var1);
      boolean var6 = recovery$indy$100(this.field_462, recovery$indy$99(this.settingMissClickRate, -3107090192439115411L, var1), var3, -3098601249615617732L, var1);
      boolean var10000 = var6;
      if (!var5) {
         if (var6) {
            recovery$indy$101(this.settingMissClickRate, -3106871455085694208L, var1);
         }

         var10000 = var6;
      }

      return var10000;
   }



   private boolean method_45F$aae029aa0a() {
      long var1 = a ^ 100517593586478L;
      long var10000 = 1261412339581611474L;
      boolean var3 = AimBot_47O_.method_45g$aae029aa0a();
      long var10001 = 1269413960617060582L;
      BooleanSetting var4 = this.settingCraft;
      boolean var6 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = 1269413960617060582L;
         BooleanSetting var5 = this.settingCraftInstant;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : !var6;
   }



   private boolean method_45t$e9830c5930(short var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 42314063915906L;
      boolean var8 = recovery$indy$102(1679828347205817671L, var4);
      boolean var9 = recovery$indy$104(this.field_465, recovery$indy$103(this.settingDoubleClickRate, 1680516352195674846L, var4), var6, 1678874875111842447L, var4);
      boolean var10000 = var9;
      if (var8) {
         if (var9) {
            recovery$indy$105(this.settingDoubleClickRate, 1680174190434070707L, var4);
         }

         var10000 = var9;
      }

      return var10000;
   }



   private boolean method_456$0dd78e0064(long var1) {
      byte var45;
      byte var50;
      byte var51;
      augustus.recovered.modules.legit.Refill_47CA var55;
      var1 = a ^ var1;
      int var3 = (int)((var1 ^ 105485622827578L) >>> 32);
      int var4 = (int)((var1 ^ 105485622827578L) << 32 >>> 32);
      long var5 = var1 ^ 130433962255503L;
      long var7 = var1 ^ 137647427546071L;
      long var9 = var1 ^ 82206540442881L;
      long var11 = var1 ^ 50080453514236L;
      long var13 = var1 ^ 79898114551555L;
      long var15 = (var1 ^ 44355727449624L) >>> 16;
      int var17 = (int)((var1 ^ 44355727449624L) << 48 >>> 48);
      byte var19 = (byte) ((recovery$indy$106(-1659412650150827280L, var1)) ? 1 : 0);
      this.field_43F = this.field_43F + recovery$indy$107(this.settingMaxMouseMoveSpeedCraft, var5, -1664828332513306100L, var1);
      int var10000 = (int) ((recovery$indy$108(this, var3, var4, -1659319257450619694L, var1)) ? 1 : 0);
      if (var19 != 0) {
         if (var10000 == 0) {
            return true;
         }

         this.field_430 = this.field_430 + recovery$indy$109(this.settingMaxMouseMoveSpeedRefill, var5, -1664828332513306100L, var1);
         var10000 = 0;
      }

      int var20 = var10000;
      int var21 = 9;

      label541: {
         label545: {
            label539: {
               C_47rf var36;
               while (true) {
                  if (var21 < 36) {
                     var36 = recovery$indy$110(field_43, -1666326646248625224L, var1).field_429.method_46$4c10532da1(var21).method_48$ac4db64966();
                     var10000 = var19;
                     if (var1 > 0L) {
                        label534:
                        if (var19 != 0) {
                           if (var19 == 0) {
                              if (var36 != null) {
                                 boolean var43 = var36.method_48$dbd570a038().equals(C_42R.field_45);
                                 if (var19 != 0) {
                                    if (!var43) {
                                       var21++;
                                       if (var19 == 0) {
                                          break label539;
                                       }
                                    } else {
                                       Refill_47CA var44 = this;
                                       int var57 = var21;
                                       if (var19 != 0) {
                                          if (recovery$indy$113(this, var7, var21, -1665888515694654826L, var1)) {
                                             return true;
                                          }

                                          var44 = this;
                                          var57 = var21;
                                       }

                                       int var18 = var57;
                                       recovery$indy$114(var44, var15, (short)var17, var18, -1658717704403829186L, var1);
                                       var21++;
                                       if (var19 == 0) {
                                          break label539;
                                       }
                                    }
                                 } else {
                                    if (var43) {
                                       return true;
                                    }

                                    int var32 = var21;
                                    recovery$indy$114(this, var15, (short)var17, var32, -1658717704403829186L, var1);
                                    var21++;
                                    if (var19 == 0) {
                                       break label539;
                                    }
                                 }
                              } else {
                                 var21++;
                                 if (var19 == 0) {
                                    break label539;
                                 }
                              }

                              if (var21 >= recovery$indy$111(field_43, -1666326646248625224L, var1).field_429.field_46.size()) {
                                 break label539;
                              }

                              var36 = recovery$indy$112(field_43, -1666326646248625224L, var1).field_429.method_46$4c10532da1(var21).method_48$ac4db64966();
                              var45 = var19;
                              if (var1 >= 0L) {
                                 if (var19 == 0) {
                                    break label545;
                                 }

                                 var45 = var19;
                              }
                              break;
                           }

                           label449:
                           if (var36 != null) {
                              var10000 = (int) ((var36.method_48$dbd570a038().equals(C_42R.field_45)) ? 1 : 0);
                              int var10001 = var19;
                              if (var1 > 0L) {
                                 if (var19 != 0) {
                                    if (var10000 == 0) {
                                       var21++;
                                       if (var19 != 0) {
                                          continue;
                                       }

                                       var10000 = var20;
                                       break label534;
                                    }

                                    var10000 = var36.field_47;
                                    var10001 = var19;
                                 } else {
                                    var10001 = var19;
                                 }
                              }

                              if (var1 >= 0L) {
                                 if (var10001 == 0) {
                                    var20 = var10000;
                                    var10000 = var19;
                                    break label449;
                                 }

                                 var10001 = var36.method_44$8abf5c6871();
                              }

                              if (var10000 >= var10001) {
                                 var21++;
                                 if (var19 != 0) {
                                    continue;
                                 }

                                 var10000 = var20;
                                 break label534;
                              }

                              var20 = 1;
                              var10000 = var19;
                           } else {
                              var20 = 1;
                              var10000 = var19;
                           }

                           if (var1 > 0L) {
                              if (var10000 == 0) {
                                 var21++;
                                 if (var19 != 0) {
                                    continue;
                                 }

                                 var10000 = var20;
                              } else {
                                 var10000 = var20;
                              }
                           }
                        } else {
                           var10000 = var19;
                           if (var1 > 0L) {
                              if (var19 == 0) {
                                 var21++;
                                 if (var19 != 0) {
                                    continue;
                                 }

                                 var10000 = var20;
                              } else {
                                 var10000 = var20;
                              }
                           }
                        }
                     } else if (var1 > 0L) {
                        if (var19 == 0) {
                           var21++;
                           if (var19 != 0) {
                              continue;
                           }

                           var10000 = var20;
                        } else {
                           var10000 = var20;
                        }
                     }
                  } else {
                     var10000 = var20;
                  }

                  if (var1 >= 0L) {
                     if (var19 == 0) {
                        break label541;
                     }

                     if (var10000 == 0) {
                        var10000 = 0;
                        if (var1 <= 0L) {
                           break label541;
                        }

                        var21 = 0;
                        break label545;
                     }

                     var21 = 36;
                     if (var21 >= recovery$indy$111(field_43, -1666326646248625224L, var1).field_429.field_46.size()) {
                        break label539;
                     }

                     var36 = recovery$indy$112(field_43, -1666326646248625224L, var1).field_429.method_46$4c10532da1(var21).method_48$ac4db64966();
                     var45 = var19;
                     if (var1 >= 0L) {
                        if (var19 == 0) {
                           break label545;
                        }

                        var45 = var19;
                     }
                  } else {
                     if (var10000 >= var19) {
                        break label539;
                     }

                     var36 = recovery$indy$112(field_43, -1666326646248625224L, var1).field_429.method_46$4c10532da1(var21).method_48$ac4db64966();
                     var45 = var19;
                     if (var1 >= 0L) {
                        if (var19 == 0) {
                           break label545;
                        }

                        var45 = var19;
                     }
                  }
                  break;
               }

               while (true) {
                  if (var1 > 0L) {
                     if (var45 != 0) {
                        if (var36 != null) {
                           boolean var46 = var36.method_48$dbd570a038().equals(C_42R.field_45);
                           if (var19 != 0) {
                              if (!var46) {
                                 var21++;
                                 if (var19 == 0) {
                                    break;
                                 }
                              } else {
                                 Refill_47CA var47 = this;
                                 int var58 = var21;
                                 if (var19 != 0) {
                                    if (recovery$indy$113(this, var7, var21, -1665888515694654826L, var1)) {
                                       return true;
                                    }

                                    var47 = this;
                                    var58 = var21;
                                 }

                                 int var33 = var58;
                                 recovery$indy$114(var47, var15, (short)var17, var33, -1658717704403829186L, var1);
                                 var21++;
                                 if (var19 == 0) {
                                    break;
                                 }
                              }
                           } else {
                              if (var46) {
                                 return true;
                              }

                              int var34 = var21;
                              recovery$indy$114(this, var15, (short)var17, var34, -1658717704403829186L, var1);
                              var21++;
                              if (var19 == 0) {
                                 break;
                              }
                           }
                        } else {
                           var21++;
                           if (var19 == 0) {
                              break;
                           }
                        }
                     } else if (var19 == 0) {
                        break;
                     }
                  } else if (var45 == 0) {
                     break;
                  }

                  if (var21 >= recovery$indy$111(field_43, -1666326646248625224L, var1).field_429.field_46.size()) {
                     break;
                  }

                  var36 = recovery$indy$112(field_43, -1666326646248625224L, var1).field_429.method_46$4c10532da1(var21).method_48$ac4db64966();
                  var45 = var19;
                  if (var1 >= 0L) {
                     if (var19 == 0) {
                        break label545;
                     }

                     var45 = var19;
                  }
               }
            }

            var10000 = 0;
            if (var1 <= 0L) {
               break label541;
            }

            var21 = 0;
         }

         var10000 = 36;
      }

      int var37 = var10000;

      while (var37 < recovery$indy$115(field_43, -1666326646248625224L, var1).field_429.field_46.size()) {
         C_47rf var23 = recovery$indy$116(field_43, -1666326646248625224L, var1).field_429.method_46$4c10532da1(var37).method_48$ac4db64966();
         byte var48 = var19;
         if (var1 > 0L) {
            if (var19 != 0) {
               if (var23 == null) {
                  var21++;
               }

               var37++;
            }

            var48 = var19;
         }

         if (var48 == 0) {
            break;
         }
      }

      ArrayList var38 = new ArrayList();
      int var39 = var21;
      C_41E[] var24 = recovery$indy$117(-1664110290876241195L, var1);
      int var25 = var24.length;
      int var26 = 0;

      label309:
      while (true) {
         var10000 = var26;
         int var59 = var25;

         label306:
         while (true) {
            label304:
            if (var10000 < var59) {
               C_41E var27 = var24[var26];
               List var28 = recovery$indy$118(var27, 9, 36, -1657643614770845245L, var1);
               var50 = var19;
               if (var1 < 0L) {
                  break label309;
               }

               if (var19 == 0) {
                  break;
               }

               Iterator var29 = var28.iterator();

               label301: {
                  while (true) {
                     if (var29.hasNext()) {
                        int var30 = (Integer)var29.next();
                        var39--;
                        var38.add(var30);
                        var51 = var19;
                        if (var1 <= 0L) {
                           break label301;
                        }

                        if (var19 == 0) {
                           break;
                        }

                        if (var19 != 0) {
                           continue;
                        }
                     }

                     var10000 = var39;
                     var59 = var21;
                     if (var1 <= 0L) {
                        continue label306;
                     }

                     if (var39 != var21) {
                        break label304;
                     }

                     var26++;
                     break;
                  }

                  var51 = var19;
               }

               if (var51 != 0) {
                  continue label309;
               }
            }

            if (var1 >= 0L) {
               var38 = recovery$indy$121(
                  recovery$indy$119(field_43, -1666326646248625224L, var1).field_429,
                  var38,
                  var11,
                  recovery$indy$120(this.settingSequence, var9, -1658537635961823842L, var1),
                  -1665485601313554905L,
                  var1
               );
            }
            break;
         }

         var50 = 0;
         break;
      }

      int var40 = var50;

      int var60;
      label275: {
         label274:
         while (true) {
            Object var53;
            if (var40 < var38.size()) {
               var10000 = var21;
               var60 = var19;
               if (var1 >= 0L) {
                  if (var19 == 0) {
                     var60 = var19;
                     break label275;
                  }

                  var60 = var19;
               }

               if (var1 < 0L) {
                  break label275;
               }

               if (var60 == 0) {
                  break;
               }

               if (var21 > 0) {
                  var53 = var38.get(var40);
               } else {
                  var53 = this.settingAutoClose;
                  if (var1 >= 0L) {
                     var10000 = (int) ((recovery$indy$124(this.settingAutoClose, -1658868755832532607L, var1)) ? 1 : 0);
                     break;
                  }
               }
            } else {
               var53 = this.settingAutoClose;
               if (var1 >= 0L) {
                  var10000 = (int) ((recovery$indy$124(this.settingAutoClose, -1658868755832532607L, var1)) ? 1 : 0);
                  break;
               }
            }

            do {
               label572: {
                  int var54 = (Integer)var53;
                  if (var1 >= 0L) {
                     var25 = var54;
                     var55 = this;
                     var60 = var25;
                     if (var19 == 0) {
                        break label572;
                     }

                     var54 = (int) ((recovery$indy$122(this, var7, var25, -1665888515694654826L, var1)) ? 1 : 0);
                  }

                  if (var1 <= 0L) {
                     return var54 != 0;
                  }

                  if (var54 != 0) {
                     return true;
                  }

                  var55 = this;
                  var60 = var25;
               }

               int var35 = var60;
               recovery$indy$123(var55, var15, (short)var17, var35, -1658717704403829186L, var1);
               var21--;
               var40++;
               if (var19 != 0) {
                  continue label274;
               }

               var53 = this.settingAutoClose;
            } while (var1 < 0L);

            var10000 = (int) ((recovery$indy$124(this.settingAutoClose, -1658868755832532607L, var1)) ? 1 : 0);
            break;
         }

         var60 = var19;
      }

      if (var60 != 0) {
         if (var10000 != 0) {
            byte var63 = (byte) ((recovery$indy$125(field_43, -1657681655013937462L, var1)) ? 1 : 0);
            if (var19 == 0) {
               return var63 != 0;
            }

            label227:
            if (var63 == 0) {
               boolean var56 = this.field_43a;
               byte var62 = var19;
               if (var1 > 0L) {
                  if (var19 != 0) {
                     if (!this.field_43a) {
                        break label227;
                     }

                     var56 = this.field_43P;
                  }

                  var62 = var19;
               }

               if (var1 > 0L) {
                  if (var62 != 0) {
                     if (var56) {
                        recovery$indy$126(this.field_46c, -1659474510840594849L, var1);
                        this.field_43P = false;
                        recovery$indy$127(this.settingAutoCloseDelay, -1664559990939595004L, var1);
                     }

                     var56 = recovery$indy$129(
                        this.field_46c, recovery$indy$128(this.settingAutoCloseDelay, -1664921531518141079L, var1), var13, -1664287487615038159L, var1
                     );
                  }

                  var62 = var19;
               }

               if (var62 != 0) {
                  if (var56) {
                     recovery$indy$130(field_43, -1666326646248625224L, var1).method_47a$da8c82d5d4();
                     recovery$indy$131(this.field_46c, -1659474510840594849L, var1);
                     this.field_43P = true;
                  }

                  var56 = true;
               }

               return var56;
            }
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }







   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$132(this, 32, var5, -7102250801098957550L, var1);
      recovery$indy$133(this, 52, 2, var3, -7104078055204435756L, var1);
      recovery$indy$134(this, 34, var5, -7102250801098957550L, var1);
   }



   private boolean method_450$aae029aa0a() {
      long var1 = a ^ 27229211066692L;
      long var10000 = -8364542960413444168L;
      boolean var3 = AimBot_47O_.method_45g$aae029aa0a();
      long var10001 = -8361039438762872180L;
      BooleanSetting var4 = this.settingCraft;
      boolean var6 = var4.method_49$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = -8361039438762872180L;
         BooleanSetting var5 = this.settingCraftInstant;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : !var6;
   }



   private boolean method_45C$aae029aa0a() {
      long var1 = a ^ 42024753591073L;
      long var10000 = -463669216217367656L;
      boolean var3 = AimBot_47O_.method_45i$aae029aa0a();
      long var10001 = -463131792254730007L;
      BooleanSetting var4 = this.settingRefillInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_45M$aae029aa0a() {
      long var1 = a ^ 134732524358881L;
      long var10000 = -8768985435990197731L;
      boolean var3 = AimBot_47O_.method_45g$aae029aa0a();
      long var10001 = -8767667726912782551L;
      BooleanSetting var4 = this.settingRefillInstant;
      boolean var5 = var4.method_49$aae029aa0a();
      if (!var3) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_45Y$a10325316f(int var1, int var2) {
        int var43;
        int var48;
        int var51;
        int var53;
        int var54;
        int var55;
      long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
      long var10001 = var3 ^ 38631610363670L;
      int var5 = (int)((var3 ^ 38631610363670L) >>> 32);
      int var6 = (int)((var3 ^ 38631610363670L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var3 ^ 126098385400841L;
      long var10 = var3 ^ 23823167846281L;
      long var12 = var3 ^ 120676716608638L;
      long var14 = var3 ^ 54096224298204L;
      byte var16 = ((byte) (recovery$indy$flow$433(-5161066648926501837L, var3) ? 1 : 0));
      int var10000 = ((int) (recovery$indy$flow$435(net.C_41E.SOUPS, -5152253430351855134L, var3) ? 1 : 0));
      if (var16 != 0) {
         return (((var10000) & 1) != 0);
      }

      if (!(var10000 != 0)) {
         return true;
      }

      if ((net.minecraft.client.gui.GuiScreen)recovery$indy$flow$437(field_43, -5160958285295580193L, var3) instanceof net.C_47pL
         && recovery$indy$flow$440(this.settingCraft, -5153094712574295801L, var3)) {
         int[] var17 = (int[])recovery$indy$flow$444(
            this, ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$442(field_43, -5159435562928669890L, var3)).field_429, var10, -5153214644928367405L, var3
         );
         if (var17[1] != 0 && var17[2] != 0 && var17[3] != 0) {
            int var18 = Math.min(var17[1], Math.min(var17[2], var17[3]));
            int var19 = var17[0];
            var10000 = var18;
            int var46 = var16;
            if (var2 > 0) {
               if (var16 == 0) {
                  if (var18 <= 0) {
                     return true;
                  }

                  var10000 = var18;
               }

               var46 = var16;
            }

            label659: {
               if (var1 > 0) {
                  if (var46 != 0) {
                     break label659;
                  }

                  var46 = var19;
               }

               var10000 = var10000 > var46 ? 1 : 0;
            }

            int var20 = var10000;
            net.C_43r[] var21 = new net.C_43r[]{net.C_42R.field_45, net.C_43r.method_46$4158f44b4a(40), net.C_43r.method_46$4158f44b4a(39)};
            boolean[] var22 = new boolean[]{false, false, false};
            byte var23 = ((byte) (0));
            int var24 = 1;

            label652:
            while (true) {
               var10000 = var24;

               label649:
               while (true) {
                  int var47 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$452(field_43, -5159435562928669890L, var3)).field_429.field_46.size();

                  label646: {
                     label645:
                     while (true) {
                        if (var10000 < var47) {
                           var10000 = var24;
                           var48 = var16;
                           if (var1 <= 0) {
                              break label646;
                           }

                           if (var16 != 0) {
                              break;
                           }

                           label640: {
                              label678: {
                                 byte var49 = var16;
                                 if (var2 >= 0) {
                                    if (var16 != 0) {
                                       break label678;
                                    }

                                    var49 = ((byte) (1));
                                 }

                                 if (var24 != var49) {
                                    break label640;
                                 }

                                 var22 = new boolean[]{false, false, false};
                                 var10000 = ((int[])recovery$indy$flow$459(
                                    this,
                                    ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$457(field_43, -5159435562928669890L, var3)).field_429,
                                    var10,
                                    -5153214644928367405L,
                                    var3
                                 ))[0];
                              }

                              var19 = var10000;
                           }

                           label630: {
                              label629: {
                                 net.C_47rf var25 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$461(field_43, -5159435562928669890L, var3))
                                    .field_429
                                    .method_46$4c10532da1(var24)
                                    .method_48$ac4db64966();
                                 if (var25 != null) {
                                    net.C_43r var26 = var25.method_48$dbd570a038();
                                    var10000 = var24;

                                    label626:
                                    while (true) {
                                       byte var50 = var16;
                                       if (var1 > 0) {
                                          if (var16 == 0) {
                                             if (var10000 < 5) {
                                                for (int var27 = 0; var27 < var21.length; var27++) {
                                                   if (var21[var27].equals(var26)) {
                                                      var22[var27] = true;
                                                   }
                                                }
                                             }

                                             if (var1 <= 0) {
                                                break label629;
                                             }

                                             var10000 = var19;
                                          }

                                          var50 = var16;
                                       }

                                       label557: {
                                          label556:
                                          if (var50 == 0) {
                                             if (var10000 > 0) {
                                                double var56;
                                                var10000 = (
                                                         var56 = var17[4]
                                                            - recovery$indy$flow$468(this.settingReCraftIfSoupsLowerThan, var8, -5160188950358095222L, var3)
                                                      )
                                                      == 0.0
                                                   ? 0
                                                   : (var56 < 0.0 ? -1 : 1);
                                                var51 = var16;
                                                if (var2 <= 0) {
                                                   break label557;
                                                }

                                                if (var16 != 0) {
                                                   break label556;
                                                }

                                                if (var10000 <= 0) {
                                                   if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$470(field_43, -5159435562928669890L, var3))
                                                         .field_42X
                                                         .method_41$ac4db64966()
                                                      == null) {
                                                      label548: {
                                                         label685: {
                                                            var10000 = var24;
                                                            byte var52 = var16;
                                                            if (var1 > 0) {
                                                               if (var16 != 0) {
                                                                  break label685;
                                                               }

                                                               var52 = ((byte) (8));
                                                            }

                                                            label686: {
                                                               if (var2 > 0) {
                                                                  if (var24 <= var52) {
                                                                     break label686;
                                                                  }

                                                                  var10000 = ((int) (var26.equals(var21[0]) ? 1 : 0));
                                                                  var52 = var16;
                                                               }

                                                               label535: {
                                                                  label534: {
                                                                     label687: {
                                                                        if (var2 >= 0) {
                                                                           if (var52 == 0) {
                                                                              if (var10000 != 0 && !var22[0]) {
                                                                                 break label687;
                                                                              }

                                                                              var10000 = ((int) (var26.equals(var21[1]) ? 1 : 0));
                                                                           }

                                                                           var52 = var16;
                                                                        }

                                                                        if (var2 > 0) {
                                                                           if (var52 == 0) {
                                                                              if (var10000 != 0) {
                                                                                 var43 = ((var22[1]) ? 1 : 0);
                                                                                 var53 = var16;
                                                                                 if (var2 <= 0) {
                                                                                    break label535;
                                                                                 }

                                                                                 if (var16 != 0) {
                                                                                    break label534;
                                                                                 }

                                                                                 if (var43 == 0) {
                                                                                    break label687;
                                                                                 }
                                                                              }

                                                                              var10000 = ((int) (var26.equals(var21[2]) ? 1 : 0));
                                                                           }

                                                                           var52 = var16;
                                                                        }

                                                                        if (var52 != 0) {
                                                                           break label685;
                                                                        }

                                                                        if (var10000 == 0) {
                                                                           break label686;
                                                                        }

                                                                        var10000 = ((int) (var22[2] ? 1 : 0));
                                                                        var54 = var16;
                                                                        if (var2 < 0) {
                                                                           break label548;
                                                                        }

                                                                        if (var16 != 0) {
                                                                           break label685;
                                                                        }

                                                                        if (var10000 != 0) {
                                                                           break label686;
                                                                        }
                                                                     }

                                                                     var43 = ((recovery$indy$flow$476(this, var12, var24, -5153979015723245227L, var3)) ? 1 : 0);
                                                                  }

                                                                  var53 = var16;
                                                               }

                                                               if (var53 == 0) {
                                                                  if (var43 != 0) {
                                                                     return false;
                                                                  }

                                                                  recovery$indy$flow$480(
                                                                     this,
                                                                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$478(field_43, -5159435562928669890L, var3)).field_429,
                                                                     var24,
                                                                     var20,
                                                                     var14,
                                                                     -5159635180074881645L,
                                                                     var3
                                                                  );
                                                                  var23 = ((byte) (1));
                                                                  var43 = 0;
                                                               }

                                                               var24 = var43;
                                                            }

                                                            var10000 = ((int) (var22[0] ? 1 : 0));
                                                         }

                                                         var54 = var16;
                                                      }

                                                      if (var1 >= 0) {
                                                         if (var54 == 0) {
                                                            if (var10000 == 0) {
                                                               break;
                                                            }

                                                            var10000 = ((int) (var22[1] ? 1 : 0));
                                                         }

                                                         var54 = var16;
                                                      }

                                                      if (var2 >= 0) {
                                                         if (var54 == 0) {
                                                            if (var10000 == 0) {
                                                               break;
                                                            }

                                                            var10000 = ((int) (var22[2] ? 1 : 0));
                                                         }

                                                         var54 = var16;
                                                      }

                                                      if (var2 > 0) {
                                                         if (var54 == 0) {
                                                            if (var10000 == 0) {
                                                               break;
                                                            }

                                                            var10000 = ((int) (recovery$indy$flow$481(this, var12, 0, -5153979015723245227L, var3) ? 1 : 0));
                                                         }

                                                         var54 = var16;
                                                      }

                                                      if (var54 == 0) {
                                                         if (var10000 != 0) {
                                                            return false;
                                                         }

                                                         recovery$indy$flow$482(this, var5, (short)var6, 0, var7, -5160500036372277496L, var3);
                                                         var23 = ((byte) (1));
                                                         var10000 = 0;
                                                      }

                                                      var24 = var10000;
                                                      var10000 = var16;
                                                      if (var1 <= 0) {
                                                         break label630;
                                                      }

                                                      if (var16 == 0) {
                                                         break;
                                                      }
                                                   }

                                                   net.C_47rf var32 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$484(field_43, -5159435562928669890L, var3))
                                                      .field_42X
                                                      .method_41$ac4db64966();
                                                   net.C_43r var28 = var32.method_48$dbd570a038();
                                                   int var29 = 0;

                                                   while (true) {
                                                      if (var29 < 3) {
                                                         var10000 = ((int) (var28.equals(var21[var29]) ? 1 : 0));
                                                      } else {
                                                         var10000 = var16;
                                                         if (var1 >= 0) {
                                                            if (var1 <= 0) {
                                                               break label630;
                                                            }

                                                            if (var16 == 0) {
                                                               break label626;
                                                            }
                                                            break;
                                                         }
                                                      }

                                                      var47 = var16;
                                                      if (var1 < 0) {
                                                         continue label645;
                                                      }

                                                      label690: {
                                                         if (var2 > 0) {
                                                            if (var16 == 0) {
                                                               if (var10000 == 0) {
                                                                  break label690;
                                                               }

                                                               var10000 = ((int) (var22[var29] ? 1 : 0));
                                                            }

                                                            var47 = var16;
                                                         }

                                                         if (var2 >= 0) {
                                                            if (var47 == 0) {
                                                               if (var10000 != 0) {
                                                                  break label690;
                                                               }

                                                               var10000 = ((int) (recovery$indy$flow$489(this, var12, var29 + 1, -5153979015723245227L, var3) ? 1 : 0));
                                                            }

                                                            var47 = var16;
                                                         }

                                                         if (var47 == 0) {
                                                            if (var10000 != 0) {
                                                               return false;
                                                            }

                                                            recovery$indy$flow$493(
                                                               this,
                                                               ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$491(field_43, -5159435562928669890L, var3)).field_429,
                                                               var29 + 1,
                                                               0,
                                                               var14,
                                                               -5159635180074881645L,
                                                               var3
                                                            );
                                                            var23 = ((byte) (1));
                                                            var10000 = 0;
                                                         }

                                                         var24 = var10000;
                                                      }

                                                      var29++;
                                                   }
                                                }
                                             }

                                             var10000 = var24;
                                          }

                                          var51 = var16;
                                       }

                                       label691: {
                                          if (var1 >= 0) {
                                             if (var51 != 0) {
                                                break label691;
                                             }

                                             var51 = 5;
                                          }

                                          if (var10000 <= var51) {
                                             break;
                                          }

                                          var10000 = 0;
                                       }

                                       int var33 = var10000;

                                       while (true) {
                                          if (var33 >= var21.length) {
                                             break label626;
                                          }

                                          label621: {
                                             label620: {
                                                if (var22[var33]) {
                                                   net.C_47rf var34 = null;
                                                   int var35 = 0;
                                                   int var30 = 0;

                                                   while (var30 < 5) {
                                                      net.C_47rf var31 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$495(field_43, -5159435562928669890L, var3))
                                                         .field_429
                                                         .method_46$4c10532da1(var30)
                                                         .method_48$ac4db64966();
                                                      var10000 = var16;
                                                      if (var2 <= 0) {
                                                         break label620;
                                                      }

                                                      if (var16 == 0) {
                                                         if (var31 != null && var31.method_48$dbd570a038().equals(var21[var33])) {
                                                            var34 = var31;
                                                            var35 = var30;
                                                            break;
                                                         }

                                                         var30++;
                                                      }
                                                   }

                                                   var30 = 9;

                                                   while (
                                                      var30
                                                         < ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$502(field_43, -5159435562928669890L, var3))
                                                            .field_429
                                                            .field_46
                                                            .size()
                                                   ) {
                                                      net.C_47rf var37 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$507(field_43, -5159435562928669890L, var3))
                                                         .field_429
                                                         .method_46$4c10532da1(var30)
                                                         .method_48$ac4db64966();
                                                      int var44 = var16;
                                                      if (var2 >= 0) {
                                                         if (var16 == 0) {
                                                            label599:
                                                            if (var34 != null) {
                                                               label597: {
                                                                  label596: {
                                                                     if (var37 != null) {
                                                                        var44 = ((int) (var37.method_48$dbd570a038().equals(var34.method_48$dbd570a038()) ? 1 : 0));
                                                                        var55 = var16;
                                                                        if (var2 >= 0) {
                                                                           if (var16 == 0) {
                                                                              if (var44 == 0) {
                                                                                 break label599;
                                                                              }

                                                                              var44 = var37.field_47;
                                                                           }

                                                                           var55 = var16;
                                                                        }

                                                                        if (var1 < 0) {
                                                                           break label597;
                                                                        }

                                                                        if (var55 != 0) {
                                                                           break label596;
                                                                        }

                                                                        if (var44 >= var34.method_44$8abf5c6871()) {
                                                                           break label599;
                                                                        }
                                                                     }

                                                                     var44 = ((int) (recovery$indy$flow$516(this, var12, var35, -5153979015723245227L, var3) ? 1 : 0));
                                                                  }

                                                                  var55 = var16;
                                                               }

                                                               if (var55 == 0) {
                                                                  if (var44 != 0) {
                                                                     return false;
                                                                  }

                                                                  recovery$indy$flow$517(this, var5, (short)var6, var35, var7, -5160500036372277496L, var3);
                                                                  var23 = ((byte) (1));
                                                                  var44 = 0;
                                                               }

                                                               var24 = var44;
                                                               var10000 = var16;
                                                               if (var1 <= 0) {
                                                                  break label621;
                                                               }

                                                               if (var16 == 0) {
                                                                  break;
                                                               }
                                                            }

                                                            var30++;
                                                         }

                                                         var44 = var16;
                                                      }

                                                      if (var44 != 0) {
                                                         break;
                                                      }
                                                   }
                                                }

                                                var33++;
                                                var10000 = var16;
                                             }

                                             if (var1 <= 0) {
                                                break;
                                             }
                                          }

                                          if (var10000 != 0) {
                                             break label626;
                                          }
                                       }
                                    }
                                 }

                                 var24++;
                              }

                              var10000 = var16;
                              if (var1 < 0) {
                                 continue label649;
                              }
                           }

                           if (var10000 == 0) {
                              continue label652;
                           }
                        }

                        if (var1 <= 0) {
                           return false;
                        }

                        var10000 = var23;
                        break;
                     }

                     var48 = var16;
                  }

                  if (var48 != 0) {
                     return (((var10000) & 1) != 0);
                  }

                  if (var10000 == 0) {
                     return true;
                  }

                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }









   private boolean method_45y$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 51428127474287L;
      boolean var5 = recovery$indy$161(-4702778866974670097L, var1);
      boolean var6 = recovery$indy$163(this.field_46o, recovery$indy$162(this.settingFailRate, -4701920678664639693L, var1), var3, -4710334786849993886L, var1);
      boolean var10000 = var6;
      if (!var5) {
         if (var6) {
            recovery$indy$164(this.settingFailRate, -4702842970240411298L, var1);
         }

         var10000 = var6;
      }

      return var10000;
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      this.field_43a = false;
      recovery$indy$165(this.settingRefillCPS, 2737915605609218589L, var4);
      recovery$indy$166(this.settingMissClickRate, 2737915605609218589L, var4);
      recovery$indy$167(this.settingDoubleClickRate, 2737915605609218589L, var4);
      recovery$indy$168(this.settingFailRate, 2737915605609218589L, var4);
      recovery$indy$169(this.settingStartDelay, 2737915605609218589L, var4);
      recovery$indy$170(this.settingAutoCloseDelay, 2737915605609218589L, var4);
      this.field_43P = true;
   }



    public Refill_47CA(long a0) {
        super((java.lang.String) ("Refill"),(java.lang.String) ("Auff\u00fcllen"),(long) (((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 3328529332221L)),(java.awt.Color) (new java.awt.Color((int) (66),(int) (203),(int) (245))),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.legit.Refill_47CA.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 136287444221659L);
        int constructorPart4 = (int) ((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 72732079728730L) >>> 32));
        int constructorPart5 = (int) (((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 72732079728730L) << 32) >>> 48));
        int constructorPart6 = (int) (((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 72732079728730L) << 48) >>> 48));
        long constructorKey7 = ((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 81705791200768L);
        long constructorKey8 = ((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 133636673456531L);
        long constructorKey9 = ((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 125492374547430L);
        int constructorPart10 = (int) ((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 108126489619776L) >>> 32));
        long constructorKey11 = ((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 108126489619776L) << 32) >>> 32);
        long constructorKey12 = ((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 22861082439001L);
        int constructorPart13 = (int) ((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 111368901708645L) >>> 32));
        int constructorPart14 = (int) (((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 111368901708645L) << 32) >>> 48));
        int constructorPart15 = (int) (((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 111368901708645L) << 48) >>> 48));
        long constructorKey16 = ((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 56054197877259L);
        int constructorPart17 = (int) ((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 4465185789207L) >>> 48));
        int constructorPart18 = (int) (((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 4465185789207L) << 16) >>> 48));
        int constructorPart19 = (int) (((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 4465185789207L) << 32) >>> 32));
        long constructorKey20 = ((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 5072451695212L);
        int constructorPart21 = (int) ((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 110849811671627L) >>> 32));
        int constructorPart22 = (int) (((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 110849811671627L) << 32) >>> 48));
        int constructorPart23 = (int) (((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 110849811671627L) << 48) >>> 48));
        int constructorPart24 = (int) ((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 29911349093975L) >>> 32));
        int constructorPart25 = (int) (((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 29911349093975L) << 32) >>> 48));
        int constructorPart26 = (int) (((((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 29911349093975L) << 48) >>> 48));
        long constructorKey27 = ((augustus.recovered.modules.legit.Refill_47CA.a ^ a0) ^ 76914946953047L);
        client.setting.BooleanSetting initialized28 = new client.setting.BooleanSetting(this, constructorKey9, "AutoOpen", false);
        recovery$indy$flow$542(this, initialized28);
        short converted29 = (short) (constructorPart14);
        short converted30 = (short) (constructorPart15);
        client.setting.RangeSetting initialized31 = new client.setting.RangeSetting(constructorPart13, this, "AutoOpenDelay", Double.longBitsToDouble(4639481672377565184L), Double.longBitsToDouble(4643000109586448384L), converted29, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, converted30);
        long initialValue32 = constructorKey7;
        client.setting.RangeSetting initialValue33 = initialized31;
        java.lang.Object initialValue34 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue33))))));
        java.lang.Object initialValue35 = recovery$indy$flow$546(initialValue34, initialValue32);
        java.lang.Object initialValue36 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingAutoOpen));
        java.lang.Object initialValue37 = recovery$indy$flow$548(initialValue36);
        java.lang.Object initialValue38 = recovery$indy$flow$549(initialValue36);
        long initialValue39 = constructorKey11;
        java.lang.Object initialValue40 = initialValue38;
        int initialValue41 = constructorPart10;
        java.lang.Object initialValue42 = initialValue35;
        java.lang.Object initialValue43 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue42))))));
        java.lang.Object initialValue44 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue45 = recovery$indy$flow$552(initialValue43, initialValue41, initialValue44, initialValue39);
        recovery$indy$flow$553(this, initialValue45);
        client.setting.BooleanSetting initialized46 = new client.setting.BooleanSetting(this, constructorKey9, "AutoClose", true);
        recovery$indy$flow$556(this, initialized46);
        short converted47 = (short) (constructorPart14);
        short converted48 = (short) (constructorPart15);
        client.setting.RangeSetting initialized49 = new client.setting.RangeSetting(constructorPart13, this, "AutoCloseDelay", Double.longBitsToDouble(4639481672377565184L), Double.longBitsToDouble(4643000109586448384L), converted47, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, converted48);
        long initialValue50 = constructorKey7;
        client.setting.RangeSetting initialValue51 = initialized49;
        java.lang.Object initialValue52 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue51))))));
        java.lang.Object initialValue53 = recovery$indy$flow$560(initialValue52, initialValue50);
        java.lang.Object initialValue54 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingAutoClose));
        java.lang.Object initialValue55 = recovery$indy$flow$562(initialValue54);
        java.lang.Object initialValue56 = recovery$indy$flow$563(initialValue54);
        long initialValue57 = constructorKey11;
        java.lang.Object initialValue58 = initialValue56;
        int initialValue59 = constructorPart10;
        java.lang.Object initialValue60 = initialValue53;
        java.lang.Object initialValue61 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue62 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue58))))));
        java.lang.Object initialValue63 = recovery$indy$flow$566(initialValue61, initialValue59, initialValue62, initialValue57);
        recovery$indy$flow$567(this, initialValue63);
        short converted64 = (short) (constructorPart14);
        short converted65 = (short) (constructorPart15);
        client.setting.RangeSetting initialized66 = new client.setting.RangeSetting(constructorPart13, this, "StartDelay", Double.longBitsToDouble(4641240890982006784L), Double.longBitsToDouble(4643281584563159040L), converted64, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0, converted65);
        long initialValue67 = constructorKey7;
        client.setting.RangeSetting initialValue68 = initialized66;
        java.lang.Object initialValue69 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue68))))));
        java.lang.Object initialValue70 = recovery$indy$flow$571(initialValue69, initialValue67);
        recovery$indy$flow$572(this, initialValue70);
        java.lang.Object initialValue71 = recovery$indy$flow$574();
        client.setting.MultiSelectSetting initialized72 = new client.setting.MultiSelectSetting(this, "Types", constructorKey16, (net.C_47OZ[]) (initialValue71));
        recovery$indy$flow$576(this, initialized72);
        client.setting.BooleanSetting initialized73 = new client.setting.BooleanSetting(this, constructorKey9, "BlockInvActions", false);
        recovery$indy$flow$579(this, initialized73);
        client.setting.SettingGroup initialized74 = new client.setting.SettingGroup(this, "CraftGroup", true, constructorKey20);
        long initialValue75 = constructorKey8;
        java.lang.String initialValue76 = "Craft";
        client.setting.SettingGroup initialValue77 = initialized74;
        java.lang.Object initialValue78 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue77))))));
        java.lang.Object initialValue79 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue76))))));
        java.lang.Object initialValue80 = recovery$indy$flow$584(initialValue78, initialValue79, initialValue75);
        java.lang.Object initialValue81 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue80))))));
        java.lang.Object initialValue82 = recovery$indy$flow$586();
        java.lang.Object initialValue83 = recovery$indy$flow$587(initialValue82);
        java.lang.Object initialValue84 = recovery$indy$flow$588(initialValue82);
        char converted85 = (char) (constructorPart22);
        java.lang.Object initialValue86 = initialValue84;
        int initialValue87 = constructorPart23;
        int initialValue88 = (int) (converted85);
        int initialValue89 = constructorPart21;
        java.lang.Object initialValue90 = initialValue81;
        java.lang.Object initialValue91 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue90))))));
        java.lang.Object initialValue92 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue86))))));
        java.lang.Object initialValue93 = recovery$indy$flow$591(initialValue91, initialValue89, (char) (initialValue88), initialValue87, initialValue92);
        recovery$indy$flow$592(this, initialValue93);
        short converted94 = (short) (constructorPart17);
        char converted95 = (char) (constructorPart18);
        java.lang.Object initialValue96 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingCraftGroup));
        client.setting.BooleanSetting initialized97 = new client.setting.BooleanSetting(this, "Craft", converted94, converted95, constructorPart19, true, (client.setting.SettingGroup) (initialValue96));
        recovery$indy$flow$596(this, initialized97);
        java.lang.Object initialValue98 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingCraftGroup));
        client.setting.NumberSetting initialized99 = new client.setting.NumberSetting(this, "ReCraftIfSoupsLowerThan", Double.longBitsToDouble(4616189618054758400L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue98), constructorKey27);
        java.lang.Object initialValue100 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingCraft));
        java.lang.Object initialValue101 = recovery$indy$flow$601(initialValue100);
        java.lang.Object initialValue102 = recovery$indy$flow$602(initialValue100);
        java.lang.Object initialValue103 = initialValue102;
        client.setting.NumberSetting initialValue104 = initialized99;
        java.lang.Object initialValue105 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue104))))));
        java.lang.Object initialValue106 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue103))))));
        java.lang.Object initialValue107 = recovery$indy$flow$605(initialValue105, initialValue106);
        recovery$indy$flow$606(this, initialValue107);
        short converted108 = (short) (constructorPart17);
        char converted109 = (char) (constructorPart18);
        java.lang.Object initialValue110 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingCraftGroup));
        client.setting.BooleanSetting initialized111 = new client.setting.BooleanSetting(this, "CraftInstant", converted108, converted109, constructorPart19, false, (client.setting.SettingGroup) (initialValue110));
        java.lang.Object initialValue112 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingCraft));
        java.lang.Object initialValue113 = recovery$indy$flow$611(initialValue112);
        java.lang.Object initialValue114 = recovery$indy$flow$612(initialValue112);
        java.lang.Object initialValue115 = initialValue114;
        long initialValue116 = constructorKey3;
        client.setting.BooleanSetting initialValue117 = initialized111;
        java.lang.Object initialValue118 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue117))))));
        java.lang.Object initialValue119 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue115))))));
        java.lang.Object initialValue120 = recovery$indy$flow$615(initialValue118, initialValue116, initialValue119);
        java.lang.Object initialValue121 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue120))))));
        recovery$indy$flow$617(this, initialValue121);
        java.lang.Object initialValue122 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingCraftGroup));
        client.setting.NumberSetting initialized123 = new client.setting.NumberSetting(this, "MaxMouseMoveSpeedCraft", Double.longBitsToDouble(4626041242239631360L), 0.0D, Double.longBitsToDouble(4641240890982006784L), 0, (client.setting.SettingGroup) (initialValue122), constructorKey27);
        short converted124 = (short) (constructorPart6);
        int initialValue125 = (int) (converted124);
        int initialValue126 = constructorPart5;
        java.lang.String initialValue127 = "MaxMouseMoveSpeed";
        int initialValue128 = constructorPart4;
        client.setting.NumberSetting initialValue129 = initialized123;
        java.lang.Object initialValue130 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue129))))));
        java.lang.Object initialValue131 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue127))))));
        java.lang.Object initialValue132 = recovery$indy$flow$623(initialValue130, initialValue128, initialValue131, initialValue126, (short) (initialValue125));
        java.lang.Object initialValue133 = recovery$indy$flow$624(this);
        java.lang.Object initialValue134 = initialValue133;
        java.lang.Object initialValue135 = initialValue132;
        java.lang.Object initialValue136 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue135))))));
        java.lang.Object initialValue137 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue134))))));
        java.lang.Object initialValue138 = recovery$indy$flow$627(initialValue136, initialValue137);
        recovery$indy$flow$628(this, initialValue138);
        java.lang.Object initialValue139 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingCraftGroup));
        client.setting.RangeSetting initialized140 = new client.setting.RangeSetting(constructorPart24, this, "CraftCPS", constructorPart25, constructorPart26, Double.longBitsToDouble(4623507967449235456L), Double.longBitsToDouble(4625196817309499392L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue139));
        long initialValue141 = constructorKey7;
        client.setting.RangeSetting initialValue142 = initialized140;
        java.lang.Object initialValue143 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue142))))));
        java.lang.Object initialValue144 = recovery$indy$flow$633(initialValue143, initialValue141);
        java.lang.Object initialValue145 = recovery$indy$flow$634(this);
        long initialValue146 = constructorKey11;
        java.lang.Object initialValue147 = initialValue145;
        int initialValue148 = constructorPart10;
        java.lang.Object initialValue149 = initialValue144;
        java.lang.Object initialValue150 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue149))))));
        java.lang.Object initialValue151 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue147))))));
        java.lang.Object initialValue152 = recovery$indy$flow$637(initialValue150, initialValue148, initialValue151, initialValue146);
        recovery$indy$flow$638(this, initialValue152);
        client.setting.SettingGroup initialized153 = new client.setting.SettingGroup(this, "RefillGroup", true, constructorKey20);
        long initialValue154 = constructorKey8;
        java.lang.String initialValue155 = "Refill";
        client.setting.SettingGroup initialValue156 = initialized153;
        java.lang.Object initialValue157 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue156))))));
        java.lang.Object initialValue158 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue155))))));
        java.lang.Object initialValue159 = recovery$indy$flow$643(initialValue157, initialValue158, initialValue154);
        java.lang.Object initialValue160 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue159))))));
        recovery$indy$flow$645(this, initialValue160);
        short converted161 = (short) (constructorPart17);
        char converted162 = (char) (constructorPart18);
        java.lang.Object initialValue163 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingRefillGroup));
        client.setting.BooleanSetting initialized164 = new client.setting.BooleanSetting(this, "RefillInstant", converted161, converted162, constructorPart19, false, (client.setting.SettingGroup) (initialValue163));
        recovery$indy$flow$649(this, initialized164);
        java.lang.Object initialValue165 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingRefillGroup));
        client.setting.NumberSetting initialized166 = new client.setting.NumberSetting(this, "MaxMouseMoveSpeedRefill", Double.longBitsToDouble(4626041242239631360L), 0.0D, Double.longBitsToDouble(4641240890982006784L), 0, (client.setting.SettingGroup) (initialValue165), constructorKey27);
        short converted167 = (short) (constructorPart6);
        int initialValue168 = (int) (converted167);
        int initialValue169 = constructorPart5;
        java.lang.String initialValue170 = "MaxMouseMoveSpeed";
        int initialValue171 = constructorPart4;
        client.setting.NumberSetting initialValue172 = initialized166;
        java.lang.Object initialValue173 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue172))))));
        java.lang.Object initialValue174 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue170))))));
        java.lang.Object initialValue175 = recovery$indy$flow$655(initialValue173, initialValue171, initialValue174, initialValue169, (short) (initialValue168));
        java.lang.Object initialValue176 = recovery$indy$flow$656(this);
        java.lang.Object initialValue177 = initialValue176;
        java.lang.Object initialValue178 = initialValue175;
        java.lang.Object initialValue179 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue178))))));
        java.lang.Object initialValue180 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue177))))));
        java.lang.Object initialValue181 = recovery$indy$flow$659(initialValue179, initialValue180);
        recovery$indy$flow$660(this, initialValue181);
        java.lang.Object initialValue182 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingRefillGroup));
        client.setting.RangeSetting initialized183 = new client.setting.RangeSetting(constructorPart24, this, "RefillCPS", constructorPart25, constructorPart26, Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4624633867356078080L), 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue182));
        long initialValue184 = constructorKey7;
        client.setting.RangeSetting initialValue185 = initialized183;
        java.lang.Object initialValue186 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue185))))));
        java.lang.Object initialValue187 = recovery$indy$flow$665(initialValue186, initialValue184);
        java.lang.Object initialValue188 = recovery$indy$flow$666(this);
        long initialValue189 = constructorKey11;
        java.lang.Object initialValue190 = initialValue188;
        int initialValue191 = constructorPart10;
        java.lang.Object initialValue192 = initialValue187;
        java.lang.Object initialValue193 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue192))))));
        java.lang.Object initialValue194 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue190))))));
        java.lang.Object initialValue195 = recovery$indy$flow$669(initialValue193, initialValue191, initialValue194, initialValue189);
        recovery$indy$flow$670(this, initialValue195);
        java.lang.Object initialValue196 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingRefillGroup));
        client.setting.RangeSetting initialized197 = new client.setting.RangeSetting(constructorPart24, this, "MissClickRate", constructorPart25, constructorPart26, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4621819117588971520L), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue196));
        long initialValue198 = constructorKey7;
        client.setting.RangeSetting initialValue199 = initialized197;
        java.lang.Object initialValue200 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue199))))));
        java.lang.Object initialValue201 = recovery$indy$flow$675(initialValue200, initialValue198);
        recovery$indy$flow$676(this, initialValue201);
        java.lang.Object initialValue202 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingRefillGroup));
        client.setting.RangeSetting initialized203 = new client.setting.RangeSetting(constructorPart24, this, "FailRate", constructorPart25, constructorPart26, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4621819117588971520L), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue202));
        long initialValue204 = constructorKey7;
        client.setting.RangeSetting initialValue205 = initialized203;
        java.lang.Object initialValue206 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue205))))));
        java.lang.Object initialValue207 = recovery$indy$flow$681(initialValue206, initialValue204);
        recovery$indy$flow$682(this, initialValue207);
        java.lang.Object initialValue208 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingRefillGroup));
        client.setting.RangeSetting initialized209 = new client.setting.RangeSetting(constructorPart24, this, "DoubleClickRate", constructorPart25, constructorPart26, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4621819117588971520L), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue208));
        long initialValue210 = constructorKey7;
        client.setting.RangeSetting initialValue211 = initialized209;
        java.lang.Object initialValue212 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue211))))));
        java.lang.Object initialValue213 = recovery$indy$flow$687(initialValue212, initialValue210);
        recovery$indy$flow$688(this, initialValue213);
        java.lang.Object initialValue214 = recovery$indy$flow$690(3);
        ((java.lang.Object[]) initialValue214)[0] = "Basic";
        ((java.lang.Object[]) initialValue214)[1] = "Nearest";
        ((java.lang.Object[]) initialValue214)[2] = "Random";
        java.lang.Object initialValue215 = ((java.lang.Object)(((augustus.recovered.modules.legit.Refill_47CA) (((java.lang.Object)(this)))).settingRefillGroup));
        client.setting.ModeSetting initialized216 = new client.setting.ModeSetting(this, "Sequence", "Basic", (java.lang.String[]) (initialValue214), (client.setting.SettingGroup) (initialValue215), constructorKey12);
        recovery$indy$flow$693(this, initialized216);
        net.C_47cu initialized217 = new net.C_47cu();
        recovery$indy$flow$696(this, initialized217);
        net.C_474k initialized218 = new net.C_474k(100, 0.0D);
        recovery$indy$flow$699(this, initialized218);
        net.C_474k initialized219 = new net.C_474k(100, 0.0D);
        recovery$indy$flow$702(this, initialized219);
        net.C_474k initialized220 = new net.C_474k(100, 0.0D);
        recovery$indy$flow$705(this, initialized220);
        recovery$indy$flow$706(this, -1);
        net.C_474k initialized221 = new net.C_474k(20, 0.0D);
        recovery$indy$flow$709(this, initialized221);
        recovery$indy$flow$710(this, 0.0D);
        recovery$indy$flow$711(this, 0.0D);
        recovery$indy$flow$712(this, false);
        net.C_47cu initialized222 = new net.C_47cu();
        recovery$indy$flow$715(this, initialized222);
        net.C_47cu initialized223 = new net.C_47cu();
        recovery$indy$flow$718(this, initialized223);
        recovery$indy$flow$719(this, true);
        net.C_47cu initialized224 = new net.C_47cu();
        recovery$indy$flow$722(this, initialized224);
    }









    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static long recovery$indy$flow$121() {
        return augustus.recovered.modules.legit.Refill_47CA.a;
    }
    private static native boolean recovery$indy$flow$122(long a0,long a1);
    private static void recovery$indy$flow$123(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.Refill_47CA) (a0)).field_43a = a1;
        return;
    }
    private static native boolean recovery$indy$flow$124(java.lang.Object a0,long a1,long a2,long a3);

    private static native boolean recovery$indy$flow$126(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$128(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$129(java.lang.Object a0,long a1,long a2,long a3);
    private static int recovery$indy$flow$130(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.Refill_47CA) (a0)).field_43y;
    }
    private static java.lang.Object recovery$indy$flow$131() {
        return augustus.recovered.modules.legit.Refill_47CA.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$132(java.lang.Object a0,long a1,long a2);

    private static int recovery$indy$flow$134(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.Refill_47CA) (a0)).field_43y;
    }
    private static native java.lang.Object recovery$indy$flow$135(java.lang.Object a0,int a1);
    private static int recovery$indy$flow$136(java.lang.Object a0) {
        return ((net.C_47sT) (a0)).field_40;
    }
    private static int recovery$indy$flow$137(java.lang.Object a0) {
        return ((net.C_47sT) (a0)).field_46;
    }
    private static java.lang.Object recovery$indy$flow$138() {
        return augustus.recovered.modules.legit.Refill_47CA.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$139(java.lang.Object a0,long a1,long a2);


    private static int recovery$indy$flow$142(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$143() {
        return augustus.recovered.modules.legit.Refill_47CA.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$144(java.lang.Object a0,long a1,long a2);

    private static native java.lang.Object recovery$indy$flow$146(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$147(java.lang.Object a0);
    private static int recovery$indy$flow$148(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.Refill_47CA) (a0)).field_43y;
    }
    private static java.lang.Object recovery$indy$flow$149() {
        return augustus.recovered.modules.legit.Refill_47CA.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$150(java.lang.Object a0,long a1,long a2);

    private static native java.lang.Object recovery$indy$flow$152(java.lang.Object a0,int a1);
    private static int recovery$indy$flow$153(java.lang.Object a0) {
        return ((net.C_47sT) (a0)).field_40;
    }
    private static int recovery$indy$flow$154(java.lang.Object a0) {
        return ((net.C_47sT) (a0)).field_46;
    }
    private static double recovery$indy$flow$155(double a0) {
        return java.lang.Math.sqrt(a0);
    }
    private static native void recovery$indy$flow$156(java.lang.Object a0,int a1,short a2,int a3,int a4,long a5,long a6);
    private static void recovery$indy$flow$157(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.Refill_47CA) (a0)).field_43y = a1;
        return;
    }
    private static native boolean recovery$indy$flow$158(java.lang.Object a0,short a1,int a2,char a3,long a4,long a5);
    private static native void recovery$indy$flow$159(java.lang.Object a0,int a1,short a2,int a3,int a4,long a5,long a6);
    private static void recovery$indy$flow$160(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.Refill_47CA) (a0)).field_43y = a1;
        return;
    }
    private static native boolean recovery$indy$flow$433(long a0,long a1);
    private static native boolean recovery$indy$flow$435(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$437(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$440(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$442(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$444(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$452(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$457(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$459(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$461(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$468(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$470(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$476(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$478(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$480(java.lang.Object a0,java.lang.Object a1,int a2,int a3,long a4,long a5,long a6);
    private static native boolean recovery$indy$flow$481(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native void recovery$indy$flow$482(java.lang.Object a0,int a1,short a2,int a3,int a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$484(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$489(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$491(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$493(java.lang.Object a0,java.lang.Object a1,int a2,int a3,long a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$495(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$502(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$507(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$516(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native void recovery$indy$flow$517(java.lang.Object a0,int a1,short a2,int a3,int a4,long a5,long a6);
    private static native void recovery$indy$flow$542(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$546(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$548(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$549(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$552(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$553(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$556(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$560(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$562(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$563(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$566(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$567(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$571(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$572(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$574();
    private static native void recovery$indy$flow$576(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$579(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$584(java.lang.Object a0,java.lang.Object a1,long a2);

    private static java.lang.Object recovery$indy$flow$586() {
        return net.C_41E.SOUPS;
    }
    private static java.lang.Object recovery$indy$flow$587(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$588(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$591(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$592(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$596(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$601(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$602(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$605(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$606(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$611(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$612(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$615(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$617(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$623(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$624(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$627(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$628(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$633(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$634(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$637(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$638(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$643(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$645(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$649(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$655(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$656(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$659(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$660(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$665(java.lang.Object a0,long a1);
    private static native java.lang.Object recovery$indy$flow$666(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$669(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$670(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$675(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$676(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$681(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$682(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$687(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$688(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$690(int a0);

    private static native void recovery$indy$flow$693(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$696(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$699(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$702(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$705(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$706(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.Refill_47CA) (a0)).field_43y = a1;
        return;
    }
    private static native void recovery$indy$flow$709(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$710(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.legit.Refill_47CA) (a0)).field_430 = a1;
        return;
    }
    private static void recovery$indy$flow$711(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.legit.Refill_47CA) (a0)).field_43F = a1;
        return;
    }
    private static void recovery$indy$flow$712(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.Refill_47CA) (a0)).field_43a = a1;
        return;
    }
    private static native void recovery$indy$flow$715(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$718(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$719(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.legit.Refill_47CA) (a0)).field_43P = a1;
        return;
    }
    private static native void recovery$indy$flow$722(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int recovery$indy$1(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$2(long var0, long var2);
   private static native double[] recovery$indy$3(long var0, long var2);
   private static native double[] recovery$indy$4(long var0, long var2);
   private static native C_40g recovery$indy$5(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native void recovery$indy$7(Object var0, long var1, Object var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$8(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);
   private static native void recovery$indy$11(Object var0, long var1, Object var3, int var4, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$13(Object var0, long var1, long var3);
   private static native boolean recovery$indy$14(long var0, long var2);
   private static native boolean recovery$indy$15(long var0, long var2, long var4);
   private static native void recovery$indy$16(Object var0, long var1, long var3);
   private static native void recovery$indy$17(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$18(Object var0, long var1, long var3);
   private static native double recovery$indy$19(Object var0, long var1, long var3);
   private static native int recovery$indy$20(Object var0, long var1, long var3);
   private static native boolean recovery$indy$21(Object var0, long var1, long var3, long var5, long var7);
   private static native void recovery$indy$22(Object var0, long var1, long var3);
   private static native boolean recovery$indy$23(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$24(Object var0, long var1, long var3);
   private static native void recovery$indy$25(Object var0, long var1, long var3);
   private static native int recovery$indy$26(Object var0, Object var1, long var2, long var4);
   private static native void recovery$indy$27(Object var0, long var1, long var3);
   private static native void recovery$indy$28(int var0, long var1, long var3);
   private static native void recovery$indy$29(Object var0, long var1, long var3);
   private static native boolean recovery$indy$30(long var0, long var2);
   private static native boolean recovery$indy$31(Object var0, long var1, long var3);
   private static native int recovery$indy$32(Object var0, long var1, long var3);
   private static native int recovery$indy$33(Object var0, int var1, long var2, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$34(Object var0, long var1, long var3);
   private static native int recovery$indy$35(Object var0, double var1, int var3, Object var4, int var5, short var6, int var7, int var8, long var9, long var11);
   private static native double recovery$indy$36(Object var0, long var1, long var3);
   private static native boolean recovery$indy$49(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$50(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$51(Object var0, long var1, long var3);
   private static native boolean recovery$indy$52(Object var0, long var1, long var3);
   private static native boolean recovery$indy$53(Object var0, long var1, long var3, long var5, long var7);
   private static native GuiScreen recovery$indy$54(Object var0, long var1, long var3);
   private static native boolean recovery$indy$55(long var0, long var2);
   private static native boolean recovery$indy$56(Object var0, long var1, long var3);
   private static native int recovery$indy$57(Object var0, long var1, long var3);
   private static native int recovery$indy$58(Object var0, int var1, long var2, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$59(Object var0, long var1, long var3);
   private static native int recovery$indy$60(Object var0, double var1, int var3, Object var4, int var5, short var6, int var7, int var8, long var9, long var11);
   private static native double recovery$indy$61(Object var0, long var1, long var3);
   private static native boolean recovery$indy$62(long var0, long var2);
   private static native boolean recovery$indy$63(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$64(Object var0, long var1, long var3);
   private static native C_40g recovery$indy$65(Object var0, long var1, long var3);
   private static native void recovery$indy$66(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$67(Object var0, long var1, long var3);
   private static native List recovery$indy$68(Object var0, int var1, int var2, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$69(Object var0, long var1, long var3);
   private static native List recovery$indy$70(Object var0, int var1, int var2, long var3, long var5);
   private static native boolean recovery$indy$71(Object var0, long var1, long var3);
   private static native List recovery$indy$72(Object var0, int var1, int var2, long var3, long var5);
   private static native boolean recovery$indy$73(Object var0, long var1, long var3);
   private static native List recovery$indy$74(Object var0, int var1, int var2, long var3, long var5);
   private static native boolean recovery$indy$75(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$76(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$77(Object var0, long var1, long var3);
   private static native int recovery$indy$78(int var0, Object var1, short var2, int var3, int var4, short var5, Object var6, long var7, long var9);
   private static native boolean recovery$indy$79(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$80(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$81(Object var0, long var1, long var3);
   private static native int recovery$indy$82(int var0, Object var1, short var2, int var3, int var4, short var5, Object var6, long var7, long var9);
   private static native boolean recovery$indy$83(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$84(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$85(Object var0, long var1, long var3);
   private static native int recovery$indy$86(int var0, Object var1, short var2, int var3, int var4, short var5, Object var6, long var7, long var9);
   private static native boolean recovery$indy$87(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$88(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$89(Object var0, long var1, long var3);
   private static native int recovery$indy$90(Object var0, long var1, long var3);
   private static native boolean recovery$indy$91(Object var0, long var1, long var3, long var5, long var7);
   private static native void recovery$indy$92(int var0, int var1, char var2, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$93(Object var0, long var1, long var3);
   private static native void recovery$indy$94(Object var0, Object var1, long var2, long var4);
   private static native void recovery$indy$95(Object var0, long var1, long var3);
   private static native double recovery$indy$96(Object var0, long var1, long var3);
   private static native void recovery$indy$97(Object var0, long var1, long var3);
   private static native boolean recovery$indy$98(long var0, long var2);
   private static native int recovery$indy$99(Object var0, long var1, long var3);
   private static native boolean recovery$indy$100(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$101(Object var0, long var1, long var3);
   private static native boolean recovery$indy$102(long var0, long var2);
   private static native int recovery$indy$103(Object var0, long var1, long var3);
   private static native boolean recovery$indy$104(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$105(Object var0, long var1, long var3);
   private static native boolean recovery$indy$106(long var0, long var2);
   private static native double recovery$indy$107(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$108(Object var0, int var1, int var2, long var3, long var5);
   private static native double recovery$indy$109(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$110(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$111(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$112(Object var0, long var1, long var3);
   private static native boolean recovery$indy$113(Object var0, long var1, int var3, long var4, long var6);
   private static native void recovery$indy$114(Object var0, long var1, short var3, int var4, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$115(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$116(Object var0, long var1, long var3);
   private static native C_41E[] recovery$indy$117(long var0, long var2);
   private static native List recovery$indy$118(Object var0, int var1, int var2, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$119(Object var0, long var1, long var3);
   private static native String recovery$indy$120(Object var0, long var1, long var3, long var5);
   private static native ArrayList recovery$indy$121(Object var0, Object var1, long var2, Object var4, long var5, long var7);
   private static native boolean recovery$indy$122(Object var0, long var1, int var3, long var4, long var6);
   private static native void recovery$indy$123(Object var0, long var1, short var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$124(Object var0, long var1, long var3);
   private static native boolean recovery$indy$125(Object var0, long var1, long var3);
   private static native void recovery$indy$126(Object var0, long var1, long var3);
   private static native double recovery$indy$127(Object var0, long var1, long var3);
   private static native int recovery$indy$128(Object var0, long var1, long var3);
   private static native boolean recovery$indy$129(Object var0, long var1, long var3, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$130(Object var0, long var1, long var3);
   private static native void recovery$indy$131(Object var0, long var1, long var3);
   private static native void recovery$indy$132(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$133(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$134(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$161(long var0, long var2);
   private static native int recovery$indy$162(Object var0, long var1, long var3);
   private static native boolean recovery$indy$163(Object var0, int var1, long var2, long var4, long var6);
   private static native double recovery$indy$164(Object var0, long var1, long var3);
   private static native double recovery$indy$165(Object var0, long var1, long var3);
   private static native double recovery$indy$166(Object var0, long var1, long var3);
   private static native double recovery$indy$167(Object var0, long var1, long var3);
   private static native double recovery$indy$168(Object var0, long var1, long var3);
   private static native double recovery$indy$169(Object var0, long var1, long var3);
   private static native double recovery$indy$170(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$180();
}
