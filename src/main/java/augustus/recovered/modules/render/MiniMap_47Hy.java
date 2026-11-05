package augustus.recovered.modules.render;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_41l;
import net.C_42W;
import client.render.RenderPass;
import net.C_475w;
import net.C_475y;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.C_47Fw;
import net.C_47Gj;
import client.module.Module;
import net.C_47Oj;
import net.C_47R4;
import net.C_47Ri;
import client.setting.ShaderOptions;
import client.setting.NumberSetting;
import net.C_47UZ;
import net.C_47We;
import client.event.RenderListener;
import net.C_47Xe;
import net.C_47bA;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47g5;
import net.C_47hV;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.C_47oO;
import client.render.RenderUtils;
import net.C_47sn;
import client.module.Category;
import net.C_47vO;
import net.C_47xz;
import net.C_49h;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class MiniMap_47Hy extends Module implements C_47xz, RenderListener, C_47iC, C_47Oj, C_47oO, C_47R4 {
   private final NumberSetting settingHeight;
   private final NumberSetting settingPosX;
   private final NumberSetting settingPosY;
   private final NumberSetting settingSize;
   private final NumberSetting settingScale;
   private final ShaderOptions field_41;
   private final Long2ObjectMap field_48;
   private int field_438;
   private int field_43p;
   private int[][] field_46;
   private ByteBuffer field_40;
   private int field_43y;
   private int field_42;
   private static final long a = C_4f.a(-8377423328694200755L, 159246239008573435L, MethodHandles.lookup().lookupClass()).a(204458279737490L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[58];
   private static final String[] g = new String[58];

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Class b(long var0, long var2);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   @Override
   public void method_46$81d4bd5478(C_47bA var1, long var2) {
      int var4 = (int)((var2 ^ 55118925204868L) >>> 48);
      long var5 = (var2 ^ 55118925204868L) << 16 >>> 16;
      recovery$indy$3(
         this,
         (short)var4,
         recovery$indy$1(var1, -6430592649330541965L, var2) << 4,
         recovery$indy$2(var1, -6430353896349938307L, var2) << 4,
         var5,
         -6430717439649020435L,
         var2
      );
   }

   private static native Field a(Class var0, String var1, Class var2);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   public void method_42$3ef3d158ea(int var1, int var2, int[][][] var3) {
      this.field_48.put(var1 & 4294967295L | (var2 & 4294967295L) << 32, var3);
   }

   private static native Method d(long var0, long var2);

   private void method_41$5243e695eb(short var1, int var2, int var3, long var4) {
      long var6 = ((long)var1 << 48 | var4 << 16 >>> 16) ^ a;
      long var8 = var6 ^ 120804623780369L;
      int[][][] var11 = recovery$indy$4(this, var8, var2, var3, -1432338624896672364L, var6);
      int[] var10000 = recovery$indy$5(-1435537566401796051L, var6);
      C_42W var12 = recovery$indy$6(field_43, -1434205237558393608L, var6).method_46$c2ef50bdaf(var2, var3);
      int[] var10 = var10000;
      int var13 = 0;

      do {
         int var18 = var13;

         label104:
         while (true) {
            if (var18 >= 16) {
               return;
            }

            int var14 = 0;

            while (true) {
               if (var14 >= 16) {
                  break label104;
               }

               var18 = Math.min(this.field_42, var12.method_47$7cf53c2591(var2 + var13, var3 + var14));
               if (var10 != null) {
                  break;
               }

               int var15 = var18;

               label99: {
                  label98: {
                     int var10001;
                     int var10002;
                     label97: {
                        label96: {
                           while (true) {
                              if (var15 >= 0) {
                                 C_47UZ var16 = recovery$indy$7(field_43, -1434205237558393608L, var6)
                                    .method_46$04bc0e019e(var12, var2 + var13, var15, var3 + var14);
                                 C_475y var17 = var16.method_48$e084f7739d();
                                 var10000 = var10;
                                 if (var1 < 0) {
                                    break label96;
                                 }

                                 if (var10 != null) {
                                    break;
                                 }

                                 var10000 = var10;
                                 if (var1 >= 0) {
                                    if (var10 == null) {
                                       label86: {
                                          C_475y var21 = var17;
                                          if (var4 > 0L) {
                                             if (var17.method_49$a32a680f8b() == C_47Xe.field_477) {
                                                break label86;
                                             }

                                             var21 = var17;
                                          }

                                          if (!(var21 instanceof C_475w)) {
                                             var11[1][var13][var14] = var15;
                                             var11[0][var13][var14] = var16.method_48$e084f7739d().method_41$536c7c8217(var16).field_40;
                                             var10000 = var10;
                                             if (var4 <= 0L) {
                                                break label99;
                                             }

                                             if (var10 == null) {
                                                break label98;
                                             }
                                          }
                                       }

                                       var15--;
                                    }

                                    var10000 = var10;
                                 }

                                 if (var10000 == null) {
                                    continue;
                                 }
                              }

                              var10000 = var11[1][var13];
                              var10001 = var14;
                              var10002 = -1;
                              if (var4 < 0L) {
                                 break label97;
                              }

                              var10000[var14] = -1;
                              break;
                           }

                           var10000 = var11[0][var13];
                        }

                        var10001 = var14;
                        var10002 = -8477711;
                     }

                     var10000[var10001] = var10002;
                  }

                  var14++;
                  var10000 = var10;
               }

               if (var10000 != null) {
                  break label104;
               }
            }
         }

         var13++;
      } while (var1 >= 0 && var10 == null);
   }

   private C_47Ri method_41$678e6e6c22(long var1, C_47UZ var3) {
      var1 = a ^ var1;
      int[] var4 = recovery$indy$8(-3017981438593052125L, var1);
      C_475y var5 = var3.method_48$e084f7739d();
      C_475y var10000 = var5;
      if (var4 == null) {
         if (var5.method_49$a32a680f8b() == C_47Xe.field_477) {
            return null;
         }

         var10000 = var5;
      }

      if (var4 != null) {
         return var10000.method_41$536c7c8217(var3);
      } else {
         return !(var10000 instanceof C_475w) ? var5.method_41$536c7c8217(var3) : null;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private void method_40$df16004b03(int var1, int var2) {
      java.lang.Object var17;
      long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
      int var5 = (int)((var3 ^ 42514494002438L) >>> 48);
      long var6 = (var3 ^ 42514494002438L) << 16 >>> 16;
      int[] var8 = recovery$indy$9(-4733349873172399503L, var3);
      C_47hV var10000 = recovery$indy$10(field_43, -4736488828488083804L, var3).method_43$ee2e9c7e74();
      if (var8 == null) {
         if (!(var10000 instanceof C_47vO)) {
            return;
         }

         var10000 = recovery$indy$11(field_43, -4736488828488083804L, var3).method_43$ee2e9c7e74();
      }

      C_47vO var9 = (C_47vO)var10000;
      HashSet var10 = new HashSet();
      C_47sn[] var11 = var9.field_43.field_41;
      int var12 = var11.length;
      int var13 = 0;

      label57:
      do {
         int var16 = var13;

         while (var16 < var12) {
            C_47sn var14 = var11[var13];

            while (true) {
               if (var14 != null) {
                  var17 = var10;
                  if (var8 == null) {
                     var16 = (int) ((var10.add(var14)) ? 1 : 0);
                     if (var8 != null) {
                        break;
                     }

                     if (var16 != 0) {
                        var17 = var14.method_46$0502b11602();
                     } else {
                        var14 = var14.field_44;
                        if (var8 == null) {
                           continue;
                        }

                        var13++;
                        var17 = var8;
                        if (var1 >= 0) {
                           continue label57;
                        }
                     }
                  }
               } else {
                  var13++;
                  var17 = var8;
                  if (var1 >= 0) {
                     continue label57;
                  }
               }

               while (true) {
                  C_42W var15 = (C_42W)var17;
                  recovery$indy$12(this, (short)var5, var15.field_43H << 4, var15.field_43C << 4, var6, -4736779635270181521L, var3);
                  var14 = var14.field_44;
                  if (var8 == null) {
                     break;
                  }

                  var13++;
                  var17 = var8;
                  if (var1 >= 0) {
                     continue label57;
                  }
               }
            }
         }
         break;
      } while (var17 == null);
   }

   public int[][][] method_40$87d49bb730(long var1, int var3, int var4) {
      var1 = a ^ var1;
      int[] var5 = recovery$indy$13(-6820551913997916826L, var1);
      synchronized (this.field_48) {
         var3 >>= 4;
         var4 >>= 4;
         int[][][] var7 = (int[][][])this.field_48.get(var3 & 4294967295L | (var4 & 4294967295L) << 32);
         int[][][] var10000 = var7;
         if (var5 == null) {
            if (var7 == null) {
               var7 = new int[2][16][16];
               recovery$indy$14(this, var3, var4, var7, -6822051740720672296L, var1);
            }

            var10000 = var7;
         }

         return var10000;
      }
   }

   private void method_44$a2276b849d(long var1, int var3) {
      int var11;
      var1 = a ^ var1;
      long var4 = var1 ^ 129010787477468L;
      long var6 = var1 ^ 100341494870502L;
      int[] var8 = recovery$indy$15(8394626660771622977L, var1);
      MiniMap_47Hy var10000 = this;
      if (var8 == null) {
         if (this.field_43y == -1) {
            this.field_43y = recovery$indy$16(this, var3, var3, 8390572606754835113L, var1);
         }

         var10000 = this;
      }

      label56: {
         label55: {
            label54:
            if (var8 == null) {
               label52: {
                  if (var10000.field_46 != null) {
                     var10000 = this;
                     if (var8 != null) {
                        break label54;
                     }

                     if (this.field_40 != null) {
                        var10000 = this;
                        if (var8 != null) {
                           break label56;
                        }

                        var11 = this.field_46.length;
                        if (var1 < 0L) {
                           break label52;
                        }

                        if (var11 == var3) {
                           break label55;
                        }
                     }
                  }

                  recovery$indy$17(this, var3, 8390437451338832392L, var1);
                  var11 = this.field_43y;
               }

               GlStateManager.method_46$d00df7729d(var11);
               var10000 = this;
            }

            var10000.field_43y = recovery$indy$18(this, var3, var3, 8390572606754835113L, var1);
         }

         recovery$indy$19(this, var3, var4, this.field_46, 8390954335634658121L, var1);
         var10000 = this;
      }

      recovery$indy$20(var10000, this.field_40, this.field_43y, this.field_46, var3, var3, var6, 8391934012654219321L, var1);
   }

   @Override
   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 79469613767391L;
      long var10 = var6 ^ 132989861136316L;
      long var12 = var6 ^ 91924420980846L;
      long var14 = var6 ^ 58032606781533L;
      int var16 = (int)recovery$indy$21(this.settingSize, var8, 1630932704278563507L, var6);
      this.field_438 = (int)((field_43.field_44f - (var16 + 2)) * (recovery$indy$22(this.settingPosX, var8, 1630932704278563507L, var6) / 100.0)) + 1;
      this.field_43p = (int)((field_43.field_44g - (var16 + 2)) * (recovery$indy$23(this.settingPosY, var8, 1630932704278563507L, var6) / 100.0)) + 1;
      recovery$indy$25(false, recovery$indy$24(this.field_41, var12, 1632845261919045920L, var6), var10, 1631019101292713588L, var6);
      recovery$indy$27(false, var14, recovery$indy$26(this, var5, var16), 1632707368185084947L, var6);
      RenderUtils.method_41$da8c82d5d4();
   }

   private void method_44$da8c82d5d4() {
      this.field_46 = (int[][])null;
      this.field_40 = null;
      synchronized (this.field_48) {
         this.field_48.clear();
      }
   }

   @Override
   public void method_48$6fc9f66db2(long var1, C_47We var3) {
      long var4 = var1 ^ 40596664778732L;
      long var6 = var1 ^ 93565631006889L;
      int[] var8 = recovery$indy$28(-1248681306868979051L, var1);
      if (recovery$indy$29(field_43, -1251836694713285056L, var1) != null) {
         int var9 = recovery$indy$30(var3, -1250166969952081380L, var1);
         int var10 = recovery$indy$31(var3, -1250805929008262663L, var1);
         int var11 = recovery$indy$32(var3, -1251499491866760584L, var1);
         int var12 = var9 & 15;
         int var13 = var11 & 15;
         int[][][] var14 = recovery$indy$33(this, var6, var9, var11, -1249899134577189076L, var1);
         int var15 = var14[1][var12][var13];
         if (var10 >= var15) {
            C_47Ri var16 = recovery$indy$35(this, var4, recovery$indy$34(var3, -1250755290860189260L, var1), -1250365743259470415L, var1);
            if (var8 == null) {
               if (var16 == null) {
                  C_42W var17 = recovery$indy$36(field_43, -1251836694713285056L, var1).method_49$c2ef50bdaf(var9, var11);
                  int var18 = Math.min(this.field_42, var17.method_47$7cf53c2591(var9, var11));

                  while (true) {
                     if (var18 >= 0) {
                        C_47UZ var19 = recovery$indy$37(field_43, -1251836694713285056L, var1).method_46$04bc0e019e(var17, var9, var18, var11);
                        C_475y var20 = var19.method_48$e084f7739d();
                        int[] var10000 = var8;
                        if (var1 >= 0L) {
                           if (var8 != null) {
                              break;
                           }

                           var10000 = var8;
                        }

                        if (var1 > 0L) {
                           if (var10000 == null) {
                              label59: {
                                 C_475y var21 = var20;
                                 if (var1 > 0L) {
                                    if (var20.method_49$a32a680f8b() == C_47Xe.field_477) {
                                       break label59;
                                    }

                                    var21 = var20;
                                 }

                                 if (!(var21 instanceof C_475w)) {
                                    var14[1][var12][var13] = var18;
                                    var14[0][var12][var13] = var19.method_48$e084f7739d().method_41$536c7c8217(var19).field_40;
                                    return;
                                 }
                              }

                              var18--;
                           }

                           var10000 = var8;
                        }

                        if (var10000 == null) {
                           continue;
                        }
                     }

                     var14[1][var12][var13] = -1;
                     if (var1 > 0L) {
                        var14[0][var12][var13] = -8477711;
                     }
                     break;
                  }

                  return;
               }

               var14[1][var12][var13] = var10;
               var14[0][var12][var13] = var16.field_40;
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private void method_48$e1caacac99(int var1, long var2, int[][] var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 80293498401531L;
      int var8 = (int)recovery$indy$38(field_43, -3101997676783110851L, var2).field_48Q - var1 / 2;
      int[] var10000 = recovery$indy$39(-3100210569548443449L, var2);
      int var9 = (int)recovery$indy$40(field_43, -3101997676783110851L, var2).field_42o - var1 / 2;
      int[] var7 = var10000;
      int var10 = var1 / 16 + 2;
      int var11 = var8 & 15;
      int var12 = -var11;
      int var13 = var9 & 15;
      int var14 = -var13;
      int var15 = -1;

      label149:
      while (true) {
         int var26 = var15;

         label147:
         while (var26 < var10) {
            int var16 = -1;

            label144:
            while (true) {
               int var27 = var16;

               label141:
               while (var27 < var10) {
                  int var17 = var8 + var15 * 16;
                  int var18 = var9 + var16 * 16;
                  int[][] var19 = recovery$indy$41(this, var5, var17, var18, -3101454820969192066L, var2)[0];
                  var26 = 0;
                  if (var7 != null) {
                     continue label147;
                  }

                  int var20 = 0;

                  label138:
                  while (true) {
                     int var28 = var20;
                     int var10001 = 16;

                     label136:
                     while (true) {
                        if (var28 >= var10001) {
                           break label138;
                        }

                        var27 = 0;
                        if (var7 != null) {
                           continue label141;
                        }

                        int var21 = 0;

                        label134:
                        while (true) {
                           if (var21 < 16) {
                              var10000 = var19[var20];
                           } else {
                              var20++;
                              var10000 = var7;
                              if (var2 > 0L) {
                                 if (var7 != null) {
                                    break label138;
                                 }
                                 continue label138;
                              }
                           }

                           do {
                              int var22 = var10000[var21];
                              int var23 = var17 + var20 - var8 + var12;
                              int var24 = var18 + var21 - var9 + var14;
                              if (var2 >= 0L) {
                                 if (var7 == null) {
                                    var28 = var23;
                                    var10001 = var1;
                                    if (var7 != null) {
                                       continue label136;
                                    }

                                    label124:
                                    if (var23 < var1) {
                                       int var30 = var23;
                                       int[] var32 = var7;
                                       if (var2 >= 0L) {
                                          if (var7 == null) {
                                             if (var23 < 0) {
                                                var21++;
                                                if (var7 == null) {
                                                   continue label134;
                                                }
                                                break label124;
                                             }

                                             var30 = var24;
                                             var32 = var7;
                                          } else {
                                             var32 = var7;
                                          }
                                       }

                                       if (var32 == null) {
                                          if (var30 < var1 && var24 >= 0) {
                                             var4[var23][var24] = var22;
                                          }
                                       } else if (var30 >= 0) {
                                          var4[var23][var24] = var22;
                                       }

                                       var21++;
                                       if (var7 == null) {
                                          continue label134;
                                       }
                                    } else {
                                       var21++;
                                       if (var7 == null) {
                                          continue label134;
                                       }
                                    }
                                 } else if (var7 == null) {
                                    continue label134;
                                 }
                              } else if (var7 == null) {
                                 continue label134;
                              }

                              var20++;
                              var10000 = var7;
                           } while (var2 <= 0L);

                           if (var7 != null) {
                              break label138;
                           }
                           continue label138;
                        }
                     }
                  }

                  var16++;
                  var10000 = var7;
                  if (var2 <= 0L) {
                     break label144;
                  }

                  if (var7 == null) {
                     continue label144;
                  }
                  break;
               }

               var15++;
               if (var2 <= 0L) {
                  return;
               }

               var10000 = var7;
               break;
            }

            if (var10000 != null) {
               return;
            }
            continue label149;
         }

         return;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private void method_48$47db43e187(ByteBuffer var1, int var2, int[][] var3, int var4, int var5, long var6) {
      int[] var17;
      var6 = a ^ var6;
      int[] var8 = recovery$indy$42(4810962599319947005L, var6);
      int var9 = 0;

      label62:
      while (true) {
         int var10000 = var9;

         label59:
         while (true) {
            if (var10000 < var5) {
               var10000 = 0;
               int[] var10001 = var8;

               label54:
               while (true) {
                  if (var10001 != null) {
                     break label59;
                  }

                  int var10 = var10000;

                  while (true) {
                     if (var10 < var4) {
                        var17 = var3[var10];
                     } else {
                        var9++;
                        var17 = var8;
                        if (var6 >= 0L) {
                           break label54;
                        }
                     }

                     while (true) {
                        int var11 = var17[var9];
                        int var12 = var11 >> 16 & 0xFF;
                        int var13 = var11 >> 8 & 0xFF;
                        int var14 = var11 & 0xFF;
                        var10000 = var11;
                        if (var8 != null) {
                           continue label59;
                        }

                        var10001 = var8;
                        if (var6 < 0L) {
                           continue label54;
                        }

                        if (var8 == null) {
                           var10000 = var11 != 0 ? 255 : 0;
                        }

                        int var15 = var10000;
                        var1.put((byte)var12);
                        var1.put((byte)var13);
                        var1.put((byte)var14);
                        var1.put((byte)var15);
                        var3[var10][var9] = 0;
                        var10++;
                        if (var8 == null) {
                           break;
                        }

                        var9++;
                        var17 = var8;
                        if (var6 >= 0L) {
                           break label54;
                        }
                     }
                  }
               }

               if (var17 == null) {
                  continue label62;
               }
            }

            ((Buffer)var1).flip();
            GlStateManager.method_460$d00df7729d(var2);
            if (var6 <= 0L) {
               return;
            }

            var10000 = 3553;
            break;
         }

         GL11.glTexSubImage2D(var10000, 0, 0, 0, var4, var5, 6408, 5121, var1);
         ((Buffer)var1).clear();
         return;
      }
   }

   private void method_49$750d056189(ScaledResolution var1, int var2, RenderPass var3) {
      long var4 = a ^ 69143134507645L;
      long var6 = var4 ^ 55622437206336L;
      GlStateManager.method_46$da8c82d5d4();
      RenderUtils.method_44$42cf812248(255, 255, 255, 255);
      GlStateManager.method_426$da8c82d5d4();
      GlStateManager.method_47$c151fe78a0(1.0F / var1.method_40$8abf5c6871(), 1.0F / var1.method_40$8abf5c6871(), 1.0F);
      int var10000 = this.field_438 - 1;
      int var10001 = this.field_43p - 1;
      int var10002 = this.field_438 + var2 + 1;
      int var10003 = this.field_43p + var2 + 1;
      long var10008 = -3085704327084987510L;
      int var8 = -267119596;
      long var9 = var6;
      RenderPass var11 = var3;
      ShaderOptions var12 = this.field_41;
      C_47g5.method_48$0f4d4a7a6c(var10000, var10001, var10002, var10003, var12.method_40$d68b376f5b(var11, var9, var8));
      var10002 = this.field_438 + var2;
      var10003 = this.field_43p + var2;
      var10008 = -3085704327084987510L;
      int var13 = -15461356;
      long var14 = var6;
      RenderPass var16 = var3;
      ShaderOptions var17 = this.field_41;
      C_47g5.method_48$0f4d4a7a6c(this.field_438, this.field_43p, var10002, var10003, var17.method_40$d68b376f5b(var16, var14, var13));
      RenderUtils.method_44$42cf812248(255, 255, 255, 255);
      long var21 = -3085490291270153309L;
      int var18 = var2;
      MiniMap_47Hy var19 = this;
      var19.method_47$d00df7729d(var18);
      C_47g5.method_48$0f4d4a7a6c(
         this.field_438 + var2 / 2 - 1, this.field_43p + var2 / 2 - 1, this.field_438 + var2 / 2 + 1, this.field_43p + var2 / 2 + 1, Color.RED.getRGB()
      );
      GlStateManager.method_42O$da8c82d5d4();
      GlStateManager.method_46$da8c82d5d4();
      RenderUtils.method_44$42cf812248(255, 255, 255, 255);
   }

   @Override
   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      recovery$indy$43(this, 3263156929259065296L, var5);
   }

   private int method_45$7cf53c2591(int var1, int var2) {
      int var3 = GlStateManager.method_48$8abf5c6871();
      GlStateManager.method_460$d00df7729d(var3);
      GL11.glTexImage2D(3553, 0, 6408, var1, var2, 0, 6408, 5121, (ByteBuffer)null);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      return var3;
   }

   private void method_47$d00df7729d(int var1) {
      GlStateManager.method_42y$da8c82d5d4();
      GlStateManager.method_460$d00df7729d(this.field_43y);
      C_41l var2 = C_41l.method_40$2abe131c67();
      C_47Gj var3 = var2.method_41$4db9b92eb8();
      var3.method_44$dc4d91c0c9(7, C_49h.field_47A);
      var3.method_42$dbb7a02e02(this.field_438, this.field_43p + var1, 0.0).method_44$6982d727fb(0.0, 1.0).method_42$da8c82d5d4();
      var3.method_42$dbb7a02e02(this.field_438 + var1, this.field_43p + var1, 0.0).method_44$6982d727fb(1.0, 1.0).method_42$da8c82d5d4();
      var3.method_42$dbb7a02e02(this.field_438 + var1, this.field_43p, 0.0).method_44$6982d727fb(1.0, 0.0).method_42$da8c82d5d4();
      var3.method_42$dbb7a02e02(this.field_438, this.field_43p, 0.0).method_44$6982d727fb(0.0, 0.0).method_42$da8c82d5d4();
      var2.method_40$da8c82d5d4();
   }

   private void method_43$d00df7729d(int var1) {
      this.field_46 = new int[var1][var1];
      this.field_40 = ByteBuffer.allocateDirect(var1 * var1 * 4);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$44(this, 32, var3, -7100463099718487782L, var1);
      recovery$indy$45(this, 26, var3, -7100463099718487782L, var1);
      recovery$indy$46(this, 55, var3, -7100463099718487782L, var1);
      recovery$indy$47(this, 56, var3, -7100463099718487782L, var1);
      recovery$indy$48(this, 40, var3, -7100463099718487782L, var1);
   }

   @Override
   public void method_482$4a66cb4514(char var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 128574058116981L;
      int var8 = (int)((var4 ^ 19126052323869L) >>> 32);
      int var9 = (int)((var4 ^ 19126052323869L) << 32 >>> 32);
      long var10 = var4 ^ 112441895012397L;
      int[] var12 = recovery$indy$49(-357818467606692042L, var4);
      if (recovery$indy$50(field_43, -359603412324820276L, var4) != null) {
         MiniMap_47Hy var10000 = this;
         if (var12 == null) {
            label27: {
               int var13 = (int)recovery$indy$51(this.settingHeight, var6, -358036109071898855L, var4);
               int var10001 = this.field_42;
               if (var3 > 0) {
                  if (var13 == this.field_42) {
                     break label27;
                  }

                  var13 = recovery$indy$52(field_43, -359603412324820276L, var4).field_48y;
                  var10001 = 5;
               }

               if (var13 % var10001 == 0) {
                  this.field_42 = (int)recovery$indy$53(this.settingHeight, var6, -358036109071898855L, var4);
                  recovery$indy$54(this, -359682180951271013L, var4);
                  recovery$indy$55(this, var8, var9, -359937443694432273L, var4);
               }
            }

            var10000 = this;
         }

         recovery$indy$57(var10000, var10, (int)recovery$indy$56(this.settingScale, var6, -358036109071898855L, var4), -359187732073207987L, var4);
      }
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      int var6 = (int)((var4 ^ 104550486564094L) >>> 32);
      int var7 = (int)((var4 ^ 104550486564094L) << 32 >>> 32);
      if (recovery$indy$58(field_43, 2729414828402609408L, var4) != null) {
         recovery$indy$59(this, var6, var7, 2729868289246884108L, var4);
      }
   }

   public MiniMap_47Hy(long var1) {
      super("MiniMap", "TomTom", ((a ^ var1) ^ 7873550015580L), new Color(92, 214, 98), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 31845780173029L;
      long var5 = var1 ^ 109664467518376L;
      long var7 = var1 ^ 66197285859341L;
      long var9 = var1 ^ 100422859374528L;
      long var11 = var1 ^ 7873550015580L;
      // Super arguments moved to the required Java constructor position.
      this.settingHeight = new NumberSetting(this, "Height", 255.0, var9, 0.0, 255.0, 0);
      this.settingPosX = new NumberSetting(this, "PosX", 0.0, var9, 0.0, 100.0, 2);
      this.settingPosY = new NumberSetting(this, "PosY", 20.0, var9, 0.0, 100.0, 2);
      this.settingSize = new NumberSetting(this, "Size", 200.0, var9, 10.0, 400.0, 0);
      this.settingScale = new NumberSetting(this, "Scale", 100.0, var9, 50.0, 400.0, 2);
      ShaderOptions var10001 = new ShaderOptions(this, var3);
      long var10003 = -3031956486119987854L;
      long var13 = var7;
      ShaderOptions var15 = var10001;
      var10001 = var15.method_42$7d3e47ba5c(var13);
      long var10004 = -3031049321822934664L;
      Color var16 = Color.black;
      long var17 = var5;
      ShaderOptions var19 = var10001;
      this.field_41 = var19.method_44$10ed55120d(var17, var16);
      this.field_48 = new Long2ObjectOpenHashMap();
      this.field_438 = 5;
      this.field_43p = 5;
      this.field_46 = (int[][])null;
      this.field_40 = null;
      this.field_43y = -1;
      this.field_42 = 255;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int recovery$indy$1(Object var0, long var1, long var3);

   private static native int recovery$indy$2(Object var0, long var1, long var3);

   private static native void recovery$indy$3(Object var0, short var1, int var2, int var3, long var4, long var6, long var8);

   private static native int[][][] recovery$indy$4(Object var0, long var1, int var3, int var4, long var5, long var7);

   private static native int[] recovery$indy$5(long var0, long var2);

   private static native WorldClient recovery$indy$6(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$7(Object var0, long var1, long var3);

   private static native int[] recovery$indy$8(long var0, long var2);

   private static native int[] recovery$indy$9(long var0, long var2);

   private static native WorldClient recovery$indy$10(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$11(Object var0, long var1, long var3);

   private static native void recovery$indy$12(Object var0, short var1, int var2, int var3, long var4, long var6, long var8);

   private static native int[] recovery$indy$13(long var0, long var2);

   private static native void recovery$indy$14(Object var0, int var1, int var2, Object var3, long var4, long var6);

   private static native int[] recovery$indy$15(long var0, long var2);

   private static native int recovery$indy$16(Object var0, int var1, int var2, long var3, long var5);

   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4);

   private static native int recovery$indy$18(Object var0, int var1, int var2, long var3, long var5);

   private static native void recovery$indy$19(Object var0, int var1, long var2, Object var4, long var5, long var7);

   private static native void recovery$indy$20(Object var0, Object var1, int var2, Object var3, int var4, int var5, long var6, long var8, long var10);

   private static native double recovery$indy$21(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$22(Object var0, long var1, long var3, long var5);

   private static native double recovery$indy$23(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$24(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$25(boolean var0, boolean var1, long var2, long var4, long var6);

   private static native C_47Fw recovery$indy$26(MiniMap_47Hy var0, ScaledResolution var1, int var2);

   private static native void recovery$indy$27(boolean var0, long var1, Object var3, long var4, long var6);

   private static native int[] recovery$indy$28(long var0, long var2);

   private static native WorldClient recovery$indy$29(Object var0, long var1, long var3);

   private static native int recovery$indy$30(Object var0, long var1, long var3);

   private static native int recovery$indy$31(Object var0, long var1, long var3);

   private static native int recovery$indy$32(Object var0, long var1, long var3);

   private static native int[][][] recovery$indy$33(Object var0, long var1, int var3, int var4, long var5, long var7);

   private static native C_47UZ recovery$indy$34(Object var0, long var1, long var3);

   private static native C_47Ri recovery$indy$35(Object var0, long var1, Object var3, long var4, long var6);

   private static native WorldClient recovery$indy$36(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$37(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$38(Object var0, long var1, long var3);

   private static native int[] recovery$indy$39(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$40(Object var0, long var1, long var3);

   private static native int[][][] recovery$indy$41(Object var0, long var1, int var3, int var4, long var5, long var7);

   private static native int[] recovery$indy$42(long var0, long var2);

   private static native void recovery$indy$43(Object var0, long var1, long var3);

   private static native void recovery$indy$44(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$45(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$46(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$47(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$48(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$49(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$50(Object var0, long var1, long var3);

   private static native double recovery$indy$51(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$52(Object var0, long var1, long var3);

   private static native double recovery$indy$53(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$54(Object var0, long var1, long var3);

   private static native void recovery$indy$55(Object var0, int var1, int var2, long var3, long var5);

   private static native double recovery$indy$56(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$57(Object var0, long var1, int var3, long var4, long var6);

   private static native WorldClient recovery$indy$58(Object var0, long var1, long var3);

   private static native void recovery$indy$59(Object var0, int var1, int var2, long var3, long var5);

   private static native MethodHandle recovery$constant$60();
}
