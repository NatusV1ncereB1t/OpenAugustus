package augustus.recovered.modules.render;
import augustus.recovered.modules.misc.MurdererFinder_47kg;
import augustus.recovered.modules.movement.FreeCam_47kJ;
import augustus.recovered.modules.movement.Jesus_47kW;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_42R;
import net.C_45n;
import net.C_46m;
import net.C_478Q;
import net.C_478i;
import net.C_478k;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47BP;
import net.C_47Ij;
import net.C_47Il;
import net.minecraft.entity.Entity;
import net.C_47MU;
import client.module.Module;
import client.module.ModuleManager;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47TY;
import client.setting.ColorSetting;
import client.event.RenderListener;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47dF;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47ho;
import net.C_47j9;
import net.minecraft.client.Minecraft;
import net.C_47nU;
import client.ClientGlobals;
import net.C_47rf;
import client.render.RenderUtils;
import net.C_47sk;
import net.C_47tC;
import client.module.Category;
import net.C_47tf;
import net.C_47vQ;
import net.C_47xz;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Pathfinder_47HZ extends client.module.Module implements client.event.RenderListener,net.C_47xz,net.C_47dF {
    private client.setting.SettingGroup settingAutoTarget; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAutoTarget2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingChooseTargetByPathLength = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaxConsideredTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingMurderMystery = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaxSearchtimePerTick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaxSteps = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingTicksBetweenSearches = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMaxFallHeight = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDiscourageFalldamage = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingDiscourageFalldamageFactor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TY settingPickTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TY settingResetPickedTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingPathColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingTargetColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.Entity field_46A; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.ArrayList field_43h; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.ArrayList field_43W; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.ArrayList field_46V; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.Entity field_46J; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47nU field_46b; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_478i field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_46m field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_46B; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

   private void method_42$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 130364095127638L;
      int var3 = (int)((var1 ^ 130364095127638L) >>> 32);
      int var4 = (int)((var1 ^ 130364095127638L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 6605026661575L;
      long var8 = var1 ^ 98303681612225L;
      long var10 = var1 ^ 73759612706148L;
      this.field_46V.clear();
      net.minecraft.client.Minecraft var19 = field_43;
      net.C_47tf var13 = var19.field_42P.method_42$41b79b67a0(1.0F);
      int[] var10000 = AntiStrike_47Qa.method_42$d4d28024c9();
      net.C_47nU var14 = new net.C_47nU((int)Math.floor(var13.field_40), (int)Math.floor(var13.field_41), (int)Math.floor(var13.field_47));
      net.C_47nU var15 = null;
      net.minecraft.entity.Entity var16 = null;
      int[] var12 = var10000;
      boolean var17 = false;
      if (var12 == null) {
         if (var1 > 0L) {
            if (this.field_46J != null) {
               net.C_47tf var46 = this.field_46J.method_42$41b79b67a0(1.0F);
               var15 = new net.C_47nU((int)Math.floor(var46.field_40), (int)Math.floor(var46.field_41), (int)Math.floor(var46.field_47));
            } else if (this.field_46b != null) {
               var15 = this.field_46b;
            } else {
               client.setting.BooleanSetting var48 = this.settingAutoTarget2;
               if (var48.method_49$aae029aa0a()) {
                  client.setting.BooleanSetting var21 = this.settingChooseTargetByPathLength;
                  if (var21.method_49$aae029aa0a()) {
                     long var49 = var10;
                     Pathfinder_47HZ var50 = this;
                     var50.method_45$e45a9973e5(var49);
                     if (this.field_46V.isEmpty()) {
                        this.field_43h = null;
                        this.field_46A = null;
                     }

                     return;
                  }

                  short var76 = (short)var4;
                  short var51 = (short)var5;
                  short var52 = var76;
                  int var53 = var3;
                  Pathfinder_47HZ var54 = this;
                  var16 = var54.method_41$7f218886ee(var53, var52, var51);
                  if (var16 != null) {
                     net.C_47tf var47 = var16.method_42$41b79b67a0(1.0F);
                     var15 = new net.C_47nU((int)Math.floor(var47.field_40), (int)Math.floor(var47.field_41), (int)Math.floor(var47.field_47));
                     var17 = var16 instanceof C_47BP;
                  }
               }
            }

            if (var15 != null) {
               this.field_46B = var13;
               java.util.ArrayList var75 = this.field_46V;
               client.Client var56 = client.Client.method_44$fbc0c0be91();
               long var58 = var6;
               augustus.recovered.modules.movement.Jesus_47kW var60 = var56.method_45$4a5eee04b7().field_41J;
               boolean var78 = var60.method_46$0dd78e0064(var58);
               boolean var62 = var17;
               boolean var64 = var78;
               net.C_47nU var66 = var15;
               net.C_47nU var68 = var14;
               long var70 = var8;
               Pathfinder_47HZ var72 = this;
               var75.add(new net.C_47O5(this, var72.method_41$e9c1f7cc9d(var70, var68, var66, var64, var62), var16));
            } else {
               this.field_43h = null;
               this.field_46A = null;
            }
         } else {
            net.C_47tf var45 = this.field_46J.method_42$41b79b67a0(1.0F);
            var15 = new net.C_47nU((int)Math.floor(var45.field_40), (int)Math.floor(var45.field_41), (int)Math.floor(var45.field_47));
            if (var15 != null) {
               this.field_46B = var13;
               java.util.ArrayList var74 = this.field_46V;
               client.Client var55 = client.Client.method_44$fbc0c0be91();
               long var57 = var6;
               augustus.recovered.modules.movement.Jesus_47kW var59 = var55.method_45$4a5eee04b7().field_41J;
               boolean var77 = var59.method_46$0dd78e0064(var57);
               boolean var61 = var17;
               boolean var63 = var77;
               net.C_47nU var65 = var15;
               net.C_47nU var67 = var14;
               long var69 = var8;
               Pathfinder_47HZ var71 = this;
               var74.add(new net.C_47O5(this, var71.method_41$e9c1f7cc9d(var69, var67, var65, var63, var61), var16));
               if (var1 < 0L) {
                  this.field_46A = null;
               }
            } else {
               this.field_43h = null;
               this.field_46A = null;
            }
         }
      } else {
         client.setting.BooleanSetting var20 = this.settingAutoTarget2;
         if (var20.method_49$aae029aa0a()) {
            long var22 = var10;
            Pathfinder_47HZ var24 = this;
            var24.method_45$e45a9973e5(var22);
            this.field_46A = null;
         } else {
            short var10002 = (short)var4;
            short var25 = (short)var5;
            short var26 = var10002;
            int var27 = var3;
            Pathfinder_47HZ var28 = this;
            var16 = var28.method_41$7f218886ee(var27, var26, var25);
            net.C_47tf var18 = var16.method_42$41b79b67a0(1.0F);
            var15 = new net.C_47nU((int)Math.floor(var18.field_40), (int)Math.floor(var18.field_41), (int)Math.floor(var18.field_47));
            var17 = var16 instanceof C_47BP;
            if (var15 != null) {
               this.field_46B = var13;
               java.util.ArrayList var73 = this.field_46V;
               client.Client var29 = client.Client.method_44$fbc0c0be91();
               long var30 = var6;
               augustus.recovered.modules.movement.Jesus_47kW var32 = var29.method_45$4a5eee04b7().field_41J;
               boolean var10008 = var32.method_46$0dd78e0064(var30);
               boolean var33 = var17;
               boolean var34 = var10008;
               net.C_47nU var35 = var15;
               net.C_47nU var36 = var14;
               long var37 = var8;
               Pathfinder_47HZ var39 = this;
               var73.add(new net.C_47O5(this, var39.method_41$e9c1f7cc9d(var37, var36, var35, var34, var33), var16));
               if (var1 >= 0L) {
                  this.field_43h = null;
                  this.field_46A = null;
               } else {
                  this.field_46A = null;
               }
            } else {
               this.field_43h = null;
               this.field_46A = null;
            }
         }
      }
   }





    private static native java.lang.reflect.Method d(long a0,long a1);

    private java.util.ArrayList method_41$bcde2c3c11(java.util.ArrayList path, long callerKey) {
        long key = recovery$indy$flow$70() ^ callerKey;
        java.util.ArrayList expanded = new java.util.ArrayList(path.size());
        Object guard = recovery$indy$flow$74(-3750742720426652941L, key);
        net.C_47tf previous = null;
        java.util.Iterator iterator = path.iterator();
        while (iterator.hasNext()) {
            Object node = ((java.lang.Object)(((net.C_47pN) (((java.lang.Object)(iterator.next()))))));
            net.C_47tf current = new net.C_47tf(
                    (double) recovery$indy$flow$81(recovery$indy$flow$80(node, -3752001540898502579L, key)),
                    (double) recovery$indy$flow$83(recovery$indy$flow$82(node, -3752001540898502579L, key)),
                    (double) recovery$indy$flow$85(recovery$indy$flow$84(node, -3752001540898502579L, key)));
            if (guard != null) break;

            if (previous != null) {
                double squaredDistance = recovery$indy$flow$87(previous, current);
                if (squaredDistance > 2.0D) {
                    double distance = Math.sqrt(squaredDistance);
                    double stepX = (recovery$indy$flow$89(current) - recovery$indy$flow$90(previous)) / distance;
                    double stepY = (recovery$indy$flow$91(current) - recovery$indy$flow$92(previous)) / distance;
                    double stepZ = (recovery$indy$flow$93(current) - recovery$indy$flow$94(previous)) / distance;
                    for (int step = 0; (double) step < distance - 1.0D; step++) {
                        previous = new net.C_47tf(recovery$indy$flow$96(previous) + stepX,
                                recovery$indy$flow$97(previous) + stepY,
                                recovery$indy$flow$98(previous) + stepZ);
                        expanded.add(recovery$indy$flow$100(previous, 0.5D, 0.0D, 0.5D));
                    }
                }
            }
            if (key <= 0L) return expanded;
            expanded.add(recovery$indy$flow$102(current, 0.5D, 0.0D, 0.5D));
            previous = current;
        }
        // The original negative-key exit casts the newly allocated list to a path node.
        // Retain that operation, including its ClassCastException, instead of returning early.
        if (key < 0L) recovery$indy$flow$78(expanded);
        return expanded;
    }




   private C_47ho method_41$e9c1f7cc9d(long var1, C_47nU var3, C_47nU var4, boolean var5, boolean var6) {
      var1 = a ^ var1;
      long var7 = var1 ^ 18211284303447L;
      long var9 = var1 ^ 89862259564777L;
      C_47ho var12 = new C_47ho(var7, var3, var4, var5, true, false);
      int[] var10000 = recovery$indy$5(-423475563293476066L, var1);
      var12.field_47U = true;
      int[] var11 = var10000;
      var12.field_47m = recovery$indy$6(this.settingDiscourageFalldamage, -423347788231473678L, var1);
      var12.field_47r = 1.001 - recovery$indy$7(this.settingDiscourageFalldamageFactor, true, var9, -431635404507553917L, var1) / 100.0;
      C_47ho var14 = var12;
      if (var11 == null) {
         label20: {
            double var10001 = recovery$indy$8(this.settingMaxFallHeight, true, var9, -431635404507553917L, var1);
            if (var1 > 0L) {
               var12.field_47e = var10001;
               if (!var6) {
                  break label20;
               }

               var14 = var12;
               var10001 = 1.6;
            }

            var14.field_41 = var10001;
         }

         var14 = var12;
      }

      return var14;
   }



   private net.minecraft.entity.Entity method_41$7f218886ee(int var1, short var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 2483355966939L;
      long var8 = var4 ^ 63662510480021L;
      long var10 = var4 ^ 40798852886435L;
      net.minecraft.entity.Entity var13 = null;
      int[] var10000 = recovery$indy$9(-3204121190561721719L, var4);
      double var14 = 0.0;
      int[] var12 = var10000;
      byte var155 = ((byte) (recovery$indy$10(this.settingMurderMystery, -3204072999748293531L, var4) ? 1 : 0));
      int[] var98 = var12;
      int var21 = var155;
      if (var98 == null) {
         label159: {
            int var112 = var21;
            byte var141 = (byte)var112;
            label129:
            if (var141 != 0) {
               var112 = ((int) (recovery$indy$11(client.ClientGlobals.field_48.field_46M, var6, -3201122018289475996L, var4) ? 1 : 0));
               short var142 = var3;
               int[] var132 = var12;
               var112 = var112;
               if (var142 >= 0) {
                  var132 = var132;
                  var112 = var112;
                  var98 = var132;
                  var112 = var112;
                  if (var98 == null) {
                     var112 = var112;
                     var112 = var112;
                     int var144 = var112;
                     if (var144 == 0) {
                        break label129;
                     }

                     var112 = recovery$indy$12(var8, -3201323024164421198L, var4);
                  }

                  var132 = var12;
                  var112 = var112;
               }

               var98 = var132;
               var112 = var112;
               if (var98 == null) {
                  var112 = var112;
                  byte var153 = -1;
                  int var146 = var112;
                  if (var146 != var153) {
                     break label129;
                  }

                  var112 = 1;
               }

               var21 = var112;
               break label159;
            }

            var21 = 0;
         }

         int var16 = var21;
         java.util.Iterator var101 = recovery$indy$13(field_43, -3201566384249143596L, var4).field_44Q.iterator();

         net.minecraft.entity.Entity var124;
         while (true) {
            boolean var147 = var101.hasNext();
            if (!var147) {
               var124 = var13;
               break;
            }

            net.minecraft.entity.Entity var102 = (net.minecraft.entity.Entity)var101.next();
            short var148 = var3;
            var124 = var102;
            if (var148 <= 0) {
               break;
            }

            var124 = var124;
            var124 = var124;
            var124 = var124;
            net.minecraft.client.entity.EntityPlayerSP var154 = recovery$indy$14(field_43, -3201607004030825843L, var4);
            net.minecraft.entity.Entity var149 = var124;
            if (var149 != var154) {
               boolean var150 = recovery$indy$15(this, var10, var102, (var16 != 0), -3200276104731484865L, var4);
               if (var150) {
                  double var19 = recovery$indy$16(field_43, -3201607004030825843L, var4).method_49$ee256e8a75(var102);
                  double var25 = var19;
                  double var156;
                  int var151 = (var156 = var25 - var14) == 0.0 ? 0 : (var156 < 0.0 ? -1 : 1);
                  if (var151 >= 0) {
                     var124 = var13;
                     var124 = var124;
                     net.minecraft.entity.Entity var152 = var124;
                     if (var152 != null) {
                        continue;
                     }
                  }

                  var124 = var102;
                  var13 = var124;
                  var25 = var19;
                  var14 = var25;
               }
            }
         }

         return var124;
      } else {
         label146: {
            label154: {
               short var134 = var3;
               int[] var34 = var12;
               var21 = var21;
               if (var134 >= 0) {
                  var34 = var34;
                  var21 = var21;
                  var98 = var34;
                  var21 = var21;
                  if (var98 == null) {
                     var21 = var21;
                     var21 = var21;
                     int var136 = var21;
                     if (var136 == 0) {
                        break label154;
                     }

                     var21 = recovery$indy$12(var8, -3201323024164421198L, var4);
                  }

                  var34 = var12;
                  var21 = var21;
               }

               var98 = var34;
               var21 = var21;
               if (var98 != null) {
                  break label146;
               }

               var21 = var21;
               byte var100 = -1;
               int var138 = var21;
               if (var138 == var100) {
                  boolean var110 = true;
                  break label146;
               }
            }

            boolean var111 = false;
         }

         java.util.Iterator var17 = recovery$indy$13(field_43, -3201566384249143596L, var4).field_44Q.iterator();
         boolean var139 = var17.hasNext();
         net.minecraft.entity.Entity var27;
         if (var139) {
            net.minecraft.entity.Entity var18 = (net.minecraft.entity.Entity)var17.next();
            short var140 = var3;
            var27 = var18;
            if (var140 > 0) {
               var27 = var27;
               var27 = var27;
            }
         } else {
            var27 = var13;
         }

         return var27;
      }
   }




   private java.util.ArrayList method_41$d8436bbf74(java.util.ArrayList var1, long var2, int var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 44788758829817L;
      java.util.ArrayList var8 = new java.util.ArrayList(var1.size());
      int[] var10000 = (int[])recovery$indy$flow$144(-679504300653774960L, var2);
      net.minecraft.client.entity.EntityPlayerSP var9 = (net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$146(field_43, -682051440721711212L, var2);
      java.util.Iterator var10 = var1.iterator();
      int[] var7 = var10000;
      if (var10.hasNext()) {
         net.minecraft.entity.Entity var11 = (net.minecraft.entity.Entity)var10.next();
         if (var2 >= 0L) {
            java.util.ArrayList var13 = var8;
            if (var7 != null) {
               return var8;
            }

            while (true) {
               var13.add(new net.C_47mh(this, var11, var11.method_43$83ff7736af(var9)));
               if (!var10.hasNext()) {
                  return (java.util.ArrayList)recovery$indy$flow$156(this.field_42, var5, var8, var4, true, -679820718889222999L, var2);
               }

               var11 = (net.minecraft.entity.Entity)var10.next();
               var13 = var8;
            }
         }
      } else if (var2 >= 0L) {
         return (java.util.ArrayList)recovery$indy$flow$156(this.field_42, var5, var8, var4, true, -679820718889222999L, var2);
      }

      if (var7 != null) {
         while (true) {
         }
      }

      while (true) {
         if (var10.hasNext()) {
            var10.next();
         }
      }
   }



   public void method_40$db44232a44(long var1, C_47MU var3) {
      int[] var23;
      net.C_47Ij var24;
      augustus.recovered.modules.render.Pathfinder_47HZ var25;
      long var4 = var1 ^ 58579030619472L;
      int var6 = (int)((var1 ^ 29336012942693L) >>> 32);
      long var7 = (var1 ^ 29336012942693L) << 32 >>> 32;
      long var9 = var1 ^ 16035414373645L;
      long var11 = var1 ^ 20705045344569L;
      long var13 = var1 ^ 127283682179854L;
      long var10001 = var1 ^ 67857455028351L;
      int var15 = (int)((var1 ^ 67857455028351L) >>> 48);
      int var16 = (int)((var1 ^ 67857455028351L) << 16 >>> 48);
      int var17 = (int)(var10001 << 32 >>> 32);
      int[] var18 = recovery$indy$20(4821042399110218726L, var1);
      int var10000 = recovery$indy$21(var3, 4827717107463679423L, var1);
      int var26 = recovery$indy$22(this.settingPickTarget, var6, var7, 4820001287343538707L, var1);
      if (var18 == null) {
         if (var10000 == var26) {
            label81: {
               label80: {
                  C_47Ij var19;
                  label89: {
                     var19 = recovery$indy$23(this, var4, 4827090127436963032L, var1);
                     C_47Az var22 = var19.field_49;
                     C_47Az var27 = C_47Az.ENTITY;
                     if (var18 == null) {
                        if (var19.field_49 == C_47Az.ENTITY) {
                           if (var19.field_47 == this.field_46J) {
                              break label80;
                           }

                           this.field_46J = var19.field_47;
                           this.field_46b = null;
                           this.field_43h = null;
                           this.field_46A = null;
                           recovery$indy$24(this, var9, 4820223365501411902L, var1);
                           recovery$indy$25(this, var11, 4825857111010626385L, var1);
                           recovery$indy$26(this, var13, 4825727229893389269L, var1);
                           var23 = var18;
                           if (var1 <= 0L) {
                              break label81;
                           }

                           if (var18 == null) {
                              break label80;
                           }
                        }

                        var24 = var19;
                        if (var18 != null) {
                           break label89;
                        }

                        var22 = var19.field_49;
                        var27 = C_47Az.BLOCK;
                     }

                     if (var22 != var27) {
                        break label80;
                     }

                     var24 = var19;
                  }

                  C_478k var20 = var24.field_40.method_40$def87834e6();
                  C_478Q var21 = var19.method_49$5730377d31();
                  this.field_46b = new C_47nU(
                     var21.method_40$8abf5c6871() + var20.method_40$8abf5c6871(),
                     var21.method_43$8abf5c6871() + var20.method_43$8abf5c6871(),
                     var21.method_47$8abf5c6871() + var20.method_47$8abf5c6871()
                  );
                  this.field_40 = recovery$indy$29(
                     (char)var15,
                     (char)var16,
                     recovery$indy$27(field_43, 4827476247950192571L, var1)
                        .method_46$efbf73d2b1(var21)
                        .method_48$e084f7739d()
                        .method_42$f487e42d4b(recovery$indy$28(field_43, 4827476247950192571L, var1), var21),
                     var17,
                     var19.field_40,
                     4827580706249960097L,
                     var1
                  );
                  this.field_46J = null;
                  this.field_43h = null;
                  this.field_46A = null;
                  recovery$indy$30(this, var9, 4820223365501411902L, var1);
                  recovery$indy$31(this, var11, 4825857111010626385L, var1);
                  recovery$indy$32(this, var13, 4825727229893389269L, var1);
               }

               var23 = var18;
            }

            if (var23 == null) {
               return;
            }
         }

         var10000 = recovery$indy$33(var3, 4827717107463679423L, var1);
         var26 = recovery$indy$34(this.settingResetPickedTarget, var6, var7, 4820001287343538707L, var1);
      }

      if (var10000 == var26) {
         var25 = this;
         label57:
         if (var18 == null) {
            if (this.field_46b == null) {
               var25 = this;
               if (var18 != null) {
                  break label57;
               }

               if (this.field_46J == null) {
                  return;
               }
            }

            this.field_46b = null;
            this.field_46J = null;
            this.field_43h = null;
            this.field_46A = null;
            recovery$indy$35(this, var9, 4820223365501411902L, var1);
            var25 = this;
         }

         recovery$indy$36(var25, var11, 4825857111010626385L, var1);
      }
   }





   private void method_44$e45a9973e5(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 72127482221270L;
      this.field_43y = (int)recovery$indy$37(this.settingTicksBetweenSearches, var3, -7016553620661724011L, var1);
      this.field_46V.clear();
   }



   private C_47tf method_44$541f337caa(double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17) {
      double var19 = var1 * var13 + var3 * var15 + var5 * var17;
      double var21 = C_47sk.method_45$4b58f7ab41((var19 - (var1 * var7 + var3 * var9 + var5 * var11)) / (var1 * var1 + var3 * var3 + var5 * var5), 0.0, 1.0);
      double var23 = var7 + var21 * var1;
      double var25 = var9 + var21 * var3;
      double var27 = var11 + var21 * var5;
      return new C_47tf(var23, var25, var27);
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 40167410119812L;
      long var10000 = -7078941913018393405L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -7078814721935449553L;
      BooleanSetting var4 = this.settingAutoTarget2;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -7078814721935449553L;
         BooleanSetting var5 = this.settingChooseTargetByPathLength;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }



    private java.util.ArrayList method_49$bcde2c3c11(java.util.ArrayList pathNodes, long eventKey) {
        long decodedKey = recovery$indy$flow$232() ^ eventKey;
        recovery$indy$flow$233();
        int capacity = recovery$indy$flow$234(pathNodes);
        Object positions = recovery$indy$flow$235(capacity);
        Object flowGuard = recovery$indy$flow$236(6961993413552234908L, decodedKey);
        Object nodes = recovery$indy$flow$237(pathNodes);
        while (recovery$indy$flow$238(nodes)) {
            Object node = ((java.lang.Object)(((net.C_47pN) (((java.lang.Object)(recovery$indy$flow$239(nodes)))))));
            if (decodedKey > 0L) {
                if (flowGuard != null) {
                    return (java.util.ArrayList) positions;
                }
                recovery$indy$flow$241();
                Object xPosition = recovery$indy$flow$242(node, 6953946208091202338L, decodedKey);
                double x = (double) recovery$indy$flow$243(xPosition) + 0.5D;
                Object yPosition = recovery$indy$flow$244(node, 6953946208091202338L, decodedKey);
                double y = (double) recovery$indy$flow$245(yPosition);
                Object zPosition = recovery$indy$flow$246(node, 6953946208091202338L, decodedKey);
                double z = (double) recovery$indy$flow$247(zPosition) + 0.5D;
                Object position = recovery$indy$flow$248(x, y, z);
                recovery$indy$flow$249(positions, position);
            }
            if (flowGuard != null) {
                break;
            }
        }
        return (java.util.ArrayList) positions;
    }



   private C_47Ij method_45$992a97c4ca(long var1) {
      int var5;
      long var6;
      int[] var8;
      double var9;
      double var11;
      double var13;
      float var15;
      float var16;
      boolean var17;
      label28: {
         var1 = a ^ var1;
         long var3 = var1 ^ 36919015919790L;
         var5 = (int)((var1 ^ 32607527771146L) >>> 48);
         var6 = (var1 ^ 32607527771146L) << 16 >>> 16;
         var9 = recovery$indy$42(field_43, 6837793223210928120L, var1).field_48Q;
         int[] var10000 = recovery$indy$43(6844784311986348028L, var1);
         var11 = recovery$indy$44(field_43, 6837793223210928120L, var1).field_48j;
         var8 = var10000;
         var13 = recovery$indy$45(field_43, 6837793223210928120L, var1).field_42o;
         var15 = recovery$indy$46(field_43, 6837793223210928120L, var1).field_48h;
         var16 = recovery$indy$47(field_43, 6837793223210928120L, var1).field_48z;
         var17 = false;
         boolean var20 = recovery$indy$48(ClientGlobals.field_48.field_41p, var3, 6838284672384111377L, var1);
         if (var8 == null) {
            if (!var20) {
               break label28;
            }

            var20 = true;
         }

         var17 = var20;
         recovery$indy$49(field_43, 6837793223210928120L, var1).field_48Q = ClientGlobals.field_48.field_41p.field_47.field_40;
         recovery$indy$50(field_43, 6837793223210928120L, var1).field_48j = ClientGlobals.field_48.field_41p.field_47.field_41;
         recovery$indy$51(field_43, 6837793223210928120L, var1).field_42o = ClientGlobals.field_48.field_41p.field_47.field_47;
         var15 = ClientGlobals.field_48.field_41p.field_49;
         var16 = ClientGlobals.field_48.field_41p.field_41s;
      }

      C_47Ij var18 = recovery$indy$52(1.0F, (short)var5, var15, var16, 300.0, var6, 300.0, 0.0, 6838300145373991515L, var1);
      if (var8 == null) {
         if (!var17) {
            return var18;
         }

         recovery$indy$53(field_43, 6837793223210928120L, var1).field_48Q = var9;
         recovery$indy$54(field_43, 6837793223210928120L, var1).field_48j = var11;
      }

      recovery$indy$55(field_43, 6837793223210928120L, var1).field_42o = var13;
      return var18;
   }




   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 80293750342083L;
      long var3 = var1 ^ 80101213677270L;
      long var10000 = 2919993203021818244L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 2919900518228350824L;
      BooleanSetting var6 = this.settingAutoTarget2;
      if (var6.method_49$aae029aa0a()) {
         ModuleManager var10 = ClientGlobals.field_48;
         if (var5 == null) {
            if (ClientGlobals.field_48 == null) {
               return true;
            }

            var10 = ClientGlobals.field_48;
         }

         MurdererFinder_47kg var11 = var10.field_46M;
         if (var5 == null) {
            if (var10.field_46M == null) {
               return true;
            }

            var11 = ClientGlobals.field_48.field_46M;
         }

         long var10002 = 2926810773089117545L;
         long var7 = var3;
         MurdererFinder_47kg var9 = var11;
         boolean var12 = var9.method_46$0dd78e0064(var7);
         if (var5 != null) {
            return var12;
         }

         if (var12) {
            return true;
         }
      }

      return false;
   }



   private void method_45$e45a9973e5(long var1) {
        int[] var92;
        int[] var93;
      long var26 = a ^ var1;
      long var3 = var26 ^ 61330213806313L;
      long var5 = var26 ^ 115097806241263L;
      long var7 = var26 ^ 2087842869601L;
      long var9 = var26 ^ 13620067297191L;
      long var11 = var26 ^ 83321619559500L;
      long var13 = var26 ^ 18273059295889L;
      long var10001 = var26 ^ 42855169077493L;
      int var15 = (int)((var26 ^ 42855169077493L) >>> 48);
      long var16 = var10001 << 16 >>> 16;
      int[] var18 = (int[])recovery$indy$flow$320(-5856199842110165061L, var26);
      java.util.ArrayList var20 = new java.util.ArrayList();
      int var10000 = ((int) (recovery$indy$flow$324(this.settingMurderMystery, -5856107709891194537L, var26) ? 1 : 0));
      if (var18 == null) {
         java.util.List var41;
         label430: {
            if (var10000 != 0
               && recovery$indy$flow$327(client.ClientGlobals.field_48.field_46M, var3, -5863297514844986538L, var26)
               && recovery$indy$flow$328(var9, -5863501799256621952L, var26) == -1
               && recovery$indy$flow$329((char)var15, var16, -5862509668577043509L, var26) != -1) {
               java.util.List var91 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$331(field_43, -5862572000301022234L, var26)).field_44E;
               if (var26 > 0L) {
                  var41 = var91;
                  var10000 = ((int) (recovery$indy$flow$337(this.settingMurderMystery, -5856107709891194537L, var26) ? 1 : 0));
                  var93 = var18;
                  break label430;
               }

               var41 = var91;
               var10000 = ((int) (recovery$indy$flow$337(this.settingMurderMystery, -5856107709891194537L, var26) ? 1 : 0));
               var93 = var18;
            } else {
               var41 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$334(field_43, -5862572000301022234L, var26)).field_44Q;
               var10000 = ((int) (recovery$indy$flow$337(this.settingMurderMystery, -5856107709891194537L, var26) ? 1 : 0));
               var93 = var18;
               if (var26 > 0L) {
                  break label430;
               }
            }

            if (var26 >= 0L) {
               label351: {
                  label422: {
                     if (var93 == null) {
                        if (var10000 == 0) {
                           break label422;
                        }

                        var10000 = recovery$indy$flow$341(var9, -5863501799256621952L, var26);
                     }

                     if (var18 != null) {
                        break label351;
                     }

                     if (var10000 == -1) {
                        var10000 = 1;
                        break label351;
                     }
                  }

                  var10000 = 0;
               }

               int var49 = var10000;

               for (Object recovered$element$12624 : var41) {
         net.minecraft.entity.Entity var68 = (net.minecraft.entity.Entity) recovered$element$12624;
                  if (recovery$indy$flow$346(this, var13, var68, (((var49) & 1) != 0), -5862454904989655027L, var26)) {
                     var20.add(var68);
                  }
               }

               java.util.ArrayList var30 = (java.util.ArrayList)recovery$indy$flow$350(
                  this,
                  var20,
                  var7,
                  (int)recovery$indy$flow$349(this.settingMaxConsideredTargets, true, var11, -5861540882295157978L, var26),
                  -5856635931691602675L,
                  var26
               );
               boolean var36 = recovery$indy$flow$354(
                  ((client.module.ModuleManager)recovery$indy$flow$352((client.Client)recovery$indy$flow$351(-5861867577149980625L, var26), -5862787734591869442L, var26)).field_41J,
                  var3,
                  -5863297514844986538L,
                  var26
               );
               net.C_47tf var43 = this.field_46B = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$356(field_43, -5862650007571630145L, var26)).method_42$41b79b67a0(1.0F);
               net.C_47nU var50 = new net.C_47nU((int)Math.floor(var43.field_40), (int)Math.floor(var43.field_41), (int)Math.floor(var43.field_47));
               this.field_46V.clear();

               for (Object recovered$element$13999 : var30) {
         net.C_47mh var69 = (net.C_47mh) recovered$element$13999;
                  net.C_47ho var75 = (net.C_47ho)recovery$indy$flow$386(
                     this,
                     var5,
                     var50,
                     new net.C_47nU(
                        (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$374(var69, -5861740306620493748L, var26)).field_48Q),
                        (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$377(var69, -5861740306620493748L, var26)).field_48j),
                        (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$380(var69, -5861740306620493748L, var26)).field_42o)
                     ),
                     var36,
                     (net.minecraft.entity.Entity)recovery$indy$flow$384(var69, -5861740306620493748L, var26) instanceof C_47BP,
                     -5862308732833665991L,
                     var26
                  );
                  this.field_46V.add(new net.C_47O5(this, var75, (net.minecraft.entity.Entity)recovery$indy$flow$389(var69, -5861740306620493748L, var26)));
               }

               return;
            }

            if (var93 == null) {
               var10000 = var10000 == -1 ? 1 : 0;
            }

            int var47 = var10000;

            for (Object recovered$element$15310 : var41) {
         net.minecraft.entity.Entity var66 = (net.minecraft.entity.Entity) recovered$element$15310;
               if (recovery$indy$flow$346(this, var13, var66, (((var47) & 1) != 0), -5862454904989655027L, var26)) {
                  var20.add(var66);
               }
            }

            java.util.ArrayList var29 = (java.util.ArrayList)recovery$indy$flow$350(
               this,
               var20,
               var7,
               (int)recovery$indy$flow$349(this.settingMaxConsideredTargets, true, var11, -5861540882295157978L, var26),
               -5856635931691602675L,
               var26
            );
            boolean var35 = recovery$indy$flow$354(
               ((client.module.ModuleManager)recovery$indy$flow$352((client.Client)recovery$indy$flow$351(-5861867577149980625L, var26), -5862787734591869442L, var26)).field_41J,
               var3,
               -5863297514844986538L,
               var26
            );
            net.C_47tf var42 = this.field_46B = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$356(field_43, -5862650007571630145L, var26)).method_42$41b79b67a0(1.0F);
            net.C_47nU var48 = new net.C_47nU((int)Math.floor(var42.field_40), (int)Math.floor(var42.field_41), (int)Math.floor(var42.field_47));
            this.field_46V.clear();

            for (Object recovered$element$16619 : var29) {
         net.C_47mh var67 = (net.C_47mh) recovered$element$16619;
               net.C_47ho var74 = (net.C_47ho)recovery$indy$flow$386(
                  this,
                  var5,
                  var48,
                  new net.C_47nU(
                     (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$374(var67, -5861740306620493748L, var26)).field_48Q),
                     (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$377(var67, -5861740306620493748L, var26)).field_48j),
                     (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$380(var67, -5861740306620493748L, var26)).field_42o)
                  ),
                  var35,
                  (net.minecraft.entity.Entity)recovery$indy$flow$384(var67, -5861740306620493748L, var26) instanceof C_47BP,
                  -5862308732833665991L,
                  var26
               );
               this.field_46V.add(new net.C_47O5(this, var74, (net.minecraft.entity.Entity)recovery$indy$flow$389(var67, -5861740306620493748L, var26)));
            }

            return;
         }

         label328: {
            label423: {
               if (var93 == null) {
                  if (var10000 == 0) {
                     break label423;
                  }

                  var10000 = ((int) (recovery$indy$flow$340(client.ClientGlobals.field_48.field_46M, var3, -5863297514844986538L, var26) ? 1 : 0));
               }

               if (var18 == null) {
                  if (var10000 == 0) {
                     break label423;
                  }

                  var10000 = recovery$indy$flow$341(var9, -5863501799256621952L, var26);
               }

               if (var18 != null) {
                  break label328;
               }

               if (var10000 == -1) {
                  var10000 = 1;
                  break label328;
               }
            }

            var10000 = 0;
         }

         int var51 = var10000;

         for (Object recovered$element$18626 : var41) {
         net.minecraft.entity.Entity var70 = (net.minecraft.entity.Entity) recovered$element$18626;
            if (recovery$indy$flow$346(this, var13, var70, (((var51) & 1) != 0), -5862454904989655027L, var26)) {
               var20.add(var70);
            }
         }

         java.util.ArrayList var31 = (java.util.ArrayList)recovery$indy$flow$350(
            this,
            var20,
            var7,
            (int)recovery$indy$flow$349(this.settingMaxConsideredTargets, true, var11, -5861540882295157978L, var26),
            -5856635931691602675L,
            var26
         );
         boolean var37 = recovery$indy$flow$354(
            ((client.module.ModuleManager)recovery$indy$flow$352((client.Client)recovery$indy$flow$351(-5861867577149980625L, var26), -5862787734591869442L, var26)).field_41J,
            var3,
            -5863297514844986538L,
            var26
         );
         net.C_47tf var44 = this.field_46B = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$356(field_43, -5862650007571630145L, var26)).method_42$41b79b67a0(1.0F);
         net.C_47nU var52 = new net.C_47nU((int)Math.floor(var44.field_40), (int)Math.floor(var44.field_41), (int)Math.floor(var44.field_47));
         this.field_46V.clear();

         for (Object recovered$element$19869 : var31) {
         net.C_47mh var71 = (net.C_47mh) recovered$element$19869;
            net.C_47ho var76 = (net.C_47ho)recovery$indy$flow$386(
               this,
               var5,
               var52,
               new net.C_47nU(
                  (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$374(var71, -5861740306620493748L, var26)).field_48Q),
                  (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$377(var71, -5861740306620493748L, var26)).field_48j),
                  (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$380(var71, -5861740306620493748L, var26)).field_42o)
               ),
               var37,
               (net.minecraft.entity.Entity)recovery$indy$flow$384(var71, -5861740306620493748L, var26) instanceof C_47BP,
               -5862308732833665991L,
               var26
            );
            this.field_46V.add(new net.C_47O5(this, var76, (net.minecraft.entity.Entity)recovery$indy$flow$389(var71, -5861740306620493748L, var26)));
         }
      } else {
         java.util.List var21;
         label424: {
            if (var10000 != -1) {
               if (var26 > 0L) {
                  var21 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$334(field_43, -5862572000301022234L, var26)).field_44Q;
                  var10000 = ((int) (recovery$indy$flow$337(this.settingMurderMystery, -5856107709891194537L, var26) ? 1 : 0));
                  var92 = var18;
                  break label424;
               }

               var21 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$331(field_43, -5862572000301022234L, var26)).field_44E;
               var10000 = ((int) (recovery$indy$flow$337(this.settingMurderMystery, -5856107709891194537L, var26) ? 1 : 0));
               var92 = var18;
            } else {
               var21 = ((net.minecraft.client.multiplayer.WorldClient)recovery$indy$flow$334(field_43, -5862572000301022234L, var26)).field_44Q;
               var10000 = ((int) (recovery$indy$flow$337(this.settingMurderMystery, -5856107709891194537L, var26) ? 1 : 0));
               var92 = var18;
               if (var26 > 0L) {
                  break label424;
               }
            }

            if (var26 < 0L) {
               if (var92 == null) {
                  if (var10000 == -1) {
                     boolean var82 = true;
                  } else {
                     boolean var83 = false;
                  }
               }

               java.util.Iterator var54 = var21.iterator();
               Pathfinder_47HZ var85;
               if (var54.hasNext()) {
                  net.minecraft.entity.Entity var84 = (net.minecraft.entity.Entity)var54.next();
                  var85 = this;
               } else {
                  var85 = this;
               }

               java.util.ArrayList var27 = (java.util.ArrayList)recovery$indy$flow$350(
                  var85,
                  var20,
                  var7,
                  (int)recovery$indy$flow$349(this.settingMaxConsideredTargets, true, var11, -5861540882295157978L, var26),
                  -5856635931691602675L,
                  var26
               );
               boolean var33 = recovery$indy$flow$354(
                  ((client.module.ModuleManager)recovery$indy$flow$352((client.Client)recovery$indy$flow$351(-5861867577149980625L, var26), -5862787734591869442L, var26)).field_41J,
                  var3,
                  -5863297514844986538L,
                  var26
               );
               net.C_47tf var39 = this.field_46B = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$356(field_43, -5862650007571630145L, var26)).method_42$41b79b67a0(1.0F);
               net.C_47nU var45 = new net.C_47nU((int)Math.floor(var39.field_40), (int)Math.floor(var39.field_41), (int)Math.floor(var39.field_47));
               this.field_46V.clear();
               var54 = var27.iterator();
               if (var54.hasNext()) {
                  net.C_47mh var64 = (net.C_47mh)var54.next();
                  net.C_47ho var72 = (net.C_47ho)recovery$indy$flow$386(
                     this,
                     var5,
                     var45,
                     new net.C_47nU(
                        (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$374(var64, -5861740306620493748L, var26)).field_48Q),
                        (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$377(var64, -5861740306620493748L, var26)).field_48j),
                        (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$380(var64, -5861740306620493748L, var26)).field_42o)
                     ),
                     var33,
                     (net.minecraft.entity.Entity)recovery$indy$flow$384(var64, -5861740306620493748L, var26) instanceof C_47BP,
                     -5862308732833665991L,
                     var26
                  );
                  this.field_46V.add(new net.C_47O5(this, var72, (net.minecraft.entity.Entity)recovery$indy$flow$389(var64, -5861740306620493748L, var26)));
               }

               return;
            }

            label406: {
               label426: {
                  if (var92 == null) {
                     if (var10000 == 0) {
                        break label426;
                     }

                     var10000 = recovery$indy$flow$341(var9, -5863501799256621952L, var26);
                  }

                  if (var18 != null) {
                     break label406;
                  }

                  if (var10000 == -1) {
                     boolean var78 = true;
                     break label406;
                  }
               }

               boolean var79 = false;
            }

            java.util.Iterator var23 = var21.iterator();
            Pathfinder_47HZ var81;
            if (var23.hasNext()) {
               net.minecraft.entity.Entity var80 = (net.minecraft.entity.Entity)var23.next();
               var81 = this;
            } else {
               var81 = this;
            }

            java.util.ArrayList var19 = (java.util.ArrayList)recovery$indy$flow$350(
               var81,
               var20,
               var7,
               (int)recovery$indy$flow$349(this.settingMaxConsideredTargets, true, var11, -5861540882295157978L, var26),
               -5856635931691602675L,
               var26
            );
            boolean var32 = recovery$indy$flow$354(
               ((client.module.ModuleManager)recovery$indy$flow$352((client.Client)recovery$indy$flow$351(-5861867577149980625L, var26), -5862787734591869442L, var26)).field_41J,
               var3,
               -5863297514844986538L,
               var26
            );
            net.C_47tf var38 = this.field_46B = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$356(field_43, -5862650007571630145L, var26)).method_42$41b79b67a0(1.0F);
            net.C_47nU var22 = new net.C_47nU((int)Math.floor(var38.field_40), (int)Math.floor(var38.field_41), (int)Math.floor(var38.field_47));
            this.field_46V.clear();
            var23 = var19.iterator();
            if (var23.hasNext()) {
               net.C_47mh var24 = (net.C_47mh)var23.next();
               net.C_47ho var25 = (net.C_47ho)recovery$indy$flow$386(
                  this,
                  var5,
                  var22,
                  new net.C_47nU(
                     (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$374(var24, -5861740306620493748L, var26)).field_48Q),
                     (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$377(var24, -5861740306620493748L, var26)).field_48j),
                     (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$380(var24, -5861740306620493748L, var26)).field_42o)
                  ),
                  var32,
                  (net.minecraft.entity.Entity)recovery$indy$flow$384(var24, -5861740306620493748L, var26) instanceof C_47BP,
                  -5862308732833665991L,
                  var26
               );
               this.field_46V.add(new net.C_47O5(this, var25, (net.minecraft.entity.Entity)recovery$indy$flow$389(var24, -5861740306620493748L, var26)));
            }

            return;
         }

         label395: {
            label427: {
               if (var92 == null) {
                  if (var10000 == 0) {
                     break label427;
                  }

                  var10000 = ((int) (recovery$indy$flow$340(client.ClientGlobals.field_48.field_46M, var3, -5863297514844986538L, var26) ? 1 : 0));
               }

               if (var18 == null) {
                  if (var10000 == 0) {
                     break label427;
                  }

                  var10000 = recovery$indy$flow$341(var9, -5863501799256621952L, var26);
               }

               if (var18 != null) {
                  break label395;
               }

               if (var10000 == -1) {
                  boolean var86 = true;
                  break label395;
               }
            }

            boolean var87 = false;
         }

         java.util.Iterator var56 = var21.iterator();
         Pathfinder_47HZ var89;
         if (var56.hasNext()) {
            net.minecraft.entity.Entity var88 = (net.minecraft.entity.Entity)var56.next();
            var89 = this;
         } else {
            var89 = this;
         }

         java.util.ArrayList var28 = (java.util.ArrayList)recovery$indy$flow$350(
            var89,
            var20,
            var7,
            (int)recovery$indy$flow$349(this.settingMaxConsideredTargets, true, var11, -5861540882295157978L, var26),
            -5856635931691602675L,
            var26
         );
         boolean var34 = recovery$indy$flow$354(
            ((client.module.ModuleManager)recovery$indy$flow$352((client.Client)recovery$indy$flow$351(-5861867577149980625L, var26), -5862787734591869442L, var26)).field_41J,
            var3,
            -5863297514844986538L,
            var26
         );
         net.C_47tf var40 = this.field_46B = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$356(field_43, -5862650007571630145L, var26)).method_42$41b79b67a0(1.0F);
         net.C_47nU var46 = new net.C_47nU((int)Math.floor(var40.field_40), (int)Math.floor(var40.field_41), (int)Math.floor(var40.field_47));
         this.field_46V.clear();
         var56 = var28.iterator();
         if (var56.hasNext()) {
            net.C_47mh var65 = (net.C_47mh)var56.next();
            net.C_47ho var73 = (net.C_47ho)recovery$indy$flow$386(
               this,
               var5,
               var46,
               new net.C_47nU(
                  (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$374(var65, -5861740306620493748L, var26)).field_48Q),
                  (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$377(var65, -5861740306620493748L, var26)).field_48j),
                  (int)Math.floor(((net.minecraft.entity.Entity)recovery$indy$flow$380(var65, -5861740306620493748L, var26)).field_42o)
               ),
               var34,
               (net.minecraft.entity.Entity)recovery$indy$flow$384(var65, -5861740306620493748L, var26) instanceof C_47BP,
               -5862308732833665991L,
               var26
            );
            this.field_46V.add(new net.C_47O5(this, var73, (net.minecraft.entity.Entity)recovery$indy$flow$389(var65, -5861740306620493748L, var26)));
         }
      }
   }





   private void method_47$e45a9973e5(long var1) {
      boolean var80;
        net.C_47ho var34;
        net.C_47ho var40;
        java.util.ArrayList var61;
        java.util.ArrayList var62;
        java.util.ArrayList var74;
        java.util.ArrayList var76;
      long var3;
      long var7;
      net.minecraft.entity.Entity var15;
      Object var23;
      label1529: {
         label1530: {
            var1 = a ^ var1;
            var3 = var1 ^ 11407167258804L;
            long var5 = var1 ^ 129503138579733L;
            var7 = var1 ^ 77524566212233L;
            long var9 = var1 ^ 12793877162086L;
            java.util.ArrayList var12 = new java.util.ArrayList();
            int[] var10000 = (int[])recovery$indy$flow$395(-3935160279216142238L, var1);
            java.util.ArrayList var13 = new java.util.ArrayList();
            int[] var11 = var10000;
            int var14 = 0;
            label1466:
            if (var14 < this.field_46V.size()) {
               net.C_47ho var31 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
               java.util.ArrayList var42 = (java.util.ArrayList)recovery$indy$flow$406(
                  var31, (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1), var9, -3927233176132407997L, var1
               );
               java.util.ArrayList var59 = var42;
               if (var1 > 0L) {
                  label1478: {
                     if (var11 == null) {
                        label1317: {
                           label1316: {
                              label1315: {
                                 label1479: {
                                    if (var11 == null) {
                                       if (var42 == null) {
                                          net.C_47ho var78 = var31;
                                          if (var11 == null) {
                                             while (true) {
                                                label1182: {
                                                   label1181: {
                                                      if (!(var78.field_46 >= recovery$indy$flow$418(this.settingMaxSteps, var5, -3935295080430285994L, var1))) {
                                                         java.util.ArrayList var81 = var42;
                                                         if (var11 == null) {
                                                            if (var42 == null) {
                                                               break label1182;
                                                            }

                                                            var81 = var42;
                                                         }

                                                         if (var11 != null) {
                                                            break label1181;
                                                         }

                                                         if (!var81.isEmpty()) {
                                                            break label1182;
                                                         }
                                                      }

                                                      this.field_46V.remove(var14);
                                                   }

                                                   var14--;
                                                }

                                                do {
                                                   if (var11 != null || ++var14 >= this.field_46V.size()) {
                                                      break label1315;
                                                   }

                                                   var40 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                                   var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                                      var40,
                                                      (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                                      var9,
                                                      -3927233176132407997L,
                                                      var1
                                                   );
                                                   var76 = var42;
                                                   if (var11 != null) {
                                                      break label1317;
                                                   }

                                                   if (var11 == null) {
                                                      if (var42 == null) {
                                                         break;
                                                      }

                                                      var76 = var42;
                                                   }

                                                   if (var76.isEmpty()) {
                                                      break;
                                                   }

                                                   var12.add(var42);
                                                   var13.add(((net.C_47O5)this.field_46V.get(var14)).field_40);
                                                   this.field_46V.remove(var14);
                                                   var14--;
                                                } while (var11 == null);

                                                var78 = var40;
                                             }
                                          }

                                          while (true) {
                                             var14--;

                                             while (true) {
                                                if (var11 != null || ++var14 >= this.field_46V.size()) {
                                                   break label1479;
                                                }

                                                net.C_47ho var39 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                                var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                                   var39,
                                                   (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                                   var9,
                                                   -3927233176132407997L,
                                                   var1
                                                );
                                                var74 = var42;
                                                if (var11 != null) {
                                                   break label1316;
                                                }

                                                if (var11 == null) {
                                                   if (var42 == null) {
                                                      break;
                                                   }

                                                   var74 = var42;
                                                }

                                                if (((int) (var74.isEmpty() ? 1 : 0)) < 0) {
                                                   java.util.ArrayList var79 = var42;
                                                   if (var11 == null) {
                                                      if (var42 == null) {
                                                         continue;
                                                      }

                                                      var79 = var42;
                                                   }

                                                   if (var11 != null) {
                                                      break;
                                                   }

                                                   if (!var79.isEmpty()) {
                                                      continue;
                                                   }
                                                }

                                                this.field_46V.remove(var14);
                                                break;
                                             }
                                          }
                                       }

                                       var59 = var42;
                                    }

                                    byte var72 = ((byte) (var59.isEmpty() ? 1 : 0));
                                    if (var11 == null) {
                                       while (true) {
                                          label1239: {
                                             label1238: {
                                                if (var72 == 0) {
                                                   var12.add(var42);
                                                   var13.add(((net.C_47O5)this.field_46V.get(var14)).field_40);
                                                   this.field_46V.remove(var14);
                                                   var14--;
                                                   if (var11 == null) {
                                                      while (true) {
                                                         if (var11 != null || ++var14 >= this.field_46V.size()) {
                                                            break label1315;
                                                         }

                                                         var31 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                                         var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                                            var31,
                                                            (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                                            var9,
                                                            -3927233176132407997L,
                                                            var1
                                                         );
                                                         var76 = var42;
                                                         if (var11 != null) {
                                                            break label1317;
                                                         }

                                                         if (var11 != null) {
                                                            break label1239;
                                                         }

                                                         if (var42 != null) {
                                                            break label1238;
                                                         }

                                                         label1212: {
                                                            if (!(
                                                               var31.field_46
                                                                  >= recovery$indy$flow$418(this.settingMaxSteps, var5, -3935295080430285994L, var1)
                                                            )) {
                                                               java.util.ArrayList var77 = var42;
                                                               if (var11 == null) {
                                                                  if (var42 == null) {
                                                                     continue;
                                                                  }

                                                                  var77 = var42;
                                                               }

                                                               if (var11 != null) {
                                                                  break label1212;
                                                               }

                                                               if (!var77.isEmpty()) {
                                                                  continue;
                                                               }
                                                            }

                                                            this.field_46V.remove(var14);
                                                         }

                                                         var14--;
                                                      }
                                                   }
                                                }

                                                do {
                                                   label1235: {
                                                      label1234: {
                                                         if (!(
                                                            var31.field_46 >= recovery$indy$flow$418(this.settingMaxSteps, var5, -3935295080430285994L, var1)
                                                         )) {
                                                            java.util.ArrayList var75 = var42;
                                                            if (var11 == null) {
                                                               if (var42 == null) {
                                                                  break label1235;
                                                               }

                                                               var75 = var42;
                                                            }

                                                            if (var11 != null) {
                                                               break label1234;
                                                            }

                                                            if (!var75.isEmpty()) {
                                                               break label1235;
                                                            }
                                                         }

                                                         this.field_46V.remove(var14);
                                                      }

                                                      var14--;
                                                   }

                                                   if (var11 != null || ++var14 >= this.field_46V.size()) {
                                                      break label1315;
                                                   }

                                                   var31 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                                   var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                                      var31,
                                                      (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                                      var9,
                                                      -3927233176132407997L,
                                                      var1
                                                   );
                                                   var76 = var42;
                                                   if (var11 != null) {
                                                      break label1317;
                                                   }

                                                   if (var11 != null) {
                                                      break label1239;
                                                   }
                                                } while (var42 == null);
                                             }

                                             var76 = var42;
                                          }

                                          var72 = ((byte) (var76.isEmpty() ? 1 : 0));
                                       }
                                    }

                                    label1308:
                                    while (true) {
                                       label1306: {
                                          label1305: {
                                             label1304: {
                                                label1303: {
                                                   if (var72 < 0) {
                                                      java.util.ArrayList var73 = var42;
                                                      if (var11 == null) {
                                                         if (var42 == null) {
                                                            break label1304;
                                                         }

                                                         var73 = var42;
                                                      }

                                                      if (var11 != null) {
                                                         break label1303;
                                                      }

                                                      if (!var73.isEmpty()) {
                                                         break label1304;
                                                      }
                                                   }

                                                   this.field_46V.remove(var14);
                                                }

                                                while (true) {
                                                   var14--;
                                                   if (var11 != null || ++var14 >= this.field_46V.size()) {
                                                      break label1308;
                                                   }

                                                   net.C_47ho var37 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                                   var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                                      var37,
                                                      (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                                      var9,
                                                      -3927233176132407997L,
                                                      var1
                                                   );
                                                   var74 = var42;
                                                   if (var11 != null) {
                                                      break label1316;
                                                   }

                                                   if (var11 != null) {
                                                      break label1306;
                                                   }

                                                   if (var42 != null) {
                                                      break label1305;
                                                   }
                                                }
                                             }

                                             while (true) {
                                                if (var11 != null || ++var14 >= this.field_46V.size()) {
                                                   break label1308;
                                                }

                                                net.C_47ho var38 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                                var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                                   var38,
                                                   (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                                   var9,
                                                   -3927233176132407997L,
                                                   var1
                                                );
                                                var74 = var42;
                                                if (var11 != null) {
                                                   break label1316;
                                                }

                                                if (var11 != null) {
                                                   break label1306;
                                                }

                                                if (var42 != null) {
                                                   break;
                                                }

                                                var14--;
                                             }
                                          }

                                          var74 = var42;
                                       }

                                       var72 = ((byte) (var74.isEmpty() ? 1 : 0));
                                    }
                                 }

                                 var74 = var12;
                                 break label1316;
                              }

                              var76 = var12;
                              break label1317;
                           }

                           var80 = var74.isEmpty();
                           break label1478;
                        }

                        var80 = var76.isEmpty();
                     } else {
                        var80 = var42.isEmpty();
                        if (var11 != null) {
                           break label1478;
                        }
                     }

                     if (var80 && this.field_46V.isEmpty()) {
                        recovery$indy$flow$425(this, var7, -3935979450265998918L, var1);
                        this.field_43h = null;
                        this.field_46A = null;
                        return;
                     }

                     if (var12.isEmpty()) {
                        return;
                     }

                     var23 = null;
                     var15 = null;
                     double var46 = Double.POSITIVE_INFINITY;
                     int var50 = 0;

                     while (true) {
                        if (var50 >= var12.size()) {
                           break label1530;
                        }

                        label1125: {
                           java.util.ArrayList var54 = (java.util.ArrayList)var12.get(var50);
                           if (!var54.isEmpty()) {
                              double var55 = recovery$indy$flow$435((net.C_47pN)var54.get(0), -3935852382419496182L, var1);
                              if (var11 != null) {
                                 break label1125;
                              }

                              if (var55 < var46) {
                                 var46 = var55;
                                 var23 = var54;
                                 var15 = (net.minecraft.entity.Entity)var13.get(var50);
                              }
                           }

                           var50++;
                        }

                        if (var11 != null) {
                           break label1530;
                        }
                     }
                  }

                  if (!var80) {
                     var23 = null;
                     var15 = null;
                     byte var51 = ((byte) (0));
                     if (var51 < var12.size()) {
                        java.util.ArrayList var82 = (java.util.ArrayList)var12.get(var51);
                     } else {
                        this.field_43W = this.field_43h;
                        this.field_43h = (java.util.ArrayList)recovery$indy$flow$440(this, var23, var3, -3928698476121769522L, var1);
                        this.field_46A = var15;
                     }

                     recovery$indy$flow$443(this, var7, -3935979450265998918L, var1);
                  }

                  return;
               }

               label1493: {
                  label1462: {
                     label1494: {
                        label1495: {
                           if (var11 == null) {
                              if (var42 == null) {
                                 net.C_47ho var63 = var31;
                                 if (var11 != null) {
                                    while (true) {
                                       var14--;

                                       while (true) {
                                          if (var11 != null || ++var14 >= this.field_46V.size()) {
                                             break label1493;
                                          }

                                          net.C_47ho var35 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                          var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                             var35,
                                             (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                             var9,
                                             -3927233176132407997L,
                                             var1
                                          );
                                          java.util.ArrayList var70 = var42;
                                          if (var11 == null) {
                                             if (var42 == null) {
                                                break;
                                             }

                                             var70 = var42;
                                          }

                                          if (((int) (var70.isEmpty() ? 1 : 0)) < 0) {
                                             if (var11 != null) {
                                                break;
                                             }

                                             if (!var42.isEmpty()) {
                                                continue;
                                             }
                                          }

                                          this.field_46V.remove(var14);
                                          break;
                                       }
                                    }
                                 }

                                 while (true) {
                                    label1423: {
                                       label1422: {
                                          if (!(var63.field_46 >= recovery$indy$flow$418(this.settingMaxSteps, var5, -3935295080430285994L, var1))) {
                                             if (var11 != null) {
                                                break label1422;
                                             }

                                             if (!var42.isEmpty()) {
                                                break label1423;
                                             }
                                          }

                                          this.field_46V.remove(var14);
                                       }

                                       var14--;
                                    }

                                    if (var11 != null || ++var14 >= this.field_46V.size()) {
                                       break label1494;
                                    }

                                    label1430: {
                                       var31 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                       var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                          var31,
                                          (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                          var9,
                                          -3927233176132407997L,
                                          var1
                                       );
                                       java.util.ArrayList var64 = var42;
                                       if (var11 == null) {
                                          if (var42 == null) {
                                             break label1430;
                                          }

                                          var64 = var42;
                                       }

                                       if (!var64.isEmpty()) {
                                          break label1495;
                                       }
                                    }

                                    var63 = var31;
                                 }
                              }

                              var59 = var42;
                           }

                           byte var60 = ((byte) (var59.isEmpty() ? 1 : 0));
                           if (var11 != null) {
                              while (true) {
                                 label1402: {
                                    label1401: {
                                       label1400: {
                                          if (var60 < 0) {
                                             if (var11 != null) {
                                                break label1400;
                                             }

                                             if (!var42.isEmpty()) {
                                                while (true) {
                                                   if (var11 != null || ++var14 >= this.field_46V.size()) {
                                                      break label1493;
                                                   }

                                                   net.C_47ho var32 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                                   var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                                      var32,
                                                      (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                                      var9,
                                                      -3927233176132407997L,
                                                      var1
                                                   );
                                                   var62 = var42;
                                                   if (var11 != null) {
                                                      break label1402;
                                                   }

                                                   if (var42 != null) {
                                                      break label1401;
                                                   }

                                                   var14--;
                                                }
                                             }
                                          }

                                          this.field_46V.remove(var14);
                                       }

                                       do {
                                          var14--;
                                          if (var11 != null || ++var14 >= this.field_46V.size()) {
                                             break label1493;
                                          }

                                          net.C_47ho var33 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                          var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                             var33,
                                             (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                             var9,
                                             -3927233176132407997L,
                                             var1
                                          );
                                          var62 = var42;
                                          if (var11 != null) {
                                             break label1402;
                                          }
                                       } while (var42 == null);
                                    }

                                    var62 = var42;
                                 }

                                 var60 = ((byte) (var62.isEmpty() ? 1 : 0));
                              }
                           }

                           while (var60 != 0) {
                              while (true) {
                                 label1449: {
                                    label1448: {
                                       if (!(var31.field_46 >= recovery$indy$flow$418(this.settingMaxSteps, var5, -3935295080430285994L, var1))) {
                                          if (var11 != null) {
                                             break label1448;
                                          }

                                          if (!var42.isEmpty()) {
                                             break label1449;
                                          }
                                       }

                                       this.field_46V.remove(var14);
                                    }

                                    var14--;
                                 }

                                 if (var11 != null || ++var14 >= this.field_46V.size()) {
                                    break label1494;
                                 }

                                 var31 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                 var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                    var31,
                                    (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                    var9,
                                    -3927233176132407997L,
                                    var1
                                 );
                                 var61 = var42;
                                 if (var11 != null) {
                                    break;
                                 }

                                 if (var42 != null) {
                                    var61 = var42;
                                    break;
                                 }
                              }

                              var60 = ((byte) (var61.isEmpty() ? 1 : 0));
                           }
                        }

                        var12.add(var42);
                        var13.add(((net.C_47O5)this.field_46V.get(var14)).field_40);
                        this.field_46V.remove(var14);
                        var14--;
                        int[] var65 = var11;
                        if (var1 < 0L) {
                           while (var65 == null && var14 < this.field_46V.size()) {
                              label1044: {
                                 var34 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                 var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                    var34,
                                    (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                    var9,
                                    -3927233176132407997L,
                                    var1
                                 );
                                 java.util.ArrayList var68 = var42;
                                 if (var11 == null) {
                                    if (var42 == null) {
                                       break label1044;
                                    }

                                    var68 = var42;
                                 }

                                 if (!var68.isEmpty()) {
                                    var12.add(var42);
                                    var13.add(((net.C_47O5)this.field_46V.get(var14)).field_40);
                                    this.field_46V.remove(var14);
                                    var14--;
                                    var65 = var11;
                                    continue;
                                 }
                              }

                              label1036: {
                                 label1035: {
                                    if (!(var34.field_46 >= recovery$indy$flow$418(this.settingMaxSteps, var5, -3935295080430285994L, var1))) {
                                       if (var11 != null) {
                                          break label1035;
                                       }

                                       if (!var42.isEmpty()) {
                                          break label1036;
                                       }
                                    }

                                    this.field_46V.remove(var14);
                                 }

                                 var14--;
                              }

                              var14++;
                              var65 = var11;
                           }

                           return;
                        }

                        while (true) {
                           if (var65 != null) {
                              while (true) {
                                 label1100: {
                                    label1099: {
                                       if (!(var31.field_46 >= recovery$indy$flow$418(this.settingMaxSteps, var5, -3935295080430285994L, var1))) {
                                          if (var11 != null) {
                                             break label1099;
                                          }

                                          if (!var42.isEmpty()) {
                                             break label1100;
                                          }
                                       }

                                       this.field_46V.remove(var14);
                                    }

                                    var14--;
                                 }

                                 if (var11 != null || ++var14 >= this.field_46V.size()) {
                                    break label1462;
                                 }

                                 var31 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                 var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                    var31,
                                    (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                    var9,
                                    -3927233176132407997L,
                                    var1
                                 );
                                 java.util.ArrayList var67 = var42;
                                 if (var11 == null) {
                                    if (var42 == null) {
                                       continue;
                                    }

                                    var67 = var42;
                                 }

                                 if (!var67.isEmpty()) {
                                    break;
                                 }
                              }
                           } else {
                              while (true) {
                                 if (var11 != null || ++var14 >= this.field_46V.size()) {
                                    break label1462;
                                 }

                                 label1109: {
                                    var31 = ((net.C_47O5)this.field_46V.get(var14)).field_44;
                                    var42 = (java.util.ArrayList)recovery$indy$flow$406(
                                       var31,
                                       (long)recovery$indy$flow$405(this.settingMaxSearchtimePerTick, var5, -3935295080430285994L, var1),
                                       var9,
                                       -3927233176132407997L,
                                       var1
                                    );
                                    java.util.ArrayList var66 = var42;
                                    if (var11 == null) {
                                       if (var42 == null) {
                                          break label1109;
                                       }

                                       var66 = var42;
                                    }

                                    if (!var66.isEmpty()) {
                                       break;
                                    }
                                 }

                                 label1082: {
                                    if (!(var31.field_46 >= recovery$indy$flow$418(this.settingMaxSteps, var5, -3935295080430285994L, var1))) {
                                       if (var11 != null) {
                                          break label1082;
                                       }

                                       if (!var42.isEmpty()) {
                                          continue;
                                       }
                                    }

                                    this.field_46V.remove(var14);
                                 }

                                 var14--;
                              }
                           }

                           var12.add(var42);
                           var13.add(((net.C_47O5)this.field_46V.get(var14)).field_40);
                           this.field_46V.remove(var14);
                           var14--;
                           var65 = var11;
                        }
                     }

                     if (var1 < 0L) {
                        return;
                     }
                  }

                  if (var12.isEmpty() && this.field_46V.isEmpty()) {
                     recovery$indy$flow$425(this, var7, -3935979450265998918L, var1);
                     this.field_43h = null;
                     this.field_46A = null;
                     return;
                  }

                  if (var12.isEmpty()) {
                     return;
                  }

                  var23 = null;
                  var15 = null;
                  int var48 = 0;

                  while (true) {
                     if (var48 >= var12.size()) {
                        break label1466;
                     }

                     java.util.ArrayList var53 = (java.util.ArrayList)var12.get(var48);
                     if (var53.isEmpty()) {
                        var48++;
                        var10000 = var11;
                     } else {
                        recovery$indy$flow$435((net.C_47pN)var53.get(0), -3935852382419496182L, var1);
                        var10000 = var11;
                     }

                     if (var10000 != null) {
                        break label1466;
                     }
                  }
               }

               if (var1 >= 0L) {
                  if (!var12.isEmpty()) {
                     var23 = null;
                     var15 = null;
                     byte var49 = ((byte) (0));
                     if (var49 < var12.size()) {
                        java.util.ArrayList var71 = (java.util.ArrayList)var12.get(var49);
                     } else {
                        this.field_43W = this.field_43h;
                        this.field_43h = (java.util.ArrayList)recovery$indy$flow$440(this, var23, var3, -3928698476121769522L, var1);
                        this.field_46A = var15;
                     }

                     recovery$indy$flow$443(this, var7, -3935979450265998918L, var1);
                  }

                  return;
               }

               return;
            } else {
               if (var1 < 0L) {
                  return;
               }

               boolean var56 = var12.isEmpty();
               if (var11 != null) {
                  if (!var56) {
                     var23 = null;
                     var15 = null;
                     byte var47 = ((byte) (0));
                     if (var47 < var12.size()) {
                        java.util.ArrayList var58 = (java.util.ArrayList)var12.get(var47);
                     } else {
                        this.field_43W = this.field_43h;
                        this.field_43h = (java.util.ArrayList)recovery$indy$flow$440(this, var23, var3, -3928698476121769522L, var1);
                        this.field_46A = var15;
                     }

                     recovery$indy$flow$443(this, var7, -3935979450265998918L, var1);
                  }

                  return;
               }

               if (var56 && this.field_46V.isEmpty()) {
                  recovery$indy$flow$425(this, var7, -3935979450265998918L, var1);
                  this.field_43h = null;
                  this.field_46A = null;
                  return;
               }

               if (var12.isEmpty()) {
                  return;
               }

               var23 = null;
               var15 = null;
               double var16 = Double.POSITIVE_INFINITY;
               int var18 = 0;

               while (true) {
                  if (var18 >= var12.size()) {
                     break label1529;
                  }

                  java.util.ArrayList var19 = (java.util.ArrayList)var12.get(var18);
                  if (!var19.isEmpty()) {
                     double var20 = recovery$indy$flow$435((net.C_47pN)var19.get(0), -3935852382419496182L, var1);
                     int[] var57 = var11;
                     if (var1 > 0L) {
                        while (true) {
                           if (var57 == null) {
                              if (var20 < var16) {
                                 var16 = var20;
                                 var23 = var19;
                                 var15 = (net.minecraft.entity.Entity)var13.get(var18);
                              }

                              do {
                                 if (var11 != null || ++var18 >= var12.size()) {
                                    break label1530;
                                 }

                                 var19 = (java.util.ArrayList)var12.get(var18);
                              } while (var19.isEmpty());
                           } else {
                              while (true) {
                                 if (var11 != null || var18 >= var12.size()) {
                                    break label1530;
                                 }

                                 var19 = (java.util.ArrayList)var12.get(var18);
                                 if (!var19.isEmpty()) {
                                    break;
                                 }

                                 var18++;
                              }
                           }

                           var20 = recovery$indy$flow$435((net.C_47pN)var19.get(0), -3935852382419496182L, var1);
                           var57 = var11;
                        }
                     }

                     while (var57 == null && var18 < var12.size()) {
                        var19 = (java.util.ArrayList)var12.get(var18);
                        if (var19.isEmpty()) {
                           var18++;
                           var57 = var11;
                        } else {
                           recovery$indy$flow$435((net.C_47pN)var19.get(0), -3935852382419496182L, var1);
                           var57 = var11;
                        }
                     }
                     break;
                  }

                  var18++;
                  if (var11 != null) {
                     break label1529;
                  }
               }
            }

            this.field_43W = this.field_43h;
            this.field_43h = (java.util.ArrayList)recovery$indy$flow$440(this, var23, var3, -3928698476121769522L, var1);
            this.field_46A = var15;
            recovery$indy$flow$443(this, var7, -3935979450265998918L, var1);
            return;
         }

         this.field_43W = this.field_43h;
         this.field_43h = (java.util.ArrayList)recovery$indy$flow$440(this, var23, var3, -3928698476121769522L, var1);
         this.field_46A = var15;
         recovery$indy$flow$443(this, var7, -3935979450265998918L, var1);
         return;
      }

      this.field_43W = this.field_43h;
      this.field_43h = (java.util.ArrayList)recovery$indy$flow$440(this, var23, var3, -3928698476121769522L, var1);
      this.field_46A = var15;
      recovery$indy$flow$443(this, var7, -3935979450265998918L, var1);
   }





   private boolean method_47$1182e10ae8(long var1, Entity var3, boolean var4) {
      net.minecraft.entity.Entity var18;
      var1 = a ^ var1;
      long var5 = var1 ^ 99316892082621L;
      long var10001 = var1 ^ 84731994841725L;
      int var7 = (int)((var1 ^ 84731994841725L) >>> 48);
      int var8 = (int)((var1 ^ 84731994841725L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      int var10 = (int)((var1 ^ 75541231749934L) >>> 48);
      long var11 = (var1 ^ 75541231749934L) << 16 >>> 16;
      int[] var13 = recovery$indy$87(6152474581135971424L, var1);
      if (var3 == recovery$indy$88(field_43, 6158897532071677028L, var1)) {
         return false;
      }

      int var10000 = (int) ((var4) ? 1 : 0);
      if (var13 == null) {
         if (var4) {
            label80: {
               var10000 = recovery$indy$89((char)var10, var11, 6160727245184163856L, var1);
               if (var13 == null) {
                  if (var10000 != -1) {
                     boolean var17 = ClientGlobals.field_48.field_46M.field_46.isEmpty();
                     if (var13 != null) {
                        return var17;
                     }

                     if (!var17) {
                        return recovery$indy$90(ClientGlobals.field_48.field_46M, var3.method_41$0e30dfc966(), var5, 6152643955491876866L, var1);
                     }
                  }

                  var18 = var3;
                  if (var13 != null) {
                     break label80;
                  }

                  var10000 = (int) ((var3 instanceof C_47BP) ? 1 : 0);
               }

               if (var10000 == 0) {
                  return false;
               }

               var18 = var3;
            }

            C_47BP var14 = (C_47BP)var18;
            C_47rf var19 = var14.method_48$ac4db64966();
            if (var13 == null) {
               if (var19 == null) {
                  return false;
               }

               var19 = var14.method_48$ac4db64966();
            }

            if (var19.method_48$dbd570a038() == C_42R.field_41e) {
               return true;
            }

            return false;
         }

         var10000 = ((int) (recovery$indy$97(
            var3,
            recovery$indy$91(C_47tC.PLAYER, 6159838626919854967L, var1),
            (short)var7,
            recovery$indy$92(C_47tC.MOB, 6159838626919854967L, var1),
            recovery$indy$93(C_47tC.ANIMAL, 6159838626919854967L, var1),
            recovery$indy$94(C_47tC.VILLAGER, 6159838626919854967L, var1),
            var8,
            false,
            var9,
            recovery$indy$95(C_47tC.INVISIBLE, 6159838626919854967L, var1),
            true,
            true,
            true,
            false,
            false,
            recovery$indy$96(C_47tC.SLEEPING, 6159838626919854967L, var1),
            0,
            6153031363200852364L,
            var1
         ) ? 1 : 0));
      }

      return var10000 != 0;
   }




   public void onRender3D(long var1, float var3) {
        int var53;
        double var55;
        int var59;
        int var62;
        int var64;
        double var67;
        int[] var68;
        int var69;
      long var4 = var1 ^ 122725729730224L;
      long var6 = var1 ^ 124572312253833L;
      long var8 = var1 ^ 8439546287922L;
      long var10 = var1 ^ 131360486323543L;
      long var10001 = var1 ^ 36646091584389L;
      int var12 = (int)((var1 ^ 36646091584389L) >>> 48);
      int var13 = (int)((var1 ^ 36646091584389L) << 16 >>> 32);
      int var14 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 88570288194173L;
      int var15 = (int)((var1 ^ 88570288194173L) >>> 32);
      int var16 = (int)((var1 ^ 88570288194173L) << 32 >>> 48);
      int var17 = (int)(var10001 << 48 >>> 48);
      org.lwjgl.opengl.GL11.glPushMatrix();
      org.lwjgl.opengl.GL11.glEnable(3042);
      org.lwjgl.opengl.GL11.glBlendFunc(770, 771);
      int[] var10000 = (int[])recovery$indy$flow$479(8134557680771461602L, var1);
      org.lwjgl.opengl.GL11.glEnable(2848);
      org.lwjgl.opengl.GL11.glDisable(2929);
      org.lwjgl.opengl.GL11.glDisable(3553);
      org.lwjgl.opengl.GL11.glDisable(3008);
      int[] var18 = var10000;
      int var50 = ((int) (net.C_47vQ.method_48$aae029aa0a() ? 1 : 0));
      if (var18 == null) {
         if (var50 != 0) {
            net.C_47Il.method_498$da8c82d5d4();
         }

         net.minecraft.client.renderer.GlStateManager.method_42m$da8c82d5d4();
         org.lwjgl.opengl.GL11.glDepthMask(false);
         org.lwjgl.opengl.GL11.glLineWidth(2.0F);
         org.lwjgl.opengl.GL11.glTranslated(
            -((net.C_47j9)recovery$indy$flow$490(field_43, 8134268820207384973L, var1)).method_41$fedcb3e4d3(),
            -((net.C_47j9)recovery$indy$flow$493(field_43, 8134268820207384973L, var1)).method_49$fedcb3e4d3(),
            -((net.C_47j9)recovery$indy$flow$496(field_43, 8134268820207384973L, var1)).method_45$fedcb3e4d3()
         );
         recovery$indy$flow$500(this.settingPathColor, var15, (short)var16, (char)var17, 0, 8141545903985247541L, var1);
         var50 = recovery$indy$flow$502(this.settingPathColor, var6, 8141900069753232591L, var1);
      }

      label250: {
         label249: {
            label248: {
               label254: {
                  label246: {
                     label255: {
                        net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(
                           var50 / 255.0F,
                           recovery$indy$flow$504(this.settingPathColor, var8, 8141319374591413657L, var1) / 255.0F,
                           recovery$indy$flow$506(this.settingPathColor, var10, 8133787545198270731L, var1) / 255.0F,
                           recovery$indy$flow$508(this.settingPathColor, (short)var12, var13, var14, 8140356779296014908L, var1) / 255.0F
                        );
                        Pathfinder_47HZ var51 = this;
                        if (var18 == null) {
                           label242: {
                              label241: {
                                 label240: {
                                    label257: {
                                       java.util.ArrayList var52 = this.field_43h;
                                       if (var1 > 0L) {
                                          if (this.field_43h == null) {
                                             break label257;
                                          }

                                          var52 = this.field_43h;
                                       }

                                       var53 = ((var52.isEmpty()) ? 1 : 0);
                                       if (var18 != null) {
                                          break label240;
                                       }

                                       if (var53 == 0) {
                                          double var10002;
                                          label231: {
                                             label259: {
                                                org.lwjgl.opengl.GL11.glBegin(3);
                                                net.minecraft.entity.Entity var54 = this.field_46J;
                                                int[] var66 = var18;
                                                if (var1 > 0L) {
                                                   if (var18 == null) {
                                                      if (this.field_46J != null) {
                                                         var55 = recovery$indy$flow$519(
                                                            this.field_46J.field_48u, this.field_46J.field_48Q, var3, 8134189168555882434L, var1
                                                         );
                                                         var67 = recovery$indy$flow$524(
                                                            this.field_46J.field_48O, this.field_46J.field_48j, var3, 8134189168555882434L, var1
                                                         );
                                                         var10002 = recovery$indy$flow$529(
                                                            this.field_46J.field_48l, this.field_46J.field_42o, var3, 8134189168555882434L, var1
                                                         );
                                                         if (var1 < 0L) {
                                                            break label231;
                                                         }

                                                         org.lwjgl.opengl.GL11.glVertex3d(var55, var67, var10002);
                                                         if (var18 == null) {
                                                            break label259;
                                                         }
                                                      }

                                                      var54 = this.field_46A;
                                                   }

                                                   var66 = var18;
                                                }

                                                if (var66 == null) {
                                                   if (var54 == null) {
                                                      break label259;
                                                   }

                                                   var54 = this.field_46A;
                                                }

                                                org.lwjgl.opengl.GL11.glVertex3d(
                                                   recovery$indy$flow$536(var54.field_48u, this.field_46A.field_48Q, var3, 8134189168555882434L, var1),
                                                   recovery$indy$flow$541(this.field_46A.field_48O, this.field_46A.field_48j, var3, 8134189168555882434L, var1),
                                                   recovery$indy$flow$546(this.field_46A.field_48l, this.field_46A.field_42o, var3, 8134189168555882434L, var1)
                                                );
                                             }

                                             var55 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$549(field_43, 8141090550760450534L, var1)).field_48u;
                                             var67 = ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$552(field_43, 8141090550760450534L, var1)).field_48Q;
                                             var10002 = var3;
                                          }

                                          double var19;
                                          double var21;
                                          double var23;
                                          label213: {
                                             var19 = recovery$indy$flow$554(var55, var67, var10002, 8134189168555882434L, var1);
                                             var21 = recovery$indy$flow$561(
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$556(field_43, 8141090550760450534L, var1)).field_48O,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$559(field_43, 8141090550760450534L, var1)).field_48j,
                                                var3,
                                                8134189168555882434L,
                                                var1
                                             );
                                             var23 = recovery$indy$flow$568(
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$563(field_43, 8141090550760450534L, var1)).field_48l,
                                                ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$566(field_43, 8141090550760450534L, var1)).field_42o,
                                                var3,
                                                8134189168555882434L,
                                                var1
                                             );
                                             augustus.recovered.modules.movement.FreeCam_47kJ var56 = client.ClientGlobals.field_48.field_41p;
                                             if (var18 == null) {
                                                if (!recovery$indy$flow$571(client.ClientGlobals.field_48.field_41p, var4, 8140319687660944655L, var1)) {
                                                   break label213;
                                                }

                                                var19 = recovery$indy$flow$578(
                                                   client.ClientGlobals.field_48.field_41p.field_42,
                                                   client.ClientGlobals.field_48.field_41p.field_43F,
                                                   var3,
                                                   8134189168555882434L,
                                                   var1
                                                );
                                                var21 = recovery$indy$flow$585(
                                                   client.ClientGlobals.field_48.field_41p.field_41G,
                                                   client.ClientGlobals.field_48.field_41p.field_430,
                                                   var3,
                                                   8134189168555882434L,
                                                   var1
                                                );
                                                var56 = client.ClientGlobals.field_48.field_41p;
                                             }

                                             var23 = recovery$indy$flow$592(
                                                var56.field_41u, client.ClientGlobals.field_48.field_41p.field_41X, var3, 8134189168555882434L, var1
                                             );
                                          }

                                          java.util.ArrayList var25;
                                          label260: {
                                             var25 = this.field_43h;
                                             java.util.ArrayList var57 = this.field_43W;
                                             if (var18 == null) {
                                                if (this.field_43W == null) {
                                                   break label260;
                                                }

                                                var25 = new java.util.ArrayList(Math.max(var25.size(), this.field_43W.size()));
                                                var57 = this.field_43h;
                                             }

                                             int var26 = Math.min(var57.size(), this.field_43W.size());
                                             int var27 = 0;

                                             while (var27 < var26) {
                                                var25.add(((net.C_47tf)this.field_43W.get(var27)).method_48$d6978c8819((net.C_47tf)this.field_43h.get(var27), var3));
                                                var27++;
                                                var10000 = var18;
                                                if (var1 >= 0L) {
                                                   if (var18 != null) {
                                                      break label260;
                                                   }

                                                   var10000 = var18;
                                                }

                                                if (var10000 != null) {
                                                   break;
                                                }
                                             }

                                             var59 = var26;
                                             var68 = var18;
                                             if (var1 < 0L) {
                                                break label246;
                                             }

                                             if (var18 == null) {
                                                if (var26 >= this.field_43h.size()) {
                                                   break label260;
                                                }

                                                var59 = var26;
                                             }

                                             var27 = var59;

                                             while (var27 < this.field_43h.size()) {
                                                var25.add(this.field_43h.get(var27));
                                                var27++;
                                                var10000 = var18;
                                                if (var1 < 0L) {
                                                   break label242;
                                                }

                                                if (var18 != null) {
                                                   break label241;
                                                }

                                                if (var18 != null) {
                                                   break;
                                                }
                                             }
                                          }

                                          net.C_47tf var46 = null;
                                          int var48 = -1;
                                          double var28 = Double.POSITIVE_INFINITY;
                                          int var30 = 0;

                                          label160: {
                                             while (true) {
                                                if (var30 < var25.size() - 1) {
                                                   net.C_47tf var31 = (net.C_47tf)var25.get(var30);
                                                   net.C_47tf var32 = (net.C_47tf)var25.get(var30 + 1);
                                                   double var33 = var31.field_40;
                                                   double var35 = var31.field_47;
                                                   double var37 = var32.field_40 - var31.field_40;
                                                   double var39 = var32.field_41 - var31.field_41;
                                                   double var41 = var32.field_47 - var31.field_47;
                                                   net.C_47tf var43 = (net.C_47tf)recovery$indy$flow$635(
                                                      this, var37, var39, var41, var33, var31.field_41, var35, var19, var21, var23, 8140719044775738694L, var1
                                                   );
                                                   double var44 = var43.method_40$4b58f7ab41(var19, var21, var23);
                                                   var10000 = var18;
                                                   if (var1 >= 0L) {
                                                      if (var18 == null) {
                                                         double var70;
                                                         var62 = (byte)((var70 = var44 - var28) == 0.0 ? 0 : (var70 < 0.0 ? -1 : 1));
                                                         if (var18 != null) {
                                                            break;
                                                         }

                                                         if (var62 < 0) {
                                                            var28 = var44;
                                                            var46 = var43;
                                                            var48 = var30;
                                                         }

                                                         var30++;
                                                      }

                                                      var10000 = var18;
                                                   }

                                                   if (var10000 == null) {
                                                      continue;
                                                   }
                                                }

                                                if (var1 <= 0L) {
                                                   break label160;
                                                }

                                                var62 = 0;
                                                break;
                                             }

                                             var30 = var62;
                                          }

                                          label178: {
                                             while (var30 < var25.size()) {
                                                net.C_47tf var49 = (net.C_47tf)var25.get(var30);
                                                org.lwjgl.opengl.GL11.glVertex3d(var49.field_40, var49.field_41 + 0.01, var49.field_47);
                                                var10000 = var18;
                                                if (var1 > 0L) {
                                                   if (var18 == null) {
                                                      var64 = var30;
                                                      if (var1 <= 0L) {
                                                         break label248;
                                                      }

                                                      var69 = var48;
                                                      if (var18 != null) {
                                                         break label254;
                                                      }

                                                      if (var30 == var48) {
                                                         org.lwjgl.opengl.GL11.glVertex3d(var46.field_40, var46.field_41 + 0.01, var46.field_47);
                                                         if (var1 < 0L) {
                                                            break label178;
                                                         }

                                                         if (var18 == null) {
                                                            break;
                                                         }
                                                      }

                                                      var30++;
                                                   }

                                                   var10000 = var18;
                                                }

                                                if (var10000 != null) {
                                                   break;
                                                }
                                             }

                                             org.lwjgl.opengl.GL11.glVertex3d(var19, var21, var23);
                                             if (var1 < 0L) {
                                                break label249;
                                             }
                                          }

                                          org.lwjgl.opengl.GL11.glEnd();
                                       }
                                    }

                                    recovery$indy$flow$651(this.settingTargetColor, var15, (short)var16, (char)var17, 0, 8141545903985247541L, var1);
                                    var53 = recovery$indy$flow$653(this.settingTargetColor, var6, 8141900069753232591L, var1);
                                 }

                                 net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(
                                    var53 / 255.0F,
                                    recovery$indy$flow$655(this.settingTargetColor, var8, 8141319374591413657L, var1) / 255.0F,
                                    recovery$indy$flow$657(this.settingTargetColor, var10, 8133787545198270731L, var1) / 255.0F,
                                    recovery$indy$flow$659(this.settingTargetColor, (short)var12, var13, var14, 8140356779296014908L, var1) / 255.0F
                                 );
                              }

                              var10000 = var18;
                           }

                           if (var10000 != null) {
                              break label255;
                           }

                           var51 = this;
                        }

                        if (var51.field_46b != null) {
                           client.render.RenderUtils.method_44$6059593eaa(this.field_40);
                        }

                        org.lwjgl.opengl.GL11.glPopMatrix();
                        org.lwjgl.opengl.GL11.glDepthMask(true);
                        net.minecraft.client.renderer.GlStateManager.method_42H$da8c82d5d4();
                        org.lwjgl.opengl.GL11.glEnable(3553);
                     }

                     var59 = ((net.C_47vQ.method_48$aae029aa0a()) ? 1 : 0);
                     var68 = var18;
                  }

                  if (var68 != null) {
                     break label250;
                  }

                  if (var59 != 0) {
                     net.C_47Il.method_40j$da8c82d5d4();
                  }

                  org.lwjgl.opengl.GL11.glEnable(2929);
                  org.lwjgl.opengl.GL11.glDisable(3042);
                  var64 = 770;
                  var69 = 771;
               }

               org.lwjgl.opengl.GL11.glBlendFunc(var64, var69);
               var64 = 2848;
            }

            org.lwjgl.opengl.GL11.glDisable(var64);
         }

         var59 = 3008;
      }

      org.lwjgl.opengl.GL11.glEnable(var59);
   }









   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$132(this, 32, var3, -7102645145200180225L, var1);
      recovery$indy$133(this, 40, var3, -7102645145200180225L, var1);
      recovery$indy$134(this, 14, var3, -7102645145200180225L, var1);
   }



    public void method_482$4a66cb4514(char c, int n, char c2) {
        block46: {
            long l;
            long l2;
            block18: {
                double d;
                int n2;
                Object object;
                long l3;
                block43: {
                    block45: {
                        long l4;
                        block44: {
                            block42: {
                                int[] nArray;
                                int n3;
                                int[] nArray2;
                                block37: {
                                    int[] nArray3;
                                    block38: {
                                        block40: {
                                            long l5;
                                            block41: {
                                                block39: {
                                                    block22: {
                                                        block35: {
                                                            Object object2;
                                                            block36: {
                                                                block25: {
                                                                    block26: {
                                                                        block34: {
                                                                            block14: {
                                                                                int n4;
                                                                                block31: {
                                                                                    block33: {
                                                                                        block28: {
                                                                                            block30: {
                                                                                                block32: {
                                                                                                    block29: {
                                                                                                        int n5;
                                                                                                        block27: {
                                                                                                            int[] nArray4;
                                                                                                            int[] nArray5;
                                                                                                            block15: {
                                                                                                                block19: {
                                                                                                                    block24: {
                                                                                                                        block23: {
                                                                                                                            block20: {
                                                                                                                                int n6;
                                                                                                                                block21: {
                                                                                                                                    block17: {
                                                                                                                                        block16: {
                                                                                                                                            block12: {
                                                                                                                                                block13: {
                                                                                                                                                    block11: {
                                                                                                                                                        long l6 = l2 = (long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48;
                                                                                                                                                        l3 = l6 ^ 0x74EFFB0FB775L;
                                                                                                                                                        l = l6 ^ 0x47A5AFA7CCE9L;
                                                                                                                                                        l4 = l6 ^ 0x5BE4E255C8DDL;
                                                                                                                                                        l5 = l6 ^ 0x73F49FC19B2AL;
                                                                                                                                                        object2 = nArray3 = Pathfinder_47HZ.recovery$indy$135(-359300930995914238L, l2);
                                                                                                                                                        object = field_43;
                                                                                                                                                        if (object2 != null) break block11;
                                                                                                                                                        object2 = Pathfinder_47HZ.recovery$indy$136(object, -352769438181350906L, l2);
                                                                                                                                                        if (object2 == null) break block12;
                                                                                                                                                        break block13;
                                                                                                                                                    }
                                                                                                                                                    object2 = Pathfinder_47HZ.recovery$indy$137(object, -352708889734654369L, l2);
                                                                                                                                                    if (object2 == null) break block14;
                                                                                                                                                    this.field_43W = null;
                                                                                                                                                    object = this.field_43h;
                                                                                                                                                    char c3 = c2;
                                                                                                                                                    nArray5 = nArray3;
                                                                                                                                                    n5 = ((int) (((java.util.ArrayList)object).isEmpty() ? 1 : 0));
                                                                                                                                                    if (c3 < '\u0000') break block15;
                                                                                                                                                    break block16;
                                                                                                                                                }
                                                                                                                                                object = field_43;
                                                                                                                                                object2 = Pathfinder_47HZ.recovery$indy$137(object, -352708889734654369L, l2);
                                                                                                                                                if (object2 != null) break block17;
                                                                                                                                            }
                                                                                                                                            this.field_43h = null;
                                                                                                                                            this.field_46A = null;
                                                                                                                                            this.field_46b = null;
                                                                                                                                            this.field_46J = null;
                                                                                                                                            break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray6 = nArray5;
                                                                                                                                        if (nArray6 != null) break block19;
                                                                                                                                        n6 = n5;
                                                                                                                                        if (n6 != 0) break block20;
                                                                                                                                        break block21;
                                                                                                                                    }
                                                                                                                                    this.field_43W = null;
                                                                                                                                    object = this.field_43h;
                                                                                                                                    object2 = object;
                                                                                                                                    if (object2 == null) break block22;
                                                                                                                                    break block23;
                                                                                                                                }
                                                                                                                                n6 = c;
                                                                                                                                object = this;
                                                                                                                                if (n6 < 0) break block24;
                                                                                                                                Pathfinder_47HZ.recovery$indy$146(object, l5, -352429987177281251L, l2);
                                                                                                                            }
                                                                                                                            object = this;
                                                                                                                            break block24;
                                                                                                                        }
                                                                                                                        net.C_47tf c_47tf = (net.C_47tf)this.field_43h.get(0);
                                                                                                                        double d2 = (c_47tf.field_40 + 0.5 - Pathfinder_47HZ.recovery$indy$138((Object)Pathfinder_47HZ.field_43, (long)-352769438181350906L, (long)l2).field_48Q) * (c_47tf.field_40 + 0.5 - Pathfinder_47HZ.recovery$indy$139((Object)Pathfinder_47HZ.field_43, (long)-352769438181350906L, (long)l2).field_48Q) + (c_47tf.field_41 - Pathfinder_47HZ.recovery$indy$140((Object)Pathfinder_47HZ.field_43, (long)-352769438181350906L, (long)l2).field_48j) * (c_47tf.field_41 - Pathfinder_47HZ.recovery$indy$141((Object)Pathfinder_47HZ.field_43, (long)-352769438181350906L, (long)l2).field_48j) + (c_47tf.field_47 + 0.5 - Pathfinder_47HZ.recovery$indy$142((Object)Pathfinder_47HZ.field_43, (long)-352769438181350906L, (long)l2).field_42o) * (c_47tf.field_47 + 0.5 - Pathfinder_47HZ.recovery$indy$143((Object)Pathfinder_47HZ.field_43, (long)-352769438181350906L, (long)l2).field_42o);
                                                                                                                        double d3 = d2 - 1.0;
                                                                                                                        double d4 = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
                                                                                                                        if (d4 > 0) break block25;
                                                                                                                        break block26;
                                                                                                                    }
                                                                                                                    n5 = ((Pathfinder_47HZ)object).field_43y;
                                                                                                                }
                                                                                                                nArray5 = nArray3;
                                                                                                            }
                                                                                                            if ((nArray4 = nArray5) != null) break block27;
                                                                                                            n4 = n5;
                                                                                                            if (n4 >= 0) break block28;
                                                                                                            break block29;
                                                                                                        }
                                                                                                        n4 = n5;
                                                                                                        if (n4 != 0) break block30;
                                                                                                        n4 = n;
                                                                                                        object = this;
                                                                                                        if (n4 < 0) break block31;
                                                                                                        break block32;
                                                                                                    }
                                                                                                    this.field_43y = 0;
                                                                                                    break block28;
                                                                                                }
                                                                                                Pathfinder_47HZ.recovery$indy$147(object, l4, -352219438451363147L, l2);
                                                                                            }
                                                                                            object = this;
                                                                                            break block33;
                                                                                        }
                                                                                        object = this;
                                                                                    }
                                                                                    --((Pathfinder_47HZ)object).field_43y;
                                                                                    object = this;
                                                                                }
                                                                                ((Pathfinder_47HZ)object).field_43y = (int)Pathfinder_47HZ.recovery$indy$149(this.settingTicksBetweenSearches, l3, -359438190458603210L, l2);
                                                                                n4 = c;
                                                                                if (n4 < 0) break block34;
                                                                            }
                                                                            this.field_43h = null;
                                                                            this.field_46A = null;
                                                                            this.field_46b = null;
                                                                            this.field_46J = null;
                                                                        }
                                                                        Pathfinder_47HZ.recovery$indy$150(this, l, -360122302157464614L, l2);
                                                                        return;
                                                                    }
                                                                    object = this;
                                                                    object2 = ((Pathfinder_47HZ)object).field_46b;
                                                                    if (object2 != null) break block35;
                                                                }
                                                                object = this;
                                                                char c4 = c2;
                                                                object = ((Pathfinder_47HZ)object).field_46J;
                                                                if (c4 <= '\u0000') break block36;
                                                                object2 = object;
                                                                if (object2 == null) break block22;
                                                                object = Pathfinder_47HZ.recovery$indy$144(field_43, -352708889734654369L, l2).method_45$cf8871fa3f(this.field_46J.method_49$8abf5c6871());
                                                            }
                                                            if ((object2 = (Object)object) != null) break block22;
                                                        }
                                                        this.field_43h = null;
                                                        this.field_46A = null;
                                                        this.field_46b = null;
                                                        this.field_46J = null;
                                                        object = this;
                                                        Pathfinder_47HZ.recovery$indy$145(object, l, -360122302157464614L, l2);
                                                    }
                                                    object = this;
                                                    object = ((Pathfinder_47HZ)object).field_46V;
                                                    char c5 = c2;
                                                    nArray2 = nArray3;
                                                    n3 = ((int) (((java.util.ArrayList)object).isEmpty() ? 1 : 0));
                                                    if (c5 < '\u0000') break block37;
                                                    int[] nArray7 = nArray2;
                                                    if (nArray7 != null) break block38;
                                                    int n7 = n3;
                                                    if (n7 != 0) break block39;
                                                    n7 = c;
                                                    object = this;
                                                    if (n7 < 0) break block40;
                                                    break block41;
                                                }
                                                object = this;
                                                break block40;
                                            }
                                            Pathfinder_47HZ.recovery$indy$146(object, l5, -352429987177281251L, l2);
                                            return;
                                        }
                                        n3 = ((Pathfinder_47HZ)object).field_43y;
                                    }
                                    nArray2 = nArray3;
                                }
                                if ((nArray = nArray2) == null) {
                                    int n8 = n3;
                                    if (n8 < 0) {
                                        this.field_43y = 0;
                                    }
                                    object = this;
                                    n3 = ((Pathfinder_47HZ)object).field_43y;
                                }
                                if ((n2 = n3) != 0) break block42;
                                n2 = n;
                                object = this;
                                if (n2 < 0) break block43;
                                break block44;
                            }
                            object = this;
                            --((Pathfinder_47HZ)object).field_43y;
                            break block45;
                        }
                        Pathfinder_47HZ.recovery$indy$147(object, l4, -352219438451363147L, l2);
                    }
                    object = this;
                }
                if ((n2 = (int)((d = (double)((Pathfinder_47HZ)object).field_43y - Pathfinder_47HZ.recovery$indy$148(this.settingTicksBetweenSearches, l3, -359438190458603210L, l2)) == 0.0 ? 0 : (d > 0.0 ? 1 : -1))) <= 0) return;
                object = this;
                ((Pathfinder_47HZ)object).field_43y = (int)Pathfinder_47HZ.recovery$indy$149(this.settingTicksBetweenSearches, l3, -359438190458603210L, l2);
                n2 = c;
                if (n2 >= 0) break block46;
            }
            Pathfinder_47HZ.recovery$indy$150(this, l, -360122302157464614L, l2);
            return;
        }
    }





   public void method_43y$e45a9973e5(long var1) {
      this.field_43h = null;
      this.field_46A = null;
      this.field_46J = null;
      this.field_46b = null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43h = null;
      this.field_46A = null;
   }



    public Pathfinder_47HZ(short a0,int a1,short a2) {
        super((java.lang.String) ("Pathfinder"),(java.lang.String) ("Pfadfinder"),(long) (((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 118599464885634L)),(java.awt.Color) (java.awt.Color.RED),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = (((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a);
        int constructorPart2 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 119661226590056L) >>> 48));
        int constructorPart3 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 119661226590056L) << 16) >>> 48));
        int constructorPart4 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 119661226590056L) << 32) >>> 32));
        long constructorKey5 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 21064826770596L);
        long constructorKey6 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 68031559499267L);
        long constructorKey7 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 94473802094612L);
        long constructorKey8 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 127480068297874L);
        long constructorKey9 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 29657107743129L);
        long constructorKey10 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 122827985268069L);
        long constructorKey11 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 61165267025438L);
        long constructorKey12 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 138990557168060L);
        long constructorKey13 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.render.Pathfinder_47HZ.a) ^ 49681046447400L);
        client.setting.SettingGroup initialized14 = new client.setting.SettingGroup(this, "Auto Target", constructorKey8);
        recovery$indy$flow$752(this, initialized14);
        short converted15 = (short) (constructorPart2);
        char converted16 = (char) (constructorPart3);
        java.lang.Object initialValue17 = ((java.lang.Object)(((augustus.recovered.modules.render.Pathfinder_47HZ) (((java.lang.Object)(this)))).settingAutoTarget));
        client.setting.BooleanSetting initialized18 = new client.setting.BooleanSetting(this, "Auto Target", converted15, converted16, constructorPart4, true, (client.setting.SettingGroup) (initialValue17));
        recovery$indy$flow$756(this, initialized18);
        java.lang.Object initialValue19 = recovery$indy$flow$758();
        java.lang.Object initialValue20 = ((java.lang.Object)(((augustus.recovered.modules.render.Pathfinder_47HZ) (((java.lang.Object)(this)))).settingAutoTarget));
        client.setting.MultiSelectSetting initialized21 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey6, (net.C_47OZ[]) (initialValue19), (client.setting.SettingGroup) (initialValue20));
        java.lang.Object initialValue22 = ((java.lang.Object)(((augustus.recovered.modules.render.Pathfinder_47HZ) (((java.lang.Object)(this)))).settingAutoTarget2));
        java.lang.Object initialValue23 = recovery$indy$flow$762(initialValue22);
        java.lang.Object initialValue24 = recovery$indy$flow$763(initialValue22);
        java.lang.Object initialValue25 = initialValue24;
        client.setting.MultiSelectSetting initialValue26 = initialized21;
        java.lang.Object initialValue27 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue28 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue29 = recovery$indy$flow$766(initialValue27, initialValue28);
        recovery$indy$flow$767(this, initialValue29);
        short converted30 = (short) (constructorPart2);
        char converted31 = (char) (constructorPart3);
        java.lang.Object initialValue32 = ((java.lang.Object)(((augustus.recovered.modules.render.Pathfinder_47HZ) (((java.lang.Object)(this)))).settingAutoTarget));
        client.setting.BooleanSetting initialized33 = new client.setting.BooleanSetting(this, "Choose Target By Path Length", converted30, converted31, constructorPart4, true, (client.setting.SettingGroup) (initialValue32));
        java.lang.Object initialValue34 = ((java.lang.Object)(((augustus.recovered.modules.render.Pathfinder_47HZ) (((java.lang.Object)(this)))).settingAutoTarget2));
        java.lang.Object initialValue35 = recovery$indy$flow$772(initialValue34);
        java.lang.Object initialValue36 = recovery$indy$flow$773(initialValue34);
        java.lang.Object initialValue37 = initialValue36;
        long initialValue38 = constructorKey5;
        client.setting.BooleanSetting initialValue39 = initialized33;
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue39))))));
        java.lang.Object initialValue41 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue42 = recovery$indy$flow$776(initialValue40, initialValue38, initialValue41);
        java.lang.Object initialValue43 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue42))))));
        recovery$indy$flow$778(this, initialValue43);
        java.lang.Object initialValue44 = ((java.lang.Object)(((augustus.recovered.modules.render.Pathfinder_47HZ) (((java.lang.Object)(this)))).settingAutoTarget));
        client.setting.NumberSetting initialized45 = new client.setting.NumberSetting(this, "Max considered Targets", Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4617315517961601024L), 0, (client.setting.SettingGroup) (initialValue44), constructorKey13);
        java.lang.Object initialValue46 = recovery$indy$flow$782(this);
        java.lang.Object initialValue47 = initialValue46;
        client.setting.NumberSetting initialValue48 = initialized45;
        java.lang.Object initialValue49 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue48))))));
        java.lang.Object initialValue50 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue47))))));
        java.lang.Object initialValue51 = recovery$indy$flow$785(initialValue49, initialValue50);
        recovery$indy$flow$786(this, initialValue51);
        short converted52 = (short) (constructorPart2);
        char converted53 = (char) (constructorPart3);
        java.lang.Object initialValue54 = ((java.lang.Object)(((augustus.recovered.modules.render.Pathfinder_47HZ) (((java.lang.Object)(this)))).settingAutoTarget));
        client.setting.BooleanSetting initialized55 = new client.setting.BooleanSetting(this, "Murder Mystery", converted52, converted53, constructorPart4, false, (client.setting.SettingGroup) (initialValue54));
        java.lang.Object initialValue56 = recovery$indy$flow$790(this);
        java.lang.Object initialValue57 = initialValue56;
        long initialValue58 = constructorKey5;
        client.setting.BooleanSetting initialValue59 = initialized55;
        java.lang.Object initialValue60 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue59))))));
        java.lang.Object initialValue61 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue62 = recovery$indy$flow$793(initialValue60, initialValue58, initialValue61);
        java.lang.Object initialValue63 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue62))))));
        recovery$indy$flow$795(this, initialValue63);
        client.setting.NumberSetting initialized64 = new client.setting.NumberSetting(this, "Max Searchtime per Tick", Double.longBitsToDouble(4617315517961601024L), constructorKey11, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4630826316843712512L), 0);
        recovery$indy$flow$798(this, initialized64);
        client.setting.NumberSetting initialized65 = new client.setting.NumberSetting(this, "Max Steps", Double.longBitsToDouble(4616189618054758400L), constructorKey11, 1.0D, Double.longBitsToDouble(4626322717216342016L), 0);
        recovery$indy$flow$801(this, initialized65);
        client.setting.NumberSetting initialized66 = new client.setting.NumberSetting(this, "Ticks between searches", Double.longBitsToDouble(4616189618054758400L), constructorKey11, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0);
        recovery$indy$flow$804(this, initialized66);
        client.setting.NumberSetting initialized67 = new client.setting.NumberSetting(this, "Max Fall Height", Double.longBitsToDouble(4643176031446892544L), constructorKey11, 1.0D, Double.longBitsToDouble(4643176031446892544L), 0);
        recovery$indy$flow$807(this, initialized67);
        client.setting.BooleanSetting initialized68 = new client.setting.BooleanSetting(this, constructorKey9, "Discourage Falldamage", false);
        recovery$indy$flow$810(this, initialized68);
        client.setting.NumberSetting initialized69 = new client.setting.NumberSetting(this, "Discourage Falldamage Factor", Double.longBitsToDouble(4636033603912859648L), constructorKey11, 1.0D, Double.longBitsToDouble(4636737291354636288L), 0);
        java.lang.Object initialValue70 = ((java.lang.Object)(((augustus.recovered.modules.render.Pathfinder_47HZ) (((java.lang.Object)(this)))).settingDiscourageFalldamage));
        java.lang.Object initialValue71 = recovery$indy$flow$814(initialValue70);
        java.lang.Object initialValue72 = recovery$indy$flow$815(initialValue70);
        java.lang.Object initialValue73 = initialValue72;
        client.setting.NumberSetting initialValue74 = initialized69;
        java.lang.Object initialValue75 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue76 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue73))))));
        java.lang.Object initialValue77 = recovery$indy$flow$818(initialValue75, initialValue76);
        recovery$indy$flow$819(this, initialValue77);
        recovery$indy$flow$820(this, null);
        recovery$indy$flow$821(this, null);
        recovery$indy$flow$822(this, null);
        java.util.ArrayList initialized78 = new java.util.ArrayList();
        recovery$indy$flow$825(this, initialized78);
        recovery$indy$flow$826(this, null);
        recovery$indy$flow$827(this, null);
        recovery$indy$flow$828(this, null);
        recovery$indy$flow$829(this, 0);
        net.C_46m initialized79 = new net.C_46m();
        recovery$indy$flow$832(this, initialized79);
        net.C_47TY initialized80 = new net.C_47TY(this, constructorKey10, "Pick Target");
        recovery$indy$flow$835(this, initialized80);
        net.C_47TY initialized81 = new net.C_47TY(this, constructorKey10, "Reset picked target");
        recovery$indy$flow$838(this, initialized81);
        java.lang.Object initialValue82 = recovery$indy$flow$840();
        client.setting.ColorSetting initialized83 = new client.setting.ColorSetting(constructorKey12, this, "Path Color", (java.awt.Color) (initialValue82));
        recovery$indy$flow$842(this, initialized83);
        java.awt.Color initialized84 = new java.awt.Color(255, 255, 255, 100);
        client.setting.ColorSetting initialized85 = new client.setting.ColorSetting(constructorKey12, this, "Target Color", initialized84);
        recovery$indy$flow$847(this, initialized85);
        java.lang.Object initialValue86 = ((java.lang.Object)(((augustus.recovered.modules.render.Pathfinder_47HZ) (((java.lang.Object)(this)))).settingPickTarget));
        long initialValue87 = constructorKey7;
        int initialValue88 = 10001;
        java.lang.Object initialValue89 = initialValue86;
        java.lang.Object initialValue90 = ((java.lang.Object)(((net.C_47TY) (((java.lang.Object)(initialValue89))))));
        recovery$indy$flow$850(initialValue90, initialValue88, initialValue87);
        return;
    }






    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static long recovery$indy$flow$70() {
        return augustus.recovered.modules.render.Pathfinder_47HZ.a;
    }
    private static native java.lang.Object recovery$indy$flow$74(long a0,long a1);

    private static native java.lang.Object recovery$indy$flow$80(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$81(java.lang.Object a0) {
        return ((net.C_47nU) (a0)).field_46;
    }
    private static native java.lang.Object recovery$indy$flow$82(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$83(java.lang.Object a0) {
        return ((net.C_47nU) (a0)).field_48;
    }
    private static native java.lang.Object recovery$indy$flow$84(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$85(java.lang.Object a0) {
        return ((net.C_47nU) (a0)).field_40;
    }
    private static native double recovery$indy$flow$87(java.lang.Object a0,java.lang.Object a1);
    private static double recovery$indy$flow$89(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$90(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$91(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$92(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$93(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$94(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$96(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$97(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$98(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native java.lang.Object recovery$indy$flow$100(java.lang.Object a0,double a1,double a2,double a3);
    private static native java.lang.Object recovery$indy$flow$102(java.lang.Object a0,double a1,double a2,double a3);
    private static native java.lang.Object recovery$indy$flow$144(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$146(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$156(java.lang.Object a0,long a1,java.lang.Object a2,int a3,boolean a4,long a5,long a6);
    private static long recovery$indy$flow$232() {
        return augustus.recovered.modules.render.Pathfinder_47HZ.a;
    }
    private static native java.lang.Object recovery$indy$flow$233();
    private static int recovery$indy$flow$234(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }
    private static native java.lang.Object recovery$indy$flow$235(int a0);
    private static native java.lang.Object recovery$indy$flow$236(long a0,long a1);
    private static java.lang.Object recovery$indy$flow$237(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$238(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$239(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static native java.lang.Object recovery$indy$flow$241();
    private static native java.lang.Object recovery$indy$flow$242(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$243(java.lang.Object a0) {
        return ((net.C_47nU) (a0)).field_46;
    }
    private static native java.lang.Object recovery$indy$flow$244(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$245(java.lang.Object a0) {
        return ((net.C_47nU) (a0)).field_48;
    }
    private static native java.lang.Object recovery$indy$flow$246(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$247(java.lang.Object a0) {
        return ((net.C_47nU) (a0)).field_40;
    }
    private static native java.lang.Object recovery$indy$flow$248(double a0,double a1,double a2);
    private static boolean recovery$indy$flow$249(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }
    private static native java.lang.Object recovery$indy$flow$320(long a0,long a1);
    private static native boolean recovery$indy$flow$324(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$327(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$328(long a0,long a1,long a2);
    private static native int recovery$indy$flow$329(char a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$331(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$334(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$337(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$340(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$341(long a0,long a1,long a2);
    private static native boolean recovery$indy$flow$346(java.lang.Object a0,long a1,java.lang.Object a2,boolean a3,long a4,long a5);
    private static native double recovery$indy$flow$349(java.lang.Object a0,boolean a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$350(java.lang.Object a0,java.lang.Object a1,long a2,int a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$351(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$352(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$354(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$356(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$374(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$377(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$380(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$384(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$386(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,boolean a4,boolean a5,long a6,long a7);
    private static native java.lang.Object recovery$indy$flow$389(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$395(long a0,long a1);
    private static native double recovery$indy$flow$405(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$406(java.lang.Object a0,long a1,long a2,long a3,long a4);
    private static native double recovery$indy$flow$418(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$425(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$435(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$440(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native void recovery$indy$flow$443(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$479(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$490(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$493(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$496(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$500(java.lang.Object a0,int a1,short a2,char a3,int a4,long a5,long a6);
    private static native int recovery$indy$flow$502(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$504(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$506(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$508(java.lang.Object a0,short a1,int a2,int a3,long a4,long a5);
    private static native double recovery$indy$flow$519(double a0,double a1,double a2,long a3,long a4);
    private static native double recovery$indy$flow$524(double a0,double a1,double a2,long a3,long a4);
    private static native double recovery$indy$flow$529(double a0,double a1,double a2,long a3,long a4);
    private static native double recovery$indy$flow$536(double a0,double a1,double a2,long a3,long a4);
    private static native double recovery$indy$flow$541(double a0,double a1,double a2,long a3,long a4);
    private static native double recovery$indy$flow$546(double a0,double a1,double a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$549(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$552(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$554(double a0,double a1,double a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$556(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$559(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$561(double a0,double a1,double a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$563(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$566(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$568(double a0,double a1,double a2,long a3,long a4);
    private static native boolean recovery$indy$flow$571(java.lang.Object a0,long a1,long a2,long a3);
    private static native double recovery$indy$flow$578(double a0,double a1,double a2,long a3,long a4);
    private static native double recovery$indy$flow$585(double a0,double a1,double a2,long a3,long a4);
    private static native double recovery$indy$flow$592(double a0,double a1,double a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$635(java.lang.Object a0,double a1,double a2,double a3,double a4,double a5,double a6,double a7,double a8,double a9,long a10,long a11);
    private static native int recovery$indy$flow$651(java.lang.Object a0,int a1,short a2,char a3,int a4,long a5,long a6);
    private static native int recovery$indy$flow$653(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$655(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$657(java.lang.Object a0,long a1,long a2,long a3);
    private static native int recovery$indy$flow$659(java.lang.Object a0,short a1,int a2,int a3,long a4,long a5);
    private static void recovery$indy$flow$752(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Pathfinder_47HZ) (a0)).settingAutoTarget = ((client.setting.SettingGroup) (a1));
        return;
    }

    private static native void recovery$indy$flow$756(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$758();


    private static java.lang.Object recovery$indy$flow$762(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$763(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$766(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$767(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$772(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$773(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$776(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$778(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$782(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$785(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$786(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$790(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$793(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$795(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$798(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$801(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$804(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$807(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$810(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$814(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$815(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$818(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$819(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$820(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Pathfinder_47HZ) (a0)).field_46A = ((net.minecraft.entity.Entity) (a1));
        return;
    }
    private static void recovery$indy$flow$821(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Pathfinder_47HZ) (a0)).field_43h = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$822(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Pathfinder_47HZ) (a0)).field_43W = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$825(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Pathfinder_47HZ) (a0)).field_46V = ((java.util.ArrayList) (a1));
        return;
    }
    private static void recovery$indy$flow$826(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Pathfinder_47HZ) (a0)).field_46J = ((net.minecraft.entity.Entity) (a1));
        return;
    }
    private static void recovery$indy$flow$827(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Pathfinder_47HZ) (a0)).field_46b = ((net.C_47nU) (a1));
        return;
    }
    private static void recovery$indy$flow$828(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Pathfinder_47HZ) (a0)).field_40 = ((net.C_478i) (a1));
        return;
    }
    private static void recovery$indy$flow$829(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.render.Pathfinder_47HZ) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$832(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.Pathfinder_47HZ) (a0)).field_42 = ((net.C_46m) (a1));
        return;
    }
    private static native void recovery$indy$flow$835(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$838(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$840() {
        return java.awt.Color.WHITE;
    }
    private static native void recovery$indy$flow$842(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$847(java.lang.Object a0,java.lang.Object a1);


    private static native void recovery$indy$flow$850(java.lang.Object a0,int a1,long a2);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$5(long var0, long var2);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native double recovery$indy$7(Object var0, boolean var1, long var2, long var4, long var6);
   private static native double recovery$indy$8(Object var0, boolean var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$9(long var0, long var2);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3);
   private static native boolean recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$12(long var0, long var2, long var4);
   private static native WorldClient recovery$indy$13(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);
   private static native boolean recovery$indy$15(Object var0, long var1, Object var3, boolean var4, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$16(Object var0, long var1, long var3);
   private static native int[] recovery$indy$20(long var0, long var2);
   private static native int recovery$indy$21(Object var0, long var1, long var3);
   private static native int recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);
   private static native C_47Ij recovery$indy$23(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$24(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$25(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$26(Object var0, long var1, long var3, long var5);
   private static native WorldClient recovery$indy$27(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$28(Object var0, long var1, long var3);
   private static native C_478i recovery$indy$29(char var0, char var1, Object var2, int var3, Object var4, long var5, long var7);
   private static native void recovery$indy$30(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$31(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$32(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$33(Object var0, long var1, long var3);
   private static native int recovery$indy$34(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$35(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$36(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$37(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$42(Object var0, long var1, long var3);
   private static native int[] recovery$indy$43(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$44(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$45(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$46(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$47(Object var0, long var1, long var3);
   private static native boolean recovery$indy$48(Object var0, long var1, long var3, long var5);
   private static native EntityPlayerSP recovery$indy$49(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$50(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$51(Object var0, long var1, long var3);
   private static native C_47Ij recovery$indy$52(
      float var0, short var1, float var2, float var3, double var4, long var6, double var8, double var10, long var12, long var14
   );
   private static native EntityPlayerSP recovery$indy$53(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$54(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$55(Object var0, long var1, long var3);
   private static native int[] recovery$indy$87(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$88(Object var0, long var1, long var3);
   private static native int recovery$indy$89(char var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$90(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$91(Object var0, long var1, long var3);
   private static native boolean recovery$indy$92(Object var0, long var1, long var3);
   private static native boolean recovery$indy$93(Object var0, long var1, long var3);
   private static native boolean recovery$indy$94(Object var0, long var1, long var3);
   private static native boolean recovery$indy$95(Object var0, long var1, long var3);
   private static native boolean recovery$indy$96(Object var0, long var1, long var3);
   private static native boolean recovery$indy$97(
      Object var0,
      boolean var1,
      short var2,
      boolean var3,
      boolean var4,
      boolean var5,
      int var6,
      boolean var7,
      int var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15,
      int var16,
      long var17,
      long var19
   );
   private static native void recovery$indy$132(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$133(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$134(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$135(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$136(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$137(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$138(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$139(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$140(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$141(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$142(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$143(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$144(Object var0, long var1, long var3);
   private static native void recovery$indy$145(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$146(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$147(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$148(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$149(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$150(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$156();

    private static java.lang.Object recovery$indy$flow$78(java.lang.Object a0) {
        return ((net.C_47pN) (a0));
    }
}
