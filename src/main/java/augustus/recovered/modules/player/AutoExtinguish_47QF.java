package augustus.recovered.modules.player;

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
import net.C_42R;
import net.C_472n;
import net.C_475c;
import net.C_475y;
import net.C_476q;
import net.C_477r;
import net.C_478Q;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47ET;
import net.C_47F9;
import net.C_47Ij;
import net.C_47MO;
import client.module.Module;
import net.C_47S6;
import client.setting.BooleanSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.C_47UZ;
import net.C_47Xe;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47i;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import net.C_47oY;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47sk;
import client.module.Category;
import net.C_47tU;
import net.C_47tf;
import net.C_47xz;
import net.C_484;
import net.C_48T;
import net.C_4f;

public class AutoExtinguish_47QF extends Module implements C_47xz, C_47UH, C_48T, C_47oO, C_47hi {
   private final RangeSetting settingVerticalSpeed;
   private final BooleanSetting settingRandomizeYaw;
   private final BooleanSetting settingNotWhileKillAura;
   private int field_42;
   private int field_438;
   private C_47tf field_44;
   private C_478Q field_46;
   private int field_43y;
   private static final long a = C_4f.a(-7925454148532320174L, 2544027243634387794L, MethodHandles.lookup().lookupClass()).a(204858754444436L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[61];
   private static final String[] f = new String[61];

   private static native String b(int var0, long var1);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Class b(long var0, long var2);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native String b(byte[] var0);

   private static native int a(long var0, long var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Field a(Class var0, String var1, Class var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   @Override
   public void method_41$fae8de1664(C_475c var1) {
      net.C_47tf var49;
      augustus.recovered.modules.player.AutoExtinguish_47QF var50;
      augustus.recovered.modules.player.AutoExtinguish_47QF var52;
      augustus.recovered.modules.player.AutoExtinguish_47QF var53;
      long var2 = a ^ 84596306425352L;
      long var4 = (var2 ^ 93994519563978L) >>> 16;
      int var6 = (int)((var2 ^ 93994519563978L) << 48 >>> 48);
      long var10001 = var2 ^ 97745365946665L;
      int var7 = (int)((var2 ^ 97745365946665L) >>> 48);
      int var8 = (int)((var2 ^ 97745365946665L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      long var10 = (var2 ^ 102623830942173L) >>> 32;
      int var12 = (int)((var2 ^ 102623830942173L) << 32 >>> 32);
      long var10000 = -6878351071117618845L;
      boolean var13 = AirStuck_47Q4.method_45$aae029aa0a();
      short var10002 = (short)var6;
      long var10003 = -6879015951257499218L;
      short var16 = var10002;
      long var17 = var4;
      AutoExtinguish_47QF var19 = this;
      int var48 = (int) ((var19.method_48$384d43a63a(var17, var16)) ? 1 : 0);
      if (var13) {
         if (var48 == 0) {
            return;
         }

         this.field_43y++;
         var48 = this.field_42;
      }

      if (var13) {
         if (var48 < 0) {
            return;
         }

         var48 = this.field_438;
      }

      if (var13) {
         if (var48 < 0) {
            return;
         }

         var48 = this.field_42;
      }

      if (var13) {
         long var69 = -6878710179233382336L;
         Minecraft var20 = field_43;
         if (var48 != var20.field_42P.field_42X.field_42) {
            return;
         }

         var10001 = -6877032309787786720L;
         C_47S6 var21 = ClientGlobals.field_46;
         float var80;
         var48 = (var80 = var21.method_44$4f8050086d().field_41 - 88.0F) == 0.0F ? 0 : (var80 < 0.0F ? -1 : 1);
      }

      label236: {
         label200: {
            label199: {
               if (var48 > 0) {
                  var49 = this.field_44;
                  if (!var13) {
                     break label200;
                  }

                  if (this.field_44 == null) {
                     var50 = this;
                     if (!var13) {
                        break label199;
                     }

                     char var60 = (char)var7;
                     var10002 = (short)var8;
                     long var10004 = -6878919914412653801L;
                     int var22 = var9;
                     short var23 = var10002;
                     char var24 = var60;
                     AutoExtinguish_47QF var25 = this;
                     if (var25.method_45$5805b0149c(var24, var23, var22)) {
                        long var71 = -6877866540296322968L;
                        byte var26 = 1;
                        C_475c var27 = var1;
                        var27.method_48$d00df7729d(var26);
                        Runnable var61 = recovery$indy$1(this);
                        long var72 = -6880481188156687352L;
                        Runnable var28 = var61;
                        C_475c var29 = var1;
                        var29.method_47$f98697054d(var28);
                        if (var13) {
                           return;
                        }
                     }
                  }
               }

               var50 = this;
            }

            var49 = var50.field_44;
         }

         if (var13) {
            if (var49 == null) {
               return;
            }

            long var73 = -6878710179233382336L;
            Minecraft var30 = field_43;
            int var62 = (int)var30.field_42P.field_438;
            long var78 = -6877959486708589258L;
            int var31 = var12;
            long var32 = var10;
            int var34 = var62;
            AutoExtinguish_47QF var35 = this;
            var49 = var35.method_40$98987938d7(var34, var32, var31);
         }

         C_47tf var14 = var49;
         C_47tf var51 = var14;
         if (var13) {
            if (var14 == null) {
               var52 = this;
               if (!var13) {
                  break label236;
               }

               if (this.field_43y > 2) {
                  var52 = this;
                  break label236;
               }
            }

            var51 = var14;
         }

         label220: {
            if (var13) {
               if (var51 != null) {
                  this.field_44 = var14;
               }

               var53 = this;
               if (!var13) {
                  break label220;
               }

               var51 = this.field_44;
            }

            if (var51 == null) {
               return;
            }

            var53 = this;
         }

         int var54 = var53.field_43y;
         if (var13) {
            if (var53.field_43y <= 0) {
               return;
            }

            char var63 = (char)var7;
            var10002 = (short)var8;
            long var79 = -6878919914412653801L;
            int var36 = var9;
            short var37 = var10002;
            char var38 = var63;
            AutoExtinguish_47QF var39 = this;
            var54 = (int) ((var39.method_45$5805b0149c(var38, var37, var36)) ? 1 : 0);
         }

         if (var54 == 0) {
            var10001 = -6879156804118822278L;
            Minecraft var40 = field_43;
            C_47Ij var55 = var40.field_42Y;
            if (var13) {
               if (var40.field_42Y == null) {
                  return;
               }

               var10001 = -6878022815628306564L;
               Minecraft var41 = field_43;
               var55 = var41.field_44V;
            }

            if (var13) {
               if (var55 == null) {
                  return;
               }

               var10001 = -6879156804118822278L;
               Minecraft var42 = field_43;
               var55 = var42.field_42Y;
            }

            C_47Az var56 = var55.field_49;
            C_47Az var67 = C_47Az.BLOCK;
            if (var13) {
               if (var55.field_49 != C_47Az.BLOCK) {
                  return;
               }

               var10001 = -6878022815628306564L;
               Minecraft var43 = field_43;
               var56 = var43.field_44V.field_49;
               var67 = C_47Az.BLOCK;
            }

            if (var56 == var67) {
               C_478Q var57 = this.field_46;
               if (var13) {
                  if (this.field_46 == null) {
                     return;
                  }

                  var57 = new C_478Q(this.field_44.field_40, this.field_44.field_41, this.field_44.field_47);
               }

               C_478Q var15 = var57;
               long var75 = -6879156804118822278L;
               Minecraft var44 = field_43;
               boolean var58 = var15.method_40$91754b766b(var44.field_42Y.method_49$5730377d31());
               if (var13) {
                  if (!var58) {
                     return;
                  }

                  long var76 = -6878022815628306564L;
                  Minecraft var45 = field_43;
                  var58 = var15.method_40$91754b766b(var45.field_44V.method_49$5730377d31());
               }

               if (var58) {
                  long var77 = -6877866540296322968L;
                  byte var46 = 1;
                  C_475c var47 = var1;
                  var47.method_48$d00df7729d(var46);
                  this.field_44 = null;
                  this.field_43y = 0;
               }
            }
         }

         return;
      }

      var52.field_44 = null;
   }

   private C_47tf method_41$cce0f88426(int var1, int var2, int var3, long var4, int var6) {
      long var7 = ((long)var3 << 32 | var4 << 32 >>> 32) ^ a;
      long var9 = var7 ^ 121305271238197L;
      C_484[] var12 = C_484.method_47$072136b832();
      boolean var10000 = recovery$indy$2(464478340838389658L, var7);
      int var13 = var12.length;
      boolean var11 = var10000;
      int var14 = 0;

      while (var14 < var13) {
         C_484 var15 = var12[var14];
         C_47UZ var16 = recovery$indy$3(field_43, 464078856921927202L, var7)
            .method_49$0bfd666c6c(var1 + var15.method_49$8abf5c6871(), var2 + var15.method_47$8abf5c6871(), var6 + var15.method_40$8abf5c6871());
         var10000 = var11;
         if (var3 > 0) {
            if (var11) {
               if (var16.method_48$e084f7739d().method_49$a32a680f8b() != C_47Xe.field_477) {
                  return recovery$indy$4(this, var1, var2, var6, var9, var15, 465115967518687687L, var7);
               }

               var14++;
            }

            var10000 = var11;
         }

         if (!var10000) {
            break;
         }
      }

      return null;
   }

   private C_47tf method_40$98987938d7(int var1, long var2, int var4) {
      long var5 = (var2 << 32 | (long)var4 << 32 >>> 32) ^ a;
      int var7 = (int)((var5 ^ 76854730852132L) >>> 32);
      long var8 = (var5 ^ 76854730852132L) << 32 >>> 32;
      byte var10 = (byte) ((recovery$indy$5(1719133164021016328L, var5)) ? 1 : 0);
      int var11 = -10;

      label56:
      while (true) {
         int var10000 = var11;

         label54:
         while (var10000 <= 10) {
            int var12 = -10;

            while (var12 <= 10) {
               C_47UZ var13 = recovery$indy$6(field_43, 1718322211614285706L, var5)
                  .method_49$0bfd666c6c(
                     C_47sk.method_47$b4643774d1(recovery$indy$7(field_43, 1718396532946564881L, var5).field_48Q + var11),
                     var1,
                     C_47sk.method_47$b4643774d1(recovery$indy$8(field_43, 1718396532946564881L, var5).field_42o + var12)
                  );
               C_475y var14 = var13.method_48$e084f7739d();
               byte var15 = var10;
               if (var4 >= 0) {
                  if (var10 == 0) {
                     var10000 = (int) ((var14 instanceof C_47ET) ? 1 : 0);
                     if (var10 != 0) {
                        continue label54;
                     }

                     if (var10000 != 0 && (Integer)var13.method_49$baa9c66b68(C_47ET.field_44) == 0 && var14.method_49$a32a680f8b() == C_47Xe.field_47G) {
                        return recovery$indy$11(
                           this,
                           C_47sk.method_47$b4643774d1(recovery$indy$9(field_43, 1718396532946564881L, var5).field_48Q + var11),
                           var1,
                           var7,
                           var8,
                           C_47sk.method_47$b4643774d1(recovery$indy$10(field_43, 1718396532946564881L, var5).field_42o + var12),
                           1718609747605348537L,
                           var5
                        );
                     }

                     var12++;
                  }

                  var15 = var10;
               }

               if (var15 != 0) {
                  break;
               }
            }

            var11++;
            var10000 = var10;
            if (var4 >= 0) {
               if (var10 != 0) {
                  return null;
               }
               continue label56;
            }
         }

         return null;
      }
   }

   private void method_44$da8c82d5d4() {
      net.minecraft.client.Minecraft var22;
      long var1 = a ^ 10050479418426L;
      long var10001 = var1 ^ 93194777180469L;
      int var3 = (int)((var1 ^ 93194777180469L) >>> 32);
      int var4 = (int)((var1 ^ 93194777180469L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var10000 = -380340493134984597L;
      boolean var6 = AirStuck_47Q4.method_419$aae029aa0a();
      var10001 = -379966474921240504L;
      Minecraft var7 = field_43;
      C_47Ij var21 = var7.field_42Y;
      if (!var6) {
         if (var7.field_42Y == null) {
            return;
         }

         var10001 = -379966474921240504L;
         Minecraft var8 = field_43;
         var21 = var8.field_42Y;
      }

      if (!var6) {
         if (var21.field_49 != C_47Az.BLOCK) {
            return;
         }

         var10001 = -378830802836058802L;
         Minecraft var9 = field_43;
         var21 = var9.field_44V;
      }

      if (!var6) {
         if (var21 == null) {
            return;
         }

         var10001 = -378830802836058802L;
         Minecraft var10 = field_43;
         var21 = var10.field_44V;
      }

      label64: {
         if (!var6) {
            if (var21.field_49 != C_47Az.BLOCK) {
               return;
            }

            var22 = field_43;
            if (var6) {
               break label64;
            }

            var10001 = -379966474921240504L;
            Minecraft var11 = field_43;
            var21 = var11.field_42Y;
         }

         C_478Q var23 = var21.method_49$5730377d31();
         long var10002 = -378830802836058802L;
         Minecraft var12 = field_43;
         if (!var23.method_40$91754b766b(var12.field_44V.method_49$5730377d31())) {
            return;
         }

         var22 = field_43;
      }

      var10001 = -378477214479938972L;
      Minecraft var13 = var22;
      var13.method_41$da8c82d5d4();
      long var10003 = -379966474921240504L;
      Minecraft var14 = field_43;
      char var10004 = (char)var4;
      short var10005 = (short)var5;
      long var10006 = -379379001116176747L;
      short var15 = var10005;
      char var16 = var10004;
      int var17 = var3;
      C_47Ij var18 = var14.field_42Y;
      AutoExtinguish_47QF var19 = this;
      this.field_44 = var19.method_43$6c149b6cff(var18, var17, var16, var15);
      long var30 = -379966474921240504L;
      Minecraft var20 = field_43;
      this.field_46 = var20.field_42Y.method_49$5730377d31();
      this.field_43y = 0;
   }

   private boolean method_48$384d43a63a(long var1, short var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 117113648854685L;
      boolean var8 = recovery$indy$12(4092820606538401823L, var4);
      boolean var10000 = recovery$indy$13(field_43, 4093254438758432173L, var4);
      if (!var8) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$14(this.settingNotWhileKillAura, 4090946869555480702L, var4);
      }

      if (var8) {
         return var10000;
      }

      if (!var10000) {
         return true;
      }

      var10000 = recovery$indy$15(ClientGlobals.field_48.field_48Q, var6, 4092916156866501769L, var4);
      return var8 ? var10000 : !var10000 || ClientGlobals.field_48.field_48Q.field_45z == null;
   }

   private int method_49$8694c4a861(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      boolean var6 = recovery$indy$16(-5800813207403536745L, var4);
      int var7 = 36;

      while (var7 < recovery$indy$17(field_43, -5801332643435622476L, var4).field_429.field_46.size()) {
         C_47rf var8 = recovery$indy$18(field_43, -5801332643435622476L, var4).field_429.method_46$4c10532da1(var7).method_48$ac4db64966();
         byte var10000 = (byte) ((var6) ? 1 : 0);
         if (var1 > 0L) {
            if (var6) {
               if (var8 != null) {
                  if (this.field_44 == null) {
                     if (var8.method_48$dbd570a038().equals(C_42R.field_457)) {
                        return var7 - 36;
                     }
                  } else {
                     var10000 = (byte) ((var8.method_48$dbd570a038().equals(C_42R.field_47Z)) ? 1 : 0);
                     if (!var6) {
                        return var10000;
                     }

                     if (var10000 != 0) {
                        return var7 - 36;
                     }
                  }
               }

               var7++;
            }

            var10000 = (byte) ((var6) ? 1 : 0);
         }

         if (!(var10000 != 0)) {
            break;
         }
      }

      return -1;
   }

   @Override
   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_42 = -1;
      this.field_438 = -1;
      this.field_44 = null;
   }

   private boolean method_45$5805b0149c(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 113359040276862L;
      boolean var8 = recovery$indy$19(-1788451781448952122L, var4);
      EntityPlayerSP var10000 = recovery$indy$20(field_43, -1788776529834604571L, var4);
      if (var8) {
         if (var10000 == null) {
            return false;
         }

         var10000 = recovery$indy$21(field_43, -1788776529834604571L, var4);
      }

      boolean var9 = var10000.method_45$aae029aa0a();
      boolean var10001 = var8;
      if (var2 > 0) {
         if (var8) {
            if (!var9) {
               return false;
            }

            var9 = recovery$indy$22(ClientGlobals.field_48.field_46q, var6, -1787937754049428630L, var4);
         }

         var10001 = var8;
      }

      if (var1 >= 0) {
         if (var10001) {
            if (var9) {
               return false;
            }

            var9 = recovery$indy$23(field_43, -1788776529834604571L, var4).method_41$e45115c4cf(C_47oY.field_45);
         }

         var10001 = var8;
      }

      return !var10001 ? var9 : !var9;
   }

   @Override
   public void method_47$05bd94f678(C_472n var1, long var2) {
      long var10001 = var2 ^ 31970059946167L;
      int var4 = (int)((var2 ^ 31970059946167L) >>> 48);
      int var5 = (int)((var2 ^ 31970059946167L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      if (recovery$indy$24(ClientGlobals.field_46, (char)var4, var5, this, (char)var6, 6398800860455870847L, var2)) {
         recovery$indy$25(var1, C_47tU.DEFAULT, 6399146983001856083L, var2);
      }
   }

   private C_47tf method_47$2450ad7e4f(long var1, C_478Q var3, C_484 var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 91581504437663L;
      return recovery$indy$26(
         this, var3.method_40$8abf5c6871(), var3.method_43$8abf5c6871(), var3.method_47$8abf5c6871(), var5, var4, -4188820875203345811L, var1
      );
   }

   private C_47tf method_43$6c149b6cff(C_47Ij var1, int var2, char var3, short var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 57985256425044L;
      return recovery$indy$27(this, var7, var1.method_49$5730377d31(), var1.field_40, -3097275826349714318L, var5);
   }

   private C_47tf method_43$227be663bf(int var1, int var2, int var3, long var4, C_484 var6) {
      var4 = a ^ var4;
      return new C_47tf(
         var1 + (var6.method_49$8abf5c6871() == 0 ? 0.5 : var6.method_49$8abf5c6871()),
         var2 + (var6.method_47$8abf5c6871() == 0 ? 0.5 : var6.method_47$8abf5c6871()),
         var3 + (var6.method_40$8abf5c6871() == 0 ? 0.5 : var6.method_40$8abf5c6871())
      );
   }

   @Override
   public void method_40G$e45a9973e5(long var1) {
      augustus.recovered.modules.player.AutoExtinguish_47QF var38;
      byte var41;
      long var10001 = var1 ^ 6407505185672L;
      int var3 = (int)((var1 ^ 6407505185672L) >>> 32);
      int var4 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = (var1 ^ 37710901306349L) >>> 16;
      int var8 = (int)((var1 ^ 37710901306349L) << 48 >>> 48);
      var10001 = var1 ^ 52598598253582L;
      int var9 = (int)((var1 ^ 52598598253582L) >>> 48);
      int var10 = (int)((var1 ^ 52598598253582L) << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      long var12 = (var1 ^ 92759218254943L) >>> 16;
      int var14 = (int)((var1 ^ 92759218254943L) << 48 >>> 48);
      long var10000 = -3626445447229850556L;
      byte var18 = (byte) ((AirStuck_47Q4.method_45$aae029aa0a()) ? 1 : 0);
      short var10002 = (short)var8;
      long var10003 = -3625498576733444983L;
      short var19 = var10002;
      long var20 = var6;
      AutoExtinguish_47QF var22 = this;
      int var37 = (int) ((var22.method_48$384d43a63a(var20, var19)) ? 1 : 0);
      if (var18 != 0) {
         if (var37 == 0) {
            return;
         }

         this.field_438 = this.field_42;
         char var40 = (char)var9;
         var10002 = (short)var10;
         long var10004 = -3625857329682862544L;
         int var23 = var11;
         short var24 = var10002;
         char var25 = var40;
         AutoExtinguish_47QF var26 = this;
         var37 = (int) ((var26.method_45$5805b0149c(var25, var24, var23)) ? 1 : 0);
      }

      label62: {
         label67: {
            if (var18 != 0) {
               label58: {
                  label57: {
                     if (var37 == 0) {
                        var38 = this;
                        var41 = var18;
                        if (var1 <= 0L) {
                           break label58;
                        }

                        if (var18 == 0) {
                           break label57;
                        }

                        if (this.field_44 == null) {
                           return;
                        }
                     }

                     char var43 = (char)var14;
                     long var45 = -3626193620230568609L;
                     char var27 = var43;
                     long var28 = var12;
                     AutoExtinguish_47QF var30 = this;
                     this.field_42 = var30.method_49$8694c4a861(var28, var27);
                     var38 = this;
                  }

                  var41 = var18;
               }

               if (var1 <= 0L) {
                  break label62;
               }

               if (var41 == 0) {
                  break label67;
               }

               var37 = var38.field_42;
            }

            if (var37 < 0) {
               return;
            }

            var38 = this;
         }

         var41 = -2;
      }

      int var15 = this.field_42;
      byte var16 = var41;
      AutoExtinguish_47QF var17 = var38;
      char var44 = (char)var4;
      char var46 = (char)var5;
      long var10006 = -3626938609081836708L;
      int var31 = var15;
      char var32 = var46;
      char var33 = var44;
      byte var34 = var16;
      AutoExtinguish_47QF var35 = var17;
      int var36 = var3;
      C_47i.method_43$95cbd1eb82(var36, var35, var34, var33, var32, var31);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$28(this, 40, var3, -7099939171143421626L, var1);
      recovery$indy$29(this, 7, var3, -7099939171143421626L, var1);
      recovery$indy$30(this, 34, var3, -7099939171143421626L, var1);
      recovery$indy$31(this, 17, var3, -7099939171143421626L, var1);
      recovery$indy$32(this, 21, var3, -7099939171143421626L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      this.field_42 = -1;
      this.field_438 = -1;
      this.field_44 = null;
      this.field_46 = null;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   @Override
   public void method_487$da8c82d5d4() {
      augustus.recovered.modules.player.AutoExtinguish_47QF var84;
      long var1 = a ^ 71037411939032L;
      long var3 = var1 ^ 22502643357782L;
      long var5 = var1 ^ 17270656638515L;
      long var7 = (var1 ^ 97959589734938L) >>> 16;
      int var9 = (int)((var1 ^ 97959589734938L) << 48 >>> 48);
      long var10001 = var1 ^ 92965350389241L;
      int var10 = (int)((var1 ^ 92965350389241L) >>> 48);
      int var11 = (int)((var1 ^ 92965350389241L) << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      long var13 = var1 ^ 26741507650058L;
      var10001 = var1 ^ 16289646350217L;
      int var15 = (int)((var1 ^ 16289646350217L) >>> 48);
      int var16 = (int)((var1 ^ 16289646350217L) << 16 >>> 48);
      int var17 = (int)(var10001 << 32 >>> 32);
      var10001 = var1 ^ 138410340241604L;
      int var18 = (int)((var1 ^ 138410340241604L) >>> 48);
      int var19 = (int)((var1 ^ 138410340241604L) << 16 >>> 32);
      int var20 = (int)(var10001 << 48 >>> 48);
      long var10000 = -4297775105521207885L;
      boolean var21 = AirStuck_47Q4.method_45$aae029aa0a();
      short var10002 = (short)var9;
      long var10003 = -4298440535415034498L;
      short var24 = var10002;
      long var25 = var7;
      AutoExtinguish_47QF var27 = this;
      int var83 = (int) ((var27.method_48$384d43a63a(var25, var24)) ? 1 : 0);
      if (var21) {
         if (var83 == 0) {
            return;
         }

         char var89 = (char)var10;
         var10002 = (short)var11;
         long var10004 = -4298361885202470969L;
         int var28 = var12;
         short var29 = var10002;
         char var30 = var89;
         AutoExtinguish_47QF var31 = this;
         var83 = (int) ((var31.method_45$5805b0149c(var30, var29, var28)) ? 1 : 0);
      }

      label87: {
         if (var21) {
            label78: {
               if (var83 == 0) {
                  var84 = this;
                  if (!var21) {
                     break label78;
                  }

                  if (this.field_44 == null) {
                     return;
                  }
               }

               var84 = this;
            }

            if (!var21) {
               break label87;
            }

            var83 = var84.field_42;
         }

         if (var83 < 0) {
            return;
         }

         var84 = this;
      }

      C_47tf var85 = var84.field_44;
      if (var21) {
         if (var84.field_44 == null) {
            var10001 = -4296482526886074640L;
            C_47S6 var32 = ClientGlobals.field_46;
            var10002 = (short)var15;
            float var91 = var32.method_44$4f8050086d().field_41;
            long var108 = -4296522018201399180L;
            RangeSetting var33 = this.settingVerticalSpeed;
            float var100 = (float)var33.method_43$fedcb3e4d3();
            char var10005 = (char)var16;
            long var10006 = -4298065965581227277L;
            float var22 = C_47gg.method_44$558c5d3f22(var10002, var91, 90.0F, var10005, var17, var100);
            long var97 = -4296482526886074640L;
            C_47S6 var34 = ClientGlobals.field_46;
            if (var22 != var34.method_44$4f8050086d().field_41) {
               var10001 = -4296482526886074640L;
               C_47S6 var35 = ClientGlobals.field_46;
               C_477r var23 = var35.method_44$4f8050086d();
               var23.field_41 = var22;
               if (var21) {
                  var10001 = -4299842799382285080L;
                  BooleanSetting var36 = this.settingRandomizeYaw;
                  if (var36.method_49$aae029aa0a() && var22 < 88.0F) {
                     var10006 = -4296744076936074709L;
                     float var37 = 2.0F;
                     long var38 = var3;
                     float var40 = -2.0F;
                     C_47MO var41 = C_476q.field_48;
                     var23.field_44 = var23.field_44 + var41.method_48$4ed2fe9101(var40, var38, var37);
                  }

                  var10003 = -4296482526886074640L;
                  C_47S6 var42 = ClientGlobals.field_46;
                  C_477r var98 = var42.method_44$4f8050086d();
                  var10003 = -4297094382060083098L;
                  C_477r var43 = var98;
                  C_477r var44 = var23;
                  long var45 = var5;
                  var23 = C_47gg.method_49$c311864491(var45, var44, var43);
               }

               char var103 = (char)var18;
               long var10007 = -4298296855188277879L;
               AutoExtinguish_47QF var47 = this;
               int var48 = var20;
               int var49 = var19;
               char var50 = var103;
               byte var51 = -2;
               C_477r var52 = var23;
               C_47S6 var53 = ClientGlobals.field_46;
               var53.method_45$c163d5afc8(var52, var51, var50, var49, var48, var47);
            }

            if (var21) {
               return;
            }
         }

         var85 = this.field_44;
      }

      double var86 = var85.field_40;
      double var94 = this.field_44.field_41;
      double var104 = this.field_44.field_47;
      long var110 = -4296482526886074640L;
      C_47S6 var54 = ClientGlobals.field_46;
      C_477r var109 = var54.method_44$4f8050086d();
      long var113 = -4296522018201399180L;
      RangeSetting var55 = this.settingVerticalSpeed;
      float var111 = (float)var55.method_43$fedcb3e4d3();
      long var115 = -4296522018201399180L;
      RangeSetting var56 = this.settingVerticalSpeed;
      float var114 = (float)var56.method_43$fedcb3e4d3();
      long var10008 = -4296987166348917501L;
      boolean var57 = true;
      float var58 = var114;
      float var59 = var111;
      C_477r var60 = var109;
      double var61 = var104;
      long var63 = var13;
      double var65 = var94;
      double var67 = var86;
      C_477r var81 = C_47gg.method_48$63715048f6(var67, var65, var63, var61, var60, var59, var58, var57);
      var10003 = -4296482526886074640L;
      C_47S6 var69 = ClientGlobals.field_46;
      C_477r var99 = var69.method_44$4f8050086d();
      var10003 = -4297094382060083098L;
      C_477r var70 = var99;
      C_477r var71 = var81;
      long var72 = var5;
      var81 = C_47gg.method_49$c311864491(var72, var71, var70);
      char var107 = (char)var18;
      var115 = -4298296855188277879L;
      AutoExtinguish_47QF var74 = this;
      int var75 = var20;
      int var76 = var19;
      char var77 = var107;
      byte var78 = -2;
      C_477r var79 = var81;
      C_47S6 var80 = ClientGlobals.field_46;
      var80.method_45$c163d5afc8(var79, var78, var77, var76, var75, var74);
   }

   public AutoExtinguish_47QF(long var1, short var3) {
      super("AutoExtinguish", "AutomatischesLöschen", (((var1 << 16 | (long)var3 << 48 >>> 48) ^ a) ^ 122460090244683L), new Color(252, 152, 3), Category.PLAYER);
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var10001 = var4 ^ 10087170056915L;
      int var6 = (int)((var4 ^ 10087170056915L) >>> 32);
      int var7 = (int)((var4 ^ 10087170056915L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var4 ^ 33281526153808L;
      long var11 = var4 ^ 122460090244683L;
      // Super arguments moved to the required Java constructor position.
      this.settingVerticalSpeed = new RangeSetting(var6, this, "Vertical Speed", 15.0, 30.0, (short)var7, 0.0, 180.0, 0, (short)var8);
      this.settingRandomizeYaw = new BooleanSetting(this, var9, "RandomizeYaw", true);
      this.settingNotWhileKillAura = new BooleanSetting(this, var9, "NotWhileKillAura", false);
      this.field_42 = -1;
      this.field_438 = -1;
      this.field_44 = null;
      this.field_46 = null;
      this.field_43y = 0;
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native Runnable recovery$indy$1(AutoExtinguish_47QF var0);

   private static native boolean recovery$indy$2(long var0, long var2);

   private static native WorldClient recovery$indy$3(Object var0, long var1, long var3);

   private static native C_47tf recovery$indy$4(Object var0, int var1, int var2, int var3, long var4, Object var6, long var7, long var9);

   private static native boolean recovery$indy$5(long var0, long var2);

   private static native WorldClient recovery$indy$6(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);

   private static native C_47tf recovery$indy$11(Object var0, int var1, int var2, int var3, long var4, int var6, long var7, long var9);

   private static native boolean recovery$indy$12(long var0, long var2);

   private static native boolean recovery$indy$13(Object var0, long var1, long var3);

   private static native boolean recovery$indy$14(Object var0, long var1, long var3);

   private static native boolean recovery$indy$15(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$16(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$17(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);

   private static native boolean recovery$indy$19(long var0, long var2);

   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);

   private static native boolean recovery$indy$22(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);

   private static native boolean recovery$indy$24(Object var0, char var1, int var2, Object var3, char var4, long var5, long var7);

   private static native void recovery$indy$25(Object var0, Object var1, long var2, long var4);

   private static native C_47tf recovery$indy$26(Object var0, int var1, int var2, int var3, long var4, Object var6, long var7, long var9);

   private static native C_47tf recovery$indy$27(Object var0, long var1, Object var3, Object var4, long var5, long var7);

   private static native void recovery$indy$28(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$29(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$30(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$31(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$32(Object var0, int var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$33();
}
