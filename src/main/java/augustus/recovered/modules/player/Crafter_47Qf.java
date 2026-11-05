package augustus.recovered.modules.player;
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
import client.Client;
import net.C_40g;
import net.C_42a;
import net.C_43S;
import net.C_43r;
import net.C_45V;
import net.C_476q;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47DW;
import net.C_47KW;
import net.minecraft.client.gui.GuiScreen;
import net.C_47MO;
import client.module.Module;
import net.C_47Rb;
import client.setting.NumberSetting;
import net.C_47TU;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.event.RenderListener;
import net.C_47cu;
import net.minecraft.client.Minecraft;
import net.C_47ps;
import net.C_47qP;
import net.C_47rf;
import net.C_47ru;
import net.C_47sT;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Crafter_47Qf extends client.module.Module implements net.C_47xz,client.event.RenderListener {
    public final client.setting.NumberSetting settingStartDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47TU settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSmartDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingEventToClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingClickMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47Rb field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47Rb field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private int method_46$26a4eb4072(C_47ps c_47ps, C_43r c_43r, int n, long l) {
        l = a ^ l;
        int n2 = ((int) (Crafter_47Qf.recovery$indy$1(6181402281944676962L, l) ? 1 : 0));
        for (int i = 10; i < c_47ps.field_46M.field_46.size(); ++i) {
            int n3;
            block11: {
                block9: {
                    int n4;
                    block10: {
                        int n5;
                        C_47rf c_47rf;
                        C_47rf c_47rf2;
                        block7: {
                            block8: {
                                block6: {
                                    c_47rf2 = ((C_47sT)c_47ps.field_46M.field_46.get(i)).method_48$ac4db64966();
                                    if (c_43r != null) break block6;
                                    c_47rf = c_47rf2;
                                    n5 = n2;
                                    if (l < 0L) break block7;
                                    if (n5 == 0) break block8;
                                    if (c_47rf == null) break block9;
                                }
                                c_47rf = c_47rf2;
                            }
                            n5 = n2;
                        }
                        if (n5 != 0) {
                            if (c_47rf == null) continue;
                            c_47rf = c_47rf2;
                        }
                        n3 = ((int) (c_47rf.method_48$dbd570a038().equals(c_43r) ? 1 : 0));
                        n4 = n2;
                        if (l > 0L) {
                            if (n4 != 0) {
                                if (n3 == 0) continue;
                                n3 = c_47rf2.field_47;
                            }
                            n4 = n2;
                        }
                        if (l < 0L) break block10;
                        if (n4 == 0) break block11;
                        n4 = n;
                    }
                    if (n3 < n4) continue;
                }
                n3 = i;
            }
            return n3;
        }
        return -1;
    }



    private java.util.HashMap method_46$8d4b104553(long callerKey) {
        long key = recovery$indy$flow$13() ^ callerKey;
        long toolScoreKey = key ^ 18699813204897L;
        long armorScoreKey = key ^ 117584344562988L;
        java.util.HashMap bestScores = new java.util.HashMap();
        Object[] categories = (Object[]) recovery$indy$flow$16(-5154476056524013655L, key);
        boolean stopAfterFirst = recovery$indy$flow$17(-5155145650254670469L, key);
        for (Object category : categories) {
            double bestScore = -1.0D;
            for (int slotIndex = 0; slotIndex < recovery$indy$flow$22(((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(recovery$indy$flow$19(recovery$indy$flow$18(), -5155302564234615572L, key))))).field_429)))))).field_46))); slotIndex++) {
                Object stack = recovery$indy$flow$27(recovery$indy$flow$26(((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(recovery$indy$flow$24(recovery$indy$flow$23(), -5155302564234615572L, key))))).field_429)), slotIndex));
                if (stopAfterFirst) break;
                if (stack == null) continue;
                Object item = recovery$indy$flow$28(stack);
                if (key <= 0L) continue;
                int categoryKind = ((int[]) recovery$indy$flow$29())[recovery$indy$flow$30(category)];
                switch (categoryKind) {
                    case 1:
                        if (!recovery$indy$flow$31(item)) break;
                        if (bestScore == -1.0D) {
                            bestScore = recovery$indy$flow$32(this, stack, toolScoreKey, -5154639831896611694L, key);
                        } else {
                            double score = recovery$indy$flow$33(this, stack, toolScoreKey, -5154639831896611694L, key);
                            if (score > bestScore) bestScore = score;
                        }
                        break;
                    case 4:
                        if (!recovery$indy$flow$34(item)) break;
                        if (recovery$indy$flow$36(((java.lang.Object)(((net.C_43S) (((java.lang.Object)(item))))))) != 0) break;
                        if (bestScore == -1.0D) {
                            bestScore = recovery$indy$flow$37(this, armorScoreKey, stack, -5155733125240378906L, key);
                        } else {
                            double score = recovery$indy$flow$38(this, armorScoreKey, stack, -5155733125240378906L, key);
                            if (score > bestScore) bestScore = score;
                        }
                        break;
                    case 5:
                        if (!recovery$indy$flow$39(item)) break;
                        if (recovery$indy$flow$41(((java.lang.Object)(((net.C_43S) (((java.lang.Object)(item))))))) != 3) break;
                        if (bestScore == -1.0D) {
                            bestScore = recovery$indy$flow$42(this, armorScoreKey, stack, -5155733125240378906L, key);
                        } else {
                            double score = recovery$indy$flow$43(this, armorScoreKey, stack, -5155733125240378906L, key);
                            if (score > bestScore) bestScore = score;
                        }
                        break;
                    case 3:
                        if (!recovery$indy$flow$44(item)) break;
                        if (recovery$indy$flow$46(((java.lang.Object)(((net.C_43S) (((java.lang.Object)(item))))))) != 2) break;
                        if (bestScore == -1.0D) {
                            bestScore = recovery$indy$flow$47(this, armorScoreKey, stack, -5155733125240378906L, key);
                        } else {
                            double score = recovery$indy$flow$48(this, armorScoreKey, stack, -5155733125240378906L, key);
                            if (score > bestScore) bestScore = score;
                        }
                        break;
                    case 2:
                        if (!recovery$indy$flow$49(item)) break;
                        if (recovery$indy$flow$51(((java.lang.Object)(((net.C_43S) (((java.lang.Object)(item))))))) != 1) break;
                        if (bestScore == -1.0D) {
                            bestScore = recovery$indy$flow$52(this, armorScoreKey, stack, -5155733125240378906L, key);
                        } else {
                            double score = recovery$indy$flow$53(this, armorScoreKey, stack, -5155733125240378906L, key);
                            if (score > bestScore) bestScore = score;
                        }
                        break;
                    default:
                        break;
                }
            }
            if (key >= 0L) bestScores.put(category, Double.valueOf(bestScore));
            if (stopAfterFirst) break;
        }
        return bestScores;
    }







   private void method_46$da9b1a9d9d(char var1, short var2, int var3) {
      java.lang.Object var106;
        augustus.recovered.modules.player.Crafter_47Qf var101;
        augustus.recovered.modules.player.Crafter_47Qf var103;
        augustus.recovered.modules.player.Crafter_47Qf var105;
        int var107;
        augustus.recovered.modules.player.Crafter_47Qf var108;
        augustus.recovered.modules.player.Crafter_47Qf var110;
        int var114;
        int var116;
        int var118;
        int var120;
        int var122;
        int var123;
        int var124;
        augustus.recovered.modules.player.Crafter_47Qf var78;
        net.C_47cu var80;
        augustus.recovered.modules.player.Crafter_47Qf var81;
        augustus.recovered.modules.player.Crafter_47Qf var85;
        augustus.recovered.modules.player.Crafter_47Qf var87;
        augustus.recovered.modules.player.Crafter_47Qf var89;
        augustus.recovered.modules.player.Crafter_47Qf var91;
        augustus.recovered.modules.player.Crafter_47Qf var93;
        augustus.recovered.modules.player.Crafter_47Qf var95;
        augustus.recovered.modules.player.Crafter_47Qf var97;
        augustus.recovered.modules.player.Crafter_47Qf var99;
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 13554510757075L;
      long var8 = var4 ^ 118068661946435L;
      long var10 = var4 ^ 52643518157140L;
      long var12 = var4 ^ 73514636827219L;
      long var14 = var4 ^ 33600284640644L;
      long var16 = var4 ^ 14570583133407L;
      long var18 = var4 ^ 36580615363064L;
      long var20 = var4 ^ 20580027062224L;
      long var22 = var4 ^ 70516328066624L;
      long var10001 = var4 ^ 70604369619805L;
      int var24 = (int)((var4 ^ 70604369619805L) >>> 48);
      int var25 = (int)((var4 ^ 70604369619805L) << 16 >>> 48);
      int var26 = (int)(var10001 << 32 >>> 32);
      long var27 = var4 ^ 35753761902088L;
      long var29 = var4 ^ 46969140050937L;
      byte var31 = ((byte) (recovery$indy$flow$57(-8506950665969228545L, var4) ? 1 : 0));
      net.minecraft.client.gui.GuiScreen var10000 = (net.minecraft.client.gui.GuiScreen)recovery$indy$flow$59(field_43, -8506546477109466144L, var4);
      if (var31 == 0) {
         net.C_47cu var83;
         long var125;
         if (!(var10000 instanceof C_47ps)) {
            this.field_43a = false;
            this.field_45 = net.C_47Rb.SWORD;
            var83 = this.field_48;
            var10001 = -8507200473289563055L;
            var125 = var4;
         } else {
            label2102: {
               C_47ps var47 = (C_47ps)((net.minecraft.client.gui.GuiScreen)recovery$indy$flow$62(field_43, -8506546477109466144L, var4));
               if (!recovery$indy$flow$67(
                     this.field_48, recovery$indy$flow$66(this.settingStartDelay, var14, -8505479843571939990L, var4), var20, -8505732657969277751L, var4
                  )
                  || !recovery$indy$flow$70(this.field_49, this.field_438, var27, -8505885342150125416L, var4)) {
                  return;
               }

               java.util.HashMap var48 = (java.util.HashMap)recovery$indy$flow$71(this, var16, -8506473787692058071L, var4);
               net.C_47Rb[] var49 = (net.C_47Rb[])recovery$indy$flow$72(-8506283202004185555L, var4);
               int var50 = var49.length;
               int var51 = 0;

               while (true) {
                  if (var51 < var50) {
                     net.C_47Rb var52 = var49[var51];
                     net.C_42a var53 = (net.C_42a)recovery$indy$flow$73(this, var47, var18, -8505389852110150042L, var4);
                     java.util.HashMap var61 = (java.util.HashMap)recovery$indy$flow$74(var53, -8505447071865088180L, var4);
                     java.util.HashMap var62 = (java.util.HashMap)recovery$indy$flow$76(var53, -8505968417808155624L, var4);
                     double var41 = (Double)var48.get(var52);
                     var81 = this;
                     if (var2 <= 0) {
                        break;
                     }

                     net.C_42a var70 = (net.C_42a)recovery$indy$flow$81(this, var52, var61, var12, var62, -8506069080003252242L, var4);
                     double var44 = (Double)recovery$indy$flow$82(var70, -8505447071865088180L, var4);
                     net.C_47qP var46 = (net.C_47qP)recovery$indy$flow$85(var70, -8505968417808155624L, var4);
                     byte var82 = var31;
                     if (var3 < 0) {
                        if (var31 == 0) {
                           label1967:
                           while (true) {
                              switch (net.C_44a.field_49[var52.ordinal()]) {
                                 case 1:
                                    label1948:
                                    if (this.field_45 == var52) {
                                       label1946: {
                                          label1945: {
                                             label2040: {
                                                double var130;
                                                int var104 = (var130 = var44 - var41) == 0.0 ? 0 : (var130 < 0.0 ? -1 : 1);
                                                byte var121 = var31;
                                                if (var1 >= 0) {
                                                   if (var31 == 0) {
                                                      label1939: {
                                                         if (var104 <= 0) {
                                                            var105 = this;
                                                            var122 = var31;
                                                            if (var1 < 0) {
                                                               break label1946;
                                                            }

                                                            if (var31 != 0) {
                                                               break label1945;
                                                            }

                                                            var106 = this.field_44;
                                                            if (var2 <= 0) {
                                                               break label1939;
                                                            }

                                                            if (this.field_44 != net.C_47Rb.SWORD) {
                                                               this.field_44 = null;
                                                               this.field_45 = net.C_47Rb.CHEST_PLATE;
                                                               break label2040;
                                                            }
                                                         }

                                                         this.field_44 = net.C_47Rb.SWORD;
                                                         var106 = var61.get(net.C_47qP.STICKS);
                                                      }

                                                      var104 = (Integer)var106;
                                                   }

                                                   var121 = var31;
                                                }

                                                label1928: {
                                                   label1927: {
                                                      label2043: {
                                                         label1925: {
                                                            label1924: {
                                                               label1923: {
                                                                  if (var1 >= 0) {
                                                                     if (var121 == 0) {
                                                                        if (var104 == 0) {
                                                                           var107 = this.field_43y;
                                                                           var123 = var31;
                                                                           if (var1 < 0) {
                                                                              break label1925;
                                                                           }

                                                                           if (var31 != 0) {
                                                                              break label1924;
                                                                           }

                                                                           if (this.field_43y <= 3) {
                                                                              break label1923;
                                                                           }
                                                                        }

                                                                        var104 = this.field_43y;
                                                                     }

                                                                     var121 = ((byte) (3));
                                                                  }

                                                                  if (var104 != var121) {
                                                                     break label2043;
                                                                  }
                                                               }

                                                               var107 = ((recovery$indy$flow$101(
                                                                  this,
                                                                  var47,
                                                                  net.C_47qP.PLANKS,
                                                                  2,
                                                                  -1,
                                                                  (short)var24,
                                                                  (char)var25,
                                                                  var26,
                                                                  -8505909397908300665L,
                                                                  var4
                                                               )) ? 1 : 0);
                                                            }

                                                            var123 = var31;
                                                         }

                                                         if (var3 < 0) {
                                                            if (var123 == 0) {
                                                               if (var107 != 0) {
                                                                  return;
                                                               }

                                                               var107 = ((recovery$indy$flow$102(this, var47, var8, 1, 0, -8507279138696987886L, var4)) ? 1 : 0);
                                                            }

                                                            var123 = var31;
                                                         }

                                                         if (var1 >= 0) {
                                                            if (var123 == 0) {
                                                               if (var107 != 0) {
                                                                  return;
                                                               }

                                                               var107 = ((recovery$indy$flow$103(this, var47, var8, 4, 1, -8507279138696987886L, var4)) ? 1 : 0);
                                                            }

                                                            var123 = var31;
                                                         }

                                                         if (var1 >= 0) {
                                                            if (var123 == 0) {
                                                               if (var107 != 0) {
                                                                  return;
                                                               }

                                                               var107 = ((recovery$indy$flow$104(this, var29, var47, 0, 2, -8506230399539920850L, var4)) ? 1 : 0);
                                                            }

                                                            var123 = var31;
                                                         }

                                                         if (var1 >= 0) {
                                                            if (var123 == 0) {
                                                               if (var107 != 0) {
                                                                  return;
                                                               }

                                                               var107 = ((recovery$indy$flow$105(
                                                                  this, var47, null, 2, 3, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                               )) ? 1 : 0);
                                                            }

                                                            var123 = var31;
                                                         }

                                                         if (var2 < 0) {
                                                            break label1928;
                                                         }

                                                         if (var123 != 0) {
                                                            break label1927;
                                                         }

                                                         if (var107 != 0) {
                                                            return;
                                                         }
                                                      }

                                                      var107 = this.field_43y;
                                                   }

                                                   var123 = var31;
                                                }

                                                if (var3 <= 0) {
                                                   if (var123 == 0) {
                                                      if (var107 == -1) {
                                                         this.field_43y = 4;
                                                      }

                                                      var107 = ((recovery$indy$flow$109(
                                                         this, var47, net.C_47qP.STICKS, 1, 4, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                      )) ? 1 : 0);
                                                   }

                                                   var123 = var31;
                                                }

                                                if (var2 > 0) {
                                                   if (var123 == 0) {
                                                      if (var107 != 0) {
                                                         return;
                                                      }

                                                      var107 = ((recovery$indy$flow$110(this, var47, var8, 8, 5, -8507279138696987886L, var4)) ? 1 : 0);
                                                   }

                                                   var123 = var31;
                                                }

                                                if (var2 > 0) {
                                                   if (var123 == 0) {
                                                      if (var107 != 0) {
                                                         return;
                                                      }

                                                      var107 = ((recovery$indy$flow$111(
                                                         this, var47, null, 0, 6, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                      )) ? 1 : 0);
                                                   }

                                                   var123 = var31;
                                                }

                                                if (var2 > 0) {
                                                   if (var123 == 0) {
                                                      if (var107 != 0) {
                                                         return;
                                                      }

                                                      var107 = ((recovery$indy$flow$113(
                                                         this, var47, var46, var52.field_41, 7, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                      )) ? 1 : 0);
                                                   }

                                                   var123 = var31;
                                                }

                                                if (var1 >= 0) {
                                                   if (var123 == 0) {
                                                      if (var107 != 0) {
                                                         return;
                                                      }

                                                      var107 = ((recovery$indy$flow$114(this, var47, var8, 5, 8, -8507279138696987886L, var4)) ? 1 : 0);
                                                   }

                                                   var123 = var31;
                                                }

                                                if (var2 >= 0) {
                                                   if (var123 == 0) {
                                                      if (var107 != 0) {
                                                         return;
                                                      }

                                                      var107 = ((recovery$indy$flow$115(this, var47, var8, 2, 9, -8507279138696987886L, var4)) ? 1 : 0);
                                                   }

                                                   var123 = var31;
                                                }

                                                if (var1 >= 0) {
                                                   if (var123 == 0) {
                                                      if (var107 != 0) {
                                                         return;
                                                      }

                                                      var107 = ((recovery$indy$flow$116(this, var29, var47, 0, 10, -8506230399539920850L, var4)) ? 1 : 0);
                                                   }

                                                   var123 = var31;
                                                }

                                                label1884: {
                                                   label2045: {
                                                      if (var2 >= 0) {
                                                         if (var123 == 0) {
                                                            if (var107 != 0) {
                                                               return;
                                                            }

                                                            var108 = this;
                                                            var124 = var31;
                                                            if (var2 <= 0) {
                                                               break label1884;
                                                            }

                                                            if (var31 != 0) {
                                                               break label2045;
                                                            }

                                                            var107 = this.field_43y;
                                                         }

                                                         var123 = 11;
                                                      }

                                                      if (var107 != var123) {
                                                         break label1948;
                                                      }

                                                      this.field_44 = null;
                                                      this.field_45 = net.C_47Rb.CHEST_PLATE;
                                                      var108 = this;
                                                   }

                                                   var124 = -1;
                                                }

                                                var108.field_43y = var124;
                                                if (var2 > 0) {
                                                   break label1948;
                                                }
                                             }

                                             var105 = this;
                                          }

                                          var122 = -1;
                                       }

                                       var105.field_43y = var122;
                                    }

                                    var51++;

                                    label1861:
                                    while (true) {
                                       byte var109 = var31;

                                       while (true) {
                                          if (var109 != 0 || var51 >= var50) {
                                             if (var2 < 0) {
                                                recovery$indy$flow$322(this.field_49, -8507200473289563055L, var4);
                                                this.field_43y = -1;
                                                this.field_44 = null;
                                                return;
                                             }

                                             recovery$indy$flow$310(this.field_49, -8507200473289563055L, var4);
                                             var110 = this;
                                             break;
                                          }

                                          var52 = var49[var51];
                                          var53 = (net.C_42a)recovery$indy$flow$73(this, var47, var18, -8505389852110150042L, var4);
                                          var61 = (java.util.HashMap)recovery$indy$flow$74(var53, -8505447071865088180L, var4);
                                          var62 = (java.util.HashMap)recovery$indy$flow$76(var53, -8505968417808155624L, var4);
                                          var41 = (Double)var48.get(var52);
                                          var110 = this;
                                          if (var2 <= 0) {
                                             break;
                                          }

                                          var70 = (net.C_42a)recovery$indy$flow$81(this, var52, var61, var12, var62, -8506069080003252242L, var4);
                                          var44 = (Double)recovery$indy$flow$82(var70, -8505447071865088180L, var4);
                                          var46 = (net.C_47qP)recovery$indy$flow$85(var70, -8505968417808155624L, var4);
                                          var109 = var31;
                                          if (var3 < 0) {
                                             if (var31 == 0) {
                                                continue label1967;
                                             }
                                             continue label1861;
                                          }
                                       }

                                       var110.field_438 = recovery$indy$flow$316(
                                          net.C_476q.field_48,
                                          var22,
                                          recovery$indy$flow$313(this.settingDelay, var10, -8506616489121819479L, var4),
                                          recovery$indy$flow$315(this.settingDelay, var6, -8505098018418656196L, var4),
                                          -8507054174493142685L,
                                          var4
                                       );
                                       return;
                                    }
                                 case 2:
                                    label1846:
                                    if (this.field_45 == var52) {
                                       label2034: {
                                          double var129;
                                          int var100 = (var129 = var44 - var41) == 0.0 ? 0 : (var129 < 0.0 ? -1 : 1);
                                          byte var119 = var31;
                                          if (var1 >= 0) {
                                             if (var31 == 0) {
                                                if (var100 <= 0 && this.field_44 != net.C_47Rb.CHEST_PLATE) {
                                                   this.field_44 = null;
                                                   this.field_43y = -1;
                                                   break label2034;
                                                }

                                                this.field_44 = net.C_47Rb.CHEST_PLATE;
                                                var100 = this.field_43y;
                                             }

                                             var119 = var31;
                                          }

                                          label1835: {
                                             label2035: {
                                                if (var1 >= 0) {
                                                   if (var119 != 0) {
                                                      break label2035;
                                                   }

                                                   var119 = ((byte) (-1));
                                                }

                                                label1828: {
                                                   if (var100 == var119) {
                                                      if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$133(field_43, -8507109990431419032L, var4))
                                                            .field_42X
                                                            .method_41$ac4db64966()
                                                         == null) {
                                                         var101 = this;
                                                         if (var3 >= 0) {
                                                            break label1828;
                                                         }

                                                         this.field_43y = 0;
                                                      } else if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$138(field_43, -8507109990431419032L, var4))
                                                         .field_42X
                                                         .method_41$ac4db64966()
                                                         .method_48$dbd570a038()
                                                         .equals(var46.field_41)) {
                                                         var100 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$145(field_43, -8507109990431419032L, var4))
                                                            .field_42X
                                                            .method_41$ac4db64966()
                                                            .field_47;
                                                         var120 = var31;
                                                         if (var3 >= 0) {
                                                            break label1835;
                                                         }

                                                         if (var31 != 0) {
                                                            break label2035;
                                                         }

                                                         if (var100 >= var52.field_41) {
                                                            this.field_43y = 1;
                                                         }
                                                      }
                                                   }

                                                   var101 = this;
                                                }

                                                var100 = ((int) (recovery$indy$flow$151(
                                                   var101, var47, null, 0, -1, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                ) ? 1 : 0));
                                             }

                                             var120 = var31;
                                          }

                                          if (var1 >= 0) {
                                             if (var120 == 0) {
                                                if (var100 != 0) {
                                                   return;
                                                }

                                                var100 = ((int) (recovery$indy$flow$153(
                                                   this, var47, var46, var52.field_41, 0, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                ) ? 1 : 0));
                                             }

                                             var120 = var31;
                                          }

                                          if (var3 < 0) {
                                             if (var120 == 0) {
                                                if (var100 != 0) {
                                                   return;
                                                }

                                                var100 = ((int) (recovery$indy$flow$154(this, var47, var8, 1, 1, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var120 = var31;
                                          }

                                          if (var3 <= 0) {
                                             if (var120 == 0) {
                                                if (var100 != 0) {
                                                   return;
                                                }

                                                var100 = ((int) (recovery$indy$flow$155(this, var47, var8, 4, 2, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var120 = var31;
                                          }

                                          if (var1 >= 0) {
                                             if (var120 == 0) {
                                                if (var100 != 0) {
                                                   return;
                                                }

                                                var100 = ((int) (recovery$indy$flow$156(this, var47, var8, 5, 3, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var120 = var31;
                                          }

                                          if (var2 > 0) {
                                             if (var120 == 0) {
                                                if (var100 != 0) {
                                                   return;
                                                }

                                                var100 = ((int) (recovery$indy$flow$157(this, var47, var8, 7, 4, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var120 = var31;
                                          }

                                          if (var3 <= 0) {
                                             if (var120 == 0) {
                                                if (var100 != 0) {
                                                   return;
                                                }

                                                var100 = ((int) (recovery$indy$flow$158(this, var47, var8, 8, 5, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var120 = var31;
                                          }

                                          if (var1 >= 0) {
                                             if (var120 == 0) {
                                                if (var100 != 0) {
                                                   return;
                                                }

                                                var100 = ((int) (recovery$indy$flow$159(this, var47, var8, 9, 6, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var120 = var31;
                                          }

                                          if (var2 > 0) {
                                             if (var120 == 0) {
                                                if (var100 != 0) {
                                                   return;
                                                }

                                                var100 = ((int) (recovery$indy$flow$160(this, var47, var8, 6, 7, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var120 = var31;
                                          }

                                          if (var1 >= 0) {
                                             if (var120 == 0) {
                                                if (var100 != 0) {
                                                   return;
                                                }

                                                var100 = ((int) (recovery$indy$flow$161(this, var47, var8, 3, 8, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var120 = var31;
                                          }

                                          if (var3 < 0) {
                                             if (var120 == 0) {
                                                if (var100 != 0) {
                                                   return;
                                                }

                                                var100 = ((int) (recovery$indy$flow$162(this, var29, var47, 0, 9, -8506230399539920850L, var4) ? 1 : 0));
                                             }

                                             var120 = var31;
                                          }

                                          if (var2 > 0) {
                                             if (var120 == 0) {
                                                if (var100 != 0) {
                                                   return;
                                                }

                                                var100 = this.field_43y;
                                             }

                                             var120 = 10;
                                          }

                                          if (var100 != var120) {
                                             break label1846;
                                          }

                                          this.field_44 = null;
                                          this.field_43y = -1;
                                          this.field_45 = net.C_47Rb.TROUSERS;
                                          if (var3 <= 0) {
                                             break label1846;
                                          }
                                       }

                                       this.field_45 = net.C_47Rb.TROUSERS;
                                    }

                                    var51++;

                                    label1793:
                                    while (true) {
                                       byte var102 = var31;

                                       while (true) {
                                          if (var102 != 0 || var51 >= var50) {
                                             if (var2 < 0) {
                                                recovery$indy$flow$322(this.field_49, -8507200473289563055L, var4);
                                                this.field_43y = -1;
                                                this.field_44 = null;
                                                return;
                                             }

                                             recovery$indy$flow$310(this.field_49, -8507200473289563055L, var4);
                                             var103 = this;
                                             break;
                                          }

                                          var52 = var49[var51];
                                          var53 = (net.C_42a)recovery$indy$flow$73(this, var47, var18, -8505389852110150042L, var4);
                                          var61 = (java.util.HashMap)recovery$indy$flow$74(var53, -8505447071865088180L, var4);
                                          var62 = (java.util.HashMap)recovery$indy$flow$76(var53, -8505968417808155624L, var4);
                                          var41 = (Double)var48.get(var52);
                                          var103 = this;
                                          if (var2 <= 0) {
                                             break;
                                          }

                                          var70 = (net.C_42a)recovery$indy$flow$81(this, var52, var61, var12, var62, -8506069080003252242L, var4);
                                          var44 = (Double)recovery$indy$flow$82(var70, -8505447071865088180L, var4);
                                          var46 = (net.C_47qP)recovery$indy$flow$85(var70, -8505968417808155624L, var4);
                                          var102 = var31;
                                          if (var3 < 0) {
                                             if (var31 == 0) {
                                                continue label1967;
                                             }
                                             continue label1793;
                                          }
                                       }

                                       var103.field_438 = recovery$indy$flow$316(
                                          net.C_476q.field_48,
                                          var22,
                                          recovery$indy$flow$313(this.settingDelay, var10, -8506616489121819479L, var4),
                                          recovery$indy$flow$315(this.settingDelay, var6, -8505098018418656196L, var4),
                                          -8507054174493142685L,
                                          var4
                                       );
                                       return;
                                    }
                                 case 3:
                                    label1778:
                                    if (this.field_45 == var52) {
                                       label2028: {
                                          double var128;
                                          int var96 = (var128 = var44 - var41) == 0.0 ? 0 : (var128 < 0.0 ? -1 : 1);
                                          byte var117 = var31;
                                          if (var3 <= 0) {
                                             if (var31 == 0) {
                                                if (var96 <= 0 && this.field_44 != net.C_47Rb.TROUSERS) {
                                                   this.field_44 = null;
                                                   this.field_43y = -1;
                                                   break label2028;
                                                }

                                                this.field_44 = net.C_47Rb.TROUSERS;
                                                var96 = this.field_43y;
                                             }

                                             var117 = var31;
                                          }

                                          label1767: {
                                             label2029: {
                                                if (var3 < 0) {
                                                   if (var117 != 0) {
                                                      break label2029;
                                                   }

                                                   var117 = ((byte) (-1));
                                                }

                                                label1760: {
                                                   if (var96 == var117) {
                                                      if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$179(field_43, -8507109990431419032L, var4))
                                                            .field_42X
                                                            .method_41$ac4db64966()
                                                         == null) {
                                                         var97 = this;
                                                         if (var2 < 0) {
                                                            break label1760;
                                                         }

                                                         this.field_43y = 0;
                                                      } else if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$184(field_43, -8507109990431419032L, var4))
                                                         .field_42X
                                                         .method_41$ac4db64966()
                                                         .method_48$dbd570a038()
                                                         .equals(var46.field_41)) {
                                                         var96 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$191(field_43, -8507109990431419032L, var4))
                                                            .field_42X
                                                            .method_41$ac4db64966()
                                                            .field_47;
                                                         var118 = var31;
                                                         if (var1 < 0) {
                                                            break label1767;
                                                         }

                                                         if (var31 != 0) {
                                                            break label2029;
                                                         }

                                                         if (var96 >= var52.field_41) {
                                                            this.field_43y = 1;
                                                         }
                                                      }
                                                   }

                                                   var97 = this;
                                                }

                                                var96 = ((int) (recovery$indy$flow$197(
                                                   var97, var47, null, 0, -1, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                ) ? 1 : 0));
                                             }

                                             var118 = var31;
                                          }

                                          if (var2 >= 0) {
                                             if (var118 == 0) {
                                                if (var96 != 0) {
                                                   return;
                                                }

                                                var96 = ((int) (recovery$indy$flow$199(
                                                   this, var47, var46, var52.field_41, 0, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                ) ? 1 : 0));
                                             }

                                             var118 = var31;
                                          }

                                          if (var1 >= 0) {
                                             if (var118 == 0) {
                                                if (var96 != 0) {
                                                   return;
                                                }

                                                var96 = ((int) (recovery$indy$flow$200(this, var47, var8, 7, 1, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var118 = var31;
                                          }

                                          if (var3 < 0) {
                                             if (var118 == 0) {
                                                if (var96 != 0) {
                                                   return;
                                                }

                                                var96 = ((int) (recovery$indy$flow$201(this, var47, var8, 4, 2, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var118 = var31;
                                          }

                                          if (var2 > 0) {
                                             if (var118 == 0) {
                                                if (var96 != 0) {
                                                   return;
                                                }

                                                var96 = ((int) (recovery$indy$flow$202(this, var47, var8, 1, 3, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var118 = var31;
                                          }

                                          if (var2 >= 0) {
                                             if (var118 == 0) {
                                                if (var96 != 0) {
                                                   return;
                                                }

                                                var96 = ((int) (recovery$indy$flow$203(this, var47, var8, 2, 4, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var118 = var31;
                                          }

                                          if (var3 <= 0) {
                                             if (var118 == 0) {
                                                if (var96 != 0) {
                                                   return;
                                                }

                                                var96 = ((int) (recovery$indy$flow$204(this, var47, var8, 3, 5, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var118 = var31;
                                          }

                                          if (var2 >= 0) {
                                             if (var118 == 0) {
                                                if (var96 != 0) {
                                                   return;
                                                }

                                                var96 = ((int) (recovery$indy$flow$205(this, var47, var8, 6, 6, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var118 = var31;
                                          }

                                          if (var2 > 0) {
                                             if (var118 == 0) {
                                                if (var96 != 0) {
                                                   return;
                                                }

                                                var96 = ((int) (recovery$indy$flow$206(this, var47, var8, 9, 7, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var118 = var31;
                                          }

                                          if (var2 > 0) {
                                             if (var118 == 0) {
                                                if (var96 != 0) {
                                                   return;
                                                }

                                                var96 = ((int) (recovery$indy$flow$207(this, var29, var47, 0, 8, -8506230399539920850L, var4) ? 1 : 0));
                                             }

                                             var118 = var31;
                                          }

                                          if (var2 > 0) {
                                             if (var118 == 0) {
                                                if (var96 != 0) {
                                                   return;
                                                }

                                                var96 = this.field_43y;
                                             }

                                             var118 = 9;
                                          }

                                          if (var96 != var118) {
                                             break label1778;
                                          }

                                          this.field_44 = null;
                                          this.field_43y = -1;
                                          this.field_45 = net.C_47Rb.HELMET;
                                          if (var3 <= 0) {
                                             break label1778;
                                          }
                                       }

                                       this.field_45 = net.C_47Rb.HELMET;
                                    }

                                    var51++;

                                    label1726:
                                    while (true) {
                                       byte var98 = var31;

                                       while (true) {
                                          if (var98 != 0 || var51 >= var50) {
                                             if (var2 < 0) {
                                                recovery$indy$flow$322(this.field_49, -8507200473289563055L, var4);
                                                this.field_43y = -1;
                                                this.field_44 = null;
                                                return;
                                             }

                                             recovery$indy$flow$310(this.field_49, -8507200473289563055L, var4);
                                             var99 = this;
                                             break;
                                          }

                                          var52 = var49[var51];
                                          var53 = (net.C_42a)recovery$indy$flow$73(this, var47, var18, -8505389852110150042L, var4);
                                          var61 = (java.util.HashMap)recovery$indy$flow$74(var53, -8505447071865088180L, var4);
                                          var62 = (java.util.HashMap)recovery$indy$flow$76(var53, -8505968417808155624L, var4);
                                          var41 = (Double)var48.get(var52);
                                          var99 = this;
                                          if (var2 <= 0) {
                                             break;
                                          }

                                          var70 = (net.C_42a)recovery$indy$flow$81(this, var52, var61, var12, var62, -8506069080003252242L, var4);
                                          var44 = (Double)recovery$indy$flow$82(var70, -8505447071865088180L, var4);
                                          var46 = (net.C_47qP)recovery$indy$flow$85(var70, -8505968417808155624L, var4);
                                          var98 = var31;
                                          if (var3 < 0) {
                                             if (var31 == 0) {
                                                continue label1967;
                                             }
                                             continue label1726;
                                          }
                                       }

                                       var99.field_438 = recovery$indy$flow$316(
                                          net.C_476q.field_48,
                                          var22,
                                          recovery$indy$flow$313(this.settingDelay, var10, -8506616489121819479L, var4),
                                          recovery$indy$flow$315(this.settingDelay, var6, -8505098018418656196L, var4),
                                          -8507054174493142685L,
                                          var4
                                       );
                                       return;
                                    }
                                 case 4:
                                    label1711:
                                    if (this.field_45 == var52) {
                                       label2022: {
                                          double var127;
                                          int var92 = (var127 = var44 - var41) == 0.0 ? 0 : (var127 < 0.0 ? -1 : 1);
                                          byte var115 = var31;
                                          if (var1 >= 0) {
                                             if (var31 == 0) {
                                                if (var92 <= 0 && this.field_44 != net.C_47Rb.HELMET) {
                                                   this.field_44 = null;
                                                   this.field_43y = -1;
                                                   break label2022;
                                                }

                                                this.field_44 = net.C_47Rb.HELMET;
                                                var92 = this.field_43y;
                                             }

                                             var115 = var31;
                                          }

                                          label1700: {
                                             label2023: {
                                                if (var2 >= 0) {
                                                   if (var115 != 0) {
                                                      break label2023;
                                                   }

                                                   var115 = ((byte) (-1));
                                                }

                                                label1693: {
                                                   if (var92 == var115) {
                                                      if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$224(field_43, -8507109990431419032L, var4))
                                                            .field_42X
                                                            .method_41$ac4db64966()
                                                         == null) {
                                                         var93 = this;
                                                         if (var2 <= 0) {
                                                            break label1693;
                                                         }

                                                         this.field_43y = 0;
                                                      } else if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$229(field_43, -8507109990431419032L, var4))
                                                         .field_42X
                                                         .method_41$ac4db64966()
                                                         .method_48$dbd570a038()
                                                         .equals(var46.field_41)) {
                                                         var92 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$236(field_43, -8507109990431419032L, var4))
                                                            .field_42X
                                                            .method_41$ac4db64966()
                                                            .field_47;
                                                         var116 = var31;
                                                         if (var3 >= 0) {
                                                            break label1700;
                                                         }

                                                         if (var31 != 0) {
                                                            break label2023;
                                                         }

                                                         if (var92 >= var52.field_41) {
                                                            this.field_43y = 1;
                                                         }
                                                      }
                                                   }

                                                   var93 = this;
                                                }

                                                var92 = ((int) (recovery$indy$flow$242(
                                                   var93, var47, null, 0, -1, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                ) ? 1 : 0));
                                             }

                                             var116 = var31;
                                          }

                                          if (var1 >= 0) {
                                             if (var116 == 0) {
                                                if (var92 != 0) {
                                                   return;
                                                }

                                                var92 = ((int) (recovery$indy$flow$244(
                                                   this, var47, var46, var52.field_41, 0, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                ) ? 1 : 0));
                                             }

                                             var116 = var31;
                                          }

                                          if (var1 >= 0) {
                                             if (var116 == 0) {
                                                if (var92 != 0) {
                                                   return;
                                                }

                                                var92 = ((int) (recovery$indy$flow$245(this, var47, var8, 4, 1, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var116 = var31;
                                          }

                                          if (var3 < 0) {
                                             if (var116 == 0) {
                                                if (var92 != 0) {
                                                   return;
                                                }

                                                var92 = ((int) (recovery$indy$flow$246(this, var47, var8, 1, 2, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var116 = var31;
                                          }

                                          if (var1 >= 0) {
                                             if (var116 == 0) {
                                                if (var92 != 0) {
                                                   return;
                                                }

                                                var92 = ((int) (recovery$indy$flow$247(this, var47, var8, 2, 3, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var116 = var31;
                                          }

                                          if (var3 < 0) {
                                             if (var116 == 0) {
                                                if (var92 != 0) {
                                                   return;
                                                }

                                                var92 = ((int) (recovery$indy$flow$248(this, var47, var8, 3, 4, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var116 = var31;
                                          }

                                          if (var1 >= 0) {
                                             if (var116 == 0) {
                                                if (var92 != 0) {
                                                   return;
                                                }

                                                var92 = ((int) (recovery$indy$flow$249(this, var47, var8, 6, 5, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var116 = var31;
                                          }

                                          if (var2 >= 0) {
                                             if (var116 == 0) {
                                                if (var92 != 0) {
                                                   return;
                                                }

                                                var92 = ((int) (recovery$indy$flow$250(this, var29, var47, 0, 6, -8506230399539920850L, var4) ? 1 : 0));
                                             }

                                             var116 = var31;
                                          }

                                          if (var3 <= 0) {
                                             if (var116 == 0) {
                                                if (var92 != 0) {
                                                   return;
                                                }

                                                var92 = this.field_43y;
                                             }

                                             var116 = 7;
                                          }

                                          if (var92 != var116) {
                                             break label1711;
                                          }

                                          this.field_44 = null;
                                          this.field_43y = -1;
                                          this.field_45 = net.C_47Rb.SHOES;
                                          if (var2 >= 0) {
                                             break label1711;
                                          }
                                       }

                                       this.field_45 = net.C_47Rb.SHOES;
                                    }

                                    var51++;

                                    label1662:
                                    while (true) {
                                       byte var94 = var31;

                                       while (true) {
                                          if (var94 != 0 || var51 >= var50) {
                                             if (var2 < 0) {
                                                recovery$indy$flow$322(this.field_49, -8507200473289563055L, var4);
                                                this.field_43y = -1;
                                                this.field_44 = null;
                                                return;
                                             }

                                             recovery$indy$flow$310(this.field_49, -8507200473289563055L, var4);
                                             var95 = this;
                                             break;
                                          }

                                          var52 = var49[var51];
                                          var53 = (net.C_42a)recovery$indy$flow$73(this, var47, var18, -8505389852110150042L, var4);
                                          var61 = (java.util.HashMap)recovery$indy$flow$74(var53, -8505447071865088180L, var4);
                                          var62 = (java.util.HashMap)recovery$indy$flow$76(var53, -8505968417808155624L, var4);
                                          var41 = (Double)var48.get(var52);
                                          var95 = this;
                                          if (var2 <= 0) {
                                             break;
                                          }

                                          var70 = (net.C_42a)recovery$indy$flow$81(this, var52, var61, var12, var62, -8506069080003252242L, var4);
                                          var44 = (Double)recovery$indy$flow$82(var70, -8505447071865088180L, var4);
                                          var46 = (net.C_47qP)recovery$indy$flow$85(var70, -8505968417808155624L, var4);
                                          var94 = var31;
                                          if (var3 < 0) {
                                             if (var31 == 0) {
                                                continue label1967;
                                             }
                                             continue label1662;
                                          }
                                       }

                                       var95.field_438 = recovery$indy$flow$316(
                                          net.C_476q.field_48,
                                          var22,
                                          recovery$indy$flow$313(this.settingDelay, var10, -8506616489121819479L, var4),
                                          recovery$indy$flow$315(this.settingDelay, var6, -8505098018418656196L, var4),
                                          -8507054174493142685L,
                                          var4
                                       );
                                       return;
                                    }
                                 case 5:
                                    label1647:
                                    if (this.field_45 == var52) {
                                       label2016: {
                                          double var126;
                                          int var88 = (var126 = var44 - var41) == 0.0 ? 0 : (var126 < 0.0 ? -1 : 1);
                                          byte var113 = var31;
                                          if (var3 <= 0) {
                                             if (var31 == 0) {
                                                if (var88 <= 0 && this.field_44 != net.C_47Rb.SHOES) {
                                                   this.field_44 = null;
                                                   this.field_43y = -1;
                                                   break label2016;
                                                }

                                                this.field_44 = net.C_47Rb.SHOES;
                                                var88 = this.field_43y;
                                             }

                                             var113 = var31;
                                          }

                                          label1636: {
                                             label2017: {
                                                if (var2 > 0) {
                                                   if (var113 != 0) {
                                                      break label2017;
                                                   }

                                                   var113 = ((byte) (-1));
                                                }

                                                label1629: {
                                                   if (var88 == var113) {
                                                      if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$267(field_43, -8507109990431419032L, var4))
                                                            .field_42X
                                                            .method_41$ac4db64966()
                                                         == null) {
                                                         var89 = this;
                                                         if (var1 < 0) {
                                                            break label1629;
                                                         }

                                                         this.field_43y = 0;
                                                      } else if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$272(field_43, -8507109990431419032L, var4))
                                                         .field_42X
                                                         .method_41$ac4db64966()
                                                         .method_48$dbd570a038()
                                                         .equals(var46.field_41)) {
                                                         var88 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$279(field_43, -8507109990431419032L, var4))
                                                            .field_42X
                                                            .method_41$ac4db64966()
                                                            .field_47;
                                                         var114 = var31;
                                                         if (var2 < 0) {
                                                            break label1636;
                                                         }

                                                         if (var31 != 0) {
                                                            break label2017;
                                                         }

                                                         if (var88 >= var52.field_41) {
                                                            this.field_43y = 1;
                                                         }
                                                      }
                                                   }

                                                   var89 = this;
                                                }

                                                var88 = ((int) (recovery$indy$flow$285(
                                                   var89, var47, null, 0, -1, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                ) ? 1 : 0));
                                             }

                                             var114 = var31;
                                          }

                                          if (var3 < 0) {
                                             if (var114 == 0) {
                                                if (var88 != 0) {
                                                   return;
                                                }

                                                var88 = ((int) (recovery$indy$flow$287(
                                                   this, var47, var46, var52.field_41, 0, (short)var24, (char)var25, var26, -8505909397908300665L, var4
                                                ) ? 1 : 0));
                                             }

                                             var114 = var31;
                                          }

                                          if (var1 >= 0) {
                                             if (var114 == 0) {
                                                if (var88 != 0) {
                                                   return;
                                                }

                                                var88 = ((int) (recovery$indy$flow$288(this, var47, var8, 1, 1, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var114 = var31;
                                          }

                                          if (var3 < 0) {
                                             if (var114 == 0) {
                                                if (var88 != 0) {
                                                   return;
                                                }

                                                var88 = ((int) (recovery$indy$flow$289(this, var47, var8, 4, 2, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var114 = var31;
                                          }

                                          if (var2 >= 0) {
                                             if (var114 == 0) {
                                                if (var88 != 0) {
                                                   return;
                                                }

                                                var88 = ((int) (recovery$indy$flow$290(this, var47, var8, 6, 3, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var114 = var31;
                                          }

                                          if (var2 > 0) {
                                             if (var114 == 0) {
                                                if (var88 != 0) {
                                                   return;
                                                }

                                                var88 = ((int) (recovery$indy$flow$291(this, var47, var8, 3, 4, -8507279138696987886L, var4) ? 1 : 0));
                                             }

                                             var114 = var31;
                                          }

                                          if (var3 < 0) {
                                             if (var114 == 0) {
                                                if (var88 != 0) {
                                                   return;
                                                }

                                                var88 = ((int) (recovery$indy$flow$292(this, var29, var47, 0, 5, -8506230399539920850L, var4) ? 1 : 0));
                                             }

                                             var114 = var31;
                                          }

                                          if (var3 <= 0) {
                                             if (var114 == 0) {
                                                if (var88 != 0) {
                                                   return;
                                                }

                                                var88 = this.field_43y;
                                             }

                                             var114 = 6;
                                          }

                                          if (var88 != var114) {
                                             break label1647;
                                          }

                                          this.field_44 = null;
                                          this.field_43y = -1;
                                          this.field_45 = net.C_47Rb.NULL;
                                          if (var3 < 0) {
                                             break label1647;
                                          }
                                       }

                                       this.field_45 = net.C_47Rb.NULL;
                                    }

                                    var51++;

                                    label1600:
                                    while (true) {
                                       byte var90 = var31;

                                       while (true) {
                                          if (var90 != 0 || var51 >= var50) {
                                             if (var2 < 0) {
                                                recovery$indy$flow$322(this.field_49, -8507200473289563055L, var4);
                                                this.field_43y = -1;
                                                this.field_44 = null;
                                                return;
                                             }

                                             recovery$indy$flow$310(this.field_49, -8507200473289563055L, var4);
                                             var91 = this;
                                             break;
                                          }

                                          var52 = var49[var51];
                                          var53 = (net.C_42a)recovery$indy$flow$73(this, var47, var18, -8505389852110150042L, var4);
                                          var61 = (java.util.HashMap)recovery$indy$flow$74(var53, -8505447071865088180L, var4);
                                          var62 = (java.util.HashMap)recovery$indy$flow$76(var53, -8505968417808155624L, var4);
                                          var41 = (Double)var48.get(var52);
                                          var91 = this;
                                          if (var2 <= 0) {
                                             break;
                                          }

                                          var70 = (net.C_42a)recovery$indy$flow$81(this, var52, var61, var12, var62, -8506069080003252242L, var4);
                                          var44 = (Double)recovery$indy$flow$82(var70, -8505447071865088180L, var4);
                                          var46 = (net.C_47qP)recovery$indy$flow$85(var70, -8505968417808155624L, var4);
                                          var90 = var31;
                                          if (var3 < 0) {
                                             if (var31 == 0) {
                                                continue label1967;
                                             }
                                             continue label1600;
                                          }
                                       }

                                       var91.field_438 = recovery$indy$flow$316(
                                          net.C_476q.field_48,
                                          var22,
                                          recovery$indy$flow$313(this.settingDelay, var10, -8506616489121819479L, var4),
                                          recovery$indy$flow$315(this.settingDelay, var6, -8505098018418656196L, var4),
                                          -8507054174493142685L,
                                          var4
                                       );
                                       return;
                                    }
                                 case 6:
                                    if (this.field_45 == var52
                                       && ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$304(field_43, -8507109990431419032L, var4)).field_42X.method_41$ac4db64966()
                                          != null
                                       && this.field_43a
                                       && recovery$indy$flow$308(this, var47, null, 0, -1, (short)var24, (char)var25, var26, -8505909397908300665L, var4)) {
                                       return;
                                    }

                                    var51++;

                                    label1584:
                                    while (true) {
                                       byte var86 = var31;

                                       while (true) {
                                          if (var86 != 0 || var51 >= var50) {
                                             if (var2 < 0) {
                                                recovery$indy$flow$322(this.field_49, -8507200473289563055L, var4);
                                                this.field_43y = -1;
                                                this.field_44 = null;
                                                return;
                                             }

                                             recovery$indy$flow$310(this.field_49, -8507200473289563055L, var4);
                                             var87 = this;
                                             break;
                                          }

                                          var52 = var49[var51];
                                          var53 = (net.C_42a)recovery$indy$flow$73(this, var47, var18, -8505389852110150042L, var4);
                                          var61 = (java.util.HashMap)recovery$indy$flow$74(var53, -8505447071865088180L, var4);
                                          var62 = (java.util.HashMap)recovery$indy$flow$76(var53, -8505968417808155624L, var4);
                                          var41 = (Double)var48.get(var52);
                                          var87 = this;
                                          if (var2 <= 0) {
                                             break;
                                          }

                                          var70 = (net.C_42a)recovery$indy$flow$81(this, var52, var61, var12, var62, -8506069080003252242L, var4);
                                          var44 = (Double)recovery$indy$flow$82(var70, -8505447071865088180L, var4);
                                          var46 = (net.C_47qP)recovery$indy$flow$85(var70, -8505968417808155624L, var4);
                                          var86 = var31;
                                          if (var3 < 0) {
                                             if (var31 == 0) {
                                                continue label1967;
                                             }
                                             continue label1584;
                                          }
                                       }

                                       var87.field_438 = recovery$indy$flow$316(
                                          net.C_476q.field_48,
                                          var22,
                                          recovery$indy$flow$313(this.settingDelay, var10, -8506616489121819479L, var4),
                                          recovery$indy$flow$315(this.settingDelay, var6, -8505098018418656196L, var4),
                                          -8507054174493142685L,
                                          var4
                                       );
                                       return;
                                    }
                                 default:
                                    var51++;
                              }

                              label1964:
                              while (true) {
                                 byte var84 = var31;

                                 while (true) {
                                    if (var84 != 0 || var51 >= var50) {
                                       if (var2 < 0) {
                                          recovery$indy$flow$322(this.field_49, -8507200473289563055L, var4);
                                          this.field_43y = -1;
                                          this.field_44 = null;
                                          return;
                                       }

                                       recovery$indy$flow$310(this.field_49, -8507200473289563055L, var4);
                                       var85 = this;
                                       break;
                                    }

                                    var52 = var49[var51];
                                    var53 = (net.C_42a)recovery$indy$flow$73(this, var47, var18, -8505389852110150042L, var4);
                                    var61 = (java.util.HashMap)recovery$indy$flow$74(var53, -8505447071865088180L, var4);
                                    var62 = (java.util.HashMap)recovery$indy$flow$76(var53, -8505968417808155624L, var4);
                                    var41 = (Double)var48.get(var52);
                                    var85 = this;
                                    if (var2 <= 0) {
                                       break;
                                    }

                                    var70 = (net.C_42a)recovery$indy$flow$81(this, var52, var61, var12, var62, -8506069080003252242L, var4);
                                    var44 = (Double)recovery$indy$flow$82(var70, -8505447071865088180L, var4);
                                    var46 = (net.C_47qP)recovery$indy$flow$85(var70, -8505968417808155624L, var4);
                                    var84 = var31;
                                    if (var3 < 0) {
                                       if (var31 == 0) {
                                          continue label1967;
                                       }
                                       continue label1964;
                                    }
                                 }

                                 var85.field_438 = recovery$indy$flow$316(
                                    net.C_476q.field_48,
                                    var22,
                                    recovery$indy$flow$313(this.settingDelay, var10, -8506616489121819479L, var4),
                                    recovery$indy$flow$315(this.settingDelay, var6, -8505098018418656196L, var4),
                                    -8507054174493142685L,
                                    var4
                                 );
                                 return;
                              }
                           }
                        }

                        var82 = var31;
                     }

                     if (var82 == 0) {
                        continue;
                     }
                  }

                  var83 = this.field_49;
                  var10001 = -8507200473289563055L;
                  var125 = var4;
                  if (var2 < 0) {
                     break label2102;
                  }

                  recovery$indy$flow$310(this.field_49, -8507200473289563055L, var4);
                  var81 = this;
                  break;
               }

               var81.field_438 = recovery$indy$flow$316(
                  net.C_476q.field_48,
                  var22,
                  recovery$indy$flow$313(this.settingDelay, var10, -8506616489121819479L, var4),
                  recovery$indy$flow$315(this.settingDelay, var6, -8505098018418656196L, var4),
                  -8507054174493142685L,
                  var4
               );
               return;
            }
         }

         recovery$indy$flow$322(var83, var10001, var125);
         this.field_43y = -1;
         this.field_44 = null;
      } else {
         long var10002;
         label2004: {
            C_47ps var32 = (C_47ps)var10000;
            if (recovery$indy$flow$67(
               this.field_48, recovery$indy$flow$66(this.settingStartDelay, var14, -8505479843571939990L, var4), var20, -8505732657969277751L, var4
            )) {
               label2001: {
                  java.util.HashMap var33 = (java.util.HashMap)recovery$indy$flow$71(this, var16, -8506473787692058071L, var4);
                  net.C_47Rb[] var34 = (net.C_47Rb[])recovery$indy$flow$72(-8506283202004185555L, var4);
                  int var35 = var34.length;
                  byte var36 = ((byte) (0));
                  if (var36 < var35) {
                     net.C_47Rb var37 = var34[var36];
                     net.C_42a var38 = (net.C_42a)recovery$indy$flow$73(this, var32, var18, -8505389852110150042L, var4);
                     java.util.HashMap var39 = (java.util.HashMap)recovery$indy$flow$74(var38, -8505447071865088180L, var4);
                     java.util.HashMap var40 = (java.util.HashMap)recovery$indy$flow$76(var38, -8505968417808155624L, var4);
                     var33.get(var37);
                     var78 = this;
                     if (var2 <= 0) {
                        break label2001;
                     }

                     net.C_42a var43 = (net.C_42a)recovery$indy$flow$81(this, var37, var39, var12, var40, -8506069080003252242L, var4);
                     recovery$indy$flow$82(var43, -8505447071865088180L, var4);
                     net.C_47qP var79 = (net.C_47qP)recovery$indy$flow$85(var43, -8505968417808155624L, var4);
                  } else {
                     var80 = this.field_49;
                     var10001 = -8507200473289563055L;
                     var10002 = var4;
                     if (var2 < 0) {
                        break label2004;
                     }

                     recovery$indy$flow$310(this.field_49, -8507200473289563055L, var4);
                  }

                  var78 = this;
               }

               var78.field_438 = recovery$indy$flow$316(
                  net.C_476q.field_48,
                  var22,
                  recovery$indy$flow$313(this.settingDelay, var10, -8506616489121819479L, var4),
                  recovery$indy$flow$315(this.settingDelay, var6, -8505098018418656196L, var4),
                  -8507054174493142685L,
                  var4
               );
            }

            this.field_43a = false;
            this.field_45 = net.C_47Rb.SWORD;
            var80 = this.field_48;
            var10001 = -8507200473289563055L;
            var10002 = var4;
         }

         recovery$indy$flow$322(var80, var10001, var10002);
         this.field_43y = -1;
         this.field_44 = null;
      }
   }


















   private boolean method_46$5ed36d21b3(net.C_47ps var1, long var2, int var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 73381613027168L;
      long var7 = var2 ^ 106719686775527L;
      long var9 = var2 ^ 16272684822003L;
      long var11 = var2 ^ 121401704009147L;
      long var13 = var2 ^ 118766590037945L;
      byte var15 = ((byte) (recovery$indy$flow$326(-3872358699310684696L, var2) ? 1 : 0));
      net.C_47sT var16 = (net.C_47sT)var1.field_46M.field_46.get(var4);
      if (var15 == 0) {
         String var33 = (String)recovery$indy$flow$356(this.settingClickMode, var13, -3872268527301803099L, var2);
         int var51 = var33.hashCode();
         if (var15 != 0) {
            switch (var51) {
               case 0:
                  ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                     .method_42$f0ddb617a2(var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2));
                  if (var2 > 0L) {
                     ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                     recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                     this.field_438 = recovery$indy$flow$382(
                        net.C_476q.field_48,
                        var9,
                        recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                        recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                        -3872091127768984880L,
                        var2
                     );
                     return true;
                  }

                  return true;
               case 1:
                  ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                  if (var2 >= 0L) {
                     ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                     recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                     this.field_438 = recovery$indy$flow$382(
                        net.C_476q.field_48,
                        var9,
                        recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                        recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                        -3872091127768984880L,
                        var2
                     );
                     return true;
                  }

                  return true;
               case 2:
                  ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                  recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                  this.field_438 = recovery$indy$flow$382(
                     net.C_476q.field_48,
                     var9,
                     recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                     recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                     -3872091127768984880L,
                     var2
                  );
                  return true;
               default:
                  recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                  this.field_438 = recovery$indy$flow$382(
                     net.C_476q.field_48,
                     var9,
                     recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                     recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                     -3872091127768984880L,
                     var2
                  );
                  return true;
            }
         } else {
            return (((var51) & 1) != 0);
         }
      } else {
         byte var10000 = ((byte) (recovery$indy$flow$332(this.settingSmartDelay, -3871578646370784990L, var2) ? 1 : 0));
         if (var2 < 0L) {
            double var31 = Math.abs(var10000 - var1.field_45[0]);
            double var39 = Math.abs(var16.field_46 + 2 + var1.field_433 - var1.field_45[1]);
            double var40 = Math.sqrt(var31 * var31 + var39 * var39);
            double var41 = recovery$indy$flow$343(this.settingDelay, var7, -3872774960936151270L, var2)
               + recovery$indy$flow$345(this.settingDelay, var5, -3871797686408527985L, var2)
               - recovery$indy$flow$347(this.settingDelay, var7, -3872774960936151270L, var2) / 2.0;
            double var42 = var40 / 30.0;
            if (var15 > 0) {
               return recovery$indy$flow$349(this.field_49, (long)(var41 * var42), var11, -3871326881348920533L, var2);
            }

            var1.field_45 = new double[]{var16.field_40 + 2 + var1.field_46c, var16.field_46 + 2 + var1.field_433};
            String var32 = (String)recovery$indy$flow$356(this.settingClickMode, var13, -3872268527301803099L, var2);
            byte var38 = -1;
            byte var53;
            switch (var32.hashCode()) {
               case 63955982:
                  if (var32.equals((String)recovery$indy$flow$358(5589, 8289587799960550125L ^ var2))) {
                     var38 = 0;
                     if (var15 != 0) {
                        var10000 = var15;
                        var53 = var15;
                        break;
                     }
                  }

                  var10000 = var38;
                  var53 = var15;
                  break;
               case 76517104:
                  if (var32.equals((String)recovery$indy$flow$360(25969, 2399251891511200323L ^ var2))) {
                     var10000 = var15;
                     var53 = var15;
                  } else {
                     var10000 = var38;
                     var53 = var15;
                  }
                  break;
               case 355504491:
                  var10000 = ((byte) (var32.equals((String)recovery$indy$flow$362(6230, 8705286514639075171L ^ var2)) ? 1 : 0));
                  var53 = var15;
                  break;
               default:
                  var10000 = var38;
                  var53 = var15;
            }

            if (var53 != 0) {
               switch (var10000) {
                  case 0:
                     ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                        .method_42$f0ddb617a2(
                           var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                        );
                     break;
                  case 1:
                     ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                     break;
                  case 2:
                     ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                     recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                     this.field_438 = recovery$indy$flow$382(
                        net.C_476q.field_48,
                        var9,
                        recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                        recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                        -3872091127768984880L,
                        var2
                     );
                     break;
                  default:
                     recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                     this.field_438 = recovery$indy$flow$382(
                        net.C_476q.field_48,
                        var9,
                        recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                        recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                        -3872091127768984880L,
                        var2
                     );
               }

               var10000 = 1;
            }

            return (((var10000) & 1) != 0);
         } else if (var10000 != 0) {
            double var28 = Math.abs(var16.field_40 + 2 + var1.field_46c - var1.field_45[0]);
            double var19 = Math.abs(var16.field_46 + 2 + var1.field_433 - var1.field_45[1]);
            double var21 = Math.sqrt(var28 * var28 + var19 * var19);
            double var23 = recovery$indy$flow$343(this.settingDelay, var7, -3872774960936151270L, var2)
               + recovery$indy$flow$345(this.settingDelay, var5, -3871797686408527985L, var2)
               - recovery$indy$flow$347(this.settingDelay, var7, -3872774960936151270L, var2) / 2.0;
            double var25 = var21 / 30.0;
            if (var2 > 0L) {
               if (var15 != 0) {
                  if (var21 > 36.0 && !recovery$indy$flow$349(this.field_49, (long)(var23 * var25), var11, -3871326881348920533L, var2)) {
                     return false;
                  }

                  var1.field_45 = new double[]{var16.field_40 + 2 + var1.field_46c, var16.field_46 + 2 + var1.field_433};
               }

               String var30 = (String)recovery$indy$flow$356(this.settingClickMode, var13, -3872268527301803099L, var2);
               byte var37 = -1;
               switch (var30.hashCode()) {
                  case 63955982:
                     if (var30.equals((String)recovery$indy$flow$358(5589, 8289587799960550125L ^ var2))) {
                        var37 = 0;
                        if (var15 == 0 && var30.equals((String)recovery$indy$flow$360(25969, 2399251891511200323L ^ var2))) {
                           var37 = 1;
                           if (var15 == 0) {
                              var10000 = ((byte) (var30.equals((String)recovery$indy$flow$362(6230, 8705286514639075171L ^ var2)) ? 1 : 0));
                              if (var15 == 0) {
                                 break;
                              }

                              if (var10000 != 0) {
                                 var37 = 2;
                              }
                           }
                        }
                     }

                     var10000 = var37;
                     break;
                  case 76517104:
                     if (var30.equals((String)recovery$indy$flow$360(25969, 2399251891511200323L ^ var2))) {
                        var37 = 1;
                        if (var15 == 0) {
                           var10000 = ((byte) (var30.equals((String)recovery$indy$flow$362(6230, 8705286514639075171L ^ var2)) ? 1 : 0));
                           if (var15 == 0) {
                              break;
                           }

                           if (var10000 != 0) {
                              var37 = 2;
                           }
                        }
                     }

                     var10000 = var37;
                     break;
                  case 355504491:
                     var10000 = ((byte) (var30.equals((String)recovery$indy$flow$362(6230, 8705286514639075171L ^ var2)) ? 1 : 0));
                     if (var15 != 0) {
                        if (var10000 != 0) {
                           var37 = 2;
                        }

                        var10000 = var37;
                     }
                     break;
                  default:
                     var10000 = var37;
               }

               if (var15 != 0) {
                  switch (var10000) {
                     case 0:
                        ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                           .method_42$f0ddb617a2(
                              var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                           );
                        break;
                     case 1:
                        ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                        break;
                     case 2:
                        ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                  }

                  recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                  this.field_438 = recovery$indy$flow$382(
                     net.C_476q.field_48,
                     var9,
                     recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                     recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                     -3872091127768984880L,
                     var2
                  );
                  var10000 = 1;
               }

               return (((var10000) & 1) != 0);
            } else {
               if (var15 > 0) {
                  return recovery$indy$flow$349(this.field_49, (long)(var23 * var25), var11, -3871326881348920533L, var2);
               }

               var1.field_45 = new double[]{var16.field_40 + 2 + var1.field_46c, var16.field_46 + 2 + var1.field_433};
               String var29 = (String)recovery$indy$flow$356(this.settingClickMode, var13, -3872268527301803099L, var2);
               byte var36 = -1;
               byte var52;
               switch (var29.hashCode()) {
                  case 63955982:
                     if (var29.equals((String)recovery$indy$flow$358(5589, 8289587799960550125L ^ var2))) {
                        var36 = 0;
                        if (var15 != 0) {
                           var10000 = var15;
                           var52 = var15;
                           break;
                        }
                     }

                     var10000 = var36;
                     var52 = var15;
                     break;
                  case 76517104:
                     if (var29.equals((String)recovery$indy$flow$360(25969, 2399251891511200323L ^ var2))) {
                        var10000 = var15;
                        var52 = var15;
                     } else {
                        var10000 = var36;
                        var52 = var15;
                     }
                     break;
                  case 355504491:
                     var10000 = ((byte) (var29.equals((String)recovery$indy$flow$362(6230, 8705286514639075171L ^ var2)) ? 1 : 0));
                     var52 = var15;
                     break;
                  default:
                     var10000 = var36;
                     var52 = var15;
               }

               if (var52 != 0) {
                  switch (var10000) {
                     case 0:
                        ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                           .method_42$f0ddb617a2(
                              var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                           );
                        break;
                     case 1:
                        ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                        recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                        this.field_438 = recovery$indy$flow$382(
                           net.C_476q.field_48,
                           var9,
                           recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                           recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                           -3872091127768984880L,
                           var2
                        );
                        break;
                     case 2:
                        ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                        recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                        this.field_438 = recovery$indy$flow$382(
                           net.C_476q.field_48,
                           var9,
                           recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                           recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                           -3872091127768984880L,
                           var2
                        );
                        break;
                     default:
                        recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                        this.field_438 = recovery$indy$flow$382(
                           net.C_476q.field_48,
                           var9,
                           recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                           recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                           -3872091127768984880L,
                           var2
                        );
                  }

                  var10000 = 1;
               }

               return (((var10000) & 1) != 0);
            }
         } else {
            var1.field_45 = new double[]{var16.field_40 + 2 + var1.field_46c, var16.field_46 + 2 + var1.field_433};
            String var17 = (String)recovery$indy$flow$356(this.settingClickMode, var13, -3872268527301803099L, var2);
            byte var18 = -1;
            switch (var17.hashCode()) {
               case 63955982:
                  if (var17.equals((String)recovery$indy$flow$358(5589, 8289587799960550125L ^ var2))) {
                     var18 = 0;
                     if (var2 <= 0L) {
                        byte var10001;
                        if (var15 != 0) {
                           var10000 = var15;
                           var10001 = var15;
                        } else {
                           var10000 = var18;
                           var10001 = var15;
                        }

                        if (var10001 != 0) {
                           switch (var10000) {
                              case 0:
                                 ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                                    .method_42$f0ddb617a2(
                                       var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                                    );
                                 break;
                              case 1:
                                 ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                                 recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                                 this.field_438 = recovery$indy$flow$382(
                                    net.C_476q.field_48,
                                    var9,
                                    recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                    recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                    -3872091127768984880L,
                                    var2
                                 );
                                 break;
                              case 2:
                                 ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                                 recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                                 this.field_438 = recovery$indy$flow$382(
                                    net.C_476q.field_48,
                                    var9,
                                    recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                    recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                    -3872091127768984880L,
                                    var2
                                 );
                                 break;
                              default:
                                 recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                                 this.field_438 = recovery$indy$flow$382(
                                    net.C_476q.field_48,
                                    var9,
                                    recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                    recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                    -3872091127768984880L,
                                    var2
                                 );
                           }

                           var10000 = 1;
                        }

                        return (((var10000) & 1) != 0);
                     } else {
                        label755: {
                           if (var15 == 0 && var17.equals((String)recovery$indy$flow$360(25969, 2399251891511200323L ^ var2))) {
                              var18 = 1;
                              if (var15 == 0) {
                                 var10000 = ((byte) (var17.equals((String)recovery$indy$flow$362(6230, 8705286514639075171L ^ var2)) ? 1 : 0));
                                 if (var15 == 0) {
                                    break label755;
                                 }

                                 if (var10000 != 0) {
                                    var18 = 2;
                                 }
                              }
                           }

                           var10000 = var18;
                        }

                        if (var15 != 0) {
                           switch (var10000) {
                              case 0:
                                 ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                                    .method_42$f0ddb617a2(
                                       var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                                    );
                                 break;
                              case 1:
                                 ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                                 break;
                              case 2:
                                 ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                           }

                           recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                           this.field_438 = recovery$indy$flow$382(
                              net.C_476q.field_48,
                              var9,
                              recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                              recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                              -3872091127768984880L,
                              var2
                           );
                           var10000 = 1;
                        }

                        return (((var10000) & 1) != 0);
                     }
                  } else if (var15 != 0) {
                     switch (var18) {
                        case 0:
                           ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                              .method_42$f0ddb617a2(
                                 var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                              );
                           if (var2 > 0L) {
                              recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                              this.field_438 = recovery$indy$flow$382(
                                 net.C_476q.field_48,
                                 var9,
                                 recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                 recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                 -3872091127768984880L,
                                 var2
                              );
                              return true;
                           }

                           return true;
                        case 1:
                           ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                           recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                           this.field_438 = recovery$indy$flow$382(
                              net.C_476q.field_48,
                              var9,
                              recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                              recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                              -3872091127768984880L,
                              var2
                           );
                           return true;
                        case 2:
                           ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                           recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                           this.field_438 = recovery$indy$flow$382(
                              net.C_476q.field_48,
                              var9,
                              recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                              recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                              -3872091127768984880L,
                              var2
                           );
                           return true;
                        default:
                           recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                           this.field_438 = recovery$indy$flow$382(
                              net.C_476q.field_48,
                              var9,
                              recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                              recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                              -3872091127768984880L,
                              var2
                           );
                           return true;
                     }
                  } else {
                     return (((var18) & 1) != 0);
                  }
               case 76517104:
                  if (var17.equals((String)recovery$indy$flow$360(25969, 2399251891511200323L ^ var2))) {
                     var18 = 1;
                     var10000 = var15;
                     if (var2 <= 0L) {
                        if (var15 != 0) {
                           switch (var15) {
                              case 0:
                                 ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                                    .method_42$f0ddb617a2(
                                       var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                                    );
                                 break;
                              case 1:
                                 ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                                 recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                                 this.field_438 = recovery$indy$flow$382(
                                    net.C_476q.field_48,
                                    var9,
                                    recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                    recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                    -3872091127768984880L,
                                    var2
                                 );
                                 break;
                              case 2:
                                 ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                                 recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                                 this.field_438 = recovery$indy$flow$382(
                                    net.C_476q.field_48,
                                    var9,
                                    recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                    recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                    -3872091127768984880L,
                                    var2
                                 );
                                 break;
                              default:
                                 recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                                 this.field_438 = recovery$indy$flow$382(
                                    net.C_476q.field_48,
                                    var9,
                                    recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                    recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                    -3872091127768984880L,
                                    var2
                                 );
                           }

                           var10000 = 1;
                        }

                        return (((var10000) & 1) != 0);
                     }

                     label741: {
                        if (var15 == 0) {
                           var10000 = ((byte) (var17.equals((String)recovery$indy$flow$362(6230, 8705286514639075171L ^ var2)) ? 1 : 0));
                           if (var15 == 0) {
                              break label741;
                           }

                           if (var10000 != 0) {
                              var18 = 2;
                           }
                        }

                        var10000 = var18;
                     }

                     if (var15 != 0) {
                        switch (var10000) {
                           case 0:
                              ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                                 .method_42$f0ddb617a2(
                                    var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                                 );
                              break;
                           case 1:
                              ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                              break;
                           case 2:
                              ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                        }

                        recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                        this.field_438 = recovery$indy$flow$382(
                           net.C_476q.field_48,
                           var9,
                           recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                           recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                           -3872091127768984880L,
                           var2
                        );
                        var10000 = 1;
                     }

                     return (((var10000) & 1) != 0);
                  } else {
                     if (var15 != 0) {
                        switch (var18) {
                           case 0:
                              ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                                 .method_42$f0ddb617a2(
                                    var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                                 );
                              if (var2 > 0L) {
                                 recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                                 this.field_438 = recovery$indy$flow$382(
                                    net.C_476q.field_48,
                                    var9,
                                    recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                    recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                    -3872091127768984880L,
                                    var2
                                 );
                                 return true;
                              }

                              return true;
                           case 1:
                              ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                              recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                              this.field_438 = recovery$indy$flow$382(
                                 net.C_476q.field_48,
                                 var9,
                                 recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                 recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                 -3872091127768984880L,
                                 var2
                              );
                              return true;
                           case 2:
                              ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                              recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                              this.field_438 = recovery$indy$flow$382(
                                 net.C_476q.field_48,
                                 var9,
                                 recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                 recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                 -3872091127768984880L,
                                 var2
                              );
                              return true;
                           default:
                              recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                              this.field_438 = recovery$indy$flow$382(
                                 net.C_476q.field_48,
                                 var9,
                                 recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                 recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                 -3872091127768984880L,
                                 var2
                              );
                              return true;
                        }
                     }

                     return (((var18) & 1) != 0);
                  }
               case 355504491:
                  var10000 = ((byte) (var17.equals((String)recovery$indy$flow$362(6230, 8705286514639075171L ^ var2)) ? 1 : 0));
                  if (var2 > 0L) {
                     if (var15 != 0) {
                        if (var10000 != 0) {
                           var18 = 2;
                        }

                        var10000 = var18;
                     }

                     if (var15 != 0) {
                        switch (var10000) {
                           case 0:
                              ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                                 .method_42$f0ddb617a2(
                                    var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                                 );
                              break;
                           case 1:
                              ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                              break;
                           case 2:
                              ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                        }

                        recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                        this.field_438 = recovery$indy$flow$382(
                           net.C_476q.field_48,
                           var9,
                           recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                           recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                           -3872091127768984880L,
                           var2
                        );
                        var10000 = 1;
                     }

                     return (((var10000) & 1) != 0);
                  }

                  if (var15 != 0) {
                     switch (var10000) {
                        case 0:
                           ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                              .method_42$f0ddb617a2(
                                 var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                              );
                           break;
                        case 1:
                           ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                           recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                           this.field_438 = recovery$indy$flow$382(
                              net.C_476q.field_48,
                              var9,
                              recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                              recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                              -3872091127768984880L,
                              var2
                           );
                           break;
                        case 2:
                           ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                           recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                           this.field_438 = recovery$indy$flow$382(
                              net.C_476q.field_48,
                              var9,
                              recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                              recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                              -3872091127768984880L,
                              var2
                           );
                           break;
                        default:
                           recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                           this.field_438 = recovery$indy$flow$382(
                              net.C_476q.field_48,
                              var9,
                              recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                              recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                              -3872091127768984880L,
                              var2
                           );
                     }

                     var10000 = 1;
                  }

                  return (((var10000) & 1) != 0);
               default:
                  if (var15 != 0) {
                     switch (var18) {
                        case 0:
                           ((net.C_40g)recovery$indy$flow$365(field_43, -3871387670364465092L, var2))
                              .method_42$f0ddb617a2(
                                 var1.field_46M.field_43, var4, 0, 0, (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$369(field_43, -3872002319107303717L, var2)
                              );
                           if (var2 > 0L) {
                              recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                              this.field_438 = recovery$indy$flow$382(
                                 net.C_476q.field_48,
                                 var9,
                                 recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                                 recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                                 -3872091127768984880L,
                                 var2
                              );
                              return true;
                           }

                           return true;
                        case 1:
                           ((client.Client)recovery$indy$flow$371(-3871038341002865334L, var2)).getClass();
                           recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                           this.field_438 = recovery$indy$flow$382(
                              net.C_476q.field_48,
                              var9,
                              recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                              recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                              -3872091127768984880L,
                              var2
                           );
                           return true;
                        case 2:
                           ((client.Client)recovery$indy$flow$373(-3871038341002865334L, var2)).getClass();
                           recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                           this.field_438 = recovery$indy$flow$382(
                              net.C_476q.field_48,
                              var9,
                              recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                              recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                              -3872091127768984880L,
                              var2
                           );
                           return true;
                        default:
                           recovery$indy$flow$376(this.field_49, -3872228368745486366L, var2);
                           this.field_438 = recovery$indy$flow$382(
                              net.C_476q.field_48,
                              var9,
                              recovery$indy$flow$379(this.settingDelay, var7, -3872774960936151270L, var2),
                              recovery$indy$flow$381(this.settingDelay, var5, -3871797686408527985L, var2),
                              -3872091127768984880L,
                              var2
                           );
                           return true;
                     }
                  } else {
                     return (((var18) & 1) != 0);
                  }
            }
         }
      }
   }





   private boolean method_46$1dca3900f8(net.C_47ps var1, long var2, int var4, int var5) {
      var2 = a ^ var2;
      long var6 = var2 ^ 115832769169867L;
      long var8 = var2 ^ 82375508763724L;
      long var10 = var2 ^ 70185904837724L;
      byte var12 = ((byte) (recovery$indy$115(-4834235442286915097L, var2) ? 1 : 0));
      int var76 = var12;
      int var13 = this.field_43y;
      if (var76 != 0) {
         return (var13 != 0);
      }

      var13 = var13;
      long var106;
      var76 = (var106 = var2 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
      int var20 = var5;
      var13 = var13;
      if (var76 > 0) {
         var20 = var20;
         var13 = var13;
         var20 = var20;
         var13 = var13;
         int var78 = var20;
         var76 = var13;
         if (var76 != var78) {
            return false;
         }

         byte var10000 = ((byte) (recovery$indy$116(this, var1, var4, var10, -4833976765808670708L, var2) ? 1 : 0));
         var20 = var12;
         var13 = var10000;
      }

      long var107;
      var76 = (var107 = var2 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
      var20 = var20;
      var13 = var13;
      if (var76 > 0) {
         var20 = var20;
         var13 = var13;
         var76 = var20;
         var13 = var13;
         if (var76 == 0) {
            var13 = var13;
            var13 = var13;
            var76 = var13;
            if (var76 != 0) {
               this.field_43y++;
               this.field_43a = true;
            }

            double var108;
            var13 = (var108 = recovery$indy$117(this.settingDelay, var8, -4834042088701369935L, var2) - 0.0) == 0.0 ? 0 : (var108 < 0.0 ? -1 : 1);
         }

         var20 = var12;
         var13 = var13;
      }

      var76 = var20;
      var13 = var13;
      if (var76 == 0) {
         var13 = var13;
         var76 = var13;
         if (var76 == 0) {
            double var109;
            var13 = (var109 = recovery$indy$118(this.settingDelay, var6, -4832442249977149148L, var2) - 0.0) == 0.0 ? 0 : (var109 < 0.0 ? -1 : 1);
            var13 = var13;
            var76 = var13;
            if (!(var76 != 0)) {
               return false;
            }
         }

         var13 = 1;
      }

      return (var13 != 0);
   }



    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   private double method_42$1f63327a81(C_47rf var1, long var2) {
      var2 = a ^ var2;
      boolean var4 = recovery$indy$119(3931586299044075813L, var2);
      double var5 = 0.0;
      if (var4) {
         if (!(var1.method_48$dbd570a038() instanceof C_45V)) {
            return var5;
         }

         var5 += ((C_45V)var1.method_48$dbd570a038()).method_40$bc607678b6() + C_47ru.method_47$6eb1f4c276(C_47DW.field_488.field_48X, var1) * 1.25F;
         var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_48A.field_48X, var1) / 11.0;
         var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_45.field_48X, var1) / 11.0;
      }

      var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_46.field_48X, var1) / 11.0;
      return var5;
   }



   private boolean method_42$f05f9652dc(C_47ps var1, C_47qP var2, int var3, int var4, short var5, char var6, int var7) {
      long var8 = ((long)var5 << 48 | (long)var6 << 48 >>> 16 | (long)var7 << 32 >>> 32) ^ a;
      long var10 = var8 ^ 72626688371413L;
      long var12 = var8 ^ 16322073766126L;
      long var14 = var8 ^ 107474410096466L;
      long var16 = var8 ^ 87961714571108L;
      boolean var18 = recovery$indy$120(-2308249639492783367L, var8);
      int var10000 = this.field_43y;
      if (!var18) {
         if (this.field_43y == var4) {
            C_43r var21;
            label71: {
               C_47qP var10002 = var2;
               if (!var18) {
                  if (var2 == null) {
                     var21 = null;
                     break label71;
                  }

                  var10002 = var2;
               }

               var21 = var10002.field_41;
            }

            boolean var10001;
            label65: {
               int var19 = recovery$indy$121(this, var1, var21, var3, var16, -2309793765473124318L, var8);
               var10000 = var19;
               label64:
               if (!var18) {
                  if (var19 > 0) {
                     var10000 = ((int) (recovery$indy$122(this, var1, var12, var19, -2310064588856300126L, var8) ? 1 : 0));
                     var10001 = var18;
                     if (var7 > 0) {
                        break label65;
                     }

                     if (var18) {
                        break label64;
                     }

                     if (var10000 != 0) {
                        this.field_43y++;
                        this.field_43a = true;
                     }
                  }

                  double var22;
                  var10000 = (var22 = recovery$indy$123(this.settingDelay, var14, -2309182218153262417L, var8) - 0.0) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
               }

               var10001 = var18;
            }

            if (!var10001) {
               if (var10000 == 0) {
                  double var23;
                  var10000 = (var23 = recovery$indy$124(this.settingDelay, var10, -2309893385227556294L, var8) - 0.0) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
                  if (var18) {
                     return var10000 != 0;
                  }

                  if (var10000 == 0) {
                     return false;
                  }
               }

               var10000 = 1;
            }

            return var10000 != 0;
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }




   private boolean method_42$e3d106ba24(net.C_47ps var1, int var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 97738599882956L;
      long var7 = var3 ^ 135611100532043L;
      long var9 = var3 ^ 22631019835999L;
      long var11 = var3 ^ 127766671233559L;
      long var13 = var3 ^ 130143785177109L;
      long var10000 = 1580316824894650592L;
      byte var15 = ((byte) (AirStuck_47Q4.method_419$aae029aa0a() ? 1 : 0));
      long var10001 = 1580754940045953399L;
      net.minecraft.client.Minecraft var28 = field_43;
      net.C_47rf var187 = var28.field_42P.field_42X.method_41$ac4db64966();
      if (var15 != 0) {
         int var65 = var187.field_47;
         net.C_47sT var66 = (net.C_47sT)var1.field_46M.field_46.get(var2);
         long var278 = 1580457889082678281L;
         long var95 = var13;
         client.setting.ModeSetting var98 = this.settingClickMode;
         String var71 = var98.method_46$5f9dc63072(var95);
         byte var76 = -1;
         int var211 = var71.hashCode();
         if (var15 == 0) {
            switch (var211) {
               case 0:
                  var10001 = 1579086941983704976L;
                  net.minecraft.client.Minecraft var101 = field_43;
                  int var297 = var65;
                  if (var3 > 0L) {
                     if (var15 == 0) {
                        var297 = var65 == 1 ? 0 : 1;
                     }

                     long var343 = 1580754940045953399L;
                     net.minecraft.client.Minecraft var105 = field_43;
                     var101.field_44K.method_42$f0ddb617a2(var1.field_46M.field_43, var2, var297, 0, var105.field_42P);
                     long var345;
                     int var217 = (var345 = var3 - 0L) == 0L ? 0 : (var345 < 0L ? -1 : 1);
                     var10000 = 1579450078994074342L;
                     client.Client.method_44$fbc0c0be91().getClass();
                     long var346;
                     int var219 = (var346 = var3 - 0L) == 0L ? 0 : (var346 < 0L ? -1 : 1);
                     var10000 = 1579450078994074342L;
                     client.Client.method_44$fbc0c0be91().getClass();
                     var10001 = 1580497977712113742L;
                     net.C_47cu var114 = this.field_49;
                     var114.method_46$da8c82d5d4();
                     net.C_47MO var264 = net.C_476q.field_48;
                     long var317 = 1579982716766734518L;
                     long var123 = var7;
                     net.C_47TU var132 = this.settingDelay;
                     double var299 = var132.method_41$474dfaa627(var123);
                     var343 = 1578659954834563107L;
                     long var141 = var5;
                     net.C_47TU var150 = this.settingDelay;
                     double var318 = var150.method_43$474dfaa627(var141);
                     long var330 = 1580635906952367484L;
                     double var159 = var318;
                     double var168 = var299;
                     long var177 = var9;
                     net.C_47MO var186 = var264;
                     this.field_438 = var186.method_41$07400418b0(var177, var168, var159);
                     return true;
                  } else {
                     var297 = var65 == var15 ? 0 : 1;
                     long var342 = 1580754940045953399L;
                     net.minecraft.client.Minecraft var104 = field_43;
                     var101.field_44K.method_42$f0ddb617a2(var1.field_46M.field_43, var2, var297, 0, var104.field_42P);
                     if (var3 >= 0L) {
                        var10000 = 1579450078994074342L;
                        client.Client.method_44$fbc0c0be91().getClass();
                        long var347;
                        int var216 = (var347 = var3 - 0L) == 0L ? 0 : (var347 < 0L ? -1 : 1);
                        return true;
                     }

                     return true;
                  }
               case 1:
                  var10000 = 1579450078994074342L;
                  client.Client.method_44$fbc0c0be91().getClass();
                  if (var3 > 0L) {
                     var10000 = 1579450078994074342L;
                     client.Client.method_44$fbc0c0be91().getClass();
                     var10001 = 1580497977712113742L;
                     net.C_47cu var113 = this.field_49;
                     var113.method_46$da8c82d5d4();
                     net.C_47MO var261 = net.C_476q.field_48;
                     long var315 = 1579982716766734518L;
                     long var122 = var7;
                     net.C_47TU var131 = this.settingDelay;
                     double var296 = var131.method_41$474dfaa627(var122);
                     long var341 = 1578659954834563107L;
                     long var140 = var5;
                     net.C_47TU var149 = this.settingDelay;
                     double var316 = var149.method_43$474dfaa627(var140);
                     long var329 = 1580635906952367484L;
                     double var158 = var316;
                     double var167 = var296;
                     long var176 = var9;
                     net.C_47MO var185 = var261;
                     this.field_438 = var185.method_41$07400418b0(var176, var167, var158);
                     return true;
                  }

                  return true;
               case 2:
                  var10000 = 1579450078994074342L;
                  client.Client.method_44$fbc0c0be91().getClass();
                  var10001 = 1580497977712113742L;
                  net.C_47cu var112 = this.field_49;
                  var112.method_46$da8c82d5d4();
                  net.C_47MO var259 = net.C_476q.field_48;
                  long var313 = 1579982716766734518L;
                  long var121 = var7;
                  net.C_47TU var130 = this.settingDelay;
                  double var295 = var130.method_41$474dfaa627(var121);
                  long var340 = 1578659954834563107L;
                  long var139 = var5;
                  net.C_47TU var148 = this.settingDelay;
                  double var314 = var148.method_43$474dfaa627(var139);
                  long var328 = 1580635906952367484L;
                  double var157 = var314;
                  double var166 = var295;
                  long var175 = var9;
                  net.C_47MO var184 = var259;
                  this.field_438 = var184.method_41$07400418b0(var175, var166, var157);
                  return true;
               default:
                  var10001 = 1580497977712113742L;
                  net.C_47cu var111 = this.field_49;
                  var111.method_46$da8c82d5d4();
                  net.C_47MO var257 = net.C_476q.field_48;
                  long var311 = 1579982716766734518L;
                  long var120 = var7;
                  net.C_47TU var129 = this.settingDelay;
                  double var294 = var129.method_41$474dfaa627(var120);
                  long var339 = 1578659954834563107L;
                  long var138 = var5;
                  net.C_47TU var147 = this.settingDelay;
                  double var312 = var147.method_43$474dfaa627(var138);
                  long var327 = 1580635906952367484L;
                  double var156 = var312;
                  double var165 = var294;
                  long var174 = var9;
                  net.C_47MO var183 = var257;
                  this.field_438 = var183.method_41$07400418b0(var174, var165, var156);
                  return true;
            }
         } else {
            return (((var211) & 1) != 0);
         }
      } else {
         if (var187 == null) {
            return false;
         }

         var10001 = 1580754940045953399L;
         net.minecraft.client.Minecraft var29 = field_43;
         int var16 = var29.field_42P.field_42X.method_41$ac4db64966().field_47;
         net.C_47sT var17 = (net.C_47sT)var1.field_46M.field_46.get(var2);
         var10001 = 1578927156902770318L;
         client.setting.BooleanSetting var30 = this.settingSmartDelay;
         byte var188 = ((byte) (var30.method_49$aae029aa0a() ? 1 : 0));
         if (var3 > 0L) {
            label481: {
               if (var188 != 0) {
                  double var69 = Math.abs(var17.field_40 + 2 + var1.field_46c - var1.field_45[0]);
                  double var77 = Math.abs(var17.field_46 + 2 + var1.field_433 - var1.field_45[1]);
                  double var78 = Math.sqrt(var69 * var69 + var77 * var77);
                  long var273 = 1579982716766734518L;
                  long var81 = var7;
                  net.C_47TU var82 = this.settingDelay;
                  double var203 = var82.method_41$474dfaa627(var81);
                  long var289 = 1578659954834563107L;
                  long var83 = var5;
                  net.C_47TU var84 = this.settingDelay;
                  double var204 = var203 + var84.method_43$474dfaa627(var83);
                  var289 = 1579982716766734518L;
                  long var85 = var7;
                  net.C_47TU var86 = this.settingDelay;
                  double var79 = var204 - var86.method_41$474dfaa627(var85) / 2.0;
                  double var80 = var78 / 30.0;
                  long var348;
                  int var247 = (var348 = var3 - 0L) == 0L ? 0 : (var348 < 0L ? -1 : 1);
                  if (var15 != 0) {
                     break label481;
                  }

                  if (var78 > 36.0) {
                     var10001 = (long)(var79 * var80);
                     var289 = 1579165808443655303L;
                     long var88 = var11;
                     long var90 = var10001;
                     net.C_47cu var92 = this.field_49;
                     boolean var205 = var92.method_42$b0e346e6e3(var90, var88);
                     long var349;
                     int var249 = (var349 = var3 - 0L) == 0L ? 0 : (var349 < 0L ? -1 : 1);
                     if (!var205) {
                        return false;
                     }
                  }
               }

               var1.field_45 = new double[]{var17.field_40 + 2 + var1.field_46c, var17.field_46 + 2 + var1.field_433};
            }

            long var274 = 1580457889082678281L;
            long var94 = var13;
            client.setting.ModeSetting var97 = this.settingClickMode;
            String var70 = var97.method_46$5f9dc63072(var94);
            byte var75 = -1;
            byte var206;
            switch (var70.hashCode()) {
               case 63955982:
                  if (var70.equals("Basic")) {
                     var75 = 0;
                     long var353;
                     int var251 = (var353 = var3 - 0L) == 0L ? 0 : (var353 < 0L ? -1 : 1);
                     if (var15 != 0 && var70.equals("Other")) {
                        var75 = 1;
                        long var354;
                        int var252 = (var354 = var3 - 0L) == 0L ? 0 : (var354 < 0L ? -1 : 1);
                        if (var15 != 0) {
                           var206 = ((byte) (var70.equals("Exploit") ? 1 : 0));
                           long var355;
                           int var277 = (var355 = var3 - 0L) == 0L ? 0 : (var355 < 0L ? -1 : 1);
                           if (var15 != 0) {
                              break;
                           }

                           if (var206 != 0) {
                              var75 = 2;
                           }
                        }
                     }
                  }

                  var206 = var75;
                  break;
               case 76517104:
                  if (var70.equals("Other")) {
                     var75 = 1;
                     long var351;
                     int var250 = (var351 = var3 - 0L) == 0L ? 0 : (var351 < 0L ? -1 : 1);
                     if (var15 != 0) {
                        var206 = ((byte) (var70.equals("Exploit") ? 1 : 0));
                        long var352;
                        int var276 = (var352 = var3 - 0L) == 0L ? 0 : (var352 < 0L ? -1 : 1);
                        if (var15 != 0) {
                           break;
                        }

                        if (var206 != 0) {
                           var75 = 2;
                        }
                     }
                  }

                  var206 = var75;
                  break;
               case 355504491:
                  var206 = ((byte) (var70.equals("Exploit") ? 1 : 0));
                  long var350;
                  int var275 = (var350 = var3 - 0L) == 0L ? 0 : (var350 < 0L ? -1 : 1);
                  if (var15 == 0) {
                     if (var206 != 0) {
                        var75 = 2;
                     }

                     var206 = var75;
                  }
                  break;
               default:
                  var206 = var75;
            }

            if (var15 == 0) {
               switch (var206) {
                  case 0:
                     var10001 = 1579086941983704976L;
                     net.minecraft.client.Minecraft var100 = field_43;
                     int var292 = var16;
                     long var357;
                     int var325 = (var357 = var3 - 0L) == 0L ? 0 : (var357 < 0L ? -1 : 1);
                     if (var15 == 0) {
                        var292 = var16 == 1 ? 0 : 1;
                     }

                     long var337 = 1580754940045953399L;
                     net.minecraft.client.Minecraft var103 = field_43;
                     var100.field_44K.method_42$f0ddb617a2(var1.field_46M.field_43, var2, var292, 0, var103.field_42P);
                     long var358;
                     int var210 = (var358 = var3 - 0L) == 0L ? 0 : (var358 < 0L ? -1 : 1);
                     break;
                  case 1:
                     var10000 = 1579450078994074342L;
                     client.Client.method_44$fbc0c0be91().getClass();
                     long var356;
                     int var209 = (var356 = var3 - 0L) == 0L ? 0 : (var356 < 0L ? -1 : 1);
                     break;
                  case 2:
                     var10000 = 1579450078994074342L;
                     client.Client.method_44$fbc0c0be91().getClass();
               }

               var10001 = 1580497977712113742L;
               net.C_47cu var110 = this.field_49;
               var110.method_46$da8c82d5d4();
               net.C_47MO var255 = net.C_476q.field_48;
               long var309 = 1579982716766734518L;
               long var119 = var7;
               net.C_47TU var128 = this.settingDelay;
               double var293 = var128.method_41$474dfaa627(var119);
               long var338 = 1578659954834563107L;
               long var137 = var5;
               net.C_47TU var146 = this.settingDelay;
               double var310 = var146.method_43$474dfaa627(var137);
               long var326 = 1580635906952367484L;
               double var155 = var310;
               double var164 = var293;
               long var173 = var9;
               net.C_47MO var182 = var255;
               this.field_438 = var182.method_41$07400418b0(var173, var164, var155);
               var206 = 1;
            }

            return (((var206) & 1) != 0);
         } else {
            double var18 = Math.abs(var188 - var1.field_45[0]);
            double var20 = Math.abs(var17.field_46 + 2 + var1.field_433 - var1.field_45[1]);
            double var22 = Math.sqrt(var18 * var18 + var20 * var20);
            long var10002 = 1579982716766734518L;
            long var31 = var7;
            net.C_47TU var33 = this.settingDelay;
            double var189 = var33.method_41$474dfaa627(var31);
            long var10003 = 1578659954834563107L;
            long var34 = var5;
            net.C_47TU var36 = this.settingDelay;
            double var190 = var189 + var36.method_43$474dfaa627(var34);
            var10003 = 1579982716766734518L;
            long var37 = var7;
            net.C_47TU var39 = this.settingDelay;
            double var24 = var190 - var39.method_41$474dfaa627(var37) / 2.0;
            double var26 = var22 / 30.0;
            if (var3 >= 0L) {
               if (var15 == 0) {
                  if (var22 > 36.0) {
                     var10001 = (long)(var24 * var26);
                     var10003 = 1579165808443655303L;
                     long var87 = var11;
                     long var89 = var10001;
                     net.C_47cu var91 = this.field_49;
                     boolean var202 = var91.method_42$b0e346e6e3(var89, var87);
                     long var359;
                     int var246 = (var359 = var3 - 0L) == 0L ? 0 : (var359 < 0L ? -1 : 1);
                     return var202;
                  }

                  var1.field_45 = new double[]{var17.field_40 + 2 + var1.field_46c, var17.field_46 + 2 + var1.field_433};
               }

               var10002 = 1580457889082678281L;
               long var93 = var13;
               client.setting.ModeSetting var96 = this.settingClickMode;
               String var68 = var96.method_46$5f9dc63072(var93);
               byte var74 = -1;
               byte var197;
               byte var234;
               switch (var68.hashCode()) {
                  case 63955982:
                     if (var68.equals("Basic")) {
                        var74 = 0;
                        long var363;
                        int var236 = (var363 = var3 - 0L) == 0L ? 0 : (var363 < 0L ? -1 : 1);
                        if (var15 != 0 && var68.equals("Other")) {
                           var74 = 1;
                           long var364;
                           int var237 = (var364 = var3 - 0L) == 0L ? 0 : (var364 < 0L ? -1 : 1);
                           if (var15 != 0) {
                              var197 = ((byte) (var68.equals("Exploit") ? 1 : 0));
                              var234 = var15;
                              long var365;
                              int var272 = (var365 = var3 - 0L) == 0L ? 0 : (var365 < 0L ? -1 : 1);
                              break;
                           }
                        }
                     }

                     var197 = var74;
                     var234 = var15;
                     break;
                  case 76517104:
                     if (var68.equals("Other")) {
                        var74 = 1;
                        long var361;
                        int var235 = (var361 = var3 - 0L) == 0L ? 0 : (var361 < 0L ? -1 : 1);
                        if (var15 != 0) {
                           var197 = ((byte) (var68.equals("Exploit") ? 1 : 0));
                           var234 = var15;
                           long var362;
                           int var271 = (var362 = var3 - 0L) == 0L ? 0 : (var362 < 0L ? -1 : 1);
                           break;
                        }
                     }

                     var197 = var74;
                     var234 = var15;
                     break;
                  case 355504491:
                     var197 = ((byte) (var68.equals("Exploit") ? 1 : 0));
                     var234 = var15;
                     long var360;
                     int var270 = (var360 = var3 - 0L) == 0L ? 0 : (var360 < 0L ? -1 : 1);
                     break;
                  default:
                     var197 = var74;
                     var234 = var15;
               }

               if (var234 == 0) {
                  switch (var197) {
                     case 0:
                        var10001 = 1579086941983704976L;
                        net.minecraft.client.Minecraft var99 = field_43;
                        long var367;
                        int var323 = (var367 = var3 - 0L) == 0L ? 0 : (var367 < 0L ? -1 : 1);
                        int var286 = var16 == var15 ? 0 : 1;
                        long var335 = 1580754940045953399L;
                        net.minecraft.client.Minecraft var102 = field_43;
                        var99.field_44K.method_42$f0ddb617a2(var1.field_46M.field_43, var2, var286, 0, var102.field_42P);
                        long var368;
                        int var201 = (var368 = var3 - 0L) == 0L ? 0 : (var368 < 0L ? -1 : 1);
                        var10001 = 1580497977712113742L;
                        net.C_47cu var109 = this.field_49;
                        var109.method_46$da8c82d5d4();
                        net.C_47MO var244 = net.C_476q.field_48;
                        long var307 = 1579982716766734518L;
                        long var118 = var7;
                        net.C_47TU var127 = this.settingDelay;
                        double var287 = var127.method_41$474dfaa627(var118);
                        var335 = 1578659954834563107L;
                        long var136 = var5;
                        net.C_47TU var145 = this.settingDelay;
                        double var308 = var145.method_43$474dfaa627(var136);
                        long var324 = 1580635906952367484L;
                        double var154 = var308;
                        double var163 = var287;
                        long var172 = var9;
                        net.C_47MO var181 = var244;
                        this.field_438 = var181.method_41$07400418b0(var172, var163, var154);
                        break;
                     case 1:
                        var10000 = 1579450078994074342L;
                        client.Client.method_44$fbc0c0be91().getClass();
                        long var366;
                        int var200 = (var366 = var3 - 0L) == 0L ? 0 : (var366 < 0L ? -1 : 1);
                        break;
                     case 2:
                        var10000 = 1579450078994074342L;
                        client.Client.method_44$fbc0c0be91().getClass();
                        var10001 = 1580497977712113742L;
                        net.C_47cu var108 = this.field_49;
                        var108.method_46$da8c82d5d4();
                        net.C_47MO var241 = net.C_476q.field_48;
                        long var305 = 1579982716766734518L;
                        long var117 = var7;
                        net.C_47TU var126 = this.settingDelay;
                        double var285 = var126.method_41$474dfaa627(var117);
                        long var334 = 1578659954834563107L;
                        long var135 = var5;
                        net.C_47TU var144 = this.settingDelay;
                        double var306 = var144.method_43$474dfaa627(var135);
                        long var322 = 1580635906952367484L;
                        double var153 = var306;
                        double var162 = var285;
                        long var171 = var9;
                        net.C_47MO var180 = var241;
                        this.field_438 = var180.method_41$07400418b0(var171, var162, var153);
                        break;
                     default:
                        var10001 = 1580497977712113742L;
                        net.C_47cu var107 = this.field_49;
                        var107.method_46$da8c82d5d4();
                        net.C_47MO var239 = net.C_476q.field_48;
                        long var303 = 1579982716766734518L;
                        long var116 = var7;
                        net.C_47TU var125 = this.settingDelay;
                        double var284 = var125.method_41$474dfaa627(var116);
                        long var333 = 1578659954834563107L;
                        long var134 = var5;
                        net.C_47TU var143 = this.settingDelay;
                        double var304 = var143.method_43$474dfaa627(var134);
                        long var321 = 1580635906952367484L;
                        double var152 = var304;
                        double var161 = var284;
                        long var170 = var9;
                        net.C_47MO var179 = var239;
                        this.field_438 = var179.method_41$07400418b0(var170, var161, var152);
                  }

                  var197 = 1;
               }

               return (((var197) & 1) != 0);
            } else {
               if (var15 > 0) {
                  var10001 = (long)(var24 * var26);
                  var10003 = 1579165808443655303L;
                  long var40 = var11;
                  long var42 = var10001;
                  net.C_47cu var44 = this.field_49;
                  boolean var196 = var44.method_42$b0e346e6e3(var42, var40);
                  long var369;
                  int var233 = (var369 = var3 - 0L) == 0L ? 0 : (var369 < 0L ? -1 : 1);
                  return var196;
               }

               var1.field_45 = new double[]{var17.field_40 + 2 + var1.field_46c, var17.field_46 + 2 + var1.field_433};
               var10002 = 1580457889082678281L;
               long var45 = var13;
               client.setting.ModeSetting var47 = this.settingClickMode;
               String var67 = var47.method_46$5f9dc63072(var45);
               byte var19 = -1;
               byte var191;
               byte var223;
               switch (var67.hashCode()) {
                  case 63955982:
                     if (var67.equals("Basic")) {
                        var19 = 0;
                        long var373;
                        int var225 = (var373 = var3 - 0L) == 0L ? 0 : (var373 < 0L ? -1 : 1);
                        if (var15 != 0) {
                           boolean var73 = true;
                           var191 = var15;
                           long var374;
                           int var226 = (var374 = var3 - 0L) == 0L ? 0 : (var374 < 0L ? -1 : 1);
                           var223 = var15;
                           long var375;
                           int var268 = (var375 = var3 - 0L) == 0L ? 0 : (var375 < 0L ? -1 : 1);
                           break;
                        }
                     }

                     var191 = var19;
                     var223 = var15;
                     break;
                  case 76517104:
                     if (var67.equals("Other")) {
                        boolean var72 = true;
                        var191 = var15;
                        long var371;
                        int var224 = (var371 = var3 - 0L) == 0L ? 0 : (var371 < 0L ? -1 : 1);
                        var223 = var15;
                        long var372;
                        int var267 = (var372 = var3 - 0L) == 0L ? 0 : (var372 < 0L ? -1 : 1);
                     } else {
                        var191 = var19;
                        var223 = var15;
                     }
                     break;
                  case 355504491:
                     var191 = ((byte) (var67.equals("Exploit") ? 1 : 0));
                     var223 = var15;
                     long var370;
                     int var266 = (var370 = var3 - 0L) == 0L ? 0 : (var370 < 0L ? -1 : 1);
                     break;
                  default:
                     var191 = var19;
                     var223 = var15;
               }

               if (var223 == 0) {
                  switch (var191) {
                     case 0:
                        var10001 = 1579086941983704976L;
                        net.minecraft.client.Minecraft var48 = field_43;
                        long var377;
                        int var320 = (var377 = var3 - 0L) == 0L ? 0 : (var377 < 0L ? -1 : 1);
                        int var282 = var16 == var15 ? 0 : 1;
                        long var332 = 1580754940045953399L;
                        net.minecraft.client.Minecraft var49 = field_43;
                        var48.field_44K.method_42$f0ddb617a2(var1.field_46M.field_43, var2, var282, 0, var49.field_42P);
                        long var378;
                        int var195 = (var378 = var3 - 0L) == 0L ? 0 : (var378 < 0L ? -1 : 1);
                        break;
                     case 1:
                        var10000 = 1579450078994074342L;
                        client.Client.method_44$fbc0c0be91().getClass();
                        long var376;
                        int var194 = (var376 = var3 - 0L) == 0L ? 0 : (var376 < 0L ? -1 : 1);
                        break;
                     case 2:
                        var10000 = 1579450078994074342L;
                        client.Client.method_44$fbc0c0be91().getClass();
                        var10001 = 1580497977712113742L;
                        net.C_47cu var106 = this.field_49;
                        var106.method_46$da8c82d5d4();
                        net.C_47MO var230 = net.C_476q.field_48;
                        long var301 = 1579982716766734518L;
                        long var115 = var7;
                        net.C_47TU var124 = this.settingDelay;
                        double var281 = var124.method_41$474dfaa627(var115);
                        long var331 = 1578659954834563107L;
                        long var133 = var5;
                        net.C_47TU var142 = this.settingDelay;
                        double var302 = var142.method_43$474dfaa627(var133);
                        long var319 = 1580635906952367484L;
                        double var151 = var302;
                        double var160 = var281;
                        long var169 = var9;
                        net.C_47MO var178 = var230;
                        this.field_438 = var178.method_41$07400418b0(var169, var160, var151);
                        break;
                     default:
                        var10001 = 1580497977712113742L;
                        net.C_47cu var50 = this.field_49;
                        var50.method_46$da8c82d5d4();
                        net.C_47MO var228 = net.C_476q.field_48;
                        long var10004 = 1579982716766734518L;
                        long var51 = var7;
                        net.C_47TU var53 = this.settingDelay;
                        double var280 = var53.method_41$474dfaa627(var51);
                        long var10006 = 1578659954834563107L;
                        long var54 = var5;
                        net.C_47TU var56 = this.settingDelay;
                        double var300 = var56.method_43$474dfaa627(var54);
                        long var10005 = 1580635906952367484L;
                        double var57 = var300;
                        double var59 = var280;
                        long var61 = var9;
                        net.C_47MO var63 = var228;
                        this.field_438 = var63.method_41$07400418b0(var61, var59, var57);
                  }

                  var191 = 1;
               }

               return (((var191) & 1) != 0);
            }
         }
      }
   }






    private static native java.lang.reflect.Method d(long a0,long a1);

   private net.C_42a method_41$91ded0d267(net.C_47ps var1, long var2) {
        int var37;
        net.C_47rf var42;
        net.C_47rf var45;
      var2 = a ^ var2;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var10000 = ((int) (recovery$indy$flow$507(-5957418412149439752L, var2) ? 1 : 0));
      int var8 = 0;
      byte var4 = (byte)var10000;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      if (var14 < var1.field_46M.field_46.size()) {
         net.C_47rf var22 = ((net.C_47sT)var1.field_46M.field_46.get(var14)).method_48$ac4db64966();
         var10000 = var4;
         if (var2 > 0L) {
            while (true) {
               if (var10000 == 0 || var14 == 0) {
                  var22 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$517(field_43, -5957273138162454069L, var2)).field_42X.method_41$ac4db64966();
               }

               label623: {
                  net.C_47rf var55 = var22;
                  if (var4 != 0) {
                     if (var22 == null) {
                        if (var14 < 10) {
                           break label623;
                        }

                        var5++;
                        if (var4 != 0) {
                           break label623;
                        }
                     }

                     var55 = var22;
                  }

                  net.C_43r var33 = var55.method_48$dbd570a038();
                  var10000 = ((int) (var33.equals(net.C_42R.field_45p) ? 1 : 0));
                  if (var4 != 0) {
                     if (var10000 != 0) {
                        var6++;
                        var10 += var22.field_47;
                        if (var4 != 0) {
                           break label623;
                        }
                     }

                     var10000 = ((int) (var33.equals(net.C_42R.field_41y) ? 1 : 0));
                  }

                  if (var4 != 0) {
                     if (var10000 != 0) {
                        var8++;
                        var12 += var22.field_47;
                        if (var4 != 0) {
                           break label623;
                        }
                     }

                     var10000 = ((int) (var33.equals(net.C_42R.field_41c) ? 1 : 0));
                  }

                  if (var4 != 0) {
                     if (var10000 != 0) {
                        var7++;
                        var11 += var22.field_47;
                        if (var4 != 0) {
                           break label623;
                        }
                     }

                     var10000 = ((int) (var33.equals(net.C_43r.method_46$4158f44b4a(5)) ? 1 : 0));
                  }

                  if (var4 != 0) {
                     if (var10000 == 0) {
                        break label623;
                     }

                     var9++;
                     var10000 = var13 + var22.field_47;
                  }

                  var13 = var10000;
               }

               if (var4 == 0 || ++var14 >= var1.field_46M.field_46.size()) {
                  java.util.HashMap var20 = new java.util.HashMap();
                  var20.put(net.C_47qP.DIAMOND, var6);
                  var20.put(net.C_47qP.IRON, var8);
                  var20.put(net.C_47qP.STICKS, var7);
                  var20.put(net.C_47qP.PLANKS, var9);
                  var20.put(net.C_47qP.AIR, var5);
                  java.util.HashMap var27 = new java.util.HashMap();
                  var27.put(net.C_47qP.DIAMOND, var10);
                  var27.put(net.C_47qP.IRON, var12);
                  var27.put(net.C_47qP.STICKS, var11);
                  var27.put(net.C_47qP.PLANKS, var13);
                  return new net.C_42a(var20, var27);
               }

               var22 = ((net.C_47sT)var1.field_46M.field_46.get(var14)).method_48$ac4db64966();
               var10000 = var4;
            }
         } else {
            if (var4 == 0) {
               var22 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$517(field_43, -5957273138162454069L, var2)).field_42X.method_41$ac4db64966();
            }

            label624: {
               net.C_47rf var39 = var22;
               if (var4 != 0) {
                  if (var22 == null) {
                     var10000 = var14;
                     if (var2 < 0L) {
                        while (true) {
                           var22 = ((net.C_47sT)(var10000 != 0 && var14 < var1.field_46M.field_46.size() ? var1.field_46M.field_46.get(var14) : new java.util.HashMap()))
                              .method_48$ac4db64966();
                           if (var4 == 0) {
                              var22 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$517(field_43, -5957273138162454069L, var2)).field_42X.method_41$ac4db64966();
                           }

                           net.C_47rf var53 = var22;
                           if (var4 != 0) {
                              if (var22 == null) {
                                 var10000 = var14;
                                 continue;
                              }

                              var53 = var22;
                           }

                           label465: {
                              net.C_43r var32 = var53.method_48$dbd570a038();
                              var10000 = ((int) (var32.equals(net.C_42R.field_45p) ? 1 : 0));
                              if (var4 != 0) {
                                 if (var10000 == 0) {
                                    break label465;
                                 }

                                 var9++;
                                 var10000 = var13 + var22.field_47;
                              }

                              var13 = var10000;
                           }

                           var14++;
                           var10000 = var4;
                        }
                     }

                     while (true) {
                        if (var10000 >= 10) {
                           var5++;
                           int var50 = var4;

                           while (true) {
                              if (var50 == 0 || var14 >= var1.field_46M.field_46.size()) {
                                 break label624;
                              }

                              var22 = ((net.C_47sT)var1.field_46M.field_46.get(var14)).method_48$ac4db64966();
                              if (var4 == 0) {
                                 var22 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$517(field_43, -5957273138162454069L, var2)).field_42X.method_41$ac4db64966();
                              }

                              net.C_47rf var51 = var22;
                              if (var4 != 0) {
                                 if (var22 == null) {
                                    break;
                                 }

                                 var51 = var22;
                              }

                              net.C_43r var31 = var51.method_48$dbd570a038();
                              var50 = ((int) (var31.equals(net.C_42R.field_45p) ? 1 : 0));
                              if (var4 != 0) {
                                 if (var50 != 0) {
                                    var7++;
                                    var11 += var22.field_47;
                                    var50 = var4;
                                    continue;
                                 }

                                 var50 = ((int) (var31.equals(net.C_43r.method_46$4158f44b4a(5)) ? 1 : 0));
                              }

                              label497: {
                                 if (var4 != 0) {
                                    if (var50 == 0) {
                                       break label497;
                                    }

                                    var9++;
                                    var50 = var13 + var22.field_47;
                                 }

                                 var13 = var50;
                              }

                              var14++;
                              var50 = var4;
                           }
                        } else {
                           label518:
                           while (true) {
                              var14++;
                              int var47 = var4;

                              while (true) {
                                 if (var47 == 0 || var14 >= var1.field_46M.field_46.size()) {
                                    break label624;
                                 }

                                 var22 = ((net.C_47sT)var1.field_46M.field_46.get(var14)).method_48$ac4db64966();
                                 if (var4 == 0) {
                                    var22 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$517(field_43, -5957273138162454069L, var2)).field_42X.method_41$ac4db64966();
                                 }

                                 net.C_47rf var48 = var22;
                                 if (var4 != 0) {
                                    if (var22 == null) {
                                       break label518;
                                    }

                                    var48 = var22;
                                 }

                                 net.C_43r var30 = var48.method_48$dbd570a038();
                                 var47 = ((int) (var30.equals(net.C_42R.field_45p) ? 1 : 0));
                                 if (var4 == 0) {
                                    break;
                                 }

                                 if (var47 == 0) {
                                    var47 = ((int) (var30.equals(net.C_43r.method_46$4158f44b4a(5)) ? 1 : 0));
                                    break;
                                 }

                                 var7++;
                                 var11 += var22.field_47;
                                 var47 = var4;
                              }

                              if (var4 != 0) {
                                 if (var47 == 0) {
                                    continue;
                                 }

                                 var9++;
                                 var47 = var13 + var22.field_47;
                              }

                              var13 = var47;
                           }
                        }

                        var10000 = var14;
                     }
                  }

                  var39 = var22;
               }

               net.C_43r var28 = var39.method_48$dbd570a038();
               var10000 = ((int) (var28.equals(net.C_42R.field_45p) ? 1 : 0));
               byte var10001 = var4;
               if (var2 < 0L) {
                  while (true) {
                     label527: {
                        if (var10001 != 0) {
                           if (var10000 == 0) {
                              break label527;
                           }

                           var9++;
                           var10000 = var13 + var22.field_47;
                        }

                        var13 = var10000;
                     }

                     var14++;
                     var10000 = var4;

                     while (true) {
                        var22 = ((net.C_47sT)(var10000 != 0 && var14 < var1.field_46M.field_46.size() ? var1.field_46M.field_46.get(var14) : new java.util.HashMap()))
                           .method_48$ac4db64966();
                        if (var4 == 0) {
                           var22 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$517(field_43, -5957273138162454069L, var2)).field_42X.method_41$ac4db64966();
                        }

                        var45 = var22;
                        if (var4 == 0) {
                           break;
                        }

                        if (var22 != null) {
                           var45 = var22;
                           break;
                        }

                        var10000 = var14;
                     }

                     var28 = ((net.C_47rf) (var45)).method_48$dbd570a038();
                     var10000 = ((int) (var28.equals(net.C_42R.field_45p) ? 1 : 0));
                     var10001 = var4;
                  }
               }

               label588:
               while (true) {
                  label586: {
                     label631: {
                        if (var10001 != 0) {
                           if (var10000 != 0) {
                              var7++;
                              var11 += var22.field_47;
                              byte var43 = var4;

                              while (true) {
                                 if (var43 == 0 || var14 >= var1.field_46M.field_46.size()) {
                                    break label588;
                                 }

                                 var22 = ((net.C_47sT)var1.field_46M.field_46.get(var14)).method_48$ac4db64966();
                                 if (var4 == 0) {
                                    var22 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$517(field_43, -5957273138162454069L, var2)).field_42X.method_41$ac4db64966();
                                 }

                                 var42 = var22;
                                 if (var4 == 0) {
                                    break label586;
                                 }

                                 if (var22 != null) {
                                    break label631;
                                 }

                                 if (var14 >= 10) {
                                    var5++;
                                    var43 = var4;
                                 } else {
                                    var14++;
                                    var43 = var4;
                                 }
                              }
                           }

                           var10000 = ((int) (var28.equals(net.C_43r.method_46$4158f44b4a(5)) ? 1 : 0));
                        }

                        label569: {
                           if (var4 != 0) {
                              if (var10000 == 0) {
                                 break label569;
                              }

                              var9++;
                              var10000 = var13 + var22.field_47;
                           }

                           var13 = var10000;
                        }

                        label579:
                        while (true) {
                           var14++;
                           byte var41 = var4;

                           while (true) {
                              if (var41 == 0 || var14 >= var1.field_46M.field_46.size()) {
                                 break label588;
                              }

                              var22 = ((net.C_47sT)var1.field_46M.field_46.get(var14)).method_48$ac4db64966();
                              if (var4 == 0) {
                                 var22 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$517(field_43, -5957273138162454069L, var2)).field_42X.method_41$ac4db64966();
                              }

                              var42 = var22;
                              if (var4 == 0) {
                                 break label586;
                              }

                              if (var22 != null) {
                                 break label579;
                              }

                              if (var14 < 10) {
                                 break;
                              }

                              var5++;
                              var41 = var4;
                           }
                        }
                     }

                     var42 = var22;
                  }

                  var28 = ((net.C_47rf) (var42)).method_48$dbd570a038();
                  var10000 = ((int) (var28.equals(net.C_42R.field_45p) ? 1 : 0));
                  var10001 = var4;
               }
            }

            java.util.HashMap var19 = new java.util.HashMap();
            var19.put(net.C_47qP.DIAMOND, var6);
            var19.put(net.C_47qP.IRON, var8);
            var19.put(net.C_47qP.STICKS, var7);
            var19.put(net.C_47qP.PLANKS, var9);
            var19.put(net.C_47qP.AIR, var5);
            java.util.HashMap var25 = new java.util.HashMap();
            var25.put(net.C_47qP.DIAMOND, var10);
            var25.put(net.C_47qP.IRON, var12);
            var25.put(net.C_47qP.STICKS, var11);
            var25.put(net.C_47qP.PLANKS, var13);
            return new net.C_42a(var19, var25);
         }
      } else {
         Object var34 = new java.util.HashMap();
         if (var2 < 0L) {
            while (true) {
               net.C_47rf var21 = ((net.C_47sT)var34).method_48$ac4db64966();
               if (var4 == 0) {
                  var21 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$517(field_43, -5957273138162454069L, var2)).field_42X.method_41$ac4db64966();
               }

               label635: {
                  net.C_47rf var35 = var21;
                  if (var4 != 0) {
                     if (var21 == null) {
                        var37 = var14;
                        break label635;
                     }

                     var35 = var21;
                  }

                  label609: {
                     net.C_43r var16 = var35.method_48$dbd570a038();
                     int var36 = ((int) (var16.equals(net.C_42R.field_45p) ? 1 : 0));
                     if (var4 != 0) {
                        if (var36 == 0) {
                           break label609;
                        }

                        var9++;
                        var36 = var13 + var21.field_47;
                     }

                     var13 = var36;
                  }

                  var14++;
                  var37 = var4;
               }

               var34 = var37 != 0 && var14 < var1.field_46M.field_46.size() ? var1.field_46M.field_46.get(var14) : new java.util.HashMap();
            }
         }

         Object var18 = var34;
         ((java.util.HashMap) (var18)).put(net.C_47qP.DIAMOND, var6);
         ((java.util.HashMap) (var18)).put(net.C_47qP.IRON, var8);
         ((java.util.HashMap) (var18)).put(net.C_47qP.STICKS, var7);
         ((java.util.HashMap) (var18)).put(net.C_47qP.PLANKS, var9);
         ((java.util.HashMap) (var18)).put(net.C_47qP.AIR, var5);
         java.util.HashMap var15 = new java.util.HashMap();
         var15.put(net.C_47qP.DIAMOND, var10);
         var15.put(net.C_47qP.IRON, var12);
         var15.put(net.C_47qP.STICKS, var11);
         var15.put(net.C_47qP.PLANKS, var13);
         return new net.C_42a(var18, var15);
      }
   }





   private double method_44$60125b624c(long var1, C_47rf var3) {
      var1 = a ^ var1;
      boolean var4 = recovery$indy$127(-5187382505845614680L, var1);
      double var5 = 0.0;
      int var10000 = (int) ((var3.method_48$dbd570a038() instanceof C_43S) ? 1 : 0);
      if (var4) {
         if (var10000 == 0) {
            return var5;
         }

         var5 += (
               ((C_43S)var3.method_48$dbd570a038()).field_43
                  + (6 + C_47ru.method_47$6eb1f4c276(C_47DW.field_48h.field_48X, var3) * C_47ru.method_47$6eb1f4c276(C_47DW.field_48h.field_48X, var3)) / 3.0F
            )
            * 1.4;
         var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_48K.field_48X, var3) / 11.0;
         var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_48H.field_48X, var3) / 11.0;
         var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_489.field_48X, var3) / 11.0;
         var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_46.field_48X, var3) / 69.0;
         var5 += C_47ru.method_47$6eb1f4c276(C_47DW.field_48.field_48X, var3) / 11.0;
         if (var1 > 0L) {
            double var13 = var5 + C_47ru.method_47$6eb1f4c276(C_47DW.field_48Y.field_48X, var3) / 11.0;
            if (!var4) {
               return var13;
            }

            var5 = var13;
         }

         var10000 = ((C_43S)var3.method_48$dbd570a038()).field_41;
      }

      if (var10000 == 0 && ((C_43S)var3.method_48$dbd570a038()).method_48$d42c778956() == C_47KW.GOLD) {
         var5 -= 0.01;
      }

      return var5;
   }




   private boolean method_48$e3d106ba24(net.C_47ps var1, int var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 87602400452384L;
      long var7 = var3 ^ 118877783241383L;
      long var9 = var3 ^ 4248772726195L;
      long var11 = var3 ^ 109383966961147L;
      long var13 = var3 ^ 106744858996729L;
      long var10000 = 3027121054525425420L;
      byte var15 = ((byte) (AirStuck_47Q4.method_419$aae029aa0a() ? 1 : 0));
      net.C_47sT var16 = var1.field_46M.method_46$4c10532da1(var2);
      if (var15 != 0) {
         long var239 = 3027260469419156453L;
         long var87 = var13;
         client.setting.ModeSetting var90 = this.settingClickMode;
         String var66 = var90.method_46$5f9dc63072(var87);
         byte var71 = -1;
         int var186 = var66.hashCode();
         if (var15 == 0) {
            switch (var186) {
               case 0:
                  var10000 = 3028462059321079050L;
                  client.Client.method_44$fbc0c0be91().getClass();
                  if (var3 > 0L) {
                     long var223 = 3028139123070646396L;
                     net.minecraft.client.Minecraft var94 = field_43;
                     long var290 = 3027526665297278619L;
                     net.minecraft.client.Minecraft var98 = field_43;
                     var94.field_44K.method_42$f0ddb617a2(var1.field_46M.field_43, var2, 0, 1, var98.field_42P);
                     var223 = 3027291693368199074L;
                     net.C_47cu var106 = this.field_49;
                     var106.method_46$da8c82d5d4();
                     net.C_47MO var225 = net.C_476q.field_48;
                     long var269 = 3026751693180139354L;
                     long var114 = var7;
                     net.C_47TU var122 = this.settingDelay;
                     double var253 = var122.method_41$474dfaa627(var114);
                     var290 = 3027704920422703055L;
                     long var130 = var5;
                     net.C_47TU var138 = this.settingDelay;
                     double var270 = var138.method_43$474dfaa627(var130);
                     long var278 = 3027435669659890320L;
                     double var146 = var270;
                     double var154 = var253;
                     long var162 = var9;
                     net.C_47MO var170 = var225;
                     this.field_438 = var170.method_41$07400418b0(var162, var154, var146);
                     return true;
                  }

                  return true;
               case 1:
               case 2:
                  long var220 = 3028139123070646396L;
                  net.minecraft.client.Minecraft var93 = field_43;
                  long var288 = 3027526665297278619L;
                  net.minecraft.client.Minecraft var97 = field_43;
                  var93.field_44K.method_42$f0ddb617a2(var1.field_46M.field_43, var2, 0, 1, var97.field_42P);
                  var220 = 3027291693368199074L;
                  net.C_47cu var105 = this.field_49;
                  var105.method_46$da8c82d5d4();
                  net.C_47MO var222 = net.C_476q.field_48;
                  long var267 = 3026751693180139354L;
                  long var113 = var7;
                  net.C_47TU var121 = this.settingDelay;
                  double var252 = var121.method_41$474dfaa627(var113);
                  var288 = 3027704920422703055L;
                  long var129 = var5;
                  net.C_47TU var137 = this.settingDelay;
                  double var268 = var137.method_43$474dfaa627(var129);
                  long var277 = 3027435669659890320L;
                  double var145 = var268;
                  double var153 = var252;
                  long var161 = var9;
                  net.C_47MO var169 = var222;
                  this.field_438 = var169.method_41$07400418b0(var161, var153, var145);
                  return true;
               default:
                  long var218 = 3027291693368199074L;
                  net.C_47cu var104 = this.field_49;
                  var104.method_46$da8c82d5d4();
                  net.C_47MO var219 = net.C_476q.field_48;
                  long var265 = 3026751693180139354L;
                  long var112 = var7;
                  net.C_47TU var120 = this.settingDelay;
                  double var251 = var120.method_41$474dfaa627(var112);
                  long var287 = 3027704920422703055L;
                  long var128 = var5;
                  net.C_47TU var136 = this.settingDelay;
                  double var266 = var136.method_43$474dfaa627(var128);
                  long var276 = 3027435669659890320L;
                  double var144 = var266;
                  double var152 = var251;
                  long var160 = var9;
                  net.C_47MO var168 = var219;
                  this.field_438 = var168.method_41$07400418b0(var160, var152, var144);
                  return true;
            }
         } else {
            return (((var186) & 1) != 0);
         }
      } else {
         long var10001 = 3027948001807763810L;
         client.setting.BooleanSetting var27 = this.settingSmartDelay;
         byte var171 = ((byte) (var27.method_49$aae029aa0a() ? 1 : 0));
         if (var3 >= 0L) {
            label421: {
               if (var171 != 0) {
                  double var63 = Math.abs(var16.field_40 + 2 + var1.field_46c - var1.field_45[0]);
                  double var72 = Math.abs(var16.field_46 + 2 + var1.field_433 - var1.field_45[1]);
                  double var73 = Math.sqrt(var63 * var63 + var72 * var72);
                  long var230 = 3026751693180139354L;
                  long var76 = var7;
                  net.C_47TU var77 = this.settingDelay;
                  double var178 = var77.method_41$474dfaa627(var76);
                  long var244 = 3027704920422703055L;
                  long var78 = var5;
                  net.C_47TU var79 = this.settingDelay;
                  double var179 = var178 + var79.method_43$474dfaa627(var78);
                  var244 = 3026751693180139354L;
                  long var80 = var7;
                  net.C_47TU var81 = this.settingDelay;
                  double var74 = var179 - var81.method_41$474dfaa627(var80) / 2.0;
                  double var75 = var73 / 30.0;
                  long var292;
                  int var200 = (var292 = var3 - 0L) == 0L ? 0 : (var292 < 0L ? -1 : 1);
                  if (var15 != 0) {
                     break label421;
                  }

                  if (var73 > 36.0) {
                     var10001 = (long)(var74 * var75);
                     var244 = 3028184385477753707L;
                     long var82 = var11;
                     long var83 = var10001;
                     net.C_47cu var84 = this.field_49;
                     boolean var180 = var84.method_42$b0e346e6e3(var83, var82);
                     if (var3 > 0L) {
                        if (!var180) {
                           return false;
                        }

                        var1.field_45 = new double[]{var16.field_40 + 2 + var1.field_46c, var16.field_46 + 2 + var1.field_433};
                        var230 = 3027260469419156453L;
                        long var85 = var13;
                        client.setting.ModeSetting var88 = this.settingClickMode;
                        String var64 = var88.method_46$5f9dc63072(var85);
                        byte var69 = -1;
                        byte var181;
                        switch (var64.hashCode()) {
                           case 63955982:
                              if (var64.equals("Basic")) {
                                 var69 = 1;
                                 long var297;
                                 int var204 = (var297 = var3 - 0L) == 0L ? 0 : (var297 < 0L ? -1 : 1);
                                 if (var15 != 0) {
                                    var181 = ((byte) (var64.equals("Other") ? 1 : 0));
                                    long var298;
                                    int var234 = (var298 = var3 - 0L) == 0L ? 0 : (var298 < 0L ? -1 : 1);
                                    if (var15 != 0) {
                                       break;
                                    }

                                    if (var181 != 0) {
                                       var69 = 2;
                                    }
                                 }
                              }

                              var181 = var69;
                              break;
                           case 76517104:
                              var181 = ((byte) (var64.equals("Other") ? 1 : 0));
                              long var293;
                              int var233 = (var293 = var3 - 0L) == 0L ? 0 : (var293 < 0L ? -1 : 1);
                              if (var15 == 0) {
                                 if (var181 != 0) {
                                    var69 = 2;
                                 }

                                 var181 = var69;
                              }
                              break;
                           case 355504491:
                              if (var64.equals("Exploit")) {
                                 var69 = 0;
                                 long var294;
                                 int var202 = (var294 = var3 - 0L) == 0L ? 0 : (var294 < 0L ? -1 : 1);
                                 if (var15 != 0 && var64.equals("Basic")) {
                                    var69 = 1;
                                    long var295;
                                    int var203 = (var295 = var3 - 0L) == 0L ? 0 : (var295 < 0L ? -1 : 1);
                                    if (var15 != 0) {
                                       var181 = ((byte) (var64.equals("Other") ? 1 : 0));
                                       long var296;
                                       int var232 = (var296 = var3 - 0L) == 0L ? 0 : (var296 < 0L ? -1 : 1);
                                       if (var15 != 0) {
                                          break;
                                       }

                                       if (var181 != 0) {
                                          var69 = 2;
                                       }
                                    }
                                 }
                              }

                              var181 = var69;
                              break;
                           default:
                              var181 = var69;
                        }

                        if (var15 == 0) {
                           switch (var181) {
                              case 0:
                                 var10000 = 3028462059321079050L;
                                 client.Client.method_44$fbc0c0be91().getClass();
                                 long var299;
                                 int var183 = (var299 = var3 - 0L) == 0L ? 0 : (var299 < 0L ? -1 : 1);
                                 break;
                              case 1:
                              case 2:
                                 var10001 = 3028139123070646396L;
                                 net.minecraft.client.Minecraft var91 = field_43;
                                 long var281 = 3027526665297278619L;
                                 net.minecraft.client.Minecraft var95 = field_43;
                                 var91.field_44K.method_42$f0ddb617a2(var1.field_46M.field_43, var2, 0, 1, var95.field_42P);
                           }

                           var10001 = 3027291693368199074L;
                           net.C_47cu var100 = this.field_49;
                           var100.method_46$da8c82d5d4();
                           net.C_47MO var207 = net.C_476q.field_48;
                           long var257 = 3026751693180139354L;
                           long var108 = var7;
                           net.C_47TU var116 = this.settingDelay;
                           double var247 = var116.method_41$474dfaa627(var108);
                           long var282 = 3027704920422703055L;
                           long var124 = var5;
                           net.C_47TU var132 = this.settingDelay;
                           double var258 = var132.method_43$474dfaa627(var124);
                           long var272 = 3027435669659890320L;
                           double var140 = var258;
                           double var148 = var247;
                           long var156 = var9;
                           net.C_47MO var164 = var207;
                           this.field_438 = var164.method_41$07400418b0(var156, var148, var140);
                           var181 = 1;
                        }

                        return (((var181) & 1) != 0);
                     }

                     return var180;
                  }
               }

               var1.field_45 = new double[]{var16.field_40 + 2 + var1.field_46c, var16.field_46 + 2 + var1.field_433};
            }

            long var235 = 3027260469419156453L;
            long var86 = var13;
            client.setting.ModeSetting var89 = this.settingClickMode;
            String var65 = var89.method_46$5f9dc63072(var86);
            byte var70 = -1;
            byte var184;
            switch (var65.hashCode()) {
               case 63955982:
                  if (var65.equals("Basic")) {
                     var70 = 1;
                     long var304;
                     int var210 = (var304 = var3 - 0L) == 0L ? 0 : (var304 < 0L ? -1 : 1);
                     if (var15 != 0) {
                        var184 = ((byte) (var65.equals("Other") ? 1 : 0));
                        long var305;
                        int var238 = (var305 = var3 - 0L) == 0L ? 0 : (var305 < 0L ? -1 : 1);
                        if (var15 != 0) {
                           break;
                        }

                        if (var184 != 0) {
                           var70 = 2;
                        }
                     }
                  }

                  var184 = var70;
                  break;
               case 76517104:
                  var184 = ((byte) (var65.equals("Other") ? 1 : 0));
                  long var300;
                  int var237 = (var300 = var3 - 0L) == 0L ? 0 : (var300 < 0L ? -1 : 1);
                  if (var15 == 0) {
                     if (var184 != 0) {
                        var70 = 2;
                     }

                     var184 = var70;
                  }
                  break;
               case 355504491:
                  if (var65.equals("Exploit")) {
                     var70 = 0;
                     long var301;
                     int var208 = (var301 = var3 - 0L) == 0L ? 0 : (var301 < 0L ? -1 : 1);
                     if (var15 != 0 && var65.equals("Basic")) {
                        var70 = 1;
                        long var302;
                        int var209 = (var302 = var3 - 0L) == 0L ? 0 : (var302 < 0L ? -1 : 1);
                        if (var15 != 0) {
                           var184 = ((byte) (var65.equals("Other") ? 1 : 0));
                           long var303;
                           int var236 = (var303 = var3 - 0L) == 0L ? 0 : (var303 < 0L ? -1 : 1);
                           if (var15 != 0) {
                              break;
                           }

                           if (var184 != 0) {
                              var70 = 2;
                           }
                        }
                     }
                  }

                  var184 = var70;
                  break;
               default:
                  var184 = var70;
            }

            if (var15 == 0) {
               switch (var184) {
                  case 0:
                     var10000 = 3028462059321079050L;
                     client.Client.method_44$fbc0c0be91().getClass();
                     if (var3 > 0L) {
                        var10001 = 3027291693368199074L;
                        net.C_47cu var103 = this.field_49;
                        var103.method_46$da8c82d5d4();
                        net.C_47MO var217 = net.C_476q.field_48;
                        long var263 = 3026751693180139354L;
                        long var111 = var7;
                        net.C_47TU var119 = this.settingDelay;
                        double var250 = var119.method_41$474dfaa627(var111);
                        long var286 = 3027704920422703055L;
                        long var127 = var5;
                        net.C_47TU var135 = this.settingDelay;
                        double var264 = var135.method_43$474dfaa627(var127);
                        long var275 = 3027435669659890320L;
                        double var143 = var264;
                        double var151 = var250;
                        long var159 = var9;
                        net.C_47MO var167 = var217;
                        this.field_438 = var167.method_41$07400418b0(var159, var151, var143);
                        return true;
                     }

                     return true;
                  case 1:
                  case 2:
                     var10001 = 3028139123070646396L;
                     net.minecraft.client.Minecraft var92 = field_43;
                     long var284 = 3027526665297278619L;
                     net.minecraft.client.Minecraft var96 = field_43;
                     var92.field_44K.method_42$f0ddb617a2(var1.field_46M.field_43, var2, 0, 1, var96.field_42P);
                     var10001 = 3027291693368199074L;
                     net.C_47cu var102 = this.field_49;
                     var102.method_46$da8c82d5d4();
                     net.C_47MO var215 = net.C_476q.field_48;
                     long var261 = 3026751693180139354L;
                     long var110 = var7;
                     net.C_47TU var118 = this.settingDelay;
                     double var249 = var118.method_41$474dfaa627(var110);
                     var284 = 3027704920422703055L;
                     long var126 = var5;
                     net.C_47TU var134 = this.settingDelay;
                     double var262 = var134.method_43$474dfaa627(var126);
                     long var274 = 3027435669659890320L;
                     double var142 = var262;
                     double var150 = var249;
                     long var158 = var9;
                     net.C_47MO var166 = var215;
                     this.field_438 = var166.method_41$07400418b0(var158, var150, var142);
                     return true;
                  default:
                     var10001 = 3027291693368199074L;
                     net.C_47cu var101 = this.field_49;
                     var101.method_46$da8c82d5d4();
                     net.C_47MO var212 = net.C_476q.field_48;
                     long var259 = 3026751693180139354L;
                     long var109 = var7;
                     net.C_47TU var117 = this.settingDelay;
                     double var248 = var117.method_41$474dfaa627(var109);
                     long var283 = 3027704920422703055L;
                     long var125 = var5;
                     net.C_47TU var133 = this.settingDelay;
                     double var260 = var133.method_43$474dfaa627(var125);
                     long var273 = 3027435669659890320L;
                     double var141 = var260;
                     double var149 = var248;
                     long var157 = var9;
                     net.C_47MO var165 = var212;
                     this.field_438 = var165.method_41$07400418b0(var157, var149, var141);
                     return true;
               }
            } else {
               return (((var184) & 1) != 0);
            }
         } else {
            double var17 = Math.abs(var171 - var1.field_45[0]);
            double var19 = Math.abs(var16.field_46 + 2 + var1.field_433 - var1.field_45[1]);
            double var21 = Math.sqrt(var17 * var17 + var19 * var19);
            long var10002 = 3026751693180139354L;
            long var28 = var7;
            net.C_47TU var30 = this.settingDelay;
            double var172 = var30.method_41$474dfaa627(var28);
            long var10003 = 3027704920422703055L;
            long var31 = var5;
            net.C_47TU var33 = this.settingDelay;
            double var173 = var172 + var33.method_43$474dfaa627(var31);
            var10003 = 3026751693180139354L;
            long var34 = var7;
            net.C_47TU var36 = this.settingDelay;
            double var23 = var173 - var36.method_41$474dfaa627(var34) / 2.0;
            double var25 = var21 / 30.0;
            long var306;
            int var188 = (var306 = var3 - 0L) == 0L ? 0 : (var306 < 0L ? -1 : 1);
            if (var15 > 0) {
               var10001 = (long)(var23 * var25);
               var10003 = 3028184385477753707L;
               long var37 = var11;
               long var39 = var10001;
               net.C_47cu var41 = this.field_49;
               boolean var177 = var41.method_42$b0e346e6e3(var39, var37);
               long var307;
               int var199 = (var307 = var3 - 0L) == 0L ? 0 : (var307 < 0L ? -1 : 1);
               return var177;
            }

            var1.field_45 = new double[]{var16.field_40 + 2 + var1.field_46c, var16.field_46 + 2 + var1.field_433};
            var10002 = 3027260469419156453L;
            long var42 = var13;
            client.setting.ModeSetting var44 = this.settingClickMode;
            String var62 = var44.method_46$5f9dc63072(var42);
            byte var18 = -1;
            byte var174;
            byte var189;
            switch (var62.hashCode()) {
               case 63955982:
                  if (var62.equals("Basic")) {
                     boolean var68 = true;
                     var174 = var15;
                     long var309;
                     int var192 = (var309 = var3 - 0L) == 0L ? 0 : (var309 < 0L ? -1 : 1);
                     var189 = var15;
                     long var310;
                     int var229 = (var310 = var3 - 0L) == 0L ? 0 : (var310 < 0L ? -1 : 1);
                  } else {
                     var174 = var18;
                     var189 = var15;
                  }
                  break;
               case 76517104:
                  var174 = ((byte) (var62.equals("Other") ? 1 : 0));
                  var189 = var15;
                  long var308;
                  int var228 = (var308 = var3 - 0L) == 0L ? 0 : (var308 < 0L ? -1 : 1);
                  break;
               case 355504491:
                  if (var62.equals("Exploit")) {
                     var18 = 0;
                     long var311;
                     int var190 = (var311 = var3 - 0L) == 0L ? 0 : (var311 < 0L ? -1 : 1);
                     if (var15 != 0) {
                        boolean var67 = true;
                        var174 = var15;
                        long var312;
                        int var191 = (var312 = var3 - 0L) == 0L ? 0 : (var312 < 0L ? -1 : 1);
                        var189 = var15;
                        long var313;
                        int var227 = (var313 = var3 - 0L) == 0L ? 0 : (var313 < 0L ? -1 : 1);
                        break;
                     }
                  }

                  var174 = var18;
                  var189 = var15;
                  break;
               default:
                  var174 = var18;
                  var189 = var15;
            }

            if (var189 == 0) {
               switch (var174) {
                  case 0:
                     var10000 = 3028462059321079050L;
                     client.Client.method_44$fbc0c0be91().getClass();
                     long var314;
                     int var176 = (var314 = var3 - 0L) == 0L ? 0 : (var314 < 0L ? -1 : 1);
                     break;
                  case 1:
                  case 2:
                     var10001 = 3028139123070646396L;
                     net.minecraft.client.Minecraft var45 = field_43;
                     long var279 = 3027526665297278619L;
                     net.minecraft.client.Minecraft var46 = field_43;
                     var45.field_44K.method_42$f0ddb617a2(var1.field_46M.field_43, var2, 0, 1, var46.field_42P);
                     var10001 = 3027291693368199074L;
                     net.C_47cu var99 = this.field_49;
                     var99.method_46$da8c82d5d4();
                     net.C_47MO var197 = net.C_476q.field_48;
                     long var255 = 3026751693180139354L;
                     long var107 = var7;
                     net.C_47TU var115 = this.settingDelay;
                     double var242 = var115.method_41$474dfaa627(var107);
                     var279 = 3027704920422703055L;
                     long var123 = var5;
                     net.C_47TU var131 = this.settingDelay;
                     double var256 = var131.method_43$474dfaa627(var123);
                     long var271 = 3027435669659890320L;
                     double var139 = var256;
                     double var147 = var242;
                     long var155 = var9;
                     net.C_47MO var163 = var197;
                     this.field_438 = var163.method_41$07400418b0(var155, var147, var139);
                     break;
                  default:
                     var10001 = 3027291693368199074L;
                     net.C_47cu var47 = this.field_49;
                     var47.method_46$da8c82d5d4();
                     net.C_47MO var194 = net.C_476q.field_48;
                     long var10004 = 3026751693180139354L;
                     long var48 = var7;
                     net.C_47TU var50 = this.settingDelay;
                     double var241 = var50.method_41$474dfaa627(var48);
                     long var10006 = 3027704920422703055L;
                     long var51 = var5;
                     net.C_47TU var53 = this.settingDelay;
                     double var254 = var53.method_43$474dfaa627(var51);
                     long var10005 = 3027435669659890320L;
                     double var54 = var254;
                     double var56 = var241;
                     long var58 = var9;
                     net.C_47MO var60 = var194;
                     this.field_438 = var60.method_41$07400418b0(var58, var56, var54);
               }

               var174 = 1;
            }

            return (((var174) & 1) != 0);
         }
      }
   }






   private boolean method_48$19c42ec568(long var1, net.C_47ps var3, int var4, int var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 44584734341745L;
      long var8 = var1 ^ 12362270627830L;
      long var10 = var1 ^ 115761059321866L;
      byte var12 = ((byte) (recovery$indy$128(5716181141200560377L, var1) ? 1 : 0));
      int var76 = var12;
      int var13 = this.field_43y;
      if (var76 == 0) {
         return (var13 != 0);
      }

      var13 = var13;
      long var106;
      var76 = (var106 = var1 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
      int var20 = var5;
      var13 = var13;
      if (var76 >= 0) {
         var20 = var20;
         var13 = var13;
         var20 = var20;
         var13 = var13;
         int var78 = var20;
         var76 = var13;
         if (var76 != var78) {
            return false;
         }

         byte var10000 = ((byte) (recovery$indy$129(this, var3, var4, var10, 5715435373918315764L, var1) ? 1 : 0));
         var20 = var12;
         var13 = var10000;
      }

      long var107;
      var76 = (var107 = var1 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
      var20 = var20;
      var13 = var13;
      if (var76 > 0) {
         var20 = var20;
         var13 = var13;
         var76 = var20;
         var13 = var13;
         if (var76 != 0) {
            var13 = var13;
            var13 = var13;
            var76 = var13;
            if (var76 != 0) {
               this.field_43y++;
               this.field_43a = true;
            }

            double var108;
            var13 = (var108 = recovery$indy$130(this.settingDelay, var8, 5715148744792805899L, var1) - 0.0) == 0.0 ? 0 : (var108 < 0.0 ? -1 : 1);
         }

         var20 = var12;
         var13 = var13;
      }

      var76 = var20;
      var13 = var13;
      if (var76 != 0) {
         var13 = var13;
         var76 = var13;
         if (var76 == 0) {
            double var109;
            var13 = (var109 = recovery$indy$131(this.settingDelay, var6, 5716746560856537758L, var1) - 0.0) == 0.0 ? 0 : (var109 < 0.0 ? -1 : 1);
            var13 = var13;
            var76 = var13;
            if (!(var76 != 0)) {
               return false;
            }
         }

         var13 = 1;
      }

      return (var13 != 0);
   }



   private boolean method_47$ed9d4b25a0(C_47Rb var1, C_47ps var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 54749556719951L;
      long var7 = var3 ^ 90513158210276L;
      long var9 = var3 ^ 138913475696579L;
      boolean var11 = recovery$indy$132(-7859539567130394653L, var3);
      Crafter_47Qf var10000 = this;
      if (!var11) {
         if (recovery$indy$133(field_43, -7859661378341466508L, var3).field_42X.method_41$ac4db64966() == null) {
            return false;
         }

         var10000 = this;
      }

      C_42a var12 = recovery$indy$134(var10000, var2, var7, -7860263589700813446L, var3);
      HashMap var13 = (HashMap)recovery$indy$135(var12, -7860215230571656112L, var3);
      HashMap var14 = (HashMap)recovery$indy$136(var12, -7860811197276526844L, var3);
      HashMap var15 = recovery$indy$137(this, var9, -7859172501505416907L, var3);
      double var16 = (Double)var15.get(var1);
      C_42a var18 = recovery$indy$138(this, var1, var13, var5, var14, -7860984590519110414L, var3);
      double var19 = (Double)recovery$indy$139(var18, -7860215230571656112L, var3);
      double var23;
      int var22 = (var23 = var19 - var16) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
      if (!var11) {
         if (var22 > 0) {
            return true;
         }

         var22 = 0;
      }

      return var22 != 0;
   }



    private net.C_42a method_47$1d0dca4e75(net.C_47Rb recipe, java.util.HashMap occupiedSlots, long callerKey, java.util.HashMap itemCounts) {
        long key = recovery$indy$flow$698() ^ callerKey;
        long blockScoreKey = key ^ 104032362816813L;
        long itemScoreKey = key ^ 41150931561376L;
        double bestScore = Double.longBitsToDouble(-4600989969312382976L);
        boolean guard = recovery$indy$flow$699(7996547700278772727L, key);
        Object bestMaterial = recovery$indy$flow$700();
        int emptySlots = recovery$indy$flow$704(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$702(occupiedSlots, recovery$indy$flow$701()))))))));
        Object[] materials = (Object[]) recovery$indy$flow$705(7996491512387311346L, key);
        for (int index = 0; index < materials.length;) {
            Object material = materials[index];
            if (guard) break;
            Object base = ((java.lang.Object)(((net.C_47qP) (((java.lang.Object)(material)))).field_42));
            Object count = base;
            if (key >= 0L) {
                if (base == null) {
                    index++;
                    continue;
                }
                count = recovery$indy$flow$707(itemCounts, material);
            }
            // Negative keys preserve the original Integer cast of the typed material base.
            int available = recovery$indy$flow$709(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(count)))))));
            int required = recovery$indy$flow$710(recipe);
            boolean blockRecipe;
            if (key > 0L) {
                if (available < required) {
                    index++;
                    continue;
                }
                int[] recipeCases = (int[]) recovery$indy$flow$711();
                int recipeCase = recipeCases[recovery$indy$flow$712(recipe)];
                if (recipeCase < 1 || recipeCase > 5) {
                    index++;
                    continue;
                }
                blockRecipe = recipeCase == 1;
            } else {
                if (required == 0) {
                    index++;
                    continue;
                }
                blockRecipe = true;
            }
            if (blockRecipe) {
                if (key > 0L) {
                    int sticks = recovery$indy$flow$716(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$714(itemCounts, recovery$indy$flow$713()))))))));
                    if (sticks < 1) {
                        int planks = recovery$indy$flow$720(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$718(itemCounts, recovery$indy$flow$717()))))))));
                        if (planks < 2) {
                            index++;
                            continue;
                        }
                    }
                }
                int sticksSlots = recovery$indy$flow$724(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$722(occupiedSlots, recovery$indy$flow$721()))))))));
                int neededSlots = 1;
                if (key > 0L && sticksSlots == 0) neededSlots++;
                if (key > 0L) {
                    if (available == recovery$indy$flow$725(recipe)) neededSlots--;
                } else if (sticksSlots == 0) {
                    neededSlots--;
                }
                if (emptySlots >= neededSlots) {
                    net.C_47rf stack = new net.C_47rf(new net.C_45V((net.C_47Aw) ((java.lang.Object)(((net.C_47qP) (((java.lang.Object)(material)))).field_42))), 1, 0);
                    double score = recovery$indy$flow$731(this, stack, blockScoreKey, 7997062521305952798L, key);
                    if (key > 0L) {
                        if (score > bestScore) {
                            bestScore = score;
                            bestMaterial = material;
                        }
                    } else {
                        bestMaterial = material;
                    }
                }
                if (key > 0L) {
                    index++;
                    continue;
                }
            }
            if ((key > 0L && emptySlots >= 1) || available == recovery$indy$flow$732(recipe)) {
                net.C_47rf stack = new net.C_47rf(new net.C_43S((net.C_47KW) ((java.lang.Object)(((net.C_47qP) (((java.lang.Object)(material)))).field_46)), 0, recovery$indy$flow$736(recipe)), 1, 0);
                double score = recovery$indy$flow$739(this, itemScoreKey, stack, 7998225357157957482L, key);
                if (key <= 0L) continue;
                if (score > bestScore) {
                    bestScore = score;
                    bestMaterial = material;
                }
            }
            index++;
        }
        return new net.C_42a(Double.valueOf(bestScore), bestMaterial);
    }





   public void onRender3D(long var1, float var3) {
      long var4 = var1 ^ 8944581653787L;
      long var10001 = var1 ^ 40269708215370L;
      int var6 = (int)((var1 ^ 40269708215370L) >>> 48);
      int var7 = (int)((var1 ^ 40269708215370L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      boolean var9 = recovery$indy$144(8133527007697985006L, var1);
      Crafter_47Qf var10000 = this;
      if (!var9) {
         if (!recovery$indy$145(this.settingEventToClick, var4, 8133664120516245767L, var1).equals(recovery$indy$146(30616, 646522788232110599L ^ var1))) {
            return;
         }

         var10000 = this;
      }

      recovery$indy$147(var10000, (char)var6, (short)var7, var8, 8142247168299537418L, var1);
   }



   private boolean method_43$571275e283(long var1, C_47ps var3) {
      int var26;
      var1 = a ^ var1;
      long var4 = var1 ^ 114688236143561L;
      long var6 = var1 ^ 13020408741986L;
      long var8 = var1 ^ 43786657699141L;
      boolean var10 = recovery$indy$148(-8040306448373990043L, var1);
      Crafter_47Qf var10000 = this;
      if (!var10) {
         if (recovery$indy$149(field_43, -8040466730680873742L, var1).field_42X.method_41$ac4db64966() == null) {
            return false;
         }

         var10000 = this;
      }

      C_42a var11 = recovery$indy$150(var10000, var3, var6, -8039802278351192068L, var1);
      HashMap var12 = (HashMap)recovery$indy$151(var11, -8039841910206279978L, var1);
      HashMap var13 = (HashMap)recovery$indy$152(var11, -8039329572957100670L, var1);
      HashMap var14 = recovery$indy$153(this, var8, -8040959730619620429L, var1);
      C_47Rb[] var15 = recovery$indy$154(-8040694533288618057L, var1);
      int var16 = var15.length;
      int var17 = 0;

      while (true) {
         if (var17 < var16) {
            C_47Rb var18 = var15[var17];
            double var19 = (Double)var14.get(var18);
            C_42a var21 = recovery$indy$155(this, var18, var12, var4, var13, -8039358887222315404L, var1);
            double var22 = (Double)recovery$indy$156(var21, -8039841910206279978L, var1);
            boolean var25 = var10;
            if (var1 > 0L) {
               if (!var10) {
                  double var27;
                  var26 = (var27 = var22 - var19) == 0.0 ? 0 : (var27 < 0.0 ? -1 : 1);
                  if (var10) {
                     break;
                  }

                  if (var26 > 0) {
                     return true;
                  }

                  var17++;
               }

               var25 = var10;
            }

            if (!var25) {
               continue;
            }
         }

         var26 = 0;
         break;
      }

      return var26 != 0;
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$157(this, 40, var3, -7100290108383044384L, var1);
      recovery$indy$158(this, 32, var3, -7100290108383044384L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 2909828380943L;
      long var3 = var1 ^ 26933110702496L;
      long var10001 = var1 ^ 58258232766705L;
      int var5 = (int)((var1 ^ 58258232766705L) >>> 48);
      int var6 = (int)((var1 ^ 58258232766705L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      long var10000 = -4297832742889854635L;
      boolean var8 = AirStuck_47Q4.method_419$aae029aa0a();
      Crafter_47Qf var16 = this;
      if (!var8) {
         long var10002 = -4297696076739752516L;
         long var9 = var3;
         ModeSetting var11 = this.settingEventToClick;
         if (!var11.method_46$5f9dc63072(var9).equals("EventTick")) {
            return;
         }

         var16 = this;
      }

      char var17 = (char)var5;
      short var18 = (short)var6;
      long var10004 = -4304312093859962703L;
      int var12 = var7;
      short var13 = var18;
      char var14 = var17;
      Crafter_47Qf var15 = var16;
      var15.method_46$da9b1a9d9d(var14, var13, var12);
   }



    public Crafter_47Qf(long a0) {
        super((java.lang.String) ("Crafter"),(java.lang.String) ("Handwerker"),(long) (((augustus.recovered.modules.player.Crafter_47Qf.a ^ a0) ^ 106058808613637L)),(java.awt.Color) (new java.awt.Color((int) (123),(int) (230),(int) (10))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.player.Crafter_47Qf.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.player.Crafter_47Qf.a ^ a0) ^ 48110830365640L);
        long constructorKey4 = ((augustus.recovered.modules.player.Crafter_47Qf.a ^ a0) ^ 22232200548747L);
        long constructorKey5 = ((augustus.recovered.modules.player.Crafter_47Qf.a ^ a0) ^ 19040634013470L);
        long constructorKey6 = ((augustus.recovered.modules.player.Crafter_47Qf.a ^ a0) ^ 66009577175193L);
        client.setting.NumberSetting initialized7 = new client.setting.NumberSetting(this, "StartDelay", Double.longBitsToDouble(4636737291354636288L), constructorKey6, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0);
        recovery$indy$flow$781(this, initialized7);
        net.C_47TU initialized8 = new net.C_47TU(constructorKey4, this, "Delay", Double.longBitsToDouble(4634626229029306368L), Double.longBitsToDouble(4638144666238189568L), 0.0D, Double.longBitsToDouble(4645744490609377280L), 0);
        recovery$indy$flow$784(this, initialized8);
        client.setting.BooleanSetting initialized9 = new client.setting.BooleanSetting(this, constructorKey5, "SmartDelay", true);
        recovery$indy$flow$787(this, initialized9);
        java.lang.Object initialValue10 = recovery$indy$flow$789(2);
        ((java.lang.Object[]) initialValue10)[0] = "EventTick";
        ((java.lang.Object[]) initialValue10)[1] = "EventRender";
        client.setting.ModeSetting initialized11 = new client.setting.ModeSetting(this, "EventToClick", constructorKey3, "EventTick", (java.lang.String[]) (initialValue10));
        recovery$indy$flow$791(this, initialized11);
        java.lang.Object initialValue12 = recovery$indy$flow$793();
        java.lang.Object initialValue13 = recovery$indy$flow$794(initialValue12);
        java.lang.Object initialValue14 = recovery$indy$flow$795(1);
        ((java.lang.Object[]) initialValue14)[0] = "Basic";
        client.setting.ModeSetting initialized15 = new client.setting.ModeSetting(this, "ClickMode", constructorKey3, "Basic", (java.lang.String[]) (initialValue14));
        recovery$indy$flow$797(this, initialized15);
        net.C_47cu initialized16 = new net.C_47cu();
        recovery$indy$flow$800(this, initialized16);
        net.C_47cu initialized17 = new net.C_47cu();
        recovery$indy$flow$803(this, initialized17);
        recovery$indy$flow$804(this, 0);
        recovery$indy$flow$805(this, -1);
        java.lang.Object initialValue18 = recovery$indy$flow$806();
        recovery$indy$flow$807(this, initialValue18);
        recovery$indy$flow$808(this, null);
        recovery$indy$flow$809(this, false);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static long recovery$indy$flow$13() {
        return augustus.recovered.modules.player.Crafter_47Qf.a;
    }
    private static native java.lang.Object recovery$indy$flow$16(long a0,long a1);
    private static native boolean recovery$indy$flow$17(long a0,long a1);
    private static java.lang.Object recovery$indy$flow$18() {
        return augustus.recovered.modules.player.Crafter_47Qf.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$19(java.lang.Object a0,long a1,long a2);


    private static int recovery$indy$flow$22(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$23() {
        return augustus.recovered.modules.player.Crafter_47Qf.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$24(java.lang.Object a0,long a1,long a2);

    private static native java.lang.Object recovery$indy$flow$26(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$27(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$28(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$29() {
        return net.C_44a.field_49;
    }
    private static native int recovery$indy$flow$30(java.lang.Object a0);
    private static boolean recovery$indy$flow$31(java.lang.Object a0) {
        return (a0 instanceof net.C_45V);
    }
    private static native double recovery$indy$flow$32(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native double recovery$indy$flow$33(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static boolean recovery$indy$flow$34(java.lang.Object a0) {
        return (a0 instanceof net.C_43S);
    }

    private static int recovery$indy$flow$36(java.lang.Object a0) {
        return ((net.C_43S) (a0)).field_41;
    }
    private static native double recovery$indy$flow$37(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native double recovery$indy$flow$38(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static boolean recovery$indy$flow$39(java.lang.Object a0) {
        return (a0 instanceof net.C_43S);
    }

    private static int recovery$indy$flow$41(java.lang.Object a0) {
        return ((net.C_43S) (a0)).field_41;
    }
    private static native double recovery$indy$flow$42(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native double recovery$indy$flow$43(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static boolean recovery$indy$flow$44(java.lang.Object a0) {
        return (a0 instanceof net.C_43S);
    }

    private static int recovery$indy$flow$46(java.lang.Object a0) {
        return ((net.C_43S) (a0)).field_41;
    }
    private static native double recovery$indy$flow$47(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native double recovery$indy$flow$48(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static boolean recovery$indy$flow$49(java.lang.Object a0) {
        return (a0 instanceof net.C_43S);
    }

    private static int recovery$indy$flow$51(java.lang.Object a0) {
        return ((net.C_43S) (a0)).field_41;
    }
    private static native double recovery$indy$flow$52(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native double recovery$indy$flow$53(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native boolean recovery$indy$flow$57(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$59(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$62(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$66(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$67(java.lang.Object a0,double a1,long a2,long a3,long a4);
    private static native boolean recovery$indy$flow$70(java.lang.Object a0,long a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$71(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$72(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$73(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$74(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$76(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$81(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,java.lang.Object a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$82(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$85(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$101(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$102(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$103(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$104(java.lang.Object a0,long a1,java.lang.Object a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$105(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$109(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$110(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$111(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$113(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$114(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$115(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$116(java.lang.Object a0,long a1,java.lang.Object a2,int a3,int a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$133(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$138(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$145(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$151(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$153(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$154(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$155(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$156(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$157(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$158(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$159(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$160(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$161(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$162(java.lang.Object a0,long a1,java.lang.Object a2,int a3,int a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$179(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$184(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$191(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$197(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$199(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$200(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$201(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$202(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$203(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$204(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$205(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$206(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$207(java.lang.Object a0,long a1,java.lang.Object a2,int a3,int a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$224(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$229(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$236(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$242(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$244(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$245(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$246(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$247(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$248(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$249(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$250(java.lang.Object a0,long a1,java.lang.Object a2,int a3,int a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$267(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$272(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$279(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$285(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$287(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native boolean recovery$indy$flow$288(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$289(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$290(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$291(java.lang.Object a0,java.lang.Object a1,long a2,int a3,int a4,long a5,long a6);
    private static native boolean recovery$indy$flow$292(java.lang.Object a0,long a1,java.lang.Object a2,int a3,int a4,long a5,long a6);
    private static native java.lang.Object recovery$indy$flow$304(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$308(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,int a3,int a4,short a5,char a6,int a7,long a8,long a9);
    private static native void recovery$indy$flow$310(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$313(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$315(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$316(java.lang.Object a0,long a1,double a2,double a3,long a4,long a5);
    private static native void recovery$indy$flow$322(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$326(long a0,long a1);
    private static native boolean recovery$indy$flow$332(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$343(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$345(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$347(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$349(java.lang.Object a0,long a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$356(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$358(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$360(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$362(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$365(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$369(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$371(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$373(long a0,long a1);
    private static native void recovery$indy$flow$376(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$379(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$381(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$382(java.lang.Object a0,long a1,double a2,double a3,long a4,long a5);
    private static native boolean recovery$indy$flow$507(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$517(java.lang.Object a0,long a1,long a2);
    private static long recovery$indy$flow$698() {
        return augustus.recovered.modules.player.Crafter_47Qf.a;
    }
    private static native boolean recovery$indy$flow$699(long a0,long a1);
    private static java.lang.Object recovery$indy$flow$700() {
        return net.C_47qP.AIR;
    }
    private static java.lang.Object recovery$indy$flow$701() {
        return net.C_47qP.AIR;
    }
    private static java.lang.Object recovery$indy$flow$702(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).get(a1);
    }

    private static int recovery$indy$flow$704(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static native java.lang.Object recovery$indy$flow$705(long a0,long a1);

    private static java.lang.Object recovery$indy$flow$707(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).get(a1);
    }

    private static int recovery$indy$flow$709(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static int recovery$indy$flow$710(java.lang.Object a0) {
        return ((net.C_47Rb) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$711() {
        return net.C_44a.field_49;
    }
    private static native int recovery$indy$flow$712(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$713() {
        return net.C_47qP.STICKS;
    }
    private static java.lang.Object recovery$indy$flow$714(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).get(a1);
    }

    private static int recovery$indy$flow$716(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static java.lang.Object recovery$indy$flow$717() {
        return net.C_47qP.PLANKS;
    }
    private static java.lang.Object recovery$indy$flow$718(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).get(a1);
    }

    private static int recovery$indy$flow$720(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static java.lang.Object recovery$indy$flow$721() {
        return net.C_47qP.STICKS;
    }
    private static java.lang.Object recovery$indy$flow$722(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashMap) (a0)).get(a1);
    }

    private static int recovery$indy$flow$724(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static int recovery$indy$flow$725(java.lang.Object a0) {
        return ((net.C_47Rb) (a0)).field_41;
    }

    private static native double recovery$indy$flow$731(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static int recovery$indy$flow$732(java.lang.Object a0) {
        return ((net.C_47Rb) (a0)).field_41;
    }

    private static int recovery$indy$flow$736(java.lang.Object a0) {
        return ((net.C_47Rb) (a0)).field_47;
    }
    private static native double recovery$indy$flow$739(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native void recovery$indy$flow$781(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$784(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$787(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$789(int a0);
    private static native void recovery$indy$flow$791(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$793();
    private static java.lang.Object recovery$indy$flow$794(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$795(int a0);
    private static native void recovery$indy$flow$797(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$800(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$803(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$804(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.Crafter_47Qf) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$805(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.Crafter_47Qf) (a0)).field_43y = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$806() {
        return net.C_47Rb.SWORD;
    }
    private static void recovery$indy$flow$807(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.Crafter_47Qf) (a0)).field_45 = ((net.C_47Rb) (a1));
        return;
    }
    private static void recovery$indy$flow$808(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.Crafter_47Qf) (a0)).field_44 = ((net.C_47Rb) (a1));
        return;
    }
    private static void recovery$indy$flow$809(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.Crafter_47Qf) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$115(long var0, long var2);
   private static native boolean recovery$indy$116(Object var0, Object var1, int var2, long var3, long var5, long var7);
   private static native double recovery$indy$117(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$118(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$119(long var0, long var2);
   private static native boolean recovery$indy$120(long var0, long var2);
   private static native int recovery$indy$121(Object var0, Object var1, Object var2, int var3, long var4, long var6, long var8);
   private static native boolean recovery$indy$122(Object var0, Object var1, long var2, int var4, long var5, long var7);
   private static native double recovery$indy$123(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$124(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$127(long var0, long var2);
   private static native boolean recovery$indy$128(long var0, long var2);
   private static native boolean recovery$indy$129(Object var0, Object var1, int var2, long var3, long var5, long var7);
   private static native double recovery$indy$130(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$131(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$132(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$133(Object var0, long var1, long var3);
   private static native C_42a recovery$indy$134(Object var0, Object var1, long var2, long var4, long var6);
   private static native Object recovery$indy$135(Object var0, long var1, long var3);
   private static native Object recovery$indy$136(Object var0, long var1, long var3);
   private static native HashMap recovery$indy$137(Object var0, long var1, long var3, long var5);
   private static native C_42a recovery$indy$138(Object var0, Object var1, Object var2, long var3, Object var5, long var6, long var8);
   private static native Object recovery$indy$139(Object var0, long var1, long var3);
   private static native boolean recovery$indy$144(long var0, long var2);
   private static native String recovery$indy$145(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$146(int var0, long var1);
   private static native void recovery$indy$147(Object var0, char var1, short var2, int var3, long var4, long var6);
   private static native boolean recovery$indy$148(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$149(Object var0, long var1, long var3);
   private static native C_42a recovery$indy$150(Object var0, Object var1, long var2, long var4, long var6);
   private static native Object recovery$indy$151(Object var0, long var1, long var3);
   private static native Object recovery$indy$152(Object var0, long var1, long var3);
   private static native HashMap recovery$indy$153(Object var0, long var1, long var3, long var5);
   private static native C_47Rb[] recovery$indy$154(long var0, long var2);
   private static native C_42a recovery$indy$155(Object var0, Object var1, Object var2, long var3, Object var5, long var6, long var8);
   private static native Object recovery$indy$156(Object var0, long var1, long var3);
   private static native void recovery$indy$157(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$158(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$159();
}
