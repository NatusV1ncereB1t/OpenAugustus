package augustus.recovered.modules.world;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_43F;
import net.C_43r;
import net.C_45n;
import net.C_474i;
import net.C_474k;
import net.C_475c;
import net.C_476q;
import net.C_478Q;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Ij;
import net.C_47MO;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import net.C_47TT;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.C_47gP;
import net.C_47i;
import net.minecraft.client.Minecraft;
import net.C_47rf;
import client.module.Category;
import net.C_47tf;
import net.C_484;
import net.C_48T;
import net.C_4f;

public class FastPlace_47Hz extends Module implements C_47UH, C_48T {
   private final MultiSelectSetting settingItems;
   private final BooleanSetting settingOnlyOnClick;
   private BooleanSetting settingAlwaysPlaceWhenPossible;
   private BooleanSetting settingOneClick;
   private BooleanSetting settingClickPause;
   private BooleanSetting settingAutoSwap;
   private BooleanSetting settingOnlyInAir;
   private BooleanSetting settingOnlyIfMotionIsPositive;
   private boolean field_43v;
   private boolean field_43a;
   private boolean field_43P;
   private int field_43y;
   private int field_438;
   private int field_42;
   private static final long a = C_4f.a(2309144102082767971L, 4264525907079033880L, MethodHandles.lookup().lookupClass()).a(170762969869259L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[64];
   private static final String[] f = new String[64];

   private static native String b(byte[] var0);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Class b(long var0, long var2);

   private static native String b(int var0, long var1);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field b(Class var0, String var1, Class var2);

   private static boolean method_46$41610e4694(C_47gP var0) {
      return var0.field_43;
   }

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native void a();

   private static native int a(long var0, long var2);

   private void method_42$1e657bb4f9(C_47gP var1, short var2, int var3, short var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      recovery$indy$1(var1.field_48, 1497234629009448494L, var5);
      recovery$indy$2(var1.field_44, 1497234629009448494L, var5);
   }

   private static native Method d(long var0, long var2);

   @Override
   public void method_41$fae8de1664(C_475c var1) {
      int var141, var142, var143, var145, var148, var151, var156;
      FastPlace_47Hz var153, var158;
      boolean var186;
      long var2 = a ^ 25560389880200L;
      long var4 = var2 ^ 111190892942085L;
      long var6 = var2 ^ 63874656424615L;
      long var10001 = var2 ^ 9699358842179L;
      int var8 = (int)((var2 ^ 9699358842179L) >>> 48);
      int var9 = (int)((var2 ^ 9699358842179L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var2 ^ 61317133670596L;
      long var13 = var2 ^ 87829908712158L;
      long var10000 = -6878225004688361214L;
      Setting[] var15 = SmartRaytrace_47TG.method_48$19d51fe81e();
      FastPlace_47Hz var138 = this;
      boolean var159 = false;
      if (var15 == null) {
         label559: {
            this.field_43v = false;
            var10001 = -6878839645358966673L;
            Minecraft var29 = field_43;
            label558:
            if (var29.method_44$aae029aa0a()) {
               Minecraft var139 = field_43;
               if (var15 == null) {
                  var10001 = -6877314591322484634L;
                  Minecraft var30 = field_43;
                  if (!var30.field_44r.field_45w.method_42$aae029aa0a()) {
                     var138 = this;
                     if (var15 != null) {
                        break label559;
                     }

                     var10001 = -6877810419072977304L;
                     BooleanSetting var31 = this.settingOnlyOnClick;
                     if (var31.method_49$aae029aa0a()) {
                        break label558;
                     }
                  }

                  var139 = field_43;
               }

               var10001 = -6878540677168437714L;
               Minecraft var32 = var139;
               if (var32.field_42P.method_48$ac4db64966() != null) {
                  var10000 = -6877238438968619826L;

                  for (C_47gP var19 : C_47gP.values()) {
                     if (var15 != null) {
                        return;
                     }

                     var10001 = -6877745436851513446L;
                     C_47gP var33 = var19;
                     label342:
                     if (var33.method_43$aae029aa0a()) {
                        var10001 = -6878540677168437714L;
                        Minecraft var34 = field_43;
                        C_43r var20 = var34.field_42P.method_48$ac4db64966().method_48$dbd570a038();
                        var141 = (int) ((var20.getClass().equals(var19.field_40)) ? 1 : 0);
                        label543:
                        if (var15 == null) {
                           if (var141 == 0) {
                              var141 = (int) ((var19.field_40.equals(C_43F.class)) ? 1 : 0);
                              if (var15 == null) {
                                 if (var141 == 0) {
                                    break label342;
                                 }

                                 var141 = (int) ((var20 instanceof C_43F) ? 1 : 0);
                              }

                              if (var15 != null) {
                                 break label543;
                              }

                              if (var141 == 0) {
                                 break label342;
                              }
                           }

                           var141 = (int) ((var20 instanceof C_43F) ? 1 : 0);
                        }

                        if (var15 == null) {
                           if (var141 != 0) {
                              var10001 = -6877810419072977304L;
                              BooleanSetting var35 = this.settingOnlyInAir;
                              var142 = (int) ((var35.method_49$aae029aa0a()) ? 1 : 0);
                              label531:
                              if (var15 == null) {
                                 if (var142 != 0) {
                                    var10001 = -6878540677168437714L;
                                    Minecraft var36 = field_43;
                                    var142 = (int) ((var36.field_42P.field_48M) ? 1 : 0);
                                    if (var15 != null) {
                                       break label531;
                                    }

                                    if (var36.field_42P.field_48M) {
                                       break label342;
                                    }
                                 }

                                 var10001 = -6877810419072977304L;
                                 BooleanSetting var37 = this.settingOnlyInAir;
                                 var142 = (int) ((var37.method_49$aae029aa0a()) ? 1 : 0);
                              }

                              label524:
                              if (var15 == null) {
                                 if (var142 != 0) {
                                    var10001 = -6877810419072977304L;
                                    BooleanSetting var38 = this.settingOnlyIfMotionIsPositive;
                                    var142 = (int) ((var38.method_49$aae029aa0a()) ? 1 : 0);
                                    if (var15 != null) {
                                       break label524;
                                    }

                                    if (var142 != 0) {
                                       var10001 = -6878540677168437714L;
                                       Minecraft var39 = field_43;
                                       double var226;
                                       var142 = (var226 = var39.field_42P.field_42 - 0.0) == 0.0 ? 0 : (var226 < 0.0 ? -1 : 1);
                                       if (var15 != null) {
                                          break label524;
                                       }

                                       if (var142 <= 0) {
                                          break label342;
                                       }
                                    }
                                 }

                                 var10001 = -6878684725697394664L;
                                 Minecraft var40 = field_43;
                                 long var10002 = -6878540677168437714L;
                                 Minecraft var41 = field_43;
                                 long var10003 = -6878540677168437714L;
                                 Minecraft var42 = field_43;
                                 double var190 = var42.field_42P.field_48j - 0.5;
                                 long var10004 = -6878540677168437714L;
                                 Minecraft var43 = field_43;
                                 var142 = (int) ((var40.field_44Q .method_45$4093413a27(var41.field_42P.field_48Q, var190, var43.field_42P.field_42o) .method_48$e084f7739d() .method_43$aae029aa0a()) ? 1 : 0);



                              }

                              int var21;
                              var21 = var142;
                              var143 = var21;
                              label514:
                              if (var15 == null) {
                                 if (var21 != 0) {
                                    var143 = (int) ((this.field_43P) ? 1 : 0);
                                    if (var15 != null) {
                                       break label514;
                                    }

                                    if (!this.field_43P) {
                                       long var10005 = -6879171598885315298L;
                                       long var44 = var6;
                                       byte var46 = 1;
                                       byte var47 = 0;
                                       C_47MO var48 = C_476q.field_48;
                                       this.field_438 = var48.method_44$75dd719903(var47, var46, var44);
                                       var10005 = -6879171598885315298L;
                                       long var49 = var6;
                                       byte var51 = 1;
                                       byte var52 = 0;
                                       C_47MO var53 = C_476q.field_48;
                                       this.field_42 = var53.method_44$75dd719903(var52, var51, var49);
                                    }
                                 }

                                 var143 = var21;
                              }

                              label507:
                              if (var15 == null) {
                                 if (var143 == 0) {
                                    var143 = (int) ((this.field_43P) ? 1 : 0);
                                    if (var15 != null) {
                                       break label507;
                                    }

                                    if (this.field_43P) {
                                       this.field_43y = this.field_42;
                                    }
                                 }

                                 var143 = this.field_438;
                              }

                              label500: {
                                 label568: {
                                    label498:
                                    if (var15 == null) {
                                       if (var143 < 0) {
                                          var143 = (int) ((this.field_43P) ? 1 : 0);
                                          if (var15 != null) {
                                             break label498;
                                          }

                                          if (this.field_43P) {
                                             break label568;
                                          }
                                       }

                                       var143 = var21;
                                    }

                                    if (var15 != null) {
                                       break label500;
                                    }

                                    if (var143 == 0) {
                                       var143 = 1;
                                       break label500;
                                    }
                                 }

                                 var143 = 0;
                              }

                              int var22;
                              var22 = var143;
                              this.field_43P = var21 != 0;
                              int var144 = this.field_438 - 1;
                              long var191 = -6878540677168437714L;
                              Minecraft var54 = field_43;
                              long var212 = -6879106274415941717L;
                              EntityPlayerSP var55 = var54.field_42P;
                              long var56 = var11;
                              int var58 = var144;
                              double[] var23 = C_47TT.method_45$f42b969df3(var58, var56, var55);
                              var145 = var21;
                              label485:
                              if (var15 == null) {
                                 if (var21 != 0) {
                                    var10001 = -6878684725697394664L;
                                    Minecraft var59 = field_43;
                                    double var173 = var23[0];
                                    var212 = -6878540677168437714L;
                                    Minecraft var60 = field_43;
                                    var145 = (int) ((var59.field_44Q .method_45$4093413a27(var173, var60.field_42P.field_48j - 1.0, var23[2]) .method_48$e084f7739d() .method_43$aae029aa0a()) ? 1 : 0);



                                    if (var15 != null) {
                                       break label485;
                                    }

                                    if (var145 == 0) {
                                       var22 = 1;
                                    }
                                 }

                                 var145 = var21;
                              }

                              label569: {
                                 if (var15 == null) {
                                    if (var145 == 0) {
                                       break label569;
                                    }

                                    var145 = this.field_43y;
                                 }

                                 if (var15 == null) {
                                    if (var145 <= 0) {
                                       break label569;
                                    }

                                    var145 = 1;
                                 }

                                 var22 = var145;
                                 this.field_43y--;
                              }

                              label467: {
                                 var10001 = -6878803412191948607L;
                                 Minecraft var61 = field_43;
                                 C_47Ij var146 = var61.field_42Y;
                                 if (var15 == null) {
                                    if (var61.field_42Y == null) {
                                       break label467;
                                    }

                                    var10001 = -6878803412191948607L;
                                    Minecraft var62 = field_43;
                                    var146 = var62.field_42Y;
                                 }

                                 if (var146.field_49 == C_47Az.BLOCK) {
                                    label570: {
                                       boolean var24;
                                       label571: {
                                          label572: {
                                             var24 = false;
                                             int var147 = var22;
                                             if (var15 == null) {
                                                if (var22 == 0) {
                                                   var10001 = -6877810419072977304L;
                                                   BooleanSetting var63 = this.settingClickPause;
                                                   var148 = (int) ((var63.method_49$aae029aa0a()) ? 1 : 0);
                                                   if (var15 != null) {
                                                      break label571;
                                                   }

                                                   if (var148 != 0) {
                                                      break label572;
                                                   }
                                                }

                                                var10001 = -6878540677168437714L;
                                                Minecraft var64 = field_43;
                                                C_47rf var149 = var64.field_42P.method_48$ac4db64966();
                                                var191 = -6878803412191948607L;
                                                Minecraft var65 = field_43;
                                                C_478Q var178 = var65.field_42Y.method_49$5730377d31();
                                                var212 = -6878803412191948607L;
                                                Minecraft var66 = field_43;
                                                long var219 = -6878803412191948607L;
                                                Minecraft var67 = field_43;
                                                long var223 = -6879001536233400561L;
                                                C_47tf var68 = var67.field_42Y.field_45;
                                                long var69 = var4;
                                                C_484 var71 = var66.field_42Y.field_40;
                                                C_478Q var72 = var178;
                                                C_47rf var73 = var149;
                                                var147 = (int) ((C_47TT.method_48$35b2139a90(var73, var72, var71, var69, var68)) ? 1 : 0);
                                             }

                                             int var25;
                                             int var26;
                                             label450: {
                                                label573: {
                                                   var25 = var147;
                                                   C_474k var150 = var19.field_42;
                                                   var191 = -6877610394729985955L;
                                                   RangeSetting var74 = var19.field_48;
                                                   int var179 = var74.method_44$8abf5c6871();
                                                   var212 = -6878574968939842989L;
                                                   long var75 = var13;
                                                   int var77 = var179;
                                                   C_474k var78 = var150;
                                                   var26 = var78.method_44$7ee0e11626(var77, var75);
                                                   var151 = var26;
                                                   if (var15 == null) {
                                                      if (var26 > 0) {
                                                         var10001 = -6877810419072977304L;
                                                         BooleanSetting var79 = this.settingOneClick;
                                                         var151 = (int) ((var79.method_49$aae029aa0a()) ? 1 : 0);
                                                         if (var15 != null) {
                                                            break label450;
                                                         }

                                                         if (var151 == 0) {
                                                            break label573;
                                                         }
                                                      }

                                                      var151 = var25;
                                                   }

                                                   label574: {
                                                      if (var15 == null) {
                                                         if (var151 == 0) {
                                                            break label574;
                                                         }

                                                         var10001 = -6877810419072977304L;
                                                         BooleanSetting var80 = this.settingOneClick;
                                                         var151 = (int) ((var80.method_49$aae029aa0a()) ? 1 : 0);
                                                      }

                                                      if (var15 != null) {
                                                         break label450;
                                                      }

                                                      if (var151 != 0) {
                                                         break label573;
                                                      }

                                                      var10001 = -6877810419072977304L;
                                                      BooleanSetting var81 = this.settingAlwaysPlaceWhenPossible;
                                                      var151 = (int) ((var81.method_49$aae029aa0a()) ? 1 : 0);
                                                      if (var15 != null) {
                                                         break label450;
                                                      }

                                                      if (var151 != 0) {
                                                         break label573;
                                                      }
                                                   }

                                                   var151 = 0;
                                                   break label450;
                                                }

                                                var151 = 1;
                                             }

                                             int var27 = var151;

                                             label425: {
                                                do {
                                                   label576: {
                                                      label421: {
                                                         if (var26 > 0) {
                                                            var10001 = -6877810419072977304L;
                                                            BooleanSetting var82 = this.settingOneClick;
                                                            var148 = (int) ((var82.method_49$aae029aa0a()) ? 1 : 0);
                                                            if (var15 != null) {
                                                               break label421;
                                                            }

                                                            if (var148 == 0) {
                                                               break label576;
                                                            }
                                                         }

                                                         var148 = var25;
                                                      }

                                                      if (var15 != null) {
                                                         break label425;
                                                      }

                                                      if (var148 == 0) {
                                                         break;
                                                      }

                                                      var10001 = -6877810419072977304L;
                                                      BooleanSetting var83 = this.settingOneClick;
                                                      var148 = (int) ((var83.method_49$aae029aa0a()) ? 1 : 0);
                                                      if (var15 == null) {
                                                         if (var148 != 0) {
                                                            break label576;
                                                         }

                                                         var10001 = -6877810419072977304L;
                                                         BooleanSetting var84 = this.settingAlwaysPlaceWhenPossible;
                                                         var148 = (int) ((var84.method_49$aae029aa0a()) ? 1 : 0);
                                                      }

                                                      if (var15 != null) {
                                                         break label425;
                                                      }

                                                      if (var148 == 0) {
                                                         break;
                                                      }
                                                   }

                                                   var191 = -6877379475666054558L;
                                                   byte var85 = 1;
                                                   C_475c var86 = var1;
                                                   var86.method_48$d00df7729d(var85);
                                                   var191 = -6877810419072977304L;
                                                   BooleanSetting var87 = this.settingOneClick;
                                                   var186 = var87.method_49$aae029aa0a();
                                                   label407:
                                                   if (var15 == null) {
                                                      if (!var186) {
                                                         var191 = -6877810419072977304L;
                                                         BooleanSetting var88 = this.settingAlwaysPlaceWhenPossible;
                                                         var186 = var88.method_49$aae029aa0a();
                                                         if (var15 != null) {
                                                            break label407;
                                                         }

                                                         if (!var186) {
                                                            var186 = false;
                                                            break label407;
                                                         }
                                                      }

                                                      var186 = true;
                                                   }

                                                   var191 = -6878959740516637840L;
                                                   boolean var89 = var186;
                                                   C_475c var90 = var1;
                                                   var90.method_48$f633c984d8(var89);
                                                   var25 = 0;
                                                   var24 = true;
                                                } while (--var26 >= -30);

                                                var148 = var27;
                                             }

                                             if (var15 != null) {
                                                break label571;
                                             }

                                             label390:
                                             if (var148 != 0) {
                                                C_474k var152 = var19.field_49;
                                                var191 = -6877610394729985955L;
                                                RangeSetting var91 = var19.field_44;
                                                int var187 = var91.method_44$8abf5c6871();
                                                var212 = -6878574968939842989L;
                                                long var92 = var13;
                                                int var94 = var187;
                                                C_474k var95 = var152;
                                                int var28 = var95.method_44$7ee0e11626(var94, var92);

                                                while (var28 > 0) {
                                                   var191 = -6877379475666054558L;
                                                   byte var96 = 1;
                                                   C_475c var97 = var1;
                                                   var97.method_48$d00df7729d(var96);
                                                   var28--;
                                                   var24 = true;
                                                   if (var15 != null) {
                                                      break label390;
                                                   }

                                                   if (var15 != null) {
                                                      break;
                                                   }
                                                }

                                                short var200 = (short)var8;
                                                short var220 = (short)var10;
                                                long var224 = -6877144914134740377L;
                                                short var98 = var220;
                                                int var99 = var9;
                                                short var100 = var200;
                                                C_47gP var101 = var19;
                                                FastPlace_47Hz var102 = this;
                                                var102.method_42$1e657bb4f9(var101, var100, var99, var98);
                                             }
                                          }

                                          var153 = this;
                                          if (var15 != null) {
                                             break label570;
                                          }

                                          var148 = (int) ((this.field_43a) ? 1 : 0);
                                       }

                                       if (var148 != 0 && !var24) {
                                          var191 = -6877379475666054558L;
                                          byte var103 = 1;
                                          C_475c var104 = var1;
                                          var104.method_48$d00df7729d(var103);
                                       }

                                       var191 = -6877456647433882185L;
                                       boolean var105 = true;
                                       C_475c var106 = var1;
                                       var106.method_40$f633c984d8(var105);
                                       var191 = -6877649455448055355L;
                                       boolean var107 = false;
                                       C_475c var108 = var1;
                                       var108.method_45$f633c984d8(var107);
                                       this.field_43v = true;
                                       var153 = this;
                                    }

                                    var153.field_43a = false;
                                 }
                              }

                              if (var15 == null) {
                                 break;
                              }
                           }

                           C_474k var154 = var19.field_42;
                           long var204 = -6877610394729985955L;
                           RangeSetting var109 = var19.field_48;
                           int var188 = var109.method_44$8abf5c6871();
                           long var217 = -6878574968939842989L;
                           long var110 = var13;
                           int var112 = var188;
                           C_474k var113 = var154;
                           var141 = var113.method_44$7ee0e11626(var112, var110);
                        }

                        int var134 = var141;
                        int var155 = var134;
                        if (var15 == null) {
                           var155 = var134 > 0 ? 1 : 0;
                        }

                        int var135 = var155;
                        boolean var136 = false;

                        label579: {
                           label580: {
                              label367:
                              while (true) {
                                 if (var134 > 0) {
                                    long var205 = -6877379475666054558L;
                                    byte var114 = 1;
                                    C_475c var115 = var1;
                                    var115.method_48$d00df7729d(var114);
                                    var134--;
                                    var136 = true;
                                    if (var15 != null) {
                                       break;
                                    }

                                    if (var15 == null) {
                                       continue;
                                    }
                                 }

                                 var156 = var135;
                                 if (var15 != null) {
                                    break label580;
                                 }

                                 if (var135 != 0) {
                                    C_474k var157 = var19.field_49;
                                    long var206 = -6877610394729985955L;
                                    RangeSetting var116 = var19.field_44;
                                    int var189 = var116.method_44$8abf5c6871();
                                    long var218 = -6878574968939842989L;
                                    long var117 = var13;
                                    int var119 = var189;
                                    C_474k var120 = var157;
                                    int var137 = var120.method_44$7ee0e11626(var119, var117);

                                    while (var137 > 0) {
                                       var206 = -6877379475666054558L;
                                       byte var121 = 1;
                                       C_475c var122 = var1;
                                       var122.method_48$d00df7729d(var121);
                                       var136 = true;
                                       var137--;
                                       if (var15 != null) {
                                          break label367;
                                       }

                                       if (var15 != null) {
                                          break;
                                       }
                                    }

                                    short var208 = (short)var8;
                                    short var221 = (short)var10;
                                    long var225 = -6877144914134740377L;
                                    short var123 = var221;
                                    int var124 = var9;
                                    short var125 = var208;
                                    C_47gP var126 = var19;
                                    FastPlace_47Hz var127 = this;
                                    var127.method_42$1e657bb4f9(var126, var125, var124, var123);
                                 }
                                 break;
                              }

                              var158 = this;
                              if (var15 != null) {
                                 break label579;
                              }

                              var156 = (int) ((this.field_43a) ? 1 : 0);
                           }

                           if (var156 != 0 && !var136) {
                              long var209 = -6877379475666054558L;
                              byte var128 = 1;
                              C_475c var129 = var1;
                              var129.method_48$d00df7729d(var128);
                           }

                           long var210 = -6877456647433882185L;
                           boolean var130 = true;
                           C_475c var131 = var1;
                           var131.method_40$f633c984d8(var130);
                           var210 = -6877649455448055355L;
                           boolean var132 = false;
                           C_475c var133 = var1;
                           var133.method_45$f633c984d8(var132);
                           var158 = this;
                        }

                        var158.field_43a = false;
                        if (var15 == null) {
                           break;
                        }
                     }

                     if (var15 != null) {
                        break;
                     }
                  }

                  if (var15 == null) {
                     return;
                  }
               }
            }

            var138 = this;
         }

         var159 = true;
      }

      var138.field_43a = var159;
   }

   @Override
   public void method_40G$e45a9973e5(long var1) {
      Setting[] var23;
      long var3 = var1 ^ 2418827207390L;
      long var5 = var1 ^ 119376855428400L;
      long var10000 = -3626288319563541467L;
      Setting[] var7 = SmartRaytrace_47TG.method_48$19d51fe81e();
      long var10001 = -3626966781513442481L;
      BooleanSetting var10 = this.settingAutoSwap;
      byte var22 = (byte) ((var10.method_49$aae029aa0a()) ? 1 : 0);
      if (var7 == null) {
         if (var22 == 0) {
            return;
         }

         var10001 = -3627049409130939715L;
         C_47gP var11 = C_47gP.BLOCKS;
         var22 = (byte) ((var11.method_43$aae029aa0a()) ? 1 : 0);
      }

      Setting[] var25 = var7;
      if (var1 > 0L) {
         if (var7 == null) {
            if (var22 == 0) {
               return;
            }

            var22 = (byte) ((this.field_43v) ? 1 : 0);
         }

         var25 = var7;
      }

      if (var25 == null) {
         if (var22 == 0) {
            return;
         }

         var22 = 0;
      }

      int var8 = var22;

      while (var8 < 9) {
         label57: {
            label82: {
               var10001 = -3625973284952110327L;
               Minecraft var12 = field_43;
               C_47rf var9 = var12.field_42P.field_429.method_46$4c10532da1(var8 + 36).method_48$ac4db64966();
               var23 = var7;
               if (var1 >= 0L) {
                  if (var7 == null) {
                     long var10002 = -3626342822427960329L;
                     C_47rf var13 = var9;
                     long var14 = var3;
                     if (!C_474i.method_49$c8e73c711c(var14, var13)) {
                        break label82;
                     }

                     long var10005 = -3626418411429905945L;
                     boolean var16 = false;
                     int var17 = var8;
                     byte var18 = -2;
                     long var19 = var5;
                     FastPlace_47Hz var21 = this;
                     C_47i.method_46$1d13c11fdd(var21, var19, var18, var17, var16);
                  }

                  var23 = var7;
               }

               if (var1 < 0L) {
                  break label57;
               }

               if (var23 == null) {
                  break;
               }
            }

            var8++;
            var23 = var7;
         }

         if (var23 != null) {
            break;
         }
      }
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$3(this, 7, var3, -7100292246300997403L, var1);
      recovery$indy$4(this, 34, var3, -7100292246300997403L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43a = true;
   }

   public FastPlace_47Hz(long var1) {
      super("FastPlace", "SchnellPlatzierung", ((a ^ var1) ^ 21440737279024L), new Color(54, 144, 217), Category.WORLD);
      var1 = a ^ var1;
      long var3 = var1 ^ 37923869487558L;
      long var10001 = var1 ^ 22580079206106L;
      int var5 = (int)((var1 ^ 22580079206106L) >>> 48);
      int var6 = (int)((var1 ^ 22580079206106L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      long var8 = var1 ^ 78367066498055L;
      long var10 = var1 ^ 118150540211478L;
      long var12 = var1 ^ 127061956626345L;
      var10001 = var1 ^ 127920499351942L;
      int var14 = (int)((var1 ^ 127920499351942L) >>> 32);
      int var15 = (int)((var1 ^ 127920499351942L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var1 ^ 99821094475213L;
      long var19 = var1 ^ 12837075367200L;
      long var21 = var1 ^ 108458865172523L;
      var10001 = var1 ^ 12862137298330L;
      int var23 = (int)((var1 ^ 12862137298330L) >>> 32);
      int var24 = (int)((var1 ^ 12862137298330L) << 32 >>> 48);
      int var25 = (int)(var10001 << 48 >>> 48);
      long var26 = var1 ^ 21440737279024L;
      // Pure super-constructor arguments are evaluated in the first statement above.
      long var10005 = 8467169220908800448L;
      this.settingItems = new MultiSelectSetting(this, "Items", var3, C_47gP.values());
      long var10000 = 8468433424219761676L;
      Setting[] var71 = SmartRaytrace_47TG.method_48$19d51fe81e();
      this.settingOnlyOnClick = new BooleanSetting(this, var21, "OnlyOnClick", true);
      this.field_43v = false;
      this.field_43a = false;
      this.field_43y = 0;
      long var10006 = 8468469862132533264L;
      long var34 = var12;
      byte var36 = 2;
      byte var37 = 0;
      C_47MO var38 = C_476q.field_48;
      this.field_438 = var38.method_44$75dd719903(var37, var36, var34);
      Setting[] var28 = var71;
      var10005 = 8468469862132533264L;
      long var39 = var12;
      byte var41 = 2;
      byte var42 = 0;
      C_47MO var43 = C_476q.field_48;
      this.field_42 = var43.method_44$75dd719903(var42, var41, var39);
      var10000 = 8467169220908800448L;
      C_47gP[] var29 = C_47gP.values();
      int var30 = var29.length;
      int var31 = 0;

      while (var31 < var30) {
         C_47gP var32 = var29[var31];
         long var10004 = 8466876586453836900L;
         C_47gP var44 = var32;
         SettingGroup var73 = new SettingGroup(this, var44.method_44$0e30dfc966(), var19);
         C_45n var10002 = recovery$indy$5(var32);
         char var87 = (char)var15;
         var10005 = 8468914453731716967L;
         C_45n var45 = var10002;
         int var46 = var16;
         char var47 = var87;
         int var48 = var14;
         SettingGroup var49 = var73;
         SettingGroup var33 = var49.method_48$033d42cbfb(var48, var47, var46, var45);
         RangeSetting var77 = new RangeSetting(var23, this, var32.field_47 + "CPS", var24, var25, 10.0, 20.0, 0.0, 60.0, 0, var33);
         long var10003 = 8468217582008438722L;
         long var50 = var17;
         RangeSetting var52 = var77;
         RangeSetting var78 = var52.method_41$1efb8cc0e2(var50);
         var10004 = 8467318446914325873L;
         String var53 = "CPS";
         long var54 = var8;
         RangeSetting var56 = var78;
         var32.field_48 = var56.method_42$eb2c3ee2a9(var54, var53);
         var10001 = 8468570661668454255L;
         RangeSetting var57 = var32.field_48;
         var57.method_43$fedcb3e4d3();
         RangeSetting var80 = new RangeSetting(var23, this, var32.field_47 + "DCPS", var24, var25, 2.0, 4.0, 0.0, 20.0, 0, var33);
         var10003 = 8468217582008438722L;
         long var58 = var17;
         RangeSetting var60 = var80;
         RangeSetting var81 = var60.method_41$1efb8cc0e2(var58);
         var10004 = 8467318446914325873L;
         String var61 = "DCPS";
         long var62 = var8;
         RangeSetting var64 = var81;
         var32.field_44 = var64.method_42$eb2c3ee2a9(var62, var61);
         var10001 = 8468570661668454255L;
         RangeSetting var65 = var32.field_44;
         var65.method_43$fedcb3e4d3();
         Setting[] var74 = var28;
         if (var1 >= 0L) {
            if (var28 == null) {
               if (var32.field_40.equals(C_43F.class)) {
                  this.settingAlwaysPlaceWhenPossible = new BooleanSetting(this, "AlwaysPlaceWhenPossible", (short)var5, (char)var6, var7, false, var33);
                  this.settingOneClick = new BooleanSetting(this, "OneClick", (short)var5, (char)var6, var7, false, var33);
                  this.settingClickPause = new BooleanSetting(this, "ClickPause", (short)var5, (char)var6, var7, false, var33);
                  this.settingAutoSwap = new BooleanSetting(this, "AutoSwap", (short)var5, (char)var6, var7, false, var33);
                  this.settingOnlyInAir = new BooleanSetting(this, "OnlyInAir", (short)var5, (char)var6, var7, false, var33);
                  BooleanSetting var83 = new BooleanSetting(this, "OnlyIfMotionIsPositive", (short)var5, (char)var6, var7, false, var33);
                  BooleanSetting var84 = this.settingOnlyInAir;
                  this.settingOnlyInAir.getClass();
                  C_45n var86 = recovery$indy$6(var84);
                  var10004 = 8468061162072685109L;
                  C_45n var66 = var86;
                  long var67 = var10;
                  BooleanSetting var69 = var83;
                  this.settingOnlyIfMotionIsPositive = (BooleanSetting)var69.method_43$780fd62a21(var67, var66);
               }

               var31++;
            }

            var74 = var28;
         }

         if (var74 != null) {
            break;
         }
      }
   }

   // Original obfuscator <clinit> is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native double recovery$indy$1(Object var0, long var1, long var3);

   private static native double recovery$indy$2(Object var0, long var1, long var3);

   private static native void recovery$indy$3(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$4(Object var0, int var1, long var2, long var4, long var6);

   private static native C_45n recovery$indy$5(C_47gP var0);

   private static native C_45n recovery$indy$6(BooleanSetting var0);

   private static native MethodHandle recovery$constant$7();
}
